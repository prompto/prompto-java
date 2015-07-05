// generated: 2015-07-05T23:01:00.892
package prompto.translate.oso;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestCategories extends BaseOParserTest {

	@Test
	public void testCopyFromAscendant() throws Exception {
		compareResourceOSO("categories/copyFromAscendant.poc");
	}

	@Test
	public void testCopyFromAscendantWithOverride() throws Exception {
		compareResourceOSO("categories/copyFromAscendantWithOverride.poc");
	}

	@Test
	public void testCopyFromDescendant() throws Exception {
		compareResourceOSO("categories/copyFromDescendant.poc");
	}

	@Test
	public void testCopyFromDescendantWithOverride() throws Exception {
		compareResourceOSO("categories/copyFromDescendantWithOverride.poc");
	}

}

