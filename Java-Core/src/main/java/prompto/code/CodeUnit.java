package prompto.code;

import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.value.Document;
import prompto.value.Image;
import prompto.value.Text;

public class CodeUnit {
	
	private Text name;
	private Text version;
	private Text text;
	private Image image;
	
	public Text getName() {
		return name;
	}
	
	public void setName(Text name) {
		this.name = name;
	}
	
	public Text getVersion() {
		return version;
	}
	
	public void setVersion(Text version) {
		this.version = version;
	}
	
	public Text getText() {
		return text;
	}
	
	public void setText(Text text) {
		this.text = text;
	}
	
	public Image getImage() {
		return image;
	}
	
	public void setImage(Image image) {
		this.image = image;
	}

	protected void populate(Context context, Document document) {
		document.setMember(context, new Identifier("name"), name);
		document.setMember(context, new Identifier("version"), version);
		if(text!=null)
			document.setMember(context, new Identifier("text"), text);
		if(image!=null)
			document.setMember(context, new Identifier("image"), image);
	}
}
