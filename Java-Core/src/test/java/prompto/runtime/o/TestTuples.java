package prompto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.o.BaseOParserTest;
import prompto.runtime.utils.Out;

public class TestTuples extends BaseOParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testMultiAssignment() throws Exception {
		checkOutput("tuples/multiAssignment.poc");
	}

	@Test
	public void testSingleAssignment() throws Exception {
		checkOutput("tuples/singleAssignment.poc");
	}

	@Test
	public void testTupleElement() throws Exception {
		checkOutput("tuples/tupleElement.poc");
	}

}

