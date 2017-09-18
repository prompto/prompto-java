package prompto.runtime;

import static org.junit.Assert.*;

import java.io.File;
import java.nio.file.Path;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import prompto.nullstore.NullStoreFactory;
import prompto.parser.e.BaseEParserTest;
import prompto.runtime.utils.Out;
import prompto.utils.IOUtils;
import prompto.utils.ManualTests;

@Category(ManualTests.class)
public class TestApplication extends BaseEParserTest {

	@Test
	public void testLibraryApplication() throws Throwable {
		File testFile = tryLocateTestFile("debug/stack.pec");
		loadFile(testFile); 
		String[] args = new String[] {
				"-applicationName", "test", 
				"-resourceURLs", "\"" + testFile.toURI().toURL() + "\"",
				"-loadRuntime", "false"
		};
		Out.init();
		try {
			Standalone.main(args);
			assertEquals("test123-ok", readLastLine(Out.read()));
		} finally {
			Out.restore();
		}
	}

	@Test
	public void testLocalRunApplication() throws Throwable {
		File testFile = tryLocateTestFile("debug/stack.pec");
		loadFile(testFile); 
		String[] args = new String[] {
				"-codeStoreFactory", NullStoreFactory.class.getName(),
				"-applicationName", "test", 
				"-resourceURLs", "\"" + testFile.toURI().toURL() + "\""
		};
		Out.init();
		try {
			Standalone.main(args);
			assertEquals("test123-ok", readLastLine(Out.read()));
		} finally {
			Out.restore();
		}
	}

	@Test
	public void testRemoteRunApplication() throws Exception {
		File testFile = tryLocateTestFile("debug/stack.pec");
		loadFile(testFile); 
		ProcessBuilder builder = new ProcessBuilder();
		File targetDir = getDistributionFolder("0.0.1-SNAPSHOT").toFile();
		assertTrue(targetDir.getAbsolutePath(), targetDir.exists());
		System.err.println("Distribution: " + targetDir.getAbsolutePath());
		builder.directory(targetDir);
		File outputFile = File.createTempFile("output-", ".txt");
		System.err.println("Output: " + outputFile.getAbsolutePath());
		builder.redirectOutput(outputFile);
		builder.command("java", 
				"-jar", "Standalone-0.0.1-SNAPSHOT.jar", 
				"-codeStoreFactory", NullStoreFactory.class.getName(),
				"-application", "test", 
				"-resources", "\"" + testFile.getAbsolutePath() + "\"");
		Process process = builder.start();
		process.waitFor();
		assertEquals("test123-ok", readLastLine(IOUtils.readFileToString(outputFile)));
	}
	
	
	@Test
	public void testLocalRunOneTest() throws Throwable {
		File testFile = tryLocateTestFile("testing/positive.pec");
		loadFile(testFile); 
		String[] args = new String[] {
				"-codeStoreFactory", NullStoreFactory.class.getName(),
				"-test", "\"Add two numbers\"", 
				"-resources", "\"" + testFile.getAbsolutePath() + "\""
		};
		Out.init();
		try {
			Standalone.main(args);
			assertEquals("\"Add two numbers\" test successful", readLastLine(Out.read()));
		} finally {
			Out.restore();
		}
	}

	
	@Test
	public void testRemoteRunOneTest() throws Exception {
		File testFile = tryLocateTestFile("testing/positive.pec");
		loadFile(testFile); 
		ProcessBuilder builder = new ProcessBuilder();
		File targetDir = getDistributionFolder("0.0.1-SNAPSHOT").toFile();
		assertTrue(targetDir.getAbsolutePath(), targetDir.exists());
		System.err.println("Distribution: " + targetDir.getAbsolutePath());
		builder.directory(targetDir);
		File outputFile = File.createTempFile("output-", ".txt");
		System.err.println("Output: " + outputFile.getAbsolutePath());
		builder.redirectOutput(outputFile);
		builder.command("java", 
				"-jar", "Standalone-0.0.1-SNAPSHOT.jar", 
				"-codeStoreFactory", NullStoreFactory.class.getName(),
				"-test", "\"Add two numbers\"", 
				"-resourceURLs", "\"" + testFile.toURI().toURL() + "\"");
		Process process = builder.start();
		process.waitFor();
		assertEquals("\"Add two numbers\" test successful", readLastLine(IOUtils.readFileToString(outputFile)));
	}

	private String readLastLine(String output) {
		String[] lines = output.split("\n");
		return lines.length>0 ? lines[lines.length-1] : "";
	}

	private Path getDistributionFolder(String version) {
		File dest = new File(System.getProperty("java.io.tmpdir"), "Prompto/Java/" + version + "/");
		dest.mkdirs();
		return dest.toPath();
	}

}
