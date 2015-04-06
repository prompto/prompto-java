package presto.debug;

import static org.junit.Assert.assertEquals;

import java.lang.Thread.State;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.debug.Debugger;
import presto.debug.Debugger.Status;
import presto.declaration.ConcreteMethodDeclaration;
import presto.error.PrestoError;
import presto.parser.ISection;
import presto.parser.e.BaseEParserTest;
import presto.runtime.Context;
import presto.runtime.Interpreter;
import presto.runtime.Context.MethodDeclarationMap;
import presto.runtime.utils.Out;


public class TestDebugger extends BaseEParserTest {

	protected Thread thread; // in debug mode
	protected Debugger debugger;

	static final int MAIN_LINE = 1;
	static final int LEVEL_1_LINE = 5;
	static final int LEVEL_2_LINE = 9;
	
	@Before
	public void before() {
		Out.init();
	}
	
	@After
	public void after() {
		Out.restore();
	}
		
	protected void debugResource(String resourceName) throws Exception {
		loadResource(resourceName);
		debugger = new Debugger();
		final Context local = context.newLocalContext();
		local.setDebugger(debugger);
		thread = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Interpreter.interpretMainNoArgs(local);
				} catch (PrestoError e) {
					// TODO Auto-generated catch block
				}
			}
		});
		
	}
	
	void waitBlocked() throws InterruptedException {
		while(thread.getState()!=State.WAITING)
			Thread.sleep(10);
	}

	@Test
	public void testStackNoDebug() throws Exception {
		runResource("debug/stack.pec");
		assertEquals("test123-ok", Out.read());
	}

	@Test
	public void testResume() throws Exception {
		debugResource("debug/stack.pec");
		thread.start();
		waitBlocked();
		assertEquals(Status.SUSPENDED, debugger.getStatus());
		assertEquals(MAIN_LINE, debugger.getLine());
		debugger.resume();	
		thread.join();
		assertEquals("test123-ok", Out.read());
	}
	
	@Test
	public void testStepOver() throws Exception {
		debugResource("debug/stack.pec");
		thread.start();
		waitBlocked();
		assertEquals(Status.SUSPENDED, debugger.getStatus());
		assertEquals(MAIN_LINE, debugger.getLine());
		debugger.stepOver();
		waitBlocked();
		assertEquals(Status.SUSPENDED, debugger.getStatus());
		assertEquals(MAIN_LINE + 1, debugger.getLine());
		debugger.stepOver();
		waitBlocked();
		assertEquals(Status.SUSPENDED, debugger.getStatus());
		assertEquals(MAIN_LINE + 2, debugger.getLine());
		debugger.resume();	
		thread.join();
		assertEquals("test123-ok", Out.read());
	}
	
	@Test
	public void testStepInto() throws Exception {
		debugResource("debug/stack.pec");
		thread.start();
		waitBlocked();
		assertEquals(Status.SUSPENDED, debugger.getStatus());
		assertEquals(MAIN_LINE, debugger.getLine());
		debugger.stepOver();
		waitBlocked();
		assertEquals(Status.SUSPENDED, debugger.getStatus());
		assertEquals(MAIN_LINE + 1, debugger.getLine());
		debugger.stepInto(); // printLevel1
		waitBlocked();
		assertEquals(Status.SUSPENDED, debugger.getStatus());
		assertEquals(LEVEL_1_LINE, debugger.getLine());
		debugger.stepOver();
		waitBlocked();
		assertEquals(Status.SUSPENDED, debugger.getStatus());
		assertEquals(LEVEL_1_LINE + 1, debugger.getLine());
		debugger.resume();	
		thread.join();
		assertEquals("test123-ok", Out.read());
	}
	
	@Test
	public void testSilentStepInto() throws Exception {
		debugResource("debug/stack.pec");
		thread.start();
		waitBlocked();
		assertEquals(Status.SUSPENDED, debugger.getStatus());
		assertEquals(MAIN_LINE, debugger.getLine());
		debugger.stepOver();
		waitBlocked();
		assertEquals(Status.SUSPENDED, debugger.getStatus());
		assertEquals(MAIN_LINE + 1, debugger.getLine());
		debugger.stepInto(); // printLevel1
		waitBlocked();
		assertEquals(Status.SUSPENDED, debugger.getStatus());
		assertEquals(LEVEL_1_LINE, debugger.getLine());
		debugger.stepOver();
		waitBlocked();
		assertEquals(Status.SUSPENDED, debugger.getStatus());
		assertEquals(LEVEL_1_LINE + 1, debugger.getLine());
		debugger.stepInto(); // value = value + "1", should step over
		waitBlocked();
		assertEquals(Status.SUSPENDED, debugger.getStatus());
		assertEquals(LEVEL_1_LINE + 2, debugger.getLine());
		debugger.resume();	
		thread.join();
		assertEquals("test123-ok", Out.read());
	}

	
	@Test
	public void testStepOut() throws Exception {
		debugResource("debug/stack.pec");
		thread.start();
		waitBlocked();
		assertEquals(Status.SUSPENDED, debugger.getStatus());
		assertEquals(MAIN_LINE, debugger.getLine());
		debugger.stepOver();
		waitBlocked();
		assertEquals(Status.SUSPENDED, debugger.getStatus());
		assertEquals(MAIN_LINE + 1, debugger.getLine());
		debugger.stepInto(); // printLevel1
		waitBlocked();
		assertEquals(Status.SUSPENDED, debugger.getStatus());
		assertEquals(LEVEL_1_LINE, debugger.getLine());
		debugger.stepOver();
		waitBlocked();
		assertEquals(Status.SUSPENDED, debugger.getStatus());
		assertEquals(LEVEL_1_LINE + 1, debugger.getLine());
		debugger.stepOver();
		waitBlocked();
		assertEquals(Status.SUSPENDED, debugger.getStatus());
		assertEquals(LEVEL_1_LINE + 2, debugger.getLine());
		debugger.stepInto(); // printLevel2
		waitBlocked();
		assertEquals(Status.SUSPENDED, debugger.getStatus());
		assertEquals(LEVEL_2_LINE, debugger.getLine());
		debugger.stepOut(); // printLevel1
		waitBlocked();
		assertEquals(Status.SUSPENDED, debugger.getStatus());
		assertEquals(LEVEL_1_LINE + 2, debugger.getLine());
		debugger.resume();	
		thread.join();
		assertEquals("test123-ok", Out.read());
	}
	
	@Test
	public void testBreakpoint() throws Exception {
		debugResource("debug/stack.pec");
		thread.start();
		waitBlocked();
		assertEquals(Status.SUSPENDED, debugger.getStatus());
		assertEquals(MAIN_LINE, debugger.getLine());
		MethodDeclarationMap mdm = context.getRegisteredDeclaration(MethodDeclarationMap.class, "printLevel2");
		ConcreteMethodDeclaration cmd = (ConcreteMethodDeclaration)mdm.values().iterator().next();
		ISection section = cmd.getStatements().get(0);
		assertEquals(LEVEL_2_LINE + 1, section.getStart().getLine());
		section.setAsBreakpoint(true);
		debugger.resume();	
		waitBlocked();
		assertEquals(Status.SUSPENDED, debugger.getStatus());
		assertEquals(LEVEL_2_LINE + 1, debugger.getLine());
		debugger.resume();	
		thread.join();
		assertEquals("test123-ok", Out.read());
	}	

}
