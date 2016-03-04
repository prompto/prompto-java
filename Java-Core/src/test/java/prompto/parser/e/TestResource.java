package prompto.parser.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.error.SyntaxError;
import prompto.runtime.utils.MyResource;
import prompto.runtime.utils.Out;


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
		interpretResource("resource/badRead.pec");
	}

	@Test(expected = SyntaxError.class)
	public void testBadWrite() throws Exception {
		interpretResource("resource/badWrite.pec");
	}

	@Test(expected = SyntaxError.class)
	public void testBadResource() throws Exception {
		interpretResource("resource/badResource.pec");
	}
	
	@Test
	public void testReadResource() throws Exception {
		checkOutput("resource/readResource.pec");
	}
	
	@Test
	public void testWriteResource() throws Exception {
		checkOutput("resource/writeResource.pec");
	}

	@Test
	public void testReadWithResource() throws Exception {
		checkOutput("resource/readWithResource.pec");
	}

	@Test
	public void testWriteWithResource() throws Exception {
		checkOutput("resource/writeWithResource.pec");
	}



}
