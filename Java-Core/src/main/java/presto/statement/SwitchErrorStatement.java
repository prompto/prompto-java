package presto.statement;

import presto.error.ExecutionError;
import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.expression.ConstructorExpression;
import presto.expression.IExpression;
import presto.grammar.ArgumentAssignment;
import presto.grammar.ArgumentAssignmentList;
import presto.grammar.INamed;
import presto.grammar.UnresolvedArgument;
import presto.literal.TextLiteral;
import presto.runtime.Context;
import presto.runtime.ErrorVariable;
import presto.type.CategoryType;
import presto.type.EnumeratedCategoryType;
import presto.type.IType;
import presto.type.TypeMap;
import presto.type.VoidType;
import presto.utils.CodeWriter;
import presto.value.IValue;

public class SwitchErrorStatement extends BaseSwitchStatement {

	String errorName;
	StatementList instructions;
	StatementList alwaysInstructions;
	
	public SwitchErrorStatement(String errorName, StatementList instructions) {
		this.errorName = errorName;
		this.instructions = instructions;
	}
	
	public SwitchErrorStatement(String errorName, StatementList instructions, 
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
		return new EnumeratedCategoryType("Error");
	}
	
	@Override
	protected void collectReturnTypes(Context context, TypeMap types) throws SyntaxError {
		IType type = instructions.check(context);
		if(type!=VoidType.instance())
			types.put(type.getName(), type);
		Context local = context.newLocalContext();
		local.registerValue(new ErrorVariable(errorName));
		super.collectReturnTypes(local, types);
		if(alwaysInstructions!=null) {
			type = alwaysInstructions.check(context);
			if(type!=VoidType.instance())
				types.put(type.getName(), type);
		}
	}

	@Override
	public IValue interpret(Context context) throws PrestoError {
		IValue result = null;
		try {
			result = instructions.interpret(context);
		} catch (ExecutionError e) {
			IValue switchValue = populateError(e,context);
			result = evaluateSwitch(context, switchValue, e);
		} finally {
			if(alwaysInstructions!=null)
				alwaysInstructions.interpret(context);
		}
		return result;
	}

	private IValue populateError(ExecutionError e, Context context) throws PrestoError {
		IExpression exp = e.getExpression(context);
		if(exp==null) {
			ArgumentAssignmentList args = new ArgumentAssignmentList();
			args.add(new ArgumentAssignment(new UnresolvedArgument("name"), new TextLiteral(e.getClass().getSimpleName())));
			args.add(new ArgumentAssignment(new UnresolvedArgument("text"), new TextLiteral(e.getMessage())));
			exp = new ConstructorExpression(new CategoryType("Error"), args);
		}
		if(context.getRegisteredValue(INamed.class, errorName)==null)
			context.registerValue(new ErrorVariable(errorName));
		IValue error = exp.interpret(context);
		context.setValue(errorName, error);
		return error;
	}

}
