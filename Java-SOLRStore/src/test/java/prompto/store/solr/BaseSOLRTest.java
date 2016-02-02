package prompto.store.solr;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

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
	
	protected void createField(String name, String type, boolean multi) {
		Map<String, Object> options = new HashMap<>();
		options.put("indexed", !"text".equals(type));
		options.put("stored", true);
		options.put("multiValued", multi);
		store.addField(name, type, options);
		if("text".equals(type)) {
			options = new HashMap<>(options);
			options.put("indexed", true);
			options.put("stored", false);
			store.addCopyField(name + "-key", type + "-key", options, name);
			store.addCopyField(name + "-value", type + "-value", options, name);
		}
	}


	
}
