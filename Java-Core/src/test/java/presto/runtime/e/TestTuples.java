package presto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.e.BaseEParserTest;
import presto.runtime.utils.Out;

public class TestTuples extends BaseEParserTest {

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
		checkOutput("tuples/multiAssignment.pec");
	}

	@Test
	public void testSingleAssignment() throws Exception {
		checkOutput("tuples/singleAssignment.pec");
	}

	@Test
	public void testTupleElement() throws Exception {
		checkOutput("tuples/tupleElement.pec");
	}

}

