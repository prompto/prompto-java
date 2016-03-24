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
	public void testInterpretedMultiAssignment() throws Exception {
		checkInterpretedOutput("tuples/multiAssignment.poc");
	}

	@Test
	public void testInterpretedSingleAssignment() throws Exception {
		checkInterpretedOutput("tuples/singleAssignment.poc");
	}

	@Test
	public void testInterpretedTupleElement() throws Exception {
		checkInterpretedOutput("tuples/tupleElement.poc");
	}

}

