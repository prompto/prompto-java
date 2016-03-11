package prompto.compiler;

import java.util.Stack;

public class StackState {
	
	private Stack<StackEntry> entries = new Stack<>();
	private Stack<StackLocal> locals = new Stack<>();
	
	public Stack<StackEntry> getEntries() {
		return entries;
	}
	
	public Stack<StackLocal> getLocals() {
		return locals;
	}
	
	public void capture(StackState state) {
		entries = new Stack<>();
		this.entries.addAll(state.entries);
		locals = new Stack<>();
		this.locals.addAll(state.locals);
	}

	public int stackLength() {
		return length(entries);
	}

	public int localsLength() {
		return length(locals);
	}

	private int length(Stack<? extends IVerifierEntry> stack) {
		return (int)stack.stream().mapToInt((e)->
		e.length())
			.summaryStatistics()
				.getSum();
	}

	public StackEntry pushEntry(StackEntry entry) {
		return entries.push(entry);
	}

	public StackEntry popEntry() {
		return entries.pop();
	}

	public StackLocal pushLocal(StackLocal item) {
		return locals.push(item);
	}

	public void register(ConstantsPool pool) {
		entries.forEach((e)->
			e.register(pool));
		locals.forEach((l)->
			l.register(pool));
	}


}
