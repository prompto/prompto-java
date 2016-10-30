package prompto.server;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.After;
import org.junit.Test;

import prompto.code.Version;
import prompto.store.Family;
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
		AppServer.bootstrapCodeStore(store, "test", Version.parse("1.0.0"), true);
		assertEquals(Family.UUID, store.getColumnTypeFamily(IStore.dbIdName));
		assertEquals(Family.DATETIME, store.getColumnTypeFamily("timeStamp"));
		assertEquals(Family.TEXT, store.getColumnTypeFamily("category"));
		assertEquals(Family.TEXT, store.getColumnTypeFamily("name"));
		assertEquals(Family.BOOLEAN, store.getColumnTypeFamily("storable"));
		assertEquals(Family.TEXT, store.getColumnTypeFamily("version"));
		assertEquals(Family.TEXT, store.getColumnTypeFamily("prototype"));
		assertEquals(Family.TEXT, store.getColumnTypeFamily("dialect"));
		assertEquals(Family.TEXT, store.getColumnTypeFamily("body"));
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
		AppServer.bootstrapCodeStore(store, "test", Version.parse("1.0.0"), true);
		assertEquals(Family.UUID, store.getColumnTypeFamily(IStore.dbIdName));
		assertEquals(Family.TEXT, store.getColumnTypeFamily("name"));
		assertEquals(Family.TEXT, store.getColumnTypeFamily("version"));
		assertNull(AppServer.globalContext.findAttribute("prototype"));
	}
}
