package prompto.literal;

import prompto.runtime.Context;
import prompto.type.IType;
import prompto.type.IntegerType;
import prompto.value.IntegerValue;

public class HexaLiteral extends Literal<IntegerValue> {

	
	public HexaLiteral(String text) {
		super(text,parseHexa(text));
	}


	@Override
	public IType check(Context context) {
		return IntegerType.instance();
	}
	
	
	static public IntegerValue parseHexa(String text) {
		long value = 0;
		for(char c : text.substring(2).toCharArray()) {
			value <<= 4;
			if(c>='0' && c<='9')
				value += (c - '0');
			else if(c>='a' && c<='f')
				value += (c - 'a');
			else if(c>='A' && c<='F')
				value += 10 + (c - 'A');
			else
				throw new NumberFormatException(text + " is not a valid hexadecimal number");
		}
		return new IntegerValue(value);
	}
	
}
