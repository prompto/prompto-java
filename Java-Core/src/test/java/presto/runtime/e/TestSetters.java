package presto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.e.BaseEParserTest;
import presto.runtime.utils.Out;

public class TestSetters extends BaseEParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testGetter() throws Exception {
		checkOutput("setters/getter.e");
	}

	@Test
	public void testSetter() throws Exception {
		checkOutput("setters/setter.e");
	}

}

