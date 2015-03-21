package presto.translate.oeo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestTuples extends BaseOParserTest {

	@Test
	public void testMultiAssignment() throws Exception {
		compareResourceOEO("tuples/multiAssignment.o");
	}

	@Test
	public void testSingleAssignment() throws Exception {
		compareResourceOEO("tuples/singleAssignment.o");
	}

	@Test
	public void testTupleElement() throws Exception {
		compareResourceOEO("tuples/tupleElement.o");
	}

}

