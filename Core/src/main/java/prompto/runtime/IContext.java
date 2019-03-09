package prompto.runtime;

import prompto.parser.ISection;


public interface IContext {

	IContext getCallingContext();
	ISection locateSection(ISection section);

}
