package prompto.statement;

import java.util.LinkedList;

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
			toPDialect(writer);
			break;
		}
	}
	

	private void toPDialect(CodeWriter writer) {
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
			curly = elem.instructions.size()>1;
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

	public static class IfElement extends BaseStatement {

		IExpression condition;
		StatementList instructions;
		
		public IfElement(IExpression condition, StatementList instructions) {
			this.condition = condition;
			this.instructions = instructions;
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
				toPDialect(writer);
				break;
			}
		}

		public void toPDialect(CodeWriter writer) {
			toEDialect(writer);
		}
		
		public void toEDialect(CodeWriter writer) {
			if(condition!=null) {
				writer.append("if ");
				condition.toDialect(writer);
			}
			writer.append(":\n");
			writer.indent();
			instructions.toDialect(writer);
			writer.dedent();	
		}

		public void toODialect(CodeWriter writer) {
			if(condition!=null)
				{
				writer.append("if (");
				condition.toDialect(writer);
				writer.append(") ");
			}
			boolean curly = instructions!=null && instructions.size()>1;
			if(curly) 
				writer.append("{\n");
			else 
				writer.newLine();
			writer.indent();
			instructions.toDialect(writer);
			writer.dedent();
			if(curly) 
				writer.append("}");
		}

		public IExpression getCondition() {
			return condition;
		}
		
		public StatementList getInstructions() {
			return instructions;
		}
		
		@Override
		public IType check(Context context) throws SyntaxError {
			IType cond = condition.check(context);
			if(cond!=BooleanType.instance())
				throw new SyntaxError("Expected a boolean condition!");
			context = downCastForCheck(context);
			return instructions.check(context, null);
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
			return instructions.interpret(context);
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
