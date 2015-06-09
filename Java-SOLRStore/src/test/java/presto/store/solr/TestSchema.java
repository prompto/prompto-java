package presto.store.solr;

import static org.junit.Assert.*;

import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.QueryResponse;
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
	}

}
