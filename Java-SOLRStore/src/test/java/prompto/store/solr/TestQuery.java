package prompto.store.solr;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrInputDocument;
import org.apache.solr.common.params.ModifiableSolrParams;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import prompto.declaration.AttributeDeclaration;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.grammar.Identifier;
import prompto.parser.ECleverParser;
import prompto.parser.EPromptoBuilder;
import prompto.runtime.Context;
import prompto.store.IStorable;
import prompto.store.IStored;
import prompto.type.AnyType;
import prompto.type.TextType;
import prompto.value.Text;

public class TestQuery extends BaseSOLRTest {

	Context context;
	
	@Before
	public void before() throws Exception {
		startServerWithEmptyCore("TestQuery");
		context = Context.newGlobalContext();
		addDbIdAttribute();
		addNameAttribute();
		addNameField();
	}
	
	private void addDbIdAttribute() throws SyntaxError {
		AttributeDeclaration decl = new AttributeDeclaration( new Identifier("dbId"), AnyType.instance(), null);
		context.registerDeclaration(decl);
	}

	private void addNameAttribute() throws SyntaxError {
		AttributeDeclaration decl = new AttributeDeclaration( new Identifier("name"), TextType.instance(), null);
		decl.setStorable(true);
		context.registerDeclaration(decl);
	}

	private void addNameField() {
		Map<String, Object> options = new HashMap<>();
		options.put("indexed", true);
		options.put("stored", true);
		store.addField("name", "text", options);
	}

	private IStored runQuery(String query) throws Exception {
		ECleverParser parser = new ECleverParser(query);
		parser.getLexer().setAddLF(true);
		ParseTree tree = parser.fetch_expression();
		EPromptoBuilder builder = new EPromptoBuilder(parser);
		ParseTreeWalker walker = new ParseTreeWalker();
		walker.walk(builder, tree);
		IExpression filter = builder.<IExpression>getNodeValue(tree);
		return store.fetchOne(context, filter);
	}
	
	@Test
	public void testStore() throws Exception {
		IStorable storable = store.newStorable();
		storable.setValue(context, new Identifier("name"), new Text("John"));
		store.store(context, storable);
		store.commit();
		ModifiableSolrParams params = new ModifiableSolrParams();
		params.set("q", "*:*");
		QueryResponse resp = store.query(params);
		assertNotNull(resp);
		assertEquals(1, resp.getResults().size());
	}

	@Ignore
	@Test
	public void testFetchOneByName() throws Exception {
		SolrInputDocument doc = new SolrInputDocument();
		doc.addField("dbId", UUID.randomUUID());
		doc.addField("name", "John");
		store.addDocument(doc);
		store.commit();
		// Test the basics
		String query = "fetch one where name = \"John\"";
		IStored result = runQuery(query);
		assertNotNull(result);
		assertEquals("John", result.getValue(context, new Identifier("name")));
	}

}
