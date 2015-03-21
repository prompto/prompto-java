package presto.translate.eoe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestResource extends BaseEParserTest {

	@Test
	public void testBadRead() throws Exception {
		compareResourceEOE("resource/badRead.e");
	}

	@Test
	public void testBadResource() throws Exception {
		compareResourceEOE("resource/badResource.e");
	}

	@Test
	public void testBadWrite() throws Exception {
		compareResourceEOE("resource/badWrite.e");
	}

	@Test
	public void testReadResource() throws Exception {
		compareResourceEOE("resource/readResource.e");
	}

	@Test
	public void testReadWithResource() throws Exception {
		compareResourceEOE("resource/readWithResource.e");
	}

	@Test
	public void testWriteResource() throws Exception {
		compareResourceEOE("resource/writeResource.e");
	}

	@Test
	public void testWriteWithResource() throws Exception {
		compareResourceEOE("resource/writeWithResource.e");
	}

}

