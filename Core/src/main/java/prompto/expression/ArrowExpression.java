package prompto.expression;

import java.lang.reflect.Type;

import prompto.compiler.ClassConstant;
import prompto.compiler.ClassFile;
import prompto.compiler.Descriptor;
import prompto.compiler.Flags;
import prompto.compiler.MethodInfo;
import prompto.compiler.IVerifierEntry.VerifierType;
import prompto.error.PromptoError;
import prompto.grammar.Identifier;
import prompto.parser.Section;
import prompto.runtime.Context;
import prompto.runtime.Variable;
import prompto.statement.IStatement;
import prompto.statement.ReturnStatement;
import prompto.statement.StatementList;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.utils.IdentifierList;
import prompto.value.IValue;

public class ArrowExpression extends Section implements IExpression {

	IdentifierList args;
	String argsSuite;
	String arrowSuite;
	StatementList statements;
	
	public ArrowExpression(IdentifierList args, String argsSuite, String arrowSuite) {
		this.args = args;
		this.argsSuite = argsSuite;
		this.arrowSuite = arrowSuite;
	}
	
	public IdentifierList getArgs() {
		return args;
	}

	@Override
	public IType check(Context context) {
		throw new UnsupportedOperationException();
	}

	@Override
	public IValue interpret(Context context) throws PromptoError {
		return this.statements.interpret(context);
	}

	@Override
	public void toDialect(CodeWriter writer) {
		argsToDialect(writer);
		writer.append(argsSuite);
		writer.append("=>");
		writer.append(arrowSuite);
		bodyToDialect(writer);
	}

	private void bodyToDialect(CodeWriter writer) {
		if(statements.size()==1 && statements.getFirst() instanceof ReturnStatement)
			((ReturnStatement)statements.getFirst()).getExpression().toDialect(writer);
		else {
			writer.append("{").newLine().indent();
			statements.toDialect(writer);
			writer.newLine().dedent().append("}").newLine();
			
		}
	}

	private void argsToDialect(CodeWriter writer) {
		if(args==null || args.isEmpty())
			writer.append("()");
		else if(args.size()==1)
			writer.append(args.getFirst().toString());
		else {
			writer.append("(");
			args.toDialect(writer, false);
			writer.append(")");
		}
		
	}

	public void setExpression(IExpression expression) {
		IStatement stmt = new ReturnStatement(expression);
		this.statements = new StatementList(stmt);
	}
	
	public void setStatements(StatementList statements) {
		this.statements = statements;
	}

	public StatementList getStatements() {
		return statements;
	}

	public void compileGetKeyMethod(Context context, ClassFile classFile, IType paramIType) {
		Identifier arg = args.get(0);
		Type paramType = paramIType.getJavaType(context);
		Descriptor.Method proto = new Descriptor.Method(paramType, Object.class);
		MethodInfo method = classFile.newMethod("getKey", proto);
		method.registerLocal("this", VerifierType.ITEM_Object, classFile.getThisClass());
		context = context.newChildContext();
		context.registerValue(new Variable(arg, paramIType));
		method.registerLocal(arg.toString(), VerifierType.ITEM_Object, new ClassConstant(paramType));
		statements.compile(context, method, new Flags());
	}
	
	public void compileComparatorMethodBody(Context context, MethodInfo method, IType paramIType) {
		context = context.newChildContext();
		context.registerValue(new Variable(args.get(0), paramIType));
		context.registerValue(new Variable(args.get(1), paramIType));
		statements.compile(context, method, new Flags().withReturnType(int.class));
	}


	
}
