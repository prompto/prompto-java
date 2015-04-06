package presto.declaration;

import presto.error.SyntaxError;
import presto.grammar.NativeSymbolList;
import presto.grammar.Symbol;
import presto.runtime.Context;
import presto.type.EnumeratedNativeType;
import presto.type.IType;
import presto.type.ListType;
import presto.type.NativeType;
import presto.utils.CodeWriter;

public class EnumeratedNativeDeclaration extends BaseDeclaration implements IEnumeratedDeclaration {
	
	NativeSymbolList symbols;
	EnumeratedNativeType type;
	
	public EnumeratedNativeDeclaration(String name, NativeType derivedFrom, NativeSymbolList symbols) {
		super(name);
		this.type = new EnumeratedNativeType(name, derivedFrom);
		setSymbols(symbols);
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
			toPDialect(writer);
			break;
		}
	}
	
	private void toPDialect(CodeWriter writer) {
		writer.append("enum ");
		writer.append(name);
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
		writer.append(name);
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
		writer.append(name);
		writer.append(" as: enumerated ");
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
	public void register(Context context) throws SyntaxError {
		context.registerDeclaration(this);
		for(Symbol s : symbols)
			s.register(context);
	}
	
	@Override
	public IType check(Context context) throws SyntaxError {
		for(Symbol s : symbols)
			s.check(context);
		return type;
	}
	
	@Override
	public IType getType(Context context) {
		return type;
	}
}
