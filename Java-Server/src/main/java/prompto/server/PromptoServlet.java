package prompto.server;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import prompto.declaration.DeclarationList;
import prompto.grammar.Identifier;
import prompto.parser.ECleverParser;
import prompto.runtime.Context;

@SuppressWarnings("serial")
public class PromptoServlet extends HttpServlet {

	Context globalContext;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		System.out.println("Initializing Prompto servlet");
		globalContext = Context.newGlobalContext();
		try {
			InputStream input = Thread.currentThread().getContextClassLoader().getResourceAsStream("prompto/core.pec");
			if(input==null)
				throw new FileNotFoundException("Missing prompto core libraries!");
			ECleverParser parser = new ECleverParser("core", input);
			DeclarationList decls = parser.parse_declaration_list();
			decls.register(globalContext);
		} catch(Exception e) {
			throw new ServletException(e);
		}
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			Identifier methodName = new Identifier(req.getServletPath().substring(1));
			String[] httpParams = req.getParameterMap().get("params");
			String params = httpParams==null || httpParams.length==0 ? null : httpParams[0];
			RequestRouter handler = new RequestRouter(globalContext);
			handler.handleRequest(methodName, params, resp.getOutputStream());
			resp.getOutputStream().close();
			resp.flushBuffer();
			resp.setContentType("application/json");
			resp.setStatus(200);
		} catch(Exception e) {
			resp.setStatus(500);
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setStatus(200);
	}
}
