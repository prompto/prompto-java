package prompto.utils;

@FunctionalInterface
public interface TriConsumer<P1, P2, P3> {
	void accept(P1 p1, P2 p2, P3 p3);
}
