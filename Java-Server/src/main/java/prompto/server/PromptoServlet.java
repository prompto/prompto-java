package prompto.server;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

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
			ExecutionMode mode = readMode(req);
			Identifier methodName = readMethod(req);
			String[] httpParams = req.getParameterMap().get("params");
			String jsonParams = httpParams==null || httpParams.length==0 ? null : httpParams[0];
			RequestRouter handler = new RequestRouter(AppServer.classLoader, AppServer.globalContext);
			String contentType = handler.runMethodOrTest(mode, methodName, jsonParams, null, resp.getOutputStream());
			resp.getOutputStream().close();
			resp.flushBuffer();
			resp.setContentType(contentType);
			resp.setStatus(HttpServletResponse.SC_OK);
			// resp.addHeader("Access-Control-Allow-Origin", true);
		} catch(Throwable t) {
			t.printStackTrace();
			resp.setStatus(500);
		}
	}
	
	private ExecutionMode readMode(HttpServletRequest req) {
		String[] parts = req.getPathInfo().substring(1).split("/");
		if(parts.length>1)
			return ExecutionMode.valueOf(parts[0].toUpperCase());
		else
			return ExecutionMode.INTERPRET;
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
			String contentType = req.getContentType();
			if(contentType.startsWith("application/x-www-form-urlencoded"))
				doPostUrlEncoded(req, resp);
			else if(contentType.startsWith("multipart/form-data"))
				doPostMultipart(req, resp);
		} catch(Throwable t) {
			t.printStackTrace();
			resp.setStatus(500);
		}
	}

	private void doPostMultipart(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		authenticate(req);
		readSession(req);
		ExecutionMode mode = readMode(req);
		Identifier methodName = readMethod(req);
		Map<String, byte[]> parts = readParts(req);
		String jsonParams = new String(parts.get("params"));
		RequestRouter handler = new RequestRouter(AppServer.classLoader, AppServer.globalContext);
		handler.runMethodOrTest(mode, methodName, jsonParams, parts, resp.getOutputStream());
		resp.getOutputStream().close();
		resp.flushBuffer();
		resp.setContentType("application/json");
		resp.setStatus(200);
	}

	private Identifier readMethod(HttpServletRequest req) {
		String[] parts = req.getPathInfo().split("/");
		return new Identifier(parts[parts.length-1]);
	}

	private void doPostUrlEncoded(HttpServletRequest req, HttpServletResponse resp) {
		throw new UnsupportedOperationException();
	}

	private Map<String, byte[]> readParts(HttpServletRequest req) throws ServletException, IOException {
		Map<String, byte[]> parts = new HashMap<>();
		for(Part part : req.getParts())
			parts.put(part.getName(), readPartData(part));
		return parts;
	}

	private byte[] readPartData(Part part) throws IOException {
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
				return output.toByteArray();
			}
		}
	}
}
