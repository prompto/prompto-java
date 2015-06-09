package presto.store;

import presto.declaration.IDeclaration;

/* a code store is a place where a code consumer (interpreter, compiler...) can fetch code from */
/* code stores can be chained so that currently edited code can referred to stable code */
public interface ICodeStore {
	IDeclaration fetch(String name);
}
