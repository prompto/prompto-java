package prompto.type;

import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Map;

import prompto.error.ReadWriteError;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoList;
import prompto.parser.ECleverParser;
import prompto.runtime.Context;
import prompto.value.IValue;
import prompto.value.ListValue;

import com.fasterxml.jackson.databind.JsonNode;

public class ListType extends ContainerType {
	
	public ListType(IType itemType) {
		super(Family.LIST, itemType, itemType.getTypeName() + "[]");
	}
	
	@Override
	public Type getJavaType(Context context) {
		return PromptoList.class;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==this)
			return true; 
		else 
			return (obj instanceof ListType) && 
					this.getItemType().equals(((ListType)obj).getItemType());
	}
	
	@Override
	public boolean isAssignableFrom(Context context, IType other) {
		return super.isAssignableFrom(context, other) ||
				(other instanceof ListType && 
				this.getItemType().isAssignableFrom(context, ((ListType)other).getItemType()));
	}
	
	@Override
	public IType checkAdd(Context context, IType other, boolean tryReverse) {
		if(other instanceof ContainerType) {
			IType itemType = ((ContainerType)other).getItemType();
			if((other instanceof ListType || other instanceof SetType) 
					&& this.getItemType().equals(itemType))
				return this;
		} 
		return super.checkAdd(context, other, tryReverse);
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
	public IType checkMultiply(Context context, IType other, boolean tryReverse) {
		if(other instanceof IntegerType)
			return this;
		return super.checkMultiply(context, other, tryReverse);
	}
	
	@Override
	public IType checkContainsAllOrAny(Context context, IType other) {
		return BooleanType.instance();
	}
	
	@Override
	public IType checkIterator(Context context) {
		return itemType;
	}

	@Override
	public IType checkMember(Context context, Identifier id) {
		String name = id.toString();
        if ("length".equals(name))
            return IntegerType.instance();
        else if("iterator".equals(name))
        	return new IteratorType(itemType);
        else
    		return super.checkMember(context, id);
   }

	@Override
	public IValue readJSONValue(Context context, JsonNode array, Map<String, byte[]> parts) {
		ListValue list = new ListValue(itemType);
		array.forEach( (node) -> { try {
				String typeName = node.get("type").asText(itemType.toString());
				IType itemType = new ECleverParser(typeName).parse_standalone_type();
				JsonNode itemNode = node.get("value");
				IValue item = itemType.readJSONValue(context, itemNode, parts);
				list.addItem(item);
			} catch (Exception e) {
				throw new ReadWriteError(e.getMessage());
			}
		});
		return list;
	}

	@SuppressWarnings("unchecked")
	@Override
	public IValue convertJavaValueToPromptoValue(Context context, Object value) {
		if(value instanceof Collection) {
			ListValue list = new ListValue(itemType);
			((Collection<Object>)value).forEach((item)->
				list.addItem(itemType.convertJavaValueToPromptoValue(context, item)));
			return list;
		} else
			return super.convertJavaValueToPromptoValue(context, value);
	}
}
