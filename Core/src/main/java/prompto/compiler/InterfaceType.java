package prompto.compiler;

import java.lang.reflect.Type;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import prompto.param.ParameterList;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.type.VoidType;

public class InterfaceType {
	
	ParameterList parameters;
	IType returnType;

	public InterfaceType(ParameterList parameters, IType returnType) {
		this.parameters = parameters;
		this.returnType = returnType;
	}
	
	
	@Override
	public String toString() {
		return "(" + parameters.toString() + ")" + returnType.toString();
	}
	
	public boolean isVoid() {
		return returnType==VoidType.instance();
	}


	public Type getInterfaceType() {
		if(isVoid()) 
			return getConsumerInterfaceType();
		else 
			return getSupplierInterfaceType();
	}
	
	
	private Type getSupplierInterfaceType() {
		switch(parameters.size()) {
			case 0:
				return Supplier.class;
			case 1: 
				return Function.class;
			case 2:
				return BiFunction.class;
			default:
				throw new UnsupportedOperationException("getSupplierType " + parameters.size());
		}
	}


	private Type getConsumerInterfaceType() {
		switch(parameters.size()) {
			case 0:
				return Runnable.class;
			case 1: 
				return Consumer.class;
			case 2:
				return BiConsumer.class;
			default:
				throw new UnsupportedOperationException("getConsumerType " + parameters.size());
		} 
	}


	public String getInterfaceMethodName() {
		if(isVoid()) 
			return getConsumerInterfaceName();
		else
			return getSupplierInterfaceName();
	}
	
	
	private String getConsumerInterfaceName() {
		if(parameters.size() == 0)
			return "run"; // Runnable.class;
		else 
			return "accept"; // xxConsumer.class;
	}

	private String getSupplierInterfaceName() {
		if(parameters.size() == 0)
			return "get"; // Supplier.class;
		else
			return "apply"; // xxFunction.class;
	}

	public SignatureAttribute computeSignature(Context context, Type superClass) {
		String scs = CompilerUtils.getDescriptor(superClass);
		Stream<IType> types = parameters.stream()
				.map(arg->arg.getType(context));
		if(!isVoid())
			types = Stream.concat(types, Stream.of(returnType));
		List<Type> javaTypes = types
				.map(t->t.toJavaType(context))
				.collect(Collectors.toList());
		String sis = CompilerUtils.getGenericDescriptor(getInterfaceType(), javaTypes);
		return new SignatureAttribute(scs + sis);
	}







}
