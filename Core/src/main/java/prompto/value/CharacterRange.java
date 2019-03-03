package prompto.value;

import prompto.intrinsic.PromptoRange;
import prompto.type.CharacterType;


public class CharacterRange extends RangeBase<CharacterValue> {

	static class PromptoCharacterRange extends PromptoRange<CharacterValue> {

		public PromptoCharacterRange(prompto.value.CharacterValue low, prompto.value.CharacterValue high) {
			super(low, high);
		}
		
		@Override
		public prompto.value.CharacterValue getItem(long item) {
			char result = (char)(low.getValue() + item - 1);
			if(result>high.getValue())
				throw new IndexOutOfBoundsException();
			return new prompto.value.CharacterValue(result);
		}
		
		@Override
		public PromptoCharacterRange slice(long first, long last) {
			last = adjustLastSliceIndex(last);
			return new PromptoCharacterRange(getItem(first), getItem(last));
		}
	
		@Override
		public long getNativeCount() {
			return 1L + high.getValue() - low.getValue();
		}
		
		@Override
		public boolean contains(Object item) {
			if(!(item instanceof prompto.value.CharacterValue))
				return false;
			prompto.value.CharacterValue other = (prompto.value.CharacterValue)item;
			return other.compareTo(low)>=0 && high.compareTo(other)>=0;
		}

	}
	
	public CharacterRange(CharacterValue left, CharacterValue right) {
		this(new PromptoCharacterRange(left, right));
	}
	
	public CharacterRange(PromptoRange<CharacterValue> range) {
		super(CharacterType.instance(), range);
	}
	
	@Override
	public RangeBase<CharacterValue> newInstance(PromptoRange<CharacterValue> range) {
		return new CharacterRange(range);
	}


}
