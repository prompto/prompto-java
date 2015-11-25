package prompto.statement;

import java.util.LinkedList;

import prompto.error.NullReferenceError;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.java.JavaNativeCall;
import prompto.parser.Dialect;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.type.TypeMap;
import prompto.type.VoidType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;


public class StatementList extends LinkedList<IStatement> {

	private static final long serialVersionUID = 1L;

	public StatementList() {
	}

	public StatementList(IStatement stmt) {
		this.add(stmt);
	}
	
	@Override
	public boolean add(IStatement stmt) {
		if(stmt!=null)
			return super.add(stmt);
		else
			return false;
	}
	
	public IType check(Context context, IType returnType) throws SyntaxError {
		if(returnType==VoidType.instance()) {
			for(IStatement statement : this) {
				IType type = statement.check(context);
				if(type!=VoidType.instance())
					context.getProblemListener().reportIllegalReturn(statement);
			}
			return returnType;
		} else {
			TypeMap types = new TypeMap();
			if(returnType!=null)
				types.put(returnType.getId(), returnType);
			for(IStatement statement : this) {
				IType type = statement.check(context);
				if(type!=VoidType.instance())
					types.put(type.getId(), type);
			}
			IType type = types.inferType(context);
			if(returnType!=null)
				return returnType;
			else
				return type;
		}
	}

	public IType checkNative(Context context, IType returnType) throws SyntaxError {
		if(returnType==VoidType.instance()) {
			// don't check return type
			for(IStatement statement : this) {
				if(!(statement instanceof JavaNativeCall))
					continue;
				IType type = ((JavaNativeCall)statement).checkNative(context, returnType);
				if(type!=VoidType.instance())
					context.getProblemListener().reportIllegalReturn(statement);
			}
			return returnType;
		} else {
			TypeMap types = new TypeMap();
			if(returnType!=null)
				types.put(returnType.getId(), returnType);
			for(IStatement statement : this) {
				if(!(statement instanceof JavaNativeCall))
					continue;
				// TODO: ensure returnType is registered prior to the below 
				IType type = ((JavaNativeCall)statement).checkNative(context, returnType);
				// TODO: remove the below workaround for unregistered native categories
				if(type==null)
					type = returnType;
				if(type!=VoidType.instance())
					types.put(type.getId(), type);
			}
			IType type = types.inferType(context);
			if(returnType!=null)
				return returnType;
			else
				return type;
		}
	}

	public IValue interpret(Context context) throws PromptoError {
		return doInterpret(context);
	}

	private IValue doInterpret(Context context) throws PromptoError {
		for(IStatement statement : this) {
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
	
	public IValue interpretNative(Context context, IType returnType) throws PromptoError {
		try {
			return doInterpretNative(context, returnType);
		} catch(NullPointerException e) {
			e.printStackTrace();
			throw new NullReferenceError();
		}
	}
	
	private IValue doInterpretNative(Context context, IType returnType) throws PromptoError {
		for(IStatement statement : this) {
			if(!(statement instanceof JavaNativeCall))
				continue;
			context.enterStatement(statement);
			try {
				IValue result = ((JavaNativeCall)statement).interpretNative(context, returnType);
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
