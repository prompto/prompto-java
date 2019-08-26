package prompto.store;

public enum Family {
	// storable
	BOOLEAN,
	CHARACTER,
	INTEGER,
	DECIMAL,
	TEXT,
	UUID,
	DATE,
	TIME,
	DATETIME,
	PERIOD,
	VERSION,
	LIST,
	SET,
	TUPLE,
	RANGE,
	BLOB,
	IMAGE,
	DOCUMENT,
	CATEGORY,
	RESOURCE,
	DICTIONARY,
	ENUMERATED,
	// non storable
	VOID,
	NULL,
	ANY,
	METHOD,
	CURSOR,
	ITERATOR,
	STRUCTURE,
	CLASS,
	TYPE,
	CODE,
	JSX,
	CSS,
	HTML,
	// volatile
	MISSING
}