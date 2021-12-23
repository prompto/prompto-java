package prompto.intrinsic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;

import prompto.value.IMultiplyable;

@SuppressWarnings("serial")
public class PromptoList<V> extends ArrayList<V> implements Filterable<PromptoList<V>, V>, IMultiplyable, IDocumentValueProducer, IJsonNodeProducer {

	public static <T> Collector<T, PromptoList<T>, PromptoList<T>> collector() {
		return new Collector<T, PromptoList<T>, PromptoList<T>>() {

			@Override
			public Supplier<PromptoList<T>> supplier() {
				return () -> new PromptoList<T>(false);
			}

			@Override
			public BiConsumer<PromptoList<T>, T> accumulator() {
				return PromptoList::add;
			}

			@Override
			public BinaryOperator<PromptoList<T>> combiner() {
				return (l1, l2) -> { l1.addAll(l2); return l1; };
			}

			@Override
			public Function<PromptoList<T>, PromptoList<T>> finisher() {
				return Function.identity();
			}

			@Override
			public Set<Characteristics> characteristics() {
				return Collections.unmodifiableSet(EnumSet.of(Collector.Characteristics.IDENTITY_FINISH));
			}
			
		};        
    }

	boolean mutable;
	
	public PromptoList(boolean mutable) {
		this.mutable = mutable;
	}

	public PromptoList(V[] items) {
		super(Arrays.asList(items));
		this.mutable = false;
	}

	public PromptoList(Collection<? extends V> items, boolean mutable) {
		super(items);
		this.mutable = mutable;
	}
	
	public boolean isMutable() {
		return mutable;
	}

	public Long getCount() {
		return (long)size();
	}
	
	public long getNativeCount() {
		return size();
	}
	
	public V getLast() {
		return get(this.size()-1);
	}

	public PromptoList<V> multiply(int count) {
		PromptoList<V> result = new PromptoList<>(false);
		while(count-->0)
			result.addAll(this);
		return result;
	}

	public PromptoList<V> slice(long first) {
		return slice(first, this.size());
	}
	
	public PromptoList<V> slice(long first, long last) {
		if (first < 0)
			first = this.size() + 1 + first;
		if (last < 0)
			last = this.size() + 1 + last;
		return new PromptoList<>(this.subList((int)(first-1), (int)last), false);
	}
	
	public void removeItem(Long item) {
		if(!mutable)
			PromptoException.throwEnumeratedException("NOT_MUTABLE");
		this.remove(item.intValue() - 1);
	}
	
	public void removeValue(V value) {
		if(!mutable)
			PromptoException.throwEnumeratedException("NOT_MUTABLE");
		this.remove(value);
	}
	
	public Long indexOfValue(V value) {
		int idx = this.indexOf(value);
		if(idx < 0)
			return null;
		else
			return Long.valueOf(idx + 1);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public PromptoList<V> sort(boolean descending) {
		PromptoList<V> sorted = new PromptoList<>(this, false);
		Comparator<V> cmp = descending ?
				(o1, o2) -> ((Comparable)o2).compareTo(o1) :
				(o1, o2) -> ((Comparable)o1).compareTo(o2);
		sorted.sort(cmp);
		return sorted;
	}
	
	@SuppressWarnings("unchecked")
	public PromptoList<? extends V> sortUsing(Comparator<? extends V> cmp) {
		PromptoList<? extends V> sorted = new PromptoList<>(this, false);
		sorted.sort((Comparator<V>)cmp);
		return sorted;
	}

	public boolean containsAny(Collection<Object> items) {
		for(Object item : items) {
			if(contains(item))
				return true;
		}
		return false;
	}
	
	@Override
	public PromptoList<V> filter(Predicate<V> p) {
		PromptoList<V> filtered = new PromptoList<>(false);
		this.forEach((v)->{
			if(p.test(v))
				filtered.add(v);
		});
		return filtered;
	}
	
	@Override
	public V set(int index, V element) {
		if(!mutable)
			PromptoException.throwEnumeratedException("NOT_MUTABLE");
		return super.set(index, element);
	}
	
	public String join(String delimiter) {
		return this.stream()
			.map(Object::toString)
			.collect(Collectors.joining(delimiter));
	}
		
	@SuppressWarnings("unchecked")
	@Override
	public PromptoList<? extends V> toDocumentValue() {
		List<? extends V> items = (List<? extends V>)this.stream()
				.map(item -> {
					if(item instanceof IDocumentValueProducer)
						return ((IDocumentValueProducer)item).toDocumentValue();
					else
						return item;
				})
				.collect(Collectors.toList());
		return new PromptoList<V>(items, false); 
	}
	
	public PromptoSet<V> toSet() {
		return new PromptoSet<>(this);
	}

	@Override
	public JsonNode toJsonNode() {
		ArrayNode node = JsonNodeFactory.instance.arrayNode();
		this.forEach(item -> node.add(PromptoConverter.toJsonNode(item)));
		return node;
	}

}
