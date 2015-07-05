// generated: 2015-07-05T23:01:01.041
package prompto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.o.BaseOParserTest;
import prompto.runtime.utils.Out;

public class TestMethods extends BaseOParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testAnonymous() throws Exception {
		checkOutput("methods/anonymous.poc");
	}

	@Test
	public void testAttribute() throws Exception {
		checkOutput("methods/attribute.poc");
	}

	@Test
	public void testDefault() throws Exception {
		checkOutput("methods/default.poc");
	}

	@Test
	public void testE_as_e_bug() throws Exception {
		checkOutput("methods/e_as_e_bug.poc");
	}

	@Test
	public void testExpressionWith() throws Exception {
		checkOutput("methods/expressionWith.poc");
	}

	@Test
	public void testImplicit() throws Exception {
		checkOutput("methods/implicit.poc");
	}

	@Test
	public void testMember() throws Exception {
		checkOutput("methods/member.poc");
	}

	@Test
	public void testPolymorphic_abstract() throws Exception {
		checkOutput("methods/polymorphic_abstract.poc");
	}

	@Test
	public void testPolymorphic_implicit() throws Exception {
		checkOutput("methods/polymorphic_implicit.poc");
	}

	@Test
	public void testPolymorphic_named() throws Exception {
		checkOutput("methods/polymorphic_named.poc");
	}

	@Test
	public void testPolymorphic_runtime() throws Exception {
		checkOutput("methods/polymorphic_runtime.poc");
	}

	@Test
	public void testSpecified() throws Exception {
		checkOutput("methods/specified.poc");
	}

}

