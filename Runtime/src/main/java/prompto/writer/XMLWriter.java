package prompto.writer;

import java.io.IOException;
import java.io.StringWriter;
import java.util.List;
import java.util.stream.Collectors;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import prompto.intrinsic.PromptoDict;
import prompto.intrinsic.PromptoDocument;
import prompto.intrinsic.PromptoList;
import prompto.intrinsic.PromptoSet;

@SuppressWarnings("unchecked")
public class XMLWriter {

	public static String write(PromptoDocument<String, Object> doc) throws IOException {
		try {
			Document document = new XMLWriter().convertToDocument(doc);
			return documentToString(document);
		} catch(Throwable t) {
			throw new IOException(t);
		}}
	
	private static String documentToString(Document document) throws TransformerException {
		Transformer transformer = TransformerFactory.newInstance().newTransformer();
		transformer.setOutputProperty(OutputKeys.INDENT, "no");
		StringWriter writer = new StringWriter();
		transformer.transform(new DOMSource(document), new StreamResult(writer));
		return writer.getBuffer().toString();
	}

	Document document;
	
	private Document convertToDocument(PromptoDocument<String, Object> doc) throws ParserConfigurationException {
		var keys = doc.keySet().stream().filter(s -> !s.startsWith("@")).collect(Collectors.toList());
		if(keys.size()!=1)
			throw new IllegalArgumentException("Document must have a single root element");
		document = DocumentBuilderFactory.newDefaultInstance().newDocumentBuilder().newDocument();
		Element root = convertRootDocument(keys.get(0), doc);
		document.appendChild(root);
		return document;
	}

	private Element convertRootDocument(String tagName, PromptoDocument<String, Object> doc) {
		Element element = document.createElement(tagName);
		setElementAttributes(element, doc);
		convertValue(element, doc.get(tagName));
		return element;
	}

	private void setElementAttributes(Element element, PromptoDocument<String, Object> doc) {
		doc.keySet().stream()
			.filter(s -> s.startsWith("@"))
			.forEach(s -> element.setAttribute(s.substring(1), doc.get(s).toString()));
	}

	private void convertValue(Element parent, Object value) {
		if(value==null)
			return;
		else if(value instanceof PromptoList)
			((PromptoList<Object>)value).forEach(item -> convertValue(parent, value));
		else if(value instanceof PromptoSet)
			((PromptoSet<Object>)value).forEach(item -> convertValue(parent, value));
		else if(value instanceof PromptoDict)
			convertDict(parent, (PromptoDict<String, Object>)value);
		else if(value instanceof PromptoDocument)
			convertDocument(parent, (PromptoDocument<String, Object>)value);
		else	
			parent.setTextContent(value.toString());
	}

	private void convertDict(Element parent, PromptoDict<String, Object> value) {
		value.entrySet().forEach(e -> {
			Element element = document.createElement(e.getKey());
			convertValue(element, e.getValue());
			parent.appendChild(element);
		});
		
	}

	private void convertDocument(Element parent, PromptoDocument<String, Object> value) {
		setElementAttributes(parent, value);
		List<String> children = value.keySet().stream().filter(s -> !s.startsWith("@") && !s.equals("$value")).collect(Collectors.toList());
		if(children.size() > 0) {
			children.stream().forEach(s -> {
				Element element = document.createElement(s);
				convertValue(element, value.get(s));
				parent.appendChild(element);
			});
		} else 
			parent.setTextContent(String.valueOf(value.get("$value")));
	}



}
