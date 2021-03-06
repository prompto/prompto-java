package prompto.store.memory;

import java.util.Map;

public class OrPredicate implements IPredicate {

	IPredicate left;
	IPredicate right;
	
	public OrPredicate(IPredicate left, IPredicate right) {
		this.left = left;
		this.right = right;
	}
	
	@Override
	public boolean matches(Map<String, Object> document) {
		return left.matches(document) || right.matches(document);
	}

}
