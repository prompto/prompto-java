package prompto.store.solr;

import static org.junit.Assert.*;

import java.util.Arrays;
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
import prompto.store.IQuery;
import prompto.store.IStorable;
import prompto.store.IStore;
import prompto.store.IStored;
import prompto.type.AnyType;
import prompto.type.IntegerType;
import prompto.type.ListType;
import prompto.type.TextType;

public class TestQuery extends BaseSOLRTest {

	Context context;
	
	@Before
	public void before() throws Exception {
		createStore("TestQuery");
		store.startServerWithEmptyCore();
		context = Context.newGlobalContext();
		registerDbIdAttribute();
		registerNameAttribute();
		registerAliasesAttribute();
		registerQuantityAttribute();
		registerQuantitiesAttribute();
		createField("name", "text", false);
		createField("aliases", "text", true);
		createField("quantity", "integer", false);
		createField("quantities", "integer", true);
	}
	
	private void registerDbIdAttribute() throws SyntaxError {
		AttributeDeclaration decl = new AttributeDeclaration( new Identifier(IStore.dbIdName), AnyType.instance());
		context.registerDeclaration(decl);
	}

	private void registerNameAttribute() throws SyntaxError {
		AttributeDeclaration decl = new AttributeDeclaration( new Identifier("name"), TextType.instance());
		decl.setStorable(true);
		context.registerDeclaration(decl);
	}

	
	private void registerAliasesAttribute() throws SyntaxError {
		AttributeDeclaration decl = new AttributeDeclaration( new Identifier("aliases"), new ListType(TextType.instance()));
		decl.setStorable(true);
		context.registerDeclaration(decl);
	}
	
	private void registerQuantityAttribute() throws SyntaxError {
		AttributeDeclaration decl = new AttributeDeclaration( new Identifier("quantity"), IntegerType.instance());
		decl.setStorable(true);
		context.registerDeclaration(decl);
	}

	private void registerQuantitiesAttribute() throws SyntaxError {
		AttributeDeclaration decl = new AttributeDeclaration( new Identifier("quantities"), new ListType(IntegerType.instance()));
		decl.setStorable(true);
		context.registerDeclaration(decl);
	}

	private IStored fetchOne(String query) throws Exception {
		ECleverParser parser = new ECleverParser(query);
		parser.getLexer().setAddLF(false);
		ParseTree tree = parser.fetch_store_expression();
		EPromptoBuilder builder = new EPromptoBuilder(parser);
		ParseTreeWalker walker = new ParseTreeWalker();
		walker.walk(builder, tree);
		FetchOneExpression fetch = builder.<FetchOneExpression>getNodeValue(tree);
		IQuery q = fetch.buildFetchOneQuery(context, store); 
		return store.fetchOne(q);
	}
	
	@Test
	public void testStore() throws Exception {
		IStorable storable = store.newStorable(new String[0], null);
		storable.setData("name", "John");
		store.store(storable);
		store.flush();
		SolrQuery query = new SolrQuery();
		query.setQuery("*:*");
		QueryResponse resp = store.query(query);
		assertNotNull(resp);
		assertEquals(1, resp.getResults().size());
	}

	@Test
	public void testDeleteOne() throws Exception {
		SolrInputDocument doc = new SolrInputDocument();
		UUID uuid = UUID.randomUUID();
		doc.addField(IStore.dbIdName, uuid);
		doc.addField("name", "John");
		store.addDocuments(doc);
		store.flush();
		// Test the basics
		store.delete(uuid);
		store.flush();
		String query = "fetch one where name = \"John\"";
		IStored result = fetchOne(query);
		assertNull(result);
	}

	@Test
	public void testFetchTextEquals() throws Exception {
		SolrInputDocument doc = new SolrInputDocument();
		doc.addField(IStore.dbIdName, UUID.randomUUID());
		doc.addField("name", "John");
		store.addDocuments(doc);
		store.flush();
		// Test the basics
		String query = "fetch one where name = \"John\"";
		IStored result = fetchOne(query);
		assertNotNull(result);
		assertEquals("John", result.getData("name"));
	}

	@Test
	public void testFetchTextEqualsWithSpace() throws Exception {
		SolrInputDocument doc = new SolrInputDocument();
		doc.addField(IStore.dbIdName, UUID.randomUUID());
		doc.addField("name", "John Smith");
		store.addDocuments(doc);
		store.flush();
		// Test the basics
		String query = "fetch one where name = \"John Smith\"";
		IStored result = fetchOne(query);
		assertNotNull(result);
		assertEquals("John Smith", result.getData("name"));
	}

	@Test
	public void testFetchTextRoughly() throws Exception {
		SolrInputDocument doc = new SolrInputDocument();
		doc.addField(IStore.dbIdName, UUID.randomUUID());
		doc.addField("name", "John");
		store.addDocuments(doc);
		store.flush();
		// Test the basics
		String query = "fetch one where name ~ \"joHn\"";
		IStored result = fetchOne(query);
		assertNotNull(result);
		assertEquals("John", result.getData("name"));
	}

	@Test
	public void testFetchTextContains() throws Exception {
		SolrInputDocument doc = new SolrInputDocument();
		doc.addField(IStore.dbIdName, UUID.randomUUID());
		doc.addField("name", "John");
		store.addDocuments(doc);
		store.flush();
		// Test the basics
		String query = "fetch one where name contains \"oh\"";
		IStored result = fetchOne(query);
		assertNotNull(result);
		assertEquals("John", result.getData("name"));
	}

	@Test
	public void testFetchTextLesser() throws Exception {
		SolrInputDocument doc1 = new SolrInputDocument();
		doc1.addField(IStore.dbIdName, UUID.randomUUID());
		doc1.addField("name", "John");
		SolrInputDocument doc2 = new SolrInputDocument();
		doc2.addField(IStore.dbIdName, UUID.randomUUID());
		doc2.addField("name", "Lionel");
		store.addDocuments(doc1, doc2);
		store.flush();
		// Test the basics
		String query = "fetch one where name < \"King\"";
		IStored result = fetchOne(query);
		assertNotNull(result);
		assertEquals("John", result.getData("name"));
	}

	
	@Test
	public void testFetchTextGreater() throws Exception {
		SolrInputDocument doc1 = new SolrInputDocument();
		doc1.addField(IStore.dbIdName, UUID.randomUUID());
		doc1.addField("name", "John");
		SolrInputDocument doc2 = new SolrInputDocument();
		doc2.addField(IStore.dbIdName, UUID.randomUUID());
		doc2.addField("name", "Lionel");
		store.addDocuments(doc1, doc2);
		store.flush();
		// Test the basics
		String query = "fetch one where name > \"King\"";
		IStored result = fetchOne(query);
		assertNotNull(result);
		assertEquals("Lionel", result.getData("name"));
	}
	

	@Test
	public void testFetchTextInText() throws Exception {
		SolrInputDocument doc = new SolrInputDocument();
		doc.addField(IStore.dbIdName, UUID.randomUUID());
		doc.addField("name", "John");
		store.addDocuments(doc);
		store.flush();
		// Test the basics
		String query = "fetch one where \"oh\" in name";
		IStored result = fetchOne(query);
		assertNotNull(result);
		assertEquals("John", result.getData("name"));
	}
	
	@Test
	public void testFetchTextInCollection() throws Exception {
		SolrInputDocument doc = new SolrInputDocument();
		doc.addField(IStore.dbIdName, UUID.randomUUID());
		doc.addField("name", "John");
		store.addDocuments(doc);
		store.flush();
		// Test the basics
		String query = "fetch one where name in [\"John\", \"Jim\"]";
		IStored result = fetchOne(query);
		assertNotNull(result);
		assertEquals("John", result.getData("name"));
	}
	
	@Test
	public void testFetchTextInTextCollection() throws Exception {
		SolrInputDocument doc = new SolrInputDocument();
		doc.addField(IStore.dbIdName, UUID.randomUUID());
		doc.addField("name", "John");
		doc.addField("aliases", Arrays.asList("Johnny", "Jim"));
		store.addDocuments(doc);
		store.flush();
		// Test the basics
		String query = "fetch one where aliases contains \"Jim\"";
		IStored result = fetchOne(query);
		assertNotNull(result);
		assertEquals("John", result.getData("name"));
	}

	@Test
	public void testFetchNonTextEquals() throws Exception {
		SolrInputDocument doc = new SolrInputDocument();
		doc.addField(IStore.dbIdName, UUID.randomUUID());
		doc.addField("name", "John");
		doc.addField("quantity", 3L);
		store.addDocuments(doc);
		store.flush();
		// Test the basics
		String query = "fetch one where quantity = 3";
		IStored result = fetchOne(query);
		assertNotNull(result);
		assertEquals("John", result.getData("name"));
	}


	@Test
	public void testFetchNonTextLesser() throws Exception {
		SolrInputDocument doc1 = new SolrInputDocument();
		doc1.addField(IStore.dbIdName, UUID.randomUUID());
		doc1.addField("name", "John");
		doc1.addField("quantity", 3L);
		SolrInputDocument doc2 = new SolrInputDocument();
		doc2.addField(IStore.dbIdName, UUID.randomUUID());
		doc2.addField("name", "Lionel");
		doc2.addField("quantity", 13L);
		store.addDocuments(doc1, doc2);
		store.flush();
		// Test the basics
		String query = "fetch one where quantity < 10";
		IStored result = fetchOne(query);
		assertNotNull(result);
		assertEquals("John", result.getData("name"));
	}

	@Test
	public void testFetchNonTextGreater() throws Exception {
		SolrInputDocument doc1 = new SolrInputDocument();
		doc1.addField(IStore.dbIdName, UUID.randomUUID());
		doc1.addField("name", "John");
		doc1.addField("quantity", 3L);
		SolrInputDocument doc2 = new SolrInputDocument();
		doc2.addField(IStore.dbIdName, UUID.randomUUID());
		doc2.addField("name", "Lionel");
		doc2.addField("quantity", 13L);
		store.addDocuments(doc1, doc2);
		store.flush();
		// Test the basics
		String query = "fetch one where quantity > 10";
		IStored result = fetchOne(query);
		assertNotNull(result);
		assertEquals("Lionel", result.getData("name"));
	}
	
	@Test
	public void testFetchNonTextInCollection() throws Exception {
		SolrInputDocument doc = new SolrInputDocument();
		doc.addField(IStore.dbIdName, UUID.randomUUID());
		doc.addField("name", "John");
		doc.addField("quantity", 13L);
		store.addDocuments(doc);
		store.flush();
		// Test the basics
		String query = "fetch one where quantity in [10, 13]";
		IStored result = fetchOne(query);
		assertNotNull(result);
		assertEquals("John", result.getData("name"));
	}

	@Test
	public void testFetchNonTextInNonTextCollection() throws Exception {
		SolrInputDocument doc = new SolrInputDocument();
		doc.addField(IStore.dbIdName, UUID.randomUUID());
		doc.addField("name", "John");
		doc.addField("quantities", Arrays.asList(10L, 13L));
		store.addDocuments(doc);
		store.flush();
		// Test the basics
		String query = "fetch one where quantities contains 10";
		IStored result = fetchOne(query);
		assertNotNull(result);
		assertEquals("John", result.getData("name"));
	}
	
	
}
