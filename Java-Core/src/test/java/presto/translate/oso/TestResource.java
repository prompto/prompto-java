package presto.translate.oso;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestResource extends BaseOParserTest {

	@Test
	public void testBadRead() throws Exception {
		compareResourceOSO("resource/badRead.poc");
	}

	@Test
	public void testBadResource() throws Exception {
		compareResourceOSO("resource/badResource.poc");
	}

	@Test
	public void testBadWrite() throws Exception {
		compareResourceOSO("resource/badWrite.poc");
	}

	@Test
	public void testReadResource() throws Exception {
		compareResourceOSO("resource/readResource.poc");
	}

	@Test
	public void testReadWithResource() throws Exception {
		compareResourceOSO("resource/readWithResource.poc");
	}

	@Test
	public void testWriteResource() throws Exception {
		compareResourceOSO("resource/writeResource.poc");
	}

	@Test
	public void testWriteWithResource() throws Exception {
		compareResourceOSO("resource/writeWithResource.poc");
	}

}

