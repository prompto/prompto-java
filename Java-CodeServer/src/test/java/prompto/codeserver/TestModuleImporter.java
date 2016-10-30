package prompto.codeserver;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import prompto.code.ICodeStore;
import prompto.code.Version;
import prompto.memstore.MemStore;
import prompto.server.AppServer;

public class TestModuleImporter {

	@Before
	public void before() throws Exception {
		AppServer.bootstrapCodeStore(new MemStore(), "test", Version.parse("1.0.0"), true);

	}
	
	@Test
	public void testSales() throws Exception {
		ModuleImporter importer = new ModuleImporter("samples/Sales/");
		importer.importModule(ICodeStore.getInstance());
		assertNotNull(importer.module);
		assertNotNull(importer.module.getDbId());
	}

	@Test
	public void testInventory() throws Exception {
		ModuleImporter importer = new ModuleImporter("samples/Inventory/");
		importer.importModule(ICodeStore.getInstance());
		assertNotNull(importer.module);
		assertNotNull(importer.module.getDbId());
	}

	@Test
	public void testSoup() throws Exception {
		ModuleImporter importer = new ModuleImporter("samples/Soup/");
		importer.importModule(ICodeStore.getInstance());
		assertNotNull(importer.module);
		assertNotNull(importer.module.getDbId());
	}

	@Test
	public void testMyApp() throws Exception {
		ModuleImporter importer = new ModuleImporter("samples/MyApp/");
		importer.importModule(ICodeStore.getInstance());
		assertNotNull(importer.module);
		assertNotNull(importer.module.getDbId());
	}
	
	@Test
	public void testThesaurus() throws Exception {
		ModuleImporter importer = new ModuleImporter("thesaurus/");
		importer.importModule(ICodeStore.getInstance());
		assertNotNull(importer.module);
		assertNotNull(importer.module.getDbId());
	}
}
