package prompto.compiler;

public class OffsetListenerConstant extends ShortOperand implements IInstructionListener {

	boolean active = false;
	short factor = 1;
	
	public OffsetListenerConstant() {
		super((short)0);
	}

	public OffsetListenerConstant(boolean reverse) {
		super((short)0);
		this.factor = reverse ? (short)-1 : 1;
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
			this.value += factor*((Instruction)instruction).opcode.kind.length;
		}
	}
}
