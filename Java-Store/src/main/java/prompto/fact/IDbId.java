package prompto.fact;

/* an unknown value type for wrapping a db specific unique id type */
public interface IDbId {
	
	static IDbId ETERNITY = new IDbId() {};
	
}
