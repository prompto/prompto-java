package prompto.translate.eoe;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestDebug extends BaseEParserTest {

	@Test
	public void testStack() throws Exception {
		compareResourceEOE("debug/stack.pec");
	}

	@Test
	public void testVariable_boolean() throws Exception {
		compareResourceEOE("debug/variable-boolean.pec");
	}

	@Test
	public void testVariable_category() throws Exception {
		compareResourceEOE("debug/variable-category.pec");
	}

	@Test
	public void testVariable_character() throws Exception {
		compareResourceEOE("debug/variable-character.pec");
	}

	@Test
	public void testVariable_css() throws Exception {
		compareResourceEOE("debug/variable-css.pec");
	}

	@Test
	public void testVariable_cursor() throws Exception {
		compareResourceEOE("debug/variable-cursor.pec");
	}

	@Test
	public void testVariable_date() throws Exception {
		compareResourceEOE("debug/variable-date.pec");
	}

	@Test
	public void testVariable_dateTime() throws Exception {
		compareResourceEOE("debug/variable-dateTime.pec");
	}

	@Test
	public void testVariable_decimal() throws Exception {
		compareResourceEOE("debug/variable-decimal.pec");
	}

	@Test
	public void testVariable_dictionary() throws Exception {
		compareResourceEOE("debug/variable-dictionary.pec");
	}

	@Test
	public void testVariable_document() throws Exception {
		compareResourceEOE("debug/variable-document.pec");
	}

	@Test
	public void testVariable_integer() throws Exception {
		compareResourceEOE("debug/variable-integer.pec");
	}

	@Test
	public void testVariable_iterator() throws Exception {
		compareResourceEOE("debug/variable-iterator.pec");
	}

	@Test
	public void testVariable_list() throws Exception {
		compareResourceEOE("debug/variable-list.pec");
	}

	@Test
	public void testVariable_null() throws Exception {
		compareResourceEOE("debug/variable-null.pec");
	}

	@Test
	public void testVariable_range() throws Exception {
		compareResourceEOE("debug/variable-range.pec");
	}

	@Test
	public void testVariable_set() throws Exception {
		compareResourceEOE("debug/variable-set.pec");
	}

	@Test
	public void testVariable_text() throws Exception {
		compareResourceEOE("debug/variable-text.pec");
	}

	@Test
	public void testVariable_time() throws Exception {
		compareResourceEOE("debug/variable-time.pec");
	}

	@Test
	public void testVariable_tuple() throws Exception {
		compareResourceEOE("debug/variable-tuple.pec");
	}

	@Test
	public void testVariable_uuid() throws Exception {
		compareResourceEOE("debug/variable-uuid.pec");
	}

	@Test
	public void testVariable_version() throws Exception {
		compareResourceEOE("debug/variable-version.pec");
	}

	@Test
	public void testVariables() throws Exception {
		compareResourceEOE("debug/variables.pec");
	}

}

