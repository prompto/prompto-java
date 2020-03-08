package prompto.writer;

import java.io.IOException;
import java.io.StringWriter;

import com.esotericsoftware.yamlbeans.YamlConfig;
import com.esotericsoftware.yamlbeans.YamlConfig.WriteClassName;
import com.esotericsoftware.yamlbeans.YamlWriter;

import prompto.intrinsic.PromptoDocument;
import prompto.intrinsic.PromptoList;

public abstract class YAMLWriter {

	public static String write(PromptoList<PromptoDocument<String, Object>> docs) throws IOException {
		Object data = docs.size()==1 ? docs.get(0) : docs;
		return write(data);
	}
	
	public static String write(Object data) throws IOException {
		StringWriter yaml = new StringWriter();
		YamlConfig config = new YamlConfig();
		config.writeConfig.setWriteClassname(WriteClassName.NEVER);
		config.writeConfig.setWriteRootTags(false);
		YamlWriter writer = new YamlWriter(yaml, config);
		writer.write(data);
		writer.close();
		yaml.flush();
		return yaml.toString();
	}

}
