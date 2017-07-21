package prompto.runtime;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;

import prompto.argument.IArgument;
import prompto.argument.ITypedArgument;
import prompto.argument.UnresolvedArgument;
import prompto.declaration.IMethodDeclaration;
import prompto.declaration.TestMethodDeclaration;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.expression.MethodSelector;
import prompto.grammar.ArgumentAssignment;
import prompto.grammar.ArgumentAssignmentList;
import prompto.grammar.ArgumentList;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoDict;
import prompto.literal.DictLiteral;
import prompto.runtime.Context.MethodDeclarationMap;
import prompto.statement.MethodCall;
import prompto.type.DictType;
import prompto.type.IType;
import prompto.type.TextType;
import prompto.utils.CmdLineParser;
import prompto.value.Dictionary;
import prompto.value.ExpressionValue;
import prompto.value.IValue;
import prompto.value.Text;

public class Interpreter {
	
	private static IType argsType = new DictType(TextType.instance());
			
	private Interpreter() {
	}
	
	public static void interpretTests(Context context) throws PromptoError {
		Collection<TestMethodDeclaration> tests = context.getTests();
		for(TestMethodDeclaration test : tests) {
			Context local = context.newLocalContext();
			test.interpret(local);
		}
		
	}

	public static void interpretTest(Context context, Identifier testName, boolean lookInStore) throws PromptoError {
		TestMethodDeclaration test = context.getTest(testName, lookInStore);
		Context local = context.newLocalContext();
		test.interpret(local);
	}
	
	public static void interpretMain(Context context, Map<String, String> cmdLineArgs) throws PromptoError {
		try {
			IExpression args = convertCmdLineArgs(cmdLineArgs);
			interpretMethod(context, new Identifier("main"), args);
		} finally {
			context.notifyTerminated();
		}
	}
	
	public static void interpretMainNoArgs(Context context, Identifier name) throws PromptoError {
		interpretMethod(context, name, "");
	}
	
	public static void interpretMainNoArgs(Context context) throws PromptoError {
		interpretMethod(context, new Identifier("main"), "");
	}


	public static void interpretMethod(Context context, Identifier methodName, String cmdLineArgs) throws PromptoError {
		try {
			IExpression args = parseCmdLineArgs(cmdLineArgs);
			interpretMethod(context, methodName, args);
		} finally {
			context.notifyTerminated();
		}
	}
	
	public static void interpretMethod(Context context, Identifier methodName, IExpression args) {
		IMethodDeclaration method = locateMethod(context, methodName, args);
		ArgumentAssignmentList assignments = buildAssignments(method, args);
		MethodCall call = new MethodCall(new MethodSelector(methodName), assignments);
		call.interpret(context);	
	}

	public static void interpretScript(Context context, String cmdLineArgs) throws PromptoError {
		throw new UnsupportedOperationException("yet!");
	}

	public static ArgumentAssignmentList buildAssignments(IMethodDeclaration method, IExpression args) {
		ArgumentAssignmentList assignments = new ArgumentAssignmentList();
		if(method.getArguments().size()==1) {
			Identifier name = method.getArguments().getFirst().getId();
			assignments.add(new ArgumentAssignment(new UnresolvedArgument(name), args)); 
		}
		return assignments;
	}

	public static IExpression parseCmdLineArgs(String cmdLineArgs) {
		try {
			Map<String,String> args = CmdLineParser.parse(cmdLineArgs);
			return convertCmdLineArgs(args);
		} catch(Exception e) {
			// TODO
			return new DictLiteral(false);
		}
	}

	private static IExpression convertCmdLineArgs(Map<String, String> args) {
		PromptoDict<Text, IValue> valueArgs = new PromptoDict<Text, IValue>(true);
		for(Entry<String,String> entry : args.entrySet())
			valueArgs.put(new Text(entry.getKey()), new Text(entry.getValue()));
		valueArgs.setMutable(false);
		Dictionary dict = new Dictionary(TextType.instance(), valueArgs);
		return new ExpressionValue(argsType, dict);
	}


	 private static IMethodDeclaration locateMethod(Context context, Identifier methodName, IExpression args) {
		MethodDeclarationMap map = context.getRegisteredDeclaration(MethodDeclarationMap.class, methodName);
		if(map==null)
			throw new SyntaxError("Could not find a \"" + methodName + "\" method.");
		return locateMethod(map, args!=null);
	}
			
	private static IMethodDeclaration locateMethod(MethodDeclarationMap map, boolean hasArgs) {
		if(hasArgs)
			return locateMethod(map, new DictType(TextType.instance()));
		else
			return locateMethod(map);
	}

	private static IMethodDeclaration locateMethod(MethodDeclarationMap map, IType ... argTypes) {
		// try exact match first
		for(IMethodDeclaration method : map.values()) {
			if(identicalArguments(method.getArguments(), argTypes))
				return method;
		}
		// match Text{} argument, will pass null 
		if(argTypes.length==0) for(IMethodDeclaration method : map.values()) {
			if(isSingleTextDictArgument(method.getArguments()))
				return method;
		}
		// match no argument, will ignore options
		for(IMethodDeclaration method : map.values()) {
			if(method.getArguments().size()==0)
				return method;
		}
		throw new SyntaxError("Could not find a compatible \"" + map.getId() + "\" method.");
	}

	private static boolean isSingleTextDictArgument(ArgumentList arguments) {
		if(arguments.size()!=1)
			return false;
		IArgument arg = arguments.getFirst();
		if(!(arg instanceof ITypedArgument))
			return false;
		return ((ITypedArgument)arg).getType().equals(argsType);
	}

	private static boolean identicalArguments(ArgumentList arguments, IType[] argTypes) {
		if(arguments.size()!=argTypes.length)
			return false;
		int idx = 0;
		for(IArgument argument : arguments) {
			if(!(argument instanceof ITypedArgument))
				return false;
			IType argType = argTypes[idx++];
			if(!argType.equals(((ITypedArgument)argument).getType()))
				return false;
		}
		return true;
	}

	
	
	
}
