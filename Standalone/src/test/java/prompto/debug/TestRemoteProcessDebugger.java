package prompto.debug;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

import org.junit.After;
import org.junit.Before;
import org.junit.experimental.categories.Category;

import prompto.nullstore.NullStoreFactory;
import prompto.utils.IOUtils;
import prompto.utils.ManualTests;

@Category(ManualTests.class)
public class TestRemoteProcessDebugger extends TestDebuggerBase implements IDebugEventListener {

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
	protected void waitBlockedOrKilled() throws Exception {
		Status status = debugger.getStatus();
		while(status!=Status.SUSPENDED && status!=Status.TERMINATED) {
			Thread.sleep(100);
			status = debugger.getStatus();
		}
	}

	@Override
	protected void start() throws Exception {
		process = builder.start();
		debugger = new DebugRequestClient(process, "localhost", 9999, this);
		debugger.connect();
	}


	@Override
	protected void join() throws Exception {
		process.waitFor();
	}

	protected void debugResource(String resourceName) throws Exception {
		File testFile = tryLocateTestFile(resourceName);
		loadFile(testFile); 
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
				"-debug_port", "9999", 
				"-codeStoreFactory", NullStoreFactory.class.getName(),
				"-application", "test", 
				"-resources", "\"" + testFile.getAbsolutePath() + "\"");
	}

	private Path getDistributionFolder(String version) {
		File dest = new File(System.getProperty("java.io.tmpdir"), "Prompto/Java/" + version + "/");
		dest.mkdirs();
		return dest.toPath();
	}

	@Override
	public void handleResumedEvent(ResumeReason reason) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void handleSuspendedEvent(SuspendReason reason) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void handleTerminatedEvent() {
		this.debugger.notifyTerminated();
	};
}
