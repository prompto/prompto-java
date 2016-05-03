package prompto.codeserver;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import prompto.code.Dependency;
import prompto.code.WebSite;
import prompto.code.ICodeStore;
import prompto.code.ICodeStore.ModuleType;
import prompto.code.Module;
import prompto.code.ResourceCodeStore;
import prompto.code.Version;
import prompto.value.Image;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ModuleImporter {

	Module module;
	String imageResource;
	String codeResource;
	
	public ModuleImporter(String path) {
		try {
			JsonNode descriptor = readDescriptor(path);
			Module module = createModule(descriptor);
			populateModule(module, descriptor);
			populateResources(path, descriptor);
			// done
			this.module = module;
		} catch(Exception e) {
			e.printStackTrace(System.err);
		}
	}

	private void populateResources(String path, JsonNode descriptor) {
		if(descriptor.get("imageResource")!=null)
			this.imageResource = path + descriptor.get("imageResource").asText();
		if(descriptor.get("codeResource")!=null)
			this.codeResource = path + descriptor.get("codeResource").asText();
	}

	private void populateModule(Module module, JsonNode descriptor) {
		module.setName(readText(descriptor, "name"));
		module.setVersion(readText(descriptor, "version"));
		module.setDescription(readText(descriptor, "description"));
		if(module instanceof WebSite)
			((WebSite)module).setEntryPoint(readText(descriptor, "entryPoint"));
		JsonNode dependencies = descriptor.get("dependencies");
		if(dependencies!=null)
			module.setDependencies(populateDependencies(dependencies));
	}

	private List<Dependency> populateDependencies(JsonNode descriptor) {
		List<Dependency> items = new ArrayList<>();
		for(JsonNode node : descriptor) {
			Dependency item = new Dependency();
			item.setName(readText(node, "name"));
			item.setVersion(readText(node, "version"));
			items.add(item);
		}
		return items;
	}

	private Module createModule(JsonNode descriptor) throws InstantiationException, IllegalAccessException {
		ModuleType type = ModuleType.valueOf(readText(descriptor, "type"));
		return type.getModuleClass().newInstance();
	}

	private JsonNode readDescriptor(String path) throws JsonProcessingException, IOException {
		String jsonPath = path + "module.json";
		InputStream input = Thread.currentThread().getContextClassLoader().getResourceAsStream(jsonPath);
		return new ObjectMapper().readTree(input);
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
