package prompto.utils;

import java.util.Map;

import prompto.declaration.AttributeDeclaration;
import prompto.declaration.CategoryDeclaration;
import prompto.error.NotMutableError;
import prompto.expression.IExpression;
import prompto.grammar.Identifier;
import prompto.java.JavaClassType;
import prompto.runtime.Context;
import prompto.store.IStore;
import prompto.value.DocumentValue;
import prompto.value.IInstance;
import prompto.value.IValue;
import prompto.value.NullValue;

public abstract class InstanceUtils {

	@SuppressWarnings("unchecked")
	public static IInstance copyFrom(Context context, CategoryDeclaration decl, IInstance instance, Object copyFrom) {
		if(copyFrom instanceof IExpression)
			copyFrom = ((IExpression)copyFrom).interpret(context);
		if(copyFrom instanceof IInstance)
			return copyFrom(context, decl, instance, (IInstance)copyFrom);
		if(copyFrom instanceof DocumentValue)
			return copyFrom(context, decl, instance, (DocumentValue)copyFrom);
		if(copyFrom instanceof Map)
			return copyFrom(context, decl, instance, (Map<String, Object>)copyFrom);
		return null;
	}

	public static IInstance copyFrom(Context context, CategoryDeclaration decl, IInstance instance, Map<String, Object> copyFrom) {
		for(Map.Entry<String, Object> entry : copyFrom.entrySet()) {
			if(IStore.dbIdName.equals(entry.getKey()))
				continue;	
			Identifier id = new Identifier(entry.getKey());
			if(decl.hasAttribute(context, id)) {
				IValue value = NullValue.instance();
				if(entry.getValue() != null) {
					AttributeDeclaration attr = context.getRegisteredDeclaration(AttributeDeclaration.class, id);
					value = JavaClassType.convertJavaValueToPromptoValue(context, entry.getValue(), entry.getValue().getClass(), attr.getType(context));
					if(value!=null && value.isMutable() && !instance.getType().isMutable())
						throw new NotMutableError();
					value = attr.getType(context).convertIValueToIValue(context, value);
				}
				instance.setMember(context, id, value);
			}
		}
		return instance;
	}
	
	public static IInstance copyFrom(Context context, CategoryDeclaration decl, IInstance instance, DocumentValue copyFrom) {
		for(Identifier id : copyFrom.getMemberIds()) {
			if(IStore.dbIdName.equals(id.toString()))
				continue;	
			if(decl.hasAttribute(context, id)) {
				IValue value = copyFrom.getMember(context, id, false);
				if(value!=null && value.isMutable() && !instance.getType().isMutable())
					throw new NotMutableError();
				if(value!=NullValue.instance()) {
					AttributeDeclaration attr = context.getRegisteredDeclaration(AttributeDeclaration.class, id);
					value = attr.getType(context).convertIValueToIValue(context, value);
				}
				instance.setMember(context, id, value);
			}
		}
		return instance;
	}
	
	public static IInstance copyFrom(Context context, CategoryDeclaration decl, IInstance instance, IInstance copyFrom) {
		for(Identifier id : copyFrom.getMemberIds()) {
			if(IStore.dbIdName.equals(id.toString()))
				continue;	
			if(decl.hasAttribute(context, id)) {
				IValue value = copyFrom.getMember(context, id, false);
				if(value!=null && value.isMutable() && !instance.getType().isMutable())
					throw new NotMutableError();
				instance.setMember(context, id, value);
			}
		}
		return instance;
	}
}
