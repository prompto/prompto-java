// generated: 2015-07-05T23:01:01.059
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
	public void testImmutableMember() throws Exception {
		compareResourceOSO("mutability/immutableMember.poc");
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
	public void testMutableMember() throws Exception {
		compareResourceOSO("mutability/mutableMember.poc");
	}

}

