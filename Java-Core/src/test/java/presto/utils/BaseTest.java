package presto.utils;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BaseTest {

	public String getResourceAsString(String resourceName) throws Exception {
		char[] data = new char[4096];
		InputStream stream = getResourceAsStream(resourceName);
		Reader reader = new InputStreamReader(stream);
		StringBuffer buffer = new StringBuffer();
		for(;;) {
			int read = reader.read(data);
			if(read==-1)
				break;
			buffer.append(data, 0, read);
		}
		stream.close();
		return buffer.toString();
	}

	public InputStream getResourceAsStream(String resourceName) throws Exception {
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		InputStream stream = loader.getResourceAsStream(resourceName);
		if(stream==null) {
			String dirPath = loader.getResource("").getFile();
			String testsPath = dirPath.substring(0, dirPath.lastIndexOf("/presto-java/Java-Core/")) + "/presto-tests/Tests/resources/";
			stream = new FileInputStream(testsPath + resourceName);
		}
		return stream;
	}

}
