package prompto.store.solr;

import java.io.File;
import java.io.IOException;

import org.junit.After;

public abstract class BaseSOLRTest {
	
	File root = new File("target/test-classes/solr-test");
	EmbeddedSOLRStore store;
	
	protected void createStore(String coreName) {
		store = new EmbeddedSOLRStore(root, coreName);
		store.startContainer();
	}
	
	@After
	public void after() throws IOException {
		store.shutdownServer();
		store.shutdownCore();
		store.shutdownContainer();
	}
	
	
}
