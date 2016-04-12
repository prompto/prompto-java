package prompto.declaration;

import java.lang.reflect.Modifier;

import prompto.argument.CategoryArgument;
import prompto.argument.CodeArgument;
import prompto.argument.IArgument;
import prompto.compiler.ClassFile;
import prompto.compiler.CompilerException;
import prompto.compiler.Flags;
import prompto.compiler.IVerifierEntry.VerifierType;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.error.PromptoError;
import prompto.grammar.ArgumentList;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
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
	public boolean isAbstract() {
		return false;
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
	public IType check(Context context) {
		if(canBeChecked(context))
			return fullCheck(context);
		else
			return VoidType.instance();
	}
	
	private boolean canBeChecked(Context context) {
		if(context.isGlobalContext())
			return !mustBeBeCheckedInCallContext(context);
		else
			return true;
	}
	public boolean mustBeBeCheckedInCallContext(Context context) {
		// if at least one argument is 'Code'
		if(arguments==null)
			return false;
		for( IArgument arg : arguments) {
			if(arg instanceof CodeArgument)
				return true;
		}
		return false;
	}

	private IType fullCheck(Context context) {
		if(context.isGlobalContext()) {
			context = context.newLocalContext();
			registerArguments(context);
		}
		if(arguments!=null)
			arguments.check(context);
		return checkStatements(context);
	}

	protected IType checkStatements(Context context) {
		return statements.check(context, returnType);
	}

	public IType checkChild(Context context) {
		if(arguments!=null)
			arguments.check(context);
		Context child = context.newChildContext();
		registerArguments(child);
		return statements.check(child, returnType);
	}

	@Override
	public void check(ConcreteCategoryDeclaration declaration, Context context) {
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
	public void compile(Context context, ClassFile classFile) {
		try {
			context = prepareContext(context);
			IType returnType = check(context);
			MethodInfo method = createMethodInfo(context, classFile, returnType);
			registerLocals(context, classFile, method);
			produceByteCode(context, method, returnType);
		} catch (PromptoError e) {
			throw new CompilerException(e);
		}
	}
	
	private void produceByteCode(Context context, MethodInfo method, IType returnType) {
		statements.forEach((s)->
			s.compile(context, method, new Flags().withMember(this.memberOf!=null)));
		// add return for void
		if(returnType==VoidType.instance())
			method.addInstruction(Opcode.RETURN);
	}

	protected void registerLocals(Context context, ClassFile classFile, MethodInfo method) {
		if(Modifier.isAbstract(classFile.getModifiers())) // TODO find a more accurate way
			method.addModifier(Modifier.STATIC); // otherwise it's a member method
		else 
			method.registerLocal("this", VerifierType.ITEM_Object, classFile.getThisClass());
		arguments.forEach((arg)->
			arg.registerLocal(context, method, new Flags()));
		arguments.forEach((arg)->
			arg.extractLocal(context, method, new Flags()));
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
