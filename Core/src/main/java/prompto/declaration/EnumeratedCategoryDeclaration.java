package prompto.declaration;

import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import prompto.compiler.ResultInfo;
import prompto.compiler.StackLocal;
import prompto.error.SyntaxError;
import prompto.expression.CategorySymbol;
import prompto.expression.IExpression;
import prompto.expression.Symbol;
import prompto.grammar.CategorySymbolList;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoEnum;
import prompto.intrinsic.PromptoSymbol;
import prompto.runtime.Context;
import prompto.type.EnumeratedCategoryType;
import prompto.type.IType;
import prompto.type.ListType;
import prompto.utils.CodeWriter;
import prompto.utils.IdentifierList;

public class EnumeratedCategoryDeclaration extends ConcreteCategoryDeclaration 
	implements IEnumeratedDeclaration<CategorySymbol> {
	
	CategorySymbolList symbolsList;
	Map<String, CategorySymbol> symbolsMap;
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
	public DeclarationType getDeclarationType() {
		return DeclarationType.ENUMERATED;
	}
	
	@Override
	public CategorySymbolList getSymbolsList() {
		return symbolsList;
	}
	
	@Override
	public Map<String, CategorySymbol> getSymbolsMap() {
		return symbolsMap;
	}
	
	public void setSymbols(CategorySymbolList symbols) {
		this.symbolsMap = new HashMap<>();
		this.symbolsList = symbols;
		for(CategorySymbol s : symbols) {
			s.setType(type);
			symbolsMap.put(s.getName(), s);
		}
		symbols.setType(new ListType(type));
	}
	
	@Override
	public boolean hasAttribute(Context context, Identifier name) {
		if("name".equals(name.toString()))
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
		for(Symbol symbol : symbolsList) {
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
		for(Symbol symbol : symbolsList) {
			symbol.toDialect(writer);
			writer.append("\n");
		}
		writer.dedent();
	}
	
	@Override
	protected void toMDialect(CodeWriter writer) {
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
		for(Symbol symbol : symbolsList) {
			symbol.toDialect(writer);
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
	public IType check(Context context, boolean isStart) {
		super.check(context, isStart);
		for(Symbol s : symbolsList)
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
			java.lang.reflect.Type concreteType = CompilerUtils.categoryConcreteParentTypeFrom(fullName);
			ClassFile classFile = new ClassFile(concreteType);
			compileSuperClass(context, classFile, new Flags());
			compileInterface(context, classFile, new Flags());
			classFile.addInterface(PromptoEnum.class);
			compileCategoryField(context, classFile, new Flags());
			compileSymbolFields(context, classFile, new Flags());
			compileClassConstructor(context, classFile, new Flags());
			compileFields(context, classFile, new Flags());
			compileEmptyConstructor(context, classFile, new Flags());
			compileSuperConstructor(context, classFile, new Flags());
			compileMethods(context, classFile, new Flags());
			compileToString(context, classFile, new Flags());
			return classFile;
		} catch(SyntaxError e) {
			throw new CompilerException(e);
		}
	}

	private void compileToString(Context context, ClassFile classFile, Flags flags) {
		MethodInfo method = classFile.newMethod("toString", new Descriptor.Method(String.class));
		StackLocal local = method.registerLocal("this", VerifierType.ITEM_Object, classFile.getThisClass());
		CompilerUtils.compileALOAD(method, local);
		MethodConstant mc = new MethodConstant(classFile.getThisClass(), "getText", String.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, mc);
		method.addInstruction(Opcode.ARETURN);
	}

	private void compileSuperConstructor(Context context, ClassFile classFile, Flags flags) {
		if(isPromptoError(context))
			CompilerUtils.compileSuperConstructor(classFile, String.class);
	}

	@Override
	protected boolean needsClassConstructor() {
		return true;
	}
	

	@Override
	protected ClassConstant getSuperClass(Context context) {
		if("Error".equals(getName()))
			return new ClassConstant(RuntimeException.class);
		else
			return super.getSuperClass(context);
	}
	
	@Override
	public boolean isPromptoRoot(Context context) {
		return !isPromptoError(context);
	}
	
	@Override
	public boolean isPromptoError(Context context) {
		if("Error".equals(getName()))
			return true;
		else
			return super.isPromptoError(context);
	}


	@Override
	protected void compileClassConstructorBody(Context context, MethodInfo method, Flags flags) {
		if(isStorable())
			compilePopulateCategoryField(context, method, flags);
		for(CategorySymbol s : getSymbolsList())
			compilePopulateSymbolField(context, method, flags, s);
	}
	
	@Override
	protected void compileMethods(Context context, ClassFile classFile, Flags flags) {
		compileGetSymbolsMethod(context, classFile, new Flags());
		super.compileMethods(context, classFile, flags);
	}
	
	@Override
	protected void compileFields(Context context, ClassFile classFile, Flags flags) {
		super.compileFields(context, classFile, flags);
		Identifier name = new Identifier("name");
		if(!super.hasAttribute(context, name))
			compileField(context, classFile, flags, name);
	}
	
	private void compileGetSymbolsMethod(Context context, ClassFile classFile, Flags flags) {
		MethodInfo method = classFile.newMethod("getSymbols", new Descriptor.Method(List.class));
		method.addModifier(Modifier.STATIC);
		method.addInstruction(Opcode.LDC, classFile.getThisClass());
		MethodConstant m = new MethodConstant(PromptoSymbol.class, "getSymbols", 
				new Descriptor.Method(Class.class, List.class));
		method.addInstruction(Opcode.INVOKESTATIC, m);
		method.addInstruction(Opcode.ARETURN);
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

	private void compileSymbolFields(Context context, ClassFile classFile, Flags flags) {
		getSymbolsList().forEach((s)->
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

	public ResultInfo compileGetMember(Context context, MethodInfo method, Flags flags, IExpression parent, Identifier id) {
		if("symbols".equals(id.toString())) {
			java.lang.reflect.Type concreteType = CompilerUtils.getCategoryEnumConcreteType(getId());
			String getterName = CompilerUtils.getterName("symbols");
			MethodConstant m = new MethodConstant(concreteType, getterName, List.class);
			method.addInstruction(Opcode.INVOKESTATIC, m);
			return new ResultInfo(List.class);
		} else
			throw new SyntaxError("No static member support for non-singleton " + this.getName());
	}

}
