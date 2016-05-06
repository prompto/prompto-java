package prompto.translate.oso;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestResourceError extends BaseOParserTest {

	@Test
	public void testBadRead() throws Exception {
		compareResourceOSO("resourceError/badRead.poc");
	}

	@Test
	public void testBadResource() throws Exception {
		compareResourceOSO("resourceError/badResource.poc");
	}

	@Test
	public void testBadWrite() throws Exception {
		compareResourceOSO("resourceError/badWrite.poc");
	}

}

