// generated: 2015-07-05T23:01:01.097
package prompto.translate.ese;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestSetters extends BaseEParserTest {

	@Test
	public void testGetter() throws Exception {
		compareResourceESE("setters/getter.pec");
	}

	@Test
	public void testGetterCall() throws Exception {
		compareResourceESE("setters/getterCall.pec");
	}

	@Test
	public void testSetter() throws Exception {
		compareResourceESE("setters/setter.pec");
	}

}

