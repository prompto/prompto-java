package presto.parser.e;

import static org.junit.Assert.*;

import org.junit.Test;

import presto.grammar.DeclarationList;



public class TestParserFiles extends BaseEParserTest {

	@Test
	public void testEmpty() throws Exception {
		DeclarationList stmts = parseString("");
		assertNotNull(stmts);
		assertEquals(0,stmts.size());
	}
	
	@Test
	public void testNative() throws Exception {
		DeclarationList stmts = parseResource("native/method.e");
		assertNotNull(stmts);
		assertEquals(2,stmts.size());
	}

	@Test
	public void testSpecified() throws Exception {
		DeclarationList stmts = parseResource("methods/specified.e");
		assertNotNull(stmts);
		assertEquals(6,stmts.size());
	}

	@Test
	public void testAttribute() throws Exception {
		DeclarationList stmts = parseResource("methods/attribute.e");
		assertNotNull(stmts);
		assertEquals(6,stmts.size());
	}

	@Test
	public void testImplicit() throws Exception {
		DeclarationList stmts = parseResource("methods/implicit.e");
		assertNotNull(stmts);
		assertEquals(6,stmts.size());
	}
	
	@Test
	public void testPolymorphicImplicit() throws Exception {
		DeclarationList stmts = parseResource("methods/polymorphic_implicit.e");
		assertNotNull(stmts);
		assertEquals(12,stmts.size());
	}
	
	@Test
	public void testEnumeratedCategory() throws Exception {
		DeclarationList stmts = parseResource("enums/categoryEnum.e");
		assertNotNull(stmts);
		assertEquals(5,stmts.size());
	}

}
