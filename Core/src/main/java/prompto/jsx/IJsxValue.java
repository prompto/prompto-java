package prompto.jsx;

import prompto.property.Property;
import prompto.runtime.Context;
import prompto.transpiler.Transpiler;
import prompto.type.IType;
import prompto.type.MethodType;
import prompto.utils.CodeWriter;

public interface IJsxValue {

	IType check(Context context);
	IType checkProto(Context context, MethodType expected);

	default void toDialect(CodeWriter writer) {
		throw new UnsupportedOperationException("toDialect " + this.getClass().getName());
	}

	void declare(Transpiler transpiler, Property property);
	boolean transpile(Transpiler transpiler, Property property);
	boolean isLiteral();

}
