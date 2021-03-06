package prompto.intrinsic;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;

@SuppressWarnings("serial")
public class PromptoSet<V> extends HashSet<V> implements Filterable<PromptoSet<V>, V>, IJsonNodeProducer {

	public PromptoSet() {
	}

	public PromptoSet(Collection<V> items) {
		super(items);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append('<');
		forEach((i)->{
			sb.append(i.toString());
			sb.append(", ");
		});
		if(sb.length()>1)
			sb.setLength(sb.length()-2); // trim last ", "
		sb.append('>');
		return sb.toString();
	}
	
	public Long getCount() {
		return (long)size();
	}
	
	public long getNativeCount() {
		return size();
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public PromptoList<V> sort(boolean descending) {
		Comparator<V> cmp = descending ?
				(o1, o2) -> ((Comparable)o2).compareTo(o1) :
				(o1, o2) -> ((Comparable)o1).compareTo(o2);
		TreeSet<V> sorted = new TreeSet<>(cmp);
		sorted.addAll(this);
		return new PromptoList<>(sorted, false);
	}
	
	@SuppressWarnings("unchecked")
	public PromptoList<? extends V> sortUsing(Comparator<? extends V> cmp) {
		PromptoList<V> sorted = new PromptoList<>(this, false);
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
	
	public Object get(int index) {
		if(index<0 || index>size())
			throw new IndexOutOfBoundsException(String.valueOf(index));
		for(Object item : this) {
			if(index==0)
				return item;
			index--;
		}
		throw new UnsupportedOperationException("Should never get there!");
	}
	
	@Override
	public PromptoSet<V> filter(Predicate<V> p) {
		PromptoSet<V> filtered = new PromptoSet<>();
		this.forEach((v)->{
			if(p.test(v))
				filtered.add(v);
		});
		return filtered;
	}
	
	public String join(String delimiter) {
		return this.stream()
			.map(Object::toString)
			.collect(Collectors.joining(delimiter));
	}
	
	public PromptoList<V> toList() {
		return new PromptoList<V>(this, false);
	}

	@Override
	public JsonNode toJsonNode() {
		ArrayNode node = JsonNodeFactory.instance.arrayNode();
		this.forEach(item -> node.add(PromptoConverter.toJsonNode(item)));
		return node;
	}

}
