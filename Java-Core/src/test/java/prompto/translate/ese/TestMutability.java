package prompto.translate.ese;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestMutability extends BaseEParserTest {

	@Test
	public void testImmutable() throws Exception {
		compareResourceESE("mutability/immutable.pec");
	}

	@Test
	public void testImmutableArgument() throws Exception {
		compareResourceESE("mutability/immutableArgument.pec");
	}

	@Test
	public void testImmutableDict() throws Exception {
		compareResourceESE("mutability/immutableDict.pec");
	}

	@Test
	public void testImmutableList() throws Exception {
		compareResourceESE("mutability/immutableList.pec");
	}

	@Test
	public void testImmutableMember() throws Exception {
		compareResourceESE("mutability/immutableMember.pec");
	}

	@Test
	public void testImmutableTuple() throws Exception {
		compareResourceESE("mutability/immutableTuple.pec");
	}

	@Test
	public void testMutable() throws Exception {
		compareResourceESE("mutability/mutable.pec");
	}

	@Test
	public void testMutableArgument() throws Exception {
		compareResourceESE("mutability/mutableArgument.pec");
	}

	@Test
	public void testMutableDict() throws Exception {
		compareResourceESE("mutability/mutableDict.pec");
	}

	@Test
	public void testMutableList() throws Exception {
		compareResourceESE("mutability/mutableList.pec");
	}

	@Test
	public void testMutableMember() throws Exception {
		compareResourceESE("mutability/mutableMember.pec");
	}

	@Test
	public void testMutableTuple() throws Exception {
		compareResourceESE("mutability/mutableTuple.pec");
	}

}

