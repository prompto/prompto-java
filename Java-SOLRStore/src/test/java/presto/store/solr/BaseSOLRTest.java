package presto.store.solr;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.apache.solr.client.solrj.embedded.EmbeddedSolrServer;
import org.apache.solr.core.CoreContainer;
import org.apache.solr.core.CoreDescriptor;
import org.junit.After;
import org.junit.Before;

public class BaseSOLRTest {
	
	File solrRoot = new File("target/test-classes/solr-test");
	CoreContainer container;
	EmbeddedSolrServer server;
			
	@Before
	public void startContainer() {
		if(container==null) {
			CoreContainer container = new CoreContainer(solrRoot.getAbsolutePath());
			container.load();
			this.container = container;
		}
	}
	
	protected void startServerWithEmptyCore(String coreName) throws Exception {
		if(server==null) {
			File coreDir = new File(solrRoot, coreName);
			if(coreDir.exists())
				delete(coreDir);
			File confDir = new File(coreDir, "conf");
			confDir.mkdir();
			copyResourceToFile("solr/solrconfig.xml", new File(confDir, "solrconfig.xml"));
			copyResourceToFile("solr/emptyschema.xml", new File(confDir, "schema.xml"));
			copyResourceToFile("solr/stopwords.txt", new File(confDir, "stopwords.txt"));
			CoreDescriptor core = new CoreDescriptor(container, coreName, coreDir.getAbsolutePath());
			container.create(core);
			server = new EmbeddedSolrServer(container, coreName);
		}
	}
	
	private void delete(File file) {
		if(!file.exists())
			return;
		if(file.isDirectory()) for(String name : file.list())
			delete(new File(file, name));
		file.delete();
	}

	private void copyResourceToFile(String resourcePath, File destination) throws IOException {
		URL inputUrl = Thread.currentThread().getContextClassLoader().getResource(resourcePath);
		FileUtils.copyURLToFile(inputUrl, destination);	
	}

	@After
	public void shutdownServer() {
		if(server!=null) {
			server.shutdown();
			server = null;
		}
	}
	
	@After
	public void shutdownContainer() {
		if(container!=null) {
			container.shutdown();
			container = null;
		}
	}
	
}
