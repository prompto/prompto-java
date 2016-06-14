package prompto.store.solr;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.UUID;

import org.junit.Before;
import org.junit.Test;

import prompto.declaration.AttributeDeclaration;
import prompto.declaration.ConcreteCategoryDeclaration;
import prompto.expression.EqualsExpression;
import prompto.expression.IExpression;
import prompto.expression.UnresolvedIdentifier;
import prompto.grammar.EqOp;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoDate;
import prompto.intrinsic.PromptoDateTime;
import prompto.intrinsic.PromptoTime;
import prompto.literal.BooleanLiteral;
import prompto.literal.DateLiteral;
import prompto.literal.DateTimeLiteral;
import prompto.literal.DecimalLiteral;
import prompto.literal.IntegerLiteral;
import prompto.literal.TextLiteral;
import prompto.literal.TimeLiteral;
import prompto.runtime.Context;
import prompto.store.IDataStore;
import prompto.store.IPredicateExpression;
import prompto.store.IStore;
import prompto.store.IStored;
import prompto.store.IStoredIterable;
import prompto.type.AnyType;
import prompto.type.BooleanType;
import prompto.type.CategoryType;
import prompto.type.DateTimeType;
import prompto.type.DateType;
import prompto.type.IType;
import prompto.type.IntegerType;
import prompto.type.TextType;
import prompto.type.TimeType;
import prompto.type.UUIDType;
import prompto.utils.IdentifierList;
import prompto.value.Boolean;
import prompto.value.ConcreteInstance;
import prompto.value.Date;
import prompto.value.Decimal;
import prompto.value.ExpressionValue;
import prompto.value.IInstance;
import prompto.value.IValue;
import prompto.value.Integer;
import prompto.value.Text;
import prompto.value.Time;

public class TestInstance extends BaseSOLRTest {

	Context context;
	
	@SuppressWarnings("unchecked")
	@Before
	public void before() throws Exception {
		createStore("TestInstance");
		store.startServerWithEmptyCore();
		createField("category", "text", true);
		IDataStore.setInstance((IStore<Object>)(Object)store);
		context = Context.newGlobalContext();
	}
	
	@Test
	public void testStoreTextField() throws Exception {
		String fieldName = "msg";
		String fieldType = "text";
		String fieldValue = "hello";
		createField(fieldName, fieldType, false);
		IInstance instance = createInstanceWith1Attribute(fieldName, TextType.instance());
		instance.setMember(context, new Identifier(fieldName), new Text(fieldValue));
		store.store(instance.getStorable());
		store.flush();
		IStored stored = fetchOne(fieldName, new TextLiteral(fieldValue));
		assertNotNull(stored);
		assertEquals(fieldValue, stored.getData(fieldName));
	}

	@Test
	public void testStoreIntegerField() throws Exception {
		String fieldName = "int";
		long fieldValue = 123;
		createField(fieldName, "integer", false);
		IInstance instance = createInstanceWith1Attribute(fieldName, IntegerType.instance());
		instance.setMember(context, new Identifier(fieldName), new Integer(fieldValue));
		store.store(instance.getStorable());
		store.flush();
		IStored stored = fetchOne(fieldName, new IntegerLiteral(fieldValue));
		assertNotNull(stored);
		assertEquals(fieldValue, stored.getData(fieldName));
	}

	@Test
	public void testStoreDecimalField() throws Exception {
		String fieldName = "decimal";
		double fieldValue = 123.0;
		createField(fieldName, "decimal", false);
		IInstance instance = createInstanceWith1Attribute(fieldName, IntegerType.instance());
		instance.setMember(context, new Identifier(fieldName), new Decimal(fieldValue));
		store.store(instance.getStorable());
		store.flush();
		IStored stored = fetchOne(fieldName, new DecimalLiteral(fieldValue));
		assertNotNull(stored);
		assertEquals(fieldValue, stored.getData(fieldName));
	}

	@Test
	public void testStoreBooleanField() throws Exception {
		String fieldName = "bool";
		boolean fieldValue = true;
		createField(fieldName, "boolean", false);
		IInstance instance = createInstanceWith1Attribute(fieldName, BooleanType.instance());
		instance.setMember(context, new Identifier(fieldName), Boolean.valueOf(fieldValue));
		store.store(instance.getStorable());
		store.flush();
		IStored stored = fetchOne(fieldName, new BooleanLiteral("true"));
		assertNotNull(stored);
		assertEquals(fieldValue, stored.getData(fieldName));
	}

	@Test
	public void testStoreDateField() throws Exception {
		String fieldName = "date";
		PromptoDate fieldValue = PromptoDate.parse("2015-03-12");
		createField(fieldName, "date", false);
		IInstance instance = createInstanceWith1Attribute(fieldName, DateType.instance());
		instance.setMember(context, new Identifier(fieldName), new Date(fieldValue));
		store.store(instance.getStorable());
		store.flush();
		IStored stored = fetchOne(fieldName, new DateLiteral(fieldValue));
		assertNotNull(stored);
		assertEquals(fieldValue, stored.getData(fieldName)); // value will be converted by reader
	}

	@Test
	public void testStoreTimeField() throws Exception {
		String fieldName = "time";
		PromptoTime fieldValue = PromptoTime.parse("13:15:16.012");
		createField(fieldName, "time", false);
		IInstance instance = createInstanceWith1Attribute(fieldName, TimeType.instance());
		instance.setMember(context, new Identifier(fieldName), new Time(fieldValue));
		store.store(instance.getStorable());
		store.flush();
		IStored stored = fetchOne(fieldName, new TimeLiteral(fieldValue));
		assertNotNull(stored);
		assertEquals(fieldValue, stored.getData(fieldName));
	}

	@Test
	public void testStoreDateTimeField() throws Exception {
		String fieldName = "datetime";
		PromptoDateTime fieldValue = PromptoDateTime.parse("2015-03-12T13:15:16.012Z");
		createField(fieldName, "datetime", false);
		IInstance instance = createInstanceWith1Attribute(fieldName, DateTimeType.instance());
		instance.setMember(context, new Identifier(fieldName), new prompto.value.DateTime(fieldValue));
		store.store(instance.getStorable());
		store.flush();
		IStored stored = fetchOne(fieldName, new DateTimeLiteral(fieldValue));
		assertNotNull(stored);
		assertEquals(fieldValue, stored.getData(fieldName));
	}

	@Test
	public void testStoreUUIDField() throws Exception {
		String fieldName = "uuid";
		UUID fieldValue = UUID.randomUUID();
		createField(fieldName, "uuid", false);
		IInstance instance = createInstanceWith1Attribute(fieldName, UUIDType.instance());
		instance.setMember(context, new Identifier(fieldName), new prompto.value.UUIDValue(fieldValue));
		store.store(instance.getStorable());
		store.flush();
		IStored stored = fetchOne(fieldName, new ExpressionValue(UUIDType.instance(), new prompto.value.UUIDValue(fieldValue)));
		assertNotNull(stored);
		assertEquals(fieldValue, stored.getData(fieldName));
	}

	@Test
	public void testStoreChildField() throws Exception {
		CategoryType type = new CategoryType(new Identifier("Test"));
		String fieldName = "textField";
		String fieldValue = "textValue";
		String childValue = "childValue";
		String childName = "childField";
		createField(fieldName, "text", false);
		createField(childName, "db-ref", false);
		IInstance parent = createInstanceWith2Attributes(fieldName, TextType.instance(), childName, type);
		ConcreteCategoryDeclaration cd = context.getRegisteredDeclaration(
				ConcreteCategoryDeclaration.class, new Identifier("Test"), false);
		ConcreteInstance child = new ConcreteInstance(context, cd);
		child.setMutable(true);
		child.setMember(context, new Identifier(fieldName), new Text(childValue));
		parent.setMember(context, new Identifier(fieldName), new Text(fieldValue));
		parent.setMember(context, new Identifier(childName), child);
		store.store(null, Arrays.asList(parent.getStorable(), child.getStorable()));
		store.flush();
		IStored stored = fetchOne(fieldName, new TextLiteral(fieldValue));
		assertNotNull(stored);
		assertEquals(fieldValue, stored.getData(fieldName));
		parent = (ConcreteInstance)type.newInstance(context, stored);
		IValue v = parent.getMember(context, new Identifier(childName), false);
		assertNotNull(v);
		assertTrue(v instanceof IInstance);
		assertEquals(new Text(childValue), v.getMember(context, new Identifier(fieldName), false));
	}

	private IStored fetchOne(String field, IExpression value) throws Exception {
		CategoryType t = new CategoryType(new Identifier("Test"));
		IPredicateExpression e = new EqualsExpression( 
				new UnresolvedIdentifier(new Identifier(field)), EqOp.EQUALS, value);
		return store.interpretFetchOne(context, t, e);
	}
	
	@SuppressWarnings("unused")
	private IStoredIterable fetchAll() throws Exception {
		return store.interpretFetchMany(context, null, null, null, null, null);
	}

	private IInstance createInstanceWith1Attribute(String name, IType type) throws Exception {
		AttributeDeclaration a = new AttributeDeclaration(new Identifier(name), type);
		a.setStorable(true);
		context.registerDeclaration(a);
		IdentifierList as = new IdentifierList(new Identifier(name));
		ConcreteCategoryDeclaration d = new ConcreteCategoryDeclaration(new Identifier("Test"), as, null, null);
		d.setStorable(true);
		context.registerDeclaration(d);
		ConcreteInstance i = new ConcreteInstance(context, d);
		i.setMutable(true);
		return i;
	}

	private IInstance createInstanceWith2Attributes(String name1, IType type1, String name2, IType type2) throws Exception {
		AttributeDeclaration a = new AttributeDeclaration(new Identifier(IStore.dbIdName), AnyType.instance());
		context.registerDeclaration(a);
		a = new AttributeDeclaration(new Identifier(name1), type1);
		a.setStorable(true);
		context.registerDeclaration(a);
		a = new AttributeDeclaration(new Identifier(name2), type2);
		a.setStorable(true);
		context.registerDeclaration(a);
		IdentifierList as = new IdentifierList(new Identifier(name1));
		as.add(new Identifier(name2));
		ConcreteCategoryDeclaration d = new ConcreteCategoryDeclaration(new Identifier("Test"), as, null, null);
		d.setStorable(true);
		context.registerDeclaration(d);
		ConcreteInstance i = new ConcreteInstance(context, d);
		i.setMutable(true);
		return i;
	}

}