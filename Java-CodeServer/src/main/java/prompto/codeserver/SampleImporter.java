package prompto.codeserver;

import java.io.InputStream;

import prompto.code.Application;
import prompto.code.ICodeStore;
import prompto.code.ICodeStore.ModuleType;
import prompto.code.ResourceCodeStore;
import prompto.code.Version;
import prompto.declaration.IDeclaration;
import prompto.value.Image;
import prompto.value.Text;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SampleImporter {

	Application application;
	String imageResource;
	String codeResource;
	
	public SampleImporter(String path) {
		try {
			String jsonPath = path + "sample.json";
			InputStream input = Thread.currentThread().getContextClassLoader().getResourceAsStream(jsonPath);
			JsonNode descriptor = new ObjectMapper().readTree(input);
			Application application = new Application();
			application.setName(readText(descriptor, "name"));
			application.setVersion(readText(descriptor, "version"));
			application.setDescription(readText(descriptor, "description"));
			application.setEntryPoint(readText(descriptor, "entryPoint"));
			if(descriptor.get("imageResource")!=null)
				this.imageResource = path + descriptor.get("imageResource").asText();
			if(descriptor.get("codeResource")!=null)
				this.codeResource = path + descriptor.get("codeResource").asText();
			// done
			this.application = application;
		} catch(Exception e) {
			e.printStackTrace(System.err);
		}
	}

	private Text readText(JsonNode descriptor, String fieldName) {
		JsonNode child = descriptor.get(fieldName);
		if(child==null)
			return null;
		return new Text(child.asText());
	}

	public void importSample() throws Exception {
		ICodeStore store = ICodeStore.getInstance();
		String name = application.getName().getValue();
		Version version = Version.parse(application.getVersion().getValue());
		Application existing = store.fetchApplication(name, version);
		if(existing!=null)
			return;
		if(imageResource!=null)
			application.setImage(Image.fromResource(imageResource));
		store.store(application);	
		if(codeResource!=null)
			storeAssociatedCode(store);
	}

	private void storeAssociatedCode(ICodeStore store) throws Exception {
		ResourceCodeStore rcs = new ResourceCodeStore(null, ModuleType.APPLICATION, codeResource, application.getVersion().getValue());
		for(IDeclaration decl : rcs.getDeclarations())
			store.store(decl, rcs.getModuleDialect(), Version.parse(application.getVersion().getValue()));
	}

}