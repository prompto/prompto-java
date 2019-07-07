package prompto.utils;

import org.apache.commons.text.StringEscapeUtils;

public abstract class HtmlUtils {
	
	public static String htmlEntitiesToUtf8(String text) {
		return StringEscapeUtils.unescapeHtml4(text);
	}

}
