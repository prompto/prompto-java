package prompto.utils;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;

import prompto.declaration.DeclarationList;
import prompto.declaration.IDeclaration;
import prompto.declaration.TestMethodDeclaration;
import prompto.error.PromptoError;
import prompto.grammar.Identifier;
import prompto.parser.Dialect;
import prompto.parser.ECleverParser;
import prompto.parser.OCleverParser;
import prompto.parser.SCleverParser;
import prompto.runtime.Context;
import prompto.runtime.Executor;
import prompto.runtime.Interpreter;
import prompto.runtime.utils.Out;
import prompto.store.IDataStore;
import prompto.store.IStore;
import prompto.store.MemStore;
import prompto.utils.CodeWriter;

public abstract class BaseParserTest extends BaseTest {

	protected Context coreContext;
	protected Context context;

	@Before  
	public void __before__test__() {
		context = Context.newGlobalContext();
	}

	public void loadDependency(String name) throws Exception {
		if(coreContext==null)
			coreContext = Context.newGlobalContext();
		DeclarationList allStmts = null;
		File[] files = listLibraryFiles(name);
		if(files!=null) for(File file : files) {
			String resourceName = name + "/" + file.getName();
			DeclarationList stmts = parseResource(resourceName);
			if(allStmts==null)
				allStmts = stmts;
			else
				allStmts.addAll(stmts);
		}
		allStmts.register(coreContext);
	}

	protected void loadResource(String resourceName) throws Exception {
		DeclarationList stmts = parseResource(resourceName);
		stmts.register(context);
		stmts.check(context);
	}

	public abstract DeclarationList parseResource(String resourceName) throws Exception;

	static interface ResourceRunner {
		boolean runResource(String resourceName, boolean catchExceptions) throws PromptoError;
	}
	
	protected boolean interpretResource(String resourceName, boolean reThrow) throws PromptoError {
		try {
			loadResource(resourceName);
			if(context.hasTests()) {
				Interpreter.interpretTests(context);
				return true;
			} else {
				Interpreter.interpretMainNoArgs(context);
				return false;
			}
		} catch(Exception e) {
			if(reThrow && e instanceof PromptoError)
				throw (PromptoError)e;
			e.printStackTrace(System.err);
			fail(e.getMessage());
			return false;
		}
	}

	protected boolean executeResource(String resourceName, boolean reThrow) throws PromptoError {
		try {
			loadResource(resourceName);
			if(context.hasTests()) {
				Executor.executeTests(context);
				return true;
			} else {
				File root = Files.createTempDirectory("prompto_").toFile();
				Executor.executeMainNoArgs(context, root);
				return false;
			}
		} catch(Exception e) {
			if(reThrow && e instanceof PromptoError)
				throw (PromptoError)e;
			e.printStackTrace(System.err);
			fail(e.getMessage());
			return false;
		}
	}

	protected void interpretResource(String resourceName, String methodName, String cmdLineArgs) throws Exception {
		loadResource(resourceName);
		Interpreter.interpretMethod(context, new Identifier(methodName), cmdLineArgs);
	}
	
	protected void checkInterpretedOutput(String resource) throws Exception {
		checkOutput(resource, this::interpretResource);
	}

	protected void checkCompiledOutput(String resource) throws Exception {
		try {
			checkOutput(resource, this::executeResource);
		} catch(Throwable t) {
			t.printStackTrace(System.err);
			throw t;
		}
	}

	@SuppressWarnings("unchecked")
	protected void checkOutput(String resource, ResourceRunner runner) throws Exception {
		IDataStore.setInstance((IStore<Object>)(Object)new MemStore());
		boolean isTest = runner.runResource(resource, false);
		String read = Out.read();
		if(isTest && read.endsWith("\n"))
			read = read.substring(0, read.length() - 1);
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
	
	protected void runTests(String resource) throws Exception {
		DeclarationList stmts = parseResource(resource);
		for(IDeclaration decl : stmts) {
			if(!(decl instanceof TestMethodDeclaration))
				continue;
			Out.reset();
			interpretTest(decl.getId());
			Out.reset();
			executeTest(decl.getId());
		}
	}
	
	private void executeTest(Identifier identifier) throws Exception {
		// TODO Auto-generated method stub
		
	}

	private void interpretTest(Identifier identifier) throws Exception {
		Interpreter.interpretTest(coreContext, identifier);
		String expected = identifier.toString() + " test successful\n";
		String read = Out.read();
		assertEquals(expected, read);
	}

	protected List<String> readExpected(String resourceName) {
		try {
			int idx = resourceName.lastIndexOf('.');
			resourceName = resourceName.substring(0, idx) + ".txt";
			try(InputStream input = getResourceAsStream(resourceName)) {
				assertNotNull("resource not found:" + resourceName, input);
				BufferedReader reader = new BufferedReader(new InputStreamReader(input));
				List<String> expected = new ArrayList<String>();
				for(;;) {
					String read = reader.readLine();
					if(read==null || read.length()==0)
						return expected;
					expected.add(read);
				}
					
			} 
		} catch(Exception e) {
			fail(e.getMessage());
			return null;
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
	
	public DeclarationList parseSString(String code) throws Exception {
		SCleverParser parser = new SCleverParser(code);
		return parser.parse_declaration_list();
	}

	public DeclarationList parseSResource(String resourceName) throws Exception {
		InputStream input = getResourceAsStream(resourceName);
		assertNotNull("resource not found:" + resourceName, input);
		SCleverParser parser = new SCleverParser(input);
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
	
	public void compareResourceESE(String resourceName) throws Exception {
		String expected = getResourceAsString(resourceName);
		// System.out.println(expected);
		// parse e source code
		DeclarationList dle = parseEString(expected);
		context = Context.newGlobalContext();
		dle.register(context);
		// rewrite as o
		CodeWriter writer = new CodeWriter(Dialect.S, context);
		dle.toDialect(writer);
		String p = writer.toString();
		// System.out.println(p);
		// parse o source code
		DeclarationList dls = parseSString(p);
		context = Context.newGlobalContext();
		dls.register(context);
		// rewrite as e
		writer = new CodeWriter(Dialect.E, context);
		dls.toDialect(writer);
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
	
	public void compareResourceOSO(String resourceName) throws Exception {
		String expected = getResourceAsString(resourceName);
		// System.out.println(expected);
		// parse o source code
		DeclarationList dlo = parseOString(expected);
		context = Context.newGlobalContext();
		dlo.register(context);
		// rewrite as p
		CodeWriter writer = new CodeWriter(Dialect.S, context);
		dlo.toDialect(writer);
		String p = writer.toString();
		// System.out.println(p);
		// parse s source code
		DeclarationList dls = parseSString(p);
		context = Context.newGlobalContext();
		dls.register(context);
		// rewrite as o
		writer = new CodeWriter(Dialect.O, context);
		dls.toDialect(writer);
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
