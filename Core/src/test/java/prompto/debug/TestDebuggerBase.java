package prompto.debug;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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
		assertEquals(MAIN_LINE + 1, stack.iterator().next().getStatementLine());
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
	


}
