// generated: 2015-07-05T23:01:01.058
package prompto.translate.oeo;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestMutability extends BaseOParserTest {

	@Test
	public void testImmutable() throws Exception {
		compareResourceOEO("mutability/immutable.poc");
	}

	@Test
	public void testImmutableArgument() throws Exception {
		compareResourceOEO("mutability/immutableArgument.poc");
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
	public void testMutableArgument() throws Exception {
		compareResourceOEO("mutability/mutableArgument.poc");
	}

	@Test
	public void testMutableMember() throws Exception {
		compareResourceOEO("mutability/mutableMember.poc");
	}

}

