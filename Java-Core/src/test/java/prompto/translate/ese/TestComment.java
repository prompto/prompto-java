package prompto.translate.ese;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestComment extends BaseEParserTest {

	@Test
	public void testComment() throws Exception {
		compareResourceESE("comment/comment.pec");
	}

}

