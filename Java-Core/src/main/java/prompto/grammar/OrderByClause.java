package prompto.grammar;

import prompto.compiler.CompilerUtils;
import prompto.compiler.Flags;
import prompto.compiler.InterfaceConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.parser.Section;
import prompto.runtime.Context;
import prompto.store.AttributeInfo;
import prompto.store.IQueryBuilder;
import prompto.utils.CodeWriter;
import prompto.utils.IdentifierList;

public class OrderByClause extends Section {
	
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

	public void interpretQuery(Context context, IQueryBuilder q) {
		// TODO members
		Identifier name = qualifiedName.getFirst();
		AttributeInfo info = context.findAttribute(name.toString()).getAttributeInfo();
		q.addOrderByClause(info, isDescending());
	}

	public void compileQuery(Context context, MethodInfo method, Flags flags) {
		method.addInstruction(Opcode.DUP);
		Identifier name = qualifiedName.getFirst();
		AttributeInfo info = context.findAttribute(name.toString()).getAttributeInfo();
		CompilerUtils.compileAttributeInfo(context, method, flags, info);
		method.addInstruction(descending ? Opcode.ICONST_1 : Opcode.ICONST_0);
		InterfaceConstant i = new InterfaceConstant(IQueryBuilder.class, "addOrderByClause", 
				AttributeInfo.class, boolean.class, void.class);
		method.addInstruction(Opcode.INVOKEINTERFACE, i);
	}
}
