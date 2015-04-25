package presto.declaration;

import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.grammar.Identifier;
import presto.grammar.MethodDeclarationList;
import presto.grammar.NativeAttributeBindingListMap;
import presto.grammar.NativeCategoryBinding;
import presto.grammar.NativeCategoryBindingList;
import presto.java.JavaNativeCategoryBinding;
import presto.runtime.Context;
import presto.utils.CodeWriter;
import presto.utils.IdentifierList;
import presto.value.IInstance;
import presto.value.NativeInstance;

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
			context.registerNativeMapping(klass, this);
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
	public IInstance newInstance() throws PrestoError {
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
