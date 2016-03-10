package prompto.compiler;

import static org.junit.Assert.*;

import static prompto.compiler.StackEntry.Type.*;

import org.junit.Test;

public class TestStackAttribute {

	@Test
	public void testEmpty() {
		StackAttribute stack = new StackAttribute();
		assertEquals(0, stack.getMaxStack());
	}

	@Test
	public void testInteger() {
		StackAttribute stack = new StackAttribute();
		stack.push(ITEM_Integer);
		assertEquals(1, stack.getMaxStack());
	}

	@Test
	public void testLong() {
		StackAttribute stack = new StackAttribute();
		stack.push(ITEM_Long);
		assertEquals(2, stack.getMaxStack());
	}

	@Test
	public void testPop1() {
		StackAttribute stack = new StackAttribute();
		stack.push(ITEM_Long);
		assertEquals(ITEM_Long, stack.pop((short)1)[0]);
	}

	@Test
	public void testPop2() {
		StackAttribute stack = new StackAttribute();
		stack.push(ITEM_Long);
		stack.push(ITEM_Integer);
		StackEntry.Type[] popped = stack.pop((short)2);
		assertEquals(ITEM_Long, popped[0]);
		assertEquals(ITEM_Integer, popped[1]);
		assertEquals(3, stack.getMaxStack());
		stack.push(ITEM_Long);
		assertEquals(3, stack.getMaxStack());
	}
}
