package prompto.grammar;

import prompto.argument.IArgument;
import prompto.runtime.Context;
import prompto.utils.CodeWriter;
import prompto.utils.ObjectList;

public class ArgumentList extends ObjectList<IArgument> {

	private static final long serialVersionUID = 1L;

	public ArgumentList() {
	}

	public ArgumentList(IArgument argument) {
		this.add(argument);
	}
	
	public void register(Context context) {
		for(IArgument argument : this) 
			argument.register(context);
	}

	public void check(Context context) {
		for(IArgument argument : this) 
			argument.check(context);
	}

	public IArgument find(Identifier name) {
		for(IArgument argument : this) {
			if(name.equals(argument.getId()))
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
			toSDialect(writer);
			break;
		}
	}
	
	private void toEDialect(CodeWriter writer) {
		IArgument last = this.getLast();
		writer.append("receiving ");
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

	private void toSDialect(CodeWriter writer) {
		for(IArgument argument : this) {
			argument.toDialect(writer);
			writer.append(", ");
		}
		writer.trimLast(2);
	}

}
