// Generated from OParser.g4 by ANTLR 4.9.3
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
public class OParser extends AbstractParser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SPACE=1, WS=2, LF=3, COMMENT=4, JAVA=5, CSHARP=6, PYTHON2=7, PYTHON3=8, 
		JAVASCRIPT=9, SWIFT=10, COLON=11, SEMI=12, COMMA=13, RANGE=14, DOT=15, 
		LPAR=16, RPAR=17, LBRAK=18, RBRAK=19, LCURL=20, RCURL=21, QMARK=22, XMARK=23, 
		AMP=24, AMP2=25, PIPE=26, PIPE2=27, PLUS=28, MINUS=29, STAR=30, SLASH=31, 
		BSLASH=32, PERCENT=33, SHARP=34, GT=35, GTE=36, LT=37, LTE=38, LTGT=39, 
		LTCOLONGT=40, EQ=41, XEQ=42, EQ2=43, TEQ=44, TILDE=45, LARROW=46, RARROW=47, 
		EGT=48, BOOLEAN=49, CSS=50, CHARACTER=51, TEXT=52, INTEGER=53, DECIMAL=54, 
		DATE=55, TIME=56, DATETIME=57, PERIOD=58, VERSION=59, METHOD_COLON=60, 
		CODE=61, DOCUMENT=62, BLOB=63, IMAGE=64, UUID=65, DBID=66, ITERATOR=67, 
		CURSOR=68, HTML=69, TYPE=70, ABSTRACT=71, ALL=72, ALWAYS=73, AND=74, ANY=75, 
		AS=76, ASC=77, ATTR=78, ATTRIBUTE=79, ATTRIBUTES=80, BINDINGS=81, BREAK=82, 
		BY=83, CASE=84, CATCH=85, CATEGORY=86, CLASS=87, CONTAINS=88, DEF=89, 
		DEFAULT=90, DEFINE=91, DELETE=92, DESC=93, DO=94, DOING=95, EACH=96, ELSE=97, 
		ENUM=98, ENUMERATED=99, EXCEPT=100, EXECUTE=101, EXPECTING=102, EXTENDS=103, 
		FETCH=104, FILTERED=105, FINALLY=106, FLUSH=107, FOR=108, FROM=109, GETTER=110, 
		HAS=111, IF=112, IN=113, INCLUDE=114, INDEX=115, INVOKE_COLON=116, IS=117, 
		MATCHING=118, METHOD=119, METHODS=120, MODULO=121, MUTABLE=122, NATIVE=123, 
		NONE=124, NOT=125, NOTHING=126, NULL=127, ON=128, ONE=129, OPERATOR=130, 
		OR=131, ORDER=132, OTHERWISE=133, PASS=134, RAISE=135, READ=136, RECEIVING=137, 
		RESOURCE=138, RETURN=139, RETURNING=140, ROWS=141, SELF=142, SETTER=143, 
		SINGLETON=144, SORTED=145, STORABLE=146, STORE=147, SUPER=148, SWITCH=149, 
		TEST=150, THEN=151, THIS=152, THROW=153, TO=154, TRY=155, VERIFYING=156, 
		WIDGET=157, WITH=158, WHEN=159, WHERE=160, WHILE=161, WRITE=162, BOOLEAN_LITERAL=163, 
		CHAR_LITERAL=164, MIN_INTEGER=165, MAX_INTEGER=166, SYMBOL_IDENTIFIER=167, 
		TYPE_IDENTIFIER=168, VARIABLE_IDENTIFIER=169, NATIVE_IDENTIFIER=170, DOLLAR_IDENTIFIER=171, 
		ARONDBASE_IDENTIFIER=172, TEXT_LITERAL=173, UUID_LITERAL=174, VERSION_LITERAL=175, 
		INTEGER_LITERAL=176, HEXA_LITERAL=177, DECIMAL_LITERAL=178, DATETIME_LITERAL=179, 
		TIME_LITERAL=180, DATE_LITERAL=181, PERIOD_LITERAL=182, JSX_TEXT=183;
	public static final int
		RULE_enum_category_declaration = 0, RULE_enum_native_declaration = 1, 
		RULE_category_symbol = 2, RULE_native_symbol = 3, RULE_attribute_declaration = 4, 
		RULE_concrete_widget_declaration = 5, RULE_native_widget_declaration = 6, 
		RULE_concrete_category_declaration = 7, RULE_singleton_category_declaration = 8, 
		RULE_derived_list = 9, RULE_category_method_list = 10, RULE_operator_method_declaration = 11, 
		RULE_setter_method_declaration = 12, RULE_native_setter_declaration = 13, 
		RULE_getter_method_declaration = 14, RULE_native_getter_declaration = 15, 
		RULE_native_resource_declaration = 16, RULE_native_category_declaration = 17, 
		RULE_native_category_bindings = 18, RULE_native_category_binding_list = 19, 
		RULE_abstract_method_declaration = 20, RULE_concrete_method_declaration = 21, 
		RULE_native_method_declaration = 22, RULE_test_method_declaration = 23, 
		RULE_assertion = 24, RULE_typed_argument = 25, RULE_statement_or_list = 26, 
		RULE_statement = 27, RULE_flush_statement = 28, RULE_store_statement = 29, 
		RULE_with_resource_statement = 30, RULE_with_singleton_statement = 31, 
		RULE_switch_statement = 32, RULE_switch_case_statement = 33, RULE_for_each_statement = 34, 
		RULE_do_while_statement = 35, RULE_while_statement = 36, RULE_if_statement = 37, 
		RULE_else_if_statement_list = 38, RULE_raise_statement = 39, RULE_try_statement = 40, 
		RULE_catch_statement = 41, RULE_break_statement = 42, RULE_return_statement = 43, 
		RULE_method_call_expression = 44, RULE_method_call_statement = 45, RULE_x_expression = 46, 
		RULE_expression = 47, RULE_filter_expression = 48, RULE_an_expression = 49, 
		RULE_type_expression = 50, RULE_selectable_expression = 51, RULE_instance_expression = 52, 
		RULE_mutable_instance_expression = 53, RULE_method_expression = 54, RULE_blob_expression = 55, 
		RULE_document_expression = 56, RULE_write_statement = 57, RULE_filtered_list_expression = 58, 
		RULE_fetch_expression = 59, RULE_fetch_statement = 60, RULE_then = 61, 
		RULE_read_statement = 62, RULE_sorted_expression = 63, RULE_instance_selector = 64, 
		RULE_constructor_expression = 65, RULE_copy_from = 66, RULE_argument_assignment_list = 67, 
		RULE_argument_assignment = 68, RULE_assign_instance_statement = 69, RULE_child_instance = 70, 
		RULE_assign_tuple_statement = 71, RULE_type_literal = 72, RULE_null_literal = 73, 
		RULE_ws_plus = 74, RULE_repl = 75, RULE_declaration_list = 76, RULE_declarations = 77, 
		RULE_declaration = 78, RULE_annotation_constructor = 79, RULE_annotation_identifier = 80, 
		RULE_annotation_argument = 81, RULE_annotation_argument_name = 82, RULE_annotation_argument_value = 83, 
		RULE_resource_declaration = 84, RULE_enum_declaration = 85, RULE_native_symbol_list = 86, 
		RULE_category_symbol_list = 87, RULE_symbol_list = 88, RULE_attribute_constraint = 89, 
		RULE_list_literal = 90, RULE_set_literal = 91, RULE_expression_list = 92, 
		RULE_range_literal = 93, RULE_typedef = 94, RULE_primary_type = 95, RULE_native_type = 96, 
		RULE_category_type = 97, RULE_mutable_category_type = 98, RULE_code_type = 99, 
		RULE_category_declaration = 100, RULE_widget_declaration = 101, RULE_type_identifier_list = 102, 
		RULE_method_identifier = 103, RULE_identifier_or_keyword = 104, RULE_nospace_hyphen_identifier_or_keyword = 105, 
		RULE_nospace_identifier_or_keyword = 106, RULE_identifier = 107, RULE_member_identifier = 108, 
		RULE_variable_identifier = 109, RULE_attribute_identifier = 110, RULE_type_identifier = 111, 
		RULE_symbol_identifier = 112, RULE_argument_list = 113, RULE_argument = 114, 
		RULE_operator_argument = 115, RULE_named_argument = 116, RULE_code_argument = 117, 
		RULE_category_or_any_type = 118, RULE_any_type = 119, RULE_member_method_declaration_list = 120, 
		RULE_member_method_declaration = 121, RULE_native_member_method_declaration_list = 122, 
		RULE_native_member_method_declaration = 123, RULE_native_category_binding = 124, 
		RULE_python_category_binding = 125, RULE_python_module = 126, RULE_javascript_category_binding = 127, 
		RULE_javascript_module = 128, RULE_variable_identifier_list = 129, RULE_attribute_identifier_list = 130, 
		RULE_method_declaration = 131, RULE_comment_statement = 132, RULE_native_statement_list = 133, 
		RULE_native_statement = 134, RULE_python_native_statement = 135, RULE_javascript_native_statement = 136, 
		RULE_statement_list = 137, RULE_assertion_list = 138, RULE_switch_case_statement_list = 139, 
		RULE_catch_statement_list = 140, RULE_literal_collection = 141, RULE_atomic_literal = 142, 
		RULE_literal_list_literal = 143, RULE_this_expression = 144, RULE_super_expression = 145, 
		RULE_parenthesis_expression = 146, RULE_literal_expression = 147, RULE_collection_literal = 148, 
		RULE_tuple_literal = 149, RULE_dict_literal = 150, RULE_document_literal = 151, 
		RULE_expression_tuple = 152, RULE_doc_entry_list = 153, RULE_doc_entry = 154, 
		RULE_doc_key = 155, RULE_dict_entry_list = 156, RULE_dict_entry = 157, 
		RULE_dict_key = 158, RULE_slice_arguments = 159, RULE_assign_variable_statement = 160, 
		RULE_assignable_instance = 161, RULE_is_expression = 162, RULE_metadata = 163, 
		RULE_arrow_expression = 164, RULE_arrow_prefix = 165, RULE_arrow_args = 166, 
		RULE_sorted_key = 167, RULE_read_blob_expression = 168, RULE_read_all_expression = 169, 
		RULE_read_one_expression = 170, RULE_order_by_list = 171, RULE_order_by = 172, 
		RULE_include_list = 173, RULE_operator = 174, RULE_keyword = 175, RULE_new_token = 176, 
		RULE_key_token = 177, RULE_module_token = 178, RULE_value_token = 179, 
		RULE_symbols_token = 180, RULE_assign = 181, RULE_multiply = 182, RULE_divide = 183, 
		RULE_idivide = 184, RULE_modulo = 185, RULE_lfs = 186, RULE_lfp = 187, 
		RULE_javascript_statement = 188, RULE_javascript_expression = 189, RULE_javascript_primary_expression = 190, 
		RULE_javascript_this_expression = 191, RULE_javascript_new_expression = 192, 
		RULE_javascript_selector_expression = 193, RULE_javascript_method_expression = 194, 
		RULE_javascript_arguments = 195, RULE_javascript_item_expression = 196, 
		RULE_javascript_parenthesis_expression = 197, RULE_javascript_identifier_expression = 198, 
		RULE_javascript_literal_expression = 199, RULE_javascript_identifier = 200, 
		RULE_python_statement = 201, RULE_python_expression = 202, RULE_python_primary_expression = 203, 
		RULE_python_self_expression = 204, RULE_python_selector_expression = 205, 
		RULE_python_method_expression = 206, RULE_python_argument_list = 207, 
		RULE_python_ordinal_argument_list = 208, RULE_python_named_argument_list = 209, 
		RULE_python_parenthesis_expression = 210, RULE_python_identifier_expression = 211, 
		RULE_python_literal_expression = 212, RULE_python_identifier = 213, RULE_java_statement = 214, 
		RULE_java_expression = 215, RULE_java_primary_expression = 216, RULE_java_this_expression = 217, 
		RULE_java_new_expression = 218, RULE_java_selector_expression = 219, RULE_java_method_expression = 220, 
		RULE_java_arguments = 221, RULE_java_item_expression = 222, RULE_java_parenthesis_expression = 223, 
		RULE_java_identifier_expression = 224, RULE_java_class_identifier_expression = 225, 
		RULE_java_literal_expression = 226, RULE_java_identifier = 227, RULE_csharp_statement = 228, 
		RULE_csharp_expression = 229, RULE_csharp_primary_expression = 230, RULE_csharp_this_expression = 231, 
		RULE_csharp_new_expression = 232, RULE_csharp_selector_expression = 233, 
		RULE_csharp_method_expression = 234, RULE_csharp_arguments = 235, RULE_csharp_item_expression = 236, 
		RULE_csharp_parenthesis_expression = 237, RULE_csharp_identifier_expression = 238, 
		RULE_csharp_literal_expression = 239, RULE_csharp_identifier = 240, RULE_jsx_expression = 241, 
		RULE_jsx_element = 242, RULE_jsx_fragment = 243, RULE_jsx_fragment_start = 244, 
		RULE_jsx_fragment_end = 245, RULE_jsx_self_closing = 246, RULE_jsx_opening = 247, 
		RULE_jsx_closing = 248, RULE_jsx_element_name = 249, RULE_jsx_identifier = 250, 
		RULE_jsx_attribute = 251, RULE_jsx_attribute_value = 252, RULE_jsx_children = 253, 
		RULE_jsx_child = 254, RULE_jsx_text = 255, RULE_jsx_char = 256, RULE_css_expression = 257, 
		RULE_css_field = 258, RULE_css_identifier = 259, RULE_css_value = 260, 
		RULE_css_text = 261;
	private static String[] makeRuleNames() {
		return new String[] {
			"enum_category_declaration", "enum_native_declaration", "category_symbol", 
			"native_symbol", "attribute_declaration", "concrete_widget_declaration", 
			"native_widget_declaration", "concrete_category_declaration", "singleton_category_declaration", 
			"derived_list", "category_method_list", "operator_method_declaration", 
			"setter_method_declaration", "native_setter_declaration", "getter_method_declaration", 
			"native_getter_declaration", "native_resource_declaration", "native_category_declaration", 
			"native_category_bindings", "native_category_binding_list", "abstract_method_declaration", 
			"concrete_method_declaration", "native_method_declaration", "test_method_declaration", 
			"assertion", "typed_argument", "statement_or_list", "statement", "flush_statement", 
			"store_statement", "with_resource_statement", "with_singleton_statement", 
			"switch_statement", "switch_case_statement", "for_each_statement", "do_while_statement", 
			"while_statement", "if_statement", "else_if_statement_list", "raise_statement", 
			"try_statement", "catch_statement", "break_statement", "return_statement", 
			"method_call_expression", "method_call_statement", "x_expression", "expression", 
			"filter_expression", "an_expression", "type_expression", "selectable_expression", 
			"instance_expression", "mutable_instance_expression", "method_expression", 
			"blob_expression", "document_expression", "write_statement", "filtered_list_expression", 
			"fetch_expression", "fetch_statement", "then", "read_statement", "sorted_expression", 
			"instance_selector", "constructor_expression", "copy_from", "argument_assignment_list", 
			"argument_assignment", "assign_instance_statement", "child_instance", 
			"assign_tuple_statement", "type_literal", "null_literal", "ws_plus", 
			"repl", "declaration_list", "declarations", "declaration", "annotation_constructor", 
			"annotation_identifier", "annotation_argument", "annotation_argument_name", 
			"annotation_argument_value", "resource_declaration", "enum_declaration", 
			"native_symbol_list", "category_symbol_list", "symbol_list", "attribute_constraint", 
			"list_literal", "set_literal", "expression_list", "range_literal", "typedef", 
			"primary_type", "native_type", "category_type", "mutable_category_type", 
			"code_type", "category_declaration", "widget_declaration", "type_identifier_list", 
			"method_identifier", "identifier_or_keyword", "nospace_hyphen_identifier_or_keyword", 
			"nospace_identifier_or_keyword", "identifier", "member_identifier", "variable_identifier", 
			"attribute_identifier", "type_identifier", "symbol_identifier", "argument_list", 
			"argument", "operator_argument", "named_argument", "code_argument", "category_or_any_type", 
			"any_type", "member_method_declaration_list", "member_method_declaration", 
			"native_member_method_declaration_list", "native_member_method_declaration", 
			"native_category_binding", "python_category_binding", "python_module", 
			"javascript_category_binding", "javascript_module", "variable_identifier_list", 
			"attribute_identifier_list", "method_declaration", "comment_statement", 
			"native_statement_list", "native_statement", "python_native_statement", 
			"javascript_native_statement", "statement_list", "assertion_list", "switch_case_statement_list", 
			"catch_statement_list", "literal_collection", "atomic_literal", "literal_list_literal", 
			"this_expression", "super_expression", "parenthesis_expression", "literal_expression", 
			"collection_literal", "tuple_literal", "dict_literal", "document_literal", 
			"expression_tuple", "doc_entry_list", "doc_entry", "doc_key", "dict_entry_list", 
			"dict_entry", "dict_key", "slice_arguments", "assign_variable_statement", 
			"assignable_instance", "is_expression", "metadata", "arrow_expression", 
			"arrow_prefix", "arrow_args", "sorted_key", "read_blob_expression", "read_all_expression", 
			"read_one_expression", "order_by_list", "order_by", "include_list", "operator", 
			"keyword", "new_token", "key_token", "module_token", "value_token", "symbols_token", 
			"assign", "multiply", "divide", "idivide", "modulo", "lfs", "lfp", "javascript_statement", 
			"javascript_expression", "javascript_primary_expression", "javascript_this_expression", 
			"javascript_new_expression", "javascript_selector_expression", "javascript_method_expression", 
			"javascript_arguments", "javascript_item_expression", "javascript_parenthesis_expression", 
			"javascript_identifier_expression", "javascript_literal_expression", 
			"javascript_identifier", "python_statement", "python_expression", "python_primary_expression", 
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
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", null, null, null, "'Java:'", "'C#:'", "'Python2:'", "'Python3:'", 
			"'JavaScript:'", "'Swift:'", "':'", "';'", null, "'..'", null, null, 
			null, null, null, null, null, null, "'!'", "'&'", "'&&'", "'|'", "'||'", 
			null, "'-'", "'*'", "'/'", "'\\'", "'%'", "'#'", "'>'", "'>='", "'<'", 
			"'<='", "'<>'", "'<:>'", "'='", "'!='", "'=='", "'~='", "'~'", "'<-'", 
			"'->'", "'=>'", "'Boolean'", "'Css'", "'Character'", "'Text'", "'Integer'", 
			"'Decimal'", "'Date'", "'Time'", "'DateTime'", "'Period'", "'Version'", 
			"'Method:'", "'Code'", "'Document'", "'Blob'", "'Image'", "'Uuid'", "'DbId'", 
			"'Iterator'", "'Cursor'", "'Html'", "'Type'", "'abstract'", "'all'", 
			"'always'", "'and'", "'any'", "'as'", null, "'attr'", "'attribute'", 
			"'attributes'", "'bindings'", "'break'", "'by'", "'case'", "'catch'", 
			"'category'", "'class'", "'contains'", "'def'", "'default'", "'define'", 
			"'delete'", null, "'do'", "'doing'", "'each'", "'else'", "'enum'", "'enumerated'", 
			"'except'", "'execute'", "'expecting'", "'extends'", "'fetch'", "'filtered'", 
			"'finally'", "'flush'", "'for'", "'from'", "'getter'", "'has'", "'if'", 
			"'in'", "'include'", "'index'", "'invoke:'", "'is'", "'matching'", "'method'", 
			"'methods'", "'modulo'", "'mutable'", "'native'", "'None'", "'not'", 
			null, "'null'", "'on'", "'one'", "'operator'", "'or'", "'order'", "'otherwise'", 
			"'pass'", "'raise'", "'read'", "'receiving'", "'resource'", "'return'", 
			"'returning'", "'rows'", "'self'", "'setter'", "'singleton'", "'sorted'", 
			"'storable'", "'store'", "'super'", "'switch'", "'test'", "'then'", "'this'", 
			"'throw'", "'to'", "'try'", "'verifying'", "'widget'", "'with'", "'when'", 
			"'where'", "'while'", "'write'", null, null, "'MIN_INTEGER'", "'MAX_INTEGER'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SPACE", "WS", "LF", "COMMENT", "JAVA", "CSHARP", "PYTHON2", "PYTHON3", 
			"JAVASCRIPT", "SWIFT", "COLON", "SEMI", "COMMA", "RANGE", "DOT", "LPAR", 
			"RPAR", "LBRAK", "RBRAK", "LCURL", "RCURL", "QMARK", "XMARK", "AMP", 
			"AMP2", "PIPE", "PIPE2", "PLUS", "MINUS", "STAR", "SLASH", "BSLASH", 
			"PERCENT", "SHARP", "GT", "GTE", "LT", "LTE", "LTGT", "LTCOLONGT", "EQ", 
			"XEQ", "EQ2", "TEQ", "TILDE", "LARROW", "RARROW", "EGT", "BOOLEAN", "CSS", 
			"CHARACTER", "TEXT", "INTEGER", "DECIMAL", "DATE", "TIME", "DATETIME", 
			"PERIOD", "VERSION", "METHOD_COLON", "CODE", "DOCUMENT", "BLOB", "IMAGE", 
			"UUID", "DBID", "ITERATOR", "CURSOR", "HTML", "TYPE", "ABSTRACT", "ALL", 
			"ALWAYS", "AND", "ANY", "AS", "ASC", "ATTR", "ATTRIBUTE", "ATTRIBUTES", 
			"BINDINGS", "BREAK", "BY", "CASE", "CATCH", "CATEGORY", "CLASS", "CONTAINS", 
			"DEF", "DEFAULT", "DEFINE", "DELETE", "DESC", "DO", "DOING", "EACH", 
			"ELSE", "ENUM", "ENUMERATED", "EXCEPT", "EXECUTE", "EXPECTING", "EXTENDS", 
			"FETCH", "FILTERED", "FINALLY", "FLUSH", "FOR", "FROM", "GETTER", "HAS", 
			"IF", "IN", "INCLUDE", "INDEX", "INVOKE_COLON", "IS", "MATCHING", "METHOD", 
			"METHODS", "MODULO", "MUTABLE", "NATIVE", "NONE", "NOT", "NOTHING", "NULL", 
			"ON", "ONE", "OPERATOR", "OR", "ORDER", "OTHERWISE", "PASS", "RAISE", 
			"READ", "RECEIVING", "RESOURCE", "RETURN", "RETURNING", "ROWS", "SELF", 
			"SETTER", "SINGLETON", "SORTED", "STORABLE", "STORE", "SUPER", "SWITCH", 
			"TEST", "THEN", "THIS", "THROW", "TO", "TRY", "VERIFYING", "WIDGET", 
			"WITH", "WHEN", "WHERE", "WHILE", "WRITE", "BOOLEAN_LITERAL", "CHAR_LITERAL", 
			"MIN_INTEGER", "MAX_INTEGER", "SYMBOL_IDENTIFIER", "TYPE_IDENTIFIER", 
			"VARIABLE_IDENTIFIER", "NATIVE_IDENTIFIER", "DOLLAR_IDENTIFIER", "ARONDBASE_IDENTIFIER", 
			"TEXT_LITERAL", "UUID_LITERAL", "VERSION_LITERAL", "INTEGER_LITERAL", 
			"HEXA_LITERAL", "DECIMAL_LITERAL", "DATETIME_LITERAL", "TIME_LITERAL", 
			"DATE_LITERAL", "PERIOD_LITERAL", "JSX_TEXT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "OParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public OParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Enum_category_declarationContext extends ParserRuleContext {
		public Type_identifierContext name;
		public Attribute_identifier_listContext attrs;
		public Type_identifierContext derived;
		public Category_symbol_listContext symbols;
		public TerminalNode ENUMERATED() { return getToken(OParser.ENUMERATED, 0); }
		public TerminalNode CATEGORY() { return getToken(OParser.CATEGORY, 0); }
		public TerminalNode LCURL() { return getToken(OParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(OParser.RCURL, 0); }
		public List<Type_identifierContext> type_identifier() {
			return getRuleContexts(Type_identifierContext.class);
		}
		public Type_identifierContext type_identifier(int i) {
			return getRuleContext(Type_identifierContext.class,i);
		}
		public Category_symbol_listContext category_symbol_list() {
			return getRuleContext(Category_symbol_listContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public TerminalNode EXTENDS() { return getToken(OParser.EXTENDS, 0); }
		public Attribute_identifier_listContext attribute_identifier_list() {
			return getRuleContext(Attribute_identifier_listContext.class,0);
		}
		public Enum_category_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_category_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterEnum_category_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitEnum_category_declaration(this);
		}
	}

	public final Enum_category_declarationContext enum_category_declaration() throws RecognitionException {
		Enum_category_declarationContext _localctx = new Enum_category_declarationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_enum_category_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			match(ENUMERATED);
			setState(525);
			match(CATEGORY);
			setState(526);
			((Enum_category_declarationContext)_localctx).name = type_identifier();
			setState(531);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(527);
				match(LPAR);
				setState(528);
				((Enum_category_declarationContext)_localctx).attrs = attribute_identifier_list();
				setState(529);
				match(RPAR);
				}
			}

			setState(535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(533);
				match(EXTENDS);
				setState(534);
				((Enum_category_declarationContext)_localctx).derived = type_identifier();
				}
			}

			setState(537);
			match(LCURL);
			setState(538);
			((Enum_category_declarationContext)_localctx).symbols = category_symbol_list();
			setState(539);
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

	public static class Enum_native_declarationContext extends ParserRuleContext {
		public Type_identifierContext name;
		public Native_typeContext typ;
		public Native_symbol_listContext symbols;
		public TerminalNode ENUMERATED() { return getToken(OParser.ENUMERATED, 0); }
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public TerminalNode LCURL() { return getToken(OParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(OParser.RCURL, 0); }
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterEnum_native_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitEnum_native_declaration(this);
		}
	}

	public final Enum_native_declarationContext enum_native_declaration() throws RecognitionException {
		Enum_native_declarationContext _localctx = new Enum_native_declarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_enum_native_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			match(ENUMERATED);
			setState(542);
			((Enum_native_declarationContext)_localctx).name = type_identifier();
			setState(543);
			match(LPAR);
			setState(544);
			((Enum_native_declarationContext)_localctx).typ = native_type();
			setState(545);
			match(RPAR);
			setState(546);
			match(LCURL);
			setState(547);
			((Enum_native_declarationContext)_localctx).symbols = native_symbol_list();
			setState(548);
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

	public static class Category_symbolContext extends ParserRuleContext {
		public Symbol_identifierContext name;
		public Argument_assignment_listContext args;
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public TerminalNode SEMI() { return getToken(OParser.SEMI, 0); }
		public Symbol_identifierContext symbol_identifier() {
			return getRuleContext(Symbol_identifierContext.class,0);
		}
		public Argument_assignment_listContext argument_assignment_list() {
			return getRuleContext(Argument_assignment_listContext.class,0);
		}
		public Category_symbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_category_symbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCategory_symbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCategory_symbol(this);
		}
	}

	public final Category_symbolContext category_symbol() throws RecognitionException {
		Category_symbolContext _localctx = new Category_symbolContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_category_symbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			((Category_symbolContext)_localctx).name = symbol_identifier();
			setState(551);
			match(LPAR);
			setState(552);
			((Category_symbolContext)_localctx).args = argument_assignment_list(0);
			setState(553);
			match(RPAR);
			setState(554);
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

	public static class Native_symbolContext extends ParserRuleContext {
		public Symbol_identifierContext name;
		public ExpressionContext exp;
		public TerminalNode EQ() { return getToken(OParser.EQ, 0); }
		public TerminalNode SEMI() { return getToken(OParser.SEMI, 0); }
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterNative_symbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitNative_symbol(this);
		}
	}

	public final Native_symbolContext native_symbol() throws RecognitionException {
		Native_symbolContext _localctx = new Native_symbolContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_native_symbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			((Native_symbolContext)_localctx).name = symbol_identifier();
			setState(557);
			match(EQ);
			setState(558);
			((Native_symbolContext)_localctx).exp = expression(0);
			setState(559);
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

	public static class Attribute_declarationContext extends ParserRuleContext {
		public Attribute_identifierContext name;
		public TypedefContext typ;
		public Attribute_constraintContext match;
		public Variable_identifier_listContext indices;
		public TerminalNode ATTRIBUTE() { return getToken(OParser.ATTRIBUTE, 0); }
		public TerminalNode COLON() { return getToken(OParser.COLON, 0); }
		public TerminalNode SEMI() { return getToken(OParser.SEMI, 0); }
		public Attribute_identifierContext attribute_identifier() {
			return getRuleContext(Attribute_identifierContext.class,0);
		}
		public TypedefContext typedef() {
			return getRuleContext(TypedefContext.class,0);
		}
		public TerminalNode STORABLE() { return getToken(OParser.STORABLE, 0); }
		public TerminalNode WITH() { return getToken(OParser.WITH, 0); }
		public TerminalNode INDEX() { return getToken(OParser.INDEX, 0); }
		public Attribute_constraintContext attribute_constraint() {
			return getRuleContext(Attribute_constraintContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public Variable_identifier_listContext variable_identifier_list() {
			return getRuleContext(Variable_identifier_listContext.class,0);
		}
		public Attribute_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterAttribute_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitAttribute_declaration(this);
		}
	}

	public final Attribute_declarationContext attribute_declaration() throws RecognitionException {
		Attribute_declarationContext _localctx = new Attribute_declarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_attribute_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STORABLE) {
				{
				setState(561);
				match(STORABLE);
				}
			}

			setState(564);
			match(ATTRIBUTE);
			setState(565);
			((Attribute_declarationContext)_localctx).name = attribute_identifier();
			setState(566);
			match(COLON);
			setState(567);
			((Attribute_declarationContext)_localctx).typ = typedef(0);
			setState(569);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IN || _la==MATCHING) {
				{
				setState(568);
				((Attribute_declarationContext)_localctx).match = attribute_constraint();
				}
			}

			setState(579);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(571);
				match(WITH);
				setState(572);
				match(INDEX);
				setState(577);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAR) {
					{
					setState(573);
					match(LPAR);
					setState(574);
					((Attribute_declarationContext)_localctx).indices = variable_identifier_list();
					setState(575);
					match(RPAR);
					}
				}

				}
			}

			setState(581);
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

	public static class Concrete_widget_declarationContext extends ParserRuleContext {
		public Type_identifierContext name;
		public Type_identifierContext derived;
		public Category_method_listContext methods;
		public TerminalNode WIDGET() { return getToken(OParser.WIDGET, 0); }
		public List<Type_identifierContext> type_identifier() {
			return getRuleContexts(Type_identifierContext.class);
		}
		public Type_identifierContext type_identifier(int i) {
			return getRuleContext(Type_identifierContext.class,i);
		}
		public Category_method_listContext category_method_list() {
			return getRuleContext(Category_method_listContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(OParser.EXTENDS, 0); }
		public Concrete_widget_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concrete_widget_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterConcrete_widget_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitConcrete_widget_declaration(this);
		}
	}

	public final Concrete_widget_declarationContext concrete_widget_declaration() throws RecognitionException {
		Concrete_widget_declarationContext _localctx = new Concrete_widget_declarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_concrete_widget_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			match(WIDGET);
			setState(584);
			((Concrete_widget_declarationContext)_localctx).name = type_identifier();
			setState(587);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(585);
				match(EXTENDS);
				setState(586);
				((Concrete_widget_declarationContext)_localctx).derived = type_identifier();
				}
			}

			setState(589);
			((Concrete_widget_declarationContext)_localctx).methods = category_method_list();
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
		public TerminalNode NATIVE() { return getToken(OParser.NATIVE, 0); }
		public TerminalNode WIDGET() { return getToken(OParser.WIDGET, 0); }
		public TerminalNode LCURL() { return getToken(OParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(OParser.RCURL, 0); }
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterNative_widget_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitNative_widget_declaration(this);
		}
	}

	public final Native_widget_declarationContext native_widget_declaration() throws RecognitionException {
		Native_widget_declarationContext _localctx = new Native_widget_declarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_native_widget_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			match(NATIVE);
			setState(592);
			match(WIDGET);
			setState(593);
			((Native_widget_declarationContext)_localctx).name = type_identifier();
			setState(594);
			match(LCURL);
			setState(595);
			((Native_widget_declarationContext)_localctx).bindings = native_category_bindings();
			setState(596);
			((Native_widget_declarationContext)_localctx).methods = native_member_method_declaration_list();
			setState(597);
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

	public static class Concrete_category_declarationContext extends ParserRuleContext {
		public Type_identifierContext name;
		public Attribute_identifier_listContext attrs;
		public Derived_listContext derived;
		public Category_method_listContext methods;
		public TerminalNode CATEGORY() { return getToken(OParser.CATEGORY, 0); }
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Category_method_listContext category_method_list() {
			return getRuleContext(Category_method_listContext.class,0);
		}
		public TerminalNode STORABLE() { return getToken(OParser.STORABLE, 0); }
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public TerminalNode EXTENDS() { return getToken(OParser.EXTENDS, 0); }
		public Attribute_identifier_listContext attribute_identifier_list() {
			return getRuleContext(Attribute_identifier_listContext.class,0);
		}
		public Derived_listContext derived_list() {
			return getRuleContext(Derived_listContext.class,0);
		}
		public Concrete_category_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concrete_category_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterConcrete_category_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitConcrete_category_declaration(this);
		}
	}

	public final Concrete_category_declarationContext concrete_category_declaration() throws RecognitionException {
		Concrete_category_declarationContext _localctx = new Concrete_category_declarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_concrete_category_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STORABLE) {
				{
				setState(599);
				match(STORABLE);
				}
			}

			setState(602);
			match(CATEGORY);
			setState(603);
			((Concrete_category_declarationContext)_localctx).name = type_identifier();
			setState(608);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(604);
				match(LPAR);
				setState(605);
				((Concrete_category_declarationContext)_localctx).attrs = attribute_identifier_list();
				setState(606);
				match(RPAR);
				}
			}

			setState(612);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(610);
				match(EXTENDS);
				setState(611);
				((Concrete_category_declarationContext)_localctx).derived = derived_list(0);
				}
			}

			setState(614);
			((Concrete_category_declarationContext)_localctx).methods = category_method_list();
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
		public Attribute_identifier_listContext attrs;
		public Category_method_listContext methods;
		public TerminalNode SINGLETON() { return getToken(OParser.SINGLETON, 0); }
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Category_method_listContext category_method_list() {
			return getRuleContext(Category_method_listContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public Attribute_identifier_listContext attribute_identifier_list() {
			return getRuleContext(Attribute_identifier_listContext.class,0);
		}
		public Singleton_category_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleton_category_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterSingleton_category_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitSingleton_category_declaration(this);
		}
	}

	public final Singleton_category_declarationContext singleton_category_declaration() throws RecognitionException {
		Singleton_category_declarationContext _localctx = new Singleton_category_declarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_singleton_category_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			match(SINGLETON);
			setState(617);
			((Singleton_category_declarationContext)_localctx).name = type_identifier();
			setState(622);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(618);
				match(LPAR);
				setState(619);
				((Singleton_category_declarationContext)_localctx).attrs = attribute_identifier_list();
				setState(620);
				match(RPAR);
				}
			}

			setState(624);
			((Singleton_category_declarationContext)_localctx).methods = category_method_list();
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
		public Derived_listContext items;
		public Type_identifierContext item;
		public TerminalNode COMMA() { return getToken(OParser.COMMA, 0); }
		public Derived_listContext derived_list() {
			return getRuleContext(Derived_listContext.class,0);
		}
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public DerivedListItemContext(Derived_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterDerivedListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitDerivedListItem(this);
		}
	}
	public static class DerivedListContext extends Derived_listContext {
		public Type_identifierContext item;
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public DerivedListContext(Derived_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterDerivedList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitDerivedList(this);
		}
	}

	public final Derived_listContext derived_list() throws RecognitionException {
		return derived_list(0);
	}

	private Derived_listContext derived_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Derived_listContext _localctx = new Derived_listContext(_ctx, _parentState);
		Derived_listContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_derived_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new DerivedListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(627);
			((DerivedListContext)_localctx).item = type_identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(634);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DerivedListItemContext(new Derived_listContext(_parentctx, _parentState));
					((DerivedListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_derived_list);
					setState(629);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(630);
					match(COMMA);
					setState(631);
					((DerivedListItemContext)_localctx).item = type_identifier();
					}
					} 
				}
				setState(636);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class Category_method_listContext extends ParserRuleContext {
		public Category_method_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_category_method_list; }
	 
		public Category_method_listContext() { }
		public void copyFrom(Category_method_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EmptyCategoryMethodListContext extends Category_method_listContext {
		public TerminalNode SEMI() { return getToken(OParser.SEMI, 0); }
		public EmptyCategoryMethodListContext(Category_method_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterEmptyCategoryMethodList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitEmptyCategoryMethodList(this);
		}
	}
	public static class CurlyCategoryMethodListContext extends Category_method_listContext {
		public Member_method_declaration_listContext items;
		public TerminalNode LCURL() { return getToken(OParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(OParser.RCURL, 0); }
		public Member_method_declaration_listContext member_method_declaration_list() {
			return getRuleContext(Member_method_declaration_listContext.class,0);
		}
		public CurlyCategoryMethodListContext(Category_method_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCurlyCategoryMethodList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCurlyCategoryMethodList(this);
		}
	}

	public final Category_method_listContext category_method_list() throws RecognitionException {
		Category_method_listContext _localctx = new Category_method_listContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_category_method_list);
		int _la;
		try {
			setState(643);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMI:
				_localctx = new EmptyCategoryMethodListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(637);
				match(SEMI);
				}
				break;
			case LCURL:
				_localctx = new CurlyCategoryMethodListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(638);
				match(LCURL);
				setState(640);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (TYPE - 64)) | (1L << (ABSTRACT - 64)) | (1L << (GETTER - 64)) | (1L << (METHOD - 64)) | (1L << (MUTABLE - 64)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (OPERATOR - 130)) | (1L << (SETTER - 130)) | (1L << (TYPE_IDENTIFIER - 130)) | (1L << (ARONDBASE_IDENTIFIER - 130)))) != 0)) {
					{
					setState(639);
					((CurlyCategoryMethodListContext)_localctx).items = member_method_declaration_list();
					}
				}

				setState(642);
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

	public static class Operator_method_declarationContext extends ParserRuleContext {
		public TypedefContext typ;
		public OperatorContext op;
		public Operator_argumentContext arg;
		public Statement_listContext stmts;
		public TerminalNode OPERATOR() { return getToken(OParser.OPERATOR, 0); }
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public TerminalNode LCURL() { return getToken(OParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(OParser.RCURL, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Operator_argumentContext operator_argument() {
			return getRuleContext(Operator_argumentContext.class,0);
		}
		public TypedefContext typedef() {
			return getRuleContext(TypedefContext.class,0);
		}
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public Operator_method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_method_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterOperator_method_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitOperator_method_declaration(this);
		}
	}

	public final Operator_method_declarationContext operator_method_declaration() throws RecognitionException {
		Operator_method_declarationContext _localctx = new Operator_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_operator_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(646);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & ((1L << (BOOLEAN - 49)) | (1L << (CSS - 49)) | (1L << (CHARACTER - 49)) | (1L << (TEXT - 49)) | (1L << (INTEGER - 49)) | (1L << (DECIMAL - 49)) | (1L << (DATE - 49)) | (1L << (TIME - 49)) | (1L << (DATETIME - 49)) | (1L << (PERIOD - 49)) | (1L << (VERSION - 49)) | (1L << (CODE - 49)) | (1L << (DOCUMENT - 49)) | (1L << (BLOB - 49)) | (1L << (IMAGE - 49)) | (1L << (UUID - 49)) | (1L << (DBID - 49)) | (1L << (ITERATOR - 49)) | (1L << (CURSOR - 49)) | (1L << (HTML - 49)) | (1L << (TYPE - 49)))) != 0) || _la==TYPE_IDENTIFIER) {
				{
				setState(645);
				((Operator_method_declarationContext)_localctx).typ = typedef(0);
				}
			}

			setState(648);
			match(OPERATOR);
			setState(649);
			((Operator_method_declarationContext)_localctx).op = operator();
			setState(650);
			match(LPAR);
			setState(651);
			((Operator_method_declarationContext)_localctx).arg = operator_argument();
			setState(652);
			match(RPAR);
			setState(653);
			match(LCURL);
			setState(655);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << LTCOLONGT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (TYPE - 64)) | (1L << (ANY - 64)) | (1L << (BREAK - 64)) | (1L << (CATEGORY - 64)) | (1L << (DELETE - 64)) | (1L << (DO - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (IF - 64)) | (1L << (METHOD - 64)) | (1L << (MUTABLE - 64)) | (1L << (NULL - 64)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (READ - 136)) | (1L << (RESOURCE - 136)) | (1L << (RETURN - 136)) | (1L << (SELF - 136)) | (1L << (SORTED - 136)) | (1L << (STORE - 136)) | (1L << (SUPER - 136)) | (1L << (SWITCH - 136)) | (1L << (THIS - 136)) | (1L << (THROW - 136)) | (1L << (TRY - 136)) | (1L << (WITH - 136)) | (1L << (WHILE - 136)) | (1L << (WRITE - 136)) | (1L << (BOOLEAN_LITERAL - 136)) | (1L << (CHAR_LITERAL - 136)) | (1L << (MIN_INTEGER - 136)) | (1L << (MAX_INTEGER - 136)) | (1L << (SYMBOL_IDENTIFIER - 136)) | (1L << (TYPE_IDENTIFIER - 136)) | (1L << (VARIABLE_IDENTIFIER - 136)) | (1L << (TEXT_LITERAL - 136)) | (1L << (UUID_LITERAL - 136)) | (1L << (VERSION_LITERAL - 136)) | (1L << (INTEGER_LITERAL - 136)) | (1L << (HEXA_LITERAL - 136)) | (1L << (DECIMAL_LITERAL - 136)) | (1L << (DATETIME_LITERAL - 136)) | (1L << (TIME_LITERAL - 136)) | (1L << (DATE_LITERAL - 136)) | (1L << (PERIOD_LITERAL - 136)))) != 0)) {
				{
				setState(654);
				((Operator_method_declarationContext)_localctx).stmts = statement_list();
				}
			}

			setState(657);
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

	public static class Setter_method_declarationContext extends ParserRuleContext {
		public Variable_identifierContext name;
		public Statement_listContext stmts;
		public TerminalNode SETTER() { return getToken(OParser.SETTER, 0); }
		public TerminalNode LCURL() { return getToken(OParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(OParser.RCURL, 0); }
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterSetter_method_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitSetter_method_declaration(this);
		}
	}

	public final Setter_method_declarationContext setter_method_declaration() throws RecognitionException {
		Setter_method_declarationContext _localctx = new Setter_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_setter_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			match(SETTER);
			setState(660);
			((Setter_method_declarationContext)_localctx).name = variable_identifier();
			setState(661);
			match(LCURL);
			setState(663);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << LTCOLONGT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (TYPE - 64)) | (1L << (ANY - 64)) | (1L << (BREAK - 64)) | (1L << (CATEGORY - 64)) | (1L << (DELETE - 64)) | (1L << (DO - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (IF - 64)) | (1L << (METHOD - 64)) | (1L << (MUTABLE - 64)) | (1L << (NULL - 64)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (READ - 136)) | (1L << (RESOURCE - 136)) | (1L << (RETURN - 136)) | (1L << (SELF - 136)) | (1L << (SORTED - 136)) | (1L << (STORE - 136)) | (1L << (SUPER - 136)) | (1L << (SWITCH - 136)) | (1L << (THIS - 136)) | (1L << (THROW - 136)) | (1L << (TRY - 136)) | (1L << (WITH - 136)) | (1L << (WHILE - 136)) | (1L << (WRITE - 136)) | (1L << (BOOLEAN_LITERAL - 136)) | (1L << (CHAR_LITERAL - 136)) | (1L << (MIN_INTEGER - 136)) | (1L << (MAX_INTEGER - 136)) | (1L << (SYMBOL_IDENTIFIER - 136)) | (1L << (TYPE_IDENTIFIER - 136)) | (1L << (VARIABLE_IDENTIFIER - 136)) | (1L << (TEXT_LITERAL - 136)) | (1L << (UUID_LITERAL - 136)) | (1L << (VERSION_LITERAL - 136)) | (1L << (INTEGER_LITERAL - 136)) | (1L << (HEXA_LITERAL - 136)) | (1L << (DECIMAL_LITERAL - 136)) | (1L << (DATETIME_LITERAL - 136)) | (1L << (TIME_LITERAL - 136)) | (1L << (DATE_LITERAL - 136)) | (1L << (PERIOD_LITERAL - 136)))) != 0)) {
				{
				setState(662);
				((Setter_method_declarationContext)_localctx).stmts = statement_list();
				}
			}

			setState(665);
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

	public static class Native_setter_declarationContext extends ParserRuleContext {
		public Variable_identifierContext name;
		public Native_statement_listContext stmts;
		public TerminalNode SETTER() { return getToken(OParser.SETTER, 0); }
		public TerminalNode LCURL() { return getToken(OParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(OParser.RCURL, 0); }
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public TerminalNode NATIVE() { return getToken(OParser.NATIVE, 0); }
		public Native_statement_listContext native_statement_list() {
			return getRuleContext(Native_statement_listContext.class,0);
		}
		public Native_setter_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_native_setter_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterNative_setter_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitNative_setter_declaration(this);
		}
	}

	public final Native_setter_declarationContext native_setter_declaration() throws RecognitionException {
		Native_setter_declarationContext _localctx = new Native_setter_declarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_native_setter_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NATIVE) {
				{
				setState(667);
				match(NATIVE);
				}
			}

			setState(670);
			match(SETTER);
			setState(671);
			((Native_setter_declarationContext)_localctx).name = variable_identifier();
			setState(672);
			match(LCURL);
			setState(674);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA) | (1L << CSHARP) | (1L << PYTHON2) | (1L << PYTHON3) | (1L << JAVASCRIPT))) != 0)) {
				{
				setState(673);
				((Native_setter_declarationContext)_localctx).stmts = native_statement_list();
				}
			}

			setState(676);
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

	public static class Getter_method_declarationContext extends ParserRuleContext {
		public Variable_identifierContext name;
		public Statement_listContext stmts;
		public TerminalNode GETTER() { return getToken(OParser.GETTER, 0); }
		public TerminalNode LCURL() { return getToken(OParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(OParser.RCURL, 0); }
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterGetter_method_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitGetter_method_declaration(this);
		}
	}

	public final Getter_method_declarationContext getter_method_declaration() throws RecognitionException {
		Getter_method_declarationContext _localctx = new Getter_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_getter_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
			match(GETTER);
			setState(679);
			((Getter_method_declarationContext)_localctx).name = variable_identifier();
			setState(680);
			match(LCURL);
			setState(682);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << LTCOLONGT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (TYPE - 64)) | (1L << (ANY - 64)) | (1L << (BREAK - 64)) | (1L << (CATEGORY - 64)) | (1L << (DELETE - 64)) | (1L << (DO - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (IF - 64)) | (1L << (METHOD - 64)) | (1L << (MUTABLE - 64)) | (1L << (NULL - 64)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (READ - 136)) | (1L << (RESOURCE - 136)) | (1L << (RETURN - 136)) | (1L << (SELF - 136)) | (1L << (SORTED - 136)) | (1L << (STORE - 136)) | (1L << (SUPER - 136)) | (1L << (SWITCH - 136)) | (1L << (THIS - 136)) | (1L << (THROW - 136)) | (1L << (TRY - 136)) | (1L << (WITH - 136)) | (1L << (WHILE - 136)) | (1L << (WRITE - 136)) | (1L << (BOOLEAN_LITERAL - 136)) | (1L << (CHAR_LITERAL - 136)) | (1L << (MIN_INTEGER - 136)) | (1L << (MAX_INTEGER - 136)) | (1L << (SYMBOL_IDENTIFIER - 136)) | (1L << (TYPE_IDENTIFIER - 136)) | (1L << (VARIABLE_IDENTIFIER - 136)) | (1L << (TEXT_LITERAL - 136)) | (1L << (UUID_LITERAL - 136)) | (1L << (VERSION_LITERAL - 136)) | (1L << (INTEGER_LITERAL - 136)) | (1L << (HEXA_LITERAL - 136)) | (1L << (DECIMAL_LITERAL - 136)) | (1L << (DATETIME_LITERAL - 136)) | (1L << (TIME_LITERAL - 136)) | (1L << (DATE_LITERAL - 136)) | (1L << (PERIOD_LITERAL - 136)))) != 0)) {
				{
				setState(681);
				((Getter_method_declarationContext)_localctx).stmts = statement_list();
				}
			}

			setState(684);
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

	public static class Native_getter_declarationContext extends ParserRuleContext {
		public Variable_identifierContext name;
		public Native_statement_listContext stmts;
		public TerminalNode GETTER() { return getToken(OParser.GETTER, 0); }
		public TerminalNode LCURL() { return getToken(OParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(OParser.RCURL, 0); }
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public TerminalNode NATIVE() { return getToken(OParser.NATIVE, 0); }
		public Native_statement_listContext native_statement_list() {
			return getRuleContext(Native_statement_listContext.class,0);
		}
		public Native_getter_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_native_getter_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterNative_getter_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitNative_getter_declaration(this);
		}
	}

	public final Native_getter_declarationContext native_getter_declaration() throws RecognitionException {
		Native_getter_declarationContext _localctx = new Native_getter_declarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_native_getter_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NATIVE) {
				{
				setState(686);
				match(NATIVE);
				}
			}

			setState(689);
			match(GETTER);
			setState(690);
			((Native_getter_declarationContext)_localctx).name = variable_identifier();
			setState(691);
			match(LCURL);
			setState(693);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA) | (1L << CSHARP) | (1L << PYTHON2) | (1L << PYTHON3) | (1L << JAVASCRIPT))) != 0)) {
				{
				setState(692);
				((Native_getter_declarationContext)_localctx).stmts = native_statement_list();
				}
			}

			setState(695);
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

	public static class Native_resource_declarationContext extends ParserRuleContext {
		public Type_identifierContext name;
		public Attribute_identifier_listContext attrs;
		public Native_category_bindingsContext bindings;
		public Native_member_method_declaration_listContext methods;
		public TerminalNode NATIVE() { return getToken(OParser.NATIVE, 0); }
		public TerminalNode RESOURCE() { return getToken(OParser.RESOURCE, 0); }
		public TerminalNode LCURL() { return getToken(OParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(OParser.RCURL, 0); }
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Native_category_bindingsContext native_category_bindings() {
			return getRuleContext(Native_category_bindingsContext.class,0);
		}
		public TerminalNode STORABLE() { return getToken(OParser.STORABLE, 0); }
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public Attribute_identifier_listContext attribute_identifier_list() {
			return getRuleContext(Attribute_identifier_listContext.class,0);
		}
		public Native_member_method_declaration_listContext native_member_method_declaration_list() {
			return getRuleContext(Native_member_method_declaration_listContext.class,0);
		}
		public Native_resource_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_native_resource_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterNative_resource_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitNative_resource_declaration(this);
		}
	}

	public final Native_resource_declarationContext native_resource_declaration() throws RecognitionException {
		Native_resource_declarationContext _localctx = new Native_resource_declarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_native_resource_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STORABLE) {
				{
				setState(697);
				match(STORABLE);
				}
			}

			setState(700);
			match(NATIVE);
			setState(701);
			match(RESOURCE);
			setState(702);
			((Native_resource_declarationContext)_localctx).name = type_identifier();
			setState(707);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(703);
				match(LPAR);
				setState(704);
				((Native_resource_declarationContext)_localctx).attrs = attribute_identifier_list();
				setState(705);
				match(RPAR);
				}
			}

			setState(709);
			match(LCURL);
			setState(710);
			((Native_resource_declarationContext)_localctx).bindings = native_category_bindings();
			setState(712);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (TYPE - 64)) | (1L << (ANY - 64)) | (1L << (GETTER - 64)) | (1L << (METHOD - 64)) | (1L << (NATIVE - 64)))) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & ((1L << (SETTER - 143)) | (1L << (TYPE_IDENTIFIER - 143)) | (1L << (ARONDBASE_IDENTIFIER - 143)))) != 0)) {
				{
				setState(711);
				((Native_resource_declarationContext)_localctx).methods = native_member_method_declaration_list();
				}
			}

			setState(714);
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

	public static class Native_category_declarationContext extends ParserRuleContext {
		public Type_identifierContext name;
		public Attribute_identifier_listContext attrs;
		public Native_category_bindingsContext bindings;
		public Native_member_method_declaration_listContext methods;
		public TerminalNode NATIVE() { return getToken(OParser.NATIVE, 0); }
		public TerminalNode CATEGORY() { return getToken(OParser.CATEGORY, 0); }
		public TerminalNode LCURL() { return getToken(OParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(OParser.RCURL, 0); }
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Native_category_bindingsContext native_category_bindings() {
			return getRuleContext(Native_category_bindingsContext.class,0);
		}
		public TerminalNode STORABLE() { return getToken(OParser.STORABLE, 0); }
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public Attribute_identifier_listContext attribute_identifier_list() {
			return getRuleContext(Attribute_identifier_listContext.class,0);
		}
		public Native_member_method_declaration_listContext native_member_method_declaration_list() {
			return getRuleContext(Native_member_method_declaration_listContext.class,0);
		}
		public Native_category_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_native_category_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterNative_category_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitNative_category_declaration(this);
		}
	}

	public final Native_category_declarationContext native_category_declaration() throws RecognitionException {
		Native_category_declarationContext _localctx = new Native_category_declarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_native_category_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(717);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STORABLE) {
				{
				setState(716);
				match(STORABLE);
				}
			}

			setState(719);
			match(NATIVE);
			setState(720);
			match(CATEGORY);
			setState(721);
			((Native_category_declarationContext)_localctx).name = type_identifier();
			setState(726);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(722);
				match(LPAR);
				setState(723);
				((Native_category_declarationContext)_localctx).attrs = attribute_identifier_list();
				setState(724);
				match(RPAR);
				}
			}

			setState(728);
			match(LCURL);
			setState(729);
			((Native_category_declarationContext)_localctx).bindings = native_category_bindings();
			setState(731);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (TYPE - 64)) | (1L << (ANY - 64)) | (1L << (GETTER - 64)) | (1L << (METHOD - 64)) | (1L << (NATIVE - 64)))) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & ((1L << (SETTER - 143)) | (1L << (TYPE_IDENTIFIER - 143)) | (1L << (ARONDBASE_IDENTIFIER - 143)))) != 0)) {
				{
				setState(730);
				((Native_category_declarationContext)_localctx).methods = native_member_method_declaration_list();
				}
			}

			setState(733);
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

	public static class Native_category_bindingsContext extends ParserRuleContext {
		public Native_category_binding_listContext items;
		public TerminalNode CATEGORY() { return getToken(OParser.CATEGORY, 0); }
		public TerminalNode BINDINGS() { return getToken(OParser.BINDINGS, 0); }
		public TerminalNode LCURL() { return getToken(OParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(OParser.RCURL, 0); }
		public Native_category_binding_listContext native_category_binding_list() {
			return getRuleContext(Native_category_binding_listContext.class,0);
		}
		public Native_category_bindingsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_native_category_bindings; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterNative_category_bindings(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitNative_category_bindings(this);
		}
	}

	public final Native_category_bindingsContext native_category_bindings() throws RecognitionException {
		Native_category_bindingsContext _localctx = new Native_category_bindingsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_native_category_bindings);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
			match(CATEGORY);
			setState(736);
			match(BINDINGS);
			setState(737);
			match(LCURL);
			setState(738);
			((Native_category_bindingsContext)_localctx).items = native_category_binding_list(0);
			setState(739);
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
		public TerminalNode SEMI() { return getToken(OParser.SEMI, 0); }
		public Native_category_binding_listContext native_category_binding_list() {
			return getRuleContext(Native_category_binding_listContext.class,0);
		}
		public Native_category_bindingContext native_category_binding() {
			return getRuleContext(Native_category_bindingContext.class,0);
		}
		public NativeCategoryBindingListItemContext(Native_category_binding_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterNativeCategoryBindingListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitNativeCategoryBindingListItem(this);
		}
	}
	public static class NativeCategoryBindingListContext extends Native_category_binding_listContext {
		public Native_category_bindingContext item;
		public TerminalNode SEMI() { return getToken(OParser.SEMI, 0); }
		public Native_category_bindingContext native_category_binding() {
			return getRuleContext(Native_category_bindingContext.class,0);
		}
		public NativeCategoryBindingListContext(Native_category_binding_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterNativeCategoryBindingList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitNativeCategoryBindingList(this);
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
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_native_category_binding_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new NativeCategoryBindingListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(742);
			((NativeCategoryBindingListContext)_localctx).item = native_category_binding();
			setState(743);
			match(SEMI);
			}
			_ctx.stop = _input.LT(-1);
			setState(751);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NativeCategoryBindingListItemContext(new Native_category_binding_listContext(_parentctx, _parentState));
					((NativeCategoryBindingListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_native_category_binding_list);
					setState(745);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(746);
					((NativeCategoryBindingListItemContext)_localctx).item = native_category_binding();
					setState(747);
					match(SEMI);
					}
					} 
				}
				setState(753);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

	public static class Abstract_method_declarationContext extends ParserRuleContext {
		public TypedefContext typ;
		public Method_identifierContext name;
		public Argument_listContext args;
		public TerminalNode ABSTRACT() { return getToken(OParser.ABSTRACT, 0); }
		public TerminalNode METHOD() { return getToken(OParser.METHOD, 0); }
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public TerminalNode SEMI() { return getToken(OParser.SEMI, 0); }
		public Method_identifierContext method_identifier() {
			return getRuleContext(Method_identifierContext.class,0);
		}
		public TypedefContext typedef() {
			return getRuleContext(TypedefContext.class,0);
		}
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public TerminalNode MUTABLE() { return getToken(OParser.MUTABLE, 0); }
		public Abstract_method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstract_method_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterAbstract_method_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitAbstract_method_declaration(this);
		}
	}

	public final Abstract_method_declarationContext abstract_method_declaration() throws RecognitionException {
		Abstract_method_declarationContext _localctx = new Abstract_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_abstract_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(754);
			match(ABSTRACT);
			setState(759);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & ((1L << (BOOLEAN - 49)) | (1L << (CSS - 49)) | (1L << (CHARACTER - 49)) | (1L << (TEXT - 49)) | (1L << (INTEGER - 49)) | (1L << (DECIMAL - 49)) | (1L << (DATE - 49)) | (1L << (TIME - 49)) | (1L << (DATETIME - 49)) | (1L << (PERIOD - 49)) | (1L << (VERSION - 49)) | (1L << (CODE - 49)) | (1L << (DOCUMENT - 49)) | (1L << (BLOB - 49)) | (1L << (IMAGE - 49)) | (1L << (UUID - 49)) | (1L << (DBID - 49)) | (1L << (ITERATOR - 49)) | (1L << (CURSOR - 49)) | (1L << (HTML - 49)) | (1L << (TYPE - 49)))) != 0) || _la==MUTABLE || _la==TYPE_IDENTIFIER) {
				{
				setState(756);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MUTABLE) {
					{
					setState(755);
					match(MUTABLE);
					}
				}

				setState(758);
				((Abstract_method_declarationContext)_localctx).typ = typedef(0);
				}
			}

			setState(761);
			match(METHOD);
			setState(762);
			((Abstract_method_declarationContext)_localctx).name = method_identifier();
			setState(763);
			match(LPAR);
			setState(765);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & ((1L << (BOOLEAN - 49)) | (1L << (CSS - 49)) | (1L << (CHARACTER - 49)) | (1L << (TEXT - 49)) | (1L << (INTEGER - 49)) | (1L << (DECIMAL - 49)) | (1L << (DATE - 49)) | (1L << (TIME - 49)) | (1L << (DATETIME - 49)) | (1L << (PERIOD - 49)) | (1L << (VERSION - 49)) | (1L << (CODE - 49)) | (1L << (DOCUMENT - 49)) | (1L << (BLOB - 49)) | (1L << (IMAGE - 49)) | (1L << (UUID - 49)) | (1L << (DBID - 49)) | (1L << (ITERATOR - 49)) | (1L << (CURSOR - 49)) | (1L << (HTML - 49)) | (1L << (TYPE - 49)) | (1L << (ANY - 49)) | (1L << (CATEGORY - 49)))) != 0) || ((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & ((1L << (MUTABLE - 122)) | (1L << (RESOURCE - 122)) | (1L << (TYPE_IDENTIFIER - 122)) | (1L << (VARIABLE_IDENTIFIER - 122)))) != 0)) {
				{
				setState(764);
				((Abstract_method_declarationContext)_localctx).args = argument_list();
				}
			}

			setState(767);
			match(RPAR);
			setState(768);
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

	public static class Concrete_method_declarationContext extends ParserRuleContext {
		public TypedefContext typ;
		public Method_identifierContext name;
		public Argument_listContext args;
		public Statement_listContext stmts;
		public TerminalNode METHOD() { return getToken(OParser.METHOD, 0); }
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public TerminalNode LCURL() { return getToken(OParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(OParser.RCURL, 0); }
		public Method_identifierContext method_identifier() {
			return getRuleContext(Method_identifierContext.class,0);
		}
		public TypedefContext typedef() {
			return getRuleContext(TypedefContext.class,0);
		}
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public TerminalNode MUTABLE() { return getToken(OParser.MUTABLE, 0); }
		public Concrete_method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concrete_method_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterConcrete_method_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitConcrete_method_declaration(this);
		}
	}

	public final Concrete_method_declarationContext concrete_method_declaration() throws RecognitionException {
		Concrete_method_declarationContext _localctx = new Concrete_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_concrete_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(774);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & ((1L << (BOOLEAN - 49)) | (1L << (CSS - 49)) | (1L << (CHARACTER - 49)) | (1L << (TEXT - 49)) | (1L << (INTEGER - 49)) | (1L << (DECIMAL - 49)) | (1L << (DATE - 49)) | (1L << (TIME - 49)) | (1L << (DATETIME - 49)) | (1L << (PERIOD - 49)) | (1L << (VERSION - 49)) | (1L << (CODE - 49)) | (1L << (DOCUMENT - 49)) | (1L << (BLOB - 49)) | (1L << (IMAGE - 49)) | (1L << (UUID - 49)) | (1L << (DBID - 49)) | (1L << (ITERATOR - 49)) | (1L << (CURSOR - 49)) | (1L << (HTML - 49)) | (1L << (TYPE - 49)))) != 0) || _la==MUTABLE || _la==TYPE_IDENTIFIER) {
				{
				setState(771);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MUTABLE) {
					{
					setState(770);
					match(MUTABLE);
					}
				}

				setState(773);
				((Concrete_method_declarationContext)_localctx).typ = typedef(0);
				}
			}

			setState(776);
			match(METHOD);
			setState(777);
			((Concrete_method_declarationContext)_localctx).name = method_identifier();
			setState(778);
			match(LPAR);
			setState(780);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & ((1L << (BOOLEAN - 49)) | (1L << (CSS - 49)) | (1L << (CHARACTER - 49)) | (1L << (TEXT - 49)) | (1L << (INTEGER - 49)) | (1L << (DECIMAL - 49)) | (1L << (DATE - 49)) | (1L << (TIME - 49)) | (1L << (DATETIME - 49)) | (1L << (PERIOD - 49)) | (1L << (VERSION - 49)) | (1L << (CODE - 49)) | (1L << (DOCUMENT - 49)) | (1L << (BLOB - 49)) | (1L << (IMAGE - 49)) | (1L << (UUID - 49)) | (1L << (DBID - 49)) | (1L << (ITERATOR - 49)) | (1L << (CURSOR - 49)) | (1L << (HTML - 49)) | (1L << (TYPE - 49)) | (1L << (ANY - 49)) | (1L << (CATEGORY - 49)))) != 0) || ((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & ((1L << (MUTABLE - 122)) | (1L << (RESOURCE - 122)) | (1L << (TYPE_IDENTIFIER - 122)) | (1L << (VARIABLE_IDENTIFIER - 122)))) != 0)) {
				{
				setState(779);
				((Concrete_method_declarationContext)_localctx).args = argument_list();
				}
			}

			setState(782);
			match(RPAR);
			setState(783);
			match(LCURL);
			setState(785);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << LTCOLONGT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (TYPE - 64)) | (1L << (ANY - 64)) | (1L << (BREAK - 64)) | (1L << (CATEGORY - 64)) | (1L << (DELETE - 64)) | (1L << (DO - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (IF - 64)) | (1L << (METHOD - 64)) | (1L << (MUTABLE - 64)) | (1L << (NULL - 64)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (READ - 136)) | (1L << (RESOURCE - 136)) | (1L << (RETURN - 136)) | (1L << (SELF - 136)) | (1L << (SORTED - 136)) | (1L << (STORE - 136)) | (1L << (SUPER - 136)) | (1L << (SWITCH - 136)) | (1L << (THIS - 136)) | (1L << (THROW - 136)) | (1L << (TRY - 136)) | (1L << (WITH - 136)) | (1L << (WHILE - 136)) | (1L << (WRITE - 136)) | (1L << (BOOLEAN_LITERAL - 136)) | (1L << (CHAR_LITERAL - 136)) | (1L << (MIN_INTEGER - 136)) | (1L << (MAX_INTEGER - 136)) | (1L << (SYMBOL_IDENTIFIER - 136)) | (1L << (TYPE_IDENTIFIER - 136)) | (1L << (VARIABLE_IDENTIFIER - 136)) | (1L << (TEXT_LITERAL - 136)) | (1L << (UUID_LITERAL - 136)) | (1L << (VERSION_LITERAL - 136)) | (1L << (INTEGER_LITERAL - 136)) | (1L << (HEXA_LITERAL - 136)) | (1L << (DECIMAL_LITERAL - 136)) | (1L << (DATETIME_LITERAL - 136)) | (1L << (TIME_LITERAL - 136)) | (1L << (DATE_LITERAL - 136)) | (1L << (PERIOD_LITERAL - 136)))) != 0)) {
				{
				setState(784);
				((Concrete_method_declarationContext)_localctx).stmts = statement_list();
				}
			}

			setState(787);
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

	public static class Native_method_declarationContext extends ParserRuleContext {
		public Category_or_any_typeContext typ;
		public Method_identifierContext name;
		public Argument_listContext args;
		public Native_statement_listContext stmts;
		public TerminalNode METHOD() { return getToken(OParser.METHOD, 0); }
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public TerminalNode LCURL() { return getToken(OParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(OParser.RCURL, 0); }
		public Method_identifierContext method_identifier() {
			return getRuleContext(Method_identifierContext.class,0);
		}
		public Native_statement_listContext native_statement_list() {
			return getRuleContext(Native_statement_listContext.class,0);
		}
		public TerminalNode NATIVE() { return getToken(OParser.NATIVE, 0); }
		public Category_or_any_typeContext category_or_any_type() {
			return getRuleContext(Category_or_any_typeContext.class,0);
		}
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public Native_method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_native_method_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterNative_method_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitNative_method_declaration(this);
		}
	}

	public final Native_method_declarationContext native_method_declaration() throws RecognitionException {
		Native_method_declarationContext _localctx = new Native_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_native_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(790);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & ((1L << (BOOLEAN - 49)) | (1L << (CSS - 49)) | (1L << (CHARACTER - 49)) | (1L << (TEXT - 49)) | (1L << (INTEGER - 49)) | (1L << (DECIMAL - 49)) | (1L << (DATE - 49)) | (1L << (TIME - 49)) | (1L << (DATETIME - 49)) | (1L << (PERIOD - 49)) | (1L << (VERSION - 49)) | (1L << (CODE - 49)) | (1L << (DOCUMENT - 49)) | (1L << (BLOB - 49)) | (1L << (IMAGE - 49)) | (1L << (UUID - 49)) | (1L << (DBID - 49)) | (1L << (ITERATOR - 49)) | (1L << (CURSOR - 49)) | (1L << (HTML - 49)) | (1L << (TYPE - 49)) | (1L << (ANY - 49)))) != 0) || _la==TYPE_IDENTIFIER) {
				{
				setState(789);
				((Native_method_declarationContext)_localctx).typ = category_or_any_type();
				}
			}

			setState(793);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NATIVE) {
				{
				setState(792);
				match(NATIVE);
				}
			}

			setState(795);
			match(METHOD);
			setState(796);
			((Native_method_declarationContext)_localctx).name = method_identifier();
			setState(797);
			match(LPAR);
			setState(799);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & ((1L << (BOOLEAN - 49)) | (1L << (CSS - 49)) | (1L << (CHARACTER - 49)) | (1L << (TEXT - 49)) | (1L << (INTEGER - 49)) | (1L << (DECIMAL - 49)) | (1L << (DATE - 49)) | (1L << (TIME - 49)) | (1L << (DATETIME - 49)) | (1L << (PERIOD - 49)) | (1L << (VERSION - 49)) | (1L << (CODE - 49)) | (1L << (DOCUMENT - 49)) | (1L << (BLOB - 49)) | (1L << (IMAGE - 49)) | (1L << (UUID - 49)) | (1L << (DBID - 49)) | (1L << (ITERATOR - 49)) | (1L << (CURSOR - 49)) | (1L << (HTML - 49)) | (1L << (TYPE - 49)) | (1L << (ANY - 49)) | (1L << (CATEGORY - 49)))) != 0) || ((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & ((1L << (MUTABLE - 122)) | (1L << (RESOURCE - 122)) | (1L << (TYPE_IDENTIFIER - 122)) | (1L << (VARIABLE_IDENTIFIER - 122)))) != 0)) {
				{
				setState(798);
				((Native_method_declarationContext)_localctx).args = argument_list();
				}
			}

			setState(801);
			match(RPAR);
			setState(802);
			match(LCURL);
			setState(803);
			((Native_method_declarationContext)_localctx).stmts = native_statement_list();
			setState(804);
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

	public static class Test_method_declarationContext extends ParserRuleContext {
		public Token name;
		public Statement_listContext stmts;
		public Assertion_listContext exps;
		public Symbol_identifierContext error;
		public TerminalNode TEST() { return getToken(OParser.TEST, 0); }
		public TerminalNode METHOD() { return getToken(OParser.METHOD, 0); }
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public List<TerminalNode> LCURL() { return getTokens(OParser.LCURL); }
		public TerminalNode LCURL(int i) {
			return getToken(OParser.LCURL, i);
		}
		public List<TerminalNode> RCURL() { return getTokens(OParser.RCURL); }
		public TerminalNode RCURL(int i) {
			return getToken(OParser.RCURL, i);
		}
		public TerminalNode VERIFYING() { return getToken(OParser.VERIFYING, 0); }
		public TerminalNode TEXT_LITERAL() { return getToken(OParser.TEXT_LITERAL, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(OParser.SEMI, 0); }
		public Assertion_listContext assertion_list() {
			return getRuleContext(Assertion_listContext.class,0);
		}
		public Symbol_identifierContext symbol_identifier() {
			return getRuleContext(Symbol_identifierContext.class,0);
		}
		public Test_method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_test_method_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterTest_method_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitTest_method_declaration(this);
		}
	}

	public final Test_method_declarationContext test_method_declaration() throws RecognitionException {
		Test_method_declarationContext _localctx = new Test_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_test_method_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(806);
			match(TEST);
			setState(807);
			match(METHOD);
			setState(808);
			((Test_method_declarationContext)_localctx).name = match(TEXT_LITERAL);
			setState(809);
			match(LPAR);
			setState(810);
			match(RPAR);
			setState(811);
			match(LCURL);
			setState(812);
			((Test_method_declarationContext)_localctx).stmts = statement_list();
			setState(813);
			match(RCURL);
			setState(814);
			match(VERIFYING);
			setState(822);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURL:
				{
				{
				setState(815);
				match(LCURL);
				setState(816);
				((Test_method_declarationContext)_localctx).exps = assertion_list();
				setState(817);
				match(RCURL);
				}
				}
				break;
			case SYMBOL_IDENTIFIER:
				{
				{
				setState(819);
				((Test_method_declarationContext)_localctx).error = symbol_identifier();
				setState(820);
				match(SEMI);
				}
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
		public TerminalNode SEMI() { return getToken(OParser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssertionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterAssertion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitAssertion(this);
		}
	}

	public final AssertionContext assertion() throws RecognitionException {
		AssertionContext _localctx = new AssertionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_assertion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(824);
			((AssertionContext)_localctx).exp = expression(0);
			setState(825);
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

	public static class Typed_argumentContext extends ParserRuleContext {
		public Category_or_any_typeContext typ;
		public Attribute_identifier_listContext attrs;
		public Variable_identifierContext name;
		public Literal_expressionContext value;
		public Category_or_any_typeContext category_or_any_type() {
			return getRuleContext(Category_or_any_typeContext.class,0);
		}
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public TerminalNode EQ() { return getToken(OParser.EQ, 0); }
		public Attribute_identifier_listContext attribute_identifier_list() {
			return getRuleContext(Attribute_identifier_listContext.class,0);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterTyped_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitTyped_argument(this);
		}
	}

	public final Typed_argumentContext typed_argument() throws RecognitionException {
		Typed_argumentContext _localctx = new Typed_argumentContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_typed_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(827);
			((Typed_argumentContext)_localctx).typ = category_or_any_type();
			setState(832);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(828);
				match(LPAR);
				setState(829);
				((Typed_argumentContext)_localctx).attrs = attribute_identifier_list();
				setState(830);
				match(RPAR);
				}
			}

			setState(834);
			((Typed_argumentContext)_localctx).name = variable_identifier();
			setState(837);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(835);
				match(EQ);
				setState(836);
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

	public static class Statement_or_listContext extends ParserRuleContext {
		public Statement_or_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_or_list; }
	 
		public Statement_or_listContext() { }
		public void copyFrom(Statement_or_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CurlyStatementListContext extends Statement_or_listContext {
		public Statement_listContext items;
		public TerminalNode LCURL() { return getToken(OParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(OParser.RCURL, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public CurlyStatementListContext(Statement_or_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCurlyStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCurlyStatementList(this);
		}
	}
	public static class SingleStatementContext extends Statement_or_listContext {
		public StatementContext stmt;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public SingleStatementContext(Statement_or_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterSingleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitSingleStatement(this);
		}
	}

	public final Statement_or_listContext statement_or_list() throws RecognitionException {
		Statement_or_listContext _localctx = new Statement_or_listContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_statement_or_list);
		try {
			setState(846);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				_localctx = new SingleStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(839);
				((SingleStatementContext)_localctx).stmt = statement();
				}
				break;
			case 2:
				_localctx = new CurlyStatementListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(840);
				match(LCURL);
				setState(844);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(841);
					((CurlyStatementListContext)_localctx).items = statement_list();
					setState(842);
					match(RCURL);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCommentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCommentStatement(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterStoreStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitStoreStatement(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterWithSingletonStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitWithSingletonStatement(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterWriteStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitWriteStatement(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitWhileStatement(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterWithResourceStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitWithResourceStatement(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterRaiseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitRaiseStatement(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterFetchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitFetchStatement(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitBreakStatement(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterAssignInstanceStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitAssignInstanceStatement(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitIfStatement(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitSwitchStatement(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterTryStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitTryStatement(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterReadStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitReadStatement(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterMethodCallStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitMethodCallStatement(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitReturnStatement(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterAssignTupleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitAssignTupleStatement(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterClosureStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitClosureStatement(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterFlushStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitFlushStatement(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterDoWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitDoWhileStatement(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterForEachStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitForEachStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_statement);
		try {
			setState(869);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				_localctx = new MethodCallStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(848);
				((MethodCallStatementContext)_localctx).stmt = method_call_statement();
				}
				break;
			case 2:
				_localctx = new AssignInstanceStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(849);
				((AssignInstanceStatementContext)_localctx).stmt = assign_instance_statement();
				}
				break;
			case 3:
				_localctx = new AssignTupleStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(850);
				((AssignTupleStatementContext)_localctx).stmt = assign_tuple_statement();
				}
				break;
			case 4:
				_localctx = new StoreStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(851);
				((StoreStatementContext)_localctx).stmt = store_statement();
				}
				break;
			case 5:
				_localctx = new FetchStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(852);
				((FetchStatementContext)_localctx).stmt = fetch_statement();
				}
				break;
			case 6:
				_localctx = new ReadStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(853);
				((ReadStatementContext)_localctx).stmt = read_statement();
				}
				break;
			case 7:
				_localctx = new FlushStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(854);
				((FlushStatementContext)_localctx).stmt = flush_statement();
				}
				break;
			case 8:
				_localctx = new BreakStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(855);
				((BreakStatementContext)_localctx).stmt = break_statement();
				}
				break;
			case 9:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(856);
				((ReturnStatementContext)_localctx).stmt = return_statement();
				}
				break;
			case 10:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(857);
				((IfStatementContext)_localctx).stmt = if_statement();
				}
				break;
			case 11:
				_localctx = new SwitchStatementContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(858);
				((SwitchStatementContext)_localctx).stmt = switch_statement();
				}
				break;
			case 12:
				_localctx = new ForEachStatementContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(859);
				((ForEachStatementContext)_localctx).stmt = for_each_statement();
				}
				break;
			case 13:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(860);
				((WhileStatementContext)_localctx).stmt = while_statement();
				}
				break;
			case 14:
				_localctx = new DoWhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(861);
				((DoWhileStatementContext)_localctx).stmt = do_while_statement();
				}
				break;
			case 15:
				_localctx = new TryStatementContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(862);
				((TryStatementContext)_localctx).stmt = try_statement();
				}
				break;
			case 16:
				_localctx = new RaiseStatementContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(863);
				((RaiseStatementContext)_localctx).stmt = raise_statement();
				}
				break;
			case 17:
				_localctx = new WriteStatementContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(864);
				((WriteStatementContext)_localctx).stmt = write_statement();
				}
				break;
			case 18:
				_localctx = new WithResourceStatementContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(865);
				((WithResourceStatementContext)_localctx).stmt = with_resource_statement();
				}
				break;
			case 19:
				_localctx = new WithSingletonStatementContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(866);
				((WithSingletonStatementContext)_localctx).stmt = with_singleton_statement();
				}
				break;
			case 20:
				_localctx = new ClosureStatementContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(867);
				((ClosureStatementContext)_localctx).decl = concrete_method_declaration();
				}
				break;
			case 21:
				_localctx = new CommentStatementContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(868);
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
		public TerminalNode FLUSH() { return getToken(OParser.FLUSH, 0); }
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public TerminalNode SEMI() { return getToken(OParser.SEMI, 0); }
		public Flush_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flush_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterFlush_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitFlush_statement(this);
		}
	}

	public final Flush_statementContext flush_statement() throws RecognitionException {
		Flush_statementContext _localctx = new Flush_statementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_flush_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(871);
			match(FLUSH);
			setState(872);
			match(LPAR);
			setState(873);
			match(RPAR);
			setState(874);
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

	public static class Store_statementContext extends ParserRuleContext {
		public Expression_listContext to_del;
		public Expression_listContext to_add;
		public ExpressionContext with_meta;
		public Statement_listContext stmts;
		public TerminalNode DELETE() { return getToken(OParser.DELETE, 0); }
		public List<TerminalNode> LPAR() { return getTokens(OParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(OParser.LPAR, i);
		}
		public List<TerminalNode> RPAR() { return getTokens(OParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(OParser.RPAR, i);
		}
		public TerminalNode STORE() { return getToken(OParser.STORE, 0); }
		public TerminalNode SEMI() { return getToken(OParser.SEMI, 0); }
		public List<Expression_listContext> expression_list() {
			return getRuleContexts(Expression_listContext.class);
		}
		public Expression_listContext expression_list(int i) {
			return getRuleContext(Expression_listContext.class,i);
		}
		public TerminalNode WITH() { return getToken(OParser.WITH, 0); }
		public MetadataContext metadata() {
			return getRuleContext(MetadataContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(OParser.THEN, 0); }
		public TerminalNode LCURL() { return getToken(OParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(OParser.RCURL, 0); }
		public TerminalNode AND() { return getToken(OParser.AND, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public Store_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_store_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterStore_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitStore_statement(this);
		}
	}

	public final Store_statementContext store_statement() throws RecognitionException {
		Store_statementContext _localctx = new Store_statementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_store_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(893);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DELETE:
				{
				setState(876);
				match(DELETE);
				setState(877);
				match(LPAR);
				setState(878);
				((Store_statementContext)_localctx).to_del = expression_list();
				setState(879);
				match(RPAR);
				setState(886);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AND) {
					{
					setState(880);
					match(AND);
					setState(881);
					match(STORE);
					setState(882);
					match(LPAR);
					setState(883);
					((Store_statementContext)_localctx).to_add = expression_list();
					setState(884);
					match(RPAR);
					}
				}

				}
				break;
			case STORE:
				{
				setState(888);
				match(STORE);
				setState(889);
				match(LPAR);
				setState(890);
				((Store_statementContext)_localctx).to_add = expression_list();
				setState(891);
				match(RPAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(901);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(895);
				match(WITH);
				setState(896);
				metadata();
				setState(897);
				match(LPAR);
				setState(898);
				((Store_statementContext)_localctx).with_meta = expression(0);
				setState(899);
				match(RPAR);
				}
			}

			setState(909);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THEN:
				{
				{
				setState(903);
				match(THEN);
				setState(904);
				match(LCURL);
				setState(905);
				((Store_statementContext)_localctx).stmts = statement_list();
				setState(906);
				match(RCURL);
				}
				}
				break;
			case SEMI:
				{
				setState(908);
				match(SEMI);
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

	public static class With_resource_statementContext extends ParserRuleContext {
		public Assign_variable_statementContext stmt;
		public Statement_or_listContext stmts;
		public TerminalNode WITH() { return getToken(OParser.WITH, 0); }
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public Assign_variable_statementContext assign_variable_statement() {
			return getRuleContext(Assign_variable_statementContext.class,0);
		}
		public Statement_or_listContext statement_or_list() {
			return getRuleContext(Statement_or_listContext.class,0);
		}
		public With_resource_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_resource_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterWith_resource_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitWith_resource_statement(this);
		}
	}

	public final With_resource_statementContext with_resource_statement() throws RecognitionException {
		With_resource_statementContext _localctx = new With_resource_statementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_with_resource_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(911);
			match(WITH);
			setState(912);
			match(LPAR);
			setState(913);
			((With_resource_statementContext)_localctx).stmt = assign_variable_statement();
			setState(914);
			match(RPAR);
			setState(915);
			((With_resource_statementContext)_localctx).stmts = statement_or_list();
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
		public Statement_or_listContext stmts;
		public TerminalNode WITH() { return getToken(OParser.WITH, 0); }
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Statement_or_listContext statement_or_list() {
			return getRuleContext(Statement_or_listContext.class,0);
		}
		public With_singleton_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_singleton_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterWith_singleton_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitWith_singleton_statement(this);
		}
	}

	public final With_singleton_statementContext with_singleton_statement() throws RecognitionException {
		With_singleton_statementContext _localctx = new With_singleton_statementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_with_singleton_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(917);
			match(WITH);
			setState(918);
			match(LPAR);
			setState(919);
			((With_singleton_statementContext)_localctx).typ = type_identifier();
			setState(920);
			match(RPAR);
			setState(921);
			((With_singleton_statementContext)_localctx).stmts = statement_or_list();
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
		public TerminalNode SWITCH() { return getToken(OParser.SWITCH, 0); }
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public TerminalNode LCURL() { return getToken(OParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(OParser.RCURL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Switch_case_statement_listContext switch_case_statement_list() {
			return getRuleContext(Switch_case_statement_listContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(OParser.DEFAULT, 0); }
		public TerminalNode COLON() { return getToken(OParser.COLON, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public Switch_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterSwitch_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitSwitch_statement(this);
		}
	}

	public final Switch_statementContext switch_statement() throws RecognitionException {
		Switch_statementContext _localctx = new Switch_statementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_switch_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(923);
			match(SWITCH);
			setState(924);
			match(LPAR);
			setState(925);
			((Switch_statementContext)_localctx).exp = expression(0);
			setState(926);
			match(RPAR);
			setState(927);
			match(LCURL);
			setState(928);
			((Switch_statementContext)_localctx).cases = switch_case_statement_list();
			setState(934);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(929);
				match(DEFAULT);
				setState(930);
				match(COLON);
				setState(932);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << LTCOLONGT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (TYPE - 64)) | (1L << (ANY - 64)) | (1L << (BREAK - 64)) | (1L << (CATEGORY - 64)) | (1L << (DELETE - 64)) | (1L << (DO - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (IF - 64)) | (1L << (METHOD - 64)) | (1L << (MUTABLE - 64)) | (1L << (NULL - 64)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (READ - 136)) | (1L << (RESOURCE - 136)) | (1L << (RETURN - 136)) | (1L << (SELF - 136)) | (1L << (SORTED - 136)) | (1L << (STORE - 136)) | (1L << (SUPER - 136)) | (1L << (SWITCH - 136)) | (1L << (THIS - 136)) | (1L << (THROW - 136)) | (1L << (TRY - 136)) | (1L << (WITH - 136)) | (1L << (WHILE - 136)) | (1L << (WRITE - 136)) | (1L << (BOOLEAN_LITERAL - 136)) | (1L << (CHAR_LITERAL - 136)) | (1L << (MIN_INTEGER - 136)) | (1L << (MAX_INTEGER - 136)) | (1L << (SYMBOL_IDENTIFIER - 136)) | (1L << (TYPE_IDENTIFIER - 136)) | (1L << (VARIABLE_IDENTIFIER - 136)) | (1L << (TEXT_LITERAL - 136)) | (1L << (UUID_LITERAL - 136)) | (1L << (VERSION_LITERAL - 136)) | (1L << (INTEGER_LITERAL - 136)) | (1L << (HEXA_LITERAL - 136)) | (1L << (DECIMAL_LITERAL - 136)) | (1L << (DATETIME_LITERAL - 136)) | (1L << (TIME_LITERAL - 136)) | (1L << (DATE_LITERAL - 136)) | (1L << (PERIOD_LITERAL - 136)))) != 0)) {
					{
					setState(931);
					((Switch_statementContext)_localctx).stmts = statement_list();
					}
				}

				}
			}

			setState(936);
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
		public TerminalNode CASE() { return getToken(OParser.CASE, 0); }
		public TerminalNode COLON() { return getToken(OParser.COLON, 0); }
		public Atomic_literalContext atomic_literal() {
			return getRuleContext(Atomic_literalContext.class,0);
		}
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public AtomicSwitchCaseContext(Switch_case_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterAtomicSwitchCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitAtomicSwitchCase(this);
		}
	}
	public static class CollectionSwitchCaseContext extends Switch_case_statementContext {
		public Literal_collectionContext exp;
		public Statement_listContext stmts;
		public TerminalNode CASE() { return getToken(OParser.CASE, 0); }
		public TerminalNode IN() { return getToken(OParser.IN, 0); }
		public TerminalNode COLON() { return getToken(OParser.COLON, 0); }
		public Literal_collectionContext literal_collection() {
			return getRuleContext(Literal_collectionContext.class,0);
		}
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public CollectionSwitchCaseContext(Switch_case_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCollectionSwitchCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCollectionSwitchCase(this);
		}
	}

	public final Switch_case_statementContext switch_case_statement() throws RecognitionException {
		Switch_case_statementContext _localctx = new Switch_case_statementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_switch_case_statement);
		try {
			setState(949);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				_localctx = new AtomicSwitchCaseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(938);
				match(CASE);
				setState(939);
				((AtomicSwitchCaseContext)_localctx).exp = atomic_literal();
				setState(940);
				match(COLON);
				setState(941);
				((AtomicSwitchCaseContext)_localctx).stmts = statement_list();
				}
				break;
			case 2:
				_localctx = new CollectionSwitchCaseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(943);
				match(CASE);
				setState(944);
				match(IN);
				setState(945);
				((CollectionSwitchCaseContext)_localctx).exp = literal_collection();
				setState(946);
				match(COLON);
				setState(947);
				((CollectionSwitchCaseContext)_localctx).stmts = statement_list();
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
		public Statement_or_listContext stmts;
		public TerminalNode FOR() { return getToken(OParser.FOR, 0); }
		public TerminalNode EACH() { return getToken(OParser.EACH, 0); }
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode IN() { return getToken(OParser.IN, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public List<Variable_identifierContext> variable_identifier() {
			return getRuleContexts(Variable_identifierContext.class);
		}
		public Variable_identifierContext variable_identifier(int i) {
			return getRuleContext(Variable_identifierContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Statement_or_listContext statement_or_list() {
			return getRuleContext(Statement_or_listContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(OParser.COMMA, 0); }
		public For_each_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_each_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterFor_each_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitFor_each_statement(this);
		}
	}

	public final For_each_statementContext for_each_statement() throws RecognitionException {
		For_each_statementContext _localctx = new For_each_statementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_for_each_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(951);
			match(FOR);
			setState(952);
			match(EACH);
			setState(953);
			match(LPAR);
			setState(954);
			((For_each_statementContext)_localctx).name1 = variable_identifier();
			setState(957);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(955);
				match(COMMA);
				setState(956);
				((For_each_statementContext)_localctx).name2 = variable_identifier();
				}
			}

			setState(959);
			match(IN);
			setState(960);
			((For_each_statementContext)_localctx).source = expression(0);
			setState(961);
			match(RPAR);
			setState(962);
			((For_each_statementContext)_localctx).stmts = statement_or_list();
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
		public TerminalNode DO() { return getToken(OParser.DO, 0); }
		public TerminalNode LCURL() { return getToken(OParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(OParser.RCURL, 0); }
		public TerminalNode WHILE() { return getToken(OParser.WHILE, 0); }
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public TerminalNode SEMI() { return getToken(OParser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public Do_while_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterDo_while_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitDo_while_statement(this);
		}
	}

	public final Do_while_statementContext do_while_statement() throws RecognitionException {
		Do_while_statementContext _localctx = new Do_while_statementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_do_while_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(964);
			match(DO);
			setState(965);
			match(LCURL);
			setState(967);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << LTCOLONGT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (TYPE - 64)) | (1L << (ANY - 64)) | (1L << (BREAK - 64)) | (1L << (CATEGORY - 64)) | (1L << (DELETE - 64)) | (1L << (DO - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (IF - 64)) | (1L << (METHOD - 64)) | (1L << (MUTABLE - 64)) | (1L << (NULL - 64)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (READ - 136)) | (1L << (RESOURCE - 136)) | (1L << (RETURN - 136)) | (1L << (SELF - 136)) | (1L << (SORTED - 136)) | (1L << (STORE - 136)) | (1L << (SUPER - 136)) | (1L << (SWITCH - 136)) | (1L << (THIS - 136)) | (1L << (THROW - 136)) | (1L << (TRY - 136)) | (1L << (WITH - 136)) | (1L << (WHILE - 136)) | (1L << (WRITE - 136)) | (1L << (BOOLEAN_LITERAL - 136)) | (1L << (CHAR_LITERAL - 136)) | (1L << (MIN_INTEGER - 136)) | (1L << (MAX_INTEGER - 136)) | (1L << (SYMBOL_IDENTIFIER - 136)) | (1L << (TYPE_IDENTIFIER - 136)) | (1L << (VARIABLE_IDENTIFIER - 136)) | (1L << (TEXT_LITERAL - 136)) | (1L << (UUID_LITERAL - 136)) | (1L << (VERSION_LITERAL - 136)) | (1L << (INTEGER_LITERAL - 136)) | (1L << (HEXA_LITERAL - 136)) | (1L << (DECIMAL_LITERAL - 136)) | (1L << (DATETIME_LITERAL - 136)) | (1L << (TIME_LITERAL - 136)) | (1L << (DATE_LITERAL - 136)) | (1L << (PERIOD_LITERAL - 136)))) != 0)) {
				{
				setState(966);
				((Do_while_statementContext)_localctx).stmts = statement_list();
				}
			}

			setState(969);
			match(RCURL);
			setState(970);
			match(WHILE);
			setState(971);
			match(LPAR);
			setState(972);
			((Do_while_statementContext)_localctx).exp = expression(0);
			setState(973);
			match(RPAR);
			setState(974);
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

	public static class While_statementContext extends ParserRuleContext {
		public ExpressionContext exp;
		public Statement_or_listContext stmts;
		public TerminalNode WHILE() { return getToken(OParser.WHILE, 0); }
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Statement_or_listContext statement_or_list() {
			return getRuleContext(Statement_or_listContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitWhile_statement(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(976);
			match(WHILE);
			setState(977);
			match(LPAR);
			setState(978);
			((While_statementContext)_localctx).exp = expression(0);
			setState(979);
			match(RPAR);
			setState(980);
			((While_statementContext)_localctx).stmts = statement_or_list();
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
		public Statement_or_listContext stmts;
		public Else_if_statement_listContext elseIfs;
		public Statement_or_listContext elseStmts;
		public TerminalNode IF() { return getToken(OParser.IF, 0); }
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<Statement_or_listContext> statement_or_list() {
			return getRuleContexts(Statement_or_listContext.class);
		}
		public Statement_or_listContext statement_or_list(int i) {
			return getRuleContext(Statement_or_listContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(OParser.ELSE, 0); }
		public Else_if_statement_listContext else_if_statement_list() {
			return getRuleContext(Else_if_statement_listContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitIf_statement(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(982);
			match(IF);
			setState(983);
			match(LPAR);
			setState(984);
			((If_statementContext)_localctx).exp = expression(0);
			setState(985);
			match(RPAR);
			setState(986);
			((If_statementContext)_localctx).stmts = statement_or_list();
			setState(988);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(987);
				((If_statementContext)_localctx).elseIfs = else_if_statement_list(0);
				}
				break;
			}
			setState(992);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(990);
				match(ELSE);
				setState(991);
				((If_statementContext)_localctx).elseStmts = statement_or_list();
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
		public Statement_or_listContext stmts;
		public TerminalNode ELSE() { return getToken(OParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(OParser.IF, 0); }
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Statement_or_listContext statement_or_list() {
			return getRuleContext(Statement_or_listContext.class,0);
		}
		public ElseIfStatementListContext(Else_if_statement_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterElseIfStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitElseIfStatementList(this);
		}
	}
	public static class ElseIfStatementListItemContext extends Else_if_statement_listContext {
		public Else_if_statement_listContext items;
		public ExpressionContext exp;
		public Statement_or_listContext stmts;
		public TerminalNode ELSE() { return getToken(OParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(OParser.IF, 0); }
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public Else_if_statement_listContext else_if_statement_list() {
			return getRuleContext(Else_if_statement_listContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Statement_or_listContext statement_or_list() {
			return getRuleContext(Statement_or_listContext.class,0);
		}
		public ElseIfStatementListItemContext(Else_if_statement_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterElseIfStatementListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitElseIfStatementListItem(this);
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
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_else_if_statement_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ElseIfStatementListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(995);
			match(ELSE);
			setState(996);
			match(IF);
			setState(997);
			match(LPAR);
			setState(998);
			((ElseIfStatementListContext)_localctx).exp = expression(0);
			setState(999);
			match(RPAR);
			setState(1000);
			((ElseIfStatementListContext)_localctx).stmts = statement_or_list();
			}
			_ctx.stop = _input.LT(-1);
			setState(1012);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ElseIfStatementListItemContext(new Else_if_statement_listContext(_parentctx, _parentState));
					((ElseIfStatementListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_else_if_statement_list);
					setState(1002);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1003);
					match(ELSE);
					setState(1004);
					match(IF);
					setState(1005);
					match(LPAR);
					setState(1006);
					((ElseIfStatementListItemContext)_localctx).exp = expression(0);
					setState(1007);
					match(RPAR);
					setState(1008);
					((ElseIfStatementListItemContext)_localctx).stmts = statement_or_list();
					}
					} 
				}
				setState(1014);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
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
		public TerminalNode THROW() { return getToken(OParser.THROW, 0); }
		public TerminalNode SEMI() { return getToken(OParser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Raise_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raise_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterRaise_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitRaise_statement(this);
		}
	}

	public final Raise_statementContext raise_statement() throws RecognitionException {
		Raise_statementContext _localctx = new Raise_statementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_raise_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1015);
			match(THROW);
			setState(1016);
			((Raise_statementContext)_localctx).exp = expression(0);
			setState(1017);
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

	public static class Try_statementContext extends ParserRuleContext {
		public Variable_identifierContext name;
		public Statement_listContext stmts;
		public Catch_statement_listContext handlers;
		public Statement_listContext anyStmts;
		public Statement_listContext finalStmts;
		public TerminalNode TRY() { return getToken(OParser.TRY, 0); }
		public List<TerminalNode> LPAR() { return getTokens(OParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(OParser.LPAR, i);
		}
		public List<TerminalNode> RPAR() { return getTokens(OParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(OParser.RPAR, i);
		}
		public List<TerminalNode> LCURL() { return getTokens(OParser.LCURL); }
		public TerminalNode LCURL(int i) {
			return getToken(OParser.LCURL, i);
		}
		public List<TerminalNode> RCURL() { return getTokens(OParser.RCURL); }
		public TerminalNode RCURL(int i) {
			return getToken(OParser.RCURL, i);
		}
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public TerminalNode CATCH() { return getToken(OParser.CATCH, 0); }
		public TerminalNode ANY() { return getToken(OParser.ANY, 0); }
		public TerminalNode FINALLY() { return getToken(OParser.FINALLY, 0); }
		public List<Statement_listContext> statement_list() {
			return getRuleContexts(Statement_listContext.class);
		}
		public Statement_listContext statement_list(int i) {
			return getRuleContext(Statement_listContext.class,i);
		}
		public Catch_statement_listContext catch_statement_list() {
			return getRuleContext(Catch_statement_listContext.class,0);
		}
		public Try_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_try_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterTry_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitTry_statement(this);
		}
	}

	public final Try_statementContext try_statement() throws RecognitionException {
		Try_statementContext _localctx = new Try_statementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_try_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1019);
			match(TRY);
			setState(1020);
			match(LPAR);
			setState(1021);
			((Try_statementContext)_localctx).name = variable_identifier();
			setState(1022);
			match(RPAR);
			setState(1023);
			match(LCURL);
			setState(1025);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << LTCOLONGT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (TYPE - 64)) | (1L << (ANY - 64)) | (1L << (BREAK - 64)) | (1L << (CATEGORY - 64)) | (1L << (DELETE - 64)) | (1L << (DO - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (IF - 64)) | (1L << (METHOD - 64)) | (1L << (MUTABLE - 64)) | (1L << (NULL - 64)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (READ - 136)) | (1L << (RESOURCE - 136)) | (1L << (RETURN - 136)) | (1L << (SELF - 136)) | (1L << (SORTED - 136)) | (1L << (STORE - 136)) | (1L << (SUPER - 136)) | (1L << (SWITCH - 136)) | (1L << (THIS - 136)) | (1L << (THROW - 136)) | (1L << (TRY - 136)) | (1L << (WITH - 136)) | (1L << (WHILE - 136)) | (1L << (WRITE - 136)) | (1L << (BOOLEAN_LITERAL - 136)) | (1L << (CHAR_LITERAL - 136)) | (1L << (MIN_INTEGER - 136)) | (1L << (MAX_INTEGER - 136)) | (1L << (SYMBOL_IDENTIFIER - 136)) | (1L << (TYPE_IDENTIFIER - 136)) | (1L << (VARIABLE_IDENTIFIER - 136)) | (1L << (TEXT_LITERAL - 136)) | (1L << (UUID_LITERAL - 136)) | (1L << (VERSION_LITERAL - 136)) | (1L << (INTEGER_LITERAL - 136)) | (1L << (HEXA_LITERAL - 136)) | (1L << (DECIMAL_LITERAL - 136)) | (1L << (DATETIME_LITERAL - 136)) | (1L << (TIME_LITERAL - 136)) | (1L << (DATE_LITERAL - 136)) | (1L << (PERIOD_LITERAL - 136)))) != 0)) {
				{
				setState(1024);
				((Try_statementContext)_localctx).stmts = statement_list();
				}
			}

			setState(1027);
			match(RCURL);
			setState(1029);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(1028);
				((Try_statementContext)_localctx).handlers = catch_statement_list();
				}
				break;
			}
			setState(1040);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(1031);
				match(CATCH);
				setState(1032);
				match(LPAR);
				setState(1033);
				match(ANY);
				setState(1034);
				match(RPAR);
				setState(1035);
				match(LCURL);
				setState(1037);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << LTCOLONGT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (TYPE - 64)) | (1L << (ANY - 64)) | (1L << (BREAK - 64)) | (1L << (CATEGORY - 64)) | (1L << (DELETE - 64)) | (1L << (DO - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (IF - 64)) | (1L << (METHOD - 64)) | (1L << (MUTABLE - 64)) | (1L << (NULL - 64)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (READ - 136)) | (1L << (RESOURCE - 136)) | (1L << (RETURN - 136)) | (1L << (SELF - 136)) | (1L << (SORTED - 136)) | (1L << (STORE - 136)) | (1L << (SUPER - 136)) | (1L << (SWITCH - 136)) | (1L << (THIS - 136)) | (1L << (THROW - 136)) | (1L << (TRY - 136)) | (1L << (WITH - 136)) | (1L << (WHILE - 136)) | (1L << (WRITE - 136)) | (1L << (BOOLEAN_LITERAL - 136)) | (1L << (CHAR_LITERAL - 136)) | (1L << (MIN_INTEGER - 136)) | (1L << (MAX_INTEGER - 136)) | (1L << (SYMBOL_IDENTIFIER - 136)) | (1L << (TYPE_IDENTIFIER - 136)) | (1L << (VARIABLE_IDENTIFIER - 136)) | (1L << (TEXT_LITERAL - 136)) | (1L << (UUID_LITERAL - 136)) | (1L << (VERSION_LITERAL - 136)) | (1L << (INTEGER_LITERAL - 136)) | (1L << (HEXA_LITERAL - 136)) | (1L << (DECIMAL_LITERAL - 136)) | (1L << (DATETIME_LITERAL - 136)) | (1L << (TIME_LITERAL - 136)) | (1L << (DATE_LITERAL - 136)) | (1L << (PERIOD_LITERAL - 136)))) != 0)) {
					{
					setState(1036);
					((Try_statementContext)_localctx).anyStmts = statement_list();
					}
				}

				setState(1039);
				match(RCURL);
				}
				break;
			}
			setState(1048);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(1042);
				match(FINALLY);
				setState(1043);
				match(LCURL);
				setState(1045);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << LTCOLONGT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (TYPE - 64)) | (1L << (ANY - 64)) | (1L << (BREAK - 64)) | (1L << (CATEGORY - 64)) | (1L << (DELETE - 64)) | (1L << (DO - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (IF - 64)) | (1L << (METHOD - 64)) | (1L << (MUTABLE - 64)) | (1L << (NULL - 64)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (READ - 136)) | (1L << (RESOURCE - 136)) | (1L << (RETURN - 136)) | (1L << (SELF - 136)) | (1L << (SORTED - 136)) | (1L << (STORE - 136)) | (1L << (SUPER - 136)) | (1L << (SWITCH - 136)) | (1L << (THIS - 136)) | (1L << (THROW - 136)) | (1L << (TRY - 136)) | (1L << (WITH - 136)) | (1L << (WHILE - 136)) | (1L << (WRITE - 136)) | (1L << (BOOLEAN_LITERAL - 136)) | (1L << (CHAR_LITERAL - 136)) | (1L << (MIN_INTEGER - 136)) | (1L << (MAX_INTEGER - 136)) | (1L << (SYMBOL_IDENTIFIER - 136)) | (1L << (TYPE_IDENTIFIER - 136)) | (1L << (VARIABLE_IDENTIFIER - 136)) | (1L << (TEXT_LITERAL - 136)) | (1L << (UUID_LITERAL - 136)) | (1L << (VERSION_LITERAL - 136)) | (1L << (INTEGER_LITERAL - 136)) | (1L << (HEXA_LITERAL - 136)) | (1L << (DECIMAL_LITERAL - 136)) | (1L << (DATETIME_LITERAL - 136)) | (1L << (TIME_LITERAL - 136)) | (1L << (DATE_LITERAL - 136)) | (1L << (PERIOD_LITERAL - 136)))) != 0)) {
					{
					setState(1044);
					((Try_statementContext)_localctx).finalStmts = statement_list();
					}
				}

				setState(1047);
				match(RCURL);
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
		public TerminalNode CATCH() { return getToken(OParser.CATCH, 0); }
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public TerminalNode LCURL() { return getToken(OParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(OParser.RCURL, 0); }
		public Symbol_identifierContext symbol_identifier() {
			return getRuleContext(Symbol_identifierContext.class,0);
		}
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public CatchAtomicStatementContext(Catch_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCatchAtomicStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCatchAtomicStatement(this);
		}
	}
	public static class CatchCollectionStatementContext extends Catch_statementContext {
		public Symbol_listContext exp;
		public Statement_listContext stmts;
		public TerminalNode CATCH() { return getToken(OParser.CATCH, 0); }
		public TerminalNode IN() { return getToken(OParser.IN, 0); }
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public TerminalNode LCURL() { return getToken(OParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(OParser.RCURL, 0); }
		public Symbol_listContext symbol_list() {
			return getRuleContext(Symbol_listContext.class,0);
		}
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public CatchCollectionStatementContext(Catch_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCatchCollectionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCatchCollectionStatement(this);
		}
	}

	public final Catch_statementContext catch_statement() throws RecognitionException {
		Catch_statementContext _localctx = new Catch_statementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_catch_statement);
		int _la;
		try {
			setState(1071);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				_localctx = new CatchAtomicStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1050);
				match(CATCH);
				setState(1051);
				match(LPAR);
				setState(1052);
				((CatchAtomicStatementContext)_localctx).name = symbol_identifier();
				setState(1053);
				match(RPAR);
				setState(1054);
				match(LCURL);
				setState(1056);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << LTCOLONGT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (TYPE - 64)) | (1L << (ANY - 64)) | (1L << (BREAK - 64)) | (1L << (CATEGORY - 64)) | (1L << (DELETE - 64)) | (1L << (DO - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (IF - 64)) | (1L << (METHOD - 64)) | (1L << (MUTABLE - 64)) | (1L << (NULL - 64)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (READ - 136)) | (1L << (RESOURCE - 136)) | (1L << (RETURN - 136)) | (1L << (SELF - 136)) | (1L << (SORTED - 136)) | (1L << (STORE - 136)) | (1L << (SUPER - 136)) | (1L << (SWITCH - 136)) | (1L << (THIS - 136)) | (1L << (THROW - 136)) | (1L << (TRY - 136)) | (1L << (WITH - 136)) | (1L << (WHILE - 136)) | (1L << (WRITE - 136)) | (1L << (BOOLEAN_LITERAL - 136)) | (1L << (CHAR_LITERAL - 136)) | (1L << (MIN_INTEGER - 136)) | (1L << (MAX_INTEGER - 136)) | (1L << (SYMBOL_IDENTIFIER - 136)) | (1L << (TYPE_IDENTIFIER - 136)) | (1L << (VARIABLE_IDENTIFIER - 136)) | (1L << (TEXT_LITERAL - 136)) | (1L << (UUID_LITERAL - 136)) | (1L << (VERSION_LITERAL - 136)) | (1L << (INTEGER_LITERAL - 136)) | (1L << (HEXA_LITERAL - 136)) | (1L << (DECIMAL_LITERAL - 136)) | (1L << (DATETIME_LITERAL - 136)) | (1L << (TIME_LITERAL - 136)) | (1L << (DATE_LITERAL - 136)) | (1L << (PERIOD_LITERAL - 136)))) != 0)) {
					{
					setState(1055);
					((CatchAtomicStatementContext)_localctx).stmts = statement_list();
					}
				}

				setState(1058);
				match(RCURL);
				}
				break;
			case 2:
				_localctx = new CatchCollectionStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1060);
				match(CATCH);
				setState(1061);
				match(IN);
				setState(1062);
				match(LPAR);
				setState(1063);
				((CatchCollectionStatementContext)_localctx).exp = symbol_list();
				setState(1064);
				match(RPAR);
				setState(1065);
				match(LCURL);
				setState(1067);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << LTCOLONGT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (TYPE - 64)) | (1L << (ANY - 64)) | (1L << (BREAK - 64)) | (1L << (CATEGORY - 64)) | (1L << (DELETE - 64)) | (1L << (DO - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (IF - 64)) | (1L << (METHOD - 64)) | (1L << (MUTABLE - 64)) | (1L << (NULL - 64)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (READ - 136)) | (1L << (RESOURCE - 136)) | (1L << (RETURN - 136)) | (1L << (SELF - 136)) | (1L << (SORTED - 136)) | (1L << (STORE - 136)) | (1L << (SUPER - 136)) | (1L << (SWITCH - 136)) | (1L << (THIS - 136)) | (1L << (THROW - 136)) | (1L << (TRY - 136)) | (1L << (WITH - 136)) | (1L << (WHILE - 136)) | (1L << (WRITE - 136)) | (1L << (BOOLEAN_LITERAL - 136)) | (1L << (CHAR_LITERAL - 136)) | (1L << (MIN_INTEGER - 136)) | (1L << (MAX_INTEGER - 136)) | (1L << (SYMBOL_IDENTIFIER - 136)) | (1L << (TYPE_IDENTIFIER - 136)) | (1L << (VARIABLE_IDENTIFIER - 136)) | (1L << (TEXT_LITERAL - 136)) | (1L << (UUID_LITERAL - 136)) | (1L << (VERSION_LITERAL - 136)) | (1L << (INTEGER_LITERAL - 136)) | (1L << (HEXA_LITERAL - 136)) | (1L << (DECIMAL_LITERAL - 136)) | (1L << (DATETIME_LITERAL - 136)) | (1L << (TIME_LITERAL - 136)) | (1L << (DATE_LITERAL - 136)) | (1L << (PERIOD_LITERAL - 136)))) != 0)) {
					{
					setState(1066);
					((CatchCollectionStatementContext)_localctx).stmts = statement_list();
					}
				}

				setState(1069);
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

	public static class Break_statementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(OParser.BREAK, 0); }
		public TerminalNode SEMI() { return getToken(OParser.SEMI, 0); }
		public Break_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterBreak_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitBreak_statement(this);
		}
	}

	public final Break_statementContext break_statement() throws RecognitionException {
		Break_statementContext _localctx = new Break_statementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_break_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1073);
			match(BREAK);
			setState(1074);
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

	public static class Return_statementContext extends ParserRuleContext {
		public ExpressionContext exp;
		public TerminalNode RETURN() { return getToken(OParser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(OParser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitReturn_statement(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_return_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1076);
			match(RETURN);
			setState(1078);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << XMARK) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << LTCOLONGT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (TYPE - 64)) | (1L << (ANY - 64)) | (1L << (CATEGORY - 64)) | (1L << (EXECUTE - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (MUTABLE - 64)) | (1L << (NULL - 64)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (READ - 136)) | (1L << (RESOURCE - 136)) | (1L << (SELF - 136)) | (1L << (SORTED - 136)) | (1L << (SUPER - 136)) | (1L << (THIS - 136)) | (1L << (BOOLEAN_LITERAL - 136)) | (1L << (CHAR_LITERAL - 136)) | (1L << (MIN_INTEGER - 136)) | (1L << (MAX_INTEGER - 136)) | (1L << (SYMBOL_IDENTIFIER - 136)) | (1L << (TYPE_IDENTIFIER - 136)) | (1L << (VARIABLE_IDENTIFIER - 136)) | (1L << (TEXT_LITERAL - 136)) | (1L << (UUID_LITERAL - 136)) | (1L << (VERSION_LITERAL - 136)) | (1L << (INTEGER_LITERAL - 136)) | (1L << (HEXA_LITERAL - 136)) | (1L << (DECIMAL_LITERAL - 136)) | (1L << (DATETIME_LITERAL - 136)) | (1L << (TIME_LITERAL - 136)) | (1L << (DATE_LITERAL - 136)) | (1L << (PERIOD_LITERAL - 136)))) != 0)) {
				{
				setState(1077);
				((Return_statementContext)_localctx).exp = expression(0);
				}
			}

			setState(1080);
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

	public static class Method_call_expressionContext extends ParserRuleContext {
		public Method_identifierContext name;
		public Argument_assignment_listContext args;
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public Method_identifierContext method_identifier() {
			return getRuleContext(Method_identifierContext.class,0);
		}
		public Argument_assignment_listContext argument_assignment_list() {
			return getRuleContext(Argument_assignment_listContext.class,0);
		}
		public Method_call_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_call_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterMethod_call_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitMethod_call_expression(this);
		}
	}

	public final Method_call_expressionContext method_call_expression() throws RecognitionException {
		Method_call_expressionContext _localctx = new Method_call_expressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_method_call_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1082);
			((Method_call_expressionContext)_localctx).name = method_identifier();
			setState(1083);
			match(LPAR);
			setState(1085);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << XMARK) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << LTCOLONGT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (TYPE - 64)) | (1L << (ANY - 64)) | (1L << (CATEGORY - 64)) | (1L << (EXECUTE - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (MUTABLE - 64)) | (1L << (NULL - 64)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (READ - 136)) | (1L << (RESOURCE - 136)) | (1L << (SELF - 136)) | (1L << (SORTED - 136)) | (1L << (SUPER - 136)) | (1L << (THIS - 136)) | (1L << (BOOLEAN_LITERAL - 136)) | (1L << (CHAR_LITERAL - 136)) | (1L << (MIN_INTEGER - 136)) | (1L << (MAX_INTEGER - 136)) | (1L << (SYMBOL_IDENTIFIER - 136)) | (1L << (TYPE_IDENTIFIER - 136)) | (1L << (VARIABLE_IDENTIFIER - 136)) | (1L << (TEXT_LITERAL - 136)) | (1L << (UUID_LITERAL - 136)) | (1L << (VERSION_LITERAL - 136)) | (1L << (INTEGER_LITERAL - 136)) | (1L << (HEXA_LITERAL - 136)) | (1L << (DECIMAL_LITERAL - 136)) | (1L << (DATETIME_LITERAL - 136)) | (1L << (TIME_LITERAL - 136)) | (1L << (DATE_LITERAL - 136)) | (1L << (PERIOD_LITERAL - 136)))) != 0)) {
				{
				setState(1084);
				((Method_call_expressionContext)_localctx).args = argument_assignment_list(0);
				}
			}

			setState(1087);
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

	public static class Method_call_statementContext extends ParserRuleContext {
		public Instance_expressionContext parent;
		public Method_call_expressionContext method;
		public Variable_identifierContext name;
		public Statement_listContext stmts;
		public Method_call_expressionContext method_call_expression() {
			return getRuleContext(Method_call_expressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(OParser.SEMI, 0); }
		public TerminalNode DOT() { return getToken(OParser.DOT, 0); }
		public Instance_expressionContext instance_expression() {
			return getRuleContext(Instance_expressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(OParser.THEN, 0); }
		public TerminalNode LCURL() { return getToken(OParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(OParser.RCURL, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public TerminalNode WITH() { return getToken(OParser.WITH, 0); }
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public Method_call_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_call_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterMethod_call_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitMethod_call_statement(this);
		}
	}

	public final Method_call_statementContext method_call_statement() throws RecognitionException {
		Method_call_statementContext _localctx = new Method_call_statementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_method_call_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1092);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(1089);
				((Method_call_statementContext)_localctx).parent = instance_expression(0);
				setState(1090);
				match(DOT);
				}
				break;
			}
			setState(1094);
			((Method_call_statementContext)_localctx).method = method_call_expression();
			setState(1105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THEN:
				{
				{
				setState(1095);
				match(THEN);
				setState(1098);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(1096);
					match(WITH);
					setState(1097);
					((Method_call_statementContext)_localctx).name = variable_identifier();
					}
				}

				setState(1100);
				match(LCURL);
				setState(1101);
				((Method_call_statementContext)_localctx).stmts = statement_list();
				setState(1102);
				match(RCURL);
				}
				}
				break;
			case SEMI:
				{
				setState(1104);
				match(SEMI);
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

	public static class X_expressionContext extends ParserRuleContext {
		public Css_expressionContext css_expression() {
			return getRuleContext(Css_expressionContext.class,0);
		}
		public X_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_x_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterX_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitX_expression(this);
		}
	}

	public final X_expressionContext x_expression() throws RecognitionException {
		X_expressionContext _localctx = new X_expressionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_x_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1107);
			css_expression();
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterIntDivideExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitIntDivideExpression(this);
		}
	}
	public static class HasAnyExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Filter_expressionContext right;
		public TerminalNode HAS() { return getToken(OParser.HAS, 0); }
		public TerminalNode ANY() { return getToken(OParser.ANY, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Filter_expressionContext filter_expression() {
			return getRuleContext(Filter_expressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(OParser.NOT, 0); }
		public HasAnyExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterHasAnyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitHasAnyExpression(this);
		}
	}
	public static class HasExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode HAS() { return getToken(OParser.HAS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(OParser.NOT, 0); }
		public HasExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterHasExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitHasExpression(this);
		}
	}
	public static class TernaryExpressionContext extends ExpressionContext {
		public ExpressionContext test;
		public ExpressionContext ifTrue;
		public ExpressionContext ifFalse;
		public TerminalNode QMARK() { return getToken(OParser.QMARK, 0); }
		public TerminalNode COLON() { return getToken(OParser.COLON, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TernaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterTernaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitTernaryExpression(this);
		}
	}
	public static class InExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode IN() { return getToken(OParser.IN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(OParser.NOT, 0); }
		public InExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterInExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitInExpression(this);
		}
	}
	public static class IsAnExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public An_expressionContext right;
		public TerminalNode IS() { return getToken(OParser.IS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public An_expressionContext an_expression() {
			return getRuleContext(An_expressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(OParser.NOT, 0); }
		public IsAnExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterIsAnExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitIsAnExpression(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJsxExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJsxExpression(this);
		}
	}
	public static class NotExpressionContext extends ExpressionContext {
		public ExpressionContext exp;
		public TerminalNode XMARK() { return getToken(OParser.XMARK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitNotExpression(this);
		}
	}
	public static class CompareExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LT() { return getToken(OParser.LT, 0); }
		public TerminalNode LTE() { return getToken(OParser.LTE, 0); }
		public TerminalNode GT() { return getToken(OParser.GT, 0); }
		public TerminalNode GTE() { return getToken(OParser.GTE, 0); }
		public CompareExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCompareExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCompareExpression(this);
		}
	}
	public static class OrExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode PIPE2() { return getToken(OParser.PIPE2, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OrExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitOrExpression(this);
		}
	}
	public static class CodeExpressionContext extends ExpressionContext {
		public ExpressionContext exp;
		public TerminalNode CODE() { return getToken(OParser.CODE, 0); }
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CodeExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCodeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCodeExpression(this);
		}
	}
	public static class AndExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode AMP2() { return getToken(OParser.AMP2, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AndExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitAndExpression(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterArrowExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitArrowExpression(this);
		}
	}
	public static class ContainsExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode CONTAINS() { return getToken(OParser.CONTAINS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(OParser.NOT, 0); }
		public ContainsExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterContainsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitContainsExpression(this);
		}
	}
	public static class TypeExpressionContext extends ExpressionContext {
		public Type_expressionContext exp;
		public Type_expressionContext type_expression() {
			return getRuleContext(Type_expressionContext.class,0);
		}
		public TypeExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterTypeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitTypeExpression(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterMultiplyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitMultiplyExpression(this);
		}
	}
	public static class ExecuteExpressionContext extends ExpressionContext {
		public Variable_identifierContext name;
		public TerminalNode EXECUTE() { return getToken(OParser.EXECUTE, 0); }
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public ExecuteExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterExecuteExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitExecuteExpression(this);
		}
	}
	public static class IteratorExpressionContext extends ExpressionContext {
		public ExpressionContext exp;
		public Variable_identifierContext name;
		public ExpressionContext source;
		public TerminalNode FOR() { return getToken(OParser.FOR, 0); }
		public TerminalNode EACH() { return getToken(OParser.EACH, 0); }
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode IN() { return getToken(OParser.IN, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterIteratorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitIteratorExpression(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterDivideExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitDivideExpression(this);
		}
	}
	public static class IsExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode IS() { return getToken(OParser.IS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(OParser.NOT, 0); }
		public IsExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterIsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitIsExpression(this);
		}
	}
	public static class MinusExpressionContext extends ExpressionContext {
		public ExpressionContext exp;
		public TerminalNode MINUS() { return getToken(OParser.MINUS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MinusExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterMinusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitMinusExpression(this);
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
		public TerminalNode PLUS() { return getToken(OParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(OParser.MINUS, 0); }
		public AddExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterAddExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitAddExpression(this);
		}
	}
	public static class HasAllExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Filter_expressionContext right;
		public TerminalNode HAS() { return getToken(OParser.HAS, 0); }
		public TerminalNode ALL() { return getToken(OParser.ALL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Filter_expressionContext filter_expression() {
			return getRuleContext(Filter_expressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(OParser.NOT, 0); }
		public HasAllExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterHasAllExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitHasAllExpression(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterInstanceExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitInstanceExpression(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterMutableInstanceExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitMutableInstanceExpression(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCssExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCssExpression(this);
		}
	}
	public static class CastExpressionContext extends ExpressionContext {
		public Category_or_any_typeContext right;
		public ExpressionContext left;
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public Category_or_any_typeContext category_or_any_type() {
			return getRuleContext(Category_or_any_typeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode MUTABLE() { return getToken(OParser.MUTABLE, 0); }
		public CastExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCastExpression(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterModuloExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitModuloExpression(this);
		}
	}
	public static class EqualsExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQ2() { return getToken(OParser.EQ2, 0); }
		public TerminalNode XEQ() { return getToken(OParser.XEQ, 0); }
		public TerminalNode TEQ() { return getToken(OParser.TEQ, 0); }
		public EqualsExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterEqualsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitEqualsExpression(this);
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
		int _startState = 94;
		enterRecursionRule(_localctx, 94, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				_localctx = new CssExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1110);
				((CssExpressionContext)_localctx).exp = css_expression();
				}
				break;
			case 2:
				{
				_localctx = new JsxExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1111);
				((JsxExpressionContext)_localctx).exp = jsx_expression();
				}
				break;
			case 3:
				{
				_localctx = new InstanceExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1112);
				((InstanceExpressionContext)_localctx).exp = instance_expression(0);
				}
				break;
			case 4:
				{
				_localctx = new MutableInstanceExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1113);
				((MutableInstanceExpressionContext)_localctx).exp = mutable_instance_expression(0);
				}
				break;
			case 5:
				{
				_localctx = new ArrowExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1114);
				((ArrowExpressionContext)_localctx).exp = arrow_expression();
				}
				break;
			case 6:
				{
				_localctx = new MinusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1115);
				match(MINUS);
				setState(1116);
				((MinusExpressionContext)_localctx).exp = expression(24);
				}
				break;
			case 7:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1117);
				match(XMARK);
				setState(1118);
				((NotExpressionContext)_localctx).exp = expression(23);
				}
				break;
			case 8:
				{
				_localctx = new CastExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1119);
				match(LPAR);
				setState(1121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MUTABLE) {
					{
					setState(1120);
					match(MUTABLE);
					}
				}

				setState(1123);
				((CastExpressionContext)_localctx).right = category_or_any_type();
				setState(1124);
				match(RPAR);
				setState(1125);
				((CastExpressionContext)_localctx).left = expression(22);
				}
				break;
			case 9:
				{
				_localctx = new CodeExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1127);
				match(CODE);
				setState(1128);
				match(LPAR);
				setState(1129);
				((CodeExpressionContext)_localctx).exp = expression(0);
				setState(1130);
				match(RPAR);
				}
				break;
			case 10:
				{
				_localctx = new ExecuteExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1132);
				match(EXECUTE);
				setState(1133);
				match(LPAR);
				setState(1134);
				((ExecuteExpressionContext)_localctx).name = variable_identifier();
				setState(1135);
				match(RPAR);
				}
				break;
			case 11:
				{
				_localctx = new TypeExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1137);
				((TypeExpressionContext)_localctx).exp = type_expression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1232);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1230);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplyExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((MultiplyExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1140);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1141);
						multiply();
						setState(1142);
						((MultiplyExpressionContext)_localctx).right = expression(22);
						}
						break;
					case 2:
						{
						_localctx = new DivideExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((DivideExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1144);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1145);
						divide();
						setState(1146);
						((DivideExpressionContext)_localctx).right = expression(21);
						}
						break;
					case 3:
						{
						_localctx = new ModuloExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ModuloExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1148);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1149);
						modulo();
						setState(1150);
						((ModuloExpressionContext)_localctx).right = expression(20);
						}
						break;
					case 4:
						{
						_localctx = new IntDivideExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((IntDivideExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1152);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1153);
						idivide();
						setState(1154);
						((IntDivideExpressionContext)_localctx).right = expression(19);
						}
						break;
					case 5:
						{
						_localctx = new AddExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((AddExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1156);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1157);
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
						setState(1158);
						((AddExpressionContext)_localctx).right = expression(18);
						}
						break;
					case 6:
						{
						_localctx = new CompareExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((CompareExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1159);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1160);
						((CompareExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << GTE) | (1L << LT) | (1L << LTE))) != 0)) ) {
							((CompareExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1161);
						((CompareExpressionContext)_localctx).right = expression(17);
						}
						break;
					case 7:
						{
						_localctx = new IsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((IsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1162);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1163);
						match(IS);
						setState(1165);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(1164);
							match(NOT);
							}
						}

						setState(1167);
						((IsExpressionContext)_localctx).right = expression(15);
						}
						break;
					case 8:
						{
						_localctx = new EqualsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((EqualsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1168);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1169);
						((EqualsExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << XEQ) | (1L << EQ2) | (1L << TEQ))) != 0)) ) {
							((EqualsExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1170);
						((EqualsExpressionContext)_localctx).right = expression(14);
						}
						break;
					case 9:
						{
						_localctx = new ContainsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ContainsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1171);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1173);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(1172);
							match(NOT);
							}
						}

						setState(1175);
						match(CONTAINS);
						setState(1176);
						((ContainsExpressionContext)_localctx).right = expression(13);
						}
						break;
					case 10:
						{
						_localctx = new InExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((InExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1177);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1179);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(1178);
							match(NOT);
							}
						}

						setState(1181);
						match(IN);
						setState(1182);
						((InExpressionContext)_localctx).right = expression(12);
						}
						break;
					case 11:
						{
						_localctx = new HasExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((HasExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1183);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1185);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(1184);
							match(NOT);
							}
						}

						setState(1187);
						match(HAS);
						setState(1188);
						((HasExpressionContext)_localctx).right = expression(11);
						}
						break;
					case 12:
						{
						_localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((OrExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1189);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1190);
						match(PIPE2);
						setState(1191);
						((OrExpressionContext)_localctx).right = expression(8);
						}
						break;
					case 13:
						{
						_localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((AndExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1192);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1193);
						match(AMP2);
						setState(1194);
						((AndExpressionContext)_localctx).right = expression(7);
						}
						break;
					case 14:
						{
						_localctx = new TernaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((TernaryExpressionContext)_localctx).test = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1195);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1196);
						match(QMARK);
						setState(1197);
						((TernaryExpressionContext)_localctx).ifTrue = expression(0);
						setState(1198);
						match(COLON);
						setState(1199);
						((TernaryExpressionContext)_localctx).ifFalse = expression(6);
						}
						break;
					case 15:
						{
						_localctx = new IsAnExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((IsAnExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1201);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1202);
						match(IS);
						setState(1204);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
						case 1:
							{
							setState(1203);
							match(NOT);
							}
							break;
						}
						setState(1206);
						((IsAnExpressionContext)_localctx).right = an_expression();
						}
						break;
					case 16:
						{
						_localctx = new HasAllExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((HasAllExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1207);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1209);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(1208);
							match(NOT);
							}
						}

						setState(1211);
						match(HAS);
						setState(1212);
						match(ALL);
						setState(1213);
						((HasAllExpressionContext)_localctx).right = filter_expression();
						}
						break;
					case 17:
						{
						_localctx = new HasAnyExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((HasAnyExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1214);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1216);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(1215);
							match(NOT);
							}
						}

						setState(1218);
						match(HAS);
						setState(1219);
						match(ANY);
						setState(1220);
						((HasAnyExpressionContext)_localctx).right = filter_expression();
						}
						break;
					case 18:
						{
						_localctx = new IteratorExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((IteratorExpressionContext)_localctx).exp = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1221);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1222);
						match(FOR);
						setState(1223);
						match(EACH);
						setState(1224);
						match(LPAR);
						setState(1225);
						((IteratorExpressionContext)_localctx).name = variable_identifier();
						setState(1226);
						match(IN);
						setState(1227);
						((IteratorExpressionContext)_localctx).source = expression(0);
						setState(1228);
						match(RPAR);
						}
						break;
					}
					} 
				}
				setState(1234);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
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

	public static class Filter_expressionContext extends ParserRuleContext {
		public Filter_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter_expression; }
	 
		public Filter_expressionContext() { }
		public void copyFrom(Filter_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExplicitFilterExpressionContext extends Filter_expressionContext {
		public List<TerminalNode> LPAR() { return getTokens(OParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(OParser.LPAR, i);
		}
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public List<TerminalNode> RPAR() { return getTokens(OParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(OParser.RPAR, i);
		}
		public TerminalNode WHERE() { return getToken(OParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExplicitFilterExpressionContext(Filter_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterExplicitFilterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitExplicitFilterExpression(this);
		}
	}
	public static class OtherFilterExpressionContext extends Filter_expressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OtherFilterExpressionContext(Filter_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterOtherFilterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitOtherFilterExpression(this);
		}
	}
	public static class ArrowFilterExpressionContext extends Filter_expressionContext {
		public TerminalNode WHERE() { return getToken(OParser.WHERE, 0); }
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public Arrow_expressionContext arrow_expression() {
			return getRuleContext(Arrow_expressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public ArrowFilterExpressionContext(Filter_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterArrowFilterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitArrowFilterExpression(this);
		}
	}

	public final Filter_expressionContext filter_expression() throws RecognitionException {
		Filter_expressionContext _localctx = new Filter_expressionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_filter_expression);
		try {
			setState(1249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				_localctx = new ArrowFilterExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1235);
				match(WHERE);
				setState(1236);
				match(LPAR);
				setState(1237);
				arrow_expression();
				setState(1238);
				match(RPAR);
				}
				break;
			case 2:
				_localctx = new ExplicitFilterExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1240);
				match(LPAR);
				setState(1241);
				variable_identifier();
				setState(1242);
				match(RPAR);
				setState(1243);
				match(WHERE);
				setState(1244);
				match(LPAR);
				setState(1245);
				expression(0);
				setState(1246);
				match(RPAR);
				}
				break;
			case 3:
				_localctx = new OtherFilterExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1248);
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

	public static class An_expressionContext extends ParserRuleContext {
		public Category_or_any_typeContext typ;
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(OParser.VARIABLE_IDENTIFIER, 0); }
		public Category_or_any_typeContext category_or_any_type() {
			return getRuleContext(Category_or_any_typeContext.class,0);
		}
		public An_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterAn_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitAn_expression(this);
		}
	}

	public final An_expressionContext an_expression() throws RecognitionException {
		An_expressionContext _localctx = new An_expressionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_an_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1251);
			if (!(this.willBeAOrAn())) throw new FailedPredicateException(this, "$parser.willBeAOrAn()");
			setState(1252);
			match(VARIABLE_IDENTIFIER);
			setState(1253);
			((An_expressionContext)_localctx).typ = category_or_any_type();
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

	public static class Type_expressionContext extends ParserRuleContext {
		public Type_identifierContext name;
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Type_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterType_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitType_expression(this);
		}
	}

	public final Type_expressionContext type_expression() throws RecognitionException {
		Type_expressionContext _localctx = new Type_expressionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_type_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1255);
			((Type_expressionContext)_localctx).name = type_identifier();
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterThisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitThisExpression(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterParenthesisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitParenthesisExpression(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitLiteralExpression(this);
		}
	}
	public static class MethodExpressionContext extends Selectable_expressionContext {
		public Method_expressionContext exp;
		public Method_expressionContext method_expression() {
			return getRuleContext(Method_expressionContext.class,0);
		}
		public MethodExpressionContext(Selectable_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterMethodExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitMethodExpression(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterSuperExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitSuperExpression(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitIdentifierExpression(this);
		}
	}

	public final Selectable_expressionContext selectable_expression() throws RecognitionException {
		Selectable_expressionContext _localctx = new Selectable_expressionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_selectable_expression);
		try {
			setState(1263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				_localctx = new MethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1257);
				((MethodExpressionContext)_localctx).exp = method_expression();
				}
				break;
			case 2:
				_localctx = new ParenthesisExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1258);
				((ParenthesisExpressionContext)_localctx).exp = parenthesis_expression();
				}
				break;
			case 3:
				_localctx = new LiteralExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1259);
				((LiteralExpressionContext)_localctx).exp = literal_expression();
				}
				break;
			case 4:
				_localctx = new IdentifierExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1260);
				((IdentifierExpressionContext)_localctx).exp = identifier();
				}
				break;
			case 5:
				_localctx = new ThisExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1261);
				((ThisExpressionContext)_localctx).exp = this_expression();
				}
				break;
			case 6:
				_localctx = new SuperExpressionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1262);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterSelectorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitSelectorExpression(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterSelectableExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitSelectableExpression(this);
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
		int _startState = 104;
		enterRecursionRule(_localctx, 104, RULE_instance_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SelectableExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1266);
			((SelectableExpressionContext)_localctx).parent = selectable_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(1272);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SelectorExpressionContext(new Instance_expressionContext(_parentctx, _parentState));
					((SelectorExpressionContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_instance_expression);
					setState(1268);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1269);
					((SelectorExpressionContext)_localctx).selector = instance_selector();
					}
					} 
				}
				setState(1274);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
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
		public TerminalNode MUTABLE() { return getToken(OParser.MUTABLE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MutableSelectableExpressionContext(Mutable_instance_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterMutableSelectableExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitMutableSelectableExpression(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterMutableSelectorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitMutableSelectorExpression(this);
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

			setState(1276);
			match(MUTABLE);
			setState(1277);
			((MutableSelectableExpressionContext)_localctx).exp = identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(1283);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MutableSelectorExpressionContext(new Mutable_instance_expressionContext(_parentctx, _parentState));
					((MutableSelectorExpressionContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_mutable_instance_expression);
					setState(1279);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1280);
					((MutableSelectorExpressionContext)_localctx).selector = instance_selector();
					}
					} 
				}
				setState(1285);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
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

	public static class Method_expressionContext extends ParserRuleContext {
		public Blob_expressionContext blob_expression() {
			return getRuleContext(Blob_expressionContext.class,0);
		}
		public Document_expressionContext document_expression() {
			return getRuleContext(Document_expressionContext.class,0);
		}
		public Filtered_list_expressionContext filtered_list_expression() {
			return getRuleContext(Filtered_list_expressionContext.class,0);
		}
		public Fetch_expressionContext fetch_expression() {
			return getRuleContext(Fetch_expressionContext.class,0);
		}
		public Read_blob_expressionContext read_blob_expression() {
			return getRuleContext(Read_blob_expressionContext.class,0);
		}
		public Read_all_expressionContext read_all_expression() {
			return getRuleContext(Read_all_expressionContext.class,0);
		}
		public Read_one_expressionContext read_one_expression() {
			return getRuleContext(Read_one_expressionContext.class,0);
		}
		public Sorted_expressionContext sorted_expression() {
			return getRuleContext(Sorted_expressionContext.class,0);
		}
		public Method_call_expressionContext method_call_expression() {
			return getRuleContext(Method_call_expressionContext.class,0);
		}
		public Constructor_expressionContext constructor_expression() {
			return getRuleContext(Constructor_expressionContext.class,0);
		}
		public Method_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterMethod_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitMethod_expression(this);
		}
	}

	public final Method_expressionContext method_expression() throws RecognitionException {
		Method_expressionContext _localctx = new Method_expressionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_method_expression);
		try {
			setState(1296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1286);
				blob_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1287);
				document_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1288);
				filtered_list_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1289);
				fetch_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1290);
				read_blob_expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1291);
				read_all_expression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1292);
				read_one_expression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1293);
				sorted_expression();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1294);
				method_call_expression();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1295);
				constructor_expression();
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

	public static class Blob_expressionContext extends ParserRuleContext {
		public TerminalNode BLOB() { return getToken(OParser.BLOB, 0); }
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public Blob_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blob_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterBlob_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitBlob_expression(this);
		}
	}

	public final Blob_expressionContext blob_expression() throws RecognitionException {
		Blob_expressionContext _localctx = new Blob_expressionContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_blob_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1298);
			match(BLOB);
			setState(1299);
			match(LPAR);
			setState(1300);
			expression(0);
			setState(1301);
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

	public static class Document_expressionContext extends ParserRuleContext {
		public ExpressionContext exp;
		public TerminalNode DOCUMENT() { return getToken(OParser.DOCUMENT, 0); }
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public TerminalNode FROM() { return getToken(OParser.FROM, 0); }
		public TerminalNode EQ() { return getToken(OParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Document_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterDocument_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitDocument_expression(this);
		}
	}

	public final Document_expressionContext document_expression() throws RecognitionException {
		Document_expressionContext _localctx = new Document_expressionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_document_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1303);
			match(DOCUMENT);
			setState(1304);
			match(LPAR);
			setState(1308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(1305);
				match(FROM);
				setState(1306);
				match(EQ);
				setState(1307);
				((Document_expressionContext)_localctx).exp = expression(0);
				}
			}

			setState(1310);
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

	public static class Write_statementContext extends ParserRuleContext {
		public ExpressionContext what;
		public ExpressionContext target;
		public TerminalNode WRITE() { return getToken(OParser.WRITE, 0); }
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public TerminalNode TO() { return getToken(OParser.TO, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ThenContext then() {
			return getRuleContext(ThenContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(OParser.SEMI, 0); }
		public Write_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterWrite_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitWrite_statement(this);
		}
	}

	public final Write_statementContext write_statement() throws RecognitionException {
		Write_statementContext _localctx = new Write_statementContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_write_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1312);
			match(WRITE);
			setState(1313);
			match(LPAR);
			setState(1314);
			((Write_statementContext)_localctx).what = expression(0);
			setState(1315);
			match(RPAR);
			setState(1316);
			match(TO);
			setState(1317);
			((Write_statementContext)_localctx).target = expression(0);
			setState(1320);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THEN:
				{
				setState(1318);
				then();
				}
				break;
			case SEMI:
				{
				setState(1319);
				match(SEMI);
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

	public static class Filtered_list_expressionContext extends ParserRuleContext {
		public ExpressionContext source;
		public Variable_identifierContext name;
		public ExpressionContext predicate;
		public TerminalNode FILTERED() { return getToken(OParser.FILTERED, 0); }
		public List<TerminalNode> LPAR() { return getTokens(OParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(OParser.LPAR, i);
		}
		public List<TerminalNode> RPAR() { return getTokens(OParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(OParser.RPAR, i);
		}
		public TerminalNode WHERE() { return getToken(OParser.WHERE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode WITH() { return getToken(OParser.WITH, 0); }
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public Filtered_list_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filtered_list_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterFiltered_list_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitFiltered_list_expression(this);
		}
	}

	public final Filtered_list_expressionContext filtered_list_expression() throws RecognitionException {
		Filtered_list_expressionContext _localctx = new Filtered_list_expressionContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_filtered_list_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1322);
			match(FILTERED);
			setState(1323);
			match(LPAR);
			setState(1324);
			((Filtered_list_expressionContext)_localctx).source = expression(0);
			setState(1325);
			match(RPAR);
			setState(1331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1326);
				match(WITH);
				setState(1327);
				match(LPAR);
				setState(1328);
				((Filtered_list_expressionContext)_localctx).name = variable_identifier();
				setState(1329);
				match(RPAR);
				}
			}

			setState(1333);
			match(WHERE);
			setState(1334);
			match(LPAR);
			setState(1335);
			((Filtered_list_expressionContext)_localctx).predicate = expression(0);
			setState(1336);
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
		public Include_listContext include;
		public TerminalNode FETCH() { return getToken(OParser.FETCH, 0); }
		public TerminalNode ONE() { return getToken(OParser.ONE, 0); }
		public TerminalNode WHERE() { return getToken(OParser.WHERE, 0); }
		public List<TerminalNode> LPAR() { return getTokens(OParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(OParser.LPAR, i);
		}
		public List<TerminalNode> RPAR() { return getTokens(OParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(OParser.RPAR, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode INCLUDE() { return getToken(OParser.INCLUDE, 0); }
		public Mutable_category_typeContext mutable_category_type() {
			return getRuleContext(Mutable_category_typeContext.class,0);
		}
		public Include_listContext include_list() {
			return getRuleContext(Include_listContext.class,0);
		}
		public FetchOneContext(Fetch_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterFetchOne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitFetchOne(this);
		}
	}
	public static class FetchManyContext extends Fetch_expressionContext {
		public Mutable_category_typeContext typ;
		public ExpressionContext xstart;
		public ExpressionContext xstop;
		public ExpressionContext predicate;
		public Include_listContext include;
		public Order_by_listContext orderby;
		public TerminalNode FETCH() { return getToken(OParser.FETCH, 0); }
		public TerminalNode WHERE() { return getToken(OParser.WHERE, 0); }
		public List<TerminalNode> LPAR() { return getTokens(OParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(OParser.LPAR, i);
		}
		public List<TerminalNode> RPAR() { return getTokens(OParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(OParser.RPAR, i);
		}
		public TerminalNode INCLUDE() { return getToken(OParser.INCLUDE, 0); }
		public TerminalNode ORDER() { return getToken(OParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(OParser.BY, 0); }
		public TerminalNode ALL() { return getToken(OParser.ALL, 0); }
		public TerminalNode ROWS() { return getToken(OParser.ROWS, 0); }
		public TerminalNode TO() { return getToken(OParser.TO, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Include_listContext include_list() {
			return getRuleContext(Include_listContext.class,0);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterFetchMany(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitFetchMany(this);
		}
	}

	public final Fetch_expressionContext fetch_expression() throws RecognitionException {
		Fetch_expressionContext _localctx = new Fetch_expressionContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_fetch_expression);
		int _la;
		try {
			setState(1402);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				_localctx = new FetchOneContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1338);
				match(FETCH);
				setState(1339);
				match(ONE);
				setState(1344);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAR) {
					{
					setState(1340);
					match(LPAR);
					setState(1341);
					((FetchOneContext)_localctx).typ = mutable_category_type();
					setState(1342);
					match(RPAR);
					}
				}

				setState(1346);
				match(WHERE);
				setState(1347);
				match(LPAR);
				setState(1348);
				((FetchOneContext)_localctx).predicate = expression(0);
				setState(1349);
				match(RPAR);
				setState(1355);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
				case 1:
					{
					setState(1350);
					match(INCLUDE);
					setState(1351);
					match(LPAR);
					setState(1352);
					((FetchOneContext)_localctx).include = include_list();
					setState(1353);
					match(RPAR);
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new FetchManyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1357);
				match(FETCH);
				setState(1378);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ALL:
					{
					{
					setState(1358);
					match(ALL);
					setState(1363);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
					case 1:
						{
						setState(1359);
						match(LPAR);
						setState(1360);
						((FetchManyContext)_localctx).typ = mutable_category_type();
						setState(1361);
						match(RPAR);
						}
						break;
					}
					}
					}
					break;
				case LPAR:
				case ROWS:
					{
					{
					setState(1369);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LPAR) {
						{
						setState(1365);
						match(LPAR);
						setState(1366);
						((FetchManyContext)_localctx).typ = mutable_category_type();
						setState(1367);
						match(RPAR);
						}
					}

					setState(1371);
					match(ROWS);
					setState(1372);
					match(LPAR);
					setState(1373);
					((FetchManyContext)_localctx).xstart = expression(0);
					setState(1374);
					match(TO);
					setState(1375);
					((FetchManyContext)_localctx).xstop = expression(0);
					setState(1376);
					match(RPAR);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1385);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
				case 1:
					{
					setState(1380);
					match(WHERE);
					setState(1381);
					match(LPAR);
					setState(1382);
					((FetchManyContext)_localctx).predicate = expression(0);
					setState(1383);
					match(RPAR);
					}
					break;
				}
				setState(1392);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(1387);
					match(INCLUDE);
					setState(1388);
					match(LPAR);
					setState(1389);
					((FetchManyContext)_localctx).include = include_list();
					setState(1390);
					match(RPAR);
					}
					break;
				}
				setState(1400);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
				case 1:
					{
					setState(1394);
					match(ORDER);
					setState(1395);
					match(BY);
					setState(1396);
					match(LPAR);
					setState(1397);
					((FetchManyContext)_localctx).orderby = order_by_list();
					setState(1398);
					match(RPAR);
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
		public Include_listContext include;
		public Order_by_listContext orderby;
		public TerminalNode FETCH() { return getToken(OParser.FETCH, 0); }
		public ThenContext then() {
			return getRuleContext(ThenContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(OParser.WHERE, 0); }
		public List<TerminalNode> LPAR() { return getTokens(OParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(OParser.LPAR, i);
		}
		public List<TerminalNode> RPAR() { return getTokens(OParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(OParser.RPAR, i);
		}
		public TerminalNode INCLUDE() { return getToken(OParser.INCLUDE, 0); }
		public TerminalNode ORDER() { return getToken(OParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(OParser.BY, 0); }
		public TerminalNode ALL() { return getToken(OParser.ALL, 0); }
		public TerminalNode ROWS() { return getToken(OParser.ROWS, 0); }
		public TerminalNode TO() { return getToken(OParser.TO, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Include_listContext include_list() {
			return getRuleContext(Include_listContext.class,0);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterFetchManyAsync(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitFetchManyAsync(this);
		}
	}
	public static class FetchOneAsyncContext extends Fetch_statementContext {
		public Mutable_category_typeContext typ;
		public ExpressionContext predicate;
		public Include_listContext include;
		public TerminalNode FETCH() { return getToken(OParser.FETCH, 0); }
		public TerminalNode ONE() { return getToken(OParser.ONE, 0); }
		public TerminalNode WHERE() { return getToken(OParser.WHERE, 0); }
		public List<TerminalNode> LPAR() { return getTokens(OParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(OParser.LPAR, i);
		}
		public List<TerminalNode> RPAR() { return getTokens(OParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(OParser.RPAR, i);
		}
		public ThenContext then() {
			return getRuleContext(ThenContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode INCLUDE() { return getToken(OParser.INCLUDE, 0); }
		public Mutable_category_typeContext mutable_category_type() {
			return getRuleContext(Mutable_category_typeContext.class,0);
		}
		public Include_listContext include_list() {
			return getRuleContext(Include_listContext.class,0);
		}
		public FetchOneAsyncContext(Fetch_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterFetchOneAsync(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitFetchOneAsync(this);
		}
	}

	public final Fetch_statementContext fetch_statement() throws RecognitionException {
		Fetch_statementContext _localctx = new Fetch_statementContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_fetch_statement);
		int _la;
		try {
			setState(1471);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				_localctx = new FetchOneAsyncContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1404);
				match(FETCH);
				setState(1405);
				match(ONE);
				setState(1410);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAR) {
					{
					setState(1406);
					match(LPAR);
					setState(1407);
					((FetchOneAsyncContext)_localctx).typ = mutable_category_type();
					setState(1408);
					match(RPAR);
					}
				}

				setState(1412);
				match(WHERE);
				setState(1413);
				match(LPAR);
				setState(1414);
				((FetchOneAsyncContext)_localctx).predicate = expression(0);
				setState(1415);
				match(RPAR);
				setState(1421);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INCLUDE) {
					{
					setState(1416);
					match(INCLUDE);
					setState(1417);
					match(LPAR);
					setState(1418);
					((FetchOneAsyncContext)_localctx).include = include_list();
					setState(1419);
					match(RPAR);
					}
				}

				setState(1423);
				then();
				}
				break;
			case 2:
				_localctx = new FetchManyAsyncContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1425);
				match(FETCH);
				setState(1446);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ALL:
					{
					{
					setState(1426);
					match(ALL);
					setState(1431);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LPAR) {
						{
						setState(1427);
						match(LPAR);
						setState(1428);
						((FetchManyAsyncContext)_localctx).typ = mutable_category_type();
						setState(1429);
						match(RPAR);
						}
					}

					}
					}
					break;
				case LPAR:
				case ROWS:
					{
					{
					setState(1437);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LPAR) {
						{
						setState(1433);
						match(LPAR);
						setState(1434);
						((FetchManyAsyncContext)_localctx).typ = mutable_category_type();
						setState(1435);
						match(RPAR);
						}
					}

					setState(1439);
					match(ROWS);
					setState(1440);
					match(LPAR);
					setState(1441);
					((FetchManyAsyncContext)_localctx).xstart = expression(0);
					setState(1442);
					match(TO);
					setState(1443);
					((FetchManyAsyncContext)_localctx).xstop = expression(0);
					setState(1444);
					match(RPAR);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1453);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(1448);
					match(WHERE);
					setState(1449);
					match(LPAR);
					setState(1450);
					((FetchManyAsyncContext)_localctx).predicate = expression(0);
					setState(1451);
					match(RPAR);
					}
				}

				setState(1460);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INCLUDE) {
					{
					setState(1455);
					match(INCLUDE);
					setState(1456);
					match(LPAR);
					setState(1457);
					((FetchManyAsyncContext)_localctx).include = include_list();
					setState(1458);
					match(RPAR);
					}
				}

				setState(1468);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ORDER) {
					{
					setState(1462);
					match(ORDER);
					setState(1463);
					match(BY);
					setState(1464);
					match(LPAR);
					setState(1465);
					((FetchManyAsyncContext)_localctx).orderby = order_by_list();
					setState(1466);
					match(RPAR);
					}
				}

				setState(1470);
				then();
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

	public static class ThenContext extends ParserRuleContext {
		public Variable_identifierContext name;
		public Statement_listContext stmts;
		public TerminalNode THEN() { return getToken(OParser.THEN, 0); }
		public TerminalNode WITH() { return getToken(OParser.WITH, 0); }
		public TerminalNode LCURL() { return getToken(OParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(OParser.RCURL, 0); }
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public ThenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_then; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterThen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitThen(this);
		}
	}

	public final ThenContext then() throws RecognitionException {
		ThenContext _localctx = new ThenContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_then);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1473);
			match(THEN);
			setState(1474);
			match(WITH);
			setState(1475);
			((ThenContext)_localctx).name = variable_identifier();
			setState(1476);
			match(LCURL);
			setState(1477);
			((ThenContext)_localctx).stmts = statement_list();
			setState(1478);
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

	public static class Read_statementContext extends ParserRuleContext {
		public ExpressionContext source;
		public TerminalNode READ() { return getToken(OParser.READ, 0); }
		public TerminalNode ALL() { return getToken(OParser.ALL, 0); }
		public TerminalNode FROM() { return getToken(OParser.FROM, 0); }
		public ThenContext then() {
			return getRuleContext(ThenContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Read_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterRead_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitRead_statement(this);
		}
	}

	public final Read_statementContext read_statement() throws RecognitionException {
		Read_statementContext _localctx = new Read_statementContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_read_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1480);
			match(READ);
			setState(1481);
			match(ALL);
			setState(1482);
			match(FROM);
			setState(1483);
			((Read_statementContext)_localctx).source = expression(0);
			setState(1484);
			then();
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
		public TerminalNode SORTED() { return getToken(OParser.SORTED, 0); }
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public Instance_expressionContext instance_expression() {
			return getRuleContext(Instance_expressionContext.class,0);
		}
		public TerminalNode DESC() { return getToken(OParser.DESC, 0); }
		public TerminalNode COMMA() { return getToken(OParser.COMMA, 0); }
		public Key_tokenContext key_token() {
			return getRuleContext(Key_tokenContext.class,0);
		}
		public TerminalNode EQ() { return getToken(OParser.EQ, 0); }
		public Sorted_keyContext sorted_key() {
			return getRuleContext(Sorted_keyContext.class,0);
		}
		public Sorted_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sorted_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterSorted_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitSorted_expression(this);
		}
	}

	public final Sorted_expressionContext sorted_expression() throws RecognitionException {
		Sorted_expressionContext _localctx = new Sorted_expressionContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_sorted_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1486);
			match(SORTED);
			setState(1488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DESC) {
				{
				setState(1487);
				match(DESC);
				}
			}

			setState(1490);
			match(LPAR);
			setState(1491);
			((Sorted_expressionContext)_localctx).source = instance_expression(0);
			setState(1497);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1492);
				match(COMMA);
				setState(1493);
				key_token();
				setState(1494);
				match(EQ);
				setState(1495);
				((Sorted_expressionContext)_localctx).key = sorted_key();
				}
			}

			setState(1499);
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
		public TerminalNode LBRAK() { return getToken(OParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(OParser.RBRAK, 0); }
		public Slice_argumentsContext slice_arguments() {
			return getRuleContext(Slice_argumentsContext.class,0);
		}
		public SliceSelectorContext(Instance_selectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterSliceSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitSliceSelector(this);
		}
	}
	public static class MethodSelectorContext extends Instance_selectorContext {
		public Method_call_expressionContext method;
		public TerminalNode DOT() { return getToken(OParser.DOT, 0); }
		public Method_call_expressionContext method_call_expression() {
			return getRuleContext(Method_call_expressionContext.class,0);
		}
		public MethodSelectorContext(Instance_selectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterMethodSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitMethodSelector(this);
		}
	}
	public static class MemberSelectorContext extends Instance_selectorContext {
		public Member_identifierContext name;
		public TerminalNode DOT() { return getToken(OParser.DOT, 0); }
		public Member_identifierContext member_identifier() {
			return getRuleContext(Member_identifierContext.class,0);
		}
		public MemberSelectorContext(Instance_selectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterMemberSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitMemberSelector(this);
		}
	}
	public static class ItemSelectorContext extends Instance_selectorContext {
		public ExpressionContext exp;
		public TerminalNode LBRAK() { return getToken(OParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(OParser.RBRAK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ItemSelectorContext(Instance_selectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterItemSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitItemSelector(this);
		}
	}

	public final Instance_selectorContext instance_selector() throws RecognitionException {
		Instance_selectorContext _localctx = new Instance_selectorContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_instance_selector);
		try {
			setState(1513);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				_localctx = new MemberSelectorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1501);
				match(DOT);
				setState(1502);
				((MemberSelectorContext)_localctx).name = member_identifier();
				}
				break;
			case 2:
				_localctx = new MethodSelectorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1503);
				match(DOT);
				setState(1504);
				((MethodSelectorContext)_localctx).method = method_call_expression();
				}
				break;
			case 3:
				_localctx = new ItemSelectorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1505);
				match(LBRAK);
				setState(1506);
				((ItemSelectorContext)_localctx).exp = expression(0);
				setState(1507);
				match(RBRAK);
				}
				break;
			case 4:
				_localctx = new SliceSelectorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1509);
				match(LBRAK);
				setState(1510);
				((SliceSelectorContext)_localctx).xslice = slice_arguments();
				setState(1511);
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
		public Copy_fromContext copyExp;
		public Argument_assignment_listContext args;
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public Mutable_category_typeContext mutable_category_type() {
			return getRuleContext(Mutable_category_typeContext.class,0);
		}
		public Copy_fromContext copy_from() {
			return getRuleContext(Copy_fromContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(OParser.COMMA, 0); }
		public Argument_assignment_listContext argument_assignment_list() {
			return getRuleContext(Argument_assignment_listContext.class,0);
		}
		public ConstructorFromContext(Constructor_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterConstructorFrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitConstructorFrom(this);
		}
	}
	public static class ConstructorNoFromContext extends Constructor_expressionContext {
		public Mutable_category_typeContext typ;
		public Argument_assignment_listContext args;
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public Mutable_category_typeContext mutable_category_type() {
			return getRuleContext(Mutable_category_typeContext.class,0);
		}
		public Argument_assignment_listContext argument_assignment_list() {
			return getRuleContext(Argument_assignment_listContext.class,0);
		}
		public ConstructorNoFromContext(Constructor_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterConstructorNoFrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitConstructorNoFrom(this);
		}
	}

	public final Constructor_expressionContext constructor_expression() throws RecognitionException {
		Constructor_expressionContext _localctx = new Constructor_expressionContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_constructor_expression);
		int _la;
		try {
			setState(1531);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				_localctx = new ConstructorFromContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1515);
				((ConstructorFromContext)_localctx).typ = mutable_category_type();
				setState(1516);
				match(LPAR);
				setState(1517);
				((ConstructorFromContext)_localctx).copyExp = copy_from();
				setState(1520);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1518);
					match(COMMA);
					setState(1519);
					((ConstructorFromContext)_localctx).args = argument_assignment_list(0);
					}
				}

				setState(1522);
				match(RPAR);
				}
				break;
			case 2:
				_localctx = new ConstructorNoFromContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1524);
				((ConstructorNoFromContext)_localctx).typ = mutable_category_type();
				setState(1525);
				match(LPAR);
				setState(1527);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << XMARK) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << LTCOLONGT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (TYPE - 64)) | (1L << (ANY - 64)) | (1L << (CATEGORY - 64)) | (1L << (EXECUTE - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (MUTABLE - 64)) | (1L << (NULL - 64)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (READ - 136)) | (1L << (RESOURCE - 136)) | (1L << (SELF - 136)) | (1L << (SORTED - 136)) | (1L << (SUPER - 136)) | (1L << (THIS - 136)) | (1L << (BOOLEAN_LITERAL - 136)) | (1L << (CHAR_LITERAL - 136)) | (1L << (MIN_INTEGER - 136)) | (1L << (MAX_INTEGER - 136)) | (1L << (SYMBOL_IDENTIFIER - 136)) | (1L << (TYPE_IDENTIFIER - 136)) | (1L << (VARIABLE_IDENTIFIER - 136)) | (1L << (TEXT_LITERAL - 136)) | (1L << (UUID_LITERAL - 136)) | (1L << (VERSION_LITERAL - 136)) | (1L << (INTEGER_LITERAL - 136)) | (1L << (HEXA_LITERAL - 136)) | (1L << (DECIMAL_LITERAL - 136)) | (1L << (DATETIME_LITERAL - 136)) | (1L << (TIME_LITERAL - 136)) | (1L << (DATE_LITERAL - 136)) | (1L << (PERIOD_LITERAL - 136)))) != 0)) {
					{
					setState(1526);
					((ConstructorNoFromContext)_localctx).args = argument_assignment_list(0);
					}
				}

				setState(1529);
				match(RPAR);
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

	public static class Copy_fromContext extends ParserRuleContext {
		public ExpressionContext exp;
		public TerminalNode FROM() { return getToken(OParser.FROM, 0); }
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Copy_fromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_copy_from; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCopy_from(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCopy_from(this);
		}
	}

	public final Copy_fromContext copy_from() throws RecognitionException {
		Copy_fromContext _localctx = new Copy_fromContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_copy_from);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1533);
			match(FROM);
			setState(1534);
			assign();
			setState(1535);
			((Copy_fromContext)_localctx).exp = expression(0);
			setState(1536);
			if (!(this.willNotBe(this.equalToken()))) throw new FailedPredicateException(this, "$parser.willNotBe($parser.equalToken())");
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
	public static class ExpressionAssignmentListContext extends Argument_assignment_listContext {
		public ExpressionContext exp;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionAssignmentListContext(Argument_assignment_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterExpressionAssignmentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitExpressionAssignmentList(this);
		}
	}
	public static class ArgumentAssignmentListContext extends Argument_assignment_listContext {
		public Argument_assignmentContext item;
		public Argument_assignmentContext argument_assignment() {
			return getRuleContext(Argument_assignmentContext.class,0);
		}
		public ArgumentAssignmentListContext(Argument_assignment_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterArgumentAssignmentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitArgumentAssignmentList(this);
		}
	}
	public static class ArgumentAssignmentListItemContext extends Argument_assignment_listContext {
		public Argument_assignment_listContext items;
		public Argument_assignmentContext item;
		public TerminalNode COMMA() { return getToken(OParser.COMMA, 0); }
		public Argument_assignment_listContext argument_assignment_list() {
			return getRuleContext(Argument_assignment_listContext.class,0);
		}
		public Argument_assignmentContext argument_assignment() {
			return getRuleContext(Argument_assignmentContext.class,0);
		}
		public ArgumentAssignmentListItemContext(Argument_assignment_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterArgumentAssignmentListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitArgumentAssignmentListItem(this);
		}
	}

	public final Argument_assignment_listContext argument_assignment_list() throws RecognitionException {
		return argument_assignment_list(0);
	}

	private Argument_assignment_listContext argument_assignment_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Argument_assignment_listContext _localctx = new Argument_assignment_listContext(_ctx, _parentState);
		Argument_assignment_listContext _prevctx = _localctx;
		int _startState = 134;
		enterRecursionRule(_localctx, 134, RULE_argument_assignment_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1543);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				{
				_localctx = new ExpressionAssignmentListContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1539);
				((ExpressionAssignmentListContext)_localctx).exp = expression(0);
				setState(1540);
				if (!(this.willNotBe(this.equalToken()))) throw new FailedPredicateException(this, "$parser.willNotBe($parser.equalToken())");
				}
				break;
			case 2:
				{
				_localctx = new ArgumentAssignmentListContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1542);
				((ArgumentAssignmentListContext)_localctx).item = argument_assignment();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1550);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArgumentAssignmentListItemContext(new Argument_assignment_listContext(_parentctx, _parentState));
					((ArgumentAssignmentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_argument_assignment_list);
					setState(1545);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1546);
					match(COMMA);
					setState(1547);
					((ArgumentAssignmentListItemContext)_localctx).item = argument_assignment();
					}
					} 
				}
				setState(1552);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
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
		public Variable_identifierContext name;
		public ExpressionContext exp;
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Argument_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterArgument_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitArgument_assignment(this);
		}
	}

	public final Argument_assignmentContext argument_assignment() throws RecognitionException {
		Argument_assignmentContext _localctx = new Argument_assignmentContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_argument_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1553);
			((Argument_assignmentContext)_localctx).name = variable_identifier();
			setState(1557);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				{
				setState(1554);
				assign();
				setState(1555);
				((Argument_assignmentContext)_localctx).exp = expression(0);
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

	public static class Assign_instance_statementContext extends ParserRuleContext {
		public Assignable_instanceContext inst;
		public ExpressionContext exp;
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(OParser.SEMI, 0); }
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterAssign_instance_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitAssign_instance_statement(this);
		}
	}

	public final Assign_instance_statementContext assign_instance_statement() throws RecognitionException {
		Assign_instance_statementContext _localctx = new Assign_instance_statementContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_assign_instance_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1559);
			((Assign_instance_statementContext)_localctx).inst = assignable_instance(0);
			setState(1560);
			assign();
			setState(1561);
			((Assign_instance_statementContext)_localctx).exp = expression(0);
			setState(1562);
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
		public TerminalNode DOT() { return getToken(OParser.DOT, 0); }
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public MemberInstanceContext(Child_instanceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterMemberInstance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitMemberInstance(this);
		}
	}
	public static class ItemInstanceContext extends Child_instanceContext {
		public ExpressionContext exp;
		public TerminalNode LBRAK() { return getToken(OParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(OParser.RBRAK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ItemInstanceContext(Child_instanceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterItemInstance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitItemInstance(this);
		}
	}

	public final Child_instanceContext child_instance() throws RecognitionException {
		Child_instanceContext _localctx = new Child_instanceContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_child_instance);
		try {
			setState(1570);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				_localctx = new MemberInstanceContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1564);
				match(DOT);
				setState(1565);
				((MemberInstanceContext)_localctx).name = variable_identifier();
				}
				break;
			case LBRAK:
				_localctx = new ItemInstanceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1566);
				match(LBRAK);
				setState(1567);
				((ItemInstanceContext)_localctx).exp = expression(0);
				setState(1568);
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

	public static class Assign_tuple_statementContext extends ParserRuleContext {
		public Variable_identifier_listContext items;
		public ExpressionContext exp;
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(OParser.SEMI, 0); }
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterAssign_tuple_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitAssign_tuple_statement(this);
		}
	}

	public final Assign_tuple_statementContext assign_tuple_statement() throws RecognitionException {
		Assign_tuple_statementContext _localctx = new Assign_tuple_statementContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_assign_tuple_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1572);
			((Assign_tuple_statementContext)_localctx).items = variable_identifier_list();
			setState(1573);
			assign();
			setState(1574);
			((Assign_tuple_statementContext)_localctx).exp = expression(0);
			setState(1575);
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

	public static class Type_literalContext extends ParserRuleContext {
		public Category_or_any_typeContext category_or_any_type() {
			return getRuleContext(Category_or_any_typeContext.class,0);
		}
		public Type_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterType_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitType_literal(this);
		}
	}

	public final Type_literalContext type_literal() throws RecognitionException {
		Type_literalContext _localctx = new Type_literalContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_type_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1577);
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
		public TerminalNode NULL() { return getToken(OParser.NULL, 0); }
		public Null_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterNull_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitNull_literal(this);
		}
	}

	public final Null_literalContext null_literal() throws RecognitionException {
		Null_literalContext _localctx = new Null_literalContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_null_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1579);
			match(NULL);
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
		public List<TerminalNode> LF() { return getTokens(OParser.LF); }
		public TerminalNode LF(int i) {
			return getToken(OParser.LF, i);
		}
		public List<TerminalNode> WS() { return getTokens(OParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(OParser.WS, i);
		}
		public Ws_plusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ws_plus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterWs_plus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitWs_plus(this);
		}
	}

	public final Ws_plusContext ws_plus() throws RecognitionException {
		Ws_plusContext _localctx = new Ws_plusContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_ws_plus);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1584);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1581);
					_la = _input.LA(1);
					if ( !(_la==WS || _la==LF) ) {
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
				setState(1586);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterRepl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitRepl(this);
		}
	}

	public final ReplContext repl() throws RecognitionException {
		ReplContext _localctx = new ReplContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_repl);
		try {
			setState(1590);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1587);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1588);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1589);
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
		public List<LfsContext> lfs() {
			return getRuleContexts(LfsContext.class);
		}
		public LfsContext lfs(int i) {
			return getRuleContext(LfsContext.class,i);
		}
		public TerminalNode EOF() { return getToken(OParser.EOF, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public FullDeclarationListContext(Declaration_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterFullDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitFullDeclarationList(this);
		}
	}

	public final Declaration_listContext declaration_list() throws RecognitionException {
		Declaration_listContext _localctx = new Declaration_listContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_declaration_list);
		int _la;
		try {
			_localctx = new FullDeclarationListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1592);
			lfs();
			setState(1594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (TYPE - 64)) | (1L << (ABSTRACT - 64)) | (1L << (ANY - 64)) | (1L << (ATTRIBUTE - 64)) | (1L << (CATEGORY - 64)) | (1L << (ENUMERATED - 64)) | (1L << (METHOD - 64)) | (1L << (MUTABLE - 64)) | (1L << (NATIVE - 64)))) != 0) || ((((_la - 144)) & ~0x3f) == 0 && ((1L << (_la - 144)) & ((1L << (SINGLETON - 144)) | (1L << (STORABLE - 144)) | (1L << (TEST - 144)) | (1L << (WIDGET - 144)) | (1L << (TYPE_IDENTIFIER - 144)) | (1L << (ARONDBASE_IDENTIFIER - 144)))) != 0)) {
				{
				setState(1593);
				declarations();
				}
			}

			setState(1596);
			lfs();
			setState(1597);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitDeclarations(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1599);
			declaration();
			setState(1605);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (TYPE - 64)) | (1L << (ABSTRACT - 64)) | (1L << (ANY - 64)) | (1L << (ATTRIBUTE - 64)) | (1L << (CATEGORY - 64)) | (1L << (ENUMERATED - 64)) | (1L << (METHOD - 64)) | (1L << (MUTABLE - 64)) | (1L << (NATIVE - 64)))) != 0) || ((((_la - 144)) & ~0x3f) == 0 && ((1L << (_la - 144)) & ((1L << (SINGLETON - 144)) | (1L << (STORABLE - 144)) | (1L << (TEST - 144)) | (1L << (WIDGET - 144)) | (1L << (TYPE_IDENTIFIER - 144)) | (1L << (ARONDBASE_IDENTIFIER - 144)))) != 0)) {
				{
				{
				setState(1600);
				lfp();
				setState(1601);
				declaration();
				}
				}
				setState(1607);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1613);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(1608);
				comment_statement();
				setState(1609);
				lfp();
				}
				}
				setState(1615);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1621);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ARONDBASE_IDENTIFIER) {
				{
				{
				setState(1616);
				annotation_constructor();
				setState(1617);
				lfp();
				}
				}
				setState(1623);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1630);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				{
				setState(1624);
				attribute_declaration();
				}
				break;
			case 2:
				{
				setState(1625);
				category_declaration();
				}
				break;
			case 3:
				{
				setState(1626);
				resource_declaration();
				}
				break;
			case 4:
				{
				setState(1627);
				enum_declaration();
				}
				break;
			case 5:
				{
				setState(1628);
				widget_declaration();
				}
				break;
			case 6:
				{
				setState(1629);
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
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public Annotation_argument_valueContext annotation_argument_value() {
			return getRuleContext(Annotation_argument_valueContext.class,0);
		}
		public List<Annotation_argumentContext> annotation_argument() {
			return getRuleContexts(Annotation_argumentContext.class);
		}
		public Annotation_argumentContext annotation_argument(int i) {
			return getRuleContext(Annotation_argumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OParser.COMMA, i);
		}
		public Annotation_constructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterAnnotation_constructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitAnnotation_constructor(this);
		}
	}

	public final Annotation_constructorContext annotation_constructor() throws RecognitionException {
		Annotation_constructorContext _localctx = new Annotation_constructorContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_annotation_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1632);
			((Annotation_constructorContext)_localctx).name = annotation_identifier();
			setState(1647);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(1633);
				match(LPAR);
				setState(1643);
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
				case DBID:
				case ITERATOR:
				case CURSOR:
				case HTML:
				case TYPE:
				case ANY:
				case MUTABLE:
				case NULL:
				case BOOLEAN_LITERAL:
				case CHAR_LITERAL:
				case MIN_INTEGER:
				case MAX_INTEGER:
				case SYMBOL_IDENTIFIER:
				case TYPE_IDENTIFIER:
				case TEXT_LITERAL:
				case UUID_LITERAL:
				case VERSION_LITERAL:
				case INTEGER_LITERAL:
				case HEXA_LITERAL:
				case DECIMAL_LITERAL:
				case DATETIME_LITERAL:
				case TIME_LITERAL:
				case DATE_LITERAL:
				case PERIOD_LITERAL:
					{
					setState(1634);
					((Annotation_constructorContext)_localctx).exp = annotation_argument_value();
					}
					break;
				case GETTER:
				case SETTER:
				case VARIABLE_IDENTIFIER:
					{
					{
					setState(1635);
					annotation_argument();
					setState(1640);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1636);
						match(COMMA);
						setState(1637);
						annotation_argument();
						}
						}
						setState(1642);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1645);
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
		public TerminalNode ARONDBASE_IDENTIFIER() { return getToken(OParser.ARONDBASE_IDENTIFIER, 0); }
		public Annotation_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterAnnotation_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitAnnotation_identifier(this);
		}
	}

	public final Annotation_identifierContext annotation_identifier() throws RecognitionException {
		Annotation_identifierContext _localctx = new Annotation_identifierContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_annotation_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1649);
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
		public TerminalNode EQ() { return getToken(OParser.EQ, 0); }
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterAnnotation_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitAnnotation_argument(this);
		}
	}

	public final Annotation_argumentContext annotation_argument() throws RecognitionException {
		Annotation_argumentContext _localctx = new Annotation_argumentContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_annotation_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1651);
			((Annotation_argumentContext)_localctx).name = annotation_argument_name();
			setState(1652);
			match(EQ);
			setState(1653);
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
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(OParser.VARIABLE_IDENTIFIER, 0); }
		public TerminalNode GETTER() { return getToken(OParser.GETTER, 0); }
		public TerminalNode SETTER() { return getToken(OParser.SETTER, 0); }
		public Annotation_argument_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation_argument_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterAnnotation_argument_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitAnnotation_argument_name(this);
		}
	}

	public final Annotation_argument_nameContext annotation_argument_name() throws RecognitionException {
		Annotation_argument_nameContext _localctx = new Annotation_argument_nameContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_annotation_argument_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1655);
			_la = _input.LA(1);
			if ( !(((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & ((1L << (GETTER - 110)) | (1L << (SETTER - 110)) | (1L << (VARIABLE_IDENTIFIER - 110)))) != 0)) ) {
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterAnnotationLiteralValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitAnnotationLiteralValue(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterAnnotationTypeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitAnnotationTypeValue(this);
		}
	}

	public final Annotation_argument_valueContext annotation_argument_value() throws RecognitionException {
		Annotation_argument_valueContext _localctx = new Annotation_argument_valueContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_annotation_argument_value);
		try {
			setState(1659);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				_localctx = new AnnotationLiteralValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1657);
				((AnnotationLiteralValueContext)_localctx).exp = literal_expression();
				}
				break;
			case 2:
				_localctx = new AnnotationTypeValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1658);
				((AnnotationTypeValueContext)_localctx).typ = primary_type();
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterResource_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitResource_declaration(this);
		}
	}

	public final Resource_declarationContext resource_declaration() throws RecognitionException {
		Resource_declarationContext _localctx = new Resource_declarationContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_resource_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1661);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterEnum_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitEnum_declaration(this);
		}
	}

	public final Enum_declarationContext enum_declaration() throws RecognitionException {
		Enum_declarationContext _localctx = new Enum_declarationContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_enum_declaration);
		try {
			setState(1665);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1663);
				enum_category_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1664);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterNative_symbol_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitNative_symbol_list(this);
		}
	}

	public final Native_symbol_listContext native_symbol_list() throws RecognitionException {
		Native_symbol_listContext _localctx = new Native_symbol_listContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_native_symbol_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1667);
			native_symbol();
			setState(1673);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SYMBOL_IDENTIFIER) {
				{
				{
				setState(1668);
				lfp();
				setState(1669);
				native_symbol();
				}
				}
				setState(1675);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCategory_symbol_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCategory_symbol_list(this);
		}
	}

	public final Category_symbol_listContext category_symbol_list() throws RecognitionException {
		Category_symbol_listContext _localctx = new Category_symbol_listContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_category_symbol_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1676);
			category_symbol();
			setState(1682);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SYMBOL_IDENTIFIER) {
				{
				{
				setState(1677);
				lfp();
				setState(1678);
				category_symbol();
				}
				}
				setState(1684);
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

	public static class Symbol_listContext extends ParserRuleContext {
		public List<Symbol_identifierContext> symbol_identifier() {
			return getRuleContexts(Symbol_identifierContext.class);
		}
		public Symbol_identifierContext symbol_identifier(int i) {
			return getRuleContext(Symbol_identifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OParser.COMMA, i);
		}
		public Symbol_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbol_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterSymbol_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitSymbol_list(this);
		}
	}

	public final Symbol_listContext symbol_list() throws RecognitionException {
		Symbol_listContext _localctx = new Symbol_listContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_symbol_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1685);
			symbol_identifier();
			setState(1690);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1686);
				match(COMMA);
				setState(1687);
				symbol_identifier();
				}
				}
				setState(1692);
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
		public TerminalNode IN() { return getToken(OParser.IN, 0); }
		public Set_literalContext set_literal() {
			return getRuleContext(Set_literalContext.class,0);
		}
		public MatchingSetContext(Attribute_constraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterMatchingSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitMatchingSet(this);
		}
	}
	public static class MatchingPatternContext extends Attribute_constraintContext {
		public Token text;
		public TerminalNode MATCHING() { return getToken(OParser.MATCHING, 0); }
		public TerminalNode TEXT_LITERAL() { return getToken(OParser.TEXT_LITERAL, 0); }
		public MatchingPatternContext(Attribute_constraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterMatchingPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitMatchingPattern(this);
		}
	}
	public static class MatchingListContext extends Attribute_constraintContext {
		public List_literalContext source;
		public TerminalNode IN() { return getToken(OParser.IN, 0); }
		public List_literalContext list_literal() {
			return getRuleContext(List_literalContext.class,0);
		}
		public MatchingListContext(Attribute_constraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterMatchingList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitMatchingList(this);
		}
	}
	public static class MatchingRangeContext extends Attribute_constraintContext {
		public Range_literalContext source;
		public TerminalNode IN() { return getToken(OParser.IN, 0); }
		public Range_literalContext range_literal() {
			return getRuleContext(Range_literalContext.class,0);
		}
		public MatchingRangeContext(Attribute_constraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterMatchingRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitMatchingRange(this);
		}
	}
	public static class MatchingExpressionContext extends Attribute_constraintContext {
		public ExpressionContext exp;
		public TerminalNode MATCHING() { return getToken(OParser.MATCHING, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MatchingExpressionContext(Attribute_constraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterMatchingExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitMatchingExpression(this);
		}
	}

	public final Attribute_constraintContext attribute_constraint() throws RecognitionException {
		Attribute_constraintContext _localctx = new Attribute_constraintContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_attribute_constraint);
		try {
			setState(1703);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				_localctx = new MatchingListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1693);
				match(IN);
				setState(1694);
				((MatchingListContext)_localctx).source = list_literal();
				}
				break;
			case 2:
				_localctx = new MatchingSetContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1695);
				match(IN);
				setState(1696);
				((MatchingSetContext)_localctx).source = set_literal();
				}
				break;
			case 3:
				_localctx = new MatchingRangeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1697);
				match(IN);
				setState(1698);
				((MatchingRangeContext)_localctx).source = range_literal();
				}
				break;
			case 4:
				_localctx = new MatchingPatternContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1699);
				match(MATCHING);
				setState(1700);
				((MatchingPatternContext)_localctx).text = match(TEXT_LITERAL);
				}
				break;
			case 5:
				_localctx = new MatchingExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1701);
				match(MATCHING);
				setState(1702);
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
		public TerminalNode LBRAK() { return getToken(OParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(OParser.RBRAK, 0); }
		public TerminalNode MUTABLE() { return getToken(OParser.MUTABLE, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public List_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterList_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitList_literal(this);
		}
	}

	public final List_literalContext list_literal() throws RecognitionException {
		List_literalContext _localctx = new List_literalContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_list_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1706);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUTABLE) {
				{
				setState(1705);
				match(MUTABLE);
				}
			}

			setState(1708);
			match(LBRAK);
			setState(1710);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << XMARK) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << LTCOLONGT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (TYPE - 64)) | (1L << (ANY - 64)) | (1L << (CATEGORY - 64)) | (1L << (EXECUTE - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (MUTABLE - 64)) | (1L << (NULL - 64)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (READ - 136)) | (1L << (RESOURCE - 136)) | (1L << (SELF - 136)) | (1L << (SORTED - 136)) | (1L << (SUPER - 136)) | (1L << (THIS - 136)) | (1L << (BOOLEAN_LITERAL - 136)) | (1L << (CHAR_LITERAL - 136)) | (1L << (MIN_INTEGER - 136)) | (1L << (MAX_INTEGER - 136)) | (1L << (SYMBOL_IDENTIFIER - 136)) | (1L << (TYPE_IDENTIFIER - 136)) | (1L << (VARIABLE_IDENTIFIER - 136)) | (1L << (TEXT_LITERAL - 136)) | (1L << (UUID_LITERAL - 136)) | (1L << (VERSION_LITERAL - 136)) | (1L << (INTEGER_LITERAL - 136)) | (1L << (HEXA_LITERAL - 136)) | (1L << (DECIMAL_LITERAL - 136)) | (1L << (DATETIME_LITERAL - 136)) | (1L << (TIME_LITERAL - 136)) | (1L << (DATE_LITERAL - 136)) | (1L << (PERIOD_LITERAL - 136)))) != 0)) {
				{
				setState(1709);
				expression_list();
				}
			}

			setState(1712);
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
		public TerminalNode LT() { return getToken(OParser.LT, 0); }
		public TerminalNode GT() { return getToken(OParser.GT, 0); }
		public TerminalNode MUTABLE() { return getToken(OParser.MUTABLE, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Set_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterSet_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitSet_literal(this);
		}
	}

	public final Set_literalContext set_literal() throws RecognitionException {
		Set_literalContext _localctx = new Set_literalContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_set_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1715);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUTABLE) {
				{
				setState(1714);
				match(MUTABLE);
				}
			}

			setState(1717);
			match(LT);
			setState(1719);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << XMARK) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << LTCOLONGT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (TYPE - 64)) | (1L << (ANY - 64)) | (1L << (CATEGORY - 64)) | (1L << (EXECUTE - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (MUTABLE - 64)) | (1L << (NULL - 64)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (READ - 136)) | (1L << (RESOURCE - 136)) | (1L << (SELF - 136)) | (1L << (SORTED - 136)) | (1L << (SUPER - 136)) | (1L << (THIS - 136)) | (1L << (BOOLEAN_LITERAL - 136)) | (1L << (CHAR_LITERAL - 136)) | (1L << (MIN_INTEGER - 136)) | (1L << (MAX_INTEGER - 136)) | (1L << (SYMBOL_IDENTIFIER - 136)) | (1L << (TYPE_IDENTIFIER - 136)) | (1L << (VARIABLE_IDENTIFIER - 136)) | (1L << (TEXT_LITERAL - 136)) | (1L << (UUID_LITERAL - 136)) | (1L << (VERSION_LITERAL - 136)) | (1L << (INTEGER_LITERAL - 136)) | (1L << (HEXA_LITERAL - 136)) | (1L << (DECIMAL_LITERAL - 136)) | (1L << (DATETIME_LITERAL - 136)) | (1L << (TIME_LITERAL - 136)) | (1L << (DATE_LITERAL - 136)) | (1L << (PERIOD_LITERAL - 136)))) != 0)) {
				{
				setState(1718);
				expression_list();
				}
			}

			setState(1721);
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
		public List<TerminalNode> COMMA() { return getTokens(OParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OParser.COMMA, i);
		}
		public Expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterExpression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitExpression_list(this);
		}
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		Expression_listContext _localctx = new Expression_listContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1723);
			expression(0);
			setState(1728);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1724);
				match(COMMA);
				setState(1725);
				expression(0);
				}
				}
				setState(1730);
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
		public TerminalNode LBRAK() { return getToken(OParser.LBRAK, 0); }
		public TerminalNode RANGE() { return getToken(OParser.RANGE, 0); }
		public TerminalNode RBRAK() { return getToken(OParser.RBRAK, 0); }
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterRange_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitRange_literal(this);
		}
	}

	public final Range_literalContext range_literal() throws RecognitionException {
		Range_literalContext _localctx = new Range_literalContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_range_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1731);
			match(LBRAK);
			setState(1732);
			((Range_literalContext)_localctx).low = expression(0);
			setState(1733);
			match(RANGE);
			setState(1734);
			((Range_literalContext)_localctx).high = expression(0);
			setState(1735);
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
		public TerminalNode ITERATOR() { return getToken(OParser.ITERATOR, 0); }
		public TerminalNode LT() { return getToken(OParser.LT, 0); }
		public TerminalNode GT() { return getToken(OParser.GT, 0); }
		public TypedefContext typedef() {
			return getRuleContext(TypedefContext.class,0);
		}
		public IteratorTypeContext(TypedefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterIteratorType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitIteratorType(this);
		}
	}
	public static class SetTypeContext extends TypedefContext {
		public TypedefContext s;
		public TerminalNode LTGT() { return getToken(OParser.LTGT, 0); }
		public TypedefContext typedef() {
			return getRuleContext(TypedefContext.class,0);
		}
		public SetTypeContext(TypedefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterSetType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitSetType(this);
		}
	}
	public static class ListTypeContext extends TypedefContext {
		public TypedefContext l;
		public TerminalNode LBRAK() { return getToken(OParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(OParser.RBRAK, 0); }
		public TypedefContext typedef() {
			return getRuleContext(TypedefContext.class,0);
		}
		public ListTypeContext(TypedefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterListType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitListType(this);
		}
	}
	public static class DictTypeContext extends TypedefContext {
		public TypedefContext d;
		public TerminalNode LTCOLONGT() { return getToken(OParser.LTCOLONGT, 0); }
		public TypedefContext typedef() {
			return getRuleContext(TypedefContext.class,0);
		}
		public DictTypeContext(TypedefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterDictType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitDictType(this);
		}
	}
	public static class CursorTypeContext extends TypedefContext {
		public TypedefContext c;
		public TerminalNode CURSOR() { return getToken(OParser.CURSOR, 0); }
		public TerminalNode LT() { return getToken(OParser.LT, 0); }
		public TerminalNode GT() { return getToken(OParser.GT, 0); }
		public TypedefContext typedef() {
			return getRuleContext(TypedefContext.class,0);
		}
		public CursorTypeContext(TypedefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCursorType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCursorType(this);
		}
	}
	public static class TypeTypeContext extends TypedefContext {
		public TypedefContext t;
		public TerminalNode TYPE() { return getToken(OParser.TYPE, 0); }
		public TerminalNode LT() { return getToken(OParser.LT, 0); }
		public TerminalNode GT() { return getToken(OParser.GT, 0); }
		public TypedefContext typedef() {
			return getRuleContext(TypedefContext.class,0);
		}
		public TypeTypeContext(TypedefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterTypeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitTypeType(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPrimaryType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPrimaryType(this);
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
		int _startState = 188;
		enterRecursionRule(_localctx, 188, RULE_typedef, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1754);
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
			case DBID:
			case HTML:
			case TYPE_IDENTIFIER:
				{
				_localctx = new PrimaryTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1738);
				((PrimaryTypeContext)_localctx).p = primary_type();
				}
				break;
			case CURSOR:
				{
				_localctx = new CursorTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1739);
				match(CURSOR);
				setState(1740);
				match(LT);
				setState(1741);
				((CursorTypeContext)_localctx).c = typedef(0);
				setState(1742);
				match(GT);
				}
				break;
			case ITERATOR:
				{
				_localctx = new IteratorTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1744);
				match(ITERATOR);
				setState(1745);
				match(LT);
				setState(1746);
				((IteratorTypeContext)_localctx).i = typedef(0);
				setState(1747);
				match(GT);
				}
				break;
			case TYPE:
				{
				_localctx = new TypeTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1749);
				match(TYPE);
				setState(1750);
				match(LT);
				setState(1751);
				((TypeTypeContext)_localctx).t = typedef(0);
				setState(1752);
				match(GT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1765);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1763);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
					case 1:
						{
						_localctx = new SetTypeContext(new TypedefContext(_parentctx, _parentState));
						((SetTypeContext)_localctx).s = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_typedef);
						setState(1756);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1757);
						match(LTGT);
						}
						break;
					case 2:
						{
						_localctx = new ListTypeContext(new TypedefContext(_parentctx, _parentState));
						((ListTypeContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_typedef);
						setState(1758);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1759);
						match(LBRAK);
						setState(1760);
						match(RBRAK);
						}
						break;
					case 3:
						{
						_localctx = new DictTypeContext(new TypedefContext(_parentctx, _parentState));
						((DictTypeContext)_localctx).d = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_typedef);
						setState(1761);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1762);
						match(LTCOLONGT);
						}
						break;
					}
					} 
				}
				setState(1767);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterNativeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitNativeType(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCategoryType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCategoryType(this);
		}
	}

	public final Primary_typeContext primary_type() throws RecognitionException {
		Primary_typeContext _localctx = new Primary_typeContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_primary_type);
		try {
			setState(1770);
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
			case DBID:
			case HTML:
				_localctx = new NativeTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1768);
				((NativeTypeContext)_localctx).n = native_type();
				}
				break;
			case TYPE_IDENTIFIER:
				_localctx = new CategoryTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1769);
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
		public TerminalNode PERIOD() { return getToken(OParser.PERIOD, 0); }
		public PeriodTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPeriodType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPeriodType(this);
		}
	}
	public static class HtmlTypeContext extends Native_typeContext {
		public TerminalNode HTML() { return getToken(OParser.HTML, 0); }
		public HtmlTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterHtmlType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitHtmlType(this);
		}
	}
	public static class CssTypeContext extends Native_typeContext {
		public TerminalNode CSS() { return getToken(OParser.CSS, 0); }
		public CssTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCssType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCssType(this);
		}
	}
	public static class BooleanTypeContext extends Native_typeContext {
		public TerminalNode BOOLEAN() { return getToken(OParser.BOOLEAN, 0); }
		public BooleanTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterBooleanType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitBooleanType(this);
		}
	}
	public static class DocumentTypeContext extends Native_typeContext {
		public TerminalNode DOCUMENT() { return getToken(OParser.DOCUMENT, 0); }
		public DocumentTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterDocumentType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitDocumentType(this);
		}
	}
	public static class CharacterTypeContext extends Native_typeContext {
		public TerminalNode CHARACTER() { return getToken(OParser.CHARACTER, 0); }
		public CharacterTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCharacterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCharacterType(this);
		}
	}
	public static class VersionTypeContext extends Native_typeContext {
		public TerminalNode VERSION() { return getToken(OParser.VERSION, 0); }
		public VersionTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterVersionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitVersionType(this);
		}
	}
	public static class TextTypeContext extends Native_typeContext {
		public TerminalNode TEXT() { return getToken(OParser.TEXT, 0); }
		public TextTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterTextType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitTextType(this);
		}
	}
	public static class ImageTypeContext extends Native_typeContext {
		public TerminalNode IMAGE() { return getToken(OParser.IMAGE, 0); }
		public ImageTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterImageType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitImageType(this);
		}
	}
	public static class TimeTypeContext extends Native_typeContext {
		public TerminalNode TIME() { return getToken(OParser.TIME, 0); }
		public TimeTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterTimeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitTimeType(this);
		}
	}
	public static class IntegerTypeContext extends Native_typeContext {
		public TerminalNode INTEGER() { return getToken(OParser.INTEGER, 0); }
		public IntegerTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterIntegerType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitIntegerType(this);
		}
	}
	public static class DateTimeTypeContext extends Native_typeContext {
		public TerminalNode DATETIME() { return getToken(OParser.DATETIME, 0); }
		public DateTimeTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterDateTimeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitDateTimeType(this);
		}
	}
	public static class BlobTypeContext extends Native_typeContext {
		public TerminalNode BLOB() { return getToken(OParser.BLOB, 0); }
		public BlobTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterBlobType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitBlobType(this);
		}
	}
	public static class UUIDTypeContext extends Native_typeContext {
		public TerminalNode UUID() { return getToken(OParser.UUID, 0); }
		public UUIDTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterUUIDType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitUUIDType(this);
		}
	}
	public static class DecimalTypeContext extends Native_typeContext {
		public TerminalNode DECIMAL() { return getToken(OParser.DECIMAL, 0); }
		public DecimalTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterDecimalType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitDecimalType(this);
		}
	}
	public static class CodeTypeContext extends Native_typeContext {
		public TerminalNode CODE() { return getToken(OParser.CODE, 0); }
		public CodeTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCodeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCodeType(this);
		}
	}
	public static class DateTypeContext extends Native_typeContext {
		public TerminalNode DATE() { return getToken(OParser.DATE, 0); }
		public DateTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterDateType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitDateType(this);
		}
	}
	public static class DbIdTypeContext extends Native_typeContext {
		public TerminalNode DBID() { return getToken(OParser.DBID, 0); }
		public DbIdTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterDbIdType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitDbIdType(this);
		}
	}

	public final Native_typeContext native_type() throws RecognitionException {
		Native_typeContext _localctx = new Native_typeContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_native_type);
		try {
			setState(1790);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
				_localctx = new BooleanTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1772);
				match(BOOLEAN);
				}
				break;
			case CSS:
				_localctx = new CssTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1773);
				match(CSS);
				}
				break;
			case CHARACTER:
				_localctx = new CharacterTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1774);
				match(CHARACTER);
				}
				break;
			case TEXT:
				_localctx = new TextTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1775);
				match(TEXT);
				}
				break;
			case IMAGE:
				_localctx = new ImageTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1776);
				match(IMAGE);
				}
				break;
			case INTEGER:
				_localctx = new IntegerTypeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1777);
				match(INTEGER);
				}
				break;
			case DECIMAL:
				_localctx = new DecimalTypeContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1778);
				match(DECIMAL);
				}
				break;
			case DOCUMENT:
				_localctx = new DocumentTypeContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1779);
				match(DOCUMENT);
				}
				break;
			case DATE:
				_localctx = new DateTypeContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1780);
				match(DATE);
				}
				break;
			case DATETIME:
				_localctx = new DateTimeTypeContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1781);
				match(DATETIME);
				}
				break;
			case TIME:
				_localctx = new TimeTypeContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(1782);
				match(TIME);
				}
				break;
			case PERIOD:
				_localctx = new PeriodTypeContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(1783);
				match(PERIOD);
				}
				break;
			case VERSION:
				_localctx = new VersionTypeContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(1784);
				match(VERSION);
				}
				break;
			case CODE:
				_localctx = new CodeTypeContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(1785);
				match(CODE);
				}
				break;
			case BLOB:
				_localctx = new BlobTypeContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(1786);
				match(BLOB);
				}
				break;
			case UUID:
				_localctx = new UUIDTypeContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(1787);
				match(UUID);
				}
				break;
			case DBID:
				_localctx = new DbIdTypeContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(1788);
				match(DBID);
				}
				break;
			case HTML:
				_localctx = new HtmlTypeContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(1789);
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
		public TerminalNode TYPE_IDENTIFIER() { return getToken(OParser.TYPE_IDENTIFIER, 0); }
		public Category_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_category_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCategory_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCategory_type(this);
		}
	}

	public final Category_typeContext category_type() throws RecognitionException {
		Category_typeContext _localctx = new Category_typeContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_category_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1792);
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
		public TerminalNode MUTABLE() { return getToken(OParser.MUTABLE, 0); }
		public Mutable_category_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mutable_category_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterMutable_category_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitMutable_category_type(this);
		}
	}

	public final Mutable_category_typeContext mutable_category_type() throws RecognitionException {
		Mutable_category_typeContext _localctx = new Mutable_category_typeContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_mutable_category_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1795);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUTABLE) {
				{
				setState(1794);
				match(MUTABLE);
				}
			}

			setState(1797);
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
		public TerminalNode CODE() { return getToken(OParser.CODE, 0); }
		public Code_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCode_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCode_type(this);
		}
	}

	public final Code_typeContext code_type() throws RecognitionException {
		Code_typeContext _localctx = new Code_typeContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_code_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1799);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterConcreteCategoryDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitConcreteCategoryDeclaration(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterNativeCategoryDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitNativeCategoryDeclaration(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterSingletonCategoryDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitSingletonCategoryDeclaration(this);
		}
	}

	public final Category_declarationContext category_declaration() throws RecognitionException {
		Category_declarationContext _localctx = new Category_declarationContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_category_declaration);
		try {
			setState(1804);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				_localctx = new ConcreteCategoryDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1801);
				((ConcreteCategoryDeclarationContext)_localctx).decl = concrete_category_declaration();
				}
				break;
			case 2:
				_localctx = new NativeCategoryDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1802);
				((NativeCategoryDeclarationContext)_localctx).decl = native_category_declaration();
				}
				break;
			case 3:
				_localctx = new SingletonCategoryDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1803);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterConcreteWidgetDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitConcreteWidgetDeclaration(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterNativeWidgetDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitNativeWidgetDeclaration(this);
		}
	}

	public final Widget_declarationContext widget_declaration() throws RecognitionException {
		Widget_declarationContext _localctx = new Widget_declarationContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_widget_declaration);
		try {
			setState(1808);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WIDGET:
				_localctx = new ConcreteWidgetDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1806);
				((ConcreteWidgetDeclarationContext)_localctx).decl = concrete_widget_declaration();
				}
				break;
			case NATIVE:
				_localctx = new NativeWidgetDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1807);
				((NativeWidgetDeclarationContext)_localctx).decl = native_widget_declaration();
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

	public static class Type_identifier_listContext extends ParserRuleContext {
		public List<Type_identifierContext> type_identifier() {
			return getRuleContexts(Type_identifierContext.class);
		}
		public Type_identifierContext type_identifier(int i) {
			return getRuleContext(Type_identifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OParser.COMMA, i);
		}
		public Type_identifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_identifier_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterType_identifier_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitType_identifier_list(this);
		}
	}

	public final Type_identifier_listContext type_identifier_list() throws RecognitionException {
		Type_identifier_listContext _localctx = new Type_identifier_listContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_type_identifier_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1810);
			type_identifier();
			setState(1815);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1811);
				match(COMMA);
				setState(1812);
				type_identifier();
				}
				}
				setState(1817);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterMethod_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitMethod_identifier(this);
		}
	}

	public final Method_identifierContext method_identifier() throws RecognitionException {
		Method_identifierContext _localctx = new Method_identifierContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_method_identifier);
		try {
			setState(1820);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CATEGORY:
			case RESOURCE:
			case VARIABLE_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1818);
				variable_identifier();
				}
				break;
			case TYPE_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1819);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterIdentifier_or_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitIdentifier_or_keyword(this);
		}
	}

	public final Identifier_or_keywordContext identifier_or_keyword() throws RecognitionException {
		Identifier_or_keywordContext _localctx = new Identifier_or_keywordContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_identifier_or_keyword);
		try {
			setState(1824);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1822);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1823);
				keyword();
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

	public static class Nospace_hyphen_identifier_or_keywordContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(OParser.MINUS, 0); }
		public Nospace_identifier_or_keywordContext nospace_identifier_or_keyword() {
			return getRuleContext(Nospace_identifier_or_keywordContext.class,0);
		}
		public Nospace_hyphen_identifier_or_keywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nospace_hyphen_identifier_or_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterNospace_hyphen_identifier_or_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitNospace_hyphen_identifier_or_keyword(this);
		}
	}

	public final Nospace_hyphen_identifier_or_keywordContext nospace_hyphen_identifier_or_keyword() throws RecognitionException {
		Nospace_hyphen_identifier_or_keywordContext _localctx = new Nospace_hyphen_identifier_or_keywordContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_nospace_hyphen_identifier_or_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1826);
			if (!(this.wasNotWhiteSpace())) throw new FailedPredicateException(this, "$parser.wasNotWhiteSpace()");
			setState(1827);
			match(MINUS);
			setState(1828);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterNospace_identifier_or_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitNospace_identifier_or_keyword(this);
		}
	}

	public final Nospace_identifier_or_keywordContext nospace_identifier_or_keyword() throws RecognitionException {
		Nospace_identifier_or_keywordContext _localctx = new Nospace_identifier_or_keywordContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_nospace_identifier_or_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1830);
			if (!(this.wasNotWhiteSpace())) throw new FailedPredicateException(this, "$parser.wasNotWhiteSpace()");
			setState(1831);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterTypeIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitTypeIdentifier(this);
		}
	}
	public static class SymbolIdentifierContext extends IdentifierContext {
		public Symbol_identifierContext symbol_identifier() {
			return getRuleContext(Symbol_identifierContext.class,0);
		}
		public SymbolIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterSymbolIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitSymbolIdentifier(this);
		}
	}
	public static class VariableIdentifierContext extends IdentifierContext {
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public VariableIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterVariableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitVariableIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_identifier);
		try {
			setState(1836);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CATEGORY:
			case RESOURCE:
			case VARIABLE_IDENTIFIER:
				_localctx = new VariableIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1833);
				variable_identifier();
				}
				break;
			case TYPE_IDENTIFIER:
				_localctx = new TypeIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1834);
				type_identifier();
				}
				break;
			case SYMBOL_IDENTIFIER:
				_localctx = new SymbolIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1835);
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
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(OParser.VARIABLE_IDENTIFIER, 0); }
		public TerminalNode CATEGORY() { return getToken(OParser.CATEGORY, 0); }
		public TerminalNode MUTABLE() { return getToken(OParser.MUTABLE, 0); }
		public TerminalNode STORABLE() { return getToken(OParser.STORABLE, 0); }
		public TerminalNode RESOURCE() { return getToken(OParser.RESOURCE, 0); }
		public Member_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterMember_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitMember_identifier(this);
		}
	}

	public final Member_identifierContext member_identifier() throws RecognitionException {
		Member_identifierContext _localctx = new Member_identifierContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_member_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1838);
			_la = _input.LA(1);
			if ( !(((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (CATEGORY - 86)) | (1L << (MUTABLE - 86)) | (1L << (RESOURCE - 86)) | (1L << (STORABLE - 86)))) != 0) || _la==VARIABLE_IDENTIFIER) ) {
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
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(OParser.VARIABLE_IDENTIFIER, 0); }
		public TerminalNode CATEGORY() { return getToken(OParser.CATEGORY, 0); }
		public TerminalNode RESOURCE() { return getToken(OParser.RESOURCE, 0); }
		public Variable_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterVariable_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitVariable_identifier(this);
		}
	}

	public final Variable_identifierContext variable_identifier() throws RecognitionException {
		Variable_identifierContext _localctx = new Variable_identifierContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_variable_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1840);
			_la = _input.LA(1);
			if ( !(_la==CATEGORY || _la==RESOURCE || _la==VARIABLE_IDENTIFIER) ) {
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

	public static class Attribute_identifierContext extends ParserRuleContext {
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(OParser.VARIABLE_IDENTIFIER, 0); }
		public TerminalNode STORABLE() { return getToken(OParser.STORABLE, 0); }
		public TerminalNode RESOURCE() { return getToken(OParser.RESOURCE, 0); }
		public Attribute_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterAttribute_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitAttribute_identifier(this);
		}
	}

	public final Attribute_identifierContext attribute_identifier() throws RecognitionException {
		Attribute_identifierContext _localctx = new Attribute_identifierContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_attribute_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1842);
			_la = _input.LA(1);
			if ( !(((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & ((1L << (RESOURCE - 138)) | (1L << (STORABLE - 138)) | (1L << (VARIABLE_IDENTIFIER - 138)))) != 0)) ) {
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
		public TerminalNode TYPE_IDENTIFIER() { return getToken(OParser.TYPE_IDENTIFIER, 0); }
		public Type_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterType_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitType_identifier(this);
		}
	}

	public final Type_identifierContext type_identifier() throws RecognitionException {
		Type_identifierContext _localctx = new Type_identifierContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_type_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1844);
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
		public TerminalNode SYMBOL_IDENTIFIER() { return getToken(OParser.SYMBOL_IDENTIFIER, 0); }
		public Symbol_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbol_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterSymbol_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitSymbol_identifier(this);
		}
	}

	public final Symbol_identifierContext symbol_identifier() throws RecognitionException {
		Symbol_identifierContext _localctx = new Symbol_identifierContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_symbol_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1846);
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
		public List<TerminalNode> COMMA() { return getTokens(OParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OParser.COMMA, i);
		}
		public Argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterArgument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitArgument_list(this);
		}
	}

	public final Argument_listContext argument_list() throws RecognitionException {
		Argument_listContext _localctx = new Argument_listContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1848);
			argument();
			setState(1853);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1849);
				match(COMMA);
				setState(1850);
				argument();
				}
				}
				setState(1855);
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
		public TerminalNode MUTABLE() { return getToken(OParser.MUTABLE, 0); }
		public OperatorArgumentContext(ArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterOperatorArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitOperatorArgument(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCodeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCodeArgument(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_argument);
		int _la;
		try {
			setState(1861);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				_localctx = new CodeArgumentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1856);
				((CodeArgumentContext)_localctx).arg = code_argument();
				}
				break;
			case 2:
				_localctx = new OperatorArgumentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1858);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MUTABLE) {
					{
					setState(1857);
					match(MUTABLE);
					}
				}

				setState(1860);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterOperator_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitOperator_argument(this);
		}
	}

	public final Operator_argumentContext operator_argument() throws RecognitionException {
		Operator_argumentContext _localctx = new Operator_argumentContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_operator_argument);
		try {
			setState(1865);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CATEGORY:
			case RESOURCE:
			case VARIABLE_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1863);
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
			case DBID:
			case ITERATOR:
			case CURSOR:
			case HTML:
			case TYPE:
			case ANY:
			case TYPE_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1864);
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
		public TerminalNode EQ() { return getToken(OParser.EQ, 0); }
		public Literal_expressionContext literal_expression() {
			return getRuleContext(Literal_expressionContext.class,0);
		}
		public Named_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_named_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterNamed_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitNamed_argument(this);
		}
	}

	public final Named_argumentContext named_argument() throws RecognitionException {
		Named_argumentContext _localctx = new Named_argumentContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_named_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1867);
			variable_identifier();
			setState(1870);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(1868);
				match(EQ);
				setState(1869);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCode_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCode_argument(this);
		}
	}

	public final Code_argumentContext code_argument() throws RecognitionException {
		Code_argumentContext _localctx = new Code_argumentContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_code_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1872);
			code_type();
			setState(1873);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCategory_or_any_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCategory_or_any_type(this);
		}
	}

	public final Category_or_any_typeContext category_or_any_type() throws RecognitionException {
		Category_or_any_typeContext _localctx = new Category_or_any_typeContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_category_or_any_type);
		try {
			setState(1877);
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
			case DBID:
			case ITERATOR:
			case CURSOR:
			case HTML:
			case TYPE:
			case TYPE_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1875);
				typedef(0);
				}
				break;
			case ANY:
				enterOuterAlt(_localctx, 2);
				{
				setState(1876);
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
		public TerminalNode LBRAK() { return getToken(OParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(OParser.RBRAK, 0); }
		public AnyListTypeContext(Any_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterAnyListType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitAnyListType(this);
		}
	}
	public static class AnyTypeContext extends Any_typeContext {
		public TerminalNode ANY() { return getToken(OParser.ANY, 0); }
		public AnyTypeContext(Any_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterAnyType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitAnyType(this);
		}
	}
	public static class AnyDictTypeContext extends Any_typeContext {
		public Any_typeContext any_type() {
			return getRuleContext(Any_typeContext.class,0);
		}
		public TerminalNode LCURL() { return getToken(OParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(OParser.RCURL, 0); }
		public AnyDictTypeContext(Any_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterAnyDictType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitAnyDictType(this);
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
		int _startState = 238;
		enterRecursionRule(_localctx, 238, RULE_any_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AnyTypeContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1880);
			match(ANY);
			}
			_ctx.stop = _input.LT(-1);
			setState(1890);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,158,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1888);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
					case 1:
						{
						_localctx = new AnyListTypeContext(new Any_typeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_any_type);
						setState(1882);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1883);
						match(LBRAK);
						setState(1884);
						match(RBRAK);
						}
						break;
					case 2:
						{
						_localctx = new AnyDictTypeContext(new Any_typeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_any_type);
						setState(1885);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1886);
						match(LCURL);
						setState(1887);
						match(RCURL);
						}
						break;
					}
					} 
				}
				setState(1892);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterMember_method_declaration_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitMember_method_declaration_list(this);
		}
	}

	public final Member_method_declaration_listContext member_method_declaration_list() throws RecognitionException {
		Member_method_declaration_listContext _localctx = new Member_method_declaration_listContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_member_method_declaration_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1893);
			member_method_declaration();
			setState(1899);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (TYPE - 64)) | (1L << (ABSTRACT - 64)) | (1L << (GETTER - 64)) | (1L << (METHOD - 64)) | (1L << (MUTABLE - 64)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (OPERATOR - 130)) | (1L << (SETTER - 130)) | (1L << (TYPE_IDENTIFIER - 130)) | (1L << (ARONDBASE_IDENTIFIER - 130)))) != 0)) {
				{
				{
				setState(1894);
				lfp();
				setState(1895);
				member_method_declaration();
				}
				}
				setState(1901);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterMember_method_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitMember_method_declaration(this);
		}
	}

	public final Member_method_declarationContext member_method_declaration() throws RecognitionException {
		Member_method_declarationContext _localctx = new Member_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_member_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1907);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(1902);
				comment_statement();
				setState(1903);
				lfp();
				}
				}
				setState(1909);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1915);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ARONDBASE_IDENTIFIER) {
				{
				{
				setState(1910);
				annotation_constructor();
				setState(1911);
				lfp();
				}
				}
				setState(1917);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1923);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				{
				setState(1918);
				setter_method_declaration();
				}
				break;
			case 2:
				{
				setState(1919);
				getter_method_declaration();
				}
				break;
			case 3:
				{
				setState(1920);
				concrete_method_declaration();
				}
				break;
			case 4:
				{
				setState(1921);
				abstract_method_declaration();
				}
				break;
			case 5:
				{
				setState(1922);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterNative_member_method_declaration_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitNative_member_method_declaration_list(this);
		}
	}

	public final Native_member_method_declaration_listContext native_member_method_declaration_list() throws RecognitionException {
		Native_member_method_declaration_listContext _localctx = new Native_member_method_declaration_listContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_native_member_method_declaration_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1925);
			native_member_method_declaration();
			setState(1931);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (TYPE - 64)) | (1L << (ANY - 64)) | (1L << (GETTER - 64)) | (1L << (METHOD - 64)) | (1L << (NATIVE - 64)))) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & ((1L << (SETTER - 143)) | (1L << (TYPE_IDENTIFIER - 143)) | (1L << (ARONDBASE_IDENTIFIER - 143)))) != 0)) {
				{
				{
				setState(1926);
				lfp();
				setState(1927);
				native_member_method_declaration();
				}
				}
				setState(1933);
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
		public Native_member_method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_native_member_method_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterNative_member_method_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitNative_member_method_declaration(this);
		}
	}

	public final Native_member_method_declarationContext native_member_method_declaration() throws RecognitionException {
		Native_member_method_declarationContext _localctx = new Native_member_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_native_member_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1939);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(1934);
				comment_statement();
				setState(1935);
				lfp();
				}
				}
				setState(1941);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1947);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ARONDBASE_IDENTIFIER) {
				{
				{
				setState(1942);
				annotation_constructor();
				setState(1943);
				lfp();
				}
				}
				setState(1949);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1953);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				{
				setState(1950);
				native_getter_declaration();
				}
				break;
			case 2:
				{
				setState(1951);
				native_setter_declaration();
				}
				break;
			case 3:
				{
				setState(1952);
				native_method_declaration();
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
		public TerminalNode PYTHON2() { return getToken(OParser.PYTHON2, 0); }
		public Python_category_bindingContext python_category_binding() {
			return getRuleContext(Python_category_bindingContext.class,0);
		}
		public Python2CategoryBindingContext(Native_category_bindingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPython2CategoryBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPython2CategoryBinding(this);
		}
	}
	public static class Python3CategoryBindingContext extends Native_category_bindingContext {
		public Python_category_bindingContext binding;
		public TerminalNode PYTHON3() { return getToken(OParser.PYTHON3, 0); }
		public Python_category_bindingContext python_category_binding() {
			return getRuleContext(Python_category_bindingContext.class,0);
		}
		public Python3CategoryBindingContext(Native_category_bindingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPython3CategoryBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPython3CategoryBinding(this);
		}
	}
	public static class JavaCategoryBindingContext extends Native_category_bindingContext {
		public Java_class_identifier_expressionContext binding;
		public TerminalNode JAVA() { return getToken(OParser.JAVA, 0); }
		public Java_class_identifier_expressionContext java_class_identifier_expression() {
			return getRuleContext(Java_class_identifier_expressionContext.class,0);
		}
		public JavaCategoryBindingContext(Native_category_bindingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavaCategoryBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavaCategoryBinding(this);
		}
	}
	public static class CSharpCategoryBindingContext extends Native_category_bindingContext {
		public Csharp_identifier_expressionContext binding;
		public TerminalNode CSHARP() { return getToken(OParser.CSHARP, 0); }
		public Csharp_identifier_expressionContext csharp_identifier_expression() {
			return getRuleContext(Csharp_identifier_expressionContext.class,0);
		}
		public CSharpCategoryBindingContext(Native_category_bindingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCSharpCategoryBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCSharpCategoryBinding(this);
		}
	}
	public static class JavascriptCategoryBindingContext extends Native_category_bindingContext {
		public Javascript_category_bindingContext binding;
		public TerminalNode JAVASCRIPT() { return getToken(OParser.JAVASCRIPT, 0); }
		public Javascript_category_bindingContext javascript_category_binding() {
			return getRuleContext(Javascript_category_bindingContext.class,0);
		}
		public JavascriptCategoryBindingContext(Native_category_bindingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavascriptCategoryBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavascriptCategoryBinding(this);
		}
	}

	public final Native_category_bindingContext native_category_binding() throws RecognitionException {
		Native_category_bindingContext _localctx = new Native_category_bindingContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_native_category_binding);
		try {
			setState(1965);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JAVA:
				_localctx = new JavaCategoryBindingContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1955);
				match(JAVA);
				setState(1956);
				((JavaCategoryBindingContext)_localctx).binding = java_class_identifier_expression(0);
				}
				break;
			case CSHARP:
				_localctx = new CSharpCategoryBindingContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1957);
				match(CSHARP);
				setState(1958);
				((CSharpCategoryBindingContext)_localctx).binding = csharp_identifier_expression(0);
				}
				break;
			case PYTHON2:
				_localctx = new Python2CategoryBindingContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1959);
				match(PYTHON2);
				setState(1960);
				((Python2CategoryBindingContext)_localctx).binding = python_category_binding();
				}
				break;
			case PYTHON3:
				_localctx = new Python3CategoryBindingContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1961);
				match(PYTHON3);
				setState(1962);
				((Python3CategoryBindingContext)_localctx).binding = python_category_binding();
				}
				break;
			case JAVASCRIPT:
				_localctx = new JavascriptCategoryBindingContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1963);
				match(JAVASCRIPT);
				setState(1964);
				((JavascriptCategoryBindingContext)_localctx).binding = javascript_category_binding();
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPython_category_binding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPython_category_binding(this);
		}
	}

	public final Python_category_bindingContext python_category_binding() throws RecognitionException {
		Python_category_bindingContext _localctx = new Python_category_bindingContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_python_category_binding);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1967);
			identifier();
			setState(1969);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(1968);
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

	public static class Python_moduleContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(OParser.FROM, 0); }
		public Module_tokenContext module_token() {
			return getRuleContext(Module_tokenContext.class,0);
		}
		public TerminalNode COLON() { return getToken(OParser.COLON, 0); }
		public List<Python_identifierContext> python_identifier() {
			return getRuleContexts(Python_identifierContext.class);
		}
		public Python_identifierContext python_identifier(int i) {
			return getRuleContext(Python_identifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(OParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(OParser.DOT, i);
		}
		public Python_moduleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_python_module; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPython_module(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPython_module(this);
		}
	}

	public final Python_moduleContext python_module() throws RecognitionException {
		Python_moduleContext _localctx = new Python_moduleContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_python_module);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1971);
			match(FROM);
			setState(1972);
			module_token();
			setState(1973);
			match(COLON);
			setState(1974);
			python_identifier();
			setState(1979);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(1975);
				match(DOT);
				setState(1976);
				python_identifier();
				}
				}
				setState(1981);
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

	public static class Javascript_category_bindingContext extends ParserRuleContext {
		public List<Javascript_identifierContext> javascript_identifier() {
			return getRuleContexts(Javascript_identifierContext.class);
		}
		public Javascript_identifierContext javascript_identifier(int i) {
			return getRuleContext(Javascript_identifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(OParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(OParser.DOT, i);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavascript_category_binding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavascript_category_binding(this);
		}
	}

	public final Javascript_category_bindingContext javascript_category_binding() throws RecognitionException {
		Javascript_category_bindingContext _localctx = new Javascript_category_bindingContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_javascript_category_binding);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1982);
			javascript_identifier();
			setState(1987);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(1983);
				match(DOT);
				setState(1984);
				javascript_identifier();
				}
				}
				setState(1989);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1991);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(1990);
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

	public static class Javascript_moduleContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(OParser.FROM, 0); }
		public Module_tokenContext module_token() {
			return getRuleContext(Module_tokenContext.class,0);
		}
		public TerminalNode COLON() { return getToken(OParser.COLON, 0); }
		public List<Javascript_identifierContext> javascript_identifier() {
			return getRuleContexts(Javascript_identifierContext.class);
		}
		public Javascript_identifierContext javascript_identifier(int i) {
			return getRuleContext(Javascript_identifierContext.class,i);
		}
		public List<TerminalNode> SLASH() { return getTokens(OParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(OParser.SLASH, i);
		}
		public TerminalNode DOT() { return getToken(OParser.DOT, 0); }
		public Javascript_moduleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javascript_module; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavascript_module(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavascript_module(this);
		}
	}

	public final Javascript_moduleContext javascript_module() throws RecognitionException {
		Javascript_moduleContext _localctx = new Javascript_moduleContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_javascript_module);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1993);
			match(FROM);
			setState(1994);
			module_token();
			setState(1995);
			match(COLON);
			setState(1997);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SLASH) {
				{
				setState(1996);
				match(SLASH);
				}
			}

			setState(1999);
			javascript_identifier();
			setState(2004);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SLASH) {
				{
				{
				setState(2000);
				match(SLASH);
				setState(2001);
				javascript_identifier();
				}
				}
				setState(2006);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2009);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(2007);
				match(DOT);
				setState(2008);
				javascript_identifier();
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

	public static class Variable_identifier_listContext extends ParserRuleContext {
		public List<Variable_identifierContext> variable_identifier() {
			return getRuleContexts(Variable_identifierContext.class);
		}
		public Variable_identifierContext variable_identifier(int i) {
			return getRuleContext(Variable_identifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OParser.COMMA, i);
		}
		public Variable_identifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_identifier_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterVariable_identifier_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitVariable_identifier_list(this);
		}
	}

	public final Variable_identifier_listContext variable_identifier_list() throws RecognitionException {
		Variable_identifier_listContext _localctx = new Variable_identifier_listContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_variable_identifier_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2011);
			variable_identifier();
			setState(2016);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2012);
				match(COMMA);
				setState(2013);
				variable_identifier();
				}
				}
				setState(2018);
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
		public List<TerminalNode> COMMA() { return getTokens(OParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OParser.COMMA, i);
		}
		public Attribute_identifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_identifier_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterAttribute_identifier_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitAttribute_identifier_list(this);
		}
	}

	public final Attribute_identifier_listContext attribute_identifier_list() throws RecognitionException {
		Attribute_identifier_listContext _localctx = new Attribute_identifier_listContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_attribute_identifier_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2019);
			attribute_identifier();
			setState(2024);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2020);
				match(COMMA);
				setState(2021);
				attribute_identifier();
				}
				}
				setState(2026);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterMethod_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitMethod_declaration(this);
		}
	}

	public final Method_declarationContext method_declaration() throws RecognitionException {
		Method_declarationContext _localctx = new Method_declarationContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_method_declaration);
		try {
			setState(2031);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2027);
				abstract_method_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2028);
				concrete_method_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2029);
				native_method_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2030);
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
		public TerminalNode COMMENT() { return getToken(OParser.COMMENT, 0); }
		public Comment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterComment_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitComment_statement(this);
		}
	}

	public final Comment_statementContext comment_statement() throws RecognitionException {
		Comment_statementContext _localctx = new Comment_statementContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_comment_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2033);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterNative_statement_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitNative_statement_list(this);
		}
	}

	public final Native_statement_listContext native_statement_list() throws RecognitionException {
		Native_statement_listContext _localctx = new Native_statement_listContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_native_statement_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2035);
			native_statement();
			setState(2041);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA) | (1L << CSHARP) | (1L << PYTHON2) | (1L << PYTHON3) | (1L << JAVASCRIPT))) != 0)) {
				{
				{
				setState(2036);
				lfp();
				setState(2037);
				native_statement();
				}
				}
				setState(2043);
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
		public TerminalNode CSHARP() { return getToken(OParser.CSHARP, 0); }
		public Csharp_statementContext csharp_statement() {
			return getRuleContext(Csharp_statementContext.class,0);
		}
		public CSharpNativeStatementContext(Native_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCSharpNativeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCSharpNativeStatement(this);
		}
	}
	public static class JavaNativeStatementContext extends Native_statementContext {
		public TerminalNode JAVA() { return getToken(OParser.JAVA, 0); }
		public Java_statementContext java_statement() {
			return getRuleContext(Java_statementContext.class,0);
		}
		public JavaNativeStatementContext(Native_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavaNativeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavaNativeStatement(this);
		}
	}
	public static class JavascriptNativeStatementContext extends Native_statementContext {
		public TerminalNode JAVASCRIPT() { return getToken(OParser.JAVASCRIPT, 0); }
		public Javascript_native_statementContext javascript_native_statement() {
			return getRuleContext(Javascript_native_statementContext.class,0);
		}
		public JavascriptNativeStatementContext(Native_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavascriptNativeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavascriptNativeStatement(this);
		}
	}
	public static class Python2NativeStatementContext extends Native_statementContext {
		public TerminalNode PYTHON2() { return getToken(OParser.PYTHON2, 0); }
		public Python_native_statementContext python_native_statement() {
			return getRuleContext(Python_native_statementContext.class,0);
		}
		public Python2NativeStatementContext(Native_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPython2NativeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPython2NativeStatement(this);
		}
	}
	public static class Python3NativeStatementContext extends Native_statementContext {
		public TerminalNode PYTHON3() { return getToken(OParser.PYTHON3, 0); }
		public Python_native_statementContext python_native_statement() {
			return getRuleContext(Python_native_statementContext.class,0);
		}
		public Python3NativeStatementContext(Native_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPython3NativeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPython3NativeStatement(this);
		}
	}

	public final Native_statementContext native_statement() throws RecognitionException {
		Native_statementContext _localctx = new Native_statementContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_native_statement);
		try {
			setState(2054);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JAVA:
				_localctx = new JavaNativeStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2044);
				match(JAVA);
				setState(2045);
				java_statement();
				}
				break;
			case CSHARP:
				_localctx = new CSharpNativeStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2046);
				match(CSHARP);
				setState(2047);
				csharp_statement();
				}
				break;
			case PYTHON2:
				_localctx = new Python2NativeStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2048);
				match(PYTHON2);
				setState(2049);
				python_native_statement();
				}
				break;
			case PYTHON3:
				_localctx = new Python3NativeStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2050);
				match(PYTHON3);
				setState(2051);
				python_native_statement();
				}
				break;
			case JAVASCRIPT:
				_localctx = new JavascriptNativeStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2052);
				match(JAVASCRIPT);
				setState(2053);
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
		public TerminalNode SEMI() { return getToken(OParser.SEMI, 0); }
		public Python_moduleContext python_module() {
			return getRuleContext(Python_moduleContext.class,0);
		}
		public Python_native_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_python_native_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPython_native_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPython_native_statement(this);
		}
	}

	public final Python_native_statementContext python_native_statement() throws RecognitionException {
		Python_native_statementContext _localctx = new Python_native_statementContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_python_native_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2056);
			python_statement();
			setState(2058);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(2057);
				match(SEMI);
				}
			}

			setState(2061);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(2060);
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
		public TerminalNode SEMI() { return getToken(OParser.SEMI, 0); }
		public Javascript_moduleContext javascript_module() {
			return getRuleContext(Javascript_moduleContext.class,0);
		}
		public Javascript_native_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javascript_native_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavascript_native_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavascript_native_statement(this);
		}
	}

	public final Javascript_native_statementContext javascript_native_statement() throws RecognitionException {
		Javascript_native_statementContext _localctx = new Javascript_native_statementContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_javascript_native_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2063);
			javascript_statement();
			setState(2065);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(2064);
				match(SEMI);
				}
			}

			setState(2068);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(2067);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterStatement_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitStatement_list(this);
		}
	}

	public final Statement_listContext statement_list() throws RecognitionException {
		Statement_listContext _localctx = new Statement_listContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_statement_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2070);
			statement();
			setState(2076);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << LTCOLONGT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (TYPE - 64)) | (1L << (ANY - 64)) | (1L << (BREAK - 64)) | (1L << (CATEGORY - 64)) | (1L << (DELETE - 64)) | (1L << (DO - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (IF - 64)) | (1L << (METHOD - 64)) | (1L << (MUTABLE - 64)) | (1L << (NULL - 64)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (READ - 136)) | (1L << (RESOURCE - 136)) | (1L << (RETURN - 136)) | (1L << (SELF - 136)) | (1L << (SORTED - 136)) | (1L << (STORE - 136)) | (1L << (SUPER - 136)) | (1L << (SWITCH - 136)) | (1L << (THIS - 136)) | (1L << (THROW - 136)) | (1L << (TRY - 136)) | (1L << (WITH - 136)) | (1L << (WHILE - 136)) | (1L << (WRITE - 136)) | (1L << (BOOLEAN_LITERAL - 136)) | (1L << (CHAR_LITERAL - 136)) | (1L << (MIN_INTEGER - 136)) | (1L << (MAX_INTEGER - 136)) | (1L << (SYMBOL_IDENTIFIER - 136)) | (1L << (TYPE_IDENTIFIER - 136)) | (1L << (VARIABLE_IDENTIFIER - 136)) | (1L << (TEXT_LITERAL - 136)) | (1L << (UUID_LITERAL - 136)) | (1L << (VERSION_LITERAL - 136)) | (1L << (INTEGER_LITERAL - 136)) | (1L << (HEXA_LITERAL - 136)) | (1L << (DECIMAL_LITERAL - 136)) | (1L << (DATETIME_LITERAL - 136)) | (1L << (TIME_LITERAL - 136)) | (1L << (DATE_LITERAL - 136)) | (1L << (PERIOD_LITERAL - 136)))) != 0)) {
				{
				{
				setState(2071);
				lfp();
				setState(2072);
				statement();
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterAssertion_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitAssertion_list(this);
		}
	}

	public final Assertion_listContext assertion_list() throws RecognitionException {
		Assertion_listContext _localctx = new Assertion_listContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_assertion_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2079);
			assertion();
			setState(2085);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << XMARK) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << LTCOLONGT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (TYPE - 64)) | (1L << (ANY - 64)) | (1L << (CATEGORY - 64)) | (1L << (EXECUTE - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (MUTABLE - 64)) | (1L << (NULL - 64)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (READ - 136)) | (1L << (RESOURCE - 136)) | (1L << (SELF - 136)) | (1L << (SORTED - 136)) | (1L << (SUPER - 136)) | (1L << (THIS - 136)) | (1L << (BOOLEAN_LITERAL - 136)) | (1L << (CHAR_LITERAL - 136)) | (1L << (MIN_INTEGER - 136)) | (1L << (MAX_INTEGER - 136)) | (1L << (SYMBOL_IDENTIFIER - 136)) | (1L << (TYPE_IDENTIFIER - 136)) | (1L << (VARIABLE_IDENTIFIER - 136)) | (1L << (TEXT_LITERAL - 136)) | (1L << (UUID_LITERAL - 136)) | (1L << (VERSION_LITERAL - 136)) | (1L << (INTEGER_LITERAL - 136)) | (1L << (HEXA_LITERAL - 136)) | (1L << (DECIMAL_LITERAL - 136)) | (1L << (DATETIME_LITERAL - 136)) | (1L << (TIME_LITERAL - 136)) | (1L << (DATE_LITERAL - 136)) | (1L << (PERIOD_LITERAL - 136)))) != 0)) {
				{
				{
				setState(2080);
				lfp();
				setState(2081);
				assertion();
				}
				}
				setState(2087);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterSwitch_case_statement_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitSwitch_case_statement_list(this);
		}
	}

	public final Switch_case_statement_listContext switch_case_statement_list() throws RecognitionException {
		Switch_case_statement_listContext _localctx = new Switch_case_statement_listContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_switch_case_statement_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2088);
			switch_case_statement();
			setState(2094);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(2089);
				lfp();
				setState(2090);
				switch_case_statement();
				}
				}
				setState(2096);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCatch_statement_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCatch_statement_list(this);
		}
	}

	public final Catch_statement_listContext catch_statement_list() throws RecognitionException {
		Catch_statement_listContext _localctx = new Catch_statement_listContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_catch_statement_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2097);
			catch_statement();
			setState(2103);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2098);
					lfp();
					setState(2099);
					catch_statement();
					}
					} 
				}
				setState(2105);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
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
		public TerminalNode LBRAK() { return getToken(OParser.LBRAK, 0); }
		public Literal_list_literalContext literal_list_literal() {
			return getRuleContext(Literal_list_literalContext.class,0);
		}
		public TerminalNode RBRAK() { return getToken(OParser.RBRAK, 0); }
		public LiteralListLiteralContext(Literal_collectionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterLiteralListLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitLiteralListLiteral(this);
		}
	}
	public static class LiteralRangeLiteralContext extends Literal_collectionContext {
		public Atomic_literalContext low;
		public Atomic_literalContext high;
		public TerminalNode LBRAK() { return getToken(OParser.LBRAK, 0); }
		public TerminalNode RANGE() { return getToken(OParser.RANGE, 0); }
		public TerminalNode RBRAK() { return getToken(OParser.RBRAK, 0); }
		public List<Atomic_literalContext> atomic_literal() {
			return getRuleContexts(Atomic_literalContext.class);
		}
		public Atomic_literalContext atomic_literal(int i) {
			return getRuleContext(Atomic_literalContext.class,i);
		}
		public LiteralRangeLiteralContext(Literal_collectionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterLiteralRangeLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitLiteralRangeLiteral(this);
		}
	}
	public static class LiteralSetLiteralContext extends Literal_collectionContext {
		public TerminalNode LT() { return getToken(OParser.LT, 0); }
		public Literal_list_literalContext literal_list_literal() {
			return getRuleContext(Literal_list_literalContext.class,0);
		}
		public TerminalNode GT() { return getToken(OParser.GT, 0); }
		public LiteralSetLiteralContext(Literal_collectionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterLiteralSetLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitLiteralSetLiteral(this);
		}
	}

	public final Literal_collectionContext literal_collection() throws RecognitionException {
		Literal_collectionContext _localctx = new Literal_collectionContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_literal_collection);
		try {
			setState(2120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				_localctx = new LiteralRangeLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2106);
				match(LBRAK);
				setState(2107);
				((LiteralRangeLiteralContext)_localctx).low = atomic_literal();
				setState(2108);
				match(RANGE);
				setState(2109);
				((LiteralRangeLiteralContext)_localctx).high = atomic_literal();
				setState(2110);
				match(RBRAK);
				}
				break;
			case 2:
				_localctx = new LiteralListLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2112);
				match(LBRAK);
				setState(2113);
				literal_list_literal();
				setState(2114);
				match(RBRAK);
				}
				break;
			case 3:
				_localctx = new LiteralSetLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2116);
				match(LT);
				setState(2117);
				literal_list_literal();
				setState(2118);
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
		public TerminalNode MIN_INTEGER() { return getToken(OParser.MIN_INTEGER, 0); }
		public MinIntegerLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterMinIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitMinIntegerLiteral(this);
		}
	}
	public static class DateLiteralContext extends Atomic_literalContext {
		public TerminalNode DATE_LITERAL() { return getToken(OParser.DATE_LITERAL, 0); }
		public DateLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterDateLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitDateLiteral(this);
		}
	}
	public static class SymbolLiteralContext extends Atomic_literalContext {
		public Symbol_identifierContext symbol_identifier() {
			return getRuleContext(Symbol_identifierContext.class,0);
		}
		public SymbolLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterSymbolLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitSymbolLiteral(this);
		}
	}
	public static class BooleanLiteralContext extends Atomic_literalContext {
		public TerminalNode BOOLEAN_LITERAL() { return getToken(OParser.BOOLEAN_LITERAL, 0); }
		public BooleanLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitBooleanLiteral(this);
		}
	}
	public static class VersionLiteralContext extends Atomic_literalContext {
		public TerminalNode VERSION_LITERAL() { return getToken(OParser.VERSION_LITERAL, 0); }
		public VersionLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterVersionLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitVersionLiteral(this);
		}
	}
	public static class HexadecimalLiteralContext extends Atomic_literalContext {
		public TerminalNode HEXA_LITERAL() { return getToken(OParser.HEXA_LITERAL, 0); }
		public HexadecimalLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterHexadecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitHexadecimalLiteral(this);
		}
	}
	public static class UUIDLiteralContext extends Atomic_literalContext {
		public TerminalNode UUID_LITERAL() { return getToken(OParser.UUID_LITERAL, 0); }
		public UUIDLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterUUIDLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitUUIDLiteral(this);
		}
	}
	public static class MaxIntegerLiteralContext extends Atomic_literalContext {
		public TerminalNode MAX_INTEGER() { return getToken(OParser.MAX_INTEGER, 0); }
		public MaxIntegerLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterMaxIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitMaxIntegerLiteral(this);
		}
	}
	public static class TypeLiteralContext extends Atomic_literalContext {
		public Type_literalContext type_literal() {
			return getRuleContext(Type_literalContext.class,0);
		}
		public TypeLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterTypeLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitTypeLiteral(this);
		}
	}
	public static class DateTimeLiteralContext extends Atomic_literalContext {
		public TerminalNode DATETIME_LITERAL() { return getToken(OParser.DATETIME_LITERAL, 0); }
		public DateTimeLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterDateTimeLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitDateTimeLiteral(this);
		}
	}
	public static class PeriodLiteralContext extends Atomic_literalContext {
		public TerminalNode PERIOD_LITERAL() { return getToken(OParser.PERIOD_LITERAL, 0); }
		public PeriodLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPeriodLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPeriodLiteral(this);
		}
	}
	public static class DecimalLiteralContext extends Atomic_literalContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(OParser.DECIMAL_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(OParser.MINUS, 0); }
		public DecimalLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitDecimalLiteral(this);
		}
	}
	public static class TextLiteralContext extends Atomic_literalContext {
		public TerminalNode TEXT_LITERAL() { return getToken(OParser.TEXT_LITERAL, 0); }
		public TextLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterTextLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitTextLiteral(this);
		}
	}
	public static class NullLiteralContext extends Atomic_literalContext {
		public Null_literalContext null_literal() {
			return getRuleContext(Null_literalContext.class,0);
		}
		public NullLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitNullLiteral(this);
		}
	}
	public static class IntegerLiteralContext extends Atomic_literalContext {
		public TerminalNode INTEGER_LITERAL() { return getToken(OParser.INTEGER_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(OParser.MINUS, 0); }
		public IntegerLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitIntegerLiteral(this);
		}
	}
	public static class TimeLiteralContext extends Atomic_literalContext {
		public TerminalNode TIME_LITERAL() { return getToken(OParser.TIME_LITERAL, 0); }
		public TimeLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterTimeLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitTimeLiteral(this);
		}
	}
	public static class CharacterLiteralContext extends Atomic_literalContext {
		public TerminalNode CHAR_LITERAL() { return getToken(OParser.CHAR_LITERAL, 0); }
		public CharacterLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCharacterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCharacterLiteral(this);
		}
	}

	public final Atomic_literalContext atomic_literal() throws RecognitionException {
		Atomic_literalContext _localctx = new Atomic_literalContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_atomic_literal);
		int _la;
		try {
			setState(2145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				_localctx = new MinIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2122);
				match(MIN_INTEGER);
				}
				break;
			case 2:
				_localctx = new MaxIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2123);
				match(MAX_INTEGER);
				}
				break;
			case 3:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2124);
					match(MINUS);
					}
				}

				setState(2127);
				match(INTEGER_LITERAL);
				}
				break;
			case 4:
				_localctx = new HexadecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2128);
				match(HEXA_LITERAL);
				}
				break;
			case 5:
				_localctx = new CharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2129);
				match(CHAR_LITERAL);
				}
				break;
			case 6:
				_localctx = new DateLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2130);
				match(DATE_LITERAL);
				}
				break;
			case 7:
				_localctx = new TimeLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(2131);
				match(TIME_LITERAL);
				}
				break;
			case 8:
				_localctx = new TextLiteralContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(2132);
				match(TEXT_LITERAL);
				}
				break;
			case 9:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(2134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2133);
					match(MINUS);
					}
				}

				setState(2136);
				match(DECIMAL_LITERAL);
				}
				break;
			case 10:
				_localctx = new DateTimeLiteralContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(2137);
				match(DATETIME_LITERAL);
				}
				break;
			case 11:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(2138);
				match(BOOLEAN_LITERAL);
				}
				break;
			case 12:
				_localctx = new PeriodLiteralContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(2139);
				match(PERIOD_LITERAL);
				}
				break;
			case 13:
				_localctx = new VersionLiteralContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(2140);
				match(VERSION_LITERAL);
				}
				break;
			case 14:
				_localctx = new UUIDLiteralContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(2141);
				match(UUID_LITERAL);
				}
				break;
			case 15:
				_localctx = new SymbolLiteralContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(2142);
				symbol_identifier();
				}
				break;
			case 16:
				_localctx = new TypeLiteralContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(2143);
				type_literal();
				}
				break;
			case 17:
				_localctx = new NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(2144);
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
		public List<TerminalNode> COMMA() { return getTokens(OParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OParser.COMMA, i);
		}
		public Literal_list_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_list_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterLiteral_list_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitLiteral_list_literal(this);
		}
	}

	public final Literal_list_literalContext literal_list_literal() throws RecognitionException {
		Literal_list_literalContext _localctx = new Literal_list_literalContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_literal_list_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2147);
			atomic_literal();
			setState(2152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2148);
				match(COMMA);
				setState(2149);
				atomic_literal();
				}
				}
				setState(2154);
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
		public TerminalNode SELF() { return getToken(OParser.SELF, 0); }
		public TerminalNode THIS() { return getToken(OParser.THIS, 0); }
		public This_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_this_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterThis_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitThis_expression(this);
		}
	}

	public final This_expressionContext this_expression() throws RecognitionException {
		This_expressionContext _localctx = new This_expressionContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_this_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2155);
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
		public TerminalNode SUPER() { return getToken(OParser.SUPER, 0); }
		public Category_typeContext category_type() {
			return getRuleContext(Category_typeContext.class,0);
		}
		public TerminalNode DOT() { return getToken(OParser.DOT, 0); }
		public Super_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_super_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterSuper_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitSuper_expression(this);
		}
	}

	public final Super_expressionContext super_expression() throws RecognitionException {
		Super_expressionContext _localctx = new Super_expressionContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_super_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE_IDENTIFIER) {
				{
				setState(2157);
				category_type();
				setState(2158);
				match(DOT);
				}
			}

			setState(2162);
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
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public Parenthesis_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesis_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterParenthesis_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitParenthesis_expression(this);
		}
	}

	public final Parenthesis_expressionContext parenthesis_expression() throws RecognitionException {
		Parenthesis_expressionContext _localctx = new Parenthesis_expressionContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_parenthesis_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2164);
			match(LPAR);
			setState(2165);
			expression(0);
			setState(2166);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterLiteral_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitLiteral_expression(this);
		}
	}

	public final Literal_expressionContext literal_expression() throws RecognitionException {
		Literal_expressionContext _localctx = new Literal_expressionContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_literal_expression);
		try {
			setState(2170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
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
			case DBID:
			case ITERATOR:
			case CURSOR:
			case HTML:
			case TYPE:
			case ANY:
			case NULL:
			case BOOLEAN_LITERAL:
			case CHAR_LITERAL:
			case MIN_INTEGER:
			case MAX_INTEGER:
			case SYMBOL_IDENTIFIER:
			case TYPE_IDENTIFIER:
			case TEXT_LITERAL:
			case UUID_LITERAL:
			case VERSION_LITERAL:
			case INTEGER_LITERAL:
			case HEXA_LITERAL:
			case DECIMAL_LITERAL:
			case DATETIME_LITERAL:
			case TIME_LITERAL:
			case DATE_LITERAL:
			case PERIOD_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2168);
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
				setState(2169);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCollection_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCollection_literal(this);
		}
	}

	public final Collection_literalContext collection_literal() throws RecognitionException {
		Collection_literalContext _localctx = new Collection_literalContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_collection_literal);
		try {
			setState(2178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2172);
				range_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2173);
				list_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2174);
				set_literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2175);
				dict_literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2176);
				document_literal();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2177);
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
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public TerminalNode MUTABLE() { return getToken(OParser.MUTABLE, 0); }
		public Expression_tupleContext expression_tuple() {
			return getRuleContext(Expression_tupleContext.class,0);
		}
		public Tuple_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterTuple_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitTuple_literal(this);
		}
	}

	public final Tuple_literalContext tuple_literal() throws RecognitionException {
		Tuple_literalContext _localctx = new Tuple_literalContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_tuple_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUTABLE) {
				{
				setState(2180);
				match(MUTABLE);
				}
			}

			setState(2183);
			match(LPAR);
			setState(2185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << XMARK) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << LTCOLONGT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (TYPE - 64)) | (1L << (ANY - 64)) | (1L << (CATEGORY - 64)) | (1L << (EXECUTE - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (MUTABLE - 64)) | (1L << (NULL - 64)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (READ - 136)) | (1L << (RESOURCE - 136)) | (1L << (SELF - 136)) | (1L << (SORTED - 136)) | (1L << (SUPER - 136)) | (1L << (THIS - 136)) | (1L << (BOOLEAN_LITERAL - 136)) | (1L << (CHAR_LITERAL - 136)) | (1L << (MIN_INTEGER - 136)) | (1L << (MAX_INTEGER - 136)) | (1L << (SYMBOL_IDENTIFIER - 136)) | (1L << (TYPE_IDENTIFIER - 136)) | (1L << (VARIABLE_IDENTIFIER - 136)) | (1L << (TEXT_LITERAL - 136)) | (1L << (UUID_LITERAL - 136)) | (1L << (VERSION_LITERAL - 136)) | (1L << (INTEGER_LITERAL - 136)) | (1L << (HEXA_LITERAL - 136)) | (1L << (DECIMAL_LITERAL - 136)) | (1L << (DATETIME_LITERAL - 136)) | (1L << (TIME_LITERAL - 136)) | (1L << (DATE_LITERAL - 136)) | (1L << (PERIOD_LITERAL - 136)))) != 0)) {
				{
				setState(2184);
				expression_tuple();
				}
			}

			setState(2187);
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
		public TerminalNode LTCOLONGT() { return getToken(OParser.LTCOLONGT, 0); }
		public TerminalNode MUTABLE() { return getToken(OParser.MUTABLE, 0); }
		public TerminalNode LT() { return getToken(OParser.LT, 0); }
		public Dict_entry_listContext dict_entry_list() {
			return getRuleContext(Dict_entry_listContext.class,0);
		}
		public TerminalNode GT() { return getToken(OParser.GT, 0); }
		public TerminalNode COLON() { return getToken(OParser.COLON, 0); }
		public Dict_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dict_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterDict_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitDict_literal(this);
		}
	}

	public final Dict_literalContext dict_literal() throws RecognitionException {
		Dict_literalContext _localctx = new Dict_literalContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_dict_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUTABLE) {
				{
				setState(2189);
				match(MUTABLE);
				}
			}

			setState(2200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				{
				{
				setState(2192);
				match(LT);
				setState(2193);
				dict_entry_list();
				setState(2194);
				match(GT);
				}
				}
				break;
			case 2:
				{
				setState(2196);
				match(LTCOLONGT);
				}
				break;
			case 3:
				{
				{
				setState(2197);
				match(LT);
				setState(2198);
				match(COLON);
				setState(2199);
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
		public TerminalNode LCURL() { return getToken(OParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(OParser.RCURL, 0); }
		public Doc_entry_listContext doc_entry_list() {
			return getRuleContext(Doc_entry_listContext.class,0);
		}
		public Document_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterDocument_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitDocument_literal(this);
		}
	}

	public final Document_literalContext document_literal() throws RecognitionException {
		Document_literalContext _localctx = new Document_literalContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_document_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2202);
			match(LCURL);
			setState(2204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA) | (1L << CSHARP) | (1L << PYTHON2) | (1L << PYTHON3) | (1L << JAVASCRIPT) | (1L << SWIFT) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (ABSTRACT - 64)) | (1L << (ALL - 64)) | (1L << (ALWAYS - 64)) | (1L << (AND - 64)) | (1L << (ANY - 64)) | (1L << (AS - 64)) | (1L << (ASC - 64)) | (1L << (ATTR - 64)) | (1L << (ATTRIBUTE - 64)) | (1L << (ATTRIBUTES - 64)) | (1L << (BINDINGS - 64)) | (1L << (BREAK - 64)) | (1L << (BY - 64)) | (1L << (CASE - 64)) | (1L << (CATCH - 64)) | (1L << (CATEGORY - 64)) | (1L << (CLASS - 64)) | (1L << (CONTAINS - 64)) | (1L << (DEF - 64)) | (1L << (DEFAULT - 64)) | (1L << (DEFINE - 64)) | (1L << (DELETE - 64)) | (1L << (DESC - 64)) | (1L << (DO - 64)) | (1L << (DOING - 64)) | (1L << (EACH - 64)) | (1L << (ELSE - 64)) | (1L << (ENUM - 64)) | (1L << (ENUMERATED - 64)) | (1L << (EXCEPT - 64)) | (1L << (EXECUTE - 64)) | (1L << (EXPECTING - 64)) | (1L << (EXTENDS - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (FINALLY - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (FROM - 64)) | (1L << (GETTER - 64)) | (1L << (HAS - 64)) | (1L << (IF - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (IS - 64)) | (1L << (MATCHING - 64)) | (1L << (METHOD - 64)) | (1L << (METHODS - 64)) | (1L << (MODULO - 64)) | (1L << (MUTABLE - 64)) | (1L << (NATIVE - 64)) | (1L << (NONE - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (ON - 128)) | (1L << (ONE - 128)) | (1L << (OPERATOR - 128)) | (1L << (OR - 128)) | (1L << (ORDER - 128)) | (1L << (OTHERWISE - 128)) | (1L << (PASS - 128)) | (1L << (RAISE - 128)) | (1L << (READ - 128)) | (1L << (RECEIVING - 128)) | (1L << (RESOURCE - 128)) | (1L << (RETURN - 128)) | (1L << (RETURNING - 128)) | (1L << (ROWS - 128)) | (1L << (SELF - 128)) | (1L << (SETTER - 128)) | (1L << (SINGLETON - 128)) | (1L << (SORTED - 128)) | (1L << (STORABLE - 128)) | (1L << (STORE - 128)) | (1L << (SUPER - 128)) | (1L << (SWITCH - 128)) | (1L << (TEST - 128)) | (1L << (THIS - 128)) | (1L << (THROW - 128)) | (1L << (TO - 128)) | (1L << (TRY - 128)) | (1L << (VERIFYING - 128)) | (1L << (WIDGET - 128)) | (1L << (WITH - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WHILE - 128)) | (1L << (WRITE - 128)) | (1L << (SYMBOL_IDENTIFIER - 128)) | (1L << (TYPE_IDENTIFIER - 128)) | (1L << (VARIABLE_IDENTIFIER - 128)) | (1L << (TEXT_LITERAL - 128)))) != 0)) {
				{
				setState(2203);
				doc_entry_list();
				}
			}

			setState(2206);
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
		public List<TerminalNode> COMMA() { return getTokens(OParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OParser.COMMA, i);
		}
		public Expression_tupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_tuple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterExpression_tuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitExpression_tuple(this);
		}
	}

	public final Expression_tupleContext expression_tuple() throws RecognitionException {
		Expression_tupleContext _localctx = new Expression_tupleContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_expression_tuple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2208);
			expression(0);
			setState(2209);
			match(COMMA);
			setState(2218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << XMARK) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << LTCOLONGT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (TYPE - 64)) | (1L << (ANY - 64)) | (1L << (CATEGORY - 64)) | (1L << (EXECUTE - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (MUTABLE - 64)) | (1L << (NULL - 64)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (READ - 136)) | (1L << (RESOURCE - 136)) | (1L << (SELF - 136)) | (1L << (SORTED - 136)) | (1L << (SUPER - 136)) | (1L << (THIS - 136)) | (1L << (BOOLEAN_LITERAL - 136)) | (1L << (CHAR_LITERAL - 136)) | (1L << (MIN_INTEGER - 136)) | (1L << (MAX_INTEGER - 136)) | (1L << (SYMBOL_IDENTIFIER - 136)) | (1L << (TYPE_IDENTIFIER - 136)) | (1L << (VARIABLE_IDENTIFIER - 136)) | (1L << (TEXT_LITERAL - 136)) | (1L << (UUID_LITERAL - 136)) | (1L << (VERSION_LITERAL - 136)) | (1L << (INTEGER_LITERAL - 136)) | (1L << (HEXA_LITERAL - 136)) | (1L << (DECIMAL_LITERAL - 136)) | (1L << (DATETIME_LITERAL - 136)) | (1L << (TIME_LITERAL - 136)) | (1L << (DATE_LITERAL - 136)) | (1L << (PERIOD_LITERAL - 136)))) != 0)) {
				{
				setState(2210);
				expression(0);
				setState(2215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2211);
					match(COMMA);
					setState(2212);
					expression(0);
					}
					}
					setState(2217);
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
		public List<TerminalNode> COMMA() { return getTokens(OParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OParser.COMMA, i);
		}
		public Doc_entry_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doc_entry_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterDoc_entry_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitDoc_entry_list(this);
		}
	}

	public final Doc_entry_listContext doc_entry_list() throws RecognitionException {
		Doc_entry_listContext _localctx = new Doc_entry_listContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_doc_entry_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2220);
			doc_entry();
			setState(2225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2221);
				match(COMMA);
				setState(2222);
				doc_entry();
				}
				}
				setState(2227);
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
		public TerminalNode COLON() { return getToken(OParser.COLON, 0); }
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterDoc_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitDoc_entry(this);
		}
	}

	public final Doc_entryContext doc_entry() throws RecognitionException {
		Doc_entryContext _localctx = new Doc_entryContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_doc_entry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2228);
			((Doc_entryContext)_localctx).key = doc_key();
			setState(2229);
			match(COLON);
			setState(2230);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterDocKeyIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitDocKeyIdentifier(this);
		}
	}
	public static class DocKeyTextContext extends Doc_keyContext {
		public Token name;
		public TerminalNode TEXT_LITERAL() { return getToken(OParser.TEXT_LITERAL, 0); }
		public DocKeyTextContext(Doc_keyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterDocKeyText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitDocKeyText(this);
		}
	}

	public final Doc_keyContext doc_key() throws RecognitionException {
		Doc_keyContext _localctx = new Doc_keyContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_doc_key);
		try {
			setState(2234);
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
			case DBID:
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
				setState(2232);
				((DocKeyIdentifierContext)_localctx).name = identifier_or_keyword();
				}
				break;
			case TEXT_LITERAL:
				_localctx = new DocKeyTextContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2233);
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
		public List<TerminalNode> COMMA() { return getTokens(OParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OParser.COMMA, i);
		}
		public Dict_entry_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dict_entry_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterDict_entry_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitDict_entry_list(this);
		}
	}

	public final Dict_entry_listContext dict_entry_list() throws RecognitionException {
		Dict_entry_listContext _localctx = new Dict_entry_listContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_dict_entry_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2236);
			dict_entry();
			setState(2241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2237);
				match(COMMA);
				setState(2238);
				dict_entry();
				}
				}
				setState(2243);
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
		public TerminalNode COLON() { return getToken(OParser.COLON, 0); }
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterDict_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitDict_entry(this);
		}
	}

	public final Dict_entryContext dict_entry() throws RecognitionException {
		Dict_entryContext _localctx = new Dict_entryContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_dict_entry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2244);
			((Dict_entryContext)_localctx).key = dict_key();
			setState(2245);
			match(COLON);
			setState(2246);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterDictKeyIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitDictKeyIdentifier(this);
		}
	}
	public static class DictKeyTextContext extends Dict_keyContext {
		public Token name;
		public TerminalNode TEXT_LITERAL() { return getToken(OParser.TEXT_LITERAL, 0); }
		public DictKeyTextContext(Dict_keyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterDictKeyText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitDictKeyText(this);
		}
	}

	public final Dict_keyContext dict_key() throws RecognitionException {
		Dict_keyContext _localctx = new Dict_keyContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_dict_key);
		try {
			setState(2250);
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
			case DBID:
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
				setState(2248);
				((DictKeyIdentifierContext)_localctx).name = identifier_or_keyword();
				}
				break;
			case TEXT_LITERAL:
				_localctx = new DictKeyTextContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2249);
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
		public TerminalNode COLON() { return getToken(OParser.COLON, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SliceFirstAndLastContext(Slice_argumentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterSliceFirstAndLast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitSliceFirstAndLast(this);
		}
	}
	public static class SliceLastOnlyContext extends Slice_argumentsContext {
		public ExpressionContext last;
		public TerminalNode COLON() { return getToken(OParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SliceLastOnlyContext(Slice_argumentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterSliceLastOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitSliceLastOnly(this);
		}
	}
	public static class SliceFirstOnlyContext extends Slice_argumentsContext {
		public ExpressionContext first;
		public TerminalNode COLON() { return getToken(OParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SliceFirstOnlyContext(Slice_argumentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterSliceFirstOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitSliceFirstOnly(this);
		}
	}

	public final Slice_argumentsContext slice_arguments() throws RecognitionException {
		Slice_argumentsContext _localctx = new Slice_argumentsContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_slice_arguments);
		try {
			setState(2261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
			case 1:
				_localctx = new SliceFirstAndLastContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2252);
				((SliceFirstAndLastContext)_localctx).first = expression(0);
				setState(2253);
				match(COLON);
				setState(2254);
				((SliceFirstAndLastContext)_localctx).last = expression(0);
				}
				break;
			case 2:
				_localctx = new SliceFirstOnlyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2256);
				((SliceFirstOnlyContext)_localctx).first = expression(0);
				setState(2257);
				match(COLON);
				}
				break;
			case 3:
				_localctx = new SliceLastOnlyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2259);
				match(COLON);
				setState(2260);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterAssign_variable_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitAssign_variable_statement(this);
		}
	}

	public final Assign_variable_statementContext assign_variable_statement() throws RecognitionException {
		Assign_variable_statementContext _localctx = new Assign_variable_statementContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_assign_variable_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2263);
			variable_identifier();
			setState(2264);
			assign();
			setState(2265);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterChildInstance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitChildInstance(this);
		}
	}
	public static class RootInstanceContext extends Assignable_instanceContext {
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public RootInstanceContext(Assignable_instanceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterRootInstance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitRootInstance(this);
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
		int _startState = 322;
		enterRecursionRule(_localctx, 322, RULE_assignable_instance, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new RootInstanceContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2268);
			variable_identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(2274);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,208,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ChildInstanceContext(new Assignable_instanceContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_assignable_instance);
					setState(2270);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2271);
					child_instance();
					}
					} 
				}
				setState(2276);
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
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(OParser.VARIABLE_IDENTIFIER, 0); }
		public Category_or_any_typeContext category_or_any_type() {
			return getRuleContext(Category_or_any_typeContext.class,0);
		}
		public IsATypeExpressionContext(Is_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterIsATypeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitIsATypeExpression(this);
		}
	}
	public static class IsOtherExpressionContext extends Is_expressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IsOtherExpressionContext(Is_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterIsOtherExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitIsOtherExpression(this);
		}
	}

	public final Is_expressionContext is_expression() throws RecognitionException {
		Is_expressionContext _localctx = new Is_expressionContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_is_expression);
		try {
			setState(2281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				_localctx = new IsATypeExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2277);
				if (!(this.willBeAOrAn())) throw new FailedPredicateException(this, "$parser.willBeAOrAn()");
				setState(2278);
				match(VARIABLE_IDENTIFIER);
				setState(2279);
				category_or_any_type();
				}
				break;
			case 2:
				_localctx = new IsOtherExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2280);
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

	public static class MetadataContext extends ParserRuleContext {
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(OParser.VARIABLE_IDENTIFIER, 0); }
		public MetadataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metadata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterMetadata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitMetadata(this);
		}
	}

	public final MetadataContext metadata() throws RecognitionException {
		MetadataContext _localctx = new MetadataContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_metadata);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2283);
			if (!(this.willBeText("metadata"))) throw new FailedPredicateException(this, "$parser.willBeText(\"metadata\")");
			setState(2284);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterArrowExpressionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitArrowExpressionBody(this);
		}
	}
	public static class ArrowStatementsBodyContext extends Arrow_expressionContext {
		public Arrow_prefixContext arrow_prefix() {
			return getRuleContext(Arrow_prefixContext.class,0);
		}
		public TerminalNode LCURL() { return getToken(OParser.LCURL, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public TerminalNode RCURL() { return getToken(OParser.RCURL, 0); }
		public ArrowStatementsBodyContext(Arrow_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterArrowStatementsBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitArrowStatementsBody(this);
		}
	}

	public final Arrow_expressionContext arrow_expression() throws RecognitionException {
		Arrow_expressionContext _localctx = new Arrow_expressionContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_arrow_expression);
		try {
			setState(2294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				_localctx = new ArrowExpressionBodyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2286);
				arrow_prefix();
				setState(2287);
				expression(0);
				}
				break;
			case 2:
				_localctx = new ArrowStatementsBodyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2289);
				arrow_prefix();
				setState(2290);
				match(LCURL);
				setState(2291);
				statement_list();
				setState(2292);
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
		public TerminalNode EGT() { return getToken(OParser.EGT, 0); }
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterArrow_prefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitArrow_prefix(this);
		}
	}

	public final Arrow_prefixContext arrow_prefix() throws RecognitionException {
		Arrow_prefixContext _localctx = new Arrow_prefixContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_arrow_prefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2296);
			arrow_args();
			setState(2297);
			((Arrow_prefixContext)_localctx).s1 = ws_plus();
			setState(2298);
			match(EGT);
			setState(2299);
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
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public Variable_identifier_listContext variable_identifier_list() {
			return getRuleContext(Variable_identifier_listContext.class,0);
		}
		public ArrowListArgContext(Arrow_argsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterArrowListArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitArrowListArg(this);
		}
	}
	public static class ArrowSingleArgContext extends Arrow_argsContext {
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public ArrowSingleArgContext(Arrow_argsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterArrowSingleArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitArrowSingleArg(this);
		}
	}

	public final Arrow_argsContext arrow_args() throws RecognitionException {
		Arrow_argsContext _localctx = new Arrow_argsContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_arrow_args);
		int _la;
		try {
			setState(2307);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CATEGORY:
			case RESOURCE:
			case VARIABLE_IDENTIFIER:
				_localctx = new ArrowSingleArgContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2301);
				variable_identifier();
				}
				break;
			case LPAR:
				_localctx = new ArrowListArgContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2302);
				match(LPAR);
				setState(2304);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CATEGORY || _la==RESOURCE || _la==VARIABLE_IDENTIFIER) {
					{
					setState(2303);
					variable_identifier_list();
					}
				}

				setState(2306);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterSorted_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitSorted_key(this);
		}
	}

	public final Sorted_keyContext sorted_key() throws RecognitionException {
		Sorted_keyContext _localctx = new Sorted_keyContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_sorted_key);
		try {
			setState(2311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2309);
				instance_expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2310);
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
		public TerminalNode READ() { return getToken(OParser.READ, 0); }
		public TerminalNode BLOB() { return getToken(OParser.BLOB, 0); }
		public TerminalNode FROM() { return getToken(OParser.FROM, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Read_blob_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_blob_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterRead_blob_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitRead_blob_expression(this);
		}
	}

	public final Read_blob_expressionContext read_blob_expression() throws RecognitionException {
		Read_blob_expressionContext _localctx = new Read_blob_expressionContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_read_blob_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2313);
			match(READ);
			setState(2314);
			match(BLOB);
			setState(2315);
			match(FROM);
			setState(2316);
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
		public TerminalNode READ() { return getToken(OParser.READ, 0); }
		public TerminalNode ALL() { return getToken(OParser.ALL, 0); }
		public TerminalNode FROM() { return getToken(OParser.FROM, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Read_all_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_all_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterRead_all_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitRead_all_expression(this);
		}
	}

	public final Read_all_expressionContext read_all_expression() throws RecognitionException {
		Read_all_expressionContext _localctx = new Read_all_expressionContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_read_all_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2318);
			match(READ);
			setState(2319);
			match(ALL);
			setState(2320);
			match(FROM);
			setState(2321);
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
		public TerminalNode READ() { return getToken(OParser.READ, 0); }
		public TerminalNode ONE() { return getToken(OParser.ONE, 0); }
		public TerminalNode FROM() { return getToken(OParser.FROM, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Read_one_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_one_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterRead_one_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitRead_one_expression(this);
		}
	}

	public final Read_one_expressionContext read_one_expression() throws RecognitionException {
		Read_one_expressionContext _localctx = new Read_one_expressionContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_read_one_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2323);
			match(READ);
			setState(2324);
			match(ONE);
			setState(2325);
			match(FROM);
			setState(2326);
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
		public List<TerminalNode> COMMA() { return getTokens(OParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OParser.COMMA, i);
		}
		public Order_by_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterOrder_by_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitOrder_by_list(this);
		}
	}

	public final Order_by_listContext order_by_list() throws RecognitionException {
		Order_by_listContext _localctx = new Order_by_listContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_order_by_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2328);
			order_by();
			setState(2333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2329);
				match(COMMA);
				setState(2330);
				order_by();
				}
				}
				setState(2335);
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

	public static class Order_byContext extends ParserRuleContext {
		public List<Variable_identifierContext> variable_identifier() {
			return getRuleContexts(Variable_identifierContext.class);
		}
		public Variable_identifierContext variable_identifier(int i) {
			return getRuleContext(Variable_identifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(OParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(OParser.DOT, i);
		}
		public TerminalNode ASC() { return getToken(OParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(OParser.DESC, 0); }
		public Order_byContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterOrder_by(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitOrder_by(this);
		}
	}

	public final Order_byContext order_by() throws RecognitionException {
		Order_byContext _localctx = new Order_byContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_order_by);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2336);
			variable_identifier();
			setState(2341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(2337);
				match(DOT);
				setState(2338);
				variable_identifier();
				}
				}
				setState(2343);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(2344);
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

	public static class Include_listContext extends ParserRuleContext {
		public List<Variable_identifierContext> variable_identifier() {
			return getRuleContexts(Variable_identifierContext.class);
		}
		public Variable_identifierContext variable_identifier(int i) {
			return getRuleContext(Variable_identifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OParser.COMMA, i);
		}
		public Include_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_include_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterInclude_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitInclude_list(this);
		}
	}

	public final Include_listContext include_list() throws RecognitionException {
		Include_listContext _localctx = new Include_listContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_include_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2347);
			variable_identifier();
			setState(2352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2348);
				match(COMMA);
				setState(2349);
				variable_identifier();
				}
				}
				setState(2354);
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
		public TerminalNode PLUS() { return getToken(OParser.PLUS, 0); }
		public OperatorPlusContext(OperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterOperatorPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitOperatorPlus(this);
		}
	}
	public static class OperatorDivideContext extends OperatorContext {
		public DivideContext divide() {
			return getRuleContext(DivideContext.class,0);
		}
		public OperatorDivideContext(OperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterOperatorDivide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitOperatorDivide(this);
		}
	}
	public static class OperatorIDivideContext extends OperatorContext {
		public IdivideContext idivide() {
			return getRuleContext(IdivideContext.class,0);
		}
		public OperatorIDivideContext(OperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterOperatorIDivide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitOperatorIDivide(this);
		}
	}
	public static class OperatorMultiplyContext extends OperatorContext {
		public MultiplyContext multiply() {
			return getRuleContext(MultiplyContext.class,0);
		}
		public OperatorMultiplyContext(OperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterOperatorMultiply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitOperatorMultiply(this);
		}
	}
	public static class OperatorMinusContext extends OperatorContext {
		public TerminalNode MINUS() { return getToken(OParser.MINUS, 0); }
		public OperatorMinusContext(OperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterOperatorMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitOperatorMinus(this);
		}
	}
	public static class OperatorModuloContext extends OperatorContext {
		public ModuloContext modulo() {
			return getRuleContext(ModuloContext.class,0);
		}
		public OperatorModuloContext(OperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterOperatorModulo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitOperatorModulo(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_operator);
		try {
			setState(2361);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				_localctx = new OperatorPlusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2355);
				match(PLUS);
				}
				break;
			case MINUS:
				_localctx = new OperatorMinusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2356);
				match(MINUS);
				}
				break;
			case STAR:
				_localctx = new OperatorMultiplyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2357);
				multiply();
				}
				break;
			case SLASH:
				_localctx = new OperatorDivideContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2358);
				divide();
				}
				break;
			case BSLASH:
				_localctx = new OperatorIDivideContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2359);
				idivide();
				}
				break;
			case PERCENT:
			case MODULO:
				_localctx = new OperatorModuloContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2360);
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
		public TerminalNode JAVA() { return getToken(OParser.JAVA, 0); }
		public TerminalNode CSHARP() { return getToken(OParser.CSHARP, 0); }
		public TerminalNode PYTHON2() { return getToken(OParser.PYTHON2, 0); }
		public TerminalNode PYTHON3() { return getToken(OParser.PYTHON3, 0); }
		public TerminalNode JAVASCRIPT() { return getToken(OParser.JAVASCRIPT, 0); }
		public TerminalNode SWIFT() { return getToken(OParser.SWIFT, 0); }
		public TerminalNode BOOLEAN() { return getToken(OParser.BOOLEAN, 0); }
		public TerminalNode CHARACTER() { return getToken(OParser.CHARACTER, 0); }
		public TerminalNode TEXT() { return getToken(OParser.TEXT, 0); }
		public TerminalNode INTEGER() { return getToken(OParser.INTEGER, 0); }
		public TerminalNode DECIMAL() { return getToken(OParser.DECIMAL, 0); }
		public TerminalNode DATE() { return getToken(OParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(OParser.TIME, 0); }
		public TerminalNode DATETIME() { return getToken(OParser.DATETIME, 0); }
		public TerminalNode PERIOD() { return getToken(OParser.PERIOD, 0); }
		public TerminalNode VERSION() { return getToken(OParser.VERSION, 0); }
		public TerminalNode CODE() { return getToken(OParser.CODE, 0); }
		public TerminalNode DOCUMENT() { return getToken(OParser.DOCUMENT, 0); }
		public TerminalNode BLOB() { return getToken(OParser.BLOB, 0); }
		public TerminalNode IMAGE() { return getToken(OParser.IMAGE, 0); }
		public TerminalNode DBID() { return getToken(OParser.DBID, 0); }
		public TerminalNode UUID() { return getToken(OParser.UUID, 0); }
		public TerminalNode ITERATOR() { return getToken(OParser.ITERATOR, 0); }
		public TerminalNode CURSOR() { return getToken(OParser.CURSOR, 0); }
		public TerminalNode HTML() { return getToken(OParser.HTML, 0); }
		public TerminalNode ABSTRACT() { return getToken(OParser.ABSTRACT, 0); }
		public TerminalNode ALL() { return getToken(OParser.ALL, 0); }
		public TerminalNode ALWAYS() { return getToken(OParser.ALWAYS, 0); }
		public TerminalNode AND() { return getToken(OParser.AND, 0); }
		public TerminalNode ANY() { return getToken(OParser.ANY, 0); }
		public TerminalNode AS() { return getToken(OParser.AS, 0); }
		public TerminalNode ASC() { return getToken(OParser.ASC, 0); }
		public TerminalNode ATTR() { return getToken(OParser.ATTR, 0); }
		public TerminalNode ATTRIBUTE() { return getToken(OParser.ATTRIBUTE, 0); }
		public TerminalNode ATTRIBUTES() { return getToken(OParser.ATTRIBUTES, 0); }
		public TerminalNode BINDINGS() { return getToken(OParser.BINDINGS, 0); }
		public TerminalNode BREAK() { return getToken(OParser.BREAK, 0); }
		public TerminalNode BY() { return getToken(OParser.BY, 0); }
		public TerminalNode CASE() { return getToken(OParser.CASE, 0); }
		public TerminalNode CATCH() { return getToken(OParser.CATCH, 0); }
		public TerminalNode CATEGORY() { return getToken(OParser.CATEGORY, 0); }
		public TerminalNode CLASS() { return getToken(OParser.CLASS, 0); }
		public TerminalNode CONTAINS() { return getToken(OParser.CONTAINS, 0); }
		public TerminalNode DEF() { return getToken(OParser.DEF, 0); }
		public TerminalNode DEFAULT() { return getToken(OParser.DEFAULT, 0); }
		public TerminalNode DEFINE() { return getToken(OParser.DEFINE, 0); }
		public TerminalNode DELETE() { return getToken(OParser.DELETE, 0); }
		public TerminalNode DESC() { return getToken(OParser.DESC, 0); }
		public TerminalNode DO() { return getToken(OParser.DO, 0); }
		public TerminalNode DOING() { return getToken(OParser.DOING, 0); }
		public TerminalNode EACH() { return getToken(OParser.EACH, 0); }
		public TerminalNode ELSE() { return getToken(OParser.ELSE, 0); }
		public TerminalNode ENUM() { return getToken(OParser.ENUM, 0); }
		public TerminalNode ENUMERATED() { return getToken(OParser.ENUMERATED, 0); }
		public TerminalNode EXCEPT() { return getToken(OParser.EXCEPT, 0); }
		public TerminalNode EXECUTE() { return getToken(OParser.EXECUTE, 0); }
		public TerminalNode EXPECTING() { return getToken(OParser.EXPECTING, 0); }
		public TerminalNode EXTENDS() { return getToken(OParser.EXTENDS, 0); }
		public TerminalNode FETCH() { return getToken(OParser.FETCH, 0); }
		public TerminalNode FILTERED() { return getToken(OParser.FILTERED, 0); }
		public TerminalNode FINALLY() { return getToken(OParser.FINALLY, 0); }
		public TerminalNode FLUSH() { return getToken(OParser.FLUSH, 0); }
		public TerminalNode FOR() { return getToken(OParser.FOR, 0); }
		public TerminalNode FROM() { return getToken(OParser.FROM, 0); }
		public TerminalNode GETTER() { return getToken(OParser.GETTER, 0); }
		public TerminalNode HAS() { return getToken(OParser.HAS, 0); }
		public TerminalNode IF() { return getToken(OParser.IF, 0); }
		public TerminalNode IN() { return getToken(OParser.IN, 0); }
		public TerminalNode INDEX() { return getToken(OParser.INDEX, 0); }
		public TerminalNode IS() { return getToken(OParser.IS, 0); }
		public TerminalNode MATCHING() { return getToken(OParser.MATCHING, 0); }
		public TerminalNode METHOD() { return getToken(OParser.METHOD, 0); }
		public TerminalNode METHODS() { return getToken(OParser.METHODS, 0); }
		public TerminalNode MODULO() { return getToken(OParser.MODULO, 0); }
		public TerminalNode MUTABLE() { return getToken(OParser.MUTABLE, 0); }
		public TerminalNode NATIVE() { return getToken(OParser.NATIVE, 0); }
		public TerminalNode NONE() { return getToken(OParser.NONE, 0); }
		public TerminalNode NOT() { return getToken(OParser.NOT, 0); }
		public TerminalNode NOTHING() { return getToken(OParser.NOTHING, 0); }
		public TerminalNode NULL() { return getToken(OParser.NULL, 0); }
		public TerminalNode ON() { return getToken(OParser.ON, 0); }
		public TerminalNode ONE() { return getToken(OParser.ONE, 0); }
		public TerminalNode OPERATOR() { return getToken(OParser.OPERATOR, 0); }
		public TerminalNode OR() { return getToken(OParser.OR, 0); }
		public TerminalNode ORDER() { return getToken(OParser.ORDER, 0); }
		public TerminalNode OTHERWISE() { return getToken(OParser.OTHERWISE, 0); }
		public TerminalNode PASS() { return getToken(OParser.PASS, 0); }
		public TerminalNode RAISE() { return getToken(OParser.RAISE, 0); }
		public TerminalNode READ() { return getToken(OParser.READ, 0); }
		public TerminalNode RECEIVING() { return getToken(OParser.RECEIVING, 0); }
		public TerminalNode RESOURCE() { return getToken(OParser.RESOURCE, 0); }
		public TerminalNode RETURN() { return getToken(OParser.RETURN, 0); }
		public TerminalNode RETURNING() { return getToken(OParser.RETURNING, 0); }
		public TerminalNode ROWS() { return getToken(OParser.ROWS, 0); }
		public TerminalNode SELF() { return getToken(OParser.SELF, 0); }
		public TerminalNode SETTER() { return getToken(OParser.SETTER, 0); }
		public TerminalNode SINGLETON() { return getToken(OParser.SINGLETON, 0); }
		public TerminalNode SORTED() { return getToken(OParser.SORTED, 0); }
		public TerminalNode SUPER() { return getToken(OParser.SUPER, 0); }
		public TerminalNode STORABLE() { return getToken(OParser.STORABLE, 0); }
		public TerminalNode STORE() { return getToken(OParser.STORE, 0); }
		public TerminalNode SWITCH() { return getToken(OParser.SWITCH, 0); }
		public TerminalNode TEST() { return getToken(OParser.TEST, 0); }
		public TerminalNode THIS() { return getToken(OParser.THIS, 0); }
		public TerminalNode THROW() { return getToken(OParser.THROW, 0); }
		public TerminalNode TO() { return getToken(OParser.TO, 0); }
		public TerminalNode TRY() { return getToken(OParser.TRY, 0); }
		public TerminalNode VERIFYING() { return getToken(OParser.VERIFYING, 0); }
		public TerminalNode WIDGET() { return getToken(OParser.WIDGET, 0); }
		public TerminalNode WITH() { return getToken(OParser.WITH, 0); }
		public TerminalNode WHEN() { return getToken(OParser.WHEN, 0); }
		public TerminalNode WHERE() { return getToken(OParser.WHERE, 0); }
		public TerminalNode WHILE() { return getToken(OParser.WHILE, 0); }
		public TerminalNode WRITE() { return getToken(OParser.WRITE, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitKeyword(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2363);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA) | (1L << CSHARP) | (1L << PYTHON2) | (1L << PYTHON3) | (1L << JAVASCRIPT) | (1L << SWIFT) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (ABSTRACT - 64)) | (1L << (ALL - 64)) | (1L << (ALWAYS - 64)) | (1L << (AND - 64)) | (1L << (ANY - 64)) | (1L << (AS - 64)) | (1L << (ASC - 64)) | (1L << (ATTR - 64)) | (1L << (ATTRIBUTE - 64)) | (1L << (ATTRIBUTES - 64)) | (1L << (BINDINGS - 64)) | (1L << (BREAK - 64)) | (1L << (BY - 64)) | (1L << (CASE - 64)) | (1L << (CATCH - 64)) | (1L << (CATEGORY - 64)) | (1L << (CLASS - 64)) | (1L << (CONTAINS - 64)) | (1L << (DEF - 64)) | (1L << (DEFAULT - 64)) | (1L << (DEFINE - 64)) | (1L << (DELETE - 64)) | (1L << (DESC - 64)) | (1L << (DO - 64)) | (1L << (DOING - 64)) | (1L << (EACH - 64)) | (1L << (ELSE - 64)) | (1L << (ENUM - 64)) | (1L << (ENUMERATED - 64)) | (1L << (EXCEPT - 64)) | (1L << (EXECUTE - 64)) | (1L << (EXPECTING - 64)) | (1L << (EXTENDS - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (FINALLY - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (FROM - 64)) | (1L << (GETTER - 64)) | (1L << (HAS - 64)) | (1L << (IF - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (IS - 64)) | (1L << (MATCHING - 64)) | (1L << (METHOD - 64)) | (1L << (METHODS - 64)) | (1L << (MODULO - 64)) | (1L << (MUTABLE - 64)) | (1L << (NATIVE - 64)) | (1L << (NONE - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (ON - 128)) | (1L << (ONE - 128)) | (1L << (OPERATOR - 128)) | (1L << (OR - 128)) | (1L << (ORDER - 128)) | (1L << (OTHERWISE - 128)) | (1L << (PASS - 128)) | (1L << (RAISE - 128)) | (1L << (READ - 128)) | (1L << (RECEIVING - 128)) | (1L << (RESOURCE - 128)) | (1L << (RETURN - 128)) | (1L << (RETURNING - 128)) | (1L << (ROWS - 128)) | (1L << (SELF - 128)) | (1L << (SETTER - 128)) | (1L << (SINGLETON - 128)) | (1L << (SORTED - 128)) | (1L << (STORABLE - 128)) | (1L << (STORE - 128)) | (1L << (SUPER - 128)) | (1L << (SWITCH - 128)) | (1L << (TEST - 128)) | (1L << (THIS - 128)) | (1L << (THROW - 128)) | (1L << (TO - 128)) | (1L << (TRY - 128)) | (1L << (VERIFYING - 128)) | (1L << (WIDGET - 128)) | (1L << (WITH - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WHILE - 128)) | (1L << (WRITE - 128)))) != 0)) ) {
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
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(OParser.VARIABLE_IDENTIFIER, 0); }
		public New_tokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterNew_token(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitNew_token(this);
		}
	}

	public final New_tokenContext new_token() throws RecognitionException {
		New_tokenContext _localctx = new New_tokenContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_new_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2365);
			((New_tokenContext)_localctx).i1 = match(VARIABLE_IDENTIFIER);
			setState(2366);
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
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(OParser.VARIABLE_IDENTIFIER, 0); }
		public Key_tokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterKey_token(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitKey_token(this);
		}
	}

	public final Key_tokenContext key_token() throws RecognitionException {
		Key_tokenContext _localctx = new Key_tokenContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_key_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2368);
			((Key_tokenContext)_localctx).i1 = match(VARIABLE_IDENTIFIER);
			setState(2369);
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
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(OParser.VARIABLE_IDENTIFIER, 0); }
		public Module_tokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterModule_token(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitModule_token(this);
		}
	}

	public final Module_tokenContext module_token() throws RecognitionException {
		Module_tokenContext _localctx = new Module_tokenContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_module_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2371);
			((Module_tokenContext)_localctx).i1 = match(VARIABLE_IDENTIFIER);
			setState(2372);
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
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(OParser.VARIABLE_IDENTIFIER, 0); }
		public Value_tokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterValue_token(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitValue_token(this);
		}
	}

	public final Value_tokenContext value_token() throws RecognitionException {
		Value_tokenContext _localctx = new Value_tokenContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_value_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2374);
			((Value_tokenContext)_localctx).i1 = match(VARIABLE_IDENTIFIER);
			setState(2375);
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
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(OParser.VARIABLE_IDENTIFIER, 0); }
		public Symbols_tokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbols_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterSymbols_token(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitSymbols_token(this);
		}
	}

	public final Symbols_tokenContext symbols_token() throws RecognitionException {
		Symbols_tokenContext _localctx = new Symbols_tokenContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_symbols_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2377);
			((Symbols_tokenContext)_localctx).i1 = match(VARIABLE_IDENTIFIER);
			setState(2378);
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
		public TerminalNode EQ() { return getToken(OParser.EQ, 0); }
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2380);
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
		public TerminalNode STAR() { return getToken(OParser.STAR, 0); }
		public MultiplyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiply; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterMultiply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitMultiply(this);
		}
	}

	public final MultiplyContext multiply() throws RecognitionException {
		MultiplyContext _localctx = new MultiplyContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_multiply);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2382);
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
		public TerminalNode SLASH() { return getToken(OParser.SLASH, 0); }
		public DivideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divide; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterDivide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitDivide(this);
		}
	}

	public final DivideContext divide() throws RecognitionException {
		DivideContext _localctx = new DivideContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_divide);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2384);
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
		public TerminalNode BSLASH() { return getToken(OParser.BSLASH, 0); }
		public IdivideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idivide; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterIdivide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitIdivide(this);
		}
	}

	public final IdivideContext idivide() throws RecognitionException {
		IdivideContext _localctx = new IdivideContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_idivide);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2386);
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
		public TerminalNode PERCENT() { return getToken(OParser.PERCENT, 0); }
		public TerminalNode MODULO() { return getToken(OParser.MODULO, 0); }
		public ModuloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modulo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterModulo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitModulo(this);
		}
	}

	public final ModuloContext modulo() throws RecognitionException {
		ModuloContext _localctx = new ModuloContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_modulo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2388);
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

	public static class LfsContext extends ParserRuleContext {
		public LfsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lfs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterLfs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitLfs(this);
		}
	}

	public final LfsContext lfs() throws RecognitionException {
		LfsContext _localctx = new LfsContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_lfs);
		try {
			enterOuterAlt(_localctx, 1);
			{
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
		public LfpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lfp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterLfp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitLfp(this);
		}
	}

	public final LfpContext lfp() throws RecognitionException {
		LfpContext _localctx = new LfpContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_lfp);
		try {
			enterOuterAlt(_localctx, 1);
			{
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
		public TerminalNode SEMI() { return getToken(OParser.SEMI, 0); }
		public Javascript_expressionContext javascript_expression() {
			return getRuleContext(Javascript_expressionContext.class,0);
		}
		public JavascriptStatementContext(Javascript_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavascriptStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavascriptStatement(this);
		}
	}
	public static class JavascriptReturnStatementContext extends Javascript_statementContext {
		public Javascript_expressionContext exp;
		public TerminalNode RETURN() { return getToken(OParser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(OParser.SEMI, 0); }
		public Javascript_expressionContext javascript_expression() {
			return getRuleContext(Javascript_expressionContext.class,0);
		}
		public JavascriptReturnStatementContext(Javascript_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavascriptReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavascriptReturnStatement(this);
		}
	}

	public final Javascript_statementContext javascript_statement() throws RecognitionException {
		Javascript_statementContext _localctx = new Javascript_statementContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_javascript_statement);
		try {
			setState(2401);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
			case 1:
				_localctx = new JavascriptReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2394);
				match(RETURN);
				setState(2395);
				((JavascriptReturnStatementContext)_localctx).exp = javascript_expression(0);
				setState(2396);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new JavascriptStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2398);
				((JavascriptStatementContext)_localctx).exp = javascript_expression(0);
				setState(2399);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavascriptSelectorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavascriptSelectorExpression(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavascriptPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavascriptPrimaryExpression(this);
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
		int _startState = 378;
		enterRecursionRule(_localctx, 378, RULE_javascript_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavascriptPrimaryExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2404);
			((JavascriptPrimaryExpressionContext)_localctx).exp = javascript_primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(2410);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,220,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavascriptSelectorExpressionContext(new Javascript_expressionContext(_parentctx, _parentState));
					((JavascriptSelectorExpressionContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_javascript_expression);
					setState(2406);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2407);
					((JavascriptSelectorExpressionContext)_localctx).child = javascript_selector_expression();
					}
					} 
				}
				setState(2412);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,220,_ctx);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavascript_primary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavascript_primary_expression(this);
		}
	}

	public final Javascript_primary_expressionContext javascript_primary_expression() throws RecognitionException {
		Javascript_primary_expressionContext _localctx = new Javascript_primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_javascript_primary_expression);
		try {
			setState(2420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2413);
				javascript_this_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2414);
				javascript_new_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2415);
				javascript_parenthesis_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2416);
				javascript_identifier_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2417);
				javascript_literal_expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2418);
				javascript_method_expression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2419);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavascript_this_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavascript_this_expression(this);
		}
	}

	public final Javascript_this_expressionContext javascript_this_expression() throws RecognitionException {
		Javascript_this_expressionContext _localctx = new Javascript_this_expressionContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_javascript_this_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2422);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavascript_new_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavascript_new_expression(this);
		}
	}

	public final Javascript_new_expressionContext javascript_new_expression() throws RecognitionException {
		Javascript_new_expressionContext _localctx = new Javascript_new_expressionContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_javascript_new_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2424);
			new_token();
			setState(2425);
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
	public static class JavascriptMemberExpressionContext extends Javascript_selector_expressionContext {
		public Javascript_identifierContext name;
		public TerminalNode DOT() { return getToken(OParser.DOT, 0); }
		public Javascript_identifierContext javascript_identifier() {
			return getRuleContext(Javascript_identifierContext.class,0);
		}
		public JavascriptMemberExpressionContext(Javascript_selector_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavascriptMemberExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavascriptMemberExpression(this);
		}
	}
	public static class JavascriptItemExpressionContext extends Javascript_selector_expressionContext {
		public Javascript_item_expressionContext exp;
		public Javascript_item_expressionContext javascript_item_expression() {
			return getRuleContext(Javascript_item_expressionContext.class,0);
		}
		public JavascriptItemExpressionContext(Javascript_selector_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavascriptItemExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavascriptItemExpression(this);
		}
	}
	public static class JavascriptMethodExpressionContext extends Javascript_selector_expressionContext {
		public Javascript_method_expressionContext method;
		public TerminalNode DOT() { return getToken(OParser.DOT, 0); }
		public Javascript_method_expressionContext javascript_method_expression() {
			return getRuleContext(Javascript_method_expressionContext.class,0);
		}
		public JavascriptMethodExpressionContext(Javascript_selector_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavascriptMethodExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavascriptMethodExpression(this);
		}
	}

	public final Javascript_selector_expressionContext javascript_selector_expression() throws RecognitionException {
		Javascript_selector_expressionContext _localctx = new Javascript_selector_expressionContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_javascript_selector_expression);
		try {
			setState(2432);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
			case 1:
				_localctx = new JavascriptMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2427);
				match(DOT);
				setState(2428);
				((JavascriptMethodExpressionContext)_localctx).method = javascript_method_expression();
				}
				break;
			case 2:
				_localctx = new JavascriptMemberExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2429);
				match(DOT);
				setState(2430);
				((JavascriptMemberExpressionContext)_localctx).name = javascript_identifier();
				}
				break;
			case 3:
				_localctx = new JavascriptItemExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2431);
				((JavascriptItemExpressionContext)_localctx).exp = javascript_item_expression();
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
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavascript_method_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavascript_method_expression(this);
		}
	}

	public final Javascript_method_expressionContext javascript_method_expression() throws RecognitionException {
		Javascript_method_expressionContext _localctx = new Javascript_method_expressionContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_javascript_method_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2434);
			((Javascript_method_expressionContext)_localctx).name = javascript_identifier();
			setState(2435);
			match(LPAR);
			setState(2437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA) | (1L << CSHARP) | (1L << PYTHON2) | (1L << PYTHON3) | (1L << JAVASCRIPT) | (1L << SWIFT) | (1L << LPAR) | (1L << LBRAK) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (ABSTRACT - 64)) | (1L << (ALL - 64)) | (1L << (ALWAYS - 64)) | (1L << (AND - 64)) | (1L << (ANY - 64)) | (1L << (AS - 64)) | (1L << (ASC - 64)) | (1L << (ATTR - 64)) | (1L << (ATTRIBUTE - 64)) | (1L << (ATTRIBUTES - 64)) | (1L << (BINDINGS - 64)) | (1L << (BREAK - 64)) | (1L << (BY - 64)) | (1L << (CASE - 64)) | (1L << (CATCH - 64)) | (1L << (CATEGORY - 64)) | (1L << (CLASS - 64)) | (1L << (CONTAINS - 64)) | (1L << (DEF - 64)) | (1L << (DEFAULT - 64)) | (1L << (DEFINE - 64)) | (1L << (DELETE - 64)) | (1L << (DESC - 64)) | (1L << (DO - 64)) | (1L << (DOING - 64)) | (1L << (EACH - 64)) | (1L << (ELSE - 64)) | (1L << (ENUM - 64)) | (1L << (ENUMERATED - 64)) | (1L << (EXCEPT - 64)) | (1L << (EXECUTE - 64)) | (1L << (EXPECTING - 64)) | (1L << (EXTENDS - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (FINALLY - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (FROM - 64)) | (1L << (GETTER - 64)) | (1L << (HAS - 64)) | (1L << (IF - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (IS - 64)) | (1L << (MATCHING - 64)) | (1L << (METHOD - 64)) | (1L << (METHODS - 64)) | (1L << (MODULO - 64)) | (1L << (MUTABLE - 64)) | (1L << (NATIVE - 64)) | (1L << (NONE - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (ON - 128)) | (1L << (ONE - 128)) | (1L << (OPERATOR - 128)) | (1L << (OR - 128)) | (1L << (ORDER - 128)) | (1L << (OTHERWISE - 128)) | (1L << (PASS - 128)) | (1L << (RAISE - 128)) | (1L << (READ - 128)) | (1L << (RECEIVING - 128)) | (1L << (RESOURCE - 128)) | (1L << (RETURN - 128)) | (1L << (RETURNING - 128)) | (1L << (ROWS - 128)) | (1L << (SELF - 128)) | (1L << (SETTER - 128)) | (1L << (SINGLETON - 128)) | (1L << (SORTED - 128)) | (1L << (STORABLE - 128)) | (1L << (STORE - 128)) | (1L << (SUPER - 128)) | (1L << (SWITCH - 128)) | (1L << (TEST - 128)) | (1L << (THIS - 128)) | (1L << (THROW - 128)) | (1L << (TO - 128)) | (1L << (TRY - 128)) | (1L << (VERIFYING - 128)) | (1L << (WIDGET - 128)) | (1L << (WITH - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WHILE - 128)) | (1L << (WRITE - 128)) | (1L << (BOOLEAN_LITERAL - 128)) | (1L << (CHAR_LITERAL - 128)) | (1L << (SYMBOL_IDENTIFIER - 128)) | (1L << (TYPE_IDENTIFIER - 128)) | (1L << (VARIABLE_IDENTIFIER - 128)) | (1L << (DOLLAR_IDENTIFIER - 128)) | (1L << (TEXT_LITERAL - 128)) | (1L << (INTEGER_LITERAL - 128)) | (1L << (DECIMAL_LITERAL - 128)))) != 0)) {
				{
				setState(2436);
				((Javascript_method_expressionContext)_localctx).args = javascript_arguments(0);
				}
			}

			setState(2439);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavascriptArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavascriptArgumentList(this);
		}
	}
	public static class JavascriptArgumentListItemContext extends Javascript_argumentsContext {
		public Javascript_argumentsContext items;
		public Javascript_expressionContext item;
		public TerminalNode COMMA() { return getToken(OParser.COMMA, 0); }
		public Javascript_argumentsContext javascript_arguments() {
			return getRuleContext(Javascript_argumentsContext.class,0);
		}
		public Javascript_expressionContext javascript_expression() {
			return getRuleContext(Javascript_expressionContext.class,0);
		}
		public JavascriptArgumentListItemContext(Javascript_argumentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavascriptArgumentListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavascriptArgumentListItem(this);
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
		int _startState = 390;
		enterRecursionRule(_localctx, 390, RULE_javascript_arguments, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavascriptArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2442);
			((JavascriptArgumentListContext)_localctx).item = javascript_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2449);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,224,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavascriptArgumentListItemContext(new Javascript_argumentsContext(_parentctx, _parentState));
					((JavascriptArgumentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_javascript_arguments);
					setState(2444);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2445);
					match(COMMA);
					setState(2446);
					((JavascriptArgumentListItemContext)_localctx).item = javascript_expression(0);
					}
					} 
				}
				setState(2451);
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

	public static class Javascript_item_expressionContext extends ParserRuleContext {
		public Javascript_expressionContext exp;
		public TerminalNode LBRAK() { return getToken(OParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(OParser.RBRAK, 0); }
		public Javascript_expressionContext javascript_expression() {
			return getRuleContext(Javascript_expressionContext.class,0);
		}
		public Javascript_item_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javascript_item_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavascript_item_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavascript_item_expression(this);
		}
	}

	public final Javascript_item_expressionContext javascript_item_expression() throws RecognitionException {
		Javascript_item_expressionContext _localctx = new Javascript_item_expressionContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_javascript_item_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2452);
			match(LBRAK);
			setState(2453);
			((Javascript_item_expressionContext)_localctx).exp = javascript_expression(0);
			setState(2454);
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
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public Javascript_expressionContext javascript_expression() {
			return getRuleContext(Javascript_expressionContext.class,0);
		}
		public Javascript_parenthesis_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javascript_parenthesis_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavascript_parenthesis_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavascript_parenthesis_expression(this);
		}
	}

	public final Javascript_parenthesis_expressionContext javascript_parenthesis_expression() throws RecognitionException {
		Javascript_parenthesis_expressionContext _localctx = new Javascript_parenthesis_expressionContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_javascript_parenthesis_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2456);
			match(LPAR);
			setState(2457);
			((Javascript_parenthesis_expressionContext)_localctx).exp = javascript_expression(0);
			setState(2458);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavascript_identifier_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavascript_identifier_expression(this);
		}
	}

	public final Javascript_identifier_expressionContext javascript_identifier_expression() throws RecognitionException {
		Javascript_identifier_expressionContext _localctx = new Javascript_identifier_expressionContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_javascript_identifier_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2460);
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
		public TerminalNode INTEGER_LITERAL() { return getToken(OParser.INTEGER_LITERAL, 0); }
		public JavascriptIntegerLiteralContext(Javascript_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavascriptIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavascriptIntegerLiteral(this);
		}
	}
	public static class JavascriptBooleanLiteralContext extends Javascript_literal_expressionContext {
		public Token t;
		public TerminalNode BOOLEAN_LITERAL() { return getToken(OParser.BOOLEAN_LITERAL, 0); }
		public JavascriptBooleanLiteralContext(Javascript_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavascriptBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavascriptBooleanLiteral(this);
		}
	}
	public static class JavascriptCharacterLiteralContext extends Javascript_literal_expressionContext {
		public Token t;
		public TerminalNode CHAR_LITERAL() { return getToken(OParser.CHAR_LITERAL, 0); }
		public JavascriptCharacterLiteralContext(Javascript_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavascriptCharacterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavascriptCharacterLiteral(this);
		}
	}
	public static class JavascriptTextLiteralContext extends Javascript_literal_expressionContext {
		public Token t;
		public TerminalNode TEXT_LITERAL() { return getToken(OParser.TEXT_LITERAL, 0); }
		public JavascriptTextLiteralContext(Javascript_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavascriptTextLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavascriptTextLiteral(this);
		}
	}
	public static class JavascriptDecimalLiteralContext extends Javascript_literal_expressionContext {
		public Token t;
		public TerminalNode DECIMAL_LITERAL() { return getToken(OParser.DECIMAL_LITERAL, 0); }
		public JavascriptDecimalLiteralContext(Javascript_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavascriptDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavascriptDecimalLiteral(this);
		}
	}

	public final Javascript_literal_expressionContext javascript_literal_expression() throws RecognitionException {
		Javascript_literal_expressionContext _localctx = new Javascript_literal_expressionContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_javascript_literal_expression);
		try {
			setState(2467);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				_localctx = new JavascriptIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2462);
				((JavascriptIntegerLiteralContext)_localctx).t = match(INTEGER_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				_localctx = new JavascriptDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2463);
				((JavascriptDecimalLiteralContext)_localctx).t = match(DECIMAL_LITERAL);
				}
				break;
			case TEXT_LITERAL:
				_localctx = new JavascriptTextLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2464);
				((JavascriptTextLiteralContext)_localctx).t = match(TEXT_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new JavascriptBooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2465);
				((JavascriptBooleanLiteralContext)_localctx).t = match(BOOLEAN_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new JavascriptCharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2466);
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
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(OParser.VARIABLE_IDENTIFIER, 0); }
		public TerminalNode SYMBOL_IDENTIFIER() { return getToken(OParser.SYMBOL_IDENTIFIER, 0); }
		public TerminalNode DOLLAR_IDENTIFIER() { return getToken(OParser.DOLLAR_IDENTIFIER, 0); }
		public TerminalNode TYPE_IDENTIFIER() { return getToken(OParser.TYPE_IDENTIFIER, 0); }
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public Javascript_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javascript_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavascript_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavascript_identifier(this);
		}
	}

	public final Javascript_identifierContext javascript_identifier() throws RecognitionException {
		Javascript_identifierContext _localctx = new Javascript_identifierContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_javascript_identifier);
		try {
			setState(2474);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2469);
				match(VARIABLE_IDENTIFIER);
				}
				break;
			case SYMBOL_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2470);
				match(SYMBOL_IDENTIFIER);
				}
				break;
			case DOLLAR_IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(2471);
				match(DOLLAR_IDENTIFIER);
				}
				break;
			case TYPE_IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(2472);
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
			case DBID:
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
				setState(2473);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPythonStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPythonStatement(this);
		}
	}
	public static class PythonReturnStatementContext extends Python_statementContext {
		public Python_expressionContext exp;
		public TerminalNode RETURN() { return getToken(OParser.RETURN, 0); }
		public Python_expressionContext python_expression() {
			return getRuleContext(Python_expressionContext.class,0);
		}
		public PythonReturnStatementContext(Python_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPythonReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPythonReturnStatement(this);
		}
	}

	public final Python_statementContext python_statement() throws RecognitionException {
		Python_statementContext _localctx = new Python_statementContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_python_statement);
		try {
			setState(2479);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
			case 1:
				_localctx = new PythonReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2476);
				match(RETURN);
				setState(2477);
				((PythonReturnStatementContext)_localctx).exp = python_expression(0);
				}
				break;
			case 2:
				_localctx = new PythonStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2478);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPythonSelectorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPythonSelectorExpression(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPythonPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPythonPrimaryExpression(this);
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
		int _startState = 404;
		enterRecursionRule(_localctx, 404, RULE_python_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PythonPrimaryExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2482);
			((PythonPrimaryExpressionContext)_localctx).exp = python_primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(2488);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,228,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PythonSelectorExpressionContext(new Python_expressionContext(_parentctx, _parentState));
					((PythonSelectorExpressionContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_python_expression);
					setState(2484);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2485);
					((PythonSelectorExpressionContext)_localctx).child = python_selector_expression();
					}
					} 
				}
				setState(2490);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPythonParenthesisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPythonParenthesisExpression(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPythonIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPythonIdentifierExpression(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPythonSelfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPythonSelfExpression(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPythonLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPythonLiteralExpression(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPythonGlobalMethodExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPythonGlobalMethodExpression(this);
		}
	}

	public final Python_primary_expressionContext python_primary_expression() throws RecognitionException {
		Python_primary_expressionContext _localctx = new Python_primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_python_primary_expression);
		try {
			setState(2496);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
			case 1:
				_localctx = new PythonSelfExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2491);
				((PythonSelfExpressionContext)_localctx).exp = python_self_expression();
				}
				break;
			case 2:
				_localctx = new PythonParenthesisExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2492);
				((PythonParenthesisExpressionContext)_localctx).exp = python_parenthesis_expression();
				}
				break;
			case 3:
				_localctx = new PythonIdentifierExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2493);
				((PythonIdentifierExpressionContext)_localctx).exp = python_identifier_expression(0);
				}
				break;
			case 4:
				_localctx = new PythonLiteralExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2494);
				((PythonLiteralExpressionContext)_localctx).exp = python_literal_expression();
				}
				break;
			case 5:
				_localctx = new PythonGlobalMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2495);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPython_self_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPython_self_expression(this);
		}
	}

	public final Python_self_expressionContext python_self_expression() throws RecognitionException {
		Python_self_expressionContext _localctx = new Python_self_expressionContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_python_self_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2498);
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
		public TerminalNode DOT() { return getToken(OParser.DOT, 0); }
		public Python_method_expressionContext python_method_expression() {
			return getRuleContext(Python_method_expressionContext.class,0);
		}
		public PythonMethodExpressionContext(Python_selector_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPythonMethodExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPythonMethodExpression(this);
		}
	}
	public static class PythonItemExpressionContext extends Python_selector_expressionContext {
		public Python_expressionContext exp;
		public TerminalNode LBRAK() { return getToken(OParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(OParser.RBRAK, 0); }
		public Python_expressionContext python_expression() {
			return getRuleContext(Python_expressionContext.class,0);
		}
		public PythonItemExpressionContext(Python_selector_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPythonItemExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPythonItemExpression(this);
		}
	}

	public final Python_selector_expressionContext python_selector_expression() throws RecognitionException {
		Python_selector_expressionContext _localctx = new Python_selector_expressionContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_python_selector_expression);
		try {
			setState(2506);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				_localctx = new PythonMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2500);
				match(DOT);
				setState(2501);
				((PythonMethodExpressionContext)_localctx).exp = python_method_expression();
				}
				break;
			case LBRAK:
				_localctx = new PythonItemExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2502);
				match(LBRAK);
				setState(2503);
				((PythonItemExpressionContext)_localctx).exp = python_expression(0);
				setState(2504);
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
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPython_method_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPython_method_expression(this);
		}
	}

	public final Python_method_expressionContext python_method_expression() throws RecognitionException {
		Python_method_expressionContext _localctx = new Python_method_expressionContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_python_method_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2508);
			((Python_method_expressionContext)_localctx).name = python_identifier();
			setState(2509);
			match(LPAR);
			setState(2511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA) | (1L << CSHARP) | (1L << PYTHON2) | (1L << PYTHON3) | (1L << JAVASCRIPT) | (1L << SWIFT) | (1L << LPAR) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (ABSTRACT - 64)) | (1L << (ALL - 64)) | (1L << (ALWAYS - 64)) | (1L << (AND - 64)) | (1L << (ANY - 64)) | (1L << (AS - 64)) | (1L << (ASC - 64)) | (1L << (ATTR - 64)) | (1L << (ATTRIBUTE - 64)) | (1L << (ATTRIBUTES - 64)) | (1L << (BINDINGS - 64)) | (1L << (BREAK - 64)) | (1L << (BY - 64)) | (1L << (CASE - 64)) | (1L << (CATCH - 64)) | (1L << (CATEGORY - 64)) | (1L << (CLASS - 64)) | (1L << (CONTAINS - 64)) | (1L << (DEF - 64)) | (1L << (DEFAULT - 64)) | (1L << (DEFINE - 64)) | (1L << (DELETE - 64)) | (1L << (DESC - 64)) | (1L << (DO - 64)) | (1L << (DOING - 64)) | (1L << (EACH - 64)) | (1L << (ELSE - 64)) | (1L << (ENUM - 64)) | (1L << (ENUMERATED - 64)) | (1L << (EXCEPT - 64)) | (1L << (EXECUTE - 64)) | (1L << (EXPECTING - 64)) | (1L << (EXTENDS - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (FINALLY - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (FROM - 64)) | (1L << (GETTER - 64)) | (1L << (HAS - 64)) | (1L << (IF - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (IS - 64)) | (1L << (MATCHING - 64)) | (1L << (METHOD - 64)) | (1L << (METHODS - 64)) | (1L << (MODULO - 64)) | (1L << (MUTABLE - 64)) | (1L << (NATIVE - 64)) | (1L << (NONE - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (ON - 128)) | (1L << (ONE - 128)) | (1L << (OPERATOR - 128)) | (1L << (OR - 128)) | (1L << (ORDER - 128)) | (1L << (OTHERWISE - 128)) | (1L << (PASS - 128)) | (1L << (RAISE - 128)) | (1L << (READ - 128)) | (1L << (RECEIVING - 128)) | (1L << (RESOURCE - 128)) | (1L << (RETURN - 128)) | (1L << (RETURNING - 128)) | (1L << (ROWS - 128)) | (1L << (SELF - 128)) | (1L << (SETTER - 128)) | (1L << (SINGLETON - 128)) | (1L << (SORTED - 128)) | (1L << (STORABLE - 128)) | (1L << (STORE - 128)) | (1L << (SUPER - 128)) | (1L << (SWITCH - 128)) | (1L << (TEST - 128)) | (1L << (THIS - 128)) | (1L << (THROW - 128)) | (1L << (TO - 128)) | (1L << (TRY - 128)) | (1L << (VERIFYING - 128)) | (1L << (WIDGET - 128)) | (1L << (WITH - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WHILE - 128)) | (1L << (WRITE - 128)) | (1L << (BOOLEAN_LITERAL - 128)) | (1L << (CHAR_LITERAL - 128)) | (1L << (SYMBOL_IDENTIFIER - 128)) | (1L << (TYPE_IDENTIFIER - 128)) | (1L << (VARIABLE_IDENTIFIER - 128)) | (1L << (DOLLAR_IDENTIFIER - 128)) | (1L << (TEXT_LITERAL - 128)) | (1L << (INTEGER_LITERAL - 128)) | (1L << (DECIMAL_LITERAL - 128)))) != 0)) {
				{
				setState(2510);
				((Python_method_expressionContext)_localctx).args = python_argument_list();
				}
			}

			setState(2513);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPythonOrdinalOnlyArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPythonOrdinalOnlyArgumentList(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPythonNamedOnlyArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPythonNamedOnlyArgumentList(this);
		}
	}
	public static class PythonArgumentListContext extends Python_argument_listContext {
		public Python_ordinal_argument_listContext ordinal;
		public Python_named_argument_listContext named;
		public TerminalNode COMMA() { return getToken(OParser.COMMA, 0); }
		public Python_ordinal_argument_listContext python_ordinal_argument_list() {
			return getRuleContext(Python_ordinal_argument_listContext.class,0);
		}
		public Python_named_argument_listContext python_named_argument_list() {
			return getRuleContext(Python_named_argument_listContext.class,0);
		}
		public PythonArgumentListContext(Python_argument_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPythonArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPythonArgumentList(this);
		}
	}

	public final Python_argument_listContext python_argument_list() throws RecognitionException {
		Python_argument_listContext _localctx = new Python_argument_listContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_python_argument_list);
		try {
			setState(2521);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
			case 1:
				_localctx = new PythonOrdinalOnlyArgumentListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2515);
				((PythonOrdinalOnlyArgumentListContext)_localctx).ordinal = python_ordinal_argument_list(0);
				}
				break;
			case 2:
				_localctx = new PythonNamedOnlyArgumentListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2516);
				((PythonNamedOnlyArgumentListContext)_localctx).named = python_named_argument_list(0);
				}
				break;
			case 3:
				_localctx = new PythonArgumentListContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2517);
				((PythonArgumentListContext)_localctx).ordinal = python_ordinal_argument_list(0);
				setState(2518);
				match(COMMA);
				setState(2519);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPythonOrdinalArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPythonOrdinalArgumentList(this);
		}
	}
	public static class PythonOrdinalArgumentListItemContext extends Python_ordinal_argument_listContext {
		public Python_ordinal_argument_listContext items;
		public Python_expressionContext item;
		public TerminalNode COMMA() { return getToken(OParser.COMMA, 0); }
		public Python_ordinal_argument_listContext python_ordinal_argument_list() {
			return getRuleContext(Python_ordinal_argument_listContext.class,0);
		}
		public Python_expressionContext python_expression() {
			return getRuleContext(Python_expressionContext.class,0);
		}
		public PythonOrdinalArgumentListItemContext(Python_ordinal_argument_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPythonOrdinalArgumentListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPythonOrdinalArgumentListItem(this);
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
		int _startState = 416;
		enterRecursionRule(_localctx, 416, RULE_python_ordinal_argument_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PythonOrdinalArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2524);
			((PythonOrdinalArgumentListContext)_localctx).item = python_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2531);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,233,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PythonOrdinalArgumentListItemContext(new Python_ordinal_argument_listContext(_parentctx, _parentState));
					((PythonOrdinalArgumentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_python_ordinal_argument_list);
					setState(2526);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2527);
					match(COMMA);
					setState(2528);
					((PythonOrdinalArgumentListItemContext)_localctx).item = python_expression(0);
					}
					} 
				}
				setState(2533);
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
		public TerminalNode EQ() { return getToken(OParser.EQ, 0); }
		public Python_identifierContext python_identifier() {
			return getRuleContext(Python_identifierContext.class,0);
		}
		public Python_expressionContext python_expression() {
			return getRuleContext(Python_expressionContext.class,0);
		}
		public PythonNamedArgumentListContext(Python_named_argument_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPythonNamedArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPythonNamedArgumentList(this);
		}
	}
	public static class PythonNamedArgumentListItemContext extends Python_named_argument_listContext {
		public Python_named_argument_listContext items;
		public Python_identifierContext name;
		public Python_expressionContext exp;
		public TerminalNode COMMA() { return getToken(OParser.COMMA, 0); }
		public TerminalNode EQ() { return getToken(OParser.EQ, 0); }
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPythonNamedArgumentListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPythonNamedArgumentListItem(this);
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
		int _startState = 418;
		enterRecursionRule(_localctx, 418, RULE_python_named_argument_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PythonNamedArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2535);
			((PythonNamedArgumentListContext)_localctx).name = python_identifier();
			setState(2536);
			match(EQ);
			setState(2537);
			((PythonNamedArgumentListContext)_localctx).exp = python_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2547);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,234,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PythonNamedArgumentListItemContext(new Python_named_argument_listContext(_parentctx, _parentState));
					((PythonNamedArgumentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_python_named_argument_list);
					setState(2539);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2540);
					match(COMMA);
					setState(2541);
					((PythonNamedArgumentListItemContext)_localctx).name = python_identifier();
					setState(2542);
					match(EQ);
					setState(2543);
					((PythonNamedArgumentListItemContext)_localctx).exp = python_expression(0);
					}
					} 
				}
				setState(2549);
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

	public static class Python_parenthesis_expressionContext extends ParserRuleContext {
		public Python_expressionContext exp;
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public Python_expressionContext python_expression() {
			return getRuleContext(Python_expressionContext.class,0);
		}
		public Python_parenthesis_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_python_parenthesis_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPython_parenthesis_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPython_parenthesis_expression(this);
		}
	}

	public final Python_parenthesis_expressionContext python_parenthesis_expression() throws RecognitionException {
		Python_parenthesis_expressionContext _localctx = new Python_parenthesis_expressionContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_python_parenthesis_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2550);
			match(LPAR);
			setState(2551);
			((Python_parenthesis_expressionContext)_localctx).exp = python_expression(0);
			setState(2552);
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
		public TerminalNode DOT() { return getToken(OParser.DOT, 0); }
		public Python_identifier_expressionContext python_identifier_expression() {
			return getRuleContext(Python_identifier_expressionContext.class,0);
		}
		public Python_identifierContext python_identifier() {
			return getRuleContext(Python_identifierContext.class,0);
		}
		public PythonChildIdentifierContext(Python_identifier_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPythonChildIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPythonChildIdentifier(this);
		}
	}
	public static class PythonPromptoIdentifierContext extends Python_identifier_expressionContext {
		public TerminalNode DOLLAR_IDENTIFIER() { return getToken(OParser.DOLLAR_IDENTIFIER, 0); }
		public PythonPromptoIdentifierContext(Python_identifier_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPythonPromptoIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPythonPromptoIdentifier(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPythonIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPythonIdentifier(this);
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
		int _startState = 422;
		enterRecursionRule(_localctx, 422, RULE_python_identifier_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2557);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
			case 1:
				{
				_localctx = new PythonPromptoIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2555);
				match(DOLLAR_IDENTIFIER);
				}
				break;
			case 2:
				{
				_localctx = new PythonIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2556);
				((PythonIdentifierContext)_localctx).name = python_identifier();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2564);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,236,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PythonChildIdentifierContext(new Python_identifier_expressionContext(_parentctx, _parentState));
					((PythonChildIdentifierContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_python_identifier_expression);
					setState(2559);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2560);
					match(DOT);
					setState(2561);
					((PythonChildIdentifierContext)_localctx).name = python_identifier();
					}
					} 
				}
				setState(2566);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,236,_ctx);
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
		public TerminalNode INTEGER_LITERAL() { return getToken(OParser.INTEGER_LITERAL, 0); }
		public PythonIntegerLiteralContext(Python_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPythonIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPythonIntegerLiteral(this);
		}
	}
	public static class PythonBooleanLiteralContext extends Python_literal_expressionContext {
		public Token t;
		public TerminalNode BOOLEAN_LITERAL() { return getToken(OParser.BOOLEAN_LITERAL, 0); }
		public PythonBooleanLiteralContext(Python_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPythonBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPythonBooleanLiteral(this);
		}
	}
	public static class PythonCharacterLiteralContext extends Python_literal_expressionContext {
		public Token t;
		public TerminalNode CHAR_LITERAL() { return getToken(OParser.CHAR_LITERAL, 0); }
		public PythonCharacterLiteralContext(Python_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPythonCharacterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPythonCharacterLiteral(this);
		}
	}
	public static class PythonTextLiteralContext extends Python_literal_expressionContext {
		public Token t;
		public TerminalNode TEXT_LITERAL() { return getToken(OParser.TEXT_LITERAL, 0); }
		public PythonTextLiteralContext(Python_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPythonTextLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPythonTextLiteral(this);
		}
	}
	public static class PythonDecimalLiteralContext extends Python_literal_expressionContext {
		public Token t;
		public TerminalNode DECIMAL_LITERAL() { return getToken(OParser.DECIMAL_LITERAL, 0); }
		public PythonDecimalLiteralContext(Python_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPythonDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPythonDecimalLiteral(this);
		}
	}

	public final Python_literal_expressionContext python_literal_expression() throws RecognitionException {
		Python_literal_expressionContext _localctx = new Python_literal_expressionContext(_ctx, getState());
		enterRule(_localctx, 424, RULE_python_literal_expression);
		try {
			setState(2572);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				_localctx = new PythonIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2567);
				((PythonIntegerLiteralContext)_localctx).t = match(INTEGER_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				_localctx = new PythonDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2568);
				((PythonDecimalLiteralContext)_localctx).t = match(DECIMAL_LITERAL);
				}
				break;
			case TEXT_LITERAL:
				_localctx = new PythonTextLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2569);
				((PythonTextLiteralContext)_localctx).t = match(TEXT_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new PythonBooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2570);
				((PythonBooleanLiteralContext)_localctx).t = match(BOOLEAN_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new PythonCharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2571);
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
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(OParser.VARIABLE_IDENTIFIER, 0); }
		public TerminalNode SYMBOL_IDENTIFIER() { return getToken(OParser.SYMBOL_IDENTIFIER, 0); }
		public TerminalNode DOLLAR_IDENTIFIER() { return getToken(OParser.DOLLAR_IDENTIFIER, 0); }
		public TerminalNode TYPE_IDENTIFIER() { return getToken(OParser.TYPE_IDENTIFIER, 0); }
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public Python_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_python_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPython_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPython_identifier(this);
		}
	}

	public final Python_identifierContext python_identifier() throws RecognitionException {
		Python_identifierContext _localctx = new Python_identifierContext(_ctx, getState());
		enterRule(_localctx, 426, RULE_python_identifier);
		try {
			setState(2579);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2574);
				match(VARIABLE_IDENTIFIER);
				}
				break;
			case SYMBOL_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2575);
				match(SYMBOL_IDENTIFIER);
				}
				break;
			case DOLLAR_IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(2576);
				match(DOLLAR_IDENTIFIER);
				}
				break;
			case TYPE_IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(2577);
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
			case DBID:
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
				setState(2578);
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
		public TerminalNode RETURN() { return getToken(OParser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(OParser.SEMI, 0); }
		public Java_expressionContext java_expression() {
			return getRuleContext(Java_expressionContext.class,0);
		}
		public JavaReturnStatementContext(Java_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavaReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavaReturnStatement(this);
		}
	}
	public static class JavaStatementContext extends Java_statementContext {
		public Java_expressionContext exp;
		public TerminalNode SEMI() { return getToken(OParser.SEMI, 0); }
		public Java_expressionContext java_expression() {
			return getRuleContext(Java_expressionContext.class,0);
		}
		public JavaStatementContext(Java_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavaStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavaStatement(this);
		}
	}

	public final Java_statementContext java_statement() throws RecognitionException {
		Java_statementContext _localctx = new Java_statementContext(_ctx, getState());
		enterRule(_localctx, 428, RULE_java_statement);
		try {
			setState(2588);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
			case 1:
				_localctx = new JavaReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2581);
				match(RETURN);
				setState(2582);
				((JavaReturnStatementContext)_localctx).exp = java_expression(0);
				setState(2583);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new JavaStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2585);
				((JavaStatementContext)_localctx).exp = java_expression(0);
				setState(2586);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavaSelectorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavaSelectorExpression(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavaPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavaPrimaryExpression(this);
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
		int _startState = 430;
		enterRecursionRule(_localctx, 430, RULE_java_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavaPrimaryExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2591);
			((JavaPrimaryExpressionContext)_localctx).exp = java_primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(2597);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,240,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavaSelectorExpressionContext(new Java_expressionContext(_parentctx, _parentState));
					((JavaSelectorExpressionContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_java_expression);
					setState(2593);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2594);
					((JavaSelectorExpressionContext)_localctx).child = java_selector_expression();
					}
					} 
				}
				setState(2599);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,240,_ctx);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJava_primary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJava_primary_expression(this);
		}
	}

	public final Java_primary_expressionContext java_primary_expression() throws RecognitionException {
		Java_primary_expressionContext _localctx = new Java_primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 432, RULE_java_primary_expression);
		try {
			setState(2605);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2600);
				java_this_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2601);
				java_new_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2602);
				java_parenthesis_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2603);
				java_identifier_expression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2604);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJava_this_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJava_this_expression(this);
		}
	}

	public final Java_this_expressionContext java_this_expression() throws RecognitionException {
		Java_this_expressionContext _localctx = new Java_this_expressionContext(_ctx, getState());
		enterRule(_localctx, 434, RULE_java_this_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2607);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJava_new_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJava_new_expression(this);
		}
	}

	public final Java_new_expressionContext java_new_expression() throws RecognitionException {
		Java_new_expressionContext _localctx = new Java_new_expressionContext(_ctx, getState());
		enterRule(_localctx, 436, RULE_java_new_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2609);
			new_token();
			setState(2610);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavaItemExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavaItemExpression(this);
		}
	}
	public static class JavaMethodExpressionContext extends Java_selector_expressionContext {
		public Java_method_expressionContext exp;
		public TerminalNode DOT() { return getToken(OParser.DOT, 0); }
		public Java_method_expressionContext java_method_expression() {
			return getRuleContext(Java_method_expressionContext.class,0);
		}
		public JavaMethodExpressionContext(Java_selector_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavaMethodExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavaMethodExpression(this);
		}
	}

	public final Java_selector_expressionContext java_selector_expression() throws RecognitionException {
		Java_selector_expressionContext _localctx = new Java_selector_expressionContext(_ctx, getState());
		enterRule(_localctx, 438, RULE_java_selector_expression);
		try {
			setState(2615);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				_localctx = new JavaMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2612);
				match(DOT);
				setState(2613);
				((JavaMethodExpressionContext)_localctx).exp = java_method_expression();
				}
				break;
			case LBRAK:
				_localctx = new JavaItemExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2614);
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
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJava_method_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJava_method_expression(this);
		}
	}

	public final Java_method_expressionContext java_method_expression() throws RecognitionException {
		Java_method_expressionContext _localctx = new Java_method_expressionContext(_ctx, getState());
		enterRule(_localctx, 440, RULE_java_method_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2617);
			((Java_method_expressionContext)_localctx).name = java_identifier();
			setState(2618);
			match(LPAR);
			setState(2620);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA) | (1L << CSHARP) | (1L << PYTHON2) | (1L << PYTHON3) | (1L << JAVASCRIPT) | (1L << SWIFT) | (1L << LPAR) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (ABSTRACT - 64)) | (1L << (ALL - 64)) | (1L << (ALWAYS - 64)) | (1L << (AND - 64)) | (1L << (ANY - 64)) | (1L << (AS - 64)) | (1L << (ASC - 64)) | (1L << (ATTR - 64)) | (1L << (ATTRIBUTE - 64)) | (1L << (ATTRIBUTES - 64)) | (1L << (BINDINGS - 64)) | (1L << (BREAK - 64)) | (1L << (BY - 64)) | (1L << (CASE - 64)) | (1L << (CATCH - 64)) | (1L << (CATEGORY - 64)) | (1L << (CLASS - 64)) | (1L << (CONTAINS - 64)) | (1L << (DEF - 64)) | (1L << (DEFAULT - 64)) | (1L << (DEFINE - 64)) | (1L << (DELETE - 64)) | (1L << (DESC - 64)) | (1L << (DO - 64)) | (1L << (DOING - 64)) | (1L << (EACH - 64)) | (1L << (ELSE - 64)) | (1L << (ENUM - 64)) | (1L << (ENUMERATED - 64)) | (1L << (EXCEPT - 64)) | (1L << (EXECUTE - 64)) | (1L << (EXPECTING - 64)) | (1L << (EXTENDS - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (FINALLY - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (FROM - 64)) | (1L << (GETTER - 64)) | (1L << (HAS - 64)) | (1L << (IF - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (IS - 64)) | (1L << (MATCHING - 64)) | (1L << (METHOD - 64)) | (1L << (METHODS - 64)) | (1L << (MODULO - 64)) | (1L << (MUTABLE - 64)) | (1L << (NATIVE - 64)) | (1L << (NONE - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (ON - 128)) | (1L << (ONE - 128)) | (1L << (OPERATOR - 128)) | (1L << (OR - 128)) | (1L << (ORDER - 128)) | (1L << (OTHERWISE - 128)) | (1L << (PASS - 128)) | (1L << (RAISE - 128)) | (1L << (READ - 128)) | (1L << (RECEIVING - 128)) | (1L << (RESOURCE - 128)) | (1L << (RETURN - 128)) | (1L << (RETURNING - 128)) | (1L << (ROWS - 128)) | (1L << (SELF - 128)) | (1L << (SETTER - 128)) | (1L << (SINGLETON - 128)) | (1L << (SORTED - 128)) | (1L << (STORABLE - 128)) | (1L << (STORE - 128)) | (1L << (SUPER - 128)) | (1L << (SWITCH - 128)) | (1L << (TEST - 128)) | (1L << (THIS - 128)) | (1L << (THROW - 128)) | (1L << (TO - 128)) | (1L << (TRY - 128)) | (1L << (VERIFYING - 128)) | (1L << (WIDGET - 128)) | (1L << (WITH - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WHILE - 128)) | (1L << (WRITE - 128)) | (1L << (BOOLEAN_LITERAL - 128)) | (1L << (CHAR_LITERAL - 128)) | (1L << (SYMBOL_IDENTIFIER - 128)) | (1L << (TYPE_IDENTIFIER - 128)) | (1L << (VARIABLE_IDENTIFIER - 128)) | (1L << (DOLLAR_IDENTIFIER - 128)) | (1L << (TEXT_LITERAL - 128)) | (1L << (INTEGER_LITERAL - 128)) | (1L << (DECIMAL_LITERAL - 128)))) != 0)) {
				{
				setState(2619);
				((Java_method_expressionContext)_localctx).args = java_arguments(0);
				}
			}

			setState(2622);
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
		public TerminalNode COMMA() { return getToken(OParser.COMMA, 0); }
		public Java_argumentsContext java_arguments() {
			return getRuleContext(Java_argumentsContext.class,0);
		}
		public Java_expressionContext java_expression() {
			return getRuleContext(Java_expressionContext.class,0);
		}
		public JavaArgumentListItemContext(Java_argumentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavaArgumentListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavaArgumentListItem(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavaArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavaArgumentList(this);
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
		int _startState = 442;
		enterRecursionRule(_localctx, 442, RULE_java_arguments, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavaArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2625);
			((JavaArgumentListContext)_localctx).item = java_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2632);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,244,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavaArgumentListItemContext(new Java_argumentsContext(_parentctx, _parentState));
					((JavaArgumentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_java_arguments);
					setState(2627);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2628);
					match(COMMA);
					setState(2629);
					((JavaArgumentListItemContext)_localctx).item = java_expression(0);
					}
					} 
				}
				setState(2634);
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

	public static class Java_item_expressionContext extends ParserRuleContext {
		public Java_expressionContext exp;
		public TerminalNode LBRAK() { return getToken(OParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(OParser.RBRAK, 0); }
		public Java_expressionContext java_expression() {
			return getRuleContext(Java_expressionContext.class,0);
		}
		public Java_item_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_item_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJava_item_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJava_item_expression(this);
		}
	}

	public final Java_item_expressionContext java_item_expression() throws RecognitionException {
		Java_item_expressionContext _localctx = new Java_item_expressionContext(_ctx, getState());
		enterRule(_localctx, 444, RULE_java_item_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2635);
			match(LBRAK);
			setState(2636);
			((Java_item_expressionContext)_localctx).exp = java_expression(0);
			setState(2637);
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
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public Java_expressionContext java_expression() {
			return getRuleContext(Java_expressionContext.class,0);
		}
		public Java_parenthesis_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_parenthesis_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJava_parenthesis_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJava_parenthesis_expression(this);
		}
	}

	public final Java_parenthesis_expressionContext java_parenthesis_expression() throws RecognitionException {
		Java_parenthesis_expressionContext _localctx = new Java_parenthesis_expressionContext(_ctx, getState());
		enterRule(_localctx, 446, RULE_java_parenthesis_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2639);
			match(LPAR);
			setState(2640);
			((Java_parenthesis_expressionContext)_localctx).exp = java_expression(0);
			setState(2641);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavaIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavaIdentifier(this);
		}
	}
	public static class JavaChildIdentifierContext extends Java_identifier_expressionContext {
		public Java_identifier_expressionContext parent;
		public Java_identifierContext name;
		public TerminalNode DOT() { return getToken(OParser.DOT, 0); }
		public Java_identifier_expressionContext java_identifier_expression() {
			return getRuleContext(Java_identifier_expressionContext.class,0);
		}
		public Java_identifierContext java_identifier() {
			return getRuleContext(Java_identifierContext.class,0);
		}
		public JavaChildIdentifierContext(Java_identifier_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavaChildIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavaChildIdentifier(this);
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
		int _startState = 448;
		enterRecursionRule(_localctx, 448, RULE_java_identifier_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavaIdentifierContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2644);
			((JavaIdentifierContext)_localctx).name = java_identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(2651);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,245,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavaChildIdentifierContext(new Java_identifier_expressionContext(_parentctx, _parentState));
					((JavaChildIdentifierContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_java_identifier_expression);
					setState(2646);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2647);
					match(DOT);
					setState(2648);
					((JavaChildIdentifierContext)_localctx).name = java_identifier();
					}
					} 
				}
				setState(2653);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,245,_ctx);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavaClassIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavaClassIdentifier(this);
		}
	}
	public static class JavaChildClassIdentifierContext extends Java_class_identifier_expressionContext {
		public Java_class_identifier_expressionContext parent;
		public Token name;
		public Java_class_identifier_expressionContext java_class_identifier_expression() {
			return getRuleContext(Java_class_identifier_expressionContext.class,0);
		}
		public TerminalNode DOLLAR_IDENTIFIER() { return getToken(OParser.DOLLAR_IDENTIFIER, 0); }
		public JavaChildClassIdentifierContext(Java_class_identifier_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavaChildClassIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavaChildClassIdentifier(this);
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
		int _startState = 450;
		enterRecursionRule(_localctx, 450, RULE_java_class_identifier_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavaClassIdentifierContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2655);
			((JavaClassIdentifierContext)_localctx).klass = java_identifier_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2661);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,246,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavaChildClassIdentifierContext(new Java_class_identifier_expressionContext(_parentctx, _parentState));
					((JavaChildClassIdentifierContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_java_class_identifier_expression);
					setState(2657);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2658);
					((JavaChildClassIdentifierContext)_localctx).name = match(DOLLAR_IDENTIFIER);
					}
					} 
				}
				setState(2663);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,246,_ctx);
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
		public TerminalNode BOOLEAN_LITERAL() { return getToken(OParser.BOOLEAN_LITERAL, 0); }
		public JavaBooleanLiteralContext(Java_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavaBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavaBooleanLiteral(this);
		}
	}
	public static class JavaCharacterLiteralContext extends Java_literal_expressionContext {
		public Token t;
		public TerminalNode CHAR_LITERAL() { return getToken(OParser.CHAR_LITERAL, 0); }
		public JavaCharacterLiteralContext(Java_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavaCharacterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavaCharacterLiteral(this);
		}
	}
	public static class JavaIntegerLiteralContext extends Java_literal_expressionContext {
		public Token t;
		public TerminalNode INTEGER_LITERAL() { return getToken(OParser.INTEGER_LITERAL, 0); }
		public JavaIntegerLiteralContext(Java_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavaIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavaIntegerLiteral(this);
		}
	}
	public static class JavaTextLiteralContext extends Java_literal_expressionContext {
		public Token t;
		public TerminalNode TEXT_LITERAL() { return getToken(OParser.TEXT_LITERAL, 0); }
		public JavaTextLiteralContext(Java_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavaTextLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavaTextLiteral(this);
		}
	}
	public static class JavaDecimalLiteralContext extends Java_literal_expressionContext {
		public Token t;
		public TerminalNode DECIMAL_LITERAL() { return getToken(OParser.DECIMAL_LITERAL, 0); }
		public JavaDecimalLiteralContext(Java_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavaDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavaDecimalLiteral(this);
		}
	}

	public final Java_literal_expressionContext java_literal_expression() throws RecognitionException {
		Java_literal_expressionContext _localctx = new Java_literal_expressionContext(_ctx, getState());
		enterRule(_localctx, 452, RULE_java_literal_expression);
		try {
			setState(2669);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				_localctx = new JavaIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2664);
				((JavaIntegerLiteralContext)_localctx).t = match(INTEGER_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				_localctx = new JavaDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2665);
				((JavaDecimalLiteralContext)_localctx).t = match(DECIMAL_LITERAL);
				}
				break;
			case TEXT_LITERAL:
				_localctx = new JavaTextLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2666);
				((JavaTextLiteralContext)_localctx).t = match(TEXT_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new JavaBooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2667);
				((JavaBooleanLiteralContext)_localctx).t = match(BOOLEAN_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new JavaCharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2668);
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
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(OParser.VARIABLE_IDENTIFIER, 0); }
		public TerminalNode SYMBOL_IDENTIFIER() { return getToken(OParser.SYMBOL_IDENTIFIER, 0); }
		public TerminalNode DOLLAR_IDENTIFIER() { return getToken(OParser.DOLLAR_IDENTIFIER, 0); }
		public TerminalNode TYPE_IDENTIFIER() { return getToken(OParser.TYPE_IDENTIFIER, 0); }
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public Java_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJava_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJava_identifier(this);
		}
	}

	public final Java_identifierContext java_identifier() throws RecognitionException {
		Java_identifierContext _localctx = new Java_identifierContext(_ctx, getState());
		enterRule(_localctx, 454, RULE_java_identifier);
		try {
			setState(2676);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2671);
				match(VARIABLE_IDENTIFIER);
				}
				break;
			case SYMBOL_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2672);
				match(SYMBOL_IDENTIFIER);
				}
				break;
			case DOLLAR_IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(2673);
				match(DOLLAR_IDENTIFIER);
				}
				break;
			case TYPE_IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(2674);
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
			case DBID:
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
				setState(2675);
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
		public TerminalNode RETURN() { return getToken(OParser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(OParser.SEMI, 0); }
		public Csharp_expressionContext csharp_expression() {
			return getRuleContext(Csharp_expressionContext.class,0);
		}
		public CSharpReturnStatementContext(Csharp_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCSharpReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCSharpReturnStatement(this);
		}
	}
	public static class CSharpStatementContext extends Csharp_statementContext {
		public Csharp_expressionContext exp;
		public TerminalNode SEMI() { return getToken(OParser.SEMI, 0); }
		public Csharp_expressionContext csharp_expression() {
			return getRuleContext(Csharp_expressionContext.class,0);
		}
		public CSharpStatementContext(Csharp_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCSharpStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCSharpStatement(this);
		}
	}

	public final Csharp_statementContext csharp_statement() throws RecognitionException {
		Csharp_statementContext _localctx = new Csharp_statementContext(_ctx, getState());
		enterRule(_localctx, 456, RULE_csharp_statement);
		try {
			setState(2685);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
			case 1:
				_localctx = new CSharpReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2678);
				match(RETURN);
				setState(2679);
				((CSharpReturnStatementContext)_localctx).exp = csharp_expression(0);
				setState(2680);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new CSharpStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2682);
				((CSharpStatementContext)_localctx).exp = csharp_expression(0);
				setState(2683);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCSharpSelectorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCSharpSelectorExpression(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCSharpPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCSharpPrimaryExpression(this);
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
		int _startState = 458;
		enterRecursionRule(_localctx, 458, RULE_csharp_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new CSharpPrimaryExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2688);
			((CSharpPrimaryExpressionContext)_localctx).exp = csharp_primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(2694);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,250,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CSharpSelectorExpressionContext(new Csharp_expressionContext(_parentctx, _parentState));
					((CSharpSelectorExpressionContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_csharp_expression);
					setState(2690);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2691);
					((CSharpSelectorExpressionContext)_localctx).child = csharp_selector_expression();
					}
					} 
				}
				setState(2696);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,250,_ctx);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCsharp_primary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCsharp_primary_expression(this);
		}
	}

	public final Csharp_primary_expressionContext csharp_primary_expression() throws RecognitionException {
		Csharp_primary_expressionContext _localctx = new Csharp_primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 460, RULE_csharp_primary_expression);
		try {
			setState(2702);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2697);
				csharp_this_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2698);
				csharp_new_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2699);
				csharp_parenthesis_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2700);
				csharp_identifier_expression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2701);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCsharp_this_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCsharp_this_expression(this);
		}
	}

	public final Csharp_this_expressionContext csharp_this_expression() throws RecognitionException {
		Csharp_this_expressionContext _localctx = new Csharp_this_expressionContext(_ctx, getState());
		enterRule(_localctx, 462, RULE_csharp_this_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2704);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCsharp_new_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCsharp_new_expression(this);
		}
	}

	public final Csharp_new_expressionContext csharp_new_expression() throws RecognitionException {
		Csharp_new_expressionContext _localctx = new Csharp_new_expressionContext(_ctx, getState());
		enterRule(_localctx, 464, RULE_csharp_new_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2706);
			new_token();
			setState(2707);
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
		public TerminalNode DOT() { return getToken(OParser.DOT, 0); }
		public Csharp_method_expressionContext csharp_method_expression() {
			return getRuleContext(Csharp_method_expressionContext.class,0);
		}
		public CSharpMethodExpressionContext(Csharp_selector_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCSharpMethodExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCSharpMethodExpression(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCSharpItemExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCSharpItemExpression(this);
		}
	}

	public final Csharp_selector_expressionContext csharp_selector_expression() throws RecognitionException {
		Csharp_selector_expressionContext _localctx = new Csharp_selector_expressionContext(_ctx, getState());
		enterRule(_localctx, 466, RULE_csharp_selector_expression);
		try {
			setState(2712);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				_localctx = new CSharpMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2709);
				match(DOT);
				setState(2710);
				((CSharpMethodExpressionContext)_localctx).exp = csharp_method_expression();
				}
				break;
			case LBRAK:
				_localctx = new CSharpItemExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2711);
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
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCsharp_method_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCsharp_method_expression(this);
		}
	}

	public final Csharp_method_expressionContext csharp_method_expression() throws RecognitionException {
		Csharp_method_expressionContext _localctx = new Csharp_method_expressionContext(_ctx, getState());
		enterRule(_localctx, 468, RULE_csharp_method_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2714);
			((Csharp_method_expressionContext)_localctx).name = csharp_identifier();
			setState(2715);
			match(LPAR);
			setState(2717);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA) | (1L << CSHARP) | (1L << PYTHON2) | (1L << PYTHON3) | (1L << JAVASCRIPT) | (1L << SWIFT) | (1L << LPAR) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (ABSTRACT - 64)) | (1L << (ALL - 64)) | (1L << (ALWAYS - 64)) | (1L << (AND - 64)) | (1L << (ANY - 64)) | (1L << (AS - 64)) | (1L << (ASC - 64)) | (1L << (ATTR - 64)) | (1L << (ATTRIBUTE - 64)) | (1L << (ATTRIBUTES - 64)) | (1L << (BINDINGS - 64)) | (1L << (BREAK - 64)) | (1L << (BY - 64)) | (1L << (CASE - 64)) | (1L << (CATCH - 64)) | (1L << (CATEGORY - 64)) | (1L << (CLASS - 64)) | (1L << (CONTAINS - 64)) | (1L << (DEF - 64)) | (1L << (DEFAULT - 64)) | (1L << (DEFINE - 64)) | (1L << (DELETE - 64)) | (1L << (DESC - 64)) | (1L << (DO - 64)) | (1L << (DOING - 64)) | (1L << (EACH - 64)) | (1L << (ELSE - 64)) | (1L << (ENUM - 64)) | (1L << (ENUMERATED - 64)) | (1L << (EXCEPT - 64)) | (1L << (EXECUTE - 64)) | (1L << (EXPECTING - 64)) | (1L << (EXTENDS - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (FINALLY - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (FROM - 64)) | (1L << (GETTER - 64)) | (1L << (HAS - 64)) | (1L << (IF - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (IS - 64)) | (1L << (MATCHING - 64)) | (1L << (METHOD - 64)) | (1L << (METHODS - 64)) | (1L << (MODULO - 64)) | (1L << (MUTABLE - 64)) | (1L << (NATIVE - 64)) | (1L << (NONE - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (ON - 128)) | (1L << (ONE - 128)) | (1L << (OPERATOR - 128)) | (1L << (OR - 128)) | (1L << (ORDER - 128)) | (1L << (OTHERWISE - 128)) | (1L << (PASS - 128)) | (1L << (RAISE - 128)) | (1L << (READ - 128)) | (1L << (RECEIVING - 128)) | (1L << (RESOURCE - 128)) | (1L << (RETURN - 128)) | (1L << (RETURNING - 128)) | (1L << (ROWS - 128)) | (1L << (SELF - 128)) | (1L << (SETTER - 128)) | (1L << (SINGLETON - 128)) | (1L << (SORTED - 128)) | (1L << (STORABLE - 128)) | (1L << (STORE - 128)) | (1L << (SUPER - 128)) | (1L << (SWITCH - 128)) | (1L << (TEST - 128)) | (1L << (THIS - 128)) | (1L << (THROW - 128)) | (1L << (TO - 128)) | (1L << (TRY - 128)) | (1L << (VERIFYING - 128)) | (1L << (WIDGET - 128)) | (1L << (WITH - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WHILE - 128)) | (1L << (WRITE - 128)) | (1L << (BOOLEAN_LITERAL - 128)) | (1L << (CHAR_LITERAL - 128)) | (1L << (SYMBOL_IDENTIFIER - 128)) | (1L << (TYPE_IDENTIFIER - 128)) | (1L << (VARIABLE_IDENTIFIER - 128)) | (1L << (DOLLAR_IDENTIFIER - 128)) | (1L << (TEXT_LITERAL - 128)) | (1L << (INTEGER_LITERAL - 128)) | (1L << (DECIMAL_LITERAL - 128)))) != 0)) {
				{
				setState(2716);
				((Csharp_method_expressionContext)_localctx).args = csharp_arguments(0);
				}
			}

			setState(2719);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCSharpArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCSharpArgumentList(this);
		}
	}
	public static class CSharpArgumentListItemContext extends Csharp_argumentsContext {
		public Csharp_argumentsContext items;
		public Csharp_expressionContext item;
		public TerminalNode COMMA() { return getToken(OParser.COMMA, 0); }
		public Csharp_argumentsContext csharp_arguments() {
			return getRuleContext(Csharp_argumentsContext.class,0);
		}
		public Csharp_expressionContext csharp_expression() {
			return getRuleContext(Csharp_expressionContext.class,0);
		}
		public CSharpArgumentListItemContext(Csharp_argumentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCSharpArgumentListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCSharpArgumentListItem(this);
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
		int _startState = 470;
		enterRecursionRule(_localctx, 470, RULE_csharp_arguments, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new CSharpArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2722);
			((CSharpArgumentListContext)_localctx).item = csharp_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2729);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,254,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CSharpArgumentListItemContext(new Csharp_argumentsContext(_parentctx, _parentState));
					((CSharpArgumentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_csharp_arguments);
					setState(2724);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2725);
					match(COMMA);
					setState(2726);
					((CSharpArgumentListItemContext)_localctx).item = csharp_expression(0);
					}
					} 
				}
				setState(2731);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,254,_ctx);
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
		public TerminalNode LBRAK() { return getToken(OParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(OParser.RBRAK, 0); }
		public Csharp_expressionContext csharp_expression() {
			return getRuleContext(Csharp_expressionContext.class,0);
		}
		public Csharp_item_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csharp_item_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCsharp_item_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCsharp_item_expression(this);
		}
	}

	public final Csharp_item_expressionContext csharp_item_expression() throws RecognitionException {
		Csharp_item_expressionContext _localctx = new Csharp_item_expressionContext(_ctx, getState());
		enterRule(_localctx, 472, RULE_csharp_item_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2732);
			match(LBRAK);
			setState(2733);
			((Csharp_item_expressionContext)_localctx).exp = csharp_expression(0);
			setState(2734);
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
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public Csharp_expressionContext csharp_expression() {
			return getRuleContext(Csharp_expressionContext.class,0);
		}
		public Csharp_parenthesis_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csharp_parenthesis_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCsharp_parenthesis_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCsharp_parenthesis_expression(this);
		}
	}

	public final Csharp_parenthesis_expressionContext csharp_parenthesis_expression() throws RecognitionException {
		Csharp_parenthesis_expressionContext _localctx = new Csharp_parenthesis_expressionContext(_ctx, getState());
		enterRule(_localctx, 474, RULE_csharp_parenthesis_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2736);
			match(LPAR);
			setState(2737);
			((Csharp_parenthesis_expressionContext)_localctx).exp = csharp_expression(0);
			setState(2738);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCSharpIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCSharpIdentifier(this);
		}
	}
	public static class CSharpChildIdentifierContext extends Csharp_identifier_expressionContext {
		public Csharp_identifier_expressionContext parent;
		public Csharp_identifierContext name;
		public TerminalNode DOT() { return getToken(OParser.DOT, 0); }
		public Csharp_identifier_expressionContext csharp_identifier_expression() {
			return getRuleContext(Csharp_identifier_expressionContext.class,0);
		}
		public Csharp_identifierContext csharp_identifier() {
			return getRuleContext(Csharp_identifierContext.class,0);
		}
		public CSharpChildIdentifierContext(Csharp_identifier_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCSharpChildIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCSharpChildIdentifier(this);
		}
	}
	public static class CSharpPromptoIdentifierContext extends Csharp_identifier_expressionContext {
		public TerminalNode DOLLAR_IDENTIFIER() { return getToken(OParser.DOLLAR_IDENTIFIER, 0); }
		public CSharpPromptoIdentifierContext(Csharp_identifier_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCSharpPromptoIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCSharpPromptoIdentifier(this);
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
		int _startState = 476;
		enterRecursionRule(_localctx, 476, RULE_csharp_identifier_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2743);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
			case 1:
				{
				_localctx = new CSharpPromptoIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2741);
				match(DOLLAR_IDENTIFIER);
				}
				break;
			case 2:
				{
				_localctx = new CSharpIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2742);
				((CSharpIdentifierContext)_localctx).name = csharp_identifier();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2750);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,256,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CSharpChildIdentifierContext(new Csharp_identifier_expressionContext(_parentctx, _parentState));
					((CSharpChildIdentifierContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_csharp_identifier_expression);
					setState(2745);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2746);
					match(DOT);
					setState(2747);
					((CSharpChildIdentifierContext)_localctx).name = csharp_identifier();
					}
					} 
				}
				setState(2752);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,256,_ctx);
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
		public TerminalNode BOOLEAN_LITERAL() { return getToken(OParser.BOOLEAN_LITERAL, 0); }
		public CSharpBooleanLiteralContext(Csharp_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCSharpBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCSharpBooleanLiteral(this);
		}
	}
	public static class CSharpIntegerLiteralContext extends Csharp_literal_expressionContext {
		public TerminalNode INTEGER_LITERAL() { return getToken(OParser.INTEGER_LITERAL, 0); }
		public CSharpIntegerLiteralContext(Csharp_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCSharpIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCSharpIntegerLiteral(this);
		}
	}
	public static class CSharpDecimalLiteralContext extends Csharp_literal_expressionContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(OParser.DECIMAL_LITERAL, 0); }
		public CSharpDecimalLiteralContext(Csharp_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCSharpDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCSharpDecimalLiteral(this);
		}
	}
	public static class CSharpCharacterLiteralContext extends Csharp_literal_expressionContext {
		public TerminalNode CHAR_LITERAL() { return getToken(OParser.CHAR_LITERAL, 0); }
		public CSharpCharacterLiteralContext(Csharp_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCSharpCharacterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCSharpCharacterLiteral(this);
		}
	}
	public static class CSharpTextLiteralContext extends Csharp_literal_expressionContext {
		public TerminalNode TEXT_LITERAL() { return getToken(OParser.TEXT_LITERAL, 0); }
		public CSharpTextLiteralContext(Csharp_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCSharpTextLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCSharpTextLiteral(this);
		}
	}

	public final Csharp_literal_expressionContext csharp_literal_expression() throws RecognitionException {
		Csharp_literal_expressionContext _localctx = new Csharp_literal_expressionContext(_ctx, getState());
		enterRule(_localctx, 478, RULE_csharp_literal_expression);
		try {
			setState(2758);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				_localctx = new CSharpIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2753);
				match(INTEGER_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				_localctx = new CSharpDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2754);
				match(DECIMAL_LITERAL);
				}
				break;
			case TEXT_LITERAL:
				_localctx = new CSharpTextLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2755);
				match(TEXT_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new CSharpBooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2756);
				match(BOOLEAN_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new CSharpCharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2757);
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
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(OParser.VARIABLE_IDENTIFIER, 0); }
		public TerminalNode SYMBOL_IDENTIFIER() { return getToken(OParser.SYMBOL_IDENTIFIER, 0); }
		public TerminalNode DOLLAR_IDENTIFIER() { return getToken(OParser.DOLLAR_IDENTIFIER, 0); }
		public TerminalNode TYPE_IDENTIFIER() { return getToken(OParser.TYPE_IDENTIFIER, 0); }
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public Csharp_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csharp_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCsharp_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCsharp_identifier(this);
		}
	}

	public final Csharp_identifierContext csharp_identifier() throws RecognitionException {
		Csharp_identifierContext _localctx = new Csharp_identifierContext(_ctx, getState());
		enterRule(_localctx, 480, RULE_csharp_identifier);
		try {
			setState(2765);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2760);
				match(VARIABLE_IDENTIFIER);
				}
				break;
			case SYMBOL_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2761);
				match(SYMBOL_IDENTIFIER);
				}
				break;
			case DOLLAR_IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(2762);
				match(DOLLAR_IDENTIFIER);
				}
				break;
			case TYPE_IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(2763);
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
			case DBID:
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
				setState(2764);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJsx_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJsx_expression(this);
		}
	}

	public final Jsx_expressionContext jsx_expression() throws RecognitionException {
		Jsx_expressionContext _localctx = new Jsx_expressionContext(_ctx, getState());
		enterRule(_localctx, 482, RULE_jsx_expression);
		try {
			setState(2769);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2767);
				jsx_element();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2768);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJsxSelfClosing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJsxSelfClosing(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJsxElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJsxElement(this);
		}
	}

	public final Jsx_elementContext jsx_element() throws RecognitionException {
		Jsx_elementContext _localctx = new Jsx_elementContext(_ctx, getState());
		enterRule(_localctx, 484, RULE_jsx_element);
		try {
			setState(2778);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
			case 1:
				_localctx = new JsxSelfClosingContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2771);
				((JsxSelfClosingContext)_localctx).jsx = jsx_self_closing();
				}
				break;
			case 2:
				_localctx = new JsxElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2772);
				((JsxElementContext)_localctx).opening = jsx_opening();
				setState(2774);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,260,_ctx) ) {
				case 1:
					{
					setState(2773);
					((JsxElementContext)_localctx).children_ = jsx_children();
					}
					break;
				}
				setState(2776);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJsx_fragment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJsx_fragment(this);
		}
	}

	public final Jsx_fragmentContext jsx_fragment() throws RecognitionException {
		Jsx_fragmentContext _localctx = new Jsx_fragmentContext(_ctx, getState());
		enterRule(_localctx, 486, RULE_jsx_fragment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2780);
			jsx_fragment_start();
			setState(2781);
			ws_plus();
			setState(2783);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
			case 1:
				{
				setState(2782);
				((Jsx_fragmentContext)_localctx).children_ = jsx_children();
				}
				break;
			}
			setState(2785);
			ws_plus();
			setState(2786);
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
		public TerminalNode LT() { return getToken(OParser.LT, 0); }
		public TerminalNode GT() { return getToken(OParser.GT, 0); }
		public TerminalNode LTGT() { return getToken(OParser.LTGT, 0); }
		public Jsx_fragment_startContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsx_fragment_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJsx_fragment_start(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJsx_fragment_start(this);
		}
	}

	public final Jsx_fragment_startContext jsx_fragment_start() throws RecognitionException {
		Jsx_fragment_startContext _localctx = new Jsx_fragment_startContext(_ctx, getState());
		enterRule(_localctx, 488, RULE_jsx_fragment_start);
		try {
			setState(2791);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2788);
				match(LT);
				setState(2789);
				match(GT);
				}
				break;
			case LTGT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2790);
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
		public TerminalNode LT() { return getToken(OParser.LT, 0); }
		public TerminalNode SLASH() { return getToken(OParser.SLASH, 0); }
		public TerminalNode GT() { return getToken(OParser.GT, 0); }
		public Jsx_fragment_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsx_fragment_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJsx_fragment_end(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJsx_fragment_end(this);
		}
	}

	public final Jsx_fragment_endContext jsx_fragment_end() throws RecognitionException {
		Jsx_fragment_endContext _localctx = new Jsx_fragment_endContext(_ctx, getState());
		enterRule(_localctx, 490, RULE_jsx_fragment_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2793);
			match(LT);
			setState(2794);
			match(SLASH);
			setState(2795);
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
		public TerminalNode LT() { return getToken(OParser.LT, 0); }
		public Ws_plusContext ws_plus() {
			return getRuleContext(Ws_plusContext.class,0);
		}
		public TerminalNode SLASH() { return getToken(OParser.SLASH, 0); }
		public TerminalNode GT() { return getToken(OParser.GT, 0); }
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJsx_self_closing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJsx_self_closing(this);
		}
	}

	public final Jsx_self_closingContext jsx_self_closing() throws RecognitionException {
		Jsx_self_closingContext _localctx = new Jsx_self_closingContext(_ctx, getState());
		enterRule(_localctx, 492, RULE_jsx_self_closing);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2797);
			match(LT);
			setState(2798);
			((Jsx_self_closingContext)_localctx).name = jsx_element_name();
			setState(2799);
			ws_plus();
			setState(2803);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA) | (1L << CSHARP) | (1L << PYTHON2) | (1L << PYTHON3) | (1L << JAVASCRIPT) | (1L << SWIFT) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (ABSTRACT - 64)) | (1L << (ALL - 64)) | (1L << (ALWAYS - 64)) | (1L << (AND - 64)) | (1L << (ANY - 64)) | (1L << (AS - 64)) | (1L << (ASC - 64)) | (1L << (ATTR - 64)) | (1L << (ATTRIBUTE - 64)) | (1L << (ATTRIBUTES - 64)) | (1L << (BINDINGS - 64)) | (1L << (BREAK - 64)) | (1L << (BY - 64)) | (1L << (CASE - 64)) | (1L << (CATCH - 64)) | (1L << (CATEGORY - 64)) | (1L << (CLASS - 64)) | (1L << (CONTAINS - 64)) | (1L << (DEF - 64)) | (1L << (DEFAULT - 64)) | (1L << (DEFINE - 64)) | (1L << (DELETE - 64)) | (1L << (DESC - 64)) | (1L << (DO - 64)) | (1L << (DOING - 64)) | (1L << (EACH - 64)) | (1L << (ELSE - 64)) | (1L << (ENUM - 64)) | (1L << (ENUMERATED - 64)) | (1L << (EXCEPT - 64)) | (1L << (EXECUTE - 64)) | (1L << (EXPECTING - 64)) | (1L << (EXTENDS - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (FINALLY - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (FROM - 64)) | (1L << (GETTER - 64)) | (1L << (HAS - 64)) | (1L << (IF - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (IS - 64)) | (1L << (MATCHING - 64)) | (1L << (METHOD - 64)) | (1L << (METHODS - 64)) | (1L << (MODULO - 64)) | (1L << (MUTABLE - 64)) | (1L << (NATIVE - 64)) | (1L << (NONE - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (ON - 128)) | (1L << (ONE - 128)) | (1L << (OPERATOR - 128)) | (1L << (OR - 128)) | (1L << (ORDER - 128)) | (1L << (OTHERWISE - 128)) | (1L << (PASS - 128)) | (1L << (RAISE - 128)) | (1L << (READ - 128)) | (1L << (RECEIVING - 128)) | (1L << (RESOURCE - 128)) | (1L << (RETURN - 128)) | (1L << (RETURNING - 128)) | (1L << (ROWS - 128)) | (1L << (SELF - 128)) | (1L << (SETTER - 128)) | (1L << (SINGLETON - 128)) | (1L << (SORTED - 128)) | (1L << (STORABLE - 128)) | (1L << (STORE - 128)) | (1L << (SUPER - 128)) | (1L << (SWITCH - 128)) | (1L << (TEST - 128)) | (1L << (THIS - 128)) | (1L << (THROW - 128)) | (1L << (TO - 128)) | (1L << (TRY - 128)) | (1L << (VERIFYING - 128)) | (1L << (WIDGET - 128)) | (1L << (WITH - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WHILE - 128)) | (1L << (WRITE - 128)) | (1L << (SYMBOL_IDENTIFIER - 128)) | (1L << (TYPE_IDENTIFIER - 128)) | (1L << (VARIABLE_IDENTIFIER - 128)))) != 0)) {
				{
				{
				setState(2800);
				((Jsx_self_closingContext)_localctx).attributes = jsx_attribute();
				}
				}
				setState(2805);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2806);
			match(SLASH);
			setState(2807);
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
		public TerminalNode LT() { return getToken(OParser.LT, 0); }
		public Ws_plusContext ws_plus() {
			return getRuleContext(Ws_plusContext.class,0);
		}
		public TerminalNode GT() { return getToken(OParser.GT, 0); }
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJsx_opening(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJsx_opening(this);
		}
	}

	public final Jsx_openingContext jsx_opening() throws RecognitionException {
		Jsx_openingContext _localctx = new Jsx_openingContext(_ctx, getState());
		enterRule(_localctx, 494, RULE_jsx_opening);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2809);
			match(LT);
			setState(2810);
			((Jsx_openingContext)_localctx).name = jsx_element_name();
			setState(2811);
			ws_plus();
			setState(2815);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA) | (1L << CSHARP) | (1L << PYTHON2) | (1L << PYTHON3) | (1L << JAVASCRIPT) | (1L << SWIFT) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (ABSTRACT - 64)) | (1L << (ALL - 64)) | (1L << (ALWAYS - 64)) | (1L << (AND - 64)) | (1L << (ANY - 64)) | (1L << (AS - 64)) | (1L << (ASC - 64)) | (1L << (ATTR - 64)) | (1L << (ATTRIBUTE - 64)) | (1L << (ATTRIBUTES - 64)) | (1L << (BINDINGS - 64)) | (1L << (BREAK - 64)) | (1L << (BY - 64)) | (1L << (CASE - 64)) | (1L << (CATCH - 64)) | (1L << (CATEGORY - 64)) | (1L << (CLASS - 64)) | (1L << (CONTAINS - 64)) | (1L << (DEF - 64)) | (1L << (DEFAULT - 64)) | (1L << (DEFINE - 64)) | (1L << (DELETE - 64)) | (1L << (DESC - 64)) | (1L << (DO - 64)) | (1L << (DOING - 64)) | (1L << (EACH - 64)) | (1L << (ELSE - 64)) | (1L << (ENUM - 64)) | (1L << (ENUMERATED - 64)) | (1L << (EXCEPT - 64)) | (1L << (EXECUTE - 64)) | (1L << (EXPECTING - 64)) | (1L << (EXTENDS - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (FINALLY - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (FROM - 64)) | (1L << (GETTER - 64)) | (1L << (HAS - 64)) | (1L << (IF - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (IS - 64)) | (1L << (MATCHING - 64)) | (1L << (METHOD - 64)) | (1L << (METHODS - 64)) | (1L << (MODULO - 64)) | (1L << (MUTABLE - 64)) | (1L << (NATIVE - 64)) | (1L << (NONE - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (ON - 128)) | (1L << (ONE - 128)) | (1L << (OPERATOR - 128)) | (1L << (OR - 128)) | (1L << (ORDER - 128)) | (1L << (OTHERWISE - 128)) | (1L << (PASS - 128)) | (1L << (RAISE - 128)) | (1L << (READ - 128)) | (1L << (RECEIVING - 128)) | (1L << (RESOURCE - 128)) | (1L << (RETURN - 128)) | (1L << (RETURNING - 128)) | (1L << (ROWS - 128)) | (1L << (SELF - 128)) | (1L << (SETTER - 128)) | (1L << (SINGLETON - 128)) | (1L << (SORTED - 128)) | (1L << (STORABLE - 128)) | (1L << (STORE - 128)) | (1L << (SUPER - 128)) | (1L << (SWITCH - 128)) | (1L << (TEST - 128)) | (1L << (THIS - 128)) | (1L << (THROW - 128)) | (1L << (TO - 128)) | (1L << (TRY - 128)) | (1L << (VERIFYING - 128)) | (1L << (WIDGET - 128)) | (1L << (WITH - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WHILE - 128)) | (1L << (WRITE - 128)) | (1L << (SYMBOL_IDENTIFIER - 128)) | (1L << (TYPE_IDENTIFIER - 128)) | (1L << (VARIABLE_IDENTIFIER - 128)))) != 0)) {
				{
				{
				setState(2812);
				((Jsx_openingContext)_localctx).attributes = jsx_attribute();
				}
				}
				setState(2817);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2818);
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
		public TerminalNode LT() { return getToken(OParser.LT, 0); }
		public TerminalNode SLASH() { return getToken(OParser.SLASH, 0); }
		public TerminalNode GT() { return getToken(OParser.GT, 0); }
		public Jsx_element_nameContext jsx_element_name() {
			return getRuleContext(Jsx_element_nameContext.class,0);
		}
		public Jsx_closingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsx_closing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJsx_closing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJsx_closing(this);
		}
	}

	public final Jsx_closingContext jsx_closing() throws RecognitionException {
		Jsx_closingContext _localctx = new Jsx_closingContext(_ctx, getState());
		enterRule(_localctx, 496, RULE_jsx_closing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2820);
			match(LT);
			setState(2821);
			match(SLASH);
			setState(2822);
			((Jsx_closingContext)_localctx).name = jsx_element_name();
			setState(2823);
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
		public List<TerminalNode> DOT() { return getTokens(OParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(OParser.DOT, i);
		}
		public Jsx_element_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsx_element_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJsx_element_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJsx_element_name(this);
		}
	}

	public final Jsx_element_nameContext jsx_element_name() throws RecognitionException {
		Jsx_element_nameContext _localctx = new Jsx_element_nameContext(_ctx, getState());
		enterRule(_localctx, 498, RULE_jsx_element_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2825);
			jsx_identifier();
			setState(2830);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(2826);
				match(DOT);
				setState(2827);
				jsx_identifier();
				}
				}
				setState(2832);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJsx_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJsx_identifier(this);
		}
	}

	public final Jsx_identifierContext jsx_identifier() throws RecognitionException {
		Jsx_identifierContext _localctx = new Jsx_identifierContext(_ctx, getState());
		enterRule(_localctx, 500, RULE_jsx_identifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2833);
			identifier_or_keyword();
			setState(2837);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,267,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2834);
					nospace_hyphen_identifier_or_keyword();
					}
					} 
				}
				setState(2839);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,267,_ctx);
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
		public TerminalNode EQ() { return getToken(OParser.EQ, 0); }
		public Jsx_attribute_valueContext jsx_attribute_value() {
			return getRuleContext(Jsx_attribute_valueContext.class,0);
		}
		public Jsx_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsx_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJsx_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJsx_attribute(this);
		}
	}

	public final Jsx_attributeContext jsx_attribute() throws RecognitionException {
		Jsx_attributeContext _localctx = new Jsx_attributeContext(_ctx, getState());
		enterRule(_localctx, 502, RULE_jsx_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2840);
			((Jsx_attributeContext)_localctx).name = jsx_identifier();
			setState(2843);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(2841);
				match(EQ);
				setState(2842);
				((Jsx_attributeContext)_localctx).value = jsx_attribute_value();
				}
			}

			setState(2845);
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
		public TerminalNode LCURL() { return getToken(OParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(OParser.RCURL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public JsxValueContext(Jsx_attribute_valueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJsxValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJsxValue(this);
		}
	}
	public static class JsxLiteralContext extends Jsx_attribute_valueContext {
		public TerminalNode TEXT_LITERAL() { return getToken(OParser.TEXT_LITERAL, 0); }
		public JsxLiteralContext(Jsx_attribute_valueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJsxLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJsxLiteral(this);
		}
	}

	public final Jsx_attribute_valueContext jsx_attribute_value() throws RecognitionException {
		Jsx_attribute_valueContext _localctx = new Jsx_attribute_valueContext(_ctx, getState());
		enterRule(_localctx, 504, RULE_jsx_attribute_value);
		try {
			setState(2852);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT_LITERAL:
				_localctx = new JsxLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2847);
				match(TEXT_LITERAL);
				}
				break;
			case LCURL:
				_localctx = new JsxValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2848);
				match(LCURL);
				setState(2849);
				((JsxValueContext)_localctx).exp = expression(0);
				setState(2850);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJsx_children(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJsx_children(this);
		}
	}

	public final Jsx_childrenContext jsx_children() throws RecognitionException {
		Jsx_childrenContext _localctx = new Jsx_childrenContext(_ctx, getState());
		enterRule(_localctx, 506, RULE_jsx_children);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2855); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2854);
					jsx_child();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2857); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,270,_ctx);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJsxText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJsxText(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJsxChild(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJsxChild(this);
		}
	}
	public static class JsxCodeContext extends Jsx_childContext {
		public ExpressionContext exp;
		public TerminalNode LCURL() { return getToken(OParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(OParser.RCURL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public JsxCodeContext(Jsx_childContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJsxCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJsxCode(this);
		}
	}

	public final Jsx_childContext jsx_child() throws RecognitionException {
		Jsx_childContext _localctx = new Jsx_childContext(_ctx, getState());
		enterRule(_localctx, 508, RULE_jsx_child);
		int _la;
		try {
			setState(2866);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SPACE:
			case WS:
			case LF:
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
			case DBID:
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
			case INCLUDE:
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
			case VERSION_LITERAL:
			case INTEGER_LITERAL:
			case HEXA_LITERAL:
			case DECIMAL_LITERAL:
			case DATETIME_LITERAL:
			case TIME_LITERAL:
			case DATE_LITERAL:
			case PERIOD_LITERAL:
			case JSX_TEXT:
				_localctx = new JsxTextContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2859);
				((JsxTextContext)_localctx).text = jsx_text();
				}
				break;
			case LT:
				_localctx = new JsxChildContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2860);
				((JsxChildContext)_localctx).jsx = jsx_element();
				}
				break;
			case LCURL:
				_localctx = new JsxCodeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2861);
				match(LCURL);
				setState(2863);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << XMARK) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << LTCOLONGT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (TYPE - 64)) | (1L << (ANY - 64)) | (1L << (CATEGORY - 64)) | (1L << (EXECUTE - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (MUTABLE - 64)) | (1L << (NULL - 64)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (READ - 136)) | (1L << (RESOURCE - 136)) | (1L << (SELF - 136)) | (1L << (SORTED - 136)) | (1L << (SUPER - 136)) | (1L << (THIS - 136)) | (1L << (BOOLEAN_LITERAL - 136)) | (1L << (CHAR_LITERAL - 136)) | (1L << (MIN_INTEGER - 136)) | (1L << (MAX_INTEGER - 136)) | (1L << (SYMBOL_IDENTIFIER - 136)) | (1L << (TYPE_IDENTIFIER - 136)) | (1L << (VARIABLE_IDENTIFIER - 136)) | (1L << (TEXT_LITERAL - 136)) | (1L << (UUID_LITERAL - 136)) | (1L << (VERSION_LITERAL - 136)) | (1L << (INTEGER_LITERAL - 136)) | (1L << (HEXA_LITERAL - 136)) | (1L << (DECIMAL_LITERAL - 136)) | (1L << (DATETIME_LITERAL - 136)) | (1L << (TIME_LITERAL - 136)) | (1L << (DATE_LITERAL - 136)) | (1L << (PERIOD_LITERAL - 136)))) != 0)) {
					{
					setState(2862);
					((JsxCodeContext)_localctx).exp = expression(0);
					}
				}

				setState(2865);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJsx_text(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJsx_text(this);
		}
	}

	public final Jsx_textContext jsx_text() throws RecognitionException {
		Jsx_textContext _localctx = new Jsx_textContext(_ctx, getState());
		enterRule(_localctx, 510, RULE_jsx_text);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2869); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2868);
					jsx_char();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2871); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,273,_ctx);
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
		public TerminalNode LCURL() { return getToken(OParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(OParser.RCURL, 0); }
		public TerminalNode LT() { return getToken(OParser.LT, 0); }
		public TerminalNode GT() { return getToken(OParser.GT, 0); }
		public TerminalNode JSX_TEXT() { return getToken(OParser.JSX_TEXT, 0); }
		public Jsx_charContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsx_char; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJsx_char(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJsx_char(this);
		}
	}

	public final Jsx_charContext jsx_char() throws RecognitionException {
		Jsx_charContext _localctx = new Jsx_charContext(_ctx, getState());
		enterRule(_localctx, 512, RULE_jsx_char);
		int _la;
		try {
			setState(2875);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2873);
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
				setState(2874);
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
		public TerminalNode LCURL() { return getToken(OParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(OParser.RCURL, 0); }
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCss_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCss_expression(this);
		}
	}

	public final Css_expressionContext css_expression() throws RecognitionException {
		Css_expressionContext _localctx = new Css_expressionContext(_ctx, getState());
		enterRule(_localctx, 514, RULE_css_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2877);
			match(LCURL);
			setState(2879); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2878);
				((Css_expressionContext)_localctx).field = css_field();
				}
				}
				setState(2881); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA) | (1L << CSHARP) | (1L << PYTHON2) | (1L << PYTHON3) | (1L << JAVASCRIPT) | (1L << SWIFT) | (1L << MINUS) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (ABSTRACT - 64)) | (1L << (ALL - 64)) | (1L << (ALWAYS - 64)) | (1L << (AND - 64)) | (1L << (ANY - 64)) | (1L << (AS - 64)) | (1L << (ASC - 64)) | (1L << (ATTR - 64)) | (1L << (ATTRIBUTE - 64)) | (1L << (ATTRIBUTES - 64)) | (1L << (BINDINGS - 64)) | (1L << (BREAK - 64)) | (1L << (BY - 64)) | (1L << (CASE - 64)) | (1L << (CATCH - 64)) | (1L << (CATEGORY - 64)) | (1L << (CLASS - 64)) | (1L << (CONTAINS - 64)) | (1L << (DEF - 64)) | (1L << (DEFAULT - 64)) | (1L << (DEFINE - 64)) | (1L << (DELETE - 64)) | (1L << (DESC - 64)) | (1L << (DO - 64)) | (1L << (DOING - 64)) | (1L << (EACH - 64)) | (1L << (ELSE - 64)) | (1L << (ENUM - 64)) | (1L << (ENUMERATED - 64)) | (1L << (EXCEPT - 64)) | (1L << (EXECUTE - 64)) | (1L << (EXPECTING - 64)) | (1L << (EXTENDS - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (FINALLY - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (FROM - 64)) | (1L << (GETTER - 64)) | (1L << (HAS - 64)) | (1L << (IF - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (IS - 64)) | (1L << (MATCHING - 64)) | (1L << (METHOD - 64)) | (1L << (METHODS - 64)) | (1L << (MODULO - 64)) | (1L << (MUTABLE - 64)) | (1L << (NATIVE - 64)) | (1L << (NONE - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (ON - 128)) | (1L << (ONE - 128)) | (1L << (OPERATOR - 128)) | (1L << (OR - 128)) | (1L << (ORDER - 128)) | (1L << (OTHERWISE - 128)) | (1L << (PASS - 128)) | (1L << (RAISE - 128)) | (1L << (READ - 128)) | (1L << (RECEIVING - 128)) | (1L << (RESOURCE - 128)) | (1L << (RETURN - 128)) | (1L << (RETURNING - 128)) | (1L << (ROWS - 128)) | (1L << (SELF - 128)) | (1L << (SETTER - 128)) | (1L << (SINGLETON - 128)) | (1L << (SORTED - 128)) | (1L << (STORABLE - 128)) | (1L << (STORE - 128)) | (1L << (SUPER - 128)) | (1L << (SWITCH - 128)) | (1L << (TEST - 128)) | (1L << (THIS - 128)) | (1L << (THROW - 128)) | (1L << (TO - 128)) | (1L << (TRY - 128)) | (1L << (VERIFYING - 128)) | (1L << (WIDGET - 128)) | (1L << (WITH - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WHILE - 128)) | (1L << (WRITE - 128)) | (1L << (SYMBOL_IDENTIFIER - 128)) | (1L << (TYPE_IDENTIFIER - 128)) | (1L << (VARIABLE_IDENTIFIER - 128)))) != 0) );
			setState(2883);
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
		public Css_valueContext values;
		public TerminalNode COLON() { return getToken(OParser.COLON, 0); }
		public TerminalNode SEMI() { return getToken(OParser.SEMI, 0); }
		public Css_identifierContext css_identifier() {
			return getRuleContext(Css_identifierContext.class,0);
		}
		public List<Css_valueContext> css_value() {
			return getRuleContexts(Css_valueContext.class);
		}
		public Css_valueContext css_value(int i) {
			return getRuleContext(Css_valueContext.class,i);
		}
		public Css_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_css_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCss_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCss_field(this);
		}
	}

	public final Css_fieldContext css_field() throws RecognitionException {
		Css_fieldContext _localctx = new Css_fieldContext(_ctx, getState());
		enterRule(_localctx, 516, RULE_css_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2885);
			((Css_fieldContext)_localctx).name = css_identifier(0);
			setState(2886);
			match(COLON);
			setState(2888); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2887);
				((Css_fieldContext)_localctx).values = css_value();
				}
				}
				setState(2890); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << WS) | (1L << LF) | (1L << COMMENT) | (1L << JAVA) | (1L << CSHARP) | (1L << PYTHON2) | (1L << PYTHON3) | (1L << JAVASCRIPT) | (1L << SWIFT) | (1L << COLON) | (1L << COMMA) | (1L << RANGE) | (1L << DOT) | (1L << LPAR) | (1L << RPAR) | (1L << LBRAK) | (1L << RBRAK) | (1L << LCURL) | (1L << QMARK) | (1L << XMARK) | (1L << AMP) | (1L << AMP2) | (1L << PIPE) | (1L << PIPE2) | (1L << PLUS) | (1L << MINUS) | (1L << STAR) | (1L << SLASH) | (1L << BSLASH) | (1L << PERCENT) | (1L << SHARP) | (1L << GT) | (1L << GTE) | (1L << LT) | (1L << LTE) | (1L << LTGT) | (1L << LTCOLONGT) | (1L << EQ) | (1L << XEQ) | (1L << EQ2) | (1L << TEQ) | (1L << TILDE) | (1L << LARROW) | (1L << RARROW) | (1L << EGT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << METHOD_COLON) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (TYPE - 64)) | (1L << (ABSTRACT - 64)) | (1L << (ALL - 64)) | (1L << (ALWAYS - 64)) | (1L << (AND - 64)) | (1L << (ANY - 64)) | (1L << (AS - 64)) | (1L << (ASC - 64)) | (1L << (ATTR - 64)) | (1L << (ATTRIBUTE - 64)) | (1L << (ATTRIBUTES - 64)) | (1L << (BINDINGS - 64)) | (1L << (BREAK - 64)) | (1L << (BY - 64)) | (1L << (CASE - 64)) | (1L << (CATCH - 64)) | (1L << (CATEGORY - 64)) | (1L << (CLASS - 64)) | (1L << (CONTAINS - 64)) | (1L << (DEF - 64)) | (1L << (DEFAULT - 64)) | (1L << (DEFINE - 64)) | (1L << (DELETE - 64)) | (1L << (DESC - 64)) | (1L << (DO - 64)) | (1L << (DOING - 64)) | (1L << (EACH - 64)) | (1L << (ELSE - 64)) | (1L << (ENUM - 64)) | (1L << (ENUMERATED - 64)) | (1L << (EXCEPT - 64)) | (1L << (EXECUTE - 64)) | (1L << (EXPECTING - 64)) | (1L << (EXTENDS - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (FINALLY - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (FROM - 64)) | (1L << (GETTER - 64)) | (1L << (HAS - 64)) | (1L << (IF - 64)) | (1L << (IN - 64)) | (1L << (INCLUDE - 64)) | (1L << (INDEX - 64)) | (1L << (INVOKE_COLON - 64)) | (1L << (IS - 64)) | (1L << (MATCHING - 64)) | (1L << (METHOD - 64)) | (1L << (METHODS - 64)) | (1L << (MODULO - 64)) | (1L << (MUTABLE - 64)) | (1L << (NATIVE - 64)) | (1L << (NONE - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (ON - 128)) | (1L << (ONE - 128)) | (1L << (OPERATOR - 128)) | (1L << (OR - 128)) | (1L << (ORDER - 128)) | (1L << (OTHERWISE - 128)) | (1L << (PASS - 128)) | (1L << (RAISE - 128)) | (1L << (READ - 128)) | (1L << (RECEIVING - 128)) | (1L << (RESOURCE - 128)) | (1L << (RETURN - 128)) | (1L << (RETURNING - 128)) | (1L << (ROWS - 128)) | (1L << (SELF - 128)) | (1L << (SETTER - 128)) | (1L << (SINGLETON - 128)) | (1L << (SORTED - 128)) | (1L << (STORABLE - 128)) | (1L << (STORE - 128)) | (1L << (SUPER - 128)) | (1L << (SWITCH - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (THIS - 128)) | (1L << (THROW - 128)) | (1L << (TO - 128)) | (1L << (TRY - 128)) | (1L << (VERIFYING - 128)) | (1L << (WIDGET - 128)) | (1L << (WITH - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WHILE - 128)) | (1L << (WRITE - 128)) | (1L << (BOOLEAN_LITERAL - 128)) | (1L << (CHAR_LITERAL - 128)) | (1L << (MIN_INTEGER - 128)) | (1L << (MAX_INTEGER - 128)) | (1L << (SYMBOL_IDENTIFIER - 128)) | (1L << (TYPE_IDENTIFIER - 128)) | (1L << (VARIABLE_IDENTIFIER - 128)) | (1L << (NATIVE_IDENTIFIER - 128)) | (1L << (DOLLAR_IDENTIFIER - 128)) | (1L << (ARONDBASE_IDENTIFIER - 128)) | (1L << (TEXT_LITERAL - 128)) | (1L << (UUID_LITERAL - 128)) | (1L << (VERSION_LITERAL - 128)) | (1L << (INTEGER_LITERAL - 128)) | (1L << (HEXA_LITERAL - 128)) | (1L << (DECIMAL_LITERAL - 128)) | (1L << (DATETIME_LITERAL - 128)) | (1L << (TIME_LITERAL - 128)) | (1L << (DATE_LITERAL - 128)) | (1L << (PERIOD_LITERAL - 128)) | (1L << (JSX_TEXT - 128)))) != 0) );
			setState(2892);
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
		public TerminalNode MINUS() { return getToken(OParser.MINUS, 0); }
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCss_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCss_identifier(this);
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
		int _startState = 518;
		enterRecursionRule(_localctx, 518, RULE_css_identifier, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2898);
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
			case DBID:
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
				setState(2895);
				identifier_or_keyword();
				}
				break;
			case MINUS:
				{
				setState(2896);
				match(MINUS);
				setState(2897);
				nospace_identifier_or_keyword();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(2908);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,279,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Css_identifierContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_css_identifier);
					setState(2900);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2902); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(2901);
							nospace_hyphen_identifier_or_keyword();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(2904); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,278,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					} 
				}
				setState(2910);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,279,_ctx);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCssText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCssText(this);
		}
	}
	public static class CssValueContext extends Css_valueContext {
		public ExpressionContext exp;
		public TerminalNode LCURL() { return getToken(OParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(OParser.RCURL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CssValueContext(Css_valueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCssValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCssValue(this);
		}
	}

	public final Css_valueContext css_value() throws RecognitionException {
		Css_valueContext _localctx = new Css_valueContext(_ctx, getState());
		enterRule(_localctx, 520, RULE_css_value);
		try {
			setState(2916);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURL:
				_localctx = new CssValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2911);
				match(LCURL);
				setState(2912);
				((CssValueContext)_localctx).exp = expression(0);
				setState(2913);
				match(RCURL);
				}
				break;
			case SPACE:
			case WS:
			case LF:
			case COMMENT:
			case JAVA:
			case CSHARP:
			case PYTHON2:
			case PYTHON3:
			case JAVASCRIPT:
			case SWIFT:
			case COLON:
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
			case GT:
			case GTE:
			case LT:
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
			case DBID:
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
			case INCLUDE:
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
			case VERSION_LITERAL:
			case INTEGER_LITERAL:
			case HEXA_LITERAL:
			case DECIMAL_LITERAL:
			case DATETIME_LITERAL:
			case TIME_LITERAL:
			case DATE_LITERAL:
			case PERIOD_LITERAL:
			case JSX_TEXT:
				_localctx = new CssTextContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2915);
				((CssTextContext)_localctx).text = css_text();
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

	public static class Css_textContext extends ParserRuleContext {
		public List<TerminalNode> SEMI() { return getTokens(OParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(OParser.SEMI, i);
		}
		public List<TerminalNode> LCURL() { return getTokens(OParser.LCURL); }
		public TerminalNode LCURL(int i) {
			return getToken(OParser.LCURL, i);
		}
		public List<TerminalNode> RCURL() { return getTokens(OParser.RCURL); }
		public TerminalNode RCURL(int i) {
			return getToken(OParser.RCURL, i);
		}
		public Css_textContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_css_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCss_text(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCss_text(this);
		}
	}

	public final Css_textContext css_text() throws RecognitionException {
		Css_textContext _localctx = new Css_textContext(_ctx, getState());
		enterRule(_localctx, 522, RULE_css_text);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2919); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2918);
					_la = _input.LA(1);
					if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEMI) | (1L << LCURL) | (1L << RCURL))) != 0)) ) {
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
				setState(2921); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,281,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return derived_list_sempred((Derived_listContext)_localctx, predIndex);
		case 19:
			return native_category_binding_list_sempred((Native_category_binding_listContext)_localctx, predIndex);
		case 38:
			return else_if_statement_list_sempred((Else_if_statement_listContext)_localctx, predIndex);
		case 47:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 49:
			return an_expression_sempred((An_expressionContext)_localctx, predIndex);
		case 52:
			return instance_expression_sempred((Instance_expressionContext)_localctx, predIndex);
		case 53:
			return mutable_instance_expression_sempred((Mutable_instance_expressionContext)_localctx, predIndex);
		case 66:
			return copy_from_sempred((Copy_fromContext)_localctx, predIndex);
		case 67:
			return argument_assignment_list_sempred((Argument_assignment_listContext)_localctx, predIndex);
		case 94:
			return typedef_sempred((TypedefContext)_localctx, predIndex);
		case 105:
			return nospace_hyphen_identifier_or_keyword_sempred((Nospace_hyphen_identifier_or_keywordContext)_localctx, predIndex);
		case 106:
			return nospace_identifier_or_keyword_sempred((Nospace_identifier_or_keywordContext)_localctx, predIndex);
		case 119:
			return any_type_sempred((Any_typeContext)_localctx, predIndex);
		case 161:
			return assignable_instance_sempred((Assignable_instanceContext)_localctx, predIndex);
		case 162:
			return is_expression_sempred((Is_expressionContext)_localctx, predIndex);
		case 163:
			return metadata_sempred((MetadataContext)_localctx, predIndex);
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
		case 189:
			return javascript_expression_sempred((Javascript_expressionContext)_localctx, predIndex);
		case 195:
			return javascript_arguments_sempred((Javascript_argumentsContext)_localctx, predIndex);
		case 202:
			return python_expression_sempred((Python_expressionContext)_localctx, predIndex);
		case 208:
			return python_ordinal_argument_list_sempred((Python_ordinal_argument_listContext)_localctx, predIndex);
		case 209:
			return python_named_argument_list_sempred((Python_named_argument_listContext)_localctx, predIndex);
		case 211:
			return python_identifier_expression_sempred((Python_identifier_expressionContext)_localctx, predIndex);
		case 215:
			return java_expression_sempred((Java_expressionContext)_localctx, predIndex);
		case 221:
			return java_arguments_sempred((Java_argumentsContext)_localctx, predIndex);
		case 224:
			return java_identifier_expression_sempred((Java_identifier_expressionContext)_localctx, predIndex);
		case 225:
			return java_class_identifier_expression_sempred((Java_class_identifier_expressionContext)_localctx, predIndex);
		case 229:
			return csharp_expression_sempred((Csharp_expressionContext)_localctx, predIndex);
		case 235:
			return csharp_arguments_sempred((Csharp_argumentsContext)_localctx, predIndex);
		case 238:
			return csharp_identifier_expression_sempred((Csharp_identifier_expressionContext)_localctx, predIndex);
		case 259:
			return css_identifier_sempred((Css_identifierContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean derived_list_sempred(Derived_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean native_category_binding_list_sempred(Native_category_binding_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean else_if_statement_list_sempred(Else_if_statement_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 21);
		case 4:
			return precpred(_ctx, 20);
		case 5:
			return precpred(_ctx, 19);
		case 6:
			return precpred(_ctx, 18);
		case 7:
			return precpred(_ctx, 17);
		case 8:
			return precpred(_ctx, 16);
		case 9:
			return precpred(_ctx, 14);
		case 10:
			return precpred(_ctx, 13);
		case 11:
			return precpred(_ctx, 12);
		case 12:
			return precpred(_ctx, 11);
		case 13:
			return precpred(_ctx, 10);
		case 14:
			return precpred(_ctx, 7);
		case 15:
			return precpred(_ctx, 6);
		case 16:
			return precpred(_ctx, 5);
		case 17:
			return precpred(_ctx, 15);
		case 18:
			return precpred(_ctx, 9);
		case 19:
			return precpred(_ctx, 8);
		case 20:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean an_expression_sempred(An_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 21:
			return this.willBeAOrAn();
		}
		return true;
	}
	private boolean instance_expression_sempred(Instance_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 22:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean mutable_instance_expression_sempred(Mutable_instance_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 23:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean copy_from_sempred(Copy_fromContext _localctx, int predIndex) {
		switch (predIndex) {
		case 24:
			return this.willNotBe(this.equalToken());
		}
		return true;
	}
	private boolean argument_assignment_list_sempred(Argument_assignment_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 25:
			return this.willNotBe(this.equalToken());
		case 26:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean typedef_sempred(TypedefContext _localctx, int predIndex) {
		switch (predIndex) {
		case 27:
			return precpred(_ctx, 6);
		case 28:
			return precpred(_ctx, 5);
		case 29:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean nospace_hyphen_identifier_or_keyword_sempred(Nospace_hyphen_identifier_or_keywordContext _localctx, int predIndex) {
		switch (predIndex) {
		case 30:
			return this.wasNotWhiteSpace();
		}
		return true;
	}
	private boolean nospace_identifier_or_keyword_sempred(Nospace_identifier_or_keywordContext _localctx, int predIndex) {
		switch (predIndex) {
		case 31:
			return this.wasNotWhiteSpace();
		}
		return true;
	}
	private boolean any_type_sempred(Any_typeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 32:
			return precpred(_ctx, 2);
		case 33:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean assignable_instance_sempred(Assignable_instanceContext _localctx, int predIndex) {
		switch (predIndex) {
		case 34:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean is_expression_sempred(Is_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 35:
			return this.willBeAOrAn();
		}
		return true;
	}
	private boolean metadata_sempred(MetadataContext _localctx, int predIndex) {
		switch (predIndex) {
		case 36:
			return this.willBeText("metadata");
		}
		return true;
	}
	private boolean new_token_sempred(New_tokenContext _localctx, int predIndex) {
		switch (predIndex) {
		case 37:
			return this.isText(((New_tokenContext)_localctx).i1,"new");
		}
		return true;
	}
	private boolean key_token_sempred(Key_tokenContext _localctx, int predIndex) {
		switch (predIndex) {
		case 38:
			return this.isText(((Key_tokenContext)_localctx).i1,"key");
		}
		return true;
	}
	private boolean module_token_sempred(Module_tokenContext _localctx, int predIndex) {
		switch (predIndex) {
		case 39:
			return this.isText(((Module_tokenContext)_localctx).i1,"module");
		}
		return true;
	}
	private boolean value_token_sempred(Value_tokenContext _localctx, int predIndex) {
		switch (predIndex) {
		case 40:
			return this.isText(((Value_tokenContext)_localctx).i1,"value");
		}
		return true;
	}
	private boolean symbols_token_sempred(Symbols_tokenContext _localctx, int predIndex) {
		switch (predIndex) {
		case 41:
			return this.isText(((Symbols_tokenContext)_localctx).i1,"symbols");
		}
		return true;
	}
	private boolean javascript_expression_sempred(Javascript_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 42:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean javascript_arguments_sempred(Javascript_argumentsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 43:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean python_expression_sempred(Python_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 44:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean python_ordinal_argument_list_sempred(Python_ordinal_argument_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 45:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean python_named_argument_list_sempred(Python_named_argument_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 46:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean python_identifier_expression_sempred(Python_identifier_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 47:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean java_expression_sempred(Java_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 48:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean java_arguments_sempred(Java_argumentsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 49:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean java_identifier_expression_sempred(Java_identifier_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 50:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean java_class_identifier_expression_sempred(Java_class_identifier_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 51:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean csharp_expression_sempred(Csharp_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 52:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean csharp_arguments_sempred(Csharp_argumentsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 53:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean csharp_identifier_expression_sempred(Csharp_identifier_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 54:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean css_identifier_sempred(Css_identifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 55:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00b9\u0b6e\4\2\t"+
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
		"\t\u0103\4\u0104\t\u0104\4\u0105\t\u0105\4\u0106\t\u0106\4\u0107\t\u0107"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u0216\n\2\3\2\3\2\5\2\u021a\n\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\5\6\u0235\n\6\3\6\3\6\3\6\3\6\3\6\5\6\u023c\n"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0244\n\6\5\6\u0246\n\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\5\7\u024e\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\5\t"+
		"\u025b\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0263\n\t\3\t\3\t\5\t\u0267\n\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0271\n\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\7\13\u027b\n\13\f\13\16\13\u027e\13\13\3\f\3\f\3\f\5\f"+
		"\u0283\n\f\3\f\5\f\u0286\n\f\3\r\5\r\u0289\n\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\5\r\u0292\n\r\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u029a\n\16\3\16\3"+
		"\16\3\17\5\17\u029f\n\17\3\17\3\17\3\17\3\17\5\17\u02a5\n\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\5\20\u02ad\n\20\3\20\3\20\3\21\5\21\u02b2\n\21\3"+
		"\21\3\21\3\21\3\21\5\21\u02b8\n\21\3\21\3\21\3\22\5\22\u02bd\n\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u02c6\n\22\3\22\3\22\3\22\5\22\u02cb"+
		"\n\22\3\22\3\22\3\23\5\23\u02d0\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\5\23\u02d9\n\23\3\23\3\23\3\23\5\23\u02de\n\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u02f0"+
		"\n\25\f\25\16\25\u02f3\13\25\3\26\3\26\5\26\u02f7\n\26\3\26\5\26\u02fa"+
		"\n\26\3\26\3\26\3\26\3\26\5\26\u0300\n\26\3\26\3\26\3\26\3\27\5\27\u0306"+
		"\n\27\3\27\5\27\u0309\n\27\3\27\3\27\3\27\3\27\5\27\u030f\n\27\3\27\3"+
		"\27\3\27\5\27\u0314\n\27\3\27\3\27\3\30\5\30\u0319\n\30\3\30\5\30\u031c"+
		"\n\30\3\30\3\30\3\30\3\30\5\30\u0322\n\30\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\5\31\u0339\n\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\5\33\u0343"+
		"\n\33\3\33\3\33\3\33\5\33\u0348\n\33\3\34\3\34\3\34\3\34\3\34\5\34\u034f"+
		"\n\34\5\34\u0351\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0368\n\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\5\37\u0379\n\37\3\37\3\37\3\37\3\37\3\37\5\37\u0380\n\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\5\37\u0388\n\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\5\37\u0390\n\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\5\"\u03a7\n\"\5\"\u03a9\n\"\3\"\3\"\3#\3#\3#\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\5#\u03b8\n#\3$\3$\3$\3$\3$\3$\5$\u03c0\n$\3$\3$\3$"+
		"\3$\3$\3%\3%\3%\5%\u03ca\n%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\5\'\u03df\n\'\3\'\3\'\5\'\u03e3\n\'\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\7(\u03f5\n(\f(\16(\u03f8\13(\3)\3)"+
		"\3)\3)\3*\3*\3*\3*\3*\3*\5*\u0404\n*\3*\3*\5*\u0408\n*\3*\3*\3*\3*\3*"+
		"\3*\5*\u0410\n*\3*\5*\u0413\n*\3*\3*\3*\5*\u0418\n*\3*\5*\u041b\n*\3+"+
		"\3+\3+\3+\3+\3+\5+\u0423\n+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u042e\n+\3+"+
		"\3+\5+\u0432\n+\3,\3,\3,\3-\3-\5-\u0439\n-\3-\3-\3.\3.\3.\5.\u0440\n."+
		"\3.\3.\3/\3/\3/\5/\u0447\n/\3/\3/\3/\3/\5/\u044d\n/\3/\3/\3/\3/\3/\5/"+
		"\u0454\n/\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\5\61\u0464\n\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u0475\n\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u0490\n\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\5\61\u0498\n\61\3\61\3\61\3\61\3\61\5\61\u049e\n\61\3\61\3\61\3"+
		"\61\3\61\5\61\u04a4\n\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u04b7\n\61\3\61\3\61\3\61"+
		"\5\61\u04bc\n\61\3\61\3\61\3\61\3\61\3\61\5\61\u04c3\n\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\7\61\u04d1\n\61\f\61"+
		"\16\61\u04d4\13\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3"+
		"\62\3\62\3\62\3\62\5\62\u04e4\n\62\3\63\3\63\3\63\3\63\3\64\3\64\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\5\65\u04f2\n\65\3\66\3\66\3\66\3\66\3\66\7\66"+
		"\u04f9\n\66\f\66\16\66\u04fc\13\66\3\67\3\67\3\67\3\67\3\67\3\67\7\67"+
		"\u0504\n\67\f\67\16\67\u0507\13\67\38\38\38\38\38\38\38\38\38\38\58\u0513"+
		"\n8\39\39\39\39\39\3:\3:\3:\3:\3:\5:\u051f\n:\3:\3:\3;\3;\3;\3;\3;\3;"+
		"\3;\3;\5;\u052b\n;\3<\3<\3<\3<\3<\3<\3<\3<\3<\5<\u0536\n<\3<\3<\3<\3<"+
		"\3<\3=\3=\3=\3=\3=\3=\5=\u0543\n=\3=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u054e"+
		"\n=\3=\3=\3=\3=\3=\3=\5=\u0556\n=\3=\3=\3=\3=\5=\u055c\n=\3=\3=\3=\3="+
		"\3=\3=\3=\5=\u0565\n=\3=\3=\3=\3=\3=\5=\u056c\n=\3=\3=\3=\3=\3=\5=\u0573"+
		"\n=\3=\3=\3=\3=\3=\3=\5=\u057b\n=\5=\u057d\n=\3>\3>\3>\3>\3>\3>\5>\u0585"+
		"\n>\3>\3>\3>\3>\3>\3>\3>\3>\3>\5>\u0590\n>\3>\3>\3>\3>\3>\3>\3>\3>\5>"+
		"\u059a\n>\3>\3>\3>\3>\5>\u05a0\n>\3>\3>\3>\3>\3>\3>\3>\5>\u05a9\n>\3>"+
		"\3>\3>\3>\3>\5>\u05b0\n>\3>\3>\3>\3>\3>\5>\u05b7\n>\3>\3>\3>\3>\3>\3>"+
		"\5>\u05bf\n>\3>\5>\u05c2\n>\3?\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3A"+
		"\3A\5A\u05d3\nA\3A\3A\3A\3A\3A\3A\3A\5A\u05dc\nA\3A\3A\3B\3B\3B\3B\3B"+
		"\3B\3B\3B\3B\3B\3B\3B\5B\u05ec\nB\3C\3C\3C\3C\3C\5C\u05f3\nC\3C\3C\3C"+
		"\3C\3C\5C\u05fa\nC\3C\3C\5C\u05fe\nC\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E\5E"+
		"\u060a\nE\3E\3E\3E\7E\u060f\nE\fE\16E\u0612\13E\3F\3F\3F\3F\5F\u0618\n"+
		"F\3G\3G\3G\3G\3G\3H\3H\3H\3H\3H\3H\5H\u0625\nH\3I\3I\3I\3I\3I\3J\3J\3"+
		"K\3K\3L\7L\u0631\nL\fL\16L\u0634\13L\3M\3M\3M\5M\u0639\nM\3N\3N\5N\u063d"+
		"\nN\3N\3N\3N\3O\3O\3O\3O\7O\u0646\nO\fO\16O\u0649\13O\3P\3P\3P\7P\u064e"+
		"\nP\fP\16P\u0651\13P\3P\3P\3P\7P\u0656\nP\fP\16P\u0659\13P\3P\3P\3P\3"+
		"P\3P\3P\5P\u0661\nP\3Q\3Q\3Q\3Q\3Q\3Q\7Q\u0669\nQ\fQ\16Q\u066c\13Q\5Q"+
		"\u066e\nQ\3Q\3Q\5Q\u0672\nQ\3R\3R\3S\3S\3S\3S\3T\3T\3U\3U\5U\u067e\nU"+
		"\3V\3V\3W\3W\5W\u0684\nW\3X\3X\3X\3X\7X\u068a\nX\fX\16X\u068d\13X\3Y\3"+
		"Y\3Y\3Y\7Y\u0693\nY\fY\16Y\u0696\13Y\3Z\3Z\3Z\7Z\u069b\nZ\fZ\16Z\u069e"+
		"\13Z\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\5[\u06aa\n[\3\\\5\\\u06ad\n\\\3\\\3"+
		"\\\5\\\u06b1\n\\\3\\\3\\\3]\5]\u06b6\n]\3]\3]\5]\u06ba\n]\3]\3]\3^\3^"+
		"\3^\7^\u06c1\n^\f^\16^\u06c4\13^\3_\3_\3_\3_\3_\3_\3`\3`\3`\3`\3`\3`\3"+
		"`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\5`\u06dd\n`\3`\3`\3`\3`\3`\3`\3`\7`\u06e6"+
		"\n`\f`\16`\u06e9\13`\3a\3a\5a\u06ed\na\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3"+
		"b\3b\3b\3b\3b\3b\3b\3b\5b\u0701\nb\3c\3c\3d\5d\u0706\nd\3d\3d\3e\3e\3"+
		"f\3f\3f\5f\u070f\nf\3g\3g\5g\u0713\ng\3h\3h\3h\7h\u0718\nh\fh\16h\u071b"+
		"\13h\3i\3i\5i\u071f\ni\3j\3j\5j\u0723\nj\3k\3k\3k\3k\3l\3l\3l\3m\3m\3"+
		"m\5m\u072f\nm\3n\3n\3o\3o\3p\3p\3q\3q\3r\3r\3s\3s\3s\7s\u073e\ns\fs\16"+
		"s\u0741\13s\3t\3t\5t\u0745\nt\3t\5t\u0748\nt\3u\3u\5u\u074c\nu\3v\3v\3"+
		"v\5v\u0751\nv\3w\3w\3w\3x\3x\5x\u0758\nx\3y\3y\3y\3y\3y\3y\3y\3y\3y\7"+
		"y\u0763\ny\fy\16y\u0766\13y\3z\3z\3z\3z\7z\u076c\nz\fz\16z\u076f\13z\3"+
		"{\3{\3{\7{\u0774\n{\f{\16{\u0777\13{\3{\3{\3{\7{\u077c\n{\f{\16{\u077f"+
		"\13{\3{\3{\3{\3{\3{\5{\u0786\n{\3|\3|\3|\3|\7|\u078c\n|\f|\16|\u078f\13"+
		"|\3}\3}\3}\7}\u0794\n}\f}\16}\u0797\13}\3}\3}\3}\7}\u079c\n}\f}\16}\u079f"+
		"\13}\3}\3}\3}\5}\u07a4\n}\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\5~\u07b0\n~\3"+
		"\177\3\177\5\177\u07b4\n\177\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3"+
		"\u0080\7\u0080\u07bc\n\u0080\f\u0080\16\u0080\u07bf\13\u0080\3\u0081\3"+
		"\u0081\3\u0081\7\u0081\u07c4\n\u0081\f\u0081\16\u0081\u07c7\13\u0081\3"+
		"\u0081\5\u0081\u07ca\n\u0081\3\u0082\3\u0082\3\u0082\3\u0082\5\u0082\u07d0"+
		"\n\u0082\3\u0082\3\u0082\3\u0082\7\u0082\u07d5\n\u0082\f\u0082\16\u0082"+
		"\u07d8\13\u0082\3\u0082\3\u0082\5\u0082\u07dc\n\u0082\3\u0083\3\u0083"+
		"\3\u0083\7\u0083\u07e1\n\u0083\f\u0083\16\u0083\u07e4\13\u0083\3\u0084"+
		"\3\u0084\3\u0084\7\u0084\u07e9\n\u0084\f\u0084\16\u0084\u07ec\13\u0084"+
		"\3\u0085\3\u0085\3\u0085\3\u0085\5\u0085\u07f2\n\u0085\3\u0086\3\u0086"+
		"\3\u0087\3\u0087\3\u0087\3\u0087\7\u0087\u07fa\n\u0087\f\u0087\16\u0087"+
		"\u07fd\13\u0087\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\3\u0088\3\u0088\5\u0088\u0809\n\u0088\3\u0089\3\u0089\5\u0089"+
		"\u080d\n\u0089\3\u0089\5\u0089\u0810\n\u0089\3\u008a\3\u008a\5\u008a\u0814"+
		"\n\u008a\3\u008a\5\u008a\u0817\n\u008a\3\u008b\3\u008b\3\u008b\3\u008b"+
		"\7\u008b\u081d\n\u008b\f\u008b\16\u008b\u0820\13\u008b\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\7\u008c\u0826\n\u008c\f\u008c\16\u008c\u0829\13\u008c"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\7\u008d\u082f\n\u008d\f\u008d\16\u008d"+
		"\u0832\13\u008d\3\u008e\3\u008e\3\u008e\3\u008e\7\u008e\u0838\n\u008e"+
		"\f\u008e\16\u008e\u083b\13\u008e\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f"+
		"\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f"+
		"\5\u008f\u084b\n\u008f\3\u0090\3\u0090\3\u0090\5\u0090\u0850\n\u0090\3"+
		"\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\5\u0090\u0859\n"+
		"\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090"+
		"\3\u0090\5\u0090\u0864\n\u0090\3\u0091\3\u0091\3\u0091\7\u0091\u0869\n"+
		"\u0091\f\u0091\16\u0091\u086c\13\u0091\3\u0092\3\u0092\3\u0093\3\u0093"+
		"\3\u0093\5\u0093\u0873\n\u0093\3\u0093\3\u0093\3\u0094\3\u0094\3\u0094"+
		"\3\u0094\3\u0095\3\u0095\5\u0095\u087d\n\u0095\3\u0096\3\u0096\3\u0096"+
		"\3\u0096\3\u0096\3\u0096\5\u0096\u0885\n\u0096\3\u0097\5\u0097\u0888\n"+
		"\u0097\3\u0097\3\u0097\5\u0097\u088c\n\u0097\3\u0097\3\u0097\3\u0098\5"+
		"\u0098\u0891\n\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3"+
		"\u0098\3\u0098\5\u0098\u089b\n\u0098\3\u0099\3\u0099\5\u0099\u089f\n\u0099"+
		"\3\u0099\3\u0099\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\7\u009a\u08a8"+
		"\n\u009a\f\u009a\16\u009a\u08ab\13\u009a\5\u009a\u08ad\n\u009a\3\u009b"+
		"\3\u009b\3\u009b\7\u009b\u08b2\n\u009b\f\u009b\16\u009b\u08b5\13\u009b"+
		"\3\u009c\3\u009c\3\u009c\3\u009c\3\u009d\3\u009d\5\u009d\u08bd\n\u009d"+
		"\3\u009e\3\u009e\3\u009e\7\u009e\u08c2\n\u009e\f\u009e\16\u009e\u08c5"+
		"\13\u009e\3\u009f\3\u009f\3\u009f\3\u009f\3\u00a0\3\u00a0\5\u00a0\u08cd"+
		"\n\u00a0\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1"+
		"\3\u00a1\5\u00a1\u08d8\n\u00a1\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a3"+
		"\3\u00a3\3\u00a3\3\u00a3\3\u00a3\7\u00a3\u08e3\n\u00a3\f\u00a3\16\u00a3"+
		"\u08e6\13\u00a3\3\u00a4\3\u00a4\3\u00a4\3\u00a4\5\u00a4\u08ec\n\u00a4"+
		"\3\u00a5\3\u00a5\3\u00a5\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6"+
		"\3\u00a6\3\u00a6\5\u00a6\u08f9\n\u00a6\3\u00a7\3\u00a7\3\u00a7\3\u00a7"+
		"\3\u00a7\3\u00a8\3\u00a8\3\u00a8\5\u00a8\u0903\n\u00a8\3\u00a8\5\u00a8"+
		"\u0906\n\u00a8\3\u00a9\3\u00a9\5\u00a9\u090a\n\u00a9\3\u00aa\3\u00aa\3"+
		"\u00aa\3\u00aa\3\u00aa\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ac"+
		"\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ad\3\u00ad\3\u00ad\7\u00ad\u091e"+
		"\n\u00ad\f\u00ad\16\u00ad\u0921\13\u00ad\3\u00ae\3\u00ae\3\u00ae\7\u00ae"+
		"\u0926\n\u00ae\f\u00ae\16\u00ae\u0929\13\u00ae\3\u00ae\5\u00ae\u092c\n"+
		"\u00ae\3\u00af\3\u00af\3\u00af\7\u00af\u0931\n\u00af\f\u00af\16\u00af"+
		"\u0934\13\u00af\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\5\u00b0"+
		"\u093c\n\u00b0\3\u00b1\3\u00b1\3\u00b2\3\u00b2\3\u00b2\3\u00b3\3\u00b3"+
		"\3\u00b3\3\u00b4\3\u00b4\3\u00b4\3\u00b5\3\u00b5\3\u00b5\3\u00b6\3\u00b6"+
		"\3\u00b6\3\u00b7\3\u00b7\3\u00b8\3\u00b8\3\u00b9\3\u00b9\3\u00ba\3\u00ba"+
		"\3\u00bb\3\u00bb\3\u00bc\3\u00bc\3\u00bd\3\u00bd\3\u00be\3\u00be\3\u00be"+
		"\3\u00be\3\u00be\3\u00be\3\u00be\5\u00be\u0964\n\u00be\3\u00bf\3\u00bf"+
		"\3\u00bf\3\u00bf\3\u00bf\7\u00bf\u096b\n\u00bf\f\u00bf\16\u00bf\u096e"+
		"\13\u00bf\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\5\u00c0"+
		"\u0977\n\u00c0\3\u00c1\3\u00c1\3\u00c2\3\u00c2\3\u00c2\3\u00c3\3\u00c3"+
		"\3\u00c3\3\u00c3\3\u00c3\5\u00c3\u0983\n\u00c3\3\u00c4\3\u00c4\3\u00c4"+
		"\5\u00c4\u0988\n\u00c4\3\u00c4\3\u00c4\3\u00c5\3\u00c5\3\u00c5\3\u00c5"+
		"\3\u00c5\3\u00c5\7\u00c5\u0992\n\u00c5\f\u00c5\16\u00c5\u0995\13\u00c5"+
		"\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c8"+
		"\3\u00c8\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\5\u00c9\u09a6\n\u00c9"+
		"\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u09ad\n\u00ca\3\u00cb"+
		"\3\u00cb\3\u00cb\5\u00cb\u09b2\n\u00cb\3\u00cc\3\u00cc\3\u00cc\3\u00cc"+
		"\3\u00cc\7\u00cc\u09b9\n\u00cc\f\u00cc\16\u00cc\u09bc\13\u00cc\3\u00cd"+
		"\3\u00cd\3\u00cd\3\u00cd\3\u00cd\5\u00cd\u09c3\n\u00cd\3\u00ce\3\u00ce"+
		"\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\5\u00cf\u09cd\n\u00cf"+
		"\3\u00d0\3\u00d0\3\u00d0\5\u00d0\u09d2\n\u00d0\3\u00d0\3\u00d0\3\u00d1"+
		"\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\5\u00d1\u09dc\n\u00d1\3\u00d2"+
		"\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\7\u00d2\u09e4\n\u00d2\f\u00d2"+
		"\16\u00d2\u09e7\13\u00d2\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3"+
		"\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\7\u00d3\u09f4\n\u00d3\f\u00d3"+
		"\16\u00d3\u09f7\13\u00d3\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d5\3\u00d5"+
		"\3\u00d5\5\u00d5\u0a00\n\u00d5\3\u00d5\3\u00d5\3\u00d5\7\u00d5\u0a05\n"+
		"\u00d5\f\u00d5\16\u00d5\u0a08\13\u00d5\3\u00d6\3\u00d6\3\u00d6\3\u00d6"+
		"\3\u00d6\5\u00d6\u0a0f\n\u00d6\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7"+
		"\5\u00d7\u0a16\n\u00d7\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8"+
		"\3\u00d8\5\u00d8\u0a1f\n\u00d8\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9"+
		"\7\u00d9\u0a26\n\u00d9\f\u00d9\16\u00d9\u0a29\13\u00d9\3\u00da\3\u00da"+
		"\3\u00da\3\u00da\3\u00da\5\u00da\u0a30\n\u00da\3\u00db\3\u00db\3\u00dc"+
		"\3\u00dc\3\u00dc\3\u00dd\3\u00dd\3\u00dd\5\u00dd\u0a3a\n\u00dd\3\u00de"+
		"\3\u00de\3\u00de\5\u00de\u0a3f\n\u00de\3\u00de\3\u00de\3\u00df\3\u00df"+
		"\3\u00df\3\u00df\3\u00df\3\u00df\7\u00df\u0a49\n\u00df\f\u00df\16\u00df"+
		"\u0a4c\13\u00df\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e1\3\u00e1\3\u00e1"+
		"\3\u00e1\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\7\u00e2\u0a5c"+
		"\n\u00e2\f\u00e2\16\u00e2\u0a5f\13\u00e2\3\u00e3\3\u00e3\3\u00e3\3\u00e3"+
		"\3\u00e3\7\u00e3\u0a66\n\u00e3\f\u00e3\16\u00e3\u0a69\13\u00e3\3\u00e4"+
		"\3\u00e4\3\u00e4\3\u00e4\3\u00e4\5\u00e4\u0a70\n\u00e4\3\u00e5\3\u00e5"+
		"\3\u00e5\3\u00e5\3\u00e5\5\u00e5\u0a77\n\u00e5\3\u00e6\3\u00e6\3\u00e6"+
		"\3\u00e6\3\u00e6\3\u00e6\3\u00e6\5\u00e6\u0a80\n\u00e6\3\u00e7\3\u00e7"+
		"\3\u00e7\3\u00e7\3\u00e7\7\u00e7\u0a87\n\u00e7\f\u00e7\16\u00e7\u0a8a"+
		"\13\u00e7\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8\5\u00e8\u0a91\n\u00e8"+
		"\3\u00e9\3\u00e9\3\u00ea\3\u00ea\3\u00ea\3\u00eb\3\u00eb\3\u00eb\5\u00eb"+
		"\u0a9b\n\u00eb\3\u00ec\3\u00ec\3\u00ec\5\u00ec\u0aa0\n\u00ec\3\u00ec\3"+
		"\u00ec\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed\7\u00ed\u0aaa\n"+
		"\u00ed\f\u00ed\16\u00ed\u0aad\13\u00ed\3\u00ee\3\u00ee\3\u00ee\3\u00ee"+
		"\3\u00ef\3\u00ef\3\u00ef\3\u00ef\3\u00f0\3\u00f0\3\u00f0\5\u00f0\u0aba"+
		"\n\u00f0\3\u00f0\3\u00f0\3\u00f0\7\u00f0\u0abf\n\u00f0\f\u00f0\16\u00f0"+
		"\u0ac2\13\u00f0\3\u00f1\3\u00f1\3\u00f1\3\u00f1\3\u00f1\5\u00f1\u0ac9"+
		"\n\u00f1\3\u00f2\3\u00f2\3\u00f2\3\u00f2\3\u00f2\5\u00f2\u0ad0\n\u00f2"+
		"\3\u00f3\3\u00f3\5\u00f3\u0ad4\n\u00f3\3\u00f4\3\u00f4\3\u00f4\5\u00f4"+
		"\u0ad9\n\u00f4\3\u00f4\3\u00f4\5\u00f4\u0add\n\u00f4\3\u00f5\3\u00f5\3"+
		"\u00f5\5\u00f5\u0ae2\n\u00f5\3\u00f5\3\u00f5\3\u00f5\3\u00f6\3\u00f6\3"+
		"\u00f6\5\u00f6\u0aea\n\u00f6\3\u00f7\3\u00f7\3\u00f7\3\u00f7\3\u00f8\3"+
		"\u00f8\3\u00f8\3\u00f8\7\u00f8\u0af4\n\u00f8\f\u00f8\16\u00f8\u0af7\13"+
		"\u00f8\3\u00f8\3\u00f8\3\u00f8\3\u00f9\3\u00f9\3\u00f9\3\u00f9\7\u00f9"+
		"\u0b00\n\u00f9\f\u00f9\16\u00f9\u0b03\13\u00f9\3\u00f9\3\u00f9\3\u00fa"+
		"\3\u00fa\3\u00fa\3\u00fa\3\u00fa\3\u00fb\3\u00fb\3\u00fb\7\u00fb\u0b0f"+
		"\n\u00fb\f\u00fb\16\u00fb\u0b12\13\u00fb\3\u00fc\3\u00fc\7\u00fc\u0b16"+
		"\n\u00fc\f\u00fc\16\u00fc\u0b19\13\u00fc\3\u00fd\3\u00fd\3\u00fd\5\u00fd"+
		"\u0b1e\n\u00fd\3\u00fd\3\u00fd\3\u00fe\3\u00fe\3\u00fe\3\u00fe\3\u00fe"+
		"\5\u00fe\u0b27\n\u00fe\3\u00ff\6\u00ff\u0b2a\n\u00ff\r\u00ff\16\u00ff"+
		"\u0b2b\3\u0100\3\u0100\3\u0100\3\u0100\5\u0100\u0b32\n\u0100\3\u0100\5"+
		"\u0100\u0b35\n\u0100\3\u0101\6\u0101\u0b38\n\u0101\r\u0101\16\u0101\u0b39"+
		"\3\u0102\3\u0102\5\u0102\u0b3e\n\u0102\3\u0103\3\u0103\6\u0103\u0b42\n"+
		"\u0103\r\u0103\16\u0103\u0b43\3\u0103\3\u0103\3\u0104\3\u0104\3\u0104"+
		"\6\u0104\u0b4b\n\u0104\r\u0104\16\u0104\u0b4c\3\u0104\3\u0104\3\u0105"+
		"\3\u0105\3\u0105\3\u0105\5\u0105\u0b55\n\u0105\3\u0105\3\u0105\6\u0105"+
		"\u0b59\n\u0105\r\u0105\16\u0105\u0b5a\7\u0105\u0b5d\n\u0105\f\u0105\16"+
		"\u0105\u0b60\13\u0105\3\u0106\3\u0106\3\u0106\3\u0106\3\u0106\5\u0106"+
		"\u0b67\n\u0106\3\u0107\6\u0107\u0b6a\n\u0107\r\u0107\16\u0107\u0b6b\3"+
		"\u0107\2\32\24(N`jl\u0088\u00be\u00f0\u0144\u017c\u0188\u0196\u01a2\u01a4"+
		"\u01a8\u01b0\u01bc\u01c2\u01c4\u01cc\u01d8\u01de\u0208\u0108\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0"+
		"\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8"+
		"\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0"+
		"\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108"+
		"\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120"+
		"\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138"+
		"\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150"+
		"\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164\u0166\u0168"+
		"\u016a\u016c\u016e\u0170\u0172\u0174\u0176\u0178\u017a\u017c\u017e\u0180"+
		"\u0182\u0184\u0186\u0188\u018a\u018c\u018e\u0190\u0192\u0194\u0196\u0198"+
		"\u019a\u019c\u019e\u01a0\u01a2\u01a4\u01a6\u01a8\u01aa\u01ac\u01ae\u01b0"+
		"\u01b2\u01b4\u01b6\u01b8\u01ba\u01bc\u01be\u01c0\u01c2\u01c4\u01c6\u01c8"+
		"\u01ca\u01cc\u01ce\u01d0\u01d2\u01d4\u01d6\u01d8\u01da\u01dc\u01de\u01e0"+
		"\u01e2\u01e4\u01e6\u01e8\u01ea\u01ec\u01ee\u01f0\u01f2\u01f4\u01f6\u01f8"+
		"\u01fa\u01fc\u01fe\u0200\u0202\u0204\u0206\u0208\u020a\u020c\2\20\3\2"+
		"\36\37\3\2%(\3\2,.\3\2\4\5\5\2pp\u0091\u0091\u00ab\u00ab\7\2XX||\u008c"+
		"\u008c\u0094\u0094\u00ab\u00ab\5\2XX\u008c\u008c\u00ab\u00ab\5\2\u008c"+
		"\u008c\u0094\u0094\u00ab\u00ab\4\2\u0090\u0090\u009a\u009a\4\2OO__\n\2"+
		"\7\f\63\63\65=?GIsuuw\u0098\u009a\u00a4\4\2##{{\5\2\26\27%%\'\'\4\2\16"+
		"\16\26\27\2\u0c28\2\u020e\3\2\2\2\4\u021f\3\2\2\2\6\u0228\3\2\2\2\b\u022e"+
		"\3\2\2\2\n\u0234\3\2\2\2\f\u0249\3\2\2\2\16\u0251\3\2\2\2\20\u025a\3\2"+
		"\2\2\22\u026a\3\2\2\2\24\u0274\3\2\2\2\26\u0285\3\2\2\2\30\u0288\3\2\2"+
		"\2\32\u0295\3\2\2\2\34\u029e\3\2\2\2\36\u02a8\3\2\2\2 \u02b1\3\2\2\2\""+
		"\u02bc\3\2\2\2$\u02cf\3\2\2\2&\u02e1\3\2\2\2(\u02e7\3\2\2\2*\u02f4\3\2"+
		"\2\2,\u0308\3\2\2\2.\u0318\3\2\2\2\60\u0328\3\2\2\2\62\u033a\3\2\2\2\64"+
		"\u033d\3\2\2\2\66\u0350\3\2\2\28\u0367\3\2\2\2:\u0369\3\2\2\2<\u037f\3"+
		"\2\2\2>\u0391\3\2\2\2@\u0397\3\2\2\2B\u039d\3\2\2\2D\u03b7\3\2\2\2F\u03b9"+
		"\3\2\2\2H\u03c6\3\2\2\2J\u03d2\3\2\2\2L\u03d8\3\2\2\2N\u03e4\3\2\2\2P"+
		"\u03f9\3\2\2\2R\u03fd\3\2\2\2T\u0431\3\2\2\2V\u0433\3\2\2\2X\u0436\3\2"+
		"\2\2Z\u043c\3\2\2\2\\\u0446\3\2\2\2^\u0455\3\2\2\2`\u0474\3\2\2\2b\u04e3"+
		"\3\2\2\2d\u04e5\3\2\2\2f\u04e9\3\2\2\2h\u04f1\3\2\2\2j\u04f3\3\2\2\2l"+
		"\u04fd\3\2\2\2n\u0512\3\2\2\2p\u0514\3\2\2\2r\u0519\3\2\2\2t\u0522\3\2"+
		"\2\2v\u052c\3\2\2\2x\u057c\3\2\2\2z\u05c1\3\2\2\2|\u05c3\3\2\2\2~\u05ca"+
		"\3\2\2\2\u0080\u05d0\3\2\2\2\u0082\u05eb\3\2\2\2\u0084\u05fd\3\2\2\2\u0086"+
		"\u05ff\3\2\2\2\u0088\u0609\3\2\2\2\u008a\u0613\3\2\2\2\u008c\u0619\3\2"+
		"\2\2\u008e\u0624\3\2\2\2\u0090\u0626\3\2\2\2\u0092\u062b\3\2\2\2\u0094"+
		"\u062d\3\2\2\2\u0096\u0632\3\2\2\2\u0098\u0638\3\2\2\2\u009a\u063a\3\2"+
		"\2\2\u009c\u0641\3\2\2\2\u009e\u064f\3\2\2\2\u00a0\u0662\3\2\2\2\u00a2"+
		"\u0673\3\2\2\2\u00a4\u0675\3\2\2\2\u00a6\u0679\3\2\2\2\u00a8\u067d\3\2"+
		"\2\2\u00aa\u067f\3\2\2\2\u00ac\u0683\3\2\2\2\u00ae\u0685\3\2\2\2\u00b0"+
		"\u068e\3\2\2\2\u00b2\u0697\3\2\2\2\u00b4\u06a9\3\2\2\2\u00b6\u06ac\3\2"+
		"\2\2\u00b8\u06b5\3\2\2\2\u00ba\u06bd\3\2\2\2\u00bc\u06c5\3\2\2\2\u00be"+
		"\u06dc\3\2\2\2\u00c0\u06ec\3\2\2\2\u00c2\u0700\3\2\2\2\u00c4\u0702\3\2"+
		"\2\2\u00c6\u0705\3\2\2\2\u00c8\u0709\3\2\2\2\u00ca\u070e\3\2\2\2\u00cc"+
		"\u0712\3\2\2\2\u00ce\u0714\3\2\2\2\u00d0\u071e\3\2\2\2\u00d2\u0722\3\2"+
		"\2\2\u00d4\u0724\3\2\2\2\u00d6\u0728\3\2\2\2\u00d8\u072e\3\2\2\2\u00da"+
		"\u0730\3\2\2\2\u00dc\u0732\3\2\2\2\u00de\u0734\3\2\2\2\u00e0\u0736\3\2"+
		"\2\2\u00e2\u0738\3\2\2\2\u00e4\u073a\3\2\2\2\u00e6\u0747\3\2\2\2\u00e8"+
		"\u074b\3\2\2\2\u00ea\u074d\3\2\2\2\u00ec\u0752\3\2\2\2\u00ee\u0757\3\2"+
		"\2\2\u00f0\u0759\3\2\2\2\u00f2\u0767\3\2\2\2\u00f4\u0775\3\2\2\2\u00f6"+
		"\u0787\3\2\2\2\u00f8\u0795\3\2\2\2\u00fa\u07af\3\2\2\2\u00fc\u07b1\3\2"+
		"\2\2\u00fe\u07b5\3\2\2\2\u0100\u07c0\3\2\2\2\u0102\u07cb\3\2\2\2\u0104"+
		"\u07dd\3\2\2\2\u0106\u07e5\3\2\2\2\u0108\u07f1\3\2\2\2\u010a\u07f3\3\2"+
		"\2\2\u010c\u07f5\3\2\2\2\u010e\u0808\3\2\2\2\u0110\u080a\3\2\2\2\u0112"+
		"\u0811\3\2\2\2\u0114\u0818\3\2\2\2\u0116\u0821\3\2\2\2\u0118\u082a\3\2"+
		"\2\2\u011a\u0833\3\2\2\2\u011c\u084a\3\2\2\2\u011e\u0863\3\2\2\2\u0120"+
		"\u0865\3\2\2\2\u0122\u086d\3\2\2\2\u0124\u0872\3\2\2\2\u0126\u0876\3\2"+
		"\2\2\u0128\u087c\3\2\2\2\u012a\u0884\3\2\2\2\u012c\u0887\3\2\2\2\u012e"+
		"\u0890\3\2\2\2\u0130\u089c\3\2\2\2\u0132\u08a2\3\2\2\2\u0134\u08ae\3\2"+
		"\2\2\u0136\u08b6\3\2\2\2\u0138\u08bc\3\2\2\2\u013a\u08be\3\2\2\2\u013c"+
		"\u08c6\3\2\2\2\u013e\u08cc\3\2\2\2\u0140\u08d7\3\2\2\2\u0142\u08d9\3\2"+
		"\2\2\u0144\u08dd\3\2\2\2\u0146\u08eb\3\2\2\2\u0148\u08ed\3\2\2\2\u014a"+
		"\u08f8\3\2\2\2\u014c\u08fa\3\2\2\2\u014e\u0905\3\2\2\2\u0150\u0909\3\2"+
		"\2\2\u0152\u090b\3\2\2\2\u0154\u0910\3\2\2\2\u0156\u0915\3\2\2\2\u0158"+
		"\u091a\3\2\2\2\u015a\u0922\3\2\2\2\u015c\u092d\3\2\2\2\u015e\u093b\3\2"+
		"\2\2\u0160\u093d\3\2\2\2\u0162\u093f\3\2\2\2\u0164\u0942\3\2\2\2\u0166"+
		"\u0945\3\2\2\2\u0168\u0948\3\2\2\2\u016a\u094b\3\2\2\2\u016c\u094e\3\2"+
		"\2\2\u016e\u0950\3\2\2\2\u0170\u0952\3\2\2\2\u0172\u0954\3\2\2\2\u0174"+
		"\u0956\3\2\2\2\u0176\u0958\3\2\2\2\u0178\u095a\3\2\2\2\u017a\u0963\3\2"+
		"\2\2\u017c\u0965\3\2\2\2\u017e\u0976\3\2\2\2\u0180\u0978\3\2\2\2\u0182"+
		"\u097a\3\2\2\2\u0184\u0982\3\2\2\2\u0186\u0984\3\2\2\2\u0188\u098b\3\2"+
		"\2\2\u018a\u0996\3\2\2\2\u018c\u099a\3\2\2\2\u018e\u099e\3\2\2\2\u0190"+
		"\u09a5\3\2\2\2\u0192\u09ac\3\2\2\2\u0194\u09b1\3\2\2\2\u0196\u09b3\3\2"+
		"\2\2\u0198\u09c2\3\2\2\2\u019a\u09c4\3\2\2\2\u019c\u09cc\3\2\2\2\u019e"+
		"\u09ce\3\2\2\2\u01a0\u09db\3\2\2\2\u01a2\u09dd\3\2\2\2\u01a4\u09e8\3\2"+
		"\2\2\u01a6\u09f8\3\2\2\2\u01a8\u09ff\3\2\2\2\u01aa\u0a0e\3\2\2\2\u01ac"+
		"\u0a15\3\2\2\2\u01ae\u0a1e\3\2\2\2\u01b0\u0a20\3\2\2\2\u01b2\u0a2f\3\2"+
		"\2\2\u01b4\u0a31\3\2\2\2\u01b6\u0a33\3\2\2\2\u01b8\u0a39\3\2\2\2\u01ba"+
		"\u0a3b\3\2\2\2\u01bc\u0a42\3\2\2\2\u01be\u0a4d\3\2\2\2\u01c0\u0a51\3\2"+
		"\2\2\u01c2\u0a55\3\2\2\2\u01c4\u0a60\3\2\2\2\u01c6\u0a6f\3\2\2\2\u01c8"+
		"\u0a76\3\2\2\2\u01ca\u0a7f\3\2\2\2\u01cc\u0a81\3\2\2\2\u01ce\u0a90\3\2"+
		"\2\2\u01d0\u0a92\3\2\2\2\u01d2\u0a94\3\2\2\2\u01d4\u0a9a\3\2\2\2\u01d6"+
		"\u0a9c\3\2\2\2\u01d8\u0aa3\3\2\2\2\u01da\u0aae\3\2\2\2\u01dc\u0ab2\3\2"+
		"\2\2\u01de\u0ab9\3\2\2\2\u01e0\u0ac8\3\2\2\2\u01e2\u0acf\3\2\2\2\u01e4"+
		"\u0ad3\3\2\2\2\u01e6\u0adc\3\2\2\2\u01e8\u0ade\3\2\2\2\u01ea\u0ae9\3\2"+
		"\2\2\u01ec\u0aeb\3\2\2\2\u01ee\u0aef\3\2\2\2\u01f0\u0afb\3\2\2\2\u01f2"+
		"\u0b06\3\2\2\2\u01f4\u0b0b\3\2\2\2\u01f6\u0b13\3\2\2\2\u01f8\u0b1a\3\2"+
		"\2\2\u01fa\u0b26\3\2\2\2\u01fc\u0b29\3\2\2\2\u01fe\u0b34\3\2\2\2\u0200"+
		"\u0b37\3\2\2\2\u0202\u0b3d\3\2\2\2\u0204\u0b3f\3\2\2\2\u0206\u0b47\3\2"+
		"\2\2\u0208\u0b54\3\2\2\2\u020a\u0b66\3\2\2\2\u020c\u0b69\3\2\2\2\u020e"+
		"\u020f\7e\2\2\u020f\u0210\7X\2\2\u0210\u0215\5\u00e0q\2\u0211\u0212\7"+
		"\22\2\2\u0212\u0213\5\u0106\u0084\2\u0213\u0214\7\23\2\2\u0214\u0216\3"+
		"\2\2\2\u0215\u0211\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0219\3\2\2\2\u0217"+
		"\u0218\7i\2\2\u0218\u021a\5\u00e0q\2\u0219\u0217\3\2\2\2\u0219\u021a\3"+
		"\2\2\2\u021a\u021b\3\2\2\2\u021b\u021c\7\26\2\2\u021c\u021d\5\u00b0Y\2"+
		"\u021d\u021e\7\27\2\2\u021e\3\3\2\2\2\u021f\u0220\7e\2\2\u0220\u0221\5"+
		"\u00e0q\2\u0221\u0222\7\22\2\2\u0222\u0223\5\u00c2b\2\u0223\u0224\7\23"+
		"\2\2\u0224\u0225\7\26\2\2\u0225\u0226\5\u00aeX\2\u0226\u0227\7\27\2\2"+
		"\u0227\5\3\2\2\2\u0228\u0229\5\u00e2r\2\u0229\u022a\7\22\2\2\u022a\u022b"+
		"\5\u0088E\2\u022b\u022c\7\23\2\2\u022c\u022d\7\16\2\2\u022d\7\3\2\2\2"+
		"\u022e\u022f\5\u00e2r\2\u022f\u0230\7+\2\2\u0230\u0231\5`\61\2\u0231\u0232"+
		"\7\16\2\2\u0232\t\3\2\2\2\u0233\u0235\7\u0094\2\2\u0234\u0233\3\2\2\2"+
		"\u0234\u0235\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0237\7Q\2\2\u0237\u0238"+
		"\5\u00dep\2\u0238\u0239\7\r\2\2\u0239\u023b\5\u00be`\2\u023a\u023c\5\u00b4"+
		"[\2\u023b\u023a\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u0245\3\2\2\2\u023d"+
		"\u023e\7\u00a0\2\2\u023e\u0243\7u\2\2\u023f\u0240\7\22\2\2\u0240\u0241"+
		"\5\u0104\u0083\2\u0241\u0242\7\23\2\2\u0242\u0244\3\2\2\2\u0243\u023f"+
		"\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0246\3\2\2\2\u0245\u023d\3\2\2\2\u0245"+
		"\u0246\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u0248\7\16\2\2\u0248\13\3\2\2"+
		"\2\u0249\u024a\7\u009f\2\2\u024a\u024d\5\u00e0q\2\u024b\u024c\7i\2\2\u024c"+
		"\u024e\5\u00e0q\2\u024d\u024b\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u024f"+
		"\3\2\2\2\u024f\u0250\5\26\f\2\u0250\r\3\2\2\2\u0251\u0252\7}\2\2\u0252"+
		"\u0253\7\u009f\2\2\u0253\u0254\5\u00e0q\2\u0254\u0255\7\26\2\2\u0255\u0256"+
		"\5&\24\2\u0256\u0257\5\u00f6|\2\u0257\u0258\7\27\2\2\u0258\17\3\2\2\2"+
		"\u0259\u025b\7\u0094\2\2\u025a\u0259\3\2\2\2\u025a\u025b\3\2\2\2\u025b"+
		"\u025c\3\2\2\2\u025c\u025d\7X\2\2\u025d\u0262\5\u00e0q\2\u025e\u025f\7"+
		"\22\2\2\u025f\u0260\5\u0106\u0084\2\u0260\u0261\7\23\2\2\u0261\u0263\3"+
		"\2\2\2\u0262\u025e\3\2\2\2\u0262\u0263\3\2\2\2\u0263\u0266\3\2\2\2\u0264"+
		"\u0265\7i\2\2\u0265\u0267\5\24\13\2\u0266\u0264\3\2\2\2\u0266\u0267\3"+
		"\2\2\2\u0267\u0268\3\2\2\2\u0268\u0269\5\26\f\2\u0269\21\3\2\2\2\u026a"+
		"\u026b\7\u0092\2\2\u026b\u0270\5\u00e0q\2\u026c\u026d\7\22\2\2\u026d\u026e"+
		"\5\u0106\u0084\2\u026e\u026f\7\23\2\2\u026f\u0271\3\2\2\2\u0270\u026c"+
		"\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u0272\3\2\2\2\u0272\u0273\5\26\f\2"+
		"\u0273\23\3\2\2\2\u0274\u0275\b\13\1\2\u0275\u0276\5\u00e0q\2\u0276\u027c"+
		"\3\2\2\2\u0277\u0278\f\3\2\2\u0278\u0279\7\17\2\2\u0279\u027b\5\u00e0"+
		"q\2\u027a\u0277\3\2\2\2\u027b\u027e\3\2\2\2\u027c\u027a\3\2\2\2\u027c"+
		"\u027d\3\2\2\2\u027d\25\3\2\2\2\u027e\u027c\3\2\2\2\u027f\u0286\7\16\2"+
		"\2\u0280\u0282\7\26\2\2\u0281\u0283\5\u00f2z\2\u0282\u0281\3\2\2\2\u0282"+
		"\u0283\3\2\2\2\u0283\u0284\3\2\2\2\u0284\u0286\7\27\2\2\u0285\u027f\3"+
		"\2\2\2\u0285\u0280\3\2\2\2\u0286\27\3\2\2\2\u0287\u0289\5\u00be`\2\u0288"+
		"\u0287\3\2\2\2\u0288\u0289\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u028b\7\u0084"+
		"\2\2\u028b\u028c\5\u015e\u00b0\2\u028c\u028d\7\22\2\2\u028d\u028e\5\u00e8"+
		"u\2\u028e\u028f\7\23\2\2\u028f\u0291\7\26\2\2\u0290\u0292\5\u0114\u008b"+
		"\2\u0291\u0290\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u0294"+
		"\7\27\2\2\u0294\31\3\2\2\2\u0295\u0296\7\u0091\2\2\u0296\u0297\5\u00dc"+
		"o\2\u0297\u0299\7\26\2\2\u0298\u029a\5\u0114\u008b\2\u0299\u0298\3\2\2"+
		"\2\u0299\u029a\3\2\2\2\u029a\u029b\3\2\2\2\u029b\u029c\7\27\2\2\u029c"+
		"\33\3\2\2\2\u029d\u029f\7}\2\2\u029e\u029d\3\2\2\2\u029e\u029f\3\2\2\2"+
		"\u029f\u02a0\3\2\2\2\u02a0\u02a1\7\u0091\2\2\u02a1\u02a2\5\u00dco\2\u02a2"+
		"\u02a4\7\26\2\2\u02a3\u02a5\5\u010c\u0087\2\u02a4\u02a3\3\2\2\2\u02a4"+
		"\u02a5\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u02a7\7\27\2\2\u02a7\35\3\2\2"+
		"\2\u02a8\u02a9\7p\2\2\u02a9\u02aa\5\u00dco\2\u02aa\u02ac\7\26\2\2\u02ab"+
		"\u02ad\5\u0114\u008b\2\u02ac\u02ab\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\u02ae"+
		"\3\2\2\2\u02ae\u02af\7\27\2\2\u02af\37\3\2\2\2\u02b0\u02b2\7}\2\2\u02b1"+
		"\u02b0\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b4\7p"+
		"\2\2\u02b4\u02b5\5\u00dco\2\u02b5\u02b7\7\26\2\2\u02b6\u02b8\5\u010c\u0087"+
		"\2\u02b7\u02b6\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9\u02ba"+
		"\7\27\2\2\u02ba!\3\2\2\2\u02bb\u02bd\7\u0094\2\2\u02bc\u02bb\3\2\2\2\u02bc"+
		"\u02bd\3\2\2\2\u02bd\u02be\3\2\2\2\u02be\u02bf\7}\2\2\u02bf\u02c0\7\u008c"+
		"\2\2\u02c0\u02c5\5\u00e0q\2\u02c1\u02c2\7\22\2\2\u02c2\u02c3\5\u0106\u0084"+
		"\2\u02c3\u02c4\7\23\2\2\u02c4\u02c6\3\2\2\2\u02c5\u02c1\3\2\2\2\u02c5"+
		"\u02c6\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02c8\7\26\2\2\u02c8\u02ca\5"+
		"&\24\2\u02c9\u02cb\5\u00f6|\2\u02ca\u02c9\3\2\2\2\u02ca\u02cb\3\2\2\2"+
		"\u02cb\u02cc\3\2\2\2\u02cc\u02cd\7\27\2\2\u02cd#\3\2\2\2\u02ce\u02d0\7"+
		"\u0094\2\2\u02cf\u02ce\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02d1\3\2\2\2"+
		"\u02d1\u02d2\7}\2\2\u02d2\u02d3\7X\2\2\u02d3\u02d8\5\u00e0q\2\u02d4\u02d5"+
		"\7\22\2\2\u02d5\u02d6\5\u0106\u0084\2\u02d6\u02d7\7\23\2\2\u02d7\u02d9"+
		"\3\2\2\2\u02d8\u02d4\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9\u02da\3\2\2\2\u02da"+
		"\u02db\7\26\2\2\u02db\u02dd\5&\24\2\u02dc\u02de\5\u00f6|\2\u02dd\u02dc"+
		"\3\2\2\2\u02dd\u02de\3\2\2\2\u02de\u02df\3\2\2\2\u02df\u02e0\7\27\2\2"+
		"\u02e0%\3\2\2\2\u02e1\u02e2\7X\2\2\u02e2\u02e3\7S\2\2\u02e3\u02e4\7\26"+
		"\2\2\u02e4\u02e5\5(\25\2\u02e5\u02e6\7\27\2\2\u02e6\'\3\2\2\2\u02e7\u02e8"+
		"\b\25\1\2\u02e8\u02e9\5\u00fa~\2\u02e9\u02ea\7\16\2\2\u02ea\u02f1\3\2"+
		"\2\2\u02eb\u02ec\f\3\2\2\u02ec\u02ed\5\u00fa~\2\u02ed\u02ee\7\16\2\2\u02ee"+
		"\u02f0\3\2\2\2\u02ef\u02eb\3\2\2\2\u02f0\u02f3\3\2\2\2\u02f1\u02ef\3\2"+
		"\2\2\u02f1\u02f2\3\2\2\2\u02f2)\3\2\2\2\u02f3\u02f1\3\2\2\2\u02f4\u02f9"+
		"\7I\2\2\u02f5\u02f7\7|\2\2\u02f6\u02f5\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7"+
		"\u02f8\3\2\2\2\u02f8\u02fa\5\u00be`\2\u02f9\u02f6\3\2\2\2\u02f9\u02fa"+
		"\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb\u02fc\7y\2\2\u02fc\u02fd\5\u00d0i\2"+
		"\u02fd\u02ff\7\22\2\2\u02fe\u0300\5\u00e4s\2\u02ff\u02fe\3\2\2\2\u02ff"+
		"\u0300\3\2\2\2\u0300\u0301\3\2\2\2\u0301\u0302\7\23\2\2\u0302\u0303\7"+
		"\16\2\2\u0303+\3\2\2\2\u0304\u0306\7|\2\2\u0305\u0304\3\2\2\2\u0305\u0306"+
		"\3\2\2\2\u0306\u0307\3\2\2\2\u0307\u0309\5\u00be`\2\u0308\u0305\3\2\2"+
		"\2\u0308\u0309\3\2\2\2\u0309\u030a\3\2\2\2\u030a\u030b\7y\2\2\u030b\u030c"+
		"\5\u00d0i\2\u030c\u030e\7\22\2\2\u030d\u030f\5\u00e4s\2\u030e\u030d\3"+
		"\2\2\2\u030e\u030f\3\2\2\2\u030f\u0310\3\2\2\2\u0310\u0311\7\23\2\2\u0311"+
		"\u0313\7\26\2\2\u0312\u0314\5\u0114\u008b\2\u0313\u0312\3\2\2\2\u0313"+
		"\u0314\3\2\2\2\u0314\u0315\3\2\2\2\u0315\u0316\7\27\2\2\u0316-\3\2\2\2"+
		"\u0317\u0319\5\u00eex\2\u0318\u0317\3\2\2\2\u0318\u0319\3\2\2\2\u0319"+
		"\u031b\3\2\2\2\u031a\u031c\7}\2\2\u031b\u031a\3\2\2\2\u031b\u031c\3\2"+
		"\2\2\u031c\u031d\3\2\2\2\u031d\u031e\7y\2\2\u031e\u031f\5\u00d0i\2\u031f"+
		"\u0321\7\22\2\2\u0320\u0322\5\u00e4s\2\u0321\u0320\3\2\2\2\u0321\u0322"+
		"\3\2\2\2\u0322\u0323\3\2\2\2\u0323\u0324\7\23\2\2\u0324\u0325\7\26\2\2"+
		"\u0325\u0326\5\u010c\u0087\2\u0326\u0327\7\27\2\2\u0327/\3\2\2\2\u0328"+
		"\u0329\7\u0098\2\2\u0329\u032a\7y\2\2\u032a\u032b\7\u00af\2\2\u032b\u032c"+
		"\7\22\2\2\u032c\u032d\7\23\2\2\u032d\u032e\7\26\2\2\u032e\u032f\5\u0114"+
		"\u008b\2\u032f\u0330\7\27\2\2\u0330\u0338\7\u009e\2\2\u0331\u0332\7\26"+
		"\2\2\u0332\u0333\5\u0116\u008c\2\u0333\u0334\7\27\2\2\u0334\u0339\3\2"+
		"\2\2\u0335\u0336\5\u00e2r\2\u0336\u0337\7\16\2\2\u0337\u0339\3\2\2\2\u0338"+
		"\u0331\3\2\2\2\u0338\u0335\3\2\2\2\u0339\61\3\2\2\2\u033a\u033b\5`\61"+
		"\2\u033b\u033c\7\16\2\2\u033c\63\3\2\2\2\u033d\u0342\5\u00eex\2\u033e"+
		"\u033f\7\22\2\2\u033f\u0340\5\u0106\u0084\2\u0340\u0341\7\23\2\2\u0341"+
		"\u0343\3\2\2\2\u0342\u033e\3\2\2\2\u0342\u0343\3\2\2\2\u0343\u0344\3\2"+
		"\2\2\u0344\u0347\5\u00dco\2\u0345\u0346\7+\2\2\u0346\u0348\5\u0128\u0095"+
		"\2\u0347\u0345\3\2\2\2\u0347\u0348\3\2\2\2\u0348\65\3\2\2\2\u0349\u0351"+
		"\58\35\2\u034a\u034e\7\26\2\2\u034b\u034c\5\u0114\u008b\2\u034c\u034d"+
		"\7\27\2\2\u034d\u034f\3\2\2\2\u034e\u034b\3\2\2\2\u034e\u034f\3\2\2\2"+
		"\u034f\u0351\3\2\2\2\u0350\u0349\3\2\2\2\u0350\u034a\3\2\2\2\u0351\67"+
		"\3\2\2\2\u0352\u0368\5\\/\2\u0353\u0368\5\u008cG\2\u0354\u0368\5\u0090"+
		"I\2\u0355\u0368\5<\37\2\u0356\u0368\5z>\2\u0357\u0368\5~@\2\u0358\u0368"+
		"\5:\36\2\u0359\u0368\5V,\2\u035a\u0368\5X-\2\u035b\u0368\5L\'\2\u035c"+
		"\u0368\5B\"\2\u035d\u0368\5F$\2\u035e\u0368\5J&\2\u035f\u0368\5H%\2\u0360"+
		"\u0368\5R*\2\u0361\u0368\5P)\2\u0362\u0368\5t;\2\u0363\u0368\5> \2\u0364"+
		"\u0368\5@!\2\u0365\u0368\5,\27\2\u0366\u0368\5\u010a\u0086\2\u0367\u0352"+
		"\3\2\2\2\u0367\u0353\3\2\2\2\u0367\u0354\3\2\2\2\u0367\u0355\3\2\2\2\u0367"+
		"\u0356\3\2\2\2\u0367\u0357\3\2\2\2\u0367\u0358\3\2\2\2\u0367\u0359\3\2"+
		"\2\2\u0367\u035a\3\2\2\2\u0367\u035b\3\2\2\2\u0367\u035c\3\2\2\2\u0367"+
		"\u035d\3\2\2\2\u0367\u035e\3\2\2\2\u0367\u035f\3\2\2\2\u0367\u0360\3\2"+
		"\2\2\u0367\u0361\3\2\2\2\u0367\u0362\3\2\2\2\u0367\u0363\3\2\2\2\u0367"+
		"\u0364\3\2\2\2\u0367\u0365\3\2\2\2\u0367\u0366\3\2\2\2\u03689\3\2\2\2"+
		"\u0369\u036a\7m\2\2\u036a\u036b\7\22\2\2\u036b\u036c\7\23\2\2\u036c\u036d"+
		"\7\16\2\2\u036d;\3\2\2\2\u036e\u036f\7^\2\2\u036f\u0370\7\22\2\2\u0370"+
		"\u0371\5\u00ba^\2\u0371\u0378\7\23\2\2\u0372\u0373\7L\2\2\u0373\u0374"+
		"\7\u0095\2\2\u0374\u0375\7\22\2\2\u0375\u0376\5\u00ba^\2\u0376\u0377\7"+
		"\23\2\2\u0377\u0379\3\2\2\2\u0378\u0372\3\2\2\2\u0378\u0379\3\2\2\2\u0379"+
		"\u0380\3\2\2\2\u037a\u037b\7\u0095\2\2\u037b\u037c\7\22\2\2\u037c\u037d"+
		"\5\u00ba^\2\u037d\u037e\7\23\2\2\u037e\u0380\3\2\2\2\u037f\u036e\3\2\2"+
		"\2\u037f\u037a\3\2\2\2\u0380\u0387\3\2\2\2\u0381\u0382\7\u00a0\2\2\u0382"+
		"\u0383\5\u0148\u00a5\2\u0383\u0384\7\22\2\2\u0384\u0385\5`\61\2\u0385"+
		"\u0386\7\23\2\2\u0386\u0388\3\2\2\2\u0387\u0381\3\2\2\2\u0387\u0388\3"+
		"\2\2\2\u0388\u038f\3\2\2\2\u0389\u038a\7\u0099\2\2\u038a\u038b\7\26\2"+
		"\2\u038b\u038c\5\u0114\u008b\2\u038c\u038d\7\27\2\2\u038d\u0390\3\2\2"+
		"\2\u038e\u0390\7\16\2\2\u038f\u0389\3\2\2\2\u038f\u038e\3\2\2\2\u0390"+
		"=\3\2\2\2\u0391\u0392\7\u00a0\2\2\u0392\u0393\7\22\2\2\u0393\u0394\5\u0142"+
		"\u00a2\2\u0394\u0395\7\23\2\2\u0395\u0396\5\66\34\2\u0396?\3\2\2\2\u0397"+
		"\u0398\7\u00a0\2\2\u0398\u0399\7\22\2\2\u0399\u039a\5\u00e0q\2\u039a\u039b"+
		"\7\23\2\2\u039b\u039c\5\66\34\2\u039cA\3\2\2\2\u039d\u039e\7\u0097\2\2"+
		"\u039e\u039f\7\22\2\2\u039f\u03a0\5`\61\2\u03a0\u03a1\7\23\2\2\u03a1\u03a2"+
		"\7\26\2\2\u03a2\u03a8\5\u0118\u008d\2\u03a3\u03a4\7\\\2\2\u03a4\u03a6"+
		"\7\r\2\2\u03a5\u03a7\5\u0114\u008b\2\u03a6\u03a5\3\2\2\2\u03a6\u03a7\3"+
		"\2\2\2\u03a7\u03a9\3\2\2\2\u03a8\u03a3\3\2\2\2\u03a8\u03a9\3\2\2\2\u03a9"+
		"\u03aa\3\2\2\2\u03aa\u03ab\7\27\2\2\u03abC\3\2\2\2\u03ac\u03ad\7V\2\2"+
		"\u03ad\u03ae\5\u011e\u0090\2\u03ae\u03af\7\r\2\2\u03af\u03b0\5\u0114\u008b"+
		"\2\u03b0\u03b8\3\2\2\2\u03b1\u03b2\7V\2\2\u03b2\u03b3\7s\2\2\u03b3\u03b4"+
		"\5\u011c\u008f\2\u03b4\u03b5\7\r\2\2\u03b5\u03b6\5\u0114\u008b\2\u03b6"+
		"\u03b8\3\2\2\2\u03b7\u03ac\3\2\2\2\u03b7\u03b1\3\2\2\2\u03b8E\3\2\2\2"+
		"\u03b9\u03ba\7n\2\2\u03ba\u03bb\7b\2\2\u03bb\u03bc\7\22\2\2\u03bc\u03bf"+
		"\5\u00dco\2\u03bd\u03be\7\17\2\2\u03be\u03c0\5\u00dco\2\u03bf\u03bd\3"+
		"\2\2\2\u03bf\u03c0\3\2\2\2\u03c0\u03c1\3\2\2\2\u03c1\u03c2\7s\2\2\u03c2"+
		"\u03c3\5`\61\2\u03c3\u03c4\7\23\2\2\u03c4\u03c5\5\66\34\2\u03c5G\3\2\2"+
		"\2\u03c6\u03c7\7`\2\2\u03c7\u03c9\7\26\2\2\u03c8\u03ca\5\u0114\u008b\2"+
		"\u03c9\u03c8\3\2\2\2\u03c9\u03ca\3\2\2\2\u03ca\u03cb\3\2\2\2\u03cb\u03cc"+
		"\7\27\2\2\u03cc\u03cd\7\u00a3\2\2\u03cd\u03ce\7\22\2\2\u03ce\u03cf\5`"+
		"\61\2\u03cf\u03d0\7\23\2\2\u03d0\u03d1\7\16\2\2\u03d1I\3\2\2\2\u03d2\u03d3"+
		"\7\u00a3\2\2\u03d3\u03d4\7\22\2\2\u03d4\u03d5\5`\61\2\u03d5\u03d6\7\23"+
		"\2\2\u03d6\u03d7\5\66\34\2\u03d7K\3\2\2\2\u03d8\u03d9\7r\2\2\u03d9\u03da"+
		"\7\22\2\2\u03da\u03db\5`\61\2\u03db\u03dc\7\23\2\2\u03dc\u03de\5\66\34"+
		"\2\u03dd\u03df\5N(\2\u03de\u03dd\3\2\2\2\u03de\u03df\3\2\2\2\u03df\u03e2"+
		"\3\2\2\2\u03e0\u03e1\7c\2\2\u03e1\u03e3\5\66\34\2\u03e2\u03e0\3\2\2\2"+
		"\u03e2\u03e3\3\2\2\2\u03e3M\3\2\2\2\u03e4\u03e5\b(\1\2\u03e5\u03e6\7c"+
		"\2\2\u03e6\u03e7\7r\2\2\u03e7\u03e8\7\22\2\2\u03e8\u03e9\5`\61\2\u03e9"+
		"\u03ea\7\23\2\2\u03ea\u03eb\5\66\34\2\u03eb\u03f6\3\2\2\2\u03ec\u03ed"+
		"\f\3\2\2\u03ed\u03ee\7c\2\2\u03ee\u03ef\7r\2\2\u03ef\u03f0\7\22\2\2\u03f0"+
		"\u03f1\5`\61\2\u03f1\u03f2\7\23\2\2\u03f2\u03f3\5\66\34\2\u03f3\u03f5"+
		"\3\2\2\2\u03f4\u03ec\3\2\2\2\u03f5\u03f8\3\2\2\2\u03f6\u03f4\3\2\2\2\u03f6"+
		"\u03f7\3\2\2\2\u03f7O\3\2\2\2\u03f8\u03f6\3\2\2\2\u03f9\u03fa\7\u009b"+
		"\2\2\u03fa\u03fb\5`\61\2\u03fb\u03fc\7\16\2\2\u03fcQ\3\2\2\2\u03fd\u03fe"+
		"\7\u009d\2\2\u03fe\u03ff\7\22\2\2\u03ff\u0400\5\u00dco\2\u0400\u0401\7"+
		"\23\2\2\u0401\u0403\7\26\2\2\u0402\u0404\5\u0114\u008b\2\u0403\u0402\3"+
		"\2\2\2\u0403\u0404\3\2\2\2\u0404\u0405\3\2\2\2\u0405\u0407\7\27\2\2\u0406"+
		"\u0408\5\u011a\u008e\2\u0407\u0406\3\2\2\2\u0407\u0408\3\2\2\2\u0408\u0412"+
		"\3\2\2\2\u0409\u040a\7W\2\2\u040a\u040b\7\22\2\2\u040b\u040c\7M\2\2\u040c"+
		"\u040d\7\23\2\2\u040d\u040f\7\26\2\2\u040e\u0410\5\u0114\u008b\2\u040f"+
		"\u040e\3\2\2\2\u040f\u0410\3\2\2\2\u0410\u0411\3\2\2\2\u0411\u0413\7\27"+
		"\2\2\u0412\u0409\3\2\2\2\u0412\u0413\3\2\2\2\u0413\u041a\3\2\2\2\u0414"+
		"\u0415\7l\2\2\u0415\u0417\7\26\2\2\u0416\u0418\5\u0114\u008b\2\u0417\u0416"+
		"\3\2\2\2\u0417\u0418\3\2\2\2\u0418\u0419\3\2\2\2\u0419\u041b\7\27\2\2"+
		"\u041a\u0414\3\2\2\2\u041a\u041b\3\2\2\2\u041bS\3\2\2\2\u041c\u041d\7"+
		"W\2\2\u041d\u041e\7\22\2\2\u041e\u041f\5\u00e2r\2\u041f\u0420\7\23\2\2"+
		"\u0420\u0422\7\26\2\2\u0421\u0423\5\u0114\u008b\2\u0422\u0421\3\2\2\2"+
		"\u0422\u0423\3\2\2\2\u0423\u0424\3\2\2\2\u0424\u0425\7\27\2\2\u0425\u0432"+
		"\3\2\2\2\u0426\u0427\7W\2\2\u0427\u0428\7s\2\2\u0428\u0429\7\22\2\2\u0429"+
		"\u042a\5\u00b2Z\2\u042a\u042b\7\23\2\2\u042b\u042d\7\26\2\2\u042c\u042e"+
		"\5\u0114\u008b\2\u042d\u042c\3\2\2\2\u042d\u042e\3\2\2\2\u042e\u042f\3"+
		"\2\2\2\u042f\u0430\7\27\2\2\u0430\u0432\3\2\2\2\u0431\u041c\3\2\2\2\u0431"+
		"\u0426\3\2\2\2\u0432U\3\2\2\2\u0433\u0434\7T\2\2\u0434\u0435\7\16\2\2"+
		"\u0435W\3\2\2\2\u0436\u0438\7\u008d\2\2\u0437\u0439\5`\61\2\u0438\u0437"+
		"\3\2\2\2\u0438\u0439\3\2\2\2\u0439\u043a\3\2\2\2\u043a\u043b\7\16\2\2"+
		"\u043bY\3\2\2\2\u043c\u043d\5\u00d0i\2\u043d\u043f\7\22\2\2\u043e\u0440"+
		"\5\u0088E\2\u043f\u043e\3\2\2\2\u043f\u0440\3\2\2\2\u0440\u0441\3\2\2"+
		"\2\u0441\u0442\7\23\2\2\u0442[\3\2\2\2\u0443\u0444\5j\66\2\u0444\u0445"+
		"\7\21\2\2\u0445\u0447\3\2\2\2\u0446\u0443\3\2\2\2\u0446\u0447\3\2\2\2"+
		"\u0447\u0448\3\2\2\2\u0448\u0453\5Z.\2\u0449\u044c\7\u0099\2\2\u044a\u044b"+
		"\7\u00a0\2\2\u044b\u044d\5\u00dco\2\u044c\u044a\3\2\2\2\u044c\u044d\3"+
		"\2\2\2\u044d\u044e\3\2\2\2\u044e\u044f\7\26\2\2\u044f\u0450\5\u0114\u008b"+
		"\2\u0450\u0451\7\27\2\2\u0451\u0454\3\2\2\2\u0452\u0454\7\16\2\2\u0453"+
		"\u0449\3\2\2\2\u0453\u0452\3\2\2\2\u0454]\3\2\2\2\u0455\u0456\5\u0204"+
		"\u0103\2\u0456_\3\2\2\2\u0457\u0458\b\61\1\2\u0458\u0475\5\u0204\u0103"+
		"\2\u0459\u0475\5\u01e4\u00f3\2\u045a\u0475\5j\66\2\u045b\u0475\5l\67\2"+
		"\u045c\u0475\5\u014a\u00a6\2\u045d\u045e\7\37\2\2\u045e\u0475\5`\61\32"+
		"\u045f\u0460\7\31\2\2\u0460\u0475\5`\61\31\u0461\u0463\7\22\2\2\u0462"+
		"\u0464\7|\2\2\u0463\u0462\3\2\2\2\u0463\u0464\3\2\2\2\u0464\u0465\3\2"+
		"\2\2\u0465\u0466\5\u00eex\2\u0466\u0467\7\23\2\2\u0467\u0468\5`\61\30"+
		"\u0468\u0475\3\2\2\2\u0469\u046a\7?\2\2\u046a\u046b\7\22\2\2\u046b\u046c"+
		"\5`\61\2\u046c\u046d\7\23\2\2\u046d\u0475\3\2\2\2\u046e\u046f\7g\2\2\u046f"+
		"\u0470\7\22\2\2\u0470\u0471\5\u00dco\2\u0471\u0472\7\23\2\2\u0472\u0475"+
		"\3\2\2\2\u0473\u0475\5f\64\2\u0474\u0457\3\2\2\2\u0474\u0459\3\2\2\2\u0474"+
		"\u045a\3\2\2\2\u0474\u045b\3\2\2\2\u0474\u045c\3\2\2\2\u0474\u045d\3\2"+
		"\2\2\u0474\u045f\3\2\2\2\u0474\u0461\3\2\2\2\u0474\u0469\3\2\2\2\u0474"+
		"\u046e\3\2\2\2\u0474\u0473\3\2\2\2\u0475\u04d2\3\2\2\2\u0476\u0477\f\27"+
		"\2\2\u0477\u0478\5\u016e\u00b8\2\u0478\u0479\5`\61\30\u0479\u04d1\3\2"+
		"\2\2\u047a\u047b\f\26\2\2\u047b\u047c\5\u0170\u00b9\2\u047c\u047d\5`\61"+
		"\27\u047d\u04d1\3\2\2\2\u047e\u047f\f\25\2\2\u047f\u0480\5\u0174\u00bb"+
		"\2\u0480\u0481\5`\61\26\u0481\u04d1\3\2\2\2\u0482\u0483\f\24\2\2\u0483"+
		"\u0484\5\u0172\u00ba\2\u0484\u0485\5`\61\25\u0485\u04d1\3\2\2\2\u0486"+
		"\u0487\f\23\2\2\u0487\u0488\t\2\2\2\u0488\u04d1\5`\61\24\u0489\u048a\f"+
		"\22\2\2\u048a\u048b\t\3\2\2\u048b\u04d1\5`\61\23\u048c\u048d\f\20\2\2"+
		"\u048d\u048f\7w\2\2\u048e\u0490\7\177\2\2\u048f\u048e\3\2\2\2\u048f\u0490"+
		"\3\2\2\2\u0490\u0491\3\2\2\2\u0491\u04d1\5`\61\21\u0492\u0493\f\17\2\2"+
		"\u0493\u0494\t\4\2\2\u0494\u04d1\5`\61\20\u0495\u0497\f\16\2\2\u0496\u0498"+
		"\7\177\2\2\u0497\u0496\3\2\2\2\u0497\u0498\3\2\2\2\u0498\u0499\3\2\2\2"+
		"\u0499\u049a\7Z\2\2\u049a\u04d1\5`\61\17\u049b\u049d\f\r\2\2\u049c\u049e"+
		"\7\177\2\2\u049d\u049c\3\2\2\2\u049d\u049e\3\2\2\2\u049e\u049f\3\2\2\2"+
		"\u049f\u04a0\7s\2\2\u04a0\u04d1\5`\61\16\u04a1\u04a3\f\f\2\2\u04a2\u04a4"+
		"\7\177\2\2\u04a3\u04a2\3\2\2\2\u04a3\u04a4\3\2\2\2\u04a4\u04a5\3\2\2\2"+
		"\u04a5\u04a6\7q\2\2\u04a6\u04d1\5`\61\r\u04a7\u04a8\f\t\2\2\u04a8\u04a9"+
		"\7\35\2\2\u04a9\u04d1\5`\61\n\u04aa\u04ab\f\b\2\2\u04ab\u04ac\7\33\2\2"+
		"\u04ac\u04d1\5`\61\t\u04ad\u04ae\f\7\2\2\u04ae\u04af\7\30\2\2\u04af\u04b0"+
		"\5`\61\2\u04b0\u04b1\7\r\2\2\u04b1\u04b2\5`\61\b\u04b2\u04d1\3\2\2\2\u04b3"+
		"\u04b4\f\21\2\2\u04b4\u04b6\7w\2\2\u04b5\u04b7\7\177\2\2\u04b6\u04b5\3"+
		"\2\2\2\u04b6\u04b7\3\2\2\2\u04b7\u04b8\3\2\2\2\u04b8\u04d1\5d\63\2\u04b9"+
		"\u04bb\f\13\2\2\u04ba\u04bc\7\177\2\2\u04bb\u04ba\3\2\2\2\u04bb\u04bc"+
		"\3\2\2\2\u04bc\u04bd\3\2\2\2\u04bd\u04be\7q\2\2\u04be\u04bf\7J\2\2\u04bf"+
		"\u04d1\5b\62\2\u04c0\u04c2\f\n\2\2\u04c1\u04c3\7\177\2\2\u04c2\u04c1\3"+
		"\2\2\2\u04c2\u04c3\3\2\2\2\u04c3\u04c4\3\2\2\2\u04c4\u04c5\7q\2\2\u04c5"+
		"\u04c6\7M\2\2\u04c6\u04d1\5b\62\2\u04c7\u04c8\f\3\2\2\u04c8\u04c9\7n\2"+
		"\2\u04c9\u04ca\7b\2\2\u04ca\u04cb\7\22\2\2\u04cb\u04cc\5\u00dco\2\u04cc"+
		"\u04cd\7s\2\2\u04cd\u04ce\5`\61\2\u04ce\u04cf\7\23\2\2\u04cf\u04d1\3\2"+
		"\2\2\u04d0\u0476\3\2\2\2\u04d0\u047a\3\2\2\2\u04d0\u047e\3\2\2\2\u04d0"+
		"\u0482\3\2\2\2\u04d0\u0486\3\2\2\2\u04d0\u0489\3\2\2\2\u04d0\u048c\3\2"+
		"\2\2\u04d0\u0492\3\2\2\2\u04d0\u0495\3\2\2\2\u04d0\u049b\3\2\2\2\u04d0"+
		"\u04a1\3\2\2\2\u04d0\u04a7\3\2\2\2\u04d0\u04aa\3\2\2\2\u04d0\u04ad\3\2"+
		"\2\2\u04d0\u04b3\3\2\2\2\u04d0\u04b9\3\2\2\2\u04d0\u04c0\3\2\2\2\u04d0"+
		"\u04c7\3\2\2\2\u04d1\u04d4\3\2\2\2\u04d2\u04d0\3\2\2\2\u04d2\u04d3\3\2"+
		"\2\2\u04d3a\3\2\2\2\u04d4\u04d2\3\2\2\2\u04d5\u04d6\7\u00a2\2\2\u04d6"+
		"\u04d7\7\22\2\2\u04d7\u04d8\5\u014a\u00a6\2\u04d8\u04d9\7\23\2\2\u04d9"+
		"\u04e4\3\2\2\2\u04da\u04db\7\22\2\2\u04db\u04dc\5\u00dco\2\u04dc\u04dd"+
		"\7\23\2\2\u04dd\u04de\7\u00a2\2\2\u04de\u04df\7\22\2\2\u04df\u04e0\5`"+
		"\61\2\u04e0\u04e1\7\23\2\2\u04e1\u04e4\3\2\2\2\u04e2\u04e4\5`\61\2\u04e3"+
		"\u04d5\3\2\2\2\u04e3\u04da\3\2\2\2\u04e3\u04e2\3\2\2\2\u04e4c\3\2\2\2"+
		"\u04e5\u04e6\6\63\27\3\u04e6\u04e7\7\u00ab\2\2\u04e7\u04e8\5\u00eex\2"+
		"\u04e8e\3\2\2\2\u04e9\u04ea\5\u00e0q\2\u04eag\3\2\2\2\u04eb\u04f2\5n8"+
		"\2\u04ec\u04f2\5\u0126\u0094\2\u04ed\u04f2\5\u0128\u0095\2\u04ee\u04f2"+
		"\5\u00d8m\2\u04ef\u04f2\5\u0122\u0092\2\u04f0\u04f2\5\u0124\u0093\2\u04f1"+
		"\u04eb\3\2\2\2\u04f1\u04ec\3\2\2\2\u04f1\u04ed\3\2\2\2\u04f1\u04ee\3\2"+
		"\2\2\u04f1\u04ef\3\2\2\2\u04f1\u04f0\3\2\2\2\u04f2i\3\2\2\2\u04f3\u04f4"+
		"\b\66\1\2\u04f4\u04f5\5h\65\2\u04f5\u04fa\3\2\2\2\u04f6\u04f7\f\3\2\2"+
		"\u04f7\u04f9\5\u0082B\2\u04f8\u04f6\3\2\2\2\u04f9\u04fc\3\2\2\2\u04fa"+
		"\u04f8\3\2\2\2\u04fa\u04fb\3\2\2\2\u04fbk\3\2\2\2\u04fc\u04fa\3\2\2\2"+
		"\u04fd\u04fe\b\67\1\2\u04fe\u04ff\7|\2\2\u04ff\u0500\5\u00d8m\2\u0500"+
		"\u0505\3\2\2\2\u0501\u0502\f\3\2\2\u0502\u0504\5\u0082B\2\u0503\u0501"+
		"\3\2\2\2\u0504\u0507\3\2\2\2\u0505\u0503\3\2\2\2\u0505\u0506\3\2\2\2\u0506"+
		"m\3\2\2\2\u0507\u0505\3\2\2\2\u0508\u0513\5p9\2\u0509\u0513\5r:\2\u050a"+
		"\u0513\5v<\2\u050b\u0513\5x=\2\u050c\u0513\5\u0152\u00aa\2\u050d\u0513"+
		"\5\u0154\u00ab\2\u050e\u0513\5\u0156\u00ac\2\u050f\u0513\5\u0080A\2\u0510"+
		"\u0513\5Z.\2\u0511\u0513\5\u0084C\2\u0512\u0508\3\2\2\2\u0512\u0509\3"+
		"\2\2\2\u0512\u050a\3\2\2\2\u0512\u050b\3\2\2\2\u0512\u050c\3\2\2\2\u0512"+
		"\u050d\3\2\2\2\u0512\u050e\3\2\2\2\u0512\u050f\3\2\2\2\u0512\u0510\3\2"+
		"\2\2\u0512\u0511\3\2\2\2\u0513o\3\2\2\2\u0514\u0515\7A\2\2\u0515\u0516"+
		"\7\22\2\2\u0516\u0517\5`\61\2\u0517\u0518\7\23\2\2\u0518q\3\2\2\2\u0519"+
		"\u051a\7@\2\2\u051a\u051e\7\22\2\2\u051b\u051c\7o\2\2\u051c\u051d\7+\2"+
		"\2\u051d\u051f\5`\61\2\u051e\u051b\3\2\2\2\u051e\u051f\3\2\2\2\u051f\u0520"+
		"\3\2\2\2\u0520\u0521\7\23\2\2\u0521s\3\2\2\2\u0522\u0523\7\u00a4\2\2\u0523"+
		"\u0524\7\22\2\2\u0524\u0525\5`\61\2\u0525\u0526\7\23\2\2\u0526\u0527\7"+
		"\u009c\2\2\u0527\u052a\5`\61\2\u0528\u052b\5|?\2\u0529\u052b\7\16\2\2"+
		"\u052a\u0528\3\2\2\2\u052a\u0529\3\2\2\2\u052bu\3\2\2\2\u052c\u052d\7"+
		"k\2\2\u052d\u052e\7\22\2\2\u052e\u052f\5`\61\2\u052f\u0535\7\23\2\2\u0530"+
		"\u0531\7\u00a0\2\2\u0531\u0532\7\22\2\2\u0532\u0533\5\u00dco\2\u0533\u0534"+
		"\7\23\2\2\u0534\u0536\3\2\2\2\u0535\u0530\3\2\2\2\u0535\u0536\3\2\2\2"+
		"\u0536\u0537\3\2\2\2\u0537\u0538\7\u00a2\2\2\u0538\u0539\7\22\2\2\u0539"+
		"\u053a\5`\61\2\u053a\u053b\7\23\2\2\u053bw\3\2\2\2\u053c\u053d\7j\2\2"+
		"\u053d\u0542\7\u0083\2\2\u053e\u053f\7\22\2\2\u053f\u0540\5\u00c6d\2\u0540"+
		"\u0541\7\23\2\2\u0541\u0543\3\2\2\2\u0542\u053e\3\2\2\2\u0542\u0543\3"+
		"\2\2\2\u0543\u0544\3\2\2\2\u0544\u0545\7\u00a2\2\2\u0545\u0546\7\22\2"+
		"\2\u0546\u0547\5`\61\2\u0547\u054d\7\23\2\2\u0548\u0549\7t\2\2\u0549\u054a"+
		"\7\22\2\2\u054a\u054b\5\u015c\u00af\2\u054b\u054c\7\23\2\2\u054c\u054e"+
		"\3\2\2\2\u054d\u0548\3\2\2\2\u054d\u054e\3\2\2\2\u054e\u057d\3\2\2\2\u054f"+
		"\u0564\7j\2\2\u0550\u0555\7J\2\2\u0551\u0552\7\22\2\2\u0552\u0553\5\u00c6"+
		"d\2\u0553\u0554\7\23\2\2\u0554\u0556\3\2\2\2\u0555\u0551\3\2\2\2\u0555"+
		"\u0556\3\2\2\2\u0556\u0565\3\2\2\2\u0557\u0558\7\22\2\2\u0558\u0559\5"+
		"\u00c6d\2\u0559\u055a\7\23\2\2\u055a\u055c\3\2\2\2\u055b\u0557\3\2\2\2"+
		"\u055b\u055c\3\2\2\2\u055c\u055d\3\2\2\2\u055d\u055e\7\u008f\2\2\u055e"+
		"\u055f\7\22\2\2\u055f\u0560\5`\61\2\u0560\u0561\7\u009c\2\2\u0561\u0562"+
		"\5`\61\2\u0562\u0563\7\23\2\2\u0563\u0565\3\2\2\2\u0564\u0550\3\2\2\2"+
		"\u0564\u055b\3\2\2\2\u0565\u056b\3\2\2\2\u0566\u0567\7\u00a2\2\2\u0567"+
		"\u0568\7\22\2\2\u0568\u0569\5`\61\2\u0569\u056a\7\23\2\2\u056a\u056c\3"+
		"\2\2\2\u056b\u0566\3\2\2\2\u056b\u056c\3\2\2\2\u056c\u0572\3\2\2\2\u056d"+
		"\u056e\7t\2\2\u056e\u056f\7\22\2\2\u056f\u0570\5\u015c\u00af\2\u0570\u0571"+
		"\7\23\2\2\u0571\u0573\3\2\2\2\u0572\u056d\3\2\2\2\u0572\u0573\3\2\2\2"+
		"\u0573\u057a\3\2\2\2\u0574\u0575\7\u0086\2\2\u0575\u0576\7U\2\2\u0576"+
		"\u0577\7\22\2\2\u0577\u0578\5\u0158\u00ad\2\u0578\u0579\7\23\2\2\u0579"+
		"\u057b\3\2\2\2\u057a\u0574\3\2\2\2\u057a\u057b\3\2\2\2\u057b\u057d\3\2"+
		"\2\2\u057c\u053c\3\2\2\2\u057c\u054f\3\2\2\2\u057dy\3\2\2\2\u057e\u057f"+
		"\7j\2\2\u057f\u0584\7\u0083\2\2\u0580\u0581\7\22\2\2\u0581\u0582\5\u00c6"+
		"d\2\u0582\u0583\7\23\2\2\u0583\u0585\3\2\2\2\u0584\u0580\3\2\2\2\u0584"+
		"\u0585\3\2\2\2\u0585\u0586\3\2\2\2\u0586\u0587\7\u00a2\2\2\u0587\u0588"+
		"\7\22\2\2\u0588\u0589\5`\61\2\u0589\u058f\7\23\2\2\u058a\u058b\7t\2\2"+
		"\u058b\u058c\7\22\2\2\u058c\u058d\5\u015c\u00af\2\u058d\u058e\7\23\2\2"+
		"\u058e\u0590\3\2\2\2\u058f\u058a\3\2\2\2\u058f\u0590\3\2\2\2\u0590\u0591"+
		"\3\2\2\2\u0591\u0592\5|?\2\u0592\u05c2\3\2\2\2\u0593\u05a8\7j\2\2\u0594"+
		"\u0599\7J\2\2\u0595\u0596\7\22\2\2\u0596\u0597\5\u00c6d\2\u0597\u0598"+
		"\7\23\2\2\u0598\u059a\3\2\2\2\u0599\u0595\3\2\2\2\u0599\u059a\3\2\2\2"+
		"\u059a\u05a9\3\2\2\2\u059b\u059c\7\22\2\2\u059c\u059d\5\u00c6d\2\u059d"+
		"\u059e\7\23\2\2\u059e\u05a0\3\2\2\2\u059f\u059b\3\2\2\2\u059f\u05a0\3"+
		"\2\2\2\u05a0\u05a1\3\2\2\2\u05a1\u05a2\7\u008f\2\2\u05a2\u05a3\7\22\2"+
		"\2\u05a3\u05a4\5`\61\2\u05a4\u05a5\7\u009c\2\2\u05a5\u05a6\5`\61\2\u05a6"+
		"\u05a7\7\23\2\2\u05a7\u05a9\3\2\2\2\u05a8\u0594\3\2\2\2\u05a8\u059f\3"+
		"\2\2\2\u05a9\u05af\3\2\2\2\u05aa\u05ab\7\u00a2\2\2\u05ab\u05ac\7\22\2"+
		"\2\u05ac\u05ad\5`\61\2\u05ad\u05ae\7\23\2\2\u05ae\u05b0\3\2\2\2\u05af"+
		"\u05aa\3\2\2\2\u05af\u05b0\3\2\2\2\u05b0\u05b6\3\2\2\2\u05b1\u05b2\7t"+
		"\2\2\u05b2\u05b3\7\22\2\2\u05b3\u05b4\5\u015c\u00af\2\u05b4\u05b5\7\23"+
		"\2\2\u05b5\u05b7\3\2\2\2\u05b6\u05b1\3\2\2\2\u05b6\u05b7\3\2\2\2\u05b7"+
		"\u05be\3\2\2\2\u05b8\u05b9\7\u0086\2\2\u05b9\u05ba\7U\2\2\u05ba\u05bb"+
		"\7\22\2\2\u05bb\u05bc\5\u0158\u00ad\2\u05bc\u05bd\7\23\2\2\u05bd\u05bf"+
		"\3\2\2\2\u05be\u05b8\3\2\2\2\u05be\u05bf\3\2\2\2\u05bf\u05c0\3\2\2\2\u05c0"+
		"\u05c2\5|?\2\u05c1\u057e\3\2\2\2\u05c1\u0593\3\2\2\2\u05c2{\3\2\2\2\u05c3"+
		"\u05c4\7\u0099\2\2\u05c4\u05c5\7\u00a0\2\2\u05c5\u05c6\5\u00dco\2\u05c6"+
		"\u05c7\7\26\2\2\u05c7\u05c8\5\u0114\u008b\2\u05c8\u05c9\7\27\2\2\u05c9"+
		"}\3\2\2\2\u05ca\u05cb\7\u008a\2\2\u05cb\u05cc\7J\2\2\u05cc\u05cd\7o\2"+
		"\2\u05cd\u05ce\5`\61\2\u05ce\u05cf\5|?\2\u05cf\177\3\2\2\2\u05d0\u05d2"+
		"\7\u0093\2\2\u05d1\u05d3\7_\2\2\u05d2\u05d1\3\2\2\2\u05d2\u05d3\3\2\2"+
		"\2\u05d3\u05d4\3\2\2\2\u05d4\u05d5\7\22\2\2\u05d5\u05db\5j\66\2\u05d6"+
		"\u05d7\7\17\2\2\u05d7\u05d8\5\u0164\u00b3\2\u05d8\u05d9\7+\2\2\u05d9\u05da"+
		"\5\u0150\u00a9\2\u05da\u05dc\3\2\2\2\u05db\u05d6\3\2\2\2\u05db\u05dc\3"+
		"\2\2\2\u05dc\u05dd\3\2\2\2\u05dd\u05de\7\23\2\2\u05de\u0081\3\2\2\2\u05df"+
		"\u05e0\7\21\2\2\u05e0\u05ec\5\u00dan\2\u05e1\u05e2\7\21\2\2\u05e2\u05ec"+
		"\5Z.\2\u05e3\u05e4\7\24\2\2\u05e4\u05e5\5`\61\2\u05e5\u05e6\7\25\2\2\u05e6"+
		"\u05ec\3\2\2\2\u05e7\u05e8\7\24\2\2\u05e8\u05e9\5\u0140\u00a1\2\u05e9"+
		"\u05ea\7\25\2\2\u05ea\u05ec\3\2\2\2\u05eb\u05df\3\2\2\2\u05eb\u05e1\3"+
		"\2\2\2\u05eb\u05e3\3\2\2\2\u05eb\u05e7\3\2\2\2\u05ec\u0083\3\2\2\2\u05ed"+
		"\u05ee\5\u00c6d\2\u05ee\u05ef\7\22\2\2\u05ef\u05f2\5\u0086D\2\u05f0\u05f1"+
		"\7\17\2\2\u05f1\u05f3\5\u0088E\2\u05f2\u05f0\3\2\2\2\u05f2\u05f3\3\2\2"+
		"\2\u05f3\u05f4\3\2\2\2\u05f4\u05f5\7\23\2\2\u05f5\u05fe\3\2\2\2\u05f6"+
		"\u05f7\5\u00c6d\2\u05f7\u05f9\7\22\2\2\u05f8\u05fa\5\u0088E\2\u05f9\u05f8"+
		"\3\2\2\2\u05f9\u05fa\3\2\2\2\u05fa\u05fb\3\2\2\2\u05fb\u05fc\7\23\2\2"+
		"\u05fc\u05fe\3\2\2\2\u05fd\u05ed\3\2\2\2\u05fd\u05f6\3\2\2\2\u05fe\u0085"+
		"\3\2\2\2\u05ff\u0600\7o\2\2\u0600\u0601\5\u016c\u00b7\2\u0601\u0602\5"+
		"`\61\2\u0602\u0603\6D\32\3\u0603\u0087\3\2\2\2\u0604\u0605\bE\1\2\u0605"+
		"\u0606\5`\61\2\u0606\u0607\6E\33\3\u0607\u060a\3\2\2\2\u0608\u060a\5\u008a"+
		"F\2\u0609\u0604\3\2\2\2\u0609\u0608\3\2\2\2\u060a\u0610\3\2\2\2\u060b"+
		"\u060c\f\3\2\2\u060c\u060d\7\17\2\2\u060d\u060f\5\u008aF\2\u060e\u060b"+
		"\3\2\2\2\u060f\u0612\3\2\2\2\u0610\u060e\3\2\2\2\u0610\u0611\3\2\2\2\u0611"+
		"\u0089\3\2\2\2\u0612\u0610\3\2\2\2\u0613\u0617\5\u00dco\2\u0614\u0615"+
		"\5\u016c\u00b7\2\u0615\u0616\5`\61\2\u0616\u0618\3\2\2\2\u0617\u0614\3"+
		"\2\2\2\u0617\u0618\3\2\2\2\u0618\u008b\3\2\2\2\u0619\u061a\5\u0144\u00a3"+
		"\2\u061a\u061b\5\u016c\u00b7\2\u061b\u061c\5`\61\2\u061c\u061d\7\16\2"+
		"\2\u061d\u008d\3\2\2\2\u061e\u061f\7\21\2\2\u061f\u0625\5\u00dco\2\u0620"+
		"\u0621\7\24\2\2\u0621\u0622\5`\61\2\u0622\u0623\7\25\2\2\u0623\u0625\3"+
		"\2\2\2\u0624\u061e\3\2\2\2\u0624\u0620\3\2\2\2\u0625\u008f\3\2\2\2\u0626"+
		"\u0627\5\u0104\u0083\2\u0627\u0628\5\u016c\u00b7\2\u0628\u0629\5`\61\2"+
		"\u0629\u062a\7\16\2\2\u062a\u0091\3\2\2\2\u062b\u062c\5\u00eex\2\u062c"+
		"\u0093\3\2\2\2\u062d\u062e\7\u0081\2\2\u062e\u0095\3\2\2\2\u062f\u0631"+
		"\t\5\2\2\u0630\u062f\3\2\2\2\u0631\u0634\3\2\2\2\u0632\u0630\3\2\2\2\u0632"+
		"\u0633\3\2\2\2\u0633\u0097\3\2\2\2\u0634\u0632\3\2\2\2\u0635\u0639\5\u009e"+
		"P\2\u0636\u0639\58\35\2\u0637\u0639\5`\61\2\u0638\u0635\3\2\2\2\u0638"+
		"\u0636\3\2\2\2\u0638\u0637\3\2\2\2\u0639\u0099\3\2\2\2\u063a\u063c\5\u0176"+
		"\u00bc\2\u063b\u063d\5\u009cO\2\u063c\u063b\3\2\2\2\u063c\u063d\3\2\2"+
		"\2\u063d\u063e\3\2\2\2\u063e\u063f\5\u0176\u00bc\2\u063f\u0640\7\2\2\3"+
		"\u0640\u009b\3\2\2\2\u0641\u0647\5\u009eP\2\u0642\u0643\5\u0178\u00bd"+
		"\2\u0643\u0644\5\u009eP\2\u0644\u0646\3\2\2\2\u0645\u0642\3\2\2\2\u0646"+
		"\u0649\3\2\2\2\u0647\u0645\3\2\2\2\u0647\u0648\3\2\2\2\u0648\u009d\3\2"+
		"\2\2\u0649\u0647\3\2\2\2\u064a\u064b\5\u010a\u0086\2\u064b\u064c\5\u0178"+
		"\u00bd\2\u064c\u064e\3\2\2\2\u064d\u064a\3\2\2\2\u064e\u0651\3\2\2\2\u064f"+
		"\u064d\3\2\2\2\u064f\u0650\3\2\2\2\u0650\u0657\3\2\2\2\u0651\u064f\3\2"+
		"\2\2\u0652\u0653\5\u00a0Q\2\u0653\u0654\5\u0178\u00bd\2\u0654\u0656\3"+
		"\2\2\2\u0655\u0652\3\2\2\2\u0656\u0659\3\2\2\2\u0657\u0655\3\2\2\2\u0657"+
		"\u0658\3\2\2\2\u0658\u0660\3\2\2\2\u0659\u0657\3\2\2\2\u065a\u0661\5\n"+
		"\6\2\u065b\u0661\5\u00caf\2\u065c\u0661\5\u00aaV\2\u065d\u0661\5\u00ac"+
		"W\2\u065e\u0661\5\u00ccg\2\u065f\u0661\5\u0108\u0085\2\u0660\u065a\3\2"+
		"\2\2\u0660\u065b\3\2\2\2\u0660\u065c\3\2\2\2\u0660\u065d\3\2\2\2\u0660"+
		"\u065e\3\2\2\2\u0660\u065f\3\2\2\2\u0661\u009f\3\2\2\2\u0662\u0671\5\u00a2"+
		"R\2\u0663\u066d\7\22\2\2\u0664\u066e\5\u00a8U\2\u0665\u066a\5\u00a4S\2"+
		"\u0666\u0667\7\17\2\2\u0667\u0669\5\u00a4S\2\u0668\u0666\3\2\2\2\u0669"+
		"\u066c\3\2\2\2\u066a\u0668\3\2\2\2\u066a\u066b\3\2\2\2\u066b\u066e\3\2"+
		"\2\2\u066c\u066a\3\2\2\2\u066d\u0664\3\2\2\2\u066d\u0665\3\2\2\2\u066e"+
		"\u066f\3\2\2\2\u066f\u0670\7\23\2\2\u0670\u0672\3\2\2\2\u0671\u0663\3"+
		"\2\2\2\u0671\u0672\3\2\2\2\u0672\u00a1\3\2\2\2\u0673\u0674\7\u00ae\2\2"+
		"\u0674\u00a3\3\2\2\2\u0675\u0676\5\u00a6T\2\u0676\u0677\7+\2\2\u0677\u0678"+
		"\5\u00a8U\2\u0678\u00a5\3\2\2\2\u0679\u067a\t\6\2\2\u067a\u00a7\3\2\2"+
		"\2\u067b\u067e\5\u0128\u0095\2\u067c\u067e\5\u00c0a\2\u067d\u067b\3\2"+
		"\2\2\u067d\u067c\3\2\2\2\u067e\u00a9\3\2\2\2\u067f\u0680\5\"\22\2\u0680"+
		"\u00ab\3\2\2\2\u0681\u0684\5\2\2\2\u0682\u0684\5\4\3\2\u0683\u0681\3\2"+
		"\2\2\u0683\u0682\3\2\2\2\u0684\u00ad\3\2\2\2\u0685\u068b\5\b\5\2\u0686"+
		"\u0687\5\u0178\u00bd\2\u0687\u0688\5\b\5\2\u0688\u068a\3\2\2\2\u0689\u0686"+
		"\3\2\2\2\u068a\u068d\3\2\2\2\u068b\u0689\3\2\2\2\u068b\u068c\3\2\2\2\u068c"+
		"\u00af\3\2\2\2\u068d\u068b\3\2\2\2\u068e\u0694\5\6\4\2\u068f\u0690\5\u0178"+
		"\u00bd\2\u0690\u0691\5\6\4\2\u0691\u0693\3\2\2\2\u0692\u068f\3\2\2\2\u0693"+
		"\u0696\3\2\2\2\u0694\u0692\3\2\2\2\u0694\u0695\3\2\2\2\u0695\u00b1\3\2"+
		"\2\2\u0696\u0694\3\2\2\2\u0697\u069c\5\u00e2r\2\u0698\u0699\7\17\2\2\u0699"+
		"\u069b\5\u00e2r\2\u069a\u0698\3\2\2\2\u069b\u069e\3\2\2\2\u069c\u069a"+
		"\3\2\2\2\u069c\u069d\3\2\2\2\u069d\u00b3\3\2\2\2\u069e\u069c\3\2\2\2\u069f"+
		"\u06a0\7s\2\2\u06a0\u06aa\5\u00b6\\\2\u06a1\u06a2\7s\2\2\u06a2\u06aa\5"+
		"\u00b8]\2\u06a3\u06a4\7s\2\2\u06a4\u06aa\5\u00bc_\2\u06a5\u06a6\7x\2\2"+
		"\u06a6\u06aa\7\u00af\2\2\u06a7\u06a8\7x\2\2\u06a8\u06aa\5`\61\2\u06a9"+
		"\u069f\3\2\2\2\u06a9\u06a1\3\2\2\2\u06a9\u06a3\3\2\2\2\u06a9\u06a5\3\2"+
		"\2\2\u06a9\u06a7\3\2\2\2\u06aa\u00b5\3\2\2\2\u06ab\u06ad\7|\2\2\u06ac"+
		"\u06ab\3\2\2\2\u06ac\u06ad\3\2\2\2\u06ad\u06ae\3\2\2\2\u06ae\u06b0\7\24"+
		"\2\2\u06af\u06b1\5\u00ba^\2\u06b0\u06af\3\2\2\2\u06b0\u06b1\3\2\2\2\u06b1"+
		"\u06b2\3\2\2\2\u06b2\u06b3\7\25\2\2\u06b3\u00b7\3\2\2\2\u06b4\u06b6\7"+
		"|\2\2\u06b5\u06b4\3\2\2\2\u06b5\u06b6\3\2\2\2\u06b6\u06b7\3\2\2\2\u06b7"+
		"\u06b9\7\'\2\2\u06b8\u06ba\5\u00ba^\2\u06b9\u06b8\3\2\2\2\u06b9\u06ba"+
		"\3\2\2\2\u06ba\u06bb\3\2\2\2\u06bb\u06bc\7%\2\2\u06bc\u00b9\3\2\2\2\u06bd"+
		"\u06c2\5`\61\2\u06be\u06bf\7\17\2\2\u06bf\u06c1\5`\61\2\u06c0\u06be\3"+
		"\2\2\2\u06c1\u06c4\3\2\2\2\u06c2\u06c0\3\2\2\2\u06c2\u06c3\3\2\2\2\u06c3"+
		"\u00bb\3\2\2\2\u06c4\u06c2\3\2\2\2\u06c5\u06c6\7\24\2\2\u06c6\u06c7\5"+
		"`\61\2\u06c7\u06c8\7\20\2\2\u06c8\u06c9\5`\61\2\u06c9\u06ca\7\25\2\2\u06ca"+
		"\u00bd\3\2\2\2\u06cb\u06cc\b`\1\2\u06cc\u06dd\5\u00c0a\2\u06cd\u06ce\7"+
		"F\2\2\u06ce\u06cf\7\'\2\2\u06cf\u06d0\5\u00be`\2\u06d0\u06d1\7%\2\2\u06d1"+
		"\u06dd\3\2\2\2\u06d2\u06d3\7E\2\2\u06d3\u06d4\7\'\2\2\u06d4\u06d5\5\u00be"+
		"`\2\u06d5\u06d6\7%\2\2\u06d6\u06dd\3\2\2\2\u06d7\u06d8\7H\2\2\u06d8\u06d9"+
		"\7\'\2\2\u06d9\u06da\5\u00be`\2\u06da\u06db\7%\2\2\u06db\u06dd\3\2\2\2"+
		"\u06dc\u06cb\3\2\2\2\u06dc\u06cd\3\2\2\2\u06dc\u06d2\3\2\2\2\u06dc\u06d7"+
		"\3\2\2\2\u06dd\u06e7\3\2\2\2\u06de\u06df\f\b\2\2\u06df\u06e6\7)\2\2\u06e0"+
		"\u06e1\f\7\2\2\u06e1\u06e2\7\24\2\2\u06e2\u06e6\7\25\2\2\u06e3\u06e4\f"+
		"\6\2\2\u06e4\u06e6\7*\2\2\u06e5\u06de\3\2\2\2\u06e5\u06e0\3\2\2\2\u06e5"+
		"\u06e3\3\2\2\2\u06e6\u06e9\3\2\2\2\u06e7\u06e5\3\2\2\2\u06e7\u06e8\3\2"+
		"\2\2\u06e8\u00bf\3\2\2\2\u06e9\u06e7\3\2\2\2\u06ea\u06ed\5\u00c2b\2\u06eb"+
		"\u06ed\5\u00c4c\2\u06ec\u06ea\3\2\2\2\u06ec\u06eb\3\2\2\2\u06ed\u00c1"+
		"\3\2\2\2\u06ee\u0701\7\63\2\2\u06ef\u0701\7\64\2\2\u06f0\u0701\7\65\2"+
		"\2\u06f1\u0701\7\66\2\2\u06f2\u0701\7B\2\2\u06f3\u0701\7\67\2\2\u06f4"+
		"\u0701\78\2\2\u06f5\u0701\7@\2\2\u06f6\u0701\79\2\2\u06f7\u0701\7;\2\2"+
		"\u06f8\u0701\7:\2\2\u06f9\u0701\7<\2\2\u06fa\u0701\7=\2\2\u06fb\u0701"+
		"\7?\2\2\u06fc\u0701\7A\2\2\u06fd\u0701\7C\2\2\u06fe\u0701\7D\2\2\u06ff"+
		"\u0701\7G\2\2\u0700\u06ee\3\2\2\2\u0700\u06ef\3\2\2\2\u0700\u06f0\3\2"+
		"\2\2\u0700\u06f1\3\2\2\2\u0700\u06f2\3\2\2\2\u0700\u06f3\3\2\2\2\u0700"+
		"\u06f4\3\2\2\2\u0700\u06f5\3\2\2\2\u0700\u06f6\3\2\2\2\u0700\u06f7\3\2"+
		"\2\2\u0700\u06f8\3\2\2\2\u0700\u06f9\3\2\2\2\u0700\u06fa\3\2\2\2\u0700"+
		"\u06fb\3\2\2\2\u0700\u06fc\3\2\2\2\u0700\u06fd\3\2\2\2\u0700\u06fe\3\2"+
		"\2\2\u0700\u06ff\3\2\2\2\u0701\u00c3\3\2\2\2\u0702\u0703\7\u00aa\2\2\u0703"+
		"\u00c5\3\2\2\2\u0704\u0706\7|\2\2\u0705\u0704\3\2\2\2\u0705\u0706\3\2"+
		"\2\2\u0706\u0707\3\2\2\2\u0707\u0708\5\u00c4c\2\u0708\u00c7\3\2\2\2\u0709"+
		"\u070a\7?\2\2\u070a\u00c9\3\2\2\2\u070b\u070f\5\20\t\2\u070c\u070f\5$"+
		"\23\2\u070d\u070f\5\22\n\2\u070e\u070b\3\2\2\2\u070e\u070c\3\2\2\2\u070e"+
		"\u070d\3\2\2\2\u070f\u00cb\3\2\2\2\u0710\u0713\5\f\7\2\u0711\u0713\5\16"+
		"\b\2\u0712\u0710\3\2\2\2\u0712\u0711\3\2\2\2\u0713\u00cd\3\2\2\2\u0714"+
		"\u0719\5\u00e0q\2\u0715\u0716\7\17\2\2\u0716\u0718\5\u00e0q\2\u0717\u0715"+
		"\3\2\2\2\u0718\u071b\3\2\2\2\u0719\u0717\3\2\2\2\u0719\u071a\3\2\2\2\u071a"+
		"\u00cf\3\2\2\2\u071b\u0719\3\2\2\2\u071c\u071f\5\u00dco\2\u071d\u071f"+
		"\5\u00e0q\2\u071e\u071c\3\2\2\2\u071e\u071d\3\2\2\2\u071f\u00d1\3\2\2"+
		"\2\u0720\u0723\5\u00d8m\2\u0721\u0723\5\u0160\u00b1\2\u0722\u0720\3\2"+
		"\2\2\u0722\u0721\3\2\2\2\u0723\u00d3\3\2\2\2\u0724\u0725\6k \3\u0725\u0726"+
		"\7\37\2\2\u0726\u0727\5\u00d6l\2\u0727\u00d5\3\2\2\2\u0728\u0729\6l!\3"+
		"\u0729\u072a\5\u00d2j\2\u072a\u00d7\3\2\2\2\u072b\u072f\5\u00dco\2\u072c"+
		"\u072f\5\u00e0q\2\u072d\u072f\5\u00e2r\2\u072e\u072b\3\2\2\2\u072e\u072c"+
		"\3\2\2\2\u072e\u072d\3\2\2\2\u072f\u00d9\3\2\2\2\u0730\u0731\t\7\2\2\u0731"+
		"\u00db\3\2\2\2\u0732\u0733\t\b\2\2\u0733\u00dd\3\2\2\2\u0734\u0735\t\t"+
		"\2\2\u0735\u00df\3\2\2\2\u0736\u0737\7\u00aa\2\2\u0737\u00e1\3\2\2\2\u0738"+
		"\u0739\7\u00a9\2\2\u0739\u00e3\3\2\2\2\u073a\u073f\5\u00e6t\2\u073b\u073c"+
		"\7\17\2\2\u073c\u073e\5\u00e6t\2\u073d\u073b\3\2\2\2\u073e\u0741\3\2\2"+
		"\2\u073f\u073d\3\2\2\2\u073f\u0740\3\2\2\2\u0740\u00e5\3\2\2\2\u0741\u073f"+
		"\3\2\2\2\u0742\u0748\5\u00ecw\2\u0743\u0745\7|\2\2\u0744\u0743\3\2\2\2"+
		"\u0744\u0745\3\2\2\2\u0745\u0746\3\2\2\2\u0746\u0748\5\u00e8u\2\u0747"+
		"\u0742\3\2\2\2\u0747\u0744\3\2\2\2\u0748\u00e7\3\2\2\2\u0749\u074c\5\u00ea"+
		"v\2\u074a\u074c\5\64\33\2\u074b\u0749\3\2\2\2\u074b\u074a\3\2\2\2\u074c"+
		"\u00e9\3\2\2\2\u074d\u0750\5\u00dco\2\u074e\u074f\7+\2\2\u074f\u0751\5"+
		"\u0128\u0095\2\u0750\u074e\3\2\2\2\u0750\u0751\3\2\2\2\u0751\u00eb\3\2"+
		"\2\2\u0752\u0753\5\u00c8e\2\u0753\u0754\5\u00dco\2\u0754\u00ed\3\2\2\2"+
		"\u0755\u0758\5\u00be`\2\u0756\u0758\5\u00f0y\2\u0757\u0755\3\2\2\2\u0757"+
		"\u0756\3\2\2\2\u0758\u00ef\3\2\2\2\u0759\u075a\by\1\2\u075a\u075b\7M\2"+
		"\2\u075b\u0764\3\2\2\2\u075c\u075d\f\4\2\2\u075d\u075e\7\24\2\2\u075e"+
		"\u0763\7\25\2\2\u075f\u0760\f\3\2\2\u0760\u0761\7\26\2\2\u0761\u0763\7"+
		"\27\2\2\u0762\u075c\3\2\2\2\u0762\u075f\3\2\2\2\u0763\u0766\3\2\2\2\u0764"+
		"\u0762\3\2\2\2\u0764\u0765\3\2\2\2\u0765\u00f1\3\2\2\2\u0766\u0764\3\2"+
		"\2\2\u0767\u076d\5\u00f4{\2\u0768\u0769\5\u0178\u00bd\2\u0769\u076a\5"+
		"\u00f4{\2\u076a\u076c\3\2\2\2\u076b\u0768\3\2\2\2\u076c\u076f\3\2\2\2"+
		"\u076d\u076b\3\2\2\2\u076d\u076e\3\2\2\2\u076e\u00f3\3\2\2\2\u076f\u076d"+
		"\3\2\2\2\u0770\u0771\5\u010a\u0086\2\u0771\u0772\5\u0178\u00bd\2\u0772"+
		"\u0774\3\2\2\2\u0773\u0770\3\2\2\2\u0774\u0777\3\2\2\2\u0775\u0773\3\2"+
		"\2\2\u0775\u0776\3\2\2\2\u0776\u077d\3\2\2\2\u0777\u0775\3\2\2\2\u0778"+
		"\u0779\5\u00a0Q\2\u0779\u077a\5\u0178\u00bd\2\u077a\u077c\3\2\2\2\u077b"+
		"\u0778\3\2\2\2\u077c\u077f\3\2\2\2\u077d\u077b\3\2\2\2\u077d\u077e\3\2"+
		"\2\2\u077e\u0785\3\2\2\2\u077f\u077d\3\2\2\2\u0780\u0786\5\32\16\2\u0781"+
		"\u0786\5\36\20\2\u0782\u0786\5,\27\2\u0783\u0786\5*\26\2\u0784\u0786\5"+
		"\30\r\2\u0785\u0780\3\2\2\2\u0785\u0781\3\2\2\2\u0785\u0782\3\2\2\2\u0785"+
		"\u0783\3\2\2\2\u0785\u0784\3\2\2\2\u0786\u00f5\3\2\2\2\u0787\u078d\5\u00f8"+
		"}\2\u0788\u0789\5\u0178\u00bd\2\u0789\u078a\5\u00f8}\2\u078a\u078c\3\2"+
		"\2\2\u078b\u0788\3\2\2\2\u078c\u078f\3\2\2\2\u078d\u078b\3\2\2\2\u078d"+
		"\u078e\3\2\2\2\u078e\u00f7\3\2\2\2\u078f\u078d\3\2\2\2\u0790\u0791\5\u010a"+
		"\u0086\2\u0791\u0792\5\u0178\u00bd\2\u0792\u0794\3\2\2\2\u0793\u0790\3"+
		"\2\2\2\u0794\u0797\3\2\2\2\u0795\u0793\3\2\2\2\u0795\u0796\3\2\2\2\u0796"+
		"\u079d\3\2\2\2\u0797\u0795\3\2\2\2\u0798\u0799\5\u00a0Q\2\u0799\u079a"+
		"\5\u0178\u00bd\2\u079a\u079c\3\2\2\2\u079b\u0798\3\2\2\2\u079c\u079f\3"+
		"\2\2\2\u079d\u079b\3\2\2\2\u079d\u079e\3\2\2\2\u079e\u07a3\3\2\2\2\u079f"+
		"\u079d\3\2\2\2\u07a0\u07a4\5 \21\2\u07a1\u07a4\5\34\17\2\u07a2\u07a4\5"+
		".\30\2\u07a3\u07a0\3\2\2\2\u07a3\u07a1\3\2\2\2\u07a3\u07a2\3\2\2\2\u07a4"+
		"\u00f9\3\2\2\2\u07a5\u07a6\7\7\2\2\u07a6\u07b0\5\u01c4\u00e3\2\u07a7\u07a8"+
		"\7\b\2\2\u07a8\u07b0\5\u01de\u00f0\2\u07a9\u07aa\7\t\2\2\u07aa\u07b0\5"+
		"\u00fc\177\2\u07ab\u07ac\7\n\2\2\u07ac\u07b0\5\u00fc\177\2\u07ad\u07ae"+
		"\7\13\2\2\u07ae\u07b0\5\u0100\u0081\2\u07af\u07a5\3\2\2\2\u07af\u07a7"+
		"\3\2\2\2\u07af\u07a9\3\2\2\2\u07af\u07ab\3\2\2\2\u07af\u07ad\3\2\2\2\u07b0"+
		"\u00fb\3\2\2\2\u07b1\u07b3\5\u00d8m\2\u07b2\u07b4\5\u00fe\u0080\2\u07b3"+
		"\u07b2\3\2\2\2\u07b3\u07b4\3\2\2\2\u07b4\u00fd\3\2\2\2\u07b5\u07b6\7o"+
		"\2\2\u07b6\u07b7\5\u0166\u00b4\2\u07b7\u07b8\7\r\2\2\u07b8\u07bd\5\u01ac"+
		"\u00d7\2\u07b9\u07ba\7\21\2\2\u07ba\u07bc\5\u01ac\u00d7\2\u07bb\u07b9"+
		"\3\2\2\2\u07bc\u07bf\3\2\2\2\u07bd\u07bb\3\2\2\2\u07bd\u07be\3\2\2\2\u07be"+
		"\u00ff\3\2\2\2\u07bf\u07bd\3\2\2\2\u07c0\u07c5\5\u0192\u00ca\2\u07c1\u07c2"+
		"\7\21\2\2\u07c2\u07c4\5\u0192\u00ca\2\u07c3\u07c1\3\2\2\2\u07c4\u07c7"+
		"\3\2\2\2\u07c5\u07c3\3\2\2\2\u07c5\u07c6\3\2\2\2\u07c6\u07c9\3\2\2\2\u07c7"+
		"\u07c5\3\2\2\2\u07c8\u07ca\5\u0102\u0082\2\u07c9\u07c8\3\2\2\2\u07c9\u07ca"+
		"\3\2\2\2\u07ca\u0101\3\2\2\2\u07cb\u07cc\7o\2\2\u07cc\u07cd\5\u0166\u00b4"+
		"\2\u07cd\u07cf\7\r\2\2\u07ce\u07d0\7!\2\2\u07cf\u07ce\3\2\2\2\u07cf\u07d0"+
		"\3\2\2\2\u07d0\u07d1\3\2\2\2\u07d1\u07d6\5\u0192\u00ca\2\u07d2\u07d3\7"+
		"!\2\2\u07d3\u07d5\5\u0192\u00ca\2\u07d4\u07d2\3\2\2\2\u07d5\u07d8\3\2"+
		"\2\2\u07d6\u07d4\3\2\2\2\u07d6\u07d7\3\2\2\2\u07d7\u07db\3\2\2\2\u07d8"+
		"\u07d6\3\2\2\2\u07d9\u07da\7\21\2\2\u07da\u07dc\5\u0192\u00ca\2\u07db"+
		"\u07d9\3\2\2\2\u07db\u07dc\3\2\2\2\u07dc\u0103\3\2\2\2\u07dd\u07e2\5\u00dc"+
		"o\2\u07de\u07df\7\17\2\2\u07df\u07e1\5\u00dco\2\u07e0\u07de\3\2\2\2\u07e1"+
		"\u07e4\3\2\2\2\u07e2\u07e0\3\2\2\2\u07e2\u07e3\3\2\2\2\u07e3\u0105\3\2"+
		"\2\2\u07e4\u07e2\3\2\2\2\u07e5\u07ea\5\u00dep\2\u07e6\u07e7\7\17\2\2\u07e7"+
		"\u07e9\5\u00dep\2\u07e8\u07e6\3\2\2\2\u07e9\u07ec\3\2\2\2\u07ea\u07e8"+
		"\3\2\2\2\u07ea\u07eb\3\2\2\2\u07eb\u0107\3\2\2\2\u07ec\u07ea\3\2\2\2\u07ed"+
		"\u07f2\5*\26\2\u07ee\u07f2\5,\27\2\u07ef\u07f2\5.\30\2\u07f0\u07f2\5\60"+
		"\31\2\u07f1\u07ed\3\2\2\2\u07f1\u07ee\3\2\2\2\u07f1\u07ef\3\2\2\2\u07f1"+
		"\u07f0\3\2\2\2\u07f2\u0109\3\2\2\2\u07f3\u07f4\7\6\2\2\u07f4\u010b\3\2"+
		"\2\2\u07f5\u07fb\5\u010e\u0088\2\u07f6\u07f7\5\u0178\u00bd\2\u07f7\u07f8"+
		"\5\u010e\u0088\2\u07f8\u07fa\3\2\2\2\u07f9\u07f6\3\2\2\2\u07fa\u07fd\3"+
		"\2\2\2\u07fb\u07f9\3\2\2\2\u07fb\u07fc\3\2\2\2\u07fc\u010d\3\2\2\2\u07fd"+
		"\u07fb\3\2\2\2\u07fe\u07ff\7\7\2\2\u07ff\u0809\5\u01ae\u00d8\2\u0800\u0801"+
		"\7\b\2\2\u0801\u0809\5\u01ca\u00e6\2\u0802\u0803\7\t\2\2\u0803\u0809\5"+
		"\u0110\u0089\2\u0804\u0805\7\n\2\2\u0805\u0809\5\u0110\u0089\2\u0806\u0807"+
		"\7\13\2\2\u0807\u0809\5\u0112\u008a\2\u0808\u07fe\3\2\2\2\u0808\u0800"+
		"\3\2\2\2\u0808\u0802\3\2\2\2\u0808\u0804\3\2\2\2\u0808\u0806\3\2\2\2\u0809"+
		"\u010f\3\2\2\2\u080a\u080c\5\u0194\u00cb\2\u080b\u080d\7\16\2\2\u080c"+
		"\u080b\3\2\2\2\u080c\u080d\3\2\2\2\u080d\u080f\3\2\2\2\u080e\u0810\5\u00fe"+
		"\u0080\2\u080f\u080e\3\2\2\2\u080f\u0810\3\2\2\2\u0810\u0111\3\2\2\2\u0811"+
		"\u0813\5\u017a\u00be\2\u0812\u0814\7\16\2\2\u0813\u0812\3\2\2\2\u0813"+
		"\u0814\3\2\2\2\u0814\u0816\3\2\2\2\u0815\u0817\5\u0102\u0082\2\u0816\u0815"+
		"\3\2\2\2\u0816\u0817\3\2\2\2\u0817\u0113\3\2\2\2\u0818\u081e\58\35\2\u0819"+
		"\u081a\5\u0178\u00bd\2\u081a\u081b\58\35\2\u081b\u081d\3\2\2\2\u081c\u0819"+
		"\3\2\2\2\u081d\u0820\3\2\2\2\u081e\u081c\3\2\2\2\u081e\u081f\3\2\2\2\u081f"+
		"\u0115\3\2\2\2\u0820\u081e\3\2\2\2\u0821\u0827\5\62\32\2\u0822\u0823\5"+
		"\u0178\u00bd\2\u0823\u0824\5\62\32\2\u0824\u0826\3\2\2\2\u0825\u0822\3"+
		"\2\2\2\u0826\u0829\3\2\2\2\u0827\u0825\3\2\2\2\u0827\u0828\3\2\2\2\u0828"+
		"\u0117\3\2\2\2\u0829\u0827\3\2\2\2\u082a\u0830\5D#\2\u082b\u082c\5\u0178"+
		"\u00bd\2\u082c\u082d\5D#\2\u082d\u082f\3\2\2\2\u082e\u082b\3\2\2\2\u082f"+
		"\u0832\3\2\2\2\u0830\u082e\3\2\2\2\u0830\u0831\3\2\2\2\u0831\u0119\3\2"+
		"\2\2\u0832\u0830\3\2\2\2\u0833\u0839\5T+\2\u0834\u0835\5\u0178\u00bd\2"+
		"\u0835\u0836\5T+\2\u0836\u0838\3\2\2\2\u0837\u0834\3\2\2\2\u0838\u083b"+
		"\3\2\2\2\u0839\u0837\3\2\2\2\u0839\u083a\3\2\2\2\u083a\u011b\3\2\2\2\u083b"+
		"\u0839\3\2\2\2\u083c\u083d\7\24\2\2\u083d\u083e\5\u011e\u0090\2\u083e"+
		"\u083f\7\20\2\2\u083f\u0840\5\u011e\u0090\2\u0840\u0841\7\25\2\2\u0841"+
		"\u084b\3\2\2\2\u0842\u0843\7\24\2\2\u0843\u0844\5\u0120\u0091\2\u0844"+
		"\u0845\7\25\2\2\u0845\u084b\3\2\2\2\u0846\u0847\7\'\2\2\u0847\u0848\5"+
		"\u0120\u0091\2\u0848\u0849\7%\2\2\u0849\u084b\3\2\2\2\u084a\u083c\3\2"+
		"\2\2\u084a\u0842\3\2\2\2\u084a\u0846\3\2\2\2\u084b\u011d\3\2\2\2\u084c"+
		"\u0864\7\u00a7\2\2\u084d\u0864\7\u00a8\2\2\u084e\u0850\7\37\2\2\u084f"+
		"\u084e\3\2\2\2\u084f\u0850\3\2\2\2\u0850\u0851\3\2\2\2\u0851\u0864\7\u00b2"+
		"\2\2\u0852\u0864\7\u00b3\2\2\u0853\u0864\7\u00a6\2\2\u0854\u0864\7\u00b7"+
		"\2\2\u0855\u0864\7\u00b6\2\2\u0856\u0864\7\u00af\2\2\u0857\u0859\7\37"+
		"\2\2\u0858\u0857\3\2\2\2\u0858\u0859\3\2\2\2\u0859\u085a\3\2\2\2\u085a"+
		"\u0864\7\u00b4\2\2\u085b\u0864\7\u00b5\2\2\u085c\u0864\7\u00a5\2\2\u085d"+
		"\u0864\7\u00b8\2\2\u085e\u0864\7\u00b1\2\2\u085f\u0864\7\u00b0\2\2\u0860"+
		"\u0864\5\u00e2r\2\u0861\u0864\5\u0092J\2\u0862\u0864\5\u0094K\2\u0863"+
		"\u084c\3\2\2\2\u0863\u084d\3\2\2\2\u0863\u084f\3\2\2\2\u0863\u0852\3\2"+
		"\2\2\u0863\u0853\3\2\2\2\u0863\u0854\3\2\2\2\u0863\u0855\3\2\2\2\u0863"+
		"\u0856\3\2\2\2\u0863\u0858\3\2\2\2\u0863\u085b\3\2\2\2\u0863\u085c\3\2"+
		"\2\2\u0863\u085d\3\2\2\2\u0863\u085e\3\2\2\2\u0863\u085f\3\2\2\2\u0863"+
		"\u0860\3\2\2\2\u0863\u0861\3\2\2\2\u0863\u0862\3\2\2\2\u0864\u011f\3\2"+
		"\2\2\u0865\u086a\5\u011e\u0090\2\u0866\u0867\7\17\2\2\u0867\u0869\5\u011e"+
		"\u0090\2\u0868\u0866\3\2\2\2\u0869\u086c\3\2\2\2\u086a\u0868\3\2\2\2\u086a"+
		"\u086b\3\2\2\2\u086b\u0121\3\2\2\2\u086c\u086a\3\2\2\2\u086d\u086e\t\n"+
		"\2\2\u086e\u0123\3\2\2\2\u086f\u0870\5\u00c4c\2\u0870\u0871\7\21\2\2\u0871"+
		"\u0873\3\2\2\2\u0872\u086f\3\2\2\2\u0872\u0873\3\2\2\2\u0873\u0874\3\2"+
		"\2\2\u0874\u0875\7\u0096\2\2\u0875\u0125\3\2\2\2\u0876\u0877\7\22\2\2"+
		"\u0877\u0878\5`\61\2\u0878\u0879\7\23\2\2\u0879\u0127\3\2\2\2\u087a\u087d"+
		"\5\u011e\u0090\2\u087b\u087d\5\u012a\u0096\2\u087c\u087a\3\2\2\2\u087c"+
		"\u087b\3\2\2\2\u087d\u0129\3\2\2\2\u087e\u0885\5\u00bc_\2\u087f\u0885"+
		"\5\u00b6\\\2\u0880\u0885\5\u00b8]\2\u0881\u0885\5\u012e\u0098\2\u0882"+
		"\u0885\5\u0130\u0099\2\u0883\u0885\5\u012c\u0097\2\u0884\u087e\3\2\2\2"+
		"\u0884\u087f\3\2\2\2\u0884\u0880\3\2\2\2\u0884\u0881\3\2\2\2\u0884\u0882"+
		"\3\2\2\2\u0884\u0883\3\2\2\2\u0885\u012b\3\2\2\2\u0886\u0888\7|\2\2\u0887"+
		"\u0886\3\2\2\2\u0887\u0888\3\2\2\2\u0888\u0889\3\2\2\2\u0889\u088b\7\22"+
		"\2\2\u088a\u088c\5\u0132\u009a\2\u088b\u088a\3\2\2\2\u088b\u088c\3\2\2"+
		"\2\u088c\u088d\3\2\2\2\u088d\u088e\7\23\2\2\u088e\u012d\3\2\2\2\u088f"+
		"\u0891\7|\2\2\u0890\u088f\3\2\2\2\u0890\u0891\3\2\2\2\u0891\u089a\3\2"+
		"\2\2\u0892\u0893\7\'\2\2\u0893\u0894\5\u013a\u009e\2\u0894\u0895\7%\2"+
		"\2\u0895\u089b\3\2\2\2\u0896\u089b\7*\2\2\u0897\u0898\7\'\2\2\u0898\u0899"+
		"\7\r\2\2\u0899\u089b\7%\2\2\u089a\u0892\3\2\2\2\u089a\u0896\3\2\2\2\u089a"+
		"\u0897\3\2\2\2\u089b\u012f\3\2\2\2\u089c\u089e\7\26\2\2\u089d\u089f\5"+
		"\u0134\u009b\2\u089e\u089d\3\2\2\2\u089e\u089f\3\2\2\2\u089f\u08a0\3\2"+
		"\2\2\u08a0\u08a1\7\27\2\2\u08a1\u0131\3\2\2\2\u08a2\u08a3\5`\61\2\u08a3"+
		"\u08ac\7\17\2\2\u08a4\u08a9\5`\61\2\u08a5\u08a6\7\17\2\2\u08a6\u08a8\5"+
		"`\61\2\u08a7\u08a5\3\2\2\2\u08a8\u08ab\3\2\2\2\u08a9\u08a7\3\2\2\2\u08a9"+
		"\u08aa\3\2\2\2\u08aa\u08ad\3\2\2\2\u08ab\u08a9\3\2\2\2\u08ac\u08a4\3\2"+
		"\2\2\u08ac\u08ad\3\2\2\2\u08ad\u0133\3\2\2\2\u08ae\u08b3\5\u0136\u009c"+
		"\2\u08af\u08b0\7\17\2\2\u08b0\u08b2\5\u0136\u009c\2\u08b1\u08af\3\2\2"+
		"\2\u08b2\u08b5\3\2\2\2\u08b3\u08b1\3\2\2\2\u08b3\u08b4\3\2\2\2\u08b4\u0135"+
		"\3\2\2\2\u08b5\u08b3\3\2\2\2\u08b6\u08b7\5\u0138\u009d\2\u08b7\u08b8\7"+
		"\r\2\2\u08b8\u08b9\5`\61\2\u08b9\u0137\3\2\2\2\u08ba\u08bd\5\u00d2j\2"+
		"\u08bb\u08bd\7\u00af\2\2\u08bc\u08ba\3\2\2\2\u08bc\u08bb\3\2\2\2\u08bd"+
		"\u0139\3\2\2\2\u08be\u08c3\5\u013c\u009f\2\u08bf\u08c0\7\17\2\2\u08c0"+
		"\u08c2\5\u013c\u009f\2\u08c1\u08bf\3\2\2\2\u08c2\u08c5\3\2\2\2\u08c3\u08c1"+
		"\3\2\2\2\u08c3\u08c4\3\2\2\2\u08c4\u013b\3\2\2\2\u08c5\u08c3\3\2\2\2\u08c6"+
		"\u08c7\5\u013e\u00a0\2\u08c7\u08c8\7\r\2\2\u08c8\u08c9\5`\61\2\u08c9\u013d"+
		"\3\2\2\2\u08ca\u08cd\5\u00d2j\2\u08cb\u08cd\7\u00af\2\2\u08cc\u08ca\3"+
		"\2\2\2\u08cc\u08cb\3\2\2\2\u08cd\u013f\3\2\2\2\u08ce\u08cf\5`\61\2\u08cf"+
		"\u08d0\7\r\2\2\u08d0\u08d1\5`\61\2\u08d1\u08d8\3\2\2\2\u08d2\u08d3\5`"+
		"\61\2\u08d3\u08d4\7\r\2\2\u08d4\u08d8\3\2\2\2\u08d5\u08d6\7\r\2\2\u08d6"+
		"\u08d8\5`\61\2\u08d7\u08ce\3\2\2\2\u08d7\u08d2\3\2\2\2\u08d7\u08d5\3\2"+
		"\2\2\u08d8\u0141\3\2\2\2\u08d9\u08da\5\u00dco\2\u08da\u08db\5\u016c\u00b7"+
		"\2\u08db\u08dc\5`\61\2\u08dc\u0143\3\2\2\2\u08dd\u08de\b\u00a3\1\2\u08de"+
		"\u08df\5\u00dco\2\u08df\u08e4\3\2\2\2\u08e0\u08e1\f\3\2\2\u08e1\u08e3"+
		"\5\u008eH\2\u08e2\u08e0\3\2\2\2\u08e3\u08e6\3\2\2\2\u08e4\u08e2\3\2\2"+
		"\2\u08e4\u08e5\3\2\2\2\u08e5\u0145\3\2\2\2\u08e6\u08e4\3\2\2\2\u08e7\u08e8"+
		"\6\u00a4%\3\u08e8\u08e9\7\u00ab\2\2\u08e9\u08ec\5\u00eex\2\u08ea\u08ec"+
		"\5`\61\2\u08eb\u08e7\3\2\2\2\u08eb\u08ea\3\2\2\2\u08ec\u0147\3\2\2\2\u08ed"+
		"\u08ee\6\u00a5&\3\u08ee\u08ef\7\u00ab\2\2\u08ef\u0149\3\2\2\2\u08f0\u08f1"+
		"\5\u014c\u00a7\2\u08f1\u08f2\5`\61\2\u08f2\u08f9\3\2\2\2\u08f3\u08f4\5"+
		"\u014c\u00a7\2\u08f4\u08f5\7\26\2\2\u08f5\u08f6\5\u0114\u008b\2\u08f6"+
		"\u08f7\7\27\2\2\u08f7\u08f9\3\2\2\2\u08f8\u08f0\3\2\2\2\u08f8\u08f3\3"+
		"\2\2\2\u08f9\u014b\3\2\2\2\u08fa\u08fb\5\u014e\u00a8\2\u08fb\u08fc\5\u0096"+
		"L\2\u08fc\u08fd\7\62\2\2\u08fd\u08fe\5\u0096L\2\u08fe\u014d\3\2\2\2\u08ff"+
		"\u0906\5\u00dco\2\u0900\u0902\7\22\2\2\u0901\u0903\5\u0104\u0083\2\u0902"+
		"\u0901\3\2\2\2\u0902\u0903\3\2\2\2\u0903\u0904\3\2\2\2\u0904\u0906\7\23"+
		"\2\2\u0905\u08ff\3\2\2\2\u0905\u0900\3\2\2\2\u0906\u014f\3\2\2\2\u0907"+
		"\u090a\5j\66\2\u0908\u090a\5\u014a\u00a6\2\u0909\u0907\3\2\2\2\u0909\u0908"+
		"\3\2\2\2\u090a\u0151\3\2\2\2\u090b\u090c\7\u008a\2\2\u090c\u090d\7A\2"+
		"\2\u090d\u090e\7o\2\2\u090e\u090f\5`\61\2\u090f\u0153\3\2\2\2\u0910\u0911"+
		"\7\u008a\2\2\u0911\u0912\7J\2\2\u0912\u0913\7o\2\2\u0913\u0914\5`\61\2"+
		"\u0914\u0155\3\2\2\2\u0915\u0916\7\u008a\2\2\u0916\u0917\7\u0083\2\2\u0917"+
		"\u0918\7o\2\2\u0918\u0919\5`\61\2\u0919\u0157\3\2\2\2\u091a\u091f\5\u015a"+
		"\u00ae\2\u091b\u091c\7\17\2\2\u091c\u091e\5\u015a\u00ae\2\u091d\u091b"+
		"\3\2\2\2\u091e\u0921\3\2\2\2\u091f\u091d\3\2\2\2\u091f\u0920\3\2\2\2\u0920"+
		"\u0159\3\2\2\2\u0921\u091f\3\2\2\2\u0922\u0927\5\u00dco\2\u0923\u0924"+
		"\7\21\2\2\u0924\u0926\5\u00dco\2\u0925\u0923\3\2\2\2\u0926\u0929\3\2\2"+
		"\2\u0927\u0925\3\2\2\2\u0927\u0928\3\2\2\2\u0928\u092b\3\2\2\2\u0929\u0927"+
		"\3\2\2\2\u092a\u092c\t\13\2\2\u092b\u092a\3\2\2\2\u092b\u092c\3\2\2\2"+
		"\u092c\u015b\3\2\2\2\u092d\u0932\5\u00dco\2\u092e\u092f\7\17\2\2\u092f"+
		"\u0931\5\u00dco\2\u0930\u092e\3\2\2\2\u0931\u0934\3\2\2\2\u0932\u0930"+
		"\3\2\2\2\u0932\u0933\3\2\2\2\u0933\u015d\3\2\2\2\u0934\u0932\3\2\2\2\u0935"+
		"\u093c\7\36\2\2\u0936\u093c\7\37\2\2\u0937\u093c\5\u016e\u00b8\2\u0938"+
		"\u093c\5\u0170\u00b9\2\u0939\u093c\5\u0172\u00ba\2\u093a\u093c\5\u0174"+
		"\u00bb\2\u093b\u0935\3\2\2\2\u093b\u0936\3\2\2\2\u093b\u0937\3\2\2\2\u093b"+
		"\u0938\3\2\2\2\u093b\u0939\3\2\2\2\u093b\u093a\3\2\2\2\u093c\u015f\3\2"+
		"\2\2\u093d\u093e\t\f\2\2\u093e\u0161\3\2\2\2\u093f\u0940\7\u00ab\2\2\u0940"+
		"\u0941\6\u00b2\'\3\u0941\u0163\3\2\2\2\u0942\u0943\7\u00ab\2\2\u0943\u0944"+
		"\6\u00b3(\3\u0944\u0165\3\2\2\2\u0945\u0946\7\u00ab\2\2\u0946\u0947\6"+
		"\u00b4)\3\u0947\u0167\3\2\2\2\u0948\u0949\7\u00ab\2\2\u0949\u094a\6\u00b5"+
		"*\3\u094a\u0169\3\2\2\2\u094b\u094c\7\u00ab\2\2\u094c\u094d\6\u00b6+\3"+
		"\u094d\u016b\3\2\2\2\u094e\u094f\7+\2\2\u094f\u016d\3\2\2\2\u0950\u0951"+
		"\7 \2\2\u0951\u016f\3\2\2\2\u0952\u0953\7!\2\2\u0953\u0171\3\2\2\2\u0954"+
		"\u0955\7\"\2\2\u0955\u0173\3\2\2\2\u0956\u0957\t\r\2\2\u0957\u0175\3\2"+
		"\2\2\u0958\u0959\3\2\2\2\u0959\u0177\3\2\2\2\u095a\u095b\3\2\2\2\u095b"+
		"\u0179\3\2\2\2\u095c\u095d\7\u008d\2\2\u095d\u095e\5\u017c\u00bf\2\u095e"+
		"\u095f\7\16\2\2\u095f\u0964\3\2\2\2\u0960\u0961\5\u017c\u00bf\2\u0961"+
		"\u0962\7\16\2\2\u0962\u0964\3\2\2\2\u0963\u095c\3\2\2\2\u0963\u0960\3"+
		"\2\2\2\u0964\u017b\3\2\2\2\u0965\u0966\b\u00bf\1\2\u0966\u0967\5\u017e"+
		"\u00c0\2\u0967\u096c\3\2\2\2\u0968\u0969\f\3\2\2\u0969\u096b\5\u0184\u00c3"+
		"\2\u096a\u0968\3\2\2\2\u096b\u096e\3\2\2\2\u096c\u096a\3\2\2\2\u096c\u096d"+
		"\3\2\2\2\u096d\u017d\3\2\2\2\u096e\u096c\3\2\2\2\u096f\u0977\5\u0180\u00c1"+
		"\2\u0970\u0977\5\u0182\u00c2\2\u0971\u0977\5\u018c\u00c7\2\u0972\u0977"+
		"\5\u018e\u00c8\2\u0973\u0977\5\u0190\u00c9\2\u0974\u0977\5\u0186\u00c4"+
		"\2\u0975\u0977\5\u018a\u00c6\2\u0976\u096f\3\2\2\2\u0976\u0970\3\2\2\2"+
		"\u0976\u0971\3\2\2\2\u0976\u0972\3\2\2\2\u0976\u0973\3\2\2\2\u0976\u0974"+
		"\3\2\2\2\u0976\u0975\3\2\2\2\u0977\u017f\3\2\2\2\u0978\u0979\5\u0122\u0092"+
		"\2\u0979\u0181\3\2\2\2\u097a\u097b\5\u0162\u00b2\2\u097b\u097c\5\u0186"+
		"\u00c4\2\u097c\u0183\3\2\2\2\u097d\u097e\7\21\2\2\u097e\u0983\5\u0186"+
		"\u00c4\2\u097f\u0980\7\21\2\2\u0980\u0983\5\u0192\u00ca\2\u0981\u0983"+
		"\5\u018a\u00c6\2\u0982\u097d\3\2\2\2\u0982\u097f\3\2\2\2\u0982\u0981\3"+
		"\2\2\2\u0983\u0185\3\2\2\2\u0984\u0985\5\u0192\u00ca\2\u0985\u0987\7\22"+
		"\2\2\u0986\u0988\5\u0188\u00c5\2\u0987\u0986\3\2\2\2\u0987\u0988\3\2\2"+
		"\2\u0988\u0989\3\2\2\2\u0989\u098a\7\23\2\2\u098a\u0187\3\2\2\2\u098b"+
		"\u098c\b\u00c5\1\2\u098c\u098d\5\u017c\u00bf\2\u098d\u0993\3\2\2\2\u098e"+
		"\u098f\f\3\2\2\u098f\u0990\7\17\2\2\u0990\u0992\5";
	private static final String _serializedATNSegment1 =
		"\u017c\u00bf\2\u0991\u098e\3\2\2\2\u0992\u0995\3\2\2\2\u0993\u0991\3\2"+
		"\2\2\u0993\u0994\3\2\2\2\u0994\u0189\3\2\2\2\u0995\u0993\3\2\2\2\u0996"+
		"\u0997\7\24\2\2\u0997\u0998\5\u017c\u00bf\2\u0998\u0999\7\25\2\2\u0999"+
		"\u018b\3\2\2\2\u099a\u099b\7\22\2\2\u099b\u099c\5\u017c\u00bf\2\u099c"+
		"\u099d\7\23\2\2\u099d\u018d\3\2\2\2\u099e\u099f\5\u0192\u00ca\2\u099f"+
		"\u018f\3\2\2\2\u09a0\u09a6\7\u00b2\2\2\u09a1\u09a6\7\u00b4\2\2\u09a2\u09a6"+
		"\7\u00af\2\2\u09a3\u09a6\7\u00a5\2\2\u09a4\u09a6\7\u00a6\2\2\u09a5\u09a0"+
		"\3\2\2\2\u09a5\u09a1\3\2\2\2\u09a5\u09a2\3\2\2\2\u09a5\u09a3\3\2\2\2\u09a5"+
		"\u09a4\3\2\2\2\u09a6\u0191\3\2\2\2\u09a7\u09ad\7\u00ab\2\2\u09a8\u09ad"+
		"\7\u00a9\2\2\u09a9\u09ad\7\u00ad\2\2\u09aa\u09ad\7\u00aa\2\2\u09ab\u09ad"+
		"\5\u0160\u00b1\2\u09ac\u09a7\3\2\2\2\u09ac\u09a8\3\2\2\2\u09ac\u09a9\3"+
		"\2\2\2\u09ac\u09aa\3\2\2\2\u09ac\u09ab\3\2\2\2\u09ad\u0193\3\2\2\2\u09ae"+
		"\u09af\7\u008d\2\2\u09af\u09b2\5\u0196\u00cc\2\u09b0\u09b2\5\u0196\u00cc"+
		"\2\u09b1\u09ae\3\2\2\2\u09b1\u09b0\3\2\2\2\u09b2\u0195\3\2\2\2\u09b3\u09b4"+
		"\b\u00cc\1\2\u09b4\u09b5\5\u0198\u00cd\2\u09b5\u09ba\3\2\2\2\u09b6\u09b7"+
		"\f\3\2\2\u09b7\u09b9\5\u019c\u00cf\2\u09b8\u09b6\3\2\2\2\u09b9\u09bc\3"+
		"\2\2\2\u09ba\u09b8\3\2\2\2\u09ba\u09bb\3\2\2\2\u09bb\u0197\3\2\2\2\u09bc"+
		"\u09ba\3\2\2\2\u09bd\u09c3\5\u019a\u00ce\2\u09be\u09c3\5\u01a6\u00d4\2"+
		"\u09bf\u09c3\5\u01a8\u00d5\2\u09c0\u09c3\5\u01aa\u00d6\2\u09c1\u09c3\5"+
		"\u019e\u00d0\2\u09c2\u09bd\3\2\2\2\u09c2\u09be\3\2\2\2\u09c2\u09bf\3\2"+
		"\2\2\u09c2\u09c0\3\2\2\2\u09c2\u09c1\3\2\2\2\u09c3\u0199\3\2\2\2\u09c4"+
		"\u09c5\5\u0122\u0092\2\u09c5\u019b\3\2\2\2\u09c6\u09c7\7\21\2\2\u09c7"+
		"\u09cd\5\u019e\u00d0\2\u09c8\u09c9\7\24\2\2\u09c9\u09ca\5\u0196\u00cc"+
		"\2\u09ca\u09cb\7\25\2\2\u09cb\u09cd\3\2\2\2\u09cc\u09c6\3\2\2\2\u09cc"+
		"\u09c8\3\2\2\2\u09cd\u019d\3\2\2\2\u09ce\u09cf\5\u01ac\u00d7\2\u09cf\u09d1"+
		"\7\22\2\2\u09d0\u09d2\5\u01a0\u00d1\2\u09d1\u09d0\3\2\2\2\u09d1\u09d2"+
		"\3\2\2\2\u09d2\u09d3\3\2\2\2\u09d3\u09d4\7\23\2\2\u09d4\u019f\3\2\2\2"+
		"\u09d5\u09dc\5\u01a2\u00d2\2\u09d6\u09dc\5\u01a4\u00d3\2\u09d7\u09d8\5"+
		"\u01a2\u00d2\2\u09d8\u09d9\7\17\2\2\u09d9\u09da\5\u01a4\u00d3\2\u09da"+
		"\u09dc\3\2\2\2\u09db\u09d5\3\2\2\2\u09db\u09d6\3\2\2\2\u09db\u09d7\3\2"+
		"\2\2\u09dc\u01a1\3\2\2\2\u09dd\u09de\b\u00d2\1\2\u09de\u09df\5\u0196\u00cc"+
		"\2\u09df\u09e5\3\2\2\2\u09e0\u09e1\f\3\2\2\u09e1\u09e2\7\17\2\2\u09e2"+
		"\u09e4\5\u0196\u00cc\2\u09e3\u09e0\3\2\2\2\u09e4\u09e7\3\2\2\2\u09e5\u09e3"+
		"\3\2\2\2\u09e5\u09e6\3\2\2\2\u09e6\u01a3\3\2\2\2\u09e7\u09e5\3\2\2\2\u09e8"+
		"\u09e9\b\u00d3\1\2\u09e9\u09ea\5\u01ac\u00d7\2\u09ea\u09eb\7+\2\2\u09eb"+
		"\u09ec\5\u0196\u00cc\2\u09ec\u09f5\3\2\2\2\u09ed\u09ee\f\3\2\2\u09ee\u09ef"+
		"\7\17\2\2\u09ef\u09f0\5\u01ac\u00d7\2\u09f0\u09f1\7+\2\2\u09f1\u09f2\5"+
		"\u0196\u00cc\2\u09f2\u09f4\3\2\2\2\u09f3\u09ed\3\2\2\2\u09f4\u09f7\3\2"+
		"\2\2\u09f5\u09f3\3\2\2\2\u09f5\u09f6\3\2\2\2\u09f6\u01a5\3\2\2\2\u09f7"+
		"\u09f5\3\2\2\2\u09f8\u09f9\7\22\2\2\u09f9\u09fa\5\u0196\u00cc\2\u09fa"+
		"\u09fb\7\23\2\2\u09fb\u01a7\3\2\2\2\u09fc\u09fd\b\u00d5\1\2\u09fd\u0a00"+
		"\7\u00ad\2\2\u09fe\u0a00\5\u01ac\u00d7\2\u09ff\u09fc\3\2\2\2\u09ff\u09fe"+
		"\3\2\2\2\u0a00\u0a06\3\2\2\2\u0a01\u0a02\f\3\2\2\u0a02\u0a03\7\21\2\2"+
		"\u0a03\u0a05\5\u01ac\u00d7\2\u0a04\u0a01\3\2\2\2\u0a05\u0a08\3\2\2\2\u0a06"+
		"\u0a04\3\2\2\2\u0a06\u0a07\3\2\2\2\u0a07\u01a9\3\2\2\2\u0a08\u0a06\3\2"+
		"\2\2\u0a09\u0a0f\7\u00b2\2\2\u0a0a\u0a0f\7\u00b4\2\2\u0a0b\u0a0f\7\u00af"+
		"\2\2\u0a0c\u0a0f\7\u00a5\2\2\u0a0d\u0a0f\7\u00a6\2\2\u0a0e\u0a09\3\2\2"+
		"\2\u0a0e\u0a0a\3\2\2\2\u0a0e\u0a0b\3\2\2\2\u0a0e\u0a0c\3\2\2\2\u0a0e\u0a0d"+
		"\3\2\2\2\u0a0f\u01ab\3\2\2\2\u0a10\u0a16\7\u00ab\2\2\u0a11\u0a16\7\u00a9"+
		"\2\2\u0a12\u0a16\7\u00ad\2\2\u0a13\u0a16\7\u00aa\2\2\u0a14\u0a16\5\u0160"+
		"\u00b1\2\u0a15\u0a10\3\2\2\2\u0a15\u0a11\3\2\2\2\u0a15\u0a12\3\2\2\2\u0a15"+
		"\u0a13\3\2\2\2\u0a15\u0a14\3\2\2\2\u0a16\u01ad\3\2\2\2\u0a17\u0a18\7\u008d"+
		"\2\2\u0a18\u0a19\5\u01b0\u00d9\2\u0a19\u0a1a\7\16\2\2\u0a1a\u0a1f\3\2"+
		"\2\2\u0a1b\u0a1c\5\u01b0\u00d9\2\u0a1c\u0a1d\7\16\2\2\u0a1d\u0a1f\3\2"+
		"\2\2\u0a1e\u0a17\3\2\2\2\u0a1e\u0a1b\3\2\2\2\u0a1f\u01af\3\2\2\2\u0a20"+
		"\u0a21\b\u00d9\1\2\u0a21\u0a22\5\u01b2\u00da\2\u0a22\u0a27\3\2\2\2\u0a23"+
		"\u0a24\f\3\2\2\u0a24\u0a26\5\u01b8\u00dd\2\u0a25\u0a23\3\2\2\2\u0a26\u0a29"+
		"\3\2\2\2\u0a27\u0a25\3\2\2\2\u0a27\u0a28\3\2\2\2\u0a28\u01b1\3\2\2\2\u0a29"+
		"\u0a27\3\2\2\2\u0a2a\u0a30\5\u01b4\u00db\2\u0a2b\u0a30\5\u01b6\u00dc\2"+
		"\u0a2c\u0a30\5\u01c0\u00e1\2\u0a2d\u0a30\5\u01c2\u00e2\2\u0a2e\u0a30\5"+
		"\u01c6\u00e4\2\u0a2f\u0a2a\3\2\2\2\u0a2f\u0a2b\3\2\2\2\u0a2f\u0a2c\3\2"+
		"\2\2\u0a2f\u0a2d\3\2\2\2\u0a2f\u0a2e\3\2\2\2\u0a30\u01b3\3\2\2\2\u0a31"+
		"\u0a32\5\u0122\u0092\2\u0a32\u01b5\3\2\2\2\u0a33\u0a34\5\u0162\u00b2\2"+
		"\u0a34\u0a35\5\u01ba\u00de\2\u0a35\u01b7\3\2\2\2\u0a36\u0a37\7\21\2\2"+
		"\u0a37\u0a3a\5\u01ba\u00de\2\u0a38\u0a3a\5\u01be\u00e0\2\u0a39\u0a36\3"+
		"\2\2\2\u0a39\u0a38\3\2\2\2\u0a3a\u01b9\3\2\2\2\u0a3b\u0a3c\5\u01c8\u00e5"+
		"\2\u0a3c\u0a3e\7\22\2\2\u0a3d\u0a3f\5\u01bc\u00df\2\u0a3e\u0a3d\3\2\2"+
		"\2\u0a3e\u0a3f\3\2\2\2\u0a3f\u0a40\3\2\2\2\u0a40\u0a41\7\23\2\2\u0a41"+
		"\u01bb\3\2\2\2\u0a42\u0a43\b\u00df\1\2\u0a43\u0a44\5\u01b0\u00d9\2\u0a44"+
		"\u0a4a\3\2\2\2\u0a45\u0a46\f\3\2\2\u0a46\u0a47\7\17\2\2\u0a47\u0a49\5"+
		"\u01b0\u00d9\2\u0a48\u0a45\3\2\2\2\u0a49\u0a4c\3\2\2\2\u0a4a\u0a48\3\2"+
		"\2\2\u0a4a\u0a4b\3\2\2\2\u0a4b\u01bd\3\2\2\2\u0a4c\u0a4a\3\2\2\2\u0a4d"+
		"\u0a4e\7\24\2\2\u0a4e\u0a4f\5\u01b0\u00d9\2\u0a4f\u0a50\7\25\2\2\u0a50"+
		"\u01bf\3\2\2\2\u0a51\u0a52\7\22\2\2\u0a52\u0a53\5\u01b0\u00d9\2\u0a53"+
		"\u0a54\7\23\2\2\u0a54\u01c1\3\2\2\2\u0a55\u0a56\b\u00e2\1\2\u0a56\u0a57"+
		"\5\u01c8\u00e5\2\u0a57\u0a5d\3\2\2\2\u0a58\u0a59\f\3\2\2\u0a59\u0a5a\7"+
		"\21\2\2\u0a5a\u0a5c\5\u01c8\u00e5\2\u0a5b\u0a58\3\2\2\2\u0a5c\u0a5f\3"+
		"\2\2\2\u0a5d\u0a5b\3\2\2\2\u0a5d\u0a5e\3\2\2\2\u0a5e\u01c3\3\2\2\2\u0a5f"+
		"\u0a5d\3\2\2\2\u0a60\u0a61\b\u00e3\1\2\u0a61\u0a62\5\u01c2\u00e2\2\u0a62"+
		"\u0a67\3\2\2\2\u0a63\u0a64\f\3\2\2\u0a64\u0a66\7\u00ad\2\2\u0a65\u0a63"+
		"\3\2\2\2\u0a66\u0a69\3\2\2\2\u0a67\u0a65\3\2\2\2\u0a67\u0a68\3\2\2\2\u0a68"+
		"\u01c5\3\2\2\2\u0a69\u0a67\3\2\2\2\u0a6a\u0a70\7\u00b2\2\2\u0a6b\u0a70"+
		"\7\u00b4\2\2\u0a6c\u0a70\7\u00af\2\2\u0a6d\u0a70\7\u00a5\2\2\u0a6e\u0a70"+
		"\7\u00a6\2\2\u0a6f\u0a6a\3\2\2\2\u0a6f\u0a6b\3\2\2\2\u0a6f\u0a6c\3\2\2"+
		"\2\u0a6f\u0a6d\3\2\2\2\u0a6f\u0a6e\3\2\2\2\u0a70\u01c7\3\2\2\2\u0a71\u0a77"+
		"\7\u00ab\2\2\u0a72\u0a77\7\u00a9\2\2\u0a73\u0a77\7\u00ad\2\2\u0a74\u0a77"+
		"\7\u00aa\2\2\u0a75\u0a77\5\u0160\u00b1\2\u0a76\u0a71\3\2\2\2\u0a76\u0a72"+
		"\3\2\2\2\u0a76\u0a73\3\2\2\2\u0a76\u0a74\3\2\2\2\u0a76\u0a75\3\2\2\2\u0a77"+
		"\u01c9\3\2\2\2\u0a78\u0a79\7\u008d\2\2\u0a79\u0a7a\5\u01cc\u00e7\2\u0a7a"+
		"\u0a7b\7\16\2\2\u0a7b\u0a80\3\2\2\2\u0a7c\u0a7d\5\u01cc\u00e7\2\u0a7d"+
		"\u0a7e\7\16\2\2\u0a7e\u0a80\3\2\2\2\u0a7f\u0a78\3\2\2\2\u0a7f\u0a7c\3"+
		"\2\2\2\u0a80\u01cb\3\2\2\2\u0a81\u0a82\b\u00e7\1\2\u0a82\u0a83\5\u01ce"+
		"\u00e8\2\u0a83\u0a88\3\2\2\2\u0a84\u0a85\f\3\2\2\u0a85\u0a87\5\u01d4\u00eb"+
		"\2\u0a86\u0a84\3\2\2\2\u0a87\u0a8a\3\2\2\2\u0a88\u0a86\3\2\2\2\u0a88\u0a89"+
		"\3\2\2\2\u0a89\u01cd\3\2\2\2\u0a8a\u0a88\3\2\2\2\u0a8b\u0a91\5\u01d0\u00e9"+
		"\2\u0a8c\u0a91\5\u01d2\u00ea\2\u0a8d\u0a91\5\u01dc\u00ef\2\u0a8e\u0a91"+
		"\5\u01de\u00f0\2\u0a8f\u0a91\5\u01e0\u00f1\2\u0a90\u0a8b\3\2\2\2\u0a90"+
		"\u0a8c\3\2\2\2\u0a90\u0a8d\3\2\2\2\u0a90\u0a8e\3\2\2\2\u0a90\u0a8f\3\2"+
		"\2\2\u0a91\u01cf\3\2\2\2\u0a92\u0a93\5\u0122\u0092\2\u0a93\u01d1\3\2\2"+
		"\2\u0a94\u0a95\5\u0162\u00b2\2\u0a95\u0a96\5\u01d6\u00ec\2\u0a96\u01d3"+
		"\3\2\2\2\u0a97\u0a98\7\21\2\2\u0a98\u0a9b\5\u01d6\u00ec\2\u0a99\u0a9b"+
		"\5\u01da\u00ee\2\u0a9a\u0a97\3\2\2\2\u0a9a\u0a99\3\2\2\2\u0a9b\u01d5\3"+
		"\2\2\2\u0a9c\u0a9d\5\u01e2\u00f2\2\u0a9d\u0a9f\7\22\2\2\u0a9e\u0aa0\5"+
		"\u01d8\u00ed\2\u0a9f\u0a9e\3\2\2\2\u0a9f\u0aa0\3\2\2\2\u0aa0\u0aa1\3\2"+
		"\2\2\u0aa1\u0aa2\7\23\2\2\u0aa2\u01d7\3\2\2\2\u0aa3\u0aa4\b\u00ed\1\2"+
		"\u0aa4\u0aa5\5\u01cc\u00e7\2\u0aa5\u0aab\3\2\2\2\u0aa6\u0aa7\f\3\2\2\u0aa7"+
		"\u0aa8\7\17\2\2\u0aa8\u0aaa\5\u01cc\u00e7\2\u0aa9\u0aa6\3\2\2\2\u0aaa"+
		"\u0aad\3\2\2\2\u0aab\u0aa9\3\2\2\2\u0aab\u0aac\3\2\2\2\u0aac\u01d9\3\2"+
		"\2\2\u0aad\u0aab\3\2\2\2\u0aae\u0aaf\7\24\2\2\u0aaf\u0ab0\5\u01cc\u00e7"+
		"\2\u0ab0\u0ab1\7\25\2\2\u0ab1\u01db\3\2\2\2\u0ab2\u0ab3\7\22\2\2\u0ab3"+
		"\u0ab4\5\u01cc\u00e7\2\u0ab4\u0ab5\7\23\2\2\u0ab5\u01dd\3\2\2\2\u0ab6"+
		"\u0ab7\b\u00f0\1\2\u0ab7\u0aba\7\u00ad\2\2\u0ab8\u0aba\5\u01e2\u00f2\2"+
		"\u0ab9\u0ab6\3\2\2\2\u0ab9\u0ab8\3\2\2\2\u0aba\u0ac0\3\2\2\2\u0abb\u0abc"+
		"\f\3\2\2\u0abc\u0abd\7\21\2\2\u0abd\u0abf\5\u01e2\u00f2\2\u0abe\u0abb"+
		"\3\2\2\2\u0abf\u0ac2\3\2\2\2\u0ac0\u0abe\3\2\2\2\u0ac0\u0ac1\3\2\2\2\u0ac1"+
		"\u01df\3\2\2\2\u0ac2\u0ac0\3\2\2\2\u0ac3\u0ac9\7\u00b2\2\2\u0ac4\u0ac9"+
		"\7\u00b4\2\2\u0ac5\u0ac9\7\u00af\2\2\u0ac6\u0ac9\7\u00a5\2\2\u0ac7\u0ac9"+
		"\7\u00a6\2\2\u0ac8\u0ac3\3\2\2\2\u0ac8\u0ac4\3\2\2\2\u0ac8\u0ac5\3\2\2"+
		"\2\u0ac8\u0ac6\3\2\2\2\u0ac8\u0ac7\3\2\2\2\u0ac9\u01e1\3\2\2\2\u0aca\u0ad0"+
		"\7\u00ab\2\2\u0acb\u0ad0\7\u00a9\2\2\u0acc\u0ad0\7\u00ad\2\2\u0acd\u0ad0"+
		"\7\u00aa\2\2\u0ace\u0ad0\5\u0160\u00b1\2\u0acf\u0aca\3\2\2\2\u0acf\u0acb"+
		"\3\2\2\2\u0acf\u0acc\3\2\2\2\u0acf\u0acd\3\2\2\2\u0acf\u0ace\3\2\2\2\u0ad0"+
		"\u01e3\3\2\2\2\u0ad1\u0ad4\5\u01e6\u00f4\2\u0ad2\u0ad4\5\u01e8\u00f5\2"+
		"\u0ad3\u0ad1\3\2\2\2\u0ad3\u0ad2\3\2\2\2\u0ad4\u01e5\3\2\2\2\u0ad5\u0add"+
		"\5\u01ee\u00f8\2\u0ad6\u0ad8\5\u01f0\u00f9\2\u0ad7\u0ad9\5\u01fc\u00ff"+
		"\2\u0ad8\u0ad7\3\2\2\2\u0ad8\u0ad9\3\2\2\2\u0ad9\u0ada\3\2\2\2\u0ada\u0adb"+
		"\5\u01f2\u00fa\2\u0adb\u0add\3\2\2\2\u0adc\u0ad5\3\2\2\2\u0adc\u0ad6\3"+
		"\2\2\2\u0add\u01e7\3\2\2\2\u0ade\u0adf\5\u01ea\u00f6\2\u0adf\u0ae1\5\u0096"+
		"L\2\u0ae0\u0ae2\5\u01fc\u00ff\2\u0ae1\u0ae0\3\2\2\2\u0ae1\u0ae2\3\2\2"+
		"\2\u0ae2\u0ae3\3\2\2\2\u0ae3\u0ae4\5\u0096L\2\u0ae4\u0ae5\5\u01ec\u00f7"+
		"\2\u0ae5\u01e9\3\2\2\2\u0ae6\u0ae7\7\'\2\2\u0ae7\u0aea\7%\2\2\u0ae8\u0aea"+
		"\7)\2\2\u0ae9\u0ae6\3\2\2\2\u0ae9\u0ae8\3\2\2\2\u0aea\u01eb\3\2\2\2\u0aeb"+
		"\u0aec\7\'\2\2\u0aec\u0aed\7!\2\2\u0aed\u0aee\7%\2\2\u0aee\u01ed\3\2\2"+
		"\2\u0aef\u0af0\7\'\2\2\u0af0\u0af1\5\u01f4\u00fb\2\u0af1\u0af5\5\u0096"+
		"L\2\u0af2\u0af4\5\u01f8\u00fd\2\u0af3\u0af2\3\2\2\2\u0af4\u0af7\3\2\2"+
		"\2\u0af5\u0af3\3\2\2\2\u0af5\u0af6\3\2\2\2\u0af6\u0af8\3\2\2\2\u0af7\u0af5"+
		"\3\2\2\2\u0af8\u0af9\7!\2\2\u0af9\u0afa\7%\2\2\u0afa\u01ef\3\2\2\2\u0afb"+
		"\u0afc\7\'\2\2\u0afc\u0afd\5\u01f4\u00fb\2\u0afd\u0b01\5\u0096L\2\u0afe"+
		"\u0b00\5\u01f8\u00fd\2\u0aff\u0afe\3\2\2\2\u0b00\u0b03\3\2\2\2\u0b01\u0aff"+
		"\3\2\2\2\u0b01\u0b02\3\2\2\2\u0b02\u0b04\3\2\2\2\u0b03\u0b01\3\2\2\2\u0b04"+
		"\u0b05\7%\2\2\u0b05\u01f1\3\2\2\2\u0b06\u0b07\7\'\2\2\u0b07\u0b08\7!\2"+
		"\2\u0b08\u0b09\5\u01f4\u00fb\2\u0b09\u0b0a\7%\2\2\u0b0a\u01f3\3\2\2\2"+
		"\u0b0b\u0b10\5\u01f6\u00fc\2\u0b0c\u0b0d\7\21\2\2\u0b0d\u0b0f\5\u01f6"+
		"\u00fc\2\u0b0e\u0b0c\3\2\2\2\u0b0f\u0b12\3\2\2\2\u0b10\u0b0e\3\2\2\2\u0b10"+
		"\u0b11\3\2\2\2\u0b11\u01f5\3\2\2\2\u0b12\u0b10\3\2\2\2\u0b13\u0b17\5\u00d2"+
		"j\2\u0b14\u0b16\5\u00d4k\2\u0b15\u0b14\3\2\2\2\u0b16\u0b19\3\2\2\2\u0b17"+
		"\u0b15\3\2\2\2\u0b17\u0b18\3\2\2\2\u0b18\u01f7\3\2\2\2\u0b19\u0b17\3\2"+
		"\2\2\u0b1a\u0b1d\5\u01f6\u00fc\2\u0b1b\u0b1c\7+\2\2\u0b1c\u0b1e\5\u01fa"+
		"\u00fe\2\u0b1d\u0b1b\3\2\2\2\u0b1d\u0b1e\3\2\2\2\u0b1e\u0b1f\3\2\2\2\u0b1f"+
		"\u0b20\5\u0096L\2\u0b20\u01f9\3\2\2\2\u0b21\u0b27\7\u00af\2\2\u0b22\u0b23"+
		"\7\26\2\2\u0b23\u0b24\5`\61\2\u0b24\u0b25\7\27\2\2\u0b25\u0b27\3\2\2\2"+
		"\u0b26\u0b21\3\2\2\2\u0b26\u0b22\3\2\2\2\u0b27\u01fb\3\2\2\2\u0b28\u0b2a"+
		"\5\u01fe\u0100\2\u0b29\u0b28\3\2\2\2\u0b2a\u0b2b\3\2\2\2\u0b2b\u0b29\3"+
		"\2\2\2\u0b2b\u0b2c\3\2\2\2\u0b2c\u01fd\3\2\2\2\u0b2d\u0b35\5\u0200\u0101"+
		"\2\u0b2e\u0b35\5\u01e6\u00f4\2\u0b2f\u0b31\7\26\2\2\u0b30\u0b32\5`\61"+
		"\2\u0b31\u0b30\3\2\2\2\u0b31\u0b32\3\2\2\2\u0b32\u0b33\3\2\2\2\u0b33\u0b35"+
		"\7\27\2\2\u0b34\u0b2d\3\2\2\2\u0b34\u0b2e\3\2\2\2\u0b34\u0b2f\3\2\2\2"+
		"\u0b35\u01ff\3\2\2\2\u0b36\u0b38\5\u0202\u0102\2\u0b37\u0b36\3\2\2\2\u0b38"+
		"\u0b39\3\2\2\2\u0b39\u0b37\3\2\2\2\u0b39\u0b3a\3\2\2\2\u0b3a\u0201\3\2"+
		"\2\2\u0b3b\u0b3e\n\16\2\2\u0b3c\u0b3e\7\u00b9\2\2\u0b3d\u0b3b\3\2\2\2"+
		"\u0b3d\u0b3c\3\2\2\2\u0b3e\u0203\3\2\2\2\u0b3f\u0b41\7\26\2\2\u0b40\u0b42"+
		"\5\u0206\u0104\2\u0b41\u0b40\3\2\2\2\u0b42\u0b43\3\2\2\2\u0b43\u0b41\3"+
		"\2\2\2\u0b43\u0b44\3\2\2\2\u0b44\u0b45\3\2\2\2\u0b45\u0b46\7\27\2\2\u0b46"+
		"\u0205\3\2\2\2\u0b47\u0b48\5\u0208\u0105\2\u0b48\u0b4a\7\r\2\2\u0b49\u0b4b"+
		"\5\u020a\u0106\2\u0b4a\u0b49\3\2\2\2\u0b4b\u0b4c\3\2\2\2\u0b4c\u0b4a\3"+
		"\2\2\2\u0b4c\u0b4d\3\2\2\2\u0b4d\u0b4e\3\2\2\2\u0b4e\u0b4f\7\16\2\2\u0b4f"+
		"\u0207\3\2\2\2\u0b50\u0b51\b\u0105\1\2\u0b51\u0b55\5\u00d2j\2\u0b52\u0b53"+
		"\7\37\2\2\u0b53\u0b55\5\u00d6l\2\u0b54\u0b50\3\2\2\2\u0b54\u0b52\3\2\2"+
		"\2\u0b55\u0b5e\3\2\2\2\u0b56\u0b58\f\3\2\2\u0b57\u0b59\5\u00d4k\2\u0b58"+
		"\u0b57\3\2\2\2\u0b59\u0b5a\3\2\2\2\u0b5a\u0b58\3\2\2\2\u0b5a\u0b5b\3\2"+
		"\2\2\u0b5b\u0b5d\3\2\2\2\u0b5c\u0b56\3\2\2\2\u0b5d\u0b60\3\2\2\2\u0b5e"+
		"\u0b5c\3\2\2\2\u0b5e\u0b5f\3\2\2\2\u0b5f\u0209\3\2\2\2\u0b60\u0b5e\3\2"+
		"\2\2\u0b61\u0b62\7\26\2\2\u0b62\u0b63\5`\61\2\u0b63\u0b64\7\27\2\2\u0b64"+
		"\u0b67\3\2\2\2\u0b65\u0b67\5\u020c\u0107\2\u0b66\u0b61\3\2\2\2\u0b66\u0b65"+
		"\3\2\2\2\u0b67\u020b\3\2\2\2\u0b68\u0b6a\n\17\2\2\u0b69\u0b68\3\2\2\2"+
		"\u0b6a\u0b6b\3\2\2\2\u0b6b\u0b69\3\2\2\2\u0b6b\u0b6c\3\2\2\2\u0b6c\u020d"+
		"\3\2\2\2\u011c\u0215\u0219\u0234\u023b\u0243\u0245\u024d\u025a\u0262\u0266"+
		"\u0270\u027c\u0282\u0285\u0288\u0291\u0299\u029e\u02a4\u02ac\u02b1\u02b7"+
		"\u02bc\u02c5\u02ca\u02cf\u02d8\u02dd\u02f1\u02f6\u02f9\u02ff\u0305\u0308"+
		"\u030e\u0313\u0318\u031b\u0321\u0338\u0342\u0347\u034e\u0350\u0367\u0378"+
		"\u037f\u0387\u038f\u03a6\u03a8\u03b7\u03bf\u03c9\u03de\u03e2\u03f6\u0403"+
		"\u0407\u040f\u0412\u0417\u041a\u0422\u042d\u0431\u0438\u043f\u0446\u044c"+
		"\u0453\u0463\u0474\u048f\u0497\u049d\u04a3\u04b6\u04bb\u04c2\u04d0\u04d2"+
		"\u04e3\u04f1\u04fa\u0505\u0512\u051e\u052a\u0535\u0542\u054d\u0555\u055b"+
		"\u0564\u056b\u0572\u057a\u057c\u0584\u058f\u0599\u059f\u05a8\u05af\u05b6"+
		"\u05be\u05c1\u05d2\u05db\u05eb\u05f2\u05f9\u05fd\u0609\u0610\u0617\u0624"+
		"\u0632\u0638\u063c\u0647\u064f\u0657\u0660\u066a\u066d\u0671\u067d\u0683"+
		"\u068b\u0694\u069c\u06a9\u06ac\u06b0\u06b5\u06b9\u06c2\u06dc\u06e5\u06e7"+
		"\u06ec\u0700\u0705\u070e\u0712\u0719\u071e\u0722\u072e\u073f\u0744\u0747"+
		"\u074b\u0750\u0757\u0762\u0764\u076d\u0775\u077d\u0785\u078d\u0795\u079d"+
		"\u07a3\u07af\u07b3\u07bd\u07c5\u07c9\u07cf\u07d6\u07db\u07e2\u07ea\u07f1"+
		"\u07fb\u0808\u080c\u080f\u0813\u0816\u081e\u0827\u0830\u0839\u084a\u084f"+
		"\u0858\u0863\u086a\u0872\u087c\u0884\u0887\u088b\u0890\u089a\u089e\u08a9"+
		"\u08ac\u08b3\u08bc\u08c3\u08cc\u08d7\u08e4\u08eb\u08f8\u0902\u0905\u0909"+
		"\u091f\u0927\u092b\u0932\u093b\u0963\u096c\u0976\u0982\u0987\u0993\u09a5"+
		"\u09ac\u09b1\u09ba\u09c2\u09cc\u09d1\u09db\u09e5\u09f5\u09ff\u0a06\u0a0e"+
		"\u0a15\u0a1e\u0a27\u0a2f\u0a39\u0a3e\u0a4a\u0a5d\u0a67\u0a6f\u0a76\u0a7f"+
		"\u0a88\u0a90\u0a9a\u0a9f\u0aab\u0ab9\u0ac0\u0ac8\u0acf\u0ad3\u0ad8\u0adc"+
		"\u0ae1\u0ae9\u0af5\u0b01\u0b10\u0b17\u0b1d\u0b26\u0b2b\u0b31\u0b34\u0b39"+
		"\u0b3d\u0b43\u0b4c\u0b54\u0b5a\u0b5e\u0b66\u0b6b";
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