package prompto.utils;

import java.util.Map;
import java.util.stream.Collectors;

import com.esotericsoftware.yamlbeans.YamlException;
import com.esotericsoftware.yamlbeans.YamlReader;
import com.esotericsoftware.yamlbeans.YamlWriter;

@SuppressWarnings("unchecked")
public abstract class YamlUtils {

	public static void copy(YamlReader reader, YamlWriter writer) throws YamlException {
		Object value = reader.read();
		value = fixAliases(value);
		writer.write(value);
	}

	private static Object fixAliases(Object value) {
		if(value instanceof Map)
			return fixAliases((Map<String, Object>)value);
		else
			throw new UnsupportedOperationException();
	}
	
	private static Map<String, Object> fixAliases(Map<String, Object> value) {
		return value.entrySet().stream()
			.map(YamlUtils::fixAliases)
			.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
	}
	
	private static Map.Entry<String, Object> fixAliases(Map.Entry<String, Object> value) {
		return value;
	}
}
