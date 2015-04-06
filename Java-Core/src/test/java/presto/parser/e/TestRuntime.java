package presto.parser.e;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.Locale;
import java.util.TimeZone;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.grammar.CategoryArgument;
import presto.grammar.IArgument;
import presto.java.JavaStatement;
import presto.parser.ECleverParser;
import presto.parser.EIndentingLexer;
import presto.parser.EPrestoBuilder;
import presto.runtime.Context;
import presto.runtime.utils.Out;
import presto.type.TextType;
import presto.value.Text;

public class TestRuntime extends BaseEParserTest {

	@Before
	public void before() {
		Out.init();
	}
	
	@After
	public void after() {
		Out.restore();
	}
	
	@Test
	public void testSystemOutPrint() throws Exception {
		ECleverParser parser = new ECleverParser("System.out.print(value);");
		EIndentingLexer lexer = (EIndentingLexer)parser.getTokenStream().getTokenSource();
		lexer.setAddLF(false);
		ParseTree tree = parser.java_statement();
		EPrestoBuilder builder = new EPrestoBuilder(parser);
		ParseTreeWalker walker = new ParseTreeWalker();
		walker.walk(builder, tree);
		JavaStatement statement =  builder.<JavaStatement>getNodeValue(tree);
		Context context = Context.newGlobalContext();
		IArgument arg = new CategoryArgument(TextType.instance(),"value");
		arg.register(context);
		context.setValue("value", new Text("test")); // StringLiteral trims enclosing quotes
		Object result = statement.interpret(context);
		assertNull(result);
		assertEquals("test", Out.read());
	}

	@Test
	public void testReturn() throws Exception {
		runResource("native/return.pec");
		assertEquals(System.getProperty("os.name"), Out.read());
	}
	
	@Test
	public void testDateTimeTZName() throws Exception {
		runResource("builtins/dateTimeTZName.pec");
		String tzName = TimeZone.getTimeZone("UTC").getDisplayName(Locale.ENGLISH);
		assertEquals("tzName=" + tzName, Out.read());
	}

}
