package prompto.translate.oso;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestResource extends BaseOParserTest {

	@Test
	public void testReadResource() throws Exception {
		compareResourceOSO("resource/readResource.poc");
	}

	@Test
	public void testReadWithResource() throws Exception {
		compareResourceOSO("resource/readWithResource.poc");
	}

	@Test
	public void testWriteResource() throws Exception {
		compareResourceOSO("resource/writeResource.poc");
	}

	@Test
	public void testWriteWithResource() throws Exception {
		compareResourceOSO("resource/writeWithResource.poc");
	}

}

