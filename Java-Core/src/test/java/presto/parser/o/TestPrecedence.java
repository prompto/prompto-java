package presto.parser.o;

import static org.junit.Assert.assertEquals;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.expression.IExpression;
import presto.parser.OCleverParser;
import presto.parser.OPrestoBuilder;
import presto.runtime.Context;
import presto.runtime.utils.Out;
import presto.value.Integer;



public class TestPrecedence extends BaseOParserTest {

	@Before
	public void before() {
		Out.init();
	}
	
	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void test3Minuses() throws Exception {
		IExpression exp = parseExpression("1-2-3-4");
		Context context = Context.newGlobalContext();
		Object value = exp.interpret(context);
		assertEquals(-8L,((Integer)value).IntegerValue());
	}
	
	@Test
	public void test2Plus3Minuses() throws Exception {
		IExpression exp = parseExpression("1+2-3+4-5-6");
		Context context = Context.newGlobalContext();
		Object value = exp.interpret(context);
		assertEquals(-7L,((Integer)value).IntegerValue());
	}
	
	@Test
	public void test1Star1Plus() throws Exception {
		IExpression exp = parseExpression("1*2+3");
		Context context = Context.newGlobalContext();
		Object value = exp.interpret(context);
		assertEquals(5L,((Integer)value).IntegerValue());
	}

	IExpression parseExpression(String exp) {
		OCleverParser parser = new OCleverParser(exp);
		ParseTree tree = parser.expression();
		OPrestoBuilder builder = new OPrestoBuilder(parser);
		ParseTreeWalker walker = new ParseTreeWalker();
		walker.walk(builder, tree);
		return builder.<IExpression>getNodeValue(tree);
	}
	

}
