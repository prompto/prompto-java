package prompto.store;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestVersion {

	@Test
	public void test() {
		String s = "1.2.3";
		Version v = Version.parse(s);
		assertEquals(s, v.toString());
	}

}
