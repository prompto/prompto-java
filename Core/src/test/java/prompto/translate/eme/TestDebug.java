package prompto.translate.eme;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestDebug extends BaseEParserTest {

	@Test
	public void testStack() throws Exception {
		compareResourceEME("debug/stack.pec");
	}

	@Test
	public void testVariable_boolean() throws Exception {
		compareResourceEME("debug/variable-boolean.pec");
	}

	@Test
	public void testVariable_category() throws Exception {
		compareResourceEME("debug/variable-category.pec");
	}

	@Test
	public void testVariable_character() throws Exception {
		compareResourceEME("debug/variable-character.pec");
	}

	@Test
	public void testVariable_css() throws Exception {
		compareResourceEME("debug/variable-css.pec");
	}

	@Test
	public void testVariable_cursor() throws Exception {
		compareResourceEME("debug/variable-cursor.pec");
	}

	@Test
	public void testVariable_date() throws Exception {
		compareResourceEME("debug/variable-date.pec");
	}

	@Test
	public void testVariable_dateTime() throws Exception {
		compareResourceEME("debug/variable-dateTime.pec");
	}

	@Test
	public void testVariable_decimal() throws Exception {
		compareResourceEME("debug/variable-decimal.pec");
	}

	@Test
	public void testVariable_dictionary() throws Exception {
		compareResourceEME("debug/variable-dictionary.pec");
	}

	@Test
	public void testVariable_document() throws Exception {
		compareResourceEME("debug/variable-document.pec");
	}

	@Test
	public void testVariable_integer() throws Exception {
		compareResourceEME("debug/variable-integer.pec");
	}

	@Test
	public void testVariable_iterator() throws Exception {
		compareResourceEME("debug/variable-iterator.pec");
	}

	@Test
	public void testVariable_list() throws Exception {
		compareResourceEME("debug/variable-list.pec");
	}

	@Test
	public void testVariable_null() throws Exception {
		compareResourceEME("debug/variable-null.pec");
	}

	@Test
	public void testVariable_range() throws Exception {
		compareResourceEME("debug/variable-range.pec");
	}

	@Test
	public void testVariable_set() throws Exception {
		compareResourceEME("debug/variable-set.pec");
	}

	@Test
	public void testVariable_text() throws Exception {
		compareResourceEME("debug/variable-text.pec");
	}

	@Test
	public void testVariable_time() throws Exception {
		compareResourceEME("debug/variable-time.pec");
	}

	@Test
	public void testVariable_tuple() throws Exception {
		compareResourceEME("debug/variable-tuple.pec");
	}

	@Test
	public void testVariable_uuid() throws Exception {
		compareResourceEME("debug/variable-uuid.pec");
	}

	@Test
	public void testVariable_version() throws Exception {
		compareResourceEME("debug/variable-version.pec");
	}

	@Test
	public void testVariables() throws Exception {
		compareResourceEME("debug/variables.pec");
	}

}

