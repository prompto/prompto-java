package prompto.declaration;

import java.lang.reflect.Modifier;
import java.util.List;
import java.util.stream.Collectors;

import prompto.compiler.ClassFile;
import prompto.compiler.CompilerUtils;
import prompto.compiler.Descriptor;
import prompto.compiler.FieldInfo;
import prompto.compiler.MethodInfo;
import prompto.error.PromptoError;
import prompto.expression.IExpression;
import prompto.grammar.IAttributeConstraint;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.type.ContainerType;
import prompto.type.IType;
import prompto.type.IType.Family;
import prompto.utils.CodeWriter;
import prompto.utils.IdentifierList;
import prompto.value.IValue;

public class AttributeDeclaration extends BaseDeclaration {
	
	IType type;
	IAttributeConstraint constraint;
	IdentifierList indexTypes;
	boolean storable = false;
	
	public AttributeDeclaration(Identifier id, IType type) {
		this(id, type, null, null);
	}

	public AttributeDeclaration(Identifier id, IType type, IAttributeConstraint constraint) {
		this(id, type, constraint, null);
	}
	
	public AttributeDeclaration(Identifier id, IType type, IdentifierList indexTypes) {
		this(id, type, null, indexTypes);
	}
	
	public AttributeDeclaration(Identifier id, IType type, IAttributeConstraint constraint, IdentifierList indexTypes) {
		super(id);
		this.type = type;
		this.constraint = constraint;
		this.indexTypes = indexTypes;
	}

	@Override
	public Type getDeclarationType() {
		return Type.ATTRIBUTE;
	}
	
	@Override
	public String toString() {
		return this.type.toString() + " " + this.getName();
	}
	
	public AttributeInfo getAttributeInfo() {
		List<String> list = indexTypes==null ? null : indexTypes.stream().map((id)->
			id.toString()).collect(Collectors.toList());
		boolean collection = type instanceof ContainerType;
		Family family = collection ? ((ContainerType)type).getItemType().getFamily() : type.getFamily();
		return new AttributeInfo(getName(), family, collection, list);
	}
	
	public IType getType() {
		return type;
	}
	
	public IAttributeConstraint getConstraint() {
		return constraint;
	}
	
	public void setStorable(boolean storable) {
		this.storable = storable;
	}
	
	public boolean isStorable() {
		return storable;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		switch(writer.getDialect()) {
		case E:
			writer.append("define ");
			writer.append(getId());
			writer.append(" as ");
			if(storable)
				writer.append("storable ");
			type.toDialect(writer);
			writer.append(" attribute");
			if(constraint!=null)
				constraint.toDialect(writer);
			if(indexTypes!=null) {
				writer.append(" with ");
				indexTypes.toDialect(writer, true);
				writer.append(" index");
			}
			break;
		case O:
			if(storable)
				writer.append("storable ");
			writer.append("attribute ");
			writer.append(getId());
			writer.append(" : ");
			type.toDialect(writer);
			if(constraint!=null)
				constraint.toDialect(writer);
			writer.append(';');
			break;
		case S:
			if(storable)
				writer.append("storable ");
			writer.append("attr ");
			writer.append(getId());
			writer.append(" ( ");
			type.toDialect(writer);
			writer.append(" ):\n");
			writer.indent();
			if(constraint!=null)
				constraint.toDialect(writer);
			else
				writer.append("pass");
			writer.dedent();
			break;
		}
	}
	
	@Override
	public void register(Context context) {
		context.registerDeclaration(this);
	}
	
	@Override
	public IType check(Context context) {
		type.checkExists(context);
		return type;
	}
	
	@Override
	public IType getType(Context context) {
		return type;
	}

	public IValue checkValue(Context context, IExpression expression) throws PromptoError {
		IValue value = expression.interpret(context);
		if(constraint==null)
			return value;
		constraint.checkValue(context, value);
		return value;
	}

	public FieldInfo toFieldInfo(Context context) {
		return new FieldInfo(getName(), type.getJavaType());
	}

	public ClassFile compile(Context context, String fullName) {
		java.lang.reflect.Type type = CompilerUtils.attributeTypeFrom(fullName);
		ClassFile classFile = new ClassFile(type);
		classFile.addModifier(Modifier.ABSTRACT | Modifier.INTERFACE);
		FieldInfo field = this.toFieldInfo(context);
		compileSetterPrototype(context, classFile, field);
		compileGetterPrototype(context, classFile, field);
		return classFile;
	}

	private void compileGetterPrototype(Context context, ClassFile classFile, FieldInfo field) {
		String name = CompilerUtils.getterName(field.getName().getValue());
		Descriptor proto = new Descriptor.Method(field.getType());
		MethodInfo method = classFile.newMethod(name, proto);
		method.addModifier(Modifier.ABSTRACT);
	}

	private void compileSetterPrototype(Context context, ClassFile classFile, FieldInfo field) {
		String name = CompilerUtils.setterName(field.getName().getValue());
		Descriptor proto = new Descriptor.Method(field.getType(), void.class);
		MethodInfo method = classFile.newMethod(name, proto);
		method.addModifier(Modifier.ABSTRACT);
	}

}
