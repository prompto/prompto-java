package prompto.compiler;

import prompto.grammar.Identifier;

public abstract class Namer {

	static final char PROMPTO_CHAR = 'π';
	static final char CLASS_CHAR = 'χ';
	static final char METHOD_CHAR = 'µ';
			
	public static String getGlobalMethodClassName(Identifier id) {
		return getGlobalMethodClassName(id.getName());
	}

	public static String getGlobalMethodClassName(String name) {
		return "" + PROMPTO_CHAR + '/' + CLASS_CHAR + '/' + METHOD_CHAR + '/' + name;
	}

}
