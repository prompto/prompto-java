package presto.grammar;

import presto.error.SyntaxError;
import presto.runtime.Context;
import presto.utils.CodeWriter;
import presto.utils.ObjectList;

public class ArgumentList extends ObjectList<IArgument> {

	private static final long serialVersionUID = 1L;

	public ArgumentList() {
	}

	public ArgumentList(IArgument argument) {
		this.add(argument);
	}
	
	public void register(Context context) throws SyntaxError {
		for(IArgument argument : this) 
			argument.register(context);
	}

	public void check(Context context) throws SyntaxError {
		for(IArgument argument : this) 
			argument.check(context);
	}

	public IArgument find(String name) {
		for(IArgument argument : this) {
			if(name.equals(argument.getName()))
					return argument;
		}
		return null;
	}

	public void toDialect(CodeWriter writer) {
		if(this.size()==0)
			return;
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
	
	private void toEDialect(CodeWriter writer) {
		IArgument last = this.getLast();
		writer.append("receiving: ");
		for(IArgument argument : this) {
			if(argument==last)
				break;
			argument.toDialect(writer);
			writer.append(", ");
		}
		if(this.size()>1) {
			writer.trimLast(2);
			writer.append(" and ");
		}
		last.toDialect(writer);
		writer.append(" ");
	}

	private void toODialect(CodeWriter writer) {
		for(IArgument argument : this) {
			argument.toDialect(writer);
			writer.append(", ");
		}
		writer.trimLast(2);
	}

	private void toPDialect(CodeWriter writer) {
		for(IArgument argument : this) {
			argument.toDialect(writer);
			writer.append(", ");
		}
		writer.trimLast(2);
	}

}
