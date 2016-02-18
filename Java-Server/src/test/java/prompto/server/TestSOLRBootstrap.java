package prompto.server;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.After;
import org.junit.Test;

import prompto.code.Version;
import prompto.store.IStore;
import prompto.store.IStoreFactory.Type;
import prompto.store.solr.EmbeddedSOLRStore;
import prompto.store.solr.SOLRStoreFactory;
import prompto.type.BooleanType;
import prompto.type.DateTimeType;
import prompto.type.ListType;
import prompto.type.TextType;

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
		assertEquals(DateTimeType.instance(), store.getColumnType("timeStamp"));
		assertEquals(new ListType(TextType.instance()), store.getColumnType("category"));
		assertEquals(TextType.instance(), store.getColumnType("name"));
		assertEquals(BooleanType.instance(), store.getColumnType("storable"));
		assertEquals(TextType.instance(), store.getColumnType("version"));
		assertEquals(TextType.instance(), store.getColumnType("prototype"));
		assertEquals(TextType.instance(), store.getColumnType("dialect"));
		assertEquals(TextType.instance(), store.getColumnType("body"));
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
		assertEquals(TextType.instance(), store.getColumnType("name"));
		assertEquals(TextType.instance(), store.getColumnType("version"));
		assertNull(AppServer.globalContext.findAttribute("prototype"));
	}
}
