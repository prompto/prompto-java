// generated: 2015-07-05T23:01:00.878
package prompto.translate.eoe;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestCast extends BaseEParserTest {

	@Test
	public void testAutoDowncast() throws Exception {
		compareResourceEOE("cast/autoDowncast.pec");
	}

	@Test
	public void testCastChild() throws Exception {
		compareResourceEOE("cast/castChild.pec");
	}

	@Test
	public void testIsAChild() throws Exception {
		compareResourceEOE("cast/isAChild.pec");
	}

	@Test
	public void testIsAText() throws Exception {
		compareResourceEOE("cast/isAText.pec");
	}

}

