package prompto.debug;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;

import static org.junit.Assert.*;

import com.fasterxml.jackson.core.util.ByteArrayBuilder;

@Ignore("Need to manage class path to let this run in CI")
public class TestRemoteProcessDebugger extends TestDebuggerBase implements IDebugEventListener {

	ProcessBuilder builder;
	Process process;
	InputStream output;
	String message;
	
	@Before
	public void before() {
		message = null;
	}
	
	@After
	public void after() throws Exception {
		System.out.println(readOut());
		process.destroy();
	}
	
	@Override
	protected void waitBlockedOrKilled() throws Exception {
		Status status = debugger.getStatus();
		while(status!=Status.SUSPENDED && process.isAlive()) {
			Thread.sleep(10);
			status = debugger.getStatus();
		}
	}

	@Override
	protected void start() throws Exception {
		process = builder.start();
		output = process.getInputStream();
		debugger = new DebugRequestClient(new RemoteProcess(process), "localhost", 9999, this);
	}

	@Override
	protected void join() throws Exception {
		process.waitFor();
	}

	@Override
	protected String readOut() throws IOException {
		if(message==null)
			message = readOutput();
		return message;
	}
	
	protected String readOutput() throws IOException {
		try(ByteArrayBuilder array = new ByteArrayBuilder()) {
			byte[] bytes = new byte[0x10000];
			int read = output.read(bytes);
			while(read>=0) {
				array.write(bytes, 0, read);
				read = output.read(bytes);
			}
			return new String(array.toByteArray());
		}
	}

	protected void debugResource(String resourceName) throws Exception {
		File testFile = tryLocateTestFile(resourceName);
		builder = new ProcessBuilder();
		File targetDir = new File("../../target/");
		assertTrue(targetDir.getAbsolutePath(), targetDir.exists());
		builder.directory(targetDir);
		builder.command("java", 
				// "-Xdebug", "-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=1044",
				"-jar", "Core-1.0.0-SNAPSHOT.jar", 
				"-debug_port", "9999", 
				"-resource", "\"" + testFile.getAbsolutePath() + "\"");
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
		// TODO Auto-generated method stub
		
	};
}
