package prompto.grammar;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import prompto.declaration.IMethodDeclaration;
import prompto.error.SyntaxError;
import prompto.expression.AndExpression;
import prompto.expression.IExpression;
import prompto.expression.UnresolvedIdentifier;
import prompto.param.AttributeParameter;
import prompto.param.IParameter;
import prompto.runtime.Context;
import prompto.transpiler.ITranspilable;
import prompto.transpiler.Transpiler;
import prompto.utils.CodeWriter;
import prompto.value.ContextualExpression;


public class ArgumentList extends LinkedList<Argument> {

	private static final long serialVersionUID = 1L;

	public ArgumentList() {
		
	}
	
	public ArgumentList(Collection<Argument> arguments) {
		super(arguments);
	}

	/* post-fix expression priority for final argument in E dialect */
	/* 'xyz with a and b as c' should read 'xyz with a, b as c' NOT 'xyz with (a and b) as c' */
	public void checkLastAnd() {
		Argument argument = this.getLast();
		if(argument!=null && argument.getParameter()!=null && argument.getExpression() instanceof AndExpression) {
			AndExpression and = (AndExpression)argument.getExpression();
			if(and.getLeft() instanceof UnresolvedIdentifier) {
				Identifier id = ((UnresolvedIdentifier)and.getLeft()).getId();
				if(Character.isLowerCase(id.toString().charAt(0))) {
					this.removeLast();
					// add AttributeArgument
					AttributeParameter parameter = new AttributeParameter(id);
					Argument attribute = new Argument(parameter, null);
					this.add(attribute);
					// fix last argument
					argument.setExpression(and.getRight());
					this.add(argument);
				}
			}
		}
	}
	
	public int findIndex(Identifier name) {
		for(int i=0;i<this.size();i++) {
			if(name.equals(this.get(i).getParameterId())) {
				return i;
			}
		}
		return -1;
	}

	public Argument find(Identifier name) {
		for(Argument argument : this) {
			if(name.equals(argument.getParameterId()))
				return argument;
		}
		return null;
	}

	public ArgumentList resolveAndCheck(Context context, IMethodDeclaration declaration) {
		ArgumentList arguments = new ArgumentList();
		for(Argument argument : this)
			arguments.add(argument.resolveAndCheck(context, declaration.getParameters()));
		return arguments;
	}
	
	public void toDialect(CodeWriter writer) {
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
		int idx = 0;
		// anonymous argument before 'with'
		if(this.size()>0 && this.get(0).getParameter()==null) {
			writer.append(' ');
			this.get(idx++).toDialect(writer);
		}
		if(idx<this.size()) {
			writer.append(" with ");
			this.get(idx++).toDialect(writer);
			writer.append(", ");
			while(idx<this.size()-1) {
				this.get(idx++).toDialect(writer);
				writer.append(", ");
			}
			writer.trimLast(2);
			if(idx<this.size()) {
				writer.append(" and ");				
				this.get(idx++).toDialect(writer);
			}
		}
	}
	
	private void toODialect(CodeWriter writer) {
		writer.append("(");
		for(Argument as : this) {
			as.toDialect(writer);
			writer.append(", ");
		}
		if(this.size()>0)
			writer.trimLast(2);
		writer.append(")");
	}

	private void toMDialect(CodeWriter writer) {
		toODialect(writer);
	}

	public void declare(Transpiler transpiler, IMethodDeclaration declaration) {
		this.forEach(arg -> arg.declare(transpiler, declaration));
	}

	public void ensureDeclarationOrder(Context context, List<ITranspilable> list, Set<ITranspilable> set) {
		this.forEach(arg -> arg.ensureDeclarationOrder(context, list, set));
	}

	public ArgumentList makeArguments(Context context, IMethodDeclaration declaration) {
		ArgumentList original = new ArgumentList(this);
		ArgumentList resolved = new ArgumentList();
		for(int i=0;i<declaration.getParameters().size();i++) {
		    IParameter parameter = declaration.getParameters().get(i);
		    Argument argument = null;
	        int index = original.findIndex(parameter.getId());
		    if(index<0 && i==0 && this.size()>0 && this.get(0).getParameter()==null)
		        index = 0;
		    if(index>=0) {
	            argument = original.get(index);
	            original.remove(index);
	        }
	        if(argument==null) {
	            if (parameter.getDefaultExpression() != null)
	                resolved.add(new Argument(parameter, parameter.getDefaultExpression()));
	            else
	                throw new SyntaxError("Missing argument:" + parameter.getName());
	        } else {
	            IExpression expression = new ContextualExpression(context, argument.getExpression());
	            resolved.add(new Argument(parameter, expression));
	        }
	    }
	    if(original.size() > 0) {
	    	Argument argument = original.get(0);
	    	IParameter parameter = argument.getParameter();
	    	IExpression expression = argument.getExpression();
	    	String name = parameter==null ? (expression==null ? "<unknown>" : expression.toString()) : parameter.getName();
	        throw new SyntaxError("Method has no argument:" + name);
	    }
	    return resolved;
	}


}
