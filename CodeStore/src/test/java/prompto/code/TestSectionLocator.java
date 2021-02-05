package prompto.code;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.net.URL;

import org.junit.Test;

import prompto.intrinsic.PromptoVersion;
import prompto.parser.Dialect;
import prompto.parser.ICodeSection;
import prompto.parser.Location;
import prompto.parser.Section;
import prompto.parser.e.BaseEParserTest;
import prompto.statement.IStatement;


public class TestSectionLocator extends BaseEParserTest {

	@Test
	public void resourceCodeStoreContainsStatementSection() throws Exception {
		URL file = getResourceAsURL("debug/stack.pec");
		assertTrue(new File(file.getFile()).exists());
		ICodeStore store = new ImmutableCodeStore(null, ModuleType.LIBRARY, file.toURI().toURL(), PromptoVersion.parse("1.0.0.0"));
		Section section = new Section(file.toExternalForm(), new Location(0, 10, 1), new Location(0, 10, 20), Dialect.E, false);
		ICodeSection found = store.findCodeSection(section);
		assertNotNull(found);
		assertTrue(found instanceof IStatement);
	}
}
