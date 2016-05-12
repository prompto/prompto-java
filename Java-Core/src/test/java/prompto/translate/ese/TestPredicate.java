package prompto.translate.ese;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestPredicate extends BaseEParserTest {

	@Test
	public void testContainsItem() throws Exception {
		compareResourceESE("predicate/containsItem.pec");
	}

	@Test
	public void testEquals() throws Exception {
		compareResourceESE("predicate/equals.pec");
	}

	@Test
	public void testGreater() throws Exception {
		compareResourceESE("predicate/greater.pec");
	}

	@Test
	public void testInList() throws Exception {
		compareResourceESE("predicate/inList.pec");
	}

	@Test
	public void testLesser() throws Exception {
		compareResourceESE("predicate/lesser.pec");
	}

	@Test
	public void testNotEquals() throws Exception {
		compareResourceESE("predicate/notEquals.pec");
	}

	@Test
	public void testPartial() throws Exception {
		compareResourceESE("predicate/partial.pec");
	}

	@Test
	public void testRoughly() throws Exception {
		compareResourceESE("predicate/roughly.pec");
	}

}

