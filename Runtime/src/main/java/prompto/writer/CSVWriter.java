package prompto.writer;

import java.io.IOException;
import java.io.StringWriter;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import prompto.intrinsic.PromptoDict;
import prompto.intrinsic.PromptoDocument;
import prompto.intrinsic.PromptoList;

public class CSVWriter {

	public static String write(PromptoList<PromptoDocument<String, Object>> docs, PromptoList<String> headers, PromptoDict<String, String> mappings, Character separator, Character encloser) throws IOException {
		CSVWriter writer = new CSVWriter(headers, mappings, separator, encloser);
		return writer.write(docs);
	}
	
	List<String> headers;
	Map<String, String> mappings;
	String separator;
	String encloser;
	
	public CSVWriter(List<String> headers, Map<String, String> mappings, Character separator, Character encloser) {
		this.headers = headers;
		this.mappings = mappings;
		this.separator = separator==null ? "," : separator.toString();
		this.encloser = encloser==null ? "\"" : encloser.toString();
	}

	private String write(List<? extends Map<String, Object>> docs) throws IOException {
		try(StringWriter writer = new StringWriter()) {
			write(writer, docs);
			return writer.toString();
		}
	}

	private void write(StringWriter writer, List<? extends Map<String, Object>> docs) {
		List<String> headers = this.headers;
		if(mappings!=null)
			headers = headers.stream().map(s->mappings.getOrDefault(s, s)).collect(Collectors.toList());
		writeRow(writer, headers);
		for(Map<String, Object> doc : docs)
			writeRecord(writer, doc);
		
	}

	private void writeRecord(StringWriter writer, Map<String, Object> doc) {
		List<String> values = headers.stream()
				.map(doc::get)
				.map(v->v==null?"":v.toString())
				.collect(Collectors.toList());
		writeRow(writer, values);
	}

	private void writeRow(StringWriter writer, List<String> values) {
		String row = values.stream()
				.map(this::escapeIfRequired)
				.map(this::encloseIfRequired)
				.collect(Collectors.joining(separator));
		writer.write(row);
		writer.write("\n");
	}
	
	private String escapeIfRequired(String value) {
		return value.replaceAll(separator, "\\" + separator);
	}

	private String encloseIfRequired(String value) {
		return value.contains("\n") ? encloser + value.replaceAll(encloser, "\\" + encloser) + encloser : value;
	}

}
