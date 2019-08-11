package prompto.grammar;

import java.util.List;
import java.util.stream.Collectors;

import prompto.param.CodeParameter;
import prompto.param.IParameter;
import prompto.runtime.Context;
import prompto.transpiler.Transpiler;
import prompto.utils.CodeWriter;
import prompto.utils.ObjectList;

public class ParameterList extends ObjectList<IParameter> {

	private static final long serialVersionUID = 1L;

	public ParameterList() {
	}

	public ParameterList(IParameter argument) {
		this.add(argument);
	}
	
	public ParameterList(IParameter ... arguments) {
		for(IParameter argument : arguments)
			this.add(argument);
	}

	public void register(Context context) {
		for(IParameter argument : this) 
			argument.register(context);
	}

	public void check(Context context) {
		for(IParameter argument : this) 
			argument.check(context);
	}

	public IParameter find(Identifier name) {
		for(IParameter argument : this) {
			if(name.equals(argument.getId()))
					return argument;
		}
		return null;
	}
	
	public List<IParameter> stripOutTemplateArguments() {
		return this.stream()
			.filter((a)->
				!(a instanceof CodeParameter))
			.collect(Collectors.toList());
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
		case M:
			toMDialect(writer);
			break;
		}
	}
	
	private void toEDialect(CodeWriter writer) {
		IParameter last = this.getLast();
		writer.append("receiving ");
		for(IParameter argument : this) {
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
		for(IParameter argument : this) {
			argument.toDialect(writer);
			writer.append(", ");
		}
		writer.trimLast(2);
	}

	private void toMDialect(CodeWriter writer) {
		for(IParameter argument : this) {
			argument.toDialect(writer);
			writer.append(", ");
		}
		writer.trimLast(2);
	}

	public void declare(Transpiler transpiler) {
		this.forEach(arg->arg.declare(transpiler));
	}

	public void transpile(Transpiler transpiler) {
		List<IParameter> args = this.stream()
			.filter(arg->!(arg instanceof CodeParameter))
			.collect(Collectors.toList());
		if(!args.isEmpty()) {
	        args.forEach(arg->{
	            arg.transpile(transpiler);
	            transpiler.append(", ");
	        });
	        transpiler.trimLast(2);
	    }
	}

}
