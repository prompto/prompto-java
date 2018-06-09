package prompto.transpiler;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;

import prompto.declaration.CategoryDeclaration;
import prompto.declaration.IDeclaration;
import prompto.declaration.IMethodDeclaration;
import prompto.runtime.Context;
import prompto.utils.ResourceUtils;

public class Transpiler {

	public static String transpileMethod(Context context, IMethodDeclaration method, String ... polyfills) {
		Transpiler transpiler = new Transpiler(context);
		transpiler.require("Utils");
		for(String polyfill : polyfills)
			transpiler.require(polyfill);
		method.declare(transpiler);
		return transpiler.toString();
	}

	Context context;
	Transpiler parent;
	Set<IDeclaration> declared;
	Set<String> required;
	Stack<String> lines;
	StringBuilder line;
	String indents;
	boolean supportsDestructuring = false;
	
	public Transpiler(Context context) {
		this.context = context;
		this.declared = new HashSet<>();
	    this.required = new HashSet<>();
	    this.lines = new Stack<>();
	    this.line = new StringBuilder();
	    this.indents = "";
 	}
	
	public Context getContext() {
		return context;
	}

	public Transpiler newLocalTranspiler() {
		Context context = this.context.newLocalContext();
		return this.copyTranspiler(context);
	}

	public Transpiler newChildTranspiler(Context calling) {
		if(calling==null)
			calling = this.context.newChildContext();
		return this.copyTranspiler(calling);
	}

	public Transpiler copyTranspiler(Context context) {
		Transpiler transpiler = new Transpiler(context);
	    transpiler.declared = this.declared;
	    transpiler.required = this.required;
	    transpiler.lines = this.lines;
	    transpiler.line = this.line;
	    transpiler.indents = this.indents;
	    transpiler.parent = this;
	    return transpiler;
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

	public Transpiler trimLast(int count) {
	    this.line.setLength(this.line.length() - count);
	    return this;
	}


	public void flush() {
	    if(this.parent!=null) {
	        this.parent.line = this.line;
	        this.parent.indents = this.indents;
	    }
	}

	public void declare(IDeclaration declaration) {
		declared.add(declaration);
	}

	public void require(String script) {
		required.add(script);
	}
	
	@Override
	public String toString() {
	    this.appendAllRequired();
	    this.appendAllDeclared();
	    return this.lines.stream().collect(Collectors.joining("\n"));
	}

	private void appendAllDeclared() {
		List<IDeclaration> list = new ArrayList<>();
		Set<IDeclaration> set = new HashSet<>();
	    this.declared.forEach(decl -> {
	        if(decl instanceof CategoryDeclaration)
	            ((CategoryDeclaration)decl).ensureDeclarationOrder(this.context, list, set);
	        else
	            list.add(decl);
	    });
	    list.forEach(this::appendOneDeclared);
	}

	private void appendOneDeclared(IDeclaration decl) {
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
		required.forEach(this::appendOneRequired);
	}

	private void appendOneRequired(String script) {
		String path = this.getClass().getPackage().getName().replace('.', '/') + '/' + script + ".js";
		try {
			String data = ResourceUtils.getResourceAsString(path);
			this.lines.push(data);
		} catch(Throwable t) {
			throw new RuntimeException("While appending script: " + path, t);
		}
	}

	public void supportsDestructuring(boolean set) {
		supportsDestructuring = set;
	}
	
	public boolean supportsDestructuring() {
		return supportsDestructuring;
	}





}
