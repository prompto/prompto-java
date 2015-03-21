package presto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.o.BaseOParserTest;
import presto.runtime.utils.Out;

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
		checkOutput("native/category.o");
	}

	@Test
	public void testMethod() throws Exception {
		checkOutput("native/method.o");
	}

	@Test
	public void testReturnBooleanLiteral() throws Exception {
		checkOutput("native/returnBooleanLiteral.o");
	}

	@Test
	public void testReturnBooleanObject() throws Exception {
		checkOutput("native/returnBooleanObject.o");
	}

	@Test
	public void testReturnBooleanValue() throws Exception {
		checkOutput("native/returnBooleanValue.o");
	}

	@Test
	public void testReturnCharacterLiteral() throws Exception {
		checkOutput("native/returnCharacterLiteral.o");
	}

	@Test
	public void testReturnCharacterObject() throws Exception {
		checkOutput("native/returnCharacterObject.o");
	}

	@Test
	public void testReturnCharacterValue() throws Exception {
		checkOutput("native/returnCharacterValue.o");
	}

	@Test
	public void testReturnDecimalLiteral() throws Exception {
		checkOutput("native/returnDecimalLiteral.o");
	}

	@Test
	public void testReturnIntegerLiteral() throws Exception {
		checkOutput("native/returnIntegerLiteral.o");
	}

	@Test
	public void testReturnIntegerObject() throws Exception {
		checkOutput("native/returnIntegerObject.o");
	}

	@Test
	public void testReturnIntegerValue() throws Exception {
		checkOutput("native/returnIntegerValue.o");
	}

	@Test
	public void testReturnLongObject() throws Exception {
		checkOutput("native/returnLongObject.o");
	}

	@Test
	public void testReturnLongValue() throws Exception {
		checkOutput("native/returnLongValue.o");
	}

	@Test
	public void testReturnStringLiteral() throws Exception {
		checkOutput("native/returnStringLiteral.o");
	}

}

