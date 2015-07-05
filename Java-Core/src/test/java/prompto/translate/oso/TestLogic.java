// generated: 2015-07-05T23:01:01.024
package prompto.translate.oso;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestLogic extends BaseOParserTest {

	@Test
	public void testAndBoolean() throws Exception {
		compareResourceOSO("logic/andBoolean.poc");
	}

	@Test
	public void testNotBoolean() throws Exception {
		compareResourceOSO("logic/notBoolean.poc");
	}

	@Test
	public void testOrBoolean() throws Exception {
		compareResourceOSO("logic/orBoolean.poc");
	}

}

