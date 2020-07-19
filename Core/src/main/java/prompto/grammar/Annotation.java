package prompto.grammar;

import java.util.Optional;

import prompto.declaration.CategoryDeclaration;
import prompto.literal.DocEntry;
import prompto.literal.DocEntryList;
import prompto.parser.Section;
import prompto.processor.AnnotationProcessor;
import prompto.runtime.Context;
import prompto.utils.CodeWriter;
import prompto.utils.Logger;

public class Annotation extends Section {

	static Logger logger = new Logger();
	
	Identifier id;
	DocEntryList arguments;
	
	public Annotation(Identifier id, DocEntryList arguments) {
		this.id = id;
		this.arguments = arguments;
	}
	
	@Override
	public String toString() {
		return id.toString();
	}
	
	public DocEntryList getArguments() {
		return arguments;
	}
	
	public Object getArgument(String name) {
		Optional<DocEntry> entry = arguments.stream()
				.filter(arg->arg.getKey().asIdentifier().toString().equals(name))
				.findFirst();
		if(entry.isPresent())
			return entry.get().getValue();
		else
			return null;
	}

	public Object getDefaultArgument() {
		if(arguments!=null && arguments.size()==1)
			return arguments.get(0).getValue();
		else
			return null;		
	}


	public void toDialect(CodeWriter writer) {
		writer.append(id.toString());
		if(arguments!=null && !arguments.isEmpty()) {
			writer.append("(");
			arguments.forEach(arg->{
				if(arg.getKey()!=null) {
					arg.getKey().toDialect(writer);
					writer.append(" = ");
				}
				arg.getValue().toDialect(writer);
				writer.append(", ");
			});
			writer.trimLast(", ".length());
			writer.append(")");
		}
		writer.newLine();
	}

	public void processCategory(Context context, CategoryDeclaration declaration) {
		AnnotationProcessor processor = AnnotationProcessor.forId(id);
		if(processor!=null)
			processor.processCategory(this, context, declaration);
		else {
			logger.warn(()->"No processor for annotation " + id.toString());
			context.getProblemListener().reportUnknownAnnotation(this, id.toString());
		}
	}



}
