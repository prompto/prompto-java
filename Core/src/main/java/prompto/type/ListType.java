package prompto.type;

import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import prompto.compiler.CompilerUtils;
import prompto.compiler.Flags;
import prompto.compiler.IOperand;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.declaration.IMethodDeclaration;
import prompto.error.PromptoError;
import prompto.error.ReadWriteError;
import prompto.expression.IExpression;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoList;
import prompto.parser.ECleverParser;
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

import com.fasterxml.jackson.databind.JsonNode;

public class ListType extends ContainerType {
	
	public static Logger logger = new Logger();
	
	public ListType(IType itemType) {
		super(Family.LIST, itemType, itemType.getTypeName() + "[]");
	}
	
	@Override
	public IterableType withItemType(IType itemType) {
		return new ListType(itemType);
	}
	
	
	@Override
	public Type getJavaType(Context context) {
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
	public IType checkAdd(Context context, IType other, boolean tryReverse) {
		if(	(other instanceof ListType || other instanceof SetType) &&
			this.getItemType().equals(((ContainerType)other).getItemType()) )
				return this;
		return super.checkAdd(context, other, tryReverse);
	}
	
	@Override
	public IType checkSubstract(Context context, IType other) {
		if(	(other instanceof ListType || other instanceof SetType) &&
				this.getItemType().equals(((ContainerType)other).getItemType()) )
					return this;
		return super.checkSubstract(context, other);
	}
	
	@Override
	public IType checkItem(Context context, IType other) {
		if(other==IntegerType.instance())
			return itemType;
		else
			return super.checkItem(context,other);
	}
	
	@Override
	public IType checkSlice(Context context) {
		return this;
	}
	
	@Override
	public IType checkMultiply(Context context, IType other, boolean tryReverse) {
		if(other instanceof IntegerType)
			return this;
		return super.checkMultiply(context, other, tryReverse);
	}
	
	@Override
	public IType checkContainsAllOrAny(Context context, IType other) {
		return BooleanType.instance();
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
		case "join":
			return new HashSet<>(Collections.singletonList(JOIN_METHOD));
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
	public void declareAdd(Transpiler transpiler, IType other, boolean tryReverse, IExpression left, IExpression right) {
	    if((other instanceof ListType || other instanceof SetType) && this.getItemType().equals(((ContainerType)other).getItemType())) {
	        left.declare(transpiler);
	        right.declare(transpiler);
	    } else {
	        super.declareAdd(transpiler, other, tryReverse, left, right);
	    }
	}
	
	@Override
	public void transpileAdd(Transpiler transpiler, IType other, boolean tryReverse, IExpression left, IExpression right) {
	    if((other instanceof ListType || other instanceof SetType) && this.getItemType().equals(((ContainerType)other).getItemType())) {
	        left.transpile(transpiler);
	        transpiler.append(".add(");
	        right.transpile(transpiler);
	        transpiler.append(")");
	    } else {
	        super.transpileAdd(transpiler, other, tryReverse, left, right);
	    }
	}
	
	
	@Override
	public void declareSubtract(Transpiler transpiler, IType other, IExpression left, IExpression right) {
	    if((other instanceof ListType || other instanceof SetType) && this.getItemType().equals(((ContainerType)other).getItemType())) {
	        left.declare(transpiler);
	        right.declare(transpiler);
	    } else {
	        super.declareSubtract(transpiler, other, left, right);
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
	public void declareMultiply(Transpiler transpiler, IType other, boolean tryReverse, IExpression left, IExpression right) {
	   if(other == IntegerType.instance) {
	        transpiler.require("multiplyArray");
	        left.declare(transpiler);
	        right.declare(transpiler);
	    } else {
	        super.declareMultiply(transpiler, other, tryReverse, left, right);
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
	public void declareContains(Transpiler transpiler, IType other, IExpression container, IExpression item) {
	    container.declare(transpiler);
	    item.declare(transpiler);
	}
	
	@Override
	public void transpileContains(Transpiler transpiler, IType other, IExpression container, IExpression item) {
	    container.transpile(transpiler);
	    transpiler.append(".includes(");
	    item.transpile(transpiler);
	    transpiler.append(")");
	}
	
	@Override
	public void declareContainsAllOrAny(Transpiler transpiler, IType other, IExpression container, IExpression items) {
	   transpiler.require("StrictSet");
	   container.declare(transpiler);
	   items.declare(transpiler);
	}
	
	@Override
	public void transpileContainsAll(Transpiler transpiler, IType other, IExpression container, IExpression items) {
	    container.transpile(transpiler);
	    transpiler.append(".hasAll(");
	    items.transpile(transpiler);
	    transpiler.append(")");
	}
	
	@Override
	public void transpileContainsAny(Transpiler transpiler, IType other, IExpression container, IExpression items) {
	    container.transpile(transpiler);
	    transpiler.append(".hasAny(");
	    items.transpile(transpiler);
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
	        transpiler.append(".item(");
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

}
