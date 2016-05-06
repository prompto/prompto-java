package prompto.translate.ese;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestResource extends BaseEParserTest {

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

