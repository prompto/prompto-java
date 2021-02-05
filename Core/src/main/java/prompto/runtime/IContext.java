package prompto.runtime;

import prompto.parser.ICodeSection;
import prompto.parser.ISection;


public interface IContext {

	IContext getCallingContext();
	ICodeSection locateCodeSection(ISection section);

}
