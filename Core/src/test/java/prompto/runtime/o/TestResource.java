package prompto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.o.BaseOParserTest;
import prompto.runtime.utils.Out;

public class TestResource extends BaseOParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testInterpretedReadInDoWhile() throws Exception {
		checkInterpretedOutput("resource/readInDoWhile.poc");
	}

	@Test
	public void testCompiledReadInDoWhile() throws Exception {
		checkCompiledOutput("resource/readInDoWhile.poc");
	}

	@Test
	public void testTranspiledReadInDoWhile() throws Exception {
		checkTranspiledOutput("resource/readInDoWhile.poc");
	}

	@Test
	public void testInterpretedReadInForEach() throws Exception {
		checkInterpretedOutput("resource/readInForEach.poc");
	}

	@Test
	public void testCompiledReadInForEach() throws Exception {
		checkCompiledOutput("resource/readInForEach.poc");
	}

	@Test
	public void testTranspiledReadInForEach() throws Exception {
		checkTranspiledOutput("resource/readInForEach.poc");
	}

	@Test
	public void testInterpretedReadInIf() throws Exception {
		checkInterpretedOutput("resource/readInIf.poc");
	}

	@Test
	public void testCompiledReadInIf() throws Exception {
		checkCompiledOutput("resource/readInIf.poc");
	}

	@Test
	public void testTranspiledReadInIf() throws Exception {
		checkTranspiledOutput("resource/readInIf.poc");
	}

	@Test
	public void testInterpretedReadInWhile() throws Exception {
		checkInterpretedOutput("resource/readInWhile.poc");
	}

	@Test
	public void testCompiledReadInWhile() throws Exception {
		checkCompiledOutput("resource/readInWhile.poc");
	}

	@Test
	public void testTranspiledReadInWhile() throws Exception {
		checkTranspiledOutput("resource/readInWhile.poc");
	}

	@Test
	public void testInterpretedReadResource() throws Exception {
		checkInterpretedOutput("resource/readResource.poc");
	}

	@Test
	public void testCompiledReadResource() throws Exception {
		checkCompiledOutput("resource/readResource.poc");
	}

	@Test
	public void testTranspiledReadResource() throws Exception {
		checkTranspiledOutput("resource/readResource.poc");
	}

	@Test
	public void testInterpretedReadResourceThen() throws Exception {
		checkInterpretedOutput("resource/readResourceThen.poc");
	}

	@Test
	public void testCompiledReadResourceThen() throws Exception {
		checkCompiledOutput("resource/readResourceThen.poc");
	}

	@Test
	public void testTranspiledReadResourceThen() throws Exception {
		checkTranspiledOutput("resource/readResourceThen.poc");
	}

	@Test
	public void testInterpretedReadWithResource() throws Exception {
		checkInterpretedOutput("resource/readWithResource.poc");
	}

	@Test
	public void testCompiledReadWithResource() throws Exception {
		checkCompiledOutput("resource/readWithResource.poc");
	}

	@Test
	public void testTranspiledReadWithResource() throws Exception {
		checkTranspiledOutput("resource/readWithResource.poc");
	}

	@Test
	public void testInterpretedWriteResource() throws Exception {
		checkInterpretedOutput("resource/writeResource.poc");
	}

	@Test
	public void testCompiledWriteResource() throws Exception {
		checkCompiledOutput("resource/writeResource.poc");
	}

	@Test
	public void testTranspiledWriteResource() throws Exception {
		checkTranspiledOutput("resource/writeResource.poc");
	}

	@Test
	public void testInterpretedWriteResourceThen() throws Exception {
		checkInterpretedOutput("resource/writeResourceThen.poc");
	}

	@Test
	public void testCompiledWriteResourceThen() throws Exception {
		checkCompiledOutput("resource/writeResourceThen.poc");
	}

	@Test
	public void testTranspiledWriteResourceThen() throws Exception {
		checkTranspiledOutput("resource/writeResourceThen.poc");
	}

	@Test
	public void testInterpretedWriteWithResource() throws Exception {
		checkInterpretedOutput("resource/writeWithResource.poc");
	}

	@Test
	public void testCompiledWriteWithResource() throws Exception {
		checkCompiledOutput("resource/writeWithResource.poc");
	}

	@Test
	public void testTranspiledWriteWithResource() throws Exception {
		checkTranspiledOutput("resource/writeWithResource.poc");
	}

}

