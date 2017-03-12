package prompto.reader;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import prompto.reader.JSONReader;
import prompto.utils.ResourceUtils;

public class TestJSONReader {

	@Test
	public void testRoundtrip() throws IOException {
		String json1 = ResourceUtils.getResourceAsString("samples/gitPushSample.json");
		Object obj1 = JSONReader.read(json1);
		String json2 = obj1.toString();
		Object obj2 = JSONReader.read(json2);
		assertEquals(obj1, obj2);
	}
}
