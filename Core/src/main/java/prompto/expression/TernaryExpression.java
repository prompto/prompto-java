package prompto.expression;

import java.lang.reflect.Type;

import prompto.compiler.ClassConstant;
import prompto.compiler.CompilerUtils;
import prompto.compiler.Flags;
import prompto.compiler.IInstructionListener;
import prompto.compiler.MethodInfo;
import prompto.compiler.OffsetListenerConstant;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.compiler.StackState;
import prompto.error.PromptoError;
import prompto.parser.CodeSection;
import prompto.parser.Dialect;
import prompto.runtime.Context;
import prompto.transpiler.Transpiler;
import prompto.type.BooleanType;
import prompto.type.IType;
import prompto.type.TypeMap;
import prompto.utils.CodeWriter;
import prompto.value.BooleanValue;
import prompto.value.IValue;

public class TernaryExpression extends CodeSection implements IExpression {

	IExpression condition;
	IExpression whenTrue;
	IExpression whenFalse;
	
	public TernaryExpression(IExpression condition, IExpression whenTrue, IExpression whenFalse) {
		this.condition = condition;
		this.whenTrue = whenTrue;
		this.whenFalse = whenFalse;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		if(writer.getDialect()==Dialect.O) {
			condition.toDialect(writer);
			writer.append(" ? ");
			whenTrue.toDialect(writer);
			writer.append(" : ");
			whenFalse.toDialect(writer);
		} else {
			whenTrue.toDialect(writer);
			writer.append(" if ");
			condition.toDialect(writer);
			writer.append(" else ");
			whenFalse.toDialect(writer);
		}
	}
	
	@Override
	public IType check(Context context) {
		IType type = condition.check(context);
		if(!(type instanceof BooleanType))
			context.getProblemListener().reportIllegalPredicate(this, condition );
		if(condition instanceof EqualsExpression)
			context = ((EqualsExpression)condition).downcastForCheck(context);
		IType trueType = whenTrue.check(context);
		IType falseType = whenFalse.check(context);
		TypeMap types = new TypeMap();
		types.add(trueType);
		types.add(falseType);
		return types.inferType(context, this);
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		Object test = condition.interpret(context);
		if(condition instanceof EqualsExpression)
			context = ((EqualsExpression)condition).downcastForInterpret(context);
		if(test == BooleanValue.TRUE)
			return whenTrue.interpret(context);
		else
			return whenFalse.interpret(context);
	}
	
	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		Type resultType = check(context).toJavaType(context);
		StackState initialState = method.captureStackState();
		ResultInfo li = condition.compile(context, method, flags.withPrimitive(true));
		if(BooleanValue.class==li.getType())
			CompilerUtils.BooleanToboolean(method);
		if(condition instanceof EqualsExpression)
			context = ((EqualsExpression)condition).downcastForCheck(context);
		IInstructionListener branchListener = method.addOffsetListener(new OffsetListenerConstant());
		method.activateOffsetListener(branchListener);
		method.addInstruction(Opcode.IFEQ, branchListener);
		ResultInfo trueResult = whenTrue.compile(context, method, flags.withPrimitive(false));
		trueResult = compileDowncastIfRequired(context, method, trueResult, resultType);
		IInstructionListener finalListener = method.addOffsetListener(new OffsetListenerConstant());
		method.activateOffsetListener(finalListener);
		method.addInstruction(Opcode.GOTO, finalListener);
		method.restoreFullStackState(initialState);
		method.placeLabel(initialState);
		method.inhibitOffsetListener(branchListener);
		ResultInfo falseResult = whenFalse.compile(context, method, flags.withPrimitive(false));
		falseResult = compileDowncastIfRequired(context, method, falseResult, resultType);
		method.inhibitOffsetListener(finalListener);
		StackState finalState = method.captureStackState();
		method.restoreFullStackState(finalState);
		method.placeLabel(finalState);
		return trueResult; // should be same as falseResult
	}

	private ResultInfo compileDowncastIfRequired(Context context, MethodInfo method, ResultInfo result, Type required) {
		if(result.getType()==required)
			return result;
		if(required instanceof Class<?> && result.getType() instanceof Class<?>) {
			if(((Class<?>)required).isAssignableFrom((Class<?>)result.getType()))
				return result;
		}
		ClassConstant c = new ClassConstant(required);
		method.addInstruction(Opcode.CHECKCAST, c);
		return new ResultInfo(required);
	}

	@Override
	public void declare(Transpiler transpiler) {
	    this.condition.declare(transpiler);
		if(condition instanceof EqualsExpression)
			transpiler = transpiler.newChildTranspiler(((EqualsExpression)condition).downcastForCheck(transpiler.getContext()));
		this.whenTrue.declare(transpiler);
	    this.whenFalse.declare(transpiler);
	}
	
	@Override
	public boolean transpile(Transpiler transpiler) {
	    transpiler.append("(");
	    this.condition.transpile(transpiler);
	    transpiler.append(" ? ");
		if(condition instanceof EqualsExpression)
			transpiler = transpiler.newChildTranspiler(((EqualsExpression)condition).downcastForCheck(transpiler.getContext()));
	    this.whenTrue.transpile(transpiler);
	    transpiler.append(" : ");
	    this.whenFalse.transpile(transpiler);
	    transpiler.append(")");
	    transpiler.flush();
		return false;
	}
}
