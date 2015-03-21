package presto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.e.BaseEParserTest;
import presto.runtime.utils.Out;

public class TestMult extends BaseEParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testMultCharacter() throws Exception {
		checkOutput("mult/multCharacter.e");
	}

	@Test
	public void testMultDecimal() throws Exception {
		checkOutput("mult/multDecimal.e");
	}

	@Test
	public void testMultInteger() throws Exception {
		checkOutput("mult/multInteger.e");
	}

	@Test
	public void testMultList() throws Exception {
		checkOutput("mult/multList.e");
	}

	@Test
	public void testMultPeriod() throws Exception {
		checkOutput("mult/multPeriod.e");
	}

	@Test
	public void testMultText() throws Exception {
		checkOutput("mult/multText.e");
	}

}

