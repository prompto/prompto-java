package prompto.translate.eme;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestSubtract extends BaseEParserTest {

	@Test
	public void testSubDate() throws Exception {
		compareResourceEME("subtract/subDate.pec");
	}

	@Test
	public void testSubDateTime() throws Exception {
		compareResourceEME("subtract/subDateTime.pec");
	}

	@Test
	public void testSubDecimal() throws Exception {
		compareResourceEME("subtract/subDecimal.pec");
	}

	@Test
	public void testSubDecimalEnum() throws Exception {
		compareResourceEME("subtract/subDecimalEnum.pec");
	}

	@Test
	public void testSubInteger() throws Exception {
		compareResourceEME("subtract/subInteger.pec");
	}

	@Test
	public void testSubIntegerEnum() throws Exception {
		compareResourceEME("subtract/subIntegerEnum.pec");
	}

	@Test
	public void testSubList() throws Exception {
		compareResourceEME("subtract/subList.pec");
	}

	@Test
	public void testSubPeriod() throws Exception {
		compareResourceEME("subtract/subPeriod.pec");
	}

	@Test
	public void testSubSet() throws Exception {
		compareResourceEME("subtract/subSet.pec");
	}

	@Test
	public void testSubTime() throws Exception {
		compareResourceEME("subtract/subTime.pec");
	}

}

