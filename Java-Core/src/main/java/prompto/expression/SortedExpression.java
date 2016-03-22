package prompto.expression;

import java.util.Comparator;

import prompto.compiler.Flags;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.declaration.CategoryDeclaration;
import prompto.declaration.IDeclaration;
import prompto.declaration.IMethodDeclaration;
import prompto.error.NullReferenceError;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.ArgumentAssignment;
import prompto.grammar.ArgumentAssignmentList;
import prompto.grammar.IArgument;
import prompto.grammar.Identifier;
import prompto.grammar.UnresolvedIdentifier;
import prompto.intrinsic.PromptoList;
import prompto.runtime.Context;
import prompto.runtime.MethodFinder;
import prompto.statement.MethodCall;
import prompto.type.CategoryType;
import prompto.type.ContainerType;
import prompto.type.IType;
import prompto.type.ListType;
import prompto.type.SetType;
import prompto.utils.CodeWriter;
import prompto.value.ExpressionValue;
import prompto.value.IInstance;
import prompto.value.IValue;
import prompto.value.ListValue;
import prompto.value.SetValue;

public class SortedExpression implements IExpression {

	IExpression source;
	IExpression key;
	
	public SortedExpression(IExpression source) {
		this.source = source;
	}

	public SortedExpression(IExpression source, IExpression key) {
		this.source = source;
		this.key = key;
	}

	@Override
	public void toDialect(CodeWriter writer) {
		switch(writer.getDialect()) {
		case E:
			toEDialect(writer);
			break;
		case O:
			toODialect(writer);
			break;
		case S:
			toSDialect(writer);
			break;
		}
	}

	private void toEDialect(CodeWriter writer) {
		writer.append("sorted ");
		source.toDialect(writer);
		if(key!=null) {
			writer.append(" with ");
			IExpression keyExp = key;
			if(keyExp instanceof UnresolvedIdentifier) try {
				keyExp = ((UnresolvedIdentifier)keyExp).resolve(writer.getContext(), false);
			} catch (SyntaxError e) {
				// TODO add warning 
			}
			if(keyExp instanceof InstanceExpression)
				((InstanceExpression)keyExp).toDialect(writer, false);
			else
				keyExp.toDialect(writer);
			writer.append(" as key");
		}
	}	

	private void toODialect(CodeWriter writer) {
		writer.append("sorted (");
		source.toDialect(writer);
		if(key!=null) {
			writer.append(", key = ");
			key.toDialect(writer);
		}
		writer.append(")");
	}
	
	private void toSDialect(CodeWriter writer) {
		toODialect(writer);
	}
	
	
	@Override
	public IType check(Context context) throws SyntaxError {
		IType type = source.check(context);
		if(!(type instanceof ListType || type instanceof SetType))
			throw new SyntaxError("Unsupported type: " + type);
		return type;
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		IType type = source.check(context);
		if(type instanceof ListType)
			return interpretList(context, (ListType)type);
		else if(type instanceof SetType)
			return interpretSet(context, (SetType)type);
		else
			throw new SyntaxError("Unsupported type: " + type);
	}

	
	private IValue interpretSet(Context context, SetType type) throws PromptoError {
		IValue value = source.interpret(context);
		if(value==null)
			throw new NullReferenceError();
		if(!(value instanceof SetValue))
			throw new InternalError("Unexpected type:" + value.getClass().getName());
		IType itemType = type.getItemType();
		Comparator<? extends IValue> cmp = getInterpretedComparator(context, itemType, value);
		PromptoList<? extends IValue> sorted = ((SetValue)value).getItems().sortUsing(cmp);
		return new ListValue(itemType, sorted);
	}

	private IValue interpretList(Context context, ListType type) throws PromptoError {
		IValue value = source.interpret(context);
		if(value==null)
			throw new NullReferenceError();
		if(!(value instanceof ListValue))
			throw new InternalError("Unexpected type:" + value.getClass().getName());
		IType itemType = type.getItemType();
		Comparator<? extends IValue> cmp = getInterpretedComparator(context, itemType, value);
		PromptoList<? extends IValue> sorted = ((ListValue)value).getItems().sortUsing(cmp);
		return new ListValue(itemType, sorted);
	}

	private Comparator<? extends IValue> getInterpretedComparator(Context context, IType itemType, IValue value) throws PromptoError {
		if(itemType instanceof CategoryType)
			return getCategoryComparator(context, (CategoryType)itemType, value);
		else
			return itemType.getComparator();	
	}

	private Comparator<? extends IValue> getCategoryComparator(Context context, CategoryType itemType, IValue value) throws PromptoError {
		if(key==null)
			key = new UnresolvedIdentifier(new Identifier("key"));
		Identifier keyAsId = new Identifier(key.toString());
		IDeclaration d = itemType.getDeclaration(context);
		if(d instanceof CategoryDeclaration) {
			CategoryDeclaration decl = (CategoryDeclaration)d;
			if(decl.hasAttribute(context, keyAsId))
				return getCategoryAttributeComparator(context, keyAsId);
			else if(decl.hasMethod(context, keyAsId, null))
				return getCategoryMethodComparator(context, keyAsId);
			else {
				MethodCall call = createGlobalMethodCall(context, itemType, keyAsId);
				if(call!=null)
					return getCategoryGlobalMethodComparator(context, itemType, call);
				else
					return getCategoryExpressionComparator(context);
			}
		} else
			throw new UnsupportedOperationException(); // TODO
	}

	private Comparator<? extends IValue> getCategoryExpressionComparator(Context context) {
		return new Comparator<IInstance>() {
			@Override
			public int compare(IInstance o1, IInstance o2) {
				try {
					IValue key1 = interpret(o1);
					IValue key2 = interpret(o2);
					return IValue.compareValues(key1, key2);
				} catch(Throwable t) {
					throw new RuntimeException(t);
				}
			}

			private IValue interpret(IInstance o) throws PromptoError {
				Context co = context.newInstanceContext(o);
				return key.interpret(co);
			}
		};
	}

	private Comparator<? extends IValue> getCategoryMethodComparator(Context context, Identifier identifier) {
		throw new UnsupportedOperationException(); // TODO
	}

	private MethodCall createGlobalMethodCall(Context context, CategoryType itemType, Identifier methodName) {
		try {
			IExpression exp = new ExpressionValue(itemType, itemType.newInstance(context));
			ArgumentAssignment arg = new ArgumentAssignment(null, exp); // MethodCall supports first anonymous argument
			ArgumentAssignmentList args = new ArgumentAssignmentList(arg);
			MethodCall call = new MethodCall(new MethodSelector(methodName), args);
			MethodFinder finder = new MethodFinder(context, call);
			IMethodDeclaration decl = finder.findMethod(true);
			if(decl==null)
				return null;
			else
				return call;
		} catch (PromptoError e) {
			return null;
		}
	}

	private Comparator<? extends IValue> getCategoryGlobalMethodComparator(Context context, CategoryType itemType, MethodCall call) throws PromptoError {
		return new Comparator<IInstance>() {
			@Override
			public int compare(IInstance o1, IInstance o2) {
				try {
					IValue key1 = interpret(o1);
					IValue key2 = interpret(o2);
					return IValue.compareValues(key1,key2);
				} catch(Throwable t) {
					throw new RuntimeException(t);
				}
			}

			private IValue interpret(IInstance o) throws PromptoError {
				ArgumentAssignment assignment = call.getAssignments().getFirst();
				assignment.setExpression(new ExpressionValue(itemType, o));
				return call.interpret(context);
			}
		};
	}

	private Comparator<? extends IValue> getCategoryAttributeComparator(Context context, Identifier name) {
		return new Comparator<IInstance>() {
			@Override
			public int compare(IInstance o1, IInstance o2) {
				try {
					IValue key1 = o1.getMember(context, name, false);
					IValue key2 = o2.getMember(context, name, false);
					return IValue.compareValues(key1, key2);
				} catch(Throwable t) {
					throw new RuntimeException(t);
				}
			}
		};
	}


	
	/*
	public IValue sort(final Context context, IContainer<IValue> list, IExpression key) throws PromptoError {
		if(list.getLength()==0)
			return list;

	
	
	private ListValue sortByExpression(final Context context, IContainer<IValue> list, final IExpression key) throws PromptoError {
		try {
			return this.<ConcreteInstance>doSort(context,list,new Comparator<ConcreteInstance>() {
				@Override
				public int compare(ConcreteInstance o1, ConcreteInstance o2) {
					try {
						Context co = context.newInstanceContext(o1);
						IValue key1 = key.interpret(co);
						co = context.newInstanceContext(o2);
						IValue key2 = key.interpret(co);
						return compareKeys(key1,key2);
					} catch(Throwable t) {
						throw new RuntimeException(t);
					}
				}

			});
		} catch(RuntimeException e) {
			if(e.getCause() instanceof PromptoError)
				throw (PromptoError)e.getCause();
			else
				throw e;
		}
	}

	
	private ListValue sortByClassMethod(Context context, IContainer<IValue> list, final String name) {
		return null;
	}
	

	private ListValue sortByGlobalMethod(Context context, IContainer<IValue> list, final Identifier name) throws PromptoError {
		IExpression exp = new ExpressionValue(this, newInstance(context));
		ArgumentAssignment arg = new ArgumentAssignment(null, exp);
		ArgumentAssignmentList args = new ArgumentAssignmentList(arg);
		MethodCall proto = new MethodCall(new MethodSelector(name), args);
		MethodFinder finder = new MethodFinder(context, proto);
		IMethodDeclaration method = finder.findMethod(true);
		return sortByGlobalMethod(context, list, proto, method);
	}
	
	private ListValue sortByGlobalMethod(final Context context, IContainer<IValue> list, final MethodCall method, final IMethodDeclaration declaration) throws PromptoError {
		try {
			return this.<IInstance>doSort(context,list,new Comparator<IInstance>() {
				@Override
				public int compare(IInstance o1, IInstance o2) {
					try {
						ArgumentAssignment assignment = method.getAssignments().get(0);
						assignment.setExpression(new ExpressionValue(CategoryType.this, o1));
						IValue key1 = method.interpret(context);
						assignment.setExpression(new ExpressionValue(CategoryType.this, o2));
						IValue key2 = method.interpret(context);
						return compareKeys(key1,key2);
					} catch(Throwable t) {
						throw new RuntimeException(t);
					}
				}

			});
		} catch(RuntimeException e) {
			if(e.getCause() instanceof PromptoError)
				throw (PromptoError)e.getCause();
			else
				throw e;
		}
	}

	*/
	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) throws SyntaxError {
		IType type = source.check(context);
		IType itemType = ((ContainerType)type).getItemType();
		if(itemType instanceof CategoryType) 
			return compileSortCategory(context, method, flags);
		else
			return compileSortNative(context, method, flags);
	}

	private ResultInfo compileSortNative(Context context, MethodInfo method, Flags flags) throws SyntaxError {
		ResultInfo info = source.compile(context, method, flags);
		MethodConstant m = new MethodConstant(info.getType(), "sort", PromptoList.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, m);
		return new ResultInfo(PromptoList.class);
	}

	private ResultInfo compileSortCategory(Context context, MethodInfo method, Flags flags) {
		throw new UnsupportedOperationException();
	}

}
