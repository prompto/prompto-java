// generated: 2015-07-05T23:01:01.099
package prompto.translate.oeo;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestSetters extends BaseOParserTest {

	@Test
	public void testGetter() throws Exception {
		compareResourceOEO("setters/getter.poc");
	}

	@Test
	public void testSetter() throws Exception {
		compareResourceOEO("setters/setter.poc");
	}

}

