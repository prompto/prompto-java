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
import prompto.compiler.ResultInfo.Flag;
import prompto.compiler.StackState;
import prompto.error.PromptoError;
import prompto.expression.EqualsExpression;
import prompto.expression.IExpression;
import prompto.parser.CodeSection;
import prompto.parser.ICodeSection;
import prompto.runtime.Context;
import prompto.transpiler.Transpiler;
import prompto.type.BooleanType;
import prompto.type.IType;
import prompto.type.TypeMap;
import prompto.type.VoidType;
import prompto.utils.CodeWriter;
import prompto.value.BooleanValue;
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

	public IfStatement(IExpression condition, StatementList statements) {
		elements.add(new IfElement(condition, statements));
	}

	public IfStatement(IExpression condition, StatementList statements, IfElementList elseIfs,
			StatementList elseStmts) {
		elements.add(new IfElement(condition, statements));
		if (elseIfs != null)
			elements.addAll(elseIfs);
		if (elseStmts != null)
			elements.add(new IfElement(null, elseStmts));
	}

	public void addAdditional(IExpression condition, StatementList instructions) {
		elements.add(new IfElement(condition, instructions));
	}

	public void setFinal(StatementList instructions) {
		elements.add(new IfElement(null, instructions));
	}

	@Override
	public boolean canReturn() {
		return true;
	}

	@Override
	public void toDialect(CodeWriter writer) {
		switch (writer.getDialect()) {
		case E:
			toEDialect(writer);
			break;
		case O:
			toODialect(writer);
			break;
		case M:
			toMDialect(writer);
			break;
		}
	}

	private void toMDialect(CodeWriter writer) {
		boolean first = true;
		for (IfElement elem : elements) {
			if (!first)
				writer.append("else ");
			elem.toDialect(writer);
			first = false;
		}
		writer.newLine();
	}

	private void toODialect(CodeWriter writer) {
		boolean first = true;
		boolean curly = false;
		for (IfElement elem : elements) {
			if (!first) {
				if (curly)
					writer.append(" ");
				writer.append("else ");
			}
			curly = elem.toDialect(writer);
			first = false;
		}
		writer.newLine();
	}

	private void toEDialect(CodeWriter writer) {
		boolean first = true;
		for (IfElement elem : elements) {
			if (!first)
				writer.append("else ");
			elem.toDialect(writer);
			first = false;
		}
		writer.newLine();
	}

	@Override
	public IType check(Context context) {
		TypeMap types = new TypeMap();
		ICodeSection section = null;
		for(IfElement element : elements) {
			IType type = element.check(context);
			if(type!=VoidType.instance()) {
				section = element;
				types.add(type);
			}
		}
		return types.inferType(context, section);
	}

	@Override
	public IValue interpret(Context context) throws PromptoError {
		for (IfElement element : elements) {
			IExpression condition = element.getCondition();
			Object test = condition == null ? BooleanValue.TRUE : condition.interpret(context);
			if (BooleanValue.TRUE == test)
				return element.interpret(context);
		}
		return null;
	}

	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		IType resultType = check(context);
		compileIfElements(context, method, flags);
		return new ResultInfo(resultType.toJavaType(context)).withFlag(Flag.RETURN, resultType!=VoidType.instance());
	}

	static class IfElementBranch {
		List<IInstructionListener> finalOffsetListeners = new ArrayList<>();
		IInstructionListener branchOffsetListener = null;
		StackState neutralState = null;
	}

	private void compileIfElements(Context context, MethodInfo method, Flags flags) {
		IfElementBranch branch = new IfElementBranch();
		branch.neutralState = method.captureStackState();
		for (IfElement element : elements)
			compileIfElement(context, method, flags, element, branch);
		method.restoreFullStackState(branch.neutralState);
		method.placeLabel(branch.neutralState);
		stopListeningForThisBranch(method, branch);
		branch.finalOffsetListeners.forEach((l) -> method.inhibitOffsetListener(l));
	}

	private void compileIfElement(Context context, MethodInfo method, Flags flags, IfElement element,
			IfElementBranch branch) {
		restoreNeutralStackState(method, branch);
		stopListeningForThisBranch(method, branch);
		compileCondition(context, method, flags, element);
		startListeningForNextBranch(method, element, branch);
		compileBranch(method, element, branch);
		context = prepareAutodowncast(context, method, element);
		ResultInfo info = compileStatements(context, method, flags, element, branch);
		startListeningForFinalThenGoto(context, method, flags, element, branch, info);
		cancelAutodowncast(context, method, element);
	}

	private void cancelAutodowncast(Context context, MethodInfo method, IfElement element) {
		if (element.condition instanceof EqualsExpression)
			((EqualsExpression) element.condition).cancelAutodowncast(context, method);
	}

	private Context prepareAutodowncast(Context context, MethodInfo method, IfElement element) {
		if (element.condition instanceof EqualsExpression)
			return ((EqualsExpression) element.condition).prepareAutodowncast(context, method);
		else
			return context;
	}

	private void compileBranch(MethodInfo method, IfElement element, IfElementBranch branch) {
		if (element.condition != null) {
			method.addInstruction(Opcode.IFEQ, branch.branchOffsetListener);
		}
	}

	private void startListeningForFinalThenGoto(Context context, MethodInfo method, Flags flags, IfElement element,
			IfElementBranch branch, ResultInfo info) {
		if (element.condition == null || info.isReturn() || info.isBreak())
			return;
		IInstructionListener finalOffset = method.addOffsetListener(new OffsetListenerConstant());
		method.activateOffsetListener(finalOffset);
		branch.finalOffsetListeners.add(finalOffset);
		method.addInstruction(Opcode.GOTO, finalOffset);
	}

	private ResultInfo compileStatements(Context context, MethodInfo method, Flags flags, IfElement element,
			IfElementBranch branch) {
		if (element.statements != null)
			return element.statements.compile(context, method, flags);
		else
			return new ResultInfo(void.class);
	}

	private void stopListeningForThisBranch(MethodInfo method, IfElementBranch branch) {
		if (branch.branchOffsetListener != null) {
			method.inhibitOffsetListener(branch.branchOffsetListener);
			branch.branchOffsetListener = null;
		}
	}

	private void startListeningForNextBranch(MethodInfo method, IfElement element, IfElementBranch branch) {
		if (element.condition != null) {
			branch.branchOffsetListener = method.addOffsetListener(new OffsetListenerConstant());
			method.activateOffsetListener(branch.branchOffsetListener);
		}
	}

	private void compileCondition(Context context, MethodInfo method, Flags flags, IfElement element) {
		if (element.condition != null) {
			ResultInfo info = element.condition.compile(context, method, flags.withPrimitive(true));
			if (java.lang.Boolean.class == info.getType())
				CompilerUtils.BooleanToboolean(method);
		}
	}

	private void restoreNeutralStackState(MethodInfo method, IfElementBranch branch) {
		// is there a need to restore the stack?
		if (branch.branchOffsetListener != null) {
			method.restoreFullStackState(branch.neutralState);
			method.placeLabel(branch.neutralState);
		}
	}

	@Override
	public void declare(Transpiler transpiler) {
		this.elements.forEach(e -> e.declare(transpiler));
	}

	@Override
	public boolean transpile(Transpiler transpiler) {
		for (int i = 0; i < this.elements.size(); i++) {
			IfElement element = this.elements.get(i);
			if (i > 0)
				transpiler.append(" else ");
			if (element.condition != null) {
				transpiler.append("if (");
				element.condition.transpile(transpiler);
				transpiler.append(") ");
			}
			transpiler.append("{");
			transpiler.indent();
			element.transpile(transpiler);
			transpiler.dedent();
			transpiler.append("}");
		}
		transpiler.newLine();
		return true;
	}

	public static class IfElement extends CodeSection {

		IExpression condition;
		StatementList statements;

		public IfElement(IExpression condition, StatementList statements) {
			this.condition = condition;
			this.statements = statements;
			this.populateSection();
		}
		
		

		private void populateSection() {
			if(condition instanceof ICodeSection)
				mergeCodeSection(((ICodeSection)condition).getSection());
			if(statements!=null)
				statements.forEach(stmt -> mergeCodeSection(stmt.getSection()));
		}


		public boolean toDialect(CodeWriter writer) {
			switch (writer.getDialect()) {
			case E:
				return toEDialect(writer);
			case O:
				return toODialect(writer);
			case M:
				return toMDialect(writer);
			default:
				return false;
			}
		}

		public boolean toMDialect(CodeWriter writer) {
			return toEDialect(writer);
		}

		public boolean toEDialect(CodeWriter writer) {
			Context context = writer.getContext();
			if (condition != null) {
				writer.append("if ");
				condition.toDialect(writer);
				context = downcastContextForCheck(context);
				if (context != writer.getContext())
					writer = writer.newChildWriter(context);
			}
			writer.append(":\n");
			writer.indent();
			statements.toDialect(writer);
			writer.dedent();
			return false;
		}

		public boolean toODialect(CodeWriter writer) {
			Context context = writer.getContext();
			if (condition != null) {
				writer.append("if (");
				condition.toDialect(writer);
				writer.append(") ");
				context = downcastContextForCheck(context);
				if (context != writer.getContext())
					writer = writer.newChildWriter(context);
			}
			boolean curly = needsCurlyBraces();
			if (curly)
				writer.append("{\n");
			else
				writer.newLine();
			writer.indent();
			statements.toDialect(writer);
			writer.dedent();
			if (curly)
				writer.append("}");
			return curly;
		}
		
		
		private boolean needsCurlyBraces() {
			if(statements == null)
				return false;
			if(statements.size() > 1)
				return true;
			else 
				return !statements.get(0).isSimple();
		}

		public IExpression getCondition() {
			return condition;
		}

		public StatementList getInstructions() {
			return statements;
		}

		public IType check(Context context) {
			if(condition!=null) {
				IType cond = condition.check(context);
				if (cond != BooleanType.instance())
					context.getProblemListener().reportIllegalPredicate(this, condition);
				else
					context = downcastContextForCheck(context);
			}
			return statements.check(context, null);
		}

		public IValue interpret(Context context) throws PromptoError {
			context = downcastForInterpret(context);
			return statements.interpret(context);
		}

		private Context downcastContextForCheck(Context context) {
			Context parent = context;
			if (condition instanceof EqualsExpression)
				context = ((EqualsExpression) condition).downcastForCheck(context);
			context = parent != context ? context : context.newChildContext();
			return context;
		}

		private Context downcastForInterpret(Context context) throws PromptoError {
			Context parent = context;
			if (condition instanceof EqualsExpression)
				context = ((EqualsExpression) condition).downcastForInterpret(context);
			context = parent != context ? context : context.newChildContext();
			return context;
		}

		public void declare(Transpiler transpiler) {
			if (this.condition != null)
				this.condition.declare(transpiler);
			Context context = transpiler.getContext();
			if (this.condition instanceof EqualsExpression)
				context = ((EqualsExpression) condition).downcastForCheck(context);
			if (context != transpiler.getContext())
				transpiler = transpiler.newChildTranspiler(context);
			else
				transpiler = transpiler.newChildTranspiler();
			this.statements.declare(transpiler);
		}

		public boolean transpile(Transpiler transpiler) {
			Context context = transpiler.getContext();
			if (this.condition instanceof EqualsExpression)
				context = ((EqualsExpression) condition).downcastForCheck(context);
			if (context != transpiler.getContext())
				transpiler = transpiler.newChildTranspiler(context);
			else
				transpiler = transpiler.newChildTranspiler();
			this.statements.transpile(transpiler);
			transpiler.flush();
			return false;
		}
	}

}
