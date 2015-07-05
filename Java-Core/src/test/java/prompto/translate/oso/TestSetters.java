// generated: 2015-07-05T23:01:01.100
package prompto.translate.oso;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestSetters extends BaseOParserTest {

	@Test
	public void testGetter() throws Exception {
		compareResourceOSO("setters/getter.poc");
	}

	@Test
	public void testSetter() throws Exception {
		compareResourceOSO("setters/setter.poc");
	}

}

