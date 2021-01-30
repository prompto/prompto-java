package prompto.debug.request;

import prompto.debug.IDebugger;
import prompto.debug.response.IDebugResponse;
import prompto.utils.Logger;

public interface IDebugRequest {

	static Logger logger = new Logger();

	IDebugResponse execute(IDebugger debugger);

}
