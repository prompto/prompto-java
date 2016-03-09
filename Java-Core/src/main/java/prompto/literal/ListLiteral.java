package prompto.literal;

import java.util.List;

import prompto.compiler.CompilerUtils;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.Operand;
import prompto.compiler.ResultInfo;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.intrinsic.PromptoList;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.type.ListType;
import prompto.type.MissingType;
import prompto.utils.CodeWriter;
import prompto.utils.ExpressionList;
import prompto.utils.Utils;
import prompto.value.IValue;
import prompto.value.ListValue;

public class ListLiteral extends Literal<ListValue> {

	IType itemType = null;
	ExpressionList expressions = null;
	
	public ListLiteral() {
		super("[]",new ListValue(MissingType.instance()));
	}
	
	public ListLiteral(ExpressionList expressions) {
		super("[" + expressions.toString() + "]",new ListValue(MissingType.instance()));
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
		return new ListType(itemType); 
	}

	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		if(value.isEmpty() && expressions!=null) {
			check(context); // force computation of itemType
			List<IValue> list = new PromptoList<IValue>();
			for(IExpression exp : expressions)
				list.add(exp.interpret(context));
			value = new ListValue(itemType, list);
			// don't dispose of expressions, they are required by translation 
		}
		return value;
	}

	public ExpressionList getExpressions() {
		return expressions;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		if(expressions!=null) {
			writer.append('[');
			expressions.toDialect(writer);
			writer.append(']');
		} else
			writer.append("[]");
	}
	
	@Override
	public ResultInfo compile(Context context, MethodInfo method, boolean toNative) throws SyntaxError {
		ResultInfo info = CompilerUtils.newInstance(method, PromptoList.class);
		if(expressions!=null)
			addItems(context, method);
		return info;
	}

	private void addItems(Context context, MethodInfo method) throws SyntaxError {
		for(IExpression e : expressions) {
			method.addInstruction(Opcode.DUP); // need to keep a reference to the list on top of stack
			e.compile(context, method, false);
			Operand c = new MethodConstant(PromptoList.class, "add", 
					Object.class, boolean.class);
			method.addInstruction(Opcode.INVOKEVIRTUAL, c);
			method.addInstruction(Opcode.POP); // consume the returned boolean
		}
	}
}
