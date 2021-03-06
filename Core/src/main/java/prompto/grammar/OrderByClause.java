package prompto.grammar;

import prompto.compiler.CompilerUtils;
import prompto.compiler.Flags;
import prompto.compiler.InterfaceConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.declaration.AttributeDeclaration;
import prompto.parser.CodeSection;
import prompto.runtime.Context;
import prompto.store.AttributeInfo;
import prompto.store.IQueryBuilder;
import prompto.transpiler.Transpiler;
import prompto.utils.CodeWriter;
import prompto.utils.IdentifierList;

public class OrderByClause extends CodeSection {
	
	IdentifierList qualifiedName;
	boolean descending;
	
	public OrderByClause(IdentifierList qualifiedName, boolean descending) {
		this.qualifiedName = qualifiedName;
		this.descending = descending;
	}
	
	public IdentifierList getQualifiedName() {
		return qualifiedName;
	}
	
	public boolean isDescending() {
		return descending;
	}

	public void toDialect(CodeWriter writer) {
		for(Identifier name : qualifiedName) {
			writer.append(name.toString());
			writer.append(".");
		}
		writer.trimLast(1);
		if(descending)
			writer.append(" descending");
	}

	public IQueryBuilder interpretQuery(Context context, IQueryBuilder builder) {
		// TODO members
		Identifier name = qualifiedName.getFirst();
		AttributeInfo info = context.findAttribute(name.toString()).getAttributeInfo(context);
		return builder.orderBy(info, isDescending());
	}

	public void compileQuery(Context context, MethodInfo method, Flags flags) {
		Identifier name = qualifiedName.getFirst();
		AttributeInfo info = context.findAttribute(name.toString()).getAttributeInfo(context);
		CompilerUtils.compileAttributeInfo(context, method, flags, info);
		method.addInstruction(descending ? Opcode.ICONST_1 : Opcode.ICONST_0);
		InterfaceConstant i = new InterfaceConstant(IQueryBuilder.class, "orderBy", 
				AttributeInfo.class, boolean.class, IQueryBuilder.class);
		method.addInstruction(Opcode.INVOKEINTERFACE, i);
	}

	public void declare(Transpiler transpiler) {
		// nothing to do
	}

	public void transpileQuery(Transpiler transpiler, String builderName) {
	    String name = qualifiedName.get(0).toString();
	    AttributeDeclaration decl = transpiler.getContext().findAttribute(name);
	    if(decl==null)
	    	transpiler.getContext().getProblemListener().reportUnknownAttribute(this, name);
	    else {
	    	AttributeInfo info = decl.getAttributeInfo(transpiler.getContext());
		    transpiler.append(builderName).append(".addOrderByClause(").append(info.toTranspiled()).append(", ").append(this.descending).append(");").newLine();
	    }
	}
}
