package presto.runtime;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import presto.declaration.IMethodDeclaration;
import presto.declaration.TestMethodDeclaration;
import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.expression.IExpression;
import presto.expression.MethodSelector;
import presto.grammar.ArgumentAssignment;
import presto.grammar.ArgumentAssignmentList;
import presto.grammar.ArgumentList;
import presto.grammar.IArgument;
import presto.grammar.ITypedArgument;
import presto.grammar.Identifier;
import presto.grammar.UnresolvedArgument;
import presto.literal.DictLiteral;
import presto.runtime.Context.MethodDeclarationMap;
import presto.statement.MethodCall;
import presto.type.DictType;
import presto.type.IType;
import presto.type.TextType;
import presto.utils.CmdLineParser;
import presto.value.Dictionary;
import presto.value.ExpressionValue;
import presto.value.IValue;
import presto.value.Text;




public class Interpreter {
	
	private static IType argsType = new DictType(TextType.instance());
			
	private Interpreter() {
	}
	
	public static void interpretTests(Context context) throws PrestoError {
		Collection<TestMethodDeclaration> tests = context.getTests();
		for(TestMethodDeclaration test : tests) {
			Context local = context.newLocalContext();
			test.interpret(local);
		}
		
	}

	public static void interpretTest(Context context, Identifier testName) throws PrestoError {
		TestMethodDeclaration test = context.getTest(testName);
		Context local = context.newLocalContext();
		test.interpret(local);
	}
	
	public static void interpretMainNoArgs(Context context) throws PrestoError {
		interpretMethod(context, new Identifier("main"), "");
	}
	
	public static void interpretMethod(Context context, Identifier methodName, String cmdLineArgs) throws PrestoError {
		try {
			IMethodDeclaration method = locateMethod(context, methodName, cmdLineArgs);
			ArgumentAssignmentList assignments = buildAssignments(method, cmdLineArgs);
			MethodCall call = new MethodCall(new MethodSelector(methodName),assignments);
			call.interpret(context);	
		} finally {
			context.terminated();
		}
	}
	
	public static void interpretScript(Context context, String cmdLineArgs) throws PrestoError {
	}

	private static ArgumentAssignmentList buildAssignments(IMethodDeclaration method, String cmdLineArgs) {
		ArgumentAssignmentList assignments = new ArgumentAssignmentList();
		if(method.getArguments().size()==1) {
			Identifier name = method.getArguments().getFirst().getIdentifier();
			IExpression value = parseCmdLineArgs(cmdLineArgs);
			assignments.add(new ArgumentAssignment(new UnresolvedArgument(name), value)); 
		}
		return assignments;
	}

	private static IExpression parseCmdLineArgs(String cmdLineArgs) {
		try {
			Map<String,String> args = CmdLineParser.parse(cmdLineArgs);
			Map<Text, IValue> valueArgs = new HashMap<Text, IValue>();
			for(Entry<String,String> entry : args.entrySet())
				valueArgs.put(new Text(entry.getKey()), new Text(entry.getValue()));
			Dictionary dict = new Dictionary(TextType.instance(), valueArgs);
			return new ExpressionValue(argsType, dict);
		} catch(Exception e) {
			// TODO
			return new DictLiteral();
		}
	}

	 private static IMethodDeclaration locateMethod(Context context, Identifier methodName, String cmdLineArgs) throws SyntaxError {
		MethodDeclarationMap map = context.getRegisteredDeclaration(MethodDeclarationMap.class, methodName);
		if(map==null)
			throw new SyntaxError("Could not find a \"" + methodName + "\" method.");
		return locateMethod(map, cmdLineArgs);
	}
			
	private static IMethodDeclaration locateMethod(MethodDeclarationMap map, String cmdLineArgs) throws SyntaxError {
		if(cmdLineArgs==null)
			return locateMethod(map);
		else
			return locateMethod(map, new DictType(TextType.instance()));
	}

	private static IMethodDeclaration locateMethod(MethodDeclarationMap map, IType ... argTypes) throws SyntaxError {
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
		throw new SyntaxError("Could not find a compatible \"" + map.getIdentifier() + "\" method.");
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
