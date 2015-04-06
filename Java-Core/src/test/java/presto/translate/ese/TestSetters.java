package presto.translate.ese;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestSetters extends BaseEParserTest {

	@Test
	public void testGetter() throws Exception {
		compareResourceESE("setters/getter.pec");
	}

	@Test
	public void testSetter() throws Exception {
		compareResourceESE("setters/setter.pec");
	}

}

