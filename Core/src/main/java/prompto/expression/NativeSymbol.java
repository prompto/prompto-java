package prompto.expression;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

import prompto.compiler.CompilerUtils;
import prompto.compiler.FieldConstant;
import prompto.compiler.Flags;
import prompto.compiler.IOperand;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.error.PromptoError;
import prompto.error.ReadWriteError;
import prompto.error.SyntaxError;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.transpiler.Transpiler;
import prompto.type.EnumeratedNativeType;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;
import prompto.value.TextValue;

public class NativeSymbol extends Symbol implements IExpression {
	
	IExpression expression;
	
	public NativeSymbol(Identifier id, IExpression expression) {
		super(id);
		this.expression = expression;
	}

	public IExpression getExpression() {
		return expression;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		writer.append(symbol);
		switch(writer.getDialect()) {
		case E:
			writer.append(" with ");
			expression.toDialect(writer);
			writer.append(" as value");
			break;
		case O:
			writer.append(" = ");
			expression.toDialect(writer);
			break;
		case M:
			writer.append(" = ");
			expression.toDialect(writer);
			break;
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==this)
			return true;
		if(obj==null)
			return false;
		if(!(obj instanceof NativeSymbol))
			return false;
		NativeSymbol other = (NativeSymbol)obj;
		return this.getId().equals(other.getId())
				&& this.getExpression().equals(other.getExpression());
	}
	
	@Override
	public EnumeratedNativeType check(Context context) {
		IType actual = expression.check(context);
		EnumeratedNativeType type = (EnumeratedNativeType)this.getType(context);
		IType derived = type.getDerivedFrom();
		if(!derived.isAssignableFrom(context, actual))
			throw new SyntaxError("Cannot assign " + actual.getTypeName() + " to " + derived.getTypeName());
		return type;
	}
	
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		return this;
	}
	
	@Override
	public IValue getMember(Context context, Identifier name, boolean autoCreate) throws PromptoError {
		if("name".equals(name.toString()))
			return new TextValue(this.getName());
		else if("value".equals(name.toString()))
			return expression.interpret(context);
		else
			return super.getMember(context, name, autoCreate);
	}
	
	@Override
	public void toJsonStream(Context context, JsonGenerator generator, boolean withType, Map<String, byte[]> binaries) throws PromptoError {
		try {
			generator.writeStartObject();
			generator.writeFieldName("name");
			generator.writeString(symbol.toString());
			generator.writeFieldName("value");
			expression.interpret(context).toJsonStream(context, generator, withType, binaries);
			generator.writeEndObject();
		} catch(IOException e) {
			throw new ReadWriteError(e.getMessage());
		}
	}
	
	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		Type parentType = getParentJavaType(context);
		FieldConstant field = new FieldConstant(parentType, this.getId().toString(), parentType);
		method.addInstruction(Opcode.GETSTATIC, field);
		return new ResultInfo(parentType);
	}
	

	public void compileCallConstructor(Context context, MethodInfo method, Flags flags) {
		Type type = CompilerUtils.getNativeEnumType(this.getType().getTypeNameId());
		CompilerUtils.compileNewRawInstance(method, type); 
		method.addInstruction(Opcode.DUP);
		ResultInfo info = expression.compile(context, method, flags);
		CompilerUtils.compileCallConstructor(method, type, info.getType()); 
	}

	private Type getParentJavaType(Context context) {
		EnumeratedNativeType itype = (EnumeratedNativeType)this.getType(context);
		return CompilerUtils.getNativeEnumType(itype.getTypeNameId());
	}
	
	public static ResultInfo compileEquals(Context context, MethodInfo method, Flags flags, ResultInfo left, IExpression exp) {
		exp.compile(context, method, flags);
		IOperand oper = new MethodConstant(left.getType(), "equals", Object.class, boolean.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		if(flags.isReverse())
			CompilerUtils.reverseBoolean(method);
		if(flags.toPrimitive())
			return new ResultInfo(boolean.class);
		else
			return CompilerUtils.booleanToBoolean(method);
	}

	
	@Override
	public void declare(Transpiler transpiler) {
		this.type.declare(transpiler);
	}

	@Override
	public boolean transpile(Transpiler transpiler) {
		transpiler.append(this.getName());
		return false;
	}
	
	public void initialize(Transpiler transpiler) {
	    transpiler.append("var ").append(this.getName()).append(" = new ").append(this.type.getTypeName()).append("('").append(this.getName()).append("', ");
	    this.expression.transpile(transpiler);
	    transpiler.append(");");
	    transpiler.newLine();
	}
	
	@Override
	public IValue toDocumentValue(Context context) {
		return new TextValue(expression.toString());
	}
	
	@Override
	public JsonNode valueToJsonNode(Context context, Function<IValue, JsonNode> producer) throws PromptoError {
		ObjectNode result = JsonNodeFactory.instance.objectNode();
		for(String member : Arrays.asList("name", "value")) {
			JsonNode node = producer.apply(getMember(context, new Identifier(member), false));
			result.set(member, node);
		}
		return result;
	}

}
