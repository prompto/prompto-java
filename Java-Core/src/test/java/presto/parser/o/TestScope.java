package presto.parser.o;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import presto.declaration.AttributeDeclaration;
import presto.declaration.CategoryDeclaration;
import presto.declaration.IDeclaration;
import presto.error.SyntaxError;
import presto.grammar.DeclarationList;
import presto.runtime.Context.MethodDeclarationMap;


public class TestScope extends BaseOParserTest {

	@Test(expected=SyntaxError.class)
	public void testAttribute() throws Exception {
		assertNull(context.getRegisteredDeclaration(IDeclaration.class, "id"));
		DeclarationList stmts = parseString("attribute id: Integer; ");
		assertNotNull(stmts);
		stmts.register(context);
		IDeclaration actual = context.getRegisteredDeclaration(IDeclaration.class, "id");
		assertNotNull(actual);
		assertTrue(actual instanceof AttributeDeclaration);
		stmts.register(context);
	}
	
	@Test(expected=SyntaxError.class)
	public void testCategory() throws Exception {
		assertNull(context.getRegisteredDeclaration(IDeclaration.class, "Person"));
		DeclarationList stmts = parseString("category Person(id, name);");
		assertNotNull(stmts);
		stmts.register(context);
		IDeclaration actual = context.getRegisteredDeclaration(IDeclaration.class, "Person");
		assertNotNull(actual);
		assertTrue(actual instanceof CategoryDeclaration);
		stmts.register(context);
	}
	
	@Test
	public void testMethod() throws Exception {
		assertNull(context.getRegisteredDeclaration(IDeclaration.class, "printName"));
		DeclarationList stmts = parseString("attribute name: Text;"
				+ "method printName( name ) {"
				+ "print (value=name); }");
		assertNotNull(stmts);
		stmts.register(context);
		IDeclaration actual = context.getRegisteredDeclaration(IDeclaration.class, "printName");
		assertNotNull(actual);
		assertTrue(actual instanceof MethodDeclarationMap);
		stmts = parseString("method printName (Person p ) {"
				+ "print (value = \"person\" + p.name ); } ");
		assertNotNull(stmts);
		stmts.register(context);
	}
}
