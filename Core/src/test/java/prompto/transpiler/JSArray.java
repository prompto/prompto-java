package prompto.transpiler;

import java.util.Set;

import jdk.nashorn.api.scripting.*;

@SuppressWarnings("restriction")
public abstract class JSArray {
	
	@SuppressWarnings("unchecked")
	public static Object from(Object values) {
		if(values instanceof JSSet.SetIterator)
			values = ((JSSet.SetIterator)values).JSSet();
		if(values instanceof JSSet)
			values = ((JSSet)values).set;
		if(values instanceof Set) {
			Object[] array = ((Set<Object>)values).toArray();
			return ScriptUtils.wrapArray(array);
		} else
			throw new UnsupportedOperationException(values.getClass().getName());
	}
}
