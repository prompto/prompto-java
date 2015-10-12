package prompto.translate.oeo;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestResource extends BaseOParserTest {

	@Test
	public void testBadRead() throws Exception {
		compareResourceEOE("resource/badRead.poc");
	}

	@Test
	public void testBadResource() throws Exception {
		compareResourceEOE("resource/badResource.poc");
	}

	@Test
	public void testBadWrite() throws Exception {
		compareResourceEOE("resource/badWrite.poc");
	}

	@Test
	public void testReadResource() throws Exception {
		compareResourceEOE("resource/readResource.poc");
	}

	@Test
	public void testReadWithResource() throws Exception {
		compareResourceEOE("resource/readWithResource.poc");
	}

	@Test
	public void testWriteResource() throws Exception {
		compareResourceEOE("resource/writeResource.poc");
	}

	@Test
	public void testWriteWithResource() throws Exception {
		compareResourceEOE("resource/writeWithResource.poc");
	}

}

