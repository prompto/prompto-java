package prompto.intrinsic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import prompto.error.PromptoError;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.store.DataStore;
import prompto.store.IAuditMetadata;
import prompto.store.IStorable;
import prompto.store.IStore;
import prompto.value.DocumentValue;
import prompto.value.IInstance;
import prompto.value.IIterable;
import prompto.value.IValue;
import prompto.value.NullValue;

public class PromptoDeleteAndStoreQuery {

	Set<PromptoDbId> deletables = new HashSet<>();
	Map<Object, IStorable> storables = new HashMap<>();
	IAuditMetadata metadata;
	
	public void execute() {
		if(deletables.isEmpty())
			deletables = null;
		if(storables.isEmpty())
			storables = null;
		if(deletables!=null || storables!=null) {
			IStore store = DataStore.getInstance();
			try {
				store.deleteAndStore(deletables, storables==null ? null : storables.values(), metadata);
				if(storables!=null)
					storables.values().forEach(IStorable::clear);
			} catch(PromptoError e) {
				throw new RuntimeException(e); // TODO for now
			} 
		}
	}

	@SuppressWarnings("unchecked")
	public void delete(Context context, IValue value) {
		if(value==NullValue.instance())
			return;
		else if(value instanceof IInstance) try {
			IValue dbId = ((IInstance)value).getMember(context, new Identifier(IStore.dbIdName), false);
			if(dbId!=null)
				deletables.add((PromptoDbId)dbId.getStorableData());
		} catch(PromptoError e) {
			throw new RuntimeException(e); // TODO for now
		} else if(value instanceof IIterable)
			((IIterable<IValue>)value).getIterable(context).forEach((item)->
				delete(context, item));
		else if(value instanceof Iterator) {
			Iterator<IValue> iter = (Iterator<IValue>)value;
			while(iter.hasNext())
				delete(context, iter.next());
		} else
			throw new UnsupportedOperationException("Can't delete " + value.getClass());
	}

	@SuppressWarnings("unchecked")
	public void store(Context context, IValue value) {
		if(value==NullValue.instance())
			return;
		else if(value instanceof IInstance) try {
			((IInstance)value).collectStorables((s)->
				storables.put(s.getOrCreateDbId(), s));
		} catch(PromptoError e) {
			throw new RuntimeException(e);
		} else if(value instanceof IIterable) {
			((IIterable<IValue>)value).getIterable(context).forEach((item)->
				store(context, item));
		} else if(value instanceof Iterator) {
			Iterator<IValue> iter = (Iterator<IValue>)value;
			while(iter.hasNext())
				store(iter.next());
		} else
			throw new UnsupportedOperationException("Can't store " + value.getClass());
	}

	@SuppressWarnings("unchecked")
	public void delete(Object value) {
		if(value==null)
			return;
		else if(value instanceof PromptoRoot) try {
			PromptoDbId dbId = ((PromptoRoot)value).getDbId();
			if(dbId!=null)
				deletables.add(dbId);
		} catch(PromptoError e) {
			throw new RuntimeException(e); // TODO for now
		} else if(value instanceof Iterable)
			((Iterable<Object>)value).forEach((item)->
				delete(item));
		else if(value instanceof Iterator) {
			Iterator<Object> iter = (Iterator<Object>)value;
			while(iter.hasNext())
				delete(iter.next());
		} else
			throw new UnsupportedOperationException("Can't delete " + value.getClass());
	}

	public void store(Object value) {
		if(value==null)
			return;
		else if(value instanceof PromptoRoot)
			((PromptoRoot)value).collectStorables((s)->
				storables.put(s.getOrCreateDbId(), s));
		else if(value instanceof Iterable) {
			((Iterable<?>)value).forEach((item)->
				store(item));
		} else if(value instanceof Iterator) {
			Iterator<?> iter = (Iterator<?>)value;
			while(iter.hasNext())
				store(iter.next());
		} else
			throw new UnsupportedOperationException("Can't delete " + value.getClass());
	}

	public void metadata(Context context, IValue value) {
		if(value instanceof DocumentValue)
			metadata(value.toJavaValue(context, PromptoDocument.class));
	}
	
	@SuppressWarnings("unchecked")
	public void metadata(Object value) {
		IStore store = DataStore.getInstance();
		if(store.isAuditEnabled() && value instanceof Map) {
			metadata = store.newAuditMetadata();
			metadata.putAll((Map<String,Object>) value);
		}
	}
	
	
}
