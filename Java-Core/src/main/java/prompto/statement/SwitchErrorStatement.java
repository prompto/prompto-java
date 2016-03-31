package prompto.statement;

import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import prompto.compiler.ClassConstant;
import prompto.compiler.CompilerUtils;
import prompto.compiler.ExceptionHandler;
import prompto.compiler.FieldConstant;
import prompto.compiler.Flags;
import prompto.compiler.MethodInfo;
import prompto.compiler.OffsetListenerConstant;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.compiler.StackLocal;
import prompto.compiler.StackState;
import prompto.error.ExecutionError;
import prompto.error.PromptoError;
import prompto.expression.IExpression;
import prompto.expression.SymbolExpression;
import prompto.grammar.Identifier;
import prompto.literal.ListLiteral;
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
	StatementList statements;
	StatementList finallyStatements;
	
	public SwitchErrorStatement(Identifier errorName, StatementList instructions) {
		this.errorName = errorName;
		this.statements = instructions;
	}
	
	public SwitchErrorStatement(Identifier errorName, StatementList instructions, 
			SwitchCaseList handlers, StatementList anyStmts, StatementList finalStmts) {
		super(handlers, anyStmts);
		this.errorName = errorName;
		this.statements = instructions;
		this.finallyStatements = finalStmts;
	}

	public void setAlwaysInstructions(StatementList list) {
		finallyStatements = list;
	}
	
	@Override
	protected void toODialect(CodeWriter writer) {
		writer.append("try (");
		writer.append(errorName);
		writer.append(") {\n");
		writer.indent();
		statements.toDialect(writer);
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
		if(finallyStatements!=null) {
			writer.append("finally {\n");
			writer.indent();
			finallyStatements.toDialect(writer);
			writer.dedent();
			writer.append("}");
		}
		writer.newLine();
	}

	@Override
	protected void toSDialect(CodeWriter writer) {
		writer.append("try ");
		writer.append(errorName);
		writer.append(":\n");
		writer.indent();
		statements.toDialect(writer);
		writer.dedent();
		for(SwitchCase sc : switchCases)
			sc.catchToPDialect(writer);
		if(defaultCase!=null) {
			writer.append("except:\n");
			writer.indent();
			defaultCase.toDialect(writer);
			writer.dedent();
		}
		if(finallyStatements!=null) {
			writer.append("finally:\n");
			writer.indent();
			finallyStatements.toDialect(writer);
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
		statements.toDialect(writer);
		writer.dedent();
		for(SwitchCase sc : switchCases)
			sc.catchToEDialect(writer);
		if(defaultCase!=null) {
			writer.append("when any:\n");
			writer.indent();
			defaultCase.toDialect(writer);
			writer.dedent();
		}
		if(finallyStatements!=null) {
			writer.append("always:\n");
			writer.indent();
			finallyStatements.toDialect(writer);
			writer.dedent();
		}
	}

	@Override
	protected void checkSwitchCasesType(Context context) {
		Context local = context.newLocalContext();
		local.registerValue(new ErrorVariable(errorName));
		super.checkSwitchCasesType(local);
	}
	
	@Override
	IType checkSwitchType(Context context) {
		return new EnumeratedCategoryType(new Identifier("Error"));
	}
	
	@Override
	protected void collectReturnTypes(Context context, TypeMap types) {
		IType type = statements.check(context, null);
		if(type!=VoidType.instance())
			types.put(type.getTypeNameId(), type);
		Context local = context.newLocalContext();
		local.registerValue(new ErrorVariable(errorName));
		super.collectReturnTypes(local, types);
		if(finallyStatements!=null) {
			type = finallyStatements.check(context, null);
			if(type!=VoidType.instance())
				types.put(type.getTypeNameId(), type);
		}
	}

	@Override
	public IValue interpret(Context context) throws PromptoError {
		IValue result = null;
		try {
			result = statements.interpret(context);
		} catch (ExecutionError e) {
			IValue switchValue = e.interpret(context, errorName);
			result = interpretSwitch(context, switchValue, e);
		} finally {
			if(finallyStatements!=null)
				finallyStatements.interpret(context);
		}
		return result;
	}
	
	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		List<List<ExceptionHandler>> handlers = installExceptionHandlers(context, method, flags);
		ResultInfo result = statements.compile(context, method, flags);
		if(result.isReturn()) 
			compileExceptionHandlers(context, method, flags, handlers, null);
		else {
			List<OffsetListenerConstant> finalOffsets = new LinkedList<>();
			StackState neutral = method.captureStackState();
			OffsetListenerConstant finalOffset = method.addOffsetListener(new OffsetListenerConstant());
			method.activateOffsetListener(finalOffset);
			finalOffsets.add(finalOffset);
			method.addInstruction(Opcode.GOTO, finalOffset);
			compileExceptionHandlers(context, method, flags, handlers, finalOffsets);
			finalOffsets.forEach((o)->
				method.inhibitOffsetListener(o));
			method.restoreStackState(neutral);
			method.placeLabel(neutral);
		}
		return result;
	}

	private void compileExceptionHandlers(Context context, MethodInfo method,
			Flags flags, List<List<ExceptionHandler>> handlerList, List<OffsetListenerConstant> finalOffsets ) {
		Iterator<SwitchCase> iterCases = switchCases.iterator();
		Iterator<List<ExceptionHandler>> iterHandler = handlerList.iterator();
		if(iterCases.hasNext())
			compileExceptionHandler(context, method, flags, iterCases.next(), iterHandler.next(), finalOffsets);
		// TODO 'finally'
	}

	private void compileExceptionHandler(Context context, MethodInfo method, Flags flags, 
			SwitchCase switchCase, List<ExceptionHandler> handlers,
			List<OffsetListenerConstant> finalOffsets) {
		handlers.forEach((h)->
			method.inhibitOffsetListener(h));
		ExceptionHandler handler = makeCommonExceptionHandler(handlers);
		method.placeExceptionHandler(handler);
		Type exception = compileConvertException(context, method, flags, handler);
		StackLocal error = method.registerLocal(errorName.toString(), 
				prompto.compiler.IVerifierEntry.Type.ITEM_Object, new ClassConstant(exception));
		CompilerUtils.compileASTORE(method, error);
		Context local = context.newLocalContext();
		local.registerValue(new ErrorVariable(errorName));
		ResultInfo result = switchCase.statements.compile(local, method, flags);
		if(finalOffsets!=null && !result.isReturn() && !result.isThrow()) {
			OffsetListenerConstant finalOffset = method.addOffsetListener(new OffsetListenerConstant());
			method.activateOffsetListener(finalOffset);
			finalOffsets.add(finalOffset);
			method.addInstruction(Opcode.GOTO, finalOffset);
		}
		method.unregisterLocal(error);
	}

	private Type compileConvertException(Context context, MethodInfo method, Flags flags, ExceptionHandler handler) {
		Type type = handler.getException().getType();
		if(ArithmeticException.class==type)
			return compileConvertException(context, method, flags, "DIVIDE_BY_ZERO");
		else
			return type;
	}

	private Type compileConvertException(Context context, MethodInfo method, Flags flags, String name) {
		method.addInstruction(Opcode.POP); // the original exception
		ClassConstant cc = new ClassConstant(CompilerUtils.getCategoryEnumConcreteType("Error"));
		FieldConstant fc = new FieldConstant(cc, name, cc.getType());
		method.addInstruction(Opcode.GETSTATIC, fc);
		return cc.getType();
	}

	private ExceptionHandler makeCommonExceptionHandler(List<ExceptionHandler> handlers) {
		if(handlers.size()==1) 
			return handlers.get(0);
		else
			throw new UnsupportedOperationException();
	}

	private List<List<ExceptionHandler>> installExceptionHandlers(Context context, 
			MethodInfo method, Flags flags) {
		List<List<ExceptionHandler>> handlers = new LinkedList<>();
		for(SwitchCase sc : switchCases)
			handlers.add(installExceptionHandlers(context, method, flags, sc));
		// TODO 'finally'
		return handlers;
	}

	private List<ExceptionHandler> installExceptionHandlers(Context context, MethodInfo method,
			Flags flags,  SwitchCase sc) {
		if(sc instanceof AtomicSwitchCase)
			return installExceptionHandler(context, method, flags, (AtomicSwitchCase)sc);
		else if(sc instanceof CollectionSwitchCase)
			return installExceptionHandlers(context, method, flags, (CollectionSwitchCase)sc);
		else
			throw new UnsupportedOperationException();
	}

	private List<ExceptionHandler> installExceptionHandler(Context context, MethodInfo method,
			Flags flags, AtomicSwitchCase sc) {
		IExpression exp = sc.getExpression();
		if(exp instanceof SymbolExpression) {
			List<ExceptionHandler> list = new LinkedList<ExceptionHandler>();
			list.add(installExceptionHandler(context, method, flags, (SymbolExpression)exp));
			return list;
		} else
			throw new UnsupportedOperationException();
		
	}

	private List<ExceptionHandler> installExceptionHandlers(Context context, MethodInfo method,
			Flags flags, CollectionSwitchCase sc) {
		IExpression exp = sc.getExpression();
		if(exp instanceof ListLiteral) {
			List<ExceptionHandler> list = new LinkedList<ExceptionHandler>();
			for(IExpression item : ((ListLiteral)exp).getExpressions()) {
				if(item instanceof SymbolExpression)
					list.add(installExceptionHandler(context, method, flags, (SymbolExpression)item));
				else
					throw new UnsupportedOperationException();
			}
			return list;
		} else
			throw new UnsupportedOperationException();

	}

	private ExceptionHandler installExceptionHandler(Context context, MethodInfo method,
			Flags flags, SymbolExpression symbol) {
		Type type = null;
		switch(symbol.getName()) {
		case "DIVIDE_BY_ZERO":
			type = ArithmeticException.class;
			break;
		default:
			throw new UnsupportedOperationException();
		}
		ExceptionHandler handler = method.registerExceptionHandler(type);
		method.activateOffsetListener(handler);
		return handler;
	}
}
