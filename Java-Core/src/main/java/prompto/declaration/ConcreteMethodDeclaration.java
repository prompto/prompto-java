package prompto.declaration;

import java.lang.reflect.Modifier;

import prompto.compiler.ClassFile;
import prompto.compiler.Compiler;
import prompto.compiler.CompilerException;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.ArgumentList;
import prompto.grammar.CategoryArgument;
import prompto.grammar.CodeArgument;
import prompto.grammar.IArgument;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.statement.IStatement;
import prompto.statement.StatementList;
import prompto.type.DictType;
import prompto.type.IType;
import prompto.type.TextType;
import prompto.type.VoidType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;

public class ConcreteMethodDeclaration extends BaseMethodDeclaration implements IMethodDeclaration {

	StatementList statements;
	
	public ConcreteMethodDeclaration(Identifier name, ArgumentList arguments, IType returnType, StatementList statements) {
		super(name, arguments, returnType);
		this.statements = statements;
	}

	public StatementList getStatements() {
		return statements;
	}

	@Override
	public void toDialect(CodeWriter writer) {
		if(writer.isGlobalContext())
			writer = writer.newLocalWriter();
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
	
	protected void toSDialect(CodeWriter writer) {
		writer.append("def ");
		writer.append(getName());
		writer.append(" (");
		arguments.toDialect(writer);
		writer.append(")");
		if(returnType!=null && returnType!=VoidType.instance()) {
			writer.append("->");
			returnType.toDialect(writer);
		}
		writer.append(":\n");
		writer.indent();
		statements.toDialect(writer);
		writer.dedent();
	}

	protected void toEDialect(CodeWriter writer) {
		writer.append("define ");
		writer.append(getName());
		writer.append(" as method ");
		arguments.toDialect(writer);
		if(returnType!=null && returnType!=VoidType.instance()) {
			writer.append("returning ");
			returnType.toDialect(writer);
			writer.append(" ");
		}
		writer.append("doing:\n");
		writer.indent();
		statements.toDialect(writer);
		writer.dedent();
	}
	
	protected void toODialect(CodeWriter writer) {
		if(returnType!=null && returnType!=VoidType.instance()) {
			returnType.toDialect(writer);
			writer.append(" ");
		}
		writer.append("method ");
		writer.append(getName());
		writer.append(" (");
		arguments.toDialect(writer);
		writer.append(") {\n");
		writer.indent();
		statements.toDialect(writer);
		writer.dedent();
		writer.append("}\n");
	}

	@Override
	public IType check(Context context) throws SyntaxError {
		if(canBeChecked(context))
			return fullCheck(context);
		else
			return VoidType.instance();
	}
	
	private boolean canBeChecked(Context context) throws SyntaxError {
		if(context.isGlobalContext())
			return !mustBeBeCheckedInCallContext(context);
		else
			return true;
	}
	public boolean mustBeBeCheckedInCallContext(Context context) throws SyntaxError {
		// if at least one argument is 'Code'
		if(arguments==null)
			return false;
		for( IArgument arg : arguments) {
			if(arg instanceof CodeArgument)
				return true;
		}
		return false;
	}

	private IType fullCheck(Context context) throws SyntaxError {
		if(context.isGlobalContext()) {
			context = context.newLocalContext();
			registerArguments(context);
		}
		if(arguments!=null)
			arguments.check(context);
		return checkStatements(context);
	}

	protected IType checkStatements(Context context) throws SyntaxError {
		return statements.check(context, returnType);
	}

	public IType checkChild(Context context) throws SyntaxError {
		if(arguments!=null)
			arguments.check(context);
		Context child = context.newChildContext();
		registerArguments(child);
		return statements.check(child, returnType);
	}

	@Override
	public void check(ConcreteCategoryDeclaration declaration, Context context) throws SyntaxError {
		// TODO Auto-generated method stub
		
	}	

	@Override
	public IValue interpret(Context context) throws PromptoError {
		context.enterMethod(this);
		try {
			return statements.interpret(context);
		} finally {
			context.leaveMethod(this);
		}
	}
	
	@Override
	public void compile(Context context, Compiler compiler, ClassFile classFile) {
		try {
			if(context.isGlobalContext()) {
				// coming from nowhere, so need a clean context in which to register arguments
				context = context.newLocalContext();
				registerArguments(context);
			}
			// create method
			IType returnType = check(context);
			MethodInfo method = createMethodInfo(context, compiler, classFile, returnType);
			// produce byte code
			for(IStatement s : statements)
				s.compile(context, compiler, method);
			// add return for void
			if(returnType==VoidType.instance())
				method.addInstruction(Opcode.RETURN);
		} catch (PromptoError e) {
			throw new CompilerException(e);
		}
	}

	protected MethodInfo createMethodInfo(Context context, Compiler compiler, ClassFile classFile, IType returnType) {
		String proto = compiler.createProto(context, arguments, returnType);
		MethodInfo method = new MethodInfo(getName(), proto); 
		classFile.addMethod(method);
		if(Modifier.isAbstract(classFile.getModifiers())) // TODO find another way
			method.addModifier(Modifier.STATIC); // otherwise it's a member method
		else
			method.registerLocal("this");
		for(IArgument arg : arguments)
			method.registerLocal(arg.getName());
		return method;
	}


	
	@Override
	public boolean isEligibleAsMain() {
		if(arguments.size()==0)
			return true;
		if(arguments.size()==1) {
			IArgument arg = arguments.getFirst();
			if(arg instanceof CategoryArgument) {
				IType type = ((CategoryArgument)arg).getType();
				if(type instanceof DictType)
					return ((DictType)type).getItemType()==TextType.instance();
			}
		}
		return super.isEligibleAsMain();
	}

}
