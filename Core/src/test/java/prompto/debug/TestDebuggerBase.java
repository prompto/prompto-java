package prompto.debug;

import static org.junit.Assert.*;

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
	
	protected abstract void debugResource(String resourceName) throws Exception;
	protected abstract void waitBlockedOrKilled() throws Exception;	
	protected abstract void start() throws Exception;
	protected abstract void join() throws Exception;
	protected abstract String readOut() throws Exception;
	
	
	int installBreakPoint(String methodName, int stmtNumber) {
		MethodDeclarationMap mdm = context.getRegisteredDeclaration(MethodDeclarationMap.class, new Identifier("printLevel2"));
		ConcreteMethodDeclaration cmd = (ConcreteMethodDeclaration)mdm.values().iterator().next();
		ISection section = cmd.getStatements().get(stmtNumber);
		section.setAsBreakpoint(true);
		debugger.installBreakpoint(section);
		return section.getStart().getLine();
	}
	

	@Test
	public void testResume() throws Exception {
		debugResource("debug/stack.pec");
		start();
		waitBlockedOrKilled();
		assertEquals(Status.SUSPENDED, debugger.getStatus(null));
		assertEquals(MAIN_LINE, debugger.getLine(null));
		assertTrue(debugger.isStepping(null));
		IStack<?> stack = debugger.getStack(null);
		assertFalse(stack.isEmpty());
		assertEquals(MAIN_LINE, stack.iterator().next().getLine());
		debugger.resume(null);	
		join();
		assertEquals("test123-ok", readOut());
	}

	
	@Test
	public void testStepOver() throws Exception {
		debugResource("debug/stack.pec");
		start();
		waitBlockedOrKilled();
		assertEquals(Status.SUSPENDED, debugger.getStatus(null));
		assertEquals(MAIN_LINE, debugger.getLine(null));
		debugger.stepOver(null);
		waitBlockedOrKilled();
		assertEquals(Status.SUSPENDED, debugger.getStatus(null));
		assertEquals(MAIN_LINE + 1, debugger.getLine(null));
		debugger.stepOver(null);
		waitBlockedOrKilled();
		assertEquals(Status.SUSPENDED, debugger.getStatus(null));
		assertEquals(MAIN_LINE + 2, debugger.getLine(null));
		debugger.resume(null);	
		join();
		assertEquals("test123-ok", readOut());
	}
	
	
	@Test
	public void testStepInto() throws Exception {
		debugResource("debug/stack.pec");
		start();
		waitBlockedOrKilled();
		assertEquals(Status.SUSPENDED, debugger.getStatus(null));
		assertEquals(MAIN_LINE, debugger.getLine(null));
		debugger.stepOver(null);
		waitBlockedOrKilled();
		assertEquals(Status.SUSPENDED, debugger.getStatus(null));
		assertEquals(MAIN_LINE + 1, debugger.getLine(null));
		debugger.stepInto(null); // printLevel1
		waitBlockedOrKilled();
		assertEquals(Status.SUSPENDED, debugger.getStatus(null));
		assertEquals(LEVEL_1_LINE, debugger.getLine(null));
		debugger.stepOver(null);
		waitBlockedOrKilled();
		assertEquals(Status.SUSPENDED, debugger.getStatus(null));
		assertEquals(LEVEL_1_LINE + 1, debugger.getLine(null));
		debugger.resume(null);	
		join();
		assertEquals("test123-ok", readOut());
	}
	
	
	@Test
	public void testSilentStepInto() throws Exception {
		debugResource("debug/stack.pec");
		start();
		waitBlockedOrKilled();
		assertEquals(Status.SUSPENDED, debugger.getStatus(null));
		assertEquals(MAIN_LINE, debugger.getLine(null));
		debugger.stepOver(null);
		waitBlockedOrKilled();
		assertEquals(Status.SUSPENDED, debugger.getStatus(null));
		assertEquals(MAIN_LINE + 1, debugger.getLine(null));
		debugger.stepInto(null); // printLevel1
		waitBlockedOrKilled();
		assertEquals(Status.SUSPENDED, debugger.getStatus(null));
		assertEquals(LEVEL_1_LINE, debugger.getLine(null));
		debugger.stepOver(null);
		waitBlockedOrKilled();
		assertEquals(Status.SUSPENDED, debugger.getStatus(null));
		assertEquals(LEVEL_1_LINE + 1, debugger.getLine(null));
		debugger.stepInto(null); // value = value + "1", should step over
		waitBlockedOrKilled();
		assertEquals(Status.SUSPENDED, debugger.getStatus(null));
		assertEquals(LEVEL_1_LINE + 2, debugger.getLine(null));
		debugger.resume(null);	
		join();
		assertEquals("test123-ok", readOut());
	}

	
	@Test
	public void testStepOut() throws Exception {
		debugResource("debug/stack.pec");
		start();
		waitBlockedOrKilled();
		assertEquals(Status.SUSPENDED, debugger.getStatus(null));
		assertEquals(MAIN_LINE, debugger.getLine(null));
		debugger.stepOver(null);
		waitBlockedOrKilled();
		assertEquals(Status.SUSPENDED, debugger.getStatus(null));
		assertEquals(MAIN_LINE + 1, debugger.getLine(null));
		debugger.stepInto(null); // printLevel1
		waitBlockedOrKilled();
		assertEquals(Status.SUSPENDED, debugger.getStatus(null));
		assertEquals(LEVEL_1_LINE, debugger.getLine(null));
		debugger.stepOver(null);
		waitBlockedOrKilled();
		assertEquals(Status.SUSPENDED, debugger.getStatus(null));
		assertEquals(LEVEL_1_LINE + 1, debugger.getLine(null));
		debugger.stepOver(null);
		waitBlockedOrKilled();
		assertEquals(Status.SUSPENDED, debugger.getStatus(null));
		assertEquals(LEVEL_1_LINE + 2, debugger.getLine(null));
		debugger.stepInto(null); // printLevel2
		waitBlockedOrKilled();
		assertEquals(Status.SUSPENDED, debugger.getStatus(null));
		assertEquals(LEVEL_2_LINE, debugger.getLine(null));
		debugger.stepOut(null); // printLevel1
		waitBlockedOrKilled();
		assertEquals(Status.SUSPENDED, debugger.getStatus(null));
		assertEquals(LEVEL_1_LINE + 2, debugger.getLine(null));
		debugger.resume(null);	
		join();
		assertEquals("test123-ok", readOut());
	}
	
	
	@Test
	public void testBreakpoint() throws Exception {
		debugResource("debug/stack.pec");
		start();
		waitBlockedOrKilled();
		assertEquals(Status.SUSPENDED, debugger.getStatus(null));
		assertEquals(MAIN_LINE, debugger.getLine(null));
		int line = installBreakPoint("printLevel2", 0);
		assertEquals(LEVEL_2_LINE + 1, line);
		debugger.resume(null);	
		waitBlockedOrKilled();
		assertEquals(Status.SUSPENDED, debugger.getStatus(null));
		assertEquals(LEVEL_2_LINE + 1, debugger.getLine(null));
		debugger.resume(null);	
		join();
		assertEquals("test123-ok", readOut());
	}


}
