package prompto.compiler;

public class Instruction {

	Opcode opcode;
	Operand[] operands;
	
	Instruction(Opcode opcode, Operand[] operands) {
		this.opcode = opcode;
		this.operands = operands;
	}

	void register(ConstantsPool pool) {
		for(Operand operand : operands) {
			if(operand instanceof ConstantOperand)
				((ConstantOperand)operand).register(pool);
		}
	}

	void writeTo(CodeAttribute byteCode, ByteWriter writer) {
		byteCode.popOperands(opcode.poppedOperands(this));
		byteCode.pushOperands(opcode.pushedOperands());
		if(opcode.kind.width==1)
			writer.writeU1(opcode.opcode);
		else
			writer.writeU2(opcode.opcode);
		if(opcode.kind.length==-1) {
			throw new UnsupportedOperationException(); // TODO
		} else if(operands.length>0) {
			switch(opcode.kind) {
				case LOCAL:
					writer.writeU1(((ByteOperand)operands[0]).value());
					break;
				case CPREF:
					writer.writeU1(((ConstantOperand)operands[0]).index());
					break;
				case CPREF_W:
					writer.writeU2(((ConstantOperand)operands[0]).index());
					break;
				default:
					throw new UnsupportedOperationException(); 
			}
		}
	}

	public int countMethodArguments() {
		for(Operand operand : operands) {
			if(operand instanceof MethodConstant)
				return ((MethodConstant)operand).getParamsCount();
		}
		return 0;
	}

}
