package prompto.translate.omo;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestResource extends BaseOParserTest {

	@Test
	public void testReadInDoWhile() throws Exception {
		compareResourceOMO("resource/readInDoWhile.poc");
	}

	@Test
	public void testReadInForEach() throws Exception {
		compareResourceOMO("resource/readInForEach.poc");
	}

	@Test
	public void testReadInIf() throws Exception {
		compareResourceOMO("resource/readInIf.poc");
	}

	@Test
	public void testReadInWhile() throws Exception {
		compareResourceOMO("resource/readInWhile.poc");
	}

	@Test
	public void testReadResource() throws Exception {
		compareResourceOMO("resource/readResource.poc");
	}

	@Test
	public void testReadResourceThen() throws Exception {
		compareResourceOMO("resource/readResourceThen.poc");
	}

	@Test
	public void testReadWithResource() throws Exception {
		compareResourceOMO("resource/readWithResource.poc");
	}

	@Test
	public void testWriteResource() throws Exception {
		compareResourceOMO("resource/writeResource.poc");
	}

	@Test
	public void testWriteResourceThen() throws Exception {
		compareResourceOMO("resource/writeResourceThen.poc");
	}

	@Test
	public void testWriteWithResource() throws Exception {
		compareResourceOMO("resource/writeWithResource.poc");
	}

}

