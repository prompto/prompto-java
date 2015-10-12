package prompto.translate.oso;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestMutability extends BaseOParserTest {

	@Test
	public void testImmutable() throws Exception {
		compareResourceEOE("mutability/immutable.poc");
	}

	@Test
	public void testImmutableArgument() throws Exception {
		compareResourceEOE("mutability/immutableArgument.poc");
	}

	@Test
	public void testImmutableMember() throws Exception {
		compareResourceEOE("mutability/immutableMember.poc");
	}

	@Test
	public void testMutable() throws Exception {
		compareResourceEOE("mutability/mutable.poc");
	}

	@Test
	public void testMutableArgument() throws Exception {
		compareResourceEOE("mutability/mutableArgument.poc");
	}

	@Test
	public void testMutableMember() throws Exception {
		compareResourceEOE("mutability/mutableMember.poc");
	}

}

