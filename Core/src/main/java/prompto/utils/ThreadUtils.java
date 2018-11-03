package prompto.utils;

import java.lang.management.ManagementFactory;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public abstract class ThreadUtils {

	public static ThreadGroup getRootThreadGroup() {
	    ThreadGroup result = Thread.currentThread( ).getThreadGroup( );
	    while(result.getParent()!=null)
	    	result = result.getParent();
	    return result;
	}
	
	
	public static ThreadGroup[] getAllThreadGroups() {
		ThreadGroup root = getRootThreadGroup();
		int count = root.activeGroupCount();
		for(;;) {
			ThreadGroup[] groups = new ThreadGroup[count * 2];
			count = root.enumerate(groups, true);
			if(count==groups.length)
				continue;
			ThreadGroup[] result = new ThreadGroup[count + 1];	
			result[0] = root;
			System.arraycopy(groups, 0, result, 1, count);
			return result;
		}
	}
	
	public static Thread[] getAllThreads() {
		ThreadGroup root = getRootThreadGroup();
		long count = ManagementFactory.getThreadMXBean().getTotalStartedThreadCount();
		for(;;) {
			Thread[] threads = new Thread[(int)count * 2];
			count = root.enumerate(threads, true);
			if(count==threads.length)
				continue;
			Thread[] result = new Thread[(int)count];	
			System.arraycopy(threads, 0, result, 0, (int)count);
			return result;
		}
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
