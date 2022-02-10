package prompto.processor;

import java.util.HashMap;
import java.util.Map;

import prompto.declaration.CategoryDeclaration;
import prompto.grammar.Annotation;
import prompto.grammar.Identifier;
import prompto.runtime.Context;

public abstract class AnnotationProcessor {

	static Map<Identifier, AnnotationProcessor> processors = new HashMap<>();
	
	public static AnnotationProcessor forId(Identifier id) {
		return processors.computeIfAbsent(id, key->{
			String simpleName = id.toString().substring(1) + "Processor";
			String fullName = AnnotationProcessor.class.getPackage().getName() + "." + simpleName;
			try {
				Class<?> klass = Class.forName(fullName);
				return (AnnotationProcessor)klass.getDeclaredConstructor().newInstance();
			} catch(ClassNotFoundException e) {
				return null;
			} catch(Throwable t) {
				throw new RuntimeException(t);
			}
		});
	}

	public abstract void processCategory(Annotation annotation, Context context, CategoryDeclaration declaration);

}
