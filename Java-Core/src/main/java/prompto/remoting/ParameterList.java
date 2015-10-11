package prompto.remoting;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URLEncoder;
import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;

import prompto.error.PromptoError;
import prompto.grammar.ArgumentAssignment;
import prompto.grammar.ArgumentAssignmentList;
import prompto.runtime.Context;

@SuppressWarnings("serial")
public class ParameterList extends ArrayList<Parameter> {

	public ArgumentAssignmentList toAssignments(Context context) {
		ArgumentAssignmentList assignments = new ArgumentAssignmentList();
		for(Parameter param : this) {
			ArgumentAssignment assign = param.toAssignment(context);
			assignments.add(assign); 
		}
		return assignments;
	}

	public String toURLEncodedString(Context context) throws IOException, PromptoError {
		String jsonString = toJsonString(context);
		return URLEncoder.encode(jsonString, "UTF-8");
	}
	
	private String toJsonString(Context context) throws IOException, PromptoError {
		Writer writer = new StringWriter();
		JsonGenerator generator = new JsonFactory().createGenerator(writer);
		generator.writeStartArray();
		for(Parameter param : this)
			param.toJson(context, generator);
		generator.writeEndArray();
		generator.flush();
		generator.close();
		return writer.toString();
	}


}
