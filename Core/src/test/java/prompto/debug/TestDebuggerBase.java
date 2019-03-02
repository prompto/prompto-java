package prompto.debug;

import static org.junit.Assert.*;

import java.util.Collection;
import java.util.Iterator;

import org.junit.Test;

import prompto.declaration.ConcreteMethodDeclaration;
import prompto.grammar.Identifier;
import prompto.parser.ISection;
import prompto.parser.e.BaseEParserTest;
import prompto.runtime.Context.MethodDeclarationMap;


public abstract class TestDebuggerBase extends BaseEParserTest {

	protected IDebugger debugger;

	static final int MAIN_LINE = 1;
	static final int LEVEL_1_LINE = 5;
	static final int LEVEL_2_LINE = 9;
	
	protected abstract void setDebuggedResource(String resourceName) throws Exception;
	protected abstract void waitSuspendedOrTerminated() throws Exception;	
	protected abstract void start() throws Exception;
	protected abstract void join() throws Exception;
	protected abstract String readOut() throws Exception;
	protected abstract IWorker getDebuggedThread();
	
	
	int installBreakPoint(String methodName, int stmtNumber) {
		MethodDeclarationMap mdm = context.getRegisteredDeclaration(MethodDeclarationMap.class, new Identifier(methodName));
		ConcreteMethodDeclaration cmd = (ConcreteMethodDeclaration)mdm.values().iterator().next();
		ISection section = cmd.getStatements().get(stmtNumber);
		section.setAsBreakpoint(true);
		debugger.installBreakpoint(section);
		return section.getStart().getLine();
	}
	

	@Test
	public void testResume() throws Exception {
		setDebuggedResource("debug/stack.pec");
		start();
		waitSuspendedOrTerminated();
		assertEquals(Status.SUSPENDED, debugger.getWorkerStatus(getDebuggedThread()));
		assertEquals(MAIN_LINE + 1, debugger.getLineInFile(getDebuggedThread()));
		assertTrue(debugger.isStepping(getDebuggedThread()));
		IStack<?> stack = debugger.getStack(getDebuggedThread());
		assertFalse(stack.isEmpty());
		assertEquals(MAIN_LINE + 1, stack.iterator().next().getInstructionLine());
		debugger.resume(getDebuggedThread());	
		join();
		assertEquals("test123-ok", readOut());
	}

	
	@Test
	public void testStepOver() throws Exception {
		setDebuggedResource("debug/stack.pec");
		start();
		waitSuspendedOrTerminated();
		assertEquals(Status.SUSPENDED, debugger.getWorkerStatus(getDebuggedThread()));
		assertEquals(MAIN_LINE + 1, debugger.getLineInFile(getDebuggedThread()));
		debugger.stepOver(getDebuggedThread());
		waitSuspendedOrTerminated();
		assertEquals(Status.SUSPENDED, debugger.getWorkerStatus(getDebuggedThread()));
		assertEquals(MAIN_LINE + 2, debugger.getLineInFile(getDebuggedThread()));
		debugger.resume(getDebuggedThread());	
		join();
		assertEquals("test123-ok", readOut());
	}
	
	
	@Test
	public void testStepInto() throws Exception {
		setDebuggedResource("debug/stack.pec");
		start();
		waitSuspendedOrTerminated();
		assertEquals(Status.SUSPENDED, debugger.getWorkerStatus(getDebuggedThread()));
		assertEquals(MAIN_LINE + 1, debugger.getLineInFile(getDebuggedThread()));
		debugger.stepInto(getDebuggedThread()); // printLevel1
		waitSuspendedOrTerminated();
		assertEquals(Status.SUSPENDED, debugger.getWorkerStatus(getDebuggedThread()));
		assertEquals(LEVEL_1_LINE + 1, debugger.getLineInFile(getDebuggedThread()));
		debugger.resume(getDebuggedThread());	
		join();
		assertEquals("test123-ok", readOut());
	}
	
	
	@Test
	public void testSilentStepInto() throws Exception {
		setDebuggedResource("debug/stack.pec");
		start();
		waitSuspendedOrTerminated();
		assertEquals(Status.SUSPENDED, debugger.getWorkerStatus(getDebuggedThread()));
		assertEquals(MAIN_LINE + 1, debugger.getLineInFile(getDebuggedThread()));
		debugger.stepInto(getDebuggedThread()); // printLevel1
		waitSuspendedOrTerminated();
		assertEquals(Status.SUSPENDED, debugger.getWorkerStatus(getDebuggedThread()));
		assertEquals(LEVEL_1_LINE + 1, debugger.getLineInFile(getDebuggedThread()));
		debugger.stepInto(getDebuggedThread()); // value = value + "1", should step over
		waitSuspendedOrTerminated();
		assertEquals(Status.SUSPENDED, debugger.getWorkerStatus(getDebuggedThread()));
		assertEquals(LEVEL_1_LINE + 2, debugger.getLineInFile(getDebuggedThread()));
		debugger.resume(getDebuggedThread());	
		join();
		assertEquals("test123-ok", readOut());
	}

	
	@Test
	public void testStepOut() throws Exception {
		setDebuggedResource("debug/stack.pec");
		start();
		waitSuspendedOrTerminated();
		assertEquals(Status.SUSPENDED, debugger.getWorkerStatus(getDebuggedThread()));
		assertEquals(MAIN_LINE + 1, debugger.getLineInFile(getDebuggedThread()));
		debugger.stepInto(getDebuggedThread()); // printLevel1
		waitSuspendedOrTerminated();
		assertEquals(Status.SUSPENDED, debugger.getWorkerStatus(getDebuggedThread()));
		assertEquals(LEVEL_1_LINE + 1, debugger.getLineInFile(getDebuggedThread()));
		debugger.stepOver(getDebuggedThread());
		waitSuspendedOrTerminated();
		assertEquals(Status.SUSPENDED, debugger.getWorkerStatus(getDebuggedThread()));
		assertEquals(LEVEL_1_LINE + 2, debugger.getLineInFile(getDebuggedThread()));
		debugger.stepInto(getDebuggedThread()); // printLevel2
		waitSuspendedOrTerminated();
		assertEquals(Status.SUSPENDED, debugger.getWorkerStatus(getDebuggedThread()));
		assertEquals(LEVEL_2_LINE + 1, debugger.getLineInFile(getDebuggedThread()));
		debugger.stepOut(getDebuggedThread()); // printLevel1
		waitSuspendedOrTerminated();
		assertEquals(Status.SUSPENDED, debugger.getWorkerStatus(getDebuggedThread()));
		assertEquals(LEVEL_1_LINE + 2, debugger.getLineInFile(getDebuggedThread()));
		debugger.resume(getDebuggedThread());	
		join();
		assertEquals("test123-ok", readOut());
	}
	
	
	@Test
	public void testBreakpoint() throws Exception {
		setDebuggedResource("debug/stack.pec");
		start();
		waitSuspendedOrTerminated();
		assertEquals(Status.SUSPENDED, debugger.getWorkerStatus(getDebuggedThread()));
		assertEquals(MAIN_LINE + 1, debugger.getLineInFile(getDebuggedThread()));
		int line = installBreakPoint("printLevel2", 0);
		assertEquals(LEVEL_2_LINE + 1, line);
		debugger.resume(getDebuggedThread());	
		waitSuspendedOrTerminated();
		assertEquals(Status.SUSPENDED, debugger.getWorkerStatus(getDebuggedThread()));
		assertEquals(LEVEL_2_LINE + 1, debugger.getLineInFile(getDebuggedThread()));
		debugger.resume(getDebuggedThread());	
		join();
		assertEquals("test123-ok", readOut());
	}
	
	@Test
	public void testVariables() throws Exception {
		setDebuggedResource("debug/variables.pec");
		start();
		waitSuspendedOrTerminated();
		assertEquals(Status.SUSPENDED, debugger.getWorkerStatus(getDebuggedThread()));
		// main method, doc = ...
		IStack<?> stack = debugger.getStack(getDebuggedThread());
		IStackFrame frame = stack.iterator().next();
		Collection<? extends IVariable> vars = frame.getVariables();
		assertEquals(0, vars.size());
		// over doc = ..., to printLevel1 "test"
		debugger.stepOver(getDebuggedThread());
		waitSuspendedOrTerminated();
		stack = debugger.getStack(getDebuggedThread());
		frame = stack.iterator().next();
		vars = frame.getVariables();
		assertEquals(1, vars.size());
		IVariable var = debugger.getVariable(getDebuggedThread(), frame, "doc");
		assertNotNull(var);
		Object value = var.getValue();
		assertNotNull(value);
		Object data = var.getValue().getValueData();
		assertNotNull(data);
		// into printLevel1 "test"
		debugger.stepInto(getDebuggedThread());
		waitSuspendedOrTerminated();
		// printLevel1, value = value + "1"
		stack = debugger.getStack(getDebuggedThread());
		frame = stack.iterator().next();
		vars = frame.getVariables();	
		assertEquals(1, vars.size());
		var = vars.iterator().next();
		assertEquals("value", var.getName());
		assertEquals("Text", var.getTypeName());
		assertEquals("test", var.getValue().getValueString());
		// next, other = "other"
		debugger.stepOver(getDebuggedThread());
		waitSuspendedOrTerminated();
		stack = debugger.getStack(getDebuggedThread());
		frame = stack.iterator().next();
		vars = frame.getVariables();	
		assertEquals(1, vars.size());
		var = vars.iterator().next();
		assertEquals("value", var.getName());
		assertEquals("Text", var.getTypeName());
		assertEquals("test1", var.getValue().getValueString());
		// next, value = value + other
		debugger.stepOver(getDebuggedThread());
		waitSuspendedOrTerminated();
		stack = debugger.getStack(getDebuggedThread());
		frame = stack.iterator().next();
		vars = frame.getVariables();	
		assertEquals(2, vars.size());
		Iterator<? extends IVariable> iter = vars.iterator();
		var = iter.next();
		assertEquals("value", var.getName());
		assertEquals("Text", var.getTypeName());
		assertEquals("test1", var.getValue().getValueString());
		var = iter.next();
		assertEquals("other", var.getName());
		assertEquals("Text", var.getTypeName());
		assertEquals("other", var.getValue().getValueString());
		// next, printLevel2 value
		debugger.stepOver(getDebuggedThread());
		waitSuspendedOrTerminated();
		stack = debugger.getStack(getDebuggedThread());
		frame = stack.iterator().next();
		vars = frame.getVariables();	
		assertEquals(2, vars.size());
		iter = vars.iterator();
		var = iter.next();
		assertEquals("value", var.getName());
		assertEquals("Text", var.getTypeName());
		assertEquals("test1other", var.getValue().getValueString());
		var = iter.next();
		assertEquals("other", var.getName());
		assertEquals("Text", var.getTypeName());
		assertEquals("other", var.getValue().getValueString());
		debugger.resume(getDebuggedThread());
		join();
		assertEquals("test1other2stuff3-ok", readOut());
	}


}
