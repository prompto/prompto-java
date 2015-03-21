package presto.translate.opo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestResource extends BaseOParserTest {

	@Test
	public void testBadRead() throws Exception {
		compareResourceOPO("resource/badRead.o");
	}

	@Test
	public void testBadResource() throws Exception {
		compareResourceOPO("resource/badResource.o");
	}

	@Test
	public void testBadWrite() throws Exception {
		compareResourceOPO("resource/badWrite.o");
	}

	@Test
	public void testReadResource() throws Exception {
		compareResourceOPO("resource/readResource.o");
	}

	@Test
	public void testReadWithResource() throws Exception {
		compareResourceOPO("resource/readWithResource.o");
	}

	@Test
	public void testWriteResource() throws Exception {
		compareResourceOPO("resource/writeResource.o");
	}

	@Test
	public void testWriteWithResource() throws Exception {
		compareResourceOPO("resource/writeWithResource.o");
	}

}

