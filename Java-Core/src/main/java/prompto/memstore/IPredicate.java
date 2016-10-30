package prompto.memstore;

import java.util.Map;

public interface IPredicate {

	boolean matches(Map<String, Object> document);

}
