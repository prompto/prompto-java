package prompto.store.solr;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrQuery.ORDER;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrInputDocument;
import org.junit.Before;
import org.junit.Test;

import prompto.store.IStore;
import prompto.value.BinaryValue;
import prompto.value.Blob;
import prompto.value.Image;

public class TestSchema extends BaseSOLRTest {

	@Before
	public void before() throws Exception {
		createStore("TestSchema");
		store.startServerWithEmptyCore();
	}
	
	@Test
	public void testEmptyCore() throws SolrServerException, IOException {
		// Test the basics
		SolrQuery query = new SolrQuery();
		query.addFilterQuery("_version_:0");
		QueryResponse resp = store.query(query);
		assertNotNull(resp);
		assertTrue(resp.getResults().isEmpty());
	}

	@Test
	public void testNonEmptyCore() throws SolrServerException, IOException {
		UUID uuid = UUID.randomUUID();
		SolrInputDocument doc = new SolrInputDocument();
		doc.addField(IStore.dbIdName, uuid);
		store.addDocuments(doc);
		store.flush();
		// Test the basics
		SolrQuery query = new SolrQuery();
		query.setQuery("dbId:" + uuid.toString());
		QueryResponse queresp = store.query(query);
		assertNotNull(queresp);
		assertEquals(1, queresp.getResults().size());
	}
	
	@Test
	public void testAddField() throws SolrServerException, IOException {
		Map<String, Object> options = new HashMap<>();
		options.put("indexed", true);
		options.put("stored", true);
		store.addField("text", "text-key", options);
		SolrInputDocument doc = new SolrInputDocument();
		doc.addField(IStore.dbIdName, UUID.randomUUID());
		doc.addField("text", "sample");
		store.addDocuments(doc);
		store.flush();
		// Test the basics
		SolrQuery query = new SolrQuery();
		query.setQuery("text:sample");
		QueryResponse resp = store.query(query);
		assertNotNull(resp);
		assertEquals(1, resp.getResults().size());
	}
	
	@Test
	public void testCopyField() throws SolrServerException, IOException {
		Map<String, Object> options = new HashMap<>();
		options.put("indexed", true);
		options.put("stored", true);
		store.addField("text-key", "text-key", options);
		options = new HashMap<>();
		options.put("indexed", true);
		options.put("stored", false);
		store.addCopyField("text-value", "text-value", options, "text-key");
		SolrInputDocument doc = new SolrInputDocument();
		doc.addField(IStore.dbIdName, UUID.randomUUID());
		doc.addField("text-key", "Sample");
		store.addDocuments(doc);
		store.flush();
		// Test the basics
		SolrQuery query = new SolrQuery();
		query.setQuery("text-key:Sample");
		QueryResponse resp = store.query(query);
		assertNotNull(resp);
		assertEquals(1, resp.getResults().size());
		query = new SolrQuery();
		query.setQuery("text-key:sample");
		resp = store.query(query);
		assertNotNull(resp);
		assertEquals(0, resp.getResults().size());
		query = new SolrQuery();
		query.setQuery("text-value:Sample");
		resp = store.query(query);
		assertNotNull(resp);
		assertEquals(1, resp.getResults().size());
		query = new SolrQuery();
		query.setQuery("text-value:sample");
		resp = store.query(query);
		assertNotNull(resp);
		assertEquals(1, resp.getResults().size());
	}

	@Test
	public void testStoreBlobField() throws SolrServerException, IOException {
		Map<String, Object> options = new HashMap<>();
		options.put("indexed", "true");
		options.put("stored", "true");
		store.addField("blob", "blob", options);
		StorableDocument doc = new StorableDocument(null, null);
		doc.setData(IStore.dbIdName, UUID.randomUUID());
		Blob blob = new Blob("application/octet-stream","azertyuiop".getBytes());
		doc.setData("blob", blob.getData());
		store.addDocuments(doc.getDocument());
		store.flush();
		// Test the basics
		SolrQuery query = new SolrQuery();
		query.setQuery("*:*");
		QueryResponse resp = store.query(query);
		assertNotNull(resp);
		assertEquals(1, resp.getResults().size());
		SolrDocument result = resp.getResults().get(0);
		assertNotNull(result);
		Object data = result.getFieldValue("blob");
		data = BinaryValue.newInstance(BinaryConverter.toPromptoBinary(data));
		assertTrue(data instanceof Blob);
		blob = (Blob)data;
		assertEquals("application/octet-stream", blob.getMimeType());
		assertEquals("azertyuiop", new String(blob.getBytes()));
	}

	@Test
	public void testStoreImageField() throws SolrServerException, IOException {
		Map<String, Object> options = new HashMap<>();
		options.put("indexed", "true");
		options.put("stored", "true");
		store.addField("image", "image", options);
		StorableDocument doc = new StorableDocument(null, null);
		doc.setData(IStore.dbIdName, UUID.randomUUID());
		Image image = new Image("image/jpeg","JFIF".getBytes());
		doc.setData("image", image.getData());
		store.addDocuments(doc.getDocument());
		store.flush();
		// Test the basics
		SolrQuery query = new SolrQuery();
		query.setQuery("*:*");
		QueryResponse resp = store.query(query);
		assertNotNull(resp);
		assertEquals(1, resp.getResults().size());
		SolrDocument result = resp.getResults().get(0);
		assertNotNull(result);
		Object data = result.getFieldValue("image");
		data = BinaryValue.newInstance(BinaryConverter.toPromptoBinary(data));
		assertTrue(data instanceof Image);
		image = (Image)data;
		assertEquals("image/jpeg", image.getMimeType());
		assertEquals("JFIF", new String(image.getBytes()));
	}


	@Test
	public void testStoreVersionField() throws SolrServerException, IOException {
		Map<String, Object> options = new HashMap<>();
		options.put("indexed", true);
		options.put("stored", true);
		store.addField("version", "version", options);
		SolrInputDocument doc = new SolrInputDocument();
		doc.addField(IStore.dbIdName, UUID.randomUUID());
		doc.addField("version", "1.0.3");
		store.addDocuments(doc);
		store.flush();
		// Test the basics
		SolrQuery query = new SolrQuery();
		query.setQuery("*:*");
		QueryResponse resp = store.query(query);
		assertNotNull(resp);
		assertEquals(1, resp.getResults().size());
		SolrDocument result = resp.getResults().get(0);
		assertNotNull(result);
		assertEquals("1.0.3", result.getFieldValue("version"));
	}

	@Test
	public void testSortVersionField() throws SolrServerException, IOException {
		Map<String, Object> options = new HashMap<>();
		options.put("indexed", "true");
		options.put("stored", "true");
		store.addField("version", "version", options);
		String[] sorted = { "2.2.2", "2.2.10", "2.10.2", "10.2.2" }; 
		String[] reversed = { sorted[3], sorted[2], sorted[1], sorted[0] }; 
		String[] unsorted = { sorted[2], sorted[1], sorted[3], sorted[0] }; 
		for(String version : unsorted) {
			SolrInputDocument doc = new SolrInputDocument();
			doc.addField(IStore.dbIdName, UUID.randomUUID());
			doc.addField("version", version);
			store.addDocuments(doc);
		}
		store.flush();
		// Test ascending sort
		SolrQuery query = new SolrQuery();
		query.setQuery("*:*");
		query.addSort("version", ORDER.asc);
		QueryResponse resp = store.query(query);
		assertEquals(sorted.length, resp.getResults().size());
		for(int i=0;i<sorted.length;i++) {
			SolrDocument result = resp.getResults().get(i);
			assertEquals(sorted[i], result.getFieldValue("version"));
		}
		// Test descending sort
		query = new SolrQuery();
		query.setQuery("*:*");
		query.addSort("version", ORDER.desc);
		resp = store.query(query);
		assertEquals(reversed.length, resp.getResults().size());
		for(int i=0; i<reversed.length;i++) {
			SolrDocument result = resp.getResults().get(i);
			assertEquals(reversed[i], result.getFieldValue("version"));
		}
	}
	
	@Test
	public void testStoreTimeField() throws SolrServerException, IOException {
		Map<String, Object> options = new HashMap<>();
		options.put("indexed", true);
		options.put("stored", true);
		store.addField("time", "time", options);
		SolrInputDocument doc = new SolrInputDocument();
		doc.addField(IStore.dbIdName, UUID.randomUUID());
		doc.addField("time", "13:02:17.4578");
		store.addDocuments(doc);
		store.flush();
		// Test the basics
		SolrQuery query = new SolrQuery();
		query.setQuery("*:*");
		QueryResponse resp = store.query(query);
		assertNotNull(resp);
		assertEquals(1, resp.getResults().size());
		SolrDocument result = resp.getResults().get(0);
		assertNotNull(result);
		assertEquals("13:02:17.457800", result.getFieldValue("time"));
	}
	
	@Test
	public void testSortTimeField() throws SolrServerException, IOException {
		Map<String, Object> options = new HashMap<>();
		options.put("indexed", "true");
		options.put("stored", "true");
		store.addField("time", "time", options);
		String[] sorted = { "00:33:15", "12:43:15", "15:30:12", "18:43:16" }; 
		String[] reversed = { sorted[3], sorted[2], sorted[1], sorted[0] }; 
		String[] unsorted = { sorted[2], sorted[1], sorted[3], sorted[0] }; 
		for(String time : unsorted) {
			SolrInputDocument doc = new SolrInputDocument();
			doc.addField(IStore.dbIdName, UUID.randomUUID());
			doc.addField("time", time);
			store.addDocuments(doc);
		}
		store.flush();
		// Test ascending sort
		SolrQuery query = new SolrQuery();
		query.setQuery("*:*");
		query.addSort("time", ORDER.asc);
		QueryResponse resp = store.query(query);
		assertEquals(sorted.length, resp.getResults().size());
		for(int i=0;i<sorted.length;i++) {
			SolrDocument result = resp.getResults().get(i);
			assertEquals(sorted[i], result.getFieldValue("time"));
		}
		// Test descending sort
		query = new SolrQuery();
		query.setQuery("*:*");
		query.addSort("time", ORDER.desc);
		resp = store.query(query);
		assertEquals(reversed.length, resp.getResults().size());
		for(int i=0; i<reversed.length;i++) {
			SolrDocument result = resp.getResults().get(i);
			assertEquals(reversed[i], result.getFieldValue("time"));
		}
	}

	@Test
	public void testStoreDateField() throws SolrServerException, IOException {
		Map<String, Object> options = new HashMap<>();
		options.put("indexed", true);
		options.put("stored", true);
		store.addField("date", "date", options);
		SolrInputDocument doc = new SolrInputDocument();
		doc.addField(IStore.dbIdName, UUID.randomUUID());
		doc.addField("date", "2015-10-22");
		store.addDocuments(doc);
		store.flush();
		// Test the basics
		SolrQuery query = new SolrQuery();
		query.setQuery("*:*");
		QueryResponse resp = store.query(query);
		assertNotNull(resp);
		assertEquals(1, resp.getResults().size());
		SolrDocument result = resp.getResults().get(0);
		assertNotNull(result);
		assertEquals("2015-10-22", result.getFieldValue("date"));
	}
	
	@Test
	public void testSortDateField() throws SolrServerException, IOException {
		Map<String, Object> options = new HashMap<>();
		options.put("indexed", "true");
		options.put("stored", "true");
		store.addField("date", "date", options);
		String[] sorted = { "2010-02-12", "2013-08-17", "2222-12-12", "3333-01-01" }; 
		String[] reversed = { sorted[3], sorted[2], sorted[1], sorted[0] }; 
		String[] unsorted = { sorted[2], sorted[1], sorted[3], sorted[0] }; 
		for(String date : unsorted) {
			SolrInputDocument doc = new SolrInputDocument();
			doc.addField(IStore.dbIdName, UUID.randomUUID());
			doc.addField("date", date);
			store.addDocuments(doc);
		}
		store.flush();
		// Test ascending sort
		SolrQuery query = new SolrQuery();
		query.setQuery("*:*");
		query.addSort("date", ORDER.asc);
		QueryResponse resp = store.query(query);
		assertEquals(sorted.length, resp.getResults().size());
		for(int i=0;i<sorted.length;i++) {
			SolrDocument result = resp.getResults().get(i);
			assertEquals(sorted[i], result.getFieldValue("date"));
		}
		// Test descending sort
		query = new SolrQuery();
		query.setQuery("*:*");
		query.addSort("date", ORDER.desc);
		resp = store.query(query);
		assertEquals(reversed.length, resp.getResults().size());
		for(int i=0; i<reversed.length;i++) {
			SolrDocument result = resp.getResults().get(i);
			assertEquals(reversed[i], result.getFieldValue("date"));
		}
	}

	@Test
	public void testStoreDateTimeField() throws SolrServerException, IOException {
		Map<String, Object> options = new HashMap<>();
		options.put("indexed", true);
		options.put("stored", true);
		store.addField("datetime", "datetime", options);
		SolrInputDocument doc = new SolrInputDocument();
		doc.addField(IStore.dbIdName, UUID.randomUUID());
		doc.addField("datetime", "2015-10-22T15:02:17Z");
		store.addDocuments(doc);
		store.flush();
		// Test the basics
		SolrQuery query = new SolrQuery();
		query.setQuery("*:*");
		QueryResponse resp = store.query(query);
		assertNotNull(resp);
		assertEquals(1, resp.getResults().size());
		SolrDocument result = resp.getResults().get(0);
		assertNotNull(result);
		assertEquals("2015-10-22T15:02:17Z", result.getFieldValue("datetime"));
	}
	
	@Test
	public void testSortDateTimeFieldUTC() throws SolrServerException, IOException {
		Map<String, Object> options = new HashMap<>();
		options.put("indexed", "true");
		options.put("stored", "true");
		store.addField("datetime", "datetime", options);
		String[] sorted = { "2013-08-17T15:02:17Z", "2015-10-22T15:02:17Z", "2222-12-12T15:02:17Z", "3333-01-01T15:02:17Z" }; 
		String[] reversed = { sorted[3], sorted[2], sorted[1], sorted[0] }; 
		String[] unsorted = { sorted[2], sorted[1], sorted[3], sorted[0] }; 
		for(String datetime : unsorted) {
			SolrInputDocument doc = new SolrInputDocument();
			doc.addField(IStore.dbIdName, UUID.randomUUID());
			doc.addField("datetime", datetime);
			store.addDocuments(doc);
		}
		store.flush();
		// Test ascending sort
		SolrQuery query = new SolrQuery();
		query.setQuery("*:*");
		query.addSort("datetime", ORDER.asc);
		QueryResponse resp = store.query(query);
		assertEquals(sorted.length, resp.getResults().size());
		for(int i=0;i<sorted.length;i++) {
			SolrDocument result = resp.getResults().get(i);
			assertEquals(sorted[i], result.getFieldValue("datetime"));
		}
		// Test descending sort
		query = new SolrQuery();
		query.setQuery("*:*");
		query.addSort("datetime", ORDER.desc);
		resp = store.query(query);
		assertEquals(reversed.length, resp.getResults().size());
		for(int i=0; i<reversed.length;i++) {
			SolrDocument result = resp.getResults().get(i);
			assertEquals(reversed[i], result.getFieldValue("datetime"));
		}
	}

	@Test
	public void testSortDateTimeFieldMulti() throws SolrServerException, IOException {
		Map<String, Object> options = new HashMap<>();
		options.put("indexed", "true");
		options.put("stored", "true");
		store.addField("datetime", "datetime", options);
		String[] sorted = { "2013-08-17T15:02:17+01:00", "2013-08-17T15:02:17Z", "2013-08-17T15:02:17-01:00", "2013-08-17T17:02:18+01:00" }; 
		String[] reversed = { sorted[3], sorted[2], sorted[1], sorted[0] }; 
		String[] unsorted = { sorted[2], sorted[1], sorted[3], sorted[0] }; 
		for(String datetime : unsorted) {
			SolrInputDocument doc = new SolrInputDocument();
			doc.addField(IStore.dbIdName, UUID.randomUUID());
			doc.addField("datetime", datetime);
			store.addDocuments(doc);
		}
		store.flush();
		// Test ascending sort
		SolrQuery query = new SolrQuery();
		query.setQuery("*:*");
		query.addSort("datetime", ORDER.asc);
		QueryResponse resp = store.query(query);
		assertEquals(sorted.length, resp.getResults().size());
		for(int i=0;i<sorted.length;i++) {
			SolrDocument result = resp.getResults().get(i);
			assertEquals(sorted[i], result.getFieldValue("datetime"));
		}
		// Test descending sort
		query = new SolrQuery();
		query.setQuery("*:*");
		query.addSort("datetime", ORDER.desc);
		resp = store.query(query);
		assertEquals(reversed.length, resp.getResults().size());
		for(int i=0; i<reversed.length;i++) {
			SolrDocument result = resp.getResults().get(i);
			assertEquals(reversed[i], result.getFieldValue("datetime"));
		}
	}

}
