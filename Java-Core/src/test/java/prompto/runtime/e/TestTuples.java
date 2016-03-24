package prompto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.e.BaseEParserTest;
import prompto.runtime.utils.Out;

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
	public void testInterpretedMultiAssignment() throws Exception {
		checkInterpretedOutput("tuples/multiAssignment.pec");
	}

	@Test
	public void testInterpretedSingleAssignment() throws Exception {
		checkInterpretedOutput("tuples/singleAssignment.pec");
	}

	@Test
	public void testInterpretedTupleElement() throws Exception {
		checkInterpretedOutput("tuples/tupleElement.pec");
	}

}

