package prompto.declaration;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

import prompto.compiler.ClassConstant;
import prompto.compiler.ClassFile;
import prompto.compiler.CompilerException;
import prompto.compiler.CompilerUtils;
import prompto.compiler.FieldConstant;
import prompto.compiler.FieldInfo;
import prompto.compiler.Flags;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.error.SyntaxError;
import prompto.expression.CategorySymbol;
import prompto.expression.Symbol;
import prompto.grammar.CategorySymbolList;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.type.EnumeratedCategoryType;
import prompto.type.IType;
import prompto.type.ListType;
import prompto.utils.CodeWriter;
import prompto.utils.IdentifierList;

public class EnumeratedCategoryDeclaration extends ConcreteCategoryDeclaration implements IEnumeratedDeclaration {
	
	CategorySymbolList symbols;
	EnumeratedCategoryType type;
	
	public EnumeratedCategoryDeclaration(Identifier name) {
		super(name);
	}
	
	public EnumeratedCategoryDeclaration(Identifier name, IdentifierList attrs, IdentifierList derived, CategorySymbolList symbols) {
		super(name, attrs, derived, null);
		this.type = new EnumeratedCategoryType(name);
		setSymbols(symbols);
	}
	
	@Override
	public Type getDeclarationType() {
		return Type.ENUM;
	}
	
	@Override
	public CategorySymbolList getSymbols() {
		return symbols;
	}
	
	public void setSymbols(CategorySymbolList symbols) {
		this.symbols = symbols;
		for(Symbol s : symbols)
			s.setType(type);
		symbols.setType(new ListType(type));
	}
	
	@Override
	public boolean hasAttribute(Context context, Identifier name) {
		if("name".equals(name))
			return true;
		else
			return super.hasAttribute(context, name);
	}
	
	@Override
	protected void toODialect(CodeWriter writer) {
		writer.append("enumerated category ");
		writer.append(getName());
		if(attributes!=null) {
			writer.append('(');
			attributes.toDialect(writer, true);
			writer.append(")");
		}
		if(derivedFrom!=null) {
			writer.append(" extends ");
			derivedFrom.toDialect(writer, true);
		}
		writer.append(" {\n");
		writer.indent();
		for(Symbol symbol : symbols) {
			((CategorySymbol)symbol).toDialect(writer);
			writer.append(";\n");
		}
		writer.dedent();
		writer.append("}\n");
	}

	@Override
	protected void toEDialect(CodeWriter writer) {
		writer.append("define ");
		writer.append(getName());
		writer.append(" as enumerated ");
		if(derivedFrom!=null)
			derivedFrom.toDialect(writer, true);
		else 
			writer.append("category");
		if(attributes!=null && attributes.size()>0) {
			if(attributes.size()==1)
				writer.append(" with attribute ");
			else
				writer.append(" with attributes ");
			attributes.toDialect(writer, true);
			writer.append(", and symbols:\n");
		} else
			writer.append(" with symbols:\n");
		writer.indent();
		for(Symbol symbol : symbols) {
			symbol.toDialect(writer);
			writer.append("\n");
		}
		writer.dedent();
	}
	
	@Override
	protected void toSDialect(CodeWriter writer) {
		writer.append("enum ");
		writer.append(getName());
		writer.append("(");
		if(derivedFrom!=null) {
			derivedFrom.toDialect(writer, false);
			if(attributes!=null && attributes.size()>0)
				writer.append(", ");
		}
		if(attributes!=null && attributes.size()>0)
			attributes.toDialect(writer, false);
		writer.append("):\n");
		writer.indent();
		for(Symbol symbol : symbols) {
			symbol.toDialect(writer);
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
		super.check(context);
		for(Symbol s : symbols)
			s.check(context); // TODO
		return getType(context);
	}
	
	@Override
	public EnumeratedCategoryType getType(Context context) {
		return new EnumeratedCategoryType(getId());
	}
	
	@Override
	protected ClassFile compileConcreteClass(Context context, String fullName) {
		try {
			java.lang.reflect.Type concreteType = CompilerUtils.concreteTypeFrom(fullName);
			ClassFile classFile = new ClassFile(concreteType);
			compileSuperClass(context, classFile, new Flags());
			compileInterface(context, classFile, new Flags());
			compileCategoryField(context, classFile, new Flags());
			compileSymbolsField(context, classFile, new Flags());
			compileSymbolFields(context, classFile, new Flags());
			compileClassConstructor(context, classFile, new Flags());
			compileFields(context, classFile, new Flags());
			compileEmptyConstructor(context, classFile, new Flags());
			compileMethods(context, classFile, new Flags());
			return classFile;
		} catch(SyntaxError e) {
			throw new CompilerException(e);
		}
	}

	@Override
	protected boolean needsClassConstructor() {
		return true;
	}
	

	@Override
	protected ClassConstant getSuperClass(Context context) {
		if("Error".equals(getName()))
			return new ClassConstant(Throwable.class);
		else
			return super.getSuperClass(context);
	}
	
	@Override
	public boolean isPromptoRoot(Context context) {
		if("Error".equals(getName()))
			return false;
		else
			return super.isPromptoRoot(context);
	}
	
	@Override
	protected void compileClassConstructorBody(Context context, MethodInfo method, Flags flags) {
		if(isStorable())
			compilePopulateCategoryField(context, method, flags);
		for(CategorySymbol s : getSymbols())
			compilePopulateSymbolField(context, method, flags, s);
		compilePopulateSymbolsField(context, method, flags);
	}
	
	private void compilePopulateSymbolsField(Context context, MethodInfo method, Flags flags) {
		ClassConstant thisClass = method.getClassFile().getThisClass();
		CompilerUtils.compileNewInstance(method, ArrayList.class);
		MethodConstant m = new MethodConstant(ArrayList.class, "add", Object.class, boolean.class);
		for(CategorySymbol s : getSymbols()) {
			method.addInstruction(Opcode.DUP);
			java.lang.reflect.Type fieldType = getFieldType(context, thisClass.getType(), s);
			FieldConstant f = new FieldConstant(thisClass, s.getName(), fieldType);
			method.addInstruction(Opcode.GETSTATIC, f);
			method.addInstruction(Opcode.INVOKEVIRTUAL, m);
			method.addInstruction(Opcode.POP); // ignore returned boolean
		}
		FieldConstant f = new FieldConstant(thisClass, "%symbols", List.class);
		method.addInstruction(Opcode.PUTSTATIC, f);
	}

	private void compilePopulateSymbolField(Context context, MethodInfo method, Flags flags, CategorySymbol symbol) {
		ClassConstant thisClass = method.getClassFile().getThisClass();
		java.lang.reflect.Type fieldType = getFieldType(context, thisClass.getType(), symbol); 
		if(fieldType==thisClass.getType())
			symbol.compileCallConstructor(context, method, flags);
		else
			symbol.compileInnerClassAndCallConstructor(context, method, flags, thisClass, fieldType);
		FieldConstant f = new FieldConstant(thisClass, symbol.getName(), fieldType);
		method.addInstruction(Opcode.PUTSTATIC, f);
	}

	private void compileSymbolsField(Context context, ClassFile classFile, Flags flags) {
		FieldInfo field = new FieldInfo("%symbols", List.class); 
		field.addModifier(Modifier.STATIC);
		classFile.addField(field);
	}

	private void compileSymbolFields(Context context, ClassFile classFile, Flags flags) {
		getSymbols().forEach((s)->
			compileSymbolField(context, classFile, flags, s));
	}

	private void compileSymbolField(Context context, ClassFile classFile, Flags flags, Symbol symbol) {
		java.lang.reflect.Type type = getFieldType(context, classFile.getThisClass().getType(), symbol);
		FieldInfo field = new FieldInfo(symbol.getName(), type);
		field.clearModifier(Modifier.PROTECTED);
		field.addModifier(Modifier.STATIC | Modifier.PUBLIC);
		classFile.addField(field);
	}

	private java.lang.reflect.Type getFieldType(Context context, java.lang.reflect.Type thisType, Symbol symbol) {
		if(isPromptoRoot(context))
			return thisType;
		else
			return CompilerUtils.getExceptionType(thisType, symbol.getName());
	}

}
