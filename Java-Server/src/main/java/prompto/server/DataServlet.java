package prompto.server;

import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import prompto.error.PromptoError;
import prompto.expression.FetchManyExpression;
import prompto.expression.IFetchExpression;
import prompto.literal.IntegerLiteral;
import prompto.parser.ECleverParser;
import prompto.runtime.Context;
import prompto.type.ListType;
import prompto.value.Cursor;
import prompto.value.IValue;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;

@SuppressWarnings("serial")
public class DataServlet extends HttpServlet {

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String query = req.getParameter("query");
			String first = req.getParameter("first");
			String last = req.getParameter("last");
			ECleverParser parser = new ECleverParser(query);
			IFetchExpression fetch = parser.parse_fetch_store_expression();
			adjustQueryRange(fetch, first, last);
			Context context = AppServer.getGlobalContext();
			IValue value = fetch.interpret(context);
			String mimeType = writeJsonResponse(context, value, resp.getOutputStream());
			resp.setContentType(mimeType);
		} catch(Throwable t) {
			resp.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
		}
	}
	
	private void adjustQueryRange(IFetchExpression fetch, String first, String last) {
		if(fetch instanceof FetchManyExpression) {
			FetchManyExpression many = (FetchManyExpression)fetch;
			if(many.getFirst()==null && first!=null)
				many.setFirst(new IntegerLiteral(first));
			if(many.getLast()==null && last!=null)
				many.setLast(new IntegerLiteral(last));
		}
		
	}

	private String writeJsonResponse(Context context, IValue value, OutputStream output) throws IOException, PromptoError {
		JsonGenerator generator = new JsonFactory().createGenerator(output);
		generator.writeStartObject();
		generator.writeNullField("error");
		if(value==null)
			generator.writeNullField("data");
		else {
			generator.writeFieldName("data");
			if(value instanceof Cursor)
				value.toJson(context, generator, null, null, null);
			else {
				generator.writeStartObject();
				generator.writeFieldName("type");
				generator.writeString(new ListType(value.getType()).getTypeName());
				generator.writeFieldName("value");
				generator.writeStartArray();
				value.toJson(context, generator, null, null, null);
				generator.writeEndArray();
				generator.writeEndObject();
			}
		}
		generator.writeEndObject();
		generator.flush();
		generator.close();
		return "application/json";
	}

}
