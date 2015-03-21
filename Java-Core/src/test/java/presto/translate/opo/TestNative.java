package presto.translate.opo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestNative extends BaseOParserTest {

	@Test
	public void testCategory() throws Exception {
		compareResourceOPO("native/category.o");
	}

	@Test
	public void testMethod() throws Exception {
		compareResourceOPO("native/method.o");
	}

	@Test
	public void testReturn() throws Exception {
		compareResourceOPO("native/return.o");
	}

	@Test
	public void testReturnBooleanLiteral() throws Exception {
		compareResourceOPO("native/returnBooleanLiteral.o");
	}

	@Test
	public void testReturnBooleanObject() throws Exception {
		compareResourceOPO("native/returnBooleanObject.o");
	}

	@Test
	public void testReturnBooleanValue() throws Exception {
		compareResourceOPO("native/returnBooleanValue.o");
	}

	@Test
	public void testReturnCharacterLiteral() throws Exception {
		compareResourceOPO("native/returnCharacterLiteral.o");
	}

	@Test
	public void testReturnCharacterObject() throws Exception {
		compareResourceOPO("native/returnCharacterObject.o");
	}

	@Test
	public void testReturnCharacterValue() throws Exception {
		compareResourceOPO("native/returnCharacterValue.o");
	}

	@Test
	public void testReturnDecimalLiteral() throws Exception {
		compareResourceOPO("native/returnDecimalLiteral.o");
	}

	@Test
	public void testReturnIntegerLiteral() throws Exception {
		compareResourceOPO("native/returnIntegerLiteral.o");
	}

	@Test
	public void testReturnIntegerObject() throws Exception {
		compareResourceOPO("native/returnIntegerObject.o");
	}

	@Test
	public void testReturnIntegerValue() throws Exception {
		compareResourceOPO("native/returnIntegerValue.o");
	}

	@Test
	public void testReturnLongObject() throws Exception {
		compareResourceOPO("native/returnLongObject.o");
	}

	@Test
	public void testReturnLongValue() throws Exception {
		compareResourceOPO("native/returnLongValue.o");
	}

	@Test
	public void testReturnStringLiteral() throws Exception {
		compareResourceOPO("native/returnStringLiteral.o");
	}

}

