package prompto.codeserver;

import java.io.InputStream;

import prompto.code.WebSite;
import prompto.code.ICodeStore;
import prompto.code.ICodeStore.ModuleType;
import prompto.code.Module;
import prompto.code.ResourceCodeStore;
import prompto.code.Version;
import prompto.value.Image;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ModuleImporter {

	Module module;
	String imageResource;
	String codeResource;
	
	public ModuleImporter(String path) {
		try {
			String jsonPath = path + "module.json";
			InputStream input = Thread.currentThread().getContextClassLoader().getResourceAsStream(jsonPath);
			JsonNode descriptor = new ObjectMapper().readTree(input);
			ModuleType type = ModuleType.valueOf(readText(descriptor, "type"));
			Module module = type.getModuleClass().newInstance();
			module.setName(readText(descriptor, "name"));
			module.setVersion(readText(descriptor, "version"));
			module.setDescription(readText(descriptor, "description"));
			if(module instanceof WebSite)
				((WebSite)module).setEntryPoint(readText(descriptor, "entryPoint"));
			if(descriptor.get("imageResource")!=null)
				this.imageResource = path + descriptor.get("imageResource").asText();
			if(descriptor.get("codeResource")!=null)
				this.codeResource = path + descriptor.get("codeResource").asText();
			// done
			this.module = module;
		} catch(Exception e) {
			e.printStackTrace(System.err);
		}
	}

	private String readText(JsonNode descriptor, String fieldName) {
		JsonNode child = descriptor.get(fieldName);
		if(child==null)
			return null;
		else
			return child.asText();
	}

	public void importModule(ICodeStore codeStore) throws Exception {
		String name = module.getName();
		Version version = Version.parse(module.getVersion());
		WebSite existing = codeStore.fetchApplication(name, version);
		if(existing!=null)
			return;
		if(imageResource!=null)
			module.setImage(Image.fromResource(imageResource).getStorableData());
		codeStore.storeModule(module);	
		if(codeResource!=null)
			storeAssociatedCode(codeStore);
	}

	private void storeAssociatedCode(ICodeStore codeStore) throws Exception {
		ResourceCodeStore rcs = new ResourceCodeStore(null, module.getType(), codeResource, module.getVersion());
		codeStore.storeDeclarations(rcs.getDeclarations(), rcs.getModuleDialect(), Version.parse(module.getVersion()), module.getDbId());
	}

}
