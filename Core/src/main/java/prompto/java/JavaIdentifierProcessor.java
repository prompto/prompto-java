package prompto.java;

import java.util.HashMap;
import java.util.Map;

import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.PromptoClassLoader;
import prompto.compiler.ResultInfo;
import prompto.runtime.Context;
import prompto.store.DataStore;
import prompto.store.IStore;
import prompto.type.IType;

public abstract class JavaIdentifierProcessor {
	
	public static Map<String, JavaIdentifierProcessor> processors = new HashMap<>();
	
	static {
		processors.put("$context", new ContextIdentifierProcessor());
		processors.put("$store", new DataStoreIdentifierProcessor());
	}
	
	public abstract IType check(Context context);
	public abstract Object interpret(Context context);
	public abstract ResultInfo compile(Context context, MethodInfo method);
	
	static class ContextIdentifierProcessor extends JavaIdentifierProcessor {
		
		@Override
		public IType check(Context context) {
			return new JavaClassType(context.getClass());
		}
		
		@Override
		public Object interpret(Context context) {
			return context;
		}
		
		@Override
		public ResultInfo compile(Context context, MethodInfo method) {
			// PromptoClassLoader.getInstance().getContext()
			MethodConstant m = new MethodConstant(PromptoClassLoader.class, "getInstance", PromptoClassLoader.class);
			method.addInstruction(Opcode.INVOKESTATIC, m);
			m = new MethodConstant(PromptoClassLoader.class, "getContext", Context.class);
			method.addInstruction(Opcode.INVOKEVIRTUAL, m);
			return new ResultInfo(Context.class);
		}
	}
	
	static class DataStoreIdentifierProcessor extends JavaIdentifierProcessor {
		
		@Override
		public IType check(Context context) {
			return new JavaClassType(IStore.class);
		}
		
		@Override
		public Object interpret(Context context) {
			return DataStore.getInstance();
		}
		
		@Override
		public ResultInfo compile(Context context, MethodInfo method) {
			// DataStore.getInstance()
			MethodConstant m = new MethodConstant(DataStore.class, "getInstance", IStore.class);
			method.addInstruction(Opcode.INVOKESTATIC, m);
			return new ResultInfo(IStore.class);
		}
	}

	
}
