package prompto.translate.oeo;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestResource extends BaseOParserTest {

	@Test
	public void testReadInDoWhile() throws Exception {
		compareResourceOEO("resource/readInDoWhile.poc");
	}

	@Test
	public void testReadInForEach() throws Exception {
		compareResourceOEO("resource/readInForEach.poc");
	}

	@Test
	public void testReadInIf() throws Exception {
		compareResourceOEO("resource/readInIf.poc");
	}

	@Test
	public void testReadInWhile() throws Exception {
		compareResourceOEO("resource/readInWhile.poc");
	}

	@Test
	public void testReadResource() throws Exception {
		compareResourceOEO("resource/readResource.poc");
	}

	@Test
	public void testReadResourceThen() throws Exception {
		compareResourceOEO("resource/readResourceThen.poc");
	}

	@Test
	public void testReadWithResource() throws Exception {
		compareResourceOEO("resource/readWithResource.poc");
	}

	@Test
	public void testWriteResource() throws Exception {
		compareResourceOEO("resource/writeResource.poc");
	}

	@Test
	public void testWriteResourceThen() throws Exception {
		compareResourceOEO("resource/writeResourceThen.poc");
	}

	@Test
	public void testWriteWithResource() throws Exception {
		compareResourceOEO("resource/writeWithResource.poc");
	}

}

