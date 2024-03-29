package prompto.debug;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import prompto.compiler.PromptoClassLoader;
import prompto.debug.event.ConnectedDebugEvent;
import prompto.debug.java.JavaDebugEventAdapterFactory;
import prompto.debug.java.JavaDebugRequestListenerFactory;
import prompto.debug.worker.IWorker;
import prompto.runtime.Standalone;
import prompto.runtime.utils.Out;
import prompto.store.NullStoreFactory;

@Ignore("Not used anymore")
public class TestRemoteThreadDebugger extends TestDebuggerVariablesBase implements IDebugEventListener {

	Thread thread;
	JavaDebugEventListener eventServer;
	String output = null;
	
	@Before
	public void before() {
		PromptoClassLoader.uninitialize();
		ProcessDebugger.reset();
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
	protected void waitWorkerSuspendedOrTerminated() throws Exception {
		Thread.sleep(10); // give time to remote thread
		WorkerStatus status = debugger.getWorkerStatus(getDebuggedThread());
		while(status!=WorkerStatus.WORKER_SUSPENDED && status!=WorkerStatus.WORKER_COMPLETED) {
			Thread.sleep(100);
			status = debugger.getWorkerStatus(getDebuggedThread());
		}
	}
	
	@Override
	protected IWorker getDebuggedThread() {
		return new OnlyRemoteThread();
	}

	@Override
	protected void start() throws Exception {
		thread.start();
		debugger = new JavaDebugRequestClient.Thread(thread, eventServer);
		waitConnected();
	}

	@Override
	protected void join() throws Exception {
		thread.join();
	}

	@Override
	protected void setDebuggedResource(String resourceName) throws Exception {
		this.eventServer = new JavaDebugEventListener(this);
		final int port = eventServer.startListening();
		this.thread = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					String args[] = new String[] { 
							"-runtimeMode", "UNITTEST",
							"-debugger-eventAdapter-factory", JavaDebugEventAdapterFactory.class.getName(),
							"-debugger-eventAdapter-port", String.valueOf(port),
							"-debugger-requestListener-factory", JavaDebugRequestListenerFactory.class.getName(),
							"-codeStore-factory", NullStoreFactory.class.getName(),
							"-applicationName", "test",
							"-resourceURLs", getResourceAsURL(resourceName).toString()
							};
					Standalone.main(args);
				} catch (Throwable t) {
					t.printStackTrace(System.err); // TODO
				}
			}
		}, "Prompto main");
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
	
	Object lock;
	
	private void waitConnected() throws InterruptedException {
		lock = new Object();
		synchronized (lock) {
			lock.wait();
		}
		lock = null;
	}


	
	@Override
	public void onConnectedEvent(ConnectedDebugEvent event) {
		((JavaDebugRequestClient)debugger).setRemote(event.getHost(), event.getPort());
		((DebugRequestClient)debugger).setConnected(true);
		synchronized (lock) {
			lock.notify();
		}		
	}
	
	@Override
	public void onProcessReadyEvent() {
	}
	
	@Override
	public void onWorkerStartedEvent(IWorker thread) {
	}

	@Override
	public void onWorkerResumedEvent(IWorker thread, ResumeReason reason) {
	}
	
	@Override
	public void onWorkerSuspendedEvent(IWorker thread, SuspendReason reason) {
	}
	
	@Override
	public void onWorkerCompletedEvent(IWorker thread) {
	}
	
	@Override
	public void onProcessTerminatedEvent() {
		this.debugger.notifyTerminated();
	}
	

}
