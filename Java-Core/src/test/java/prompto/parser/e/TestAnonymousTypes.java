package prompto.parser.e;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import prompto.argument.CategoryArgument;
import prompto.argument.ExtendedArgument;
import prompto.argument.IArgument;
import prompto.declaration.DeclarationList;
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



public class TestAnonymousTypes extends BaseEParserTest { 

	@Before
	public void register() throws Exception {
		DeclarationList stmts = parseString("define id as Integer attribute\r\n" +
				"define name as String attribute\r\n" +
				"define other as String attribute\r\n" +
				"define Simple as category with attribute name\r\n" +
				"define Root as category with attribute id\r\n" +
				"define DerivedWithOther as Root with attribute other\r\n" +
				"define DerivedWithName as Root with attribute name\r\n");
		stmts.register(context);
	}
	
	@Test
	public void testAnonymousAnyType() throws Exception {
		// any x
		IArgument argument = new CategoryArgument(AnyType.instance(), new Identifier("x"));
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
		IArgument argument = new ExtendedArgument(AnyType.instance(), new Identifier("x"), list);
		argument.register(context);
		IType st = argument.getType(context);
		assertTrue(st instanceof CategoryType);
		assertFalse(BooleanType.instance().isAssignableTo(context,st));
		assertFalse(IntegerType.instance().isAssignableTo(context,st));
		assertFalse(DecimalType.instance().isAssignableTo(context,st));
		assertFalse(TextType.instance().isAssignableTo(context,st));
		assertFalse(DateType.instance().isAssignableTo(context,st));
		assertFalse(DateTimeType.instance().isAssignableTo(context,st));
		assertFalse(MissingType.instance().isAssignableTo(context,st)); // missing type assertFalse compatible
		assertFalse(AnyType.instance().isAssignableTo(context,st)); // any type never compatible
		assertTrue(new CategoryType(new Identifier("Simple")).isAssignableTo(context,st)); // since Simple has a name
		assertFalse(new CategoryType(new Identifier("Root")).isAssignableTo(context,st)); // since Root has no name
		assertFalse(new CategoryType(new Identifier("DerivedWithOther")).isAssignableTo(context,st)); // since DerivedWithOther has no name
		assertTrue(new CategoryType(new Identifier("DerivedWithName")).isAssignableTo(context,st)); // since DerivedWithName has a name
	}
	
	@Test
	public void testAnonymousCategoryType() throws Exception {
		// Root x
		IArgument argument = new CategoryArgument(new CategoryType(new Identifier("Root")), new Identifier("x"));
		argument.register(context);
		IType st = argument.getType(context);
		assertTrue(st instanceof CategoryType);
		assertFalse(BooleanType.instance().isAssignableTo(context,st));
		assertFalse(IntegerType.instance().isAssignableTo(context,st));
		assertFalse(DecimalType.instance().isAssignableTo(context,st));
		assertFalse(TextType.instance().isAssignableTo(context,st));
		assertFalse(DateType.instance().isAssignableTo(context,st));
		assertFalse(DateTimeType.instance().isAssignableTo(context,st));
		assertFalse(MissingType.instance().isAssignableTo(context,st)); // missing type assertFalse compatible
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
		IArgument argument = new ExtendedArgument(new CategoryType(new Identifier("Root")), new Identifier("test"), list);
		argument.register(context);
		IType st = argument.getType(context);
		assertTrue(st instanceof CategoryType);
		assertFalse(BooleanType.instance().isAssignableTo(context,st));
		assertFalse(IntegerType.instance().isAssignableTo(context,st));
		assertFalse(DecimalType.instance().isAssignableTo(context,st));
		assertFalse(TextType.instance().isAssignableTo(context,st));
		assertFalse(DateType.instance().isAssignableTo(context,st));
		assertFalse(DateTimeType.instance().isAssignableTo(context,st));
		assertFalse(MissingType.instance().isAssignableTo(context,st)); // missing type always compatible
		assertFalse(AnyType.instance().isAssignableTo(context,st)); // any type never compatible
		assertFalse(new CategoryType(new Identifier("Simple")).isAssignableTo(context,st));  // since Simple does not extend Root
		assertFalse(new CategoryType(new Identifier("Root")).isAssignableTo(context,st)); // since Root has no name
		assertFalse(new CategoryType(new Identifier("DerivedWithOther")).isAssignableTo(context,st)); // since DerivedWithOther has no name
		assertTrue(new CategoryType(new Identifier("DerivedWithName")).isAssignableTo(context,st)); // since DerivedWithName has a name
	}
	
}
