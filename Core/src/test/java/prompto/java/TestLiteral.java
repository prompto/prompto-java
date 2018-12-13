package prompto.java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import prompto.literal.DateLiteral;

public class TestLiteral {
	
	@Test
	public void quotesAreEscaped() {
		String text = "'2018-12-15'";
		DateLiteral dl = new DateLiteral(text);
		String s = dl.escapedText(0);
		assertEquals(text, s);
		s = dl.escapedText(1); 
		assertEquals("\\'2018-12-15\\'", s);
	}

}
