package prompto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.o.BaseOParserTest;
import prompto.runtime.utils.Out;

public class TestMutability extends BaseOParserTest {

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
		checkInterpretedOutput("mutability/immutable.poc");
	}

	@Test
	public void testInterpretedImmutableArgument() throws Exception {
		checkInterpretedOutput("mutability/immutableArgument.poc");
	}

	@Test
	public void testInterpretedImmutableMember() throws Exception {
		checkInterpretedOutput("mutability/immutableMember.poc");
	}

	@Test
	public void testInterpretedMutable() throws Exception {
		checkInterpretedOutput("mutability/mutable.poc");
	}

	@Test
	public void testInterpretedMutableArgument() throws Exception {
		checkInterpretedOutput("mutability/mutableArgument.poc");
	}

	@Test
	public void testInterpretedMutableMember() throws Exception {
		checkInterpretedOutput("mutability/mutableMember.poc");
	}

}

