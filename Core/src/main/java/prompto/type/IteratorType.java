package prompto.type;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import prompto.compiler.Descriptor;
import prompto.compiler.Flags;
import prompto.compiler.InterfaceConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.declaration.BuiltInMethodDeclaration;
import prompto.declaration.IMethodDeclaration;
import prompto.error.PromptoError;
import prompto.grammar.Identifier;
import prompto.intrinsic.IterableWithCounts;
import prompto.intrinsic.PromptoList;
import prompto.intrinsic.PromptoSet;
import prompto.runtime.Context;
import prompto.store.Family;
import prompto.transpiler.Transpiler;
import prompto.value.IValue;
import prompto.value.IterableValue;
import prompto.value.IteratorValue;
import prompto.value.NullValue;

public class IteratorType extends IterableType {

	public IteratorType(IType itemType) {
		super(Family.ITERATOR, itemType, "Iterator<" + itemType.getTypeName()+">");
	}
	
	@Override
	public IterableType withItemType(IType itemType) {
		return new IteratorType(itemType);
	}

	@Override
	public Type toJavaType(Context context) {
		return Iterator.class;
	}
	
	@Override
	public boolean isAssignableFrom(Context context, IType other) {
		return super.isAssignableFrom(context, other) ||
				(other instanceof IteratorType && 
				itemType.isAssignableFrom(context, ((IteratorType)other).getItemType()));
	}

	@Override
	public boolean equals(Object obj) {
		if(obj==this)
			return true; 
		return (obj instanceof IteratorType
				&& this.getItemType().equals(((IteratorType)obj).getItemType()));
	}
	
	@Override
	public IType checkIterator(Context context) {
		return itemType;
	}

	@Override
	public IType checkMember(Context context, Identifier id) {
		String name = id.toString();
        if ("count".equals(name))
            return IntegerType.instance();
        else
    		return super.checkMember(context, id);
   }

	@Override
	public Set<IMethodDeclaration> getMemberMethods(Context context, Identifier id) throws PromptoError {
		switch(id.toString()) {
		case "toList":
			return new HashSet<>(Collections.singletonList(TO_LIST_METHOD));
		case "toSet":
			return new HashSet<>(Collections.singletonList(TO_SET_METHOD));
		default:
			return super.getMemberMethods(context, id);
		}
	}
	
	@Override
	public void declare(Transpiler transpiler) {
		itemType.declare(transpiler);
	}
	
	@Override
	public void declareMember(Transpiler transpiler, Identifier id) {
		String name = id.toString();
        if (!"count".equals(name))
        	super.declareMember(transpiler, id);
	}

	@Override
	public void transpileMember(Transpiler transpiler, Identifier id) {
		String name = id.toString();
        if ("count".equals(name))
        	transpiler.append("count");
        else
        	super.transpileMember(transpiler, id);
	}
	
	
	final IMethodDeclaration TO_LIST_METHOD = new BuiltInMethodDeclaration("toList") {
		
		@Override
		public IValue interpret(Context context) throws PromptoError {
			IValue value = getValue(context);
			IType type = value.getType();
			if(type instanceof IterableType) 
				value = new IteratorValue(((IterableType)type).getItemType(), ((IterableValue)value).iterator());
			if(value instanceof IteratorValue)
				return ((IteratorValue)value).toListValue();
			else
				return NullValue.instance();
		};
		
		
		
		@Override
		public IType check(Context context) {
			return new ListType(itemType);
		}

		@Override
		public boolean hasCompileExactInstanceMember() {
			return true;
		}
		
		@Override
		public ResultInfo compileExactInstanceMember(Context context, MethodInfo method, Flags flags, prompto.grammar.ArgumentList assignments) {
			// call replace method
			Descriptor.Method descriptor = new Descriptor.Method(PromptoList.class);
			InterfaceConstant constant = new InterfaceConstant(IterableWithCounts.class, "toList", descriptor);
			method.addInstruction(Opcode.INVOKEINTERFACE, constant);
			// done
			return new ResultInfo(PromptoList.class);

		}
		
		@Override
		public void declareCall(Transpiler transpiler) {
			transpiler.require("List");
		};
		
		@Override
		public void transpileCall(Transpiler transpiler, prompto.grammar.ArgumentList assignments) {
			transpiler.append("toList()");
		}
	};
	
	final IMethodDeclaration TO_SET_METHOD = new BuiltInMethodDeclaration("toSet") {
		
		@Override
		public IValue interpret(Context context) throws PromptoError {
			IValue value = getValue(context);
			IType type = value.getType();
			if(type instanceof IterableType) 
				value = new IteratorValue(((IterableType)type).getItemType(), ((IterableValue)value).iterator());
			if(value instanceof IteratorValue)
				return ((IteratorValue)value).toSetValue();
			else
				return NullValue.instance();
		};
		
		
		
		@Override
		public IType check(Context context) {
			return new SetType(itemType);
		}

		@Override
		public boolean hasCompileExactInstanceMember() {
			return true;
		}
		
		@Override
		public ResultInfo compileExactInstanceMember(Context context, MethodInfo method, Flags flags, prompto.grammar.ArgumentList assignments) {
			// call replace method
			Descriptor.Method descriptor = new Descriptor.Method(PromptoSet.class);
			InterfaceConstant constant = new InterfaceConstant(IterableWithCounts.class, "toSet", descriptor);
			method.addInstruction(Opcode.INVOKEINTERFACE, constant);
			// done
			return new ResultInfo(PromptoSet.class);

		}
		
		@Override
		public void declareCall(Transpiler transpiler) {
			transpiler.require("StrictSet");
		};
		
		@Override
		public void transpileCall(Transpiler transpiler, prompto.grammar.ArgumentList assignments) {
			transpiler.append("toSet()");
		}
	};
}
