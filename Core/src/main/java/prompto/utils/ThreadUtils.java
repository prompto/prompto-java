package prompto.utils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public abstract class ThreadUtils {

	public static Thread[] getActiveThreads() {
		Thread[] threads = new Thread[Thread.activeCount()];
		Thread.enumerate(threads);
		return threads;
	}

	public static void removeThreadLocalForThread(Thread thread, ThreadLocal<?> local) throws Exception {
		Object threadLocals = getThreadLocalsForThread(thread);
		if (threadLocals != null) {
			Class<?> threadLocalMapClass = Class.forName("java.lang.ThreadLocal$ThreadLocalMap");
			Method method = threadLocalMapClass.getDeclaredMethod("remove", ThreadLocal.class);
			method.setAccessible(true);
			method.invoke(threadLocals, local);
		}
	}

	private static Object getThreadLocalsForThread(Thread thread) throws Exception {
		Field threadLocalsField = Thread.class.getDeclaredField("threadLocals");
		threadLocalsField.setAccessible(true);
		return threadLocalsField.get(thread);
	}

}
