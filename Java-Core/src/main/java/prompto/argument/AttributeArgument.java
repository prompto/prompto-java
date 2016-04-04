package prompto.argument;

import java.lang.reflect.Type;

import prompto.compiler.ClassConstant;
import prompto.compiler.CompilerUtils;
import prompto.compiler.FieldInfo;
import prompto.compiler.IVerifierEntry;
import prompto.compiler.InterfaceConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.StackLocal;
import prompto.declaration.AttributeDeclaration;
import prompto.declaration.IDeclaration;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.grammar.INamedArgument;
import prompto.grammar.Identifier;
import prompto.parser.Dialect;
import prompto.runtime.Context;
import prompto.store.IDataStore;
import prompto.store.IStore;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.utils.Utils;
import prompto.value.IValue;

public class AttributeArgument extends BaseArgument implements INamedArgument {
	
	public AttributeArgument(Identifier id) {
		super(id);
	}

	@Override
	public String getSignature(Dialect dialect) {
		return id.toString();
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		writer.append(id);
		if(defaultExpression!=null) {
			writer.append(" = ");
			defaultExpression.toDialect(writer);
		}
	}
	
	@Override
	public String toString() {
		return id.toString();
	}
	
	@Override
	public String getProto() {
		return id.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==this)
			return true;
		if(obj==null)
			return false;
		if(!(obj instanceof AttributeArgument))
			return false;
		AttributeArgument other = (AttributeArgument)obj;
		return Utils.equal(this.getId(),other.getId());
	}

	@Override
	public void register(Context context) {
		context.registerValue(this, true);
		if(defaultExpression!=null) try {
			context.setValue(id, defaultExpression.interpret(context));
		} catch(PromptoError error) {
			throw new SyntaxError("Unable to register default value: "+ defaultExpression.toString() + " for argument: " + id);
		}
	}
	
	@Override
	public void check(Context context) {
		AttributeDeclaration actual = context.getRegisteredDeclaration(AttributeDeclaration.class,id);
		if(actual==null)
			throw new SyntaxError("Unknown attribute: \"" + id + "\"");
	}
	
	@Override
	public IType getType(Context context) {
		// dbId type can only be resolved at runtime
		if(IStore.dbIdName.equals(id.toString()))
			return Utils.typeToIType(IDataStore.getInstance().getDbIdClass());
		else {
			IDeclaration named = context.getRegisteredDeclaration(IDeclaration.class, id);
			return named.getType(context);
		}
	}
	
	@Override
	public IValue checkValue(Context context, IExpression expression) throws PromptoError {
		AttributeDeclaration actual = context.getRegisteredDeclaration(AttributeDeclaration.class, id);
		return actual.checkValue(context, expression);
	}
	
	@Override
	public Type getJavaType(Context context) {
		return CompilerUtils.getAttributeType(id);
	}
	
	@Override
	public StackLocal registerLocal(Context context, MethodInfo method) {
		String desc = CompilerUtils.getDescriptor(getJavaType(context));
		IVerifierEntry.Type type = IVerifierEntry.Type.fromDescriptor(desc);
		ClassConstant classConstant = new ClassConstant(getJavaType(context));
		String instanceName = "%" + getName() + "%";
		return method.registerLocal( instanceName, type, classConstant);
	}
	
	@Override
	public void extractLocal(Context context, MethodInfo method) {
		super.registerLocal(context, method);
		String instanceName = "%" + getName() + "%";
		CompilerUtils.compileALOAD(method, instanceName);
		Type klass = getJavaType(context);
		String getterName = CompilerUtils.getterName(getName());
		AttributeDeclaration actual = context.getRegisteredDeclaration(AttributeDeclaration.class, id);
		FieldInfo field = actual.toFieldInfo(context);
		InterfaceConstant m = new InterfaceConstant(klass, getterName, field.getType());
		method.addInstruction(Opcode.INVOKEINTERFACE, m);
		StackLocal local = method.getRegisteredLocal(getName());
		CompilerUtils.compileASTORE(method, local);
	}
}
