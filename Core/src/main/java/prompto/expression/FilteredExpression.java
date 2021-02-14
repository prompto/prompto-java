package prompto.expression;

import java.lang.reflect.Type;
import java.util.function.Predicate;

import prompto.compiler.ClassConstant;
import prompto.compiler.CompilerUtils;
import prompto.compiler.Descriptor;
import prompto.compiler.Flags;
import prompto.compiler.InterfaceConstant;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.NamedType;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.error.NullReferenceError;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.intrinsic.Filterable;
import prompto.intrinsic.IterableWithCounts;
import prompto.parser.CodeSection;
import prompto.runtime.Context;
import prompto.transpiler.Transpiler;
import prompto.type.BooleanType;
import prompto.type.IType;
import prompto.type.IterableType;
import prompto.type.ListType;
import prompto.type.VoidType;
import prompto.utils.CodeWriter;
import prompto.value.IFilterable;
import prompto.value.IValue;

public class FilteredExpression extends CodeSection implements IExpression {

	IExpression source;
	PredicateExpression predicate;
	
	public FilteredExpression(IExpression source, PredicateExpression predicate) {
		this.source = source;
		this.predicate = predicate;
	}
	
	public void setSource(IExpression source) {
		this.source = source;
	}
	
	@Override
	public String toString() {
		return source.toString() + 
				" filtered with " + 
				predicate.toString();
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		predicate.filteredToDialect(writer, source);
	}
	
	@Override
	public IType check(Context context) {
		IType sourceType = source.check(context);
		if(!(sourceType instanceof IterableType)) {
			context.getProblemListener().reportExpectingCollection(this, sourceType);
			return VoidType.instance();
		} else {
			IType itemType = ((IterableType)sourceType).getItemType();
			ArrowExpression arrow = predicate.toArrowExpression();
			IType filterType = arrow.checkFilter(context, itemType);
			if(filterType!=BooleanType.instance())
				throw new SyntaxError("Filtering expression must return a boolean!");
			return new ListType(itemType);
		}
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		// prepare context for expression evaluation
		IType sourceType = source.check(context);
		if(!(sourceType instanceof IterableType))
			throw new InternalError("Illegal source type: " + sourceType.getTypeName());
		IType itemType = ((IterableType)sourceType).getItemType();
		// fetch and check source
		IValue src = source.interpret(context);
		if(src==null)
			throw new NullReferenceError();
		if(!(src instanceof IFilterable))
			throw new InternalError("Illegal fetch source: " + source);
		Filterable<IValue,IValue> filterable = ((IFilterable)src).getFilterable(context);
		ArrowExpression arrow = predicate.toArrowExpression();
		Predicate<IValue> filter = arrow.getFilter(context, itemType);
		try {
			return filterable.filter(filter);
		} catch (InternalError e) {
			if(e.getCause() instanceof PromptoError)
				throw (PromptoError)e.getCause();
			else
				throw e;
		}
	}
	
	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		// create inner class for filter
		String innerClassName = CompilerUtils.compileInnerFilterClass(context, method.getClassFile(), source, predicate);
		// get iterable
		ResultInfo srcInfo = source.compile(context, method, flags);
		// instantiate filter
		ClassConstant innerClass = new ClassConstant(new NamedType(innerClassName));
		method.addInstruction(Opcode.NEW, innerClass);
		method.addInstruction(Opcode.DUP);
		// call filter constructor
		Descriptor.Method proto = new Descriptor.Method(void.class);
		MethodConstant m = new MethodConstant(innerClass, "<init>", proto);
		method.addInstruction(Opcode.INVOKESPECIAL, m);
		// adjust return type
		Type resultType = srcInfo.getType();
		if(resultType==IterableWithCounts.class)
			resultType = Iterable.class;
		// invoke filter on source
		Descriptor.Method desc = new Descriptor.Method(Predicate.class, resultType);
		if(srcInfo.isInterface()) {
			InterfaceConstant i = new InterfaceConstant(new ClassConstant(srcInfo.getType()), "filter",  desc);
			method.addInstruction(Opcode.INVOKEINTERFACE, i);
		} else {
			m = new MethodConstant(new ClassConstant(srcInfo.getType()), "filter",  desc);
			method.addInstruction(Opcode.INVOKEVIRTUAL, m);
		}
		return new ResultInfo(srcInfo.getType());
	}


	@Override
	public void declare(Transpiler transpiler) {
	    this.source.declare(transpiler);
	    IType sourceType = this.source.check(transpiler.getContext());
	    if(sourceType instanceof IterableType) {
		    IType itemType = ((IterableType)sourceType).getItemType() ;
		    ArrowExpression arrow = predicate.toArrowExpression();
		    arrow.declareFilter(transpiler, itemType);
	    } else
	    	transpiler.getContext().getProblemListener().reportExpectingCollection(this, sourceType);
	}
	
	@Override
	public boolean transpile(Transpiler transpiler) {
	    IType sourceType = this.source.check(transpiler.getContext());
	    if(sourceType instanceof IterableType) {
		    IType itemType = ((IterableType)sourceType).getItemType() ;
			this.source.transpile(transpiler);
		    transpiler.append(".filtered((");
		    ArrowExpression arrow = predicate.toArrowExpression();
		    arrow.transpileFilter(transpiler, itemType);
		    transpiler.append(")");
		    if(transpiler.getContext().getClosestInstanceContext()!=null)
		    	transpiler.append(".bind(this)");
		    transpiler.append(")");
		    transpiler.flush();
	    } else
	    	transpiler.getContext().getProblemListener().reportExpectingCollection(this, sourceType);
		return false;
	}

}
