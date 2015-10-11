package prompto.parser.o;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import prompto.declaration.DeclarationList;
import prompto.grammar.CategoryArgument;
import prompto.grammar.IArgument;
import prompto.grammar.Identifier;
import prompto.type.AnyType;
import prompto.type.BooleanType;
import prompto.type.CategoryType;
import prompto.type.DateTimeType;
import prompto.type.DateType;
import prompto.type.DecimalType;
import prompto.type.IType;
import prompto.type.IntegerType;
import prompto.type.MissingType;
import prompto.type.TextType;
import prompto.utils.IdentifierList;



public class TestAnonymousTypes extends BaseOParserTest { 

	@Before
	public void register() throws Exception {
		DeclarationList stmts = parseString("attribute id: Integer; \r\n" +
				"attribute name: String ;\r\n" +
				"attribute other: String ;\r\n" +
				"category Simple ( name ); \r\n" +
				"category Root(id);\r\n" +
				"category DerivedWithOther(other) extends Root ;\r\n" +
				"category DerivedWithName(name) extends Root ;\r\n");
		stmts.register(context);
	}
	
	@Test
	public void testAnonymousAnyType() throws Exception {
		// any x
		IArgument argument = new CategoryArgument(AnyType.instance(), new Identifier("x"), null);
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
		assertTrue(new CategoryType(new Identifier("Simple")).isAssignableTo(context,st));
		assertTrue(new CategoryType(new Identifier("Root")).isAssignableTo(context,st));
		assertTrue(new CategoryType(new Identifier("DerivedWithOther")).isAssignableTo(context,st));
		assertTrue(new CategoryType(new Identifier("DerivedWithName")).isAssignableTo(context,st));
	}
	
	@Test
	public void testAnonymousAnyTypeWithAttribute() throws Exception {
		// any x with attribute: name
		IdentifierList list = new IdentifierList(new Identifier("name"));
		IArgument argument = new CategoryArgument(AnyType.instance(), new Identifier("x"), list);
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
		assertTrue(new CategoryType(new Identifier("Simple")).isAssignableTo(context,st)); // since Simple has a name
		assertFalse(new CategoryType(new Identifier("Root")).isAssignableTo(context,st)); // since Root has no name
		assertFalse(new CategoryType(new Identifier("DerivedWithOther")).isAssignableTo(context,st)); // since DerivedWithOther has no name
		assertTrue(new CategoryType(new Identifier("DerivedWithName")).isAssignableTo(context,st)); // since DerivedWithName has a name
	}
	
	@Test
	public void testAnonymousCategoryType() throws Exception {
		// Root x
		IArgument argument = new CategoryArgument(new CategoryType(new Identifier("Root")), new Identifier("x"), null);
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
		assertFalse(new CategoryType(new Identifier("Simple")).isAssignableTo(context,st));  // since Simple does not extend Root
		assertTrue(new CategoryType(new Identifier("Root")).isAssignableTo(context,st)); // since Root is Root
		assertTrue(new CategoryType(new Identifier("DerivedWithOther")).isAssignableTo(context,st)); // since DerivedWithOther extends Root
		assertTrue(new CategoryType(new Identifier("DerivedWithName")).isAssignableTo(context,st)); // since DerivedWithName extends Root
	}

	@Test
	public void testAnonymousCategoryTypeWithAttribute() throws Exception {
		// Root x with attribute: name
		IdentifierList list = new IdentifierList(new Identifier("name"));
		IArgument argument = new CategoryArgument(new CategoryType(new Identifier("Root")), new Identifier("test"), list);
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
		assertFalse(new CategoryType(new Identifier("Simple")).isAssignableTo(context,st));  // since Simple does not extend Root
		assertFalse(new CategoryType(new Identifier("Root")).isAssignableTo(context,st)); // since Root has no name
		assertFalse(new CategoryType(new Identifier("DerivedWithOther")).isAssignableTo(context,st)); // since DerivedWithOther has no name
		assertTrue(new CategoryType(new Identifier("DerivedWithName")).isAssignableTo(context,st)); // since DerivedWithName has a name
	}
	
}
