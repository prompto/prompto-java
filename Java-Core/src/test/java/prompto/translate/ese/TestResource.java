// generated: 2015-07-05T23:01:01.083
package prompto.translate.ese;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestResource extends BaseEParserTest {

	@Test
	public void testBadRead() throws Exception {
		compareResourceESE("resource/badRead.pec");
	}

	@Test
	public void testBadResource() throws Exception {
		compareResourceESE("resource/badResource.pec");
	}

	@Test
	public void testBadWrite() throws Exception {
		compareResourceESE("resource/badWrite.pec");
	}

	@Test
	public void testReadResource() throws Exception {
		compareResourceESE("resource/readResource.pec");
	}

	@Test
	public void testReadWithResource() throws Exception {
		compareResourceESE("resource/readWithResource.pec");
	}

	@Test
	public void testWriteResource() throws Exception {
		compareResourceESE("resource/writeResource.pec");
	}

	@Test
	public void testWriteWithResource() throws Exception {
		compareResourceESE("resource/writeWithResource.pec");
	}

}

