package prompto.intrinsic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import prompto.error.PromptoError;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.store.IDataStore;
import prompto.store.IStorable;
import prompto.store.IStore;
import prompto.value.IInstance;
import prompto.value.IValue;
import prompto.value.IteratorValue;
import prompto.value.ListValue;
import prompto.value.SetValue;
import prompto.value.TupleValue;

public class PromptoStoreQuery {

	List<Object> deletables = new ArrayList<>();
	List<IStorable> storables = new ArrayList<>();
	
	public void execute() {
		if(deletables.isEmpty())
			deletables = null;
		if(storables.isEmpty())
			storables = null;
		if(deletables!=null || storables!=null) {
			IStore<Object> store = IDataStore.getInstance();
			try {
				store.store(deletables, storables);
			} catch(PromptoError e) {
				throw new RuntimeException(e); // TODO for now
			} 
		}
	}

	public void delete(Context context, IValue value) {
		if(value instanceof IInstance) try {
			IValue dbId = ((IInstance)value).getMember(context, new Identifier(IStore.dbIdName), false);
			if(dbId!=null)
				deletables.add(dbId.getStorableData());
		} catch(PromptoError e) {
			throw new RuntimeException(e); // TODO for now
		} else if(value instanceof ListValue)
			((ListValue)value).getItems().forEach((item)->
				delete(context, item));
		else if(value instanceof SetValue)
			((SetValue)value).getItems().forEach((item)->
				delete(context, item));
		else if(value instanceof TupleValue)
			((TupleValue)value).getItems().forEach((item)->
				delete(context, item));
		else if(value instanceof IteratorValue) {
			IteratorValue iter = (IteratorValue)value;
			while(iter.hasNext())
				delete(context, iter.next());
		} else
			throw new UnsupportedOperationException("Can't delete " + value.getClass());
	}

	public void store(Context context, IValue value) {
		if(value instanceof IInstance) try {
			((IInstance)value).collectStorables(storables);
		} catch(PromptoError e) {
			throw new RuntimeException(e);
		} else if(value instanceof ListValue)
			((ListValue)value).getItems().forEach((item)->
				store(context, item));
		else if(value instanceof SetValue)
			((SetValue)value).getItems().forEach((item)->
				store(context, item));
		else if(value instanceof TupleValue)
			((TupleValue)value).getItems().forEach((item)->
				store(context, item));
		else if(value instanceof IteratorValue) {
			IteratorValue iter = (IteratorValue)value;
			while(iter.hasNext())
				store(context, iter.next());
		} else
			throw new UnsupportedOperationException("Can't delete " + value.getClass());
	}

	public void store(Object value) {
		if(value==null)
			return;
		else if(value instanceof PromptoRoot)
			((PromptoRoot)value).collectStorables(storables);
		else if(value instanceof PromptoList)
			((PromptoList<?>)value).forEach((item)->
				store(item));
		else if(value instanceof PromptoSet)
			((PromptoSet<?>)value).forEach((item)->
				store(item));
		else if(value instanceof PromptoTuple)
			((PromptoTuple<?>)value).forEach((item)->
				store(item));
		else if(value instanceof Iterator) {
			Iterator<?> iter = (Iterator<?>)value;
			while(iter.hasNext())
				store(iter.next());
		} else
			throw new UnsupportedOperationException("Can't delete " + value.getClass());
	}
	
	
}
