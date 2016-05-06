package prompto.server;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.security.InvalidParameterException;
import java.util.Map;

import prompto.compiler.PromptoClassLoader;
import prompto.error.PromptoError;
import prompto.expression.MethodSelector;
import prompto.grammar.ArgumentAssignmentList;
import prompto.grammar.Identifier;
import prompto.remoting.ParameterList;
import prompto.runtime.Context;
import prompto.runtime.Executor;
import prompto.runtime.Interpreter;
import prompto.statement.MethodCall;
import prompto.value.BinaryValue;
import prompto.value.IValue;
import prompto.value.Text;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;

public class RequestRouter {

	PromptoClassLoader classLoader;
	Context context;
	
	public RequestRouter(PromptoClassLoader classLoader, Context context) {
		this.classLoader = classLoader;
		this.context = context.newLocalContext();
	}

	public String runMethodOrTest(ExecutionMode mode, Identifier methodName, String jsonParams, Map<String, byte[]> parts, OutputStream output) throws Exception {
		boolean isTest = methodName.toString().startsWith("\"") && methodName.toString().endsWith("\"");
		switch(mode) {
		case INTERPRET:
			if(isTest)
				return interpretTest(methodName, output);
			else
				return interpretMethod(methodName, jsonParams, parts, output);
		case EXECUTE:
			if(isTest)
				return executeTest(methodName, output);
			else
				return executeMethod(methodName, jsonParams, parts, output);
		default:
			throw new InvalidParameterException(mode.name());
		}
	}
	
	private String executeTest(Identifier testName, OutputStream output) throws Exception {
		PrintStream oldOut = System.out;
		ByteArrayOutputStream bytes = new ByteArrayOutputStream();
		System.setOut(new PrintStream(bytes));
		try {
			Executor.executeTest(classLoader, testName.toString());
			bytes.flush();
			Text text = new Text(new String(bytes.toByteArray()));
			return writeJsonResponse(text, output);
		} finally {
			System.setOut(oldOut);
		}
	}

	private String interpretTest(Identifier testName, OutputStream output) throws IOException {
		PrintStream oldOut = System.out;
		ByteArrayOutputStream bytes = new ByteArrayOutputStream();
		System.setOut(new PrintStream(bytes));
		try {
			Interpreter.interpretTest(context, testName, true);
			bytes.flush();
			Text text = new Text(new String(bytes.toByteArray()));
			return writeJsonResponse(text, output);
		} finally {
			System.setOut(oldOut);
		}
	}

	public String executeMethod(Identifier methodName, String jsonParams, Map<String, byte[]> parts, OutputStream output) throws Exception {
		try {
			ParameterList params = ParameterList.read(context, jsonParams, parts);
			Class<?>[] argTypes = params.toJavaTypes(context, classLoader);
			Object[] args = params.toJavaValues(context);
			Object result = Executor.executeGlobalMethod(classLoader, methodName, argTypes, args);
			// TODO JSON output
			Text text = new Text(result==null ? "success!" : result.toString());
			return writeJsonResponse(text, output);
		} finally {
			context.terminated();
		}
	}
	
	public String interpretMethod(Identifier methodName, String jsonParams, Map<String, byte[]> parts, OutputStream output) throws Exception {
		try {
			ParameterList params = ParameterList.read(context, jsonParams, parts);
			ArgumentAssignmentList assignments = params.toAssignments(context);
			MethodCall methodCall = new MethodCall(new MethodSelector(methodName),assignments);
			IValue value = methodCall.interpret(context);
			if(value==null)
				value = new Text("Success!");
			if(value instanceof BinaryValue)
				return writeBinaryResponse((BinaryValue)value, output);
			else
				return writeJsonResponse(value, output);
		} finally {
			context.terminated();
		}
	}

	private String writeBinaryResponse(BinaryValue value, OutputStream output) throws IOException {
		output.write(value.getBytes());
		return value.getMimeType();
	}

	private String writeJsonResponse(IValue value, OutputStream output) throws IOException, PromptoError {
		JsonGenerator generator = new JsonFactory().createGenerator(output);
		generator.writeStartObject();
		generator.writeNullField("error");
		if(value==null)
			generator.writeNullField("data");
		else {
			generator.writeFieldName("data");
			value.toJson(context, generator, null, null, null);
		}
		generator.writeEndObject();
		generator.flush();
		generator.close();
		return "application/json";
	}

}
