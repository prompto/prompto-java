package presto.error;

import java.io.ByteArrayInputStream;

import org.junit.Test;

import static org.junit.Assert.*;
import presto.parser.Dialect;
import presto.parser.ErrorCollector;
import presto.parser.IError;
import presto.parser.IErrorListener;
import presto.parser.IParser;

public class TestErrorListener {

	@Test
	public void testNoError() throws Exception {
		IErrorListener listener = new ErrorCollector();
		IParser parser = Dialect.E.getParserFactory().newParser();
		parser.setErrorListener(listener);
		parser.parse(null, new ByteArrayInputStream("define x as: Text attribute".getBytes()));
		assertEquals(0, listener.getCount());
	}

	@Test
	public void testLexerError() throws Exception {
		IErrorListener listener = new ErrorCollector();
		IParser parser = Dialect.E.getParserFactory().newParser();
		parser.setErrorListener(listener);
		parser.parse(null, new ByteArrayInputStream("'abc".getBytes()));
		assertEquals(1, listener.getCount()); 
		IError error = listener.getErrors().iterator().next();
		assertEquals(0, error.getStartIndex());
		assertTrue(error.getMessage().startsWith("Unrecognized character sequence:"));
	}

	@Test
	public void testParserError() throws Exception {
		IErrorListener listener = new ErrorCollector();
		IParser parser = Dialect.E.getParserFactory().newParser();
		parser.setErrorListener(listener);
		parser.parse(null, new ByteArrayInputStream("abc".getBytes()));
		assertEquals(1, listener.getCount()); 
		IError error = listener.getErrors().iterator().next();
		assertEquals(0, error.getStartIndex());
		assertTrue(error.getMessage().startsWith("Unrecognized character sequence:"));
	}
}
