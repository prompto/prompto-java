package prompto.expression;

import prompto.compiler.Flags;
import prompto.compiler.MethodInfo;
import prompto.compiler.ResultInfo;
import prompto.declaration.AttributeDeclaration;
import prompto.error.PromptoError;
import prompto.parser.Dialect;
import prompto.parser.ISection;
import prompto.runtime.Context;
import prompto.store.AttributeInfo;
import prompto.store.IStore;
import prompto.transpiler.Transpiler;
import prompto.type.IType;
import prompto.type.MethodType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;

/* an IExpression is the result of parsing a piece of Prompto code
 * every expression requires :
 *  - to be checked for syntax verification purpose
 *  - to be interpreted at runtime, which results in a value
 * 	- to be translated into any dialect
 */
public interface IExpression {
	
	IType check(Context context);
	default IType checkReference(Context context) {
		return check(context);
	}
	IValue interpret(Context context) throws PromptoError;
	default IValue interpretReference(Context context) {
		return interpret(context);
	}
	void toDialect(CodeWriter writer);
	default void parentToDialect(CodeWriter writer) {
		toDialect(writer);
	}

	default ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		throw new UnsupportedOperationException("compile " + this.getClass().getName());
	}
	default ResultInfo compileReference(Context context, MethodInfo method, Flags flags) {
		return compile(context, method, flags);
	}
	
	default ResultInfo compileParent(Context context, MethodInfo method, Flags flags) {
		return compile(context, method, flags);
	}
	
	default void declare(Transpiler transpiler) {
		throw new UnsupportedOperationException("declare " + this.getClass().getName());
	}
	default void declareParent(Transpiler transpiler) {
		declare(transpiler);
	}
	default boolean transpile(Transpiler transpiler) {
		throw new UnsupportedOperationException("transpile " + this.getClass().getName());
	}
	default boolean transpileParent(Transpiler transpiler) {
		return transpile(transpiler);
	}
	default boolean transpileReference(Transpiler transpiler, MethodType methodType) {
		return transpile(transpiler);
	}
	default void declareQuery(Transpiler transpiler) {
		throw new UnsupportedOperationException("declareQuery " + this.getClass().getName());
	}
	default void transpileQuery(Transpiler transpiler, String builderName) {
		throw new UnsupportedOperationException("transpileQuery " + this.getClass().getName());
	}
	default void transpileFound(Transpiler transpiler, Dialect dialect) {
		throw new UnsupportedOperationException("transpileFound " + this.getClass().getName());
	}
	default AttributeDeclaration checkAttribute(Context context, ISection section) {
		context.getProblemListener().reportMissingAttribute(section, this.toString());
		return null;
	}
	default AttributeInfo checkAttributeInfo(Context context, ISection section, IStore store) {
		context.getProblemListener().reportMissingAttribute(section, this.toString());
		return null;
	}
	
	
}
