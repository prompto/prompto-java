package prompto.store.solr;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrInputDocument;
import org.apache.solr.common.params.ModifiableSolrParams;
import org.junit.Before;
import org.junit.Test;

public class TestSchema extends BaseSOLRTest {

	@Before
	public void before() throws Exception {
		startServerWithEmptyCore("TestSchema");
	}
	
	@Test
	public void testEmptyCore() throws SolrServerException {
		// Test the basics
		ModifiableSolrParams params = new ModifiableSolrParams();
		params.set("q", "_version_:0");
		QueryResponse resp = store.query(params);
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
		ModifiableSolrParams params = new ModifiableSolrParams();
		params.set("q", "dbId:" + uuid.toString());
		QueryResponse queresp = store.query(params);
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
		ModifiableSolrParams params = new ModifiableSolrParams();
		params.set("q", "infos:sample");
		QueryResponse resp = store.query(params);
		assertNotNull(resp);
		assertEquals(1, resp.getResults().size());
	}
}
