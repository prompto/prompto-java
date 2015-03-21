package presto.translate.eoe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestTuples extends BaseEParserTest {

	@Test
	public void testMultiAssignment() throws Exception {
		compareResourceEOE("tuples/multiAssignment.e");
	}

	@Test
	public void testSingleAssignment() throws Exception {
		compareResourceEOE("tuples/singleAssignment.e");
	}

	@Test
	public void testTupleElement() throws Exception {
		compareResourceEOE("tuples/tupleElement.e");
	}

}

