package presto.runtime;

import presto.parser.ISection;


public interface IContext {

	IContext getCallingContext();
	ISection findSectionFor(String path, int lineNumber);

}
