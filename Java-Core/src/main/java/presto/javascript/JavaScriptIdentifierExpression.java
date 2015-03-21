package presto.javascript;

import presto.utils.CodeWriter;



public class JavaScriptIdentifierExpression implements JavaScriptExpression {

	public static JavaScriptIdentifierExpression parse(String ids) {
		String[] parts = ids.split("\\.");
		JavaScriptIdentifierExpression result = null;
		for(String part : parts)
			result = new JavaScriptIdentifierExpression(result,part);
		return result;
	}
	
	JavaScriptIdentifierExpression parent;
	String identifier;
	
	public JavaScriptIdentifierExpression(String identifier) {
		this.identifier = identifier;
	}

	public JavaScriptIdentifierExpression(JavaScriptIdentifierExpression parent, String identifier) {
		this.parent = parent;
		this.identifier = identifier;
	}
	
	public JavaScriptIdentifierExpression getParent() {
		return parent;
	}
	
	public String getIdentifier() {
		return identifier;
	}
	
	@Override
	public String toString() {
		if(parent==null)
			return identifier;
		else 
			return parent.toString() + "." + identifier;
	}
		
	@Override
	public void toDialect(CodeWriter writer) {
		if(parent!=null) {
			parent.toDialect(writer);
			writer.append('.');
		}
		writer.append(identifier);
	}

}
