package prompto.expression;

import prompto.compiler.Flags;
import prompto.compiler.MethodInfo;
import prompto.compiler.ResultInfo;
import prompto.declaration.AttributeDeclaration;
import prompto.error.PromptoError;
import prompto.parser.ICodeSection;
import prompto.property.Property;
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
	default boolean transpileProperty(Transpiler transpiler, Property property) {
		return transpile(transpiler);
	}
	default boolean transpileParent(Transpiler transpiler) {
		return transpile(transpiler);
	}
	default boolean transpileMethodReference(Transpiler transpiler, MethodType methodType) {
		return transpile(transpiler);
	}
	default AttributeDeclaration checkAttribute(Context context, ICodeSection section) {
		context.getProblemListener().reportMissingAttribute(section, this.toString());
		return null;
	}
	default AttributeInfo checkAttributeInfo(Context context, ICodeSection section, IStore store) {
		context.getProblemListener().reportMissingAttribute(section, this.toString());
		return null;
	}
	
	
}
