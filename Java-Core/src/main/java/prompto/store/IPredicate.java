package prompto.store;

import java.util.Map;

public interface IPredicate {

	boolean matches(Map<String, Object> document);

}
