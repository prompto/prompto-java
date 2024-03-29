package prompto.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import org.junit.Before;

import com.esotericsoftware.yamlbeans.YamlReader;

import prompto.config.TempDirectories;
import prompto.declaration.DeclarationList;
import prompto.declaration.IDeclaration;
import prompto.declaration.IMethodDeclaration;
import prompto.declaration.TestMethodDeclaration;
import prompto.error.PromptoError;
import prompto.grammar.Identifier;
import prompto.jsx.JsxElementBase;
import prompto.parser.Dialect;
import prompto.parser.ECleverParser;
import prompto.parser.MCleverParser;
import prompto.parser.OCleverParser;
import prompto.problem.IProblem;
import prompto.problem.ProblemCollector;
import prompto.runtime.ApplicationContext;
import prompto.runtime.Context;
import prompto.runtime.Executor;
import prompto.runtime.Interpreter;
import prompto.runtime.utils.Out;
import prompto.store.DataStore;
import prompto.store.memory.MemStore;
import prompto.transpiler.Nashorn8Engine;

public class BaseParserTest extends BaseTest {

	protected Context coreContext;
	protected Context context;

	@Before  
	public void __before__test__() {
		JsxElementBase.setTestMode(true);
		DataStore.setInstance(new MemStore());
		context = ApplicationContext.init();
	}

	public void loadDependency(String name) throws Exception {
		if(coreContext==null)
			coreContext = Context.newGlobalsContext();
		DeclarationList allStmts = null;
		File[] files = listRuntimeFiles(name);
		if(files!=null) for(File file : files) {
			String resourceName = name + "/" + file.getName();
			DeclarationList stmts = parseResource(resourceName);
			if(allStmts==null)
				allStmts = stmts;
			else
				allStmts.addAll(stmts);
		}
		if(allStmts!=null)
			allStmts.register(coreContext);
	}

	protected void loadString(String code) throws Exception {
		DeclarationList stmts = parseString(code);
		stmts.register(context);
		stmts.check(context);
	}

	protected void loadFile(File file) throws Exception {
		DeclarationList stmts = parseFile(file);
		stmts.register(context);
		stmts.check(context);
	}

	protected void loadResource(String resourceName) throws Exception {
		DeclarationList decls = parseResource(resourceName);
		decls.register(context);
		decls.check(context);
	}

	public DeclarationList parseString(String code) throws Exception {
		throw new UnsupportedOperationException("Should never get there!");
	}
	
	public DeclarationList parseFile(File file) throws Exception {
		throw new UnsupportedOperationException("Should never get there!");
	}
	
	public DeclarationList parseResource(String resourceName) throws Exception{
		throw new UnsupportedOperationException("Should never get there!");
	}

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
		} catch(PromptoError e) {
			if(reThrow)
				throw e;	
			else
				System.out.println(e.getMessage());
			return true;
		} catch(Exception e) {
			e.printStackTrace(System.err);
			fail(e.getMessage());
			return false;
		}
	}

	protected boolean executeResource(String resourceName, boolean reThrow) throws PromptoError {
		try {
			loadResource(resourceName);
			TempDirectories.create();
			if(context.hasTests()) {
				Executor.executeTests(context);
				return true;
			} else {
				Executor.executeMainNoArgs(context);
				return false;
			}
		} catch(PromptoError e) {
			if(reThrow)
				throw e;	
			else
				System.out.println(e.getMessage());
			return true;
		} catch(Exception e) {
			e.printStackTrace(System.err);
			fail(e.getMessage());
			return false;
		}
	}
	
	protected boolean transpileResource(String resourceName, boolean reThrow) throws PromptoError {
		try {
			loadResource(resourceName);
			if(context.hasTests()) {
				Nashorn8Engine.executeTests(context);
			} else {
				Nashorn8Engine.executeMainNoArgs(context);
			}
			return true;
		} catch(PromptoError e) {
			if(reThrow)
				throw e;	
			else
				System.out.println(e.getMessage());
			return true;
		} catch(Exception e) {
			e.printStackTrace(System.err);
			fail(e.getMessage());
			return false;
		}
	}
	
	
	protected boolean executeString(String code, boolean reThrow) throws PromptoError {
		try {
			loadString(code);
			TempDirectories.create();
			if(context.hasTests()) {
				Executor.executeTests(context);
				return true;
			} else {
				Executor.executeMainNoArgs(context);
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

	protected void checkTranspiledOutput(String resource) throws Exception {
		try {
			checkOutput(resource, this::transpileResource);
		} catch(Throwable t) {
			t.printStackTrace(System.err);
			throw t;
		}
	}

	protected void checkOutput(String resource, ResourceRunner runner) throws Exception {
		DataStore.setInstance(new MemStore(()->true));
		boolean trimNewLines = runner.runResource(resource, false);
		String read = Out.read();
		if(trimNewLines)
			read = read.replaceAll("\n", "");
		List<String> expected = readExpectedOutput(resource);
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
	
	protected void runInterpretedTests(String resource) throws Exception {
		runTests(resource, this::testInterpreted, false);
	}
	
	protected void runCompiledTests(String resource) throws Exception {
		runTests(resource, this::testCompiled, false);
	}
	
	protected void runTranspiledTests(String resource) throws Exception {
		runTests(resource, this::testTranspiled, false);
	}
	
	protected void runInterpretedTests(String resource, boolean register) throws Exception {
		runTests(resource, this::testInterpreted, register);
	}
	
	protected void runCompiledTests(String resource, boolean register) throws Exception {
		runTests(resource, this::testCompiled, register);
	}
	
	protected void runTranspiledTests(String resource, boolean register) throws Exception {
		runTests(resource, this::testTranspiled, register);
	}

	protected void runTests(String resource, Consumer<Identifier> runner, boolean register) throws Exception {
		DeclarationList decls = parseResource(resource);
		if(register)
			decls.register(coreContext);
		for(IDeclaration decl : decls) {
			if(!(decl instanceof TestMethodDeclaration))
				continue;
			Out.reset();
			runner.accept(decl.getId());
		}
	}
	
	protected void testInterpreted(Identifier test) {
		Interpreter.interpretTest(coreContext, test, false);
		String expected = test.toString() + " test successful\n";
		String read = Out.read();
		assertEquals(expected, read);
	}

	protected void testCompiled(Identifier test) {
		TempDirectories.create();
		Executor.executeTest(coreContext, test.toString(), true);
		String expected = test.toString() + " test successful\n";
		String read = Out.read();
		assertEquals(expected, read);
	}

	protected void testTranspiled(Identifier name) {
		try {
			TestMethodDeclaration test = coreContext.getTest(name, false);
			Nashorn8Engine.executeTest(coreContext, test);
		} catch(Exception e) {
			e.printStackTrace(System.err);
			fail(e.getMessage());
		}
	}

	protected List<String> readExpectedOutput(String resourceName) {
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
		try(var input = getResourceAsStream(resourceName)) {
			assertNotNull("resource not found:"+resourceName,input);
			OCleverParser parser = new OCleverParser(input);
			return parser.parse_declaration_list();
		}
	}

	public DeclarationList parseOFile(File file) throws Exception {
		try(var input = new FileInputStream(file)) {
			OCleverParser parser = new OCleverParser(file.getAbsolutePath(), input);
			return parser.parse_declaration_list();
		}
	}

	public DeclarationList parseEString(String code) throws Exception {
		ECleverParser parser = new ECleverParser(code);
		return parser.parse_declaration_list();
	}

	public DeclarationList parseEResource(String resourceName) throws Exception {
		try(var input = getResourceAsStream(resourceName)) {
			assertNotNull("resource not found:" + resourceName, input);
			ECleverParser parser = new ECleverParser(input);
			return parser.parse_declaration_list();
		}
	}
	
	public DeclarationList parseEFile(File file) throws Exception {
		try(var input = new FileInputStream(file)) {
			ECleverParser parser = new ECleverParser(file.getAbsolutePath(), input);
			return parser.parse_declaration_list();
		}
	}


	public DeclarationList parseMString(String code) throws Exception {
		MCleverParser parser = new MCleverParser(code);
		return parser.parse_declaration_list();
	}

	public DeclarationList parseMResource(String resourceName) throws Exception {
		try(var input = getResourceAsStream(resourceName)) {
			assertNotNull("resource not found:" + resourceName, input);
			MCleverParser parser = new MCleverParser(input);
			return parser.parse_declaration_list();
		}
	}
	
	public DeclarationList parseMFile(File file) throws Exception {
		try(var  input = new FileInputStream(file)) {
			MCleverParser parser = new MCleverParser(file.getAbsolutePath(), input);
			return parser.parse_declaration_list();
		}
	}


	public void compareResourceOO(String resourceName) throws Exception {
		String expected = getResourceAsString(resourceName);
		// System.out.println(expected);
		// parse o source code
		DeclarationList dlo = parseOString(expected);
		context = Context.newGlobalsContext();
		dlo.register(context);
		// rewrite as O
		CodeWriter writer = new CodeWriter(Dialect.O, context);
		dlo.toDialect(writer);
		String actual = writer.toString();
		// System.out.println(actual);
		// ensure equivalent
		assertEquivalent(expected, actual);
	}

	public void compareResourceEOE(String resourceName) throws Exception {
		String expected = getResourceAsString(resourceName);
		// System.out.println(expected);
		// parse e source code
		DeclarationList dle = parseEString(expected);
		context = Context.newGlobalsContext();
		dle.register(context);
		// rewrite as o
		CodeWriter writer = new CodeWriter(Dialect.O, context);
		dle.toDialect(writer);
		String o = writer.toString();
		// System.out.println(o);
		// parse o source code
		DeclarationList dlo = parseOString(o);
		context = Context.newGlobalsContext();
		dlo.register(context);
		// rewrite as e
		writer = new CodeWriter(Dialect.E, context);
		dlo.toDialect(writer);
		String actual = writer.toString();
		// System.out.println(actual);
		// ensure equivalent
		assertEquivalent(expected, actual);
	}
	
	public void compareResourceEME(String resourceName) throws Exception {
		String expected = getResourceAsString(resourceName);
		// System.out.println(expected);
		// parse e source code
		DeclarationList dle = parseEString(expected);
		context = Context.newGlobalsContext();
		dle.register(context);
		// rewrite as o
		CodeWriter writer = new CodeWriter(Dialect.M, context);
		dle.toDialect(writer);
		String p = writer.toString();
		// System.out.println(p);
		// parse o source code
		DeclarationList dls = parseMString(p);
		context = Context.newGlobalsContext();
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
		context = Context.newGlobalsContext();
		dlo.register(context);
		// rewrite as e
		CodeWriter writer = new CodeWriter(Dialect.E, context);
		dlo.toDialect(writer);
		String e = writer.toString();
		// System.out.println(e);
		// parse e source code
		DeclarationList dle = parseEString(e);
		context = Context.newGlobalsContext();
		dle.register(context);
		// rewrite as o
		writer = new CodeWriter(Dialect.O, context);
		dle.toDialect(writer);
		String actual = writer.toString();
		// System.out.println(actual);
		// ensure equivalent
		assertEquivalent(expected, actual);
	}
	
	public void compareResourceOMO(String resourceName) throws Exception {
		String expected = getResourceAsString(resourceName);
		// System.out.println(expected);
		// parse o source code
		DeclarationList dlo = parseOString(expected);
		context = Context.newGlobalsContext();
		dlo.register(context);
		// rewrite as p
		CodeWriter writer = new CodeWriter(Dialect.M, context);
		dlo.toDialect(writer);
		String p = writer.toString();
		// System.out.println(p);
		// parse s source code
		DeclarationList dls = parseMString(p);
		context = Context.newGlobalsContext();
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
	
	public void checkProblems(String resourceName) throws Exception {
		DeclarationList dl = parseResource(resourceName);
		context = Context.newGlobalsContext();
		ProblemCollector collector = new ProblemCollector();
		context.pushProblemListener(collector);
		dl.register(context);
		// by convention we only test the last decl
		IDeclaration decl = dl.getLast();
		assertNotNull(decl);
		if(decl instanceof IMethodDeclaration)
			((IMethodDeclaration)decl).check(context, true);
		else
			decl.check(context);
		List<ProblemDescriptor> expecteds = readExpectedProblems(resourceName);
		List<ProblemDescriptor> actuals = readActualProblems(collector);
		for(int i=0, count = Math.max(expecteds.size(), actuals.size());i < count;i++) {
			ProblemDescriptor expected = i < expecteds.size() ? expecteds.get(i) : null;
			ProblemDescriptor actual = i < actuals.size() ? actuals.get(i) : null;
			assertEquals(String.valueOf(expected), String.valueOf(actual));
		}
	}
	
	static public class ProblemDescriptor {
		
        public String type;
        public String message;
        public int startLine;
        public int startColumn;
        public int endLine;
        public int endColumn;

        public ProblemDescriptor() {
		}
		
		public ProblemDescriptor(IProblem problem) {
			startLine = problem.getStartLine();
			startColumn = problem.getStartColumn();
			endLine = problem.getEndLine();
			endColumn = problem.getEndColumn();
			type = problem.getType().name().toLowerCase();
			message = problem.getMessage();
		}

		@Override
		public int hashCode() {
			return Objects.hash(endColumn, endLine, message, startColumn, startLine, type);
		}

		@Override
		public boolean equals(Object obj) {
			return this == obj || (obj instanceof ProblemDescriptor && this.equals((ProblemDescriptor)obj));
		}
		
		public boolean equals(ProblemDescriptor other) {
			return endColumn == other.endColumn && endLine == other.endLine && Objects.equals(message, other.message) && startColumn == other.startColumn && startLine == other.startLine && Objects.equals(type, other.type);
		}

		@Override
		public String toString() {
			return "ProblemDescriptor [type=" + type + ", message=" + message + ", startLine=" + startLine + ", startColumn=" + startColumn + ", endLine=" + endLine + ", endColumn=" + endColumn + "]";
		}
		
	}
	
	private List<ProblemDescriptor> readActualProblems(ProblemCollector collector) {
		return collector.getProblems().stream()
				.map(ProblemDescriptor::new)
				.collect(Collectors.toList());
	}


	@SuppressWarnings("unchecked")
	protected List<ProblemDescriptor> readExpectedProblems(String resourceName) {
		try {
			int idx = resourceName.lastIndexOf('.');
			resourceName = resourceName.substring(0, idx) + ".problems.yml";
			try(InputStream input = getResourceAsStream(resourceName)) {
				assertNotNull("resource not found:" + resourceName, input);
				BufferedReader reader = new BufferedReader(new InputStreamReader(input));
				YamlReader yaml = new YamlReader(reader);
				List<ProblemDescriptor> read = yaml.read(List.class, ProblemDescriptor.class);
				return read!=null ? read : Collections.emptyList();
			} 
		} catch(Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
			return null;
		}
	}

}
