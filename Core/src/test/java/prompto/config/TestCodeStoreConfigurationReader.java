package prompto.config;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import prompto.intrinsic.PromptoDbId;
import prompto.store.IStorable;
import prompto.store.IStorable.IDbIdFactory;
import prompto.store.memory.MemStore;


public class TestCodeStoreConfigurationReader {

	MemStore store;
	PromptoDbId dbId;
	
	@Before
	public void before() {
		store = new MemStore();
		IStorable doc = store.newStorable(Collections.singletonList("config"), IDbIdFactory.of(null, dbId -> this.dbId=dbId, null));
		doc.setData("string", "some string");
		doc.setData("empty", null);
		doc.setData("boolean", true);
		doc.setData("integer", 23456);
		doc.setData("array", Arrays.asList("abc", "def"));
		// child record ref
		IStorable child = store.newStorable(Collections.singletonList("child"), IDbIdFactory.of(null, dbId -> doc.setData("ref", dbId.getValue()), null));
		child.setData("string", "some string");
		child.setData("integer", 23456);
		child.setData("array", Arrays.asList("abc", "def"));
		store.store(child);	
		// array record refs
		List<Object> children = new ArrayList<>();
		child = store.newStorable(Collections.singletonList("child"), IDbIdFactory.of(null, dbId -> children.add(dbId.getValue()), null));
		child.setData("key", "abc");
		child.setData("value", "def");
		store.store(child);	
		child = store.newStorable(Collections.singletonList("child"), IDbIdFactory.of(null, dbId -> children.add(dbId.getValue()), null));
		child.setData("key", "abcd");
		child.setData("value", "defg");
		store.store(child);	
		doc.setData("objectsArray", children);
		store.store(doc);
	}
	
	
	@Test
	public void readerReadsStrings() throws Exception  {
		IConfigurationReader reader = new StoredRecordConfigurationReader(store, dbId);
		assertEquals("some string", reader.getString("string"));
	}
	
	
	@Test
	public void readerReadsNull() throws IOException  {
		IConfigurationReader reader = new StoredRecordConfigurationReader(store, dbId);
		assertNull(reader.getString("empty"));
	}
	
	@Test
	public void readerReadsBoolean() throws IOException  {
		IConfigurationReader reader = new StoredRecordConfigurationReader(store, dbId);
		assertTrue(reader.getBoolean("boolean"));
	}

	
	@Test
	public void readerReadsInteger() throws IOException  {
		IConfigurationReader reader = new StoredRecordConfigurationReader(store, dbId);
		assertEquals(23456, reader.getInteger("integer").intValue());
	}

	
	@Test
	public void readerReadsArray() throws IOException  {
		IConfigurationReader reader = new StoredRecordConfigurationReader(store, dbId);
		assertEquals(Arrays.asList("abc", "def"), reader.getArray("array"));
	}

	
	@Test
	public void readerReadsRefObject() throws IOException  {
		IConfigurationReader reader = new StoredRecordConfigurationReader(store, dbId);
		IConfigurationReader child = reader.getObject("ref");
		assertEquals("some string", child.getString("string"));
		assertEquals(23456, child.getInteger("integer").intValue());
		assertEquals(Arrays.asList("abc", "def"), child.getArray("array"));
	}
	
	@Test
	public void readerReadsObjectsArray() throws IOException  {
		IConfigurationReader reader = new StoredRecordConfigurationReader(store, dbId);
		Collection<? extends IConfigurationReader> list = reader.getObjectsArray("objectsArray");
		assertEquals(2, list.size());
		IConfigurationReader item = list.iterator().next();
		assertEquals("abc", item.getString("key"));
		assertEquals("def", item.getString("value"));
	}
}
