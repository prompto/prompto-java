package prompto.runtime;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;

import prompto.declaration.IMethodDeclaration;
import prompto.declaration.TestMethodDeclaration;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.ValueExpression;
import prompto.expression.IExpression;
import prompto.expression.MethodSelector;
import prompto.grammar.Argument;
import prompto.grammar.ArgumentList;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoDict;
import prompto.literal.DictLiteral;
import prompto.param.UnresolvedParameter;
import prompto.statement.MethodCall;
import prompto.type.DictType;
import prompto.type.IType;
import prompto.type.TextType;
import prompto.utils.CmdLineParser;
import prompto.value.DictionaryValue;
import prompto.value.IValue;
import prompto.value.TextValue;

public class Interpreter {
	
	static IType argsType = new DictType(TextType.instance());
			
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
		if(test==null)
			throw new SyntaxError("No such test: " + testName);
		Context local = context.newLocalContext();
		test.interpret(local);
	}
	
	public static IValue interpretMain(Context context, Map<String, String> cmdLineArgs) throws PromptoError {
		try {
			IExpression args = convertCmdLineArgs(cmdLineArgs);
			return interpretMethod(context, new Identifier("main"), args);
		} finally {
			context.notifyCompleted();
		}
	}
	
	public static IValue interpretMainNoArgs(Context context, Identifier name) throws PromptoError {
		return interpretMethod(context, name, "");
	}
	
	public static IValue interpretMainNoArgs(Context context) throws PromptoError {
		return interpretMethod(context, new Identifier("main"), "");
	}


	public static IValue interpretMethod(Context context, Identifier methodName, String cmdLineArgs) throws PromptoError {
		try {
			IExpression args = parseCmdLineArgs(cmdLineArgs);
			return interpretMethod(context, methodName, args);
		} finally {
			context.notifyCompleted();
		}
	}
	
	public static IValue interpretMethod(Context context, Identifier methodName, IExpression args) {
		IMethodDeclaration method = MethodLocator.locateMethod(context, methodName, args);
		ArgumentList assignments = buildArguments(method, args);
		MethodCall call = new MethodCall(new MethodSelector(methodName), assignments);
		return call.interpret(context);	
	}

	public static void interpretScript(Context context, String cmdLineArgs) throws PromptoError {
		throw new UnsupportedOperationException("yet!");
	}

	public static ArgumentList buildArguments(IMethodDeclaration method, IExpression args) {
		ArgumentList assignments = new ArgumentList();
		if(method.getParameters().size()==1) {
			Identifier name = method.getParameters().getFirst().getId();
			assignments.add(new Argument(new UnresolvedParameter(name), args)); 
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
		PromptoDict<TextValue, IValue> valueArgs = new PromptoDict<TextValue, IValue>(true);
		for(Entry<String,String> entry : args.entrySet())
			valueArgs.put(new TextValue(entry.getKey()), new TextValue(entry.getValue()));
		valueArgs.setMutable(false);
		DictionaryValue dict = new DictionaryValue(TextType.instance(), valueArgs);
		return new ValueExpression(argsType, dict);
	}

	
	
	
}
