package presto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.e.BaseEParserTest;
import presto.runtime.utils.Out;

public class TestDocuments extends BaseEParserTest {

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
		checkOutput("documents/deepItem.pec");
	}

	@Test
	public void testDeepVariable() throws Exception {
		checkOutput("documents/deepVariable.pec");
	}

	@Test
	public void testItem() throws Exception {
		checkOutput("documents/item.pec");
	}

	@Test
	public void testVariable() throws Exception {
		checkOutput("documents/variable.pec");
	}

}

