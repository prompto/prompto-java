package prompto.store.solr;

import java.io.File;

import org.junit.After;
import org.junit.Before;

public abstract class BaseSOLRTest {
	
	File root = new File("target/test-classes/solr-test");
	EmbeddedSOLRStore store = new EmbeddedSOLRStore(root);
			
	@Before
	public void startContainer() {
		store.startContainer();
	}
	
	protected void startServerWithEmptyCore(String coreName) throws Exception {
		store.startServerWithEmptyCore(coreName);
	}
	
	@After
	public void after() {
		store.shutdownServer();
		store.shutdownCore();
		store.shutdownContainer();
	}
	
	
}
