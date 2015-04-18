package presto.parser.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.error.DivideByZeroError;
import presto.runtime.utils.Out;

public class TestUnexpected extends BaseEParserTest {

	@Before
	public void before() {
		Out.init();
	}
	
	@After
	public void after() {
		Out.restore();
	}

	@Test(expected = DivideByZeroError.class)
	public void testReturn() throws Exception {
		runResource("errors/unexpected.pec");
	}
	
}
