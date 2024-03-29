package prompto.parser.o;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.stream.Stream;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalTime;
import org.joda.time.tz.ZoneInfoProvider;
import org.junit.Test;

import prompto.declaration.AttributeDeclaration;
import prompto.declaration.CategoryDeclaration;
import prompto.declaration.ConcreteMethodDeclaration;
import prompto.declaration.NativeMethodDeclaration;
import prompto.expression.ConstructorExpression;
import prompto.expression.IExpression;
import prompto.expression.InstanceExpression;
import prompto.expression.MemberSelector;
import prompto.expression.NativeSymbol;
import prompto.expression.PlusExpression;
import prompto.expression.TernaryExpression;
import prompto.grammar.Argument;
import prompto.grammar.ArgumentList;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoDate;
import prompto.intrinsic.PromptoDateTime;
import prompto.intrinsic.PromptoTime;
import prompto.literal.BooleanLiteral;
import prompto.literal.DateLiteral;
import prompto.literal.DateTimeLiteral;
import prompto.literal.DecimalLiteral;
import prompto.literal.DictLiteral;
import prompto.literal.HexaLiteral;
import prompto.literal.IntegerLiteral;
import prompto.literal.ListLiteral;
import prompto.literal.PeriodLiteral;
import prompto.literal.RangeLiteral;
import prompto.literal.TextLiteral;
import prompto.literal.TimeLiteral;
import prompto.literal.TupleLiteral;
import prompto.literal.VersionLiteral;
import prompto.param.CategoryParameter;
import prompto.param.ExtendedParameter;
import prompto.param.IParameter;
import prompto.param.ITypedParameter;
import prompto.param.ParameterList;
import prompto.parser.Dialect;
import prompto.parser.OCleverParser;
import prompto.parser.OPromptoBuilder;
import prompto.runtime.Context;
import prompto.statement.AssignInstanceStatement;
import prompto.statement.IStatement;
import prompto.statement.NativeCall;
import prompto.statement.UnresolvedCall;
import prompto.type.CategoryType;
import prompto.type.ListType;
import prompto.utils.CodeWriter;
import prompto.utils.ExpressionList;
import prompto.utils.IdentifierList;


public class TestParserAtoms {

	@Test
	public void parsesComplexTuple() throws Exception {
		String statement = "(1,\"John\",'12:12:12')";
		OTestParser parser = new OTestParser(statement);
		TupleLiteral literal = parser.parse_tuple_literal();
		assertNotNull(literal);
		ExpressionList list = ((TupleLiteral)literal).getExpressions();
		assertEquals("1",list.get(0).toString());
		assertEquals("\"John\"",list.get(1).toString());
		assertEquals("'12:12:12'",list.get(2).toString());
		assertEquals( "(1, \"John\", '12:12:12')", literal.toString());
	}
	
	@Test
	public void parsesRange() throws Exception {
		String statement = "[1..100]";
		OTestParser parser = new OTestParser(statement);
		RangeLiteral rl = parser.parse_range_literal();
		assertNotNull(rl);
		assertEquals("1",rl.getFirst().toString());
		assertEquals("100",rl.getLast().toString());
		CodeWriter writer = new CodeWriter(Dialect.O, null);
		rl.toDialect(writer);
		assertEquals("[1..100]", writer.toString());
	}

	@Test
	public void parsesAttribute() throws Exception {
		String statement = "attribute id : Integer; ";
		OTestParser parser = new OTestParser(statement);
		AttributeDeclaration ad = parser.parse_attribute_declaration();
		assertNotNull(ad);
		assertEquals("id",ad.getId().toString());
		assertNotNull(ad.getType());
		assertEquals("Integer",ad.getType().getTypeName());
	}

	@Test
	public void parsesArrayAttribute() throws Exception {
		String statement = "attribute id : Integer[]; ";
		OTestParser parser = new OTestParser(statement);
		AttributeDeclaration ad = parser.parse_attribute_declaration();
		assertNotNull(ad);
		assertEquals("id",ad.getId().toString());
		assertNotNull(ad.getType());
		assertEquals("Integer[]",ad.getType().getTypeName());
	}

	@Test
	public void parsesCategory1Attribute() throws Exception {
		String statement = "category Person ( id );";
		OTestParser parser = new OTestParser(statement);
		CategoryDeclaration cd = parser.parse_category_declaration();
		assertNotNull(cd);
		assertEquals("Person",cd.getId().toString());
		assertNull(cd.getDerivedFrom());
		assertNotNull(cd.getAttributes());
		assertTrue(cd.getAttributes().contains(new Identifier("id")));
	}

	@Test
	public void parsesCategory2Attributes() throws Exception {
		String statement = "category Person ( id, name );";
		OTestParser parser = new OTestParser(statement);
		CategoryDeclaration cd = parser.parse_category_declaration();
		assertNotNull(cd);
		assertEquals("Person",cd.getId().toString());
		assertNull(cd.getDerivedFrom());
		assertNotNull(cd.getAttributes());
		assertTrue(cd.getAttributes().contains(new Identifier("id")));
		assertTrue(cd.getAttributes().contains(new Identifier("name")));
	}
	
	@Test
	public void parsesCategory1Derived1Attribute() throws Exception {
		String statement = "category Employee( company ) extends Person ;";
		OTestParser parser = new OTestParser(statement);
		CategoryDeclaration cd = parser.parse_category_declaration();
		assertNotNull(cd);
		assertEquals("Employee",cd.getId().toString());
		assertNotNull(cd.getDerivedFrom());
		assertTrue(cd.getDerivedFrom().contains(new Identifier("Person")));
		assertNotNull(cd.getAttributes());
		assertTrue(cd.getAttributes().contains(new Identifier("company")));
	}

	@Test
	public void parsesCategory2DerivedNoAttribute() throws Exception {
		String statement = "category Entrepreneur extends Person, Company;";
		OTestParser parser = new OTestParser(statement);
		CategoryDeclaration cd = parser.parse_category_declaration();
		assertNotNull(cd);
		assertEquals("Entrepreneur",cd.getId().toString());
		assertNotNull(cd.getDerivedFrom());
		assertTrue(cd.getDerivedFrom().contains(new Identifier("Person")));
		assertTrue(cd.getDerivedFrom().contains(new Identifier("Company")));
		assertNull(cd.getAttributes());
	}

	@Test
	public void parsesMemberExpression() throws Exception {
		String statement = "p.name";
		OTestParser parser = new OTestParser(statement);
		IExpression e = parser.parse_instance_expression();
		assertTrue(e instanceof MemberSelector);
		MemberSelector me = (MemberSelector)e;
		assertEquals("name",me.getName());
		assertTrue(me.getParent() instanceof InstanceExpression);
		InstanceExpression uie = (InstanceExpression)me.getParent();
		assertEquals("p",uie.getName().toString());
	}

	@Test
	public void parsesArgument() throws Exception {
		String statement = "Person p";
		OTestParser parser = new OTestParser(statement);
		ITypedParameter a = parser.parse_typed_argument();
		assertNotNull(a);
		assertNotNull(a.getType());
		assertEquals("Person",a.getType().getTypeName());
		assertEquals("p",a.getId().toString());
	}

	@Test
	public void parsesList1Argument() throws Exception {
		String statement = "Person p"; 
		OTestParser parser = new OTestParser(statement);
		ParameterList l = parser.parse_argument_list();
		assertNotNull(l);
		assertEquals(1,l.size());
	}

	@Test
	public void parsesList2ArgumentsComma() throws Exception {
		String statement = "Person p, Employee e"; 
		OTestParser parser = new OTestParser(statement);
		ParameterList l = parser.parse_argument_list();
		assertNotNull(l);
		assertEquals(2,l.size());
	}


	@Test
	public void parsesUnresolvedCallExpression() throws Exception {
		String statement = "print (\"person\" + p.name );";
		OTestParser parser = new OTestParser(statement);
		UnresolvedCall ac = parser.parse_method_call_statement();
		assertNotNull(ac);
	}

	@Test
	public void parsesMethodCallWith() throws Exception {
		String statement = "print( value = \"person\" + p.name );";
		OTestParser parser = new OTestParser(statement);
		UnresolvedCall mc = parser.parse_method_call_statement();
		assertNotNull(mc);
		assertEquals("print",mc.getCaller().toString());
		assertNotNull(mc.getArguments());
		Argument as = mc.getArguments().get(0);
		assertEquals("value",as.getParameterId().toString());
		IExpression exp = as.getExpression();
		assertTrue(exp instanceof PlusExpression);
		CodeWriter writer = new CodeWriter(Dialect.O, Context.newGlobalsContext());
		mc.toDialect(writer);
		assertEquals("print(value = \"person\" + p.name)", writer.toString());
		
	}

	@Test
	public void parsesMethod1Parameter1Statement() throws Exception {
		String statement = "method printName ( Person p ) { print ( value = \"person\" + p.name); }";
		OTestParser parser = new OTestParser(statement);
		ConcreteMethodDeclaration ad = parser.parse_concrete_method_declaration();
		assertNotNull(ad);
		assertEquals("printName",ad.getId().toString());
		assertNotNull(ad.getParameters());
		assertTrue(ad.getParameters().contains(
				new CategoryParameter(
						new CategoryType(new Identifier("Person")),
						new Identifier("p"))));
		assertNotNull(ad.getStatements());
		CodeWriter writer = new CodeWriter(Dialect.O, Context.newGlobalsContext());
		ad.getStatements().getFirst().toDialect(writer);
		assertEquals("print(value = \"person\" + p.name)", writer.toString());	
	}
	
	@Test
	public void parsesMethod1Extended1Statement() throws Exception {
		String statement = "method printName ( Object(name) o ) { print ( value = \"object\" + o.name ); }";
		OTestParser parser = new OTestParser(statement);
		ConcreteMethodDeclaration ad = parser.parse_concrete_method_declaration();
		assertNotNull(ad);
		assertEquals("printName",ad.getId().toString());
		assertNotNull(ad.getParameters());
		IParameter expected = new ExtendedParameter(
				new CategoryType(new Identifier("Object")), 
				new Identifier("o"), 
				new IdentifierList( new Identifier("name")));
		assertTrue(ad.getParameters().contains(expected));
		assertNotNull(ad.getStatements());
		CodeWriter writer = new CodeWriter(Dialect.O, Context.newGlobalsContext());
		ad.getStatements().getFirst().toDialect(writer);
		assertEquals("print(value = \"object\" + o.name)", writer.toString());
		
	}
	
	@Test
	public void parsesMethod1Array1Statement() throws Exception {
		String statement = "method printName ( Option[] options ) { print ( value = \"array\" + options ); }";
		OTestParser parser = new OTestParser(statement);
		ConcreteMethodDeclaration ad = parser.parse_concrete_method_declaration();
		assertNotNull(ad);
		assertEquals("printName",ad.getId().toString());
		assertNotNull(ad.getParameters());
		IParameter expected = new CategoryParameter(
				new ListType(
						new CategoryType(new Identifier("Option"))),
						new Identifier("options"));
		assertTrue(ad.getParameters().contains(expected)); 
		assertNotNull(ad.getStatements());
		CodeWriter writer = new CodeWriter(Dialect.O, Context.newGlobalsContext());
		ad.getStatements().getFirst().toDialect(writer);
		assertEquals("print(value = \"array\" + options)", writer.toString());
	}
	
	@Test 
	public void parsesConstructor1Attribute() throws Exception {
		String statement = "Company(id=1)";
		OTestParser parser = new OTestParser(statement);
		ConstructorExpression c = parser.parse_constructor_expression();
		assertNotNull(c);
	}
	
	@Test 
	public void parsesConstructorFrom1Attribute() throws Exception {
		String statement = "Company(entity,id=1)";
		OTestParser parser = new OTestParser(statement);
		ConstructorExpression c = parser.parse_constructor_expression();
		assertNotNull(c);
	}

	@Test 
	public void parsesConstructor2AttributesComma() throws Exception {
		String statement = "Company(id=1, name=\"IBM\")";
		OTestParser parser = new OTestParser(statement);
		ConstructorExpression c = parser.parse_constructor_expression();
		assertNotNull(c);
		ArgumentList l = c.getArguments();
		assertNotNull(l);
		assertEquals(2, l.size());
		Argument a = l.get(0);
		assertNotNull(a);
		assertEquals("id",a.getParameterId().toString());
		IExpression e = a.getExpression();
		assertNotNull(e);
		assertTrue(e instanceof IntegerLiteral);
		a = l.get(1);
		assertNotNull(a);
		assertEquals("name",a.getParameterId().toString());
		e = a.getExpression();
		assertNotNull(e);
		assertTrue(e instanceof TextLiteral);
	}
	
	@Test 
	public void parsesAssignmentConstructor() throws Exception {
		String statement = "c = Company ( id = 1, name = \"IBM\" );";
		OTestParser parser = new OTestParser(statement);
		AssignInstanceStatement a = parser.parse_assign_instance_statement();
		assertNotNull(a);
		assertTrue(a.getExpression() instanceof UnresolvedCall);
	}
	
	@Test 
	public void parsesNativeJava() throws Exception {
		String statement = "Java: System.out.println(value);";
		OTestParser parser = new OTestParser(statement);
		NativeCall call = parser.parse_native_statement();
		assertNotNull(call);
		assertTrue(call instanceof NativeCall);
	}
	
	@Test 
	public void parsesNativeCSharp() throws Exception {
		String statement = "C#: Console.println(value);";
		OTestParser parser = new OTestParser(statement);
		NativeCall call = parser.parse_native_statement();
		assertNotNull(call);
		assertTrue(call instanceof NativeCall);
	}
	
	@Test 
	public void parsesNativeMethod() throws Exception {
		String statement = "native method print (String value) {\r\n"
				+ "\tJava: System.out.println(value); \r\n"
				+ "\tC#: Console.println(value); }";
		
		OTestParser parser = new OTestParser(statement);
		NativeMethodDeclaration method = parser.parse_native_method_declaration();
		assertNotNull(method);
		assertTrue(method instanceof NativeMethodDeclaration);
	}
	
	@Test
	public void parsesBooleanLiteral() throws Exception {
		String statement = "true";
		OTestParser parser = new OTestParser(statement);
		IExpression literal = parser.parse_literal_expression();
		assertNotNull(literal);
		assertTrue(literal instanceof BooleanLiteral);
		assertEquals("true", literal.toString());
		assertEquals(true, ((BooleanLiteral)literal).getValue().getValue());
		statement = "false";
		parser = new OTestParser(statement);
		literal = parser.parse_literal_expression();
		assertNotNull(literal);
		assertTrue(literal instanceof BooleanLiteral);
		assertEquals("false", literal.toString());
		assertEquals(false, ((BooleanLiteral)literal).getValue().getValue());
	}

	@Test
	public void parsesStringLiteral() throws Exception {
		String statement = "\"hello\"";
		OTestParser parser = new OTestParser(statement);
		IExpression literal = parser.parse_literal_expression();
		assertNotNull(literal);
		assertTrue(literal instanceof TextLiteral);
		CodeWriter writer = new CodeWriter(Dialect.O, null);
		literal.toDialect(writer);
		assertEquals("\"hello\"", writer.toString());
		assertEquals("hello", ((TextLiteral)literal).getValue().getStorableData());
	}
	
	@Test
	public void parsesIntegerLiteral() throws Exception {
		String statement = "1234";
		OTestParser parser = new OTestParser(statement);
		IExpression literal = parser.parse_literal_expression();
		assertNotNull(literal);
		assertTrue(literal instanceof IntegerLiteral);
		assertEquals("1234", literal.toString());
		assertEquals(1234, ((IntegerLiteral)literal).getValue().longValue());
	}
	
	@Test
	public void parsesParseHexa() throws Exception {
		assertEquals(0x0A11, HexaLiteral.parseHexa("0x0A11").longValue());
	}
	
	@Test
	public void parsesHexaLiteral() throws Exception {
		String statement = "0x0A11";
		OTestParser parser = new OTestParser(statement);
		IExpression literal = parser.parse_literal_expression();
		assertNotNull(literal);
		assertTrue(literal instanceof HexaLiteral);
		CodeWriter writer = new CodeWriter(Dialect.O, null);
		literal.toDialect(writer);
		assertEquals("0x0A11", writer.toString());
		assertEquals(0x0A11, ((HexaLiteral)literal).getValue().longValue());
	}

	@Test
	public void parsesDecimalLiteral() throws Exception {
		String statement = "1234.13";
		OTestParser parser = new OTestParser(statement);
		IExpression literal = parser.parse_literal_expression();
		assertNotNull(literal);
		assertTrue(literal instanceof DecimalLiteral);
		assertEquals("1234.13", literal.toString());
		assertEquals(1234.13, ((DecimalLiteral)literal).getValue().doubleValue(),0.0000001);
	}
	
	@Test
	public void parsesEmptyListLiteral() throws Exception {
		String statement = "[]";
		OTestParser parser = new OTestParser(statement);
		IExpression literal = parser.parse_literal_expression();
		assertNotNull(literal);
		assertTrue(literal instanceof ListLiteral);
		assertEquals("[]", literal.toString());
		assertEquals(0, ((ListLiteral)literal).getValue().getLength());
	}
	
	@Test
	public void parsesSimpleListLiteral() throws Exception {
		String statement = "[ john, 123]";
		OTestParser parser = new OTestParser(statement);
		IExpression literal = parser.parse_literal_expression();
		assertNotNull(literal);
		assertTrue(literal instanceof ListLiteral);
		ExpressionList list = ((ListLiteral)literal).getExpressions();
		assertEquals(2, list.size());
		assertTrue(list.get(0) instanceof InstanceExpression);
		assertTrue(list.get(1) instanceof IntegerLiteral);
	}
	
	@Test
	public void parsesEmptyDictLiteral() throws Exception {
		String statement = "<:>";
		OTestParser parser = new OTestParser(statement);
		IExpression literal = parser.parse_literal_expression();
		assertNotNull(literal);
		assertTrue(literal instanceof DictLiteral);
		assertEquals("<:>", literal.toString());
	}
	
	@Test
	public void parsesSimpleDictLiteral() throws Exception {
		String statement = "< \"john\" : 1234, eric : 5678 >";
		OTestParser parser = new OTestParser(statement);
		IExpression literal = parser.parse_literal_expression();
		assertNotNull(literal);
		assertTrue(literal instanceof DictLiteral);
		CodeWriter writer = new CodeWriter(Dialect.O, null);
		literal.toDialect(writer);
		assertEquals("<\"john\":1234, eric:5678>", writer.toString()); // TODO: DictLiteral
	}
	
	@Test
	public void parsesMultiLineDictLiteral() throws Exception {
		String statement = "< \"john\" : 1234,\n \t\"eric\" : 5678 >";
		OTestParser parser = new OTestParser(statement);
		IExpression literal = parser.parse_literal_expression();
		assertNotNull(literal);
		assertTrue(literal instanceof DictLiteral);
		CodeWriter writer = new CodeWriter(Dialect.E, Context.newGlobalsContext());
		literal.toDialect(writer);
		assertEquals("<\"john\":1234, \"eric\":5678>", writer.toString()); // TODO DictLiteral
	}


	
	@Test
	public void parsesSimpleDate() throws Exception {
		String statement = "'2012-10-09'";
		OTestParser parser = new OTestParser(statement);
		IExpression literal = parser.parse_literal_expression();
		assertNotNull(literal);
		assertTrue(literal instanceof DateLiteral);
		CodeWriter writer = new CodeWriter(Dialect.O, null);
		literal.toDialect(writer);
		assertEquals("'2012-10-09'", writer.toString());
		assertEquals(new PromptoDate(2012, 10, 9), ((DateLiteral)literal).getValue().getStorableData());
	}

	@Test
	public void parsesSimpleTime() throws Exception {
		String statement = "'15:03:10'";
		OTestParser parser = new OTestParser(statement);
		IExpression literal = parser.parse_literal_expression();
		assertNotNull(literal);
		assertTrue(literal instanceof TimeLiteral);
		CodeWriter writer = new CodeWriter(Dialect.O, null);
		literal.toDialect(writer);
		assertEquals("'15:03:10'", writer.toString());
		assertEquals(new PromptoTime(new LocalTime(15, 03, 10)), ((TimeLiteral)literal).getValue().getStorableData());
	}

	@Test
	public void parsesDateTime() throws Exception {
		String statement = "'2012-10-09T15:18:17'";
		OTestParser parser = new OTestParser(statement);
		IExpression literal = parser.parse_literal_expression();
		assertNotNull(literal);
		assertTrue(literal instanceof DateTimeLiteral);
		CodeWriter writer = new CodeWriter(Dialect.O, null);
		literal.toDialect(writer);
		assertEquals("'2012-10-09T15:18:17'", writer.toString());
		assertEquals(new PromptoDateTime(new DateTime(2012, 10, 9, 15, 18, 17)), ((DateTimeLiteral)literal).getValue().getStorableData());
	}
	
	@Test
	public void parsesDateTimeWithMillis() throws Exception {
		String statement = "'2012-10-09T15:18:17.487'";
		OTestParser parser = new OTestParser(statement);
		IExpression literal = parser.parse_literal_expression();
		assertNotNull(literal);
		assertTrue(literal instanceof DateTimeLiteral);
		CodeWriter writer = new CodeWriter(Dialect.O, null);
		literal.toDialect(writer);
		assertEquals("'2012-10-09T15:18:17.487'", writer.toString());
		assertEquals(new PromptoDateTime(new DateTime(2012, 10, 9, 15, 18, 17, 487)), ((DateTimeLiteral)literal).getValue().getStorableData());
	}
	
	@Test
	public void parsesDateTimeWithTZ() throws Exception {
		String statement = "'2012-10-09T15:18:17+02:00'";
		OTestParser parser = new OTestParser(statement);
		IExpression literal = parser.parse_literal_expression();
		assertNotNull(literal);
		assertTrue(literal instanceof DateTimeLiteral);
		CodeWriter writer = new CodeWriter(Dialect.O, null);
		literal.toDialect(writer);
		assertEquals("'2012-10-09T15:18:17+02:00'", writer.toString());
		ZoneInfoProvider provider = new ZoneInfoProvider("org/joda/time/tz/data");
		DateTimeZone tz = provider.getZone("Etc/GMT-2");
		DateTime dt = new DateTime(2012, 10, 9, 15, 18, 17, tz);
		PromptoDateTime expected = new PromptoDateTime(dt);
		PromptoDateTime actual = ((DateTimeLiteral)literal).getValue().getStorableData();
		assertTrue(expected.isEqual(actual));
	}
	
	@Test
	public void parsesPeriod() throws Exception {
		String statement = "'P3Y'";
		OTestParser parser = new OTestParser(statement);
		IExpression literal = parser.parse_literal_expression();
		assertNotNull(literal);
		assertTrue(literal instanceof PeriodLiteral);
		CodeWriter writer = new CodeWriter(Dialect.O, null);
		literal.toDialect(writer);
		assertEquals("'P3Y'", writer.toString());
		assertEquals(3,((PeriodLiteral)literal).getValue().getStorableData().getNativeYears());
	}

	@Test
	public void parsesNativeSymbol() throws Exception {
		String statement = "ENTITY_1 = \"1\";";
		OTestParser parser = new OTestParser(statement);
		IExpression symbol = parser.parse_native_symbol();
		assertNotNull(symbol);
		assertTrue(symbol instanceof NativeSymbol);
		CodeWriter writer = new CodeWriter(Dialect.O, null);
		((NativeSymbol)symbol).getExpression().toDialect(writer);
		assertEquals( "\"1\"", writer.toString());
	}

	@Test
	public void parsesExpressionMethod() throws Exception {
		String statement = "x = print ( value = \"1\" );";
		OTestParser parser = new OTestParser(statement);
		IStatement stmt = parser.parse_statement();
		assertNotNull(stmt);
		CodeWriter writer = new CodeWriter(Dialect.O, Context.newGlobalsContext());
		stmt.toDialect(writer);
		assertEquals("x = print(value = \"1\")", writer.toString());
	}

	@Test
	public void parsesMethod() throws Exception {
		String statement = "print (\"a\", value = \"1\");";
		OTestParser parser = new OTestParser(statement);
		IStatement stmt = parser.parse_statement();
		assertNotNull(stmt); 
		CodeWriter writer = new CodeWriter(Dialect.O, Context.newGlobalsContext());
		stmt.toDialect(writer);
		assertEquals("print(\"a\", value = \"1\")", writer.toString());
	}
	
	@Test
	public void parsesInstanceExpression() throws Exception {
		String statement = "prefix";
		OTestParser parser = new OTestParser(statement);
		IExpression exp = parser.parse_expression();
		assertTrue(exp instanceof InstanceExpression);
	}

	@Test
	public void parsesTernaryExpression() throws Exception {
		String statement = "a is not null ? x : y";
		OTestParser parser = new OTestParser(statement);
		IExpression exp = parser.parse_expression();
		assertTrue(exp instanceof TernaryExpression);
	}
	
	@Test
	public void parsesVersionLiterals() throws Exception {
		Stream.of("'v1.3'", "'v1.3.15'", "'v1.3-alpha'", "'v1.3-beta'", "'v1.3-candidate'",
				"'v1.3.15-alpha'", "'v1.3.15-beta'", "'v1.3.15-candidate'",
				"'latest'", "'development'")
			.forEach(this::parsesVersionLiteral);
	}

	private void parsesVersionLiteral(String literal) {
		OTestParser parser = new OTestParser(literal);
		IExpression exp = parser.parse_expression();
		assertTrue(exp instanceof VersionLiteral);
		assertEquals(literal, "'" + ((VersionLiteral)exp).getValue().toString() + "'");
	}


	static class OTestParser extends OCleverParser {
		
		public OTestParser(String code) {
			super(code);
		}

		public IExpression parse_instance_expression() {
			ParseTree tree = instance_expression();
			OPromptoBuilder builder = new OPromptoBuilder(this);
			ParseTreeWalker walker = new ParseTreeWalker();
			walker.walk(builder, tree);
			return builder.<IExpression>getNodeValue(tree);
		}

		public RangeLiteral parse_range_literal() {
			ParseTree tree = range_literal();
			OPromptoBuilder builder = new OPromptoBuilder(this);
			ParseTreeWalker walker = new ParseTreeWalker();
			walker.walk(builder, tree);
			return builder.<RangeLiteral>getNodeValue(tree);
		}
		
		public TupleLiteral parse_tuple_literal() {
			ParseTree tree = tuple_literal();
			OPromptoBuilder builder = new OPromptoBuilder(this);
			ParseTreeWalker walker = new ParseTreeWalker();
			walker.walk(builder, tree);
			return builder.<TupleLiteral>getNodeValue(tree);
		}

		public AttributeDeclaration parse_attribute_declaration() {
			ParseTree tree = attribute_declaration();
			OPromptoBuilder builder = new OPromptoBuilder(this);
			ParseTreeWalker walker = new ParseTreeWalker();
			walker.walk(builder, tree);
			return builder.<AttributeDeclaration>getNodeValue(tree);
		}

		public CategoryDeclaration parse_category_declaration() {
			ParseTree tree = category_declaration();
			OPromptoBuilder builder = new OPromptoBuilder(this);
			ParseTreeWalker walker = new ParseTreeWalker();
			walker.walk(builder, tree);
			return builder.<CategoryDeclaration>getNodeValue(tree);
		}

		public ITypedParameter parse_typed_argument() {
			ParseTree tree = typed_argument();
			OPromptoBuilder builder = new OPromptoBuilder(this);
			ParseTreeWalker walker = new ParseTreeWalker();
			walker.walk(builder, tree);
			return builder.<ITypedParameter>getNodeValue(tree);
		}

		public ParameterList parse_argument_list() {
			ParseTree tree = argument_list();
			OPromptoBuilder builder = new OPromptoBuilder(this);
			ParseTreeWalker walker = new ParseTreeWalker();
			walker.walk(builder, tree);
			return builder.<ParameterList>getNodeValue(tree);
		}

		public UnresolvedCall parse_method_call_statement() {
			ParseTree tree = method_call_statement();
			OPromptoBuilder builder = new OPromptoBuilder(this);
			ParseTreeWalker walker = new ParseTreeWalker();
			walker.walk(builder, tree);
			return builder.<UnresolvedCall>getNodeValue(tree);
		}

		public NativeMethodDeclaration parse_native_method_declaration() {
			ParseTree tree = native_method_declaration();
			OPromptoBuilder builder = new OPromptoBuilder(this);
			ParseTreeWalker walker = new ParseTreeWalker();
			walker.walk(builder, tree);
			return builder.<NativeMethodDeclaration>getNodeValue(tree);
		}

		public ConcreteMethodDeclaration parse_concrete_method_declaration() {
			ParseTree tree = concrete_method_declaration();
			OPromptoBuilder builder = new OPromptoBuilder(this);
			ParseTreeWalker walker = new ParseTreeWalker();
			walker.walk(builder, tree);
			return builder.<ConcreteMethodDeclaration>getNodeValue(tree);
		}

		public ConstructorExpression parse_constructor_expression() {
			ParseTree tree = constructor_expression();
			OPromptoBuilder builder = new OPromptoBuilder(this);
			ParseTreeWalker walker = new ParseTreeWalker();
			walker.walk(builder, tree);
			return builder.<ConstructorExpression>getNodeValue(tree);
		}

		public AssignInstanceStatement parse_assign_instance_statement() {
			ParseTree tree = assign_instance_statement();
			OPromptoBuilder builder = new OPromptoBuilder(this);
			ParseTreeWalker walker = new ParseTreeWalker();
			walker.walk(builder, tree);
			return builder.<AssignInstanceStatement>getNodeValue(tree);
		}

		public NativeCall parse_native_statement() {
			ParseTree tree = native_statement();
			OPromptoBuilder builder = new OPromptoBuilder(this);
			ParseTreeWalker walker = new ParseTreeWalker();
			walker.walk(builder, tree);
			return builder.<NativeCall>getNodeValue(tree);
		}

		public IExpression parse_literal_expression() {
			ParseTree tree = literal_expression();
			OPromptoBuilder builder = new OPromptoBuilder(this);
			ParseTreeWalker walker = new ParseTreeWalker();
			walker.walk(builder, tree);
			return builder.<IExpression>getNodeValue(tree);
		}

		public IExpression parse_native_symbol() {
			ParseTree tree = native_symbol();
			OPromptoBuilder builder = new OPromptoBuilder(this);
			ParseTreeWalker walker = new ParseTreeWalker();
			walker.walk(builder, tree);
			return builder.<IExpression>getNodeValue(tree);
		}

		public IStatement parse_statement() {
			ParseTree tree = statement();
			OPromptoBuilder builder = new OPromptoBuilder(this);
			ParseTreeWalker walker = new ParseTreeWalker();
			walker.walk(builder, tree);
			return builder.<IStatement>getNodeValue(tree);
		}

		public IExpression parse_expression() {
			ParseTree tree = this.expression();
			OPromptoBuilder builder = new OPromptoBuilder(this);
			ParseTreeWalker walker = new ParseTreeWalker();
			walker.walk(builder, tree);
			return builder.<IExpression>getNodeValue(tree);
		}
	}
}
