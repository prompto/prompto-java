package prompto.statement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

import prompto.compiler.CompilerUtils;
import prompto.compiler.Flags;
import prompto.compiler.IInstructionListener;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.OffsetListenerConstant;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.compiler.StackState;
import prompto.compiler.StringConstant;
import prompto.declaration.ArrowDeclaration;
import prompto.declaration.BuiltInMethodDeclaration;
import prompto.declaration.ClosureDeclaration;
import prompto.declaration.ConcreteMethodDeclaration;
import prompto.declaration.DispatchMethodDeclaration;
import prompto.declaration.IDeclaration;
import prompto.declaration.IMethodDeclaration;
import prompto.declaration.NativeMethodDeclaration;
import prompto.declaration.TestMethodDeclaration;
import prompto.error.NotMutableError;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.IAssertion;
import prompto.expression.IExpression;
import prompto.expression.MethodSelector;
import prompto.expression.ThisExpression;
import prompto.grammar.Argument;
import prompto.grammar.ArgumentList;
import prompto.grammar.Identifier;
import prompto.grammar.Specificity;
import prompto.javascript.JavaScriptNativeCall;
import prompto.param.CodeParameter;
import prompto.param.IParameter;
import prompto.parser.Dialect;
import prompto.problem.IProblemListener;
import prompto.problem.ProblemCollector;
import prompto.runtime.Context;
import prompto.runtime.Context.MethodDeclarationMap;
import prompto.runtime.MethodFinder;
import prompto.transpiler.Transpiler;
import prompto.type.CodeType;
import prompto.type.IType;
import prompto.type.MethodType;
import prompto.type.PropertiesType;
import prompto.type.VoidType;
import prompto.utils.CodeWriter;
import prompto.value.ArrowValue;
import prompto.value.BooleanValue;
import prompto.value.ClosureValue;
import prompto.value.IValue;

public class MethodCall extends SimpleStatement implements IAssertion {

	MethodSelector selector;
	MethodSelector fullSelector;
	ArgumentList arguments;
	String variableName;
	DispatchMethodDeclaration dispatcher;
	
	public MethodCall(MethodSelector selector) {
		this.selector = selector;
	}

	public MethodCall(MethodSelector selector, ArgumentList arguments) {
		this.selector = selector;
		this.arguments = arguments;
	}
	
	public void setVariableName(String variableName) {
		this.variableName = variableName;
	}

	public MethodSelector getSelector() {
		return selector;
	}

	public ArgumentList getArguments() {
		return arguments;
	}
	
	public String getName() {
		return selector.getName();
	}

	@Override
	public void toDialect(CodeWriter writer) {
		if (requiresInvoke(writer))
			writer.append("invoke: ");
		selector.toDialect(writer, false);
		if (arguments != null)
			arguments.toDialect(writer);
		else if (writer.getDialect() != Dialect.E)
			writer.append("()");
	}

	private boolean requiresInvoke(CodeWriter writer) {
		if (writer.getDialect() != Dialect.E || (arguments!=null && !arguments.isEmpty()))
			return false;
		try {
			MethodFinder finder = new MethodFinder(writer.getContext(), this);
			IMethodDeclaration declaration = finder.findBest(false);
			/* if method is a reference */
			return declaration.isAbstract() || declaration.getClosureOf()!=null;
		} catch(SyntaxError e) {
			// not an error
			return false;
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(selector.toString());
		sb.append('(');
		if(arguments != null && arguments.size() > 0) {
			arguments.forEach((ass)->
				{
					sb.append(ass.toString());
					sb.append(", ");
				});
			sb.setLength(sb.length()-2);
		}
		sb.append(')');
		return sb.toString();
	}

	@Override
	public IType check(Context context) {
		return check(context, false);
	}
	
	@Override
	public IType checkReference(Context context) {
		MethodFinder finder = new MethodFinder(context, this);
		IMethodDeclaration method = finder.findBest(false);
		if(method!=null)
			return new MethodType(method);
		else
			return null;
	}
	
	
	public IType check(Context context, boolean updateSelectorParent) {
		MethodFinder finder = new MethodFinder(context, this);
		IMethodDeclaration declaration = finder.findBest(false);
		if(declaration==null)
			return VoidType.instance();
		if(updateSelectorParent && declaration.getMemberOf()!=null && this.selector.getParent()==null)
			this.selector.setParent(new ThisExpression());
		if(declaration.isAbstract()) {
			checkAbstractOnly(context, declaration);
			return declaration.getReturnType()!=null ? declaration.getReturnType() : VoidType.instance();
		} else {
			Context local = isLocalClosure(context) ? context : selector.newLocalCheckContext(context, declaration);
			// don't bubble up problems when collecting
			IProblemListener listener = local.getProblemListener();
			if(listener instanceof ProblemCollector)
				listener = new ProblemCollector();
			local.pushProblemListener(listener);
			try {
				return checkDeclaration(declaration, context, local);
			} finally {
				local.popProblemListener();
			}
		}
	}
	
	public ArgumentList makeArguments(Context context) {
		MethodFinder finder = new MethodFinder(context, this);
		IMethodDeclaration declaration = finder.findBest(false);
		return makeArguments(context, declaration);
	}

	private void checkAbstractOnly(Context context, IMethodDeclaration declaration) {
		if(declaration.isReference()) // parameter or variable populated from a method call
			return;
		if(declaration.getMemberOf()!=null) // the category could be subclassed (if constructor called on abstract, that would raise an error anyway)
			return;
		// if a global method, need to check for runtime dispatch
		MethodFinder finder = new MethodFinder(context, this);
		Set<IMethodDeclaration> potential = finder.findPotential();
		potential = potential.stream().filter(m->!m.isAbstract()).collect(Collectors.toSet());
		if(potential.isEmpty()) {
			// raise error if direct call to pure abstract method
			context.getProblemListener().reportIllegalAbstractMethodCall(this, declaration.getSignature(Dialect.O));
		}
	}

	private boolean isLocalClosure(Context context) {
		if(this.selector.getParent()!=null)
			return false;
		IDeclaration decl = context.getLocalDeclaration(IDeclaration.class, this.selector.getId());
		return decl instanceof MethodDeclarationMap;
	}

	private IType checkDeclaration(IMethodDeclaration declaration, Context parent, Context local) {
		if (declaration.isTemplate())
			return fullCheck((ConcreteMethodDeclaration) declaration, parent, local);
		else
			return lightCheck(declaration, parent, local);
	}

	private IType lightCheck(IMethodDeclaration declaration, Context parent, Context local) {
		declaration.registerParameters(local);
		return declaration.check(local, false);
	}

	private IType fullCheck(ConcreteMethodDeclaration declaration, Context parent, Context local) {
		try {
			ArgumentList arguments = makeArguments(parent, declaration);
			declaration.registerParameters(local);
			for (Argument argument : arguments) {
				IExpression expression = argument.resolve(local, declaration, true, false);
				IValue value = argument.getParameter().checkValue(parent, expression);
				local.setValue(argument.getParameterId(), value);
			}
			return declaration.check(local, false);
		} catch (PromptoError e) {
			throw new SyntaxError(e.getMessage());
		}
	}

	public ArgumentList makeArguments(Context context, IMethodDeclaration declaration) {
		ArgumentList arguments = this.arguments!=null ? this.arguments : new ArgumentList();
		return arguments.makeArguments(context, declaration);
	}

	public ArgumentList makeCodeAssignments(Context context, IMethodDeclaration declaration) {
		if (arguments == null)
			return new ArgumentList();
		else {
			ArgumentList list = new ArgumentList();
			list.addAll(arguments.stream()
					.filter((a)->
						(a.getExpression().check(context)==CodeType.instance()))
					.collect(Collectors.toList()));
			return list.resolveAndCheck(context, declaration);
		}
	}

	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		MethodFinder finder = new MethodFinder(context, this);
		Collection<IMethodDeclaration> potential = finder.findPotential();
		switch(potential.size()) {
		case 0:
			throw new SyntaxError("No matching prototype for:" + this.toString()); 
		case 1:
			return compileExact(context, method, flags, potential.iterator().next());
		default:
			return compileDynamic(context, method, flags, finder.findLessSpecific(potential));
		}
	}
	
	private ResultInfo compileDynamic(Context context, MethodInfo method, Flags flags, IMethodDeclaration declaration) {
		Context local = this.selector.newLocalCheckContext(context, declaration);
		declaration.registerParameters(local);
		ArgumentList arguments = this.arguments!=null ? this.arguments : new ArgumentList();
		return this.selector.compileDynamic(local, method, flags, declaration, arguments);
	}

	private ResultInfo compileExact(Context context, MethodInfo method, Flags flags, IMethodDeclaration declaration) {
		if(declaration.isTemplate())
			return compileTemplate(context, method, flags, declaration);
		else
			return compileConcrete(context, method, flags, declaration);
	}

	private ResultInfo compileConcrete(Context context, MethodInfo method, Flags flags, IMethodDeclaration declaration) {
		Context local = isLocalClosure(context) ? context : selector.newLocalCheckContext(context, declaration);
		declaration.registerParameters(local);
		ArgumentList arguments = this.arguments!=null ? this.arguments : new ArgumentList();
		return this.selector.compileExact(local, method, flags, declaration, arguments);
	}

	private ResultInfo compileTemplate(Context context, MethodInfo method, Flags flags, IMethodDeclaration declaration) {
		// compile the method as a member method
		Context local = context.newLocalContext();
		declaration.registerParameters(local);
		registerCodeAssignments(context, local, declaration);
		String methodName = declaration.compileTemplate(local, false, method.getClassFile());
		// compile the method call
		IExpression parent = method.isStatic() ? null : new ThisExpression();
		MethodSelector selector = new MethodSelector(parent, new Identifier(methodName));
		local = selector.newLocalContext(context, declaration);
		declaration.registerParameters(local);
		registerCodeAssignments(context, local, declaration);
		ArgumentList arguments = this.arguments!=null ? this.arguments : new ArgumentList();
		return selector.compileTemplate(local, method, flags, declaration, arguments, methodName);
	}

	private void registerCodeAssignments(Context context, Context local, IMethodDeclaration declaration) {
		ArgumentList arguments = makeCodeAssignments(context, declaration);
		for (Argument argument : arguments) {
			IExpression expression = argument.resolve(local, declaration, true, false);
			IParameter parameter = argument.getParameter();
			IValue value = parameter.checkValue(context, expression);
			local.setValue(argument.getParameterId(), value);
		}	
	}

	@Override
	public IValue interpret(Context context) throws PromptoError {
		MethodFinder finder = new MethodFinder(context, this);
		IMethodDeclaration declaration = finder.findBest(true);
		if(declaration == null)
			context.getProblemListener().reportUnknownMethod(this, this.toString());
		Context local = selector.newLocalContext(context, declaration);
		local.enterMethod(declaration);
		try {
			declaration.registerParameters(local);
			assignArguments(context, local, declaration);
			return declaration.interpret(local);
		} finally {
			local.leaveSection(declaration);
		}
	}
	
	@Override
	public IValue interpretReference(Context context) {
		IMethodDeclaration declaration = findDeclaration(context, true);
		return new ClosureValue(context, new MethodType(declaration));
	}

	private void assignArguments(Context calling, Context local, IMethodDeclaration declaration) throws PromptoError {
		ArgumentList arguments = makeArguments(calling, declaration);
		for (Argument argument : arguments) {
			IExpression expression = argument.resolve(local, declaration, true, false);
			IParameter parameter = argument.getParameter();
			IValue value = parameter.checkValue(calling, expression);
			if(value!=null && parameter.isMutable() && !value.isMutable()) 
				throw new NotMutableError();
			local.setValue(argument.getParameterId(), value);
		}
	}

	@Override
	public boolean interpretAssert(Context context, TestMethodDeclaration test) throws PromptoError {
		IValue value = this.interpret(context);
		if(value instanceof BooleanValue) {
			if(((BooleanValue)value).getValue())
				return true;
			else {
				String expected = buildExpectedMessage(context, test);
				String actual = value.toString();
				test.printFailedAssertion(context, expected, actual);
				return false;
			}
		} else {
			CodeWriter writer = new CodeWriter(this.getDialect(), context);
			this.toDialect(writer);
			throw new SyntaxError("Cannot test '" + writer.toString() + "'");
		}
	}
	
	private String buildExpectedMessage(Context context, TestMethodDeclaration test) {
		CodeWriter writer = new CodeWriter(test.getDialect(), context);
		this.toDialect(writer);
		return writer.toString();
	}

	@Override
	public void compileAssert(Context context, MethodInfo method, Flags flags, TestMethodDeclaration test) {
		StackState finalState = method.captureStackState();
		// compile
		ResultInfo info = this.compile(context, method, flags.withPrimitive(true));
		if(java.lang.Boolean.class==info.getType())
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
		method.addInstruction(Opcode.LDC, new StringConstant(BooleanValue.FALSE.toString()));
		MethodConstant concat = new MethodConstant(String.class, "concat", String.class, String.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, concat);
		test.compileFailure(context, method, flags);
		// success/final
		method.restoreFullStackState(finalState);
		method.placeLabel(finalState);
		method.inhibitOffsetListener(finalListener);
	}
	
	IMethodDeclaration findDeclaration(Context context, boolean checkInstance) {
		IMethodDeclaration method = findRegistered(context);
		if(method!=null)
			return method;
		else {
			MethodFinder finder = new MethodFinder(context, this);
			return finder.findBest(checkInstance);
		}
	}
	
	private IMethodDeclaration findRegistered(Context context) {
		if(selector.getParent()==null) try {
			Object o = context.getValue(selector.getId());
			if (o instanceof ClosureValue)
				return getClosureDeclaration(context, (ClosureValue)o);
			else if (o instanceof ArrowValue)
				return new ArrowDeclaration((ArrowValue)o);
		} catch (PromptoError e) {
		}
		return null;
	}

	private IMethodDeclaration getClosureDeclaration(Context context, ClosureValue closure) {
		IMethodDeclaration decl = closure.getMethod();
		if(decl.getMemberOf()!=null) {
			// the closure references a member method (useful when a method reference is needed)
			// in which case we may simply want to return that method to avoid spilling context into method body
			// this is only true if the closure comes straight from the method's instance context
			// if the closure comes from an accessible context that is not the instance context
			// then it is a local variable that needs the closure context to be interpreted
			Context declaring = context.contextForValue(selector.getId());
			if( declaring == closure.getContext())
				return decl;
		}
		return new ClosureDeclaration(closure);
	}

	@Override
	public void declare(Transpiler transpiler) {
		Context context = transpiler.getContext();
		// don't bubble up problems, they will emerge when transpiling
		context.pushProblemListener(new ProblemCollector());
		try {
			doDeclare(transpiler);
		} finally {
			context.popProblemListener();
		}
	}
	
	private void doDeclare(Transpiler transpiler) {
		MethodFinder finder = new MethodFinder(transpiler.getContext(), this);
		IMethodDeclaration reference = finder.findBestReference(false, new ArrayList<>());
		if(reference != null)
			return; // already declared
		Set<IMethodDeclaration> candidates = finder.findCandidates(false);
		if(candidates.size()==0) {
			transpiler.getContext().getProblemListener().reportUnknownMethod(getSelector().getId(), this.getName());
		} else {
		    Set<IMethodDeclaration> compatibles = finder.filterCompatible(candidates, false, true, spec -> spec!=Specificity.INCOMPATIBLE);
		    if(compatibles==null || compatibles.isEmpty())
		    	transpiler.getContext().getProblemListener().reportNoMatchingPrototype(this, this.toString(), candidates.stream().map(m->m.getSignature(Dialect.O)).collect(Collectors.toSet()));
		    else if(compatibles.size()==1 && compatibles.iterator().next() instanceof BuiltInMethodDeclaration) {
	            ((BuiltInMethodDeclaration)compatibles.iterator().next()).declareCall(transpiler);
		    } else {
	        	if(!this.isLocalClosure(transpiler.getContext())) {
	        		compatibles.forEach(declaration -> {
			            Context local = this.selector.newLocalCheckContext(transpiler.getContext(), declaration);
			            this.declareDeclaration(transpiler, declaration, local);
			        });
	        	}
		        if(compatibles.size()>1 && this.dispatcher==null) {
		        	IMethodDeclaration declaration = finder.findBest(false);
		        	List<IMethodDeclaration> sorted = finder.sortMostSpecificFirst(compatibles);
		            this.dispatcher = new DispatchMethodDeclaration(transpiler.getContext(), this, declaration, sorted);
		            transpiler.declare(this.dispatcher);
		        }
		    }
		}
	}

	private void declareDeclaration(Transpiler transpiler, IMethodDeclaration declaration, Context local) {
        if (this.arguments != null)
            this.arguments.declare(transpiler, declaration);
	    if(declaration.isTemplate()) {
	        this.fullDeclareDeclaration(declaration, transpiler, local);
	    } else {
	        this.lightDeclareDeclaration(declaration, transpiler, local);
	    }
	}

	static AtomicLong fullDeclareCounter = new AtomicLong();
	
	private void fullDeclareDeclaration(IMethodDeclaration declaration, Transpiler transpiler, Context local) {
	    if(this.fullSelector==null) {
	    	ArgumentList arguments = this.makeArguments(transpiler.getContext(), declaration);
	        declaration.registerParameters(local);
	        arguments.forEach(argument -> {
	            IExpression expression = argument.resolve(local, declaration, true, false);
	            IValue value = argument.getParameter().checkValue(transpiler.getContext(), expression);
	            local.setValue(argument.getParameter().getId(), value);
	        });
	        Transpiler localTranspiler = transpiler.copyTranspiler(local);
	        this.fullSelector = this.selector.newFullSelector(fullDeclareCounter.incrementAndGet());
	        declaration.fullDeclare(localTranspiler, this.fullSelector.getId());
	    }
	}

	private void lightDeclareDeclaration(IMethodDeclaration declaration, Transpiler transpiler, Context local) {
	    transpiler = transpiler.copyTranspiler(local);
	    declaration.declare(transpiler);
	}
	
	@Override
	public boolean transpile(Transpiler transpiler) {
		MethodFinder finder = new MethodFinder(transpiler.getContext(), this);
		IMethodDeclaration reference = finder.findBestReference(false, new ArrayList<>());
		if(reference != null) {
	        transpileSelector(transpiler, reference);
	        transpileAssignments(transpiler, reference, false);
			return false;
		}
		Set<IMethodDeclaration> candidates = finder.findCandidates(false);
		if(candidates.size()==0) {
	    	transpiler.getContext().getProblemListener().reportUnknownMethod(getSelector().getId(), this.getName());
	    	return false;
		}
	    Set<IMethodDeclaration> compatibles = finder.filterCompatible(candidates, false, true, spec -> spec!=Specificity.INCOMPATIBLE);
	    if(compatibles==null || compatibles.isEmpty())
	    	transpiler.getContext().getProblemListener().reportNoMatchingPrototype(this, this.toString(), candidates.stream().map(m->m.getSignature(Dialect.O)).collect(Collectors.toSet()));
		else if (compatibles.size() == 1)
	        transpileSingle(transpiler, compatibles.iterator().next(), false);
	    else
	        transpileMultiple(transpiler, compatibles);
	    return false;
	}

	private void transpileSingle(Transpiler transpiler, IMethodDeclaration declaration, boolean allowDerived) {
	   if (declaration instanceof BuiltInMethodDeclaration)
	        transpileBuiltin(transpiler, (BuiltInMethodDeclaration)declaration);
	   else if(mustInlineMethodCall(transpiler.getContext(), declaration))
		   transpileInlinedMethodCall(transpiler, (NativeMethodDeclaration)declaration);
	   else {
	        transpileSelector(transpiler, declaration);
	        transpileAssignments(transpiler, declaration, allowDerived);
	    }
	}

	private boolean mustInlineMethodCall(Context context, IMethodDeclaration declaration) {
		return declaration instanceof NativeMethodDeclaration
				&& (declaration.hasAnnotation(context, "Inlined")
					|| declaration.containerHasAnnotation(context, "Inlined"));
	}

	private void transpileInlinedMethodCall(Transpiler transpiler, NativeMethodDeclaration declaration) {
		JavaScriptNativeCall call = declaration.findCall(JavaScriptNativeCall.class);
		if(call==null)
			throw new UnsupportedOperationException("Missing native JavaScript call!");
		call.transpileInlineMethodCall(transpiler, declaration, this);
	}
	
	
	private void transpileAssignments(Transpiler transpiler, IMethodDeclaration declaration, boolean allowDerived) {
		List<Argument> arguments = makeArguments(transpiler.getContext(), declaration);
		transpileAssignments(transpiler, arguments, declaration, allowDerived);
	}
	
	public void transpileAssignments(Transpiler transpiler, List<Argument> arguments, IMethodDeclaration declaration, boolean allowDerived) {
	    arguments = arguments.stream().filter(argument->!(argument.getParameter() instanceof CodeParameter)).collect(Collectors.toList());
	    if(!arguments.isEmpty()) {
	        transpiler.append("(");
	        arguments.forEach(argument -> {
	            IParameter parameter = argument.getParameter();
	            IExpression expression = argument.resolve(transpiler.getContext(), declaration, false, allowDerived);
	            parameter.transpileCall(transpiler, expression);
	            transpiler.append(", ");
	        });
	        transpiler.trimLast(2);
	        transpiler.append(")");
	    } else
	        transpiler.append("()");
	}

	public void transpileSelector(Transpiler transpiler, IMethodDeclaration declaration) {
		MethodSelector selector = resolveSelector(transpiler, declaration);
	    selector.transpile(transpiler);
	}
	
	public MethodSelector resolveSelector(Transpiler transpiler, IMethodDeclaration declaration) {
	    MethodSelector selector = /*this.fullSelector ||*/ this.selector;
	    IExpression parent = selector.resolveParent(transpiler.getContext());
	    if (parent == null && declaration.getMemberOf()!=null && transpiler.getContext().getClosestInstanceContext()!=null)
	        parent = new ThisExpression();
	    String name = null;
	    if(this.variableName!=null)
	        name = this.variableName;
	    // don't transpile name of local abstract method references 
	    else if(!selector.getName().equals(declaration.getName()))
	        name = selector.getName();
        // don't transpile name of method references in widget property value 
	    else if(parent!=null && parent.check(transpiler.getContext()) instanceof PropertiesType)
	    	name = selector.getName();
	    else 
	        name = declaration.getTranspiledName(transpiler.getContext());
	    return new MethodSelector(parent, new Identifier(name));
	}

	private void transpileBuiltin(Transpiler transpiler, BuiltInMethodDeclaration declaration) {
	    IExpression parent = this.selector.resolveParent(transpiler.getContext());
	    parent.transpileParent(transpiler);
	    transpiler.append(".");
	    declaration.transpileCall(transpiler, makeArguments(transpiler.getContext(), declaration));
	}

	private void transpileMultiple(Transpiler transpiler, Set<IMethodDeclaration> declarations) {
	    String name = this.dispatcher.getTranspiledName(transpiler.getContext());
	    IExpression parent = this.selector.resolveParent(transpiler.getContext());
	    if(parent==null && declarations.iterator().next().getMemberOf()!=null && transpiler.getContext().getClosestInstanceContext()!=null)
	        parent = new ThisExpression();
	    MethodSelector selector = new MethodSelector(parent, new Identifier(name));
	    selector.transpile(transpiler);
	    this.transpileAssignments(transpiler, this.dispatcher, false);
	}

	@Override
	public void transpileFound(Transpiler transpiler, Dialect dialect) {
		CodeWriter writer = new CodeWriter(dialect, transpiler.getContext());
		this.toDialect(writer);
		transpiler.append(writer.toString());
	}
	
	



}
