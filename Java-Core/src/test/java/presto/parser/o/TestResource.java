package presto.parser.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.error.SyntaxError;
import presto.runtime.utils.MyResource;
import presto.runtime.utils.Out;


public class TestResource extends BaseOParserTest {

	@Before
	public void before() {
		Out.init();
		MyResource.content = "readFullyOk";
	}
	
	@After
	public void after() {
		Out.restore();
	}
	
	@Test(expected = SyntaxError.class)
	public void testBadRead() throws Exception {
		runResource("resource/badRead.o");
	}

	@Test(expected = SyntaxError.class)
	public void testBadWrite() throws Exception {
		runResource("resource/badWrite.o");
	}

	@Test(expected = SyntaxError.class)
	public void testBadResource() throws Exception {
		runResource("resource/badResource.o");
	}
	
	@Test
	public void testReadResource() throws Exception {
		checkOutput("resource/readResource.o");
	}
	
	@Test
	public void testWriteResource() throws Exception {
		checkOutput("resource/writeResource.o");
	}

	@Test
	public void testReadWithResource() throws Exception {
		checkOutput("resource/readWithResource.o");
	}

	@Test
	public void testWriteWithResource() throws Exception {
		checkOutput("resource/writeWithResource.o");
	}



}
