package prompto.store.solr;

import java.util.Collection;
import java.util.Stack;

import prompto.store.Family;
import prompto.store.IQueryBuilder.MatchOp;

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

	
	public void push(SOLRAttributeInfo info, MatchOp operator, Object fieldValue) {
		StringBuilder sb = new StringBuilder();
		info.addFieldNameFor(sb, operator);
		sb.append(':');
		switch(operator) {
		case EQUALS:
		case ROUGHLY:
			pushExact(sb, info, operator, fieldValue);
			break;
		case GREATER:
			pushGreater(sb, info, operator, fieldValue);
			break;
		case LESSER:
			pushLesser(sb, info, operator, fieldValue);
			break;
		case CONTAINS:
			pushContains(sb, info, operator, fieldValue);
			break;
		case CONTAINED:
			pushContained(sb, info, operator, fieldValue);
			break;
		}
		stack.push(sb.toString());
	}

	private void pushContains(StringBuilder sb, SOLRAttributeInfo info, MatchOp operator, Object fieldValue) {
		if(info.getFamily()==Family.TEXT && !info.isCollection()) {
			sb.append('*');
			escape(sb, fieldValue);
			sb.append('*');
		} else
			escape(sb, fieldValue);
	}

	@SuppressWarnings("unchecked")
	private void pushContained(StringBuilder sb, SOLRAttributeInfo info, MatchOp operator, Object fieldValue) {
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
	}

	private void pushGreater(StringBuilder sb, SOLRAttributeInfo info, MatchOp operator, Object fieldValue) {
		sb.append('{');
		escape(sb, fieldValue);
		sb.append(" TO *}");
	}

	private void pushLesser(StringBuilder sb, SOLRAttributeInfo info, MatchOp operator, Object fieldValue) {
		sb.append("{* TO ");
		escape(sb, fieldValue);
		sb.append('}');
	}

	private void pushExact(StringBuilder sb, SOLRAttributeInfo info, MatchOp operator, Object fieldValue) {
		escape(sb, fieldValue);
	}

	private <T> void escape(StringBuilder sb, T value) {
		boolean wasAmpersand = false;
		boolean wasPipe = false;
		char[] chars = value.toString().toCharArray();
		boolean needsDoubleQuotes = chars[0]=='"' && chars[chars.length-1]=='"';
		if(needsDoubleQuotes)
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
			case ' ':
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
		if(needsDoubleQuotes)
			sb.append('"');
	}

	public String toSolrQuery() {
		return stack.pop();
	}

	
}
