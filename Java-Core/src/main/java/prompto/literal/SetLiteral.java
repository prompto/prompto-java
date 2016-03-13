package prompto.literal;

import java.util.Set;

import prompto.compiler.CompilerUtils;
import prompto.compiler.Flags;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.IOperand;
import prompto.compiler.ResultInfo;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.intrinsic.PromptoSet;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.type.MissingType;
import prompto.type.SetType;
import prompto.utils.CodeWriter;
import prompto.utils.ExpressionList;
import prompto.utils.Utils;
import prompto.value.IValue;
import prompto.value.SetValue;

public class SetLiteral extends Literal<SetValue> {

	IType itemType = null;
	ExpressionList expressions;
	
	public SetLiteral() {
		super("<>", new SetValue(MissingType.instance()));
	}

	public SetLiteral(ExpressionList expressions) {
		super("<" + expressions.toString() + ">", new SetValue(MissingType.instance()));
		this.expressions = expressions;
	}

	@Override
	public IType check(Context context) throws SyntaxError {
		if(itemType==null) {
			if(expressions!=null)
				itemType = Utils.inferElementType(context, expressions);
			else
				itemType = Utils.inferElementType(context, value.getItems());
		}
		return new SetType(itemType); 
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		if(value.isEmpty() && expressions!=null) {
			check(context); // force computation of itemType
			Set<IValue> set = new PromptoSet<IValue>();
			for(IExpression exp : expressions)
				set.add(exp.interpret(context));
			if(itemType==null)
				itemType = Utils.inferElementType(context, set); 
			value = new SetValue(itemType, set);
			// don't dispose of expressions, they are required by translation 
		}
		return value;
	}


	@Override
	public void toDialect(CodeWriter writer) {
		if(expressions!=null) {
			writer.append('<');
			expressions.toDialect(writer);
			writer.append('>');
		} else
			writer.append("< >");
	}

	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) throws SyntaxError {
		ResultInfo info = CompilerUtils.newInstance(method, PromptoSet.class);
		if(expressions!=null)
			addItems(context, method, flags);
		return info;
	}

	private void addItems(Context context, MethodInfo method, Flags flags) throws SyntaxError {
		for(IExpression e : expressions) {
			method.addInstruction(Opcode.DUP); // need to keep a reference to the list on top of stack
			e.compile(context, method, flags.withNative(false));
			IOperand oper = new MethodConstant(PromptoSet.class, "add", 
					Object.class, boolean.class);
			method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
			method.addInstruction(Opcode.POP); // consume the returned boolean
		}
	}
}
