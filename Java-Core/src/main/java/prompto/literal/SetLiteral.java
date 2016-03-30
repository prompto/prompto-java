package prompto.literal;

import java.util.ArrayList;
import java.util.List;

import prompto.compiler.CompilerUtils;
import prompto.compiler.Flags;
import prompto.compiler.IOperand;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.intrinsic.PromptoSet;
import prompto.runtime.Context;
import prompto.type.DecimalType;
import prompto.type.IType;
import prompto.type.MissingType;
import prompto.type.SetType;
import prompto.type.TextType;
import prompto.utils.CodeWriter;
import prompto.utils.ExpressionList;
import prompto.utils.Utils;
import prompto.value.Character;
import prompto.value.Decimal;
import prompto.value.IValue;
import prompto.value.Integer;
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
	public IType check(Context context) {
		if(itemType==null) {
			if(value.isEmpty() && expressions!=null && !expressions.isEmpty())
				itemType = Utils.inferElementType(context, expressions);
			else
				itemType = Utils.inferElementType(context, value.getItems());
		}
		return new SetType(itemType); 
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		if(value.isEmpty() && expressions!=null && !expressions.isEmpty()) {
			check(context); // force computation of itemType
			List<IValue> list = new ArrayList<>();
			for(IExpression exp : expressions)
				list.add(exp.interpret(context));
			if(itemType==null)
				itemType = Utils.inferElementType(context, list); 
			PromptoSet<IValue> set = new PromptoSet<IValue>();
			for(IValue item : list) {
				if(DecimalType.instance()==itemType && item instanceof Integer)
					item = new Decimal(((Integer)item).doubleValue());
				else if(TextType.instance()==itemType && item instanceof Character)
					item = ((Character)item).asText();
				set.add(item);
			}
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
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		ResultInfo info = CompilerUtils.compileNewInstance(method, PromptoSet.class);
		if(expressions!=null)
			addItems(context, method, flags);
		return info;
	}

	private void addItems(Context context, MethodInfo method, Flags flags) {
		for(IExpression e : expressions) {
			method.addInstruction(Opcode.DUP); // need to keep a reference to the list on top of stack
			ResultInfo info = e.compile(context, method, flags.withPrimitive(false));
			compilePromotion(method, info);
			IOperand oper = new MethodConstant(PromptoSet.class, "add", 
					Object.class, boolean.class);
			method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
			method.addInstruction(Opcode.POP); // consume the returned boolean
		}
	}

	private ResultInfo compilePromotion(MethodInfo method, ResultInfo info) {
		if(DecimalType.instance()==itemType && Long.class==info.getType())
			return CompilerUtils.LongToDouble(method);
		else if(TextType.instance()==itemType) {
			if(char.class==info.getType())
				return CompilerUtils.charToString(method);
			else if(java.lang.Character.class==info.getType())
				return CompilerUtils.CharacterToString(method);
		}
		return info;
	}
}
