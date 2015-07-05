// generated: 2015-07-05T23:01:01.023
package prompto.translate.oeo;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestLogic extends BaseOParserTest {

	@Test
	public void testAndBoolean() throws Exception {
		compareResourceOEO("logic/andBoolean.poc");
	}

	@Test
	public void testNotBoolean() throws Exception {
		compareResourceOEO("logic/notBoolean.poc");
	}

	@Test
	public void testOrBoolean() throws Exception {
		compareResourceOEO("logic/orBoolean.poc");
	}

}

