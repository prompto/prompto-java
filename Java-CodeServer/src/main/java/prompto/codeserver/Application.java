package prompto.codeserver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import prompto.server.AppServer;

public class Application {

	public static void main(String[] args) throws Exception {
		List<String> argsList = new ArrayList<>(Arrays.asList(args));
		argsList.add("-resource");
		argsList.add("codeserver.pec");
		argsList.add("-application");
		argsList.add("dev-center");
		argsList.add("-version");
		argsList.add("1.0.0");
		AppServer.main(argsList.toArray(new String[argsList.size()]));
	}
}
