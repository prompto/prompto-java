package prompto.reader;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.esotericsoftware.yamlbeans.YamlReader;

import prompto.intrinsic.PromptoDocument;
import prompto.intrinsic.PromptoList;

@SuppressWarnings("unchecked")
public abstract class YAMLReader {
	
	public static PromptoList<PromptoDocument<String,Object>> read(String yaml) throws IOException {
		try {
			YamlReader reader = new YamlReader(yaml);
			Object value = reader.read();
			if(value instanceof Map)
				value = Collections.singletonList(value);
			if(value instanceof List)
				return (PromptoList<PromptoDocument<String,Object>>)convertList((List<?>) value);
			else
				throw new UnsupportedOperationException("Cannot convert from: " + value.getClass().getName());
		} catch(RuntimeException e) {
			throw new IOException(e.getMessage());
		}
	}

	public static Object convert(Object value) {
		if(value==null)
			return null;
		else if(value instanceof String)
			return convertString((String)value);
		else if(value instanceof Map)
			return convertMap((Map<String, Object>)value);
		else if(value instanceof List)
			return convertList((List<? extends Object>)value);
		else
			throw new UnsupportedOperationException("convert: " + value.getClass().getName());
	}
	
	private static Object convertString(String value) {
		return convertLong(value);
	}

	private static Object convertLong(String value) {
		try {
			return Long.parseLong(value);
		} catch(NumberFormatException e) {
			return convertDouble(value);
		}
	}

	private static Object convertDouble(String value) {
		try {
			return Double.parseDouble(value);
		} catch(NumberFormatException e) {
			return convertBoolean(value);
		}
	}

	private static Object convertBoolean(String value) {
		boolean bool = Boolean.parseBoolean(value); // always succeeds
		if(value.equals(String.valueOf(bool)))
			return bool;
		else
			return value;
	}

	private static Object convertMap(Map<String, Object> value) {
		PromptoDocument<String,Object> doc = new PromptoDocument<>();
		value.forEach((k, v)->doc.put(k, convert(v)));
		return doc;
	}

	private static PromptoList<? extends Object> convertList(List<? extends Object> value) {
		List<?> list = value.stream().map(YAMLReader::convert).collect(Collectors.toList());
		return new PromptoList<Object>(list, false);
	}


}
