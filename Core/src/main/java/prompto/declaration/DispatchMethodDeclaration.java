package prompto.declaration;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import prompto.compiler.ClassFile;
import prompto.param.AttributeParameter;
import prompto.param.CategoryParameter;
import prompto.param.IParameter;
import prompto.param.ParameterList;
import prompto.param.UnresolvedParameter;
import prompto.runtime.Context;
import prompto.statement.MethodCall;
import prompto.transpiler.Transpiler;
import prompto.type.IType;
import prompto.utils.CodeWriter;


public class DispatchMethodDeclaration extends BaseMethodDeclaration {

	Context context;
	MethodCall call;
	IMethodDeclaration declaration;
	List<IMethodDeclaration> declarations;
	
	public DispatchMethodDeclaration(Context context, MethodCall call, IMethodDeclaration declaration, List<IMethodDeclaration> declarations) {
		super(declaration.getId(), declaration.getParameters(), declaration.getReturnType());
		this.context = context;
		this.call = call;
		this.declaration = declaration;
		this.declarations = declarations;
	}

	@Override
	public String getTranspiledName(Context context) {
		return "$dispatch$" + this.declaration.getTranspiledName(context);
	}
	
	
	@Override
	public void declare(Transpiler transpiler) {
		// nothing to do
	}
	
	@Override
	public boolean transpile(Transpiler transpiler) {
	    this.registerParameters(transpiler.getContext());
	    this.transpileProlog(transpiler);
	    this.transpileDispatch(transpiler);
	    this.transpileEpilog(transpiler);
		return true;
	}

	private void transpileDispatch(Transpiler transpiler) {
		Set<IParameter> common = this.collectCommonArguments();
	    for(int i=0; i<this.declarations.size(); i++) {
	        if(i>0)
	            transpiler.append("else ");
	        if(i<this.declarations.size()-1) {
	            transpiler.append("if(");
	            this.transpileTest(transpiler, common, this.declarations.get(i));
	            transpiler.append(")");
	        }
	        transpiler.indent();
	        this.transpileCall(transpiler, this.declarations.get(i));
	        transpiler.dedent();
	    }
	}

	private void transpileCall(Transpiler transpiler, IMethodDeclaration declaration) {
	    call.transpileSelector(transpiler, declaration);
	    transpiler.append("(");
	    this.parameters.forEach(arg -> {
	        transpiler.append(arg.getName());
	        transpiler.append(", ");
	    });
	    transpiler.trimLast(2);
	    transpiler.append(")");
	}

	private void transpileTest(Transpiler transpiler, Set<IParameter> common, IMethodDeclaration declaration) {
	    for(int i = 0, count = 0;i<this.call.getArguments().size(); i++) {
	        IParameter incoming = this.call.getArguments().get(i).getParameter();
	        if(common.contains(incoming))
	            continue;
	        if(count>0)
	            transpiler.append(" && ");
	        count++;
	        if(incoming instanceof UnresolvedParameter)
	            incoming = ((UnresolvedParameter)incoming).getResolved();
	        IParameter outgoing = incoming==null ? declaration.getParameters().get(0) : findCorrespondingArg(transpiler.getContext(), declaration.getParameters(), common, incoming);
	        if(outgoing instanceof UnresolvedParameter)
	        	outgoing = ((UnresolvedParameter)incoming).getResolved();
	        if(incoming==null)
	            incoming = this.declaration.getParameters().get(0);
	        if(incoming instanceof UnresolvedParameter)
	            incoming = ((UnresolvedParameter)incoming).getResolved();
	        if(incoming instanceof CategoryParameter && outgoing instanceof CategoryParameter) {
	            transpiler.append(incoming.getName()).append(".instanceOf(").append(((CategoryParameter)outgoing).getType().getTypeName()).append(")");
	        } else if(incoming instanceof CategoryParameter && outgoing instanceof AttributeParameter) {
	            transpiler.append(incoming.getName()).append(".hasOwnProperty('").append(outgoing.getName()).append("')");
	        } else
	            throw new Error("Unsupported: " + incoming.getClass().getSimpleName() + " and " + outgoing.getClass().getSimpleName());
	    }
	}

	private IParameter findCorrespondingArg(Context context2, ParameterList arguments, Set<IParameter> common, IParameter incoming) {
	    for(int i=0;i<arguments.size();i++) {
	    	IParameter outgoing = arguments.get(i);
	        if (common.contains(outgoing))
	            continue;
	        if (outgoing.equals(incoming))
	            return outgoing;
	        if (incoming instanceof CategoryParameter && outgoing instanceof CategoryParameter) {
	            if(((CategoryParameter)incoming).getType().isAssignableFrom(context, ((CategoryParameter)outgoing).getType()) || ((CategoryParameter)outgoing).getType().isAssignableFrom(context, ((CategoryParameter)incoming).getType()))
	                return outgoing;
	        }
	    }
	    throw new Error("Could not find matching argument for: " + incoming + " in " + arguments);
	}

	private Set<IParameter> collectCommonArguments() {
		Set<IParameter> common = null;
	    for(int i=0; i<this.declarations.size(); i++) {
	    	IMethodDeclaration declaration = this.declarations.get(i);
	        if(i==0)
	            common = new HashSet<>(declaration.getParameters());
	        else {
	        	Set<IParameter> current = new HashSet<>(declaration.getParameters());
	            common.retainAll(current);
	            if(common.isEmpty())
	                break;
	        }
	    }
	    return common;
	}

	@Override
	public boolean isAbstract() {
		return false;
	}

	@Override
	public boolean isTemplate() {
		return false;
	}

	@Override
	public void compile(Context context, boolean isStart, ClassFile classFile) {
		throw new UnsupportedOperationException("Should never get there!");
	}

	@Override
	public String compileTemplate(Context context, boolean isStart, ClassFile classFile) {
		throw new UnsupportedOperationException("Should never get there!");
	}

	@Override
	public IType check(Context context, boolean isStart) {
		throw new UnsupportedOperationException("Should never get there!");
	}
	
	@Override
	public IType checkChild(Context context) {
		throw new UnsupportedOperationException("Should never get there!");
	}

	@Override
	public void declarationToDialect(CodeWriter writer) {
		throw new UnsupportedOperationException("Should never get there!");
	}


}
