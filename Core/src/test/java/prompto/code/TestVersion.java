package prompto.code;

import static org.junit.Assert.*;

import org.junit.Test;

import prompto.code.Version;

public class TestVersion {

	@Test
	public void test() {
		String s = "1.2.3";
		Version v = Version.parse(s);
		assertEquals(s, v.toString());
	}

}
