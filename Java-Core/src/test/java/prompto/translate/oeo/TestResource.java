// generated: 2015-07-05T23:01:01.085
package prompto.translate.oeo;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestResource extends BaseOParserTest {

	@Test
	public void testBadRead() throws Exception {
		compareResourceOEO("resource/badRead.poc");
	}

	@Test
	public void testBadResource() throws Exception {
		compareResourceOEO("resource/badResource.poc");
	}

	@Test
	public void testBadWrite() throws Exception {
		compareResourceOEO("resource/badWrite.poc");
	}

	@Test
	public void testReadResource() throws Exception {
		compareResourceOEO("resource/readResource.poc");
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
	public void testWriteWithResource() throws Exception {
		compareResourceOEO("resource/writeWithResource.poc");
	}

}

