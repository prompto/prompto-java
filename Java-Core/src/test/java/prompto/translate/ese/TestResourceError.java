package prompto.translate.ese;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestResourceError extends BaseEParserTest {

	@Test
	public void testBadRead() throws Exception {
		compareResourceESE("resourceError/badRead.pec");
	}

	@Test
	public void testBadResource() throws Exception {
		compareResourceESE("resourceError/badResource.pec");
	}

	@Test
	public void testBadWrite() throws Exception {
		compareResourceESE("resourceError/badWrite.pec");
	}

}

