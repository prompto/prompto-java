package prompto.store.solr;

import static org.junit.Assert.*;

import java.util.UUID;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrInputDocument;
import org.junit.Before;
import org.junit.Test;

import prompto.declaration.AttributeDeclaration;
import prompto.error.SyntaxError;
import prompto.expression.FetchOneExpression;
import prompto.grammar.Identifier;
import prompto.parser.ECleverParser;
import prompto.parser.EPromptoBuilder;
import prompto.runtime.Context;
import prompto.store.IStorable;
import prompto.store.IStore;
import prompto.store.IStored;
import prompto.type.AnyType;
import prompto.type.TextType;
import prompto.value.Text;

public class TestQuery extends BaseSOLRTest {

	Context context;
	
	@Before
	public void before() throws Exception {
		createStore("TestQuery");
		store.startServerWithEmptyCore();
		context = Context.newGlobalContext();
		registerDbIdAttribute();
		registerNameAttribute();
		createField("name", "text", false);
	}
	
	private void registerDbIdAttribute() throws SyntaxError {
		AttributeDeclaration decl = new AttributeDeclaration( IStore.dbIdIdentifier, AnyType.instance());
		context.registerDeclaration(decl);
	}

	private void registerNameAttribute() throws SyntaxError {
		AttributeDeclaration decl = new AttributeDeclaration( new Identifier("name"), TextType.instance());
		decl.setStorable(true);
		context.registerDeclaration(decl);
	}

	private IStored fetchOne(String query) throws Exception {
		ECleverParser parser = new ECleverParser(query);
		parser.getLexer().setAddLF(false);
		ParseTree tree = parser.fetch_expression();
		EPromptoBuilder builder = new EPromptoBuilder(parser);
		ParseTreeWalker walker = new ParseTreeWalker();
		walker.walk(builder, tree);
		FetchOneExpression fetch = builder.<FetchOneExpression>getNodeValue(tree);
		return store.fetchOne(context, fetch.getType(), fetch.getFilter());
	}
	
	@Test
	public void testStore() throws Exception {
		IStorable storable = store.newStorable(null);
		storable.setValue(context, new Identifier("name"), new Text("John"));
		store.store(context, storable);
		store.commit();
		SolrQuery query = new SolrQuery();
		query.setQuery("*:*");
		QueryResponse resp = store.query(query);
		assertNotNull(resp);
		assertEquals(1, resp.getResults().size());
	}

	@Test
	public void testFetchOneByName() throws Exception {
		SolrInputDocument doc = new SolrInputDocument();
		doc.addField(IStore.dbIdName, UUID.randomUUID());
		doc.addField("name", "John");
		store.addDocuments(doc);
		store.commit();
		// Test the basics
		String query = "fetch one where name = \"John\"";
		IStored result = fetchOne(query);
		assertNotNull(result);
		assertEquals("John", result.getData("name"));
	}

	@Test
	public void testDeleteOne() throws Exception {
		SolrInputDocument doc = new SolrInputDocument();
		UUID uuid = UUID.randomUUID();
		doc.addField(IStore.dbIdName, uuid);
		doc.addField("name", "John");
		store.addDocuments(doc);
		store.commit();
		// Test the basics
		store.delete(uuid);
		store.commit();
		String query = "fetch one where name = \"John\"";
		IStored result = fetchOne(query);
		assertNull(result);
	}
	
	@Test
	public void testTextField() throws Exception {
		
	}

}
