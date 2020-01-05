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

	public ParameterList(IParameter param) {
		this.add(param);
	}
	
	public ParameterList(IParameter ... params) {
		for(IParameter param : params)
			this.add(param);
	}

	public void register(Context context) {
		for(IParameter param : this) 
			param.register(context);
	}

	public void check(Context context) {
		for(IParameter argument : this) 
			argument.check(context);
	}

	public IParameter find(Identifier name) {
		for(IParameter param : this) {
			if(name.equals(param.getId()))
					return param;
		}
		return null;
	}
	
	public List<IParameter> stripOutTemplateParameters() {
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
		for(IParameter param : this) {
			if(param==last)
				break;
			param.toDialect(writer);
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
		for(IParameter param : this) {
			param.toDialect(writer);
			writer.append(", ");
		}
		writer.trimLast(2);
	}

	private void toMDialect(CodeWriter writer) {
		for(IParameter param : this) {
			param.toDialect(writer);
			writer.append(", ");
		}
		writer.trimLast(2);
	}

	public void declare(Transpiler transpiler) {
		this.forEach(param -> param.declare(transpiler));
	}

	public void transpile(Transpiler transpiler) {
		List<IParameter> params = this.stream()
			.filter(param->!(param instanceof CodeParameter))
			.collect(Collectors.toList());
		if(!params.isEmpty()) {
	        params.forEach(param->{
	            param.transpile(transpiler);
	            transpiler.append(", ");
	        });
	        transpiler.trimLast(2);
	    }
	}

}
