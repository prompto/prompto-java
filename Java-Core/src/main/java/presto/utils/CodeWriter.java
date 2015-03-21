package presto.utils;

import presto.parser.Dialect;
import presto.runtime.Context;

public class CodeWriter {
	
	class Indenter {
		
		public String indents = "";
		public boolean isStartOfLine = true;
		
		public void appendTabsIfRequired(String s) {
			appendTabsIfRequired(s.charAt(s.length()-1));
		}

		public void appendTabsIfRequired(char c) {
			if(isStartOfLine)
				sb.append(indents);
			isStartOfLine = c=='\n';
		}
		
		public void indent() {
			indents += '\t';
		}

		public void dedent() {
			if(indents.isEmpty())
				throw new RuntimeException("Illegal dedent!");
			indents = indents.substring(1);
		}
	}
	
	Dialect dialect;
	Context context;
	StringBuilder sb;
	Indenter indenter;
	
	public CodeWriter(Dialect dialect, Context context) {
		this.dialect = dialect;
		this.context = context;
		this.sb = new StringBuilder();
		indenter = new Indenter();
	}
	
	public CodeWriter(Dialect dialect, Context context, StringBuilder sb, Indenter indenter) {
		this.dialect = dialect;
		this.context = context;
		this.sb = sb;
		this.indenter = indenter;
	}

	public Context getContext() {
		return context;
	}
	
	public void append(String s) {
		indenter.appendTabsIfRequired(s);
		sb.append(s);
	}

	public void append(char c) {
		indenter.appendTabsIfRequired(c);
		sb.append(c);
	}

	@Override
	public String toString() {
		return sb.toString();
	}

	public Dialect getDialect() {
		return dialect;
	}

	public void trimLast(int count) {
		sb.setLength(sb.length()-count);
	}

	public void indent() {
		indenter.indent();
	}

	public void dedent() {
		indenter.dedent();
	}

	public void newLine() {
		append('\n');
	}

	public boolean isGlobalContext() {
		return context.isGlobalContext();
	}

	public CodeWriter newLocalWriter() {
		return new CodeWriter(dialect, context.newLocalContext(), sb, indenter);
	}

}
