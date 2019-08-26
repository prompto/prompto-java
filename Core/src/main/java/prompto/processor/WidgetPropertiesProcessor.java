package prompto.processor;


import prompto.declaration.CategoryDeclaration;
import prompto.declaration.IWidgetDeclaration;
import prompto.grammar.Annotation;
import prompto.grammar.Structure;
import prompto.literal.DictEntry;
import prompto.literal.DocEntryList;
import prompto.literal.DocumentLiteral;
import prompto.literal.TypeLiteral;
import prompto.runtime.Context;
import prompto.type.StructureType;

public class WidgetPropertiesProcessor extends AnnotationProcessor {

	@Override
	public void processCategory(Annotation annotation, Context context, CategoryDeclaration declaration) {
		if(declaration.isAWidget(context))
			doProcessCategory(annotation, context, declaration);
		else
			context.getProblemListener().reportIllegalAnnotation(annotation, "WidgetProperties is only applicable to widgets");
	}

	private void doProcessCategory(Annotation annotation, Context context, CategoryDeclaration declaration) {
		IWidgetDeclaration widget = declaration.asWidget();
		Object types = annotation.getDefaultArgument();
		Structure structure = checkStructure(annotation, context, types);
		if(structure!=null)
			widget.setPropertyTypes(structure);
	}

	private Structure checkStructure(Annotation annotation, Context context, Object types) {
		if(!(types instanceof DocumentLiteral)) {
			context.getProblemListener().reportIllegalAnnotation(annotation, "WidgetProperties expects a Document of types as unique parameter");
			return null;
		}
		return checkStructure(annotation, context, ((DocumentLiteral)types).getEntries());
	}
	
	private Structure checkStructure(Annotation annotation, Context context, DocEntryList entries) {
		Structure structure = new Structure();
		for(DictEntry entry : entries) {
			if(entry.getValue() instanceof TypeLiteral)
				structure.put(entry.getKey().toString(), ((TypeLiteral)entry.getValue()).getType());
			else if(entry.getValue() instanceof DocumentLiteral) {
				Structure embedded = checkStructure(annotation, context, ((DocumentLiteral)entry.getValue()).getEntries());
				if(embedded==null)
					return null;
				else
					structure.put(entry.getKey().toString(), new StructureType(embedded));
			} else {
				context.getProblemListener().reportIllegalAnnotation(annotation, "WidgetProperties expects a Document of types as unique parameter");
				return null;
			}
			
		}
		return structure;
	}


}
