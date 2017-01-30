package prompto.debug;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.ProcessBuilder.Redirect;
import java.nio.file.Path;

import org.junit.After;
import org.junit.Before;
import org.junit.experimental.categories.Category;

import prompto.nullstore.NullStoreFactory;
import prompto.utils.ManualTests;

@Category(ManualTests.class)
public class TestRemoteProcessDebugger extends TestDebuggerBase implements IDebugEventListener {

	ProcessBuilder builder;
	Process process;
	File outputFile;
	File errorsFile;
	
	@Before
	public void before() {
		outputFile = null;
	}
	
	@After
	public void after() throws Exception {
		System.err.println(readFile(errorsFile));
		System.out.println(readFile(outputFile));
		process.destroy();
	}
	
	@Override
	protected String readOut() throws IOException {
		String output = readFile(outputFile);
		String[] lines = output.split("\n");
		return lines.length>0 ? lines[lines.length-1] : "";
	}
	
	
	private String readFile(File file) throws IOException {
		char[] chars = new char[2048];
		StringBuilder sb = new StringBuilder();
		try(Reader reader = new FileReader(file)) {
			int read = reader.read(chars);
			while(read>=0) {
				sb.append(chars, 0, read);
				read = reader.read(chars);
			}
		}
		return sb.toString();
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
		debugger = new DebugRequestClient(new RemoteProcess(process), "localhost", 9999, this);
		debugger.connect();
	}


	@Override
	protected void join() throws Exception {
		process.waitFor();
	}

	protected void debugResource(String resourceName) throws Exception {
		File testFile = tryLocateTestFile(resourceName);
		builder = new ProcessBuilder();
		File targetDir = getDistributionFolder("0.0.1-SNAPSHOT").toFile();
		assertTrue(targetDir.getAbsolutePath(), targetDir.exists());
		builder.directory(targetDir);
		errorsFile = File.createTempFile("errors-", ".txt");
		builder.redirectError(errorsFile);
		outputFile = File.createTempFile("output-", ".txt");
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
