package presto.parser.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.error.SyntaxError;
import presto.runtime.utils.MyResource;
import presto.runtime.utils.Out;


public class TestResource extends BaseEParserTest {

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
		runResource("resource/badRead.e");
	}

	@Test(expected = SyntaxError.class)
	public void testBadWrite() throws Exception {
		runResource("resource/badWrite.e");
	}

	@Test(expected = SyntaxError.class)
	public void testBadResource() throws Exception {
		runResource("resource/badResource.e");
	}
	
	@Test
	public void testReadResource() throws Exception {
		checkOutput("resource/readResource.e");
	}
	
	@Test
	public void testWriteResource() throws Exception {
		checkOutput("resource/writeResource.e");
	}

	@Test
	public void testReadWithResource() throws Exception {
		checkOutput("resource/readWithResource.e");
	}

	@Test
	public void testWriteWithResource() throws Exception {
		checkOutput("resource/writeWithResource.e");
	}



}
