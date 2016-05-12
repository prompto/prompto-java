package prompto.store.solr;

import java.util.Collection;
import java.util.Stack;

import prompto.store.IQuery.MatchOp;

class SOLRFilterBuilder {

	Stack<String> stack = new Stack<>();
	
	public void and() {
		String e1 = stack.pop();
		String e2 = stack.pop();
		stack.push("(" + e1 + " AND " + e2 + ")");
	}
	
	public void or() {
		String e1 = stack.pop();
		String e2 = stack.pop();
		stack.push("(" + e1 + " OR " + e2 + ")");
	}
	
	public void not() {
		String e = stack.pop();
		stack.push("-" + e);
	}

	
	@SuppressWarnings("unchecked")
	public void push(SOLRAttributeInfo info, MatchOp operator, Object fieldValue) {
		StringBuilder sb = new StringBuilder();
		info.addFieldNameFor(sb, operator);
		sb.append(':');
		if(fieldValue instanceof Collection) {
			sb.append('(');
			((Collection<Object>)fieldValue).forEach((value)->{
				escape(sb, value);
				sb.append(" OR ");
			});
			sb.setLength(sb.length() - " OR ".length());
			sb.append(')');
		} else
			escape(sb, fieldValue);
		stack.push(sb.toString());
	}

	private <T> void escape(StringBuilder sb, T value) {
		boolean wasAmpersand = false;
		boolean wasPipe = false;
		char[] chars = value.toString().toCharArray();
		boolean isDoubleQuoted = chars[0]=='"' && chars[chars.length-1]=='"';
		if(isDoubleQuoted)
			sb.append('"');
		for(char c : chars) {
			switch(c) {
			case '+':
			case '-':
			case '!':
			case '(':
			case ')':
			case '{':
			case '}':
			case '[':
			case ']':
			case '^':
			case '"':
			case '~':
			case '*':
			case '?':
			case ':':
			case '\\':
				if(wasAmpersand) {
					sb.append('&');
					wasAmpersand = false;
				}
				if(wasPipe) {
					sb.append('|');
					wasPipe = false;
				}
				sb.append('\\');
				sb.append(c);
				break;
			case '&':
				if(wasAmpersand) {
					sb.append("\\&&");
					wasAmpersand = false;
				} else
					wasAmpersand = true;
				break;
			case '|':
				if(wasPipe) {
					sb.append("\\||");
					wasPipe = false;
				} else
					wasPipe = true;
				break;
			default:
				if(wasAmpersand) {
					sb.append('&');
					wasAmpersand = false;
				}
				if(wasPipe) {
					sb.append('|');
					wasPipe = false;
				}
				sb.append(c);
			}
		}
		if(wasAmpersand) {
			sb.append('&');
			wasAmpersand = false;
		}
		if(wasPipe) {
			sb.append('|');
			wasPipe = false;
		}
		if(isDoubleQuoted)
			sb.append('"');
	}

	public String toSolrQuery() {
		return stack.pop();
	}

	
}
