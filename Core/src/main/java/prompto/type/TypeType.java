package prompto.type;

import java.lang.reflect.Type;
import java.util.Set;

import prompto.compiler.Flags;
import prompto.compiler.MethodInfo;
import prompto.compiler.ResultInfo;
import prompto.declaration.IMethodDeclaration;
import prompto.error.PromptoError;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.store.Family;
import prompto.transpiler.Transpiler;
import prompto.utils.CodeWriter;

public class TypeType extends BaseType {

	IType type;
	
	public TypeType(IType type) {
		super(Family.TYPE);
		this.type = type;
	}
	
	public IType getType() {
		return type;
	}
	
	@Override
	public String toString() {
		return "Type<" + type.toString() + ">";
	}
	
	
	@Override
	public void toDialect(CodeWriter writer) {
		writer.append("Type<");
		type.toDialect(writer);
		writer.append(">");
	}

	@Override
	public Type toJavaType(Context context) {
		return Type.class;
	}

	@Override
	public void checkUnique(Context context) {
		// nothing to do
	}

	@Override
	public void checkExists(Context context) {
		// nothing to do
	}

	@Override
	public boolean isMoreSpecificThan(Context context, IType other) {
		return false;
	}
	
	@Override
	public IType checkMember(Context context, Identifier id) {
		return type.checkStaticMember(context, id);
	}
	
	@Override
	public Set<IMethodDeclaration> getMemberMethods(Context context, Identifier id) throws PromptoError {
		return type.getStaticMemberMethods(context, id);
	}
	
	@Override
	public void declareMember(Transpiler transpiler, Identifier name) {
		type.declare(transpiler);
		type.declareStaticMember(transpiler, name);
	}

	@Override
	public void transpileMember(Transpiler transpiler, Identifier name) {
		type.transpileStaticMember(transpiler, name);
	}
	
	@Override
	public ResultInfo compileGetStaticMember(Context context, MethodInfo method, Flags flags, Identifier id) {
		return type.compileGetStaticMember(context, method, flags, id);
	}


}
