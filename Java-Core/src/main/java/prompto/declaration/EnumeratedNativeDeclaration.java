package prompto.declaration;

import com.fasterxml.jackson.databind.JsonNode;

import prompto.error.InvalidSymbolError;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
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

public class EnumeratedNativeDeclaration extends BaseDeclaration implements IEnumeratedDeclaration {
	
	NativeSymbolList symbols;
	EnumeratedNativeType type;
	
	public EnumeratedNativeDeclaration(Identifier name, NativeType derivedFrom, NativeSymbolList symbols) {
		super(name);
		this.type = new EnumeratedNativeType(name, derivedFrom);
		setSymbols(symbols);
	}
	
	@Override
	public Type getDeclarationType() {
		return Type.ENUM;
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

	public IValue readJSONValue(Context context, JsonNode value) throws PromptoError {
		String name = value.asText();
		for(Symbol symbol : symbols) {
			if(name.equals(symbol.getSymbol()))
				return symbol.interpret(context);
		}
		throw new InvalidSymbolError(name = " is not a valid " + this.getName() + " symbol.");
	}
}
