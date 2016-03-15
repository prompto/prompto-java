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
		interpretResource("resource/badRead.pec", true);
	}

	@Test(expected = SyntaxError.class)
	public void testBadWrite() throws Exception {
		interpretResource("resource/badWrite.pec", true);
	}

	@Test(expected = SyntaxError.class)
	public void testBadResource() throws Exception {
		interpretResource("resource/badResource.pec", true);
	}
	
	@Test
	public void testReadResource() throws Exception {
		checkInterpretedOutput("resource/readResource.pec");
	}
	
	@Test
	public void testWriteResource() throws Exception {
		checkInterpretedOutput("resource/writeResource.pec");
	}

	@Test
	public void testReadWithResource() throws Exception {
		checkInterpretedOutput("resource/readWithResource.pec");
	}

	@Test
	public void testWriteWithResource() throws Exception {
		checkInterpretedOutput("resource/writeWithResource.pec");
	}



}
