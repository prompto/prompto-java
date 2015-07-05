package prompto.parser;



public enum Dialect {
	E("English", new EParserFactory()),
	O("Orient", new OParserFactory()),
	S("Snake", new SParserFactory());
	
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
