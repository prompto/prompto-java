package prompto.css;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

import prompto.compiler.CompilerUtils;
import prompto.compiler.Flags;
import prompto.compiler.MethodInfo;
import prompto.compiler.ResultInfo;
import prompto.error.PromptoError;
import prompto.expression.IExpression;
import prompto.parser.Section;
import prompto.runtime.Context;
import prompto.transpiler.Transpiler;
import prompto.type.CssType;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.CssValue;
import prompto.value.IValue;

public class CssExpression extends Section implements IExpression {

	List<CssField> fields;
	
	public CssExpression() {
		this(new ArrayList<>());
	}
	
	public CssExpression(List<CssField> fields) {
		this.fields = fields;
	}

	@Override
	public IType check(Context context) {
		return CssType.instance();
	}

	@Override
	public IValue interpret(Context context) throws PromptoError {
		return new CssValue(this);
	}

	@Override
	public void toDialect(CodeWriter writer) {
		writer.append("{");
		fields.forEach(field->field.toDialect(writer));
		writer.append("}");
	}
	
	@Override
	public String toString() {
		return "{ " +  fields.stream().map(CssField::toString).collect(Collectors.joining(", ")) + " }";
	}

	public JsonNode toJson(boolean withType) {
		ObjectNode result = JsonNodeFactory.instance.objectNode();
		fields.forEach(field->field.toJson(result, withType));
		return result;
	}
	
	public CssExpression plus(CssExpression expression) {
		Set<String> replacing = expression.fields.stream().map(CssField::getName).collect(Collectors.toSet());
		List<CssField> result = Stream.concat(fields.stream().filter(field -> !replacing.contains(field.getName())), expression.fields.stream())
				.collect(Collectors.toList());
		return new CssExpression(result);
	}

	public void addField(CssField field) {
		fields.add(field);
	}
	
	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		return CompilerUtils.compileNewInstance(method, Object.class);
	}

	@Override
	public void declare(Transpiler transpiler) {
		fields.forEach(field->field.declare(transpiler));
	}
	
	@Override
	public boolean transpile(Transpiler transpiler) {
		transpiler.append("{");
		fields.forEach(field->{
			field.transpile(transpiler);
			transpiler.append(", ");
		});
		transpiler.trimLast(", ".length());
		transpiler.append("}");
		return false;
	}


}
