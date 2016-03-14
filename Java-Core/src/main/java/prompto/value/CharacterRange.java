package prompto.value;

import prompto.intrinsic.PromptoRange;
import prompto.type.CharacterType;


public class CharacterRange extends RangeBase<Character> {

	static class PromptoCharacterRange extends PromptoRange<Character> {

		public PromptoCharacterRange(prompto.value.Character low, prompto.value.Character high) {
			super(low, high);
		}
		
		@Override
		public prompto.value.Character getItem(long item) {
			char result = (char)(low.getValue() + item - 1);
			if(result>high.getValue())
				throw new IndexOutOfBoundsException();
			return new prompto.value.Character(result);
		}
		
		@Override
		public PromptoCharacterRange slice(long first, long last) {
			last = adjustLastSliceIndex(last);
			return new PromptoCharacterRange(getItem(first), getItem(last));
		}
	
		@Override
		public long length() {
			return 1L + high.getValue() - low.getValue();
		}

	}
	
	public CharacterRange(Character left, Character right) {
		this(new PromptoCharacterRange(left, right));
	}
	
	public CharacterRange(PromptoRange<Character> range) {
		super(CharacterType.instance(), range);
	}
	
	@Override
	public int compare(Character o1, Character o2) {
		return o1.compareTo(o2);
	}
	
	@Override
	public RangeBase<Character> newInstance(PromptoRange<Character> range) {
		return new CharacterRange(range);
	}


}
