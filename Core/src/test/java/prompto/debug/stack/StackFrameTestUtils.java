package prompto.debug.stack;

public abstract class StackFrameTestUtils {

	public static LeanStackFrame someStackFrame() {
		LeanStackFrame sf = new LeanStackFrame();
		sf.filePath = "filePath";
		sf.index = 100;
		sf.startCharIndex = 200;
		sf.endCharIndex = 300;
		sf.categoryName = "categoryName";
		sf.methodName = "methodName";
		sf.methodProto ="methodProto";
		sf.methodLine = 400;
		sf.statementLine = 500;
		return sf;
	}

}
