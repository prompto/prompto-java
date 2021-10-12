package prompto.declaration;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import prompto.compiler.ClassConstant;
import prompto.compiler.ClassFile;
import prompto.compiler.CompilerException;
import prompto.compiler.CompilerUtils;
import prompto.compiler.Descriptor;
import prompto.compiler.FieldConstant;
import prompto.compiler.FieldInfo;
import prompto.compiler.Flags;
import prompto.compiler.IVerifierEntry.VerifierType;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.NamedType;
import prompto.compiler.ResultInfo;
import prompto.compiler.StackLocal;
import prompto.compiler.StringConstant;
import prompto.error.InvalidSymbolError;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.NativeSymbol;
import prompto.expression.Symbol;
import prompto.grammar.Identifier;
import prompto.grammar.NativeSymbolList;
import prompto.intrinsic.PromptoNativeSymbol;
import prompto.runtime.Context;
import prompto.transpiler.Transpiler;
import prompto.type.EnumeratedNativeType;
import prompto.type.IType;
import prompto.type.ListType;
import prompto.type.NativeType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;

import com.fasterxml.jackson.databind.JsonNode;

public class EnumeratedNativeDeclaration extends BaseDeclaration 
	implements IEnumeratedDeclaration<NativeSymbol> {
	
	NativeSymbolList symbolsList;
	Map<String, NativeSymbol> symbolsMap;
	EnumeratedNativeType type;
	
	public EnumeratedNativeDeclaration(Identifier name, NativeType derivedFrom, NativeSymbolList symbols) {
		super(name);
		this.type = new EnumeratedNativeType(name, derivedFrom);
		setSymbols(symbols);
	}
	
	@Override
	public DeclarationType getDeclarationType() {
		return DeclarationType.ENUMERATED;
	}
	
	@Override
	public NativeSymbolList getSymbolsList() {
		return symbolsList;
	}
	
	@Override
	public Map<String, NativeSymbol> getSymbolsMap() {
		return symbolsMap;
	}

	public void setSymbols(NativeSymbolList symbols) {
		this.symbolsMap = new HashMap<>();
		this.symbolsList = symbols;
		for(NativeSymbol s : symbols) {
			s.setType(type);
			symbolsMap.put(s.getName(), s);
		}
		symbols.setType(new ListType(type));
	}

	@Override
	public void declarationToDialect(CodeWriter writer) {
		switch(writer.getDialect()) {
		case E:
			toEDialect(writer);
			break;
		case O:
			toODialect(writer);
			break;
		case M:
			toMDialect(writer);
			break;
		}
	}
	
	private void toMDialect(CodeWriter writer) {
		writer.append("enum ");
		writer.append(getName());
		writer.append('(');
		type.getDerivedFrom().toDialect(writer);
		writer.append("):\n");
		writer.indent();
		for(Symbol s : symbolsList) {
			s.toDialect(writer);
			writer.append("\n");
		}
		writer.dedent();
	}

	private void toODialect(CodeWriter writer) {
		writer.append("enumerated ");
		writer.append(getName());
		writer.append('(');
		type.getDerivedFrom().toDialect(writer);
		writer.append(") {\n");
		writer.indent();
		for(Symbol s : symbolsList) {
			s.toDialect(writer);
			writer.append(";\n");
		}
		writer.dedent();
		writer.append("}\n");
	}

	private void toEDialect(CodeWriter writer) {
		writer.append("define ");
		writer.append(getName());
		writer.append(" as enumerated ");
		type.getDerivedFrom().toDialect(writer);
		writer.append(" with symbols:\n");
		writer.indent();
		for(Symbol s : symbolsList) {
			s.toDialect(writer);
			writer.append("\n");
		}
		writer.dedent();
	}

	@Override
	public void register(Context context) {
		context.registerDeclaration(this);
		for(Symbol s : symbolsList)
			s.register(context);
	}
	
	@Override
	public IType check(Context context) {
		for(Symbol s : symbolsList)
			s.check(context);
		return type;
	}
	
	@Override
	public IType getType(Context context) {
		return type;
	}

	public IValue readJSONValue(Context context, JsonNode value) throws PromptoError {
		if(value.isObject() && value.has("name"))
			value = value.get("name");
		String name = value.asText();
		for(Symbol symbol : symbolsList) {
			if(name.equals(symbol.getName()))
				return symbol.interpret(context);
		}
		throw new InvalidSymbolError(name = " is not a valid " + this.getName() + " symbol.");
	}

	public ClassFile compile(Context context, String fullName) {
		try {
			ClassFile classFile = new ClassFile(new NamedType(fullName));
			classFile.setSuperClass(new ClassConstant(PromptoNativeSymbol.class));
			compileSymbolFields(context, classFile, new Flags());
			compileNameField(context, classFile, new Flags());
			compileValueField(context, classFile, new Flags());
			compileValueConstructor(context, classFile, new Flags());
			compileFieldGetters(context, classFile, new Flags());
			compileClassConstructor(context, classFile, new Flags());
			compileGetSymbolsMethod(context, classFile, new Flags());
			compileSymbolOfMethod(context, classFile, new Flags());
			return classFile;
		} catch(SyntaxError e) {
			throw new CompilerException(e);
		}
	}
	
	private void compileFieldGetters(Context context, ClassFile classFile, Flags flags) {
		compileFieldGetter(context, classFile, flags, "name", String.class);
		compileFieldGetter(context, classFile, flags, "value", type.getDerivedFrom().toJavaType(context));
	}
	
	private void compileFieldGetter(Context context, ClassFile classFile, Flags flags, String fieldName, Type fieldType) {
		String name = CompilerUtils.getterName(fieldName);
		Descriptor.Method proto = new Descriptor.Method(fieldType);
		MethodInfo method = classFile.newMethod(name, proto);
		method.registerLocal("this", VerifierType.ITEM_Object, classFile.getThisClass());
		method.addInstruction(Opcode.ALOAD_0, classFile.getThisClass());
		FieldConstant f = new FieldConstant(classFile.getThisClass(), fieldName, fieldType);
		method.addInstruction(Opcode.GETFIELD, f);
		method.addInstruction(Opcode.ARETURN, new ClassConstant(fieldType));
	}

	private void compileSymbolFields(Context context, ClassFile classFile, Flags flags) {
		getSymbolsList().forEach((s)->
			compileSymbolField(context, classFile, flags, s));
	}

	private void compileSymbolField(Context context, ClassFile classFile, Flags flags, Symbol s) {
		FieldInfo field = new FieldInfo(s.getName(), classFile.getThisClass().getType());
		field.clearModifier(Modifier.PROTECTED);
		field.addModifier(Modifier.STATIC | Modifier.PUBLIC);
		classFile.addField(field);
	}
	

	private void compileNameField(Context context, ClassFile classFile, Flags flags) {
		FieldInfo field = new FieldInfo("name", String.class);
		field.clearModifier(Modifier.PROTECTED);
		classFile.addField(field);
	}

	private void compileValueField(Context context, ClassFile classFile, Flags flags) {
		FieldInfo field = new FieldInfo("value", type.getDerivedFrom().toJavaType(context));
		field.clearModifier(Modifier.PROTECTED);
		classFile.addField(field);
	}
	
	private void compileValueConstructor(Context context, ClassFile classFile, Flags flags) {
		Descriptor.Method proto = new Descriptor.Method(type.getDerivedFrom().toJavaType(context), void.class);
		MethodInfo method = classFile.newMethod("<init>", proto);
		// call super()
		StackLocal local = method.registerLocal("this", VerifierType.ITEM_UninitializedThis, classFile.getThisClass());
		CompilerUtils.compileALOAD(method, local);
		MethodConstant m = new MethodConstant(classFile.getSuperClass(), "<init>", void.class);
		method.addInstruction(Opcode.INVOKESPECIAL, m);
		// set field
		CompilerUtils.compileALOAD(method, local);
		StackLocal value = method.registerLocal("%value%", VerifierType.ITEM_Object, new ClassConstant(type.getDerivedFrom().toJavaType(context)));
		CompilerUtils.compileALOAD(method, value);
		FieldConstant f = new FieldConstant(method.getClassFile().getThisClass(), "value", type.getDerivedFrom().toJavaType(context));
		method.addInstruction(Opcode.PUTFIELD, f);
		// done
		method.addInstruction(Opcode.RETURN);
	}
	
	protected void compileClassConstructor(Context context, ClassFile classFile, Flags flags) {
		MethodInfo method = classFile.newMethod("<clinit>", new Descriptor.Method(void.class));
		method.addModifier(Modifier.STATIC);
		for(NativeSymbol s : getSymbolsList())
			compilePopulateSymbolField(context, classFile, method, flags, s);
		method.addInstruction(Opcode.RETURN);
	}
	
	private void compilePopulateSymbolField(Context context, ClassFile classFile, MethodInfo method, Flags flags, NativeSymbol symbol) {
		symbol.compileCallConstructor(context, method, flags); 
		method.addInstruction(Opcode.DUP);
		method.addInstruction(Opcode.LDC, new StringConstant(symbol.getName()));
		FieldConstant field = new FieldConstant(classFile.getThisClass(), "name", String.class);
		method.addInstruction(Opcode.PUTFIELD, field);
		field = new FieldConstant(classFile.getThisClass(), symbol.getName(), classFile.getThisClass().getType());
		method.addInstruction(Opcode.PUTSTATIC, field); 
	}
	
	private void compileGetSymbolsMethod(Context context, ClassFile classFile, Flags flags) {
		MethodInfo method = classFile.newMethod("getSymbols", new Descriptor.Method(List.class));
		method.addModifier(Modifier.STATIC);
		method.addInstruction(Opcode.LDC, classFile.getThisClass());
		MethodConstant m = new MethodConstant(PromptoNativeSymbol.class, "getNativeSymbols", 
				new Descriptor.Method(Class.class, List.class));
		method.addInstruction(Opcode.INVOKESTATIC, m);
		method.addInstruction(Opcode.ARETURN);
	}

	private void compileSymbolOfMethod(Context context, ClassFile classFile, Flags flags) {
		MethodInfo method = classFile.newMethod("symbolOf", new Descriptor.Method(String.class, PromptoNativeSymbol.class));
		method.addModifier(Modifier.STATIC);
		method.addInstruction(Opcode.LDC, classFile.getThisClass());
		method.addInstruction(Opcode.ALOAD_0, new ClassConstant(String.class));
		MethodConstant m = new MethodConstant(PromptoNativeSymbol.class, "nativeSymbolOf", 
				new Descriptor.Method(Class.class, String.class, PromptoNativeSymbol.class));
		method.addInstruction(Opcode.INVOKESTATIC, m);
		method.addInstruction(Opcode.ARETURN);
	}

	@Override
	public void declare(Transpiler transpiler) {
		if(!transpiler.isDeclared(this)) {
			transpiler.require("List");
			transpiler.declare(this);
		}
	}
	
	@Override
	public boolean transpile(Transpiler transpiler) {
	    transpiler.append("function " + this.getName() + "(name, value) { this.name = name; this.value = value; return this; };").newLine();
	    transpiler.append(this.getName()).append(".prototype.toString = function() { return this.name; };").newLine();
	    transpiler.append(this.getName()).append(".prototype.equals = function(other) { return this == other; };").newLine();
	    this.symbolsList.forEach(symbol->symbol.initialize(transpiler));
	    List<String> names = this.symbolsList.stream().map(Symbol::getName).collect(Collectors.toList());
	    transpiler.append(this.getName()).append(".symbols = new List(false, [").append(names.stream().collect(Collectors.joining(", "))).append("]);").newLine();
	    transpiler.append(this.getName()).append(".symbolOf = function(name) { return eval(name); };");
	    return true;
	}

	public ResultInfo compileGetStaticMember(Context context, MethodInfo method, Flags flags, Identifier id) {
		if("symbols".equals(id.toString())) {
			java.lang.reflect.Type concreteType = CompilerUtils.getNativeEnumType(getId());
			String getterName = CompilerUtils.getterName("symbols");
			MethodConstant m = new MethodConstant(concreteType, getterName, List.class);
			method.addInstruction(Opcode.INVOKESTATIC, m);
			return new ResultInfo(List.class);
		} else
			throw new SyntaxError("No such field " + id);
	}


}
