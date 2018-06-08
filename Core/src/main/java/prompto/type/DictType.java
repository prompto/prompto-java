package prompto.type;

import java.lang.reflect.Type;

import prompto.expression.IExpression;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoDict;
import prompto.runtime.Context;
import prompto.store.Family;
import prompto.transpiler.Transpiler;

public class DictType extends ContainerType {
	
	public DictType(IType itemType) {
		super(Family.DICTIONARY, itemType, itemType.getTypeName()+"{}");
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
	public boolean transpileAdd(Transpiler transpiler, IType other, boolean tryReverse, IExpression left, IExpression right) {
	   if(other instanceof DictType && this.getItemType().equals(((DictType)other).getItemType())) {
	        left.transpile(transpiler);
	        transpiler.append(".add(");
	        right.transpile(transpiler);
	        transpiler.append(")");
	        return false;
	    } else {
	        return super.transpileAdd(transpiler, other, tryReverse, left, right);
	    }
	}
	
	@Override
	public void declareMember(Transpiler transpiler, String name) {
	    if("keys".equals(name)) {
	        transpiler.require("StrictSet");
	    } else if("values".equals(name)) {
	        transpiler.require("List");
	    } else if (!"count".equals(name)) {
			super.declareMember(transpiler, name);
	    }
	}
	
	@Override
	public void transpileMember(Transpiler transpiler, String name) {
	    if ("count".equals(name)) {
	        transpiler.append("length");
	    } else if("keys".equals(name) || "values".equals(name)) {
	        transpiler.append(name);
	    } else {
			super.transpileMember(transpiler, name);
	    }
	}
}
