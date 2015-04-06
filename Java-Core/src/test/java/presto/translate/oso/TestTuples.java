package presto.translate.oso;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestTuples extends BaseOParserTest {

	@Test
	public void testMultiAssignment() throws Exception {
		compareResourceOSO("tuples/multiAssignment.poc");
	}

	@Test
	public void testSingleAssignment() throws Exception {
		compareResourceOSO("tuples/singleAssignment.poc");
	}

	@Test
	public void testTupleElement() throws Exception {
		compareResourceOSO("tuples/tupleElement.poc");
	}

}

