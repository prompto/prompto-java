package prompto.compiler;

import java.util.HashMap;
import java.util.Map;

public class Flags {

	Map<String, Object> values;
	
	public Flags() {
		this.values = new HashMap<>();
		this.values.put("native", false);
		this.values.put("reverse", false);
		this.values.put("decimal", false);
		this.values.put("opcode", null);
	}
	
	private Flags(Map<String, Object> values) {
		this.values = values;
	}
	
	private Flags clone(String key, Object value) { 
		Map<String, Object> values = new HashMap<>(this.values);
		values.put(key, value);
		return new Flags(values);
	}
	
	public boolean toNative() {
		return (boolean)values.get("native");
	}

	public Flags withNative(boolean set) {
		return clone("native", set);
	}

	public boolean isReverse() {
		return (boolean)values.get("reverse");
	}

	public Flags withReverse(boolean set) {
		return clone("reverse", set);
	}

	public boolean isDecimal() {
		return (boolean)values.get("decimal");
	}

	public Flags withDecimal(boolean set) {
		return clone("decimal", set);
	}

	public Opcode opcode() {
		return (Opcode)values.get("opcode");
	}

	public Flags withOpcode(Opcode opcode) {
		return clone("opcode", opcode);
	}



	
}
