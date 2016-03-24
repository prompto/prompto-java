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
	public void testInterpretedCategory() throws Exception {
		checkInterpretedOutput("native/category.poc");
	}

	@Test
	public void testInterpretedMethod() throws Exception {
		checkInterpretedOutput("native/method.poc");
	}

	@Test
	public void testInterpretedReturnBooleanLiteral() throws Exception {
		checkInterpretedOutput("native/returnBooleanLiteral.poc");
	}

	@Test
	public void testInterpretedReturnBooleanObject() throws Exception {
		checkInterpretedOutput("native/returnBooleanObject.poc");
	}

	@Test
	public void testInterpretedReturnBooleanValue() throws Exception {
		checkInterpretedOutput("native/returnBooleanValue.poc");
	}

	@Test
	public void testInterpretedReturnCharacterLiteral() throws Exception {
		checkInterpretedOutput("native/returnCharacterLiteral.poc");
	}

	@Test
	public void testInterpretedReturnCharacterObject() throws Exception {
		checkInterpretedOutput("native/returnCharacterObject.poc");
	}

	@Test
	public void testInterpretedReturnCharacterValue() throws Exception {
		checkInterpretedOutput("native/returnCharacterValue.poc");
	}

	@Test
	public void testInterpretedReturnDecimalLiteral() throws Exception {
		checkInterpretedOutput("native/returnDecimalLiteral.poc");
	}

	@Test
	public void testInterpretedReturnIntegerLiteral() throws Exception {
		checkInterpretedOutput("native/returnIntegerLiteral.poc");
	}

	@Test
	public void testInterpretedReturnIntegerObject() throws Exception {
		checkInterpretedOutput("native/returnIntegerObject.poc");
	}

	@Test
	public void testInterpretedReturnIntegerValue() throws Exception {
		checkInterpretedOutput("native/returnIntegerValue.poc");
	}

	@Test
	public void testInterpretedReturnLongLiteral() throws Exception {
		checkInterpretedOutput("native/returnLongLiteral.poc");
	}

	@Test
	public void testInterpretedReturnLongObject() throws Exception {
		checkInterpretedOutput("native/returnLongObject.poc");
	}

	@Test
	public void testInterpretedReturnLongValue() throws Exception {
		checkInterpretedOutput("native/returnLongValue.poc");
	}

	@Test
	public void testInterpretedReturnStringLiteral() throws Exception {
		checkInterpretedOutput("native/returnStringLiteral.poc");
	}

}

