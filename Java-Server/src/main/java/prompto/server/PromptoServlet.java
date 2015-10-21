package prompto.server;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import prompto.grammar.Identifier;
import prompto.value.Document;

@SuppressWarnings("serial")
public class PromptoServlet extends HttpServlet {

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			authenticate(req);
			readSession(req);
			Identifier methodName = new Identifier(req.getServletPath().substring(1));
			String[] httpParams = req.getParameterMap().get("params");
			String params = httpParams==null || httpParams.length==0 ? null : httpParams[0];
			RequestRouter handler = new RequestRouter(AppServer.globalContext);
			handler.handleRequest(methodName, params, resp.getOutputStream());
			resp.getOutputStream().close();
			resp.flushBuffer();
			resp.setContentType("application/json");
			resp.setStatus(200);
		} catch(Exception e) {
			e.printStackTrace();
			resp.setStatus(500);
		}
	}
	
	private void readSession(HttpServletRequest req) {
		Document doc = (Document)req.getSession(true).getAttribute("__prompto_http_session__");
		if(doc==null) {
			doc = new Document();
			req.getSession(true).setAttribute("__prompto_http_session__", doc);
		}
		Server.setHttpSession(doc);
	}

	private void authenticate(HttpServletRequest req) {
		IAuthenticator authenticator = IAuthenticator.getInstance();
		String user = authenticator==null ? "<anonymous>" : authenticator.authenticate(req);
		Server.setHttpUser(user);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setStatus(200);
	}
}
