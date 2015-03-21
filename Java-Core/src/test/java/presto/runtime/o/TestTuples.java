package presto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.o.BaseOParserTest;
import presto.runtime.utils.Out;

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
		checkOutput("tuples/multiAssignment.o");
	}

	@Test
	public void testSingleAssignment() throws Exception {
		checkOutput("tuples/singleAssignment.o");
	}

	@Test
	public void testTupleElement() throws Exception {
		checkOutput("tuples/tupleElement.o");
	}

}

