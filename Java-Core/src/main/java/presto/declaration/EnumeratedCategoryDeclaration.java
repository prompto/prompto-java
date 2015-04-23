package presto.declaration;

import presto.error.SyntaxError;
import presto.grammar.CategorySymbol;
import presto.grammar.CategorySymbolList;
import presto.grammar.Identifier;
import presto.grammar.Symbol;
import presto.grammar.SymbolList;
import presto.runtime.Context;
import presto.type.EnumeratedCategoryType;
import presto.type.IType;
import presto.type.ListType;
import presto.utils.CodeWriter;
import presto.utils.IdentifierList;

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
	public SymbolList<?> getSymbols() {
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
		writer.append(" as: enumerated ");
		if(derivedFrom!=null)
			derivedFrom.toDialect(writer, true);
		else 
			writer.append("category");
		if(attributes!=null && attributes.size()>0) {
			if(attributes.size()==1)
				writer.append(" with attribute: ");
			else
				writer.append(" with attributes: ");
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
	public void register(Context context) throws SyntaxError {
		context.registerDeclaration(this);
		for(Symbol s : symbols)
			s.register(context);
	}
	
	@Override
	public IType check(Context context) throws SyntaxError {
		super.check(context);
		for(Symbol s : symbols)
			s.check(context); // TODO
		return getType(context);
	}
	
	@Override
	public EnumeratedCategoryType getType(Context context) {
		return new EnumeratedCategoryType(getIdentifier());
	}

}
