package presto.translate.oso;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestMutability extends BaseOParserTest {

	@Test
	public void testImmutable() throws Exception {
		compareResourceOSO("mutability/immutable.poc");
	}

	@Test
	public void testMutable() throws Exception {
		compareResourceOSO("mutability/mutable.poc");
	}

}

