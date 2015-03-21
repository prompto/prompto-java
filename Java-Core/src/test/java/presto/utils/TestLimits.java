package presto.utils;

import org.junit.Test;

public class TestLimits {

	@Test
	public void testParseMaxLong() {
		Long l = Long.MAX_VALUE;
		String s = l.toString();
		l = Long.parseLong(s);
	}

	@Test
	public void testParseMinLong() {
		Long l = Long.MIN_VALUE;
		String s = l.toString();
		l = Long.parseLong(s);
	}

}
