package prompto.type;

import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Map;

import prompto.error.ReadWriteError;
import prompto.expression.IExpression;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoList;
import prompto.parser.ECleverParser;
import prompto.runtime.Context;
import prompto.store.Family;
import prompto.transpiler.Transpiler;
import prompto.utils.Logger;
import prompto.value.Boolean;
import prompto.value.Decimal;
import prompto.value.IValue;
import prompto.value.Integer;
import prompto.value.ListValue;
import prompto.value.NullValue;
import prompto.value.Text;

import com.fasterxml.jackson.databind.JsonNode;

public class ListType extends ContainerType {
	
	public static Logger logger = new Logger();
	
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
		if(	(other instanceof ListType || other instanceof SetType) &&
			this.getItemType().equals(((ContainerType)other).getItemType()) )
				return this;
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
        if ("count".equals(name))
            return IntegerType.instance();
        else if("iterator".equals(name))
        	return new IteratorType(itemType);
        else
    		return super.checkMember(context, id);
   }

	@Override
	public IValue readJSONValue(Context context, JsonNode array, Map<String, byte[]> parts) {
		ListValue list = new ListValue(itemType);
		array.forEach( (node) -> {
			IValue item = readJSONItem(context, parts, node);
			if(item!=null)
				list.addItem(item);
		});
		return list;
	}
	
	IValue readJSONItem(Context context, Map<String, byte[]> parts, JsonNode node) { 
		try {
			switch(node.getNodeType()) {
				case NULL:
					return NullValue.instance();
				case BOOLEAN:
					return Boolean.valueOf(node.asBoolean());
				case NUMBER:
					if(this.itemType==IntegerType.instance())
						return new Integer(node.asLong());
					else if(this.itemType==DecimalType.instance())
						return new Decimal(node.asDouble());
					else
						throw new ReadWriteError("Unsupported NUMBER for " + itemType.toString());
				case STRING:
					return new Text(node.asText());
				case OBJECT:
					return readJSONObject(context, parts, node);
				default:
					throw new ReadWriteError("Unsupported " + node.getNodeType().name() + " node for " + itemType.toString());
			} 
		} catch (Exception e) {
			logger.error(()->e.getMessage(), e);
			throw new ReadWriteError(e.getMessage());
		}
	}

	private IValue readJSONObject(Context context, Map<String, byte[]> parts, JsonNode node) throws Exception {
		String typeName = node.get("type").asText(itemType.toString());
		IType itemType = new ECleverParser(typeName).parse_standalone_type();
		JsonNode itemNode = node.get("value");
		return itemType.readJSONValue(context, itemNode, parts);
	}

	@SuppressWarnings("unchecked")
	@Override
	public IValue convertJavaValueToIValue(Context context, Object value) {
		if(value instanceof Collection) {
			ListValue list = new ListValue(itemType);
			((Collection<Object>)value).forEach((item)->
				list.addItem(itemType.convertJavaValueToIValue(context, item)));
			return list;
		} else
			return super.convertJavaValueToIValue(context, value);
	}
	
	@Override
	public void declareAdd(Transpiler transpiler, IType other, boolean tryReverse, IExpression left, IExpression right) {
	    if((other instanceof ListType || other instanceof SetType) && this.getItemType().equals(((ContainerType)other).getItemType())) {
	        left.declare(transpiler);
	        right.declare(transpiler);
	    } else {
	        super.declareAdd(transpiler, other, tryReverse, left, right);
	    }
	}
	
	@Override
	public boolean transpileAdd(Transpiler transpiler, IType other, boolean tryReverse, IExpression left, IExpression right) {
	    if((other instanceof ListType || other instanceof SetType) && this.getItemType().equals(((ContainerType)other).getItemType())) {
	        left.transpile(transpiler);
	        transpiler.append(".add(");
	        right.transpile(transpiler);
	        transpiler.append(")");
	        return false;
	    } else {
	        return super.transpileAdd(transpiler, other, tryReverse, left, right);
	    }
	}
	
	
	@Override
	public void declareMultiply(Transpiler transpiler, IType other, boolean tryReverse, IExpression left, IExpression right) {
	   if(other == IntegerType.instance) {
	        transpiler.require("multiplyArray");
	        left.declare(transpiler);
	        right.declare(transpiler);
	    } else {
	        super.declareMultiply(transpiler, other, tryReverse, left, right);
	    }
	}
	
	@Override
	public boolean transpileMultiply(Transpiler transpiler, IType other, boolean tryReverse, IExpression left, IExpression right) {
	   if(other == IntegerType.instance()) {
	        transpiler.append("multiplyArray(");
	        left.transpile(transpiler);
	        transpiler.append(",");
	        right.transpile(transpiler);
	        transpiler.append(")");
	        return false;
	    } else
	        return super.transpileMultiply(transpiler, other, tryReverse, left, right);
	}
}
