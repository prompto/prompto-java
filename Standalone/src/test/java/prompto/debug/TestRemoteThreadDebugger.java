package prompto.debug;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.Thread.State;
import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.nullstore.NullStoreFactory;
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
		Out.restore();
	}
	
	@Override
	protected String readOut() {
		if(output==null) {
			String[] lines = Out.read().split("\n");
			output = lines.length>0 ? lines[lines.length-1] : "";
		}
		return output;
	}
	
	@Override
	protected void waitBlockedOrKilled() throws Exception {
		Thread.sleep(100);
		State state = thread.getState();
		while(state!=State.WAITING && state!=State.TERMINATED) {
			Thread.sleep(100);
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
							"-testMode", "true",
							"-debug_port", "9999",
							"-codeStoreFactory", NullStoreFactory.class.getName(),
							"-application", "test",
							"-resources", new File(url.toURI()).getAbsolutePath()
							};
					Application.main(args);
				} catch (Throwable t) {
					t.printStackTrace(System.err); // TODO
				}
			}
		}, "Prompto main");
		this.debugger = new RemoteDebugger(new RemoteThread(thread), "localhost", 9999);
		
	}
	
	@Test
	public void testStackNoDebug() throws Exception {
		interpretResource("debug/stack.pec", false);
		assertEquals("test123-ok", readOut());
	}
	
	@Override
	public URL tryGetCoreResource(String resourceName) throws Exception {
		File file = tryLocateCoreFile(resourceName);
		if(file!=null)
			return file.toURI().toURL();
		else
			return null;
	}
	
	public File tryLocateCoreFile(String resourceName) throws FileNotFoundException {
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		String dirPath = loader.getResource("").getFile();
		int idx = dirPath.lastIndexOf("/Standalone/");
		if(idx<0)
			return null;
		String libsPath = dirPath.substring(0, idx) + "/Core/";
		File file = new File(libsPath + resourceName);
		if(file.exists())
			return file;
		else
			return null;
	}
	

}
