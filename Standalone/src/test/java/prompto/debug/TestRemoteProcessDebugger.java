package prompto.debug;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

import org.junit.After;
import org.junit.Before;
import org.junit.experimental.categories.Category;

import prompto.store.NullStoreFactory;
import prompto.utils.IOUtils;
import prompto.utils.ManualTests;

// excluded from CI because it can only run with the jars installed (- mvn install -skipTests°
@Category(ManualTests.class)
public class TestRemoteProcessDebugger extends TestDebuggerBase implements IDebugEventListener {

	JavaDebugEventListener eventServer;
	ProcessBuilder builder;
	Process process;
	File outputFile;
	File errorsFile;
	
	@Before
	public void before() {
		errorsFile = null;
		outputFile = null;
	}
	
	@After
	public void after() throws Exception {
		System.err.println(IOUtils.readFileToString(errorsFile));
		System.out.println(IOUtils.readFileToString(outputFile));
		process.destroy();
	}
	
	@Override
	protected String readOut() throws IOException {
		String output = IOUtils.readFileToString(outputFile);
		String[] lines = output.split("\n");
		return lines.length>0 ? lines[lines.length-1] : "";
	}
	
	
	@Override
	protected void waitSuspendedOrTerminated() throws Exception {
		Status status = debugger.getWorkerStatus(null);
		while(status!=Status.SUSPENDED && status!=Status.TERMINATED) {
			Thread.sleep(100);
			status = debugger.getWorkerStatus(null);
		}
	}

	@Override
	protected void start() throws Exception {
		process = builder.start();
		debugger = new JavaDebugRequestClient(process, eventServer);
		waitConnected();
	}


	@Override
	protected void join() throws Exception {
		process.waitFor();
	}
	
	@Override
	protected IWorker getDebuggedThread() {
		return new OnlyRemoteThread();
	}

	@Override
	protected void setDebuggedResource(String resourceName) throws Exception {
		this.eventServer = new JavaDebugEventListener(this);
		final int port = eventServer.startListening();
		builder = new ProcessBuilder();
		File targetDir = getDistributionFolder("0.0.1-SNAPSHOT").toFile();
		assertTrue(targetDir.getAbsolutePath(), targetDir.exists());
		builder.directory(targetDir);
		errorsFile = File.createTempFile("errors-", ".txt");
		System.err.println("Errors: " + errorsFile.getAbsolutePath());
		builder.redirectError(errorsFile);
		outputFile = File.createTempFile("output-", ".txt");
		System.err.println("Output: " + outputFile.getAbsolutePath());
		builder.redirectOutput(outputFile);
		builder.command("java", 
				"-jar", "Standalone-0.0.1-SNAPSHOT.jar", 
				"-runtimeMode", "UNITTEST",
				"-debugger-eventAdapter-factory", JavaDebugEventAdapterFactory.class.getName(),
				"-debugger-eventAdapter-port", String.valueOf(port),
				"-debugger-requestListener-factory", JavaDebugRequestListenerFactory.class.getName(),
				"-codeStore-factory", NullStoreFactory.class.getName(),
				"-applicationName", "test", 
				"-resourceURLs", getResourceAsURL(resourceName).toString());
}

	private Path getDistributionFolder(String version) {
		File dest = new File(System.getProperty("java.io.tmpdir"), "Prompto/Java/" + version + "/");
		dest.mkdirs();
		return dest.toPath();
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
	public void handleConnectedEvent(IDebugEvent.Connected event) {
		((JavaDebugRequestClient)debugger).setRemote(event.getHost(), event.getPort());
		((DebugRequestClient)debugger).setConnected(true);
		synchronized (lock) {
			lock.notify();
		}		
	}

	
	@Override
	public void handleStartedEvent(IWorker thread) {
	}
	
	@Override
	public void handleResumedEvent(IWorker thread, ResumeReason reason) {
	}
	
	@Override
	public void handleSuspendedEvent(IWorker thread, SuspendReason reason) {
	}
	
	@Override
	public void handleCompletedEvent(IWorker thread) {
	}
	
	@Override
	public void handleTerminatedEvent() {
		this.debugger.notifyTerminated();
	};
}
