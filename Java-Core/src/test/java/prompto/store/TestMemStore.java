package prompto.store;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import prompto.declaration.AttributeDeclaration;
import prompto.expression.EqualsExpression;
import prompto.expression.IExpression;
import prompto.grammar.EqOp;
import prompto.grammar.Identifier;
import prompto.grammar.OrderByClause;
import prompto.grammar.OrderByClauseList;
import prompto.grammar.UnresolvedIdentifier;
import prompto.literal.IntegerLiteral;
import prompto.literal.TextLiteral;
import prompto.runtime.Context;
import prompto.type.TextType;
import prompto.utils.IdentifierList;
import prompto.value.Document;
import prompto.value.Text;

public class TestMemStore {

	Context context;
	
	@Before
	public void before() throws Exception {
		IStore.setInstance(new MemStore());
		context = Context.newGlobalContext();
		AttributeDeclaration attr = new AttributeDeclaration(new Identifier("__id__"), TextType.instance(), null);
		attr.register(context);
	}
	
	private IExpression createFilter(String name, EqOp op, String value) {
		return new EqualsExpression(
				new UnresolvedIdentifier(new Identifier(name)), 
				op, 
				new TextLiteral('"' + value + '"'));
	}

	private Document store(String name, String value) throws Exception {
		Document doc = new Document();
		doc.setMember(context, new Identifier(name), new Text(value));
		IStore.getInstance().store(doc);
		return doc;
	}


	@Test
	public void testFetchOneEmpty() throws Exception {
		IExpression filter = createFilter("__id__", EqOp.EQUALS, "__test__");
		Document d = IStore.getInstance().fetchOne(context, filter);
		assertNull(d);
	}


	@Test
	public void testFetchOneExists() throws Exception {
		Document d1 = store("__id__", "__test__");
		IExpression filter = createFilter("__id__", EqOp.EQUALS, "__test__");
		Document d2 = IStore.getInstance().fetchOne(context, filter);
		assertEquals(d1,  d2);
	}

	@Test
	public void testFetchOneMissing() throws Exception {
		store("__id__", "__test__");
		IExpression filter = createFilter("__id__", EqOp.EQUALS, "__test1__");
		Document d2 = IStore.getInstance().fetchOne(context, filter);
		assertNull(d2);
	}

	@Test
	public void testFetchOneMulti() throws Exception {
		store("__id__", "__test1__");
		Document d2 = store("__id__", "__test2__");
		store("__id__", "__test3__");
		IExpression filter = createFilter("__id__", EqOp.EQUALS, "__test2__");
		Document d4 = IStore.getInstance().fetchOne(context, filter);
		assertEquals(d2,  d4);
	}

	@Test
	public void testFetchManyEmpty() throws Exception {
		IExpression filter = createFilter("__id__", EqOp.EQUALS, "__test__");
		IDocumentIterator docs = IStore.getInstance().fetchMany(context, null, null, filter, null);
		assertFalse(docs.hasNext());
	}

	@Test
	public void testFetchManyOneExists() throws Exception {
		Document d1 = store("__id__", "__test1__");
		store("__id__", "__test2__");
		IExpression filter = createFilter("__id__", EqOp.EQUALS, "__test1__");
		IDocumentIterator docs = IStore.getInstance().fetchMany(context, null, null, filter, null);
		assertTrue(docs.hasNext());
		assertEquals(d1,  docs.next());
		assertFalse(docs.hasNext());
	}

	@Test
	public void testFetchManyOneMissing() throws Exception {
		store("__id__", "__test1__");
		IExpression filter = createFilter("__id__", EqOp.EQUALS, "__test2__");
		IDocumentIterator docs = IStore.getInstance().fetchMany(context, null, null, filter, null);
		assertFalse(docs.hasNext());
	}

	@Test
	public void testFetchManyManyExist() throws Exception {
		Document d1 = store("__id__", "__test1__");
		store("__id__", "__test1__");
		store("__id__", "__test1__");
		store("__id__", "__test2__");
		IExpression filter = createFilter("__id__", EqOp.EQUALS, "__test1__");
		IDocumentIterator docs = IStore.getInstance().fetchMany(context, null, null, filter, null);
		assertTrue(docs.hasNext());
		assertEquals(d1,  docs.next());
		assertTrue(docs.hasNext());
		assertEquals(d1,  docs.next());
		assertTrue(docs.hasNext());
		assertEquals(d1,  docs.next());
		assertFalse(docs.hasNext());
	}

	@Test
	public void testOrderByAsc() throws Exception {
		Document d3 = store("__id__", "__test3__");
		Document d1 = store("__id__", "__test1__");
		Document d4 = store("__id__", "__test4__");
		Document d2 = store("__id__", "__test2__");
		OrderByClauseList obc = new OrderByClauseList(
				new OrderByClause(
						new IdentifierList(new Identifier("__id__")), 
						false));
		IDocumentIterator docs = IStore.getInstance().fetchMany(context, null, null, null, obc);
		assertTrue(docs.hasNext());
		assertEquals(d1,  docs.next());
		assertTrue(docs.hasNext());
		assertEquals(d2,  docs.next());
		assertTrue(docs.hasNext());
		assertEquals(d3,  docs.next());
		assertTrue(docs.hasNext());
		assertEquals(d4,  docs.next());
		assertFalse(docs.hasNext());
	}

	@Test
	public void testOrderByDesc() throws Exception {
		Document d3 = store("__id__", "__test3__");
		Document d1 = store("__id__", "__test1__");
		Document d4 = store("__id__", "__test4__");
		Document d2 = store("__id__", "__test2__");
		OrderByClauseList obc = new OrderByClauseList(
				new OrderByClause(
						new IdentifierList(new Identifier("__id__")), 
						true));
		IDocumentIterator docs = IStore.getInstance().fetchMany(context, null, null, null, obc);
		assertTrue(docs.hasNext());
		assertEquals(d4,  docs.next());
		assertTrue(docs.hasNext());
		assertEquals(d3,  docs.next());
		assertTrue(docs.hasNext());
		assertEquals(d2,  docs.next());
		assertTrue(docs.hasNext());
		assertEquals(d1,  docs.next());
		assertFalse(docs.hasNext());
	}
	
	@Test
	public void testSliceEmpty() throws Exception {
		IDocumentIterator docs = IStore.getInstance().fetchMany(context, new IntegerLiteral(1), new IntegerLiteral(10), null, null);
		assertFalse(docs.hasNext());
	}

	@Test
	public void testSliceBeyond() throws Exception {
		Document d1 = store("__id__", "__test1__");
		IDocumentIterator docs = IStore.getInstance().fetchMany(context, new IntegerLiteral(1), new IntegerLiteral(10), null, null);
		assertTrue(docs.hasNext());
		assertEquals(d1,  docs.next());
		assertFalse(docs.hasNext());
	}

	@Test
	public void testFullSlice() throws Exception {
		store("__id__", "__test1__");
		store("__id__", "__test2__");
		store("__id__", "__test3__");
		store("__id__", "__test4__");
		IDocumentIterator docs = IStore.getInstance().fetchMany(context, new IntegerLiteral(1), new IntegerLiteral(4), null, null);
		assertTrue(docs.hasNext());
		docs.next();
		assertTrue(docs.hasNext());
		docs.next();
		assertTrue(docs.hasNext());
		docs.next();
		assertTrue(docs.hasNext());
		docs.next();
		assertFalse(docs.hasNext());
	}
	
	@Test
	public void testSubSlice() throws Exception {
		store("__id__", "__test1__");
		store("__id__", "__test2__");
		store("__id__", "__test3__");
		store("__id__", "__test4__");
		IDocumentIterator docs = IStore.getInstance().fetchMany(context, new IntegerLiteral(2), new IntegerLiteral(3), null, null);
		assertTrue(docs.hasNext());
		docs.next();
		assertTrue(docs.hasNext());
		docs.next();
		assertFalse(docs.hasNext());
	}
	

}
