package prompto.server;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.After;
import org.junit.Test;

import prompto.code.Version;
import prompto.intrinsic.PromptoDateTime;
import prompto.intrinsic.PromptoList;
import prompto.store.IStore;
import prompto.store.IStoreFactory.Type;
import prompto.store.solr.EmbeddedSOLRStore;
import prompto.store.solr.SOLRStoreFactory;

public class TestSOLRBootstrap {
	
	EmbeddedSOLRStore store;
	
	@After
	public void after() throws IOException {
		store.shutdownServer();
		store.shutdownCore();
		store.shutdownContainer();
	}

	@Test
	public void testCodeStoreColumns() throws Throwable {
		String[] args = {
				"-solr-code-embedded",
				"-solr-code-root",
				"target/test-classes/solr-test"
		};
		store = (EmbeddedSOLRStore)new SOLRStoreFactory().newStore(args, Type.CODE);
		((EmbeddedSOLRStore)store).startContainer();
		((EmbeddedSOLRStore)store).startServerWithEmptyCore();
		AppServer.bootstrapCodeStore(store, "test", Version.parse("1.0.0"));
		assertEquals(store.getDbIdType(), store.getColumnType(IStore.dbIdName));
		assertEquals(PromptoDateTime.class, store.getColumnType("timeStamp"));
		assertEquals(PromptoList.class, store.getColumnType("category"));
		assertEquals(String.class, store.getColumnType("name"));
		assertEquals(Boolean.class, store.getColumnType("storable"));
		assertEquals(String.class, store.getColumnType("version"));
		assertEquals(String.class, store.getColumnType("prototype"));
		assertEquals(String.class, store.getColumnType("dialect"));
		assertEquals(String.class, store.getColumnType("body"));
	}
	
	@Test
	public void testCodeStoreIsolation() throws Throwable {
		String[] args = {
				"-solr-code-embedded",
				"-solr-code-root",
				"target/test-classes/solr-test"
		};
		store = (EmbeddedSOLRStore)new SOLRStoreFactory().newStore(args, Type.CODE);
		store.startContainer();
		store.startServerWithEmptyCore();
		AppServer.bootstrapCodeStore(store, "test", Version.parse("1.0.0"));
		assertEquals(store.getDbIdType(), store.getColumnType(IStore.dbIdName));
		assertEquals(String.class, store.getColumnType("name"));
		assertEquals(String.class, store.getColumnType("version"));
		assertNull(AppServer.globalContext.findAttribute("prototype"));
	}
}
