package prompto.expression;

import java.util.Collection;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import prompto.compiler.ClassConstant;
import prompto.compiler.CompilerUtils;
import prompto.compiler.Descriptor;
import prompto.compiler.Flags;
import prompto.compiler.IInstructionListener;
import prompto.compiler.IVerifierEntry.VerifierType;
import prompto.compiler.InterfaceConstant;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.NamedType;
import prompto.compiler.OffsetListenerConstant;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.compiler.StackLocal;
import prompto.compiler.StackState;
import prompto.compiler.StringConstant;
import prompto.declaration.AttributeDeclaration;
import prompto.declaration.TestMethodDeclaration;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.ContOp;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoString;
import prompto.parser.CodeSection;
import prompto.parser.Dialect;
import prompto.runtime.Context;
import prompto.runtime.Variable;
import prompto.store.AttributeInfo;
import prompto.store.Family;
import prompto.store.FamilyInfo;
import prompto.store.IQueryBuilder;
import prompto.store.IQueryBuilder.MatchOp;
import prompto.store.IStore;
import prompto.transpiler.Transpiler;
import prompto.type.BooleanType;
import prompto.type.ContainerType;
import prompto.type.IType;
import prompto.type.IterableType;
import prompto.type.VoidType;
import prompto.utils.CodeWriter;
import prompto.utils.StoreUtils;
import prompto.value.BooleanValue;
import prompto.value.IContainer;
import prompto.value.IInstance;
import prompto.value.IIterable;
import prompto.value.IValue;
import prompto.value.NullValue;

public class ContainsExpression extends CodeSection implements IPredicateExpression, IAssertion {

	IExpression left;
	ContOp operator;
	IExpression right;
		
	public ContainsExpression(IExpression left, ContOp operator, IExpression right) {
		this.left = left;
		this.operator = operator;
		this.right = right;
	}
	
	@Override
	public String toString() {
		return left.toString() + " " + operator.toString() + " " + right.toString();
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		left.toDialect(writer);
		writer.append(" ");
		writer.append(operator.toString());
		writer.append(" ");
		if(right instanceof PredicateExpression)
			((PredicateExpression)right).containsToDialect(writer);
		else
			right.toDialect(writer);
	}
	
	@Override
	public IType check(Context context) {
		if(right instanceof PredicateExpression)
			return checkPredicate(context);
		else
			return checkValue(context);
	}
	
	private IType checkPredicate(Context context) {
		IType lt = left.check(context);
		if(lt instanceof IterableType) {
			IType itemType = ((IterableType)lt).getItemType();
			ArrowExpression arrow = ((PredicateExpression)right).toArrowExpression();
			return arrow.checkFilter(context, itemType);
		} else {
			context.getProblemListener().reportExpectingCollection(this, lt);
			return VoidType.instance();
		}
	}

	IType checkValue(Context context) {
		IType lt = left.check(context);
		IType rt = right.check(context);
		checkOperator(context, lt, rt);
		return BooleanType.instance();
	}
	
	private void checkOperator(Context context, IType lt, IType rt) {
		switch(operator) {
		case IN:
		case NOT_IN:
			rt.checkContains(context,lt);
			break;
		case HAS:
		case NOT_HAS:
			lt.checkContains(context, rt);
			break;
		default:
			lt.checkContainsAllOrAny(context, rt);
		}
	}
	
	@Override
    public IValue interpret(Context context) throws PromptoError {
		if(right instanceof PredicateExpression)
			return interpretPredicate(context);
		else
			return interpretValue(context);
	}
	
	@SuppressWarnings("unchecked")
	IValue interpretPredicate(Context context) throws PromptoError {
		IValue lval = left.interpret(context);
	    if(lval instanceof IContainer) {
			IType itemType = ((ContainerType)lval.getType()).getItemType();
			ArrowExpression arrow = ((PredicateExpression)right).toArrowExpression();
			Predicate<IValue> predicate = arrow.getFilter(context, itemType);
			return interpretPredicate(context, (IContainer<IValue>)lval, predicate);
		} else {
			context.getProblemListener().reportExpectingCollection(this, lval.getType());
			return NullValue.instance();
		}
	}
	
	
	private IValue interpretPredicate(Context context, IContainer<IValue> lval, Predicate<IValue> predicate) {
        java.lang.Boolean result = null;
        switch (operator)
        {
            case HAS_ALL:
            case NOT_HAS_ALL:
                result = allMatch(context, lval, predicate);
                break;
            case HAS_ANY:
            case NOT_HAS_ANY:
                result = anyMatch(context, lval, predicate);
                break;
            default:
            	// will throw
        }
        if (result != null)
        {
            if (operator.name().startsWith("NOT_"))
                result = !result;
            return BooleanValue.valueOf(result);
        }
        String lowerName = operator.name().toLowerCase().replace('_', ' ');
        throw new SyntaxError("Illegal filter: " + lval.getClass().getSimpleName() + " " + lowerName);	
 	}

	public boolean allMatch(Context context, IContainer<?> container, Predicate<IValue> predicate) throws PromptoError
    {
		return StreamSupport.stream(container.getIterable(context).spliterator(), false)
				.allMatch(predicate);
    }

	public boolean anyMatch(Context context, IContainer<?> container, Predicate<IValue> predicate) throws PromptoError
    {
		return StreamSupport.stream(container.getIterable(context).spliterator(), false)
				.anyMatch(predicate);
    }

	IValue interpretValue(Context context) throws PromptoError {
		IValue lval = left.interpret(context);
    	IValue rval = right.interpret(context);
    	return interpretValue(context, lval, rval);
    }
    
	private IValue interpretValue(Context context, IValue lval, IValue rval) throws PromptoError {
        java.lang.Boolean result = null;
        switch (operator)
        {
            case IN:
            case NOT_IN:
                if(rval instanceof IContainer)
                    result = ((IContainer<?>)rval).hasItem(context, lval);
                else if(rval instanceof IIterable)
                	result = containsOne(context, (IIterable<?>)rval, lval);
                break;
            case HAS:
            case NOT_HAS:
                if(lval instanceof IContainer)
                    result = ((IContainer<?>)lval).hasItem(context, rval);
                else if(lval instanceof IIterable)
                	result = containsOne(context, (IIterable<?>)lval, rval);
                break;
            case HAS_ALL:
            case NOT_HAS_ALL:
                if (lval instanceof IContainer && rval instanceof IContainer)
                    result = containsAll(context, (IContainer<?>)lval, (IContainer<?>)rval);
                break;
            case HAS_ANY:
            case NOT_HAS_ANY:
                if (lval instanceof IContainer && rval instanceof IContainer)
                    result = containsAny(context, (IContainer<?>)lval, (IContainer<?>)rval);
                break;
        }
        if (result != null)
        {
            if (operator.name().startsWith("NOT_"))
                result = !result;
            return BooleanValue.valueOf(result);
        }
        if (operator.name().endsWith("IN"))
        {
            IValue tmp = lval;
            lval = rval;
            rval = tmp;
        }
        String lowerName = operator.name().toLowerCase().replace('_', ' ');
        throw new SyntaxError("Illegal comparison: " + lval.getClass().getSimpleName() +
        		" " + lowerName + " " + rval.getClass().getSimpleName());	
    }

	private java.lang.Boolean containsOne(Context context, IIterable<?> container, IValue item) {
		return StreamSupport.stream(container.getIterable(context).spliterator(), false)
				.anyMatch(o -> o.equals(item));
	}

	public boolean containsAll(Context context, IContainer<?> container, IContainer<?> items) throws PromptoError
    {
		return StreamSupport.stream(items.getIterable(context).spliterator(), false)
				.allMatch(item -> container.hasItem(context, item));
    }

	public boolean containsAny(Context context, IContainer<?> container, IContainer<?> items) throws PromptoError
    {
		return StreamSupport.stream(items.getIterable(context).spliterator(), false)
				.anyMatch(item -> container.hasItem(context, item));
    }

    @Override
    public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
    	ResultInfo result = compileOperator(context, method, flags.withPrimitive(true));
    	if (operator.name().startsWith("NOT_"))
    		return compileNot(context, method, flags, result);
    	else if((!flags.toPrimitive() && boolean.class==result.getType()))
    		return CompilerUtils.booleanToBoolean(method);
    	else
    		return result;
    }
    
    private ResultInfo compileNot(Context context, MethodInfo method, Flags flags, ResultInfo info) {
		if(BooleanValue.class==info.getType())
			CompilerUtils.BooleanToboolean(method);
		CompilerUtils.reverseBoolean(method);
		if(flags.toPrimitive())
			return new ResultInfo(boolean.class);
		else
			return CompilerUtils.booleanToBoolean(method);
	}

	private ResultInfo compileOperator(Context context, MethodInfo method, Flags flags) {
    	switch (operator) {
            case IN:
            case NOT_IN:
            	return compileContains(context, method, flags, right, left);
            case HAS:
            case NOT_HAS:
            	return compileContains(context, method, flags, left, right);
            case HAS_ALL:
            case NOT_HAS_ALL:
            	return compileContainsAll(context, method, flags, left, right);
            case HAS_ANY:
            case NOT_HAS_ANY:
            	return compileContainsAny(context, method, flags, left, right);
            default:
        		throw new UnsupportedOperationException("Uknown operator: " + operator.name());
        }
    }

	private ResultInfo compileContains(Context context, MethodInfo method, Flags flags, IExpression left, IExpression right) {
		ResultInfo linfo = left.compile(context, method, flags);
		right.compile(context, method, flags.withPrimitive(false));
		if(String.class==linfo.getType()) {
			MethodConstant m = new MethodConstant(PromptoString.class, "contains", String.class, Object.class, boolean.class);
			method.addInstruction(Opcode.INVOKESTATIC, m);
			if(flags.toPrimitive())
				return new ResultInfo(boolean.class);
			else
				return CompilerUtils.booleanToBoolean(method);
		} else {
			MethodConstant m = new MethodConstant(linfo.getType(), "contains", Object.class, boolean.class);
			method.addInstruction(Opcode.INVOKEVIRTUAL, m);
			if(flags.toPrimitive())
				return new ResultInfo(boolean.class);
			else
				return CompilerUtils.booleanToBoolean(method);
		}
	}

	private ResultInfo compileContainsAll(Context context, MethodInfo method, Flags flags, IExpression left, IExpression right) {
		ResultInfo linfo = left.compile(context, method, flags);
		if(String.class==linfo.getType())
			return compileStringContainsX(context, method, flags, right, "containsAll");
		else if(right instanceof PredicateExpression)
			return compilePredicateMatchX(context, method, flags, linfo, right, "allMatch");
		else 
			return compileCollectionContainsX(context, method, flags, linfo, right, "containsAll");
	}

	private ResultInfo compileContainsAny(Context context, MethodInfo method, Flags flags, IExpression left, IExpression right) {
		ResultInfo linfo = left.compile(context, method, flags);
		if(String.class==linfo.getType())
			return compileStringContainsX(context, method, flags, right, "containsAny");
		else if(right instanceof PredicateExpression)
			return compilePredicateMatchX(context, method, flags, linfo, right, "anyMatch");
		else 
			return compileCollectionContainsX(context, method, flags, linfo, right, "containsAny");
	}

	private ResultInfo compileStringContainsX(Context context, MethodInfo method, Flags flags, IExpression right, String methodName) {
		right.compile(context, method, flags.withPrimitive(false));
		MethodConstant m = new MethodConstant(PromptoString.class, methodName, String.class, Object.class, boolean.class);
		method.addInstruction(Opcode.INVOKESTATIC, m);
		if(flags.toPrimitive())
			return new ResultInfo(boolean.class);
		else
			return CompilerUtils.booleanToBoolean(method);
	}
	
	
	private ResultInfo compilePredicateMatchX(Context context, MethodInfo method, Flags flags, ResultInfo left, IExpression right, String methodName) {
		// get stream
		MethodConstant m = new MethodConstant(left.getType(), "stream", Stream.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, m);
		// create inner class for filter
		String innerClassName = CompilerUtils.compileInnerFilterClass(context, method.getClassFile(), this.left, (PredicateExpression)right);
		// instantiate filter
		ClassConstant innerClass = new ClassConstant(new NamedType(innerClassName));
		method.addInstruction(Opcode.NEW, innerClass);
		method.addInstruction(Opcode.DUP);
		// call filter constructor
		Descriptor.Method proto = new Descriptor.Method(void.class);
		m = new MethodConstant(innerClass, "<init>", proto);
		method.addInstruction(Opcode.INVOKESPECIAL, m);
		// invoke filter on stream
		Descriptor.Method desc = new Descriptor.Method(Predicate.class, boolean.class);
		InterfaceConstant intf = new InterfaceConstant(new ClassConstant(Stream.class), methodName,  desc);
		method.addInstruction(Opcode.INVOKEINTERFACE, intf);
		return new ResultInfo(boolean.class);
	}

	private ResultInfo compileCollectionContainsX(Context context, MethodInfo method, Flags flags, ResultInfo left, IExpression right, String methodName) {
		right.compile(context, method, flags.withPrimitive(false));
		MethodConstant m = new MethodConstant(left.getType(), methodName, Collection.class, boolean.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, m);
		if(flags.toPrimitive())
			return new ResultInfo(boolean.class);
		else
			return CompilerUtils.booleanToBoolean(method);
	}
	

    
	@Override
	public boolean interpretAssert(Context context, TestMethodDeclaration test) throws PromptoError {
		IValue lval = left.interpret(context);
		IValue rval = right.interpret(context);
		IValue result = interpretValue(context, lval, rval);
		if(result==BooleanValue.TRUE) 
			return true;
		String expected = buildExpectedMessage(context, test);
		String actual = lval.toString() + " " + operator.toString() + " " + rval.toString();
		test.printFailedAssertion(context, expected, actual);
		return false;
	}
	
	private String buildExpectedMessage(Context context, TestMethodDeclaration test) {
		CodeWriter writer = new CodeWriter(test.getDialect(), context);
		this.toDialect(writer);
		return writer.toString();
	}

	@Override
	public void compileAssert(Context context, MethodInfo method, Flags flags, TestMethodDeclaration test) {
		context = context.newChildContext();
		StackState finalState = method.captureStackState();
		// compile left and store in local
		IType leftType = this.left.check(context);
		ResultInfo leftInfo = this.left.compile(context, method, flags.withPrimitive(false));
		String leftName = method.nextTransientName("left");
		StackLocal left = method.registerLocal(leftName, VerifierType.ITEM_Object, new ClassConstant(leftInfo.getType()));
		CompilerUtils.compileASTORE(method, left);
		// compile right and store in local
		IType rightType = this.right.check(context);
		ResultInfo rightInfo = this.right.compile(context, method, flags.withPrimitive(true));
		String rightName = method.nextTransientName("right");
		StackLocal right = method.registerLocal(rightName, VerifierType.ITEM_Object, new ClassConstant(rightInfo.getType()));
		CompilerUtils.compileASTORE(method, right);
		// call regular compile
		IExpression newLeft = new InstanceExpression(new Identifier(leftName));
		context.registerValue(new Variable(new Identifier(leftName), leftType));
		IExpression newRight = new InstanceExpression(new Identifier(rightName));
		context.registerValue(new Variable(new Identifier(rightName), rightType));
		ContainsExpression newExp = new ContainsExpression(newLeft, this.operator, newRight);
		ResultInfo info = newExp.compile(context, method, flags.withPrimitive(true));
		if(BooleanValue.class==info.getType())
			CompilerUtils.BooleanToboolean(method);
		// 1 = success
		IInstructionListener finalListener = method.addOffsetListener(new OffsetListenerConstant());
		method.activateOffsetListener(finalListener);
		method.addInstruction(Opcode.IFNE, finalListener); 
		// increment failure counter
		method.addInstruction(Opcode.ICONST_1);
		method.addInstruction(Opcode.IADD);
		// build failure message
		String message = buildExpectedMessage(context, test);
		message = test.buildFailedAssertionMessagePrefix(message);
		method.addInstruction(Opcode.LDC, new StringConstant(message));
		CompilerUtils.compileALOAD(method, left);
		MethodConstant toString = new MethodConstant(leftInfo.getType(), "toString", String.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, toString);
		MethodConstant concat = new MethodConstant(String.class, "concat", String.class, String.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, concat);
		method.addInstruction(Opcode.LDC, new StringConstant(" " + operator.toString() + " "));
		method.addInstruction(Opcode.INVOKEVIRTUAL, concat);
		CompilerUtils.compileALOAD(method, right);
		toString = new MethodConstant(rightInfo.getType(), "toString", String.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, toString);
		method.addInstruction(Opcode.INVOKEVIRTUAL, concat);
		test.compileFailure(context, method, flags);
		// success/final
		method.unregisterLocal(right);
		method.unregisterLocal(left);
		method.restoreFullStackState(finalState);
		method.placeLabel(finalState);
		method.inhibitOffsetListener(finalListener);
	}
	
	@Override
	public void checkQuery(Context context) throws PromptoError {
		AttributeDeclaration decl = left.checkAttribute(context, this);
		if(decl==null)
			return;
		if(!decl.isStorable(context)) {
			context.getProblemListener().reportNotStorable(this, decl.getName());	
			return;
		}
		IType rt = right.check(context);
		checkOperator(context, decl.getType(), rt);
	}
	
	@Override
	public void interpretQuery(Context context, IQueryBuilder query, IStore store) throws PromptoError {
		AttributeInfo info = left.checkAttributeInfo(context, this, store);
		if(info==null)
			throw new SyntaxError("Unable to interpret predicate: " + this.toString());
		IValue value = right.interpret(context);
		AttributeInfo fieldInfo = StoreUtils.getAttributeInfo(context, info.getName(), store);
		FamilyInfo valueInfo = value.getType().getFamilyInfo(context);
		MatchOp matchOp = getMatchOp(context, fieldInfo, valueInfo, this.operator, false);
		if(value instanceof IInstance)
			value = ((IInstance)value).getMember(context, new Identifier(IStore.dbIdName), false);
		Object data = value==null ? null : value.getStorableData();
		query.<Object>verify(fieldInfo, matchOp, data);
		if(operator.name().startsWith("NOT_"))
			query.not();
	}
	
	@Override
	public void compileQuery(Context context, MethodInfo method, Flags flags) {
		AttributeDeclaration decl = left.checkAttribute(context, this);
		if(decl==null || !decl.isStorable(context))
			throw new SyntaxError("Unable to compile predicate");
		IType valueType = right.check(context);
		AttributeInfo fieldInfo = decl.getAttributeInfo(context);
		CompilerUtils.compileAttributeInfo(context, method, flags, fieldInfo);
		FamilyInfo valueInfo = valueType.getFamilyInfo(context);
		MatchOp match = getMatchOp(context, fieldInfo, valueInfo, this.operator, false);
		CompilerUtils.compileJavaEnum(context, method, flags, match);
		right.compile(context, method, flags);
		InterfaceConstant m = new InterfaceConstant(IQueryBuilder.class,
				"verify", AttributeInfo.class, MatchOp.class, Object.class, IQueryBuilder.class);
		method.addInstruction(Opcode.INVOKEINTERFACE, m);
		if(operator.name().startsWith("NOT_")) {
			m = new InterfaceConstant(IQueryBuilder.class, "not", IQueryBuilder.class);
			method.addInstruction(Opcode.INVOKEINTERFACE, m);
		}
	}
	
	
	private MatchOp getMatchOp(Context context, FamilyInfo fieldInfo, FamilyInfo valueInfo, ContOp operator, boolean reverse) {
		if(reverse) {
			operator = operator.reverse();
			if(operator==null)
				context.getProblemListener().reportIllegalOperator(this, "Cannot reverse " + this.operator);
			return getMatchOp(context, valueInfo, fieldInfo, operator, false);
		}
		if(fieldInfo.getFamily()==Family.TEXT && (valueInfo.getFamily()==Family.TEXT || valueInfo.getFamily()==Family.CHARACTER)) {
			switch(operator) {
			case HAS:
			case NOT_HAS:
				return MatchOp.CONTAINS;
			default:
				// throw below
			}
		} 
		if(valueInfo.isCollection()) {
			switch(operator) {
			case IN:
			case NOT_IN:
				return MatchOp.IN;
			default:
				// throw below
			}
		} 
		if(fieldInfo.isCollection()) {
			switch(operator) {
			case HAS:
			case NOT_HAS:
				return MatchOp.CONTAINS;
			default:
				// throw below
			}
		} 
		throw new SyntaxError("Unsupported operator: " + operator.name());
	}

	@Override
	public void declare(Transpiler transpiler) {
		if(right instanceof PredicateExpression)
			declarePredicate(transpiler);
		else
			declareValue(transpiler);
	}
	
	private void declarePredicate(Transpiler transpiler) {
	    left.declare(transpiler);
	    IType manyType = left.check(transpiler.getContext());
	    IType itemType = ((IterableType)manyType).getItemType() ;
	    ArrowExpression arrow = ((PredicateExpression)right).toArrowExpression();
	    arrow.declareFilter(transpiler, itemType);
	}

	void declareValue(Transpiler transpiler) {
	    IType lt = left.check(transpiler.getContext());
	    IType rt = right.check(transpiler.getContext());
	    switch(this.operator) {
	        case IN:
	        case NOT_IN:
	            rt.declareHasValue(transpiler, lt, right, left);
	            break;
	        case HAS:
	        case NOT_HAS:
	            lt.declareHasValue(transpiler, rt, left, right);
	            break;
	        default:
	            lt.declareHasAllOrAny(transpiler, rt, left, right);
	    }
	}
	
	@Override
	public boolean transpile(Transpiler transpiler) {
		if(right instanceof PredicateExpression)
			return transpilePredicate(transpiler);
		else
			return transpileValue(transpiler);
	}
	
	private boolean transpilePredicate(Transpiler transpiler) {
		IType lt = this.left.check(transpiler.getContext());
	    switch(this.operator) {
	        case NOT_HAS_ALL:
	            transpiler.append("!");
	        case HAS_ALL:
	            lt.transpileHasAllPredicate(transpiler, left, (PredicateExpression)right);
	            return false;
	        case NOT_HAS_ANY:
	            transpiler.append("!");
	        case HAS_ANY:
	            lt.transpileHasAnyPredicate(transpiler, left, (PredicateExpression)right);
	            return false;
	        default:
	            throw new UnsupportedOperationException("Unsupported " + this.operator);
	    }
	}

	boolean transpileValue(Transpiler transpiler) {
		IType lt = this.left.check(transpiler.getContext());
		IType rt = this.right.check(transpiler.getContext());
	    switch(this.operator) {
	        case NOT_IN:
	            transpiler.append("!");
	        case IN:
	            rt.transpileHasValue(transpiler, lt, right, left);
	            return false;
	        case NOT_HAS:
	        	transpiler.append("!");
	        case HAS:
	            lt.transpileHasValue(transpiler, rt, left, right);
	            return false;
	        case NOT_HAS_ALL:
	            transpiler.append("!");
	        case HAS_ALL:
	            lt.transpileHasAllValues(transpiler, rt, left, right);
	            return false;
	        case NOT_HAS_ANY:
	            transpiler.append("!");
	        case HAS_ANY:
	            lt.transpileHasAnyValue(transpiler, rt, this.left, this.right);
	            return false;
	        default:
	            throw new UnsupportedOperationException("Unsupported " + this.operator);
	    }
	}
	
	@Override
	public void transpileQuery(Transpiler transpiler, String builderName) {
		AttributeDeclaration decl = left.checkAttribute(transpiler.getContext(), this);
		if(decl==null || !decl.isStorable(transpiler.getContext()))
			throw new SyntaxError("Unable to compile predicate");
	    AttributeInfo fieldInfo = decl.getAttributeInfo(transpiler.getContext());
	    IType valueType = right.check(transpiler.getContext());
	    FamilyInfo valueInfo = valueType.getFamilyInfo(transpiler.getContext());
	    // TODO check for dbId field of instance value
	    MatchOp matchOp = this.getMatchOp(transpiler.getContext(), fieldInfo, valueInfo, this.operator, false);
	    transpiler.append(builderName).append(".verify(").append(fieldInfo.toTranspiled()).append(", MatchOp.").append(matchOp.name()).append(", ");
	    right.transpile(transpiler);
	    transpiler.append(");").newLine();
	    if (this.operator.name().indexOf("NOT_")==0)
	        transpiler.append(builderName).append(".not();").newLine();
	}
	
	@Override
	public void transpileFound(Transpiler transpiler, Dialect dialect) {
	    transpiler.append("(");
	    left.transpile(transpiler);
	    transpiler.append(") + '").append(this.operator.toString()).append("' + (");
	    right.transpile(transpiler);
	    transpiler.append(")");
	}
}
