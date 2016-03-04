package prompto.compiler;

import java.lang.reflect.Modifier;
import java.rmi.UnexpectedException;
import java.util.ArrayList;
import java.util.List;

class Method {
	
	int accessFlags = Modifier.PUBLIC;
	StringConstant name;
	StringConstant proto;
	List<Attribute> attributes = new ArrayList<>();
	ByteCode code;
	
	Method(String name, String spec) {
		this.name = new StringConstant(name);
		this.proto = new StringConstant(spec);
	}

	void addModifier(int modifier) {
		accessFlags |= modifier;
	}

	public ByteCode createCode() {
		if(code==null) {
			code = new ByteCode(getParamsCount(), Modifier.isStatic(accessFlags));
			attributes.add(code);
		}
		return code;
	}

	private int getParamsCount() {
		int count = 0;
		String proto = this.proto.getValue();
		while(proto.length()>0) {
			switch(proto.charAt(0)) {
			case '(':
				proto = proto.substring(1);
				continue;
			case ')':
				return count;
			case 'L':
				count++;
				proto = proto.substring(proto.indexOf(';') + 1);
				continue;
			default:
				count++;
				proto = proto.substring(1);
				continue;
			}
		}
		throw new CompilerException(new UnexpectedException("Should never get there"));
	}

	void register(ConstantsPool pool) {
		name.register(pool);
		proto.register(pool);
		attributes.forEach((a)->a.register(pool));
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
