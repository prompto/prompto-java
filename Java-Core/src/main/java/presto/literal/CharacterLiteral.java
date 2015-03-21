package presto.literal;

import java.io.IOException;
import java.io.StreamTokenizer;
import java.io.StringReader;

import presto.runtime.Context;
import presto.type.CharacterType;
import presto.type.IType;
import presto.value.Character;


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
	

}
