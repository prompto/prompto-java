package prompto.library.e;

import org.junit.After;
import org.junit.Before;
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
	public void testInterpretedReader() throws Exception {
		runInterpretedTests("reader/reader.pec");
	}

	@Test
	public void testCompiledReader() throws Exception {
		runCompiledTests("reader/reader.pec");
	}

	@Test
	public void testTranspiledReader() throws Exception {
		runTranspiledTests("reader/reader.pec");
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

