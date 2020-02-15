package prompto.type;

import java.lang.reflect.Type;
import java.util.Map;

import prompto.compiler.CompilerUtils;
import prompto.compiler.Flags;
import prompto.compiler.IOperand;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.expression.IExpression;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoDict;
import prompto.runtime.Context;
import prompto.store.Family;
import prompto.transpiler.Transpiler;

public class DictType extends ContainerType {
	
	public DictType(IType itemType) {
		super(Family.DICTIONARY, itemType, itemType.getTypeName()+"<:>");
	}
	
	@Override
	public IterableType withItemType(IType itemType) {
		return new DictType(itemType);
	}
	
	@Override
	public boolean isAssignableFrom(Context context, IType other) {
		return super.isAssignableFrom(context, other) ||
				(other instanceof DictType && 
				itemType.isAssignableFrom(context, ((DictType)other).getItemType()));
	}

	@Override
	public Type getJavaType(Context context) {
		return PromptoDict.class;
	}
	
	@Override
	public String getTranspiledName(Context context) {
		return this.itemType.getTranspiledName(context) + "_dict";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==this)
			return true; 
		if(obj==null)
			return false;
		if(!(obj instanceof DictType))
			return false;
		DictType other = (DictType)obj;
		return this.getItemType().equals(other.getItemType());
	}
	
	@Override
	public IType checkAdd(Context context, IType other, boolean tryReverse) {
		if(other instanceof DictType 
			&& this.getItemType().equals(((DictType)other).getItemType()))
			return this;
		else
			return super.checkAdd(context, other, tryReverse);
	}
	
	@Override
	public IType checkContains(Context context, IType other) {
		if(other==TextType.instance())
			return BooleanType.instance();
		else
			return super.checkContains(context, other);
	}
	
	@Override
	public IType checkItem(Context context, IType other) {
		if(other==TextType.instance())
			return itemType;
		else
			return super.checkItem(context,other);
	}
	
	@Override
	public IType checkIterator(Context context) {
		return new EntryType(itemType);
	}
	
	@Override
	public IType checkMember(Context context, Identifier id) {
		String name = id.toString();
        if ("count".equals(name))
            return IntegerType.instance();
        else if("keys".equals(name))
            return new SetType(TextType.instance());
        else if ("values".equals(name))
            return new ListType(getItemType());
        else
        	return super.checkMember(context, id);
	}
	
	@Override
	public IType checkContainsAllOrAny(Context context, IType other) {
		return BooleanType.instance();
	}
	
	@Override
	public void declare(Transpiler transpiler) {
		transpiler.require("Dictionary");
	}
	
	@Override
	public void declareAdd(Transpiler transpiler, IType other, boolean tryReverse, IExpression left, IExpression right) {
	   if(other instanceof DictType && this.getItemType().equals(((DictType)other).getItemType())) {
	        left.declare(transpiler);
	        right.declare(transpiler);
	    } else {
	        super.declareAdd(transpiler, other, tryReverse, left, right);
	    }
	}

	@Override
	public void transpileAdd(Transpiler transpiler, IType other, boolean tryReverse, IExpression left, IExpression right) {
	   if(other instanceof DictType && this.getItemType().equals(((DictType)other).getItemType())) {
	        left.transpile(transpiler);
	        transpiler.append(".add(");
	        right.transpile(transpiler);
	        transpiler.append(")");
	    } else {
	        super.transpileAdd(transpiler, other, tryReverse, left, right);
	    }
	}
	
	@Override
	public void declareMember(Transpiler transpiler, Identifier name) {
		switch(name.toString()) {
		case "count":
			break;
		case "keys":
	        transpiler.require("StrictSet");
	        break;
		case "values":
	        transpiler.require("List");
	        break;
       default: 
	    	super.declareMember(transpiler, name);
	    }
	}
	
	@Override
	public void transpileMember(Transpiler transpiler, Identifier name) {
		switch(name.toString()) {
		case "count":
	        transpiler.append("length");
			break;
		case "keys":
		case "values":
			transpiler.append(name);
			break;
		default: 
			super.transpileMember(transpiler, name);
	    }
	}
	
	@Override
	public void declareContains(Transpiler transpiler, IType other, IExpression container, IExpression item) {
		transpiler.require("StrictSet");
	    container.declare(transpiler);
	    item.declare(transpiler);
	}
	
	@Override
	public void transpileContains(Transpiler transpiler, IType other, IExpression container, IExpression item) {
	    container.transpile(transpiler);
	    transpiler.append(".has(");
	    item.transpile(transpiler);
	    transpiler.append(")");
	}
	
	@Override
	public void declareContainsAllOrAny(Transpiler transpiler, IType other, IExpression container, IExpression items) {
	    transpiler.require("StrictSet");
	    container.declare(transpiler);
	    items.declare(transpiler);
	}
	
	@Override
	public void transpileContainsAll(Transpiler transpiler, IType other, IExpression container, IExpression items) {
	    container.transpile(transpiler);
	    transpiler.append(".hasAll(");
	    items.transpile(transpiler);
	    transpiler.append(")");
	}
	
	@Override
	public void transpileContainsAny(Transpiler transpiler, IType other, IExpression container, IExpression items) {
	    container.transpile(transpiler);
	    transpiler.append(".hasAny(");
	    items.transpile(transpiler);
	    transpiler.append(")");
	}
	
	@Override
	public void declareItem(Transpiler transpiler, IType itemType, IExpression item) {
		// nothing to do
	}
	
	@Override
	public void transpileItem(Transpiler transpiler, IType itemType, IExpression item) {
	    transpiler.append(".item(");
	    item.transpile(transpiler);
	    transpiler.append(")");
	}
	
	@Override
	public void transpileAssignItemValue(Transpiler transpiler, IExpression item, IExpression expression) {
	    transpiler.append(".setItem(");
	    item.transpile(transpiler);
	    transpiler.append(", ");
	    expression.transpile(transpiler);
	    transpiler.append(")");
	}

	public static ResultInfo compilePlus(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		// TODO: return right if left is empty (or left if right is empty)
		// create result (temporarily mutable)
		ResultInfo info = CompilerUtils.compileNewRawInstance(method, PromptoDict.class);
		method.addInstruction(Opcode.DUP);
		method.addInstruction(Opcode.ICONST_1);
		CompilerUtils.compileCallConstructor(method, PromptoDict.class, boolean.class);
		// add left, current stack is: left, result, we need: result, result, left
		method.addInstruction(Opcode.DUP_X1); // stack is: result, left, result
		method.addInstruction(Opcode.SWAP); // stack is: result, result, left
		IOperand oper = new MethodConstant(PromptoDict.class, "putAll", 
				Map.class, void.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		// add right, current stack is: result, we need: result, result, right
		method.addInstruction(Opcode.DUP); // stack is: result, result 
		exp.compile(context, method, flags); // stack is: result, result, right
		oper = new MethodConstant(PromptoDict.class, "putAll", 
				Map.class, void.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		// set immutable
		method.addInstruction(Opcode.DUP);
		method.addInstruction(Opcode.ICONST_0);
		MethodConstant m = new MethodConstant(PromptoDict.class, "setMutable", boolean.class, void.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, m);
		return info;
	}

	public static ResultInfo compileItem(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		exp.compile(context, method, flags.withPrimitive(true));
		IOperand oper = new MethodConstant(PromptoDict.class, "get", 
				Object.class, Object.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		return new ResultInfo(Object.class);
	}

	public static ResultInfo compileEquals(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		exp.compile(context, method, flags);
		IOperand oper = new MethodConstant(
				PromptoDict.class, 
				"equals",
				Object.class, boolean.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		if(flags.isReverse())
			CompilerUtils.reverseBoolean(method);
		if(flags.toPrimitive())
			return new ResultInfo(boolean.class);
		else
			return CompilerUtils.booleanToBoolean(method);
	}
	
}
