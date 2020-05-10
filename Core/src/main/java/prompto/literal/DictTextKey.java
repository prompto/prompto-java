package prompto.literal;

import prompto.grammar.Identifier;
import prompto.utils.StringUtils;

public class DictTextKey extends DictKey {

	String text;
	
	public DictTextKey(String text) {
		this.text = text;
	}
	
	@Override
	public String toString() {
		return text;
	}
	
	@Override
	protected String asKey() {
		return StringUtils.unescape(text);
	}
	
	@Override
	protected Identifier asIdentifier() {
		Identifier id = new Identifier(text.substring(1, text.length() - 1));
		id.setFrom(this);
		return id;
	}

}
