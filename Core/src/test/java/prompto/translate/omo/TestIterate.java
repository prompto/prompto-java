package prompto.translate.omo;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestIterate extends BaseOParserTest {

	@Test
	public void testForEachExpression() throws Exception {
		compareResourceOMO("iterate/forEachExpression.poc");
	}

	@Test
	public void testForEachIntegerList() throws Exception {
		compareResourceOMO("iterate/forEachIntegerList.poc");
	}

	@Test
	public void testForEachIntegerRange() throws Exception {
		compareResourceOMO("iterate/forEachIntegerRange.poc");
	}

	@Test
	public void testForEachIntegerSet() throws Exception {
		compareResourceOMO("iterate/forEachIntegerSet.poc");
	}

}

