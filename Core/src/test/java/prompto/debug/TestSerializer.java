package prompto.debug;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.util.Collections;

import org.junit.Test;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.BooleanNode;

import prompto.debug.event.ConnectedDebugEvent;
import prompto.debug.event.ProcessReadyDebugEvent;
import prompto.debug.event.ProcessTerminatedDebugEvent;
import prompto.debug.event.WorkerCompletedDebugEvent;
import prompto.debug.event.WorkerResumedDebugEvent;
import prompto.debug.event.WorkerStartedDebugEvent;
import prompto.debug.event.WorkerSuspendedDebugEvent;
import prompto.debug.request.GetLineDebugRequest;
import prompto.debug.request.GetProcessStatusDebugRequest;
import prompto.debug.request.GetVariableDebugRequest;
import prompto.debug.request.GetVariablesDebugRequest;
import prompto.debug.request.GetWorkerStackDebugRequest;
import prompto.debug.request.GetWorkerStatusDebugRequest;
import prompto.debug.request.GetWorkersDebugRequest;
import prompto.debug.request.InstallBreakpointDebugRequest;
import prompto.debug.request.InstallBreakpointsDebugRequest;
import prompto.debug.request.IsSteppingDebugRequest;
import prompto.debug.request.ResumeDebugRequest;
import prompto.debug.request.StepIntoDebugRequest;
import prompto.debug.request.StepOutDebugRequest;
import prompto.debug.request.StepOverDebugRequest;
import prompto.debug.request.SuspendDebugRequest;
import prompto.debug.request.TerminateDebugRequest;
import prompto.debug.response.GetLineDebugResponse;
import prompto.debug.response.GetProcessStatusDebugResponse;
import prompto.debug.response.GetVariableDebugResponse;
import prompto.debug.response.GetVariablesDebugResponse;
import prompto.debug.response.GetWorkerStackDebugResponse;
import prompto.debug.response.GetWorkerStatusDebugResponse;
import prompto.debug.response.GetWorkersDebugResponse;
import prompto.debug.response.IsSteppingDebugResponse;
import prompto.debug.response.VoidDebugResponse;
import prompto.debug.stack.IStack;
import prompto.debug.stack.LeanStack;
import prompto.debug.stack.StackFrameTestUtils;
import prompto.debug.value.FatValue;
import prompto.debug.variable.FatVariable;
import prompto.debug.variable.IVariable;
import prompto.debug.worker.IWorker;
import prompto.debug.worker.LeanWorker;
import prompto.parser.Dialect;
import prompto.parser.Location;
import prompto.parser.Section;

public class TestSerializer {

	@Test
	public void eventsAreSerialized() throws Exception {
		testRoundRobin(new ConnectedDebugEvent("host", 8080));
		testRoundRobin(new ProcessReadyDebugEvent());
		testRoundRobin(new ProcessTerminatedDebugEvent());
		testRoundRobin(new WorkerCompletedDebugEvent().withWorkerId("Hello"));
		testRoundRobin(new WorkerResumedDebugEvent().withResumeReason(ResumeReason.STEP_OUT).withWorkerId("Hello"));
		testRoundRobin(new WorkerStartedDebugEvent().withName("name").withWorkerId("Hello"));
		testRoundRobin(new WorkerSuspendedDebugEvent().withSuspendReason(SuspendReason.BREAKPOINT).withWorkerId("Hello"));
	}
	

	@Test
	public void requestsAreSerialized() throws Exception {
		testRoundRobin(new GetLineDebugRequest().withWorkerId("Hello"));
		testRoundRobin(new GetVariableDebugRequest().<GetVariableDebugRequest>withWorkerId("Hello").withName("MyVar").withStackFrame(StackFrameTestUtils.someStackFrame()));
		testRoundRobin(new GetVariablesDebugRequest().<GetVariablesDebugRequest>withWorkerId("Hello").withStackFrame(StackFrameTestUtils.someStackFrame()));
		testRoundRobin(new GetWorkerStackDebugRequest().withWorkerId("32"));
		testRoundRobin(new GetWorkerStatusDebugRequest().withWorkerId("32"));
		testRoundRobin(new IsSteppingDebugRequest().withWorkerId("32"));
		testRoundRobin(new ResumeDebugRequest().withWorkerId("32"));
		testRoundRobin(new StepIntoDebugRequest().withWorkerId("32"));
		testRoundRobin(new StepOutDebugRequest().withWorkerId("32"));
		testRoundRobin(new StepOverDebugRequest().withWorkerId("32"));
		testRoundRobin(new SuspendDebugRequest().withWorkerId("32"));
		testRoundRobin(new TerminateDebugRequest().withWorkerId("32"));
		testRoundRobin(new GetProcessStatusDebugRequest());
		testRoundRobin(new GetWorkersDebugRequest());
		testRoundRobin(new InstallBreakpointDebugRequest().withSection(someSection()));
		testRoundRobin(new InstallBreakpointsDebugRequest().withSections(Collections.singletonList(someSection())));
	}
	
	@Test
	public void responsesAreSerialized() throws Exception {
		testRoundRobin(new VoidDebugResponse());
		testRoundRobin(new GetLineDebugResponse(100, 50));
		testRoundRobin(new IsSteppingDebugResponse(true));
		testRoundRobin(new GetProcessStatusDebugResponse(ProcessStatus.PROCESS_TERMINATED));
		testRoundRobin(new GetWorkerStatusDebugResponse(WorkerStatus.WORKER_SUSPENDED));
		testRoundRobin(new GetVariableDebugResponse(someVariable()));
		testRoundRobin(new GetVariablesDebugResponse(Collections.singletonList(someVariable())));
		testRoundRobin(new GetWorkersDebugResponse(Collections.singletonList(someWorker())));
		testRoundRobin(new GetWorkerStackDebugResponse(someStack()));
	}
	
	private IStack<?> someStack() {
		LeanStack stack = new LeanStack(); 
		stack.add(StackFrameTestUtils.someStackFrame());
		return stack;
	}


	private IWorker someWorker() {
		return new LeanWorker()
				.withWorkerId("123")
				.withName("worker")
				.withWorkerState(WorkerStatus.WORKER_COMPLETED);
	}
	
	private IVariable someVariable() {
		JsonNode jsonData = BooleanNode.TRUE;
		FatValue value = new FatValue().withValueData(jsonData).withTypeName("Boolean").withValueString("true");
		return new FatVariable().withValue(value).withName("var").withTypeName("Text");
	}


	private Section someSection() {
		Section s = new Section();
		s.setPath("path");
		s.setStart(new Location(100, 200, 300));
		s.setEnd(new Location(400, 500, 600));
		s.setDialect(Dialect.O);
		s.setBreakpoint(true);
		return s;
	}

	private void testRoundRobin(Object value) throws Exception {
		try (ByteArrayOutputStream output = new ByteArrayOutputStream()) {
			Serializer.writeMessage(output, value);
			String message = output.toString();
			Object read = Serializer.readMessage(message);
			assertEquals(value, read);
		}
	}
}
