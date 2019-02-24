package prompto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.o.BaseOParserTest;
import prompto.runtime.utils.Out;

public class TestArrow extends BaseOParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testInterpretedSort1() throws Exception {
		checkInterpretedOutput("arrow/sort1.poc");
	}

	@Test
	public void testCompiledSort1() throws Exception {
		checkCompiledOutput("arrow/sort1.poc");
	}

	@Test
	public void testTranspiledSort1() throws Exception {
		checkTranspiledOutput("arrow/sort1.poc");
	}

	@Test
	public void testInterpretedSort1_desc() throws Exception {
		checkInterpretedOutput("arrow/sort1_desc.poc");
	}

	@Test
	public void testCompiledSort1_desc() throws Exception {
		checkCompiledOutput("arrow/sort1_desc.poc");
	}

	@Test
	public void testTranspiledSort1_desc() throws Exception {
		checkTranspiledOutput("arrow/sort1_desc.poc");
	}

	@Test
	public void testInterpretedSort2() throws Exception {
		checkInterpretedOutput("arrow/sort2.poc");
	}

	@Test
	public void testCompiledSort2() throws Exception {
		checkCompiledOutput("arrow/sort2.poc");
	}

	@Test
	public void testTranspiledSort2() throws Exception {
		checkTranspiledOutput("arrow/sort2.poc");
	}

	@Test
	public void testInterpretedSort2_desc() throws Exception {
		checkInterpretedOutput("arrow/sort2_desc.poc");
	}

	@Test
	public void testCompiledSort2_desc() throws Exception {
		checkCompiledOutput("arrow/sort2_desc.poc");
	}

	@Test
	public void testTranspiledSort2_desc() throws Exception {
		checkTranspiledOutput("arrow/sort2_desc.poc");
	}

}

