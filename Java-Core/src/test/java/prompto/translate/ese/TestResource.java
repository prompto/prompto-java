package prompto.translate.ese;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestResource extends BaseEParserTest {

	@Test
	public void testBadRead() throws Exception {
		compareResourceEOE("resource/badRead.pec");
	}

	@Test
	public void testBadResource() throws Exception {
		compareResourceEOE("resource/badResource.pec");
	}

	@Test
	public void testBadWrite() throws Exception {
		compareResourceEOE("resource/badWrite.pec");
	}

	@Test
	public void testReadResource() throws Exception {
		compareResourceEOE("resource/readResource.pec");
	}

	@Test
	public void testReadWithResource() throws Exception {
		compareResourceEOE("resource/readWithResource.pec");
	}

	@Test
	public void testWriteResource() throws Exception {
		compareResourceEOE("resource/writeResource.pec");
	}

	@Test
	public void testWriteWithResource() throws Exception {
		compareResourceEOE("resource/writeWithResource.pec");
	}

}

