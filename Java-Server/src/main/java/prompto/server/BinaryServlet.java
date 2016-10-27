package prompto.server;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import prompto.intrinsic.PromptoBinary;
import prompto.store.IDataStore;
import prompto.store.IStore;

@SuppressWarnings("serial")
public class BinaryServlet extends HttpServlet {

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String dbIdString = req.getParameter(IStore.dbIdName);
			String attr = req.getParameter("attribute");
			IStore store = IDataStore.getInstance();
			Object dbId = store.convertToDbId(dbIdString);
			PromptoBinary binary = store.fetchBinary(dbId, attr);
			resp.setContentType(binary.getMimeType());
			resp.getOutputStream().write(binary.getBytes());
		} catch(Throwable t) {
			resp.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
		}
	}

}
