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
import prompto.type.CategoryType;
import prompto.type.TextType;
import prompto.utils.IdentifierList;
import prompto.value.ListValue;
import prompto.value.Text;

public class TestMemStore {

	Context context;
	
	@Before
	public void before() throws Exception {
		IDataStore.setInstance(new MemStore());
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

	private IStorable store(String name, String value) throws Exception {
		IStorable doc = IDataStore.getInstance().newStorable(null);
		doc.setValue(context, new Identifier(name), new Text(value));
		IDataStore.getInstance().store(context, doc);
		return doc;
	}


	@Test
	public void testFetchOneEmpty() throws Exception {
		IExpression filter = createFilter("__id__", EqOp.EQUALS, "__test__");
		IStored d = IDataStore.getInstance().fetchOne(context, null, filter);
		assertNull(d);
	}


	@Test
	public void testFetchOneExists() throws Exception {
		IStorable d1 = store("__id__", "__test__");
		IExpression filter = createFilter("__id__", EqOp.EQUALS, "__test__");
		IStored d2 = IDataStore.getInstance().fetchOne(context, null, filter);
		assertEquals(d1,  d2);
	}

	@Test
	public void testFetchOneMissing() throws Exception {
		store("__id__", "__test__");
		IExpression filter = createFilter("__id__", EqOp.EQUALS, "__test1__");
		IStored d2 = IDataStore.getInstance().fetchOne(context, null, filter);
		assertNull(d2);
	}

	@Test
	public void testFetchOneMulti() throws Exception {
		store("__id__", "__test1__");
		IStorable d2 = store("__id__", "__test2__");
		store("__id__", "__test3__");
		IExpression filter = createFilter("__id__", EqOp.EQUALS, "__test2__");
		IStored d4 = IDataStore.getInstance().fetchOne(context, null, filter);
		assertEquals(d2,  d4);
	}

	@Test
	public void testFetchManyEmpty() throws Exception {
		IExpression filter = createFilter("__id__", EqOp.EQUALS, "__test__");
		IStoredIterator docs = IDataStore.getInstance().fetchMany(context, null, null, null, filter, null);
		assertFalse(docs.hasNext());
	}

	@Test
	public void testFetchManyOneExists() throws Exception {
		IStorable d1 = store("__id__", "__test1__");
		store("__id__", "__test2__");
		IExpression filter = createFilter("__id__", EqOp.EQUALS, "__test1__");
		IStoredIterator docs = IDataStore.getInstance().fetchMany(context, null, null, null, filter, null);
		assertTrue(docs.hasNext());
		assertEquals(d1,  docs.next());
		assertFalse(docs.hasNext());
	}

	@Test
	public void testFetchManyOneMissing() throws Exception {
		store("__id__", "__test1__");
		IExpression filter = createFilter("__id__", EqOp.EQUALS, "__test2__");
		IStoredIterator docs = IDataStore.getInstance().fetchMany(context, null, null, null, filter, null);
		assertFalse(docs.hasNext());
	}

	@Test
	public void testFetchManyManyExist() throws Exception {
		store("__id__", "__test1__");
		store("__id__", "__test1__");
		store("__id__", "__test1__");
		store("__id__", "__test2__");
		IExpression filter = createFilter("__id__", EqOp.EQUALS, "__test1__");
		IStoredIterator docs = IDataStore.getInstance().fetchMany(context, null, null, null, filter, null);
		assertTrue(docs.hasNext());
		docs.next();
		assertTrue(docs.hasNext());
		docs.next();
		assertTrue(docs.hasNext());
		docs.next();
		assertFalse(docs.hasNext());
	}

	@Test
	public void testOrderByAsc() throws Exception {
		IStorable d3 = store("__id__", "__test3__");
		IStorable d1 = store("__id__", "__test1__");
		IStorable d4 = store("__id__", "__test4__");
		IStorable d2 = store("__id__", "__test2__");
		OrderByClauseList obc = new OrderByClauseList(
				new OrderByClause(
						new IdentifierList(new Identifier("__id__")), 
						false));
		IStoredIterator docs = IDataStore.getInstance().fetchMany(context, null, null, null, null, obc);
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
		IStorable d3 = store("__id__", "__test3__");
		IStorable d1 = store("__id__", "__test1__");
		IStorable d4 = store("__id__", "__test4__");
		IStorable d2 = store("__id__", "__test2__");
		OrderByClauseList obc = new OrderByClauseList(
				new OrderByClause(
						new IdentifierList(new Identifier("__id__")), 
						true));
		IStoredIterator docs = IDataStore.getInstance().fetchMany(context, null, null, null, null, obc);
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
		IStoredIterator docs = IDataStore.getInstance().fetchMany(context, null, new IntegerLiteral(1), new IntegerLiteral(10), null, null);
		assertFalse(docs.hasNext());
	}

	@Test
	public void testSliceBeyond() throws Exception {
		IStorable d1 = store("__id__", "__test1__");
		IStoredIterator docs = IDataStore.getInstance().fetchMany(context, null, new IntegerLiteral(1), new IntegerLiteral(10), null, null);
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
		IStoredIterator docs = IDataStore.getInstance().fetchMany(context, null, new IntegerLiteral(1), new IntegerLiteral(4), null, null);
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
		IStoredIterator docs = IDataStore.getInstance().fetchMany(context, null, new IntegerLiteral(2), new IntegerLiteral(3), null, null);
		assertTrue(docs.hasNext());
		docs.next();
		assertTrue(docs.hasNext());
		docs.next();
		assertFalse(docs.hasNext());
	}
	
	@Test
	public void testFetchOneFinalCategory() throws Exception {
		store("__id__", "__test0__");
		IStorable d1 = store("__id__", "__test1__");
		ListValue categories = new ListValue(TextType.instance());
		categories.addItem(new Text("Project"));
		categories.addItem(new Text("Application"));
		d1.setValue(null, new Identifier("category"), categories);
		IStored doc = IDataStore.getInstance().fetchOne(context, 
				new CategoryType(new Identifier("Application")), null);
		assertEquals(d1, doc);
	}

	@Test
	public void testFetchOneRootCategory() throws Exception {
		store("__id__", "__test0__");
		IStorable d1 = store("__id__", "__test1__");
		ListValue categories = new ListValue(TextType.instance());
		categories.addItem(new Text("Project"));
		categories.addItem(new Text("Application"));
		d1.setValue(null, new Identifier("category"), categories);
		IStored doc = IDataStore.getInstance().fetchOne(context, 
				new CategoryType(new Identifier("Project")), null);
		assertEquals(d1, doc);
	}

	@Test
	public void testFetchManyCategory() throws Exception {
		store("__id__", "__test0__");
		IStorable d1 = store("__id__", "__test1__");
		ListValue categories = new ListValue(TextType.instance());
		categories.addItem(new Text("Project"));
		categories.addItem(new Text("Application"));
		d1.setValue(null, new Identifier("category"), categories);
		IStoredIterator docs = IDataStore.getInstance().fetchMany(context, 
				new CategoryType(new Identifier("Application")), 
				null, null, null, null);
		assertTrue(docs.hasNext());
		docs.next();
		assertFalse(docs.hasNext());
	}

}
