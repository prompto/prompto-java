package prompto.value;

import prompto.type.CharacterType;


public class CharacterRange extends Range<Character> {

	public CharacterRange(Character left, Character right) {
		super(CharacterType.instance(), left, right);
	}

	@Override
	public long length() {
		return 1 + high.getValue() - low.getValue();
	}
	
	@Override
	public int compare(Character o1, Character o2) {
		return o1.compareTo(o2);
	}
	
	@Override
	public Character getItem(long index) {
		char result = (char)(low.getValue() + index - 1);
		if(result>high.getValue())
			throw new IndexOutOfBoundsException();
		return new Character(result);
	}
	
	@Override
	public Range<Character> newInstance(Character left, Character right) {
		return new CharacterRange(left, right);
	}


}
