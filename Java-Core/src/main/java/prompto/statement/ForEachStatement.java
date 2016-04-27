package prompto.statement;

import java.util.Iterator;

import prompto.compiler.ByteOperand;
import prompto.compiler.ClassConstant;
import prompto.compiler.CompilerUtils;
import prompto.compiler.Flags;
import prompto.compiler.IInstructionListener;
import prompto.compiler.IVerifierEntry.VerifierType;
import prompto.compiler.InterfaceConstant;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.OffsetListenerConstant;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.compiler.StackLocal;
import prompto.compiler.StackState;
import prompto.error.PromptoError;
import prompto.expression.IExpression;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.runtime.Variable;
import prompto.type.IType;
import prompto.type.IntegerType;
import prompto.utils.CodeWriter;
import prompto.value.IIterable;
import prompto.value.IValue;
import prompto.value.Integer;

public class ForEachStatement extends BaseStatement {

	Identifier v1, v2;
	IExpression source;
	StatementList statements;

	public ForEachStatement(Identifier v1, Identifier v2, IExpression source, StatementList instructions) {
		this.v1 = v1;
		this.v2 = v2;
		this.source = source;
		this.statements = instructions;
	}

	public StatementList getInstructions() {
		return statements;
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
	
	private void toODialect(CodeWriter writer) {
		writer.append("for each (");
		writer.append(v1);
		if(v2!=null) {
			writer.append(", ");
			writer.append(v2);
		}
		writer.append(" in ");
		source.toDialect(writer);
		writer.append(")");
		boolean oneLine = statements.size()==1 && (statements.get(0) instanceof SimpleStatement);
		if(!oneLine)
			writer.append(" {");
		writer.newLine();
		writer.indent();
		statements.toDialect(writer);
		writer.dedent();
		if(!oneLine) {
			writer.append("}");
			writer.newLine();
		}		
	}

	private void toEDialect(CodeWriter writer) {
		writer.append("for each ");
		writer.append(v1);
		if(v2!=null) {
			writer.append(", ");
			writer.append(v2);
		}
		writer.append(" in ");
		source.toDialect(writer);
		writer.append(":");
		writer.newLine();
		writer.indent();
		statements.toDialect(writer);
		writer.dedent();
	}

	private void toSDialect(CodeWriter writer) {
		writer.append("for ");
		writer.append(v1);
		if(v2!=null) {
			writer.append(", ");
			writer.append(v2);
		}
		writer.append(" in ");
		source.toDialect(writer);
		writer.append(":");
		writer.newLine();
		writer.indent();
		statements.toDialect(writer);
		writer.dedent();
	}

	@Override
	public IType check(Context context) {
		IType srcType = source.check(context);
		IType elemType = srcType.checkIterator(context);
		return checkItemIterator(elemType, context);
	}

	private IType checkItemIterator(IType elemType, Context context) {
		Context child = context.newChildContext();
		Identifier itemName = v2 == null ? v1 : v2;
		context.registerValue(new Variable(itemName, elemType));
		if (v2 != null)
			context.registerValue(new Variable(v1, IntegerType.instance()));
		return statements.check(child, null);
	}

	@Override
	public IValue interpret(Context context) throws PromptoError {
		IType srcType = source.check(context);
		IType elemType = srcType.checkIterator(context);
		return interpretItemIterator(elemType, context);
	}

	private IValue interpretItemIterator(IType elemType, Context context) throws PromptoError {
		if (v2 == null)
			return interpretItemIteratorNoIndex(elemType, context);
		else
			return interpretItemIteratorWithIndex(elemType, context);
	}

	private IValue interpretItemIteratorNoIndex(IType elemType, Context context) throws PromptoError {
		IValue src = source.interpret(context);
		Iterator<IValue> iterator = getIterator(context, src);
		while (iterator.hasNext()) {
			Context child = context.newChildContext();
			child.registerValue(new Variable(v1, elemType));
			child.setValue(v1, iterator.next());
			IValue value = statements.interpret(child);
			if (value != null)
				return value;
		}
		return null;
	}

	private IValue interpretItemIteratorWithIndex(IType elemType, Context context) throws PromptoError {
		IValue src = source.interpret(context);
		Iterator<IValue> iterator = getIterator(context, src);
		long index = 0L;
		while (iterator.hasNext()) {
			Context child = context.newChildContext();
			child.registerValue(new Variable(v2, elemType));
			child.setValue(v2, iterator.next());
			child.registerValue(new Variable(v1, IntegerType.instance()));
			child.setValue(v1, new Integer(++index));
			IValue value = statements.interpret(child);
			if (value != null)
				return value;
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	private Iterator<IValue> getIterator(Context context, Object src) {
		// start with the most specialized implementation
		if (src instanceof IIterable) 
			return ((IIterable<IValue>) src).getIterable(context).iterator();
		else if(src instanceof Iterable)
			return ((Iterable<IValue>)src).iterator();
		else if(src instanceof Iterator)
			return (Iterator<IValue>)src;
		else
			throw new InternalError("Should never get there!");
	}

	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		if(v2==null)
			return compileWithoutIndex(context, method, flags);
		else
			return compileWithIndex(context, method, flags);
	}

	private ResultInfo compileWithIndex(Context context, MethodInfo method, Flags flags) {
		java.lang.reflect.Type itemClass = source.check(context).checkIterator(context).getJavaType(context);
		StackLocal iterLocal = compileIterator(context, method, flags);
		StackLocal v1Local = compileInitCounter(method);
		// local needs to be ITEM_Top because that's what the verifier infers from INVOKEINTERFACE on Iterator.next
		StackLocal v2Local = method.registerLocal(v2.toString(), VerifierType.ITEM_Top, new ClassConstant(itemClass));
		StackState iteratorState = method.captureStackState();
		IInstructionListener test = method.addOffsetListener(new OffsetListenerConstant());
		method.activateOffsetListener(test);
		method.addInstruction(Opcode.GOTO, test);
		IInstructionListener loop = method.addOffsetListener(new OffsetListenerConstant(true));
		method.activateOffsetListener(loop);
		method.restoreFullStackState(iteratorState);
		method.placeLabel(iteratorState);
		// call next and store in v2
		CompilerUtils.compileALOAD(method, iterLocal);
		InterfaceConstant m = new InterfaceConstant(Iterator.class, "next", Object.class);
		method.addInstruction(Opcode.INVOKEINTERFACE, m);
		method.addInstruction(Opcode.CHECKCAST, new ClassConstant(itemClass));
		method.addInstruction(Opcode.ASTORE, new ByteOperand((byte)v2Local.getIndex()));
		// increment v1
		compileIncrementCounter(method, v1Local);
		// compile statements
		statements.compile(context, method, flags);
		// call hasNext
		method.inhibitOffsetListener(test);
		method.restoreFullStackState(iteratorState);
		method.placeLabel(iteratorState);
		CompilerUtils.compileALOAD(method, iterLocal);
		m = new InterfaceConstant(Iterator.class, "hasNext", boolean.class);
		method.addInstruction(Opcode.INVOKEINTERFACE, m);
		// branch if done
		method.inhibitOffsetListener(loop);
		method.addInstruction(Opcode.IFNE, loop);
		// TODO method.unregisterLocal(iterLocal.getName());
		// TODO method.unregisterLocal(v1.getName());
		// TODO method.unregisterLocal(v2.getName());
		// TODO manage return value in loop
		return new ResultInfo(void.class);
	}

	private void compileIncrementCounter(MethodInfo method, StackLocal local) {
		compileLoadCounter(method, local);
		method.addInstruction(Opcode.LCONST_1);
		method.addInstruction(Opcode.LADD);
		compileStoreCounter(method, local);
	}

	private void compileLoadCounter(MethodInfo method, StackLocal local) {
		CompilerUtils.compileALOAD(method, local);
		MethodConstant m = new MethodConstant(Long.class, "longValue", long.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, m);
	}

	private StackLocal compileInitCounter(MethodInfo method) {
		StackLocal local = method.registerLocal(v1.toString(), VerifierType.ITEM_Object, new ClassConstant(Long.class));
		method.addInstruction(Opcode.LCONST_0);
		compileStoreCounter(method, local);
		return local;
	}

	private void compileStoreCounter(MethodInfo method, StackLocal local) {
		MethodConstant m = new MethodConstant(Long.class, "valueOf", long.class, Long.class);
		method.addInstruction(Opcode.INVOKESTATIC, m);
		method.addInstruction(Opcode.ASTORE, new ByteOperand((byte)local.getIndex()));		
	}

	private ResultInfo compileWithoutIndex(Context context, MethodInfo method, Flags flags) {
		java.lang.reflect.Type itemClass = source.check(context).checkIterator(context).getJavaType(context);
		StackLocal iterLocal = compileIterator(context, method, flags);
		// local needs to be ITEM_Top because that's what the verifier infers from INVOKEINTERFACE on Iterator.next
		StackLocal v1Local = method.registerLocal(v1.toString(), VerifierType.ITEM_Top, new ClassConstant(itemClass));
		StackState iteratorState = method.captureStackState();
		IInstructionListener test = method.addOffsetListener(new OffsetListenerConstant());
		method.activateOffsetListener(test);
		method.addInstruction(Opcode.GOTO, test);
		IInstructionListener loop = method.addOffsetListener(new OffsetListenerConstant(true));
		method.activateOffsetListener(loop);
		method.restoreFullStackState(iteratorState);
		method.placeLabel(iteratorState);
		// call next and store in v1
		CompilerUtils.compileALOAD(method, iterLocal);
		InterfaceConstant m = new InterfaceConstant(Iterator.class, "next", Object.class);
		method.addInstruction(Opcode.INVOKEINTERFACE, m);
		method.addInstruction(Opcode.CHECKCAST, new ClassConstant(itemClass));
		method.addInstruction(Opcode.ASTORE, new ByteOperand((byte)v1Local.getIndex()));
		// compile statements
		statements.compile(context, method, flags);
		// call hasNext
		method.inhibitOffsetListener(test);
		method.restoreFullStackState(iteratorState);
		method.placeLabel(iteratorState);
		CompilerUtils.compileALOAD(method, iterLocal);
		m = new InterfaceConstant(Iterator.class, "hasNext", boolean.class);
		method.addInstruction(Opcode.INVOKEINTERFACE, m);
		// branch if done
		method.inhibitOffsetListener(loop);
		method.addInstruction(Opcode.IFNE, loop);
		// TODO method.unregisterLocal(iterLocal.getName());
		// TODO method.unregisterLocal(v1.getName());
		// TODO manage return value in loop
		return new ResultInfo(void.class);
	}

	private StackLocal compileIterator(Context context, MethodInfo method, Flags flags) {
		source.compile(context, method, flags);
		InterfaceConstant m = new InterfaceConstant(Iterable.class, "iterator", Iterator.class);
		method.addInstruction(Opcode.INVOKEINTERFACE, m);
		StackLocal iterLocal = method.registerLocal("%iter%", VerifierType.ITEM_Object, new ClassConstant(Iterator.class));
		method.addInstruction(Opcode.ASTORE, new ByteOperand((byte)iterLocal.getIndex()), new ClassConstant(Iterator.class));
		return iterLocal;
	}
}
