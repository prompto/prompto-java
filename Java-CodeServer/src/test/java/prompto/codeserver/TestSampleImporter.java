package prompto.codeserver;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import prompto.code.ICodeStore;
import prompto.code.Version;
import prompto.server.AppServer;
import prompto.store.MemStore;

public class TestSampleImporter {

	@Before
	public void before() throws Exception {
		AppServer.bootstrapCodeStore(new MemStore(), "test", Version.parse("1.0.0"));

	}
	
	@Test
	public void testChat() throws Exception {
		SampleImporter importer = new SampleImporter("samples/Chat/");
		importer.importSample(ICodeStore.getInstance());
		assertNotNull(importer.application);
		assertNotNull(importer.application.getDbId());
	}

	@Test
	public void testMail() throws Exception {
		SampleImporter importer = new SampleImporter("samples/Mail/");
		importer.importSample(ICodeStore.getInstance());
		assertNotNull(importer.application);
		assertNotNull(importer.application.getDbId());
	}

	@Test
	public void testSoup() throws Exception {
		SampleImporter importer = new SampleImporter("samples/Soup/");
		importer.importSample(ICodeStore.getInstance());
		assertNotNull(importer.application);
		assertNotNull(importer.application.getDbId());
	}

	@Test
	public void testMyApp() throws Exception {
		SampleImporter importer = new SampleImporter("samples/MyApp/");
		importer.importSample(ICodeStore.getInstance());
		assertNotNull(importer.application);
		assertNotNull(importer.application.getDbId());
	}
}
