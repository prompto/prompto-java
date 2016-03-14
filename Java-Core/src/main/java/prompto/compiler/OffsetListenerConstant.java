package prompto.compiler;

public class OffsetListenerConstant extends ShortOperand implements IInstructionListener {

	boolean active = false;
	
	public OffsetListenerConstant() {
		super((short)0);
	}
	
	@Override
	public void activate() {
		active = true;
	}
	
	@Override
	public void inhibit() {
		active = false;
	}
	
	@Override
	public void onRehearse(IInstruction instruction) {
		if(active && instruction instanceof Instruction) {
			this.value += ((Instruction)instruction).opcode.kind.length;
		}
	}
}
