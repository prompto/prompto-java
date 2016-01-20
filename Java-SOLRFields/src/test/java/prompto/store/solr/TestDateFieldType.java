package prompto.store.solr;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestDateFieldType {

	@Test
	public void test() {
		DateFieldType field = new DateFieldType();
		String source = "2015-03-01";
		assertEquals(source, field.buildDateString(field.parseDateString(source)));
	}
	
}
