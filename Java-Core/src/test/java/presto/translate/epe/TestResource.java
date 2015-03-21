package presto.translate.epe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestResource extends BaseEParserTest {

	@Test
	public void testBadRead() throws Exception {
		compareResourceEPE("resource/badRead.e");
	}

	@Test
	public void testBadResource() throws Exception {
		compareResourceEPE("resource/badResource.e");
	}

	@Test
	public void testBadWrite() throws Exception {
		compareResourceEPE("resource/badWrite.e");
	}

	@Test
	public void testReadResource() throws Exception {
		compareResourceEPE("resource/readResource.e");
	}

	@Test
	public void testReadWithResource() throws Exception {
		compareResourceEPE("resource/readWithResource.e");
	}

	@Test
	public void testWriteResource() throws Exception {
		compareResourceEPE("resource/writeResource.e");
	}

	@Test
	public void testWriteWithResource() throws Exception {
		compareResourceEPE("resource/writeWithResource.e");
	}

}

