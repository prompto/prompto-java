package prompto.expression;

import prompto.error.NullReferenceError;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.type.IntegerType;
import prompto.utils.CodeWriter;
import prompto.value.ISliceable;
import prompto.value.IValue;
import prompto.value.Integer;

public class SliceSelector extends SelectorExpression {

	IExpression first;
	IExpression last;
	
	public SliceSelector(IExpression first, IExpression last) {
		this.first = first;
		this.last = last;
	}
	
	public SliceSelector(IExpression parent, IExpression first, IExpression last) {
		super(parent);
		this.first = first;
		this.last = last;
	}

	public IExpression getFirst() {
		return first;
	}
	
	public IExpression getLast() {
		return last;
	}

	@Override
	public void toDialect(CodeWriter writer) {
		parent.toDialect(writer);
		writer.append('[');
		if(first!=null)
			first.toDialect(writer);
		writer.append(':');
		if(last!=null)
			last.toDialect(writer);
		writer.append(']');
	}
	
	@Override
	public IType check(Context context) throws SyntaxError {
		IType firstType = first!=null ? first.check(context) : null;
		IType lastType = last!=null ? last.check(context) : null;
		if(firstType!=null && !(firstType instanceof IntegerType))
			throw new SyntaxError(firstType.toString() + " is not an integer");
		if(lastType!=null && !(lastType instanceof IntegerType))
			throw new SyntaxError(lastType.toString() + " is not an integer");
		IType parentType = parent.check(context);
		return parentType.checkSlice(context);
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
        IValue o = parent.interpret(context);
        if (o == null)
            throw new NullReferenceError();
        ISliceable<IValue> sliceable = o.asSliceable(context);
        if (sliceable!=null)
        {
            Object fi = first != null ? first.interpret(context) : null;
            if (fi != null && !(fi instanceof Integer))
                throw new SyntaxError("Illegal sliced type: " + fi);
            Object li = last != null ? last.interpret(context) : null;
            if (li != null && !(li instanceof Integer))
                throw new SyntaxError("Illegal sliced type: " + li);
            return sliceable.slice((Integer)fi, (Integer)li);
        }
        else
			throw new SyntaxError("Illegal sliced object: " + parent);
	}

}
