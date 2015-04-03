package presto.error;

import java.io.ByteArrayInputStream;

import org.junit.Test;

import static org.junit.Assert.*;
import presto.parser.Dialect;
import presto.parser.ProblemCollector;
import presto.parser.IProblem;
import presto.parser.IProblemListener;
import presto.parser.IParser;

public class TestErrorListener {

	@Test
	public void testNoError() throws Exception {
		IProblemListener listener = new ProblemCollector();
		IParser parser = Dialect.E.getParserFactory().newParser();
		parser.setErrorListener(listener);
		parser.parse(null, new ByteArrayInputStream("define x as: Text attribute".getBytes()));
		assertEquals(0, listener.getCount());
	}

	@Test
	public void testIllegalToken() throws Exception {
		IProblemListener listener = new ProblemCollector();
		IParser parser = Dialect.E.getParserFactory().newParser();
		parser.setErrorListener(listener);
		parser.parse(null, new ByteArrayInputStream("'abc".getBytes()));
		assertEquals(2, listener.getCount()); // 1 lexer,1 parser
		IProblem error = listener.getProblems().iterator().next();
		assertEquals(0, error.getStartIndex());
		assertTrue(error.getMessage().startsWith("Unrecognized character sequence:"));
	}

	@Test
	public void testExtraToken() throws Exception {
		IProblemListener listener = new ProblemCollector();
		IParser parser = Dialect.E.getParserFactory().newParser();
		parser.setErrorListener(listener);
		parser.parse(null, new ByteArrayInputStream("abc".getBytes()));
		assertEquals(1, listener.getCount()); 
		IProblem error = listener.getProblems().iterator().next();
		assertEquals(0, error.getStartIndex());
		assertTrue(error.getMessage().startsWith("Unwanted token:"));
	}
	
	@Test
	public void testSyntaxError() throws Exception {
		IProblemListener listener = new ProblemCollector();
		IParser parser = Dialect.E.getParserFactory().newParser();
		parser.setErrorListener(listener);
		parser.parse(null, new ByteArrayInputStream("define x: Text attribute".getBytes()));
		assertEquals(1, listener.getCount()); 
		IProblem error = listener.getProblems().iterator().next();
		assertEquals(8, error.getStartIndex()); // between x and :
		assertTrue(error.getMessage().startsWith("Invalid syntax"));
	}

	
}
