package prompto.runtime;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

import prompto.runtime.utils.Out;

public class TestAddOns {

	@Test
	public void testThatAddOnsAreLoaded() throws Throwable {
		String path = System.getProperty("user.home") + "/.m2/repository/org/prompto/AwsClient/0.0.1-SNAPSHOT/AwsClient-0.0.1-SNAPSHOT.jar";
		File jar = new File(path);
		if(!jar.exists())
			return;
		String addOns = getAwsAddOns(jar);
		URL url = Thread.currentThread().getContextClassLoader().getResource("awsClient.pec");
		String[] args = new String[] {
				"-applicationName", "test", 
				"-runtimeMode", "UNITTEST", 
				"-resourceURLs", "\"" + url.toExternalForm() + "\"",
				"-addOnURLs", "\"" + addOns + "\"",
				"-loadRuntime", "true"
		};
		Out.init();
		try {
			Standalone.main(args);
			assertEquals("ok", readLastLine(Out.read()));
		} finally {
			Out.restore();
		}
		
	}
	
	private String getAwsAddOns(File clientJar) {
		return Stream.of(
				clientJar,
				new File(System.getProperty("user.home") + "/.m2/repository/org/apache/httpcomponents/httpclient/4.5.2/httpclient-4.5.2.jar"),
				new File(System.getProperty("user.home") + "/.m2/repository/org/apache/httpcomponents/httpcore/4.4.4/httpcore-4.4.4.jar"),
				new File(System.getProperty("user.home") + "/.m2/repository/commons-logging/commons-logging/1.1.3/commons-logging-1.1.3.jar"),
				new File(System.getProperty("user.home") + "/.m2/repository/com/amazonaws/aws-java-sdk-ec2/1.11.104/aws-java-sdk-ec2-1.11.104.jar"),
				new File(System.getProperty("user.home") + "/.m2/repository/com/amazonaws/aws-java-sdk-core/1.11.104/aws-java-sdk-core-1.11.104.jar"))
				.map(File::toURI)
				.map((u)->{try { return u.toURL(); } catch (IOException e) { throw new RuntimeException(e); }})
				.map(URL::toExternalForm)
				.collect(Collectors.joining(","));
	}

	private String readLastLine(String output) {
		String[] lines = output.split("\n");
		return lines.length>0 ? lines[lines.length-1] : "";
	}


}
