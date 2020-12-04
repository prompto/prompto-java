package prompto.translate.omo;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestSingleton extends BaseOParserTest {

	@Test
	public void testAttribute() throws Exception {
		compareResourceOMO("singleton/attribute.poc");
	}

	@Test
	public void testConstructor() throws Exception {
		compareResourceOMO("singleton/constructor.poc");
	}

	@Test
	public void testInternal() throws Exception {
		compareResourceOMO("singleton/internal.poc");
	}

	@Test
	public void testMember() throws Exception {
		compareResourceOMO("singleton/member.poc");
	}

}

