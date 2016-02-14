package prompto.server;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import prompto.grammar.Identifier;
import prompto.value.Document;

@SuppressWarnings("serial")
@MultipartConfig
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
			String path = req.getPathInfo();
			Identifier methodName = new Identifier(path.substring(1));
			String[] httpParams = req.getParameterMap().get("params");
			String jsonParams = httpParams==null || httpParams.length==0 ? null : httpParams[0];
			RequestRouter handler = new RequestRouter(AppServer.globalContext);
			handler.handleRequest(methodName, jsonParams, resp.getOutputStream());
			resp.getOutputStream().close();
			resp.flushBuffer();
			resp.setContentType("application/json");
			resp.setStatus(200);
		} catch(Throwable t) {
			t.printStackTrace();
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
		try {
			authenticate(req);
			readSession(req);
			String path = req.getPathInfo();
			Identifier methodName = new Identifier(path.substring(1));
			String jsonParams = readParams(req);
			RequestRouter handler = new RequestRouter(AppServer.globalContext);
			handler.handleRequest(methodName, jsonParams, resp.getOutputStream());
			resp.getOutputStream().close();
			resp.flushBuffer();
			resp.setContentType("application/json");
			resp.setStatus(200);
		} catch(Throwable t) {
			t.printStackTrace();
			resp.setStatus(500);
		}
	}

	private String readParams(HttpServletRequest req) throws ServletException, IOException {
		Part part = req.getPart("params");
		if(part==null)
			return null;
		try(InputStream input = part.getInputStream()) {
			try(ByteArrayOutputStream output = new ByteArrayOutputStream()) {
				byte[] buffer = new byte[4096];
				while(true) {
					int read = input.read(buffer);
					if(read<0)
						break;
					if(read>0)
						output.write(buffer, 0, read);
				}
				output.flush();
				return new String(output.toByteArray());
			}
		}
	}
}
