package prompto.expression;

import java.lang.reflect.Type;

import prompto.compiler.ClassConstant;
import prompto.compiler.CompilerUtils;
import prompto.compiler.Flags;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.declaration.IDeclaration;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.runtime.Context;
import prompto.runtime.Context.MethodDeclarationMap;
import prompto.transpiler.Transpiler;
import prompto.type.AnyType;
import prompto.type.CategoryType;
import prompto.type.DecimalType;
import prompto.type.IType;
import prompto.type.IntegerType;
import prompto.type.MethodType;
import prompto.utils.CodeWriter;
import prompto.value.Decimal;
import prompto.value.IValue;
import prompto.value.Integer;

public class CastExpression implements IExpression {
	
	public static IType anyfy(IType type) {
		if(type instanceof CategoryType && "Any".equals(((CategoryType)type).getTypeName()))
			return AnyType.instance();	
		else
			return type;
	}

	IExpression expression;
	IType type;
	
	public CastExpression(IExpression expression, IType type) {
		this.expression = expression;
		this.type = anyfy(type);
	}
	
	@Override
	public String toString() {
		return expression.toString() + " as " + type.toString();
	}
	
	@Override
	public IType check(Context context) {
		IType actual = anyfy(expression.check(context));
		IType target = getTargetType(context);
		// check Any
		if(actual==AnyType.instance())
			return target;
		// check upcast
		if(target.isAssignableFrom(context, actual))
			return target;
		// check downcast
		if(actual.isAssignableFrom(context, target))
			return target;
		throw new SyntaxError("Cannot cast " + actual.toString() + " to " + target.toString());
	}

	private IType getTargetType(Context context) {
		IDeclaration decl = context.getRegisteredDeclaration(IDeclaration.class, type.getTypeNameId());
		if(decl==null) {
			context.getProblemListener().reportUnknownIdentifier(type.getTypeName(), type);
			return null;
		} else if(decl instanceof MethodDeclarationMap) {
			MethodDeclarationMap map = (MethodDeclarationMap)decl;
			if(map.size()==1)
				return new MethodType(map.getFirst());
			else {
				context.getProblemListener().reportAmbiguousIdentifier(type.getTypeName(), type);
				return null;
			}
		} else
			return decl.getType(context);
	}

	@Override
	public IValue interpret(Context context) throws PromptoError {
		IValue value = expression.interpret(context);
		if(value!=null) {
			IType target = getTargetType(context);
			if(target==DecimalType.instance() && value instanceof Integer)
				value = new Decimal(((Integer)value).doubleValue());
			else if(target==IntegerType.instance() && value instanceof Decimal)
				value = new Integer(((Decimal)value).longValue());
			else if(target.isMoreSpecificThan(context, value.getType()))
				value.setType(target);
		}
		return value;
	}
	
	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		ResultInfo src = expression.compile(context, method, flags);
		IType target = getTargetType(context);
		Type dest = target.getJavaType(context);
		if(dest==Long.class)
			return CompilerUtils.numberToLong(method, src);
		else if(dest==Double.class)
			return CompilerUtils.numberToDouble(method, src);
		else {
			ClassConstant c = new ClassConstant(dest);
			method.addInstruction(Opcode.CHECKCAST, c);
			return new ResultInfo(dest);
		}
	}

	@Override
	public void toDialect(CodeWriter writer) {
		switch(writer.getDialect()) {
		case E:
		case M:
			expression.toDialect(writer);
			writer.append(" as ");
			type.toDialect(writer);
			break;
		case O:
			writer.append("(");
			type.toDialect(writer);
			writer.append(")");
			expression.toDialect(writer);
			break;
		}
		
	}
	
	@Override
	public void declare(Transpiler transpiler) {
		expression.declare(transpiler);
		IType target = getTargetType(transpiler.getContext());
		target.declare(transpiler);
	}
	
	
	@Override
	public boolean transpile(Transpiler transpiler) {
	    IType expType = this.expression.check(transpiler.getContext());
		IType target = getTargetType(transpiler.getContext());
	    if(expType==DecimalType.instance() && target==IntegerType.instance()) {
	        transpiler.append("Math.floor(");
	        this.expression.transpile(transpiler);
	        transpiler.append(")");
	    } else
	        this.expression.transpile(transpiler);
	    return false;
	}

}
