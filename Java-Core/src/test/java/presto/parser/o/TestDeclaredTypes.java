package presto.parser.o;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import presto.grammar.DeclarationList;
import presto.grammar.Identifier;
import presto.type.AnyType;
import presto.type.BooleanType;
import presto.type.CategoryType;
import presto.type.DateTimeType;
import presto.type.DateType;
import presto.type.DecimalType;
import presto.type.IType;
import presto.type.IntegerType;
import presto.type.MissingType;
import presto.type.TextType;


 
public class TestDeclaredTypes extends BaseOParserTest {

	@Before
	public void registerCategoryTypes() throws Exception {
		DeclarationList stmts = parseString("attribute id: Integer;" +
				"attribute name: String;" +
				"category Root(id);" +
				"category Derived(name) extends Root;" +
				"category Unrelated(id, name);");
		stmts.register(context);
	}
	
	@Test
	public void testBooleanType() throws Exception {
		IType st = BooleanType.instance();
		assertEquals(st,BooleanType.instance());
		assertTrue(st.isAssignableTo(context, BooleanType.instance()));
		assertFalse(st.isAssignableTo(context, IntegerType.instance())); 
		assertFalse(st.isAssignableTo(context, DecimalType.instance()));
		assertFalse(st.isAssignableTo(context, TextType.instance()));
		assertFalse(st.isAssignableTo(context, DateType.instance()));
		assertFalse(st.isAssignableTo(context, DateTimeType.instance()));
		assertFalse(st.isAssignableTo(context, MissingType.instance()));
		assertTrue(st.isAssignableTo(context, AnyType.instance()));
		assertFalse(st.isAssignableTo(context, new CategoryType(new Identifier("Root"))));
		assertFalse(st.isAssignableTo(context, new CategoryType(new Identifier("Derived"))));
		assertFalse(st.isAssignableTo(context, new CategoryType(new Identifier("Unrelated"))));
	}
	
	@Test
	public void testIntegerType() throws Exception {
		IType st = IntegerType.instance();
		assertEquals(st,IntegerType.instance());
		assertFalse(st.isAssignableTo(context, BooleanType.instance()));
		assertTrue(st.isAssignableTo(context, IntegerType.instance()));
		assertTrue(st.isAssignableTo(context, DecimalType.instance()));
		assertFalse(st.isAssignableTo(context, TextType.instance()));
		assertFalse(st.isAssignableTo(context, DateType.instance()));
		assertFalse(st.isAssignableTo(context, DateTimeType.instance()));
		assertFalse(st.isAssignableTo(context, MissingType.instance()));
		assertTrue(st.isAssignableTo(context, AnyType.instance()));
		assertFalse(st.isAssignableTo(context, new CategoryType(new Identifier("Root"))));
		assertFalse(st.isAssignableTo(context, new CategoryType(new Identifier("Derived"))));
		assertFalse(st.isAssignableTo(context, new CategoryType(new Identifier("Unrelated"))));
	}
	
	@Test
	public void testDecimalType() throws Exception {
		IType st = DecimalType.instance();
		assertEquals(st,DecimalType.instance());
		assertFalse(st.isAssignableTo(context, BooleanType.instance()));
		assertTrue(st.isAssignableTo(context, IntegerType.instance()));
		assertTrue(st.isAssignableTo(context, DecimalType.instance()));
		assertFalse(st.isAssignableTo(context, TextType.instance()));
		assertFalse(st.isAssignableTo(context, DateType.instance()));
		assertFalse(st.isAssignableTo(context, DateTimeType.instance()));
		assertFalse(st.isAssignableTo(context, MissingType.instance()));
		assertTrue(st.isAssignableTo(context, AnyType.instance()));
		assertFalse(st.isAssignableTo(context, new CategoryType(new Identifier("Root"))));
		assertFalse(st.isAssignableTo(context, new CategoryType(new Identifier("Derived"))));
		assertFalse(st.isAssignableTo(context, new CategoryType(new Identifier("Unrelated"))));
	}

	@Test
	public void testStringType() throws Exception {
		IType st = TextType.instance();
		assertEquals(st,TextType.instance());
		assertFalse(st.isAssignableTo(context, BooleanType.instance()));
		assertFalse(st.isAssignableTo(context, IntegerType.instance()));
		assertFalse(st.isAssignableTo(context, DecimalType.instance()));
		assertTrue(st.isAssignableTo(context, TextType.instance()));
		assertFalse(st.isAssignableTo(context, DateType.instance()));
		assertFalse(st.isAssignableTo(context, DateTimeType.instance()));
		assertFalse(st.isAssignableTo(context, MissingType.instance()));
		assertTrue(st.isAssignableTo(context, AnyType.instance()));
		assertFalse(st.isAssignableTo(context, new CategoryType(new Identifier("Root"))));
		assertFalse(st.isAssignableTo(context, new CategoryType(new Identifier("Derived"))));
		assertFalse(st.isAssignableTo(context, new CategoryType(new Identifier("Unrelated"))));
	}
	
	@Test
	public void testDateType() throws Exception {
		IType st = DateType.instance();
		assertEquals(st,DateType.instance());
		assertFalse(st.isAssignableTo(context, BooleanType.instance()));
		assertFalse(st.isAssignableTo(context, IntegerType.instance()));
		assertFalse(st.isAssignableTo(context, DecimalType.instance()));
		assertFalse(st.isAssignableTo(context, TextType.instance()));
		assertTrue(st.isAssignableTo(context, DateType.instance()));
		assertFalse(st.isAssignableTo(context, DateTimeType.instance()));
		assertFalse(st.isAssignableTo(context, MissingType.instance()));
		assertTrue(st.isAssignableTo(context, AnyType.instance()));
		assertFalse(st.isAssignableTo(context, new CategoryType(new Identifier("Root"))));
		assertFalse(st.isAssignableTo(context, new CategoryType(new Identifier("Derived"))));
		assertFalse(st.isAssignableTo(context, new CategoryType(new Identifier("Unrelated"))));
	}
	
	@Test 
	public void testInstantType() throws Exception {
		IType st = DateTimeType.instance();
		assertEquals(st,DateTimeType.instance());
		assertFalse(st.isAssignableTo(context, BooleanType.instance()));
		assertFalse(st.isAssignableTo(context, IntegerType.instance()));
		assertFalse(st.isAssignableTo(context, DecimalType.instance()));
		assertFalse(st.isAssignableTo(context, TextType.instance()));
		assertTrue(st.isAssignableTo(context, DateType.instance()));
		assertTrue(st.isAssignableTo(context, DateTimeType.instance()));
		assertFalse(st.isAssignableTo(context, MissingType.instance()));
		assertTrue(st.isAssignableTo(context, AnyType.instance()));
		assertFalse(st.isAssignableTo(context, new CategoryType(new Identifier("Root"))));
		assertFalse(st.isAssignableTo(context, new CategoryType(new Identifier("Derived"))));
		assertFalse(st.isAssignableTo(context, new CategoryType(new Identifier("Unrelated"))));
	}
	
	@Test
	public void testMissingType() throws Exception {
		IType st = MissingType.instance();
		assertEquals(st,MissingType.instance());
		assertTrue(st.isAssignableTo(context, BooleanType.instance()));
		assertTrue(st.isAssignableTo(context, IntegerType.instance()));
		assertTrue(st.isAssignableTo(context, DecimalType.instance()));
		assertTrue(st.isAssignableTo(context, TextType.instance()));
		assertTrue(st.isAssignableTo(context, DateType.instance()));
		assertTrue(st.isAssignableTo(context, DateTimeType.instance()));
		assertTrue(st.isAssignableTo(context, MissingType.instance()));
		assertTrue(st.isAssignableTo(context, AnyType.instance()));
		assertTrue(st.isAssignableTo(context, new CategoryType(new Identifier("Root"))));
		assertTrue(st.isAssignableTo(context, new CategoryType(new Identifier("Derived"))));
		assertTrue(st.isAssignableTo(context, new CategoryType(new Identifier("Unrelated"))));
	}

	@Test
	public void testRootCategoryType() throws Exception {
		IType st = new CategoryType(new Identifier("Root"));
		assertEquals(st,new CategoryType(new Identifier("Root")));
		assertFalse(st.isAssignableTo(context, BooleanType.instance()));
		assertFalse(st.isAssignableTo(context, IntegerType.instance()));
		assertFalse(st.isAssignableTo(context, DecimalType.instance()));
		assertFalse(st.isAssignableTo(context, TextType.instance()));
		assertFalse(st.isAssignableTo(context, DateType.instance()));
		assertFalse(st.isAssignableTo(context, DateTimeType.instance()));
		assertFalse(st.isAssignableTo(context, MissingType.instance()));
		assertTrue(st.isAssignableTo(context, AnyType.instance()));
		assertTrue(st.isAssignableTo(context, new CategoryType(new Identifier("Root"))));
		assertFalse(st.isAssignableTo(context, new CategoryType(new Identifier("Derived"))));
		assertFalse(st.isAssignableTo(context, new CategoryType(new Identifier("Unrelated"))));
	}

	@Test
	public void testDerivedCategoryType() throws Exception {
		IType st = new CategoryType(new Identifier("Derived"));
		assertEquals(st,new CategoryType(new Identifier("Derived")));
		assertFalse(st.isAssignableTo(context, BooleanType.instance()));
		assertFalse(st.isAssignableTo(context, IntegerType.instance()));
		assertFalse(st.isAssignableTo(context, DecimalType.instance()));
		assertFalse(st.isAssignableTo(context, TextType.instance()));
		assertFalse(st.isAssignableTo(context, DateType.instance()));
		assertFalse(st.isAssignableTo(context, DateTimeType.instance()));
		assertFalse(st.isAssignableTo(context, MissingType.instance()));
		assertTrue(st.isAssignableTo(context, AnyType.instance()));
		assertTrue(st.isAssignableTo(context, new CategoryType(new Identifier("Root"))));
		assertTrue(st.isAssignableTo(context, new CategoryType(new Identifier("Derived"))));
		assertFalse(st.isAssignableTo(context, new CategoryType(new Identifier("Unrelated"))));
	}
	
	@Test
	public void testUnrelatedCategoryType() throws Exception {
		IType st = new CategoryType(new Identifier("Unrelated"));
		assertEquals(st,new CategoryType(new Identifier("Unrelated")));
		assertFalse(st.isAssignableTo(context, BooleanType.instance()));
		assertFalse(st.isAssignableTo(context, IntegerType.instance()));
		assertFalse(st.isAssignableTo(context, DecimalType.instance()));
		assertFalse(st.isAssignableTo(context, TextType.instance()));
		assertFalse(st.isAssignableTo(context, DateType.instance()));
		assertFalse(st.isAssignableTo(context, DateTimeType.instance()));
		assertFalse(st.isAssignableTo(context, MissingType.instance()));
		assertTrue(st.isAssignableTo(context, AnyType.instance()));
		assertFalse(st.isAssignableTo(context, new CategoryType(new Identifier("Root"))));
		assertFalse(st.isAssignableTo(context, new CategoryType(new Identifier("Derived"))));
		assertTrue(st.isAssignableTo(context, new CategoryType(new Identifier("Unrelated"))));
	}

}
