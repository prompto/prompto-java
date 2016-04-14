package prompto.intrinsic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* for anonymous parameters (any x with y, z), we have to create a local combining interface */
/* on which to call x.y or x.z. However the parameter does not implement this interface, so we */
/* use a proxy class for conversion purpose only. This is slower than a direct call, so we might */
/* want to rely on interface injection instead when it becomes available */
public abstract class PromptoProxy {

	@SuppressWarnings("unchecked")
	public static <T> T newProxy(Class<T> klass, Object o) {
		return (T)Proxy.newProxyInstance(
				klass.getClassLoader(), 
				new Class<?>[] { klass }, 
				new InvocationHandler() {

					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						return method.invoke(o, args);
					}
					
				});
		
	}

	@SuppressWarnings("unchecked")
	public static <T> T newProxy(Class<T> klass, Object o, String methodName) {
		return (T)Proxy.newProxyInstance(
				klass.getClassLoader(), 
				new Class<?>[] { klass }, 
				new InvocationHandler() {

					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						method = o.getClass().getMethod(methodName, method.getParameterTypes());
						return method.invoke(o, args);
					}
					
				});
		
	}
}
