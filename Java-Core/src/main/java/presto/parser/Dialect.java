package presto.parser;



public enum Dialect {
	E(new EParserFactory()),
	O(new OParserFactory()),
	S(new SParserFactory());
	
	IParserFactory parserFactory;
	
	Dialect(IParserFactory factory) {
		this.parserFactory = factory;
	}
	
	public IParserFactory getParserFactory() {
		return parserFactory;
	}

}
