package prompto.statement;

import java.lang.reflect.Type;

import prompto.compiler.Flags;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.compiler.StringConstant;
import prompto.error.PromptoError;
import prompto.runtime.Context;
import prompto.type.CategoryType;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.ConcreteInstance;
import prompto.value.IValue;

public class WithSingletonStatement extends BaseStatement {

	CategoryType type;
	StatementList statements;

	public WithSingletonStatement(CategoryType type, StatementList statements) {
		this.type = type;
		this.statements = statements;
	}

	@Override
	public IType check(Context context) {
		Context instanceContext = context.newSingletonContext(type);
		Context childContext = instanceContext.newChildContext();
		return statements.check(childContext, null);
	}

	@Override
	public IValue interpret(Context context) throws PromptoError {
		ConcreteInstance instance = context.loadSingleton(context, type);
		synchronized(instance) {
			Context instanceContext = context.newInstanceContext(instance);
			Context childContext = instanceContext.newChildContext();
			return statements.interpret(childContext);
		}
	}
	
	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		Type thisType = type.getJavaType(context);
		StringConstant s = new StringConstant(thisType.getTypeName());
		method.addInstruction(Opcode.LDC_W, s);
		MethodConstant m = new MethodConstant(Class.class, "forName", String.class, Class.class);
		method.addInstruction(Opcode.INVOKESTATIC, m);
		method.addInstruction(Opcode.DUP);
		method.addInstruction(Opcode.MONITORENTER);
		Context instanceContext = context.newCategoryContext(type);
		Context childContext = instanceContext.newChildContext();
		statements.compile(childContext, method, flags);
		method.addInstruction(Opcode.MONITOREXIT);
		return new ResultInfo(void.class);
	}

	@Override
	public void toDialect(CodeWriter writer) {
		switch(writer.getDialect()) {
		case E:
			toEDialect(writer);
			break;
		case O:
			toODialect(writer);
			break;
		case S:
			toSDialect(writer);
			break;
		}
	}
	
	private void toEDialect(CodeWriter writer) {
		writer.append("with ");
		type.toDialect(writer);
		writer.append(", do:\n");
		writer.indent();
		statements.toDialect(writer);
		writer.dedent();
	}

	private void toODialect(CodeWriter writer) {
		writer.append("with (");
		type.toDialect(writer);
		writer.append(")");
		boolean oneLine = statements.size()==1 && (statements.get(0) instanceof SimpleStatement);
		if(!oneLine)
			writer.append(" {");
		writer.newLine();
		writer.indent();
		statements.toDialect(writer);
		writer.dedent();
		if(!oneLine) {
			writer.append("}");
			writer.newLine();
		}		
	}

	private void toSDialect(CodeWriter writer) {
		writer.append("with ");
		type.toDialect(writer);
		writer.append(":\n");
		writer.indent();
		statements.toDialect(writer);
		writer.dedent();
	}
	
}
