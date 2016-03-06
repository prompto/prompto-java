package prompto.runtime;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import prompto.compiler.CompilerUtils;
import prompto.compiler.PromptoClassLoader;
import prompto.error.InternalError;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.Identifier;
import prompto.utils.CmdLineParser;

public abstract class Executor {

	public static void executeTests(Context context) {
		// TODO Auto-generated method stub
		
	}

	public static void executeMainNoArgs(Context context) throws PromptoError {
		executeMainMethod(context, new Identifier("main"), "");
	}

	public static void executeMainMethod(Context context, Identifier methodName, String cmdLineArgs) throws PromptoError {
		String className = CompilerUtils.getGlobalMethodClassName(methodName, false);
		try(PromptoClassLoader loader = new PromptoClassLoader(context)) {
			Class<?> klass = loader.loadClass(className);
			Method method = locateMainMethod(klass, cmdLineArgs);
			Map<String, String> options = parseCmdLineArgs(cmdLineArgs);
			method.invoke(null, options);
		} catch(ClassNotFoundException | NoSuchMethodException e) {
			throw new SyntaxError("Could not find a compatible \"" + methodName + "\" method.");
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | IOException e) {
			throw new InternalError(e);
		} finally {
			context.terminated();
		}
	}

	private static Map<String, String> parseCmdLineArgs(String cmdLineArgs) {
		try {
			return CmdLineParser.parse(cmdLineArgs);
		} catch(Exception e) {
			return new HashMap<String, String>();
		}
	}

	private static Method locateMainMethod(Class<?> klass, String cmdLineArgs) throws NoSuchMethodException {
		if(cmdLineArgs==null)
			return locateMainMethod(klass);
		else
			return locateMainMethod(klass, Map.class);
	}

	private static Method locateMainMethod(Class<?> klass, Class<?> ... argTypes) throws NoSuchMethodException {
		// try exact match first
		for(Method method : klass.getDeclaredMethods()) {
			if(identicalArguments(method.getParameterTypes(), argTypes))
				return method;
		}
		// match Text{} argument, will pass null argument
		if(argTypes.length==0) {
			argTypes = new Class<?>[] { Map.class };
			for(Method method : klass.getDeclaredMethods()) {
				if(identicalArguments(method.getParameterTypes(), argTypes))
					return method;
			}
		}
		// match no argument, will ignore options
		for(Method method : klass.getDeclaredMethods()) {
			if(method.getParameterTypes().length==0)
				return method;
		}
		throw new NoSuchMethodException(klass.getSimpleName() + argTypes.toString());
	}

	private static boolean identicalArguments(Class<?>[] expected, Class<?>[] provided) {
		if(expected.length!=provided.length)
			return false;
		for(int i=0;i<expected.length;i++) {
			if(expected[i]!=provided[i])
				return false;
		}
		return true;
	}

}
