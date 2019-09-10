package prompto.property;

import java.io.IOException;
import java.io.Writer;

import prompto.jsx.JsxProperty;
import prompto.runtime.Context;

public class Property {
	
	String name;
	String help;
	IPropertyValidator validator = AlwaysValidator.INSTANCE;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean isRequired() {
		return validator.isRequired();
	}
	
	public void setRequired(boolean set) {
		validator = set ? validator.required() : validator.optional();
	}
	
	public void setRequiredForAccessibility(boolean set) {
		validator = set ? validator.requiredForAccessibility() : validator.optionalForAccessibility();
	}

	
	public IPropertyValidator getValidator() {
		return validator;
	}
	
	public void setValidator(IPropertyValidator validator) {
		if(this.validator.isRequired())
			this.validator = validator.required();
		else
			this.validator = validator.optional();
	}
	
	public void validate(Context context, JsxProperty prop) {
		validator.validate(context, prop);
	}

	public String getHelp() {
		return help;
	}
	
	public void setHelp(String help) {
		this.help = help;
	}

	@Override
	public String toString() {
		return "{ name=" + name + ", help=" + help + "}";
	}

	public void toLiteral(Writer writer) throws IOException {
		writer.append(name).append(": ");
		if(help!=null || validator.isRequired()) {
			writer.append("{ ")
				.append(validator.getKeyName())
				.append(": ")
				.append(validator.toLiteral());
			if(help!=null) {
				String escaped = help.replaceAll("\"", "'");
				writer.append(", help: \"").append(escaped).append("\"");
			}
			if(validator.isRequired())
				writer.append(", required: true");
			writer.append('}');
		} else 
			writer.append(getValidator().toLiteral());
	}


	
}
