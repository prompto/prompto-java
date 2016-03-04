package prompto.compiler;

import java.lang.reflect.Modifier;
import java.util.LinkedList;
import java.util.List;

class MethodInfo {
	
	int accessFlags = Modifier.PUBLIC;
	StringConstant name;
	StringConstant proto;
	List<Attribute> attributes = new LinkedList<>();
	ByteCode codeAttribute = null;
	
	MethodInfo(String name, String spec) {
		this.name = new StringConstant(name);
		this.proto = new StringConstant(spec);
	}

	void addModifier(int modifier) {
		accessFlags |= modifier;
	}

	public void addInstruction(Opcode op, Constant ... operands) {
		createCodeAttribute();
		codeAttribute.addInstruction(new Instruction(op, operands));
	}


	void register(ConstantsPool pool) {
		name.register(pool);
		proto.register(pool);
		attributes.forEach((a)->a.register(pool));
	}

	private void createCodeAttribute() {
		if(codeAttribute==null) {
			int paramsCount = Utils.getParamsCount(proto.getValue());
			codeAttribute = new ByteCode(paramsCount, Modifier.isStatic(accessFlags));
			attributes.add(codeAttribute);
		}
	}

	void writeTo(ByteWriter writer) {
		/*
		method_info {
		    u2             access_flags;
		    u2             name_index;
		    u2             descriptor_index;
		    u2             attributes_count;
		    attribute_info attributes[attributes_count];
		}
		*/
		writer.writeU2(accessFlags);
		writer.writeU2(name.index());
		writer.writeU2(proto.index());
		writer.writeU2(attributes.size());
		attributes.forEach((a)->a.writeTo(writer));
	}



}
