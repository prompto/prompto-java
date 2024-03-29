package prompto.statement;

import java.util.LinkedList;
import java.util.Objects;

import prompto.compiler.Flags;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.compiler.StackLocals;
import prompto.error.PromptoError;
import prompto.java.JavaNativeCall;
import prompto.parser.Dialect;
import prompto.parser.ICodeSection;
import prompto.parser.ISection;
import prompto.runtime.Context;
import prompto.transpiler.Transpiler;
import prompto.type.IType;
import prompto.type.TypeMap;
import prompto.type.VoidType;
import prompto.utils.CodeWriter;
import prompto.utils.Logger;
import prompto.value.IValue;


@SuppressWarnings("serial")
public class StatementList extends LinkedList<IStatement> {

	static final Logger logger = new Logger();

	public StatementList() {
	}

	public StatementList(IStatement stmt) {
		this.add(stmt);
	}
	

	public ICodeSection locateCodeSection(ISection section) {
		return this.stream()
				.map(s->s.locateCodeSection(section))
				.filter(Objects::nonNull)
				.findFirst()
				.orElse(null);
	}
	
	@Override
	public boolean add(IStatement stmt) {
		if(stmt!=null)
			return super.add(stmt);
		else
			return false;
	}
	
	public IType check(Context context, IType returnType) {
		if(returnType != null)
			returnType = returnType.resolve(context, null);
		if(returnType==VoidType.instance()) {
			for(IStatement statement : this) {
				IType type = statement.check(context);
				if(type!=null)
					type = type.resolve(context, null);
				if(type!=null && type!=VoidType.instance())
					context.getProblemListener().reportIllegalReturn(statement);
			}
			return returnType;
		} else {
			TypeMap types = new TypeMap();
			if(returnType!=null)
				types.add(returnType);
			ICodeSection section = null;
			for(IStatement statement : this) {
				IType type = statement.check(context);
				if(!statement.canReturn())
					type = VoidType.instance();
				if(type!=null)
					type = type.resolve(context, null);
				if(type!=null && type!=VoidType.instance()) { // null indicates error
					types.add(type);
					section = statement;
				}
			}
			IType type = types.inferType(context, section);
			if(returnType!=null)
				return returnType;
			else
				return type;
		}
	}

	public IType checkNative(Context context, IType returnType) {
		if(returnType != null)
			returnType = returnType.resolve(context, null);
		if(returnType==VoidType.instance()) {
			// don't check return type
			for(IStatement statement : this) {
				if(!(statement instanceof JavaNativeCall))
					continue;
				IType type = ((JavaNativeCall)statement).checkNative(context, returnType);
				if(type!=null)
					type = type.resolve(context, null);
				// TODO: remove the below workaround for unregistered native categories
				if(type==null)
					type = returnType;
				if(type!=VoidType.instance())
					context.getProblemListener().reportIllegalReturn(statement);
			}
			return returnType;
		} else {
			TypeMap types = new TypeMap();
			if(returnType!=null)
				types.add(returnType);
			ICodeSection section = null;
			for(IStatement statement : this) {
				if(!(statement instanceof JavaNativeCall))
					continue;
				// TODO: ensure returnType is registered prior to the below 
				IType type = ((JavaNativeCall)statement).checkNative(context, returnType);
				if(type!=null)
					type = type.resolve(context, null);
				// TODO: remove the below workaround for unregistered native categories
				if(type==null)
					type = returnType;
				if(type!=VoidType.instance()) {
					types.add(type);
					section = statement;
				}
			}
			IType type = types.inferType(context, section);
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
			if(statement instanceof CommentStatement)
				continue;
			context.enterStatement(statement);
			try {
				IValue result = statement.interpret(context);
				if(result!=null && statement.canReturn())
					return result;
			} catch(PromptoError e) {
				logger.error(()->e.getMessage() + " while interpreting " + statement.toString() + " in method " + context.getProblemListener().getEnclosingDeclaration(), e);
				throw e;
			} finally {
				context.leaveStatement(statement);
			}
		}
		return null;
	}
	

	public void toDialect(CodeWriter writer) {
		if(this.isEmpty()) switch(writer.getDialect()) {
		case E:
		case M:
			writer.append("pass").newLine();
		default:
			break;
		} else {
			for(IStatement statement : this) {
				statement.toDialect(writer);
				if(statement.isSimple()) {
					if(writer.getDialect()==Dialect.O && !(statement instanceof NativeCall))
						writer.append(';');
					writer.newLine();
				}
			}
		}
	}

	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		if(this.size()>0) {
			ResultInfo info = new ResultInfo(void.class);
			StackLocals state = method.captureStackLocals();
			for(IStatement statement : this) {
				// TODO refine actual info, here we assume all statements are reachable
				info = statement.compile(context, method, flags);
				if(info.getType()!=void.class && !info.isReturn()) {
					method.addInstruction(Opcode.POP);
					info = new ResultInfo(void.class);
				}
			}
			method.restoreStackLocals(state);
			return info;
		} else
			return new ResultInfo(void.class);
	}

	public void declare(Transpiler transpiler) {
		this.forEach(stmt->stmt.declare(transpiler));
		
	}

	public void transpile(Transpiler transpiler) {
		this.forEach(stmt->{
			boolean skip = stmt.transpile(transpiler);
			if(!skip)
	            transpiler.append(";").newLine();
		});
	}

	
}
