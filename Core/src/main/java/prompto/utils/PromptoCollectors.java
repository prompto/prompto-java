package prompto.utils;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

import prompto.intrinsic.PromptoList;

public abstract class CollectionUtils {
	
	   public static <T> Collector<T, ?, PromptoList<T>> toPromptoList() {
	    return new Collector<T, PromptoList<T>, PromptoList<T>>() {

			@Override
			public Supplier<PromptoList<T>> supplier() {
				return () -> new PromptoList<T>(true);
			}

			@Override
			public BiConsumer<PromptoList<T>, T> accumulator() {
				return PromptoList::add;
			}

			@Override
			public BinaryOperator<PromptoList<T>> combiner() {
				return (left, right) -> { left.addAll(right); return left; };
			}

			@Override
			public Function<PromptoList<T>, PromptoList<T>> finisher() {
				return i -> i;
			}

			@Override
			public Set<Characteristics> characteristics() {
				return Collections.unmodifiableSet(EnumSet.of(Collector.Characteristics.IDENTITY_FINISH));
			}
	    	
	    };
	}


}
