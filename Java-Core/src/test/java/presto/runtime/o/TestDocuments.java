package presto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.o.BaseOParserTest;
import presto.runtime.utils.Out;

public class TestDocuments extends BaseOParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testDeepItem() throws Exception {
		checkOutput("documents/deepItem.poc");
	}

	@Test
	public void testDeepVariable() throws Exception {
		checkOutput("documents/deepVariable.poc");
	}

	@Test
	public void testItem() throws Exception {
		checkOutput("documents/item.poc");
	}

	@Test
	public void testVariable() throws Exception {
		checkOutput("documents/variable.poc");
	}

}

