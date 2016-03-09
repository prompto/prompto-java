package prompto.literal;

import java.util.Map;

import prompto.compiler.CompilerUtils;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.Operand;
import prompto.compiler.ResultInfo;
import prompto.custom.PromptoDict;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.runtime.Context;
import prompto.type.DictType;
import prompto.type.IType;
import prompto.type.MissingType;
import prompto.type.TextType;
import prompto.utils.CodeWriter;
import prompto.value.Dictionary;
import prompto.value.IValue;
import prompto.value.Text;


public class DictLiteral extends Literal<Dictionary> {

	// we can only compute keys by evaluating key expressions
	// so we can't just inherit from Map<String,Expression>. 
	// so we keep the full entry list.
	DictEntryList entries;
	IType itemType = null;
	
	public DictLiteral() {
		super("{}",new Dictionary(MissingType.instance()));
		this.entries = new DictEntryList();
	}
	
	public DictLiteral(DictEntryList entries) {
		super(entries.toString(),new Dictionary(MissingType.instance()));
		this.entries = entries;
	}

	@Override
	public void toDialect(CodeWriter writer) {
		this.entries.toDialect(writer);
	}
	
	@Override
	public IType check(Context context) throws SyntaxError {
		if(itemType==null)
			itemType = inferElementType(context);
		return new DictType(itemType); 
	}
	
	// can't use Utils.inferElementType with list of DictEntry
	private IType inferElementType(Context context) throws SyntaxError {
		if(entries.isEmpty())
			return MissingType.instance();
		IType lastType = null;
		for(DictEntry e : entries) {
			IType keyType = e.getKey().check(context);
			if(keyType!=TextType.instance())
				throw new SyntaxError("Illegal key type: " + keyType.toString());
			IType elemType = e.getValue().check(context);
			if(lastType==null)
				lastType = elemType;
			else if(!lastType.equals(elemType)) { 
				if(elemType.isAssignableTo(context, lastType))
					; // lastType is less specific
				else if(lastType.isAssignableTo(context, elemType))
					lastType = elemType; // elemType is less specific
				else 
					throw new SyntaxError("Incompatible value types: " + elemType.toString() + " and " + lastType.toString());
			}
		}
		return lastType; 
	}	
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		if(value.isEmpty() && entries.size()>0) {
			check(context); // to compute itemType
			Map<Text,IValue> map = new PromptoDict<Text, IValue>();
			for(DictEntry e : entries) {
				Text key = (Text)e.getKey().interpret(context);
				IValue val = e.getValue().interpret(context); 
				map.put(key, val);
			}
			value = new Dictionary(itemType, map);
		}
		return value;
	}
	
	@Override
	public ResultInfo compile(Context context, MethodInfo method) throws SyntaxError {
		ResultInfo info = CompilerUtils.newInstance(method, PromptoDict.class);
		addEntries(context, method);
		return info;
	}

	private void addEntries(Context context, MethodInfo method) throws SyntaxError {
		for(DictEntry e : entries) {
			method.addInstruction(Opcode.DUP); // need to keep a reference to the map on top of stack
			ResultInfo info = e.getKey().compile(context, method);
			if(info.getType()!=String.class) {
				Operand oper = new MethodConstant(info.getType(), "put", 
						String.class);
				method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
			}
			e.getValue().compile(context, method);
			Operand oper = new MethodConstant(PromptoDict.class, "put", 
					Object.class, Object.class, Object.class);
			method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
			method.addInstruction(Opcode.POP); // consume the returned value (null since this is a new Map)
		}
	}

	
}
