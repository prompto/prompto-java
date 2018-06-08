package prompto.transpiler;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import jdk.nashorn.api.scripting.ScriptObjectMirror;
import jdk.nashorn.api.scripting.ScriptUtils;

@SuppressWarnings("restriction")
public class JSSet {

	Set<Object> set = new HashSet<>();
	
	public JSSet(Object values) {
		if(values instanceof ScriptObjectMirror) {
			Object[] array = (Object[]) ScriptUtils.convert(values, Object[].class);
			set.addAll(Arrays.asList(array));
		} else if(values instanceof JSSet) {
			set.addAll(((JSSet)values).set);
		} else if(values != null)
			throw new UnsupportedOperationException(values.getClass().getName());
	}
	
	public int getSize() {
		return set.size();
	}
	
	public boolean has(Object value) {
		return set.contains(value);
	}
	
	public void add(Object value) {
		set.add(value);
	}

	public Object values() {
		return new SetIterator();
	}
	
	public class SetIterator {

		Iterator<Object> iterator;
		
		public SetIterator() {
			this.iterator = set.iterator();
		}
		
		public JSSet JSSet() {
			return JSSet.this;
		}
		
		public Object next() {
			SetIteration iter = new SetIteration();
			if(iterator.hasNext()) {
				iter.value = iterator.next();
				iter.done = false;
			} else
				iter.done = true;
			return iter;
		}
		
		public class SetIteration {
			public boolean done;
			public Object value;
		}
		
	}
	
}
