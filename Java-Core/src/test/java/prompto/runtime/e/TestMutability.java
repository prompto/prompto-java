package prompto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.e.BaseEParserTest;
import prompto.runtime.utils.Out;

public class TestMutability extends BaseEParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testImmutable() throws Exception {
		checkOutput("mutability/immutable.pec");
	}

	@Test
	public void testImmutableArgument() throws Exception {
		checkOutput("mutability/immutableArgument.pec");
	}

	@Test
	public void testImmutableMember() throws Exception {
		checkOutput("mutability/immutableMember.pec");
	}

	@Test
	public void testMutable() throws Exception {
		checkOutput("mutability/mutable.pec");
	}

	@Test
	public void testMutableArgument() throws Exception {
		checkOutput("mutability/mutableArgument.pec");
	}

	@Test
	public void testMutableMember() throws Exception {
		checkOutput("mutability/mutableMember.pec");
	}

}

