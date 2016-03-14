package prompto.compiler;

public class Instruction implements IInstruction {

	static int DUMP_LEVEL = getDumpLevel();
	
	private static int getDumpLevel() {
		return 0;
	}
	
	Opcode opcode;
	IOperand[] operands;
	
	Instruction(Opcode opcode, IOperand[] operands) {
		this.opcode = opcode;
		this.operands = operands;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(opcode.name());
		sb.append(' ');
		if(operands==null || operands.length==0)
			sb.append("[]");
		else {
			sb.append('[');
			for(IOperand o : operands) {
				sb.append(o.toString());
				sb.append(", ");
			}
			sb.setLength(sb.length()-2);
			sb.append(']');
		}
		return sb.toString();
	}
	
	@Override
	public void rehearse(CodeAttribute code) {
		updateStack(code.getStack());
	}
	
	@Override
	public void register(ConstantsPool pool) {
		for(IOperand operand : operands) {
			if(operand instanceof IConstantOperand)
				((IConstantOperand)operand).register(pool);
		}
	}

	@Override
	public void writeTo(ByteWriter writer) {
		writeByteCode(writer);
		writeOperands(writer);
	}

	private void writeOperands(ByteWriter writer) {
		if(opcode.kind.length==-1) {
			throw new UnsupportedOperationException(); // TODO
		} else if(operands.length>0) {
			switch(opcode.kind) {
				case BYTE:
					writer.writeU1(((ByteOperand)operands[0]).value());
					break;
				case SHORT:
					writer.writeU2(((ShortOperand)operands[0]).value());
					break;
				case BRANCH:
					writer.writeU2(((ShortOperand)operands[0]).value());
					break;
				case LOCAL:
					writer.writeU1(((ByteOperand)operands[0]).value());
					break;
				case CPREF:
					writer.writeU1(((IConstantOperand)operands[0]).getIndexInConstantPool());
					break;
				case CPREF_W:
					writer.writeU2(((IConstantOperand)operands[0]).getIndexInConstantPool());
					break;
				case NO_OPERANDS:
					break;
				default:
					throw new UnsupportedOperationException(opcode.kind.name()); 
			}
		}
	}

	private void writeByteCode(ByteWriter writer) {
		if(opcode.kind.width==1)
			writer.writeU1(opcode.opcode);
		else
			writer.writeU2(opcode.opcode);
	}

	private void updateStack(StackMapTableAttribute stack) {
		if(DUMP_LEVEL>1) {
			System.err.println(this.toString());
			System.err.println("Before pop: " + stack.getState().toString());
		}
		StackEntry[] popped = stack.pop(opcode.getPopped(this));
		if(DUMP_LEVEL>1)
			System.err.println("After pop: " + stack.getState().toString());
		StackEntry[] pushed = opcode.getPushed(this, popped);
		stack.push(pushed);
		if(DUMP_LEVEL>1)
			System.err.println("After push: " + stack.getState().toString());
		else if(DUMP_LEVEL>0)
			System.err.println(this.toString() + " -> " + stack.getState().toString());
	}

	public ClassConstant getClassConstant() {
		for(IOperand operand : operands) {
			if(operand instanceof ClassConstant)
				return (ClassConstant)operand;
		}
		return null;
	}

	public MethodConstant getMethodConstant() {
		for(IOperand operand : operands) {
			if(operand instanceof MethodConstant)
				return (MethodConstant)operand;
		}
		return null;
	}

	public FieldConstant getFieldConstant() {
		for(IOperand operand : operands) {
			if(operand instanceof FieldConstant)
				return (FieldConstant)operand;
		}
		return null;
	}

	public ValueConstant getValueConstant() {
		for(IOperand operand : operands) {
			if(operand instanceof ValueConstant)
				return (ValueConstant)operand;
		}
		return null;
	}

	public StackEntry getConstantStackEntry() {
		ValueConstant v = getValueConstant();
		return v.toStackEntry();
	}

	public StackEntry getFieldStackEntry() {
		FieldConstant f = getFieldConstant();
		return f.toStackEntry();
	}

	public StackEntry getMethodResultStackEntry() {
		MethodConstant m = getMethodConstant();
		return m.resultToStackEntry();
	}

	public short getArgumentsCount(boolean isStatic) {
		MethodConstant m = getMethodConstant();
		return m.getArgumentsCount(isStatic);
	}


}
