package presto.store.solr;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrInputDocument;
import org.apache.solr.common.params.ModifiableSolrParams;
import org.apache.solr.schema.IndexSchema;
import org.apache.solr.schema.SchemaField;
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
		params.set("q", "search some text");
		QueryResponse resp = server.query(params);
		assertNotNull(resp);
		assertTrue(resp.getResults().isEmpty());
	}

	@Test
	public void testNonEmptyCore() throws SolrServerException, IOException {
		SolrInputDocument doc = new SolrInputDocument();
		doc.addField("dbId", UUID.randomUUID());
		doc.addField("text", "sample");
		server.add(doc);
		server.commit();
		// Test the basics
		ModifiableSolrParams params = new ModifiableSolrParams();
		params.set("q", "sample");
		QueryResponse queresp = server.query(params);
		assertNotNull(queresp);
		assertEquals(1, queresp.getResults().size());
	}
	
	@Test
	public void testAddField() throws SolrServerException, IOException {
		IndexSchema schema = core.getLatestSchema();
		assertNotNull(schema);
		Object lock = schema.getSchemaUpdateLock();
		synchronized(lock) {
			Map<String, Object> options = new HashMap<>();
			options.put("indexed", true);
			options.put("stored", true);
			SchemaField field = schema.newField("infos", "text", options);
			schema = schema.addField(field);
			schema.refreshAnalyzers();
		}
		core.setLatestSchema(schema);
		SolrInputDocument doc = new SolrInputDocument();
		doc.addField("dbId", UUID.randomUUID());
		doc.addField("infos", "sample");
		server.add(doc);
		server.commit();
		// Test the basics
		ModifiableSolrParams params = new ModifiableSolrParams();
		params.set("q", "infos:sample");
		QueryResponse resp = server.query(params);
		assertNotNull(resp);
		assertEquals(1, resp.getResults().size());
	}
}
