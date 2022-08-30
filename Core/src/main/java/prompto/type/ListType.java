package prompto.type;

import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

import com.fasterxml.jackson.databind.JsonNode;

import prompto.compiler.ClassConstant;
import prompto.compiler.CompilerUtils;
import prompto.compiler.Descriptor;
import prompto.compiler.Flags;
import prompto.compiler.IOperand;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.declaration.BuiltInMethodDeclaration;
import prompto.declaration.IMethodDeclaration;
import prompto.error.PromptoError;
import prompto.error.ReadWriteError;
import prompto.expression.ArrowExpression;
import prompto.expression.IExpression;
import prompto.expression.PredicateExpression;
import prompto.grammar.ArgumentList;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoList;
import prompto.intrinsic.PromptoSet;
import prompto.param.CategoryParameter;
import prompto.param.IParameter;
import prompto.parser.ECleverParser;
import prompto.parser.ICodeSection;
import prompto.runtime.Context;
import prompto.store.Family;
import prompto.transpiler.Transpiler;
import prompto.utils.Logger;
import prompto.value.BooleanValue;
import prompto.value.DecimalValue;
import prompto.value.IValue;
import prompto.value.IntegerValue;
import prompto.value.ListValue;
import prompto.value.NullValue;
import prompto.value.TextValue;

public class ListType extends ContainerType {
	
	public static Logger logger = new Logger();

	boolean mutable = false;
	
	public ListType(IType itemType) {
		this(itemType, false);
	}

	public ListType(IType itemType, boolean mutable) {
		super(Family.LIST, itemType, itemType.getTypeName() + "[]");
		this.mutable = mutable;
	}
	
	@Override
	public ListType withItemType(IType itemType) {
		return new ListType(itemType, mutable);
	}
	
	@Override
	public ListType asMutable(Context context, boolean mutable) {
		if(mutable == this.mutable)
			return this;
		else
			return new ListType(itemType, mutable);
	}

	@Override
	public IType resolve(Context context, Consumer<IType> onError) {
		IType resolvedItemType = itemType.resolve(context, onError);
		if(resolvedItemType==null || resolvedItemType==itemType)
			return this;
		else
			return new ListType(resolvedItemType, mutable);
	}
	
	@Override
	public Type toJavaType(Context context) {
		return PromptoList.class;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==this)
			return true; 
		else 
			return (obj instanceof ListType) && 
					this.getItemType().equals(((ContainerType)obj).getItemType());
	}
	
	@Override
	public boolean isAssignableFrom(Context context, IType other) {
		return super.isAssignableFrom(context, other) ||
				(other instanceof ListType && 
				this.getItemType().isAssignableFrom(context, ((ContainerType)other).getItemType()));
	}
	
	@Override
	public IType checkAdd(Context context, IType other, boolean tryReverse, ICodeSection section) {
		if(	(other instanceof ListType || other instanceof SetType) &&
			this.getItemType().isAssignableFrom(context, ((ContainerType)other).getItemType()) )
				return this;
		return super.checkAdd(context, other, tryReverse, section);
	}
	
	@Override
	public IType checkSubstract(Context context, IType other, ICodeSection section) {
		if(	(other instanceof ListType || other instanceof SetType) &&
				this.getItemType().equals(((ContainerType)other).getItemType()) )
					return this;
		return super.checkSubstract(context, other, section);
	}
	
	@Override
	public IType checkItem(Context context, IType other, ICodeSection section) {
		if(other==IntegerType.instance())
			return itemType;
		else {
			context.getProblemListener().reportIllegalItemType(section, Collections.singleton(IntegerType.instance()), other);
			return VoidType.instance();
		}
	}
	
	@Override
	public IType checkSlice(Context context) {
		return this;
	}
	
	@Override
	public IType checkMultiply(Context context, IType other, boolean tryReverse, ICodeSection section) {
		if(other instanceof IntegerType)
			return this;
		return super.checkMultiply(context, other, tryReverse, section);
	}
	
	@Override
	public void checkContainsAllOrAny(Context context, IType other) {
		// nothing to do
	}
	
	@Override
	public IType checkIterator(Context context) {
		return itemType;
	}

	@Override
	public IType checkMember(Context context, Identifier id) {
		String name = id.toString();
        if ("count".equals(name))
            return IntegerType.instance();
        else if("iterator".equals(name))
        	return new IteratorType(itemType);
        else
    		return super.checkMember(context, id);
   }

	@Override
	public Set<IMethodDeclaration> getMemberMethods(Context context, Identifier id) throws PromptoError {
		switch(id.toString()) {
		case "toSet":
			return new HashSet<>(Collections.singletonList(TO_SET_METHOD));
		case "indexOf":
			return new HashSet<>(Collections.singletonList(INDEX_OF_METHOD));
		case "join":
			return new HashSet<>(Collections.singletonList(JOIN_METHOD));
		case "removeItem":
			return new HashSet<>(Collections.singletonList(REMOVE_ITEM_METHOD));
		case "removeValue":
			return new HashSet<>(Collections.singletonList(REMOVE_VALUE_METHOD));
		case "addValue":
			return new HashSet<>(Collections.singletonList(ADD_VALUE_METHOD));
		case "insertValue":
			return new HashSet<>(Collections.singletonList(INSERT_VALUE_METHOD));
		default:
			return super.getMemberMethods(context, id);
		}
	}

	@Override
	public IValue readJSONValue(Context context, JsonNode array, Map<String, byte[]> parts) {
		ListValue list = new ListValue(itemType);
		array.forEach( (node) -> {
			IValue item = readJSONItem(context, parts, node);
			if(item!=null)
				list.addItem(item);
		});
		return list;
	}
	
	IValue readJSONItem(Context context, Map<String, byte[]> parts, JsonNode node) { 
		try {
			switch(node.getNodeType()) {
				case NULL:
					return NullValue.instance();
				case BOOLEAN:
					return BooleanValue.valueOf(node.asBoolean());
				case NUMBER:
					if(this.itemType==IntegerType.instance())
						return new IntegerValue(node.asLong());
					else if(this.itemType==DecimalType.instance())
						return new DecimalValue(node.asDouble());
					else
						throw new ReadWriteError("Unsupported NUMBER for " + itemType.toString());
				case STRING:
					return new TextValue(node.asText());
				case OBJECT:
					if(itemType instanceof IEnumeratedType)
						return itemType.readJSONValue(context, node, parts);
					else 
						return readJSONObject(context, parts, node);
				default:
					throw new ReadWriteError("Unsupported " + node.getNodeType().name() + " node for " + itemType.toString());
			} 
		} catch (Exception e) {
			logger.error(()->e.getMessage(), e);
			throw new ReadWriteError(e.getMessage());
		}
	}

	private IValue readJSONObject(Context context, Map<String, byte[]> parts, JsonNode node) throws Exception {
		String typeName = node.get("type").asText(itemType.toString());
		IType itemType = new ECleverParser(typeName).parse_standalone_type();
		JsonNode itemNode = node.get("value");
		return itemType.readJSONValue(context, itemNode, parts);
	}

	@SuppressWarnings("unchecked")
	@Override
	public IValue convertJavaValueToIValue(Context context, Object value) {
		if(value instanceof Collection) {
			ListValue list = new ListValue(itemType);
			((Collection<Object>)value).forEach((item)->
				list.addItem(itemType.convertJavaValueToIValue(context, item)));
			return list;
		} else
			return super.convertJavaValueToIValue(context, value);
	}
	
	
	@Override
	public String getTranspiledName(Context context) {
		return itemType.getTranspiledName(context) + "_list";
	}
	
	
	@Override
	public void declare(Transpiler transpiler) {
		transpiler.register("List");
		itemType.declare(transpiler);
	}
	

	@Override
	public void transpile(Transpiler transpiler) {
		transpiler.append("List");
	}
	
	
	@Override
	public void declareAdd(Transpiler transpiler, IType other, boolean tryReverse, IExpression left, IExpression right, ICodeSection section) {
	    if((other instanceof ListType || other instanceof SetType) && this.getItemType().isAssignableFrom(transpiler.getContext(), ((ContainerType)other).getItemType())) {
	        left.declare(transpiler);
	        right.declare(transpiler);
	    } else {
	        super.declareAdd(transpiler, other, tryReverse, left, right, section);
	    }
	}
	
	@Override
	public void transpileAdd(Transpiler transpiler, IType other, boolean tryReverse, IExpression left, IExpression right, ICodeSection section) {
	    if((other instanceof ListType || other instanceof SetType) && this.getItemType().isAssignableFrom(transpiler.getContext(), ((ContainerType)other).getItemType())) {
	        left.transpile(transpiler);
	        transpiler.append(".add(");
	        right.transpile(transpiler);
	        transpiler.append(")");
	    } else {
	        super.transpileAdd(transpiler, other, tryReverse, left, right, section);
	    }
	}
	
	
	@Override
	public void declareSubtract(Transpiler transpiler, IType other, IExpression left, IExpression right, ICodeSection section) {
	    if((other instanceof ListType || other instanceof SetType) && this.getItemType().equals(((ContainerType)other).getItemType())) {
	        left.declare(transpiler);
	        right.declare(transpiler);
	    } else {
	        super.declareSubtract(transpiler, other, left, right, section);
	    }
	}
	
	
	@Override
	public void transpileSubtract(Transpiler transpiler, IType other, IExpression left, IExpression right) {
	    if((other instanceof ListType || other instanceof SetType) && this.getItemType().equals(((ContainerType)other).getItemType())) {
	        left.transpile(transpiler);
	        transpiler.append(".remove(");
	        right.transpile(transpiler);
	        transpiler.append(")");
	    } else {
	        super.transpileSubtract(transpiler, other, left, right);
	    }
	}

	
	@Override
	public void declareMultiply(Transpiler transpiler, IType other, boolean tryReverse, IExpression left, IExpression right, ICodeSection section) {
	   if(other == IntegerType.instance) {
	        transpiler.require("multiplyArray");
	        left.declare(transpiler);
	        right.declare(transpiler);
	    } else {
	        super.declareMultiply(transpiler, other, tryReverse, left, right, section);
	    }
	}
	
	@Override
	public void transpileMultiply(Transpiler transpiler, IType other, boolean tryReverse, IExpression left, IExpression right) {
	   if(other == IntegerType.instance()) {
	        transpiler.append("multiplyArray(");
	        left.transpile(transpiler);
	        transpiler.append(",");
	        right.transpile(transpiler);
	        transpiler.append(")");
	    } else
	        super.transpileMultiply(transpiler, other, tryReverse, left, right);
	}
	
	@Override
	public void declareHasValue(Transpiler transpiler, IType other, IExpression container, IExpression item, ICodeSection section) {
	    container.declare(transpiler);
	    item.declare(transpiler);
	}
	
	@Override
	public void transpileHasValue(Transpiler transpiler, IType other, IExpression container, IExpression item) {
	    container.transpile(transpiler);
	    transpiler.append(".includes(");
	    item.transpile(transpiler);
	    transpiler.append(")");
	}
	
	@Override
	public void declareHasAllOrAny(Transpiler transpiler, IType other, IExpression container, IExpression items) {
	   transpiler.require("StrictSet");
	   container.declare(transpiler);
	   items.declare(transpiler);
	}
	
	@Override
	public void transpileHasAllValues(Transpiler transpiler, IType other, IExpression container, IExpression items) {
	    container.transpile(transpiler);
	    transpiler.append(".hasAll(");
	    items.transpile(transpiler);
	    transpiler.append(")");
	}
	
	@Override
	public void transpileHasAnyValue(Transpiler transpiler, IType other, IExpression container, IExpression items) {
	    container.transpile(transpiler);
	    transpiler.append(".hasAny(");
	    items.transpile(transpiler);
	    transpiler.append(")");
	}
	
	@Override
	public void transpileHasAllPredicate(Transpiler transpiler, IExpression container, PredicateExpression predicate) {
	    container.transpile(transpiler);
	    transpiler.append(".every(");
	    ArrowExpression arrow = predicate.toArrowExpression();
		IType type = container.check(transpiler.getContext());
		IType itemType = ((ContainerType)type).getItemType();
	    arrow.transpileFilter(transpiler, itemType);
	    transpiler.append(")");
	}

	@Override
	public void transpileHasAnyPredicate(Transpiler transpiler, IExpression container, PredicateExpression predicate) {
	    container.transpile(transpiler);
	    transpiler.append(".some(");
	    ArrowExpression arrow = predicate.toArrowExpression();
		IType type = container.check(transpiler.getContext());
		IType itemType = ((ContainerType)type).getItemType();
	    arrow.transpileFilter(transpiler, itemType);
	    transpiler.append(")");
	}

	@Override
	public void declareItem(Transpiler transpiler, IType itemType, IExpression item) {
	    if(itemType==IntegerType.instance()) {
	    	this.itemType.declare(transpiler);
	        item.declare(transpiler);
	    } else {
	        super.declareItem(transpiler, itemType, item);
	    }
	}
	
	@Override
	public void transpileItem(Transpiler transpiler, IType itemType, IExpression item) {
	    if(itemType==IntegerType.instance()) {
	        transpiler.append(".getItem(");
	        item.transpile(transpiler);
	        transpiler.append(")");
	    } else {
	        super.transpileItem(transpiler, itemType, item);
	    }
	}
	
	@Override
	public void transpileAssignItemValue(Transpiler transpiler, IExpression item, IExpression expression) {
	    transpiler.append(".setItem(");
	    item.transpile(transpiler);
	    transpiler.append(", ");
	    expression.transpile(transpiler);
	    transpiler.append(")");
	}
	
	@Override
	public void declareSlice(Transpiler transpiler, IExpression first, IExpression last) {
		// nothing to do
	}
	
	@Override
	public void transpileSlice(Transpiler transpiler, IExpression first, IExpression last) {
	    transpiler.append(".slice1Based(");
	    if(first!=null) {
	        first.transpile(transpiler);
	    } else
	        transpiler.append("null");
	    if(last!=null) {
	        transpiler.append(",");
	        last.transpile(transpiler);
	    }
	    transpiler.append(")");
	}
	
	
	public static ResultInfo compileItem(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		ResultInfo right = exp.compile(context, method, flags.withPrimitive(true));
		right = CompilerUtils.numberToint(method, right);
		// minus 1
		method.addInstruction(Opcode.ICONST_M1);
		method.addInstruction(Opcode.IADD);
		// create result
		IOperand oper = new MethodConstant(PromptoList.class, "get", 
				int.class, Object.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		return new ResultInfo(Object.class); // TODO refine
	}

	public static ResultInfo compileSlice(Context context, MethodInfo method, Flags flags, 
			ResultInfo parent, IExpression first, IExpression last) {
		compileSliceFirst(context, method, flags, first);
		compileSliceLast(context, method, flags, last);
		MethodConstant m = new MethodConstant(PromptoList.class, "slice", 
				long.class, long.class, PromptoList.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, m);
		return parent;
	}

	public static ResultInfo compileMinus(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		// TODO: return left if right is empty
		// create result
		ResultInfo info = CompilerUtils.compileNewRawInstance(method, PromptoList.class);
		method.addInstruction(Opcode.DUP);
		method.addInstruction(Opcode.ICONST_0); // not mutable
		CompilerUtils.compileCallConstructor(method, PromptoList.class, boolean.class);
		// add left, current stack is: left, result, we need: result, result, left
		method.addInstruction(Opcode.DUP_X1); // stack is: result, left, result
		method.addInstruction(Opcode.SWAP); // stack is: result, result, left
		IOperand oper = new MethodConstant(PromptoList.class, "addAll", 
				Collection.class, boolean.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		method.addInstruction(Opcode.POP); // consume returned boolean
		// add right, current stack is: result, we need: result, result, right
		method.addInstruction(Opcode.DUP); // stack is: result, result 
		exp.compile(context, method, flags); // stack is: result, result, right
		oper = new MethodConstant(PromptoList.class, "removeAll", 
				Collection.class, boolean.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		method.addInstruction(Opcode.POP); // consume returned boolean
		return info;
	}

	public static ResultInfo compilePlus(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		// TODO: return left if right is empty (or right if left is empty and is a list)
		// create result
		ResultInfo info = CompilerUtils.compileNewRawInstance(method, PromptoList.class);
		method.addInstruction(Opcode.DUP);
		method.addInstruction(Opcode.ICONST_0); // not mutable
		CompilerUtils.compileCallConstructor(method, PromptoList.class, boolean.class);
		// add left, current stack is: left, result, we need: result, result, left
		method.addInstruction(Opcode.DUP_X1); // stack is: result, left, result
		method.addInstruction(Opcode.SWAP); // stack is: result, result, left
		IOperand oper = new MethodConstant(PromptoList.class, "addAll", 
				Collection.class, boolean.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		method.addInstruction(Opcode.POP); // consume returned boolean
		// add right, current stack is: result, we need: result, result, right
		method.addInstruction(Opcode.DUP); // stack is: result, result 
		exp.compile(context, method, flags); // stack is: result, result, right
		oper = new MethodConstant(PromptoList.class, "addAll", 
				Collection.class, boolean.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		method.addInstruction(Opcode.POP); // consume returned boolean
		return info;
	}

	public static ResultInfo compileEquals(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		exp.compile(context, method, flags);
		IOperand oper = new MethodConstant(
				PromptoList.class, 
				"equals",
				Object.class, boolean.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		if(flags.isReverse()) 
			CompilerUtils.reverseBoolean(method);
		if(flags.toPrimitive())
			return new ResultInfo(boolean.class);
		else
			return CompilerUtils.booleanToBoolean(method);
	}


	static final IMethodDeclaration JOIN_METHOD = new JoinMethod() {
		
		@Override
		protected Collection<IValue> getItems(Context context) {
			ListValue list = (ListValue)getValue(context);
			return list.getItems();
		}

	};

	static IParameter VALUE_PARAMETER = new CategoryParameter(AnyType.instance(), new Identifier("value"));

	static final IMethodDeclaration INDEX_OF_METHOD = new BuiltInMethodDeclaration("indexOf", VALUE_PARAMETER) {
		
		@Override
		public IValue interpret(Context context) throws PromptoError {
			ListValue list = (ListValue)getValue(context);
			IValue value = context.getValue(new Identifier("value"));
			int idx = list.indexOf(value);
			return idx < 0 ? NullValue.instance() : new IntegerValue(idx + 1);
		};
		
		@Override
		public IType check(Context context) {
			return IntegerType.instance();
		}
		
		@Override
		public boolean hasCompileExactInstanceMember() {
			return true;
		}
		
		@Override
		public ResultInfo compileExactInstanceMember(Context context, MethodInfo method, Flags flags, ArgumentList arguments) {
			// push arguments on the stack
			VALUE_PARAMETER.compileParameter(context, method, flags, arguments, true);
			// call indexOf method
			ClassConstant klass = new ClassConstant(PromptoList.class);
			Descriptor.Method descriptor = new Descriptor.Method(new Type[] { Object.class }, Long.class);
			MethodConstant iconstant = new MethodConstant(klass, "indexOfValue", descriptor);
			method.addInstruction(Opcode.INVOKEVIRTUAL, iconstant);
			return new ResultInfo(Long.class);
		}

		@Override
		public void transpileCall(Transpiler transpiler, ArgumentList arguments) {
			transpiler.append("indexOfValue(");
			arguments.getFirst().transpile(transpiler, this);
			transpiler.append(")");
		}
					
	};

	static IParameter ITEM_PARAMETER = new CategoryParameter(IntegerType.instance(), new Identifier("item"));

	static final IMethodDeclaration REMOVE_ITEM_METHOD = new BuiltInMethodDeclaration("removeItem", ITEM_PARAMETER) {
		
		@Override
		public IValue interpret(Context context) throws PromptoError {
			ListValue list = (ListValue)getValue(context);
			Long item = (Long)context.getValue(new Identifier("item")).getStorableData();
			list.removeItem(item);
			return null;
		};
		
		@Override
		public IType check(Context context) {
			return VoidType.instance();
		}
		
		@Override
		public void transpileCall(Transpiler transpiler, ArgumentList arguments) {
			transpiler.append("removeItem(");
			arguments.getFirst().transpile(transpiler, this);
			transpiler.append(")");
		}
					
	};

	static final IMethodDeclaration REMOVE_VALUE_METHOD = new BuiltInMethodDeclaration("removeValue", VALUE_PARAMETER) {

		@Override
		public IValue interpret(Context context) throws PromptoError {
			ListValue list = (ListValue)getValue(context);
			IValue value = context.getValue(new Identifier("value"));
			list.removeValue(value);
			return null;
		};
		
		@Override
		public IType check(Context context) {
			return VoidType.instance();
		}
		
		@Override
		public void transpileCall(Transpiler transpiler, ArgumentList arguments) {
			transpiler.append("removeValue(");
			arguments.getFirst().transpile(transpiler, this);
			transpiler.append(")");
		}

	};
	
	static final IMethodDeclaration ADD_VALUE_METHOD = new BuiltInMethodDeclaration("addValue", VALUE_PARAMETER) {

		@Override
		public IValue interpret(Context context) throws PromptoError {
			ListValue list = (ListValue)getValue(context);
			IValue value = context.getValue(new Identifier("value"));
			list.addValue(value);
			return null;
		};
		
		@Override
		public IType check(Context context) {
			return VoidType.instance();
		}
		
		@Override
		public void transpileCall(Transpiler transpiler, ArgumentList arguments) {
			transpiler.append("addValue(");
			arguments.getFirst().transpile(transpiler, this);
			transpiler.append(")");
		}

	};

	static IParameter AT_INDEX_PARAMETER = new CategoryParameter(IntegerType.instance(), new Identifier("atIndex"));

	static final IMethodDeclaration INSERT_VALUE_METHOD = new BuiltInMethodDeclaration("insertValue", VALUE_PARAMETER, AT_INDEX_PARAMETER) {

		@Override
		public IValue interpret(Context context) throws PromptoError {
			ListValue list = (ListValue)getValue(context);
			IValue value = context.getValue(new Identifier("value"));
			Long atIndex = (Long)context.getValue(new Identifier("atIndex")).getStorableData();
			list.insertValue(value, atIndex);
			return null;
		};
		
		@Override
		public IType check(Context context) {
			return VoidType.instance();
		}
		
		@Override
		public void transpileCall(Transpiler transpiler, ArgumentList arguments) {
			transpiler.append("insertValue(");
			arguments.getFirst().transpile(transpiler, this);
			transpiler.append(", ");
			arguments.get(1).transpile(transpiler, this);
			transpiler.append(")");
		}
		
		@Override
		public boolean hasCompileExactInstanceMember() {
			return true;
		}
		
		@Override
		public ResultInfo compileExactInstanceMember(Context context, MethodInfo method, Flags flags, ArgumentList arguments) {
			// push arguments on the stack
			VALUE_PARAMETER.compileParameter(context, method, flags, arguments, true);
			ResultInfo itemInfo = AT_INDEX_PARAMETER.compileParameter(context, method, flags.withPrimitive(true), arguments, false);
			// convert item to long
			CompilerUtils.numberTolong(method, itemInfo);
			// call insertValue method
			IOperand oper = new MethodConstant(PromptoList.class, "insertValue", Object.class, long.class, void.class);
			method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
			return new ResultInfo(void.class);
		}

	};

	final IMethodDeclaration TO_SET_METHOD = new BuiltInMethodDeclaration("toSet") {
		
		@Override
		public IValue interpret(Context context) throws PromptoError {
			ListValue list = (ListValue)getValue(context);
			return list.toSetValue();
		};
		
		
		
		@Override
		public IType check(Context context) {
			return new SetType(itemType);
		}

		@Override
		public boolean hasCompileExactInstanceMember() {
			return true;
		}
		
		@Override
		public ResultInfo compileExactInstanceMember(Context context, MethodInfo method, Flags flags, prompto.grammar.ArgumentList assignments) {
			// call toSet method
			Descriptor.Method descriptor = new Descriptor.Method(PromptoSet.class);
			MethodConstant constant = new MethodConstant(PromptoList.class, "toSet", descriptor);
			method.addInstruction(Opcode.INVOKEVIRTUAL, constant);
			// done
			return new ResultInfo(PromptoSet.class);

		}
		
		@Override
		public void declareCall(Transpiler transpiler) {
			transpiler.require("StrictSet");
		};
		
		@Override
		public void transpileCall(Transpiler transpiler, prompto.grammar.ArgumentList assignments) {
			transpiler.append("toSet()");
		}
	};
}
