package prompto.statement;

import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.expression.Symbol;
import prompto.expression.SymbolExpression;
import prompto.runtime.Context;
import prompto.transpiler.Transpiler;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;


public class AtomicSwitchCase extends SwitchCase {

	public AtomicSwitchCase(IExpression expression, StatementList list) {
		super(expression,list);
	}
	
	@Override
	public String toString() {
		return "case " + expression.toString() + ":";
	}

	@Override
	public void checkSwitchType(Context context, IType type) {
		IType thisType = expression.check(context);
		if(!type.isAssignableFrom(context, thisType))
			throw new SyntaxError("Cannot assign:" + thisType.getTypeName() + " to:" + type.getTypeName());
		
	}
	
	@Override
	public boolean matches(Context context,IValue value) throws PromptoError {
		if(value instanceof Symbol && expression instanceof SymbolExpression)
			return value == ((SymbolExpression)expression).getSymbol(context);
		else {
			Object thisValue = expression.interpret(context);
			return value.equals(thisValue);
		}
	}
	
	@Override
	public void caseToPDialect(CodeWriter writer) {
		caseToEDialect(writer);
	}

	@Override
	public void caseToODialect(CodeWriter writer) {
		writer.append("case ");
		expression.toDialect(writer);
		writer.append(":\n");
		writer.indent();
		statements.toDialect(writer);
		writer.dedent();
	}
	
	@Override
	public void catchToODialect(CodeWriter writer) {
		writer.append("catch (");
		expression.toDialect(writer);
		writer.append(") {\n");
		writer.indent();
		statements.toDialect(writer);
		writer.dedent();
		writer.append("} ");
	}
	
	@Override
	public void caseToEDialect(CodeWriter writer) {
		writer.append("when ");
		expression.toDialect(writer);
		writer.append(":\n");
		writer.indent();
		statements.toDialect(writer);
		writer.dedent();
	}
	
	@Override
	public void catchToPDialect(CodeWriter writer) {
		writer.append("except ");
		expression.toDialect(writer);
		writer.append(":\n");
		writer.indent();
		statements.toDialect(writer);
		writer.dedent();
	}
	
	@Override
	public void catchToEDialect(CodeWriter writer) {
		caseToEDialect(writer); // no difference
	}
	
	@Override
	public void transpile(Transpiler transpiler) {
	    transpiler.append("case ");
	    this.expression.transpile(transpiler);
	    transpiler.append(":").indent();
	    this.statements.transpile(transpiler);
	    transpiler.append("break;").dedent();
	}
	
	@Override
	public void transpileError(Transpiler transpiler) {
	    transpiler.append("case \"");
	    this.expression.transpile(transpiler);
	    transpiler.append("\":");
	    transpiler.indent();
	    this.statements.transpile(transpiler);
	    transpiler.append("break;");
	    transpiler.dedent();
	}
}
