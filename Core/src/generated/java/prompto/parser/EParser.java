// Generated from EParser.g4 by ANTLR 4.7.1
package prompto.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EParser extends AbstractParser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INDENT=1, DEDENT=2, LF_TAB=3, LF_MORE=4, LF=5, TAB=6, WS=7, COMMENT=8, 
		JAVA=9, CSHARP=10, PYTHON2=11, PYTHON3=12, JAVASCRIPT=13, SWIFT=14, COLON=15, 
		SEMI=16, COMMA=17, RANGE=18, DOT=19, LPAR=20, RPAR=21, LBRAK=22, RBRAK=23, 
		LCURL=24, RCURL=25, QMARK=26, XMARK=27, AMP=28, AMP2=29, PIPE=30, PIPE2=31, 
		PLUS=32, MINUS=33, STAR=34, SLASH=35, BSLASH=36, PERCENT=37, SHARP=38, 
		GT=39, GTE=40, LT=41, LTE=42, LTGT=43, LTCOLONGT=44, EQ=45, XEQ=46, EQ2=47, 
		TEQ=48, TILDE=49, LARROW=50, RARROW=51, EGT=52, BOOLEAN=53, CSS=54, CHARACTER=55, 
		TEXT=56, INTEGER=57, DECIMAL=58, DATE=59, TIME=60, DATETIME=61, PERIOD=62, 
		VERSION=63, METHOD_COLON=64, CODE=65, DOCUMENT=66, BLOB=67, IMAGE=68, 
		UUID=69, ITERATOR=70, CURSOR=71, HTML=72, TYPE=73, ABSTRACT=74, ALL=75, 
		ALWAYS=76, AND=77, ANY=78, AS=79, ASC=80, ATTR=81, ATTRIBUTE=82, ATTRIBUTES=83, 
		BINDINGS=84, BREAK=85, BY=86, CASE=87, CATCH=88, CATEGORY=89, CLASS=90, 
		CONTAINS=91, DEF=92, DEFAULT=93, DEFINE=94, DELETE=95, DESC=96, DO=97, 
		DOING=98, EACH=99, ELSE=100, ENUM=101, ENUMERATED=102, EXCEPT=103, EXECUTE=104, 
		EXPECTING=105, EXTENDS=106, FETCH=107, FILTERED=108, FINALLY=109, FLUSH=110, 
		FOR=111, FROM=112, GETTER=113, HAS=114, IF=115, IN=116, INDEX=117, INVOKE_COLON=118, 
		IS=119, MATCHING=120, METHOD=121, METHODS=122, MODULO=123, MUTABLE=124, 
		NATIVE=125, NONE=126, NOT=127, NOTHING=128, NULL=129, ON=130, ONE=131, 
		OPERATOR=132, OR=133, ORDER=134, OTHERWISE=135, PASS=136, RAISE=137, READ=138, 
		RECEIVING=139, RESOURCE=140, RETURN=141, RETURNING=142, ROWS=143, SELF=144, 
		SETTER=145, SINGLETON=146, SORTED=147, STORABLE=148, STORE=149, SUPER=150, 
		SWITCH=151, TEST=152, THEN=153, THIS=154, THROW=155, TO=156, TRY=157, 
		VERIFYING=158, WIDGET=159, WITH=160, WHEN=161, WHERE=162, WHILE=163, WRITE=164, 
		BOOLEAN_LITERAL=165, CHAR_LITERAL=166, MIN_INTEGER=167, MAX_INTEGER=168, 
		SYMBOL_IDENTIFIER=169, TYPE_IDENTIFIER=170, VARIABLE_IDENTIFIER=171, NATIVE_IDENTIFIER=172, 
		DOLLAR_IDENTIFIER=173, ARONDBASE_IDENTIFIER=174, TEXT_LITERAL=175, UUID_LITERAL=176, 
		INTEGER_LITERAL=177, HEXA_LITERAL=178, DECIMAL_LITERAL=179, DATETIME_LITERAL=180, 
		TIME_LITERAL=181, DATE_LITERAL=182, PERIOD_LITERAL=183, VERSION_LITERAL=184, 
		JSX_TEXT=185;
	public static final int
		RULE_enum_category_declaration = 0, RULE_enum_native_declaration = 1, 
		RULE_native_symbol = 2, RULE_category_symbol = 3, RULE_attribute_declaration = 4, 
		RULE_concrete_widget_declaration = 5, RULE_native_widget_declaration = 6, 
		RULE_concrete_category_declaration = 7, RULE_singleton_category_declaration = 8, 
		RULE_derived_list = 9, RULE_operator_method_declaration = 10, RULE_setter_method_declaration = 11, 
		RULE_native_setter_declaration = 12, RULE_getter_method_declaration = 13, 
		RULE_native_getter_declaration = 14, RULE_native_category_declaration = 15, 
		RULE_native_resource_declaration = 16, RULE_native_category_bindings = 17, 
		RULE_native_category_binding_list = 18, RULE_attribute_list = 19, RULE_abstract_method_declaration = 20, 
		RULE_concrete_method_declaration = 21, RULE_native_method_declaration = 22, 
		RULE_test_method_declaration = 23, RULE_assertion = 24, RULE_full_argument_list = 25, 
		RULE_typed_argument = 26, RULE_statement = 27, RULE_flush_statement = 28, 
		RULE_store_statement = 29, RULE_method_call_statement = 30, RULE_with_resource_statement = 31, 
		RULE_with_singleton_statement = 32, RULE_switch_statement = 33, RULE_switch_case_statement = 34, 
		RULE_for_each_statement = 35, RULE_do_while_statement = 36, RULE_while_statement = 37, 
		RULE_if_statement = 38, RULE_else_if_statement_list = 39, RULE_raise_statement = 40, 
		RULE_try_statement = 41, RULE_catch_statement = 42, RULE_break_statement = 43, 
		RULE_return_statement = 44, RULE_expression = 45, RULE_unresolved_expression = 46, 
		RULE_unresolved_selector = 47, RULE_invocation_expression = 48, RULE_invocation_trailer = 49, 
		RULE_selectable_expression = 50, RULE_instance_expression = 51, RULE_instance_selector = 52, 
		RULE_mutable_instance_expression = 53, RULE_document_expression = 54, 
		RULE_blob_expression = 55, RULE_constructor_expression = 56, RULE_write_statement = 57, 
		RULE_ambiguous_expression = 58, RULE_filtered_list_suffix = 59, RULE_fetch_expression = 60, 
		RULE_fetch_statement = 61, RULE_read_statement = 62, RULE_sorted_expression = 63, 
		RULE_argument_assignment_list = 64, RULE_with_argument_assignment_list = 65, 
		RULE_argument_assignment = 66, RULE_assign_instance_statement = 67, RULE_child_instance = 68, 
		RULE_assign_tuple_statement = 69, RULE_lfs = 70, RULE_lfp = 71, RULE_ws_plus = 72, 
		RULE_indent = 73, RULE_dedent = 74, RULE_type_literal = 75, RULE_null_literal = 76, 
		RULE_repl = 77, RULE_declaration_list = 78, RULE_declarations = 79, RULE_declaration = 80, 
		RULE_annotation_constructor = 81, RULE_annotation_identifier = 82, RULE_annotation_argument = 83, 
		RULE_annotation_argument_name = 84, RULE_annotation_argument_value = 85, 
		RULE_resource_declaration = 86, RULE_enum_declaration = 87, RULE_native_symbol_list = 88, 
		RULE_category_symbol_list = 89, RULE_symbol_list = 90, RULE_attribute_constraint = 91, 
		RULE_list_literal = 92, RULE_set_literal = 93, RULE_expression_list = 94, 
		RULE_range_literal = 95, RULE_typedef = 96, RULE_primary_type = 97, RULE_native_type = 98, 
		RULE_category_type = 99, RULE_mutable_category_type = 100, RULE_code_type = 101, 
		RULE_category_declaration = 102, RULE_widget_declaration = 103, RULE_type_identifier_list = 104, 
		RULE_method_identifier = 105, RULE_identifier_or_keyword = 106, RULE_nospace_hyphen_identifier_or_keyword = 107, 
		RULE_nospace_identifier_or_keyword = 108, RULE_identifier = 109, RULE_member_identifier = 110, 
		RULE_variable_identifier = 111, RULE_attribute_identifier = 112, RULE_type_identifier = 113, 
		RULE_symbol_identifier = 114, RULE_argument_list = 115, RULE_argument = 116, 
		RULE_operator_argument = 117, RULE_named_argument = 118, RULE_code_argument = 119, 
		RULE_category_or_any_type = 120, RULE_any_type = 121, RULE_member_method_declaration_list = 122, 
		RULE_member_method_declaration = 123, RULE_native_member_method_declaration_list = 124, 
		RULE_native_member_method_declaration = 125, RULE_native_category_binding = 126, 
		RULE_python_category_binding = 127, RULE_python_module = 128, RULE_javascript_category_binding = 129, 
		RULE_javascript_module = 130, RULE_variable_identifier_list = 131, RULE_attribute_identifier_list = 132, 
		RULE_method_declaration = 133, RULE_comment_statement = 134, RULE_native_statement_list = 135, 
		RULE_native_statement = 136, RULE_python_native_statement = 137, RULE_javascript_native_statement = 138, 
		RULE_statement_list = 139, RULE_assertion_list = 140, RULE_switch_case_statement_list = 141, 
		RULE_catch_statement_list = 142, RULE_literal_collection = 143, RULE_atomic_literal = 144, 
		RULE_literal_list_literal = 145, RULE_this_expression = 146, RULE_super_expression = 147, 
		RULE_parenthesis_expression = 148, RULE_literal_expression = 149, RULE_collection_literal = 150, 
		RULE_tuple_literal = 151, RULE_dict_literal = 152, RULE_document_literal = 153, 
		RULE_expression_tuple = 154, RULE_doc_entry_list = 155, RULE_doc_entry = 156, 
		RULE_doc_key = 157, RULE_dict_entry_list = 158, RULE_dict_entry = 159, 
		RULE_dict_key = 160, RULE_slice_arguments = 161, RULE_assign_variable_statement = 162, 
		RULE_assignable_instance = 163, RULE_is_expression = 164, RULE_arrow_expression = 165, 
		RULE_arrow_prefix = 166, RULE_arrow_args = 167, RULE_sorted_key = 168, 
		RULE_read_blob_expression = 169, RULE_read_all_expression = 170, RULE_read_one_expression = 171, 
		RULE_order_by_list = 172, RULE_order_by = 173, RULE_operator = 174, RULE_keyword = 175, 
		RULE_new_token = 176, RULE_key_token = 177, RULE_module_token = 178, RULE_value_token = 179, 
		RULE_symbols_token = 180, RULE_assign = 181, RULE_multiply = 182, RULE_divide = 183, 
		RULE_idivide = 184, RULE_modulo = 185, RULE_javascript_statement = 186, 
		RULE_javascript_expression = 187, RULE_javascript_primary_expression = 188, 
		RULE_javascript_this_expression = 189, RULE_javascript_new_expression = 190, 
		RULE_javascript_selector_expression = 191, RULE_javascript_method_expression = 192, 
		RULE_javascript_arguments = 193, RULE_javascript_item_expression = 194, 
		RULE_javascript_parenthesis_expression = 195, RULE_javascript_identifier_expression = 196, 
		RULE_javascript_literal_expression = 197, RULE_javascript_identifier = 198, 
		RULE_python_statement = 199, RULE_python_expression = 200, RULE_python_primary_expression = 201, 
		RULE_python_self_expression = 202, RULE_python_selector_expression = 203, 
		RULE_python_method_expression = 204, RULE_python_argument_list = 205, 
		RULE_python_ordinal_argument_list = 206, RULE_python_named_argument_list = 207, 
		RULE_python_parenthesis_expression = 208, RULE_python_identifier_expression = 209, 
		RULE_python_literal_expression = 210, RULE_python_identifier = 211, RULE_java_statement = 212, 
		RULE_java_expression = 213, RULE_java_primary_expression = 214, RULE_java_this_expression = 215, 
		RULE_java_new_expression = 216, RULE_java_selector_expression = 217, RULE_java_method_expression = 218, 
		RULE_java_arguments = 219, RULE_java_item_expression = 220, RULE_java_parenthesis_expression = 221, 
		RULE_java_identifier_expression = 222, RULE_java_class_identifier_expression = 223, 
		RULE_java_literal_expression = 224, RULE_java_identifier = 225, RULE_csharp_statement = 226, 
		RULE_csharp_expression = 227, RULE_csharp_primary_expression = 228, RULE_csharp_this_expression = 229, 
		RULE_csharp_new_expression = 230, RULE_csharp_selector_expression = 231, 
		RULE_csharp_method_expression = 232, RULE_csharp_arguments = 233, RULE_csharp_item_expression = 234, 
		RULE_csharp_parenthesis_expression = 235, RULE_csharp_identifier_expression = 236, 
		RULE_csharp_literal_expression = 237, RULE_csharp_identifier = 238, RULE_jsx_expression = 239, 
		RULE_jsx_element = 240, RULE_jsx_fragment = 241, RULE_jsx_fragment_start = 242, 
		RULE_jsx_fragment_end = 243, RULE_jsx_self_closing = 244, RULE_jsx_opening = 245, 
		RULE_jsx_closing = 246, RULE_jsx_element_name = 247, RULE_jsx_identifier = 248, 
		RULE_jsx_attribute = 249, RULE_jsx_attribute_value = 250, RULE_jsx_children = 251, 
		RULE_jsx_child = 252, RULE_jsx_text = 253, RULE_jsx_char = 254, RULE_css_expression = 255, 
		RULE_css_field = 256, RULE_css_identifier = 257, RULE_css_value = 258, 
		RULE_css_text = 259;
	public static final String[] ruleNames = {
		"enum_category_declaration", "enum_native_declaration", "native_symbol", 
		"category_symbol", "attribute_declaration", "concrete_widget_declaration", 
		"native_widget_declaration", "concrete_category_declaration", "singleton_category_declaration", 
		"derived_list", "operator_method_declaration", "setter_method_declaration", 
		"native_setter_declaration", "getter_method_declaration", "native_getter_declaration", 
		"native_category_declaration", "native_resource_declaration", "native_category_bindings", 
		"native_category_binding_list", "attribute_list", "abstract_method_declaration", 
		"concrete_method_declaration", "native_method_declaration", "test_method_declaration", 
		"assertion", "full_argument_list", "typed_argument", "statement", "flush_statement", 
		"store_statement", "method_call_statement", "with_resource_statement", 
		"with_singleton_statement", "switch_statement", "switch_case_statement", 
		"for_each_statement", "do_while_statement", "while_statement", "if_statement", 
		"else_if_statement_list", "raise_statement", "try_statement", "catch_statement", 
		"break_statement", "return_statement", "expression", "unresolved_expression", 
		"unresolved_selector", "invocation_expression", "invocation_trailer", 
		"selectable_expression", "instance_expression", "instance_selector", "mutable_instance_expression", 
		"document_expression", "blob_expression", "constructor_expression", "write_statement", 
		"ambiguous_expression", "filtered_list_suffix", "fetch_expression", "fetch_statement", 
		"read_statement", "sorted_expression", "argument_assignment_list", "with_argument_assignment_list", 
		"argument_assignment", "assign_instance_statement", "child_instance", 
		"assign_tuple_statement", "lfs", "lfp", "ws_plus", "indent", "dedent", 
		"type_literal", "null_literal", "repl", "declaration_list", "declarations", 
		"declaration", "annotation_constructor", "annotation_identifier", "annotation_argument", 
		"annotation_argument_name", "annotation_argument_value", "resource_declaration", 
		"enum_declaration", "native_symbol_list", "category_symbol_list", "symbol_list", 
		"attribute_constraint", "list_literal", "set_literal", "expression_list", 
		"range_literal", "typedef", "primary_type", "native_type", "category_type", 
		"mutable_category_type", "code_type", "category_declaration", "widget_declaration", 
		"type_identifier_list", "method_identifier", "identifier_or_keyword", 
		"nospace_hyphen_identifier_or_keyword", "nospace_identifier_or_keyword", 
		"identifier", "member_identifier", "variable_identifier", "attribute_identifier", 
		"type_identifier", "symbol_identifier", "argument_list", "argument", "operator_argument", 
		"named_argument", "code_argument", "category_or_any_type", "any_type", 
		"member_method_declaration_list", "member_method_declaration", "native_member_method_declaration_list", 
		"native_member_method_declaration", "native_category_binding", "python_category_binding", 
		"python_module", "javascript_category_binding", "javascript_module", "variable_identifier_list", 
		"attribute_identifier_list", "method_declaration", "comment_statement", 
		"native_statement_list", "native_statement", "python_native_statement", 
		"javascript_native_statement", "statement_list", "assertion_list", "switch_case_statement_list", 
		"catch_statement_list", "literal_collection", "atomic_literal", "literal_list_literal", 
		"this_expression", "super_expression", "parenthesis_expression", "literal_expression", 
		"collection_literal", "tuple_literal", "dict_literal", "document_literal", 
		"expression_tuple", "doc_entry_list", "doc_entry", "doc_key", "dict_entry_list", 
		"dict_entry", "dict_key", "slice_arguments", "assign_variable_statement", 
		"assignable_instance", "is_expression", "arrow_expression", "arrow_prefix", 
		"arrow_args", "sorted_key", "read_blob_expression", "read_all_expression", 
		"read_one_expression", "order_by_list", "order_by", "operator", "keyword", 
		"new_token", "key_token", "module_token", "value_token", "symbols_token", 
		"assign", "multiply", "divide", "idivide", "modulo", "javascript_statement", 
		"javascript_expression", "javascript_primary_expression", "javascript_this_expression", 
		"javascript_new_expression", "javascript_selector_expression", "javascript_method_expression", 
		"javascript_arguments", "javascript_item_expression", "javascript_parenthesis_expression", 
		"javascript_identifier_expression", "javascript_literal_expression", "javascript_identifier", 
		"python_statement", "python_expression", "python_primary_expression", 
		"python_self_expression", "python_selector_expression", "python_method_expression", 
		"python_argument_list", "python_ordinal_argument_list", "python_named_argument_list", 
		"python_parenthesis_expression", "python_identifier_expression", "python_literal_expression", 
		"python_identifier", "java_statement", "java_expression", "java_primary_expression", 
		"java_this_expression", "java_new_expression", "java_selector_expression", 
		"java_method_expression", "java_arguments", "java_item_expression", "java_parenthesis_expression", 
		"java_identifier_expression", "java_class_identifier_expression", "java_literal_expression", 
		"java_identifier", "csharp_statement", "csharp_expression", "csharp_primary_expression", 
		"csharp_this_expression", "csharp_new_expression", "csharp_selector_expression", 
		"csharp_method_expression", "csharp_arguments", "csharp_item_expression", 
		"csharp_parenthesis_expression", "csharp_identifier_expression", "csharp_literal_expression", 
		"csharp_identifier", "jsx_expression", "jsx_element", "jsx_fragment", 
		"jsx_fragment_start", "jsx_fragment_end", "jsx_self_closing", "jsx_opening", 
		"jsx_closing", "jsx_element_name", "jsx_identifier", "jsx_attribute", 
		"jsx_attribute_value", "jsx_children", "jsx_child", "jsx_text", "jsx_char", 
		"css_expression", "css_field", "css_identifier", "css_value", "css_text"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, "'\t'", "' '", null, "'Java:'", "'C#:'", 
		"'Python2:'", "'Python3:'", "'JavaScript:'", "'Swift:'", "':'", "';'", 
		null, "'..'", null, null, null, null, null, null, null, null, "'!'", "'&'", 
		"'&&'", "'|'", "'||'", null, "'-'", "'*'", "'/'", "'\\'", "'%'", "'#'", 
		"'>'", "'>='", "'<'", "'<='", "'<>'", "'<:>'", "'='", "'!='", "'=='", 
		"'~='", "'~'", "'<-'", "'->'", "'=>'", "'Boolean'", "'Css'", "'Character'", 
		"'Text'", "'Integer'", "'Decimal'", "'Date'", "'Time'", "'DateTime'", 
		"'Period'", "'Version'", "'Method:'", "'Code'", "'Document'", "'Blob'", 
		"'Image'", "'Uuid'", "'Iterator'", "'Cursor'", "'Html'", "'Type'", "'abstract'", 
		"'all'", "'always'", "'and'", "'any'", "'as'", null, "'attr'", "'attribute'", 
		"'attributes'", "'bindings'", "'break'", "'by'", "'case'", "'catch'", 
		"'category'", "'class'", "'contains'", "'def'", "'default'", "'define'", 
		"'delete'", null, "'do'", "'doing'", "'each'", "'else'", "'enum'", "'enumerated'", 
		"'except'", "'execute'", "'expecting'", "'extends'", "'fetch'", "'filtered'", 
		"'finally'", "'flush'", "'for'", "'from'", "'getter'", "'has'", "'if'", 
		"'in'", "'index'", "'invoke:'", "'is'", "'matching'", "'method'", "'methods'", 
		"'modulo'", "'mutable'", "'native'", "'None'", "'not'", null, "'null'", 
		"'on'", "'one'", "'operator'", "'or'", "'order'", "'otherwise'", "'pass'", 
		"'raise'", "'read'", "'receiving'", "'resource'", "'return'", "'returning'", 
		"'rows'", "'self'", "'setter'", "'singleton'", "'sorted'", "'storable'", 
		"'store'", "'super'", "'switch'", "'test'", "'then'", "'this'", "'throw'", 
		"'to'", "'try'", "'verifying'", "'widget'", "'with'", "'when'", "'where'", 
		"'while'", "'write'", null, null, "'MIN_INTEGER'", "'MAX_INTEGER'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INDENT", "DEDENT", "LF_TAB", "LF_MORE", "LF", "TAB", "WS", "COMMENT", 
		"JAVA", "CSHARP", "PYTHON2", "PYTHON3", "JAVASCRIPT", "SWIFT", "COLON", 
		"SEMI", "COMMA", "RANGE", "DOT", "LPAR", "RPAR", "LBRAK", "RBRAK", "LCURL", 
		"RCURL", "QMARK", "XMARK", "AMP", "AMP2", "PIPE", "PIPE2", "PLUS", "MINUS", 
		"STAR", "SLASH", "BSLASH", "PERCENT", "SHARP", "GT", "GTE", "LT", "LTE", 
		"LTGT", "LTCOLONGT", "EQ", "XEQ", "EQ2", "TEQ", "TILDE", "LARROW", "RARROW", 
		"EGT", "BOOLEAN", "CSS", "CHARACTER", "TEXT", "INTEGER", "DECIMAL", "DATE", 
		"TIME", "DATETIME", "PERIOD", "VERSION", "METHOD_COLON", "CODE", "DOCUMENT", 
		"BLOB", "IMAGE", "UUID", "ITERATOR", "CURSOR", "HTML", "TYPE", "ABSTRACT", 
		"ALL", "ALWAYS", "AND", "ANY", "AS", "ASC", "ATTR", "ATTRIBUTE", "ATTRIBUTES", 
		"BINDINGS", "BREAK", "BY", "CASE", "CATCH", "CATEGORY", "CLASS", "CONTAINS", 
		"DEF", "DEFAULT", "DEFINE", "DELETE", "DESC", "DO", "DOING", "EACH", "ELSE", 
		"ENUM", "ENUMERATED", "EXCEPT", "EXECUTE", "EXPECTING", "EXTENDS", "FETCH", 
		"FILTERED", "FINALLY", "FLUSH", "FOR", "FROM", "GETTER", "HAS", "IF", 
		"IN", "INDEX", "INVOKE_COLON", "IS", "MATCHING", "METHOD", "METHODS", 
		"MODULO", "MUTABLE", "NATIVE", "NONE", "NOT", "NOTHING", "NULL", "ON", 
		"ONE", "OPERATOR", "OR", "ORDER", "OTHERWISE", "PASS", "RAISE", "READ", 
		"RECEIVING", "RESOURCE", "RETURN", "RETURNING", "ROWS", "SELF", "SETTER", 
		"SINGLETON", "SORTED", "STORABLE", "STORE", "SUPER", "SWITCH", "TEST", 
		"THEN", "THIS", "THROW", "TO", "TRY", "VERIFYING", "WIDGET", "WITH", "WHEN", 
		"WHERE", "WHILE", "WRITE", "BOOLEAN_LITERAL", "CHAR_LITERAL", "MIN_INTEGER", 
		"MAX_INTEGER", "SYMBOL_IDENTIFIER", "TYPE_IDENTIFIER", "VARIABLE_IDENTIFIER", 
		"NATIVE_IDENTIFIER", "DOLLAR_IDENTIFIER", "ARONDBASE_IDENTIFIER", "TEXT_LITERAL", 
		"UUID_LITERAL", "INTEGER_LITERAL", "HEXA_LITERAL", "DECIMAL_LITERAL", 
		"DATETIME_LITERAL", "TIME_LITERAL", "DATE_LITERAL", "PERIOD_LITERAL", 
		"VERSION_LITERAL", "JSX_TEXT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "EParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Enum_category_declarationContext extends ParserRuleContext {
		public Type_identifierContext name;
		public Type_identifierContext derived;
		public Attribute_listContext attrs;
		public Category_symbol_listContext symbols;
		public TerminalNode DEFINE() { return getToken(EParser.DEFINE, 0); }
		public TerminalNode AS() { return getToken(EParser.AS, 0); }
		public TerminalNode ENUMERATED() { return getToken(EParser.ENUMERATED, 0); }
		public Symbols_tokenContext symbols_token() {
			return getRuleContext(Symbols_tokenContext.class,0);
		}
		public TerminalNode COLON() { return getToken(EParser.COLON, 0); }
		public IndentContext indent() {
			return getRuleContext(IndentContext.class,0);
		}
		public DedentContext dedent() {
			return getRuleContext(DedentContext.class,0);
		}
		public List<Type_identifierContext> type_identifier() {
			return getRuleContexts(Type_identifierContext.class);
		}
		public Type_identifierContext type_identifier(int i) {
			return getRuleContext(Type_identifierContext.class,i);
		}
		public Category_symbol_listContext category_symbol_list() {
			return getRuleContext(Category_symbol_listContext.class,0);
		}
		public TerminalNode CATEGORY() { return getToken(EParser.CATEGORY, 0); }
		public TerminalNode WITH() { return getToken(EParser.WITH, 0); }
		public TerminalNode COMMA() { return getToken(EParser.COMMA, 0); }
		public TerminalNode AND() { return getToken(EParser.AND, 0); }
		public Attribute_listContext attribute_list() {
			return getRuleContext(Attribute_listContext.class,0);
		}
		public Enum_category_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_category_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterEnum_category_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitEnum_category_declaration(this);
		}
	}

	public final Enum_category_declarationContext enum_category_declaration() throws RecognitionException {
		Enum_category_declarationContext _localctx = new Enum_category_declarationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_enum_category_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			match(DEFINE);
			setState(521);
			((Enum_category_declarationContext)_localctx).name = type_identifier();
			setState(522);
			match(AS);
			setState(523);
			match(ENUMERATED);
			setState(526);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CATEGORY:
				{
				setState(524);
				match(CATEGORY);
				}
				break;
			case TYPE_IDENTIFIER:
				{
				setState(525);
				((Enum_category_declarationContext)_localctx).derived = type_identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(533);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				{
				setState(528);
				((Enum_category_declarationContext)_localctx).attrs = attribute_list();
				setState(529);
				match(COMMA);
				setState(530);
				match(AND);
				}
				}
				break;
			case 2:
				{
				setState(532);
				match(WITH);
				}
				break;
			}
			setState(535);
			symbols_token();
			setState(536);
			match(COLON);
			setState(537);
			indent();
			setState(538);
			((Enum_category_declarationContext)_localctx).symbols = category_symbol_list();
			setState(539);
			dedent();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enum_native_declarationContext extends ParserRuleContext {
		public Type_identifierContext name;
		public Native_typeContext typ;
		public Native_symbol_listContext symbols;
		public TerminalNode DEFINE() { return getToken(EParser.DEFINE, 0); }
		public TerminalNode AS() { return getToken(EParser.AS, 0); }
		public TerminalNode ENUMERATED() { return getToken(EParser.ENUMERATED, 0); }
		public TerminalNode WITH() { return getToken(EParser.WITH, 0); }
		public Symbols_tokenContext symbols_token() {
			return getRuleContext(Symbols_tokenContext.class,0);
		}
		public TerminalNode COLON() { return getToken(EParser.COLON, 0); }
		public IndentContext indent() {
			return getRuleContext(IndentContext.class,0);
		}
		public DedentContext dedent() {
			return getRuleContext(DedentContext.class,0);
		}
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Native_typeContext native_type() {
			return getRuleContext(Native_typeContext.class,0);
		}
		public Native_symbol_listContext native_symbol_list() {
			return getRuleContext(Native_symbol_listContext.class,0);
		}
		public Enum_native_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_native_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterEnum_native_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitEnum_native_declaration(this);
		}
	}

	public final Enum_native_declarationContext enum_native_declaration() throws RecognitionException {
		Enum_native_declarationContext _localctx = new Enum_native_declarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_enum_native_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			match(DEFINE);
			setState(542);
			((Enum_native_declarationContext)_localctx).name = type_identifier();
			setState(543);
			match(AS);
			setState(544);
			match(ENUMERATED);
			setState(545);
			((Enum_native_declarationContext)_localctx).typ = native_type();
			setState(546);
			match(WITH);
			setState(547);
			symbols_token();
			setState(548);
			match(COLON);
			setState(549);
			indent();
			setState(550);
			((Enum_native_declarationContext)_localctx).symbols = native_symbol_list();
			setState(551);
			dedent();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Native_symbolContext extends ParserRuleContext {
		public Symbol_identifierContext name;
		public ExpressionContext exp;
		public TerminalNode WITH() { return getToken(EParser.WITH, 0); }
		public TerminalNode AS() { return getToken(EParser.AS, 0); }
		public Value_tokenContext value_token() {
			return getRuleContext(Value_tokenContext.class,0);
		}
		public Symbol_identifierContext symbol_identifier() {
			return getRuleContext(Symbol_identifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Native_symbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_native_symbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterNative_symbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitNative_symbol(this);
		}
	}

	public final Native_symbolContext native_symbol() throws RecognitionException {
		Native_symbolContext _localctx = new Native_symbolContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_native_symbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			((Native_symbolContext)_localctx).name = symbol_identifier();
			setState(554);
			match(WITH);
			setState(555);
			((Native_symbolContext)_localctx).exp = expression(0);
			setState(556);
			match(AS);
			setState(557);
			value_token();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Category_symbolContext extends ParserRuleContext {
		public Symbol_identifierContext name;
		public With_argument_assignment_listContext args;
		public Argument_assignmentContext arg;
		public Symbol_identifierContext symbol_identifier() {
			return getRuleContext(Symbol_identifierContext.class,0);
		}
		public With_argument_assignment_listContext with_argument_assignment_list() {
			return getRuleContext(With_argument_assignment_listContext.class,0);
		}
		public TerminalNode AND() { return getToken(EParser.AND, 0); }
		public Argument_assignmentContext argument_assignment() {
			return getRuleContext(Argument_assignmentContext.class,0);
		}
		public Category_symbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_category_symbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterCategory_symbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitCategory_symbol(this);
		}
	}

	public final Category_symbolContext category_symbol() throws RecognitionException {
		Category_symbolContext _localctx = new Category_symbolContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_category_symbol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			((Category_symbolContext)_localctx).name = symbol_identifier();
			setState(560);
			((Category_symbolContext)_localctx).args = with_argument_assignment_list(0);
			setState(563);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(561);
				match(AND);
				setState(562);
				((Category_symbolContext)_localctx).arg = argument_assignment();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attribute_declarationContext extends ParserRuleContext {
		public Attribute_identifierContext name;
		public TypedefContext typ;
		public Attribute_constraintContext match;
		public Variable_identifier_listContext indices;
		public Variable_identifierContext index;
		public TerminalNode DEFINE() { return getToken(EParser.DEFINE, 0); }
		public TerminalNode AS() { return getToken(EParser.AS, 0); }
		public TerminalNode ATTRIBUTE() { return getToken(EParser.ATTRIBUTE, 0); }
		public Attribute_identifierContext attribute_identifier() {
			return getRuleContext(Attribute_identifierContext.class,0);
		}
		public TypedefContext typedef() {
			return getRuleContext(TypedefContext.class,0);
		}
		public TerminalNode STORABLE() { return getToken(EParser.STORABLE, 0); }
		public TerminalNode WITH() { return getToken(EParser.WITH, 0); }
		public TerminalNode INDEX() { return getToken(EParser.INDEX, 0); }
		public Attribute_constraintContext attribute_constraint() {
			return getRuleContext(Attribute_constraintContext.class,0);
		}
		public Variable_identifier_listContext variable_identifier_list() {
			return getRuleContext(Variable_identifier_listContext.class,0);
		}
		public TerminalNode AND() { return getToken(EParser.AND, 0); }
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public Attribute_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterAttribute_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitAttribute_declaration(this);
		}
	}

	public final Attribute_declarationContext attribute_declaration() throws RecognitionException {
		Attribute_declarationContext _localctx = new Attribute_declarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_attribute_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			match(DEFINE);
			setState(566);
			((Attribute_declarationContext)_localctx).name = attribute_identifier();
			setState(567);
			match(AS);
			setState(569);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STORABLE) {
				{
				setState(568);
				match(STORABLE);
				}
			}

			setState(571);
			((Attribute_declarationContext)_localctx).typ = typedef(0);
			setState(572);
			match(ATTRIBUTE);
			setState(574);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IN || _la==MATCHING) {
				{
				setState(573);
				((Attribute_declarationContext)_localctx).match = attribute_constraint();
				}
			}

			setState(585);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(576);
				match(WITH);
				setState(582);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VARIABLE_IDENTIFIER) {
					{
					setState(577);
					((Attribute_declarationContext)_localctx).indices = variable_identifier_list();
					setState(580);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AND) {
						{
						setState(578);
						match(AND);
						setState(579);
						((Attribute_declarationContext)_localctx).index = variable_identifier();
						}
					}

					}
				}

				setState(584);
				match(INDEX);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Concrete_widget_declarationContext extends ParserRuleContext {
		public Type_identifierContext name;
		public Type_identifierContext derived;
		public Member_method_declaration_listContext methods;
		public TerminalNode DEFINE() { return getToken(EParser.DEFINE, 0); }
		public TerminalNode AS() { return getToken(EParser.AS, 0); }
		public List<Type_identifierContext> type_identifier() {
			return getRuleContexts(Type_identifierContext.class);
		}
		public Type_identifierContext type_identifier(int i) {
			return getRuleContext(Type_identifierContext.class,i);
		}
		public TerminalNode WIDGET() { return getToken(EParser.WIDGET, 0); }
		public TerminalNode WITH() { return getToken(EParser.WITH, 0); }
		public TerminalNode METHODS() { return getToken(EParser.METHODS, 0); }
		public TerminalNode COLON() { return getToken(EParser.COLON, 0); }
		public IndentContext indent() {
			return getRuleContext(IndentContext.class,0);
		}
		public DedentContext dedent() {
			return getRuleContext(DedentContext.class,0);
		}
		public Member_method_declaration_listContext member_method_declaration_list() {
			return getRuleContext(Member_method_declaration_listContext.class,0);
		}
		public Concrete_widget_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concrete_widget_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterConcrete_widget_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitConcrete_widget_declaration(this);
		}
	}

	public final Concrete_widget_declarationContext concrete_widget_declaration() throws RecognitionException {
		Concrete_widget_declarationContext _localctx = new Concrete_widget_declarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_concrete_widget_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			match(DEFINE);
			setState(588);
			((Concrete_widget_declarationContext)_localctx).name = type_identifier();
			setState(589);
			match(AS);
			setState(592);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WIDGET:
				{
				setState(590);
				match(WIDGET);
				}
				break;
			case TYPE_IDENTIFIER:
				{
				setState(591);
				((Concrete_widget_declarationContext)_localctx).derived = type_identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(601);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(594);
				match(WITH);
				setState(595);
				match(METHODS);
				setState(596);
				match(COLON);
				setState(597);
				indent();
				setState(598);
				((Concrete_widget_declarationContext)_localctx).methods = member_method_declaration_list();
				setState(599);
				dedent();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Native_widget_declarationContext extends ParserRuleContext {
		public Type_identifierContext name;
		public Native_category_bindingsContext bindings;
		public Native_member_method_declaration_listContext methods;
		public TerminalNode DEFINE() { return getToken(EParser.DEFINE, 0); }
		public TerminalNode AS() { return getToken(EParser.AS, 0); }
		public TerminalNode NATIVE() { return getToken(EParser.NATIVE, 0); }
		public TerminalNode WIDGET() { return getToken(EParser.WIDGET, 0); }
		public TerminalNode WITH() { return getToken(EParser.WITH, 0); }
		public TerminalNode BINDINGS() { return getToken(EParser.BINDINGS, 0); }
		public List<TerminalNode> COLON() { return getTokens(EParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(EParser.COLON, i);
		}
		public List<IndentContext> indent() {
			return getRuleContexts(IndentContext.class);
		}
		public IndentContext indent(int i) {
			return getRuleContext(IndentContext.class,i);
		}
		public List<DedentContext> dedent() {
			return getRuleContexts(DedentContext.class);
		}
		public DedentContext dedent(int i) {
			return getRuleContext(DedentContext.class,i);
		}
		public LfpContext lfp() {
			return getRuleContext(LfpContext.class,0);
		}
		public TerminalNode AND() { return getToken(EParser.AND, 0); }
		public TerminalNode METHODS() { return getToken(EParser.METHODS, 0); }
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Native_category_bindingsContext native_category_bindings() {
			return getRuleContext(Native_category_bindingsContext.class,0);
		}
		public Native_member_method_declaration_listContext native_member_method_declaration_list() {
			return getRuleContext(Native_member_method_declaration_listContext.class,0);
		}
		public Native_widget_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_native_widget_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterNative_widget_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitNative_widget_declaration(this);
		}
	}

	public final Native_widget_declarationContext native_widget_declaration() throws RecognitionException {
		Native_widget_declarationContext _localctx = new Native_widget_declarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_native_widget_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			match(DEFINE);
			setState(604);
			((Native_widget_declarationContext)_localctx).name = type_identifier();
			setState(605);
			match(AS);
			setState(606);
			match(NATIVE);
			setState(607);
			match(WIDGET);
			setState(608);
			match(WITH);
			setState(609);
			match(BINDINGS);
			setState(610);
			match(COLON);
			setState(611);
			indent();
			setState(612);
			((Native_widget_declarationContext)_localctx).bindings = native_category_bindings();
			setState(613);
			dedent();
			setState(614);
			lfp();
			setState(615);
			match(AND);
			setState(616);
			match(METHODS);
			setState(617);
			match(COLON);
			setState(618);
			indent();
			setState(619);
			((Native_widget_declarationContext)_localctx).methods = native_member_method_declaration_list();
			setState(620);
			dedent();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Concrete_category_declarationContext extends ParserRuleContext {
		public Type_identifierContext name;
		public Derived_listContext derived;
		public Attribute_listContext attrs;
		public Member_method_declaration_listContext methods;
		public TerminalNode DEFINE() { return getToken(EParser.DEFINE, 0); }
		public TerminalNode AS() { return getToken(EParser.AS, 0); }
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public TerminalNode CATEGORY() { return getToken(EParser.CATEGORY, 0); }
		public TerminalNode STORABLE() { return getToken(EParser.STORABLE, 0); }
		public Derived_listContext derived_list() {
			return getRuleContext(Derived_listContext.class,0);
		}
		public TerminalNode WITH() { return getToken(EParser.WITH, 0); }
		public TerminalNode METHODS() { return getToken(EParser.METHODS, 0); }
		public TerminalNode COLON() { return getToken(EParser.COLON, 0); }
		public IndentContext indent() {
			return getRuleContext(IndentContext.class,0);
		}
		public DedentContext dedent() {
			return getRuleContext(DedentContext.class,0);
		}
		public Attribute_listContext attribute_list() {
			return getRuleContext(Attribute_listContext.class,0);
		}
		public Member_method_declaration_listContext member_method_declaration_list() {
			return getRuleContext(Member_method_declaration_listContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(EParser.COMMA, 0); }
		public TerminalNode AND() { return getToken(EParser.AND, 0); }
		public Concrete_category_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concrete_category_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterConcrete_category_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitConcrete_category_declaration(this);
		}
	}

	public final Concrete_category_declarationContext concrete_category_declaration() throws RecognitionException {
		Concrete_category_declarationContext _localctx = new Concrete_category_declarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_concrete_category_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			match(DEFINE);
			setState(623);
			((Concrete_category_declarationContext)_localctx).name = type_identifier();
			setState(624);
			match(AS);
			setState(626);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STORABLE) {
				{
				setState(625);
				match(STORABLE);
				}
			}

			setState(630);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CATEGORY:
				{
				setState(628);
				match(CATEGORY);
				}
				break;
			case TYPE_IDENTIFIER:
				{
				setState(629);
				((Concrete_category_declarationContext)_localctx).derived = derived_list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(650);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				{
				setState(632);
				((Concrete_category_declarationContext)_localctx).attrs = attribute_list();
				setState(641);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(633);
					match(COMMA);
					setState(634);
					match(AND);
					setState(635);
					match(METHODS);
					setState(636);
					match(COLON);
					setState(637);
					indent();
					setState(638);
					((Concrete_category_declarationContext)_localctx).methods = member_method_declaration_list();
					setState(639);
					dedent();
					}
				}

				}
				}
				break;
			case 2:
				{
				{
				setState(643);
				match(WITH);
				setState(644);
				match(METHODS);
				setState(645);
				match(COLON);
				setState(646);
				indent();
				setState(647);
				((Concrete_category_declarationContext)_localctx).methods = member_method_declaration_list();
				setState(648);
				dedent();
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Singleton_category_declarationContext extends ParserRuleContext {
		public Type_identifierContext name;
		public Attribute_listContext attrs;
		public Member_method_declaration_listContext methods;
		public TerminalNode DEFINE() { return getToken(EParser.DEFINE, 0); }
		public TerminalNode AS() { return getToken(EParser.AS, 0); }
		public TerminalNode SINGLETON() { return getToken(EParser.SINGLETON, 0); }
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public TerminalNode WITH() { return getToken(EParser.WITH, 0); }
		public TerminalNode METHODS() { return getToken(EParser.METHODS, 0); }
		public TerminalNode COLON() { return getToken(EParser.COLON, 0); }
		public IndentContext indent() {
			return getRuleContext(IndentContext.class,0);
		}
		public DedentContext dedent() {
			return getRuleContext(DedentContext.class,0);
		}
		public Attribute_listContext attribute_list() {
			return getRuleContext(Attribute_listContext.class,0);
		}
		public Member_method_declaration_listContext member_method_declaration_list() {
			return getRuleContext(Member_method_declaration_listContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(EParser.COMMA, 0); }
		public TerminalNode AND() { return getToken(EParser.AND, 0); }
		public Singleton_category_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleton_category_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterSingleton_category_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitSingleton_category_declaration(this);
		}
	}

	public final Singleton_category_declarationContext singleton_category_declaration() throws RecognitionException {
		Singleton_category_declarationContext _localctx = new Singleton_category_declarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_singleton_category_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
			match(DEFINE);
			setState(653);
			((Singleton_category_declarationContext)_localctx).name = type_identifier();
			setState(654);
			match(AS);
			setState(655);
			match(SINGLETON);
			setState(674);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				{
				setState(656);
				((Singleton_category_declarationContext)_localctx).attrs = attribute_list();
				setState(665);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(657);
					match(COMMA);
					setState(658);
					match(AND);
					setState(659);
					match(METHODS);
					setState(660);
					match(COLON);
					setState(661);
					indent();
					setState(662);
					((Singleton_category_declarationContext)_localctx).methods = member_method_declaration_list();
					setState(663);
					dedent();
					}
				}

				}
				}
				break;
			case 2:
				{
				{
				setState(667);
				match(WITH);
				setState(668);
				match(METHODS);
				setState(669);
				match(COLON);
				setState(670);
				indent();
				setState(671);
				((Singleton_category_declarationContext)_localctx).methods = member_method_declaration_list();
				setState(672);
				dedent();
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Derived_listContext extends ParserRuleContext {
		public Derived_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_derived_list; }
	 
		public Derived_listContext() { }
		public void copyFrom(Derived_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DerivedListItemContext extends Derived_listContext {
		public Type_identifier_listContext items;
		public Type_identifierContext item;
		public TerminalNode AND() { return getToken(EParser.AND, 0); }
		public Type_identifier_listContext type_identifier_list() {
			return getRuleContext(Type_identifier_listContext.class,0);
		}
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public DerivedListItemContext(Derived_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterDerivedListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitDerivedListItem(this);
		}
	}
	public static class DerivedListContext extends Derived_listContext {
		public Type_identifier_listContext items;
		public Type_identifier_listContext type_identifier_list() {
			return getRuleContext(Type_identifier_listContext.class,0);
		}
		public DerivedListContext(Derived_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterDerivedList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitDerivedList(this);
		}
	}

	public final Derived_listContext derived_list() throws RecognitionException {
		Derived_listContext _localctx = new Derived_listContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_derived_list);
		try {
			setState(681);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new DerivedListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(676);
				((DerivedListContext)_localctx).items = type_identifier_list();
				}
				break;
			case 2:
				_localctx = new DerivedListItemContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(677);
				((DerivedListItemContext)_localctx).items = type_identifier_list();
				setState(678);
				match(AND);
				setState(679);
				((DerivedListItemContext)_localctx).item = type_identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operator_method_declarationContext extends ParserRuleContext {
		public OperatorContext op;
		public Operator_argumentContext arg;
		public TypedefContext typ;
		public Statement_listContext stmts;
		public TerminalNode DEFINE() { return getToken(EParser.DEFINE, 0); }
		public TerminalNode AS() { return getToken(EParser.AS, 0); }
		public TerminalNode OPERATOR() { return getToken(EParser.OPERATOR, 0); }
		public TerminalNode RECEIVING() { return getToken(EParser.RECEIVING, 0); }
		public TerminalNode DOING() { return getToken(EParser.DOING, 0); }
		public TerminalNode COLON() { return getToken(EParser.COLON, 0); }
		public IndentContext indent() {
			return getRuleContext(IndentContext.class,0);
		}
		public DedentContext dedent() {
			return getRuleContext(DedentContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Operator_argumentContext operator_argument() {
			return getRuleContext(Operator_argumentContext.class,0);
		}
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public TerminalNode RETURNING() { return getToken(EParser.RETURNING, 0); }
		public TypedefContext typedef() {
			return getRuleContext(TypedefContext.class,0);
		}
		public Operator_method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_method_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterOperator_method_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitOperator_method_declaration(this);
		}
	}

	public final Operator_method_declarationContext operator_method_declaration() throws RecognitionException {
		Operator_method_declarationContext _localctx = new Operator_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_operator_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
			match(DEFINE);
			setState(684);
			((Operator_method_declarationContext)_localctx).op = operator();
			setState(685);
			match(AS);
			setState(686);
			match(OPERATOR);
			setState(687);
			match(RECEIVING);
			setState(688);
			((Operator_method_declarationContext)_localctx).arg = operator_argument();
			setState(691);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURNING) {
				{
				setState(689);
				match(RETURNING);
				setState(690);
				((Operator_method_declarationContext)_localctx).typ = typedef(0);
				}
			}

			setState(693);
			match(DOING);
			setState(694);
			match(COLON);
			setState(695);
			indent();
			setState(696);
			((Operator_method_declarationContext)_localctx).stmts = statement_list();
			setState(697);
			dedent();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Setter_method_declarationContext extends ParserRuleContext {
		public Variable_identifierContext name;
		public Statement_listContext stmts;
		public TerminalNode DEFINE() { return getToken(EParser.DEFINE, 0); }
		public TerminalNode AS() { return getToken(EParser.AS, 0); }
		public TerminalNode SETTER() { return getToken(EParser.SETTER, 0); }
		public TerminalNode DOING() { return getToken(EParser.DOING, 0); }
		public TerminalNode COLON() { return getToken(EParser.COLON, 0); }
		public IndentContext indent() {
			return getRuleContext(IndentContext.class,0);
		}
		public DedentContext dedent() {
			return getRuleContext(DedentContext.class,0);
		}
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public Setter_method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setter_method_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterSetter_method_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitSetter_method_declaration(this);
		}
	}

	public final Setter_method_declarationContext setter_method_declaration() throws RecognitionException {
		Setter_method_declarationContext _localctx = new Setter_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_setter_method_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
			match(DEFINE);
			setState(700);
			((Setter_method_declarationContext)_localctx).name = variable_identifier();
			setState(701);
			match(AS);
			setState(702);
			match(SETTER);
			setState(703);
			match(DOING);
			setState(704);
			match(COLON);
			setState(705);
			indent();
			setState(706);
			((Setter_method_declarationContext)_localctx).stmts = statement_list();
			setState(707);
			dedent();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Native_setter_declarationContext extends ParserRuleContext {
		public Variable_identifierContext name;
		public Native_statement_listContext stmts;
		public TerminalNode DEFINE() { return getToken(EParser.DEFINE, 0); }
		public TerminalNode AS() { return getToken(EParser.AS, 0); }
		public TerminalNode SETTER() { return getToken(EParser.SETTER, 0); }
		public TerminalNode DOING() { return getToken(EParser.DOING, 0); }
		public TerminalNode COLON() { return getToken(EParser.COLON, 0); }
		public IndentContext indent() {
			return getRuleContext(IndentContext.class,0);
		}
		public DedentContext dedent() {
			return getRuleContext(DedentContext.class,0);
		}
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public Native_statement_listContext native_statement_list() {
			return getRuleContext(Native_statement_listContext.class,0);
		}
		public TerminalNode NATIVE() { return getToken(EParser.NATIVE, 0); }
		public Native_setter_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_native_setter_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterNative_setter_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitNative_setter_declaration(this);
		}
	}

	public final Native_setter_declarationContext native_setter_declaration() throws RecognitionException {
		Native_setter_declarationContext _localctx = new Native_setter_declarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_native_setter_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(709);
			match(DEFINE);
			setState(710);
			((Native_setter_declarationContext)_localctx).name = variable_identifier();
			setState(711);
			match(AS);
			setState(713);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NATIVE) {
				{
				setState(712);
				match(NATIVE);
				}
			}

			setState(715);
			match(SETTER);
			setState(716);
			match(DOING);
			setState(717);
			match(COLON);
			setState(718);
			indent();
			setState(719);
			((Native_setter_declarationContext)_localctx).stmts = native_statement_list();
			setState(720);
			dedent();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Getter_method_declarationContext extends ParserRuleContext {
		public Variable_identifierContext name;
		public Statement_listContext stmts;
		public TerminalNode DEFINE() { return getToken(EParser.DEFINE, 0); }
		public TerminalNode AS() { return getToken(EParser.AS, 0); }
		public TerminalNode GETTER() { return getToken(EParser.GETTER, 0); }
		public TerminalNode DOING() { return getToken(EParser.DOING, 0); }
		public TerminalNode COLON() { return getToken(EParser.COLON, 0); }
		public IndentContext indent() {
			return getRuleContext(IndentContext.class,0);
		}
		public DedentContext dedent() {
			return getRuleContext(DedentContext.class,0);
		}
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public Getter_method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter_method_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterGetter_method_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitGetter_method_declaration(this);
		}
	}

	public final Getter_method_declarationContext getter_method_declaration() throws RecognitionException {
		Getter_method_declarationContext _localctx = new Getter_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_getter_method_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(722);
			match(DEFINE);
			setState(723);
			((Getter_method_declarationContext)_localctx).name = variable_identifier();
			setState(724);
			match(AS);
			setState(725);
			match(GETTER);
			setState(726);
			match(DOING);
			setState(727);
			match(COLON);
			setState(728);
			indent();
			setState(729);
			((Getter_method_declarationContext)_localctx).stmts = statement_list();
			setState(730);
			dedent();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Native_getter_declarationContext extends ParserRuleContext {
		public Variable_identifierContext name;
		public Native_statement_listContext stmts;
		public TerminalNode DEFINE() { return getToken(EParser.DEFINE, 0); }
		public TerminalNode AS() { return getToken(EParser.AS, 0); }
		public TerminalNode GETTER() { return getToken(EParser.GETTER, 0); }
		public TerminalNode DOING() { return getToken(EParser.DOING, 0); }
		public TerminalNode COLON() { return getToken(EParser.COLON, 0); }
		public IndentContext indent() {
			return getRuleContext(IndentContext.class,0);
		}
		public DedentContext dedent() {
			return getRuleContext(DedentContext.class,0);
		}
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public Native_statement_listContext native_statement_list() {
			return getRuleContext(Native_statement_listContext.class,0);
		}
		public TerminalNode NATIVE() { return getToken(EParser.NATIVE, 0); }
		public Native_getter_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_native_getter_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterNative_getter_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitNative_getter_declaration(this);
		}
	}

	public final Native_getter_declarationContext native_getter_declaration() throws RecognitionException {
		Native_getter_declarationContext _localctx = new Native_getter_declarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_native_getter_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
			match(DEFINE);
			setState(733);
			((Native_getter_declarationContext)_localctx).name = variable_identifier();
			setState(734);
			match(AS);
			setState(736);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NATIVE) {
				{
				setState(735);
				match(NATIVE);
				}
			}

			setState(738);
			match(GETTER);
			setState(739);
			match(DOING);
			setState(740);
			match(COLON);
			setState(741);
			indent();
			setState(742);
			((Native_getter_declarationContext)_localctx).stmts = native_statement_list();
			setState(743);
			dedent();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Native_category_declarationContext extends ParserRuleContext {
		public Type_identifierContext name;
		public Attribute_listContext attrs;
		public Native_category_bindingsContext bindings;
		public Native_member_method_declaration_listContext methods;
		public TerminalNode DEFINE() { return getToken(EParser.DEFINE, 0); }
		public TerminalNode AS() { return getToken(EParser.AS, 0); }
		public TerminalNode NATIVE() { return getToken(EParser.NATIVE, 0); }
		public TerminalNode CATEGORY() { return getToken(EParser.CATEGORY, 0); }
		public List<TerminalNode> COLON() { return getTokens(EParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(EParser.COLON, i);
		}
		public List<IndentContext> indent() {
			return getRuleContexts(IndentContext.class);
		}
		public IndentContext indent(int i) {
			return getRuleContext(IndentContext.class,i);
		}
		public List<DedentContext> dedent() {
			return getRuleContexts(DedentContext.class);
		}
		public DedentContext dedent(int i) {
			return getRuleContext(DedentContext.class,i);
		}
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Native_category_bindingsContext native_category_bindings() {
			return getRuleContext(Native_category_bindingsContext.class,0);
		}
		public TerminalNode WITH() { return getToken(EParser.WITH, 0); }
		public TerminalNode BINDINGS() { return getToken(EParser.BINDINGS, 0); }
		public TerminalNode STORABLE() { return getToken(EParser.STORABLE, 0); }
		public LfpContext lfp() {
			return getRuleContext(LfpContext.class,0);
		}
		public List<TerminalNode> AND() { return getTokens(EParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(EParser.AND, i);
		}
		public TerminalNode METHODS() { return getToken(EParser.METHODS, 0); }
		public TerminalNode COMMA() { return getToken(EParser.COMMA, 0); }
		public Native_member_method_declaration_listContext native_member_method_declaration_list() {
			return getRuleContext(Native_member_method_declaration_listContext.class,0);
		}
		public Attribute_listContext attribute_list() {
			return getRuleContext(Attribute_listContext.class,0);
		}
		public Native_category_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_native_category_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterNative_category_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitNative_category_declaration(this);
		}
	}

	public final Native_category_declarationContext native_category_declaration() throws RecognitionException {
		Native_category_declarationContext _localctx = new Native_category_declarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_native_category_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(745);
			match(DEFINE);
			setState(746);
			((Native_category_declarationContext)_localctx).name = type_identifier();
			setState(747);
			match(AS);
			setState(749);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STORABLE) {
				{
				setState(748);
				match(STORABLE);
				}
			}

			setState(751);
			match(NATIVE);
			setState(752);
			match(CATEGORY);
			setState(760);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				{
				setState(753);
				((Native_category_declarationContext)_localctx).attrs = attribute_list();
				setState(754);
				match(COMMA);
				setState(755);
				match(AND);
				setState(756);
				match(BINDINGS);
				}
				}
				break;
			case 2:
				{
				setState(758);
				match(WITH);
				setState(759);
				match(BINDINGS);
				}
				break;
			}
			setState(762);
			match(COLON);
			setState(763);
			indent();
			setState(764);
			((Native_category_declarationContext)_localctx).bindings = native_category_bindings();
			setState(765);
			dedent();
			setState(774);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(766);
				lfp();
				setState(767);
				match(AND);
				setState(768);
				match(METHODS);
				setState(769);
				match(COLON);
				setState(770);
				indent();
				setState(771);
				((Native_category_declarationContext)_localctx).methods = native_member_method_declaration_list();
				setState(772);
				dedent();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Native_resource_declarationContext extends ParserRuleContext {
		public Type_identifierContext name;
		public Attribute_listContext attrs;
		public Native_category_bindingsContext bindings;
		public Native_member_method_declaration_listContext methods;
		public TerminalNode DEFINE() { return getToken(EParser.DEFINE, 0); }
		public TerminalNode AS() { return getToken(EParser.AS, 0); }
		public TerminalNode NATIVE() { return getToken(EParser.NATIVE, 0); }
		public TerminalNode RESOURCE() { return getToken(EParser.RESOURCE, 0); }
		public List<TerminalNode> COLON() { return getTokens(EParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(EParser.COLON, i);
		}
		public List<IndentContext> indent() {
			return getRuleContexts(IndentContext.class);
		}
		public IndentContext indent(int i) {
			return getRuleContext(IndentContext.class,i);
		}
		public List<DedentContext> dedent() {
			return getRuleContexts(DedentContext.class);
		}
		public DedentContext dedent(int i) {
			return getRuleContext(DedentContext.class,i);
		}
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Native_category_bindingsContext native_category_bindings() {
			return getRuleContext(Native_category_bindingsContext.class,0);
		}
		public TerminalNode WITH() { return getToken(EParser.WITH, 0); }
		public TerminalNode BINDINGS() { return getToken(EParser.BINDINGS, 0); }
		public TerminalNode STORABLE() { return getToken(EParser.STORABLE, 0); }
		public LfpContext lfp() {
			return getRuleContext(LfpContext.class,0);
		}
		public List<TerminalNode> AND() { return getTokens(EParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(EParser.AND, i);
		}
		public TerminalNode METHODS() { return getToken(EParser.METHODS, 0); }
		public TerminalNode COMMA() { return getToken(EParser.COMMA, 0); }
		public Native_member_method_declaration_listContext native_member_method_declaration_list() {
			return getRuleContext(Native_member_method_declaration_listContext.class,0);
		}
		public Attribute_listContext attribute_list() {
			return getRuleContext(Attribute_listContext.class,0);
		}
		public Native_resource_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_native_resource_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterNative_resource_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitNative_resource_declaration(this);
		}
	}

	public final Native_resource_declarationContext native_resource_declaration() throws RecognitionException {
		Native_resource_declarationContext _localctx = new Native_resource_declarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_native_resource_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(776);
			match(DEFINE);
			setState(777);
			((Native_resource_declarationContext)_localctx).name = type_identifier();
			setState(778);
			match(AS);
			setState(780);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STORABLE) {
				{
				setState(779);
				match(STORABLE);
				}
			}

			setState(782);
			match(NATIVE);
			setState(783);
			match(RESOURCE);
			setState(791);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				{
				setState(784);
				((Native_resource_declarationContext)_localctx).attrs = attribute_list();
				setState(785);
				match(COMMA);
				setState(786);
				match(AND);
				setState(787);
				match(BINDINGS);
				}
				}
				break;
			case 2:
				{
				setState(789);
				match(WITH);
				setState(790);
				match(BINDINGS);
				}
				break;
			}
			setState(793);
			match(COLON);
			setState(794);
			indent();
			setState(795);
			((Native_resource_declarationContext)_localctx).bindings = native_category_bindings();
			setState(796);
			dedent();
			setState(805);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(797);
				lfp();
				setState(798);
				match(AND);
				setState(799);
				match(METHODS);
				setState(800);
				match(COLON);
				setState(801);
				indent();
				setState(802);
				((Native_resource_declarationContext)_localctx).methods = native_member_method_declaration_list();
				setState(803);
				dedent();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Native_category_bindingsContext extends ParserRuleContext {
		public Native_category_binding_listContext items;
		public TerminalNode DEFINE() { return getToken(EParser.DEFINE, 0); }
		public TerminalNode CATEGORY() { return getToken(EParser.CATEGORY, 0); }
		public TerminalNode BINDINGS() { return getToken(EParser.BINDINGS, 0); }
		public TerminalNode AS() { return getToken(EParser.AS, 0); }
		public TerminalNode COLON() { return getToken(EParser.COLON, 0); }
		public IndentContext indent() {
			return getRuleContext(IndentContext.class,0);
		}
		public DedentContext dedent() {
			return getRuleContext(DedentContext.class,0);
		}
		public Native_category_binding_listContext native_category_binding_list() {
			return getRuleContext(Native_category_binding_listContext.class,0);
		}
		public Native_category_bindingsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_native_category_bindings; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterNative_category_bindings(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitNative_category_bindings(this);
		}
	}

	public final Native_category_bindingsContext native_category_bindings() throws RecognitionException {
		Native_category_bindingsContext _localctx = new Native_category_bindingsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_native_category_bindings);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(807);
			match(DEFINE);
			setState(808);
			match(CATEGORY);
			setState(809);
			match(BINDINGS);
			setState(810);
			match(AS);
			setState(811);
			match(COLON);
			setState(812);
			indent();
			setState(813);
			((Native_category_bindingsContext)_localctx).items = native_category_binding_list(0);
			setState(814);
			dedent();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Native_category_binding_listContext extends ParserRuleContext {
		public Native_category_binding_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_native_category_binding_list; }
	 
		public Native_category_binding_listContext() { }
		public void copyFrom(Native_category_binding_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NativeCategoryBindingListItemContext extends Native_category_binding_listContext {
		public Native_category_binding_listContext items;
		public Native_category_bindingContext item;
		public LfpContext lfp() {
			return getRuleContext(LfpContext.class,0);
		}
		public Native_category_binding_listContext native_category_binding_list() {
			return getRuleContext(Native_category_binding_listContext.class,0);
		}
		public Native_category_bindingContext native_category_binding() {
			return getRuleContext(Native_category_bindingContext.class,0);
		}
		public NativeCategoryBindingListItemContext(Native_category_binding_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterNativeCategoryBindingListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitNativeCategoryBindingListItem(this);
		}
	}
	public static class NativeCategoryBindingListContext extends Native_category_binding_listContext {
		public Native_category_bindingContext item;
		public Native_category_bindingContext native_category_binding() {
			return getRuleContext(Native_category_bindingContext.class,0);
		}
		public NativeCategoryBindingListContext(Native_category_binding_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterNativeCategoryBindingList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitNativeCategoryBindingList(this);
		}
	}

	public final Native_category_binding_listContext native_category_binding_list() throws RecognitionException {
		return native_category_binding_list(0);
	}

	private Native_category_binding_listContext native_category_binding_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Native_category_binding_listContext _localctx = new Native_category_binding_listContext(_ctx, _parentState);
		Native_category_binding_listContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_native_category_binding_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new NativeCategoryBindingListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(817);
			((NativeCategoryBindingListContext)_localctx).item = native_category_binding();
			}
			_ctx.stop = _input.LT(-1);
			setState(825);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NativeCategoryBindingListItemContext(new Native_category_binding_listContext(_parentctx, _parentState));
					((NativeCategoryBindingListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_native_category_binding_list);
					setState(819);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(820);
					lfp();
					setState(821);
					((NativeCategoryBindingListItemContext)_localctx).item = native_category_binding();
					}
					} 
				}
				setState(827);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Attribute_listContext extends ParserRuleContext {
		public Attribute_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_list; }
	 
		public Attribute_listContext() { }
		public void copyFrom(Attribute_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AttributeListContext extends Attribute_listContext {
		public Attribute_identifierContext item;
		public TerminalNode WITH() { return getToken(EParser.WITH, 0); }
		public TerminalNode ATTRIBUTE() { return getToken(EParser.ATTRIBUTE, 0); }
		public Attribute_identifierContext attribute_identifier() {
			return getRuleContext(Attribute_identifierContext.class,0);
		}
		public AttributeListContext(Attribute_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterAttributeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitAttributeList(this);
		}
	}
	public static class AttributeListItemContext extends Attribute_listContext {
		public Attribute_identifier_listContext items;
		public Attribute_identifierContext item;
		public TerminalNode WITH() { return getToken(EParser.WITH, 0); }
		public TerminalNode ATTRIBUTES() { return getToken(EParser.ATTRIBUTES, 0); }
		public Attribute_identifier_listContext attribute_identifier_list() {
			return getRuleContext(Attribute_identifier_listContext.class,0);
		}
		public TerminalNode AND() { return getToken(EParser.AND, 0); }
		public Attribute_identifierContext attribute_identifier() {
			return getRuleContext(Attribute_identifierContext.class,0);
		}
		public AttributeListItemContext(Attribute_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterAttributeListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitAttributeListItem(this);
		}
	}

	public final Attribute_listContext attribute_list() throws RecognitionException {
		Attribute_listContext _localctx = new Attribute_listContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_attribute_list);
		try {
			setState(838);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				_localctx = new AttributeListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(828);
				match(WITH);
				setState(829);
				match(ATTRIBUTE);
				setState(830);
				((AttributeListContext)_localctx).item = attribute_identifier();
				}
				break;
			case 2:
				_localctx = new AttributeListItemContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(831);
				match(WITH);
				setState(832);
				match(ATTRIBUTES);
				setState(833);
				((AttributeListItemContext)_localctx).items = attribute_identifier_list();
				setState(836);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(834);
					match(AND);
					setState(835);
					((AttributeListItemContext)_localctx).item = attribute_identifier();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Abstract_method_declarationContext extends ParserRuleContext {
		public Method_identifierContext name;
		public Full_argument_listContext args;
		public TypedefContext typ;
		public TerminalNode DEFINE() { return getToken(EParser.DEFINE, 0); }
		public TerminalNode AS() { return getToken(EParser.AS, 0); }
		public TerminalNode ABSTRACT() { return getToken(EParser.ABSTRACT, 0); }
		public TerminalNode METHOD() { return getToken(EParser.METHOD, 0); }
		public Method_identifierContext method_identifier() {
			return getRuleContext(Method_identifierContext.class,0);
		}
		public TerminalNode RECEIVING() { return getToken(EParser.RECEIVING, 0); }
		public TerminalNode RETURNING() { return getToken(EParser.RETURNING, 0); }
		public Full_argument_listContext full_argument_list() {
			return getRuleContext(Full_argument_listContext.class,0);
		}
		public TypedefContext typedef() {
			return getRuleContext(TypedefContext.class,0);
		}
		public TerminalNode MUTABLE() { return getToken(EParser.MUTABLE, 0); }
		public Abstract_method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstract_method_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterAbstract_method_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitAbstract_method_declaration(this);
		}
	}

	public final Abstract_method_declarationContext abstract_method_declaration() throws RecognitionException {
		Abstract_method_declarationContext _localctx = new Abstract_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_abstract_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(840);
			match(DEFINE);
			setState(841);
			((Abstract_method_declarationContext)_localctx).name = method_identifier();
			setState(842);
			match(AS);
			setState(843);
			match(ABSTRACT);
			setState(844);
			match(METHOD);
			setState(847);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RECEIVING) {
				{
				setState(845);
				match(RECEIVING);
				setState(846);
				((Abstract_method_declarationContext)_localctx).args = full_argument_list();
				}
			}

			setState(854);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURNING) {
				{
				setState(849);
				match(RETURNING);
				setState(851);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MUTABLE) {
					{
					setState(850);
					match(MUTABLE);
					}
				}

				setState(853);
				((Abstract_method_declarationContext)_localctx).typ = typedef(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Concrete_method_declarationContext extends ParserRuleContext {
		public Method_identifierContext name;
		public Full_argument_listContext args;
		public TypedefContext typ;
		public Statement_listContext stmts;
		public TerminalNode DEFINE() { return getToken(EParser.DEFINE, 0); }
		public TerminalNode AS() { return getToken(EParser.AS, 0); }
		public TerminalNode METHOD() { return getToken(EParser.METHOD, 0); }
		public TerminalNode DOING() { return getToken(EParser.DOING, 0); }
		public TerminalNode COLON() { return getToken(EParser.COLON, 0); }
		public IndentContext indent() {
			return getRuleContext(IndentContext.class,0);
		}
		public DedentContext dedent() {
			return getRuleContext(DedentContext.class,0);
		}
		public Method_identifierContext method_identifier() {
			return getRuleContext(Method_identifierContext.class,0);
		}
		public TerminalNode PASS() { return getToken(EParser.PASS, 0); }
		public TerminalNode RECEIVING() { return getToken(EParser.RECEIVING, 0); }
		public TerminalNode RETURNING() { return getToken(EParser.RETURNING, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public Full_argument_listContext full_argument_list() {
			return getRuleContext(Full_argument_listContext.class,0);
		}
		public TypedefContext typedef() {
			return getRuleContext(TypedefContext.class,0);
		}
		public TerminalNode MUTABLE() { return getToken(EParser.MUTABLE, 0); }
		public Concrete_method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concrete_method_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterConcrete_method_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitConcrete_method_declaration(this);
		}
	}

	public final Concrete_method_declarationContext concrete_method_declaration() throws RecognitionException {
		Concrete_method_declarationContext _localctx = new Concrete_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_concrete_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(856);
			match(DEFINE);
			setState(857);
			((Concrete_method_declarationContext)_localctx).name = method_identifier();
			setState(858);
			match(AS);
			setState(859);
			match(METHOD);
			setState(862);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RECEIVING) {
				{
				setState(860);
				match(RECEIVING);
				setState(861);
				((Concrete_method_declarationContext)_localctx).args = full_argument_list();
				}
			}

			setState(869);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURNING) {
				{
				setState(864);
				match(RETURNING);
				setState(866);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MUTABLE) {
					{
					setState(865);
					match(MUTABLE);
					}
				}

				setState(868);
				((Concrete_method_declarationContext)_localctx).typ = typedef(0);
				}
			}

			setState(871);
			match(DOING);
			setState(872);
			match(COLON);
			setState(873);
			indent();
			setState(876);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMENT:
			case LPAR:
			case LBRAK:
			case LCURL:
			case MINUS:
			case LT:
			case LTCOLONGT:
			case TYPE:
			case BREAK:
			case DEFINE:
			case DELETE:
			case DO:
			case FETCH:
			case FLUSH:
			case FOR:
			case IF:
			case INVOKE_COLON:
			case MUTABLE:
			case NOTHING:
			case RAISE:
			case READ:
			case RETURN:
			case SELF:
			case STORE:
			case SUPER:
			case SWITCH:
			case THIS:
			case WITH:
			case WHILE:
			case WRITE:
			case BOOLEAN_LITERAL:
			case CHAR_LITERAL:
			case MIN_INTEGER:
			case MAX_INTEGER:
			case SYMBOL_IDENTIFIER:
			case TYPE_IDENTIFIER:
			case VARIABLE_IDENTIFIER:
			case TEXT_LITERAL:
			case UUID_LITERAL:
			case INTEGER_LITERAL:
			case HEXA_LITERAL:
			case DECIMAL_LITERAL:
			case DATETIME_LITERAL:
			case TIME_LITERAL:
			case DATE_LITERAL:
			case PERIOD_LITERAL:
			case VERSION_LITERAL:
				{
				setState(874);
				((Concrete_method_declarationContext)_localctx).stmts = statement_list();
				}
				break;
			case PASS:
				{
				setState(875);
				match(PASS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(878);
			dedent();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Native_method_declarationContext extends ParserRuleContext {
		public Method_identifierContext name;
		public Full_argument_listContext args;
		public Category_or_any_typeContext typ;
		public Native_statement_listContext stmts;
		public TerminalNode DEFINE() { return getToken(EParser.DEFINE, 0); }
		public TerminalNode AS() { return getToken(EParser.AS, 0); }
		public TerminalNode METHOD() { return getToken(EParser.METHOD, 0); }
		public TerminalNode DOING() { return getToken(EParser.DOING, 0); }
		public TerminalNode COLON() { return getToken(EParser.COLON, 0); }
		public IndentContext indent() {
			return getRuleContext(IndentContext.class,0);
		}
		public DedentContext dedent() {
			return getRuleContext(DedentContext.class,0);
		}
		public Method_identifierContext method_identifier() {
			return getRuleContext(Method_identifierContext.class,0);
		}
		public Native_statement_listContext native_statement_list() {
			return getRuleContext(Native_statement_listContext.class,0);
		}
		public TerminalNode NATIVE() { return getToken(EParser.NATIVE, 0); }
		public TerminalNode RECEIVING() { return getToken(EParser.RECEIVING, 0); }
		public TerminalNode RETURNING() { return getToken(EParser.RETURNING, 0); }
		public Full_argument_listContext full_argument_list() {
			return getRuleContext(Full_argument_listContext.class,0);
		}
		public Category_or_any_typeContext category_or_any_type() {
			return getRuleContext(Category_or_any_typeContext.class,0);
		}
		public Native_method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_native_method_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterNative_method_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitNative_method_declaration(this);
		}
	}

	public final Native_method_declarationContext native_method_declaration() throws RecognitionException {
		Native_method_declarationContext _localctx = new Native_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_native_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(880);
			match(DEFINE);
			setState(881);
			((Native_method_declarationContext)_localctx).name = method_identifier();
			setState(882);
			match(AS);
			setState(884);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NATIVE) {
				{
				setState(883);
				match(NATIVE);
				}
			}

			setState(886);
			match(METHOD);
			setState(889);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RECEIVING) {
				{
				setState(887);
				match(RECEIVING);
				setState(888);
				((Native_method_declarationContext)_localctx).args = full_argument_list();
				}
			}

			setState(893);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURNING) {
				{
				setState(891);
				match(RETURNING);
				setState(892);
				((Native_method_declarationContext)_localctx).typ = category_or_any_type();
				}
			}

			setState(895);
			match(DOING);
			setState(896);
			match(COLON);
			setState(897);
			indent();
			setState(898);
			((Native_method_declarationContext)_localctx).stmts = native_statement_list();
			setState(899);
			dedent();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Test_method_declarationContext extends ParserRuleContext {
		public Token name;
		public Statement_listContext stmts;
		public Assertion_listContext exps;
		public Symbol_identifierContext error;
		public TerminalNode DEFINE() { return getToken(EParser.DEFINE, 0); }
		public TerminalNode AS() { return getToken(EParser.AS, 0); }
		public TerminalNode TEST() { return getToken(EParser.TEST, 0); }
		public TerminalNode METHOD() { return getToken(EParser.METHOD, 0); }
		public TerminalNode DOING() { return getToken(EParser.DOING, 0); }
		public List<TerminalNode> COLON() { return getTokens(EParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(EParser.COLON, i);
		}
		public List<IndentContext> indent() {
			return getRuleContexts(IndentContext.class);
		}
		public IndentContext indent(int i) {
			return getRuleContext(IndentContext.class,i);
		}
		public List<DedentContext> dedent() {
			return getRuleContexts(DedentContext.class);
		}
		public DedentContext dedent(int i) {
			return getRuleContext(DedentContext.class,i);
		}
		public LfpContext lfp() {
			return getRuleContext(LfpContext.class,0);
		}
		public TerminalNode AND() { return getToken(EParser.AND, 0); }
		public TerminalNode VERIFYING() { return getToken(EParser.VERIFYING, 0); }
		public TerminalNode TEXT_LITERAL() { return getToken(EParser.TEXT_LITERAL, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public Symbol_identifierContext symbol_identifier() {
			return getRuleContext(Symbol_identifierContext.class,0);
		}
		public Assertion_listContext assertion_list() {
			return getRuleContext(Assertion_listContext.class,0);
		}
		public Test_method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_test_method_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterTest_method_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitTest_method_declaration(this);
		}
	}

	public final Test_method_declarationContext test_method_declaration() throws RecognitionException {
		Test_method_declarationContext _localctx = new Test_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_test_method_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(901);
			match(DEFINE);
			setState(902);
			((Test_method_declarationContext)_localctx).name = match(TEXT_LITERAL);
			setState(903);
			match(AS);
			setState(904);
			match(TEST);
			setState(905);
			match(METHOD);
			setState(906);
			match(DOING);
			setState(907);
			match(COLON);
			setState(908);
			indent();
			setState(909);
			((Test_method_declarationContext)_localctx).stmts = statement_list();
			setState(910);
			dedent();
			setState(911);
			lfp();
			setState(912);
			match(AND);
			setState(913);
			match(VERIFYING);
			setState(920);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLON:
				{
				{
				setState(914);
				match(COLON);
				setState(915);
				indent();
				setState(916);
				((Test_method_declarationContext)_localctx).exps = assertion_list();
				setState(917);
				dedent();
				}
				}
				break;
			case SYMBOL_IDENTIFIER:
				{
				setState(919);
				((Test_method_declarationContext)_localctx).error = symbol_identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssertionContext extends ParserRuleContext {
		public ExpressionContext exp;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssertionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterAssertion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitAssertion(this);
		}
	}

	public final AssertionContext assertion() throws RecognitionException {
		AssertionContext _localctx = new AssertionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_assertion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(922);
			((AssertionContext)_localctx).exp = expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Full_argument_listContext extends ParserRuleContext {
		public Argument_listContext items;
		public ArgumentContext item;
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public TerminalNode AND() { return getToken(EParser.AND, 0); }
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public Full_argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_full_argument_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterFull_argument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitFull_argument_list(this);
		}
	}

	public final Full_argument_listContext full_argument_list() throws RecognitionException {
		Full_argument_listContext _localctx = new Full_argument_listContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_full_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(924);
			((Full_argument_listContext)_localctx).items = argument_list();
			setState(927);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(925);
				match(AND);
				setState(926);
				((Full_argument_listContext)_localctx).item = argument();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Typed_argumentContext extends ParserRuleContext {
		public Category_or_any_typeContext typ;
		public Variable_identifierContext name;
		public Attribute_listContext attrs;
		public Literal_expressionContext value;
		public Category_or_any_typeContext category_or_any_type() {
			return getRuleContext(Category_or_any_typeContext.class,0);
		}
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(EParser.EQ, 0); }
		public Attribute_listContext attribute_list() {
			return getRuleContext(Attribute_listContext.class,0);
		}
		public Literal_expressionContext literal_expression() {
			return getRuleContext(Literal_expressionContext.class,0);
		}
		public Typed_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typed_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterTyped_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitTyped_argument(this);
		}
	}

	public final Typed_argumentContext typed_argument() throws RecognitionException {
		Typed_argumentContext _localctx = new Typed_argumentContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_typed_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(929);
			((Typed_argumentContext)_localctx).typ = category_or_any_type();
			setState(930);
			((Typed_argumentContext)_localctx).name = variable_identifier();
			setState(932);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(931);
				((Typed_argumentContext)_localctx).attrs = attribute_list();
				}
			}

			setState(936);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(934);
				match(EQ);
				setState(935);
				((Typed_argumentContext)_localctx).value = literal_expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CommentStatementContext extends StatementContext {
		public Comment_statementContext decl;
		public Comment_statementContext comment_statement() {
			return getRuleContext(Comment_statementContext.class,0);
		}
		public CommentStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterCommentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitCommentStatement(this);
		}
	}
	public static class StoreStatementContext extends StatementContext {
		public Store_statementContext stmt;
		public Store_statementContext store_statement() {
			return getRuleContext(Store_statementContext.class,0);
		}
		public StoreStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterStoreStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitStoreStatement(this);
		}
	}
	public static class WithSingletonStatementContext extends StatementContext {
		public With_singleton_statementContext stmt;
		public With_singleton_statementContext with_singleton_statement() {
			return getRuleContext(With_singleton_statementContext.class,0);
		}
		public WithSingletonStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterWithSingletonStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitWithSingletonStatement(this);
		}
	}
	public static class WriteStatementContext extends StatementContext {
		public Write_statementContext stmt;
		public Write_statementContext write_statement() {
			return getRuleContext(Write_statementContext.class,0);
		}
		public WriteStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterWriteStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitWriteStatement(this);
		}
	}
	public static class WhileStatementContext extends StatementContext {
		public While_statementContext stmt;
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public WhileStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitWhileStatement(this);
		}
	}
	public static class WithResourceStatementContext extends StatementContext {
		public With_resource_statementContext stmt;
		public With_resource_statementContext with_resource_statement() {
			return getRuleContext(With_resource_statementContext.class,0);
		}
		public WithResourceStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterWithResourceStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitWithResourceStatement(this);
		}
	}
	public static class RaiseStatementContext extends StatementContext {
		public Raise_statementContext stmt;
		public Raise_statementContext raise_statement() {
			return getRuleContext(Raise_statementContext.class,0);
		}
		public RaiseStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterRaiseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitRaiseStatement(this);
		}
	}
	public static class FetchStatementContext extends StatementContext {
		public Fetch_statementContext stmt;
		public Fetch_statementContext fetch_statement() {
			return getRuleContext(Fetch_statementContext.class,0);
		}
		public FetchStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterFetchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitFetchStatement(this);
		}
	}
	public static class BreakStatementContext extends StatementContext {
		public Break_statementContext stmt;
		public Break_statementContext break_statement() {
			return getRuleContext(Break_statementContext.class,0);
		}
		public BreakStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitBreakStatement(this);
		}
	}
	public static class AssignInstanceStatementContext extends StatementContext {
		public Assign_instance_statementContext stmt;
		public Assign_instance_statementContext assign_instance_statement() {
			return getRuleContext(Assign_instance_statementContext.class,0);
		}
		public AssignInstanceStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterAssignInstanceStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitAssignInstanceStatement(this);
		}
	}
	public static class IfStatementContext extends StatementContext {
		public If_statementContext stmt;
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public IfStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitIfStatement(this);
		}
	}
	public static class SwitchStatementContext extends StatementContext {
		public Switch_statementContext stmt;
		public Switch_statementContext switch_statement() {
			return getRuleContext(Switch_statementContext.class,0);
		}
		public SwitchStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitSwitchStatement(this);
		}
	}
	public static class TryStatementContext extends StatementContext {
		public Try_statementContext stmt;
		public Try_statementContext try_statement() {
			return getRuleContext(Try_statementContext.class,0);
		}
		public TryStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterTryStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitTryStatement(this);
		}
	}
	public static class ReadStatementContext extends StatementContext {
		public Read_statementContext stmt;
		public Read_statementContext read_statement() {
			return getRuleContext(Read_statementContext.class,0);
		}
		public ReadStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterReadStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitReadStatement(this);
		}
	}
	public static class MethodCallStatementContext extends StatementContext {
		public Method_call_statementContext stmt;
		public Method_call_statementContext method_call_statement() {
			return getRuleContext(Method_call_statementContext.class,0);
		}
		public MethodCallStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterMethodCallStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitMethodCallStatement(this);
		}
	}
	public static class ReturnStatementContext extends StatementContext {
		public Return_statementContext stmt;
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public ReturnStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitReturnStatement(this);
		}
	}
	public static class AssignTupleStatementContext extends StatementContext {
		public Assign_tuple_statementContext stmt;
		public Assign_tuple_statementContext assign_tuple_statement() {
			return getRuleContext(Assign_tuple_statementContext.class,0);
		}
		public AssignTupleStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterAssignTupleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitAssignTupleStatement(this);
		}
	}
	public static class ClosureStatementContext extends StatementContext {
		public Concrete_method_declarationContext decl;
		public Concrete_method_declarationContext concrete_method_declaration() {
			return getRuleContext(Concrete_method_declarationContext.class,0);
		}
		public ClosureStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterClosureStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitClosureStatement(this);
		}
	}
	public static class FlushStatementContext extends StatementContext {
		public Flush_statementContext stmt;
		public Flush_statementContext flush_statement() {
			return getRuleContext(Flush_statementContext.class,0);
		}
		public FlushStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterFlushStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitFlushStatement(this);
		}
	}
	public static class DoWhileStatementContext extends StatementContext {
		public Do_while_statementContext stmt;
		public Do_while_statementContext do_while_statement() {
			return getRuleContext(Do_while_statementContext.class,0);
		}
		public DoWhileStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterDoWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitDoWhileStatement(this);
		}
	}
	public static class ForEachStatementContext extends StatementContext {
		public For_each_statementContext stmt;
		public For_each_statementContext for_each_statement() {
			return getRuleContext(For_each_statementContext.class,0);
		}
		public ForEachStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterForEachStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitForEachStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_statement);
		try {
			setState(959);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				_localctx = new AssignInstanceStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(938);
				((AssignInstanceStatementContext)_localctx).stmt = assign_instance_statement();
				}
				break;
			case 2:
				_localctx = new MethodCallStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(939);
				((MethodCallStatementContext)_localctx).stmt = method_call_statement();
				}
				break;
			case 3:
				_localctx = new AssignTupleStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(940);
				((AssignTupleStatementContext)_localctx).stmt = assign_tuple_statement();
				}
				break;
			case 4:
				_localctx = new StoreStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(941);
				((StoreStatementContext)_localctx).stmt = store_statement();
				}
				break;
			case 5:
				_localctx = new FetchStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(942);
				((FetchStatementContext)_localctx).stmt = fetch_statement();
				}
				break;
			case 6:
				_localctx = new ReadStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(943);
				((ReadStatementContext)_localctx).stmt = read_statement();
				}
				break;
			case 7:
				_localctx = new FlushStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(944);
				((FlushStatementContext)_localctx).stmt = flush_statement();
				}
				break;
			case 8:
				_localctx = new BreakStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(945);
				((BreakStatementContext)_localctx).stmt = break_statement();
				}
				break;
			case 9:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(946);
				((ReturnStatementContext)_localctx).stmt = return_statement();
				}
				break;
			case 10:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(947);
				((IfStatementContext)_localctx).stmt = if_statement();
				}
				break;
			case 11:
				_localctx = new SwitchStatementContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(948);
				((SwitchStatementContext)_localctx).stmt = switch_statement();
				}
				break;
			case 12:
				_localctx = new ForEachStatementContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(949);
				((ForEachStatementContext)_localctx).stmt = for_each_statement();
				}
				break;
			case 13:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(950);
				((WhileStatementContext)_localctx).stmt = while_statement();
				}
				break;
			case 14:
				_localctx = new DoWhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(951);
				((DoWhileStatementContext)_localctx).stmt = do_while_statement();
				}
				break;
			case 15:
				_localctx = new RaiseStatementContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(952);
				((RaiseStatementContext)_localctx).stmt = raise_statement();
				}
				break;
			case 16:
				_localctx = new TryStatementContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(953);
				((TryStatementContext)_localctx).stmt = try_statement();
				}
				break;
			case 17:
				_localctx = new WriteStatementContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(954);
				((WriteStatementContext)_localctx).stmt = write_statement();
				}
				break;
			case 18:
				_localctx = new WithResourceStatementContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(955);
				((WithResourceStatementContext)_localctx).stmt = with_resource_statement();
				}
				break;
			case 19:
				_localctx = new WithSingletonStatementContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(956);
				((WithSingletonStatementContext)_localctx).stmt = with_singleton_statement();
				}
				break;
			case 20:
				_localctx = new ClosureStatementContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(957);
				((ClosureStatementContext)_localctx).decl = concrete_method_declaration();
				}
				break;
			case 21:
				_localctx = new CommentStatementContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(958);
				((CommentStatementContext)_localctx).decl = comment_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Flush_statementContext extends ParserRuleContext {
		public TerminalNode FLUSH() { return getToken(EParser.FLUSH, 0); }
		public Flush_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flush_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterFlush_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitFlush_statement(this);
		}
	}

	public final Flush_statementContext flush_statement() throws RecognitionException {
		Flush_statementContext _localctx = new Flush_statementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_flush_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(961);
			match(FLUSH);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Store_statementContext extends ParserRuleContext {
		public Expression_listContext to_del;
		public Expression_listContext to_add;
		public Statement_listContext stmts;
		public TerminalNode DELETE() { return getToken(EParser.DELETE, 0); }
		public TerminalNode STORE() { return getToken(EParser.STORE, 0); }
		public List<Expression_listContext> expression_list() {
			return getRuleContexts(Expression_listContext.class);
		}
		public Expression_listContext expression_list(int i) {
			return getRuleContext(Expression_listContext.class,i);
		}
		public TerminalNode THEN() { return getToken(EParser.THEN, 0); }
		public TerminalNode COLON() { return getToken(EParser.COLON, 0); }
		public IndentContext indent() {
			return getRuleContext(IndentContext.class,0);
		}
		public DedentContext dedent() {
			return getRuleContext(DedentContext.class,0);
		}
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public TerminalNode AND() { return getToken(EParser.AND, 0); }
		public Store_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_store_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterStore_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitStore_statement(this);
		}
	}

	public final Store_statementContext store_statement() throws RecognitionException {
		Store_statementContext _localctx = new Store_statementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_store_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(972);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DELETE:
				{
				setState(963);
				match(DELETE);
				setState(964);
				((Store_statementContext)_localctx).to_del = expression_list();
				setState(968);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AND) {
					{
					setState(965);
					match(AND);
					setState(966);
					match(STORE);
					setState(967);
					((Store_statementContext)_localctx).to_add = expression_list();
					}
				}

				}
				break;
			case STORE:
				{
				setState(970);
				match(STORE);
				setState(971);
				((Store_statementContext)_localctx).to_add = expression_list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(980);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THEN) {
				{
				setState(974);
				match(THEN);
				setState(975);
				match(COLON);
				setState(976);
				indent();
				setState(977);
				((Store_statementContext)_localctx).stmts = statement_list();
				setState(978);
				dedent();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_call_statementContext extends ParserRuleContext {
		public Method_call_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_call_statement; }
	 
		public Method_call_statementContext() { }
		public void copyFrom(Method_call_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InvokeStatementContext extends Method_call_statementContext {
		public Invocation_expressionContext exp;
		public Invocation_expressionContext invocation_expression() {
			return getRuleContext(Invocation_expressionContext.class,0);
		}
		public InvokeStatementContext(Method_call_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterInvokeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitInvokeStatement(this);
		}
	}
	public static class UnresolvedWithArgsStatementContext extends Method_call_statementContext {
		public Instance_expressionContext exp1;
		public Unresolved_expressionContext exp2;
		public Argument_assignment_listContext args;
		public Variable_identifierContext name;
		public Statement_listContext stmts;
		public Instance_expressionContext instance_expression() {
			return getRuleContext(Instance_expressionContext.class,0);
		}
		public Unresolved_expressionContext unresolved_expression() {
			return getRuleContext(Unresolved_expressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(EParser.THEN, 0); }
		public TerminalNode COLON() { return getToken(EParser.COLON, 0); }
		public IndentContext indent() {
			return getRuleContext(IndentContext.class,0);
		}
		public DedentContext dedent() {
			return getRuleContext(DedentContext.class,0);
		}
		public Argument_assignment_listContext argument_assignment_list() {
			return getRuleContext(Argument_assignment_listContext.class,0);
		}
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public TerminalNode WITH() { return getToken(EParser.WITH, 0); }
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public UnresolvedWithArgsStatementContext(Method_call_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterUnresolvedWithArgsStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitUnresolvedWithArgsStatement(this);
		}
	}

	public final Method_call_statementContext method_call_statement() throws RecognitionException {
		Method_call_statementContext _localctx = new Method_call_statementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_method_call_statement);
		int _la;
		try {
			setState(1002);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
			case LBRAK:
			case LCURL:
			case MINUS:
			case LT:
			case LTCOLONGT:
			case TYPE:
			case MUTABLE:
			case NOTHING:
			case SELF:
			case SUPER:
			case THIS:
			case BOOLEAN_LITERAL:
			case CHAR_LITERAL:
			case MIN_INTEGER:
			case MAX_INTEGER:
			case SYMBOL_IDENTIFIER:
			case TYPE_IDENTIFIER:
			case VARIABLE_IDENTIFIER:
			case TEXT_LITERAL:
			case UUID_LITERAL:
			case INTEGER_LITERAL:
			case HEXA_LITERAL:
			case DECIMAL_LITERAL:
			case DATETIME_LITERAL:
			case TIME_LITERAL:
			case DATE_LITERAL:
			case PERIOD_LITERAL:
			case VERSION_LITERAL:
				_localctx = new UnresolvedWithArgsStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(984);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(982);
					((UnresolvedWithArgsStatementContext)_localctx).exp1 = instance_expression(0);
					}
					break;
				case 2:
					{
					setState(983);
					((UnresolvedWithArgsStatementContext)_localctx).exp2 = unresolved_expression(0);
					}
					break;
				}
				setState(987);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(986);
					((UnresolvedWithArgsStatementContext)_localctx).args = argument_assignment_list();
					}
					break;
				}
				setState(999);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THEN) {
					{
					setState(989);
					match(THEN);
					setState(992);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WITH) {
						{
						setState(990);
						match(WITH);
						setState(991);
						((UnresolvedWithArgsStatementContext)_localctx).name = variable_identifier();
						}
					}

					setState(994);
					match(COLON);
					setState(995);
					indent();
					setState(996);
					((UnresolvedWithArgsStatementContext)_localctx).stmts = statement_list();
					setState(997);
					dedent();
					}
				}

				}
				break;
			case INVOKE_COLON:
				_localctx = new InvokeStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1001);
				((InvokeStatementContext)_localctx).exp = invocation_expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class With_resource_statementContext extends ParserRuleContext {
		public Assign_variable_statementContext stmt;
		public Statement_listContext stmts;
		public TerminalNode WITH() { return getToken(EParser.WITH, 0); }
		public TerminalNode COMMA() { return getToken(EParser.COMMA, 0); }
		public TerminalNode DO() { return getToken(EParser.DO, 0); }
		public TerminalNode COLON() { return getToken(EParser.COLON, 0); }
		public IndentContext indent() {
			return getRuleContext(IndentContext.class,0);
		}
		public DedentContext dedent() {
			return getRuleContext(DedentContext.class,0);
		}
		public Assign_variable_statementContext assign_variable_statement() {
			return getRuleContext(Assign_variable_statementContext.class,0);
		}
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public With_resource_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_resource_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterWith_resource_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitWith_resource_statement(this);
		}
	}

	public final With_resource_statementContext with_resource_statement() throws RecognitionException {
		With_resource_statementContext _localctx = new With_resource_statementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_with_resource_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1004);
			match(WITH);
			setState(1005);
			((With_resource_statementContext)_localctx).stmt = assign_variable_statement();
			setState(1006);
			match(COMMA);
			setState(1007);
			match(DO);
			setState(1008);
			match(COLON);
			setState(1009);
			indent();
			setState(1010);
			((With_resource_statementContext)_localctx).stmts = statement_list();
			setState(1011);
			dedent();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class With_singleton_statementContext extends ParserRuleContext {
		public Type_identifierContext typ;
		public Statement_listContext stmts;
		public TerminalNode WITH() { return getToken(EParser.WITH, 0); }
		public TerminalNode COMMA() { return getToken(EParser.COMMA, 0); }
		public TerminalNode DO() { return getToken(EParser.DO, 0); }
		public TerminalNode COLON() { return getToken(EParser.COLON, 0); }
		public IndentContext indent() {
			return getRuleContext(IndentContext.class,0);
		}
		public DedentContext dedent() {
			return getRuleContext(DedentContext.class,0);
		}
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public With_singleton_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_singleton_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterWith_singleton_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitWith_singleton_statement(this);
		}
	}

	public final With_singleton_statementContext with_singleton_statement() throws RecognitionException {
		With_singleton_statementContext _localctx = new With_singleton_statementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_with_singleton_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1013);
			match(WITH);
			setState(1014);
			((With_singleton_statementContext)_localctx).typ = type_identifier();
			setState(1015);
			match(COMMA);
			setState(1016);
			match(DO);
			setState(1017);
			match(COLON);
			setState(1018);
			indent();
			setState(1019);
			((With_singleton_statementContext)_localctx).stmts = statement_list();
			setState(1020);
			dedent();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_statementContext extends ParserRuleContext {
		public ExpressionContext exp;
		public Switch_case_statement_listContext cases;
		public Statement_listContext stmts;
		public TerminalNode SWITCH() { return getToken(EParser.SWITCH, 0); }
		public TerminalNode ON() { return getToken(EParser.ON, 0); }
		public List<TerminalNode> COLON() { return getTokens(EParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(EParser.COLON, i);
		}
		public List<IndentContext> indent() {
			return getRuleContexts(IndentContext.class);
		}
		public IndentContext indent(int i) {
			return getRuleContext(IndentContext.class,i);
		}
		public List<DedentContext> dedent() {
			return getRuleContexts(DedentContext.class);
		}
		public DedentContext dedent(int i) {
			return getRuleContext(DedentContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Switch_case_statement_listContext switch_case_statement_list() {
			return getRuleContext(Switch_case_statement_listContext.class,0);
		}
		public LfpContext lfp() {
			return getRuleContext(LfpContext.class,0);
		}
		public TerminalNode OTHERWISE() { return getToken(EParser.OTHERWISE, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public Switch_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterSwitch_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitSwitch_statement(this);
		}
	}

	public final Switch_statementContext switch_statement() throws RecognitionException {
		Switch_statementContext _localctx = new Switch_statementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_switch_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1022);
			match(SWITCH);
			setState(1023);
			match(ON);
			setState(1024);
			((Switch_statementContext)_localctx).exp = expression(0);
			setState(1025);
			match(COLON);
			setState(1026);
			indent();
			setState(1027);
			((Switch_statementContext)_localctx).cases = switch_case_statement_list();
			setState(1035);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(1028);
				lfp();
				setState(1029);
				match(OTHERWISE);
				setState(1030);
				match(COLON);
				setState(1031);
				indent();
				setState(1032);
				((Switch_statementContext)_localctx).stmts = statement_list();
				setState(1033);
				dedent();
				}
				break;
			}
			setState(1037);
			dedent();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_case_statementContext extends ParserRuleContext {
		public Switch_case_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_case_statement; }
	 
		public Switch_case_statementContext() { }
		public void copyFrom(Switch_case_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AtomicSwitchCaseContext extends Switch_case_statementContext {
		public Atomic_literalContext exp;
		public Statement_listContext stmts;
		public TerminalNode WHEN() { return getToken(EParser.WHEN, 0); }
		public TerminalNode COLON() { return getToken(EParser.COLON, 0); }
		public IndentContext indent() {
			return getRuleContext(IndentContext.class,0);
		}
		public DedentContext dedent() {
			return getRuleContext(DedentContext.class,0);
		}
		public Atomic_literalContext atomic_literal() {
			return getRuleContext(Atomic_literalContext.class,0);
		}
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public AtomicSwitchCaseContext(Switch_case_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterAtomicSwitchCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitAtomicSwitchCase(this);
		}
	}
	public static class CollectionSwitchCaseContext extends Switch_case_statementContext {
		public Literal_collectionContext exp;
		public Statement_listContext stmts;
		public TerminalNode WHEN() { return getToken(EParser.WHEN, 0); }
		public TerminalNode IN() { return getToken(EParser.IN, 0); }
		public TerminalNode COLON() { return getToken(EParser.COLON, 0); }
		public IndentContext indent() {
			return getRuleContext(IndentContext.class,0);
		}
		public DedentContext dedent() {
			return getRuleContext(DedentContext.class,0);
		}
		public Literal_collectionContext literal_collection() {
			return getRuleContext(Literal_collectionContext.class,0);
		}
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public CollectionSwitchCaseContext(Switch_case_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterCollectionSwitchCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitCollectionSwitchCase(this);
		}
	}

	public final Switch_case_statementContext switch_case_statement() throws RecognitionException {
		Switch_case_statementContext _localctx = new Switch_case_statementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_switch_case_statement);
		try {
			setState(1054);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				_localctx = new AtomicSwitchCaseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1039);
				match(WHEN);
				setState(1040);
				((AtomicSwitchCaseContext)_localctx).exp = atomic_literal();
				setState(1041);
				match(COLON);
				setState(1042);
				indent();
				setState(1043);
				((AtomicSwitchCaseContext)_localctx).stmts = statement_list();
				setState(1044);
				dedent();
				}
				break;
			case 2:
				_localctx = new CollectionSwitchCaseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1046);
				match(WHEN);
				setState(1047);
				match(IN);
				setState(1048);
				((CollectionSwitchCaseContext)_localctx).exp = literal_collection();
				setState(1049);
				match(COLON);
				setState(1050);
				indent();
				setState(1051);
				((CollectionSwitchCaseContext)_localctx).stmts = statement_list();
				setState(1052);
				dedent();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_each_statementContext extends ParserRuleContext {
		public Variable_identifierContext name1;
		public Variable_identifierContext name2;
		public ExpressionContext source;
		public Statement_listContext stmts;
		public TerminalNode FOR() { return getToken(EParser.FOR, 0); }
		public TerminalNode EACH() { return getToken(EParser.EACH, 0); }
		public TerminalNode IN() { return getToken(EParser.IN, 0); }
		public TerminalNode COLON() { return getToken(EParser.COLON, 0); }
		public IndentContext indent() {
			return getRuleContext(IndentContext.class,0);
		}
		public DedentContext dedent() {
			return getRuleContext(DedentContext.class,0);
		}
		public List<Variable_identifierContext> variable_identifier() {
			return getRuleContexts(Variable_identifierContext.class);
		}
		public Variable_identifierContext variable_identifier(int i) {
			return getRuleContext(Variable_identifierContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(EParser.COMMA, 0); }
		public For_each_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_each_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterFor_each_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitFor_each_statement(this);
		}
	}

	public final For_each_statementContext for_each_statement() throws RecognitionException {
		For_each_statementContext _localctx = new For_each_statementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_for_each_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1056);
			match(FOR);
			setState(1057);
			match(EACH);
			setState(1058);
			((For_each_statementContext)_localctx).name1 = variable_identifier();
			setState(1061);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1059);
				match(COMMA);
				setState(1060);
				((For_each_statementContext)_localctx).name2 = variable_identifier();
				}
			}

			setState(1063);
			match(IN);
			setState(1064);
			((For_each_statementContext)_localctx).source = expression(0);
			setState(1065);
			match(COLON);
			setState(1066);
			indent();
			setState(1067);
			((For_each_statementContext)_localctx).stmts = statement_list();
			setState(1068);
			dedent();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Do_while_statementContext extends ParserRuleContext {
		public Statement_listContext stmts;
		public ExpressionContext exp;
		public TerminalNode DO() { return getToken(EParser.DO, 0); }
		public TerminalNode COLON() { return getToken(EParser.COLON, 0); }
		public IndentContext indent() {
			return getRuleContext(IndentContext.class,0);
		}
		public DedentContext dedent() {
			return getRuleContext(DedentContext.class,0);
		}
		public LfpContext lfp() {
			return getRuleContext(LfpContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(EParser.WHILE, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Do_while_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterDo_while_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitDo_while_statement(this);
		}
	}

	public final Do_while_statementContext do_while_statement() throws RecognitionException {
		Do_while_statementContext _localctx = new Do_while_statementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_do_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1070);
			match(DO);
			setState(1071);
			match(COLON);
			setState(1072);
			indent();
			setState(1073);
			((Do_while_statementContext)_localctx).stmts = statement_list();
			setState(1074);
			dedent();
			setState(1075);
			lfp();
			setState(1076);
			match(WHILE);
			setState(1077);
			((Do_while_statementContext)_localctx).exp = expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_statementContext extends ParserRuleContext {
		public ExpressionContext exp;
		public Statement_listContext stmts;
		public TerminalNode WHILE() { return getToken(EParser.WHILE, 0); }
		public TerminalNode COLON() { return getToken(EParser.COLON, 0); }
		public IndentContext indent() {
			return getRuleContext(IndentContext.class,0);
		}
		public DedentContext dedent() {
			return getRuleContext(DedentContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitWhile_statement(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1079);
			match(WHILE);
			setState(1080);
			((While_statementContext)_localctx).exp = expression(0);
			setState(1081);
			match(COLON);
			setState(1082);
			indent();
			setState(1083);
			((While_statementContext)_localctx).stmts = statement_list();
			setState(1084);
			dedent();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statementContext extends ParserRuleContext {
		public ExpressionContext exp;
		public Statement_listContext stmts;
		public Else_if_statement_listContext elseIfs;
		public Statement_listContext elseStmts;
		public TerminalNode IF() { return getToken(EParser.IF, 0); }
		public List<TerminalNode> COLON() { return getTokens(EParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(EParser.COLON, i);
		}
		public List<IndentContext> indent() {
			return getRuleContexts(IndentContext.class);
		}
		public IndentContext indent(int i) {
			return getRuleContext(IndentContext.class,i);
		}
		public List<DedentContext> dedent() {
			return getRuleContexts(DedentContext.class);
		}
		public DedentContext dedent(int i) {
			return getRuleContext(DedentContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<Statement_listContext> statement_list() {
			return getRuleContexts(Statement_listContext.class);
		}
		public Statement_listContext statement_list(int i) {
			return getRuleContext(Statement_listContext.class,i);
		}
		public List<LfpContext> lfp() {
			return getRuleContexts(LfpContext.class);
		}
		public LfpContext lfp(int i) {
			return getRuleContext(LfpContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(EParser.ELSE, 0); }
		public Else_if_statement_listContext else_if_statement_list() {
			return getRuleContext(Else_if_statement_listContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitIf_statement(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1086);
			match(IF);
			setState(1087);
			((If_statementContext)_localctx).exp = expression(0);
			setState(1088);
			match(COLON);
			setState(1089);
			indent();
			setState(1090);
			((If_statementContext)_localctx).stmts = statement_list();
			setState(1091);
			dedent();
			setState(1095);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(1092);
				lfp();
				setState(1093);
				((If_statementContext)_localctx).elseIfs = else_if_statement_list(0);
				}
				break;
			}
			setState(1104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(1097);
				lfp();
				setState(1098);
				match(ELSE);
				setState(1099);
				match(COLON);
				setState(1100);
				indent();
				setState(1101);
				((If_statementContext)_localctx).elseStmts = statement_list();
				setState(1102);
				dedent();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_if_statement_listContext extends ParserRuleContext {
		public Else_if_statement_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_if_statement_list; }
	 
		public Else_if_statement_listContext() { }
		public void copyFrom(Else_if_statement_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ElseIfStatementListContext extends Else_if_statement_listContext {
		public ExpressionContext exp;
		public Statement_listContext stmts;
		public TerminalNode ELSE() { return getToken(EParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(EParser.IF, 0); }
		public TerminalNode COLON() { return getToken(EParser.COLON, 0); }
		public IndentContext indent() {
			return getRuleContext(IndentContext.class,0);
		}
		public DedentContext dedent() {
			return getRuleContext(DedentContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public ElseIfStatementListContext(Else_if_statement_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterElseIfStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitElseIfStatementList(this);
		}
	}
	public static class ElseIfStatementListItemContext extends Else_if_statement_listContext {
		public Else_if_statement_listContext items;
		public ExpressionContext exp;
		public Statement_listContext stmts;
		public LfpContext lfp() {
			return getRuleContext(LfpContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(EParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(EParser.IF, 0); }
		public TerminalNode COLON() { return getToken(EParser.COLON, 0); }
		public IndentContext indent() {
			return getRuleContext(IndentContext.class,0);
		}
		public DedentContext dedent() {
			return getRuleContext(DedentContext.class,0);
		}
		public Else_if_statement_listContext else_if_statement_list() {
			return getRuleContext(Else_if_statement_listContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public ElseIfStatementListItemContext(Else_if_statement_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterElseIfStatementListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitElseIfStatementListItem(this);
		}
	}

	public final Else_if_statement_listContext else_if_statement_list() throws RecognitionException {
		return else_if_statement_list(0);
	}

	private Else_if_statement_listContext else_if_statement_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Else_if_statement_listContext _localctx = new Else_if_statement_listContext(_ctx, _parentState);
		Else_if_statement_listContext _prevctx = _localctx;
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_else_if_statement_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ElseIfStatementListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1107);
			match(ELSE);
			setState(1108);
			match(IF);
			setState(1109);
			((ElseIfStatementListContext)_localctx).exp = expression(0);
			setState(1110);
			match(COLON);
			setState(1111);
			indent();
			setState(1112);
			((ElseIfStatementListContext)_localctx).stmts = statement_list();
			setState(1113);
			dedent();
			}
			_ctx.stop = _input.LT(-1);
			setState(1127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ElseIfStatementListItemContext(new Else_if_statement_listContext(_parentctx, _parentState));
					((ElseIfStatementListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_else_if_statement_list);
					setState(1115);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1116);
					lfp();
					setState(1117);
					match(ELSE);
					setState(1118);
					match(IF);
					setState(1119);
					((ElseIfStatementListItemContext)_localctx).exp = expression(0);
					setState(1120);
					match(COLON);
					setState(1121);
					indent();
					setState(1122);
					((ElseIfStatementListItemContext)_localctx).stmts = statement_list();
					setState(1123);
					dedent();
					}
					} 
				}
				setState(1129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Raise_statementContext extends ParserRuleContext {
		public ExpressionContext exp;
		public TerminalNode RAISE() { return getToken(EParser.RAISE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Raise_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raise_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterRaise_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitRaise_statement(this);
		}
	}

	public final Raise_statementContext raise_statement() throws RecognitionException {
		Raise_statementContext _localctx = new Raise_statementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_raise_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1130);
			match(RAISE);
			setState(1131);
			((Raise_statementContext)_localctx).exp = expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Try_statementContext extends ParserRuleContext {
		public Variable_identifierContext name;
		public Statement_listContext stmts;
		public Catch_statement_listContext handlers;
		public Statement_listContext anyStmts;
		public Statement_listContext finalStmts;
		public TerminalNode SWITCH() { return getToken(EParser.SWITCH, 0); }
		public TerminalNode ON() { return getToken(EParser.ON, 0); }
		public TerminalNode DOING() { return getToken(EParser.DOING, 0); }
		public List<TerminalNode> COLON() { return getTokens(EParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(EParser.COLON, i);
		}
		public List<IndentContext> indent() {
			return getRuleContexts(IndentContext.class);
		}
		public IndentContext indent(int i) {
			return getRuleContext(IndentContext.class,i);
		}
		public List<DedentContext> dedent() {
			return getRuleContexts(DedentContext.class);
		}
		public DedentContext dedent(int i) {
			return getRuleContext(DedentContext.class,i);
		}
		public List<LfsContext> lfs() {
			return getRuleContexts(LfsContext.class);
		}
		public LfsContext lfs(int i) {
			return getRuleContext(LfsContext.class,i);
		}
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public List<Statement_listContext> statement_list() {
			return getRuleContexts(Statement_listContext.class);
		}
		public Statement_listContext statement_list(int i) {
			return getRuleContext(Statement_listContext.class,i);
		}
		public TerminalNode ALWAYS() { return getToken(EParser.ALWAYS, 0); }
		public Catch_statement_listContext catch_statement_list() {
			return getRuleContext(Catch_statement_listContext.class,0);
		}
		public TerminalNode OTHERWISE() { return getToken(EParser.OTHERWISE, 0); }
		public TerminalNode WHEN() { return getToken(EParser.WHEN, 0); }
		public TerminalNode ANY() { return getToken(EParser.ANY, 0); }
		public Try_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_try_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterTry_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitTry_statement(this);
		}
	}

	public final Try_statementContext try_statement() throws RecognitionException {
		Try_statementContext _localctx = new Try_statementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_try_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1133);
			match(SWITCH);
			setState(1134);
			match(ON);
			setState(1135);
			((Try_statementContext)_localctx).name = variable_identifier();
			setState(1136);
			match(DOING);
			setState(1137);
			match(COLON);
			setState(1138);
			indent();
			setState(1139);
			((Try_statementContext)_localctx).stmts = statement_list();
			setState(1140);
			dedent();
			setState(1141);
			lfs();
			setState(1143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(1142);
				((Try_statementContext)_localctx).handlers = catch_statement_list();
				}
				break;
			}
			setState(1156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OTHERWISE || _la==WHEN) {
				{
				setState(1148);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OTHERWISE:
					{
					setState(1145);
					match(OTHERWISE);
					}
					break;
				case WHEN:
					{
					{
					setState(1146);
					match(WHEN);
					setState(1147);
					match(ANY);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1150);
				match(COLON);
				setState(1151);
				indent();
				setState(1152);
				((Try_statementContext)_localctx).anyStmts = statement_list();
				setState(1153);
				dedent();
				setState(1154);
				lfs();
				}
			}

			setState(1165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALWAYS) {
				{
				setState(1158);
				match(ALWAYS);
				setState(1159);
				match(COLON);
				setState(1160);
				indent();
				setState(1161);
				((Try_statementContext)_localctx).finalStmts = statement_list();
				setState(1162);
				dedent();
				setState(1163);
				lfs();
				}
			}

			setState(1167);
			lfs();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Catch_statementContext extends ParserRuleContext {
		public Catch_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catch_statement; }
	 
		public Catch_statementContext() { }
		public void copyFrom(Catch_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CatchAtomicStatementContext extends Catch_statementContext {
		public Symbol_identifierContext name;
		public Statement_listContext stmts;
		public TerminalNode WHEN() { return getToken(EParser.WHEN, 0); }
		public TerminalNode COLON() { return getToken(EParser.COLON, 0); }
		public IndentContext indent() {
			return getRuleContext(IndentContext.class,0);
		}
		public DedentContext dedent() {
			return getRuleContext(DedentContext.class,0);
		}
		public LfsContext lfs() {
			return getRuleContext(LfsContext.class,0);
		}
		public Symbol_identifierContext symbol_identifier() {
			return getRuleContext(Symbol_identifierContext.class,0);
		}
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public CatchAtomicStatementContext(Catch_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterCatchAtomicStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitCatchAtomicStatement(this);
		}
	}
	public static class CatchCollectionStatementContext extends Catch_statementContext {
		public Symbol_listContext exp;
		public Statement_listContext stmts;
		public TerminalNode WHEN() { return getToken(EParser.WHEN, 0); }
		public TerminalNode IN() { return getToken(EParser.IN, 0); }
		public TerminalNode LBRAK() { return getToken(EParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(EParser.RBRAK, 0); }
		public TerminalNode COLON() { return getToken(EParser.COLON, 0); }
		public IndentContext indent() {
			return getRuleContext(IndentContext.class,0);
		}
		public DedentContext dedent() {
			return getRuleContext(DedentContext.class,0);
		}
		public LfsContext lfs() {
			return getRuleContext(LfsContext.class,0);
		}
		public Symbol_listContext symbol_list() {
			return getRuleContext(Symbol_listContext.class,0);
		}
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public CatchCollectionStatementContext(Catch_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterCatchCollectionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitCatchCollectionStatement(this);
		}
	}

	public final Catch_statementContext catch_statement() throws RecognitionException {
		Catch_statementContext _localctx = new Catch_statementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_catch_statement);
		try {
			setState(1188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				_localctx = new CatchAtomicStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1169);
				match(WHEN);
				setState(1170);
				((CatchAtomicStatementContext)_localctx).name = symbol_identifier();
				setState(1171);
				match(COLON);
				setState(1172);
				indent();
				setState(1173);
				((CatchAtomicStatementContext)_localctx).stmts = statement_list();
				setState(1174);
				dedent();
				setState(1175);
				lfs();
				}
				break;
			case 2:
				_localctx = new CatchCollectionStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1177);
				match(WHEN);
				setState(1178);
				match(IN);
				setState(1179);
				match(LBRAK);
				setState(1180);
				((CatchCollectionStatementContext)_localctx).exp = symbol_list();
				setState(1181);
				match(RBRAK);
				setState(1182);
				match(COLON);
				setState(1183);
				indent();
				setState(1184);
				((CatchCollectionStatementContext)_localctx).stmts = statement_list();
				setState(1185);
				dedent();
				setState(1186);
				lfs();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Break_statementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(EParser.BREAK, 0); }
		public Break_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterBreak_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitBreak_statement(this);
		}
	}

	public final Break_statementContext break_statement() throws RecognitionException {
		Break_statementContext _localctx = new Break_statementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_break_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1190);
			match(BREAK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_statementContext extends ParserRuleContext {
		public ExpressionContext exp;
		public TerminalNode RETURN() { return getToken(EParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitReturn_statement(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_return_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1192);
			match(RETURN);
			setState(1194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << LTCOLONGT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (METHOD_COLON - 64)) | (1L << (CODE - 64)) | (1L << (DOCUMENT - 64)) | (1L << (BLOB - 64)) | (1L << (TYPE - 64)) | (1L << (EXECUTE - 64)) | (1L << (FETCH - 64)) | (1L << (INVOKE_COLON - 64)) | (1L << (MUTABLE - 64)) | (1L << (NOT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (NOTHING - 128)) | (1L << (READ - 128)) | (1L << (SELF - 128)) | (1L << (SORTED - 128)) | (1L << (SUPER - 128)) | (1L << (THIS - 128)) | (1L << (BOOLEAN_LITERAL - 128)) | (1L << (CHAR_LITERAL - 128)) | (1L << (MIN_INTEGER - 128)) | (1L << (MAX_INTEGER - 128)) | (1L << (SYMBOL_IDENTIFIER - 128)) | (1L << (TYPE_IDENTIFIER - 128)) | (1L << (VARIABLE_IDENTIFIER - 128)) | (1L << (TEXT_LITERAL - 128)) | (1L << (UUID_LITERAL - 128)) | (1L << (INTEGER_LITERAL - 128)) | (1L << (HEXA_LITERAL - 128)) | (1L << (DECIMAL_LITERAL - 128)) | (1L << (DATETIME_LITERAL - 128)) | (1L << (TIME_LITERAL - 128)) | (1L << (DATE_LITERAL - 128)) | (1L << (PERIOD_LITERAL - 128)) | (1L << (VERSION_LITERAL - 128)))) != 0)) {
				{
				setState(1193);
				((Return_statementContext)_localctx).exp = expression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntDivideExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public IdivideContext idivide() {
			return getRuleContext(IdivideContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IntDivideExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterIntDivideExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitIntDivideExpression(this);
		}
	}
	public static class HasAnyExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode HAS() { return getToken(EParser.HAS, 0); }
		public TerminalNode ANY() { return getToken(EParser.ANY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public HasAnyExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterHasAnyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitHasAnyExpression(this);
		}
	}
	public static class HasExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode HAS() { return getToken(EParser.HAS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public HasExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterHasExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitHasExpression(this);
		}
	}
	public static class InExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode IN() { return getToken(EParser.IN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public InExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterInExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitInExpression(this);
		}
	}
	public static class JsxExpressionContext extends ExpressionContext {
		public Jsx_expressionContext exp;
		public Jsx_expressionContext jsx_expression() {
			return getRuleContext(Jsx_expressionContext.class,0);
		}
		public JsxExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJsxExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJsxExpression(this);
		}
	}
	public static class GreaterThanExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode GT() { return getToken(EParser.GT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GreaterThanExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterGreaterThanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitGreaterThanExpression(this);
		}
	}
	public static class OrExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode OR() { return getToken(EParser.OR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OrExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitOrExpression(this);
		}
	}
	public static class ReadOneExpressionContext extends ExpressionContext {
		public Read_one_expressionContext exp;
		public Read_one_expressionContext read_one_expression() {
			return getRuleContext(Read_one_expressionContext.class,0);
		}
		public ReadOneExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterReadOneExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitReadOneExpression(this);
		}
	}
	public static class NotHasAnyExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode NOT() { return getToken(EParser.NOT, 0); }
		public TerminalNode HAS() { return getToken(EParser.HAS, 0); }
		public TerminalNode ANY() { return getToken(EParser.ANY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public NotHasAnyExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterNotHasAnyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitNotHasAnyExpression(this);
		}
	}
	public static class AndExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode AND() { return getToken(EParser.AND, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AndExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitAndExpression(this);
		}
	}
	public static class ArrowExpressionContext extends ExpressionContext {
		public Arrow_expressionContext exp;
		public Arrow_expressionContext arrow_expression() {
			return getRuleContext(Arrow_expressionContext.class,0);
		}
		public ArrowExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterArrowExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitArrowExpression(this);
		}
	}
	public static class MethodCallExpressionContext extends ExpressionContext {
		public Instance_expressionContext exp1;
		public Unresolved_expressionContext exp2;
		public Argument_assignment_listContext args;
		public Argument_assignment_listContext argument_assignment_list() {
			return getRuleContext(Argument_assignment_listContext.class,0);
		}
		public Instance_expressionContext instance_expression() {
			return getRuleContext(Instance_expressionContext.class,0);
		}
		public Unresolved_expressionContext unresolved_expression() {
			return getRuleContext(Unresolved_expressionContext.class,0);
		}
		public MethodCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterMethodCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitMethodCallExpression(this);
		}
	}
	public static class FetchExpressionContext extends ExpressionContext {
		public Fetch_expressionContext exp;
		public Fetch_expressionContext fetch_expression() {
			return getRuleContext(Fetch_expressionContext.class,0);
		}
		public FetchExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterFetchExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitFetchExpression(this);
		}
	}
	public static class NotHasExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode NOT() { return getToken(EParser.NOT, 0); }
		public TerminalNode HAS() { return getToken(EParser.HAS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public NotHasExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterNotHasExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitNotHasExpression(this);
		}
	}
	public static class SortedExpressionContext extends ExpressionContext {
		public Sorted_expressionContext exp;
		public Sorted_expressionContext sorted_expression() {
			return getRuleContext(Sorted_expressionContext.class,0);
		}
		public SortedExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterSortedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitSortedExpression(this);
		}
	}
	public static class NotHasAllExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode NOT() { return getToken(EParser.NOT, 0); }
		public TerminalNode HAS() { return getToken(EParser.HAS, 0); }
		public TerminalNode ALL() { return getToken(EParser.ALL, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public NotHasAllExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterNotHasAllExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitNotHasAllExpression(this);
		}
	}
	public static class ContainsExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode CONTAINS() { return getToken(EParser.CONTAINS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ContainsExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterContainsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitContainsExpression(this);
		}
	}
	public static class NotContainsExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode NOT() { return getToken(EParser.NOT, 0); }
		public TerminalNode CONTAINS() { return getToken(EParser.CONTAINS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public NotContainsExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterNotContainsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitNotContainsExpression(this);
		}
	}
	public static class RoughlyEqualsExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode TILDE() { return getToken(EParser.TILDE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public RoughlyEqualsExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterRoughlyEqualsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitRoughlyEqualsExpression(this);
		}
	}
	public static class ExecuteExpressionContext extends ExpressionContext {
		public Variable_identifierContext name;
		public TerminalNode EXECUTE() { return getToken(EParser.EXECUTE, 0); }
		public TerminalNode COLON() { return getToken(EParser.COLON, 0); }
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public ExecuteExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterExecuteExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitExecuteExpression(this);
		}
	}
	public static class GreaterThanOrEqualExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode GTE() { return getToken(EParser.GTE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GreaterThanOrEqualExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterGreaterThanOrEqualExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitGreaterThanOrEqualExpression(this);
		}
	}
	public static class IteratorExpressionContext extends ExpressionContext {
		public ExpressionContext exp;
		public Variable_identifierContext name;
		public ExpressionContext source;
		public TerminalNode FOR() { return getToken(EParser.FOR, 0); }
		public TerminalNode EACH() { return getToken(EParser.EACH, 0); }
		public TerminalNode IN() { return getToken(EParser.IN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public IteratorExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterIteratorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitIteratorExpression(this);
		}
	}
	public static class IsNotExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Is_expressionContext right;
		public TerminalNode IS() { return getToken(EParser.IS, 0); }
		public TerminalNode NOT() { return getToken(EParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Is_expressionContext is_expression() {
			return getRuleContext(Is_expressionContext.class,0);
		}
		public IsNotExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterIsNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitIsNotExpression(this);
		}
	}
	public static class DivideExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public DivideContext divide() {
			return getRuleContext(DivideContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public DivideExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterDivideExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitDivideExpression(this);
		}
	}
	public static class IsExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Is_expressionContext right;
		public TerminalNode IS() { return getToken(EParser.IS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Is_expressionContext is_expression() {
			return getRuleContext(Is_expressionContext.class,0);
		}
		public IsExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterIsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitIsExpression(this);
		}
	}
	public static class AddExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(EParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(EParser.MINUS, 0); }
		public AddExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterAddExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitAddExpression(this);
		}
	}
	public static class InstanceExpressionContext extends ExpressionContext {
		public Instance_expressionContext exp;
		public Instance_expressionContext instance_expression() {
			return getRuleContext(Instance_expressionContext.class,0);
		}
		public InstanceExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterInstanceExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitInstanceExpression(this);
		}
	}
	public static class MutableInstanceExpressionContext extends ExpressionContext {
		public Mutable_instance_expressionContext exp;
		public Mutable_instance_expressionContext mutable_instance_expression() {
			return getRuleContext(Mutable_instance_expressionContext.class,0);
		}
		public MutableInstanceExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterMutableInstanceExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitMutableInstanceExpression(this);
		}
	}
	public static class ReadAllExpressionContext extends ExpressionContext {
		public Read_all_expressionContext exp;
		public Read_all_expressionContext read_all_expression() {
			return getRuleContext(Read_all_expressionContext.class,0);
		}
		public ReadAllExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterReadAllExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitReadAllExpression(this);
		}
	}
	public static class CastExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Category_or_any_typeContext right;
		public TerminalNode AS() { return getToken(EParser.AS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Category_or_any_typeContext category_or_any_type() {
			return getRuleContext(Category_or_any_typeContext.class,0);
		}
		public TerminalNode MUTABLE() { return getToken(EParser.MUTABLE, 0); }
		public CastExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitCastExpression(this);
		}
	}
	public static class ModuloExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public ModuloContext modulo() {
			return getRuleContext(ModuloContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ModuloExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterModuloExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitModuloExpression(this);
		}
	}
	public static class TernaryExpressionContext extends ExpressionContext {
		public ExpressionContext ifTrue;
		public ExpressionContext test;
		public ExpressionContext ifFalse;
		public TerminalNode IF() { return getToken(EParser.IF, 0); }
		public TerminalNode ELSE() { return getToken(EParser.ELSE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TernaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterTernaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitTernaryExpression(this);
		}
	}
	public static class NotEqualsExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode LTGT() { return getToken(EParser.LTGT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public NotEqualsExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterNotEqualsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitNotEqualsExpression(this);
		}
	}
	public static class DocumentExpressionContext extends ExpressionContext {
		public Document_expressionContext exp;
		public Document_expressionContext document_expression() {
			return getRuleContext(Document_expressionContext.class,0);
		}
		public DocumentExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterDocumentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitDocumentExpression(this);
		}
	}
	public static class NotExpressionContext extends ExpressionContext {
		public ExpressionContext exp;
		public TerminalNode NOT() { return getToken(EParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitNotExpression(this);
		}
	}
	public static class InvocationExpressionContext extends ExpressionContext {
		public Invocation_expressionContext exp;
		public Invocation_expressionContext invocation_expression() {
			return getRuleContext(Invocation_expressionContext.class,0);
		}
		public InvocationExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterInvocationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitInvocationExpression(this);
		}
	}
	public static class CodeExpressionContext extends ExpressionContext {
		public ExpressionContext exp;
		public TerminalNode CODE() { return getToken(EParser.CODE, 0); }
		public TerminalNode COLON() { return getToken(EParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CodeExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterCodeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitCodeExpression(this);
		}
	}
	public static class AmbiguousExpressionContext extends ExpressionContext {
		public Ambiguous_expressionContext exp;
		public Ambiguous_expressionContext ambiguous_expression() {
			return getRuleContext(Ambiguous_expressionContext.class,0);
		}
		public AmbiguousExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterAmbiguousExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitAmbiguousExpression(this);
		}
	}
	public static class LessThanOrEqualExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode LTE() { return getToken(EParser.LTE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LessThanOrEqualExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterLessThanOrEqualExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitLessThanOrEqualExpression(this);
		}
	}
	public static class ClosureExpressionContext extends ExpressionContext {
		public Method_identifierContext name;
		public TerminalNode METHOD_COLON() { return getToken(EParser.METHOD_COLON, 0); }
		public Method_identifierContext method_identifier() {
			return getRuleContext(Method_identifierContext.class,0);
		}
		public ClosureExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterClosureExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitClosureExpression(this);
		}
	}
	public static class BlobExpressionContext extends ExpressionContext {
		public Blob_expressionContext exp;
		public Blob_expressionContext blob_expression() {
			return getRuleContext(Blob_expressionContext.class,0);
		}
		public BlobExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterBlobExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitBlobExpression(this);
		}
	}
	public static class FilteredListExpressionContext extends ExpressionContext {
		public ExpressionContext src;
		public Filtered_list_suffixContext filtered_list_suffix() {
			return getRuleContext(Filtered_list_suffixContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FilteredListExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterFilteredListExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitFilteredListExpression(this);
		}
	}
	public static class ConstructorExpressionContext extends ExpressionContext {
		public Constructor_expressionContext exp;
		public Constructor_expressionContext constructor_expression() {
			return getRuleContext(Constructor_expressionContext.class,0);
		}
		public ConstructorExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterConstructorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitConstructorExpression(this);
		}
	}
	public static class ReadBlobExpressionContext extends ExpressionContext {
		public Read_blob_expressionContext exp;
		public Read_blob_expressionContext read_blob_expression() {
			return getRuleContext(Read_blob_expressionContext.class,0);
		}
		public ReadBlobExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterReadBlobExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitReadBlobExpression(this);
		}
	}
	public static class MultiplyExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public MultiplyContext multiply() {
			return getRuleContext(MultiplyContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MultiplyExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterMultiplyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitMultiplyExpression(this);
		}
	}
	public static class NotInExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode NOT() { return getToken(EParser.NOT, 0); }
		public TerminalNode IN() { return getToken(EParser.IN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public NotInExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterNotInExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitNotInExpression(this);
		}
	}
	public static class UnresolvedExpressionContext extends ExpressionContext {
		public Unresolved_expressionContext exp;
		public Unresolved_expressionContext unresolved_expression() {
			return getRuleContext(Unresolved_expressionContext.class,0);
		}
		public UnresolvedExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterUnresolvedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitUnresolvedExpression(this);
		}
	}
	public static class MinusExpressionContext extends ExpressionContext {
		public ExpressionContext exp;
		public TerminalNode MINUS() { return getToken(EParser.MINUS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MinusExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterMinusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitMinusExpression(this);
		}
	}
	public static class HasAllExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode HAS() { return getToken(EParser.HAS, 0); }
		public TerminalNode ALL() { return getToken(EParser.ALL, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public HasAllExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterHasAllExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitHasAllExpression(this);
		}
	}
	public static class CssExpressionContext extends ExpressionContext {
		public Css_expressionContext exp;
		public Css_expressionContext css_expression() {
			return getRuleContext(Css_expressionContext.class,0);
		}
		public CssExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterCssExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitCssExpression(this);
		}
	}
	public static class LessThanExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode LT() { return getToken(EParser.LT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LessThanExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterLessThanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitLessThanExpression(this);
		}
	}
	public static class EqualsExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode EQ() { return getToken(EParser.EQ, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public EqualsExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterEqualsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitEqualsExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 90;
		enterRecursionRule(_localctx, 90, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				_localctx = new CssExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1197);
				((CssExpressionContext)_localctx).exp = css_expression();
				}
				break;
			case 2:
				{
				_localctx = new JsxExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1198);
				((JsxExpressionContext)_localctx).exp = jsx_expression();
				}
				break;
			case 3:
				{
				_localctx = new InstanceExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1199);
				((InstanceExpressionContext)_localctx).exp = instance_expression(0);
				}
				break;
			case 4:
				{
				_localctx = new ArrowExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1200);
				((ArrowExpressionContext)_localctx).exp = arrow_expression();
				}
				break;
			case 5:
				{
				_localctx = new UnresolvedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1201);
				((UnresolvedExpressionContext)_localctx).exp = unresolved_expression(0);
				}
				break;
			case 6:
				{
				_localctx = new MethodCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1204);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(1202);
					((MethodCallExpressionContext)_localctx).exp1 = instance_expression(0);
					}
					break;
				case 2:
					{
					setState(1203);
					((MethodCallExpressionContext)_localctx).exp2 = unresolved_expression(0);
					}
					break;
				}
				setState(1206);
				((MethodCallExpressionContext)_localctx).args = argument_assignment_list();
				}
				break;
			case 7:
				{
				_localctx = new ConstructorExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1208);
				((ConstructorExpressionContext)_localctx).exp = constructor_expression();
				}
				break;
			case 8:
				{
				_localctx = new MinusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1209);
				match(MINUS);
				setState(1210);
				((MinusExpressionContext)_localctx).exp = expression(45);
				}
				break;
			case 9:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1211);
				match(NOT);
				setState(1212);
				((NotExpressionContext)_localctx).exp = expression(44);
				}
				break;
			case 10:
				{
				_localctx = new CodeExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1213);
				match(CODE);
				setState(1214);
				match(COLON);
				setState(1215);
				((CodeExpressionContext)_localctx).exp = expression(15);
				}
				break;
			case 11:
				{
				_localctx = new ExecuteExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1216);
				match(EXECUTE);
				setState(1217);
				match(COLON);
				setState(1218);
				((ExecuteExpressionContext)_localctx).name = variable_identifier();
				}
				break;
			case 12:
				{
				_localctx = new ClosureExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1219);
				match(METHOD_COLON);
				setState(1220);
				((ClosureExpressionContext)_localctx).name = method_identifier();
				}
				break;
			case 13:
				{
				_localctx = new BlobExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1221);
				((BlobExpressionContext)_localctx).exp = blob_expression();
				}
				break;
			case 14:
				{
				_localctx = new DocumentExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1222);
				((DocumentExpressionContext)_localctx).exp = document_expression();
				}
				break;
			case 15:
				{
				_localctx = new MutableInstanceExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1223);
				((MutableInstanceExpressionContext)_localctx).exp = mutable_instance_expression(0);
				}
				break;
			case 16:
				{
				_localctx = new FetchExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1224);
				((FetchExpressionContext)_localctx).exp = fetch_expression();
				}
				break;
			case 17:
				{
				_localctx = new ReadBlobExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1225);
				((ReadBlobExpressionContext)_localctx).exp = read_blob_expression();
				}
				break;
			case 18:
				{
				_localctx = new ReadAllExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1226);
				((ReadAllExpressionContext)_localctx).exp = read_all_expression();
				}
				break;
			case 19:
				{
				_localctx = new ReadOneExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1227);
				((ReadOneExpressionContext)_localctx).exp = read_one_expression();
				}
				break;
			case 20:
				{
				_localctx = new SortedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1228);
				((SortedExpressionContext)_localctx).exp = sorted_expression();
				}
				break;
			case 21:
				{
				_localctx = new AmbiguousExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1229);
				((AmbiguousExpressionContext)_localctx).exp = ambiguous_expression();
				}
				break;
			case 22:
				{
				_localctx = new InvocationExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1230);
				((InvocationExpressionContext)_localctx).exp = invocation_expression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1348);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1346);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplyExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((MultiplyExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1233);
						if (!(precpred(_ctx, 43))) throw new FailedPredicateException(this, "precpred(_ctx, 43)");
						setState(1234);
						multiply();
						setState(1235);
						((MultiplyExpressionContext)_localctx).right = expression(44);
						}
						break;
					case 2:
						{
						_localctx = new DivideExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((DivideExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1237);
						if (!(precpred(_ctx, 42))) throw new FailedPredicateException(this, "precpred(_ctx, 42)");
						setState(1238);
						divide();
						setState(1239);
						((DivideExpressionContext)_localctx).right = expression(43);
						}
						break;
					case 3:
						{
						_localctx = new ModuloExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ModuloExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1241);
						if (!(precpred(_ctx, 41))) throw new FailedPredicateException(this, "precpred(_ctx, 41)");
						setState(1242);
						modulo();
						setState(1243);
						((ModuloExpressionContext)_localctx).right = expression(42);
						}
						break;
					case 4:
						{
						_localctx = new IntDivideExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((IntDivideExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1245);
						if (!(precpred(_ctx, 40))) throw new FailedPredicateException(this, "precpred(_ctx, 40)");
						setState(1246);
						idivide();
						setState(1247);
						((IntDivideExpressionContext)_localctx).right = expression(41);
						}
						break;
					case 5:
						{
						_localctx = new AddExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((AddExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1249);
						if (!(precpred(_ctx, 39))) throw new FailedPredicateException(this, "precpred(_ctx, 39)");
						setState(1250);
						((AddExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((AddExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1251);
						((AddExpressionContext)_localctx).right = expression(40);
						}
						break;
					case 6:
						{
						_localctx = new LessThanExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((LessThanExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1252);
						if (!(precpred(_ctx, 37))) throw new FailedPredicateException(this, "precpred(_ctx, 37)");
						setState(1253);
						match(LT);
						setState(1254);
						((LessThanExpressionContext)_localctx).right = expression(38);
						}
						break;
					case 7:
						{
						_localctx = new LessThanOrEqualExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((LessThanOrEqualExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1255);
						if (!(precpred(_ctx, 36))) throw new FailedPredicateException(this, "precpred(_ctx, 36)");
						setState(1256);
						match(LTE);
						setState(1257);
						((LessThanOrEqualExpressionContext)_localctx).right = expression(37);
						}
						break;
					case 8:
						{
						_localctx = new GreaterThanExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((GreaterThanExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1258);
						if (!(precpred(_ctx, 35))) throw new FailedPredicateException(this, "precpred(_ctx, 35)");
						setState(1259);
						match(GT);
						setState(1260);
						((GreaterThanExpressionContext)_localctx).right = expression(36);
						}
						break;
					case 9:
						{
						_localctx = new GreaterThanOrEqualExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((GreaterThanOrEqualExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1261);
						if (!(precpred(_ctx, 34))) throw new FailedPredicateException(this, "precpred(_ctx, 34)");
						setState(1262);
						match(GTE);
						setState(1263);
						((GreaterThanOrEqualExpressionContext)_localctx).right = expression(35);
						}
						break;
					case 10:
						{
						_localctx = new EqualsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((EqualsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1264);
						if (!(precpred(_ctx, 31))) throw new FailedPredicateException(this, "precpred(_ctx, 31)");
						setState(1265);
						match(EQ);
						setState(1266);
						((EqualsExpressionContext)_localctx).right = expression(32);
						}
						break;
					case 11:
						{
						_localctx = new NotEqualsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((NotEqualsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1267);
						if (!(precpred(_ctx, 30))) throw new FailedPredicateException(this, "precpred(_ctx, 30)");
						setState(1268);
						match(LTGT);
						setState(1269);
						((NotEqualsExpressionContext)_localctx).right = expression(31);
						}
						break;
					case 12:
						{
						_localctx = new RoughlyEqualsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((RoughlyEqualsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1270);
						if (!(precpred(_ctx, 29))) throw new FailedPredicateException(this, "precpred(_ctx, 29)");
						setState(1271);
						match(TILDE);
						setState(1272);
						((RoughlyEqualsExpressionContext)_localctx).right = expression(30);
						}
						break;
					case 13:
						{
						_localctx = new ContainsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ContainsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1273);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(1274);
						match(CONTAINS);
						setState(1275);
						((ContainsExpressionContext)_localctx).right = expression(29);
						}
						break;
					case 14:
						{
						_localctx = new InExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((InExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1276);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(1277);
						match(IN);
						setState(1278);
						((InExpressionContext)_localctx).right = expression(28);
						}
						break;
					case 15:
						{
						_localctx = new HasExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((HasExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1279);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(1280);
						match(HAS);
						setState(1281);
						((HasExpressionContext)_localctx).right = expression(27);
						}
						break;
					case 16:
						{
						_localctx = new HasAllExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((HasAllExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1282);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(1283);
						match(HAS);
						setState(1284);
						match(ALL);
						setState(1285);
						((HasAllExpressionContext)_localctx).right = expression(26);
						}
						break;
					case 17:
						{
						_localctx = new HasAnyExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((HasAnyExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1286);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(1287);
						match(HAS);
						setState(1288);
						match(ANY);
						setState(1289);
						((HasAnyExpressionContext)_localctx).right = expression(25);
						}
						break;
					case 18:
						{
						_localctx = new NotContainsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((NotContainsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1290);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(1291);
						match(NOT);
						setState(1292);
						match(CONTAINS);
						setState(1293);
						((NotContainsExpressionContext)_localctx).right = expression(24);
						}
						break;
					case 19:
						{
						_localctx = new NotInExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((NotInExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1294);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(1295);
						match(NOT);
						setState(1296);
						match(IN);
						setState(1297);
						((NotInExpressionContext)_localctx).right = expression(23);
						}
						break;
					case 20:
						{
						_localctx = new NotHasExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((NotHasExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1298);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1299);
						match(NOT);
						setState(1300);
						match(HAS);
						setState(1301);
						((NotHasExpressionContext)_localctx).right = expression(22);
						}
						break;
					case 21:
						{
						_localctx = new NotHasAllExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((NotHasAllExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1302);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1303);
						match(NOT);
						setState(1304);
						match(HAS);
						setState(1305);
						match(ALL);
						setState(1306);
						((NotHasAllExpressionContext)_localctx).right = expression(21);
						}
						break;
					case 22:
						{
						_localctx = new NotHasAnyExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((NotHasAnyExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1307);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1308);
						match(NOT);
						setState(1309);
						match(HAS);
						setState(1310);
						match(ANY);
						setState(1311);
						((NotHasAnyExpressionContext)_localctx).right = expression(20);
						}
						break;
					case 23:
						{
						_localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((OrExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1312);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1313);
						match(OR);
						setState(1314);
						((OrExpressionContext)_localctx).right = expression(19);
						}
						break;
					case 24:
						{
						_localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((AndExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1315);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1316);
						match(AND);
						setState(1317);
						((AndExpressionContext)_localctx).right = expression(18);
						}
						break;
					case 25:
						{
						_localctx = new TernaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((TernaryExpressionContext)_localctx).ifTrue = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1318);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1319);
						match(IF);
						setState(1320);
						((TernaryExpressionContext)_localctx).test = expression(0);
						setState(1321);
						match(ELSE);
						setState(1322);
						((TernaryExpressionContext)_localctx).ifFalse = expression(17);
						}
						break;
					case 26:
						{
						_localctx = new IteratorExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((IteratorExpressionContext)_localctx).exp = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1324);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1325);
						match(FOR);
						setState(1326);
						match(EACH);
						setState(1327);
						((IteratorExpressionContext)_localctx).name = variable_identifier();
						setState(1328);
						match(IN);
						setState(1329);
						((IteratorExpressionContext)_localctx).source = expression(2);
						}
						break;
					case 27:
						{
						_localctx = new CastExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((CastExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1331);
						if (!(precpred(_ctx, 38))) throw new FailedPredicateException(this, "precpred(_ctx, 38)");
						setState(1332);
						match(AS);
						setState(1334);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==MUTABLE) {
							{
							setState(1333);
							match(MUTABLE);
							}
						}

						setState(1336);
						((CastExpressionContext)_localctx).right = category_or_any_type();
						}
						break;
					case 28:
						{
						_localctx = new IsNotExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((IsNotExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1337);
						if (!(precpred(_ctx, 33))) throw new FailedPredicateException(this, "precpred(_ctx, 33)");
						setState(1338);
						match(IS);
						setState(1339);
						match(NOT);
						setState(1340);
						((IsNotExpressionContext)_localctx).right = is_expression();
						}
						break;
					case 29:
						{
						_localctx = new IsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((IsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1341);
						if (!(precpred(_ctx, 32))) throw new FailedPredicateException(this, "precpred(_ctx, 32)");
						setState(1342);
						match(IS);
						setState(1343);
						((IsExpressionContext)_localctx).right = is_expression();
						}
						break;
					case 30:
						{
						_localctx = new FilteredListExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((FilteredListExpressionContext)_localctx).src = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1344);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1345);
						filtered_list_suffix();
						}
						break;
					}
					} 
				}
				setState(1350);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Unresolved_expressionContext extends ParserRuleContext {
		public Unresolved_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unresolved_expression; }
	 
		public Unresolved_expressionContext() { }
		public void copyFrom(Unresolved_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnresolvedSelectorContext extends Unresolved_expressionContext {
		public Unresolved_expressionContext parent;
		public Unresolved_selectorContext selector;
		public Unresolved_expressionContext unresolved_expression() {
			return getRuleContext(Unresolved_expressionContext.class,0);
		}
		public Unresolved_selectorContext unresolved_selector() {
			return getRuleContext(Unresolved_selectorContext.class,0);
		}
		public UnresolvedSelectorContext(Unresolved_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterUnresolvedSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitUnresolvedSelector(this);
		}
	}
	public static class UnresolvedIdentifierContext extends Unresolved_expressionContext {
		public IdentifierContext name;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UnresolvedIdentifierContext(Unresolved_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterUnresolvedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitUnresolvedIdentifier(this);
		}
	}

	public final Unresolved_expressionContext unresolved_expression() throws RecognitionException {
		return unresolved_expression(0);
	}

	private Unresolved_expressionContext unresolved_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Unresolved_expressionContext _localctx = new Unresolved_expressionContext(_ctx, _parentState);
		Unresolved_expressionContext _prevctx = _localctx;
		int _startState = 92;
		enterRecursionRule(_localctx, 92, RULE_unresolved_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new UnresolvedIdentifierContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1352);
			((UnresolvedIdentifierContext)_localctx).name = identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(1358);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new UnresolvedSelectorContext(new Unresolved_expressionContext(_parentctx, _parentState));
					((UnresolvedSelectorContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_unresolved_expression);
					setState(1354);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1355);
					((UnresolvedSelectorContext)_localctx).selector = unresolved_selector();
					}
					} 
				}
				setState(1360);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Unresolved_selectorContext extends ParserRuleContext {
		public IdentifierContext name;
		public TerminalNode DOT() { return getToken(EParser.DOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Unresolved_selectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unresolved_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterUnresolved_selector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitUnresolved_selector(this);
		}
	}

	public final Unresolved_selectorContext unresolved_selector() throws RecognitionException {
		Unresolved_selectorContext _localctx = new Unresolved_selectorContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_unresolved_selector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1361);
			if (!(this.wasNot(EParser.WS))) throw new FailedPredicateException(this, "$parser.wasNot(EParser.WS)");
			setState(1362);
			match(DOT);
			setState(1363);
			((Unresolved_selectorContext)_localctx).name = identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Invocation_expressionContext extends ParserRuleContext {
		public Variable_identifierContext name;
		public TerminalNode INVOKE_COLON() { return getToken(EParser.INVOKE_COLON, 0); }
		public Invocation_trailerContext invocation_trailer() {
			return getRuleContext(Invocation_trailerContext.class,0);
		}
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public Invocation_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invocation_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterInvocation_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitInvocation_expression(this);
		}
	}

	public final Invocation_expressionContext invocation_expression() throws RecognitionException {
		Invocation_expressionContext _localctx = new Invocation_expressionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_invocation_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1365);
			match(INVOKE_COLON);
			setState(1366);
			((Invocation_expressionContext)_localctx).name = variable_identifier();
			setState(1367);
			invocation_trailer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Invocation_trailerContext extends ParserRuleContext {
		public Invocation_trailerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invocation_trailer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterInvocation_trailer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitInvocation_trailer(this);
		}
	}

	public final Invocation_trailerContext invocation_trailer() throws RecognitionException {
		Invocation_trailerContext _localctx = new Invocation_trailerContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_invocation_trailer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1369);
			if (!(this.willBe(EParser.LF))) throw new FailedPredicateException(this, "$parser.willBe(EParser.LF)");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Selectable_expressionContext extends ParserRuleContext {
		public Selectable_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectable_expression; }
	 
		public Selectable_expressionContext() { }
		public void copyFrom(Selectable_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ThisExpressionContext extends Selectable_expressionContext {
		public This_expressionContext exp;
		public This_expressionContext this_expression() {
			return getRuleContext(This_expressionContext.class,0);
		}
		public ThisExpressionContext(Selectable_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterThisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitThisExpression(this);
		}
	}
	public static class ParenthesisExpressionContext extends Selectable_expressionContext {
		public Parenthesis_expressionContext exp;
		public Parenthesis_expressionContext parenthesis_expression() {
			return getRuleContext(Parenthesis_expressionContext.class,0);
		}
		public ParenthesisExpressionContext(Selectable_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterParenthesisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitParenthesisExpression(this);
		}
	}
	public static class LiteralExpressionContext extends Selectable_expressionContext {
		public Literal_expressionContext exp;
		public Literal_expressionContext literal_expression() {
			return getRuleContext(Literal_expressionContext.class,0);
		}
		public LiteralExpressionContext(Selectable_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitLiteralExpression(this);
		}
	}
	public static class SuperExpressionContext extends Selectable_expressionContext {
		public Super_expressionContext exp;
		public Super_expressionContext super_expression() {
			return getRuleContext(Super_expressionContext.class,0);
		}
		public SuperExpressionContext(Selectable_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterSuperExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitSuperExpression(this);
		}
	}
	public static class IdentifierExpressionContext extends Selectable_expressionContext {
		public IdentifierContext exp;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdentifierExpressionContext(Selectable_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitIdentifierExpression(this);
		}
	}

	public final Selectable_expressionContext selectable_expression() throws RecognitionException {
		Selectable_expressionContext _localctx = new Selectable_expressionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_selectable_expression);
		try {
			setState(1376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				_localctx = new ParenthesisExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1371);
				((ParenthesisExpressionContext)_localctx).exp = parenthesis_expression();
				}
				break;
			case 2:
				_localctx = new LiteralExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1372);
				((LiteralExpressionContext)_localctx).exp = literal_expression();
				}
				break;
			case 3:
				_localctx = new IdentifierExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1373);
				((IdentifierExpressionContext)_localctx).exp = identifier();
				}
				break;
			case 4:
				_localctx = new ThisExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1374);
				((ThisExpressionContext)_localctx).exp = this_expression();
				}
				break;
			case 5:
				_localctx = new SuperExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1375);
				((SuperExpressionContext)_localctx).exp = super_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Instance_expressionContext extends ParserRuleContext {
		public Instance_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instance_expression; }
	 
		public Instance_expressionContext() { }
		public void copyFrom(Instance_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SelectorExpressionContext extends Instance_expressionContext {
		public Instance_expressionContext parent;
		public Instance_selectorContext selector;
		public Instance_expressionContext instance_expression() {
			return getRuleContext(Instance_expressionContext.class,0);
		}
		public Instance_selectorContext instance_selector() {
			return getRuleContext(Instance_selectorContext.class,0);
		}
		public SelectorExpressionContext(Instance_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterSelectorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitSelectorExpression(this);
		}
	}
	public static class SelectableExpressionContext extends Instance_expressionContext {
		public Selectable_expressionContext parent;
		public Selectable_expressionContext selectable_expression() {
			return getRuleContext(Selectable_expressionContext.class,0);
		}
		public SelectableExpressionContext(Instance_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterSelectableExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitSelectableExpression(this);
		}
	}

	public final Instance_expressionContext instance_expression() throws RecognitionException {
		return instance_expression(0);
	}

	private Instance_expressionContext instance_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Instance_expressionContext _localctx = new Instance_expressionContext(_ctx, _parentState);
		Instance_expressionContext _prevctx = _localctx;
		int _startState = 102;
		enterRecursionRule(_localctx, 102, RULE_instance_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SelectableExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1379);
			((SelectableExpressionContext)_localctx).parent = selectable_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(1385);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SelectorExpressionContext(new Instance_expressionContext(_parentctx, _parentState));
					((SelectorExpressionContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_instance_expression);
					setState(1381);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1382);
					((SelectorExpressionContext)_localctx).selector = instance_selector();
					}
					} 
				}
				setState(1387);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Instance_selectorContext extends ParserRuleContext {
		public Instance_selectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instance_selector; }
	 
		public Instance_selectorContext() { }
		public void copyFrom(Instance_selectorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SliceSelectorContext extends Instance_selectorContext {
		public Slice_argumentsContext xslice;
		public TerminalNode LBRAK() { return getToken(EParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(EParser.RBRAK, 0); }
		public Slice_argumentsContext slice_arguments() {
			return getRuleContext(Slice_argumentsContext.class,0);
		}
		public SliceSelectorContext(Instance_selectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterSliceSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitSliceSelector(this);
		}
	}
	public static class MemberSelectorContext extends Instance_selectorContext {
		public Member_identifierContext name;
		public TerminalNode DOT() { return getToken(EParser.DOT, 0); }
		public Member_identifierContext member_identifier() {
			return getRuleContext(Member_identifierContext.class,0);
		}
		public MemberSelectorContext(Instance_selectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterMemberSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitMemberSelector(this);
		}
	}
	public static class ItemSelectorContext extends Instance_selectorContext {
		public ExpressionContext exp;
		public TerminalNode LBRAK() { return getToken(EParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(EParser.RBRAK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ItemSelectorContext(Instance_selectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterItemSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitItemSelector(this);
		}
	}

	public final Instance_selectorContext instance_selector() throws RecognitionException {
		Instance_selectorContext _localctx = new Instance_selectorContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_instance_selector);
		try {
			setState(1401);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				_localctx = new MemberSelectorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1388);
				if (!(this.wasNot(EParser.WS))) throw new FailedPredicateException(this, "$parser.wasNot(EParser.WS)");
				setState(1389);
				match(DOT);
				setState(1390);
				((MemberSelectorContext)_localctx).name = member_identifier();
				}
				break;
			case 2:
				_localctx = new SliceSelectorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1391);
				if (!(this.wasNot(EParser.WS))) throw new FailedPredicateException(this, "$parser.wasNot(EParser.WS)");
				setState(1392);
				match(LBRAK);
				setState(1393);
				((SliceSelectorContext)_localctx).xslice = slice_arguments();
				setState(1394);
				match(RBRAK);
				}
				break;
			case 3:
				_localctx = new ItemSelectorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1396);
				if (!(this.wasNot(EParser.WS))) throw new FailedPredicateException(this, "$parser.wasNot(EParser.WS)");
				setState(1397);
				match(LBRAK);
				setState(1398);
				((ItemSelectorContext)_localctx).exp = expression(0);
				setState(1399);
				match(RBRAK);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mutable_instance_expressionContext extends ParserRuleContext {
		public Mutable_instance_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mutable_instance_expression; }
	 
		public Mutable_instance_expressionContext() { }
		public void copyFrom(Mutable_instance_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MutableSelectableExpressionContext extends Mutable_instance_expressionContext {
		public IdentifierContext exp;
		public TerminalNode MUTABLE() { return getToken(EParser.MUTABLE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MutableSelectableExpressionContext(Mutable_instance_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterMutableSelectableExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitMutableSelectableExpression(this);
		}
	}
	public static class MutableSelectorExpressionContext extends Mutable_instance_expressionContext {
		public Mutable_instance_expressionContext parent;
		public Instance_selectorContext selector;
		public Mutable_instance_expressionContext mutable_instance_expression() {
			return getRuleContext(Mutable_instance_expressionContext.class,0);
		}
		public Instance_selectorContext instance_selector() {
			return getRuleContext(Instance_selectorContext.class,0);
		}
		public MutableSelectorExpressionContext(Mutable_instance_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterMutableSelectorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitMutableSelectorExpression(this);
		}
	}

	public final Mutable_instance_expressionContext mutable_instance_expression() throws RecognitionException {
		return mutable_instance_expression(0);
	}

	private Mutable_instance_expressionContext mutable_instance_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Mutable_instance_expressionContext _localctx = new Mutable_instance_expressionContext(_ctx, _parentState);
		Mutable_instance_expressionContext _prevctx = _localctx;
		int _startState = 106;
		enterRecursionRule(_localctx, 106, RULE_mutable_instance_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new MutableSelectableExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1404);
			match(MUTABLE);
			setState(1405);
			((MutableSelectableExpressionContext)_localctx).exp = identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(1411);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MutableSelectorExpressionContext(new Mutable_instance_expressionContext(_parentctx, _parentState));
					((MutableSelectorExpressionContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_mutable_instance_expression);
					setState(1407);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1408);
					((MutableSelectorExpressionContext)_localctx).selector = instance_selector();
					}
					} 
				}
				setState(1413);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Document_expressionContext extends ParserRuleContext {
		public ExpressionContext exp;
		public TerminalNode DOCUMENT() { return getToken(EParser.DOCUMENT, 0); }
		public TerminalNode FROM() { return getToken(EParser.FROM, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Document_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterDocument_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitDocument_expression(this);
		}
	}

	public final Document_expressionContext document_expression() throws RecognitionException {
		Document_expressionContext _localctx = new Document_expressionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_document_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1414);
			match(DOCUMENT);
			setState(1417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(1415);
				match(FROM);
				setState(1416);
				((Document_expressionContext)_localctx).exp = expression(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Blob_expressionContext extends ParserRuleContext {
		public TerminalNode BLOB() { return getToken(EParser.BLOB, 0); }
		public TerminalNode FROM() { return getToken(EParser.FROM, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Blob_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blob_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterBlob_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitBlob_expression(this);
		}
	}

	public final Blob_expressionContext blob_expression() throws RecognitionException {
		Blob_expressionContext _localctx = new Blob_expressionContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_blob_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1419);
			match(BLOB);
			setState(1420);
			match(FROM);
			setState(1421);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constructor_expressionContext extends ParserRuleContext {
		public Constructor_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor_expression; }
	 
		public Constructor_expressionContext() { }
		public void copyFrom(Constructor_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConstructorFromContext extends Constructor_expressionContext {
		public Mutable_category_typeContext typ;
		public ExpressionContext copyExp;
		public With_argument_assignment_listContext args;
		public Argument_assignmentContext arg;
		public TerminalNode FROM() { return getToken(EParser.FROM, 0); }
		public Mutable_category_typeContext mutable_category_type() {
			return getRuleContext(Mutable_category_typeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public With_argument_assignment_listContext with_argument_assignment_list() {
			return getRuleContext(With_argument_assignment_listContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(EParser.COMMA, 0); }
		public TerminalNode AND() { return getToken(EParser.AND, 0); }
		public Argument_assignmentContext argument_assignment() {
			return getRuleContext(Argument_assignmentContext.class,0);
		}
		public ConstructorFromContext(Constructor_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterConstructorFrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitConstructorFrom(this);
		}
	}
	public static class ConstructorNoFromContext extends Constructor_expressionContext {
		public Mutable_category_typeContext typ;
		public With_argument_assignment_listContext args;
		public Argument_assignmentContext arg;
		public Mutable_category_typeContext mutable_category_type() {
			return getRuleContext(Mutable_category_typeContext.class,0);
		}
		public With_argument_assignment_listContext with_argument_assignment_list() {
			return getRuleContext(With_argument_assignment_listContext.class,0);
		}
		public TerminalNode AND() { return getToken(EParser.AND, 0); }
		public Argument_assignmentContext argument_assignment() {
			return getRuleContext(Argument_assignmentContext.class,0);
		}
		public ConstructorNoFromContext(Constructor_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterConstructorNoFrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitConstructorNoFrom(this);
		}
	}

	public final Constructor_expressionContext constructor_expression() throws RecognitionException {
		Constructor_expressionContext _localctx = new Constructor_expressionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_constructor_expression);
		int _la;
		try {
			setState(1444);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				_localctx = new ConstructorFromContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1423);
				((ConstructorFromContext)_localctx).typ = mutable_category_type();
				setState(1424);
				match(FROM);
				setState(1425);
				((ConstructorFromContext)_localctx).copyExp = expression(0);
				setState(1434);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					{
					setState(1427);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(1426);
						match(COMMA);
						}
					}

					setState(1429);
					((ConstructorFromContext)_localctx).args = with_argument_assignment_list(0);
					setState(1432);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
					case 1:
						{
						setState(1430);
						match(AND);
						setState(1431);
						((ConstructorFromContext)_localctx).arg = argument_assignment();
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new ConstructorNoFromContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1436);
				((ConstructorNoFromContext)_localctx).typ = mutable_category_type();
				setState(1442);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
				case 1:
					{
					setState(1437);
					((ConstructorNoFromContext)_localctx).args = with_argument_assignment_list(0);
					setState(1440);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
					case 1:
						{
						setState(1438);
						match(AND);
						setState(1439);
						((ConstructorNoFromContext)_localctx).arg = argument_assignment();
						}
						break;
					}
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Write_statementContext extends ParserRuleContext {
		public ExpressionContext what;
		public ExpressionContext target;
		public TerminalNode WRITE() { return getToken(EParser.WRITE, 0); }
		public TerminalNode TO() { return getToken(EParser.TO, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Write_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterWrite_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitWrite_statement(this);
		}
	}

	public final Write_statementContext write_statement() throws RecognitionException {
		Write_statementContext _localctx = new Write_statementContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_write_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1446);
			match(WRITE);
			setState(1447);
			((Write_statementContext)_localctx).what = expression(0);
			setState(1448);
			match(TO);
			setState(1449);
			((Write_statementContext)_localctx).target = expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ambiguous_expressionContext extends ParserRuleContext {
		public Unresolved_expressionContext method;
		public ExpressionContext exp;
		public TerminalNode MINUS() { return getToken(EParser.MINUS, 0); }
		public Unresolved_expressionContext unresolved_expression() {
			return getRuleContext(Unresolved_expressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Ambiguous_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ambiguous_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterAmbiguous_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitAmbiguous_expression(this);
		}
	}

	public final Ambiguous_expressionContext ambiguous_expression() throws RecognitionException {
		Ambiguous_expressionContext _localctx = new Ambiguous_expressionContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_ambiguous_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1451);
			((Ambiguous_expressionContext)_localctx).method = unresolved_expression(0);
			setState(1452);
			match(MINUS);
			setState(1453);
			((Ambiguous_expressionContext)_localctx).exp = expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Filtered_list_suffixContext extends ParserRuleContext {
		public Variable_identifierContext name;
		public ExpressionContext predicate;
		public TerminalNode FILTERED() { return getToken(EParser.FILTERED, 0); }
		public TerminalNode WHERE() { return getToken(EParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode WITH() { return getToken(EParser.WITH, 0); }
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public Filtered_list_suffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filtered_list_suffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterFiltered_list_suffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitFiltered_list_suffix(this);
		}
	}

	public final Filtered_list_suffixContext filtered_list_suffix() throws RecognitionException {
		Filtered_list_suffixContext _localctx = new Filtered_list_suffixContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_filtered_list_suffix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1455);
			match(FILTERED);
			setState(1458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1456);
				match(WITH);
				setState(1457);
				((Filtered_list_suffixContext)_localctx).name = variable_identifier();
				}
			}

			setState(1460);
			match(WHERE);
			setState(1461);
			((Filtered_list_suffixContext)_localctx).predicate = expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fetch_expressionContext extends ParserRuleContext {
		public Fetch_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fetch_expression; }
	 
		public Fetch_expressionContext() { }
		public void copyFrom(Fetch_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FetchOneContext extends Fetch_expressionContext {
		public Mutable_category_typeContext typ;
		public ExpressionContext predicate;
		public TerminalNode FETCH() { return getToken(EParser.FETCH, 0); }
		public TerminalNode ONE() { return getToken(EParser.ONE, 0); }
		public TerminalNode WHERE() { return getToken(EParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Mutable_category_typeContext mutable_category_type() {
			return getRuleContext(Mutable_category_typeContext.class,0);
		}
		public FetchOneContext(Fetch_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterFetchOne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitFetchOne(this);
		}
	}
	public static class FetchManyContext extends Fetch_expressionContext {
		public Mutable_category_typeContext typ;
		public ExpressionContext xstart;
		public ExpressionContext xstop;
		public ExpressionContext predicate;
		public Order_by_listContext orderby;
		public TerminalNode FETCH() { return getToken(EParser.FETCH, 0); }
		public TerminalNode WHERE() { return getToken(EParser.WHERE, 0); }
		public TerminalNode ORDER() { return getToken(EParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(EParser.BY, 0); }
		public TerminalNode ALL() { return getToken(EParser.ALL, 0); }
		public TerminalNode TO() { return getToken(EParser.TO, 0); }
		public TerminalNode ROWS() { return getToken(EParser.ROWS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Order_by_listContext order_by_list() {
			return getRuleContext(Order_by_listContext.class,0);
		}
		public Mutable_category_typeContext mutable_category_type() {
			return getRuleContext(Mutable_category_typeContext.class,0);
		}
		public FetchManyContext(Fetch_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterFetchMany(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitFetchMany(this);
		}
	}

	public final Fetch_expressionContext fetch_expression() throws RecognitionException {
		Fetch_expressionContext _localctx = new Fetch_expressionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_fetch_expression);
		int _la;
		try {
			setState(1499);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				_localctx = new FetchOneContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1463);
				match(FETCH);
				setState(1464);
				match(ONE);
				{
				setState(1466);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MUTABLE || _la==TYPE_IDENTIFIER) {
					{
					setState(1465);
					((FetchOneContext)_localctx).typ = mutable_category_type();
					}
				}

				}
				setState(1468);
				match(WHERE);
				setState(1469);
				((FetchOneContext)_localctx).predicate = expression(0);
				}
				break;
			case 2:
				_localctx = new FetchManyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1470);
				match(FETCH);
				setState(1488);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ALL:
					{
					{
					setState(1471);
					match(ALL);
					setState(1473);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
					case 1:
						{
						setState(1472);
						((FetchManyContext)_localctx).typ = mutable_category_type();
						}
						break;
					}
					}
					}
					break;
				case MUTABLE:
				case TYPE_IDENTIFIER:
					{
					{
					setState(1475);
					((FetchManyContext)_localctx).typ = mutable_category_type();
					setState(1477);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ROWS) {
						{
						setState(1476);
						match(ROWS);
						}
					}

					setState(1479);
					((FetchManyContext)_localctx).xstart = expression(0);
					setState(1480);
					match(TO);
					setState(1481);
					((FetchManyContext)_localctx).xstop = expression(0);
					}
					}
					break;
				case ROWS:
					{
					{
					setState(1483);
					match(ROWS);
					setState(1484);
					((FetchManyContext)_localctx).xstart = expression(0);
					setState(1485);
					match(TO);
					setState(1486);
					((FetchManyContext)_localctx).xstop = expression(0);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1492);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(1490);
					match(WHERE);
					setState(1491);
					((FetchManyContext)_localctx).predicate = expression(0);
					}
					break;
				}
				setState(1497);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(1494);
					match(ORDER);
					setState(1495);
					match(BY);
					setState(1496);
					((FetchManyContext)_localctx).orderby = order_by_list();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fetch_statementContext extends ParserRuleContext {
		public Fetch_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fetch_statement; }
	 
		public Fetch_statementContext() { }
		public void copyFrom(Fetch_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FetchManyAsyncContext extends Fetch_statementContext {
		public Mutable_category_typeContext typ;
		public ExpressionContext xstart;
		public ExpressionContext xstop;
		public ExpressionContext predicate;
		public Order_by_listContext orderby;
		public Variable_identifierContext name;
		public Statement_listContext stmts;
		public TerminalNode FETCH() { return getToken(EParser.FETCH, 0); }
		public TerminalNode THEN() { return getToken(EParser.THEN, 0); }
		public TerminalNode WITH() { return getToken(EParser.WITH, 0); }
		public TerminalNode COLON() { return getToken(EParser.COLON, 0); }
		public IndentContext indent() {
			return getRuleContext(IndentContext.class,0);
		}
		public DedentContext dedent() {
			return getRuleContext(DedentContext.class,0);
		}
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(EParser.WHERE, 0); }
		public TerminalNode ORDER() { return getToken(EParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(EParser.BY, 0); }
		public TerminalNode ALL() { return getToken(EParser.ALL, 0); }
		public TerminalNode TO() { return getToken(EParser.TO, 0); }
		public TerminalNode ROWS() { return getToken(EParser.ROWS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Order_by_listContext order_by_list() {
			return getRuleContext(Order_by_listContext.class,0);
		}
		public Mutable_category_typeContext mutable_category_type() {
			return getRuleContext(Mutable_category_typeContext.class,0);
		}
		public FetchManyAsyncContext(Fetch_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterFetchManyAsync(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitFetchManyAsync(this);
		}
	}
	public static class FetchOneAsyncContext extends Fetch_statementContext {
		public Mutable_category_typeContext typ;
		public ExpressionContext predicate;
		public Variable_identifierContext name;
		public Statement_listContext stmts;
		public TerminalNode FETCH() { return getToken(EParser.FETCH, 0); }
		public TerminalNode ONE() { return getToken(EParser.ONE, 0); }
		public TerminalNode WHERE() { return getToken(EParser.WHERE, 0); }
		public TerminalNode THEN() { return getToken(EParser.THEN, 0); }
		public TerminalNode WITH() { return getToken(EParser.WITH, 0); }
		public TerminalNode COLON() { return getToken(EParser.COLON, 0); }
		public IndentContext indent() {
			return getRuleContext(IndentContext.class,0);
		}
		public DedentContext dedent() {
			return getRuleContext(DedentContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public Mutable_category_typeContext mutable_category_type() {
			return getRuleContext(Mutable_category_typeContext.class,0);
		}
		public FetchOneAsyncContext(Fetch_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterFetchOneAsync(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitFetchOneAsync(this);
		}
	}

	public final Fetch_statementContext fetch_statement() throws RecognitionException {
		Fetch_statementContext _localctx = new Fetch_statementContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_fetch_statement);
		int _la;
		try {
			setState(1553);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				_localctx = new FetchOneAsyncContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1501);
				match(FETCH);
				setState(1502);
				match(ONE);
				{
				setState(1504);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MUTABLE || _la==TYPE_IDENTIFIER) {
					{
					setState(1503);
					((FetchOneAsyncContext)_localctx).typ = mutable_category_type();
					}
				}

				}
				setState(1506);
				match(WHERE);
				setState(1507);
				((FetchOneAsyncContext)_localctx).predicate = expression(0);
				setState(1508);
				match(THEN);
				setState(1509);
				match(WITH);
				setState(1510);
				((FetchOneAsyncContext)_localctx).name = variable_identifier();
				setState(1511);
				match(COLON);
				setState(1512);
				indent();
				setState(1513);
				((FetchOneAsyncContext)_localctx).stmts = statement_list();
				setState(1514);
				dedent();
				}
				break;
			case 2:
				_localctx = new FetchManyAsyncContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1516);
				match(FETCH);
				setState(1534);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ALL:
					{
					{
					setState(1517);
					match(ALL);
					setState(1519);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==MUTABLE || _la==TYPE_IDENTIFIER) {
						{
						setState(1518);
						((FetchManyAsyncContext)_localctx).typ = mutable_category_type();
						}
					}

					}
					}
					break;
				case MUTABLE:
				case TYPE_IDENTIFIER:
					{
					{
					setState(1521);
					((FetchManyAsyncContext)_localctx).typ = mutable_category_type();
					setState(1523);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ROWS) {
						{
						setState(1522);
						match(ROWS);
						}
					}

					setState(1525);
					((FetchManyAsyncContext)_localctx).xstart = expression(0);
					setState(1526);
					match(TO);
					setState(1527);
					((FetchManyAsyncContext)_localctx).xstop = expression(0);
					}
					}
					break;
				case ROWS:
					{
					{
					setState(1529);
					match(ROWS);
					setState(1530);
					((FetchManyAsyncContext)_localctx).xstart = expression(0);
					setState(1531);
					match(TO);
					setState(1532);
					((FetchManyAsyncContext)_localctx).xstop = expression(0);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1538);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(1536);
					match(WHERE);
					setState(1537);
					((FetchManyAsyncContext)_localctx).predicate = expression(0);
					}
				}

				setState(1543);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ORDER) {
					{
					setState(1540);
					match(ORDER);
					setState(1541);
					match(BY);
					setState(1542);
					((FetchManyAsyncContext)_localctx).orderby = order_by_list();
					}
				}

				setState(1545);
				match(THEN);
				setState(1546);
				match(WITH);
				setState(1547);
				((FetchManyAsyncContext)_localctx).name = variable_identifier();
				setState(1548);
				match(COLON);
				setState(1549);
				indent();
				setState(1550);
				((FetchManyAsyncContext)_localctx).stmts = statement_list();
				setState(1551);
				dedent();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Read_statementContext extends ParserRuleContext {
		public ExpressionContext source;
		public Variable_identifierContext name;
		public Statement_listContext stmts;
		public TerminalNode READ() { return getToken(EParser.READ, 0); }
		public TerminalNode ALL() { return getToken(EParser.ALL, 0); }
		public TerminalNode FROM() { return getToken(EParser.FROM, 0); }
		public TerminalNode THEN() { return getToken(EParser.THEN, 0); }
		public TerminalNode WITH() { return getToken(EParser.WITH, 0); }
		public TerminalNode COLON() { return getToken(EParser.COLON, 0); }
		public IndentContext indent() {
			return getRuleContext(IndentContext.class,0);
		}
		public DedentContext dedent() {
			return getRuleContext(DedentContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public Read_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterRead_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitRead_statement(this);
		}
	}

	public final Read_statementContext read_statement() throws RecognitionException {
		Read_statementContext _localctx = new Read_statementContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_read_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1555);
			match(READ);
			setState(1556);
			match(ALL);
			setState(1557);
			match(FROM);
			setState(1558);
			((Read_statementContext)_localctx).source = expression(0);
			setState(1559);
			match(THEN);
			setState(1560);
			match(WITH);
			setState(1561);
			((Read_statementContext)_localctx).name = variable_identifier();
			setState(1562);
			match(COLON);
			setState(1563);
			indent();
			setState(1564);
			((Read_statementContext)_localctx).stmts = statement_list();
			setState(1565);
			dedent();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sorted_expressionContext extends ParserRuleContext {
		public Instance_expressionContext source;
		public Sorted_keyContext key;
		public TerminalNode SORTED() { return getToken(EParser.SORTED, 0); }
		public Instance_expressionContext instance_expression() {
			return getRuleContext(Instance_expressionContext.class,0);
		}
		public TerminalNode DESC() { return getToken(EParser.DESC, 0); }
		public TerminalNode WITH() { return getToken(EParser.WITH, 0); }
		public TerminalNode AS() { return getToken(EParser.AS, 0); }
		public Key_tokenContext key_token() {
			return getRuleContext(Key_tokenContext.class,0);
		}
		public Sorted_keyContext sorted_key() {
			return getRuleContext(Sorted_keyContext.class,0);
		}
		public Sorted_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sorted_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterSorted_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitSorted_expression(this);
		}
	}

	public final Sorted_expressionContext sorted_expression() throws RecognitionException {
		Sorted_expressionContext _localctx = new Sorted_expressionContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_sorted_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1567);
			match(SORTED);
			setState(1569);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DESC) {
				{
				setState(1568);
				match(DESC);
				}
			}

			setState(1571);
			((Sorted_expressionContext)_localctx).source = instance_expression(0);
			setState(1577);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				{
				setState(1572);
				match(WITH);
				setState(1573);
				((Sorted_expressionContext)_localctx).key = sorted_key();
				setState(1574);
				match(AS);
				setState(1575);
				key_token();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Argument_assignment_listContext extends ParserRuleContext {
		public Argument_assignment_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_assignment_list; }
	 
		public Argument_assignment_listContext() { }
		public void copyFrom(Argument_assignment_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArgumentAssignmentListExpressionContext extends Argument_assignment_listContext {
		public ExpressionContext exp;
		public With_argument_assignment_listContext items;
		public Argument_assignmentContext item;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public With_argument_assignment_listContext with_argument_assignment_list() {
			return getRuleContext(With_argument_assignment_listContext.class,0);
		}
		public TerminalNode AND() { return getToken(EParser.AND, 0); }
		public Argument_assignmentContext argument_assignment() {
			return getRuleContext(Argument_assignmentContext.class,0);
		}
		public ArgumentAssignmentListExpressionContext(Argument_assignment_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterArgumentAssignmentListExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitArgumentAssignmentListExpression(this);
		}
	}
	public static class ArgumentAssignmentListNoExpressionContext extends Argument_assignment_listContext {
		public With_argument_assignment_listContext items;
		public Argument_assignmentContext item;
		public With_argument_assignment_listContext with_argument_assignment_list() {
			return getRuleContext(With_argument_assignment_listContext.class,0);
		}
		public TerminalNode AND() { return getToken(EParser.AND, 0); }
		public Argument_assignmentContext argument_assignment() {
			return getRuleContext(Argument_assignmentContext.class,0);
		}
		public ArgumentAssignmentListNoExpressionContext(Argument_assignment_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterArgumentAssignmentListNoExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitArgumentAssignmentListNoExpression(this);
		}
	}

	public final Argument_assignment_listContext argument_assignment_list() throws RecognitionException {
		Argument_assignment_listContext _localctx = new Argument_assignment_listContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_argument_assignment_list);
		try {
			setState(1593);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				_localctx = new ArgumentAssignmentListExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1579);
				if (!(this.was(EParser.WS))) throw new FailedPredicateException(this, "$parser.was(EParser.WS)");
				setState(1580);
				((ArgumentAssignmentListExpressionContext)_localctx).exp = expression(0);
				setState(1586);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					setState(1581);
					((ArgumentAssignmentListExpressionContext)_localctx).items = with_argument_assignment_list(0);
					setState(1584);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
					case 1:
						{
						setState(1582);
						match(AND);
						setState(1583);
						((ArgumentAssignmentListExpressionContext)_localctx).item = argument_assignment();
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new ArgumentAssignmentListNoExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1588);
				((ArgumentAssignmentListNoExpressionContext)_localctx).items = with_argument_assignment_list(0);
				setState(1591);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
				case 1:
					{
					setState(1589);
					match(AND);
					setState(1590);
					((ArgumentAssignmentListNoExpressionContext)_localctx).item = argument_assignment();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class With_argument_assignment_listContext extends ParserRuleContext {
		public With_argument_assignment_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_argument_assignment_list; }
	 
		public With_argument_assignment_listContext() { }
		public void copyFrom(With_argument_assignment_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArgumentAssignmentListContext extends With_argument_assignment_listContext {
		public Argument_assignmentContext item;
		public TerminalNode WITH() { return getToken(EParser.WITH, 0); }
		public Argument_assignmentContext argument_assignment() {
			return getRuleContext(Argument_assignmentContext.class,0);
		}
		public ArgumentAssignmentListContext(With_argument_assignment_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterArgumentAssignmentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitArgumentAssignmentList(this);
		}
	}
	public static class ArgumentAssignmentListItemContext extends With_argument_assignment_listContext {
		public With_argument_assignment_listContext items;
		public Argument_assignmentContext item;
		public TerminalNode COMMA() { return getToken(EParser.COMMA, 0); }
		public With_argument_assignment_listContext with_argument_assignment_list() {
			return getRuleContext(With_argument_assignment_listContext.class,0);
		}
		public Argument_assignmentContext argument_assignment() {
			return getRuleContext(Argument_assignmentContext.class,0);
		}
		public ArgumentAssignmentListItemContext(With_argument_assignment_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterArgumentAssignmentListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitArgumentAssignmentListItem(this);
		}
	}

	public final With_argument_assignment_listContext with_argument_assignment_list() throws RecognitionException {
		return with_argument_assignment_list(0);
	}

	private With_argument_assignment_listContext with_argument_assignment_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		With_argument_assignment_listContext _localctx = new With_argument_assignment_listContext(_ctx, _parentState);
		With_argument_assignment_listContext _prevctx = _localctx;
		int _startState = 130;
		enterRecursionRule(_localctx, 130, RULE_with_argument_assignment_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ArgumentAssignmentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1596);
			match(WITH);
			setState(1597);
			((ArgumentAssignmentListContext)_localctx).item = argument_assignment();
			}
			_ctx.stop = _input.LT(-1);
			setState(1604);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArgumentAssignmentListItemContext(new With_argument_assignment_listContext(_parentctx, _parentState));
					((ArgumentAssignmentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_with_argument_assignment_list);
					setState(1599);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1600);
					match(COMMA);
					setState(1601);
					((ArgumentAssignmentListItemContext)_localctx).item = argument_assignment();
					}
					} 
				}
				setState(1606);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Argument_assignmentContext extends ParserRuleContext {
		public ExpressionContext exp;
		public Variable_identifierContext name;
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(EParser.AS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Argument_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterArgument_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitArgument_assignment(this);
		}
	}

	public final Argument_assignmentContext argument_assignment() throws RecognitionException {
		Argument_assignmentContext _localctx = new Argument_assignmentContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_argument_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1610);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				{
				setState(1607);
				((Argument_assignmentContext)_localctx).exp = expression(0);
				setState(1608);
				match(AS);
				}
				break;
			}
			setState(1612);
			((Argument_assignmentContext)_localctx).name = variable_identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assign_instance_statementContext extends ParserRuleContext {
		public Assignable_instanceContext inst;
		public ExpressionContext exp;
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public Assignable_instanceContext assignable_instance() {
			return getRuleContext(Assignable_instanceContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Assign_instance_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_instance_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterAssign_instance_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitAssign_instance_statement(this);
		}
	}

	public final Assign_instance_statementContext assign_instance_statement() throws RecognitionException {
		Assign_instance_statementContext _localctx = new Assign_instance_statementContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_assign_instance_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1614);
			((Assign_instance_statementContext)_localctx).inst = assignable_instance(0);
			setState(1615);
			assign();
			setState(1616);
			((Assign_instance_statementContext)_localctx).exp = expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Child_instanceContext extends ParserRuleContext {
		public Child_instanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_child_instance; }
	 
		public Child_instanceContext() { }
		public void copyFrom(Child_instanceContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MemberInstanceContext extends Child_instanceContext {
		public Variable_identifierContext name;
		public TerminalNode DOT() { return getToken(EParser.DOT, 0); }
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public MemberInstanceContext(Child_instanceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterMemberInstance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitMemberInstance(this);
		}
	}
	public static class ItemInstanceContext extends Child_instanceContext {
		public ExpressionContext exp;
		public TerminalNode LBRAK() { return getToken(EParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(EParser.RBRAK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ItemInstanceContext(Child_instanceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterItemInstance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitItemInstance(this);
		}
	}

	public final Child_instanceContext child_instance() throws RecognitionException {
		Child_instanceContext _localctx = new Child_instanceContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_child_instance);
		try {
			setState(1626);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				_localctx = new MemberInstanceContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1618);
				if (!(this.wasNot(EParser.WS))) throw new FailedPredicateException(this, "$parser.wasNot(EParser.WS)");
				setState(1619);
				match(DOT);
				setState(1620);
				((MemberInstanceContext)_localctx).name = variable_identifier();
				}
				break;
			case 2:
				_localctx = new ItemInstanceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1621);
				if (!(this.wasNot(EParser.WS))) throw new FailedPredicateException(this, "$parser.wasNot(EParser.WS)");
				setState(1622);
				match(LBRAK);
				setState(1623);
				((ItemInstanceContext)_localctx).exp = expression(0);
				setState(1624);
				match(RBRAK);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assign_tuple_statementContext extends ParserRuleContext {
		public Variable_identifier_listContext items;
		public ExpressionContext exp;
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public Variable_identifier_listContext variable_identifier_list() {
			return getRuleContext(Variable_identifier_listContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Assign_tuple_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_tuple_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterAssign_tuple_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitAssign_tuple_statement(this);
		}
	}

	public final Assign_tuple_statementContext assign_tuple_statement() throws RecognitionException {
		Assign_tuple_statementContext _localctx = new Assign_tuple_statementContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_assign_tuple_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1628);
			((Assign_tuple_statementContext)_localctx).items = variable_identifier_list();
			setState(1629);
			assign();
			setState(1630);
			((Assign_tuple_statementContext)_localctx).exp = expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LfsContext extends ParserRuleContext {
		public List<TerminalNode> LF() { return getTokens(EParser.LF); }
		public TerminalNode LF(int i) {
			return getToken(EParser.LF, i);
		}
		public LfsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lfs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterLfs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitLfs(this);
		}
	}

	public final LfsContext lfs() throws RecognitionException {
		LfsContext _localctx = new LfsContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_lfs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1635);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1632);
					match(LF);
					}
					} 
				}
				setState(1637);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LfpContext extends ParserRuleContext {
		public List<TerminalNode> LF() { return getTokens(EParser.LF); }
		public TerminalNode LF(int i) {
			return getToken(EParser.LF, i);
		}
		public LfpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lfp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterLfp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitLfp(this);
		}
	}

	public final LfpContext lfp() throws RecognitionException {
		LfpContext _localctx = new LfpContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_lfp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1639); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1638);
				match(LF);
				}
				}
				setState(1641); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LF );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ws_plusContext extends ParserRuleContext {
		public List<TerminalNode> LF() { return getTokens(EParser.LF); }
		public TerminalNode LF(int i) {
			return getToken(EParser.LF, i);
		}
		public List<TerminalNode> TAB() { return getTokens(EParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(EParser.TAB, i);
		}
		public List<TerminalNode> WS() { return getTokens(EParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(EParser.WS, i);
		}
		public List<TerminalNode> INDENT() { return getTokens(EParser.INDENT); }
		public TerminalNode INDENT(int i) {
			return getToken(EParser.INDENT, i);
		}
		public Ws_plusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ws_plus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterWs_plus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitWs_plus(this);
		}
	}

	public final Ws_plusContext ws_plus() throws RecognitionException {
		Ws_plusContext _localctx = new Ws_plusContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_ws_plus);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1646);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1643);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INDENT) | (1L << LF) | (1L << TAB) | (1L << WS))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(1648);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndentContext extends ParserRuleContext {
		public TerminalNode INDENT() { return getToken(EParser.INDENT, 0); }
		public List<TerminalNode> LF() { return getTokens(EParser.LF); }
		public TerminalNode LF(int i) {
			return getToken(EParser.LF, i);
		}
		public IndentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterIndent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitIndent(this);
		}
	}

	public final IndentContext indent() throws RecognitionException {
		IndentContext _localctx = new IndentContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_indent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1650); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1649);
				match(LF);
				}
				}
				setState(1652); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LF );
			setState(1654);
			match(INDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DedentContext extends ParserRuleContext {
		public TerminalNode DEDENT() { return getToken(EParser.DEDENT, 0); }
		public List<TerminalNode> LF() { return getTokens(EParser.LF); }
		public TerminalNode LF(int i) {
			return getToken(EParser.LF, i);
		}
		public DedentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dedent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterDedent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitDedent(this);
		}
	}

	public final DedentContext dedent() throws RecognitionException {
		DedentContext _localctx = new DedentContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_dedent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1659);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LF) {
				{
				{
				setState(1656);
				match(LF);
				}
				}
				setState(1661);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1662);
			match(DEDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_literalContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(EParser.TYPE, 0); }
		public TerminalNode COLON() { return getToken(EParser.COLON, 0); }
		public Category_or_any_typeContext category_or_any_type() {
			return getRuleContext(Category_or_any_typeContext.class,0);
		}
		public Type_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterType_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitType_literal(this);
		}
	}

	public final Type_literalContext type_literal() throws RecognitionException {
		Type_literalContext _localctx = new Type_literalContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_type_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1664);
			match(TYPE);
			setState(1665);
			match(COLON);
			setState(1666);
			category_or_any_type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Null_literalContext extends ParserRuleContext {
		public TerminalNode NOTHING() { return getToken(EParser.NOTHING, 0); }
		public Null_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterNull_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitNull_literal(this);
		}
	}

	public final Null_literalContext null_literal() throws RecognitionException {
		Null_literalContext _localctx = new Null_literalContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_null_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1668);
			match(NOTHING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReplContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReplContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterRepl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitRepl(this);
		}
	}

	public final ReplContext repl() throws RecognitionException {
		ReplContext _localctx = new ReplContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_repl);
		try {
			setState(1673);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1670);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1671);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1672);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaration_listContext extends ParserRuleContext {
		public Declaration_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_list; }
	 
		public Declaration_listContext() { }
		public void copyFrom(Declaration_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FullDeclarationListContext extends Declaration_listContext {
		public LfsContext lfs() {
			return getRuleContext(LfsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(EParser.EOF, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public FullDeclarationListContext(Declaration_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterFullDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitFullDeclarationList(this);
		}
	}

	public final Declaration_listContext declaration_list() throws RecognitionException {
		Declaration_listContext _localctx = new Declaration_listContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_declaration_list);
		int _la;
		try {
			_localctx = new FullDeclarationListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1676);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT || _la==DEFINE || _la==ARONDBASE_IDENTIFIER) {
				{
				setState(1675);
				declarations();
				}
			}

			setState(1678);
			lfs();
			setState(1679);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationsContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<LfpContext> lfp() {
			return getRuleContexts(LfpContext.class);
		}
		public LfpContext lfp(int i) {
			return getRuleContext(LfpContext.class,i);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitDeclarations(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_declarations);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1681);
			declaration();
			setState(1687);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1682);
					lfp();
					setState(1683);
					declaration();
					}
					} 
				}
				setState(1689);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public Attribute_declarationContext attribute_declaration() {
			return getRuleContext(Attribute_declarationContext.class,0);
		}
		public Category_declarationContext category_declaration() {
			return getRuleContext(Category_declarationContext.class,0);
		}
		public Resource_declarationContext resource_declaration() {
			return getRuleContext(Resource_declarationContext.class,0);
		}
		public Enum_declarationContext enum_declaration() {
			return getRuleContext(Enum_declarationContext.class,0);
		}
		public Widget_declarationContext widget_declaration() {
			return getRuleContext(Widget_declarationContext.class,0);
		}
		public Method_declarationContext method_declaration() {
			return getRuleContext(Method_declarationContext.class,0);
		}
		public List<Comment_statementContext> comment_statement() {
			return getRuleContexts(Comment_statementContext.class);
		}
		public Comment_statementContext comment_statement(int i) {
			return getRuleContext(Comment_statementContext.class,i);
		}
		public List<LfpContext> lfp() {
			return getRuleContexts(LfpContext.class);
		}
		public LfpContext lfp(int i) {
			return getRuleContext(LfpContext.class,i);
		}
		public List<Annotation_constructorContext> annotation_constructor() {
			return getRuleContexts(Annotation_constructorContext.class);
		}
		public Annotation_constructorContext annotation_constructor(int i) {
			return getRuleContext(Annotation_constructorContext.class,i);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1695);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(1690);
				comment_statement();
				setState(1691);
				lfp();
				}
				}
				setState(1697);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1703);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ARONDBASE_IDENTIFIER) {
				{
				{
				setState(1698);
				annotation_constructor();
				setState(1699);
				lfp();
				}
				}
				setState(1705);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1712);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				{
				setState(1706);
				attribute_declaration();
				}
				break;
			case 2:
				{
				setState(1707);
				category_declaration();
				}
				break;
			case 3:
				{
				setState(1708);
				resource_declaration();
				}
				break;
			case 4:
				{
				setState(1709);
				enum_declaration();
				}
				break;
			case 5:
				{
				setState(1710);
				widget_declaration();
				}
				break;
			case 6:
				{
				setState(1711);
				method_declaration();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Annotation_constructorContext extends ParserRuleContext {
		public Annotation_identifierContext name;
		public Annotation_argument_valueContext exp;
		public Annotation_identifierContext annotation_identifier() {
			return getRuleContext(Annotation_identifierContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(EParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EParser.RPAR, 0); }
		public Annotation_argument_valueContext annotation_argument_value() {
			return getRuleContext(Annotation_argument_valueContext.class,0);
		}
		public List<Annotation_argumentContext> annotation_argument() {
			return getRuleContexts(Annotation_argumentContext.class);
		}
		public Annotation_argumentContext annotation_argument(int i) {
			return getRuleContext(Annotation_argumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EParser.COMMA, i);
		}
		public Annotation_constructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterAnnotation_constructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitAnnotation_constructor(this);
		}
	}

	public final Annotation_constructorContext annotation_constructor() throws RecognitionException {
		Annotation_constructorContext _localctx = new Annotation_constructorContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_annotation_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1714);
			((Annotation_constructorContext)_localctx).name = annotation_identifier();
			setState(1729);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(1715);
				match(LPAR);
				setState(1725);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LPAR:
				case LBRAK:
				case LCURL:
				case MINUS:
				case LT:
				case LTCOLONGT:
				case BOOLEAN:
				case CSS:
				case CHARACTER:
				case TEXT:
				case INTEGER:
				case DECIMAL:
				case DATE:
				case TIME:
				case DATETIME:
				case PERIOD:
				case VERSION:
				case CODE:
				case DOCUMENT:
				case BLOB:
				case IMAGE:
				case UUID:
				case HTML:
				case TYPE:
				case MUTABLE:
				case NOTHING:
				case BOOLEAN_LITERAL:
				case CHAR_LITERAL:
				case MIN_INTEGER:
				case MAX_INTEGER:
				case SYMBOL_IDENTIFIER:
				case TYPE_IDENTIFIER:
				case TEXT_LITERAL:
				case UUID_LITERAL:
				case INTEGER_LITERAL:
				case HEXA_LITERAL:
				case DECIMAL_LITERAL:
				case DATETIME_LITERAL:
				case TIME_LITERAL:
				case DATE_LITERAL:
				case PERIOD_LITERAL:
				case VERSION_LITERAL:
					{
					setState(1716);
					((Annotation_constructorContext)_localctx).exp = annotation_argument_value();
					}
					break;
				case GETTER:
				case SETTER:
				case VARIABLE_IDENTIFIER:
					{
					{
					setState(1717);
					annotation_argument();
					setState(1722);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1718);
						match(COMMA);
						setState(1719);
						annotation_argument();
						}
						}
						setState(1724);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1727);
				match(RPAR);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Annotation_identifierContext extends ParserRuleContext {
		public TerminalNode ARONDBASE_IDENTIFIER() { return getToken(EParser.ARONDBASE_IDENTIFIER, 0); }
		public Annotation_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterAnnotation_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitAnnotation_identifier(this);
		}
	}

	public final Annotation_identifierContext annotation_identifier() throws RecognitionException {
		Annotation_identifierContext _localctx = new Annotation_identifierContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_annotation_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1731);
			match(ARONDBASE_IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Annotation_argumentContext extends ParserRuleContext {
		public Annotation_argument_nameContext name;
		public Annotation_argument_valueContext exp;
		public TerminalNode EQ() { return getToken(EParser.EQ, 0); }
		public Annotation_argument_nameContext annotation_argument_name() {
			return getRuleContext(Annotation_argument_nameContext.class,0);
		}
		public Annotation_argument_valueContext annotation_argument_value() {
			return getRuleContext(Annotation_argument_valueContext.class,0);
		}
		public Annotation_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterAnnotation_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitAnnotation_argument(this);
		}
	}

	public final Annotation_argumentContext annotation_argument() throws RecognitionException {
		Annotation_argumentContext _localctx = new Annotation_argumentContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_annotation_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1733);
			((Annotation_argumentContext)_localctx).name = annotation_argument_name();
			setState(1734);
			match(EQ);
			setState(1735);
			((Annotation_argumentContext)_localctx).exp = annotation_argument_value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Annotation_argument_nameContext extends ParserRuleContext {
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(EParser.VARIABLE_IDENTIFIER, 0); }
		public TerminalNode GETTER() { return getToken(EParser.GETTER, 0); }
		public TerminalNode SETTER() { return getToken(EParser.SETTER, 0); }
		public Annotation_argument_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation_argument_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterAnnotation_argument_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitAnnotation_argument_name(this);
		}
	}

	public final Annotation_argument_nameContext annotation_argument_name() throws RecognitionException {
		Annotation_argument_nameContext _localctx = new Annotation_argument_nameContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_annotation_argument_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1737);
			_la = _input.LA(1);
			if ( !(((((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & ((1L << (GETTER - 113)) | (1L << (SETTER - 113)) | (1L << (VARIABLE_IDENTIFIER - 113)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Annotation_argument_valueContext extends ParserRuleContext {
		public Annotation_argument_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation_argument_value; }
	 
		public Annotation_argument_valueContext() { }
		public void copyFrom(Annotation_argument_valueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AnnotationLiteralValueContext extends Annotation_argument_valueContext {
		public Literal_expressionContext exp;
		public Literal_expressionContext literal_expression() {
			return getRuleContext(Literal_expressionContext.class,0);
		}
		public AnnotationLiteralValueContext(Annotation_argument_valueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterAnnotationLiteralValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitAnnotationLiteralValue(this);
		}
	}
	public static class AnnotationTypeValueContext extends Annotation_argument_valueContext {
		public Primary_typeContext typ;
		public Primary_typeContext primary_type() {
			return getRuleContext(Primary_typeContext.class,0);
		}
		public AnnotationTypeValueContext(Annotation_argument_valueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterAnnotationTypeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitAnnotationTypeValue(this);
		}
	}

	public final Annotation_argument_valueContext annotation_argument_value() throws RecognitionException {
		Annotation_argument_valueContext _localctx = new Annotation_argument_valueContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_annotation_argument_value);
		try {
			setState(1741);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
			case LBRAK:
			case LCURL:
			case MINUS:
			case LT:
			case LTCOLONGT:
			case TYPE:
			case MUTABLE:
			case NOTHING:
			case BOOLEAN_LITERAL:
			case CHAR_LITERAL:
			case MIN_INTEGER:
			case MAX_INTEGER:
			case SYMBOL_IDENTIFIER:
			case TEXT_LITERAL:
			case UUID_LITERAL:
			case INTEGER_LITERAL:
			case HEXA_LITERAL:
			case DECIMAL_LITERAL:
			case DATETIME_LITERAL:
			case TIME_LITERAL:
			case DATE_LITERAL:
			case PERIOD_LITERAL:
			case VERSION_LITERAL:
				_localctx = new AnnotationLiteralValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1739);
				((AnnotationLiteralValueContext)_localctx).exp = literal_expression();
				}
				break;
			case BOOLEAN:
			case CSS:
			case CHARACTER:
			case TEXT:
			case INTEGER:
			case DECIMAL:
			case DATE:
			case TIME:
			case DATETIME:
			case PERIOD:
			case VERSION:
			case CODE:
			case DOCUMENT:
			case BLOB:
			case IMAGE:
			case UUID:
			case HTML:
			case TYPE_IDENTIFIER:
				_localctx = new AnnotationTypeValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1740);
				((AnnotationTypeValueContext)_localctx).typ = primary_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Resource_declarationContext extends ParserRuleContext {
		public Native_resource_declarationContext native_resource_declaration() {
			return getRuleContext(Native_resource_declarationContext.class,0);
		}
		public Resource_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterResource_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitResource_declaration(this);
		}
	}

	public final Resource_declarationContext resource_declaration() throws RecognitionException {
		Resource_declarationContext _localctx = new Resource_declarationContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_resource_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1743);
			native_resource_declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enum_declarationContext extends ParserRuleContext {
		public Enum_category_declarationContext enum_category_declaration() {
			return getRuleContext(Enum_category_declarationContext.class,0);
		}
		public Enum_native_declarationContext enum_native_declaration() {
			return getRuleContext(Enum_native_declarationContext.class,0);
		}
		public Enum_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterEnum_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitEnum_declaration(this);
		}
	}

	public final Enum_declarationContext enum_declaration() throws RecognitionException {
		Enum_declarationContext _localctx = new Enum_declarationContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_enum_declaration);
		try {
			setState(1747);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1745);
				enum_category_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1746);
				enum_native_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Native_symbol_listContext extends ParserRuleContext {
		public List<Native_symbolContext> native_symbol() {
			return getRuleContexts(Native_symbolContext.class);
		}
		public Native_symbolContext native_symbol(int i) {
			return getRuleContext(Native_symbolContext.class,i);
		}
		public List<LfpContext> lfp() {
			return getRuleContexts(LfpContext.class);
		}
		public LfpContext lfp(int i) {
			return getRuleContext(LfpContext.class,i);
		}
		public Native_symbol_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_native_symbol_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterNative_symbol_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitNative_symbol_list(this);
		}
	}

	public final Native_symbol_listContext native_symbol_list() throws RecognitionException {
		Native_symbol_listContext _localctx = new Native_symbol_listContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_native_symbol_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1749);
			native_symbol();
			setState(1755);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1750);
					lfp();
					setState(1751);
					native_symbol();
					}
					} 
				}
				setState(1757);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Category_symbol_listContext extends ParserRuleContext {
		public List<Category_symbolContext> category_symbol() {
			return getRuleContexts(Category_symbolContext.class);
		}
		public Category_symbolContext category_symbol(int i) {
			return getRuleContext(Category_symbolContext.class,i);
		}
		public List<LfpContext> lfp() {
			return getRuleContexts(LfpContext.class);
		}
		public LfpContext lfp(int i) {
			return getRuleContext(LfpContext.class,i);
		}
		public Category_symbol_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_category_symbol_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterCategory_symbol_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitCategory_symbol_list(this);
		}
	}

	public final Category_symbol_listContext category_symbol_list() throws RecognitionException {
		Category_symbol_listContext _localctx = new Category_symbol_listContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_category_symbol_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1758);
			category_symbol();
			setState(1764);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1759);
					lfp();
					setState(1760);
					category_symbol();
					}
					} 
				}
				setState(1766);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Symbol_listContext extends ParserRuleContext {
		public List<Symbol_identifierContext> symbol_identifier() {
			return getRuleContexts(Symbol_identifierContext.class);
		}
		public Symbol_identifierContext symbol_identifier(int i) {
			return getRuleContext(Symbol_identifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EParser.COMMA, i);
		}
		public Symbol_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbol_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterSymbol_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitSymbol_list(this);
		}
	}

	public final Symbol_listContext symbol_list() throws RecognitionException {
		Symbol_listContext _localctx = new Symbol_listContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_symbol_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1767);
			symbol_identifier();
			setState(1772);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1768);
				match(COMMA);
				setState(1769);
				symbol_identifier();
				}
				}
				setState(1774);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attribute_constraintContext extends ParserRuleContext {
		public Attribute_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_constraint; }
	 
		public Attribute_constraintContext() { }
		public void copyFrom(Attribute_constraintContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MatchingSetContext extends Attribute_constraintContext {
		public Set_literalContext source;
		public TerminalNode IN() { return getToken(EParser.IN, 0); }
		public Set_literalContext set_literal() {
			return getRuleContext(Set_literalContext.class,0);
		}
		public MatchingSetContext(Attribute_constraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterMatchingSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitMatchingSet(this);
		}
	}
	public static class MatchingPatternContext extends Attribute_constraintContext {
		public Token text;
		public TerminalNode MATCHING() { return getToken(EParser.MATCHING, 0); }
		public TerminalNode TEXT_LITERAL() { return getToken(EParser.TEXT_LITERAL, 0); }
		public MatchingPatternContext(Attribute_constraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterMatchingPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitMatchingPattern(this);
		}
	}
	public static class MatchingListContext extends Attribute_constraintContext {
		public List_literalContext source;
		public TerminalNode IN() { return getToken(EParser.IN, 0); }
		public List_literalContext list_literal() {
			return getRuleContext(List_literalContext.class,0);
		}
		public MatchingListContext(Attribute_constraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterMatchingList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitMatchingList(this);
		}
	}
	public static class MatchingRangeContext extends Attribute_constraintContext {
		public Range_literalContext source;
		public TerminalNode IN() { return getToken(EParser.IN, 0); }
		public Range_literalContext range_literal() {
			return getRuleContext(Range_literalContext.class,0);
		}
		public MatchingRangeContext(Attribute_constraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterMatchingRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitMatchingRange(this);
		}
	}
	public static class MatchingExpressionContext extends Attribute_constraintContext {
		public ExpressionContext exp;
		public TerminalNode MATCHING() { return getToken(EParser.MATCHING, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MatchingExpressionContext(Attribute_constraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterMatchingExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitMatchingExpression(this);
		}
	}

	public final Attribute_constraintContext attribute_constraint() throws RecognitionException {
		Attribute_constraintContext _localctx = new Attribute_constraintContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_attribute_constraint);
		try {
			setState(1785);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				_localctx = new MatchingListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1775);
				match(IN);
				setState(1776);
				((MatchingListContext)_localctx).source = list_literal();
				}
				break;
			case 2:
				_localctx = new MatchingSetContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1777);
				match(IN);
				setState(1778);
				((MatchingSetContext)_localctx).source = set_literal();
				}
				break;
			case 3:
				_localctx = new MatchingRangeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1779);
				match(IN);
				setState(1780);
				((MatchingRangeContext)_localctx).source = range_literal();
				}
				break;
			case 4:
				_localctx = new MatchingPatternContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1781);
				match(MATCHING);
				setState(1782);
				((MatchingPatternContext)_localctx).text = match(TEXT_LITERAL);
				}
				break;
			case 5:
				_localctx = new MatchingExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1783);
				match(MATCHING);
				setState(1784);
				((MatchingExpressionContext)_localctx).exp = expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class List_literalContext extends ParserRuleContext {
		public TerminalNode LBRAK() { return getToken(EParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(EParser.RBRAK, 0); }
		public TerminalNode MUTABLE() { return getToken(EParser.MUTABLE, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public List_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterList_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitList_literal(this);
		}
	}

	public final List_literalContext list_literal() throws RecognitionException {
		List_literalContext _localctx = new List_literalContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_list_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1788);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUTABLE) {
				{
				setState(1787);
				match(MUTABLE);
				}
			}

			setState(1790);
			match(LBRAK);
			setState(1792);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << LTCOLONGT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (METHOD_COLON - 64)) | (1L << (CODE - 64)) | (1L << (DOCUMENT - 64)) | (1L << (BLOB - 64)) | (1L << (TYPE - 64)) | (1L << (EXECUTE - 64)) | (1L << (FETCH - 64)) | (1L << (INVOKE_COLON - 64)) | (1L << (MUTABLE - 64)) | (1L << (NOT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (NOTHING - 128)) | (1L << (READ - 128)) | (1L << (SELF - 128)) | (1L << (SORTED - 128)) | (1L << (SUPER - 128)) | (1L << (THIS - 128)) | (1L << (BOOLEAN_LITERAL - 128)) | (1L << (CHAR_LITERAL - 128)) | (1L << (MIN_INTEGER - 128)) | (1L << (MAX_INTEGER - 128)) | (1L << (SYMBOL_IDENTIFIER - 128)) | (1L << (TYPE_IDENTIFIER - 128)) | (1L << (VARIABLE_IDENTIFIER - 128)) | (1L << (TEXT_LITERAL - 128)) | (1L << (UUID_LITERAL - 128)) | (1L << (INTEGER_LITERAL - 128)) | (1L << (HEXA_LITERAL - 128)) | (1L << (DECIMAL_LITERAL - 128)) | (1L << (DATETIME_LITERAL - 128)) | (1L << (TIME_LITERAL - 128)) | (1L << (DATE_LITERAL - 128)) | (1L << (PERIOD_LITERAL - 128)) | (1L << (VERSION_LITERAL - 128)))) != 0)) {
				{
				setState(1791);
				expression_list();
				}
			}

			setState(1794);
			match(RBRAK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_literalContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(EParser.LT, 0); }
		public TerminalNode GT() { return getToken(EParser.GT, 0); }
		public TerminalNode MUTABLE() { return getToken(EParser.MUTABLE, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Set_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterSet_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitSet_literal(this);
		}
	}

	public final Set_literalContext set_literal() throws RecognitionException {
		Set_literalContext _localctx = new Set_literalContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_set_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1797);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUTABLE) {
				{
				setState(1796);
				match(MUTABLE);
				}
			}

			setState(1799);
			match(LT);
			setState(1801);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << LTCOLONGT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (METHOD_COLON - 64)) | (1L << (CODE - 64)) | (1L << (DOCUMENT - 64)) | (1L << (BLOB - 64)) | (1L << (TYPE - 64)) | (1L << (EXECUTE - 64)) | (1L << (FETCH - 64)) | (1L << (INVOKE_COLON - 64)) | (1L << (MUTABLE - 64)) | (1L << (NOT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (NOTHING - 128)) | (1L << (READ - 128)) | (1L << (SELF - 128)) | (1L << (SORTED - 128)) | (1L << (SUPER - 128)) | (1L << (THIS - 128)) | (1L << (BOOLEAN_LITERAL - 128)) | (1L << (CHAR_LITERAL - 128)) | (1L << (MIN_INTEGER - 128)) | (1L << (MAX_INTEGER - 128)) | (1L << (SYMBOL_IDENTIFIER - 128)) | (1L << (TYPE_IDENTIFIER - 128)) | (1L << (VARIABLE_IDENTIFIER - 128)) | (1L << (TEXT_LITERAL - 128)) | (1L << (UUID_LITERAL - 128)) | (1L << (INTEGER_LITERAL - 128)) | (1L << (HEXA_LITERAL - 128)) | (1L << (DECIMAL_LITERAL - 128)) | (1L << (DATETIME_LITERAL - 128)) | (1L << (TIME_LITERAL - 128)) | (1L << (DATE_LITERAL - 128)) | (1L << (PERIOD_LITERAL - 128)) | (1L << (VERSION_LITERAL - 128)))) != 0)) {
				{
				setState(1800);
				expression_list();
				}
			}

			setState(1803);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression_listContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EParser.COMMA, i);
		}
		public Expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterExpression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitExpression_list(this);
		}
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		Expression_listContext _localctx = new Expression_listContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1805);
			expression(0);
			setState(1810);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1806);
				match(COMMA);
				setState(1807);
				expression(0);
				}
				}
				setState(1812);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Range_literalContext extends ParserRuleContext {
		public ExpressionContext low;
		public ExpressionContext high;
		public TerminalNode LBRAK() { return getToken(EParser.LBRAK, 0); }
		public TerminalNode RANGE() { return getToken(EParser.RANGE, 0); }
		public TerminalNode RBRAK() { return getToken(EParser.RBRAK, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Range_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterRange_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitRange_literal(this);
		}
	}

	public final Range_literalContext range_literal() throws RecognitionException {
		Range_literalContext _localctx = new Range_literalContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_range_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1813);
			match(LBRAK);
			setState(1814);
			((Range_literalContext)_localctx).low = expression(0);
			setState(1815);
			match(RANGE);
			setState(1816);
			((Range_literalContext)_localctx).high = expression(0);
			setState(1817);
			match(RBRAK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypedefContext extends ParserRuleContext {
		public TypedefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedef; }
	 
		public TypedefContext() { }
		public void copyFrom(TypedefContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IteratorTypeContext extends TypedefContext {
		public TypedefContext i;
		public TerminalNode ITERATOR() { return getToken(EParser.ITERATOR, 0); }
		public TerminalNode LT() { return getToken(EParser.LT, 0); }
		public TerminalNode GT() { return getToken(EParser.GT, 0); }
		public TypedefContext typedef() {
			return getRuleContext(TypedefContext.class,0);
		}
		public IteratorTypeContext(TypedefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterIteratorType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitIteratorType(this);
		}
	}
	public static class SetTypeContext extends TypedefContext {
		public TypedefContext s;
		public TerminalNode LTGT() { return getToken(EParser.LTGT, 0); }
		public TypedefContext typedef() {
			return getRuleContext(TypedefContext.class,0);
		}
		public SetTypeContext(TypedefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterSetType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitSetType(this);
		}
	}
	public static class ListTypeContext extends TypedefContext {
		public TypedefContext l;
		public TerminalNode LBRAK() { return getToken(EParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(EParser.RBRAK, 0); }
		public TypedefContext typedef() {
			return getRuleContext(TypedefContext.class,0);
		}
		public ListTypeContext(TypedefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterListType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitListType(this);
		}
	}
	public static class DictTypeContext extends TypedefContext {
		public TypedefContext d;
		public TerminalNode LTCOLONGT() { return getToken(EParser.LTCOLONGT, 0); }
		public TypedefContext typedef() {
			return getRuleContext(TypedefContext.class,0);
		}
		public DictTypeContext(TypedefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterDictType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitDictType(this);
		}
	}
	public static class CursorTypeContext extends TypedefContext {
		public TypedefContext c;
		public TerminalNode CURSOR() { return getToken(EParser.CURSOR, 0); }
		public TerminalNode LT() { return getToken(EParser.LT, 0); }
		public TerminalNode GT() { return getToken(EParser.GT, 0); }
		public TypedefContext typedef() {
			return getRuleContext(TypedefContext.class,0);
		}
		public CursorTypeContext(TypedefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterCursorType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitCursorType(this);
		}
	}
	public static class PrimaryTypeContext extends TypedefContext {
		public Primary_typeContext p;
		public Primary_typeContext primary_type() {
			return getRuleContext(Primary_typeContext.class,0);
		}
		public PrimaryTypeContext(TypedefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterPrimaryType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitPrimaryType(this);
		}
	}

	public final TypedefContext typedef() throws RecognitionException {
		return typedef(0);
	}

	private TypedefContext typedef(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypedefContext _localctx = new TypedefContext(_ctx, _parentState);
		TypedefContext _prevctx = _localctx;
		int _startState = 192;
		enterRecursionRule(_localctx, 192, RULE_typedef, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1831);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CSS:
			case CHARACTER:
			case TEXT:
			case INTEGER:
			case DECIMAL:
			case DATE:
			case TIME:
			case DATETIME:
			case PERIOD:
			case VERSION:
			case CODE:
			case DOCUMENT:
			case BLOB:
			case IMAGE:
			case UUID:
			case HTML:
			case TYPE_IDENTIFIER:
				{
				_localctx = new PrimaryTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1820);
				((PrimaryTypeContext)_localctx).p = primary_type();
				}
				break;
			case CURSOR:
				{
				_localctx = new CursorTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1821);
				match(CURSOR);
				setState(1822);
				match(LT);
				setState(1823);
				((CursorTypeContext)_localctx).c = typedef(0);
				setState(1824);
				match(GT);
				}
				break;
			case ITERATOR:
				{
				_localctx = new IteratorTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1826);
				match(ITERATOR);
				setState(1827);
				match(LT);
				setState(1828);
				((IteratorTypeContext)_localctx).i = typedef(0);
				setState(1829);
				match(GT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1842);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1840);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
					case 1:
						{
						_localctx = new SetTypeContext(new TypedefContext(_parentctx, _parentState));
						((SetTypeContext)_localctx).s = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_typedef);
						setState(1833);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1834);
						match(LTGT);
						}
						break;
					case 2:
						{
						_localctx = new ListTypeContext(new TypedefContext(_parentctx, _parentState));
						((ListTypeContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_typedef);
						setState(1835);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1836);
						match(LBRAK);
						setState(1837);
						match(RBRAK);
						}
						break;
					case 3:
						{
						_localctx = new DictTypeContext(new TypedefContext(_parentctx, _parentState));
						((DictTypeContext)_localctx).d = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_typedef);
						setState(1838);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1839);
						match(LTCOLONGT);
						}
						break;
					}
					} 
				}
				setState(1844);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Primary_typeContext extends ParserRuleContext {
		public Primary_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_type; }
	 
		public Primary_typeContext() { }
		public void copyFrom(Primary_typeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NativeTypeContext extends Primary_typeContext {
		public Native_typeContext n;
		public Native_typeContext native_type() {
			return getRuleContext(Native_typeContext.class,0);
		}
		public NativeTypeContext(Primary_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterNativeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitNativeType(this);
		}
	}
	public static class CategoryTypeContext extends Primary_typeContext {
		public Category_typeContext c;
		public Category_typeContext category_type() {
			return getRuleContext(Category_typeContext.class,0);
		}
		public CategoryTypeContext(Primary_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterCategoryType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitCategoryType(this);
		}
	}

	public final Primary_typeContext primary_type() throws RecognitionException {
		Primary_typeContext _localctx = new Primary_typeContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_primary_type);
		try {
			setState(1847);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CSS:
			case CHARACTER:
			case TEXT:
			case INTEGER:
			case DECIMAL:
			case DATE:
			case TIME:
			case DATETIME:
			case PERIOD:
			case VERSION:
			case CODE:
			case DOCUMENT:
			case BLOB:
			case IMAGE:
			case UUID:
			case HTML:
				_localctx = new NativeTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1845);
				((NativeTypeContext)_localctx).n = native_type();
				}
				break;
			case TYPE_IDENTIFIER:
				_localctx = new CategoryTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1846);
				((CategoryTypeContext)_localctx).c = category_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Native_typeContext extends ParserRuleContext {
		public Native_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_native_type; }
	 
		public Native_typeContext() { }
		public void copyFrom(Native_typeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PeriodTypeContext extends Native_typeContext {
		public TerminalNode PERIOD() { return getToken(EParser.PERIOD, 0); }
		public PeriodTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterPeriodType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitPeriodType(this);
		}
	}
	public static class HtmlTypeContext extends Native_typeContext {
		public TerminalNode HTML() { return getToken(EParser.HTML, 0); }
		public HtmlTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterHtmlType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitHtmlType(this);
		}
	}
	public static class CssTypeContext extends Native_typeContext {
		public TerminalNode CSS() { return getToken(EParser.CSS, 0); }
		public CssTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterCssType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitCssType(this);
		}
	}
	public static class BooleanTypeContext extends Native_typeContext {
		public TerminalNode BOOLEAN() { return getToken(EParser.BOOLEAN, 0); }
		public BooleanTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterBooleanType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitBooleanType(this);
		}
	}
	public static class DocumentTypeContext extends Native_typeContext {
		public TerminalNode DOCUMENT() { return getToken(EParser.DOCUMENT, 0); }
		public DocumentTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterDocumentType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitDocumentType(this);
		}
	}
	public static class CharacterTypeContext extends Native_typeContext {
		public TerminalNode CHARACTER() { return getToken(EParser.CHARACTER, 0); }
		public CharacterTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterCharacterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitCharacterType(this);
		}
	}
	public static class VersionTypeContext extends Native_typeContext {
		public TerminalNode VERSION() { return getToken(EParser.VERSION, 0); }
		public VersionTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterVersionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitVersionType(this);
		}
	}
	public static class TextTypeContext extends Native_typeContext {
		public TerminalNode TEXT() { return getToken(EParser.TEXT, 0); }
		public TextTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterTextType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitTextType(this);
		}
	}
	public static class ImageTypeContext extends Native_typeContext {
		public TerminalNode IMAGE() { return getToken(EParser.IMAGE, 0); }
		public ImageTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterImageType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitImageType(this);
		}
	}
	public static class TimeTypeContext extends Native_typeContext {
		public TerminalNode TIME() { return getToken(EParser.TIME, 0); }
		public TimeTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterTimeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitTimeType(this);
		}
	}
	public static class IntegerTypeContext extends Native_typeContext {
		public TerminalNode INTEGER() { return getToken(EParser.INTEGER, 0); }
		public IntegerTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterIntegerType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitIntegerType(this);
		}
	}
	public static class DateTimeTypeContext extends Native_typeContext {
		public TerminalNode DATETIME() { return getToken(EParser.DATETIME, 0); }
		public DateTimeTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterDateTimeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitDateTimeType(this);
		}
	}
	public static class BlobTypeContext extends Native_typeContext {
		public TerminalNode BLOB() { return getToken(EParser.BLOB, 0); }
		public BlobTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterBlobType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitBlobType(this);
		}
	}
	public static class UUIDTypeContext extends Native_typeContext {
		public TerminalNode UUID() { return getToken(EParser.UUID, 0); }
		public UUIDTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterUUIDType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitUUIDType(this);
		}
	}
	public static class DecimalTypeContext extends Native_typeContext {
		public TerminalNode DECIMAL() { return getToken(EParser.DECIMAL, 0); }
		public DecimalTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterDecimalType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitDecimalType(this);
		}
	}
	public static class CodeTypeContext extends Native_typeContext {
		public TerminalNode CODE() { return getToken(EParser.CODE, 0); }
		public CodeTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterCodeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitCodeType(this);
		}
	}
	public static class DateTypeContext extends Native_typeContext {
		public TerminalNode DATE() { return getToken(EParser.DATE, 0); }
		public DateTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterDateType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitDateType(this);
		}
	}

	public final Native_typeContext native_type() throws RecognitionException {
		Native_typeContext _localctx = new Native_typeContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_native_type);
		try {
			setState(1866);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
				_localctx = new BooleanTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1849);
				match(BOOLEAN);
				}
				break;
			case CSS:
				_localctx = new CssTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1850);
				match(CSS);
				}
				break;
			case CHARACTER:
				_localctx = new CharacterTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1851);
				match(CHARACTER);
				}
				break;
			case TEXT:
				_localctx = new TextTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1852);
				match(TEXT);
				}
				break;
			case IMAGE:
				_localctx = new ImageTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1853);
				match(IMAGE);
				}
				break;
			case INTEGER:
				_localctx = new IntegerTypeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1854);
				match(INTEGER);
				}
				break;
			case DECIMAL:
				_localctx = new DecimalTypeContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1855);
				match(DECIMAL);
				}
				break;
			case DOCUMENT:
				_localctx = new DocumentTypeContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1856);
				match(DOCUMENT);
				}
				break;
			case DATE:
				_localctx = new DateTypeContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1857);
				match(DATE);
				}
				break;
			case DATETIME:
				_localctx = new DateTimeTypeContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1858);
				match(DATETIME);
				}
				break;
			case TIME:
				_localctx = new TimeTypeContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(1859);
				match(TIME);
				}
				break;
			case PERIOD:
				_localctx = new PeriodTypeContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(1860);
				match(PERIOD);
				}
				break;
			case VERSION:
				_localctx = new VersionTypeContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(1861);
				match(VERSION);
				}
				break;
			case CODE:
				_localctx = new CodeTypeContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(1862);
				match(CODE);
				}
				break;
			case BLOB:
				_localctx = new BlobTypeContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(1863);
				match(BLOB);
				}
				break;
			case UUID:
				_localctx = new UUIDTypeContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(1864);
				match(UUID);
				}
				break;
			case HTML:
				_localctx = new HtmlTypeContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(1865);
				match(HTML);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Category_typeContext extends ParserRuleContext {
		public Token t1;
		public TerminalNode TYPE_IDENTIFIER() { return getToken(EParser.TYPE_IDENTIFIER, 0); }
		public Category_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_category_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterCategory_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitCategory_type(this);
		}
	}

	public final Category_typeContext category_type() throws RecognitionException {
		Category_typeContext _localctx = new Category_typeContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_category_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1868);
			((Category_typeContext)_localctx).t1 = match(TYPE_IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mutable_category_typeContext extends ParserRuleContext {
		public Category_typeContext category_type() {
			return getRuleContext(Category_typeContext.class,0);
		}
		public TerminalNode MUTABLE() { return getToken(EParser.MUTABLE, 0); }
		public Mutable_category_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mutable_category_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterMutable_category_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitMutable_category_type(this);
		}
	}

	public final Mutable_category_typeContext mutable_category_type() throws RecognitionException {
		Mutable_category_typeContext _localctx = new Mutable_category_typeContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_mutable_category_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1871);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUTABLE) {
				{
				setState(1870);
				match(MUTABLE);
				}
			}

			setState(1873);
			category_type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Code_typeContext extends ParserRuleContext {
		public Token t1;
		public TerminalNode CODE() { return getToken(EParser.CODE, 0); }
		public Code_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterCode_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitCode_type(this);
		}
	}

	public final Code_typeContext code_type() throws RecognitionException {
		Code_typeContext _localctx = new Code_typeContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_code_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1875);
			((Code_typeContext)_localctx).t1 = match(CODE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Category_declarationContext extends ParserRuleContext {
		public Category_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_category_declaration; }
	 
		public Category_declarationContext() { }
		public void copyFrom(Category_declarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConcreteCategoryDeclarationContext extends Category_declarationContext {
		public Concrete_category_declarationContext decl;
		public Concrete_category_declarationContext concrete_category_declaration() {
			return getRuleContext(Concrete_category_declarationContext.class,0);
		}
		public ConcreteCategoryDeclarationContext(Category_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterConcreteCategoryDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitConcreteCategoryDeclaration(this);
		}
	}
	public static class NativeCategoryDeclarationContext extends Category_declarationContext {
		public Native_category_declarationContext decl;
		public Native_category_declarationContext native_category_declaration() {
			return getRuleContext(Native_category_declarationContext.class,0);
		}
		public NativeCategoryDeclarationContext(Category_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterNativeCategoryDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitNativeCategoryDeclaration(this);
		}
	}
	public static class SingletonCategoryDeclarationContext extends Category_declarationContext {
		public Singleton_category_declarationContext decl;
		public Singleton_category_declarationContext singleton_category_declaration() {
			return getRuleContext(Singleton_category_declarationContext.class,0);
		}
		public SingletonCategoryDeclarationContext(Category_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterSingletonCategoryDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitSingletonCategoryDeclaration(this);
		}
	}

	public final Category_declarationContext category_declaration() throws RecognitionException {
		Category_declarationContext _localctx = new Category_declarationContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_category_declaration);
		try {
			setState(1880);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				_localctx = new ConcreteCategoryDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1877);
				((ConcreteCategoryDeclarationContext)_localctx).decl = concrete_category_declaration();
				}
				break;
			case 2:
				_localctx = new NativeCategoryDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1878);
				((NativeCategoryDeclarationContext)_localctx).decl = native_category_declaration();
				}
				break;
			case 3:
				_localctx = new SingletonCategoryDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1879);
				((SingletonCategoryDeclarationContext)_localctx).decl = singleton_category_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Widget_declarationContext extends ParserRuleContext {
		public Widget_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_widget_declaration; }
	 
		public Widget_declarationContext() { }
		public void copyFrom(Widget_declarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConcreteWidgetDeclarationContext extends Widget_declarationContext {
		public Concrete_widget_declarationContext decl;
		public Concrete_widget_declarationContext concrete_widget_declaration() {
			return getRuleContext(Concrete_widget_declarationContext.class,0);
		}
		public ConcreteWidgetDeclarationContext(Widget_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterConcreteWidgetDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitConcreteWidgetDeclaration(this);
		}
	}
	public static class NativeWidgetDeclarationContext extends Widget_declarationContext {
		public Native_widget_declarationContext decl;
		public Native_widget_declarationContext native_widget_declaration() {
			return getRuleContext(Native_widget_declarationContext.class,0);
		}
		public NativeWidgetDeclarationContext(Widget_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterNativeWidgetDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitNativeWidgetDeclaration(this);
		}
	}

	public final Widget_declarationContext widget_declaration() throws RecognitionException {
		Widget_declarationContext _localctx = new Widget_declarationContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_widget_declaration);
		try {
			setState(1884);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				_localctx = new ConcreteWidgetDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1882);
				((ConcreteWidgetDeclarationContext)_localctx).decl = concrete_widget_declaration();
				}
				break;
			case 2:
				_localctx = new NativeWidgetDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1883);
				((NativeWidgetDeclarationContext)_localctx).decl = native_widget_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_identifier_listContext extends ParserRuleContext {
		public List<Type_identifierContext> type_identifier() {
			return getRuleContexts(Type_identifierContext.class);
		}
		public Type_identifierContext type_identifier(int i) {
			return getRuleContext(Type_identifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EParser.COMMA, i);
		}
		public Type_identifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_identifier_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterType_identifier_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitType_identifier_list(this);
		}
	}

	public final Type_identifier_listContext type_identifier_list() throws RecognitionException {
		Type_identifier_listContext _localctx = new Type_identifier_listContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_type_identifier_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1886);
			type_identifier();
			setState(1891);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1887);
				match(COMMA);
				setState(1888);
				type_identifier();
				}
				}
				setState(1893);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_identifierContext extends ParserRuleContext {
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Method_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterMethod_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitMethod_identifier(this);
		}
	}

	public final Method_identifierContext method_identifier() throws RecognitionException {
		Method_identifierContext _localctx = new Method_identifierContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_method_identifier);
		try {
			setState(1896);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1894);
				variable_identifier();
				}
				break;
			case TYPE_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1895);
				type_identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Identifier_or_keywordContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public Identifier_or_keywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier_or_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterIdentifier_or_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitIdentifier_or_keyword(this);
		}
	}

	public final Identifier_or_keywordContext identifier_or_keyword() throws RecognitionException {
		Identifier_or_keywordContext _localctx = new Identifier_or_keywordContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_identifier_or_keyword);
		try {
			setState(1900);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SYMBOL_IDENTIFIER:
			case TYPE_IDENTIFIER:
			case VARIABLE_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1898);
				identifier();
				}
				break;
			case JAVA:
			case CSHARP:
			case PYTHON2:
			case PYTHON3:
			case JAVASCRIPT:
			case SWIFT:
			case BOOLEAN:
			case CHARACTER:
			case TEXT:
			case INTEGER:
			case DECIMAL:
			case DATE:
			case TIME:
			case DATETIME:
			case PERIOD:
			case VERSION:
			case CODE:
			case DOCUMENT:
			case BLOB:
			case IMAGE:
			case UUID:
			case ITERATOR:
			case CURSOR:
			case HTML:
			case ABSTRACT:
			case ALL:
			case ALWAYS:
			case AND:
			case ANY:
			case AS:
			case ASC:
			case ATTR:
			case ATTRIBUTE:
			case ATTRIBUTES:
			case BINDINGS:
			case BREAK:
			case BY:
			case CASE:
			case CATCH:
			case CATEGORY:
			case CLASS:
			case CONTAINS:
			case DEF:
			case DEFAULT:
			case DEFINE:
			case DELETE:
			case DESC:
			case DO:
			case DOING:
			case EACH:
			case ELSE:
			case ENUM:
			case ENUMERATED:
			case EXCEPT:
			case EXECUTE:
			case EXPECTING:
			case EXTENDS:
			case FETCH:
			case FILTERED:
			case FINALLY:
			case FLUSH:
			case FOR:
			case FROM:
			case GETTER:
			case HAS:
			case IF:
			case IN:
			case INDEX:
			case IS:
			case MATCHING:
			case METHOD:
			case METHODS:
			case MODULO:
			case MUTABLE:
			case NATIVE:
			case NONE:
			case NOT:
			case NOTHING:
			case NULL:
			case ON:
			case ONE:
			case OPERATOR:
			case OR:
			case ORDER:
			case OTHERWISE:
			case PASS:
			case RAISE:
			case READ:
			case RECEIVING:
			case RESOURCE:
			case RETURN:
			case RETURNING:
			case ROWS:
			case SELF:
			case SETTER:
			case SINGLETON:
			case SORTED:
			case STORABLE:
			case STORE:
			case SUPER:
			case SWITCH:
			case TEST:
			case THIS:
			case THROW:
			case TO:
			case TRY:
			case VERIFYING:
			case WIDGET:
			case WITH:
			case WHEN:
			case WHERE:
			case WHILE:
			case WRITE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1899);
				keyword();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nospace_hyphen_identifier_or_keywordContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(EParser.MINUS, 0); }
		public Nospace_identifier_or_keywordContext nospace_identifier_or_keyword() {
			return getRuleContext(Nospace_identifier_or_keywordContext.class,0);
		}
		public Nospace_hyphen_identifier_or_keywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nospace_hyphen_identifier_or_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterNospace_hyphen_identifier_or_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitNospace_hyphen_identifier_or_keyword(this);
		}
	}

	public final Nospace_hyphen_identifier_or_keywordContext nospace_hyphen_identifier_or_keyword() throws RecognitionException {
		Nospace_hyphen_identifier_or_keywordContext _localctx = new Nospace_hyphen_identifier_or_keywordContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_nospace_hyphen_identifier_or_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1902);
			if (!(this.wasNotWhiteSpace())) throw new FailedPredicateException(this, "$parser.wasNotWhiteSpace()");
			setState(1903);
			match(MINUS);
			setState(1904);
			nospace_identifier_or_keyword();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nospace_identifier_or_keywordContext extends ParserRuleContext {
		public Identifier_or_keywordContext identifier_or_keyword() {
			return getRuleContext(Identifier_or_keywordContext.class,0);
		}
		public Nospace_identifier_or_keywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nospace_identifier_or_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterNospace_identifier_or_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitNospace_identifier_or_keyword(this);
		}
	}

	public final Nospace_identifier_or_keywordContext nospace_identifier_or_keyword() throws RecognitionException {
		Nospace_identifier_or_keywordContext _localctx = new Nospace_identifier_or_keywordContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_nospace_identifier_or_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1906);
			if (!(this.wasNotWhiteSpace())) throw new FailedPredicateException(this, "$parser.wasNotWhiteSpace()");
			setState(1907);
			identifier_or_keyword();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	 
		public IdentifierContext() { }
		public void copyFrom(IdentifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TypeIdentifierContext extends IdentifierContext {
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public TypeIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterTypeIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitTypeIdentifier(this);
		}
	}
	public static class SymbolIdentifierContext extends IdentifierContext {
		public Symbol_identifierContext symbol_identifier() {
			return getRuleContext(Symbol_identifierContext.class,0);
		}
		public SymbolIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterSymbolIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitSymbolIdentifier(this);
		}
	}
	public static class VariableIdentifierContext extends IdentifierContext {
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public VariableIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterVariableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitVariableIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_identifier);
		try {
			setState(1912);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE_IDENTIFIER:
				_localctx = new VariableIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1909);
				variable_identifier();
				}
				break;
			case TYPE_IDENTIFIER:
				_localctx = new TypeIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1910);
				type_identifier();
				}
				break;
			case SYMBOL_IDENTIFIER:
				_localctx = new SymbolIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1911);
				symbol_identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Member_identifierContext extends ParserRuleContext {
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(EParser.VARIABLE_IDENTIFIER, 0); }
		public TerminalNode CATEGORY() { return getToken(EParser.CATEGORY, 0); }
		public Member_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterMember_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitMember_identifier(this);
		}
	}

	public final Member_identifierContext member_identifier() throws RecognitionException {
		Member_identifierContext _localctx = new Member_identifierContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_member_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1914);
			_la = _input.LA(1);
			if ( !(_la==CATEGORY || _la==VARIABLE_IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_identifierContext extends ParserRuleContext {
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(EParser.VARIABLE_IDENTIFIER, 0); }
		public Variable_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterVariable_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitVariable_identifier(this);
		}
	}

	public final Variable_identifierContext variable_identifier() throws RecognitionException {
		Variable_identifierContext _localctx = new Variable_identifierContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_variable_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1916);
			match(VARIABLE_IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attribute_identifierContext extends ParserRuleContext {
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(EParser.VARIABLE_IDENTIFIER, 0); }
		public TerminalNode STORABLE() { return getToken(EParser.STORABLE, 0); }
		public Attribute_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterAttribute_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitAttribute_identifier(this);
		}
	}

	public final Attribute_identifierContext attribute_identifier() throws RecognitionException {
		Attribute_identifierContext _localctx = new Attribute_identifierContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_attribute_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1918);
			_la = _input.LA(1);
			if ( !(_la==STORABLE || _la==VARIABLE_IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_identifierContext extends ParserRuleContext {
		public TerminalNode TYPE_IDENTIFIER() { return getToken(EParser.TYPE_IDENTIFIER, 0); }
		public Type_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterType_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitType_identifier(this);
		}
	}

	public final Type_identifierContext type_identifier() throws RecognitionException {
		Type_identifierContext _localctx = new Type_identifierContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_type_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1920);
			match(TYPE_IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Symbol_identifierContext extends ParserRuleContext {
		public TerminalNode SYMBOL_IDENTIFIER() { return getToken(EParser.SYMBOL_IDENTIFIER, 0); }
		public Symbol_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbol_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterSymbol_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitSymbol_identifier(this);
		}
	}

	public final Symbol_identifierContext symbol_identifier() throws RecognitionException {
		Symbol_identifierContext _localctx = new Symbol_identifierContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_symbol_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1922);
			match(SYMBOL_IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Argument_listContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EParser.COMMA, i);
		}
		public Argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterArgument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitArgument_list(this);
		}
	}

	public final Argument_listContext argument_list() throws RecognitionException {
		Argument_listContext _localctx = new Argument_listContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1924);
			argument();
			setState(1929);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1925);
				match(COMMA);
				setState(1926);
				argument();
				}
				}
				setState(1931);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentContext extends ParserRuleContext {
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
	 
		public ArgumentContext() { }
		public void copyFrom(ArgumentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OperatorArgumentContext extends ArgumentContext {
		public Operator_argumentContext arg;
		public Operator_argumentContext operator_argument() {
			return getRuleContext(Operator_argumentContext.class,0);
		}
		public TerminalNode MUTABLE() { return getToken(EParser.MUTABLE, 0); }
		public OperatorArgumentContext(ArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterOperatorArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitOperatorArgument(this);
		}
	}
	public static class CodeArgumentContext extends ArgumentContext {
		public Code_argumentContext arg;
		public Code_argumentContext code_argument() {
			return getRuleContext(Code_argumentContext.class,0);
		}
		public CodeArgumentContext(ArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterCodeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitCodeArgument(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_argument);
		int _la;
		try {
			setState(1937);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				_localctx = new CodeArgumentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1932);
				((CodeArgumentContext)_localctx).arg = code_argument();
				}
				break;
			case 2:
				_localctx = new OperatorArgumentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1934);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MUTABLE) {
					{
					setState(1933);
					match(MUTABLE);
					}
				}

				setState(1936);
				((OperatorArgumentContext)_localctx).arg = operator_argument();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operator_argumentContext extends ParserRuleContext {
		public Named_argumentContext named_argument() {
			return getRuleContext(Named_argumentContext.class,0);
		}
		public Typed_argumentContext typed_argument() {
			return getRuleContext(Typed_argumentContext.class,0);
		}
		public Operator_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterOperator_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitOperator_argument(this);
		}
	}

	public final Operator_argumentContext operator_argument() throws RecognitionException {
		Operator_argumentContext _localctx = new Operator_argumentContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_operator_argument);
		try {
			setState(1941);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1939);
				named_argument();
				}
				break;
			case BOOLEAN:
			case CSS:
			case CHARACTER:
			case TEXT:
			case INTEGER:
			case DECIMAL:
			case DATE:
			case TIME:
			case DATETIME:
			case PERIOD:
			case VERSION:
			case CODE:
			case DOCUMENT:
			case BLOB:
			case IMAGE:
			case UUID:
			case ITERATOR:
			case CURSOR:
			case HTML:
			case ANY:
			case TYPE_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1940);
				typed_argument();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Named_argumentContext extends ParserRuleContext {
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(EParser.EQ, 0); }
		public Literal_expressionContext literal_expression() {
			return getRuleContext(Literal_expressionContext.class,0);
		}
		public Named_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_named_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterNamed_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitNamed_argument(this);
		}
	}

	public final Named_argumentContext named_argument() throws RecognitionException {
		Named_argumentContext _localctx = new Named_argumentContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_named_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1943);
			variable_identifier();
			setState(1946);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(1944);
				match(EQ);
				setState(1945);
				literal_expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Code_argumentContext extends ParserRuleContext {
		public Variable_identifierContext name;
		public Code_typeContext code_type() {
			return getRuleContext(Code_typeContext.class,0);
		}
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public Code_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterCode_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitCode_argument(this);
		}
	}

	public final Code_argumentContext code_argument() throws RecognitionException {
		Code_argumentContext _localctx = new Code_argumentContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_code_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1948);
			code_type();
			setState(1949);
			((Code_argumentContext)_localctx).name = variable_identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Category_or_any_typeContext extends ParserRuleContext {
		public TypedefContext typedef() {
			return getRuleContext(TypedefContext.class,0);
		}
		public Any_typeContext any_type() {
			return getRuleContext(Any_typeContext.class,0);
		}
		public Category_or_any_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_category_or_any_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterCategory_or_any_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitCategory_or_any_type(this);
		}
	}

	public final Category_or_any_typeContext category_or_any_type() throws RecognitionException {
		Category_or_any_typeContext _localctx = new Category_or_any_typeContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_category_or_any_type);
		try {
			setState(1953);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CSS:
			case CHARACTER:
			case TEXT:
			case INTEGER:
			case DECIMAL:
			case DATE:
			case TIME:
			case DATETIME:
			case PERIOD:
			case VERSION:
			case CODE:
			case DOCUMENT:
			case BLOB:
			case IMAGE:
			case UUID:
			case ITERATOR:
			case CURSOR:
			case HTML:
			case TYPE_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1951);
				typedef(0);
				}
				break;
			case ANY:
				enterOuterAlt(_localctx, 2);
				{
				setState(1952);
				any_type(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Any_typeContext extends ParserRuleContext {
		public Any_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_type; }
	 
		public Any_typeContext() { }
		public void copyFrom(Any_typeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AnyListTypeContext extends Any_typeContext {
		public Any_typeContext any_type() {
			return getRuleContext(Any_typeContext.class,0);
		}
		public TerminalNode LBRAK() { return getToken(EParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(EParser.RBRAK, 0); }
		public AnyListTypeContext(Any_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterAnyListType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitAnyListType(this);
		}
	}
	public static class AnyTypeContext extends Any_typeContext {
		public TerminalNode ANY() { return getToken(EParser.ANY, 0); }
		public AnyTypeContext(Any_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterAnyType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitAnyType(this);
		}
	}
	public static class AnyDictTypeContext extends Any_typeContext {
		public Any_typeContext any_type() {
			return getRuleContext(Any_typeContext.class,0);
		}
		public TerminalNode LCURL() { return getToken(EParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(EParser.RCURL, 0); }
		public AnyDictTypeContext(Any_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterAnyDictType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitAnyDictType(this);
		}
	}

	public final Any_typeContext any_type() throws RecognitionException {
		return any_type(0);
	}

	private Any_typeContext any_type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Any_typeContext _localctx = new Any_typeContext(_ctx, _parentState);
		Any_typeContext _prevctx = _localctx;
		int _startState = 242;
		enterRecursionRule(_localctx, 242, RULE_any_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AnyTypeContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1956);
			match(ANY);
			}
			_ctx.stop = _input.LT(-1);
			setState(1966);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1964);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
					case 1:
						{
						_localctx = new AnyListTypeContext(new Any_typeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_any_type);
						setState(1958);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1959);
						match(LBRAK);
						setState(1960);
						match(RBRAK);
						}
						break;
					case 2:
						{
						_localctx = new AnyDictTypeContext(new Any_typeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_any_type);
						setState(1961);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1962);
						match(LCURL);
						setState(1963);
						match(RCURL);
						}
						break;
					}
					} 
				}
				setState(1968);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Member_method_declaration_listContext extends ParserRuleContext {
		public List<Member_method_declarationContext> member_method_declaration() {
			return getRuleContexts(Member_method_declarationContext.class);
		}
		public Member_method_declarationContext member_method_declaration(int i) {
			return getRuleContext(Member_method_declarationContext.class,i);
		}
		public List<LfpContext> lfp() {
			return getRuleContexts(LfpContext.class);
		}
		public LfpContext lfp(int i) {
			return getRuleContext(LfpContext.class,i);
		}
		public Member_method_declaration_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_method_declaration_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterMember_method_declaration_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitMember_method_declaration_list(this);
		}
	}

	public final Member_method_declaration_listContext member_method_declaration_list() throws RecognitionException {
		Member_method_declaration_listContext _localctx = new Member_method_declaration_listContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_member_method_declaration_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1969);
			member_method_declaration();
			setState(1975);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1970);
					lfp();
					setState(1971);
					member_method_declaration();
					}
					} 
				}
				setState(1977);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Member_method_declarationContext extends ParserRuleContext {
		public Setter_method_declarationContext setter_method_declaration() {
			return getRuleContext(Setter_method_declarationContext.class,0);
		}
		public Getter_method_declarationContext getter_method_declaration() {
			return getRuleContext(Getter_method_declarationContext.class,0);
		}
		public Concrete_method_declarationContext concrete_method_declaration() {
			return getRuleContext(Concrete_method_declarationContext.class,0);
		}
		public Abstract_method_declarationContext abstract_method_declaration() {
			return getRuleContext(Abstract_method_declarationContext.class,0);
		}
		public Operator_method_declarationContext operator_method_declaration() {
			return getRuleContext(Operator_method_declarationContext.class,0);
		}
		public List<Comment_statementContext> comment_statement() {
			return getRuleContexts(Comment_statementContext.class);
		}
		public Comment_statementContext comment_statement(int i) {
			return getRuleContext(Comment_statementContext.class,i);
		}
		public List<LfpContext> lfp() {
			return getRuleContexts(LfpContext.class);
		}
		public LfpContext lfp(int i) {
			return getRuleContext(LfpContext.class,i);
		}
		public List<Annotation_constructorContext> annotation_constructor() {
			return getRuleContexts(Annotation_constructorContext.class);
		}
		public Annotation_constructorContext annotation_constructor(int i) {
			return getRuleContext(Annotation_constructorContext.class,i);
		}
		public Member_method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_method_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterMember_method_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitMember_method_declaration(this);
		}
	}

	public final Member_method_declarationContext member_method_declaration() throws RecognitionException {
		Member_method_declarationContext _localctx = new Member_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_member_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1983);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(1978);
				comment_statement();
				setState(1979);
				lfp();
				}
				}
				setState(1985);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1991);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ARONDBASE_IDENTIFIER) {
				{
				{
				setState(1986);
				annotation_constructor();
				setState(1987);
				lfp();
				}
				}
				setState(1993);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1999);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				{
				setState(1994);
				setter_method_declaration();
				}
				break;
			case 2:
				{
				setState(1995);
				getter_method_declaration();
				}
				break;
			case 3:
				{
				setState(1996);
				concrete_method_declaration();
				}
				break;
			case 4:
				{
				setState(1997);
				abstract_method_declaration();
				}
				break;
			case 5:
				{
				setState(1998);
				operator_method_declaration();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Native_member_method_declaration_listContext extends ParserRuleContext {
		public List<Native_member_method_declarationContext> native_member_method_declaration() {
			return getRuleContexts(Native_member_method_declarationContext.class);
		}
		public Native_member_method_declarationContext native_member_method_declaration(int i) {
			return getRuleContext(Native_member_method_declarationContext.class,i);
		}
		public List<LfpContext> lfp() {
			return getRuleContexts(LfpContext.class);
		}
		public LfpContext lfp(int i) {
			return getRuleContext(LfpContext.class,i);
		}
		public Native_member_method_declaration_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_native_member_method_declaration_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterNative_member_method_declaration_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitNative_member_method_declaration_list(this);
		}
	}

	public final Native_member_method_declaration_listContext native_member_method_declaration_list() throws RecognitionException {
		Native_member_method_declaration_listContext _localctx = new Native_member_method_declaration_listContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_native_member_method_declaration_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2001);
			native_member_method_declaration();
			setState(2007);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,154,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2002);
					lfp();
					setState(2003);
					native_member_method_declaration();
					}
					} 
				}
				setState(2009);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,154,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Native_member_method_declarationContext extends ParserRuleContext {
		public Native_getter_declarationContext native_getter_declaration() {
			return getRuleContext(Native_getter_declarationContext.class,0);
		}
		public Native_setter_declarationContext native_setter_declaration() {
			return getRuleContext(Native_setter_declarationContext.class,0);
		}
		public Native_method_declarationContext native_method_declaration() {
			return getRuleContext(Native_method_declarationContext.class,0);
		}
		public Native_member_method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_native_member_method_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterNative_member_method_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitNative_member_method_declaration(this);
		}
	}

	public final Native_member_method_declarationContext native_member_method_declaration() throws RecognitionException {
		Native_member_method_declarationContext _localctx = new Native_member_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_native_member_method_declaration);
		try {
			setState(2013);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2010);
				native_getter_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2011);
				native_setter_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2012);
				native_method_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Native_category_bindingContext extends ParserRuleContext {
		public Native_category_bindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_native_category_binding; }
	 
		public Native_category_bindingContext() { }
		public void copyFrom(Native_category_bindingContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Python2CategoryBindingContext extends Native_category_bindingContext {
		public Python_category_bindingContext binding;
		public TerminalNode PYTHON2() { return getToken(EParser.PYTHON2, 0); }
		public Python_category_bindingContext python_category_binding() {
			return getRuleContext(Python_category_bindingContext.class,0);
		}
		public Python2CategoryBindingContext(Native_category_bindingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterPython2CategoryBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitPython2CategoryBinding(this);
		}
	}
	public static class Python3CategoryBindingContext extends Native_category_bindingContext {
		public Python_category_bindingContext binding;
		public TerminalNode PYTHON3() { return getToken(EParser.PYTHON3, 0); }
		public Python_category_bindingContext python_category_binding() {
			return getRuleContext(Python_category_bindingContext.class,0);
		}
		public Python3CategoryBindingContext(Native_category_bindingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterPython3CategoryBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitPython3CategoryBinding(this);
		}
	}
	public static class JavaCategoryBindingContext extends Native_category_bindingContext {
		public Java_class_identifier_expressionContext binding;
		public TerminalNode JAVA() { return getToken(EParser.JAVA, 0); }
		public Java_class_identifier_expressionContext java_class_identifier_expression() {
			return getRuleContext(Java_class_identifier_expressionContext.class,0);
		}
		public JavaCategoryBindingContext(Native_category_bindingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJavaCategoryBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJavaCategoryBinding(this);
		}
	}
	public static class CSharpCategoryBindingContext extends Native_category_bindingContext {
		public Csharp_identifier_expressionContext binding;
		public TerminalNode CSHARP() { return getToken(EParser.CSHARP, 0); }
		public Csharp_identifier_expressionContext csharp_identifier_expression() {
			return getRuleContext(Csharp_identifier_expressionContext.class,0);
		}
		public CSharpCategoryBindingContext(Native_category_bindingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterCSharpCategoryBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitCSharpCategoryBinding(this);
		}
	}
	public static class JavaScriptCategoryBindingContext extends Native_category_bindingContext {
		public Javascript_category_bindingContext binding;
		public TerminalNode JAVASCRIPT() { return getToken(EParser.JAVASCRIPT, 0); }
		public Javascript_category_bindingContext javascript_category_binding() {
			return getRuleContext(Javascript_category_bindingContext.class,0);
		}
		public JavaScriptCategoryBindingContext(Native_category_bindingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJavaScriptCategoryBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJavaScriptCategoryBinding(this);
		}
	}

	public final Native_category_bindingContext native_category_binding() throws RecognitionException {
		Native_category_bindingContext _localctx = new Native_category_bindingContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_native_category_binding);
		try {
			setState(2025);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JAVA:
				_localctx = new JavaCategoryBindingContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2015);
				match(JAVA);
				setState(2016);
				((JavaCategoryBindingContext)_localctx).binding = java_class_identifier_expression(0);
				}
				break;
			case CSHARP:
				_localctx = new CSharpCategoryBindingContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2017);
				match(CSHARP);
				setState(2018);
				((CSharpCategoryBindingContext)_localctx).binding = csharp_identifier_expression(0);
				}
				break;
			case PYTHON2:
				_localctx = new Python2CategoryBindingContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2019);
				match(PYTHON2);
				setState(2020);
				((Python2CategoryBindingContext)_localctx).binding = python_category_binding();
				}
				break;
			case PYTHON3:
				_localctx = new Python3CategoryBindingContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2021);
				match(PYTHON3);
				setState(2022);
				((Python3CategoryBindingContext)_localctx).binding = python_category_binding();
				}
				break;
			case JAVASCRIPT:
				_localctx = new JavaScriptCategoryBindingContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2023);
				match(JAVASCRIPT);
				setState(2024);
				((JavaScriptCategoryBindingContext)_localctx).binding = javascript_category_binding();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Python_category_bindingContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Python_moduleContext python_module() {
			return getRuleContext(Python_moduleContext.class,0);
		}
		public Python_category_bindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_python_category_binding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterPython_category_binding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitPython_category_binding(this);
		}
	}

	public final Python_category_bindingContext python_category_binding() throws RecognitionException {
		Python_category_bindingContext _localctx = new Python_category_bindingContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_python_category_binding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2027);
			identifier();
			setState(2029);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				{
				setState(2028);
				python_module();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Python_moduleContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(EParser.FROM, 0); }
		public Module_tokenContext module_token() {
			return getRuleContext(Module_tokenContext.class,0);
		}
		public TerminalNode COLON() { return getToken(EParser.COLON, 0); }
		public List<Python_identifierContext> python_identifier() {
			return getRuleContexts(Python_identifierContext.class);
		}
		public Python_identifierContext python_identifier(int i) {
			return getRuleContext(Python_identifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(EParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(EParser.DOT, i);
		}
		public Python_moduleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_python_module; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterPython_module(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitPython_module(this);
		}
	}

	public final Python_moduleContext python_module() throws RecognitionException {
		Python_moduleContext _localctx = new Python_moduleContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_python_module);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2031);
			match(FROM);
			setState(2032);
			module_token();
			setState(2033);
			match(COLON);
			setState(2034);
			python_identifier();
			setState(2039);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,158,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2035);
					match(DOT);
					setState(2036);
					python_identifier();
					}
					} 
				}
				setState(2041);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,158,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Javascript_category_bindingContext extends ParserRuleContext {
		public List<Javascript_identifierContext> javascript_identifier() {
			return getRuleContexts(Javascript_identifierContext.class);
		}
		public Javascript_identifierContext javascript_identifier(int i) {
			return getRuleContext(Javascript_identifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(EParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(EParser.DOT, i);
		}
		public Javascript_moduleContext javascript_module() {
			return getRuleContext(Javascript_moduleContext.class,0);
		}
		public Javascript_category_bindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javascript_category_binding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJavascript_category_binding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJavascript_category_binding(this);
		}
	}

	public final Javascript_category_bindingContext javascript_category_binding() throws RecognitionException {
		Javascript_category_bindingContext _localctx = new Javascript_category_bindingContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_javascript_category_binding);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2042);
			javascript_identifier();
			setState(2047);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2043);
					match(DOT);
					setState(2044);
					javascript_identifier();
					}
					} 
				}
				setState(2049);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
			}
			setState(2051);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				{
				setState(2050);
				javascript_module();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Javascript_moduleContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(EParser.FROM, 0); }
		public Module_tokenContext module_token() {
			return getRuleContext(Module_tokenContext.class,0);
		}
		public TerminalNode COLON() { return getToken(EParser.COLON, 0); }
		public List<Javascript_identifierContext> javascript_identifier() {
			return getRuleContexts(Javascript_identifierContext.class);
		}
		public Javascript_identifierContext javascript_identifier(int i) {
			return getRuleContext(Javascript_identifierContext.class,i);
		}
		public List<TerminalNode> SLASH() { return getTokens(EParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(EParser.SLASH, i);
		}
		public TerminalNode DOT() { return getToken(EParser.DOT, 0); }
		public Javascript_moduleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javascript_module; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJavascript_module(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJavascript_module(this);
		}
	}

	public final Javascript_moduleContext javascript_module() throws RecognitionException {
		Javascript_moduleContext _localctx = new Javascript_moduleContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_javascript_module);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2053);
			match(FROM);
			setState(2054);
			module_token();
			setState(2055);
			match(COLON);
			setState(2057);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SLASH) {
				{
				setState(2056);
				match(SLASH);
				}
			}

			setState(2059);
			javascript_identifier();
			setState(2064);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2060);
					match(SLASH);
					setState(2061);
					javascript_identifier();
					}
					} 
				}
				setState(2066);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
			}
			setState(2069);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				{
				setState(2067);
				match(DOT);
				setState(2068);
				javascript_identifier();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_identifier_listContext extends ParserRuleContext {
		public List<Variable_identifierContext> variable_identifier() {
			return getRuleContexts(Variable_identifierContext.class);
		}
		public Variable_identifierContext variable_identifier(int i) {
			return getRuleContext(Variable_identifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EParser.COMMA, i);
		}
		public Variable_identifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_identifier_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterVariable_identifier_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitVariable_identifier_list(this);
		}
	}

	public final Variable_identifier_listContext variable_identifier_list() throws RecognitionException {
		Variable_identifier_listContext _localctx = new Variable_identifier_listContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_variable_identifier_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2071);
			variable_identifier();
			setState(2076);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2072);
				match(COMMA);
				setState(2073);
				variable_identifier();
				}
				}
				setState(2078);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attribute_identifier_listContext extends ParserRuleContext {
		public List<Attribute_identifierContext> attribute_identifier() {
			return getRuleContexts(Attribute_identifierContext.class);
		}
		public Attribute_identifierContext attribute_identifier(int i) {
			return getRuleContext(Attribute_identifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EParser.COMMA, i);
		}
		public Attribute_identifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_identifier_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterAttribute_identifier_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitAttribute_identifier_list(this);
		}
	}

	public final Attribute_identifier_listContext attribute_identifier_list() throws RecognitionException {
		Attribute_identifier_listContext _localctx = new Attribute_identifier_listContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_attribute_identifier_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2079);
			attribute_identifier();
			setState(2084);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2080);
					match(COMMA);
					setState(2081);
					attribute_identifier();
					}
					} 
				}
				setState(2086);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_declarationContext extends ParserRuleContext {
		public Abstract_method_declarationContext abstract_method_declaration() {
			return getRuleContext(Abstract_method_declarationContext.class,0);
		}
		public Concrete_method_declarationContext concrete_method_declaration() {
			return getRuleContext(Concrete_method_declarationContext.class,0);
		}
		public Native_method_declarationContext native_method_declaration() {
			return getRuleContext(Native_method_declarationContext.class,0);
		}
		public Test_method_declarationContext test_method_declaration() {
			return getRuleContext(Test_method_declarationContext.class,0);
		}
		public Method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterMethod_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitMethod_declaration(this);
		}
	}

	public final Method_declarationContext method_declaration() throws RecognitionException {
		Method_declarationContext _localctx = new Method_declarationContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_method_declaration);
		try {
			setState(2091);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2087);
				abstract_method_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2088);
				concrete_method_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2089);
				native_method_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2090);
				test_method_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comment_statementContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(EParser.COMMENT, 0); }
		public Comment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterComment_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitComment_statement(this);
		}
	}

	public final Comment_statementContext comment_statement() throws RecognitionException {
		Comment_statementContext _localctx = new Comment_statementContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_comment_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2093);
			match(COMMENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Native_statement_listContext extends ParserRuleContext {
		public List<Native_statementContext> native_statement() {
			return getRuleContexts(Native_statementContext.class);
		}
		public Native_statementContext native_statement(int i) {
			return getRuleContext(Native_statementContext.class,i);
		}
		public List<LfpContext> lfp() {
			return getRuleContexts(LfpContext.class);
		}
		public LfpContext lfp(int i) {
			return getRuleContext(LfpContext.class,i);
		}
		public Native_statement_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_native_statement_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterNative_statement_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitNative_statement_list(this);
		}
	}

	public final Native_statement_listContext native_statement_list() throws RecognitionException {
		Native_statement_listContext _localctx = new Native_statement_listContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_native_statement_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2095);
			native_statement();
			setState(2101);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2096);
					lfp();
					setState(2097);
					native_statement();
					}
					} 
				}
				setState(2103);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Native_statementContext extends ParserRuleContext {
		public Native_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_native_statement; }
	 
		public Native_statementContext() { }
		public void copyFrom(Native_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CSharpNativeStatementContext extends Native_statementContext {
		public TerminalNode CSHARP() { return getToken(EParser.CSHARP, 0); }
		public Csharp_statementContext csharp_statement() {
			return getRuleContext(Csharp_statementContext.class,0);
		}
		public CSharpNativeStatementContext(Native_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterCSharpNativeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitCSharpNativeStatement(this);
		}
	}
	public static class JavaNativeStatementContext extends Native_statementContext {
		public TerminalNode JAVA() { return getToken(EParser.JAVA, 0); }
		public Java_statementContext java_statement() {
			return getRuleContext(Java_statementContext.class,0);
		}
		public JavaNativeStatementContext(Native_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJavaNativeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJavaNativeStatement(this);
		}
	}
	public static class JavaScriptNativeStatementContext extends Native_statementContext {
		public TerminalNode JAVASCRIPT() { return getToken(EParser.JAVASCRIPT, 0); }
		public Javascript_native_statementContext javascript_native_statement() {
			return getRuleContext(Javascript_native_statementContext.class,0);
		}
		public JavaScriptNativeStatementContext(Native_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJavaScriptNativeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJavaScriptNativeStatement(this);
		}
	}
	public static class Python2NativeStatementContext extends Native_statementContext {
		public TerminalNode PYTHON2() { return getToken(EParser.PYTHON2, 0); }
		public Python_native_statementContext python_native_statement() {
			return getRuleContext(Python_native_statementContext.class,0);
		}
		public Python2NativeStatementContext(Native_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterPython2NativeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitPython2NativeStatement(this);
		}
	}
	public static class Python3NativeStatementContext extends Native_statementContext {
		public TerminalNode PYTHON3() { return getToken(EParser.PYTHON3, 0); }
		public Python_native_statementContext python_native_statement() {
			return getRuleContext(Python_native_statementContext.class,0);
		}
		public Python3NativeStatementContext(Native_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterPython3NativeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitPython3NativeStatement(this);
		}
	}

	public final Native_statementContext native_statement() throws RecognitionException {
		Native_statementContext _localctx = new Native_statementContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_native_statement);
		try {
			setState(2114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JAVA:
				_localctx = new JavaNativeStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2104);
				match(JAVA);
				setState(2105);
				java_statement();
				}
				break;
			case CSHARP:
				_localctx = new CSharpNativeStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2106);
				match(CSHARP);
				setState(2107);
				csharp_statement();
				}
				break;
			case PYTHON2:
				_localctx = new Python2NativeStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2108);
				match(PYTHON2);
				setState(2109);
				python_native_statement();
				}
				break;
			case PYTHON3:
				_localctx = new Python3NativeStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2110);
				match(PYTHON3);
				setState(2111);
				python_native_statement();
				}
				break;
			case JAVASCRIPT:
				_localctx = new JavaScriptNativeStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2112);
				match(JAVASCRIPT);
				setState(2113);
				javascript_native_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Python_native_statementContext extends ParserRuleContext {
		public Python_statementContext python_statement() {
			return getRuleContext(Python_statementContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(EParser.SEMI, 0); }
		public Python_moduleContext python_module() {
			return getRuleContext(Python_moduleContext.class,0);
		}
		public Python_native_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_python_native_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterPython_native_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitPython_native_statement(this);
		}
	}

	public final Python_native_statementContext python_native_statement() throws RecognitionException {
		Python_native_statementContext _localctx = new Python_native_statementContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_python_native_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2116);
			python_statement();
			setState(2118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(2117);
				match(SEMI);
				}
			}

			setState(2121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(2120);
				python_module();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Javascript_native_statementContext extends ParserRuleContext {
		public Javascript_statementContext javascript_statement() {
			return getRuleContext(Javascript_statementContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(EParser.SEMI, 0); }
		public Javascript_moduleContext javascript_module() {
			return getRuleContext(Javascript_moduleContext.class,0);
		}
		public Javascript_native_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javascript_native_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJavascript_native_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJavascript_native_statement(this);
		}
	}

	public final Javascript_native_statementContext javascript_native_statement() throws RecognitionException {
		Javascript_native_statementContext _localctx = new Javascript_native_statementContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_javascript_native_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2123);
			javascript_statement();
			setState(2125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(2124);
				match(SEMI);
				}
			}

			setState(2128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(2127);
				javascript_module();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_listContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<LfpContext> lfp() {
			return getRuleContexts(LfpContext.class);
		}
		public LfpContext lfp(int i) {
			return getRuleContext(LfpContext.class,i);
		}
		public Statement_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterStatement_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitStatement_list(this);
		}
	}

	public final Statement_listContext statement_list() throws RecognitionException {
		Statement_listContext _localctx = new Statement_listContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_statement_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2130);
			statement();
			setState(2136);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2131);
					lfp();
					setState(2132);
					statement();
					}
					} 
				}
				setState(2138);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assertion_listContext extends ParserRuleContext {
		public List<AssertionContext> assertion() {
			return getRuleContexts(AssertionContext.class);
		}
		public AssertionContext assertion(int i) {
			return getRuleContext(AssertionContext.class,i);
		}
		public List<LfpContext> lfp() {
			return getRuleContexts(LfpContext.class);
		}
		public LfpContext lfp(int i) {
			return getRuleContext(LfpContext.class,i);
		}
		public Assertion_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertion_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterAssertion_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitAssertion_list(this);
		}
	}

	public final Assertion_listContext assertion_list() throws RecognitionException {
		Assertion_listContext _localctx = new Assertion_listContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_assertion_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2139);
			assertion();
			setState(2145);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,174,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2140);
					lfp();
					setState(2141);
					assertion();
					}
					} 
				}
				setState(2147);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,174,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_case_statement_listContext extends ParserRuleContext {
		public List<Switch_case_statementContext> switch_case_statement() {
			return getRuleContexts(Switch_case_statementContext.class);
		}
		public Switch_case_statementContext switch_case_statement(int i) {
			return getRuleContext(Switch_case_statementContext.class,i);
		}
		public List<LfpContext> lfp() {
			return getRuleContexts(LfpContext.class);
		}
		public LfpContext lfp(int i) {
			return getRuleContext(LfpContext.class,i);
		}
		public Switch_case_statement_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_case_statement_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterSwitch_case_statement_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitSwitch_case_statement_list(this);
		}
	}

	public final Switch_case_statement_listContext switch_case_statement_list() throws RecognitionException {
		Switch_case_statement_listContext _localctx = new Switch_case_statement_listContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_switch_case_statement_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2148);
			switch_case_statement();
			setState(2154);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2149);
					lfp();
					setState(2150);
					switch_case_statement();
					}
					} 
				}
				setState(2156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Catch_statement_listContext extends ParserRuleContext {
		public List<Catch_statementContext> catch_statement() {
			return getRuleContexts(Catch_statementContext.class);
		}
		public Catch_statementContext catch_statement(int i) {
			return getRuleContext(Catch_statementContext.class,i);
		}
		public List<LfpContext> lfp() {
			return getRuleContexts(LfpContext.class);
		}
		public LfpContext lfp(int i) {
			return getRuleContext(LfpContext.class,i);
		}
		public Catch_statement_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catch_statement_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterCatch_statement_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitCatch_statement_list(this);
		}
	}

	public final Catch_statement_listContext catch_statement_list() throws RecognitionException {
		Catch_statement_listContext _localctx = new Catch_statement_listContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_catch_statement_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2157);
			catch_statement();
			setState(2163);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2158);
					lfp();
					setState(2159);
					catch_statement();
					}
					} 
				}
				setState(2165);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Literal_collectionContext extends ParserRuleContext {
		public Literal_collectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_collection; }
	 
		public Literal_collectionContext() { }
		public void copyFrom(Literal_collectionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LiteralListLiteralContext extends Literal_collectionContext {
		public TerminalNode LBRAK() { return getToken(EParser.LBRAK, 0); }
		public Literal_list_literalContext literal_list_literal() {
			return getRuleContext(Literal_list_literalContext.class,0);
		}
		public TerminalNode RBRAK() { return getToken(EParser.RBRAK, 0); }
		public LiteralListLiteralContext(Literal_collectionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterLiteralListLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitLiteralListLiteral(this);
		}
	}
	public static class LiteralRangeLiteralContext extends Literal_collectionContext {
		public Atomic_literalContext low;
		public Atomic_literalContext high;
		public TerminalNode LBRAK() { return getToken(EParser.LBRAK, 0); }
		public TerminalNode RANGE() { return getToken(EParser.RANGE, 0); }
		public TerminalNode RBRAK() { return getToken(EParser.RBRAK, 0); }
		public List<Atomic_literalContext> atomic_literal() {
			return getRuleContexts(Atomic_literalContext.class);
		}
		public Atomic_literalContext atomic_literal(int i) {
			return getRuleContext(Atomic_literalContext.class,i);
		}
		public LiteralRangeLiteralContext(Literal_collectionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterLiteralRangeLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitLiteralRangeLiteral(this);
		}
	}
	public static class LiteralSetLiteralContext extends Literal_collectionContext {
		public TerminalNode LT() { return getToken(EParser.LT, 0); }
		public Literal_list_literalContext literal_list_literal() {
			return getRuleContext(Literal_list_literalContext.class,0);
		}
		public TerminalNode GT() { return getToken(EParser.GT, 0); }
		public LiteralSetLiteralContext(Literal_collectionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterLiteralSetLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitLiteralSetLiteral(this);
		}
	}

	public final Literal_collectionContext literal_collection() throws RecognitionException {
		Literal_collectionContext _localctx = new Literal_collectionContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_literal_collection);
		try {
			setState(2180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				_localctx = new LiteralRangeLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2166);
				match(LBRAK);
				setState(2167);
				((LiteralRangeLiteralContext)_localctx).low = atomic_literal();
				setState(2168);
				match(RANGE);
				setState(2169);
				((LiteralRangeLiteralContext)_localctx).high = atomic_literal();
				setState(2170);
				match(RBRAK);
				}
				break;
			case 2:
				_localctx = new LiteralListLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2172);
				match(LBRAK);
				setState(2173);
				literal_list_literal();
				setState(2174);
				match(RBRAK);
				}
				break;
			case 3:
				_localctx = new LiteralSetLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2176);
				match(LT);
				setState(2177);
				literal_list_literal();
				setState(2178);
				match(GT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Atomic_literalContext extends ParserRuleContext {
		public Atomic_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomic_literal; }
	 
		public Atomic_literalContext() { }
		public void copyFrom(Atomic_literalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MinIntegerLiteralContext extends Atomic_literalContext {
		public TerminalNode MIN_INTEGER() { return getToken(EParser.MIN_INTEGER, 0); }
		public MinIntegerLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterMinIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitMinIntegerLiteral(this);
		}
	}
	public static class DateLiteralContext extends Atomic_literalContext {
		public TerminalNode DATE_LITERAL() { return getToken(EParser.DATE_LITERAL, 0); }
		public DateLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterDateLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitDateLiteral(this);
		}
	}
	public static class SymbolLiteralContext extends Atomic_literalContext {
		public Symbol_identifierContext symbol_identifier() {
			return getRuleContext(Symbol_identifierContext.class,0);
		}
		public SymbolLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterSymbolLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitSymbolLiteral(this);
		}
	}
	public static class BooleanLiteralContext extends Atomic_literalContext {
		public TerminalNode BOOLEAN_LITERAL() { return getToken(EParser.BOOLEAN_LITERAL, 0); }
		public BooleanLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitBooleanLiteral(this);
		}
	}
	public static class VersionLiteralContext extends Atomic_literalContext {
		public TerminalNode VERSION_LITERAL() { return getToken(EParser.VERSION_LITERAL, 0); }
		public VersionLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterVersionLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitVersionLiteral(this);
		}
	}
	public static class HexadecimalLiteralContext extends Atomic_literalContext {
		public TerminalNode HEXA_LITERAL() { return getToken(EParser.HEXA_LITERAL, 0); }
		public HexadecimalLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterHexadecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitHexadecimalLiteral(this);
		}
	}
	public static class UUIDLiteralContext extends Atomic_literalContext {
		public TerminalNode UUID_LITERAL() { return getToken(EParser.UUID_LITERAL, 0); }
		public UUIDLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterUUIDLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitUUIDLiteral(this);
		}
	}
	public static class MaxIntegerLiteralContext extends Atomic_literalContext {
		public TerminalNode MAX_INTEGER() { return getToken(EParser.MAX_INTEGER, 0); }
		public MaxIntegerLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterMaxIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitMaxIntegerLiteral(this);
		}
	}
	public static class TypeLiteralContext extends Atomic_literalContext {
		public Type_literalContext type_literal() {
			return getRuleContext(Type_literalContext.class,0);
		}
		public TypeLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterTypeLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitTypeLiteral(this);
		}
	}
	public static class DateTimeLiteralContext extends Atomic_literalContext {
		public TerminalNode DATETIME_LITERAL() { return getToken(EParser.DATETIME_LITERAL, 0); }
		public DateTimeLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterDateTimeLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitDateTimeLiteral(this);
		}
	}
	public static class PeriodLiteralContext extends Atomic_literalContext {
		public TerminalNode PERIOD_LITERAL() { return getToken(EParser.PERIOD_LITERAL, 0); }
		public PeriodLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterPeriodLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitPeriodLiteral(this);
		}
	}
	public static class DecimalLiteralContext extends Atomic_literalContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(EParser.DECIMAL_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(EParser.MINUS, 0); }
		public DecimalLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitDecimalLiteral(this);
		}
	}
	public static class TextLiteralContext extends Atomic_literalContext {
		public TerminalNode TEXT_LITERAL() { return getToken(EParser.TEXT_LITERAL, 0); }
		public TextLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterTextLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitTextLiteral(this);
		}
	}
	public static class NullLiteralContext extends Atomic_literalContext {
		public Null_literalContext null_literal() {
			return getRuleContext(Null_literalContext.class,0);
		}
		public NullLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitNullLiteral(this);
		}
	}
	public static class IntegerLiteralContext extends Atomic_literalContext {
		public TerminalNode INTEGER_LITERAL() { return getToken(EParser.INTEGER_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(EParser.MINUS, 0); }
		public IntegerLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitIntegerLiteral(this);
		}
	}
	public static class TimeLiteralContext extends Atomic_literalContext {
		public TerminalNode TIME_LITERAL() { return getToken(EParser.TIME_LITERAL, 0); }
		public TimeLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterTimeLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitTimeLiteral(this);
		}
	}
	public static class CharacterLiteralContext extends Atomic_literalContext {
		public TerminalNode CHAR_LITERAL() { return getToken(EParser.CHAR_LITERAL, 0); }
		public CharacterLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterCharacterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitCharacterLiteral(this);
		}
	}

	public final Atomic_literalContext atomic_literal() throws RecognitionException {
		Atomic_literalContext _localctx = new Atomic_literalContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_atomic_literal);
		int _la;
		try {
			setState(2205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
			case 1:
				_localctx = new MinIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2182);
				match(MIN_INTEGER);
				}
				break;
			case 2:
				_localctx = new MaxIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2183);
				match(MAX_INTEGER);
				}
				break;
			case 3:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2184);
					match(MINUS);
					}
				}

				setState(2187);
				match(INTEGER_LITERAL);
				}
				break;
			case 4:
				_localctx = new HexadecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2188);
				match(HEXA_LITERAL);
				}
				break;
			case 5:
				_localctx = new CharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2189);
				match(CHAR_LITERAL);
				}
				break;
			case 6:
				_localctx = new DateLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2190);
				match(DATE_LITERAL);
				}
				break;
			case 7:
				_localctx = new TimeLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(2191);
				match(TIME_LITERAL);
				}
				break;
			case 8:
				_localctx = new TextLiteralContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(2192);
				match(TEXT_LITERAL);
				}
				break;
			case 9:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(2194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2193);
					match(MINUS);
					}
				}

				setState(2196);
				match(DECIMAL_LITERAL);
				}
				break;
			case 10:
				_localctx = new DateTimeLiteralContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(2197);
				match(DATETIME_LITERAL);
				}
				break;
			case 11:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(2198);
				match(BOOLEAN_LITERAL);
				}
				break;
			case 12:
				_localctx = new PeriodLiteralContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(2199);
				match(PERIOD_LITERAL);
				}
				break;
			case 13:
				_localctx = new VersionLiteralContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(2200);
				match(VERSION_LITERAL);
				}
				break;
			case 14:
				_localctx = new UUIDLiteralContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(2201);
				match(UUID_LITERAL);
				}
				break;
			case 15:
				_localctx = new SymbolLiteralContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(2202);
				symbol_identifier();
				}
				break;
			case 16:
				_localctx = new TypeLiteralContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(2203);
				type_literal();
				}
				break;
			case 17:
				_localctx = new NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(2204);
				null_literal();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Literal_list_literalContext extends ParserRuleContext {
		public List<Atomic_literalContext> atomic_literal() {
			return getRuleContexts(Atomic_literalContext.class);
		}
		public Atomic_literalContext atomic_literal(int i) {
			return getRuleContext(Atomic_literalContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EParser.COMMA, i);
		}
		public Literal_list_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_list_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterLiteral_list_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitLiteral_list_literal(this);
		}
	}

	public final Literal_list_literalContext literal_list_literal() throws RecognitionException {
		Literal_list_literalContext _localctx = new Literal_list_literalContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_literal_list_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2207);
			atomic_literal();
			setState(2212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2208);
				match(COMMA);
				setState(2209);
				atomic_literal();
				}
				}
				setState(2214);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class This_expressionContext extends ParserRuleContext {
		public TerminalNode SELF() { return getToken(EParser.SELF, 0); }
		public TerminalNode THIS() { return getToken(EParser.THIS, 0); }
		public This_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_this_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterThis_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitThis_expression(this);
		}
	}

	public final This_expressionContext this_expression() throws RecognitionException {
		This_expressionContext _localctx = new This_expressionContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_this_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2215);
			_la = _input.LA(1);
			if ( !(_la==SELF || _la==THIS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Super_expressionContext extends ParserRuleContext {
		public TerminalNode SUPER() { return getToken(EParser.SUPER, 0); }
		public Category_typeContext category_type() {
			return getRuleContext(Category_typeContext.class,0);
		}
		public TerminalNode DOT() { return getToken(EParser.DOT, 0); }
		public Super_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_super_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterSuper_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitSuper_expression(this);
		}
	}

	public final Super_expressionContext super_expression() throws RecognitionException {
		Super_expressionContext _localctx = new Super_expressionContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_super_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE_IDENTIFIER) {
				{
				setState(2217);
				category_type();
				setState(2218);
				match(DOT);
				}
			}

			setState(2222);
			match(SUPER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parenthesis_expressionContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(EParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(EParser.RPAR, 0); }
		public Parenthesis_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesis_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterParenthesis_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitParenthesis_expression(this);
		}
	}

	public final Parenthesis_expressionContext parenthesis_expression() throws RecognitionException {
		Parenthesis_expressionContext _localctx = new Parenthesis_expressionContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_parenthesis_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2224);
			match(LPAR);
			setState(2225);
			expression(0);
			setState(2226);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Literal_expressionContext extends ParserRuleContext {
		public Atomic_literalContext atomic_literal() {
			return getRuleContext(Atomic_literalContext.class,0);
		}
		public Collection_literalContext collection_literal() {
			return getRuleContext(Collection_literalContext.class,0);
		}
		public Literal_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterLiteral_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitLiteral_expression(this);
		}
	}

	public final Literal_expressionContext literal_expression() throws RecognitionException {
		Literal_expressionContext _localctx = new Literal_expressionContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_literal_expression);
		try {
			setState(2230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case TYPE:
			case NOTHING:
			case BOOLEAN_LITERAL:
			case CHAR_LITERAL:
			case MIN_INTEGER:
			case MAX_INTEGER:
			case SYMBOL_IDENTIFIER:
			case TEXT_LITERAL:
			case UUID_LITERAL:
			case INTEGER_LITERAL:
			case HEXA_LITERAL:
			case DECIMAL_LITERAL:
			case DATETIME_LITERAL:
			case TIME_LITERAL:
			case DATE_LITERAL:
			case PERIOD_LITERAL:
			case VERSION_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2228);
				atomic_literal();
				}
				break;
			case LPAR:
			case LBRAK:
			case LCURL:
			case LT:
			case LTCOLONGT:
			case MUTABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2229);
				collection_literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Collection_literalContext extends ParserRuleContext {
		public Range_literalContext range_literal() {
			return getRuleContext(Range_literalContext.class,0);
		}
		public List_literalContext list_literal() {
			return getRuleContext(List_literalContext.class,0);
		}
		public Set_literalContext set_literal() {
			return getRuleContext(Set_literalContext.class,0);
		}
		public Dict_literalContext dict_literal() {
			return getRuleContext(Dict_literalContext.class,0);
		}
		public Document_literalContext document_literal() {
			return getRuleContext(Document_literalContext.class,0);
		}
		public Tuple_literalContext tuple_literal() {
			return getRuleContext(Tuple_literalContext.class,0);
		}
		public Collection_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collection_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterCollection_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitCollection_literal(this);
		}
	}

	public final Collection_literalContext collection_literal() throws RecognitionException {
		Collection_literalContext _localctx = new Collection_literalContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_collection_literal);
		try {
			setState(2238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2232);
				range_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2233);
				list_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2234);
				set_literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2235);
				dict_literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2236);
				document_literal();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2237);
				tuple_literal();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tuple_literalContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(EParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EParser.RPAR, 0); }
		public TerminalNode MUTABLE() { return getToken(EParser.MUTABLE, 0); }
		public Expression_tupleContext expression_tuple() {
			return getRuleContext(Expression_tupleContext.class,0);
		}
		public Tuple_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterTuple_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitTuple_literal(this);
		}
	}

	public final Tuple_literalContext tuple_literal() throws RecognitionException {
		Tuple_literalContext _localctx = new Tuple_literalContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_tuple_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUTABLE) {
				{
				setState(2240);
				match(MUTABLE);
				}
			}

			setState(2243);
			match(LPAR);
			setState(2245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << LTCOLONGT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (METHOD_COLON - 64)) | (1L << (CODE - 64)) | (1L << (DOCUMENT - 64)) | (1L << (BLOB - 64)) | (1L << (TYPE - 64)) | (1L << (EXECUTE - 64)) | (1L << (FETCH - 64)) | (1L << (INVOKE_COLON - 64)) | (1L << (MUTABLE - 64)) | (1L << (NOT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (NOTHING - 128)) | (1L << (READ - 128)) | (1L << (SELF - 128)) | (1L << (SORTED - 128)) | (1L << (SUPER - 128)) | (1L << (THIS - 128)) | (1L << (BOOLEAN_LITERAL - 128)) | (1L << (CHAR_LITERAL - 128)) | (1L << (MIN_INTEGER - 128)) | (1L << (MAX_INTEGER - 128)) | (1L << (SYMBOL_IDENTIFIER - 128)) | (1L << (TYPE_IDENTIFIER - 128)) | (1L << (VARIABLE_IDENTIFIER - 128)) | (1L << (TEXT_LITERAL - 128)) | (1L << (UUID_LITERAL - 128)) | (1L << (INTEGER_LITERAL - 128)) | (1L << (HEXA_LITERAL - 128)) | (1L << (DECIMAL_LITERAL - 128)) | (1L << (DATETIME_LITERAL - 128)) | (1L << (TIME_LITERAL - 128)) | (1L << (DATE_LITERAL - 128)) | (1L << (PERIOD_LITERAL - 128)) | (1L << (VERSION_LITERAL - 128)))) != 0)) {
				{
				setState(2244);
				expression_tuple();
				}
			}

			setState(2247);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dict_literalContext extends ParserRuleContext {
		public TerminalNode LTCOLONGT() { return getToken(EParser.LTCOLONGT, 0); }
		public TerminalNode MUTABLE() { return getToken(EParser.MUTABLE, 0); }
		public TerminalNode LT() { return getToken(EParser.LT, 0); }
		public Dict_entry_listContext dict_entry_list() {
			return getRuleContext(Dict_entry_listContext.class,0);
		}
		public TerminalNode GT() { return getToken(EParser.GT, 0); }
		public TerminalNode COLON() { return getToken(EParser.COLON, 0); }
		public Dict_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dict_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterDict_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitDict_literal(this);
		}
	}

	public final Dict_literalContext dict_literal() throws RecognitionException {
		Dict_literalContext _localctx = new Dict_literalContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_dict_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUTABLE) {
				{
				setState(2249);
				match(MUTABLE);
				}
			}

			setState(2260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				{
				{
				setState(2252);
				match(LT);
				setState(2253);
				dict_entry_list();
				setState(2254);
				match(GT);
				}
				}
				break;
			case 2:
				{
				setState(2256);
				match(LTCOLONGT);
				}
				break;
			case 3:
				{
				{
				setState(2257);
				match(LT);
				setState(2258);
				match(COLON);
				setState(2259);
				match(GT);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Document_literalContext extends ParserRuleContext {
		public TerminalNode LCURL() { return getToken(EParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(EParser.RCURL, 0); }
		public Doc_entry_listContext doc_entry_list() {
			return getRuleContext(Doc_entry_listContext.class,0);
		}
		public Document_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterDocument_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitDocument_literal(this);
		}
	}

	public final Document_literalContext document_literal() throws RecognitionException {
		Document_literalContext _localctx = new Document_literalContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_document_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2262);
			match(LCURL);
			setState(2264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA) | (1L << CSHARP) | (1L << PYTHON2) | (1L << PYTHON3) | (1L << JAVASCRIPT) | (1L << SWIFT) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (CODE - 65)) | (1L << (DOCUMENT - 65)) | (1L << (BLOB - 65)) | (1L << (IMAGE - 65)) | (1L << (UUID - 65)) | (1L << (ITERATOR - 65)) | (1L << (CURSOR - 65)) | (1L << (HTML - 65)) | (1L << (ABSTRACT - 65)) | (1L << (ALL - 65)) | (1L << (ALWAYS - 65)) | (1L << (AND - 65)) | (1L << (ANY - 65)) | (1L << (AS - 65)) | (1L << (ASC - 65)) | (1L << (ATTR - 65)) | (1L << (ATTRIBUTE - 65)) | (1L << (ATTRIBUTES - 65)) | (1L << (BINDINGS - 65)) | (1L << (BREAK - 65)) | (1L << (BY - 65)) | (1L << (CASE - 65)) | (1L << (CATCH - 65)) | (1L << (CATEGORY - 65)) | (1L << (CLASS - 65)) | (1L << (CONTAINS - 65)) | (1L << (DEF - 65)) | (1L << (DEFAULT - 65)) | (1L << (DEFINE - 65)) | (1L << (DELETE - 65)) | (1L << (DESC - 65)) | (1L << (DO - 65)) | (1L << (DOING - 65)) | (1L << (EACH - 65)) | (1L << (ELSE - 65)) | (1L << (ENUM - 65)) | (1L << (ENUMERATED - 65)) | (1L << (EXCEPT - 65)) | (1L << (EXECUTE - 65)) | (1L << (EXPECTING - 65)) | (1L << (EXTENDS - 65)) | (1L << (FETCH - 65)) | (1L << (FILTERED - 65)) | (1L << (FINALLY - 65)) | (1L << (FLUSH - 65)) | (1L << (FOR - 65)) | (1L << (FROM - 65)) | (1L << (GETTER - 65)) | (1L << (HAS - 65)) | (1L << (IF - 65)) | (1L << (IN - 65)) | (1L << (INDEX - 65)) | (1L << (IS - 65)) | (1L << (MATCHING - 65)) | (1L << (METHOD - 65)) | (1L << (METHODS - 65)) | (1L << (MODULO - 65)) | (1L << (MUTABLE - 65)) | (1L << (NATIVE - 65)) | (1L << (NONE - 65)) | (1L << (NOT - 65)) | (1L << (NOTHING - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (NULL - 129)) | (1L << (ON - 129)) | (1L << (ONE - 129)) | (1L << (OPERATOR - 129)) | (1L << (OR - 129)) | (1L << (ORDER - 129)) | (1L << (OTHERWISE - 129)) | (1L << (PASS - 129)) | (1L << (RAISE - 129)) | (1L << (READ - 129)) | (1L << (RECEIVING - 129)) | (1L << (RESOURCE - 129)) | (1L << (RETURN - 129)) | (1L << (RETURNING - 129)) | (1L << (ROWS - 129)) | (1L << (SELF - 129)) | (1L << (SETTER - 129)) | (1L << (SINGLETON - 129)) | (1L << (SORTED - 129)) | (1L << (STORABLE - 129)) | (1L << (STORE - 129)) | (1L << (SUPER - 129)) | (1L << (SWITCH - 129)) | (1L << (TEST - 129)) | (1L << (THIS - 129)) | (1L << (THROW - 129)) | (1L << (TO - 129)) | (1L << (TRY - 129)) | (1L << (VERIFYING - 129)) | (1L << (WIDGET - 129)) | (1L << (WITH - 129)) | (1L << (WHEN - 129)) | (1L << (WHERE - 129)) | (1L << (WHILE - 129)) | (1L << (WRITE - 129)) | (1L << (SYMBOL_IDENTIFIER - 129)) | (1L << (TYPE_IDENTIFIER - 129)) | (1L << (VARIABLE_IDENTIFIER - 129)) | (1L << (TEXT_LITERAL - 129)))) != 0)) {
				{
				setState(2263);
				doc_entry_list();
				}
			}

			setState(2266);
			match(RCURL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression_tupleContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EParser.COMMA, i);
		}
		public Expression_tupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_tuple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterExpression_tuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitExpression_tuple(this);
		}
	}

	public final Expression_tupleContext expression_tuple() throws RecognitionException {
		Expression_tupleContext _localctx = new Expression_tupleContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_expression_tuple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2268);
			expression(0);
			setState(2269);
			match(COMMA);
			setState(2278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << LTCOLONGT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (METHOD_COLON - 64)) | (1L << (CODE - 64)) | (1L << (DOCUMENT - 64)) | (1L << (BLOB - 64)) | (1L << (TYPE - 64)) | (1L << (EXECUTE - 64)) | (1L << (FETCH - 64)) | (1L << (INVOKE_COLON - 64)) | (1L << (MUTABLE - 64)) | (1L << (NOT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (NOTHING - 128)) | (1L << (READ - 128)) | (1L << (SELF - 128)) | (1L << (SORTED - 128)) | (1L << (SUPER - 128)) | (1L << (THIS - 128)) | (1L << (BOOLEAN_LITERAL - 128)) | (1L << (CHAR_LITERAL - 128)) | (1L << (MIN_INTEGER - 128)) | (1L << (MAX_INTEGER - 128)) | (1L << (SYMBOL_IDENTIFIER - 128)) | (1L << (TYPE_IDENTIFIER - 128)) | (1L << (VARIABLE_IDENTIFIER - 128)) | (1L << (TEXT_LITERAL - 128)) | (1L << (UUID_LITERAL - 128)) | (1L << (INTEGER_LITERAL - 128)) | (1L << (HEXA_LITERAL - 128)) | (1L << (DECIMAL_LITERAL - 128)) | (1L << (DATETIME_LITERAL - 128)) | (1L << (TIME_LITERAL - 128)) | (1L << (DATE_LITERAL - 128)) | (1L << (PERIOD_LITERAL - 128)) | (1L << (VERSION_LITERAL - 128)))) != 0)) {
				{
				setState(2270);
				expression(0);
				setState(2275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2271);
					match(COMMA);
					setState(2272);
					expression(0);
					}
					}
					setState(2277);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Doc_entry_listContext extends ParserRuleContext {
		public List<Doc_entryContext> doc_entry() {
			return getRuleContexts(Doc_entryContext.class);
		}
		public Doc_entryContext doc_entry(int i) {
			return getRuleContext(Doc_entryContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EParser.COMMA, i);
		}
		public Doc_entry_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doc_entry_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterDoc_entry_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitDoc_entry_list(this);
		}
	}

	public final Doc_entry_listContext doc_entry_list() throws RecognitionException {
		Doc_entry_listContext _localctx = new Doc_entry_listContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_doc_entry_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2280);
			doc_entry();
			setState(2285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2281);
				match(COMMA);
				setState(2282);
				doc_entry();
				}
				}
				setState(2287);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Doc_entryContext extends ParserRuleContext {
		public Doc_keyContext key;
		public ExpressionContext value;
		public TerminalNode COLON() { return getToken(EParser.COLON, 0); }
		public Doc_keyContext doc_key() {
			return getRuleContext(Doc_keyContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Doc_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doc_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterDoc_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitDoc_entry(this);
		}
	}

	public final Doc_entryContext doc_entry() throws RecognitionException {
		Doc_entryContext _localctx = new Doc_entryContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_doc_entry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2288);
			((Doc_entryContext)_localctx).key = doc_key();
			setState(2289);
			match(COLON);
			setState(2290);
			((Doc_entryContext)_localctx).value = expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Doc_keyContext extends ParserRuleContext {
		public Doc_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doc_key; }
	 
		public Doc_keyContext() { }
		public void copyFrom(Doc_keyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DocKeyIdentifierContext extends Doc_keyContext {
		public Identifier_or_keywordContext name;
		public Identifier_or_keywordContext identifier_or_keyword() {
			return getRuleContext(Identifier_or_keywordContext.class,0);
		}
		public DocKeyIdentifierContext(Doc_keyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterDocKeyIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitDocKeyIdentifier(this);
		}
	}
	public static class DocKeyTextContext extends Doc_keyContext {
		public Token name;
		public TerminalNode TEXT_LITERAL() { return getToken(EParser.TEXT_LITERAL, 0); }
		public DocKeyTextContext(Doc_keyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterDocKeyText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitDocKeyText(this);
		}
	}

	public final Doc_keyContext doc_key() throws RecognitionException {
		Doc_keyContext _localctx = new Doc_keyContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_doc_key);
		try {
			setState(2294);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JAVA:
			case CSHARP:
			case PYTHON2:
			case PYTHON3:
			case JAVASCRIPT:
			case SWIFT:
			case BOOLEAN:
			case CHARACTER:
			case TEXT:
			case INTEGER:
			case DECIMAL:
			case DATE:
			case TIME:
			case DATETIME:
			case PERIOD:
			case VERSION:
			case CODE:
			case DOCUMENT:
			case BLOB:
			case IMAGE:
			case UUID:
			case ITERATOR:
			case CURSOR:
			case HTML:
			case ABSTRACT:
			case ALL:
			case ALWAYS:
			case AND:
			case ANY:
			case AS:
			case ASC:
			case ATTR:
			case ATTRIBUTE:
			case ATTRIBUTES:
			case BINDINGS:
			case BREAK:
			case BY:
			case CASE:
			case CATCH:
			case CATEGORY:
			case CLASS:
			case CONTAINS:
			case DEF:
			case DEFAULT:
			case DEFINE:
			case DELETE:
			case DESC:
			case DO:
			case DOING:
			case EACH:
			case ELSE:
			case ENUM:
			case ENUMERATED:
			case EXCEPT:
			case EXECUTE:
			case EXPECTING:
			case EXTENDS:
			case FETCH:
			case FILTERED:
			case FINALLY:
			case FLUSH:
			case FOR:
			case FROM:
			case GETTER:
			case HAS:
			case IF:
			case IN:
			case INDEX:
			case IS:
			case MATCHING:
			case METHOD:
			case METHODS:
			case MODULO:
			case MUTABLE:
			case NATIVE:
			case NONE:
			case NOT:
			case NOTHING:
			case NULL:
			case ON:
			case ONE:
			case OPERATOR:
			case OR:
			case ORDER:
			case OTHERWISE:
			case PASS:
			case RAISE:
			case READ:
			case RECEIVING:
			case RESOURCE:
			case RETURN:
			case RETURNING:
			case ROWS:
			case SELF:
			case SETTER:
			case SINGLETON:
			case SORTED:
			case STORABLE:
			case STORE:
			case SUPER:
			case SWITCH:
			case TEST:
			case THIS:
			case THROW:
			case TO:
			case TRY:
			case VERIFYING:
			case WIDGET:
			case WITH:
			case WHEN:
			case WHERE:
			case WHILE:
			case WRITE:
			case SYMBOL_IDENTIFIER:
			case TYPE_IDENTIFIER:
			case VARIABLE_IDENTIFIER:
				_localctx = new DocKeyIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2292);
				((DocKeyIdentifierContext)_localctx).name = identifier_or_keyword();
				}
				break;
			case TEXT_LITERAL:
				_localctx = new DocKeyTextContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2293);
				((DocKeyTextContext)_localctx).name = match(TEXT_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dict_entry_listContext extends ParserRuleContext {
		public List<Dict_entryContext> dict_entry() {
			return getRuleContexts(Dict_entryContext.class);
		}
		public Dict_entryContext dict_entry(int i) {
			return getRuleContext(Dict_entryContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EParser.COMMA, i);
		}
		public Dict_entry_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dict_entry_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterDict_entry_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitDict_entry_list(this);
		}
	}

	public final Dict_entry_listContext dict_entry_list() throws RecognitionException {
		Dict_entry_listContext _localctx = new Dict_entry_listContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_dict_entry_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2296);
			dict_entry();
			setState(2301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2297);
				match(COMMA);
				setState(2298);
				dict_entry();
				}
				}
				setState(2303);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dict_entryContext extends ParserRuleContext {
		public Dict_keyContext key;
		public ExpressionContext value;
		public TerminalNode COLON() { return getToken(EParser.COLON, 0); }
		public Dict_keyContext dict_key() {
			return getRuleContext(Dict_keyContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Dict_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dict_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterDict_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitDict_entry(this);
		}
	}

	public final Dict_entryContext dict_entry() throws RecognitionException {
		Dict_entryContext _localctx = new Dict_entryContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_dict_entry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2304);
			((Dict_entryContext)_localctx).key = dict_key();
			setState(2305);
			match(COLON);
			setState(2306);
			((Dict_entryContext)_localctx).value = expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dict_keyContext extends ParserRuleContext {
		public Dict_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dict_key; }
	 
		public Dict_keyContext() { }
		public void copyFrom(Dict_keyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DictKeyIdentifierContext extends Dict_keyContext {
		public Identifier_or_keywordContext name;
		public Identifier_or_keywordContext identifier_or_keyword() {
			return getRuleContext(Identifier_or_keywordContext.class,0);
		}
		public DictKeyIdentifierContext(Dict_keyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterDictKeyIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitDictKeyIdentifier(this);
		}
	}
	public static class DictKeyTextContext extends Dict_keyContext {
		public Token name;
		public TerminalNode TEXT_LITERAL() { return getToken(EParser.TEXT_LITERAL, 0); }
		public DictKeyTextContext(Dict_keyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterDictKeyText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitDictKeyText(this);
		}
	}

	public final Dict_keyContext dict_key() throws RecognitionException {
		Dict_keyContext _localctx = new Dict_keyContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_dict_key);
		try {
			setState(2310);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JAVA:
			case CSHARP:
			case PYTHON2:
			case PYTHON3:
			case JAVASCRIPT:
			case SWIFT:
			case BOOLEAN:
			case CHARACTER:
			case TEXT:
			case INTEGER:
			case DECIMAL:
			case DATE:
			case TIME:
			case DATETIME:
			case PERIOD:
			case VERSION:
			case CODE:
			case DOCUMENT:
			case BLOB:
			case IMAGE:
			case UUID:
			case ITERATOR:
			case CURSOR:
			case HTML:
			case ABSTRACT:
			case ALL:
			case ALWAYS:
			case AND:
			case ANY:
			case AS:
			case ASC:
			case ATTR:
			case ATTRIBUTE:
			case ATTRIBUTES:
			case BINDINGS:
			case BREAK:
			case BY:
			case CASE:
			case CATCH:
			case CATEGORY:
			case CLASS:
			case CONTAINS:
			case DEF:
			case DEFAULT:
			case DEFINE:
			case DELETE:
			case DESC:
			case DO:
			case DOING:
			case EACH:
			case ELSE:
			case ENUM:
			case ENUMERATED:
			case EXCEPT:
			case EXECUTE:
			case EXPECTING:
			case EXTENDS:
			case FETCH:
			case FILTERED:
			case FINALLY:
			case FLUSH:
			case FOR:
			case FROM:
			case GETTER:
			case HAS:
			case IF:
			case IN:
			case INDEX:
			case IS:
			case MATCHING:
			case METHOD:
			case METHODS:
			case MODULO:
			case MUTABLE:
			case NATIVE:
			case NONE:
			case NOT:
			case NOTHING:
			case NULL:
			case ON:
			case ONE:
			case OPERATOR:
			case OR:
			case ORDER:
			case OTHERWISE:
			case PASS:
			case RAISE:
			case READ:
			case RECEIVING:
			case RESOURCE:
			case RETURN:
			case RETURNING:
			case ROWS:
			case SELF:
			case SETTER:
			case SINGLETON:
			case SORTED:
			case STORABLE:
			case STORE:
			case SUPER:
			case SWITCH:
			case TEST:
			case THIS:
			case THROW:
			case TO:
			case TRY:
			case VERIFYING:
			case WIDGET:
			case WITH:
			case WHEN:
			case WHERE:
			case WHILE:
			case WRITE:
			case SYMBOL_IDENTIFIER:
			case TYPE_IDENTIFIER:
			case VARIABLE_IDENTIFIER:
				_localctx = new DictKeyIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2308);
				((DictKeyIdentifierContext)_localctx).name = identifier_or_keyword();
				}
				break;
			case TEXT_LITERAL:
				_localctx = new DictKeyTextContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2309);
				((DictKeyTextContext)_localctx).name = match(TEXT_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Slice_argumentsContext extends ParserRuleContext {
		public Slice_argumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slice_arguments; }
	 
		public Slice_argumentsContext() { }
		public void copyFrom(Slice_argumentsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SliceFirstAndLastContext extends Slice_argumentsContext {
		public ExpressionContext first;
		public ExpressionContext last;
		public TerminalNode COLON() { return getToken(EParser.COLON, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SliceFirstAndLastContext(Slice_argumentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterSliceFirstAndLast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitSliceFirstAndLast(this);
		}
	}
	public static class SliceLastOnlyContext extends Slice_argumentsContext {
		public ExpressionContext last;
		public TerminalNode COLON() { return getToken(EParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SliceLastOnlyContext(Slice_argumentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterSliceLastOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitSliceLastOnly(this);
		}
	}
	public static class SliceFirstOnlyContext extends Slice_argumentsContext {
		public ExpressionContext first;
		public TerminalNode COLON() { return getToken(EParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SliceFirstOnlyContext(Slice_argumentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterSliceFirstOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitSliceFirstOnly(this);
		}
	}

	public final Slice_argumentsContext slice_arguments() throws RecognitionException {
		Slice_argumentsContext _localctx = new Slice_argumentsContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_slice_arguments);
		try {
			setState(2321);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				_localctx = new SliceFirstAndLastContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2312);
				((SliceFirstAndLastContext)_localctx).first = expression(0);
				setState(2313);
				match(COLON);
				setState(2314);
				((SliceFirstAndLastContext)_localctx).last = expression(0);
				}
				break;
			case 2:
				_localctx = new SliceFirstOnlyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2316);
				((SliceFirstOnlyContext)_localctx).first = expression(0);
				setState(2317);
				match(COLON);
				}
				break;
			case 3:
				_localctx = new SliceLastOnlyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2319);
				match(COLON);
				setState(2320);
				((SliceLastOnlyContext)_localctx).last = expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assign_variable_statementContext extends ParserRuleContext {
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Assign_variable_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_variable_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterAssign_variable_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitAssign_variable_statement(this);
		}
	}

	public final Assign_variable_statementContext assign_variable_statement() throws RecognitionException {
		Assign_variable_statementContext _localctx = new Assign_variable_statementContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_assign_variable_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2323);
			variable_identifier();
			setState(2324);
			assign();
			setState(2325);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignable_instanceContext extends ParserRuleContext {
		public Assignable_instanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignable_instance; }
	 
		public Assignable_instanceContext() { }
		public void copyFrom(Assignable_instanceContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ChildInstanceContext extends Assignable_instanceContext {
		public Assignable_instanceContext assignable_instance() {
			return getRuleContext(Assignable_instanceContext.class,0);
		}
		public Child_instanceContext child_instance() {
			return getRuleContext(Child_instanceContext.class,0);
		}
		public ChildInstanceContext(Assignable_instanceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterChildInstance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitChildInstance(this);
		}
	}
	public static class RootInstanceContext extends Assignable_instanceContext {
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public RootInstanceContext(Assignable_instanceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterRootInstance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitRootInstance(this);
		}
	}

	public final Assignable_instanceContext assignable_instance() throws RecognitionException {
		return assignable_instance(0);
	}

	private Assignable_instanceContext assignable_instance(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Assignable_instanceContext _localctx = new Assignable_instanceContext(_ctx, _parentState);
		Assignable_instanceContext _prevctx = _localctx;
		int _startState = 326;
		enterRecursionRule(_localctx, 326, RULE_assignable_instance, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new RootInstanceContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2328);
			variable_identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(2334);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ChildInstanceContext(new Assignable_instanceContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_assignable_instance);
					setState(2330);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2331);
					child_instance();
					}
					} 
				}
				setState(2336);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Is_expressionContext extends ParserRuleContext {
		public Is_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_is_expression; }
	 
		public Is_expressionContext() { }
		public void copyFrom(Is_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IsATypeExpressionContext extends Is_expressionContext {
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(EParser.VARIABLE_IDENTIFIER, 0); }
		public Category_or_any_typeContext category_or_any_type() {
			return getRuleContext(Category_or_any_typeContext.class,0);
		}
		public IsATypeExpressionContext(Is_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterIsATypeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitIsATypeExpression(this);
		}
	}
	public static class IsOtherExpressionContext extends Is_expressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IsOtherExpressionContext(Is_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterIsOtherExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitIsOtherExpression(this);
		}
	}

	public final Is_expressionContext is_expression() throws RecognitionException {
		Is_expressionContext _localctx = new Is_expressionContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_is_expression);
		try {
			setState(2341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
			case 1:
				_localctx = new IsATypeExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2337);
				if (!(this.willBeAOrAn())) throw new FailedPredicateException(this, "$parser.willBeAOrAn()");
				setState(2338);
				match(VARIABLE_IDENTIFIER);
				setState(2339);
				category_or_any_type();
				}
				break;
			case 2:
				_localctx = new IsOtherExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2340);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arrow_expressionContext extends ParserRuleContext {
		public Arrow_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrow_expression; }
	 
		public Arrow_expressionContext() { }
		public void copyFrom(Arrow_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrowExpressionBodyContext extends Arrow_expressionContext {
		public Arrow_prefixContext arrow_prefix() {
			return getRuleContext(Arrow_prefixContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrowExpressionBodyContext(Arrow_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterArrowExpressionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitArrowExpressionBody(this);
		}
	}
	public static class ArrowStatementsBodyContext extends Arrow_expressionContext {
		public Arrow_prefixContext arrow_prefix() {
			return getRuleContext(Arrow_prefixContext.class,0);
		}
		public TerminalNode LCURL() { return getToken(EParser.LCURL, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public TerminalNode RCURL() { return getToken(EParser.RCURL, 0); }
		public ArrowStatementsBodyContext(Arrow_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterArrowStatementsBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitArrowStatementsBody(this);
		}
	}

	public final Arrow_expressionContext arrow_expression() throws RecognitionException {
		Arrow_expressionContext _localctx = new Arrow_expressionContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_arrow_expression);
		try {
			setState(2351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				_localctx = new ArrowExpressionBodyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2343);
				arrow_prefix();
				setState(2344);
				expression(0);
				}
				break;
			case 2:
				_localctx = new ArrowStatementsBodyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2346);
				arrow_prefix();
				setState(2347);
				match(LCURL);
				setState(2348);
				statement_list();
				setState(2349);
				match(RCURL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arrow_prefixContext extends ParserRuleContext {
		public Ws_plusContext s1;
		public Ws_plusContext s2;
		public Arrow_argsContext arrow_args() {
			return getRuleContext(Arrow_argsContext.class,0);
		}
		public TerminalNode EGT() { return getToken(EParser.EGT, 0); }
		public List<Ws_plusContext> ws_plus() {
			return getRuleContexts(Ws_plusContext.class);
		}
		public Ws_plusContext ws_plus(int i) {
			return getRuleContext(Ws_plusContext.class,i);
		}
		public Arrow_prefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrow_prefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterArrow_prefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitArrow_prefix(this);
		}
	}

	public final Arrow_prefixContext arrow_prefix() throws RecognitionException {
		Arrow_prefixContext _localctx = new Arrow_prefixContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_arrow_prefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2353);
			arrow_args();
			setState(2354);
			((Arrow_prefixContext)_localctx).s1 = ws_plus();
			setState(2355);
			match(EGT);
			setState(2356);
			((Arrow_prefixContext)_localctx).s2 = ws_plus();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arrow_argsContext extends ParserRuleContext {
		public Arrow_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrow_args; }
	 
		public Arrow_argsContext() { }
		public void copyFrom(Arrow_argsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrowListArgContext extends Arrow_argsContext {
		public TerminalNode LPAR() { return getToken(EParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EParser.RPAR, 0); }
		public Variable_identifier_listContext variable_identifier_list() {
			return getRuleContext(Variable_identifier_listContext.class,0);
		}
		public ArrowListArgContext(Arrow_argsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterArrowListArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitArrowListArg(this);
		}
	}
	public static class ArrowSingleArgContext extends Arrow_argsContext {
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public ArrowSingleArgContext(Arrow_argsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterArrowSingleArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitArrowSingleArg(this);
		}
	}

	public final Arrow_argsContext arrow_args() throws RecognitionException {
		Arrow_argsContext _localctx = new Arrow_argsContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_arrow_args);
		int _la;
		try {
			setState(2364);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE_IDENTIFIER:
				_localctx = new ArrowSingleArgContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2358);
				variable_identifier();
				}
				break;
			case LPAR:
				_localctx = new ArrowListArgContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2359);
				match(LPAR);
				setState(2361);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VARIABLE_IDENTIFIER) {
					{
					setState(2360);
					variable_identifier_list();
					}
				}

				setState(2363);
				match(RPAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sorted_keyContext extends ParserRuleContext {
		public Instance_expressionContext instance_expression() {
			return getRuleContext(Instance_expressionContext.class,0);
		}
		public Arrow_expressionContext arrow_expression() {
			return getRuleContext(Arrow_expressionContext.class,0);
		}
		public Sorted_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sorted_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterSorted_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitSorted_key(this);
		}
	}

	public final Sorted_keyContext sorted_key() throws RecognitionException {
		Sorted_keyContext _localctx = new Sorted_keyContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_sorted_key);
		try {
			setState(2368);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2366);
				instance_expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2367);
				arrow_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Read_blob_expressionContext extends ParserRuleContext {
		public ExpressionContext source;
		public TerminalNode READ() { return getToken(EParser.READ, 0); }
		public TerminalNode BLOB() { return getToken(EParser.BLOB, 0); }
		public TerminalNode FROM() { return getToken(EParser.FROM, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Read_blob_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_blob_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterRead_blob_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitRead_blob_expression(this);
		}
	}

	public final Read_blob_expressionContext read_blob_expression() throws RecognitionException {
		Read_blob_expressionContext _localctx = new Read_blob_expressionContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_read_blob_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2370);
			match(READ);
			setState(2371);
			match(BLOB);
			setState(2372);
			match(FROM);
			setState(2373);
			((Read_blob_expressionContext)_localctx).source = expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Read_all_expressionContext extends ParserRuleContext {
		public ExpressionContext source;
		public TerminalNode READ() { return getToken(EParser.READ, 0); }
		public TerminalNode ALL() { return getToken(EParser.ALL, 0); }
		public TerminalNode FROM() { return getToken(EParser.FROM, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Read_all_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_all_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterRead_all_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitRead_all_expression(this);
		}
	}

	public final Read_all_expressionContext read_all_expression() throws RecognitionException {
		Read_all_expressionContext _localctx = new Read_all_expressionContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_read_all_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2375);
			match(READ);
			setState(2376);
			match(ALL);
			setState(2377);
			match(FROM);
			setState(2378);
			((Read_all_expressionContext)_localctx).source = expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Read_one_expressionContext extends ParserRuleContext {
		public ExpressionContext source;
		public TerminalNode READ() { return getToken(EParser.READ, 0); }
		public TerminalNode ONE() { return getToken(EParser.ONE, 0); }
		public TerminalNode FROM() { return getToken(EParser.FROM, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Read_one_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_one_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterRead_one_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitRead_one_expression(this);
		}
	}

	public final Read_one_expressionContext read_one_expression() throws RecognitionException {
		Read_one_expressionContext _localctx = new Read_one_expressionContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_read_one_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2380);
			match(READ);
			setState(2381);
			match(ONE);
			setState(2382);
			match(FROM);
			setState(2383);
			((Read_one_expressionContext)_localctx).source = expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Order_by_listContext extends ParserRuleContext {
		public List<Order_byContext> order_by() {
			return getRuleContexts(Order_byContext.class);
		}
		public Order_byContext order_by(int i) {
			return getRuleContext(Order_byContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EParser.COMMA, i);
		}
		public Order_by_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterOrder_by_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitOrder_by_list(this);
		}
	}

	public final Order_by_listContext order_by_list() throws RecognitionException {
		Order_by_listContext _localctx = new Order_by_listContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_order_by_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2385);
			order_by();
			setState(2390);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,203,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2386);
					match(COMMA);
					setState(2387);
					order_by();
					}
					} 
				}
				setState(2392);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,203,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Order_byContext extends ParserRuleContext {
		public List<Variable_identifierContext> variable_identifier() {
			return getRuleContexts(Variable_identifierContext.class);
		}
		public Variable_identifierContext variable_identifier(int i) {
			return getRuleContext(Variable_identifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(EParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(EParser.DOT, i);
		}
		public TerminalNode ASC() { return getToken(EParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(EParser.DESC, 0); }
		public Order_byContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterOrder_by(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitOrder_by(this);
		}
	}

	public final Order_byContext order_by() throws RecognitionException {
		Order_byContext _localctx = new Order_byContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_order_by);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2393);
			variable_identifier();
			setState(2398);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2394);
					match(DOT);
					setState(2395);
					variable_identifier();
					}
					} 
				}
				setState(2400);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
			}
			setState(2402);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
			case 1:
				{
				setState(2401);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorContext extends ParserRuleContext {
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
	 
		public OperatorContext() { }
		public void copyFrom(OperatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OperatorPlusContext extends OperatorContext {
		public TerminalNode PLUS() { return getToken(EParser.PLUS, 0); }
		public OperatorPlusContext(OperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterOperatorPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitOperatorPlus(this);
		}
	}
	public static class OperatorDivideContext extends OperatorContext {
		public DivideContext divide() {
			return getRuleContext(DivideContext.class,0);
		}
		public OperatorDivideContext(OperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterOperatorDivide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitOperatorDivide(this);
		}
	}
	public static class OperatorIDivideContext extends OperatorContext {
		public IdivideContext idivide() {
			return getRuleContext(IdivideContext.class,0);
		}
		public OperatorIDivideContext(OperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterOperatorIDivide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitOperatorIDivide(this);
		}
	}
	public static class OperatorMultiplyContext extends OperatorContext {
		public MultiplyContext multiply() {
			return getRuleContext(MultiplyContext.class,0);
		}
		public OperatorMultiplyContext(OperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterOperatorMultiply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitOperatorMultiply(this);
		}
	}
	public static class OperatorMinusContext extends OperatorContext {
		public TerminalNode MINUS() { return getToken(EParser.MINUS, 0); }
		public OperatorMinusContext(OperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterOperatorMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitOperatorMinus(this);
		}
	}
	public static class OperatorModuloContext extends OperatorContext {
		public ModuloContext modulo() {
			return getRuleContext(ModuloContext.class,0);
		}
		public OperatorModuloContext(OperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterOperatorModulo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitOperatorModulo(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_operator);
		try {
			setState(2410);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				_localctx = new OperatorPlusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2404);
				match(PLUS);
				}
				break;
			case MINUS:
				_localctx = new OperatorMinusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2405);
				match(MINUS);
				}
				break;
			case STAR:
				_localctx = new OperatorMultiplyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2406);
				multiply();
				}
				break;
			case SLASH:
				_localctx = new OperatorDivideContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2407);
				divide();
				}
				break;
			case BSLASH:
				_localctx = new OperatorIDivideContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2408);
				idivide();
				}
				break;
			case PERCENT:
			case MODULO:
				_localctx = new OperatorModuloContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2409);
				modulo();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode JAVA() { return getToken(EParser.JAVA, 0); }
		public TerminalNode CSHARP() { return getToken(EParser.CSHARP, 0); }
		public TerminalNode PYTHON2() { return getToken(EParser.PYTHON2, 0); }
		public TerminalNode PYTHON3() { return getToken(EParser.PYTHON3, 0); }
		public TerminalNode JAVASCRIPT() { return getToken(EParser.JAVASCRIPT, 0); }
		public TerminalNode SWIFT() { return getToken(EParser.SWIFT, 0); }
		public TerminalNode BOOLEAN() { return getToken(EParser.BOOLEAN, 0); }
		public TerminalNode CHARACTER() { return getToken(EParser.CHARACTER, 0); }
		public TerminalNode TEXT() { return getToken(EParser.TEXT, 0); }
		public TerminalNode INTEGER() { return getToken(EParser.INTEGER, 0); }
		public TerminalNode DECIMAL() { return getToken(EParser.DECIMAL, 0); }
		public TerminalNode DATE() { return getToken(EParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(EParser.TIME, 0); }
		public TerminalNode DATETIME() { return getToken(EParser.DATETIME, 0); }
		public TerminalNode PERIOD() { return getToken(EParser.PERIOD, 0); }
		public TerminalNode VERSION() { return getToken(EParser.VERSION, 0); }
		public TerminalNode CODE() { return getToken(EParser.CODE, 0); }
		public TerminalNode DOCUMENT() { return getToken(EParser.DOCUMENT, 0); }
		public TerminalNode BLOB() { return getToken(EParser.BLOB, 0); }
		public TerminalNode IMAGE() { return getToken(EParser.IMAGE, 0); }
		public TerminalNode UUID() { return getToken(EParser.UUID, 0); }
		public TerminalNode ITERATOR() { return getToken(EParser.ITERATOR, 0); }
		public TerminalNode CURSOR() { return getToken(EParser.CURSOR, 0); }
		public TerminalNode HTML() { return getToken(EParser.HTML, 0); }
		public TerminalNode ABSTRACT() { return getToken(EParser.ABSTRACT, 0); }
		public TerminalNode ALL() { return getToken(EParser.ALL, 0); }
		public TerminalNode ALWAYS() { return getToken(EParser.ALWAYS, 0); }
		public TerminalNode AND() { return getToken(EParser.AND, 0); }
		public TerminalNode ANY() { return getToken(EParser.ANY, 0); }
		public TerminalNode AS() { return getToken(EParser.AS, 0); }
		public TerminalNode ASC() { return getToken(EParser.ASC, 0); }
		public TerminalNode ATTR() { return getToken(EParser.ATTR, 0); }
		public TerminalNode ATTRIBUTE() { return getToken(EParser.ATTRIBUTE, 0); }
		public TerminalNode ATTRIBUTES() { return getToken(EParser.ATTRIBUTES, 0); }
		public TerminalNode BINDINGS() { return getToken(EParser.BINDINGS, 0); }
		public TerminalNode BREAK() { return getToken(EParser.BREAK, 0); }
		public TerminalNode BY() { return getToken(EParser.BY, 0); }
		public TerminalNode CASE() { return getToken(EParser.CASE, 0); }
		public TerminalNode CATCH() { return getToken(EParser.CATCH, 0); }
		public TerminalNode CATEGORY() { return getToken(EParser.CATEGORY, 0); }
		public TerminalNode CLASS() { return getToken(EParser.CLASS, 0); }
		public TerminalNode CONTAINS() { return getToken(EParser.CONTAINS, 0); }
		public TerminalNode DEF() { return getToken(EParser.DEF, 0); }
		public TerminalNode DEFAULT() { return getToken(EParser.DEFAULT, 0); }
		public TerminalNode DEFINE() { return getToken(EParser.DEFINE, 0); }
		public TerminalNode DELETE() { return getToken(EParser.DELETE, 0); }
		public TerminalNode DESC() { return getToken(EParser.DESC, 0); }
		public TerminalNode DO() { return getToken(EParser.DO, 0); }
		public TerminalNode DOING() { return getToken(EParser.DOING, 0); }
		public TerminalNode EACH() { return getToken(EParser.EACH, 0); }
		public TerminalNode ELSE() { return getToken(EParser.ELSE, 0); }
		public TerminalNode ENUM() { return getToken(EParser.ENUM, 0); }
		public TerminalNode ENUMERATED() { return getToken(EParser.ENUMERATED, 0); }
		public TerminalNode EXCEPT() { return getToken(EParser.EXCEPT, 0); }
		public TerminalNode EXECUTE() { return getToken(EParser.EXECUTE, 0); }
		public TerminalNode EXPECTING() { return getToken(EParser.EXPECTING, 0); }
		public TerminalNode EXTENDS() { return getToken(EParser.EXTENDS, 0); }
		public TerminalNode FETCH() { return getToken(EParser.FETCH, 0); }
		public TerminalNode FILTERED() { return getToken(EParser.FILTERED, 0); }
		public TerminalNode FINALLY() { return getToken(EParser.FINALLY, 0); }
		public TerminalNode FLUSH() { return getToken(EParser.FLUSH, 0); }
		public TerminalNode FOR() { return getToken(EParser.FOR, 0); }
		public TerminalNode FROM() { return getToken(EParser.FROM, 0); }
		public TerminalNode GETTER() { return getToken(EParser.GETTER, 0); }
		public TerminalNode HAS() { return getToken(EParser.HAS, 0); }
		public TerminalNode IF() { return getToken(EParser.IF, 0); }
		public TerminalNode IN() { return getToken(EParser.IN, 0); }
		public TerminalNode INDEX() { return getToken(EParser.INDEX, 0); }
		public TerminalNode IS() { return getToken(EParser.IS, 0); }
		public TerminalNode MATCHING() { return getToken(EParser.MATCHING, 0); }
		public TerminalNode METHOD() { return getToken(EParser.METHOD, 0); }
		public TerminalNode METHODS() { return getToken(EParser.METHODS, 0); }
		public TerminalNode MODULO() { return getToken(EParser.MODULO, 0); }
		public TerminalNode MUTABLE() { return getToken(EParser.MUTABLE, 0); }
		public TerminalNode NATIVE() { return getToken(EParser.NATIVE, 0); }
		public TerminalNode NONE() { return getToken(EParser.NONE, 0); }
		public TerminalNode NOT() { return getToken(EParser.NOT, 0); }
		public TerminalNode NOTHING() { return getToken(EParser.NOTHING, 0); }
		public TerminalNode NULL() { return getToken(EParser.NULL, 0); }
		public TerminalNode ON() { return getToken(EParser.ON, 0); }
		public TerminalNode ONE() { return getToken(EParser.ONE, 0); }
		public TerminalNode OPERATOR() { return getToken(EParser.OPERATOR, 0); }
		public TerminalNode OR() { return getToken(EParser.OR, 0); }
		public TerminalNode ORDER() { return getToken(EParser.ORDER, 0); }
		public TerminalNode OTHERWISE() { return getToken(EParser.OTHERWISE, 0); }
		public TerminalNode PASS() { return getToken(EParser.PASS, 0); }
		public TerminalNode RAISE() { return getToken(EParser.RAISE, 0); }
		public TerminalNode READ() { return getToken(EParser.READ, 0); }
		public TerminalNode RECEIVING() { return getToken(EParser.RECEIVING, 0); }
		public TerminalNode RESOURCE() { return getToken(EParser.RESOURCE, 0); }
		public TerminalNode RETURN() { return getToken(EParser.RETURN, 0); }
		public TerminalNode RETURNING() { return getToken(EParser.RETURNING, 0); }
		public TerminalNode ROWS() { return getToken(EParser.ROWS, 0); }
		public TerminalNode SELF() { return getToken(EParser.SELF, 0); }
		public TerminalNode SETTER() { return getToken(EParser.SETTER, 0); }
		public TerminalNode SINGLETON() { return getToken(EParser.SINGLETON, 0); }
		public TerminalNode SORTED() { return getToken(EParser.SORTED, 0); }
		public TerminalNode SUPER() { return getToken(EParser.SUPER, 0); }
		public TerminalNode STORABLE() { return getToken(EParser.STORABLE, 0); }
		public TerminalNode STORE() { return getToken(EParser.STORE, 0); }
		public TerminalNode SWITCH() { return getToken(EParser.SWITCH, 0); }
		public TerminalNode TEST() { return getToken(EParser.TEST, 0); }
		public TerminalNode THIS() { return getToken(EParser.THIS, 0); }
		public TerminalNode THROW() { return getToken(EParser.THROW, 0); }
		public TerminalNode TO() { return getToken(EParser.TO, 0); }
		public TerminalNode TRY() { return getToken(EParser.TRY, 0); }
		public TerminalNode VERIFYING() { return getToken(EParser.VERIFYING, 0); }
		public TerminalNode WIDGET() { return getToken(EParser.WIDGET, 0); }
		public TerminalNode WITH() { return getToken(EParser.WITH, 0); }
		public TerminalNode WHEN() { return getToken(EParser.WHEN, 0); }
		public TerminalNode WHERE() { return getToken(EParser.WHERE, 0); }
		public TerminalNode WHILE() { return getToken(EParser.WHILE, 0); }
		public TerminalNode WRITE() { return getToken(EParser.WRITE, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitKeyword(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2412);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA) | (1L << CSHARP) | (1L << PYTHON2) | (1L << PYTHON3) | (1L << JAVASCRIPT) | (1L << SWIFT) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (CODE - 65)) | (1L << (DOCUMENT - 65)) | (1L << (BLOB - 65)) | (1L << (IMAGE - 65)) | (1L << (UUID - 65)) | (1L << (ITERATOR - 65)) | (1L << (CURSOR - 65)) | (1L << (HTML - 65)) | (1L << (ABSTRACT - 65)) | (1L << (ALL - 65)) | (1L << (ALWAYS - 65)) | (1L << (AND - 65)) | (1L << (ANY - 65)) | (1L << (AS - 65)) | (1L << (ASC - 65)) | (1L << (ATTR - 65)) | (1L << (ATTRIBUTE - 65)) | (1L << (ATTRIBUTES - 65)) | (1L << (BINDINGS - 65)) | (1L << (BREAK - 65)) | (1L << (BY - 65)) | (1L << (CASE - 65)) | (1L << (CATCH - 65)) | (1L << (CATEGORY - 65)) | (1L << (CLASS - 65)) | (1L << (CONTAINS - 65)) | (1L << (DEF - 65)) | (1L << (DEFAULT - 65)) | (1L << (DEFINE - 65)) | (1L << (DELETE - 65)) | (1L << (DESC - 65)) | (1L << (DO - 65)) | (1L << (DOING - 65)) | (1L << (EACH - 65)) | (1L << (ELSE - 65)) | (1L << (ENUM - 65)) | (1L << (ENUMERATED - 65)) | (1L << (EXCEPT - 65)) | (1L << (EXECUTE - 65)) | (1L << (EXPECTING - 65)) | (1L << (EXTENDS - 65)) | (1L << (FETCH - 65)) | (1L << (FILTERED - 65)) | (1L << (FINALLY - 65)) | (1L << (FLUSH - 65)) | (1L << (FOR - 65)) | (1L << (FROM - 65)) | (1L << (GETTER - 65)) | (1L << (HAS - 65)) | (1L << (IF - 65)) | (1L << (IN - 65)) | (1L << (INDEX - 65)) | (1L << (IS - 65)) | (1L << (MATCHING - 65)) | (1L << (METHOD - 65)) | (1L << (METHODS - 65)) | (1L << (MODULO - 65)) | (1L << (MUTABLE - 65)) | (1L << (NATIVE - 65)) | (1L << (NONE - 65)) | (1L << (NOT - 65)) | (1L << (NOTHING - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (NULL - 129)) | (1L << (ON - 129)) | (1L << (ONE - 129)) | (1L << (OPERATOR - 129)) | (1L << (OR - 129)) | (1L << (ORDER - 129)) | (1L << (OTHERWISE - 129)) | (1L << (PASS - 129)) | (1L << (RAISE - 129)) | (1L << (READ - 129)) | (1L << (RECEIVING - 129)) | (1L << (RESOURCE - 129)) | (1L << (RETURN - 129)) | (1L << (RETURNING - 129)) | (1L << (ROWS - 129)) | (1L << (SELF - 129)) | (1L << (SETTER - 129)) | (1L << (SINGLETON - 129)) | (1L << (SORTED - 129)) | (1L << (STORABLE - 129)) | (1L << (STORE - 129)) | (1L << (SUPER - 129)) | (1L << (SWITCH - 129)) | (1L << (TEST - 129)) | (1L << (THIS - 129)) | (1L << (THROW - 129)) | (1L << (TO - 129)) | (1L << (TRY - 129)) | (1L << (VERIFYING - 129)) | (1L << (WIDGET - 129)) | (1L << (WITH - 129)) | (1L << (WHEN - 129)) | (1L << (WHERE - 129)) | (1L << (WHILE - 129)) | (1L << (WRITE - 129)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class New_tokenContext extends ParserRuleContext {
		public Token i1;
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(EParser.VARIABLE_IDENTIFIER, 0); }
		public New_tokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterNew_token(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitNew_token(this);
		}
	}

	public final New_tokenContext new_token() throws RecognitionException {
		New_tokenContext _localctx = new New_tokenContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_new_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2414);
			((New_tokenContext)_localctx).i1 = match(VARIABLE_IDENTIFIER);
			setState(2415);
			if (!(this.isText(((New_tokenContext)_localctx).i1,"new"))) throw new FailedPredicateException(this, "$parser.isText($i1,\"new\")");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Key_tokenContext extends ParserRuleContext {
		public Token i1;
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(EParser.VARIABLE_IDENTIFIER, 0); }
		public Key_tokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterKey_token(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitKey_token(this);
		}
	}

	public final Key_tokenContext key_token() throws RecognitionException {
		Key_tokenContext _localctx = new Key_tokenContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_key_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2417);
			((Key_tokenContext)_localctx).i1 = match(VARIABLE_IDENTIFIER);
			setState(2418);
			if (!(this.isText(((Key_tokenContext)_localctx).i1,"key"))) throw new FailedPredicateException(this, "$parser.isText($i1,\"key\")");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Module_tokenContext extends ParserRuleContext {
		public Token i1;
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(EParser.VARIABLE_IDENTIFIER, 0); }
		public Module_tokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterModule_token(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitModule_token(this);
		}
	}

	public final Module_tokenContext module_token() throws RecognitionException {
		Module_tokenContext _localctx = new Module_tokenContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_module_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2420);
			((Module_tokenContext)_localctx).i1 = match(VARIABLE_IDENTIFIER);
			setState(2421);
			if (!(this.isText(((Module_tokenContext)_localctx).i1,"module"))) throw new FailedPredicateException(this, "$parser.isText($i1,\"module\")");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Value_tokenContext extends ParserRuleContext {
		public Token i1;
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(EParser.VARIABLE_IDENTIFIER, 0); }
		public Value_tokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterValue_token(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitValue_token(this);
		}
	}

	public final Value_tokenContext value_token() throws RecognitionException {
		Value_tokenContext _localctx = new Value_tokenContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_value_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2423);
			((Value_tokenContext)_localctx).i1 = match(VARIABLE_IDENTIFIER);
			setState(2424);
			if (!(this.isText(((Value_tokenContext)_localctx).i1,"value"))) throw new FailedPredicateException(this, "$parser.isText($i1,\"value\")");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Symbols_tokenContext extends ParserRuleContext {
		public Token i1;
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(EParser.VARIABLE_IDENTIFIER, 0); }
		public Symbols_tokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbols_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterSymbols_token(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitSymbols_token(this);
		}
	}

	public final Symbols_tokenContext symbols_token() throws RecognitionException {
		Symbols_tokenContext _localctx = new Symbols_tokenContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_symbols_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2426);
			((Symbols_tokenContext)_localctx).i1 = match(VARIABLE_IDENTIFIER);
			setState(2427);
			if (!(this.isText(((Symbols_tokenContext)_localctx).i1,"symbols"))) throw new FailedPredicateException(this, "$parser.isText($i1,\"symbols\")");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(EParser.EQ, 0); }
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2429);
			match(EQ);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplyContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(EParser.STAR, 0); }
		public MultiplyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiply; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterMultiply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitMultiply(this);
		}
	}

	public final MultiplyContext multiply() throws RecognitionException {
		MultiplyContext _localctx = new MultiplyContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_multiply);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2431);
			match(STAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DivideContext extends ParserRuleContext {
		public TerminalNode SLASH() { return getToken(EParser.SLASH, 0); }
		public DivideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divide; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterDivide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitDivide(this);
		}
	}

	public final DivideContext divide() throws RecognitionException {
		DivideContext _localctx = new DivideContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_divide);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2433);
			match(SLASH);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdivideContext extends ParserRuleContext {
		public TerminalNode BSLASH() { return getToken(EParser.BSLASH, 0); }
		public IdivideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idivide; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterIdivide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitIdivide(this);
		}
	}

	public final IdivideContext idivide() throws RecognitionException {
		IdivideContext _localctx = new IdivideContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_idivide);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2435);
			match(BSLASH);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuloContext extends ParserRuleContext {
		public TerminalNode PERCENT() { return getToken(EParser.PERCENT, 0); }
		public TerminalNode MODULO() { return getToken(EParser.MODULO, 0); }
		public ModuloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modulo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterModulo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitModulo(this);
		}
	}

	public final ModuloContext modulo() throws RecognitionException {
		ModuloContext _localctx = new ModuloContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_modulo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2437);
			_la = _input.LA(1);
			if ( !(_la==PERCENT || _la==MODULO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Javascript_statementContext extends ParserRuleContext {
		public Javascript_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javascript_statement; }
	 
		public Javascript_statementContext() { }
		public void copyFrom(Javascript_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class JavascriptStatementContext extends Javascript_statementContext {
		public Javascript_expressionContext exp;
		public TerminalNode SEMI() { return getToken(EParser.SEMI, 0); }
		public Javascript_expressionContext javascript_expression() {
			return getRuleContext(Javascript_expressionContext.class,0);
		}
		public JavascriptStatementContext(Javascript_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJavascriptStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJavascriptStatement(this);
		}
	}
	public static class JavascriptReturnStatementContext extends Javascript_statementContext {
		public Javascript_expressionContext exp;
		public TerminalNode RETURN() { return getToken(EParser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(EParser.SEMI, 0); }
		public Javascript_expressionContext javascript_expression() {
			return getRuleContext(Javascript_expressionContext.class,0);
		}
		public JavascriptReturnStatementContext(Javascript_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJavascriptReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJavascriptReturnStatement(this);
		}
	}

	public final Javascript_statementContext javascript_statement() throws RecognitionException {
		Javascript_statementContext _localctx = new Javascript_statementContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_javascript_statement);
		try {
			setState(2446);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
			case 1:
				_localctx = new JavascriptReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2439);
				match(RETURN);
				setState(2440);
				((JavascriptReturnStatementContext)_localctx).exp = javascript_expression(0);
				setState(2441);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new JavascriptStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2443);
				((JavascriptStatementContext)_localctx).exp = javascript_expression(0);
				setState(2444);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Javascript_expressionContext extends ParserRuleContext {
		public Javascript_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javascript_expression; }
	 
		public Javascript_expressionContext() { }
		public void copyFrom(Javascript_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class JavascriptSelectorExpressionContext extends Javascript_expressionContext {
		public Javascript_expressionContext parent;
		public Javascript_selector_expressionContext child;
		public Javascript_expressionContext javascript_expression() {
			return getRuleContext(Javascript_expressionContext.class,0);
		}
		public Javascript_selector_expressionContext javascript_selector_expression() {
			return getRuleContext(Javascript_selector_expressionContext.class,0);
		}
		public JavascriptSelectorExpressionContext(Javascript_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJavascriptSelectorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJavascriptSelectorExpression(this);
		}
	}
	public static class JavascriptPrimaryExpressionContext extends Javascript_expressionContext {
		public Javascript_primary_expressionContext exp;
		public Javascript_primary_expressionContext javascript_primary_expression() {
			return getRuleContext(Javascript_primary_expressionContext.class,0);
		}
		public JavascriptPrimaryExpressionContext(Javascript_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJavascriptPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJavascriptPrimaryExpression(this);
		}
	}

	public final Javascript_expressionContext javascript_expression() throws RecognitionException {
		return javascript_expression(0);
	}

	private Javascript_expressionContext javascript_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Javascript_expressionContext _localctx = new Javascript_expressionContext(_ctx, _parentState);
		Javascript_expressionContext _prevctx = _localctx;
		int _startState = 374;
		enterRecursionRule(_localctx, 374, RULE_javascript_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavascriptPrimaryExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2449);
			((JavascriptPrimaryExpressionContext)_localctx).exp = javascript_primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(2455);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,208,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavascriptSelectorExpressionContext(new Javascript_expressionContext(_parentctx, _parentState));
					((JavascriptSelectorExpressionContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_javascript_expression);
					setState(2451);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2452);
					((JavascriptSelectorExpressionContext)_localctx).child = javascript_selector_expression();
					}
					} 
				}
				setState(2457);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,208,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Javascript_primary_expressionContext extends ParserRuleContext {
		public Javascript_this_expressionContext javascript_this_expression() {
			return getRuleContext(Javascript_this_expressionContext.class,0);
		}
		public Javascript_new_expressionContext javascript_new_expression() {
			return getRuleContext(Javascript_new_expressionContext.class,0);
		}
		public Javascript_parenthesis_expressionContext javascript_parenthesis_expression() {
			return getRuleContext(Javascript_parenthesis_expressionContext.class,0);
		}
		public Javascript_identifier_expressionContext javascript_identifier_expression() {
			return getRuleContext(Javascript_identifier_expressionContext.class,0);
		}
		public Javascript_literal_expressionContext javascript_literal_expression() {
			return getRuleContext(Javascript_literal_expressionContext.class,0);
		}
		public Javascript_method_expressionContext javascript_method_expression() {
			return getRuleContext(Javascript_method_expressionContext.class,0);
		}
		public Javascript_item_expressionContext javascript_item_expression() {
			return getRuleContext(Javascript_item_expressionContext.class,0);
		}
		public Javascript_primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javascript_primary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJavascript_primary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJavascript_primary_expression(this);
		}
	}

	public final Javascript_primary_expressionContext javascript_primary_expression() throws RecognitionException {
		Javascript_primary_expressionContext _localctx = new Javascript_primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_javascript_primary_expression);
		try {
			setState(2465);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2458);
				javascript_this_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2459);
				javascript_new_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2460);
				javascript_parenthesis_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2461);
				javascript_identifier_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2462);
				javascript_literal_expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2463);
				javascript_method_expression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2464);
				javascript_item_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Javascript_this_expressionContext extends ParserRuleContext {
		public This_expressionContext this_expression() {
			return getRuleContext(This_expressionContext.class,0);
		}
		public Javascript_this_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javascript_this_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJavascript_this_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJavascript_this_expression(this);
		}
	}

	public final Javascript_this_expressionContext javascript_this_expression() throws RecognitionException {
		Javascript_this_expressionContext _localctx = new Javascript_this_expressionContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_javascript_this_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2467);
			this_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Javascript_new_expressionContext extends ParserRuleContext {
		public New_tokenContext new_token() {
			return getRuleContext(New_tokenContext.class,0);
		}
		public Javascript_method_expressionContext javascript_method_expression() {
			return getRuleContext(Javascript_method_expressionContext.class,0);
		}
		public Javascript_new_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javascript_new_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJavascript_new_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJavascript_new_expression(this);
		}
	}

	public final Javascript_new_expressionContext javascript_new_expression() throws RecognitionException {
		Javascript_new_expressionContext _localctx = new Javascript_new_expressionContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_javascript_new_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2469);
			new_token();
			setState(2470);
			javascript_method_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Javascript_selector_expressionContext extends ParserRuleContext {
		public Javascript_selector_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javascript_selector_expression; }
	 
		public Javascript_selector_expressionContext() { }
		public void copyFrom(Javascript_selector_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class JavaScriptMemberExpressionContext extends Javascript_selector_expressionContext {
		public Javascript_identifierContext name;
		public TerminalNode DOT() { return getToken(EParser.DOT, 0); }
		public Javascript_identifierContext javascript_identifier() {
			return getRuleContext(Javascript_identifierContext.class,0);
		}
		public JavaScriptMemberExpressionContext(Javascript_selector_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJavaScriptMemberExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJavaScriptMemberExpression(this);
		}
	}
	public static class JavaScriptItemExpressionContext extends Javascript_selector_expressionContext {
		public Javascript_item_expressionContext exp;
		public Javascript_item_expressionContext javascript_item_expression() {
			return getRuleContext(Javascript_item_expressionContext.class,0);
		}
		public JavaScriptItemExpressionContext(Javascript_selector_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJavaScriptItemExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJavaScriptItemExpression(this);
		}
	}
	public static class JavaScriptMethodExpressionContext extends Javascript_selector_expressionContext {
		public Javascript_method_expressionContext method;
		public TerminalNode DOT() { return getToken(EParser.DOT, 0); }
		public Javascript_method_expressionContext javascript_method_expression() {
			return getRuleContext(Javascript_method_expressionContext.class,0);
		}
		public JavaScriptMethodExpressionContext(Javascript_selector_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJavaScriptMethodExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJavaScriptMethodExpression(this);
		}
	}

	public final Javascript_selector_expressionContext javascript_selector_expression() throws RecognitionException {
		Javascript_selector_expressionContext _localctx = new Javascript_selector_expressionContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_javascript_selector_expression);
		try {
			setState(2477);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				_localctx = new JavaScriptMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2472);
				match(DOT);
				setState(2473);
				((JavaScriptMethodExpressionContext)_localctx).method = javascript_method_expression();
				}
				break;
			case 2:
				_localctx = new JavaScriptMemberExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2474);
				match(DOT);
				setState(2475);
				((JavaScriptMemberExpressionContext)_localctx).name = javascript_identifier();
				}
				break;
			case 3:
				_localctx = new JavaScriptItemExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2476);
				((JavaScriptItemExpressionContext)_localctx).exp = javascript_item_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Javascript_method_expressionContext extends ParserRuleContext {
		public Javascript_identifierContext name;
		public Javascript_argumentsContext args;
		public TerminalNode LPAR() { return getToken(EParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EParser.RPAR, 0); }
		public Javascript_identifierContext javascript_identifier() {
			return getRuleContext(Javascript_identifierContext.class,0);
		}
		public Javascript_argumentsContext javascript_arguments() {
			return getRuleContext(Javascript_argumentsContext.class,0);
		}
		public Javascript_method_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javascript_method_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJavascript_method_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJavascript_method_expression(this);
		}
	}

	public final Javascript_method_expressionContext javascript_method_expression() throws RecognitionException {
		Javascript_method_expressionContext _localctx = new Javascript_method_expressionContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_javascript_method_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2479);
			((Javascript_method_expressionContext)_localctx).name = javascript_identifier();
			setState(2480);
			match(LPAR);
			setState(2482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA) | (1L << CSHARP) | (1L << PYTHON2) | (1L << PYTHON3) | (1L << JAVASCRIPT) | (1L << SWIFT) | (1L << LPAR) | (1L << LBRAK) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (CODE - 65)) | (1L << (DOCUMENT - 65)) | (1L << (BLOB - 65)) | (1L << (IMAGE - 65)) | (1L << (UUID - 65)) | (1L << (ITERATOR - 65)) | (1L << (CURSOR - 65)) | (1L << (HTML - 65)) | (1L << (ABSTRACT - 65)) | (1L << (ALL - 65)) | (1L << (ALWAYS - 65)) | (1L << (AND - 65)) | (1L << (ANY - 65)) | (1L << (AS - 65)) | (1L << (ASC - 65)) | (1L << (ATTR - 65)) | (1L << (ATTRIBUTE - 65)) | (1L << (ATTRIBUTES - 65)) | (1L << (BINDINGS - 65)) | (1L << (BREAK - 65)) | (1L << (BY - 65)) | (1L << (CASE - 65)) | (1L << (CATCH - 65)) | (1L << (CATEGORY - 65)) | (1L << (CLASS - 65)) | (1L << (CONTAINS - 65)) | (1L << (DEF - 65)) | (1L << (DEFAULT - 65)) | (1L << (DEFINE - 65)) | (1L << (DELETE - 65)) | (1L << (DESC - 65)) | (1L << (DO - 65)) | (1L << (DOING - 65)) | (1L << (EACH - 65)) | (1L << (ELSE - 65)) | (1L << (ENUM - 65)) | (1L << (ENUMERATED - 65)) | (1L << (EXCEPT - 65)) | (1L << (EXECUTE - 65)) | (1L << (EXPECTING - 65)) | (1L << (EXTENDS - 65)) | (1L << (FETCH - 65)) | (1L << (FILTERED - 65)) | (1L << (FINALLY - 65)) | (1L << (FLUSH - 65)) | (1L << (FOR - 65)) | (1L << (FROM - 65)) | (1L << (GETTER - 65)) | (1L << (HAS - 65)) | (1L << (IF - 65)) | (1L << (IN - 65)) | (1L << (INDEX - 65)) | (1L << (IS - 65)) | (1L << (MATCHING - 65)) | (1L << (METHOD - 65)) | (1L << (METHODS - 65)) | (1L << (MODULO - 65)) | (1L << (MUTABLE - 65)) | (1L << (NATIVE - 65)) | (1L << (NONE - 65)) | (1L << (NOT - 65)) | (1L << (NOTHING - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (NULL - 129)) | (1L << (ON - 129)) | (1L << (ONE - 129)) | (1L << (OPERATOR - 129)) | (1L << (OR - 129)) | (1L << (ORDER - 129)) | (1L << (OTHERWISE - 129)) | (1L << (PASS - 129)) | (1L << (RAISE - 129)) | (1L << (READ - 129)) | (1L << (RECEIVING - 129)) | (1L << (RESOURCE - 129)) | (1L << (RETURN - 129)) | (1L << (RETURNING - 129)) | (1L << (ROWS - 129)) | (1L << (SELF - 129)) | (1L << (SETTER - 129)) | (1L << (SINGLETON - 129)) | (1L << (SORTED - 129)) | (1L << (STORABLE - 129)) | (1L << (STORE - 129)) | (1L << (SUPER - 129)) | (1L << (SWITCH - 129)) | (1L << (TEST - 129)) | (1L << (THIS - 129)) | (1L << (THROW - 129)) | (1L << (TO - 129)) | (1L << (TRY - 129)) | (1L << (VERIFYING - 129)) | (1L << (WIDGET - 129)) | (1L << (WITH - 129)) | (1L << (WHEN - 129)) | (1L << (WHERE - 129)) | (1L << (WHILE - 129)) | (1L << (WRITE - 129)) | (1L << (BOOLEAN_LITERAL - 129)) | (1L << (CHAR_LITERAL - 129)) | (1L << (SYMBOL_IDENTIFIER - 129)) | (1L << (TYPE_IDENTIFIER - 129)) | (1L << (VARIABLE_IDENTIFIER - 129)) | (1L << (DOLLAR_IDENTIFIER - 129)) | (1L << (TEXT_LITERAL - 129)) | (1L << (INTEGER_LITERAL - 129)) | (1L << (DECIMAL_LITERAL - 129)))) != 0)) {
				{
				setState(2481);
				((Javascript_method_expressionContext)_localctx).args = javascript_arguments(0);
				}
			}

			setState(2484);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Javascript_argumentsContext extends ParserRuleContext {
		public Javascript_argumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javascript_arguments; }
	 
		public Javascript_argumentsContext() { }
		public void copyFrom(Javascript_argumentsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class JavascriptArgumentListContext extends Javascript_argumentsContext {
		public Javascript_expressionContext item;
		public Javascript_expressionContext javascript_expression() {
			return getRuleContext(Javascript_expressionContext.class,0);
		}
		public JavascriptArgumentListContext(Javascript_argumentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJavascriptArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJavascriptArgumentList(this);
		}
	}
	public static class JavascriptArgumentListItemContext extends Javascript_argumentsContext {
		public Javascript_argumentsContext items;
		public Javascript_expressionContext item;
		public TerminalNode COMMA() { return getToken(EParser.COMMA, 0); }
		public Javascript_argumentsContext javascript_arguments() {
			return getRuleContext(Javascript_argumentsContext.class,0);
		}
		public Javascript_expressionContext javascript_expression() {
			return getRuleContext(Javascript_expressionContext.class,0);
		}
		public JavascriptArgumentListItemContext(Javascript_argumentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJavascriptArgumentListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJavascriptArgumentListItem(this);
		}
	}

	public final Javascript_argumentsContext javascript_arguments() throws RecognitionException {
		return javascript_arguments(0);
	}

	private Javascript_argumentsContext javascript_arguments(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Javascript_argumentsContext _localctx = new Javascript_argumentsContext(_ctx, _parentState);
		Javascript_argumentsContext _prevctx = _localctx;
		int _startState = 386;
		enterRecursionRule(_localctx, 386, RULE_javascript_arguments, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavascriptArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2487);
			((JavascriptArgumentListContext)_localctx).item = javascript_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2494);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,212,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavascriptArgumentListItemContext(new Javascript_argumentsContext(_parentctx, _parentState));
					((JavascriptArgumentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_javascript_arguments);
					setState(2489);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2490);
					match(COMMA);
					setState(2491);
					((JavascriptArgumentListItemContext)_localctx).item = javascript_expression(0);
					}
					} 
				}
				setState(2496);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,212,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Javascript_item_expressionContext extends ParserRuleContext {
		public Javascript_expressionContext exp;
		public TerminalNode LBRAK() { return getToken(EParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(EParser.RBRAK, 0); }
		public Javascript_expressionContext javascript_expression() {
			return getRuleContext(Javascript_expressionContext.class,0);
		}
		public Javascript_item_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javascript_item_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJavascript_item_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJavascript_item_expression(this);
		}
	}

	public final Javascript_item_expressionContext javascript_item_expression() throws RecognitionException {
		Javascript_item_expressionContext _localctx = new Javascript_item_expressionContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_javascript_item_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2497);
			match(LBRAK);
			setState(2498);
			((Javascript_item_expressionContext)_localctx).exp = javascript_expression(0);
			setState(2499);
			match(RBRAK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Javascript_parenthesis_expressionContext extends ParserRuleContext {
		public Javascript_expressionContext exp;
		public TerminalNode LPAR() { return getToken(EParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EParser.RPAR, 0); }
		public Javascript_expressionContext javascript_expression() {
			return getRuleContext(Javascript_expressionContext.class,0);
		}
		public Javascript_parenthesis_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javascript_parenthesis_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJavascript_parenthesis_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJavascript_parenthesis_expression(this);
		}
	}

	public final Javascript_parenthesis_expressionContext javascript_parenthesis_expression() throws RecognitionException {
		Javascript_parenthesis_expressionContext _localctx = new Javascript_parenthesis_expressionContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_javascript_parenthesis_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2501);
			match(LPAR);
			setState(2502);
			((Javascript_parenthesis_expressionContext)_localctx).exp = javascript_expression(0);
			setState(2503);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Javascript_identifier_expressionContext extends ParserRuleContext {
		public Javascript_identifierContext name;
		public Javascript_identifierContext javascript_identifier() {
			return getRuleContext(Javascript_identifierContext.class,0);
		}
		public Javascript_identifier_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javascript_identifier_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJavascript_identifier_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJavascript_identifier_expression(this);
		}
	}

	public final Javascript_identifier_expressionContext javascript_identifier_expression() throws RecognitionException {
		Javascript_identifier_expressionContext _localctx = new Javascript_identifier_expressionContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_javascript_identifier_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2505);
			((Javascript_identifier_expressionContext)_localctx).name = javascript_identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Javascript_literal_expressionContext extends ParserRuleContext {
		public Javascript_literal_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javascript_literal_expression; }
	 
		public Javascript_literal_expressionContext() { }
		public void copyFrom(Javascript_literal_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class JavascriptIntegerLiteralContext extends Javascript_literal_expressionContext {
		public Token t;
		public TerminalNode INTEGER_LITERAL() { return getToken(EParser.INTEGER_LITERAL, 0); }
		public JavascriptIntegerLiteralContext(Javascript_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJavascriptIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJavascriptIntegerLiteral(this);
		}
	}
	public static class JavascriptBooleanLiteralContext extends Javascript_literal_expressionContext {
		public Token t;
		public TerminalNode BOOLEAN_LITERAL() { return getToken(EParser.BOOLEAN_LITERAL, 0); }
		public JavascriptBooleanLiteralContext(Javascript_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJavascriptBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJavascriptBooleanLiteral(this);
		}
	}
	public static class JavascriptCharacterLiteralContext extends Javascript_literal_expressionContext {
		public Token t;
		public TerminalNode CHAR_LITERAL() { return getToken(EParser.CHAR_LITERAL, 0); }
		public JavascriptCharacterLiteralContext(Javascript_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJavascriptCharacterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJavascriptCharacterLiteral(this);
		}
	}
	public static class JavascriptTextLiteralContext extends Javascript_literal_expressionContext {
		public Token t;
		public TerminalNode TEXT_LITERAL() { return getToken(EParser.TEXT_LITERAL, 0); }
		public JavascriptTextLiteralContext(Javascript_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJavascriptTextLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJavascriptTextLiteral(this);
		}
	}
	public static class JavascriptDecimalLiteralContext extends Javascript_literal_expressionContext {
		public Token t;
		public TerminalNode DECIMAL_LITERAL() { return getToken(EParser.DECIMAL_LITERAL, 0); }
		public JavascriptDecimalLiteralContext(Javascript_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJavascriptDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJavascriptDecimalLiteral(this);
		}
	}

	public final Javascript_literal_expressionContext javascript_literal_expression() throws RecognitionException {
		Javascript_literal_expressionContext _localctx = new Javascript_literal_expressionContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_javascript_literal_expression);
		try {
			setState(2512);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				_localctx = new JavascriptIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2507);
				((JavascriptIntegerLiteralContext)_localctx).t = match(INTEGER_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				_localctx = new JavascriptDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2508);
				((JavascriptDecimalLiteralContext)_localctx).t = match(DECIMAL_LITERAL);
				}
				break;
			case TEXT_LITERAL:
				_localctx = new JavascriptTextLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2509);
				((JavascriptTextLiteralContext)_localctx).t = match(TEXT_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new JavascriptBooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2510);
				((JavascriptBooleanLiteralContext)_localctx).t = match(BOOLEAN_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new JavascriptCharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2511);
				((JavascriptCharacterLiteralContext)_localctx).t = match(CHAR_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Javascript_identifierContext extends ParserRuleContext {
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(EParser.VARIABLE_IDENTIFIER, 0); }
		public TerminalNode SYMBOL_IDENTIFIER() { return getToken(EParser.SYMBOL_IDENTIFIER, 0); }
		public TerminalNode DOLLAR_IDENTIFIER() { return getToken(EParser.DOLLAR_IDENTIFIER, 0); }
		public TerminalNode TYPE_IDENTIFIER() { return getToken(EParser.TYPE_IDENTIFIER, 0); }
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public Javascript_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javascript_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJavascript_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJavascript_identifier(this);
		}
	}

	public final Javascript_identifierContext javascript_identifier() throws RecognitionException {
		Javascript_identifierContext _localctx = new Javascript_identifierContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_javascript_identifier);
		try {
			setState(2519);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2514);
				match(VARIABLE_IDENTIFIER);
				}
				break;
			case SYMBOL_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2515);
				match(SYMBOL_IDENTIFIER);
				}
				break;
			case DOLLAR_IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(2516);
				match(DOLLAR_IDENTIFIER);
				}
				break;
			case TYPE_IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(2517);
				match(TYPE_IDENTIFIER);
				}
				break;
			case JAVA:
			case CSHARP:
			case PYTHON2:
			case PYTHON3:
			case JAVASCRIPT:
			case SWIFT:
			case BOOLEAN:
			case CHARACTER:
			case TEXT:
			case INTEGER:
			case DECIMAL:
			case DATE:
			case TIME:
			case DATETIME:
			case PERIOD:
			case VERSION:
			case CODE:
			case DOCUMENT:
			case BLOB:
			case IMAGE:
			case UUID:
			case ITERATOR:
			case CURSOR:
			case HTML:
			case ABSTRACT:
			case ALL:
			case ALWAYS:
			case AND:
			case ANY:
			case AS:
			case ASC:
			case ATTR:
			case ATTRIBUTE:
			case ATTRIBUTES:
			case BINDINGS:
			case BREAK:
			case BY:
			case CASE:
			case CATCH:
			case CATEGORY:
			case CLASS:
			case CONTAINS:
			case DEF:
			case DEFAULT:
			case DEFINE:
			case DELETE:
			case DESC:
			case DO:
			case DOING:
			case EACH:
			case ELSE:
			case ENUM:
			case ENUMERATED:
			case EXCEPT:
			case EXECUTE:
			case EXPECTING:
			case EXTENDS:
			case FETCH:
			case FILTERED:
			case FINALLY:
			case FLUSH:
			case FOR:
			case FROM:
			case GETTER:
			case HAS:
			case IF:
			case IN:
			case INDEX:
			case IS:
			case MATCHING:
			case METHOD:
			case METHODS:
			case MODULO:
			case MUTABLE:
			case NATIVE:
			case NONE:
			case NOT:
			case NOTHING:
			case NULL:
			case ON:
			case ONE:
			case OPERATOR:
			case OR:
			case ORDER:
			case OTHERWISE:
			case PASS:
			case RAISE:
			case READ:
			case RECEIVING:
			case RESOURCE:
			case RETURN:
			case RETURNING:
			case ROWS:
			case SELF:
			case SETTER:
			case SINGLETON:
			case SORTED:
			case STORABLE:
			case STORE:
			case SUPER:
			case SWITCH:
			case TEST:
			case THIS:
			case THROW:
			case TO:
			case TRY:
			case VERIFYING:
			case WIDGET:
			case WITH:
			case WHEN:
			case WHERE:
			case WHILE:
			case WRITE:
				enterOuterAlt(_localctx, 5);
				{
				setState(2518);
				keyword();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Python_statementContext extends ParserRuleContext {
		public Python_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_python_statement; }
	 
		public Python_statementContext() { }
		public void copyFrom(Python_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PythonStatementContext extends Python_statementContext {
		public Python_expressionContext exp;
		public Python_expressionContext python_expression() {
			return getRuleContext(Python_expressionContext.class,0);
		}
		public PythonStatementContext(Python_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterPythonStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitPythonStatement(this);
		}
	}
	public static class PythonReturnStatementContext extends Python_statementContext {
		public Python_expressionContext exp;
		public TerminalNode RETURN() { return getToken(EParser.RETURN, 0); }
		public Python_expressionContext python_expression() {
			return getRuleContext(Python_expressionContext.class,0);
		}
		public PythonReturnStatementContext(Python_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterPythonReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitPythonReturnStatement(this);
		}
	}

	public final Python_statementContext python_statement() throws RecognitionException {
		Python_statementContext _localctx = new Python_statementContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_python_statement);
		try {
			setState(2524);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
			case 1:
				_localctx = new PythonReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2521);
				match(RETURN);
				setState(2522);
				((PythonReturnStatementContext)_localctx).exp = python_expression(0);
				}
				break;
			case 2:
				_localctx = new PythonStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2523);
				((PythonStatementContext)_localctx).exp = python_expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Python_expressionContext extends ParserRuleContext {
		public Python_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_python_expression; }
	 
		public Python_expressionContext() { }
		public void copyFrom(Python_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PythonSelectorExpressionContext extends Python_expressionContext {
		public Python_expressionContext parent;
		public Python_selector_expressionContext child;
		public Python_expressionContext python_expression() {
			return getRuleContext(Python_expressionContext.class,0);
		}
		public Python_selector_expressionContext python_selector_expression() {
			return getRuleContext(Python_selector_expressionContext.class,0);
		}
		public PythonSelectorExpressionContext(Python_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterPythonSelectorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitPythonSelectorExpression(this);
		}
	}
	public static class PythonPrimaryExpressionContext extends Python_expressionContext {
		public Python_primary_expressionContext exp;
		public Python_primary_expressionContext python_primary_expression() {
			return getRuleContext(Python_primary_expressionContext.class,0);
		}
		public PythonPrimaryExpressionContext(Python_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterPythonPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitPythonPrimaryExpression(this);
		}
	}

	public final Python_expressionContext python_expression() throws RecognitionException {
		return python_expression(0);
	}

	private Python_expressionContext python_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Python_expressionContext _localctx = new Python_expressionContext(_ctx, _parentState);
		Python_expressionContext _prevctx = _localctx;
		int _startState = 400;
		enterRecursionRule(_localctx, 400, RULE_python_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PythonPrimaryExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2527);
			((PythonPrimaryExpressionContext)_localctx).exp = python_primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(2533);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,216,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PythonSelectorExpressionContext(new Python_expressionContext(_parentctx, _parentState));
					((PythonSelectorExpressionContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_python_expression);
					setState(2529);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2530);
					((PythonSelectorExpressionContext)_localctx).child = python_selector_expression();
					}
					} 
				}
				setState(2535);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,216,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Python_primary_expressionContext extends ParserRuleContext {
		public Python_primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_python_primary_expression; }
	 
		public Python_primary_expressionContext() { }
		public void copyFrom(Python_primary_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PythonParenthesisExpressionContext extends Python_primary_expressionContext {
		public Python_parenthesis_expressionContext exp;
		public Python_parenthesis_expressionContext python_parenthesis_expression() {
			return getRuleContext(Python_parenthesis_expressionContext.class,0);
		}
		public PythonParenthesisExpressionContext(Python_primary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterPythonParenthesisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitPythonParenthesisExpression(this);
		}
	}
	public static class PythonIdentifierExpressionContext extends Python_primary_expressionContext {
		public Python_identifier_expressionContext exp;
		public Python_identifier_expressionContext python_identifier_expression() {
			return getRuleContext(Python_identifier_expressionContext.class,0);
		}
		public PythonIdentifierExpressionContext(Python_primary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterPythonIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitPythonIdentifierExpression(this);
		}
	}
	public static class PythonSelfExpressionContext extends Python_primary_expressionContext {
		public Python_self_expressionContext exp;
		public Python_self_expressionContext python_self_expression() {
			return getRuleContext(Python_self_expressionContext.class,0);
		}
		public PythonSelfExpressionContext(Python_primary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterPythonSelfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitPythonSelfExpression(this);
		}
	}
	public static class PythonLiteralExpressionContext extends Python_primary_expressionContext {
		public Python_literal_expressionContext exp;
		public Python_literal_expressionContext python_literal_expression() {
			return getRuleContext(Python_literal_expressionContext.class,0);
		}
		public PythonLiteralExpressionContext(Python_primary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterPythonLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitPythonLiteralExpression(this);
		}
	}
	public static class PythonGlobalMethodExpressionContext extends Python_primary_expressionContext {
		public Python_method_expressionContext exp;
		public Python_method_expressionContext python_method_expression() {
			return getRuleContext(Python_method_expressionContext.class,0);
		}
		public PythonGlobalMethodExpressionContext(Python_primary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterPythonGlobalMethodExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitPythonGlobalMethodExpression(this);
		}
	}

	public final Python_primary_expressionContext python_primary_expression() throws RecognitionException {
		Python_primary_expressionContext _localctx = new Python_primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_python_primary_expression);
		try {
			setState(2541);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
			case 1:
				_localctx = new PythonSelfExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2536);
				((PythonSelfExpressionContext)_localctx).exp = python_self_expression();
				}
				break;
			case 2:
				_localctx = new PythonParenthesisExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2537);
				((PythonParenthesisExpressionContext)_localctx).exp = python_parenthesis_expression();
				}
				break;
			case 3:
				_localctx = new PythonIdentifierExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2538);
				((PythonIdentifierExpressionContext)_localctx).exp = python_identifier_expression(0);
				}
				break;
			case 4:
				_localctx = new PythonLiteralExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2539);
				((PythonLiteralExpressionContext)_localctx).exp = python_literal_expression();
				}
				break;
			case 5:
				_localctx = new PythonGlobalMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2540);
				((PythonGlobalMethodExpressionContext)_localctx).exp = python_method_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Python_self_expressionContext extends ParserRuleContext {
		public This_expressionContext this_expression() {
			return getRuleContext(This_expressionContext.class,0);
		}
		public Python_self_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_python_self_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterPython_self_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitPython_self_expression(this);
		}
	}

	public final Python_self_expressionContext python_self_expression() throws RecognitionException {
		Python_self_expressionContext _localctx = new Python_self_expressionContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_python_self_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2543);
			this_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Python_selector_expressionContext extends ParserRuleContext {
		public Python_selector_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_python_selector_expression; }
	 
		public Python_selector_expressionContext() { }
		public void copyFrom(Python_selector_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PythonMethodExpressionContext extends Python_selector_expressionContext {
		public Python_method_expressionContext exp;
		public TerminalNode DOT() { return getToken(EParser.DOT, 0); }
		public Python_method_expressionContext python_method_expression() {
			return getRuleContext(Python_method_expressionContext.class,0);
		}
		public PythonMethodExpressionContext(Python_selector_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterPythonMethodExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitPythonMethodExpression(this);
		}
	}
	public static class PythonItemExpressionContext extends Python_selector_expressionContext {
		public Python_expressionContext exp;
		public TerminalNode LBRAK() { return getToken(EParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(EParser.RBRAK, 0); }
		public Python_expressionContext python_expression() {
			return getRuleContext(Python_expressionContext.class,0);
		}
		public PythonItemExpressionContext(Python_selector_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterPythonItemExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitPythonItemExpression(this);
		}
	}

	public final Python_selector_expressionContext python_selector_expression() throws RecognitionException {
		Python_selector_expressionContext _localctx = new Python_selector_expressionContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_python_selector_expression);
		try {
			setState(2551);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				_localctx = new PythonMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2545);
				match(DOT);
				setState(2546);
				((PythonMethodExpressionContext)_localctx).exp = python_method_expression();
				}
				break;
			case LBRAK:
				_localctx = new PythonItemExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2547);
				match(LBRAK);
				setState(2548);
				((PythonItemExpressionContext)_localctx).exp = python_expression(0);
				setState(2549);
				match(RBRAK);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Python_method_expressionContext extends ParserRuleContext {
		public Python_identifierContext name;
		public Python_argument_listContext args;
		public TerminalNode LPAR() { return getToken(EParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EParser.RPAR, 0); }
		public Python_identifierContext python_identifier() {
			return getRuleContext(Python_identifierContext.class,0);
		}
		public Python_argument_listContext python_argument_list() {
			return getRuleContext(Python_argument_listContext.class,0);
		}
		public Python_method_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_python_method_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterPython_method_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitPython_method_expression(this);
		}
	}

	public final Python_method_expressionContext python_method_expression() throws RecognitionException {
		Python_method_expressionContext _localctx = new Python_method_expressionContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_python_method_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2553);
			((Python_method_expressionContext)_localctx).name = python_identifier();
			setState(2554);
			match(LPAR);
			setState(2556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA) | (1L << CSHARP) | (1L << PYTHON2) | (1L << PYTHON3) | (1L << JAVASCRIPT) | (1L << SWIFT) | (1L << LPAR) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (CODE - 65)) | (1L << (DOCUMENT - 65)) | (1L << (BLOB - 65)) | (1L << (IMAGE - 65)) | (1L << (UUID - 65)) | (1L << (ITERATOR - 65)) | (1L << (CURSOR - 65)) | (1L << (HTML - 65)) | (1L << (ABSTRACT - 65)) | (1L << (ALL - 65)) | (1L << (ALWAYS - 65)) | (1L << (AND - 65)) | (1L << (ANY - 65)) | (1L << (AS - 65)) | (1L << (ASC - 65)) | (1L << (ATTR - 65)) | (1L << (ATTRIBUTE - 65)) | (1L << (ATTRIBUTES - 65)) | (1L << (BINDINGS - 65)) | (1L << (BREAK - 65)) | (1L << (BY - 65)) | (1L << (CASE - 65)) | (1L << (CATCH - 65)) | (1L << (CATEGORY - 65)) | (1L << (CLASS - 65)) | (1L << (CONTAINS - 65)) | (1L << (DEF - 65)) | (1L << (DEFAULT - 65)) | (1L << (DEFINE - 65)) | (1L << (DELETE - 65)) | (1L << (DESC - 65)) | (1L << (DO - 65)) | (1L << (DOING - 65)) | (1L << (EACH - 65)) | (1L << (ELSE - 65)) | (1L << (ENUM - 65)) | (1L << (ENUMERATED - 65)) | (1L << (EXCEPT - 65)) | (1L << (EXECUTE - 65)) | (1L << (EXPECTING - 65)) | (1L << (EXTENDS - 65)) | (1L << (FETCH - 65)) | (1L << (FILTERED - 65)) | (1L << (FINALLY - 65)) | (1L << (FLUSH - 65)) | (1L << (FOR - 65)) | (1L << (FROM - 65)) | (1L << (GETTER - 65)) | (1L << (HAS - 65)) | (1L << (IF - 65)) | (1L << (IN - 65)) | (1L << (INDEX - 65)) | (1L << (IS - 65)) | (1L << (MATCHING - 65)) | (1L << (METHOD - 65)) | (1L << (METHODS - 65)) | (1L << (MODULO - 65)) | (1L << (MUTABLE - 65)) | (1L << (NATIVE - 65)) | (1L << (NONE - 65)) | (1L << (NOT - 65)) | (1L << (NOTHING - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (NULL - 129)) | (1L << (ON - 129)) | (1L << (ONE - 129)) | (1L << (OPERATOR - 129)) | (1L << (OR - 129)) | (1L << (ORDER - 129)) | (1L << (OTHERWISE - 129)) | (1L << (PASS - 129)) | (1L << (RAISE - 129)) | (1L << (READ - 129)) | (1L << (RECEIVING - 129)) | (1L << (RESOURCE - 129)) | (1L << (RETURN - 129)) | (1L << (RETURNING - 129)) | (1L << (ROWS - 129)) | (1L << (SELF - 129)) | (1L << (SETTER - 129)) | (1L << (SINGLETON - 129)) | (1L << (SORTED - 129)) | (1L << (STORABLE - 129)) | (1L << (STORE - 129)) | (1L << (SUPER - 129)) | (1L << (SWITCH - 129)) | (1L << (TEST - 129)) | (1L << (THIS - 129)) | (1L << (THROW - 129)) | (1L << (TO - 129)) | (1L << (TRY - 129)) | (1L << (VERIFYING - 129)) | (1L << (WIDGET - 129)) | (1L << (WITH - 129)) | (1L << (WHEN - 129)) | (1L << (WHERE - 129)) | (1L << (WHILE - 129)) | (1L << (WRITE - 129)) | (1L << (BOOLEAN_LITERAL - 129)) | (1L << (CHAR_LITERAL - 129)) | (1L << (SYMBOL_IDENTIFIER - 129)) | (1L << (TYPE_IDENTIFIER - 129)) | (1L << (VARIABLE_IDENTIFIER - 129)) | (1L << (DOLLAR_IDENTIFIER - 129)) | (1L << (TEXT_LITERAL - 129)) | (1L << (INTEGER_LITERAL - 129)) | (1L << (DECIMAL_LITERAL - 129)))) != 0)) {
				{
				setState(2555);
				((Python_method_expressionContext)_localctx).args = python_argument_list();
				}
			}

			setState(2558);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Python_argument_listContext extends ParserRuleContext {
		public Python_argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_python_argument_list; }
	 
		public Python_argument_listContext() { }
		public void copyFrom(Python_argument_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PythonOrdinalOnlyArgumentListContext extends Python_argument_listContext {
		public Python_ordinal_argument_listContext ordinal;
		public Python_ordinal_argument_listContext python_ordinal_argument_list() {
			return getRuleContext(Python_ordinal_argument_listContext.class,0);
		}
		public PythonOrdinalOnlyArgumentListContext(Python_argument_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterPythonOrdinalOnlyArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitPythonOrdinalOnlyArgumentList(this);
		}
	}
	public static class PythonNamedOnlyArgumentListContext extends Python_argument_listContext {
		public Python_named_argument_listContext named;
		public Python_named_argument_listContext python_named_argument_list() {
			return getRuleContext(Python_named_argument_listContext.class,0);
		}
		public PythonNamedOnlyArgumentListContext(Python_argument_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterPythonNamedOnlyArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitPythonNamedOnlyArgumentList(this);
		}
	}
	public static class PythonArgumentListContext extends Python_argument_listContext {
		public Python_ordinal_argument_listContext ordinal;
		public Python_named_argument_listContext named;
		public TerminalNode COMMA() { return getToken(EParser.COMMA, 0); }
		public Python_ordinal_argument_listContext python_ordinal_argument_list() {
			return getRuleContext(Python_ordinal_argument_listContext.class,0);
		}
		public Python_named_argument_listContext python_named_argument_list() {
			return getRuleContext(Python_named_argument_listContext.class,0);
		}
		public PythonArgumentListContext(Python_argument_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterPythonArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitPythonArgumentList(this);
		}
	}

	public final Python_argument_listContext python_argument_list() throws RecognitionException {
		Python_argument_listContext _localctx = new Python_argument_listContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_python_argument_list);
		try {
			setState(2566);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				_localctx = new PythonOrdinalOnlyArgumentListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2560);
				((PythonOrdinalOnlyArgumentListContext)_localctx).ordinal = python_ordinal_argument_list(0);
				}
				break;
			case 2:
				_localctx = new PythonNamedOnlyArgumentListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2561);
				((PythonNamedOnlyArgumentListContext)_localctx).named = python_named_argument_list(0);
				}
				break;
			case 3:
				_localctx = new PythonArgumentListContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2562);
				((PythonArgumentListContext)_localctx).ordinal = python_ordinal_argument_list(0);
				setState(2563);
				match(COMMA);
				setState(2564);
				((PythonArgumentListContext)_localctx).named = python_named_argument_list(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Python_ordinal_argument_listContext extends ParserRuleContext {
		public Python_ordinal_argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_python_ordinal_argument_list; }
	 
		public Python_ordinal_argument_listContext() { }
		public void copyFrom(Python_ordinal_argument_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PythonOrdinalArgumentListContext extends Python_ordinal_argument_listContext {
		public Python_expressionContext item;
		public Python_expressionContext python_expression() {
			return getRuleContext(Python_expressionContext.class,0);
		}
		public PythonOrdinalArgumentListContext(Python_ordinal_argument_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterPythonOrdinalArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitPythonOrdinalArgumentList(this);
		}
	}
	public static class PythonOrdinalArgumentListItemContext extends Python_ordinal_argument_listContext {
		public Python_ordinal_argument_listContext items;
		public Python_expressionContext item;
		public TerminalNode COMMA() { return getToken(EParser.COMMA, 0); }
		public Python_ordinal_argument_listContext python_ordinal_argument_list() {
			return getRuleContext(Python_ordinal_argument_listContext.class,0);
		}
		public Python_expressionContext python_expression() {
			return getRuleContext(Python_expressionContext.class,0);
		}
		public PythonOrdinalArgumentListItemContext(Python_ordinal_argument_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterPythonOrdinalArgumentListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitPythonOrdinalArgumentListItem(this);
		}
	}

	public final Python_ordinal_argument_listContext python_ordinal_argument_list() throws RecognitionException {
		return python_ordinal_argument_list(0);
	}

	private Python_ordinal_argument_listContext python_ordinal_argument_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Python_ordinal_argument_listContext _localctx = new Python_ordinal_argument_listContext(_ctx, _parentState);
		Python_ordinal_argument_listContext _prevctx = _localctx;
		int _startState = 412;
		enterRecursionRule(_localctx, 412, RULE_python_ordinal_argument_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PythonOrdinalArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2569);
			((PythonOrdinalArgumentListContext)_localctx).item = python_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2576);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,221,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PythonOrdinalArgumentListItemContext(new Python_ordinal_argument_listContext(_parentctx, _parentState));
					((PythonOrdinalArgumentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_python_ordinal_argument_list);
					setState(2571);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2572);
					match(COMMA);
					setState(2573);
					((PythonOrdinalArgumentListItemContext)_localctx).item = python_expression(0);
					}
					} 
				}
				setState(2578);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,221,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Python_named_argument_listContext extends ParserRuleContext {
		public Python_named_argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_python_named_argument_list; }
	 
		public Python_named_argument_listContext() { }
		public void copyFrom(Python_named_argument_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PythonNamedArgumentListContext extends Python_named_argument_listContext {
		public Python_identifierContext name;
		public Python_expressionContext exp;
		public TerminalNode EQ() { return getToken(EParser.EQ, 0); }
		public Python_identifierContext python_identifier() {
			return getRuleContext(Python_identifierContext.class,0);
		}
		public Python_expressionContext python_expression() {
			return getRuleContext(Python_expressionContext.class,0);
		}
		public PythonNamedArgumentListContext(Python_named_argument_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterPythonNamedArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitPythonNamedArgumentList(this);
		}
	}
	public static class PythonNamedArgumentListItemContext extends Python_named_argument_listContext {
		public Python_named_argument_listContext items;
		public Python_identifierContext name;
		public Python_expressionContext exp;
		public TerminalNode COMMA() { return getToken(EParser.COMMA, 0); }
		public TerminalNode EQ() { return getToken(EParser.EQ, 0); }
		public Python_named_argument_listContext python_named_argument_list() {
			return getRuleContext(Python_named_argument_listContext.class,0);
		}
		public Python_identifierContext python_identifier() {
			return getRuleContext(Python_identifierContext.class,0);
		}
		public Python_expressionContext python_expression() {
			return getRuleContext(Python_expressionContext.class,0);
		}
		public PythonNamedArgumentListItemContext(Python_named_argument_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterPythonNamedArgumentListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitPythonNamedArgumentListItem(this);
		}
	}

	public final Python_named_argument_listContext python_named_argument_list() throws RecognitionException {
		return python_named_argument_list(0);
	}

	private Python_named_argument_listContext python_named_argument_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Python_named_argument_listContext _localctx = new Python_named_argument_listContext(_ctx, _parentState);
		Python_named_argument_listContext _prevctx = _localctx;
		int _startState = 414;
		enterRecursionRule(_localctx, 414, RULE_python_named_argument_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PythonNamedArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2580);
			((PythonNamedArgumentListContext)_localctx).name = python_identifier();
			setState(2581);
			match(EQ);
			setState(2582);
			((PythonNamedArgumentListContext)_localctx).exp = python_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2592);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,222,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PythonNamedArgumentListItemContext(new Python_named_argument_listContext(_parentctx, _parentState));
					((PythonNamedArgumentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_python_named_argument_list);
					setState(2584);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2585);
					match(COMMA);
					setState(2586);
					((PythonNamedArgumentListItemContext)_localctx).name = python_identifier();
					setState(2587);
					match(EQ);
					setState(2588);
					((PythonNamedArgumentListItemContext)_localctx).exp = python_expression(0);
					}
					} 
				}
				setState(2594);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,222,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Python_parenthesis_expressionContext extends ParserRuleContext {
		public Python_expressionContext exp;
		public TerminalNode LPAR() { return getToken(EParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EParser.RPAR, 0); }
		public Python_expressionContext python_expression() {
			return getRuleContext(Python_expressionContext.class,0);
		}
		public Python_parenthesis_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_python_parenthesis_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterPython_parenthesis_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitPython_parenthesis_expression(this);
		}
	}

	public final Python_parenthesis_expressionContext python_parenthesis_expression() throws RecognitionException {
		Python_parenthesis_expressionContext _localctx = new Python_parenthesis_expressionContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_python_parenthesis_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2595);
			match(LPAR);
			setState(2596);
			((Python_parenthesis_expressionContext)_localctx).exp = python_expression(0);
			setState(2597);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Python_identifier_expressionContext extends ParserRuleContext {
		public Python_identifier_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_python_identifier_expression; }
	 
		public Python_identifier_expressionContext() { }
		public void copyFrom(Python_identifier_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PythonChildIdentifierContext extends Python_identifier_expressionContext {
		public Python_identifier_expressionContext parent;
		public Python_identifierContext name;
		public TerminalNode DOT() { return getToken(EParser.DOT, 0); }
		public Python_identifier_expressionContext python_identifier_expression() {
			return getRuleContext(Python_identifier_expressionContext.class,0);
		}
		public Python_identifierContext python_identifier() {
			return getRuleContext(Python_identifierContext.class,0);
		}
		public PythonChildIdentifierContext(Python_identifier_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterPythonChildIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitPythonChildIdentifier(this);
		}
	}
	public static class PythonPromptoIdentifierContext extends Python_identifier_expressionContext {
		public TerminalNode DOLLAR_IDENTIFIER() { return getToken(EParser.DOLLAR_IDENTIFIER, 0); }
		public PythonPromptoIdentifierContext(Python_identifier_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterPythonPromptoIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitPythonPromptoIdentifier(this);
		}
	}
	public static class PythonIdentifierContext extends Python_identifier_expressionContext {
		public Python_identifierContext name;
		public Python_identifierContext python_identifier() {
			return getRuleContext(Python_identifierContext.class,0);
		}
		public PythonIdentifierContext(Python_identifier_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterPythonIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitPythonIdentifier(this);
		}
	}

	public final Python_identifier_expressionContext python_identifier_expression() throws RecognitionException {
		return python_identifier_expression(0);
	}

	private Python_identifier_expressionContext python_identifier_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Python_identifier_expressionContext _localctx = new Python_identifier_expressionContext(_ctx, _parentState);
		Python_identifier_expressionContext _prevctx = _localctx;
		int _startState = 418;
		enterRecursionRule(_localctx, 418, RULE_python_identifier_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2602);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
			case 1:
				{
				_localctx = new PythonPromptoIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2600);
				match(DOLLAR_IDENTIFIER);
				}
				break;
			case 2:
				{
				_localctx = new PythonIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2601);
				((PythonIdentifierContext)_localctx).name = python_identifier();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2609);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,224,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PythonChildIdentifierContext(new Python_identifier_expressionContext(_parentctx, _parentState));
					((PythonChildIdentifierContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_python_identifier_expression);
					setState(2604);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2605);
					match(DOT);
					setState(2606);
					((PythonChildIdentifierContext)_localctx).name = python_identifier();
					}
					} 
				}
				setState(2611);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,224,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Python_literal_expressionContext extends ParserRuleContext {
		public Python_literal_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_python_literal_expression; }
	 
		public Python_literal_expressionContext() { }
		public void copyFrom(Python_literal_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PythonIntegerLiteralContext extends Python_literal_expressionContext {
		public Token t;
		public TerminalNode INTEGER_LITERAL() { return getToken(EParser.INTEGER_LITERAL, 0); }
		public PythonIntegerLiteralContext(Python_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterPythonIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitPythonIntegerLiteral(this);
		}
	}
	public static class PythonBooleanLiteralContext extends Python_literal_expressionContext {
		public Token t;
		public TerminalNode BOOLEAN_LITERAL() { return getToken(EParser.BOOLEAN_LITERAL, 0); }
		public PythonBooleanLiteralContext(Python_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterPythonBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitPythonBooleanLiteral(this);
		}
	}
	public static class PythonCharacterLiteralContext extends Python_literal_expressionContext {
		public Token t;
		public TerminalNode CHAR_LITERAL() { return getToken(EParser.CHAR_LITERAL, 0); }
		public PythonCharacterLiteralContext(Python_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterPythonCharacterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitPythonCharacterLiteral(this);
		}
	}
	public static class PythonTextLiteralContext extends Python_literal_expressionContext {
		public Token t;
		public TerminalNode TEXT_LITERAL() { return getToken(EParser.TEXT_LITERAL, 0); }
		public PythonTextLiteralContext(Python_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterPythonTextLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitPythonTextLiteral(this);
		}
	}
	public static class PythonDecimalLiteralContext extends Python_literal_expressionContext {
		public Token t;
		public TerminalNode DECIMAL_LITERAL() { return getToken(EParser.DECIMAL_LITERAL, 0); }
		public PythonDecimalLiteralContext(Python_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterPythonDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitPythonDecimalLiteral(this);
		}
	}

	public final Python_literal_expressionContext python_literal_expression() throws RecognitionException {
		Python_literal_expressionContext _localctx = new Python_literal_expressionContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_python_literal_expression);
		try {
			setState(2617);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				_localctx = new PythonIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2612);
				((PythonIntegerLiteralContext)_localctx).t = match(INTEGER_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				_localctx = new PythonDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2613);
				((PythonDecimalLiteralContext)_localctx).t = match(DECIMAL_LITERAL);
				}
				break;
			case TEXT_LITERAL:
				_localctx = new PythonTextLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2614);
				((PythonTextLiteralContext)_localctx).t = match(TEXT_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new PythonBooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2615);
				((PythonBooleanLiteralContext)_localctx).t = match(BOOLEAN_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new PythonCharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2616);
				((PythonCharacterLiteralContext)_localctx).t = match(CHAR_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Python_identifierContext extends ParserRuleContext {
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(EParser.VARIABLE_IDENTIFIER, 0); }
		public TerminalNode SYMBOL_IDENTIFIER() { return getToken(EParser.SYMBOL_IDENTIFIER, 0); }
		public TerminalNode DOLLAR_IDENTIFIER() { return getToken(EParser.DOLLAR_IDENTIFIER, 0); }
		public TerminalNode TYPE_IDENTIFIER() { return getToken(EParser.TYPE_IDENTIFIER, 0); }
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public Python_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_python_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterPython_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitPython_identifier(this);
		}
	}

	public final Python_identifierContext python_identifier() throws RecognitionException {
		Python_identifierContext _localctx = new Python_identifierContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_python_identifier);
		try {
			setState(2624);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2619);
				match(VARIABLE_IDENTIFIER);
				}
				break;
			case SYMBOL_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2620);
				match(SYMBOL_IDENTIFIER);
				}
				break;
			case DOLLAR_IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(2621);
				match(DOLLAR_IDENTIFIER);
				}
				break;
			case TYPE_IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(2622);
				match(TYPE_IDENTIFIER);
				}
				break;
			case JAVA:
			case CSHARP:
			case PYTHON2:
			case PYTHON3:
			case JAVASCRIPT:
			case SWIFT:
			case BOOLEAN:
			case CHARACTER:
			case TEXT:
			case INTEGER:
			case DECIMAL:
			case DATE:
			case TIME:
			case DATETIME:
			case PERIOD:
			case VERSION:
			case CODE:
			case DOCUMENT:
			case BLOB:
			case IMAGE:
			case UUID:
			case ITERATOR:
			case CURSOR:
			case HTML:
			case ABSTRACT:
			case ALL:
			case ALWAYS:
			case AND:
			case ANY:
			case AS:
			case ASC:
			case ATTR:
			case ATTRIBUTE:
			case ATTRIBUTES:
			case BINDINGS:
			case BREAK:
			case BY:
			case CASE:
			case CATCH:
			case CATEGORY:
			case CLASS:
			case CONTAINS:
			case DEF:
			case DEFAULT:
			case DEFINE:
			case DELETE:
			case DESC:
			case DO:
			case DOING:
			case EACH:
			case ELSE:
			case ENUM:
			case ENUMERATED:
			case EXCEPT:
			case EXECUTE:
			case EXPECTING:
			case EXTENDS:
			case FETCH:
			case FILTERED:
			case FINALLY:
			case FLUSH:
			case FOR:
			case FROM:
			case GETTER:
			case HAS:
			case IF:
			case IN:
			case INDEX:
			case IS:
			case MATCHING:
			case METHOD:
			case METHODS:
			case MODULO:
			case MUTABLE:
			case NATIVE:
			case NONE:
			case NOT:
			case NOTHING:
			case NULL:
			case ON:
			case ONE:
			case OPERATOR:
			case OR:
			case ORDER:
			case OTHERWISE:
			case PASS:
			case RAISE:
			case READ:
			case RECEIVING:
			case RESOURCE:
			case RETURN:
			case RETURNING:
			case ROWS:
			case SELF:
			case SETTER:
			case SINGLETON:
			case SORTED:
			case STORABLE:
			case STORE:
			case SUPER:
			case SWITCH:
			case TEST:
			case THIS:
			case THROW:
			case TO:
			case TRY:
			case VERIFYING:
			case WIDGET:
			case WITH:
			case WHEN:
			case WHERE:
			case WHILE:
			case WRITE:
				enterOuterAlt(_localctx, 5);
				{
				setState(2623);
				keyword();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Java_statementContext extends ParserRuleContext {
		public Java_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_statement; }
	 
		public Java_statementContext() { }
		public void copyFrom(Java_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class JavaReturnStatementContext extends Java_statementContext {
		public Java_expressionContext exp;
		public TerminalNode RETURN() { return getToken(EParser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(EParser.SEMI, 0); }
		public Java_expressionContext java_expression() {
			return getRuleContext(Java_expressionContext.class,0);
		}
		public JavaReturnStatementContext(Java_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJavaReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJavaReturnStatement(this);
		}
	}
	public static class JavaStatementContext extends Java_statementContext {
		public Java_expressionContext exp;
		public TerminalNode SEMI() { return getToken(EParser.SEMI, 0); }
		public Java_expressionContext java_expression() {
			return getRuleContext(Java_expressionContext.class,0);
		}
		public JavaStatementContext(Java_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJavaStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJavaStatement(this);
		}
	}

	public final Java_statementContext java_statement() throws RecognitionException {
		Java_statementContext _localctx = new Java_statementContext(_ctx, getState());
		enterRule(_localctx, 424, RULE_java_statement);
		try {
			setState(2633);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
			case 1:
				_localctx = new JavaReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2626);
				match(RETURN);
				setState(2627);
				((JavaReturnStatementContext)_localctx).exp = java_expression(0);
				setState(2628);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new JavaStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2630);
				((JavaStatementContext)_localctx).exp = java_expression(0);
				setState(2631);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Java_expressionContext extends ParserRuleContext {
		public Java_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_expression; }
	 
		public Java_expressionContext() { }
		public void copyFrom(Java_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class JavaSelectorExpressionContext extends Java_expressionContext {
		public Java_expressionContext parent;
		public Java_selector_expressionContext child;
		public Java_expressionContext java_expression() {
			return getRuleContext(Java_expressionContext.class,0);
		}
		public Java_selector_expressionContext java_selector_expression() {
			return getRuleContext(Java_selector_expressionContext.class,0);
		}
		public JavaSelectorExpressionContext(Java_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJavaSelectorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJavaSelectorExpression(this);
		}
	}
	public static class JavaPrimaryExpressionContext extends Java_expressionContext {
		public Java_primary_expressionContext exp;
		public Java_primary_expressionContext java_primary_expression() {
			return getRuleContext(Java_primary_expressionContext.class,0);
		}
		public JavaPrimaryExpressionContext(Java_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJavaPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJavaPrimaryExpression(this);
		}
	}

	public final Java_expressionContext java_expression() throws RecognitionException {
		return java_expression(0);
	}

	private Java_expressionContext java_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Java_expressionContext _localctx = new Java_expressionContext(_ctx, _parentState);
		Java_expressionContext _prevctx = _localctx;
		int _startState = 426;
		enterRecursionRule(_localctx, 426, RULE_java_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavaPrimaryExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2636);
			((JavaPrimaryExpressionContext)_localctx).exp = java_primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(2642);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,228,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavaSelectorExpressionContext(new Java_expressionContext(_parentctx, _parentState));
					((JavaSelectorExpressionContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_java_expression);
					setState(2638);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2639);
					((JavaSelectorExpressionContext)_localctx).child = java_selector_expression();
					}
					} 
				}
				setState(2644);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,228,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Java_primary_expressionContext extends ParserRuleContext {
		public Java_this_expressionContext java_this_expression() {
			return getRuleContext(Java_this_expressionContext.class,0);
		}
		public Java_new_expressionContext java_new_expression() {
			return getRuleContext(Java_new_expressionContext.class,0);
		}
		public Java_parenthesis_expressionContext java_parenthesis_expression() {
			return getRuleContext(Java_parenthesis_expressionContext.class,0);
		}
		public Java_identifier_expressionContext java_identifier_expression() {
			return getRuleContext(Java_identifier_expressionContext.class,0);
		}
		public Java_literal_expressionContext java_literal_expression() {
			return getRuleContext(Java_literal_expressionContext.class,0);
		}
		public Java_primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_primary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJava_primary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJava_primary_expression(this);
		}
	}

	public final Java_primary_expressionContext java_primary_expression() throws RecognitionException {
		Java_primary_expressionContext _localctx = new Java_primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 428, RULE_java_primary_expression);
		try {
			setState(2650);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2645);
				java_this_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2646);
				java_new_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2647);
				java_parenthesis_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2648);
				java_identifier_expression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2649);
				java_literal_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Java_this_expressionContext extends ParserRuleContext {
		public This_expressionContext this_expression() {
			return getRuleContext(This_expressionContext.class,0);
		}
		public Java_this_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_this_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJava_this_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJava_this_expression(this);
		}
	}

	public final Java_this_expressionContext java_this_expression() throws RecognitionException {
		Java_this_expressionContext _localctx = new Java_this_expressionContext(_ctx, getState());
		enterRule(_localctx, 430, RULE_java_this_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2652);
			this_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Java_new_expressionContext extends ParserRuleContext {
		public New_tokenContext new_token() {
			return getRuleContext(New_tokenContext.class,0);
		}
		public Java_method_expressionContext java_method_expression() {
			return getRuleContext(Java_method_expressionContext.class,0);
		}
		public Java_new_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_new_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJava_new_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJava_new_expression(this);
		}
	}

	public final Java_new_expressionContext java_new_expression() throws RecognitionException {
		Java_new_expressionContext _localctx = new Java_new_expressionContext(_ctx, getState());
		enterRule(_localctx, 432, RULE_java_new_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2654);
			new_token();
			setState(2655);
			java_method_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Java_selector_expressionContext extends ParserRuleContext {
		public Java_selector_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_selector_expression; }
	 
		public Java_selector_expressionContext() { }
		public void copyFrom(Java_selector_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class JavaItemExpressionContext extends Java_selector_expressionContext {
		public Java_item_expressionContext exp;
		public Java_item_expressionContext java_item_expression() {
			return getRuleContext(Java_item_expressionContext.class,0);
		}
		public JavaItemExpressionContext(Java_selector_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJavaItemExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJavaItemExpression(this);
		}
	}
	public static class JavaMethodExpressionContext extends Java_selector_expressionContext {
		public Java_method_expressionContext exp;
		public TerminalNode DOT() { return getToken(EParser.DOT, 0); }
		public Java_method_expressionContext java_method_expression() {
			return getRuleContext(Java_method_expressionContext.class,0);
		}
		public JavaMethodExpressionContext(Java_selector_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJavaMethodExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJavaMethodExpression(this);
		}
	}

	public final Java_selector_expressionContext java_selector_expression() throws RecognitionException {
		Java_selector_expressionContext _localctx = new Java_selector_expressionContext(_ctx, getState());
		enterRule(_localctx, 434, RULE_java_selector_expression);
		try {
			setState(2660);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				_localctx = new JavaMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2657);
				match(DOT);
				setState(2658);
				((JavaMethodExpressionContext)_localctx).exp = java_method_expression();
				}
				break;
			case LBRAK:
				_localctx = new JavaItemExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2659);
				((JavaItemExpressionContext)_localctx).exp = java_item_expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Java_method_expressionContext extends ParserRuleContext {
		public Java_identifierContext name;
		public Java_argumentsContext args;
		public TerminalNode LPAR() { return getToken(EParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EParser.RPAR, 0); }
		public Java_identifierContext java_identifier() {
			return getRuleContext(Java_identifierContext.class,0);
		}
		public Java_argumentsContext java_arguments() {
			return getRuleContext(Java_argumentsContext.class,0);
		}
		public Java_method_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_method_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJava_method_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJava_method_expression(this);
		}
	}

	public final Java_method_expressionContext java_method_expression() throws RecognitionException {
		Java_method_expressionContext _localctx = new Java_method_expressionContext(_ctx, getState());
		enterRule(_localctx, 436, RULE_java_method_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2662);
			((Java_method_expressionContext)_localctx).name = java_identifier();
			setState(2663);
			match(LPAR);
			setState(2665);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA) | (1L << CSHARP) | (1L << PYTHON2) | (1L << PYTHON3) | (1L << JAVASCRIPT) | (1L << SWIFT) | (1L << LPAR) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (CODE - 65)) | (1L << (DOCUMENT - 65)) | (1L << (BLOB - 65)) | (1L << (IMAGE - 65)) | (1L << (UUID - 65)) | (1L << (ITERATOR - 65)) | (1L << (CURSOR - 65)) | (1L << (HTML - 65)) | (1L << (ABSTRACT - 65)) | (1L << (ALL - 65)) | (1L << (ALWAYS - 65)) | (1L << (AND - 65)) | (1L << (ANY - 65)) | (1L << (AS - 65)) | (1L << (ASC - 65)) | (1L << (ATTR - 65)) | (1L << (ATTRIBUTE - 65)) | (1L << (ATTRIBUTES - 65)) | (1L << (BINDINGS - 65)) | (1L << (BREAK - 65)) | (1L << (BY - 65)) | (1L << (CASE - 65)) | (1L << (CATCH - 65)) | (1L << (CATEGORY - 65)) | (1L << (CLASS - 65)) | (1L << (CONTAINS - 65)) | (1L << (DEF - 65)) | (1L << (DEFAULT - 65)) | (1L << (DEFINE - 65)) | (1L << (DELETE - 65)) | (1L << (DESC - 65)) | (1L << (DO - 65)) | (1L << (DOING - 65)) | (1L << (EACH - 65)) | (1L << (ELSE - 65)) | (1L << (ENUM - 65)) | (1L << (ENUMERATED - 65)) | (1L << (EXCEPT - 65)) | (1L << (EXECUTE - 65)) | (1L << (EXPECTING - 65)) | (1L << (EXTENDS - 65)) | (1L << (FETCH - 65)) | (1L << (FILTERED - 65)) | (1L << (FINALLY - 65)) | (1L << (FLUSH - 65)) | (1L << (FOR - 65)) | (1L << (FROM - 65)) | (1L << (GETTER - 65)) | (1L << (HAS - 65)) | (1L << (IF - 65)) | (1L << (IN - 65)) | (1L << (INDEX - 65)) | (1L << (IS - 65)) | (1L << (MATCHING - 65)) | (1L << (METHOD - 65)) | (1L << (METHODS - 65)) | (1L << (MODULO - 65)) | (1L << (MUTABLE - 65)) | (1L << (NATIVE - 65)) | (1L << (NONE - 65)) | (1L << (NOT - 65)) | (1L << (NOTHING - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (NULL - 129)) | (1L << (ON - 129)) | (1L << (ONE - 129)) | (1L << (OPERATOR - 129)) | (1L << (OR - 129)) | (1L << (ORDER - 129)) | (1L << (OTHERWISE - 129)) | (1L << (PASS - 129)) | (1L << (RAISE - 129)) | (1L << (READ - 129)) | (1L << (RECEIVING - 129)) | (1L << (RESOURCE - 129)) | (1L << (RETURN - 129)) | (1L << (RETURNING - 129)) | (1L << (ROWS - 129)) | (1L << (SELF - 129)) | (1L << (SETTER - 129)) | (1L << (SINGLETON - 129)) | (1L << (SORTED - 129)) | (1L << (STORABLE - 129)) | (1L << (STORE - 129)) | (1L << (SUPER - 129)) | (1L << (SWITCH - 129)) | (1L << (TEST - 129)) | (1L << (THIS - 129)) | (1L << (THROW - 129)) | (1L << (TO - 129)) | (1L << (TRY - 129)) | (1L << (VERIFYING - 129)) | (1L << (WIDGET - 129)) | (1L << (WITH - 129)) | (1L << (WHEN - 129)) | (1L << (WHERE - 129)) | (1L << (WHILE - 129)) | (1L << (WRITE - 129)) | (1L << (BOOLEAN_LITERAL - 129)) | (1L << (CHAR_LITERAL - 129)) | (1L << (SYMBOL_IDENTIFIER - 129)) | (1L << (TYPE_IDENTIFIER - 129)) | (1L << (VARIABLE_IDENTIFIER - 129)) | (1L << (DOLLAR_IDENTIFIER - 129)) | (1L << (TEXT_LITERAL - 129)) | (1L << (INTEGER_LITERAL - 129)) | (1L << (DECIMAL_LITERAL - 129)))) != 0)) {
				{
				setState(2664);
				((Java_method_expressionContext)_localctx).args = java_arguments(0);
				}
			}

			setState(2667);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Java_argumentsContext extends ParserRuleContext {
		public Java_argumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_arguments; }
	 
		public Java_argumentsContext() { }
		public void copyFrom(Java_argumentsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class JavaArgumentListItemContext extends Java_argumentsContext {
		public Java_argumentsContext items;
		public Java_expressionContext item;
		public TerminalNode COMMA() { return getToken(EParser.COMMA, 0); }
		public Java_argumentsContext java_arguments() {
			return getRuleContext(Java_argumentsContext.class,0);
		}
		public Java_expressionContext java_expression() {
			return getRuleContext(Java_expressionContext.class,0);
		}
		public JavaArgumentListItemContext(Java_argumentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJavaArgumentListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJavaArgumentListItem(this);
		}
	}
	public static class JavaArgumentListContext extends Java_argumentsContext {
		public Java_expressionContext item;
		public Java_expressionContext java_expression() {
			return getRuleContext(Java_expressionContext.class,0);
		}
		public JavaArgumentListContext(Java_argumentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJavaArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJavaArgumentList(this);
		}
	}

	public final Java_argumentsContext java_arguments() throws RecognitionException {
		return java_arguments(0);
	}

	private Java_argumentsContext java_arguments(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Java_argumentsContext _localctx = new Java_argumentsContext(_ctx, _parentState);
		Java_argumentsContext _prevctx = _localctx;
		int _startState = 438;
		enterRecursionRule(_localctx, 438, RULE_java_arguments, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavaArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2670);
			((JavaArgumentListContext)_localctx).item = java_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2677);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,232,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavaArgumentListItemContext(new Java_argumentsContext(_parentctx, _parentState));
					((JavaArgumentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_java_arguments);
					setState(2672);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2673);
					match(COMMA);
					setState(2674);
					((JavaArgumentListItemContext)_localctx).item = java_expression(0);
					}
					} 
				}
				setState(2679);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,232,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Java_item_expressionContext extends ParserRuleContext {
		public Java_expressionContext exp;
		public TerminalNode LBRAK() { return getToken(EParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(EParser.RBRAK, 0); }
		public Java_expressionContext java_expression() {
			return getRuleContext(Java_expressionContext.class,0);
		}
		public Java_item_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_item_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJava_item_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJava_item_expression(this);
		}
	}

	public final Java_item_expressionContext java_item_expression() throws RecognitionException {
		Java_item_expressionContext _localctx = new Java_item_expressionContext(_ctx, getState());
		enterRule(_localctx, 440, RULE_java_item_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2680);
			match(LBRAK);
			setState(2681);
			((Java_item_expressionContext)_localctx).exp = java_expression(0);
			setState(2682);
			match(RBRAK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Java_parenthesis_expressionContext extends ParserRuleContext {
		public Java_expressionContext exp;
		public TerminalNode LPAR() { return getToken(EParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EParser.RPAR, 0); }
		public Java_expressionContext java_expression() {
			return getRuleContext(Java_expressionContext.class,0);
		}
		public Java_parenthesis_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_parenthesis_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJava_parenthesis_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJava_parenthesis_expression(this);
		}
	}

	public final Java_parenthesis_expressionContext java_parenthesis_expression() throws RecognitionException {
		Java_parenthesis_expressionContext _localctx = new Java_parenthesis_expressionContext(_ctx, getState());
		enterRule(_localctx, 442, RULE_java_parenthesis_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2684);
			match(LPAR);
			setState(2685);
			((Java_parenthesis_expressionContext)_localctx).exp = java_expression(0);
			setState(2686);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Java_identifier_expressionContext extends ParserRuleContext {
		public Java_identifier_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_identifier_expression; }
	 
		public Java_identifier_expressionContext() { }
		public void copyFrom(Java_identifier_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class JavaIdentifierContext extends Java_identifier_expressionContext {
		public Java_identifierContext name;
		public Java_identifierContext java_identifier() {
			return getRuleContext(Java_identifierContext.class,0);
		}
		public JavaIdentifierContext(Java_identifier_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJavaIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJavaIdentifier(this);
		}
	}
	public static class JavaChildIdentifierContext extends Java_identifier_expressionContext {
		public Java_identifier_expressionContext parent;
		public Java_identifierContext name;
		public TerminalNode DOT() { return getToken(EParser.DOT, 0); }
		public Java_identifier_expressionContext java_identifier_expression() {
			return getRuleContext(Java_identifier_expressionContext.class,0);
		}
		public Java_identifierContext java_identifier() {
			return getRuleContext(Java_identifierContext.class,0);
		}
		public JavaChildIdentifierContext(Java_identifier_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJavaChildIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJavaChildIdentifier(this);
		}
	}

	public final Java_identifier_expressionContext java_identifier_expression() throws RecognitionException {
		return java_identifier_expression(0);
	}

	private Java_identifier_expressionContext java_identifier_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Java_identifier_expressionContext _localctx = new Java_identifier_expressionContext(_ctx, _parentState);
		Java_identifier_expressionContext _prevctx = _localctx;
		int _startState = 444;
		enterRecursionRule(_localctx, 444, RULE_java_identifier_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavaIdentifierContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2689);
			((JavaIdentifierContext)_localctx).name = java_identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(2696);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,233,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavaChildIdentifierContext(new Java_identifier_expressionContext(_parentctx, _parentState));
					((JavaChildIdentifierContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_java_identifier_expression);
					setState(2691);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2692);
					match(DOT);
					setState(2693);
					((JavaChildIdentifierContext)_localctx).name = java_identifier();
					}
					} 
				}
				setState(2698);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,233,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Java_class_identifier_expressionContext extends ParserRuleContext {
		public Java_class_identifier_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_class_identifier_expression; }
	 
		public Java_class_identifier_expressionContext() { }
		public void copyFrom(Java_class_identifier_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class JavaClassIdentifierContext extends Java_class_identifier_expressionContext {
		public Java_identifier_expressionContext klass;
		public Java_identifier_expressionContext java_identifier_expression() {
			return getRuleContext(Java_identifier_expressionContext.class,0);
		}
		public JavaClassIdentifierContext(Java_class_identifier_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJavaClassIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJavaClassIdentifier(this);
		}
	}
	public static class JavaChildClassIdentifierContext extends Java_class_identifier_expressionContext {
		public Java_class_identifier_expressionContext parent;
		public Token name;
		public Java_class_identifier_expressionContext java_class_identifier_expression() {
			return getRuleContext(Java_class_identifier_expressionContext.class,0);
		}
		public TerminalNode DOLLAR_IDENTIFIER() { return getToken(EParser.DOLLAR_IDENTIFIER, 0); }
		public JavaChildClassIdentifierContext(Java_class_identifier_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJavaChildClassIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJavaChildClassIdentifier(this);
		}
	}

	public final Java_class_identifier_expressionContext java_class_identifier_expression() throws RecognitionException {
		return java_class_identifier_expression(0);
	}

	private Java_class_identifier_expressionContext java_class_identifier_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Java_class_identifier_expressionContext _localctx = new Java_class_identifier_expressionContext(_ctx, _parentState);
		Java_class_identifier_expressionContext _prevctx = _localctx;
		int _startState = 446;
		enterRecursionRule(_localctx, 446, RULE_java_class_identifier_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavaClassIdentifierContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2700);
			((JavaClassIdentifierContext)_localctx).klass = java_identifier_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2706);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,234,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavaChildClassIdentifierContext(new Java_class_identifier_expressionContext(_parentctx, _parentState));
					((JavaChildClassIdentifierContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_java_class_identifier_expression);
					setState(2702);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2703);
					((JavaChildClassIdentifierContext)_localctx).name = match(DOLLAR_IDENTIFIER);
					}
					} 
				}
				setState(2708);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,234,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Java_literal_expressionContext extends ParserRuleContext {
		public Java_literal_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_literal_expression; }
	 
		public Java_literal_expressionContext() { }
		public void copyFrom(Java_literal_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class JavaBooleanLiteralContext extends Java_literal_expressionContext {
		public Token t;
		public TerminalNode BOOLEAN_LITERAL() { return getToken(EParser.BOOLEAN_LITERAL, 0); }
		public JavaBooleanLiteralContext(Java_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJavaBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJavaBooleanLiteral(this);
		}
	}
	public static class JavaCharacterLiteralContext extends Java_literal_expressionContext {
		public Token t;
		public TerminalNode CHAR_LITERAL() { return getToken(EParser.CHAR_LITERAL, 0); }
		public JavaCharacterLiteralContext(Java_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJavaCharacterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJavaCharacterLiteral(this);
		}
	}
	public static class JavaIntegerLiteralContext extends Java_literal_expressionContext {
		public Token t;
		public TerminalNode INTEGER_LITERAL() { return getToken(EParser.INTEGER_LITERAL, 0); }
		public JavaIntegerLiteralContext(Java_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJavaIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJavaIntegerLiteral(this);
		}
	}
	public static class JavaTextLiteralContext extends Java_literal_expressionContext {
		public Token t;
		public TerminalNode TEXT_LITERAL() { return getToken(EParser.TEXT_LITERAL, 0); }
		public JavaTextLiteralContext(Java_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJavaTextLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJavaTextLiteral(this);
		}
	}
	public static class JavaDecimalLiteralContext extends Java_literal_expressionContext {
		public Token t;
		public TerminalNode DECIMAL_LITERAL() { return getToken(EParser.DECIMAL_LITERAL, 0); }
		public JavaDecimalLiteralContext(Java_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJavaDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJavaDecimalLiteral(this);
		}
	}

	public final Java_literal_expressionContext java_literal_expression() throws RecognitionException {
		Java_literal_expressionContext _localctx = new Java_literal_expressionContext(_ctx, getState());
		enterRule(_localctx, 448, RULE_java_literal_expression);
		try {
			setState(2714);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				_localctx = new JavaIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2709);
				((JavaIntegerLiteralContext)_localctx).t = match(INTEGER_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				_localctx = new JavaDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2710);
				((JavaDecimalLiteralContext)_localctx).t = match(DECIMAL_LITERAL);
				}
				break;
			case TEXT_LITERAL:
				_localctx = new JavaTextLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2711);
				((JavaTextLiteralContext)_localctx).t = match(TEXT_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new JavaBooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2712);
				((JavaBooleanLiteralContext)_localctx).t = match(BOOLEAN_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new JavaCharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2713);
				((JavaCharacterLiteralContext)_localctx).t = match(CHAR_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Java_identifierContext extends ParserRuleContext {
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(EParser.VARIABLE_IDENTIFIER, 0); }
		public TerminalNode SYMBOL_IDENTIFIER() { return getToken(EParser.SYMBOL_IDENTIFIER, 0); }
		public TerminalNode DOLLAR_IDENTIFIER() { return getToken(EParser.DOLLAR_IDENTIFIER, 0); }
		public TerminalNode TYPE_IDENTIFIER() { return getToken(EParser.TYPE_IDENTIFIER, 0); }
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public Java_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJava_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJava_identifier(this);
		}
	}

	public final Java_identifierContext java_identifier() throws RecognitionException {
		Java_identifierContext _localctx = new Java_identifierContext(_ctx, getState());
		enterRule(_localctx, 450, RULE_java_identifier);
		try {
			setState(2721);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2716);
				match(VARIABLE_IDENTIFIER);
				}
				break;
			case SYMBOL_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2717);
				match(SYMBOL_IDENTIFIER);
				}
				break;
			case DOLLAR_IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(2718);
				match(DOLLAR_IDENTIFIER);
				}
				break;
			case TYPE_IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(2719);
				match(TYPE_IDENTIFIER);
				}
				break;
			case JAVA:
			case CSHARP:
			case PYTHON2:
			case PYTHON3:
			case JAVASCRIPT:
			case SWIFT:
			case BOOLEAN:
			case CHARACTER:
			case TEXT:
			case INTEGER:
			case DECIMAL:
			case DATE:
			case TIME:
			case DATETIME:
			case PERIOD:
			case VERSION:
			case CODE:
			case DOCUMENT:
			case BLOB:
			case IMAGE:
			case UUID:
			case ITERATOR:
			case CURSOR:
			case HTML:
			case ABSTRACT:
			case ALL:
			case ALWAYS:
			case AND:
			case ANY:
			case AS:
			case ASC:
			case ATTR:
			case ATTRIBUTE:
			case ATTRIBUTES:
			case BINDINGS:
			case BREAK:
			case BY:
			case CASE:
			case CATCH:
			case CATEGORY:
			case CLASS:
			case CONTAINS:
			case DEF:
			case DEFAULT:
			case DEFINE:
			case DELETE:
			case DESC:
			case DO:
			case DOING:
			case EACH:
			case ELSE:
			case ENUM:
			case ENUMERATED:
			case EXCEPT:
			case EXECUTE:
			case EXPECTING:
			case EXTENDS:
			case FETCH:
			case FILTERED:
			case FINALLY:
			case FLUSH:
			case FOR:
			case FROM:
			case GETTER:
			case HAS:
			case IF:
			case IN:
			case INDEX:
			case IS:
			case MATCHING:
			case METHOD:
			case METHODS:
			case MODULO:
			case MUTABLE:
			case NATIVE:
			case NONE:
			case NOT:
			case NOTHING:
			case NULL:
			case ON:
			case ONE:
			case OPERATOR:
			case OR:
			case ORDER:
			case OTHERWISE:
			case PASS:
			case RAISE:
			case READ:
			case RECEIVING:
			case RESOURCE:
			case RETURN:
			case RETURNING:
			case ROWS:
			case SELF:
			case SETTER:
			case SINGLETON:
			case SORTED:
			case STORABLE:
			case STORE:
			case SUPER:
			case SWITCH:
			case TEST:
			case THIS:
			case THROW:
			case TO:
			case TRY:
			case VERIFYING:
			case WIDGET:
			case WITH:
			case WHEN:
			case WHERE:
			case WHILE:
			case WRITE:
				enterOuterAlt(_localctx, 5);
				{
				setState(2720);
				keyword();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Csharp_statementContext extends ParserRuleContext {
		public Csharp_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csharp_statement; }
	 
		public Csharp_statementContext() { }
		public void copyFrom(Csharp_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CSharpReturnStatementContext extends Csharp_statementContext {
		public Csharp_expressionContext exp;
		public TerminalNode RETURN() { return getToken(EParser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(EParser.SEMI, 0); }
		public Csharp_expressionContext csharp_expression() {
			return getRuleContext(Csharp_expressionContext.class,0);
		}
		public CSharpReturnStatementContext(Csharp_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterCSharpReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitCSharpReturnStatement(this);
		}
	}
	public static class CSharpStatementContext extends Csharp_statementContext {
		public Csharp_expressionContext exp;
		public TerminalNode SEMI() { return getToken(EParser.SEMI, 0); }
		public Csharp_expressionContext csharp_expression() {
			return getRuleContext(Csharp_expressionContext.class,0);
		}
		public CSharpStatementContext(Csharp_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterCSharpStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitCSharpStatement(this);
		}
	}

	public final Csharp_statementContext csharp_statement() throws RecognitionException {
		Csharp_statementContext _localctx = new Csharp_statementContext(_ctx, getState());
		enterRule(_localctx, 452, RULE_csharp_statement);
		try {
			setState(2730);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
			case 1:
				_localctx = new CSharpReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2723);
				match(RETURN);
				setState(2724);
				((CSharpReturnStatementContext)_localctx).exp = csharp_expression(0);
				setState(2725);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new CSharpStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2727);
				((CSharpStatementContext)_localctx).exp = csharp_expression(0);
				setState(2728);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Csharp_expressionContext extends ParserRuleContext {
		public Csharp_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csharp_expression; }
	 
		public Csharp_expressionContext() { }
		public void copyFrom(Csharp_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CSharpSelectorExpressionContext extends Csharp_expressionContext {
		public Csharp_expressionContext parent;
		public Csharp_selector_expressionContext child;
		public Csharp_expressionContext csharp_expression() {
			return getRuleContext(Csharp_expressionContext.class,0);
		}
		public Csharp_selector_expressionContext csharp_selector_expression() {
			return getRuleContext(Csharp_selector_expressionContext.class,0);
		}
		public CSharpSelectorExpressionContext(Csharp_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterCSharpSelectorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitCSharpSelectorExpression(this);
		}
	}
	public static class CSharpPrimaryExpressionContext extends Csharp_expressionContext {
		public Csharp_primary_expressionContext exp;
		public Csharp_primary_expressionContext csharp_primary_expression() {
			return getRuleContext(Csharp_primary_expressionContext.class,0);
		}
		public CSharpPrimaryExpressionContext(Csharp_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterCSharpPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitCSharpPrimaryExpression(this);
		}
	}

	public final Csharp_expressionContext csharp_expression() throws RecognitionException {
		return csharp_expression(0);
	}

	private Csharp_expressionContext csharp_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Csharp_expressionContext _localctx = new Csharp_expressionContext(_ctx, _parentState);
		Csharp_expressionContext _prevctx = _localctx;
		int _startState = 454;
		enterRecursionRule(_localctx, 454, RULE_csharp_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new CSharpPrimaryExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2733);
			((CSharpPrimaryExpressionContext)_localctx).exp = csharp_primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(2739);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,238,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CSharpSelectorExpressionContext(new Csharp_expressionContext(_parentctx, _parentState));
					((CSharpSelectorExpressionContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_csharp_expression);
					setState(2735);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2736);
					((CSharpSelectorExpressionContext)_localctx).child = csharp_selector_expression();
					}
					} 
				}
				setState(2741);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,238,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Csharp_primary_expressionContext extends ParserRuleContext {
		public Csharp_this_expressionContext csharp_this_expression() {
			return getRuleContext(Csharp_this_expressionContext.class,0);
		}
		public Csharp_new_expressionContext csharp_new_expression() {
			return getRuleContext(Csharp_new_expressionContext.class,0);
		}
		public Csharp_parenthesis_expressionContext csharp_parenthesis_expression() {
			return getRuleContext(Csharp_parenthesis_expressionContext.class,0);
		}
		public Csharp_identifier_expressionContext csharp_identifier_expression() {
			return getRuleContext(Csharp_identifier_expressionContext.class,0);
		}
		public Csharp_literal_expressionContext csharp_literal_expression() {
			return getRuleContext(Csharp_literal_expressionContext.class,0);
		}
		public Csharp_primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csharp_primary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterCsharp_primary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitCsharp_primary_expression(this);
		}
	}

	public final Csharp_primary_expressionContext csharp_primary_expression() throws RecognitionException {
		Csharp_primary_expressionContext _localctx = new Csharp_primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 456, RULE_csharp_primary_expression);
		try {
			setState(2747);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2742);
				csharp_this_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2743);
				csharp_new_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2744);
				csharp_parenthesis_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2745);
				csharp_identifier_expression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2746);
				csharp_literal_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Csharp_this_expressionContext extends ParserRuleContext {
		public This_expressionContext this_expression() {
			return getRuleContext(This_expressionContext.class,0);
		}
		public Csharp_this_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csharp_this_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterCsharp_this_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitCsharp_this_expression(this);
		}
	}

	public final Csharp_this_expressionContext csharp_this_expression() throws RecognitionException {
		Csharp_this_expressionContext _localctx = new Csharp_this_expressionContext(_ctx, getState());
		enterRule(_localctx, 458, RULE_csharp_this_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2749);
			this_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Csharp_new_expressionContext extends ParserRuleContext {
		public New_tokenContext new_token() {
			return getRuleContext(New_tokenContext.class,0);
		}
		public Csharp_method_expressionContext csharp_method_expression() {
			return getRuleContext(Csharp_method_expressionContext.class,0);
		}
		public Csharp_new_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csharp_new_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterCsharp_new_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitCsharp_new_expression(this);
		}
	}

	public final Csharp_new_expressionContext csharp_new_expression() throws RecognitionException {
		Csharp_new_expressionContext _localctx = new Csharp_new_expressionContext(_ctx, getState());
		enterRule(_localctx, 460, RULE_csharp_new_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2751);
			new_token();
			setState(2752);
			csharp_method_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Csharp_selector_expressionContext extends ParserRuleContext {
		public Csharp_selector_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csharp_selector_expression; }
	 
		public Csharp_selector_expressionContext() { }
		public void copyFrom(Csharp_selector_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CSharpMethodExpressionContext extends Csharp_selector_expressionContext {
		public Csharp_method_expressionContext exp;
		public TerminalNode DOT() { return getToken(EParser.DOT, 0); }
		public Csharp_method_expressionContext csharp_method_expression() {
			return getRuleContext(Csharp_method_expressionContext.class,0);
		}
		public CSharpMethodExpressionContext(Csharp_selector_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterCSharpMethodExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitCSharpMethodExpression(this);
		}
	}
	public static class CSharpItemExpressionContext extends Csharp_selector_expressionContext {
		public Csharp_item_expressionContext exp;
		public Csharp_item_expressionContext csharp_item_expression() {
			return getRuleContext(Csharp_item_expressionContext.class,0);
		}
		public CSharpItemExpressionContext(Csharp_selector_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterCSharpItemExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitCSharpItemExpression(this);
		}
	}

	public final Csharp_selector_expressionContext csharp_selector_expression() throws RecognitionException {
		Csharp_selector_expressionContext _localctx = new Csharp_selector_expressionContext(_ctx, getState());
		enterRule(_localctx, 462, RULE_csharp_selector_expression);
		try {
			setState(2757);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				_localctx = new CSharpMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2754);
				match(DOT);
				setState(2755);
				((CSharpMethodExpressionContext)_localctx).exp = csharp_method_expression();
				}
				break;
			case LBRAK:
				_localctx = new CSharpItemExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2756);
				((CSharpItemExpressionContext)_localctx).exp = csharp_item_expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Csharp_method_expressionContext extends ParserRuleContext {
		public Csharp_identifierContext name;
		public Csharp_argumentsContext args;
		public TerminalNode LPAR() { return getToken(EParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EParser.RPAR, 0); }
		public Csharp_identifierContext csharp_identifier() {
			return getRuleContext(Csharp_identifierContext.class,0);
		}
		public Csharp_argumentsContext csharp_arguments() {
			return getRuleContext(Csharp_argumentsContext.class,0);
		}
		public Csharp_method_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csharp_method_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterCsharp_method_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitCsharp_method_expression(this);
		}
	}

	public final Csharp_method_expressionContext csharp_method_expression() throws RecognitionException {
		Csharp_method_expressionContext _localctx = new Csharp_method_expressionContext(_ctx, getState());
		enterRule(_localctx, 464, RULE_csharp_method_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2759);
			((Csharp_method_expressionContext)_localctx).name = csharp_identifier();
			setState(2760);
			match(LPAR);
			setState(2762);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA) | (1L << CSHARP) | (1L << PYTHON2) | (1L << PYTHON3) | (1L << JAVASCRIPT) | (1L << SWIFT) | (1L << LPAR) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (CODE - 65)) | (1L << (DOCUMENT - 65)) | (1L << (BLOB - 65)) | (1L << (IMAGE - 65)) | (1L << (UUID - 65)) | (1L << (ITERATOR - 65)) | (1L << (CURSOR - 65)) | (1L << (HTML - 65)) | (1L << (ABSTRACT - 65)) | (1L << (ALL - 65)) | (1L << (ALWAYS - 65)) | (1L << (AND - 65)) | (1L << (ANY - 65)) | (1L << (AS - 65)) | (1L << (ASC - 65)) | (1L << (ATTR - 65)) | (1L << (ATTRIBUTE - 65)) | (1L << (ATTRIBUTES - 65)) | (1L << (BINDINGS - 65)) | (1L << (BREAK - 65)) | (1L << (BY - 65)) | (1L << (CASE - 65)) | (1L << (CATCH - 65)) | (1L << (CATEGORY - 65)) | (1L << (CLASS - 65)) | (1L << (CONTAINS - 65)) | (1L << (DEF - 65)) | (1L << (DEFAULT - 65)) | (1L << (DEFINE - 65)) | (1L << (DELETE - 65)) | (1L << (DESC - 65)) | (1L << (DO - 65)) | (1L << (DOING - 65)) | (1L << (EACH - 65)) | (1L << (ELSE - 65)) | (1L << (ENUM - 65)) | (1L << (ENUMERATED - 65)) | (1L << (EXCEPT - 65)) | (1L << (EXECUTE - 65)) | (1L << (EXPECTING - 65)) | (1L << (EXTENDS - 65)) | (1L << (FETCH - 65)) | (1L << (FILTERED - 65)) | (1L << (FINALLY - 65)) | (1L << (FLUSH - 65)) | (1L << (FOR - 65)) | (1L << (FROM - 65)) | (1L << (GETTER - 65)) | (1L << (HAS - 65)) | (1L << (IF - 65)) | (1L << (IN - 65)) | (1L << (INDEX - 65)) | (1L << (IS - 65)) | (1L << (MATCHING - 65)) | (1L << (METHOD - 65)) | (1L << (METHODS - 65)) | (1L << (MODULO - 65)) | (1L << (MUTABLE - 65)) | (1L << (NATIVE - 65)) | (1L << (NONE - 65)) | (1L << (NOT - 65)) | (1L << (NOTHING - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (NULL - 129)) | (1L << (ON - 129)) | (1L << (ONE - 129)) | (1L << (OPERATOR - 129)) | (1L << (OR - 129)) | (1L << (ORDER - 129)) | (1L << (OTHERWISE - 129)) | (1L << (PASS - 129)) | (1L << (RAISE - 129)) | (1L << (READ - 129)) | (1L << (RECEIVING - 129)) | (1L << (RESOURCE - 129)) | (1L << (RETURN - 129)) | (1L << (RETURNING - 129)) | (1L << (ROWS - 129)) | (1L << (SELF - 129)) | (1L << (SETTER - 129)) | (1L << (SINGLETON - 129)) | (1L << (SORTED - 129)) | (1L << (STORABLE - 129)) | (1L << (STORE - 129)) | (1L << (SUPER - 129)) | (1L << (SWITCH - 129)) | (1L << (TEST - 129)) | (1L << (THIS - 129)) | (1L << (THROW - 129)) | (1L << (TO - 129)) | (1L << (TRY - 129)) | (1L << (VERIFYING - 129)) | (1L << (WIDGET - 129)) | (1L << (WITH - 129)) | (1L << (WHEN - 129)) | (1L << (WHERE - 129)) | (1L << (WHILE - 129)) | (1L << (WRITE - 129)) | (1L << (BOOLEAN_LITERAL - 129)) | (1L << (CHAR_LITERAL - 129)) | (1L << (SYMBOL_IDENTIFIER - 129)) | (1L << (TYPE_IDENTIFIER - 129)) | (1L << (VARIABLE_IDENTIFIER - 129)) | (1L << (DOLLAR_IDENTIFIER - 129)) | (1L << (TEXT_LITERAL - 129)) | (1L << (INTEGER_LITERAL - 129)) | (1L << (DECIMAL_LITERAL - 129)))) != 0)) {
				{
				setState(2761);
				((Csharp_method_expressionContext)_localctx).args = csharp_arguments(0);
				}
			}

			setState(2764);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Csharp_argumentsContext extends ParserRuleContext {
		public Csharp_argumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csharp_arguments; }
	 
		public Csharp_argumentsContext() { }
		public void copyFrom(Csharp_argumentsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CSharpArgumentListContext extends Csharp_argumentsContext {
		public Csharp_expressionContext item;
		public Csharp_expressionContext csharp_expression() {
			return getRuleContext(Csharp_expressionContext.class,0);
		}
		public CSharpArgumentListContext(Csharp_argumentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterCSharpArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitCSharpArgumentList(this);
		}
	}
	public static class CSharpArgumentListItemContext extends Csharp_argumentsContext {
		public Csharp_argumentsContext items;
		public Csharp_expressionContext item;
		public TerminalNode COMMA() { return getToken(EParser.COMMA, 0); }
		public Csharp_argumentsContext csharp_arguments() {
			return getRuleContext(Csharp_argumentsContext.class,0);
		}
		public Csharp_expressionContext csharp_expression() {
			return getRuleContext(Csharp_expressionContext.class,0);
		}
		public CSharpArgumentListItemContext(Csharp_argumentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterCSharpArgumentListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitCSharpArgumentListItem(this);
		}
	}

	public final Csharp_argumentsContext csharp_arguments() throws RecognitionException {
		return csharp_arguments(0);
	}

	private Csharp_argumentsContext csharp_arguments(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Csharp_argumentsContext _localctx = new Csharp_argumentsContext(_ctx, _parentState);
		Csharp_argumentsContext _prevctx = _localctx;
		int _startState = 466;
		enterRecursionRule(_localctx, 466, RULE_csharp_arguments, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new CSharpArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2767);
			((CSharpArgumentListContext)_localctx).item = csharp_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2774);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,242,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CSharpArgumentListItemContext(new Csharp_argumentsContext(_parentctx, _parentState));
					((CSharpArgumentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_csharp_arguments);
					setState(2769);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2770);
					match(COMMA);
					setState(2771);
					((CSharpArgumentListItemContext)_localctx).item = csharp_expression(0);
					}
					} 
				}
				setState(2776);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,242,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Csharp_item_expressionContext extends ParserRuleContext {
		public Csharp_expressionContext exp;
		public TerminalNode LBRAK() { return getToken(EParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(EParser.RBRAK, 0); }
		public Csharp_expressionContext csharp_expression() {
			return getRuleContext(Csharp_expressionContext.class,0);
		}
		public Csharp_item_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csharp_item_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterCsharp_item_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitCsharp_item_expression(this);
		}
	}

	public final Csharp_item_expressionContext csharp_item_expression() throws RecognitionException {
		Csharp_item_expressionContext _localctx = new Csharp_item_expressionContext(_ctx, getState());
		enterRule(_localctx, 468, RULE_csharp_item_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2777);
			match(LBRAK);
			setState(2778);
			((Csharp_item_expressionContext)_localctx).exp = csharp_expression(0);
			setState(2779);
			match(RBRAK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Csharp_parenthesis_expressionContext extends ParserRuleContext {
		public Csharp_expressionContext exp;
		public TerminalNode LPAR() { return getToken(EParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EParser.RPAR, 0); }
		public Csharp_expressionContext csharp_expression() {
			return getRuleContext(Csharp_expressionContext.class,0);
		}
		public Csharp_parenthesis_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csharp_parenthesis_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterCsharp_parenthesis_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitCsharp_parenthesis_expression(this);
		}
	}

	public final Csharp_parenthesis_expressionContext csharp_parenthesis_expression() throws RecognitionException {
		Csharp_parenthesis_expressionContext _localctx = new Csharp_parenthesis_expressionContext(_ctx, getState());
		enterRule(_localctx, 470, RULE_csharp_parenthesis_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2781);
			match(LPAR);
			setState(2782);
			((Csharp_parenthesis_expressionContext)_localctx).exp = csharp_expression(0);
			setState(2783);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Csharp_identifier_expressionContext extends ParserRuleContext {
		public Csharp_identifier_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csharp_identifier_expression; }
	 
		public Csharp_identifier_expressionContext() { }
		public void copyFrom(Csharp_identifier_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CSharpIdentifierContext extends Csharp_identifier_expressionContext {
		public Csharp_identifierContext name;
		public Csharp_identifierContext csharp_identifier() {
			return getRuleContext(Csharp_identifierContext.class,0);
		}
		public CSharpIdentifierContext(Csharp_identifier_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterCSharpIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitCSharpIdentifier(this);
		}
	}
	public static class CSharpChildIdentifierContext extends Csharp_identifier_expressionContext {
		public Csharp_identifier_expressionContext parent;
		public Csharp_identifierContext name;
		public TerminalNode DOT() { return getToken(EParser.DOT, 0); }
		public Csharp_identifier_expressionContext csharp_identifier_expression() {
			return getRuleContext(Csharp_identifier_expressionContext.class,0);
		}
		public Csharp_identifierContext csharp_identifier() {
			return getRuleContext(Csharp_identifierContext.class,0);
		}
		public CSharpChildIdentifierContext(Csharp_identifier_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterCSharpChildIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitCSharpChildIdentifier(this);
		}
	}
	public static class CSharpPromptoIdentifierContext extends Csharp_identifier_expressionContext {
		public TerminalNode DOLLAR_IDENTIFIER() { return getToken(EParser.DOLLAR_IDENTIFIER, 0); }
		public CSharpPromptoIdentifierContext(Csharp_identifier_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterCSharpPromptoIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitCSharpPromptoIdentifier(this);
		}
	}

	public final Csharp_identifier_expressionContext csharp_identifier_expression() throws RecognitionException {
		return csharp_identifier_expression(0);
	}

	private Csharp_identifier_expressionContext csharp_identifier_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Csharp_identifier_expressionContext _localctx = new Csharp_identifier_expressionContext(_ctx, _parentState);
		Csharp_identifier_expressionContext _prevctx = _localctx;
		int _startState = 472;
		enterRecursionRule(_localctx, 472, RULE_csharp_identifier_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2788);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
			case 1:
				{
				_localctx = new CSharpPromptoIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2786);
				match(DOLLAR_IDENTIFIER);
				}
				break;
			case 2:
				{
				_localctx = new CSharpIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2787);
				((CSharpIdentifierContext)_localctx).name = csharp_identifier();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2795);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,244,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CSharpChildIdentifierContext(new Csharp_identifier_expressionContext(_parentctx, _parentState));
					((CSharpChildIdentifierContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_csharp_identifier_expression);
					setState(2790);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2791);
					match(DOT);
					setState(2792);
					((CSharpChildIdentifierContext)_localctx).name = csharp_identifier();
					}
					} 
				}
				setState(2797);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,244,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Csharp_literal_expressionContext extends ParserRuleContext {
		public Csharp_literal_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csharp_literal_expression; }
	 
		public Csharp_literal_expressionContext() { }
		public void copyFrom(Csharp_literal_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CSharpBooleanLiteralContext extends Csharp_literal_expressionContext {
		public TerminalNode BOOLEAN_LITERAL() { return getToken(EParser.BOOLEAN_LITERAL, 0); }
		public CSharpBooleanLiteralContext(Csharp_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterCSharpBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitCSharpBooleanLiteral(this);
		}
	}
	public static class CSharpIntegerLiteralContext extends Csharp_literal_expressionContext {
		public TerminalNode INTEGER_LITERAL() { return getToken(EParser.INTEGER_LITERAL, 0); }
		public CSharpIntegerLiteralContext(Csharp_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterCSharpIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitCSharpIntegerLiteral(this);
		}
	}
	public static class CSharpDecimalLiteralContext extends Csharp_literal_expressionContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(EParser.DECIMAL_LITERAL, 0); }
		public CSharpDecimalLiteralContext(Csharp_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterCSharpDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitCSharpDecimalLiteral(this);
		}
	}
	public static class CSharpCharacterLiteralContext extends Csharp_literal_expressionContext {
		public TerminalNode CHAR_LITERAL() { return getToken(EParser.CHAR_LITERAL, 0); }
		public CSharpCharacterLiteralContext(Csharp_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterCSharpCharacterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitCSharpCharacterLiteral(this);
		}
	}
	public static class CSharpTextLiteralContext extends Csharp_literal_expressionContext {
		public TerminalNode TEXT_LITERAL() { return getToken(EParser.TEXT_LITERAL, 0); }
		public CSharpTextLiteralContext(Csharp_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterCSharpTextLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitCSharpTextLiteral(this);
		}
	}

	public final Csharp_literal_expressionContext csharp_literal_expression() throws RecognitionException {
		Csharp_literal_expressionContext _localctx = new Csharp_literal_expressionContext(_ctx, getState());
		enterRule(_localctx, 474, RULE_csharp_literal_expression);
		try {
			setState(2803);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				_localctx = new CSharpIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2798);
				match(INTEGER_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				_localctx = new CSharpDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2799);
				match(DECIMAL_LITERAL);
				}
				break;
			case TEXT_LITERAL:
				_localctx = new CSharpTextLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2800);
				match(TEXT_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new CSharpBooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2801);
				match(BOOLEAN_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new CSharpCharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2802);
				match(CHAR_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Csharp_identifierContext extends ParserRuleContext {
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(EParser.VARIABLE_IDENTIFIER, 0); }
		public TerminalNode SYMBOL_IDENTIFIER() { return getToken(EParser.SYMBOL_IDENTIFIER, 0); }
		public TerminalNode DOLLAR_IDENTIFIER() { return getToken(EParser.DOLLAR_IDENTIFIER, 0); }
		public TerminalNode TYPE_IDENTIFIER() { return getToken(EParser.TYPE_IDENTIFIER, 0); }
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public Csharp_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csharp_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterCsharp_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitCsharp_identifier(this);
		}
	}

	public final Csharp_identifierContext csharp_identifier() throws RecognitionException {
		Csharp_identifierContext _localctx = new Csharp_identifierContext(_ctx, getState());
		enterRule(_localctx, 476, RULE_csharp_identifier);
		try {
			setState(2810);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2805);
				match(VARIABLE_IDENTIFIER);
				}
				break;
			case SYMBOL_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2806);
				match(SYMBOL_IDENTIFIER);
				}
				break;
			case DOLLAR_IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(2807);
				match(DOLLAR_IDENTIFIER);
				}
				break;
			case TYPE_IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(2808);
				match(TYPE_IDENTIFIER);
				}
				break;
			case JAVA:
			case CSHARP:
			case PYTHON2:
			case PYTHON3:
			case JAVASCRIPT:
			case SWIFT:
			case BOOLEAN:
			case CHARACTER:
			case TEXT:
			case INTEGER:
			case DECIMAL:
			case DATE:
			case TIME:
			case DATETIME:
			case PERIOD:
			case VERSION:
			case CODE:
			case DOCUMENT:
			case BLOB:
			case IMAGE:
			case UUID:
			case ITERATOR:
			case CURSOR:
			case HTML:
			case ABSTRACT:
			case ALL:
			case ALWAYS:
			case AND:
			case ANY:
			case AS:
			case ASC:
			case ATTR:
			case ATTRIBUTE:
			case ATTRIBUTES:
			case BINDINGS:
			case BREAK:
			case BY:
			case CASE:
			case CATCH:
			case CATEGORY:
			case CLASS:
			case CONTAINS:
			case DEF:
			case DEFAULT:
			case DEFINE:
			case DELETE:
			case DESC:
			case DO:
			case DOING:
			case EACH:
			case ELSE:
			case ENUM:
			case ENUMERATED:
			case EXCEPT:
			case EXECUTE:
			case EXPECTING:
			case EXTENDS:
			case FETCH:
			case FILTERED:
			case FINALLY:
			case FLUSH:
			case FOR:
			case FROM:
			case GETTER:
			case HAS:
			case IF:
			case IN:
			case INDEX:
			case IS:
			case MATCHING:
			case METHOD:
			case METHODS:
			case MODULO:
			case MUTABLE:
			case NATIVE:
			case NONE:
			case NOT:
			case NOTHING:
			case NULL:
			case ON:
			case ONE:
			case OPERATOR:
			case OR:
			case ORDER:
			case OTHERWISE:
			case PASS:
			case RAISE:
			case READ:
			case RECEIVING:
			case RESOURCE:
			case RETURN:
			case RETURNING:
			case ROWS:
			case SELF:
			case SETTER:
			case SINGLETON:
			case SORTED:
			case STORABLE:
			case STORE:
			case SUPER:
			case SWITCH:
			case TEST:
			case THIS:
			case THROW:
			case TO:
			case TRY:
			case VERIFYING:
			case WIDGET:
			case WITH:
			case WHEN:
			case WHERE:
			case WHILE:
			case WRITE:
				enterOuterAlt(_localctx, 5);
				{
				setState(2809);
				keyword();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Jsx_expressionContext extends ParserRuleContext {
		public Jsx_elementContext jsx_element() {
			return getRuleContext(Jsx_elementContext.class,0);
		}
		public Jsx_fragmentContext jsx_fragment() {
			return getRuleContext(Jsx_fragmentContext.class,0);
		}
		public Jsx_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsx_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJsx_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJsx_expression(this);
		}
	}

	public final Jsx_expressionContext jsx_expression() throws RecognitionException {
		Jsx_expressionContext _localctx = new Jsx_expressionContext(_ctx, getState());
		enterRule(_localctx, 478, RULE_jsx_expression);
		try {
			setState(2814);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2812);
				jsx_element();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2813);
				jsx_fragment();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Jsx_elementContext extends ParserRuleContext {
		public Jsx_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsx_element; }
	 
		public Jsx_elementContext() { }
		public void copyFrom(Jsx_elementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class JsxSelfClosingContext extends Jsx_elementContext {
		public Jsx_self_closingContext jsx;
		public Jsx_self_closingContext jsx_self_closing() {
			return getRuleContext(Jsx_self_closingContext.class,0);
		}
		public JsxSelfClosingContext(Jsx_elementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJsxSelfClosing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJsxSelfClosing(this);
		}
	}
	public static class JsxElementContext extends Jsx_elementContext {
		public Jsx_openingContext opening;
		public Jsx_childrenContext children_;
		public Jsx_closingContext closing;
		public Jsx_openingContext jsx_opening() {
			return getRuleContext(Jsx_openingContext.class,0);
		}
		public Jsx_closingContext jsx_closing() {
			return getRuleContext(Jsx_closingContext.class,0);
		}
		public Jsx_childrenContext jsx_children() {
			return getRuleContext(Jsx_childrenContext.class,0);
		}
		public JsxElementContext(Jsx_elementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJsxElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJsxElement(this);
		}
	}

	public final Jsx_elementContext jsx_element() throws RecognitionException {
		Jsx_elementContext _localctx = new Jsx_elementContext(_ctx, getState());
		enterRule(_localctx, 480, RULE_jsx_element);
		try {
			setState(2823);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
			case 1:
				_localctx = new JsxSelfClosingContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2816);
				((JsxSelfClosingContext)_localctx).jsx = jsx_self_closing();
				}
				break;
			case 2:
				_localctx = new JsxElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2817);
				((JsxElementContext)_localctx).opening = jsx_opening();
				setState(2819);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
				case 1:
					{
					setState(2818);
					((JsxElementContext)_localctx).children_ = jsx_children();
					}
					break;
				}
				setState(2821);
				((JsxElementContext)_localctx).closing = jsx_closing();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Jsx_fragmentContext extends ParserRuleContext {
		public Jsx_childrenContext children_;
		public Jsx_fragment_startContext jsx_fragment_start() {
			return getRuleContext(Jsx_fragment_startContext.class,0);
		}
		public List<Ws_plusContext> ws_plus() {
			return getRuleContexts(Ws_plusContext.class);
		}
		public Ws_plusContext ws_plus(int i) {
			return getRuleContext(Ws_plusContext.class,i);
		}
		public Jsx_fragment_endContext jsx_fragment_end() {
			return getRuleContext(Jsx_fragment_endContext.class,0);
		}
		public Jsx_childrenContext jsx_children() {
			return getRuleContext(Jsx_childrenContext.class,0);
		}
		public Jsx_fragmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsx_fragment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJsx_fragment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJsx_fragment(this);
		}
	}

	public final Jsx_fragmentContext jsx_fragment() throws RecognitionException {
		Jsx_fragmentContext _localctx = new Jsx_fragmentContext(_ctx, getState());
		enterRule(_localctx, 482, RULE_jsx_fragment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2825);
			jsx_fragment_start();
			setState(2826);
			ws_plus();
			setState(2828);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
			case 1:
				{
				setState(2827);
				((Jsx_fragmentContext)_localctx).children_ = jsx_children();
				}
				break;
			}
			setState(2830);
			ws_plus();
			setState(2831);
			jsx_fragment_end();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Jsx_fragment_startContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(EParser.LT, 0); }
		public TerminalNode GT() { return getToken(EParser.GT, 0); }
		public TerminalNode LTGT() { return getToken(EParser.LTGT, 0); }
		public Jsx_fragment_startContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsx_fragment_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJsx_fragment_start(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJsx_fragment_start(this);
		}
	}

	public final Jsx_fragment_startContext jsx_fragment_start() throws RecognitionException {
		Jsx_fragment_startContext _localctx = new Jsx_fragment_startContext(_ctx, getState());
		enterRule(_localctx, 484, RULE_jsx_fragment_start);
		try {
			setState(2836);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2833);
				match(LT);
				setState(2834);
				match(GT);
				}
				break;
			case LTGT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2835);
				match(LTGT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Jsx_fragment_endContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(EParser.LT, 0); }
		public TerminalNode SLASH() { return getToken(EParser.SLASH, 0); }
		public TerminalNode GT() { return getToken(EParser.GT, 0); }
		public Jsx_fragment_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsx_fragment_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJsx_fragment_end(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJsx_fragment_end(this);
		}
	}

	public final Jsx_fragment_endContext jsx_fragment_end() throws RecognitionException {
		Jsx_fragment_endContext _localctx = new Jsx_fragment_endContext(_ctx, getState());
		enterRule(_localctx, 486, RULE_jsx_fragment_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2838);
			match(LT);
			setState(2839);
			match(SLASH);
			setState(2840);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Jsx_self_closingContext extends ParserRuleContext {
		public Jsx_element_nameContext name;
		public Jsx_attributeContext attributes;
		public TerminalNode LT() { return getToken(EParser.LT, 0); }
		public Ws_plusContext ws_plus() {
			return getRuleContext(Ws_plusContext.class,0);
		}
		public TerminalNode SLASH() { return getToken(EParser.SLASH, 0); }
		public TerminalNode GT() { return getToken(EParser.GT, 0); }
		public Jsx_element_nameContext jsx_element_name() {
			return getRuleContext(Jsx_element_nameContext.class,0);
		}
		public List<Jsx_attributeContext> jsx_attribute() {
			return getRuleContexts(Jsx_attributeContext.class);
		}
		public Jsx_attributeContext jsx_attribute(int i) {
			return getRuleContext(Jsx_attributeContext.class,i);
		}
		public Jsx_self_closingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsx_self_closing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJsx_self_closing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJsx_self_closing(this);
		}
	}

	public final Jsx_self_closingContext jsx_self_closing() throws RecognitionException {
		Jsx_self_closingContext _localctx = new Jsx_self_closingContext(_ctx, getState());
		enterRule(_localctx, 488, RULE_jsx_self_closing);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2842);
			match(LT);
			setState(2843);
			((Jsx_self_closingContext)_localctx).name = jsx_element_name();
			setState(2844);
			ws_plus();
			setState(2848);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA) | (1L << CSHARP) | (1L << PYTHON2) | (1L << PYTHON3) | (1L << JAVASCRIPT) | (1L << SWIFT) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (CODE - 65)) | (1L << (DOCUMENT - 65)) | (1L << (BLOB - 65)) | (1L << (IMAGE - 65)) | (1L << (UUID - 65)) | (1L << (ITERATOR - 65)) | (1L << (CURSOR - 65)) | (1L << (HTML - 65)) | (1L << (ABSTRACT - 65)) | (1L << (ALL - 65)) | (1L << (ALWAYS - 65)) | (1L << (AND - 65)) | (1L << (ANY - 65)) | (1L << (AS - 65)) | (1L << (ASC - 65)) | (1L << (ATTR - 65)) | (1L << (ATTRIBUTE - 65)) | (1L << (ATTRIBUTES - 65)) | (1L << (BINDINGS - 65)) | (1L << (BREAK - 65)) | (1L << (BY - 65)) | (1L << (CASE - 65)) | (1L << (CATCH - 65)) | (1L << (CATEGORY - 65)) | (1L << (CLASS - 65)) | (1L << (CONTAINS - 65)) | (1L << (DEF - 65)) | (1L << (DEFAULT - 65)) | (1L << (DEFINE - 65)) | (1L << (DELETE - 65)) | (1L << (DESC - 65)) | (1L << (DO - 65)) | (1L << (DOING - 65)) | (1L << (EACH - 65)) | (1L << (ELSE - 65)) | (1L << (ENUM - 65)) | (1L << (ENUMERATED - 65)) | (1L << (EXCEPT - 65)) | (1L << (EXECUTE - 65)) | (1L << (EXPECTING - 65)) | (1L << (EXTENDS - 65)) | (1L << (FETCH - 65)) | (1L << (FILTERED - 65)) | (1L << (FINALLY - 65)) | (1L << (FLUSH - 65)) | (1L << (FOR - 65)) | (1L << (FROM - 65)) | (1L << (GETTER - 65)) | (1L << (HAS - 65)) | (1L << (IF - 65)) | (1L << (IN - 65)) | (1L << (INDEX - 65)) | (1L << (IS - 65)) | (1L << (MATCHING - 65)) | (1L << (METHOD - 65)) | (1L << (METHODS - 65)) | (1L << (MODULO - 65)) | (1L << (MUTABLE - 65)) | (1L << (NATIVE - 65)) | (1L << (NONE - 65)) | (1L << (NOT - 65)) | (1L << (NOTHING - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (NULL - 129)) | (1L << (ON - 129)) | (1L << (ONE - 129)) | (1L << (OPERATOR - 129)) | (1L << (OR - 129)) | (1L << (ORDER - 129)) | (1L << (OTHERWISE - 129)) | (1L << (PASS - 129)) | (1L << (RAISE - 129)) | (1L << (READ - 129)) | (1L << (RECEIVING - 129)) | (1L << (RESOURCE - 129)) | (1L << (RETURN - 129)) | (1L << (RETURNING - 129)) | (1L << (ROWS - 129)) | (1L << (SELF - 129)) | (1L << (SETTER - 129)) | (1L << (SINGLETON - 129)) | (1L << (SORTED - 129)) | (1L << (STORABLE - 129)) | (1L << (STORE - 129)) | (1L << (SUPER - 129)) | (1L << (SWITCH - 129)) | (1L << (TEST - 129)) | (1L << (THIS - 129)) | (1L << (THROW - 129)) | (1L << (TO - 129)) | (1L << (TRY - 129)) | (1L << (VERIFYING - 129)) | (1L << (WIDGET - 129)) | (1L << (WITH - 129)) | (1L << (WHEN - 129)) | (1L << (WHERE - 129)) | (1L << (WHILE - 129)) | (1L << (WRITE - 129)) | (1L << (SYMBOL_IDENTIFIER - 129)) | (1L << (TYPE_IDENTIFIER - 129)) | (1L << (VARIABLE_IDENTIFIER - 129)))) != 0)) {
				{
				{
				setState(2845);
				((Jsx_self_closingContext)_localctx).attributes = jsx_attribute();
				}
				}
				setState(2850);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2851);
			match(SLASH);
			setState(2852);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Jsx_openingContext extends ParserRuleContext {
		public Jsx_element_nameContext name;
		public Jsx_attributeContext attributes;
		public TerminalNode LT() { return getToken(EParser.LT, 0); }
		public Ws_plusContext ws_plus() {
			return getRuleContext(Ws_plusContext.class,0);
		}
		public TerminalNode GT() { return getToken(EParser.GT, 0); }
		public Jsx_element_nameContext jsx_element_name() {
			return getRuleContext(Jsx_element_nameContext.class,0);
		}
		public List<Jsx_attributeContext> jsx_attribute() {
			return getRuleContexts(Jsx_attributeContext.class);
		}
		public Jsx_attributeContext jsx_attribute(int i) {
			return getRuleContext(Jsx_attributeContext.class,i);
		}
		public Jsx_openingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsx_opening; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJsx_opening(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJsx_opening(this);
		}
	}

	public final Jsx_openingContext jsx_opening() throws RecognitionException {
		Jsx_openingContext _localctx = new Jsx_openingContext(_ctx, getState());
		enterRule(_localctx, 490, RULE_jsx_opening);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2854);
			match(LT);
			setState(2855);
			((Jsx_openingContext)_localctx).name = jsx_element_name();
			setState(2856);
			ws_plus();
			setState(2860);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA) | (1L << CSHARP) | (1L << PYTHON2) | (1L << PYTHON3) | (1L << JAVASCRIPT) | (1L << SWIFT) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (CODE - 65)) | (1L << (DOCUMENT - 65)) | (1L << (BLOB - 65)) | (1L << (IMAGE - 65)) | (1L << (UUID - 65)) | (1L << (ITERATOR - 65)) | (1L << (CURSOR - 65)) | (1L << (HTML - 65)) | (1L << (ABSTRACT - 65)) | (1L << (ALL - 65)) | (1L << (ALWAYS - 65)) | (1L << (AND - 65)) | (1L << (ANY - 65)) | (1L << (AS - 65)) | (1L << (ASC - 65)) | (1L << (ATTR - 65)) | (1L << (ATTRIBUTE - 65)) | (1L << (ATTRIBUTES - 65)) | (1L << (BINDINGS - 65)) | (1L << (BREAK - 65)) | (1L << (BY - 65)) | (1L << (CASE - 65)) | (1L << (CATCH - 65)) | (1L << (CATEGORY - 65)) | (1L << (CLASS - 65)) | (1L << (CONTAINS - 65)) | (1L << (DEF - 65)) | (1L << (DEFAULT - 65)) | (1L << (DEFINE - 65)) | (1L << (DELETE - 65)) | (1L << (DESC - 65)) | (1L << (DO - 65)) | (1L << (DOING - 65)) | (1L << (EACH - 65)) | (1L << (ELSE - 65)) | (1L << (ENUM - 65)) | (1L << (ENUMERATED - 65)) | (1L << (EXCEPT - 65)) | (1L << (EXECUTE - 65)) | (1L << (EXPECTING - 65)) | (1L << (EXTENDS - 65)) | (1L << (FETCH - 65)) | (1L << (FILTERED - 65)) | (1L << (FINALLY - 65)) | (1L << (FLUSH - 65)) | (1L << (FOR - 65)) | (1L << (FROM - 65)) | (1L << (GETTER - 65)) | (1L << (HAS - 65)) | (1L << (IF - 65)) | (1L << (IN - 65)) | (1L << (INDEX - 65)) | (1L << (IS - 65)) | (1L << (MATCHING - 65)) | (1L << (METHOD - 65)) | (1L << (METHODS - 65)) | (1L << (MODULO - 65)) | (1L << (MUTABLE - 65)) | (1L << (NATIVE - 65)) | (1L << (NONE - 65)) | (1L << (NOT - 65)) | (1L << (NOTHING - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (NULL - 129)) | (1L << (ON - 129)) | (1L << (ONE - 129)) | (1L << (OPERATOR - 129)) | (1L << (OR - 129)) | (1L << (ORDER - 129)) | (1L << (OTHERWISE - 129)) | (1L << (PASS - 129)) | (1L << (RAISE - 129)) | (1L << (READ - 129)) | (1L << (RECEIVING - 129)) | (1L << (RESOURCE - 129)) | (1L << (RETURN - 129)) | (1L << (RETURNING - 129)) | (1L << (ROWS - 129)) | (1L << (SELF - 129)) | (1L << (SETTER - 129)) | (1L << (SINGLETON - 129)) | (1L << (SORTED - 129)) | (1L << (STORABLE - 129)) | (1L << (STORE - 129)) | (1L << (SUPER - 129)) | (1L << (SWITCH - 129)) | (1L << (TEST - 129)) | (1L << (THIS - 129)) | (1L << (THROW - 129)) | (1L << (TO - 129)) | (1L << (TRY - 129)) | (1L << (VERIFYING - 129)) | (1L << (WIDGET - 129)) | (1L << (WITH - 129)) | (1L << (WHEN - 129)) | (1L << (WHERE - 129)) | (1L << (WHILE - 129)) | (1L << (WRITE - 129)) | (1L << (SYMBOL_IDENTIFIER - 129)) | (1L << (TYPE_IDENTIFIER - 129)) | (1L << (VARIABLE_IDENTIFIER - 129)))) != 0)) {
				{
				{
				setState(2857);
				((Jsx_openingContext)_localctx).attributes = jsx_attribute();
				}
				}
				setState(2862);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2863);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Jsx_closingContext extends ParserRuleContext {
		public Jsx_element_nameContext name;
		public TerminalNode LT() { return getToken(EParser.LT, 0); }
		public TerminalNode SLASH() { return getToken(EParser.SLASH, 0); }
		public TerminalNode GT() { return getToken(EParser.GT, 0); }
		public Jsx_element_nameContext jsx_element_name() {
			return getRuleContext(Jsx_element_nameContext.class,0);
		}
		public Jsx_closingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsx_closing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJsx_closing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJsx_closing(this);
		}
	}

	public final Jsx_closingContext jsx_closing() throws RecognitionException {
		Jsx_closingContext _localctx = new Jsx_closingContext(_ctx, getState());
		enterRule(_localctx, 492, RULE_jsx_closing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2865);
			match(LT);
			setState(2866);
			match(SLASH);
			setState(2867);
			((Jsx_closingContext)_localctx).name = jsx_element_name();
			setState(2868);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Jsx_element_nameContext extends ParserRuleContext {
		public List<Jsx_identifierContext> jsx_identifier() {
			return getRuleContexts(Jsx_identifierContext.class);
		}
		public Jsx_identifierContext jsx_identifier(int i) {
			return getRuleContext(Jsx_identifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(EParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(EParser.DOT, i);
		}
		public Jsx_element_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsx_element_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJsx_element_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJsx_element_name(this);
		}
	}

	public final Jsx_element_nameContext jsx_element_name() throws RecognitionException {
		Jsx_element_nameContext _localctx = new Jsx_element_nameContext(_ctx, getState());
		enterRule(_localctx, 494, RULE_jsx_element_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2870);
			jsx_identifier();
			setState(2875);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(2871);
				match(DOT);
				setState(2872);
				jsx_identifier();
				}
				}
				setState(2877);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Jsx_identifierContext extends ParserRuleContext {
		public Identifier_or_keywordContext identifier_or_keyword() {
			return getRuleContext(Identifier_or_keywordContext.class,0);
		}
		public List<Nospace_hyphen_identifier_or_keywordContext> nospace_hyphen_identifier_or_keyword() {
			return getRuleContexts(Nospace_hyphen_identifier_or_keywordContext.class);
		}
		public Nospace_hyphen_identifier_or_keywordContext nospace_hyphen_identifier_or_keyword(int i) {
			return getRuleContext(Nospace_hyphen_identifier_or_keywordContext.class,i);
		}
		public Jsx_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsx_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJsx_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJsx_identifier(this);
		}
	}

	public final Jsx_identifierContext jsx_identifier() throws RecognitionException {
		Jsx_identifierContext _localctx = new Jsx_identifierContext(_ctx, getState());
		enterRule(_localctx, 496, RULE_jsx_identifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2878);
			identifier_or_keyword();
			setState(2882);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,255,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2879);
					nospace_hyphen_identifier_or_keyword();
					}
					} 
				}
				setState(2884);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,255,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Jsx_attributeContext extends ParserRuleContext {
		public Jsx_identifierContext name;
		public Jsx_attribute_valueContext value;
		public Ws_plusContext ws_plus() {
			return getRuleContext(Ws_plusContext.class,0);
		}
		public Jsx_identifierContext jsx_identifier() {
			return getRuleContext(Jsx_identifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(EParser.EQ, 0); }
		public Jsx_attribute_valueContext jsx_attribute_value() {
			return getRuleContext(Jsx_attribute_valueContext.class,0);
		}
		public Jsx_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsx_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJsx_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJsx_attribute(this);
		}
	}

	public final Jsx_attributeContext jsx_attribute() throws RecognitionException {
		Jsx_attributeContext _localctx = new Jsx_attributeContext(_ctx, getState());
		enterRule(_localctx, 498, RULE_jsx_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2885);
			((Jsx_attributeContext)_localctx).name = jsx_identifier();
			setState(2888);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(2886);
				match(EQ);
				setState(2887);
				((Jsx_attributeContext)_localctx).value = jsx_attribute_value();
				}
			}

			setState(2890);
			ws_plus();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Jsx_attribute_valueContext extends ParserRuleContext {
		public Jsx_attribute_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsx_attribute_value; }
	 
		public Jsx_attribute_valueContext() { }
		public void copyFrom(Jsx_attribute_valueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class JsxValueContext extends Jsx_attribute_valueContext {
		public ExpressionContext exp;
		public TerminalNode LCURL() { return getToken(EParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(EParser.RCURL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public JsxValueContext(Jsx_attribute_valueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJsxValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJsxValue(this);
		}
	}
	public static class JsxLiteralContext extends Jsx_attribute_valueContext {
		public TerminalNode TEXT_LITERAL() { return getToken(EParser.TEXT_LITERAL, 0); }
		public JsxLiteralContext(Jsx_attribute_valueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJsxLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJsxLiteral(this);
		}
	}

	public final Jsx_attribute_valueContext jsx_attribute_value() throws RecognitionException {
		Jsx_attribute_valueContext _localctx = new Jsx_attribute_valueContext(_ctx, getState());
		enterRule(_localctx, 500, RULE_jsx_attribute_value);
		try {
			setState(2897);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT_LITERAL:
				_localctx = new JsxLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2892);
				match(TEXT_LITERAL);
				}
				break;
			case LCURL:
				_localctx = new JsxValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2893);
				match(LCURL);
				setState(2894);
				((JsxValueContext)_localctx).exp = expression(0);
				setState(2895);
				match(RCURL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Jsx_childrenContext extends ParserRuleContext {
		public List<Jsx_childContext> jsx_child() {
			return getRuleContexts(Jsx_childContext.class);
		}
		public Jsx_childContext jsx_child(int i) {
			return getRuleContext(Jsx_childContext.class,i);
		}
		public Jsx_childrenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsx_children; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJsx_children(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJsx_children(this);
		}
	}

	public final Jsx_childrenContext jsx_children() throws RecognitionException {
		Jsx_childrenContext _localctx = new Jsx_childrenContext(_ctx, getState());
		enterRule(_localctx, 502, RULE_jsx_children);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2900); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2899);
					jsx_child();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2902); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,258,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Jsx_childContext extends ParserRuleContext {
		public Jsx_childContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsx_child; }
	 
		public Jsx_childContext() { }
		public void copyFrom(Jsx_childContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class JsxTextContext extends Jsx_childContext {
		public Jsx_textContext text;
		public Jsx_textContext jsx_text() {
			return getRuleContext(Jsx_textContext.class,0);
		}
		public JsxTextContext(Jsx_childContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJsxText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJsxText(this);
		}
	}
	public static class JsxChildContext extends Jsx_childContext {
		public Jsx_elementContext jsx;
		public Jsx_elementContext jsx_element() {
			return getRuleContext(Jsx_elementContext.class,0);
		}
		public JsxChildContext(Jsx_childContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJsxChild(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJsxChild(this);
		}
	}
	public static class JsxCodeContext extends Jsx_childContext {
		public ExpressionContext exp;
		public TerminalNode LCURL() { return getToken(EParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(EParser.RCURL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public JsxCodeContext(Jsx_childContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJsxCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJsxCode(this);
		}
	}

	public final Jsx_childContext jsx_child() throws RecognitionException {
		Jsx_childContext _localctx = new Jsx_childContext(_ctx, getState());
		enterRule(_localctx, 504, RULE_jsx_child);
		int _la;
		try {
			setState(2911);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INDENT:
			case DEDENT:
			case LF_TAB:
			case LF_MORE:
			case LF:
			case TAB:
			case WS:
			case COMMENT:
			case JAVA:
			case CSHARP:
			case PYTHON2:
			case PYTHON3:
			case JAVASCRIPT:
			case SWIFT:
			case COLON:
			case SEMI:
			case COMMA:
			case RANGE:
			case DOT:
			case LPAR:
			case RPAR:
			case LBRAK:
			case RBRAK:
			case QMARK:
			case XMARK:
			case AMP:
			case AMP2:
			case PIPE:
			case PIPE2:
			case PLUS:
			case MINUS:
			case STAR:
			case SLASH:
			case BSLASH:
			case PERCENT:
			case SHARP:
			case GTE:
			case LTE:
			case LTGT:
			case LTCOLONGT:
			case EQ:
			case XEQ:
			case EQ2:
			case TEQ:
			case TILDE:
			case LARROW:
			case RARROW:
			case EGT:
			case BOOLEAN:
			case CSS:
			case CHARACTER:
			case TEXT:
			case INTEGER:
			case DECIMAL:
			case DATE:
			case TIME:
			case DATETIME:
			case PERIOD:
			case VERSION:
			case METHOD_COLON:
			case CODE:
			case DOCUMENT:
			case BLOB:
			case IMAGE:
			case UUID:
			case ITERATOR:
			case CURSOR:
			case HTML:
			case TYPE:
			case ABSTRACT:
			case ALL:
			case ALWAYS:
			case AND:
			case ANY:
			case AS:
			case ASC:
			case ATTR:
			case ATTRIBUTE:
			case ATTRIBUTES:
			case BINDINGS:
			case BREAK:
			case BY:
			case CASE:
			case CATCH:
			case CATEGORY:
			case CLASS:
			case CONTAINS:
			case DEF:
			case DEFAULT:
			case DEFINE:
			case DELETE:
			case DESC:
			case DO:
			case DOING:
			case EACH:
			case ELSE:
			case ENUM:
			case ENUMERATED:
			case EXCEPT:
			case EXECUTE:
			case EXPECTING:
			case EXTENDS:
			case FETCH:
			case FILTERED:
			case FINALLY:
			case FLUSH:
			case FOR:
			case FROM:
			case GETTER:
			case HAS:
			case IF:
			case IN:
			case INDEX:
			case INVOKE_COLON:
			case IS:
			case MATCHING:
			case METHOD:
			case METHODS:
			case MODULO:
			case MUTABLE:
			case NATIVE:
			case NONE:
			case NOT:
			case NOTHING:
			case NULL:
			case ON:
			case ONE:
			case OPERATOR:
			case OR:
			case ORDER:
			case OTHERWISE:
			case PASS:
			case RAISE:
			case READ:
			case RECEIVING:
			case RESOURCE:
			case RETURN:
			case RETURNING:
			case ROWS:
			case SELF:
			case SETTER:
			case SINGLETON:
			case SORTED:
			case STORABLE:
			case STORE:
			case SUPER:
			case SWITCH:
			case TEST:
			case THEN:
			case THIS:
			case THROW:
			case TO:
			case TRY:
			case VERIFYING:
			case WIDGET:
			case WITH:
			case WHEN:
			case WHERE:
			case WHILE:
			case WRITE:
			case BOOLEAN_LITERAL:
			case CHAR_LITERAL:
			case MIN_INTEGER:
			case MAX_INTEGER:
			case SYMBOL_IDENTIFIER:
			case TYPE_IDENTIFIER:
			case VARIABLE_IDENTIFIER:
			case NATIVE_IDENTIFIER:
			case DOLLAR_IDENTIFIER:
			case ARONDBASE_IDENTIFIER:
			case TEXT_LITERAL:
			case UUID_LITERAL:
			case INTEGER_LITERAL:
			case HEXA_LITERAL:
			case DECIMAL_LITERAL:
			case DATETIME_LITERAL:
			case TIME_LITERAL:
			case DATE_LITERAL:
			case PERIOD_LITERAL:
			case VERSION_LITERAL:
			case JSX_TEXT:
				_localctx = new JsxTextContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2904);
				((JsxTextContext)_localctx).text = jsx_text();
				}
				break;
			case LT:
				_localctx = new JsxChildContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2905);
				((JsxChildContext)_localctx).jsx = jsx_element();
				}
				break;
			case LCURL:
				_localctx = new JsxCodeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2906);
				match(LCURL);
				setState(2908);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << LTCOLONGT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (METHOD_COLON - 64)) | (1L << (CODE - 64)) | (1L << (DOCUMENT - 64)) | (1L << (BLOB - 64)) | (1L << (TYPE - 64)) | (1L << (EXECUTE - 64)) | (1L << (FETCH - 64)) | (1L << (INVOKE_COLON - 64)) | (1L << (MUTABLE - 64)) | (1L << (NOT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (NOTHING - 128)) | (1L << (READ - 128)) | (1L << (SELF - 128)) | (1L << (SORTED - 128)) | (1L << (SUPER - 128)) | (1L << (THIS - 128)) | (1L << (BOOLEAN_LITERAL - 128)) | (1L << (CHAR_LITERAL - 128)) | (1L << (MIN_INTEGER - 128)) | (1L << (MAX_INTEGER - 128)) | (1L << (SYMBOL_IDENTIFIER - 128)) | (1L << (TYPE_IDENTIFIER - 128)) | (1L << (VARIABLE_IDENTIFIER - 128)) | (1L << (TEXT_LITERAL - 128)) | (1L << (UUID_LITERAL - 128)) | (1L << (INTEGER_LITERAL - 128)) | (1L << (HEXA_LITERAL - 128)) | (1L << (DECIMAL_LITERAL - 128)) | (1L << (DATETIME_LITERAL - 128)) | (1L << (TIME_LITERAL - 128)) | (1L << (DATE_LITERAL - 128)) | (1L << (PERIOD_LITERAL - 128)) | (1L << (VERSION_LITERAL - 128)))) != 0)) {
					{
					setState(2907);
					((JsxCodeContext)_localctx).exp = expression(0);
					}
				}

				setState(2910);
				match(RCURL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Jsx_textContext extends ParserRuleContext {
		public List<Jsx_charContext> jsx_char() {
			return getRuleContexts(Jsx_charContext.class);
		}
		public Jsx_charContext jsx_char(int i) {
			return getRuleContext(Jsx_charContext.class,i);
		}
		public Jsx_textContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsx_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJsx_text(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJsx_text(this);
		}
	}

	public final Jsx_textContext jsx_text() throws RecognitionException {
		Jsx_textContext _localctx = new Jsx_textContext(_ctx, getState());
		enterRule(_localctx, 506, RULE_jsx_text);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2914); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2913);
					jsx_char();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2916); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,261,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Jsx_charContext extends ParserRuleContext {
		public TerminalNode LCURL() { return getToken(EParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(EParser.RCURL, 0); }
		public TerminalNode LT() { return getToken(EParser.LT, 0); }
		public TerminalNode GT() { return getToken(EParser.GT, 0); }
		public TerminalNode JSX_TEXT() { return getToken(EParser.JSX_TEXT, 0); }
		public Jsx_charContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsx_char; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJsx_char(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJsx_char(this);
		}
	}

	public final Jsx_charContext jsx_char() throws RecognitionException {
		Jsx_charContext _localctx = new Jsx_charContext(_ctx, getState());
		enterRule(_localctx, 508, RULE_jsx_char);
		int _la;
		try {
			setState(2920);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2918);
				_la = _input.LA(1);
				if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LCURL) | (1L << RCURL) | (1L << GT) | (1L << LT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2919);
				match(JSX_TEXT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Css_expressionContext extends ParserRuleContext {
		public Css_fieldContext field;
		public TerminalNode LCURL() { return getToken(EParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(EParser.RCURL, 0); }
		public List<Css_fieldContext> css_field() {
			return getRuleContexts(Css_fieldContext.class);
		}
		public Css_fieldContext css_field(int i) {
			return getRuleContext(Css_fieldContext.class,i);
		}
		public Css_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_css_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterCss_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitCss_expression(this);
		}
	}

	public final Css_expressionContext css_expression() throws RecognitionException {
		Css_expressionContext _localctx = new Css_expressionContext(_ctx, getState());
		enterRule(_localctx, 510, RULE_css_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2922);
			match(LCURL);
			setState(2924); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2923);
				((Css_expressionContext)_localctx).field = css_field();
				}
				}
				setState(2926); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA) | (1L << CSHARP) | (1L << PYTHON2) | (1L << PYTHON3) | (1L << JAVASCRIPT) | (1L << SWIFT) | (1L << MINUS) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (CODE - 65)) | (1L << (DOCUMENT - 65)) | (1L << (BLOB - 65)) | (1L << (IMAGE - 65)) | (1L << (UUID - 65)) | (1L << (ITERATOR - 65)) | (1L << (CURSOR - 65)) | (1L << (HTML - 65)) | (1L << (ABSTRACT - 65)) | (1L << (ALL - 65)) | (1L << (ALWAYS - 65)) | (1L << (AND - 65)) | (1L << (ANY - 65)) | (1L << (AS - 65)) | (1L << (ASC - 65)) | (1L << (ATTR - 65)) | (1L << (ATTRIBUTE - 65)) | (1L << (ATTRIBUTES - 65)) | (1L << (BINDINGS - 65)) | (1L << (BREAK - 65)) | (1L << (BY - 65)) | (1L << (CASE - 65)) | (1L << (CATCH - 65)) | (1L << (CATEGORY - 65)) | (1L << (CLASS - 65)) | (1L << (CONTAINS - 65)) | (1L << (DEF - 65)) | (1L << (DEFAULT - 65)) | (1L << (DEFINE - 65)) | (1L << (DELETE - 65)) | (1L << (DESC - 65)) | (1L << (DO - 65)) | (1L << (DOING - 65)) | (1L << (EACH - 65)) | (1L << (ELSE - 65)) | (1L << (ENUM - 65)) | (1L << (ENUMERATED - 65)) | (1L << (EXCEPT - 65)) | (1L << (EXECUTE - 65)) | (1L << (EXPECTING - 65)) | (1L << (EXTENDS - 65)) | (1L << (FETCH - 65)) | (1L << (FILTERED - 65)) | (1L << (FINALLY - 65)) | (1L << (FLUSH - 65)) | (1L << (FOR - 65)) | (1L << (FROM - 65)) | (1L << (GETTER - 65)) | (1L << (HAS - 65)) | (1L << (IF - 65)) | (1L << (IN - 65)) | (1L << (INDEX - 65)) | (1L << (IS - 65)) | (1L << (MATCHING - 65)) | (1L << (METHOD - 65)) | (1L << (METHODS - 65)) | (1L << (MODULO - 65)) | (1L << (MUTABLE - 65)) | (1L << (NATIVE - 65)) | (1L << (NONE - 65)) | (1L << (NOT - 65)) | (1L << (NOTHING - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (NULL - 129)) | (1L << (ON - 129)) | (1L << (ONE - 129)) | (1L << (OPERATOR - 129)) | (1L << (OR - 129)) | (1L << (ORDER - 129)) | (1L << (OTHERWISE - 129)) | (1L << (PASS - 129)) | (1L << (RAISE - 129)) | (1L << (READ - 129)) | (1L << (RECEIVING - 129)) | (1L << (RESOURCE - 129)) | (1L << (RETURN - 129)) | (1L << (RETURNING - 129)) | (1L << (ROWS - 129)) | (1L << (SELF - 129)) | (1L << (SETTER - 129)) | (1L << (SINGLETON - 129)) | (1L << (SORTED - 129)) | (1L << (STORABLE - 129)) | (1L << (STORE - 129)) | (1L << (SUPER - 129)) | (1L << (SWITCH - 129)) | (1L << (TEST - 129)) | (1L << (THIS - 129)) | (1L << (THROW - 129)) | (1L << (TO - 129)) | (1L << (TRY - 129)) | (1L << (VERIFYING - 129)) | (1L << (WIDGET - 129)) | (1L << (WITH - 129)) | (1L << (WHEN - 129)) | (1L << (WHERE - 129)) | (1L << (WHILE - 129)) | (1L << (WRITE - 129)) | (1L << (SYMBOL_IDENTIFIER - 129)) | (1L << (TYPE_IDENTIFIER - 129)) | (1L << (VARIABLE_IDENTIFIER - 129)))) != 0) );
			setState(2928);
			match(RCURL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Css_fieldContext extends ParserRuleContext {
		public Css_identifierContext name;
		public Css_valueContext value;
		public TerminalNode COLON() { return getToken(EParser.COLON, 0); }
		public TerminalNode SEMI() { return getToken(EParser.SEMI, 0); }
		public Css_identifierContext css_identifier() {
			return getRuleContext(Css_identifierContext.class,0);
		}
		public Css_valueContext css_value() {
			return getRuleContext(Css_valueContext.class,0);
		}
		public Css_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_css_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterCss_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitCss_field(this);
		}
	}

	public final Css_fieldContext css_field() throws RecognitionException {
		Css_fieldContext _localctx = new Css_fieldContext(_ctx, getState());
		enterRule(_localctx, 512, RULE_css_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2930);
			((Css_fieldContext)_localctx).name = css_identifier(0);
			setState(2931);
			match(COLON);
			setState(2932);
			((Css_fieldContext)_localctx).value = css_value();
			setState(2933);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Css_identifierContext extends ParserRuleContext {
		public Identifier_or_keywordContext identifier_or_keyword() {
			return getRuleContext(Identifier_or_keywordContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(EParser.MINUS, 0); }
		public Nospace_identifier_or_keywordContext nospace_identifier_or_keyword() {
			return getRuleContext(Nospace_identifier_or_keywordContext.class,0);
		}
		public Css_identifierContext css_identifier() {
			return getRuleContext(Css_identifierContext.class,0);
		}
		public List<Nospace_hyphen_identifier_or_keywordContext> nospace_hyphen_identifier_or_keyword() {
			return getRuleContexts(Nospace_hyphen_identifier_or_keywordContext.class);
		}
		public Nospace_hyphen_identifier_or_keywordContext nospace_hyphen_identifier_or_keyword(int i) {
			return getRuleContext(Nospace_hyphen_identifier_or_keywordContext.class,i);
		}
		public Css_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_css_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterCss_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitCss_identifier(this);
		}
	}

	public final Css_identifierContext css_identifier() throws RecognitionException {
		return css_identifier(0);
	}

	private Css_identifierContext css_identifier(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Css_identifierContext _localctx = new Css_identifierContext(_ctx, _parentState);
		Css_identifierContext _prevctx = _localctx;
		int _startState = 514;
		enterRecursionRule(_localctx, 514, RULE_css_identifier, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2939);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JAVA:
			case CSHARP:
			case PYTHON2:
			case PYTHON3:
			case JAVASCRIPT:
			case SWIFT:
			case BOOLEAN:
			case CHARACTER:
			case TEXT:
			case INTEGER:
			case DECIMAL:
			case DATE:
			case TIME:
			case DATETIME:
			case PERIOD:
			case VERSION:
			case CODE:
			case DOCUMENT:
			case BLOB:
			case IMAGE:
			case UUID:
			case ITERATOR:
			case CURSOR:
			case HTML:
			case ABSTRACT:
			case ALL:
			case ALWAYS:
			case AND:
			case ANY:
			case AS:
			case ASC:
			case ATTR:
			case ATTRIBUTE:
			case ATTRIBUTES:
			case BINDINGS:
			case BREAK:
			case BY:
			case CASE:
			case CATCH:
			case CATEGORY:
			case CLASS:
			case CONTAINS:
			case DEF:
			case DEFAULT:
			case DEFINE:
			case DELETE:
			case DESC:
			case DO:
			case DOING:
			case EACH:
			case ELSE:
			case ENUM:
			case ENUMERATED:
			case EXCEPT:
			case EXECUTE:
			case EXPECTING:
			case EXTENDS:
			case FETCH:
			case FILTERED:
			case FINALLY:
			case FLUSH:
			case FOR:
			case FROM:
			case GETTER:
			case HAS:
			case IF:
			case IN:
			case INDEX:
			case IS:
			case MATCHING:
			case METHOD:
			case METHODS:
			case MODULO:
			case MUTABLE:
			case NATIVE:
			case NONE:
			case NOT:
			case NOTHING:
			case NULL:
			case ON:
			case ONE:
			case OPERATOR:
			case OR:
			case ORDER:
			case OTHERWISE:
			case PASS:
			case RAISE:
			case READ:
			case RECEIVING:
			case RESOURCE:
			case RETURN:
			case RETURNING:
			case ROWS:
			case SELF:
			case SETTER:
			case SINGLETON:
			case SORTED:
			case STORABLE:
			case STORE:
			case SUPER:
			case SWITCH:
			case TEST:
			case THIS:
			case THROW:
			case TO:
			case TRY:
			case VERIFYING:
			case WIDGET:
			case WITH:
			case WHEN:
			case WHERE:
			case WHILE:
			case WRITE:
			case SYMBOL_IDENTIFIER:
			case TYPE_IDENTIFIER:
			case VARIABLE_IDENTIFIER:
				{
				setState(2936);
				identifier_or_keyword();
				}
				break;
			case MINUS:
				{
				setState(2937);
				match(MINUS);
				setState(2938);
				nospace_identifier_or_keyword();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(2949);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,266,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Css_identifierContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_css_identifier);
					setState(2941);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2943); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(2942);
							nospace_hyphen_identifier_or_keyword();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(2945); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,265,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					} 
				}
				setState(2951);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,266,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Css_valueContext extends ParserRuleContext {
		public Css_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_css_value; }
	 
		public Css_valueContext() { }
		public void copyFrom(Css_valueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CssTextContext extends Css_valueContext {
		public Css_textContext text;
		public Css_textContext css_text() {
			return getRuleContext(Css_textContext.class,0);
		}
		public CssTextContext(Css_valueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterCssText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitCssText(this);
		}
	}
	public static class CssValueContext extends Css_valueContext {
		public ExpressionContext exp;
		public TerminalNode LCURL() { return getToken(EParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(EParser.RCURL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CssValueContext(Css_valueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterCssValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitCssValue(this);
		}
	}

	public final Css_valueContext css_value() throws RecognitionException {
		Css_valueContext _localctx = new Css_valueContext(_ctx, getState());
		enterRule(_localctx, 516, RULE_css_value);
		try {
			setState(2957);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
			case 1:
				_localctx = new CssValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2952);
				match(LCURL);
				setState(2953);
				((CssValueContext)_localctx).exp = expression(0);
				setState(2954);
				match(RCURL);
				}
				break;
			case 2:
				_localctx = new CssTextContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2956);
				((CssTextContext)_localctx).text = css_text();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Css_textContext extends ParserRuleContext {
		public List<TerminalNode> SEMI() { return getTokens(EParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(EParser.SEMI, i);
		}
		public Css_textContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_css_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterCss_text(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitCss_text(this);
		}
	}

	public final Css_textContext css_text() throws RecognitionException {
		Css_textContext _localctx = new Css_textContext(_ctx, getState());
		enterRule(_localctx, 518, RULE_css_text);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2960); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(2959);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==SEMI) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2962); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,268,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 18:
			return native_category_binding_list_sempred((Native_category_binding_listContext)_localctx, predIndex);
		case 39:
			return else_if_statement_list_sempred((Else_if_statement_listContext)_localctx, predIndex);
		case 45:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 46:
			return unresolved_expression_sempred((Unresolved_expressionContext)_localctx, predIndex);
		case 47:
			return unresolved_selector_sempred((Unresolved_selectorContext)_localctx, predIndex);
		case 49:
			return invocation_trailer_sempred((Invocation_trailerContext)_localctx, predIndex);
		case 51:
			return instance_expression_sempred((Instance_expressionContext)_localctx, predIndex);
		case 52:
			return instance_selector_sempred((Instance_selectorContext)_localctx, predIndex);
		case 53:
			return mutable_instance_expression_sempred((Mutable_instance_expressionContext)_localctx, predIndex);
		case 64:
			return argument_assignment_list_sempred((Argument_assignment_listContext)_localctx, predIndex);
		case 65:
			return with_argument_assignment_list_sempred((With_argument_assignment_listContext)_localctx, predIndex);
		case 68:
			return child_instance_sempred((Child_instanceContext)_localctx, predIndex);
		case 96:
			return typedef_sempred((TypedefContext)_localctx, predIndex);
		case 107:
			return nospace_hyphen_identifier_or_keyword_sempred((Nospace_hyphen_identifier_or_keywordContext)_localctx, predIndex);
		case 108:
			return nospace_identifier_or_keyword_sempred((Nospace_identifier_or_keywordContext)_localctx, predIndex);
		case 121:
			return any_type_sempred((Any_typeContext)_localctx, predIndex);
		case 163:
			return assignable_instance_sempred((Assignable_instanceContext)_localctx, predIndex);
		case 164:
			return is_expression_sempred((Is_expressionContext)_localctx, predIndex);
		case 176:
			return new_token_sempred((New_tokenContext)_localctx, predIndex);
		case 177:
			return key_token_sempred((Key_tokenContext)_localctx, predIndex);
		case 178:
			return module_token_sempred((Module_tokenContext)_localctx, predIndex);
		case 179:
			return value_token_sempred((Value_tokenContext)_localctx, predIndex);
		case 180:
			return symbols_token_sempred((Symbols_tokenContext)_localctx, predIndex);
		case 187:
			return javascript_expression_sempred((Javascript_expressionContext)_localctx, predIndex);
		case 193:
			return javascript_arguments_sempred((Javascript_argumentsContext)_localctx, predIndex);
		case 200:
			return python_expression_sempred((Python_expressionContext)_localctx, predIndex);
		case 206:
			return python_ordinal_argument_list_sempred((Python_ordinal_argument_listContext)_localctx, predIndex);
		case 207:
			return python_named_argument_list_sempred((Python_named_argument_listContext)_localctx, predIndex);
		case 209:
			return python_identifier_expression_sempred((Python_identifier_expressionContext)_localctx, predIndex);
		case 213:
			return java_expression_sempred((Java_expressionContext)_localctx, predIndex);
		case 219:
			return java_arguments_sempred((Java_argumentsContext)_localctx, predIndex);
		case 222:
			return java_identifier_expression_sempred((Java_identifier_expressionContext)_localctx, predIndex);
		case 223:
			return java_class_identifier_expression_sempred((Java_class_identifier_expressionContext)_localctx, predIndex);
		case 227:
			return csharp_expression_sempred((Csharp_expressionContext)_localctx, predIndex);
		case 233:
			return csharp_arguments_sempred((Csharp_argumentsContext)_localctx, predIndex);
		case 236:
			return csharp_identifier_expression_sempred((Csharp_identifier_expressionContext)_localctx, predIndex);
		case 257:
			return css_identifier_sempred((Css_identifierContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean native_category_binding_list_sempred(Native_category_binding_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean else_if_statement_list_sempred(Else_if_statement_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 43);
		case 3:
			return precpred(_ctx, 42);
		case 4:
			return precpred(_ctx, 41);
		case 5:
			return precpred(_ctx, 40);
		case 6:
			return precpred(_ctx, 39);
		case 7:
			return precpred(_ctx, 37);
		case 8:
			return precpred(_ctx, 36);
		case 9:
			return precpred(_ctx, 35);
		case 10:
			return precpred(_ctx, 34);
		case 11:
			return precpred(_ctx, 31);
		case 12:
			return precpred(_ctx, 30);
		case 13:
			return precpred(_ctx, 29);
		case 14:
			return precpred(_ctx, 28);
		case 15:
			return precpred(_ctx, 27);
		case 16:
			return precpred(_ctx, 26);
		case 17:
			return precpred(_ctx, 25);
		case 18:
			return precpred(_ctx, 24);
		case 19:
			return precpred(_ctx, 23);
		case 20:
			return precpred(_ctx, 22);
		case 21:
			return precpred(_ctx, 21);
		case 22:
			return precpred(_ctx, 20);
		case 23:
			return precpred(_ctx, 19);
		case 24:
			return precpred(_ctx, 18);
		case 25:
			return precpred(_ctx, 17);
		case 26:
			return precpred(_ctx, 16);
		case 27:
			return precpred(_ctx, 1);
		case 28:
			return precpred(_ctx, 38);
		case 29:
			return precpred(_ctx, 33);
		case 30:
			return precpred(_ctx, 32);
		case 31:
			return precpred(_ctx, 9);
		}
		return true;
	}
	private boolean unresolved_expression_sempred(Unresolved_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 32:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean unresolved_selector_sempred(Unresolved_selectorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 33:
			return this.wasNot(EParser.WS);
		}
		return true;
	}
	private boolean invocation_trailer_sempred(Invocation_trailerContext _localctx, int predIndex) {
		switch (predIndex) {
		case 34:
			return this.willBe(EParser.LF);
		}
		return true;
	}
	private boolean instance_expression_sempred(Instance_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 35:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean instance_selector_sempred(Instance_selectorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 36:
			return this.wasNot(EParser.WS);
		case 37:
			return this.wasNot(EParser.WS);
		case 38:
			return this.wasNot(EParser.WS);
		}
		return true;
	}
	private boolean mutable_instance_expression_sempred(Mutable_instance_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 39:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean argument_assignment_list_sempred(Argument_assignment_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 40:
			return this.was(EParser.WS);
		}
		return true;
	}
	private boolean with_argument_assignment_list_sempred(With_argument_assignment_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 41:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean child_instance_sempred(Child_instanceContext _localctx, int predIndex) {
		switch (predIndex) {
		case 42:
			return this.wasNot(EParser.WS);
		case 43:
			return this.wasNot(EParser.WS);
		}
		return true;
	}
	private boolean typedef_sempred(TypedefContext _localctx, int predIndex) {
		switch (predIndex) {
		case 44:
			return precpred(_ctx, 5);
		case 45:
			return precpred(_ctx, 4);
		case 46:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean nospace_hyphen_identifier_or_keyword_sempred(Nospace_hyphen_identifier_or_keywordContext _localctx, int predIndex) {
		switch (predIndex) {
		case 47:
			return this.wasNotWhiteSpace();
		}
		return true;
	}
	private boolean nospace_identifier_or_keyword_sempred(Nospace_identifier_or_keywordContext _localctx, int predIndex) {
		switch (predIndex) {
		case 48:
			return this.wasNotWhiteSpace();
		}
		return true;
	}
	private boolean any_type_sempred(Any_typeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 49:
			return precpred(_ctx, 2);
		case 50:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean assignable_instance_sempred(Assignable_instanceContext _localctx, int predIndex) {
		switch (predIndex) {
		case 51:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean is_expression_sempred(Is_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 52:
			return this.willBeAOrAn();
		}
		return true;
	}
	private boolean new_token_sempred(New_tokenContext _localctx, int predIndex) {
		switch (predIndex) {
		case 53:
			return this.isText(((New_tokenContext)_localctx).i1,"new");
		}
		return true;
	}
	private boolean key_token_sempred(Key_tokenContext _localctx, int predIndex) {
		switch (predIndex) {
		case 54:
			return this.isText(((Key_tokenContext)_localctx).i1,"key");
		}
		return true;
	}
	private boolean module_token_sempred(Module_tokenContext _localctx, int predIndex) {
		switch (predIndex) {
		case 55:
			return this.isText(((Module_tokenContext)_localctx).i1,"module");
		}
		return true;
	}
	private boolean value_token_sempred(Value_tokenContext _localctx, int predIndex) {
		switch (predIndex) {
		case 56:
			return this.isText(((Value_tokenContext)_localctx).i1,"value");
		}
		return true;
	}
	private boolean symbols_token_sempred(Symbols_tokenContext _localctx, int predIndex) {
		switch (predIndex) {
		case 57:
			return this.isText(((Symbols_tokenContext)_localctx).i1,"symbols");
		}
		return true;
	}
	private boolean javascript_expression_sempred(Javascript_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 58:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean javascript_arguments_sempred(Javascript_argumentsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 59:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean python_expression_sempred(Python_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 60:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean python_ordinal_argument_list_sempred(Python_ordinal_argument_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 61:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean python_named_argument_list_sempred(Python_named_argument_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 62:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean python_identifier_expression_sempred(Python_identifier_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 63:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean java_expression_sempred(Java_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 64:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean java_arguments_sempred(Java_argumentsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 65:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean java_identifier_expression_sempred(Java_identifier_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 66:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean java_class_identifier_expression_sempred(Java_class_identifier_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 67:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean csharp_expression_sempred(Csharp_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 68:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean csharp_arguments_sempred(Csharp_argumentsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 69:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean csharp_identifier_expression_sempred(Csharp_identifier_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 70:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean css_identifier_sempred(Css_identifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 71:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00bb\u0b97\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"+
		"\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc\4\u00cd"+
		"\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\4\u00d0\t\u00d0\4\u00d1\t\u00d1"+
		"\4\u00d2\t\u00d2\4\u00d3\t\u00d3\4\u00d4\t\u00d4\4\u00d5\t\u00d5\4\u00d6"+
		"\t\u00d6\4\u00d7\t\u00d7\4\u00d8\t\u00d8\4\u00d9\t\u00d9\4\u00da\t\u00da"+
		"\4\u00db\t\u00db\4\u00dc\t\u00dc\4\u00dd\t\u00dd\4\u00de\t\u00de\4\u00df"+
		"\t\u00df\4\u00e0\t\u00e0\4\u00e1\t\u00e1\4\u00e2\t\u00e2\4\u00e3\t\u00e3"+
		"\4\u00e4\t\u00e4\4\u00e5\t\u00e5\4\u00e6\t\u00e6\4\u00e7\t\u00e7\4\u00e8"+
		"\t\u00e8\4\u00e9\t\u00e9\4\u00ea\t\u00ea\4\u00eb\t\u00eb\4\u00ec\t\u00ec"+
		"\4\u00ed\t\u00ed\4\u00ee\t\u00ee\4\u00ef\t\u00ef\4\u00f0\t\u00f0\4\u00f1"+
		"\t\u00f1\4\u00f2\t\u00f2\4\u00f3\t\u00f3\4\u00f4\t\u00f4\4\u00f5\t\u00f5"+
		"\4\u00f6\t\u00f6\4\u00f7\t\u00f7\4\u00f8\t\u00f8\4\u00f9\t\u00f9\4\u00fa"+
		"\t\u00fa\4\u00fb\t\u00fb\4\u00fc\t\u00fc\4\u00fd\t\u00fd\4\u00fe\t\u00fe"+
		"\4\u00ff\t\u00ff\4\u0100\t\u0100\4\u0101\t\u0101\4\u0102\t\u0102\4\u0103"+
		"\t\u0103\4\u0104\t\u0104\4\u0105\t\u0105\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u0211"+
		"\n\2\3\2\3\2\3\2\3\2\3\2\5\2\u0218\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\5\5\u0236\n\5\3\6\3\6\3\6\3\6\5\6\u023c\n\6\3\6\3\6\3\6\5\6"+
		"\u0241\n\6\3\6\3\6\3\6\3\6\5\6\u0247\n\6\5\6\u0249\n\6\3\6\5\6\u024c\n"+
		"\6\3\7\3\7\3\7\3\7\3\7\5\7\u0253\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u025c"+
		"\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\5\t\u0275\n\t\3\t\3\t\5\t\u0279\n\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0284\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\5\t\u028d\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n"+
		"\u029c\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u02a5\n\n\3\13\3\13\3\13\3"+
		"\13\3\13\5\13\u02ac\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u02b6\n\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\5\16\u02cc\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\5\20"+
		"\u02e3\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\5\21"+
		"\u02f0\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u02fb\n"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0309"+
		"\n\21\3\22\3\22\3\22\3\22\5\22\u030f\n\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\5\22\u031a\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\5\22\u0328\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u033a\n\24\f\24\16"+
		"\24\u033d\13\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0347\n\25"+
		"\5\25\u0349\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0352\n\26\3"+
		"\26\3\26\5\26\u0356\n\26\3\26\5\26\u0359\n\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\5\27\u0361\n\27\3\27\3\27\5\27\u0365\n\27\3\27\5\27\u0368\n\27\3"+
		"\27\3\27\3\27\3\27\3\27\5\27\u036f\n\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\5\30\u0377\n\30\3\30\3\30\3\30\5\30\u037c\n\30\3\30\3\30\5\30\u0380\n"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u039b"+
		"\n\31\3\32\3\32\3\33\3\33\3\33\5\33\u03a2\n\33\3\34\3\34\3\34\5\34\u03a7"+
		"\n\34\3\34\3\34\5\34\u03ab\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35"+
		"\u03c2\n\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37\5\37\u03cb\n\37\3\37\3"+
		"\37\5\37\u03cf\n\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u03d7\n\37\3 \3"+
		" \5 \u03db\n \3 \5 \u03de\n \3 \3 \3 \5 \u03e3\n \3 \3 \3 \3 \3 \5 \u03ea"+
		"\n \3 \5 \u03ed\n \3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u040e\n#\3#\3#"+
		"\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u0421\n$\3%\3%\3%\3%"+
		"\3%\5%\u0428\n%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u044a\n(\3(\3(\3"+
		"(\3(\3(\3(\3(\5(\u0453\n(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\7)\u0468\n)\f)\16)\u046b\13)\3*\3*\3*\3+\3+\3+\3+\3+\3+"+
		"\3+\3+\3+\3+\5+\u047a\n+\3+\3+\3+\5+\u047f\n+\3+\3+\3+\3+\3+\3+\5+\u0487"+
		"\n+\3+\3+\3+\3+\3+\3+\3+\5+\u0490\n+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,"+
		"\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u04a7\n,\3-\3-\3.\3.\5.\u04ad\n.\3/"+
		"\3/\3/\3/\3/\3/\3/\3/\5/\u04b7\n/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/"+
		"\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u04d2\n/\3/\3/\3/\3/\3/\3/"+
		"\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/"+
		"\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/"+
		"\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/"+
		"\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/"+
		"\3/\3/\3/\5/\u0539\n/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\7/\u0545\n/\f/\16"+
		"/\u0548\13/\3\60\3\60\3\60\3\60\3\60\7\60\u054f\n\60\f\60\16\60\u0552"+
		"\13\60\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3\64\3\64\3\64"+
		"\3\64\3\64\5\64\u0563\n\64\3\65\3\65\3\65\3\65\3\65\7\65\u056a\n\65\f"+
		"\65\16\65\u056d\13\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\5\66\u057c\n\66\3\67\3\67\3\67\3\67\3\67\3\67\7\67\u0584"+
		"\n\67\f\67\16\67\u0587\13\67\38\38\38\58\u058c\n8\39\39\39\39\3:\3:\3"+
		":\3:\5:\u0596\n:\3:\3:\3:\5:\u059b\n:\5:\u059d\n:\3:\3:\3:\3:\5:\u05a3"+
		"\n:\5:\u05a5\n:\5:\u05a7\n:\3;\3;\3;\3;\3;\3<\3<\3<\3<\3=\3=\3=\5=\u05b5"+
		"\n=\3=\3=\3=\3>\3>\3>\5>\u05bd\n>\3>\3>\3>\3>\3>\5>\u05c4\n>\3>\3>\5>"+
		"\u05c8\n>\3>\3>\3>\3>\3>\3>\3>\3>\3>\5>\u05d3\n>\3>\3>\5>\u05d7\n>\3>"+
		"\3>\3>\5>\u05dc\n>\5>\u05de\n>\3?\3?\3?\5?\u05e3\n?\3?\3?\3?\3?\3?\3?"+
		"\3?\3?\3?\3?\3?\3?\3?\5?\u05f2\n?\3?\3?\5?\u05f6\n?\3?\3?\3?\3?\3?\3?"+
		"\3?\3?\3?\5?\u0601\n?\3?\3?\5?\u0605\n?\3?\3?\3?\5?\u060a\n?\3?\3?\3?"+
		"\3?\3?\3?\3?\3?\5?\u0614\n?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3A\3A"+
		"\5A\u0624\nA\3A\3A\3A\3A\3A\3A\5A\u062c\nA\3B\3B\3B\3B\3B\5B\u0633\nB"+
		"\5B\u0635\nB\3B\3B\3B\5B\u063a\nB\5B\u063c\nB\3C\3C\3C\3C\3C\3C\3C\7C"+
		"\u0645\nC\fC\16C\u0648\13C\3D\3D\3D\5D\u064d\nD\3D\3D\3E\3E\3E\3E\3F\3"+
		"F\3F\3F\3F\3F\3F\3F\5F\u065d\nF\3G\3G\3G\3G\3H\7H\u0664\nH\fH\16H\u0667"+
		"\13H\3I\6I\u066a\nI\rI\16I\u066b\3J\7J\u066f\nJ\fJ\16J\u0672\13J\3K\6"+
		"K\u0675\nK\rK\16K\u0676\3K\3K\3L\7L\u067c\nL\fL\16L\u067f\13L\3L\3L\3"+
		"M\3M\3M\3M\3N\3N\3O\3O\3O\5O\u068c\nO\3P\5P\u068f\nP\3P\3P\3P\3Q\3Q\3"+
		"Q\3Q\7Q\u0698\nQ\fQ\16Q\u069b\13Q\3R\3R\3R\7R\u06a0\nR\fR\16R\u06a3\13"+
		"R\3R\3R\3R\7R\u06a8\nR\fR\16R\u06ab\13R\3R\3R\3R\3R\3R\3R\5R\u06b3\nR"+
		"\3S\3S\3S\3S\3S\3S\7S\u06bb\nS\fS\16S\u06be\13S\5S\u06c0\nS\3S\3S\5S\u06c4"+
		"\nS\3T\3T\3U\3U\3U\3U\3V\3V\3W\3W\5W\u06d0\nW\3X\3X\3Y\3Y\5Y\u06d6\nY"+
		"\3Z\3Z\3Z\3Z\7Z\u06dc\nZ\fZ\16Z\u06df\13Z\3[\3[\3[\3[\7[\u06e5\n[\f[\16"+
		"[\u06e8\13[\3\\\3\\\3\\\7\\\u06ed\n\\\f\\\16\\\u06f0\13\\\3]\3]\3]\3]"+
		"\3]\3]\3]\3]\3]\3]\5]\u06fc\n]\3^\5^\u06ff\n^\3^\3^\5^\u0703\n^\3^\3^"+
		"\3_\5_\u0708\n_\3_\3_\5_\u070c\n_\3_\3_\3`\3`\3`\7`\u0713\n`\f`\16`\u0716"+
		"\13`\3a\3a\3a\3a\3a\3a\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\5b\u072a\n"+
		"b\3b\3b\3b\3b\3b\3b\3b\7b\u0733\nb\fb\16b\u0736\13b\3c\3c\5c\u073a\nc"+
		"\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\5d\u074d\nd\3e\3e"+
		"\3f\5f\u0752\nf\3f\3f\3g\3g\3h\3h\3h\5h\u075b\nh\3i\3i\5i\u075f\ni\3j"+
		"\3j\3j\7j\u0764\nj\fj\16j\u0767\13j\3k\3k\5k\u076b\nk\3l\3l\5l\u076f\n"+
		"l\3m\3m\3m\3m\3n\3n\3n\3o\3o\3o\5o\u077b\no\3p\3p\3q\3q\3r\3r\3s\3s\3"+
		"t\3t\3u\3u\3u\7u\u078a\nu\fu\16u\u078d\13u\3v\3v\5v\u0791\nv\3v\5v\u0794"+
		"\nv\3w\3w\5w\u0798\nw\3x\3x\3x\5x\u079d\nx\3y\3y\3y\3z\3z\5z\u07a4\nz"+
		"\3{\3{\3{\3{\3{\3{\3{\3{\3{\7{\u07af\n{\f{\16{\u07b2\13{\3|\3|\3|\3|\7"+
		"|\u07b8\n|\f|\16|\u07bb\13|\3}\3}\3}\7}\u07c0\n}\f}\16}\u07c3\13}\3}\3"+
		"}\3}\7}\u07c8\n}\f}\16}\u07cb\13}\3}\3}\3}\3}\3}\5}\u07d2\n}\3~\3~\3~"+
		"\3~\7~\u07d8\n~\f~\16~\u07db\13~\3\177\3\177\3\177\5\177\u07e0\n\177\3"+
		"\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080"+
		"\3\u0080\5\u0080\u07ec\n\u0080\3\u0081\3\u0081\5\u0081\u07f0\n\u0081\3"+
		"\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\7\u0082\u07f8\n\u0082\f"+
		"\u0082\16\u0082\u07fb\13\u0082\3\u0083\3\u0083\3\u0083\7\u0083\u0800\n"+
		"\u0083\f\u0083\16\u0083\u0803\13\u0083\3\u0083\5\u0083\u0806\n\u0083\3"+
		"\u0084\3\u0084\3\u0084\3\u0084\5\u0084\u080c\n\u0084\3\u0084\3\u0084\3"+
		"\u0084\7\u0084\u0811\n\u0084\f\u0084\16\u0084\u0814\13\u0084\3\u0084\3"+
		"\u0084\5\u0084\u0818\n\u0084\3\u0085\3\u0085\3\u0085\7\u0085\u081d\n\u0085"+
		"\f\u0085\16\u0085\u0820\13\u0085\3\u0086\3\u0086\3\u0086\7\u0086\u0825"+
		"\n\u0086\f\u0086\16\u0086\u0828\13\u0086\3\u0087\3\u0087\3\u0087\3\u0087"+
		"\5\u0087\u082e\n\u0087\3\u0088\3\u0088\3\u0089\3\u0089\3\u0089\3\u0089"+
		"\7\u0089\u0836\n\u0089\f\u0089\16\u0089\u0839\13\u0089\3\u008a\3\u008a"+
		"\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\5\u008a"+
		"\u0845\n\u008a\3\u008b\3\u008b\5\u008b\u0849\n\u008b\3\u008b\5\u008b\u084c"+
		"\n\u008b\3\u008c\3\u008c\5\u008c\u0850\n\u008c\3\u008c\5\u008c\u0853\n"+
		"\u008c\3\u008d\3\u008d\3\u008d\3\u008d\7\u008d\u0859\n\u008d\f\u008d\16"+
		"\u008d\u085c\13\u008d\3\u008e\3\u008e\3\u008e\3\u008e\7\u008e\u0862\n"+
		"\u008e\f\u008e\16\u008e\u0865\13\u008e\3\u008f\3\u008f\3\u008f\3\u008f"+
		"\7\u008f\u086b\n\u008f\f\u008f\16\u008f\u086e\13\u008f\3\u0090\3\u0090"+
		"\3\u0090\3\u0090\7\u0090\u0874\n\u0090\f\u0090\16\u0090\u0877\13\u0090"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\5\u0091\u0887\n\u0091\3\u0092"+
		"\3\u0092\3\u0092\5\u0092\u088c\n\u0092\3\u0092\3\u0092\3\u0092\3\u0092"+
		"\3\u0092\3\u0092\3\u0092\5\u0092\u0895\n\u0092\3\u0092\3\u0092\3\u0092"+
		"\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\5\u0092\u08a0\n\u0092"+
		"\3\u0093\3\u0093\3\u0093\7\u0093\u08a5\n\u0093\f\u0093\16\u0093\u08a8"+
		"\13\u0093\3\u0094\3\u0094\3\u0095\3\u0095\3\u0095\5\u0095\u08af\n\u0095"+
		"\3\u0095\3\u0095\3\u0096\3\u0096\3\u0096\3\u0096\3\u0097\3\u0097\5\u0097"+
		"\u08b9\n\u0097\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\5\u0098"+
		"\u08c1\n\u0098\3\u0099\5\u0099\u08c4\n\u0099\3\u0099\3\u0099\5\u0099\u08c8"+
		"\n\u0099\3\u0099\3\u0099\3\u009a\5\u009a\u08cd\n\u009a\3\u009a\3\u009a"+
		"\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\5\u009a\u08d7\n\u009a"+
		"\3\u009b\3\u009b\5\u009b\u08db\n\u009b\3\u009b\3\u009b\3\u009c\3\u009c"+
		"\3\u009c\3\u009c\3\u009c\7\u009c\u08e4\n\u009c\f\u009c\16\u009c\u08e7"+
		"\13\u009c\5\u009c\u08e9\n\u009c\3\u009d\3\u009d\3\u009d\7\u009d\u08ee"+
		"\n\u009d\f\u009d\16\u009d\u08f1\13\u009d\3\u009e\3\u009e\3\u009e\3\u009e"+
		"\3\u009f\3\u009f\5\u009f\u08f9\n\u009f\3\u00a0\3\u00a0\3\u00a0\7\u00a0"+
		"\u08fe\n\u00a0\f\u00a0\16\u00a0\u0901\13\u00a0\3\u00a1\3\u00a1\3\u00a1"+
		"\3\u00a1\3\u00a2\3\u00a2\5\u00a2\u0909\n\u00a2\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\5\u00a3\u0914\n\u00a3"+
		"\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5"+
		"\7\u00a5\u091f\n\u00a5\f\u00a5\16\u00a5\u0922\13\u00a5\3\u00a6\3\u00a6"+
		"\3\u00a6\3\u00a6\5\u00a6\u0928\n\u00a6\3\u00a7\3\u00a7\3\u00a7\3\u00a7"+
		"\3\u00a7\3\u00a7\3\u00a7\3\u00a7\5\u00a7\u0932\n\u00a7\3\u00a8\3\u00a8"+
		"\3\u00a8\3\u00a8\3\u00a8\3\u00a9\3\u00a9\3\u00a9\5\u00a9\u093c\n\u00a9"+
		"\3\u00a9\5\u00a9\u093f\n\u00a9\3\u00aa\3\u00aa\5\u00aa\u0943\n\u00aa\3"+
		"\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ac\3\u00ac\3\u00ac\3\u00ac"+
		"\3\u00ac\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ae\3\u00ae\3\u00ae"+
		"\7\u00ae\u0957\n\u00ae\f\u00ae\16\u00ae\u095a\13\u00ae\3\u00af\3\u00af"+
		"\3\u00af\7\u00af\u095f\n\u00af\f\u00af\16\u00af\u0962\13\u00af\3\u00af"+
		"\5\u00af\u0965\n\u00af\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0"+
		"\5\u00b0\u096d\n\u00b0\3\u00b1\3\u00b1\3\u00b2\3\u00b2\3\u00b2\3\u00b3"+
		"\3\u00b3\3\u00b3\3\u00b4\3\u00b4\3\u00b4\3\u00b5\3\u00b5\3\u00b5\3\u00b6"+
		"\3\u00b6\3\u00b6\3\u00b7\3\u00b7\3\u00b8\3\u00b8\3\u00b9\3\u00b9\3\u00ba"+
		"\3\u00ba\3\u00bb\3\u00bb\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc"+
		"\3\u00bc\5\u00bc\u0991\n\u00bc\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd"+
		"\7\u00bd\u0998\n\u00bd\f\u00bd\16\u00bd\u099b\13\u00bd\3\u00be\3\u00be"+
		"\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\5\u00be\u09a4\n\u00be\3\u00bf"+
		"\3\u00bf\3\u00c0\3\u00c0\3\u00c0\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1"+
		"\5\u00c1\u09b0\n\u00c1\3\u00c2\3\u00c2\3\u00c2\5\u00c2\u09b5\n\u00c2\3"+
		"\u00c2\3\u00c2\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\7\u00c3"+
		"\u09bf\n\u00c3\f\u00c3\16\u00c3\u09c2\13\u00c3\3\u00c4\3\u00c4\3\u00c4"+
		"\3\u00c4\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c6\3\u00c6\3\u00c7\3\u00c7"+
		"\3\u00c7\3\u00c7\3\u00c7\5\u00c7\u09d3\n\u00c7\3\u00c8\3\u00c8\3\u00c8"+
		"\3\u00c8\3\u00c8\5\u00c8\u09da\n\u00c8\3\u00c9\3\u00c9\3\u00c9\5\u00c9"+
		"\u09df\n\u00c9\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\7\u00ca\u09e6\n"+
		"\u00ca\f\u00ca\16\u00ca\u09e9\13\u00ca\3\u00cb\3\u00cb\3\u00cb\3\u00cb"+
		"\3\u00cb\5\u00cb\u09f0\n\u00cb\3\u00cc\3\u00cc\3\u00cd\3\u00cd\3\u00cd"+
		"\3\u00cd\3\u00cd\3\u00cd\5\u00cd\u09fa\n\u00cd\3\u00ce\3\u00ce\3\u00ce"+
		"\5\u00ce\u09ff\n\u00ce\3\u00ce\3\u00ce\3\u00cf\3\u00cf\3\u00cf\3\u00cf"+
		"\3\u00cf\3\u00cf\5\u00cf\u0a09\n\u00cf\3\u00d0\3\u00d0\3\u00d0\3\u00d0"+
		"\3\u00d0\3\u00d0\7\u00d0\u0a11\n\u00d0\f\u00d0\16\u00d0\u0a14\13\u00d0"+
		"\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1"+
		"\3\u00d1\3\u00d1\7\u00d1\u0a21\n\u00d1\f\u00d1\16\u00d1\u0a24\13\u00d1"+
		"\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d3\3\u00d3\3\u00d3\5\u00d3\u0a2d"+
		"\n\u00d3\3\u00d3\3\u00d3\3\u00d3\7\u00d3\u0a32\n\u00d3\f\u00d3\16\u00d3"+
		"\u0a35\13\u00d3\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\5\u00d4\u0a3c"+
		"\n\u00d4\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\5\u00d5\u0a43\n\u00d5"+
		"\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\5\u00d6\u0a4c"+
		"\n\u00d6\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\7\u00d7\u0a53\n\u00d7"+
		"\f\u00d7\16\u00d7\u0a56\13\u00d7\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8"+
		"\5\u00d8\u0a5d\n\u00d8\3\u00d9\3\u00d9\3\u00da\3\u00da\3\u00da\3\u00db"+
		"\3\u00db\3\u00db\5\u00db\u0a67\n\u00db\3\u00dc\3\u00dc\3\u00dc\5\u00dc"+
		"\u0a6c\n\u00dc\3\u00dc\3\u00dc\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd"+
		"\3\u00dd\7\u00dd\u0a76\n\u00dd\f\u00dd\16\u00dd\u0a79\13\u00dd\3\u00de"+
		"\3\u00de\3\u00de\3\u00de\3\u00df\3\u00df\3\u00df\3\u00df\3\u00e0\3\u00e0"+
		"\3\u00e0\3\u00e0\3\u00e0\3\u00e0\7\u00e0\u0a89\n\u00e0\f\u00e0\16\u00e0"+
		"\u0a8c\13\u00e0\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\7\u00e1\u0a93"+
		"\n\u00e1\f\u00e1\16\u00e1\u0a96\13\u00e1\3\u00e2\3\u00e2\3\u00e2\3\u00e2"+
		"\3\u00e2\5\u00e2\u0a9d\n\u00e2\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3"+
		"\5\u00e3\u0aa4\n\u00e3\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4"+
		"\3\u00e4\5\u00e4\u0aad\n\u00e4\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5"+
		"\7\u00e5\u0ab4\n\u00e5\f\u00e5\16\u00e5\u0ab7\13\u00e5\3\u00e6\3\u00e6"+
		"\3\u00e6\3\u00e6\3\u00e6\5\u00e6\u0abe\n\u00e6\3\u00e7\3\u00e7\3\u00e8"+
		"\3\u00e8\3\u00e8\3\u00e9\3\u00e9\3\u00e9\5\u00e9\u0ac8\n\u00e9\3\u00ea"+
		"\3\u00ea\3\u00ea\5\u00ea\u0acd\n\u00ea\3\u00ea\3\u00ea\3\u00eb\3\u00eb"+
		"\3\u00eb\3\u00eb\3\u00eb\3\u00eb\7\u00eb\u0ad7\n\u00eb\f\u00eb\16\u00eb"+
		"\u0ada\13\u00eb\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ed\3\u00ed\3\u00ed"+
		"\3\u00ed\3\u00ee\3\u00ee\3\u00ee\5\u00ee\u0ae7\n\u00ee\3\u00ee\3\u00ee"+
		"\3\u00ee\7\u00ee\u0aec\n\u00ee\f\u00ee\16\u00ee\u0aef\13\u00ee\3\u00ef"+
		"\3\u00ef\3\u00ef\3\u00ef\3\u00ef\5\u00ef\u0af6\n\u00ef\3\u00f0\3\u00f0"+
		"\3\u00f0\3\u00f0\3\u00f0\5\u00f0\u0afd\n\u00f0\3\u00f1\3\u00f1\5\u00f1"+
		"\u0b01\n\u00f1\3\u00f2\3\u00f2\3\u00f2\5\u00f2\u0b06\n\u00f2\3\u00f2\3"+
		"\u00f2\5\u00f2\u0b0a\n\u00f2\3\u00f3\3\u00f3\3\u00f3\5\u00f3\u0b0f\n\u00f3"+
		"\3\u00f3\3\u00f3\3\u00f3\3\u00f4\3\u00f4\3\u00f4\5\u00f4\u0b17\n\u00f4"+
		"\3\u00f5\3\u00f5\3\u00f5\3\u00f5\3\u00f6\3\u00f6\3\u00f6\3\u00f6\7\u00f6"+
		"\u0b21\n\u00f6\f\u00f6\16\u00f6\u0b24\13\u00f6\3\u00f6\3\u00f6\3\u00f6"+
		"\3\u00f7\3\u00f7\3\u00f7\3\u00f7\7\u00f7\u0b2d\n\u00f7\f\u00f7\16\u00f7"+
		"\u0b30\13\u00f7\3\u00f7\3\u00f7\3\u00f8\3\u00f8\3\u00f8\3\u00f8\3\u00f8"+
		"\3\u00f9\3\u00f9\3\u00f9\7\u00f9\u0b3c\n\u00f9\f\u00f9\16\u00f9\u0b3f"+
		"\13\u00f9\3\u00fa\3\u00fa\7\u00fa\u0b43\n\u00fa\f\u00fa\16\u00fa\u0b46"+
		"\13\u00fa\3\u00fb\3\u00fb\3\u00fb\5\u00fb\u0b4b\n\u00fb\3\u00fb\3\u00fb"+
		"\3\u00fc\3\u00fc\3\u00fc\3\u00fc\3\u00fc\5\u00fc\u0b54\n\u00fc\3\u00fd"+
		"\6\u00fd\u0b57\n\u00fd\r\u00fd\16\u00fd\u0b58\3\u00fe\3\u00fe\3\u00fe"+
		"\3\u00fe\5\u00fe\u0b5f\n\u00fe\3\u00fe\5\u00fe\u0b62\n\u00fe\3\u00ff\6"+
		"\u00ff\u0b65\n\u00ff\r\u00ff\16\u00ff\u0b66\3\u0100\3\u0100\5\u0100\u0b6b"+
		"\n\u0100\3\u0101\3\u0101\6\u0101\u0b6f\n\u0101\r\u0101\16\u0101\u0b70"+
		"\3\u0101\3\u0101\3\u0102\3\u0102\3\u0102\3\u0102\3\u0102\3\u0103\3\u0103"+
		"\3\u0103\3\u0103\5\u0103\u0b7e\n\u0103\3\u0103\3\u0103\6\u0103\u0b82\n"+
		"\u0103\r\u0103\16\u0103\u0b83\7\u0103\u0b86\n\u0103\f\u0103\16\u0103\u0b89"+
		"\13\u0103\3\u0104\3\u0104\3\u0104\3\u0104\3\u0104\5\u0104\u0b90\n\u0104"+
		"\3\u0105\6\u0105\u0b93\n\u0105\r\u0105\16\u0105\u0b94\3\u0105\3\u0b94"+
		"\32&P\\^hl\u0084\u00c2\u00f4\u0148\u0178\u0184\u0192\u019e\u01a0\u01a4"+
		"\u01ac\u01b8\u01be\u01c0\u01c8\u01d4\u01da\u0204\u0106\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd"+
		"fhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa"+
		"\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2"+
		"\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da"+
		"\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2"+
		"\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a"+
		"\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122"+
		"\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a"+
		"\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152"+
		"\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164\u0166\u0168\u016a"+
		"\u016c\u016e\u0170\u0172\u0174\u0176\u0178\u017a\u017c\u017e\u0180\u0182"+
		"\u0184\u0186\u0188\u018a\u018c\u018e\u0190\u0192\u0194\u0196\u0198\u019a"+
		"\u019c\u019e\u01a0\u01a2\u01a4\u01a6\u01a8\u01aa\u01ac\u01ae\u01b0\u01b2"+
		"\u01b4\u01b6\u01b8\u01ba\u01bc\u01be\u01c0\u01c2\u01c4\u01c6\u01c8\u01ca"+
		"\u01cc\u01ce\u01d0\u01d2\u01d4\u01d6\u01d8\u01da\u01dc\u01de\u01e0\u01e2"+
		"\u01e4\u01e6\u01e8\u01ea\u01ec\u01ee\u01f0\u01f2\u01f4\u01f6\u01f8\u01fa"+
		"\u01fc\u01fe\u0200\u0202\u0204\u0206\u0208\2\r\3\2\"#\4\2\3\3\7\t\5\2"+
		"ss\u0093\u0093\u00ad\u00ad\4\2[[\u00ad\u00ad\4\2\u0096\u0096\u00ad\u00ad"+
		"\4\2\u0092\u0092\u009c\u009c\4\2RRbb\t\2\13\20\67\679ACJLwy\u009a\u009c"+
		"\u00a6\4\2\'\'}}\5\2\32\33))++\3\2\22\22\2\u0c54\2\u020a\3\2\2\2\4\u021f"+
		"\3\2\2\2\6\u022b\3\2\2\2\b\u0231\3\2\2\2\n\u0237\3\2\2\2\f\u024d\3\2\2"+
		"\2\16\u025d\3\2\2\2\20\u0270\3\2\2\2\22\u028e\3\2\2\2\24\u02ab\3\2\2\2"+
		"\26\u02ad\3\2\2\2\30\u02bd\3\2\2\2\32\u02c7\3\2\2\2\34\u02d4\3\2\2\2\36"+
		"\u02de\3\2\2\2 \u02eb\3\2\2\2\"\u030a\3\2\2\2$\u0329\3\2\2\2&\u0332\3"+
		"\2\2\2(\u0348\3\2\2\2*\u034a\3\2\2\2,\u035a\3\2\2\2.\u0372\3\2\2\2\60"+
		"\u0387\3\2\2\2\62\u039c\3\2\2\2\64\u039e\3\2\2\2\66\u03a3\3\2\2\28\u03c1"+
		"\3\2\2\2:\u03c3\3\2\2\2<\u03ce\3\2\2\2>\u03ec\3\2\2\2@\u03ee\3\2\2\2B"+
		"\u03f7\3\2\2\2D\u0400\3\2\2\2F\u0420\3\2\2\2H\u0422\3\2\2\2J\u0430\3\2"+
		"\2\2L\u0439\3\2\2\2N\u0440\3\2\2\2P\u0454\3\2\2\2R\u046c\3\2\2\2T\u046f"+
		"\3\2\2\2V\u04a6\3\2\2\2X\u04a8\3\2\2\2Z\u04aa\3\2\2\2\\\u04d1\3\2\2\2"+
		"^\u0549\3\2\2\2`\u0553\3\2\2\2b\u0557\3\2\2\2d\u055b\3\2\2\2f\u0562\3"+
		"\2\2\2h\u0564\3\2\2\2j\u057b\3\2\2\2l\u057d\3\2\2\2n\u0588\3\2\2\2p\u058d"+
		"\3\2\2\2r\u05a6\3\2\2\2t\u05a8\3\2\2\2v\u05ad\3\2\2\2x\u05b1\3\2\2\2z"+
		"\u05dd\3\2\2\2|\u0613\3\2\2\2~\u0615\3\2\2\2\u0080\u0621\3\2\2\2\u0082"+
		"\u063b\3\2\2\2\u0084\u063d\3\2\2\2\u0086\u064c\3\2\2\2\u0088\u0650\3\2"+
		"\2\2\u008a\u065c\3\2\2\2\u008c\u065e\3\2\2\2\u008e\u0665\3\2\2\2\u0090"+
		"\u0669\3\2\2\2\u0092\u0670\3\2\2\2\u0094\u0674\3\2\2\2\u0096\u067d\3\2"+
		"\2\2\u0098\u0682\3\2\2\2\u009a\u0686\3\2\2\2\u009c\u068b\3\2\2\2\u009e"+
		"\u068e\3\2\2\2\u00a0\u0693\3\2\2\2\u00a2\u06a1\3\2\2\2\u00a4\u06b4\3\2"+
		"\2\2\u00a6\u06c5\3\2\2\2\u00a8\u06c7\3\2\2\2\u00aa\u06cb\3\2\2\2\u00ac"+
		"\u06cf\3\2\2\2\u00ae\u06d1\3\2\2\2\u00b0\u06d5\3\2\2\2\u00b2\u06d7\3\2"+
		"\2\2\u00b4\u06e0\3\2\2\2\u00b6\u06e9\3\2\2\2\u00b8\u06fb\3\2\2\2\u00ba"+
		"\u06fe\3\2\2\2\u00bc\u0707\3\2\2\2\u00be\u070f\3\2\2\2\u00c0\u0717\3\2"+
		"\2\2\u00c2\u0729\3\2\2\2\u00c4\u0739\3\2\2\2\u00c6\u074c\3\2\2\2\u00c8"+
		"\u074e\3\2\2\2\u00ca\u0751\3\2\2\2\u00cc\u0755\3\2\2\2\u00ce\u075a\3\2"+
		"\2\2\u00d0\u075e\3\2\2\2\u00d2\u0760\3\2\2\2\u00d4\u076a\3\2\2\2\u00d6"+
		"\u076e\3\2\2\2\u00d8\u0770\3\2\2\2\u00da\u0774\3\2\2\2\u00dc\u077a\3\2"+
		"\2\2\u00de\u077c\3\2\2\2\u00e0\u077e\3\2\2\2\u00e2\u0780\3\2\2\2\u00e4"+
		"\u0782\3\2\2\2\u00e6\u0784\3\2\2\2\u00e8\u0786\3\2\2\2\u00ea\u0793\3\2"+
		"\2\2\u00ec\u0797\3\2\2\2\u00ee\u0799\3\2\2\2\u00f0\u079e\3\2\2\2\u00f2"+
		"\u07a3\3\2\2\2\u00f4\u07a5\3\2\2\2\u00f6\u07b3\3\2\2\2\u00f8\u07c1\3\2"+
		"\2\2\u00fa\u07d3\3\2\2\2\u00fc\u07df\3\2\2\2\u00fe\u07eb\3\2\2\2\u0100"+
		"\u07ed\3\2\2\2\u0102\u07f1\3\2\2\2\u0104\u07fc\3\2\2\2\u0106\u0807\3\2"+
		"\2\2\u0108\u0819\3\2\2\2\u010a\u0821\3\2\2\2\u010c\u082d\3\2\2\2\u010e"+
		"\u082f\3\2\2\2\u0110\u0831\3\2\2\2\u0112\u0844\3\2\2\2\u0114\u0846\3\2"+
		"\2\2\u0116\u084d\3\2\2\2\u0118\u0854\3\2\2\2\u011a\u085d\3\2\2\2\u011c"+
		"\u0866\3\2\2\2\u011e\u086f\3\2\2\2\u0120\u0886\3\2\2\2\u0122\u089f\3\2"+
		"\2\2\u0124\u08a1\3\2\2\2\u0126\u08a9\3\2\2\2\u0128\u08ae\3\2\2\2\u012a"+
		"\u08b2\3\2\2\2\u012c\u08b8\3\2\2\2\u012e\u08c0\3\2\2\2\u0130\u08c3\3\2"+
		"\2\2\u0132\u08cc\3\2\2\2\u0134\u08d8\3\2\2\2\u0136\u08de\3\2\2\2\u0138"+
		"\u08ea\3\2\2\2\u013a\u08f2\3\2\2\2\u013c\u08f8\3\2\2\2\u013e\u08fa\3\2"+
		"\2\2\u0140\u0902\3\2\2\2\u0142\u0908\3\2\2\2\u0144\u0913\3\2\2\2\u0146"+
		"\u0915\3\2\2\2\u0148\u0919\3\2\2\2\u014a\u0927\3\2\2\2\u014c\u0931\3\2"+
		"\2\2\u014e\u0933\3\2\2\2\u0150\u093e\3\2\2\2\u0152\u0942\3\2\2\2\u0154"+
		"\u0944\3\2\2\2\u0156\u0949\3\2\2\2\u0158\u094e\3\2\2\2\u015a\u0953\3\2"+
		"\2\2\u015c\u095b\3\2\2\2\u015e\u096c\3\2\2\2\u0160\u096e\3\2\2\2\u0162"+
		"\u0970\3\2\2\2\u0164\u0973\3\2\2\2\u0166\u0976\3\2\2\2\u0168\u0979\3\2"+
		"\2\2\u016a\u097c\3\2\2\2\u016c\u097f\3\2\2\2\u016e\u0981\3\2\2\2\u0170"+
		"\u0983\3\2\2\2\u0172\u0985\3\2\2\2\u0174\u0987\3\2\2\2\u0176\u0990\3\2"+
		"\2\2\u0178\u0992\3\2\2\2\u017a\u09a3\3\2\2\2\u017c\u09a5\3\2\2\2\u017e"+
		"\u09a7\3\2\2\2\u0180\u09af\3\2\2\2\u0182\u09b1\3\2\2\2\u0184\u09b8\3\2"+
		"\2\2\u0186\u09c3\3\2\2\2\u0188\u09c7\3\2\2\2\u018a\u09cb\3\2\2\2\u018c"+
		"\u09d2\3\2\2\2\u018e\u09d9\3\2\2\2\u0190\u09de\3\2\2\2\u0192\u09e0\3\2"+
		"\2\2\u0194\u09ef\3\2\2\2\u0196\u09f1\3\2\2\2\u0198\u09f9\3\2\2\2\u019a"+
		"\u09fb\3\2\2\2\u019c\u0a08\3\2\2\2\u019e\u0a0a\3\2\2\2\u01a0\u0a15\3\2"+
		"\2\2\u01a2\u0a25\3\2\2\2\u01a4\u0a2c\3\2\2\2\u01a6\u0a3b\3\2\2\2\u01a8"+
		"\u0a42\3\2\2\2\u01aa\u0a4b\3\2\2\2\u01ac\u0a4d\3\2\2\2\u01ae\u0a5c\3\2"+
		"\2\2\u01b0\u0a5e\3\2\2\2\u01b2\u0a60\3\2\2\2\u01b4\u0a66\3\2\2\2\u01b6"+
		"\u0a68\3\2\2\2\u01b8\u0a6f\3\2\2\2\u01ba\u0a7a\3\2\2\2\u01bc\u0a7e\3\2"+
		"\2\2\u01be\u0a82\3\2\2\2\u01c0\u0a8d\3\2\2\2\u01c2\u0a9c\3\2\2\2\u01c4"+
		"\u0aa3\3\2\2\2\u01c6\u0aac\3\2\2\2\u01c8\u0aae\3\2\2\2\u01ca\u0abd\3\2"+
		"\2\2\u01cc\u0abf\3\2\2\2\u01ce\u0ac1\3\2\2\2\u01d0\u0ac7\3\2\2\2\u01d2"+
		"\u0ac9\3\2\2\2\u01d4\u0ad0\3\2\2\2\u01d6\u0adb\3\2\2\2\u01d8\u0adf\3\2"+
		"\2\2\u01da\u0ae6\3\2\2\2\u01dc\u0af5\3\2\2\2\u01de\u0afc\3\2\2\2\u01e0"+
		"\u0b00\3\2\2\2\u01e2\u0b09\3\2\2\2\u01e4\u0b0b\3\2\2\2\u01e6\u0b16\3\2"+
		"\2\2\u01e8\u0b18\3\2\2\2\u01ea\u0b1c\3\2\2\2\u01ec\u0b28\3\2\2\2\u01ee"+
		"\u0b33\3\2\2\2\u01f0\u0b38\3\2\2\2\u01f2\u0b40\3\2\2\2\u01f4\u0b47\3\2"+
		"\2\2\u01f6\u0b53\3\2\2\2\u01f8\u0b56\3\2\2\2\u01fa\u0b61\3\2\2\2\u01fc"+
		"\u0b64\3\2\2\2\u01fe\u0b6a\3\2\2\2\u0200\u0b6c\3\2\2\2\u0202\u0b74\3\2"+
		"\2\2\u0204\u0b7d\3\2\2\2\u0206\u0b8f\3\2\2\2\u0208\u0b92\3\2\2\2\u020a"+
		"\u020b\7`\2\2\u020b\u020c\5\u00e4s\2\u020c\u020d\7Q\2\2\u020d\u0210\7"+
		"h\2\2\u020e\u0211\7[\2\2\u020f\u0211\5\u00e4s\2\u0210\u020e\3\2\2\2\u0210"+
		"\u020f\3\2\2\2\u0211\u0217\3\2\2\2\u0212\u0213\5(\25\2\u0213\u0214\7\23"+
		"\2\2\u0214\u0215\7O\2\2\u0215\u0218\3\2\2\2\u0216\u0218\7\u00a2\2\2\u0217"+
		"\u0212\3\2\2\2\u0217\u0216\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021a\5\u016a"+
		"\u00b6\2\u021a\u021b\7\21\2\2\u021b\u021c\5\u0094K\2\u021c\u021d\5\u00b4"+
		"[\2\u021d\u021e\5\u0096L\2\u021e\3\3\2\2\2\u021f\u0220\7`\2\2\u0220\u0221"+
		"\5\u00e4s\2\u0221\u0222\7Q\2\2\u0222\u0223\7h\2\2\u0223\u0224\5\u00c6"+
		"d\2\u0224\u0225\7\u00a2\2\2\u0225\u0226\5\u016a\u00b6\2\u0226\u0227\7"+
		"\21\2\2\u0227\u0228\5\u0094K\2\u0228\u0229\5\u00b2Z\2\u0229\u022a\5\u0096"+
		"L\2\u022a\5\3\2\2\2\u022b\u022c\5\u00e6t\2\u022c\u022d\7\u00a2\2\2\u022d"+
		"\u022e\5\\/\2\u022e\u022f\7Q\2\2\u022f\u0230\5\u0168\u00b5\2\u0230\7\3"+
		"\2\2\2\u0231\u0232\5\u00e6t\2\u0232\u0235\5\u0084C\2\u0233\u0234\7O\2"+
		"\2\u0234\u0236\5\u0086D\2\u0235\u0233\3\2\2\2\u0235\u0236\3\2\2\2\u0236"+
		"\t\3\2\2\2\u0237\u0238\7`\2\2\u0238\u0239\5\u00e2r\2\u0239\u023b\7Q\2"+
		"\2\u023a\u023c\7\u0096\2\2\u023b\u023a\3\2\2\2\u023b\u023c\3\2\2\2\u023c"+
		"\u023d\3\2\2\2\u023d\u023e\5\u00c2b\2\u023e\u0240\7T\2\2\u023f\u0241\5"+
		"\u00b8]\2\u0240\u023f\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u024b\3\2\2\2"+
		"\u0242\u0248\7\u00a2\2\2\u0243\u0246\5\u0108\u0085\2\u0244\u0245\7O\2"+
		"\2\u0245\u0247\5\u00e0q\2\u0246\u0244\3\2\2\2\u0246\u0247\3\2\2\2\u0247"+
		"\u0249\3\2\2\2\u0248\u0243\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024a\3\2"+
		"\2\2\u024a\u024c\7w\2\2\u024b\u0242\3\2\2\2\u024b\u024c\3\2\2\2\u024c"+
		"\13\3\2\2\2\u024d\u024e\7`\2\2\u024e\u024f\5\u00e4s\2\u024f\u0252\7Q\2"+
		"\2\u0250\u0253\7\u00a1\2\2\u0251\u0253\5\u00e4s\2\u0252\u0250\3\2\2\2"+
		"\u0252\u0251\3\2\2\2\u0253\u025b\3\2\2\2\u0254\u0255\7\u00a2\2\2\u0255"+
		"\u0256\7|\2\2\u0256\u0257\7\21\2\2\u0257\u0258\5\u0094K\2\u0258\u0259"+
		"\5\u00f6|\2\u0259\u025a\5\u0096L\2\u025a\u025c\3\2\2\2\u025b\u0254\3\2"+
		"\2\2\u025b\u025c\3\2\2\2\u025c\r\3\2\2\2\u025d\u025e\7`\2\2\u025e\u025f"+
		"\5\u00e4s\2\u025f\u0260\7Q\2\2\u0260\u0261\7\177\2\2\u0261\u0262\7\u00a1"+
		"\2\2\u0262\u0263\7\u00a2\2\2\u0263\u0264\7V\2\2\u0264\u0265\7\21\2\2\u0265"+
		"\u0266\5\u0094K\2\u0266\u0267\5$\23\2\u0267\u0268\5\u0096L\2\u0268\u0269"+
		"\5\u0090I\2\u0269\u026a\7O\2\2\u026a\u026b\7|\2\2\u026b\u026c\7\21\2\2"+
		"\u026c\u026d\5\u0094K\2\u026d\u026e\5\u00fa~\2\u026e\u026f\5\u0096L\2"+
		"\u026f\17\3\2\2\2\u0270\u0271\7`\2\2\u0271\u0272\5\u00e4s\2\u0272\u0274"+
		"\7Q\2\2\u0273\u0275\7\u0096\2\2\u0274\u0273\3\2\2\2\u0274\u0275\3\2\2"+
		"\2\u0275\u0278\3\2\2\2\u0276\u0279\7[\2\2\u0277\u0279\5\24\13\2\u0278"+
		"\u0276\3\2\2\2\u0278\u0277\3\2\2\2\u0279\u028c\3\2\2\2\u027a\u0283\5("+
		"\25\2\u027b\u027c\7\23\2\2\u027c\u027d\7O\2\2\u027d\u027e\7|\2\2\u027e"+
		"\u027f\7\21\2\2\u027f\u0280\5\u0094K\2\u0280\u0281\5\u00f6|\2\u0281\u0282"+
		"\5\u0096L\2\u0282\u0284\3\2\2\2\u0283\u027b\3\2\2\2\u0283\u0284\3\2\2"+
		"\2\u0284\u028d\3\2\2\2\u0285\u0286\7\u00a2\2\2\u0286\u0287\7|\2\2\u0287"+
		"\u0288\7\21\2\2\u0288\u0289\5\u0094K\2\u0289\u028a\5\u00f6|\2\u028a\u028b"+
		"\5\u0096L\2\u028b\u028d\3\2\2\2\u028c\u027a\3\2\2\2\u028c\u0285\3\2\2"+
		"\2\u028c\u028d\3\2\2\2\u028d\21\3\2\2\2\u028e\u028f\7`\2\2\u028f\u0290"+
		"\5\u00e4s\2\u0290\u0291\7Q\2\2\u0291\u02a4\7\u0094\2\2\u0292\u029b\5("+
		"\25\2\u0293\u0294\7\23\2\2\u0294\u0295\7O\2\2\u0295\u0296\7|\2\2\u0296"+
		"\u0297\7\21\2\2\u0297\u0298\5\u0094K\2\u0298\u0299\5\u00f6|\2\u0299\u029a"+
		"\5\u0096L\2\u029a\u029c\3\2\2\2\u029b\u0293\3\2\2\2\u029b\u029c\3\2\2"+
		"\2\u029c\u02a5\3\2\2\2\u029d\u029e\7\u00a2\2\2\u029e\u029f\7|\2\2\u029f"+
		"\u02a0\7\21\2\2\u02a0\u02a1\5\u0094K\2\u02a1\u02a2\5\u00f6|\2\u02a2\u02a3"+
		"\5\u0096L\2\u02a3\u02a5\3\2\2\2\u02a4\u0292\3\2\2\2\u02a4\u029d\3\2\2"+
		"\2\u02a4\u02a5\3\2\2\2\u02a5\23\3\2\2\2\u02a6\u02ac\5\u00d2j\2\u02a7\u02a8"+
		"\5\u00d2j\2\u02a8\u02a9\7O\2\2\u02a9\u02aa\5\u00e4s\2\u02aa\u02ac\3\2"+
		"\2\2\u02ab\u02a6\3\2\2\2\u02ab\u02a7\3\2\2\2\u02ac\25\3\2\2\2\u02ad\u02ae"+
		"\7`\2\2\u02ae\u02af\5\u015e\u00b0\2\u02af\u02b0\7Q\2\2\u02b0\u02b1\7\u0086"+
		"\2\2\u02b1\u02b2\7\u008d\2\2\u02b2\u02b5\5\u00ecw\2\u02b3\u02b4\7\u0090"+
		"\2\2\u02b4\u02b6\5\u00c2b\2\u02b5\u02b3\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6"+
		"\u02b7\3\2\2\2\u02b7\u02b8\7d\2\2\u02b8\u02b9\7\21\2\2\u02b9\u02ba\5\u0094"+
		"K\2\u02ba\u02bb\5\u0118\u008d\2\u02bb\u02bc\5\u0096L\2\u02bc\27\3\2\2"+
		"\2\u02bd\u02be\7`\2\2\u02be\u02bf\5\u00e0q\2\u02bf\u02c0\7Q\2\2\u02c0"+
		"\u02c1\7\u0093\2\2\u02c1\u02c2\7d\2\2\u02c2\u02c3\7\21\2\2\u02c3\u02c4"+
		"\5\u0094K\2\u02c4\u02c5\5\u0118\u008d\2\u02c5\u02c6\5\u0096L\2\u02c6\31"+
		"\3\2\2\2\u02c7\u02c8\7`\2\2\u02c8\u02c9\5\u00e0q\2\u02c9\u02cb\7Q\2\2"+
		"\u02ca\u02cc\7\177\2\2\u02cb\u02ca\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc\u02cd"+
		"\3\2\2\2\u02cd\u02ce\7\u0093\2\2\u02ce\u02cf\7d\2\2\u02cf\u02d0\7\21\2"+
		"\2\u02d0\u02d1\5\u0094K\2\u02d1\u02d2\5\u0110\u0089\2\u02d2\u02d3\5\u0096"+
		"L\2\u02d3\33\3\2\2\2\u02d4\u02d5\7`\2\2\u02d5\u02d6\5\u00e0q\2\u02d6\u02d7"+
		"\7Q\2\2\u02d7\u02d8\7s\2\2\u02d8\u02d9\7d\2\2\u02d9\u02da\7\21\2\2\u02da"+
		"\u02db\5\u0094K\2\u02db\u02dc\5\u0118\u008d\2\u02dc\u02dd\5\u0096L\2\u02dd"+
		"\35\3\2\2\2\u02de\u02df\7`\2\2\u02df\u02e0\5\u00e0q\2\u02e0\u02e2\7Q\2"+
		"\2\u02e1\u02e3\7\177\2\2\u02e2\u02e1\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3"+
		"\u02e4\3\2\2\2\u02e4\u02e5\7s\2\2\u02e5\u02e6\7d\2\2\u02e6\u02e7\7\21"+
		"\2\2\u02e7\u02e8\5\u0094K\2\u02e8\u02e9\5\u0110\u0089\2\u02e9\u02ea\5"+
		"\u0096L\2\u02ea\37\3\2\2\2\u02eb\u02ec\7`\2\2\u02ec\u02ed\5\u00e4s\2\u02ed"+
		"\u02ef\7Q\2\2\u02ee\u02f0\7\u0096\2\2\u02ef\u02ee\3\2\2\2\u02ef\u02f0"+
		"\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1\u02f2\7\177\2\2\u02f2\u02fa\7[\2\2"+
		"\u02f3\u02f4\5(\25\2\u02f4\u02f5\7\23\2\2\u02f5\u02f6\7O\2\2\u02f6\u02f7"+
		"\7V\2\2\u02f7\u02fb\3\2\2\2\u02f8\u02f9\7\u00a2\2\2\u02f9\u02fb\7V\2\2"+
		"\u02fa\u02f3\3\2\2\2\u02fa\u02f8\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\u02fd"+
		"\7\21\2\2\u02fd\u02fe\5\u0094K\2\u02fe\u02ff\5$\23\2\u02ff\u0308\5\u0096"+
		"L\2\u0300\u0301\5\u0090I\2\u0301\u0302\7O\2\2\u0302\u0303\7|\2\2\u0303"+
		"\u0304\7\21\2\2\u0304\u0305\5\u0094K\2\u0305\u0306\5\u00fa~\2\u0306\u0307"+
		"\5\u0096L\2\u0307\u0309\3\2\2\2\u0308\u0300\3\2\2\2\u0308\u0309\3\2\2"+
		"\2\u0309!\3\2\2\2\u030a\u030b\7`\2\2\u030b\u030c\5\u00e4s\2\u030c\u030e"+
		"\7Q\2\2\u030d\u030f\7\u0096\2\2\u030e\u030d\3\2\2\2\u030e\u030f\3\2\2"+
		"\2\u030f\u0310\3\2\2\2\u0310\u0311\7\177\2\2\u0311\u0319\7\u008e\2\2\u0312"+
		"\u0313\5(\25\2\u0313\u0314\7\23\2\2\u0314\u0315\7O\2\2\u0315\u0316\7V"+
		"\2\2\u0316\u031a\3\2\2\2\u0317\u0318\7\u00a2\2\2\u0318\u031a\7V\2\2\u0319"+
		"\u0312\3\2\2\2\u0319\u0317\3\2\2\2\u031a\u031b\3\2\2\2\u031b\u031c\7\21"+
		"\2\2\u031c\u031d\5\u0094K\2\u031d\u031e\5$\23\2\u031e\u0327\5\u0096L\2"+
		"\u031f\u0320\5\u0090I\2\u0320\u0321\7O\2\2\u0321\u0322\7|\2\2\u0322\u0323"+
		"\7\21\2\2\u0323\u0324\5\u0094K\2\u0324\u0325\5\u00fa~\2\u0325\u0326\5"+
		"\u0096L\2\u0326\u0328\3\2\2\2\u0327\u031f\3\2\2\2\u0327\u0328\3\2\2\2"+
		"\u0328#\3\2\2\2\u0329\u032a\7`\2\2\u032a\u032b\7[\2\2\u032b\u032c\7V\2"+
		"\2\u032c\u032d\7Q\2\2\u032d\u032e\7\21\2\2\u032e\u032f\5\u0094K\2\u032f"+
		"\u0330\5&\24\2\u0330\u0331\5\u0096L\2\u0331%\3\2\2\2\u0332\u0333\b\24"+
		"\1\2\u0333\u0334\5\u00fe\u0080\2\u0334\u033b\3\2\2\2\u0335\u0336\f\3\2"+
		"\2\u0336\u0337\5\u0090I\2\u0337\u0338\5\u00fe\u0080\2\u0338\u033a\3\2"+
		"\2\2\u0339\u0335\3\2\2\2\u033a\u033d\3\2\2\2\u033b\u0339\3\2\2\2\u033b"+
		"\u033c\3\2\2\2\u033c\'\3\2\2\2\u033d\u033b\3\2\2\2\u033e\u033f\7\u00a2"+
		"\2\2\u033f\u0340\7T\2\2\u0340\u0349\5\u00e2r\2\u0341\u0342\7\u00a2\2\2"+
		"\u0342\u0343\7U\2\2\u0343\u0346\5\u010a\u0086\2\u0344\u0345\7O\2\2\u0345"+
		"\u0347\5\u00e2r\2\u0346\u0344\3\2\2\2\u0346\u0347\3\2\2\2\u0347\u0349"+
		"\3\2\2\2\u0348\u033e\3\2\2\2\u0348\u0341\3\2\2\2\u0349)\3\2\2\2\u034a"+
		"\u034b\7`\2\2\u034b\u034c\5\u00d4k\2\u034c\u034d\7Q\2\2\u034d\u034e\7"+
		"L\2\2\u034e\u0351\7{\2\2\u034f\u0350\7\u008d\2\2\u0350\u0352\5\64\33\2"+
		"\u0351\u034f\3\2\2\2\u0351\u0352\3\2\2\2\u0352\u0358\3\2\2\2\u0353\u0355"+
		"\7\u0090\2\2\u0354\u0356\7~\2\2\u0355\u0354\3\2\2\2\u0355\u0356\3\2\2"+
		"\2\u0356\u0357\3\2\2\2\u0357\u0359\5\u00c2b\2\u0358\u0353\3\2\2\2\u0358"+
		"\u0359\3\2\2\2\u0359+\3\2\2\2\u035a\u035b\7`\2\2\u035b\u035c\5\u00d4k"+
		"\2\u035c\u035d\7Q\2\2\u035d\u0360\7{\2\2\u035e\u035f\7\u008d\2\2\u035f"+
		"\u0361\5\64\33\2\u0360\u035e\3\2\2\2\u0360\u0361\3\2\2\2\u0361\u0367\3"+
		"\2\2\2\u0362\u0364\7\u0090\2\2\u0363\u0365\7~\2\2\u0364\u0363\3\2\2\2"+
		"\u0364\u0365\3\2\2\2\u0365\u0366\3\2\2\2\u0366\u0368\5\u00c2b\2\u0367"+
		"\u0362\3\2\2\2\u0367\u0368\3\2\2\2\u0368\u0369\3\2\2\2\u0369\u036a\7d"+
		"\2\2\u036a\u036b\7\21\2\2\u036b\u036e\5\u0094K\2\u036c\u036f\5\u0118\u008d"+
		"\2\u036d\u036f\7\u008a\2\2\u036e\u036c\3\2\2\2\u036e\u036d\3\2\2\2\u036f"+
		"\u0370\3\2\2\2\u0370\u0371\5\u0096L\2\u0371-\3\2\2\2\u0372\u0373\7`\2"+
		"\2\u0373\u0374\5\u00d4k\2\u0374\u0376\7Q\2\2\u0375\u0377\7\177\2\2\u0376"+
		"\u0375\3\2\2\2\u0376\u0377\3\2\2\2\u0377\u0378\3\2\2\2\u0378\u037b\7{"+
		"\2\2\u0379\u037a\7\u008d\2\2\u037a\u037c\5\64\33\2\u037b\u0379\3\2\2\2"+
		"\u037b\u037c\3\2\2\2\u037c\u037f\3\2\2\2\u037d\u037e\7\u0090\2\2\u037e"+
		"\u0380\5\u00f2z\2\u037f\u037d\3\2\2\2\u037f\u0380\3\2\2\2\u0380\u0381"+
		"\3\2\2\2\u0381\u0382\7d\2\2\u0382\u0383\7\21\2\2\u0383\u0384\5\u0094K"+
		"\2\u0384\u0385\5\u0110\u0089\2\u0385\u0386\5\u0096L\2\u0386/\3\2\2\2\u0387"+
		"\u0388\7`\2\2\u0388\u0389\7\u00b1\2\2\u0389\u038a\7Q\2\2\u038a\u038b\7"+
		"\u009a\2\2\u038b\u038c\7{\2\2\u038c\u038d\7d\2\2\u038d\u038e\7\21\2\2"+
		"\u038e\u038f\5\u0094K\2\u038f\u0390\5\u0118\u008d\2\u0390\u0391\5\u0096"+
		"L\2\u0391\u0392\5\u0090I\2\u0392\u0393\7O\2\2\u0393\u039a\7\u00a0\2\2"+
		"\u0394\u0395\7\21\2\2\u0395\u0396\5\u0094K\2\u0396\u0397\5\u011a\u008e"+
		"\2\u0397\u0398\5\u0096L\2\u0398\u039b\3\2\2\2\u0399\u039b\5\u00e6t\2\u039a"+
		"\u0394\3\2\2\2\u039a\u0399\3\2\2\2\u039b\61\3\2\2\2\u039c\u039d\5\\/\2"+
		"\u039d\63\3\2\2\2\u039e\u03a1\5\u00e8u\2\u039f\u03a0\7O\2\2\u03a0\u03a2"+
		"\5\u00eav\2\u03a1\u039f\3\2\2\2\u03a1\u03a2\3\2\2\2\u03a2\65\3\2\2\2\u03a3"+
		"\u03a4\5\u00f2z\2\u03a4\u03a6\5\u00e0q\2\u03a5\u03a7\5(\25\2\u03a6\u03a5"+
		"\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7\u03aa\3\2\2\2\u03a8\u03a9\7/\2\2\u03a9"+
		"\u03ab\5\u012c\u0097\2\u03aa\u03a8\3\2\2\2\u03aa\u03ab\3\2\2\2\u03ab\67"+
		"\3\2\2\2\u03ac\u03c2\5\u0088E\2\u03ad\u03c2\5> \2\u03ae\u03c2\5\u008c"+
		"G\2\u03af\u03c2\5<\37\2\u03b0\u03c2\5|?\2\u03b1\u03c2\5~@\2\u03b2\u03c2"+
		"\5:\36\2\u03b3\u03c2\5X-\2\u03b4\u03c2\5Z.\2\u03b5\u03c2\5N(\2\u03b6\u03c2"+
		"\5D#\2\u03b7\u03c2\5H%\2\u03b8\u03c2\5L\'\2\u03b9\u03c2\5J&\2\u03ba\u03c2"+
		"\5R*\2\u03bb\u03c2\5T+\2\u03bc\u03c2\5t;\2\u03bd\u03c2\5@!\2\u03be\u03c2"+
		"\5B\"\2\u03bf\u03c2\5,\27\2\u03c0\u03c2\5\u010e\u0088\2\u03c1\u03ac\3"+
		"\2\2\2\u03c1\u03ad\3\2\2\2\u03c1\u03ae\3\2\2\2\u03c1\u03af\3\2\2\2\u03c1"+
		"\u03b0\3\2\2\2\u03c1\u03b1\3\2\2\2\u03c1\u03b2\3\2\2\2\u03c1\u03b3\3\2"+
		"\2\2\u03c1\u03b4\3\2\2\2\u03c1\u03b5\3\2\2\2\u03c1\u03b6\3\2\2\2\u03c1"+
		"\u03b7\3\2\2\2\u03c1\u03b8\3\2\2\2\u03c1\u03b9\3\2\2\2\u03c1\u03ba\3\2"+
		"\2\2\u03c1\u03bb\3\2\2\2\u03c1\u03bc\3\2\2\2\u03c1\u03bd\3\2\2\2\u03c1"+
		"\u03be\3\2\2\2\u03c1\u03bf\3\2\2\2\u03c1\u03c0\3\2\2\2\u03c29\3\2\2\2"+
		"\u03c3\u03c4\7p\2\2\u03c4;\3\2\2\2\u03c5\u03c6\7a\2\2\u03c6\u03ca\5\u00be"+
		"`\2\u03c7\u03c8\7O\2\2\u03c8\u03c9\7\u0097\2\2\u03c9\u03cb\5\u00be`\2"+
		"\u03ca\u03c7\3\2\2\2\u03ca\u03cb\3\2\2\2\u03cb\u03cf\3\2\2\2\u03cc\u03cd"+
		"\7\u0097\2\2\u03cd\u03cf\5\u00be`\2\u03ce\u03c5\3\2\2\2\u03ce\u03cc\3"+
		"\2\2\2\u03cf\u03d6\3\2\2\2\u03d0\u03d1\7\u009b\2\2\u03d1\u03d2\7\21\2"+
		"\2\u03d2\u03d3\5\u0094K\2\u03d3\u03d4\5\u0118\u008d\2\u03d4\u03d5\5\u0096"+
		"L\2\u03d5\u03d7\3\2\2\2\u03d6\u03d0\3\2\2\2\u03d6\u03d7\3\2\2\2\u03d7"+
		"=\3\2\2\2\u03d8\u03db\5h\65\2\u03d9\u03db\5^\60\2\u03da\u03d8\3\2\2\2"+
		"\u03da\u03d9\3\2\2\2\u03db\u03dd\3\2\2\2\u03dc\u03de\5\u0082B\2\u03dd"+
		"\u03dc\3\2\2\2\u03dd\u03de\3\2\2\2\u03de\u03e9\3\2\2\2\u03df\u03e2\7\u009b"+
		"\2\2\u03e0\u03e1\7\u00a2\2\2\u03e1\u03e3\5\u00e0q\2\u03e2\u03e0\3\2\2"+
		"\2\u03e2\u03e3\3\2\2\2\u03e3\u03e4\3\2\2\2\u03e4\u03e5\7\21\2\2\u03e5"+
		"\u03e6\5\u0094K\2\u03e6\u03e7\5\u0118\u008d\2\u03e7\u03e8\5\u0096L\2\u03e8"+
		"\u03ea\3\2\2\2\u03e9\u03df\3\2\2\2\u03e9\u03ea\3\2\2\2\u03ea\u03ed\3\2"+
		"\2\2\u03eb\u03ed\5b\62\2\u03ec\u03da\3\2\2\2\u03ec\u03eb\3\2\2\2\u03ed"+
		"?\3\2\2\2\u03ee\u03ef\7\u00a2\2\2\u03ef\u03f0\5\u0146\u00a4\2\u03f0\u03f1"+
		"\7\23\2\2\u03f1\u03f2\7c\2\2\u03f2\u03f3\7\21\2\2\u03f3\u03f4\5\u0094"+
		"K\2\u03f4\u03f5\5\u0118\u008d\2\u03f5\u03f6\5\u0096L\2\u03f6A\3\2\2\2"+
		"\u03f7\u03f8\7\u00a2\2\2\u03f8\u03f9\5\u00e4s\2\u03f9\u03fa\7\23\2\2\u03fa"+
		"\u03fb\7c\2\2\u03fb\u03fc\7\21\2\2\u03fc\u03fd\5\u0094K\2\u03fd\u03fe"+
		"\5\u0118\u008d\2\u03fe\u03ff\5\u0096L\2\u03ffC\3\2\2\2\u0400\u0401\7\u0099"+
		"\2\2\u0401\u0402\7\u0084\2\2\u0402\u0403\5\\/\2\u0403\u0404\7\21\2\2\u0404"+
		"\u0405\5\u0094K\2\u0405\u040d\5\u011c\u008f\2\u0406\u0407\5\u0090I\2\u0407"+
		"\u0408\7\u0089\2\2\u0408\u0409\7\21\2\2\u0409\u040a\5\u0094K\2\u040a\u040b"+
		"\5\u0118\u008d\2\u040b\u040c\5\u0096L\2\u040c\u040e\3\2\2\2\u040d\u0406"+
		"\3\2\2\2\u040d\u040e\3\2\2\2\u040e\u040f\3\2\2\2\u040f\u0410\5\u0096L"+
		"\2\u0410E\3\2\2\2\u0411\u0412\7\u00a3\2\2\u0412\u0413\5\u0122\u0092\2"+
		"\u0413\u0414\7\21\2\2\u0414\u0415\5\u0094K\2\u0415\u0416\5\u0118\u008d"+
		"\2\u0416\u0417\5\u0096L\2\u0417\u0421\3\2\2\2\u0418\u0419\7\u00a3\2\2"+
		"\u0419\u041a\7v\2\2\u041a\u041b\5\u0120\u0091\2\u041b\u041c\7\21\2\2\u041c"+
		"\u041d\5\u0094K\2\u041d\u041e\5\u0118\u008d\2\u041e\u041f\5\u0096L\2\u041f"+
		"\u0421\3\2\2\2\u0420\u0411\3\2\2\2\u0420\u0418\3\2\2\2\u0421G\3\2\2\2"+
		"\u0422\u0423\7q\2\2\u0423\u0424\7e\2\2\u0424\u0427\5\u00e0q\2\u0425\u0426"+
		"\7\23\2\2\u0426\u0428\5\u00e0q\2\u0427\u0425\3\2\2\2\u0427\u0428\3\2\2"+
		"\2\u0428\u0429\3\2\2\2\u0429\u042a\7v\2\2\u042a\u042b\5\\/\2\u042b\u042c"+
		"\7\21\2\2\u042c\u042d\5\u0094K\2\u042d\u042e\5\u0118\u008d\2\u042e\u042f"+
		"\5\u0096L\2\u042fI\3\2\2\2\u0430\u0431\7c\2\2\u0431\u0432\7\21\2\2\u0432"+
		"\u0433\5\u0094K\2\u0433\u0434\5\u0118\u008d\2\u0434\u0435\5\u0096L\2\u0435"+
		"\u0436\5\u0090I\2\u0436\u0437\7\u00a5\2\2\u0437\u0438\5\\/\2\u0438K\3"+
		"\2\2\2\u0439\u043a\7\u00a5\2\2\u043a\u043b\5\\/\2\u043b\u043c\7\21\2\2"+
		"\u043c\u043d\5\u0094K\2\u043d\u043e\5\u0118\u008d\2\u043e\u043f\5\u0096"+
		"L\2\u043fM\3\2\2\2\u0440\u0441\7u\2\2\u0441\u0442\5\\/\2\u0442\u0443\7"+
		"\21\2\2\u0443\u0444\5\u0094K\2\u0444\u0445\5\u0118\u008d\2\u0445\u0449"+
		"\5\u0096L\2\u0446\u0447\5\u0090I\2\u0447\u0448\5P)\2\u0448\u044a\3\2\2"+
		"\2\u0449\u0446\3\2\2\2\u0449\u044a\3\2\2\2\u044a\u0452\3\2\2\2\u044b\u044c"+
		"\5\u0090I\2\u044c\u044d\7f\2\2\u044d\u044e\7\21\2\2\u044e\u044f\5\u0094"+
		"K\2\u044f\u0450\5\u0118\u008d\2\u0450\u0451\5\u0096L\2\u0451\u0453\3\2"+
		"\2\2\u0452\u044b\3\2\2\2\u0452\u0453\3\2\2\2\u0453O\3\2\2\2\u0454\u0455"+
		"\b)\1\2\u0455\u0456\7f\2\2\u0456\u0457\7u\2\2\u0457\u0458\5\\/\2\u0458"+
		"\u0459\7\21\2\2\u0459\u045a\5\u0094K\2\u045a\u045b\5\u0118\u008d\2\u045b"+
		"\u045c\5\u0096L\2\u045c\u0469\3\2\2\2\u045d\u045e\f\3\2\2\u045e\u045f"+
		"\5\u0090I\2\u045f\u0460\7f\2\2\u0460\u0461\7u\2\2\u0461\u0462\5\\/\2\u0462"+
		"\u0463\7\21\2\2\u0463\u0464\5\u0094K\2\u0464\u0465\5\u0118\u008d\2\u0465"+
		"\u0466\5\u0096L\2\u0466\u0468\3\2\2\2\u0467\u045d\3\2\2\2\u0468\u046b"+
		"\3\2\2\2\u0469\u0467\3\2\2\2\u0469\u046a\3\2\2\2\u046aQ\3\2\2\2\u046b"+
		"\u0469\3\2\2\2\u046c\u046d\7\u008b\2\2\u046d\u046e\5\\/\2\u046eS\3\2\2"+
		"\2\u046f\u0470\7\u0099\2\2\u0470\u0471\7\u0084\2\2\u0471\u0472\5\u00e0"+
		"q\2\u0472\u0473\7d\2\2\u0473\u0474\7\21\2\2\u0474\u0475\5\u0094K\2\u0475"+
		"\u0476\5\u0118\u008d\2\u0476\u0477\5\u0096L\2\u0477\u0479\5\u008eH\2\u0478"+
		"\u047a\5\u011e\u0090\2\u0479\u0478\3\2\2\2\u0479\u047a\3\2\2\2\u047a\u0486"+
		"\3\2\2\2\u047b\u047f\7\u0089\2\2\u047c\u047d\7\u00a3\2\2\u047d\u047f\7"+
		"P\2\2\u047e\u047b\3\2\2\2\u047e\u047c\3\2\2\2\u047f\u0480\3\2\2\2\u0480"+
		"\u0481\7\21\2\2\u0481\u0482\5\u0094K\2\u0482\u0483\5\u0118\u008d\2\u0483"+
		"\u0484\5\u0096L\2\u0484\u0485\5\u008eH\2\u0485\u0487\3\2\2\2\u0486\u047e"+
		"\3\2\2\2\u0486\u0487\3\2\2\2\u0487\u048f\3\2\2\2\u0488\u0489\7N\2\2\u0489"+
		"\u048a\7\21\2\2\u048a\u048b\5\u0094K\2\u048b\u048c\5\u0118\u008d\2\u048c"+
		"\u048d\5\u0096L\2\u048d\u048e\5\u008eH\2\u048e\u0490\3\2\2\2\u048f\u0488"+
		"\3\2\2\2\u048f\u0490\3\2\2\2\u0490\u0491\3\2\2\2\u0491\u0492\5\u008eH"+
		"\2\u0492U\3\2\2\2\u0493\u0494\7\u00a3\2\2\u0494\u0495\5\u00e6t\2\u0495"+
		"\u0496\7\21\2\2\u0496\u0497\5\u0094K\2\u0497\u0498\5\u0118\u008d\2\u0498"+
		"\u0499\5\u0096L\2\u0499\u049a\5\u008eH\2\u049a\u04a7\3\2\2\2\u049b\u049c"+
		"\7\u00a3\2\2\u049c\u049d\7v\2\2\u049d\u049e\7\30\2\2\u049e\u049f\5\u00b6"+
		"\\\2\u049f\u04a0\7\31\2\2\u04a0\u04a1\7\21\2\2\u04a1\u04a2\5\u0094K\2"+
		"\u04a2\u04a3\5\u0118\u008d\2\u04a3\u04a4\5\u0096L\2\u04a4\u04a5\5\u008e"+
		"H\2\u04a5\u04a7\3\2\2\2\u04a6\u0493\3\2\2\2\u04a6\u049b\3\2\2\2\u04a7"+
		"W\3\2\2\2\u04a8\u04a9\7W\2\2\u04a9Y\3\2\2\2\u04aa\u04ac\7\u008f\2\2\u04ab"+
		"\u04ad\5\\/\2\u04ac\u04ab\3\2\2\2\u04ac\u04ad\3\2\2\2\u04ad[\3\2\2\2\u04ae"+
		"\u04af\b/\1\2\u04af\u04d2\5\u0200\u0101\2\u04b0\u04d2\5\u01e0\u00f1\2"+
		"\u04b1\u04d2\5h\65\2\u04b2\u04d2\5\u014c\u00a7\2\u04b3\u04d2\5^\60\2\u04b4"+
		"\u04b7\5h\65\2\u04b5\u04b7\5^\60\2\u04b6\u04b4\3\2\2\2\u04b6\u04b5\3\2"+
		"\2\2\u04b7\u04b8\3\2\2\2\u04b8\u04b9\5\u0082B\2\u04b9\u04d2\3\2\2\2\u04ba"+
		"\u04d2\5r:\2\u04bb\u04bc\7#\2\2\u04bc\u04d2\5\\//\u04bd\u04be\7\u0081"+
		"\2\2\u04be\u04d2\5\\/.\u04bf\u04c0\7C\2\2\u04c0\u04c1\7\21\2\2\u04c1\u04d2"+
		"\5\\/\21\u04c2\u04c3\7j\2\2\u04c3\u04c4\7\21\2\2\u04c4\u04d2\5\u00e0q"+
		"\2\u04c5\u04c6\7B\2\2\u04c6\u04d2\5\u00d4k\2\u04c7\u04d2\5p9\2\u04c8\u04d2"+
		"\5n8\2\u04c9\u04d2\5l\67\2\u04ca\u04d2\5z>\2\u04cb\u04d2\5\u0154\u00ab"+
		"\2\u04cc\u04d2\5\u0156\u00ac\2\u04cd\u04d2\5\u0158\u00ad\2\u04ce\u04d2"+
		"\5\u0080A\2\u04cf\u04d2\5v<\2\u04d0\u04d2\5b\62\2\u04d1\u04ae\3\2\2\2"+
		"\u04d1\u04b0\3\2\2\2\u04d1\u04b1\3\2\2\2\u04d1\u04b2\3\2\2\2\u04d1\u04b3"+
		"\3\2\2\2\u04d1\u04b6\3\2\2\2\u04d1\u04ba\3\2\2\2\u04d1\u04bb\3\2\2\2\u04d1"+
		"\u04bd\3\2\2\2\u04d1\u04bf\3\2\2\2\u04d1\u04c2\3\2\2\2\u04d1\u04c5\3\2"+
		"\2\2\u04d1\u04c7\3\2\2\2\u04d1\u04c8\3\2\2\2\u04d1\u04c9\3\2\2\2\u04d1"+
		"\u04ca\3\2\2\2\u04d1\u04cb\3\2\2\2\u04d1\u04cc\3\2\2\2\u04d1\u04cd\3\2"+
		"\2\2\u04d1\u04ce\3\2\2\2\u04d1\u04cf\3\2\2\2\u04d1\u04d0\3\2\2\2\u04d2"+
		"\u0546\3\2\2\2\u04d3\u04d4\f-\2\2\u04d4\u04d5\5\u016e\u00b8\2\u04d5\u04d6"+
		"\5\\/.\u04d6\u0545\3\2\2\2\u04d7\u04d8\f,\2\2\u04d8\u04d9\5\u0170\u00b9"+
		"\2\u04d9\u04da\5\\/-\u04da\u0545\3\2\2\2\u04db\u04dc\f+\2\2\u04dc\u04dd"+
		"\5\u0174\u00bb\2\u04dd\u04de\5\\/,\u04de\u0545\3\2\2\2\u04df\u04e0\f*"+
		"\2\2\u04e0\u04e1\5\u0172\u00ba\2\u04e1\u04e2\5\\/+\u04e2\u0545\3\2\2\2"+
		"\u04e3\u04e4\f)\2\2\u04e4\u04e5\t\2\2\2\u04e5\u0545\5\\/*\u04e6\u04e7"+
		"\f\'\2\2\u04e7\u04e8\7+\2\2\u04e8\u0545\5\\/(\u04e9\u04ea\f&\2\2\u04ea"+
		"\u04eb\7,\2\2\u04eb\u0545\5\\/\'\u04ec\u04ed\f%\2\2\u04ed\u04ee\7)\2\2"+
		"\u04ee\u0545\5\\/&\u04ef\u04f0\f$\2\2\u04f0\u04f1\7*\2\2\u04f1\u0545\5"+
		"\\/%\u04f2\u04f3\f!\2\2\u04f3\u04f4\7/\2\2\u04f4\u0545\5\\/\"\u04f5\u04f6"+
		"\f \2\2\u04f6\u04f7\7-\2\2\u04f7\u0545\5\\/!\u04f8\u04f9\f\37\2\2\u04f9"+
		"\u04fa\7\63\2\2\u04fa\u0545\5\\/ \u04fb\u04fc\f\36\2\2\u04fc\u04fd\7]"+
		"\2\2\u04fd\u0545\5\\/\37\u04fe\u04ff\f\35\2\2\u04ff\u0500\7v\2\2\u0500"+
		"\u0545\5\\/\36\u0501\u0502\f\34\2\2\u0502\u0503\7t\2\2\u0503\u0545\5\\"+
		"/\35\u0504\u0505\f\33\2\2\u0505\u0506\7t\2\2\u0506\u0507\7M\2\2\u0507"+
		"\u0545\5\\/\34\u0508\u0509\f\32\2\2\u0509\u050a\7t\2\2\u050a\u050b\7P"+
		"\2\2\u050b\u0545\5\\/\33\u050c\u050d\f\31\2\2\u050d\u050e\7\u0081\2\2"+
		"\u050e\u050f\7]\2\2\u050f\u0545\5\\/\32\u0510\u0511\f\30\2\2\u0511\u0512"+
		"\7\u0081\2\2\u0512\u0513\7v\2\2\u0513\u0545\5\\/\31\u0514\u0515\f\27\2"+
		"\2\u0515\u0516\7\u0081\2\2\u0516\u0517\7t\2\2\u0517\u0545\5\\/\30\u0518"+
		"\u0519\f\26\2\2\u0519\u051a\7\u0081\2\2\u051a\u051b\7t\2\2\u051b\u051c"+
		"\7M\2\2\u051c\u0545\5\\/\27\u051d\u051e\f\25\2\2\u051e\u051f\7\u0081\2"+
		"\2\u051f\u0520\7t\2\2\u0520\u0521\7P\2\2\u0521\u0545\5\\/\26\u0522\u0523"+
		"\f\24\2\2\u0523\u0524\7\u0087\2\2\u0524\u0545\5\\/\25\u0525\u0526\f\23"+
		"\2\2\u0526\u0527\7O\2\2\u0527\u0545\5\\/\24\u0528\u0529\f\22\2\2\u0529"+
		"\u052a\7u\2\2\u052a\u052b\5\\/\2\u052b\u052c\7f\2\2\u052c\u052d\5\\/\23"+
		"\u052d\u0545\3\2\2\2\u052e\u052f\f\3\2\2\u052f\u0530\7q\2\2\u0530\u0531"+
		"\7e\2\2\u0531\u0532\5\u00e0q\2\u0532\u0533\7v\2\2\u0533\u0534\5\\/\4\u0534"+
		"\u0545\3\2\2\2\u0535\u0536\f(\2\2\u0536\u0538\7Q\2\2\u0537\u0539\7~\2"+
		"\2\u0538\u0537\3\2\2\2\u0538\u0539\3\2\2\2\u0539\u053a\3\2\2\2\u053a\u0545"+
		"\5\u00f2z\2\u053b\u053c\f#\2\2\u053c\u053d\7y\2\2\u053d\u053e\7\u0081"+
		"\2\2\u053e\u0545\5\u014a\u00a6\2\u053f\u0540\f\"\2\2\u0540\u0541\7y\2"+
		"\2\u0541\u0545\5\u014a\u00a6\2\u0542\u0543\f\13\2\2\u0543\u0545\5x=\2"+
		"\u0544\u04d3\3\2\2\2\u0544\u04d7\3\2\2\2\u0544\u04db\3\2\2\2\u0544\u04df"+
		"\3\2\2\2\u0544\u04e3\3\2\2\2\u0544\u04e6\3\2\2\2\u0544\u04e9\3\2\2\2\u0544"+
		"\u04ec\3\2\2\2\u0544\u04ef\3\2\2\2\u0544\u04f2\3\2\2\2\u0544\u04f5\3\2"+
		"\2\2\u0544\u04f8\3\2\2\2\u0544\u04fb\3\2\2\2\u0544\u04fe\3\2\2\2\u0544"+
		"\u0501\3\2\2\2\u0544\u0504\3\2\2\2\u0544\u0508\3\2\2\2\u0544\u050c\3\2"+
		"\2\2\u0544\u0510\3\2\2\2\u0544\u0514\3\2\2\2\u0544\u0518\3\2\2\2\u0544"+
		"\u051d\3\2\2\2\u0544\u0522\3\2\2\2\u0544\u0525\3\2\2\2\u0544\u0528\3\2"+
		"\2\2\u0544\u052e\3\2\2\2\u0544\u0535\3\2\2\2\u0544\u053b\3\2\2\2\u0544"+
		"\u053f\3\2\2\2\u0544\u0542\3\2\2\2\u0545\u0548\3\2\2\2\u0546\u0544\3\2"+
		"\2\2\u0546\u0547\3\2\2\2\u0547]\3\2\2\2\u0548\u0546\3\2\2\2\u0549\u054a"+
		"\b\60\1\2\u054a\u054b\5\u00dco\2\u054b\u0550\3\2\2\2\u054c\u054d\f\3\2"+
		"\2\u054d\u054f\5`\61\2\u054e\u054c\3\2\2\2\u054f\u0552\3\2\2\2\u0550\u054e"+
		"\3\2\2\2\u0550\u0551\3\2\2\2\u0551_\3\2\2\2\u0552\u0550\3\2\2\2\u0553"+
		"\u0554\6\61#\3\u0554\u0555\7\25\2\2\u0555\u0556\5\u00dco\2\u0556a\3\2"+
		"\2\2\u0557\u0558\7x\2\2\u0558\u0559\5\u00e0q\2\u0559\u055a\5d\63\2\u055a"+
		"c\3\2\2\2\u055b\u055c\6\63$\3\u055ce\3\2\2\2\u055d\u0563\5\u012a\u0096"+
		"\2\u055e\u0563\5\u012c\u0097\2\u055f\u0563\5\u00dco\2\u0560\u0563\5\u0126"+
		"\u0094\2\u0561\u0563\5\u0128\u0095\2\u0562\u055d\3\2\2\2\u0562\u055e\3"+
		"\2\2\2\u0562\u055f\3\2\2\2\u0562\u0560\3\2\2\2\u0562\u0561\3\2\2\2\u0563"+
		"g\3\2\2\2\u0564\u0565\b\65\1\2\u0565\u0566\5f\64\2\u0566\u056b\3\2\2\2"+
		"\u0567\u0568\f\3\2\2\u0568\u056a\5j\66\2\u0569\u0567\3\2\2\2\u056a\u056d"+
		"\3\2\2\2\u056b\u0569\3\2\2\2\u056b\u056c\3\2\2\2\u056ci\3\2\2\2\u056d"+
		"\u056b\3\2\2\2\u056e\u056f\6\66&\3\u056f\u0570\7\25\2\2\u0570\u057c\5"+
		"\u00dep\2\u0571\u0572\6\66\'\3\u0572\u0573\7\30\2\2\u0573\u0574\5\u0144"+
		"\u00a3\2\u0574\u0575\7\31\2\2\u0575\u057c\3\2\2\2\u0576\u0577\6\66(\3"+
		"\u0577\u0578\7\30\2\2\u0578\u0579\5\\/\2\u0579\u057a\7\31\2\2\u057a\u057c"+
		"\3\2\2\2\u057b\u056e\3\2\2\2\u057b\u0571\3\2\2\2\u057b\u0576\3\2\2\2\u057c"+
		"k\3\2\2\2\u057d\u057e\b\67\1\2\u057e\u057f\7~\2\2\u057f\u0580\5\u00dc"+
		"o\2\u0580\u0585\3\2\2\2\u0581\u0582\f\3\2\2\u0582\u0584\5j\66\2\u0583"+
		"\u0581\3\2\2\2\u0584\u0587\3\2\2\2\u0585\u0583\3\2\2\2\u0585\u0586\3\2"+
		"\2\2\u0586m\3\2\2\2\u0587\u0585\3\2\2\2\u0588\u058b\7D\2\2\u0589\u058a"+
		"\7r\2\2\u058a\u058c\5\\/\2\u058b\u0589\3\2\2\2\u058b\u058c\3\2\2\2\u058c"+
		"o\3\2\2\2\u058d\u058e\7E\2\2\u058e\u058f\7r\2\2\u058f\u0590\5\\/\2\u0590"+
		"q\3\2\2\2\u0591\u0592\5\u00caf\2\u0592\u0593\7r\2\2\u0593\u059c\5\\/\2"+
		"\u0594\u0596\7\23\2\2\u0595\u0594\3\2\2\2\u0595\u0596\3\2\2\2\u0596\u0597"+
		"\3\2\2\2\u0597\u059a\5\u0084C\2\u0598\u0599\7O\2\2\u0599\u059b\5\u0086"+
		"D\2\u059a\u0598\3\2\2\2\u059a\u059b\3\2\2\2\u059b\u059d\3\2\2\2\u059c"+
		"\u0595\3\2\2\2\u059c\u059d\3\2\2\2\u059d\u05a7\3\2\2\2\u059e\u05a4\5\u00ca"+
		"f\2\u059f\u05a2\5\u0084C\2\u05a0\u05a1\7O\2\2\u05a1\u05a3\5\u0086D\2\u05a2"+
		"\u05a0\3\2\2\2\u05a2\u05a3\3\2\2\2\u05a3\u05a5\3\2\2\2\u05a4\u059f\3\2"+
		"\2\2\u05a4\u05a5\3\2\2\2\u05a5\u05a7\3\2\2\2\u05a6\u0591\3\2\2\2\u05a6"+
		"\u059e\3\2\2\2\u05a7s\3\2\2\2\u05a8\u05a9\7\u00a6\2\2\u05a9\u05aa\5\\"+
		"/\2\u05aa\u05ab\7\u009e\2\2\u05ab\u05ac\5\\/\2\u05acu\3\2\2\2\u05ad\u05ae"+
		"\5^\60\2\u05ae\u05af\7#\2\2\u05af\u05b0\5\\/\2\u05b0w\3\2\2\2\u05b1\u05b4"+
		"\7n\2\2\u05b2\u05b3\7\u00a2\2\2\u05b3\u05b5\5\u00e0q\2\u05b4\u05b2\3\2"+
		"\2\2\u05b4\u05b5\3\2\2\2\u05b5\u05b6\3\2\2\2\u05b6\u05b7\7\u00a4\2\2\u05b7"+
		"\u05b8\5\\/\2\u05b8y\3\2\2\2\u05b9\u05ba\7m\2\2\u05ba\u05bc\7\u0085\2"+
		"\2\u05bb\u05bd\5\u00caf\2\u05bc\u05bb\3\2\2\2\u05bc\u05bd\3\2\2\2\u05bd"+
		"\u05be\3\2\2\2\u05be\u05bf\7\u00a4\2\2\u05bf\u05de\5\\/\2\u05c0\u05d2"+
		"\7m\2\2\u05c1\u05c3\7M\2\2\u05c2\u05c4\5\u00caf\2\u05c3\u05c2\3\2\2\2"+
		"\u05c3\u05c4\3\2\2\2\u05c4\u05d3\3\2\2\2\u05c5\u05c7\5\u00caf\2\u05c6"+
		"\u05c8\7\u0091\2\2\u05c7\u05c6\3\2\2\2\u05c7\u05c8\3\2\2\2\u05c8\u05c9"+
		"\3\2\2\2\u05c9\u05ca\5\\/\2\u05ca\u05cb\7\u009e\2\2\u05cb\u05cc\5\\/\2"+
		"\u05cc\u05d3\3\2\2\2\u05cd\u05ce\7\u0091\2\2\u05ce\u05cf\5\\/\2\u05cf"+
		"\u05d0\7\u009e\2\2\u05d0\u05d1\5\\/\2\u05d1\u05d3\3\2\2\2\u05d2\u05c1"+
		"\3\2\2\2\u05d2\u05c5\3\2\2\2\u05d2\u05cd\3\2\2\2\u05d3\u05d6\3\2\2\2\u05d4"+
		"\u05d5\7\u00a4\2\2\u05d5\u05d7\5\\/\2\u05d6\u05d4\3\2\2\2\u05d6\u05d7"+
		"\3\2\2\2\u05d7\u05db\3\2\2\2\u05d8\u05d9\7\u0088\2\2\u05d9\u05da\7X\2"+
		"\2\u05da\u05dc\5\u015a\u00ae\2\u05db\u05d8\3\2\2\2\u05db\u05dc\3\2\2\2"+
		"\u05dc\u05de\3\2\2\2\u05dd\u05b9\3\2\2\2\u05dd\u05c0\3\2\2\2\u05de{\3"+
		"\2\2\2\u05df\u05e0\7m\2\2\u05e0\u05e2\7\u0085\2\2\u05e1\u05e3\5\u00ca"+
		"f\2\u05e2\u05e1\3\2\2\2\u05e2\u05e3\3\2\2\2\u05e3\u05e4\3\2\2\2\u05e4"+
		"\u05e5\7\u00a4\2\2\u05e5\u05e6\5\\/\2\u05e6\u05e7\7\u009b\2\2\u05e7\u05e8"+
		"\7\u00a2\2\2\u05e8\u05e9\5\u00e0q\2\u05e9\u05ea\7\21\2\2\u05ea\u05eb\5"+
		"\u0094K\2\u05eb\u05ec\5\u0118\u008d\2\u05ec\u05ed\5\u0096L\2\u05ed\u0614"+
		"\3\2\2\2\u05ee\u0600\7m\2\2\u05ef\u05f1\7M\2\2\u05f0\u05f2\5\u00caf\2"+
		"\u05f1\u05f0\3\2\2\2\u05f1\u05f2\3\2\2\2\u05f2\u0601\3\2\2\2\u05f3\u05f5"+
		"\5\u00caf\2\u05f4\u05f6\7\u0091\2\2\u05f5\u05f4\3\2\2\2\u05f5\u05f6\3"+
		"\2\2\2\u05f6\u05f7\3\2\2\2\u05f7\u05f8\5\\/\2\u05f8\u05f9\7\u009e\2\2"+
		"\u05f9\u05fa\5\\/\2\u05fa\u0601\3\2\2\2\u05fb\u05fc\7\u0091\2\2\u05fc"+
		"\u05fd\5\\/\2\u05fd\u05fe\7\u009e\2\2\u05fe\u05ff\5\\/\2\u05ff\u0601\3"+
		"\2\2\2\u0600\u05ef\3\2\2\2\u0600\u05f3\3\2\2\2\u0600\u05fb\3\2\2\2\u0601"+
		"\u0604\3\2\2\2\u0602\u0603\7\u00a4\2\2\u0603\u0605\5\\/\2\u0604\u0602"+
		"\3\2\2\2\u0604\u0605\3\2\2\2\u0605\u0609\3\2\2\2\u0606\u0607\7\u0088\2"+
		"\2\u0607\u0608\7X\2\2\u0608\u060a\5\u015a\u00ae\2\u0609\u0606\3\2\2\2"+
		"\u0609\u060a\3\2\2\2\u060a\u060b\3\2\2\2\u060b\u060c\7\u009b\2\2\u060c"+
		"\u060d\7\u00a2\2\2\u060d\u060e\5\u00e0q\2\u060e\u060f\7\21\2\2\u060f\u0610"+
		"\5\u0094K\2\u0610\u0611\5\u0118\u008d\2\u0611\u0612\5\u0096L\2\u0612\u0614"+
		"\3\2\2\2\u0613\u05df\3\2\2\2\u0613\u05ee\3\2\2\2\u0614}\3\2\2\2\u0615"+
		"\u0616\7\u008c\2\2\u0616\u0617\7M\2\2\u0617\u0618\7r\2\2\u0618\u0619\5"+
		"\\/\2\u0619\u061a\7\u009b\2\2\u061a\u061b\7\u00a2\2\2\u061b\u061c\5\u00e0"+
		"q\2\u061c\u061d\7\21\2\2\u061d\u061e\5\u0094K\2\u061e\u061f\5\u0118\u008d"+
		"\2\u061f\u0620\5\u0096L\2\u0620\177\3\2\2\2\u0621\u0623\7\u0095\2\2\u0622"+
		"\u0624\7b\2\2\u0623\u0622\3\2\2\2\u0623\u0624\3\2\2\2\u0624\u0625\3\2"+
		"\2\2\u0625\u062b\5h\65\2\u0626\u0627\7\u00a2\2\2\u0627\u0628\5\u0152\u00aa"+
		"\2\u0628\u0629\7Q\2\2\u0629\u062a\5\u0164\u00b3\2\u062a\u062c\3\2\2\2"+
		"\u062b\u0626\3\2\2\2\u062b\u062c\3\2\2\2\u062c\u0081\3\2\2\2\u062d\u062e"+
		"\6B*\3\u062e\u0634\5\\/\2\u062f\u0632\5\u0084C\2\u0630\u0631\7O\2\2\u0631"+
		"\u0633\5\u0086D\2\u0632\u0630\3\2\2\2\u0632\u0633\3\2\2\2\u0633\u0635"+
		"\3\2\2\2\u0634\u062f\3\2\2\2\u0634\u0635\3\2\2\2\u0635\u063c\3\2\2\2\u0636"+
		"\u0639\5\u0084C\2\u0637\u0638\7O\2\2\u0638\u063a\5\u0086D\2\u0639\u0637"+
		"\3\2\2\2\u0639\u063a\3\2\2\2\u063a\u063c\3\2\2\2\u063b\u062d\3\2\2\2\u063b"+
		"\u0636\3\2\2\2\u063c\u0083\3\2\2\2\u063d\u063e\bC\1\2\u063e\u063f\7\u00a2"+
		"\2\2\u063f\u0640\5\u0086D\2\u0640\u0646\3\2\2\2\u0641\u0642\f\3\2\2\u0642"+
		"\u0643\7\23\2\2\u0643\u0645\5\u0086D\2\u0644\u0641\3\2\2\2\u0645\u0648"+
		"\3\2\2\2\u0646\u0644\3\2\2\2\u0646\u0647\3\2\2\2\u0647\u0085\3\2\2\2\u0648"+
		"\u0646\3\2\2\2\u0649\u064a\5\\/\2\u064a\u064b\7Q\2\2\u064b\u064d\3\2\2"+
		"\2\u064c\u0649\3\2\2\2\u064c\u064d\3\2\2\2\u064d\u064e\3\2\2\2\u064e\u064f"+
		"\5\u00e0q\2\u064f\u0087\3\2\2\2\u0650\u0651\5\u0148\u00a5\2\u0651\u0652"+
		"\5\u016c\u00b7\2\u0652\u0653\5\\/\2\u0653\u0089\3\2\2\2\u0654\u0655\6"+
		"F,\3\u0655\u0656\7\25\2\2\u0656\u065d\5\u00e0q\2\u0657\u0658\6F-\3\u0658"+
		"\u0659\7\30\2\2\u0659\u065a\5\\/\2\u065a\u065b\7\31\2\2\u065b\u065d\3"+
		"\2\2\2\u065c\u0654\3\2\2\2\u065c\u0657\3\2\2\2\u065d\u008b\3\2\2\2\u065e"+
		"\u065f\5\u0108\u0085\2\u065f\u0660\5\u016c\u00b7\2\u0660\u0661\5\\/\2"+
		"\u0661\u008d\3\2\2\2\u0662\u0664\7\7\2\2\u0663\u0662\3\2\2\2\u0664\u0667"+
		"\3\2\2\2\u0665\u0663\3\2\2\2\u0665\u0666\3\2\2\2\u0666\u008f\3\2\2\2\u0667"+
		"\u0665\3\2\2\2\u0668\u066a\7\7\2\2\u0669\u0668\3\2\2\2\u066a\u066b\3\2"+
		"\2\2\u066b\u0669\3\2\2\2\u066b\u066c\3\2\2\2\u066c\u0091\3\2\2\2\u066d"+
		"\u066f\t\3\2\2\u066e\u066d\3\2\2\2\u066f\u0672\3\2\2\2\u0670\u066e\3\2"+
		"\2\2\u0670\u0671\3\2\2\2\u0671\u0093\3\2\2\2\u0672\u0670\3\2\2\2\u0673"+
		"\u0675\7\7\2\2\u0674\u0673\3\2\2\2\u0675\u0676\3\2\2\2\u0676\u0674\3\2"+
		"\2\2\u0676\u0677\3\2\2\2\u0677\u0678\3\2\2\2\u0678\u0679\7\3\2\2\u0679"+
		"\u0095\3\2\2\2\u067a\u067c\7\7\2\2\u067b\u067a\3\2\2\2\u067c\u067f\3\2"+
		"\2\2\u067d\u067b\3\2\2\2\u067d\u067e\3\2\2\2\u067e\u0680\3\2\2\2\u067f"+
		"\u067d\3\2\2\2\u0680\u0681\7\4\2\2\u0681\u0097\3\2\2\2\u0682\u0683\7K"+
		"\2\2\u0683\u0684\7\21\2\2\u0684\u0685\5\u00f2z\2\u0685\u0099\3\2\2\2\u0686"+
		"\u0687\7\u0082\2\2\u0687\u009b\3\2\2\2\u0688\u068c\5\u00a2R\2\u0689\u068c"+
		"\58\35\2\u068a\u068c\5\\/\2\u068b\u0688\3\2\2\2\u068b\u0689\3\2\2\2\u068b"+
		"\u068a\3\2\2\2\u068c\u009d\3\2\2\2\u068d\u068f\5\u00a0Q\2\u068e\u068d"+
		"\3\2\2\2\u068e\u068f\3\2\2\2\u068f\u0690\3\2\2\2\u0690\u0691\5\u008eH"+
		"\2\u0691\u0692\7\2\2\3\u0692\u009f\3\2\2\2\u0693\u0699\5\u00a2R\2\u0694"+
		"\u0695\5\u0090I\2\u0695\u0696\5\u00a2R\2\u0696\u0698\3\2\2\2\u0697\u0694"+
		"\3\2\2\2\u0698\u069b\3\2\2\2\u0699\u0697\3\2\2\2\u0699\u069a\3\2\2\2\u069a"+
		"\u00a1\3\2\2\2\u069b\u0699\3\2\2\2\u069c\u069d\5\u010e\u0088\2\u069d\u069e"+
		"\5\u0090I\2\u069e\u06a0\3\2\2\2\u069f\u069c\3\2\2\2\u06a0\u06a3\3\2\2"+
		"\2\u06a1\u069f\3\2\2\2\u06a1\u06a2\3\2\2\2\u06a2\u06a9\3\2\2\2\u06a3\u06a1"+
		"\3\2\2\2\u06a4\u06a5\5\u00a4S\2\u06a5\u06a6\5\u0090I\2\u06a6\u06a8\3\2"+
		"\2\2\u06a7\u06a4\3\2\2\2\u06a8\u06ab\3\2\2\2\u06a9\u06a7\3\2\2\2\u06a9"+
		"\u06aa\3\2\2\2\u06aa\u06b2\3\2\2\2\u06ab\u06a9\3\2\2\2\u06ac\u06b3\5\n"+
		"\6\2\u06ad\u06b3\5\u00ceh\2\u06ae\u06b3\5\u00aeX\2\u06af\u06b3\5\u00b0"+
		"Y\2\u06b0\u06b3\5\u00d0i\2\u06b1\u06b3\5\u010c\u0087\2\u06b2\u06ac\3\2"+
		"\2\2\u06b2\u06ad\3\2\2\2\u06b2\u06ae\3\2\2\2\u06b2\u06af\3\2\2\2\u06b2"+
		"\u06b0\3\2\2\2\u06b2\u06b1\3\2\2\2\u06b3\u00a3\3\2\2\2\u06b4\u06c3\5\u00a6"+
		"T\2\u06b5\u06bf\7\26\2\2\u06b6\u06c0\5\u00acW\2\u06b7\u06bc\5\u00a8U\2"+
		"\u06b8\u06b9\7\23\2\2\u06b9\u06bb\5\u00a8U\2\u06ba\u06b8\3\2\2\2\u06bb"+
		"\u06be\3\2\2\2\u06bc\u06ba\3\2\2\2\u06bc\u06bd\3\2\2\2\u06bd\u06c0\3\2"+
		"\2\2\u06be\u06bc\3\2\2\2\u06bf\u06b6\3\2\2\2\u06bf\u06b7\3\2\2\2\u06c0"+
		"\u06c1\3\2\2\2\u06c1\u06c2\7\27\2\2\u06c2\u06c4\3\2\2\2\u06c3\u06b5\3"+
		"\2\2\2\u06c3\u06c4\3\2\2\2\u06c4\u00a5\3\2\2\2\u06c5\u06c6\7\u00b0\2\2"+
		"\u06c6\u00a7\3\2\2\2\u06c7\u06c8\5\u00aaV\2\u06c8\u06c9\7/\2\2\u06c9\u06ca"+
		"\5\u00acW\2\u06ca\u00a9\3\2\2\2\u06cb\u06cc\t\4\2\2\u06cc\u00ab\3\2\2"+
		"\2\u06cd\u06d0\5\u012c\u0097\2\u06ce\u06d0\5\u00c4c\2\u06cf\u06cd\3\2"+
		"\2\2\u06cf\u06ce\3\2\2\2\u06d0\u00ad\3\2\2\2\u06d1\u06d2\5\"\22\2\u06d2"+
		"\u00af\3\2\2\2\u06d3\u06d6\5\2\2\2\u06d4\u06d6\5\4\3\2\u06d5\u06d3\3\2"+
		"\2\2\u06d5\u06d4\3\2\2\2\u06d6\u00b1\3\2\2\2\u06d7\u06dd\5\6\4\2\u06d8"+
		"\u06d9\5\u0090I\2\u06d9\u06da\5\6\4\2\u06da\u06dc\3\2\2\2\u06db\u06d8"+
		"\3\2\2\2\u06dc\u06df\3\2\2\2\u06dd\u06db\3\2\2\2\u06dd\u06de\3\2\2\2\u06de"+
		"\u00b3\3\2\2\2\u06df\u06dd\3\2\2\2\u06e0\u06e6\5\b\5\2\u06e1\u06e2\5\u0090"+
		"I\2\u06e2\u06e3\5\b\5\2\u06e3\u06e5\3\2\2\2\u06e4\u06e1\3\2\2\2\u06e5"+
		"\u06e8\3\2\2\2\u06e6\u06e4\3\2\2\2\u06e6\u06e7\3\2\2\2\u06e7\u00b5\3\2"+
		"\2\2\u06e8\u06e6\3\2\2\2\u06e9\u06ee\5\u00e6t\2\u06ea\u06eb\7\23\2\2\u06eb"+
		"\u06ed\5\u00e6t\2\u06ec\u06ea\3\2\2\2\u06ed\u06f0\3\2\2\2\u06ee\u06ec"+
		"\3\2\2\2\u06ee\u06ef\3\2\2\2\u06ef\u00b7\3\2\2\2\u06f0\u06ee\3\2\2\2\u06f1"+
		"\u06f2\7v\2\2\u06f2\u06fc\5\u00ba^\2\u06f3\u06f4\7v\2\2\u06f4\u06fc\5"+
		"\u00bc_\2\u06f5\u06f6\7v\2\2\u06f6\u06fc\5\u00c0a\2\u06f7\u06f8\7z\2\2"+
		"\u06f8\u06fc\7\u00b1\2\2\u06f9\u06fa\7z\2\2\u06fa\u06fc\5\\/\2\u06fb\u06f1"+
		"\3\2\2\2\u06fb\u06f3\3\2\2\2\u06fb\u06f5\3\2\2\2\u06fb\u06f7\3\2\2\2\u06fb"+
		"\u06f9\3\2\2\2\u06fc\u00b9\3\2\2\2\u06fd\u06ff\7~\2\2\u06fe\u06fd\3\2"+
		"\2\2\u06fe\u06ff\3\2\2\2\u06ff\u0700\3\2\2\2\u0700\u0702\7\30\2\2\u0701"+
		"\u0703\5\u00be`\2\u0702\u0701\3\2\2\2\u0702\u0703\3\2\2\2\u0703\u0704"+
		"\3\2\2\2\u0704\u0705\7\31\2\2\u0705\u00bb\3\2\2\2\u0706\u0708\7~\2\2\u0707"+
		"\u0706\3\2\2\2\u0707\u0708\3\2\2\2\u0708\u0709\3\2\2\2\u0709\u070b\7+"+
		"\2\2\u070a\u070c\5\u00be`\2\u070b\u070a\3\2\2\2\u070b\u070c\3\2\2\2\u070c"+
		"\u070d\3\2\2\2\u070d\u070e\7)\2\2\u070e\u00bd\3\2\2\2\u070f\u0714\5\\"+
		"/\2\u0710\u0711\7\23\2\2\u0711\u0713\5\\/\2\u0712\u0710\3\2\2\2\u0713"+
		"\u0716\3\2\2\2\u0714\u0712\3\2\2\2\u0714\u0715\3\2\2\2\u0715\u00bf\3\2"+
		"\2\2\u0716\u0714\3\2\2\2\u0717\u0718\7\30\2\2\u0718\u0719\5\\/\2\u0719"+
		"\u071a\7\24\2\2\u071a\u071b\5\\/\2\u071b\u071c\7\31\2\2\u071c\u00c1\3"+
		"\2\2\2\u071d\u071e\bb\1\2\u071e\u072a\5\u00c4c\2\u071f\u0720\7I\2\2\u0720"+
		"\u0721\7+\2\2\u0721\u0722\5\u00c2b\2\u0722\u0723\7)\2\2\u0723\u072a\3"+
		"\2\2\2\u0724\u0725\7H\2\2\u0725\u0726\7+\2\2\u0726\u0727\5\u00c2b\2\u0727"+
		"\u0728\7)\2\2\u0728\u072a\3\2\2\2\u0729\u071d\3\2\2\2\u0729\u071f\3\2"+
		"\2\2\u0729\u0724\3\2\2\2\u072a\u0734\3\2\2\2\u072b\u072c\f\7\2\2\u072c"+
		"\u0733\7-\2\2\u072d\u072e\f\6\2\2\u072e\u072f\7\30\2\2\u072f\u0733\7\31"+
		"\2\2\u0730\u0731\f\5\2\2\u0731\u0733\7.\2\2\u0732\u072b\3\2\2\2\u0732"+
		"\u072d\3\2\2\2\u0732\u0730\3\2\2\2\u0733\u0736\3\2\2\2\u0734\u0732\3\2"+
		"\2\2\u0734\u0735\3\2\2\2\u0735\u00c3\3\2\2\2\u0736\u0734\3\2\2\2\u0737"+
		"\u073a\5\u00c6d\2\u0738\u073a\5\u00c8e\2\u0739\u0737\3\2\2\2\u0739\u0738"+
		"\3\2\2\2\u073a\u00c5\3\2\2\2\u073b\u074d\7\67\2\2\u073c\u074d\78\2\2\u073d"+
		"\u074d\79\2\2\u073e\u074d\7:\2\2\u073f\u074d\7F\2\2\u0740\u074d\7;\2\2"+
		"\u0741\u074d\7<\2\2\u0742\u074d\7D\2\2\u0743\u074d\7=\2\2\u0744\u074d"+
		"\7?\2\2\u0745\u074d\7>\2\2\u0746\u074d\7@\2\2\u0747\u074d\7A\2\2\u0748"+
		"\u074d\7C\2\2\u0749\u074d\7E\2\2\u074a\u074d\7G\2\2\u074b\u074d\7J\2\2"+
		"\u074c\u073b\3\2\2\2\u074c\u073c\3\2\2\2\u074c\u073d\3\2\2\2\u074c\u073e"+
		"\3\2\2\2\u074c\u073f\3\2\2\2\u074c\u0740\3\2\2\2\u074c\u0741\3\2\2\2\u074c"+
		"\u0742\3\2\2\2\u074c\u0743\3\2\2\2\u074c\u0744\3\2\2\2\u074c\u0745\3\2"+
		"\2\2\u074c\u0746\3\2\2\2\u074c\u0747\3\2\2\2\u074c\u0748\3\2\2\2\u074c"+
		"\u0749\3\2\2\2\u074c\u074a\3\2\2\2\u074c\u074b\3\2\2\2\u074d\u00c7\3\2"+
		"\2\2\u074e\u074f\7\u00ac\2\2\u074f\u00c9\3\2\2\2\u0750\u0752\7~\2\2\u0751"+
		"\u0750\3\2\2\2\u0751\u0752\3\2\2\2\u0752\u0753\3\2\2\2\u0753\u0754\5\u00c8"+
		"e\2\u0754\u00cb\3\2\2\2\u0755\u0756\7C\2\2\u0756\u00cd\3\2\2\2\u0757\u075b"+
		"\5\20\t\2\u0758\u075b\5 \21\2\u0759\u075b\5\22\n\2\u075a\u0757\3\2\2\2"+
		"\u075a\u0758\3\2\2\2\u075a\u0759\3\2\2\2\u075b\u00cf\3\2\2\2\u075c\u075f"+
		"\5\f\7\2\u075d\u075f\5\16\b\2\u075e\u075c\3\2\2\2\u075e\u075d\3\2\2\2"+
		"\u075f\u00d1\3\2\2\2\u0760\u0765\5\u00e4s\2\u0761\u0762\7\23\2\2\u0762"+
		"\u0764\5\u00e4s\2\u0763\u0761\3\2\2\2\u0764\u0767\3\2\2\2\u0765\u0763"+
		"\3\2\2\2\u0765\u0766\3\2\2\2\u0766\u00d3\3\2\2\2\u0767\u0765\3\2\2\2\u0768"+
		"\u076b\5\u00e0q\2\u0769\u076b\5\u00e4s\2\u076a\u0768\3\2\2\2\u076a\u0769"+
		"\3\2\2\2\u076b\u00d5\3\2\2\2\u076c\u076f\5\u00dco\2\u076d\u076f\5\u0160"+
		"\u00b1\2\u076e\u076c\3\2\2\2\u076e\u076d\3\2\2\2\u076f\u00d7\3\2\2\2\u0770"+
		"\u0771\6m\61\3\u0771\u0772\7#\2\2\u0772\u0773\5\u00dan\2\u0773\u00d9\3"+
		"\2\2\2\u0774\u0775\6n\62\3\u0775\u0776\5\u00d6l\2\u0776\u00db\3\2\2\2"+
		"\u0777\u077b\5\u00e0q\2\u0778\u077b\5\u00e4s\2\u0779\u077b\5\u00e6t\2"+
		"\u077a\u0777\3\2\2\2\u077a\u0778\3\2\2\2\u077a\u0779\3\2\2\2\u077b\u00dd"+
		"\3\2\2\2\u077c\u077d\t\5\2\2\u077d\u00df\3\2\2\2\u077e\u077f\7\u00ad\2"+
		"\2\u077f\u00e1\3\2\2\2\u0780\u0781\t\6\2\2\u0781\u00e3\3\2\2\2\u0782\u0783"+
		"\7\u00ac\2\2\u0783\u00e5\3\2\2\2\u0784\u0785\7\u00ab\2\2\u0785\u00e7\3"+
		"\2\2\2\u0786\u078b\5\u00eav\2\u0787\u0788\7\23\2\2\u0788\u078a\5\u00ea"+
		"v\2\u0789\u0787\3\2\2\2\u078a\u078d\3\2\2\2\u078b\u0789\3\2\2\2\u078b"+
		"\u078c\3\2\2\2\u078c\u00e9\3\2\2\2\u078d\u078b\3\2\2\2\u078e\u0794\5\u00f0"+
		"y\2\u078f\u0791\7~\2\2\u0790\u078f\3\2\2\2\u0790\u0791\3\2\2\2\u0791\u0792"+
		"\3\2\2\2\u0792\u0794\5\u00ecw\2\u0793\u078e\3\2\2\2\u0793\u0790\3\2\2"+
		"\2\u0794\u00eb\3\2\2\2\u0795\u0798\5\u00eex\2\u0796\u0798\5\66\34\2\u0797"+
		"\u0795\3\2\2\2\u0797\u0796\3\2\2\2\u0798\u00ed\3\2\2\2\u0799\u079c\5\u00e0"+
		"q\2\u079a\u079b\7/\2\2\u079b\u079d\5\u012c\u0097\2\u079c\u079a\3\2\2\2"+
		"\u079c\u079d\3\2\2\2\u079d\u00ef\3\2\2\2\u079e\u079f\5\u00ccg\2\u079f"+
		"\u07a0\5\u00e0q\2\u07a0\u00f1\3\2\2\2\u07a1\u07a4\5\u00c2b\2\u07a2\u07a4"+
		"\5\u00f4{\2\u07a3\u07a1\3\2\2\2\u07a3\u07a2\3\2\2\2\u07a4\u00f3\3\2\2"+
		"\2\u07a5\u07a6\b{\1\2\u07a6\u07a7\7P\2\2\u07a7\u07b0\3\2\2\2\u07a8\u07a9"+
		"\f\4\2\2\u07a9\u07aa\7\30\2\2\u07aa\u07af\7\31\2\2\u07ab\u07ac\f\3\2\2"+
		"\u07ac\u07ad\7\32\2\2\u07ad\u07af\7\33\2\2\u07ae\u07a8\3\2\2\2\u07ae\u07ab"+
		"\3\2\2\2\u07af\u07b2\3\2\2\2\u07b0\u07ae\3\2\2\2\u07b0\u07b1\3\2\2\2\u07b1"+
		"\u00f5\3\2\2\2\u07b2\u07b0\3\2\2\2\u07b3\u07b9\5\u00f8}\2\u07b4\u07b5"+
		"\5\u0090I\2\u07b5\u07b6\5\u00f8}\2\u07b6\u07b8\3\2\2\2\u07b7\u07b4\3\2"+
		"\2\2\u07b8\u07bb\3\2\2\2\u07b9\u07b7\3\2\2\2\u07b9\u07ba\3\2\2\2\u07ba"+
		"\u00f7\3\2\2\2\u07bb\u07b9\3\2\2\2\u07bc\u07bd\5\u010e\u0088\2\u07bd\u07be"+
		"\5\u0090I\2\u07be\u07c0\3\2\2\2\u07bf\u07bc\3\2\2\2\u07c0\u07c3\3\2\2"+
		"\2\u07c1\u07bf\3\2\2\2\u07c1\u07c2\3\2\2\2\u07c2\u07c9\3\2\2\2\u07c3\u07c1"+
		"\3\2\2\2\u07c4\u07c5\5\u00a4S\2\u07c5\u07c6\5\u0090I\2\u07c6\u07c8\3\2"+
		"\2\2\u07c7\u07c4\3\2\2\2\u07c8\u07cb\3\2\2\2\u07c9\u07c7\3\2\2\2\u07c9"+
		"\u07ca\3\2\2\2\u07ca\u07d1\3\2\2\2\u07cb\u07c9\3\2\2\2\u07cc\u07d2\5\30"+
		"\r\2\u07cd\u07d2\5\34\17\2\u07ce\u07d2\5,\27\2\u07cf\u07d2\5*\26\2\u07d0"+
		"\u07d2\5\26\f\2\u07d1\u07cc\3\2\2\2\u07d1\u07cd\3\2\2\2\u07d1\u07ce\3"+
		"\2\2\2\u07d1\u07cf\3\2\2\2\u07d1\u07d0\3\2\2\2\u07d2\u00f9\3\2\2\2\u07d3"+
		"\u07d9\5\u00fc\177\2\u07d4\u07d5\5\u0090I\2\u07d5\u07d6\5\u00fc\177\2"+
		"\u07d6\u07d8\3\2\2\2\u07d7\u07d4\3\2\2\2\u07d8\u07db\3\2\2\2\u07d9\u07d7"+
		"\3\2\2\2\u07d9\u07da\3\2\2\2\u07da\u00fb\3\2\2\2\u07db\u07d9\3\2\2\2\u07dc"+
		"\u07e0\5\36\20\2\u07dd\u07e0\5\32\16\2\u07de\u07e0\5.\30\2\u07df\u07dc"+
		"\3\2\2\2\u07df\u07dd\3\2\2\2\u07df\u07de\3\2\2\2\u07e0\u00fd\3\2\2\2\u07e1"+
		"\u07e2\7\13\2\2\u07e2\u07ec\5\u01c0\u00e1\2\u07e3\u07e4\7\f\2\2\u07e4"+
		"\u07ec\5\u01da\u00ee\2\u07e5\u07e6\7\r\2\2\u07e6\u07ec\5\u0100\u0081\2"+
		"\u07e7\u07e8\7\16\2\2\u07e8\u07ec\5\u0100\u0081\2\u07e9\u07ea\7\17\2\2"+
		"\u07ea\u07ec\5\u0104\u0083\2\u07eb\u07e1\3\2\2\2\u07eb\u07e3\3\2\2\2\u07eb"+
		"\u07e5\3\2\2\2\u07eb\u07e7\3\2\2\2\u07eb\u07e9\3\2\2\2\u07ec\u00ff\3\2"+
		"\2\2\u07ed\u07ef\5\u00dco\2\u07ee\u07f0\5\u0102\u0082\2\u07ef\u07ee\3"+
		"\2\2\2\u07ef\u07f0\3\2\2\2\u07f0\u0101\3\2\2\2\u07f1\u07f2\7r\2\2\u07f2"+
		"\u07f3\5\u0166\u00b4\2\u07f3\u07f4\7\21\2\2\u07f4\u07f9\5\u01a8\u00d5"+
		"\2\u07f5\u07f6\7\25\2\2\u07f6\u07f8\5\u01a8\u00d5\2\u07f7\u07f5\3\2\2"+
		"\2\u07f8\u07fb\3\2\2\2\u07f9\u07f7\3\2\2\2\u07f9\u07fa\3\2\2\2\u07fa\u0103"+
		"\3\2\2\2\u07fb\u07f9\3\2\2\2\u07fc\u0801\5\u018e\u00c8\2\u07fd\u07fe\7"+
		"\25\2\2\u07fe\u0800\5\u018e\u00c8\2\u07ff\u07fd\3\2\2\2\u0800\u0803\3"+
		"\2\2\2\u0801\u07ff\3\2\2\2\u0801\u0802\3\2\2\2\u0802\u0805\3\2\2\2\u0803"+
		"\u0801\3\2\2\2\u0804\u0806\5\u0106\u0084\2\u0805\u0804\3\2\2\2\u0805\u0806"+
		"\3\2\2\2\u0806\u0105\3\2\2\2\u0807\u0808\7r\2\2\u0808\u0809\5\u0166\u00b4"+
		"\2\u0809\u080b\7\21\2\2\u080a\u080c\7%\2\2\u080b\u080a\3\2\2\2\u080b\u080c"+
		"\3\2\2\2\u080c\u080d\3\2\2\2\u080d\u0812\5\u018e\u00c8\2\u080e\u080f\7"+
		"%\2\2\u080f\u0811\5\u018e\u00c8\2\u0810\u080e\3\2\2\2\u0811\u0814\3\2"+
		"\2\2\u0812\u0810\3\2\2\2\u0812\u0813\3\2\2\2\u0813\u0817\3\2\2\2\u0814"+
		"\u0812\3\2\2\2\u0815\u0816\7\25\2\2\u0816\u0818\5\u018e\u00c8\2\u0817"+
		"\u0815\3\2\2\2\u0817\u0818\3\2\2\2\u0818\u0107\3\2\2\2\u0819\u081e\5\u00e0"+
		"q\2\u081a\u081b\7\23\2\2\u081b\u081d\5\u00e0q\2\u081c\u081a\3\2\2\2\u081d"+
		"\u0820\3\2\2\2\u081e\u081c\3\2\2\2\u081e\u081f\3\2\2\2\u081f\u0109\3\2"+
		"\2\2\u0820\u081e\3\2\2\2\u0821\u0826\5\u00e2r\2\u0822\u0823\7\23\2\2\u0823"+
		"\u0825\5\u00e2r\2\u0824\u0822\3\2\2\2\u0825\u0828\3\2\2\2\u0826\u0824"+
		"\3\2\2\2\u0826\u0827\3\2\2\2\u0827\u010b\3\2\2\2\u0828\u0826\3\2\2\2\u0829"+
		"\u082e\5*\26\2\u082a\u082e\5,\27\2\u082b\u082e\5.\30\2\u082c\u082e\5\60"+
		"\31\2\u082d\u0829\3\2\2\2\u082d\u082a\3\2\2\2\u082d\u082b\3\2\2\2\u082d"+
		"\u082c\3\2\2\2\u082e\u010d\3\2\2\2\u082f\u0830\7\n\2\2\u0830\u010f\3\2"+
		"\2\2\u0831\u0837\5\u0112\u008a\2\u0832\u0833\5\u0090I\2\u0833\u0834\5"+
		"\u0112\u008a\2\u0834\u0836\3\2\2\2\u0835\u0832\3\2\2\2\u0836\u0839\3\2"+
		"\2\2\u0837\u0835\3\2\2\2\u0837\u0838\3\2\2\2\u0838\u0111\3\2\2\2\u0839"+
		"\u0837\3\2\2\2\u083a\u083b\7\13\2\2\u083b\u0845\5\u01aa\u00d6\2\u083c"+
		"\u083d\7\f\2\2\u083d\u0845\5\u01c6\u00e4\2\u083e\u083f\7\r\2\2\u083f\u0845"+
		"\5\u0114\u008b\2\u0840\u0841\7\16\2\2\u0841\u0845\5\u0114\u008b\2\u0842"+
		"\u0843\7\17\2\2\u0843\u0845\5\u0116\u008c\2\u0844\u083a\3\2\2\2\u0844"+
		"\u083c\3\2\2\2\u0844\u083e\3\2\2\2\u0844\u0840\3\2\2\2\u0844\u0842\3\2"+
		"\2\2\u0845\u0113\3\2\2\2\u0846\u0848\5\u0190\u00c9\2\u0847\u0849\7\22"+
		"\2\2\u0848\u0847\3\2\2\2\u0848\u0849\3\2\2\2\u0849\u084b\3\2\2\2\u084a"+
		"\u084c\5\u0102\u0082\2\u084b\u084a\3\2\2\2\u084b\u084c\3\2\2\2\u084c\u0115"+
		"\3\2\2\2\u084d\u084f\5\u0176\u00bc\2\u084e\u0850\7\22\2\2\u084f\u084e"+
		"\3\2\2\2\u084f\u0850\3\2\2\2\u0850\u0852\3\2\2\2\u0851\u0853\5\u0106\u0084"+
		"\2\u0852\u0851\3\2\2\2\u0852\u0853\3\2\2\2\u0853\u0117\3\2\2\2\u0854\u085a"+
		"\58\35\2\u0855\u0856\5\u0090I\2\u0856\u0857\58\35\2\u0857\u0859\3\2\2"+
		"\2\u0858\u0855\3\2\2\2\u0859\u085c\3\2\2\2\u085a\u0858\3\2\2\2\u085a\u085b"+
		"\3\2\2\2\u085b\u0119\3\2\2\2\u085c\u085a\3\2\2\2\u085d\u0863\5\62\32\2"+
		"\u085e\u085f\5\u0090I\2\u085f\u0860\5\62\32\2\u0860\u0862\3\2\2\2\u0861"+
		"\u085e\3\2\2\2\u0862\u0865\3\2\2\2\u0863\u0861\3\2\2\2\u0863\u0864\3\2"+
		"\2\2\u0864\u011b\3\2\2\2\u0865\u0863\3\2\2\2\u0866\u086c\5F$\2\u0867\u0868"+
		"\5\u0090I\2\u0868\u0869\5F$\2\u0869\u086b\3\2\2\2\u086a\u0867\3\2\2\2"+
		"\u086b\u086e\3\2\2\2\u086c\u086a\3\2\2\2\u086c\u086d\3\2\2\2\u086d\u011d"+
		"\3\2\2\2\u086e\u086c\3\2\2\2\u086f\u0875\5V,\2\u0870\u0871\5\u0090I\2"+
		"\u0871\u0872\5V,\2\u0872\u0874\3\2\2\2\u0873\u0870\3\2\2\2\u0874\u0877"+
		"\3\2\2\2\u0875\u0873\3\2\2\2\u0875\u0876\3\2\2\2\u0876\u011f\3\2\2\2\u0877"+
		"\u0875\3\2\2\2\u0878\u0879\7\30\2\2\u0879\u087a\5\u0122\u0092\2\u087a"+
		"\u087b\7\24\2\2\u087b\u087c\5\u0122\u0092\2\u087c\u087d\7\31\2\2\u087d"+
		"\u0887\3\2\2\2\u087e\u087f\7\30\2\2\u087f\u0880\5\u0124\u0093\2\u0880"+
		"\u0881\7\31\2\2\u0881\u0887\3\2\2\2\u0882\u0883\7+\2\2\u0883\u0884\5\u0124"+
		"\u0093\2\u0884\u0885\7)\2\2\u0885\u0887\3\2\2\2\u0886\u0878\3\2\2\2\u0886"+
		"\u087e\3\2\2\2\u0886\u0882\3\2\2\2\u0887\u0121\3\2\2\2\u0888\u08a0\7\u00a9"+
		"\2\2\u0889\u08a0\7\u00aa\2\2\u088a\u088c\7#\2\2\u088b\u088a\3\2\2\2\u088b"+
		"\u088c\3\2\2\2\u088c\u088d\3\2\2\2\u088d\u08a0\7\u00b3\2\2\u088e\u08a0"+
		"\7\u00b4\2\2\u088f\u08a0\7\u00a8\2\2\u0890\u08a0\7\u00b8\2\2\u0891\u08a0"+
		"\7\u00b7\2\2\u0892\u08a0\7\u00b1\2\2\u0893\u0895\7#\2\2\u0894\u0893\3"+
		"\2\2\2\u0894\u0895\3\2\2\2\u0895\u0896\3\2\2\2\u0896\u08a0\7\u00b5\2\2"+
		"\u0897\u08a0\7\u00b6\2\2\u0898\u08a0\7\u00a7\2\2\u0899\u08a0\7\u00b9\2"+
		"\2\u089a\u08a0\7\u00ba\2\2\u089b\u08a0\7\u00b2\2\2\u089c\u08a0\5\u00e6"+
		"t\2\u089d\u08a0\5\u0098M\2\u089e\u08a0\5\u009aN\2\u089f\u0888\3\2\2\2"+
		"\u089f\u0889\3\2\2\2\u089f\u088b\3\2\2\2\u089f\u088e\3\2\2\2\u089f\u088f"+
		"\3\2\2\2\u089f\u0890\3\2\2\2\u089f\u0891\3\2\2\2\u089f\u0892\3\2\2\2\u089f"+
		"\u0894\3\2\2\2\u089f\u0897\3\2\2\2\u089f\u0898\3\2\2\2\u089f\u0899\3\2"+
		"\2\2\u089f\u089a\3\2\2\2\u089f\u089b\3\2\2\2\u089f\u089c\3\2\2\2\u089f"+
		"\u089d\3\2\2\2\u089f\u089e\3\2\2\2\u08a0\u0123\3\2\2\2\u08a1\u08a6\5\u0122"+
		"\u0092\2\u08a2\u08a3\7\23\2\2\u08a3\u08a5\5\u0122\u0092\2\u08a4\u08a2"+
		"\3\2\2\2\u08a5\u08a8\3\2\2\2\u08a6\u08a4\3\2\2\2\u08a6\u08a7\3\2\2\2\u08a7"+
		"\u0125\3\2\2\2\u08a8\u08a6\3\2\2\2\u08a9\u08aa\t\7\2\2\u08aa\u0127\3\2"+
		"\2\2\u08ab\u08ac\5\u00c8e\2\u08ac\u08ad\7\25\2\2\u08ad\u08af\3\2\2\2\u08ae"+
		"\u08ab\3\2\2\2\u08ae\u08af\3\2\2\2\u08af\u08b0\3\2\2\2\u08b0\u08b1\7\u0098"+
		"\2\2\u08b1\u0129\3\2\2\2\u08b2\u08b3\7\26\2\2\u08b3\u08b4\5\\/\2\u08b4"+
		"\u08b5\7\27\2\2\u08b5\u012b\3\2\2\2\u08b6\u08b9\5\u0122\u0092\2\u08b7"+
		"\u08b9\5\u012e\u0098\2\u08b8\u08b6\3\2\2\2\u08b8\u08b7\3\2\2\2\u08b9\u012d"+
		"\3\2\2\2\u08ba\u08c1\5\u00c0a\2\u08bb\u08c1\5\u00ba^\2\u08bc\u08c1\5\u00bc"+
		"_\2\u08bd\u08c1\5\u0132\u009a\2\u08be\u08c1\5\u0134\u009b\2\u08bf\u08c1"+
		"\5\u0130\u0099\2\u08c0\u08ba\3\2\2\2\u08c0\u08bb\3\2\2\2\u08c0\u08bc\3"+
		"\2\2\2\u08c0\u08bd\3\2\2\2\u08c0\u08be\3\2\2\2\u08c0\u08bf\3\2\2\2\u08c1"+
		"\u012f\3\2\2\2\u08c2\u08c4\7~\2\2\u08c3\u08c2\3\2\2\2\u08c3\u08c4\3\2"+
		"\2\2\u08c4\u08c5\3\2\2\2\u08c5\u08c7\7\26\2\2\u08c6\u08c8\5\u0136\u009c"+
		"\2\u08c7\u08c6\3\2\2\2\u08c7\u08c8\3\2\2\2\u08c8\u08c9\3\2\2\2\u08c9\u08ca"+
		"\7\27\2\2\u08ca\u0131\3\2\2\2\u08cb\u08cd\7~\2\2\u08cc\u08cb\3\2\2\2\u08cc"+
		"\u08cd\3\2\2\2\u08cd\u08d6\3\2\2\2\u08ce\u08cf\7+\2\2\u08cf\u08d0\5\u013e"+
		"\u00a0\2\u08d0\u08d1\7)\2\2\u08d1\u08d7\3\2\2\2\u08d2\u08d7\7.\2\2\u08d3"+
		"\u08d4\7+\2\2\u08d4\u08d5\7\21\2\2\u08d5\u08d7\7)\2\2\u08d6\u08ce\3\2"+
		"\2\2\u08d6\u08d2\3\2\2\2\u08d6\u08d3\3\2\2\2\u08d7\u0133\3\2\2\2\u08d8"+
		"\u08da\7\32\2\2\u08d9\u08db\5\u0138\u009d\2\u08da\u08d9\3\2\2\2\u08da"+
		"\u08db\3\2\2\2\u08db\u08dc\3\2\2\2\u08dc\u08dd\7\33\2\2\u08dd\u0135\3"+
		"\2\2\2\u08de\u08df\5\\/\2\u08df\u08e8\7\23\2\2\u08e0\u08e5\5\\/\2\u08e1"+
		"\u08e2\7\23\2\2\u08e2\u08e4\5\\/\2\u08e3\u08e1\3\2\2\2\u08e4\u08e7\3\2"+
		"\2\2\u08e5\u08e3\3\2\2\2\u08e5\u08e6\3\2\2\2\u08e6\u08e9\3\2\2\2\u08e7"+
		"\u08e5\3\2\2\2\u08e8\u08e0\3\2\2\2\u08e8\u08e9\3\2\2\2\u08e9\u0137\3\2"+
		"\2\2\u08ea\u08ef\5\u013a\u009e\2\u08eb\u08ec\7\23\2\2\u08ec\u08ee\5\u013a"+
		"\u009e\2\u08ed\u08eb\3\2\2\2\u08ee\u08f1\3\2\2\2\u08ef\u08ed\3\2\2\2\u08ef"+
		"\u08f0\3\2\2\2\u08f0\u0139\3\2\2\2\u08f1\u08ef\3\2\2\2\u08f2\u08f3\5\u013c"+
		"\u009f\2\u08f3\u08f4\7\21\2\2\u08f4\u08f5\5\\/\2\u08f5\u013b\3\2\2\2\u08f6"+
		"\u08f9\5\u00d6l\2\u08f7\u08f9\7\u00b1\2\2\u08f8\u08f6\3\2\2\2\u08f8\u08f7"+
		"\3\2\2\2\u08f9\u013d\3\2\2\2\u08fa\u08ff\5\u0140\u00a1\2\u08fb\u08fc\7"+
		"\23\2\2\u08fc\u08fe\5\u0140\u00a1\2\u08fd\u08fb\3\2\2\2\u08fe\u0901\3"+
		"\2\2\2\u08ff\u08fd\3\2\2\2\u08ff\u0900\3\2\2\2\u0900\u013f\3\2\2\2\u0901"+
		"\u08ff\3\2\2\2\u0902\u0903\5\u0142\u00a2\2\u0903\u0904\7\21\2\2\u0904"+
		"\u0905\5\\/\2\u0905\u0141\3\2\2\2\u0906\u0909\5\u00d6l\2\u0907\u0909\7"+
		"\u00b1\2\2\u0908\u0906\3\2\2\2\u0908\u0907\3\2\2\2\u0909\u0143\3\2\2\2"+
		"\u090a\u090b\5\\/\2\u090b\u090c\7\21\2\2\u090c\u090d\5\\/\2\u090d\u0914"+
		"\3\2\2\2\u090e\u090f\5\\/\2\u090f\u0910\7\21\2\2\u0910\u0914\3\2\2\2\u0911"+
		"\u0912\7\21\2\2\u0912\u0914\5\\/\2\u0913\u090a\3\2\2\2\u0913\u090e\3\2"+
		"\2\2\u0913\u0911\3\2\2\2\u0914\u0145\3\2\2\2\u0915\u0916\5\u00e0q\2\u0916"+
		"\u0917\5\u016c\u00b7\2\u0917\u0918\5\\/\2\u0918\u0147\3\2\2\2\u0919\u091a"+
		"\b\u00a5\1\2\u091a\u091b\5\u00e0q\2\u091b\u0920\3\2\2\2\u091c\u091d\f"+
		"\3\2\2\u091d\u091f\5\u008aF\2\u091e\u091c\3\2\2\2\u091f\u0922\3\2\2\2"+
		"\u0920\u091e\3\2\2\2\u0920\u0921\3\2\2\2\u0921\u0149\3\2\2\2\u0922\u0920"+
		"\3\2\2\2\u0923\u0924\6\u00a6\66\3\u0924\u0925\7\u00ad\2\2\u0925\u0928"+
		"\5\u00f2z\2\u0926\u0928\5\\/\2\u0927\u0923\3\2\2\2\u0927\u0926\3\2\2\2"+
		"\u0928\u014b\3\2\2\2\u0929\u092a\5\u014e\u00a8\2\u092a\u092b\5\\/\2\u092b"+
		"\u0932\3\2\2\2\u092c\u092d\5\u014e\u00a8\2\u092d\u092e\7\32\2\2\u092e"+
		"\u092f\5\u0118\u008d\2\u092f\u0930\7\33\2\2\u0930\u0932\3\2\2\2\u0931"+
		"\u0929\3\2\2\2\u0931\u092c\3\2\2\2\u0932\u014d\3\2\2\2\u0933\u0934\5\u0150"+
		"\u00a9\2\u0934\u0935\5\u0092J\2\u0935\u0936\7\66\2\2\u0936\u0937\5\u0092"+
		"J\2\u0937\u014f\3\2\2\2\u0938\u093f\5\u00e0q\2\u0939\u093b\7\26\2\2\u093a"+
		"\u093c\5\u0108\u0085\2\u093b\u093a\3\2\2\2\u093b\u093c\3\2\2\2\u093c\u093d"+
		"\3\2\2\2\u093d\u093f\7\27\2\2\u093e\u0938\3\2\2\2\u093e\u0939\3\2\2\2"+
		"\u093f\u0151\3\2\2\2\u0940\u0943\5h\65\2\u0941\u0943\5\u014c\u00a7\2\u0942"+
		"\u0940\3\2\2\2\u0942\u0941\3\2\2\2\u0943\u0153\3\2\2\2\u0944\u0945\7\u008c"+
		"\2\2\u0945\u0946\7E\2\2\u0946\u0947\7r\2\2\u0947\u0948\5\\/\2\u0948\u0155"+
		"\3\2\2\2\u0949\u094a\7\u008c\2\2\u094a\u094b\7M\2\2\u094b\u094c\7r\2\2"+
		"\u094c\u094d\5\\/\2\u094d\u0157\3\2\2\2\u094e\u094f\7\u008c\2\2\u094f"+
		"\u0950\7\u0085\2\2\u0950\u0951\7r\2\2\u0951\u0952\5\\/\2\u0952\u0159\3"+
		"\2\2\2\u0953\u0958\5\u015c\u00af\2\u0954\u0955\7\23\2\2\u0955\u0957\5"+
		"\u015c\u00af\2\u0956\u0954\3\2\2\2\u0957\u095a\3\2\2\2\u0958\u0956\3\2"+
		"\2\2\u0958\u0959\3\2\2\2\u0959\u015b\3\2\2\2\u095a\u0958\3\2\2\2\u095b"+
		"\u0960\5\u00e0q\2\u095c\u095d\7\25\2\2\u095d\u095f\5\u00e0q\2\u095e\u095c"+
		"\3\2\2\2\u095f\u0962\3\2\2\2\u0960\u095e\3\2\2\2\u0960\u0961\3\2\2\2\u0961"+
		"\u0964\3\2\2\2\u0962\u0960\3\2\2\2\u0963\u0965\t\b\2\2\u0964\u0963\3\2"+
		"\2\2\u0964\u0965\3\2\2\2\u0965\u015d\3\2\2\2\u0966\u096d\7\"\2\2\u0967"+
		"\u096d\7#\2\2\u0968\u096d\5\u016e\u00b8\2\u0969\u096d\5\u0170\u00b9\2"+
		"\u096a\u096d\5\u0172\u00ba\2\u096b\u096d\5\u0174\u00bb\2\u096c\u0966\3"+
		"\2\2\2\u096c\u0967\3\2\2\2\u096c\u0968\3\2\2\2\u096c\u0969\3\2\2\2\u096c"+
		"\u096a\3\2\2\2\u096c\u096b\3\2\2\2\u096d\u015f\3\2\2\2\u096e\u096f\t\t"+
		"\2\2\u096f\u0161\3\2\2\2\u0970\u0971\7\u00ad\2\2\u0971\u0972\6\u00b2\67"+
		"\3\u0972\u0163\3\2\2\2\u0973\u0974\7\u00ad\2\2\u0974\u0975\6\u00b38\3"+
		"\u0975\u0165\3\2\2\2\u0976\u0977\7\u00ad\2\2\u0977\u0978\6\u00b49\3\u0978"+
		"\u0167\3\2\2\2\u0979\u097a\7\u00ad\2\2\u097a\u097b\6\u00b5:\3\u097b\u0169"+
		"\3\2\2\2\u097c\u097d\7\u00ad\2\2\u097d\u097e\6\u00b6;\3\u097e\u016b\3"+
		"\2\2\2\u097f\u0980\7/\2\2\u0980\u016d\3\2\2\2\u0981\u0982\7$\2\2\u0982"+
		"\u016f\3\2\2\2\u0983\u0984\7%\2\2\u0984\u0171\3\2\2\2\u0985\u0986\7&\2"+
		"\2\u0986\u0173\3\2\2\2\u0987\u0988\t\n\2\2\u0988\u0175\3\2\2\2\u0989\u098a"+
		"\7\u008f\2\2\u098a\u098b\5\u0178\u00bd\2\u098b\u098c\7\22\2\2\u098c\u0991"+
		"\3\2\2\2\u098d\u098e\5\u0178\u00bd\2\u098e\u098f\7\22\2\2\u098f\u0991"+
		"\3\2\2\2\u0990\u0989\3";
	private static final String _serializedATNSegment1 =
		"\2\2\2\u0990\u098d\3\2\2\2\u0991\u0177\3\2\2\2\u0992\u0993\b\u00bd\1\2"+
		"\u0993\u0994\5\u017a\u00be\2\u0994\u0999\3\2\2\2\u0995\u0996\f\3\2\2\u0996"+
		"\u0998\5\u0180\u00c1\2\u0997\u0995\3\2\2\2\u0998\u099b\3\2\2\2\u0999\u0997"+
		"\3\2\2\2\u0999\u099a\3\2\2\2\u099a\u0179\3\2\2\2\u099b\u0999\3\2\2\2\u099c"+
		"\u09a4\5\u017c\u00bf\2\u099d\u09a4\5\u017e\u00c0\2\u099e\u09a4\5\u0188"+
		"\u00c5\2\u099f\u09a4\5\u018a\u00c6\2\u09a0\u09a4\5\u018c\u00c7\2\u09a1"+
		"\u09a4\5\u0182\u00c2\2\u09a2\u09a4\5\u0186\u00c4\2\u09a3\u099c\3\2\2\2"+
		"\u09a3\u099d\3\2\2\2\u09a3\u099e\3\2\2\2\u09a3\u099f\3\2\2\2\u09a3\u09a0"+
		"\3\2\2\2\u09a3\u09a1\3\2\2\2\u09a3\u09a2\3\2\2\2\u09a4\u017b\3\2\2\2\u09a5"+
		"\u09a6\5\u0126\u0094\2\u09a6\u017d\3\2\2\2\u09a7\u09a8\5\u0162\u00b2\2"+
		"\u09a8\u09a9\5\u0182\u00c2\2\u09a9\u017f\3\2\2\2\u09aa\u09ab\7\25\2\2"+
		"\u09ab\u09b0\5\u0182\u00c2\2\u09ac\u09ad\7\25\2\2\u09ad\u09b0\5\u018e"+
		"\u00c8\2\u09ae\u09b0\5\u0186\u00c4\2\u09af\u09aa\3\2\2\2\u09af\u09ac\3"+
		"\2\2\2\u09af\u09ae\3\2\2\2\u09b0\u0181\3\2\2\2\u09b1\u09b2\5\u018e\u00c8"+
		"\2\u09b2\u09b4\7\26\2\2\u09b3\u09b5\5\u0184\u00c3\2\u09b4\u09b3\3\2\2"+
		"\2\u09b4\u09b5\3\2\2\2\u09b5\u09b6\3\2\2\2\u09b6\u09b7\7\27\2\2\u09b7"+
		"\u0183\3\2\2\2\u09b8\u09b9\b\u00c3\1\2\u09b9\u09ba\5\u0178\u00bd\2\u09ba"+
		"\u09c0\3\2\2\2\u09bb\u09bc\f\3\2\2\u09bc\u09bd\7\23\2\2\u09bd\u09bf\5"+
		"\u0178\u00bd\2\u09be\u09bb\3\2\2\2\u09bf\u09c2\3\2\2\2\u09c0\u09be\3\2"+
		"\2\2\u09c0\u09c1\3\2\2\2\u09c1\u0185\3\2\2\2\u09c2\u09c0\3\2\2\2\u09c3"+
		"\u09c4\7\30\2\2\u09c4\u09c5\5\u0178\u00bd\2\u09c5\u09c6\7\31\2\2\u09c6"+
		"\u0187\3\2\2\2\u09c7\u09c8\7\26\2\2\u09c8\u09c9\5\u0178\u00bd\2\u09c9"+
		"\u09ca\7\27\2\2\u09ca\u0189\3\2\2\2\u09cb\u09cc\5\u018e\u00c8\2\u09cc"+
		"\u018b\3\2\2\2\u09cd\u09d3\7\u00b3\2\2\u09ce\u09d3\7\u00b5\2\2\u09cf\u09d3"+
		"\7\u00b1\2\2\u09d0\u09d3\7\u00a7\2\2\u09d1\u09d3\7\u00a8\2\2\u09d2\u09cd"+
		"\3\2\2\2\u09d2\u09ce\3\2\2\2\u09d2\u09cf\3\2\2\2\u09d2\u09d0\3\2\2\2\u09d2"+
		"\u09d1\3\2\2\2\u09d3\u018d\3\2\2\2\u09d4\u09da\7\u00ad\2\2\u09d5\u09da"+
		"\7\u00ab\2\2\u09d6\u09da\7\u00af\2\2\u09d7\u09da\7\u00ac\2\2\u09d8\u09da"+
		"\5\u0160\u00b1\2\u09d9\u09d4\3\2\2\2\u09d9\u09d5\3\2\2\2\u09d9\u09d6\3"+
		"\2\2\2\u09d9\u09d7\3\2\2\2\u09d9\u09d8\3\2\2\2\u09da\u018f\3\2\2\2\u09db"+
		"\u09dc\7\u008f\2\2\u09dc\u09df\5\u0192\u00ca\2\u09dd\u09df\5\u0192\u00ca"+
		"\2\u09de\u09db\3\2\2\2\u09de\u09dd\3\2\2\2\u09df\u0191\3\2\2\2\u09e0\u09e1"+
		"\b\u00ca\1\2\u09e1\u09e2\5\u0194\u00cb\2\u09e2\u09e7\3\2\2\2\u09e3\u09e4"+
		"\f\3\2\2\u09e4\u09e6\5\u0198\u00cd\2\u09e5\u09e3\3\2\2\2\u09e6\u09e9\3"+
		"\2\2\2\u09e7\u09e5\3\2\2\2\u09e7\u09e8\3\2\2\2\u09e8\u0193\3\2\2\2\u09e9"+
		"\u09e7\3\2\2\2\u09ea\u09f0\5\u0196\u00cc\2\u09eb\u09f0\5\u01a2\u00d2\2"+
		"\u09ec\u09f0\5\u01a4\u00d3\2\u09ed\u09f0\5\u01a6\u00d4\2\u09ee\u09f0\5"+
		"\u019a\u00ce\2\u09ef\u09ea\3\2\2\2\u09ef\u09eb\3\2\2\2\u09ef\u09ec\3\2"+
		"\2\2\u09ef\u09ed\3\2\2\2\u09ef\u09ee\3\2\2\2\u09f0\u0195\3\2\2\2\u09f1"+
		"\u09f2\5\u0126\u0094\2\u09f2\u0197\3\2\2\2\u09f3\u09f4\7\25\2\2\u09f4"+
		"\u09fa\5\u019a\u00ce\2\u09f5\u09f6\7\30\2\2\u09f6\u09f7\5\u0192\u00ca"+
		"\2\u09f7\u09f8\7\31\2\2\u09f8\u09fa\3\2\2\2\u09f9\u09f3\3\2\2\2\u09f9"+
		"\u09f5\3\2\2\2\u09fa\u0199\3\2\2\2\u09fb\u09fc\5\u01a8\u00d5\2\u09fc\u09fe"+
		"\7\26\2\2\u09fd\u09ff\5\u019c\u00cf\2\u09fe\u09fd\3\2\2\2\u09fe\u09ff"+
		"\3\2\2\2\u09ff\u0a00\3\2\2\2\u0a00\u0a01\7\27\2\2\u0a01\u019b\3\2\2\2"+
		"\u0a02\u0a09\5\u019e\u00d0\2\u0a03\u0a09\5\u01a0\u00d1\2\u0a04\u0a05\5"+
		"\u019e\u00d0\2\u0a05\u0a06\7\23\2\2\u0a06\u0a07\5\u01a0\u00d1\2\u0a07"+
		"\u0a09\3\2\2\2\u0a08\u0a02\3\2\2\2\u0a08\u0a03\3\2\2\2\u0a08\u0a04\3\2"+
		"\2\2\u0a09\u019d\3\2\2\2\u0a0a\u0a0b\b\u00d0\1\2\u0a0b\u0a0c\5\u0192\u00ca"+
		"\2\u0a0c\u0a12\3\2\2\2\u0a0d\u0a0e\f\3\2\2\u0a0e\u0a0f\7\23\2\2\u0a0f"+
		"\u0a11\5\u0192\u00ca\2\u0a10\u0a0d\3\2\2\2\u0a11\u0a14\3\2\2\2\u0a12\u0a10"+
		"\3\2\2\2\u0a12\u0a13\3\2\2\2\u0a13\u019f\3\2\2\2\u0a14\u0a12\3\2\2\2\u0a15"+
		"\u0a16\b\u00d1\1\2\u0a16\u0a17\5\u01a8\u00d5\2\u0a17\u0a18\7/\2\2\u0a18"+
		"\u0a19\5\u0192\u00ca\2\u0a19\u0a22\3\2\2\2\u0a1a\u0a1b\f\3\2\2\u0a1b\u0a1c"+
		"\7\23\2\2\u0a1c\u0a1d\5\u01a8\u00d5\2\u0a1d\u0a1e\7/\2\2\u0a1e\u0a1f\5"+
		"\u0192\u00ca\2\u0a1f\u0a21\3\2\2\2\u0a20\u0a1a\3\2\2\2\u0a21\u0a24\3\2"+
		"\2\2\u0a22\u0a20\3\2\2\2\u0a22\u0a23\3\2\2\2\u0a23\u01a1\3\2\2\2\u0a24"+
		"\u0a22\3\2\2\2\u0a25\u0a26\7\26\2\2\u0a26\u0a27\5\u0192\u00ca\2\u0a27"+
		"\u0a28\7\27\2\2\u0a28\u01a3\3\2\2\2\u0a29\u0a2a\b\u00d3\1\2\u0a2a\u0a2d"+
		"\7\u00af\2\2\u0a2b\u0a2d\5\u01a8\u00d5\2\u0a2c\u0a29\3\2\2\2\u0a2c\u0a2b"+
		"\3\2\2\2\u0a2d\u0a33\3\2\2\2\u0a2e\u0a2f\f\3\2\2\u0a2f\u0a30\7\25\2\2"+
		"\u0a30\u0a32\5\u01a8\u00d5\2\u0a31\u0a2e\3\2\2\2\u0a32\u0a35\3\2\2\2\u0a33"+
		"\u0a31\3\2\2\2\u0a33\u0a34\3\2\2\2\u0a34\u01a5\3\2\2\2\u0a35\u0a33\3\2"+
		"\2\2\u0a36\u0a3c\7\u00b3\2\2\u0a37\u0a3c\7\u00b5\2\2\u0a38\u0a3c\7\u00b1"+
		"\2\2\u0a39\u0a3c\7\u00a7\2\2\u0a3a\u0a3c\7\u00a8\2\2\u0a3b\u0a36\3\2\2"+
		"\2\u0a3b\u0a37\3\2\2\2\u0a3b\u0a38\3\2\2\2\u0a3b\u0a39\3\2\2\2\u0a3b\u0a3a"+
		"\3\2\2\2\u0a3c\u01a7\3\2\2\2\u0a3d\u0a43\7\u00ad\2\2\u0a3e\u0a43\7\u00ab"+
		"\2\2\u0a3f\u0a43\7\u00af\2\2\u0a40\u0a43\7\u00ac\2\2\u0a41\u0a43\5\u0160"+
		"\u00b1\2\u0a42\u0a3d\3\2\2\2\u0a42\u0a3e\3\2\2\2\u0a42\u0a3f\3\2\2\2\u0a42"+
		"\u0a40\3\2\2\2\u0a42\u0a41\3\2\2\2\u0a43\u01a9\3\2\2\2\u0a44\u0a45\7\u008f"+
		"\2\2\u0a45\u0a46\5\u01ac\u00d7\2\u0a46\u0a47\7\22\2\2\u0a47\u0a4c\3\2"+
		"\2\2\u0a48\u0a49\5\u01ac\u00d7\2\u0a49\u0a4a\7\22\2\2\u0a4a\u0a4c\3\2"+
		"\2\2\u0a4b\u0a44\3\2\2\2\u0a4b\u0a48\3\2\2\2\u0a4c\u01ab\3\2\2\2\u0a4d"+
		"\u0a4e\b\u00d7\1\2\u0a4e\u0a4f\5\u01ae\u00d8\2\u0a4f\u0a54\3\2\2\2\u0a50"+
		"\u0a51\f\3\2\2\u0a51\u0a53\5\u01b4\u00db\2\u0a52\u0a50\3\2\2\2\u0a53\u0a56"+
		"\3\2\2\2\u0a54\u0a52\3\2\2\2\u0a54\u0a55\3\2\2\2\u0a55\u01ad\3\2\2\2\u0a56"+
		"\u0a54\3\2\2\2\u0a57\u0a5d\5\u01b0\u00d9\2\u0a58\u0a5d\5\u01b2\u00da\2"+
		"\u0a59\u0a5d\5\u01bc\u00df\2\u0a5a\u0a5d\5\u01be\u00e0\2\u0a5b\u0a5d\5"+
		"\u01c2\u00e2\2\u0a5c\u0a57\3\2\2\2\u0a5c\u0a58\3\2\2\2\u0a5c\u0a59\3\2"+
		"\2\2\u0a5c\u0a5a\3\2\2\2\u0a5c\u0a5b\3\2\2\2\u0a5d\u01af\3\2\2\2\u0a5e"+
		"\u0a5f\5\u0126\u0094\2\u0a5f\u01b1\3\2\2\2\u0a60\u0a61\5\u0162\u00b2\2"+
		"\u0a61\u0a62\5\u01b6\u00dc\2\u0a62\u01b3\3\2\2\2\u0a63\u0a64\7\25\2\2"+
		"\u0a64\u0a67\5\u01b6\u00dc\2\u0a65\u0a67\5\u01ba\u00de\2\u0a66\u0a63\3"+
		"\2\2\2\u0a66\u0a65\3\2\2\2\u0a67\u01b5\3\2\2\2\u0a68\u0a69\5\u01c4\u00e3"+
		"\2\u0a69\u0a6b\7\26\2\2\u0a6a\u0a6c\5\u01b8\u00dd\2\u0a6b\u0a6a\3\2\2"+
		"\2\u0a6b\u0a6c\3\2\2\2\u0a6c\u0a6d\3\2\2\2\u0a6d\u0a6e\7\27\2\2\u0a6e"+
		"\u01b7\3\2\2\2\u0a6f\u0a70\b\u00dd\1\2\u0a70\u0a71\5\u01ac\u00d7\2\u0a71"+
		"\u0a77\3\2\2\2\u0a72\u0a73\f\3\2\2\u0a73\u0a74\7\23\2\2\u0a74\u0a76\5"+
		"\u01ac\u00d7\2\u0a75\u0a72\3\2\2\2\u0a76\u0a79\3\2\2\2\u0a77\u0a75\3\2"+
		"\2\2\u0a77\u0a78\3\2\2\2\u0a78\u01b9\3\2\2\2\u0a79\u0a77\3\2\2\2\u0a7a"+
		"\u0a7b\7\30\2\2\u0a7b\u0a7c\5\u01ac\u00d7\2\u0a7c\u0a7d\7\31\2\2\u0a7d"+
		"\u01bb\3\2\2\2\u0a7e\u0a7f\7\26\2\2\u0a7f\u0a80\5\u01ac\u00d7\2\u0a80"+
		"\u0a81\7\27\2\2\u0a81\u01bd\3\2\2\2\u0a82\u0a83\b\u00e0\1\2\u0a83\u0a84"+
		"\5\u01c4\u00e3\2\u0a84\u0a8a\3\2\2\2\u0a85\u0a86\f\3\2\2\u0a86\u0a87\7"+
		"\25\2\2\u0a87\u0a89\5\u01c4\u00e3\2\u0a88\u0a85\3\2\2\2\u0a89\u0a8c\3"+
		"\2\2\2\u0a8a\u0a88\3\2\2\2\u0a8a\u0a8b\3\2\2\2\u0a8b\u01bf\3\2\2\2\u0a8c"+
		"\u0a8a\3\2\2\2\u0a8d\u0a8e\b\u00e1\1\2\u0a8e\u0a8f\5\u01be\u00e0\2\u0a8f"+
		"\u0a94\3\2\2\2\u0a90\u0a91\f\3\2\2\u0a91\u0a93\7\u00af\2\2\u0a92\u0a90"+
		"\3\2\2\2\u0a93\u0a96\3\2\2\2\u0a94\u0a92\3\2\2\2\u0a94\u0a95\3\2\2\2\u0a95"+
		"\u01c1\3\2\2\2\u0a96\u0a94\3\2\2\2\u0a97\u0a9d\7\u00b3\2\2\u0a98\u0a9d"+
		"\7\u00b5\2\2\u0a99\u0a9d\7\u00b1\2\2\u0a9a\u0a9d\7\u00a7\2\2\u0a9b\u0a9d"+
		"\7\u00a8\2\2\u0a9c\u0a97\3\2\2\2\u0a9c\u0a98\3\2\2\2\u0a9c\u0a99\3\2\2"+
		"\2\u0a9c\u0a9a\3\2\2\2\u0a9c\u0a9b\3\2\2\2\u0a9d\u01c3\3\2\2\2\u0a9e\u0aa4"+
		"\7\u00ad\2\2\u0a9f\u0aa4\7\u00ab\2\2\u0aa0\u0aa4\7\u00af\2\2\u0aa1\u0aa4"+
		"\7\u00ac\2\2\u0aa2\u0aa4\5\u0160\u00b1\2\u0aa3\u0a9e\3\2\2\2\u0aa3\u0a9f"+
		"\3\2\2\2\u0aa3\u0aa0\3\2\2\2\u0aa3\u0aa1\3\2\2\2\u0aa3\u0aa2\3\2\2\2\u0aa4"+
		"\u01c5\3\2\2\2\u0aa5\u0aa6\7\u008f\2\2\u0aa6\u0aa7\5\u01c8\u00e5\2\u0aa7"+
		"\u0aa8\7\22\2\2\u0aa8\u0aad\3\2\2\2\u0aa9\u0aaa\5\u01c8\u00e5\2\u0aaa"+
		"\u0aab\7\22\2\2\u0aab\u0aad\3\2\2\2\u0aac\u0aa5\3\2\2\2\u0aac\u0aa9\3"+
		"\2\2\2\u0aad\u01c7\3\2\2\2\u0aae\u0aaf\b\u00e5\1\2\u0aaf\u0ab0\5\u01ca"+
		"\u00e6\2\u0ab0\u0ab5\3\2\2\2\u0ab1\u0ab2\f\3\2\2\u0ab2\u0ab4\5\u01d0\u00e9"+
		"\2\u0ab3\u0ab1\3\2\2\2\u0ab4\u0ab7\3\2\2\2\u0ab5\u0ab3\3\2\2\2\u0ab5\u0ab6"+
		"\3\2\2\2\u0ab6\u01c9\3\2\2\2\u0ab7\u0ab5\3\2\2\2\u0ab8\u0abe\5\u01cc\u00e7"+
		"\2\u0ab9\u0abe\5\u01ce\u00e8\2\u0aba\u0abe\5\u01d8\u00ed\2\u0abb\u0abe"+
		"\5\u01da\u00ee\2\u0abc\u0abe\5\u01dc\u00ef\2\u0abd\u0ab8\3\2\2\2\u0abd"+
		"\u0ab9\3\2\2\2\u0abd\u0aba\3\2\2\2\u0abd\u0abb\3\2\2\2\u0abd\u0abc\3\2"+
		"\2\2\u0abe\u01cb\3\2\2\2\u0abf\u0ac0\5\u0126\u0094\2\u0ac0\u01cd\3\2\2"+
		"\2\u0ac1\u0ac2\5\u0162\u00b2\2\u0ac2\u0ac3\5\u01d2\u00ea\2\u0ac3\u01cf"+
		"\3\2\2\2\u0ac4\u0ac5\7\25\2\2\u0ac5\u0ac8\5\u01d2\u00ea\2\u0ac6\u0ac8"+
		"\5\u01d6\u00ec\2\u0ac7\u0ac4\3\2\2\2\u0ac7\u0ac6\3\2\2\2\u0ac8\u01d1\3"+
		"\2\2\2\u0ac9\u0aca\5\u01de\u00f0\2\u0aca\u0acc\7\26\2\2\u0acb\u0acd\5"+
		"\u01d4\u00eb\2\u0acc\u0acb\3\2\2\2\u0acc\u0acd\3\2\2\2\u0acd\u0ace\3\2"+
		"\2\2\u0ace\u0acf\7\27\2\2\u0acf\u01d3\3\2\2\2\u0ad0\u0ad1\b\u00eb\1\2"+
		"\u0ad1\u0ad2\5\u01c8\u00e5\2\u0ad2\u0ad8\3\2\2\2\u0ad3\u0ad4\f\3\2\2\u0ad4"+
		"\u0ad5\7\23\2\2\u0ad5\u0ad7\5\u01c8\u00e5\2\u0ad6\u0ad3\3\2\2\2\u0ad7"+
		"\u0ada\3\2\2\2\u0ad8\u0ad6\3\2\2\2\u0ad8\u0ad9\3\2\2\2\u0ad9\u01d5\3\2"+
		"\2\2\u0ada\u0ad8\3\2\2\2\u0adb\u0adc\7\30\2\2\u0adc\u0add\5\u01c8\u00e5"+
		"\2\u0add\u0ade\7\31\2\2\u0ade\u01d7\3\2\2\2\u0adf\u0ae0\7\26\2\2\u0ae0"+
		"\u0ae1\5\u01c8\u00e5\2\u0ae1\u0ae2\7\27\2\2\u0ae2\u01d9\3\2\2\2\u0ae3"+
		"\u0ae4\b\u00ee\1\2\u0ae4\u0ae7\7\u00af\2\2\u0ae5\u0ae7\5\u01de\u00f0\2"+
		"\u0ae6\u0ae3\3\2\2\2\u0ae6\u0ae5\3\2\2\2\u0ae7\u0aed\3\2\2\2\u0ae8\u0ae9"+
		"\f\3\2\2\u0ae9\u0aea\7\25\2\2\u0aea\u0aec\5\u01de\u00f0\2\u0aeb\u0ae8"+
		"\3\2\2\2\u0aec\u0aef\3\2\2\2\u0aed\u0aeb\3\2\2\2\u0aed\u0aee\3\2\2\2\u0aee"+
		"\u01db\3\2\2\2\u0aef\u0aed\3\2\2\2\u0af0\u0af6\7\u00b3\2\2\u0af1\u0af6"+
		"\7\u00b5\2\2\u0af2\u0af6\7\u00b1\2\2\u0af3\u0af6\7\u00a7\2\2\u0af4\u0af6"+
		"\7\u00a8\2\2\u0af5\u0af0\3\2\2\2\u0af5\u0af1\3\2\2\2\u0af5\u0af2\3\2\2"+
		"\2\u0af5\u0af3\3\2\2\2\u0af5\u0af4\3\2\2\2\u0af6\u01dd\3\2\2\2\u0af7\u0afd"+
		"\7\u00ad\2\2\u0af8\u0afd\7\u00ab\2\2\u0af9\u0afd\7\u00af\2\2\u0afa\u0afd"+
		"\7\u00ac\2\2\u0afb\u0afd\5\u0160\u00b1\2\u0afc\u0af7\3\2\2\2\u0afc\u0af8"+
		"\3\2\2\2\u0afc\u0af9\3\2\2\2\u0afc\u0afa\3\2\2\2\u0afc\u0afb\3\2\2\2\u0afd"+
		"\u01df\3\2\2\2\u0afe\u0b01\5\u01e2\u00f2\2\u0aff\u0b01\5\u01e4\u00f3\2"+
		"\u0b00\u0afe\3\2\2\2\u0b00\u0aff\3\2\2\2\u0b01\u01e1\3\2\2\2\u0b02\u0b0a"+
		"\5\u01ea\u00f6\2\u0b03\u0b05\5\u01ec\u00f7\2\u0b04\u0b06\5\u01f8\u00fd"+
		"\2\u0b05\u0b04\3\2\2\2\u0b05\u0b06\3\2\2\2\u0b06\u0b07\3\2\2\2\u0b07\u0b08"+
		"\5\u01ee\u00f8\2\u0b08\u0b0a\3\2\2\2\u0b09\u0b02\3\2\2\2\u0b09\u0b03\3"+
		"\2\2\2\u0b0a\u01e3\3\2\2\2\u0b0b\u0b0c\5\u01e6\u00f4\2\u0b0c\u0b0e\5\u0092"+
		"J\2\u0b0d\u0b0f\5\u01f8\u00fd\2\u0b0e\u0b0d\3\2\2\2\u0b0e\u0b0f\3\2\2"+
		"\2\u0b0f\u0b10\3\2\2\2\u0b10\u0b11\5\u0092J\2\u0b11\u0b12\5\u01e8\u00f5"+
		"\2\u0b12\u01e5\3\2\2\2\u0b13\u0b14\7+\2\2\u0b14\u0b17\7)\2\2\u0b15\u0b17"+
		"\7-\2\2\u0b16\u0b13\3\2\2\2\u0b16\u0b15\3\2\2\2\u0b17\u01e7\3\2\2\2\u0b18"+
		"\u0b19\7+\2\2\u0b19\u0b1a\7%\2\2\u0b1a\u0b1b\7)\2\2\u0b1b\u01e9\3\2\2"+
		"\2\u0b1c\u0b1d\7+\2\2\u0b1d\u0b1e\5\u01f0\u00f9\2\u0b1e\u0b22\5\u0092"+
		"J\2\u0b1f\u0b21\5\u01f4\u00fb\2\u0b20\u0b1f\3\2\2\2\u0b21\u0b24\3\2\2"+
		"\2\u0b22\u0b20\3\2\2\2\u0b22\u0b23\3\2\2\2\u0b23\u0b25\3\2\2\2\u0b24\u0b22"+
		"\3\2\2\2\u0b25\u0b26\7%\2\2\u0b26\u0b27\7)\2\2\u0b27\u01eb\3\2\2\2\u0b28"+
		"\u0b29\7+\2\2\u0b29\u0b2a\5\u01f0\u00f9\2\u0b2a\u0b2e\5\u0092J\2\u0b2b"+
		"\u0b2d\5\u01f4\u00fb\2\u0b2c\u0b2b\3\2\2\2\u0b2d\u0b30\3\2\2\2\u0b2e\u0b2c"+
		"\3\2\2\2\u0b2e\u0b2f\3\2\2\2\u0b2f\u0b31\3\2\2\2\u0b30\u0b2e\3\2\2\2\u0b31"+
		"\u0b32\7)\2\2\u0b32\u01ed\3\2\2\2\u0b33\u0b34\7+\2\2\u0b34\u0b35\7%\2"+
		"\2\u0b35\u0b36\5\u01f0\u00f9\2\u0b36\u0b37\7)\2\2\u0b37\u01ef\3\2\2\2"+
		"\u0b38\u0b3d\5\u01f2\u00fa\2\u0b39\u0b3a\7\25\2\2\u0b3a\u0b3c\5\u01f2"+
		"\u00fa\2\u0b3b\u0b39\3\2\2\2\u0b3c\u0b3f\3\2\2\2\u0b3d\u0b3b\3\2\2\2\u0b3d"+
		"\u0b3e\3\2\2\2\u0b3e\u01f1\3\2\2\2\u0b3f\u0b3d\3\2\2\2\u0b40\u0b44\5\u00d6"+
		"l\2\u0b41\u0b43\5\u00d8m\2\u0b42\u0b41\3\2\2\2\u0b43\u0b46\3\2\2\2\u0b44"+
		"\u0b42\3\2\2\2\u0b44\u0b45\3\2\2\2\u0b45\u01f3\3\2\2\2\u0b46\u0b44\3\2"+
		"\2\2\u0b47\u0b4a\5\u01f2\u00fa\2\u0b48\u0b49\7/\2\2\u0b49\u0b4b\5\u01f6"+
		"\u00fc\2\u0b4a\u0b48\3\2\2\2\u0b4a\u0b4b\3\2\2\2\u0b4b\u0b4c\3\2\2\2\u0b4c"+
		"\u0b4d\5\u0092J\2\u0b4d\u01f5\3\2\2\2\u0b4e\u0b54\7\u00b1\2\2\u0b4f\u0b50"+
		"\7\32\2\2\u0b50\u0b51\5\\/\2\u0b51\u0b52\7\33\2\2\u0b52\u0b54\3\2\2\2"+
		"\u0b53\u0b4e\3\2\2\2\u0b53\u0b4f\3\2\2\2\u0b54\u01f7\3\2\2\2\u0b55\u0b57"+
		"\5\u01fa\u00fe\2\u0b56\u0b55\3\2\2\2\u0b57\u0b58\3\2\2\2\u0b58\u0b56\3"+
		"\2\2\2\u0b58\u0b59\3\2\2\2\u0b59\u01f9\3\2\2\2\u0b5a\u0b62\5\u01fc\u00ff"+
		"\2\u0b5b\u0b62\5\u01e2\u00f2\2\u0b5c\u0b5e\7\32\2\2\u0b5d\u0b5f\5\\/\2"+
		"\u0b5e\u0b5d\3\2\2\2\u0b5e\u0b5f\3\2\2\2\u0b5f\u0b60\3\2\2\2\u0b60\u0b62"+
		"\7\33\2\2\u0b61\u0b5a\3\2\2\2\u0b61\u0b5b\3\2\2\2\u0b61\u0b5c\3\2\2\2"+
		"\u0b62\u01fb\3\2\2\2\u0b63\u0b65\5\u01fe\u0100\2\u0b64\u0b63\3\2\2\2\u0b65"+
		"\u0b66\3\2\2\2\u0b66\u0b64\3\2\2\2\u0b66\u0b67\3\2\2\2\u0b67\u01fd\3\2"+
		"\2\2\u0b68\u0b6b\n\13\2\2\u0b69\u0b6b\7\u00bb\2\2\u0b6a\u0b68\3\2\2\2"+
		"\u0b6a\u0b69\3\2\2\2\u0b6b\u01ff\3\2\2\2\u0b6c\u0b6e\7\32\2\2\u0b6d\u0b6f"+
		"\5\u0202\u0102\2\u0b6e\u0b6d\3\2\2\2\u0b6f\u0b70\3\2\2\2\u0b70\u0b6e\3"+
		"\2\2\2\u0b70\u0b71\3\2\2\2\u0b71\u0b72\3\2\2\2\u0b72\u0b73\7\33\2\2\u0b73"+
		"\u0201\3\2\2\2\u0b74\u0b75\5\u0204\u0103\2\u0b75\u0b76\7\21\2\2\u0b76"+
		"\u0b77\5\u0206\u0104\2\u0b77\u0b78\7\22\2\2\u0b78\u0203\3\2\2\2\u0b79"+
		"\u0b7a\b\u0103\1\2\u0b7a\u0b7e\5\u00d6l\2\u0b7b\u0b7c\7#\2\2\u0b7c\u0b7e"+
		"\5\u00dan\2\u0b7d\u0b79\3\2\2\2\u0b7d\u0b7b\3\2\2\2\u0b7e\u0b87\3\2\2"+
		"\2\u0b7f\u0b81\f\3\2\2\u0b80\u0b82\5\u00d8m\2\u0b81\u0b80\3\2\2\2\u0b82"+
		"\u0b83\3\2\2\2\u0b83\u0b81\3\2\2\2\u0b83\u0b84\3\2\2\2\u0b84\u0b86\3\2"+
		"\2\2\u0b85\u0b7f\3\2\2\2\u0b86\u0b89\3\2\2\2\u0b87\u0b85\3\2\2\2\u0b87"+
		"\u0b88\3\2\2\2\u0b88\u0205\3\2\2\2\u0b89\u0b87\3\2\2\2\u0b8a\u0b8b\7\32"+
		"\2\2\u0b8b\u0b8c\5\\/\2\u0b8c\u0b8d\7\33\2\2\u0b8d\u0b90\3\2\2\2\u0b8e"+
		"\u0b90\5\u0208\u0105\2\u0b8f\u0b8a\3\2\2\2\u0b8f\u0b8e\3\2\2\2\u0b90\u0207"+
		"\3\2\2\2\u0b91\u0b93\n\f\2\2\u0b92\u0b91\3\2\2\2\u0b93\u0b94\3\2\2\2\u0b94"+
		"\u0b95\3\2\2\2\u0b94\u0b92\3\2\2\2\u0b95\u0209\3\2\2\2\u010f\u0210\u0217"+
		"\u0235\u023b\u0240\u0246\u0248\u024b\u0252\u025b\u0274\u0278\u0283\u028c"+
		"\u029b\u02a4\u02ab\u02b5\u02cb\u02e2\u02ef\u02fa\u0308\u030e\u0319\u0327"+
		"\u033b\u0346\u0348\u0351\u0355\u0358\u0360\u0364\u0367\u036e\u0376\u037b"+
		"\u037f\u039a\u03a1\u03a6\u03aa\u03c1\u03ca\u03ce\u03d6\u03da\u03dd\u03e2"+
		"\u03e9\u03ec\u040d\u0420\u0427\u0449\u0452\u0469\u0479\u047e\u0486\u048f"+
		"\u04a6\u04ac\u04b6\u04d1\u0538\u0544\u0546\u0550\u0562\u056b\u057b\u0585"+
		"\u058b\u0595\u059a\u059c\u05a2\u05a4\u05a6\u05b4\u05bc\u05c3\u05c7\u05d2"+
		"\u05d6\u05db\u05dd\u05e2\u05f1\u05f5\u0600\u0604\u0609\u0613\u0623\u062b"+
		"\u0632\u0634\u0639\u063b\u0646\u064c\u065c\u0665\u066b\u0670\u0676\u067d"+
		"\u068b\u068e\u0699\u06a1\u06a9\u06b2\u06bc\u06bf\u06c3\u06cf\u06d5\u06dd"+
		"\u06e6\u06ee\u06fb\u06fe\u0702\u0707\u070b\u0714\u0729\u0732\u0734\u0739"+
		"\u074c\u0751\u075a\u075e\u0765\u076a\u076e\u077a\u078b\u0790\u0793\u0797"+
		"\u079c\u07a3\u07ae\u07b0\u07b9\u07c1\u07c9\u07d1\u07d9\u07df\u07eb\u07ef"+
		"\u07f9\u0801\u0805\u080b\u0812\u0817\u081e\u0826\u082d\u0837\u0844\u0848"+
		"\u084b\u084f\u0852\u085a\u0863\u086c\u0875\u0886\u088b\u0894\u089f\u08a6"+
		"\u08ae\u08b8\u08c0\u08c3\u08c7\u08cc\u08d6\u08da\u08e5\u08e8\u08ef\u08f8"+
		"\u08ff\u0908\u0913\u0920\u0927\u0931\u093b\u093e\u0942\u0958\u0960\u0964"+
		"\u096c\u0990\u0999\u09a3\u09af\u09b4\u09c0\u09d2\u09d9\u09de\u09e7\u09ef"+
		"\u09f9\u09fe\u0a08\u0a12\u0a22\u0a2c\u0a33\u0a3b\u0a42\u0a4b\u0a54\u0a5c"+
		"\u0a66\u0a6b\u0a77\u0a8a\u0a94\u0a9c\u0aa3\u0aac\u0ab5\u0abd\u0ac7\u0acc"+
		"\u0ad8\u0ae6\u0aed\u0af5\u0afc\u0b00\u0b05\u0b09\u0b0e\u0b16\u0b22\u0b2e"+
		"\u0b3d\u0b44\u0b4a\u0b53\u0b58\u0b5e\u0b61\u0b66\u0b6a\u0b70\u0b7d\u0b83"+
		"\u0b87\u0b8f\u0b94";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}