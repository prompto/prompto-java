package prompto.compiler;

public class Instruction {

	static boolean DUMP = isDUMP();
	
	private static boolean isDUMP() {
		return false;
	}
	
	Opcode opcode;
	Operand[] operands;
	
	Instruction(Opcode opcode, Operand[] operands) {
		this.opcode = opcode;
		this.operands = operands;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(opcode.name());
		sb.append('/');
		if(operands==null || operands.length==0)
			sb.append("[]");
		else {
			sb.append('[');
			for(Operand o : operands) {
				sb.append(o.toString());
				sb.append(", ");
			}
			sb.setLength(sb.length()-2);
			sb.append(']');
		}
		return sb.toString();
	}
	
	void register(ConstantsPool pool) {
		for(Operand operand : operands) {
			if(operand instanceof ConstantOperand)
				((ConstantOperand)operand).register(pool);
		}
	}

	void writeTo(CodeAttribute byteCode, ByteWriter writer) {
		if(DUMP)
			System.err.println(this.toString());
		StackAttribute stack = byteCode.getStack();
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
					writer.writeU1(((ConstantOperand)operands[0]).index());
					break;
				case CPREF_W:
					writer.writeU2(((ConstantOperand)operands[0]).index());
					break;
				default:
					throw new UnsupportedOperationException(opcode.kind.name()); 
			}
		}
	}

	public MethodConstant getMethodConstant() {
		for(Operand operand : operands) {
			if(operand instanceof MethodConstant)
				return (MethodConstant)operand;
		}
		return null;
	}

	public FieldConstant getFieldConstant() {
		for(Operand operand : operands) {
			if(operand instanceof FieldConstant)
				return (FieldConstant)operand;
		}
		return null;
	}

	public ValueConstant getValueConstant() {
		for(Operand operand : operands) {
			if(operand instanceof ValueConstant)
				return (ValueConstant)operand;
		}
		return null;
	}

	public StackEntry getConstantStackEntryType() {
		ValueConstant v = getValueConstant();
		return v.toStackEntry();
	}

	public StackEntry getFieldStackEntryType() {
		FieldConstant f = getFieldConstant();
		String type = f.getDescriptor();
		return StackEntry.fromDescriptor(type);
	}

	public StackEntry getResultStackEntryType() {
		MethodConstant m = getMethodConstant();
		String[] types = m.getDescriptor();
		return StackEntry.fromDescriptor(types[types.length-1]);
	}

	public short getArgumentsCount(boolean isStatic) {
		MethodConstant m = getMethodConstant();
		String[] types = m.getDescriptor();
		return (short)(types.length - (isStatic ? 1 : 0));
	}

}
