package presto.translate.oeo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestNative extends BaseOParserTest {

	@Test
	public void testCategory() throws Exception {
		compareResourceOEO("native/category.o");
	}

	@Test
	public void testMethod() throws Exception {
		compareResourceOEO("native/method.o");
	}

	@Test
	public void testReturn() throws Exception {
		compareResourceOEO("native/return.o");
	}

	@Test
	public void testReturnBooleanLiteral() throws Exception {
		compareResourceOEO("native/returnBooleanLiteral.o");
	}

	@Test
	public void testReturnBooleanObject() throws Exception {
		compareResourceOEO("native/returnBooleanObject.o");
	}

	@Test
	public void testReturnBooleanValue() throws Exception {
		compareResourceOEO("native/returnBooleanValue.o");
	}

	@Test
	public void testReturnCharacterLiteral() throws Exception {
		compareResourceOEO("native/returnCharacterLiteral.o");
	}

	@Test
	public void testReturnCharacterObject() throws Exception {
		compareResourceOEO("native/returnCharacterObject.o");
	}

	@Test
	public void testReturnCharacterValue() throws Exception {
		compareResourceOEO("native/returnCharacterValue.o");
	}

	@Test
	public void testReturnDecimalLiteral() throws Exception {
		compareResourceOEO("native/returnDecimalLiteral.o");
	}

	@Test
	public void testReturnIntegerLiteral() throws Exception {
		compareResourceOEO("native/returnIntegerLiteral.o");
	}

	@Test
	public void testReturnIntegerObject() throws Exception {
		compareResourceOEO("native/returnIntegerObject.o");
	}

	@Test
	public void testReturnIntegerValue() throws Exception {
		compareResourceOEO("native/returnIntegerValue.o");
	}

	@Test
	public void testReturnLongObject() throws Exception {
		compareResourceOEO("native/returnLongObject.o");
	}

	@Test
	public void testReturnLongValue() throws Exception {
		compareResourceOEO("native/returnLongValue.o");
	}

	@Test
	public void testReturnStringLiteral() throws Exception {
		compareResourceOEO("native/returnStringLiteral.o");
	}

}

