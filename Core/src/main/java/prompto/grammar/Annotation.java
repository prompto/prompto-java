package prompto.grammar;

import prompto.literal.DictEntryList;
import prompto.parser.Section;
import prompto.utils.CodeWriter;

public class Annotation extends Section {

	Identifier name;
	DictEntryList arguments;
	
	public Annotation(Identifier name, DictEntryList arguments) {
		this.name = name;
		this.arguments = arguments;
	}
	
	public boolean isNamed(String name) {
		return name.equals(this.name.toString());
	}

	public void toDialect(CodeWriter writer) {
		writer.append(name.toString());
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

}
