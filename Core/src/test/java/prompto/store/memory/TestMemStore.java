package prompto.store.memory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.junit.Before;
import org.junit.Test;

import prompto.declaration.AttributeDeclaration;
import prompto.expression.EqualsExpression;
import prompto.expression.IPredicateExpression;
import prompto.expression.UnresolvedIdentifier;
import prompto.grammar.EqOp;
import prompto.grammar.Identifier;
import prompto.grammar.OrderByClause;
import prompto.grammar.OrderByClauseList;
import prompto.intrinsic.PromptoList;
import prompto.literal.TextLiteral;
import prompto.runtime.Context;
import prompto.store.AttributeInfo;
import prompto.store.DataStore;
import prompto.store.IAuditMetadata;
import prompto.store.IAuditRecord;
import prompto.store.IQueryBuilder;
import prompto.store.IQueryBuilder.MatchOp;
import prompto.store.IStorable;
import prompto.store.IStorable.IDbIdFactory;
import prompto.store.IStored;
import prompto.store.IStoredIterable;
import prompto.store.IAuditRecord.Operation;
import prompto.store.memory.MemStore.AuditRecord;
import prompto.type.TextType;
import prompto.utils.IdentifierList;

public class TestMemStore {

	Context context;
	MemStore store;
	
	@Before
	public void before() throws Exception {
		store = new MemStore(()->true);
		DataStore.setInstance(store);
		context = Context.newGlobalsContext();
		AttributeDeclaration attr = new AttributeDeclaration(new Identifier("__id__"), TextType.instance());
		attr.setStorable(true);
		attr.register(context);
	}
	
	private IPredicateExpression createPredicate(String name, EqOp op, String value) {
		return new EqualsExpression(
				new UnresolvedIdentifier(new Identifier(name)), 
				op, 
				new TextLiteral('"' + value + '"'));
	}

	private IStorable store(String name, String value) throws Exception {
		IStorable doc = DataStore.getInstance().newStorable(new String[0], null);
		doc.setData(name, value);
		DataStore.getInstance().store(doc);
		return doc;
	}


	@Test
	public void testFetchOneEmpty() throws Exception {
		IQueryBuilder builder = new QueryBuilder();
		IPredicateExpression filter = createPredicate("__id__", EqOp.EQUALS, "__test__");
		filter.interpretQuery(context, builder, null);
		IStored d = DataStore.getInstance().fetchOne(builder.build());
		assertNull(d);
	}


	@Test
	public void testFetchOneExists() throws Exception {
		IStorable d1 = store("__id__", "__test__");
		IQueryBuilder builder = new QueryBuilder();
		IPredicateExpression filter = createPredicate("__id__", EqOp.EQUALS, "__test__");
		filter.interpretQuery(context, builder, null);
		IStored d2 = DataStore.getInstance().fetchOne(builder.build());
		assertEquals(d1,  d2);
	}

	@Test
	public void testFetchOneMissing() throws Exception {
		store("__id__", "__test__");
		IQueryBuilder builder = new QueryBuilder();
		IPredicateExpression filter = createPredicate("__id__", EqOp.EQUALS, "__test1__");
		filter.interpretQuery(context, builder, null);
		IStored d2 = DataStore.getInstance().fetchOne(builder.build());
		assertNull(d2);
	}

	@Test
	public void testFetchOneMulti() throws Exception {
		store("__id__", "__test1__");
		IStorable d2 = store("__id__", "__test2__");
		store("__id__", "__test3__");
		IQueryBuilder builder = new QueryBuilder();
		IPredicateExpression filter = createPredicate("__id__", EqOp.EQUALS, "__test2__");
		filter.interpretQuery(context, builder, null);
		IStored d4 = DataStore.getInstance().fetchOne(builder.build());
		assertEquals(d2,  d4);
	}

	@Test
	public void testFetchManyEmpty() throws Exception {
		IQueryBuilder builder = new QueryBuilder();
		IPredicateExpression filter = createPredicate("__id__", EqOp.EQUALS, "__test__");
		filter.interpretQuery(context, builder, null);
		IStoredIterable iterable = DataStore.getInstance().fetchMany(builder.build());
		Iterator<IStored> docs = iterable.iterator();
		assertFalse(docs.hasNext());
	}

	@Test
	public void testFetchManyOneExists() throws Exception {
		IStorable d1 = store("__id__", "__test1__");
		store("__id__", "__test2__");
		IQueryBuilder builder = new QueryBuilder();
		IPredicateExpression filter = createPredicate("__id__", EqOp.EQUALS, "__test1__");
		filter.interpretQuery(context, builder, null);
		IStoredIterable iterable = DataStore.getInstance().fetchMany(builder.build());
		Iterator<IStored> docs = iterable.iterator();
		assertTrue(docs.hasNext());
		assertEquals(d1,  docs.next());
		assertFalse(docs.hasNext());
	}

	@Test
	public void testFetchManyOneMissing() throws Exception {
		store("__id__", "__test1__");
		IQueryBuilder builder = new QueryBuilder();
		IPredicateExpression filter = createPredicate("__id__", EqOp.EQUALS, "__test2__");
		filter.interpretQuery(context, builder, null);
		IStoredIterable iterable = DataStore.getInstance().fetchMany(builder.build());
		Iterator<IStored> docs = iterable.iterator();
		assertFalse(docs.hasNext());
	}

	@Test
	public void testFetchManyManyExist() throws Exception {
		store("__id__", "__test1__");
		store("__id__", "__test1__");
		store("__id__", "__test1__");
		store("__id__", "__test2__");
		IQueryBuilder builder = new QueryBuilder();
		IPredicateExpression filter = createPredicate("__id__", EqOp.EQUALS, "__test1__");
		filter.interpretQuery(context, builder, null);
		IStoredIterable iterable = DataStore.getInstance().fetchMany(builder.build());
		Iterator<IStored> docs = iterable.iterator();
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
		IQueryBuilder builder = new QueryBuilder();
		OrderByClauseList obc = new OrderByClauseList(
				new OrderByClause(
						new IdentifierList(new Identifier("__id__")), 
						false));
		obc.interpretQuery(context, builder);
		IStoredIterable iterable = DataStore.getInstance().fetchMany(builder.build());
		Iterator<IStored> docs = iterable.iterator();
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
		IQueryBuilder builder = new QueryBuilder();
		OrderByClauseList obc = new OrderByClauseList(
				new OrderByClause(
						new IdentifierList(new Identifier("__id__")), 
						true));
		obc.interpretQuery(context, builder);
		IStoredIterable iterable = DataStore.getInstance().fetchMany(builder.build());
		Iterator<IStored> docs = iterable.iterator();
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
		IQueryBuilder builder = new QueryBuilder()
			.first(1L)
			.last(10L);
		IStoredIterable iterable = DataStore.getInstance().fetchMany(builder.build());
		Iterator<IStored> docs = iterable.iterator();
		assertFalse(docs.hasNext());
	}

	@Test
	public void testSliceBeyond() throws Exception {
		IStorable d1 = store("__id__", "__test1__");
		IQueryBuilder builder = new QueryBuilder()
			.first(1L)
			.last(10L);
		IStoredIterable iterable = DataStore.getInstance().fetchMany(builder.build());
		Iterator<IStored> docs = iterable.iterator();
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
		IQueryBuilder builder = new QueryBuilder()
			.first(1L)
			.last(4L);
		IStoredIterable iterable = DataStore.getInstance().fetchMany(builder.build());
		Iterator<IStored> docs = iterable.iterator();
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
		IQueryBuilder builder = new QueryBuilder()
			.first(2L)
			.last(3L);
		IStoredIterable iterable = DataStore.getInstance().fetchMany(builder.build());
		Iterator<IStored> docs = iterable.iterator();
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
		PromptoList<String> categories = new PromptoList<>(false);
		categories.add("Project");
		categories.add("Application");
		d1.setData("category", categories);
		IQueryBuilder builder = new QueryBuilder();
		AttributeInfo info = AttributeInfo.CATEGORY;
		builder.verify(info, MatchOp.CONTAINS, "Application");
		IStored doc = DataStore.getInstance().fetchOne(builder.build());
		assertEquals(d1, doc);
	}

	@Test
	public void testFetchOneRootCategory() throws Exception {
		store("__id__", "__test0__");
		IStorable d1 = store("__id__", "__test1__");
		PromptoList<String> categories = new PromptoList<>(false);
		categories.add("Project");
		categories.add("Application");
		d1.setData("category", categories);
		IQueryBuilder builder = new QueryBuilder();
		AttributeInfo info = AttributeInfo.CATEGORY;
		builder.verify(info, MatchOp.CONTAINS, "Project");
		IStored doc = DataStore.getInstance().fetchOne(builder.build());
		assertEquals(d1, doc);
	}

	@Test
	public void testFetchManyCategory() throws Exception {
		store("__id__", "__test0__");
		IStorable d1 = store("__id__", "__test1__");
		PromptoList<String> categories = new PromptoList<>(false);
		categories.add("Project");
		categories.add("Application");
		d1.setData("category", categories);
		IQueryBuilder builder = new QueryBuilder();
		AttributeInfo info = AttributeInfo.CATEGORY;
		builder.verify(info, MatchOp.CONTAINS, "Application");
		IStoredIterable iterable = DataStore.getInstance().fetchMany(builder.build());
		Iterator<IStored> docs = iterable.iterator();
		assertTrue(docs.hasNext());
		docs.next();
		assertFalse(docs.hasNext());
	}
	
	@Test
	public void supportsAudit() {
		assertTrue(DataStore.getInstance().isAuditEnabled());
	}
	
	@Test
	public void audits3Inserts() throws Exception {
		List<IStorable> docs = IntStream.of(1, 2, 3)
				.mapToObj(i->{
					IStorable doc = DataStore.getInstance().newStorable(new String[0], null);
					doc.setData("name", "hello " + i);
					return doc;
				})
				.collect(Collectors.toList());
		DataStore.getInstance().store(docs);
		assertEquals(1L, store.auditMetadatas.size());
		Object metaId = store.fetchLatestAuditMetadataId(docs.get(0).getOrCreateDbId());
		assertNotNull(metaId);
		IAuditMetadata meta = store.fetchAuditMetadata(metaId);
		assertNotNull(meta);
		assertEquals(3L, store.auditRecords.size());	
		IAuditRecord audit = store.fetchLatestAuditRecord(docs.get(0).getOrCreateDbId());
		assertNotNull(audit);
		assertEquals("hello 1", audit.getInstance().getData("name"));
	}

	@Test
	public void audits1Update() throws Exception {
		IStorable doc1 = DataStore.getInstance().newStorable(new String[0], null);
		doc1.setData("name", "hello");
		DataStore.getInstance().store(doc1);
		IStored stored = store.fetchUnique(doc1.getOrCreateDbId());
		class DbIdFactory implements IDbIdFactory {

			@Override public Object get() { return stored.getDbId(); }
			@Override public void accept(Object dbId) {  }
			@Override public boolean isUpdate() { return true; }
		}

		IStorable doc2 = DataStore.getInstance().newStorable(new String[0], new DbIdFactory());
		doc2.setDbId(stored.getDbId());
		doc2.setData("name", "bye");
		DataStore.getInstance().store(doc2);
		assertEquals(2L, store.auditMetadatas.size());
		Collection<AuditRecord> audits = store.fetchAllAuditRecords(doc2.getOrCreateDbId());
		assertEquals(2L, audits.size());	
		Iterator<AuditRecord> iter = audits.iterator();
		IAuditRecord audit = iter.next();
		assertEquals("bye", audit.getInstance().getData("name"));
		audit = iter.next();
		assertEquals("hello", audit.getInstance().getData("name"));
		Collection<Object> metaIds = store.fetchAllAuditMetadataIds(doc2.getOrCreateDbId());
		assertEquals(2L, metaIds.size());
		metaIds.forEach(metaId -> assertNotNull(store.fetchAuditMetadata(metaId)));
	}
	
	@Test
	public void audits1Delete() throws Exception {
		IStorable doc = DataStore.getInstance().newStorable(new String[0], null);
		doc.setData("name", "hello");
		DataStore.getInstance().store(doc);
		DataStore.getInstance().delete(doc.getOrCreateDbId());
		assertEquals(2L, store.auditMetadatas.size());
		assertEquals(2L, store.auditRecords.size());		
		Collection<AuditRecord> audits = store.fetchAllAuditRecords(doc.getOrCreateDbId());
		assertEquals(2L, audits.size());	
		Iterator<AuditRecord> iter = audits.iterator();
		IAuditRecord audit = iter.next();
		assertNull(audit.getInstance());
		audit = iter.next();
		assertEquals("hello", audit.getInstance().getData("name"));
		audits = store.fetchAuditRecordsMatching(null, Collections.singletonMap("name", "hello"));
		assertEquals(1L, audits.size());
		audit = audits.iterator().next();
		assertEquals("hello", audit.getInstance().getData("name"));
		audits = store.fetchAuditRecordsMatching(Collections.singletonMap("operation", Operation.DELETE), null);
		assertEquals(1L, audits.size());
		audit = audits.iterator().next();
		assertNull(audit.getInstance());
	}
	
}
