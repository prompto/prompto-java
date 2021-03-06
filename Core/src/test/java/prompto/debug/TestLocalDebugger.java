package prompto.debug;

import static org.junit.Assert.assertEquals;

import java.lang.Thread.State;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.debug.ProcessDebugger.DebuggedWorker;
import prompto.debug.worker.IWorker;
import prompto.error.PromptoError;
import prompto.runtime.Context;
import prompto.runtime.Interpreter;
import prompto.runtime.utils.Out;

public class TestLocalDebugger extends TestDebuggerVariablesBase {

	protected Thread thread; // in debug mode

	@Before
	public void before() {
		Out.init();
	}
	
	@After
	public void after() {
		Out.restore();
	}
	
	@Override
	protected String readOut() {
		return Out.read();
	}
	
	@Override
	protected void start() {
		thread.start();
	}
	
	@Override
	protected void join() throws InterruptedException {
		thread.join();
	}

	@Override
	protected void waitWorkerSuspendedOrTerminated() throws InterruptedException {
		State state = thread.getState();
		while(state!=State.WAITING && state!=State.TERMINATED) {
			Thread.sleep(10);
			state = thread.getState();
		}
	}

	@Override
	protected void setDebuggedResource(String resourceName) throws Exception {
		loadResource(resourceName);
		ProcessDebugger processDebugger = ProcessDebugger.getInstance();
		if(processDebugger==null)
			processDebugger = ProcessDebugger.createInstance(context);
		WorkerDebugger threadDebugger = new WorkerDebugger();
		final Context local = context.newLocalContext();
		local.setDebugger(threadDebugger);
		threadDebugger.stepInto();
		thread = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Interpreter.interpretMainNoArgs(local);
				} catch (PromptoError e) {
					// TODO Auto-generated catch block
				}
			}
		});
		processDebugger.register(thread, threadDebugger);
		this.debugger = processDebugger;
	}
	
	@Override
	protected IWorker getDebuggedThread() {
		return DebuggedWorker.wrap(thread);
	}
	
	@Test
	public void testStackNoDebug() throws Exception {
		interpretResource("debug/stack.pec", false);
		assertEquals("test123-ok", readOut());
	}



}
