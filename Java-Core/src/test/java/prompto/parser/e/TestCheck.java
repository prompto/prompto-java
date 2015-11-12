package prompto.parser.e;

import static org.junit.Assert.*;

import org.junit.Test;

import prompto.declaration.DeclarationList;
import prompto.error.SyntaxError;



public class TestCheck extends BaseEParserTest {

	@Test
	public void testNativeAttribute() throws Exception {
		DeclarationList stmts = parseString("define id as Integer attribute");
		stmts.register(context);
		stmts.check(context);
	}

	@Test
	public void testUndeclaredCategoryAttribute() throws Exception {
		DeclarationList stmts = parseString("define person as Person attribute");
		stmts.register(context);
		try {
			stmts.check(context);
			fail("Should fail since Person is not declared !");
		} catch (SyntaxError e) {
			
		}
	}
	
	@Test
	public void testMethodAttribute() throws Exception {
		DeclarationList stmts = parseString("define name as Text attribute\r\n" +
				"define printName as method receiving name doing:\r\n" +
				"\tprint with \"name\" + name as value\r\n" +
				"define Person as category with attribute printName");
		stmts.register(context);
		try {
			stmts.check(context);
			fail("Should fail since printName is not a category !");
		} catch (SyntaxError e) {
			
		}
	}

	@Test
	public void testCategoryAttribute() throws Exception {
		DeclarationList stmts = parseString("define id as Integer attribute\r\n" +
				"define Person as category with attribute id\r\n" +
				"define person as Person attribute");
		stmts.register(context);
		stmts.check(context);
	}

	
	@Test
	public void testCategoryWithUndeclaredDerived() throws Exception {
		DeclarationList stmts = parseString("define Employee as Person");
		try {
			stmts.register(context);
			stmts.check(context);
			fail("Should fail since Person not declared !");
		} catch (SyntaxError e) {
			
		}
	}

	@Test
	public void testCategoryWithUndeclaredAttribute() throws Exception {
		DeclarationList stmts = parseString("define Person as category with attribute id");
		try {
			stmts.register(context);
			stmts.check(context);
			fail("Should fail since id not declared !");
		} catch (SyntaxError e) {
			
		}
	}

	@Test
	public void testCategory() throws Exception {
		DeclarationList stmts = parseString("define id as Integer attribute\r\n" +
				"define Person as category with attribute id\r\n" +
				"define Employee as Person");
		stmts.register(context);
		stmts.check(context);
	}

	@Test
	public void testMethodWithUndeclaredAttribute() throws Exception {
		DeclarationList stmts = parseString("define printName as method receiving name doing:\r\n" +
				"\tprint with \"name\" + name as value");
		try {
			stmts.register(context);
			stmts.check(context);
			fail("Should fail since name not declared !");
		} catch (SyntaxError e) {
			
		}
	}
	
	@Test
	public void testMethod() throws Exception {
		DeclarationList stmts = parseString("define print as native method receiving Text value doing:\r\n" +
					"\tJava: System.out.println(value);\r\n" +
					"define name as Text attribute\r\n" +
					"define printName as method receiving name doing:\r\n" +
					"\tprint with \"name\" + name as value" );
		stmts.register(context);
		stmts.check(context);
	}

	@Test
	public void testList() throws Exception {
		DeclarationList stmts = parseString("define testMethod as method receiving Text value doing:\r\n" +
					"\tlist = [ \"john\" , \"jim\" ]\r\n" +
					"\telem = list[1]\r\n");
		stmts.register(context);
		stmts.check(context);
	}

	@Test
	public void testDict() throws Exception {
		DeclarationList stmts = parseString("define testMethod as method receiving Text value doing:\r\n" +
					"\tdict = { \"john\":123, \"jim\":345 }\r\n" +
					"\telem = dict[\"john\"]\r\n");
		stmts.register(context);
		stmts.check(context);
	}
	
	@Test
	public void testFetchOne() throws Exception {
		DeclarationList stmts = parseString("define name as Text attribute\r\n" +
				"define Person as category with attribute name\r\n" +
				"define testMethod as method doing:\r\n" +
					"\ta = \"john\"\r\n" +
					"\tb = fetch one Person where name = a\r\n");
		stmts.register(context);
		stmts.check(context);
	}
	
	@Test
	public void testFetchAll() throws Exception {
		DeclarationList stmts = parseString("define name as Text attribute\r\n" +
				"define Person as category with attribute name\r\n" +
				"define testMethod as method doing:\r\n" +
					"\ta = \"john\"\r\n" +
					"\tb = fetch all Person where name = a\r\n");
		stmts.register(context);
		stmts.check(context);
	}


}
