package presto.translate.opo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestTuples extends BaseOParserTest {

	@Test
	public void testMultiAssignment() throws Exception {
		compareResourceOPO("tuples/multiAssignment.o");
	}

	@Test
	public void testSingleAssignment() throws Exception {
		compareResourceOPO("tuples/singleAssignment.o");
	}

	@Test
	public void testTupleElement() throws Exception {
		compareResourceOPO("tuples/tupleElement.o");
	}

}

