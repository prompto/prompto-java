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
import prompto.intrinsic.PromptoTuple;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.type.TupleType;
import prompto.utils.CodeWriter;
import prompto.utils.ExpressionList;
import prompto.value.IValue;
import prompto.value.TupleValue;

public class TupleLiteral extends Literal<TupleValue> {

	ExpressionList expressions = null;
	
	public TupleLiteral() {
		super("()",new TupleValue());
	}
	
	public TupleLiteral(ExpressionList expressions) {
		super("(" + expressions.toString() + ")",new TupleValue());
		this.expressions = expressions;
	}
	
	@Override
	public IType check(Context context) throws SyntaxError {
		return TupleType.instance(); 
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		if(value.isEmpty() && expressions!=null) {
			List<IValue> list = new PromptoTuple<IValue>();
			for(IExpression exp : expressions) 
				list.add(exp.interpret(context));
			value = new TupleValue(list);
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
			writer.append('(');
			expressions.toDialect(writer);
			writer.append(')');
		} else
			writer.append("()");
	}

	@Override
	public ResultInfo compile(Context context, MethodInfo method, boolean toNative) throws SyntaxError {
		ResultInfo info = CompilerUtils.newInstance(method, PromptoTuple.class);
		if(expressions!=null)
			addItems(context, method);
		return info;
	}

	private void addItems(Context context, MethodInfo method) throws SyntaxError {
		for(IExpression e : expressions) {
			method.addInstruction(Opcode.DUP); // need to keep a reference to the list on top of stack
			e.compile(context, method, false);
			Operand c = new MethodConstant(PromptoTuple.class, "add", 
					Object.class, boolean.class);
			method.addInstruction(Opcode.INVOKEVIRTUAL, c);
			method.addInstruction(Opcode.POP); // consume the returned boolean
		}
	}
}
