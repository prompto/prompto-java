package presto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.e.BaseEParserTest;
import presto.runtime.utils.Out;

public class TestNative extends BaseEParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testCategory() throws Exception {
		checkOutput("native/category.pec");
	}

	@Test
	public void testMethod() throws Exception {
		checkOutput("native/method.pec");
	}

}

