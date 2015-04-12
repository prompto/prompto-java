package presto.parser.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import presto.runtime.utils.Out;

public class TestNativePrint extends BaseEParserTest {

	@Before
	public void before() {
		Out.init();
	}
	
	@After
	public void after() {
		Out.restore();
	}
	
	@Test
	public void testNativePrint() throws Exception {
		runResource("native/print.pec");
		assertEquals("name=IBM", Out.read());
	}



}
