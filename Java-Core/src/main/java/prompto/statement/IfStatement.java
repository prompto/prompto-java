package prompto.statement;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import prompto.compiler.CompilerUtils;
import prompto.compiler.Flags;
import prompto.compiler.IInstructionListener;
import prompto.compiler.MethodInfo;
import prompto.compiler.OffsetListenerConstant;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.compiler.StackState;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.EqualsExpression;
import prompto.expression.IExpression;
import prompto.runtime.Context;
import prompto.type.BooleanType;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.Boolean;
import prompto.value.IValue;


public class IfStatement extends BaseStatement {

	public static class IfElementList extends LinkedList<IfElement> {

		private static final long serialVersionUID = 1L;

		public IfElementList() {
		}
		
		public IfElementList(IfElement elem) {
			this.add(elem);
		}
		
	}
	
	IfElementList elements = new IfElementList();
	
	public IfStatement(IExpression condition, StatementList instructions) {
		elements.add(new IfElement(condition,instructions));
	}


	public IfStatement(IExpression condition, StatementList instructions, 
			IfElementList elseIfs, StatementList elseStmts) {
		elements.add(new IfElement(condition,instructions));
		if(elseIfs!=null)
			elements.addAll(elseIfs);
		if(elseStmts!=null)
			elements.add(new IfElement(null,elseStmts));
	}


	public void addAdditional(IExpression condition, StatementList instructions) {
		elements.add(new IfElement(condition,instructions));
	}

	public void setFinal(StatementList instructions) {
		elements.add(new IfElement(null,instructions));
	}

	@Override
	public void toDialect(CodeWriter writer) {
		switch(writer.getDialect()) {
		case E:
			toEDialect(writer);
			break;
		case O:
			toODialect(writer);
			break;
		case S:
			toSDialect(writer);
			break;
		}
	}
	

	private void toSDialect(CodeWriter writer) {
		boolean first = true;
		for(IfElement elem : elements) {
			if(!first)
				writer.append("else ");
			elem.toDialect(writer);
			first = false;
		}
		writer.newLine();
	}


	private void toODialect(CodeWriter writer) {
		boolean first = true;
		boolean curly = false;
		for(IfElement elem : elements) {
			if(!first) {
				if(curly)
					writer.append(" ");
				writer.append("else ");
			}
			curly = elem.statements.size()>1;
			elem.toDialect(writer);
			first = false;
		}
		writer.newLine();
	}


	private void toEDialect(CodeWriter writer) {
		boolean first = true;
		for(IfElement elem : elements) {
			if(!first)
				writer.append("else ");
			elem.toDialect(writer);
			first = false;
		}
		writer.newLine();
	}


	@Override
	public IType check(Context context) throws SyntaxError {
		return elements.get(0).check(context);
		// TODO check consistency with additional elements
	}

	@Override
	public IValue interpret(Context context) throws PromptoError {
		for(IfElement element : elements) {
			IExpression condition = element.getCondition();
			Object test = condition==null ? Boolean.TRUE : condition.interpret(context);
			if(test instanceof Boolean && Boolean.TRUE.equals((Boolean)test))
				return element.interpret(context);
		}
		return null;
	}
	
	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) throws SyntaxError {
 		IType result = check(context);
		compileIfElements(context, method, flags);
		return new ResultInfo(result.getJavaType());
	}

	static class IfElementBranch {
		List<IInstructionListener> finalOffsetListeners = new ArrayList<>();
		IInstructionListener branchOffsetListener = null;
		StackState neutralState = null;
	}
	
	private void compileIfElements(Context context, MethodInfo method, Flags flags) throws SyntaxError {
		IfElementBranch branch = new IfElementBranch();
		branch.neutralState = method.captureStackState();
		for(IfElement element : elements)
			 compileElement(context, method, flags, element, branch);
		method.restoreStackState(branch.neutralState);
		method.placeLabel(branch.neutralState);
		stopListeningForThisBranch(method, branch);
		branch.finalOffsetListeners.forEach((l)->
			method.inhibitOffsetListener(l));
	}

	
	private void compileElement(Context context, MethodInfo method, Flags flags, IfElement element, IfElementBranch branch) throws SyntaxError {
		restoreNeutralStackState(method, branch);
		stopListeningForThisBranch(method, branch);
		compileCondition(context, method, flags, element);
		startListeningForNextBranch(method, element, branch);
		compileBranch(method, element, branch);
		context = element.downCastForCheck(context);
		ResultInfo info = compileStatements(context, method, flags, element, branch);
		startListeningForFinalThenGoto(context, method, flags, element, branch, info);
	}

	
	private void compileBranch(MethodInfo method, IfElement element, IfElementBranch branch) {
		if(element.condition!=null) {
			method.addInstruction(Opcode.IFEQ, branch.branchOffsetListener);
		}		
	}


	private void startListeningForFinalThenGoto(Context context, MethodInfo method, Flags flags, IfElement element, IfElementBranch branch, ResultInfo info) {
		if(element.condition!=null && !info.isReturn()) {
			IInstructionListener finalOffset = method.addOffsetListener(new OffsetListenerConstant());
			method.activateOffsetListener(finalOffset);
			branch.finalOffsetListeners.add(finalOffset);
			method.addInstruction(Opcode.GOTO, finalOffset);
		}
	}


	private ResultInfo compileStatements(Context context, MethodInfo method, Flags flags, IfElement element, IfElementBranch branch) throws SyntaxError {
		ResultInfo info = new ResultInfo(void.class);
		if(element.statements!=null) {
			for(IStatement statement : element.statements)
				info = statement.compile(context, method, flags);
		}
		return info; // we assume all statements are reachable
	}


	private void stopListeningForThisBranch(MethodInfo method, IfElementBranch branch) {
		if(branch.branchOffsetListener!=null) {
			method.inhibitOffsetListener(branch.branchOffsetListener);
			branch.branchOffsetListener = null;
		}
	}


	private void startListeningForNextBranch(MethodInfo method, IfElement element, IfElementBranch branch) {
		if(element.condition!=null) {
			branch.branchOffsetListener = method.addOffsetListener(new OffsetListenerConstant());
			method.activateOffsetListener(branch.branchOffsetListener);
		}
	}


	private void compileCondition(Context context, MethodInfo method, Flags flags, IfElement element) throws SyntaxError {
		if(element.condition!=null) {
			ResultInfo info = element.condition.compile(context, method, flags.withNative(true));
			if(Boolean.class==info.getType())
				CompilerUtils.BooleanToboolean(method);
		}
	}


	private void restoreNeutralStackState(MethodInfo method, IfElementBranch branch) {
		// is there a need to restore the stack?
		if(branch.branchOffsetListener!=null) {
			method.restoreStackState(branch.neutralState);
			method.placeLabel(branch.neutralState);
		}
	}

	public static class IfElement extends BaseStatement {

		IExpression condition;
		StatementList statements;
		
		public IfElement(IExpression condition, StatementList statements) {
			this.condition = condition;
			this.statements = statements;
		}
		
		@Override
		public void toDialect(CodeWriter writer) {
			switch(writer.getDialect()) {
			case E:
				toEDialect(writer);
				break;
			case O:
				toODialect(writer);
				break;
			case S:
				toSDialect(writer);
				break;
			}
		}

		public void toSDialect(CodeWriter writer) {
			toEDialect(writer);
		}
		
		public void toEDialect(CodeWriter writer) {
			if(condition!=null) {
				writer.append("if ");
				condition.toDialect(writer);
			}
			writer.append(":\n");
			writer.indent();
			statements.toDialect(writer);
			writer.dedent();	
		}

		public void toODialect(CodeWriter writer) {
			if(condition!=null)
				{
				writer.append("if (");
				condition.toDialect(writer);
				writer.append(") ");
			}
			boolean curly = statements!=null && statements.size()>1;
			if(curly) 
				writer.append("{\n");
			else 
				writer.newLine();
			writer.indent();
			statements.toDialect(writer);
			writer.dedent();
			if(curly) 
				writer.append("}");
		}

		public IExpression getCondition() {
			return condition;
		}
		
		public StatementList getInstructions() {
			return statements;
		}
		
		@Override
		public IType check(Context context) throws SyntaxError {
			IType cond = condition.check(context);
			if(cond!=BooleanType.instance())
				throw new SyntaxError("Expected a boolean condition!");
			context = downCastForCheck(context);
			return statements.check(context, null);
		}

		private Context downCastForCheck(Context context) throws SyntaxError {
			Context parent = context;
			if(condition instanceof EqualsExpression)
				context = ((EqualsExpression)condition).downCastForCheck(context);
			context = parent!=context ? context : context.newChildContext();
			return context;
		}

		@Override
		public IValue interpret(Context context) throws PromptoError {
			context = downCastForInterpret(context);
			return statements.interpret(context);
		}

		private Context downCastForInterpret(Context context) throws PromptoError {
			Context parent = context;
			if(condition instanceof EqualsExpression)
				context = ((EqualsExpression)condition).downCastForInterpret(context);
			context = parent!=context ? context : context.newChildContext();
			return context;
		}
	}

}
