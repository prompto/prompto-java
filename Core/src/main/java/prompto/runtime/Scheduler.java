package prompto.runtime;

import java.util.Date;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

import prompto.intrinsic.PromptoDateTime;
import prompto.intrinsic.PromptoPeriod;
import prompto.value.ClosureValue;

public abstract class Scheduler {

	static AtomicLong JOB_COUNTER = new AtomicLong(0);
	static Map<Long, Timer> JOB_TIMERS = new ConcurrentHashMap<>();
	
	public static Long schedule(Object callback, PromptoDateTime executeAt, PromptoPeriod repeatEvery, String jobName) {
		Runnable runnable = makeRunnable(callback);
		return schedule(runnable, executeAt, repeatEvery, jobName);
	}
	
	
	private static Runnable makeRunnable(Object callback) {
		if(callback instanceof Runnable) 
			return (Runnable)callback;
		else if(callback instanceof ClosureValue)
			return () -> ((ClosureValue)callback).interpret(ApplicationContext.get());
		else 
			throw new UnsupportedOperationException("Unsupported callback type: " + callback.getClass().getName());
	}


	public static Long schedule(Runnable callback, PromptoDateTime executeAt, PromptoPeriod repeatEvery, String jobName) {
		if(jobName==null)
			jobName = "Prompto timer";
		Timer timer = new Timer(jobName, true);
		final Long jobId = JOB_COUNTER.incrementAndGet();
		JOB_TIMERS.put(jobId, timer);
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				try {
					callback.run();
				} finally {
					// gracefully dispose 1-time job timers (repeated jobs must call cancel)
					if(repeatEvery==null)
						JOB_TIMERS.remove(jobId);
				}
			}
		};
		Date firstTime = new Date(executeAt.toJavaTime());
		if(repeatEvery==null)
			timer.schedule(task, firstTime);
		else 
			timer.schedule(task, firstTime, repeatEvery.toJavaTime());
		return jobId;
	}
	
	public static void cancel(Long jobId) {
		Timer timer = JOB_TIMERS.get(jobId);
		if(timer==null)
			System.err.println("Timer not found: " + jobId); // TODO raise Prompto error
		else {
			timer.cancel();
			JOB_TIMERS.remove(jobId);
		}
	}
}
