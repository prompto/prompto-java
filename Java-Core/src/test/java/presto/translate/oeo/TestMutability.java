package presto.translate.oeo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestMutability extends BaseOParserTest {

	@Test
	public void testImmutable() throws Exception {
		compareResourceOEO("mutability/immutable.poc");
	}

	@Test
	public void testImmutableMember() throws Exception {
		compareResourceOEO("mutability/immutableMember.poc");
	}

	@Test
	public void testMutable() throws Exception {
		compareResourceOEO("mutability/mutable.poc");
	}

	@Test
	public void testMutableMember() throws Exception {
		compareResourceOEO("mutability/mutableMember.poc");
	}

}

