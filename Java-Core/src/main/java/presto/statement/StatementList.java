package presto.statement;

import java.util.LinkedList;

import presto.error.NullReferenceError;
import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.java.JavaNativeCall;
import presto.parser.Dialect;
import presto.runtime.Context;
import presto.type.IType;
import presto.type.TypeMap;
import presto.type.VoidType;
import presto.utils.CodeWriter;
import presto.value.IValue;


public class StatementList extends LinkedList<IStatement> {

	private static final long serialVersionUID = 1L;

	public StatementList() {
	}

	public StatementList(IStatement statement) {
		this.add(statement);
	}
	
	public IType check(Context context) throws SyntaxError {
		TypeMap types = new TypeMap();
		for(IStatement statement : this) {
			IType type = statement.check(context);
			if(type!=VoidType.instance())
				types.put(type.getName(), type);
		}
		return types.inferType(context);
	}

	public IValue interpret(Context context) throws PrestoError {
		return interpret(context, false);
	}
	
	public IValue interpret(Context context, boolean nativeOnly) throws PrestoError {
		try {
			return doInterpret(context, nativeOnly);
		} catch(NullPointerException e) {
			throw new NullReferenceError();
		}
	}
	
	private IValue doInterpret(Context context, boolean nativeOnly) throws PrestoError {
		for(IStatement statement : this) {
			if(nativeOnly && !(statement instanceof JavaNativeCall))
				continue;
			context.enterStatement(statement);
			try {
				IValue result = statement.interpret(context);
				if(result!=null)
					return result;
			} finally {
				context.leaveStatement(statement);
			}
		}
		return null;
	}

	public void toDialect(CodeWriter writer) {
		for(IStatement statement : this) {
			statement.toDialect(writer);
			if(statement instanceof SimpleStatement) {
				if(writer.getDialect()==Dialect.O)
					writer.append(';');
				writer.newLine();
			}
		}
	}


	
}
