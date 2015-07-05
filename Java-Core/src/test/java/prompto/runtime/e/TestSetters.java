// generated: 2015-07-05T23:01:01.098
package prompto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.e.BaseEParserTest;
import prompto.runtime.utils.Out;

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
		checkOutput("setters/getter.pec");
	}

	@Test
	public void testGetterCall() throws Exception {
		checkOutput("setters/getterCall.pec");
	}

	@Test
	public void testSetter() throws Exception {
		checkOutput("setters/setter.pec");
	}

}

