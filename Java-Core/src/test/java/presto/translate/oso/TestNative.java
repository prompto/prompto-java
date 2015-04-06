package presto.translate.oso;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestNative extends BaseOParserTest {

	@Test
	public void testCategory() throws Exception {
		compareResourceOSO("native/category.poc");
	}

	@Test
	public void testMethod() throws Exception {
		compareResourceOSO("native/method.poc");
	}

	@Test
	public void testReturn() throws Exception {
		compareResourceOSO("native/return.poc");
	}

	@Test
	public void testReturnBooleanLiteral() throws Exception {
		compareResourceOSO("native/returnBooleanLiteral.poc");
	}

	@Test
	public void testReturnBooleanObject() throws Exception {
		compareResourceOSO("native/returnBooleanObject.poc");
	}

	@Test
	public void testReturnBooleanValue() throws Exception {
		compareResourceOSO("native/returnBooleanValue.poc");
	}

	@Test
	public void testReturnCharacterLiteral() throws Exception {
		compareResourceOSO("native/returnCharacterLiteral.poc");
	}

	@Test
	public void testReturnCharacterObject() throws Exception {
		compareResourceOSO("native/returnCharacterObject.poc");
	}

	@Test
	public void testReturnCharacterValue() throws Exception {
		compareResourceOSO("native/returnCharacterValue.poc");
	}

	@Test
	public void testReturnDecimalLiteral() throws Exception {
		compareResourceOSO("native/returnDecimalLiteral.poc");
	}

	@Test
	public void testReturnIntegerLiteral() throws Exception {
		compareResourceOSO("native/returnIntegerLiteral.poc");
	}

	@Test
	public void testReturnIntegerObject() throws Exception {
		compareResourceOSO("native/returnIntegerObject.poc");
	}

	@Test
	public void testReturnIntegerValue() throws Exception {
		compareResourceOSO("native/returnIntegerValue.poc");
	}

	@Test
	public void testReturnLongObject() throws Exception {
		compareResourceOSO("native/returnLongObject.poc");
	}

	@Test
	public void testReturnLongValue() throws Exception {
		compareResourceOSO("native/returnLongValue.poc");
	}

	@Test
	public void testReturnStringLiteral() throws Exception {
		compareResourceOSO("native/returnStringLiteral.poc");
	}

}

