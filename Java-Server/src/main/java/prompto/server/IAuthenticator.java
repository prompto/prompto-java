package prompto.server;

import javax.servlet.http.HttpServletRequest;

public interface IAuthenticator {
	
	static IAuthenticator instance = null;
	
	public static IAuthenticator getInstance() {
		return instance;
	}
	
	String authenticate(HttpServletRequest request);

}
