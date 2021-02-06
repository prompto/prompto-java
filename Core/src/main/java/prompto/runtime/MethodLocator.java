package prompto.runtime;

import prompto.declaration.IMethodDeclaration;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.param.IParameter;
import prompto.param.ITypedParameter;
import prompto.param.ParameterList;
import prompto.grammar.Identifier;
import prompto.runtime.Context.MethodDeclarationMap;
import prompto.type.DictType;
import prompto.type.IType;
import prompto.type.TextType;

public abstract class MethodLocator {

	public static IMethodDeclaration locateMethod(Context context, Identifier methodName, IExpression args) {
		MethodDeclarationMap map = context.getRegisteredDeclaration(MethodDeclarationMap.class, methodName);
		if(map==null)
			throw new SyntaxError("Could not find a \"" + methodName + "\" method.");
		return locateMethod(map, args!=null);
	}

	static IMethodDeclaration locateMethod(MethodDeclarationMap map, boolean hasArgs) {
		if(hasArgs)
			return locateMethod(map, new DictType(TextType.instance()));
		else
			return locateMethod(map);
	}

	static IMethodDeclaration locateMethod(MethodDeclarationMap map, IType ... argTypes) {
		// try exact match first
		for(IMethodDeclaration method : map.values()) {
			if(MethodLocator.identicalParameters(method.getParameters(), argTypes))
				return method;
		}
		// match Text{} argument, will pass null 
		if(argTypes.length==0) for(IMethodDeclaration method : map.values()) {
			if(isSingleTextDictParameter(method.getParameters()))
				return method;
		}
		// match no parameter, will ignore options
		for(IMethodDeclaration method : map.values()) {
			if(method.getParameters().size()==0)
				return method;
		}
		throw new SyntaxError("Could not find a compatible \"" + map.getId() + "\" method.");
	}

	static boolean isSingleTextDictParameter(ParameterList arguments) {
		if(arguments.size()!=1)
			return false;
		IParameter arg = arguments.getFirst();
		if(!(arg instanceof ITypedParameter))
			return false;
		return ((ITypedParameter)arg).getType().equals(Interpreter.argsType);
	}

	static boolean identicalParameters(ParameterList parameters, IType[] argTypes) {
		if(parameters.size()!=argTypes.length)
			return false;
		int idx = 0;
		for(IParameter parameter : parameters) {
			if(!(parameter instanceof ITypedParameter))
				return false;
			IType argType = argTypes[idx++];
			if(!argType.equals(((ITypedParameter)parameter).getType()))
				return false;
		}
		return true;
	}

}
