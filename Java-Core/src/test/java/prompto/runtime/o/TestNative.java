package prompto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.o.BaseOParserTest;
import prompto.runtime.utils.Out;

public class TestNative extends BaseOParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testCategory() throws Exception {
		checkOutput("native/category.poc");
	}

	@Test
	public void testMethod() throws Exception {
		checkOutput("native/method.poc");
	}

	@Test
	public void testReturnBooleanLiteral() throws Exception {
		checkOutput("native/returnBooleanLiteral.poc");
	}

	@Test
	public void testReturnBooleanObject() throws Exception {
		checkOutput("native/returnBooleanObject.poc");
	}

	@Test
	public void testReturnBooleanValue() throws Exception {
		checkOutput("native/returnBooleanValue.poc");
	}

	@Test
	public void testReturnCharacterLiteral() throws Exception {
		checkOutput("native/returnCharacterLiteral.poc");
	}

	@Test
	public void testReturnCharacterObject() throws Exception {
		checkOutput("native/returnCharacterObject.poc");
	}

	@Test
	public void testReturnCharacterValue() throws Exception {
		checkOutput("native/returnCharacterValue.poc");
	}

	@Test
	public void testReturnDecimalLiteral() throws Exception {
		checkOutput("native/returnDecimalLiteral.poc");
	}

	@Test
	public void testReturnIntegerLiteral() throws Exception {
		checkOutput("native/returnIntegerLiteral.poc");
	}

	@Test
	public void testReturnIntegerObject() throws Exception {
		checkOutput("native/returnIntegerObject.poc");
	}

	@Test
	public void testReturnIntegerValue() throws Exception {
		checkOutput("native/returnIntegerValue.poc");
	}

	@Test
	public void testReturnLongObject() throws Exception {
		checkOutput("native/returnLongObject.poc");
	}

	@Test
	public void testReturnLongValue() throws Exception {
		checkOutput("native/returnLongValue.poc");
	}

	@Test
	public void testReturnStringLiteral() throws Exception {
		checkOutput("native/returnStringLiteral.poc");
	}

}

