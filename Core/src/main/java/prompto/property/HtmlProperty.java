package prompto.property;

import java.util.Set;

public class HtmlProperty extends Property {

	Set<String> tags;
	
	public void setTags(Set<String> tags) {
		this.tags = tags;
	}
	
	public Set<String> getTags() {
		return tags;
	}
	
	@Override
	public String toString() {
		return "name=" + name + ", type= " + validator + ", tags: " + tags + ", help=" + help;
	}
}
