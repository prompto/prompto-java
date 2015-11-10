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

import prompto.value.Blob;
import prompto.value.Image;

public class TestSchema extends BaseSOLRTest {

	@Before
	public void before() throws Exception {
		startServerWithEmptyCore("TestSchema");
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
		doc.addField("dbId", uuid);
		store.addDocument(doc);
		store.commit();
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
		store.addField("infos", "text", options);
		SolrInputDocument doc = new SolrInputDocument();
		doc.addField("dbId", UUID.randomUUID());
		doc.addField("infos", "sample");
		store.addDocument(doc);
		store.commit();
		// Test the basics
		SolrQuery query = new SolrQuery();
		query.setQuery("infos:sample");
		QueryResponse resp = store.query(query);
		assertNotNull(resp);
		assertEquals(1, resp.getResults().size());
	}
	
	@Test
	public void testStoreBlobField() throws SolrServerException, IOException {
		Map<String, Object> options = new HashMap<>();
		options.put("indexed", "true");
		options.put("stored", "true");
		store.addField("data", "blob", options);
		SolrInputDocument doc = new SolrInputDocument();
		doc.addField("dbId", UUID.randomUUID());
		Blob blob = new Blob("application/octet-stream","azertyuiop".getBytes());
		doc.addField("data", BinaryConverter.toBytes(blob));
		store.addDocument(doc);
		store.commit();
		// Test the basics
		SolrQuery query = new SolrQuery();
		query.setQuery("*:*");
		QueryResponse resp = store.query(query);
		assertNotNull(resp);
		assertEquals(1, resp.getResults().size());
		SolrDocument result = resp.getResults().get(0);
		assertNotNull(result);
		Object data = result.getFieldValue("data");
		data = BinaryConverter.toBinary(data);
		assertTrue(data instanceof Blob);
		blob = (Blob)data;
		assertEquals("application/octet-stream", blob.getMimeType());
		assertEquals("azertyuiop", new String(blob.getData()));
	}

	@Test
	public void testStoreImageField() throws SolrServerException, IOException {
		Map<String, Object> options = new HashMap<>();
		options.put("indexed", "true");
		options.put("stored", "true");
		store.addField("data", "image", options);
		SolrInputDocument doc = new SolrInputDocument();
		doc.addField("dbId", UUID.randomUUID());
		Image image = new Image("image/jpeg","JFIF".getBytes());
		doc.addField("data", BinaryConverter.toBytes(image));
		store.addDocument(doc);
		store.commit();
		// Test the basics
		SolrQuery query = new SolrQuery();
		query.setQuery("*:*");
		QueryResponse resp = store.query(query);
		assertNotNull(resp);
		assertEquals(1, resp.getResults().size());
		SolrDocument result = resp.getResults().get(0);
		assertNotNull(result);
		Object data = result.getFieldValue("data");
		data = BinaryConverter.toBinary(data);
		assertTrue(data instanceof Image);
		image = (Image)data;
		assertEquals("image/jpeg", image.getMimeType());
		assertEquals("JFIF", new String(image.getData()));
	}


	@Test
	public void testStoreVersionField() throws SolrServerException, IOException {
		Map<String, Object> options = new HashMap<>();
		options.put("indexed", true);
		options.put("stored", true);
		store.addField("version", "version", options);
		SolrInputDocument doc = new SolrInputDocument();
		doc.addField("dbId", UUID.randomUUID());
		doc.addField("version", "1.0.3");
		store.addDocument(doc);
		store.commit();
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
		store.addField("test", "version", options);
		String[] sorted = { "2.2.2", "2.2.10", "2.10.2", "10.2.2" }; 
		String[] reversed = { sorted[3], sorted[2], sorted[1], sorted[0] }; 
		String[] unsorted = { sorted[2], sorted[1], sorted[3], sorted[0] }; 
		for(String version : unsorted) {
			SolrInputDocument doc = new SolrInputDocument();
			doc.addField("dbId", UUID.randomUUID());
			doc.addField("test", version);
			store.addDocument(doc);
		}
		store.commit();
		// Test ascending sort
		SolrQuery query = new SolrQuery();
		query.setQuery("*:*");
		query.addSort("test", ORDER.asc);
		QueryResponse resp = store.query(query);
		assertEquals(sorted.length, resp.getResults().size());
		for(int i=0;i<sorted.length;i++) {
			SolrDocument result = resp.getResults().get(i);
			assertEquals(sorted[i], result.getFieldValue("test"));
		}
		// Test descending sort
		query = new SolrQuery();
		query.setQuery("*:*");
		query.addSort("test", ORDER.desc);
		resp = store.query(query);
		assertEquals(reversed.length, resp.getResults().size());
		for(int i=0; i<reversed.length;i++) {
			SolrDocument result = resp.getResults().get(i);
			assertEquals(reversed[i], result.getFieldValue("test"));
		}
	}
	
	@Test
	public void testStoreTimeField() throws SolrServerException, IOException {
		Map<String, Object> options = new HashMap<>();
		options.put("indexed", true);
		options.put("stored", true);
		store.addField("test", "time", options);
		SolrInputDocument doc = new SolrInputDocument();
		doc.addField("dbId", UUID.randomUUID());
		doc.addField("test", "13:02:17.4578");
		store.addDocument(doc);
		store.commit();
		// Test the basics
		SolrQuery query = new SolrQuery();
		query.setQuery("*:*");
		QueryResponse resp = store.query(query);
		assertNotNull(resp);
		assertEquals(1, resp.getResults().size());
		SolrDocument result = resp.getResults().get(0);
		assertNotNull(result);
		assertEquals("13:02:17.457800", result.getFieldValue("test"));
	}
	
	@Test
	public void testSortTimeField() throws SolrServerException, IOException {
		Map<String, Object> options = new HashMap<>();
		options.put("indexed", "true");
		options.put("stored", "true");
		store.addField("test", "time", options);
		String[] sorted = { "00:33:15", "12:43:15", "15:30:12", "18:43:16" }; 
		String[] reversed = { sorted[3], sorted[2], sorted[1], sorted[0] }; 
		String[] unsorted = { sorted[2], sorted[1], sorted[3], sorted[0] }; 
		for(String version : unsorted) {
			SolrInputDocument doc = new SolrInputDocument();
			doc.addField("dbId", UUID.randomUUID());
			doc.addField("test", version);
			store.addDocument(doc);
		}
		store.commit();
		// Test ascending sort
		SolrQuery query = new SolrQuery();
		query.setQuery("*:*");
		query.addSort("test", ORDER.asc);
		QueryResponse resp = store.query(query);
		assertEquals(sorted.length, resp.getResults().size());
		for(int i=0;i<sorted.length;i++) {
			SolrDocument result = resp.getResults().get(i);
			assertEquals(sorted[i], result.getFieldValue("test"));
		}
		// Test descending sort
		query = new SolrQuery();
		query.setQuery("*:*");
		query.addSort("test", ORDER.desc);
		resp = store.query(query);
		assertEquals(reversed.length, resp.getResults().size());
		for(int i=0; i<reversed.length;i++) {
			SolrDocument result = resp.getResults().get(i);
			assertEquals(reversed[i], result.getFieldValue("test"));
		}
	}

	@Test
	public void testStoreDateField() throws SolrServerException, IOException {
		Map<String, Object> options = new HashMap<>();
		options.put("indexed", true);
		options.put("stored", true);
		store.addField("test", "date", options);
		SolrInputDocument doc = new SolrInputDocument();
		doc.addField("dbId", UUID.randomUUID());
		doc.addField("test", "2015-10-22");
		store.addDocument(doc);
		store.commit();
		// Test the basics
		SolrQuery query = new SolrQuery();
		query.setQuery("*:*");
		QueryResponse resp = store.query(query);
		assertNotNull(resp);
		assertEquals(1, resp.getResults().size());
		SolrDocument result = resp.getResults().get(0);
		assertNotNull(result);
		assertEquals("2015-10-22", result.getFieldValue("test"));
	}
	
	@Test
	public void testSortDateField() throws SolrServerException, IOException {
		Map<String, Object> options = new HashMap<>();
		options.put("indexed", "true");
		options.put("stored", "true");
		store.addField("test", "date", options);
		String[] sorted = { "2010-02-12", "2013-08-17", "2222-12-12", "3333-01-01" }; 
		String[] reversed = { sorted[3], sorted[2], sorted[1], sorted[0] }; 
		String[] unsorted = { sorted[2], sorted[1], sorted[3], sorted[0] }; 
		for(String version : unsorted) {
			SolrInputDocument doc = new SolrInputDocument();
			doc.addField("dbId", UUID.randomUUID());
			doc.addField("test", version);
			store.addDocument(doc);
		}
		store.commit();
		// Test ascending sort
		SolrQuery query = new SolrQuery();
		query.setQuery("*:*");
		query.addSort("test", ORDER.asc);
		QueryResponse resp = store.query(query);
		assertEquals(sorted.length, resp.getResults().size());
		for(int i=0;i<sorted.length;i++) {
			SolrDocument result = resp.getResults().get(i);
			assertEquals(sorted[i], result.getFieldValue("test"));
		}
		// Test descending sort
		query = new SolrQuery();
		query.setQuery("*:*");
		query.addSort("test", ORDER.desc);
		resp = store.query(query);
		assertEquals(reversed.length, resp.getResults().size());
		for(int i=0; i<reversed.length;i++) {
			SolrDocument result = resp.getResults().get(i);
			assertEquals(reversed[i], result.getFieldValue("test"));
		}
	}

	@Test
	public void testStoreDateTimeField() throws SolrServerException, IOException {
		Map<String, Object> options = new HashMap<>();
		options.put("indexed", true);
		options.put("stored", true);
		store.addField("test", "datetime", options);
		SolrInputDocument doc = new SolrInputDocument();
		doc.addField("dbId", UUID.randomUUID());
		doc.addField("test", "2015-10-22T15:02:17Z");
		store.addDocument(doc);
		store.commit();
		// Test the basics
		SolrQuery query = new SolrQuery();
		query.setQuery("*:*");
		QueryResponse resp = store.query(query);
		assertNotNull(resp);
		assertEquals(1, resp.getResults().size());
		SolrDocument result = resp.getResults().get(0);
		assertNotNull(result);
		assertEquals("2015-10-22T15:02:17Z", result.getFieldValue("test"));
	}
	
	@Test
	public void testSortDateTimeFieldUTC() throws SolrServerException, IOException {
		Map<String, Object> options = new HashMap<>();
		options.put("indexed", "true");
		options.put("stored", "true");
		store.addField("test", "datetime", options);
		String[] sorted = { "2013-08-17T15:02:17Z", "2015-10-22T15:02:17Z", "2222-12-12T15:02:17Z", "3333-01-01T15:02:17Z" }; 
		String[] reversed = { sorted[3], sorted[2], sorted[1], sorted[0] }; 
		String[] unsorted = { sorted[2], sorted[1], sorted[3], sorted[0] }; 
		for(String version : unsorted) {
			SolrInputDocument doc = new SolrInputDocument();
			doc.addField("dbId", UUID.randomUUID());
			doc.addField("test", version);
			store.addDocument(doc);
		}
		store.commit();
		// Test ascending sort
		SolrQuery query = new SolrQuery();
		query.setQuery("*:*");
		query.addSort("test", ORDER.asc);
		QueryResponse resp = store.query(query);
		assertEquals(sorted.length, resp.getResults().size());
		for(int i=0;i<sorted.length;i++) {
			SolrDocument result = resp.getResults().get(i);
			assertEquals(sorted[i], result.getFieldValue("test"));
		}
		// Test descending sort
		query = new SolrQuery();
		query.setQuery("*:*");
		query.addSort("test", ORDER.desc);
		resp = store.query(query);
		assertEquals(reversed.length, resp.getResults().size());
		for(int i=0; i<reversed.length;i++) {
			SolrDocument result = resp.getResults().get(i);
			assertEquals(reversed[i], result.getFieldValue("test"));
		}
	}

	@Test
	public void testSortDateTimeFieldMulti() throws SolrServerException, IOException {
		Map<String, Object> options = new HashMap<>();
		options.put("indexed", "true");
		options.put("stored", "true");
		store.addField("test", "datetime", options);
		String[] sorted = { "2013-08-17T15:02:17+01:00", "2013-08-17T15:02:17Z", "2013-08-17T15:02:17-01:00", "2013-08-17T17:02:18+01:00" }; 
		String[] reversed = { sorted[3], sorted[2], sorted[1], sorted[0] }; 
		String[] unsorted = { sorted[2], sorted[1], sorted[3], sorted[0] }; 
		for(String version : unsorted) {
			SolrInputDocument doc = new SolrInputDocument();
			doc.addField("dbId", UUID.randomUUID());
			doc.addField("test", version);
			store.addDocument(doc);
		}
		store.commit();
		// Test ascending sort
		SolrQuery query = new SolrQuery();
		query.setQuery("*:*");
		query.addSort("test", ORDER.asc);
		QueryResponse resp = store.query(query);
		assertEquals(sorted.length, resp.getResults().size());
		for(int i=0;i<sorted.length;i++) {
			SolrDocument result = resp.getResults().get(i);
			assertEquals(sorted[i], result.getFieldValue("test"));
		}
		// Test descending sort
		query = new SolrQuery();
		query.setQuery("*:*");
		query.addSort("test", ORDER.desc);
		resp = store.query(query);
		assertEquals(reversed.length, resp.getResults().size());
		for(int i=0; i<reversed.length;i++) {
			SolrDocument result = resp.getResults().get(i);
			assertEquals(reversed[i], result.getFieldValue("test"));
		}
	}

}
