package prompto.compiler;

public class Instruction {

	static boolean DUMP = isDUMP();
	
	private static boolean isDUMP() {
		return false;
	}
	
	Opcode opcode;
	IOperand[] operands;
	StackLabel label;
	StackState state;
	
	Instruction(Opcode opcode, IOperand[] operands) {
		this.opcode = opcode;
		this.operands = operands;
	}
	
	public StackLabel getStackLabel() {
		return label;
	}
	
	public void setStackLabel(StackLabel label) {
		this.label = label;
	}

	public StackState getStackState() {
		return state;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(opcode.name());
		sb.append('/');
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
	
	void register(ConstantsPool pool) {
		for(IOperand operand : operands) {
			if(operand instanceof IConstantOperand)
				((IConstantOperand)operand).register(pool);
		}
	}

	void writeTo(CodeAttribute byteCode, ByteWriter writer) {
		if(DUMP)
			System.err.println(this.toString());
		StackMapTableAttribute stack = byteCode.getStack();
		if(DUMP)
			System.err.println("Before pop: " + stack.toString());
		StackEntry[] popped = stack.pop(opcode.getPopped(this));
		if(DUMP)
			System.err.println("After pop: " + stack.toString());
		StackEntry[] pushed = opcode.getPushed(this, popped);
		byteCode.getStack().push(pushed);
		if(DUMP)
			System.err.println("After push: " + stack.toString());
		if(opcode.kind.width==1)
			writer.writeU1(opcode.opcode);
		else
			writer.writeU2(opcode.opcode);
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
				default:
					throw new UnsupportedOperationException(opcode.kind.name()); 
			}
		}
		if(state!=null)
			state.capture(stack.state);
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

	public StackState recordState() {
		if(state==null)
			state = new StackState();
		return state;
	}



}
