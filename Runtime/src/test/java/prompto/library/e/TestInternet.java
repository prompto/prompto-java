package prompto.library.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.e.BaseEParserTest;
import prompto.runtime.utils.Out;

public class TestInternet extends BaseEParserTest {

	@Before
	public void before() throws Exception {
		Out.init();
		loadDependency("internet");
		loadDependency("console");
		loadDependency("core");
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testInterpretedEmail() throws Exception {
		runInterpretedTests("internet/email.pec");
	}

	@Test
	public void testCompiledEmail() throws Exception {
		runCompiledTests("internet/email.pec");
	}

	@Test
	public void testTranspiledEmail() throws Exception {
		runTranspiledTests("internet/email.pec");
	}

	@Test
	public void testInterpretedHtml() throws Exception {
		runInterpretedTests("internet/html.pec");
	}

	@Test
	public void testCompiledHtml() throws Exception {
		runCompiledTests("internet/html.pec");
	}

	@Test
	public void testTranspiledHtml() throws Exception {
		runTranspiledTests("internet/html.pec");
	}

	@Test
	public void testInterpretedUrl() throws Exception {
		runInterpretedTests("internet/url.pec");
	}

	@Test
	public void testCompiledUrl() throws Exception {
		runCompiledTests("internet/url.pec");
	}

	@Test
	public void testTranspiledUrl() throws Exception {
		runTranspiledTests("internet/url.pec");
	}

}

