package prompto.codeserver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import prompto.code.DistributedCodeStore;
import prompto.code.ICodeStore;
import prompto.server.AppServer;
import prompto.store.IDataStore;
import prompto.utils.ResourceUtils;

public class Application {

	public static void main(String[] args) throws Throwable {
		List<String> argsList = new ArrayList<>(Arrays.asList(args));
		argsList.add("-resource");
		argsList.add("DevCenter.pec");
		argsList.add("-application");
		argsList.add("dev-center");
		argsList.add("-version");
		argsList.add("1.0.0");
		AppServer.main(argsList.toArray(new String[argsList.size()]), Application::aboutToStart);
	}
	
	static void aboutToStart() throws Exception {
		ICodeStore codeStore = ICodeStore.getInstance();
		if(codeStore instanceof DistributedCodeStore)
			IDataStore.setInstance(((DistributedCodeStore)codeStore).getStore());
		importSamples();
		
	}
	
	static void importSamples() throws Exception {
		Collection<String> samples = ResourceUtils.listResourcesAt("samples/");
		for(String sample : samples) {
			SampleImporter importer = new SampleImporter("samples/" + sample);
			importer.importSample();
		}
	}
}
