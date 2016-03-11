package prompto.value;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import prompto.compiler.CompilerUtils;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.IOperand;
import prompto.compiler.ResultInfo;
import prompto.error.InvalidDataError;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoDict;
import prompto.runtime.Context;
import prompto.type.ContainerType;
import prompto.type.DictType;
import prompto.type.IType;
import prompto.type.TextType;

public class Dictionary extends BaseValue implements IContainer<IValue> {

	PromptoDict<Text, IValue> dict;

	public Dictionary(IType itemType) {
		super(new DictType(itemType));
		dict = new PromptoDict<>();
	}

	public Dictionary(Dictionary from) {
		this(((ContainerType) from.type).getItemType(), from.dict);
	}

	public Dictionary(IType itemType, PromptoDict<Text, IValue> dict) {
		super(new DictType(itemType));
		this.dict = dict;
	}

	public static Dictionary merge(Dictionary dict1, Dictionary dict2) {
		PromptoDict<Text, IValue> dict = new PromptoDict<Text, IValue>();
		dict.putAll(dict1.dict);
		dict.putAll(dict2.dict);
		// TODO check type fungibility		
		return new Dictionary(((ContainerType) dict1.type).getItemType(), dict); 
	}

	public long length() {
		return dict.size();
	}

	@Override
	public boolean isEmpty() {
		return dict.isEmpty();
	}

	public IValue plus(Context context, IValue value) throws PromptoError {
		if (value instanceof Dictionary)
			return merge(this, (Dictionary) value);
		else
			throw new SyntaxError("Illegal: Dict + "
					+ value.getClass().getSimpleName());
	}
	
	public static ResultInfo compileAdd(Context context, MethodInfo method, ResultInfo left, IExpression exp, boolean toNative) throws SyntaxError {
		// TODO: return right if left is empty (or left if right is empty)
		// create result
		ResultInfo info = CompilerUtils.newInstance(method, PromptoDict.class); 
		// add left, current stack is: left, result, we need: result, result, left
		method.addInstruction(Opcode.DUP_X1); // stack is: result, left, result
		method.addInstruction(Opcode.SWAP); // stack is: result, result, left
		IOperand oper = new MethodConstant(PromptoDict.class, "putAll", 
				Map.class, void.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		// add right, current stack is: result, we need: result, result, right
		method.addInstruction(Opcode.DUP); // stack is: result, result 
		exp.compile(context, method, false); // stack is: result, result, right
		oper = new MethodConstant(PromptoDict.class, "putAll", 
				Map.class, void.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		return info;
	}

	public boolean hasItem(Context context, IValue value) throws SyntaxError {
		if (value instanceof Text)
			return this.dict.containsKey((Text) value);
		else
			throw new SyntaxError("Only Text key instanceof supported by "
					+ this.getClass().getSimpleName());
	}

	@SuppressWarnings("unchecked")
	@Override
	public IValue getMember(Context context, Identifier id, boolean autoCreate) throws PromptoError {
		String name = id.toString();
		if ("length".equals(name))
			return new Integer(this.dict.size());
		else if ("keys".equals(name)) {
			IType type = TextType.instance();
			Set<IValue> values = (Set<IValue>) (Object) this.dict.keySet();
			return new SetValue(type, values);
		} else if ("values".equals(name)) {
			IType itemType = ((ContainerType) this.type).getItemType();
			Collection<IValue> values = this.dict.values();
			return new ListValue(itemType, values);
		} else
			return super.getMember(context, id, autoCreate);
	}

	public IValue getItem(Context context, IValue index) throws PromptoError {
		if (index instanceof Text)
			return dict.get((Text) index);
		else
			throw new SyntaxError("No such item:" + index.toString());
	}

	public Object convertTo(Class<?> type) {
		return this;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Dictionary))
			return false;
		return dict.equals(((Dictionary) obj).dict);
	}

	@Override
	public String toString() {
		return dict.toString();
	}

	@Override
	public Iterable<IValue> getIterable(Context context) {
		return new KVPIterable(context);
	}

	class KVPIterable implements Iterable<IValue> {

		Context context;

		public KVPIterable(Context context) {
			this.context = context;
		}

		@Override
		public Iterator<IValue> iterator() {
			return new KVPIterator();
		}

		class KVPIterator implements Iterator<IValue> {

			Iterator<Entry<Text, IValue>> iterator = dict.entrySet().iterator();

			@Override
			public boolean hasNext() {
				return iterator.hasNext();
			}

			@Override
			public KVPValue next() {
				return new KVPValue(iterator.next());
			}

			@Override
			public void remove() {
				iterator.remove();
			}

		}

	}

	static class KVPValue extends BaseValue {
		Entry<Text, IValue> kvp;

		public KVPValue(Entry<Text, IValue> kvp) {
			super(null); // TODO, check that this is not a problem
			this.kvp = kvp;
		}

		@Override
		public IValue getMember(Context context, Identifier id, boolean autoCreate) throws PromptoError {
			String name = id.toString();
			if ("key".equals(name))
				return kvp.getKey();
			else if ("value".equals(name))
				return kvp.getValue();
			else
				throw new InvalidDataError("No such member:" + name);
		}
	}
}
