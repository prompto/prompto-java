package prompto.statement;

import prompto.error.ExecutionError;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.runtime.ErrorVariable;
import prompto.type.EnumeratedCategoryType;
import prompto.type.IType;
import prompto.type.TypeMap;
import prompto.type.VoidType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;

public class SwitchErrorStatement extends BaseSwitchStatement {

	Identifier errorName;
	StatementList instructions;
	StatementList alwaysInstructions;
	
	public SwitchErrorStatement(Identifier errorName, StatementList instructions) {
		this.errorName = errorName;
		this.instructions = instructions;
	}
	
	public SwitchErrorStatement(Identifier errorName, StatementList instructions, 
			SwitchCaseList handlers, StatementList anyStmts, StatementList finalStmts) {
		super(handlers, anyStmts);
		this.errorName = errorName;
		this.instructions = instructions;
		this.alwaysInstructions = finalStmts;
	}

	public void setAlwaysInstructions(StatementList list) {
		alwaysInstructions = list;
	}
	
	@Override
	protected void toODialect(CodeWriter writer) {
		writer.append("try (");
		writer.append(errorName);
		writer.append(") {\n");
		writer.indent();
		instructions.toDialect(writer);
		writer.dedent();
		writer.append("} ");
		for(SwitchCase sc : switchCases)
			sc.catchToODialect(writer);
		if(defaultCase!=null) {
			writer.append("catch(any) {\n");
			writer.indent();
			defaultCase.toDialect(writer);
			writer.dedent();
			writer.append("}");
		}
		if(alwaysInstructions!=null) {
			writer.append("finally {\n");
			writer.indent();
			alwaysInstructions.toDialect(writer);
			writer.dedent();
			writer.append("}");
		}
		writer.newLine();
	}

	@Override
	protected void toPDialect(CodeWriter writer) {
		writer.append("try ");
		writer.append(errorName);
		writer.append(":\n");
		writer.indent();
		instructions.toDialect(writer);
		writer.dedent();
		for(SwitchCase sc : switchCases)
			sc.catchToPDialect(writer);
		if(defaultCase!=null) {
			writer.append("except:\n");
			writer.indent();
			defaultCase.toDialect(writer);
			writer.dedent();
		}
		if(alwaysInstructions!=null) {
			writer.append("finally:\n");
			writer.indent();
			alwaysInstructions.toDialect(writer);
			writer.dedent();
		}
		writer.newLine();
	}
	@Override
	protected void toEDialect(CodeWriter writer) {
		writer.append("switch on ");
		writer.append(errorName);
		writer.append(" doing:\n");
		writer.indent();
		instructions.toDialect(writer);
		writer.dedent();
		for(SwitchCase sc : switchCases)
			sc.catchToEDialect(writer);
		if(defaultCase!=null) {
			writer.append("when any:\n");
			writer.indent();
			defaultCase.toDialect(writer);
			writer.dedent();
		}
		if(alwaysInstructions!=null) {
			writer.append("always:\n");
			writer.indent();
			alwaysInstructions.toDialect(writer);
			writer.dedent();
		}
	}

	@Override
	protected void checkSwitchCasesType(Context context) throws SyntaxError {
		Context local = context.newLocalContext();
		local.registerValue(new ErrorVariable(errorName));
		super.checkSwitchCasesType(local);
	}
	
	@Override
	IType checkSwitchType(Context context) throws SyntaxError {
		return new EnumeratedCategoryType(new Identifier("Error"));
	}
	
	@Override
	protected void collectReturnTypes(Context context, TypeMap types) throws SyntaxError {
		IType type = instructions.check(context, null);
		if(type!=VoidType.instance())
			types.put(type.getName(), type);
		Context local = context.newLocalContext();
		local.registerValue(new ErrorVariable(errorName));
		super.collectReturnTypes(local, types);
		if(alwaysInstructions!=null) {
			type = alwaysInstructions.check(context, null);
			if(type!=VoidType.instance())
				types.put(type.getName(), type);
		}
	}

	@Override
	public IValue interpret(Context context) throws PromptoError {
		IValue result = null;
		try {
			result = instructions.interpret(context);
		} catch (ExecutionError e) {
			IValue switchValue = e.interpret(context, errorName);
			result = evaluateSwitch(context, switchValue, e);
		} finally {
			if(alwaysInstructions!=null)
				alwaysInstructions.interpret(context);
		}
		return result;
	}


}
