package prompto.store.solr;

import java.util.Stack;

import prompto.grammar.EqOp;
import prompto.runtime.Context;
import prompto.store.IFilterBuilder;
import prompto.type.CategoryType;

class SOLRFilterBuilder implements IFilterBuilder {

	Stack<String> stack = new Stack<>();
	
	@Override
	public void and() {
		String e1 = stack.pop();
		String e2 = stack.pop();
		stack.push("(" + e1 + " AND " + e2 + ")");
	}
	
	@Override
	public void push(Context context, String fieldName, EqOp operator, Object fieldValue) {
		TextFieldFlags flags = TextFieldFlags.computeFieldFlags(context, fieldName);
		StringBuilder sb = new StringBuilder();
		switch(operator) {
		case IS:
		case IS_NOT:
		// TODO: could add a category clause	
		case IS_A:
		case IS_NOT_A:
			throw new UnsupportedOperationException();
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
		case NOT_EQUALS:
			sb.append('-');
			if(flags!=null)
				flags.addSuffixForEquals(sb);
			break;
		default:
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

	public void pushCategory(CategoryType type) {
		stack.push("category-key:" + type.getFamily());
	}
	
}
