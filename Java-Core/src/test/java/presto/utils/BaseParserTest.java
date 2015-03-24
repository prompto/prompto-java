package presto.utils;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;

import presto.grammar.DeclarationList;
import presto.parser.Dialect;
import presto.parser.ECleverParser;
import presto.parser.OCleverParser;
import presto.parser.PCleverParser;
import presto.runtime.Context;
import presto.runtime.Interpreter;
import presto.runtime.utils.Out;

public abstract class BaseParserTest {

	protected Context context;

	@Before  
	public void baseTestBefore() {
		context = Context.newGlobalContext();
	}

	private String getResourceAsString(String resourceName) throws Exception {
		char[] data = new char[4096];
		InputStream stream = getResourceAsStream(resourceName);
		Reader reader = new InputStreamReader(stream);
		StringBuffer buffer = new StringBuffer();
		for(;;) {
			int read = reader.read(data);
			if(read==-1)
				break;
			buffer.append(data, 0, read);
		}
		stream.close();
		return buffer.toString();
	}

	public InputStream getResourceAsStream(String resourceName) throws Exception {
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		InputStream stream = loader.getResourceAsStream(resourceName);
		if(stream==null) {
			String dirPath = loader.getResource("").getFile();
			String testsPath = dirPath.substring(0, dirPath.lastIndexOf("/presto-java/Java-Core/")) + "/presto-tests/Tests/resources/";
			stream = new FileInputStream(testsPath + resourceName);
		}
		return stream;
	}

	protected void loadResource(String resourceName) throws Exception {
		DeclarationList stmts = parseResource(resourceName);
		stmts.register(context);
		stmts.check(context);
	}

	public abstract DeclarationList parseResource(String resourceName) throws Exception;

	protected void runResource(String resourceName) throws Exception {
		loadResource(resourceName);
		if(context.hasTests())
			Interpreter.interpretTests(context);
		else
			Interpreter.interpretMainNoArgs(context);
	}

	protected void runResource(String resourceName, String methodName, String cmdLineArgs) throws Exception {
		loadResource(resourceName);
		Interpreter.interpret(context, methodName, cmdLineArgs);
	}
	
	protected void checkOutput(String resource) throws Exception {
		runResource(resource);
		String read = Out.read();
		List<String> expected = readExpected(resource);
		if(expected.size()==1)
			assertEquals(expected.get(0), read);
		else {
			for(String ex : expected) {
				if(ex.equals(read))
					return;
			}
			assertEquals(expected.get(0), read); // to get a display
		}
	}

	protected List<String> readExpected(String resourceName) throws Exception {
		int idx = resourceName.lastIndexOf('.');
		resourceName = resourceName.substring(0, idx) + ".txt";
		InputStream input = getResourceAsStream(resourceName);
		assertNotNull("resource not found:"+resourceName,input);
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
			List<String> expected = new ArrayList<String>();
			for(;;) {
				String read = reader.readLine();
				if(read==null || read.length()==0)
					return expected;
				expected.add(read);
			}
				
		} finally {
			input.close();
		}
	}

	public DeclarationList parseOString(String code) throws Exception {
		OCleverParser parser = new OCleverParser(code);
		return parser.parse_declaration_list();
	}

	public DeclarationList parseOResource(String resourceName) throws Exception {
		InputStream input = getResourceAsStream(resourceName);
		assertNotNull("resource not found:"+resourceName,input);
		OCleverParser parser = new OCleverParser(input);
		return parser.parse_declaration_list();
	}

	public DeclarationList parseEString(String code) throws Exception {
		ECleverParser parser = new ECleverParser(code);
		return parser.parse_declaration_list();
	}

	public DeclarationList parseEResource(String resourceName) throws Exception {
		InputStream input = getResourceAsStream(resourceName);
		assertNotNull("resource not found:" + resourceName, input);
		ECleverParser parser = new ECleverParser(input);
		return parser.parse_declaration_list();
	}
	
	public DeclarationList parsePString(String code) throws Exception {
		PCleverParser parser = new PCleverParser(code);
		return parser.parse_declaration_list();
	}

	public DeclarationList parsePResource(String resourceName) throws Exception {
		InputStream input = getResourceAsStream(resourceName);
		assertNotNull("resource not found:" + resourceName, input);
		PCleverParser parser = new PCleverParser(input);
		return parser.parse_declaration_list();
	}

	public void compareResourceEOE(String resourceName) throws Exception {
		String expected = getResourceAsString(resourceName);
		// System.out.println(expected);
		// parse e source code
		DeclarationList dle = parseEString(expected);
		context = Context.newGlobalContext();
		dle.register(context);
		// rewrite as o
		CodeWriter writer = new CodeWriter(Dialect.O, context);
		dle.toDialect(writer);
		String o = writer.toString();
		// System.out.println(o);
		// parse o source code
		DeclarationList dlo = parseOString(o);
		context = Context.newGlobalContext();
		dlo.register(context);
		// rewrite as e
		writer = new CodeWriter(Dialect.E, context);
		dlo.toDialect(writer);
		String actual = writer.toString();
		// System.out.println(actual);
		// ensure equivalent
		assertEquivalent(expected, actual);
	}
	
	public void compareResourceEPE(String resourceName) throws Exception {
		String expected = getResourceAsString(resourceName);
		// System.out.println(expected);
		// parse e source code
		DeclarationList dle = parseEString(expected);
		context = Context.newGlobalContext();
		dle.register(context);
		// rewrite as o
		CodeWriter writer = new CodeWriter(Dialect.P, context);
		dle.toDialect(writer);
		String p = writer.toString();
		// System.out.println(p);
		// parse o source code
		DeclarationList dlp = parsePString(p);
		context = Context.newGlobalContext();
		dlp.register(context);
		// rewrite as e
		writer = new CodeWriter(Dialect.E, context);
		dlp.toDialect(writer);
		String actual = writer.toString();
		// System.out.println(actual);
		// ensure equivalent
		assertEquivalent(expected, actual);
	}

	public void compareResourceOEO(String resourceName) throws Exception {
		String expected = getResourceAsString(resourceName);
		// System.out.println(expected);
		// parse o source code
		DeclarationList dlo = parseOString(expected);
		context = Context.newGlobalContext();
		dlo.register(context);
		// rewrite as e
		CodeWriter writer = new CodeWriter(Dialect.E, context);
		dlo.toDialect(writer);
		String e = writer.toString();
		// System.out.println(e);
		// parse e source code
		DeclarationList dle = parseEString(e);
		context = Context.newGlobalContext();
		dle.register(context);
		// rewrite as o
		writer = new CodeWriter(Dialect.O, context);
		dle.toDialect(writer);
		String actual = writer.toString();
		// System.out.println(actual);
		// ensure equivalent
		assertEquivalent(expected, actual);
	}
	
	public void compareResourceOPO(String resourceName) throws Exception {
		String expected = getResourceAsString(resourceName);
		// System.out.println(expected);
		// parse o source code
		DeclarationList dlo = parseOString(expected);
		context = Context.newGlobalContext();
		dlo.register(context);
		// rewrite as p
		CodeWriter writer = new CodeWriter(Dialect.P, context);
		dlo.toDialect(writer);
		String p = writer.toString();
		// System.out.println(p);
		// parse e source code
		DeclarationList dlp = parsePString(p);
		context = Context.newGlobalContext();
		dlp.register(context);
		// rewrite as o
		writer = new CodeWriter(Dialect.O, context);
		dlp.toDialect(writer);
		String actual = writer.toString();
		// System.out.println(actual);
		// ensure equivalent
		assertEquivalent(expected, actual);
	}
	
	public static void assertEquivalent(String expected, String actual) {
		expected = removeWhitespace(expected).replace("modulo","%");
		actual = removeWhitespace(actual).replace("modulo","%");
		assertEquals(expected, actual);
	}

	private static String removeWhitespace(String s) {
		return s.replaceAll(" ", "").replaceAll("\t", "").replaceAll("\n", "");
	}


}
