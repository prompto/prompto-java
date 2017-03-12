package prompto.code;

import static org.junit.Assert.*;

import java.io.File;
import java.net.URL;

import org.junit.Test;

import prompto.code.ICodeStore;
import prompto.code.ICodeStore.ModuleType;
import prompto.code.ResourceCodeStore;
import prompto.declaration.IMethodDeclaration;
import prompto.parser.Dialect;
import prompto.parser.ISection;
import prompto.parser.Location;
import prompto.parser.Section;
import prompto.parser.e.BaseEParserTest;
import prompto.statement.IStatement;


public class TestSectionLocator extends BaseEParserTest {

	@Test
	public void testThatResourceCodeStoreContainsMethodSection() throws Exception {
		URL file = getResourceAsURL("debug/stack.pec");
		assertTrue(new File(file.getFile()).exists());
		ICodeStore store = new ResourceCodeStore(null, ModuleType.LIBRARY, file.toURI().toURL(),"1.0.0.0");
		Section section = new Section(file.toExternalForm(), new Location(0, 9, 1), new Location(0, 9, 20), Dialect.E, false);
		ISection found = store.findSection(section);
		assertNotNull(found);
		assertTrue(found instanceof IMethodDeclaration);
		assertEquals("printLevel2", ((IMethodDeclaration)found).getName());
	}
	
	@Test
	public void testThatResourceCodeStoreContainsStatementSection() throws Exception {
		URL file = getResourceAsURL("debug/stack.pec");
		assertTrue(new File(file.getFile()).exists());
		ICodeStore store = new ResourceCodeStore(null, ModuleType.LIBRARY, file.toURI().toURL(),"1.0.0.0");
		Section section = new Section(file.toExternalForm(), new Location(0, 10, 1), new Location(0, 10, 20), Dialect.E, false);
		ISection found = store.findSection(section);
		assertNotNull(found);
		assertTrue(found instanceof IStatement);
	}
}
