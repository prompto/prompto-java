package prompto.debug;

import static org.junit.Assert.*;

import java.io.File;
import java.lang.Thread.State;
import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.runtime.Application;
import prompto.runtime.utils.Out;

public class TestRemoteThreadDebugger extends TestDebuggerBase {

	Thread thread;
	String output = null;
	
	@Before
	public void before() {
		output = null;
		Out.init();
	}
	
	@After
	public void after() {
		System.out.println(readOut());
		Out.restore();
	}
	
	@Override
	protected String readOut() {
		if(output==null)
			output = Out.read();
		return output;
	}
	
	@Override
	protected void waitBlockedOrKilled() throws Exception {
		State state = thread.getState();
		while(state!=State.WAITING && state!=State.TERMINATED) {
			Thread.sleep(10);
			state = thread.getState();
		}
	}

	@Override
	protected void start() throws Exception {
		thread.start();
	}

	@Override
	protected void join() throws Exception {
		thread.join();
	}

	@Override
	protected void debugResource(String resourceName) throws Exception {
		thread = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					URL url = getResourceAsURL(resourceName);
					String args[] = new String[] { 
							"-debug_port", "9999",
							"-application", "test",
							"-resources", new File(url.toURI()).getAbsolutePath()
							};
					Application.main(args);
				} catch (Throwable t) {
					t.printStackTrace(System.err); // TODO
				}
			}
		});
		this.debugger = new RemoteDebugger(new RemoteThread(thread), "localhost", 9999);
		
	}
	
	@Test
	public void testStackNoDebug() throws Exception {
		interpretResource("debug/stack.pec", false);
		assertEquals("test123-ok", readOut());
	}
}
