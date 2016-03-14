package prompto.compiler;

public interface IInstructionListener extends IOperand {

	default void activate() {};
	default void inhibit() {};
	default void onRehearse(IInstruction instruction) {};
	default void onRegister(IInstruction instruction) {};
	default void onWriteTo(IInstruction instruction) {};
}
