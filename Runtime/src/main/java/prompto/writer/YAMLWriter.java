package prompto.writer;

import java.io.IOException;
import java.io.StringWriter;

import com.esotericsoftware.yamlbeans.YamlWriter;

import prompto.intrinsic.PromptoDocument;
import prompto.intrinsic.PromptoList;

public abstract class YAMLWriter {

	public static String write(PromptoList<PromptoDocument<String, Object>> docs) throws IOException {
		StringWriter yaml = new StringWriter();
		YamlWriter writer = new YamlWriter(yaml);
		writer.write(docs);
		writer.close();
		yaml.flush();
		return yaml.toString();
	}

}
