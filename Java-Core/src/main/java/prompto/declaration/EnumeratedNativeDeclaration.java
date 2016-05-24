package prompto.declaration;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

import prompto.compiler.ClassConstant;
import prompto.compiler.ClassFile;
import prompto.compiler.CompilerException;
import prompto.compiler.CompilerUtils;
import prompto.compiler.Descriptor;
import prompto.compiler.FieldConstant;
import prompto.compiler.FieldInfo;
import prompto.compiler.Flags;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.PromptoType;
import prompto.error.InvalidSymbolError;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.NativeSymbol;
import prompto.expression.Symbol;
import prompto.grammar.Identifier;
import prompto.grammar.NativeSymbolList;
import prompto.runtime.Context;
import prompto.type.EnumeratedNativeType;
import prompto.type.IType;
import prompto.type.ListType;
import prompto.type.NativeType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;

import com.fasterxml.jackson.databind.JsonNode;

public class EnumeratedNativeDeclaration extends BaseDeclaration 
	implements IEnumeratedDeclaration<NativeSymbol> {
	
	NativeSymbolList symbols;
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
	public NativeSymbolList getSymbols() {
		return symbols;
	}

	public void setSymbols(NativeSymbolList symbols) {
		this.symbols = symbols;
		for(Symbol s : symbols)
			s.setType(type);
		symbols.setType(new ListType(type));
	}

	@Override
	public void toDialect(CodeWriter writer) {
		switch(writer.getDialect()) {
		case E:
			toEDialect(writer);
			break;
		case O:
			toODialect(writer);
			break;
		case S:
			toSDialect(writer);
			break;
		}
	}
	
	private void toSDialect(CodeWriter writer) {
		writer.append("enum ");
		writer.append(getName());
		writer.append('(');
		type.getDerivedFrom().toDialect(writer);
		writer.append("):\n");
		writer.indent();
		for(Symbol s : symbols) {
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
		for(Symbol s : symbols) {
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
		for(Symbol s : symbols) {
			s.toDialect(writer);
			writer.append("\n");
		}
		writer.dedent();
	}

	@Override
	public void register(Context context) {
		context.registerDeclaration(this);
		for(Symbol s : symbols)
			s.register(context);
	}
	
	@Override
	public IType check(Context context) {
		for(Symbol s : symbols)
			s.check(context);
		return type;
	}
	
	@Override
	public IType getType(Context context) {
		return type;
	}

	public IValue readJSONValue(Context context, JsonNode value) throws PromptoError {
		String name = value.asText();
		for(Symbol symbol : symbols) {
			if(name.equals(symbol.getSymbol()))
				return symbol.interpret(context);
		}
		throw new InvalidSymbolError(name = " is not a valid " + this.getName() + " symbol.");
	}

	public ClassFile compile(Context context, String fullName) {
		try {
			ClassFile classFile = new ClassFile(new PromptoType(fullName));
			classFile.setSuperClass(new ClassConstant(Object.class));
			compileSymbolFields(context, classFile, new Flags());
			compileSymbolsField(context, classFile, new Flags());
			compileClassConstructor(context, classFile, new Flags());
			CompilerUtils.compileEmptyConstructor(classFile);
			return classFile;
		} catch(SyntaxError e) {
			throw new CompilerException(e);
		}
	}
	
	private void compileSymbolsField(Context context, ClassFile classFile, Flags flags) {
		FieldInfo field = new FieldInfo("%symbols", List.class); 
		field.clearModifier(Modifier.PROTECTED);
		field.addModifier(Modifier.STATIC | Modifier.PUBLIC);
		classFile.addField(field);
	}

	private void compileSymbolFields(Context context, ClassFile classFile, Flags flags) {
		getSymbols().forEach((s)->
			compileSymbolField(context, classFile, flags, s));
	}

	private java.lang.reflect.Type getSymbolJavaType(Context context) {
		return type.getDerivedFrom().getJavaType(context);
	}
	
	private void compileSymbolField(Context context, ClassFile classFile, Flags flags, Symbol s) {
		FieldInfo field = new FieldInfo(s.getName(), getSymbolJavaType(context));
		field.clearModifier(Modifier.PROTECTED);
		field.addModifier(Modifier.STATIC | Modifier.PUBLIC);
		classFile.addField(field);
	}
	
	protected void compileClassConstructor(Context context, ClassFile classFile, Flags flags) {
		MethodInfo method = classFile.newMethod("<clinit>", new Descriptor.Method(void.class));
		method.addModifier(Modifier.STATIC);
		for(Symbol s : getSymbols())
			compilePopulateSymbolField(context, method, flags, s);
		compilePopulateSymbolsField(context, method, flags);
		method.addInstruction(Opcode.RETURN);
	}
	
	private void compilePopulateSymbolField(Context context, MethodInfo method, Flags flags, Symbol s) {
		s.compile(context, method, flags);
		FieldConstant f = new FieldConstant(method.getClassFile().getThisClass(), s.getName(), getSymbolJavaType(context));
		method.addInstruction(Opcode.PUTSTATIC, f);
	}

	private void compilePopulateSymbolsField(Context context, MethodInfo method, Flags flags) {
		ClassConstant thisClass = method.getClassFile().getThisClass();
		CompilerUtils.compileNewInstance(method, ArrayList.class);
		MethodConstant m = new MethodConstant(ArrayList.class, "add", Object.class, boolean.class);
		for(NativeSymbol s : getSymbols()) {
			method.addInstruction(Opcode.DUP);
			FieldConstant f = new FieldConstant(thisClass, s.getName(), getSymbolJavaType(context));
			method.addInstruction(Opcode.GETSTATIC, f);
			method.addInstruction(Opcode.INVOKEVIRTUAL, m);
			method.addInstruction(Opcode.POP); // ignore returned boolean
		}
		FieldConstant f = new FieldConstant(thisClass, "%symbols", List.class);
		method.addInstruction(Opcode.PUTSTATIC, f);
	}

}
