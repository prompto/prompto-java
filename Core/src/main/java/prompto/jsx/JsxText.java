package prompto.jsx;

import java.util.Arrays;
import java.util.stream.Collectors;

import prompto.runtime.Context;
import prompto.transpiler.Transpiler;
import prompto.type.IType;
import prompto.type.TextType;
import prompto.utils.CodeWriter;
import prompto.utils.HtmlUtils;
import prompto.utils.StringUtils;

public class JsxText implements IJsxExpression {

	String text;
	
	public JsxText(String text) {
		this.text = text;
	}
	
	@Override
	public String toString() {
		return text;
	}

	@Override
	public IType check(Context context) {
		return TextType.instance();
	}

	@Override
	public void toDialect(CodeWriter writer) {
		writer.append(text);
	}
	
	@Override
	public void declare(Transpiler transpiler) {
		// nothing to do
	}
	
	@Override
	public boolean transpile(Transpiler transpiler) {
		String text = HtmlUtils.decodeHtmlEntities(StringUtils.escape(this.text));
		text = Arrays.stream(text.split("\n"))
				.map(String::trim)
				.collect(Collectors.joining(" "));
		transpiler.append('"').append(text).append('"');
		return false;
	}


}
