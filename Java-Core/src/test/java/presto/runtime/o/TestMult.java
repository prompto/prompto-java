package presto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.o.BaseOParserTest;
import presto.runtime.utils.Out;

public class TestMult extends BaseOParserTest {

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
		checkOutput("mult/multCharacter.o");
	}

	@Test
	public void testMultDecimal() throws Exception {
		checkOutput("mult/multDecimal.o");
	}

	@Test
	public void testMultInteger() throws Exception {
		checkOutput("mult/multInteger.o");
	}

	@Test
	public void testMultList() throws Exception {
		checkOutput("mult/multList.o");
	}

	@Test
	public void testMultPeriod() throws Exception {
		checkOutput("mult/multPeriod.o");
	}

	@Test
	public void testMultText() throws Exception {
		checkOutput("mult/multText.o");
	}

}

