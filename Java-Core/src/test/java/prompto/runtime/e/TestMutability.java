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
	public void testInterpretedImmutable() throws Exception {
		checkInterpretedOutput("mutability/immutable.pec");
	}

	@Test
	public void testInterpretedImmutableArgument() throws Exception {
		checkInterpretedOutput("mutability/immutableArgument.pec");
	}

	@Test
	public void testInterpretedImmutableMember() throws Exception {
		checkInterpretedOutput("mutability/immutableMember.pec");
	}

	@Test
	public void testInterpretedMutable() throws Exception {
		checkInterpretedOutput("mutability/mutable.pec");
	}

	@Test
	public void testInterpretedMutableArgument() throws Exception {
		checkInterpretedOutput("mutability/mutableArgument.pec");
	}

	@Test
	public void testInterpretedMutableMember() throws Exception {
		checkInterpretedOutput("mutability/mutableMember.pec");
	}

}

