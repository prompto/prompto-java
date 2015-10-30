package prompto.server;

import static org.junit.Assert.*;

import org.junit.Test;

import prompto.store.IStore;
import prompto.store.IStoreFactory.Type;
import prompto.store.Version;
import prompto.store.solr.EmbeddedSOLRStore;
import prompto.store.solr.SOLRStoreFactory;
import prompto.type.BooleanType;
import prompto.type.DateTimeType;
import prompto.type.IntegerType;
import prompto.type.ListType;
import prompto.type.TextType;

public class TestSOLRBootstrap {
	
	@Test
	public void testCodeStoreColumns() throws Throwable {
		String[] args = {
				"-code-solr-embedded",
				"-code-solr-root",
				"target/test-classes/solr-test"
		};
		IStore codeStore = new SOLRStoreFactory().newStore(args, Type.CODE);
		((EmbeddedSOLRStore)codeStore).startContainer();
		((EmbeddedSOLRStore)codeStore).startServerWithEmptyCore(Type.CODE.name());
		AppServer.bootstrap(codeStore, null, "test", Version.parse("1.0.0"));
		assertEquals(codeStore.getDbIdType(), codeStore.getColumnType("dbId"));
		assertEquals(TextType.instance(), codeStore.getColumnType("author"));
		assertEquals(DateTimeType.instance(), codeStore.getColumnType("timeStamp"));
		assertEquals(TextType.instance(), codeStore.getColumnType("codeType"));
		assertEquals(TextType.instance(), codeStore.getColumnType("name"));
		assertEquals(BooleanType.instance(), codeStore.getColumnType("storable"));
		assertEquals(TextType.instance(), codeStore.getColumnType("version"));
		assertEquals(IntegerType.instance(), codeStore.getColumnType("__version__"));
		assertEquals(TextType.instance(), codeStore.getColumnType("prototype"));
		assertEquals(TextType.instance(), codeStore.getColumnType("codeFormat"));
		assertEquals(TextType.instance(), codeStore.getColumnType("codeBody"));
		assertEquals(new ListType(codeStore.getDbIdType()), codeStore.getColumnType("members"));
		assertEquals(TextType.instance(), codeStore.getColumnType("author"));
	}

}