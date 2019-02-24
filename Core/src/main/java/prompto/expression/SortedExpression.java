package prompto.expression;

import java.util.Comparator;


import prompto.compiler.Flags;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.error.NullReferenceError;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.intrinsic.PromptoList;
import prompto.runtime.Context;
import prompto.runtime.Variable;
import prompto.transpiler.Transpiler;
import prompto.type.CategoryType;
import prompto.type.ContainerType;
import prompto.type.DocumentType;
import prompto.type.IType;
import prompto.type.ListType;
import prompto.type.SetType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;
import prompto.value.ListValue;
import prompto.value.SetValue;

public class SortedExpression implements IExpression {

	IExpression source;
	IExpression key;
	boolean descending;
	
	public SortedExpression(IExpression source, boolean descending) {
		this.source = source;
		this.descending = descending;
	}

	public SortedExpression(IExpression source, boolean descending, IExpression key) {
		this.source = source;
		this.descending = descending;
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
		case M:
			toMDialect(writer);
			break;
		}
	}

	private void toEDialect(CodeWriter writer) {
		writer.append("sorted ");
		if(descending)
			writer.append("descending ");
		source.toDialect(writer);
		if(key!=null) {
			IType type = source.check(writer.getContext());
			IType itemType = ((ContainerType)type).getItemType();
			CodeWriter local = contextualizeWriter(writer, itemType);
			local.append(" with ");
			IExpression keyExp = key;
			if(keyExp instanceof UnresolvedIdentifier) try {
				keyExp = ((UnresolvedIdentifier)keyExp).resolve(writer.getContext(), false, false);
			} catch (SyntaxError e) {
				// TODO add warning 
			}
			if(keyExp instanceof ArrowExpression) {
				((ArrowExpression)keyExp).getArgs().forEach(arg->{
					Variable param = new Variable(arg, itemType);
					local.getContext().registerValue(param);
				});
				keyExp.toDialect(local);
			} else if(keyExp instanceof InstanceExpression)
				((InstanceExpression)keyExp).toDialect(local, false);
			else
				keyExp.toDialect(local);
			local.append(" as key");
		}
	}	

	private CodeWriter contextualizeWriter(CodeWriter writer, IType itemType) {
		if (itemType instanceof CategoryType)
			return writer.newInstanceWriter((CategoryType)itemType);
		else if (itemType instanceof DocumentType)
			return writer.newDocumentWriter();
		else
			return writer;
	}

	private void toODialect(CodeWriter writer) {
		writer.append("sorted ");
		if(descending)
			writer.append("desc ");
		writer.append("(");
		source.toDialect(writer);
		if(key!=null) {
			IType type = source.check(writer.getContext());
			IType itemType = ((ContainerType)type).getItemType();
			writer = contextualizeWriter(writer, itemType);
			writer.append(", key = ");
			key.toDialect(writer);
		}
		writer.append(")");
	}
	
	private void toMDialect(CodeWriter writer) {
		toODialect(writer);
	}
	
	
	@Override
	public IType check(Context context) {
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
		Comparator<? extends IValue> cmp = itemType.getComparator(context, key, descending);
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
		Comparator<? extends IValue> cmp = itemType.getComparator(context, key, descending);
		PromptoList<? extends IValue> sorted = ((ListValue)value).getItems().sortUsing(cmp);
		return new ListValue(itemType, sorted);
	}

	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		IType type = source.check(context);
		ResultInfo info = source.compile(context, method, flags);
		IType itemType = ((ContainerType)type).getItemType();
		if(itemType instanceof CategoryType) 
			return ((CategoryType)itemType).compileSorted(context, method, flags, info, key, descending);
		else if(itemType instanceof DocumentType) 
			return ((DocumentType)itemType).compileSorted(context, method, flags, info, key, descending);
		else
			return compileSortNative(context, method, flags, info);
	}


	private ResultInfo compileSortNative(Context context, MethodInfo method, Flags flags, ResultInfo info) {
		method.addInstruction(descending ? Opcode.ICONST_1 : Opcode.ICONST_0);
		MethodConstant m = new MethodConstant(info.getType(), "sort", boolean.class, PromptoList.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, m);
		return new ResultInfo(PromptoList.class);
	}

	
	@Override
	public void declare(Transpiler transpiler) {
	    transpiler.require("List");
	    this.source.declare(transpiler);
	    IType type = this.source.check(transpiler.getContext());
	    IType itemType = ((ContainerType)type).getItemType();
	    itemType.declareSorted(transpiler, this.key);
	}
	
	
	@Override
	public boolean transpile(Transpiler transpiler) {
	    IType type = this.source.check(transpiler.getContext());
	    this.source.transpile(transpiler);
	    transpiler.append(".sorted(");
	    IType itemType = ((ContainerType)type).getItemType();
	    itemType.transpileSorted(transpiler, this.key, this.descending);
	    transpiler.append(")");
		return false;
	}

}
