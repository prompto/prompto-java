package prompto.translate.ese;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestCast extends BaseEParserTest {

	@Test
	public void testAutoDecimalCast() throws Exception {
		compareResourceESE("cast/autoDecimalCast.pec");
	}

	@Test
	public void testAutoDowncast() throws Exception {
		compareResourceESE("cast/autoDowncast.pec");
	}

	@Test
	public void testAutoIntegerCast() throws Exception {
		compareResourceESE("cast/autoIntegerCast.pec");
	}

	@Test
	public void testCastChild() throws Exception {
		compareResourceESE("cast/castChild.pec");
	}

	@Test
	public void testCastDecimal() throws Exception {
		compareResourceESE("cast/castDecimal.pec");
	}

	@Test
	public void testCastInteger() throws Exception {
		compareResourceESE("cast/castInteger.pec");
	}

	@Test
	public void testCastMissing() throws Exception {
		compareResourceESE("cast/castMissing.pec");
	}

	@Test
	public void testCastNull() throws Exception {
		compareResourceESE("cast/castNull.pec");
	}

	@Test
	public void testIsAChild() throws Exception {
		compareResourceESE("cast/isAChild.pec");
	}

	@Test
	public void testIsAText() throws Exception {
		compareResourceESE("cast/isAText.pec");
	}

}

