package prompto.expression;

import prompto.error.NullReferenceError;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.Identifier;
import prompto.grammar.UnresolvedIdentifier;
import prompto.runtime.Context;
import prompto.type.CategoryType;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.ConcreteInstance;
import prompto.value.IValue;
import prompto.value.NullValue;
import prompto.value.Text;

public class MemberSelector extends SelectorExpression {

	Identifier name;
	
	public MemberSelector(Identifier name) {
		this.name = name;
	}
	
	public MemberSelector(IExpression parent, Identifier name) {
		super(parent);
		this.name = name;
	}

	public Identifier getName() {
		return name;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		try {
			resolveParent(writer.getContext());
		} catch(SyntaxError e) {
			// ignore
		}
		parent.toDialect(writer);
		writer.append(".");
		writer.append(name);
	}
	
	@Override
	public String toString() {
		return parent.toString() + "." + name;
	}
	
	@Override
	public IType check(Context context) throws SyntaxError {
		IType parentType = checkParent(context);
        return parentType.checkMember(context, name);
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
        // resolve parent to keep clarity
		IExpression parent = resolveParent(context);
        // special case for Symbol which evaluates as value
		IValue value = interpretSymbol(context, parent);
		if(value!=null)
			return value;
        // special case for singletons 
		value = interpretSingleton(context, parent);
		if(value!=null)
			return value;
		// special case for 'static' type members (like Enum.symbols, Type.name etc...)
		value = interpretTypeMember(context, parent);
		if(value!=null)
			return value;
        // finally resolve instance member
		return interpretInstanceMember(context, parent);
 	}

	private IValue interpretInstanceMember(Context context, IExpression parent) throws PromptoError {
       IValue instance = parent.interpret(context);
        if (instance == null || instance == NullValue.instance())
            throw new NullReferenceError();
        else
        	return instance.getMember(context, name, true);
	}

	private IValue interpretTypeMember(Context context, IExpression parent) throws PromptoError {
       if(parent instanceof TypeExpression)
    	   return ((TypeExpression)parent).getMember(context, name);
       else
    	   return null;
	}

	private IValue interpretSingleton(Context context, IExpression parent) throws PromptoError {
        if(parent instanceof TypeExpression && ((TypeExpression)parent).getType() instanceof CategoryType) {
        	ConcreteInstance instance = context.loadSingleton(context, (CategoryType)((TypeExpression)parent).getType());
        	if(instance!=null)
        		return instance.getMember(context, name, false); 
        }
        return null;
	}

	private IValue interpretSymbol(Context context, IExpression parent) throws PromptoError {
       if (parent instanceof SymbolExpression)
        {
            if ("name".equals(name.toString()))
                return new Text(((SymbolExpression)parent).getName().toString());
            else if("value".equals(name.toString()))
                return parent.interpret(context);
        }
 		return null;
	}

	private IExpression resolveParent(Context context) throws SyntaxError {
        if(parent instanceof UnresolvedIdentifier) {
        	((UnresolvedIdentifier) parent).checkMember(context);
        	return ((UnresolvedIdentifier) parent).getResolved();
        } else
        	return parent;
	}


}
