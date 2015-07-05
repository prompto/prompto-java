// generated: 2015-07-05T23:01:01.020
package prompto.translate.ese;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestLogic extends BaseEParserTest {

	@Test
	public void testAndBoolean() throws Exception {
		compareResourceESE("logic/andBoolean.pec");
	}

	@Test
	public void testNotBoolean() throws Exception {
		compareResourceESE("logic/notBoolean.pec");
	}

	@Test
	public void testOrBoolean() throws Exception {
		compareResourceESE("logic/orBoolean.pec");
	}

}

