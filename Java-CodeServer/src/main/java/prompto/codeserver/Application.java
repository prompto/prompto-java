package prompto.codeserver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import prompto.code.UpdatableCodeStore;
import prompto.code.ICodeStore;
import prompto.server.AppServer;
import prompto.store.IDataStore;
import prompto.store.IStore;
import prompto.store.IStoreFactory.Type;
import prompto.utils.ResourceUtils;

public class Application {

	public static void main(String[] args) throws Throwable {
		Type codeStoreType = Type.ROOT;
		Type dataStoreType = Type.CODE;
		// parse parameters
		for(int i=0; i<args.length; i++) {
			if(!args[i].startsWith("-"))
				continue;
			if(args[i].equalsIgnoreCase("-codeStoreType")) {
				codeStoreType = Type.valueOf(args[++i]);
			} else if(args[i].equalsIgnoreCase("-dataStoreType")) {
				dataStoreType = Type.valueOf(args[++i]);
			} 
		}
		List<String> argsList = new ArrayList<>(Arrays.asList(args));
		argsList.add("-resources");
		argsList.add("CodeStore.pec,DevCenter.pec");
		argsList.add("-application");
		argsList.add("dev-center");
		argsList.add("-version");
		argsList.add("1.0.0");
		argsList.add("-codeStoreType");
		argsList.add(codeStoreType.name());
		argsList.add("-dataStoreType");
		argsList.add(dataStoreType.name());
		AppServer.main(argsList.toArray(new String[argsList.size()]), Application::aboutToStart);
	}
	
	static void aboutToStart() throws Exception {
		importSamples();
		
	}
	
	static void importSamples() throws Exception {
		IStore<Object> dataStore = IDataStore.getInstance();
		ICodeStore codeStore = new UpdatableCodeStore(dataStore, "dev-center", "1.0.0");
		Collection<String> samples = ResourceUtils.listResourcesAt("samples/");
		for(String sample : samples) {
			SampleImporter importer = new SampleImporter("samples/" + sample);
			importer.importSample(codeStore);
		}
	}
}
