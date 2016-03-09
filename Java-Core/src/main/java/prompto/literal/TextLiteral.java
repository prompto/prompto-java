package prompto.literal;

import java.io.IOException;
import java.io.StreamTokenizer;
import java.io.StringReader;

import prompto.compiler.ResultInfo;
import prompto.compiler.ConstantOperand;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.StringConstant;
import prompto.error.SyntaxError;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.type.TextType;
import prompto.value.Text;


public class TextLiteral extends Literal<Text> {

	public TextLiteral(String text) {
		super(text,unescape(text));
	}

	private static Text unescape(String text) {
		StreamTokenizer parser = new StreamTokenizer(new StringReader(text));
		try {
		  parser.nextToken();
		  return new Text(parser.sval);
		}
		catch (IOException e) {
		  throw new RuntimeException(e);
		}
	}

	@Override
	public IType check(Context context) {
		return TextType.instance();
	}
	

	@Override
	public ResultInfo compile(Context context, MethodInfo method, boolean toNative) throws SyntaxError {
		ConstantOperand operand = new StringConstant(value.getValue());
		method.addInstruction(Opcode.LDC_W, operand);
		return new ResultInfo(String.class, true);
	}
}
