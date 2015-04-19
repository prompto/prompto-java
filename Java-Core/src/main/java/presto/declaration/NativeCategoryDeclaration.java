package presto.declaration;

import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.grammar.Identifier;
import presto.grammar.NativeAttributeMappingListMap;
import presto.grammar.NativeCategoryMapping;
import presto.grammar.NativeCategoryMappingList;
import presto.java.JavaNativeCategoryMapping;
import presto.runtime.Context;
import presto.utils.CodeWriter;
import presto.utils.IdentifierList;
import presto.value.IInstance;
import presto.value.NativeInstance;

public class NativeCategoryDeclaration extends CategoryDeclaration {
	
	NativeCategoryMappingList categoryMappings;
	NativeAttributeMappingListMap attributeMappings;
	Class<?> mappedClass = null;
	
	public NativeCategoryDeclaration(Identifier name, IdentifierList attributes, 
			NativeCategoryMappingList categoryMappings, NativeAttributeMappingListMap attributeMappings) {
		super(name,attributes);
		this.categoryMappings = categoryMappings;
		this.attributeMappings = attributeMappings;
	}

	@Override
	public void register(Context context) throws SyntaxError {
		super.register(context);
		Class<?> klass = getMappedClass(false);
		if(klass!=null)
			context.registerNativeMapping(klass, this);
	}
	
	@Override
	protected void toEDialect(CodeWriter writer) {
		protoToEDialect(writer, false, true);
		mappingsToEDialect(writer);
	}

	protected void categoryTypeToEDialect(CodeWriter writer) {
		writer.append("native category");
	}
	
	protected void mappingsToEDialect(CodeWriter writer) {
		writer.indent();
		categoryMappings.toDialect(writer);
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
		categoryMappings.toDialect(writer);
	}

	@Override
	protected void toPDialect(CodeWriter writer) {
		protoToPDialect(writer, null);
		writer.indent();
		writer.newLine();
		categoryMappings.toDialect(writer);
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

	public Class<?> getMappedClass(boolean fail) throws SyntaxError {
		if(mappedClass==null) {
			JavaNativeCategoryMapping mapping = getMapping(fail);
			if(mapping!=null) {
				mappedClass = mapping.getExpression().interpret_class();
				if(mappedClass==null && fail)
					throw new SyntaxError("No Java class:" + mapping.getExpression().toString());
			}
		}
		return mappedClass;
	}

	private JavaNativeCategoryMapping getMapping(boolean fail) throws SyntaxError {
		for(NativeCategoryMapping mapping : categoryMappings) {
			if(mapping instanceof JavaNativeCategoryMapping)
				return (JavaNativeCategoryMapping)mapping;
		}
		if(fail)
			throw new SyntaxError("Missing JAVA mapping !");
		else
			return null;
	}
	
}
