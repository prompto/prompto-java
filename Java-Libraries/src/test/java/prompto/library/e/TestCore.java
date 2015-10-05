// generated: 2015-10-05T22:40:44.524
package prompto.library.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.e.BaseEParserTest;
import prompto.runtime.utils.Out;

public class TestCore extends BaseEParserTest {

	@Before
	public void before() throws Exception {
		Out.init();
		loadDependency("core");
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testAny() throws Exception {
		runTests("core/any.pec");
	}

	@Test
	public void testAttribute() throws Exception {
		runTests("core/attribute.pec");
	}

	@Test
	public void testError() throws Exception {
		runTests("core/error.pec");
	}

}

