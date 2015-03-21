package presto.translate.epe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestTuples extends BaseEParserTest {

	@Test
	public void testMultiAssignment() throws Exception {
		compareResourceEPE("tuples/multiAssignment.e");
	}

	@Test
	public void testSingleAssignment() throws Exception {
		compareResourceEPE("tuples/singleAssignment.e");
	}

	@Test
	public void testTupleElement() throws Exception {
		compareResourceEPE("tuples/tupleElement.e");
	}

}

