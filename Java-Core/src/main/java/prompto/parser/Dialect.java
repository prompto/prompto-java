package prompto.parser;



public enum Dialect {
	E("Engly", new EParserFactory()),
	O("Objy", new OParserFactory()),
	S("Snaky", new SParserFactory());
	
	String friendlyName;
	IParserFactory parserFactory;
	
	Dialect(String friendlyName, IParserFactory factory) {
		this.friendlyName = friendlyName;
		this.parserFactory = factory;
	}
	
	public String getFriendlyName() {
		return friendlyName;
	}
	
	public IParserFactory getParserFactory() {
		return parserFactory;
	}

}
