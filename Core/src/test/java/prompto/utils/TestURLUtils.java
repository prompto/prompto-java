package prompto.utils;

import static org.junit.Assert.assertEquals;

import java.net.URL;

import org.junit.Test;

public class TestURLUtils {

	@Test
	public void getFileNameFromJARUrl() throws Exception {
		URL fileURL = new URL("jar:file:///C:/proj/parser/jar/parser.jar!/test.xml");
		String fileName = URLUtils.extractFileName(fileURL);
		assertEquals("test.xml", fileName);
	}
}
