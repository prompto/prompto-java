package presto.parser.e;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import presto.grammar.CategoryArgument;
import presto.grammar.DeclarationList;
import presto.grammar.IArgument;
import presto.grammar.IdentifierList;
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



public class TestAnonymousTypes extends BaseEParserTest { 

	@Before
	public void register() throws Exception {
		DeclarationList stmts = parseString("define id as: Integer attribute\r\n" +
				"define name as: String attribute\r\n" +
				"define other as: String attribute\r\n" +
				"define Simple as: category with attribute: name\r\n" +
				"define Root as: category with attribute: id\r\n" +
				"define DerivedWithOther as: Root with attribute: other\r\n" +
				"define DerivedWithName as: Root with attribute: name\r\n");
		stmts.register(context);
	}
	
	@Test
	public void testAnonymousAnyType() throws Exception {
		// any x
		IArgument argument = new CategoryArgument(AnyType.instance(), "x", null);
		argument.register(context);
		IType st = argument.getType(context);
		assertTrue(st instanceof AnyType);
		assertTrue(BooleanType.instance().isAssignableTo(context,st));
		assertTrue(IntegerType.instance().isAssignableTo(context,st));
		assertTrue(DecimalType.instance().isAssignableTo(context,st));
		assertTrue(TextType.instance().isAssignableTo(context,st));
		assertTrue(DateType.instance().isAssignableTo(context,st));
		assertTrue(DateTimeType.instance().isAssignableTo(context,st));
		assertTrue(MissingType.instance().isAssignableTo(context,st)); // missing type always compatible
		assertTrue(AnyType.instance().isAssignableTo(context,st)); 
		assertTrue(new CategoryType("Simple").isAssignableTo(context,st));
		assertTrue(new CategoryType("Root").isAssignableTo(context,st));
		assertTrue(new CategoryType("DerivedWithOther").isAssignableTo(context,st));
		assertTrue(new CategoryType("DerivedWithName").isAssignableTo(context,st));
	}
	
	@Test
	public void testAnonymousAnyTypeWithAttribute() throws Exception {
		// any x with attribute: name
		IdentifierList list = new IdentifierList("name");
		IArgument argument = new CategoryArgument(AnyType.instance(), "x", list);
		argument.register(context);
		IType st = argument.getType(context);
		assertTrue(st instanceof CategoryType);
		assertFalse(BooleanType.instance().isAssignableTo(context,st));
		assertFalse(IntegerType.instance().isAssignableTo(context,st));
		assertFalse(DecimalType.instance().isAssignableTo(context,st));
		assertFalse(TextType.instance().isAssignableTo(context,st));
		assertFalse(DateType.instance().isAssignableTo(context,st));
		assertFalse(DateTimeType.instance().isAssignableTo(context,st));
		assertTrue(MissingType.instance().isAssignableTo(context,st)); // missing type always compatible
		assertFalse(AnyType.instance().isAssignableTo(context,st)); // any type never compatible
		assertTrue(new CategoryType("Simple").isAssignableTo(context,st)); // since Simple has a name
		assertFalse(new CategoryType("Root").isAssignableTo(context,st)); // since Root has no name
		assertFalse(new CategoryType("DerivedWithOther").isAssignableTo(context,st)); // since DerivedWithOther has no name
		assertTrue(new CategoryType("DerivedWithName").isAssignableTo(context,st)); // since DerivedWithName has a name
	}
	
	@Test
	public void testAnonymousCategoryType() throws Exception {
		// Root x
		IArgument argument = new CategoryArgument(new CategoryType("Root"), "x", null);
		argument.register(context);
		IType st = argument.getType(context);
		assertTrue(st instanceof CategoryType);
		assertFalse(BooleanType.instance().isAssignableTo(context,st));
		assertFalse(IntegerType.instance().isAssignableTo(context,st));
		assertFalse(DecimalType.instance().isAssignableTo(context,st));
		assertFalse(TextType.instance().isAssignableTo(context,st));
		assertFalse(DateType.instance().isAssignableTo(context,st));
		assertFalse(DateTimeType.instance().isAssignableTo(context,st));
		assertTrue(MissingType.instance().isAssignableTo(context,st)); // missing type always compatible
		assertFalse(AnyType.instance().isAssignableTo(context,st)); // any type never compatible
		assertFalse(new CategoryType("Simple").isAssignableTo(context,st));  // since Simple does not extend Root
		assertTrue(new CategoryType("Root").isAssignableTo(context,st)); // since Root is Root
		assertTrue(new CategoryType("DerivedWithOther").isAssignableTo(context,st)); // since DerivedWithOther extends Root
		assertTrue(new CategoryType("DerivedWithName").isAssignableTo(context,st)); // since DerivedWithName extends Root
	}

	@Test
	public void testAnonymousCategoryTypeWithAttribute() throws Exception {
		// Root x with attribute: name
		IdentifierList list = new IdentifierList("name");
		IArgument argument = new CategoryArgument(new CategoryType("Root"), "test", list);
		argument.register(context);
		IType st = argument.getType(context);
		assertTrue(st instanceof CategoryType);
		assertFalse(BooleanType.instance().isAssignableTo(context,st));
		assertFalse(IntegerType.instance().isAssignableTo(context,st));
		assertFalse(DecimalType.instance().isAssignableTo(context,st));
		assertFalse(TextType.instance().isAssignableTo(context,st));
		assertFalse(DateType.instance().isAssignableTo(context,st));
		assertFalse(DateTimeType.instance().isAssignableTo(context,st));
		assertTrue(MissingType.instance().isAssignableTo(context,st)); // missing type always compatible
		assertFalse(AnyType.instance().isAssignableTo(context,st)); // any type never compatible
		assertFalse(new CategoryType("Simple").isAssignableTo(context,st));  // since Simple does not extend Root
		assertFalse(new CategoryType("Root").isAssignableTo(context,st)); // since Root has no name
		assertFalse(new CategoryType("DerivedWithOther").isAssignableTo(context,st)); // since DerivedWithOther has no name
		assertTrue(new CategoryType("DerivedWithName").isAssignableTo(context,st)); // since DerivedWithName has a name
	}
	
}
