package prompto.debug;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

import org.junit.Test;

import com.fasterxml.jackson.databind.JsonNode;


public abstract class TestDebuggerVariablesBase extends TestDebuggerBase {

	
	@Test
	public void testVariables() throws Exception {
		setDebuggedResource("debug/variables.pec");
		start();
		waitSuspendedOrTerminated();
		assertEquals(Status.SUSPENDED, debugger.getWorkerStatus(getDebuggedThread()));
		// main method,  printLevel1 "test"
		IStack<?> stack = debugger.getWorkerStack(getDebuggedThread());
		IStackFrame frame = stack.iterator().next();
		Collection<? extends IVariable> vars = frame.getVariables();
		assertEquals(0, vars.size());
		// into printLevel1 "test"
		debugger.stepInto(getDebuggedThread());
		waitSuspendedOrTerminated();
		// printLevel1, value = value + "1"
		stack = debugger.getWorkerStack(getDebuggedThread());
		frame = stack.iterator().next();
		vars = frame.getVariables();	
		assertEquals(1, vars.size());
		IVariable var = vars.iterator().next();
		assertEquals("value", var.getName());
		assertEquals("Text", var.getTypeName());
		assertEquals("test", var.getValue().getValueString());
		// next, other = "other"
		debugger.stepOver(getDebuggedThread());
		waitSuspendedOrTerminated();
		stack = debugger.getWorkerStack(getDebuggedThread());
		frame = stack.iterator().next();
		vars = frame.getVariables();	
		assertEquals(1, vars.size());
		var = vars.iterator().next();
		assertEquals("value", var.getName());
		assertEquals("Text", var.getTypeName());
		assertEquals("test1", var.getValue().getValueString());
		// next, value = value + other
		debugger.stepOver(getDebuggedThread());
		waitSuspendedOrTerminated();
		stack = debugger.getWorkerStack(getDebuggedThread());
		frame = stack.iterator().next();
		vars = frame.getVariables();	
		assertEquals(2, vars.size());
		Iterator<? extends IVariable> iter = vars.iterator();
		var = iter.next();
		assertEquals("value", var.getName());
		assertEquals("Text", var.getTypeName());
		assertEquals("test1", var.getValue().getValueString());
		var = iter.next();
		assertEquals("other", var.getName());
		assertEquals("Text", var.getTypeName());
		assertEquals("other", var.getValue().getValueString());
		// next, printLevel2 value
		debugger.stepOver(getDebuggedThread());
		waitSuspendedOrTerminated();
		stack = debugger.getWorkerStack(getDebuggedThread());
		frame = stack.iterator().next();
		vars = frame.getVariables();	
		assertEquals(2, vars.size());
		iter = vars.iterator();
		var = iter.next();
		assertEquals("value", var.getName());
		assertEquals("Text", var.getTypeName());
		assertEquals("test1other", var.getValue().getValueString());
		var = iter.next();
		assertEquals("other", var.getName());
		assertEquals("Text", var.getTypeName());
		assertEquals("other", var.getValue().getValueString());
		debugger.resume(getDebuggedThread());
		join();
		assertEquals("test1other2stuff3-ok", readOut());
	}
	
	@Test
	public void testVariableNull() throws Exception {
		testVariable("debug/variable-null.pec", value -> assertTrue(value.isNull()));
	}
	
	@Test
	public void testVariableBoolean() throws Exception {
		testVariable("debug/variable-boolean.pec", value -> assertTrue(value.isBoolean() && value.asBoolean()));
	}


	@Test
	public void testVariableInteger() throws Exception {
		testVariable("debug/variable-integer.pec", value -> assertTrue(value.isNumber() && value.asInt()==123));
	}

	@Test
	public void testVariableDecimal() throws Exception {
		testVariable("debug/variable-decimal.pec", value -> assertTrue(value.isNumber() && value.asDouble()==123.456));
	}


	@Test
	public void testVariableCharacter() throws Exception {
		testVariable("debug/variable-character.pec", value -> { assertTrue(value.isTextual());  assertEquals("X", value.asText()); });
	}

	
	@Test
	public void testVariableText() throws Exception {
		testVariable("debug/variable-text.pec", value -> { assertTrue(value.isTextual());  assertEquals("Hello", value.asText()); });
	}

	
	@Test
	public void testVariableDate() throws Exception {
		testVariable("debug/variable-date.pec", value -> { assertTrue(value.isTextual()); assertEquals("2018-10-15", value.asText()); });
	}


	@Test
	public void testVariableTime() throws Exception {
		testVariable("debug/variable-time.pec", value -> { assertTrue(value.isTextual());  assertEquals("15:12:17.123", value.asText()); });
	}


	@Test
	public void testVariableDateTime() throws Exception {
		testVariable("debug/variable-dateTime.pec", value -> { assertTrue(value.isTextual());  assertEquals("2018-10-15T15:12:17.123Z", value.asText()); });
	}


	@Test
	public void testVariableCss() throws Exception {
		testVariable("debug/variable-css.pec", value -> { assertTrue(value.isObject()); assertEquals("100px", value.get("width").get("value").asText()); });
	}
	
	@Test
	public void testVariableCursor() throws Exception {
		testVariable("debug/variable-cursor.pec", value -> { assertTrue(value.isObject()); assertEquals(0, value.get("count").get("value").asInt()); });
	}

	@Test
	public void testVariableIterator() throws Exception {
		testVariable("debug/variable-iterator.pec", value -> { assertTrue(value.isObject()); assertEquals(3, value.get("count").get("value").asInt()); });
	}

	@Test
	public void testVariableRange() throws Exception {
		testVariable("debug/variable-range.pec", value -> { assertTrue(value.isObject()); assertEquals(1, value.get("low").get("value").asInt()); });
	}


	@Test
	public void testVariableUuid() throws Exception {
		testVariable("debug/variable-uuid.pec", value -> { assertTrue(value.isTextual()); assertEquals("11223344-aabb-ccdd-eeff-112233445566", value.asText()); });
	}


	@Test
	public void testVariableVersion() throws Exception {
		testVariable("debug/variable-version.pec", value -> { assertTrue(value.isTextual()); assertEquals("12.3.7", value.asText()); });
	}


	@Test
	public void testVariableList() throws Exception {
		testVariable("debug/variable-list.pec", value -> { assertTrue(value.isArray()); assertEquals(3, value.size()); });
	}

	
	@Test
	public void testVariableSet() throws Exception {
		testVariable("debug/variable-set.pec", value -> { assertTrue(value.isArray()); assertEquals(3, value.size()); });
	}

	
	@Test
	public void testVariableTuple() throws Exception {
		testVariable("debug/variable-tuple.pec", value -> { assertTrue(value.isArray()); assertEquals(3, value.size()); });
	}


	@Test
	public void testVariableDictionary() throws Exception {
		testVariable("debug/variable-dictionary.pec", value -> { assertTrue(value.isObject()); assertEquals(3, value.size()); });
	}


	@Test
	public void testVariableDocument() throws Exception {
		testVariable("debug/variable-document.pec", value -> { assertTrue(value.isObject()); assertEquals(3, value.size()); });
	}

	
	@Test
	public void testVariableCategory() throws Exception {
		testVariable("debug/variable-category.pec", value -> { assertTrue(value.isObject()); assertEquals(3, value.size()); });
	}

	void testVariable(String resourceName, Consumer<JsonNode> validator) throws Exception {
		setDebuggedResource(resourceName);
		start();
		waitSuspendedOrTerminated();
		assertEquals(Status.SUSPENDED, debugger.getWorkerStatus(getDebuggedThread()));
		// main method, a = ...
		IStack<?> stack = debugger.getWorkerStack(getDebuggedThread());
		IStackFrame frame = stack.iterator().next();
		Collection<? extends IVariable> vars = frame.getVariables();
		assertEquals(0, vars.size());
		debugger.stepOver(getDebuggedThread());
		waitSuspendedOrTerminated();
		stack = debugger.getWorkerStack(getDebuggedThread());
		frame = stack.iterator().next();
		vars = frame.getVariables();
		assertEquals(1, vars.size());
		IVariable var = debugger.getVariable(getDebuggedThread(), frame, "a");
		assertNotNull(var);
		IValue ivalue = var.getValue();
		assertNotNull(ivalue);
		JsonNode data = ivalue.getValueData();
		assertNotNull(data);
		assertTrue(data.isObject());
		JsonNode value = data.get("value");
		assertNotNull(value);
		validator.accept(value);
	}


}
