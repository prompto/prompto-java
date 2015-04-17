package presto.translate.eoe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestMutability extends BaseEParserTest {

	@Test
	public void testImmutable() throws Exception {
		compareResourceEOE("mutability/immutable.pec");
	}

	@Test
	public void testImmutableMember() throws Exception {
		compareResourceEOE("mutability/immutableMember.pec");
	}

	@Test
	public void testMutable() throws Exception {
		compareResourceEOE("mutability/mutable.pec");
	}

	@Test
	public void testMutableMember() throws Exception {
		compareResourceEOE("mutability/mutableMember.pec");
	}

}

