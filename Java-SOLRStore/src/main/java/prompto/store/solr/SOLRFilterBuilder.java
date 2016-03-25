package prompto.store.solr;

import java.util.Stack;

import prompto.runtime.Context;
import prompto.store.IQuery.MatchOp;

class SOLRFilterBuilder {

	Context context;
	Stack<String> stack = new Stack<>();
	
	public SOLRFilterBuilder(Context context) {
		this.context = context;
	}

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

	
	public void push(String fieldName, MatchOp operator, Object fieldValue, TextFieldFlags flags) {
		StringBuilder sb = new StringBuilder();
		switch(operator) {
		case EQUALS:
			sb.append(fieldName);
			if(flags!=null)
				flags.addSuffixForEquals(sb);
			break;
		case ROUGHLY:
			sb.append(fieldName);
			if(flags!=null)
				flags.addSuffixForRoughly(sb);
			break;
		default:
			sb.append(fieldName);
		}
		sb.append(':');
		escape(sb, fieldValue);
		stack.push(sb.toString());
	}

	private <T> void escape(StringBuilder sb, T value) {
		boolean wasAmpersand = false;
		boolean wasPipe = false;
		for(char c : value.toString().toCharArray()) {
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
	}

	public String toSolrQuery() {
		return stack.pop();
	}

	
}
