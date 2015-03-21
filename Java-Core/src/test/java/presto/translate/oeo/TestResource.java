package presto.translate.oeo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestResource extends BaseOParserTest {

	@Test
	public void testBadRead() throws Exception {
		compareResourceOEO("resource/badRead.o");
	}

	@Test
	public void testBadResource() throws Exception {
		compareResourceOEO("resource/badResource.o");
	}

	@Test
	public void testBadWrite() throws Exception {
		compareResourceOEO("resource/badWrite.o");
	}

	@Test
	public void testReadResource() throws Exception {
		compareResourceOEO("resource/readResource.o");
	}

	@Test
	public void testReadWithResource() throws Exception {
		compareResourceOEO("resource/readWithResource.o");
	}

	@Test
	public void testWriteResource() throws Exception {
		compareResourceOEO("resource/writeResource.o");
	}

	@Test
	public void testWriteWithResource() throws Exception {
		compareResourceOEO("resource/writeWithResource.o");
	}

}

