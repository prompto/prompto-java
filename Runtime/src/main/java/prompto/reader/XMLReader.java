package prompto.reader;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import prompto.intrinsic.PromptoDocument;

public class XMLReader {

	public static PromptoDocument<String,Object> read(String xml, boolean keepNamespaces, boolean keepAttributes) throws IOException {
		return new XMLReader(keepNamespaces, keepAttributes).read(xml);
	}
	
	boolean keepNamespaces;
	boolean keepAttributes;
	
	
	public XMLReader(boolean keepNamespaces, boolean keepAttributes) {
		this.keepNamespaces = keepNamespaces;
		this.keepAttributes = keepAttributes;
	}

	private PromptoDocument<String, Object> read(String xml) throws IOException {
		try (InputStream input = new ByteArrayInputStream(xml.getBytes())){
			DocumentBuilderFactory factory = DocumentBuilderFactory.newDefaultInstance();
			factory.setNamespaceAware(keepAttributes);
			factory.setIgnoringComments(true);
			factory.setIgnoringElementContentWhitespace(true);
			Document doc = factory.newDocumentBuilder().parse(input);
			return (PromptoDocument<String,Object>)convertDocument(doc);
		} catch(Exception e) {
			throw new IOException(e.getMessage());
		}
	}

	private PromptoDocument<String, Object> convertDocument(Document doc) {
		PromptoDocument<String, Object> result = new PromptoDocument<>();
		Element root = doc.getDocumentElement();
		convertElement(result, root);
		return result;
	}

	private void convertElement(PromptoDocument<String, Object> parent, Element element) {
		var tagName = element.getTagName();
		// cater for repeated elements
		if(parent.containsKey(tagName))
			convertListElement(parent, tagName, element);
		else
			parent.put(tagName, convertElementValue(element));
	}
	
	@SuppressWarnings("unchecked")
	private void convertListElement(PromptoDocument<String, Object> parent, String tagName, Element element) {
		List<Object> list = null;
		var current = parent.get(tagName);
		if(current instanceof List)
			list = (List<Object>)current;
		else {
			list = new ArrayList<Object>();
			list.add(current);
			parent.put(tagName, list);
		}
		list.add(convertElementValue(element));
	}
	
	private Object convertElementValue(Element element) {
		var hasAttributes = keepAttributes && element.getAttributes().getLength() > 0;
		var hasChildren = elementHasChildren(element);
		if(hasAttributes || hasChildren) {
			PromptoDocument<String, Object> result = new PromptoDocument<>();
			if(keepAttributes) {
				var attributes = element.getAttributes();
				IntStream.range(0, attributes.getLength())
					.mapToObj(i -> attributes.item(i))
					.forEach(n -> result.put("@" + n.getNodeName(), n.getTextContent()));
			}
			if(hasChildren) {
				var children = element.getChildNodes();
				IntStream.range(0, children.getLength())
					.mapToObj(i -> children.item(i))
					.filter(n -> n instanceof Element)
					.map(n -> (Element)n)
					.forEach(e -> convertElement(result, e));
			} else
				result.put("$value", element.getTextContent());
			return result;
		} else
			return element.getTextContent();
	}

	private boolean elementHasChildren(Element element) {
		var children = element.getChildNodes();
		return IntStream.range(0, children.getLength())
				.mapToObj(i -> children.item(i))
				.anyMatch(n -> n instanceof Element);
	}

}
