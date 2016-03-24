package prompto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.e.BaseEParserTest;
import prompto.runtime.utils.Out;

public class TestCast extends BaseEParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testInterpretedAutoDowncast() throws Exception {
		checkInterpretedOutput("cast/autoDowncast.pec");
	}

	@Test
	public void testInterpretedCastChild() throws Exception {
		checkInterpretedOutput("cast/castChild.pec");
	}

	@Test
	public void testInterpretedIsAChild() throws Exception {
		checkInterpretedOutput("cast/isAChild.pec");
	}

	@Test
	public void testInterpretedIsAText() throws Exception {
		checkInterpretedOutput("cast/isAText.pec");
	}

}

