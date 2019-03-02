package prompto.type;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.function.BiFunction;

import prompto.compiler.ByteOperand;
import prompto.compiler.ClassConstant;
import prompto.compiler.ClassFile;
import prompto.compiler.CompilerUtils;
import prompto.compiler.Flags;
import prompto.compiler.IVerifierEntry.VerifierType;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.compiler.StackLocal;
import prompto.compiler.StringConstant;
import prompto.compiler.comparator.ComparatorCompiler;
import prompto.compiler.comparator.ComparatorCompilerBase;
import prompto.declaration.IDeclaration;
import prompto.declaration.IMethodDeclaration;
import prompto.error.PromptoError;
import prompto.expression.DocumentExpression;
import prompto.expression.IExpression;
import prompto.expression.MethodSelector;
import prompto.expression.UnresolvedIdentifier;
import prompto.grammar.ArgumentAssignment;
import prompto.grammar.ArgumentAssignmentList;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoDocument;
import prompto.intrinsic.PromptoList;
import prompto.literal.TextLiteral;
import prompto.runtime.Context;
import prompto.runtime.Context.MethodDeclarationMap;
import prompto.runtime.Variable;
import prompto.statement.MethodCall;
import prompto.store.Family;
import prompto.transpiler.Transpiler;
import prompto.utils.ObjectUtils;
import prompto.value.DocumentValue;
import prompto.value.ExpressionValue;
import prompto.value.IValue;
import prompto.value.NullValue;

import com.fasterxml.jackson.databind.JsonNode;

public class DocumentType extends NativeType {
	
	static DocumentType instance = new DocumentType();
	
	public static DocumentType instance() {
		return instance;
	}
	
	private DocumentType() {
		super(Family.DOCUMENT);
	}

	@Override
	public boolean isMoreSpecificThan(Context context, IType other) {
		if(other instanceof NullType || other instanceof AnyType || other instanceof MissingType)
			return true;
		else
			return super.isMoreSpecificThan(context, other);
	}
	
	@Override
	public boolean isAssignableFrom(Context context, IType other) {
		return super.isAssignableFrom(context, other)
				|| other==AnyType.instance()
				|| (other instanceof CategoryType && "Any".equals(other.getTypeName()));
	}
	
	@Override
	public Type getJavaType(Context context) {
		return PromptoDocument.class;
	}
	
	@Override
	public IType checkItem(Context context, IType itemType) {
		if(itemType==TextType.instance())
			return AnyType.instance();
		else
			return super.checkItem(context, itemType);
	}

	@Override
	public IType checkMember(Context context, Identifier name) {
		return AnyType.instance();
	}
	
	@Override
	public IValue readJSONValue(Context context, JsonNode value, Map<String, byte[]> parts) {
		DocumentValue instance = new DocumentValue();
		Iterator<Map.Entry<String, JsonNode>> fields = value.fields();
		while(fields.hasNext()) {
			Map.Entry<String, JsonNode> field = fields.next();
			IValue item = readJSONField(context, field.getValue(), parts);
			instance.setMember(new Identifier(field.getKey()), item);
		}
		return instance;
	}

	private IValue readJSONField(Context context, JsonNode fieldData, Map<String, byte[]> parts) throws PromptoError {
		if(fieldData==null || fieldData.isNull())
			return NullValue.instance();
		else if(fieldData.isBoolean())
			return prompto.value.BooleanValue.valueOf(fieldData.asBoolean());
		else if(fieldData.isInt() || fieldData.isLong())
			return new prompto.value.IntegerValue(fieldData.asLong());
		else if(fieldData.isFloat() || fieldData.isDouble())
			return new prompto.value.DecimalValue(fieldData.asDouble());
		else if(fieldData.isTextual())
			return new prompto.value.TextValue(fieldData.asText());
		else if(fieldData.isArray()) {
			throw new UnsupportedOperationException();
		} else if(fieldData.isObject()) {
			throw new UnsupportedOperationException();
		} else
			throw new UnsupportedOperationException();
	}
	
	@Override
	public IValue convertJavaValueToIValue(Context context, Object value) {
		if(value instanceof PromptoDocument)
			return new DocumentValue(context, (PromptoDocument<?,?>)value);
		else
			return super.convertJavaValueToIValue(context, value);
	}
	
	
	@Override
	public void declare(Transpiler transpiler) {
		transpiler.register("Document");
		transpiler.register("List");
	}
	
	@Override
	public void transpile(Transpiler transpiler) {
		transpiler.append("Document");
	}
	
	@Override
	public void declareMember(Transpiler transpiler, String name) {
		// nothing to do
	}
	
	
	@Override
	public void transpileMember(Transpiler transpiler, String name) {
	    if (!"text".equals(name)) {
	        transpiler.append(name);
	    } else {
	        transpiler.append("getText()");
	    }
	}
	
	@Override
	public void transpileAssignMember(Transpiler transpiler, String name) {
		transpiler.append(".getMember('").append(name).append("', true)");
	}
	
	
	@Override
	public void transpileAssignMemberValue(Transpiler transpiler, String name, IExpression expression) {
	    transpiler.append(".setMember('").append(name).append("', ");
	    expression.transpile(transpiler);
	    transpiler.append(")");
	}
	
	
	@Override
	public void transpileItem(Transpiler transpiler, IType itemType, IExpression item) {
	    transpiler.append(".item(");
	    item.transpile(transpiler);
	    transpiler.append(")");
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
	public void declareSorted(Transpiler transpiler, IExpression key) {
		if(key==null)
			key = new TextLiteral("\"key\"");
		Identifier id = new Identifier(key.toString());
	    IMethodDeclaration method = this.findGlobalMethod(transpiler.getContext(), id);
        if (method != null) {
        	method.declare(transpiler);
        } else {
        	transpiler = transpiler.newDocumentTranspiler();
            key.declare(transpiler);
        }
	}
	

	
	@Override
	public void transpileSorted(Transpiler transpiler, boolean descending, IExpression key) {
		if(key==null)
			key = new TextLiteral("\"key\"");
		Identifier id = new Identifier(key.toString());
		IMethodDeclaration method = findGlobalMethod(transpiler.getContext(), id);
		if(method != null)
            transpileSortedByGlobalMethod(transpiler, descending, method.getTranspiledName(transpiler.getContext()));
		else if(key instanceof TextLiteral)
			transpileSortedByEntry(transpiler, descending, (TextLiteral)key);
		else
			transpileSortedByExpression(transpiler, descending, key);
	}

	private void transpileSortedByGlobalMethod(Transpiler transpiler, boolean descending, String methodName) {
	   transpiler.append("function(o1, o2) { return ")
	        .append(methodName).append("(o1) === ").append(methodName).append("(o2)").append(" ? 0 : ")
	        .append(methodName).append("(o1) > ").append(methodName).append("(o2)").append(" ? ");
	    if(descending)
	        transpiler.append("-1 : 1; }");
	    else
	        transpiler.append("1 : -1; }");
	}

	private void transpileSortedByExpression(Transpiler transpiler, boolean descending, IExpression key) {
		transpiler = transpiler.newDocumentTranspiler();
	    transpiler.append("function(o1, o2) { var v1 = (function() { return ");
	    key.transpile(transpiler);
	    transpiler.append("; }).bind(o1)(); var v2 = (function() { return ");
	    key.transpile(transpiler);
	    transpiler.append("; }).bind(o2)(); return v1===v2 ? 0 : v1 > v2 ? ");
	    if(descending)
	        transpiler.append("-1 : 1; }");
	    else
	        transpiler.append("1 : -1; }");
	    transpiler.flush();
	}

	private void transpileSortedByEntry(Transpiler transpiler, boolean descending, TextLiteral key) {
	    transpiler.append("function(o1, o2) { return ");
	    transpileEqualEntries(transpiler, key);
	    transpiler.append(" ? 0 : ");
	    transpileGreaterEntries(transpiler, key);
	    transpiler.append(" ? ");
	    if(descending)
	        transpiler.append("-1 : 1; }");
	    else
	        transpiler.append("1 : -1; }");
	}

	private void transpileGreaterEntries(Transpiler transpiler, IExpression key) {
	    transpiler.append("o1[");
	    key.transpile(transpiler);
	    transpiler.append("] > o2[");
	    key.transpile(transpiler);
	    transpiler.append("]");
	}

	private void transpileEqualEntries(Transpiler transpiler, IExpression key) {
	    transpiler.append("o1[");
	    key.transpile(transpiler);
	    transpiler.append("] === o2[");
	    key.transpile(transpiler);
	    transpiler.append("]");
	}

	private IMethodDeclaration findGlobalMethod(Context context, Identifier id) {
		IDeclaration decl = context.getRegisteredDeclaration(IDeclaration.class, id);
		if(decl instanceof MethodDeclarationMap)
			return ((MethodDeclarationMap)decl).get(DocumentType.instance().getTypeNameId().toString());
		else
			return null;
	}

	public Comparator<? extends IValue> getComparator(Context context, IExpression key, boolean descending) {
		if(key==null)
			key = new TextLiteral("\"key\"");
		Identifier id = new Identifier(key.toString());
		IMethodDeclaration method = findGlobalMethod(context, id);
		if(method!=null)
			return newMethodComparator(context, id, descending);
		else if(key instanceof TextLiteral) 
			return newEntryComparator(context, new Identifier(((TextLiteral)key).getValue().getStorableData()), descending);
		else
			return newExpressionComparator(context, key, descending);
	}
	
	
	private Comparator<? extends IValue> newMethodComparator(Context context, Identifier method, boolean descending) {
		BiFunction<IValue, IValue, Integer> cmpValues = BaseType.getValuesComparator(descending);
		MethodCall call = createGlobalMethodCall(context, method);
		return new Comparator<DocumentValue>() {
			@Override
			public int compare(DocumentValue o1, DocumentValue o2) {
				try {
					IValue key1 = interpret(o1);
					IValue key2 = interpret(o2);
					return cmpValues.apply(key1, key2);
				} catch(Throwable t) {
					throw new RuntimeException(t);
				}
			}

			private IValue interpret(DocumentValue o) throws PromptoError {
				ArgumentAssignment assignment = call.getAssignments().getFirst();
				assignment.setExpression(new ExpressionValue(DocumentType.instance(), o));
				return call.interpret(context);
			}
		};
	}

	private MethodCall createGlobalMethodCall(Context context, Identifier method) {
		ArgumentAssignment arg = new ArgumentAssignment(null, new DocumentExpression(null)); // MethodCall supports first anonymous argument
		ArgumentAssignmentList args = new ArgumentAssignmentList(Collections.singletonList(arg));
		return new MethodCall(new MethodSelector(method), args);
	}

	private Comparator<? extends IValue> newEntryComparator(Context context, Identifier entry, boolean descending) {
		BiFunction<IValue, IValue, Integer> cmpValues = BaseType.getValuesComparator(descending);
		return new Comparator<DocumentValue>() {
			@Override
			public int compare(DocumentValue o1, DocumentValue o2) {
				try {
					IValue key1 = o1.getMember(context, entry, false);
					IValue key2 = o2.getMember(context, entry, false);
					return cmpValues.apply(key1, key2);
				} catch(Throwable t) {
					throw new RuntimeException(t);
				}
			}
		};
	}


	private Comparator<? extends IValue> newExpressionComparator(Context context, IExpression key, boolean descending) {
		BiFunction<IValue, IValue, Integer> cmpValues = BaseType.getValuesComparator(descending);
		return new Comparator<DocumentValue>() {
			@Override
			public int compare(DocumentValue o1, DocumentValue o2) {
				try {
					Context local = context.newDocumentContext(o1, true);	
					IValue key1 = key.interpret(local);
					local = context.newDocumentContext(o2, true);	
					IValue key2 = key.interpret(local);
					return cmpValues.apply(key1, key2);
				} catch(Throwable t) {
					throw new RuntimeException(t);
				}
			}
		};
	}

	public ResultInfo compileSorted(Context context, MethodInfo method, Flags flags, ResultInfo srcInfo, IExpression key, boolean descending) {
		if(key==null)
			key = new TextLiteral("\"key\"");
		compileComparator(context, method, flags, key, descending);
		MethodConstant m = new MethodConstant(srcInfo.getType(), "sortUsing", Comparator.class, PromptoList.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, m);
		return new ResultInfo(PromptoList.class);
	}

	private ResultInfo compileComparator(Context context, MethodInfo method, Flags flags, IExpression key, boolean descending) {
		Type cmpType = compileComparatorClass(context, method.getClassFile(), key, descending);
		return CompilerUtils.compileNewInstance(method, cmpType);
	}

	private Type compileComparatorClass(Context context, ClassFile parentClass, IExpression key, boolean descending) {
		ComparatorCompiler compiler = getComparatorCompiler(context, key);
		return compiler.compile(context, parentClass, this, key, descending);
	}
	

	private ComparatorCompiler getComparatorCompiler(Context context, IExpression key) {
		Identifier keyAsId = new Identifier(key.toString());
		IMethodDeclaration method = findGlobalMethod(context, keyAsId);
		if(method != null) {
			MethodCall call = createGlobalMethodCall(context, keyAsId);
			return new GlobalMethodComparatorCompiler(call);
		} else if(key instanceof TextLiteral)
			return new EntryComparatorCompiler();
		else
			return new ExpressionComparatorCompiler();
		
	}

	
	class GlobalMethodComparatorCompiler extends ComparatorCompilerBase {
		
		MethodCall call;
		
		public GlobalMethodComparatorCompiler(MethodCall call) {
			this.call = call;
		}

		@Override
		protected void compileMethodBody(Context context, MethodInfo method, Type paramType, IExpression key) {
			compileValue(context, method, paramType, "o1");
			compileValue(context, method, paramType, "o2");
			MethodConstant compare = new MethodConstant(ObjectUtils.class, "safeCompare", Object.class, Object.class, int.class);
			method.addInstruction(Opcode.INVOKESTATIC, compare);
			method.addInstruction(Opcode.IRETURN);
		}

		private ResultInfo compileValue(Context context, MethodInfo method, Type paramType, String paramName) {
			context.registerValue(new Variable(new Identifier(paramName), DocumentType.instance()));
			ArgumentAssignment assignment = call.getAssignments().getFirst();
			assignment.setExpression(new UnresolvedIdentifier(new Identifier(paramName)));
			return call.compile(context, method, new Flags());
		}
	}
	
	class EntryComparatorCompiler extends ComparatorCompilerBase {

		@Override
		protected void compileMethodBody(Context context, MethodInfo method, Type paramType, IExpression key) {
			String keyName = ((TextLiteral)key).getValue().getStorableData();
			MethodConstant getter = new MethodConstant(paramType, "get", Object.class, Object.class);
			method.addInstruction(Opcode.ALOAD_1, new ClassConstant(paramType));
			method.addInstruction(Opcode.LDC, new StringConstant(keyName));
			method.addInstruction(Opcode.INVOKEVIRTUAL, getter);
			method.addInstruction(Opcode.ALOAD_2, new ClassConstant(paramType));
			method.addInstruction(Opcode.LDC, new StringConstant(keyName));
			method.addInstruction(Opcode.INVOKEVIRTUAL, getter);
			MethodConstant compare = new MethodConstant(ObjectUtils.class, "safeCompare", Object.class, Object.class, int.class);
			method.addInstruction(Opcode.INVOKESTATIC, compare);
			method.addInstruction(Opcode.IRETURN);
		}

	}

	class ExpressionComparatorCompiler extends ComparatorCompilerBase {
		
		
		@Override
		protected void compileMethodBody(Context context, MethodInfo method, Type paramType, IExpression key) {
			StackLocal tmpThis = method.registerLocal("this", VerifierType.ITEM_Object, new ClassConstant(paramType));
			compileValue(context, method, paramType, key, tmpThis, "o1");
			compileValue(context, method, paramType, key, tmpThis, "o2");
			MethodConstant compare = new MethodConstant(ObjectUtils.class, "safeCompare", Object.class, Object.class, int.class);
			method.addInstruction(Opcode.INVOKESTATIC, compare);
			method.addInstruction(Opcode.IRETURN);
		}

		private ResultInfo compileValue(Context context, MethodInfo method, Type paramType, IExpression key, StackLocal tmpThis, String paramName) {
			StackLocal param = method.getRegisteredLocal(paramName);
			Opcode opcode = Opcode.values()[Opcode.ALOAD_0.ordinal() + param.getIndex()];
			method.addInstruction(opcode, new ClassConstant(paramType));
			method.addInstruction(Opcode.ASTORE, new ByteOperand((byte)tmpThis.getIndex()));
			return key.compile(context.newDocumentContext(null, true), method, new Flags());
		}
	}

		
}
