package prompto.server;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

import prompto.error.PromptoError;
import prompto.expression.MethodSelector;
import prompto.grammar.ArgumentAssignmentList;
import prompto.grammar.Identifier;
import prompto.remoting.ParameterList;
import prompto.runtime.Context;
import prompto.statement.MethodCall;
import prompto.value.IValue;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;

public class RequestRouter {

	Context context;
	
	public RequestRouter(Context context) {
		this.context = context.newLocalContext();
	}

	public void handleRequest(Identifier methodName, String jsonParams, Map<String, byte[]> parts, OutputStream output) throws Exception {
		try {
			ParameterList params = ParameterList.read(context, jsonParams, parts);
			ArgumentAssignmentList assignments = params.toAssignments(context);
			MethodCall methodCall = new MethodCall(new MethodSelector(methodName),assignments);
			IValue value = methodCall.interpret(context);	
			writeResponse(context, value, output);
		} finally {
			context.terminated();
		}
		
	}

	private void writeResponse(Context context, IValue value, OutputStream output) throws IOException, PromptoError {
		JsonGenerator generator = new JsonFactory().createGenerator(output);
		generator.writeStartObject();
		generator.writeNullField("error");
		if(value==null)
			generator.writeNullField("data");
		else {
			generator.writeFieldName("data");
			value.toJson(context, generator, null, null);
		}
		generator.writeEndObject();
		generator.flush();
		generator.close();
	}

}
