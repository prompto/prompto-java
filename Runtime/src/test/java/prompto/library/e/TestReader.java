package prompto.library.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import prompto.parser.e.BaseEParserTest;
import prompto.runtime.utils.Out;

public class TestReader extends BaseEParserTest {

	@Before
	public void before() throws Exception {
		Out.init();
		loadDependency("reader");
		loadDependency("core");
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testInterpretedCsv() throws Exception {
		runInterpretedTests("reader/csv.pec");
	}

	@Test
	public void testCompiledCsv() throws Exception {
		runCompiledTests("reader/csv.pec");
	}

	@Ignore("Pending migration to GraalVM")
	@Test
	public void testTranspiledCsv() throws Exception {
		runTranspiledTests("reader/csv.pec");
	}

	@Test
	public void testInterpretedJson() throws Exception {
		runInterpretedTests("reader/json.pec");
	}

	@Test
	public void testCompiledJson() throws Exception {
		runCompiledTests("reader/json.pec");
	}

	@Test
	public void testTranspiledJson() throws Exception {
		runTranspiledTests("reader/json.pec");
	}

	@Test
	public void testInterpretedYaml() throws Exception {
		runInterpretedTests("reader/yaml.pec");
	}

	@Test
	public void testCompiledYaml() throws Exception {
		runCompiledTests("reader/yaml.pec");
	}

	@Test
	public void testTranspiledYaml() throws Exception {
		runTranspiledTests("reader/yaml.pec");
	}

}

