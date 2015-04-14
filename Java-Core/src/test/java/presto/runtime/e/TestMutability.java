package presto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.e.BaseEParserTest;
import presto.runtime.utils.Out;

public class TestMutability extends BaseEParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testImmutable() throws Exception {
		checkOutput("mutability/immutable.pec");
	}

	@Test
	public void testMutable() throws Exception {
		checkOutput("mutability/mutable.pec");
	}

}

