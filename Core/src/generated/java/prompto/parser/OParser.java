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
		RULE_abstract_global_method_declaration = 20, RULE_abstract_member_method_declaration = 21, 
		RULE_concrete_method_declaration = 22, RULE_native_method_declaration = 23, 
		RULE_test_method_declaration = 24, RULE_assertion = 25, RULE_typed_argument = 26, 
		RULE_statement_or_list = 27, RULE_statement = 28, RULE_flush_statement = 29, 
		RULE_store_statement = 30, RULE_with_resource_statement = 31, RULE_with_singleton_statement = 32, 
		RULE_switch_statement = 33, RULE_switch_case_statement = 34, RULE_for_each_statement = 35, 
		RULE_do_while_statement = 36, RULE_while_statement = 37, RULE_if_statement = 38, 
		RULE_else_if_statement_list = 39, RULE_raise_statement = 40, RULE_try_statement = 41, 
		RULE_catch_statement = 42, RULE_break_statement = 43, RULE_return_statement = 44, 
		RULE_method_call_expression = 45, RULE_method_call_statement = 46, RULE_x_expression = 47, 
		RULE_expression = 48, RULE_filter_expression = 49, RULE_an_expression = 50, 
		RULE_type_expression = 51, RULE_selectable_expression = 52, RULE_instance_expression = 53, 
		RULE_mutable_instance_expression = 54, RULE_method_expression = 55, RULE_blob_expression = 56, 
		RULE_document_expression = 57, RULE_write_statement = 58, RULE_filtered_list_expression = 59, 
		RULE_fetch_expression = 60, RULE_fetch_statement = 61, RULE_then = 62, 
		RULE_read_statement = 63, RULE_sorted_expression = 64, RULE_instance_selector = 65, 
		RULE_constructor_expression = 66, RULE_copy_from = 67, RULE_argument_assignment_list = 68, 
		RULE_argument_assignment = 69, RULE_assign_instance_statement = 70, RULE_child_instance = 71, 
		RULE_assign_tuple_statement = 72, RULE_type_literal = 73, RULE_null_literal = 74, 
		RULE_ws_plus = 75, RULE_repl = 76, RULE_declaration_list = 77, RULE_declarations = 78, 
		RULE_declaration = 79, RULE_annotation_constructor = 80, RULE_annotation_identifier = 81, 
		RULE_annotation_argument = 82, RULE_annotation_argument_name = 83, RULE_annotation_argument_value = 84, 
		RULE_resource_declaration = 85, RULE_enum_declaration = 86, RULE_native_symbol_list = 87, 
		RULE_category_symbol_list = 88, RULE_symbol_list = 89, RULE_attribute_constraint = 90, 
		RULE_list_literal = 91, RULE_set_literal = 92, RULE_expression_list = 93, 
		RULE_range_literal = 94, RULE_typedef = 95, RULE_primary_type = 96, RULE_native_type = 97, 
		RULE_category_type = 98, RULE_mutable_category_type = 99, RULE_code_type = 100, 
		RULE_category_declaration = 101, RULE_widget_declaration = 102, RULE_type_identifier_list = 103, 
		RULE_method_identifier = 104, RULE_identifier_or_keyword = 105, RULE_nospace_hyphen_identifier_or_keyword = 106, 
		RULE_nospace_identifier_or_keyword = 107, RULE_identifier = 108, RULE_member_identifier = 109, 
		RULE_variable_identifier = 110, RULE_attribute_identifier = 111, RULE_type_identifier = 112, 
		RULE_symbol_identifier = 113, RULE_argument_list = 114, RULE_argument = 115, 
		RULE_operator_argument = 116, RULE_named_argument = 117, RULE_code_argument = 118, 
		RULE_category_or_any_type = 119, RULE_any_type = 120, RULE_member_method_declaration_list = 121, 
		RULE_member_method_declaration = 122, RULE_native_member_method_declaration_list = 123, 
		RULE_native_member_method_declaration = 124, RULE_native_category_binding = 125, 
		RULE_python_category_binding = 126, RULE_python_module = 127, RULE_javascript_category_binding = 128, 
		RULE_javascript_module = 129, RULE_variable_identifier_list = 130, RULE_attribute_identifier_list = 131, 
		RULE_method_declaration = 132, RULE_comment_statement = 133, RULE_native_statement_list = 134, 
		RULE_native_statement = 135, RULE_python_native_statement = 136, RULE_javascript_native_statement = 137, 
		RULE_statement_list = 138, RULE_assertion_list = 139, RULE_switch_case_statement_list = 140, 
		RULE_catch_statement_list = 141, RULE_literal_collection = 142, RULE_atomic_literal = 143, 
		RULE_literal_list_literal = 144, RULE_this_expression = 145, RULE_super_expression = 146, 
		RULE_parenthesis_expression = 147, RULE_literal_expression = 148, RULE_collection_literal = 149, 
		RULE_tuple_literal = 150, RULE_dict_literal = 151, RULE_document_literal = 152, 
		RULE_expression_tuple = 153, RULE_doc_entry_list = 154, RULE_doc_entry = 155, 
		RULE_doc_key = 156, RULE_dict_entry_list = 157, RULE_dict_entry = 158, 
		RULE_dict_key = 159, RULE_slice_arguments = 160, RULE_assign_variable_statement = 161, 
		RULE_assignable_instance = 162, RULE_is_expression = 163, RULE_metadata = 164, 
		RULE_arrow_expression = 165, RULE_arrow_prefix = 166, RULE_arrow_args = 167, 
		RULE_sorted_key = 168, RULE_read_blob_expression = 169, RULE_read_all_expression = 170, 
		RULE_read_one_expression = 171, RULE_order_by_list = 172, RULE_order_by = 173, 
		RULE_include_list = 174, RULE_operator = 175, RULE_keyword = 176, RULE_new_token = 177, 
		RULE_key_token = 178, RULE_module_token = 179, RULE_value_token = 180, 
		RULE_symbols_token = 181, RULE_assign = 182, RULE_multiply = 183, RULE_divide = 184, 
		RULE_idivide = 185, RULE_modulo = 186, RULE_lfs = 187, RULE_lfp = 188, 
		RULE_javascript_statement = 189, RULE_javascript_expression = 190, RULE_javascript_primary_expression = 191, 
		RULE_javascript_this_expression = 192, RULE_javascript_new_expression = 193, 
		RULE_javascript_selector_expression = 194, RULE_javascript_method_expression = 195, 
		RULE_javascript_arguments = 196, RULE_javascript_item_expression = 197, 
		RULE_javascript_parenthesis_expression = 198, RULE_javascript_identifier_expression = 199, 
		RULE_javascript_literal_expression = 200, RULE_javascript_identifier = 201, 
		RULE_python_statement = 202, RULE_python_expression = 203, RULE_python_primary_expression = 204, 
		RULE_python_self_expression = 205, RULE_python_selector_expression = 206, 
		RULE_python_method_expression = 207, RULE_python_argument_list = 208, 
		RULE_python_ordinal_argument_list = 209, RULE_python_named_argument_list = 210, 
		RULE_python_parenthesis_expression = 211, RULE_python_identifier_expression = 212, 
		RULE_python_literal_expression = 213, RULE_python_identifier = 214, RULE_java_statement = 215, 
		RULE_java_expression = 216, RULE_java_primary_expression = 217, RULE_java_this_expression = 218, 
		RULE_java_new_expression = 219, RULE_java_selector_expression = 220, RULE_java_method_expression = 221, 
		RULE_java_arguments = 222, RULE_java_item_expression = 223, RULE_java_parenthesis_expression = 224, 
		RULE_java_identifier_expression = 225, RULE_java_class_identifier_expression = 226, 
		RULE_java_literal_expression = 227, RULE_java_identifier = 228, RULE_csharp_statement = 229, 
		RULE_csharp_expression = 230, RULE_csharp_primary_expression = 231, RULE_csharp_this_expression = 232, 
		RULE_csharp_new_expression = 233, RULE_csharp_selector_expression = 234, 
		RULE_csharp_method_expression = 235, RULE_csharp_arguments = 236, RULE_csharp_item_expression = 237, 
		RULE_csharp_parenthesis_expression = 238, RULE_csharp_identifier_expression = 239, 
		RULE_csharp_literal_expression = 240, RULE_csharp_identifier = 241, RULE_jsx_expression = 242, 
		RULE_jsx_element = 243, RULE_jsx_fragment = 244, RULE_jsx_fragment_start = 245, 
		RULE_jsx_fragment_end = 246, RULE_jsx_self_closing = 247, RULE_jsx_opening = 248, 
		RULE_jsx_closing = 249, RULE_jsx_element_name = 250, RULE_jsx_identifier = 251, 
		RULE_jsx_attribute = 252, RULE_jsx_attribute_value = 253, RULE_jsx_children = 254, 
		RULE_jsx_child = 255, RULE_jsx_text = 256, RULE_jsx_char = 257, RULE_css_expression = 258, 
		RULE_css_field = 259, RULE_css_identifier = 260, RULE_css_value = 261, 
		RULE_css_text = 262;
	private static String[] makeRuleNames() {
		return new String[] {
			"enum_category_declaration", "enum_native_declaration", "category_symbol", 
			"native_symbol", "attribute_declaration", "concrete_widget_declaration", 
			"native_widget_declaration", "concrete_category_declaration", "singleton_category_declaration", 
			"derived_list", "category_method_list", "operator_method_declaration", 
			"setter_method_declaration", "native_setter_declaration", "getter_method_declaration", 
			"native_getter_declaration", "native_resource_declaration", "native_category_declaration", 
			"native_category_bindings", "native_category_binding_list", "abstract_global_method_declaration", 
			"abstract_member_method_declaration", "concrete_method_declaration", 
			"native_method_declaration", "test_method_declaration", "assertion", 
			"typed_argument", "statement_or_list", "statement", "flush_statement", 
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
			setState(526);
			match(ENUMERATED);
			setState(527);
			match(CATEGORY);
			setState(528);
			((Enum_category_declarationContext)_localctx).name = type_identifier();
			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(529);
				match(LPAR);
				setState(530);
				((Enum_category_declarationContext)_localctx).attrs = attribute_identifier_list();
				setState(531);
				match(RPAR);
				}
			}

			setState(537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(535);
				match(EXTENDS);
				setState(536);
				((Enum_category_declarationContext)_localctx).derived = type_identifier();
				}
			}

			setState(539);
			match(LCURL);
			setState(540);
			((Enum_category_declarationContext)_localctx).symbols = category_symbol_list();
			setState(541);
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
			setState(543);
			match(ENUMERATED);
			setState(544);
			((Enum_native_declarationContext)_localctx).name = type_identifier();
			setState(545);
			match(LPAR);
			setState(546);
			((Enum_native_declarationContext)_localctx).typ = native_type();
			setState(547);
			match(RPAR);
			setState(548);
			match(LCURL);
			setState(549);
			((Enum_native_declarationContext)_localctx).symbols = native_symbol_list();
			setState(550);
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
			setState(552);
			((Category_symbolContext)_localctx).name = symbol_identifier();
			setState(553);
			match(LPAR);
			setState(554);
			((Category_symbolContext)_localctx).args = argument_assignment_list(0);
			setState(555);
			match(RPAR);
			setState(556);
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
			setState(558);
			((Native_symbolContext)_localctx).name = symbol_identifier();
			setState(559);
			match(EQ);
			setState(560);
			((Native_symbolContext)_localctx).exp = expression(0);
			setState(561);
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
			setState(564);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STORABLE) {
				{
				setState(563);
				match(STORABLE);
				}
			}

			setState(566);
			match(ATTRIBUTE);
			setState(567);
			((Attribute_declarationContext)_localctx).name = attribute_identifier();
			setState(568);
			match(COLON);
			setState(569);
			((Attribute_declarationContext)_localctx).typ = typedef(0);
			setState(571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IN || _la==MATCHING) {
				{
				setState(570);
				((Attribute_declarationContext)_localctx).match = attribute_constraint();
				}
			}

			setState(581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(573);
				match(WITH);
				setState(574);
				match(INDEX);
				setState(579);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAR) {
					{
					setState(575);
					match(LPAR);
					setState(576);
					((Attribute_declarationContext)_localctx).indices = variable_identifier_list();
					setState(577);
					match(RPAR);
					}
				}

				}
			}

			setState(583);
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
			setState(585);
			match(WIDGET);
			setState(586);
			((Concrete_widget_declarationContext)_localctx).name = type_identifier();
			setState(589);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(587);
				match(EXTENDS);
				setState(588);
				((Concrete_widget_declarationContext)_localctx).derived = type_identifier();
				}
			}

			setState(591);
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
			setState(593);
			match(NATIVE);
			setState(594);
			match(WIDGET);
			setState(595);
			((Native_widget_declarationContext)_localctx).name = type_identifier();
			setState(596);
			match(LCURL);
			setState(597);
			((Native_widget_declarationContext)_localctx).bindings = native_category_bindings();
			setState(598);
			((Native_widget_declarationContext)_localctx).methods = native_member_method_declaration_list();
			setState(599);
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
			setState(602);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STORABLE) {
				{
				setState(601);
				match(STORABLE);
				}
			}

			setState(604);
			match(CATEGORY);
			setState(605);
			((Concrete_category_declarationContext)_localctx).name = type_identifier();
			setState(610);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(606);
				match(LPAR);
				setState(607);
				((Concrete_category_declarationContext)_localctx).attrs = attribute_identifier_list();
				setState(608);
				match(RPAR);
				}
			}

			setState(614);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(612);
				match(EXTENDS);
				setState(613);
				((Concrete_category_declarationContext)_localctx).derived = derived_list(0);
				}
			}

			setState(616);
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
			setState(618);
			match(SINGLETON);
			setState(619);
			((Singleton_category_declarationContext)_localctx).name = type_identifier();
			setState(624);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(620);
				match(LPAR);
				setState(621);
				((Singleton_category_declarationContext)_localctx).attrs = attribute_identifier_list();
				setState(622);
				match(RPAR);
				}
			}

			setState(626);
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

			setState(629);
			((DerivedListContext)_localctx).item = type_identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(636);
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
					setState(631);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(632);
					match(COMMA);
					setState(633);
					((DerivedListItemContext)_localctx).item = type_identifier();
					}
					} 
				}
				setState(638);
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
			setState(645);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMI:
				_localctx = new EmptyCategoryMethodListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(639);
				match(SEMI);
				}
				break;
			case LCURL:
				_localctx = new CurlyCategoryMethodListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(640);
				match(LCURL);
				setState(642);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (TYPE - 64)) | (1L << (ABSTRACT - 64)) | (1L << (GETTER - 64)) | (1L << (METHOD - 64)) | (1L << (MUTABLE - 64)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (OPERATOR - 130)) | (1L << (SETTER - 130)) | (1L << (TYPE_IDENTIFIER - 130)) | (1L << (ARONDBASE_IDENTIFIER - 130)))) != 0)) {
					{
					setState(641);
					((CurlyCategoryMethodListContext)_localctx).items = member_method_declaration_list();
					}
				}

				setState(644);
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
			setState(648);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & ((1L << (BOOLEAN - 49)) | (1L << (CSS - 49)) | (1L << (CHARACTER - 49)) | (1L << (TEXT - 49)) | (1L << (INTEGER - 49)) | (1L << (DECIMAL - 49)) | (1L << (DATE - 49)) | (1L << (TIME - 49)) | (1L << (DATETIME - 49)) | (1L << (PERIOD - 49)) | (1L << (VERSION - 49)) | (1L << (CODE - 49)) | (1L << (DOCUMENT - 49)) | (1L << (BLOB - 49)) | (1L << (IMAGE - 49)) | (1L << (UUID - 49)) | (1L << (DBID - 49)) | (1L << (ITERATOR - 49)) | (1L << (CURSOR - 49)) | (1L << (HTML - 49)) | (1L << (TYPE - 49)))) != 0) || _la==TYPE_IDENTIFIER) {
				{
				setState(647);
				((Operator_method_declarationContext)_localctx).typ = typedef(0);
				}
			}

			setState(650);
			match(OPERATOR);
			setState(651);
			((Operator_method_declarationContext)_localctx).op = operator();
			setState(652);
			match(LPAR);
			setState(653);
			((Operator_method_declarationContext)_localctx).arg = operator_argument();
			setState(654);
			match(RPAR);
			setState(655);
			match(LCURL);
			setState(657);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << LTCOLONGT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (TYPE - 64)) | (1L << (ANY - 64)) | (1L << (BREAK - 64)) | (1L << (CATEGORY - 64)) | (1L << (DELETE - 64)) | (1L << (DO - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (IF - 64)) | (1L << (METHOD - 64)) | (1L << (MUTABLE - 64)) | (1L << (NULL - 64)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (READ - 136)) | (1L << (RESOURCE - 136)) | (1L << (RETURN - 136)) | (1L << (SELF - 136)) | (1L << (SORTED - 136)) | (1L << (STORE - 136)) | (1L << (SUPER - 136)) | (1L << (SWITCH - 136)) | (1L << (THIS - 136)) | (1L << (THROW - 136)) | (1L << (TRY - 136)) | (1L << (WITH - 136)) | (1L << (WHILE - 136)) | (1L << (WRITE - 136)) | (1L << (BOOLEAN_LITERAL - 136)) | (1L << (CHAR_LITERAL - 136)) | (1L << (MIN_INTEGER - 136)) | (1L << (MAX_INTEGER - 136)) | (1L << (SYMBOL_IDENTIFIER - 136)) | (1L << (TYPE_IDENTIFIER - 136)) | (1L << (VARIABLE_IDENTIFIER - 136)) | (1L << (TEXT_LITERAL - 136)) | (1L << (UUID_LITERAL - 136)) | (1L << (VERSION_LITERAL - 136)) | (1L << (INTEGER_LITERAL - 136)) | (1L << (HEXA_LITERAL - 136)) | (1L << (DECIMAL_LITERAL - 136)) | (1L << (DATETIME_LITERAL - 136)) | (1L << (TIME_LITERAL - 136)) | (1L << (DATE_LITERAL - 136)) | (1L << (PERIOD_LITERAL - 136)))) != 0)) {
				{
				setState(656);
				((Operator_method_declarationContext)_localctx).stmts = statement_list();
				}
			}

			setState(659);
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
			setState(661);
			match(SETTER);
			setState(662);
			((Setter_method_declarationContext)_localctx).name = variable_identifier();
			setState(663);
			match(LCURL);
			setState(665);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << LTCOLONGT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (TYPE - 64)) | (1L << (ANY - 64)) | (1L << (BREAK - 64)) | (1L << (CATEGORY - 64)) | (1L << (DELETE - 64)) | (1L << (DO - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (IF - 64)) | (1L << (METHOD - 64)) | (1L << (MUTABLE - 64)) | (1L << (NULL - 64)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (READ - 136)) | (1L << (RESOURCE - 136)) | (1L << (RETURN - 136)) | (1L << (SELF - 136)) | (1L << (SORTED - 136)) | (1L << (STORE - 136)) | (1L << (SUPER - 136)) | (1L << (SWITCH - 136)) | (1L << (THIS - 136)) | (1L << (THROW - 136)) | (1L << (TRY - 136)) | (1L << (WITH - 136)) | (1L << (WHILE - 136)) | (1L << (WRITE - 136)) | (1L << (BOOLEAN_LITERAL - 136)) | (1L << (CHAR_LITERAL - 136)) | (1L << (MIN_INTEGER - 136)) | (1L << (MAX_INTEGER - 136)) | (1L << (SYMBOL_IDENTIFIER - 136)) | (1L << (TYPE_IDENTIFIER - 136)) | (1L << (VARIABLE_IDENTIFIER - 136)) | (1L << (TEXT_LITERAL - 136)) | (1L << (UUID_LITERAL - 136)) | (1L << (VERSION_LITERAL - 136)) | (1L << (INTEGER_LITERAL - 136)) | (1L << (HEXA_LITERAL - 136)) | (1L << (DECIMAL_LITERAL - 136)) | (1L << (DATETIME_LITERAL - 136)) | (1L << (TIME_LITERAL - 136)) | (1L << (DATE_LITERAL - 136)) | (1L << (PERIOD_LITERAL - 136)))) != 0)) {
				{
				setState(664);
				((Setter_method_declarationContext)_localctx).stmts = statement_list();
				}
			}

			setState(667);
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
			setState(670);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NATIVE) {
				{
				setState(669);
				match(NATIVE);
				}
			}

			setState(672);
			match(SETTER);
			setState(673);
			((Native_setter_declarationContext)_localctx).name = variable_identifier();
			setState(674);
			match(LCURL);
			setState(676);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA) | (1L << CSHARP) | (1L << PYTHON2) | (1L << PYTHON3) | (1L << JAVASCRIPT))) != 0)) {
				{
				setState(675);
				((Native_setter_declarationContext)_localctx).stmts = native_statement_list();
				}
			}

			setState(678);
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
			setState(680);
			match(GETTER);
			setState(681);
			((Getter_method_declarationContext)_localctx).name = variable_identifier();
			setState(682);
			match(LCURL);
			setState(684);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << LTCOLONGT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (TYPE - 64)) | (1L << (ANY - 64)) | (1L << (BREAK - 64)) | (1L << (CATEGORY - 64)) | (1L << (DELETE - 64)) | (1L << (DO - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (IF - 64)) | (1L << (METHOD - 64)) | (1L << (MUTABLE - 64)) | (1L << (NULL - 64)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (READ - 136)) | (1L << (RESOURCE - 136)) | (1L << (RETURN - 136)) | (1L << (SELF - 136)) | (1L << (SORTED - 136)) | (1L << (STORE - 136)) | (1L << (SUPER - 136)) | (1L << (SWITCH - 136)) | (1L << (THIS - 136)) | (1L << (THROW - 136)) | (1L << (TRY - 136)) | (1L << (WITH - 136)) | (1L << (WHILE - 136)) | (1L << (WRITE - 136)) | (1L << (BOOLEAN_LITERAL - 136)) | (1L << (CHAR_LITERAL - 136)) | (1L << (MIN_INTEGER - 136)) | (1L << (MAX_INTEGER - 136)) | (1L << (SYMBOL_IDENTIFIER - 136)) | (1L << (TYPE_IDENTIFIER - 136)) | (1L << (VARIABLE_IDENTIFIER - 136)) | (1L << (TEXT_LITERAL - 136)) | (1L << (UUID_LITERAL - 136)) | (1L << (VERSION_LITERAL - 136)) | (1L << (INTEGER_LITERAL - 136)) | (1L << (HEXA_LITERAL - 136)) | (1L << (DECIMAL_LITERAL - 136)) | (1L << (DATETIME_LITERAL - 136)) | (1L << (TIME_LITERAL - 136)) | (1L << (DATE_LITERAL - 136)) | (1L << (PERIOD_LITERAL - 136)))) != 0)) {
				{
				setState(683);
				((Getter_method_declarationContext)_localctx).stmts = statement_list();
				}
			}

			setState(686);
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
			setState(689);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NATIVE) {
				{
				setState(688);
				match(NATIVE);
				}
			}

			setState(691);
			match(GETTER);
			setState(692);
			((Native_getter_declarationContext)_localctx).name = variable_identifier();
			setState(693);
			match(LCURL);
			setState(695);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA) | (1L << CSHARP) | (1L << PYTHON2) | (1L << PYTHON3) | (1L << JAVASCRIPT))) != 0)) {
				{
				setState(694);
				((Native_getter_declarationContext)_localctx).stmts = native_statement_list();
				}
			}

			setState(697);
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
			setState(700);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STORABLE) {
				{
				setState(699);
				match(STORABLE);
				}
			}

			setState(702);
			match(NATIVE);
			setState(703);
			match(RESOURCE);
			setState(704);
			((Native_resource_declarationContext)_localctx).name = type_identifier();
			setState(709);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(705);
				match(LPAR);
				setState(706);
				((Native_resource_declarationContext)_localctx).attrs = attribute_identifier_list();
				setState(707);
				match(RPAR);
				}
			}

			setState(711);
			match(LCURL);
			setState(712);
			((Native_resource_declarationContext)_localctx).bindings = native_category_bindings();
			setState(714);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (TYPE - 64)) | (1L << (ANY - 64)) | (1L << (GETTER - 64)) | (1L << (METHOD - 64)) | (1L << (NATIVE - 64)))) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & ((1L << (SETTER - 143)) | (1L << (TYPE_IDENTIFIER - 143)) | (1L << (ARONDBASE_IDENTIFIER - 143)))) != 0)) {
				{
				setState(713);
				((Native_resource_declarationContext)_localctx).methods = native_member_method_declaration_list();
				}
			}

			setState(716);
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
			setState(719);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STORABLE) {
				{
				setState(718);
				match(STORABLE);
				}
			}

			setState(721);
			match(NATIVE);
			setState(722);
			match(CATEGORY);
			setState(723);
			((Native_category_declarationContext)_localctx).name = type_identifier();
			setState(728);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(724);
				match(LPAR);
				setState(725);
				((Native_category_declarationContext)_localctx).attrs = attribute_identifier_list();
				setState(726);
				match(RPAR);
				}
			}

			setState(730);
			match(LCURL);
			setState(731);
			((Native_category_declarationContext)_localctx).bindings = native_category_bindings();
			setState(733);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (TYPE - 64)) | (1L << (ANY - 64)) | (1L << (GETTER - 64)) | (1L << (METHOD - 64)) | (1L << (NATIVE - 64)))) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & ((1L << (SETTER - 143)) | (1L << (TYPE_IDENTIFIER - 143)) | (1L << (ARONDBASE_IDENTIFIER - 143)))) != 0)) {
				{
				setState(732);
				((Native_category_declarationContext)_localctx).methods = native_member_method_declaration_list();
				}
			}

			setState(735);
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
			setState(737);
			match(CATEGORY);
			setState(738);
			match(BINDINGS);
			setState(739);
			match(LCURL);
			setState(740);
			((Native_category_bindingsContext)_localctx).items = native_category_binding_list(0);
			setState(741);
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

			setState(744);
			((NativeCategoryBindingListContext)_localctx).item = native_category_binding();
			setState(745);
			match(SEMI);
			}
			_ctx.stop = _input.LT(-1);
			setState(753);
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
					setState(747);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(748);
					((NativeCategoryBindingListItemContext)_localctx).item = native_category_binding();
					setState(749);
					match(SEMI);
					}
					} 
				}
				setState(755);
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

	public static class Abstract_global_method_declarationContext extends ParserRuleContext {
		public TypedefContext typ;
		public Type_identifierContext name;
		public Argument_listContext args;
		public TerminalNode ABSTRACT() { return getToken(OParser.ABSTRACT, 0); }
		public TerminalNode METHOD() { return getToken(OParser.METHOD, 0); }
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public TerminalNode SEMI() { return getToken(OParser.SEMI, 0); }
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public TypedefContext typedef() {
			return getRuleContext(TypedefContext.class,0);
		}
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public TerminalNode MUTABLE() { return getToken(OParser.MUTABLE, 0); }
		public Abstract_global_method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstract_global_method_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterAbstract_global_method_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitAbstract_global_method_declaration(this);
		}
	}

	public final Abstract_global_method_declarationContext abstract_global_method_declaration() throws RecognitionException {
		Abstract_global_method_declarationContext _localctx = new Abstract_global_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_abstract_global_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(756);
			match(ABSTRACT);
			setState(761);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & ((1L << (BOOLEAN - 49)) | (1L << (CSS - 49)) | (1L << (CHARACTER - 49)) | (1L << (TEXT - 49)) | (1L << (INTEGER - 49)) | (1L << (DECIMAL - 49)) | (1L << (DATE - 49)) | (1L << (TIME - 49)) | (1L << (DATETIME - 49)) | (1L << (PERIOD - 49)) | (1L << (VERSION - 49)) | (1L << (CODE - 49)) | (1L << (DOCUMENT - 49)) | (1L << (BLOB - 49)) | (1L << (IMAGE - 49)) | (1L << (UUID - 49)) | (1L << (DBID - 49)) | (1L << (ITERATOR - 49)) | (1L << (CURSOR - 49)) | (1L << (HTML - 49)) | (1L << (TYPE - 49)))) != 0) || _la==MUTABLE || _la==TYPE_IDENTIFIER) {
				{
				setState(758);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MUTABLE) {
					{
					setState(757);
					match(MUTABLE);
					}
				}

				setState(760);
				((Abstract_global_method_declarationContext)_localctx).typ = typedef(0);
				}
			}

			setState(763);
			match(METHOD);
			setState(764);
			((Abstract_global_method_declarationContext)_localctx).name = type_identifier();
			setState(765);
			match(LPAR);
			setState(767);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & ((1L << (BOOLEAN - 49)) | (1L << (CSS - 49)) | (1L << (CHARACTER - 49)) | (1L << (TEXT - 49)) | (1L << (INTEGER - 49)) | (1L << (DECIMAL - 49)) | (1L << (DATE - 49)) | (1L << (TIME - 49)) | (1L << (DATETIME - 49)) | (1L << (PERIOD - 49)) | (1L << (VERSION - 49)) | (1L << (CODE - 49)) | (1L << (DOCUMENT - 49)) | (1L << (BLOB - 49)) | (1L << (IMAGE - 49)) | (1L << (UUID - 49)) | (1L << (DBID - 49)) | (1L << (ITERATOR - 49)) | (1L << (CURSOR - 49)) | (1L << (HTML - 49)) | (1L << (TYPE - 49)) | (1L << (ANY - 49)) | (1L << (CATEGORY - 49)))) != 0) || ((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & ((1L << (MUTABLE - 122)) | (1L << (RESOURCE - 122)) | (1L << (TYPE_IDENTIFIER - 122)) | (1L << (VARIABLE_IDENTIFIER - 122)))) != 0)) {
				{
				setState(766);
				((Abstract_global_method_declarationContext)_localctx).args = argument_list();
				}
			}

			setState(769);
			match(RPAR);
			setState(770);
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

	public static class Abstract_member_method_declarationContext extends ParserRuleContext {
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
		public Abstract_member_method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstract_member_method_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterAbstract_member_method_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitAbstract_member_method_declaration(this);
		}
	}

	public final Abstract_member_method_declarationContext abstract_member_method_declaration() throws RecognitionException {
		Abstract_member_method_declarationContext _localctx = new Abstract_member_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_abstract_member_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(772);
			match(ABSTRACT);
			setState(777);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & ((1L << (BOOLEAN - 49)) | (1L << (CSS - 49)) | (1L << (CHARACTER - 49)) | (1L << (TEXT - 49)) | (1L << (INTEGER - 49)) | (1L << (DECIMAL - 49)) | (1L << (DATE - 49)) | (1L << (TIME - 49)) | (1L << (DATETIME - 49)) | (1L << (PERIOD - 49)) | (1L << (VERSION - 49)) | (1L << (CODE - 49)) | (1L << (DOCUMENT - 49)) | (1L << (BLOB - 49)) | (1L << (IMAGE - 49)) | (1L << (UUID - 49)) | (1L << (DBID - 49)) | (1L << (ITERATOR - 49)) | (1L << (CURSOR - 49)) | (1L << (HTML - 49)) | (1L << (TYPE - 49)))) != 0) || _la==MUTABLE || _la==TYPE_IDENTIFIER) {
				{
				setState(774);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MUTABLE) {
					{
					setState(773);
					match(MUTABLE);
					}
				}

				setState(776);
				((Abstract_member_method_declarationContext)_localctx).typ = typedef(0);
				}
			}

			setState(779);
			match(METHOD);
			setState(780);
			((Abstract_member_method_declarationContext)_localctx).name = method_identifier();
			setState(781);
			match(LPAR);
			setState(783);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & ((1L << (BOOLEAN - 49)) | (1L << (CSS - 49)) | (1L << (CHARACTER - 49)) | (1L << (TEXT - 49)) | (1L << (INTEGER - 49)) | (1L << (DECIMAL - 49)) | (1L << (DATE - 49)) | (1L << (TIME - 49)) | (1L << (DATETIME - 49)) | (1L << (PERIOD - 49)) | (1L << (VERSION - 49)) | (1L << (CODE - 49)) | (1L << (DOCUMENT - 49)) | (1L << (BLOB - 49)) | (1L << (IMAGE - 49)) | (1L << (UUID - 49)) | (1L << (DBID - 49)) | (1L << (ITERATOR - 49)) | (1L << (CURSOR - 49)) | (1L << (HTML - 49)) | (1L << (TYPE - 49)) | (1L << (ANY - 49)) | (1L << (CATEGORY - 49)))) != 0) || ((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & ((1L << (MUTABLE - 122)) | (1L << (RESOURCE - 122)) | (1L << (TYPE_IDENTIFIER - 122)) | (1L << (VARIABLE_IDENTIFIER - 122)))) != 0)) {
				{
				setState(782);
				((Abstract_member_method_declarationContext)_localctx).args = argument_list();
				}
			}

			setState(785);
			match(RPAR);
			setState(786);
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
		enterRule(_localctx, 44, RULE_concrete_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(792);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & ((1L << (BOOLEAN - 49)) | (1L << (CSS - 49)) | (1L << (CHARACTER - 49)) | (1L << (TEXT - 49)) | (1L << (INTEGER - 49)) | (1L << (DECIMAL - 49)) | (1L << (DATE - 49)) | (1L << (TIME - 49)) | (1L << (DATETIME - 49)) | (1L << (PERIOD - 49)) | (1L << (VERSION - 49)) | (1L << (CODE - 49)) | (1L << (DOCUMENT - 49)) | (1L << (BLOB - 49)) | (1L << (IMAGE - 49)) | (1L << (UUID - 49)) | (1L << (DBID - 49)) | (1L << (ITERATOR - 49)) | (1L << (CURSOR - 49)) | (1L << (HTML - 49)) | (1L << (TYPE - 49)))) != 0) || _la==MUTABLE || _la==TYPE_IDENTIFIER) {
				{
				setState(789);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MUTABLE) {
					{
					setState(788);
					match(MUTABLE);
					}
				}

				setState(791);
				((Concrete_method_declarationContext)_localctx).typ = typedef(0);
				}
			}

			setState(794);
			match(METHOD);
			setState(795);
			((Concrete_method_declarationContext)_localctx).name = method_identifier();
			setState(796);
			match(LPAR);
			setState(798);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & ((1L << (BOOLEAN - 49)) | (1L << (CSS - 49)) | (1L << (CHARACTER - 49)) | (1L << (TEXT - 49)) | (1L << (INTEGER - 49)) | (1L << (DECIMAL - 49)) | (1L << (DATE - 49)) | (1L << (TIME - 49)) | (1L << (DATETIME - 49)) | (1L << (PERIOD - 49)) | (1L << (VERSION - 49)) | (1L << (CODE - 49)) | (1L << (DOCUMENT - 49)) | (1L << (BLOB - 49)) | (1L << (IMAGE - 49)) | (1L << (UUID - 49)) | (1L << (DBID - 49)) | (1L << (ITERATOR - 49)) | (1L << (CURSOR - 49)) | (1L << (HTML - 49)) | (1L << (TYPE - 49)) | (1L << (ANY - 49)) | (1L << (CATEGORY - 49)))) != 0) || ((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & ((1L << (MUTABLE - 122)) | (1L << (RESOURCE - 122)) | (1L << (TYPE_IDENTIFIER - 122)) | (1L << (VARIABLE_IDENTIFIER - 122)))) != 0)) {
				{
				setState(797);
				((Concrete_method_declarationContext)_localctx).args = argument_list();
				}
			}

			setState(800);
			match(RPAR);
			setState(801);
			match(LCURL);
			setState(803);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << LTCOLONGT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (TYPE - 64)) | (1L << (ANY - 64)) | (1L << (BREAK - 64)) | (1L << (CATEGORY - 64)) | (1L << (DELETE - 64)) | (1L << (DO - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (IF - 64)) | (1L << (METHOD - 64)) | (1L << (MUTABLE - 64)) | (1L << (NULL - 64)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (READ - 136)) | (1L << (RESOURCE - 136)) | (1L << (RETURN - 136)) | (1L << (SELF - 136)) | (1L << (SORTED - 136)) | (1L << (STORE - 136)) | (1L << (SUPER - 136)) | (1L << (SWITCH - 136)) | (1L << (THIS - 136)) | (1L << (THROW - 136)) | (1L << (TRY - 136)) | (1L << (WITH - 136)) | (1L << (WHILE - 136)) | (1L << (WRITE - 136)) | (1L << (BOOLEAN_LITERAL - 136)) | (1L << (CHAR_LITERAL - 136)) | (1L << (MIN_INTEGER - 136)) | (1L << (MAX_INTEGER - 136)) | (1L << (SYMBOL_IDENTIFIER - 136)) | (1L << (TYPE_IDENTIFIER - 136)) | (1L << (VARIABLE_IDENTIFIER - 136)) | (1L << (TEXT_LITERAL - 136)) | (1L << (UUID_LITERAL - 136)) | (1L << (VERSION_LITERAL - 136)) | (1L << (INTEGER_LITERAL - 136)) | (1L << (HEXA_LITERAL - 136)) | (1L << (DECIMAL_LITERAL - 136)) | (1L << (DATETIME_LITERAL - 136)) | (1L << (TIME_LITERAL - 136)) | (1L << (DATE_LITERAL - 136)) | (1L << (PERIOD_LITERAL - 136)))) != 0)) {
				{
				setState(802);
				((Concrete_method_declarationContext)_localctx).stmts = statement_list();
				}
			}

			setState(805);
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
		enterRule(_localctx, 46, RULE_native_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(808);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & ((1L << (BOOLEAN - 49)) | (1L << (CSS - 49)) | (1L << (CHARACTER - 49)) | (1L << (TEXT - 49)) | (1L << (INTEGER - 49)) | (1L << (DECIMAL - 49)) | (1L << (DATE - 49)) | (1L << (TIME - 49)) | (1L << (DATETIME - 49)) | (1L << (PERIOD - 49)) | (1L << (VERSION - 49)) | (1L << (CODE - 49)) | (1L << (DOCUMENT - 49)) | (1L << (BLOB - 49)) | (1L << (IMAGE - 49)) | (1L << (UUID - 49)) | (1L << (DBID - 49)) | (1L << (ITERATOR - 49)) | (1L << (CURSOR - 49)) | (1L << (HTML - 49)) | (1L << (TYPE - 49)) | (1L << (ANY - 49)))) != 0) || _la==TYPE_IDENTIFIER) {
				{
				setState(807);
				((Native_method_declarationContext)_localctx).typ = category_or_any_type();
				}
			}

			setState(811);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NATIVE) {
				{
				setState(810);
				match(NATIVE);
				}
			}

			setState(813);
			match(METHOD);
			setState(814);
			((Native_method_declarationContext)_localctx).name = method_identifier();
			setState(815);
			match(LPAR);
			setState(817);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & ((1L << (BOOLEAN - 49)) | (1L << (CSS - 49)) | (1L << (CHARACTER - 49)) | (1L << (TEXT - 49)) | (1L << (INTEGER - 49)) | (1L << (DECIMAL - 49)) | (1L << (DATE - 49)) | (1L << (TIME - 49)) | (1L << (DATETIME - 49)) | (1L << (PERIOD - 49)) | (1L << (VERSION - 49)) | (1L << (CODE - 49)) | (1L << (DOCUMENT - 49)) | (1L << (BLOB - 49)) | (1L << (IMAGE - 49)) | (1L << (UUID - 49)) | (1L << (DBID - 49)) | (1L << (ITERATOR - 49)) | (1L << (CURSOR - 49)) | (1L << (HTML - 49)) | (1L << (TYPE - 49)) | (1L << (ANY - 49)) | (1L << (CATEGORY - 49)))) != 0) || ((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & ((1L << (MUTABLE - 122)) | (1L << (RESOURCE - 122)) | (1L << (TYPE_IDENTIFIER - 122)) | (1L << (VARIABLE_IDENTIFIER - 122)))) != 0)) {
				{
				setState(816);
				((Native_method_declarationContext)_localctx).args = argument_list();
				}
			}

			setState(819);
			match(RPAR);
			setState(820);
			match(LCURL);
			setState(821);
			((Native_method_declarationContext)_localctx).stmts = native_statement_list();
			setState(822);
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
		enterRule(_localctx, 48, RULE_test_method_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(824);
			match(TEST);
			setState(825);
			match(METHOD);
			setState(826);
			((Test_method_declarationContext)_localctx).name = match(TEXT_LITERAL);
			setState(827);
			match(LPAR);
			setState(828);
			match(RPAR);
			setState(829);
			match(LCURL);
			setState(830);
			((Test_method_declarationContext)_localctx).stmts = statement_list();
			setState(831);
			match(RCURL);
			setState(832);
			match(VERIFYING);
			setState(840);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURL:
				{
				{
				setState(833);
				match(LCURL);
				setState(834);
				((Test_method_declarationContext)_localctx).exps = assertion_list();
				setState(835);
				match(RCURL);
				}
				}
				break;
			case SYMBOL_IDENTIFIER:
				{
				{
				setState(837);
				((Test_method_declarationContext)_localctx).error = symbol_identifier();
				setState(838);
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
		enterRule(_localctx, 50, RULE_assertion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(842);
			((AssertionContext)_localctx).exp = expression(0);
			setState(843);
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
		enterRule(_localctx, 52, RULE_typed_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(845);
			((Typed_argumentContext)_localctx).typ = category_or_any_type();
			setState(850);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(846);
				match(LPAR);
				setState(847);
				((Typed_argumentContext)_localctx).attrs = attribute_identifier_list();
				setState(848);
				match(RPAR);
				}
			}

			setState(852);
			((Typed_argumentContext)_localctx).name = variable_identifier();
			setState(855);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(853);
				match(EQ);
				setState(854);
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
		enterRule(_localctx, 54, RULE_statement_or_list);
		try {
			setState(864);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				_localctx = new SingleStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(857);
				((SingleStatementContext)_localctx).stmt = statement();
				}
				break;
			case 2:
				_localctx = new CurlyStatementListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(858);
				match(LCURL);
				setState(862);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(859);
					((CurlyStatementListContext)_localctx).items = statement_list();
					setState(860);
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
		enterRule(_localctx, 56, RULE_statement);
		try {
			setState(887);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				_localctx = new MethodCallStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(866);
				((MethodCallStatementContext)_localctx).stmt = method_call_statement();
				}
				break;
			case 2:
				_localctx = new AssignInstanceStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(867);
				((AssignInstanceStatementContext)_localctx).stmt = assign_instance_statement();
				}
				break;
			case 3:
				_localctx = new AssignTupleStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(868);
				((AssignTupleStatementContext)_localctx).stmt = assign_tuple_statement();
				}
				break;
			case 4:
				_localctx = new StoreStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(869);
				((StoreStatementContext)_localctx).stmt = store_statement();
				}
				break;
			case 5:
				_localctx = new FetchStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(870);
				((FetchStatementContext)_localctx).stmt = fetch_statement();
				}
				break;
			case 6:
				_localctx = new ReadStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(871);
				((ReadStatementContext)_localctx).stmt = read_statement();
				}
				break;
			case 7:
				_localctx = new FlushStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(872);
				((FlushStatementContext)_localctx).stmt = flush_statement();
				}
				break;
			case 8:
				_localctx = new BreakStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(873);
				((BreakStatementContext)_localctx).stmt = break_statement();
				}
				break;
			case 9:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(874);
				((ReturnStatementContext)_localctx).stmt = return_statement();
				}
				break;
			case 10:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(875);
				((IfStatementContext)_localctx).stmt = if_statement();
				}
				break;
			case 11:
				_localctx = new SwitchStatementContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(876);
				((SwitchStatementContext)_localctx).stmt = switch_statement();
				}
				break;
			case 12:
				_localctx = new ForEachStatementContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(877);
				((ForEachStatementContext)_localctx).stmt = for_each_statement();
				}
				break;
			case 13:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(878);
				((WhileStatementContext)_localctx).stmt = while_statement();
				}
				break;
			case 14:
				_localctx = new DoWhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(879);
				((DoWhileStatementContext)_localctx).stmt = do_while_statement();
				}
				break;
			case 15:
				_localctx = new TryStatementContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(880);
				((TryStatementContext)_localctx).stmt = try_statement();
				}
				break;
			case 16:
				_localctx = new RaiseStatementContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(881);
				((RaiseStatementContext)_localctx).stmt = raise_statement();
				}
				break;
			case 17:
				_localctx = new WriteStatementContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(882);
				((WriteStatementContext)_localctx).stmt = write_statement();
				}
				break;
			case 18:
				_localctx = new WithResourceStatementContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(883);
				((WithResourceStatementContext)_localctx).stmt = with_resource_statement();
				}
				break;
			case 19:
				_localctx = new WithSingletonStatementContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(884);
				((WithSingletonStatementContext)_localctx).stmt = with_singleton_statement();
				}
				break;
			case 20:
				_localctx = new ClosureStatementContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(885);
				((ClosureStatementContext)_localctx).decl = concrete_method_declaration();
				}
				break;
			case 21:
				_localctx = new CommentStatementContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(886);
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
		enterRule(_localctx, 58, RULE_flush_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(889);
			match(FLUSH);
			setState(890);
			match(LPAR);
			setState(891);
			match(RPAR);
			setState(892);
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
		enterRule(_localctx, 60, RULE_store_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(911);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DELETE:
				{
				setState(894);
				match(DELETE);
				setState(895);
				match(LPAR);
				setState(896);
				((Store_statementContext)_localctx).to_del = expression_list();
				setState(897);
				match(RPAR);
				setState(904);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AND) {
					{
					setState(898);
					match(AND);
					setState(899);
					match(STORE);
					setState(900);
					match(LPAR);
					setState(901);
					((Store_statementContext)_localctx).to_add = expression_list();
					setState(902);
					match(RPAR);
					}
				}

				}
				break;
			case STORE:
				{
				setState(906);
				match(STORE);
				setState(907);
				match(LPAR);
				setState(908);
				((Store_statementContext)_localctx).to_add = expression_list();
				setState(909);
				match(RPAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(919);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(913);
				match(WITH);
				setState(914);
				metadata();
				setState(915);
				match(LPAR);
				setState(916);
				((Store_statementContext)_localctx).with_meta = expression(0);
				setState(917);
				match(RPAR);
				}
			}

			setState(927);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THEN:
				{
				{
				setState(921);
				match(THEN);
				setState(922);
				match(LCURL);
				setState(923);
				((Store_statementContext)_localctx).stmts = statement_list();
				setState(924);
				match(RCURL);
				}
				}
				break;
			case SEMI:
				{
				setState(926);
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
		enterRule(_localctx, 62, RULE_with_resource_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(929);
			match(WITH);
			setState(930);
			match(LPAR);
			setState(931);
			((With_resource_statementContext)_localctx).stmt = assign_variable_statement();
			setState(932);
			match(RPAR);
			setState(933);
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
		enterRule(_localctx, 64, RULE_with_singleton_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(935);
			match(WITH);
			setState(936);
			match(LPAR);
			setState(937);
			((With_singleton_statementContext)_localctx).typ = type_identifier();
			setState(938);
			match(RPAR);
			setState(939);
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
		enterRule(_localctx, 66, RULE_switch_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(941);
			match(SWITCH);
			setState(942);
			match(LPAR);
			setState(943);
			((Switch_statementContext)_localctx).exp = expression(0);
			setState(944);
			match(RPAR);
			setState(945);
			match(LCURL);
			setState(946);
			((Switch_statementContext)_localctx).cases = switch_case_statement_list();
			setState(952);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(947);
				match(DEFAULT);
				setState(948);
				match(COLON);
				setState(950);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << LTCOLONGT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (TYPE - 64)) | (1L << (ANY - 64)) | (1L << (BREAK - 64)) | (1L << (CATEGORY - 64)) | (1L << (DELETE - 64)) | (1L << (DO - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (IF - 64)) | (1L << (METHOD - 64)) | (1L << (MUTABLE - 64)) | (1L << (NULL - 64)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (READ - 136)) | (1L << (RESOURCE - 136)) | (1L << (RETURN - 136)) | (1L << (SELF - 136)) | (1L << (SORTED - 136)) | (1L << (STORE - 136)) | (1L << (SUPER - 136)) | (1L << (SWITCH - 136)) | (1L << (THIS - 136)) | (1L << (THROW - 136)) | (1L << (TRY - 136)) | (1L << (WITH - 136)) | (1L << (WHILE - 136)) | (1L << (WRITE - 136)) | (1L << (BOOLEAN_LITERAL - 136)) | (1L << (CHAR_LITERAL - 136)) | (1L << (MIN_INTEGER - 136)) | (1L << (MAX_INTEGER - 136)) | (1L << (SYMBOL_IDENTIFIER - 136)) | (1L << (TYPE_IDENTIFIER - 136)) | (1L << (VARIABLE_IDENTIFIER - 136)) | (1L << (TEXT_LITERAL - 136)) | (1L << (UUID_LITERAL - 136)) | (1L << (VERSION_LITERAL - 136)) | (1L << (INTEGER_LITERAL - 136)) | (1L << (HEXA_LITERAL - 136)) | (1L << (DECIMAL_LITERAL - 136)) | (1L << (DATETIME_LITERAL - 136)) | (1L << (TIME_LITERAL - 136)) | (1L << (DATE_LITERAL - 136)) | (1L << (PERIOD_LITERAL - 136)))) != 0)) {
					{
					setState(949);
					((Switch_statementContext)_localctx).stmts = statement_list();
					}
				}

				}
			}

			setState(954);
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
		enterRule(_localctx, 68, RULE_switch_case_statement);
		try {
			setState(967);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				_localctx = new AtomicSwitchCaseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(956);
				match(CASE);
				setState(957);
				((AtomicSwitchCaseContext)_localctx).exp = atomic_literal();
				setState(958);
				match(COLON);
				setState(959);
				((AtomicSwitchCaseContext)_localctx).stmts = statement_list();
				}
				break;
			case 2:
				_localctx = new CollectionSwitchCaseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(961);
				match(CASE);
				setState(962);
				match(IN);
				setState(963);
				((CollectionSwitchCaseContext)_localctx).exp = literal_collection();
				setState(964);
				match(COLON);
				setState(965);
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
		enterRule(_localctx, 70, RULE_for_each_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(969);
			match(FOR);
			setState(970);
			match(EACH);
			setState(971);
			match(LPAR);
			setState(972);
			((For_each_statementContext)_localctx).name1 = variable_identifier();
			setState(975);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(973);
				match(COMMA);
				setState(974);
				((For_each_statementContext)_localctx).name2 = variable_identifier();
				}
			}

			setState(977);
			match(IN);
			setState(978);
			((For_each_statementContext)_localctx).source = expression(0);
			setState(979);
			match(RPAR);
			setState(980);
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
		enterRule(_localctx, 72, RULE_do_while_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(982);
			match(DO);
			setState(983);
			match(LCURL);
			setState(985);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << LTCOLONGT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (TYPE - 64)) | (1L << (ANY - 64)) | (1L << (BREAK - 64)) | (1L << (CATEGORY - 64)) | (1L << (DELETE - 64)) | (1L << (DO - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (IF - 64)) | (1L << (METHOD - 64)) | (1L << (MUTABLE - 64)) | (1L << (NULL - 64)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (READ - 136)) | (1L << (RESOURCE - 136)) | (1L << (RETURN - 136)) | (1L << (SELF - 136)) | (1L << (SORTED - 136)) | (1L << (STORE - 136)) | (1L << (SUPER - 136)) | (1L << (SWITCH - 136)) | (1L << (THIS - 136)) | (1L << (THROW - 136)) | (1L << (TRY - 136)) | (1L << (WITH - 136)) | (1L << (WHILE - 136)) | (1L << (WRITE - 136)) | (1L << (BOOLEAN_LITERAL - 136)) | (1L << (CHAR_LITERAL - 136)) | (1L << (MIN_INTEGER - 136)) | (1L << (MAX_INTEGER - 136)) | (1L << (SYMBOL_IDENTIFIER - 136)) | (1L << (TYPE_IDENTIFIER - 136)) | (1L << (VARIABLE_IDENTIFIER - 136)) | (1L << (TEXT_LITERAL - 136)) | (1L << (UUID_LITERAL - 136)) | (1L << (VERSION_LITERAL - 136)) | (1L << (INTEGER_LITERAL - 136)) | (1L << (HEXA_LITERAL - 136)) | (1L << (DECIMAL_LITERAL - 136)) | (1L << (DATETIME_LITERAL - 136)) | (1L << (TIME_LITERAL - 136)) | (1L << (DATE_LITERAL - 136)) | (1L << (PERIOD_LITERAL - 136)))) != 0)) {
				{
				setState(984);
				((Do_while_statementContext)_localctx).stmts = statement_list();
				}
			}

			setState(987);
			match(RCURL);
			setState(988);
			match(WHILE);
			setState(989);
			match(LPAR);
			setState(990);
			((Do_while_statementContext)_localctx).exp = expression(0);
			setState(991);
			match(RPAR);
			setState(992);
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
		enterRule(_localctx, 74, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(994);
			match(WHILE);
			setState(995);
			match(LPAR);
			setState(996);
			((While_statementContext)_localctx).exp = expression(0);
			setState(997);
			match(RPAR);
			setState(998);
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
		enterRule(_localctx, 76, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1000);
			match(IF);
			setState(1001);
			match(LPAR);
			setState(1002);
			((If_statementContext)_localctx).exp = expression(0);
			setState(1003);
			match(RPAR);
			setState(1004);
			((If_statementContext)_localctx).stmts = statement_or_list();
			setState(1006);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(1005);
				((If_statementContext)_localctx).elseIfs = else_if_statement_list(0);
				}
				break;
			}
			setState(1010);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(1008);
				match(ELSE);
				setState(1009);
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

			setState(1013);
			match(ELSE);
			setState(1014);
			match(IF);
			setState(1015);
			match(LPAR);
			setState(1016);
			((ElseIfStatementListContext)_localctx).exp = expression(0);
			setState(1017);
			match(RPAR);
			setState(1018);
			((ElseIfStatementListContext)_localctx).stmts = statement_or_list();
			}
			_ctx.stop = _input.LT(-1);
			setState(1030);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ElseIfStatementListItemContext(new Else_if_statement_listContext(_parentctx, _parentState));
					((ElseIfStatementListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_else_if_statement_list);
					setState(1020);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1021);
					match(ELSE);
					setState(1022);
					match(IF);
					setState(1023);
					match(LPAR);
					setState(1024);
					((ElseIfStatementListItemContext)_localctx).exp = expression(0);
					setState(1025);
					match(RPAR);
					setState(1026);
					((ElseIfStatementListItemContext)_localctx).stmts = statement_or_list();
					}
					} 
				}
				setState(1032);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
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
		enterRule(_localctx, 80, RULE_raise_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1033);
			match(THROW);
			setState(1034);
			((Raise_statementContext)_localctx).exp = expression(0);
			setState(1035);
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
		enterRule(_localctx, 82, RULE_try_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1037);
			match(TRY);
			setState(1038);
			match(LPAR);
			setState(1039);
			((Try_statementContext)_localctx).name = variable_identifier();
			setState(1040);
			match(RPAR);
			setState(1041);
			match(LCURL);
			setState(1043);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << LTCOLONGT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (TYPE - 64)) | (1L << (ANY - 64)) | (1L << (BREAK - 64)) | (1L << (CATEGORY - 64)) | (1L << (DELETE - 64)) | (1L << (DO - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (IF - 64)) | (1L << (METHOD - 64)) | (1L << (MUTABLE - 64)) | (1L << (NULL - 64)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (READ - 136)) | (1L << (RESOURCE - 136)) | (1L << (RETURN - 136)) | (1L << (SELF - 136)) | (1L << (SORTED - 136)) | (1L << (STORE - 136)) | (1L << (SUPER - 136)) | (1L << (SWITCH - 136)) | (1L << (THIS - 136)) | (1L << (THROW - 136)) | (1L << (TRY - 136)) | (1L << (WITH - 136)) | (1L << (WHILE - 136)) | (1L << (WRITE - 136)) | (1L << (BOOLEAN_LITERAL - 136)) | (1L << (CHAR_LITERAL - 136)) | (1L << (MIN_INTEGER - 136)) | (1L << (MAX_INTEGER - 136)) | (1L << (SYMBOL_IDENTIFIER - 136)) | (1L << (TYPE_IDENTIFIER - 136)) | (1L << (VARIABLE_IDENTIFIER - 136)) | (1L << (TEXT_LITERAL - 136)) | (1L << (UUID_LITERAL - 136)) | (1L << (VERSION_LITERAL - 136)) | (1L << (INTEGER_LITERAL - 136)) | (1L << (HEXA_LITERAL - 136)) | (1L << (DECIMAL_LITERAL - 136)) | (1L << (DATETIME_LITERAL - 136)) | (1L << (TIME_LITERAL - 136)) | (1L << (DATE_LITERAL - 136)) | (1L << (PERIOD_LITERAL - 136)))) != 0)) {
				{
				setState(1042);
				((Try_statementContext)_localctx).stmts = statement_list();
				}
			}

			setState(1045);
			match(RCURL);
			setState(1047);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(1046);
				((Try_statementContext)_localctx).handlers = catch_statement_list();
				}
				break;
			}
			setState(1058);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(1049);
				match(CATCH);
				setState(1050);
				match(LPAR);
				setState(1051);
				match(ANY);
				setState(1052);
				match(RPAR);
				setState(1053);
				match(LCURL);
				setState(1055);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << LTCOLONGT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (TYPE - 64)) | (1L << (ANY - 64)) | (1L << (BREAK - 64)) | (1L << (CATEGORY - 64)) | (1L << (DELETE - 64)) | (1L << (DO - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (IF - 64)) | (1L << (METHOD - 64)) | (1L << (MUTABLE - 64)) | (1L << (NULL - 64)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (READ - 136)) | (1L << (RESOURCE - 136)) | (1L << (RETURN - 136)) | (1L << (SELF - 136)) | (1L << (SORTED - 136)) | (1L << (STORE - 136)) | (1L << (SUPER - 136)) | (1L << (SWITCH - 136)) | (1L << (THIS - 136)) | (1L << (THROW - 136)) | (1L << (TRY - 136)) | (1L << (WITH - 136)) | (1L << (WHILE - 136)) | (1L << (WRITE - 136)) | (1L << (BOOLEAN_LITERAL - 136)) | (1L << (CHAR_LITERAL - 136)) | (1L << (MIN_INTEGER - 136)) | (1L << (MAX_INTEGER - 136)) | (1L << (SYMBOL_IDENTIFIER - 136)) | (1L << (TYPE_IDENTIFIER - 136)) | (1L << (VARIABLE_IDENTIFIER - 136)) | (1L << (TEXT_LITERAL - 136)) | (1L << (UUID_LITERAL - 136)) | (1L << (VERSION_LITERAL - 136)) | (1L << (INTEGER_LITERAL - 136)) | (1L << (HEXA_LITERAL - 136)) | (1L << (DECIMAL_LITERAL - 136)) | (1L << (DATETIME_LITERAL - 136)) | (1L << (TIME_LITERAL - 136)) | (1L << (DATE_LITERAL - 136)) | (1L << (PERIOD_LITERAL - 136)))) != 0)) {
					{
					setState(1054);
					((Try_statementContext)_localctx).anyStmts = statement_list();
					}
				}

				setState(1057);
				match(RCURL);
				}
				break;
			}
			setState(1066);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(1060);
				match(FINALLY);
				setState(1061);
				match(LCURL);
				setState(1063);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << LTCOLONGT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (TYPE - 64)) | (1L << (ANY - 64)) | (1L << (BREAK - 64)) | (1L << (CATEGORY - 64)) | (1L << (DELETE - 64)) | (1L << (DO - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (IF - 64)) | (1L << (METHOD - 64)) | (1L << (MUTABLE - 64)) | (1L << (NULL - 64)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (READ - 136)) | (1L << (RESOURCE - 136)) | (1L << (RETURN - 136)) | (1L << (SELF - 136)) | (1L << (SORTED - 136)) | (1L << (STORE - 136)) | (1L << (SUPER - 136)) | (1L << (SWITCH - 136)) | (1L << (THIS - 136)) | (1L << (THROW - 136)) | (1L << (TRY - 136)) | (1L << (WITH - 136)) | (1L << (WHILE - 136)) | (1L << (WRITE - 136)) | (1L << (BOOLEAN_LITERAL - 136)) | (1L << (CHAR_LITERAL - 136)) | (1L << (MIN_INTEGER - 136)) | (1L << (MAX_INTEGER - 136)) | (1L << (SYMBOL_IDENTIFIER - 136)) | (1L << (TYPE_IDENTIFIER - 136)) | (1L << (VARIABLE_IDENTIFIER - 136)) | (1L << (TEXT_LITERAL - 136)) | (1L << (UUID_LITERAL - 136)) | (1L << (VERSION_LITERAL - 136)) | (1L << (INTEGER_LITERAL - 136)) | (1L << (HEXA_LITERAL - 136)) | (1L << (DECIMAL_LITERAL - 136)) | (1L << (DATETIME_LITERAL - 136)) | (1L << (TIME_LITERAL - 136)) | (1L << (DATE_LITERAL - 136)) | (1L << (PERIOD_LITERAL - 136)))) != 0)) {
					{
					setState(1062);
					((Try_statementContext)_localctx).finalStmts = statement_list();
					}
				}

				setState(1065);
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
		enterRule(_localctx, 84, RULE_catch_statement);
		int _la;
		try {
			setState(1089);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				_localctx = new CatchAtomicStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1068);
				match(CATCH);
				setState(1069);
				match(LPAR);
				setState(1070);
				((CatchAtomicStatementContext)_localctx).name = symbol_identifier();
				setState(1071);
				match(RPAR);
				setState(1072);
				match(LCURL);
				setState(1074);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << LTCOLONGT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (TYPE - 64)) | (1L << (ANY - 64)) | (1L << (BREAK - 64)) | (1L << (CATEGORY - 64)) | (1L << (DELETE - 64)) | (1L << (DO - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (IF - 64)) | (1L << (METHOD - 64)) | (1L << (MUTABLE - 64)) | (1L << (NULL - 64)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (READ - 136)) | (1L << (RESOURCE - 136)) | (1L << (RETURN - 136)) | (1L << (SELF - 136)) | (1L << (SORTED - 136)) | (1L << (STORE - 136)) | (1L << (SUPER - 136)) | (1L << (SWITCH - 136)) | (1L << (THIS - 136)) | (1L << (THROW - 136)) | (1L << (TRY - 136)) | (1L << (WITH - 136)) | (1L << (WHILE - 136)) | (1L << (WRITE - 136)) | (1L << (BOOLEAN_LITERAL - 136)) | (1L << (CHAR_LITERAL - 136)) | (1L << (MIN_INTEGER - 136)) | (1L << (MAX_INTEGER - 136)) | (1L << (SYMBOL_IDENTIFIER - 136)) | (1L << (TYPE_IDENTIFIER - 136)) | (1L << (VARIABLE_IDENTIFIER - 136)) | (1L << (TEXT_LITERAL - 136)) | (1L << (UUID_LITERAL - 136)) | (1L << (VERSION_LITERAL - 136)) | (1L << (INTEGER_LITERAL - 136)) | (1L << (HEXA_LITERAL - 136)) | (1L << (DECIMAL_LITERAL - 136)) | (1L << (DATETIME_LITERAL - 136)) | (1L << (TIME_LITERAL - 136)) | (1L << (DATE_LITERAL - 136)) | (1L << (PERIOD_LITERAL - 136)))) != 0)) {
					{
					setState(1073);
					((CatchAtomicStatementContext)_localctx).stmts = statement_list();
					}
				}

				setState(1076);
				match(RCURL);
				}
				break;
			case 2:
				_localctx = new CatchCollectionStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1078);
				match(CATCH);
				setState(1079);
				match(IN);
				setState(1080);
				match(LPAR);
				setState(1081);
				((CatchCollectionStatementContext)_localctx).exp = symbol_list();
				setState(1082);
				match(RPAR);
				setState(1083);
				match(LCURL);
				setState(1085);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << LTCOLONGT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (TYPE - 64)) | (1L << (ANY - 64)) | (1L << (BREAK - 64)) | (1L << (CATEGORY - 64)) | (1L << (DELETE - 64)) | (1L << (DO - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (IF - 64)) | (1L << (METHOD - 64)) | (1L << (MUTABLE - 64)) | (1L << (NULL - 64)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (READ - 136)) | (1L << (RESOURCE - 136)) | (1L << (RETURN - 136)) | (1L << (SELF - 136)) | (1L << (SORTED - 136)) | (1L << (STORE - 136)) | (1L << (SUPER - 136)) | (1L << (SWITCH - 136)) | (1L << (THIS - 136)) | (1L << (THROW - 136)) | (1L << (TRY - 136)) | (1L << (WITH - 136)) | (1L << (WHILE - 136)) | (1L << (WRITE - 136)) | (1L << (BOOLEAN_LITERAL - 136)) | (1L << (CHAR_LITERAL - 136)) | (1L << (MIN_INTEGER - 136)) | (1L << (MAX_INTEGER - 136)) | (1L << (SYMBOL_IDENTIFIER - 136)) | (1L << (TYPE_IDENTIFIER - 136)) | (1L << (VARIABLE_IDENTIFIER - 136)) | (1L << (TEXT_LITERAL - 136)) | (1L << (UUID_LITERAL - 136)) | (1L << (VERSION_LITERAL - 136)) | (1L << (INTEGER_LITERAL - 136)) | (1L << (HEXA_LITERAL - 136)) | (1L << (DECIMAL_LITERAL - 136)) | (1L << (DATETIME_LITERAL - 136)) | (1L << (TIME_LITERAL - 136)) | (1L << (DATE_LITERAL - 136)) | (1L << (PERIOD_LITERAL - 136)))) != 0)) {
					{
					setState(1084);
					((CatchCollectionStatementContext)_localctx).stmts = statement_list();
					}
				}

				setState(1087);
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
		enterRule(_localctx, 86, RULE_break_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1091);
			match(BREAK);
			setState(1092);
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
		enterRule(_localctx, 88, RULE_return_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1094);
			match(RETURN);
			setState(1096);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << XMARK) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << LTCOLONGT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (TYPE - 64)) | (1L << (ANY - 64)) | (1L << (CATEGORY - 64)) | (1L << (EXECUTE - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (MUTABLE - 64)) | (1L << (NULL - 64)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (READ - 136)) | (1L << (RESOURCE - 136)) | (1L << (SELF - 136)) | (1L << (SORTED - 136)) | (1L << (SUPER - 136)) | (1L << (THIS - 136)) | (1L << (BOOLEAN_LITERAL - 136)) | (1L << (CHAR_LITERAL - 136)) | (1L << (MIN_INTEGER - 136)) | (1L << (MAX_INTEGER - 136)) | (1L << (SYMBOL_IDENTIFIER - 136)) | (1L << (TYPE_IDENTIFIER - 136)) | (1L << (VARIABLE_IDENTIFIER - 136)) | (1L << (TEXT_LITERAL - 136)) | (1L << (UUID_LITERAL - 136)) | (1L << (VERSION_LITERAL - 136)) | (1L << (INTEGER_LITERAL - 136)) | (1L << (HEXA_LITERAL - 136)) | (1L << (DECIMAL_LITERAL - 136)) | (1L << (DATETIME_LITERAL - 136)) | (1L << (TIME_LITERAL - 136)) | (1L << (DATE_LITERAL - 136)) | (1L << (PERIOD_LITERAL - 136)))) != 0)) {
				{
				setState(1095);
				((Return_statementContext)_localctx).exp = expression(0);
				}
			}

			setState(1098);
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
		enterRule(_localctx, 90, RULE_method_call_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1100);
			((Method_call_expressionContext)_localctx).name = method_identifier();
			setState(1101);
			match(LPAR);
			setState(1103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << XMARK) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << LTCOLONGT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (TYPE - 64)) | (1L << (ANY - 64)) | (1L << (CATEGORY - 64)) | (1L << (EXECUTE - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (MUTABLE - 64)) | (1L << (NULL - 64)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (READ - 136)) | (1L << (RESOURCE - 136)) | (1L << (SELF - 136)) | (1L << (SORTED - 136)) | (1L << (SUPER - 136)) | (1L << (THIS - 136)) | (1L << (BOOLEAN_LITERAL - 136)) | (1L << (CHAR_LITERAL - 136)) | (1L << (MIN_INTEGER - 136)) | (1L << (MAX_INTEGER - 136)) | (1L << (SYMBOL_IDENTIFIER - 136)) | (1L << (TYPE_IDENTIFIER - 136)) | (1L << (VARIABLE_IDENTIFIER - 136)) | (1L << (TEXT_LITERAL - 136)) | (1L << (UUID_LITERAL - 136)) | (1L << (VERSION_LITERAL - 136)) | (1L << (INTEGER_LITERAL - 136)) | (1L << (HEXA_LITERAL - 136)) | (1L << (DECIMAL_LITERAL - 136)) | (1L << (DATETIME_LITERAL - 136)) | (1L << (TIME_LITERAL - 136)) | (1L << (DATE_LITERAL - 136)) | (1L << (PERIOD_LITERAL - 136)))) != 0)) {
				{
				setState(1102);
				((Method_call_expressionContext)_localctx).args = argument_assignment_list(0);
				}
			}

			setState(1105);
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
		enterRule(_localctx, 92, RULE_method_call_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(1107);
				((Method_call_statementContext)_localctx).parent = instance_expression(0);
				setState(1108);
				match(DOT);
				}
				break;
			}
			setState(1112);
			((Method_call_statementContext)_localctx).method = method_call_expression();
			setState(1123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THEN:
				{
				{
				setState(1113);
				match(THEN);
				setState(1116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(1114);
					match(WITH);
					setState(1115);
					((Method_call_statementContext)_localctx).name = variable_identifier();
					}
				}

				setState(1118);
				match(LCURL);
				setState(1119);
				((Method_call_statementContext)_localctx).stmts = statement_list();
				setState(1120);
				match(RCURL);
				}
				}
				break;
			case SEMI:
				{
				setState(1122);
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
		enterRule(_localctx, 94, RULE_x_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1125);
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
		int _startState = 96;
		enterRecursionRule(_localctx, 96, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				_localctx = new CssExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1128);
				((CssExpressionContext)_localctx).exp = css_expression();
				}
				break;
			case 2:
				{
				_localctx = new JsxExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1129);
				((JsxExpressionContext)_localctx).exp = jsx_expression();
				}
				break;
			case 3:
				{
				_localctx = new InstanceExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1130);
				((InstanceExpressionContext)_localctx).exp = instance_expression(0);
				}
				break;
			case 4:
				{
				_localctx = new MutableInstanceExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1131);
				((MutableInstanceExpressionContext)_localctx).exp = mutable_instance_expression(0);
				}
				break;
			case 5:
				{
				_localctx = new ArrowExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1132);
				((ArrowExpressionContext)_localctx).exp = arrow_expression();
				}
				break;
			case 6:
				{
				_localctx = new MinusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1133);
				match(MINUS);
				setState(1134);
				((MinusExpressionContext)_localctx).exp = expression(24);
				}
				break;
			case 7:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1135);
				match(XMARK);
				setState(1136);
				((NotExpressionContext)_localctx).exp = expression(23);
				}
				break;
			case 8:
				{
				_localctx = new CastExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1137);
				match(LPAR);
				setState(1139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MUTABLE) {
					{
					setState(1138);
					match(MUTABLE);
					}
				}

				setState(1141);
				((CastExpressionContext)_localctx).right = category_or_any_type();
				setState(1142);
				match(RPAR);
				setState(1143);
				((CastExpressionContext)_localctx).left = expression(22);
				}
				break;
			case 9:
				{
				_localctx = new CodeExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1145);
				match(CODE);
				setState(1146);
				match(LPAR);
				setState(1147);
				((CodeExpressionContext)_localctx).exp = expression(0);
				setState(1148);
				match(RPAR);
				}
				break;
			case 10:
				{
				_localctx = new ExecuteExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1150);
				match(EXECUTE);
				setState(1151);
				match(LPAR);
				setState(1152);
				((ExecuteExpressionContext)_localctx).name = variable_identifier();
				setState(1153);
				match(RPAR);
				}
				break;
			case 11:
				{
				_localctx = new TypeExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1155);
				((TypeExpressionContext)_localctx).exp = type_expression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1250);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1248);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplyExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((MultiplyExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1158);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1159);
						multiply();
						setState(1160);
						((MultiplyExpressionContext)_localctx).right = expression(22);
						}
						break;
					case 2:
						{
						_localctx = new DivideExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((DivideExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1162);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1163);
						divide();
						setState(1164);
						((DivideExpressionContext)_localctx).right = expression(21);
						}
						break;
					case 3:
						{
						_localctx = new ModuloExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ModuloExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1166);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1167);
						modulo();
						setState(1168);
						((ModuloExpressionContext)_localctx).right = expression(20);
						}
						break;
					case 4:
						{
						_localctx = new IntDivideExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((IntDivideExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1170);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1171);
						idivide();
						setState(1172);
						((IntDivideExpressionContext)_localctx).right = expression(19);
						}
						break;
					case 5:
						{
						_localctx = new AddExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((AddExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1174);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1175);
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
						setState(1176);
						((AddExpressionContext)_localctx).right = expression(18);
						}
						break;
					case 6:
						{
						_localctx = new CompareExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((CompareExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1177);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1178);
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
						setState(1179);
						((CompareExpressionContext)_localctx).right = expression(17);
						}
						break;
					case 7:
						{
						_localctx = new IsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((IsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1180);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1181);
						match(IS);
						setState(1183);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(1182);
							match(NOT);
							}
						}

						setState(1185);
						((IsExpressionContext)_localctx).right = expression(15);
						}
						break;
					case 8:
						{
						_localctx = new EqualsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((EqualsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1186);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1187);
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
						setState(1188);
						((EqualsExpressionContext)_localctx).right = expression(14);
						}
						break;
					case 9:
						{
						_localctx = new ContainsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ContainsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1189);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1191);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(1190);
							match(NOT);
							}
						}

						setState(1193);
						match(CONTAINS);
						setState(1194);
						((ContainsExpressionContext)_localctx).right = expression(13);
						}
						break;
					case 10:
						{
						_localctx = new InExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((InExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1195);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1197);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(1196);
							match(NOT);
							}
						}

						setState(1199);
						match(IN);
						setState(1200);
						((InExpressionContext)_localctx).right = expression(12);
						}
						break;
					case 11:
						{
						_localctx = new HasExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((HasExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1201);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1203);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(1202);
							match(NOT);
							}
						}

						setState(1205);
						match(HAS);
						setState(1206);
						((HasExpressionContext)_localctx).right = expression(11);
						}
						break;
					case 12:
						{
						_localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((OrExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1207);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1208);
						match(PIPE2);
						setState(1209);
						((OrExpressionContext)_localctx).right = expression(8);
						}
						break;
					case 13:
						{
						_localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((AndExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1210);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1211);
						match(AMP2);
						setState(1212);
						((AndExpressionContext)_localctx).right = expression(7);
						}
						break;
					case 14:
						{
						_localctx = new TernaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((TernaryExpressionContext)_localctx).test = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1213);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1214);
						match(QMARK);
						setState(1215);
						((TernaryExpressionContext)_localctx).ifTrue = expression(0);
						setState(1216);
						match(COLON);
						setState(1217);
						((TernaryExpressionContext)_localctx).ifFalse = expression(6);
						}
						break;
					case 15:
						{
						_localctx = new IsAnExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((IsAnExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1219);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1220);
						match(IS);
						setState(1222);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
						case 1:
							{
							setState(1221);
							match(NOT);
							}
							break;
						}
						setState(1224);
						((IsAnExpressionContext)_localctx).right = an_expression();
						}
						break;
					case 16:
						{
						_localctx = new HasAllExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((HasAllExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1225);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1227);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(1226);
							match(NOT);
							}
						}

						setState(1229);
						match(HAS);
						setState(1230);
						match(ALL);
						setState(1231);
						((HasAllExpressionContext)_localctx).right = filter_expression();
						}
						break;
					case 17:
						{
						_localctx = new HasAnyExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((HasAnyExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1232);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1234);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(1233);
							match(NOT);
							}
						}

						setState(1236);
						match(HAS);
						setState(1237);
						match(ANY);
						setState(1238);
						((HasAnyExpressionContext)_localctx).right = filter_expression();
						}
						break;
					case 18:
						{
						_localctx = new IteratorExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((IteratorExpressionContext)_localctx).exp = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1239);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1240);
						match(FOR);
						setState(1241);
						match(EACH);
						setState(1242);
						match(LPAR);
						setState(1243);
						((IteratorExpressionContext)_localctx).name = variable_identifier();
						setState(1244);
						match(IN);
						setState(1245);
						((IteratorExpressionContext)_localctx).source = expression(0);
						setState(1246);
						match(RPAR);
						}
						break;
					}
					} 
				}
				setState(1252);
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
		enterRule(_localctx, 98, RULE_filter_expression);
		try {
			setState(1267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				_localctx = new ArrowFilterExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1253);
				match(WHERE);
				setState(1254);
				match(LPAR);
				setState(1255);
				arrow_expression();
				setState(1256);
				match(RPAR);
				}
				break;
			case 2:
				_localctx = new ExplicitFilterExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1258);
				match(LPAR);
				setState(1259);
				variable_identifier();
				setState(1260);
				match(RPAR);
				setState(1261);
				match(WHERE);
				setState(1262);
				match(LPAR);
				setState(1263);
				expression(0);
				setState(1264);
				match(RPAR);
				}
				break;
			case 3:
				_localctx = new OtherFilterExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1266);
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
		enterRule(_localctx, 100, RULE_an_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1269);
			if (!(this.willBeAOrAn())) throw new FailedPredicateException(this, "$parser.willBeAOrAn()");
			setState(1270);
			match(VARIABLE_IDENTIFIER);
			setState(1271);
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
		enterRule(_localctx, 102, RULE_type_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1273);
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
		enterRule(_localctx, 104, RULE_selectable_expression);
		try {
			setState(1281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				_localctx = new MethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1275);
				((MethodExpressionContext)_localctx).exp = method_expression();
				}
				break;
			case 2:
				_localctx = new ParenthesisExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1276);
				((ParenthesisExpressionContext)_localctx).exp = parenthesis_expression();
				}
				break;
			case 3:
				_localctx = new LiteralExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1277);
				((LiteralExpressionContext)_localctx).exp = literal_expression();
				}
				break;
			case 4:
				_localctx = new IdentifierExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1278);
				((IdentifierExpressionContext)_localctx).exp = identifier();
				}
				break;
			case 5:
				_localctx = new ThisExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1279);
				((ThisExpressionContext)_localctx).exp = this_expression();
				}
				break;
			case 6:
				_localctx = new SuperExpressionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1280);
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

			setState(1284);
			((SelectableExpressionContext)_localctx).parent = selectable_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(1290);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SelectorExpressionContext(new Instance_expressionContext(_parentctx, _parentState));
					((SelectorExpressionContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_instance_expression);
					setState(1286);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1287);
					((SelectorExpressionContext)_localctx).selector = instance_selector();
					}
					} 
				}
				setState(1292);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
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
		int _startState = 108;
		enterRecursionRule(_localctx, 108, RULE_mutable_instance_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new MutableSelectableExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1294);
			match(MUTABLE);
			setState(1295);
			((MutableSelectableExpressionContext)_localctx).exp = identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(1301);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MutableSelectorExpressionContext(new Mutable_instance_expressionContext(_parentctx, _parentState));
					((MutableSelectorExpressionContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_mutable_instance_expression);
					setState(1297);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1298);
					((MutableSelectorExpressionContext)_localctx).selector = instance_selector();
					}
					} 
				}
				setState(1303);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
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
		enterRule(_localctx, 110, RULE_method_expression);
		try {
			setState(1314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1304);
				blob_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1305);
				document_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1306);
				filtered_list_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1307);
				fetch_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1308);
				read_blob_expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1309);
				read_all_expression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1310);
				read_one_expression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1311);
				sorted_expression();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1312);
				method_call_expression();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1313);
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
		enterRule(_localctx, 112, RULE_blob_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1316);
			match(BLOB);
			setState(1317);
			match(LPAR);
			setState(1318);
			expression(0);
			setState(1319);
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
		enterRule(_localctx, 114, RULE_document_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1321);
			match(DOCUMENT);
			setState(1322);
			match(LPAR);
			setState(1326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(1323);
				match(FROM);
				setState(1324);
				match(EQ);
				setState(1325);
				((Document_expressionContext)_localctx).exp = expression(0);
				}
			}

			setState(1328);
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
		enterRule(_localctx, 116, RULE_write_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1330);
			match(WRITE);
			setState(1331);
			match(LPAR);
			setState(1332);
			((Write_statementContext)_localctx).what = expression(0);
			setState(1333);
			match(RPAR);
			setState(1334);
			match(TO);
			setState(1335);
			((Write_statementContext)_localctx).target = expression(0);
			setState(1338);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THEN:
				{
				setState(1336);
				then();
				}
				break;
			case SEMI:
				{
				setState(1337);
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
		enterRule(_localctx, 118, RULE_filtered_list_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1340);
			match(FILTERED);
			setState(1341);
			match(LPAR);
			setState(1342);
			((Filtered_list_expressionContext)_localctx).source = expression(0);
			setState(1343);
			match(RPAR);
			setState(1349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1344);
				match(WITH);
				setState(1345);
				match(LPAR);
				setState(1346);
				((Filtered_list_expressionContext)_localctx).name = variable_identifier();
				setState(1347);
				match(RPAR);
				}
			}

			setState(1351);
			match(WHERE);
			setState(1352);
			match(LPAR);
			setState(1353);
			((Filtered_list_expressionContext)_localctx).predicate = expression(0);
			setState(1354);
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
		enterRule(_localctx, 120, RULE_fetch_expression);
		int _la;
		try {
			setState(1420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				_localctx = new FetchOneContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1356);
				match(FETCH);
				setState(1357);
				match(ONE);
				setState(1362);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAR) {
					{
					setState(1358);
					match(LPAR);
					setState(1359);
					((FetchOneContext)_localctx).typ = mutable_category_type();
					setState(1360);
					match(RPAR);
					}
				}

				setState(1364);
				match(WHERE);
				setState(1365);
				match(LPAR);
				setState(1366);
				((FetchOneContext)_localctx).predicate = expression(0);
				setState(1367);
				match(RPAR);
				setState(1373);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
				case 1:
					{
					setState(1368);
					match(INCLUDE);
					setState(1369);
					match(LPAR);
					setState(1370);
					((FetchOneContext)_localctx).include = include_list();
					setState(1371);
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
				setState(1375);
				match(FETCH);
				setState(1396);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ALL:
					{
					{
					setState(1376);
					match(ALL);
					setState(1381);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
					case 1:
						{
						setState(1377);
						match(LPAR);
						setState(1378);
						((FetchManyContext)_localctx).typ = mutable_category_type();
						setState(1379);
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
					setState(1387);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LPAR) {
						{
						setState(1383);
						match(LPAR);
						setState(1384);
						((FetchManyContext)_localctx).typ = mutable_category_type();
						setState(1385);
						match(RPAR);
						}
					}

					setState(1389);
					match(ROWS);
					setState(1390);
					match(LPAR);
					setState(1391);
					((FetchManyContext)_localctx).xstart = expression(0);
					setState(1392);
					match(TO);
					setState(1393);
					((FetchManyContext)_localctx).xstop = expression(0);
					setState(1394);
					match(RPAR);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1403);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
				case 1:
					{
					setState(1398);
					match(WHERE);
					setState(1399);
					match(LPAR);
					setState(1400);
					((FetchManyContext)_localctx).predicate = expression(0);
					setState(1401);
					match(RPAR);
					}
					break;
				}
				setState(1410);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					setState(1405);
					match(INCLUDE);
					setState(1406);
					match(LPAR);
					setState(1407);
					((FetchManyContext)_localctx).include = include_list();
					setState(1408);
					match(RPAR);
					}
					break;
				}
				setState(1418);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
				case 1:
					{
					setState(1412);
					match(ORDER);
					setState(1413);
					match(BY);
					setState(1414);
					match(LPAR);
					setState(1415);
					((FetchManyContext)_localctx).orderby = order_by_list();
					setState(1416);
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
		enterRule(_localctx, 122, RULE_fetch_statement);
		int _la;
		try {
			setState(1489);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				_localctx = new FetchOneAsyncContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1422);
				match(FETCH);
				setState(1423);
				match(ONE);
				setState(1428);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAR) {
					{
					setState(1424);
					match(LPAR);
					setState(1425);
					((FetchOneAsyncContext)_localctx).typ = mutable_category_type();
					setState(1426);
					match(RPAR);
					}
				}

				setState(1430);
				match(WHERE);
				setState(1431);
				match(LPAR);
				setState(1432);
				((FetchOneAsyncContext)_localctx).predicate = expression(0);
				setState(1433);
				match(RPAR);
				setState(1439);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INCLUDE) {
					{
					setState(1434);
					match(INCLUDE);
					setState(1435);
					match(LPAR);
					setState(1436);
					((FetchOneAsyncContext)_localctx).include = include_list();
					setState(1437);
					match(RPAR);
					}
				}

				setState(1441);
				then();
				}
				break;
			case 2:
				_localctx = new FetchManyAsyncContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1443);
				match(FETCH);
				setState(1464);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ALL:
					{
					{
					setState(1444);
					match(ALL);
					setState(1449);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LPAR) {
						{
						setState(1445);
						match(LPAR);
						setState(1446);
						((FetchManyAsyncContext)_localctx).typ = mutable_category_type();
						setState(1447);
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
					setState(1455);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LPAR) {
						{
						setState(1451);
						match(LPAR);
						setState(1452);
						((FetchManyAsyncContext)_localctx).typ = mutable_category_type();
						setState(1453);
						match(RPAR);
						}
					}

					setState(1457);
					match(ROWS);
					setState(1458);
					match(LPAR);
					setState(1459);
					((FetchManyAsyncContext)_localctx).xstart = expression(0);
					setState(1460);
					match(TO);
					setState(1461);
					((FetchManyAsyncContext)_localctx).xstop = expression(0);
					setState(1462);
					match(RPAR);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1471);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(1466);
					match(WHERE);
					setState(1467);
					match(LPAR);
					setState(1468);
					((FetchManyAsyncContext)_localctx).predicate = expression(0);
					setState(1469);
					match(RPAR);
					}
				}

				setState(1478);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INCLUDE) {
					{
					setState(1473);
					match(INCLUDE);
					setState(1474);
					match(LPAR);
					setState(1475);
					((FetchManyAsyncContext)_localctx).include = include_list();
					setState(1476);
					match(RPAR);
					}
				}

				setState(1486);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ORDER) {
					{
					setState(1480);
					match(ORDER);
					setState(1481);
					match(BY);
					setState(1482);
					match(LPAR);
					setState(1483);
					((FetchManyAsyncContext)_localctx).orderby = order_by_list();
					setState(1484);
					match(RPAR);
					}
				}

				setState(1488);
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
		enterRule(_localctx, 124, RULE_then);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1491);
			match(THEN);
			setState(1492);
			match(WITH);
			setState(1493);
			((ThenContext)_localctx).name = variable_identifier();
			setState(1494);
			match(LCURL);
			setState(1495);
			((ThenContext)_localctx).stmts = statement_list();
			setState(1496);
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
		enterRule(_localctx, 126, RULE_read_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1498);
			match(READ);
			setState(1499);
			match(ALL);
			setState(1500);
			match(FROM);
			setState(1501);
			((Read_statementContext)_localctx).source = expression(0);
			setState(1502);
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
		enterRule(_localctx, 128, RULE_sorted_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1504);
			match(SORTED);
			setState(1506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DESC) {
				{
				setState(1505);
				match(DESC);
				}
			}

			setState(1508);
			match(LPAR);
			setState(1509);
			((Sorted_expressionContext)_localctx).source = instance_expression(0);
			setState(1515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1510);
				match(COMMA);
				setState(1511);
				key_token();
				setState(1512);
				match(EQ);
				setState(1513);
				((Sorted_expressionContext)_localctx).key = sorted_key();
				}
			}

			setState(1517);
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
		enterRule(_localctx, 130, RULE_instance_selector);
		try {
			setState(1531);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				_localctx = new MemberSelectorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1519);
				match(DOT);
				setState(1520);
				((MemberSelectorContext)_localctx).name = member_identifier();
				}
				break;
			case 2:
				_localctx = new MethodSelectorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1521);
				match(DOT);
				setState(1522);
				((MethodSelectorContext)_localctx).method = method_call_expression();
				}
				break;
			case 3:
				_localctx = new ItemSelectorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1523);
				match(LBRAK);
				setState(1524);
				((ItemSelectorContext)_localctx).exp = expression(0);
				setState(1525);
				match(RBRAK);
				}
				break;
			case 4:
				_localctx = new SliceSelectorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1527);
				match(LBRAK);
				setState(1528);
				((SliceSelectorContext)_localctx).xslice = slice_arguments();
				setState(1529);
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
		enterRule(_localctx, 132, RULE_constructor_expression);
		int _la;
		try {
			setState(1549);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				_localctx = new ConstructorFromContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1533);
				((ConstructorFromContext)_localctx).typ = mutable_category_type();
				setState(1534);
				match(LPAR);
				setState(1535);
				((ConstructorFromContext)_localctx).copyExp = copy_from();
				setState(1538);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1536);
					match(COMMA);
					setState(1537);
					((ConstructorFromContext)_localctx).args = argument_assignment_list(0);
					}
				}

				setState(1540);
				match(RPAR);
				}
				break;
			case 2:
				_localctx = new ConstructorNoFromContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1542);
				((ConstructorNoFromContext)_localctx).typ = mutable_category_type();
				setState(1543);
				match(LPAR);
				setState(1545);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << XMARK) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << LTCOLONGT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (TYPE - 64)) | (1L << (ANY - 64)) | (1L << (CATEGORY - 64)) | (1L << (EXECUTE - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (MUTABLE - 64)) | (1L << (NULL - 64)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (READ - 136)) | (1L << (RESOURCE - 136)) | (1L << (SELF - 136)) | (1L << (SORTED - 136)) | (1L << (SUPER - 136)) | (1L << (THIS - 136)) | (1L << (BOOLEAN_LITERAL - 136)) | (1L << (CHAR_LITERAL - 136)) | (1L << (MIN_INTEGER - 136)) | (1L << (MAX_INTEGER - 136)) | (1L << (SYMBOL_IDENTIFIER - 136)) | (1L << (TYPE_IDENTIFIER - 136)) | (1L << (VARIABLE_IDENTIFIER - 136)) | (1L << (TEXT_LITERAL - 136)) | (1L << (UUID_LITERAL - 136)) | (1L << (VERSION_LITERAL - 136)) | (1L << (INTEGER_LITERAL - 136)) | (1L << (HEXA_LITERAL - 136)) | (1L << (DECIMAL_LITERAL - 136)) | (1L << (DATETIME_LITERAL - 136)) | (1L << (TIME_LITERAL - 136)) | (1L << (DATE_LITERAL - 136)) | (1L << (PERIOD_LITERAL - 136)))) != 0)) {
					{
					setState(1544);
					((ConstructorNoFromContext)_localctx).args = argument_assignment_list(0);
					}
				}

				setState(1547);
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
		enterRule(_localctx, 134, RULE_copy_from);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1551);
			match(FROM);
			setState(1552);
			assign();
			setState(1553);
			((Copy_fromContext)_localctx).exp = expression(0);
			setState(1554);
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
		int _startState = 136;
		enterRecursionRule(_localctx, 136, RULE_argument_assignment_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1561);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				{
				_localctx = new ExpressionAssignmentListContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1557);
				((ExpressionAssignmentListContext)_localctx).exp = expression(0);
				setState(1558);
				if (!(this.willNotBe(this.equalToken()))) throw new FailedPredicateException(this, "$parser.willNotBe($parser.equalToken())");
				}
				break;
			case 2:
				{
				_localctx = new ArgumentAssignmentListContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1560);
				((ArgumentAssignmentListContext)_localctx).item = argument_assignment();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1568);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArgumentAssignmentListItemContext(new Argument_assignment_listContext(_parentctx, _parentState));
					((ArgumentAssignmentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_argument_assignment_list);
					setState(1563);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1564);
					match(COMMA);
					setState(1565);
					((ArgumentAssignmentListItemContext)_localctx).item = argument_assignment();
					}
					} 
				}
				setState(1570);
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
		enterRule(_localctx, 138, RULE_argument_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1571);
			((Argument_assignmentContext)_localctx).name = variable_identifier();
			setState(1575);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				{
				setState(1572);
				assign();
				setState(1573);
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
		enterRule(_localctx, 140, RULE_assign_instance_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1577);
			((Assign_instance_statementContext)_localctx).inst = assignable_instance(0);
			setState(1578);
			assign();
			setState(1579);
			((Assign_instance_statementContext)_localctx).exp = expression(0);
			setState(1580);
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
		enterRule(_localctx, 142, RULE_child_instance);
		try {
			setState(1588);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				_localctx = new MemberInstanceContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1582);
				match(DOT);
				setState(1583);
				((MemberInstanceContext)_localctx).name = variable_identifier();
				}
				break;
			case LBRAK:
				_localctx = new ItemInstanceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1584);
				match(LBRAK);
				setState(1585);
				((ItemInstanceContext)_localctx).exp = expression(0);
				setState(1586);
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
		enterRule(_localctx, 144, RULE_assign_tuple_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1590);
			((Assign_tuple_statementContext)_localctx).items = variable_identifier_list();
			setState(1591);
			assign();
			setState(1592);
			((Assign_tuple_statementContext)_localctx).exp = expression(0);
			setState(1593);
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
		enterRule(_localctx, 146, RULE_type_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1595);
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
		enterRule(_localctx, 148, RULE_null_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1597);
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
		enterRule(_localctx, 150, RULE_ws_plus);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1602);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1599);
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
				setState(1604);
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
		enterRule(_localctx, 152, RULE_repl);
		try {
			setState(1608);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1605);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1606);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1607);
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
		enterRule(_localctx, 154, RULE_declaration_list);
		int _la;
		try {
			_localctx = new FullDeclarationListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1610);
			lfs();
			setState(1612);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (TYPE - 64)) | (1L << (ABSTRACT - 64)) | (1L << (ANY - 64)) | (1L << (ATTRIBUTE - 64)) | (1L << (CATEGORY - 64)) | (1L << (ENUMERATED - 64)) | (1L << (METHOD - 64)) | (1L << (MUTABLE - 64)) | (1L << (NATIVE - 64)))) != 0) || ((((_la - 144)) & ~0x3f) == 0 && ((1L << (_la - 144)) & ((1L << (SINGLETON - 144)) | (1L << (STORABLE - 144)) | (1L << (TEST - 144)) | (1L << (WIDGET - 144)) | (1L << (TYPE_IDENTIFIER - 144)) | (1L << (ARONDBASE_IDENTIFIER - 144)))) != 0)) {
				{
				setState(1611);
				declarations();
				}
			}

			setState(1614);
			lfs();
			setState(1615);
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
		enterRule(_localctx, 156, RULE_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1617);
			declaration();
			setState(1623);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (TYPE - 64)) | (1L << (ABSTRACT - 64)) | (1L << (ANY - 64)) | (1L << (ATTRIBUTE - 64)) | (1L << (CATEGORY - 64)) | (1L << (ENUMERATED - 64)) | (1L << (METHOD - 64)) | (1L << (MUTABLE - 64)) | (1L << (NATIVE - 64)))) != 0) || ((((_la - 144)) & ~0x3f) == 0 && ((1L << (_la - 144)) & ((1L << (SINGLETON - 144)) | (1L << (STORABLE - 144)) | (1L << (TEST - 144)) | (1L << (WIDGET - 144)) | (1L << (TYPE_IDENTIFIER - 144)) | (1L << (ARONDBASE_IDENTIFIER - 144)))) != 0)) {
				{
				{
				setState(1618);
				lfp();
				setState(1619);
				declaration();
				}
				}
				setState(1625);
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
		enterRule(_localctx, 158, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1631);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(1626);
				comment_statement();
				setState(1627);
				lfp();
				}
				}
				setState(1633);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1639);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ARONDBASE_IDENTIFIER) {
				{
				{
				setState(1634);
				annotation_constructor();
				setState(1635);
				lfp();
				}
				}
				setState(1641);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1648);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				{
				setState(1642);
				attribute_declaration();
				}
				break;
			case 2:
				{
				setState(1643);
				category_declaration();
				}
				break;
			case 3:
				{
				setState(1644);
				resource_declaration();
				}
				break;
			case 4:
				{
				setState(1645);
				enum_declaration();
				}
				break;
			case 5:
				{
				setState(1646);
				widget_declaration();
				}
				break;
			case 6:
				{
				setState(1647);
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
		enterRule(_localctx, 160, RULE_annotation_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1650);
			((Annotation_constructorContext)_localctx).name = annotation_identifier();
			setState(1665);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(1651);
				match(LPAR);
				setState(1661);
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
					setState(1652);
					((Annotation_constructorContext)_localctx).exp = annotation_argument_value();
					}
					break;
				case GETTER:
				case SETTER:
				case VARIABLE_IDENTIFIER:
					{
					{
					setState(1653);
					annotation_argument();
					setState(1658);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1654);
						match(COMMA);
						setState(1655);
						annotation_argument();
						}
						}
						setState(1660);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1663);
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
		enterRule(_localctx, 162, RULE_annotation_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1667);
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
		enterRule(_localctx, 164, RULE_annotation_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1669);
			((Annotation_argumentContext)_localctx).name = annotation_argument_name();
			setState(1670);
			match(EQ);
			setState(1671);
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
		enterRule(_localctx, 166, RULE_annotation_argument_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1673);
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
		enterRule(_localctx, 168, RULE_annotation_argument_value);
		try {
			setState(1677);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				_localctx = new AnnotationLiteralValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1675);
				((AnnotationLiteralValueContext)_localctx).exp = literal_expression();
				}
				break;
			case 2:
				_localctx = new AnnotationTypeValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1676);
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
		enterRule(_localctx, 170, RULE_resource_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1679);
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
		enterRule(_localctx, 172, RULE_enum_declaration);
		try {
			setState(1683);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1681);
				enum_category_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1682);
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
		enterRule(_localctx, 174, RULE_native_symbol_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1685);
			native_symbol();
			setState(1691);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SYMBOL_IDENTIFIER) {
				{
				{
				setState(1686);
				lfp();
				setState(1687);
				native_symbol();
				}
				}
				setState(1693);
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
		enterRule(_localctx, 176, RULE_category_symbol_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1694);
			category_symbol();
			setState(1700);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SYMBOL_IDENTIFIER) {
				{
				{
				setState(1695);
				lfp();
				setState(1696);
				category_symbol();
				}
				}
				setState(1702);
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
		enterRule(_localctx, 178, RULE_symbol_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1703);
			symbol_identifier();
			setState(1708);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1704);
				match(COMMA);
				setState(1705);
				symbol_identifier();
				}
				}
				setState(1710);
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
		enterRule(_localctx, 180, RULE_attribute_constraint);
		try {
			setState(1721);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				_localctx = new MatchingListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1711);
				match(IN);
				setState(1712);
				((MatchingListContext)_localctx).source = list_literal();
				}
				break;
			case 2:
				_localctx = new MatchingSetContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1713);
				match(IN);
				setState(1714);
				((MatchingSetContext)_localctx).source = set_literal();
				}
				break;
			case 3:
				_localctx = new MatchingRangeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1715);
				match(IN);
				setState(1716);
				((MatchingRangeContext)_localctx).source = range_literal();
				}
				break;
			case 4:
				_localctx = new MatchingPatternContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1717);
				match(MATCHING);
				setState(1718);
				((MatchingPatternContext)_localctx).text = match(TEXT_LITERAL);
				}
				break;
			case 5:
				_localctx = new MatchingExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1719);
				match(MATCHING);
				setState(1720);
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
		enterRule(_localctx, 182, RULE_list_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1724);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUTABLE) {
				{
				setState(1723);
				match(MUTABLE);
				}
			}

			setState(1726);
			match(LBRAK);
			setState(1728);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << XMARK) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << LTCOLONGT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (TYPE - 64)) | (1L << (ANY - 64)) | (1L << (CATEGORY - 64)) | (1L << (EXECUTE - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (MUTABLE - 64)) | (1L << (NULL - 64)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (READ - 136)) | (1L << (RESOURCE - 136)) | (1L << (SELF - 136)) | (1L << (SORTED - 136)) | (1L << (SUPER - 136)) | (1L << (THIS - 136)) | (1L << (BOOLEAN_LITERAL - 136)) | (1L << (CHAR_LITERAL - 136)) | (1L << (MIN_INTEGER - 136)) | (1L << (MAX_INTEGER - 136)) | (1L << (SYMBOL_IDENTIFIER - 136)) | (1L << (TYPE_IDENTIFIER - 136)) | (1L << (VARIABLE_IDENTIFIER - 136)) | (1L << (TEXT_LITERAL - 136)) | (1L << (UUID_LITERAL - 136)) | (1L << (VERSION_LITERAL - 136)) | (1L << (INTEGER_LITERAL - 136)) | (1L << (HEXA_LITERAL - 136)) | (1L << (DECIMAL_LITERAL - 136)) | (1L << (DATETIME_LITERAL - 136)) | (1L << (TIME_LITERAL - 136)) | (1L << (DATE_LITERAL - 136)) | (1L << (PERIOD_LITERAL - 136)))) != 0)) {
				{
				setState(1727);
				expression_list();
				}
			}

			setState(1730);
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
		enterRule(_localctx, 184, RULE_set_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1733);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUTABLE) {
				{
				setState(1732);
				match(MUTABLE);
				}
			}

			setState(1735);
			match(LT);
			setState(1737);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << XMARK) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << LTCOLONGT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (TYPE - 64)) | (1L << (ANY - 64)) | (1L << (CATEGORY - 64)) | (1L << (EXECUTE - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (MUTABLE - 64)) | (1L << (NULL - 64)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (READ - 136)) | (1L << (RESOURCE - 136)) | (1L << (SELF - 136)) | (1L << (SORTED - 136)) | (1L << (SUPER - 136)) | (1L << (THIS - 136)) | (1L << (BOOLEAN_LITERAL - 136)) | (1L << (CHAR_LITERAL - 136)) | (1L << (MIN_INTEGER - 136)) | (1L << (MAX_INTEGER - 136)) | (1L << (SYMBOL_IDENTIFIER - 136)) | (1L << (TYPE_IDENTIFIER - 136)) | (1L << (VARIABLE_IDENTIFIER - 136)) | (1L << (TEXT_LITERAL - 136)) | (1L << (UUID_LITERAL - 136)) | (1L << (VERSION_LITERAL - 136)) | (1L << (INTEGER_LITERAL - 136)) | (1L << (HEXA_LITERAL - 136)) | (1L << (DECIMAL_LITERAL - 136)) | (1L << (DATETIME_LITERAL - 136)) | (1L << (TIME_LITERAL - 136)) | (1L << (DATE_LITERAL - 136)) | (1L << (PERIOD_LITERAL - 136)))) != 0)) {
				{
				setState(1736);
				expression_list();
				}
			}

			setState(1739);
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
		enterRule(_localctx, 186, RULE_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1741);
			expression(0);
			setState(1746);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1742);
				match(COMMA);
				setState(1743);
				expression(0);
				}
				}
				setState(1748);
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
		enterRule(_localctx, 188, RULE_range_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1749);
			match(LBRAK);
			setState(1750);
			((Range_literalContext)_localctx).low = expression(0);
			setState(1751);
			match(RANGE);
			setState(1752);
			((Range_literalContext)_localctx).high = expression(0);
			setState(1753);
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
		int _startState = 190;
		enterRecursionRule(_localctx, 190, RULE_typedef, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1772);
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

				setState(1756);
				((PrimaryTypeContext)_localctx).p = primary_type();
				}
				break;
			case CURSOR:
				{
				_localctx = new CursorTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1757);
				match(CURSOR);
				setState(1758);
				match(LT);
				setState(1759);
				((CursorTypeContext)_localctx).c = typedef(0);
				setState(1760);
				match(GT);
				}
				break;
			case ITERATOR:
				{
				_localctx = new IteratorTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1762);
				match(ITERATOR);
				setState(1763);
				match(LT);
				setState(1764);
				((IteratorTypeContext)_localctx).i = typedef(0);
				setState(1765);
				match(GT);
				}
				break;
			case TYPE:
				{
				_localctx = new TypeTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1767);
				match(TYPE);
				setState(1768);
				match(LT);
				setState(1769);
				((TypeTypeContext)_localctx).t = typedef(0);
				setState(1770);
				match(GT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1783);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1781);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
					case 1:
						{
						_localctx = new SetTypeContext(new TypedefContext(_parentctx, _parentState));
						((SetTypeContext)_localctx).s = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_typedef);
						setState(1774);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1775);
						match(LTGT);
						}
						break;
					case 2:
						{
						_localctx = new ListTypeContext(new TypedefContext(_parentctx, _parentState));
						((ListTypeContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_typedef);
						setState(1776);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1777);
						match(LBRAK);
						setState(1778);
						match(RBRAK);
						}
						break;
					case 3:
						{
						_localctx = new DictTypeContext(new TypedefContext(_parentctx, _parentState));
						((DictTypeContext)_localctx).d = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_typedef);
						setState(1779);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1780);
						match(LTCOLONGT);
						}
						break;
					}
					} 
				}
				setState(1785);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
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
		enterRule(_localctx, 192, RULE_primary_type);
		try {
			setState(1788);
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
				setState(1786);
				((NativeTypeContext)_localctx).n = native_type();
				}
				break;
			case TYPE_IDENTIFIER:
				_localctx = new CategoryTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1787);
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
		enterRule(_localctx, 194, RULE_native_type);
		try {
			setState(1808);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
				_localctx = new BooleanTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1790);
				match(BOOLEAN);
				}
				break;
			case CSS:
				_localctx = new CssTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1791);
				match(CSS);
				}
				break;
			case CHARACTER:
				_localctx = new CharacterTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1792);
				match(CHARACTER);
				}
				break;
			case TEXT:
				_localctx = new TextTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1793);
				match(TEXT);
				}
				break;
			case IMAGE:
				_localctx = new ImageTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1794);
				match(IMAGE);
				}
				break;
			case INTEGER:
				_localctx = new IntegerTypeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1795);
				match(INTEGER);
				}
				break;
			case DECIMAL:
				_localctx = new DecimalTypeContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1796);
				match(DECIMAL);
				}
				break;
			case DOCUMENT:
				_localctx = new DocumentTypeContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1797);
				match(DOCUMENT);
				}
				break;
			case DATE:
				_localctx = new DateTypeContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1798);
				match(DATE);
				}
				break;
			case DATETIME:
				_localctx = new DateTimeTypeContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1799);
				match(DATETIME);
				}
				break;
			case TIME:
				_localctx = new TimeTypeContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(1800);
				match(TIME);
				}
				break;
			case PERIOD:
				_localctx = new PeriodTypeContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(1801);
				match(PERIOD);
				}
				break;
			case VERSION:
				_localctx = new VersionTypeContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(1802);
				match(VERSION);
				}
				break;
			case CODE:
				_localctx = new CodeTypeContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(1803);
				match(CODE);
				}
				break;
			case BLOB:
				_localctx = new BlobTypeContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(1804);
				match(BLOB);
				}
				break;
			case UUID:
				_localctx = new UUIDTypeContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(1805);
				match(UUID);
				}
				break;
			case DBID:
				_localctx = new DbIdTypeContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(1806);
				match(DBID);
				}
				break;
			case HTML:
				_localctx = new HtmlTypeContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(1807);
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
		enterRule(_localctx, 196, RULE_category_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1810);
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
		enterRule(_localctx, 198, RULE_mutable_category_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1813);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUTABLE) {
				{
				setState(1812);
				match(MUTABLE);
				}
			}

			setState(1815);
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
		enterRule(_localctx, 200, RULE_code_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1817);
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
		enterRule(_localctx, 202, RULE_category_declaration);
		try {
			setState(1822);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				_localctx = new ConcreteCategoryDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1819);
				((ConcreteCategoryDeclarationContext)_localctx).decl = concrete_category_declaration();
				}
				break;
			case 2:
				_localctx = new NativeCategoryDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1820);
				((NativeCategoryDeclarationContext)_localctx).decl = native_category_declaration();
				}
				break;
			case 3:
				_localctx = new SingletonCategoryDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1821);
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
		enterRule(_localctx, 204, RULE_widget_declaration);
		try {
			setState(1826);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WIDGET:
				_localctx = new ConcreteWidgetDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1824);
				((ConcreteWidgetDeclarationContext)_localctx).decl = concrete_widget_declaration();
				}
				break;
			case NATIVE:
				_localctx = new NativeWidgetDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1825);
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
		enterRule(_localctx, 206, RULE_type_identifier_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1828);
			type_identifier();
			setState(1833);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1829);
				match(COMMA);
				setState(1830);
				type_identifier();
				}
				}
				setState(1835);
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
		enterRule(_localctx, 208, RULE_method_identifier);
		try {
			setState(1838);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CATEGORY:
			case RESOURCE:
			case VARIABLE_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1836);
				variable_identifier();
				}
				break;
			case TYPE_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1837);
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
		enterRule(_localctx, 210, RULE_identifier_or_keyword);
		try {
			setState(1842);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1840);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1841);
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
		enterRule(_localctx, 212, RULE_nospace_hyphen_identifier_or_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1844);
			if (!(this.wasNotWhiteSpace())) throw new FailedPredicateException(this, "$parser.wasNotWhiteSpace()");
			setState(1845);
			match(MINUS);
			setState(1846);
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
		enterRule(_localctx, 214, RULE_nospace_identifier_or_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1848);
			if (!(this.wasNotWhiteSpace())) throw new FailedPredicateException(this, "$parser.wasNotWhiteSpace()");
			setState(1849);
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
		enterRule(_localctx, 216, RULE_identifier);
		try {
			setState(1854);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CATEGORY:
			case RESOURCE:
			case VARIABLE_IDENTIFIER:
				_localctx = new VariableIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1851);
				variable_identifier();
				}
				break;
			case TYPE_IDENTIFIER:
				_localctx = new TypeIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1852);
				type_identifier();
				}
				break;
			case SYMBOL_IDENTIFIER:
				_localctx = new SymbolIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1853);
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
		enterRule(_localctx, 218, RULE_member_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1856);
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
		enterRule(_localctx, 220, RULE_variable_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1858);
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
		enterRule(_localctx, 222, RULE_attribute_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1860);
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
		enterRule(_localctx, 224, RULE_type_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1862);
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
		enterRule(_localctx, 226, RULE_symbol_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1864);
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
		enterRule(_localctx, 228, RULE_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1866);
			argument();
			setState(1871);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1867);
				match(COMMA);
				setState(1868);
				argument();
				}
				}
				setState(1873);
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
		enterRule(_localctx, 230, RULE_argument);
		int _la;
		try {
			setState(1879);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				_localctx = new CodeArgumentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1874);
				((CodeArgumentContext)_localctx).arg = code_argument();
				}
				break;
			case 2:
				_localctx = new OperatorArgumentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1876);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MUTABLE) {
					{
					setState(1875);
					match(MUTABLE);
					}
				}

				setState(1878);
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
		enterRule(_localctx, 232, RULE_operator_argument);
		try {
			setState(1883);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CATEGORY:
			case RESOURCE:
			case VARIABLE_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1881);
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
				setState(1882);
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
		enterRule(_localctx, 234, RULE_named_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1885);
			variable_identifier();
			setState(1888);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(1886);
				match(EQ);
				setState(1887);
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
		enterRule(_localctx, 236, RULE_code_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1890);
			code_type();
			setState(1891);
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
		enterRule(_localctx, 238, RULE_category_or_any_type);
		try {
			setState(1895);
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
				setState(1893);
				typedef(0);
				}
				break;
			case ANY:
				enterOuterAlt(_localctx, 2);
				{
				setState(1894);
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
		int _startState = 240;
		enterRecursionRule(_localctx, 240, RULE_any_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AnyTypeContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1898);
			match(ANY);
			}
			_ctx.stop = _input.LT(-1);
			setState(1908);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1906);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
					case 1:
						{
						_localctx = new AnyListTypeContext(new Any_typeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_any_type);
						setState(1900);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1901);
						match(LBRAK);
						setState(1902);
						match(RBRAK);
						}
						break;
					case 2:
						{
						_localctx = new AnyDictTypeContext(new Any_typeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_any_type);
						setState(1903);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1904);
						match(LCURL);
						setState(1905);
						match(RCURL);
						}
						break;
					}
					} 
				}
				setState(1910);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
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
		enterRule(_localctx, 242, RULE_member_method_declaration_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1911);
			member_method_declaration();
			setState(1917);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (TYPE - 64)) | (1L << (ABSTRACT - 64)) | (1L << (GETTER - 64)) | (1L << (METHOD - 64)) | (1L << (MUTABLE - 64)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (OPERATOR - 130)) | (1L << (SETTER - 130)) | (1L << (TYPE_IDENTIFIER - 130)) | (1L << (ARONDBASE_IDENTIFIER - 130)))) != 0)) {
				{
				{
				setState(1912);
				lfp();
				setState(1913);
				member_method_declaration();
				}
				}
				setState(1919);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterMember_method_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitMember_method_declaration(this);
		}
	}

	public final Member_method_declarationContext member_method_declaration() throws RecognitionException {
		Member_method_declarationContext _localctx = new Member_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_member_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1925);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(1920);
				comment_statement();
				setState(1921);
				lfp();
				}
				}
				setState(1927);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1933);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ARONDBASE_IDENTIFIER) {
				{
				{
				setState(1928);
				annotation_constructor();
				setState(1929);
				lfp();
				}
				}
				setState(1935);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1941);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				{
				setState(1936);
				setter_method_declaration();
				}
				break;
			case 2:
				{
				setState(1937);
				getter_method_declaration();
				}
				break;
			case 3:
				{
				setState(1938);
				concrete_method_declaration();
				}
				break;
			case 4:
				{
				setState(1939);
				abstract_member_method_declaration();
				}
				break;
			case 5:
				{
				setState(1940);
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
		enterRule(_localctx, 246, RULE_native_member_method_declaration_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1943);
			native_member_method_declaration();
			setState(1949);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (TYPE - 64)) | (1L << (ANY - 64)) | (1L << (GETTER - 64)) | (1L << (METHOD - 64)) | (1L << (NATIVE - 64)))) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & ((1L << (SETTER - 143)) | (1L << (TYPE_IDENTIFIER - 143)) | (1L << (ARONDBASE_IDENTIFIER - 143)))) != 0)) {
				{
				{
				setState(1944);
				lfp();
				setState(1945);
				native_member_method_declaration();
				}
				}
				setState(1951);
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
		enterRule(_localctx, 248, RULE_native_member_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1957);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(1952);
				comment_statement();
				setState(1953);
				lfp();
				}
				}
				setState(1959);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1965);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ARONDBASE_IDENTIFIER) {
				{
				{
				setState(1960);
				annotation_constructor();
				setState(1961);
				lfp();
				}
				}
				setState(1967);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1971);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				{
				setState(1968);
				native_getter_declaration();
				}
				break;
			case 2:
				{
				setState(1969);
				native_setter_declaration();
				}
				break;
			case 3:
				{
				setState(1970);
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
		enterRule(_localctx, 250, RULE_native_category_binding);
		try {
			setState(1983);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JAVA:
				_localctx = new JavaCategoryBindingContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1973);
				match(JAVA);
				setState(1974);
				((JavaCategoryBindingContext)_localctx).binding = java_class_identifier_expression(0);
				}
				break;
			case CSHARP:
				_localctx = new CSharpCategoryBindingContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1975);
				match(CSHARP);
				setState(1976);
				((CSharpCategoryBindingContext)_localctx).binding = csharp_identifier_expression(0);
				}
				break;
			case PYTHON2:
				_localctx = new Python2CategoryBindingContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1977);
				match(PYTHON2);
				setState(1978);
				((Python2CategoryBindingContext)_localctx).binding = python_category_binding();
				}
				break;
			case PYTHON3:
				_localctx = new Python3CategoryBindingContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1979);
				match(PYTHON3);
				setState(1980);
				((Python3CategoryBindingContext)_localctx).binding = python_category_binding();
				}
				break;
			case JAVASCRIPT:
				_localctx = new JavascriptCategoryBindingContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1981);
				match(JAVASCRIPT);
				setState(1982);
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
		enterRule(_localctx, 252, RULE_python_category_binding);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1985);
			identifier();
			setState(1987);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(1986);
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
		enterRule(_localctx, 254, RULE_python_module);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1989);
			match(FROM);
			setState(1990);
			module_token();
			setState(1991);
			match(COLON);
			setState(1992);
			python_identifier();
			setState(1997);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(1993);
				match(DOT);
				setState(1994);
				python_identifier();
				}
				}
				setState(1999);
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
		enterRule(_localctx, 256, RULE_javascript_category_binding);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2000);
			javascript_identifier();
			setState(2005);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(2001);
				match(DOT);
				setState(2002);
				javascript_identifier();
				}
				}
				setState(2007);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2009);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(2008);
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
		enterRule(_localctx, 258, RULE_javascript_module);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2011);
			match(FROM);
			setState(2012);
			module_token();
			setState(2013);
			match(COLON);
			setState(2015);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SLASH) {
				{
				setState(2014);
				match(SLASH);
				}
			}

			setState(2017);
			javascript_identifier();
			setState(2022);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SLASH) {
				{
				{
				setState(2018);
				match(SLASH);
				setState(2019);
				javascript_identifier();
				}
				}
				setState(2024);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2027);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(2025);
				match(DOT);
				setState(2026);
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
		enterRule(_localctx, 260, RULE_variable_identifier_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2029);
			variable_identifier();
			setState(2034);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2030);
				match(COMMA);
				setState(2031);
				variable_identifier();
				}
				}
				setState(2036);
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
		enterRule(_localctx, 262, RULE_attribute_identifier_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2037);
			attribute_identifier();
			setState(2042);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2038);
				match(COMMA);
				setState(2039);
				attribute_identifier();
				}
				}
				setState(2044);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterMethod_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitMethod_declaration(this);
		}
	}

	public final Method_declarationContext method_declaration() throws RecognitionException {
		Method_declarationContext _localctx = new Method_declarationContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_method_declaration);
		try {
			setState(2049);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2045);
				abstract_global_method_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2046);
				concrete_method_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2047);
				native_method_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2048);
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
		enterRule(_localctx, 266, RULE_comment_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2051);
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
		enterRule(_localctx, 268, RULE_native_statement_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2053);
			native_statement();
			setState(2059);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA) | (1L << CSHARP) | (1L << PYTHON2) | (1L << PYTHON3) | (1L << JAVASCRIPT))) != 0)) {
				{
				{
				setState(2054);
				lfp();
				setState(2055);
				native_statement();
				}
				}
				setState(2061);
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
		enterRule(_localctx, 270, RULE_native_statement);
		try {
			setState(2072);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JAVA:
				_localctx = new JavaNativeStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2062);
				match(JAVA);
				setState(2063);
				java_statement();
				}
				break;
			case CSHARP:
				_localctx = new CSharpNativeStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2064);
				match(CSHARP);
				setState(2065);
				csharp_statement();
				}
				break;
			case PYTHON2:
				_localctx = new Python2NativeStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2066);
				match(PYTHON2);
				setState(2067);
				python_native_statement();
				}
				break;
			case PYTHON3:
				_localctx = new Python3NativeStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2068);
				match(PYTHON3);
				setState(2069);
				python_native_statement();
				}
				break;
			case JAVASCRIPT:
				_localctx = new JavascriptNativeStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2070);
				match(JAVASCRIPT);
				setState(2071);
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
		enterRule(_localctx, 272, RULE_python_native_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2074);
			python_statement();
			setState(2076);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(2075);
				match(SEMI);
				}
			}

			setState(2079);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(2078);
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
		enterRule(_localctx, 274, RULE_javascript_native_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2081);
			javascript_statement();
			setState(2083);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(2082);
				match(SEMI);
				}
			}

			setState(2086);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(2085);
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
		enterRule(_localctx, 276, RULE_statement_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2088);
			statement();
			setState(2094);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << LTCOLONGT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (TYPE - 64)) | (1L << (ANY - 64)) | (1L << (BREAK - 64)) | (1L << (CATEGORY - 64)) | (1L << (DELETE - 64)) | (1L << (DO - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (IF - 64)) | (1L << (METHOD - 64)) | (1L << (MUTABLE - 64)) | (1L << (NULL - 64)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (READ - 136)) | (1L << (RESOURCE - 136)) | (1L << (RETURN - 136)) | (1L << (SELF - 136)) | (1L << (SORTED - 136)) | (1L << (STORE - 136)) | (1L << (SUPER - 136)) | (1L << (SWITCH - 136)) | (1L << (THIS - 136)) | (1L << (THROW - 136)) | (1L << (TRY - 136)) | (1L << (WITH - 136)) | (1L << (WHILE - 136)) | (1L << (WRITE - 136)) | (1L << (BOOLEAN_LITERAL - 136)) | (1L << (CHAR_LITERAL - 136)) | (1L << (MIN_INTEGER - 136)) | (1L << (MAX_INTEGER - 136)) | (1L << (SYMBOL_IDENTIFIER - 136)) | (1L << (TYPE_IDENTIFIER - 136)) | (1L << (VARIABLE_IDENTIFIER - 136)) | (1L << (TEXT_LITERAL - 136)) | (1L << (UUID_LITERAL - 136)) | (1L << (VERSION_LITERAL - 136)) | (1L << (INTEGER_LITERAL - 136)) | (1L << (HEXA_LITERAL - 136)) | (1L << (DECIMAL_LITERAL - 136)) | (1L << (DATETIME_LITERAL - 136)) | (1L << (TIME_LITERAL - 136)) | (1L << (DATE_LITERAL - 136)) | (1L << (PERIOD_LITERAL - 136)))) != 0)) {
				{
				{
				setState(2089);
				lfp();
				setState(2090);
				statement();
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
		enterRule(_localctx, 278, RULE_assertion_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2097);
			assertion();
			setState(2103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << XMARK) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << LTCOLONGT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (TYPE - 64)) | (1L << (ANY - 64)) | (1L << (CATEGORY - 64)) | (1L << (EXECUTE - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (MUTABLE - 64)) | (1L << (NULL - 64)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (READ - 136)) | (1L << (RESOURCE - 136)) | (1L << (SELF - 136)) | (1L << (SORTED - 136)) | (1L << (SUPER - 136)) | (1L << (THIS - 136)) | (1L << (BOOLEAN_LITERAL - 136)) | (1L << (CHAR_LITERAL - 136)) | (1L << (MIN_INTEGER - 136)) | (1L << (MAX_INTEGER - 136)) | (1L << (SYMBOL_IDENTIFIER - 136)) | (1L << (TYPE_IDENTIFIER - 136)) | (1L << (VARIABLE_IDENTIFIER - 136)) | (1L << (TEXT_LITERAL - 136)) | (1L << (UUID_LITERAL - 136)) | (1L << (VERSION_LITERAL - 136)) | (1L << (INTEGER_LITERAL - 136)) | (1L << (HEXA_LITERAL - 136)) | (1L << (DECIMAL_LITERAL - 136)) | (1L << (DATETIME_LITERAL - 136)) | (1L << (TIME_LITERAL - 136)) | (1L << (DATE_LITERAL - 136)) | (1L << (PERIOD_LITERAL - 136)))) != 0)) {
				{
				{
				setState(2098);
				lfp();
				setState(2099);
				assertion();
				}
				}
				setState(2105);
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
		enterRule(_localctx, 280, RULE_switch_case_statement_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2106);
			switch_case_statement();
			setState(2112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(2107);
				lfp();
				setState(2108);
				switch_case_statement();
				}
				}
				setState(2114);
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
		enterRule(_localctx, 282, RULE_catch_statement_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2115);
			catch_statement();
			setState(2121);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2116);
					lfp();
					setState(2117);
					catch_statement();
					}
					} 
				}
				setState(2123);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
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
		enterRule(_localctx, 284, RULE_literal_collection);
		try {
			setState(2138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				_localctx = new LiteralRangeLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2124);
				match(LBRAK);
				setState(2125);
				((LiteralRangeLiteralContext)_localctx).low = atomic_literal();
				setState(2126);
				match(RANGE);
				setState(2127);
				((LiteralRangeLiteralContext)_localctx).high = atomic_literal();
				setState(2128);
				match(RBRAK);
				}
				break;
			case 2:
				_localctx = new LiteralListLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2130);
				match(LBRAK);
				setState(2131);
				literal_list_literal();
				setState(2132);
				match(RBRAK);
				}
				break;
			case 3:
				_localctx = new LiteralSetLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2134);
				match(LT);
				setState(2135);
				literal_list_literal();
				setState(2136);
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
		enterRule(_localctx, 286, RULE_atomic_literal);
		int _la;
		try {
			setState(2163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				_localctx = new MinIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2140);
				match(MIN_INTEGER);
				}
				break;
			case 2:
				_localctx = new MaxIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2141);
				match(MAX_INTEGER);
				}
				break;
			case 3:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2142);
					match(MINUS);
					}
				}

				setState(2145);
				match(INTEGER_LITERAL);
				}
				break;
			case 4:
				_localctx = new HexadecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2146);
				match(HEXA_LITERAL);
				}
				break;
			case 5:
				_localctx = new CharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2147);
				match(CHAR_LITERAL);
				}
				break;
			case 6:
				_localctx = new DateLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2148);
				match(DATE_LITERAL);
				}
				break;
			case 7:
				_localctx = new TimeLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(2149);
				match(TIME_LITERAL);
				}
				break;
			case 8:
				_localctx = new TextLiteralContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(2150);
				match(TEXT_LITERAL);
				}
				break;
			case 9:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(2152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2151);
					match(MINUS);
					}
				}

				setState(2154);
				match(DECIMAL_LITERAL);
				}
				break;
			case 10:
				_localctx = new DateTimeLiteralContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(2155);
				match(DATETIME_LITERAL);
				}
				break;
			case 11:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(2156);
				match(BOOLEAN_LITERAL);
				}
				break;
			case 12:
				_localctx = new PeriodLiteralContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(2157);
				match(PERIOD_LITERAL);
				}
				break;
			case 13:
				_localctx = new VersionLiteralContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(2158);
				match(VERSION_LITERAL);
				}
				break;
			case 14:
				_localctx = new UUIDLiteralContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(2159);
				match(UUID_LITERAL);
				}
				break;
			case 15:
				_localctx = new SymbolLiteralContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(2160);
				symbol_identifier();
				}
				break;
			case 16:
				_localctx = new TypeLiteralContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(2161);
				type_literal();
				}
				break;
			case 17:
				_localctx = new NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(2162);
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
		enterRule(_localctx, 288, RULE_literal_list_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2165);
			atomic_literal();
			setState(2170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2166);
				match(COMMA);
				setState(2167);
				atomic_literal();
				}
				}
				setState(2172);
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
		enterRule(_localctx, 290, RULE_this_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2173);
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
		enterRule(_localctx, 292, RULE_super_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE_IDENTIFIER) {
				{
				setState(2175);
				category_type();
				setState(2176);
				match(DOT);
				}
			}

			setState(2180);
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
		enterRule(_localctx, 294, RULE_parenthesis_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2182);
			match(LPAR);
			setState(2183);
			expression(0);
			setState(2184);
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
		enterRule(_localctx, 296, RULE_literal_expression);
		try {
			setState(2188);
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
				setState(2186);
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
				setState(2187);
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
		enterRule(_localctx, 298, RULE_collection_literal);
		try {
			setState(2196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2190);
				range_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2191);
				list_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2192);
				set_literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2193);
				dict_literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2194);
				document_literal();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2195);
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
		enterRule(_localctx, 300, RULE_tuple_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUTABLE) {
				{
				setState(2198);
				match(MUTABLE);
				}
			}

			setState(2201);
			match(LPAR);
			setState(2203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << XMARK) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << LTCOLONGT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (TYPE - 64)) | (1L << (ANY - 64)) | (1L << (CATEGORY - 64)) | (1L << (EXECUTE - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (MUTABLE - 64)) | (1L << (NULL - 64)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (READ - 136)) | (1L << (RESOURCE - 136)) | (1L << (SELF - 136)) | (1L << (SORTED - 136)) | (1L << (SUPER - 136)) | (1L << (THIS - 136)) | (1L << (BOOLEAN_LITERAL - 136)) | (1L << (CHAR_LITERAL - 136)) | (1L << (MIN_INTEGER - 136)) | (1L << (MAX_INTEGER - 136)) | (1L << (SYMBOL_IDENTIFIER - 136)) | (1L << (TYPE_IDENTIFIER - 136)) | (1L << (VARIABLE_IDENTIFIER - 136)) | (1L << (TEXT_LITERAL - 136)) | (1L << (UUID_LITERAL - 136)) | (1L << (VERSION_LITERAL - 136)) | (1L << (INTEGER_LITERAL - 136)) | (1L << (HEXA_LITERAL - 136)) | (1L << (DECIMAL_LITERAL - 136)) | (1L << (DATETIME_LITERAL - 136)) | (1L << (TIME_LITERAL - 136)) | (1L << (DATE_LITERAL - 136)) | (1L << (PERIOD_LITERAL - 136)))) != 0)) {
				{
				setState(2202);
				expression_tuple();
				}
			}

			setState(2205);
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
		enterRule(_localctx, 302, RULE_dict_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUTABLE) {
				{
				setState(2207);
				match(MUTABLE);
				}
			}

			setState(2218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				{
				{
				setState(2210);
				match(LT);
				setState(2211);
				dict_entry_list();
				setState(2212);
				match(GT);
				}
				}
				break;
			case 2:
				{
				setState(2214);
				match(LTCOLONGT);
				}
				break;
			case 3:
				{
				{
				setState(2215);
				match(LT);
				setState(2216);
				match(COLON);
				setState(2217);
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
		enterRule(_localctx, 304, RULE_document_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2220);
			match(LCURL);
			setState(2222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA) | (1L << CSHARP) | (1L << PYTHON2) | (1L << PYTHON3) | (1L << JAVASCRIPT) | (1L << SWIFT) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (ABSTRACT - 64)) | (1L << (ALL - 64)) | (1L << (ALWAYS - 64)) | (1L << (AND - 64)) | (1L << (ANY - 64)) | (1L << (AS - 64)) | (1L << (ASC - 64)) | (1L << (ATTR - 64)) | (1L << (ATTRIBUTE - 64)) | (1L << (ATTRIBUTES - 64)) | (1L << (BINDINGS - 64)) | (1L << (BREAK - 64)) | (1L << (BY - 64)) | (1L << (CASE - 64)) | (1L << (CATCH - 64)) | (1L << (CATEGORY - 64)) | (1L << (CLASS - 64)) | (1L << (CONTAINS - 64)) | (1L << (DEF - 64)) | (1L << (DEFAULT - 64)) | (1L << (DEFINE - 64)) | (1L << (DELETE - 64)) | (1L << (DESC - 64)) | (1L << (DO - 64)) | (1L << (DOING - 64)) | (1L << (EACH - 64)) | (1L << (ELSE - 64)) | (1L << (ENUM - 64)) | (1L << (ENUMERATED - 64)) | (1L << (EXCEPT - 64)) | (1L << (EXECUTE - 64)) | (1L << (EXPECTING - 64)) | (1L << (EXTENDS - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (FINALLY - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (FROM - 64)) | (1L << (GETTER - 64)) | (1L << (HAS - 64)) | (1L << (IF - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (IS - 64)) | (1L << (MATCHING - 64)) | (1L << (METHOD - 64)) | (1L << (METHODS - 64)) | (1L << (MODULO - 64)) | (1L << (MUTABLE - 64)) | (1L << (NATIVE - 64)) | (1L << (NONE - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (ON - 128)) | (1L << (ONE - 128)) | (1L << (OPERATOR - 128)) | (1L << (OR - 128)) | (1L << (ORDER - 128)) | (1L << (OTHERWISE - 128)) | (1L << (PASS - 128)) | (1L << (RAISE - 128)) | (1L << (READ - 128)) | (1L << (RECEIVING - 128)) | (1L << (RESOURCE - 128)) | (1L << (RETURN - 128)) | (1L << (RETURNING - 128)) | (1L << (ROWS - 128)) | (1L << (SELF - 128)) | (1L << (SETTER - 128)) | (1L << (SINGLETON - 128)) | (1L << (SORTED - 128)) | (1L << (STORABLE - 128)) | (1L << (STORE - 128)) | (1L << (SUPER - 128)) | (1L << (SWITCH - 128)) | (1L << (TEST - 128)) | (1L << (THIS - 128)) | (1L << (THROW - 128)) | (1L << (TO - 128)) | (1L << (TRY - 128)) | (1L << (VERIFYING - 128)) | (1L << (WIDGET - 128)) | (1L << (WITH - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WHILE - 128)) | (1L << (WRITE - 128)) | (1L << (SYMBOL_IDENTIFIER - 128)) | (1L << (TYPE_IDENTIFIER - 128)) | (1L << (VARIABLE_IDENTIFIER - 128)) | (1L << (TEXT_LITERAL - 128)))) != 0)) {
				{
				setState(2221);
				doc_entry_list();
				}
			}

			setState(2224);
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
		enterRule(_localctx, 306, RULE_expression_tuple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2226);
			expression(0);
			setState(2227);
			match(COMMA);
			setState(2236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << XMARK) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << LTCOLONGT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (TYPE - 64)) | (1L << (ANY - 64)) | (1L << (CATEGORY - 64)) | (1L << (EXECUTE - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (MUTABLE - 64)) | (1L << (NULL - 64)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (READ - 136)) | (1L << (RESOURCE - 136)) | (1L << (SELF - 136)) | (1L << (SORTED - 136)) | (1L << (SUPER - 136)) | (1L << (THIS - 136)) | (1L << (BOOLEAN_LITERAL - 136)) | (1L << (CHAR_LITERAL - 136)) | (1L << (MIN_INTEGER - 136)) | (1L << (MAX_INTEGER - 136)) | (1L << (SYMBOL_IDENTIFIER - 136)) | (1L << (TYPE_IDENTIFIER - 136)) | (1L << (VARIABLE_IDENTIFIER - 136)) | (1L << (TEXT_LITERAL - 136)) | (1L << (UUID_LITERAL - 136)) | (1L << (VERSION_LITERAL - 136)) | (1L << (INTEGER_LITERAL - 136)) | (1L << (HEXA_LITERAL - 136)) | (1L << (DECIMAL_LITERAL - 136)) | (1L << (DATETIME_LITERAL - 136)) | (1L << (TIME_LITERAL - 136)) | (1L << (DATE_LITERAL - 136)) | (1L << (PERIOD_LITERAL - 136)))) != 0)) {
				{
				setState(2228);
				expression(0);
				setState(2233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2229);
					match(COMMA);
					setState(2230);
					expression(0);
					}
					}
					setState(2235);
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
		enterRule(_localctx, 308, RULE_doc_entry_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2238);
			doc_entry();
			setState(2243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2239);
				match(COMMA);
				setState(2240);
				doc_entry();
				}
				}
				setState(2245);
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
		enterRule(_localctx, 310, RULE_doc_entry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2246);
			((Doc_entryContext)_localctx).key = doc_key();
			setState(2247);
			match(COLON);
			setState(2248);
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
		enterRule(_localctx, 312, RULE_doc_key);
		try {
			setState(2252);
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
				setState(2250);
				((DocKeyIdentifierContext)_localctx).name = identifier_or_keyword();
				}
				break;
			case TEXT_LITERAL:
				_localctx = new DocKeyTextContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2251);
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
		enterRule(_localctx, 314, RULE_dict_entry_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2254);
			dict_entry();
			setState(2259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2255);
				match(COMMA);
				setState(2256);
				dict_entry();
				}
				}
				setState(2261);
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
		enterRule(_localctx, 316, RULE_dict_entry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2262);
			((Dict_entryContext)_localctx).key = dict_key();
			setState(2263);
			match(COLON);
			setState(2264);
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
		enterRule(_localctx, 318, RULE_dict_key);
		try {
			setState(2268);
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
				setState(2266);
				((DictKeyIdentifierContext)_localctx).name = identifier_or_keyword();
				}
				break;
			case TEXT_LITERAL:
				_localctx = new DictKeyTextContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2267);
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
		enterRule(_localctx, 320, RULE_slice_arguments);
		try {
			setState(2279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				_localctx = new SliceFirstAndLastContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2270);
				((SliceFirstAndLastContext)_localctx).first = expression(0);
				setState(2271);
				match(COLON);
				setState(2272);
				((SliceFirstAndLastContext)_localctx).last = expression(0);
				}
				break;
			case 2:
				_localctx = new SliceFirstOnlyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2274);
				((SliceFirstOnlyContext)_localctx).first = expression(0);
				setState(2275);
				match(COLON);
				}
				break;
			case 3:
				_localctx = new SliceLastOnlyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2277);
				match(COLON);
				setState(2278);
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
		enterRule(_localctx, 322, RULE_assign_variable_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2281);
			variable_identifier();
			setState(2282);
			assign();
			setState(2283);
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
		int _startState = 324;
		enterRecursionRule(_localctx, 324, RULE_assignable_instance, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new RootInstanceContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2286);
			variable_identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(2292);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,211,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ChildInstanceContext(new Assignable_instanceContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_assignable_instance);
					setState(2288);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2289);
					child_instance();
					}
					} 
				}
				setState(2294);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,211,_ctx);
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
		enterRule(_localctx, 326, RULE_is_expression);
		try {
			setState(2299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				_localctx = new IsATypeExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2295);
				if (!(this.willBeAOrAn())) throw new FailedPredicateException(this, "$parser.willBeAOrAn()");
				setState(2296);
				match(VARIABLE_IDENTIFIER);
				setState(2297);
				category_or_any_type();
				}
				break;
			case 2:
				_localctx = new IsOtherExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2298);
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
		enterRule(_localctx, 328, RULE_metadata);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2301);
			if (!(this.willBeText("metadata"))) throw new FailedPredicateException(this, "$parser.willBeText(\"metadata\")");
			setState(2302);
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
		enterRule(_localctx, 330, RULE_arrow_expression);
		try {
			setState(2312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
			case 1:
				_localctx = new ArrowExpressionBodyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2304);
				arrow_prefix();
				setState(2305);
				expression(0);
				}
				break;
			case 2:
				_localctx = new ArrowStatementsBodyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2307);
				arrow_prefix();
				setState(2308);
				match(LCURL);
				setState(2309);
				statement_list();
				setState(2310);
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
		enterRule(_localctx, 332, RULE_arrow_prefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2314);
			arrow_args();
			setState(2315);
			((Arrow_prefixContext)_localctx).s1 = ws_plus();
			setState(2316);
			match(EGT);
			setState(2317);
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
		enterRule(_localctx, 334, RULE_arrow_args);
		int _la;
		try {
			setState(2325);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CATEGORY:
			case RESOURCE:
			case VARIABLE_IDENTIFIER:
				_localctx = new ArrowSingleArgContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2319);
				variable_identifier();
				}
				break;
			case LPAR:
				_localctx = new ArrowListArgContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2320);
				match(LPAR);
				setState(2322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CATEGORY || _la==RESOURCE || _la==VARIABLE_IDENTIFIER) {
					{
					setState(2321);
					variable_identifier_list();
					}
				}

				setState(2324);
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
		enterRule(_localctx, 336, RULE_sorted_key);
		try {
			setState(2329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2327);
				instance_expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2328);
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
		enterRule(_localctx, 338, RULE_read_blob_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2331);
			match(READ);
			setState(2332);
			match(BLOB);
			setState(2333);
			match(FROM);
			setState(2334);
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
		enterRule(_localctx, 340, RULE_read_all_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2336);
			match(READ);
			setState(2337);
			match(ALL);
			setState(2338);
			match(FROM);
			setState(2339);
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
		enterRule(_localctx, 342, RULE_read_one_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2341);
			match(READ);
			setState(2342);
			match(ONE);
			setState(2343);
			match(FROM);
			setState(2344);
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
		enterRule(_localctx, 344, RULE_order_by_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2346);
			order_by();
			setState(2351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2347);
				match(COMMA);
				setState(2348);
				order_by();
				}
				}
				setState(2353);
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
		enterRule(_localctx, 346, RULE_order_by);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2354);
			variable_identifier();
			setState(2359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(2355);
				match(DOT);
				setState(2356);
				variable_identifier();
				}
				}
				setState(2361);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(2362);
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
		enterRule(_localctx, 348, RULE_include_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2365);
			variable_identifier();
			setState(2370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2366);
				match(COMMA);
				setState(2367);
				variable_identifier();
				}
				}
				setState(2372);
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
		enterRule(_localctx, 350, RULE_operator);
		try {
			setState(2379);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				_localctx = new OperatorPlusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2373);
				match(PLUS);
				}
				break;
			case MINUS:
				_localctx = new OperatorMinusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2374);
				match(MINUS);
				}
				break;
			case STAR:
				_localctx = new OperatorMultiplyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2375);
				multiply();
				}
				break;
			case SLASH:
				_localctx = new OperatorDivideContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2376);
				divide();
				}
				break;
			case BSLASH:
				_localctx = new OperatorIDivideContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2377);
				idivide();
				}
				break;
			case PERCENT:
			case MODULO:
				_localctx = new OperatorModuloContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2378);
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
		enterRule(_localctx, 352, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2381);
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
		enterRule(_localctx, 354, RULE_new_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2383);
			((New_tokenContext)_localctx).i1 = match(VARIABLE_IDENTIFIER);
			setState(2384);
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
		enterRule(_localctx, 356, RULE_key_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2386);
			((Key_tokenContext)_localctx).i1 = match(VARIABLE_IDENTIFIER);
			setState(2387);
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
		enterRule(_localctx, 358, RULE_module_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2389);
			((Module_tokenContext)_localctx).i1 = match(VARIABLE_IDENTIFIER);
			setState(2390);
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
		enterRule(_localctx, 360, RULE_value_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2392);
			((Value_tokenContext)_localctx).i1 = match(VARIABLE_IDENTIFIER);
			setState(2393);
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
		enterRule(_localctx, 362, RULE_symbols_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2395);
			((Symbols_tokenContext)_localctx).i1 = match(VARIABLE_IDENTIFIER);
			setState(2396);
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
		enterRule(_localctx, 364, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2398);
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
		enterRule(_localctx, 366, RULE_multiply);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2400);
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
		enterRule(_localctx, 368, RULE_divide);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2402);
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
		enterRule(_localctx, 370, RULE_idivide);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2404);
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
		enterRule(_localctx, 372, RULE_modulo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2406);
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
		enterRule(_localctx, 374, RULE_lfs);
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
		enterRule(_localctx, 376, RULE_lfp);
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
		enterRule(_localctx, 378, RULE_javascript_statement);
		try {
			setState(2419);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
			case 1:
				_localctx = new JavascriptReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2412);
				match(RETURN);
				setState(2413);
				((JavascriptReturnStatementContext)_localctx).exp = javascript_expression(0);
				setState(2414);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new JavascriptStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2416);
				((JavascriptStatementContext)_localctx).exp = javascript_expression(0);
				setState(2417);
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
		int _startState = 380;
		enterRecursionRule(_localctx, 380, RULE_javascript_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavascriptPrimaryExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2422);
			((JavascriptPrimaryExpressionContext)_localctx).exp = javascript_primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(2428);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,223,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavascriptSelectorExpressionContext(new Javascript_expressionContext(_parentctx, _parentState));
					((JavascriptSelectorExpressionContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_javascript_expression);
					setState(2424);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2425);
					((JavascriptSelectorExpressionContext)_localctx).child = javascript_selector_expression();
					}
					} 
				}
				setState(2430);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,223,_ctx);
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
		enterRule(_localctx, 382, RULE_javascript_primary_expression);
		try {
			setState(2438);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2431);
				javascript_this_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2432);
				javascript_new_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2433);
				javascript_parenthesis_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2434);
				javascript_identifier_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2435);
				javascript_literal_expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2436);
				javascript_method_expression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2437);
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
		enterRule(_localctx, 384, RULE_javascript_this_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2440);
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
		enterRule(_localctx, 386, RULE_javascript_new_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2442);
			new_token();
			setState(2443);
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
		enterRule(_localctx, 388, RULE_javascript_selector_expression);
		try {
			setState(2450);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
			case 1:
				_localctx = new JavascriptMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2445);
				match(DOT);
				setState(2446);
				((JavascriptMethodExpressionContext)_localctx).method = javascript_method_expression();
				}
				break;
			case 2:
				_localctx = new JavascriptMemberExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2447);
				match(DOT);
				setState(2448);
				((JavascriptMemberExpressionContext)_localctx).name = javascript_identifier();
				}
				break;
			case 3:
				_localctx = new JavascriptItemExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2449);
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
		enterRule(_localctx, 390, RULE_javascript_method_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2452);
			((Javascript_method_expressionContext)_localctx).name = javascript_identifier();
			setState(2453);
			match(LPAR);
			setState(2455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA) | (1L << CSHARP) | (1L << PYTHON2) | (1L << PYTHON3) | (1L << JAVASCRIPT) | (1L << SWIFT) | (1L << LPAR) | (1L << LBRAK) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (ABSTRACT - 64)) | (1L << (ALL - 64)) | (1L << (ALWAYS - 64)) | (1L << (AND - 64)) | (1L << (ANY - 64)) | (1L << (AS - 64)) | (1L << (ASC - 64)) | (1L << (ATTR - 64)) | (1L << (ATTRIBUTE - 64)) | (1L << (ATTRIBUTES - 64)) | (1L << (BINDINGS - 64)) | (1L << (BREAK - 64)) | (1L << (BY - 64)) | (1L << (CASE - 64)) | (1L << (CATCH - 64)) | (1L << (CATEGORY - 64)) | (1L << (CLASS - 64)) | (1L << (CONTAINS - 64)) | (1L << (DEF - 64)) | (1L << (DEFAULT - 64)) | (1L << (DEFINE - 64)) | (1L << (DELETE - 64)) | (1L << (DESC - 64)) | (1L << (DO - 64)) | (1L << (DOING - 64)) | (1L << (EACH - 64)) | (1L << (ELSE - 64)) | (1L << (ENUM - 64)) | (1L << (ENUMERATED - 64)) | (1L << (EXCEPT - 64)) | (1L << (EXECUTE - 64)) | (1L << (EXPECTING - 64)) | (1L << (EXTENDS - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (FINALLY - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (FROM - 64)) | (1L << (GETTER - 64)) | (1L << (HAS - 64)) | (1L << (IF - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (IS - 64)) | (1L << (MATCHING - 64)) | (1L << (METHOD - 64)) | (1L << (METHODS - 64)) | (1L << (MODULO - 64)) | (1L << (MUTABLE - 64)) | (1L << (NATIVE - 64)) | (1L << (NONE - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (ON - 128)) | (1L << (ONE - 128)) | (1L << (OPERATOR - 128)) | (1L << (OR - 128)) | (1L << (ORDER - 128)) | (1L << (OTHERWISE - 128)) | (1L << (PASS - 128)) | (1L << (RAISE - 128)) | (1L << (READ - 128)) | (1L << (RECEIVING - 128)) | (1L << (RESOURCE - 128)) | (1L << (RETURN - 128)) | (1L << (RETURNING - 128)) | (1L << (ROWS - 128)) | (1L << (SELF - 128)) | (1L << (SETTER - 128)) | (1L << (SINGLETON - 128)) | (1L << (SORTED - 128)) | (1L << (STORABLE - 128)) | (1L << (STORE - 128)) | (1L << (SUPER - 128)) | (1L << (SWITCH - 128)) | (1L << (TEST - 128)) | (1L << (THIS - 128)) | (1L << (THROW - 128)) | (1L << (TO - 128)) | (1L << (TRY - 128)) | (1L << (VERIFYING - 128)) | (1L << (WIDGET - 128)) | (1L << (WITH - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WHILE - 128)) | (1L << (WRITE - 128)) | (1L << (BOOLEAN_LITERAL - 128)) | (1L << (CHAR_LITERAL - 128)) | (1L << (SYMBOL_IDENTIFIER - 128)) | (1L << (TYPE_IDENTIFIER - 128)) | (1L << (VARIABLE_IDENTIFIER - 128)) | (1L << (DOLLAR_IDENTIFIER - 128)) | (1L << (TEXT_LITERAL - 128)) | (1L << (INTEGER_LITERAL - 128)) | (1L << (DECIMAL_LITERAL - 128)))) != 0)) {
				{
				setState(2454);
				((Javascript_method_expressionContext)_localctx).args = javascript_arguments(0);
				}
			}

			setState(2457);
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
		int _startState = 392;
		enterRecursionRule(_localctx, 392, RULE_javascript_arguments, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavascriptArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2460);
			((JavascriptArgumentListContext)_localctx).item = javascript_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2467);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,227,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavascriptArgumentListItemContext(new Javascript_argumentsContext(_parentctx, _parentState));
					((JavascriptArgumentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_javascript_arguments);
					setState(2462);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2463);
					match(COMMA);
					setState(2464);
					((JavascriptArgumentListItemContext)_localctx).item = javascript_expression(0);
					}
					} 
				}
				setState(2469);
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
		enterRule(_localctx, 394, RULE_javascript_item_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2470);
			match(LBRAK);
			setState(2471);
			((Javascript_item_expressionContext)_localctx).exp = javascript_expression(0);
			setState(2472);
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
		enterRule(_localctx, 396, RULE_javascript_parenthesis_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2474);
			match(LPAR);
			setState(2475);
			((Javascript_parenthesis_expressionContext)_localctx).exp = javascript_expression(0);
			setState(2476);
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
		enterRule(_localctx, 398, RULE_javascript_identifier_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2478);
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
		enterRule(_localctx, 400, RULE_javascript_literal_expression);
		try {
			setState(2485);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				_localctx = new JavascriptIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2480);
				((JavascriptIntegerLiteralContext)_localctx).t = match(INTEGER_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				_localctx = new JavascriptDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2481);
				((JavascriptDecimalLiteralContext)_localctx).t = match(DECIMAL_LITERAL);
				}
				break;
			case TEXT_LITERAL:
				_localctx = new JavascriptTextLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2482);
				((JavascriptTextLiteralContext)_localctx).t = match(TEXT_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new JavascriptBooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2483);
				((JavascriptBooleanLiteralContext)_localctx).t = match(BOOLEAN_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new JavascriptCharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2484);
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
		enterRule(_localctx, 402, RULE_javascript_identifier);
		try {
			setState(2492);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2487);
				match(VARIABLE_IDENTIFIER);
				}
				break;
			case SYMBOL_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2488);
				match(SYMBOL_IDENTIFIER);
				}
				break;
			case DOLLAR_IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(2489);
				match(DOLLAR_IDENTIFIER);
				}
				break;
			case TYPE_IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(2490);
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
				setState(2491);
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
		enterRule(_localctx, 404, RULE_python_statement);
		try {
			setState(2497);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
			case 1:
				_localctx = new PythonReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2494);
				match(RETURN);
				setState(2495);
				((PythonReturnStatementContext)_localctx).exp = python_expression(0);
				}
				break;
			case 2:
				_localctx = new PythonStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2496);
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
		int _startState = 406;
		enterRecursionRule(_localctx, 406, RULE_python_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PythonPrimaryExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2500);
			((PythonPrimaryExpressionContext)_localctx).exp = python_primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(2506);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,231,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PythonSelectorExpressionContext(new Python_expressionContext(_parentctx, _parentState));
					((PythonSelectorExpressionContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_python_expression);
					setState(2502);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2503);
					((PythonSelectorExpressionContext)_localctx).child = python_selector_expression();
					}
					} 
				}
				setState(2508);
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
		enterRule(_localctx, 408, RULE_python_primary_expression);
		try {
			setState(2514);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
			case 1:
				_localctx = new PythonSelfExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2509);
				((PythonSelfExpressionContext)_localctx).exp = python_self_expression();
				}
				break;
			case 2:
				_localctx = new PythonParenthesisExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2510);
				((PythonParenthesisExpressionContext)_localctx).exp = python_parenthesis_expression();
				}
				break;
			case 3:
				_localctx = new PythonIdentifierExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2511);
				((PythonIdentifierExpressionContext)_localctx).exp = python_identifier_expression(0);
				}
				break;
			case 4:
				_localctx = new PythonLiteralExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2512);
				((PythonLiteralExpressionContext)_localctx).exp = python_literal_expression();
				}
				break;
			case 5:
				_localctx = new PythonGlobalMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2513);
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
		enterRule(_localctx, 410, RULE_python_self_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2516);
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
		enterRule(_localctx, 412, RULE_python_selector_expression);
		try {
			setState(2524);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				_localctx = new PythonMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2518);
				match(DOT);
				setState(2519);
				((PythonMethodExpressionContext)_localctx).exp = python_method_expression();
				}
				break;
			case LBRAK:
				_localctx = new PythonItemExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2520);
				match(LBRAK);
				setState(2521);
				((PythonItemExpressionContext)_localctx).exp = python_expression(0);
				setState(2522);
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
		enterRule(_localctx, 414, RULE_python_method_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2526);
			((Python_method_expressionContext)_localctx).name = python_identifier();
			setState(2527);
			match(LPAR);
			setState(2529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA) | (1L << CSHARP) | (1L << PYTHON2) | (1L << PYTHON3) | (1L << JAVASCRIPT) | (1L << SWIFT) | (1L << LPAR) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (ABSTRACT - 64)) | (1L << (ALL - 64)) | (1L << (ALWAYS - 64)) | (1L << (AND - 64)) | (1L << (ANY - 64)) | (1L << (AS - 64)) | (1L << (ASC - 64)) | (1L << (ATTR - 64)) | (1L << (ATTRIBUTE - 64)) | (1L << (ATTRIBUTES - 64)) | (1L << (BINDINGS - 64)) | (1L << (BREAK - 64)) | (1L << (BY - 64)) | (1L << (CASE - 64)) | (1L << (CATCH - 64)) | (1L << (CATEGORY - 64)) | (1L << (CLASS - 64)) | (1L << (CONTAINS - 64)) | (1L << (DEF - 64)) | (1L << (DEFAULT - 64)) | (1L << (DEFINE - 64)) | (1L << (DELETE - 64)) | (1L << (DESC - 64)) | (1L << (DO - 64)) | (1L << (DOING - 64)) | (1L << (EACH - 64)) | (1L << (ELSE - 64)) | (1L << (ENUM - 64)) | (1L << (ENUMERATED - 64)) | (1L << (EXCEPT - 64)) | (1L << (EXECUTE - 64)) | (1L << (EXPECTING - 64)) | (1L << (EXTENDS - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (FINALLY - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (FROM - 64)) | (1L << (GETTER - 64)) | (1L << (HAS - 64)) | (1L << (IF - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (IS - 64)) | (1L << (MATCHING - 64)) | (1L << (METHOD - 64)) | (1L << (METHODS - 64)) | (1L << (MODULO - 64)) | (1L << (MUTABLE - 64)) | (1L << (NATIVE - 64)) | (1L << (NONE - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (ON - 128)) | (1L << (ONE - 128)) | (1L << (OPERATOR - 128)) | (1L << (OR - 128)) | (1L << (ORDER - 128)) | (1L << (OTHERWISE - 128)) | (1L << (PASS - 128)) | (1L << (RAISE - 128)) | (1L << (READ - 128)) | (1L << (RECEIVING - 128)) | (1L << (RESOURCE - 128)) | (1L << (RETURN - 128)) | (1L << (RETURNING - 128)) | (1L << (ROWS - 128)) | (1L << (SELF - 128)) | (1L << (SETTER - 128)) | (1L << (SINGLETON - 128)) | (1L << (SORTED - 128)) | (1L << (STORABLE - 128)) | (1L << (STORE - 128)) | (1L << (SUPER - 128)) | (1L << (SWITCH - 128)) | (1L << (TEST - 128)) | (1L << (THIS - 128)) | (1L << (THROW - 128)) | (1L << (TO - 128)) | (1L << (TRY - 128)) | (1L << (VERIFYING - 128)) | (1L << (WIDGET - 128)) | (1L << (WITH - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WHILE - 128)) | (1L << (WRITE - 128)) | (1L << (BOOLEAN_LITERAL - 128)) | (1L << (CHAR_LITERAL - 128)) | (1L << (SYMBOL_IDENTIFIER - 128)) | (1L << (TYPE_IDENTIFIER - 128)) | (1L << (VARIABLE_IDENTIFIER - 128)) | (1L << (DOLLAR_IDENTIFIER - 128)) | (1L << (TEXT_LITERAL - 128)) | (1L << (INTEGER_LITERAL - 128)) | (1L << (DECIMAL_LITERAL - 128)))) != 0)) {
				{
				setState(2528);
				((Python_method_expressionContext)_localctx).args = python_argument_list();
				}
			}

			setState(2531);
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
		enterRule(_localctx, 416, RULE_python_argument_list);
		try {
			setState(2539);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
			case 1:
				_localctx = new PythonOrdinalOnlyArgumentListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2533);
				((PythonOrdinalOnlyArgumentListContext)_localctx).ordinal = python_ordinal_argument_list(0);
				}
				break;
			case 2:
				_localctx = new PythonNamedOnlyArgumentListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2534);
				((PythonNamedOnlyArgumentListContext)_localctx).named = python_named_argument_list(0);
				}
				break;
			case 3:
				_localctx = new PythonArgumentListContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2535);
				((PythonArgumentListContext)_localctx).ordinal = python_ordinal_argument_list(0);
				setState(2536);
				match(COMMA);
				setState(2537);
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
		int _startState = 418;
		enterRecursionRule(_localctx, 418, RULE_python_ordinal_argument_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PythonOrdinalArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2542);
			((PythonOrdinalArgumentListContext)_localctx).item = python_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2549);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,236,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PythonOrdinalArgumentListItemContext(new Python_ordinal_argument_listContext(_parentctx, _parentState));
					((PythonOrdinalArgumentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_python_ordinal_argument_list);
					setState(2544);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2545);
					match(COMMA);
					setState(2546);
					((PythonOrdinalArgumentListItemContext)_localctx).item = python_expression(0);
					}
					} 
				}
				setState(2551);
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
		int _startState = 420;
		enterRecursionRule(_localctx, 420, RULE_python_named_argument_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PythonNamedArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2553);
			((PythonNamedArgumentListContext)_localctx).name = python_identifier();
			setState(2554);
			match(EQ);
			setState(2555);
			((PythonNamedArgumentListContext)_localctx).exp = python_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2565);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,237,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PythonNamedArgumentListItemContext(new Python_named_argument_listContext(_parentctx, _parentState));
					((PythonNamedArgumentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_python_named_argument_list);
					setState(2557);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2558);
					match(COMMA);
					setState(2559);
					((PythonNamedArgumentListItemContext)_localctx).name = python_identifier();
					setState(2560);
					match(EQ);
					setState(2561);
					((PythonNamedArgumentListItemContext)_localctx).exp = python_expression(0);
					}
					} 
				}
				setState(2567);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,237,_ctx);
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
		enterRule(_localctx, 422, RULE_python_parenthesis_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2568);
			match(LPAR);
			setState(2569);
			((Python_parenthesis_expressionContext)_localctx).exp = python_expression(0);
			setState(2570);
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
		int _startState = 424;
		enterRecursionRule(_localctx, 424, RULE_python_identifier_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2575);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
			case 1:
				{
				_localctx = new PythonPromptoIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2573);
				match(DOLLAR_IDENTIFIER);
				}
				break;
			case 2:
				{
				_localctx = new PythonIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2574);
				((PythonIdentifierContext)_localctx).name = python_identifier();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2582);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,239,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PythonChildIdentifierContext(new Python_identifier_expressionContext(_parentctx, _parentState));
					((PythonChildIdentifierContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_python_identifier_expression);
					setState(2577);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2578);
					match(DOT);
					setState(2579);
					((PythonChildIdentifierContext)_localctx).name = python_identifier();
					}
					} 
				}
				setState(2584);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,239,_ctx);
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
		enterRule(_localctx, 426, RULE_python_literal_expression);
		try {
			setState(2590);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				_localctx = new PythonIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2585);
				((PythonIntegerLiteralContext)_localctx).t = match(INTEGER_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				_localctx = new PythonDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2586);
				((PythonDecimalLiteralContext)_localctx).t = match(DECIMAL_LITERAL);
				}
				break;
			case TEXT_LITERAL:
				_localctx = new PythonTextLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2587);
				((PythonTextLiteralContext)_localctx).t = match(TEXT_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new PythonBooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2588);
				((PythonBooleanLiteralContext)_localctx).t = match(BOOLEAN_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new PythonCharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2589);
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
		enterRule(_localctx, 428, RULE_python_identifier);
		try {
			setState(2597);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2592);
				match(VARIABLE_IDENTIFIER);
				}
				break;
			case SYMBOL_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2593);
				match(SYMBOL_IDENTIFIER);
				}
				break;
			case DOLLAR_IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(2594);
				match(DOLLAR_IDENTIFIER);
				}
				break;
			case TYPE_IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(2595);
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
				setState(2596);
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
		enterRule(_localctx, 430, RULE_java_statement);
		try {
			setState(2606);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
			case 1:
				_localctx = new JavaReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2599);
				match(RETURN);
				setState(2600);
				((JavaReturnStatementContext)_localctx).exp = java_expression(0);
				setState(2601);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new JavaStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2603);
				((JavaStatementContext)_localctx).exp = java_expression(0);
				setState(2604);
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
		int _startState = 432;
		enterRecursionRule(_localctx, 432, RULE_java_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavaPrimaryExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2609);
			((JavaPrimaryExpressionContext)_localctx).exp = java_primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(2615);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,243,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavaSelectorExpressionContext(new Java_expressionContext(_parentctx, _parentState));
					((JavaSelectorExpressionContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_java_expression);
					setState(2611);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2612);
					((JavaSelectorExpressionContext)_localctx).child = java_selector_expression();
					}
					} 
				}
				setState(2617);
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
		enterRule(_localctx, 434, RULE_java_primary_expression);
		try {
			setState(2623);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2618);
				java_this_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2619);
				java_new_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2620);
				java_parenthesis_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2621);
				java_identifier_expression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2622);
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
		enterRule(_localctx, 436, RULE_java_this_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2625);
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
		enterRule(_localctx, 438, RULE_java_new_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2627);
			new_token();
			setState(2628);
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
		enterRule(_localctx, 440, RULE_java_selector_expression);
		try {
			setState(2633);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				_localctx = new JavaMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2630);
				match(DOT);
				setState(2631);
				((JavaMethodExpressionContext)_localctx).exp = java_method_expression();
				}
				break;
			case LBRAK:
				_localctx = new JavaItemExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2632);
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
		enterRule(_localctx, 442, RULE_java_method_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2635);
			((Java_method_expressionContext)_localctx).name = java_identifier();
			setState(2636);
			match(LPAR);
			setState(2638);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA) | (1L << CSHARP) | (1L << PYTHON2) | (1L << PYTHON3) | (1L << JAVASCRIPT) | (1L << SWIFT) | (1L << LPAR) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (ABSTRACT - 64)) | (1L << (ALL - 64)) | (1L << (ALWAYS - 64)) | (1L << (AND - 64)) | (1L << (ANY - 64)) | (1L << (AS - 64)) | (1L << (ASC - 64)) | (1L << (ATTR - 64)) | (1L << (ATTRIBUTE - 64)) | (1L << (ATTRIBUTES - 64)) | (1L << (BINDINGS - 64)) | (1L << (BREAK - 64)) | (1L << (BY - 64)) | (1L << (CASE - 64)) | (1L << (CATCH - 64)) | (1L << (CATEGORY - 64)) | (1L << (CLASS - 64)) | (1L << (CONTAINS - 64)) | (1L << (DEF - 64)) | (1L << (DEFAULT - 64)) | (1L << (DEFINE - 64)) | (1L << (DELETE - 64)) | (1L << (DESC - 64)) | (1L << (DO - 64)) | (1L << (DOING - 64)) | (1L << (EACH - 64)) | (1L << (ELSE - 64)) | (1L << (ENUM - 64)) | (1L << (ENUMERATED - 64)) | (1L << (EXCEPT - 64)) | (1L << (EXECUTE - 64)) | (1L << (EXPECTING - 64)) | (1L << (EXTENDS - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (FINALLY - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (FROM - 64)) | (1L << (GETTER - 64)) | (1L << (HAS - 64)) | (1L << (IF - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (IS - 64)) | (1L << (MATCHING - 64)) | (1L << (METHOD - 64)) | (1L << (METHODS - 64)) | (1L << (MODULO - 64)) | (1L << (MUTABLE - 64)) | (1L << (NATIVE - 64)) | (1L << (NONE - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (ON - 128)) | (1L << (ONE - 128)) | (1L << (OPERATOR - 128)) | (1L << (OR - 128)) | (1L << (ORDER - 128)) | (1L << (OTHERWISE - 128)) | (1L << (PASS - 128)) | (1L << (RAISE - 128)) | (1L << (READ - 128)) | (1L << (RECEIVING - 128)) | (1L << (RESOURCE - 128)) | (1L << (RETURN - 128)) | (1L << (RETURNING - 128)) | (1L << (ROWS - 128)) | (1L << (SELF - 128)) | (1L << (SETTER - 128)) | (1L << (SINGLETON - 128)) | (1L << (SORTED - 128)) | (1L << (STORABLE - 128)) | (1L << (STORE - 128)) | (1L << (SUPER - 128)) | (1L << (SWITCH - 128)) | (1L << (TEST - 128)) | (1L << (THIS - 128)) | (1L << (THROW - 128)) | (1L << (TO - 128)) | (1L << (TRY - 128)) | (1L << (VERIFYING - 128)) | (1L << (WIDGET - 128)) | (1L << (WITH - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WHILE - 128)) | (1L << (WRITE - 128)) | (1L << (BOOLEAN_LITERAL - 128)) | (1L << (CHAR_LITERAL - 128)) | (1L << (SYMBOL_IDENTIFIER - 128)) | (1L << (TYPE_IDENTIFIER - 128)) | (1L << (VARIABLE_IDENTIFIER - 128)) | (1L << (DOLLAR_IDENTIFIER - 128)) | (1L << (TEXT_LITERAL - 128)) | (1L << (INTEGER_LITERAL - 128)) | (1L << (DECIMAL_LITERAL - 128)))) != 0)) {
				{
				setState(2637);
				((Java_method_expressionContext)_localctx).args = java_arguments(0);
				}
			}

			setState(2640);
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
		int _startState = 444;
		enterRecursionRule(_localctx, 444, RULE_java_arguments, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavaArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2643);
			((JavaArgumentListContext)_localctx).item = java_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2650);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,247,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavaArgumentListItemContext(new Java_argumentsContext(_parentctx, _parentState));
					((JavaArgumentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_java_arguments);
					setState(2645);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2646);
					match(COMMA);
					setState(2647);
					((JavaArgumentListItemContext)_localctx).item = java_expression(0);
					}
					} 
				}
				setState(2652);
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
		enterRule(_localctx, 446, RULE_java_item_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2653);
			match(LBRAK);
			setState(2654);
			((Java_item_expressionContext)_localctx).exp = java_expression(0);
			setState(2655);
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
		enterRule(_localctx, 448, RULE_java_parenthesis_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2657);
			match(LPAR);
			setState(2658);
			((Java_parenthesis_expressionContext)_localctx).exp = java_expression(0);
			setState(2659);
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
		int _startState = 450;
		enterRecursionRule(_localctx, 450, RULE_java_identifier_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavaIdentifierContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2662);
			((JavaIdentifierContext)_localctx).name = java_identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(2669);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,248,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavaChildIdentifierContext(new Java_identifier_expressionContext(_parentctx, _parentState));
					((JavaChildIdentifierContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_java_identifier_expression);
					setState(2664);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2665);
					match(DOT);
					setState(2666);
					((JavaChildIdentifierContext)_localctx).name = java_identifier();
					}
					} 
				}
				setState(2671);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,248,_ctx);
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
		int _startState = 452;
		enterRecursionRule(_localctx, 452, RULE_java_class_identifier_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavaClassIdentifierContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2673);
			((JavaClassIdentifierContext)_localctx).klass = java_identifier_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2679);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,249,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavaChildClassIdentifierContext(new Java_class_identifier_expressionContext(_parentctx, _parentState));
					((JavaChildClassIdentifierContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_java_class_identifier_expression);
					setState(2675);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2676);
					((JavaChildClassIdentifierContext)_localctx).name = match(DOLLAR_IDENTIFIER);
					}
					} 
				}
				setState(2681);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,249,_ctx);
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
		enterRule(_localctx, 454, RULE_java_literal_expression);
		try {
			setState(2687);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				_localctx = new JavaIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2682);
				((JavaIntegerLiteralContext)_localctx).t = match(INTEGER_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				_localctx = new JavaDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2683);
				((JavaDecimalLiteralContext)_localctx).t = match(DECIMAL_LITERAL);
				}
				break;
			case TEXT_LITERAL:
				_localctx = new JavaTextLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2684);
				((JavaTextLiteralContext)_localctx).t = match(TEXT_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new JavaBooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2685);
				((JavaBooleanLiteralContext)_localctx).t = match(BOOLEAN_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new JavaCharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2686);
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
		enterRule(_localctx, 456, RULE_java_identifier);
		try {
			setState(2694);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2689);
				match(VARIABLE_IDENTIFIER);
				}
				break;
			case SYMBOL_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2690);
				match(SYMBOL_IDENTIFIER);
				}
				break;
			case DOLLAR_IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(2691);
				match(DOLLAR_IDENTIFIER);
				}
				break;
			case TYPE_IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(2692);
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
				setState(2693);
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
		enterRule(_localctx, 458, RULE_csharp_statement);
		try {
			setState(2703);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
			case 1:
				_localctx = new CSharpReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2696);
				match(RETURN);
				setState(2697);
				((CSharpReturnStatementContext)_localctx).exp = csharp_expression(0);
				setState(2698);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new CSharpStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2700);
				((CSharpStatementContext)_localctx).exp = csharp_expression(0);
				setState(2701);
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
		int _startState = 460;
		enterRecursionRule(_localctx, 460, RULE_csharp_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new CSharpPrimaryExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2706);
			((CSharpPrimaryExpressionContext)_localctx).exp = csharp_primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(2712);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,253,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CSharpSelectorExpressionContext(new Csharp_expressionContext(_parentctx, _parentState));
					((CSharpSelectorExpressionContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_csharp_expression);
					setState(2708);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2709);
					((CSharpSelectorExpressionContext)_localctx).child = csharp_selector_expression();
					}
					} 
				}
				setState(2714);
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
		enterRule(_localctx, 462, RULE_csharp_primary_expression);
		try {
			setState(2720);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2715);
				csharp_this_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2716);
				csharp_new_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2717);
				csharp_parenthesis_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2718);
				csharp_identifier_expression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2719);
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
		enterRule(_localctx, 464, RULE_csharp_this_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2722);
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
		enterRule(_localctx, 466, RULE_csharp_new_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2724);
			new_token();
			setState(2725);
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
		enterRule(_localctx, 468, RULE_csharp_selector_expression);
		try {
			setState(2730);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				_localctx = new CSharpMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2727);
				match(DOT);
				setState(2728);
				((CSharpMethodExpressionContext)_localctx).exp = csharp_method_expression();
				}
				break;
			case LBRAK:
				_localctx = new CSharpItemExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2729);
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
		enterRule(_localctx, 470, RULE_csharp_method_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2732);
			((Csharp_method_expressionContext)_localctx).name = csharp_identifier();
			setState(2733);
			match(LPAR);
			setState(2735);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA) | (1L << CSHARP) | (1L << PYTHON2) | (1L << PYTHON3) | (1L << JAVASCRIPT) | (1L << SWIFT) | (1L << LPAR) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (ABSTRACT - 64)) | (1L << (ALL - 64)) | (1L << (ALWAYS - 64)) | (1L << (AND - 64)) | (1L << (ANY - 64)) | (1L << (AS - 64)) | (1L << (ASC - 64)) | (1L << (ATTR - 64)) | (1L << (ATTRIBUTE - 64)) | (1L << (ATTRIBUTES - 64)) | (1L << (BINDINGS - 64)) | (1L << (BREAK - 64)) | (1L << (BY - 64)) | (1L << (CASE - 64)) | (1L << (CATCH - 64)) | (1L << (CATEGORY - 64)) | (1L << (CLASS - 64)) | (1L << (CONTAINS - 64)) | (1L << (DEF - 64)) | (1L << (DEFAULT - 64)) | (1L << (DEFINE - 64)) | (1L << (DELETE - 64)) | (1L << (DESC - 64)) | (1L << (DO - 64)) | (1L << (DOING - 64)) | (1L << (EACH - 64)) | (1L << (ELSE - 64)) | (1L << (ENUM - 64)) | (1L << (ENUMERATED - 64)) | (1L << (EXCEPT - 64)) | (1L << (EXECUTE - 64)) | (1L << (EXPECTING - 64)) | (1L << (EXTENDS - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (FINALLY - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (FROM - 64)) | (1L << (GETTER - 64)) | (1L << (HAS - 64)) | (1L << (IF - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (IS - 64)) | (1L << (MATCHING - 64)) | (1L << (METHOD - 64)) | (1L << (METHODS - 64)) | (1L << (MODULO - 64)) | (1L << (MUTABLE - 64)) | (1L << (NATIVE - 64)) | (1L << (NONE - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (ON - 128)) | (1L << (ONE - 128)) | (1L << (OPERATOR - 128)) | (1L << (OR - 128)) | (1L << (ORDER - 128)) | (1L << (OTHERWISE - 128)) | (1L << (PASS - 128)) | (1L << (RAISE - 128)) | (1L << (READ - 128)) | (1L << (RECEIVING - 128)) | (1L << (RESOURCE - 128)) | (1L << (RETURN - 128)) | (1L << (RETURNING - 128)) | (1L << (ROWS - 128)) | (1L << (SELF - 128)) | (1L << (SETTER - 128)) | (1L << (SINGLETON - 128)) | (1L << (SORTED - 128)) | (1L << (STORABLE - 128)) | (1L << (STORE - 128)) | (1L << (SUPER - 128)) | (1L << (SWITCH - 128)) | (1L << (TEST - 128)) | (1L << (THIS - 128)) | (1L << (THROW - 128)) | (1L << (TO - 128)) | (1L << (TRY - 128)) | (1L << (VERIFYING - 128)) | (1L << (WIDGET - 128)) | (1L << (WITH - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WHILE - 128)) | (1L << (WRITE - 128)) | (1L << (BOOLEAN_LITERAL - 128)) | (1L << (CHAR_LITERAL - 128)) | (1L << (SYMBOL_IDENTIFIER - 128)) | (1L << (TYPE_IDENTIFIER - 128)) | (1L << (VARIABLE_IDENTIFIER - 128)) | (1L << (DOLLAR_IDENTIFIER - 128)) | (1L << (TEXT_LITERAL - 128)) | (1L << (INTEGER_LITERAL - 128)) | (1L << (DECIMAL_LITERAL - 128)))) != 0)) {
				{
				setState(2734);
				((Csharp_method_expressionContext)_localctx).args = csharp_arguments(0);
				}
			}

			setState(2737);
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
		int _startState = 472;
		enterRecursionRule(_localctx, 472, RULE_csharp_arguments, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new CSharpArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2740);
			((CSharpArgumentListContext)_localctx).item = csharp_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2747);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,257,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CSharpArgumentListItemContext(new Csharp_argumentsContext(_parentctx, _parentState));
					((CSharpArgumentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_csharp_arguments);
					setState(2742);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2743);
					match(COMMA);
					setState(2744);
					((CSharpArgumentListItemContext)_localctx).item = csharp_expression(0);
					}
					} 
				}
				setState(2749);
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
		enterRule(_localctx, 474, RULE_csharp_item_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2750);
			match(LBRAK);
			setState(2751);
			((Csharp_item_expressionContext)_localctx).exp = csharp_expression(0);
			setState(2752);
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
		enterRule(_localctx, 476, RULE_csharp_parenthesis_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2754);
			match(LPAR);
			setState(2755);
			((Csharp_parenthesis_expressionContext)_localctx).exp = csharp_expression(0);
			setState(2756);
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
		int _startState = 478;
		enterRecursionRule(_localctx, 478, RULE_csharp_identifier_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2761);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
			case 1:
				{
				_localctx = new CSharpPromptoIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2759);
				match(DOLLAR_IDENTIFIER);
				}
				break;
			case 2:
				{
				_localctx = new CSharpIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2760);
				((CSharpIdentifierContext)_localctx).name = csharp_identifier();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2768);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,259,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CSharpChildIdentifierContext(new Csharp_identifier_expressionContext(_parentctx, _parentState));
					((CSharpChildIdentifierContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_csharp_identifier_expression);
					setState(2763);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2764);
					match(DOT);
					setState(2765);
					((CSharpChildIdentifierContext)_localctx).name = csharp_identifier();
					}
					} 
				}
				setState(2770);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,259,_ctx);
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
		enterRule(_localctx, 480, RULE_csharp_literal_expression);
		try {
			setState(2776);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				_localctx = new CSharpIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2771);
				match(INTEGER_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				_localctx = new CSharpDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2772);
				match(DECIMAL_LITERAL);
				}
				break;
			case TEXT_LITERAL:
				_localctx = new CSharpTextLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2773);
				match(TEXT_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new CSharpBooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2774);
				match(BOOLEAN_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new CSharpCharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2775);
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
		enterRule(_localctx, 482, RULE_csharp_identifier);
		try {
			setState(2783);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2778);
				match(VARIABLE_IDENTIFIER);
				}
				break;
			case SYMBOL_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2779);
				match(SYMBOL_IDENTIFIER);
				}
				break;
			case DOLLAR_IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(2780);
				match(DOLLAR_IDENTIFIER);
				}
				break;
			case TYPE_IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(2781);
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
				setState(2782);
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
		enterRule(_localctx, 484, RULE_jsx_expression);
		try {
			setState(2787);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2785);
				jsx_element();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2786);
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
		enterRule(_localctx, 486, RULE_jsx_element);
		try {
			setState(2796);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,264,_ctx) ) {
			case 1:
				_localctx = new JsxSelfClosingContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2789);
				((JsxSelfClosingContext)_localctx).jsx = jsx_self_closing();
				}
				break;
			case 2:
				_localctx = new JsxElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2790);
				((JsxElementContext)_localctx).opening = jsx_opening();
				setState(2792);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,263,_ctx) ) {
				case 1:
					{
					setState(2791);
					((JsxElementContext)_localctx).children_ = jsx_children();
					}
					break;
				}
				setState(2794);
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
		enterRule(_localctx, 488, RULE_jsx_fragment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2798);
			jsx_fragment_start();
			setState(2799);
			ws_plus();
			setState(2801);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,265,_ctx) ) {
			case 1:
				{
				setState(2800);
				((Jsx_fragmentContext)_localctx).children_ = jsx_children();
				}
				break;
			}
			setState(2803);
			ws_plus();
			setState(2804);
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
		enterRule(_localctx, 490, RULE_jsx_fragment_start);
		try {
			setState(2809);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2806);
				match(LT);
				setState(2807);
				match(GT);
				}
				break;
			case LTGT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2808);
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
		enterRule(_localctx, 492, RULE_jsx_fragment_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2811);
			match(LT);
			setState(2812);
			match(SLASH);
			setState(2813);
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
		enterRule(_localctx, 494, RULE_jsx_self_closing);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2815);
			match(LT);
			setState(2816);
			((Jsx_self_closingContext)_localctx).name = jsx_element_name();
			setState(2817);
			ws_plus();
			setState(2821);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA) | (1L << CSHARP) | (1L << PYTHON2) | (1L << PYTHON3) | (1L << JAVASCRIPT) | (1L << SWIFT) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (ABSTRACT - 64)) | (1L << (ALL - 64)) | (1L << (ALWAYS - 64)) | (1L << (AND - 64)) | (1L << (ANY - 64)) | (1L << (AS - 64)) | (1L << (ASC - 64)) | (1L << (ATTR - 64)) | (1L << (ATTRIBUTE - 64)) | (1L << (ATTRIBUTES - 64)) | (1L << (BINDINGS - 64)) | (1L << (BREAK - 64)) | (1L << (BY - 64)) | (1L << (CASE - 64)) | (1L << (CATCH - 64)) | (1L << (CATEGORY - 64)) | (1L << (CLASS - 64)) | (1L << (CONTAINS - 64)) | (1L << (DEF - 64)) | (1L << (DEFAULT - 64)) | (1L << (DEFINE - 64)) | (1L << (DELETE - 64)) | (1L << (DESC - 64)) | (1L << (DO - 64)) | (1L << (DOING - 64)) | (1L << (EACH - 64)) | (1L << (ELSE - 64)) | (1L << (ENUM - 64)) | (1L << (ENUMERATED - 64)) | (1L << (EXCEPT - 64)) | (1L << (EXECUTE - 64)) | (1L << (EXPECTING - 64)) | (1L << (EXTENDS - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (FINALLY - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (FROM - 64)) | (1L << (GETTER - 64)) | (1L << (HAS - 64)) | (1L << (IF - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (IS - 64)) | (1L << (MATCHING - 64)) | (1L << (METHOD - 64)) | (1L << (METHODS - 64)) | (1L << (MODULO - 64)) | (1L << (MUTABLE - 64)) | (1L << (NATIVE - 64)) | (1L << (NONE - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (ON - 128)) | (1L << (ONE - 128)) | (1L << (OPERATOR - 128)) | (1L << (OR - 128)) | (1L << (ORDER - 128)) | (1L << (OTHERWISE - 128)) | (1L << (PASS - 128)) | (1L << (RAISE - 128)) | (1L << (READ - 128)) | (1L << (RECEIVING - 128)) | (1L << (RESOURCE - 128)) | (1L << (RETURN - 128)) | (1L << (RETURNING - 128)) | (1L << (ROWS - 128)) | (1L << (SELF - 128)) | (1L << (SETTER - 128)) | (1L << (SINGLETON - 128)) | (1L << (SORTED - 128)) | (1L << (STORABLE - 128)) | (1L << (STORE - 128)) | (1L << (SUPER - 128)) | (1L << (SWITCH - 128)) | (1L << (TEST - 128)) | (1L << (THIS - 128)) | (1L << (THROW - 128)) | (1L << (TO - 128)) | (1L << (TRY - 128)) | (1L << (VERIFYING - 128)) | (1L << (WIDGET - 128)) | (1L << (WITH - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WHILE - 128)) | (1L << (WRITE - 128)) | (1L << (SYMBOL_IDENTIFIER - 128)) | (1L << (TYPE_IDENTIFIER - 128)) | (1L << (VARIABLE_IDENTIFIER - 128)))) != 0)) {
				{
				{
				setState(2818);
				((Jsx_self_closingContext)_localctx).attributes = jsx_attribute();
				}
				}
				setState(2823);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2824);
			match(SLASH);
			setState(2825);
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
		enterRule(_localctx, 496, RULE_jsx_opening);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2827);
			match(LT);
			setState(2828);
			((Jsx_openingContext)_localctx).name = jsx_element_name();
			setState(2829);
			ws_plus();
			setState(2833);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA) | (1L << CSHARP) | (1L << PYTHON2) | (1L << PYTHON3) | (1L << JAVASCRIPT) | (1L << SWIFT) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (ABSTRACT - 64)) | (1L << (ALL - 64)) | (1L << (ALWAYS - 64)) | (1L << (AND - 64)) | (1L << (ANY - 64)) | (1L << (AS - 64)) | (1L << (ASC - 64)) | (1L << (ATTR - 64)) | (1L << (ATTRIBUTE - 64)) | (1L << (ATTRIBUTES - 64)) | (1L << (BINDINGS - 64)) | (1L << (BREAK - 64)) | (1L << (BY - 64)) | (1L << (CASE - 64)) | (1L << (CATCH - 64)) | (1L << (CATEGORY - 64)) | (1L << (CLASS - 64)) | (1L << (CONTAINS - 64)) | (1L << (DEF - 64)) | (1L << (DEFAULT - 64)) | (1L << (DEFINE - 64)) | (1L << (DELETE - 64)) | (1L << (DESC - 64)) | (1L << (DO - 64)) | (1L << (DOING - 64)) | (1L << (EACH - 64)) | (1L << (ELSE - 64)) | (1L << (ENUM - 64)) | (1L << (ENUMERATED - 64)) | (1L << (EXCEPT - 64)) | (1L << (EXECUTE - 64)) | (1L << (EXPECTING - 64)) | (1L << (EXTENDS - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (FINALLY - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (FROM - 64)) | (1L << (GETTER - 64)) | (1L << (HAS - 64)) | (1L << (IF - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (IS - 64)) | (1L << (MATCHING - 64)) | (1L << (METHOD - 64)) | (1L << (METHODS - 64)) | (1L << (MODULO - 64)) | (1L << (MUTABLE - 64)) | (1L << (NATIVE - 64)) | (1L << (NONE - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (ON - 128)) | (1L << (ONE - 128)) | (1L << (OPERATOR - 128)) | (1L << (OR - 128)) | (1L << (ORDER - 128)) | (1L << (OTHERWISE - 128)) | (1L << (PASS - 128)) | (1L << (RAISE - 128)) | (1L << (READ - 128)) | (1L << (RECEIVING - 128)) | (1L << (RESOURCE - 128)) | (1L << (RETURN - 128)) | (1L << (RETURNING - 128)) | (1L << (ROWS - 128)) | (1L << (SELF - 128)) | (1L << (SETTER - 128)) | (1L << (SINGLETON - 128)) | (1L << (SORTED - 128)) | (1L << (STORABLE - 128)) | (1L << (STORE - 128)) | (1L << (SUPER - 128)) | (1L << (SWITCH - 128)) | (1L << (TEST - 128)) | (1L << (THIS - 128)) | (1L << (THROW - 128)) | (1L << (TO - 128)) | (1L << (TRY - 128)) | (1L << (VERIFYING - 128)) | (1L << (WIDGET - 128)) | (1L << (WITH - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WHILE - 128)) | (1L << (WRITE - 128)) | (1L << (SYMBOL_IDENTIFIER - 128)) | (1L << (TYPE_IDENTIFIER - 128)) | (1L << (VARIABLE_IDENTIFIER - 128)))) != 0)) {
				{
				{
				setState(2830);
				((Jsx_openingContext)_localctx).attributes = jsx_attribute();
				}
				}
				setState(2835);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2836);
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
		enterRule(_localctx, 498, RULE_jsx_closing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2838);
			match(LT);
			setState(2839);
			match(SLASH);
			setState(2840);
			((Jsx_closingContext)_localctx).name = jsx_element_name();
			setState(2841);
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
		enterRule(_localctx, 500, RULE_jsx_element_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2843);
			jsx_identifier();
			setState(2848);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(2844);
				match(DOT);
				setState(2845);
				jsx_identifier();
				}
				}
				setState(2850);
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
		enterRule(_localctx, 502, RULE_jsx_identifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2851);
			identifier_or_keyword();
			setState(2855);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,270,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2852);
					nospace_hyphen_identifier_or_keyword();
					}
					} 
				}
				setState(2857);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,270,_ctx);
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
		enterRule(_localctx, 504, RULE_jsx_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2858);
			((Jsx_attributeContext)_localctx).name = jsx_identifier();
			setState(2861);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(2859);
				match(EQ);
				setState(2860);
				((Jsx_attributeContext)_localctx).value = jsx_attribute_value();
				}
			}

			setState(2863);
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
		enterRule(_localctx, 506, RULE_jsx_attribute_value);
		int _la;
		try {
			setState(2871);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT_LITERAL:
				_localctx = new JsxLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2865);
				match(TEXT_LITERAL);
				}
				break;
			case LCURL:
				_localctx = new JsxValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2866);
				match(LCURL);
				setState(2868);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << XMARK) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << LTCOLONGT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (TYPE - 64)) | (1L << (ANY - 64)) | (1L << (CATEGORY - 64)) | (1L << (EXECUTE - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (MUTABLE - 64)) | (1L << (NULL - 64)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (READ - 136)) | (1L << (RESOURCE - 136)) | (1L << (SELF - 136)) | (1L << (SORTED - 136)) | (1L << (SUPER - 136)) | (1L << (THIS - 136)) | (1L << (BOOLEAN_LITERAL - 136)) | (1L << (CHAR_LITERAL - 136)) | (1L << (MIN_INTEGER - 136)) | (1L << (MAX_INTEGER - 136)) | (1L << (SYMBOL_IDENTIFIER - 136)) | (1L << (TYPE_IDENTIFIER - 136)) | (1L << (VARIABLE_IDENTIFIER - 136)) | (1L << (TEXT_LITERAL - 136)) | (1L << (UUID_LITERAL - 136)) | (1L << (VERSION_LITERAL - 136)) | (1L << (INTEGER_LITERAL - 136)) | (1L << (HEXA_LITERAL - 136)) | (1L << (DECIMAL_LITERAL - 136)) | (1L << (DATETIME_LITERAL - 136)) | (1L << (TIME_LITERAL - 136)) | (1L << (DATE_LITERAL - 136)) | (1L << (PERIOD_LITERAL - 136)))) != 0)) {
					{
					setState(2867);
					((JsxValueContext)_localctx).exp = expression(0);
					}
				}

				setState(2870);
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
		enterRule(_localctx, 508, RULE_jsx_children);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2874); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2873);
					jsx_child();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2876); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,274,_ctx);
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
		enterRule(_localctx, 510, RULE_jsx_child);
		int _la;
		try {
			setState(2885);
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
				setState(2878);
				((JsxTextContext)_localctx).text = jsx_text();
				}
				break;
			case LT:
				_localctx = new JsxChildContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2879);
				((JsxChildContext)_localctx).jsx = jsx_element();
				}
				break;
			case LCURL:
				_localctx = new JsxCodeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2880);
				match(LCURL);
				setState(2882);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << XMARK) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << LTCOLONGT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (TYPE - 64)) | (1L << (ANY - 64)) | (1L << (CATEGORY - 64)) | (1L << (EXECUTE - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (MUTABLE - 64)) | (1L << (NULL - 64)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (READ - 136)) | (1L << (RESOURCE - 136)) | (1L << (SELF - 136)) | (1L << (SORTED - 136)) | (1L << (SUPER - 136)) | (1L << (THIS - 136)) | (1L << (BOOLEAN_LITERAL - 136)) | (1L << (CHAR_LITERAL - 136)) | (1L << (MIN_INTEGER - 136)) | (1L << (MAX_INTEGER - 136)) | (1L << (SYMBOL_IDENTIFIER - 136)) | (1L << (TYPE_IDENTIFIER - 136)) | (1L << (VARIABLE_IDENTIFIER - 136)) | (1L << (TEXT_LITERAL - 136)) | (1L << (UUID_LITERAL - 136)) | (1L << (VERSION_LITERAL - 136)) | (1L << (INTEGER_LITERAL - 136)) | (1L << (HEXA_LITERAL - 136)) | (1L << (DECIMAL_LITERAL - 136)) | (1L << (DATETIME_LITERAL - 136)) | (1L << (TIME_LITERAL - 136)) | (1L << (DATE_LITERAL - 136)) | (1L << (PERIOD_LITERAL - 136)))) != 0)) {
					{
					setState(2881);
					((JsxCodeContext)_localctx).exp = expression(0);
					}
				}

				setState(2884);
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
		enterRule(_localctx, 512, RULE_jsx_text);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2888); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2887);
					jsx_char();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2890); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,277,_ctx);
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
		enterRule(_localctx, 514, RULE_jsx_char);
		int _la;
		try {
			setState(2894);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2892);
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
				setState(2893);
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
		enterRule(_localctx, 516, RULE_css_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2896);
			match(LCURL);
			setState(2898); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2897);
				((Css_expressionContext)_localctx).field = css_field();
				}
				}
				setState(2900); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA) | (1L << CSHARP) | (1L << PYTHON2) | (1L << PYTHON3) | (1L << JAVASCRIPT) | (1L << SWIFT) | (1L << MINUS) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (ABSTRACT - 64)) | (1L << (ALL - 64)) | (1L << (ALWAYS - 64)) | (1L << (AND - 64)) | (1L << (ANY - 64)) | (1L << (AS - 64)) | (1L << (ASC - 64)) | (1L << (ATTR - 64)) | (1L << (ATTRIBUTE - 64)) | (1L << (ATTRIBUTES - 64)) | (1L << (BINDINGS - 64)) | (1L << (BREAK - 64)) | (1L << (BY - 64)) | (1L << (CASE - 64)) | (1L << (CATCH - 64)) | (1L << (CATEGORY - 64)) | (1L << (CLASS - 64)) | (1L << (CONTAINS - 64)) | (1L << (DEF - 64)) | (1L << (DEFAULT - 64)) | (1L << (DEFINE - 64)) | (1L << (DELETE - 64)) | (1L << (DESC - 64)) | (1L << (DO - 64)) | (1L << (DOING - 64)) | (1L << (EACH - 64)) | (1L << (ELSE - 64)) | (1L << (ENUM - 64)) | (1L << (ENUMERATED - 64)) | (1L << (EXCEPT - 64)) | (1L << (EXECUTE - 64)) | (1L << (EXPECTING - 64)) | (1L << (EXTENDS - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (FINALLY - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (FROM - 64)) | (1L << (GETTER - 64)) | (1L << (HAS - 64)) | (1L << (IF - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (IS - 64)) | (1L << (MATCHING - 64)) | (1L << (METHOD - 64)) | (1L << (METHODS - 64)) | (1L << (MODULO - 64)) | (1L << (MUTABLE - 64)) | (1L << (NATIVE - 64)) | (1L << (NONE - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (ON - 128)) | (1L << (ONE - 128)) | (1L << (OPERATOR - 128)) | (1L << (OR - 128)) | (1L << (ORDER - 128)) | (1L << (OTHERWISE - 128)) | (1L << (PASS - 128)) | (1L << (RAISE - 128)) | (1L << (READ - 128)) | (1L << (RECEIVING - 128)) | (1L << (RESOURCE - 128)) | (1L << (RETURN - 128)) | (1L << (RETURNING - 128)) | (1L << (ROWS - 128)) | (1L << (SELF - 128)) | (1L << (SETTER - 128)) | (1L << (SINGLETON - 128)) | (1L << (SORTED - 128)) | (1L << (STORABLE - 128)) | (1L << (STORE - 128)) | (1L << (SUPER - 128)) | (1L << (SWITCH - 128)) | (1L << (TEST - 128)) | (1L << (THIS - 128)) | (1L << (THROW - 128)) | (1L << (TO - 128)) | (1L << (TRY - 128)) | (1L << (VERIFYING - 128)) | (1L << (WIDGET - 128)) | (1L << (WITH - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WHILE - 128)) | (1L << (WRITE - 128)) | (1L << (SYMBOL_IDENTIFIER - 128)) | (1L << (TYPE_IDENTIFIER - 128)) | (1L << (VARIABLE_IDENTIFIER - 128)))) != 0) );
			setState(2902);
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
		enterRule(_localctx, 518, RULE_css_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2904);
			((Css_fieldContext)_localctx).name = css_identifier(0);
			setState(2905);
			match(COLON);
			setState(2907); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2906);
				((Css_fieldContext)_localctx).values = css_value();
				}
				}
				setState(2909); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << WS) | (1L << LF) | (1L << COMMENT) | (1L << JAVA) | (1L << CSHARP) | (1L << PYTHON2) | (1L << PYTHON3) | (1L << JAVASCRIPT) | (1L << SWIFT) | (1L << COLON) | (1L << COMMA) | (1L << RANGE) | (1L << DOT) | (1L << LPAR) | (1L << RPAR) | (1L << LBRAK) | (1L << RBRAK) | (1L << LCURL) | (1L << QMARK) | (1L << XMARK) | (1L << AMP) | (1L << AMP2) | (1L << PIPE) | (1L << PIPE2) | (1L << PLUS) | (1L << MINUS) | (1L << STAR) | (1L << SLASH) | (1L << BSLASH) | (1L << PERCENT) | (1L << SHARP) | (1L << GT) | (1L << GTE) | (1L << LT) | (1L << LTE) | (1L << LTGT) | (1L << LTCOLONGT) | (1L << EQ) | (1L << XEQ) | (1L << EQ2) | (1L << TEQ) | (1L << TILDE) | (1L << LARROW) | (1L << RARROW) | (1L << EGT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << METHOD_COLON) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (DBID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (TYPE - 64)) | (1L << (ABSTRACT - 64)) | (1L << (ALL - 64)) | (1L << (ALWAYS - 64)) | (1L << (AND - 64)) | (1L << (ANY - 64)) | (1L << (AS - 64)) | (1L << (ASC - 64)) | (1L << (ATTR - 64)) | (1L << (ATTRIBUTE - 64)) | (1L << (ATTRIBUTES - 64)) | (1L << (BINDINGS - 64)) | (1L << (BREAK - 64)) | (1L << (BY - 64)) | (1L << (CASE - 64)) | (1L << (CATCH - 64)) | (1L << (CATEGORY - 64)) | (1L << (CLASS - 64)) | (1L << (CONTAINS - 64)) | (1L << (DEF - 64)) | (1L << (DEFAULT - 64)) | (1L << (DEFINE - 64)) | (1L << (DELETE - 64)) | (1L << (DESC - 64)) | (1L << (DO - 64)) | (1L << (DOING - 64)) | (1L << (EACH - 64)) | (1L << (ELSE - 64)) | (1L << (ENUM - 64)) | (1L << (ENUMERATED - 64)) | (1L << (EXCEPT - 64)) | (1L << (EXECUTE - 64)) | (1L << (EXPECTING - 64)) | (1L << (EXTENDS - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (FINALLY - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (FROM - 64)) | (1L << (GETTER - 64)) | (1L << (HAS - 64)) | (1L << (IF - 64)) | (1L << (IN - 64)) | (1L << (INCLUDE - 64)) | (1L << (INDEX - 64)) | (1L << (INVOKE_COLON - 64)) | (1L << (IS - 64)) | (1L << (MATCHING - 64)) | (1L << (METHOD - 64)) | (1L << (METHODS - 64)) | (1L << (MODULO - 64)) | (1L << (MUTABLE - 64)) | (1L << (NATIVE - 64)) | (1L << (NONE - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (ON - 128)) | (1L << (ONE - 128)) | (1L << (OPERATOR - 128)) | (1L << (OR - 128)) | (1L << (ORDER - 128)) | (1L << (OTHERWISE - 128)) | (1L << (PASS - 128)) | (1L << (RAISE - 128)) | (1L << (READ - 128)) | (1L << (RECEIVING - 128)) | (1L << (RESOURCE - 128)) | (1L << (RETURN - 128)) | (1L << (RETURNING - 128)) | (1L << (ROWS - 128)) | (1L << (SELF - 128)) | (1L << (SETTER - 128)) | (1L << (SINGLETON - 128)) | (1L << (SORTED - 128)) | (1L << (STORABLE - 128)) | (1L << (STORE - 128)) | (1L << (SUPER - 128)) | (1L << (SWITCH - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (THIS - 128)) | (1L << (THROW - 128)) | (1L << (TO - 128)) | (1L << (TRY - 128)) | (1L << (VERIFYING - 128)) | (1L << (WIDGET - 128)) | (1L << (WITH - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WHILE - 128)) | (1L << (WRITE - 128)) | (1L << (BOOLEAN_LITERAL - 128)) | (1L << (CHAR_LITERAL - 128)) | (1L << (MIN_INTEGER - 128)) | (1L << (MAX_INTEGER - 128)) | (1L << (SYMBOL_IDENTIFIER - 128)) | (1L << (TYPE_IDENTIFIER - 128)) | (1L << (VARIABLE_IDENTIFIER - 128)) | (1L << (NATIVE_IDENTIFIER - 128)) | (1L << (DOLLAR_IDENTIFIER - 128)) | (1L << (ARONDBASE_IDENTIFIER - 128)) | (1L << (TEXT_LITERAL - 128)) | (1L << (UUID_LITERAL - 128)) | (1L << (VERSION_LITERAL - 128)) | (1L << (INTEGER_LITERAL - 128)) | (1L << (HEXA_LITERAL - 128)) | (1L << (DECIMAL_LITERAL - 128)) | (1L << (DATETIME_LITERAL - 128)) | (1L << (TIME_LITERAL - 128)) | (1L << (DATE_LITERAL - 128)) | (1L << (PERIOD_LITERAL - 128)) | (1L << (JSX_TEXT - 128)))) != 0) );
			setState(2911);
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
		int _startState = 520;
		enterRecursionRule(_localctx, 520, RULE_css_identifier, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2917);
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
				setState(2914);
				identifier_or_keyword();
				}
				break;
			case MINUS:
				{
				setState(2915);
				match(MINUS);
				setState(2916);
				nospace_identifier_or_keyword();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(2927);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,283,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Css_identifierContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_css_identifier);
					setState(2919);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2921); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(2920);
							nospace_hyphen_identifier_or_keyword();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(2923); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,282,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					} 
				}
				setState(2929);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,283,_ctx);
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
		enterRule(_localctx, 522, RULE_css_value);
		try {
			setState(2935);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURL:
				_localctx = new CssValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2930);
				match(LCURL);
				setState(2931);
				((CssValueContext)_localctx).exp = expression(0);
				setState(2932);
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
				setState(2934);
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
		enterRule(_localctx, 524, RULE_css_text);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2938); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2937);
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
				setState(2940); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,285,_ctx);
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
		case 39:
			return else_if_statement_list_sempred((Else_if_statement_listContext)_localctx, predIndex);
		case 48:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 50:
			return an_expression_sempred((An_expressionContext)_localctx, predIndex);
		case 53:
			return instance_expression_sempred((Instance_expressionContext)_localctx, predIndex);
		case 54:
			return mutable_instance_expression_sempred((Mutable_instance_expressionContext)_localctx, predIndex);
		case 67:
			return copy_from_sempred((Copy_fromContext)_localctx, predIndex);
		case 68:
			return argument_assignment_list_sempred((Argument_assignment_listContext)_localctx, predIndex);
		case 95:
			return typedef_sempred((TypedefContext)_localctx, predIndex);
		case 106:
			return nospace_hyphen_identifier_or_keyword_sempred((Nospace_hyphen_identifier_or_keywordContext)_localctx, predIndex);
		case 107:
			return nospace_identifier_or_keyword_sempred((Nospace_identifier_or_keywordContext)_localctx, predIndex);
		case 120:
			return any_type_sempred((Any_typeContext)_localctx, predIndex);
		case 162:
			return assignable_instance_sempred((Assignable_instanceContext)_localctx, predIndex);
		case 163:
			return is_expression_sempred((Is_expressionContext)_localctx, predIndex);
		case 164:
			return metadata_sempred((MetadataContext)_localctx, predIndex);
		case 177:
			return new_token_sempred((New_tokenContext)_localctx, predIndex);
		case 178:
			return key_token_sempred((Key_tokenContext)_localctx, predIndex);
		case 179:
			return module_token_sempred((Module_tokenContext)_localctx, predIndex);
		case 180:
			return value_token_sempred((Value_tokenContext)_localctx, predIndex);
		case 181:
			return symbols_token_sempred((Symbols_tokenContext)_localctx, predIndex);
		case 190:
			return javascript_expression_sempred((Javascript_expressionContext)_localctx, predIndex);
		case 196:
			return javascript_arguments_sempred((Javascript_argumentsContext)_localctx, predIndex);
		case 203:
			return python_expression_sempred((Python_expressionContext)_localctx, predIndex);
		case 209:
			return python_ordinal_argument_list_sempred((Python_ordinal_argument_listContext)_localctx, predIndex);
		case 210:
			return python_named_argument_list_sempred((Python_named_argument_listContext)_localctx, predIndex);
		case 212:
			return python_identifier_expression_sempred((Python_identifier_expressionContext)_localctx, predIndex);
		case 216:
			return java_expression_sempred((Java_expressionContext)_localctx, predIndex);
		case 222:
			return java_arguments_sempred((Java_argumentsContext)_localctx, predIndex);
		case 225:
			return java_identifier_expression_sempred((Java_identifier_expressionContext)_localctx, predIndex);
		case 226:
			return java_class_identifier_expression_sempred((Java_class_identifier_expressionContext)_localctx, predIndex);
		case 230:
			return csharp_expression_sempred((Csharp_expressionContext)_localctx, predIndex);
		case 236:
			return csharp_arguments_sempred((Csharp_argumentsContext)_localctx, predIndex);
		case 239:
			return csharp_identifier_expression_sempred((Csharp_identifier_expressionContext)_localctx, predIndex);
		case 260:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00b9\u0b81\4\2\t"+
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
		"\4\u0108\t\u0108\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u0218\n\2\3\2\3\2\5\2"+
		"\u021c\n\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\5\6\u0237\n\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6\u023e\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0246\n\6\5\6\u0248\n\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\5\7\u0250\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\5\t\u025d\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0265\n\t\3\t\3"+
		"\t\5\t\u0269\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0273\n\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u027d\n\13\f\13\16\13\u0280\13\13"+
		"\3\f\3\f\3\f\5\f\u0285\n\f\3\f\5\f\u0288\n\f\3\r\5\r\u028b\n\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\5\r\u0294\n\r\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u029c"+
		"\n\16\3\16\3\16\3\17\5\17\u02a1\n\17\3\17\3\17\3\17\3\17\5\17\u02a7\n"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u02af\n\20\3\20\3\20\3\21\5\21"+
		"\u02b4\n\21\3\21\3\21\3\21\3\21\5\21\u02ba\n\21\3\21\3\21\3\22\5\22\u02bf"+
		"\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u02c8\n\22\3\22\3\22\3\22"+
		"\5\22\u02cd\n\22\3\22\3\22\3\23\5\23\u02d2\n\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\5\23\u02db\n\23\3\23\3\23\3\23\5\23\u02e0\n\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\7\25\u02f2\n\25\f\25\16\25\u02f5\13\25\3\26\3\26\5\26\u02f9\n\26\3\26"+
		"\5\26\u02fc\n\26\3\26\3\26\3\26\3\26\5\26\u0302\n\26\3\26\3\26\3\26\3"+
		"\27\3\27\5\27\u0309\n\27\3\27\5\27\u030c\n\27\3\27\3\27\3\27\3\27\5\27"+
		"\u0312\n\27\3\27\3\27\3\27\3\30\5\30\u0318\n\30\3\30\5\30\u031b\n\30\3"+
		"\30\3\30\3\30\3\30\5\30\u0321\n\30\3\30\3\30\3\30\5\30\u0326\n\30\3\30"+
		"\3\30\3\31\5\31\u032b\n\31\3\31\5\31\u032e\n\31\3\31\3\31\3\31\3\31\5"+
		"\31\u0334\n\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u034b\n\32\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\5\34\u0355\n\34\3\34\3\34\3\34\5\34"+
		"\u035a\n\34\3\35\3\35\3\35\3\35\3\35\5\35\u0361\n\35\5\35\u0363\n\35\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u037a\n\36\3\37\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u038b\n \3 \3 \3 \3 \3 \5 \u0392"+
		"\n \3 \3 \3 \3 \3 \3 \5 \u039a\n \3 \3 \3 \3 \3 \3 \5 \u03a2\n \3!\3!"+
		"\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u03b9"+
		"\n#\5#\u03bb\n#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u03ca\n$\3%"+
		"\3%\3%\3%\3%\3%\5%\u03d2\n%\3%\3%\3%\3%\3%\3&\3&\3&\5&\u03dc\n&\3&\3&"+
		"\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\5(\u03f1\n("+
		"\3(\3(\5(\u03f5\n(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\7)"+
		"\u0407\n)\f)\16)\u040a\13)\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\5+\u0416\n+\3"+
		"+\3+\5+\u041a\n+\3+\3+\3+\3+\3+\3+\5+\u0422\n+\3+\5+\u0425\n+\3+\3+\3"+
		"+\5+\u042a\n+\3+\5+\u042d\n+\3,\3,\3,\3,\3,\3,\5,\u0435\n,\3,\3,\3,\3"+
		",\3,\3,\3,\3,\3,\5,\u0440\n,\3,\3,\5,\u0444\n,\3-\3-\3-\3.\3.\5.\u044b"+
		"\n.\3.\3.\3/\3/\3/\5/\u0452\n/\3/\3/\3\60\3\60\3\60\5\60\u0459\n\60\3"+
		"\60\3\60\3\60\3\60\5\60\u045f\n\60\3\60\3\60\3\60\3\60\3\60\5\60\u0466"+
		"\n\60\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\5\62\u0476\n\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\5\62\u0487\n\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\5\62\u04a2\n\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\5\62\u04aa\n\62\3\62\3\62\3\62\3\62\5\62\u04b0\n\62\3\62\3\62\3\62\3"+
		"\62\5\62\u04b6\n\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u04c9\n\62\3\62\3\62\3\62\5\62"+
		"\u04ce\n\62\3\62\3\62\3\62\3\62\3\62\5\62\u04d5\n\62\3\62\3\62\3\62\3"+
		"\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\7\62\u04e3\n\62\f\62\16\62"+
		"\u04e6\13\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3"+
		"\63\3\63\3\63\5\63\u04f6\n\63\3\64\3\64\3\64\3\64\3\65\3\65\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\5\66\u0504\n\66\3\67\3\67\3\67\3\67\3\67\7\67\u050b"+
		"\n\67\f\67\16\67\u050e\13\67\38\38\38\38\38\38\78\u0516\n8\f8\168\u0519"+
		"\138\39\39\39\39\39\39\39\39\39\39\59\u0525\n9\3:\3:\3:\3:\3:\3;\3;\3"+
		";\3;\3;\5;\u0531\n;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\5<\u053d\n<\3=\3=\3"+
		"=\3=\3=\3=\3=\3=\3=\5=\u0548\n=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\5>\u0555"+
		"\n>\3>\3>\3>\3>\3>\3>\3>\3>\3>\5>\u0560\n>\3>\3>\3>\3>\3>\3>\5>\u0568"+
		"\n>\3>\3>\3>\3>\5>\u056e\n>\3>\3>\3>\3>\3>\3>\3>\5>\u0577\n>\3>\3>\3>"+
		"\3>\3>\5>\u057e\n>\3>\3>\3>\3>\3>\5>\u0585\n>\3>\3>\3>\3>\3>\3>\5>\u058d"+
		"\n>\5>\u058f\n>\3?\3?\3?\3?\3?\3?\5?\u0597\n?\3?\3?\3?\3?\3?\3?\3?\3?"+
		"\3?\5?\u05a2\n?\3?\3?\3?\3?\3?\3?\3?\3?\5?\u05ac\n?\3?\3?\3?\3?\5?\u05b2"+
		"\n?\3?\3?\3?\3?\3?\3?\3?\5?\u05bb\n?\3?\3?\3?\3?\3?\5?\u05c2\n?\3?\3?"+
		"\3?\3?\3?\5?\u05c9\n?\3?\3?\3?\3?\3?\3?\5?\u05d1\n?\3?\5?\u05d4\n?\3@"+
		"\3@\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3B\3B\5B\u05e5\nB\3B\3B\3B\3B\3B"+
		"\3B\3B\5B\u05ee\nB\3B\3B\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\5C\u05fe"+
		"\nC\3D\3D\3D\3D\3D\5D\u0605\nD\3D\3D\3D\3D\3D\5D\u060c\nD\3D\3D\5D\u0610"+
		"\nD\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\5F\u061c\nF\3F\3F\3F\7F\u0621\nF\fF"+
		"\16F\u0624\13F\3G\3G\3G\3G\5G\u062a\nG\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3"+
		"I\5I\u0637\nI\3J\3J\3J\3J\3J\3K\3K\3L\3L\3M\7M\u0643\nM\fM\16M\u0646\13"+
		"M\3N\3N\3N\5N\u064b\nN\3O\3O\5O\u064f\nO\3O\3O\3O\3P\3P\3P\3P\7P\u0658"+
		"\nP\fP\16P\u065b\13P\3Q\3Q\3Q\7Q\u0660\nQ\fQ\16Q\u0663\13Q\3Q\3Q\3Q\7"+
		"Q\u0668\nQ\fQ\16Q\u066b\13Q\3Q\3Q\3Q\3Q\3Q\3Q\5Q\u0673\nQ\3R\3R\3R\3R"+
		"\3R\3R\7R\u067b\nR\fR\16R\u067e\13R\5R\u0680\nR\3R\3R\5R\u0684\nR\3S\3"+
		"S\3T\3T\3T\3T\3U\3U\3V\3V\5V\u0690\nV\3W\3W\3X\3X\5X\u0696\nX\3Y\3Y\3"+
		"Y\3Y\7Y\u069c\nY\fY\16Y\u069f\13Y\3Z\3Z\3Z\3Z\7Z\u06a5\nZ\fZ\16Z\u06a8"+
		"\13Z\3[\3[\3[\7[\u06ad\n[\f[\16[\u06b0\13[\3\\\3\\\3\\\3\\\3\\\3\\\3\\"+
		"\3\\\3\\\3\\\5\\\u06bc\n\\\3]\5]\u06bf\n]\3]\3]\5]\u06c3\n]\3]\3]\3^\5"+
		"^\u06c8\n^\3^\3^\5^\u06cc\n^\3^\3^\3_\3_\3_\7_\u06d3\n_\f_\16_\u06d6\13"+
		"_\3`\3`\3`\3`\3`\3`\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3"+
		"a\5a\u06ef\na\3a\3a\3a\3a\3a\3a\3a\7a\u06f8\na\fa\16a\u06fb\13a\3b\3b"+
		"\5b\u06ff\nb\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\5c"+
		"\u0713\nc\3d\3d\3e\5e\u0718\ne\3e\3e\3f\3f\3g\3g\3g\5g\u0721\ng\3h\3h"+
		"\5h\u0725\nh\3i\3i\3i\7i\u072a\ni\fi\16i\u072d\13i\3j\3j\5j\u0731\nj\3"+
		"k\3k\5k\u0735\nk\3l\3l\3l\3l\3m\3m\3m\3n\3n\3n\5n\u0741\nn\3o\3o\3p\3"+
		"p\3q\3q\3r\3r\3s\3s\3t\3t\3t\7t\u0750\nt\ft\16t\u0753\13t\3u\3u\5u\u0757"+
		"\nu\3u\5u\u075a\nu\3v\3v\5v\u075e\nv\3w\3w\3w\5w\u0763\nw\3x\3x\3x\3y"+
		"\3y\5y\u076a\ny\3z\3z\3z\3z\3z\3z\3z\3z\3z\7z\u0775\nz\fz\16z\u0778\13"+
		"z\3{\3{\3{\3{\7{\u077e\n{\f{\16{\u0781\13{\3|\3|\3|\7|\u0786\n|\f|\16"+
		"|\u0789\13|\3|\3|\3|\7|\u078e\n|\f|\16|\u0791\13|\3|\3|\3|\3|\3|\5|\u0798"+
		"\n|\3}\3}\3}\3}\7}\u079e\n}\f}\16}\u07a1\13}\3~\3~\3~\7~\u07a6\n~\f~\16"+
		"~\u07a9\13~\3~\3~\3~\7~\u07ae\n~\f~\16~\u07b1\13~\3~\3~\3~\5~\u07b6\n"+
		"~\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177\5\177\u07c2"+
		"\n\177\3\u0080\3\u0080\5\u0080\u07c6\n\u0080\3\u0081\3\u0081\3\u0081\3"+
		"\u0081\3\u0081\3\u0081\7\u0081\u07ce\n\u0081\f\u0081\16\u0081\u07d1\13"+
		"\u0081\3\u0082\3\u0082\3\u0082\7\u0082\u07d6\n\u0082\f\u0082\16\u0082"+
		"\u07d9\13\u0082\3\u0082\5\u0082\u07dc\n\u0082\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\5\u0083\u07e2\n\u0083\3\u0083\3\u0083\3\u0083\7\u0083\u07e7\n"+
		"\u0083\f\u0083\16\u0083\u07ea\13\u0083\3\u0083\3\u0083\5\u0083\u07ee\n"+
		"\u0083\3\u0084\3\u0084\3\u0084\7\u0084\u07f3\n\u0084\f\u0084\16\u0084"+
		"\u07f6\13\u0084\3\u0085\3\u0085\3\u0085\7\u0085\u07fb\n\u0085\f\u0085"+
		"\16\u0085\u07fe\13\u0085\3\u0086\3\u0086\3\u0086\3\u0086\5\u0086\u0804"+
		"\n\u0086\3\u0087\3\u0087\3\u0088\3\u0088\3\u0088\3\u0088\7\u0088\u080c"+
		"\n\u0088\f\u0088\16\u0088\u080f\13\u0088\3\u0089\3\u0089\3\u0089\3\u0089"+
		"\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\5\u0089\u081b\n\u0089"+
		"\3\u008a\3\u008a\5\u008a\u081f\n\u008a\3\u008a\5\u008a\u0822\n\u008a\3"+
		"\u008b\3\u008b\5\u008b\u0826\n\u008b\3\u008b\5\u008b\u0829\n\u008b\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\7\u008c\u082f\n\u008c\f\u008c\16\u008c\u0832"+
		"\13\u008c\3\u008d\3\u008d\3\u008d\3\u008d\7\u008d\u0838\n\u008d\f\u008d"+
		"\16\u008d\u083b\13\u008d\3\u008e\3\u008e\3\u008e\3\u008e\7\u008e\u0841"+
		"\n\u008e\f\u008e\16\u008e\u0844\13\u008e\3\u008f\3\u008f\3\u008f\3\u008f"+
		"\7\u008f\u084a\n\u008f\f\u008f\16\u008f\u084d\13\u008f\3\u0090\3\u0090"+
		"\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090"+
		"\3\u0090\3\u0090\3\u0090\5\u0090\u085d\n\u0090\3\u0091\3\u0091\3\u0091"+
		"\5\u0091\u0862\n\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\5\u0091\u086b\n\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\5\u0091\u0876\n\u0091\3\u0092\3\u0092"+
		"\3\u0092\7\u0092\u087b\n\u0092\f\u0092\16\u0092\u087e\13\u0092\3\u0093"+
		"\3\u0093\3\u0094\3\u0094\3\u0094\5\u0094\u0885\n\u0094\3\u0094\3\u0094"+
		"\3\u0095\3\u0095\3\u0095\3\u0095\3\u0096\3\u0096\5\u0096\u088f\n\u0096"+
		"\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\5\u0097\u0897\n\u0097"+
		"\3\u0098\5\u0098\u089a\n\u0098\3\u0098\3\u0098\5\u0098\u089e\n\u0098\3"+
		"\u0098\3\u0098\3\u0099\5\u0099\u08a3\n\u0099\3\u0099\3\u0099\3\u0099\3"+
		"\u0099\3\u0099\3\u0099\3\u0099\3\u0099\5\u0099\u08ad\n\u0099\3\u009a\3"+
		"\u009a\5\u009a\u08b1\n\u009a\3\u009a\3\u009a\3\u009b\3\u009b\3\u009b\3"+
		"\u009b\3\u009b\7\u009b\u08ba\n\u009b\f\u009b\16\u009b\u08bd\13\u009b\5"+
		"\u009b\u08bf\n\u009b\3\u009c\3\u009c\3\u009c\7\u009c\u08c4\n\u009c\f\u009c"+
		"\16\u009c\u08c7\13\u009c\3\u009d\3\u009d\3\u009d\3\u009d\3\u009e\3\u009e"+
		"\5\u009e\u08cf\n\u009e\3\u009f\3\u009f\3\u009f\7\u009f\u08d4\n\u009f\f"+
		"\u009f\16\u009f\u08d7\13\u009f\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a1"+
		"\3\u00a1\5\u00a1\u08df\n\u00a1\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2"+
		"\3\u00a2\3\u00a2\3\u00a2\3\u00a2\5\u00a2\u08ea\n\u00a2\3\u00a3\3\u00a3"+
		"\3\u00a3\3\u00a3\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4\7\u00a4\u08f5"+
		"\n\u00a4\f\u00a4\16\u00a4\u08f8\13\u00a4\3\u00a5\3\u00a5\3\u00a5\3\u00a5"+
		"\5\u00a5\u08fe\n\u00a5\3\u00a6\3\u00a6\3\u00a6\3\u00a7\3\u00a7\3\u00a7"+
		"\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\5\u00a7\u090b\n\u00a7\3\u00a8"+
		"\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a9\3\u00a9\3\u00a9\5\u00a9\u0915"+
		"\n\u00a9\3\u00a9\5\u00a9\u0918\n\u00a9\3\u00aa\3\u00aa\5\u00aa\u091c\n"+
		"\u00aa\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ac\3\u00ac\3\u00ac"+
		"\3\u00ac\3\u00ac\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ae\3\u00ae"+
		"\3\u00ae\7\u00ae\u0930\n\u00ae\f\u00ae\16\u00ae\u0933\13\u00ae\3\u00af"+
		"\3\u00af\3\u00af\7\u00af\u0938\n\u00af\f\u00af\16\u00af\u093b\13\u00af"+
		"\3\u00af\5\u00af\u093e\n\u00af\3\u00b0\3\u00b0\3\u00b0\7\u00b0\u0943\n"+
		"\u00b0\f\u00b0\16\u00b0\u0946\13\u00b0\3\u00b1\3\u00b1\3\u00b1\3\u00b1"+
		"\3\u00b1\3\u00b1\5\u00b1\u094e\n\u00b1\3\u00b2\3\u00b2\3\u00b3\3\u00b3"+
		"\3\u00b3\3\u00b4\3\u00b4\3\u00b4\3\u00b5\3\u00b5\3\u00b5\3\u00b6\3\u00b6"+
		"\3\u00b6\3\u00b7\3\u00b7\3\u00b7\3\u00b8\3\u00b8\3\u00b9\3\u00b9\3\u00ba"+
		"\3\u00ba\3\u00bb\3\u00bb\3\u00bc\3\u00bc\3\u00bd\3\u00bd\3\u00be\3\u00be"+
		"\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\5\u00bf\u0976"+
		"\n\u00bf\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\7\u00c0\u097d\n\u00c0"+
		"\f\u00c0\16\u00c0\u0980\13\u00c0\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1"+
		"\3\u00c1\3\u00c1\5\u00c1\u0989\n\u00c1\3\u00c2\3\u00c2\3\u00c3\3\u00c3"+
		"\3\u00c3\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\5\u00c4\u0995\n\u00c4"+
		"\3\u00c5\3\u00c5\3\u00c5\5\u00c5\u099a\n\u00c5\3\u00c5\3\u00c5\3\u00c6"+
		"\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\7\u00c6\u09a4\n\u00c6\f\u00c6"+
		"\16\u00c6\u09a7\13\u00c6\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c8\3\u00c8"+
		"\3\u00c8\3\u00c8\3\u00c9\3\u00c9\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\5\u00ca\u09b8\n\u00ca\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\5\u00cb"+
		"\u09bf\n\u00cb\3\u00cc\3\u00cc\3\u00cc\5\u00cc\u09c4\n\u00cc\3\u00cd\3"+
		"\u00cd\3\u00cd\3\u00cd\3\u00cd\7\u00cd\u09cb\n\u00cd\f\u00cd\16\u00cd"+
		"\u09ce\13\u00cd\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\5\u00ce\u09d5"+
		"\n\u00ce\3\u00cf\3\u00cf\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0"+
		"\5\u00d0\u09df\n\u00d0\3\u00d1\3\u00d1\3\u00d1\5\u00d1\u09e4\n\u00d1\3"+
		"\u00d1\3\u00d1\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\5\u00d2"+
		"\u09ee\n\u00d2\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\7\u00d3"+
		"\u09f6\n\u00d3\f\u00d3\16\u00d3\u09f9\13\u00d3\3\u00d4\3\u00d4\3\u00d4"+
		"\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\7\u00d4"+
		"\u0a06\n\u00d4\f\u00d4\16\u00d4\u0a09\13\u00d4\3\u00d5\3\u00d5\3\u00d5"+
		"\3\u00d5\3\u00d6\3\u00d6\3\u00d6\5\u00d6\u0a12\n\u00d6\3\u00d6\3\u00d6"+
		"\3\u00d6\7\u00d6\u0a17\n\u00d6\f\u00d6\16\u00d6\u0a1a\13\u00d6\3\u00d7"+
		"\3\u00d7\3\u00d7\3\u00d7\3\u00d7\5\u00d7\u0a21\n\u00d7\3\u00d8\3\u00d8"+
		"\3\u00d8\3\u00d8\3\u00d8\5\u00d8\u0a28\n\u00d8\3\u00d9\3\u00d9\3\u00d9"+
		"\3\u00d9\3\u00d9\3\u00d9\3\u00d9\5\u00d9\u0a31\n\u00d9\3\u00da\3\u00da"+
		"\3\u00da\3\u00da\3\u00da\7\u00da\u0a38\n\u00da\f\u00da\16\u00da\u0a3b"+
		"\13\u00da\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db\5\u00db\u0a42\n\u00db"+
		"\3\u00dc\3\u00dc\3\u00dd\3\u00dd\3\u00dd\3\u00de\3\u00de\3\u00de\5\u00de"+
		"\u0a4c\n\u00de\3\u00df\3\u00df\3\u00df\5\u00df\u0a51\n\u00df\3\u00df\3"+
		"\u00df\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\7\u00e0\u0a5b\n"+
		"\u00e0\f\u00e0\16\u00e0\u0a5e\13\u00e0\3\u00e1\3\u00e1\3\u00e1\3\u00e1"+
		"\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3"+
		"\3\u00e3\7\u00e3\u0a6e\n\u00e3\f\u00e3\16\u00e3\u0a71\13\u00e3\3\u00e4"+
		"\3\u00e4\3\u00e4\3\u00e4\3\u00e4\7\u00e4\u0a78\n\u00e4\f\u00e4\16\u00e4"+
		"\u0a7b\13\u00e4\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\5\u00e5\u0a82"+
		"\n\u00e5\3\u00e6\3\u00e6\3\u00e6\3\u00e6\3\u00e6\5\u00e6\u0a89\n\u00e6"+
		"\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\5\u00e7\u0a92"+
		"\n\u00e7\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8\7\u00e8\u0a99\n\u00e8"+
		"\f\u00e8\16\u00e8\u0a9c\13\u00e8\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9"+
		"\5\u00e9\u0aa3\n\u00e9\3\u00ea\3\u00ea\3\u00eb\3\u00eb\3\u00eb\3\u00ec"+
		"\3\u00ec\3\u00ec\5\u00ec\u0aad\n\u00ec\3\u00ed\3\u00ed\3\u00ed\5\u00ed"+
		"\u0ab2\n\u00ed\3\u00ed\3\u00ed\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee"+
		"\3\u00ee\7\u00ee\u0abc\n\u00ee\f\u00ee\16\u00ee\u0abf\13\u00ee\3\u00ef"+
		"\3\u00ef\3\u00ef\3\u00ef\3\u00f0\3\u00f0\3\u00f0\3\u00f0\3\u00f1\3\u00f1"+
		"\3\u00f1\5\u00f1\u0acc\n\u00f1\3\u00f1\3\u00f1\3\u00f1\7\u00f1\u0ad1\n"+
		"\u00f1\f\u00f1\16\u00f1\u0ad4\13\u00f1\3\u00f2\3\u00f2\3\u00f2\3\u00f2"+
		"\3\u00f2\5\u00f2\u0adb\n\u00f2\3\u00f3\3\u00f3\3\u00f3\3\u00f3\3\u00f3"+
		"\5\u00f3\u0ae2\n\u00f3\3\u00f4\3\u00f4\5\u00f4\u0ae6\n\u00f4\3\u00f5\3"+
		"\u00f5\3\u00f5\5\u00f5\u0aeb\n\u00f5\3\u00f5\3\u00f5\5\u00f5\u0aef\n\u00f5"+
		"\3\u00f6\3\u00f6\3\u00f6\5\u00f6\u0af4\n\u00f6\3\u00f6\3\u00f6\3\u00f6"+
		"\3\u00f7\3\u00f7\3\u00f7\5\u00f7\u0afc\n\u00f7\3\u00f8\3\u00f8\3\u00f8"+
		"\3\u00f8\3\u00f9\3\u00f9\3\u00f9\3\u00f9\7\u00f9\u0b06\n\u00f9\f\u00f9"+
		"\16\u00f9\u0b09\13\u00f9\3\u00f9\3\u00f9\3\u00f9\3\u00fa\3\u00fa\3\u00fa"+
		"\3\u00fa\7\u00fa\u0b12\n\u00fa\f\u00fa\16\u00fa\u0b15\13\u00fa\3\u00fa"+
		"\3\u00fa\3\u00fb\3\u00fb\3\u00fb\3\u00fb\3\u00fb\3\u00fc\3\u00fc\3\u00fc"+
		"\7\u00fc\u0b21\n\u00fc\f\u00fc\16\u00fc\u0b24\13\u00fc\3\u00fd\3\u00fd"+
		"\7\u00fd\u0b28\n\u00fd\f\u00fd\16\u00fd\u0b2b\13\u00fd\3\u00fe\3\u00fe"+
		"\3\u00fe\5\u00fe\u0b30\n\u00fe\3\u00fe\3\u00fe\3\u00ff\3\u00ff\3\u00ff"+
		"\5\u00ff\u0b37\n\u00ff\3\u00ff\5\u00ff\u0b3a\n\u00ff\3\u0100\6\u0100\u0b3d"+
		"\n\u0100\r\u0100\16\u0100\u0b3e\3\u0101\3\u0101\3\u0101\3\u0101\5\u0101"+
		"\u0b45\n\u0101\3\u0101\5\u0101\u0b48\n\u0101\3\u0102\6\u0102\u0b4b\n\u0102"+
		"\r\u0102\16\u0102\u0b4c\3\u0103\3\u0103\5\u0103\u0b51\n\u0103\3\u0104"+
		"\3\u0104\6\u0104\u0b55\n\u0104\r\u0104\16\u0104\u0b56\3\u0104\3\u0104"+
		"\3\u0105\3\u0105\3\u0105\6\u0105\u0b5e\n\u0105\r\u0105\16\u0105\u0b5f"+
		"\3\u0105\3\u0105\3\u0106\3\u0106\3\u0106\3\u0106\5\u0106\u0b68\n\u0106"+
		"\3\u0106\3\u0106\6\u0106\u0b6c\n\u0106\r\u0106\16\u0106\u0b6d\7\u0106"+
		"\u0b70\n\u0106\f\u0106\16\u0106\u0b73\13\u0106\3\u0107\3\u0107\3\u0107"+
		"\3\u0107\3\u0107\5\u0107\u0b7a\n\u0107\3\u0108\6\u0108\u0b7d\n\u0108\r"+
		"\u0108\16\u0108\u0b7e\3\u0108\2\32\24(Pbln\u008a\u00c0\u00f2\u0146\u017e"+
		"\u018a\u0198\u01a4\u01a6\u01aa\u01b2\u01be\u01c4\u01c6\u01ce\u01da\u01e0"+
		"\u020a\u0109\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
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
		"\u020a\u020c\u020e\2\20\3\2\36\37\3\2%(\3\2,.\3\2\4\5\5\2pp\u0091\u0091"+
		"\u00ab\u00ab\7\2XX||\u008c\u008c\u0094\u0094\u00ab\u00ab\5\2XX\u008c\u008c"+
		"\u00ab\u00ab\5\2\u008c\u008c\u0094\u0094\u00ab\u00ab\4\2\u0090\u0090\u009a"+
		"\u009a\4\2OO__\n\2\7\f\63\63\65=?GIsuuw\u0098\u009a\u00a4\4\2##{{\5\2"+
		"\26\27%%\'\'\4\2\16\16\26\27\2\u0c3e\2\u0210\3\2\2\2\4\u0221\3\2\2\2\6"+
		"\u022a\3\2\2\2\b\u0230\3\2\2\2\n\u0236\3\2\2\2\f\u024b\3\2\2\2\16\u0253"+
		"\3\2\2\2\20\u025c\3\2\2\2\22\u026c\3\2\2\2\24\u0276\3\2\2\2\26\u0287\3"+
		"\2\2\2\30\u028a\3\2\2\2\32\u0297\3\2\2\2\34\u02a0\3\2\2\2\36\u02aa\3\2"+
		"\2\2 \u02b3\3\2\2\2\"\u02be\3\2\2\2$\u02d1\3\2\2\2&\u02e3\3\2\2\2(\u02e9"+
		"\3\2\2\2*\u02f6\3\2\2\2,\u0306\3\2\2\2.\u031a\3\2\2\2\60\u032a\3\2\2\2"+
		"\62\u033a\3\2\2\2\64\u034c\3\2\2\2\66\u034f\3\2\2\28\u0362\3\2\2\2:\u0379"+
		"\3\2\2\2<\u037b\3\2\2\2>\u0391\3\2\2\2@\u03a3\3\2\2\2B\u03a9\3\2\2\2D"+
		"\u03af\3\2\2\2F\u03c9\3\2\2\2H\u03cb\3\2\2\2J\u03d8\3\2\2\2L\u03e4\3\2"+
		"\2\2N\u03ea\3\2\2\2P\u03f6\3\2\2\2R\u040b\3\2\2\2T\u040f\3\2\2\2V\u0443"+
		"\3\2\2\2X\u0445\3\2\2\2Z\u0448\3\2\2\2\\\u044e\3\2\2\2^\u0458\3\2\2\2"+
		"`\u0467\3\2\2\2b\u0486\3\2\2\2d\u04f5\3\2\2\2f\u04f7\3\2\2\2h\u04fb\3"+
		"\2\2\2j\u0503\3\2\2\2l\u0505\3\2\2\2n\u050f\3\2\2\2p\u0524\3\2\2\2r\u0526"+
		"\3\2\2\2t\u052b\3\2\2\2v\u0534\3\2\2\2x\u053e\3\2\2\2z\u058e\3\2\2\2|"+
		"\u05d3\3\2\2\2~\u05d5\3\2\2\2\u0080\u05dc\3\2\2\2\u0082\u05e2\3\2\2\2"+
		"\u0084\u05fd\3\2\2\2\u0086\u060f\3\2\2\2\u0088\u0611\3\2\2\2\u008a\u061b"+
		"\3\2\2\2\u008c\u0625\3\2\2\2\u008e\u062b\3\2\2\2\u0090\u0636\3\2\2\2\u0092"+
		"\u0638\3\2\2\2\u0094\u063d\3\2\2\2\u0096\u063f\3\2\2\2\u0098\u0644\3\2"+
		"\2\2\u009a\u064a\3\2\2\2\u009c\u064c\3\2\2\2\u009e\u0653\3\2\2\2\u00a0"+
		"\u0661\3\2\2\2\u00a2\u0674\3\2\2\2\u00a4\u0685\3\2\2\2\u00a6\u0687\3\2"+
		"\2\2\u00a8\u068b\3\2\2\2\u00aa\u068f\3\2\2\2\u00ac\u0691\3\2\2\2\u00ae"+
		"\u0695\3\2\2\2\u00b0\u0697\3\2\2\2\u00b2\u06a0\3\2\2\2\u00b4\u06a9\3\2"+
		"\2\2\u00b6\u06bb\3\2\2\2\u00b8\u06be\3\2\2\2\u00ba\u06c7\3\2\2\2\u00bc"+
		"\u06cf\3\2\2\2\u00be\u06d7\3\2\2\2\u00c0\u06ee\3\2\2\2\u00c2\u06fe\3\2"+
		"\2\2\u00c4\u0712\3\2\2\2\u00c6\u0714\3\2\2\2\u00c8\u0717\3\2\2\2\u00ca"+
		"\u071b\3\2\2\2\u00cc\u0720\3\2\2\2\u00ce\u0724\3\2\2\2\u00d0\u0726\3\2"+
		"\2\2\u00d2\u0730\3\2\2\2\u00d4\u0734\3\2\2\2\u00d6\u0736\3\2\2\2\u00d8"+
		"\u073a\3\2\2\2\u00da\u0740\3\2\2\2\u00dc\u0742\3\2\2\2\u00de\u0744\3\2"+
		"\2\2\u00e0\u0746\3\2\2\2\u00e2\u0748\3\2\2\2\u00e4\u074a\3\2\2\2\u00e6"+
		"\u074c\3\2\2\2\u00e8\u0759\3\2\2\2\u00ea\u075d\3\2\2\2\u00ec\u075f\3\2"+
		"\2\2\u00ee\u0764\3\2\2\2\u00f0\u0769\3\2\2\2\u00f2\u076b\3\2\2\2\u00f4"+
		"\u0779\3\2\2\2\u00f6\u0787\3\2\2\2\u00f8\u0799\3\2\2\2\u00fa\u07a7\3\2"+
		"\2\2\u00fc\u07c1\3\2\2\2\u00fe\u07c3\3\2\2\2\u0100\u07c7\3\2\2\2\u0102"+
		"\u07d2\3\2\2\2\u0104\u07dd\3\2\2\2\u0106\u07ef\3\2\2\2\u0108\u07f7\3\2"+
		"\2\2\u010a\u0803\3\2\2\2\u010c\u0805\3\2\2\2\u010e\u0807\3\2\2\2\u0110"+
		"\u081a\3\2\2\2\u0112\u081c\3\2\2\2\u0114\u0823\3\2\2\2\u0116\u082a\3\2"+
		"\2\2\u0118\u0833\3\2\2\2\u011a\u083c\3\2\2\2\u011c\u0845\3\2\2\2\u011e"+
		"\u085c\3\2\2\2\u0120\u0875\3\2\2\2\u0122\u0877\3\2\2\2\u0124\u087f\3\2"+
		"\2\2\u0126\u0884\3\2\2\2\u0128\u0888\3\2\2\2\u012a\u088e\3\2\2\2\u012c"+
		"\u0896\3\2\2\2\u012e\u0899\3\2\2\2\u0130\u08a2\3\2\2\2\u0132\u08ae\3\2"+
		"\2\2\u0134\u08b4\3\2\2\2\u0136\u08c0\3\2\2\2\u0138\u08c8\3\2\2\2\u013a"+
		"\u08ce\3\2\2\2\u013c\u08d0\3\2\2\2\u013e\u08d8\3\2\2\2\u0140\u08de\3\2"+
		"\2\2\u0142\u08e9\3\2\2\2\u0144\u08eb\3\2\2\2\u0146\u08ef\3\2\2\2\u0148"+
		"\u08fd\3\2\2\2\u014a\u08ff\3\2\2\2\u014c\u090a\3\2\2\2\u014e\u090c\3\2"+
		"\2\2\u0150\u0917\3\2\2\2\u0152\u091b\3\2\2\2\u0154\u091d\3\2\2\2\u0156"+
		"\u0922\3\2\2\2\u0158\u0927\3\2\2\2\u015a\u092c\3\2\2\2\u015c\u0934\3\2"+
		"\2\2\u015e\u093f\3\2\2\2\u0160\u094d\3\2\2\2\u0162\u094f\3\2\2\2\u0164"+
		"\u0951\3\2\2\2\u0166\u0954\3\2\2\2\u0168\u0957\3\2\2\2\u016a\u095a\3\2"+
		"\2\2\u016c\u095d\3\2\2\2\u016e\u0960\3\2\2\2\u0170\u0962\3\2\2\2\u0172"+
		"\u0964\3\2\2\2\u0174\u0966\3\2\2\2\u0176\u0968\3\2\2\2\u0178\u096a\3\2"+
		"\2\2\u017a\u096c\3\2\2\2\u017c\u0975\3\2\2\2\u017e\u0977\3\2\2\2\u0180"+
		"\u0988\3\2\2\2\u0182\u098a\3\2\2\2\u0184\u098c\3\2\2\2\u0186\u0994\3\2"+
		"\2\2\u0188\u0996\3\2\2\2\u018a\u099d\3\2\2\2\u018c\u09a8\3\2\2\2\u018e"+
		"\u09ac\3\2\2\2\u0190\u09b0\3\2\2\2\u0192\u09b7\3\2\2\2\u0194\u09be\3\2"+
		"\2\2\u0196\u09c3\3\2\2\2\u0198\u09c5\3\2\2\2\u019a\u09d4\3\2\2\2\u019c"+
		"\u09d6\3\2\2\2\u019e\u09de\3\2\2\2\u01a0\u09e0\3\2\2\2\u01a2\u09ed\3\2"+
		"\2\2\u01a4\u09ef\3\2\2\2\u01a6\u09fa\3\2\2\2\u01a8\u0a0a\3\2\2\2\u01aa"+
		"\u0a11\3\2\2\2\u01ac\u0a20\3\2\2\2\u01ae\u0a27\3\2\2\2\u01b0\u0a30\3\2"+
		"\2\2\u01b2\u0a32\3\2\2\2\u01b4\u0a41\3\2\2\2\u01b6\u0a43\3\2\2\2\u01b8"+
		"\u0a45\3\2\2\2\u01ba\u0a4b\3\2\2\2\u01bc\u0a4d\3\2\2\2\u01be\u0a54\3\2"+
		"\2\2\u01c0\u0a5f\3\2\2\2\u01c2\u0a63\3\2\2\2\u01c4\u0a67\3\2\2\2\u01c6"+
		"\u0a72\3\2\2\2\u01c8\u0a81\3\2\2\2\u01ca\u0a88\3\2\2\2\u01cc\u0a91\3\2"+
		"\2\2\u01ce\u0a93\3\2\2\2\u01d0\u0aa2\3\2\2\2\u01d2\u0aa4\3\2\2\2\u01d4"+
		"\u0aa6\3\2\2\2\u01d6\u0aac\3\2\2\2\u01d8\u0aae\3\2\2\2\u01da\u0ab5\3\2"+
		"\2\2\u01dc\u0ac0\3\2\2\2\u01de\u0ac4\3\2\2\2\u01e0\u0acb\3\2\2\2\u01e2"+
		"\u0ada\3\2\2\2\u01e4\u0ae1\3\2\2\2\u01e6\u0ae5\3\2\2\2\u01e8\u0aee\3\2"+
		"\2\2\u01ea\u0af0\3\2\2\2\u01ec\u0afb\3\2\2\2\u01ee\u0afd\3\2\2\2\u01f0"+
		"\u0b01\3\2\2\2\u01f2\u0b0d\3\2\2\2\u01f4\u0b18\3\2\2\2\u01f6\u0b1d\3\2"+
		"\2\2\u01f8\u0b25\3\2\2\2\u01fa\u0b2c\3\2\2\2\u01fc\u0b39\3\2\2\2\u01fe"+
		"\u0b3c\3\2\2\2\u0200\u0b47\3\2\2\2\u0202\u0b4a\3\2\2\2\u0204\u0b50\3\2"+
		"\2\2\u0206\u0b52\3\2\2\2\u0208\u0b5a\3\2\2\2\u020a\u0b67\3\2\2\2\u020c"+
		"\u0b79\3\2\2\2\u020e\u0b7c\3\2\2\2\u0210\u0211\7e\2\2\u0211\u0212\7X\2"+
		"\2\u0212\u0217\5\u00e2r\2\u0213\u0214\7\22\2\2\u0214\u0215\5\u0108\u0085"+
		"\2\u0215\u0216\7\23\2\2\u0216\u0218\3\2\2\2\u0217\u0213\3\2\2\2\u0217"+
		"\u0218\3\2\2\2\u0218\u021b\3\2\2\2\u0219\u021a\7i\2\2\u021a\u021c\5\u00e2"+
		"r\2\u021b\u0219\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021d\3\2\2\2\u021d"+
		"\u021e\7\26\2\2\u021e\u021f\5\u00b2Z\2\u021f\u0220\7\27\2\2\u0220\3\3"+
		"\2\2\2\u0221\u0222\7e\2\2\u0222\u0223\5\u00e2r\2\u0223\u0224\7\22\2\2"+
		"\u0224\u0225\5\u00c4c\2\u0225\u0226\7\23\2\2\u0226\u0227\7\26\2\2\u0227"+
		"\u0228\5\u00b0Y\2\u0228\u0229\7\27\2\2\u0229\5\3\2\2\2\u022a\u022b\5\u00e4"+
		"s\2\u022b\u022c\7\22\2\2\u022c\u022d\5\u008aF\2\u022d\u022e\7\23\2\2\u022e"+
		"\u022f\7\16\2\2\u022f\7\3\2\2\2\u0230\u0231\5\u00e4s\2\u0231\u0232\7+"+
		"\2\2\u0232\u0233\5b\62\2\u0233\u0234\7\16\2\2\u0234\t\3\2\2\2\u0235\u0237"+
		"\7\u0094\2\2\u0236\u0235\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u0238\3\2\2"+
		"\2\u0238\u0239\7Q\2\2\u0239\u023a\5\u00e0q\2\u023a\u023b\7\r\2\2\u023b"+
		"\u023d\5\u00c0a\2\u023c\u023e\5\u00b6\\\2\u023d\u023c\3\2\2\2\u023d\u023e"+
		"\3\2\2\2\u023e\u0247\3\2\2\2\u023f\u0240\7\u00a0\2\2\u0240\u0245\7u\2"+
		"\2\u0241\u0242\7\22\2\2\u0242\u0243\5\u0106\u0084\2\u0243\u0244\7\23\2"+
		"\2\u0244\u0246\3\2\2\2\u0245\u0241\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0248"+
		"\3\2\2\2\u0247\u023f\3\2\2\2\u0247\u0248\3\2\2\2\u0248\u0249\3\2\2\2\u0249"+
		"\u024a\7\16\2\2\u024a\13\3\2\2\2\u024b\u024c\7\u009f\2\2\u024c\u024f\5"+
		"\u00e2r\2\u024d\u024e\7i\2\2\u024e\u0250\5\u00e2r\2\u024f\u024d\3\2\2"+
		"\2\u024f\u0250\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0252\5\26\f\2\u0252"+
		"\r\3\2\2\2\u0253\u0254\7}\2\2\u0254\u0255\7\u009f\2\2\u0255\u0256\5\u00e2"+
		"r\2\u0256\u0257\7\26\2\2\u0257\u0258\5&\24\2\u0258\u0259\5\u00f8}\2\u0259"+
		"\u025a\7\27\2\2\u025a\17\3\2\2\2\u025b\u025d\7\u0094\2\2\u025c\u025b\3"+
		"\2\2\2\u025c\u025d\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u025f\7X\2\2\u025f"+
		"\u0264\5\u00e2r\2\u0260\u0261\7\22\2\2\u0261\u0262\5\u0108\u0085\2\u0262"+
		"\u0263\7\23\2\2\u0263\u0265\3\2\2\2\u0264\u0260\3\2\2\2\u0264\u0265\3"+
		"\2\2\2\u0265\u0268\3\2\2\2\u0266\u0267\7i\2\2\u0267\u0269\5\24\13\2\u0268"+
		"\u0266\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u026b\5\26"+
		"\f\2\u026b\21\3\2\2\2\u026c\u026d\7\u0092\2\2\u026d\u0272\5\u00e2r\2\u026e"+
		"\u026f\7\22\2\2\u026f\u0270\5\u0108\u0085\2\u0270\u0271\7\23\2\2\u0271"+
		"\u0273\3\2\2\2\u0272\u026e\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0274\3\2"+
		"\2\2\u0274\u0275\5\26\f\2\u0275\23\3\2\2\2\u0276\u0277\b\13\1\2\u0277"+
		"\u0278\5\u00e2r\2\u0278\u027e\3\2\2\2\u0279\u027a\f\3\2\2\u027a\u027b"+
		"\7\17\2\2\u027b\u027d\5\u00e2r\2\u027c\u0279\3\2\2\2\u027d\u0280\3\2\2"+
		"\2\u027e\u027c\3\2\2\2\u027e\u027f\3\2\2\2\u027f\25\3\2\2\2\u0280\u027e"+
		"\3\2\2\2\u0281\u0288\7\16\2\2\u0282\u0284\7\26\2\2\u0283\u0285\5\u00f4"+
		"{\2\u0284\u0283\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0286\3\2\2\2\u0286"+
		"\u0288\7\27\2\2\u0287\u0281\3\2\2\2\u0287\u0282\3\2\2\2\u0288\27\3\2\2"+
		"\2\u0289\u028b\5\u00c0a\2\u028a\u0289\3\2\2\2\u028a\u028b\3\2\2\2\u028b"+
		"\u028c\3\2\2\2\u028c\u028d\7\u0084\2\2\u028d\u028e\5\u0160\u00b1\2\u028e"+
		"\u028f\7\22\2\2\u028f\u0290\5\u00eav\2\u0290\u0291\7\23\2\2\u0291\u0293"+
		"\7\26\2\2\u0292\u0294\5\u0116\u008c\2\u0293\u0292\3\2\2\2\u0293\u0294"+
		"\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0296\7\27\2\2\u0296\31\3\2\2\2\u0297"+
		"\u0298\7\u0091\2\2\u0298\u0299\5\u00dep\2\u0299\u029b\7\26\2\2\u029a\u029c"+
		"\5\u0116\u008c\2\u029b\u029a\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u029d\3"+
		"\2\2\2\u029d\u029e\7\27\2\2\u029e\33\3\2\2\2\u029f\u02a1\7}\2\2\u02a0"+
		"\u029f\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a3\7\u0091"+
		"\2\2\u02a3\u02a4\5\u00dep\2\u02a4\u02a6\7\26\2\2\u02a5\u02a7\5\u010e\u0088"+
		"\2\u02a6\u02a5\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8\u02a9"+
		"\7\27\2\2\u02a9\35\3\2\2\2\u02aa\u02ab\7p\2\2\u02ab\u02ac\5\u00dep\2\u02ac"+
		"\u02ae\7\26\2\2\u02ad\u02af\5\u0116\u008c\2\u02ae\u02ad\3\2\2\2\u02ae"+
		"\u02af\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0\u02b1\7\27\2\2\u02b1\37\3\2\2"+
		"\2\u02b2\u02b4\7}\2\2\u02b3\u02b2\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4\u02b5"+
		"\3\2\2\2\u02b5\u02b6\7p\2\2\u02b6\u02b7\5\u00dep\2\u02b7\u02b9\7\26\2"+
		"\2\u02b8\u02ba\5\u010e\u0088\2\u02b9\u02b8\3\2\2\2\u02b9\u02ba\3\2\2\2"+
		"\u02ba\u02bb\3\2\2\2\u02bb\u02bc\7\27\2\2\u02bc!\3\2\2\2\u02bd\u02bf\7"+
		"\u0094\2\2\u02be\u02bd\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf\u02c0\3\2\2\2"+
		"\u02c0\u02c1\7}\2\2\u02c1\u02c2\7\u008c\2\2\u02c2\u02c7\5\u00e2r\2\u02c3"+
		"\u02c4\7\22\2\2\u02c4\u02c5\5\u0108\u0085\2\u02c5\u02c6\7\23\2\2\u02c6"+
		"\u02c8\3\2\2\2\u02c7\u02c3\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8\u02c9\3\2"+
		"\2\2\u02c9\u02ca\7\26\2\2\u02ca\u02cc\5&\24\2\u02cb\u02cd\5\u00f8}\2\u02cc"+
		"\u02cb\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce\u02cf\7\27"+
		"\2\2\u02cf#\3\2\2\2\u02d0\u02d2\7\u0094\2\2\u02d1\u02d0\3\2\2\2\u02d1"+
		"\u02d2\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3\u02d4\7}\2\2\u02d4\u02d5\7X\2"+
		"\2\u02d5\u02da\5\u00e2r\2\u02d6\u02d7\7\22\2\2\u02d7\u02d8\5\u0108\u0085"+
		"\2\u02d8\u02d9\7\23\2\2\u02d9\u02db\3\2\2\2\u02da\u02d6\3\2\2\2\u02da"+
		"\u02db\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc\u02dd\7\26\2\2\u02dd\u02df\5"+
		"&\24\2\u02de\u02e0\5\u00f8}\2\u02df\u02de\3\2\2\2\u02df\u02e0\3\2\2\2"+
		"\u02e0\u02e1\3\2\2\2\u02e1\u02e2\7\27\2\2\u02e2%\3\2\2\2\u02e3\u02e4\7"+
		"X\2\2\u02e4\u02e5\7S\2\2\u02e5\u02e6\7\26\2\2\u02e6\u02e7\5(\25\2\u02e7"+
		"\u02e8\7\27\2\2\u02e8\'\3\2\2\2\u02e9\u02ea\b\25\1\2\u02ea\u02eb\5\u00fc"+
		"\177\2\u02eb\u02ec\7\16\2\2\u02ec\u02f3\3\2\2\2\u02ed\u02ee\f\3\2\2\u02ee"+
		"\u02ef\5\u00fc\177\2\u02ef\u02f0\7\16\2\2\u02f0\u02f2\3\2\2\2\u02f1\u02ed"+
		"\3\2\2\2\u02f2\u02f5\3\2\2\2\u02f3\u02f1\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4"+
		")\3\2\2\2\u02f5\u02f3\3\2\2\2\u02f6\u02fb\7I\2\2\u02f7\u02f9\7|\2\2\u02f8"+
		"\u02f7\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa\u02fc\5\u00c0"+
		"a\2\u02fb\u02f8\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd"+
		"\u02fe\7y\2\2\u02fe\u02ff\5\u00e2r\2\u02ff\u0301\7\22\2\2\u0300\u0302"+
		"\5\u00e6t\2\u0301\u0300\3\2\2\2\u0301\u0302\3\2\2\2\u0302\u0303\3\2\2"+
		"\2\u0303\u0304\7\23\2\2\u0304\u0305\7\16\2\2\u0305+\3\2\2\2\u0306\u030b"+
		"\7I\2\2\u0307\u0309\7|\2\2\u0308\u0307\3\2\2\2\u0308\u0309\3\2\2\2\u0309"+
		"\u030a\3\2\2\2\u030a\u030c\5\u00c0a\2\u030b\u0308\3\2\2\2\u030b\u030c"+
		"\3\2\2\2\u030c\u030d\3\2\2\2\u030d\u030e\7y\2\2\u030e\u030f\5\u00d2j\2"+
		"\u030f\u0311\7\22\2\2\u0310\u0312\5\u00e6t\2\u0311\u0310\3\2\2\2\u0311"+
		"\u0312\3\2\2\2\u0312\u0313\3\2\2\2\u0313\u0314\7\23\2\2\u0314\u0315\7"+
		"\16\2\2\u0315-\3\2\2\2\u0316\u0318\7|\2\2\u0317\u0316\3\2\2\2\u0317\u0318"+
		"\3\2\2\2\u0318\u0319\3\2\2\2\u0319\u031b\5\u00c0a\2\u031a\u0317\3\2\2"+
		"\2\u031a\u031b\3\2\2\2\u031b\u031c\3\2\2\2\u031c\u031d\7y\2\2\u031d\u031e"+
		"\5\u00d2j\2\u031e\u0320\7\22\2\2\u031f\u0321\5\u00e6t\2\u0320\u031f\3"+
		"\2\2\2\u0320\u0321\3\2\2\2\u0321\u0322\3\2\2\2\u0322\u0323\7\23\2\2\u0323"+
		"\u0325\7\26\2\2\u0324\u0326\5\u0116\u008c\2\u0325\u0324\3\2\2\2\u0325"+
		"\u0326\3\2\2\2\u0326\u0327\3\2\2\2\u0327\u0328\7\27\2\2\u0328/\3\2\2\2"+
		"\u0329\u032b\5\u00f0y\2\u032a\u0329\3\2\2\2\u032a\u032b\3\2\2\2\u032b"+
		"\u032d\3\2\2\2\u032c\u032e\7}\2\2\u032d\u032c\3\2\2\2\u032d\u032e\3\2"+
		"\2\2\u032e\u032f\3\2\2\2\u032f\u0330\7y\2\2\u0330\u0331\5\u00d2j\2\u0331"+
		"\u0333\7\22\2\2\u0332\u0334\5\u00e6t\2\u0333\u0332\3\2\2\2\u0333\u0334"+
		"\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u0336\7\23\2\2\u0336\u0337\7\26\2\2"+
		"\u0337\u0338\5\u010e\u0088\2\u0338\u0339\7\27\2\2\u0339\61\3\2\2\2\u033a"+
		"\u033b\7\u0098\2\2\u033b\u033c\7y\2\2\u033c\u033d\7\u00af\2\2\u033d\u033e"+
		"\7\22\2\2\u033e\u033f\7\23\2\2\u033f\u0340\7\26\2\2\u0340\u0341\5\u0116"+
		"\u008c\2\u0341\u0342\7\27\2\2\u0342\u034a\7\u009e\2\2\u0343\u0344\7\26"+
		"\2\2\u0344\u0345\5\u0118\u008d\2\u0345\u0346\7\27\2\2\u0346\u034b\3\2"+
		"\2\2\u0347\u0348\5\u00e4s\2\u0348\u0349\7\16\2\2\u0349\u034b\3\2\2\2\u034a"+
		"\u0343\3\2\2\2\u034a\u0347\3\2\2\2\u034b\63\3\2\2\2\u034c\u034d\5b\62"+
		"\2\u034d\u034e\7\16\2\2\u034e\65\3\2\2\2\u034f\u0354\5\u00f0y\2\u0350"+
		"\u0351\7\22\2\2\u0351\u0352\5\u0108\u0085\2\u0352\u0353\7\23\2\2\u0353"+
		"\u0355\3\2\2\2\u0354\u0350\3\2\2\2\u0354\u0355\3\2\2\2\u0355\u0356\3\2"+
		"\2\2\u0356\u0359\5\u00dep\2\u0357\u0358\7+\2\2\u0358\u035a\5\u012a\u0096"+
		"\2\u0359\u0357\3\2\2\2\u0359\u035a\3\2\2\2\u035a\67\3\2\2\2\u035b\u0363"+
		"\5:\36\2\u035c\u0360\7\26\2\2\u035d\u035e\5\u0116\u008c\2\u035e\u035f"+
		"\7\27\2\2\u035f\u0361\3\2\2\2\u0360\u035d\3\2\2\2\u0360\u0361\3\2\2\2"+
		"\u0361\u0363\3\2\2\2\u0362\u035b\3\2\2\2\u0362\u035c\3\2\2\2\u03639\3"+
		"\2\2\2\u0364\u037a\5^\60\2\u0365\u037a\5\u008eH\2\u0366\u037a\5\u0092"+
		"J\2\u0367\u037a\5> \2\u0368\u037a\5|?\2\u0369\u037a\5\u0080A\2\u036a\u037a"+
		"\5<\37\2\u036b\u037a\5X-\2\u036c\u037a\5Z.\2\u036d\u037a\5N(\2\u036e\u037a"+
		"\5D#\2\u036f\u037a\5H%\2\u0370\u037a\5L\'\2\u0371\u037a\5J&\2\u0372\u037a"+
		"\5T+\2\u0373\u037a\5R*\2\u0374\u037a\5v<\2\u0375\u037a\5@!\2\u0376\u037a"+
		"\5B\"\2\u0377\u037a\5.\30\2\u0378\u037a\5\u010c\u0087\2\u0379\u0364\3"+
		"\2\2\2\u0379\u0365\3\2\2\2\u0379\u0366\3\2\2\2\u0379\u0367\3\2\2\2\u0379"+
		"\u0368\3\2\2\2\u0379\u0369\3\2\2\2\u0379\u036a\3\2\2\2\u0379\u036b\3\2"+
		"\2\2\u0379\u036c\3\2\2\2\u0379\u036d\3\2\2\2\u0379\u036e\3\2\2\2\u0379"+
		"\u036f\3\2\2\2\u0379\u0370\3\2\2\2\u0379\u0371\3\2\2\2\u0379\u0372\3\2"+
		"\2\2\u0379\u0373\3\2\2\2\u0379\u0374\3\2\2\2\u0379\u0375\3\2\2\2\u0379"+
		"\u0376\3\2\2\2\u0379\u0377\3\2\2\2\u0379\u0378\3\2\2\2\u037a;\3\2\2\2"+
		"\u037b\u037c\7m\2\2\u037c\u037d\7\22\2\2\u037d\u037e\7\23\2\2\u037e\u037f"+
		"\7\16\2\2\u037f=\3\2\2\2\u0380\u0381\7^\2\2\u0381\u0382\7\22\2\2\u0382"+
		"\u0383\5\u00bc_\2\u0383\u038a\7\23\2\2\u0384\u0385\7L\2\2\u0385\u0386"+
		"\7\u0095\2\2\u0386\u0387\7\22\2\2\u0387\u0388\5\u00bc_\2\u0388\u0389\7"+
		"\23\2\2\u0389\u038b\3\2\2\2\u038a\u0384\3\2\2\2\u038a\u038b\3\2\2\2\u038b"+
		"\u0392\3\2\2\2\u038c\u038d\7\u0095\2\2\u038d\u038e\7\22\2\2\u038e\u038f"+
		"\5\u00bc_\2\u038f\u0390\7\23\2\2\u0390\u0392\3\2\2\2\u0391\u0380\3\2\2"+
		"\2\u0391\u038c\3\2\2\2\u0392\u0399\3\2\2\2\u0393\u0394\7\u00a0\2\2\u0394"+
		"\u0395\5\u014a\u00a6\2\u0395\u0396\7\22\2\2\u0396\u0397\5b\62\2\u0397"+
		"\u0398\7\23\2\2\u0398\u039a\3\2\2\2\u0399\u0393\3\2\2\2\u0399\u039a\3"+
		"\2\2\2\u039a\u03a1\3\2\2\2\u039b\u039c\7\u0099\2\2\u039c\u039d\7\26\2"+
		"\2\u039d\u039e\5\u0116\u008c\2\u039e\u039f\7\27\2\2\u039f\u03a2\3\2\2"+
		"\2\u03a0\u03a2\7\16\2\2\u03a1\u039b\3\2\2\2\u03a1\u03a0\3\2\2\2\u03a2"+
		"?\3\2\2\2\u03a3\u03a4\7\u00a0\2\2\u03a4\u03a5\7\22\2\2\u03a5\u03a6\5\u0144"+
		"\u00a3\2\u03a6\u03a7\7\23\2\2\u03a7\u03a8\58\35\2\u03a8A\3\2\2\2\u03a9"+
		"\u03aa\7\u00a0\2\2\u03aa\u03ab\7\22\2\2\u03ab\u03ac\5\u00e2r\2\u03ac\u03ad"+
		"\7\23\2\2\u03ad\u03ae\58\35\2\u03aeC\3\2\2\2\u03af\u03b0\7\u0097\2\2\u03b0"+
		"\u03b1\7\22\2\2\u03b1\u03b2\5b\62\2\u03b2\u03b3\7\23\2\2\u03b3\u03b4\7"+
		"\26\2\2\u03b4\u03ba\5\u011a\u008e\2\u03b5\u03b6\7\\\2\2\u03b6\u03b8\7"+
		"\r\2\2\u03b7\u03b9\5\u0116\u008c\2\u03b8\u03b7\3\2\2\2\u03b8\u03b9\3\2"+
		"\2\2\u03b9\u03bb\3\2\2\2\u03ba\u03b5\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb"+
		"\u03bc\3\2\2\2\u03bc\u03bd\7\27\2\2\u03bdE\3\2\2\2\u03be\u03bf\7V\2\2"+
		"\u03bf\u03c0\5\u0120\u0091\2\u03c0\u03c1\7\r\2\2\u03c1\u03c2\5\u0116\u008c"+
		"\2\u03c2\u03ca\3\2\2\2\u03c3\u03c4\7V\2\2\u03c4\u03c5\7s\2\2\u03c5\u03c6"+
		"\5\u011e\u0090\2\u03c6\u03c7\7\r\2\2\u03c7\u03c8\5\u0116\u008c\2\u03c8"+
		"\u03ca\3\2\2\2\u03c9\u03be\3\2\2\2\u03c9\u03c3\3\2\2\2\u03caG\3\2\2\2"+
		"\u03cb\u03cc\7n\2\2\u03cc\u03cd\7b\2\2\u03cd\u03ce\7\22\2\2\u03ce\u03d1"+
		"\5\u00dep\2\u03cf\u03d0\7\17\2\2\u03d0\u03d2\5\u00dep\2\u03d1\u03cf\3"+
		"\2\2\2\u03d1\u03d2\3\2\2\2\u03d2\u03d3\3\2\2\2\u03d3\u03d4\7s\2\2\u03d4"+
		"\u03d5\5b\62\2\u03d5\u03d6\7\23\2\2\u03d6\u03d7\58\35\2\u03d7I\3\2\2\2"+
		"\u03d8\u03d9\7`\2\2\u03d9\u03db\7\26\2\2\u03da\u03dc\5\u0116\u008c\2\u03db"+
		"\u03da\3\2\2\2\u03db\u03dc\3\2\2\2\u03dc\u03dd\3\2\2\2\u03dd\u03de\7\27"+
		"\2\2\u03de\u03df\7\u00a3\2\2\u03df\u03e0\7\22\2\2\u03e0\u03e1\5b\62\2"+
		"\u03e1\u03e2\7\23\2\2\u03e2\u03e3\7\16\2\2\u03e3K\3\2\2\2\u03e4\u03e5"+
		"\7\u00a3\2\2\u03e5\u03e6\7\22\2\2\u03e6\u03e7\5b\62\2\u03e7\u03e8\7\23"+
		"\2\2\u03e8\u03e9\58\35\2\u03e9M\3\2\2\2\u03ea\u03eb\7r\2\2\u03eb\u03ec"+
		"\7\22\2\2\u03ec\u03ed\5b\62\2\u03ed\u03ee\7\23\2\2\u03ee\u03f0\58\35\2"+
		"\u03ef\u03f1\5P)\2\u03f0\u03ef\3\2\2\2\u03f0\u03f1\3\2\2\2\u03f1\u03f4"+
		"\3\2\2\2\u03f2\u03f3\7c\2\2\u03f3\u03f5\58\35\2\u03f4\u03f2\3\2\2\2\u03f4"+
		"\u03f5\3\2\2\2\u03f5O\3\2\2\2\u03f6\u03f7\b)\1\2\u03f7\u03f8\7c\2\2\u03f8"+
		"\u03f9\7r\2\2\u03f9\u03fa\7\22\2\2\u03fa\u03fb\5b\62\2\u03fb\u03fc\7\23"+
		"\2\2\u03fc\u03fd\58\35\2\u03fd\u0408\3\2\2\2\u03fe\u03ff\f\3\2\2\u03ff"+
		"\u0400\7c\2\2\u0400\u0401\7r\2\2\u0401\u0402\7\22\2\2\u0402\u0403\5b\62"+
		"\2\u0403\u0404\7\23\2\2\u0404\u0405\58\35\2\u0405\u0407\3\2\2\2\u0406"+
		"\u03fe\3\2\2\2\u0407\u040a\3\2\2\2\u0408\u0406\3\2\2\2\u0408\u0409\3\2"+
		"\2\2\u0409Q\3\2\2\2\u040a\u0408\3\2\2\2\u040b\u040c\7\u009b\2\2\u040c"+
		"\u040d\5b\62\2\u040d\u040e\7\16\2\2\u040eS\3\2\2\2\u040f\u0410\7\u009d"+
		"\2\2\u0410\u0411\7\22\2\2\u0411\u0412\5\u00dep\2\u0412\u0413\7\23\2\2"+
		"\u0413\u0415\7\26\2\2\u0414\u0416\5\u0116\u008c\2\u0415\u0414\3\2\2\2"+
		"\u0415\u0416\3\2\2\2\u0416\u0417\3\2\2\2\u0417\u0419\7\27\2\2\u0418\u041a"+
		"\5\u011c\u008f\2\u0419\u0418\3\2\2\2\u0419\u041a\3\2\2\2\u041a\u0424\3"+
		"\2\2\2\u041b\u041c\7W\2\2\u041c\u041d\7\22\2\2\u041d\u041e\7M\2\2\u041e"+
		"\u041f\7\23\2\2\u041f\u0421\7\26\2\2\u0420\u0422\5\u0116\u008c\2\u0421"+
		"\u0420\3\2\2\2\u0421\u0422\3\2\2\2\u0422\u0423\3\2\2\2\u0423\u0425\7\27"+
		"\2\2\u0424\u041b\3\2\2\2\u0424\u0425\3\2\2\2\u0425\u042c\3\2\2\2\u0426"+
		"\u0427\7l\2\2\u0427\u0429\7\26\2\2\u0428\u042a\5\u0116\u008c\2\u0429\u0428"+
		"\3\2\2\2\u0429\u042a\3\2\2\2\u042a\u042b\3\2\2\2\u042b\u042d\7\27\2\2"+
		"\u042c\u0426\3\2\2\2\u042c\u042d\3\2\2\2\u042dU\3\2\2\2\u042e\u042f\7"+
		"W\2\2\u042f\u0430\7\22\2\2\u0430\u0431\5\u00e4s\2\u0431\u0432\7\23\2\2"+
		"\u0432\u0434\7\26\2\2\u0433\u0435\5\u0116\u008c\2\u0434\u0433\3\2\2\2"+
		"\u0434\u0435\3\2\2\2\u0435\u0436\3\2\2\2\u0436\u0437\7\27\2\2\u0437\u0444"+
		"\3\2\2\2\u0438\u0439\7W\2\2\u0439\u043a\7s\2\2\u043a\u043b\7\22\2\2\u043b"+
		"\u043c\5\u00b4[\2\u043c\u043d\7\23\2\2\u043d\u043f\7\26\2\2\u043e\u0440"+
		"\5\u0116\u008c\2\u043f\u043e\3\2\2\2\u043f\u0440\3\2\2\2\u0440\u0441\3"+
		"\2\2\2\u0441\u0442\7\27\2\2\u0442\u0444\3\2\2\2\u0443\u042e\3\2\2\2\u0443"+
		"\u0438\3\2\2\2\u0444W\3\2\2\2\u0445\u0446\7T\2\2\u0446\u0447\7\16\2\2"+
		"\u0447Y\3\2\2\2\u0448\u044a\7\u008d\2\2\u0449\u044b\5b\62\2\u044a\u0449"+
		"\3\2\2\2\u044a\u044b\3\2\2\2\u044b\u044c\3\2\2\2\u044c\u044d\7\16\2\2"+
		"\u044d[\3\2\2\2\u044e\u044f\5\u00d2j\2\u044f\u0451\7\22\2\2\u0450\u0452"+
		"\5\u008aF\2\u0451\u0450\3\2\2\2\u0451\u0452\3\2\2\2\u0452\u0453\3\2\2"+
		"\2\u0453\u0454\7\23\2\2\u0454]\3\2\2\2\u0455\u0456\5l\67\2\u0456\u0457"+
		"\7\21\2\2\u0457\u0459\3\2\2\2\u0458\u0455\3\2\2\2\u0458\u0459\3\2\2\2"+
		"\u0459\u045a\3\2\2\2\u045a\u0465\5\\/\2\u045b\u045e\7\u0099\2\2\u045c"+
		"\u045d\7\u00a0\2\2\u045d\u045f\5\u00dep\2\u045e\u045c\3\2\2\2\u045e\u045f"+
		"\3\2\2\2\u045f\u0460\3\2\2\2\u0460\u0461\7\26\2\2\u0461\u0462\5\u0116"+
		"\u008c\2\u0462\u0463\7\27\2\2\u0463\u0466\3\2\2\2\u0464\u0466\7\16\2\2"+
		"\u0465\u045b\3\2\2\2\u0465\u0464\3\2\2\2\u0466_\3\2\2\2\u0467\u0468\5"+
		"\u0206\u0104\2\u0468a\3\2\2\2\u0469\u046a\b\62\1\2\u046a\u0487\5\u0206"+
		"\u0104\2\u046b\u0487\5\u01e6\u00f4\2\u046c\u0487\5l\67\2\u046d\u0487\5"+
		"n8\2\u046e\u0487\5\u014c\u00a7\2\u046f\u0470\7\37\2\2\u0470\u0487\5b\62"+
		"\32\u0471\u0472\7\31\2\2\u0472\u0487\5b\62\31\u0473\u0475\7\22\2\2\u0474"+
		"\u0476\7|\2\2\u0475\u0474\3\2\2\2\u0475\u0476\3\2\2\2\u0476\u0477\3\2"+
		"\2\2\u0477\u0478\5\u00f0y\2\u0478\u0479\7\23\2\2\u0479\u047a\5b\62\30"+
		"\u047a\u0487\3\2\2\2\u047b\u047c\7?\2\2\u047c\u047d\7\22\2\2\u047d\u047e"+
		"\5b\62\2\u047e\u047f\7\23\2\2\u047f\u0487\3\2\2\2\u0480\u0481\7g\2\2\u0481"+
		"\u0482\7\22\2\2\u0482\u0483\5\u00dep\2\u0483\u0484\7\23\2\2\u0484\u0487"+
		"\3\2\2\2\u0485\u0487\5h\65\2\u0486\u0469\3\2\2\2\u0486\u046b\3\2\2\2\u0486"+
		"\u046c\3\2\2\2\u0486\u046d\3\2\2\2\u0486\u046e\3\2\2\2\u0486\u046f\3\2"+
		"\2\2\u0486\u0471\3\2\2\2\u0486\u0473\3\2\2\2\u0486\u047b\3\2\2\2\u0486"+
		"\u0480\3\2\2\2\u0486\u0485\3\2\2\2\u0487\u04e4\3\2\2\2\u0488\u0489\f\27"+
		"\2\2\u0489\u048a\5\u0170\u00b9\2\u048a\u048b\5b\62\30\u048b\u04e3\3\2"+
		"\2\2\u048c\u048d\f\26\2\2\u048d\u048e\5\u0172\u00ba\2\u048e\u048f\5b\62"+
		"\27\u048f\u04e3\3\2\2\2\u0490\u0491\f\25\2\2\u0491\u0492\5\u0176\u00bc"+
		"\2\u0492\u0493\5b\62\26\u0493\u04e3\3\2\2\2\u0494\u0495\f\24\2\2\u0495"+
		"\u0496\5\u0174\u00bb\2\u0496\u0497\5b\62\25\u0497\u04e3\3\2\2\2\u0498"+
		"\u0499\f\23\2\2\u0499\u049a\t\2\2\2\u049a\u04e3\5b\62\24\u049b\u049c\f"+
		"\22\2\2\u049c\u049d\t\3\2\2\u049d\u04e3\5b\62\23\u049e\u049f\f\20\2\2"+
		"\u049f\u04a1\7w\2\2\u04a0\u04a2\7\177\2\2\u04a1\u04a0\3\2\2\2\u04a1\u04a2"+
		"\3\2\2\2\u04a2\u04a3\3\2\2\2\u04a3\u04e3\5b\62\21\u04a4\u04a5\f\17\2\2"+
		"\u04a5\u04a6\t\4\2\2\u04a6\u04e3\5b\62\20\u04a7\u04a9\f\16\2\2\u04a8\u04aa"+
		"\7\177\2\2\u04a9\u04a8\3\2\2\2\u04a9\u04aa\3\2\2\2\u04aa\u04ab\3\2\2\2"+
		"\u04ab\u04ac\7Z\2\2\u04ac\u04e3\5b\62\17\u04ad\u04af\f\r\2\2\u04ae\u04b0"+
		"\7\177\2\2\u04af\u04ae\3\2\2\2\u04af\u04b0\3\2\2\2\u04b0\u04b1\3\2\2\2"+
		"\u04b1\u04b2\7s\2\2\u04b2\u04e3\5b\62\16\u04b3\u04b5\f\f\2\2\u04b4\u04b6"+
		"\7\177\2\2\u04b5\u04b4\3\2\2\2\u04b5\u04b6\3\2\2\2\u04b6\u04b7\3\2\2\2"+
		"\u04b7\u04b8\7q\2\2\u04b8\u04e3\5b\62\r\u04b9\u04ba\f\t\2\2\u04ba\u04bb"+
		"\7\35\2\2\u04bb\u04e3\5b\62\n\u04bc\u04bd\f\b\2\2\u04bd\u04be\7\33\2\2"+
		"\u04be\u04e3\5b\62\t\u04bf\u04c0\f\7\2\2\u04c0\u04c1\7\30\2\2\u04c1\u04c2"+
		"\5b\62\2\u04c2\u04c3\7\r\2\2\u04c3\u04c4\5b\62\b\u04c4\u04e3\3\2\2\2\u04c5"+
		"\u04c6\f\21\2\2\u04c6\u04c8\7w\2\2\u04c7\u04c9\7\177\2\2\u04c8\u04c7\3"+
		"\2\2\2\u04c8\u04c9\3\2\2\2\u04c9\u04ca\3\2\2\2\u04ca\u04e3\5f\64\2\u04cb"+
		"\u04cd\f\13\2\2\u04cc\u04ce\7\177\2\2\u04cd\u04cc\3\2\2\2\u04cd\u04ce"+
		"\3\2\2\2\u04ce\u04cf\3\2\2\2\u04cf\u04d0\7q\2\2\u04d0\u04d1\7J\2\2\u04d1"+
		"\u04e3\5d\63\2\u04d2\u04d4\f\n\2\2\u04d3\u04d5\7\177\2\2\u04d4\u04d3\3"+
		"\2\2\2\u04d4\u04d5\3\2\2\2\u04d5\u04d6\3\2\2\2\u04d6\u04d7\7q\2\2\u04d7"+
		"\u04d8\7M\2\2\u04d8\u04e3\5d\63\2\u04d9\u04da\f\3\2\2\u04da\u04db\7n\2"+
		"\2\u04db\u04dc\7b\2\2\u04dc\u04dd\7\22\2\2\u04dd\u04de\5\u00dep\2\u04de"+
		"\u04df\7s\2\2\u04df\u04e0\5b\62\2\u04e0\u04e1\7\23\2\2\u04e1\u04e3\3\2"+
		"\2\2\u04e2\u0488\3\2\2\2\u04e2\u048c\3\2\2\2\u04e2\u0490\3\2\2\2\u04e2"+
		"\u0494\3\2\2\2\u04e2\u0498\3\2\2\2\u04e2\u049b\3\2\2\2\u04e2\u049e\3\2"+
		"\2\2\u04e2\u04a4\3\2\2\2\u04e2\u04a7\3\2\2\2\u04e2\u04ad\3\2\2\2\u04e2"+
		"\u04b3\3\2\2\2\u04e2\u04b9\3\2\2\2\u04e2\u04bc\3\2\2\2\u04e2\u04bf\3\2"+
		"\2\2\u04e2\u04c5\3\2\2\2\u04e2\u04cb\3\2\2\2\u04e2\u04d2\3\2\2\2\u04e2"+
		"\u04d9\3\2\2\2\u04e3\u04e6\3\2\2\2\u04e4\u04e2\3\2\2\2\u04e4\u04e5\3\2"+
		"\2\2\u04e5c\3\2\2\2\u04e6\u04e4\3\2\2\2\u04e7\u04e8\7\u00a2\2\2\u04e8"+
		"\u04e9\7\22\2\2\u04e9\u04ea\5\u014c\u00a7\2\u04ea\u04eb\7\23\2\2\u04eb"+
		"\u04f6\3\2\2\2\u04ec\u04ed\7\22\2\2\u04ed\u04ee\5\u00dep\2\u04ee\u04ef"+
		"\7\23\2\2\u04ef\u04f0\7\u00a2\2\2\u04f0\u04f1\7\22\2\2\u04f1\u04f2\5b"+
		"\62\2\u04f2\u04f3\7\23\2\2\u04f3\u04f6\3\2\2\2\u04f4\u04f6\5b\62\2\u04f5"+
		"\u04e7\3\2\2\2\u04f5\u04ec\3\2\2\2\u04f5\u04f4\3\2\2\2\u04f6e\3\2\2\2"+
		"\u04f7\u04f8\6\64\27\3\u04f8\u04f9\7\u00ab\2\2\u04f9\u04fa\5\u00f0y\2"+
		"\u04fag\3\2\2\2\u04fb\u04fc\5\u00e2r\2\u04fci\3\2\2\2\u04fd\u0504\5p9"+
		"\2\u04fe\u0504\5\u0128\u0095\2\u04ff\u0504\5\u012a\u0096\2\u0500\u0504"+
		"\5\u00dan\2\u0501\u0504\5\u0124\u0093\2\u0502\u0504\5\u0126\u0094\2\u0503"+
		"\u04fd\3\2\2\2\u0503\u04fe\3\2\2\2\u0503\u04ff\3\2\2\2\u0503\u0500\3\2"+
		"\2\2\u0503\u0501\3\2\2\2\u0503\u0502\3\2\2\2\u0504k\3\2\2\2\u0505\u0506"+
		"\b\67\1\2\u0506\u0507\5j\66\2\u0507\u050c\3\2\2\2\u0508\u0509\f\3\2\2"+
		"\u0509\u050b\5\u0084C\2\u050a\u0508\3\2\2\2\u050b\u050e\3\2\2\2\u050c"+
		"\u050a\3\2\2\2\u050c\u050d\3\2\2\2\u050dm\3\2\2\2\u050e\u050c\3\2\2\2"+
		"\u050f\u0510\b8\1\2\u0510\u0511\7|\2\2\u0511\u0512\5\u00dan\2\u0512\u0517"+
		"\3\2\2\2\u0513\u0514\f\3\2\2\u0514\u0516\5\u0084C\2\u0515\u0513\3\2\2"+
		"\2\u0516\u0519\3\2\2\2\u0517\u0515\3\2\2\2\u0517\u0518\3\2\2\2\u0518o"+
		"\3\2\2\2\u0519\u0517\3\2\2\2\u051a\u0525\5r:\2\u051b\u0525\5t;\2\u051c"+
		"\u0525\5x=\2\u051d\u0525\5z>\2\u051e\u0525\5\u0154\u00ab\2\u051f\u0525"+
		"\5\u0156\u00ac\2\u0520\u0525\5\u0158\u00ad\2\u0521\u0525\5\u0082B\2\u0522"+
		"\u0525\5\\/\2\u0523\u0525\5\u0086D\2\u0524\u051a\3\2\2\2\u0524\u051b\3"+
		"\2\2\2\u0524\u051c\3\2\2\2\u0524\u051d\3\2\2\2\u0524\u051e\3\2\2\2\u0524"+
		"\u051f\3\2\2\2\u0524\u0520\3\2\2\2\u0524\u0521\3\2\2\2\u0524\u0522\3\2"+
		"\2\2\u0524\u0523\3\2\2\2\u0525q\3\2\2\2\u0526\u0527\7A\2\2\u0527\u0528"+
		"\7\22\2\2\u0528\u0529\5b\62\2\u0529\u052a\7\23\2\2\u052as\3\2\2\2\u052b"+
		"\u052c\7@\2\2\u052c\u0530\7\22\2\2\u052d\u052e\7o\2\2\u052e\u052f\7+\2"+
		"\2\u052f\u0531\5b\62\2\u0530\u052d\3\2\2\2\u0530\u0531\3\2\2\2\u0531\u0532"+
		"\3\2\2\2\u0532\u0533\7\23\2\2\u0533u\3\2\2\2\u0534\u0535\7\u00a4\2\2\u0535"+
		"\u0536\7\22\2\2\u0536\u0537\5b\62\2\u0537\u0538\7\23\2\2\u0538\u0539\7"+
		"\u009c\2\2\u0539\u053c\5b\62\2\u053a\u053d\5~@\2\u053b\u053d\7\16\2\2"+
		"\u053c\u053a\3\2\2\2\u053c\u053b\3\2\2\2\u053dw\3\2\2\2\u053e\u053f\7"+
		"k\2\2\u053f\u0540\7\22\2\2\u0540\u0541\5b\62\2\u0541\u0547\7\23\2\2\u0542"+
		"\u0543\7\u00a0\2\2\u0543\u0544\7\22\2\2\u0544\u0545\5\u00dep\2\u0545\u0546"+
		"\7\23\2\2\u0546\u0548\3\2\2\2\u0547\u0542\3\2\2\2\u0547\u0548\3\2\2\2"+
		"\u0548\u0549\3\2\2\2\u0549\u054a\7\u00a2\2\2\u054a\u054b\7\22\2\2\u054b"+
		"\u054c\5b\62\2\u054c\u054d\7\23\2\2\u054dy\3\2\2\2\u054e\u054f\7j\2\2"+
		"\u054f\u0554\7\u0083\2\2\u0550\u0551\7\22\2\2\u0551\u0552\5\u00c8e\2\u0552"+
		"\u0553\7\23\2\2\u0553\u0555\3\2\2\2\u0554\u0550\3\2\2\2\u0554\u0555\3"+
		"\2\2\2\u0555\u0556\3\2\2\2\u0556\u0557\7\u00a2\2\2\u0557\u0558\7\22\2"+
		"\2\u0558\u0559\5b\62\2\u0559\u055f\7\23\2\2\u055a\u055b\7t\2\2\u055b\u055c"+
		"\7\22\2\2\u055c\u055d\5\u015e\u00b0\2\u055d\u055e\7\23\2\2\u055e\u0560"+
		"\3\2\2\2\u055f\u055a\3\2\2\2\u055f\u0560\3\2\2\2\u0560\u058f\3\2\2\2\u0561"+
		"\u0576\7j\2\2\u0562\u0567\7J\2\2\u0563\u0564\7\22\2\2\u0564\u0565\5\u00c8"+
		"e\2\u0565\u0566\7\23\2\2\u0566\u0568\3\2\2\2\u0567\u0563\3\2\2\2\u0567"+
		"\u0568\3\2\2\2\u0568\u0577\3\2\2\2\u0569\u056a\7\22\2\2\u056a\u056b\5"+
		"\u00c8e\2\u056b\u056c\7\23\2\2\u056c\u056e\3\2\2\2\u056d\u0569\3\2\2\2"+
		"\u056d\u056e\3\2\2\2\u056e\u056f\3\2\2\2\u056f\u0570\7\u008f\2\2\u0570"+
		"\u0571\7\22\2\2\u0571\u0572\5b\62\2\u0572\u0573\7\u009c\2\2\u0573\u0574"+
		"\5b\62\2\u0574\u0575\7\23\2\2\u0575\u0577\3\2\2\2\u0576\u0562\3\2\2\2"+
		"\u0576\u056d\3\2\2\2\u0577\u057d\3\2\2\2\u0578\u0579\7\u00a2\2\2\u0579"+
		"\u057a\7\22\2\2\u057a\u057b\5b\62\2\u057b\u057c\7\23\2\2\u057c\u057e\3"+
		"\2\2\2\u057d\u0578\3\2\2\2\u057d\u057e\3\2\2\2\u057e\u0584\3\2\2\2\u057f"+
		"\u0580\7t\2\2\u0580\u0581\7\22\2\2\u0581\u0582\5\u015e\u00b0\2\u0582\u0583"+
		"\7\23\2\2\u0583\u0585\3\2\2\2\u0584\u057f\3\2\2\2\u0584\u0585\3\2\2\2"+
		"\u0585\u058c\3\2\2\2\u0586\u0587\7\u0086\2\2\u0587\u0588\7U\2\2\u0588"+
		"\u0589\7\22\2\2\u0589\u058a\5\u015a\u00ae\2\u058a\u058b\7\23\2\2\u058b"+
		"\u058d\3\2\2\2\u058c\u0586\3\2\2\2\u058c\u058d\3\2\2\2\u058d\u058f\3\2"+
		"\2\2\u058e\u054e\3\2\2\2\u058e\u0561\3\2\2\2\u058f{\3\2\2\2\u0590\u0591"+
		"\7j\2\2\u0591\u0596\7\u0083\2\2\u0592\u0593\7\22\2\2\u0593\u0594\5\u00c8"+
		"e\2\u0594\u0595\7\23\2\2\u0595\u0597\3\2\2\2\u0596\u0592\3\2\2\2\u0596"+
		"\u0597\3\2\2\2\u0597\u0598\3\2\2\2\u0598\u0599\7\u00a2\2\2\u0599\u059a"+
		"\7\22\2\2\u059a\u059b\5b\62\2\u059b\u05a1\7\23\2\2\u059c\u059d\7t\2\2"+
		"\u059d\u059e\7\22\2\2\u059e\u059f\5\u015e\u00b0\2\u059f\u05a0\7\23\2\2"+
		"\u05a0\u05a2\3\2\2\2\u05a1\u059c\3\2\2\2\u05a1\u05a2\3\2\2\2\u05a2\u05a3"+
		"\3\2\2\2\u05a3\u05a4\5~@\2\u05a4\u05d4\3\2\2\2\u05a5\u05ba\7j\2\2\u05a6"+
		"\u05ab\7J\2\2\u05a7\u05a8\7\22\2\2\u05a8\u05a9\5\u00c8e\2\u05a9\u05aa"+
		"\7\23\2\2\u05aa\u05ac\3\2\2\2\u05ab\u05a7\3\2\2\2\u05ab\u05ac\3\2\2\2"+
		"\u05ac\u05bb\3\2\2\2\u05ad\u05ae\7\22\2\2\u05ae\u05af\5\u00c8e\2\u05af"+
		"\u05b0\7\23\2\2\u05b0\u05b2\3\2\2\2\u05b1\u05ad\3\2\2\2\u05b1\u05b2\3"+
		"\2\2\2\u05b2\u05b3\3\2\2\2\u05b3\u05b4\7\u008f\2\2\u05b4\u05b5\7\22\2"+
		"\2\u05b5\u05b6\5b\62\2\u05b6\u05b7\7\u009c\2\2\u05b7\u05b8\5b\62\2\u05b8"+
		"\u05b9\7\23\2\2\u05b9\u05bb\3\2\2\2\u05ba\u05a6\3\2\2\2\u05ba\u05b1\3"+
		"\2\2\2\u05bb\u05c1\3\2\2\2\u05bc\u05bd\7\u00a2\2\2\u05bd\u05be\7\22\2"+
		"\2\u05be\u05bf\5b\62\2\u05bf\u05c0\7\23\2\2\u05c0\u05c2\3\2\2\2\u05c1"+
		"\u05bc\3\2\2\2\u05c1\u05c2\3\2\2\2\u05c2\u05c8\3\2\2\2\u05c3\u05c4\7t"+
		"\2\2\u05c4\u05c5\7\22\2\2\u05c5\u05c6\5\u015e\u00b0\2\u05c6\u05c7\7\23"+
		"\2\2\u05c7\u05c9\3\2\2\2\u05c8\u05c3\3\2\2\2\u05c8\u05c9\3\2\2\2\u05c9"+
		"\u05d0\3\2\2\2\u05ca\u05cb\7\u0086\2\2\u05cb\u05cc\7U\2\2\u05cc\u05cd"+
		"\7\22\2\2\u05cd\u05ce\5\u015a\u00ae\2\u05ce\u05cf\7\23\2\2\u05cf\u05d1"+
		"\3\2\2\2\u05d0\u05ca\3\2\2\2\u05d0\u05d1\3\2\2\2\u05d1\u05d2\3\2\2\2\u05d2"+
		"\u05d4\5~@\2\u05d3\u0590\3\2\2\2\u05d3\u05a5\3\2\2\2\u05d4}\3\2\2\2\u05d5"+
		"\u05d6\7\u0099\2\2\u05d6\u05d7\7\u00a0\2\2\u05d7\u05d8\5\u00dep\2\u05d8"+
		"\u05d9\7\26\2\2\u05d9\u05da\5\u0116\u008c\2\u05da\u05db\7\27\2\2\u05db"+
		"\177\3\2\2\2\u05dc\u05dd\7\u008a\2\2\u05dd\u05de\7J\2\2\u05de\u05df\7"+
		"o\2\2\u05df\u05e0\5b\62\2\u05e0\u05e1\5~@\2\u05e1\u0081\3\2\2\2\u05e2"+
		"\u05e4\7\u0093\2\2\u05e3\u05e5\7_\2\2\u05e4\u05e3\3\2\2\2\u05e4\u05e5"+
		"\3\2\2\2\u05e5\u05e6\3\2\2\2\u05e6\u05e7\7\22\2\2\u05e7\u05ed\5l\67\2"+
		"\u05e8\u05e9\7\17\2\2\u05e9\u05ea\5\u0166\u00b4\2\u05ea\u05eb\7+\2\2\u05eb"+
		"\u05ec\5\u0152\u00aa\2\u05ec\u05ee\3\2\2\2\u05ed\u05e8\3\2\2\2\u05ed\u05ee"+
		"\3\2\2\2\u05ee\u05ef\3\2\2\2\u05ef\u05f0\7\23\2\2\u05f0\u0083\3\2\2\2"+
		"\u05f1\u05f2\7\21\2\2\u05f2\u05fe\5\u00dco\2\u05f3\u05f4\7\21\2\2\u05f4"+
		"\u05fe\5\\/\2\u05f5\u05f6\7\24\2\2\u05f6\u05f7\5b\62\2\u05f7\u05f8\7\25"+
		"\2\2\u05f8\u05fe\3\2\2\2\u05f9\u05fa\7\24\2\2\u05fa\u05fb\5\u0142\u00a2"+
		"\2\u05fb\u05fc\7\25\2\2\u05fc\u05fe\3\2\2\2\u05fd\u05f1\3\2\2\2\u05fd"+
		"\u05f3\3\2\2\2\u05fd\u05f5\3\2\2\2\u05fd\u05f9\3\2\2\2\u05fe\u0085\3\2"+
		"\2\2\u05ff\u0600\5\u00c8e\2\u0600\u0601\7\22\2\2\u0601\u0604\5\u0088E"+
		"\2\u0602\u0603\7\17\2\2\u0603\u0605\5\u008aF\2\u0604\u0602\3\2\2\2\u0604"+
		"\u0605\3\2\2\2\u0605\u0606\3\2\2\2\u0606\u0607\7\23\2\2\u0607\u0610\3"+
		"\2\2\2\u0608\u0609\5\u00c8e\2\u0609\u060b\7\22\2\2\u060a\u060c\5\u008a"+
		"F\2\u060b\u060a\3\2\2\2\u060b\u060c\3\2\2\2\u060c\u060d\3\2\2\2\u060d"+
		"\u060e\7\23\2\2\u060e\u0610\3\2\2\2\u060f\u05ff\3\2\2\2\u060f\u0608\3"+
		"\2\2\2\u0610\u0087\3\2\2\2\u0611\u0612\7o\2\2\u0612\u0613\5\u016e\u00b8"+
		"\2\u0613\u0614\5b\62\2\u0614\u0615\6E\32\3\u0615\u0089\3\2\2\2\u0616\u0617"+
		"\bF\1\2\u0617\u0618\5b\62\2\u0618\u0619\6F\33\3\u0619\u061c\3\2\2\2\u061a"+
		"\u061c\5\u008cG\2\u061b\u0616\3\2\2\2\u061b\u061a\3\2\2\2\u061c\u0622"+
		"\3\2\2\2\u061d\u061e\f\3\2\2\u061e\u061f\7\17\2\2\u061f\u0621\5\u008c"+
		"G\2\u0620\u061d\3\2\2\2\u0621\u0624\3\2\2\2\u0622\u0620\3\2\2\2\u0622"+
		"\u0623\3\2\2\2\u0623\u008b\3\2\2\2\u0624\u0622\3\2\2\2\u0625\u0629\5\u00de"+
		"p\2\u0626\u0627\5\u016e\u00b8\2\u0627\u0628\5b\62\2\u0628\u062a\3\2\2"+
		"\2\u0629\u0626\3\2\2\2\u0629\u062a\3\2\2\2\u062a\u008d\3\2\2\2\u062b\u062c"+
		"\5\u0146\u00a4\2\u062c\u062d\5\u016e\u00b8\2\u062d\u062e\5b\62\2\u062e"+
		"\u062f\7\16\2\2\u062f\u008f\3\2\2\2\u0630\u0631\7\21\2\2\u0631\u0637\5"+
		"\u00dep\2\u0632\u0633\7\24\2\2\u0633\u0634\5b\62\2\u0634\u0635\7\25\2"+
		"\2\u0635\u0637\3\2\2\2\u0636\u0630\3\2\2\2\u0636\u0632\3\2\2\2\u0637\u0091"+
		"\3\2\2\2\u0638\u0639\5\u0106\u0084\2\u0639\u063a\5\u016e\u00b8\2\u063a"+
		"\u063b\5b\62\2\u063b\u063c\7\16\2\2\u063c\u0093\3\2\2\2\u063d\u063e\5"+
		"\u00f0y\2\u063e\u0095\3\2\2\2\u063f\u0640\7\u0081\2\2\u0640\u0097\3\2"+
		"\2\2\u0641\u0643\t\5\2\2\u0642\u0641\3\2\2\2\u0643\u0646\3\2\2\2\u0644"+
		"\u0642\3\2\2\2\u0644\u0645\3\2\2\2\u0645\u0099\3\2\2\2\u0646\u0644\3\2"+
		"\2\2\u0647\u064b\5\u00a0Q\2\u0648\u064b\5:\36\2\u0649\u064b\5b\62\2\u064a"+
		"\u0647\3\2\2\2\u064a\u0648\3\2\2\2\u064a\u0649\3\2\2\2\u064b\u009b\3\2"+
		"\2\2\u064c\u064e\5\u0178\u00bd\2\u064d\u064f\5\u009eP\2\u064e\u064d\3"+
		"\2\2\2\u064e\u064f\3\2\2\2\u064f\u0650\3\2\2\2\u0650\u0651\5\u0178\u00bd"+
		"\2\u0651\u0652\7\2\2\3\u0652\u009d\3\2\2\2\u0653\u0659\5\u00a0Q\2\u0654"+
		"\u0655\5\u017a\u00be\2\u0655\u0656\5\u00a0Q\2\u0656\u0658\3\2\2\2\u0657"+
		"\u0654\3\2\2\2\u0658\u065b\3\2\2\2\u0659\u0657\3\2\2\2\u0659\u065a\3\2"+
		"\2\2\u065a\u009f\3\2\2\2\u065b\u0659\3\2\2\2\u065c\u065d\5\u010c\u0087"+
		"\2\u065d\u065e\5\u017a\u00be\2\u065e\u0660\3\2\2\2\u065f\u065c\3\2\2\2"+
		"\u0660\u0663\3\2\2\2\u0661\u065f\3\2\2\2\u0661\u0662\3\2\2\2\u0662\u0669"+
		"\3\2\2\2\u0663\u0661\3\2\2\2\u0664\u0665\5\u00a2R\2\u0665\u0666\5\u017a"+
		"\u00be\2\u0666\u0668\3\2\2\2\u0667\u0664\3\2\2\2\u0668\u066b\3\2\2\2\u0669"+
		"\u0667\3\2\2\2\u0669\u066a\3\2\2\2\u066a\u0672\3\2\2\2\u066b\u0669\3\2"+
		"\2\2\u066c\u0673\5\n\6\2\u066d\u0673\5\u00ccg\2\u066e\u0673\5\u00acW\2"+
		"\u066f\u0673\5\u00aeX\2\u0670\u0673\5\u00ceh\2\u0671\u0673\5\u010a\u0086"+
		"\2\u0672\u066c\3\2\2\2\u0672\u066d\3\2\2\2\u0672\u066e\3\2\2\2\u0672\u066f"+
		"\3\2\2\2\u0672\u0670\3\2\2\2\u0672\u0671\3\2\2\2\u0673\u00a1\3\2\2\2\u0674"+
		"\u0683\5\u00a4S\2\u0675\u067f\7\22\2\2\u0676\u0680\5\u00aaV\2\u0677\u067c"+
		"\5\u00a6T\2\u0678\u0679\7\17\2\2\u0679\u067b\5\u00a6T\2\u067a\u0678\3"+
		"\2\2\2\u067b\u067e\3\2\2\2\u067c\u067a\3\2\2\2\u067c\u067d\3\2\2\2\u067d"+
		"\u0680\3\2\2\2\u067e\u067c\3\2\2\2\u067f\u0676\3\2\2\2\u067f\u0677\3\2"+
		"\2\2\u0680\u0681\3\2\2\2\u0681\u0682\7\23\2\2\u0682\u0684\3\2\2\2\u0683"+
		"\u0675\3\2\2\2\u0683\u0684\3\2\2\2\u0684\u00a3\3\2\2\2\u0685\u0686\7\u00ae"+
		"\2\2\u0686\u00a5\3\2\2\2\u0687\u0688\5\u00a8U\2\u0688\u0689\7+\2\2\u0689"+
		"\u068a\5\u00aaV\2\u068a\u00a7\3\2\2\2\u068b\u068c\t\6\2\2\u068c\u00a9"+
		"\3\2\2\2\u068d\u0690\5\u012a\u0096\2\u068e\u0690\5\u00c2b\2\u068f\u068d"+
		"\3\2\2\2\u068f\u068e\3\2\2\2\u0690\u00ab\3\2\2\2\u0691\u0692\5\"\22\2"+
		"\u0692\u00ad\3\2\2\2\u0693\u0696\5\2\2\2\u0694\u0696\5\4\3\2\u0695\u0693"+
		"\3\2\2\2\u0695\u0694\3\2\2\2\u0696\u00af\3\2\2\2\u0697\u069d\5\b\5\2\u0698"+
		"\u0699\5\u017a\u00be\2\u0699\u069a\5\b\5\2\u069a\u069c\3\2\2\2\u069b\u0698"+
		"\3\2\2\2\u069c\u069f\3\2\2\2\u069d\u069b\3\2\2\2\u069d\u069e\3\2\2\2\u069e"+
		"\u00b1\3\2\2\2\u069f\u069d\3\2\2\2\u06a0\u06a6\5\6\4\2\u06a1\u06a2\5\u017a"+
		"\u00be\2\u06a2\u06a3\5\6\4\2\u06a3\u06a5\3\2\2\2\u06a4\u06a1\3\2\2\2\u06a5"+
		"\u06a8\3\2\2\2\u06a6\u06a4\3\2\2\2\u06a6\u06a7\3\2\2\2\u06a7\u00b3\3\2"+
		"\2\2\u06a8\u06a6\3\2\2\2\u06a9\u06ae\5\u00e4s\2\u06aa\u06ab\7\17\2\2\u06ab"+
		"\u06ad\5\u00e4s\2\u06ac\u06aa\3\2\2\2\u06ad\u06b0\3\2\2\2\u06ae\u06ac"+
		"\3\2\2\2\u06ae\u06af\3\2\2\2\u06af\u00b5\3\2\2\2\u06b0\u06ae\3\2\2\2\u06b1"+
		"\u06b2\7s\2\2\u06b2\u06bc\5\u00b8]\2\u06b3\u06b4\7s\2\2\u06b4\u06bc\5"+
		"\u00ba^\2\u06b5\u06b6\7s\2\2\u06b6\u06bc\5\u00be`\2\u06b7\u06b8\7x\2\2"+
		"\u06b8\u06bc\7\u00af\2\2\u06b9\u06ba\7x\2\2\u06ba\u06bc\5b\62\2\u06bb"+
		"\u06b1\3\2\2\2\u06bb\u06b3\3\2\2\2\u06bb\u06b5\3\2\2\2\u06bb\u06b7\3\2"+
		"\2\2\u06bb\u06b9\3\2\2\2\u06bc\u00b7\3\2\2\2\u06bd\u06bf\7|\2\2\u06be"+
		"\u06bd\3\2\2\2\u06be\u06bf\3\2\2\2\u06bf\u06c0\3\2\2\2\u06c0\u06c2\7\24"+
		"\2\2\u06c1\u06c3\5\u00bc_\2\u06c2\u06c1\3\2\2\2\u06c2\u06c3\3\2\2\2\u06c3"+
		"\u06c4\3\2\2\2\u06c4\u06c5\7\25\2\2\u06c5\u00b9\3\2\2\2\u06c6\u06c8\7"+
		"|\2\2\u06c7\u06c6\3\2\2\2\u06c7\u06c8\3\2\2\2\u06c8\u06c9\3\2\2\2\u06c9"+
		"\u06cb\7\'\2\2\u06ca\u06cc\5\u00bc_\2\u06cb\u06ca\3\2\2\2\u06cb\u06cc"+
		"\3\2\2\2\u06cc\u06cd\3\2\2\2\u06cd\u06ce\7%\2\2\u06ce\u00bb\3\2\2\2\u06cf"+
		"\u06d4\5b\62\2\u06d0\u06d1\7\17\2\2\u06d1\u06d3\5b\62\2\u06d2\u06d0\3"+
		"\2\2\2\u06d3\u06d6\3\2\2\2\u06d4\u06d2\3\2\2\2\u06d4\u06d5\3\2\2\2\u06d5"+
		"\u00bd\3\2\2\2\u06d6\u06d4\3\2\2\2\u06d7\u06d8\7\24\2\2\u06d8\u06d9\5"+
		"b\62\2\u06d9\u06da\7\20\2\2\u06da\u06db\5b\62\2\u06db\u06dc\7\25\2\2\u06dc"+
		"\u00bf\3\2\2\2\u06dd\u06de\ba\1\2\u06de\u06ef\5\u00c2b\2\u06df\u06e0\7"+
		"F\2\2\u06e0\u06e1\7\'\2\2\u06e1\u06e2\5\u00c0a\2\u06e2\u06e3\7%\2\2\u06e3"+
		"\u06ef\3\2\2\2\u06e4\u06e5\7E\2\2\u06e5\u06e6\7\'\2\2\u06e6\u06e7\5\u00c0"+
		"a\2\u06e7\u06e8\7%\2\2\u06e8\u06ef\3\2\2\2\u06e9\u06ea\7H\2\2\u06ea\u06eb"+
		"\7\'\2\2\u06eb\u06ec\5\u00c0a\2\u06ec\u06ed\7%\2\2\u06ed\u06ef\3\2\2\2"+
		"\u06ee\u06dd\3\2\2\2\u06ee\u06df\3\2\2\2\u06ee\u06e4\3\2\2\2\u06ee\u06e9"+
		"\3\2\2\2\u06ef\u06f9\3\2\2\2\u06f0\u06f1\f\b\2\2\u06f1\u06f8\7)\2\2\u06f2"+
		"\u06f3\f\7\2\2\u06f3\u06f4\7\24\2\2\u06f4\u06f8\7\25\2\2\u06f5\u06f6\f"+
		"\6\2\2\u06f6\u06f8\7*\2\2\u06f7\u06f0\3\2\2\2\u06f7\u06f2\3\2\2\2\u06f7"+
		"\u06f5\3\2\2\2\u06f8\u06fb\3\2\2\2\u06f9\u06f7\3\2\2\2\u06f9\u06fa\3\2"+
		"\2\2\u06fa\u00c1\3\2\2\2\u06fb\u06f9\3\2\2\2\u06fc\u06ff\5\u00c4c\2\u06fd"+
		"\u06ff\5\u00c6d\2\u06fe\u06fc\3\2\2\2\u06fe\u06fd\3\2\2\2\u06ff\u00c3"+
		"\3\2\2\2\u0700\u0713\7\63\2\2\u0701\u0713\7\64\2\2\u0702\u0713\7\65\2"+
		"\2\u0703\u0713\7\66\2\2\u0704\u0713\7B\2\2\u0705\u0713\7\67\2\2\u0706"+
		"\u0713\78\2\2\u0707\u0713\7@\2\2\u0708\u0713\79\2\2\u0709\u0713\7;\2\2"+
		"\u070a\u0713\7:\2\2\u070b\u0713\7<\2\2\u070c\u0713\7=\2\2\u070d\u0713"+
		"\7?\2\2\u070e\u0713\7A\2\2\u070f\u0713\7C\2\2\u0710\u0713\7D\2\2\u0711"+
		"\u0713\7G\2\2\u0712\u0700\3\2\2\2\u0712\u0701\3\2\2\2\u0712\u0702\3\2"+
		"\2\2\u0712\u0703\3\2\2\2\u0712\u0704\3\2\2\2\u0712\u0705\3\2\2\2\u0712"+
		"\u0706\3\2\2\2\u0712\u0707\3\2\2\2\u0712\u0708\3\2\2\2\u0712\u0709\3\2"+
		"\2\2\u0712\u070a\3\2\2\2\u0712\u070b\3\2\2\2\u0712\u070c\3\2\2\2\u0712"+
		"\u070d\3\2\2\2\u0712\u070e\3\2\2\2\u0712\u070f\3\2\2\2\u0712\u0710\3\2"+
		"\2\2\u0712\u0711\3\2\2\2\u0713\u00c5\3\2\2\2\u0714\u0715\7\u00aa\2\2\u0715"+
		"\u00c7\3\2\2\2\u0716\u0718\7|\2\2\u0717\u0716\3\2\2\2\u0717\u0718\3\2"+
		"\2\2\u0718\u0719\3\2\2\2\u0719\u071a\5\u00c6d\2\u071a\u00c9\3\2\2\2\u071b"+
		"\u071c\7?\2\2\u071c\u00cb\3\2\2\2\u071d\u0721\5\20\t\2\u071e\u0721\5$"+
		"\23\2\u071f\u0721\5\22\n\2\u0720\u071d\3\2\2\2\u0720\u071e\3\2\2\2\u0720"+
		"\u071f\3\2\2\2\u0721\u00cd\3\2\2\2\u0722\u0725\5\f\7\2\u0723\u0725\5\16"+
		"\b\2\u0724\u0722\3\2\2\2\u0724\u0723\3\2\2\2\u0725\u00cf\3\2\2\2\u0726"+
		"\u072b\5\u00e2r\2\u0727\u0728\7\17\2\2\u0728\u072a\5\u00e2r\2\u0729\u0727"+
		"\3\2\2\2\u072a\u072d\3\2\2\2\u072b\u0729\3\2\2\2\u072b\u072c\3\2\2\2\u072c"+
		"\u00d1\3\2\2\2\u072d\u072b\3\2\2\2\u072e\u0731\5\u00dep\2\u072f\u0731"+
		"\5\u00e2r\2\u0730\u072e\3\2\2\2\u0730\u072f\3\2\2\2\u0731\u00d3\3\2\2"+
		"\2\u0732\u0735\5\u00dan\2\u0733\u0735\5\u0162\u00b2\2\u0734\u0732\3\2"+
		"\2\2\u0734\u0733\3\2\2\2\u0735\u00d5\3\2\2\2\u0736\u0737\6l \3\u0737\u0738"+
		"\7\37\2\2\u0738\u0739\5\u00d8m\2\u0739\u00d7\3\2\2\2\u073a\u073b\6m!\3"+
		"\u073b\u073c\5\u00d4k\2\u073c\u00d9\3\2\2\2\u073d\u0741\5\u00dep\2\u073e"+
		"\u0741\5\u00e2r\2\u073f\u0741\5\u00e4s\2\u0740\u073d\3\2\2\2\u0740\u073e"+
		"\3\2\2\2\u0740\u073f\3\2\2\2\u0741\u00db\3\2\2\2\u0742\u0743\t\7\2\2\u0743"+
		"\u00dd\3\2\2\2\u0744\u0745\t\b\2\2\u0745\u00df\3\2\2\2\u0746\u0747\t\t"+
		"\2\2\u0747\u00e1\3\2\2\2\u0748\u0749\7\u00aa\2\2\u0749\u00e3\3\2\2\2\u074a"+
		"\u074b\7\u00a9\2\2\u074b\u00e5\3\2\2\2\u074c\u0751\5\u00e8u\2\u074d\u074e"+
		"\7\17\2\2\u074e\u0750\5\u00e8u\2\u074f\u074d\3\2\2\2\u0750\u0753\3\2\2"+
		"\2\u0751\u074f\3\2\2\2\u0751\u0752\3\2\2\2\u0752\u00e7\3\2\2\2\u0753\u0751"+
		"\3\2\2\2\u0754\u075a\5\u00eex\2\u0755\u0757\7|\2\2\u0756\u0755\3\2\2\2"+
		"\u0756\u0757\3\2\2\2\u0757\u0758\3\2\2\2\u0758\u075a\5\u00eav\2\u0759"+
		"\u0754\3\2\2\2\u0759\u0756\3\2\2\2\u075a\u00e9\3\2\2\2\u075b\u075e\5\u00ec"+
		"w\2\u075c\u075e\5\66\34\2\u075d\u075b\3\2\2\2\u075d\u075c\3\2\2\2\u075e"+
		"\u00eb\3\2\2\2\u075f\u0762\5\u00dep\2\u0760\u0761\7+\2\2\u0761\u0763\5"+
		"\u012a\u0096\2\u0762\u0760\3\2\2\2\u0762\u0763\3\2\2\2\u0763\u00ed\3\2"+
		"\2\2\u0764\u0765\5\u00caf\2\u0765\u0766\5\u00dep\2\u0766\u00ef\3\2\2\2"+
		"\u0767\u076a\5\u00c0a\2\u0768\u076a\5\u00f2z\2\u0769\u0767\3\2\2\2\u0769"+
		"\u0768\3\2\2\2\u076a\u00f1\3\2\2\2\u076b\u076c\bz\1\2\u076c\u076d\7M\2"+
		"\2\u076d\u0776\3\2\2\2\u076e\u076f\f\4\2\2\u076f\u0770\7\24\2\2\u0770"+
		"\u0775\7\25\2\2\u0771\u0772\f\3\2\2\u0772\u0773\7\26\2\2\u0773\u0775\7"+
		"\27\2\2\u0774\u076e\3\2\2\2\u0774\u0771\3\2\2\2\u0775\u0778\3\2\2\2\u0776"+
		"\u0774\3\2\2\2\u0776\u0777\3\2\2\2\u0777\u00f3\3\2\2\2\u0778\u0776\3\2"+
		"\2\2\u0779\u077f\5\u00f6|\2\u077a\u077b\5\u017a\u00be\2\u077b\u077c\5"+
		"\u00f6|\2\u077c\u077e\3\2\2\2\u077d\u077a\3\2\2\2\u077e\u0781\3\2\2\2"+
		"\u077f\u077d\3\2\2\2\u077f\u0780\3\2\2\2\u0780\u00f5\3\2\2\2\u0781\u077f"+
		"\3\2\2\2\u0782\u0783\5\u010c\u0087\2\u0783\u0784\5\u017a\u00be\2\u0784"+
		"\u0786\3\2\2\2\u0785\u0782\3\2\2\2\u0786\u0789\3\2\2\2\u0787\u0785\3\2"+
		"\2\2\u0787\u0788\3\2\2\2\u0788\u078f\3\2\2\2\u0789\u0787\3\2\2\2\u078a"+
		"\u078b\5\u00a2R\2\u078b\u078c\5\u017a\u00be\2\u078c\u078e\3\2\2\2\u078d"+
		"\u078a\3\2\2\2\u078e\u0791\3\2\2\2\u078f\u078d\3\2\2\2\u078f\u0790\3\2"+
		"\2\2\u0790\u0797\3\2\2\2\u0791\u078f\3\2\2\2\u0792\u0798\5\32\16\2\u0793"+
		"\u0798\5\36\20\2\u0794\u0798\5.\30\2\u0795\u0798\5,\27\2\u0796\u0798\5"+
		"\30\r\2\u0797\u0792\3\2\2\2\u0797\u0793\3\2\2\2\u0797\u0794\3\2\2\2\u0797"+
		"\u0795\3\2\2\2\u0797\u0796\3\2\2\2\u0798\u00f7\3\2\2\2\u0799\u079f\5\u00fa"+
		"~\2\u079a\u079b\5\u017a\u00be\2\u079b\u079c\5\u00fa~\2\u079c\u079e\3\2"+
		"\2\2\u079d\u079a\3\2\2\2\u079e\u07a1\3\2\2\2\u079f\u079d\3\2\2\2\u079f"+
		"\u07a0\3\2\2\2\u07a0\u00f9\3\2\2\2\u07a1\u079f\3\2\2\2\u07a2\u07a3\5\u010c"+
		"\u0087\2\u07a3\u07a4\5\u017a\u00be\2\u07a4\u07a6\3\2\2\2\u07a5\u07a2\3"+
		"\2\2\2\u07a6\u07a9\3\2\2\2\u07a7\u07a5\3\2\2\2\u07a7\u07a8\3\2\2\2\u07a8"+
		"\u07af\3\2\2\2\u07a9\u07a7\3\2\2\2\u07aa\u07ab\5\u00a2R\2\u07ab\u07ac"+
		"\5\u017a\u00be\2\u07ac\u07ae\3\2\2\2\u07ad\u07aa\3\2\2\2\u07ae\u07b1\3"+
		"\2\2\2\u07af\u07ad\3\2\2\2\u07af\u07b0\3\2\2\2\u07b0\u07b5\3\2\2\2\u07b1"+
		"\u07af\3\2\2\2\u07b2\u07b6\5 \21\2\u07b3\u07b6\5\34\17\2\u07b4\u07b6\5"+
		"\60\31\2\u07b5\u07b2\3\2\2\2\u07b5\u07b3\3\2\2\2\u07b5\u07b4\3\2\2\2\u07b6"+
		"\u00fb\3\2\2\2\u07b7\u07b8\7\7\2\2\u07b8\u07c2\5\u01c6\u00e4\2\u07b9\u07ba"+
		"\7\b\2\2\u07ba\u07c2\5\u01e0\u00f1\2\u07bb\u07bc\7\t\2\2\u07bc\u07c2\5"+
		"\u00fe\u0080\2\u07bd\u07be\7\n\2\2\u07be\u07c2\5\u00fe\u0080\2\u07bf\u07c0"+
		"\7\13\2\2\u07c0\u07c2\5\u0102\u0082\2\u07c1\u07b7\3\2\2\2\u07c1\u07b9"+
		"\3\2\2\2\u07c1\u07bb\3\2\2\2\u07c1\u07bd\3\2\2\2\u07c1\u07bf\3\2\2\2\u07c2"+
		"\u00fd\3\2\2\2\u07c3\u07c5\5\u00dan\2\u07c4\u07c6\5\u0100\u0081\2\u07c5"+
		"\u07c4\3\2\2\2\u07c5\u07c6\3\2\2\2\u07c6\u00ff\3\2\2\2\u07c7\u07c8\7o"+
		"\2\2\u07c8\u07c9\5\u0168\u00b5\2\u07c9\u07ca\7\r\2\2\u07ca\u07cf\5\u01ae"+
		"\u00d8\2\u07cb\u07cc\7\21\2\2\u07cc\u07ce\5\u01ae\u00d8\2\u07cd\u07cb"+
		"\3\2\2\2\u07ce\u07d1\3\2\2\2\u07cf\u07cd\3\2\2\2\u07cf\u07d0\3\2\2\2\u07d0"+
		"\u0101\3\2\2\2\u07d1\u07cf\3\2\2\2\u07d2\u07d7\5\u0194\u00cb\2\u07d3\u07d4"+
		"\7\21\2\2\u07d4\u07d6\5\u0194\u00cb\2\u07d5\u07d3\3\2\2\2\u07d6\u07d9"+
		"\3\2\2\2\u07d7\u07d5\3\2\2\2\u07d7\u07d8\3\2\2\2\u07d8\u07db\3\2\2\2\u07d9"+
		"\u07d7\3\2\2\2\u07da\u07dc\5\u0104\u0083\2\u07db\u07da\3\2\2\2\u07db\u07dc"+
		"\3\2\2\2\u07dc\u0103\3\2\2\2\u07dd\u07de\7o\2\2\u07de\u07df\5\u0168\u00b5"+
		"\2\u07df\u07e1\7\r\2\2\u07e0\u07e2\7!\2\2\u07e1\u07e0\3\2\2\2\u07e1\u07e2"+
		"\3\2\2\2\u07e2\u07e3\3\2\2\2\u07e3\u07e8\5\u0194\u00cb\2\u07e4\u07e5\7"+
		"!\2\2\u07e5\u07e7\5\u0194\u00cb\2\u07e6\u07e4\3\2\2\2\u07e7\u07ea\3\2"+
		"\2\2\u07e8\u07e6\3\2\2\2\u07e8\u07e9\3\2\2\2\u07e9\u07ed\3\2\2\2\u07ea"+
		"\u07e8\3\2\2\2\u07eb\u07ec\7\21\2\2\u07ec\u07ee\5\u0194\u00cb\2\u07ed"+
		"\u07eb\3\2\2\2\u07ed\u07ee\3\2\2\2\u07ee\u0105\3\2\2\2\u07ef\u07f4\5\u00de"+
		"p\2\u07f0\u07f1\7\17\2\2\u07f1\u07f3\5\u00dep\2\u07f2\u07f0\3\2\2\2\u07f3"+
		"\u07f6\3\2\2\2\u07f4\u07f2\3\2\2\2\u07f4\u07f5\3\2\2\2\u07f5\u0107\3\2"+
		"\2\2\u07f6\u07f4\3\2\2\2\u07f7\u07fc\5\u00e0q\2\u07f8\u07f9\7\17\2\2\u07f9"+
		"\u07fb\5\u00e0q\2\u07fa\u07f8\3\2\2\2\u07fb\u07fe\3\2\2\2\u07fc\u07fa"+
		"\3\2\2\2\u07fc\u07fd\3\2\2\2\u07fd\u0109\3\2\2\2\u07fe\u07fc\3\2\2\2\u07ff"+
		"\u0804\5*\26\2\u0800\u0804\5.\30\2\u0801\u0804\5\60\31\2\u0802\u0804\5"+
		"\62\32\2\u0803\u07ff\3\2\2\2\u0803\u0800\3\2\2\2\u0803\u0801\3\2\2\2\u0803"+
		"\u0802\3\2\2\2\u0804\u010b\3\2\2\2\u0805\u0806\7\6\2\2\u0806\u010d\3\2"+
		"\2\2\u0807\u080d\5\u0110\u0089\2\u0808\u0809\5\u017a\u00be\2\u0809\u080a"+
		"\5\u0110\u0089\2\u080a\u080c\3\2\2\2\u080b\u0808\3\2\2\2\u080c\u080f\3"+
		"\2\2\2\u080d\u080b\3\2\2\2\u080d\u080e\3\2\2\2\u080e\u010f\3\2\2\2\u080f"+
		"\u080d\3\2\2\2\u0810\u0811\7\7\2\2\u0811\u081b\5\u01b0\u00d9\2\u0812\u0813"+
		"\7\b\2\2\u0813\u081b\5\u01cc\u00e7\2\u0814\u0815\7\t\2\2\u0815\u081b\5"+
		"\u0112\u008a\2\u0816\u0817\7\n\2\2\u0817\u081b\5\u0112\u008a\2\u0818\u0819"+
		"\7\13\2\2\u0819\u081b\5\u0114\u008b\2\u081a\u0810\3\2\2\2\u081a\u0812"+
		"\3\2\2\2\u081a\u0814\3\2\2\2\u081a\u0816\3\2\2\2\u081a\u0818\3\2\2\2\u081b"+
		"\u0111\3\2\2\2\u081c\u081e\5\u0196\u00cc\2\u081d\u081f\7\16\2\2\u081e"+
		"\u081d\3\2\2\2\u081e\u081f\3\2\2\2\u081f\u0821\3\2\2\2\u0820\u0822\5\u0100"+
		"\u0081\2\u0821\u0820\3\2\2\2\u0821\u0822\3\2\2\2\u0822\u0113\3\2\2\2\u0823"+
		"\u0825\5\u017c\u00bf\2\u0824\u0826\7\16\2\2\u0825\u0824\3\2\2\2\u0825"+
		"\u0826\3\2\2\2\u0826\u0828\3\2\2\2\u0827\u0829\5\u0104\u0083\2\u0828\u0827"+
		"\3\2\2\2\u0828\u0829\3\2\2\2\u0829\u0115\3\2\2\2\u082a\u0830\5:\36\2\u082b"+
		"\u082c\5\u017a\u00be\2\u082c\u082d\5:\36\2\u082d\u082f\3\2\2\2\u082e\u082b"+
		"\3\2\2\2\u082f\u0832\3\2\2\2\u0830\u082e\3\2\2\2\u0830\u0831\3\2\2\2\u0831"+
		"\u0117\3\2\2\2\u0832\u0830\3\2\2\2\u0833\u0839\5\64\33\2\u0834\u0835\5"+
		"\u017a\u00be\2\u0835\u0836\5\64\33\2\u0836\u0838\3\2\2\2\u0837\u0834\3"+
		"\2\2\2\u0838\u083b\3\2\2\2\u0839\u0837\3\2\2\2\u0839\u083a\3\2\2\2\u083a"+
		"\u0119\3\2\2\2\u083b\u0839\3\2\2\2\u083c\u0842\5F$\2\u083d\u083e\5\u017a"+
		"\u00be\2\u083e\u083f\5F$\2\u083f\u0841\3\2\2\2\u0840\u083d\3\2\2\2\u0841"+
		"\u0844\3\2\2\2\u0842\u0840\3\2\2\2\u0842\u0843\3\2\2\2\u0843\u011b\3\2"+
		"\2\2\u0844\u0842\3\2\2\2\u0845\u084b\5V,\2\u0846\u0847\5\u017a\u00be\2"+
		"\u0847\u0848\5V,\2\u0848\u084a\3\2\2\2\u0849\u0846\3\2\2\2\u084a\u084d"+
		"\3\2\2\2\u084b\u0849\3\2\2\2\u084b\u084c\3\2\2\2\u084c\u011d\3\2\2\2\u084d"+
		"\u084b\3\2\2\2\u084e\u084f\7\24\2\2\u084f\u0850\5\u0120\u0091\2\u0850"+
		"\u0851\7\20\2\2\u0851\u0852\5\u0120\u0091\2\u0852\u0853\7\25\2\2\u0853"+
		"\u085d\3\2\2\2\u0854\u0855\7\24\2\2\u0855\u0856\5\u0122\u0092\2\u0856"+
		"\u0857\7\25\2\2\u0857\u085d\3\2\2\2\u0858\u0859\7\'\2\2\u0859\u085a\5"+
		"\u0122\u0092\2\u085a\u085b\7%\2\2\u085b\u085d\3\2\2\2\u085c\u084e\3\2"+
		"\2\2\u085c\u0854\3\2\2\2\u085c\u0858\3\2\2\2\u085d\u011f\3\2\2\2\u085e"+
		"\u0876\7\u00a7\2\2\u085f\u0876\7\u00a8\2\2\u0860\u0862\7\37\2\2\u0861"+
		"\u0860\3\2\2\2\u0861\u0862\3\2\2\2\u0862\u0863\3\2\2\2\u0863\u0876\7\u00b2"+
		"\2\2\u0864\u0876\7\u00b3\2\2\u0865\u0876\7\u00a6\2\2\u0866\u0876\7\u00b7"+
		"\2\2\u0867\u0876\7\u00b6\2\2\u0868\u0876\7\u00af\2\2\u0869\u086b\7\37"+
		"\2\2\u086a\u0869\3\2\2\2\u086a\u086b\3\2\2\2\u086b\u086c\3\2\2\2\u086c"+
		"\u0876\7\u00b4\2\2\u086d\u0876\7\u00b5\2\2\u086e\u0876\7\u00a5\2\2\u086f"+
		"\u0876\7\u00b8\2\2\u0870\u0876\7\u00b1\2\2\u0871\u0876\7\u00b0\2\2\u0872"+
		"\u0876\5\u00e4s\2\u0873\u0876\5\u0094K\2\u0874\u0876\5\u0096L\2\u0875"+
		"\u085e\3\2\2\2\u0875\u085f\3\2\2\2\u0875\u0861\3\2\2\2\u0875\u0864\3\2"+
		"\2\2\u0875\u0865\3\2\2\2\u0875\u0866\3\2\2\2\u0875\u0867\3\2\2\2\u0875"+
		"\u0868\3\2\2\2\u0875\u086a\3\2\2\2\u0875\u086d\3\2\2\2\u0875\u086e\3\2"+
		"\2\2\u0875\u086f\3\2\2\2\u0875\u0870\3\2\2\2\u0875\u0871\3\2\2\2\u0875"+
		"\u0872\3\2\2\2\u0875\u0873\3\2\2\2\u0875\u0874\3\2\2\2\u0876\u0121\3\2"+
		"\2\2\u0877\u087c\5\u0120\u0091\2\u0878\u0879\7\17\2\2\u0879\u087b\5\u0120"+
		"\u0091\2\u087a\u0878\3\2\2\2\u087b\u087e\3\2\2\2\u087c\u087a\3\2\2\2\u087c"+
		"\u087d\3\2\2\2\u087d\u0123\3\2\2\2\u087e\u087c\3\2\2\2\u087f\u0880\t\n"+
		"\2\2\u0880\u0125\3\2\2\2\u0881\u0882\5\u00c6d\2\u0882\u0883\7\21\2\2\u0883"+
		"\u0885\3\2\2\2\u0884\u0881\3\2\2\2\u0884\u0885\3\2\2\2\u0885\u0886\3\2"+
		"\2\2\u0886\u0887\7\u0096\2\2\u0887\u0127\3\2\2\2\u0888\u0889\7\22\2\2"+
		"\u0889\u088a\5b\62\2\u088a\u088b\7\23\2\2\u088b\u0129\3\2\2\2\u088c\u088f"+
		"\5\u0120\u0091\2\u088d\u088f\5\u012c\u0097\2\u088e\u088c\3\2\2\2\u088e"+
		"\u088d\3\2\2\2\u088f\u012b\3\2\2\2\u0890\u0897\5\u00be`\2\u0891\u0897"+
		"\5\u00b8]\2\u0892\u0897\5\u00ba^\2\u0893\u0897\5\u0130\u0099\2\u0894\u0897"+
		"\5\u0132\u009a\2\u0895\u0897\5\u012e\u0098\2\u0896\u0890\3\2\2\2\u0896"+
		"\u0891\3\2\2\2\u0896\u0892\3\2\2\2\u0896\u0893\3\2\2\2\u0896\u0894\3\2"+
		"\2\2\u0896\u0895\3\2\2\2\u0897\u012d\3\2\2\2\u0898\u089a\7|\2\2\u0899"+
		"\u0898\3\2\2\2\u0899\u089a\3\2\2\2\u089a\u089b\3\2\2\2\u089b\u089d\7\22"+
		"\2\2\u089c\u089e\5\u0134\u009b\2\u089d\u089c\3\2\2\2\u089d\u089e\3\2\2"+
		"\2\u089e\u089f\3\2\2\2\u089f\u08a0\7\23\2\2\u08a0\u012f\3\2\2\2\u08a1"+
		"\u08a3\7|\2\2\u08a2\u08a1\3\2\2\2\u08a2\u08a3\3\2\2\2\u08a3\u08ac\3\2"+
		"\2\2\u08a4\u08a5\7\'\2\2\u08a5\u08a6\5\u013c\u009f\2\u08a6\u08a7\7%\2"+
		"\2\u08a7\u08ad\3\2\2\2\u08a8\u08ad\7*\2\2\u08a9\u08aa\7\'\2\2\u08aa\u08ab"+
		"\7\r\2\2\u08ab\u08ad\7%\2\2\u08ac\u08a4\3\2\2\2\u08ac\u08a8\3\2\2\2\u08ac"+
		"\u08a9\3\2\2\2\u08ad\u0131\3\2\2\2\u08ae\u08b0\7\26\2\2\u08af\u08b1\5"+
		"\u0136\u009c\2\u08b0\u08af\3\2\2\2\u08b0\u08b1\3\2\2\2\u08b1\u08b2\3\2"+
		"\2\2\u08b2\u08b3\7\27\2\2\u08b3\u0133\3\2\2\2\u08b4\u08b5\5b\62\2\u08b5"+
		"\u08be\7\17\2\2\u08b6\u08bb\5b\62\2\u08b7\u08b8\7\17\2\2\u08b8\u08ba\5"+
		"b\62\2\u08b9\u08b7\3\2\2\2\u08ba\u08bd\3\2\2\2\u08bb\u08b9\3\2\2\2\u08bb"+
		"\u08bc\3\2\2\2\u08bc\u08bf\3\2\2\2\u08bd\u08bb\3\2\2\2\u08be\u08b6\3\2"+
		"\2\2\u08be\u08bf\3\2\2\2\u08bf\u0135\3\2\2\2\u08c0\u08c5\5\u0138\u009d"+
		"\2\u08c1\u08c2\7\17\2\2\u08c2\u08c4\5\u0138\u009d\2\u08c3\u08c1\3\2\2"+
		"\2\u08c4\u08c7\3\2\2\2\u08c5\u08c3\3\2\2\2\u08c5\u08c6\3\2\2\2\u08c6\u0137"+
		"\3\2\2\2\u08c7\u08c5\3\2\2\2\u08c8\u08c9\5\u013a\u009e\2\u08c9\u08ca\7"+
		"\r\2\2\u08ca\u08cb\5b\62\2\u08cb\u0139\3\2\2\2\u08cc\u08cf\5\u00d4k\2"+
		"\u08cd\u08cf\7\u00af\2\2\u08ce\u08cc\3\2\2\2\u08ce\u08cd\3\2\2\2\u08cf"+
		"\u013b\3\2\2\2\u08d0\u08d5\5\u013e\u00a0\2\u08d1\u08d2\7\17\2\2\u08d2"+
		"\u08d4\5\u013e\u00a0\2\u08d3\u08d1\3\2\2\2\u08d4\u08d7\3\2\2\2\u08d5\u08d3"+
		"\3\2\2\2\u08d5\u08d6\3\2\2\2\u08d6\u013d\3\2\2\2\u08d7\u08d5\3\2\2\2\u08d8"+
		"\u08d9\5\u0140\u00a1\2\u08d9\u08da\7\r\2\2\u08da\u08db\5b\62\2\u08db\u013f"+
		"\3\2\2\2\u08dc\u08df\5\u00d4k\2\u08dd\u08df\7\u00af\2\2\u08de\u08dc\3"+
		"\2\2\2\u08de\u08dd\3\2\2\2\u08df\u0141\3\2\2\2\u08e0\u08e1\5b\62\2\u08e1"+
		"\u08e2\7\r\2\2\u08e2\u08e3\5b\62\2\u08e3\u08ea\3\2\2\2\u08e4\u08e5\5b"+
		"\62\2\u08e5\u08e6\7\r\2\2\u08e6\u08ea\3\2\2\2\u08e7\u08e8\7\r\2\2\u08e8"+
		"\u08ea\5b\62\2\u08e9\u08e0\3\2\2\2\u08e9\u08e4\3\2\2\2\u08e9\u08e7\3\2"+
		"\2\2\u08ea\u0143\3\2\2\2\u08eb\u08ec\5\u00dep\2\u08ec\u08ed\5\u016e\u00b8"+
		"\2\u08ed\u08ee\5b\62\2\u08ee\u0145\3\2\2\2\u08ef\u08f0\b\u00a4\1\2\u08f0"+
		"\u08f1\5\u00dep\2\u08f1\u08f6\3\2\2\2\u08f2\u08f3\f\3\2\2\u08f3\u08f5"+
		"\5\u0090I\2\u08f4\u08f2\3\2\2\2\u08f5\u08f8\3\2\2\2\u08f6\u08f4\3\2\2"+
		"\2\u08f6\u08f7\3\2\2\2\u08f7\u0147\3\2\2\2\u08f8\u08f6\3\2\2\2\u08f9\u08fa"+
		"\6\u00a5%\3\u08fa\u08fb\7\u00ab\2\2\u08fb\u08fe\5\u00f0y\2\u08fc\u08fe"+
		"\5b\62\2\u08fd\u08f9\3\2\2\2\u08fd\u08fc\3\2\2\2\u08fe\u0149\3\2\2\2\u08ff"+
		"\u0900\6\u00a6&\3\u0900\u0901\7\u00ab\2\2\u0901\u014b\3\2\2\2\u0902\u0903"+
		"\5\u014e\u00a8\2\u0903\u0904\5b\62\2\u0904\u090b\3\2\2\2\u0905\u0906\5"+
		"\u014e\u00a8\2\u0906\u0907\7\26\2\2\u0907\u0908\5\u0116\u008c\2\u0908"+
		"\u0909\7\27\2\2\u0909\u090b\3\2\2\2\u090a\u0902\3\2\2\2\u090a\u0905\3"+
		"\2\2\2\u090b\u014d\3\2\2\2\u090c\u090d\5\u0150\u00a9\2\u090d\u090e\5\u0098"+
		"M\2\u090e\u090f\7\62\2\2\u090f\u0910\5\u0098M\2\u0910\u014f\3\2\2\2\u0911"+
		"\u0918\5\u00dep\2\u0912\u0914\7\22\2\2\u0913\u0915\5\u0106\u0084\2\u0914"+
		"\u0913\3\2\2\2\u0914\u0915\3\2\2\2\u0915\u0916\3\2\2\2\u0916\u0918\7\23"+
		"\2\2\u0917\u0911\3\2\2\2\u0917\u0912\3\2\2\2\u0918\u0151\3\2\2\2\u0919"+
		"\u091c\5l\67\2\u091a\u091c\5\u014c\u00a7\2\u091b\u0919\3\2\2\2\u091b\u091a"+
		"\3\2\2\2\u091c\u0153\3\2\2\2\u091d\u091e\7\u008a\2\2\u091e\u091f\7A\2"+
		"\2\u091f\u0920\7o\2\2\u0920\u0921\5b\62\2\u0921\u0155\3\2\2\2\u0922\u0923"+
		"\7\u008a\2\2\u0923\u0924\7J\2\2\u0924\u0925\7o\2\2\u0925\u0926\5b\62\2"+
		"\u0926\u0157\3\2\2\2\u0927\u0928\7\u008a\2\2\u0928\u0929\7\u0083\2\2\u0929"+
		"\u092a\7o\2\2\u092a\u092b\5b\62\2\u092b\u0159\3\2\2\2\u092c\u0931\5\u015c"+
		"\u00af\2\u092d\u092e\7\17\2\2\u092e\u0930\5\u015c\u00af\2\u092f\u092d"+
		"\3\2\2\2\u0930\u0933\3\2\2\2\u0931\u092f\3\2\2\2\u0931\u0932\3\2\2\2\u0932"+
		"\u015b\3\2\2\2\u0933\u0931\3\2\2\2\u0934\u0939\5\u00dep\2\u0935\u0936"+
		"\7\21\2\2\u0936\u0938\5\u00dep\2\u0937\u0935\3\2\2\2\u0938\u093b\3\2\2"+
		"\2\u0939\u0937\3\2\2\2\u0939\u093a\3\2\2\2\u093a\u093d\3\2\2\2\u093b\u0939"+
		"\3\2\2\2\u093c\u093e\t\13\2\2\u093d\u093c\3\2\2\2\u093d\u093e\3\2\2\2"+
		"\u093e\u015d\3\2\2\2\u093f\u0944\5\u00dep\2\u0940\u0941\7\17\2\2\u0941"+
		"\u0943\5\u00dep\2\u0942\u0940\3\2\2\2\u0943\u0946\3\2\2\2\u0944\u0942"+
		"\3\2\2\2\u0944\u0945\3\2\2\2\u0945\u015f\3\2\2\2\u0946\u0944\3\2\2\2\u0947"+
		"\u094e\7\36\2\2\u0948\u094e\7\37\2\2\u0949\u094e\5\u0170\u00b9\2\u094a"+
		"\u094e\5\u0172\u00ba\2\u094b\u094e\5\u0174\u00bb\2\u094c\u094e\5\u0176"+
		"\u00bc\2\u094d\u0947\3\2\2\2\u094d\u0948\3\2\2\2\u094d\u0949\3\2\2\2\u094d"+
		"\u094a\3\2\2\2\u094d\u094b\3\2\2\2\u094d\u094c\3\2\2\2\u094e\u0161\3\2"+
		"\2\2\u094f\u0950\t\f\2\2\u0950\u0163\3\2\2\2\u0951\u0952\7\u00ab\2\2\u0952"+
		"\u0953\6\u00b3\'\3\u0953\u0165\3\2\2\2\u0954\u0955\7\u00ab\2\2\u0955\u0956"+
		"\6\u00b4(\3\u0956\u0167\3\2\2\2\u0957\u0958\7\u00ab\2\2\u0958\u0959\6"+
		"\u00b5)\3\u0959\u0169\3\2\2\2\u095a\u095b\7\u00ab\2\2\u095b\u095c\6\u00b6"+
		"*\3\u095c\u016b\3\2\2\2\u095d\u095e\7\u00ab\2\2\u095e\u095f\6\u00b7+\3"+
		"\u095f\u016d\3\2\2\2\u0960\u0961\7+\2\2\u0961\u016f\3\2\2\2\u0962\u0963"+
		"\7 \2\2\u0963\u0171\3\2\2\2\u0964\u0965\7!\2\2\u0965\u0173\3\2\2\2\u0966"+
		"\u0967\7\"\2\2\u0967\u0175\3\2\2\2\u0968\u0969\t\r\2\2\u0969\u0177\3\2"+
		"\2\2\u096a\u096b\3\2\2\2\u096b\u0179\3\2\2\2\u096c\u096d\3\2\2\2\u096d"+
		"\u017b\3\2\2\2\u096e\u096f\7\u008d\2\2\u096f\u0970\5\u017e\u00c0\2\u0970"+
		"\u0971\7\16\2\2\u0971\u0976\3\2\2\2\u0972\u0973\5\u017e\u00c0\2\u0973"+
		"\u0974\7\16\2\2\u0974\u0976\3\2\2\2\u0975\u096e\3\2\2\2\u0975\u0972\3"+
		"\2\2\2\u0976\u017d\3\2\2\2\u0977\u0978\b\u00c0\1\2\u0978\u0979\5\u0180"+
		"\u00c1\2\u0979\u097e\3\2\2\2\u097a\u097b\f\3\2\2\u097b\u097d\5\u0186\u00c4"+
		"\2\u097c\u097a\3\2\2\2\u097d\u0980\3\2\2\2\u097e\u097c\3\2\2\2\u097e\u097f"+
		"\3\2\2\2\u097f\u017f\3\2\2\2\u0980\u097e\3\2\2\2\u0981\u0989\5\u0182\u00c2"+
		"\2\u0982\u0989\5\u0184\u00c3\2\u0983\u0989\5\u018e\u00c8\2\u0984\u0989"+
		"\5\u0190\u00c9\2\u0985\u0989\5\u0192\u00ca\2\u0986\u0989\5\u0188\u00c5"+
		"\2\u0987\u0989\5\u018c\u00c7\2\u0988\u0981\3\2\2\2\u0988\u0982\3\2\2\2"+
		"\u0988\u0983\3\2\2\2\u0988\u0984\3\2\2\2\u0988\u0985\3\2\2\2\u0988\u0986"+
		"\3\2\2\2\u0988\u0987\3\2\2\2\u0989\u0181\3\2\2\2\u098a\u098b";
	private static final String _serializedATNSegment1 =
		"\5\u0124\u0093\2\u098b\u0183\3\2\2\2\u098c\u098d\5\u0164\u00b3\2\u098d"+
		"\u098e\5\u0188\u00c5\2\u098e\u0185\3\2\2\2\u098f\u0990\7\21\2\2\u0990"+
		"\u0995\5\u0188\u00c5\2\u0991\u0992\7\21\2\2\u0992\u0995\5\u0194\u00cb"+
		"\2\u0993\u0995\5\u018c\u00c7\2\u0994\u098f\3\2\2\2\u0994\u0991\3\2\2\2"+
		"\u0994\u0993\3\2\2\2\u0995\u0187\3\2\2\2\u0996\u0997\5\u0194\u00cb\2\u0997"+
		"\u0999\7\22\2\2\u0998\u099a\5\u018a\u00c6\2\u0999\u0998\3\2\2\2\u0999"+
		"\u099a\3\2\2\2\u099a\u099b\3\2\2\2\u099b\u099c\7\23\2\2\u099c\u0189\3"+
		"\2\2\2\u099d\u099e\b\u00c6\1\2\u099e\u099f\5\u017e\u00c0\2\u099f\u09a5"+
		"\3\2\2\2\u09a0\u09a1\f\3\2\2\u09a1\u09a2\7\17\2\2\u09a2\u09a4\5\u017e"+
		"\u00c0\2\u09a3\u09a0\3\2\2\2\u09a4\u09a7\3\2\2\2\u09a5\u09a3\3\2\2\2\u09a5"+
		"\u09a6\3\2\2\2\u09a6\u018b\3\2\2\2\u09a7\u09a5\3\2\2\2\u09a8\u09a9\7\24"+
		"\2\2\u09a9\u09aa\5\u017e\u00c0\2\u09aa\u09ab\7\25\2\2\u09ab\u018d\3\2"+
		"\2\2\u09ac\u09ad\7\22\2\2\u09ad\u09ae\5\u017e\u00c0\2\u09ae\u09af\7\23"+
		"\2\2\u09af\u018f\3\2\2\2\u09b0\u09b1\5\u0194\u00cb\2\u09b1\u0191\3\2\2"+
		"\2\u09b2\u09b8\7\u00b2\2\2\u09b3\u09b8\7\u00b4\2\2\u09b4\u09b8\7\u00af"+
		"\2\2\u09b5\u09b8\7\u00a5\2\2\u09b6\u09b8\7\u00a6\2\2\u09b7\u09b2\3\2\2"+
		"\2\u09b7\u09b3\3\2\2\2\u09b7\u09b4\3\2\2\2\u09b7\u09b5\3\2\2\2\u09b7\u09b6"+
		"\3\2\2\2\u09b8\u0193\3\2\2\2\u09b9\u09bf\7\u00ab\2\2\u09ba\u09bf\7\u00a9"+
		"\2\2\u09bb\u09bf\7\u00ad\2\2\u09bc\u09bf\7\u00aa\2\2\u09bd\u09bf\5\u0162"+
		"\u00b2\2\u09be\u09b9\3\2\2\2\u09be\u09ba\3\2\2\2\u09be\u09bb\3\2\2\2\u09be"+
		"\u09bc\3\2\2\2\u09be\u09bd\3\2\2\2\u09bf\u0195\3\2\2\2\u09c0\u09c1\7\u008d"+
		"\2\2\u09c1\u09c4\5\u0198\u00cd\2\u09c2\u09c4\5\u0198\u00cd\2\u09c3\u09c0"+
		"\3\2\2\2\u09c3\u09c2\3\2\2\2\u09c4\u0197\3\2\2\2\u09c5\u09c6\b\u00cd\1"+
		"\2\u09c6\u09c7\5\u019a\u00ce\2\u09c7\u09cc\3\2\2\2\u09c8\u09c9\f\3\2\2"+
		"\u09c9\u09cb\5\u019e\u00d0\2\u09ca\u09c8\3\2\2\2\u09cb\u09ce\3\2\2\2\u09cc"+
		"\u09ca\3\2\2\2\u09cc\u09cd\3\2\2\2\u09cd\u0199\3\2\2\2\u09ce\u09cc\3\2"+
		"\2\2\u09cf\u09d5\5\u019c\u00cf\2\u09d0\u09d5\5\u01a8\u00d5\2\u09d1\u09d5"+
		"\5\u01aa\u00d6\2\u09d2\u09d5\5\u01ac\u00d7\2\u09d3\u09d5\5\u01a0\u00d1"+
		"\2\u09d4\u09cf\3\2\2\2\u09d4\u09d0\3\2\2\2\u09d4\u09d1\3\2\2\2\u09d4\u09d2"+
		"\3\2\2\2\u09d4\u09d3\3\2\2\2\u09d5\u019b\3\2\2\2\u09d6\u09d7\5\u0124\u0093"+
		"\2\u09d7\u019d\3\2\2\2\u09d8\u09d9\7\21\2\2\u09d9\u09df\5\u01a0\u00d1"+
		"\2\u09da\u09db\7\24\2\2\u09db\u09dc\5\u0198\u00cd\2\u09dc\u09dd\7\25\2"+
		"\2\u09dd\u09df\3\2\2\2\u09de\u09d8\3\2\2\2\u09de\u09da\3\2\2\2\u09df\u019f"+
		"\3\2\2\2\u09e0\u09e1\5\u01ae\u00d8\2\u09e1\u09e3\7\22\2\2\u09e2\u09e4"+
		"\5\u01a2\u00d2\2\u09e3\u09e2\3\2\2\2\u09e3\u09e4\3\2\2\2\u09e4\u09e5\3"+
		"\2\2\2\u09e5\u09e6\7\23\2\2\u09e6\u01a1\3\2\2\2\u09e7\u09ee\5\u01a4\u00d3"+
		"\2\u09e8\u09ee\5\u01a6\u00d4\2\u09e9\u09ea\5\u01a4\u00d3\2\u09ea\u09eb"+
		"\7\17\2\2\u09eb\u09ec\5\u01a6\u00d4\2\u09ec\u09ee\3\2\2\2\u09ed\u09e7"+
		"\3\2\2\2\u09ed\u09e8\3\2\2\2\u09ed\u09e9\3\2\2\2\u09ee\u01a3\3\2\2\2\u09ef"+
		"\u09f0\b\u00d3\1\2\u09f0\u09f1\5\u0198\u00cd\2\u09f1\u09f7\3\2\2\2\u09f2"+
		"\u09f3\f\3\2\2\u09f3\u09f4\7\17\2\2\u09f4\u09f6\5\u0198\u00cd\2\u09f5"+
		"\u09f2\3\2\2\2\u09f6\u09f9\3\2\2\2\u09f7\u09f5\3\2\2\2\u09f7\u09f8\3\2"+
		"\2\2\u09f8\u01a5\3\2\2\2\u09f9\u09f7\3\2\2\2\u09fa\u09fb\b\u00d4\1\2\u09fb"+
		"\u09fc\5\u01ae\u00d8\2\u09fc\u09fd\7+\2\2\u09fd\u09fe\5\u0198\u00cd\2"+
		"\u09fe\u0a07\3\2\2\2\u09ff\u0a00\f\3\2\2\u0a00\u0a01\7\17\2\2\u0a01\u0a02"+
		"\5\u01ae\u00d8\2\u0a02\u0a03\7+\2\2\u0a03\u0a04\5\u0198\u00cd\2\u0a04"+
		"\u0a06\3\2\2\2\u0a05\u09ff\3\2\2\2\u0a06\u0a09\3\2\2\2\u0a07\u0a05\3\2"+
		"\2\2\u0a07\u0a08\3\2\2\2\u0a08\u01a7\3\2\2\2\u0a09\u0a07\3\2\2\2\u0a0a"+
		"\u0a0b\7\22\2\2\u0a0b\u0a0c\5\u0198\u00cd\2\u0a0c\u0a0d\7\23\2\2\u0a0d"+
		"\u01a9\3\2\2\2\u0a0e\u0a0f\b\u00d6\1\2\u0a0f\u0a12\7\u00ad\2\2\u0a10\u0a12"+
		"\5\u01ae\u00d8\2\u0a11\u0a0e\3\2\2\2\u0a11\u0a10\3\2\2\2\u0a12\u0a18\3"+
		"\2\2\2\u0a13\u0a14\f\3\2\2\u0a14\u0a15\7\21\2\2\u0a15\u0a17\5\u01ae\u00d8"+
		"\2\u0a16\u0a13\3\2\2\2\u0a17\u0a1a\3\2\2\2\u0a18\u0a16\3\2\2\2\u0a18\u0a19"+
		"\3\2\2\2\u0a19\u01ab\3\2\2\2\u0a1a\u0a18\3\2\2\2\u0a1b\u0a21\7\u00b2\2"+
		"\2\u0a1c\u0a21\7\u00b4\2\2\u0a1d\u0a21\7\u00af\2\2\u0a1e\u0a21\7\u00a5"+
		"\2\2\u0a1f\u0a21\7\u00a6\2\2\u0a20\u0a1b\3\2\2\2\u0a20\u0a1c\3\2\2\2\u0a20"+
		"\u0a1d\3\2\2\2\u0a20\u0a1e\3\2\2\2\u0a20\u0a1f\3\2\2\2\u0a21\u01ad\3\2"+
		"\2\2\u0a22\u0a28\7\u00ab\2\2\u0a23\u0a28\7\u00a9\2\2\u0a24\u0a28\7\u00ad"+
		"\2\2\u0a25\u0a28\7\u00aa\2\2\u0a26\u0a28\5\u0162\u00b2\2\u0a27\u0a22\3"+
		"\2\2\2\u0a27\u0a23\3\2\2\2\u0a27\u0a24\3\2\2\2\u0a27\u0a25\3\2\2\2\u0a27"+
		"\u0a26\3\2\2\2\u0a28\u01af\3\2\2\2\u0a29\u0a2a\7\u008d\2\2\u0a2a\u0a2b"+
		"\5\u01b2\u00da\2\u0a2b\u0a2c\7\16\2\2\u0a2c\u0a31\3\2\2\2\u0a2d\u0a2e"+
		"\5\u01b2\u00da\2\u0a2e\u0a2f\7\16\2\2\u0a2f\u0a31\3\2\2\2\u0a30\u0a29"+
		"\3\2\2\2\u0a30\u0a2d\3\2\2\2\u0a31\u01b1\3\2\2\2\u0a32\u0a33\b\u00da\1"+
		"\2\u0a33\u0a34\5\u01b4\u00db\2\u0a34\u0a39\3\2\2\2\u0a35\u0a36\f\3\2\2"+
		"\u0a36\u0a38\5\u01ba\u00de\2\u0a37\u0a35\3\2\2\2\u0a38\u0a3b\3\2\2\2\u0a39"+
		"\u0a37\3\2\2\2\u0a39\u0a3a\3\2\2\2\u0a3a\u01b3\3\2\2\2\u0a3b\u0a39\3\2"+
		"\2\2\u0a3c\u0a42\5\u01b6\u00dc\2\u0a3d\u0a42\5\u01b8\u00dd\2\u0a3e\u0a42"+
		"\5\u01c2\u00e2\2\u0a3f\u0a42\5\u01c4\u00e3\2\u0a40\u0a42\5\u01c8\u00e5"+
		"\2\u0a41\u0a3c\3\2\2\2\u0a41\u0a3d\3\2\2\2\u0a41\u0a3e\3\2\2\2\u0a41\u0a3f"+
		"\3\2\2\2\u0a41\u0a40\3\2\2\2\u0a42\u01b5\3\2\2\2\u0a43\u0a44\5\u0124\u0093"+
		"\2\u0a44\u01b7\3\2\2\2\u0a45\u0a46\5\u0164\u00b3\2\u0a46\u0a47\5\u01bc"+
		"\u00df\2\u0a47\u01b9\3\2\2\2\u0a48\u0a49\7\21\2\2\u0a49\u0a4c\5\u01bc"+
		"\u00df\2\u0a4a\u0a4c\5\u01c0\u00e1\2\u0a4b\u0a48\3\2\2\2\u0a4b\u0a4a\3"+
		"\2\2\2\u0a4c\u01bb\3\2\2\2\u0a4d\u0a4e\5\u01ca\u00e6\2\u0a4e\u0a50\7\22"+
		"\2\2\u0a4f\u0a51\5\u01be\u00e0\2\u0a50\u0a4f\3\2\2\2\u0a50\u0a51\3\2\2"+
		"\2\u0a51\u0a52\3\2\2\2\u0a52\u0a53\7\23\2\2\u0a53\u01bd\3\2\2\2\u0a54"+
		"\u0a55\b\u00e0\1\2\u0a55\u0a56\5\u01b2\u00da\2\u0a56\u0a5c\3\2\2\2\u0a57"+
		"\u0a58\f\3\2\2\u0a58\u0a59\7\17\2\2\u0a59\u0a5b\5\u01b2\u00da\2\u0a5a"+
		"\u0a57\3\2\2\2\u0a5b\u0a5e\3\2\2\2\u0a5c\u0a5a\3\2\2\2\u0a5c\u0a5d\3\2"+
		"\2\2\u0a5d\u01bf\3\2\2\2\u0a5e\u0a5c\3\2\2\2\u0a5f\u0a60\7\24\2\2\u0a60"+
		"\u0a61\5\u01b2\u00da\2\u0a61\u0a62\7\25\2\2\u0a62\u01c1\3\2\2\2\u0a63"+
		"\u0a64\7\22\2\2\u0a64\u0a65\5\u01b2\u00da\2\u0a65\u0a66\7\23\2\2\u0a66"+
		"\u01c3\3\2\2\2\u0a67\u0a68\b\u00e3\1\2\u0a68\u0a69\5\u01ca\u00e6\2\u0a69"+
		"\u0a6f\3\2\2\2\u0a6a\u0a6b\f\3\2\2\u0a6b\u0a6c\7\21\2\2\u0a6c\u0a6e\5"+
		"\u01ca\u00e6\2\u0a6d\u0a6a\3\2\2\2\u0a6e\u0a71\3\2\2\2\u0a6f\u0a6d\3\2"+
		"\2\2\u0a6f\u0a70\3\2\2\2\u0a70\u01c5\3\2\2\2\u0a71\u0a6f\3\2\2\2\u0a72"+
		"\u0a73\b\u00e4\1\2\u0a73\u0a74\5\u01c4\u00e3\2\u0a74\u0a79\3\2\2\2\u0a75"+
		"\u0a76\f\3\2\2\u0a76\u0a78\7\u00ad\2\2\u0a77\u0a75\3\2\2\2\u0a78\u0a7b"+
		"\3\2\2\2\u0a79\u0a77\3\2\2\2\u0a79\u0a7a\3\2\2\2\u0a7a\u01c7\3\2\2\2\u0a7b"+
		"\u0a79\3\2\2\2\u0a7c\u0a82\7\u00b2\2\2\u0a7d\u0a82\7\u00b4\2\2\u0a7e\u0a82"+
		"\7\u00af\2\2\u0a7f\u0a82\7\u00a5\2\2\u0a80\u0a82\7\u00a6\2\2\u0a81\u0a7c"+
		"\3\2\2\2\u0a81\u0a7d\3\2\2\2\u0a81\u0a7e\3\2\2\2\u0a81\u0a7f\3\2\2\2\u0a81"+
		"\u0a80\3\2\2\2\u0a82\u01c9\3\2\2\2\u0a83\u0a89\7\u00ab\2\2\u0a84\u0a89"+
		"\7\u00a9\2\2\u0a85\u0a89\7\u00ad\2\2\u0a86\u0a89\7\u00aa\2\2\u0a87\u0a89"+
		"\5\u0162\u00b2\2\u0a88\u0a83\3\2\2\2\u0a88\u0a84\3\2\2\2\u0a88\u0a85\3"+
		"\2\2\2\u0a88\u0a86\3\2\2\2\u0a88\u0a87\3\2\2\2\u0a89\u01cb\3\2\2\2\u0a8a"+
		"\u0a8b\7\u008d\2\2\u0a8b\u0a8c\5\u01ce\u00e8\2\u0a8c\u0a8d\7\16\2\2\u0a8d"+
		"\u0a92\3\2\2\2\u0a8e\u0a8f\5\u01ce\u00e8\2\u0a8f\u0a90\7\16\2\2\u0a90"+
		"\u0a92\3\2\2\2\u0a91\u0a8a\3\2\2\2\u0a91\u0a8e\3\2\2\2\u0a92\u01cd\3\2"+
		"\2\2\u0a93\u0a94\b\u00e8\1\2\u0a94\u0a95\5\u01d0\u00e9\2\u0a95\u0a9a\3"+
		"\2\2\2\u0a96\u0a97\f\3\2\2\u0a97\u0a99\5\u01d6\u00ec\2\u0a98\u0a96\3\2"+
		"\2\2\u0a99\u0a9c\3\2\2\2\u0a9a\u0a98\3\2\2\2\u0a9a\u0a9b\3\2\2\2\u0a9b"+
		"\u01cf\3\2\2\2\u0a9c\u0a9a\3\2\2\2\u0a9d\u0aa3\5\u01d2\u00ea\2\u0a9e\u0aa3"+
		"\5\u01d4\u00eb\2\u0a9f\u0aa3\5\u01de\u00f0\2\u0aa0\u0aa3\5\u01e0\u00f1"+
		"\2\u0aa1\u0aa3\5\u01e2\u00f2\2\u0aa2\u0a9d\3\2\2\2\u0aa2\u0a9e\3\2\2\2"+
		"\u0aa2\u0a9f\3\2\2\2\u0aa2\u0aa0\3\2\2\2\u0aa2\u0aa1\3\2\2\2\u0aa3\u01d1"+
		"\3\2\2\2\u0aa4\u0aa5\5\u0124\u0093\2\u0aa5\u01d3\3\2\2\2\u0aa6\u0aa7\5"+
		"\u0164\u00b3\2\u0aa7\u0aa8\5\u01d8\u00ed\2\u0aa8\u01d5\3\2\2\2\u0aa9\u0aaa"+
		"\7\21\2\2\u0aaa\u0aad\5\u01d8\u00ed\2\u0aab\u0aad\5\u01dc\u00ef\2\u0aac"+
		"\u0aa9\3\2\2\2\u0aac\u0aab\3\2\2\2\u0aad\u01d7\3\2\2\2\u0aae\u0aaf\5\u01e4"+
		"\u00f3\2\u0aaf\u0ab1\7\22\2\2\u0ab0\u0ab2\5\u01da\u00ee\2\u0ab1\u0ab0"+
		"\3\2\2\2\u0ab1\u0ab2\3\2\2\2\u0ab2\u0ab3\3\2\2\2\u0ab3\u0ab4\7\23\2\2"+
		"\u0ab4\u01d9\3\2\2\2\u0ab5\u0ab6\b\u00ee\1\2\u0ab6\u0ab7\5\u01ce\u00e8"+
		"\2\u0ab7\u0abd\3\2\2\2\u0ab8\u0ab9\f\3\2\2\u0ab9\u0aba\7\17\2\2\u0aba"+
		"\u0abc\5\u01ce\u00e8\2\u0abb\u0ab8\3\2\2\2\u0abc\u0abf\3\2\2\2\u0abd\u0abb"+
		"\3\2\2\2\u0abd\u0abe\3\2\2\2\u0abe\u01db\3\2\2\2\u0abf\u0abd\3\2\2\2\u0ac0"+
		"\u0ac1\7\24\2\2\u0ac1\u0ac2\5\u01ce\u00e8\2\u0ac2\u0ac3\7\25\2\2\u0ac3"+
		"\u01dd\3\2\2\2\u0ac4\u0ac5\7\22\2\2\u0ac5\u0ac6\5\u01ce\u00e8\2\u0ac6"+
		"\u0ac7\7\23\2\2\u0ac7\u01df\3\2\2\2\u0ac8\u0ac9\b\u00f1\1\2\u0ac9\u0acc"+
		"\7\u00ad\2\2\u0aca\u0acc\5\u01e4\u00f3\2\u0acb\u0ac8\3\2\2\2\u0acb\u0aca"+
		"\3\2\2\2\u0acc\u0ad2\3\2\2\2\u0acd\u0ace\f\3\2\2\u0ace\u0acf\7\21\2\2"+
		"\u0acf\u0ad1\5\u01e4\u00f3\2\u0ad0\u0acd\3\2\2\2\u0ad1\u0ad4\3\2\2\2\u0ad2"+
		"\u0ad0\3\2\2\2\u0ad2\u0ad3\3\2\2\2\u0ad3\u01e1\3\2\2\2\u0ad4\u0ad2\3\2"+
		"\2\2\u0ad5\u0adb\7\u00b2\2\2\u0ad6\u0adb\7\u00b4\2\2\u0ad7\u0adb\7\u00af"+
		"\2\2\u0ad8\u0adb\7\u00a5\2\2\u0ad9\u0adb\7\u00a6\2\2\u0ada\u0ad5\3\2\2"+
		"\2\u0ada\u0ad6\3\2\2\2\u0ada\u0ad7\3\2\2\2\u0ada\u0ad8\3\2\2\2\u0ada\u0ad9"+
		"\3\2\2\2\u0adb\u01e3\3\2\2\2\u0adc\u0ae2\7\u00ab\2\2\u0add\u0ae2\7\u00a9"+
		"\2\2\u0ade\u0ae2\7\u00ad\2\2\u0adf\u0ae2\7\u00aa\2\2\u0ae0\u0ae2\5\u0162"+
		"\u00b2\2\u0ae1\u0adc\3\2\2\2\u0ae1\u0add\3\2\2\2\u0ae1\u0ade\3\2\2\2\u0ae1"+
		"\u0adf\3\2\2\2\u0ae1\u0ae0\3\2\2\2\u0ae2\u01e5\3\2\2\2\u0ae3\u0ae6\5\u01e8"+
		"\u00f5\2\u0ae4\u0ae6\5\u01ea\u00f6\2\u0ae5\u0ae3\3\2\2\2\u0ae5\u0ae4\3"+
		"\2\2\2\u0ae6\u01e7\3\2\2\2\u0ae7\u0aef\5\u01f0\u00f9\2\u0ae8\u0aea\5\u01f2"+
		"\u00fa\2\u0ae9\u0aeb\5\u01fe\u0100\2\u0aea\u0ae9\3\2\2\2\u0aea\u0aeb\3"+
		"\2\2\2\u0aeb\u0aec\3\2\2\2\u0aec\u0aed\5\u01f4\u00fb\2\u0aed\u0aef\3\2"+
		"\2\2\u0aee\u0ae7\3\2\2\2\u0aee\u0ae8\3\2\2\2\u0aef\u01e9\3\2\2\2\u0af0"+
		"\u0af1\5\u01ec\u00f7\2\u0af1\u0af3\5\u0098M\2\u0af2\u0af4\5\u01fe\u0100"+
		"\2\u0af3\u0af2\3\2\2\2\u0af3\u0af4\3\2\2\2\u0af4\u0af5\3\2\2\2\u0af5\u0af6"+
		"\5\u0098M\2\u0af6\u0af7\5\u01ee\u00f8\2\u0af7\u01eb\3\2\2\2\u0af8\u0af9"+
		"\7\'\2\2\u0af9\u0afc\7%\2\2\u0afa\u0afc\7)\2\2\u0afb\u0af8\3\2\2\2\u0afb"+
		"\u0afa\3\2\2\2\u0afc\u01ed\3\2\2\2\u0afd\u0afe\7\'\2\2\u0afe\u0aff\7!"+
		"\2\2\u0aff\u0b00\7%\2\2\u0b00\u01ef\3\2\2\2\u0b01\u0b02\7\'\2\2\u0b02"+
		"\u0b03\5\u01f6\u00fc\2\u0b03\u0b07\5\u0098M\2\u0b04\u0b06\5\u01fa\u00fe"+
		"\2\u0b05\u0b04\3\2\2\2\u0b06\u0b09\3\2\2\2\u0b07\u0b05\3\2\2\2\u0b07\u0b08"+
		"\3\2\2\2\u0b08\u0b0a\3\2\2\2\u0b09\u0b07\3\2\2\2\u0b0a\u0b0b\7!\2\2\u0b0b"+
		"\u0b0c\7%\2\2\u0b0c\u01f1\3\2\2\2\u0b0d\u0b0e\7\'\2\2\u0b0e\u0b0f\5\u01f6"+
		"\u00fc\2\u0b0f\u0b13\5\u0098M\2\u0b10\u0b12\5\u01fa\u00fe\2\u0b11\u0b10"+
		"\3\2\2\2\u0b12\u0b15\3\2\2\2\u0b13\u0b11\3\2\2\2\u0b13\u0b14\3\2\2\2\u0b14"+
		"\u0b16\3\2\2\2\u0b15\u0b13\3\2\2\2\u0b16\u0b17\7%\2\2\u0b17\u01f3\3\2"+
		"\2\2\u0b18\u0b19\7\'\2\2\u0b19\u0b1a\7!\2\2\u0b1a\u0b1b\5\u01f6\u00fc"+
		"\2\u0b1b\u0b1c\7%\2\2\u0b1c\u01f5\3\2\2\2\u0b1d\u0b22\5\u01f8\u00fd\2"+
		"\u0b1e\u0b1f\7\21\2\2\u0b1f\u0b21\5\u01f8\u00fd\2\u0b20\u0b1e\3\2\2\2"+
		"\u0b21\u0b24\3\2\2\2\u0b22\u0b20\3\2\2\2\u0b22\u0b23\3\2\2\2\u0b23\u01f7"+
		"\3\2\2\2\u0b24\u0b22\3\2\2\2\u0b25\u0b29\5\u00d4k\2\u0b26\u0b28\5\u00d6"+
		"l\2\u0b27\u0b26\3\2\2\2\u0b28\u0b2b\3\2\2\2\u0b29\u0b27\3\2\2\2\u0b29"+
		"\u0b2a\3\2\2\2\u0b2a\u01f9\3\2\2\2\u0b2b\u0b29\3\2\2\2\u0b2c\u0b2f\5\u01f8"+
		"\u00fd\2\u0b2d\u0b2e\7+\2\2\u0b2e\u0b30\5\u01fc\u00ff\2\u0b2f\u0b2d\3"+
		"\2\2\2\u0b2f\u0b30\3\2\2\2\u0b30\u0b31\3\2\2\2\u0b31\u0b32\5\u0098M\2"+
		"\u0b32\u01fb\3\2\2\2\u0b33\u0b3a\7\u00af\2\2\u0b34\u0b36\7\26\2\2\u0b35"+
		"\u0b37\5b\62\2\u0b36\u0b35\3\2\2\2\u0b36\u0b37\3\2\2\2\u0b37\u0b38\3\2"+
		"\2\2\u0b38\u0b3a\7\27\2\2\u0b39\u0b33\3\2\2\2\u0b39\u0b34\3\2\2\2\u0b3a"+
		"\u01fd\3\2\2\2\u0b3b\u0b3d\5\u0200\u0101\2\u0b3c\u0b3b\3\2\2\2\u0b3d\u0b3e"+
		"\3\2\2\2\u0b3e\u0b3c\3\2\2\2\u0b3e\u0b3f\3\2\2\2\u0b3f\u01ff\3\2\2\2\u0b40"+
		"\u0b48\5\u0202\u0102\2\u0b41\u0b48\5\u01e8\u00f5\2\u0b42\u0b44\7\26\2"+
		"\2\u0b43\u0b45\5b\62\2\u0b44\u0b43\3\2\2\2\u0b44\u0b45\3\2\2\2\u0b45\u0b46"+
		"\3\2\2\2\u0b46\u0b48\7\27\2\2\u0b47\u0b40\3\2\2\2\u0b47\u0b41\3\2\2\2"+
		"\u0b47\u0b42\3\2\2\2\u0b48\u0201\3\2\2\2\u0b49\u0b4b\5\u0204\u0103\2\u0b4a"+
		"\u0b49\3\2\2\2\u0b4b\u0b4c\3\2\2\2\u0b4c\u0b4a\3\2\2\2\u0b4c\u0b4d\3\2"+
		"\2\2\u0b4d\u0203\3\2\2\2\u0b4e\u0b51\n\16\2\2\u0b4f\u0b51\7\u00b9\2\2"+
		"\u0b50\u0b4e\3\2\2\2\u0b50\u0b4f\3\2\2\2\u0b51\u0205\3\2\2\2\u0b52\u0b54"+
		"\7\26\2\2\u0b53\u0b55\5\u0208\u0105\2\u0b54\u0b53\3\2\2\2\u0b55\u0b56"+
		"\3\2\2\2\u0b56\u0b54\3\2\2\2\u0b56\u0b57\3\2\2\2\u0b57\u0b58\3\2\2\2\u0b58"+
		"\u0b59\7\27\2\2\u0b59\u0207\3\2\2\2\u0b5a\u0b5b\5\u020a\u0106\2\u0b5b"+
		"\u0b5d\7\r\2\2\u0b5c\u0b5e\5\u020c\u0107\2\u0b5d\u0b5c\3\2\2\2\u0b5e\u0b5f"+
		"\3\2\2\2\u0b5f\u0b5d\3\2\2\2\u0b5f\u0b60\3\2\2\2\u0b60\u0b61\3\2\2\2\u0b61"+
		"\u0b62\7\16\2\2\u0b62\u0209\3\2\2\2\u0b63\u0b64\b\u0106\1\2\u0b64\u0b68"+
		"\5\u00d4k\2\u0b65\u0b66\7\37\2\2\u0b66\u0b68\5\u00d8m\2\u0b67\u0b63\3"+
		"\2\2\2\u0b67\u0b65\3\2\2\2\u0b68\u0b71\3\2\2\2\u0b69\u0b6b\f\3\2\2\u0b6a"+
		"\u0b6c\5\u00d6l\2\u0b6b\u0b6a\3\2\2\2\u0b6c\u0b6d\3\2\2\2\u0b6d\u0b6b"+
		"\3\2\2\2\u0b6d\u0b6e\3\2\2\2\u0b6e\u0b70\3\2\2\2\u0b6f\u0b69\3\2\2\2\u0b70"+
		"\u0b73\3\2\2\2\u0b71\u0b6f\3\2\2\2\u0b71\u0b72\3\2\2\2\u0b72\u020b\3\2"+
		"\2\2\u0b73\u0b71\3\2\2\2\u0b74\u0b75\7\26\2\2\u0b75\u0b76\5b\62\2\u0b76"+
		"\u0b77\7\27\2\2\u0b77\u0b7a\3\2\2\2\u0b78\u0b7a\5\u020e\u0108\2\u0b79"+
		"\u0b74\3\2\2\2\u0b79\u0b78\3\2\2\2\u0b7a\u020d\3\2\2\2\u0b7b\u0b7d\n\17"+
		"\2\2\u0b7c\u0b7b\3\2\2\2\u0b7d\u0b7e\3\2\2\2\u0b7e\u0b7c\3\2\2\2\u0b7e"+
		"\u0b7f\3\2\2\2\u0b7f\u020f\3\2\2\2\u0120\u0217\u021b\u0236\u023d\u0245"+
		"\u0247\u024f\u025c\u0264\u0268\u0272\u027e\u0284\u0287\u028a\u0293\u029b"+
		"\u02a0\u02a6\u02ae\u02b3\u02b9\u02be\u02c7\u02cc\u02d1\u02da\u02df\u02f3"+
		"\u02f8\u02fb\u0301\u0308\u030b\u0311\u0317\u031a\u0320\u0325\u032a\u032d"+
		"\u0333\u034a\u0354\u0359\u0360\u0362\u0379\u038a\u0391\u0399\u03a1\u03b8"+
		"\u03ba\u03c9\u03d1\u03db\u03f0\u03f4\u0408\u0415\u0419\u0421\u0424\u0429"+
		"\u042c\u0434\u043f\u0443\u044a\u0451\u0458\u045e\u0465\u0475\u0486\u04a1"+
		"\u04a9\u04af\u04b5\u04c8\u04cd\u04d4\u04e2\u04e4\u04f5\u0503\u050c\u0517"+
		"\u0524\u0530\u053c\u0547\u0554\u055f\u0567\u056d\u0576\u057d\u0584\u058c"+
		"\u058e\u0596\u05a1\u05ab\u05b1\u05ba\u05c1\u05c8\u05d0\u05d3\u05e4\u05ed"+
		"\u05fd\u0604\u060b\u060f\u061b\u0622\u0629\u0636\u0644\u064a\u064e\u0659"+
		"\u0661\u0669\u0672\u067c\u067f\u0683\u068f\u0695\u069d\u06a6\u06ae\u06bb"+
		"\u06be\u06c2\u06c7\u06cb\u06d4\u06ee\u06f7\u06f9\u06fe\u0712\u0717\u0720"+
		"\u0724\u072b\u0730\u0734\u0740\u0751\u0756\u0759\u075d\u0762\u0769\u0774"+
		"\u0776\u077f\u0787\u078f\u0797\u079f\u07a7\u07af\u07b5\u07c1\u07c5\u07cf"+
		"\u07d7\u07db\u07e1\u07e8\u07ed\u07f4\u07fc\u0803\u080d\u081a\u081e\u0821"+
		"\u0825\u0828\u0830\u0839\u0842\u084b\u085c\u0861\u086a\u0875\u087c\u0884"+
		"\u088e\u0896\u0899\u089d\u08a2\u08ac\u08b0\u08bb\u08be\u08c5\u08ce\u08d5"+
		"\u08de\u08e9\u08f6\u08fd\u090a\u0914\u0917\u091b\u0931\u0939\u093d\u0944"+
		"\u094d\u0975\u097e\u0988\u0994\u0999\u09a5\u09b7\u09be\u09c3\u09cc\u09d4"+
		"\u09de\u09e3\u09ed\u09f7\u0a07\u0a11\u0a18\u0a20\u0a27\u0a30\u0a39\u0a41"+
		"\u0a4b\u0a50\u0a5c\u0a6f\u0a79\u0a81\u0a88\u0a91\u0a9a\u0aa2\u0aac\u0ab1"+
		"\u0abd\u0acb\u0ad2\u0ada\u0ae1\u0ae5\u0aea\u0aee\u0af3\u0afb\u0b07\u0b13"+
		"\u0b22\u0b29\u0b2f\u0b36\u0b39\u0b3e\u0b44\u0b47\u0b4c\u0b50\u0b56\u0b5f"+
		"\u0b67\u0b6d\u0b71\u0b79\u0b7e";
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