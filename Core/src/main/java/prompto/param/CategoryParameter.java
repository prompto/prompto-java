package prompto.param;

import java.util.Objects;

import prompto.compiler.Flags;
import prompto.compiler.MethodInfo;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.ArrowExpression;
import prompto.expression.IExpression;
import prompto.grammar.Argument;
import prompto.grammar.ArgumentList;
import prompto.grammar.Identifier;
import prompto.parser.Dialect;
import prompto.runtime.Context;
import prompto.transpiler.Transpiler;
import prompto.type.DecimalType;
import prompto.type.IType;
import prompto.type.IntegerType;
import prompto.type.MethodType;
import prompto.utils.CodeWriter;
import prompto.value.ContextualExpression;
import prompto.value.IValue;

public class CategoryParameter extends BaseParameter implements ITypedParameter {
	
	IType type;
	IType resolved;
	
	public CategoryParameter(IType type, Identifier id) {
		super(id);
		this.type = type;
	}

	public CategoryParameter(IType type, Identifier id, IExpression defaultValue) {
		super(id);
		this.type = type;
		setDefaultExpression(defaultValue);
	}

	@Override
	public IType getType() {
		return type;
	}
	
	public IType getResolved() {
		return resolved;
	}
	
	@Override
	public String getSignature(Dialect dialect) {
		return type.getTypeNameId().toString() + " " + id.toString();
	}
	
	@Override
	public String getProto() {
		return type.getTypeNameId().toString();
	}
	
	@Override
	public String getTranspiledName(Context context) {
		return type.getTranspiledName(context);
	}
	
	@Override
	public IValue checkValue(Context context, IExpression expression) throws PromptoError {
		resolve(context);
		if(resolved instanceof MethodType)
			return expression.interpretReference(context);
		else
			return super.checkValue(context, expression);
	}
	
	@Override
	public void compileParameter(Context context, MethodInfo method, Flags flags, ArgumentList assignments, boolean isFirst) {
		resolve(context);
		if(resolved instanceof MethodType) {
			Argument assign = makeArgument(assignments, isFirst);
			assign.getExpression().compileReference(context.getCallingContext(), method, flags);
		} else
			super.compileParameter(context, method, flags, assignments, isFirst);
	}
	
	
	@Override
	public void toDialect(CodeWriter writer) {
		if(mutable)
			writer.append("mutable ");
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
		if(defaultExpression!=null) {
			writer.append(" = ");
			defaultExpression.toDialect(writer);
		}
	}
	
	private void toEDialect(CodeWriter writer) {
		boolean anonymous = "any".equals(type.getTypeName());
		type.toDialect(writer);
		if(anonymous) {
			writer.append(' ');
			writer.append(id);
		}
		if(!anonymous) {
			writer.append(' ');
			writer.append(id);
		}
	}

	private void toODialect(CodeWriter writer) {
		type.toDialect(writer);
		writer.append(' ');
		writer.append(id);
	}

	private void toMDialect(CodeWriter writer) {
		writer.append(id);
		writer.append(':');
		type.toDialect(writer);
	}

	@Override
	public String toString() {
		return type.toString() + " " + id.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==this)
			return true;
		if(obj==null)
			return false;
		if(!(obj instanceof CategoryParameter))
			return false;
		CategoryParameter other = (CategoryParameter)obj;
		return Objects.equals(this.getType(),other.getType())
				&& Objects.equals(this.getId(),other.getId());
	}

	@Override
	public void register(Context context) {
		Context actual = context.contextForValue(id);
		if(actual==context)
			throw new SyntaxError("Duplicate argument: \"" + id + "\"");
		resolve(context);
		if(resolved==type)
			context.registerValue(this);
		else {
			CategoryParameter param = new CategoryParameter(resolved, id);
			param.setMutable(mutable);
			context.registerValue(param);
		}
		if(defaultExpression!=null) try {
			context.setValue(id, defaultExpression.interpret(context));
		} catch(PromptoError error) {
			throw new SyntaxError("Unable to register default value: "+ defaultExpression.toString() + " for argument: " + id);
		}
	}
	
	@Override
	public void check(Context context) {
		resolve(context);
		resolved.checkExists(context);
	}
	
	private void resolve(Context context) {
		if(resolved==null) {
			IType resolved = type.resolve(context, null);
			if(resolved!=null)
				this.resolved = resolved.resolve(context, null).asMutable(context, mutable);
		}
	}

	@Override
	public IType getType(Context context) {
		resolve(context);
		return resolved;
	}
	
	@Override
	public void declare(Transpiler transpiler) {
		resolve(transpiler.getContext());
		resolved.declare(transpiler);
	}
	
	@Override
	public void transpileCall(Transpiler transpiler, IExpression expression) {
		resolve(transpiler.getContext());
		if(!transpileArrowExpressionCall(transpiler, expression))
			transpileValue(transpiler, expression);
	}
	
	private boolean transpileArrowExpressionCall(Transpiler transpiler, IExpression expression) {
		if(resolved instanceof MethodType) {
			if(expression instanceof ContextualExpression)
				expression = ((ContextualExpression)expression).getExpression();
			if(expression instanceof ArrowExpression) {
				((MethodType)resolved).transpileArrowExpression(transpiler, (ArrowExpression)expression);
				return true;
			}
		}
		return false;
	}

	void transpileValue(Transpiler transpiler, IExpression expression) {
		IType expType = expression.check(transpiler.getContext());
	    if (resolved == IntegerType.instance() && expType == DecimalType.instance()) {
	        transpiler.append("Math.round(");
	        expression.transpile(transpiler);
	        transpiler.append(")");
	    } else if(resolved instanceof MethodType)
	    	expression.transpileMethodReference(transpiler, (MethodType)resolved);
	    else
	    	expression.transpile(transpiler);
    }	
}
