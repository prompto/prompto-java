package prompto.utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.slf4j.LoggerFactory;

public abstract class PrintStreamLogger extends PrintStream {

	protected PrintStreamLogger(String loggerName) {
		super(new LoggerStream(loggerName), true);
	}

	static class LoggerStream extends ByteArrayOutputStream {

		final org.slf4j.Logger logger;

		public LoggerStream(String loggerName) {
			logger = LoggerFactory.getLogger(loggerName);
		}

		@Override
		public synchronized void flush() throws IOException {
			String buffered = new String(toByteArray());
			if (buffered.length() > 0) {
				boolean logLastLine = buffered.endsWith("\n");
				reset();
				String[] lines = buffered.split("\n");
				if (lines.length > 0) {
					int lineCount = lines.length - (logLastLine ? 0 : 1);
					for (int i = 0; i < lineCount; i++)
						logger.info(lines[i] + "\n");
				}
				if (!logLastLine)
					write(lines[lines.length - 1].getBytes());
			}
		}

		@SuppressWarnings("deprecation")
		protected void finalize() throws Throwable {
			super.finalize();
			String buffered = new String(toByteArray());
			if (buffered.length() > 0) {
				String[] lines = buffered.split("\n");
				for(String line : lines)
					logger.info(line);
			}
		}
	}
}
