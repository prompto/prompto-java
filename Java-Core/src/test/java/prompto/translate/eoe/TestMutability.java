// generated: 2015-07-05T23:01:01.055
package prompto.translate.eoe;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestMutability extends BaseEParserTest {

	@Test
	public void testImmutable() throws Exception {
		compareResourceEOE("mutability/immutable.pec");
	}

	@Test
	public void testImmutableArgument() throws Exception {
		compareResourceEOE("mutability/immutableArgument.pec");
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
	public void testMutableArgument() throws Exception {
		compareResourceEOE("mutability/mutableArgument.pec");
	}

	@Test
	public void testMutableMember() throws Exception {
		compareResourceEOE("mutability/mutableMember.pec");
	}

}

