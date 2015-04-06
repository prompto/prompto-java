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
		runResource("resource/badRead.poc");
	}

	@Test(expected = SyntaxError.class)
	public void testBadWrite() throws Exception {
		runResource("resource/badWrite.poc");
	}

	@Test(expected = SyntaxError.class)
	public void testBadResource() throws Exception {
		runResource("resource/badResource.poc");
	}
	
	@Test
	public void testReadResource() throws Exception {
		checkOutput("resource/readResource.poc");
	}
	
	@Test
	public void testWriteResource() throws Exception {
		checkOutput("resource/writeResource.poc");
	}

	@Test
	public void testReadWithResource() throws Exception {
		checkOutput("resource/readWithResource.poc");
	}

	@Test
	public void testWriteWithResource() throws Exception {
		checkOutput("resource/writeWithResource.poc");
	}



}
