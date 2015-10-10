package prompto.declaration;

import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.Identifier;
import prompto.grammar.MethodDeclarationList;
import prompto.grammar.NativeAttributeBindingListMap;
import prompto.grammar.NativeCategoryBinding;
import prompto.grammar.NativeCategoryBindingList;
import prompto.java.JavaNativeCategoryBinding;
import prompto.runtime.Context;
import prompto.utils.CodeWriter;
import prompto.utils.IdentifierList;
import prompto.value.IInstance;
import prompto.value.NativeInstance;

public class NativeCategoryDeclaration extends ConcreteCategoryDeclaration {
	
	NativeCategoryBindingList categoryBindings;
	NativeAttributeBindingListMap attributeMappings;
	Class<?> boundClass = null;
	
	public NativeCategoryDeclaration(Identifier name, IdentifierList attributes, 
			NativeCategoryBindingList categoryMappings, 
			NativeAttributeBindingListMap attributeMappings,
			MethodDeclarationList methods) {
		super(name, attributes, null, methods);
		this.categoryBindings = categoryMappings;
		this.attributeMappings = attributeMappings;
	}

	@Override
	public void register(Context context) throws SyntaxError {
		super.register(context);
		Class<?> klass = getBoundClass(false);
		if(klass!=null)
			context.registerNativeBinding(klass, this);
	}
	
	@Override
	protected void toEDialect(CodeWriter writer) {
		protoToEDialect(writer, false, true);
		bindingsToEDialect(writer);
		methodsToEDialect(writer);
	}

	private void methodsToEDialect(CodeWriter writer) {
		if(methods!=null && methods.size()>0) {
			writer.append("and methods:");
			writer.newLine();
			methodsToEDialect(writer, methods);
		}
	}

	protected void categoryTypeToEDialect(CodeWriter writer) {
		writer.append("native category");
	}
	
	protected void bindingsToEDialect(CodeWriter writer) {
		writer.indent();
		categoryBindings.toDialect(writer);
		writer.dedent();
		writer.newLine();
	}

	@Override
	protected void toODialect(CodeWriter writer) {
		boolean hasBody = true; // always one
		toODialect(writer, hasBody); 
	}
	
	@Override
	protected void categoryTypeToODialect(CodeWriter writer) {
		writer.append("native category");
	}
	
	@Override
	protected void bodyToODialect(CodeWriter writer) {
		categoryBindings.toDialect(writer);
		if(methods!=null && methods.size()>0) {
			writer.newLine();
			writer.newLine();
			methodsToODialect(writer, methods);
		}
	}

	@Override
	protected void toSDialect(CodeWriter writer) {
		protoToPDialect(writer, null);
		writer.indent();
		writer.newLine();
		categoryBindings.toDialect(writer);
		if(methods!=null && methods.size()>0) {
			for(IDeclaration decl : methods) {
				CodeWriter w = writer.newMemberWriter();
				decl.toDialect(w);
				writer.newLine();
			}
		}
		writer.dedent();
		writer.newLine();
	}
	
	@Override
	protected void categoryTypeToPDialect(CodeWriter writer) {
		writer.append("native category");
	}

	@Override
	public IInstance newInstance() throws PromptoError {
		return new NativeInstance(this);
	}

	public Class<?> getBoundClass(boolean fail) throws SyntaxError {
		if(boundClass==null) {
			JavaNativeCategoryBinding mapping = getBinding(fail);
			if(mapping!=null) {
				boundClass = mapping.getExpression().interpret_class();
				if(boundClass==null && fail)
					throw new SyntaxError("No Java class:" + mapping.getExpression().toString());
			}
		}
		return boundClass;
	}

	private JavaNativeCategoryBinding getBinding(boolean fail) throws SyntaxError {
		for(NativeCategoryBinding mapping : categoryBindings) {
			if(mapping instanceof JavaNativeCategoryBinding)
				return (JavaNativeCategoryBinding)mapping;
		}
		if(fail)
			throw new SyntaxError("Missing JAVA mapping !");
		else
			return null;
	}
	
}
