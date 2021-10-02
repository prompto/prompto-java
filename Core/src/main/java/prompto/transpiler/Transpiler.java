package prompto.transpiler;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;

import prompto.declaration.CategoryDeclaration;
import prompto.declaration.IDeclaration;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.type.CategoryType;
import prompto.utils.Logger;
import prompto.utils.ResourceUtils;

public class Transpiler {

	static final Logger logger = new Logger();

	IJSEngine engine;
	Context context;
	Transpiler parent;
	Set<ITranspilable> declared;
	Set<String> required;
	Set<String> registered;
	int escapeMode;
	Stack<String> lines;
	StringBuilder line;
	List<String> initializers;
	String indents;
	String getterName;
	String setterName;
	
	public Transpiler(IJSEngine engine, Context context) {
		this.engine = engine;
		this.context = context;
		this.declared = new HashSet<>();
	    this.required = new HashSet<>();
	    this.registered = new HashSet<>();
	    this.escapeMode = 0;
	    this.lines = new Stack<>();
	    this.line = new StringBuilder();
	    this.initializers = new ArrayList<>();
	    this.indents = "";
	    this.getterName = null;
	    this.setterName = null;
	    // load polyfills
		this.require("Utils");
		this.require("ReactUtils");
		engine.getPolyfills().forEach(poly->this.require(poly));
 	}
	
	public Transpiler(Transpiler copyFrom, Context context) {
		this.engine = copyFrom.engine;
		this.context = context;
	    this.declared = copyFrom.declared;
	    this.required = copyFrom.required;
	    this.registered = copyFrom.registered;
	    this.escapeMode = copyFrom.escapeMode;
	    this.lines = copyFrom.lines;
	    this.line = copyFrom.line;
	    this.initializers = copyFrom.initializers;
	    this.indents = copyFrom.indents;
	    this.parent = copyFrom;
	    this.getterName = copyFrom.getterName;
	    this.setterName = copyFrom.setterName;
	}

	public IJSEngine getEngine() {
		return engine;
	}
	
	public Context getContext() {
		return context;
	}
	
	public String getGetterName() {
		return getterName;
	}

	public String getSetterName() {
		return setterName;
	}
	
	public int getEscapeMode() {
		return escapeMode;
	}
	
	public Transpiler newLocalTranspiler() {
		Context context = this.context.newLocalContext();
		return this.copyTranspiler(context);
	}

	public Transpiler newChildTranspiler() {
		return newChildTranspiler(this.context.newChildContext());
	}
	
	public Transpiler newChildTranspiler(Context calling) {
		return this.copyTranspiler(calling);
	}
	
	public Transpiler newInstanceTranspiler(CategoryType categoryType) {
		Context context = this.context.newInstanceContext(categoryType, true);
		return this.copyTranspiler(context);
	}
	
	
	public Transpiler newResourceTranspiler() {
		Context context = this.context.newResourceContext();
	    return this.copyTranspiler(context);
	}

	public Transpiler newDocumentTranspiler() {
		Context context = this.context.newDocumentContext(null, true);
	    return this.copyTranspiler(context);
	}

	public Transpiler newGetterTranspiler(String name) {
		Transpiler transpiler = this.newChildTranspiler();
	    transpiler.getterName = name;
	    return transpiler;
	}

	public Transpiler newSetterTranspiler(String name) {
		Transpiler transpiler = this.newChildTranspiler();
	    transpiler.setterName = name;
	    return transpiler;
	}

	public Transpiler copyTranspiler(Context context) {
		Transpiler transpiler = new Transpiler(this, context);
	    return transpiler;
	}
	
	public Transpiler append(Identifier value) {
		this.line.append(value.toString());
		return this;
	}

	public Transpiler append(String value) {
		this.line.append(value);
		return this;
	}
	
	public Transpiler append(char value) {
		this.line.append(value);
		return this;
	}

	public Transpiler append(boolean value) {
		this.line.append(value);
		return this;
	}
	
	public Transpiler indent() {
		return indent(false);
	}

	public Transpiler indent(boolean indentOnly) {
	   if(!indentOnly)
	        this.lines.push(this.line.toString());
	    this.indents += '\t';
	    this.line = new StringBuilder(this.indents);
	    return this;
	}
	
	public Transpiler dedent() {
	    String line = this.line.toString();
	    if(!(line.equals(this.indents)))
	        this.lines.push(line);
	    if(this.indents.isEmpty()) {
	        throw new RuntimeException("Illegal dedent!");
	    }
	    this.indents = this.indents.substring(1);
	    this.line = new StringBuilder(this.indents);
	    return this;
	}
	
	public Transpiler newLine() {
		this.lines.push(this.line.toString());
		this.line = new StringBuilder(this.indents);
		return this;
	}

	
	public Transpiler escape() {
	    this.escapeMode++;
	    return this;
	}
	
	
	public Transpiler unescape() {
	    this.escapeMode--;
	    return this;
	}

	
	public Transpiler trimLast(int count) {
	    this.line.setLength(this.line.length() - count);
	    return this;
	}

	
	public Transpiler printTestName(String testName) {
		this.append("print('").append(testName).append(" test ");
		return this;
	}


	public void flush() {
	    if(this.parent!=null) {
	        this.parent.line = this.line;
	        this.parent.indents = this.indents;
	    }
	}

	public void declare(ITranspilable transpilable) {
		if(transpilable instanceof IDeclaration && ((IDeclaration)transpilable).hasAnnotation(context, "Inlined"))
			return;
		else
			declared.add(transpilable);
	}
	
	public boolean isDeclared(ITranspilable transpilable) {
		if(transpilable instanceof IDeclaration && ((IDeclaration)transpilable).hasAnnotation(context, "Inlined"))
			return true;
		else
			return declared.contains(transpilable);
	}
	
	
	public Set<ITranspilable> getDeclared() {
		return declared;
	}

	public void require(String script) {
		required.add(script);
	}
	
	public Set<String> getRequired() {
		return required;
	}
	
	public boolean requires(String script) {
		return required.contains(script);
	}
	
	public void register(String script) {
		required.add(script);
		registered.add(script);
	}

	
	@Override
	public String toString() {
		populateLines();
	    return this.lines.stream().collect(Collectors.joining("\n"));
	}
	
	private void populateLines() {
	    this.appendAllRequired();
	    this.appendAllRegistered();
	    this.appendAllDeclared();
	    this.appendAllInitializers();
	    this.flush();
	}

	public void print(PrintWriter printer) {
		populateLines();
	    this.lines.forEach(printer::println);
	}


	private void appendAllDeclared() {
		List<ITranspilable> list = new ArrayList<>();
		Set<ITranspilable> set = new HashSet<>();
	    this.declared.forEach(decl -> {
	        if(decl instanceof CategoryDeclaration)
	            ((CategoryDeclaration)decl).ensureDeclarationOrder(this.context, list, set);
	        else
	            list.add(decl);
	    });
	    list.forEach(this::appendOneDeclared);
	}

	private void appendOneDeclared(ITranspilable decl) {
		Transpiler transpiler = this.newLocalTranspiler();
	    decl.transpile(transpiler);
	    transpiler.flush();
	    String line = this.line.toString();
	    if(!(line.equals(this.indents))) {
	        this.lines.push(line);
	        this.line = new StringBuilder(this.indents);
	    }
	    this.lines.push("");
	}
	
	private void appendAllRequired() {
		// make sure DataStore comes before RemoteStore
		if(required.remove("DataStore"))
			appendOneRequired("DataStore");
		required.forEach(this::appendOneRequired);
	}

	private void appendOneRequired(String module) {
		String result = getResourceAsString("prompto/intrinsic/" + module + ".js");
		if(result==null)
			result = getResourceAsString("polyfills/" + module + ".js");
		if(result!=null)
			this.lines.push(result);
		else
			throw new RuntimeException("Could not locate script: " + module);
	}
	
	private void appendAllRegistered() {
		registered.forEach(this::appendOneRegistered);
	}
	
	private void appendOneRegistered(String module) {
		this.lines.push("intrinsic." + module + " = " + module + ";");
	}


	private String getResourceAsString(String path) {
		try {
			return ResourceUtils.getResourceAsString(path);
		} catch(Throwable t) {
			return null;
		}
	}

	public void addInitializer(String line) {
		this.initializers.add(line);
	}

	private void appendAllInitializers() {
		this.initializers.forEach(this.lines::push);
	}


}
