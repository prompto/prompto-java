package presto.declaration;

import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.grammar.ArgumentList;
import presto.grammar.CategoryArgument;
import presto.grammar.CodeArgument;
import presto.grammar.IArgument;
import presto.grammar.Identifier;
import presto.runtime.Context;
import presto.statement.StatementList;
import presto.type.DictType;
import presto.type.IType;
import presto.type.TextType;
import presto.type.VoidType;
import presto.utils.CodeWriter;
import presto.value.IValue;

public class ConcreteMethodDeclaration extends BaseMethodDeclaration implements ICategoryMethodDeclaration {

	StatementList statements;
	
	public ConcreteMethodDeclaration(Identifier name, ArgumentList arguments, IType returnType, StatementList statements) {
		super(name,arguments,returnType);
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
			toPDialect(writer);
			break;
		}
	}
	
	protected void toPDialect(CodeWriter writer) {
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
		writer.append(" as: method ");
		arguments.toDialect(writer);
		if(returnType!=null && returnType!=VoidType.instance()) {
			writer.append("returning: ");
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
		return statements.check(context);
	}

	public IType checkChild(Context context) throws SyntaxError {
		if(arguments!=null)
			arguments.check(context);
		Context child = context.newChildContext();
		registerArguments(child);
		return statements.check(child);
	}

	@Override
	public void check(ConcreteCategoryDeclaration declaration, Context context) throws SyntaxError {
		// TODO Auto-generated method stub
		
	}	

	@Override
	public IValue interpret(Context context) throws PrestoError {
		context.enterMethod(this);
		try {
			return statements.interpret(context);
		} finally {
			context.leaveMethod(this);
		}
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
