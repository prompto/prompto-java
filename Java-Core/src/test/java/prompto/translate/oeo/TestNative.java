package prompto.translate.oeo;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestNative extends BaseOParserTest {

	@Test
	public void testCategory() throws Exception {
		compareResourceEOE("native/category.poc");
	}

	@Test
	public void testMethod() throws Exception {
		compareResourceEOE("native/method.poc");
	}

	@Test
	public void testReturn() throws Exception {
		compareResourceEOE("native/return.poc");
	}

	@Test
	public void testReturnBooleanLiteral() throws Exception {
		compareResourceEOE("native/returnBooleanLiteral.poc");
	}

	@Test
	public void testReturnBooleanObject() throws Exception {
		compareResourceEOE("native/returnBooleanObject.poc");
	}

	@Test
	public void testReturnBooleanValue() throws Exception {
		compareResourceEOE("native/returnBooleanValue.poc");
	}

	@Test
	public void testReturnCharacterLiteral() throws Exception {
		compareResourceEOE("native/returnCharacterLiteral.poc");
	}

	@Test
	public void testReturnCharacterObject() throws Exception {
		compareResourceEOE("native/returnCharacterObject.poc");
	}

	@Test
	public void testReturnCharacterValue() throws Exception {
		compareResourceEOE("native/returnCharacterValue.poc");
	}

	@Test
	public void testReturnDecimalLiteral() throws Exception {
		compareResourceEOE("native/returnDecimalLiteral.poc");
	}

	@Test
	public void testReturnIntegerLiteral() throws Exception {
		compareResourceEOE("native/returnIntegerLiteral.poc");
	}

	@Test
	public void testReturnIntegerObject() throws Exception {
		compareResourceEOE("native/returnIntegerObject.poc");
	}

	@Test
	public void testReturnIntegerValue() throws Exception {
		compareResourceEOE("native/returnIntegerValue.poc");
	}

	@Test
	public void testReturnLongObject() throws Exception {
		compareResourceEOE("native/returnLongObject.poc");
	}

	@Test
	public void testReturnLongValue() throws Exception {
		compareResourceEOE("native/returnLongValue.poc");
	}

	@Test
	public void testReturnStringLiteral() throws Exception {
		compareResourceEOE("native/returnStringLiteral.poc");
	}

}

