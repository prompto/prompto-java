package prompto.expression;

import java.lang.reflect.Type;
import java.util.Comparator;

import prompto.compiler.ClassConstant;
import prompto.compiler.ClassFile;
import prompto.compiler.Descriptor;
import prompto.compiler.Flags;
import prompto.compiler.IVerifierEntry.VerifierType;
import prompto.compiler.MethodInfo;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.Identifier;
import prompto.parser.Section;
import prompto.runtime.Context;
import prompto.runtime.Variable;
import prompto.statement.IStatement;
import prompto.statement.ReturnStatement;
import prompto.statement.StatementList;
import prompto.transpiler.Transpiler;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.utils.IdentifierList;
import prompto.value.IValue;
import prompto.value.IntegerValue;

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
		throw new UnsupportedOperationException();
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
	
	public Comparator<? extends IValue> getComparator(Context context, IType itemType, boolean descending) {
		switch(args.size()) {
		case 1:
			return getComparator1Arg(context, itemType, descending);
		case 2:
			return getComparator2Args(context, itemType, descending);
		default:
			throw new SyntaxError("Expecting 1 or 2 parameters only!"); 			
		}
	}

	private Comparator<? extends IValue> getComparator1Arg(Context context, IType itemType, boolean descending) {
		return (o1, o2) -> {
			Context local = registerArrowArgs(context.newLocalContext(), itemType);
			local.setValue(args.get(0), o1);
			IValue key1 = statements.interpret(local);
			local.setValue(args.get(0), o2);
			IValue key2 = statements.interpret(local);
			int result = key1.compareTo(context, key2);
			return descending ? -result : result;
		};
	}
	
	private Comparator<? extends IValue> getComparator2Args(Context context, IType itemType, boolean descending) {
		return (o1, o2) -> {
			Context local = registerArrowArgs(context.newLocalContext(), itemType);
			local.setValue(args.get(0), o1);
			local.setValue(args.get(1), o2);
			IValue value = statements.interpret(local);
			if(!(value instanceof IntegerValue))
				throw new SyntaxError("Expecting an Integer as result of key body!");
			long result = ((IntegerValue)value).longValue();
			return (int)(descending ? -result : result);
		};
	}

	private Context registerArrowArgs(Context context, IType itemType) {
		args.forEach(arg->{
			Variable param = new Variable(arg, itemType);
			context.registerValue(param);
		});
		return context;
	}

	public void transpileSortedComparator(Transpiler transpiler, IType itemType, boolean descending) {
		switch(args.size()) {
		case 1:
			transpileSortedComparator1Arg(transpiler, itemType, descending);
			break;
		case 2:
			transpileSortedComparator2Args(transpiler, itemType, descending);
			break;
		default:
			throw new SyntaxError("Expecting 1 or 2 parameters only!"); 			
		}
	}
	
	private void transpileSortedComparator1Arg(Transpiler transpiler, IType itemType, boolean descending) {
		transpiler = transpiler.newLocalTranspiler();
		registerArrowArgs(transpiler.getContext(), itemType);
		transpiler.append("function(o1, o2) { ");
		transpiler.append("var $key = function(");
		transpiler.append(args.getFirst());
		transpiler.append(") { ");
		statements.transpile(transpiler);
		transpiler.append(" }; ");
		transpiler.append("o1 = $key(o1); ");
		transpiler.append("o2 = $key(o2); ");
		if(descending)
			transpiler.append("return o1 === o2 ? 0 : o1 > o2 ? -1 : 1;");
		else
			transpiler.append("return o1 === o2 ? 0 : o1 > o2 ? 1 : -1;");
		transpiler.append(" }");
		transpiler.flush();
	}

	private void transpileSortedComparator2Args(Transpiler transpiler, IType itemType, boolean descending) {
		transpiler = transpiler.newLocalTranspiler();
		registerArrowArgs(transpiler.getContext(), itemType);
		if(descending) {
			transpiler.append("function(");
			args.transpile(transpiler);
			transpiler.append(") { return -(");
		}
		transpiler.append("function(");
		args.transpile(transpiler);
		transpiler.append(") {");
		statements.transpile(transpiler);
		transpiler.append("}");
		if(descending) {
			transpiler.append(")(");
			args.transpile(transpiler);
			transpiler.append("); }");
		}
		transpiler.flush();
	}

}
