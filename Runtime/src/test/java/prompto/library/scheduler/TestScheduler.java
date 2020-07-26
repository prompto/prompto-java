package prompto.library.scheduler;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.e.BaseEParserTest;
import prompto.runtime.ApplicationContext;
import prompto.runtime.Context;
import prompto.runtime.utils.Out;

public class TestScheduler extends BaseEParserTest {
	
	Context savedContext;
	
	@Before
	public void before() throws Exception {
		Out.init();
		loadDependency("core");
		savedContext = ApplicationContext.set(coreContext);
	}

	@After
	public void after() {
		Out.restore();
		ApplicationContext.set(savedContext);
		savedContext = null;
	}

	@Test
	public void testInterpretedSchedule() throws Exception {
		runInterpretedTests("prompto/scheduler.pec", true);
	}
	
 
	@Test
	public void testCompiledSchedule() throws Exception {
		runCompiledTests("prompto/scheduler.pec", true);
	}
 /*
	@Test
	public void testTranspiledSchedule() throws Exception {
		runTranspiledTests("prompto/scheduler.pec", true);
	}
*/

}

