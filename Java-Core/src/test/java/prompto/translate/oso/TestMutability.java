package prompto.translate.oso;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestMutability extends BaseOParserTest {

	@Test
	public void testImmutable() throws Exception {
		compareResourceOSO("mutability/immutable.poc");
	}

	@Test
	public void testImmutableArgument() throws Exception {
		compareResourceOSO("mutability/immutableArgument.poc");
	}

	@Test
	public void testImmutableDict() throws Exception {
		compareResourceOSO("mutability/immutableDict.poc");
	}

	@Test
	public void testImmutableList() throws Exception {
		compareResourceOSO("mutability/immutableList.poc");
	}

	@Test
	public void testImmutableMember() throws Exception {
		compareResourceOSO("mutability/immutableMember.poc");
	}

	@Test
	public void testImmutableTuple() throws Exception {
		compareResourceOSO("mutability/immutableTuple.poc");
	}

	@Test
	public void testMutable() throws Exception {
		compareResourceOSO("mutability/mutable.poc");
	}

	@Test
	public void testMutableArgument() throws Exception {
		compareResourceOSO("mutability/mutableArgument.poc");
	}

	@Test
	public void testMutableDict() throws Exception {
		compareResourceOSO("mutability/mutableDict.poc");
	}

	@Test
	public void testMutableList() throws Exception {
		compareResourceOSO("mutability/mutableList.poc");
	}

	@Test
	public void testMutableMember() throws Exception {
		compareResourceOSO("mutability/mutableMember.poc");
	}

	@Test
	public void testMutableTuple() throws Exception {
		compareResourceOSO("mutability/mutableTuple.poc");
	}

}

