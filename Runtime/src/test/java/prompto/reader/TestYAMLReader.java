package prompto.reader;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

import prompto.intrinsic.PromptoDocument;
import prompto.intrinsic.PromptoList;
import prompto.utils.ResourceUtils;
import prompto.writer.YAMLWriter;

public class TestYAMLReader {

	@Test
	public void testRoundtrip() throws IOException {
		String yaml1 = ResourceUtils.getResourceAsString("samples/configSample.yml");
		PromptoList<PromptoDocument<String,Object>> docs1 = YAMLReader.read(yaml1);
		String yaml2 = YAMLWriter.write(docs1);
		// assertEquals(yaml1, yaml2); not possible to compare
		Object docs2 = YAMLReader.read(yaml2);
		assertEquals(docs1, docs2);
	}

}
