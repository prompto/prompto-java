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
	public void testInterpretedAbstract() throws Exception {
		runInterpretedTests("core/abstract.pec");
	}

	@Test
	public void testCompiledAbstract() throws Exception {
		runCompiledTests("core/abstract.pec");
	}

	@Test
	public void testTranspiledAbstract() throws Exception {
		runTranspiledTests("core/abstract.pec");
	}

	@Test
	public void testInterpretedAny() throws Exception {
		runInterpretedTests("core/any.pec");
	}

	@Test
	public void testCompiledAny() throws Exception {
		runCompiledTests("core/any.pec");
	}

	@Test
	public void testTranspiledAny() throws Exception {
		runTranspiledTests("core/any.pec");
	}

	@Test
	public void testInterpretedAttribute() throws Exception {
		runInterpretedTests("core/attribute.pec");
	}

	@Test
	public void testCompiledAttribute() throws Exception {
		runCompiledTests("core/attribute.pec");
	}

	@Test
	public void testTranspiledAttribute() throws Exception {
		runTranspiledTests("core/attribute.pec");
	}

	@Test
	public void testInterpretedAttributes() throws Exception {
		runInterpretedTests("core/attributes.pec");
	}

	@Test
	public void testCompiledAttributes() throws Exception {
		runCompiledTests("core/attributes.pec");
	}

	@Test
	public void testTranspiledAttributes() throws Exception {
		runTranspiledTests("core/attributes.pec");
	}

	@Test
	public void testInterpretedCloud() throws Exception {
		runInterpretedTests("core/cloud.pec");
	}

	@Test
	public void testCompiledCloud() throws Exception {
		runCompiledTests("core/cloud.pec");
	}

	@Test
	public void testTranspiledCloud() throws Exception {
		runTranspiledTests("core/cloud.pec");
	}

	@Test
	public void testInterpretedError() throws Exception {
		runInterpretedTests("core/error.pec");
	}

	@Test
	public void testCompiledError() throws Exception {
		runCompiledTests("core/error.pec");
	}

	@Test
	public void testTranspiledError() throws Exception {
		runTranspiledTests("core/error.pec");
	}

	@Test
	public void testInterpretedMath() throws Exception {
		runInterpretedTests("core/math.pec");
	}

	@Test
	public void testCompiledMath() throws Exception {
		runCompiledTests("core/math.pec");
	}

	@Test
	public void testTranspiledMath() throws Exception {
		runTranspiledTests("core/math.pec");
	}

	@Test
	public void testInterpretedParse() throws Exception {
		runInterpretedTests("core/parse.pec");
	}

	@Test
	public void testCompiledParse() throws Exception {
		runCompiledTests("core/parse.pec");
	}

	@Test
	public void testTranspiledParse() throws Exception {
		runTranspiledTests("core/parse.pec");
	}

	@Test
	public void testInterpretedTime() throws Exception {
		runInterpretedTests("core/time.pec");
	}

	@Test
	public void testCompiledTime() throws Exception {
		runCompiledTests("core/time.pec");
	}

	@Test
	public void testTranspiledTime() throws Exception {
		runTranspiledTests("core/time.pec");
	}

	@Test
	public void testInterpretedUtils() throws Exception {
		runInterpretedTests("core/utils.pec");
	}

	@Test
	public void testCompiledUtils() throws Exception {
		runCompiledTests("core/utils.pec");
	}

	@Test
	public void testTranspiledUtils() throws Exception {
		runTranspiledTests("core/utils.pec");
	}

}

