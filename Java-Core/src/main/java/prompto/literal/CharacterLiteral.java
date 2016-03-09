package prompto.literal;

import java.io.IOException;
import java.io.StreamTokenizer;
import java.io.StringReader;

import prompto.compiler.ByteOperand;
import prompto.compiler.CompilerUtils;
import prompto.compiler.IntConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.compiler.ShortOperand;
import prompto.error.SyntaxError;
import prompto.runtime.Context;
import prompto.type.CharacterType;
import prompto.type.IType;
import prompto.value.Character;


public class CharacterLiteral extends Literal<Character> {

	public CharacterLiteral(String text) {
		super(text,unescape(text));
	}

	private static Character unescape(String text) {
		StreamTokenizer parser = new StreamTokenizer(new StringReader(text));
		try {
		  parser.nextToken();
		  return new Character(parser.sval.charAt(0));
		}
		catch (IOException e) {
		  throw new RuntimeException(e);
		}
	}

	@Override
	public IType check(Context context) {
		return CharacterType.instance();
	}
	
	@Override
	public ResultInfo compile(Context context, MethodInfo method) throws SyntaxError {
		char c = value.getValue();
		if((c&0xFFFFFF00)==0)
			method.addInstruction(Opcode.BIPUSH, new ByteOperand((byte)c));
		else if((c&0xFFFF0000)==0)
			method.addInstruction(Opcode.SIPUSH, new ShortOperand((short)c));
		else
			method.addInstruction(Opcode.LDC_W, new IntConstant(c));
		return CompilerUtils.charToCharacter(method);
	}



}
