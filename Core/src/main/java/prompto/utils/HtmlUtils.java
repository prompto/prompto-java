package prompto.utils;

import org.apache.commons.text.StringEscapeUtils;

public abstract class HtmlUtils {
	
	public static String decodeHtmlEntities(String text) {
		return StringEscapeUtils.unescapeHtml4(text);
	}

	public static String encodeHtmlEntities(String text) {
		return StringEscapeUtils.escapeHtml4(text);
	}
}
