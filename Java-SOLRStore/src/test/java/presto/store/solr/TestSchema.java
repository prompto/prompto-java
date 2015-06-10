package presto.store.solr;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Arrays;

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
		params.set("q", "search some text");
		QueryResponse resp = server.query(params);
		assertNotNull(resp);
		assertTrue(resp.getResults().isEmpty());
	}

	@Test
	public void testNonEmptyCore() throws SolrServerException, IOException {
		SolrInputDocument doc = new SolrInputDocument();
		doc.addField("text", Arrays.asList("search", "some", "text"));
		server.add(doc);
		server.commit();
		// Test the basics
		ModifiableSolrParams params = new ModifiableSolrParams();
		params.set("q", "search");
		QueryResponse resp = server.query(params);
		assertNotNull(resp);
		assertEquals(1, resp.getResults().size());
	}
}
