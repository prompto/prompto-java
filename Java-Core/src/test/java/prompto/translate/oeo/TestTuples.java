// generated: 2015-07-05T23:01:01.156
package prompto.translate.oeo;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestTuples extends BaseOParserTest {

	@Test
	public void testMultiAssignment() throws Exception {
		compareResourceOEO("tuples/multiAssignment.poc");
	}

	@Test
	public void testSingleAssignment() throws Exception {
		compareResourceOEO("tuples/singleAssignment.poc");
	}

	@Test
	public void testTupleElement() throws Exception {
		compareResourceOEO("tuples/tupleElement.poc");
	}

}

