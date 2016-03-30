package prompto.type;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import prompto.intrinsic.PromptoRange;
import prompto.runtime.Context;

public class RangeType extends ContainerType {
	
	public RangeType(IType itemType) {
		super(Family.RANGE, itemType, itemType.getTypeName()+"[..]");
	}
	
	@Override
	public boolean isAssignableTo(Context context, IType other) {
		return this.equals(other);
	}
	
	static Map<IType,Class<?>> rangeClassMap = createRangeClassMap();
	
	private static Map<IType, Class<?>> createRangeClassMap() {
		Map<IType,Class<?>> map = new HashMap<>();
		map.put(CharacterType.instance(), PromptoRange.Character.class);
		map.put(IntegerType.instance(), PromptoRange.Long.class);
		map.put(DateType.instance(), PromptoRange.Date.class);
		map.put(TimeType.instance(), PromptoRange.Time.class);
		return map;
	}
	
	@Override
	public Type getJavaType() {
		return rangeClassMap.get(itemType); 
	}
	

	@Override
	public boolean equals(Object obj) {
		if(obj==this)
			return true; 
		if(obj==null)
			return false;
		if(!(obj instanceof RangeType))
			return false;
		RangeType other = (RangeType)obj;
		return this.getItemType().equals(other.getItemType());
	}
	
	@Override
	public IType checkItem(Context context, IType other) {
		if(other==IntegerType.instance())
			return itemType;
		else
			return super.checkItem(context,other);
	}
	
	@Override
	public IType checkSlice(Context context) {
		return this;
	}
	
	@Override
	public IType checkIterator(Context context) {
		return itemType;
	}

	
}
