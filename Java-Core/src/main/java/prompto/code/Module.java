package prompto.code;

import prompto.code.ICodeStore.ModuleType;
import prompto.error.PromptoError;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.store.IStorable;
import prompto.value.Image;
import prompto.value.Text;

public abstract class Module {
	
	private Text name;
	private Text version;
	private Text description;
	private Image image;
	
	public abstract ModuleType getType();
	
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
	
	public Text getDescription() {
		return description;
	}
	
	public void setDescription(Text description) {
		this.description = description;
	}
	
	public Image getImage() {
		return image;
	}
	
	public void setImage(Image image) {
		this.image = image;
	}

	public void populate(Context context, IStorable storable) throws PromptoError {
		storable.setValue(context, new Identifier("name"), name);
		storable.setValue(context, new Identifier("version"), version);
		if(description!=null)
			storable.setValue(context, new Identifier("description"), description);
		if(image!=null)
			storable.setValue(context, new Identifier("image"), image);
	}
}
