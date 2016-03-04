package prompto.compiler;

public class Instruction {

	Opcode opcode;
	Constant[] operands;
	
	Instruction(Opcode opcode, Constant[] operands) {
		this.opcode = opcode;
		this.operands = operands;
	}

	void register(ConstantsPool pool) {
		for(Constant operand : operands)
			operand.register(pool);
	}

	void writeTo(ByteCode byteCode, ByteWriter writer) {
		int operandsCount = opcode.countOperands(this);
		if(operandsCount<0)
			byteCode.popOperands(-operandsCount);
		else
			byteCode.pushOperands(operandsCount);
		writer.writeU2(opcode.opcode);
		for(Constant operand : operands)
			writer.writeU2(operand.index());
	}

	public int countMethodArguments() {
		for(Constant operand : operands) {
			if(operand instanceof MethodConstant)
				return ((MethodConstant)operand).getParamsCount();
		}
		return 0;
	}

}
