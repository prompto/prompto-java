package prompto.translate.eoe;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestSubtract extends BaseEParserTest {

	@Test
	public void testSubDate() throws Exception {
		compareResourceEOE("subtract/subDate.pec");
	}

	@Test
	public void testSubDateTime() throws Exception {
		compareResourceEOE("subtract/subDateTime.pec");
	}

	@Test
	public void testSubDecimal() throws Exception {
		compareResourceEOE("subtract/subDecimal.pec");
	}

	@Test
	public void testSubDecimalEnum() throws Exception {
		compareResourceEOE("subtract/subDecimalEnum.pec");
	}

	@Test
	public void testSubInteger() throws Exception {
		compareResourceEOE("subtract/subInteger.pec");
	}

	@Test
	public void testSubIntegerEnum() throws Exception {
		compareResourceEOE("subtract/subIntegerEnum.pec");
	}

	@Test
	public void testSubList() throws Exception {
		compareResourceEOE("subtract/subList.pec");
	}

	@Test
	public void testSubPeriod() throws Exception {
		compareResourceEOE("subtract/subPeriod.pec");
	}

	@Test
	public void testSubSet() throws Exception {
		compareResourceEOE("subtract/subSet.pec");
	}

	@Test
	public void testSubTime() throws Exception {
		compareResourceEOE("subtract/subTime.pec");
	}

}

