// generated: 2015-07-05T23:01:01.157
package prompto.translate.oso;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

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

