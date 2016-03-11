package prompto.expression;

import prompto.compiler.CompilerUtils;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.IOperand;
import prompto.compiler.ResultInfo;
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

	Identifier id;
	
	public MemberSelector(Identifier id) {
		this.id = id;
	}
	
	public MemberSelector(IExpression parent, Identifier id) {
		super(parent);
		this.id = id;
	}

	public Identifier getId() {
		return id;
	}
	
	public String getName() {
		return id.getName();
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
		writer.append(id);
	}
	
	@Override
	public String toString() {
		return parent.toString() + "." + id;
	}
	
	@Override
	public IType check(Context context) throws SyntaxError {
		IType parentType = checkParent(context);
        return parentType.checkMember(context, id);
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
        	return instance.getMember(context, id, true);
	}

	private IValue interpretTypeMember(Context context, IExpression parent) throws PromptoError {
       if(parent instanceof TypeExpression)
    	   return ((TypeExpression)parent).getMember(context, id);
       else
    	   return null;
	}

	private IValue interpretSingleton(Context context, IExpression parent) throws PromptoError {
        if(parent instanceof TypeExpression && ((TypeExpression)parent).getType() instanceof CategoryType) {
        	ConcreteInstance instance = context.loadSingleton(context, (CategoryType)((TypeExpression)parent).getType());
        	if(instance!=null)
        		return instance.getMember(context, id, false); 
        }
        return null;
	}

	private IValue interpretSymbol(Context context, IExpression parent) throws PromptoError {
       if (parent instanceof SymbolExpression)
        {
            if ("name".equals(id.toString()))
                return new Text(((SymbolExpression)parent).getName().toString());
            else if("value".equals(id.toString()))
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
	
	@Override
	public ResultInfo compile(Context context, MethodInfo method, boolean toNative) throws SyntaxError {
		ResultInfo info = compileParent(context, method);
        // special case for Symbol which evaluates as value
		ResultInfo result = compileSymbol(context, method, info, toNative);
		if(result!=null)
			return result;
		else
			// special case for singletons 
			result = compileSingleton(context, method, info, toNative);
		if(result!=null)
			return result;
		else
			// special case for 'static' type members (like Enum.symbols, Type.name etc...)
			result = compileTypeMember(context, method, info, toNative);
		if(result!=null)
			return result;
		else
			// finally resolve instance member
			return compileInstanceMember(context, method,info, toNative);		
	}

	private ResultInfo compileSymbol(Context context, MethodInfo method, ResultInfo parent, boolean toNative) {
		System.err.println("TODO: MemberSelector.compileSymbol");
		return null;
	}

	private ResultInfo compileSingleton(Context context, MethodInfo method, ResultInfo parent, boolean toNative) {
		System.err.println("TODO: MemberSelector.compileSingleton");
		return null;
	}

	private ResultInfo compileTypeMember(Context context, MethodInfo method, ResultInfo parent, boolean toNative) {
		System.err.println("TODO: MemberSelector.compileTypeMember");
		return null;
	}

	private ResultInfo compileInstanceMember(Context context, MethodInfo method, ResultInfo parent, boolean toNative) throws SyntaxError {
		Class<?> resultType = check(context).toJavaClass();
		// special case for String.length() to avoid wrapping String.class for just one member
		if(String.class==parent.getType() && "length".equals(getName()))
			return compileStringLength(method, toNative);
		else {
			String getterName = "get" + getName().substring(0,1).toUpperCase() + getName().substring(1);
			IOperand oper = new MethodConstant(parent.getType(), getterName, resultType);
			method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
			return new ResultInfo(resultType, true);
		}
	}

	private ResultInfo compileStringLength(MethodInfo method, boolean toNative) {
		IOperand oper = new MethodConstant(String.class, "length", int.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		if(toNative)
			return CompilerUtils.intTolong(method);
		else
			return CompilerUtils.intToLong(method);
	}

	private ResultInfo compileParent(Context context, MethodInfo method) throws SyntaxError {
		IExpression parent = resolveParent(context);
		return parent.compile(context, method, false);
	}


}
