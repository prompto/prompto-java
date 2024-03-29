// Generated from EParser.g4 by ANTLR 4.9.3
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
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

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
		UUID=69, DBID=70, ITERATOR=71, CURSOR=72, HTML=73, TYPE=74, ABSTRACT=75, 
		ALL=76, ALWAYS=77, AND=78, ANY=79, AS=80, ASC=81, ATTR=82, ATTRIBUTE=83, 
		ATTRIBUTES=84, BINDINGS=85, BREAK=86, BY=87, CASE=88, CATCH=89, CATEGORY=90, 
		CLASS=91, CONTAINS=92, DEF=93, DEFAULT=94, DEFINE=95, DELETE=96, DESC=97, 
		DO=98, DOING=99, EACH=100, ELSE=101, ENUM=102, ENUMERATED=103, EXCEPT=104, 
		EXECUTE=105, EXPECTING=106, EXTENDS=107, FETCH=108, FILTERED=109, FINALLY=110, 
		FLUSH=111, FOR=112, FROM=113, GETTER=114, HAS=115, IF=116, IN=117, INCLUDE=118, 
		INDEX=119, INVOKE_COLON=120, IS=121, MATCHING=122, METHOD=123, METHODS=124, 
		MODULO=125, MUTABLE=126, NATIVE=127, NONE=128, NOT=129, NOTHING=130, NULL=131, 
		ON=132, ONE=133, OPERATOR=134, OR=135, ORDER=136, OTHERWISE=137, PASS=138, 
		RAISE=139, READ=140, RECEIVING=141, RESOURCE=142, RETURN=143, RETURNING=144, 
		ROWS=145, SELF=146, SETTER=147, SINGLETON=148, SORTED=149, STORABLE=150, 
		STORE=151, SUPER=152, SWITCH=153, TEST=154, THEN=155, THIS=156, THROW=157, 
		TO=158, TRY=159, VERIFYING=160, WIDGET=161, WITH=162, WHEN=163, WHERE=164, 
		WHILE=165, WRITE=166, BOOLEAN_LITERAL=167, CHAR_LITERAL=168, MIN_INTEGER=169, 
		MAX_INTEGER=170, SYMBOL_IDENTIFIER=171, TYPE_IDENTIFIER=172, VARIABLE_IDENTIFIER=173, 
		NATIVE_IDENTIFIER=174, DOLLAR_IDENTIFIER=175, ARONDBASE_IDENTIFIER=176, 
		TEXT_LITERAL=177, UUID_LITERAL=178, VERSION_LITERAL=179, INTEGER_LITERAL=180, 
		HEXA_LITERAL=181, DECIMAL_LITERAL=182, DATETIME_LITERAL=183, TIME_LITERAL=184, 
		DATE_LITERAL=185, PERIOD_LITERAL=186, JSX_TEXT=187;
	public static final int
		RULE_enum_category_declaration = 0, RULE_enum_native_declaration = 1, 
		RULE_native_symbol = 2, RULE_category_symbol = 3, RULE_attribute_declaration = 4, 
		RULE_concrete_widget_declaration = 5, RULE_native_widget_declaration = 6, 
		RULE_concrete_category_declaration = 7, RULE_singleton_category_declaration = 8, 
		RULE_derived_list = 9, RULE_operator_method_declaration = 10, RULE_setter_method_declaration = 11, 
		RULE_native_setter_declaration = 12, RULE_getter_method_declaration = 13, 
		RULE_native_getter_declaration = 14, RULE_native_category_declaration = 15, 
		RULE_native_resource_declaration = 16, RULE_native_category_bindings = 17, 
		RULE_native_category_binding_list = 18, RULE_attribute_list = 19, RULE_abstract_global_method_declaration = 20, 
		RULE_abstract_member_method_declaration = 21, RULE_concrete_method_declaration = 22, 
		RULE_native_method_declaration = 23, RULE_test_method_declaration = 24, 
		RULE_assertion = 25, RULE_full_argument_list = 26, RULE_typed_argument = 27, 
		RULE_statement = 28, RULE_flush_statement = 29, RULE_store_statement = 30, 
		RULE_method_call_statement = 31, RULE_with_resource_statement = 32, RULE_with_singleton_statement = 33, 
		RULE_switch_statement = 34, RULE_switch_case_statement = 35, RULE_for_each_statement = 36, 
		RULE_do_while_statement = 37, RULE_while_statement = 38, RULE_if_statement = 39, 
		RULE_else_if_statement_list = 40, RULE_raise_statement = 41, RULE_try_statement = 42, 
		RULE_catch_statement = 43, RULE_break_statement = 44, RULE_return_statement = 45, 
		RULE_expression = 46, RULE_filter_expression = 47, RULE_unresolved_expression = 48, 
		RULE_unresolved_selector = 49, RULE_invocation_expression = 50, RULE_invocation_trailer = 51, 
		RULE_selectable_expression = 52, RULE_instance_expression = 53, RULE_instance_selector = 54, 
		RULE_mutable_instance_expression = 55, RULE_document_expression = 56, 
		RULE_blob_expression = 57, RULE_constructor_expression = 58, RULE_write_statement = 59, 
		RULE_ambiguous_expression = 60, RULE_filtered_list_suffix = 61, RULE_fetch_expression = 62, 
		RULE_fetch_statement = 63, RULE_include_list = 64, RULE_then = 65, RULE_read_statement = 66, 
		RULE_sorted_expression = 67, RULE_argument_assignment_list = 68, RULE_with_argument_assignment_list = 69, 
		RULE_argument_assignment = 70, RULE_assign_instance_statement = 71, RULE_child_instance = 72, 
		RULE_assign_tuple_statement = 73, RULE_lfs = 74, RULE_lfp = 75, RULE_ws_plus = 76, 
		RULE_indent = 77, RULE_dedent = 78, RULE_type_literal = 79, RULE_null_literal = 80, 
		RULE_repl = 81, RULE_declaration_list = 82, RULE_declarations = 83, RULE_declaration = 84, 
		RULE_annotation_constructor = 85, RULE_annotation_identifier = 86, RULE_annotation_argument = 87, 
		RULE_annotation_argument_name = 88, RULE_annotation_argument_value = 89, 
		RULE_resource_declaration = 90, RULE_enum_declaration = 91, RULE_native_symbol_list = 92, 
		RULE_category_symbol_list = 93, RULE_symbol_list = 94, RULE_attribute_constraint = 95, 
		RULE_list_literal = 96, RULE_set_literal = 97, RULE_expression_list = 98, 
		RULE_range_literal = 99, RULE_typedef = 100, RULE_primary_type = 101, 
		RULE_native_type = 102, RULE_category_type = 103, RULE_mutable_category_type = 104, 
		RULE_code_type = 105, RULE_category_declaration = 106, RULE_widget_declaration = 107, 
		RULE_type_identifier_list = 108, RULE_identifier_or_keyword = 109, RULE_nospace_hyphen_identifier_or_keyword = 110, 
		RULE_nospace_identifier_or_keyword = 111, RULE_identifier = 112, RULE_member_identifier = 113, 
		RULE_method_identifier = 114, RULE_variable_identifier = 115, RULE_attribute_identifier = 116, 
		RULE_type_identifier = 117, RULE_symbol_identifier = 118, RULE_argument_list = 119, 
		RULE_argument = 120, RULE_operator_argument = 121, RULE_named_argument = 122, 
		RULE_code_argument = 123, RULE_category_or_any_type = 124, RULE_any_type = 125, 
		RULE_member_method_declaration_list = 126, RULE_member_method_declaration = 127, 
		RULE_native_member_method_declaration_list = 128, RULE_native_member_method_declaration = 129, 
		RULE_native_category_binding = 130, RULE_python_category_binding = 131, 
		RULE_python_module = 132, RULE_javascript_category_binding = 133, RULE_javascript_module = 134, 
		RULE_variable_identifier_list = 135, RULE_attribute_identifier_list = 136, 
		RULE_method_declaration = 137, RULE_comment_statement = 138, RULE_native_statement_list = 139, 
		RULE_native_statement = 140, RULE_python_native_statement = 141, RULE_javascript_native_statement = 142, 
		RULE_statement_list = 143, RULE_assertion_list = 144, RULE_switch_case_statement_list = 145, 
		RULE_catch_statement_list = 146, RULE_literal_collection = 147, RULE_atomic_literal = 148, 
		RULE_literal_list_literal = 149, RULE_this_expression = 150, RULE_super_expression = 151, 
		RULE_parenthesis_expression = 152, RULE_literal_expression = 153, RULE_collection_literal = 154, 
		RULE_tuple_literal = 155, RULE_dict_literal = 156, RULE_document_literal = 157, 
		RULE_expression_tuple = 158, RULE_doc_entry_list = 159, RULE_doc_entry = 160, 
		RULE_doc_key = 161, RULE_dict_entry_list = 162, RULE_dict_entry = 163, 
		RULE_dict_key = 164, RULE_slice_arguments = 165, RULE_assign_variable_statement = 166, 
		RULE_assignable_instance = 167, RULE_is_expression = 168, RULE_metadata = 169, 
		RULE_arrow_expression = 170, RULE_arrow_prefix = 171, RULE_arrow_args = 172, 
		RULE_sorted_key = 173, RULE_read_blob_expression = 174, RULE_read_all_expression = 175, 
		RULE_read_one_expression = 176, RULE_order_by_list = 177, RULE_order_by = 178, 
		RULE_operator = 179, RULE_keyword = 180, RULE_new_token = 181, RULE_key_token = 182, 
		RULE_module_token = 183, RULE_value_token = 184, RULE_symbols_token = 185, 
		RULE_assign = 186, RULE_multiply = 187, RULE_divide = 188, RULE_idivide = 189, 
		RULE_modulo = 190, RULE_javascript_statement = 191, RULE_javascript_expression = 192, 
		RULE_javascript_primary_expression = 193, RULE_javascript_this_expression = 194, 
		RULE_javascript_new_expression = 195, RULE_javascript_selector_expression = 196, 
		RULE_javascript_method_expression = 197, RULE_javascript_arguments = 198, 
		RULE_javascript_item_expression = 199, RULE_javascript_parenthesis_expression = 200, 
		RULE_javascript_identifier_expression = 201, RULE_javascript_literal_expression = 202, 
		RULE_javascript_identifier = 203, RULE_python_statement = 204, RULE_python_expression = 205, 
		RULE_python_primary_expression = 206, RULE_python_self_expression = 207, 
		RULE_python_selector_expression = 208, RULE_python_method_expression = 209, 
		RULE_python_argument_list = 210, RULE_python_ordinal_argument_list = 211, 
		RULE_python_named_argument_list = 212, RULE_python_parenthesis_expression = 213, 
		RULE_python_identifier_expression = 214, RULE_python_literal_expression = 215, 
		RULE_python_identifier = 216, RULE_java_statement = 217, RULE_java_expression = 218, 
		RULE_java_primary_expression = 219, RULE_java_this_expression = 220, RULE_java_new_expression = 221, 
		RULE_java_selector_expression = 222, RULE_java_method_expression = 223, 
		RULE_java_arguments = 224, RULE_java_item_expression = 225, RULE_java_parenthesis_expression = 226, 
		RULE_java_identifier_expression = 227, RULE_java_class_identifier_expression = 228, 
		RULE_java_literal_expression = 229, RULE_java_identifier = 230, RULE_csharp_statement = 231, 
		RULE_csharp_expression = 232, RULE_csharp_primary_expression = 233, RULE_csharp_this_expression = 234, 
		RULE_csharp_new_expression = 235, RULE_csharp_selector_expression = 236, 
		RULE_csharp_method_expression = 237, RULE_csharp_arguments = 238, RULE_csharp_item_expression = 239, 
		RULE_csharp_parenthesis_expression = 240, RULE_csharp_identifier_expression = 241, 
		RULE_csharp_literal_expression = 242, RULE_csharp_identifier = 243, RULE_jsx_expression = 244, 
		RULE_jsx_element = 245, RULE_jsx_fragment = 246, RULE_jsx_fragment_start = 247, 
		RULE_jsx_fragment_end = 248, RULE_jsx_self_closing = 249, RULE_jsx_opening = 250, 
		RULE_jsx_closing = 251, RULE_jsx_element_name = 252, RULE_jsx_identifier = 253, 
		RULE_jsx_attribute = 254, RULE_jsx_attribute_value = 255, RULE_jsx_children = 256, 
		RULE_jsx_child = 257, RULE_jsx_text = 258, RULE_jsx_char = 259, RULE_css_expression = 260, 
		RULE_css_field = 261, RULE_css_identifier = 262, RULE_css_value = 263, 
		RULE_css_text = 264;
	private static String[] makeRuleNames() {
		return new String[] {
			"enum_category_declaration", "enum_native_declaration", "native_symbol", 
			"category_symbol", "attribute_declaration", "concrete_widget_declaration", 
			"native_widget_declaration", "concrete_category_declaration", "singleton_category_declaration", 
			"derived_list", "operator_method_declaration", "setter_method_declaration", 
			"native_setter_declaration", "getter_method_declaration", "native_getter_declaration", 
			"native_category_declaration", "native_resource_declaration", "native_category_bindings", 
			"native_category_binding_list", "attribute_list", "abstract_global_method_declaration", 
			"abstract_member_method_declaration", "concrete_method_declaration", 
			"native_method_declaration", "test_method_declaration", "assertion", 
			"full_argument_list", "typed_argument", "statement", "flush_statement", 
			"store_statement", "method_call_statement", "with_resource_statement", 
			"with_singleton_statement", "switch_statement", "switch_case_statement", 
			"for_each_statement", "do_while_statement", "while_statement", "if_statement", 
			"else_if_statement_list", "raise_statement", "try_statement", "catch_statement", 
			"break_statement", "return_statement", "expression", "filter_expression", 
			"unresolved_expression", "unresolved_selector", "invocation_expression", 
			"invocation_trailer", "selectable_expression", "instance_expression", 
			"instance_selector", "mutable_instance_expression", "document_expression", 
			"blob_expression", "constructor_expression", "write_statement", "ambiguous_expression", 
			"filtered_list_suffix", "fetch_expression", "fetch_statement", "include_list", 
			"then", "read_statement", "sorted_expression", "argument_assignment_list", 
			"with_argument_assignment_list", "argument_assignment", "assign_instance_statement", 
			"child_instance", "assign_tuple_statement", "lfs", "lfp", "ws_plus", 
			"indent", "dedent", "type_literal", "null_literal", "repl", "declaration_list", 
			"declarations", "declaration", "annotation_constructor", "annotation_identifier", 
			"annotation_argument", "annotation_argument_name", "annotation_argument_value", 
			"resource_declaration", "enum_declaration", "native_symbol_list", "category_symbol_list", 
			"symbol_list", "attribute_constraint", "list_literal", "set_literal", 
			"expression_list", "range_literal", "typedef", "primary_type", "native_type", 
			"category_type", "mutable_category_type", "code_type", "category_declaration", 
			"widget_declaration", "type_identifier_list", "identifier_or_keyword", 
			"nospace_hyphen_identifier_or_keyword", "nospace_identifier_or_keyword", 
			"identifier", "member_identifier", "method_identifier", "variable_identifier", 
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
			"read_one_expression", "order_by_list", "order_by", "operator", "keyword", 
			"new_token", "key_token", "module_token", "value_token", "symbols_token", 
			"assign", "multiply", "divide", "idivide", "modulo", "javascript_statement", 
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
			null, null, null, null, null, null, "'\t'", "' '", null, "'Java:'", "'C#:'", 
			"'Python2:'", "'Python3:'", "'JavaScript:'", "'Swift:'", "':'", "';'", 
			null, "'..'", null, null, null, null, null, null, null, null, "'!'", 
			"'&'", "'&&'", "'|'", "'||'", null, "'-'", "'*'", "'/'", "'\\'", "'%'", 
			"'#'", "'>'", "'>='", "'<'", "'<='", "'<>'", "'<:>'", "'='", "'!='", 
			"'=='", "'~='", "'~'", "'<-'", "'->'", "'=>'", "'Boolean'", "'Css'", 
			"'Character'", "'Text'", "'Integer'", "'Decimal'", "'Date'", "'Time'", 
			"'DateTime'", "'Period'", "'Version'", "'Method:'", "'Code'", "'Document'", 
			"'Blob'", "'Image'", "'Uuid'", "'DbId'", "'Iterator'", "'Cursor'", "'Html'", 
			"'Type'", "'abstract'", "'all'", "'always'", "'and'", "'any'", "'as'", 
			null, "'attr'", "'attribute'", "'attributes'", "'bindings'", "'break'", 
			"'by'", "'case'", "'catch'", "'category'", "'class'", "'contains'", "'def'", 
			"'default'", "'define'", "'delete'", null, "'do'", "'doing'", "'each'", 
			"'else'", "'enum'", "'enumerated'", "'except'", "'execute'", "'expecting'", 
			"'extends'", "'fetch'", "'filtered'", "'finally'", "'flush'", "'for'", 
			"'from'", "'getter'", "'has'", "'if'", "'in'", "'include'", "'index'", 
			"'invoke:'", "'is'", "'matching'", "'method'", "'methods'", "'modulo'", 
			"'mutable'", "'native'", "'None'", "'not'", null, "'null'", "'on'", "'one'", 
			"'operator'", "'or'", "'order'", "'otherwise'", "'pass'", "'raise'", 
			"'read'", "'receiving'", "'resource'", "'return'", "'returning'", "'rows'", 
			"'self'", "'setter'", "'singleton'", "'sorted'", "'storable'", "'store'", 
			"'super'", "'switch'", "'test'", "'then'", "'this'", "'throw'", "'to'", 
			"'try'", "'verifying'", "'widget'", "'with'", "'when'", "'where'", "'while'", 
			"'write'", null, null, "'MIN_INTEGER'", "'MAX_INTEGER'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INDENT", "DEDENT", "LF_TAB", "LF_MORE", "LF", "TAB", "WS", "COMMENT", 
			"JAVA", "CSHARP", "PYTHON2", "PYTHON3", "JAVASCRIPT", "SWIFT", "COLON", 
			"SEMI", "COMMA", "RANGE", "DOT", "LPAR", "RPAR", "LBRAK", "RBRAK", "LCURL", 
			"RCURL", "QMARK", "XMARK", "AMP", "AMP2", "PIPE", "PIPE2", "PLUS", "MINUS", 
			"STAR", "SLASH", "BSLASH", "PERCENT", "SHARP", "GT", "GTE", "LT", "LTE", 
			"LTGT", "LTCOLONGT", "EQ", "XEQ", "EQ2", "TEQ", "TILDE", "LARROW", "RARROW", 
			"EGT", "BOOLEAN", "CSS", "CHARACTER", "TEXT", "INTEGER", "DECIMAL", "DATE", 
			"TIME", "DATETIME", "PERIOD", "VERSION", "METHOD_COLON", "CODE", "DOCUMENT", 
			"BLOB", "IMAGE", "UUID", "DBID", "ITERATOR", "CURSOR", "HTML", "TYPE", 
			"ABSTRACT", "ALL", "ALWAYS", "AND", "ANY", "AS", "ASC", "ATTR", "ATTRIBUTE", 
			"ATTRIBUTES", "BINDINGS", "BREAK", "BY", "CASE", "CATCH", "CATEGORY", 
			"CLASS", "CONTAINS", "DEF", "DEFAULT", "DEFINE", "DELETE", "DESC", "DO", 
			"DOING", "EACH", "ELSE", "ENUM", "ENUMERATED", "EXCEPT", "EXECUTE", "EXPECTING", 
			"EXTENDS", "FETCH", "FILTERED", "FINALLY", "FLUSH", "FOR", "FROM", "GETTER", 
			"HAS", "IF", "IN", "INCLUDE", "INDEX", "INVOKE_COLON", "IS", "MATCHING", 
			"METHOD", "METHODS", "MODULO", "MUTABLE", "NATIVE", "NONE", "NOT", "NOTHING", 
			"NULL", "ON", "ONE", "OPERATOR", "OR", "ORDER", "OTHERWISE", "PASS", 
			"RAISE", "READ", "RECEIVING", "RESOURCE", "RETURN", "RETURNING", "ROWS", 
			"SELF", "SETTER", "SINGLETON", "SORTED", "STORABLE", "STORE", "SUPER", 
			"SWITCH", "TEST", "THEN", "THIS", "THROW", "TO", "TRY", "VERIFYING", 
			"WIDGET", "WITH", "WHEN", "WHERE", "WHILE", "WRITE", "BOOLEAN_LITERAL", 
			"CHAR_LITERAL", "MIN_INTEGER", "MAX_INTEGER", "SYMBOL_IDENTIFIER", "TYPE_IDENTIFIER", 
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
			setState(530);
			match(DEFINE);
			setState(531);
			((Enum_category_declarationContext)_localctx).name = type_identifier();
			setState(532);
			match(AS);
			setState(533);
			match(ENUMERATED);
			setState(536);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CATEGORY:
				{
				setState(534);
				match(CATEGORY);
				}
				break;
			case TYPE_IDENTIFIER:
				{
				setState(535);
				((Enum_category_declarationContext)_localctx).derived = type_identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(543);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				{
				setState(538);
				((Enum_category_declarationContext)_localctx).attrs = attribute_list();
				setState(539);
				match(COMMA);
				setState(540);
				match(AND);
				}
				}
				break;
			case 2:
				{
				setState(542);
				match(WITH);
				}
				break;
			}
			setState(545);
			symbols_token();
			setState(546);
			match(COLON);
			setState(547);
			indent();
			setState(548);
			((Enum_category_declarationContext)_localctx).symbols = category_symbol_list();
			setState(549);
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
			setState(551);
			match(DEFINE);
			setState(552);
			((Enum_native_declarationContext)_localctx).name = type_identifier();
			setState(553);
			match(AS);
			setState(554);
			match(ENUMERATED);
			setState(555);
			((Enum_native_declarationContext)_localctx).typ = native_type();
			setState(556);
			match(WITH);
			setState(557);
			symbols_token();
			setState(558);
			match(COLON);
			setState(559);
			indent();
			setState(560);
			((Enum_native_declarationContext)_localctx).symbols = native_symbol_list();
			setState(561);
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
			setState(563);
			((Native_symbolContext)_localctx).name = symbol_identifier();
			setState(564);
			match(WITH);
			setState(565);
			((Native_symbolContext)_localctx).exp = expression(0);
			setState(566);
			match(AS);
			setState(567);
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
			setState(569);
			((Category_symbolContext)_localctx).name = symbol_identifier();
			setState(570);
			((Category_symbolContext)_localctx).args = with_argument_assignment_list(0);
			setState(573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(571);
				match(AND);
				setState(572);
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
			setState(575);
			match(DEFINE);
			setState(576);
			((Attribute_declarationContext)_localctx).name = attribute_identifier();
			setState(577);
			match(AS);
			setState(579);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STORABLE) {
				{
				setState(578);
				match(STORABLE);
				}
			}

			setState(581);
			((Attribute_declarationContext)_localctx).typ = typedef(0);
			setState(582);
			match(ATTRIBUTE);
			setState(584);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IN || _la==MATCHING) {
				{
				setState(583);
				((Attribute_declarationContext)_localctx).match = attribute_constraint();
				}
			}

			setState(595);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(586);
				match(WITH);
				setState(592);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CATEGORY || _la==RESOURCE || _la==VARIABLE_IDENTIFIER) {
					{
					setState(587);
					((Attribute_declarationContext)_localctx).indices = variable_identifier_list();
					setState(590);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AND) {
						{
						setState(588);
						match(AND);
						setState(589);
						((Attribute_declarationContext)_localctx).index = variable_identifier();
						}
					}

					}
				}

				setState(594);
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
			setState(597);
			match(DEFINE);
			setState(598);
			((Concrete_widget_declarationContext)_localctx).name = type_identifier();
			setState(599);
			match(AS);
			setState(602);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WIDGET:
				{
				setState(600);
				match(WIDGET);
				}
				break;
			case TYPE_IDENTIFIER:
				{
				setState(601);
				((Concrete_widget_declarationContext)_localctx).derived = type_identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(611);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(604);
				match(WITH);
				setState(605);
				match(METHODS);
				setState(606);
				match(COLON);
				setState(607);
				indent();
				setState(608);
				((Concrete_widget_declarationContext)_localctx).methods = member_method_declaration_list();
				setState(609);
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
			setState(613);
			match(DEFINE);
			setState(614);
			((Native_widget_declarationContext)_localctx).name = type_identifier();
			setState(615);
			match(AS);
			setState(616);
			match(NATIVE);
			setState(617);
			match(WIDGET);
			setState(618);
			match(WITH);
			setState(619);
			match(BINDINGS);
			setState(620);
			match(COLON);
			setState(621);
			indent();
			setState(622);
			((Native_widget_declarationContext)_localctx).bindings = native_category_bindings();
			setState(623);
			dedent();
			setState(624);
			lfp();
			setState(625);
			match(AND);
			setState(626);
			match(METHODS);
			setState(627);
			match(COLON);
			setState(628);
			indent();
			setState(629);
			((Native_widget_declarationContext)_localctx).methods = native_member_method_declaration_list();
			setState(630);
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
			setState(632);
			match(DEFINE);
			setState(633);
			((Concrete_category_declarationContext)_localctx).name = type_identifier();
			setState(634);
			match(AS);
			setState(636);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STORABLE) {
				{
				setState(635);
				match(STORABLE);
				}
			}

			setState(640);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CATEGORY:
				{
				setState(638);
				match(CATEGORY);
				}
				break;
			case TYPE_IDENTIFIER:
				{
				setState(639);
				((Concrete_category_declarationContext)_localctx).derived = derived_list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(660);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				{
				setState(642);
				((Concrete_category_declarationContext)_localctx).attrs = attribute_list();
				setState(651);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(643);
					match(COMMA);
					setState(644);
					match(AND);
					setState(645);
					match(METHODS);
					setState(646);
					match(COLON);
					setState(647);
					indent();
					setState(648);
					((Concrete_category_declarationContext)_localctx).methods = member_method_declaration_list();
					setState(649);
					dedent();
					}
				}

				}
				}
				break;
			case 2:
				{
				{
				setState(653);
				match(WITH);
				setState(654);
				match(METHODS);
				setState(655);
				match(COLON);
				setState(656);
				indent();
				setState(657);
				((Concrete_category_declarationContext)_localctx).methods = member_method_declaration_list();
				setState(658);
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
			setState(662);
			match(DEFINE);
			setState(663);
			((Singleton_category_declarationContext)_localctx).name = type_identifier();
			setState(664);
			match(AS);
			setState(665);
			match(SINGLETON);
			setState(684);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				{
				setState(666);
				((Singleton_category_declarationContext)_localctx).attrs = attribute_list();
				setState(675);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(667);
					match(COMMA);
					setState(668);
					match(AND);
					setState(669);
					match(METHODS);
					setState(670);
					match(COLON);
					setState(671);
					indent();
					setState(672);
					((Singleton_category_declarationContext)_localctx).methods = member_method_declaration_list();
					setState(673);
					dedent();
					}
				}

				}
				}
				break;
			case 2:
				{
				{
				setState(677);
				match(WITH);
				setState(678);
				match(METHODS);
				setState(679);
				match(COLON);
				setState(680);
				indent();
				setState(681);
				((Singleton_category_declarationContext)_localctx).methods = member_method_declaration_list();
				setState(682);
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
			setState(691);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new DerivedListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(686);
				((DerivedListContext)_localctx).items = type_identifier_list();
				}
				break;
			case 2:
				_localctx = new DerivedListItemContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(687);
				((DerivedListItemContext)_localctx).items = type_identifier_list();
				setState(688);
				match(AND);
				setState(689);
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
			setState(693);
			match(DEFINE);
			setState(694);
			((Operator_method_declarationContext)_localctx).op = operator();
			setState(695);
			match(AS);
			setState(696);
			match(OPERATOR);
			setState(697);
			match(RECEIVING);
			setState(698);
			((Operator_method_declarationContext)_localctx).arg = operator_argument();
			setState(701);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURNING) {
				{
				setState(699);
				match(RETURNING);
				setState(700);
				((Operator_method_declarationContext)_localctx).typ = typedef(0);
				}
			}

			setState(703);
			match(DOING);
			setState(704);
			match(COLON);
			setState(705);
			indent();
			setState(706);
			((Operator_method_declarationContext)_localctx).stmts = statement_list();
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
			setState(709);
			match(DEFINE);
			setState(710);
			((Setter_method_declarationContext)_localctx).name = variable_identifier();
			setState(711);
			match(AS);
			setState(712);
			match(SETTER);
			setState(713);
			match(DOING);
			setState(714);
			match(COLON);
			setState(715);
			indent();
			setState(716);
			((Setter_method_declarationContext)_localctx).stmts = statement_list();
			setState(717);
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
			setState(719);
			match(DEFINE);
			setState(720);
			((Native_setter_declarationContext)_localctx).name = variable_identifier();
			setState(721);
			match(AS);
			setState(723);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NATIVE) {
				{
				setState(722);
				match(NATIVE);
				}
			}

			setState(725);
			match(SETTER);
			setState(726);
			match(DOING);
			setState(727);
			match(COLON);
			setState(728);
			indent();
			setState(729);
			((Native_setter_declarationContext)_localctx).stmts = native_statement_list();
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
			setState(732);
			match(DEFINE);
			setState(733);
			((Getter_method_declarationContext)_localctx).name = variable_identifier();
			setState(734);
			match(AS);
			setState(735);
			match(GETTER);
			setState(736);
			match(DOING);
			setState(737);
			match(COLON);
			setState(738);
			indent();
			setState(739);
			((Getter_method_declarationContext)_localctx).stmts = statement_list();
			setState(740);
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
			setState(742);
			match(DEFINE);
			setState(743);
			((Native_getter_declarationContext)_localctx).name = variable_identifier();
			setState(744);
			match(AS);
			setState(746);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NATIVE) {
				{
				setState(745);
				match(NATIVE);
				}
			}

			setState(748);
			match(GETTER);
			setState(749);
			match(DOING);
			setState(750);
			match(COLON);
			setState(751);
			indent();
			setState(752);
			((Native_getter_declarationContext)_localctx).stmts = native_statement_list();
			setState(753);
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
			setState(755);
			match(DEFINE);
			setState(756);
			((Native_category_declarationContext)_localctx).name = type_identifier();
			setState(757);
			match(AS);
			setState(759);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STORABLE) {
				{
				setState(758);
				match(STORABLE);
				}
			}

			setState(761);
			match(NATIVE);
			setState(762);
			match(CATEGORY);
			setState(770);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				{
				setState(763);
				((Native_category_declarationContext)_localctx).attrs = attribute_list();
				setState(764);
				match(COMMA);
				setState(765);
				match(AND);
				setState(766);
				match(BINDINGS);
				}
				}
				break;
			case 2:
				{
				setState(768);
				match(WITH);
				setState(769);
				match(BINDINGS);
				}
				break;
			}
			setState(772);
			match(COLON);
			setState(773);
			indent();
			setState(774);
			((Native_category_declarationContext)_localctx).bindings = native_category_bindings();
			setState(775);
			dedent();
			setState(784);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(776);
				lfp();
				setState(777);
				match(AND);
				setState(778);
				match(METHODS);
				setState(779);
				match(COLON);
				setState(780);
				indent();
				setState(781);
				((Native_category_declarationContext)_localctx).methods = native_member_method_declaration_list();
				setState(782);
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
			setState(786);
			match(DEFINE);
			setState(787);
			((Native_resource_declarationContext)_localctx).name = type_identifier();
			setState(788);
			match(AS);
			setState(790);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STORABLE) {
				{
				setState(789);
				match(STORABLE);
				}
			}

			setState(792);
			match(NATIVE);
			setState(793);
			match(RESOURCE);
			setState(801);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				{
				setState(794);
				((Native_resource_declarationContext)_localctx).attrs = attribute_list();
				setState(795);
				match(COMMA);
				setState(796);
				match(AND);
				setState(797);
				match(BINDINGS);
				}
				}
				break;
			case 2:
				{
				setState(799);
				match(WITH);
				setState(800);
				match(BINDINGS);
				}
				break;
			}
			setState(803);
			match(COLON);
			setState(804);
			indent();
			setState(805);
			((Native_resource_declarationContext)_localctx).bindings = native_category_bindings();
			setState(806);
			dedent();
			setState(815);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(807);
				lfp();
				setState(808);
				match(AND);
				setState(809);
				match(METHODS);
				setState(810);
				match(COLON);
				setState(811);
				indent();
				setState(812);
				((Native_resource_declarationContext)_localctx).methods = native_member_method_declaration_list();
				setState(813);
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
			setState(817);
			match(DEFINE);
			setState(818);
			match(CATEGORY);
			setState(819);
			match(BINDINGS);
			setState(820);
			match(AS);
			setState(821);
			match(COLON);
			setState(822);
			indent();
			setState(823);
			((Native_category_bindingsContext)_localctx).items = native_category_binding_list(0);
			setState(824);
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

			setState(827);
			((NativeCategoryBindingListContext)_localctx).item = native_category_binding();
			}
			_ctx.stop = _input.LT(-1);
			setState(835);
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
					setState(829);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(830);
					lfp();
					setState(831);
					((NativeCategoryBindingListItemContext)_localctx).item = native_category_binding();
					}
					} 
				}
				setState(837);
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
			setState(848);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				_localctx = new AttributeListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(838);
				match(WITH);
				setState(839);
				match(ATTRIBUTE);
				setState(840);
				((AttributeListContext)_localctx).item = attribute_identifier();
				}
				break;
			case 2:
				_localctx = new AttributeListItemContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(841);
				match(WITH);
				setState(842);
				match(ATTRIBUTES);
				setState(843);
				((AttributeListItemContext)_localctx).items = attribute_identifier_list();
				setState(846);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(844);
					match(AND);
					setState(845);
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

	public static class Abstract_global_method_declarationContext extends ParserRuleContext {
		public Type_identifierContext name;
		public Full_argument_listContext args;
		public TypedefContext typ;
		public TerminalNode DEFINE() { return getToken(EParser.DEFINE, 0); }
		public TerminalNode AS() { return getToken(EParser.AS, 0); }
		public TerminalNode ABSTRACT() { return getToken(EParser.ABSTRACT, 0); }
		public TerminalNode METHOD() { return getToken(EParser.METHOD, 0); }
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
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
		public Abstract_global_method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstract_global_method_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterAbstract_global_method_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitAbstract_global_method_declaration(this);
		}
	}

	public final Abstract_global_method_declarationContext abstract_global_method_declaration() throws RecognitionException {
		Abstract_global_method_declarationContext _localctx = new Abstract_global_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_abstract_global_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(850);
			match(DEFINE);
			setState(851);
			((Abstract_global_method_declarationContext)_localctx).name = type_identifier();
			setState(852);
			match(AS);
			setState(853);
			match(ABSTRACT);
			setState(854);
			match(METHOD);
			setState(857);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RECEIVING) {
				{
				setState(855);
				match(RECEIVING);
				setState(856);
				((Abstract_global_method_declarationContext)_localctx).args = full_argument_list();
				}
			}

			setState(864);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURNING) {
				{
				setState(859);
				match(RETURNING);
				setState(861);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MUTABLE) {
					{
					setState(860);
					match(MUTABLE);
					}
				}

				setState(863);
				((Abstract_global_method_declarationContext)_localctx).typ = typedef(0);
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

	public static class Abstract_member_method_declarationContext extends ParserRuleContext {
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
		public Abstract_member_method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstract_member_method_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterAbstract_member_method_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitAbstract_member_method_declaration(this);
		}
	}

	public final Abstract_member_method_declarationContext abstract_member_method_declaration() throws RecognitionException {
		Abstract_member_method_declarationContext _localctx = new Abstract_member_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_abstract_member_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(866);
			match(DEFINE);
			setState(867);
			((Abstract_member_method_declarationContext)_localctx).name = method_identifier();
			setState(868);
			match(AS);
			setState(869);
			match(ABSTRACT);
			setState(870);
			match(METHOD);
			setState(873);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RECEIVING) {
				{
				setState(871);
				match(RECEIVING);
				setState(872);
				((Abstract_member_method_declarationContext)_localctx).args = full_argument_list();
				}
			}

			setState(880);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURNING) {
				{
				setState(875);
				match(RETURNING);
				setState(877);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MUTABLE) {
					{
					setState(876);
					match(MUTABLE);
					}
				}

				setState(879);
				((Abstract_member_method_declarationContext)_localctx).typ = typedef(0);
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
		enterRule(_localctx, 44, RULE_concrete_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(882);
			match(DEFINE);
			setState(883);
			((Concrete_method_declarationContext)_localctx).name = method_identifier();
			setState(884);
			match(AS);
			setState(885);
			match(METHOD);
			setState(888);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RECEIVING) {
				{
				setState(886);
				match(RECEIVING);
				setState(887);
				((Concrete_method_declarationContext)_localctx).args = full_argument_list();
				}
			}

			setState(895);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURNING) {
				{
				setState(890);
				match(RETURNING);
				setState(892);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MUTABLE) {
					{
					setState(891);
					match(MUTABLE);
					}
				}

				setState(894);
				((Concrete_method_declarationContext)_localctx).typ = typedef(0);
				}
			}

			setState(897);
			match(DOING);
			setState(898);
			match(COLON);
			setState(899);
			indent();
			setState(902);
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
			case CATEGORY:
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
			case RESOURCE:
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
			case VERSION_LITERAL:
			case INTEGER_LITERAL:
			case HEXA_LITERAL:
			case DECIMAL_LITERAL:
			case DATETIME_LITERAL:
			case TIME_LITERAL:
			case DATE_LITERAL:
			case PERIOD_LITERAL:
				{
				setState(900);
				((Concrete_method_declarationContext)_localctx).stmts = statement_list();
				}
				break;
			case PASS:
				{
				setState(901);
				match(PASS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(904);
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
		enterRule(_localctx, 46, RULE_native_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(906);
			match(DEFINE);
			setState(907);
			((Native_method_declarationContext)_localctx).name = method_identifier();
			setState(908);
			match(AS);
			setState(910);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NATIVE) {
				{
				setState(909);
				match(NATIVE);
				}
			}

			setState(912);
			match(METHOD);
			setState(915);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RECEIVING) {
				{
				setState(913);
				match(RECEIVING);
				setState(914);
				((Native_method_declarationContext)_localctx).args = full_argument_list();
				}
			}

			setState(919);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURNING) {
				{
				setState(917);
				match(RETURNING);
				setState(918);
				((Native_method_declarationContext)_localctx).typ = category_or_any_type();
				}
			}

			setState(921);
			match(DOING);
			setState(922);
			match(COLON);
			setState(923);
			indent();
			setState(924);
			((Native_method_declarationContext)_localctx).stmts = native_statement_list();
			setState(925);
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
		enterRule(_localctx, 48, RULE_test_method_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(927);
			match(DEFINE);
			setState(928);
			((Test_method_declarationContext)_localctx).name = match(TEXT_LITERAL);
			setState(929);
			match(AS);
			setState(930);
			match(TEST);
			setState(931);
			match(METHOD);
			setState(932);
			match(DOING);
			setState(933);
			match(COLON);
			setState(934);
			indent();
			setState(935);
			((Test_method_declarationContext)_localctx).stmts = statement_list();
			setState(936);
			dedent();
			setState(937);
			lfp();
			setState(938);
			match(AND);
			setState(939);
			match(VERIFYING);
			setState(946);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLON:
				{
				{
				setState(940);
				match(COLON);
				setState(941);
				indent();
				setState(942);
				((Test_method_declarationContext)_localctx).exps = assertion_list();
				setState(943);
				dedent();
				}
				}
				break;
			case SYMBOL_IDENTIFIER:
				{
				setState(945);
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
		enterRule(_localctx, 50, RULE_assertion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(948);
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
		enterRule(_localctx, 52, RULE_full_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(950);
			((Full_argument_listContext)_localctx).items = argument_list();
			setState(953);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(951);
				match(AND);
				setState(952);
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
		enterRule(_localctx, 54, RULE_typed_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(955);
			((Typed_argumentContext)_localctx).typ = category_or_any_type();
			setState(956);
			((Typed_argumentContext)_localctx).name = variable_identifier();
			setState(958);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(957);
				((Typed_argumentContext)_localctx).attrs = attribute_list();
				}
			}

			setState(962);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(960);
				match(EQ);
				setState(961);
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
		enterRule(_localctx, 56, RULE_statement);
		try {
			setState(985);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				_localctx = new AssignInstanceStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(964);
				((AssignInstanceStatementContext)_localctx).stmt = assign_instance_statement();
				}
				break;
			case 2:
				_localctx = new MethodCallStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(965);
				((MethodCallStatementContext)_localctx).stmt = method_call_statement();
				}
				break;
			case 3:
				_localctx = new AssignTupleStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(966);
				((AssignTupleStatementContext)_localctx).stmt = assign_tuple_statement();
				}
				break;
			case 4:
				_localctx = new StoreStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(967);
				((StoreStatementContext)_localctx).stmt = store_statement();
				}
				break;
			case 5:
				_localctx = new FetchStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(968);
				((FetchStatementContext)_localctx).stmt = fetch_statement();
				}
				break;
			case 6:
				_localctx = new ReadStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(969);
				((ReadStatementContext)_localctx).stmt = read_statement();
				}
				break;
			case 7:
				_localctx = new FlushStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(970);
				((FlushStatementContext)_localctx).stmt = flush_statement();
				}
				break;
			case 8:
				_localctx = new BreakStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(971);
				((BreakStatementContext)_localctx).stmt = break_statement();
				}
				break;
			case 9:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(972);
				((ReturnStatementContext)_localctx).stmt = return_statement();
				}
				break;
			case 10:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(973);
				((IfStatementContext)_localctx).stmt = if_statement();
				}
				break;
			case 11:
				_localctx = new SwitchStatementContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(974);
				((SwitchStatementContext)_localctx).stmt = switch_statement();
				}
				break;
			case 12:
				_localctx = new ForEachStatementContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(975);
				((ForEachStatementContext)_localctx).stmt = for_each_statement();
				}
				break;
			case 13:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(976);
				((WhileStatementContext)_localctx).stmt = while_statement();
				}
				break;
			case 14:
				_localctx = new DoWhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(977);
				((DoWhileStatementContext)_localctx).stmt = do_while_statement();
				}
				break;
			case 15:
				_localctx = new RaiseStatementContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(978);
				((RaiseStatementContext)_localctx).stmt = raise_statement();
				}
				break;
			case 16:
				_localctx = new TryStatementContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(979);
				((TryStatementContext)_localctx).stmt = try_statement();
				}
				break;
			case 17:
				_localctx = new WriteStatementContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(980);
				((WriteStatementContext)_localctx).stmt = write_statement();
				}
				break;
			case 18:
				_localctx = new WithResourceStatementContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(981);
				((WithResourceStatementContext)_localctx).stmt = with_resource_statement();
				}
				break;
			case 19:
				_localctx = new WithSingletonStatementContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(982);
				((WithSingletonStatementContext)_localctx).stmt = with_singleton_statement();
				}
				break;
			case 20:
				_localctx = new ClosureStatementContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(983);
				((ClosureStatementContext)_localctx).decl = concrete_method_declaration();
				}
				break;
			case 21:
				_localctx = new CommentStatementContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(984);
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
		enterRule(_localctx, 58, RULE_flush_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(987);
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
		public ExpressionContext with_meta;
		public Statement_listContext stmts;
		public TerminalNode DELETE() { return getToken(EParser.DELETE, 0); }
		public TerminalNode STORE() { return getToken(EParser.STORE, 0); }
		public List<Expression_listContext> expression_list() {
			return getRuleContexts(Expression_listContext.class);
		}
		public Expression_listContext expression_list(int i) {
			return getRuleContext(Expression_listContext.class,i);
		}
		public TerminalNode WITH() { return getToken(EParser.WITH, 0); }
		public TerminalNode AS() { return getToken(EParser.AS, 0); }
		public MetadataContext metadata() {
			return getRuleContext(MetadataContext.class,0);
		}
		public TerminalNode THEN() { return getToken(EParser.THEN, 0); }
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
		enterRule(_localctx, 60, RULE_store_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(998);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DELETE:
				{
				setState(989);
				match(DELETE);
				setState(990);
				((Store_statementContext)_localctx).to_del = expression_list();
				setState(994);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AND) {
					{
					setState(991);
					match(AND);
					setState(992);
					match(STORE);
					setState(993);
					((Store_statementContext)_localctx).to_add = expression_list();
					}
				}

				}
				break;
			case STORE:
				{
				setState(996);
				match(STORE);
				setState(997);
				((Store_statementContext)_localctx).to_add = expression_list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1005);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1000);
				match(WITH);
				setState(1001);
				((Store_statementContext)_localctx).with_meta = expression(0);
				setState(1002);
				match(AS);
				setState(1003);
				metadata();
				}
			}

			setState(1013);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THEN) {
				{
				setState(1007);
				match(THEN);
				setState(1008);
				match(COLON);
				setState(1009);
				indent();
				setState(1010);
				((Store_statementContext)_localctx).stmts = statement_list();
				setState(1011);
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
		enterRule(_localctx, 62, RULE_method_call_statement);
		int _la;
		try {
			setState(1035);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
			case LBRAK:
			case LCURL:
			case MINUS:
			case LT:
			case LTCOLONGT:
			case TYPE:
			case CATEGORY:
			case MUTABLE:
			case NOTHING:
			case RESOURCE:
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
			case VERSION_LITERAL:
			case INTEGER_LITERAL:
			case HEXA_LITERAL:
			case DECIMAL_LITERAL:
			case DATETIME_LITERAL:
			case TIME_LITERAL:
			case DATE_LITERAL:
			case PERIOD_LITERAL:
				_localctx = new UnresolvedWithArgsStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1017);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(1015);
					((UnresolvedWithArgsStatementContext)_localctx).exp1 = instance_expression(0);
					}
					break;
				case 2:
					{
					setState(1016);
					((UnresolvedWithArgsStatementContext)_localctx).exp2 = unresolved_expression(0);
					}
					break;
				}
				setState(1020);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(1019);
					((UnresolvedWithArgsStatementContext)_localctx).args = argument_assignment_list();
					}
					break;
				}
				setState(1032);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THEN) {
					{
					setState(1022);
					match(THEN);
					setState(1025);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WITH) {
						{
						setState(1023);
						match(WITH);
						setState(1024);
						((UnresolvedWithArgsStatementContext)_localctx).name = variable_identifier();
						}
					}

					setState(1027);
					match(COLON);
					setState(1028);
					indent();
					setState(1029);
					((UnresolvedWithArgsStatementContext)_localctx).stmts = statement_list();
					setState(1030);
					dedent();
					}
				}

				}
				break;
			case INVOKE_COLON:
				_localctx = new InvokeStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1034);
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
		enterRule(_localctx, 64, RULE_with_resource_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1037);
			match(WITH);
			setState(1038);
			((With_resource_statementContext)_localctx).stmt = assign_variable_statement();
			setState(1039);
			match(COMMA);
			setState(1040);
			match(DO);
			setState(1041);
			match(COLON);
			setState(1042);
			indent();
			setState(1043);
			((With_resource_statementContext)_localctx).stmts = statement_list();
			setState(1044);
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
		enterRule(_localctx, 66, RULE_with_singleton_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1046);
			match(WITH);
			setState(1047);
			((With_singleton_statementContext)_localctx).typ = type_identifier();
			setState(1048);
			match(COMMA);
			setState(1049);
			match(DO);
			setState(1050);
			match(COLON);
			setState(1051);
			indent();
			setState(1052);
			((With_singleton_statementContext)_localctx).stmts = statement_list();
			setState(1053);
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
		enterRule(_localctx, 68, RULE_switch_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1055);
			match(SWITCH);
			setState(1056);
			match(ON);
			setState(1057);
			((Switch_statementContext)_localctx).exp = expression(0);
			setState(1058);
			match(COLON);
			setState(1059);
			indent();
			setState(1060);
			((Switch_statementContext)_localctx).cases = switch_case_statement_list();
			setState(1068);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(1061);
				lfp();
				setState(1062);
				match(OTHERWISE);
				setState(1063);
				match(COLON);
				setState(1064);
				indent();
				setState(1065);
				((Switch_statementContext)_localctx).stmts = statement_list();
				setState(1066);
				dedent();
				}
				break;
			}
			setState(1070);
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
		enterRule(_localctx, 70, RULE_switch_case_statement);
		try {
			setState(1087);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				_localctx = new AtomicSwitchCaseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1072);
				match(WHEN);
				setState(1073);
				((AtomicSwitchCaseContext)_localctx).exp = atomic_literal();
				setState(1074);
				match(COLON);
				setState(1075);
				indent();
				setState(1076);
				((AtomicSwitchCaseContext)_localctx).stmts = statement_list();
				setState(1077);
				dedent();
				}
				break;
			case 2:
				_localctx = new CollectionSwitchCaseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1079);
				match(WHEN);
				setState(1080);
				match(IN);
				setState(1081);
				((CollectionSwitchCaseContext)_localctx).exp = literal_collection();
				setState(1082);
				match(COLON);
				setState(1083);
				indent();
				setState(1084);
				((CollectionSwitchCaseContext)_localctx).stmts = statement_list();
				setState(1085);
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
		enterRule(_localctx, 72, RULE_for_each_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1089);
			match(FOR);
			setState(1090);
			match(EACH);
			setState(1091);
			((For_each_statementContext)_localctx).name1 = variable_identifier();
			setState(1094);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1092);
				match(COMMA);
				setState(1093);
				((For_each_statementContext)_localctx).name2 = variable_identifier();
				}
			}

			setState(1096);
			match(IN);
			setState(1097);
			((For_each_statementContext)_localctx).source = expression(0);
			setState(1098);
			match(COLON);
			setState(1099);
			indent();
			setState(1100);
			((For_each_statementContext)_localctx).stmts = statement_list();
			setState(1101);
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
		enterRule(_localctx, 74, RULE_do_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1103);
			match(DO);
			setState(1104);
			match(COLON);
			setState(1105);
			indent();
			setState(1106);
			((Do_while_statementContext)_localctx).stmts = statement_list();
			setState(1107);
			dedent();
			setState(1108);
			lfp();
			setState(1109);
			match(WHILE);
			setState(1110);
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
		enterRule(_localctx, 76, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1112);
			match(WHILE);
			setState(1113);
			((While_statementContext)_localctx).exp = expression(0);
			setState(1114);
			match(COLON);
			setState(1115);
			indent();
			setState(1116);
			((While_statementContext)_localctx).stmts = statement_list();
			setState(1117);
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
		enterRule(_localctx, 78, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1119);
			match(IF);
			setState(1120);
			((If_statementContext)_localctx).exp = expression(0);
			setState(1121);
			match(COLON);
			setState(1122);
			indent();
			setState(1123);
			((If_statementContext)_localctx).stmts = statement_list();
			setState(1124);
			dedent();
			setState(1128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(1125);
				lfp();
				setState(1126);
				((If_statementContext)_localctx).elseIfs = else_if_statement_list(0);
				}
				break;
			}
			setState(1137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(1130);
				lfp();
				setState(1131);
				match(ELSE);
				setState(1132);
				match(COLON);
				setState(1133);
				indent();
				setState(1134);
				((If_statementContext)_localctx).elseStmts = statement_list();
				setState(1135);
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
		int _startState = 80;
		enterRecursionRule(_localctx, 80, RULE_else_if_statement_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ElseIfStatementListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1140);
			match(ELSE);
			setState(1141);
			match(IF);
			setState(1142);
			((ElseIfStatementListContext)_localctx).exp = expression(0);
			setState(1143);
			match(COLON);
			setState(1144);
			indent();
			setState(1145);
			((ElseIfStatementListContext)_localctx).stmts = statement_list();
			setState(1146);
			dedent();
			}
			_ctx.stop = _input.LT(-1);
			setState(1160);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ElseIfStatementListItemContext(new Else_if_statement_listContext(_parentctx, _parentState));
					((ElseIfStatementListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_else_if_statement_list);
					setState(1148);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1149);
					lfp();
					setState(1150);
					match(ELSE);
					setState(1151);
					match(IF);
					setState(1152);
					((ElseIfStatementListItemContext)_localctx).exp = expression(0);
					setState(1153);
					match(COLON);
					setState(1154);
					indent();
					setState(1155);
					((ElseIfStatementListItemContext)_localctx).stmts = statement_list();
					setState(1156);
					dedent();
					}
					} 
				}
				setState(1162);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
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
		enterRule(_localctx, 82, RULE_raise_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1163);
			match(RAISE);
			setState(1164);
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
		enterRule(_localctx, 84, RULE_try_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1166);
			match(SWITCH);
			setState(1167);
			match(ON);
			setState(1168);
			((Try_statementContext)_localctx).name = variable_identifier();
			setState(1169);
			match(DOING);
			setState(1170);
			match(COLON);
			setState(1171);
			indent();
			setState(1172);
			((Try_statementContext)_localctx).stmts = statement_list();
			setState(1173);
			dedent();
			setState(1174);
			lfs();
			setState(1176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(1175);
				((Try_statementContext)_localctx).handlers = catch_statement_list();
				}
				break;
			}
			setState(1189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OTHERWISE || _la==WHEN) {
				{
				setState(1181);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OTHERWISE:
					{
					setState(1178);
					match(OTHERWISE);
					}
					break;
				case WHEN:
					{
					{
					setState(1179);
					match(WHEN);
					setState(1180);
					match(ANY);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1183);
				match(COLON);
				setState(1184);
				indent();
				setState(1185);
				((Try_statementContext)_localctx).anyStmts = statement_list();
				setState(1186);
				dedent();
				setState(1187);
				lfs();
				}
			}

			setState(1198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALWAYS) {
				{
				setState(1191);
				match(ALWAYS);
				setState(1192);
				match(COLON);
				setState(1193);
				indent();
				setState(1194);
				((Try_statementContext)_localctx).finalStmts = statement_list();
				setState(1195);
				dedent();
				setState(1196);
				lfs();
				}
			}

			setState(1200);
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
		enterRule(_localctx, 86, RULE_catch_statement);
		try {
			setState(1221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				_localctx = new CatchAtomicStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1202);
				match(WHEN);
				setState(1203);
				((CatchAtomicStatementContext)_localctx).name = symbol_identifier();
				setState(1204);
				match(COLON);
				setState(1205);
				indent();
				setState(1206);
				((CatchAtomicStatementContext)_localctx).stmts = statement_list();
				setState(1207);
				dedent();
				setState(1208);
				lfs();
				}
				break;
			case 2:
				_localctx = new CatchCollectionStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1210);
				match(WHEN);
				setState(1211);
				match(IN);
				setState(1212);
				match(LBRAK);
				setState(1213);
				((CatchCollectionStatementContext)_localctx).exp = symbol_list();
				setState(1214);
				match(RBRAK);
				setState(1215);
				match(COLON);
				setState(1216);
				indent();
				setState(1217);
				((CatchCollectionStatementContext)_localctx).stmts = statement_list();
				setState(1218);
				dedent();
				setState(1219);
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
		enterRule(_localctx, 88, RULE_break_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1223);
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
		enterRule(_localctx, 90, RULE_return_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1225);
			match(RETURN);
			setState(1227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << LTCOLONGT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (METHOD_COLON - 64)) | (1L << (CODE - 64)) | (1L << (DOCUMENT - 64)) | (1L << (BLOB - 64)) | (1L << (TYPE - 64)) | (1L << (CATEGORY - 64)) | (1L << (EXECUTE - 64)) | (1L << (FETCH - 64)) | (1L << (INVOKE_COLON - 64)) | (1L << (MUTABLE - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (NOT - 129)) | (1L << (NOTHING - 129)) | (1L << (READ - 129)) | (1L << (RESOURCE - 129)) | (1L << (SELF - 129)) | (1L << (SORTED - 129)) | (1L << (SUPER - 129)) | (1L << (THIS - 129)) | (1L << (BOOLEAN_LITERAL - 129)) | (1L << (CHAR_LITERAL - 129)) | (1L << (MIN_INTEGER - 129)) | (1L << (MAX_INTEGER - 129)) | (1L << (SYMBOL_IDENTIFIER - 129)) | (1L << (TYPE_IDENTIFIER - 129)) | (1L << (VARIABLE_IDENTIFIER - 129)) | (1L << (TEXT_LITERAL - 129)) | (1L << (UUID_LITERAL - 129)) | (1L << (VERSION_LITERAL - 129)) | (1L << (INTEGER_LITERAL - 129)) | (1L << (HEXA_LITERAL - 129)) | (1L << (DECIMAL_LITERAL - 129)) | (1L << (DATETIME_LITERAL - 129)) | (1L << (TIME_LITERAL - 129)) | (1L << (DATE_LITERAL - 129)) | (1L << (PERIOD_LITERAL - 129)))) != 0)) {
				{
				setState(1226);
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
		public Filter_expressionContext right;
		public TerminalNode HAS() { return getToken(EParser.HAS, 0); }
		public TerminalNode ANY() { return getToken(EParser.ANY, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Filter_expressionContext filter_expression() {
			return getRuleContext(Filter_expressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(EParser.NOT, 0); }
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
		public TerminalNode NOT() { return getToken(EParser.NOT, 0); }
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
		public TerminalNode NOT() { return getToken(EParser.NOT, 0); }
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
		public TerminalNode LT() { return getToken(EParser.LT, 0); }
		public TerminalNode LTE() { return getToken(EParser.LTE, 0); }
		public TerminalNode GT() { return getToken(EParser.GT, 0); }
		public TerminalNode GTE() { return getToken(EParser.GTE, 0); }
		public CompareExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterCompareExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitCompareExpression(this);
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
	public static class ClosureExpressionContext extends ExpressionContext {
		public Instance_expressionContext exp;
		public TerminalNode METHOD_COLON() { return getToken(EParser.METHOD_COLON, 0); }
		public Instance_expressionContext instance_expression() {
			return getRuleContext(Instance_expressionContext.class,0);
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
		public TerminalNode NOT() { return getToken(EParser.NOT, 0); }
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
		public TerminalNode NOT() { return getToken(EParser.NOT, 0); }
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
	public static class HasAllExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Filter_expressionContext right;
		public TerminalNode HAS() { return getToken(EParser.HAS, 0); }
		public TerminalNode ALL() { return getToken(EParser.ALL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Filter_expressionContext filter_expression() {
			return getRuleContext(Filter_expressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(EParser.NOT, 0); }
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
		public TerminalNode EQ() { return getToken(EParser.EQ, 0); }
		public TerminalNode LTGT() { return getToken(EParser.LTGT, 0); }
		public TerminalNode TILDE() { return getToken(EParser.TILDE, 0); }
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
		int _startState = 92;
		enterRecursionRule(_localctx, 92, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				_localctx = new CssExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1230);
				((CssExpressionContext)_localctx).exp = css_expression();
				}
				break;
			case 2:
				{
				_localctx = new JsxExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1231);
				((JsxExpressionContext)_localctx).exp = jsx_expression();
				}
				break;
			case 3:
				{
				_localctx = new InstanceExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1232);
				((InstanceExpressionContext)_localctx).exp = instance_expression(0);
				}
				break;
			case 4:
				{
				_localctx = new ArrowExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1233);
				((ArrowExpressionContext)_localctx).exp = arrow_expression();
				}
				break;
			case 5:
				{
				_localctx = new UnresolvedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1234);
				((UnresolvedExpressionContext)_localctx).exp = unresolved_expression(0);
				}
				break;
			case 6:
				{
				_localctx = new MethodCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1237);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
				case 1:
					{
					setState(1235);
					((MethodCallExpressionContext)_localctx).exp1 = instance_expression(0);
					}
					break;
				case 2:
					{
					setState(1236);
					((MethodCallExpressionContext)_localctx).exp2 = unresolved_expression(0);
					}
					break;
				}
				setState(1239);
				((MethodCallExpressionContext)_localctx).args = argument_assignment_list();
				}
				break;
			case 7:
				{
				_localctx = new ConstructorExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1241);
				((ConstructorExpressionContext)_localctx).exp = constructor_expression();
				}
				break;
			case 8:
				{
				_localctx = new MinusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1242);
				match(MINUS);
				setState(1243);
				((MinusExpressionContext)_localctx).exp = expression(34);
				}
				break;
			case 9:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1244);
				match(NOT);
				setState(1245);
				((NotExpressionContext)_localctx).exp = expression(33);
				}
				break;
			case 10:
				{
				_localctx = new CodeExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1246);
				match(CODE);
				setState(1247);
				match(COLON);
				setState(1248);
				((CodeExpressionContext)_localctx).exp = expression(15);
				}
				break;
			case 11:
				{
				_localctx = new ExecuteExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1249);
				match(EXECUTE);
				setState(1250);
				match(COLON);
				setState(1251);
				((ExecuteExpressionContext)_localctx).name = variable_identifier();
				}
				break;
			case 12:
				{
				_localctx = new ClosureExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1252);
				match(METHOD_COLON);
				setState(1253);
				((ClosureExpressionContext)_localctx).exp = instance_expression(0);
				}
				break;
			case 13:
				{
				_localctx = new BlobExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1254);
				((BlobExpressionContext)_localctx).exp = blob_expression();
				}
				break;
			case 14:
				{
				_localctx = new DocumentExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1255);
				((DocumentExpressionContext)_localctx).exp = document_expression();
				}
				break;
			case 15:
				{
				_localctx = new MutableInstanceExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1256);
				((MutableInstanceExpressionContext)_localctx).exp = mutable_instance_expression(0);
				}
				break;
			case 16:
				{
				_localctx = new FetchExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1257);
				((FetchExpressionContext)_localctx).exp = fetch_expression();
				}
				break;
			case 17:
				{
				_localctx = new ReadBlobExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1258);
				((ReadBlobExpressionContext)_localctx).exp = read_blob_expression();
				}
				break;
			case 18:
				{
				_localctx = new ReadAllExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1259);
				((ReadAllExpressionContext)_localctx).exp = read_all_expression();
				}
				break;
			case 19:
				{
				_localctx = new ReadOneExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1260);
				((ReadOneExpressionContext)_localctx).exp = read_one_expression();
				}
				break;
			case 20:
				{
				_localctx = new SortedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1261);
				((SortedExpressionContext)_localctx).exp = sorted_expression();
				}
				break;
			case 21:
				{
				_localctx = new AmbiguousExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1262);
				((AmbiguousExpressionContext)_localctx).exp = ambiguous_expression();
				}
				break;
			case 22:
				{
				_localctx = new InvocationExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1263);
				((InvocationExpressionContext)_localctx).exp = invocation_expression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1358);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1356);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplyExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((MultiplyExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1266);
						if (!(precpred(_ctx, 31))) throw new FailedPredicateException(this, "precpred(_ctx, 31)");
						setState(1267);
						multiply();
						setState(1268);
						((MultiplyExpressionContext)_localctx).right = expression(32);
						}
						break;
					case 2:
						{
						_localctx = new DivideExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((DivideExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1270);
						if (!(precpred(_ctx, 30))) throw new FailedPredicateException(this, "precpred(_ctx, 30)");
						setState(1271);
						divide();
						setState(1272);
						((DivideExpressionContext)_localctx).right = expression(31);
						}
						break;
					case 3:
						{
						_localctx = new ModuloExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ModuloExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1274);
						if (!(precpred(_ctx, 29))) throw new FailedPredicateException(this, "precpred(_ctx, 29)");
						setState(1275);
						modulo();
						setState(1276);
						((ModuloExpressionContext)_localctx).right = expression(30);
						}
						break;
					case 4:
						{
						_localctx = new IntDivideExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((IntDivideExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1278);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(1279);
						idivide();
						setState(1280);
						((IntDivideExpressionContext)_localctx).right = expression(29);
						}
						break;
					case 5:
						{
						_localctx = new AddExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((AddExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1282);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(1283);
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
						setState(1284);
						((AddExpressionContext)_localctx).right = expression(28);
						}
						break;
					case 6:
						{
						_localctx = new CompareExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((CompareExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1285);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(1286);
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
						setState(1287);
						((CompareExpressionContext)_localctx).right = expression(27);
						}
						break;
					case 7:
						{
						_localctx = new EqualsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((EqualsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1288);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(1289);
						((EqualsExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LTGT) | (1L << EQ) | (1L << TILDE))) != 0)) ) {
							((EqualsExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1290);
						((EqualsExpressionContext)_localctx).right = expression(25);
						}
						break;
					case 8:
						{
						_localctx = new ContainsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ContainsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1291);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(1293);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(1292);
							match(NOT);
							}
						}

						setState(1295);
						match(CONTAINS);
						setState(1296);
						((ContainsExpressionContext)_localctx).right = expression(24);
						}
						break;
					case 9:
						{
						_localctx = new InExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((InExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1297);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(1299);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(1298);
							match(NOT);
							}
						}

						setState(1301);
						match(IN);
						setState(1302);
						((InExpressionContext)_localctx).right = expression(23);
						}
						break;
					case 10:
						{
						_localctx = new HasExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((HasExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1303);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1305);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(1304);
							match(NOT);
							}
						}

						setState(1307);
						match(HAS);
						setState(1308);
						((HasExpressionContext)_localctx).right = expression(22);
						}
						break;
					case 11:
						{
						_localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((OrExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1309);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1310);
						match(OR);
						setState(1311);
						((OrExpressionContext)_localctx).right = expression(19);
						}
						break;
					case 12:
						{
						_localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((AndExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1312);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1313);
						match(AND);
						setState(1314);
						((AndExpressionContext)_localctx).right = expression(18);
						}
						break;
					case 13:
						{
						_localctx = new TernaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((TernaryExpressionContext)_localctx).ifTrue = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1315);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1316);
						match(IF);
						setState(1317);
						((TernaryExpressionContext)_localctx).test = expression(0);
						setState(1318);
						match(ELSE);
						setState(1319);
						((TernaryExpressionContext)_localctx).ifFalse = expression(17);
						}
						break;
					case 14:
						{
						_localctx = new IteratorExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((IteratorExpressionContext)_localctx).exp = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1321);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1322);
						match(FOR);
						setState(1323);
						match(EACH);
						setState(1324);
						((IteratorExpressionContext)_localctx).name = variable_identifier();
						setState(1325);
						match(IN);
						setState(1326);
						((IteratorExpressionContext)_localctx).source = expression(2);
						}
						break;
					case 15:
						{
						_localctx = new CastExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((CastExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1328);
						if (!(precpred(_ctx, 32))) throw new FailedPredicateException(this, "precpred(_ctx, 32)");
						setState(1329);
						match(AS);
						setState(1331);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==MUTABLE) {
							{
							setState(1330);
							match(MUTABLE);
							}
						}

						setState(1333);
						((CastExpressionContext)_localctx).right = category_or_any_type();
						}
						break;
					case 16:
						{
						_localctx = new IsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((IsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1334);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(1335);
						match(IS);
						setState(1337);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
						case 1:
							{
							setState(1336);
							match(NOT);
							}
							break;
						}
						setState(1339);
						((IsExpressionContext)_localctx).right = is_expression();
						}
						break;
					case 17:
						{
						_localctx = new HasAllExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((HasAllExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1340);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1342);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(1341);
							match(NOT);
							}
						}

						setState(1344);
						match(HAS);
						setState(1345);
						match(ALL);
						setState(1346);
						((HasAllExpressionContext)_localctx).right = filter_expression();
						}
						break;
					case 18:
						{
						_localctx = new HasAnyExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((HasAnyExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1347);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1349);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(1348);
							match(NOT);
							}
						}

						setState(1351);
						match(HAS);
						setState(1352);
						match(ANY);
						setState(1353);
						((HasAnyExpressionContext)_localctx).right = filter_expression();
						}
						break;
					case 19:
						{
						_localctx = new FilteredListExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((FilteredListExpressionContext)_localctx).src = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1354);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1355);
						filtered_list_suffix();
						}
						break;
					}
					} 
				}
				setState(1360);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
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
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(EParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExplicitFilterExpressionContext(Filter_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterExplicitFilterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitExplicitFilterExpression(this);
		}
	}
	public static class OtherFilterExpressionContext extends Filter_expressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OtherFilterExpressionContext(Filter_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterOtherFilterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitOtherFilterExpression(this);
		}
	}
	public static class ArrowFilterExpressionContext extends Filter_expressionContext {
		public TerminalNode WHERE() { return getToken(EParser.WHERE, 0); }
		public Arrow_expressionContext arrow_expression() {
			return getRuleContext(Arrow_expressionContext.class,0);
		}
		public ArrowFilterExpressionContext(Filter_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterArrowFilterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitArrowFilterExpression(this);
		}
	}

	public final Filter_expressionContext filter_expression() throws RecognitionException {
		Filter_expressionContext _localctx = new Filter_expressionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_filter_expression);
		try {
			setState(1368);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				_localctx = new ArrowFilterExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1361);
				match(WHERE);
				setState(1362);
				arrow_expression();
				}
				break;
			case 2:
				_localctx = new ExplicitFilterExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1363);
				variable_identifier();
				setState(1364);
				match(WHERE);
				setState(1365);
				expression(0);
				}
				break;
			case 3:
				_localctx = new OtherFilterExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1367);
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
		int _startState = 96;
		enterRecursionRule(_localctx, 96, RULE_unresolved_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new UnresolvedIdentifierContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1371);
			((UnresolvedIdentifierContext)_localctx).name = identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(1377);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new UnresolvedSelectorContext(new Unresolved_expressionContext(_parentctx, _parentState));
					((UnresolvedSelectorContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_unresolved_expression);
					setState(1373);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1374);
					((UnresolvedSelectorContext)_localctx).selector = unresolved_selector();
					}
					} 
				}
				setState(1379);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
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
		enterRule(_localctx, 98, RULE_unresolved_selector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1380);
			if (!(this.wasNot(EParser.WS))) throw new FailedPredicateException(this, "$parser.wasNot(EParser.WS)");
			setState(1381);
			match(DOT);
			setState(1382);
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
		public Unresolved_expressionContext exp;
		public TerminalNode INVOKE_COLON() { return getToken(EParser.INVOKE_COLON, 0); }
		public Invocation_trailerContext invocation_trailer() {
			return getRuleContext(Invocation_trailerContext.class,0);
		}
		public Unresolved_expressionContext unresolved_expression() {
			return getRuleContext(Unresolved_expressionContext.class,0);
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
		enterRule(_localctx, 100, RULE_invocation_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1384);
			match(INVOKE_COLON);
			setState(1385);
			((Invocation_expressionContext)_localctx).exp = unresolved_expression(0);
			setState(1386);
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
		enterRule(_localctx, 102, RULE_invocation_trailer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1388);
			if (!(this.afterWillBeIn(EParser.WS, EParser.RPAR, EParser.RBRAK, EParser.RCURL, EParser.LF, EParser.DEDENT))) throw new FailedPredicateException(this, "$parser.afterWillBeIn(EParser.WS, EParser.RPAR, EParser.RBRAK, EParser.RCURL, EParser.LF, EParser.DEDENT)");
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 104, RULE_selectable_expression);
		try {
			setState(1395);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				_localctx = new ParenthesisExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1390);
				((ParenthesisExpressionContext)_localctx).exp = parenthesis_expression();
				}
				break;
			case 2:
				_localctx = new LiteralExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1391);
				((LiteralExpressionContext)_localctx).exp = literal_expression();
				}
				break;
			case 3:
				_localctx = new IdentifierExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1392);
				((IdentifierExpressionContext)_localctx).exp = identifier();
				}
				break;
			case 4:
				_localctx = new ThisExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1393);
				((ThisExpressionContext)_localctx).exp = this_expression();
				}
				break;
			case 5:
				_localctx = new SuperExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1394);
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
		int _startState = 106;
		enterRecursionRule(_localctx, 106, RULE_instance_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SelectableExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1398);
			((SelectableExpressionContext)_localctx).parent = selectable_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(1404);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SelectorExpressionContext(new Instance_expressionContext(_parentctx, _parentState));
					((SelectorExpressionContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_instance_expression);
					setState(1400);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1401);
					((SelectorExpressionContext)_localctx).selector = instance_selector();
					}
					} 
				}
				setState(1406);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
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
	public static class MethodSelectorContext extends Instance_selectorContext {
		public Method_identifierContext name;
		public TerminalNode DOT() { return getToken(EParser.DOT, 0); }
		public Method_identifierContext method_identifier() {
			return getRuleContext(Method_identifierContext.class,0);
		}
		public MethodSelectorContext(Instance_selectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterMethodSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitMethodSelector(this);
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
		enterRule(_localctx, 108, RULE_instance_selector);
		try {
			setState(1423);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				_localctx = new MemberSelectorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1407);
				if (!(this.wasNot(EParser.WS))) throw new FailedPredicateException(this, "$parser.wasNot(EParser.WS)");
				setState(1408);
				match(DOT);
				setState(1409);
				((MemberSelectorContext)_localctx).name = member_identifier();
				}
				break;
			case 2:
				_localctx = new MethodSelectorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1410);
				if (!(this.wasNot(EParser.WS))) throw new FailedPredicateException(this, "$parser.wasNot(EParser.WS)");
				setState(1411);
				match(DOT);
				setState(1412);
				((MethodSelectorContext)_localctx).name = method_identifier();
				}
				break;
			case 3:
				_localctx = new SliceSelectorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1413);
				if (!(this.wasNot(EParser.WS))) throw new FailedPredicateException(this, "$parser.wasNot(EParser.WS)");
				setState(1414);
				match(LBRAK);
				setState(1415);
				((SliceSelectorContext)_localctx).xslice = slice_arguments();
				setState(1416);
				match(RBRAK);
				}
				break;
			case 4:
				_localctx = new ItemSelectorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1418);
				if (!(this.wasNot(EParser.WS))) throw new FailedPredicateException(this, "$parser.wasNot(EParser.WS)");
				setState(1419);
				match(LBRAK);
				setState(1420);
				((ItemSelectorContext)_localctx).exp = expression(0);
				setState(1421);
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
		int _startState = 110;
		enterRecursionRule(_localctx, 110, RULE_mutable_instance_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new MutableSelectableExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1426);
			match(MUTABLE);
			setState(1427);
			((MutableSelectableExpressionContext)_localctx).exp = identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(1433);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MutableSelectorExpressionContext(new Mutable_instance_expressionContext(_parentctx, _parentState));
					((MutableSelectorExpressionContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_mutable_instance_expression);
					setState(1429);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1430);
					((MutableSelectorExpressionContext)_localctx).selector = instance_selector();
					}
					} 
				}
				setState(1435);
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
		enterRule(_localctx, 112, RULE_document_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1436);
			match(DOCUMENT);
			setState(1439);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				{
				setState(1437);
				match(FROM);
				setState(1438);
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
		enterRule(_localctx, 114, RULE_blob_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1441);
			match(BLOB);
			setState(1442);
			match(FROM);
			setState(1443);
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
		enterRule(_localctx, 116, RULE_constructor_expression);
		int _la;
		try {
			setState(1466);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				_localctx = new ConstructorFromContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1445);
				((ConstructorFromContext)_localctx).typ = mutable_category_type();
				setState(1446);
				match(FROM);
				setState(1447);
				((ConstructorFromContext)_localctx).copyExp = expression(0);
				setState(1456);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					{
					setState(1449);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(1448);
						match(COMMA);
						}
					}

					setState(1451);
					((ConstructorFromContext)_localctx).args = with_argument_assignment_list(0);
					setState(1454);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
					case 1:
						{
						setState(1452);
						match(AND);
						setState(1453);
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
				setState(1458);
				((ConstructorNoFromContext)_localctx).typ = mutable_category_type();
				setState(1464);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
				case 1:
					{
					setState(1459);
					((ConstructorNoFromContext)_localctx).args = with_argument_assignment_list(0);
					setState(1462);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
					case 1:
						{
						setState(1460);
						match(AND);
						setState(1461);
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
		public ThenContext then() {
			return getRuleContext(ThenContext.class,0);
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
		enterRule(_localctx, 118, RULE_write_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1468);
			match(WRITE);
			setState(1469);
			((Write_statementContext)_localctx).what = expression(0);
			setState(1470);
			match(TO);
			setState(1471);
			((Write_statementContext)_localctx).target = expression(0);
			setState(1473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THEN) {
				{
				setState(1472);
				then();
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
		enterRule(_localctx, 120, RULE_ambiguous_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1475);
			((Ambiguous_expressionContext)_localctx).method = unresolved_expression(0);
			setState(1476);
			match(MINUS);
			setState(1477);
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
		enterRule(_localctx, 122, RULE_filtered_list_suffix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1479);
			match(FILTERED);
			setState(1482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1480);
				match(WITH);
				setState(1481);
				((Filtered_list_suffixContext)_localctx).name = variable_identifier();
				}
			}

			setState(1484);
			match(WHERE);
			setState(1485);
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
		public Include_listContext include;
		public TerminalNode FETCH() { return getToken(EParser.FETCH, 0); }
		public TerminalNode ONE() { return getToken(EParser.ONE, 0); }
		public TerminalNode WHERE() { return getToken(EParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode INCLUDE() { return getToken(EParser.INCLUDE, 0); }
		public Include_listContext include_list() {
			return getRuleContext(Include_listContext.class,0);
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
		public Include_listContext include;
		public Order_by_listContext orderby;
		public TerminalNode FETCH() { return getToken(EParser.FETCH, 0); }
		public TerminalNode WHERE() { return getToken(EParser.WHERE, 0); }
		public TerminalNode INCLUDE() { return getToken(EParser.INCLUDE, 0); }
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
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterFetchMany(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitFetchMany(this);
		}
	}

	public final Fetch_expressionContext fetch_expression() throws RecognitionException {
		Fetch_expressionContext _localctx = new Fetch_expressionContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_fetch_expression);
		int _la;
		try {
			setState(1531);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				_localctx = new FetchOneContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1487);
				match(FETCH);
				setState(1488);
				match(ONE);
				{
				setState(1490);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MUTABLE || _la==TYPE_IDENTIFIER) {
					{
					setState(1489);
					((FetchOneContext)_localctx).typ = mutable_category_type();
					}
				}

				}
				setState(1492);
				match(WHERE);
				setState(1493);
				((FetchOneContext)_localctx).predicate = expression(0);
				setState(1496);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
				case 1:
					{
					setState(1494);
					match(INCLUDE);
					setState(1495);
					((FetchOneContext)_localctx).include = include_list();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new FetchManyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1498);
				match(FETCH);
				setState(1516);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ALL:
					{
					{
					setState(1499);
					match(ALL);
					setState(1501);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
					case 1:
						{
						setState(1500);
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
					setState(1503);
					((FetchManyContext)_localctx).typ = mutable_category_type();
					setState(1505);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ROWS) {
						{
						setState(1504);
						match(ROWS);
						}
					}

					setState(1507);
					((FetchManyContext)_localctx).xstart = expression(0);
					setState(1508);
					match(TO);
					setState(1509);
					((FetchManyContext)_localctx).xstop = expression(0);
					}
					}
					break;
				case ROWS:
					{
					{
					setState(1511);
					match(ROWS);
					setState(1512);
					((FetchManyContext)_localctx).xstart = expression(0);
					setState(1513);
					match(TO);
					setState(1514);
					((FetchManyContext)_localctx).xstop = expression(0);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1520);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					setState(1518);
					match(WHERE);
					setState(1519);
					((FetchManyContext)_localctx).predicate = expression(0);
					}
					break;
				}
				setState(1524);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
				case 1:
					{
					setState(1522);
					match(INCLUDE);
					setState(1523);
					((FetchManyContext)_localctx).include = include_list();
					}
					break;
				}
				setState(1529);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
				case 1:
					{
					setState(1526);
					match(ORDER);
					setState(1527);
					match(BY);
					setState(1528);
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
		public Include_listContext include;
		public Order_by_listContext orderby;
		public TerminalNode FETCH() { return getToken(EParser.FETCH, 0); }
		public ThenContext then() {
			return getRuleContext(ThenContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(EParser.WHERE, 0); }
		public TerminalNode INCLUDE() { return getToken(EParser.INCLUDE, 0); }
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
		public Include_listContext include;
		public TerminalNode FETCH() { return getToken(EParser.FETCH, 0); }
		public TerminalNode ONE() { return getToken(EParser.ONE, 0); }
		public TerminalNode WHERE() { return getToken(EParser.WHERE, 0); }
		public ThenContext then() {
			return getRuleContext(ThenContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode INCLUDE() { return getToken(EParser.INCLUDE, 0); }
		public Include_listContext include_list() {
			return getRuleContext(Include_listContext.class,0);
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
		enterRule(_localctx, 126, RULE_fetch_statement);
		int _la;
		try {
			setState(1580);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				_localctx = new FetchOneAsyncContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1533);
				match(FETCH);
				setState(1534);
				match(ONE);
				{
				setState(1536);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MUTABLE || _la==TYPE_IDENTIFIER) {
					{
					setState(1535);
					((FetchOneAsyncContext)_localctx).typ = mutable_category_type();
					}
				}

				}
				setState(1538);
				match(WHERE);
				setState(1539);
				((FetchOneAsyncContext)_localctx).predicate = expression(0);
				setState(1542);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INCLUDE) {
					{
					setState(1540);
					match(INCLUDE);
					setState(1541);
					((FetchOneAsyncContext)_localctx).include = include_list();
					}
				}

				setState(1544);
				then();
				}
				break;
			case 2:
				_localctx = new FetchManyAsyncContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1546);
				match(FETCH);
				setState(1564);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ALL:
					{
					{
					setState(1547);
					match(ALL);
					setState(1549);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==MUTABLE || _la==TYPE_IDENTIFIER) {
						{
						setState(1548);
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
					setState(1551);
					((FetchManyAsyncContext)_localctx).typ = mutable_category_type();
					setState(1553);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ROWS) {
						{
						setState(1552);
						match(ROWS);
						}
					}

					setState(1555);
					((FetchManyAsyncContext)_localctx).xstart = expression(0);
					setState(1556);
					match(TO);
					setState(1557);
					((FetchManyAsyncContext)_localctx).xstop = expression(0);
					}
					}
					break;
				case ROWS:
					{
					{
					setState(1559);
					match(ROWS);
					setState(1560);
					((FetchManyAsyncContext)_localctx).xstart = expression(0);
					setState(1561);
					match(TO);
					setState(1562);
					((FetchManyAsyncContext)_localctx).xstop = expression(0);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1568);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(1566);
					match(WHERE);
					setState(1567);
					((FetchManyAsyncContext)_localctx).predicate = expression(0);
					}
				}

				setState(1572);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INCLUDE) {
					{
					setState(1570);
					match(INCLUDE);
					setState(1571);
					((FetchManyAsyncContext)_localctx).include = include_list();
					}
				}

				setState(1577);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ORDER) {
					{
					setState(1574);
					match(ORDER);
					setState(1575);
					match(BY);
					setState(1576);
					((FetchManyAsyncContext)_localctx).orderby = order_by_list();
					}
				}

				setState(1579);
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

	public static class Include_listContext extends ParserRuleContext {
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
		public TerminalNode AND() { return getToken(EParser.AND, 0); }
		public Include_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_include_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterInclude_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitInclude_list(this);
		}
	}

	public final Include_listContext include_list() throws RecognitionException {
		Include_listContext _localctx = new Include_listContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_include_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1582);
			variable_identifier();
			setState(1587);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1583);
					match(COMMA);
					setState(1584);
					variable_identifier();
					}
					} 
				}
				setState(1589);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			}
			setState(1592);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				{
				setState(1590);
				match(AND);
				setState(1591);
				variable_identifier();
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

	public static class ThenContext extends ParserRuleContext {
		public Variable_identifierContext name;
		public Statement_listContext stmts;
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
		public ThenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_then; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterThen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitThen(this);
		}
	}

	public final ThenContext then() throws RecognitionException {
		ThenContext _localctx = new ThenContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_then);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1594);
			match(THEN);
			setState(1595);
			match(WITH);
			setState(1596);
			((ThenContext)_localctx).name = variable_identifier();
			setState(1597);
			match(COLON);
			setState(1598);
			indent();
			setState(1599);
			((ThenContext)_localctx).stmts = statement_list();
			setState(1600);
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

	public static class Read_statementContext extends ParserRuleContext {
		public ExpressionContext source;
		public TerminalNode READ() { return getToken(EParser.READ, 0); }
		public TerminalNode ALL() { return getToken(EParser.ALL, 0); }
		public TerminalNode FROM() { return getToken(EParser.FROM, 0); }
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
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterRead_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitRead_statement(this);
		}
	}

	public final Read_statementContext read_statement() throws RecognitionException {
		Read_statementContext _localctx = new Read_statementContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_read_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1602);
			match(READ);
			setState(1603);
			match(ALL);
			setState(1604);
			match(FROM);
			setState(1605);
			((Read_statementContext)_localctx).source = expression(0);
			setState(1606);
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
		enterRule(_localctx, 134, RULE_sorted_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1608);
			match(SORTED);
			setState(1610);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DESC) {
				{
				setState(1609);
				match(DESC);
				}
			}

			setState(1612);
			((Sorted_expressionContext)_localctx).source = instance_expression(0);
			setState(1618);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				{
				setState(1613);
				match(WITH);
				setState(1614);
				((Sorted_expressionContext)_localctx).key = sorted_key();
				setState(1615);
				match(AS);
				setState(1616);
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
		enterRule(_localctx, 136, RULE_argument_assignment_list);
		try {
			setState(1634);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				_localctx = new ArgumentAssignmentListExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1620);
				if (!(this.was(EParser.WS))) throw new FailedPredicateException(this, "$parser.was(EParser.WS)");
				setState(1621);
				((ArgumentAssignmentListExpressionContext)_localctx).exp = expression(0);
				setState(1627);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
				case 1:
					{
					setState(1622);
					((ArgumentAssignmentListExpressionContext)_localctx).items = with_argument_assignment_list(0);
					setState(1625);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
					case 1:
						{
						setState(1623);
						match(AND);
						setState(1624);
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
				setState(1629);
				((ArgumentAssignmentListNoExpressionContext)_localctx).items = with_argument_assignment_list(0);
				setState(1632);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
				case 1:
					{
					setState(1630);
					match(AND);
					setState(1631);
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
		int _startState = 138;
		enterRecursionRule(_localctx, 138, RULE_with_argument_assignment_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ArgumentAssignmentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1637);
			match(WITH);
			setState(1638);
			((ArgumentAssignmentListContext)_localctx).item = argument_assignment();
			}
			_ctx.stop = _input.LT(-1);
			setState(1645);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArgumentAssignmentListItemContext(new With_argument_assignment_listContext(_parentctx, _parentState));
					((ArgumentAssignmentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_with_argument_assignment_list);
					setState(1640);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1641);
					match(COMMA);
					setState(1642);
					((ArgumentAssignmentListItemContext)_localctx).item = argument_assignment();
					}
					} 
				}
				setState(1647);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
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
		enterRule(_localctx, 140, RULE_argument_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1651);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				{
				setState(1648);
				((Argument_assignmentContext)_localctx).exp = expression(0);
				setState(1649);
				match(AS);
				}
				break;
			}
			setState(1653);
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
		enterRule(_localctx, 142, RULE_assign_instance_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1655);
			((Assign_instance_statementContext)_localctx).inst = assignable_instance(0);
			setState(1656);
			assign();
			setState(1657);
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
		enterRule(_localctx, 144, RULE_child_instance);
		try {
			setState(1667);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				_localctx = new MemberInstanceContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1659);
				if (!(this.wasNot(EParser.WS))) throw new FailedPredicateException(this, "$parser.wasNot(EParser.WS)");
				setState(1660);
				match(DOT);
				setState(1661);
				((MemberInstanceContext)_localctx).name = variable_identifier();
				}
				break;
			case 2:
				_localctx = new ItemInstanceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1662);
				if (!(this.wasNot(EParser.WS))) throw new FailedPredicateException(this, "$parser.wasNot(EParser.WS)");
				setState(1663);
				match(LBRAK);
				setState(1664);
				((ItemInstanceContext)_localctx).exp = expression(0);
				setState(1665);
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
		enterRule(_localctx, 146, RULE_assign_tuple_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1669);
			((Assign_tuple_statementContext)_localctx).items = variable_identifier_list();
			setState(1670);
			assign();
			setState(1671);
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
		enterRule(_localctx, 148, RULE_lfs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1676);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1673);
					match(LF);
					}
					} 
				}
				setState(1678);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
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
		enterRule(_localctx, 150, RULE_lfp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1680); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1679);
				match(LF);
				}
				}
				setState(1682); 
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
		enterRule(_localctx, 152, RULE_ws_plus);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1687);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1684);
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
				setState(1689);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
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
		enterRule(_localctx, 154, RULE_indent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1691); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1690);
				match(LF);
				}
				}
				setState(1693); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LF );
			setState(1695);
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
		enterRule(_localctx, 156, RULE_dedent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1700);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LF) {
				{
				{
				setState(1697);
				match(LF);
				}
				}
				setState(1702);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1703);
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
		enterRule(_localctx, 158, RULE_type_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1705);
			match(TYPE);
			setState(1706);
			match(COLON);
			setState(1707);
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
		enterRule(_localctx, 160, RULE_null_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1709);
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
		enterRule(_localctx, 162, RULE_repl);
		try {
			setState(1714);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1711);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1712);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1713);
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
		enterRule(_localctx, 164, RULE_declaration_list);
		int _la;
		try {
			_localctx = new FullDeclarationListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1716);
			lfs();
			setState(1718);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT || _la==DEFINE || _la==ARONDBASE_IDENTIFIER) {
				{
				setState(1717);
				declarations();
				}
			}

			setState(1720);
			lfs();
			setState(1721);
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
		enterRule(_localctx, 166, RULE_declarations);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1723);
			declaration();
			setState(1729);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1724);
					lfp();
					setState(1725);
					declaration();
					}
					} 
				}
				setState(1731);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
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
		enterRule(_localctx, 168, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1737);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(1732);
				comment_statement();
				setState(1733);
				lfp();
				}
				}
				setState(1739);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1745);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ARONDBASE_IDENTIFIER) {
				{
				{
				setState(1740);
				annotation_constructor();
				setState(1741);
				lfp();
				}
				}
				setState(1747);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1754);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				{
				setState(1748);
				attribute_declaration();
				}
				break;
			case 2:
				{
				setState(1749);
				category_declaration();
				}
				break;
			case 3:
				{
				setState(1750);
				resource_declaration();
				}
				break;
			case 4:
				{
				setState(1751);
				enum_declaration();
				}
				break;
			case 5:
				{
				setState(1752);
				widget_declaration();
				}
				break;
			case 6:
				{
				setState(1753);
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
		enterRule(_localctx, 170, RULE_annotation_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1756);
			((Annotation_constructorContext)_localctx).name = annotation_identifier();
			setState(1771);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(1757);
				match(LPAR);
				setState(1767);
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
				case VERSION_LITERAL:
				case INTEGER_LITERAL:
				case HEXA_LITERAL:
				case DECIMAL_LITERAL:
				case DATETIME_LITERAL:
				case TIME_LITERAL:
				case DATE_LITERAL:
				case PERIOD_LITERAL:
					{
					setState(1758);
					((Annotation_constructorContext)_localctx).exp = annotation_argument_value();
					}
					break;
				case GETTER:
				case SETTER:
				case VARIABLE_IDENTIFIER:
					{
					{
					setState(1759);
					annotation_argument();
					setState(1764);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1760);
						match(COMMA);
						setState(1761);
						annotation_argument();
						}
						}
						setState(1766);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1769);
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
		enterRule(_localctx, 172, RULE_annotation_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1773);
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
		enterRule(_localctx, 174, RULE_annotation_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1775);
			((Annotation_argumentContext)_localctx).name = annotation_argument_name();
			setState(1776);
			match(EQ);
			setState(1777);
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
		enterRule(_localctx, 176, RULE_annotation_argument_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1779);
			_la = _input.LA(1);
			if ( !(((((_la - 114)) & ~0x3f) == 0 && ((1L << (_la - 114)) & ((1L << (GETTER - 114)) | (1L << (SETTER - 114)) | (1L << (VARIABLE_IDENTIFIER - 114)))) != 0)) ) {
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
		enterRule(_localctx, 178, RULE_annotation_argument_value);
		try {
			setState(1783);
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
			case VERSION_LITERAL:
			case INTEGER_LITERAL:
			case HEXA_LITERAL:
			case DECIMAL_LITERAL:
			case DATETIME_LITERAL:
			case TIME_LITERAL:
			case DATE_LITERAL:
			case PERIOD_LITERAL:
				_localctx = new AnnotationLiteralValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1781);
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
			case DBID:
			case HTML:
			case TYPE_IDENTIFIER:
				_localctx = new AnnotationTypeValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1782);
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
		enterRule(_localctx, 180, RULE_resource_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1785);
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
		enterRule(_localctx, 182, RULE_enum_declaration);
		try {
			setState(1789);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1787);
				enum_category_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1788);
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
		enterRule(_localctx, 184, RULE_native_symbol_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1791);
			native_symbol();
			setState(1797);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1792);
					lfp();
					setState(1793);
					native_symbol();
					}
					} 
				}
				setState(1799);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
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
		enterRule(_localctx, 186, RULE_category_symbol_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1800);
			category_symbol();
			setState(1806);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1801);
					lfp();
					setState(1802);
					category_symbol();
					}
					} 
				}
				setState(1808);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
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
		enterRule(_localctx, 188, RULE_symbol_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1809);
			symbol_identifier();
			setState(1814);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1810);
				match(COMMA);
				setState(1811);
				symbol_identifier();
				}
				}
				setState(1816);
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
		enterRule(_localctx, 190, RULE_attribute_constraint);
		try {
			setState(1827);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				_localctx = new MatchingListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1817);
				match(IN);
				setState(1818);
				((MatchingListContext)_localctx).source = list_literal();
				}
				break;
			case 2:
				_localctx = new MatchingSetContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1819);
				match(IN);
				setState(1820);
				((MatchingSetContext)_localctx).source = set_literal();
				}
				break;
			case 3:
				_localctx = new MatchingRangeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1821);
				match(IN);
				setState(1822);
				((MatchingRangeContext)_localctx).source = range_literal();
				}
				break;
			case 4:
				_localctx = new MatchingPatternContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1823);
				match(MATCHING);
				setState(1824);
				((MatchingPatternContext)_localctx).text = match(TEXT_LITERAL);
				}
				break;
			case 5:
				_localctx = new MatchingExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1825);
				match(MATCHING);
				setState(1826);
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
		enterRule(_localctx, 192, RULE_list_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1830);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUTABLE) {
				{
				setState(1829);
				match(MUTABLE);
				}
			}

			setState(1832);
			match(LBRAK);
			setState(1834);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << LTCOLONGT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (METHOD_COLON - 64)) | (1L << (CODE - 64)) | (1L << (DOCUMENT - 64)) | (1L << (BLOB - 64)) | (1L << (TYPE - 64)) | (1L << (CATEGORY - 64)) | (1L << (EXECUTE - 64)) | (1L << (FETCH - 64)) | (1L << (INVOKE_COLON - 64)) | (1L << (MUTABLE - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (NOT - 129)) | (1L << (NOTHING - 129)) | (1L << (READ - 129)) | (1L << (RESOURCE - 129)) | (1L << (SELF - 129)) | (1L << (SORTED - 129)) | (1L << (SUPER - 129)) | (1L << (THIS - 129)) | (1L << (BOOLEAN_LITERAL - 129)) | (1L << (CHAR_LITERAL - 129)) | (1L << (MIN_INTEGER - 129)) | (1L << (MAX_INTEGER - 129)) | (1L << (SYMBOL_IDENTIFIER - 129)) | (1L << (TYPE_IDENTIFIER - 129)) | (1L << (VARIABLE_IDENTIFIER - 129)) | (1L << (TEXT_LITERAL - 129)) | (1L << (UUID_LITERAL - 129)) | (1L << (VERSION_LITERAL - 129)) | (1L << (INTEGER_LITERAL - 129)) | (1L << (HEXA_LITERAL - 129)) | (1L << (DECIMAL_LITERAL - 129)) | (1L << (DATETIME_LITERAL - 129)) | (1L << (TIME_LITERAL - 129)) | (1L << (DATE_LITERAL - 129)) | (1L << (PERIOD_LITERAL - 129)))) != 0)) {
				{
				setState(1833);
				expression_list();
				}
			}

			setState(1836);
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
		enterRule(_localctx, 194, RULE_set_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1839);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUTABLE) {
				{
				setState(1838);
				match(MUTABLE);
				}
			}

			setState(1841);
			match(LT);
			setState(1843);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << LTCOLONGT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (METHOD_COLON - 64)) | (1L << (CODE - 64)) | (1L << (DOCUMENT - 64)) | (1L << (BLOB - 64)) | (1L << (TYPE - 64)) | (1L << (CATEGORY - 64)) | (1L << (EXECUTE - 64)) | (1L << (FETCH - 64)) | (1L << (INVOKE_COLON - 64)) | (1L << (MUTABLE - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (NOT - 129)) | (1L << (NOTHING - 129)) | (1L << (READ - 129)) | (1L << (RESOURCE - 129)) | (1L << (SELF - 129)) | (1L << (SORTED - 129)) | (1L << (SUPER - 129)) | (1L << (THIS - 129)) | (1L << (BOOLEAN_LITERAL - 129)) | (1L << (CHAR_LITERAL - 129)) | (1L << (MIN_INTEGER - 129)) | (1L << (MAX_INTEGER - 129)) | (1L << (SYMBOL_IDENTIFIER - 129)) | (1L << (TYPE_IDENTIFIER - 129)) | (1L << (VARIABLE_IDENTIFIER - 129)) | (1L << (TEXT_LITERAL - 129)) | (1L << (UUID_LITERAL - 129)) | (1L << (VERSION_LITERAL - 129)) | (1L << (INTEGER_LITERAL - 129)) | (1L << (HEXA_LITERAL - 129)) | (1L << (DECIMAL_LITERAL - 129)) | (1L << (DATETIME_LITERAL - 129)) | (1L << (TIME_LITERAL - 129)) | (1L << (DATE_LITERAL - 129)) | (1L << (PERIOD_LITERAL - 129)))) != 0)) {
				{
				setState(1842);
				expression_list();
				}
			}

			setState(1845);
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
		enterRule(_localctx, 196, RULE_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1847);
			expression(0);
			setState(1852);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1848);
				match(COMMA);
				setState(1849);
				expression(0);
				}
				}
				setState(1854);
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
		enterRule(_localctx, 198, RULE_range_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1855);
			match(LBRAK);
			setState(1856);
			((Range_literalContext)_localctx).low = expression(0);
			setState(1857);
			match(RANGE);
			setState(1858);
			((Range_literalContext)_localctx).high = expression(0);
			setState(1859);
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
	public static class TypeTypeContext extends TypedefContext {
		public TypedefContext t;
		public TerminalNode TYPE() { return getToken(EParser.TYPE, 0); }
		public TerminalNode LT() { return getToken(EParser.LT, 0); }
		public TerminalNode GT() { return getToken(EParser.GT, 0); }
		public TypedefContext typedef() {
			return getRuleContext(TypedefContext.class,0);
		}
		public TypeTypeContext(TypedefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterTypeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitTypeType(this);
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
		int _startState = 200;
		enterRecursionRule(_localctx, 200, RULE_typedef, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1878);
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

				setState(1862);
				((PrimaryTypeContext)_localctx).p = primary_type();
				}
				break;
			case CURSOR:
				{
				_localctx = new CursorTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1863);
				match(CURSOR);
				setState(1864);
				match(LT);
				setState(1865);
				((CursorTypeContext)_localctx).c = typedef(0);
				setState(1866);
				match(GT);
				}
				break;
			case ITERATOR:
				{
				_localctx = new IteratorTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1868);
				match(ITERATOR);
				setState(1869);
				match(LT);
				setState(1870);
				((IteratorTypeContext)_localctx).i = typedef(0);
				setState(1871);
				match(GT);
				}
				break;
			case TYPE:
				{
				_localctx = new TypeTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1873);
				match(TYPE);
				setState(1874);
				match(LT);
				setState(1875);
				((TypeTypeContext)_localctx).t = typedef(0);
				setState(1876);
				match(GT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1889);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1887);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
					case 1:
						{
						_localctx = new SetTypeContext(new TypedefContext(_parentctx, _parentState));
						((SetTypeContext)_localctx).s = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_typedef);
						setState(1880);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1881);
						match(LTGT);
						}
						break;
					case 2:
						{
						_localctx = new ListTypeContext(new TypedefContext(_parentctx, _parentState));
						((ListTypeContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_typedef);
						setState(1882);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1883);
						match(LBRAK);
						setState(1884);
						match(RBRAK);
						}
						break;
					case 3:
						{
						_localctx = new DictTypeContext(new TypedefContext(_parentctx, _parentState));
						((DictTypeContext)_localctx).d = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_typedef);
						setState(1885);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1886);
						match(LTCOLONGT);
						}
						break;
					}
					} 
				}
				setState(1891);
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
		enterRule(_localctx, 202, RULE_primary_type);
		try {
			setState(1894);
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
				setState(1892);
				((NativeTypeContext)_localctx).n = native_type();
				}
				break;
			case TYPE_IDENTIFIER:
				_localctx = new CategoryTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1893);
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
	public static class DbIdTypeContext extends Native_typeContext {
		public TerminalNode DBID() { return getToken(EParser.DBID, 0); }
		public DbIdTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterDbIdType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitDbIdType(this);
		}
	}

	public final Native_typeContext native_type() throws RecognitionException {
		Native_typeContext _localctx = new Native_typeContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_native_type);
		try {
			setState(1914);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
				_localctx = new BooleanTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1896);
				match(BOOLEAN);
				}
				break;
			case CSS:
				_localctx = new CssTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1897);
				match(CSS);
				}
				break;
			case CHARACTER:
				_localctx = new CharacterTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1898);
				match(CHARACTER);
				}
				break;
			case TEXT:
				_localctx = new TextTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1899);
				match(TEXT);
				}
				break;
			case IMAGE:
				_localctx = new ImageTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1900);
				match(IMAGE);
				}
				break;
			case INTEGER:
				_localctx = new IntegerTypeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1901);
				match(INTEGER);
				}
				break;
			case DECIMAL:
				_localctx = new DecimalTypeContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1902);
				match(DECIMAL);
				}
				break;
			case DOCUMENT:
				_localctx = new DocumentTypeContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1903);
				match(DOCUMENT);
				}
				break;
			case DATE:
				_localctx = new DateTypeContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1904);
				match(DATE);
				}
				break;
			case DATETIME:
				_localctx = new DateTimeTypeContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1905);
				match(DATETIME);
				}
				break;
			case TIME:
				_localctx = new TimeTypeContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(1906);
				match(TIME);
				}
				break;
			case PERIOD:
				_localctx = new PeriodTypeContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(1907);
				match(PERIOD);
				}
				break;
			case VERSION:
				_localctx = new VersionTypeContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(1908);
				match(VERSION);
				}
				break;
			case CODE:
				_localctx = new CodeTypeContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(1909);
				match(CODE);
				}
				break;
			case BLOB:
				_localctx = new BlobTypeContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(1910);
				match(BLOB);
				}
				break;
			case UUID:
				_localctx = new UUIDTypeContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(1911);
				match(UUID);
				}
				break;
			case DBID:
				_localctx = new DbIdTypeContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(1912);
				match(DBID);
				}
				break;
			case HTML:
				_localctx = new HtmlTypeContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(1913);
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
		enterRule(_localctx, 206, RULE_category_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1916);
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
		enterRule(_localctx, 208, RULE_mutable_category_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1919);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUTABLE) {
				{
				setState(1918);
				match(MUTABLE);
				}
			}

			setState(1921);
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
		enterRule(_localctx, 210, RULE_code_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1923);
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
		enterRule(_localctx, 212, RULE_category_declaration);
		try {
			setState(1928);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				_localctx = new ConcreteCategoryDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1925);
				((ConcreteCategoryDeclarationContext)_localctx).decl = concrete_category_declaration();
				}
				break;
			case 2:
				_localctx = new NativeCategoryDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1926);
				((NativeCategoryDeclarationContext)_localctx).decl = native_category_declaration();
				}
				break;
			case 3:
				_localctx = new SingletonCategoryDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1927);
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
		enterRule(_localctx, 214, RULE_widget_declaration);
		try {
			setState(1932);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				_localctx = new ConcreteWidgetDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1930);
				((ConcreteWidgetDeclarationContext)_localctx).decl = concrete_widget_declaration();
				}
				break;
			case 2:
				_localctx = new NativeWidgetDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1931);
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
		enterRule(_localctx, 216, RULE_type_identifier_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1934);
			type_identifier();
			setState(1939);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1935);
				match(COMMA);
				setState(1936);
				type_identifier();
				}
				}
				setState(1941);
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
		enterRule(_localctx, 218, RULE_identifier_or_keyword);
		try {
			setState(1944);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1942);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1943);
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
		enterRule(_localctx, 220, RULE_nospace_hyphen_identifier_or_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1946);
			if (!(this.wasNotWhiteSpace())) throw new FailedPredicateException(this, "$parser.wasNotWhiteSpace()");
			setState(1947);
			match(MINUS);
			setState(1948);
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
		enterRule(_localctx, 222, RULE_nospace_identifier_or_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1950);
			if (!(this.wasNotWhiteSpace())) throw new FailedPredicateException(this, "$parser.wasNotWhiteSpace()");
			setState(1951);
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
		enterRule(_localctx, 224, RULE_identifier);
		try {
			setState(1956);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CATEGORY:
			case RESOURCE:
			case VARIABLE_IDENTIFIER:
				_localctx = new VariableIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1953);
				variable_identifier();
				}
				break;
			case TYPE_IDENTIFIER:
				_localctx = new TypeIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1954);
				type_identifier();
				}
				break;
			case SYMBOL_IDENTIFIER:
				_localctx = new SymbolIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1955);
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
		public TerminalNode MUTABLE() { return getToken(EParser.MUTABLE, 0); }
		public TerminalNode STORABLE() { return getToken(EParser.STORABLE, 0); }
		public TerminalNode RESOURCE() { return getToken(EParser.RESOURCE, 0); }
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
		enterRule(_localctx, 226, RULE_member_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1958);
			_la = _input.LA(1);
			if ( !(((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (CATEGORY - 90)) | (1L << (MUTABLE - 90)) | (1L << (RESOURCE - 90)) | (1L << (STORABLE - 90)))) != 0) || _la==VARIABLE_IDENTIFIER) ) {
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

	public static class Method_identifierContext extends ParserRuleContext {
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(EParser.VARIABLE_IDENTIFIER, 0); }
		public TerminalNode TYPE_IDENTIFIER() { return getToken(EParser.TYPE_IDENTIFIER, 0); }
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
		enterRule(_localctx, 228, RULE_method_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1960);
			_la = _input.LA(1);
			if ( !(_la==TYPE_IDENTIFIER || _la==VARIABLE_IDENTIFIER) ) {
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
		public TerminalNode CATEGORY() { return getToken(EParser.CATEGORY, 0); }
		public TerminalNode RESOURCE() { return getToken(EParser.RESOURCE, 0); }
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
		enterRule(_localctx, 230, RULE_variable_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1962);
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
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(EParser.VARIABLE_IDENTIFIER, 0); }
		public TerminalNode STORABLE() { return getToken(EParser.STORABLE, 0); }
		public TerminalNode RESOURCE() { return getToken(EParser.RESOURCE, 0); }
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
		enterRule(_localctx, 232, RULE_attribute_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1964);
			_la = _input.LA(1);
			if ( !(((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & ((1L << (RESOURCE - 142)) | (1L << (STORABLE - 142)) | (1L << (VARIABLE_IDENTIFIER - 142)))) != 0)) ) {
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
		enterRule(_localctx, 234, RULE_type_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1966);
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
		enterRule(_localctx, 236, RULE_symbol_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1968);
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
		enterRule(_localctx, 238, RULE_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1970);
			argument();
			setState(1975);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1971);
				match(COMMA);
				setState(1972);
				argument();
				}
				}
				setState(1977);
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
		enterRule(_localctx, 240, RULE_argument);
		int _la;
		try {
			setState(1983);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				_localctx = new CodeArgumentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1978);
				((CodeArgumentContext)_localctx).arg = code_argument();
				}
				break;
			case 2:
				_localctx = new OperatorArgumentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1980);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MUTABLE) {
					{
					setState(1979);
					match(MUTABLE);
					}
				}

				setState(1982);
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
		enterRule(_localctx, 242, RULE_operator_argument);
		try {
			setState(1987);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CATEGORY:
			case RESOURCE:
			case VARIABLE_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1985);
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
				setState(1986);
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
		enterRule(_localctx, 244, RULE_named_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1989);
			variable_identifier();
			setState(1992);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(1990);
				match(EQ);
				setState(1991);
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
		enterRule(_localctx, 246, RULE_code_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1994);
			code_type();
			setState(1995);
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
		enterRule(_localctx, 248, RULE_category_or_any_type);
		try {
			setState(1999);
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
				setState(1997);
				typedef(0);
				}
				break;
			case ANY:
				enterOuterAlt(_localctx, 2);
				{
				setState(1998);
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
		int _startState = 250;
		enterRecursionRule(_localctx, 250, RULE_any_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AnyTypeContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2002);
			match(ANY);
			}
			_ctx.stop = _input.LT(-1);
			setState(2012);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2010);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
					case 1:
						{
						_localctx = new AnyListTypeContext(new Any_typeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_any_type);
						setState(2004);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2005);
						match(LBRAK);
						setState(2006);
						match(RBRAK);
						}
						break;
					case 2:
						{
						_localctx = new AnyDictTypeContext(new Any_typeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_any_type);
						setState(2007);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2008);
						match(LCURL);
						setState(2009);
						match(RCURL);
						}
						break;
					}
					} 
				}
				setState(2014);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
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
		enterRule(_localctx, 252, RULE_member_method_declaration_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2015);
			member_method_declaration();
			setState(2021);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2016);
					lfp();
					setState(2017);
					member_method_declaration();
					}
					} 
				}
				setState(2023);
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
		public Abstract_member_method_declarationContext abstract_member_method_declaration() {
			return getRuleContext(Abstract_member_method_declarationContext.class,0);
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
		enterRule(_localctx, 254, RULE_member_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2029);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(2024);
				comment_statement();
				setState(2025);
				lfp();
				}
				}
				setState(2031);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2037);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ARONDBASE_IDENTIFIER) {
				{
				{
				setState(2032);
				annotation_constructor();
				setState(2033);
				lfp();
				}
				}
				setState(2039);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2045);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				{
				setState(2040);
				setter_method_declaration();
				}
				break;
			case 2:
				{
				setState(2041);
				getter_method_declaration();
				}
				break;
			case 3:
				{
				setState(2042);
				concrete_method_declaration();
				}
				break;
			case 4:
				{
				setState(2043);
				abstract_member_method_declaration();
				}
				break;
			case 5:
				{
				setState(2044);
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
		enterRule(_localctx, 256, RULE_native_member_method_declaration_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2047);
			native_member_method_declaration();
			setState(2053);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2048);
					lfp();
					setState(2049);
					native_member_method_declaration();
					}
					} 
				}
				setState(2055);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
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
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterNative_member_method_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitNative_member_method_declaration(this);
		}
	}

	public final Native_member_method_declarationContext native_member_method_declaration() throws RecognitionException {
		Native_member_method_declarationContext _localctx = new Native_member_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_native_member_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2061);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(2056);
				comment_statement();
				setState(2057);
				lfp();
				}
				}
				setState(2063);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2069);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ARONDBASE_IDENTIFIER) {
				{
				{
				setState(2064);
				annotation_constructor();
				setState(2065);
				lfp();
				}
				}
				setState(2071);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2075);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				{
				setState(2072);
				native_getter_declaration();
				}
				break;
			case 2:
				{
				setState(2073);
				native_setter_declaration();
				}
				break;
			case 3:
				{
				setState(2074);
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
	public static class JavascriptCategoryBindingContext extends Native_category_bindingContext {
		public Javascript_category_bindingContext binding;
		public TerminalNode JAVASCRIPT() { return getToken(EParser.JAVASCRIPT, 0); }
		public Javascript_category_bindingContext javascript_category_binding() {
			return getRuleContext(Javascript_category_bindingContext.class,0);
		}
		public JavascriptCategoryBindingContext(Native_category_bindingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJavascriptCategoryBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJavascriptCategoryBinding(this);
		}
	}

	public final Native_category_bindingContext native_category_binding() throws RecognitionException {
		Native_category_bindingContext _localctx = new Native_category_bindingContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_native_category_binding);
		try {
			setState(2087);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JAVA:
				_localctx = new JavaCategoryBindingContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2077);
				match(JAVA);
				setState(2078);
				((JavaCategoryBindingContext)_localctx).binding = java_class_identifier_expression(0);
				}
				break;
			case CSHARP:
				_localctx = new CSharpCategoryBindingContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2079);
				match(CSHARP);
				setState(2080);
				((CSharpCategoryBindingContext)_localctx).binding = csharp_identifier_expression(0);
				}
				break;
			case PYTHON2:
				_localctx = new Python2CategoryBindingContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2081);
				match(PYTHON2);
				setState(2082);
				((Python2CategoryBindingContext)_localctx).binding = python_category_binding();
				}
				break;
			case PYTHON3:
				_localctx = new Python3CategoryBindingContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2083);
				match(PYTHON3);
				setState(2084);
				((Python3CategoryBindingContext)_localctx).binding = python_category_binding();
				}
				break;
			case JAVASCRIPT:
				_localctx = new JavascriptCategoryBindingContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2085);
				match(JAVASCRIPT);
				setState(2086);
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
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterPython_category_binding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitPython_category_binding(this);
		}
	}

	public final Python_category_bindingContext python_category_binding() throws RecognitionException {
		Python_category_bindingContext _localctx = new Python_category_bindingContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_python_category_binding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2089);
			identifier();
			setState(2091);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				{
				setState(2090);
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
		enterRule(_localctx, 264, RULE_python_module);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2093);
			match(FROM);
			setState(2094);
			module_token();
			setState(2095);
			match(COLON);
			setState(2096);
			python_identifier();
			setState(2101);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2097);
					match(DOT);
					setState(2098);
					python_identifier();
					}
					} 
				}
				setState(2103);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
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
		enterRule(_localctx, 266, RULE_javascript_category_binding);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2104);
			javascript_identifier();
			setState(2109);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2105);
					match(DOT);
					setState(2106);
					javascript_identifier();
					}
					} 
				}
				setState(2111);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
			}
			setState(2113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
			case 1:
				{
				setState(2112);
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
		enterRule(_localctx, 268, RULE_javascript_module);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2115);
			match(FROM);
			setState(2116);
			module_token();
			setState(2117);
			match(COLON);
			setState(2119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SLASH) {
				{
				setState(2118);
				match(SLASH);
				}
			}

			setState(2121);
			javascript_identifier();
			setState(2126);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2122);
					match(SLASH);
					setState(2123);
					javascript_identifier();
					}
					} 
				}
				setState(2128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
			}
			setState(2131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				{
				setState(2129);
				match(DOT);
				setState(2130);
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
		enterRule(_localctx, 270, RULE_variable_identifier_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2133);
			variable_identifier();
			setState(2138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2134);
				match(COMMA);
				setState(2135);
				variable_identifier();
				}
				}
				setState(2140);
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
		enterRule(_localctx, 272, RULE_attribute_identifier_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2141);
			attribute_identifier();
			setState(2146);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2142);
					match(COMMA);
					setState(2143);
					attribute_identifier();
					}
					} 
				}
				setState(2148);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
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
		public Abstract_global_method_declarationContext abstract_global_method_declaration() {
			return getRuleContext(Abstract_global_method_declarationContext.class,0);
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
		enterRule(_localctx, 274, RULE_method_declaration);
		try {
			setState(2153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2149);
				abstract_global_method_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2150);
				concrete_method_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2151);
				native_method_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2152);
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
		enterRule(_localctx, 276, RULE_comment_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2155);
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
		enterRule(_localctx, 278, RULE_native_statement_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2157);
			native_statement();
			setState(2163);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2158);
					lfp();
					setState(2159);
					native_statement();
					}
					} 
				}
				setState(2165);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
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
	public static class JavascriptNativeStatementContext extends Native_statementContext {
		public TerminalNode JAVASCRIPT() { return getToken(EParser.JAVASCRIPT, 0); }
		public Javascript_native_statementContext javascript_native_statement() {
			return getRuleContext(Javascript_native_statementContext.class,0);
		}
		public JavascriptNativeStatementContext(Native_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJavascriptNativeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJavascriptNativeStatement(this);
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
		enterRule(_localctx, 280, RULE_native_statement);
		try {
			setState(2176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JAVA:
				_localctx = new JavaNativeStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2166);
				match(JAVA);
				setState(2167);
				java_statement();
				}
				break;
			case CSHARP:
				_localctx = new CSharpNativeStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2168);
				match(CSHARP);
				setState(2169);
				csharp_statement();
				}
				break;
			case PYTHON2:
				_localctx = new Python2NativeStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2170);
				match(PYTHON2);
				setState(2171);
				python_native_statement();
				}
				break;
			case PYTHON3:
				_localctx = new Python3NativeStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2172);
				match(PYTHON3);
				setState(2173);
				python_native_statement();
				}
				break;
			case JAVASCRIPT:
				_localctx = new JavascriptNativeStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2174);
				match(JAVASCRIPT);
				setState(2175);
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
		enterRule(_localctx, 282, RULE_python_native_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2178);
			python_statement();
			setState(2180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(2179);
				match(SEMI);
				}
			}

			setState(2183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(2182);
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
		enterRule(_localctx, 284, RULE_javascript_native_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2185);
			javascript_statement();
			setState(2187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(2186);
				match(SEMI);
				}
			}

			setState(2190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(2189);
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
		enterRule(_localctx, 286, RULE_statement_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2192);
			statement();
			setState(2198);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2193);
					lfp();
					setState(2194);
					statement();
					}
					} 
				}
				setState(2200);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
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
		enterRule(_localctx, 288, RULE_assertion_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2201);
			assertion();
			setState(2207);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,193,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2202);
					lfp();
					setState(2203);
					assertion();
					}
					} 
				}
				setState(2209);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,193,_ctx);
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
		enterRule(_localctx, 290, RULE_switch_case_statement_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2210);
			switch_case_statement();
			setState(2216);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,194,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2211);
					lfp();
					setState(2212);
					switch_case_statement();
					}
					} 
				}
				setState(2218);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,194,_ctx);
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
		enterRule(_localctx, 292, RULE_catch_statement_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2219);
			catch_statement();
			setState(2225);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2220);
					lfp();
					setState(2221);
					catch_statement();
					}
					} 
				}
				setState(2227);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
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
		enterRule(_localctx, 294, RULE_literal_collection);
		try {
			setState(2242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				_localctx = new LiteralRangeLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2228);
				match(LBRAK);
				setState(2229);
				((LiteralRangeLiteralContext)_localctx).low = atomic_literal();
				setState(2230);
				match(RANGE);
				setState(2231);
				((LiteralRangeLiteralContext)_localctx).high = atomic_literal();
				setState(2232);
				match(RBRAK);
				}
				break;
			case 2:
				_localctx = new LiteralListLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2234);
				match(LBRAK);
				setState(2235);
				literal_list_literal();
				setState(2236);
				match(RBRAK);
				}
				break;
			case 3:
				_localctx = new LiteralSetLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2238);
				match(LT);
				setState(2239);
				literal_list_literal();
				setState(2240);
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
		enterRule(_localctx, 296, RULE_atomic_literal);
		int _la;
		try {
			setState(2267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				_localctx = new MinIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2244);
				match(MIN_INTEGER);
				}
				break;
			case 2:
				_localctx = new MaxIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2245);
				match(MAX_INTEGER);
				}
				break;
			case 3:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2246);
					match(MINUS);
					}
				}

				setState(2249);
				match(INTEGER_LITERAL);
				}
				break;
			case 4:
				_localctx = new HexadecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2250);
				match(HEXA_LITERAL);
				}
				break;
			case 5:
				_localctx = new CharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2251);
				match(CHAR_LITERAL);
				}
				break;
			case 6:
				_localctx = new DateLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2252);
				match(DATE_LITERAL);
				}
				break;
			case 7:
				_localctx = new TimeLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(2253);
				match(TIME_LITERAL);
				}
				break;
			case 8:
				_localctx = new TextLiteralContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(2254);
				match(TEXT_LITERAL);
				}
				break;
			case 9:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(2256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2255);
					match(MINUS);
					}
				}

				setState(2258);
				match(DECIMAL_LITERAL);
				}
				break;
			case 10:
				_localctx = new DateTimeLiteralContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(2259);
				match(DATETIME_LITERAL);
				}
				break;
			case 11:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(2260);
				match(BOOLEAN_LITERAL);
				}
				break;
			case 12:
				_localctx = new PeriodLiteralContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(2261);
				match(PERIOD_LITERAL);
				}
				break;
			case 13:
				_localctx = new VersionLiteralContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(2262);
				match(VERSION_LITERAL);
				}
				break;
			case 14:
				_localctx = new UUIDLiteralContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(2263);
				match(UUID_LITERAL);
				}
				break;
			case 15:
				_localctx = new SymbolLiteralContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(2264);
				symbol_identifier();
				}
				break;
			case 16:
				_localctx = new TypeLiteralContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(2265);
				type_literal();
				}
				break;
			case 17:
				_localctx = new NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(2266);
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
		enterRule(_localctx, 298, RULE_literal_list_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2269);
			atomic_literal();
			setState(2274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2270);
				match(COMMA);
				setState(2271);
				atomic_literal();
				}
				}
				setState(2276);
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
		enterRule(_localctx, 300, RULE_this_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2277);
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
		enterRule(_localctx, 302, RULE_super_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE_IDENTIFIER) {
				{
				setState(2279);
				category_type();
				setState(2280);
				match(DOT);
				}
			}

			setState(2284);
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
		enterRule(_localctx, 304, RULE_parenthesis_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2286);
			match(LPAR);
			setState(2287);
			expression(0);
			setState(2288);
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
		enterRule(_localctx, 306, RULE_literal_expression);
		try {
			setState(2292);
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
				setState(2290);
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
				setState(2291);
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
		enterRule(_localctx, 308, RULE_collection_literal);
		try {
			setState(2300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2294);
				range_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2295);
				list_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2296);
				set_literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2297);
				dict_literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2298);
				document_literal();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2299);
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
		enterRule(_localctx, 310, RULE_tuple_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUTABLE) {
				{
				setState(2302);
				match(MUTABLE);
				}
			}

			setState(2305);
			match(LPAR);
			setState(2307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << LTCOLONGT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (METHOD_COLON - 64)) | (1L << (CODE - 64)) | (1L << (DOCUMENT - 64)) | (1L << (BLOB - 64)) | (1L << (TYPE - 64)) | (1L << (CATEGORY - 64)) | (1L << (EXECUTE - 64)) | (1L << (FETCH - 64)) | (1L << (INVOKE_COLON - 64)) | (1L << (MUTABLE - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (NOT - 129)) | (1L << (NOTHING - 129)) | (1L << (READ - 129)) | (1L << (RESOURCE - 129)) | (1L << (SELF - 129)) | (1L << (SORTED - 129)) | (1L << (SUPER - 129)) | (1L << (THIS - 129)) | (1L << (BOOLEAN_LITERAL - 129)) | (1L << (CHAR_LITERAL - 129)) | (1L << (MIN_INTEGER - 129)) | (1L << (MAX_INTEGER - 129)) | (1L << (SYMBOL_IDENTIFIER - 129)) | (1L << (TYPE_IDENTIFIER - 129)) | (1L << (VARIABLE_IDENTIFIER - 129)) | (1L << (TEXT_LITERAL - 129)) | (1L << (UUID_LITERAL - 129)) | (1L << (VERSION_LITERAL - 129)) | (1L << (INTEGER_LITERAL - 129)) | (1L << (HEXA_LITERAL - 129)) | (1L << (DECIMAL_LITERAL - 129)) | (1L << (DATETIME_LITERAL - 129)) | (1L << (TIME_LITERAL - 129)) | (1L << (DATE_LITERAL - 129)) | (1L << (PERIOD_LITERAL - 129)))) != 0)) {
				{
				setState(2306);
				expression_tuple();
				}
			}

			setState(2309);
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
		enterRule(_localctx, 312, RULE_dict_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUTABLE) {
				{
				setState(2311);
				match(MUTABLE);
				}
			}

			setState(2322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
			case 1:
				{
				{
				setState(2314);
				match(LT);
				setState(2315);
				dict_entry_list();
				setState(2316);
				match(GT);
				}
				}
				break;
			case 2:
				{
				setState(2318);
				match(LTCOLONGT);
				}
				break;
			case 3:
				{
				{
				setState(2319);
				match(LT);
				setState(2320);
				match(COLON);
				setState(2321);
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
		enterRule(_localctx, 314, RULE_document_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2324);
			match(LCURL);
			setState(2326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA) | (1L << CSHARP) | (1L << PYTHON2) | (1L << PYTHON3) | (1L << JAVASCRIPT) | (1L << SWIFT) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (CODE - 65)) | (1L << (DOCUMENT - 65)) | (1L << (BLOB - 65)) | (1L << (IMAGE - 65)) | (1L << (UUID - 65)) | (1L << (DBID - 65)) | (1L << (ITERATOR - 65)) | (1L << (CURSOR - 65)) | (1L << (HTML - 65)) | (1L << (ABSTRACT - 65)) | (1L << (ALL - 65)) | (1L << (ALWAYS - 65)) | (1L << (AND - 65)) | (1L << (ANY - 65)) | (1L << (AS - 65)) | (1L << (ASC - 65)) | (1L << (ATTR - 65)) | (1L << (ATTRIBUTE - 65)) | (1L << (ATTRIBUTES - 65)) | (1L << (BINDINGS - 65)) | (1L << (BREAK - 65)) | (1L << (BY - 65)) | (1L << (CASE - 65)) | (1L << (CATCH - 65)) | (1L << (CATEGORY - 65)) | (1L << (CLASS - 65)) | (1L << (CONTAINS - 65)) | (1L << (DEF - 65)) | (1L << (DEFAULT - 65)) | (1L << (DEFINE - 65)) | (1L << (DELETE - 65)) | (1L << (DESC - 65)) | (1L << (DO - 65)) | (1L << (DOING - 65)) | (1L << (EACH - 65)) | (1L << (ELSE - 65)) | (1L << (ENUM - 65)) | (1L << (ENUMERATED - 65)) | (1L << (EXCEPT - 65)) | (1L << (EXECUTE - 65)) | (1L << (EXPECTING - 65)) | (1L << (EXTENDS - 65)) | (1L << (FETCH - 65)) | (1L << (FILTERED - 65)) | (1L << (FINALLY - 65)) | (1L << (FLUSH - 65)) | (1L << (FOR - 65)) | (1L << (FROM - 65)) | (1L << (GETTER - 65)) | (1L << (HAS - 65)) | (1L << (IF - 65)) | (1L << (IN - 65)) | (1L << (INDEX - 65)) | (1L << (IS - 65)) | (1L << (MATCHING - 65)) | (1L << (METHOD - 65)) | (1L << (METHODS - 65)) | (1L << (MODULO - 65)) | (1L << (MUTABLE - 65)) | (1L << (NATIVE - 65)) | (1L << (NONE - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (NOT - 129)) | (1L << (NOTHING - 129)) | (1L << (NULL - 129)) | (1L << (ON - 129)) | (1L << (ONE - 129)) | (1L << (OPERATOR - 129)) | (1L << (OR - 129)) | (1L << (ORDER - 129)) | (1L << (OTHERWISE - 129)) | (1L << (PASS - 129)) | (1L << (RAISE - 129)) | (1L << (READ - 129)) | (1L << (RECEIVING - 129)) | (1L << (RESOURCE - 129)) | (1L << (RETURN - 129)) | (1L << (RETURNING - 129)) | (1L << (ROWS - 129)) | (1L << (SELF - 129)) | (1L << (SETTER - 129)) | (1L << (SINGLETON - 129)) | (1L << (SORTED - 129)) | (1L << (STORABLE - 129)) | (1L << (STORE - 129)) | (1L << (SUPER - 129)) | (1L << (SWITCH - 129)) | (1L << (TEST - 129)) | (1L << (THIS - 129)) | (1L << (THROW - 129)) | (1L << (TO - 129)) | (1L << (TRY - 129)) | (1L << (VERIFYING - 129)) | (1L << (WIDGET - 129)) | (1L << (WITH - 129)) | (1L << (WHEN - 129)) | (1L << (WHERE - 129)) | (1L << (WHILE - 129)) | (1L << (WRITE - 129)) | (1L << (SYMBOL_IDENTIFIER - 129)) | (1L << (TYPE_IDENTIFIER - 129)) | (1L << (VARIABLE_IDENTIFIER - 129)) | (1L << (TEXT_LITERAL - 129)))) != 0)) {
				{
				setState(2325);
				doc_entry_list();
				}
			}

			setState(2328);
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
		enterRule(_localctx, 316, RULE_expression_tuple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2330);
			expression(0);
			setState(2331);
			match(COMMA);
			setState(2340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << LTCOLONGT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (METHOD_COLON - 64)) | (1L << (CODE - 64)) | (1L << (DOCUMENT - 64)) | (1L << (BLOB - 64)) | (1L << (TYPE - 64)) | (1L << (CATEGORY - 64)) | (1L << (EXECUTE - 64)) | (1L << (FETCH - 64)) | (1L << (INVOKE_COLON - 64)) | (1L << (MUTABLE - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (NOT - 129)) | (1L << (NOTHING - 129)) | (1L << (READ - 129)) | (1L << (RESOURCE - 129)) | (1L << (SELF - 129)) | (1L << (SORTED - 129)) | (1L << (SUPER - 129)) | (1L << (THIS - 129)) | (1L << (BOOLEAN_LITERAL - 129)) | (1L << (CHAR_LITERAL - 129)) | (1L << (MIN_INTEGER - 129)) | (1L << (MAX_INTEGER - 129)) | (1L << (SYMBOL_IDENTIFIER - 129)) | (1L << (TYPE_IDENTIFIER - 129)) | (1L << (VARIABLE_IDENTIFIER - 129)) | (1L << (TEXT_LITERAL - 129)) | (1L << (UUID_LITERAL - 129)) | (1L << (VERSION_LITERAL - 129)) | (1L << (INTEGER_LITERAL - 129)) | (1L << (HEXA_LITERAL - 129)) | (1L << (DECIMAL_LITERAL - 129)) | (1L << (DATETIME_LITERAL - 129)) | (1L << (TIME_LITERAL - 129)) | (1L << (DATE_LITERAL - 129)) | (1L << (PERIOD_LITERAL - 129)))) != 0)) {
				{
				setState(2332);
				expression(0);
				setState(2337);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2333);
					match(COMMA);
					setState(2334);
					expression(0);
					}
					}
					setState(2339);
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
		enterRule(_localctx, 318, RULE_doc_entry_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2342);
			doc_entry();
			setState(2347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2343);
				match(COMMA);
				setState(2344);
				doc_entry();
				}
				}
				setState(2349);
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
		enterRule(_localctx, 320, RULE_doc_entry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2350);
			((Doc_entryContext)_localctx).key = doc_key();
			setState(2351);
			match(COLON);
			setState(2352);
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
		enterRule(_localctx, 322, RULE_doc_key);
		try {
			setState(2356);
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
				setState(2354);
				((DocKeyIdentifierContext)_localctx).name = identifier_or_keyword();
				}
				break;
			case TEXT_LITERAL:
				_localctx = new DocKeyTextContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2355);
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
		enterRule(_localctx, 324, RULE_dict_entry_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2358);
			dict_entry();
			setState(2363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2359);
				match(COMMA);
				setState(2360);
				dict_entry();
				}
				}
				setState(2365);
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
		enterRule(_localctx, 326, RULE_dict_entry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2366);
			((Dict_entryContext)_localctx).key = dict_key();
			setState(2367);
			match(COLON);
			setState(2368);
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
		enterRule(_localctx, 328, RULE_dict_key);
		try {
			setState(2372);
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
				setState(2370);
				((DictKeyIdentifierContext)_localctx).name = identifier_or_keyword();
				}
				break;
			case TEXT_LITERAL:
				_localctx = new DictKeyTextContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2371);
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
		enterRule(_localctx, 330, RULE_slice_arguments);
		try {
			setState(2383);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
			case 1:
				_localctx = new SliceFirstAndLastContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2374);
				((SliceFirstAndLastContext)_localctx).first = expression(0);
				setState(2375);
				match(COLON);
				setState(2376);
				((SliceFirstAndLastContext)_localctx).last = expression(0);
				}
				break;
			case 2:
				_localctx = new SliceFirstOnlyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2378);
				((SliceFirstOnlyContext)_localctx).first = expression(0);
				setState(2379);
				match(COLON);
				}
				break;
			case 3:
				_localctx = new SliceLastOnlyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2381);
				match(COLON);
				setState(2382);
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
		enterRule(_localctx, 332, RULE_assign_variable_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2385);
			variable_identifier();
			setState(2386);
			assign();
			setState(2387);
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
		int _startState = 334;
		enterRecursionRule(_localctx, 334, RULE_assignable_instance, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new RootInstanceContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2390);
			variable_identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(2396);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,216,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ChildInstanceContext(new Assignable_instanceContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_assignable_instance);
					setState(2392);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2393);
					child_instance();
					}
					} 
				}
				setState(2398);
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
		enterRule(_localctx, 336, RULE_is_expression);
		try {
			setState(2403);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
			case 1:
				_localctx = new IsATypeExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2399);
				if (!(this.willBeAOrAn())) throw new FailedPredicateException(this, "$parser.willBeAOrAn()");
				setState(2400);
				match(VARIABLE_IDENTIFIER);
				setState(2401);
				category_or_any_type();
				}
				break;
			case 2:
				_localctx = new IsOtherExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2402);
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
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(EParser.VARIABLE_IDENTIFIER, 0); }
		public MetadataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metadata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterMetadata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitMetadata(this);
		}
	}

	public final MetadataContext metadata() throws RecognitionException {
		MetadataContext _localctx = new MetadataContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_metadata);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2405);
			if (!(this.willBeText("metadata"))) throw new FailedPredicateException(this, "$parser.willBeText(\"metadata\")");
			setState(2406);
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
		enterRule(_localctx, 340, RULE_arrow_expression);
		try {
			setState(2416);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
			case 1:
				_localctx = new ArrowExpressionBodyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2408);
				arrow_prefix();
				setState(2409);
				expression(0);
				}
				break;
			case 2:
				_localctx = new ArrowStatementsBodyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2411);
				arrow_prefix();
				setState(2412);
				match(LCURL);
				setState(2413);
				statement_list();
				setState(2414);
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
		enterRule(_localctx, 342, RULE_arrow_prefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2418);
			arrow_args();
			setState(2419);
			((Arrow_prefixContext)_localctx).s1 = ws_plus();
			setState(2420);
			match(EGT);
			setState(2421);
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
		enterRule(_localctx, 344, RULE_arrow_args);
		int _la;
		try {
			setState(2429);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CATEGORY:
			case RESOURCE:
			case VARIABLE_IDENTIFIER:
				_localctx = new ArrowSingleArgContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2423);
				variable_identifier();
				}
				break;
			case LPAR:
				_localctx = new ArrowListArgContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2424);
				match(LPAR);
				setState(2426);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CATEGORY || _la==RESOURCE || _la==VARIABLE_IDENTIFIER) {
					{
					setState(2425);
					variable_identifier_list();
					}
				}

				setState(2428);
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
		enterRule(_localctx, 346, RULE_sorted_key);
		try {
			setState(2433);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2431);
				instance_expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2432);
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
		enterRule(_localctx, 348, RULE_read_blob_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2435);
			match(READ);
			setState(2436);
			match(BLOB);
			setState(2437);
			match(FROM);
			setState(2438);
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
		enterRule(_localctx, 350, RULE_read_all_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2440);
			match(READ);
			setState(2441);
			match(ALL);
			setState(2442);
			match(FROM);
			setState(2443);
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
		enterRule(_localctx, 352, RULE_read_one_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2445);
			match(READ);
			setState(2446);
			match(ONE);
			setState(2447);
			match(FROM);
			setState(2448);
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
		enterRule(_localctx, 354, RULE_order_by_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2450);
			order_by();
			setState(2455);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,222,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2451);
					match(COMMA);
					setState(2452);
					order_by();
					}
					} 
				}
				setState(2457);
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
		enterRule(_localctx, 356, RULE_order_by);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2458);
			variable_identifier();
			setState(2463);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,223,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2459);
					match(DOT);
					setState(2460);
					variable_identifier();
					}
					} 
				}
				setState(2465);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,223,_ctx);
			}
			setState(2467);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
			case 1:
				{
				setState(2466);
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
		enterRule(_localctx, 358, RULE_operator);
		try {
			setState(2475);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				_localctx = new OperatorPlusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2469);
				match(PLUS);
				}
				break;
			case MINUS:
				_localctx = new OperatorMinusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2470);
				match(MINUS);
				}
				break;
			case STAR:
				_localctx = new OperatorMultiplyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2471);
				multiply();
				}
				break;
			case SLASH:
				_localctx = new OperatorDivideContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2472);
				divide();
				}
				break;
			case BSLASH:
				_localctx = new OperatorIDivideContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2473);
				idivide();
				}
				break;
			case PERCENT:
			case MODULO:
				_localctx = new OperatorModuloContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2474);
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
		public TerminalNode DBID() { return getToken(EParser.DBID, 0); }
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
		enterRule(_localctx, 360, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2477);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA) | (1L << CSHARP) | (1L << PYTHON2) | (1L << PYTHON3) | (1L << JAVASCRIPT) | (1L << SWIFT) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (CODE - 65)) | (1L << (DOCUMENT - 65)) | (1L << (BLOB - 65)) | (1L << (IMAGE - 65)) | (1L << (UUID - 65)) | (1L << (DBID - 65)) | (1L << (ITERATOR - 65)) | (1L << (CURSOR - 65)) | (1L << (HTML - 65)) | (1L << (ABSTRACT - 65)) | (1L << (ALL - 65)) | (1L << (ALWAYS - 65)) | (1L << (AND - 65)) | (1L << (ANY - 65)) | (1L << (AS - 65)) | (1L << (ASC - 65)) | (1L << (ATTR - 65)) | (1L << (ATTRIBUTE - 65)) | (1L << (ATTRIBUTES - 65)) | (1L << (BINDINGS - 65)) | (1L << (BREAK - 65)) | (1L << (BY - 65)) | (1L << (CASE - 65)) | (1L << (CATCH - 65)) | (1L << (CATEGORY - 65)) | (1L << (CLASS - 65)) | (1L << (CONTAINS - 65)) | (1L << (DEF - 65)) | (1L << (DEFAULT - 65)) | (1L << (DEFINE - 65)) | (1L << (DELETE - 65)) | (1L << (DESC - 65)) | (1L << (DO - 65)) | (1L << (DOING - 65)) | (1L << (EACH - 65)) | (1L << (ELSE - 65)) | (1L << (ENUM - 65)) | (1L << (ENUMERATED - 65)) | (1L << (EXCEPT - 65)) | (1L << (EXECUTE - 65)) | (1L << (EXPECTING - 65)) | (1L << (EXTENDS - 65)) | (1L << (FETCH - 65)) | (1L << (FILTERED - 65)) | (1L << (FINALLY - 65)) | (1L << (FLUSH - 65)) | (1L << (FOR - 65)) | (1L << (FROM - 65)) | (1L << (GETTER - 65)) | (1L << (HAS - 65)) | (1L << (IF - 65)) | (1L << (IN - 65)) | (1L << (INDEX - 65)) | (1L << (IS - 65)) | (1L << (MATCHING - 65)) | (1L << (METHOD - 65)) | (1L << (METHODS - 65)) | (1L << (MODULO - 65)) | (1L << (MUTABLE - 65)) | (1L << (NATIVE - 65)) | (1L << (NONE - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (NOT - 129)) | (1L << (NOTHING - 129)) | (1L << (NULL - 129)) | (1L << (ON - 129)) | (1L << (ONE - 129)) | (1L << (OPERATOR - 129)) | (1L << (OR - 129)) | (1L << (ORDER - 129)) | (1L << (OTHERWISE - 129)) | (1L << (PASS - 129)) | (1L << (RAISE - 129)) | (1L << (READ - 129)) | (1L << (RECEIVING - 129)) | (1L << (RESOURCE - 129)) | (1L << (RETURN - 129)) | (1L << (RETURNING - 129)) | (1L << (ROWS - 129)) | (1L << (SELF - 129)) | (1L << (SETTER - 129)) | (1L << (SINGLETON - 129)) | (1L << (SORTED - 129)) | (1L << (STORABLE - 129)) | (1L << (STORE - 129)) | (1L << (SUPER - 129)) | (1L << (SWITCH - 129)) | (1L << (TEST - 129)) | (1L << (THIS - 129)) | (1L << (THROW - 129)) | (1L << (TO - 129)) | (1L << (TRY - 129)) | (1L << (VERIFYING - 129)) | (1L << (WIDGET - 129)) | (1L << (WITH - 129)) | (1L << (WHEN - 129)) | (1L << (WHERE - 129)) | (1L << (WHILE - 129)) | (1L << (WRITE - 129)))) != 0)) ) {
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
		enterRule(_localctx, 362, RULE_new_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2479);
			((New_tokenContext)_localctx).i1 = match(VARIABLE_IDENTIFIER);
			setState(2480);
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
		enterRule(_localctx, 364, RULE_key_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2482);
			((Key_tokenContext)_localctx).i1 = match(VARIABLE_IDENTIFIER);
			setState(2483);
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
		enterRule(_localctx, 366, RULE_module_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2485);
			((Module_tokenContext)_localctx).i1 = match(VARIABLE_IDENTIFIER);
			setState(2486);
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
		enterRule(_localctx, 368, RULE_value_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2488);
			((Value_tokenContext)_localctx).i1 = match(VARIABLE_IDENTIFIER);
			setState(2489);
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
		enterRule(_localctx, 370, RULE_symbols_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2491);
			((Symbols_tokenContext)_localctx).i1 = match(VARIABLE_IDENTIFIER);
			setState(2492);
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
		enterRule(_localctx, 372, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2494);
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
		enterRule(_localctx, 374, RULE_multiply);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2496);
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
		enterRule(_localctx, 376, RULE_divide);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2498);
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
		enterRule(_localctx, 378, RULE_idivide);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2500);
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
		enterRule(_localctx, 380, RULE_modulo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2502);
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
		enterRule(_localctx, 382, RULE_javascript_statement);
		try {
			setState(2511);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
			case 1:
				_localctx = new JavascriptReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2504);
				match(RETURN);
				setState(2505);
				((JavascriptReturnStatementContext)_localctx).exp = javascript_expression(0);
				setState(2506);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new JavascriptStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2508);
				((JavascriptStatementContext)_localctx).exp = javascript_expression(0);
				setState(2509);
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
		int _startState = 384;
		enterRecursionRule(_localctx, 384, RULE_javascript_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavascriptPrimaryExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2514);
			((JavascriptPrimaryExpressionContext)_localctx).exp = javascript_primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(2520);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,227,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavascriptSelectorExpressionContext(new Javascript_expressionContext(_parentctx, _parentState));
					((JavascriptSelectorExpressionContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_javascript_expression);
					setState(2516);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2517);
					((JavascriptSelectorExpressionContext)_localctx).child = javascript_selector_expression();
					}
					} 
				}
				setState(2522);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,227,_ctx);
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
		enterRule(_localctx, 386, RULE_javascript_primary_expression);
		try {
			setState(2530);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2523);
				javascript_this_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2524);
				javascript_new_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2525);
				javascript_parenthesis_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2526);
				javascript_identifier_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2527);
				javascript_literal_expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2528);
				javascript_method_expression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2529);
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
		enterRule(_localctx, 388, RULE_javascript_this_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2532);
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
		enterRule(_localctx, 390, RULE_javascript_new_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2534);
			new_token();
			setState(2535);
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
		public TerminalNode DOT() { return getToken(EParser.DOT, 0); }
		public Javascript_identifierContext javascript_identifier() {
			return getRuleContext(Javascript_identifierContext.class,0);
		}
		public JavascriptMemberExpressionContext(Javascript_selector_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJavascriptMemberExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJavascriptMemberExpression(this);
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
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJavascriptItemExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJavascriptItemExpression(this);
		}
	}
	public static class JavascriptMethodExpressionContext extends Javascript_selector_expressionContext {
		public Javascript_method_expressionContext method;
		public TerminalNode DOT() { return getToken(EParser.DOT, 0); }
		public Javascript_method_expressionContext javascript_method_expression() {
			return getRuleContext(Javascript_method_expressionContext.class,0);
		}
		public JavascriptMethodExpressionContext(Javascript_selector_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJavascriptMethodExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJavascriptMethodExpression(this);
		}
	}

	public final Javascript_selector_expressionContext javascript_selector_expression() throws RecognitionException {
		Javascript_selector_expressionContext _localctx = new Javascript_selector_expressionContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_javascript_selector_expression);
		try {
			setState(2542);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
			case 1:
				_localctx = new JavascriptMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2537);
				match(DOT);
				setState(2538);
				((JavascriptMethodExpressionContext)_localctx).method = javascript_method_expression();
				}
				break;
			case 2:
				_localctx = new JavascriptMemberExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2539);
				match(DOT);
				setState(2540);
				((JavascriptMemberExpressionContext)_localctx).name = javascript_identifier();
				}
				break;
			case 3:
				_localctx = new JavascriptItemExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2541);
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
		enterRule(_localctx, 394, RULE_javascript_method_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2544);
			((Javascript_method_expressionContext)_localctx).name = javascript_identifier();
			setState(2545);
			match(LPAR);
			setState(2547);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA) | (1L << CSHARP) | (1L << PYTHON2) | (1L << PYTHON3) | (1L << JAVASCRIPT) | (1L << SWIFT) | (1L << LPAR) | (1L << LBRAK) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (CODE - 65)) | (1L << (DOCUMENT - 65)) | (1L << (BLOB - 65)) | (1L << (IMAGE - 65)) | (1L << (UUID - 65)) | (1L << (DBID - 65)) | (1L << (ITERATOR - 65)) | (1L << (CURSOR - 65)) | (1L << (HTML - 65)) | (1L << (ABSTRACT - 65)) | (1L << (ALL - 65)) | (1L << (ALWAYS - 65)) | (1L << (AND - 65)) | (1L << (ANY - 65)) | (1L << (AS - 65)) | (1L << (ASC - 65)) | (1L << (ATTR - 65)) | (1L << (ATTRIBUTE - 65)) | (1L << (ATTRIBUTES - 65)) | (1L << (BINDINGS - 65)) | (1L << (BREAK - 65)) | (1L << (BY - 65)) | (1L << (CASE - 65)) | (1L << (CATCH - 65)) | (1L << (CATEGORY - 65)) | (1L << (CLASS - 65)) | (1L << (CONTAINS - 65)) | (1L << (DEF - 65)) | (1L << (DEFAULT - 65)) | (1L << (DEFINE - 65)) | (1L << (DELETE - 65)) | (1L << (DESC - 65)) | (1L << (DO - 65)) | (1L << (DOING - 65)) | (1L << (EACH - 65)) | (1L << (ELSE - 65)) | (1L << (ENUM - 65)) | (1L << (ENUMERATED - 65)) | (1L << (EXCEPT - 65)) | (1L << (EXECUTE - 65)) | (1L << (EXPECTING - 65)) | (1L << (EXTENDS - 65)) | (1L << (FETCH - 65)) | (1L << (FILTERED - 65)) | (1L << (FINALLY - 65)) | (1L << (FLUSH - 65)) | (1L << (FOR - 65)) | (1L << (FROM - 65)) | (1L << (GETTER - 65)) | (1L << (HAS - 65)) | (1L << (IF - 65)) | (1L << (IN - 65)) | (1L << (INDEX - 65)) | (1L << (IS - 65)) | (1L << (MATCHING - 65)) | (1L << (METHOD - 65)) | (1L << (METHODS - 65)) | (1L << (MODULO - 65)) | (1L << (MUTABLE - 65)) | (1L << (NATIVE - 65)) | (1L << (NONE - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (NOT - 129)) | (1L << (NOTHING - 129)) | (1L << (NULL - 129)) | (1L << (ON - 129)) | (1L << (ONE - 129)) | (1L << (OPERATOR - 129)) | (1L << (OR - 129)) | (1L << (ORDER - 129)) | (1L << (OTHERWISE - 129)) | (1L << (PASS - 129)) | (1L << (RAISE - 129)) | (1L << (READ - 129)) | (1L << (RECEIVING - 129)) | (1L << (RESOURCE - 129)) | (1L << (RETURN - 129)) | (1L << (RETURNING - 129)) | (1L << (ROWS - 129)) | (1L << (SELF - 129)) | (1L << (SETTER - 129)) | (1L << (SINGLETON - 129)) | (1L << (SORTED - 129)) | (1L << (STORABLE - 129)) | (1L << (STORE - 129)) | (1L << (SUPER - 129)) | (1L << (SWITCH - 129)) | (1L << (TEST - 129)) | (1L << (THIS - 129)) | (1L << (THROW - 129)) | (1L << (TO - 129)) | (1L << (TRY - 129)) | (1L << (VERIFYING - 129)) | (1L << (WIDGET - 129)) | (1L << (WITH - 129)) | (1L << (WHEN - 129)) | (1L << (WHERE - 129)) | (1L << (WHILE - 129)) | (1L << (WRITE - 129)) | (1L << (BOOLEAN_LITERAL - 129)) | (1L << (CHAR_LITERAL - 129)) | (1L << (SYMBOL_IDENTIFIER - 129)) | (1L << (TYPE_IDENTIFIER - 129)) | (1L << (VARIABLE_IDENTIFIER - 129)) | (1L << (DOLLAR_IDENTIFIER - 129)) | (1L << (TEXT_LITERAL - 129)) | (1L << (INTEGER_LITERAL - 129)) | (1L << (DECIMAL_LITERAL - 129)))) != 0)) {
				{
				setState(2546);
				((Javascript_method_expressionContext)_localctx).args = javascript_arguments(0);
				}
			}

			setState(2549);
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
		int _startState = 396;
		enterRecursionRule(_localctx, 396, RULE_javascript_arguments, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavascriptArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2552);
			((JavascriptArgumentListContext)_localctx).item = javascript_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2559);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,231,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavascriptArgumentListItemContext(new Javascript_argumentsContext(_parentctx, _parentState));
					((JavascriptArgumentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_javascript_arguments);
					setState(2554);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2555);
					match(COMMA);
					setState(2556);
					((JavascriptArgumentListItemContext)_localctx).item = javascript_expression(0);
					}
					} 
				}
				setState(2561);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,231,_ctx);
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
		enterRule(_localctx, 398, RULE_javascript_item_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2562);
			match(LBRAK);
			setState(2563);
			((Javascript_item_expressionContext)_localctx).exp = javascript_expression(0);
			setState(2564);
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
		enterRule(_localctx, 400, RULE_javascript_parenthesis_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2566);
			match(LPAR);
			setState(2567);
			((Javascript_parenthesis_expressionContext)_localctx).exp = javascript_expression(0);
			setState(2568);
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
		enterRule(_localctx, 402, RULE_javascript_identifier_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2570);
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
		enterRule(_localctx, 404, RULE_javascript_literal_expression);
		try {
			setState(2577);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				_localctx = new JavascriptIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2572);
				((JavascriptIntegerLiteralContext)_localctx).t = match(INTEGER_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				_localctx = new JavascriptDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2573);
				((JavascriptDecimalLiteralContext)_localctx).t = match(DECIMAL_LITERAL);
				}
				break;
			case TEXT_LITERAL:
				_localctx = new JavascriptTextLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2574);
				((JavascriptTextLiteralContext)_localctx).t = match(TEXT_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new JavascriptBooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2575);
				((JavascriptBooleanLiteralContext)_localctx).t = match(BOOLEAN_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new JavascriptCharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2576);
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
		enterRule(_localctx, 406, RULE_javascript_identifier);
		try {
			setState(2584);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2579);
				match(VARIABLE_IDENTIFIER);
				}
				break;
			case SYMBOL_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2580);
				match(SYMBOL_IDENTIFIER);
				}
				break;
			case DOLLAR_IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(2581);
				match(DOLLAR_IDENTIFIER);
				}
				break;
			case TYPE_IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(2582);
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
				setState(2583);
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
		enterRule(_localctx, 408, RULE_python_statement);
		try {
			setState(2589);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
			case 1:
				_localctx = new PythonReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2586);
				match(RETURN);
				setState(2587);
				((PythonReturnStatementContext)_localctx).exp = python_expression(0);
				}
				break;
			case 2:
				_localctx = new PythonStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2588);
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
		int _startState = 410;
		enterRecursionRule(_localctx, 410, RULE_python_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PythonPrimaryExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2592);
			((PythonPrimaryExpressionContext)_localctx).exp = python_primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(2598);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,235,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PythonSelectorExpressionContext(new Python_expressionContext(_parentctx, _parentState));
					((PythonSelectorExpressionContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_python_expression);
					setState(2594);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2595);
					((PythonSelectorExpressionContext)_localctx).child = python_selector_expression();
					}
					} 
				}
				setState(2600);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,235,_ctx);
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
		enterRule(_localctx, 412, RULE_python_primary_expression);
		try {
			setState(2606);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
			case 1:
				_localctx = new PythonSelfExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2601);
				((PythonSelfExpressionContext)_localctx).exp = python_self_expression();
				}
				break;
			case 2:
				_localctx = new PythonParenthesisExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2602);
				((PythonParenthesisExpressionContext)_localctx).exp = python_parenthesis_expression();
				}
				break;
			case 3:
				_localctx = new PythonIdentifierExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2603);
				((PythonIdentifierExpressionContext)_localctx).exp = python_identifier_expression(0);
				}
				break;
			case 4:
				_localctx = new PythonLiteralExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2604);
				((PythonLiteralExpressionContext)_localctx).exp = python_literal_expression();
				}
				break;
			case 5:
				_localctx = new PythonGlobalMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2605);
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
		enterRule(_localctx, 414, RULE_python_self_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2608);
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
		enterRule(_localctx, 416, RULE_python_selector_expression);
		try {
			setState(2616);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				_localctx = new PythonMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2610);
				match(DOT);
				setState(2611);
				((PythonMethodExpressionContext)_localctx).exp = python_method_expression();
				}
				break;
			case LBRAK:
				_localctx = new PythonItemExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2612);
				match(LBRAK);
				setState(2613);
				((PythonItemExpressionContext)_localctx).exp = python_expression(0);
				setState(2614);
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
		enterRule(_localctx, 418, RULE_python_method_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2618);
			((Python_method_expressionContext)_localctx).name = python_identifier();
			setState(2619);
			match(LPAR);
			setState(2621);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA) | (1L << CSHARP) | (1L << PYTHON2) | (1L << PYTHON3) | (1L << JAVASCRIPT) | (1L << SWIFT) | (1L << LPAR) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (CODE - 65)) | (1L << (DOCUMENT - 65)) | (1L << (BLOB - 65)) | (1L << (IMAGE - 65)) | (1L << (UUID - 65)) | (1L << (DBID - 65)) | (1L << (ITERATOR - 65)) | (1L << (CURSOR - 65)) | (1L << (HTML - 65)) | (1L << (ABSTRACT - 65)) | (1L << (ALL - 65)) | (1L << (ALWAYS - 65)) | (1L << (AND - 65)) | (1L << (ANY - 65)) | (1L << (AS - 65)) | (1L << (ASC - 65)) | (1L << (ATTR - 65)) | (1L << (ATTRIBUTE - 65)) | (1L << (ATTRIBUTES - 65)) | (1L << (BINDINGS - 65)) | (1L << (BREAK - 65)) | (1L << (BY - 65)) | (1L << (CASE - 65)) | (1L << (CATCH - 65)) | (1L << (CATEGORY - 65)) | (1L << (CLASS - 65)) | (1L << (CONTAINS - 65)) | (1L << (DEF - 65)) | (1L << (DEFAULT - 65)) | (1L << (DEFINE - 65)) | (1L << (DELETE - 65)) | (1L << (DESC - 65)) | (1L << (DO - 65)) | (1L << (DOING - 65)) | (1L << (EACH - 65)) | (1L << (ELSE - 65)) | (1L << (ENUM - 65)) | (1L << (ENUMERATED - 65)) | (1L << (EXCEPT - 65)) | (1L << (EXECUTE - 65)) | (1L << (EXPECTING - 65)) | (1L << (EXTENDS - 65)) | (1L << (FETCH - 65)) | (1L << (FILTERED - 65)) | (1L << (FINALLY - 65)) | (1L << (FLUSH - 65)) | (1L << (FOR - 65)) | (1L << (FROM - 65)) | (1L << (GETTER - 65)) | (1L << (HAS - 65)) | (1L << (IF - 65)) | (1L << (IN - 65)) | (1L << (INDEX - 65)) | (1L << (IS - 65)) | (1L << (MATCHING - 65)) | (1L << (METHOD - 65)) | (1L << (METHODS - 65)) | (1L << (MODULO - 65)) | (1L << (MUTABLE - 65)) | (1L << (NATIVE - 65)) | (1L << (NONE - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (NOT - 129)) | (1L << (NOTHING - 129)) | (1L << (NULL - 129)) | (1L << (ON - 129)) | (1L << (ONE - 129)) | (1L << (OPERATOR - 129)) | (1L << (OR - 129)) | (1L << (ORDER - 129)) | (1L << (OTHERWISE - 129)) | (1L << (PASS - 129)) | (1L << (RAISE - 129)) | (1L << (READ - 129)) | (1L << (RECEIVING - 129)) | (1L << (RESOURCE - 129)) | (1L << (RETURN - 129)) | (1L << (RETURNING - 129)) | (1L << (ROWS - 129)) | (1L << (SELF - 129)) | (1L << (SETTER - 129)) | (1L << (SINGLETON - 129)) | (1L << (SORTED - 129)) | (1L << (STORABLE - 129)) | (1L << (STORE - 129)) | (1L << (SUPER - 129)) | (1L << (SWITCH - 129)) | (1L << (TEST - 129)) | (1L << (THIS - 129)) | (1L << (THROW - 129)) | (1L << (TO - 129)) | (1L << (TRY - 129)) | (1L << (VERIFYING - 129)) | (1L << (WIDGET - 129)) | (1L << (WITH - 129)) | (1L << (WHEN - 129)) | (1L << (WHERE - 129)) | (1L << (WHILE - 129)) | (1L << (WRITE - 129)) | (1L << (BOOLEAN_LITERAL - 129)) | (1L << (CHAR_LITERAL - 129)) | (1L << (SYMBOL_IDENTIFIER - 129)) | (1L << (TYPE_IDENTIFIER - 129)) | (1L << (VARIABLE_IDENTIFIER - 129)) | (1L << (DOLLAR_IDENTIFIER - 129)) | (1L << (TEXT_LITERAL - 129)) | (1L << (INTEGER_LITERAL - 129)) | (1L << (DECIMAL_LITERAL - 129)))) != 0)) {
				{
				setState(2620);
				((Python_method_expressionContext)_localctx).args = python_argument_list();
				}
			}

			setState(2623);
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
		enterRule(_localctx, 420, RULE_python_argument_list);
		try {
			setState(2631);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
			case 1:
				_localctx = new PythonOrdinalOnlyArgumentListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2625);
				((PythonOrdinalOnlyArgumentListContext)_localctx).ordinal = python_ordinal_argument_list(0);
				}
				break;
			case 2:
				_localctx = new PythonNamedOnlyArgumentListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2626);
				((PythonNamedOnlyArgumentListContext)_localctx).named = python_named_argument_list(0);
				}
				break;
			case 3:
				_localctx = new PythonArgumentListContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2627);
				((PythonArgumentListContext)_localctx).ordinal = python_ordinal_argument_list(0);
				setState(2628);
				match(COMMA);
				setState(2629);
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
		int _startState = 422;
		enterRecursionRule(_localctx, 422, RULE_python_ordinal_argument_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PythonOrdinalArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2634);
			((PythonOrdinalArgumentListContext)_localctx).item = python_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2641);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,240,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PythonOrdinalArgumentListItemContext(new Python_ordinal_argument_listContext(_parentctx, _parentState));
					((PythonOrdinalArgumentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_python_ordinal_argument_list);
					setState(2636);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2637);
					match(COMMA);
					setState(2638);
					((PythonOrdinalArgumentListItemContext)_localctx).item = python_expression(0);
					}
					} 
				}
				setState(2643);
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
		int _startState = 424;
		enterRecursionRule(_localctx, 424, RULE_python_named_argument_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PythonNamedArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2645);
			((PythonNamedArgumentListContext)_localctx).name = python_identifier();
			setState(2646);
			match(EQ);
			setState(2647);
			((PythonNamedArgumentListContext)_localctx).exp = python_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2657);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,241,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PythonNamedArgumentListItemContext(new Python_named_argument_listContext(_parentctx, _parentState));
					((PythonNamedArgumentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_python_named_argument_list);
					setState(2649);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2650);
					match(COMMA);
					setState(2651);
					((PythonNamedArgumentListItemContext)_localctx).name = python_identifier();
					setState(2652);
					match(EQ);
					setState(2653);
					((PythonNamedArgumentListItemContext)_localctx).exp = python_expression(0);
					}
					} 
				}
				setState(2659);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,241,_ctx);
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
		enterRule(_localctx, 426, RULE_python_parenthesis_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2660);
			match(LPAR);
			setState(2661);
			((Python_parenthesis_expressionContext)_localctx).exp = python_expression(0);
			setState(2662);
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
		int _startState = 428;
		enterRecursionRule(_localctx, 428, RULE_python_identifier_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2667);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
			case 1:
				{
				_localctx = new PythonPromptoIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2665);
				match(DOLLAR_IDENTIFIER);
				}
				break;
			case 2:
				{
				_localctx = new PythonIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2666);
				((PythonIdentifierContext)_localctx).name = python_identifier();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2674);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,243,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PythonChildIdentifierContext(new Python_identifier_expressionContext(_parentctx, _parentState));
					((PythonChildIdentifierContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_python_identifier_expression);
					setState(2669);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2670);
					match(DOT);
					setState(2671);
					((PythonChildIdentifierContext)_localctx).name = python_identifier();
					}
					} 
				}
				setState(2676);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,243,_ctx);
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
		enterRule(_localctx, 430, RULE_python_literal_expression);
		try {
			setState(2682);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				_localctx = new PythonIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2677);
				((PythonIntegerLiteralContext)_localctx).t = match(INTEGER_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				_localctx = new PythonDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2678);
				((PythonDecimalLiteralContext)_localctx).t = match(DECIMAL_LITERAL);
				}
				break;
			case TEXT_LITERAL:
				_localctx = new PythonTextLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2679);
				((PythonTextLiteralContext)_localctx).t = match(TEXT_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new PythonBooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2680);
				((PythonBooleanLiteralContext)_localctx).t = match(BOOLEAN_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new PythonCharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2681);
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
		enterRule(_localctx, 432, RULE_python_identifier);
		try {
			setState(2689);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2684);
				match(VARIABLE_IDENTIFIER);
				}
				break;
			case SYMBOL_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2685);
				match(SYMBOL_IDENTIFIER);
				}
				break;
			case DOLLAR_IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(2686);
				match(DOLLAR_IDENTIFIER);
				}
				break;
			case TYPE_IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(2687);
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
				setState(2688);
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
		enterRule(_localctx, 434, RULE_java_statement);
		try {
			setState(2698);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
			case 1:
				_localctx = new JavaReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2691);
				match(RETURN);
				setState(2692);
				((JavaReturnStatementContext)_localctx).exp = java_expression(0);
				setState(2693);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new JavaStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2695);
				((JavaStatementContext)_localctx).exp = java_expression(0);
				setState(2696);
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
		int _startState = 436;
		enterRecursionRule(_localctx, 436, RULE_java_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavaPrimaryExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2701);
			((JavaPrimaryExpressionContext)_localctx).exp = java_primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(2707);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,247,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavaSelectorExpressionContext(new Java_expressionContext(_parentctx, _parentState));
					((JavaSelectorExpressionContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_java_expression);
					setState(2703);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2704);
					((JavaSelectorExpressionContext)_localctx).child = java_selector_expression();
					}
					} 
				}
				setState(2709);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,247,_ctx);
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
		enterRule(_localctx, 438, RULE_java_primary_expression);
		try {
			setState(2715);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2710);
				java_this_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2711);
				java_new_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2712);
				java_parenthesis_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2713);
				java_identifier_expression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2714);
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
		enterRule(_localctx, 440, RULE_java_this_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2717);
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
		enterRule(_localctx, 442, RULE_java_new_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2719);
			new_token();
			setState(2720);
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
		enterRule(_localctx, 444, RULE_java_selector_expression);
		try {
			setState(2725);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				_localctx = new JavaMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2722);
				match(DOT);
				setState(2723);
				((JavaMethodExpressionContext)_localctx).exp = java_method_expression();
				}
				break;
			case LBRAK:
				_localctx = new JavaItemExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2724);
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
		enterRule(_localctx, 446, RULE_java_method_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2727);
			((Java_method_expressionContext)_localctx).name = java_identifier();
			setState(2728);
			match(LPAR);
			setState(2730);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA) | (1L << CSHARP) | (1L << PYTHON2) | (1L << PYTHON3) | (1L << JAVASCRIPT) | (1L << SWIFT) | (1L << LPAR) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (CODE - 65)) | (1L << (DOCUMENT - 65)) | (1L << (BLOB - 65)) | (1L << (IMAGE - 65)) | (1L << (UUID - 65)) | (1L << (DBID - 65)) | (1L << (ITERATOR - 65)) | (1L << (CURSOR - 65)) | (1L << (HTML - 65)) | (1L << (ABSTRACT - 65)) | (1L << (ALL - 65)) | (1L << (ALWAYS - 65)) | (1L << (AND - 65)) | (1L << (ANY - 65)) | (1L << (AS - 65)) | (1L << (ASC - 65)) | (1L << (ATTR - 65)) | (1L << (ATTRIBUTE - 65)) | (1L << (ATTRIBUTES - 65)) | (1L << (BINDINGS - 65)) | (1L << (BREAK - 65)) | (1L << (BY - 65)) | (1L << (CASE - 65)) | (1L << (CATCH - 65)) | (1L << (CATEGORY - 65)) | (1L << (CLASS - 65)) | (1L << (CONTAINS - 65)) | (1L << (DEF - 65)) | (1L << (DEFAULT - 65)) | (1L << (DEFINE - 65)) | (1L << (DELETE - 65)) | (1L << (DESC - 65)) | (1L << (DO - 65)) | (1L << (DOING - 65)) | (1L << (EACH - 65)) | (1L << (ELSE - 65)) | (1L << (ENUM - 65)) | (1L << (ENUMERATED - 65)) | (1L << (EXCEPT - 65)) | (1L << (EXECUTE - 65)) | (1L << (EXPECTING - 65)) | (1L << (EXTENDS - 65)) | (1L << (FETCH - 65)) | (1L << (FILTERED - 65)) | (1L << (FINALLY - 65)) | (1L << (FLUSH - 65)) | (1L << (FOR - 65)) | (1L << (FROM - 65)) | (1L << (GETTER - 65)) | (1L << (HAS - 65)) | (1L << (IF - 65)) | (1L << (IN - 65)) | (1L << (INDEX - 65)) | (1L << (IS - 65)) | (1L << (MATCHING - 65)) | (1L << (METHOD - 65)) | (1L << (METHODS - 65)) | (1L << (MODULO - 65)) | (1L << (MUTABLE - 65)) | (1L << (NATIVE - 65)) | (1L << (NONE - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (NOT - 129)) | (1L << (NOTHING - 129)) | (1L << (NULL - 129)) | (1L << (ON - 129)) | (1L << (ONE - 129)) | (1L << (OPERATOR - 129)) | (1L << (OR - 129)) | (1L << (ORDER - 129)) | (1L << (OTHERWISE - 129)) | (1L << (PASS - 129)) | (1L << (RAISE - 129)) | (1L << (READ - 129)) | (1L << (RECEIVING - 129)) | (1L << (RESOURCE - 129)) | (1L << (RETURN - 129)) | (1L << (RETURNING - 129)) | (1L << (ROWS - 129)) | (1L << (SELF - 129)) | (1L << (SETTER - 129)) | (1L << (SINGLETON - 129)) | (1L << (SORTED - 129)) | (1L << (STORABLE - 129)) | (1L << (STORE - 129)) | (1L << (SUPER - 129)) | (1L << (SWITCH - 129)) | (1L << (TEST - 129)) | (1L << (THIS - 129)) | (1L << (THROW - 129)) | (1L << (TO - 129)) | (1L << (TRY - 129)) | (1L << (VERIFYING - 129)) | (1L << (WIDGET - 129)) | (1L << (WITH - 129)) | (1L << (WHEN - 129)) | (1L << (WHERE - 129)) | (1L << (WHILE - 129)) | (1L << (WRITE - 129)) | (1L << (BOOLEAN_LITERAL - 129)) | (1L << (CHAR_LITERAL - 129)) | (1L << (SYMBOL_IDENTIFIER - 129)) | (1L << (TYPE_IDENTIFIER - 129)) | (1L << (VARIABLE_IDENTIFIER - 129)) | (1L << (DOLLAR_IDENTIFIER - 129)) | (1L << (TEXT_LITERAL - 129)) | (1L << (INTEGER_LITERAL - 129)) | (1L << (DECIMAL_LITERAL - 129)))) != 0)) {
				{
				setState(2729);
				((Java_method_expressionContext)_localctx).args = java_arguments(0);
				}
			}

			setState(2732);
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
		int _startState = 448;
		enterRecursionRule(_localctx, 448, RULE_java_arguments, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavaArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2735);
			((JavaArgumentListContext)_localctx).item = java_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2742);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,251,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavaArgumentListItemContext(new Java_argumentsContext(_parentctx, _parentState));
					((JavaArgumentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_java_arguments);
					setState(2737);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2738);
					match(COMMA);
					setState(2739);
					((JavaArgumentListItemContext)_localctx).item = java_expression(0);
					}
					} 
				}
				setState(2744);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,251,_ctx);
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
		enterRule(_localctx, 450, RULE_java_item_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2745);
			match(LBRAK);
			setState(2746);
			((Java_item_expressionContext)_localctx).exp = java_expression(0);
			setState(2747);
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
		enterRule(_localctx, 452, RULE_java_parenthesis_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2749);
			match(LPAR);
			setState(2750);
			((Java_parenthesis_expressionContext)_localctx).exp = java_expression(0);
			setState(2751);
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
		int _startState = 454;
		enterRecursionRule(_localctx, 454, RULE_java_identifier_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavaIdentifierContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2754);
			((JavaIdentifierContext)_localctx).name = java_identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(2761);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,252,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavaChildIdentifierContext(new Java_identifier_expressionContext(_parentctx, _parentState));
					((JavaChildIdentifierContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_java_identifier_expression);
					setState(2756);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2757);
					match(DOT);
					setState(2758);
					((JavaChildIdentifierContext)_localctx).name = java_identifier();
					}
					} 
				}
				setState(2763);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,252,_ctx);
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
		int _startState = 456;
		enterRecursionRule(_localctx, 456, RULE_java_class_identifier_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavaClassIdentifierContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2765);
			((JavaClassIdentifierContext)_localctx).klass = java_identifier_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2771);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,253,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavaChildClassIdentifierContext(new Java_class_identifier_expressionContext(_parentctx, _parentState));
					((JavaChildClassIdentifierContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_java_class_identifier_expression);
					setState(2767);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2768);
					((JavaChildClassIdentifierContext)_localctx).name = match(DOLLAR_IDENTIFIER);
					}
					} 
				}
				setState(2773);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,253,_ctx);
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
		enterRule(_localctx, 458, RULE_java_literal_expression);
		try {
			setState(2779);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				_localctx = new JavaIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2774);
				((JavaIntegerLiteralContext)_localctx).t = match(INTEGER_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				_localctx = new JavaDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2775);
				((JavaDecimalLiteralContext)_localctx).t = match(DECIMAL_LITERAL);
				}
				break;
			case TEXT_LITERAL:
				_localctx = new JavaTextLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2776);
				((JavaTextLiteralContext)_localctx).t = match(TEXT_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new JavaBooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2777);
				((JavaBooleanLiteralContext)_localctx).t = match(BOOLEAN_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new JavaCharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2778);
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
		enterRule(_localctx, 460, RULE_java_identifier);
		try {
			setState(2786);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2781);
				match(VARIABLE_IDENTIFIER);
				}
				break;
			case SYMBOL_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2782);
				match(SYMBOL_IDENTIFIER);
				}
				break;
			case DOLLAR_IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(2783);
				match(DOLLAR_IDENTIFIER);
				}
				break;
			case TYPE_IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(2784);
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
				setState(2785);
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
		enterRule(_localctx, 462, RULE_csharp_statement);
		try {
			setState(2795);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
			case 1:
				_localctx = new CSharpReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2788);
				match(RETURN);
				setState(2789);
				((CSharpReturnStatementContext)_localctx).exp = csharp_expression(0);
				setState(2790);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new CSharpStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2792);
				((CSharpStatementContext)_localctx).exp = csharp_expression(0);
				setState(2793);
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
		int _startState = 464;
		enterRecursionRule(_localctx, 464, RULE_csharp_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new CSharpPrimaryExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2798);
			((CSharpPrimaryExpressionContext)_localctx).exp = csharp_primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(2804);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,257,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CSharpSelectorExpressionContext(new Csharp_expressionContext(_parentctx, _parentState));
					((CSharpSelectorExpressionContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_csharp_expression);
					setState(2800);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2801);
					((CSharpSelectorExpressionContext)_localctx).child = csharp_selector_expression();
					}
					} 
				}
				setState(2806);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,257,_ctx);
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
		enterRule(_localctx, 466, RULE_csharp_primary_expression);
		try {
			setState(2812);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2807);
				csharp_this_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2808);
				csharp_new_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2809);
				csharp_parenthesis_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2810);
				csharp_identifier_expression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2811);
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
		enterRule(_localctx, 468, RULE_csharp_this_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2814);
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
		enterRule(_localctx, 470, RULE_csharp_new_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2816);
			new_token();
			setState(2817);
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
		enterRule(_localctx, 472, RULE_csharp_selector_expression);
		try {
			setState(2822);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				_localctx = new CSharpMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2819);
				match(DOT);
				setState(2820);
				((CSharpMethodExpressionContext)_localctx).exp = csharp_method_expression();
				}
				break;
			case LBRAK:
				_localctx = new CSharpItemExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2821);
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
		enterRule(_localctx, 474, RULE_csharp_method_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2824);
			((Csharp_method_expressionContext)_localctx).name = csharp_identifier();
			setState(2825);
			match(LPAR);
			setState(2827);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA) | (1L << CSHARP) | (1L << PYTHON2) | (1L << PYTHON3) | (1L << JAVASCRIPT) | (1L << SWIFT) | (1L << LPAR) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (CODE - 65)) | (1L << (DOCUMENT - 65)) | (1L << (BLOB - 65)) | (1L << (IMAGE - 65)) | (1L << (UUID - 65)) | (1L << (DBID - 65)) | (1L << (ITERATOR - 65)) | (1L << (CURSOR - 65)) | (1L << (HTML - 65)) | (1L << (ABSTRACT - 65)) | (1L << (ALL - 65)) | (1L << (ALWAYS - 65)) | (1L << (AND - 65)) | (1L << (ANY - 65)) | (1L << (AS - 65)) | (1L << (ASC - 65)) | (1L << (ATTR - 65)) | (1L << (ATTRIBUTE - 65)) | (1L << (ATTRIBUTES - 65)) | (1L << (BINDINGS - 65)) | (1L << (BREAK - 65)) | (1L << (BY - 65)) | (1L << (CASE - 65)) | (1L << (CATCH - 65)) | (1L << (CATEGORY - 65)) | (1L << (CLASS - 65)) | (1L << (CONTAINS - 65)) | (1L << (DEF - 65)) | (1L << (DEFAULT - 65)) | (1L << (DEFINE - 65)) | (1L << (DELETE - 65)) | (1L << (DESC - 65)) | (1L << (DO - 65)) | (1L << (DOING - 65)) | (1L << (EACH - 65)) | (1L << (ELSE - 65)) | (1L << (ENUM - 65)) | (1L << (ENUMERATED - 65)) | (1L << (EXCEPT - 65)) | (1L << (EXECUTE - 65)) | (1L << (EXPECTING - 65)) | (1L << (EXTENDS - 65)) | (1L << (FETCH - 65)) | (1L << (FILTERED - 65)) | (1L << (FINALLY - 65)) | (1L << (FLUSH - 65)) | (1L << (FOR - 65)) | (1L << (FROM - 65)) | (1L << (GETTER - 65)) | (1L << (HAS - 65)) | (1L << (IF - 65)) | (1L << (IN - 65)) | (1L << (INDEX - 65)) | (1L << (IS - 65)) | (1L << (MATCHING - 65)) | (1L << (METHOD - 65)) | (1L << (METHODS - 65)) | (1L << (MODULO - 65)) | (1L << (MUTABLE - 65)) | (1L << (NATIVE - 65)) | (1L << (NONE - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (NOT - 129)) | (1L << (NOTHING - 129)) | (1L << (NULL - 129)) | (1L << (ON - 129)) | (1L << (ONE - 129)) | (1L << (OPERATOR - 129)) | (1L << (OR - 129)) | (1L << (ORDER - 129)) | (1L << (OTHERWISE - 129)) | (1L << (PASS - 129)) | (1L << (RAISE - 129)) | (1L << (READ - 129)) | (1L << (RECEIVING - 129)) | (1L << (RESOURCE - 129)) | (1L << (RETURN - 129)) | (1L << (RETURNING - 129)) | (1L << (ROWS - 129)) | (1L << (SELF - 129)) | (1L << (SETTER - 129)) | (1L << (SINGLETON - 129)) | (1L << (SORTED - 129)) | (1L << (STORABLE - 129)) | (1L << (STORE - 129)) | (1L << (SUPER - 129)) | (1L << (SWITCH - 129)) | (1L << (TEST - 129)) | (1L << (THIS - 129)) | (1L << (THROW - 129)) | (1L << (TO - 129)) | (1L << (TRY - 129)) | (1L << (VERIFYING - 129)) | (1L << (WIDGET - 129)) | (1L << (WITH - 129)) | (1L << (WHEN - 129)) | (1L << (WHERE - 129)) | (1L << (WHILE - 129)) | (1L << (WRITE - 129)) | (1L << (BOOLEAN_LITERAL - 129)) | (1L << (CHAR_LITERAL - 129)) | (1L << (SYMBOL_IDENTIFIER - 129)) | (1L << (TYPE_IDENTIFIER - 129)) | (1L << (VARIABLE_IDENTIFIER - 129)) | (1L << (DOLLAR_IDENTIFIER - 129)) | (1L << (TEXT_LITERAL - 129)) | (1L << (INTEGER_LITERAL - 129)) | (1L << (DECIMAL_LITERAL - 129)))) != 0)) {
				{
				setState(2826);
				((Csharp_method_expressionContext)_localctx).args = csharp_arguments(0);
				}
			}

			setState(2829);
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
		int _startState = 476;
		enterRecursionRule(_localctx, 476, RULE_csharp_arguments, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new CSharpArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2832);
			((CSharpArgumentListContext)_localctx).item = csharp_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2839);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,261,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CSharpArgumentListItemContext(new Csharp_argumentsContext(_parentctx, _parentState));
					((CSharpArgumentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_csharp_arguments);
					setState(2834);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2835);
					match(COMMA);
					setState(2836);
					((CSharpArgumentListItemContext)_localctx).item = csharp_expression(0);
					}
					} 
				}
				setState(2841);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,261,_ctx);
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
		enterRule(_localctx, 478, RULE_csharp_item_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2842);
			match(LBRAK);
			setState(2843);
			((Csharp_item_expressionContext)_localctx).exp = csharp_expression(0);
			setState(2844);
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
		enterRule(_localctx, 480, RULE_csharp_parenthesis_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2846);
			match(LPAR);
			setState(2847);
			((Csharp_parenthesis_expressionContext)_localctx).exp = csharp_expression(0);
			setState(2848);
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
		int _startState = 482;
		enterRecursionRule(_localctx, 482, RULE_csharp_identifier_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2853);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
			case 1:
				{
				_localctx = new CSharpPromptoIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2851);
				match(DOLLAR_IDENTIFIER);
				}
				break;
			case 2:
				{
				_localctx = new CSharpIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2852);
				((CSharpIdentifierContext)_localctx).name = csharp_identifier();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2860);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,263,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CSharpChildIdentifierContext(new Csharp_identifier_expressionContext(_parentctx, _parentState));
					((CSharpChildIdentifierContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_csharp_identifier_expression);
					setState(2855);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2856);
					match(DOT);
					setState(2857);
					((CSharpChildIdentifierContext)_localctx).name = csharp_identifier();
					}
					} 
				}
				setState(2862);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,263,_ctx);
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
		enterRule(_localctx, 484, RULE_csharp_literal_expression);
		try {
			setState(2868);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				_localctx = new CSharpIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2863);
				match(INTEGER_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				_localctx = new CSharpDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2864);
				match(DECIMAL_LITERAL);
				}
				break;
			case TEXT_LITERAL:
				_localctx = new CSharpTextLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2865);
				match(TEXT_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new CSharpBooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2866);
				match(BOOLEAN_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new CSharpCharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2867);
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
		enterRule(_localctx, 486, RULE_csharp_identifier);
		try {
			setState(2875);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2870);
				match(VARIABLE_IDENTIFIER);
				}
				break;
			case SYMBOL_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2871);
				match(SYMBOL_IDENTIFIER);
				}
				break;
			case DOLLAR_IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(2872);
				match(DOLLAR_IDENTIFIER);
				}
				break;
			case TYPE_IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(2873);
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
				setState(2874);
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
		enterRule(_localctx, 488, RULE_jsx_expression);
		try {
			setState(2879);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,266,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2877);
				jsx_element();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2878);
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
		enterRule(_localctx, 490, RULE_jsx_element);
		try {
			setState(2888);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
			case 1:
				_localctx = new JsxSelfClosingContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2881);
				((JsxSelfClosingContext)_localctx).jsx = jsx_self_closing();
				}
				break;
			case 2:
				_localctx = new JsxElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2882);
				((JsxElementContext)_localctx).opening = jsx_opening();
				setState(2884);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
				case 1:
					{
					setState(2883);
					((JsxElementContext)_localctx).children_ = jsx_children();
					}
					break;
				}
				setState(2886);
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
		enterRule(_localctx, 492, RULE_jsx_fragment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2890);
			jsx_fragment_start();
			setState(2891);
			ws_plus();
			setState(2893);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,269,_ctx) ) {
			case 1:
				{
				setState(2892);
				((Jsx_fragmentContext)_localctx).children_ = jsx_children();
				}
				break;
			}
			setState(2895);
			ws_plus();
			setState(2896);
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
		enterRule(_localctx, 494, RULE_jsx_fragment_start);
		try {
			setState(2901);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2898);
				match(LT);
				setState(2899);
				match(GT);
				}
				break;
			case LTGT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2900);
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
		enterRule(_localctx, 496, RULE_jsx_fragment_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2903);
			match(LT);
			setState(2904);
			match(SLASH);
			setState(2905);
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
		enterRule(_localctx, 498, RULE_jsx_self_closing);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2907);
			match(LT);
			setState(2908);
			((Jsx_self_closingContext)_localctx).name = jsx_element_name();
			setState(2909);
			ws_plus();
			setState(2913);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA) | (1L << CSHARP) | (1L << PYTHON2) | (1L << PYTHON3) | (1L << JAVASCRIPT) | (1L << SWIFT) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (CODE - 65)) | (1L << (DOCUMENT - 65)) | (1L << (BLOB - 65)) | (1L << (IMAGE - 65)) | (1L << (UUID - 65)) | (1L << (DBID - 65)) | (1L << (ITERATOR - 65)) | (1L << (CURSOR - 65)) | (1L << (HTML - 65)) | (1L << (ABSTRACT - 65)) | (1L << (ALL - 65)) | (1L << (ALWAYS - 65)) | (1L << (AND - 65)) | (1L << (ANY - 65)) | (1L << (AS - 65)) | (1L << (ASC - 65)) | (1L << (ATTR - 65)) | (1L << (ATTRIBUTE - 65)) | (1L << (ATTRIBUTES - 65)) | (1L << (BINDINGS - 65)) | (1L << (BREAK - 65)) | (1L << (BY - 65)) | (1L << (CASE - 65)) | (1L << (CATCH - 65)) | (1L << (CATEGORY - 65)) | (1L << (CLASS - 65)) | (1L << (CONTAINS - 65)) | (1L << (DEF - 65)) | (1L << (DEFAULT - 65)) | (1L << (DEFINE - 65)) | (1L << (DELETE - 65)) | (1L << (DESC - 65)) | (1L << (DO - 65)) | (1L << (DOING - 65)) | (1L << (EACH - 65)) | (1L << (ELSE - 65)) | (1L << (ENUM - 65)) | (1L << (ENUMERATED - 65)) | (1L << (EXCEPT - 65)) | (1L << (EXECUTE - 65)) | (1L << (EXPECTING - 65)) | (1L << (EXTENDS - 65)) | (1L << (FETCH - 65)) | (1L << (FILTERED - 65)) | (1L << (FINALLY - 65)) | (1L << (FLUSH - 65)) | (1L << (FOR - 65)) | (1L << (FROM - 65)) | (1L << (GETTER - 65)) | (1L << (HAS - 65)) | (1L << (IF - 65)) | (1L << (IN - 65)) | (1L << (INDEX - 65)) | (1L << (IS - 65)) | (1L << (MATCHING - 65)) | (1L << (METHOD - 65)) | (1L << (METHODS - 65)) | (1L << (MODULO - 65)) | (1L << (MUTABLE - 65)) | (1L << (NATIVE - 65)) | (1L << (NONE - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (NOT - 129)) | (1L << (NOTHING - 129)) | (1L << (NULL - 129)) | (1L << (ON - 129)) | (1L << (ONE - 129)) | (1L << (OPERATOR - 129)) | (1L << (OR - 129)) | (1L << (ORDER - 129)) | (1L << (OTHERWISE - 129)) | (1L << (PASS - 129)) | (1L << (RAISE - 129)) | (1L << (READ - 129)) | (1L << (RECEIVING - 129)) | (1L << (RESOURCE - 129)) | (1L << (RETURN - 129)) | (1L << (RETURNING - 129)) | (1L << (ROWS - 129)) | (1L << (SELF - 129)) | (1L << (SETTER - 129)) | (1L << (SINGLETON - 129)) | (1L << (SORTED - 129)) | (1L << (STORABLE - 129)) | (1L << (STORE - 129)) | (1L << (SUPER - 129)) | (1L << (SWITCH - 129)) | (1L << (TEST - 129)) | (1L << (THIS - 129)) | (1L << (THROW - 129)) | (1L << (TO - 129)) | (1L << (TRY - 129)) | (1L << (VERIFYING - 129)) | (1L << (WIDGET - 129)) | (1L << (WITH - 129)) | (1L << (WHEN - 129)) | (1L << (WHERE - 129)) | (1L << (WHILE - 129)) | (1L << (WRITE - 129)) | (1L << (SYMBOL_IDENTIFIER - 129)) | (1L << (TYPE_IDENTIFIER - 129)) | (1L << (VARIABLE_IDENTIFIER - 129)))) != 0)) {
				{
				{
				setState(2910);
				((Jsx_self_closingContext)_localctx).attributes = jsx_attribute();
				}
				}
				setState(2915);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2916);
			match(SLASH);
			setState(2917);
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
		enterRule(_localctx, 500, RULE_jsx_opening);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2919);
			match(LT);
			setState(2920);
			((Jsx_openingContext)_localctx).name = jsx_element_name();
			setState(2921);
			ws_plus();
			setState(2925);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA) | (1L << CSHARP) | (1L << PYTHON2) | (1L << PYTHON3) | (1L << JAVASCRIPT) | (1L << SWIFT) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (CODE - 65)) | (1L << (DOCUMENT - 65)) | (1L << (BLOB - 65)) | (1L << (IMAGE - 65)) | (1L << (UUID - 65)) | (1L << (DBID - 65)) | (1L << (ITERATOR - 65)) | (1L << (CURSOR - 65)) | (1L << (HTML - 65)) | (1L << (ABSTRACT - 65)) | (1L << (ALL - 65)) | (1L << (ALWAYS - 65)) | (1L << (AND - 65)) | (1L << (ANY - 65)) | (1L << (AS - 65)) | (1L << (ASC - 65)) | (1L << (ATTR - 65)) | (1L << (ATTRIBUTE - 65)) | (1L << (ATTRIBUTES - 65)) | (1L << (BINDINGS - 65)) | (1L << (BREAK - 65)) | (1L << (BY - 65)) | (1L << (CASE - 65)) | (1L << (CATCH - 65)) | (1L << (CATEGORY - 65)) | (1L << (CLASS - 65)) | (1L << (CONTAINS - 65)) | (1L << (DEF - 65)) | (1L << (DEFAULT - 65)) | (1L << (DEFINE - 65)) | (1L << (DELETE - 65)) | (1L << (DESC - 65)) | (1L << (DO - 65)) | (1L << (DOING - 65)) | (1L << (EACH - 65)) | (1L << (ELSE - 65)) | (1L << (ENUM - 65)) | (1L << (ENUMERATED - 65)) | (1L << (EXCEPT - 65)) | (1L << (EXECUTE - 65)) | (1L << (EXPECTING - 65)) | (1L << (EXTENDS - 65)) | (1L << (FETCH - 65)) | (1L << (FILTERED - 65)) | (1L << (FINALLY - 65)) | (1L << (FLUSH - 65)) | (1L << (FOR - 65)) | (1L << (FROM - 65)) | (1L << (GETTER - 65)) | (1L << (HAS - 65)) | (1L << (IF - 65)) | (1L << (IN - 65)) | (1L << (INDEX - 65)) | (1L << (IS - 65)) | (1L << (MATCHING - 65)) | (1L << (METHOD - 65)) | (1L << (METHODS - 65)) | (1L << (MODULO - 65)) | (1L << (MUTABLE - 65)) | (1L << (NATIVE - 65)) | (1L << (NONE - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (NOT - 129)) | (1L << (NOTHING - 129)) | (1L << (NULL - 129)) | (1L << (ON - 129)) | (1L << (ONE - 129)) | (1L << (OPERATOR - 129)) | (1L << (OR - 129)) | (1L << (ORDER - 129)) | (1L << (OTHERWISE - 129)) | (1L << (PASS - 129)) | (1L << (RAISE - 129)) | (1L << (READ - 129)) | (1L << (RECEIVING - 129)) | (1L << (RESOURCE - 129)) | (1L << (RETURN - 129)) | (1L << (RETURNING - 129)) | (1L << (ROWS - 129)) | (1L << (SELF - 129)) | (1L << (SETTER - 129)) | (1L << (SINGLETON - 129)) | (1L << (SORTED - 129)) | (1L << (STORABLE - 129)) | (1L << (STORE - 129)) | (1L << (SUPER - 129)) | (1L << (SWITCH - 129)) | (1L << (TEST - 129)) | (1L << (THIS - 129)) | (1L << (THROW - 129)) | (1L << (TO - 129)) | (1L << (TRY - 129)) | (1L << (VERIFYING - 129)) | (1L << (WIDGET - 129)) | (1L << (WITH - 129)) | (1L << (WHEN - 129)) | (1L << (WHERE - 129)) | (1L << (WHILE - 129)) | (1L << (WRITE - 129)) | (1L << (SYMBOL_IDENTIFIER - 129)) | (1L << (TYPE_IDENTIFIER - 129)) | (1L << (VARIABLE_IDENTIFIER - 129)))) != 0)) {
				{
				{
				setState(2922);
				((Jsx_openingContext)_localctx).attributes = jsx_attribute();
				}
				}
				setState(2927);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2928);
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
		enterRule(_localctx, 502, RULE_jsx_closing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2930);
			match(LT);
			setState(2931);
			match(SLASH);
			setState(2932);
			((Jsx_closingContext)_localctx).name = jsx_element_name();
			setState(2933);
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
		enterRule(_localctx, 504, RULE_jsx_element_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2935);
			jsx_identifier();
			setState(2940);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(2936);
				match(DOT);
				setState(2937);
				jsx_identifier();
				}
				}
				setState(2942);
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
		enterRule(_localctx, 506, RULE_jsx_identifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2943);
			identifier_or_keyword();
			setState(2947);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,274,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2944);
					nospace_hyphen_identifier_or_keyword();
					}
					} 
				}
				setState(2949);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,274,_ctx);
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
		enterRule(_localctx, 508, RULE_jsx_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2950);
			((Jsx_attributeContext)_localctx).name = jsx_identifier();
			setState(2953);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(2951);
				match(EQ);
				setState(2952);
				((Jsx_attributeContext)_localctx).value = jsx_attribute_value();
				}
			}

			setState(2955);
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
		enterRule(_localctx, 510, RULE_jsx_attribute_value);
		int _la;
		try {
			setState(2963);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT_LITERAL:
				_localctx = new JsxLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2957);
				match(TEXT_LITERAL);
				}
				break;
			case LCURL:
				_localctx = new JsxValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2958);
				match(LCURL);
				setState(2960);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << LTCOLONGT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (METHOD_COLON - 64)) | (1L << (CODE - 64)) | (1L << (DOCUMENT - 64)) | (1L << (BLOB - 64)) | (1L << (TYPE - 64)) | (1L << (CATEGORY - 64)) | (1L << (EXECUTE - 64)) | (1L << (FETCH - 64)) | (1L << (INVOKE_COLON - 64)) | (1L << (MUTABLE - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (NOT - 129)) | (1L << (NOTHING - 129)) | (1L << (READ - 129)) | (1L << (RESOURCE - 129)) | (1L << (SELF - 129)) | (1L << (SORTED - 129)) | (1L << (SUPER - 129)) | (1L << (THIS - 129)) | (1L << (BOOLEAN_LITERAL - 129)) | (1L << (CHAR_LITERAL - 129)) | (1L << (MIN_INTEGER - 129)) | (1L << (MAX_INTEGER - 129)) | (1L << (SYMBOL_IDENTIFIER - 129)) | (1L << (TYPE_IDENTIFIER - 129)) | (1L << (VARIABLE_IDENTIFIER - 129)) | (1L << (TEXT_LITERAL - 129)) | (1L << (UUID_LITERAL - 129)) | (1L << (VERSION_LITERAL - 129)) | (1L << (INTEGER_LITERAL - 129)) | (1L << (HEXA_LITERAL - 129)) | (1L << (DECIMAL_LITERAL - 129)) | (1L << (DATETIME_LITERAL - 129)) | (1L << (TIME_LITERAL - 129)) | (1L << (DATE_LITERAL - 129)) | (1L << (PERIOD_LITERAL - 129)))) != 0)) {
					{
					setState(2959);
					((JsxValueContext)_localctx).exp = expression(0);
					}
				}

				setState(2962);
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
		enterRule(_localctx, 512, RULE_jsx_children);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2966); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2965);
					jsx_child();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2968); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,278,_ctx);
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
		enterRule(_localctx, 514, RULE_jsx_child);
		int _la;
		try {
			setState(2977);
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
				setState(2970);
				((JsxTextContext)_localctx).text = jsx_text();
				}
				break;
			case LT:
				_localctx = new JsxChildContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2971);
				((JsxChildContext)_localctx).jsx = jsx_element();
				}
				break;
			case LCURL:
				_localctx = new JsxCodeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2972);
				match(LCURL);
				setState(2974);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << LTCOLONGT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (METHOD_COLON - 64)) | (1L << (CODE - 64)) | (1L << (DOCUMENT - 64)) | (1L << (BLOB - 64)) | (1L << (TYPE - 64)) | (1L << (CATEGORY - 64)) | (1L << (EXECUTE - 64)) | (1L << (FETCH - 64)) | (1L << (INVOKE_COLON - 64)) | (1L << (MUTABLE - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (NOT - 129)) | (1L << (NOTHING - 129)) | (1L << (READ - 129)) | (1L << (RESOURCE - 129)) | (1L << (SELF - 129)) | (1L << (SORTED - 129)) | (1L << (SUPER - 129)) | (1L << (THIS - 129)) | (1L << (BOOLEAN_LITERAL - 129)) | (1L << (CHAR_LITERAL - 129)) | (1L << (MIN_INTEGER - 129)) | (1L << (MAX_INTEGER - 129)) | (1L << (SYMBOL_IDENTIFIER - 129)) | (1L << (TYPE_IDENTIFIER - 129)) | (1L << (VARIABLE_IDENTIFIER - 129)) | (1L << (TEXT_LITERAL - 129)) | (1L << (UUID_LITERAL - 129)) | (1L << (VERSION_LITERAL - 129)) | (1L << (INTEGER_LITERAL - 129)) | (1L << (HEXA_LITERAL - 129)) | (1L << (DECIMAL_LITERAL - 129)) | (1L << (DATETIME_LITERAL - 129)) | (1L << (TIME_LITERAL - 129)) | (1L << (DATE_LITERAL - 129)) | (1L << (PERIOD_LITERAL - 129)))) != 0)) {
					{
					setState(2973);
					((JsxCodeContext)_localctx).exp = expression(0);
					}
				}

				setState(2976);
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
		enterRule(_localctx, 516, RULE_jsx_text);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2980); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2979);
					jsx_char();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2982); 
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
		enterRule(_localctx, 518, RULE_jsx_char);
		int _la;
		try {
			setState(2986);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2984);
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
				setState(2985);
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
		enterRule(_localctx, 520, RULE_css_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2988);
			match(LCURL);
			setState(2990); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2989);
				((Css_expressionContext)_localctx).field = css_field();
				}
				}
				setState(2992); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA) | (1L << CSHARP) | (1L << PYTHON2) | (1L << PYTHON3) | (1L << JAVASCRIPT) | (1L << SWIFT) | (1L << MINUS) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (CODE - 65)) | (1L << (DOCUMENT - 65)) | (1L << (BLOB - 65)) | (1L << (IMAGE - 65)) | (1L << (UUID - 65)) | (1L << (DBID - 65)) | (1L << (ITERATOR - 65)) | (1L << (CURSOR - 65)) | (1L << (HTML - 65)) | (1L << (ABSTRACT - 65)) | (1L << (ALL - 65)) | (1L << (ALWAYS - 65)) | (1L << (AND - 65)) | (1L << (ANY - 65)) | (1L << (AS - 65)) | (1L << (ASC - 65)) | (1L << (ATTR - 65)) | (1L << (ATTRIBUTE - 65)) | (1L << (ATTRIBUTES - 65)) | (1L << (BINDINGS - 65)) | (1L << (BREAK - 65)) | (1L << (BY - 65)) | (1L << (CASE - 65)) | (1L << (CATCH - 65)) | (1L << (CATEGORY - 65)) | (1L << (CLASS - 65)) | (1L << (CONTAINS - 65)) | (1L << (DEF - 65)) | (1L << (DEFAULT - 65)) | (1L << (DEFINE - 65)) | (1L << (DELETE - 65)) | (1L << (DESC - 65)) | (1L << (DO - 65)) | (1L << (DOING - 65)) | (1L << (EACH - 65)) | (1L << (ELSE - 65)) | (1L << (ENUM - 65)) | (1L << (ENUMERATED - 65)) | (1L << (EXCEPT - 65)) | (1L << (EXECUTE - 65)) | (1L << (EXPECTING - 65)) | (1L << (EXTENDS - 65)) | (1L << (FETCH - 65)) | (1L << (FILTERED - 65)) | (1L << (FINALLY - 65)) | (1L << (FLUSH - 65)) | (1L << (FOR - 65)) | (1L << (FROM - 65)) | (1L << (GETTER - 65)) | (1L << (HAS - 65)) | (1L << (IF - 65)) | (1L << (IN - 65)) | (1L << (INDEX - 65)) | (1L << (IS - 65)) | (1L << (MATCHING - 65)) | (1L << (METHOD - 65)) | (1L << (METHODS - 65)) | (1L << (MODULO - 65)) | (1L << (MUTABLE - 65)) | (1L << (NATIVE - 65)) | (1L << (NONE - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (NOT - 129)) | (1L << (NOTHING - 129)) | (1L << (NULL - 129)) | (1L << (ON - 129)) | (1L << (ONE - 129)) | (1L << (OPERATOR - 129)) | (1L << (OR - 129)) | (1L << (ORDER - 129)) | (1L << (OTHERWISE - 129)) | (1L << (PASS - 129)) | (1L << (RAISE - 129)) | (1L << (READ - 129)) | (1L << (RECEIVING - 129)) | (1L << (RESOURCE - 129)) | (1L << (RETURN - 129)) | (1L << (RETURNING - 129)) | (1L << (ROWS - 129)) | (1L << (SELF - 129)) | (1L << (SETTER - 129)) | (1L << (SINGLETON - 129)) | (1L << (SORTED - 129)) | (1L << (STORABLE - 129)) | (1L << (STORE - 129)) | (1L << (SUPER - 129)) | (1L << (SWITCH - 129)) | (1L << (TEST - 129)) | (1L << (THIS - 129)) | (1L << (THROW - 129)) | (1L << (TO - 129)) | (1L << (TRY - 129)) | (1L << (VERIFYING - 129)) | (1L << (WIDGET - 129)) | (1L << (WITH - 129)) | (1L << (WHEN - 129)) | (1L << (WHERE - 129)) | (1L << (WHILE - 129)) | (1L << (WRITE - 129)) | (1L << (SYMBOL_IDENTIFIER - 129)) | (1L << (TYPE_IDENTIFIER - 129)) | (1L << (VARIABLE_IDENTIFIER - 129)))) != 0) );
			setState(2994);
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
		public TerminalNode COLON() { return getToken(EParser.COLON, 0); }
		public TerminalNode SEMI() { return getToken(EParser.SEMI, 0); }
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
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterCss_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitCss_field(this);
		}
	}

	public final Css_fieldContext css_field() throws RecognitionException {
		Css_fieldContext _localctx = new Css_fieldContext(_ctx, getState());
		enterRule(_localctx, 522, RULE_css_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2996);
			((Css_fieldContext)_localctx).name = css_identifier(0);
			setState(2997);
			match(COLON);
			setState(2999); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2998);
				((Css_fieldContext)_localctx).values = css_value();
				}
				}
				setState(3001); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INDENT) | (1L << DEDENT) | (1L << LF_TAB) | (1L << LF_MORE) | (1L << LF) | (1L << TAB) | (1L << WS) | (1L << COMMENT) | (1L << JAVA) | (1L << CSHARP) | (1L << PYTHON2) | (1L << PYTHON3) | (1L << JAVASCRIPT) | (1L << SWIFT) | (1L << COLON) | (1L << COMMA) | (1L << RANGE) | (1L << DOT) | (1L << LPAR) | (1L << RPAR) | (1L << LBRAK) | (1L << RBRAK) | (1L << LCURL) | (1L << QMARK) | (1L << XMARK) | (1L << AMP) | (1L << AMP2) | (1L << PIPE) | (1L << PIPE2) | (1L << PLUS) | (1L << MINUS) | (1L << STAR) | (1L << SLASH) | (1L << BSLASH) | (1L << PERCENT) | (1L << SHARP) | (1L << GT) | (1L << GTE) | (1L << LT) | (1L << LTE) | (1L << LTGT) | (1L << LTCOLONGT) | (1L << EQ) | (1L << XEQ) | (1L << EQ2) | (1L << TEQ) | (1L << TILDE) | (1L << LARROW) | (1L << RARROW) | (1L << EGT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (METHOD_COLON - 64)) | (1L << (CODE - 64)) | (1L << (DOCUMENT - 64)) | (1L << (BLOB - 64)) | (1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (TYPE - 64)) | (1L << (ABSTRACT - 64)) | (1L << (ALL - 64)) | (1L << (ALWAYS - 64)) | (1L << (AND - 64)) | (1L << (ANY - 64)) | (1L << (AS - 64)) | (1L << (ASC - 64)) | (1L << (ATTR - 64)) | (1L << (ATTRIBUTE - 64)) | (1L << (ATTRIBUTES - 64)) | (1L << (BINDINGS - 64)) | (1L << (BREAK - 64)) | (1L << (BY - 64)) | (1L << (CASE - 64)) | (1L << (CATCH - 64)) | (1L << (CATEGORY - 64)) | (1L << (CLASS - 64)) | (1L << (CONTAINS - 64)) | (1L << (DEF - 64)) | (1L << (DEFAULT - 64)) | (1L << (DEFINE - 64)) | (1L << (DELETE - 64)) | (1L << (DESC - 64)) | (1L << (DO - 64)) | (1L << (DOING - 64)) | (1L << (EACH - 64)) | (1L << (ELSE - 64)) | (1L << (ENUM - 64)) | (1L << (ENUMERATED - 64)) | (1L << (EXCEPT - 64)) | (1L << (EXECUTE - 64)) | (1L << (EXPECTING - 64)) | (1L << (EXTENDS - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (FINALLY - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (FROM - 64)) | (1L << (GETTER - 64)) | (1L << (HAS - 64)) | (1L << (IF - 64)) | (1L << (IN - 64)) | (1L << (INCLUDE - 64)) | (1L << (INDEX - 64)) | (1L << (INVOKE_COLON - 64)) | (1L << (IS - 64)) | (1L << (MATCHING - 64)) | (1L << (METHOD - 64)) | (1L << (METHODS - 64)) | (1L << (MODULO - 64)) | (1L << (MUTABLE - 64)) | (1L << (NATIVE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (NONE - 128)) | (1L << (NOT - 128)) | (1L << (NOTHING - 128)) | (1L << (NULL - 128)) | (1L << (ON - 128)) | (1L << (ONE - 128)) | (1L << (OPERATOR - 128)) | (1L << (OR - 128)) | (1L << (ORDER - 128)) | (1L << (OTHERWISE - 128)) | (1L << (PASS - 128)) | (1L << (RAISE - 128)) | (1L << (READ - 128)) | (1L << (RECEIVING - 128)) | (1L << (RESOURCE - 128)) | (1L << (RETURN - 128)) | (1L << (RETURNING - 128)) | (1L << (ROWS - 128)) | (1L << (SELF - 128)) | (1L << (SETTER - 128)) | (1L << (SINGLETON - 128)) | (1L << (SORTED - 128)) | (1L << (STORABLE - 128)) | (1L << (STORE - 128)) | (1L << (SUPER - 128)) | (1L << (SWITCH - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (THIS - 128)) | (1L << (THROW - 128)) | (1L << (TO - 128)) | (1L << (TRY - 128)) | (1L << (VERIFYING - 128)) | (1L << (WIDGET - 128)) | (1L << (WITH - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WHILE - 128)) | (1L << (WRITE - 128)) | (1L << (BOOLEAN_LITERAL - 128)) | (1L << (CHAR_LITERAL - 128)) | (1L << (MIN_INTEGER - 128)) | (1L << (MAX_INTEGER - 128)) | (1L << (SYMBOL_IDENTIFIER - 128)) | (1L << (TYPE_IDENTIFIER - 128)) | (1L << (VARIABLE_IDENTIFIER - 128)) | (1L << (NATIVE_IDENTIFIER - 128)) | (1L << (DOLLAR_IDENTIFIER - 128)) | (1L << (ARONDBASE_IDENTIFIER - 128)) | (1L << (TEXT_LITERAL - 128)) | (1L << (UUID_LITERAL - 128)) | (1L << (VERSION_LITERAL - 128)) | (1L << (INTEGER_LITERAL - 128)) | (1L << (HEXA_LITERAL - 128)) | (1L << (DECIMAL_LITERAL - 128)) | (1L << (DATETIME_LITERAL - 128)) | (1L << (TIME_LITERAL - 128)) | (1L << (DATE_LITERAL - 128)) | (1L << (PERIOD_LITERAL - 128)) | (1L << (JSX_TEXT - 128)))) != 0) );
			setState(3003);
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
		int _startState = 524;
		enterRecursionRule(_localctx, 524, RULE_css_identifier, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3009);
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
				setState(3006);
				identifier_or_keyword();
				}
				break;
			case MINUS:
				{
				setState(3007);
				match(MINUS);
				setState(3008);
				nospace_identifier_or_keyword();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(3019);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,287,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Css_identifierContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_css_identifier);
					setState(3011);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(3013); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(3012);
							nospace_hyphen_identifier_or_keyword();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(3015); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,286,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					} 
				}
				setState(3021);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,287,_ctx);
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
		enterRule(_localctx, 526, RULE_css_value);
		try {
			setState(3027);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURL:
				_localctx = new CssValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(3022);
				match(LCURL);
				setState(3023);
				((CssValueContext)_localctx).exp = expression(0);
				setState(3024);
				match(RCURL);
				}
				break;
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
				setState(3026);
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
		public List<TerminalNode> SEMI() { return getTokens(EParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(EParser.SEMI, i);
		}
		public List<TerminalNode> LCURL() { return getTokens(EParser.LCURL); }
		public TerminalNode LCURL(int i) {
			return getToken(EParser.LCURL, i);
		}
		public List<TerminalNode> RCURL() { return getTokens(EParser.RCURL); }
		public TerminalNode RCURL(int i) {
			return getToken(EParser.RCURL, i);
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
		enterRule(_localctx, 528, RULE_css_text);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3030); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(3029);
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
				setState(3032); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,289,_ctx);
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
		case 18:
			return native_category_binding_list_sempred((Native_category_binding_listContext)_localctx, predIndex);
		case 40:
			return else_if_statement_list_sempred((Else_if_statement_listContext)_localctx, predIndex);
		case 46:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 48:
			return unresolved_expression_sempred((Unresolved_expressionContext)_localctx, predIndex);
		case 49:
			return unresolved_selector_sempred((Unresolved_selectorContext)_localctx, predIndex);
		case 51:
			return invocation_trailer_sempred((Invocation_trailerContext)_localctx, predIndex);
		case 53:
			return instance_expression_sempred((Instance_expressionContext)_localctx, predIndex);
		case 54:
			return instance_selector_sempred((Instance_selectorContext)_localctx, predIndex);
		case 55:
			return mutable_instance_expression_sempred((Mutable_instance_expressionContext)_localctx, predIndex);
		case 68:
			return argument_assignment_list_sempred((Argument_assignment_listContext)_localctx, predIndex);
		case 69:
			return with_argument_assignment_list_sempred((With_argument_assignment_listContext)_localctx, predIndex);
		case 72:
			return child_instance_sempred((Child_instanceContext)_localctx, predIndex);
		case 100:
			return typedef_sempred((TypedefContext)_localctx, predIndex);
		case 110:
			return nospace_hyphen_identifier_or_keyword_sempred((Nospace_hyphen_identifier_or_keywordContext)_localctx, predIndex);
		case 111:
			return nospace_identifier_or_keyword_sempred((Nospace_identifier_or_keywordContext)_localctx, predIndex);
		case 125:
			return any_type_sempred((Any_typeContext)_localctx, predIndex);
		case 167:
			return assignable_instance_sempred((Assignable_instanceContext)_localctx, predIndex);
		case 168:
			return is_expression_sempred((Is_expressionContext)_localctx, predIndex);
		case 169:
			return metadata_sempred((MetadataContext)_localctx, predIndex);
		case 181:
			return new_token_sempred((New_tokenContext)_localctx, predIndex);
		case 182:
			return key_token_sempred((Key_tokenContext)_localctx, predIndex);
		case 183:
			return module_token_sempred((Module_tokenContext)_localctx, predIndex);
		case 184:
			return value_token_sempred((Value_tokenContext)_localctx, predIndex);
		case 185:
			return symbols_token_sempred((Symbols_tokenContext)_localctx, predIndex);
		case 192:
			return javascript_expression_sempred((Javascript_expressionContext)_localctx, predIndex);
		case 198:
			return javascript_arguments_sempred((Javascript_argumentsContext)_localctx, predIndex);
		case 205:
			return python_expression_sempred((Python_expressionContext)_localctx, predIndex);
		case 211:
			return python_ordinal_argument_list_sempred((Python_ordinal_argument_listContext)_localctx, predIndex);
		case 212:
			return python_named_argument_list_sempred((Python_named_argument_listContext)_localctx, predIndex);
		case 214:
			return python_identifier_expression_sempred((Python_identifier_expressionContext)_localctx, predIndex);
		case 218:
			return java_expression_sempred((Java_expressionContext)_localctx, predIndex);
		case 224:
			return java_arguments_sempred((Java_argumentsContext)_localctx, predIndex);
		case 227:
			return java_identifier_expression_sempred((Java_identifier_expressionContext)_localctx, predIndex);
		case 228:
			return java_class_identifier_expression_sempred((Java_class_identifier_expressionContext)_localctx, predIndex);
		case 232:
			return csharp_expression_sempred((Csharp_expressionContext)_localctx, predIndex);
		case 238:
			return csharp_arguments_sempred((Csharp_argumentsContext)_localctx, predIndex);
		case 241:
			return csharp_identifier_expression_sempred((Csharp_identifier_expressionContext)_localctx, predIndex);
		case 262:
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
			return precpred(_ctx, 31);
		case 3:
			return precpred(_ctx, 30);
		case 4:
			return precpred(_ctx, 29);
		case 5:
			return precpred(_ctx, 28);
		case 6:
			return precpred(_ctx, 27);
		case 7:
			return precpred(_ctx, 26);
		case 8:
			return precpred(_ctx, 24);
		case 9:
			return precpred(_ctx, 23);
		case 10:
			return precpred(_ctx, 22);
		case 11:
			return precpred(_ctx, 21);
		case 12:
			return precpred(_ctx, 18);
		case 13:
			return precpred(_ctx, 17);
		case 14:
			return precpred(_ctx, 16);
		case 15:
			return precpred(_ctx, 1);
		case 16:
			return precpred(_ctx, 32);
		case 17:
			return precpred(_ctx, 25);
		case 18:
			return precpred(_ctx, 20);
		case 19:
			return precpred(_ctx, 19);
		case 20:
			return precpred(_ctx, 9);
		}
		return true;
	}
	private boolean unresolved_expression_sempred(Unresolved_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 21:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean unresolved_selector_sempred(Unresolved_selectorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 22:
			return this.wasNot(EParser.WS);
		}
		return true;
	}
	private boolean invocation_trailer_sempred(Invocation_trailerContext _localctx, int predIndex) {
		switch (predIndex) {
		case 23:
			return this.afterWillBeIn(EParser.WS, EParser.RPAR, EParser.RBRAK, EParser.RCURL, EParser.LF, EParser.DEDENT);
		}
		return true;
	}
	private boolean instance_expression_sempred(Instance_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 24:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean instance_selector_sempred(Instance_selectorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 25:
			return this.wasNot(EParser.WS);
		case 26:
			return this.wasNot(EParser.WS);
		case 27:
			return this.wasNot(EParser.WS);
		case 28:
			return this.wasNot(EParser.WS);
		}
		return true;
	}
	private boolean mutable_instance_expression_sempred(Mutable_instance_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 29:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean argument_assignment_list_sempred(Argument_assignment_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 30:
			return this.was(EParser.WS);
		}
		return true;
	}
	private boolean with_argument_assignment_list_sempred(With_argument_assignment_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 31:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean child_instance_sempred(Child_instanceContext _localctx, int predIndex) {
		switch (predIndex) {
		case 32:
			return this.wasNot(EParser.WS);
		case 33:
			return this.wasNot(EParser.WS);
		}
		return true;
	}
	private boolean typedef_sempred(TypedefContext _localctx, int predIndex) {
		switch (predIndex) {
		case 34:
			return precpred(_ctx, 6);
		case 35:
			return precpred(_ctx, 5);
		case 36:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean nospace_hyphen_identifier_or_keyword_sempred(Nospace_hyphen_identifier_or_keywordContext _localctx, int predIndex) {
		switch (predIndex) {
		case 37:
			return this.wasNotWhiteSpace();
		}
		return true;
	}
	private boolean nospace_identifier_or_keyword_sempred(Nospace_identifier_or_keywordContext _localctx, int predIndex) {
		switch (predIndex) {
		case 38:
			return this.wasNotWhiteSpace();
		}
		return true;
	}
	private boolean any_type_sempred(Any_typeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 39:
			return precpred(_ctx, 2);
		case 40:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean assignable_instance_sempred(Assignable_instanceContext _localctx, int predIndex) {
		switch (predIndex) {
		case 41:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean is_expression_sempred(Is_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 42:
			return this.willBeAOrAn();
		}
		return true;
	}
	private boolean metadata_sempred(MetadataContext _localctx, int predIndex) {
		switch (predIndex) {
		case 43:
			return this.willBeText("metadata");
		}
		return true;
	}
	private boolean new_token_sempred(New_tokenContext _localctx, int predIndex) {
		switch (predIndex) {
		case 44:
			return this.isText(((New_tokenContext)_localctx).i1,"new");
		}
		return true;
	}
	private boolean key_token_sempred(Key_tokenContext _localctx, int predIndex) {
		switch (predIndex) {
		case 45:
			return this.isText(((Key_tokenContext)_localctx).i1,"key");
		}
		return true;
	}
	private boolean module_token_sempred(Module_tokenContext _localctx, int predIndex) {
		switch (predIndex) {
		case 46:
			return this.isText(((Module_tokenContext)_localctx).i1,"module");
		}
		return true;
	}
	private boolean value_token_sempred(Value_tokenContext _localctx, int predIndex) {
		switch (predIndex) {
		case 47:
			return this.isText(((Value_tokenContext)_localctx).i1,"value");
		}
		return true;
	}
	private boolean symbols_token_sempred(Symbols_tokenContext _localctx, int predIndex) {
		switch (predIndex) {
		case 48:
			return this.isText(((Symbols_tokenContext)_localctx).i1,"symbols");
		}
		return true;
	}
	private boolean javascript_expression_sempred(Javascript_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 49:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean javascript_arguments_sempred(Javascript_argumentsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 50:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean python_expression_sempred(Python_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 51:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean python_ordinal_argument_list_sempred(Python_ordinal_argument_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 52:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean python_named_argument_list_sempred(Python_named_argument_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 53:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean python_identifier_expression_sempred(Python_identifier_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 54:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean java_expression_sempred(Java_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 55:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean java_arguments_sempred(Java_argumentsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 56:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean java_identifier_expression_sempred(Java_identifier_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 57:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean java_class_identifier_expression_sempred(Java_class_identifier_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 58:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean csharp_expression_sempred(Csharp_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 59:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean csharp_arguments_sempred(Csharp_argumentsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 60:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean csharp_identifier_expression_sempred(Csharp_identifier_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 61:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean css_identifier_sempred(Css_identifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 62:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00bd\u0bdd\4\2\t"+
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
		"\4\u0108\t\u0108\4\u0109\t\u0109\4\u010a\t\u010a\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\5\2\u021b\n\2\3\2\3\2\3\2\3\2\3\2\5\2\u0222\n\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\5\5\u0240\n\5\3\6\3\6\3\6\3\6\5\6\u0246\n\6\3\6"+
		"\3\6\3\6\5\6\u024b\n\6\3\6\3\6\3\6\3\6\5\6\u0251\n\6\5\6\u0253\n\6\3\6"+
		"\5\6\u0256\n\6\3\7\3\7\3\7\3\7\3\7\5\7\u025d\n\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\5\7\u0266\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\5\t\u027f\n\t\3\t\3\t\5\t\u0283"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u028e\n\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\t\u0297\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\5\n\u02a6\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u02af\n\n\3\13"+
		"\3\13\3\13\3\13\3\13\5\13\u02b6\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5"+
		"\f\u02c0\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\5\16\u02d6\n\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\5\20\u02ed\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\5\21\u02fa\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u0305\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u0313\n\21\3\22\3\22\3\22\3\22\5\22\u0319\n\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0324\n\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0332\n\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24"+
		"\u0344\n\24\f\24\16\24\u0347\13\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\5\25\u0351\n\25\5\25\u0353\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\5\26\u035c\n\26\3\26\3\26\5\26\u0360\n\26\3\26\5\26\u0363\n\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u036c\n\27\3\27\3\27\5\27\u0370\n"+
		"\27\3\27\5\27\u0373\n\27\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u037b\n\30"+
		"\3\30\3\30\5\30\u037f\n\30\3\30\5\30\u0382\n\30\3\30\3\30\3\30\3\30\3"+
		"\30\5\30\u0389\n\30\3\30\3\30\3\31\3\31\3\31\3\31\5\31\u0391\n\31\3\31"+
		"\3\31\3\31\5\31\u0396\n\31\3\31\3\31\5\31\u039a\n\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u03b5\n\32\3\33\3\33\3\34"+
		"\3\34\3\34\5\34\u03bc\n\34\3\35\3\35\3\35\5\35\u03c1\n\35\3\35\3\35\5"+
		"\35\u03c5\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u03dc\n\36\3\37"+
		"\3\37\3 \3 \3 \3 \3 \5 \u03e5\n \3 \3 \5 \u03e9\n \3 \3 \3 \3 \3 \5 \u03f0"+
		"\n \3 \3 \3 \3 \3 \3 \5 \u03f8\n \3!\3!\5!\u03fc\n!\3!\5!\u03ff\n!\3!"+
		"\3!\3!\5!\u0404\n!\3!\3!\3!\3!\3!\5!\u040b\n!\3!\5!\u040e\n!\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\5$\u042f\n$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\5%\u0442\n%\3&\3&\3&\3&\3&\5&\u0449\n&\3&\3&\3&\3&\3"+
		"&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\5)\u046b\n)\3)\3)\3)\3)\3)\3)\3)\5)\u0474\n)\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\7*\u0489\n*\f"+
		"*\16*\u048c\13*\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u049b\n,\3,"+
		"\3,\3,\5,\u04a0\n,\3,\3,\3,\3,\3,\3,\5,\u04a8\n,\3,\3,\3,\3,\3,\3,\3,"+
		"\5,\u04b1\n,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-"+
		"\3-\3-\5-\u04c8\n-\3.\3.\3/\3/\5/\u04ce\n/\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\5\60\u04d8\n\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\5\60\u04f3\n\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\5\60\u0510\n\60\3\60\3\60\3\60\3\60\5\60\u0516"+
		"\n\60\3\60\3\60\3\60\3\60\5\60\u051c\n\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\5\60\u0536\n\60\3\60\3\60\3\60\3\60\5\60\u053c\n"+
		"\60\3\60\3\60\3\60\5\60\u0541\n\60\3\60\3\60\3\60\3\60\3\60\5\60\u0548"+
		"\n\60\3\60\3\60\3\60\3\60\3\60\7\60\u054f\n\60\f\60\16\60\u0552\13\60"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u055b\n\61\3\62\3\62\3\62\3\62"+
		"\3\62\7\62\u0562\n\62\f\62\16\62\u0565\13\62\3\63\3\63\3\63\3\63\3\64"+
		"\3\64\3\64\3\64\3\65\3\65\3\66\3\66\3\66\3\66\3\66\5\66\u0576\n\66\3\67"+
		"\3\67\3\67\3\67\3\67\7\67\u057d\n\67\f\67\16\67\u0580\13\67\38\38\38\3"+
		"8\38\38\38\38\38\38\38\38\38\38\38\38\58\u0592\n8\39\39\39\39\39\39\7"+
		"9\u059a\n9\f9\169\u059d\139\3:\3:\3:\5:\u05a2\n:\3;\3;\3;\3;\3<\3<\3<"+
		"\3<\5<\u05ac\n<\3<\3<\3<\5<\u05b1\n<\5<\u05b3\n<\3<\3<\3<\3<\5<\u05b9"+
		"\n<\5<\u05bb\n<\5<\u05bd\n<\3=\3=\3=\3=\3=\5=\u05c4\n=\3>\3>\3>\3>\3?"+
		"\3?\3?\5?\u05cd\n?\3?\3?\3?\3@\3@\3@\5@\u05d5\n@\3@\3@\3@\3@\5@\u05db"+
		"\n@\3@\3@\3@\5@\u05e0\n@\3@\3@\5@\u05e4\n@\3@\3@\3@\3@\3@\3@\3@\3@\3@"+
		"\5@\u05ef\n@\3@\3@\5@\u05f3\n@\3@\3@\5@\u05f7\n@\3@\3@\3@\5@\u05fc\n@"+
		"\5@\u05fe\n@\3A\3A\3A\5A\u0603\nA\3A\3A\3A\3A\5A\u0609\nA\3A\3A\3A\3A"+
		"\3A\5A\u0610\nA\3A\3A\5A\u0614\nA\3A\3A\3A\3A\3A\3A\3A\3A\3A\5A\u061f"+
		"\nA\3A\3A\5A\u0623\nA\3A\3A\5A\u0627\nA\3A\3A\3A\5A\u062c\nA\3A\5A\u062f"+
		"\nA\3B\3B\3B\7B\u0634\nB\fB\16B\u0637\13B\3B\3B\5B\u063b\nB\3C\3C\3C\3"+
		"C\3C\3C\3C\3C\3D\3D\3D\3D\3D\3D\3E\3E\5E\u064d\nE\3E\3E\3E\3E\3E\3E\5"+
		"E\u0655\nE\3F\3F\3F\3F\3F\5F\u065c\nF\5F\u065e\nF\3F\3F\3F\5F\u0663\n"+
		"F\5F\u0665\nF\3G\3G\3G\3G\3G\3G\3G\7G\u066e\nG\fG\16G\u0671\13G\3H\3H"+
		"\3H\5H\u0676\nH\3H\3H\3I\3I\3I\3I\3J\3J\3J\3J\3J\3J\3J\3J\5J\u0686\nJ"+
		"\3K\3K\3K\3K\3L\7L\u068d\nL\fL\16L\u0690\13L\3M\6M\u0693\nM\rM\16M\u0694"+
		"\3N\7N\u0698\nN\fN\16N\u069b\13N\3O\6O\u069e\nO\rO\16O\u069f\3O\3O\3P"+
		"\7P\u06a5\nP\fP\16P\u06a8\13P\3P\3P\3Q\3Q\3Q\3Q\3R\3R\3S\3S\3S\5S\u06b5"+
		"\nS\3T\3T\5T\u06b9\nT\3T\3T\3T\3U\3U\3U\3U\7U\u06c2\nU\fU\16U\u06c5\13"+
		"U\3V\3V\3V\7V\u06ca\nV\fV\16V\u06cd\13V\3V\3V\3V\7V\u06d2\nV\fV\16V\u06d5"+
		"\13V\3V\3V\3V\3V\3V\3V\5V\u06dd\nV\3W\3W\3W\3W\3W\3W\7W\u06e5\nW\fW\16"+
		"W\u06e8\13W\5W\u06ea\nW\3W\3W\5W\u06ee\nW\3X\3X\3Y\3Y\3Y\3Y\3Z\3Z\3[\3"+
		"[\5[\u06fa\n[\3\\\3\\\3]\3]\5]\u0700\n]\3^\3^\3^\3^\7^\u0706\n^\f^\16"+
		"^\u0709\13^\3_\3_\3_\3_\7_\u070f\n_\f_\16_\u0712\13_\3`\3`\3`\7`\u0717"+
		"\n`\f`\16`\u071a\13`\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\5a\u0726\na\3b\5b\u0729"+
		"\nb\3b\3b\5b\u072d\nb\3b\3b\3c\5c\u0732\nc\3c\3c\5c\u0736\nc\3c\3c\3d"+
		"\3d\3d\7d\u073d\nd\fd\16d\u0740\13d\3e\3e\3e\3e\3e\3e\3f\3f\3f\3f\3f\3"+
		"f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\5f\u0759\nf\3f\3f\3f\3f\3f\3f\3f\7"+
		"f\u0762\nf\ff\16f\u0765\13f\3g\3g\5g\u0769\ng\3h\3h\3h\3h\3h\3h\3h\3h"+
		"\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\5h\u077d\nh\3i\3i\3j\5j\u0782\nj\3j\3j"+
		"\3k\3k\3l\3l\3l\5l\u078b\nl\3m\3m\5m\u078f\nm\3n\3n\3n\7n\u0794\nn\fn"+
		"\16n\u0797\13n\3o\3o\5o\u079b\no\3p\3p\3p\3p\3q\3q\3q\3r\3r\3r\5r\u07a7"+
		"\nr\3s\3s\3t\3t\3u\3u\3v\3v\3w\3w\3x\3x\3y\3y\3y\7y\u07b8\ny\fy\16y\u07bb"+
		"\13y\3z\3z\5z\u07bf\nz\3z\5z\u07c2\nz\3{\3{\5{\u07c6\n{\3|\3|\3|\5|\u07cb"+
		"\n|\3}\3}\3}\3~\3~\5~\u07d2\n~\3\177\3\177\3\177\3\177\3\177\3\177\3\177"+
		"\3\177\3\177\7\177\u07dd\n\177\f\177\16\177\u07e0\13\177\3\u0080\3\u0080"+
		"\3\u0080\3\u0080\7\u0080\u07e6\n\u0080\f\u0080\16\u0080\u07e9\13\u0080"+
		"\3\u0081\3\u0081\3\u0081\7\u0081\u07ee\n\u0081\f\u0081\16\u0081\u07f1"+
		"\13\u0081\3\u0081\3\u0081\3\u0081\7\u0081\u07f6\n\u0081\f\u0081\16\u0081"+
		"\u07f9\13\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\5\u0081\u0800"+
		"\n\u0081\3\u0082\3\u0082\3\u0082\3\u0082\7\u0082\u0806\n\u0082\f\u0082"+
		"\16\u0082\u0809\13\u0082\3\u0083\3\u0083\3\u0083\7\u0083\u080e\n\u0083"+
		"\f\u0083\16\u0083\u0811\13\u0083\3\u0083\3\u0083\3\u0083\7\u0083\u0816"+
		"\n\u0083\f\u0083\16\u0083\u0819\13\u0083\3\u0083\3\u0083\3\u0083\5\u0083"+
		"\u081e\n\u0083\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084"+
		"\3\u0084\3\u0084\3\u0084\5\u0084\u082a\n\u0084\3\u0085\3\u0085\5\u0085"+
		"\u082e\n\u0085\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\7\u0086"+
		"\u0836\n\u0086\f\u0086\16\u0086\u0839\13\u0086\3\u0087\3\u0087\3\u0087"+
		"\7\u0087\u083e\n\u0087\f\u0087\16\u0087\u0841\13\u0087\3\u0087\5\u0087"+
		"\u0844\n\u0087\3\u0088\3\u0088\3\u0088\3\u0088\5\u0088\u084a\n\u0088\3"+
		"\u0088\3\u0088\3\u0088\7\u0088\u084f\n\u0088\f\u0088\16\u0088\u0852\13"+
		"\u0088\3\u0088\3\u0088\5\u0088\u0856\n\u0088\3\u0089\3\u0089\3\u0089\7"+
		"\u0089\u085b\n\u0089\f\u0089\16\u0089\u085e\13\u0089\3\u008a\3\u008a\3"+
		"\u008a\7\u008a\u0863\n\u008a\f\u008a\16\u008a\u0866\13\u008a\3\u008b\3"+
		"\u008b\3\u008b\3\u008b\5\u008b\u086c\n\u008b\3\u008c\3\u008c\3\u008d\3"+
		"\u008d\3\u008d\3\u008d\7\u008d\u0874\n\u008d\f\u008d\16\u008d\u0877\13"+
		"\u008d\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e"+
		"\3\u008e\3\u008e\5\u008e\u0883\n\u008e\3\u008f\3\u008f\5\u008f\u0887\n"+
		"\u008f\3\u008f\5\u008f\u088a\n\u008f\3\u0090\3\u0090\5\u0090\u088e\n\u0090"+
		"\3\u0090\5\u0090\u0891\n\u0090\3\u0091\3\u0091\3\u0091\3\u0091\7\u0091"+
		"\u0897\n\u0091\f\u0091\16\u0091\u089a\13\u0091\3\u0092\3\u0092\3\u0092"+
		"\3\u0092\7\u0092\u08a0\n\u0092\f\u0092\16\u0092\u08a3\13\u0092\3\u0093"+
		"\3\u0093\3\u0093\3\u0093\7\u0093\u08a9\n\u0093\f\u0093\16\u0093\u08ac"+
		"\13\u0093\3\u0094\3\u0094\3\u0094\3\u0094\7\u0094\u08b2\n\u0094\f\u0094"+
		"\16\u0094\u08b5\13\u0094\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\5\u0095"+
		"\u08c5\n\u0095\3\u0096\3\u0096\3\u0096\5\u0096\u08ca\n\u0096\3\u0096\3"+
		"\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\5\u0096\u08d3\n\u0096\3"+
		"\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096"+
		"\5\u0096\u08de\n\u0096\3\u0097\3\u0097\3\u0097\7\u0097\u08e3\n\u0097\f"+
		"\u0097\16\u0097\u08e6\13\u0097\3\u0098\3\u0098\3\u0099\3\u0099\3\u0099"+
		"\5\u0099\u08ed\n\u0099\3\u0099\3\u0099\3\u009a\3\u009a\3\u009a\3\u009a"+
		"\3\u009b\3\u009b\5\u009b\u08f7\n\u009b\3\u009c\3\u009c\3\u009c\3\u009c"+
		"\3\u009c\3\u009c\5\u009c\u08ff\n\u009c\3\u009d\5\u009d\u0902\n\u009d\3"+
		"\u009d\3\u009d\5\u009d\u0906\n\u009d\3\u009d\3\u009d\3\u009e\5\u009e\u090b"+
		"\n\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e"+
		"\5\u009e\u0915\n\u009e\3\u009f\3\u009f\5\u009f\u0919\n\u009f\3\u009f\3"+
		"\u009f\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\7\u00a0\u0922\n\u00a0\f"+
		"\u00a0\16\u00a0\u0925\13\u00a0\5\u00a0\u0927\n\u00a0\3\u00a1\3\u00a1\3"+
		"\u00a1\7\u00a1\u092c\n\u00a1\f\u00a1\16\u00a1\u092f\13\u00a1\3\u00a2\3"+
		"\u00a2\3\u00a2\3\u00a2\3\u00a3\3\u00a3\5\u00a3\u0937\n\u00a3\3\u00a4\3"+
		"\u00a4\3\u00a4\7\u00a4\u093c\n\u00a4\f\u00a4\16\u00a4\u093f\13\u00a4\3"+
		"\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a6\3\u00a6\5\u00a6\u0947\n\u00a6\3"+
		"\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7"+
		"\5\u00a7\u0952\n\u00a7\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a9\3\u00a9"+
		"\3\u00a9\3\u00a9\3\u00a9\7\u00a9\u095d\n\u00a9\f\u00a9\16\u00a9\u0960"+
		"\13\u00a9\3\u00aa\3\u00aa\3\u00aa\3\u00aa\5\u00aa\u0966\n\u00aa\3\u00ab"+
		"\3\u00ab\3\u00ab\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac"+
		"\3\u00ac\5\u00ac\u0973\n\u00ac\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad"+
		"\3\u00ae\3\u00ae\3\u00ae\5\u00ae\u097d\n\u00ae\3\u00ae\5\u00ae\u0980\n"+
		"\u00ae\3\u00af\3\u00af\5\u00af\u0984\n\u00af\3\u00b0\3\u00b0\3\u00b0\3"+
		"\u00b0\3\u00b0\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b2\3\u00b2"+
		"\3\u00b2\3\u00b2\3\u00b2\3\u00b3\3\u00b3\3\u00b3\7\u00b3\u0998\n\u00b3"+
		"\f\u00b3\16\u00b3\u099b\13\u00b3\3\u00b4\3\u00b4\3\u00b4\7\u00b4\u09a0"+
		"\n\u00b4\f\u00b4\16\u00b4\u09a3\13\u00b4\3\u00b4\5\u00b4\u09a6\n\u00b4"+
		"\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\5\u00b5\u09ae\n\u00b5"+
		"\3\u00b6\3\u00b6\3\u00b7\3\u00b7\3\u00b7\3\u00b8\3\u00b8\3\u00b8\3\u00b9"+
		"\3\u00b9\3\u00b9\3\u00ba\3\u00ba\3\u00ba\3\u00bb\3\u00bb\3\u00bb\3\u00bc"+
		"\3\u00bc\3\u00bd\3\u00bd\3\u00be\3\u00be\3\u00bf\3\u00bf\3\u00c0\3\u00c0"+
		"\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\5\u00c1\u09d2"+
		"\n\u00c1\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\7\u00c2\u09d9\n\u00c2"+
		"\f\u00c2\16\u00c2\u09dc\13\u00c2\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3"+
		"\3\u00c3\3\u00c3\5\u00c3\u09e5\n\u00c3\3\u00c4\3\u00c4\3\u00c5\3\u00c5"+
		"\3\u00c5\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u09f1\n\u00c6"+
		"\3\u00c7\3\u00c7\3\u00c7\5\u00c7\u09f6\n\u00c7\3\u00c7\3\u00c7\3\u00c8"+
		"\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\7\u00c8\u0a00\n\u00c8\f\u00c8"+
		"\16\u00c8\u0a03\13\u00c8\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\3\u00cb\3\u00cb\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc"+
		"\5\u00cc\u0a14\n\u00cc\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\5\u00cd"+
		"\u0a1b\n\u00cd\3\u00ce\3\u00ce\3\u00ce\5\u00ce\u0a20\n\u00ce\3\u00cf\3"+
		"\u00cf\3\u00cf\3\u00cf\3\u00cf\7\u00cf\u0a27\n\u00cf\f\u00cf\16\u00cf"+
		"\u0a2a\13\u00cf\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\5\u00d0\u0a31"+
		"\n\u00d0\3\u00d1\3\u00d1\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2"+
		"\5\u00d2\u0a3b\n\u00d2\3\u00d3\3\u00d3\3\u00d3\5\u00d3\u0a40\n\u00d3\3"+
		"\u00d3\3\u00d3\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\5\u00d4"+
		"\u0a4a\n\u00d4\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\7\u00d5"+
		"\u0a52\n\u00d5\f\u00d5\16\u00d5\u0a55\13\u00d5\3\u00d6\3\u00d6\3\u00d6"+
		"\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\7\u00d6"+
		"\u0a62\n\u00d6\f\u00d6\16\u00d6\u0a65\13\u00d6\3\u00d7\3\u00d7\3\u00d7"+
		"\3\u00d7\3\u00d8\3\u00d8\3\u00d8\5\u00d8\u0a6e\n\u00d8\3\u00d8\3\u00d8"+
		"\3\u00d8\7\u00d8\u0a73\n\u00d8\f\u00d8\16\u00d8\u0a76\13\u00d8\3\u00d9"+
		"\3\u00d9\3\u00d9\3\u00d9\3\u00d9\5\u00d9\u0a7d\n\u00d9\3\u00da\3\u00da"+
		"\3\u00da\3\u00da\3\u00da\5\u00da\u0a84\n\u00da\3\u00db\3\u00db\3\u00db"+
		"\3\u00db\3\u00db\3\u00db\3\u00db\5\u00db\u0a8d\n\u00db\3\u00dc\3\u00dc"+
		"\3\u00dc\3\u00dc\3\u00dc\7\u00dc\u0a94\n\u00dc\f\u00dc\16\u00dc\u0a97"+
		"\13\u00dc\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\5\u00dd\u0a9e\n\u00dd"+
		"\3\u00de\3\u00de\3\u00df\3\u00df\3\u00df\3\u00e0\3\u00e0\3\u00e0\5\u00e0"+
		"\u0aa8\n\u00e0\3\u00e1\3\u00e1\3\u00e1\5\u00e1\u0aad\n\u00e1\3\u00e1\3"+
		"\u00e1\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\7\u00e2\u0ab7\n"+
		"\u00e2\f\u00e2\16\u00e2\u0aba\13\u00e2\3\u00e3\3\u00e3\3\u00e3\3\u00e3"+
		"\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5"+
		"\3\u00e5\7\u00e5\u0aca\n\u00e5\f\u00e5\16\u00e5\u0acd\13\u00e5\3\u00e6"+
		"\3\u00e6\3\u00e6\3\u00e6\3\u00e6\7\u00e6\u0ad4\n\u00e6\f\u00e6\16\u00e6"+
		"\u0ad7\13\u00e6\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\5\u00e7\u0ade"+
		"\n\u00e7\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8\5\u00e8\u0ae5\n\u00e8"+
		"\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9\5\u00e9\u0aee"+
		"\n\u00e9\3\u00ea\3\u00ea\3\u00ea\3\u00ea\3\u00ea\7\u00ea\u0af5\n\u00ea"+
		"\f\u00ea\16\u00ea\u0af8\13\u00ea\3\u00eb\3\u00eb\3\u00eb\3\u00eb\3\u00eb"+
		"\5\u00eb\u0aff\n\u00eb\3\u00ec\3\u00ec\3\u00ed\3\u00ed\3\u00ed\3\u00ee"+
		"\3\u00ee\3\u00ee\5\u00ee\u0b09\n\u00ee\3\u00ef\3\u00ef\3\u00ef\5\u00ef"+
		"\u0b0e\n\u00ef\3\u00ef\3\u00ef\3\u00f0\3\u00f0\3\u00f0\3\u00f0\3\u00f0"+
		"\3\u00f0\7\u00f0\u0b18\n\u00f0\f\u00f0\16\u00f0\u0b1b\13\u00f0\3\u00f1"+
		"\3\u00f1\3\u00f1\3\u00f1\3\u00f2\3\u00f2\3\u00f2\3\u00f2\3\u00f3\3\u00f3"+
		"\3\u00f3\5\u00f3\u0b28\n\u00f3\3\u00f3\3\u00f3\3\u00f3\7\u00f3\u0b2d\n"+
		"\u00f3\f\u00f3\16\u00f3\u0b30\13\u00f3\3\u00f4\3\u00f4\3\u00f4\3\u00f4"+
		"\3\u00f4\5\u00f4\u0b37\n\u00f4\3\u00f5\3\u00f5\3\u00f5\3\u00f5\3\u00f5"+
		"\5\u00f5\u0b3e\n\u00f5\3\u00f6\3\u00f6\5\u00f6\u0b42\n\u00f6\3\u00f7\3"+
		"\u00f7\3\u00f7\5\u00f7\u0b47\n\u00f7\3\u00f7\3\u00f7\5\u00f7\u0b4b\n\u00f7"+
		"\3\u00f8\3\u00f8\3\u00f8\5\u00f8\u0b50\n\u00f8\3\u00f8\3\u00f8\3\u00f8"+
		"\3\u00f9\3\u00f9\3\u00f9\5\u00f9\u0b58\n\u00f9\3\u00fa\3\u00fa\3\u00fa"+
		"\3\u00fa\3\u00fb\3\u00fb\3\u00fb\3\u00fb\7\u00fb\u0b62\n\u00fb\f\u00fb"+
		"\16\u00fb\u0b65\13\u00fb\3\u00fb\3\u00fb\3\u00fb\3\u00fc\3\u00fc\3\u00fc"+
		"\3\u00fc\7\u00fc\u0b6e\n\u00fc\f\u00fc\16\u00fc\u0b71\13\u00fc\3\u00fc"+
		"\3\u00fc\3\u00fd\3\u00fd\3\u00fd\3\u00fd\3\u00fd\3\u00fe\3\u00fe\3\u00fe"+
		"\7\u00fe\u0b7d\n\u00fe\f\u00fe\16\u00fe\u0b80\13\u00fe\3\u00ff\3\u00ff"+
		"\7\u00ff\u0b84\n\u00ff\f\u00ff\16\u00ff\u0b87\13\u00ff\3\u0100\3\u0100"+
		"\3\u0100\5\u0100\u0b8c\n\u0100\3\u0100\3\u0100\3\u0101\3\u0101\3\u0101"+
		"\5\u0101\u0b93\n\u0101\3\u0101\5\u0101\u0b96\n\u0101\3\u0102\6\u0102\u0b99"+
		"\n\u0102\r\u0102\16\u0102\u0b9a\3\u0103\3\u0103\3\u0103\3\u0103\5\u0103"+
		"\u0ba1\n\u0103\3\u0103\5\u0103\u0ba4\n\u0103\3\u0104\6\u0104\u0ba7\n\u0104"+
		"\r\u0104\16\u0104\u0ba8\3\u0105\3\u0105\5\u0105\u0bad\n\u0105\3\u0106"+
		"\3\u0106\6\u0106\u0bb1\n\u0106\r\u0106\16\u0106\u0bb2\3\u0106\3\u0106"+
		"\3\u0107\3\u0107\3\u0107\6\u0107\u0bba\n\u0107\r\u0107\16\u0107\u0bbb"+
		"\3\u0107\3\u0107\3\u0108\3\u0108\3\u0108\3\u0108\5\u0108\u0bc4\n\u0108"+
		"\3\u0108\3\u0108\6\u0108\u0bc8\n\u0108\r\u0108\16\u0108\u0bc9\7\u0108"+
		"\u0bcc\n\u0108\f\u0108\16\u0108\u0bcf\13\u0108\3\u0109\3\u0109\3\u0109"+
		"\3\u0109\3\u0109\5\u0109\u0bd6\n\u0109\3\u010a\6\u010a\u0bd9\n\u010a\r"+
		"\u010a\16\u010a\u0bda\3\u010a\2\32&R^blp\u008c\u00ca\u00fc\u0150\u0182"+
		"\u018e\u019c\u01a8\u01aa\u01ae\u01b6\u01c2\u01c8\u01ca\u01d2\u01de\u01e4"+
		"\u020e\u010b\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0"+
		"\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8"+
		"\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0"+
		"\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8"+
		"\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100"+
		"\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118"+
		"\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130"+
		"\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148"+
		"\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160"+
		"\u0162\u0164\u0166\u0168\u016a\u016c\u016e\u0170\u0172\u0174\u0176\u0178"+
		"\u017a\u017c\u017e\u0180\u0182\u0184\u0186\u0188\u018a\u018c\u018e\u0190"+
		"\u0192\u0194\u0196\u0198\u019a\u019c\u019e\u01a0\u01a2\u01a4\u01a6\u01a8"+
		"\u01aa\u01ac\u01ae\u01b0\u01b2\u01b4\u01b6\u01b8\u01ba\u01bc\u01be\u01c0"+
		"\u01c2\u01c4\u01c6\u01c8\u01ca\u01cc\u01ce\u01d0\u01d2\u01d4\u01d6\u01d8"+
		"\u01da\u01dc\u01de\u01e0\u01e2\u01e4\u01e6\u01e8\u01ea\u01ec\u01ee\u01f0"+
		"\u01f2\u01f4\u01f6\u01f8\u01fa\u01fc\u01fe\u0200\u0202\u0204\u0206\u0208"+
		"\u020a\u020c\u020e\u0210\u0212\2\21\3\2\"#\3\2),\5\2--//\63\63\4\2\3\3"+
		"\7\t\5\2tt\u0095\u0095\u00af\u00af\7\2\\\\\u0080\u0080\u0090\u0090\u0098"+
		"\u0098\u00af\u00af\3\2\u00ae\u00af\5\2\\\\\u0090\u0090\u00af\u00af\5\2"+
		"\u0090\u0090\u0098\u0098\u00af\u00af\4\2\u0094\u0094\u009e\u009e\4\2S"+
		"Scc\n\2\13\20\67\679ACKMwyy{\u009c\u009e\u00a8\4\2\'\'\177\177\5\2\32"+
		"\33))++\4\2\22\22\32\33\2\u0ca3\2\u0214\3\2\2\2\4\u0229\3\2\2\2\6\u0235"+
		"\3\2\2\2\b\u023b\3\2\2\2\n\u0241\3\2\2\2\f\u0257\3\2\2\2\16\u0267\3\2"+
		"\2\2\20\u027a\3\2\2\2\22\u0298\3\2\2\2\24\u02b5\3\2\2\2\26\u02b7\3\2\2"+
		"\2\30\u02c7\3\2\2\2\32\u02d1\3\2\2\2\34\u02de\3\2\2\2\36\u02e8\3\2\2\2"+
		" \u02f5\3\2\2\2\"\u0314\3\2\2\2$\u0333\3\2\2\2&\u033c\3\2\2\2(\u0352\3"+
		"\2\2\2*\u0354\3\2\2\2,\u0364\3\2\2\2.\u0374\3\2\2\2\60\u038c\3\2\2\2\62"+
		"\u03a1\3\2\2\2\64\u03b6\3\2\2\2\66\u03b8\3\2\2\28\u03bd\3\2\2\2:\u03db"+
		"\3\2\2\2<\u03dd\3\2\2\2>\u03e8\3\2\2\2@\u040d\3\2\2\2B\u040f\3\2\2\2D"+
		"\u0418\3\2\2\2F\u0421\3\2\2\2H\u0441\3\2\2\2J\u0443\3\2\2\2L\u0451\3\2"+
		"\2\2N\u045a\3\2\2\2P\u0461\3\2\2\2R\u0475\3\2\2\2T\u048d\3\2\2\2V\u0490"+
		"\3\2\2\2X\u04c7\3\2\2\2Z\u04c9\3\2\2\2\\\u04cb\3\2\2\2^\u04f2\3\2\2\2"+
		"`\u055a\3\2\2\2b\u055c\3\2\2\2d\u0566\3\2\2\2f\u056a\3\2\2\2h\u056e\3"+
		"\2\2\2j\u0575\3\2\2\2l\u0577\3\2\2\2n\u0591\3\2\2\2p\u0593\3\2\2\2r\u059e"+
		"\3\2\2\2t\u05a3\3\2\2\2v\u05bc\3\2\2\2x\u05be\3\2\2\2z\u05c5\3\2\2\2|"+
		"\u05c9\3\2\2\2~\u05fd\3\2\2\2\u0080\u062e\3\2\2\2\u0082\u0630\3\2\2\2"+
		"\u0084\u063c\3\2\2\2\u0086\u0644\3\2\2\2\u0088\u064a\3\2\2\2\u008a\u0664"+
		"\3\2\2\2\u008c\u0666\3\2\2\2\u008e\u0675\3\2\2\2\u0090\u0679\3\2\2\2\u0092"+
		"\u0685\3\2\2\2\u0094\u0687\3\2\2\2\u0096\u068e\3\2\2\2\u0098\u0692\3\2"+
		"\2\2\u009a\u0699\3\2\2\2\u009c\u069d\3\2\2\2\u009e\u06a6\3\2\2\2\u00a0"+
		"\u06ab\3\2\2\2\u00a2\u06af\3\2\2\2\u00a4\u06b4\3\2\2\2\u00a6\u06b6\3\2"+
		"\2\2\u00a8\u06bd\3\2\2\2\u00aa\u06cb\3\2\2\2\u00ac\u06de\3\2\2\2\u00ae"+
		"\u06ef\3\2\2\2\u00b0\u06f1\3\2\2\2\u00b2\u06f5\3\2\2\2\u00b4\u06f9\3\2"+
		"\2\2\u00b6\u06fb\3\2\2\2\u00b8\u06ff\3\2\2\2\u00ba\u0701\3\2\2\2\u00bc"+
		"\u070a\3\2\2\2\u00be\u0713\3\2\2\2\u00c0\u0725\3\2\2\2\u00c2\u0728\3\2"+
		"\2\2\u00c4\u0731\3\2\2\2\u00c6\u0739\3\2\2\2\u00c8\u0741\3\2\2\2\u00ca"+
		"\u0758\3\2\2\2\u00cc\u0768\3\2\2\2\u00ce\u077c\3\2\2\2\u00d0\u077e\3\2"+
		"\2\2\u00d2\u0781\3\2\2\2\u00d4\u0785\3\2\2\2\u00d6\u078a\3\2\2\2\u00d8"+
		"\u078e\3\2\2\2\u00da\u0790\3\2\2\2\u00dc\u079a\3\2\2\2\u00de\u079c\3\2"+
		"\2\2\u00e0\u07a0\3\2\2\2\u00e2\u07a6\3\2\2\2\u00e4\u07a8\3\2\2\2\u00e6"+
		"\u07aa\3\2\2\2\u00e8\u07ac\3\2\2\2\u00ea\u07ae\3\2\2\2\u00ec\u07b0\3\2"+
		"\2\2\u00ee\u07b2\3\2\2\2\u00f0\u07b4\3\2\2\2\u00f2\u07c1\3\2\2\2\u00f4"+
		"\u07c5\3\2\2\2\u00f6\u07c7\3\2\2\2\u00f8\u07cc\3\2\2\2\u00fa\u07d1\3\2"+
		"\2\2\u00fc\u07d3\3\2\2\2\u00fe\u07e1\3\2\2\2\u0100\u07ef\3\2\2\2\u0102"+
		"\u0801\3\2\2\2\u0104\u080f\3\2\2\2\u0106\u0829\3\2\2\2\u0108\u082b\3\2"+
		"\2\2\u010a\u082f\3\2\2\2\u010c\u083a\3\2\2\2\u010e\u0845\3\2\2\2\u0110"+
		"\u0857\3\2\2\2\u0112\u085f\3\2\2\2\u0114\u086b\3\2\2\2\u0116\u086d\3\2"+
		"\2\2\u0118\u086f\3\2\2\2\u011a\u0882\3\2\2\2\u011c\u0884\3\2\2\2\u011e"+
		"\u088b\3\2\2\2\u0120\u0892\3\2\2\2\u0122\u089b\3\2\2\2\u0124\u08a4\3\2"+
		"\2\2\u0126\u08ad\3\2\2\2\u0128\u08c4\3\2\2\2\u012a\u08dd\3\2\2\2\u012c"+
		"\u08df\3\2\2\2\u012e\u08e7\3\2\2\2\u0130\u08ec\3\2\2\2\u0132\u08f0\3\2"+
		"\2\2\u0134\u08f6\3\2\2\2\u0136\u08fe\3\2\2\2\u0138\u0901\3\2\2\2\u013a"+
		"\u090a\3\2\2\2\u013c\u0916\3\2\2\2\u013e\u091c\3\2\2\2\u0140\u0928\3\2"+
		"\2\2\u0142\u0930\3\2\2\2\u0144\u0936\3\2\2\2\u0146\u0938\3\2\2\2\u0148"+
		"\u0940\3\2\2\2\u014a\u0946\3\2\2\2\u014c\u0951\3\2\2\2\u014e\u0953\3\2"+
		"\2\2\u0150\u0957\3\2\2\2\u0152\u0965\3\2\2\2\u0154\u0967\3\2\2\2\u0156"+
		"\u0972\3\2\2\2\u0158\u0974\3\2\2\2\u015a\u097f\3\2\2\2\u015c\u0983\3\2"+
		"\2\2\u015e\u0985\3\2\2\2\u0160\u098a\3\2\2\2\u0162\u098f\3\2\2\2\u0164"+
		"\u0994\3\2\2\2\u0166\u099c\3\2\2\2\u0168\u09ad\3\2\2\2\u016a\u09af\3\2"+
		"\2\2\u016c\u09b1\3\2\2\2\u016e\u09b4\3\2\2\2\u0170\u09b7\3\2\2\2\u0172"+
		"\u09ba\3\2\2\2\u0174\u09bd\3\2\2\2\u0176\u09c0\3\2\2\2\u0178\u09c2\3\2"+
		"\2\2\u017a\u09c4\3\2\2\2\u017c\u09c6\3\2\2\2\u017e\u09c8\3\2\2\2\u0180"+
		"\u09d1\3\2\2\2\u0182\u09d3\3\2\2\2\u0184\u09e4\3\2\2\2\u0186\u09e6\3\2"+
		"\2\2\u0188\u09e8\3\2\2\2\u018a\u09f0\3\2\2\2\u018c\u09f2\3\2\2\2\u018e"+
		"\u09f9\3\2\2\2\u0190\u0a04\3\2\2\2\u0192\u0a08\3\2\2\2\u0194\u0a0c\3\2"+
		"\2\2\u0196\u0a13\3\2\2\2\u0198\u0a1a\3\2\2\2\u019a\u0a1f\3\2\2\2\u019c"+
		"\u0a21\3\2\2\2\u019e\u0a30\3\2\2\2\u01a0\u0a32\3\2\2\2\u01a2\u0a3a\3\2"+
		"\2\2\u01a4\u0a3c\3\2\2\2\u01a6\u0a49\3\2\2\2\u01a8\u0a4b\3\2\2\2\u01aa"+
		"\u0a56\3\2\2\2\u01ac\u0a66\3\2\2\2\u01ae\u0a6d\3\2\2\2\u01b0\u0a7c\3\2"+
		"\2\2\u01b2\u0a83\3\2\2\2\u01b4\u0a8c\3\2\2\2\u01b6\u0a8e\3\2\2\2\u01b8"+
		"\u0a9d\3\2\2\2\u01ba\u0a9f\3\2\2\2\u01bc\u0aa1\3\2\2\2\u01be\u0aa7\3\2"+
		"\2\2\u01c0\u0aa9\3\2\2\2\u01c2\u0ab0\3\2\2\2\u01c4\u0abb\3\2\2\2\u01c6"+
		"\u0abf\3\2\2\2\u01c8\u0ac3\3\2\2\2\u01ca\u0ace\3\2\2\2\u01cc\u0add\3\2"+
		"\2\2\u01ce\u0ae4\3\2\2\2\u01d0\u0aed\3\2\2\2\u01d2\u0aef\3\2\2\2\u01d4"+
		"\u0afe\3\2\2\2\u01d6\u0b00\3\2\2\2\u01d8\u0b02\3\2\2\2\u01da\u0b08\3\2"+
		"\2\2\u01dc\u0b0a\3\2\2\2\u01de\u0b11\3\2\2\2\u01e0\u0b1c\3\2\2\2\u01e2"+
		"\u0b20\3\2\2\2\u01e4\u0b27\3\2\2\2\u01e6\u0b36\3\2\2\2\u01e8\u0b3d\3\2"+
		"\2\2\u01ea\u0b41\3\2\2\2\u01ec\u0b4a\3\2\2\2\u01ee\u0b4c\3\2\2\2\u01f0"+
		"\u0b57\3\2\2\2\u01f2\u0b59\3\2\2\2\u01f4\u0b5d\3\2\2\2\u01f6\u0b69\3\2"+
		"\2\2\u01f8\u0b74\3\2\2\2\u01fa\u0b79\3\2\2\2\u01fc\u0b81\3\2\2\2\u01fe"+
		"\u0b88\3\2\2\2\u0200\u0b95\3\2\2\2\u0202\u0b98\3\2\2\2\u0204\u0ba3\3\2"+
		"\2\2\u0206\u0ba6\3\2\2\2\u0208\u0bac\3\2\2\2\u020a\u0bae\3\2\2\2\u020c"+
		"\u0bb6\3\2\2\2\u020e\u0bc3\3\2\2\2\u0210\u0bd5\3\2\2\2\u0212\u0bd8\3\2"+
		"\2\2\u0214\u0215\7a\2\2\u0215\u0216\5\u00ecw\2\u0216\u0217\7R\2\2\u0217"+
		"\u021a\7i\2\2\u0218\u021b\7\\\2\2\u0219\u021b\5\u00ecw\2\u021a\u0218\3"+
		"\2\2\2\u021a\u0219\3\2\2\2\u021b\u0221\3\2\2\2\u021c\u021d\5(\25\2\u021d"+
		"\u021e\7\23\2\2\u021e\u021f\7P\2\2\u021f\u0222\3\2\2\2\u0220\u0222\7\u00a4"+
		"\2\2\u0221\u021c\3\2\2\2\u0221\u0220\3\2\2\2\u0222\u0223\3\2\2\2\u0223"+
		"\u0224\5\u0174\u00bb\2\u0224\u0225\7\21\2\2\u0225\u0226\5\u009cO\2\u0226"+
		"\u0227\5\u00bc_\2\u0227\u0228\5\u009eP\2\u0228\3\3\2\2\2\u0229\u022a\7"+
		"a\2\2\u022a\u022b\5\u00ecw\2\u022b\u022c\7R\2\2\u022c\u022d\7i\2\2\u022d"+
		"\u022e\5\u00ceh\2\u022e\u022f\7\u00a4\2\2\u022f\u0230\5\u0174\u00bb\2"+
		"\u0230\u0231\7\21\2\2\u0231\u0232\5\u009cO\2\u0232\u0233\5\u00ba^\2\u0233"+
		"\u0234\5\u009eP\2\u0234\5\3\2\2\2\u0235\u0236\5\u00eex\2\u0236\u0237\7"+
		"\u00a4\2\2\u0237\u0238\5^\60\2\u0238\u0239\7R\2\2\u0239\u023a\5\u0172"+
		"\u00ba\2\u023a\7\3\2\2\2\u023b\u023c\5\u00eex\2\u023c\u023f\5\u008cG\2"+
		"\u023d\u023e\7P\2\2\u023e\u0240\5\u008eH\2\u023f\u023d\3\2\2\2\u023f\u0240"+
		"\3\2\2\2\u0240\t\3\2\2\2\u0241\u0242\7a\2\2\u0242\u0243\5\u00eav\2\u0243"+
		"\u0245\7R\2\2\u0244\u0246\7\u0098\2\2\u0245\u0244\3\2\2\2\u0245\u0246"+
		"\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u0248\5\u00caf\2\u0248\u024a\7U\2\2"+
		"\u0249\u024b\5\u00c0a\2\u024a\u0249\3\2\2\2\u024a\u024b\3\2\2\2\u024b"+
		"\u0255\3\2\2\2\u024c\u0252\7\u00a4\2\2\u024d\u0250\5\u0110\u0089\2\u024e"+
		"\u024f\7P\2\2\u024f\u0251\5\u00e8u\2\u0250\u024e\3\2\2\2\u0250\u0251\3"+
		"\2\2\2\u0251\u0253\3\2\2\2\u0252\u024d\3\2\2\2\u0252\u0253\3\2\2\2\u0253"+
		"\u0254\3\2\2\2\u0254\u0256\7y\2\2\u0255\u024c\3\2\2\2\u0255\u0256\3\2"+
		"\2\2\u0256\13\3\2\2\2\u0257\u0258\7a\2\2\u0258\u0259\5\u00ecw\2\u0259"+
		"\u025c\7R\2\2\u025a\u025d\7\u00a3\2\2\u025b\u025d\5\u00ecw\2\u025c\u025a"+
		"\3\2\2\2\u025c\u025b\3\2\2\2\u025d\u0265\3\2\2\2\u025e\u025f\7\u00a4\2"+
		"\2\u025f\u0260\7~\2\2\u0260\u0261\7\21\2\2\u0261\u0262\5\u009cO\2\u0262"+
		"\u0263\5\u00fe\u0080\2\u0263\u0264\5\u009eP\2\u0264\u0266\3\2\2\2\u0265"+
		"\u025e\3\2\2\2\u0265\u0266\3\2\2\2\u0266\r\3\2\2\2\u0267\u0268\7a\2\2"+
		"\u0268\u0269\5\u00ecw\2\u0269\u026a\7R\2\2\u026a\u026b\7\u0081\2\2\u026b"+
		"\u026c\7\u00a3\2\2\u026c\u026d\7\u00a4\2\2\u026d\u026e\7W\2\2\u026e\u026f"+
		"\7\21\2\2\u026f\u0270\5\u009cO\2\u0270\u0271\5$\23\2\u0271\u0272\5\u009e"+
		"P\2\u0272\u0273\5\u0098M\2\u0273\u0274\7P\2\2\u0274\u0275\7~\2\2\u0275"+
		"\u0276\7\21\2\2\u0276\u0277\5\u009cO\2\u0277\u0278\5\u0102\u0082\2\u0278"+
		"\u0279\5\u009eP\2\u0279\17\3\2\2\2\u027a\u027b\7a\2\2\u027b\u027c\5\u00ec"+
		"w\2\u027c\u027e\7R\2\2\u027d\u027f\7\u0098\2\2\u027e\u027d\3\2\2\2\u027e"+
		"\u027f\3\2\2\2\u027f\u0282\3\2\2\2\u0280\u0283\7\\\2\2\u0281\u0283\5\24"+
		"\13\2\u0282\u0280\3\2\2\2\u0282\u0281\3\2\2\2\u0283\u0296\3\2\2\2\u0284"+
		"\u028d\5(\25\2\u0285\u0286\7\23\2\2\u0286\u0287\7P\2\2\u0287\u0288\7~"+
		"\2\2\u0288\u0289\7\21\2\2\u0289\u028a\5\u009cO\2\u028a\u028b\5\u00fe\u0080"+
		"\2\u028b\u028c\5\u009eP\2\u028c\u028e\3\2\2\2\u028d\u0285\3\2\2\2\u028d"+
		"\u028e\3\2\2\2\u028e\u0297\3\2\2\2\u028f\u0290\7\u00a4\2\2\u0290\u0291"+
		"\7~\2\2\u0291\u0292\7\21\2\2\u0292\u0293\5\u009cO\2\u0293\u0294\5\u00fe"+
		"\u0080\2\u0294\u0295\5\u009eP\2\u0295\u0297\3\2\2\2\u0296\u0284\3\2\2"+
		"\2\u0296\u028f\3\2\2\2\u0296\u0297\3\2\2\2\u0297\21\3\2\2\2\u0298\u0299"+
		"\7a\2\2\u0299\u029a\5\u00ecw\2\u029a\u029b\7R\2\2\u029b\u02ae\7\u0096"+
		"\2\2\u029c\u02a5\5(\25\2\u029d\u029e\7\23\2\2\u029e\u029f\7P\2\2\u029f"+
		"\u02a0\7~\2\2\u02a0\u02a1\7\21\2\2\u02a1\u02a2\5\u009cO\2\u02a2\u02a3"+
		"\5\u00fe\u0080\2\u02a3\u02a4\5\u009eP\2\u02a4\u02a6\3\2\2\2\u02a5\u029d"+
		"\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u02af\3\2\2\2\u02a7\u02a8\7\u00a4\2"+
		"\2\u02a8\u02a9\7~\2\2\u02a9\u02aa\7\21\2\2\u02aa\u02ab\5\u009cO\2\u02ab"+
		"\u02ac\5\u00fe\u0080\2\u02ac\u02ad\5\u009eP\2\u02ad\u02af\3\2\2\2\u02ae"+
		"\u029c\3\2\2\2\u02ae\u02a7\3\2\2\2\u02ae\u02af\3\2\2\2\u02af\23\3\2\2"+
		"\2\u02b0\u02b6\5\u00dan\2\u02b1\u02b2\5\u00dan\2\u02b2\u02b3\7P\2\2\u02b3"+
		"\u02b4\5\u00ecw\2\u02b4\u02b6\3\2\2\2\u02b5\u02b0\3\2\2\2\u02b5\u02b1"+
		"\3\2\2\2\u02b6\25\3\2\2\2\u02b7\u02b8\7a\2\2\u02b8\u02b9\5\u0168\u00b5"+
		"\2\u02b9\u02ba\7R\2\2\u02ba\u02bb\7\u0088\2\2\u02bb\u02bc\7\u008f\2\2"+
		"\u02bc\u02bf\5\u00f4{\2\u02bd\u02be\7\u0092\2\2\u02be\u02c0\5\u00caf\2"+
		"\u02bf\u02bd\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1\u02c2"+
		"\7e\2\2\u02c2\u02c3\7\21\2\2\u02c3\u02c4\5\u009cO\2\u02c4\u02c5\5\u0120"+
		"\u0091\2\u02c5\u02c6\5\u009eP\2\u02c6\27\3\2\2\2\u02c7\u02c8\7a\2\2\u02c8"+
		"\u02c9\5\u00e8u\2\u02c9\u02ca\7R\2\2\u02ca\u02cb\7\u0095\2\2\u02cb\u02cc"+
		"\7e\2\2\u02cc\u02cd\7\21\2\2\u02cd\u02ce\5\u009cO\2\u02ce\u02cf\5\u0120"+
		"\u0091\2\u02cf\u02d0\5\u009eP\2\u02d0\31\3\2\2\2\u02d1\u02d2\7a\2\2\u02d2"+
		"\u02d3\5\u00e8u\2\u02d3\u02d5\7R\2\2\u02d4\u02d6\7\u0081\2\2\u02d5\u02d4"+
		"\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7\u02d8\7\u0095\2"+
		"\2\u02d8\u02d9\7e\2\2\u02d9\u02da\7\21\2\2\u02da\u02db\5\u009cO\2\u02db"+
		"\u02dc\5\u0118\u008d\2\u02dc\u02dd\5\u009eP\2\u02dd\33\3\2\2\2\u02de\u02df"+
		"\7a\2\2\u02df\u02e0\5\u00e8u\2\u02e0\u02e1\7R\2\2\u02e1\u02e2\7t\2\2\u02e2"+
		"\u02e3\7e\2\2\u02e3\u02e4\7\21\2\2\u02e4\u02e5\5\u009cO\2\u02e5\u02e6"+
		"\5\u0120\u0091\2\u02e6\u02e7\5\u009eP\2\u02e7\35\3\2\2\2\u02e8\u02e9\7"+
		"a\2\2\u02e9\u02ea\5\u00e8u\2\u02ea\u02ec\7R\2\2\u02eb\u02ed\7\u0081\2"+
		"\2\u02ec\u02eb\3\2\2\2\u02ec\u02ed\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02ef"+
		"\7t\2\2\u02ef\u02f0\7e\2\2\u02f0\u02f1\7\21\2\2\u02f1\u02f2\5\u009cO\2"+
		"\u02f2\u02f3\5\u0118\u008d\2\u02f3\u02f4\5\u009eP\2\u02f4\37\3\2\2\2\u02f5"+
		"\u02f6\7a\2\2\u02f6\u02f7\5\u00ecw\2\u02f7\u02f9\7R\2\2\u02f8\u02fa\7"+
		"\u0098\2\2\u02f9\u02f8\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa\u02fb\3\2\2\2"+
		"\u02fb\u02fc\7\u0081\2\2\u02fc\u0304\7\\\2\2\u02fd\u02fe\5(\25\2\u02fe"+
		"\u02ff\7\23\2\2\u02ff\u0300\7P\2\2\u0300\u0301\7W\2\2\u0301\u0305\3\2"+
		"\2\2\u0302\u0303\7\u00a4\2\2\u0303\u0305\7W\2\2\u0304\u02fd\3\2\2\2\u0304"+
		"\u0302\3\2\2\2\u0305\u0306\3\2\2\2\u0306\u0307\7\21\2\2\u0307\u0308\5"+
		"\u009cO\2\u0308\u0309\5$\23\2\u0309\u0312\5\u009eP\2\u030a\u030b\5\u0098"+
		"M\2\u030b\u030c\7P\2\2\u030c\u030d\7~\2\2\u030d\u030e\7\21\2\2\u030e\u030f"+
		"\5\u009cO\2\u030f\u0310\5\u0102\u0082\2\u0310\u0311\5\u009eP\2\u0311\u0313"+
		"\3\2\2\2\u0312\u030a\3\2\2\2\u0312\u0313\3\2\2\2\u0313!\3\2\2\2\u0314"+
		"\u0315\7a\2\2\u0315\u0316\5\u00ecw\2\u0316\u0318\7R\2\2\u0317\u0319\7"+
		"\u0098\2\2\u0318\u0317\3\2\2\2\u0318\u0319\3\2\2\2\u0319\u031a\3\2\2\2"+
		"\u031a\u031b\7\u0081\2\2\u031b\u0323\7\u0090\2\2\u031c\u031d\5(\25\2\u031d"+
		"\u031e\7\23\2\2\u031e\u031f\7P\2\2\u031f\u0320\7W\2\2\u0320\u0324\3\2"+
		"\2\2\u0321\u0322\7\u00a4\2\2\u0322\u0324\7W\2\2\u0323\u031c\3\2\2\2\u0323"+
		"\u0321\3\2\2\2\u0324\u0325\3\2\2\2\u0325\u0326\7\21\2\2\u0326\u0327\5"+
		"\u009cO\2\u0327\u0328\5$\23\2\u0328\u0331\5\u009eP\2\u0329\u032a\5\u0098"+
		"M\2\u032a\u032b\7P\2\2\u032b\u032c\7~\2\2\u032c\u032d\7\21\2\2\u032d\u032e"+
		"\5\u009cO\2\u032e\u032f\5\u0102\u0082\2\u032f\u0330\5\u009eP\2\u0330\u0332"+
		"\3\2\2\2\u0331\u0329\3\2\2\2\u0331\u0332\3\2\2\2\u0332#\3\2\2\2\u0333"+
		"\u0334\7a\2\2\u0334\u0335\7\\\2\2\u0335\u0336\7W\2\2\u0336\u0337\7R\2"+
		"\2\u0337\u0338\7\21\2\2\u0338\u0339\5\u009cO\2\u0339\u033a\5&\24\2\u033a"+
		"\u033b\5\u009eP\2\u033b%\3\2\2\2\u033c\u033d\b\24\1\2\u033d\u033e\5\u0106"+
		"\u0084\2\u033e\u0345\3\2\2\2\u033f\u0340\f\3\2\2\u0340\u0341\5\u0098M"+
		"\2\u0341\u0342\5\u0106\u0084\2\u0342\u0344\3\2\2\2\u0343\u033f\3\2\2\2"+
		"\u0344\u0347\3\2\2\2\u0345\u0343\3\2\2\2\u0345\u0346\3\2\2\2\u0346\'\3"+
		"\2\2\2\u0347\u0345\3\2\2\2\u0348\u0349\7\u00a4\2\2\u0349\u034a\7U\2\2"+
		"\u034a\u0353\5\u00eav\2\u034b\u034c\7\u00a4\2\2\u034c\u034d\7V\2\2\u034d"+
		"\u0350\5\u0112\u008a\2\u034e\u034f\7P\2\2\u034f\u0351\5\u00eav\2\u0350"+
		"\u034e\3\2\2\2\u0350\u0351\3\2\2\2\u0351\u0353\3\2\2\2\u0352\u0348\3\2"+
		"\2\2\u0352\u034b\3\2\2\2\u0353)\3\2\2\2\u0354\u0355\7a\2\2\u0355\u0356"+
		"\5\u00ecw\2\u0356\u0357\7R\2\2\u0357\u0358\7M\2\2\u0358\u035b\7}\2\2\u0359"+
		"\u035a\7\u008f\2\2\u035a\u035c\5\66\34\2\u035b\u0359\3\2\2\2\u035b\u035c"+
		"\3\2\2\2\u035c\u0362\3\2\2\2\u035d\u035f\7\u0092\2\2\u035e\u0360\7\u0080"+
		"\2\2\u035f\u035e\3\2\2\2\u035f\u0360\3\2\2\2\u0360\u0361\3\2\2\2\u0361"+
		"\u0363\5\u00caf\2\u0362\u035d\3\2\2\2\u0362\u0363\3\2\2\2\u0363+\3\2\2"+
		"\2\u0364\u0365\7a\2\2\u0365\u0366\5\u00e6t\2\u0366\u0367\7R\2\2\u0367"+
		"\u0368\7M\2\2\u0368\u036b\7}\2\2\u0369\u036a\7\u008f\2\2\u036a\u036c\5"+
		"\66\34\2\u036b\u0369\3\2\2\2\u036b\u036c\3\2\2\2\u036c\u0372\3\2\2\2\u036d"+
		"\u036f\7\u0092\2\2\u036e\u0370\7\u0080\2\2\u036f\u036e\3\2\2\2\u036f\u0370"+
		"\3\2\2\2\u0370\u0371\3\2\2\2\u0371\u0373\5\u00caf\2\u0372\u036d\3\2\2"+
		"\2\u0372\u0373\3\2\2\2\u0373-\3\2\2\2\u0374\u0375\7a\2\2\u0375\u0376\5"+
		"\u00e6t\2\u0376\u0377\7R\2\2\u0377\u037a\7}\2\2\u0378\u0379\7\u008f\2"+
		"\2\u0379\u037b\5\66\34\2\u037a\u0378\3\2\2\2\u037a\u037b\3\2\2\2\u037b"+
		"\u0381\3\2\2\2\u037c\u037e\7\u0092\2\2\u037d\u037f\7\u0080\2\2\u037e\u037d"+
		"\3\2\2\2\u037e\u037f\3\2\2\2\u037f\u0380\3\2\2\2\u0380\u0382\5\u00caf"+
		"\2\u0381\u037c\3\2\2\2\u0381\u0382\3\2\2\2\u0382\u0383\3\2\2\2\u0383\u0384"+
		"\7e\2\2\u0384\u0385\7\21\2\2\u0385\u0388\5\u009cO\2\u0386\u0389\5\u0120"+
		"\u0091\2\u0387\u0389\7\u008c\2\2\u0388\u0386\3\2\2\2\u0388\u0387\3\2\2"+
		"\2\u0389\u038a\3\2\2\2\u038a\u038b\5\u009eP\2\u038b/\3\2\2\2\u038c\u038d"+
		"\7a\2\2\u038d\u038e\5\u00e6t\2\u038e\u0390\7R\2\2\u038f\u0391\7\u0081"+
		"\2\2\u0390\u038f\3\2\2\2\u0390\u0391\3\2\2\2\u0391\u0392\3\2\2\2\u0392"+
		"\u0395\7}\2\2\u0393\u0394\7\u008f\2\2\u0394\u0396\5\66\34\2\u0395\u0393"+
		"\3\2\2\2\u0395\u0396\3\2\2\2\u0396\u0399\3\2\2\2\u0397\u0398\7\u0092\2"+
		"\2\u0398\u039a\5\u00fa~\2\u0399\u0397\3\2\2\2\u0399\u039a\3\2\2\2\u039a"+
		"\u039b\3\2\2\2\u039b\u039c\7e\2\2\u039c\u039d\7\21\2\2\u039d\u039e\5\u009c"+
		"O\2\u039e\u039f\5\u0118\u008d\2\u039f\u03a0\5\u009eP\2\u03a0\61\3\2\2"+
		"\2\u03a1\u03a2\7a\2\2\u03a2\u03a3\7\u00b3\2\2\u03a3\u03a4\7R\2\2\u03a4"+
		"\u03a5\7\u009c\2\2\u03a5\u03a6\7}\2\2\u03a6\u03a7\7e\2\2\u03a7\u03a8\7"+
		"\21\2\2\u03a8\u03a9\5\u009cO\2\u03a9\u03aa\5\u0120\u0091\2\u03aa\u03ab"+
		"\5\u009eP\2\u03ab\u03ac\5\u0098M\2\u03ac\u03ad\7P\2\2\u03ad\u03b4\7\u00a2"+
		"\2\2\u03ae\u03af\7\21\2\2\u03af\u03b0\5\u009cO\2\u03b0\u03b1\5\u0122\u0092"+
		"\2\u03b1\u03b2\5\u009eP\2\u03b2\u03b5\3\2\2\2\u03b3\u03b5\5\u00eex\2\u03b4"+
		"\u03ae\3\2\2\2\u03b4\u03b3\3\2\2\2\u03b5\63\3\2\2\2\u03b6\u03b7\5^\60"+
		"\2\u03b7\65\3\2\2\2\u03b8\u03bb\5\u00f0y\2\u03b9\u03ba\7P\2\2\u03ba\u03bc"+
		"\5\u00f2z\2\u03bb\u03b9\3\2\2\2\u03bb\u03bc\3\2\2\2\u03bc\67\3\2\2\2\u03bd"+
		"\u03be\5\u00fa~\2\u03be\u03c0\5\u00e8u\2\u03bf\u03c1\5(\25\2\u03c0\u03bf"+
		"\3\2\2\2\u03c0\u03c1\3\2\2\2\u03c1\u03c4\3\2\2\2\u03c2\u03c3\7/\2\2\u03c3"+
		"\u03c5\5\u0134\u009b\2\u03c4\u03c2\3\2\2\2\u03c4\u03c5\3\2\2\2\u03c59"+
		"\3\2\2\2\u03c6\u03dc\5\u0090I\2\u03c7\u03dc\5@!\2\u03c8\u03dc\5\u0094"+
		"K\2\u03c9\u03dc\5> \2\u03ca\u03dc\5\u0080A\2\u03cb\u03dc\5\u0086D\2\u03cc"+
		"\u03dc\5<\37\2\u03cd\u03dc\5Z.\2\u03ce\u03dc\5\\/\2\u03cf\u03dc\5P)\2"+
		"\u03d0\u03dc\5F$\2\u03d1\u03dc\5J&\2\u03d2\u03dc\5N(\2\u03d3\u03dc\5L"+
		"\'\2\u03d4\u03dc\5T+\2\u03d5\u03dc\5V,\2\u03d6\u03dc\5x=\2\u03d7\u03dc"+
		"\5B\"\2\u03d8\u03dc\5D#\2\u03d9\u03dc\5.\30\2\u03da\u03dc\5\u0116\u008c"+
		"\2\u03db\u03c6\3\2\2\2\u03db\u03c7\3\2\2\2\u03db\u03c8\3\2\2\2\u03db\u03c9"+
		"\3\2\2\2\u03db\u03ca\3\2\2\2\u03db\u03cb\3\2\2\2\u03db\u03cc\3\2\2\2\u03db"+
		"\u03cd\3\2\2\2\u03db\u03ce\3\2\2\2\u03db\u03cf\3\2\2\2\u03db\u03d0\3\2"+
		"\2\2\u03db\u03d1\3\2\2\2\u03db\u03d2\3\2\2\2\u03db\u03d3\3\2\2\2\u03db"+
		"\u03d4\3\2\2\2\u03db\u03d5\3\2\2\2\u03db\u03d6\3\2\2\2\u03db\u03d7\3\2"+
		"\2\2\u03db\u03d8\3\2\2\2\u03db\u03d9\3\2\2\2\u03db\u03da\3\2\2\2\u03dc"+
		";\3\2\2\2\u03dd\u03de\7q\2\2\u03de=\3\2\2\2\u03df\u03e0\7b\2\2\u03e0\u03e4"+
		"\5\u00c6d\2\u03e1\u03e2\7P\2\2\u03e2\u03e3\7\u0099\2\2\u03e3\u03e5\5\u00c6"+
		"d\2\u03e4\u03e1\3\2\2\2\u03e4\u03e5\3\2\2\2\u03e5\u03e9\3\2\2\2\u03e6"+
		"\u03e7\7\u0099\2\2\u03e7\u03e9\5\u00c6d\2\u03e8\u03df\3\2\2\2\u03e8\u03e6"+
		"\3\2\2\2\u03e9\u03ef\3\2\2\2\u03ea\u03eb\7\u00a4\2\2\u03eb\u03ec\5^\60"+
		"\2\u03ec\u03ed\7R\2\2\u03ed\u03ee\5\u0154\u00ab\2\u03ee\u03f0\3\2\2\2"+
		"\u03ef\u03ea\3\2\2\2\u03ef\u03f0\3\2\2\2\u03f0\u03f7\3\2\2\2\u03f1\u03f2"+
		"\7\u009d\2\2\u03f2\u03f3\7\21\2\2\u03f3\u03f4\5\u009cO\2\u03f4\u03f5\5"+
		"\u0120\u0091\2\u03f5\u03f6\5\u009eP\2\u03f6\u03f8\3\2\2\2\u03f7\u03f1"+
		"\3\2\2\2\u03f7\u03f8\3\2\2\2\u03f8?\3\2\2\2\u03f9\u03fc\5l\67\2\u03fa"+
		"\u03fc\5b\62\2\u03fb\u03f9\3\2\2\2\u03fb\u03fa\3\2\2\2\u03fc\u03fe\3\2"+
		"\2\2\u03fd\u03ff\5\u008aF\2\u03fe\u03fd\3\2\2\2\u03fe\u03ff\3\2\2\2\u03ff"+
		"\u040a\3\2\2\2\u0400\u0403\7\u009d\2\2\u0401\u0402\7\u00a4\2\2\u0402\u0404"+
		"\5\u00e8u\2\u0403\u0401\3\2\2\2\u0403\u0404\3\2\2\2\u0404\u0405\3\2\2"+
		"\2\u0405\u0406\7\21\2\2\u0406\u0407\5\u009cO\2\u0407\u0408\5\u0120\u0091"+
		"\2\u0408\u0409\5\u009eP\2\u0409\u040b\3\2\2\2\u040a\u0400\3\2\2\2\u040a"+
		"\u040b\3\2\2\2\u040b\u040e\3\2\2\2\u040c\u040e\5f\64\2\u040d\u03fb\3\2"+
		"\2\2\u040d\u040c\3\2\2\2\u040eA\3\2\2\2\u040f\u0410\7\u00a4\2\2\u0410"+
		"\u0411\5\u014e\u00a8\2\u0411\u0412\7\23\2\2\u0412\u0413\7d\2\2\u0413\u0414"+
		"\7\21\2\2\u0414\u0415\5\u009cO\2\u0415\u0416\5\u0120\u0091\2\u0416\u0417"+
		"\5\u009eP\2\u0417C\3\2\2\2\u0418\u0419\7\u00a4\2\2\u0419\u041a\5\u00ec"+
		"w\2\u041a\u041b\7\23\2\2\u041b\u041c\7d\2\2\u041c\u041d\7\21\2\2\u041d"+
		"\u041e\5\u009cO\2\u041e\u041f\5\u0120\u0091\2\u041f\u0420\5\u009eP\2\u0420"+
		"E\3\2\2\2\u0421\u0422\7\u009b\2\2\u0422\u0423\7\u0086\2\2\u0423\u0424"+
		"\5^\60\2\u0424\u0425\7\21\2\2\u0425\u0426\5\u009cO\2\u0426\u042e\5\u0124"+
		"\u0093\2\u0427\u0428\5\u0098M\2\u0428\u0429\7\u008b\2\2\u0429\u042a\7"+
		"\21\2\2\u042a\u042b\5\u009cO\2\u042b\u042c\5\u0120\u0091\2\u042c\u042d"+
		"\5\u009eP\2\u042d\u042f\3\2\2\2\u042e\u0427\3\2\2\2\u042e\u042f\3\2\2"+
		"\2\u042f\u0430\3\2\2\2\u0430\u0431\5\u009eP\2\u0431G\3\2\2\2\u0432\u0433"+
		"\7\u00a5\2\2\u0433\u0434\5\u012a\u0096\2\u0434\u0435\7\21\2\2\u0435\u0436"+
		"\5\u009cO\2\u0436\u0437\5\u0120\u0091\2\u0437\u0438\5\u009eP\2\u0438\u0442"+
		"\3\2\2\2\u0439\u043a\7\u00a5\2\2\u043a\u043b\7w\2\2\u043b\u043c\5\u0128"+
		"\u0095\2\u043c\u043d\7\21\2\2\u043d\u043e\5\u009cO\2\u043e\u043f\5\u0120"+
		"\u0091\2\u043f\u0440\5\u009eP\2\u0440\u0442\3\2\2\2\u0441\u0432\3\2\2"+
		"\2\u0441\u0439\3\2\2\2\u0442I\3\2\2\2\u0443\u0444\7r\2\2\u0444\u0445\7"+
		"f\2\2\u0445\u0448\5\u00e8u\2\u0446\u0447\7\23\2\2\u0447\u0449\5\u00e8"+
		"u\2\u0448\u0446\3\2\2\2\u0448\u0449\3\2\2\2\u0449\u044a\3\2\2\2\u044a"+
		"\u044b\7w\2\2\u044b\u044c\5^\60\2\u044c\u044d\7\21\2\2\u044d\u044e\5\u009c"+
		"O\2\u044e\u044f\5\u0120\u0091\2\u044f\u0450\5\u009eP\2\u0450K\3\2\2\2"+
		"\u0451\u0452\7d\2\2\u0452\u0453\7\21\2\2\u0453\u0454\5\u009cO\2\u0454"+
		"\u0455\5\u0120\u0091\2\u0455\u0456\5\u009eP\2\u0456\u0457\5\u0098M\2\u0457"+
		"\u0458\7\u00a7\2\2\u0458\u0459\5^\60\2\u0459M\3\2\2\2\u045a\u045b\7\u00a7"+
		"\2\2\u045b\u045c\5^\60\2\u045c\u045d\7\21\2\2\u045d\u045e\5\u009cO\2\u045e"+
		"\u045f\5\u0120\u0091\2\u045f\u0460\5\u009eP\2\u0460O\3\2\2\2\u0461\u0462"+
		"\7v\2\2\u0462\u0463\5^\60\2\u0463\u0464\7\21\2\2\u0464\u0465\5\u009cO"+
		"\2\u0465\u0466\5\u0120\u0091\2\u0466\u046a\5\u009eP\2\u0467\u0468\5\u0098"+
		"M\2\u0468\u0469\5R*\2\u0469\u046b\3\2\2\2\u046a\u0467\3\2\2\2\u046a\u046b"+
		"\3\2\2\2\u046b\u0473\3\2\2\2\u046c\u046d\5\u0098M\2\u046d\u046e\7g\2\2"+
		"\u046e\u046f\7\21\2\2\u046f\u0470\5\u009cO\2\u0470\u0471\5\u0120\u0091"+
		"\2\u0471\u0472\5\u009eP\2\u0472\u0474\3\2\2\2\u0473\u046c\3\2\2\2\u0473"+
		"\u0474\3\2\2\2\u0474Q\3\2\2\2\u0475\u0476\b*\1\2\u0476\u0477\7g\2\2\u0477"+
		"\u0478\7v\2\2\u0478\u0479\5^\60\2\u0479\u047a\7\21\2\2\u047a\u047b\5\u009c"+
		"O\2\u047b\u047c\5\u0120\u0091\2\u047c\u047d\5\u009eP\2\u047d\u048a\3\2"+
		"\2\2\u047e\u047f\f\3\2\2\u047f\u0480\5\u0098M\2\u0480\u0481\7g\2\2\u0481"+
		"\u0482\7v\2\2\u0482\u0483\5^\60\2\u0483\u0484\7\21\2\2\u0484\u0485\5\u009c"+
		"O\2\u0485\u0486\5\u0120\u0091\2\u0486\u0487\5\u009eP\2\u0487\u0489\3\2"+
		"\2\2\u0488\u047e\3\2\2\2\u0489\u048c\3\2\2\2\u048a\u0488\3\2\2\2\u048a"+
		"\u048b\3\2\2\2\u048bS\3\2\2\2\u048c\u048a\3\2\2\2\u048d\u048e\7\u008d"+
		"\2\2\u048e\u048f\5^\60\2\u048fU\3\2\2\2\u0490\u0491\7\u009b\2\2\u0491"+
		"\u0492\7\u0086\2\2\u0492\u0493\5\u00e8u\2\u0493\u0494\7e\2\2\u0494\u0495"+
		"\7\21\2\2\u0495\u0496\5\u009cO\2\u0496\u0497\5\u0120\u0091\2\u0497\u0498"+
		"\5\u009eP\2\u0498\u049a\5\u0096L\2\u0499\u049b\5\u0126\u0094\2\u049a\u0499"+
		"\3\2\2\2\u049a\u049b\3\2\2\2\u049b\u04a7\3\2\2\2\u049c\u04a0\7\u008b\2"+
		"\2\u049d\u049e\7\u00a5\2\2\u049e\u04a0\7Q\2\2\u049f\u049c\3\2\2\2\u049f"+
		"\u049d\3\2\2\2\u04a0\u04a1\3\2\2\2\u04a1\u04a2\7\21\2\2\u04a2\u04a3\5"+
		"\u009cO\2\u04a3\u04a4\5\u0120\u0091\2\u04a4\u04a5\5\u009eP\2\u04a5\u04a6"+
		"\5\u0096L\2\u04a6\u04a8\3\2\2\2\u04a7\u049f\3\2\2\2\u04a7\u04a8\3\2\2"+
		"\2\u04a8\u04b0\3\2\2\2\u04a9\u04aa\7O\2\2\u04aa\u04ab\7\21\2\2\u04ab\u04ac"+
		"\5\u009cO\2\u04ac\u04ad\5\u0120\u0091\2\u04ad\u04ae\5\u009eP\2\u04ae\u04af"+
		"\5\u0096L\2\u04af\u04b1\3\2\2\2\u04b0\u04a9\3\2\2\2\u04b0\u04b1\3\2\2"+
		"\2\u04b1\u04b2\3\2\2\2\u04b2\u04b3\5\u0096L\2\u04b3W\3\2\2\2\u04b4\u04b5"+
		"\7\u00a5\2\2\u04b5\u04b6\5\u00eex\2\u04b6\u04b7\7\21\2\2\u04b7\u04b8\5"+
		"\u009cO\2\u04b8\u04b9\5\u0120\u0091\2\u04b9\u04ba\5\u009eP\2\u04ba\u04bb"+
		"\5\u0096L\2\u04bb\u04c8\3\2\2\2\u04bc\u04bd\7\u00a5\2\2\u04bd\u04be\7"+
		"w\2\2\u04be\u04bf\7\30\2\2\u04bf\u04c0\5\u00be`\2\u04c0\u04c1\7\31\2\2"+
		"\u04c1\u04c2\7\21\2\2\u04c2\u04c3\5\u009cO\2\u04c3\u04c4\5\u0120\u0091"+
		"\2\u04c4\u04c5\5\u009eP\2\u04c5\u04c6\5\u0096L\2\u04c6\u04c8\3\2\2\2\u04c7"+
		"\u04b4\3\2\2\2\u04c7\u04bc\3\2\2\2\u04c8Y\3\2\2\2\u04c9\u04ca\7X\2\2\u04ca"+
		"[\3\2\2\2\u04cb\u04cd\7\u0091\2\2\u04cc\u04ce\5^\60\2\u04cd\u04cc\3\2"+
		"\2\2\u04cd\u04ce\3\2\2\2\u04ce]\3\2\2\2\u04cf\u04d0\b\60\1\2\u04d0\u04f3"+
		"\5\u020a\u0106\2\u04d1\u04f3\5\u01ea\u00f6\2\u04d2\u04f3\5l\67\2\u04d3"+
		"\u04f3\5\u0156\u00ac\2\u04d4\u04f3\5b\62\2\u04d5\u04d8\5l\67\2\u04d6\u04d8"+
		"\5b\62\2\u04d7\u04d5\3\2\2\2\u04d7\u04d6\3\2\2\2\u04d8\u04d9\3\2\2\2\u04d9"+
		"\u04da\5\u008aF\2\u04da\u04f3\3\2\2\2\u04db\u04f3\5v<\2\u04dc\u04dd\7"+
		"#\2\2\u04dd\u04f3\5^\60$\u04de\u04df\7\u0083\2\2\u04df\u04f3\5^\60#\u04e0"+
		"\u04e1\7C\2\2\u04e1\u04e2\7\21\2\2\u04e2\u04f3\5^\60\21\u04e3\u04e4\7"+
		"k\2\2\u04e4\u04e5\7\21\2\2\u04e5\u04f3\5\u00e8u\2\u04e6\u04e7\7B\2\2\u04e7"+
		"\u04f3\5l\67\2\u04e8\u04f3\5t;\2\u04e9\u04f3\5r:\2\u04ea\u04f3\5p9\2\u04eb"+
		"\u04f3\5~@\2\u04ec\u04f3\5\u015e\u00b0\2\u04ed\u04f3\5\u0160\u00b1\2\u04ee"+
		"\u04f3\5\u0162\u00b2\2\u04ef\u04f3\5\u0088E\2\u04f0\u04f3\5z>\2\u04f1"+
		"\u04f3\5f\64\2\u04f2\u04cf\3\2\2\2\u04f2\u04d1\3\2\2\2\u04f2\u04d2\3\2"+
		"\2\2\u04f2\u04d3\3\2\2\2\u04f2\u04d4\3\2\2\2\u04f2\u04d7\3\2\2\2\u04f2"+
		"\u04db\3\2\2\2\u04f2\u04dc\3\2\2\2\u04f2\u04de\3\2\2\2\u04f2\u04e0\3\2"+
		"\2\2\u04f2\u04e3\3\2\2\2\u04f2\u04e6\3\2\2\2\u04f2\u04e8\3\2\2\2\u04f2"+
		"\u04e9\3\2\2\2\u04f2\u04ea\3\2\2\2\u04f2\u04eb\3\2\2\2\u04f2\u04ec\3\2"+
		"\2\2\u04f2\u04ed\3\2\2\2\u04f2\u04ee\3\2\2\2\u04f2\u04ef\3\2\2\2\u04f2"+
		"\u04f0\3\2\2\2\u04f2\u04f1\3\2\2\2\u04f3\u0550\3\2\2\2\u04f4\u04f5\f!"+
		"\2\2\u04f5\u04f6\5\u0178\u00bd\2\u04f6\u04f7\5^\60\"\u04f7\u054f\3\2\2"+
		"\2\u04f8\u04f9\f \2\2\u04f9\u04fa\5\u017a\u00be\2\u04fa\u04fb\5^\60!\u04fb"+
		"\u054f\3\2\2\2\u04fc\u04fd\f\37\2\2\u04fd\u04fe\5\u017e\u00c0\2\u04fe"+
		"\u04ff\5^\60 \u04ff\u054f\3\2\2\2\u0500\u0501\f\36\2\2\u0501\u0502\5\u017c"+
		"\u00bf\2\u0502\u0503\5^\60\37\u0503\u054f\3\2\2\2\u0504\u0505\f\35\2\2"+
		"\u0505\u0506\t\2\2\2\u0506\u054f\5^\60\36\u0507\u0508\f\34\2\2\u0508\u0509"+
		"\t\3\2\2\u0509\u054f\5^\60\35\u050a\u050b\f\32\2\2\u050b\u050c\t\4\2\2"+
		"\u050c\u054f\5^\60\33\u050d\u050f\f\31\2\2\u050e\u0510\7\u0083\2\2\u050f"+
		"\u050e\3\2\2\2\u050f\u0510\3\2\2\2\u0510\u0511\3\2\2\2\u0511\u0512\7^"+
		"\2\2\u0512\u054f\5^\60\32\u0513\u0515\f\30\2\2\u0514\u0516\7\u0083\2\2"+
		"\u0515\u0514\3\2\2\2\u0515\u0516\3\2\2\2\u0516\u0517\3\2\2\2\u0517\u0518"+
		"\7w\2\2\u0518\u054f\5^\60\31\u0519\u051b\f\27\2\2\u051a\u051c\7\u0083"+
		"\2\2\u051b\u051a\3\2\2\2\u051b\u051c\3\2\2\2\u051c\u051d\3\2\2\2\u051d"+
		"\u051e\7u\2\2\u051e\u054f\5^\60\30\u051f\u0520\f\24\2\2\u0520\u0521\7"+
		"\u0089\2\2\u0521\u054f\5^\60\25\u0522\u0523\f\23\2\2\u0523\u0524\7P\2"+
		"\2\u0524\u054f\5^\60\24\u0525\u0526\f\22\2\2\u0526\u0527\7v\2\2\u0527"+
		"\u0528\5^\60\2\u0528\u0529\7g\2\2\u0529\u052a\5^\60\23\u052a\u054f\3\2"+
		"\2\2\u052b\u052c\f\3\2\2\u052c\u052d\7r\2\2\u052d\u052e\7f\2\2\u052e\u052f"+
		"\5\u00e8u\2\u052f\u0530\7w\2\2\u0530\u0531\5^\60\4\u0531\u054f\3\2\2\2"+
		"\u0532\u0533\f\"\2\2\u0533\u0535\7R\2\2\u0534\u0536\7\u0080\2\2\u0535"+
		"\u0534\3\2\2\2\u0535\u0536\3\2\2\2\u0536\u0537\3\2\2\2\u0537\u054f\5\u00fa"+
		"~\2\u0538\u0539\f\33\2\2\u0539\u053b\7{\2\2\u053a\u053c\7\u0083\2\2\u053b"+
		"\u053a\3\2\2\2\u053b\u053c\3\2\2\2\u053c\u053d\3\2\2\2\u053d\u054f\5\u0152"+
		"\u00aa\2\u053e\u0540\f\26\2\2\u053f\u0541\7\u0083\2\2\u0540\u053f\3\2"+
		"\2\2\u0540\u0541\3\2\2\2\u0541\u0542\3\2\2\2\u0542\u0543\7u\2\2\u0543"+
		"\u0544\7N\2\2\u0544\u054f\5`\61\2\u0545\u0547\f\25\2\2\u0546\u0548\7\u0083"+
		"\2\2\u0547\u0546\3\2\2\2\u0547\u0548\3\2\2\2\u0548\u0549\3\2\2\2\u0549"+
		"\u054a\7u\2\2\u054a\u054b\7Q\2\2\u054b\u054f\5`\61\2\u054c\u054d\f\13"+
		"\2\2\u054d\u054f\5|?\2\u054e\u04f4\3\2\2\2\u054e\u04f8\3\2\2\2\u054e\u04fc"+
		"\3\2\2\2\u054e\u0500\3\2\2\2\u054e\u0504\3\2\2\2\u054e\u0507\3\2\2\2\u054e"+
		"\u050a\3\2\2\2\u054e\u050d\3\2\2\2\u054e\u0513\3\2\2\2\u054e\u0519\3\2"+
		"\2\2\u054e\u051f\3\2\2\2\u054e\u0522\3\2\2\2\u054e\u0525\3\2\2\2\u054e"+
		"\u052b\3\2\2\2\u054e\u0532\3\2\2\2\u054e\u0538\3\2\2\2\u054e\u053e\3\2"+
		"\2\2\u054e\u0545\3\2\2\2\u054e\u054c\3\2\2\2\u054f\u0552\3\2\2\2\u0550"+
		"\u054e\3\2\2\2\u0550\u0551\3\2\2\2\u0551_\3\2\2\2\u0552\u0550\3\2\2\2"+
		"\u0553\u0554\7\u00a6\2\2\u0554\u055b\5\u0156\u00ac\2\u0555\u0556\5\u00e8"+
		"u\2\u0556\u0557\7\u00a6\2\2\u0557\u0558\5^\60\2\u0558\u055b\3\2\2\2\u0559"+
		"\u055b\5^\60\2\u055a\u0553\3\2\2\2\u055a\u0555\3\2\2\2\u055a\u0559\3\2"+
		"\2\2\u055ba\3\2\2\2\u055c\u055d\b\62\1\2\u055d\u055e\5\u00e2r\2\u055e"+
		"\u0563\3\2\2\2\u055f\u0560\f\3\2\2\u0560\u0562\5d\63\2\u0561\u055f\3\2"+
		"\2\2\u0562\u0565\3\2\2\2\u0563\u0561\3\2\2\2\u0563\u0564\3\2\2\2\u0564"+
		"c\3\2\2\2\u0565\u0563\3\2\2\2\u0566\u0567\6\63\30\3\u0567\u0568\7\25\2"+
		"\2\u0568\u0569\5\u00e2r\2\u0569e\3\2\2\2\u056a\u056b\7z\2\2\u056b\u056c"+
		"\5b\62\2\u056c\u056d\5h\65\2\u056dg\3\2\2\2\u056e\u056f\6\65\31\3\u056f"+
		"i\3\2\2\2\u0570\u0576\5\u0132\u009a\2\u0571\u0576\5\u0134\u009b\2\u0572"+
		"\u0576\5\u00e2r\2\u0573\u0576\5\u012e\u0098\2\u0574\u0576\5\u0130\u0099"+
		"\2\u0575\u0570\3\2\2\2\u0575\u0571\3\2\2\2\u0575\u0572\3\2\2\2\u0575\u0573"+
		"\3\2\2\2\u0575\u0574\3\2\2\2\u0576k\3\2\2\2\u0577\u0578\b\67\1\2\u0578"+
		"\u0579\5j\66\2\u0579\u057e\3\2\2\2\u057a\u057b\f\3\2\2\u057b\u057d\5n"+
		"8\2\u057c\u057a\3\2\2\2\u057d\u0580\3\2\2\2\u057e\u057c\3\2\2\2\u057e"+
		"\u057f\3\2\2\2\u057fm\3\2\2\2\u0580\u057e\3\2\2\2\u0581\u0582\68\33\3"+
		"\u0582\u0583\7\25\2\2\u0583\u0592\5\u00e4s\2\u0584\u0585\68\34\3\u0585"+
		"\u0586\7\25\2\2\u0586\u0592\5\u00e6t\2\u0587\u0588\68\35\3\u0588\u0589"+
		"\7\30\2\2\u0589\u058a\5\u014c\u00a7\2\u058a\u058b\7\31\2\2\u058b\u0592"+
		"\3\2\2\2\u058c\u058d\68\36\3\u058d\u058e\7\30\2\2\u058e\u058f\5^\60\2"+
		"\u058f\u0590\7\31\2\2\u0590\u0592\3\2\2\2\u0591\u0581\3\2\2\2\u0591\u0584"+
		"\3\2\2\2\u0591\u0587\3\2\2\2\u0591\u058c\3\2\2\2\u0592o\3\2\2\2\u0593"+
		"\u0594\b9\1\2\u0594\u0595\7\u0080\2\2\u0595\u0596\5\u00e2r\2\u0596\u059b"+
		"\3\2\2\2\u0597\u0598\f\3\2\2\u0598\u059a\5n8\2\u0599\u0597\3\2\2\2\u059a"+
		"\u059d\3\2\2\2\u059b\u0599\3\2\2\2\u059b\u059c\3\2\2\2\u059cq\3\2\2\2"+
		"\u059d\u059b\3\2\2\2\u059e\u05a1\7D\2\2\u059f\u05a0\7s\2\2\u05a0\u05a2"+
		"\5^\60\2\u05a1\u059f\3\2\2\2\u05a1\u05a2\3\2\2\2\u05a2s\3\2\2\2\u05a3"+
		"\u05a4\7E\2\2\u05a4\u05a5\7s\2\2\u05a5\u05a6\5^\60\2\u05a6u\3\2\2\2\u05a7"+
		"\u05a8\5\u00d2j\2\u05a8\u05a9\7s\2\2\u05a9\u05b2\5^\60\2\u05aa\u05ac\7"+
		"\23\2\2\u05ab\u05aa\3\2\2\2\u05ab\u05ac\3\2\2\2\u05ac\u05ad\3\2\2\2\u05ad"+
		"\u05b0\5\u008cG\2\u05ae\u05af\7P\2\2\u05af\u05b1\5\u008eH\2\u05b0\u05ae"+
		"\3\2\2\2\u05b0\u05b1\3\2\2\2\u05b1\u05b3\3\2\2\2\u05b2\u05ab\3\2\2\2\u05b2"+
		"\u05b3\3\2\2\2\u05b3\u05bd\3\2\2\2\u05b4\u05ba\5\u00d2j\2\u05b5\u05b8"+
		"\5\u008cG\2\u05b6\u05b7\7P\2\2\u05b7\u05b9\5\u008eH\2\u05b8\u05b6\3\2"+
		"\2\2\u05b8\u05b9\3\2\2\2\u05b9\u05bb\3\2\2\2\u05ba\u05b5\3\2\2\2\u05ba"+
		"\u05bb\3\2\2\2\u05bb\u05bd\3\2\2\2\u05bc\u05a7\3\2\2\2\u05bc\u05b4\3\2"+
		"\2\2\u05bdw\3\2\2\2\u05be\u05bf\7\u00a8\2\2\u05bf\u05c0\5^\60\2\u05c0"+
		"\u05c1\7\u00a0\2\2\u05c1\u05c3\5^\60\2\u05c2\u05c4\5\u0084C\2\u05c3\u05c2"+
		"\3\2\2\2\u05c3\u05c4\3\2\2\2\u05c4y\3\2\2\2\u05c5\u05c6\5b\62\2\u05c6"+
		"\u05c7\7#\2\2\u05c7\u05c8\5^\60\2\u05c8{\3\2\2\2\u05c9\u05cc\7o\2\2\u05ca"+
		"\u05cb\7\u00a4\2\2\u05cb\u05cd\5\u00e8u\2\u05cc\u05ca\3\2\2\2\u05cc\u05cd"+
		"\3\2\2\2\u05cd\u05ce\3\2\2\2\u05ce\u05cf\7\u00a6\2\2\u05cf\u05d0\5^\60"+
		"\2\u05d0}\3\2\2\2\u05d1\u05d2\7n\2\2\u05d2\u05d4\7\u0087\2\2\u05d3\u05d5"+
		"\5\u00d2j\2\u05d4\u05d3\3\2\2\2\u05d4\u05d5\3\2\2\2\u05d5\u05d6\3\2\2"+
		"\2\u05d6\u05d7\7\u00a6\2\2\u05d7\u05da\5^\60\2\u05d8\u05d9\7x\2\2\u05d9"+
		"\u05db\5\u0082B\2\u05da\u05d8\3\2\2\2\u05da\u05db\3\2\2\2\u05db\u05fe"+
		"\3\2\2\2\u05dc\u05ee\7n\2\2\u05dd\u05df\7N\2\2\u05de\u05e0\5\u00d2j\2"+
		"\u05df\u05de\3\2\2\2\u05df\u05e0\3\2\2\2\u05e0\u05ef\3\2\2\2\u05e1\u05e3"+
		"\5\u00d2j\2\u05e2\u05e4\7\u0093\2\2\u05e3\u05e2\3\2\2\2\u05e3\u05e4\3"+
		"\2\2\2\u05e4\u05e5\3\2\2\2\u05e5\u05e6\5^\60\2\u05e6\u05e7\7\u00a0\2\2"+
		"\u05e7\u05e8\5^\60\2\u05e8\u05ef\3\2\2\2\u05e9\u05ea\7\u0093\2\2\u05ea"+
		"\u05eb\5^\60\2\u05eb\u05ec\7\u00a0\2\2\u05ec\u05ed\5^\60\2\u05ed\u05ef"+
		"\3\2\2\2\u05ee\u05dd\3\2\2\2\u05ee\u05e1\3\2\2\2\u05ee\u05e9\3\2\2\2\u05ef"+
		"\u05f2\3\2\2\2\u05f0\u05f1\7\u00a6\2\2\u05f1\u05f3\5^\60\2\u05f2\u05f0"+
		"\3\2\2\2\u05f2\u05f3\3\2\2\2\u05f3\u05f6\3\2\2\2\u05f4\u05f5\7x\2\2\u05f5"+
		"\u05f7\5\u0082B\2\u05f6\u05f4\3\2\2\2\u05f6\u05f7\3\2\2\2\u05f7\u05fb"+
		"\3\2\2\2\u05f8\u05f9\7\u008a\2\2\u05f9\u05fa\7Y\2\2\u05fa\u05fc\5\u0164"+
		"\u00b3\2\u05fb\u05f8\3\2\2\2\u05fb\u05fc\3\2\2\2\u05fc\u05fe\3\2\2\2\u05fd"+
		"\u05d1\3\2\2\2\u05fd\u05dc\3\2\2\2\u05fe\177\3\2\2\2\u05ff\u0600\7n\2"+
		"\2\u0600\u0602\7\u0087\2\2\u0601\u0603\5\u00d2j\2\u0602\u0601\3\2\2\2"+
		"\u0602\u0603\3\2\2\2\u0603\u0604\3\2\2\2\u0604\u0605\7\u00a6\2\2\u0605"+
		"\u0608\5^\60\2\u0606\u0607\7x\2\2\u0607\u0609\5\u0082B\2\u0608\u0606\3"+
		"\2\2\2\u0608\u0609\3\2\2\2\u0609\u060a\3\2\2\2\u060a\u060b\5\u0084C\2"+
		"\u060b\u062f\3\2\2\2\u060c\u061e\7n\2\2\u060d\u060f\7N\2\2\u060e\u0610"+
		"\5\u00d2j\2\u060f\u060e\3\2\2\2\u060f\u0610\3\2\2\2\u0610\u061f\3\2\2"+
		"\2\u0611\u0613\5\u00d2j\2\u0612\u0614\7\u0093\2\2\u0613\u0612\3\2\2\2"+
		"\u0613\u0614\3\2\2\2\u0614\u0615\3\2\2\2\u0615\u0616\5^\60\2\u0616\u0617"+
		"\7\u00a0\2\2\u0617\u0618\5^\60\2\u0618\u061f\3\2\2\2\u0619\u061a\7\u0093"+
		"\2\2\u061a\u061b\5^\60\2\u061b\u061c\7\u00a0\2\2\u061c\u061d\5^\60\2\u061d"+
		"\u061f\3\2\2\2\u061e\u060d\3\2\2\2\u061e\u0611\3\2\2\2\u061e\u0619\3\2"+
		"\2\2\u061f\u0622\3\2\2\2\u0620\u0621\7\u00a6\2\2\u0621\u0623\5^\60\2\u0622"+
		"\u0620\3\2\2\2\u0622\u0623\3\2\2\2\u0623\u0626\3\2\2\2\u0624\u0625\7x"+
		"\2\2\u0625\u0627\5\u0082B\2\u0626\u0624\3\2\2\2\u0626\u0627\3\2\2\2\u0627"+
		"\u062b\3\2\2\2\u0628\u0629\7\u008a\2\2\u0629\u062a\7Y\2\2\u062a\u062c"+
		"\5\u0164\u00b3\2\u062b\u0628\3\2\2\2\u062b\u062c\3\2\2\2\u062c\u062d\3"+
		"\2\2\2\u062d\u062f\5\u0084C\2\u062e\u05ff\3\2\2\2\u062e\u060c\3\2\2\2"+
		"\u062f\u0081\3\2\2\2\u0630\u0635\5\u00e8u\2\u0631\u0632\7\23\2\2\u0632"+
		"\u0634\5\u00e8u\2\u0633\u0631\3\2\2\2\u0634\u0637\3\2\2\2\u0635\u0633"+
		"\3\2\2\2\u0635\u0636\3\2\2\2\u0636\u063a\3\2\2\2\u0637\u0635\3\2\2\2\u0638"+
		"\u0639\7P\2\2\u0639\u063b\5\u00e8u\2\u063a\u0638\3\2\2\2\u063a\u063b\3"+
		"\2\2\2\u063b\u0083\3\2\2\2\u063c\u063d\7\u009d\2\2\u063d\u063e\7\u00a4"+
		"\2\2\u063e\u063f\5\u00e8u\2\u063f\u0640\7\21\2\2\u0640\u0641\5\u009cO"+
		"\2\u0641\u0642\5\u0120\u0091\2\u0642\u0643\5\u009eP\2\u0643\u0085\3\2"+
		"\2\2\u0644\u0645\7\u008e\2\2\u0645\u0646\7N\2\2\u0646\u0647\7s\2\2\u0647"+
		"\u0648\5^\60\2\u0648\u0649\5\u0084C\2\u0649\u0087\3\2\2\2\u064a\u064c"+
		"\7\u0097\2\2\u064b\u064d\7c\2\2\u064c\u064b\3\2\2\2\u064c\u064d\3\2\2"+
		"\2\u064d\u064e\3\2\2\2\u064e\u0654\5l\67\2\u064f\u0650\7\u00a4\2\2\u0650"+
		"\u0651\5\u015c\u00af\2\u0651\u0652\7R\2\2\u0652\u0653\5\u016e\u00b8\2"+
		"\u0653\u0655\3\2\2\2\u0654\u064f\3\2\2\2\u0654\u0655\3\2\2\2\u0655\u0089"+
		"\3\2\2\2\u0656\u0657\6F \3\u0657\u065d\5^\60\2\u0658\u065b\5\u008cG\2"+
		"\u0659\u065a\7P\2\2\u065a\u065c\5\u008eH\2\u065b\u0659\3\2\2\2\u065b\u065c"+
		"\3\2\2\2\u065c\u065e\3\2\2\2\u065d\u0658\3\2\2\2\u065d\u065e\3\2\2\2\u065e"+
		"\u0665\3\2\2\2\u065f\u0662\5\u008cG\2\u0660\u0661\7P\2\2\u0661\u0663\5"+
		"\u008eH\2\u0662\u0660\3\2\2\2\u0662\u0663\3\2\2\2\u0663\u0665\3\2\2\2"+
		"\u0664\u0656\3\2\2\2\u0664\u065f\3\2\2\2\u0665\u008b\3\2\2\2\u0666\u0667"+
		"\bG\1\2\u0667\u0668\7\u00a4\2\2\u0668\u0669\5\u008eH\2\u0669\u066f\3\2"+
		"\2\2\u066a\u066b\f\3\2\2\u066b\u066c\7\23\2\2\u066c\u066e\5\u008eH\2\u066d"+
		"\u066a\3\2\2\2\u066e\u0671\3\2\2\2\u066f\u066d\3\2\2\2\u066f\u0670\3\2"+
		"\2\2\u0670\u008d\3\2\2\2\u0671\u066f\3\2\2\2\u0672\u0673\5^\60\2\u0673"+
		"\u0674\7R\2\2\u0674\u0676\3\2\2\2\u0675\u0672\3\2\2\2\u0675\u0676\3\2"+
		"\2\2\u0676\u0677\3\2\2\2\u0677\u0678\5\u00e8u\2\u0678\u008f\3\2\2\2\u0679"+
		"\u067a\5\u0150\u00a9\2\u067a\u067b\5\u0176\u00bc\2\u067b\u067c\5^\60\2"+
		"\u067c\u0091\3\2\2\2\u067d\u067e\6J\"\3\u067e\u067f\7\25\2\2\u067f\u0686"+
		"\5\u00e8u\2\u0680\u0681\6J#\3\u0681\u0682\7\30\2\2\u0682\u0683\5^\60\2"+
		"\u0683\u0684\7\31\2\2\u0684\u0686\3\2\2\2\u0685\u067d\3\2\2\2\u0685\u0680"+
		"\3\2\2\2\u0686\u0093\3\2\2\2\u0687\u0688\5\u0110\u0089\2\u0688\u0689\5"+
		"\u0176\u00bc\2\u0689\u068a\5^\60\2\u068a\u0095\3\2\2\2\u068b\u068d\7\7"+
		"\2\2\u068c\u068b\3\2\2\2\u068d\u0690\3\2\2\2\u068e\u068c\3\2\2\2\u068e"+
		"\u068f\3\2\2\2\u068f\u0097\3\2\2\2\u0690\u068e\3\2\2\2\u0691\u0693\7\7"+
		"\2\2\u0692\u0691\3\2\2\2\u0693\u0694\3\2\2\2\u0694\u0692\3\2\2\2\u0694"+
		"\u0695\3\2\2\2\u0695\u0099\3\2\2\2\u0696\u0698\t\5\2\2\u0697\u0696\3\2"+
		"\2\2\u0698\u069b\3\2\2\2\u0699\u0697\3\2\2\2\u0699\u069a\3\2\2\2\u069a"+
		"\u009b\3\2\2\2\u069b\u0699\3\2\2\2\u069c\u069e\7\7\2\2\u069d\u069c\3\2"+
		"\2\2\u069e\u069f\3\2\2\2\u069f\u069d\3\2\2\2\u069f\u06a0\3\2\2\2\u06a0"+
		"\u06a1\3\2\2\2\u06a1\u06a2\7\3\2\2\u06a2\u009d\3\2\2\2\u06a3\u06a5\7\7"+
		"\2\2\u06a4\u06a3\3\2\2\2\u06a5\u06a8\3\2\2\2\u06a6\u06a4\3\2\2\2\u06a6"+
		"\u06a7\3\2\2\2\u06a7\u06a9\3\2\2\2\u06a8\u06a6\3\2\2\2\u06a9\u06aa\7\4"+
		"\2\2\u06aa\u009f\3\2\2\2\u06ab\u06ac\7L\2\2\u06ac\u06ad\7\21\2\2\u06ad"+
		"\u06ae\5\u00fa~\2\u06ae\u00a1\3\2\2\2\u06af\u06b0\7\u0084\2\2\u06b0\u00a3"+
		"\3\2\2\2\u06b1\u06b5\5\u00aaV\2\u06b2\u06b5\5:\36\2\u06b3\u06b5\5^\60"+
		"\2\u06b4\u06b1\3\2\2\2\u06b4\u06b2\3\2\2\2\u06b4\u06b3\3\2\2\2\u06b5\u00a5"+
		"\3\2\2\2\u06b6\u06b8\5\u0096L\2\u06b7\u06b9\5\u00a8U\2\u06b8\u06b7\3\2"+
		"\2\2\u06b8\u06b9\3\2\2\2\u06b9\u06ba\3\2\2\2\u06ba\u06bb\5\u0096L\2\u06bb"+
		"\u06bc\7\2\2\3\u06bc\u00a7\3\2\2\2\u06bd\u06c3\5\u00aaV\2\u06be\u06bf"+
		"\5\u0098M\2\u06bf\u06c0\5\u00aaV\2\u06c0\u06c2\3\2\2\2\u06c1\u06be\3\2"+
		"\2\2\u06c2\u06c5\3\2\2\2\u06c3\u06c1\3\2\2\2\u06c3\u06c4\3\2\2\2\u06c4"+
		"\u00a9\3\2\2\2\u06c5\u06c3\3\2\2\2\u06c6\u06c7\5\u0116\u008c\2\u06c7\u06c8"+
		"\5\u0098M\2\u06c8\u06ca\3\2\2\2\u06c9\u06c6\3\2\2\2\u06ca\u06cd\3\2\2"+
		"\2\u06cb\u06c9\3\2\2\2\u06cb\u06cc\3\2\2\2\u06cc\u06d3\3\2\2\2\u06cd\u06cb"+
		"\3\2\2\2\u06ce\u06cf\5\u00acW\2\u06cf\u06d0\5\u0098M\2\u06d0\u06d2\3\2"+
		"\2\2\u06d1\u06ce\3\2\2\2\u06d2\u06d5\3\2\2\2\u06d3\u06d1\3\2\2\2\u06d3"+
		"\u06d4\3\2\2\2\u06d4\u06dc\3\2\2\2\u06d5\u06d3\3\2\2\2\u06d6\u06dd\5\n"+
		"\6\2\u06d7\u06dd\5\u00d6l\2\u06d8\u06dd\5\u00b6\\\2\u06d9\u06dd\5\u00b8"+
		"]\2\u06da\u06dd\5\u00d8m\2\u06db\u06dd\5\u0114\u008b\2\u06dc\u06d6\3\2"+
		"\2\2\u06dc\u06d7\3\2\2\2\u06dc\u06d8\3\2\2\2\u06dc\u06d9\3\2\2\2\u06dc"+
		"\u06da\3\2\2\2\u06dc\u06db\3\2\2\2\u06dd\u00ab\3\2\2\2\u06de\u06ed\5\u00ae"+
		"X\2\u06df\u06e9\7\26\2\2\u06e0\u06ea\5\u00b4[\2\u06e1\u06e6\5\u00b0Y\2"+
		"\u06e2\u06e3\7\23\2\2\u06e3\u06e5\5\u00b0Y\2\u06e4\u06e2\3\2\2\2\u06e5"+
		"\u06e8\3\2\2\2\u06e6\u06e4\3\2\2\2\u06e6\u06e7\3\2\2\2\u06e7\u06ea\3\2"+
		"\2\2\u06e8\u06e6\3\2\2\2\u06e9\u06e0\3\2\2\2\u06e9\u06e1\3\2\2\2\u06ea"+
		"\u06eb\3\2\2\2\u06eb\u06ec\7\27\2\2\u06ec\u06ee\3\2\2\2\u06ed\u06df\3"+
		"\2\2\2\u06ed\u06ee\3\2\2\2\u06ee\u00ad\3\2\2\2\u06ef\u06f0\7\u00b2\2\2"+
		"\u06f0\u00af\3\2\2\2\u06f1\u06f2\5\u00b2Z\2\u06f2\u06f3\7/\2\2\u06f3\u06f4"+
		"\5\u00b4[\2\u06f4\u00b1\3\2\2\2\u06f5\u06f6\t\6\2\2\u06f6\u00b3\3\2\2"+
		"\2\u06f7\u06fa\5\u0134\u009b\2\u06f8\u06fa\5\u00ccg\2\u06f9\u06f7\3\2"+
		"\2\2\u06f9\u06f8\3\2\2\2\u06fa\u00b5\3\2\2\2\u06fb\u06fc\5\"\22\2\u06fc"+
		"\u00b7\3\2\2\2\u06fd\u0700\5\2\2\2\u06fe\u0700\5\4\3\2\u06ff\u06fd\3\2"+
		"\2\2\u06ff\u06fe\3\2\2\2\u0700\u00b9\3\2\2\2\u0701\u0707\5\6\4\2\u0702"+
		"\u0703\5\u0098M\2\u0703\u0704\5\6\4\2\u0704\u0706\3\2\2\2\u0705\u0702"+
		"\3\2\2\2\u0706\u0709\3\2\2\2\u0707\u0705\3\2\2\2\u0707\u0708\3\2\2\2\u0708"+
		"\u00bb\3\2\2\2\u0709\u0707\3\2\2\2\u070a\u0710\5\b\5\2\u070b\u070c\5\u0098"+
		"M\2\u070c\u070d\5\b\5\2\u070d\u070f\3\2\2\2\u070e\u070b\3\2\2\2\u070f"+
		"\u0712\3\2\2\2\u0710\u070e\3\2\2\2\u0710\u0711\3\2\2\2\u0711\u00bd\3\2"+
		"\2\2\u0712\u0710\3\2\2\2\u0713\u0718\5\u00eex\2\u0714\u0715\7\23\2\2\u0715"+
		"\u0717\5\u00eex\2\u0716\u0714\3\2\2\2\u0717\u071a\3\2\2\2\u0718\u0716"+
		"\3\2\2\2\u0718\u0719\3\2\2\2\u0719\u00bf\3\2\2\2\u071a\u0718\3\2\2\2\u071b"+
		"\u071c\7w\2\2\u071c\u0726\5\u00c2b\2\u071d\u071e\7w\2\2\u071e\u0726\5"+
		"\u00c4c\2\u071f\u0720\7w\2\2\u0720\u0726\5\u00c8e\2\u0721\u0722\7|\2\2"+
		"\u0722\u0726\7\u00b3\2\2\u0723\u0724\7|\2\2\u0724\u0726\5^\60\2\u0725"+
		"\u071b\3\2\2\2\u0725\u071d\3\2\2\2\u0725\u071f\3\2\2\2\u0725\u0721\3\2"+
		"\2\2\u0725\u0723\3\2\2\2\u0726\u00c1\3\2\2\2\u0727\u0729\7\u0080\2\2\u0728"+
		"\u0727\3\2\2\2\u0728\u0729\3\2\2\2\u0729\u072a\3\2\2\2\u072a\u072c\7\30"+
		"\2\2\u072b\u072d\5\u00c6d\2\u072c\u072b\3\2\2\2\u072c\u072d\3\2\2\2\u072d"+
		"\u072e\3\2\2\2\u072e\u072f\7\31\2\2\u072f\u00c3\3\2\2\2\u0730\u0732\7"+
		"\u0080\2\2\u0731\u0730\3\2\2\2\u0731\u0732\3\2\2\2\u0732\u0733\3\2\2\2"+
		"\u0733\u0735\7+\2\2\u0734\u0736\5\u00c6d\2\u0735\u0734\3\2\2\2\u0735\u0736"+
		"\3\2\2\2\u0736\u0737\3\2\2\2\u0737\u0738\7)\2\2\u0738\u00c5\3\2\2\2\u0739"+
		"\u073e\5^\60\2\u073a\u073b\7\23\2\2\u073b\u073d\5^\60\2\u073c\u073a\3"+
		"\2\2\2\u073d\u0740\3\2\2\2\u073e\u073c\3\2\2\2\u073e\u073f\3\2\2\2\u073f"+
		"\u00c7\3\2\2\2\u0740\u073e\3\2\2\2\u0741\u0742\7\30\2\2\u0742\u0743\5"+
		"^\60\2\u0743\u0744\7\24\2\2\u0744\u0745\5^\60\2\u0745\u0746\7\31\2\2\u0746"+
		"\u00c9\3\2\2\2\u0747\u0748\bf\1\2\u0748\u0759\5\u00ccg\2\u0749\u074a\7"+
		"J\2\2\u074a\u074b\7+\2\2\u074b\u074c\5\u00caf\2\u074c\u074d\7)\2\2\u074d"+
		"\u0759\3\2\2\2\u074e\u074f\7I\2\2\u074f\u0750\7+\2\2\u0750\u0751\5\u00ca"+
		"f\2\u0751\u0752\7)\2\2\u0752\u0759\3\2\2\2\u0753\u0754\7L\2\2\u0754\u0755"+
		"\7+\2\2\u0755\u0756\5\u00caf\2\u0756\u0757\7)\2\2\u0757\u0759\3\2\2\2"+
		"\u0758\u0747\3\2\2\2\u0758\u0749\3\2\2\2\u0758\u074e\3\2\2\2\u0758\u0753"+
		"\3\2\2\2\u0759\u0763\3\2\2\2\u075a\u075b\f\b\2\2\u075b\u0762\7-\2\2\u075c"+
		"\u075d\f\7\2\2\u075d\u075e\7\30\2\2\u075e\u0762\7\31\2\2\u075f\u0760\f"+
		"\6\2\2\u0760\u0762\7.\2\2\u0761\u075a\3\2\2\2\u0761\u075c\3\2\2\2\u0761"+
		"\u075f\3\2\2\2\u0762\u0765\3\2\2\2\u0763\u0761\3\2\2\2\u0763\u0764\3\2"+
		"\2\2\u0764\u00cb\3\2\2\2\u0765\u0763\3\2\2\2\u0766\u0769\5\u00ceh\2\u0767"+
		"\u0769\5\u00d0i\2\u0768\u0766\3\2\2\2\u0768\u0767\3\2\2\2\u0769\u00cd"+
		"\3\2\2\2\u076a\u077d\7\67\2\2\u076b\u077d\78\2\2\u076c\u077d\79\2\2\u076d"+
		"\u077d\7:\2\2\u076e\u077d\7F\2\2\u076f\u077d\7;\2\2\u0770\u077d\7<\2\2"+
		"\u0771\u077d\7D\2\2\u0772\u077d\7=\2\2\u0773\u077d\7?\2\2\u0774\u077d"+
		"\7>\2\2\u0775\u077d\7@\2\2\u0776\u077d\7A\2\2\u0777\u077d\7C\2\2\u0778"+
		"\u077d\7E\2\2\u0779\u077d\7G\2\2\u077a\u077d\7H\2\2\u077b\u077d\7K\2\2"+
		"\u077c\u076a\3\2\2\2\u077c\u076b\3\2\2\2\u077c\u076c\3\2\2\2\u077c\u076d"+
		"\3\2\2\2\u077c\u076e\3\2\2\2\u077c\u076f\3\2\2\2\u077c\u0770\3\2\2\2\u077c"+
		"\u0771\3\2\2\2\u077c\u0772\3\2\2\2\u077c\u0773\3\2\2\2\u077c\u0774\3\2"+
		"\2\2\u077c\u0775\3\2\2\2\u077c\u0776\3\2\2\2\u077c\u0777\3\2\2\2\u077c"+
		"\u0778\3\2\2\2\u077c\u0779\3\2\2\2\u077c\u077a\3\2\2\2\u077c\u077b\3\2"+
		"\2\2\u077d\u00cf\3\2\2\2\u077e\u077f\7\u00ae\2\2\u077f\u00d1\3\2\2\2\u0780"+
		"\u0782\7\u0080\2\2\u0781\u0780\3\2\2\2\u0781\u0782\3\2\2\2\u0782\u0783"+
		"\3\2\2\2\u0783\u0784\5\u00d0i\2\u0784\u00d3\3\2\2\2\u0785\u0786\7C\2\2"+
		"\u0786\u00d5\3\2\2\2\u0787\u078b\5\20\t\2\u0788\u078b\5 \21\2\u0789\u078b"+
		"\5\22\n\2\u078a\u0787\3\2\2\2\u078a\u0788\3\2\2\2\u078a\u0789\3\2\2\2"+
		"\u078b\u00d7\3\2\2\2\u078c\u078f\5\f\7\2\u078d\u078f\5\16\b\2\u078e\u078c"+
		"\3\2\2\2\u078e\u078d\3\2\2\2\u078f\u00d9\3\2\2\2\u0790\u0795\5\u00ecw"+
		"\2\u0791\u0792\7\23\2\2\u0792\u0794\5\u00ecw\2\u0793\u0791\3\2\2\2\u0794"+
		"\u0797\3\2\2\2\u0795\u0793\3\2\2\2\u0795\u0796\3\2\2\2\u0796\u00db\3\2"+
		"\2\2\u0797\u0795\3\2\2\2\u0798\u079b\5\u00e2r\2\u0799\u079b\5\u016a\u00b6"+
		"\2\u079a\u0798\3\2\2\2\u079a\u0799\3\2\2\2\u079b\u00dd\3\2\2\2\u079c\u079d"+
		"\6p\'\3\u079d\u079e\7#\2\2\u079e\u079f\5\u00e0q\2\u079f\u00df\3\2\2\2"+
		"\u07a0\u07a1\6q(\3\u07a1\u07a2\5\u00dco\2\u07a2\u00e1\3\2\2\2\u07a3\u07a7"+
		"\5\u00e8u\2\u07a4\u07a7\5\u00ecw\2\u07a5\u07a7\5\u00eex\2\u07a6\u07a3"+
		"\3\2\2\2\u07a6\u07a4\3\2\2\2\u07a6\u07a5\3\2\2\2\u07a7\u00e3\3\2\2\2\u07a8"+
		"\u07a9\t\7\2\2\u07a9\u00e5\3\2\2\2\u07aa\u07ab\t\b\2\2\u07ab\u00e7\3\2"+
		"\2\2\u07ac\u07ad\t\t\2\2\u07ad\u00e9\3\2\2\2\u07ae\u07af\t\n\2\2\u07af"+
		"\u00eb\3\2\2\2\u07b0\u07b1\7\u00ae\2\2\u07b1\u00ed\3\2\2\2\u07b2\u07b3"+
		"\7\u00ad\2\2\u07b3\u00ef\3\2\2\2\u07b4\u07b9\5\u00f2z\2\u07b5\u07b6\7"+
		"\23\2\2\u07b6\u07b8\5\u00f2z\2\u07b7\u07b5\3\2\2\2\u07b8\u07bb\3\2\2\2"+
		"\u07b9\u07b7\3\2\2\2\u07b9\u07ba\3\2\2\2\u07ba\u00f1\3\2\2\2\u07bb\u07b9"+
		"\3\2\2\2\u07bc\u07c2\5\u00f8}\2\u07bd\u07bf\7\u0080\2\2\u07be\u07bd\3"+
		"\2\2\2\u07be\u07bf\3\2\2\2\u07bf\u07c0\3\2\2\2\u07c0\u07c2\5\u00f4{\2"+
		"\u07c1\u07bc\3\2\2\2\u07c1\u07be\3\2\2\2\u07c2\u00f3\3\2\2\2\u07c3\u07c6"+
		"\5\u00f6|\2\u07c4\u07c6\58\35\2\u07c5\u07c3\3\2\2\2\u07c5\u07c4\3\2\2"+
		"\2\u07c6\u00f5\3\2\2\2\u07c7\u07ca\5\u00e8u\2\u07c8\u07c9\7/\2\2\u07c9"+
		"\u07cb\5\u0134\u009b\2\u07ca\u07c8\3\2\2\2\u07ca\u07cb\3\2\2\2\u07cb\u00f7"+
		"\3\2\2\2\u07cc\u07cd\5\u00d4k\2\u07cd\u07ce\5\u00e8u\2\u07ce\u00f9\3\2"+
		"\2\2\u07cf\u07d2\5\u00caf\2\u07d0\u07d2\5\u00fc\177\2\u07d1\u07cf\3\2"+
		"\2\2\u07d1\u07d0\3\2\2\2\u07d2\u00fb\3\2\2\2\u07d3\u07d4\b\177\1\2\u07d4"+
		"\u07d5\7Q\2\2\u07d5\u07de\3\2\2\2\u07d6\u07d7\f\4\2\2\u07d7\u07d8\7\30"+
		"\2\2\u07d8\u07dd\7\31\2\2\u07d9\u07da\f\3\2\2\u07da\u07db\7\32\2\2\u07db"+
		"\u07dd\7\33\2\2\u07dc\u07d6\3\2\2\2\u07dc\u07d9\3\2\2\2\u07dd\u07e0\3"+
		"\2\2\2\u07de\u07dc\3\2\2\2\u07de\u07df\3\2\2\2\u07df\u00fd\3\2\2\2\u07e0"+
		"\u07de\3\2\2\2\u07e1\u07e7\5\u0100\u0081\2\u07e2\u07e3\5\u0098M\2\u07e3"+
		"\u07e4\5\u0100\u0081\2\u07e4\u07e6\3\2\2\2\u07e5\u07e2\3\2\2\2\u07e6\u07e9"+
		"\3\2\2\2\u07e7\u07e5\3\2\2\2\u07e7\u07e8\3\2\2\2\u07e8\u00ff\3\2\2\2\u07e9"+
		"\u07e7\3\2\2\2\u07ea\u07eb\5\u0116\u008c\2\u07eb\u07ec\5\u0098M\2\u07ec"+
		"\u07ee\3\2\2\2\u07ed\u07ea\3\2\2\2\u07ee\u07f1\3\2\2\2\u07ef\u07ed\3\2"+
		"\2\2\u07ef\u07f0\3\2\2\2\u07f0\u07f7\3\2\2\2\u07f1\u07ef\3\2\2\2\u07f2"+
		"\u07f3\5\u00acW\2\u07f3\u07f4\5\u0098M\2\u07f4\u07f6\3\2\2\2\u07f5\u07f2"+
		"\3\2\2\2\u07f6\u07f9\3\2\2\2\u07f7\u07f5\3\2\2\2\u07f7\u07f8\3\2\2\2\u07f8"+
		"\u07ff\3\2\2\2\u07f9\u07f7\3\2\2\2\u07fa\u0800\5\30\r\2\u07fb\u0800\5"+
		"\34\17\2\u07fc\u0800\5.\30\2\u07fd\u0800\5,\27\2\u07fe\u0800\5\26\f\2"+
		"\u07ff\u07fa\3\2\2\2\u07ff\u07fb\3\2\2\2\u07ff\u07fc\3\2\2\2\u07ff\u07fd"+
		"\3\2\2\2\u07ff\u07fe\3\2\2\2\u0800\u0101\3\2\2\2\u0801\u0807\5\u0104\u0083"+
		"\2\u0802\u0803\5\u0098M\2\u0803\u0804\5\u0104\u0083\2\u0804\u0806\3\2"+
		"\2\2\u0805\u0802\3\2\2\2\u0806\u0809\3\2\2\2\u0807\u0805\3\2\2\2\u0807"+
		"\u0808\3\2\2\2\u0808\u0103\3\2\2\2\u0809\u0807\3\2\2\2\u080a\u080b\5\u0116"+
		"\u008c\2\u080b\u080c\5\u0098M\2\u080c\u080e\3\2\2\2\u080d\u080a\3\2\2"+
		"\2\u080e\u0811\3\2\2\2\u080f\u080d\3\2\2\2\u080f\u0810\3\2\2\2\u0810\u0817"+
		"\3\2\2\2\u0811\u080f\3\2\2\2\u0812\u0813\5\u00acW\2\u0813\u0814\5\u0098"+
		"M\2\u0814\u0816\3\2\2\2\u0815\u0812\3\2\2\2\u0816\u0819\3\2\2\2\u0817"+
		"\u0815\3\2\2\2\u0817\u0818\3\2\2\2\u0818\u081d\3\2\2\2\u0819\u0817\3\2"+
		"\2\2\u081a\u081e\5\36\20\2\u081b\u081e\5\32\16\2\u081c\u081e\5\60\31\2"+
		"\u081d\u081a\3\2\2\2\u081d\u081b\3\2\2\2\u081d\u081c\3\2\2\2\u081e\u0105"+
		"\3\2\2\2\u081f\u0820\7\13\2\2\u0820\u082a\5\u01ca\u00e6\2\u0821\u0822"+
		"\7\f\2\2\u0822\u082a\5\u01e4\u00f3\2\u0823\u0824\7\r\2\2\u0824\u082a\5"+
		"\u0108\u0085\2\u0825\u0826\7\16\2\2\u0826\u082a\5\u0108\u0085\2\u0827"+
		"\u0828\7\17\2\2\u0828\u082a\5\u010c\u0087\2\u0829\u081f\3\2\2\2\u0829"+
		"\u0821\3\2\2\2\u0829\u0823\3\2\2\2\u0829\u0825\3\2\2\2\u0829\u0827\3\2"+
		"\2\2\u082a\u0107\3\2\2\2\u082b\u082d\5\u00e2r\2\u082c\u082e\5\u010a\u0086"+
		"\2\u082d\u082c\3\2\2\2\u082d\u082e\3\2\2\2\u082e\u0109\3\2\2\2\u082f\u0830"+
		"\7s\2\2\u0830\u0831\5\u0170\u00b9\2\u0831\u0832\7\21\2\2\u0832\u0837\5"+
		"\u01b2\u00da\2\u0833\u0834\7\25\2\2\u0834\u0836\5\u01b2\u00da\2\u0835"+
		"\u0833\3\2\2\2\u0836\u0839\3\2\2\2\u0837\u0835\3\2\2\2\u0837\u0838\3\2"+
		"\2\2\u0838\u010b\3\2\2\2\u0839\u0837\3\2\2\2\u083a\u083f\5\u0198\u00cd"+
		"\2\u083b\u083c\7\25\2\2\u083c\u083e\5\u0198\u00cd\2\u083d\u083b\3\2\2"+
		"\2\u083e\u0841\3\2\2\2\u083f\u083d\3\2\2\2\u083f\u0840\3\2\2\2\u0840\u0843"+
		"\3\2\2\2\u0841\u083f\3\2\2\2\u0842\u0844\5\u010e\u0088\2\u0843\u0842\3"+
		"\2\2\2\u0843\u0844\3\2\2\2\u0844\u010d\3\2\2\2\u0845\u0846\7s\2\2\u0846"+
		"\u0847\5\u0170\u00b9\2\u0847\u0849\7\21\2\2\u0848\u084a\7%\2\2\u0849\u0848"+
		"\3\2\2\2\u0849\u084a\3\2\2\2\u084a\u084b\3\2\2\2\u084b\u0850\5\u0198\u00cd"+
		"\2\u084c\u084d\7%\2\2\u084d\u084f\5\u0198\u00cd\2\u084e\u084c\3\2\2\2"+
		"\u084f\u0852\3\2\2\2\u0850\u084e\3\2\2\2\u0850\u0851\3\2\2\2\u0851\u0855"+
		"\3\2\2\2\u0852\u0850\3\2\2\2\u0853\u0854\7\25\2\2\u0854\u0856\5\u0198"+
		"\u00cd\2\u0855\u0853\3\2\2\2\u0855\u0856\3\2\2\2\u0856\u010f\3\2\2\2\u0857"+
		"\u085c\5\u00e8u\2\u0858\u0859\7\23\2\2\u0859\u085b\5\u00e8u\2\u085a\u0858"+
		"\3\2\2\2\u085b\u085e\3\2\2\2\u085c\u085a\3\2\2\2\u085c\u085d\3\2\2\2\u085d"+
		"\u0111\3\2\2\2\u085e\u085c\3\2\2\2\u085f\u0864\5\u00eav\2\u0860\u0861"+
		"\7\23\2\2\u0861\u0863\5\u00eav\2\u0862\u0860\3\2\2\2\u0863\u0866\3\2\2"+
		"\2\u0864\u0862\3\2\2\2\u0864\u0865\3\2\2\2\u0865\u0113\3\2\2\2\u0866\u0864"+
		"\3\2\2\2\u0867\u086c\5*\26\2\u0868\u086c\5.\30\2\u0869\u086c\5\60\31\2"+
		"\u086a\u086c\5\62\32\2\u086b\u0867\3\2\2\2\u086b\u0868\3\2\2\2\u086b\u0869"+
		"\3\2\2\2\u086b\u086a\3\2\2\2\u086c\u0115\3\2\2\2\u086d\u086e\7\n\2\2\u086e"+
		"\u0117\3\2\2\2\u086f\u0875\5\u011a\u008e\2\u0870\u0871\5\u0098M\2\u0871"+
		"\u0872\5\u011a\u008e\2\u0872\u0874\3\2\2\2\u0873\u0870\3\2\2\2\u0874\u0877"+
		"\3\2\2\2\u0875\u0873\3\2\2\2\u0875\u0876\3\2\2\2\u0876\u0119\3\2\2\2\u0877"+
		"\u0875\3\2\2\2\u0878\u0879\7\13\2\2\u0879\u0883\5\u01b4\u00db\2\u087a"+
		"\u087b\7\f\2\2\u087b\u0883\5\u01d0\u00e9\2\u087c\u087d\7\r\2\2\u087d\u0883"+
		"\5\u011c\u008f\2\u087e\u087f\7\16\2\2\u087f\u0883\5\u011c\u008f\2\u0880"+
		"\u0881\7\17\2\2\u0881\u0883\5\u011e\u0090\2\u0882\u0878\3\2\2\2\u0882"+
		"\u087a\3\2\2\2\u0882\u087c\3\2\2\2\u0882\u087e\3\2\2\2\u0882\u0880\3\2"+
		"\2\2\u0883\u011b\3\2\2\2\u0884\u0886\5\u019a\u00ce\2\u0885\u0887\7\22"+
		"\2\2\u0886\u0885\3\2\2\2\u0886\u0887\3\2\2\2\u0887\u0889\3\2\2\2\u0888"+
		"\u088a\5\u010a\u0086\2\u0889\u0888\3\2\2\2\u0889\u088a\3\2\2\2\u088a\u011d"+
		"\3\2\2\2\u088b\u088d\5\u0180\u00c1\2\u088c\u088e\7\22\2\2\u088d\u088c"+
		"\3\2\2\2\u088d\u088e\3\2\2\2\u088e\u0890\3\2\2\2\u088f\u0891\5\u010e\u0088"+
		"\2\u0890\u088f\3\2\2\2\u0890\u0891\3\2\2\2\u0891\u011f\3\2\2\2\u0892\u0898"+
		"\5:\36\2\u0893\u0894\5\u0098M\2\u0894\u0895\5:\36\2\u0895\u0897\3\2\2"+
		"\2\u0896\u0893\3\2\2\2\u0897\u089a\3\2\2\2\u0898\u0896\3\2\2\2\u0898\u0899"+
		"\3\2\2\2\u0899\u0121\3\2\2\2\u089a\u0898\3\2\2\2\u089b\u08a1\5\64\33\2"+
		"\u089c\u089d\5\u0098M\2\u089d\u089e\5\64\33\2\u089e\u08a0\3\2\2\2\u089f"+
		"\u089c\3\2\2\2\u08a0\u08a3\3\2\2\2\u08a1\u089f\3\2\2\2\u08a1\u08a2\3\2"+
		"\2\2\u08a2\u0123\3\2\2\2\u08a3\u08a1\3\2\2\2\u08a4\u08aa\5H%\2\u08a5\u08a6"+
		"\5\u0098M\2\u08a6\u08a7\5H%\2\u08a7\u08a9\3\2\2\2\u08a8\u08a5\3\2\2\2"+
		"\u08a9\u08ac\3\2\2\2\u08aa\u08a8\3\2\2\2\u08aa\u08ab\3\2\2\2\u08ab\u0125"+
		"\3\2\2\2\u08ac\u08aa\3\2\2\2\u08ad\u08b3\5X-\2\u08ae\u08af\5\u0098M\2"+
		"\u08af\u08b0\5X-\2\u08b0\u08b2\3\2\2\2\u08b1\u08ae\3\2\2\2\u08b2\u08b5"+
		"\3\2\2\2\u08b3\u08b1\3\2\2\2\u08b3\u08b4\3\2\2\2\u08b4\u0127\3\2\2\2\u08b5"+
		"\u08b3\3\2\2\2\u08b6\u08b7\7\30\2\2\u08b7\u08b8\5\u012a\u0096\2\u08b8"+
		"\u08b9\7\24\2\2\u08b9\u08ba\5\u012a\u0096\2\u08ba\u08bb\7\31\2\2\u08bb"+
		"\u08c5\3\2\2\2\u08bc\u08bd\7\30\2\2\u08bd\u08be\5\u012c\u0097\2\u08be"+
		"\u08bf\7\31\2\2\u08bf\u08c5\3\2\2\2\u08c0\u08c1\7+\2\2\u08c1\u08c2\5\u012c"+
		"\u0097\2\u08c2\u08c3\7)\2\2\u08c3\u08c5\3\2\2\2\u08c4\u08b6\3\2\2\2\u08c4"+
		"\u08bc\3\2\2\2\u08c4\u08c0\3\2\2\2\u08c5\u0129\3\2\2\2\u08c6\u08de\7\u00ab"+
		"\2\2\u08c7\u08de\7\u00ac\2\2\u08c8\u08ca\7#\2\2\u08c9\u08c8\3\2\2\2\u08c9"+
		"\u08ca\3\2\2\2\u08ca\u08cb\3\2\2\2\u08cb\u08de\7\u00b6\2\2\u08cc\u08de"+
		"\7\u00b7\2\2\u08cd\u08de\7\u00aa\2\2\u08ce\u08de\7\u00bb\2\2\u08cf\u08de"+
		"\7\u00ba\2\2\u08d0\u08de\7\u00b3\2\2\u08d1\u08d3\7#\2\2\u08d2\u08d1\3"+
		"\2\2\2\u08d2\u08d3\3\2\2\2\u08d3\u08d4\3\2\2\2\u08d4\u08de\7\u00b8\2\2"+
		"\u08d5\u08de\7\u00b9\2\2\u08d6\u08de\7\u00a9\2\2\u08d7\u08de\7\u00bc\2"+
		"\2\u08d8\u08de\7\u00b5\2\2\u08d9\u08de\7\u00b4\2\2\u08da\u08de\5\u00ee"+
		"x\2\u08db\u08de\5\u00a0Q\2\u08dc\u08de\5\u00a2R\2\u08dd\u08c6\3\2\2\2"+
		"\u08dd\u08c7\3\2\2\2\u08dd\u08c9\3\2\2\2\u08dd\u08cc\3\2\2\2\u08dd\u08cd"+
		"\3\2\2\2\u08dd\u08ce\3\2\2\2\u08dd\u08cf\3\2\2\2\u08dd\u08d0\3\2\2\2\u08dd"+
		"\u08d2\3\2\2\2\u08dd\u08d5\3\2\2\2\u08dd\u08d6\3\2\2\2\u08dd\u08d7\3\2"+
		"\2\2\u08dd\u08d8\3\2\2\2\u08dd\u08d9\3\2\2\2\u08dd\u08da\3\2\2\2\u08dd"+
		"\u08db\3\2\2\2\u08dd\u08dc\3\2\2\2\u08de\u012b\3\2\2\2\u08df\u08e4\5\u012a"+
		"\u0096\2\u08e0\u08e1\7\23\2\2\u08e1\u08e3\5\u012a\u0096\2\u08e2\u08e0"+
		"\3\2\2\2\u08e3\u08e6\3\2\2\2\u08e4\u08e2\3\2\2\2\u08e4\u08e5\3\2\2\2\u08e5"+
		"\u012d\3\2\2\2\u08e6\u08e4\3\2\2\2\u08e7\u08e8\t\13\2\2\u08e8\u012f\3"+
		"\2\2\2\u08e9\u08ea\5\u00d0i\2\u08ea\u08eb\7\25\2\2\u08eb\u08ed\3\2\2\2"+
		"\u08ec\u08e9\3\2\2\2\u08ec\u08ed\3\2\2\2\u08ed\u08ee\3\2\2\2\u08ee\u08ef"+
		"\7\u009a\2\2\u08ef\u0131\3\2\2\2\u08f0\u08f1\7\26\2\2\u08f1\u08f2\5^\60"+
		"\2\u08f2\u08f3\7\27\2\2\u08f3\u0133\3\2\2\2\u08f4\u08f7\5\u012a\u0096"+
		"\2\u08f5\u08f7\5\u0136\u009c\2\u08f6\u08f4\3\2\2\2\u08f6\u08f5\3\2\2\2"+
		"\u08f7\u0135\3\2\2\2\u08f8\u08ff\5\u00c8e\2\u08f9\u08ff\5\u00c2b\2\u08fa"+
		"\u08ff\5\u00c4c\2\u08fb\u08ff\5\u013a\u009e\2\u08fc\u08ff\5\u013c\u009f"+
		"\2\u08fd\u08ff\5\u0138\u009d\2\u08fe\u08f8\3\2\2\2\u08fe\u08f9\3\2\2\2"+
		"\u08fe\u08fa\3\2\2\2\u08fe\u08fb\3\2\2\2\u08fe\u08fc\3\2\2\2\u08fe\u08fd"+
		"\3\2\2\2\u08ff\u0137\3\2\2\2\u0900\u0902\7\u0080\2\2\u0901\u0900\3\2\2"+
		"\2\u0901\u0902\3\2\2\2\u0902\u0903\3\2\2\2\u0903\u0905\7\26\2\2\u0904"+
		"\u0906\5\u013e\u00a0\2\u0905\u0904\3\2\2\2\u0905\u0906\3\2\2\2\u0906\u0907"+
		"\3\2\2\2\u0907\u0908\7\27\2\2\u0908\u0139\3\2\2\2\u0909\u090b\7\u0080"+
		"\2\2\u090a\u0909\3\2\2\2\u090a\u090b\3\2\2\2\u090b\u0914\3\2\2\2\u090c"+
		"\u090d\7+\2\2\u090d\u090e\5\u0146\u00a4\2\u090e\u090f\7)\2\2\u090f\u0915"+
		"\3\2\2\2\u0910\u0915\7.\2\2\u0911\u0912\7+\2\2\u0912\u0913\7\21\2\2\u0913"+
		"\u0915\7)\2\2\u0914\u090c\3\2\2\2\u0914\u0910\3\2\2\2\u0914\u0911\3\2"+
		"\2\2\u0915\u013b\3\2\2\2\u0916\u0918\7\32\2\2\u0917\u0919\5\u0140\u00a1"+
		"\2\u0918\u0917\3\2\2\2\u0918\u0919\3\2\2\2\u0919\u091a\3\2\2\2\u091a\u091b"+
		"\7\33\2\2\u091b\u013d\3\2\2\2\u091c\u091d\5^\60\2\u091d\u0926\7\23\2\2"+
		"\u091e\u0923\5^\60\2\u091f\u0920\7\23\2\2\u0920\u0922\5^\60\2\u0921\u091f"+
		"\3\2\2\2\u0922\u0925\3\2\2\2\u0923\u0921\3\2\2\2\u0923\u0924\3\2\2\2\u0924"+
		"\u0927\3\2\2\2\u0925\u0923\3\2\2\2\u0926\u091e\3\2\2\2\u0926\u0927\3\2"+
		"\2\2\u0927\u013f\3\2\2\2\u0928\u092d\5\u0142\u00a2\2\u0929\u092a\7\23"+
		"\2\2\u092a\u092c\5\u0142\u00a2\2\u092b\u0929\3\2\2\2\u092c\u092f\3\2\2"+
		"\2\u092d\u092b\3\2\2\2\u092d\u092e\3\2\2\2\u092e\u0141\3\2\2\2\u092f\u092d"+
		"\3\2\2\2\u0930\u0931\5\u0144\u00a3\2\u0931\u0932\7\21\2\2\u0932\u0933"+
		"\5^\60\2\u0933\u0143\3\2\2\2\u0934\u0937\5\u00dco\2\u0935\u0937\7\u00b3"+
		"\2\2\u0936\u0934\3\2\2\2\u0936\u0935\3\2\2\2\u0937\u0145\3\2\2\2\u0938"+
		"\u093d\5\u0148\u00a5\2\u0939\u093a\7\23\2\2\u093a\u093c\5\u0148\u00a5"+
		"\2\u093b\u0939\3\2\2\2\u093c\u093f\3\2\2\2\u093d\u093b\3\2\2\2\u093d\u093e"+
		"\3\2\2\2\u093e\u0147\3\2\2\2\u093f\u093d\3\2\2\2\u0940\u0941\5\u014a\u00a6"+
		"\2\u0941\u0942\7\21\2\2\u0942\u0943\5^\60\2\u0943\u0149\3\2\2\2\u0944"+
		"\u0947\5\u00dco\2\u0945\u0947\7\u00b3\2\2\u0946\u0944\3\2\2\2\u0946\u0945"+
		"\3\2\2\2\u0947\u014b\3\2\2\2\u0948\u0949\5^\60\2\u0949\u094a\7\21\2\2"+
		"\u094a\u094b\5^\60\2\u094b\u0952\3\2\2\2\u094c\u094d\5^\60\2\u094d\u094e"+
		"\7\21\2\2\u094e\u0952\3\2\2\2\u094f\u0950\7\21\2\2\u0950\u0952\5^\60\2"+
		"\u0951\u0948\3\2\2\2\u0951\u094c\3\2\2\2\u0951\u094f\3\2\2\2\u0952\u014d"+
		"\3\2\2\2\u0953\u0954\5\u00e8u\2\u0954\u0955\5\u0176\u00bc\2\u0955\u0956"+
		"\5^\60\2\u0956\u014f\3\2\2\2\u0957\u0958\b\u00a9\1\2\u0958\u0959\5\u00e8"+
		"u\2\u0959\u095e\3\2\2\2\u095a\u095b\f\3\2\2\u095b\u095d\5\u0092J\2\u095c"+
		"\u095a\3\2\2\2\u095d\u0960\3\2\2\2\u095e\u095c\3\2\2\2\u095e\u095f\3\2"+
		"\2\2\u095f\u0151\3\2\2\2\u0960\u095e\3\2\2\2\u0961\u0962\6\u00aa,\3\u0962"+
		"\u0963\7\u00af\2\2\u0963\u0966\5\u00fa~\2\u0964\u0966\5^\60\2\u0965\u0961"+
		"\3\2\2\2\u0965\u0964\3\2\2\2\u0966\u0153\3\2\2\2\u0967\u0968\6\u00ab-"+
		"\3\u0968\u0969\7\u00af\2\2\u0969\u0155\3\2\2\2\u096a\u096b\5\u0158\u00ad"+
		"\2\u096b\u096c\5^\60\2\u096c\u0973\3\2\2\2\u096d\u096e\5\u0158\u00ad\2"+
		"\u096e\u096f\7\32\2\2\u096f\u0970\5\u0120\u0091\2\u0970\u0971\7\33\2\2"+
		"\u0971\u0973\3\2\2\2\u0972\u096a\3\2\2\2\u0972\u096d";
	private static final String _serializedATNSegment1 =
		"\3\2\2\2\u0973\u0157\3\2\2\2\u0974\u0975\5\u015a\u00ae\2\u0975\u0976\5"+
		"\u009aN\2\u0976\u0977\7\66\2\2\u0977\u0978\5\u009aN\2\u0978\u0159\3\2"+
		"\2\2\u0979\u0980\5\u00e8u\2\u097a\u097c\7\26\2\2\u097b\u097d\5\u0110\u0089"+
		"\2\u097c\u097b\3\2\2\2\u097c\u097d\3\2\2\2\u097d\u097e\3\2\2\2\u097e\u0980"+
		"\7\27\2\2\u097f\u0979\3\2\2\2\u097f\u097a\3\2\2\2\u0980\u015b\3\2\2\2"+
		"\u0981\u0984\5l\67\2\u0982\u0984\5\u0156\u00ac\2\u0983\u0981\3\2\2\2\u0983"+
		"\u0982\3\2\2\2\u0984\u015d\3\2\2\2\u0985\u0986\7\u008e\2\2\u0986\u0987"+
		"\7E\2\2\u0987\u0988\7s\2\2\u0988\u0989\5^\60\2\u0989\u015f\3\2\2\2\u098a"+
		"\u098b\7\u008e\2\2\u098b\u098c\7N\2\2\u098c\u098d\7s\2\2\u098d\u098e\5"+
		"^\60\2\u098e\u0161\3\2\2\2\u098f\u0990\7\u008e\2\2\u0990\u0991\7\u0087"+
		"\2\2\u0991\u0992\7s\2\2\u0992\u0993\5^\60\2\u0993\u0163\3\2\2\2\u0994"+
		"\u0999\5\u0166\u00b4\2\u0995\u0996\7\23\2\2\u0996\u0998\5\u0166\u00b4"+
		"\2\u0997\u0995\3\2\2\2\u0998\u099b\3\2\2\2\u0999\u0997\3\2\2\2\u0999\u099a"+
		"\3\2\2\2\u099a\u0165\3\2\2\2\u099b\u0999\3\2\2\2\u099c\u09a1\5\u00e8u"+
		"\2\u099d\u099e\7\25\2\2\u099e\u09a0\5\u00e8u\2\u099f\u099d\3\2\2\2\u09a0"+
		"\u09a3\3\2\2\2\u09a1\u099f\3\2\2\2\u09a1\u09a2\3\2\2\2\u09a2\u09a5\3\2"+
		"\2\2\u09a3\u09a1\3\2\2\2\u09a4\u09a6\t\f\2\2\u09a5\u09a4\3\2\2\2\u09a5"+
		"\u09a6\3\2\2\2\u09a6\u0167\3\2\2\2\u09a7\u09ae\7\"\2\2\u09a8\u09ae\7#"+
		"\2\2\u09a9\u09ae\5\u0178\u00bd\2\u09aa\u09ae\5\u017a\u00be\2\u09ab\u09ae"+
		"\5\u017c\u00bf\2\u09ac\u09ae\5\u017e\u00c0\2\u09ad\u09a7\3\2\2\2\u09ad"+
		"\u09a8\3\2\2\2\u09ad\u09a9\3\2\2\2\u09ad\u09aa\3\2\2\2\u09ad\u09ab\3\2"+
		"\2\2\u09ad\u09ac\3\2\2\2\u09ae\u0169\3\2\2\2\u09af\u09b0\t\r\2\2\u09b0"+
		"\u016b\3\2\2\2\u09b1\u09b2\7\u00af\2\2\u09b2\u09b3\6\u00b7.\3\u09b3\u016d"+
		"\3\2\2\2\u09b4\u09b5\7\u00af\2\2\u09b5\u09b6\6\u00b8/\3\u09b6\u016f\3"+
		"\2\2\2\u09b7\u09b8\7\u00af\2\2\u09b8\u09b9\6\u00b9\60\3\u09b9\u0171\3"+
		"\2\2\2\u09ba\u09bb\7\u00af\2\2\u09bb\u09bc\6\u00ba\61\3\u09bc\u0173\3"+
		"\2\2\2\u09bd\u09be\7\u00af\2\2\u09be\u09bf\6\u00bb\62\3\u09bf\u0175\3"+
		"\2\2\2\u09c0\u09c1\7/\2\2\u09c1\u0177\3\2\2\2\u09c2\u09c3\7$\2\2\u09c3"+
		"\u0179\3\2\2\2\u09c4\u09c5\7%\2\2\u09c5\u017b\3\2\2\2\u09c6\u09c7\7&\2"+
		"\2\u09c7\u017d\3\2\2\2\u09c8\u09c9\t\16\2\2\u09c9\u017f\3\2\2\2\u09ca"+
		"\u09cb\7\u0091\2\2\u09cb\u09cc\5\u0182\u00c2\2\u09cc\u09cd\7\22\2\2\u09cd"+
		"\u09d2\3\2\2\2\u09ce\u09cf\5\u0182\u00c2\2\u09cf\u09d0\7\22\2\2\u09d0"+
		"\u09d2\3\2\2\2\u09d1\u09ca\3\2\2\2\u09d1\u09ce\3\2\2\2\u09d2\u0181\3\2"+
		"\2\2\u09d3\u09d4\b\u00c2\1\2\u09d4\u09d5\5\u0184\u00c3\2\u09d5\u09da\3"+
		"\2\2\2\u09d6\u09d7\f\3\2\2\u09d7\u09d9\5\u018a\u00c6\2\u09d8\u09d6\3\2"+
		"\2\2\u09d9\u09dc\3\2\2\2\u09da\u09d8\3\2\2\2\u09da\u09db\3\2\2\2\u09db"+
		"\u0183\3\2\2\2\u09dc\u09da\3\2\2\2\u09dd\u09e5\5\u0186\u00c4\2\u09de\u09e5"+
		"\5\u0188\u00c5\2\u09df\u09e5\5\u0192\u00ca\2\u09e0\u09e5\5\u0194\u00cb"+
		"\2\u09e1\u09e5\5\u0196\u00cc\2\u09e2\u09e5\5\u018c\u00c7\2\u09e3\u09e5"+
		"\5\u0190\u00c9\2\u09e4\u09dd\3\2\2\2\u09e4\u09de\3\2\2\2\u09e4\u09df\3"+
		"\2\2\2\u09e4\u09e0\3\2\2\2\u09e4\u09e1\3\2\2\2\u09e4\u09e2\3\2\2\2\u09e4"+
		"\u09e3\3\2\2\2\u09e5\u0185\3\2\2\2\u09e6\u09e7\5\u012e\u0098\2\u09e7\u0187"+
		"\3\2\2\2\u09e8\u09e9\5\u016c\u00b7\2\u09e9\u09ea\5\u018c\u00c7\2\u09ea"+
		"\u0189\3\2\2\2\u09eb\u09ec\7\25\2\2\u09ec\u09f1\5\u018c\u00c7\2\u09ed"+
		"\u09ee\7\25\2\2\u09ee\u09f1\5\u0198\u00cd\2\u09ef\u09f1\5\u0190\u00c9"+
		"\2\u09f0\u09eb\3\2\2\2\u09f0\u09ed\3\2\2\2\u09f0\u09ef\3\2\2\2\u09f1\u018b"+
		"\3\2\2\2\u09f2\u09f3\5\u0198\u00cd\2\u09f3\u09f5\7\26\2\2\u09f4\u09f6"+
		"\5\u018e\u00c8\2\u09f5\u09f4\3\2\2\2\u09f5\u09f6\3\2\2\2\u09f6\u09f7\3"+
		"\2\2\2\u09f7\u09f8\7\27\2\2\u09f8\u018d\3\2\2\2\u09f9\u09fa\b\u00c8\1"+
		"\2\u09fa\u09fb\5\u0182\u00c2\2\u09fb\u0a01\3\2\2\2\u09fc\u09fd\f\3\2\2"+
		"\u09fd\u09fe\7\23\2\2\u09fe\u0a00\5\u0182\u00c2\2\u09ff\u09fc\3\2\2\2"+
		"\u0a00\u0a03\3\2\2\2\u0a01\u09ff\3\2\2\2\u0a01\u0a02\3\2\2\2\u0a02\u018f"+
		"\3\2\2\2\u0a03\u0a01\3\2\2\2\u0a04\u0a05\7\30\2\2\u0a05\u0a06\5\u0182"+
		"\u00c2\2\u0a06\u0a07\7\31\2\2\u0a07\u0191\3\2\2\2\u0a08\u0a09\7\26\2\2"+
		"\u0a09\u0a0a\5\u0182\u00c2\2\u0a0a\u0a0b\7\27\2\2\u0a0b\u0193\3\2\2\2"+
		"\u0a0c\u0a0d\5\u0198\u00cd\2\u0a0d\u0195\3\2\2\2\u0a0e\u0a14\7\u00b6\2"+
		"\2\u0a0f\u0a14\7\u00b8\2\2\u0a10\u0a14\7\u00b3\2\2\u0a11\u0a14\7\u00a9"+
		"\2\2\u0a12\u0a14\7\u00aa\2\2\u0a13\u0a0e\3\2\2\2\u0a13\u0a0f\3\2\2\2\u0a13"+
		"\u0a10\3\2\2\2\u0a13\u0a11\3\2\2\2\u0a13\u0a12\3\2\2\2\u0a14\u0197\3\2"+
		"\2\2\u0a15\u0a1b\7\u00af\2\2\u0a16\u0a1b\7\u00ad\2\2\u0a17\u0a1b\7\u00b1"+
		"\2\2\u0a18\u0a1b\7\u00ae\2\2\u0a19\u0a1b\5\u016a\u00b6\2\u0a1a\u0a15\3"+
		"\2\2\2\u0a1a\u0a16\3\2\2\2\u0a1a\u0a17\3\2\2\2\u0a1a\u0a18\3\2\2\2\u0a1a"+
		"\u0a19\3\2\2\2\u0a1b\u0199\3\2\2\2\u0a1c\u0a1d\7\u0091\2\2\u0a1d\u0a20"+
		"\5\u019c\u00cf\2\u0a1e\u0a20\5\u019c\u00cf\2\u0a1f\u0a1c\3\2\2\2\u0a1f"+
		"\u0a1e\3\2\2\2\u0a20\u019b\3\2\2\2\u0a21\u0a22\b\u00cf\1\2\u0a22\u0a23"+
		"\5\u019e\u00d0\2\u0a23\u0a28\3\2\2\2\u0a24\u0a25\f\3\2\2\u0a25\u0a27\5"+
		"\u01a2\u00d2\2\u0a26\u0a24\3\2\2\2\u0a27\u0a2a\3\2\2\2\u0a28\u0a26\3\2"+
		"\2\2\u0a28\u0a29\3\2\2\2\u0a29\u019d\3\2\2\2\u0a2a\u0a28\3\2\2\2\u0a2b"+
		"\u0a31\5\u01a0\u00d1\2\u0a2c\u0a31\5\u01ac\u00d7\2\u0a2d\u0a31\5\u01ae"+
		"\u00d8\2\u0a2e\u0a31\5\u01b0\u00d9\2\u0a2f\u0a31\5\u01a4\u00d3\2\u0a30"+
		"\u0a2b\3\2\2\2\u0a30\u0a2c\3\2\2\2\u0a30\u0a2d\3\2\2\2\u0a30\u0a2e\3\2"+
		"\2\2\u0a30\u0a2f\3\2\2\2\u0a31\u019f\3\2\2\2\u0a32\u0a33\5\u012e\u0098"+
		"\2\u0a33\u01a1\3\2\2\2\u0a34\u0a35\7\25\2\2\u0a35\u0a3b\5\u01a4\u00d3"+
		"\2\u0a36\u0a37\7\30\2\2\u0a37\u0a38\5\u019c\u00cf\2\u0a38\u0a39\7\31\2"+
		"\2\u0a39\u0a3b\3\2\2\2\u0a3a\u0a34\3\2\2\2\u0a3a\u0a36\3\2\2\2\u0a3b\u01a3"+
		"\3\2\2\2\u0a3c\u0a3d\5\u01b2\u00da\2\u0a3d\u0a3f\7\26\2\2\u0a3e\u0a40"+
		"\5\u01a6\u00d4\2\u0a3f\u0a3e\3\2\2\2\u0a3f\u0a40\3\2\2\2\u0a40\u0a41\3"+
		"\2\2\2\u0a41\u0a42\7\27\2\2\u0a42\u01a5\3\2\2\2\u0a43\u0a4a\5\u01a8\u00d5"+
		"\2\u0a44\u0a4a\5\u01aa\u00d6\2\u0a45\u0a46\5\u01a8\u00d5\2\u0a46\u0a47"+
		"\7\23\2\2\u0a47\u0a48\5\u01aa\u00d6\2\u0a48\u0a4a\3\2\2\2\u0a49\u0a43"+
		"\3\2\2\2\u0a49\u0a44\3\2\2\2\u0a49\u0a45\3\2\2\2\u0a4a\u01a7\3\2\2\2\u0a4b"+
		"\u0a4c\b\u00d5\1\2\u0a4c\u0a4d\5\u019c\u00cf\2\u0a4d\u0a53\3\2\2\2\u0a4e"+
		"\u0a4f\f\3\2\2\u0a4f\u0a50\7\23\2\2\u0a50\u0a52\5\u019c\u00cf\2\u0a51"+
		"\u0a4e\3\2\2\2\u0a52\u0a55\3\2\2\2\u0a53\u0a51\3\2\2\2\u0a53\u0a54\3\2"+
		"\2\2\u0a54\u01a9\3\2\2\2\u0a55\u0a53\3\2\2\2\u0a56\u0a57\b\u00d6\1\2\u0a57"+
		"\u0a58\5\u01b2\u00da\2\u0a58\u0a59\7/\2\2\u0a59\u0a5a\5\u019c\u00cf\2"+
		"\u0a5a\u0a63\3\2\2\2\u0a5b\u0a5c\f\3\2\2\u0a5c\u0a5d\7\23\2\2\u0a5d\u0a5e"+
		"\5\u01b2\u00da\2\u0a5e\u0a5f\7/\2\2\u0a5f\u0a60\5\u019c\u00cf\2\u0a60"+
		"\u0a62\3\2\2\2\u0a61\u0a5b\3\2\2\2\u0a62\u0a65\3\2\2\2\u0a63\u0a61\3\2"+
		"\2\2\u0a63\u0a64\3\2\2\2\u0a64\u01ab\3\2\2\2\u0a65\u0a63\3\2\2\2\u0a66"+
		"\u0a67\7\26\2\2\u0a67\u0a68\5\u019c\u00cf\2\u0a68\u0a69\7\27\2\2\u0a69"+
		"\u01ad\3\2\2\2\u0a6a\u0a6b\b\u00d8\1\2\u0a6b\u0a6e\7\u00b1\2\2\u0a6c\u0a6e"+
		"\5\u01b2\u00da\2\u0a6d\u0a6a\3\2\2\2\u0a6d\u0a6c\3\2\2\2\u0a6e\u0a74\3"+
		"\2\2\2\u0a6f\u0a70\f\3\2\2\u0a70\u0a71\7\25\2\2\u0a71\u0a73\5\u01b2\u00da"+
		"\2\u0a72\u0a6f\3\2\2\2\u0a73\u0a76\3\2\2\2\u0a74\u0a72\3\2\2\2\u0a74\u0a75"+
		"\3\2\2\2\u0a75\u01af\3\2\2\2\u0a76\u0a74\3\2\2\2\u0a77\u0a7d\7\u00b6\2"+
		"\2\u0a78\u0a7d\7\u00b8\2\2\u0a79\u0a7d\7\u00b3\2\2\u0a7a\u0a7d\7\u00a9"+
		"\2\2\u0a7b\u0a7d\7\u00aa\2\2\u0a7c\u0a77\3\2\2\2\u0a7c\u0a78\3\2\2\2\u0a7c"+
		"\u0a79\3\2\2\2\u0a7c\u0a7a\3\2\2\2\u0a7c\u0a7b\3\2\2\2\u0a7d\u01b1\3\2"+
		"\2\2\u0a7e\u0a84\7\u00af\2\2\u0a7f\u0a84\7\u00ad\2\2\u0a80\u0a84\7\u00b1"+
		"\2\2\u0a81\u0a84\7\u00ae\2\2\u0a82\u0a84\5\u016a\u00b6\2\u0a83\u0a7e\3"+
		"\2\2\2\u0a83\u0a7f\3\2\2\2\u0a83\u0a80\3\2\2\2\u0a83\u0a81\3\2\2\2\u0a83"+
		"\u0a82\3\2\2\2\u0a84\u01b3\3\2\2\2\u0a85\u0a86\7\u0091\2\2\u0a86\u0a87"+
		"\5\u01b6\u00dc\2\u0a87\u0a88\7\22\2\2\u0a88\u0a8d\3\2\2\2\u0a89\u0a8a"+
		"\5\u01b6\u00dc\2\u0a8a\u0a8b\7\22\2\2\u0a8b\u0a8d\3\2\2\2\u0a8c\u0a85"+
		"\3\2\2\2\u0a8c\u0a89\3\2\2\2\u0a8d\u01b5\3\2\2\2\u0a8e\u0a8f\b\u00dc\1"+
		"\2\u0a8f\u0a90\5\u01b8\u00dd\2\u0a90\u0a95\3\2\2\2\u0a91\u0a92\f\3\2\2"+
		"\u0a92\u0a94\5\u01be\u00e0\2\u0a93\u0a91\3\2\2\2\u0a94\u0a97\3\2\2\2\u0a95"+
		"\u0a93\3\2\2\2\u0a95\u0a96\3\2\2\2\u0a96\u01b7\3\2\2\2\u0a97\u0a95\3\2"+
		"\2\2\u0a98\u0a9e\5\u01ba\u00de\2\u0a99\u0a9e\5\u01bc\u00df\2\u0a9a\u0a9e"+
		"\5\u01c6\u00e4\2\u0a9b\u0a9e\5\u01c8\u00e5\2\u0a9c\u0a9e\5\u01cc\u00e7"+
		"\2\u0a9d\u0a98\3\2\2\2\u0a9d\u0a99\3\2\2\2\u0a9d\u0a9a\3\2\2\2\u0a9d\u0a9b"+
		"\3\2\2\2\u0a9d\u0a9c\3\2\2\2\u0a9e\u01b9\3\2\2\2\u0a9f\u0aa0\5\u012e\u0098"+
		"\2\u0aa0\u01bb\3\2\2\2\u0aa1\u0aa2\5\u016c\u00b7\2\u0aa2\u0aa3\5\u01c0"+
		"\u00e1\2\u0aa3\u01bd\3\2\2\2\u0aa4\u0aa5\7\25\2\2\u0aa5\u0aa8\5\u01c0"+
		"\u00e1\2\u0aa6\u0aa8\5\u01c4\u00e3\2\u0aa7\u0aa4\3\2\2\2\u0aa7\u0aa6\3"+
		"\2\2\2\u0aa8\u01bf\3\2\2\2\u0aa9\u0aaa\5\u01ce\u00e8\2\u0aaa\u0aac\7\26"+
		"\2\2\u0aab\u0aad\5\u01c2\u00e2\2\u0aac\u0aab\3\2\2\2\u0aac\u0aad\3\2\2"+
		"\2\u0aad\u0aae\3\2\2\2\u0aae\u0aaf\7\27\2\2\u0aaf\u01c1\3\2\2\2\u0ab0"+
		"\u0ab1\b\u00e2\1\2\u0ab1\u0ab2\5\u01b6\u00dc\2\u0ab2\u0ab8\3\2\2\2\u0ab3"+
		"\u0ab4\f\3\2\2\u0ab4\u0ab5\7\23\2\2\u0ab5\u0ab7\5\u01b6\u00dc\2\u0ab6"+
		"\u0ab3\3\2\2\2\u0ab7\u0aba\3\2\2\2\u0ab8\u0ab6\3\2\2\2\u0ab8\u0ab9\3\2"+
		"\2\2\u0ab9\u01c3\3\2\2\2\u0aba\u0ab8\3\2\2\2\u0abb\u0abc\7\30\2\2\u0abc"+
		"\u0abd\5\u01b6\u00dc\2\u0abd\u0abe\7\31\2\2\u0abe\u01c5\3\2\2\2\u0abf"+
		"\u0ac0\7\26\2\2\u0ac0\u0ac1\5\u01b6\u00dc\2\u0ac1\u0ac2\7\27\2\2\u0ac2"+
		"\u01c7\3\2\2\2\u0ac3\u0ac4\b\u00e5\1\2\u0ac4\u0ac5\5\u01ce\u00e8\2\u0ac5"+
		"\u0acb\3\2\2\2\u0ac6\u0ac7\f\3\2\2\u0ac7\u0ac8\7\25\2\2\u0ac8\u0aca\5"+
		"\u01ce\u00e8\2\u0ac9\u0ac6\3\2\2\2\u0aca\u0acd\3\2\2\2\u0acb\u0ac9\3\2"+
		"\2\2\u0acb\u0acc\3\2\2\2\u0acc\u01c9\3\2\2\2\u0acd\u0acb\3\2\2\2\u0ace"+
		"\u0acf\b\u00e6\1\2\u0acf\u0ad0\5\u01c8\u00e5\2\u0ad0\u0ad5\3\2\2\2\u0ad1"+
		"\u0ad2\f\3\2\2\u0ad2\u0ad4\7\u00b1\2\2\u0ad3\u0ad1\3\2\2\2\u0ad4\u0ad7"+
		"\3\2\2\2\u0ad5\u0ad3\3\2\2\2\u0ad5\u0ad6\3\2\2\2\u0ad6\u01cb\3\2\2\2\u0ad7"+
		"\u0ad5\3\2\2\2\u0ad8\u0ade\7\u00b6\2\2\u0ad9\u0ade\7\u00b8\2\2\u0ada\u0ade"+
		"\7\u00b3\2\2\u0adb\u0ade\7\u00a9\2\2\u0adc\u0ade\7\u00aa\2\2\u0add\u0ad8"+
		"\3\2\2\2\u0add\u0ad9\3\2\2\2\u0add\u0ada\3\2\2\2\u0add\u0adb\3\2\2\2\u0add"+
		"\u0adc\3\2\2\2\u0ade\u01cd\3\2\2\2\u0adf\u0ae5\7\u00af\2\2\u0ae0\u0ae5"+
		"\7\u00ad\2\2\u0ae1\u0ae5\7\u00b1\2\2\u0ae2\u0ae5\7\u00ae\2\2\u0ae3\u0ae5"+
		"\5\u016a\u00b6\2\u0ae4\u0adf\3\2\2\2\u0ae4\u0ae0\3\2\2\2\u0ae4\u0ae1\3"+
		"\2\2\2\u0ae4\u0ae2\3\2\2\2\u0ae4\u0ae3\3\2\2\2\u0ae5\u01cf\3\2\2\2\u0ae6"+
		"\u0ae7\7\u0091\2\2\u0ae7\u0ae8\5\u01d2\u00ea\2\u0ae8\u0ae9\7\22\2\2\u0ae9"+
		"\u0aee\3\2\2\2\u0aea\u0aeb\5\u01d2\u00ea\2\u0aeb\u0aec\7\22\2\2\u0aec"+
		"\u0aee\3\2\2\2\u0aed\u0ae6\3\2\2\2\u0aed\u0aea\3\2\2\2\u0aee\u01d1\3\2"+
		"\2\2\u0aef\u0af0\b\u00ea\1\2\u0af0\u0af1\5\u01d4\u00eb\2\u0af1\u0af6\3"+
		"\2\2\2\u0af2\u0af3\f\3\2\2\u0af3\u0af5\5\u01da\u00ee\2\u0af4\u0af2\3\2"+
		"\2\2\u0af5\u0af8\3\2\2\2\u0af6\u0af4\3\2\2\2\u0af6\u0af7\3\2\2\2\u0af7"+
		"\u01d3\3\2\2\2\u0af8\u0af6\3\2\2\2\u0af9\u0aff\5\u01d6\u00ec\2\u0afa\u0aff"+
		"\5\u01d8\u00ed\2\u0afb\u0aff\5\u01e2\u00f2\2\u0afc\u0aff\5\u01e4\u00f3"+
		"\2\u0afd\u0aff\5\u01e6\u00f4\2\u0afe\u0af9\3\2\2\2\u0afe\u0afa\3\2\2\2"+
		"\u0afe\u0afb\3\2\2\2\u0afe\u0afc\3\2\2\2\u0afe\u0afd\3\2\2\2\u0aff\u01d5"+
		"\3\2\2\2\u0b00\u0b01\5\u012e\u0098\2\u0b01\u01d7\3\2\2\2\u0b02\u0b03\5"+
		"\u016c\u00b7\2\u0b03\u0b04\5\u01dc\u00ef\2\u0b04\u01d9\3\2\2\2\u0b05\u0b06"+
		"\7\25\2\2\u0b06\u0b09\5\u01dc\u00ef\2\u0b07\u0b09\5\u01e0\u00f1\2\u0b08"+
		"\u0b05\3\2\2\2\u0b08\u0b07\3\2\2\2\u0b09\u01db\3\2\2\2\u0b0a\u0b0b\5\u01e8"+
		"\u00f5\2\u0b0b\u0b0d\7\26\2\2\u0b0c\u0b0e\5\u01de\u00f0\2\u0b0d\u0b0c"+
		"\3\2\2\2\u0b0d\u0b0e\3\2\2\2\u0b0e\u0b0f\3\2\2\2\u0b0f\u0b10\7\27\2\2"+
		"\u0b10\u01dd\3\2\2\2\u0b11\u0b12\b\u00f0\1\2\u0b12\u0b13\5\u01d2\u00ea"+
		"\2\u0b13\u0b19\3\2\2\2\u0b14\u0b15\f\3\2\2\u0b15\u0b16\7\23\2\2\u0b16"+
		"\u0b18\5\u01d2\u00ea\2\u0b17\u0b14\3\2\2\2\u0b18\u0b1b\3\2\2\2\u0b19\u0b17"+
		"\3\2\2\2\u0b19\u0b1a\3\2\2\2\u0b1a\u01df\3\2\2\2\u0b1b\u0b19\3\2\2\2\u0b1c"+
		"\u0b1d\7\30\2\2\u0b1d\u0b1e\5\u01d2\u00ea\2\u0b1e\u0b1f\7\31\2\2\u0b1f"+
		"\u01e1\3\2\2\2\u0b20\u0b21\7\26\2\2\u0b21\u0b22\5\u01d2\u00ea\2\u0b22"+
		"\u0b23\7\27\2\2\u0b23\u01e3\3\2\2\2\u0b24\u0b25\b\u00f3\1\2\u0b25\u0b28"+
		"\7\u00b1\2\2\u0b26\u0b28\5\u01e8\u00f5\2\u0b27\u0b24\3\2\2\2\u0b27\u0b26"+
		"\3\2\2\2\u0b28\u0b2e\3\2\2\2\u0b29\u0b2a\f\3\2\2\u0b2a\u0b2b\7\25\2\2"+
		"\u0b2b\u0b2d\5\u01e8\u00f5\2\u0b2c\u0b29\3\2\2\2\u0b2d\u0b30\3\2\2\2\u0b2e"+
		"\u0b2c\3\2\2\2\u0b2e\u0b2f\3\2\2\2\u0b2f\u01e5\3\2\2\2\u0b30\u0b2e\3\2"+
		"\2\2\u0b31\u0b37\7\u00b6\2\2\u0b32\u0b37\7\u00b8\2\2\u0b33\u0b37\7\u00b3"+
		"\2\2\u0b34\u0b37\7\u00a9\2\2\u0b35\u0b37\7\u00aa\2\2\u0b36\u0b31\3\2\2"+
		"\2\u0b36\u0b32\3\2\2\2\u0b36\u0b33\3\2\2\2\u0b36\u0b34\3\2\2\2\u0b36\u0b35"+
		"\3\2\2\2\u0b37\u01e7\3\2\2\2\u0b38\u0b3e\7\u00af\2\2\u0b39\u0b3e\7\u00ad"+
		"\2\2\u0b3a\u0b3e\7\u00b1\2\2\u0b3b\u0b3e\7\u00ae\2\2\u0b3c\u0b3e\5\u016a"+
		"\u00b6\2\u0b3d\u0b38\3\2\2\2\u0b3d\u0b39\3\2\2\2\u0b3d\u0b3a\3\2\2\2\u0b3d"+
		"\u0b3b\3\2\2\2\u0b3d\u0b3c\3\2\2\2\u0b3e\u01e9\3\2\2\2\u0b3f\u0b42\5\u01ec"+
		"\u00f7\2\u0b40\u0b42\5\u01ee\u00f8\2\u0b41\u0b3f\3\2\2\2\u0b41\u0b40\3"+
		"\2\2\2\u0b42\u01eb\3\2\2\2\u0b43\u0b4b\5\u01f4\u00fb\2\u0b44\u0b46\5\u01f6"+
		"\u00fc\2\u0b45\u0b47\5\u0202\u0102\2\u0b46\u0b45\3\2\2\2\u0b46\u0b47\3"+
		"\2\2\2\u0b47\u0b48\3\2\2\2\u0b48\u0b49\5\u01f8\u00fd\2\u0b49\u0b4b\3\2"+
		"\2\2\u0b4a\u0b43\3\2\2\2\u0b4a\u0b44\3\2\2\2\u0b4b\u01ed\3\2\2\2\u0b4c"+
		"\u0b4d\5\u01f0\u00f9\2\u0b4d\u0b4f\5\u009aN\2\u0b4e\u0b50\5\u0202\u0102"+
		"\2\u0b4f\u0b4e\3\2\2\2\u0b4f\u0b50\3\2\2\2\u0b50\u0b51\3\2\2\2\u0b51\u0b52"+
		"\5\u009aN\2\u0b52\u0b53\5\u01f2\u00fa\2\u0b53\u01ef\3\2\2\2\u0b54\u0b55"+
		"\7+\2\2\u0b55\u0b58\7)\2\2\u0b56\u0b58\7-\2\2\u0b57\u0b54\3\2\2\2\u0b57"+
		"\u0b56\3\2\2\2\u0b58\u01f1\3\2\2\2\u0b59\u0b5a\7+\2\2\u0b5a\u0b5b\7%\2"+
		"\2\u0b5b\u0b5c\7)\2\2\u0b5c\u01f3\3\2\2\2\u0b5d\u0b5e\7+\2\2\u0b5e\u0b5f"+
		"\5\u01fa\u00fe\2\u0b5f\u0b63\5\u009aN\2\u0b60\u0b62\5\u01fe\u0100\2\u0b61"+
		"\u0b60\3\2\2\2\u0b62\u0b65\3\2\2\2\u0b63\u0b61\3\2\2\2\u0b63\u0b64\3\2"+
		"\2\2\u0b64\u0b66\3\2\2\2\u0b65\u0b63\3\2\2\2\u0b66\u0b67\7%\2\2\u0b67"+
		"\u0b68\7)\2\2\u0b68\u01f5\3\2\2\2\u0b69\u0b6a\7+\2\2\u0b6a\u0b6b\5\u01fa"+
		"\u00fe\2\u0b6b\u0b6f\5\u009aN\2\u0b6c\u0b6e\5\u01fe\u0100\2\u0b6d\u0b6c"+
		"\3\2\2\2\u0b6e\u0b71\3\2\2\2\u0b6f\u0b6d\3\2\2\2\u0b6f\u0b70\3\2\2\2\u0b70"+
		"\u0b72\3\2\2\2\u0b71\u0b6f\3\2\2\2\u0b72\u0b73\7)\2\2\u0b73\u01f7\3\2"+
		"\2\2\u0b74\u0b75\7+\2\2\u0b75\u0b76\7%\2\2\u0b76\u0b77\5\u01fa\u00fe\2"+
		"\u0b77\u0b78\7)\2\2\u0b78\u01f9\3\2\2\2\u0b79\u0b7e\5\u01fc\u00ff\2\u0b7a"+
		"\u0b7b\7\25\2\2\u0b7b\u0b7d\5\u01fc\u00ff\2\u0b7c\u0b7a\3\2\2\2\u0b7d"+
		"\u0b80\3\2\2\2\u0b7e\u0b7c\3\2\2\2\u0b7e\u0b7f\3\2\2\2\u0b7f\u01fb\3\2"+
		"\2\2\u0b80\u0b7e\3\2\2\2\u0b81\u0b85\5\u00dco\2\u0b82\u0b84\5\u00dep\2"+
		"\u0b83\u0b82\3\2\2\2\u0b84\u0b87\3\2\2\2\u0b85\u0b83\3\2\2\2\u0b85\u0b86"+
		"\3\2\2\2\u0b86\u01fd\3\2\2\2\u0b87\u0b85\3\2\2\2\u0b88\u0b8b\5\u01fc\u00ff"+
		"\2\u0b89\u0b8a\7/\2\2\u0b8a\u0b8c\5\u0200\u0101\2\u0b8b\u0b89\3\2\2\2"+
		"\u0b8b\u0b8c\3\2\2\2\u0b8c\u0b8d\3\2\2\2\u0b8d\u0b8e\5\u009aN\2\u0b8e"+
		"\u01ff\3\2\2\2\u0b8f\u0b96\7\u00b3\2\2\u0b90\u0b92\7\32\2\2\u0b91\u0b93"+
		"\5^\60\2\u0b92\u0b91\3\2\2\2\u0b92\u0b93\3\2\2\2\u0b93\u0b94\3\2\2\2\u0b94"+
		"\u0b96\7\33\2\2\u0b95\u0b8f\3\2\2\2\u0b95\u0b90\3\2\2\2\u0b96\u0201\3"+
		"\2\2\2\u0b97\u0b99\5\u0204\u0103\2\u0b98\u0b97\3\2\2\2\u0b99\u0b9a\3\2"+
		"\2\2\u0b9a\u0b98\3\2\2\2\u0b9a\u0b9b\3\2\2\2\u0b9b\u0203\3\2\2\2\u0b9c"+
		"\u0ba4\5\u0206\u0104\2\u0b9d\u0ba4\5\u01ec\u00f7\2\u0b9e\u0ba0\7\32\2"+
		"\2\u0b9f\u0ba1\5^\60\2\u0ba0\u0b9f\3\2\2\2\u0ba0\u0ba1\3\2\2\2\u0ba1\u0ba2"+
		"\3\2\2\2\u0ba2\u0ba4\7\33\2\2\u0ba3\u0b9c\3\2\2\2\u0ba3\u0b9d\3\2\2\2"+
		"\u0ba3\u0b9e\3\2\2\2\u0ba4\u0205\3\2\2\2\u0ba5\u0ba7\5\u0208\u0105\2\u0ba6"+
		"\u0ba5\3\2\2\2\u0ba7\u0ba8\3\2\2\2\u0ba8\u0ba6\3\2\2\2\u0ba8\u0ba9\3\2"+
		"\2\2\u0ba9\u0207\3\2\2\2\u0baa\u0bad\n\17\2\2\u0bab\u0bad\7\u00bd\2\2"+
		"\u0bac\u0baa\3\2\2\2\u0bac\u0bab\3\2\2\2\u0bad\u0209\3\2\2\2\u0bae\u0bb0"+
		"\7\32\2\2\u0baf\u0bb1\5\u020c\u0107\2\u0bb0\u0baf\3\2\2\2\u0bb1\u0bb2"+
		"\3\2\2\2\u0bb2\u0bb0\3\2\2\2\u0bb2\u0bb3\3\2\2\2\u0bb3\u0bb4\3\2\2\2\u0bb4"+
		"\u0bb5\7\33\2\2\u0bb5\u020b\3\2\2\2\u0bb6\u0bb7\5\u020e\u0108\2\u0bb7"+
		"\u0bb9\7\21\2\2\u0bb8\u0bba\5\u0210\u0109\2\u0bb9\u0bb8\3\2\2\2\u0bba"+
		"\u0bbb\3\2\2\2\u0bbb\u0bb9\3\2\2\2\u0bbb\u0bbc\3\2\2\2\u0bbc\u0bbd\3\2"+
		"\2\2\u0bbd\u0bbe\7\22\2\2\u0bbe\u020d\3\2\2\2\u0bbf\u0bc0\b\u0108\1\2"+
		"\u0bc0\u0bc4\5\u00dco\2\u0bc1\u0bc2\7#\2\2\u0bc2\u0bc4\5\u00e0q\2\u0bc3"+
		"\u0bbf\3\2\2\2\u0bc3\u0bc1\3\2\2\2\u0bc4\u0bcd\3\2\2\2\u0bc5\u0bc7\f\3"+
		"\2\2\u0bc6\u0bc8\5\u00dep\2\u0bc7\u0bc6\3\2\2\2\u0bc8\u0bc9\3\2\2\2\u0bc9"+
		"\u0bc7\3\2\2\2\u0bc9\u0bca\3\2\2\2\u0bca\u0bcc\3\2\2\2\u0bcb\u0bc5\3\2"+
		"\2\2\u0bcc\u0bcf\3\2\2\2\u0bcd\u0bcb\3\2\2\2\u0bcd\u0bce\3\2\2\2\u0bce"+
		"\u020f\3\2\2\2\u0bcf\u0bcd\3\2\2\2\u0bd0\u0bd1\7\32\2\2\u0bd1\u0bd2\5"+
		"^\60\2\u0bd2\u0bd3\7\33\2\2\u0bd3\u0bd6\3\2\2\2\u0bd4\u0bd6\5\u0212\u010a"+
		"\2\u0bd5\u0bd0\3\2\2\2\u0bd5\u0bd4\3\2\2\2\u0bd6\u0211\3\2\2\2\u0bd7\u0bd9"+
		"\n\20\2\2\u0bd8\u0bd7\3\2\2\2\u0bd9\u0bda\3\2\2\2\u0bda\u0bd8\3\2\2\2"+
		"\u0bda\u0bdb\3\2\2\2\u0bdb\u0213\3\2\2\2\u0124\u021a\u0221\u023f\u0245"+
		"\u024a\u0250\u0252\u0255\u025c\u0265\u027e\u0282\u028d\u0296\u02a5\u02ae"+
		"\u02b5\u02bf\u02d5\u02ec\u02f9\u0304\u0312\u0318\u0323\u0331\u0345\u0350"+
		"\u0352\u035b\u035f\u0362\u036b\u036f\u0372\u037a\u037e\u0381\u0388\u0390"+
		"\u0395\u0399\u03b4\u03bb\u03c0\u03c4\u03db\u03e4\u03e8\u03ef\u03f7\u03fb"+
		"\u03fe\u0403\u040a\u040d\u042e\u0441\u0448\u046a\u0473\u048a\u049a\u049f"+
		"\u04a7\u04b0\u04c7\u04cd\u04d7\u04f2\u050f\u0515\u051b\u0535\u053b\u0540"+
		"\u0547\u054e\u0550\u055a\u0563\u0575\u057e\u0591\u059b\u05a1\u05ab\u05b0"+
		"\u05b2\u05b8\u05ba\u05bc\u05c3\u05cc\u05d4\u05da\u05df\u05e3\u05ee\u05f2"+
		"\u05f6\u05fb\u05fd\u0602\u0608\u060f\u0613\u061e\u0622\u0626\u062b\u062e"+
		"\u0635\u063a\u064c\u0654\u065b\u065d\u0662\u0664\u066f\u0675\u0685\u068e"+
		"\u0694\u0699\u069f\u06a6\u06b4\u06b8\u06c3\u06cb\u06d3\u06dc\u06e6\u06e9"+
		"\u06ed\u06f9\u06ff\u0707\u0710\u0718\u0725\u0728\u072c\u0731\u0735\u073e"+
		"\u0758\u0761\u0763\u0768\u077c\u0781\u078a\u078e\u0795\u079a\u07a6\u07b9"+
		"\u07be\u07c1\u07c5\u07ca\u07d1\u07dc\u07de\u07e7\u07ef\u07f7\u07ff\u0807"+
		"\u080f\u0817\u081d\u0829\u082d\u0837\u083f\u0843\u0849\u0850\u0855\u085c"+
		"\u0864\u086b\u0875\u0882\u0886\u0889\u088d\u0890\u0898\u08a1\u08aa\u08b3"+
		"\u08c4\u08c9\u08d2\u08dd\u08e4\u08ec\u08f6\u08fe\u0901\u0905\u090a\u0914"+
		"\u0918\u0923\u0926\u092d\u0936\u093d\u0946\u0951\u095e\u0965\u0972\u097c"+
		"\u097f\u0983\u0999\u09a1\u09a5\u09ad\u09d1\u09da\u09e4\u09f0\u09f5\u0a01"+
		"\u0a13\u0a1a\u0a1f\u0a28\u0a30\u0a3a\u0a3f\u0a49\u0a53\u0a63\u0a6d\u0a74"+
		"\u0a7c\u0a83\u0a8c\u0a95\u0a9d\u0aa7\u0aac\u0ab8\u0acb\u0ad5\u0add\u0ae4"+
		"\u0aed\u0af6\u0afe\u0b08\u0b0d\u0b19\u0b27\u0b2e\u0b36\u0b3d\u0b41\u0b46"+
		"\u0b4a\u0b4f\u0b57\u0b63\u0b6f\u0b7e\u0b85\u0b8b\u0b92\u0b95\u0b9a\u0ba0"+
		"\u0ba3\u0ba8\u0bac\u0bb2\u0bbb\u0bc3\u0bc9\u0bcd\u0bd5\u0bda";
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