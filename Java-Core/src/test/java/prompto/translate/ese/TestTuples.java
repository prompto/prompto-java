// generated: 2015-07-05T23:01:01.154
package prompto.translate.ese;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestTuples extends BaseEParserTest {

	@Test
	public void testMultiAssignment() throws Exception {
		compareResourceESE("tuples/multiAssignment.pec");
	}

	@Test
	public void testSingleAssignment() throws Exception {
		compareResourceESE("tuples/singleAssignment.pec");
	}

	@Test
	public void testTupleElement() throws Exception {
		compareResourceESE("tuples/tupleElement.pec");
	}

}

