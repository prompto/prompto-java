// Generated from MParser.g4 by ANTLR 4.7.1
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
public class MParser extends AbstractParser {
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
		RULE_index_clause = 5, RULE_concrete_widget_declaration = 6, RULE_native_widget_declaration = 7, 
		RULE_concrete_category_declaration = 8, RULE_singleton_category_declaration = 9, 
		RULE_derived_list = 10, RULE_operator_method_declaration = 11, RULE_setter_method_declaration = 12, 
		RULE_native_setter_declaration = 13, RULE_getter_method_declaration = 14, 
		RULE_native_getter_declaration = 15, RULE_native_category_declaration = 16, 
		RULE_native_resource_declaration = 17, RULE_native_category_bindings = 18, 
		RULE_native_category_binding_list = 19, RULE_abstract_method_declaration = 20, 
		RULE_concrete_method_declaration = 21, RULE_native_method_declaration = 22, 
		RULE_test_method_declaration = 23, RULE_assertion = 24, RULE_typed_argument = 25, 
		RULE_statement = 26, RULE_flush_statement = 27, RULE_store_statement = 28, 
		RULE_method_call_expression = 29, RULE_method_call_statement = 30, RULE_with_resource_statement = 31, 
		RULE_with_singleton_statement = 32, RULE_switch_statement = 33, RULE_switch_case_statement = 34, 
		RULE_for_each_statement = 35, RULE_do_while_statement = 36, RULE_while_statement = 37, 
		RULE_if_statement = 38, RULE_else_if_statement_list = 39, RULE_raise_statement = 40, 
		RULE_try_statement = 41, RULE_catch_statement = 42, RULE_break_statement = 43, 
		RULE_return_statement = 44, RULE_expression = 45, RULE_closure_expression = 46, 
		RULE_selectable_expression = 47, RULE_instance_expression = 48, RULE_mutable_instance_expression = 49, 
		RULE_method_expression = 50, RULE_instance_selector = 51, RULE_blob_expression = 52, 
		RULE_document_expression = 53, RULE_constructor_expression = 54, RULE_copy_from = 55, 
		RULE_argument_assignment_list = 56, RULE_argument_assignment = 57, RULE_write_statement = 58, 
		RULE_filtered_list_suffix = 59, RULE_fetch_expression = 60, RULE_fetch_statement = 61, 
		RULE_sorted_expression = 62, RULE_assign_instance_statement = 63, RULE_child_instance = 64, 
		RULE_assign_tuple_statement = 65, RULE_lfs = 66, RULE_lfp = 67, RULE_ws_plus = 68, 
		RULE_indent = 69, RULE_dedent = 70, RULE_type_literal = 71, RULE_null_literal = 72, 
		RULE_repl = 73, RULE_declaration_list = 74, RULE_declarations = 75, RULE_declaration = 76, 
		RULE_annotation_constructor = 77, RULE_annotation_identifier = 78, RULE_annotation_argument = 79, 
		RULE_annotation_argument_name = 80, RULE_annotation_argument_value = 81, 
		RULE_resource_declaration = 82, RULE_enum_declaration = 83, RULE_native_symbol_list = 84, 
		RULE_category_symbol_list = 85, RULE_symbol_list = 86, RULE_attribute_constraint = 87, 
		RULE_list_literal = 88, RULE_set_literal = 89, RULE_expression_list = 90, 
		RULE_range_literal = 91, RULE_typedef = 92, RULE_primary_type = 93, RULE_native_type = 94, 
		RULE_category_type = 95, RULE_mutable_category_type = 96, RULE_code_type = 97, 
		RULE_category_declaration = 98, RULE_widget_declaration = 99, RULE_type_identifier_list = 100, 
		RULE_method_identifier = 101, RULE_identifier_or_keyword = 102, RULE_nospace_hyphen_identifier_or_keyword = 103, 
		RULE_nospace_identifier_or_keyword = 104, RULE_identifier = 105, RULE_member_identifier = 106, 
		RULE_variable_identifier = 107, RULE_attribute_identifier = 108, RULE_type_identifier = 109, 
		RULE_symbol_identifier = 110, RULE_argument_list = 111, RULE_argument = 112, 
		RULE_operator_argument = 113, RULE_named_argument = 114, RULE_code_argument = 115, 
		RULE_category_or_any_type = 116, RULE_any_type = 117, RULE_member_method_declaration_list = 118, 
		RULE_member_method_declaration = 119, RULE_native_member_method_declaration_list = 120, 
		RULE_native_member_method_declaration = 121, RULE_native_category_binding = 122, 
		RULE_python_category_binding = 123, RULE_python_module = 124, RULE_javascript_category_binding = 125, 
		RULE_javascript_module = 126, RULE_variable_identifier_list = 127, RULE_attribute_identifier_list = 128, 
		RULE_method_declaration = 129, RULE_comment_statement = 130, RULE_native_statement_list = 131, 
		RULE_native_statement = 132, RULE_python_native_statement = 133, RULE_javascript_native_statement = 134, 
		RULE_statement_list = 135, RULE_assertion_list = 136, RULE_switch_case_statement_list = 137, 
		RULE_catch_statement_list = 138, RULE_literal_collection = 139, RULE_atomic_literal = 140, 
		RULE_literal_list_literal = 141, RULE_this_expression = 142, RULE_super_expression = 143, 
		RULE_parenthesis_expression = 144, RULE_literal_expression = 145, RULE_collection_literal = 146, 
		RULE_tuple_literal = 147, RULE_dict_literal = 148, RULE_document_literal = 149, 
		RULE_expression_tuple = 150, RULE_dict_entry_list = 151, RULE_dict_entry = 152, 
		RULE_dict_key = 153, RULE_slice_arguments = 154, RULE_assign_variable_statement = 155, 
		RULE_assignable_instance = 156, RULE_is_expression = 157, RULE_arrow_expression = 158, 
		RULE_arrow_prefix = 159, RULE_arrow_args = 160, RULE_sorted_key = 161, 
		RULE_read_blob_expression = 162, RULE_read_all_expression = 163, RULE_read_one_expression = 164, 
		RULE_order_by_list = 165, RULE_order_by = 166, RULE_operator = 167, RULE_keyword = 168, 
		RULE_new_token = 169, RULE_key_token = 170, RULE_module_token = 171, RULE_value_token = 172, 
		RULE_symbols_token = 173, RULE_assign = 174, RULE_multiply = 175, RULE_divide = 176, 
		RULE_idivide = 177, RULE_modulo = 178, RULE_javascript_statement = 179, 
		RULE_javascript_expression = 180, RULE_javascript_primary_expression = 181, 
		RULE_javascript_this_expression = 182, RULE_javascript_new_expression = 183, 
		RULE_javascript_selector_expression = 184, RULE_javascript_method_expression = 185, 
		RULE_javascript_arguments = 186, RULE_javascript_item_expression = 187, 
		RULE_javascript_parenthesis_expression = 188, RULE_javascript_identifier_expression = 189, 
		RULE_javascript_literal_expression = 190, RULE_javascript_identifier = 191, 
		RULE_python_statement = 192, RULE_python_expression = 193, RULE_python_primary_expression = 194, 
		RULE_python_self_expression = 195, RULE_python_selector_expression = 196, 
		RULE_python_method_expression = 197, RULE_python_argument_list = 198, 
		RULE_python_ordinal_argument_list = 199, RULE_python_named_argument_list = 200, 
		RULE_python_parenthesis_expression = 201, RULE_python_identifier_expression = 202, 
		RULE_python_literal_expression = 203, RULE_python_identifier = 204, RULE_java_statement = 205, 
		RULE_java_expression = 206, RULE_java_primary_expression = 207, RULE_java_this_expression = 208, 
		RULE_java_new_expression = 209, RULE_java_selector_expression = 210, RULE_java_method_expression = 211, 
		RULE_java_arguments = 212, RULE_java_item_expression = 213, RULE_java_parenthesis_expression = 214, 
		RULE_java_identifier_expression = 215, RULE_java_class_identifier_expression = 216, 
		RULE_java_literal_expression = 217, RULE_java_identifier = 218, RULE_csharp_statement = 219, 
		RULE_csharp_expression = 220, RULE_csharp_primary_expression = 221, RULE_csharp_this_expression = 222, 
		RULE_csharp_new_expression = 223, RULE_csharp_selector_expression = 224, 
		RULE_csharp_method_expression = 225, RULE_csharp_arguments = 226, RULE_csharp_item_expression = 227, 
		RULE_csharp_parenthesis_expression = 228, RULE_csharp_identifier_expression = 229, 
		RULE_csharp_literal_expression = 230, RULE_csharp_identifier = 231, RULE_jsx_expression = 232, 
		RULE_jsx_element = 233, RULE_jsx_fragment = 234, RULE_jsx_fragment_start = 235, 
		RULE_jsx_fragment_end = 236, RULE_jsx_self_closing = 237, RULE_jsx_opening = 238, 
		RULE_jsx_closing = 239, RULE_jsx_element_name = 240, RULE_jsx_identifier = 241, 
		RULE_jsx_attribute = 242, RULE_jsx_attribute_value = 243, RULE_jsx_children = 244, 
		RULE_jsx_child = 245, RULE_jsx_text = 246, RULE_jsx_char = 247, RULE_css_expression = 248, 
		RULE_css_field = 249, RULE_css_identifier = 250, RULE_css_value = 251, 
		RULE_css_text = 252;
	public static final String[] ruleNames = {
		"enum_category_declaration", "enum_native_declaration", "native_symbol", 
		"category_symbol", "attribute_declaration", "index_clause", "concrete_widget_declaration", 
		"native_widget_declaration", "concrete_category_declaration", "singleton_category_declaration", 
		"derived_list", "operator_method_declaration", "setter_method_declaration", 
		"native_setter_declaration", "getter_method_declaration", "native_getter_declaration", 
		"native_category_declaration", "native_resource_declaration", "native_category_bindings", 
		"native_category_binding_list", "abstract_method_declaration", "concrete_method_declaration", 
		"native_method_declaration", "test_method_declaration", "assertion", "typed_argument", 
		"statement", "flush_statement", "store_statement", "method_call_expression", 
		"method_call_statement", "with_resource_statement", "with_singleton_statement", 
		"switch_statement", "switch_case_statement", "for_each_statement", "do_while_statement", 
		"while_statement", "if_statement", "else_if_statement_list", "raise_statement", 
		"try_statement", "catch_statement", "break_statement", "return_statement", 
		"expression", "closure_expression", "selectable_expression", "instance_expression", 
		"mutable_instance_expression", "method_expression", "instance_selector", 
		"blob_expression", "document_expression", "constructor_expression", "copy_from", 
		"argument_assignment_list", "argument_assignment", "write_statement", 
		"filtered_list_suffix", "fetch_expression", "fetch_statement", "sorted_expression", 
		"assign_instance_statement", "child_instance", "assign_tuple_statement", 
		"lfs", "lfp", "ws_plus", "indent", "dedent", "type_literal", "null_literal", 
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
		"expression_tuple", "dict_entry_list", "dict_entry", "dict_key", "slice_arguments", 
		"assign_variable_statement", "assignable_instance", "is_expression", "arrow_expression", 
		"arrow_prefix", "arrow_args", "sorted_key", "read_blob_expression", "read_all_expression", 
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
	public String getGrammarFileName() { return "MParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Enum_category_declarationContext extends ParserRuleContext {
		public Type_identifierContext name;
		public Type_identifierContext derived;
		public Attribute_identifier_listContext attrs;
		public Category_symbol_listContext symbols;
		public TerminalNode ENUM() { return getToken(MParser.ENUM, 0); }
		public TerminalNode LPAR() { return getToken(MParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(MParser.RPAR, 0); }
		public TerminalNode COLON() { return getToken(MParser.COLON, 0); }
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
		public Attribute_identifier_listContext attribute_identifier_list() {
			return getRuleContext(Attribute_identifier_listContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(MParser.COMMA, 0); }
		public Enum_category_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_category_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterEnum_category_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitEnum_category_declaration(this);
		}
	}

	public final Enum_category_declarationContext enum_category_declaration() throws RecognitionException {
		Enum_category_declarationContext _localctx = new Enum_category_declarationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_enum_category_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			match(ENUM);
			setState(507);
			((Enum_category_declarationContext)_localctx).name = type_identifier();
			setState(508);
			match(LPAR);
			setState(515);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE_IDENTIFIER:
				{
				setState(509);
				((Enum_category_declarationContext)_localctx).derived = type_identifier();
				setState(512);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(510);
					match(COMMA);
					setState(511);
					((Enum_category_declarationContext)_localctx).attrs = attribute_identifier_list();
					}
				}

				}
				break;
			case STORABLE:
			case VARIABLE_IDENTIFIER:
				{
				setState(514);
				((Enum_category_declarationContext)_localctx).attrs = attribute_identifier_list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(517);
			match(RPAR);
			setState(518);
			match(COLON);
			setState(519);
			indent();
			setState(520);
			((Enum_category_declarationContext)_localctx).symbols = category_symbol_list();
			setState(521);
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
		public TerminalNode ENUM() { return getToken(MParser.ENUM, 0); }
		public TerminalNode LPAR() { return getToken(MParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(MParser.RPAR, 0); }
		public TerminalNode COLON() { return getToken(MParser.COLON, 0); }
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterEnum_native_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitEnum_native_declaration(this);
		}
	}

	public final Enum_native_declarationContext enum_native_declaration() throws RecognitionException {
		Enum_native_declarationContext _localctx = new Enum_native_declarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_enum_native_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			match(ENUM);
			setState(524);
			((Enum_native_declarationContext)_localctx).name = type_identifier();
			setState(525);
			match(LPAR);
			setState(526);
			((Enum_native_declarationContext)_localctx).typ = native_type();
			setState(527);
			match(RPAR);
			setState(528);
			match(COLON);
			setState(529);
			indent();
			setState(530);
			((Enum_native_declarationContext)_localctx).symbols = native_symbol_list();
			setState(531);
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
		public TerminalNode EQ() { return getToken(MParser.EQ, 0); }
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterNative_symbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitNative_symbol(this);
		}
	}

	public final Native_symbolContext native_symbol() throws RecognitionException {
		Native_symbolContext _localctx = new Native_symbolContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_native_symbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			((Native_symbolContext)_localctx).name = symbol_identifier();
			setState(534);
			match(EQ);
			setState(535);
			((Native_symbolContext)_localctx).exp = expression(0);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode LPAR() { return getToken(MParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(MParser.RPAR, 0); }
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterCategory_symbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitCategory_symbol(this);
		}
	}

	public final Category_symbolContext category_symbol() throws RecognitionException {
		Category_symbolContext _localctx = new Category_symbolContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_category_symbol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			((Category_symbolContext)_localctx).name = symbol_identifier();
			setState(538);
			match(LPAR);
			setState(540);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << LTCOLONGT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (CODE - 65)) | (1L << (DOCUMENT - 65)) | (1L << (BLOB - 65)) | (1L << (IMAGE - 65)) | (1L << (UUID - 65)) | (1L << (ITERATOR - 65)) | (1L << (CURSOR - 65)) | (1L << (HTML - 65)) | (1L << (ANY - 65)) | (1L << (EXECUTE - 65)) | (1L << (FETCH - 65)) | (1L << (MUTABLE - 65)) | (1L << (NONE - 65)) | (1L << (NOT - 65)))) != 0) || ((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & ((1L << (READ - 138)) | (1L << (SELF - 138)) | (1L << (SORTED - 138)) | (1L << (SUPER - 138)) | (1L << (THIS - 138)) | (1L << (BOOLEAN_LITERAL - 138)) | (1L << (CHAR_LITERAL - 138)) | (1L << (MIN_INTEGER - 138)) | (1L << (MAX_INTEGER - 138)) | (1L << (SYMBOL_IDENTIFIER - 138)) | (1L << (TYPE_IDENTIFIER - 138)) | (1L << (VARIABLE_IDENTIFIER - 138)) | (1L << (TEXT_LITERAL - 138)) | (1L << (UUID_LITERAL - 138)) | (1L << (INTEGER_LITERAL - 138)) | (1L << (HEXA_LITERAL - 138)) | (1L << (DECIMAL_LITERAL - 138)) | (1L << (DATETIME_LITERAL - 138)) | (1L << (TIME_LITERAL - 138)) | (1L << (DATE_LITERAL - 138)) | (1L << (PERIOD_LITERAL - 138)) | (1L << (VERSION_LITERAL - 138)))) != 0)) {
				{
				setState(539);
				((Category_symbolContext)_localctx).args = argument_assignment_list(0);
				}
			}

			setState(542);
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

	public static class Attribute_declarationContext extends ParserRuleContext {
		public Attribute_identifierContext name;
		public TypedefContext typ;
		public Attribute_constraintContext match;
		public Index_clauseContext indices;
		public TerminalNode ATTR() { return getToken(MParser.ATTR, 0); }
		public TerminalNode LPAR() { return getToken(MParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(MParser.RPAR, 0); }
		public Attribute_identifierContext attribute_identifier() {
			return getRuleContext(Attribute_identifierContext.class,0);
		}
		public TypedefContext typedef() {
			return getRuleContext(TypedefContext.class,0);
		}
		public TerminalNode STORABLE() { return getToken(MParser.STORABLE, 0); }
		public TerminalNode COLON() { return getToken(MParser.COLON, 0); }
		public IndentContext indent() {
			return getRuleContext(IndentContext.class,0);
		}
		public DedentContext dedent() {
			return getRuleContext(DedentContext.class,0);
		}
		public TerminalNode PASS() { return getToken(MParser.PASS, 0); }
		public Attribute_constraintContext attribute_constraint() {
			return getRuleContext(Attribute_constraintContext.class,0);
		}
		public Index_clauseContext index_clause() {
			return getRuleContext(Index_clauseContext.class,0);
		}
		public LfpContext lfp() {
			return getRuleContext(LfpContext.class,0);
		}
		public Attribute_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterAttribute_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitAttribute_declaration(this);
		}
	}

	public final Attribute_declarationContext attribute_declaration() throws RecognitionException {
		Attribute_declarationContext _localctx = new Attribute_declarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_attribute_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STORABLE) {
				{
				setState(544);
				match(STORABLE);
				}
			}

			setState(547);
			match(ATTR);
			setState(548);
			((Attribute_declarationContext)_localctx).name = attribute_identifier();
			setState(549);
			match(LPAR);
			setState(550);
			((Attribute_declarationContext)_localctx).typ = typedef(0);
			setState(551);
			match(RPAR);
			setState(573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(552);
				match(COLON);
				setState(553);
				indent();
				setState(569);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PASS:
					{
					setState(554);
					match(PASS);
					}
					break;
				case IN:
				case INDEX:
				case MATCHING:
					{
					setState(567);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IN:
					case MATCHING:
						{
						setState(555);
						((Attribute_declarationContext)_localctx).match = attribute_constraint();
						setState(559);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
						case 1:
							{
							setState(556);
							lfp();
							setState(557);
							((Attribute_declarationContext)_localctx).indices = index_clause();
							}
							break;
						}
						}
						break;
					case INDEX:
						{
						setState(561);
						((Attribute_declarationContext)_localctx).indices = index_clause();
						setState(565);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
						case 1:
							{
							setState(562);
							lfp();
							setState(563);
							((Attribute_declarationContext)_localctx).match = attribute_constraint();
							}
							break;
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(571);
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

	public static class Index_clauseContext extends ParserRuleContext {
		public Variable_identifier_listContext indices;
		public TerminalNode INDEX() { return getToken(MParser.INDEX, 0); }
		public TerminalNode LPAR() { return getToken(MParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(MParser.RPAR, 0); }
		public Variable_identifier_listContext variable_identifier_list() {
			return getRuleContext(Variable_identifier_listContext.class,0);
		}
		public Index_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterIndex_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitIndex_clause(this);
		}
	}

	public final Index_clauseContext index_clause() throws RecognitionException {
		Index_clauseContext _localctx = new Index_clauseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_index_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			match(INDEX);
			setState(576);
			match(LPAR);
			setState(578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARIABLE_IDENTIFIER) {
				{
				setState(577);
				((Index_clauseContext)_localctx).indices = variable_identifier_list();
				}
			}

			setState(580);
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

	public static class Concrete_widget_declarationContext extends ParserRuleContext {
		public Type_identifierContext name;
		public Type_identifierContext derived;
		public Member_method_declaration_listContext methods;
		public TerminalNode WIDGET() { return getToken(MParser.WIDGET, 0); }
		public TerminalNode LPAR() { return getToken(MParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(MParser.RPAR, 0); }
		public TerminalNode COLON() { return getToken(MParser.COLON, 0); }
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
		public TerminalNode PASS() { return getToken(MParser.PASS, 0); }
		public Member_method_declaration_listContext member_method_declaration_list() {
			return getRuleContext(Member_method_declaration_listContext.class,0);
		}
		public Concrete_widget_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concrete_widget_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterConcrete_widget_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitConcrete_widget_declaration(this);
		}
	}

	public final Concrete_widget_declarationContext concrete_widget_declaration() throws RecognitionException {
		Concrete_widget_declarationContext _localctx = new Concrete_widget_declarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_concrete_widget_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			match(WIDGET);
			setState(583);
			((Concrete_widget_declarationContext)_localctx).name = type_identifier();
			setState(584);
			match(LPAR);
			setState(586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE_IDENTIFIER) {
				{
				setState(585);
				((Concrete_widget_declarationContext)_localctx).derived = type_identifier();
				}
			}

			setState(588);
			match(RPAR);
			setState(589);
			match(COLON);
			setState(590);
			indent();
			setState(593);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMENT:
			case ABSTRACT:
			case DEF:
			case ARONDBASE_IDENTIFIER:
				{
				setState(591);
				((Concrete_widget_declarationContext)_localctx).methods = member_method_declaration_list();
				}
				break;
			case PASS:
				{
				setState(592);
				match(PASS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(595);
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

	public static class Native_widget_declarationContext extends ParserRuleContext {
		public Type_identifierContext name;
		public Native_category_bindingsContext bindings;
		public Native_member_method_declaration_listContext methods;
		public TerminalNode NATIVE() { return getToken(MParser.NATIVE, 0); }
		public TerminalNode WIDGET() { return getToken(MParser.WIDGET, 0); }
		public TerminalNode LPAR() { return getToken(MParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(MParser.RPAR, 0); }
		public TerminalNode COLON() { return getToken(MParser.COLON, 0); }
		public IndentContext indent() {
			return getRuleContext(IndentContext.class,0);
		}
		public LfpContext lfp() {
			return getRuleContext(LfpContext.class,0);
		}
		public DedentContext dedent() {
			return getRuleContext(DedentContext.class,0);
		}
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterNative_widget_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitNative_widget_declaration(this);
		}
	}

	public final Native_widget_declarationContext native_widget_declaration() throws RecognitionException {
		Native_widget_declarationContext _localctx = new Native_widget_declarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_native_widget_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			match(NATIVE);
			setState(598);
			match(WIDGET);
			setState(599);
			((Native_widget_declarationContext)_localctx).name = type_identifier();
			setState(600);
			match(LPAR);
			setState(601);
			match(RPAR);
			setState(602);
			match(COLON);
			setState(603);
			indent();
			setState(604);
			((Native_widget_declarationContext)_localctx).bindings = native_category_bindings();
			setState(605);
			lfp();
			setState(606);
			((Native_widget_declarationContext)_localctx).methods = native_member_method_declaration_list();
			setState(607);
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
		public Attribute_identifier_listContext attrs;
		public Member_method_declaration_listContext methods;
		public TerminalNode LPAR() { return getToken(MParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(MParser.RPAR, 0); }
		public TerminalNode CLASS() { return getToken(MParser.CLASS, 0); }
		public TerminalNode CATEGORY() { return getToken(MParser.CATEGORY, 0); }
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(MParser.COMMA, 0); }
		public TerminalNode STORABLE() { return getToken(MParser.STORABLE, 0); }
		public Derived_listContext derived_list() {
			return getRuleContext(Derived_listContext.class,0);
		}
		public Attribute_identifier_listContext attribute_identifier_list() {
			return getRuleContext(Attribute_identifier_listContext.class,0);
		}
		public TerminalNode COLON() { return getToken(MParser.COLON, 0); }
		public IndentContext indent() {
			return getRuleContext(IndentContext.class,0);
		}
		public DedentContext dedent() {
			return getRuleContext(DedentContext.class,0);
		}
		public TerminalNode PASS() { return getToken(MParser.PASS, 0); }
		public Member_method_declaration_listContext member_method_declaration_list() {
			return getRuleContext(Member_method_declaration_listContext.class,0);
		}
		public Concrete_category_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concrete_category_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterConcrete_category_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitConcrete_category_declaration(this);
		}
	}

	public final Concrete_category_declarationContext concrete_category_declaration() throws RecognitionException {
		Concrete_category_declarationContext _localctx = new Concrete_category_declarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_concrete_category_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STORABLE) {
				{
				setState(609);
				match(STORABLE);
				}
			}

			setState(612);
			_la = _input.LA(1);
			if ( !(_la==CATEGORY || _la==CLASS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(613);
			((Concrete_category_declarationContext)_localctx).name = type_identifier();
			setState(614);
			match(LPAR);
			setState(621);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(615);
				((Concrete_category_declarationContext)_localctx).derived = derived_list();
				}
				break;
			case 2:
				{
				setState(616);
				((Concrete_category_declarationContext)_localctx).attrs = attribute_identifier_list();
				}
				break;
			case 3:
				{
				setState(617);
				((Concrete_category_declarationContext)_localctx).derived = derived_list();
				setState(618);
				match(COMMA);
				setState(619);
				((Concrete_category_declarationContext)_localctx).attrs = attribute_identifier_list();
				}
				break;
			}
			setState(623);
			match(RPAR);
			setState(632);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(624);
				match(COLON);
				setState(625);
				indent();
				setState(628);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COMMENT:
				case ABSTRACT:
				case DEF:
				case ARONDBASE_IDENTIFIER:
					{
					setState(626);
					((Concrete_category_declarationContext)_localctx).methods = member_method_declaration_list();
					}
					break;
				case PASS:
					{
					setState(627);
					match(PASS);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(630);
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

	public static class Singleton_category_declarationContext extends ParserRuleContext {
		public Type_identifierContext name;
		public Attribute_identifier_listContext attrs;
		public Member_method_declaration_listContext methods;
		public TerminalNode SINGLETON() { return getToken(MParser.SINGLETON, 0); }
		public TerminalNode LPAR() { return getToken(MParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(MParser.RPAR, 0); }
		public TerminalNode COLON() { return getToken(MParser.COLON, 0); }
		public IndentContext indent() {
			return getRuleContext(IndentContext.class,0);
		}
		public DedentContext dedent() {
			return getRuleContext(DedentContext.class,0);
		}
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Attribute_identifier_listContext attribute_identifier_list() {
			return getRuleContext(Attribute_identifier_listContext.class,0);
		}
		public TerminalNode PASS() { return getToken(MParser.PASS, 0); }
		public Member_method_declaration_listContext member_method_declaration_list() {
			return getRuleContext(Member_method_declaration_listContext.class,0);
		}
		public Singleton_category_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleton_category_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterSingleton_category_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitSingleton_category_declaration(this);
		}
	}

	public final Singleton_category_declarationContext singleton_category_declaration() throws RecognitionException {
		Singleton_category_declarationContext _localctx = new Singleton_category_declarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_singleton_category_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			match(SINGLETON);
			setState(635);
			((Singleton_category_declarationContext)_localctx).name = type_identifier();
			setState(636);
			match(LPAR);
			setState(637);
			((Singleton_category_declarationContext)_localctx).attrs = attribute_identifier_list();
			setState(638);
			match(RPAR);
			setState(639);
			match(COLON);
			setState(640);
			indent();
			setState(643);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMENT:
			case ABSTRACT:
			case DEF:
			case ARONDBASE_IDENTIFIER:
				{
				setState(641);
				((Singleton_category_declarationContext)_localctx).methods = member_method_declaration_list();
				}
				break;
			case PASS:
				{
				setState(642);
				match(PASS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(645);
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

	public static class Derived_listContext extends ParserRuleContext {
		public Type_identifier_listContext items;
		public Type_identifier_listContext type_identifier_list() {
			return getRuleContext(Type_identifier_listContext.class,0);
		}
		public Derived_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_derived_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterDerived_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitDerived_list(this);
		}
	}

	public final Derived_listContext derived_list() throws RecognitionException {
		Derived_listContext _localctx = new Derived_listContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_derived_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			((Derived_listContext)_localctx).items = type_identifier_list();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode DEF() { return getToken(MParser.DEF, 0); }
		public TerminalNode OPERATOR() { return getToken(MParser.OPERATOR, 0); }
		public TerminalNode LPAR() { return getToken(MParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(MParser.RPAR, 0); }
		public TerminalNode COLON() { return getToken(MParser.COLON, 0); }
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
		public TerminalNode RARROW() { return getToken(MParser.RARROW, 0); }
		public TypedefContext typedef() {
			return getRuleContext(TypedefContext.class,0);
		}
		public Operator_method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_method_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterOperator_method_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitOperator_method_declaration(this);
		}
	}

	public final Operator_method_declarationContext operator_method_declaration() throws RecognitionException {
		Operator_method_declarationContext _localctx = new Operator_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_operator_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			match(DEF);
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
			setState(657);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RARROW) {
				{
				setState(655);
				match(RARROW);
				setState(656);
				((Operator_method_declarationContext)_localctx).typ = typedef(0);
				}
			}

			setState(659);
			match(COLON);
			setState(660);
			indent();
			setState(661);
			((Operator_method_declarationContext)_localctx).stmts = statement_list();
			setState(662);
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
		public TerminalNode DEF() { return getToken(MParser.DEF, 0); }
		public TerminalNode SETTER() { return getToken(MParser.SETTER, 0); }
		public TerminalNode LPAR() { return getToken(MParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(MParser.RPAR, 0); }
		public TerminalNode COLON() { return getToken(MParser.COLON, 0); }
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterSetter_method_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitSetter_method_declaration(this);
		}
	}

	public final Setter_method_declarationContext setter_method_declaration() throws RecognitionException {
		Setter_method_declarationContext _localctx = new Setter_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_setter_method_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(664);
			match(DEF);
			setState(665);
			((Setter_method_declarationContext)_localctx).name = variable_identifier();
			setState(666);
			match(SETTER);
			setState(667);
			match(LPAR);
			setState(668);
			match(RPAR);
			setState(669);
			match(COLON);
			setState(670);
			indent();
			setState(671);
			((Setter_method_declarationContext)_localctx).stmts = statement_list();
			setState(672);
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
		public TerminalNode DEF() { return getToken(MParser.DEF, 0); }
		public TerminalNode SETTER() { return getToken(MParser.SETTER, 0); }
		public TerminalNode LPAR() { return getToken(MParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(MParser.RPAR, 0); }
		public TerminalNode COLON() { return getToken(MParser.COLON, 0); }
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
		public TerminalNode NATIVE() { return getToken(MParser.NATIVE, 0); }
		public Native_setter_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_native_setter_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterNative_setter_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitNative_setter_declaration(this);
		}
	}

	public final Native_setter_declarationContext native_setter_declaration() throws RecognitionException {
		Native_setter_declarationContext _localctx = new Native_setter_declarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_native_setter_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			match(DEF);
			setState(675);
			((Native_setter_declarationContext)_localctx).name = variable_identifier();
			setState(677);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NATIVE) {
				{
				setState(676);
				match(NATIVE);
				}
			}

			setState(679);
			match(SETTER);
			setState(680);
			match(LPAR);
			setState(681);
			match(RPAR);
			setState(682);
			match(COLON);
			setState(683);
			indent();
			setState(684);
			((Native_setter_declarationContext)_localctx).stmts = native_statement_list();
			setState(685);
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
		public TerminalNode DEF() { return getToken(MParser.DEF, 0); }
		public TerminalNode GETTER() { return getToken(MParser.GETTER, 0); }
		public TerminalNode LPAR() { return getToken(MParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(MParser.RPAR, 0); }
		public TerminalNode COLON() { return getToken(MParser.COLON, 0); }
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterGetter_method_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitGetter_method_declaration(this);
		}
	}

	public final Getter_method_declarationContext getter_method_declaration() throws RecognitionException {
		Getter_method_declarationContext _localctx = new Getter_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_getter_method_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
			match(DEF);
			setState(688);
			((Getter_method_declarationContext)_localctx).name = variable_identifier();
			setState(689);
			match(GETTER);
			setState(690);
			match(LPAR);
			setState(691);
			match(RPAR);
			setState(692);
			match(COLON);
			setState(693);
			indent();
			setState(694);
			((Getter_method_declarationContext)_localctx).stmts = statement_list();
			setState(695);
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
		public TerminalNode DEF() { return getToken(MParser.DEF, 0); }
		public TerminalNode GETTER() { return getToken(MParser.GETTER, 0); }
		public TerminalNode LPAR() { return getToken(MParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(MParser.RPAR, 0); }
		public TerminalNode COLON() { return getToken(MParser.COLON, 0); }
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
		public TerminalNode NATIVE() { return getToken(MParser.NATIVE, 0); }
		public Native_getter_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_native_getter_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterNative_getter_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitNative_getter_declaration(this);
		}
	}

	public final Native_getter_declarationContext native_getter_declaration() throws RecognitionException {
		Native_getter_declarationContext _localctx = new Native_getter_declarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_native_getter_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697);
			match(DEF);
			setState(698);
			((Native_getter_declarationContext)_localctx).name = variable_identifier();
			setState(700);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NATIVE) {
				{
				setState(699);
				match(NATIVE);
				}
			}

			setState(702);
			match(GETTER);
			setState(703);
			match(LPAR);
			setState(704);
			match(RPAR);
			setState(705);
			match(COLON);
			setState(706);
			indent();
			setState(707);
			((Native_getter_declarationContext)_localctx).stmts = native_statement_list();
			setState(708);
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
		public Attribute_identifier_listContext attrs;
		public Native_category_bindingsContext bindings;
		public Native_member_method_declaration_listContext methods;
		public TerminalNode NATIVE() { return getToken(MParser.NATIVE, 0); }
		public TerminalNode LPAR() { return getToken(MParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(MParser.RPAR, 0); }
		public TerminalNode COLON() { return getToken(MParser.COLON, 0); }
		public IndentContext indent() {
			return getRuleContext(IndentContext.class,0);
		}
		public DedentContext dedent() {
			return getRuleContext(DedentContext.class,0);
		}
		public TerminalNode CLASS() { return getToken(MParser.CLASS, 0); }
		public TerminalNode CATEGORY() { return getToken(MParser.CATEGORY, 0); }
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Native_category_bindingsContext native_category_bindings() {
			return getRuleContext(Native_category_bindingsContext.class,0);
		}
		public TerminalNode STORABLE() { return getToken(MParser.STORABLE, 0); }
		public LfpContext lfp() {
			return getRuleContext(LfpContext.class,0);
		}
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterNative_category_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitNative_category_declaration(this);
		}
	}

	public final Native_category_declarationContext native_category_declaration() throws RecognitionException {
		Native_category_declarationContext _localctx = new Native_category_declarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_native_category_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(711);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STORABLE) {
				{
				setState(710);
				match(STORABLE);
				}
			}

			setState(713);
			match(NATIVE);
			setState(714);
			_la = _input.LA(1);
			if ( !(_la==CATEGORY || _la==CLASS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(715);
			((Native_category_declarationContext)_localctx).name = type_identifier();
			setState(716);
			match(LPAR);
			setState(718);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STORABLE || _la==VARIABLE_IDENTIFIER) {
				{
				setState(717);
				((Native_category_declarationContext)_localctx).attrs = attribute_identifier_list();
				}
			}

			setState(720);
			match(RPAR);
			setState(721);
			match(COLON);
			setState(722);
			indent();
			setState(723);
			((Native_category_declarationContext)_localctx).bindings = native_category_bindings();
			setState(727);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(724);
				lfp();
				setState(725);
				((Native_category_declarationContext)_localctx).methods = native_member_method_declaration_list();
				}
				break;
			}
			setState(729);
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

	public static class Native_resource_declarationContext extends ParserRuleContext {
		public Type_identifierContext name;
		public Attribute_identifier_listContext attrs;
		public Native_category_bindingsContext bindings;
		public Native_member_method_declaration_listContext methods;
		public TerminalNode NATIVE() { return getToken(MParser.NATIVE, 0); }
		public TerminalNode RESOURCE() { return getToken(MParser.RESOURCE, 0); }
		public TerminalNode LPAR() { return getToken(MParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(MParser.RPAR, 0); }
		public TerminalNode COLON() { return getToken(MParser.COLON, 0); }
		public IndentContext indent() {
			return getRuleContext(IndentContext.class,0);
		}
		public DedentContext dedent() {
			return getRuleContext(DedentContext.class,0);
		}
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Native_category_bindingsContext native_category_bindings() {
			return getRuleContext(Native_category_bindingsContext.class,0);
		}
		public TerminalNode STORABLE() { return getToken(MParser.STORABLE, 0); }
		public LfpContext lfp() {
			return getRuleContext(LfpContext.class,0);
		}
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterNative_resource_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitNative_resource_declaration(this);
		}
	}

	public final Native_resource_declarationContext native_resource_declaration() throws RecognitionException {
		Native_resource_declarationContext _localctx = new Native_resource_declarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_native_resource_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STORABLE) {
				{
				setState(731);
				match(STORABLE);
				}
			}

			setState(734);
			match(NATIVE);
			setState(735);
			match(RESOURCE);
			setState(736);
			((Native_resource_declarationContext)_localctx).name = type_identifier();
			setState(737);
			match(LPAR);
			setState(739);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STORABLE || _la==VARIABLE_IDENTIFIER) {
				{
				setState(738);
				((Native_resource_declarationContext)_localctx).attrs = attribute_identifier_list();
				}
			}

			setState(741);
			match(RPAR);
			setState(742);
			match(COLON);
			setState(743);
			indent();
			setState(744);
			((Native_resource_declarationContext)_localctx).bindings = native_category_bindings();
			setState(748);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(745);
				lfp();
				setState(746);
				((Native_resource_declarationContext)_localctx).methods = native_member_method_declaration_list();
				}
				break;
			}
			setState(750);
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

	public static class Native_category_bindingsContext extends ParserRuleContext {
		public Native_category_binding_listContext items;
		public TerminalNode DEF() { return getToken(MParser.DEF, 0); }
		public TerminalNode BINDINGS() { return getToken(MParser.BINDINGS, 0); }
		public TerminalNode COLON() { return getToken(MParser.COLON, 0); }
		public IndentContext indent() {
			return getRuleContext(IndentContext.class,0);
		}
		public DedentContext dedent() {
			return getRuleContext(DedentContext.class,0);
		}
		public TerminalNode CLASS() { return getToken(MParser.CLASS, 0); }
		public TerminalNode CATEGORY() { return getToken(MParser.CATEGORY, 0); }
		public Native_category_binding_listContext native_category_binding_list() {
			return getRuleContext(Native_category_binding_listContext.class,0);
		}
		public Native_category_bindingsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_native_category_bindings; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterNative_category_bindings(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitNative_category_bindings(this);
		}
	}

	public final Native_category_bindingsContext native_category_bindings() throws RecognitionException {
		Native_category_bindingsContext _localctx = new Native_category_bindingsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_native_category_bindings);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(752);
			match(DEF);
			setState(753);
			_la = _input.LA(1);
			if ( !(_la==CATEGORY || _la==CLASS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(754);
			match(BINDINGS);
			setState(755);
			match(COLON);
			setState(756);
			indent();
			setState(757);
			((Native_category_bindingsContext)_localctx).items = native_category_binding_list(0);
			setState(758);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterNativeCategoryBindingListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitNativeCategoryBindingListItem(this);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterNativeCategoryBindingList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitNativeCategoryBindingList(this);
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

			setState(761);
			((NativeCategoryBindingListContext)_localctx).item = native_category_binding();
			}
			_ctx.stop = _input.LT(-1);
			setState(769);
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
					setState(763);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(764);
					lfp();
					setState(765);
					((NativeCategoryBindingListItemContext)_localctx).item = native_category_binding();
					}
					} 
				}
				setState(771);
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

	public static class Abstract_method_declarationContext extends ParserRuleContext {
		public Method_identifierContext name;
		public Argument_listContext args;
		public TypedefContext typ;
		public TerminalNode ABSTRACT() { return getToken(MParser.ABSTRACT, 0); }
		public TerminalNode DEF() { return getToken(MParser.DEF, 0); }
		public TerminalNode LPAR() { return getToken(MParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(MParser.RPAR, 0); }
		public Method_identifierContext method_identifier() {
			return getRuleContext(Method_identifierContext.class,0);
		}
		public TerminalNode RARROW() { return getToken(MParser.RARROW, 0); }
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public TypedefContext typedef() {
			return getRuleContext(TypedefContext.class,0);
		}
		public TerminalNode MUTABLE() { return getToken(MParser.MUTABLE, 0); }
		public Abstract_method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstract_method_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterAbstract_method_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitAbstract_method_declaration(this);
		}
	}

	public final Abstract_method_declarationContext abstract_method_declaration() throws RecognitionException {
		Abstract_method_declarationContext _localctx = new Abstract_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_abstract_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(772);
			match(ABSTRACT);
			setState(773);
			match(DEF);
			setState(774);
			((Abstract_method_declarationContext)_localctx).name = method_identifier();
			setState(775);
			match(LPAR);
			setState(777);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CODE || _la==MUTABLE || _la==VARIABLE_IDENTIFIER) {
				{
				setState(776);
				((Abstract_method_declarationContext)_localctx).args = argument_list();
				}
			}

			setState(779);
			match(RPAR);
			setState(785);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RARROW) {
				{
				setState(780);
				match(RARROW);
				setState(782);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MUTABLE) {
					{
					setState(781);
					match(MUTABLE);
					}
				}

				setState(784);
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
		public Argument_listContext args;
		public TypedefContext typ;
		public Statement_listContext stmts;
		public TerminalNode DEF() { return getToken(MParser.DEF, 0); }
		public TerminalNode LPAR() { return getToken(MParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(MParser.RPAR, 0); }
		public TerminalNode COLON() { return getToken(MParser.COLON, 0); }
		public IndentContext indent() {
			return getRuleContext(IndentContext.class,0);
		}
		public DedentContext dedent() {
			return getRuleContext(DedentContext.class,0);
		}
		public Method_identifierContext method_identifier() {
			return getRuleContext(Method_identifierContext.class,0);
		}
		public TerminalNode PASS() { return getToken(MParser.PASS, 0); }
		public TerminalNode RARROW() { return getToken(MParser.RARROW, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public TypedefContext typedef() {
			return getRuleContext(TypedefContext.class,0);
		}
		public TerminalNode MUTABLE() { return getToken(MParser.MUTABLE, 0); }
		public Concrete_method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concrete_method_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterConcrete_method_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitConcrete_method_declaration(this);
		}
	}

	public final Concrete_method_declarationContext concrete_method_declaration() throws RecognitionException {
		Concrete_method_declarationContext _localctx = new Concrete_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_concrete_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(787);
			match(DEF);
			setState(788);
			((Concrete_method_declarationContext)_localctx).name = method_identifier();
			setState(789);
			match(LPAR);
			setState(791);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CODE || _la==MUTABLE || _la==VARIABLE_IDENTIFIER) {
				{
				setState(790);
				((Concrete_method_declarationContext)_localctx).args = argument_list();
				}
			}

			setState(793);
			match(RPAR);
			setState(799);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RARROW) {
				{
				setState(794);
				match(RARROW);
				setState(796);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MUTABLE) {
					{
					setState(795);
					match(MUTABLE);
					}
				}

				setState(798);
				((Concrete_method_declarationContext)_localctx).typ = typedef(0);
				}
			}

			setState(801);
			match(COLON);
			setState(802);
			indent();
			setState(805);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMENT:
			case LPAR:
			case LBRAK:
			case LCURL:
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
			case ITERATOR:
			case CURSOR:
			case HTML:
			case ANY:
			case BREAK:
			case DEF:
			case DELETE:
			case DO:
			case FETCH:
			case FLUSH:
			case FOR:
			case IF:
			case MUTABLE:
			case NONE:
			case RAISE:
			case READ:
			case RETURN:
			case SELF:
			case SORTED:
			case STORE:
			case SUPER:
			case SWITCH:
			case THIS:
			case TRY:
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
				setState(803);
				((Concrete_method_declarationContext)_localctx).stmts = statement_list();
				}
				break;
			case PASS:
				{
				setState(804);
				match(PASS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(807);
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
		public Argument_listContext args;
		public Category_or_any_typeContext typ;
		public Native_statement_listContext stmts;
		public TerminalNode DEF() { return getToken(MParser.DEF, 0); }
		public TerminalNode LPAR() { return getToken(MParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(MParser.RPAR, 0); }
		public TerminalNode COLON() { return getToken(MParser.COLON, 0); }
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
		public TerminalNode NATIVE() { return getToken(MParser.NATIVE, 0); }
		public TerminalNode RARROW() { return getToken(MParser.RARROW, 0); }
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterNative_method_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitNative_method_declaration(this);
		}
	}

	public final Native_method_declarationContext native_method_declaration() throws RecognitionException {
		Native_method_declarationContext _localctx = new Native_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_native_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(809);
			match(DEF);
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
			((Native_method_declarationContext)_localctx).name = method_identifier();
			setState(814);
			match(LPAR);
			setState(816);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CODE || _la==MUTABLE || _la==VARIABLE_IDENTIFIER) {
				{
				setState(815);
				((Native_method_declarationContext)_localctx).args = argument_list();
				}
			}

			setState(818);
			match(RPAR);
			setState(821);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RARROW) {
				{
				setState(819);
				match(RARROW);
				setState(820);
				((Native_method_declarationContext)_localctx).typ = category_or_any_type();
				}
			}

			setState(823);
			match(COLON);
			setState(824);
			indent();
			setState(825);
			((Native_method_declarationContext)_localctx).stmts = native_statement_list();
			setState(826);
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
		public TerminalNode DEF() { return getToken(MParser.DEF, 0); }
		public TerminalNode TEST() { return getToken(MParser.TEST, 0); }
		public TerminalNode LPAR() { return getToken(MParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(MParser.RPAR, 0); }
		public List<TerminalNode> COLON() { return getTokens(MParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(MParser.COLON, i);
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
		public TerminalNode VERIFYING() { return getToken(MParser.VERIFYING, 0); }
		public TerminalNode TEXT_LITERAL() { return getToken(MParser.TEXT_LITERAL, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterTest_method_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitTest_method_declaration(this);
		}
	}

	public final Test_method_declarationContext test_method_declaration() throws RecognitionException {
		Test_method_declarationContext _localctx = new Test_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_test_method_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(828);
			match(DEF);
			setState(829);
			match(TEST);
			setState(830);
			((Test_method_declarationContext)_localctx).name = match(TEXT_LITERAL);
			setState(831);
			match(LPAR);
			setState(832);
			match(RPAR);
			setState(833);
			match(COLON);
			setState(834);
			indent();
			setState(835);
			((Test_method_declarationContext)_localctx).stmts = statement_list();
			setState(836);
			dedent();
			setState(837);
			lfp();
			setState(838);
			match(VERIFYING);
			setState(839);
			match(COLON);
			setState(845);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LF:
				{
				{
				setState(840);
				indent();
				setState(841);
				((Test_method_declarationContext)_localctx).exps = assertion_list();
				setState(842);
				dedent();
				}
				}
				break;
			case SYMBOL_IDENTIFIER:
				{
				{
				setState(844);
				((Test_method_declarationContext)_localctx).error = symbol_identifier();
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssertionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterAssertion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitAssertion(this);
		}
	}

	public final AssertionContext assertion() throws RecognitionException {
		AssertionContext _localctx = new AssertionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_assertion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(847);
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

	public static class Typed_argumentContext extends ParserRuleContext {
		public Variable_identifierContext name;
		public Category_or_any_typeContext typ;
		public Attribute_identifier_listContext attrs;
		public Literal_expressionContext value;
		public TerminalNode COLON() { return getToken(MParser.COLON, 0); }
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public Category_or_any_typeContext category_or_any_type() {
			return getRuleContext(Category_or_any_typeContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(MParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(MParser.RPAR, 0); }
		public TerminalNode EQ() { return getToken(MParser.EQ, 0); }
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterTyped_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitTyped_argument(this);
		}
	}

	public final Typed_argumentContext typed_argument() throws RecognitionException {
		Typed_argumentContext _localctx = new Typed_argumentContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_typed_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(849);
			((Typed_argumentContext)_localctx).name = variable_identifier();
			setState(850);
			match(COLON);
			setState(851);
			((Typed_argumentContext)_localctx).typ = category_or_any_type();
			setState(856);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(852);
				match(LPAR);
				setState(853);
				((Typed_argumentContext)_localctx).attrs = attribute_identifier_list();
				setState(854);
				match(RPAR);
				}
			}

			setState(860);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(858);
				match(EQ);
				setState(859);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterCommentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitCommentStatement(this);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterStoreStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitStoreStatement(this);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterWithSingletonStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitWithSingletonStatement(this);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterWriteStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitWriteStatement(this);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitWhileStatement(this);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterWithResourceStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitWithResourceStatement(this);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterRaiseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitRaiseStatement(this);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterFetchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitFetchStatement(this);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitBreakStatement(this);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterAssignInstanceStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitAssignInstanceStatement(this);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitIfStatement(this);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitSwitchStatement(this);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterTryStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitTryStatement(this);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterMethodCallStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitMethodCallStatement(this);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitReturnStatement(this);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterAssignTupleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitAssignTupleStatement(this);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterClosureStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitClosureStatement(this);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterFlushStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitFlushStatement(this);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterDoWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitDoWhileStatement(this);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterForEachStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitForEachStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_statement);
		try {
			setState(882);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				_localctx = new MethodCallStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(862);
				((MethodCallStatementContext)_localctx).stmt = method_call_statement();
				}
				break;
			case 2:
				_localctx = new AssignInstanceStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(863);
				((AssignInstanceStatementContext)_localctx).stmt = assign_instance_statement();
				}
				break;
			case 3:
				_localctx = new AssignTupleStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(864);
				((AssignTupleStatementContext)_localctx).stmt = assign_tuple_statement();
				}
				break;
			case 4:
				_localctx = new StoreStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(865);
				((StoreStatementContext)_localctx).stmt = store_statement();
				}
				break;
			case 5:
				_localctx = new FetchStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(866);
				((FetchStatementContext)_localctx).stmt = fetch_statement();
				}
				break;
			case 6:
				_localctx = new FlushStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(867);
				((FlushStatementContext)_localctx).stmt = flush_statement();
				}
				break;
			case 7:
				_localctx = new BreakStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(868);
				((BreakStatementContext)_localctx).stmt = break_statement();
				}
				break;
			case 8:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(869);
				((ReturnStatementContext)_localctx).stmt = return_statement();
				}
				break;
			case 9:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(870);
				((IfStatementContext)_localctx).stmt = if_statement();
				}
				break;
			case 10:
				_localctx = new SwitchStatementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(871);
				((SwitchStatementContext)_localctx).stmt = switch_statement();
				}
				break;
			case 11:
				_localctx = new ForEachStatementContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(872);
				((ForEachStatementContext)_localctx).stmt = for_each_statement();
				}
				break;
			case 12:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(873);
				((WhileStatementContext)_localctx).stmt = while_statement();
				}
				break;
			case 13:
				_localctx = new DoWhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(874);
				((DoWhileStatementContext)_localctx).stmt = do_while_statement();
				}
				break;
			case 14:
				_localctx = new RaiseStatementContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(875);
				((RaiseStatementContext)_localctx).stmt = raise_statement();
				}
				break;
			case 15:
				_localctx = new TryStatementContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(876);
				((TryStatementContext)_localctx).stmt = try_statement();
				}
				break;
			case 16:
				_localctx = new WriteStatementContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(877);
				((WriteStatementContext)_localctx).stmt = write_statement();
				}
				break;
			case 17:
				_localctx = new WithResourceStatementContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(878);
				((WithResourceStatementContext)_localctx).stmt = with_resource_statement();
				}
				break;
			case 18:
				_localctx = new WithSingletonStatementContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(879);
				((WithSingletonStatementContext)_localctx).stmt = with_singleton_statement();
				}
				break;
			case 19:
				_localctx = new ClosureStatementContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(880);
				((ClosureStatementContext)_localctx).decl = concrete_method_declaration();
				}
				break;
			case 20:
				_localctx = new CommentStatementContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(881);
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
		public TerminalNode FLUSH() { return getToken(MParser.FLUSH, 0); }
		public TerminalNode LPAR() { return getToken(MParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(MParser.RPAR, 0); }
		public Flush_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flush_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterFlush_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitFlush_statement(this);
		}
	}

	public final Flush_statementContext flush_statement() throws RecognitionException {
		Flush_statementContext _localctx = new Flush_statementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_flush_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(884);
			match(FLUSH);
			setState(885);
			match(LPAR);
			setState(886);
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

	public static class Store_statementContext extends ParserRuleContext {
		public Expression_listContext to_del;
		public Expression_listContext to_add;
		public Statement_listContext stmts;
		public TerminalNode DELETE() { return getToken(MParser.DELETE, 0); }
		public List<TerminalNode> LPAR() { return getTokens(MParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(MParser.LPAR, i);
		}
		public List<TerminalNode> RPAR() { return getTokens(MParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(MParser.RPAR, i);
		}
		public TerminalNode STORE() { return getToken(MParser.STORE, 0); }
		public List<Expression_listContext> expression_list() {
			return getRuleContexts(Expression_listContext.class);
		}
		public Expression_listContext expression_list(int i) {
			return getRuleContext(Expression_listContext.class,i);
		}
		public TerminalNode THEN() { return getToken(MParser.THEN, 0); }
		public TerminalNode COLON() { return getToken(MParser.COLON, 0); }
		public IndentContext indent() {
			return getRuleContext(IndentContext.class,0);
		}
		public DedentContext dedent() {
			return getRuleContext(DedentContext.class,0);
		}
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public TerminalNode AND() { return getToken(MParser.AND, 0); }
		public Store_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_store_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterStore_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitStore_statement(this);
		}
	}

	public final Store_statementContext store_statement() throws RecognitionException {
		Store_statementContext _localctx = new Store_statementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_store_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(905);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DELETE:
				{
				setState(888);
				match(DELETE);
				setState(889);
				match(LPAR);
				setState(890);
				((Store_statementContext)_localctx).to_del = expression_list();
				setState(891);
				match(RPAR);
				setState(898);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AND) {
					{
					setState(892);
					match(AND);
					setState(893);
					match(STORE);
					setState(894);
					match(LPAR);
					setState(895);
					((Store_statementContext)_localctx).to_add = expression_list();
					setState(896);
					match(RPAR);
					}
				}

				}
				break;
			case STORE:
				{
				setState(900);
				match(STORE);
				setState(901);
				match(LPAR);
				setState(902);
				((Store_statementContext)_localctx).to_add = expression_list();
				setState(903);
				match(RPAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(913);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THEN) {
				{
				setState(907);
				match(THEN);
				setState(908);
				match(COLON);
				setState(909);
				indent();
				setState(910);
				((Store_statementContext)_localctx).stmts = statement_list();
				setState(911);
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

	public static class Method_call_expressionContext extends ParserRuleContext {
		public Method_identifierContext name;
		public Argument_assignment_listContext args;
		public TerminalNode LPAR() { return getToken(MParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(MParser.RPAR, 0); }
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterMethod_call_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitMethod_call_expression(this);
		}
	}

	public final Method_call_expressionContext method_call_expression() throws RecognitionException {
		Method_call_expressionContext _localctx = new Method_call_expressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_method_call_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(915);
			((Method_call_expressionContext)_localctx).name = method_identifier();
			setState(916);
			match(LPAR);
			setState(918);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << LTCOLONGT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (CODE - 65)) | (1L << (DOCUMENT - 65)) | (1L << (BLOB - 65)) | (1L << (IMAGE - 65)) | (1L << (UUID - 65)) | (1L << (ITERATOR - 65)) | (1L << (CURSOR - 65)) | (1L << (HTML - 65)) | (1L << (ANY - 65)) | (1L << (EXECUTE - 65)) | (1L << (FETCH - 65)) | (1L << (MUTABLE - 65)) | (1L << (NONE - 65)) | (1L << (NOT - 65)))) != 0) || ((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & ((1L << (READ - 138)) | (1L << (SELF - 138)) | (1L << (SORTED - 138)) | (1L << (SUPER - 138)) | (1L << (THIS - 138)) | (1L << (BOOLEAN_LITERAL - 138)) | (1L << (CHAR_LITERAL - 138)) | (1L << (MIN_INTEGER - 138)) | (1L << (MAX_INTEGER - 138)) | (1L << (SYMBOL_IDENTIFIER - 138)) | (1L << (TYPE_IDENTIFIER - 138)) | (1L << (VARIABLE_IDENTIFIER - 138)) | (1L << (TEXT_LITERAL - 138)) | (1L << (UUID_LITERAL - 138)) | (1L << (INTEGER_LITERAL - 138)) | (1L << (HEXA_LITERAL - 138)) | (1L << (DECIMAL_LITERAL - 138)) | (1L << (DATETIME_LITERAL - 138)) | (1L << (TIME_LITERAL - 138)) | (1L << (DATE_LITERAL - 138)) | (1L << (PERIOD_LITERAL - 138)) | (1L << (VERSION_LITERAL - 138)))) != 0)) {
				{
				setState(917);
				((Method_call_expressionContext)_localctx).args = argument_assignment_list(0);
				}
			}

			setState(920);
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
		public TerminalNode DOT() { return getToken(MParser.DOT, 0); }
		public TerminalNode THEN() { return getToken(MParser.THEN, 0); }
		public TerminalNode COLON() { return getToken(MParser.COLON, 0); }
		public IndentContext indent() {
			return getRuleContext(IndentContext.class,0);
		}
		public DedentContext dedent() {
			return getRuleContext(DedentContext.class,0);
		}
		public Instance_expressionContext instance_expression() {
			return getRuleContext(Instance_expressionContext.class,0);
		}
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public TerminalNode WITH() { return getToken(MParser.WITH, 0); }
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public Method_call_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_call_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterMethod_call_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitMethod_call_statement(this);
		}
	}

	public final Method_call_statementContext method_call_statement() throws RecognitionException {
		Method_call_statementContext _localctx = new Method_call_statementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_method_call_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(925);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(922);
				((Method_call_statementContext)_localctx).parent = instance_expression(0);
				setState(923);
				match(DOT);
				}
				break;
			}
			setState(927);
			((Method_call_statementContext)_localctx).method = method_call_expression();
			setState(938);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THEN) {
				{
				setState(928);
				match(THEN);
				setState(931);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(929);
					match(WITH);
					setState(930);
					((Method_call_statementContext)_localctx).name = variable_identifier();
					}
				}

				setState(933);
				match(COLON);
				setState(934);
				indent();
				setState(935);
				((Method_call_statementContext)_localctx).stmts = statement_list();
				setState(936);
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

	public static class With_resource_statementContext extends ParserRuleContext {
		public Assign_variable_statementContext stmt;
		public Statement_listContext stmts;
		public TerminalNode WITH() { return getToken(MParser.WITH, 0); }
		public TerminalNode COLON() { return getToken(MParser.COLON, 0); }
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterWith_resource_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitWith_resource_statement(this);
		}
	}

	public final With_resource_statementContext with_resource_statement() throws RecognitionException {
		With_resource_statementContext _localctx = new With_resource_statementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_with_resource_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(940);
			match(WITH);
			setState(941);
			((With_resource_statementContext)_localctx).stmt = assign_variable_statement();
			setState(942);
			match(COLON);
			setState(943);
			indent();
			setState(944);
			((With_resource_statementContext)_localctx).stmts = statement_list();
			setState(945);
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
		public TerminalNode WITH() { return getToken(MParser.WITH, 0); }
		public TerminalNode COLON() { return getToken(MParser.COLON, 0); }
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterWith_singleton_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitWith_singleton_statement(this);
		}
	}

	public final With_singleton_statementContext with_singleton_statement() throws RecognitionException {
		With_singleton_statementContext _localctx = new With_singleton_statementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_with_singleton_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(947);
			match(WITH);
			setState(948);
			((With_singleton_statementContext)_localctx).typ = type_identifier();
			setState(949);
			match(COLON);
			setState(950);
			indent();
			setState(951);
			((With_singleton_statementContext)_localctx).stmts = statement_list();
			setState(952);
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
		public TerminalNode SWITCH() { return getToken(MParser.SWITCH, 0); }
		public TerminalNode ON() { return getToken(MParser.ON, 0); }
		public List<TerminalNode> COLON() { return getTokens(MParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(MParser.COLON, i);
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
		public TerminalNode OTHERWISE() { return getToken(MParser.OTHERWISE, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public Switch_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterSwitch_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitSwitch_statement(this);
		}
	}

	public final Switch_statementContext switch_statement() throws RecognitionException {
		Switch_statementContext _localctx = new Switch_statementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_switch_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(954);
			match(SWITCH);
			setState(955);
			match(ON);
			setState(956);
			((Switch_statementContext)_localctx).exp = expression(0);
			setState(957);
			match(COLON);
			setState(958);
			indent();
			setState(959);
			((Switch_statementContext)_localctx).cases = switch_case_statement_list();
			setState(967);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(960);
				lfp();
				setState(961);
				match(OTHERWISE);
				setState(962);
				match(COLON);
				setState(963);
				indent();
				setState(964);
				((Switch_statementContext)_localctx).stmts = statement_list();
				setState(965);
				dedent();
				}
				break;
			}
			setState(969);
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
		public TerminalNode WHEN() { return getToken(MParser.WHEN, 0); }
		public TerminalNode COLON() { return getToken(MParser.COLON, 0); }
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterAtomicSwitchCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitAtomicSwitchCase(this);
		}
	}
	public static class CollectionSwitchCaseContext extends Switch_case_statementContext {
		public Literal_collectionContext exp;
		public Statement_listContext stmts;
		public TerminalNode WHEN() { return getToken(MParser.WHEN, 0); }
		public TerminalNode IN() { return getToken(MParser.IN, 0); }
		public TerminalNode COLON() { return getToken(MParser.COLON, 0); }
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterCollectionSwitchCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitCollectionSwitchCase(this);
		}
	}

	public final Switch_case_statementContext switch_case_statement() throws RecognitionException {
		Switch_case_statementContext _localctx = new Switch_case_statementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_switch_case_statement);
		try {
			setState(986);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				_localctx = new AtomicSwitchCaseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(971);
				match(WHEN);
				setState(972);
				((AtomicSwitchCaseContext)_localctx).exp = atomic_literal();
				setState(973);
				match(COLON);
				setState(974);
				indent();
				setState(975);
				((AtomicSwitchCaseContext)_localctx).stmts = statement_list();
				setState(976);
				dedent();
				}
				break;
			case 2:
				_localctx = new CollectionSwitchCaseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(978);
				match(WHEN);
				setState(979);
				match(IN);
				setState(980);
				((CollectionSwitchCaseContext)_localctx).exp = literal_collection();
				setState(981);
				match(COLON);
				setState(982);
				indent();
				setState(983);
				((CollectionSwitchCaseContext)_localctx).stmts = statement_list();
				setState(984);
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
		public TerminalNode FOR() { return getToken(MParser.FOR, 0); }
		public TerminalNode IN() { return getToken(MParser.IN, 0); }
		public TerminalNode COLON() { return getToken(MParser.COLON, 0); }
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
		public TerminalNode COMMA() { return getToken(MParser.COMMA, 0); }
		public For_each_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_each_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterFor_each_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitFor_each_statement(this);
		}
	}

	public final For_each_statementContext for_each_statement() throws RecognitionException {
		For_each_statementContext _localctx = new For_each_statementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_for_each_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(988);
			match(FOR);
			setState(989);
			((For_each_statementContext)_localctx).name1 = variable_identifier();
			setState(992);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(990);
				match(COMMA);
				setState(991);
				((For_each_statementContext)_localctx).name2 = variable_identifier();
				}
			}

			setState(994);
			match(IN);
			setState(995);
			((For_each_statementContext)_localctx).source = expression(0);
			setState(996);
			match(COLON);
			setState(997);
			indent();
			setState(998);
			((For_each_statementContext)_localctx).stmts = statement_list();
			setState(999);
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
		public TerminalNode DO() { return getToken(MParser.DO, 0); }
		public TerminalNode COLON() { return getToken(MParser.COLON, 0); }
		public IndentContext indent() {
			return getRuleContext(IndentContext.class,0);
		}
		public DedentContext dedent() {
			return getRuleContext(DedentContext.class,0);
		}
		public LfpContext lfp() {
			return getRuleContext(LfpContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(MParser.WHILE, 0); }
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterDo_while_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitDo_while_statement(this);
		}
	}

	public final Do_while_statementContext do_while_statement() throws RecognitionException {
		Do_while_statementContext _localctx = new Do_while_statementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_do_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1001);
			match(DO);
			setState(1002);
			match(COLON);
			setState(1003);
			indent();
			setState(1004);
			((Do_while_statementContext)_localctx).stmts = statement_list();
			setState(1005);
			dedent();
			setState(1006);
			lfp();
			setState(1007);
			match(WHILE);
			setState(1008);
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
		public TerminalNode WHILE() { return getToken(MParser.WHILE, 0); }
		public TerminalNode COLON() { return getToken(MParser.COLON, 0); }
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitWhile_statement(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1010);
			match(WHILE);
			setState(1011);
			((While_statementContext)_localctx).exp = expression(0);
			setState(1012);
			match(COLON);
			setState(1013);
			indent();
			setState(1014);
			((While_statementContext)_localctx).stmts = statement_list();
			setState(1015);
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
		public TerminalNode IF() { return getToken(MParser.IF, 0); }
		public List<TerminalNode> COLON() { return getTokens(MParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(MParser.COLON, i);
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
		public TerminalNode ELSE() { return getToken(MParser.ELSE, 0); }
		public Else_if_statement_listContext else_if_statement_list() {
			return getRuleContext(Else_if_statement_listContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitIf_statement(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1017);
			match(IF);
			setState(1018);
			((If_statementContext)_localctx).exp = expression(0);
			setState(1019);
			match(COLON);
			setState(1020);
			indent();
			setState(1021);
			((If_statementContext)_localctx).stmts = statement_list();
			setState(1022);
			dedent();
			setState(1026);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(1023);
				lfp();
				setState(1024);
				((If_statementContext)_localctx).elseIfs = else_if_statement_list(0);
				}
				break;
			}
			setState(1035);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(1028);
				lfp();
				setState(1029);
				match(ELSE);
				setState(1030);
				match(COLON);
				setState(1031);
				indent();
				setState(1032);
				((If_statementContext)_localctx).elseStmts = statement_list();
				setState(1033);
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
		public TerminalNode ELSE() { return getToken(MParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(MParser.IF, 0); }
		public TerminalNode COLON() { return getToken(MParser.COLON, 0); }
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterElseIfStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitElseIfStatementList(this);
		}
	}
	public static class ElseIfStatementListItemContext extends Else_if_statement_listContext {
		public Else_if_statement_listContext items;
		public ExpressionContext exp;
		public Statement_listContext stmts;
		public LfpContext lfp() {
			return getRuleContext(LfpContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(MParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(MParser.IF, 0); }
		public TerminalNode COLON() { return getToken(MParser.COLON, 0); }
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterElseIfStatementListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitElseIfStatementListItem(this);
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

			setState(1038);
			match(ELSE);
			setState(1039);
			match(IF);
			setState(1040);
			((ElseIfStatementListContext)_localctx).exp = expression(0);
			setState(1041);
			match(COLON);
			setState(1042);
			indent();
			setState(1043);
			((ElseIfStatementListContext)_localctx).stmts = statement_list();
			setState(1044);
			dedent();
			}
			_ctx.stop = _input.LT(-1);
			setState(1058);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ElseIfStatementListItemContext(new Else_if_statement_listContext(_parentctx, _parentState));
					((ElseIfStatementListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_else_if_statement_list);
					setState(1046);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1047);
					lfp();
					setState(1048);
					match(ELSE);
					setState(1049);
					match(IF);
					setState(1050);
					((ElseIfStatementListItemContext)_localctx).exp = expression(0);
					setState(1051);
					match(COLON);
					setState(1052);
					indent();
					setState(1053);
					((ElseIfStatementListItemContext)_localctx).stmts = statement_list();
					setState(1054);
					dedent();
					}
					} 
				}
				setState(1060);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
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
		public TerminalNode RAISE() { return getToken(MParser.RAISE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Raise_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raise_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterRaise_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitRaise_statement(this);
		}
	}

	public final Raise_statementContext raise_statement() throws RecognitionException {
		Raise_statementContext _localctx = new Raise_statementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_raise_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1061);
			match(RAISE);
			setState(1062);
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
		public TerminalNode TRY() { return getToken(MParser.TRY, 0); }
		public List<TerminalNode> COLON() { return getTokens(MParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(MParser.COLON, i);
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
		public TerminalNode EXCEPT() { return getToken(MParser.EXCEPT, 0); }
		public TerminalNode FINALLY() { return getToken(MParser.FINALLY, 0); }
		public Catch_statement_listContext catch_statement_list() {
			return getRuleContext(Catch_statement_listContext.class,0);
		}
		public Try_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_try_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterTry_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitTry_statement(this);
		}
	}

	public final Try_statementContext try_statement() throws RecognitionException {
		Try_statementContext _localctx = new Try_statementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_try_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1064);
			match(TRY);
			setState(1065);
			((Try_statementContext)_localctx).name = variable_identifier();
			setState(1066);
			match(COLON);
			setState(1067);
			indent();
			setState(1068);
			((Try_statementContext)_localctx).stmts = statement_list();
			setState(1069);
			dedent();
			setState(1070);
			lfs();
			setState(1072);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(1071);
				((Try_statementContext)_localctx).handlers = catch_statement_list();
				}
				break;
			}
			setState(1081);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXCEPT) {
				{
				setState(1074);
				match(EXCEPT);
				setState(1075);
				match(COLON);
				setState(1076);
				indent();
				setState(1077);
				((Try_statementContext)_localctx).anyStmts = statement_list();
				setState(1078);
				dedent();
				setState(1079);
				lfs();
				}
			}

			setState(1090);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINALLY) {
				{
				setState(1083);
				match(FINALLY);
				setState(1084);
				match(COLON);
				setState(1085);
				indent();
				setState(1086);
				((Try_statementContext)_localctx).finalStmts = statement_list();
				setState(1087);
				dedent();
				setState(1088);
				lfs();
				}
			}

			setState(1092);
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
		public TerminalNode EXCEPT() { return getToken(MParser.EXCEPT, 0); }
		public TerminalNode COLON() { return getToken(MParser.COLON, 0); }
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterCatchAtomicStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitCatchAtomicStatement(this);
		}
	}
	public static class CatchCollectionStatementContext extends Catch_statementContext {
		public Symbol_listContext exp;
		public Statement_listContext stmts;
		public TerminalNode EXCEPT() { return getToken(MParser.EXCEPT, 0); }
		public TerminalNode IN() { return getToken(MParser.IN, 0); }
		public TerminalNode LBRAK() { return getToken(MParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(MParser.RBRAK, 0); }
		public TerminalNode COLON() { return getToken(MParser.COLON, 0); }
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterCatchCollectionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitCatchCollectionStatement(this);
		}
	}

	public final Catch_statementContext catch_statement() throws RecognitionException {
		Catch_statementContext _localctx = new Catch_statementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_catch_statement);
		try {
			setState(1113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				_localctx = new CatchAtomicStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1094);
				match(EXCEPT);
				setState(1095);
				((CatchAtomicStatementContext)_localctx).name = symbol_identifier();
				setState(1096);
				match(COLON);
				setState(1097);
				indent();
				setState(1098);
				((CatchAtomicStatementContext)_localctx).stmts = statement_list();
				setState(1099);
				dedent();
				setState(1100);
				lfs();
				}
				break;
			case 2:
				_localctx = new CatchCollectionStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1102);
				match(EXCEPT);
				setState(1103);
				match(IN);
				setState(1104);
				match(LBRAK);
				setState(1105);
				((CatchCollectionStatementContext)_localctx).exp = symbol_list();
				setState(1106);
				match(RBRAK);
				setState(1107);
				match(COLON);
				setState(1108);
				indent();
				setState(1109);
				((CatchCollectionStatementContext)_localctx).stmts = statement_list();
				setState(1110);
				dedent();
				setState(1111);
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
		public TerminalNode BREAK() { return getToken(MParser.BREAK, 0); }
		public Break_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterBreak_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitBreak_statement(this);
		}
	}

	public final Break_statementContext break_statement() throws RecognitionException {
		Break_statementContext _localctx = new Break_statementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_break_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1115);
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
		public TerminalNode RETURN() { return getToken(MParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitReturn_statement(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_return_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1117);
			match(RETURN);
			setState(1119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << LTCOLONGT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (CODE - 65)) | (1L << (DOCUMENT - 65)) | (1L << (BLOB - 65)) | (1L << (IMAGE - 65)) | (1L << (UUID - 65)) | (1L << (ITERATOR - 65)) | (1L << (CURSOR - 65)) | (1L << (HTML - 65)) | (1L << (ANY - 65)) | (1L << (EXECUTE - 65)) | (1L << (FETCH - 65)) | (1L << (MUTABLE - 65)) | (1L << (NONE - 65)) | (1L << (NOT - 65)))) != 0) || ((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & ((1L << (READ - 138)) | (1L << (SELF - 138)) | (1L << (SORTED - 138)) | (1L << (SUPER - 138)) | (1L << (THIS - 138)) | (1L << (BOOLEAN_LITERAL - 138)) | (1L << (CHAR_LITERAL - 138)) | (1L << (MIN_INTEGER - 138)) | (1L << (MAX_INTEGER - 138)) | (1L << (SYMBOL_IDENTIFIER - 138)) | (1L << (TYPE_IDENTIFIER - 138)) | (1L << (VARIABLE_IDENTIFIER - 138)) | (1L << (TEXT_LITERAL - 138)) | (1L << (UUID_LITERAL - 138)) | (1L << (INTEGER_LITERAL - 138)) | (1L << (HEXA_LITERAL - 138)) | (1L << (DECIMAL_LITERAL - 138)) | (1L << (DATETIME_LITERAL - 138)) | (1L << (TIME_LITERAL - 138)) | (1L << (DATE_LITERAL - 138)) | (1L << (PERIOD_LITERAL - 138)) | (1L << (VERSION_LITERAL - 138)))) != 0)) {
				{
				setState(1118);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterIntDivideExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitIntDivideExpression(this);
		}
	}
	public static class HasAnyExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode HAS() { return getToken(MParser.HAS, 0); }
		public TerminalNode ANY() { return getToken(MParser.ANY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public HasAnyExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterHasAnyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitHasAnyExpression(this);
		}
	}
	public static class HasExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode HAS() { return getToken(MParser.HAS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public HasExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterHasExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitHasExpression(this);
		}
	}
	public static class TernaryExpressionContext extends ExpressionContext {
		public ExpressionContext ifTrue;
		public ExpressionContext test;
		public ExpressionContext ifFalse;
		public TerminalNode IF() { return getToken(MParser.IF, 0); }
		public TerminalNode ELSE() { return getToken(MParser.ELSE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TernaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterTernaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitTernaryExpression(this);
		}
	}
	public static class NotEqualsExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode XEQ() { return getToken(MParser.XEQ, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public NotEqualsExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterNotEqualsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitNotEqualsExpression(this);
		}
	}
	public static class InExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode IN() { return getToken(MParser.IN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public InExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterInExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitInExpression(this);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJsxExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJsxExpression(this);
		}
	}
	public static class NotExpressionContext extends ExpressionContext {
		public ExpressionContext exp;
		public TerminalNode NOT() { return getToken(MParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitNotExpression(this);
		}
	}
	public static class GreaterThanExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode GT() { return getToken(MParser.GT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GreaterThanExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterGreaterThanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitGreaterThanExpression(this);
		}
	}
	public static class OrExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode OR() { return getToken(MParser.OR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OrExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitOrExpression(this);
		}
	}
	public static class CodeExpressionContext extends ExpressionContext {
		public ExpressionContext exp;
		public TerminalNode CODE() { return getToken(MParser.CODE, 0); }
		public TerminalNode LPAR() { return getToken(MParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(MParser.RPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CodeExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterCodeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitCodeExpression(this);
		}
	}
	public static class LessThanOrEqualExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode LTE() { return getToken(MParser.LTE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LessThanOrEqualExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterLessThanOrEqualExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitLessThanOrEqualExpression(this);
		}
	}
	public static class NotHasAnyExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode NOT() { return getToken(MParser.NOT, 0); }
		public TerminalNode HAS() { return getToken(MParser.HAS, 0); }
		public TerminalNode ANY() { return getToken(MParser.ANY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public NotHasAnyExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterNotHasAnyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitNotHasAnyExpression(this);
		}
	}
	public static class AndExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode AND() { return getToken(MParser.AND, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AndExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitAndExpression(this);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterArrowExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitArrowExpression(this);
		}
	}
	public static class NotHasExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode NOT() { return getToken(MParser.NOT, 0); }
		public TerminalNode HAS() { return getToken(MParser.HAS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public NotHasExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterNotHasExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitNotHasExpression(this);
		}
	}
	public static class ClosureExpressionContext extends ExpressionContext {
		public Closure_expressionContext exp;
		public Closure_expressionContext closure_expression() {
			return getRuleContext(Closure_expressionContext.class,0);
		}
		public ClosureExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterClosureExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitClosureExpression(this);
		}
	}
	public static class NotHasAllExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode NOT() { return getToken(MParser.NOT, 0); }
		public TerminalNode HAS() { return getToken(MParser.HAS, 0); }
		public TerminalNode ALL() { return getToken(MParser.ALL, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public NotHasAllExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterNotHasAllExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitNotHasAllExpression(this);
		}
	}
	public static class ContainsExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode CONTAINS() { return getToken(MParser.CONTAINS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ContainsExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterContainsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitContainsExpression(this);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterFilteredListExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitFilteredListExpression(this);
		}
	}
	public static class NotContainsExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode NOT() { return getToken(MParser.NOT, 0); }
		public TerminalNode CONTAINS() { return getToken(MParser.CONTAINS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public NotContainsExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterNotContainsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitNotContainsExpression(this);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterMultiplyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitMultiplyExpression(this);
		}
	}
	public static class RoughlyEqualsExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode TEQ() { return getToken(MParser.TEQ, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public RoughlyEqualsExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterRoughlyEqualsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitRoughlyEqualsExpression(this);
		}
	}
	public static class ExecuteExpressionContext extends ExpressionContext {
		public Variable_identifierContext name;
		public TerminalNode EXECUTE() { return getToken(MParser.EXECUTE, 0); }
		public TerminalNode LPAR() { return getToken(MParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(MParser.RPAR, 0); }
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public ExecuteExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterExecuteExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitExecuteExpression(this);
		}
	}
	public static class GreaterThanOrEqualExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode GTE() { return getToken(MParser.GTE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GreaterThanOrEqualExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterGreaterThanOrEqualExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitGreaterThanOrEqualExpression(this);
		}
	}
	public static class NotInExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode NOT() { return getToken(MParser.NOT, 0); }
		public TerminalNode IN() { return getToken(MParser.IN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public NotInExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterNotInExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitNotInExpression(this);
		}
	}
	public static class IteratorExpressionContext extends ExpressionContext {
		public ExpressionContext exp;
		public Variable_identifierContext name;
		public ExpressionContext source;
		public TerminalNode FOR() { return getToken(MParser.FOR, 0); }
		public TerminalNode EACH() { return getToken(MParser.EACH, 0); }
		public TerminalNode IN() { return getToken(MParser.IN, 0); }
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterIteratorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitIteratorExpression(this);
		}
	}
	public static class IsNotExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Is_expressionContext right;
		public TerminalNode IS() { return getToken(MParser.IS, 0); }
		public TerminalNode NOT() { return getToken(MParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Is_expressionContext is_expression() {
			return getRuleContext(Is_expressionContext.class,0);
		}
		public IsNotExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterIsNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitIsNotExpression(this);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterDivideExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitDivideExpression(this);
		}
	}
	public static class IsExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Is_expressionContext right;
		public TerminalNode IS() { return getToken(MParser.IS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Is_expressionContext is_expression() {
			return getRuleContext(Is_expressionContext.class,0);
		}
		public IsExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterIsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitIsExpression(this);
		}
	}
	public static class MinusExpressionContext extends ExpressionContext {
		public ExpressionContext exp;
		public TerminalNode MINUS() { return getToken(MParser.MINUS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MinusExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterMinusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitMinusExpression(this);
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
		public TerminalNode PLUS() { return getToken(MParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MParser.MINUS, 0); }
		public AddExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterAddExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitAddExpression(this);
		}
	}
	public static class HasAllExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode HAS() { return getToken(MParser.HAS, 0); }
		public TerminalNode ALL() { return getToken(MParser.ALL, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public HasAllExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterHasAllExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitHasAllExpression(this);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterInstanceExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitInstanceExpression(this);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterMutableInstanceExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitMutableInstanceExpression(this);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterCssExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitCssExpression(this);
		}
	}
	public static class CastExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Category_or_any_typeContext right;
		public TerminalNode AS() { return getToken(MParser.AS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Category_or_any_typeContext category_or_any_type() {
			return getRuleContext(Category_or_any_typeContext.class,0);
		}
		public TerminalNode MUTABLE() { return getToken(MParser.MUTABLE, 0); }
		public CastExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitCastExpression(this);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterModuloExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitModuloExpression(this);
		}
	}
	public static class LessThanExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode LT() { return getToken(MParser.LT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LessThanExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterLessThanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitLessThanExpression(this);
		}
	}
	public static class EqualsExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode EQ2() { return getToken(MParser.EQ2, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public EqualsExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterEqualsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitEqualsExpression(this);
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
			setState(1142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				_localctx = new CssExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1122);
				((CssExpressionContext)_localctx).exp = css_expression();
				}
				break;
			case 2:
				{
				_localctx = new JsxExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1123);
				((JsxExpressionContext)_localctx).exp = jsx_expression();
				}
				break;
			case 3:
				{
				_localctx = new InstanceExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1124);
				((InstanceExpressionContext)_localctx).exp = instance_expression(0);
				}
				break;
			case 4:
				{
				_localctx = new MutableInstanceExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1125);
				((MutableInstanceExpressionContext)_localctx).exp = mutable_instance_expression(0);
				}
				break;
			case 5:
				{
				_localctx = new ArrowExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1126);
				((ArrowExpressionContext)_localctx).exp = arrow_expression();
				}
				break;
			case 6:
				{
				_localctx = new MinusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1127);
				match(MINUS);
				setState(1128);
				((MinusExpressionContext)_localctx).exp = expression(34);
				}
				break;
			case 7:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1129);
				match(NOT);
				setState(1130);
				((NotExpressionContext)_localctx).exp = expression(33);
				}
				break;
			case 8:
				{
				_localctx = new CodeExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1131);
				match(CODE);
				setState(1132);
				match(LPAR);
				setState(1133);
				((CodeExpressionContext)_localctx).exp = expression(0);
				setState(1134);
				match(RPAR);
				}
				break;
			case 9:
				{
				_localctx = new ExecuteExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1136);
				match(EXECUTE);
				setState(1137);
				match(LPAR);
				setState(1138);
				((ExecuteExpressionContext)_localctx).name = variable_identifier();
				setState(1139);
				match(RPAR);
				}
				break;
			case 10:
				{
				_localctx = new ClosureExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1141);
				((ClosureExpressionContext)_localctx).exp = closure_expression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1259);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1257);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplyExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((MultiplyExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1144);
						if (!(precpred(_ctx, 32))) throw new FailedPredicateException(this, "precpred(_ctx, 32)");
						setState(1145);
						multiply();
						setState(1146);
						((MultiplyExpressionContext)_localctx).right = expression(33);
						}
						break;
					case 2:
						{
						_localctx = new DivideExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((DivideExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1148);
						if (!(precpred(_ctx, 31))) throw new FailedPredicateException(this, "precpred(_ctx, 31)");
						setState(1149);
						divide();
						setState(1150);
						((DivideExpressionContext)_localctx).right = expression(32);
						}
						break;
					case 3:
						{
						_localctx = new ModuloExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ModuloExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1152);
						if (!(precpred(_ctx, 30))) throw new FailedPredicateException(this, "precpred(_ctx, 30)");
						setState(1153);
						modulo();
						setState(1154);
						((ModuloExpressionContext)_localctx).right = expression(31);
						}
						break;
					case 4:
						{
						_localctx = new IntDivideExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((IntDivideExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1156);
						if (!(precpred(_ctx, 29))) throw new FailedPredicateException(this, "precpred(_ctx, 29)");
						setState(1157);
						idivide();
						setState(1158);
						((IntDivideExpressionContext)_localctx).right = expression(30);
						}
						break;
					case 5:
						{
						_localctx = new AddExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((AddExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1160);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(1161);
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
						setState(1162);
						((AddExpressionContext)_localctx).right = expression(29);
						}
						break;
					case 6:
						{
						_localctx = new LessThanExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((LessThanExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1163);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(1164);
						match(LT);
						setState(1165);
						((LessThanExpressionContext)_localctx).right = expression(27);
						}
						break;
					case 7:
						{
						_localctx = new LessThanOrEqualExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((LessThanOrEqualExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1166);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(1167);
						match(LTE);
						setState(1168);
						((LessThanOrEqualExpressionContext)_localctx).right = expression(26);
						}
						break;
					case 8:
						{
						_localctx = new GreaterThanExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((GreaterThanExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1169);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(1170);
						match(GT);
						setState(1171);
						((GreaterThanExpressionContext)_localctx).right = expression(25);
						}
						break;
					case 9:
						{
						_localctx = new GreaterThanOrEqualExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((GreaterThanOrEqualExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1172);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(1173);
						match(GTE);
						setState(1174);
						((GreaterThanOrEqualExpressionContext)_localctx).right = expression(24);
						}
						break;
					case 10:
						{
						_localctx = new EqualsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((EqualsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1175);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1176);
						match(EQ2);
						setState(1177);
						((EqualsExpressionContext)_localctx).right = expression(21);
						}
						break;
					case 11:
						{
						_localctx = new NotEqualsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((NotEqualsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1178);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1179);
						match(XEQ);
						setState(1180);
						((NotEqualsExpressionContext)_localctx).right = expression(20);
						}
						break;
					case 12:
						{
						_localctx = new RoughlyEqualsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((RoughlyEqualsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1181);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1182);
						match(TEQ);
						setState(1183);
						((RoughlyEqualsExpressionContext)_localctx).right = expression(19);
						}
						break;
					case 13:
						{
						_localctx = new ContainsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ContainsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1184);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1185);
						match(CONTAINS);
						setState(1186);
						((ContainsExpressionContext)_localctx).right = expression(18);
						}
						break;
					case 14:
						{
						_localctx = new InExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((InExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1187);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1188);
						match(IN);
						setState(1189);
						((InExpressionContext)_localctx).right = expression(17);
						}
						break;
					case 15:
						{
						_localctx = new HasExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((HasExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1190);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1191);
						match(HAS);
						setState(1192);
						((HasExpressionContext)_localctx).right = expression(16);
						}
						break;
					case 16:
						{
						_localctx = new HasAllExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((HasAllExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1193);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1194);
						match(HAS);
						setState(1195);
						match(ALL);
						setState(1196);
						((HasAllExpressionContext)_localctx).right = expression(15);
						}
						break;
					case 17:
						{
						_localctx = new HasAnyExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((HasAnyExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1197);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1198);
						match(HAS);
						setState(1199);
						match(ANY);
						setState(1200);
						((HasAnyExpressionContext)_localctx).right = expression(14);
						}
						break;
					case 18:
						{
						_localctx = new NotContainsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((NotContainsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1201);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1202);
						match(NOT);
						setState(1203);
						match(CONTAINS);
						setState(1204);
						((NotContainsExpressionContext)_localctx).right = expression(13);
						}
						break;
					case 19:
						{
						_localctx = new NotInExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((NotInExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1205);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1206);
						match(NOT);
						setState(1207);
						match(IN);
						setState(1208);
						((NotInExpressionContext)_localctx).right = expression(12);
						}
						break;
					case 20:
						{
						_localctx = new NotHasExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((NotHasExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1209);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1210);
						match(NOT);
						setState(1211);
						match(HAS);
						setState(1212);
						((NotHasExpressionContext)_localctx).right = expression(11);
						}
						break;
					case 21:
						{
						_localctx = new NotHasAllExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((NotHasAllExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1213);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1214);
						match(NOT);
						setState(1215);
						match(HAS);
						setState(1216);
						match(ALL);
						setState(1217);
						((NotHasAllExpressionContext)_localctx).right = expression(10);
						}
						break;
					case 22:
						{
						_localctx = new NotHasAnyExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((NotHasAnyExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1218);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1219);
						match(NOT);
						setState(1220);
						match(HAS);
						setState(1221);
						match(ANY);
						setState(1222);
						((NotHasAnyExpressionContext)_localctx).right = expression(9);
						}
						break;
					case 23:
						{
						_localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((OrExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1223);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1224);
						match(OR);
						setState(1225);
						((OrExpressionContext)_localctx).right = expression(8);
						}
						break;
					case 24:
						{
						_localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((AndExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1226);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1227);
						match(AND);
						setState(1228);
						((AndExpressionContext)_localctx).right = expression(7);
						}
						break;
					case 25:
						{
						_localctx = new TernaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((TernaryExpressionContext)_localctx).ifTrue = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1229);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1230);
						match(IF);
						setState(1231);
						((TernaryExpressionContext)_localctx).test = expression(0);
						setState(1232);
						match(ELSE);
						setState(1233);
						((TernaryExpressionContext)_localctx).ifFalse = expression(6);
						}
						break;
					case 26:
						{
						_localctx = new IteratorExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((IteratorExpressionContext)_localctx).exp = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1235);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1236);
						match(FOR);
						setState(1237);
						match(EACH);
						setState(1238);
						((IteratorExpressionContext)_localctx).name = variable_identifier();
						setState(1239);
						match(IN);
						setState(1240);
						((IteratorExpressionContext)_localctx).source = expression(2);
						}
						break;
					case 27:
						{
						_localctx = new FilteredListExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((FilteredListExpressionContext)_localctx).src = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1242);
						if (!(precpred(_ctx, 35))) throw new FailedPredicateException(this, "precpred(_ctx, 35)");
						setState(1243);
						filtered_list_suffix();
						}
						break;
					case 28:
						{
						_localctx = new CastExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((CastExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1244);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(1245);
						match(AS);
						setState(1247);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==MUTABLE) {
							{
							setState(1246);
							match(MUTABLE);
							}
						}

						setState(1249);
						((CastExpressionContext)_localctx).right = category_or_any_type();
						}
						break;
					case 29:
						{
						_localctx = new IsNotExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((IsNotExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1250);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(1251);
						match(IS);
						setState(1252);
						match(NOT);
						setState(1253);
						((IsNotExpressionContext)_localctx).right = is_expression();
						}
						break;
					case 30:
						{
						_localctx = new IsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((IsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1254);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1255);
						match(IS);
						setState(1256);
						((IsExpressionContext)_localctx).right = is_expression();
						}
						break;
					}
					} 
				}
				setState(1261);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
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

	public static class Closure_expressionContext extends ParserRuleContext {
		public Type_identifierContext name;
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Closure_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closure_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterClosure_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitClosure_expression(this);
		}
	}

	public final Closure_expressionContext closure_expression() throws RecognitionException {
		Closure_expressionContext _localctx = new Closure_expressionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_closure_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1262);
			((Closure_expressionContext)_localctx).name = type_identifier();
			}
		}
		catch (RecognitionException re) {
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterThisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitThisExpression(this);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterParenthesisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitParenthesisExpression(this);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitLiteralExpression(this);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterMethodExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitMethodExpression(this);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterSuperExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitSuperExpression(this);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitIdentifierExpression(this);
		}
	}

	public final Selectable_expressionContext selectable_expression() throws RecognitionException {
		Selectable_expressionContext _localctx = new Selectable_expressionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_selectable_expression);
		try {
			setState(1270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				_localctx = new MethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1264);
				((MethodExpressionContext)_localctx).exp = method_expression();
				}
				break;
			case 2:
				_localctx = new ParenthesisExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1265);
				((ParenthesisExpressionContext)_localctx).exp = parenthesis_expression();
				}
				break;
			case 3:
				_localctx = new LiteralExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1266);
				((LiteralExpressionContext)_localctx).exp = literal_expression();
				}
				break;
			case 4:
				_localctx = new IdentifierExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1267);
				((IdentifierExpressionContext)_localctx).exp = identifier();
				}
				break;
			case 5:
				_localctx = new ThisExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1268);
				((ThisExpressionContext)_localctx).exp = this_expression();
				}
				break;
			case 6:
				_localctx = new SuperExpressionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1269);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterSelectorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitSelectorExpression(this);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterSelectableExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitSelectableExpression(this);
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
		int _startState = 96;
		enterRecursionRule(_localctx, 96, RULE_instance_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SelectableExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1273);
			((SelectableExpressionContext)_localctx).parent = selectable_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(1279);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SelectorExpressionContext(new Instance_expressionContext(_parentctx, _parentState));
					((SelectorExpressionContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_instance_expression);
					setState(1275);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1276);
					((SelectorExpressionContext)_localctx).selector = instance_selector();
					}
					} 
				}
				setState(1281);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
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
		public TerminalNode MUTABLE() { return getToken(MParser.MUTABLE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MutableSelectableExpressionContext(Mutable_instance_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterMutableSelectableExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitMutableSelectableExpression(this);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterMutableSelectorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitMutableSelectorExpression(this);
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
		int _startState = 98;
		enterRecursionRule(_localctx, 98, RULE_mutable_instance_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new MutableSelectableExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1283);
			match(MUTABLE);
			setState(1284);
			((MutableSelectableExpressionContext)_localctx).exp = identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(1290);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MutableSelectorExpressionContext(new Mutable_instance_expressionContext(_parentctx, _parentState));
					((MutableSelectorExpressionContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_mutable_instance_expression);
					setState(1286);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1287);
					((MutableSelectorExpressionContext)_localctx).selector = instance_selector();
					}
					} 
				}
				setState(1292);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterMethod_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitMethod_expression(this);
		}
	}

	public final Method_expressionContext method_expression() throws RecognitionException {
		Method_expressionContext _localctx = new Method_expressionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_method_expression);
		try {
			setState(1302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1293);
				blob_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1294);
				document_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1295);
				fetch_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1296);
				read_blob_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1297);
				read_all_expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1298);
				read_one_expression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1299);
				sorted_expression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1300);
				method_call_expression();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1301);
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
		public TerminalNode LBRAK() { return getToken(MParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(MParser.RBRAK, 0); }
		public Slice_argumentsContext slice_arguments() {
			return getRuleContext(Slice_argumentsContext.class,0);
		}
		public SliceSelectorContext(Instance_selectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterSliceSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitSliceSelector(this);
		}
	}
	public static class MethodSelectorContext extends Instance_selectorContext {
		public Method_call_expressionContext method;
		public TerminalNode DOT() { return getToken(MParser.DOT, 0); }
		public Method_call_expressionContext method_call_expression() {
			return getRuleContext(Method_call_expressionContext.class,0);
		}
		public MethodSelectorContext(Instance_selectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterMethodSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitMethodSelector(this);
		}
	}
	public static class MemberSelectorContext extends Instance_selectorContext {
		public Member_identifierContext name;
		public TerminalNode DOT() { return getToken(MParser.DOT, 0); }
		public Member_identifierContext member_identifier() {
			return getRuleContext(Member_identifierContext.class,0);
		}
		public MemberSelectorContext(Instance_selectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterMemberSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitMemberSelector(this);
		}
	}
	public static class ItemSelectorContext extends Instance_selectorContext {
		public ExpressionContext exp;
		public TerminalNode LBRAK() { return getToken(MParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(MParser.RBRAK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ItemSelectorContext(Instance_selectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterItemSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitItemSelector(this);
		}
	}

	public final Instance_selectorContext instance_selector() throws RecognitionException {
		Instance_selectorContext _localctx = new Instance_selectorContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_instance_selector);
		try {
			setState(1316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				_localctx = new MemberSelectorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1304);
				match(DOT);
				setState(1305);
				((MemberSelectorContext)_localctx).name = member_identifier();
				}
				break;
			case 2:
				_localctx = new MethodSelectorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1306);
				match(DOT);
				setState(1307);
				((MethodSelectorContext)_localctx).method = method_call_expression();
				}
				break;
			case 3:
				_localctx = new SliceSelectorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1308);
				match(LBRAK);
				setState(1309);
				((SliceSelectorContext)_localctx).xslice = slice_arguments();
				setState(1310);
				match(RBRAK);
				}
				break;
			case 4:
				_localctx = new ItemSelectorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1312);
				match(LBRAK);
				setState(1313);
				((ItemSelectorContext)_localctx).exp = expression(0);
				setState(1314);
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

	public static class Blob_expressionContext extends ParserRuleContext {
		public TerminalNode BLOB() { return getToken(MParser.BLOB, 0); }
		public TerminalNode LPAR() { return getToken(MParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(MParser.RPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Blob_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blob_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterBlob_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitBlob_expression(this);
		}
	}

	public final Blob_expressionContext blob_expression() throws RecognitionException {
		Blob_expressionContext _localctx = new Blob_expressionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_blob_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1318);
			match(BLOB);
			setState(1319);
			match(LPAR);
			setState(1321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << LTCOLONGT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (CODE - 65)) | (1L << (DOCUMENT - 65)) | (1L << (BLOB - 65)) | (1L << (IMAGE - 65)) | (1L << (UUID - 65)) | (1L << (ITERATOR - 65)) | (1L << (CURSOR - 65)) | (1L << (HTML - 65)) | (1L << (ANY - 65)) | (1L << (EXECUTE - 65)) | (1L << (FETCH - 65)) | (1L << (MUTABLE - 65)) | (1L << (NONE - 65)) | (1L << (NOT - 65)))) != 0) || ((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & ((1L << (READ - 138)) | (1L << (SELF - 138)) | (1L << (SORTED - 138)) | (1L << (SUPER - 138)) | (1L << (THIS - 138)) | (1L << (BOOLEAN_LITERAL - 138)) | (1L << (CHAR_LITERAL - 138)) | (1L << (MIN_INTEGER - 138)) | (1L << (MAX_INTEGER - 138)) | (1L << (SYMBOL_IDENTIFIER - 138)) | (1L << (TYPE_IDENTIFIER - 138)) | (1L << (VARIABLE_IDENTIFIER - 138)) | (1L << (TEXT_LITERAL - 138)) | (1L << (UUID_LITERAL - 138)) | (1L << (INTEGER_LITERAL - 138)) | (1L << (HEXA_LITERAL - 138)) | (1L << (DECIMAL_LITERAL - 138)) | (1L << (DATETIME_LITERAL - 138)) | (1L << (TIME_LITERAL - 138)) | (1L << (DATE_LITERAL - 138)) | (1L << (PERIOD_LITERAL - 138)) | (1L << (VERSION_LITERAL - 138)))) != 0)) {
				{
				setState(1320);
				expression(0);
				}
			}

			setState(1323);
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
		public TerminalNode DOCUMENT() { return getToken(MParser.DOCUMENT, 0); }
		public TerminalNode LPAR() { return getToken(MParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(MParser.RPAR, 0); }
		public TerminalNode FROM() { return getToken(MParser.FROM, 0); }
		public TerminalNode EQ() { return getToken(MParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Document_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterDocument_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitDocument_expression(this);
		}
	}

	public final Document_expressionContext document_expression() throws RecognitionException {
		Document_expressionContext _localctx = new Document_expressionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_document_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1325);
			match(DOCUMENT);
			setState(1326);
			match(LPAR);
			setState(1330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(1327);
				match(FROM);
				setState(1328);
				match(EQ);
				setState(1329);
				((Document_expressionContext)_localctx).exp = expression(0);
				}
			}

			setState(1332);
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
		public TerminalNode LPAR() { return getToken(MParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(MParser.RPAR, 0); }
		public Mutable_category_typeContext mutable_category_type() {
			return getRuleContext(Mutable_category_typeContext.class,0);
		}
		public Copy_fromContext copy_from() {
			return getRuleContext(Copy_fromContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(MParser.COMMA, 0); }
		public Argument_assignment_listContext argument_assignment_list() {
			return getRuleContext(Argument_assignment_listContext.class,0);
		}
		public ConstructorFromContext(Constructor_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterConstructorFrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitConstructorFrom(this);
		}
	}
	public static class ConstructorNoFromContext extends Constructor_expressionContext {
		public Mutable_category_typeContext typ;
		public Argument_assignment_listContext args;
		public TerminalNode LPAR() { return getToken(MParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(MParser.RPAR, 0); }
		public Mutable_category_typeContext mutable_category_type() {
			return getRuleContext(Mutable_category_typeContext.class,0);
		}
		public Argument_assignment_listContext argument_assignment_list() {
			return getRuleContext(Argument_assignment_listContext.class,0);
		}
		public ConstructorNoFromContext(Constructor_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterConstructorNoFrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitConstructorNoFrom(this);
		}
	}

	public final Constructor_expressionContext constructor_expression() throws RecognitionException {
		Constructor_expressionContext _localctx = new Constructor_expressionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_constructor_expression);
		int _la;
		try {
			setState(1350);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				_localctx = new ConstructorFromContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1334);
				((ConstructorFromContext)_localctx).typ = mutable_category_type();
				setState(1335);
				match(LPAR);
				setState(1336);
				((ConstructorFromContext)_localctx).copyExp = copy_from();
				setState(1339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1337);
					match(COMMA);
					setState(1338);
					((ConstructorFromContext)_localctx).args = argument_assignment_list(0);
					}
				}

				setState(1341);
				match(RPAR);
				}
				break;
			case 2:
				_localctx = new ConstructorNoFromContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1343);
				((ConstructorNoFromContext)_localctx).typ = mutable_category_type();
				setState(1344);
				match(LPAR);
				setState(1346);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << LTCOLONGT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (CODE - 65)) | (1L << (DOCUMENT - 65)) | (1L << (BLOB - 65)) | (1L << (IMAGE - 65)) | (1L << (UUID - 65)) | (1L << (ITERATOR - 65)) | (1L << (CURSOR - 65)) | (1L << (HTML - 65)) | (1L << (ANY - 65)) | (1L << (EXECUTE - 65)) | (1L << (FETCH - 65)) | (1L << (MUTABLE - 65)) | (1L << (NONE - 65)) | (1L << (NOT - 65)))) != 0) || ((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & ((1L << (READ - 138)) | (1L << (SELF - 138)) | (1L << (SORTED - 138)) | (1L << (SUPER - 138)) | (1L << (THIS - 138)) | (1L << (BOOLEAN_LITERAL - 138)) | (1L << (CHAR_LITERAL - 138)) | (1L << (MIN_INTEGER - 138)) | (1L << (MAX_INTEGER - 138)) | (1L << (SYMBOL_IDENTIFIER - 138)) | (1L << (TYPE_IDENTIFIER - 138)) | (1L << (VARIABLE_IDENTIFIER - 138)) | (1L << (TEXT_LITERAL - 138)) | (1L << (UUID_LITERAL - 138)) | (1L << (INTEGER_LITERAL - 138)) | (1L << (HEXA_LITERAL - 138)) | (1L << (DECIMAL_LITERAL - 138)) | (1L << (DATETIME_LITERAL - 138)) | (1L << (TIME_LITERAL - 138)) | (1L << (DATE_LITERAL - 138)) | (1L << (PERIOD_LITERAL - 138)) | (1L << (VERSION_LITERAL - 138)))) != 0)) {
					{
					setState(1345);
					((ConstructorNoFromContext)_localctx).args = argument_assignment_list(0);
					}
				}

				setState(1348);
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
		public TerminalNode FROM() { return getToken(MParser.FROM, 0); }
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterCopy_from(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitCopy_from(this);
		}
	}

	public final Copy_fromContext copy_from() throws RecognitionException {
		Copy_fromContext _localctx = new Copy_fromContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_copy_from);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1352);
			match(FROM);
			setState(1353);
			assign();
			setState(1354);
			((Copy_fromContext)_localctx).exp = expression(0);
			setState(1355);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterExpressionAssignmentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitExpressionAssignmentList(this);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterArgumentAssignmentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitArgumentAssignmentList(this);
		}
	}
	public static class ArgumentAssignmentListItemContext extends Argument_assignment_listContext {
		public Argument_assignment_listContext items;
		public Argument_assignmentContext item;
		public TerminalNode COMMA() { return getToken(MParser.COMMA, 0); }
		public Argument_assignment_listContext argument_assignment_list() {
			return getRuleContext(Argument_assignment_listContext.class,0);
		}
		public Argument_assignmentContext argument_assignment() {
			return getRuleContext(Argument_assignmentContext.class,0);
		}
		public ArgumentAssignmentListItemContext(Argument_assignment_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterArgumentAssignmentListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitArgumentAssignmentListItem(this);
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
		int _startState = 112;
		enterRecursionRule(_localctx, 112, RULE_argument_assignment_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				_localctx = new ExpressionAssignmentListContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1358);
				((ExpressionAssignmentListContext)_localctx).exp = expression(0);
				setState(1359);
				if (!(this.willNotBe(this.equalToken()))) throw new FailedPredicateException(this, "$parser.willNotBe($parser.equalToken())");
				}
				break;
			case 2:
				{
				_localctx = new ArgumentAssignmentListContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1361);
				((ArgumentAssignmentListContext)_localctx).item = argument_assignment();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1369);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArgumentAssignmentListItemContext(new Argument_assignment_listContext(_parentctx, _parentState));
					((ArgumentAssignmentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_argument_assignment_list);
					setState(1364);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1365);
					match(COMMA);
					setState(1366);
					((ArgumentAssignmentListItemContext)_localctx).item = argument_assignment();
					}
					} 
				}
				setState(1371);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterArgument_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitArgument_assignment(this);
		}
	}

	public final Argument_assignmentContext argument_assignment() throws RecognitionException {
		Argument_assignmentContext _localctx = new Argument_assignmentContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_argument_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1372);
			((Argument_assignmentContext)_localctx).name = variable_identifier();
			setState(1376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(1373);
				assign();
				setState(1374);
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

	public static class Write_statementContext extends ParserRuleContext {
		public ExpressionContext what;
		public ExpressionContext target;
		public TerminalNode WRITE() { return getToken(MParser.WRITE, 0); }
		public TerminalNode TO() { return getToken(MParser.TO, 0); }
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterWrite_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitWrite_statement(this);
		}
	}

	public final Write_statementContext write_statement() throws RecognitionException {
		Write_statementContext _localctx = new Write_statementContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_write_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1378);
			match(WRITE);
			setState(1379);
			((Write_statementContext)_localctx).what = expression(0);
			setState(1380);
			match(TO);
			setState(1381);
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

	public static class Filtered_list_suffixContext extends ParserRuleContext {
		public Variable_identifierContext name;
		public ExpressionContext predicate;
		public TerminalNode FILTERED() { return getToken(MParser.FILTERED, 0); }
		public TerminalNode WHERE() { return getToken(MParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode WITH() { return getToken(MParser.WITH, 0); }
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public Filtered_list_suffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filtered_list_suffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterFiltered_list_suffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitFiltered_list_suffix(this);
		}
	}

	public final Filtered_list_suffixContext filtered_list_suffix() throws RecognitionException {
		Filtered_list_suffixContext _localctx = new Filtered_list_suffixContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_filtered_list_suffix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1383);
			match(FILTERED);
			setState(1386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1384);
				match(WITH);
				setState(1385);
				((Filtered_list_suffixContext)_localctx).name = variable_identifier();
				}
			}

			setState(1388);
			match(WHERE);
			setState(1389);
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
		public TerminalNode FETCH() { return getToken(MParser.FETCH, 0); }
		public TerminalNode ONE() { return getToken(MParser.ONE, 0); }
		public TerminalNode WHERE() { return getToken(MParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Mutable_category_typeContext mutable_category_type() {
			return getRuleContext(Mutable_category_typeContext.class,0);
		}
		public FetchOneContext(Fetch_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterFetchOne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitFetchOne(this);
		}
	}
	public static class FetchManyContext extends Fetch_expressionContext {
		public ExpressionContext xstart;
		public ExpressionContext xstop;
		public Mutable_category_typeContext typ;
		public ExpressionContext predicate;
		public Order_by_listContext orderby;
		public TerminalNode FETCH() { return getToken(MParser.FETCH, 0); }
		public TerminalNode LPAR() { return getToken(MParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(MParser.RPAR, 0); }
		public TerminalNode ALL() { return getToken(MParser.ALL, 0); }
		public TerminalNode ROWS() { return getToken(MParser.ROWS, 0); }
		public TerminalNode TO() { return getToken(MParser.TO, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode WHERE() { return getToken(MParser.WHERE, 0); }
		public TerminalNode ORDER() { return getToken(MParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(MParser.BY, 0); }
		public Mutable_category_typeContext mutable_category_type() {
			return getRuleContext(Mutable_category_typeContext.class,0);
		}
		public Order_by_listContext order_by_list() {
			return getRuleContext(Order_by_listContext.class,0);
		}
		public FetchManyContext(Fetch_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterFetchMany(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitFetchMany(this);
		}
	}

	public final Fetch_expressionContext fetch_expression() throws RecognitionException {
		Fetch_expressionContext _localctx = new Fetch_expressionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_fetch_expression);
		int _la;
		try {
			setState(1421);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				_localctx = new FetchOneContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1391);
				match(FETCH);
				setState(1392);
				match(ONE);
				setState(1394);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MUTABLE || _la==TYPE_IDENTIFIER) {
					{
					setState(1393);
					((FetchOneContext)_localctx).typ = mutable_category_type();
					}
				}

				setState(1396);
				match(WHERE);
				setState(1397);
				((FetchOneContext)_localctx).predicate = expression(0);
				}
				break;
			case 2:
				_localctx = new FetchManyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1398);
				match(FETCH);
				setState(1405);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ALL:
					{
					setState(1399);
					match(ALL);
					}
					break;
				case ROWS:
					{
					setState(1400);
					match(ROWS);
					setState(1401);
					((FetchManyContext)_localctx).xstart = expression(0);
					setState(1402);
					match(TO);
					setState(1403);
					((FetchManyContext)_localctx).xstop = expression(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1407);
				match(LPAR);
				setState(1409);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MUTABLE || _la==TYPE_IDENTIFIER) {
					{
					setState(1408);
					((FetchManyContext)_localctx).typ = mutable_category_type();
					}
				}

				setState(1411);
				match(RPAR);
				setState(1414);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
				case 1:
					{
					setState(1412);
					match(WHERE);
					setState(1413);
					((FetchManyContext)_localctx).predicate = expression(0);
					}
					break;
				}
				setState(1419);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
				case 1:
					{
					setState(1416);
					match(ORDER);
					setState(1417);
					match(BY);
					setState(1418);
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
		public ExpressionContext xstart;
		public ExpressionContext xstop;
		public Mutable_category_typeContext typ;
		public ExpressionContext predicate;
		public Order_by_listContext orderby;
		public Variable_identifierContext name;
		public Statement_listContext stmts;
		public TerminalNode FETCH() { return getToken(MParser.FETCH, 0); }
		public TerminalNode LPAR() { return getToken(MParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(MParser.RPAR, 0); }
		public TerminalNode THEN() { return getToken(MParser.THEN, 0); }
		public TerminalNode WITH() { return getToken(MParser.WITH, 0); }
		public TerminalNode COLON() { return getToken(MParser.COLON, 0); }
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
		public TerminalNode ALL() { return getToken(MParser.ALL, 0); }
		public TerminalNode ROWS() { return getToken(MParser.ROWS, 0); }
		public TerminalNode TO() { return getToken(MParser.TO, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode WHERE() { return getToken(MParser.WHERE, 0); }
		public TerminalNode ORDER() { return getToken(MParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(MParser.BY, 0); }
		public Mutable_category_typeContext mutable_category_type() {
			return getRuleContext(Mutable_category_typeContext.class,0);
		}
		public Order_by_listContext order_by_list() {
			return getRuleContext(Order_by_listContext.class,0);
		}
		public FetchManyAsyncContext(Fetch_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterFetchManyAsync(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitFetchManyAsync(this);
		}
	}
	public static class FetchOneAsyncContext extends Fetch_statementContext {
		public Mutable_category_typeContext typ;
		public ExpressionContext predicate;
		public Variable_identifierContext name;
		public Statement_listContext stmts;
		public TerminalNode FETCH() { return getToken(MParser.FETCH, 0); }
		public TerminalNode ONE() { return getToken(MParser.ONE, 0); }
		public TerminalNode WHERE() { return getToken(MParser.WHERE, 0); }
		public TerminalNode THEN() { return getToken(MParser.THEN, 0); }
		public TerminalNode WITH() { return getToken(MParser.WITH, 0); }
		public TerminalNode COLON() { return getToken(MParser.COLON, 0); }
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterFetchOneAsync(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitFetchOneAsync(this);
		}
	}

	public final Fetch_statementContext fetch_statement() throws RecognitionException {
		Fetch_statementContext _localctx = new Fetch_statementContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_fetch_statement);
		int _la;
		try {
			setState(1469);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				_localctx = new FetchOneAsyncContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1423);
				match(FETCH);
				setState(1424);
				match(ONE);
				setState(1426);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MUTABLE || _la==TYPE_IDENTIFIER) {
					{
					setState(1425);
					((FetchOneAsyncContext)_localctx).typ = mutable_category_type();
					}
				}

				setState(1428);
				match(WHERE);
				setState(1429);
				((FetchOneAsyncContext)_localctx).predicate = expression(0);
				setState(1430);
				match(THEN);
				setState(1431);
				match(WITH);
				setState(1432);
				((FetchOneAsyncContext)_localctx).name = variable_identifier();
				setState(1433);
				match(COLON);
				setState(1434);
				indent();
				setState(1435);
				((FetchOneAsyncContext)_localctx).stmts = statement_list();
				setState(1436);
				dedent();
				}
				break;
			case 2:
				_localctx = new FetchManyAsyncContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1438);
				match(FETCH);
				setState(1445);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ALL:
					{
					setState(1439);
					match(ALL);
					}
					break;
				case ROWS:
					{
					setState(1440);
					match(ROWS);
					setState(1441);
					((FetchManyAsyncContext)_localctx).xstart = expression(0);
					setState(1442);
					match(TO);
					setState(1443);
					((FetchManyAsyncContext)_localctx).xstop = expression(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1447);
				match(LPAR);
				setState(1449);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MUTABLE || _la==TYPE_IDENTIFIER) {
					{
					setState(1448);
					((FetchManyAsyncContext)_localctx).typ = mutable_category_type();
					}
				}

				setState(1451);
				match(RPAR);
				setState(1454);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(1452);
					match(WHERE);
					setState(1453);
					((FetchManyAsyncContext)_localctx).predicate = expression(0);
					}
				}

				setState(1459);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ORDER) {
					{
					setState(1456);
					match(ORDER);
					setState(1457);
					match(BY);
					setState(1458);
					((FetchManyAsyncContext)_localctx).orderby = order_by_list();
					}
				}

				setState(1461);
				match(THEN);
				setState(1462);
				match(WITH);
				setState(1463);
				((FetchManyAsyncContext)_localctx).name = variable_identifier();
				setState(1464);
				match(COLON);
				setState(1465);
				indent();
				setState(1466);
				((FetchManyAsyncContext)_localctx).stmts = statement_list();
				setState(1467);
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

	public static class Sorted_expressionContext extends ParserRuleContext {
		public Instance_expressionContext source;
		public Sorted_keyContext key;
		public TerminalNode SORTED() { return getToken(MParser.SORTED, 0); }
		public TerminalNode LPAR() { return getToken(MParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(MParser.RPAR, 0); }
		public Instance_expressionContext instance_expression() {
			return getRuleContext(Instance_expressionContext.class,0);
		}
		public TerminalNode DESC() { return getToken(MParser.DESC, 0); }
		public TerminalNode COMMA() { return getToken(MParser.COMMA, 0); }
		public Key_tokenContext key_token() {
			return getRuleContext(Key_tokenContext.class,0);
		}
		public TerminalNode EQ() { return getToken(MParser.EQ, 0); }
		public Sorted_keyContext sorted_key() {
			return getRuleContext(Sorted_keyContext.class,0);
		}
		public Sorted_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sorted_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterSorted_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitSorted_expression(this);
		}
	}

	public final Sorted_expressionContext sorted_expression() throws RecognitionException {
		Sorted_expressionContext _localctx = new Sorted_expressionContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_sorted_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1471);
			match(SORTED);
			setState(1473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DESC) {
				{
				setState(1472);
				match(DESC);
				}
			}

			setState(1475);
			match(LPAR);
			setState(1476);
			((Sorted_expressionContext)_localctx).source = instance_expression(0);
			setState(1482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1477);
				match(COMMA);
				setState(1478);
				key_token();
				setState(1479);
				match(EQ);
				setState(1480);
				((Sorted_expressionContext)_localctx).key = sorted_key();
				}
			}

			setState(1484);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterAssign_instance_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitAssign_instance_statement(this);
		}
	}

	public final Assign_instance_statementContext assign_instance_statement() throws RecognitionException {
		Assign_instance_statementContext _localctx = new Assign_instance_statementContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_assign_instance_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1486);
			((Assign_instance_statementContext)_localctx).inst = assignable_instance(0);
			setState(1487);
			assign();
			setState(1488);
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
		public TerminalNode DOT() { return getToken(MParser.DOT, 0); }
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public MemberInstanceContext(Child_instanceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterMemberInstance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitMemberInstance(this);
		}
	}
	public static class ItemInstanceContext extends Child_instanceContext {
		public ExpressionContext exp;
		public TerminalNode LBRAK() { return getToken(MParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(MParser.RBRAK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ItemInstanceContext(Child_instanceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterItemInstance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitItemInstance(this);
		}
	}

	public final Child_instanceContext child_instance() throws RecognitionException {
		Child_instanceContext _localctx = new Child_instanceContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_child_instance);
		try {
			setState(1498);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				_localctx = new MemberInstanceContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1490);
				if (!(this.wasNot(MParser.WS))) throw new FailedPredicateException(this, "$parser.wasNot(MParser.WS)");
				setState(1491);
				match(DOT);
				setState(1492);
				((MemberInstanceContext)_localctx).name = variable_identifier();
				}
				break;
			case 2:
				_localctx = new ItemInstanceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1493);
				if (!(this.wasNot(MParser.WS))) throw new FailedPredicateException(this, "$parser.wasNot(MParser.WS)");
				setState(1494);
				match(LBRAK);
				setState(1495);
				((ItemInstanceContext)_localctx).exp = expression(0);
				setState(1496);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterAssign_tuple_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitAssign_tuple_statement(this);
		}
	}

	public final Assign_tuple_statementContext assign_tuple_statement() throws RecognitionException {
		Assign_tuple_statementContext _localctx = new Assign_tuple_statementContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_assign_tuple_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1500);
			((Assign_tuple_statementContext)_localctx).items = variable_identifier_list();
			setState(1501);
			assign();
			setState(1502);
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
		public List<TerminalNode> LF() { return getTokens(MParser.LF); }
		public TerminalNode LF(int i) {
			return getToken(MParser.LF, i);
		}
		public LfsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lfs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterLfs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitLfs(this);
		}
	}

	public final LfsContext lfs() throws RecognitionException {
		LfsContext _localctx = new LfsContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_lfs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1507);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1504);
					match(LF);
					}
					} 
				}
				setState(1509);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
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
		public List<TerminalNode> LF() { return getTokens(MParser.LF); }
		public TerminalNode LF(int i) {
			return getToken(MParser.LF, i);
		}
		public LfpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lfp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterLfp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitLfp(this);
		}
	}

	public final LfpContext lfp() throws RecognitionException {
		LfpContext _localctx = new LfpContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_lfp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1511); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1510);
				match(LF);
				}
				}
				setState(1513); 
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
		public List<TerminalNode> LF() { return getTokens(MParser.LF); }
		public TerminalNode LF(int i) {
			return getToken(MParser.LF, i);
		}
		public List<TerminalNode> TAB() { return getTokens(MParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(MParser.TAB, i);
		}
		public List<TerminalNode> WS() { return getTokens(MParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(MParser.WS, i);
		}
		public List<TerminalNode> INDENT() { return getTokens(MParser.INDENT); }
		public TerminalNode INDENT(int i) {
			return getToken(MParser.INDENT, i);
		}
		public Ws_plusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ws_plus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterWs_plus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitWs_plus(this);
		}
	}

	public final Ws_plusContext ws_plus() throws RecognitionException {
		Ws_plusContext _localctx = new Ws_plusContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_ws_plus);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1518);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1515);
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
				setState(1520);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
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
		public TerminalNode INDENT() { return getToken(MParser.INDENT, 0); }
		public List<TerminalNode> LF() { return getTokens(MParser.LF); }
		public TerminalNode LF(int i) {
			return getToken(MParser.LF, i);
		}
		public IndentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterIndent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitIndent(this);
		}
	}

	public final IndentContext indent() throws RecognitionException {
		IndentContext _localctx = new IndentContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_indent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1522); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1521);
				match(LF);
				}
				}
				setState(1524); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LF );
			setState(1526);
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
		public TerminalNode DEDENT() { return getToken(MParser.DEDENT, 0); }
		public List<TerminalNode> LF() { return getTokens(MParser.LF); }
		public TerminalNode LF(int i) {
			return getToken(MParser.LF, i);
		}
		public DedentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dedent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterDedent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitDedent(this);
		}
	}

	public final DedentContext dedent() throws RecognitionException {
		DedentContext _localctx = new DedentContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_dedent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1531);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LF) {
				{
				{
				setState(1528);
				match(LF);
				}
				}
				setState(1533);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1534);
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
		public Category_or_any_typeContext category_or_any_type() {
			return getRuleContext(Category_or_any_typeContext.class,0);
		}
		public Type_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterType_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitType_literal(this);
		}
	}

	public final Type_literalContext type_literal() throws RecognitionException {
		Type_literalContext _localctx = new Type_literalContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_type_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1536);
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
		public TerminalNode NONE() { return getToken(MParser.NONE, 0); }
		public Null_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterNull_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitNull_literal(this);
		}
	}

	public final Null_literalContext null_literal() throws RecognitionException {
		Null_literalContext _localctx = new Null_literalContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_null_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1538);
			match(NONE);
			}
		}
		catch (RecognitionException re) {
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterRepl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitRepl(this);
		}
	}

	public final ReplContext repl() throws RecognitionException {
		ReplContext _localctx = new ReplContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_repl);
		try {
			setState(1543);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1540);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1541);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1542);
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
		public TerminalNode EOF() { return getToken(MParser.EOF, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public FullDeclarationListContext(Declaration_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterFullDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitFullDeclarationList(this);
		}
	}

	public final Declaration_listContext declaration_list() throws RecognitionException {
		Declaration_listContext _localctx = new Declaration_listContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_declaration_list);
		int _la;
		try {
			_localctx = new FullDeclarationListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (ABSTRACT - 74)) | (1L << (ATTR - 74)) | (1L << (CATEGORY - 74)) | (1L << (CLASS - 74)) | (1L << (DEF - 74)) | (1L << (ENUM - 74)) | (1L << (NATIVE - 74)))) != 0) || ((((_la - 146)) & ~0x3f) == 0 && ((1L << (_la - 146)) & ((1L << (SINGLETON - 146)) | (1L << (STORABLE - 146)) | (1L << (WIDGET - 146)) | (1L << (ARONDBASE_IDENTIFIER - 146)))) != 0)) {
				{
				setState(1545);
				declarations();
				}
			}

			setState(1548);
			lfs();
			setState(1549);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitDeclarations(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_declarations);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1551);
			declaration();
			setState(1557);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1552);
					lfp();
					setState(1553);
					declaration();
					}
					} 
				}
				setState(1559);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(1560);
				comment_statement();
				setState(1561);
				lfp();
				}
				}
				setState(1567);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ARONDBASE_IDENTIFIER) {
				{
				{
				setState(1568);
				annotation_constructor();
				setState(1569);
				lfp();
				}
				}
				setState(1575);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1582);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				{
				setState(1576);
				attribute_declaration();
				}
				break;
			case 2:
				{
				setState(1577);
				category_declaration();
				}
				break;
			case 3:
				{
				setState(1578);
				resource_declaration();
				}
				break;
			case 4:
				{
				setState(1579);
				enum_declaration();
				}
				break;
			case 5:
				{
				setState(1580);
				widget_declaration();
				}
				break;
			case 6:
				{
				setState(1581);
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
		public TerminalNode LPAR() { return getToken(MParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(MParser.RPAR, 0); }
		public Annotation_argument_valueContext annotation_argument_value() {
			return getRuleContext(Annotation_argument_valueContext.class,0);
		}
		public List<Annotation_argumentContext> annotation_argument() {
			return getRuleContexts(Annotation_argumentContext.class);
		}
		public Annotation_argumentContext annotation_argument(int i) {
			return getRuleContext(Annotation_argumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MParser.COMMA, i);
		}
		public Annotation_constructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterAnnotation_constructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitAnnotation_constructor(this);
		}
	}

	public final Annotation_constructorContext annotation_constructor() throws RecognitionException {
		Annotation_constructorContext _localctx = new Annotation_constructorContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_annotation_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1584);
			((Annotation_constructorContext)_localctx).name = annotation_identifier();
			setState(1599);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(1585);
				match(LPAR);
				setState(1595);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LPAR:
				case LBRAK:
				case LCURL:
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
				case ITERATOR:
				case CURSOR:
				case HTML:
				case ANY:
				case MUTABLE:
				case NONE:
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
					setState(1586);
					((Annotation_constructorContext)_localctx).exp = annotation_argument_value();
					}
					break;
				case GETTER:
				case SETTER:
				case VARIABLE_IDENTIFIER:
					{
					{
					setState(1587);
					annotation_argument();
					setState(1592);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1588);
						match(COMMA);
						setState(1589);
						annotation_argument();
						}
						}
						setState(1594);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1597);
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
		public TerminalNode ARONDBASE_IDENTIFIER() { return getToken(MParser.ARONDBASE_IDENTIFIER, 0); }
		public Annotation_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterAnnotation_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitAnnotation_identifier(this);
		}
	}

	public final Annotation_identifierContext annotation_identifier() throws RecognitionException {
		Annotation_identifierContext _localctx = new Annotation_identifierContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_annotation_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1601);
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
		public TerminalNode EQ() { return getToken(MParser.EQ, 0); }
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterAnnotation_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitAnnotation_argument(this);
		}
	}

	public final Annotation_argumentContext annotation_argument() throws RecognitionException {
		Annotation_argumentContext _localctx = new Annotation_argumentContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_annotation_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1603);
			((Annotation_argumentContext)_localctx).name = annotation_argument_name();
			setState(1604);
			match(EQ);
			setState(1605);
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
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(MParser.VARIABLE_IDENTIFIER, 0); }
		public TerminalNode GETTER() { return getToken(MParser.GETTER, 0); }
		public TerminalNode SETTER() { return getToken(MParser.SETTER, 0); }
		public Annotation_argument_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation_argument_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterAnnotation_argument_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitAnnotation_argument_name(this);
		}
	}

	public final Annotation_argument_nameContext annotation_argument_name() throws RecognitionException {
		Annotation_argument_nameContext _localctx = new Annotation_argument_nameContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_annotation_argument_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1607);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterAnnotationLiteralValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitAnnotationLiteralValue(this);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterAnnotationTypeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitAnnotationTypeValue(this);
		}
	}

	public final Annotation_argument_valueContext annotation_argument_value() throws RecognitionException {
		Annotation_argument_valueContext _localctx = new Annotation_argument_valueContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_annotation_argument_value);
		try {
			setState(1611);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				_localctx = new AnnotationLiteralValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1609);
				((AnnotationLiteralValueContext)_localctx).exp = literal_expression();
				}
				break;
			case 2:
				_localctx = new AnnotationTypeValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1610);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterResource_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitResource_declaration(this);
		}
	}

	public final Resource_declarationContext resource_declaration() throws RecognitionException {
		Resource_declarationContext _localctx = new Resource_declarationContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_resource_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1613);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterEnum_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitEnum_declaration(this);
		}
	}

	public final Enum_declarationContext enum_declaration() throws RecognitionException {
		Enum_declarationContext _localctx = new Enum_declarationContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_enum_declaration);
		try {
			setState(1617);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1615);
				enum_category_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1616);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterNative_symbol_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitNative_symbol_list(this);
		}
	}

	public final Native_symbol_listContext native_symbol_list() throws RecognitionException {
		Native_symbol_listContext _localctx = new Native_symbol_listContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_native_symbol_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1619);
			native_symbol();
			setState(1625);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1620);
					lfp();
					setState(1621);
					native_symbol();
					}
					} 
				}
				setState(1627);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterCategory_symbol_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitCategory_symbol_list(this);
		}
	}

	public final Category_symbol_listContext category_symbol_list() throws RecognitionException {
		Category_symbol_listContext _localctx = new Category_symbol_listContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_category_symbol_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1628);
			category_symbol();
			setState(1634);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1629);
					lfp();
					setState(1630);
					category_symbol();
					}
					} 
				}
				setState(1636);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
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
		public List<TerminalNode> COMMA() { return getTokens(MParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MParser.COMMA, i);
		}
		public Symbol_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbol_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterSymbol_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitSymbol_list(this);
		}
	}

	public final Symbol_listContext symbol_list() throws RecognitionException {
		Symbol_listContext _localctx = new Symbol_listContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_symbol_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1637);
			symbol_identifier();
			setState(1642);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1638);
				match(COMMA);
				setState(1639);
				symbol_identifier();
				}
				}
				setState(1644);
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
		public TerminalNode IN() { return getToken(MParser.IN, 0); }
		public Set_literalContext set_literal() {
			return getRuleContext(Set_literalContext.class,0);
		}
		public MatchingSetContext(Attribute_constraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterMatchingSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitMatchingSet(this);
		}
	}
	public static class MatchingPatternContext extends Attribute_constraintContext {
		public Token text;
		public TerminalNode MATCHING() { return getToken(MParser.MATCHING, 0); }
		public TerminalNode TEXT_LITERAL() { return getToken(MParser.TEXT_LITERAL, 0); }
		public MatchingPatternContext(Attribute_constraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterMatchingPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitMatchingPattern(this);
		}
	}
	public static class MatchingListContext extends Attribute_constraintContext {
		public List_literalContext source;
		public TerminalNode IN() { return getToken(MParser.IN, 0); }
		public List_literalContext list_literal() {
			return getRuleContext(List_literalContext.class,0);
		}
		public MatchingListContext(Attribute_constraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterMatchingList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitMatchingList(this);
		}
	}
	public static class MatchingRangeContext extends Attribute_constraintContext {
		public Range_literalContext source;
		public TerminalNode IN() { return getToken(MParser.IN, 0); }
		public Range_literalContext range_literal() {
			return getRuleContext(Range_literalContext.class,0);
		}
		public MatchingRangeContext(Attribute_constraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterMatchingRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitMatchingRange(this);
		}
	}
	public static class MatchingExpressionContext extends Attribute_constraintContext {
		public ExpressionContext exp;
		public TerminalNode MATCHING() { return getToken(MParser.MATCHING, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MatchingExpressionContext(Attribute_constraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterMatchingExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitMatchingExpression(this);
		}
	}

	public final Attribute_constraintContext attribute_constraint() throws RecognitionException {
		Attribute_constraintContext _localctx = new Attribute_constraintContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_attribute_constraint);
		try {
			setState(1655);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				_localctx = new MatchingListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1645);
				match(IN);
				setState(1646);
				((MatchingListContext)_localctx).source = list_literal();
				}
				break;
			case 2:
				_localctx = new MatchingSetContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1647);
				match(IN);
				setState(1648);
				((MatchingSetContext)_localctx).source = set_literal();
				}
				break;
			case 3:
				_localctx = new MatchingRangeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1649);
				match(IN);
				setState(1650);
				((MatchingRangeContext)_localctx).source = range_literal();
				}
				break;
			case 4:
				_localctx = new MatchingPatternContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1651);
				match(MATCHING);
				setState(1652);
				((MatchingPatternContext)_localctx).text = match(TEXT_LITERAL);
				}
				break;
			case 5:
				_localctx = new MatchingExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1653);
				match(MATCHING);
				setState(1654);
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
		public TerminalNode LBRAK() { return getToken(MParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(MParser.RBRAK, 0); }
		public TerminalNode MUTABLE() { return getToken(MParser.MUTABLE, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public List_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterList_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitList_literal(this);
		}
	}

	public final List_literalContext list_literal() throws RecognitionException {
		List_literalContext _localctx = new List_literalContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_list_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1658);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUTABLE) {
				{
				setState(1657);
				match(MUTABLE);
				}
			}

			setState(1660);
			match(LBRAK);
			setState(1662);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << LTCOLONGT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (CODE - 65)) | (1L << (DOCUMENT - 65)) | (1L << (BLOB - 65)) | (1L << (IMAGE - 65)) | (1L << (UUID - 65)) | (1L << (ITERATOR - 65)) | (1L << (CURSOR - 65)) | (1L << (HTML - 65)) | (1L << (ANY - 65)) | (1L << (EXECUTE - 65)) | (1L << (FETCH - 65)) | (1L << (MUTABLE - 65)) | (1L << (NONE - 65)) | (1L << (NOT - 65)))) != 0) || ((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & ((1L << (READ - 138)) | (1L << (SELF - 138)) | (1L << (SORTED - 138)) | (1L << (SUPER - 138)) | (1L << (THIS - 138)) | (1L << (BOOLEAN_LITERAL - 138)) | (1L << (CHAR_LITERAL - 138)) | (1L << (MIN_INTEGER - 138)) | (1L << (MAX_INTEGER - 138)) | (1L << (SYMBOL_IDENTIFIER - 138)) | (1L << (TYPE_IDENTIFIER - 138)) | (1L << (VARIABLE_IDENTIFIER - 138)) | (1L << (TEXT_LITERAL - 138)) | (1L << (UUID_LITERAL - 138)) | (1L << (INTEGER_LITERAL - 138)) | (1L << (HEXA_LITERAL - 138)) | (1L << (DECIMAL_LITERAL - 138)) | (1L << (DATETIME_LITERAL - 138)) | (1L << (TIME_LITERAL - 138)) | (1L << (DATE_LITERAL - 138)) | (1L << (PERIOD_LITERAL - 138)) | (1L << (VERSION_LITERAL - 138)))) != 0)) {
				{
				setState(1661);
				expression_list();
				}
			}

			setState(1664);
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
		public TerminalNode LT() { return getToken(MParser.LT, 0); }
		public TerminalNode GT() { return getToken(MParser.GT, 0); }
		public TerminalNode MUTABLE() { return getToken(MParser.MUTABLE, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Set_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterSet_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitSet_literal(this);
		}
	}

	public final Set_literalContext set_literal() throws RecognitionException {
		Set_literalContext _localctx = new Set_literalContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_set_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1667);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUTABLE) {
				{
				setState(1666);
				match(MUTABLE);
				}
			}

			setState(1669);
			match(LT);
			setState(1671);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << LTCOLONGT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (CODE - 65)) | (1L << (DOCUMENT - 65)) | (1L << (BLOB - 65)) | (1L << (IMAGE - 65)) | (1L << (UUID - 65)) | (1L << (ITERATOR - 65)) | (1L << (CURSOR - 65)) | (1L << (HTML - 65)) | (1L << (ANY - 65)) | (1L << (EXECUTE - 65)) | (1L << (FETCH - 65)) | (1L << (MUTABLE - 65)) | (1L << (NONE - 65)) | (1L << (NOT - 65)))) != 0) || ((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & ((1L << (READ - 138)) | (1L << (SELF - 138)) | (1L << (SORTED - 138)) | (1L << (SUPER - 138)) | (1L << (THIS - 138)) | (1L << (BOOLEAN_LITERAL - 138)) | (1L << (CHAR_LITERAL - 138)) | (1L << (MIN_INTEGER - 138)) | (1L << (MAX_INTEGER - 138)) | (1L << (SYMBOL_IDENTIFIER - 138)) | (1L << (TYPE_IDENTIFIER - 138)) | (1L << (VARIABLE_IDENTIFIER - 138)) | (1L << (TEXT_LITERAL - 138)) | (1L << (UUID_LITERAL - 138)) | (1L << (INTEGER_LITERAL - 138)) | (1L << (HEXA_LITERAL - 138)) | (1L << (DECIMAL_LITERAL - 138)) | (1L << (DATETIME_LITERAL - 138)) | (1L << (TIME_LITERAL - 138)) | (1L << (DATE_LITERAL - 138)) | (1L << (PERIOD_LITERAL - 138)) | (1L << (VERSION_LITERAL - 138)))) != 0)) {
				{
				setState(1670);
				expression_list();
				}
			}

			setState(1673);
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
		public List<TerminalNode> COMMA() { return getTokens(MParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MParser.COMMA, i);
		}
		public Expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterExpression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitExpression_list(this);
		}
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		Expression_listContext _localctx = new Expression_listContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1675);
			expression(0);
			setState(1680);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1676);
				match(COMMA);
				setState(1677);
				expression(0);
				}
				}
				setState(1682);
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
		public TerminalNode LBRAK() { return getToken(MParser.LBRAK, 0); }
		public TerminalNode RANGE() { return getToken(MParser.RANGE, 0); }
		public TerminalNode RBRAK() { return getToken(MParser.RBRAK, 0); }
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterRange_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitRange_literal(this);
		}
	}

	public final Range_literalContext range_literal() throws RecognitionException {
		Range_literalContext _localctx = new Range_literalContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_range_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1683);
			match(LBRAK);
			setState(1684);
			((Range_literalContext)_localctx).low = expression(0);
			setState(1685);
			match(RANGE);
			setState(1686);
			((Range_literalContext)_localctx).high = expression(0);
			setState(1687);
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
		public TerminalNode ITERATOR() { return getToken(MParser.ITERATOR, 0); }
		public TerminalNode LT() { return getToken(MParser.LT, 0); }
		public TerminalNode GT() { return getToken(MParser.GT, 0); }
		public TypedefContext typedef() {
			return getRuleContext(TypedefContext.class,0);
		}
		public IteratorTypeContext(TypedefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterIteratorType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitIteratorType(this);
		}
	}
	public static class SetTypeContext extends TypedefContext {
		public TypedefContext s;
		public TerminalNode LTGT() { return getToken(MParser.LTGT, 0); }
		public TypedefContext typedef() {
			return getRuleContext(TypedefContext.class,0);
		}
		public SetTypeContext(TypedefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterSetType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitSetType(this);
		}
	}
	public static class ListTypeContext extends TypedefContext {
		public TypedefContext l;
		public TerminalNode LBRAK() { return getToken(MParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(MParser.RBRAK, 0); }
		public TypedefContext typedef() {
			return getRuleContext(TypedefContext.class,0);
		}
		public ListTypeContext(TypedefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterListType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitListType(this);
		}
	}
	public static class DictTypeContext extends TypedefContext {
		public TypedefContext d;
		public TerminalNode LTCOLONGT() { return getToken(MParser.LTCOLONGT, 0); }
		public TypedefContext typedef() {
			return getRuleContext(TypedefContext.class,0);
		}
		public DictTypeContext(TypedefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterDictType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitDictType(this);
		}
	}
	public static class CursorTypeContext extends TypedefContext {
		public TypedefContext c;
		public TerminalNode CURSOR() { return getToken(MParser.CURSOR, 0); }
		public TerminalNode LT() { return getToken(MParser.LT, 0); }
		public TerminalNode GT() { return getToken(MParser.GT, 0); }
		public TypedefContext typedef() {
			return getRuleContext(TypedefContext.class,0);
		}
		public CursorTypeContext(TypedefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterCursorType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitCursorType(this);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterPrimaryType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitPrimaryType(this);
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
		int _startState = 184;
		enterRecursionRule(_localctx, 184, RULE_typedef, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1701);
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

				setState(1690);
				((PrimaryTypeContext)_localctx).p = primary_type();
				}
				break;
			case CURSOR:
				{
				_localctx = new CursorTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1691);
				match(CURSOR);
				setState(1692);
				match(LT);
				setState(1693);
				((CursorTypeContext)_localctx).c = typedef(0);
				setState(1694);
				match(GT);
				}
				break;
			case ITERATOR:
				{
				_localctx = new IteratorTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1696);
				match(ITERATOR);
				setState(1697);
				match(LT);
				setState(1698);
				((IteratorTypeContext)_localctx).i = typedef(0);
				setState(1699);
				match(GT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1712);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1710);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
					case 1:
						{
						_localctx = new SetTypeContext(new TypedefContext(_parentctx, _parentState));
						((SetTypeContext)_localctx).s = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_typedef);
						setState(1703);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1704);
						match(LTGT);
						}
						break;
					case 2:
						{
						_localctx = new ListTypeContext(new TypedefContext(_parentctx, _parentState));
						((ListTypeContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_typedef);
						setState(1705);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1706);
						match(LBRAK);
						setState(1707);
						match(RBRAK);
						}
						break;
					case 3:
						{
						_localctx = new DictTypeContext(new TypedefContext(_parentctx, _parentState));
						((DictTypeContext)_localctx).d = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_typedef);
						setState(1708);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1709);
						match(LTCOLONGT);
						}
						break;
					}
					} 
				}
				setState(1714);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterNativeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitNativeType(this);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterCategoryType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitCategoryType(this);
		}
	}

	public final Primary_typeContext primary_type() throws RecognitionException {
		Primary_typeContext _localctx = new Primary_typeContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_primary_type);
		try {
			setState(1717);
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
				setState(1715);
				((NativeTypeContext)_localctx).n = native_type();
				}
				break;
			case TYPE_IDENTIFIER:
				_localctx = new CategoryTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1716);
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
		public TerminalNode PERIOD() { return getToken(MParser.PERIOD, 0); }
		public PeriodTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterPeriodType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitPeriodType(this);
		}
	}
	public static class HtmlTypeContext extends Native_typeContext {
		public TerminalNode HTML() { return getToken(MParser.HTML, 0); }
		public HtmlTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterHtmlType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitHtmlType(this);
		}
	}
	public static class CssTypeContext extends Native_typeContext {
		public TerminalNode CSS() { return getToken(MParser.CSS, 0); }
		public CssTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterCssType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitCssType(this);
		}
	}
	public static class BooleanTypeContext extends Native_typeContext {
		public TerminalNode BOOLEAN() { return getToken(MParser.BOOLEAN, 0); }
		public BooleanTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterBooleanType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitBooleanType(this);
		}
	}
	public static class DocumentTypeContext extends Native_typeContext {
		public TerminalNode DOCUMENT() { return getToken(MParser.DOCUMENT, 0); }
		public DocumentTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterDocumentType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitDocumentType(this);
		}
	}
	public static class CharacterTypeContext extends Native_typeContext {
		public TerminalNode CHARACTER() { return getToken(MParser.CHARACTER, 0); }
		public CharacterTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterCharacterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitCharacterType(this);
		}
	}
	public static class VersionTypeContext extends Native_typeContext {
		public TerminalNode VERSION() { return getToken(MParser.VERSION, 0); }
		public VersionTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterVersionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitVersionType(this);
		}
	}
	public static class TextTypeContext extends Native_typeContext {
		public TerminalNode TEXT() { return getToken(MParser.TEXT, 0); }
		public TextTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterTextType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitTextType(this);
		}
	}
	public static class ImageTypeContext extends Native_typeContext {
		public TerminalNode IMAGE() { return getToken(MParser.IMAGE, 0); }
		public ImageTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterImageType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitImageType(this);
		}
	}
	public static class TimeTypeContext extends Native_typeContext {
		public TerminalNode TIME() { return getToken(MParser.TIME, 0); }
		public TimeTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterTimeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitTimeType(this);
		}
	}
	public static class IntegerTypeContext extends Native_typeContext {
		public TerminalNode INTEGER() { return getToken(MParser.INTEGER, 0); }
		public IntegerTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterIntegerType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitIntegerType(this);
		}
	}
	public static class DateTimeTypeContext extends Native_typeContext {
		public TerminalNode DATETIME() { return getToken(MParser.DATETIME, 0); }
		public DateTimeTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterDateTimeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitDateTimeType(this);
		}
	}
	public static class BlobTypeContext extends Native_typeContext {
		public TerminalNode BLOB() { return getToken(MParser.BLOB, 0); }
		public BlobTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterBlobType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitBlobType(this);
		}
	}
	public static class UUIDTypeContext extends Native_typeContext {
		public TerminalNode UUID() { return getToken(MParser.UUID, 0); }
		public UUIDTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterUUIDType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitUUIDType(this);
		}
	}
	public static class DecimalTypeContext extends Native_typeContext {
		public TerminalNode DECIMAL() { return getToken(MParser.DECIMAL, 0); }
		public DecimalTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterDecimalType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitDecimalType(this);
		}
	}
	public static class CodeTypeContext extends Native_typeContext {
		public TerminalNode CODE() { return getToken(MParser.CODE, 0); }
		public CodeTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterCodeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitCodeType(this);
		}
	}
	public static class DateTypeContext extends Native_typeContext {
		public TerminalNode DATE() { return getToken(MParser.DATE, 0); }
		public DateTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterDateType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitDateType(this);
		}
	}

	public final Native_typeContext native_type() throws RecognitionException {
		Native_typeContext _localctx = new Native_typeContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_native_type);
		try {
			setState(1736);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
				_localctx = new BooleanTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1719);
				match(BOOLEAN);
				}
				break;
			case CSS:
				_localctx = new CssTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1720);
				match(CSS);
				}
				break;
			case CHARACTER:
				_localctx = new CharacterTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1721);
				match(CHARACTER);
				}
				break;
			case TEXT:
				_localctx = new TextTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1722);
				match(TEXT);
				}
				break;
			case IMAGE:
				_localctx = new ImageTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1723);
				match(IMAGE);
				}
				break;
			case INTEGER:
				_localctx = new IntegerTypeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1724);
				match(INTEGER);
				}
				break;
			case DECIMAL:
				_localctx = new DecimalTypeContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1725);
				match(DECIMAL);
				}
				break;
			case DOCUMENT:
				_localctx = new DocumentTypeContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1726);
				match(DOCUMENT);
				}
				break;
			case DATE:
				_localctx = new DateTypeContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1727);
				match(DATE);
				}
				break;
			case DATETIME:
				_localctx = new DateTimeTypeContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1728);
				match(DATETIME);
				}
				break;
			case TIME:
				_localctx = new TimeTypeContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(1729);
				match(TIME);
				}
				break;
			case PERIOD:
				_localctx = new PeriodTypeContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(1730);
				match(PERIOD);
				}
				break;
			case VERSION:
				_localctx = new VersionTypeContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(1731);
				match(VERSION);
				}
				break;
			case CODE:
				_localctx = new CodeTypeContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(1732);
				match(CODE);
				}
				break;
			case BLOB:
				_localctx = new BlobTypeContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(1733);
				match(BLOB);
				}
				break;
			case UUID:
				_localctx = new UUIDTypeContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(1734);
				match(UUID);
				}
				break;
			case HTML:
				_localctx = new HtmlTypeContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(1735);
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
		public TerminalNode TYPE_IDENTIFIER() { return getToken(MParser.TYPE_IDENTIFIER, 0); }
		public Category_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_category_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterCategory_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitCategory_type(this);
		}
	}

	public final Category_typeContext category_type() throws RecognitionException {
		Category_typeContext _localctx = new Category_typeContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_category_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1738);
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
		public TerminalNode MUTABLE() { return getToken(MParser.MUTABLE, 0); }
		public Mutable_category_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mutable_category_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterMutable_category_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitMutable_category_type(this);
		}
	}

	public final Mutable_category_typeContext mutable_category_type() throws RecognitionException {
		Mutable_category_typeContext _localctx = new Mutable_category_typeContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_mutable_category_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1741);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUTABLE) {
				{
				setState(1740);
				match(MUTABLE);
				}
			}

			setState(1743);
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
		public TerminalNode CODE() { return getToken(MParser.CODE, 0); }
		public Code_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterCode_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitCode_type(this);
		}
	}

	public final Code_typeContext code_type() throws RecognitionException {
		Code_typeContext _localctx = new Code_typeContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_code_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1745);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterConcreteCategoryDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitConcreteCategoryDeclaration(this);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterNativeCategoryDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitNativeCategoryDeclaration(this);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterSingletonCategoryDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitSingletonCategoryDeclaration(this);
		}
	}

	public final Category_declarationContext category_declaration() throws RecognitionException {
		Category_declarationContext _localctx = new Category_declarationContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_category_declaration);
		try {
			setState(1750);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				_localctx = new ConcreteCategoryDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1747);
				((ConcreteCategoryDeclarationContext)_localctx).decl = concrete_category_declaration();
				}
				break;
			case 2:
				_localctx = new NativeCategoryDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1748);
				((NativeCategoryDeclarationContext)_localctx).decl = native_category_declaration();
				}
				break;
			case 3:
				_localctx = new SingletonCategoryDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1749);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterConcreteWidgetDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitConcreteWidgetDeclaration(this);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterNativeWidgetDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitNativeWidgetDeclaration(this);
		}
	}

	public final Widget_declarationContext widget_declaration() throws RecognitionException {
		Widget_declarationContext _localctx = new Widget_declarationContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_widget_declaration);
		try {
			setState(1754);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WIDGET:
				_localctx = new ConcreteWidgetDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1752);
				((ConcreteWidgetDeclarationContext)_localctx).decl = concrete_widget_declaration();
				}
				break;
			case NATIVE:
				_localctx = new NativeWidgetDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1753);
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
		public List<TerminalNode> COMMA() { return getTokens(MParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MParser.COMMA, i);
		}
		public Type_identifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_identifier_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterType_identifier_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitType_identifier_list(this);
		}
	}

	public final Type_identifier_listContext type_identifier_list() throws RecognitionException {
		Type_identifier_listContext _localctx = new Type_identifier_listContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_type_identifier_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1756);
			type_identifier();
			setState(1761);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1757);
					match(COMMA);
					setState(1758);
					type_identifier();
					}
					} 
				}
				setState(1763);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterMethod_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitMethod_identifier(this);
		}
	}

	public final Method_identifierContext method_identifier() throws RecognitionException {
		Method_identifierContext _localctx = new Method_identifierContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_method_identifier);
		try {
			setState(1766);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1764);
				variable_identifier();
				}
				break;
			case TYPE_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1765);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterIdentifier_or_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitIdentifier_or_keyword(this);
		}
	}

	public final Identifier_or_keywordContext identifier_or_keyword() throws RecognitionException {
		Identifier_or_keywordContext _localctx = new Identifier_or_keywordContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_identifier_or_keyword);
		try {
			setState(1770);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SYMBOL_IDENTIFIER:
			case TYPE_IDENTIFIER:
			case VARIABLE_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1768);
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
				setState(1769);
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
		public TerminalNode MINUS() { return getToken(MParser.MINUS, 0); }
		public Nospace_identifier_or_keywordContext nospace_identifier_or_keyword() {
			return getRuleContext(Nospace_identifier_or_keywordContext.class,0);
		}
		public Nospace_hyphen_identifier_or_keywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nospace_hyphen_identifier_or_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterNospace_hyphen_identifier_or_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitNospace_hyphen_identifier_or_keyword(this);
		}
	}

	public final Nospace_hyphen_identifier_or_keywordContext nospace_hyphen_identifier_or_keyword() throws RecognitionException {
		Nospace_hyphen_identifier_or_keywordContext _localctx = new Nospace_hyphen_identifier_or_keywordContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_nospace_hyphen_identifier_or_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1772);
			if (!(this.wasNotWhiteSpace())) throw new FailedPredicateException(this, "$parser.wasNotWhiteSpace()");
			setState(1773);
			match(MINUS);
			setState(1774);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterNospace_identifier_or_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitNospace_identifier_or_keyword(this);
		}
	}

	public final Nospace_identifier_or_keywordContext nospace_identifier_or_keyword() throws RecognitionException {
		Nospace_identifier_or_keywordContext _localctx = new Nospace_identifier_or_keywordContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_nospace_identifier_or_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1776);
			if (!(this.wasNotWhiteSpace())) throw new FailedPredicateException(this, "$parser.wasNotWhiteSpace()");
			setState(1777);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterTypeIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitTypeIdentifier(this);
		}
	}
	public static class SymbolIdentifierContext extends IdentifierContext {
		public Symbol_identifierContext symbol_identifier() {
			return getRuleContext(Symbol_identifierContext.class,0);
		}
		public SymbolIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterSymbolIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitSymbolIdentifier(this);
		}
	}
	public static class VariableIdentifierContext extends IdentifierContext {
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public VariableIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterVariableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitVariableIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_identifier);
		try {
			setState(1782);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE_IDENTIFIER:
				_localctx = new VariableIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1779);
				variable_identifier();
				}
				break;
			case TYPE_IDENTIFIER:
				_localctx = new TypeIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1780);
				type_identifier();
				}
				break;
			case SYMBOL_IDENTIFIER:
				_localctx = new SymbolIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1781);
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
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(MParser.VARIABLE_IDENTIFIER, 0); }
		public TerminalNode CATEGORY() { return getToken(MParser.CATEGORY, 0); }
		public Member_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterMember_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitMember_identifier(this);
		}
	}

	public final Member_identifierContext member_identifier() throws RecognitionException {
		Member_identifierContext _localctx = new Member_identifierContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_member_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1784);
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
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(MParser.VARIABLE_IDENTIFIER, 0); }
		public Variable_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterVariable_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitVariable_identifier(this);
		}
	}

	public final Variable_identifierContext variable_identifier() throws RecognitionException {
		Variable_identifierContext _localctx = new Variable_identifierContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_variable_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1786);
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
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(MParser.VARIABLE_IDENTIFIER, 0); }
		public TerminalNode STORABLE() { return getToken(MParser.STORABLE, 0); }
		public Attribute_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterAttribute_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitAttribute_identifier(this);
		}
	}

	public final Attribute_identifierContext attribute_identifier() throws RecognitionException {
		Attribute_identifierContext _localctx = new Attribute_identifierContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_attribute_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1788);
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
		public TerminalNode TYPE_IDENTIFIER() { return getToken(MParser.TYPE_IDENTIFIER, 0); }
		public Type_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterType_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitType_identifier(this);
		}
	}

	public final Type_identifierContext type_identifier() throws RecognitionException {
		Type_identifierContext _localctx = new Type_identifierContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_type_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1790);
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
		public TerminalNode SYMBOL_IDENTIFIER() { return getToken(MParser.SYMBOL_IDENTIFIER, 0); }
		public Symbol_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbol_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterSymbol_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitSymbol_identifier(this);
		}
	}

	public final Symbol_identifierContext symbol_identifier() throws RecognitionException {
		Symbol_identifierContext _localctx = new Symbol_identifierContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_symbol_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1792);
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
		public List<TerminalNode> COMMA() { return getTokens(MParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MParser.COMMA, i);
		}
		public Argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterArgument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitArgument_list(this);
		}
	}

	public final Argument_listContext argument_list() throws RecognitionException {
		Argument_listContext _localctx = new Argument_listContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1794);
			argument();
			setState(1799);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1795);
				match(COMMA);
				setState(1796);
				argument();
				}
				}
				setState(1801);
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
		public TerminalNode MUTABLE() { return getToken(MParser.MUTABLE, 0); }
		public OperatorArgumentContext(ArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterOperatorArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitOperatorArgument(this);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterCodeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitCodeArgument(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_argument);
		int _la;
		try {
			setState(1807);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CODE:
				_localctx = new CodeArgumentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1802);
				((CodeArgumentContext)_localctx).arg = code_argument();
				}
				break;
			case MUTABLE:
			case VARIABLE_IDENTIFIER:
				_localctx = new OperatorArgumentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1804);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MUTABLE) {
					{
					setState(1803);
					match(MUTABLE);
					}
				}

				setState(1806);
				((OperatorArgumentContext)_localctx).arg = operator_argument();
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterOperator_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitOperator_argument(this);
		}
	}

	public final Operator_argumentContext operator_argument() throws RecognitionException {
		Operator_argumentContext _localctx = new Operator_argumentContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_operator_argument);
		try {
			setState(1811);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1809);
				named_argument();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1810);
				typed_argument();
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

	public static class Named_argumentContext extends ParserRuleContext {
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(MParser.EQ, 0); }
		public Literal_expressionContext literal_expression() {
			return getRuleContext(Literal_expressionContext.class,0);
		}
		public Named_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_named_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterNamed_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitNamed_argument(this);
		}
	}

	public final Named_argumentContext named_argument() throws RecognitionException {
		Named_argumentContext _localctx = new Named_argumentContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_named_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1813);
			variable_identifier();
			setState(1816);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(1814);
				match(EQ);
				setState(1815);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterCode_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitCode_argument(this);
		}
	}

	public final Code_argumentContext code_argument() throws RecognitionException {
		Code_argumentContext _localctx = new Code_argumentContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_code_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1818);
			code_type();
			setState(1819);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterCategory_or_any_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitCategory_or_any_type(this);
		}
	}

	public final Category_or_any_typeContext category_or_any_type() throws RecognitionException {
		Category_or_any_typeContext _localctx = new Category_or_any_typeContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_category_or_any_type);
		try {
			setState(1823);
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
				setState(1821);
				typedef(0);
				}
				break;
			case ANY:
				enterOuterAlt(_localctx, 2);
				{
				setState(1822);
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
		public TerminalNode LBRAK() { return getToken(MParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(MParser.RBRAK, 0); }
		public AnyListTypeContext(Any_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterAnyListType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitAnyListType(this);
		}
	}
	public static class AnyTypeContext extends Any_typeContext {
		public TerminalNode ANY() { return getToken(MParser.ANY, 0); }
		public AnyTypeContext(Any_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterAnyType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitAnyType(this);
		}
	}
	public static class AnyDictTypeContext extends Any_typeContext {
		public Any_typeContext any_type() {
			return getRuleContext(Any_typeContext.class,0);
		}
		public TerminalNode LCURL() { return getToken(MParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(MParser.RCURL, 0); }
		public AnyDictTypeContext(Any_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterAnyDictType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitAnyDictType(this);
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
		int _startState = 234;
		enterRecursionRule(_localctx, 234, RULE_any_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AnyTypeContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1826);
			match(ANY);
			}
			_ctx.stop = _input.LT(-1);
			setState(1836);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1834);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
					case 1:
						{
						_localctx = new AnyListTypeContext(new Any_typeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_any_type);
						setState(1828);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1829);
						match(LBRAK);
						setState(1830);
						match(RBRAK);
						}
						break;
					case 2:
						{
						_localctx = new AnyDictTypeContext(new Any_typeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_any_type);
						setState(1831);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1832);
						match(LCURL);
						setState(1833);
						match(RCURL);
						}
						break;
					}
					} 
				}
				setState(1838);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterMember_method_declaration_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitMember_method_declaration_list(this);
		}
	}

	public final Member_method_declaration_listContext member_method_declaration_list() throws RecognitionException {
		Member_method_declaration_listContext _localctx = new Member_method_declaration_listContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_member_method_declaration_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1839);
			member_method_declaration();
			setState(1845);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1840);
					lfp();
					setState(1841);
					member_method_declaration();
					}
					} 
				}
				setState(1847);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterMember_method_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitMember_method_declaration(this);
		}
	}

	public final Member_method_declarationContext member_method_declaration() throws RecognitionException {
		Member_method_declarationContext _localctx = new Member_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_member_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1853);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(1848);
				comment_statement();
				setState(1849);
				lfp();
				}
				}
				setState(1855);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1861);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ARONDBASE_IDENTIFIER) {
				{
				{
				setState(1856);
				annotation_constructor();
				setState(1857);
				lfp();
				}
				}
				setState(1863);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1869);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				{
				setState(1864);
				setter_method_declaration();
				}
				break;
			case 2:
				{
				setState(1865);
				getter_method_declaration();
				}
				break;
			case 3:
				{
				setState(1866);
				concrete_method_declaration();
				}
				break;
			case 4:
				{
				setState(1867);
				abstract_method_declaration();
				}
				break;
			case 5:
				{
				setState(1868);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterNative_member_method_declaration_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitNative_member_method_declaration_list(this);
		}
	}

	public final Native_member_method_declaration_listContext native_member_method_declaration_list() throws RecognitionException {
		Native_member_method_declaration_listContext _localctx = new Native_member_method_declaration_listContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_native_member_method_declaration_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1871);
			native_member_method_declaration();
			setState(1877);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1872);
					lfp();
					setState(1873);
					native_member_method_declaration();
					}
					} 
				}
				setState(1879);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterNative_member_method_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitNative_member_method_declaration(this);
		}
	}

	public final Native_member_method_declarationContext native_member_method_declaration() throws RecognitionException {
		Native_member_method_declarationContext _localctx = new Native_member_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_native_member_method_declaration);
		try {
			setState(1883);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1880);
				native_getter_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1881);
				native_setter_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1882);
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
		public TerminalNode PYTHON2() { return getToken(MParser.PYTHON2, 0); }
		public Python_category_bindingContext python_category_binding() {
			return getRuleContext(Python_category_bindingContext.class,0);
		}
		public Python2CategoryBindingContext(Native_category_bindingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterPython2CategoryBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitPython2CategoryBinding(this);
		}
	}
	public static class Python3CategoryBindingContext extends Native_category_bindingContext {
		public Python_category_bindingContext binding;
		public TerminalNode PYTHON3() { return getToken(MParser.PYTHON3, 0); }
		public Python_category_bindingContext python_category_binding() {
			return getRuleContext(Python_category_bindingContext.class,0);
		}
		public Python3CategoryBindingContext(Native_category_bindingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterPython3CategoryBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitPython3CategoryBinding(this);
		}
	}
	public static class JavaCategoryBindingContext extends Native_category_bindingContext {
		public Java_class_identifier_expressionContext binding;
		public TerminalNode JAVA() { return getToken(MParser.JAVA, 0); }
		public Java_class_identifier_expressionContext java_class_identifier_expression() {
			return getRuleContext(Java_class_identifier_expressionContext.class,0);
		}
		public JavaCategoryBindingContext(Native_category_bindingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJavaCategoryBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJavaCategoryBinding(this);
		}
	}
	public static class CSharpCategoryBindingContext extends Native_category_bindingContext {
		public Csharp_identifier_expressionContext binding;
		public TerminalNode CSHARP() { return getToken(MParser.CSHARP, 0); }
		public Csharp_identifier_expressionContext csharp_identifier_expression() {
			return getRuleContext(Csharp_identifier_expressionContext.class,0);
		}
		public CSharpCategoryBindingContext(Native_category_bindingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterCSharpCategoryBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitCSharpCategoryBinding(this);
		}
	}
	public static class JavaScriptCategoryBindingContext extends Native_category_bindingContext {
		public Javascript_category_bindingContext binding;
		public TerminalNode JAVASCRIPT() { return getToken(MParser.JAVASCRIPT, 0); }
		public Javascript_category_bindingContext javascript_category_binding() {
			return getRuleContext(Javascript_category_bindingContext.class,0);
		}
		public JavaScriptCategoryBindingContext(Native_category_bindingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJavaScriptCategoryBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJavaScriptCategoryBinding(this);
		}
	}

	public final Native_category_bindingContext native_category_binding() throws RecognitionException {
		Native_category_bindingContext _localctx = new Native_category_bindingContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_native_category_binding);
		try {
			setState(1895);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JAVA:
				_localctx = new JavaCategoryBindingContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1885);
				match(JAVA);
				setState(1886);
				((JavaCategoryBindingContext)_localctx).binding = java_class_identifier_expression(0);
				}
				break;
			case CSHARP:
				_localctx = new CSharpCategoryBindingContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1887);
				match(CSHARP);
				setState(1888);
				((CSharpCategoryBindingContext)_localctx).binding = csharp_identifier_expression(0);
				}
				break;
			case PYTHON2:
				_localctx = new Python2CategoryBindingContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1889);
				match(PYTHON2);
				setState(1890);
				((Python2CategoryBindingContext)_localctx).binding = python_category_binding();
				}
				break;
			case PYTHON3:
				_localctx = new Python3CategoryBindingContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1891);
				match(PYTHON3);
				setState(1892);
				((Python3CategoryBindingContext)_localctx).binding = python_category_binding();
				}
				break;
			case JAVASCRIPT:
				_localctx = new JavaScriptCategoryBindingContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1893);
				match(JAVASCRIPT);
				setState(1894);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterPython_category_binding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitPython_category_binding(this);
		}
	}

	public final Python_category_bindingContext python_category_binding() throws RecognitionException {
		Python_category_bindingContext _localctx = new Python_category_bindingContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_python_category_binding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1897);
			identifier();
			setState(1899);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				{
				setState(1898);
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
		public TerminalNode FROM() { return getToken(MParser.FROM, 0); }
		public Module_tokenContext module_token() {
			return getRuleContext(Module_tokenContext.class,0);
		}
		public TerminalNode COLON() { return getToken(MParser.COLON, 0); }
		public List<Python_identifierContext> python_identifier() {
			return getRuleContexts(Python_identifierContext.class);
		}
		public Python_identifierContext python_identifier(int i) {
			return getRuleContext(Python_identifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(MParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(MParser.DOT, i);
		}
		public Python_moduleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_python_module; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterPython_module(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitPython_module(this);
		}
	}

	public final Python_moduleContext python_module() throws RecognitionException {
		Python_moduleContext _localctx = new Python_moduleContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_python_module);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1901);
			match(FROM);
			setState(1902);
			module_token();
			setState(1903);
			match(COLON);
			setState(1904);
			python_identifier();
			setState(1909);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1905);
					match(DOT);
					setState(1906);
					python_identifier();
					}
					} 
				}
				setState(1911);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
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
		public List<TerminalNode> DOT() { return getTokens(MParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(MParser.DOT, i);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJavascript_category_binding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJavascript_category_binding(this);
		}
	}

	public final Javascript_category_bindingContext javascript_category_binding() throws RecognitionException {
		Javascript_category_bindingContext _localctx = new Javascript_category_bindingContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_javascript_category_binding);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1912);
			javascript_identifier();
			setState(1917);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1913);
					match(DOT);
					setState(1914);
					javascript_identifier();
					}
					} 
				}
				setState(1919);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
			}
			setState(1921);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				{
				setState(1920);
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
		public TerminalNode FROM() { return getToken(MParser.FROM, 0); }
		public Module_tokenContext module_token() {
			return getRuleContext(Module_tokenContext.class,0);
		}
		public TerminalNode COLON() { return getToken(MParser.COLON, 0); }
		public List<Javascript_identifierContext> javascript_identifier() {
			return getRuleContexts(Javascript_identifierContext.class);
		}
		public Javascript_identifierContext javascript_identifier(int i) {
			return getRuleContext(Javascript_identifierContext.class,i);
		}
		public List<TerminalNode> SLASH() { return getTokens(MParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(MParser.SLASH, i);
		}
		public TerminalNode DOT() { return getToken(MParser.DOT, 0); }
		public Javascript_moduleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javascript_module; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJavascript_module(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJavascript_module(this);
		}
	}

	public final Javascript_moduleContext javascript_module() throws RecognitionException {
		Javascript_moduleContext _localctx = new Javascript_moduleContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_javascript_module);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1923);
			match(FROM);
			setState(1924);
			module_token();
			setState(1925);
			match(COLON);
			setState(1927);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SLASH) {
				{
				setState(1926);
				match(SLASH);
				}
			}

			setState(1929);
			javascript_identifier();
			setState(1934);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1930);
					match(SLASH);
					setState(1931);
					javascript_identifier();
					}
					} 
				}
				setState(1936);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
			}
			setState(1939);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				{
				setState(1937);
				match(DOT);
				setState(1938);
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
		public List<TerminalNode> COMMA() { return getTokens(MParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MParser.COMMA, i);
		}
		public Variable_identifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_identifier_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterVariable_identifier_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitVariable_identifier_list(this);
		}
	}

	public final Variable_identifier_listContext variable_identifier_list() throws RecognitionException {
		Variable_identifier_listContext _localctx = new Variable_identifier_listContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_variable_identifier_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1941);
			variable_identifier();
			setState(1946);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1942);
				match(COMMA);
				setState(1943);
				variable_identifier();
				}
				}
				setState(1948);
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
		public List<TerminalNode> COMMA() { return getTokens(MParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MParser.COMMA, i);
		}
		public Attribute_identifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_identifier_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterAttribute_identifier_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitAttribute_identifier_list(this);
		}
	}

	public final Attribute_identifier_listContext attribute_identifier_list() throws RecognitionException {
		Attribute_identifier_listContext _localctx = new Attribute_identifier_listContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_attribute_identifier_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1949);
			attribute_identifier();
			setState(1954);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1950);
				match(COMMA);
				setState(1951);
				attribute_identifier();
				}
				}
				setState(1956);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterMethod_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitMethod_declaration(this);
		}
	}

	public final Method_declarationContext method_declaration() throws RecognitionException {
		Method_declarationContext _localctx = new Method_declarationContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_method_declaration);
		try {
			setState(1961);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1957);
				abstract_method_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1958);
				concrete_method_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1959);
				native_method_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1960);
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
		public TerminalNode COMMENT() { return getToken(MParser.COMMENT, 0); }
		public Comment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterComment_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitComment_statement(this);
		}
	}

	public final Comment_statementContext comment_statement() throws RecognitionException {
		Comment_statementContext _localctx = new Comment_statementContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_comment_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1963);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterNative_statement_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitNative_statement_list(this);
		}
	}

	public final Native_statement_listContext native_statement_list() throws RecognitionException {
		Native_statement_listContext _localctx = new Native_statement_listContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_native_statement_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1965);
			native_statement();
			setState(1971);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,154,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1966);
					lfp();
					setState(1967);
					native_statement();
					}
					} 
				}
				setState(1973);
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
		public TerminalNode CSHARP() { return getToken(MParser.CSHARP, 0); }
		public Csharp_statementContext csharp_statement() {
			return getRuleContext(Csharp_statementContext.class,0);
		}
		public CSharpNativeStatementContext(Native_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterCSharpNativeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitCSharpNativeStatement(this);
		}
	}
	public static class JavaNativeStatementContext extends Native_statementContext {
		public TerminalNode JAVA() { return getToken(MParser.JAVA, 0); }
		public Java_statementContext java_statement() {
			return getRuleContext(Java_statementContext.class,0);
		}
		public JavaNativeStatementContext(Native_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJavaNativeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJavaNativeStatement(this);
		}
	}
	public static class JavaScriptNativeStatementContext extends Native_statementContext {
		public TerminalNode JAVASCRIPT() { return getToken(MParser.JAVASCRIPT, 0); }
		public Javascript_native_statementContext javascript_native_statement() {
			return getRuleContext(Javascript_native_statementContext.class,0);
		}
		public JavaScriptNativeStatementContext(Native_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJavaScriptNativeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJavaScriptNativeStatement(this);
		}
	}
	public static class Python2NativeStatementContext extends Native_statementContext {
		public TerminalNode PYTHON2() { return getToken(MParser.PYTHON2, 0); }
		public Python_native_statementContext python_native_statement() {
			return getRuleContext(Python_native_statementContext.class,0);
		}
		public Python2NativeStatementContext(Native_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterPython2NativeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitPython2NativeStatement(this);
		}
	}
	public static class Python3NativeStatementContext extends Native_statementContext {
		public TerminalNode PYTHON3() { return getToken(MParser.PYTHON3, 0); }
		public Python_native_statementContext python_native_statement() {
			return getRuleContext(Python_native_statementContext.class,0);
		}
		public Python3NativeStatementContext(Native_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterPython3NativeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitPython3NativeStatement(this);
		}
	}

	public final Native_statementContext native_statement() throws RecognitionException {
		Native_statementContext _localctx = new Native_statementContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_native_statement);
		try {
			setState(1984);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JAVA:
				_localctx = new JavaNativeStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1974);
				match(JAVA);
				setState(1975);
				java_statement();
				}
				break;
			case CSHARP:
				_localctx = new CSharpNativeStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1976);
				match(CSHARP);
				setState(1977);
				csharp_statement();
				}
				break;
			case PYTHON2:
				_localctx = new Python2NativeStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1978);
				match(PYTHON2);
				setState(1979);
				python_native_statement();
				}
				break;
			case PYTHON3:
				_localctx = new Python3NativeStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1980);
				match(PYTHON3);
				setState(1981);
				python_native_statement();
				}
				break;
			case JAVASCRIPT:
				_localctx = new JavaScriptNativeStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1982);
				match(JAVASCRIPT);
				setState(1983);
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
		public TerminalNode SEMI() { return getToken(MParser.SEMI, 0); }
		public Python_moduleContext python_module() {
			return getRuleContext(Python_moduleContext.class,0);
		}
		public Python_native_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_python_native_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterPython_native_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitPython_native_statement(this);
		}
	}

	public final Python_native_statementContext python_native_statement() throws RecognitionException {
		Python_native_statementContext _localctx = new Python_native_statementContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_python_native_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1986);
			python_statement();
			setState(1988);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1987);
				match(SEMI);
				}
			}

			setState(1991);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(1990);
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
		public TerminalNode SEMI() { return getToken(MParser.SEMI, 0); }
		public Javascript_moduleContext javascript_module() {
			return getRuleContext(Javascript_moduleContext.class,0);
		}
		public Javascript_native_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javascript_native_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJavascript_native_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJavascript_native_statement(this);
		}
	}

	public final Javascript_native_statementContext javascript_native_statement() throws RecognitionException {
		Javascript_native_statementContext _localctx = new Javascript_native_statementContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_javascript_native_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1993);
			javascript_statement();
			setState(1995);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1994);
				match(SEMI);
				}
			}

			setState(1998);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(1997);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterStatement_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitStatement_list(this);
		}
	}

	public final Statement_listContext statement_list() throws RecognitionException {
		Statement_listContext _localctx = new Statement_listContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_statement_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2000);
			statement();
			setState(2006);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2001);
					lfp();
					setState(2002);
					statement();
					}
					} 
				}
				setState(2008);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterAssertion_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitAssertion_list(this);
		}
	}

	public final Assertion_listContext assertion_list() throws RecognitionException {
		Assertion_listContext _localctx = new Assertion_listContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_assertion_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2009);
			assertion();
			setState(2015);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2010);
					lfp();
					setState(2011);
					assertion();
					}
					} 
				}
				setState(2017);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterSwitch_case_statement_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitSwitch_case_statement_list(this);
		}
	}

	public final Switch_case_statement_listContext switch_case_statement_list() throws RecognitionException {
		Switch_case_statement_listContext _localctx = new Switch_case_statement_listContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_switch_case_statement_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2018);
			switch_case_statement();
			setState(2024);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2019);
					lfp();
					setState(2020);
					switch_case_statement();
					}
					} 
				}
				setState(2026);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterCatch_statement_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitCatch_statement_list(this);
		}
	}

	public final Catch_statement_listContext catch_statement_list() throws RecognitionException {
		Catch_statement_listContext _localctx = new Catch_statement_listContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_catch_statement_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2027);
			catch_statement();
			setState(2033);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,163,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2028);
					lfp();
					setState(2029);
					catch_statement();
					}
					} 
				}
				setState(2035);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,163,_ctx);
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
		public TerminalNode LBRAK() { return getToken(MParser.LBRAK, 0); }
		public Literal_list_literalContext literal_list_literal() {
			return getRuleContext(Literal_list_literalContext.class,0);
		}
		public TerminalNode RBRAK() { return getToken(MParser.RBRAK, 0); }
		public LiteralListLiteralContext(Literal_collectionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterLiteralListLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitLiteralListLiteral(this);
		}
	}
	public static class LiteralRangeLiteralContext extends Literal_collectionContext {
		public Atomic_literalContext low;
		public Atomic_literalContext high;
		public TerminalNode LBRAK() { return getToken(MParser.LBRAK, 0); }
		public TerminalNode RANGE() { return getToken(MParser.RANGE, 0); }
		public TerminalNode RBRAK() { return getToken(MParser.RBRAK, 0); }
		public List<Atomic_literalContext> atomic_literal() {
			return getRuleContexts(Atomic_literalContext.class);
		}
		public Atomic_literalContext atomic_literal(int i) {
			return getRuleContext(Atomic_literalContext.class,i);
		}
		public LiteralRangeLiteralContext(Literal_collectionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterLiteralRangeLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitLiteralRangeLiteral(this);
		}
	}
	public static class LiteralSetLiteralContext extends Literal_collectionContext {
		public TerminalNode LT() { return getToken(MParser.LT, 0); }
		public Literal_list_literalContext literal_list_literal() {
			return getRuleContext(Literal_list_literalContext.class,0);
		}
		public TerminalNode GT() { return getToken(MParser.GT, 0); }
		public LiteralSetLiteralContext(Literal_collectionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterLiteralSetLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitLiteralSetLiteral(this);
		}
	}

	public final Literal_collectionContext literal_collection() throws RecognitionException {
		Literal_collectionContext _localctx = new Literal_collectionContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_literal_collection);
		try {
			setState(2050);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				_localctx = new LiteralRangeLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2036);
				match(LBRAK);
				setState(2037);
				((LiteralRangeLiteralContext)_localctx).low = atomic_literal();
				setState(2038);
				match(RANGE);
				setState(2039);
				((LiteralRangeLiteralContext)_localctx).high = atomic_literal();
				setState(2040);
				match(RBRAK);
				}
				break;
			case 2:
				_localctx = new LiteralListLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2042);
				match(LBRAK);
				setState(2043);
				literal_list_literal();
				setState(2044);
				match(RBRAK);
				}
				break;
			case 3:
				_localctx = new LiteralSetLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2046);
				match(LT);
				setState(2047);
				literal_list_literal();
				setState(2048);
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
		public TerminalNode MIN_INTEGER() { return getToken(MParser.MIN_INTEGER, 0); }
		public MinIntegerLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterMinIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitMinIntegerLiteral(this);
		}
	}
	public static class DateLiteralContext extends Atomic_literalContext {
		public TerminalNode DATE_LITERAL() { return getToken(MParser.DATE_LITERAL, 0); }
		public DateLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterDateLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitDateLiteral(this);
		}
	}
	public static class SymbolLiteralContext extends Atomic_literalContext {
		public Symbol_identifierContext symbol_identifier() {
			return getRuleContext(Symbol_identifierContext.class,0);
		}
		public SymbolLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterSymbolLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitSymbolLiteral(this);
		}
	}
	public static class BooleanLiteralContext extends Atomic_literalContext {
		public TerminalNode BOOLEAN_LITERAL() { return getToken(MParser.BOOLEAN_LITERAL, 0); }
		public BooleanLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitBooleanLiteral(this);
		}
	}
	public static class VersionLiteralContext extends Atomic_literalContext {
		public TerminalNode VERSION_LITERAL() { return getToken(MParser.VERSION_LITERAL, 0); }
		public VersionLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterVersionLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitVersionLiteral(this);
		}
	}
	public static class HexadecimalLiteralContext extends Atomic_literalContext {
		public TerminalNode HEXA_LITERAL() { return getToken(MParser.HEXA_LITERAL, 0); }
		public HexadecimalLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterHexadecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitHexadecimalLiteral(this);
		}
	}
	public static class UUIDLiteralContext extends Atomic_literalContext {
		public TerminalNode UUID_LITERAL() { return getToken(MParser.UUID_LITERAL, 0); }
		public UUIDLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterUUIDLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitUUIDLiteral(this);
		}
	}
	public static class MaxIntegerLiteralContext extends Atomic_literalContext {
		public TerminalNode MAX_INTEGER() { return getToken(MParser.MAX_INTEGER, 0); }
		public MaxIntegerLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterMaxIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitMaxIntegerLiteral(this);
		}
	}
	public static class TypeLiteralContext extends Atomic_literalContext {
		public Type_literalContext type_literal() {
			return getRuleContext(Type_literalContext.class,0);
		}
		public TypeLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterTypeLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitTypeLiteral(this);
		}
	}
	public static class DateTimeLiteralContext extends Atomic_literalContext {
		public TerminalNode DATETIME_LITERAL() { return getToken(MParser.DATETIME_LITERAL, 0); }
		public DateTimeLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterDateTimeLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitDateTimeLiteral(this);
		}
	}
	public static class PeriodLiteralContext extends Atomic_literalContext {
		public TerminalNode PERIOD_LITERAL() { return getToken(MParser.PERIOD_LITERAL, 0); }
		public PeriodLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterPeriodLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitPeriodLiteral(this);
		}
	}
	public static class DecimalLiteralContext extends Atomic_literalContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(MParser.DECIMAL_LITERAL, 0); }
		public DecimalLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitDecimalLiteral(this);
		}
	}
	public static class TextLiteralContext extends Atomic_literalContext {
		public TerminalNode TEXT_LITERAL() { return getToken(MParser.TEXT_LITERAL, 0); }
		public TextLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterTextLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitTextLiteral(this);
		}
	}
	public static class NullLiteralContext extends Atomic_literalContext {
		public Null_literalContext null_literal() {
			return getRuleContext(Null_literalContext.class,0);
		}
		public NullLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitNullLiteral(this);
		}
	}
	public static class IntegerLiteralContext extends Atomic_literalContext {
		public TerminalNode INTEGER_LITERAL() { return getToken(MParser.INTEGER_LITERAL, 0); }
		public IntegerLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitIntegerLiteral(this);
		}
	}
	public static class TimeLiteralContext extends Atomic_literalContext {
		public TerminalNode TIME_LITERAL() { return getToken(MParser.TIME_LITERAL, 0); }
		public TimeLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterTimeLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitTimeLiteral(this);
		}
	}
	public static class CharacterLiteralContext extends Atomic_literalContext {
		public TerminalNode CHAR_LITERAL() { return getToken(MParser.CHAR_LITERAL, 0); }
		public CharacterLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterCharacterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitCharacterLiteral(this);
		}
	}

	public final Atomic_literalContext atomic_literal() throws RecognitionException {
		Atomic_literalContext _localctx = new Atomic_literalContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_atomic_literal);
		try {
			setState(2069);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MIN_INTEGER:
				_localctx = new MinIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2052);
				match(MIN_INTEGER);
				}
				break;
			case MAX_INTEGER:
				_localctx = new MaxIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2053);
				match(MAX_INTEGER);
				}
				break;
			case INTEGER_LITERAL:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2054);
				match(INTEGER_LITERAL);
				}
				break;
			case HEXA_LITERAL:
				_localctx = new HexadecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2055);
				match(HEXA_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new CharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2056);
				match(CHAR_LITERAL);
				}
				break;
			case DATE_LITERAL:
				_localctx = new DateLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2057);
				match(DATE_LITERAL);
				}
				break;
			case TIME_LITERAL:
				_localctx = new TimeLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(2058);
				match(TIME_LITERAL);
				}
				break;
			case TEXT_LITERAL:
				_localctx = new TextLiteralContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(2059);
				match(TEXT_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(2060);
				match(DECIMAL_LITERAL);
				}
				break;
			case DATETIME_LITERAL:
				_localctx = new DateTimeLiteralContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(2061);
				match(DATETIME_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(2062);
				match(BOOLEAN_LITERAL);
				}
				break;
			case PERIOD_LITERAL:
				_localctx = new PeriodLiteralContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(2063);
				match(PERIOD_LITERAL);
				}
				break;
			case VERSION_LITERAL:
				_localctx = new VersionLiteralContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(2064);
				match(VERSION_LITERAL);
				}
				break;
			case UUID_LITERAL:
				_localctx = new UUIDLiteralContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(2065);
				match(UUID_LITERAL);
				}
				break;
			case SYMBOL_IDENTIFIER:
				_localctx = new SymbolLiteralContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(2066);
				symbol_identifier();
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
				_localctx = new TypeLiteralContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(2067);
				type_literal();
				}
				break;
			case NONE:
				_localctx = new NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(2068);
				null_literal();
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

	public static class Literal_list_literalContext extends ParserRuleContext {
		public List<Atomic_literalContext> atomic_literal() {
			return getRuleContexts(Atomic_literalContext.class);
		}
		public Atomic_literalContext atomic_literal(int i) {
			return getRuleContext(Atomic_literalContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MParser.COMMA, i);
		}
		public Literal_list_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_list_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterLiteral_list_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitLiteral_list_literal(this);
		}
	}

	public final Literal_list_literalContext literal_list_literal() throws RecognitionException {
		Literal_list_literalContext _localctx = new Literal_list_literalContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_literal_list_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2071);
			atomic_literal();
			setState(2076);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2072);
				match(COMMA);
				setState(2073);
				atomic_literal();
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

	public static class This_expressionContext extends ParserRuleContext {
		public TerminalNode SELF() { return getToken(MParser.SELF, 0); }
		public TerminalNode THIS() { return getToken(MParser.THIS, 0); }
		public This_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_this_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterThis_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitThis_expression(this);
		}
	}

	public final This_expressionContext this_expression() throws RecognitionException {
		This_expressionContext _localctx = new This_expressionContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_this_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2079);
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
		public TerminalNode SUPER() { return getToken(MParser.SUPER, 0); }
		public Category_typeContext category_type() {
			return getRuleContext(Category_typeContext.class,0);
		}
		public TerminalNode DOT() { return getToken(MParser.DOT, 0); }
		public Super_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_super_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterSuper_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitSuper_expression(this);
		}
	}

	public final Super_expressionContext super_expression() throws RecognitionException {
		Super_expressionContext _localctx = new Super_expressionContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_super_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2084);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE_IDENTIFIER) {
				{
				setState(2081);
				category_type();
				setState(2082);
				match(DOT);
				}
			}

			setState(2086);
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
		public TerminalNode LPAR() { return getToken(MParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(MParser.RPAR, 0); }
		public Parenthesis_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesis_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterParenthesis_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitParenthesis_expression(this);
		}
	}

	public final Parenthesis_expressionContext parenthesis_expression() throws RecognitionException {
		Parenthesis_expressionContext _localctx = new Parenthesis_expressionContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_parenthesis_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2088);
			match(LPAR);
			setState(2089);
			expression(0);
			setState(2090);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterLiteral_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitLiteral_expression(this);
		}
	}

	public final Literal_expressionContext literal_expression() throws RecognitionException {
		Literal_expressionContext _localctx = new Literal_expressionContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_literal_expression);
		try {
			setState(2094);
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
			case ANY:
			case NONE:
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
				enterOuterAlt(_localctx, 1);
				{
				setState(2092);
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
				setState(2093);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterCollection_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitCollection_literal(this);
		}
	}

	public final Collection_literalContext collection_literal() throws RecognitionException {
		Collection_literalContext _localctx = new Collection_literalContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_collection_literal);
		try {
			setState(2102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2096);
				range_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2097);
				list_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2098);
				set_literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2099);
				dict_literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2100);
				document_literal();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2101);
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
		public TerminalNode LPAR() { return getToken(MParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(MParser.RPAR, 0); }
		public TerminalNode MUTABLE() { return getToken(MParser.MUTABLE, 0); }
		public Expression_tupleContext expression_tuple() {
			return getRuleContext(Expression_tupleContext.class,0);
		}
		public Tuple_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterTuple_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitTuple_literal(this);
		}
	}

	public final Tuple_literalContext tuple_literal() throws RecognitionException {
		Tuple_literalContext _localctx = new Tuple_literalContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_tuple_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUTABLE) {
				{
				setState(2104);
				match(MUTABLE);
				}
			}

			setState(2107);
			match(LPAR);
			setState(2109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << LTCOLONGT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (CODE - 65)) | (1L << (DOCUMENT - 65)) | (1L << (BLOB - 65)) | (1L << (IMAGE - 65)) | (1L << (UUID - 65)) | (1L << (ITERATOR - 65)) | (1L << (CURSOR - 65)) | (1L << (HTML - 65)) | (1L << (ANY - 65)) | (1L << (EXECUTE - 65)) | (1L << (FETCH - 65)) | (1L << (MUTABLE - 65)) | (1L << (NONE - 65)) | (1L << (NOT - 65)))) != 0) || ((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & ((1L << (READ - 138)) | (1L << (SELF - 138)) | (1L << (SORTED - 138)) | (1L << (SUPER - 138)) | (1L << (THIS - 138)) | (1L << (BOOLEAN_LITERAL - 138)) | (1L << (CHAR_LITERAL - 138)) | (1L << (MIN_INTEGER - 138)) | (1L << (MAX_INTEGER - 138)) | (1L << (SYMBOL_IDENTIFIER - 138)) | (1L << (TYPE_IDENTIFIER - 138)) | (1L << (VARIABLE_IDENTIFIER - 138)) | (1L << (TEXT_LITERAL - 138)) | (1L << (UUID_LITERAL - 138)) | (1L << (INTEGER_LITERAL - 138)) | (1L << (HEXA_LITERAL - 138)) | (1L << (DECIMAL_LITERAL - 138)) | (1L << (DATETIME_LITERAL - 138)) | (1L << (TIME_LITERAL - 138)) | (1L << (DATE_LITERAL - 138)) | (1L << (PERIOD_LITERAL - 138)) | (1L << (VERSION_LITERAL - 138)))) != 0)) {
				{
				setState(2108);
				expression_tuple();
				}
			}

			setState(2111);
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
		public TerminalNode LTCOLONGT() { return getToken(MParser.LTCOLONGT, 0); }
		public TerminalNode MUTABLE() { return getToken(MParser.MUTABLE, 0); }
		public TerminalNode LT() { return getToken(MParser.LT, 0); }
		public Dict_entry_listContext dict_entry_list() {
			return getRuleContext(Dict_entry_listContext.class,0);
		}
		public TerminalNode GT() { return getToken(MParser.GT, 0); }
		public TerminalNode COLON() { return getToken(MParser.COLON, 0); }
		public Dict_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dict_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterDict_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitDict_literal(this);
		}
	}

	public final Dict_literalContext dict_literal() throws RecognitionException {
		Dict_literalContext _localctx = new Dict_literalContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_dict_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUTABLE) {
				{
				setState(2113);
				match(MUTABLE);
				}
			}

			setState(2124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				{
				{
				setState(2116);
				match(LT);
				setState(2117);
				dict_entry_list();
				setState(2118);
				match(GT);
				}
				}
				break;
			case 2:
				{
				setState(2120);
				match(LTCOLONGT);
				}
				break;
			case 3:
				{
				{
				setState(2121);
				match(LT);
				setState(2122);
				match(COLON);
				setState(2123);
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
		public TerminalNode LCURL() { return getToken(MParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(MParser.RCURL, 0); }
		public Dict_entry_listContext dict_entry_list() {
			return getRuleContext(Dict_entry_listContext.class,0);
		}
		public Document_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterDocument_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitDocument_literal(this);
		}
	}

	public final Document_literalContext document_literal() throws RecognitionException {
		Document_literalContext _localctx = new Document_literalContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_document_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2126);
			match(LCURL);
			setState(2128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA) | (1L << CSHARP) | (1L << PYTHON2) | (1L << PYTHON3) | (1L << JAVASCRIPT) | (1L << SWIFT) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (CODE - 65)) | (1L << (DOCUMENT - 65)) | (1L << (BLOB - 65)) | (1L << (IMAGE - 65)) | (1L << (UUID - 65)) | (1L << (ITERATOR - 65)) | (1L << (CURSOR - 65)) | (1L << (HTML - 65)) | (1L << (ABSTRACT - 65)) | (1L << (ALL - 65)) | (1L << (ALWAYS - 65)) | (1L << (AND - 65)) | (1L << (ANY - 65)) | (1L << (AS - 65)) | (1L << (ASC - 65)) | (1L << (ATTR - 65)) | (1L << (ATTRIBUTE - 65)) | (1L << (ATTRIBUTES - 65)) | (1L << (BINDINGS - 65)) | (1L << (BREAK - 65)) | (1L << (BY - 65)) | (1L << (CASE - 65)) | (1L << (CATCH - 65)) | (1L << (CATEGORY - 65)) | (1L << (CLASS - 65)) | (1L << (CONTAINS - 65)) | (1L << (DEF - 65)) | (1L << (DEFAULT - 65)) | (1L << (DEFINE - 65)) | (1L << (DELETE - 65)) | (1L << (DESC - 65)) | (1L << (DO - 65)) | (1L << (DOING - 65)) | (1L << (EACH - 65)) | (1L << (ELSE - 65)) | (1L << (ENUM - 65)) | (1L << (ENUMERATED - 65)) | (1L << (EXCEPT - 65)) | (1L << (EXECUTE - 65)) | (1L << (EXPECTING - 65)) | (1L << (EXTENDS - 65)) | (1L << (FETCH - 65)) | (1L << (FILTERED - 65)) | (1L << (FINALLY - 65)) | (1L << (FLUSH - 65)) | (1L << (FOR - 65)) | (1L << (FROM - 65)) | (1L << (GETTER - 65)) | (1L << (HAS - 65)) | (1L << (IF - 65)) | (1L << (IN - 65)) | (1L << (INDEX - 65)) | (1L << (IS - 65)) | (1L << (MATCHING - 65)) | (1L << (METHOD - 65)) | (1L << (METHODS - 65)) | (1L << (MODULO - 65)) | (1L << (MUTABLE - 65)) | (1L << (NATIVE - 65)) | (1L << (NONE - 65)) | (1L << (NOT - 65)) | (1L << (NOTHING - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (NULL - 129)) | (1L << (ON - 129)) | (1L << (ONE - 129)) | (1L << (OPERATOR - 129)) | (1L << (OR - 129)) | (1L << (ORDER - 129)) | (1L << (OTHERWISE - 129)) | (1L << (PASS - 129)) | (1L << (RAISE - 129)) | (1L << (READ - 129)) | (1L << (RECEIVING - 129)) | (1L << (RESOURCE - 129)) | (1L << (RETURN - 129)) | (1L << (RETURNING - 129)) | (1L << (ROWS - 129)) | (1L << (SELF - 129)) | (1L << (SETTER - 129)) | (1L << (SINGLETON - 129)) | (1L << (SORTED - 129)) | (1L << (STORABLE - 129)) | (1L << (STORE - 129)) | (1L << (SUPER - 129)) | (1L << (SWITCH - 129)) | (1L << (TEST - 129)) | (1L << (THIS - 129)) | (1L << (THROW - 129)) | (1L << (TO - 129)) | (1L << (TRY - 129)) | (1L << (VERIFYING - 129)) | (1L << (WIDGET - 129)) | (1L << (WITH - 129)) | (1L << (WHEN - 129)) | (1L << (WHERE - 129)) | (1L << (WHILE - 129)) | (1L << (WRITE - 129)) | (1L << (SYMBOL_IDENTIFIER - 129)) | (1L << (TYPE_IDENTIFIER - 129)) | (1L << (VARIABLE_IDENTIFIER - 129)) | (1L << (TEXT_LITERAL - 129)))) != 0)) {
				{
				setState(2127);
				dict_entry_list();
				}
			}

			setState(2130);
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
		public List<TerminalNode> COMMA() { return getTokens(MParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MParser.COMMA, i);
		}
		public Expression_tupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_tuple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterExpression_tuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitExpression_tuple(this);
		}
	}

	public final Expression_tupleContext expression_tuple() throws RecognitionException {
		Expression_tupleContext _localctx = new Expression_tupleContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_expression_tuple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2132);
			expression(0);
			setState(2133);
			match(COMMA);
			setState(2142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << LTCOLONGT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (CODE - 65)) | (1L << (DOCUMENT - 65)) | (1L << (BLOB - 65)) | (1L << (IMAGE - 65)) | (1L << (UUID - 65)) | (1L << (ITERATOR - 65)) | (1L << (CURSOR - 65)) | (1L << (HTML - 65)) | (1L << (ANY - 65)) | (1L << (EXECUTE - 65)) | (1L << (FETCH - 65)) | (1L << (MUTABLE - 65)) | (1L << (NONE - 65)) | (1L << (NOT - 65)))) != 0) || ((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & ((1L << (READ - 138)) | (1L << (SELF - 138)) | (1L << (SORTED - 138)) | (1L << (SUPER - 138)) | (1L << (THIS - 138)) | (1L << (BOOLEAN_LITERAL - 138)) | (1L << (CHAR_LITERAL - 138)) | (1L << (MIN_INTEGER - 138)) | (1L << (MAX_INTEGER - 138)) | (1L << (SYMBOL_IDENTIFIER - 138)) | (1L << (TYPE_IDENTIFIER - 138)) | (1L << (VARIABLE_IDENTIFIER - 138)) | (1L << (TEXT_LITERAL - 138)) | (1L << (UUID_LITERAL - 138)) | (1L << (INTEGER_LITERAL - 138)) | (1L << (HEXA_LITERAL - 138)) | (1L << (DECIMAL_LITERAL - 138)) | (1L << (DATETIME_LITERAL - 138)) | (1L << (TIME_LITERAL - 138)) | (1L << (DATE_LITERAL - 138)) | (1L << (PERIOD_LITERAL - 138)) | (1L << (VERSION_LITERAL - 138)))) != 0)) {
				{
				setState(2134);
				expression(0);
				setState(2139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2135);
					match(COMMA);
					setState(2136);
					expression(0);
					}
					}
					setState(2141);
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

	public static class Dict_entry_listContext extends ParserRuleContext {
		public List<Dict_entryContext> dict_entry() {
			return getRuleContexts(Dict_entryContext.class);
		}
		public Dict_entryContext dict_entry(int i) {
			return getRuleContext(Dict_entryContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MParser.COMMA, i);
		}
		public Dict_entry_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dict_entry_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterDict_entry_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitDict_entry_list(this);
		}
	}

	public final Dict_entry_listContext dict_entry_list() throws RecognitionException {
		Dict_entry_listContext _localctx = new Dict_entry_listContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_dict_entry_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2144);
			dict_entry();
			setState(2149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2145);
				match(COMMA);
				setState(2146);
				dict_entry();
				}
				}
				setState(2151);
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
		public TerminalNode COLON() { return getToken(MParser.COLON, 0); }
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterDict_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitDict_entry(this);
		}
	}

	public final Dict_entryContext dict_entry() throws RecognitionException {
		Dict_entryContext _localctx = new Dict_entryContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_dict_entry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2152);
			((Dict_entryContext)_localctx).key = dict_key();
			setState(2153);
			match(COLON);
			setState(2154);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterDictKeyIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitDictKeyIdentifier(this);
		}
	}
	public static class DictKeyTextContext extends Dict_keyContext {
		public Token name;
		public TerminalNode TEXT_LITERAL() { return getToken(MParser.TEXT_LITERAL, 0); }
		public DictKeyTextContext(Dict_keyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterDictKeyText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitDictKeyText(this);
		}
	}

	public final Dict_keyContext dict_key() throws RecognitionException {
		Dict_keyContext _localctx = new Dict_keyContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_dict_key);
		try {
			setState(2158);
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
				setState(2156);
				((DictKeyIdentifierContext)_localctx).name = identifier_or_keyword();
				}
				break;
			case TEXT_LITERAL:
				_localctx = new DictKeyTextContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2157);
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
		public TerminalNode COLON() { return getToken(MParser.COLON, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SliceFirstAndLastContext(Slice_argumentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterSliceFirstAndLast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitSliceFirstAndLast(this);
		}
	}
	public static class SliceLastOnlyContext extends Slice_argumentsContext {
		public ExpressionContext last;
		public TerminalNode COLON() { return getToken(MParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SliceLastOnlyContext(Slice_argumentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterSliceLastOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitSliceLastOnly(this);
		}
	}
	public static class SliceFirstOnlyContext extends Slice_argumentsContext {
		public ExpressionContext first;
		public TerminalNode COLON() { return getToken(MParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SliceFirstOnlyContext(Slice_argumentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterSliceFirstOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitSliceFirstOnly(this);
		}
	}

	public final Slice_argumentsContext slice_arguments() throws RecognitionException {
		Slice_argumentsContext _localctx = new Slice_argumentsContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_slice_arguments);
		try {
			setState(2169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
			case 1:
				_localctx = new SliceFirstAndLastContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2160);
				((SliceFirstAndLastContext)_localctx).first = expression(0);
				setState(2161);
				match(COLON);
				setState(2162);
				((SliceFirstAndLastContext)_localctx).last = expression(0);
				}
				break;
			case 2:
				_localctx = new SliceFirstOnlyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2164);
				((SliceFirstOnlyContext)_localctx).first = expression(0);
				setState(2165);
				match(COLON);
				}
				break;
			case 3:
				_localctx = new SliceLastOnlyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2167);
				match(COLON);
				setState(2168);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterAssign_variable_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitAssign_variable_statement(this);
		}
	}

	public final Assign_variable_statementContext assign_variable_statement() throws RecognitionException {
		Assign_variable_statementContext _localctx = new Assign_variable_statementContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_assign_variable_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2171);
			variable_identifier();
			setState(2172);
			assign();
			setState(2173);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterChildInstance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitChildInstance(this);
		}
	}
	public static class RootInstanceContext extends Assignable_instanceContext {
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public RootInstanceContext(Assignable_instanceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterRootInstance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitRootInstance(this);
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
		int _startState = 312;
		enterRecursionRule(_localctx, 312, RULE_assignable_instance, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new RootInstanceContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2176);
			variable_identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(2182);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ChildInstanceContext(new Assignable_instanceContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_assignable_instance);
					setState(2178);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2179);
					child_instance();
					}
					} 
				}
				setState(2184);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
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
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(MParser.VARIABLE_IDENTIFIER, 0); }
		public Category_or_any_typeContext category_or_any_type() {
			return getRuleContext(Category_or_any_typeContext.class,0);
		}
		public IsATypeExpressionContext(Is_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterIsATypeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitIsATypeExpression(this);
		}
	}
	public static class IsOtherExpressionContext extends Is_expressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IsOtherExpressionContext(Is_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterIsOtherExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitIsOtherExpression(this);
		}
	}

	public final Is_expressionContext is_expression() throws RecognitionException {
		Is_expressionContext _localctx = new Is_expressionContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_is_expression);
		try {
			setState(2189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				_localctx = new IsATypeExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2185);
				if (!(this.willBeAOrAn())) throw new FailedPredicateException(this, "$parser.willBeAOrAn()");
				setState(2186);
				match(VARIABLE_IDENTIFIER);
				setState(2187);
				category_or_any_type();
				}
				break;
			case 2:
				_localctx = new IsOtherExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2188);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterArrowExpressionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitArrowExpressionBody(this);
		}
	}
	public static class ArrowStatementsBodyContext extends Arrow_expressionContext {
		public Arrow_prefixContext arrow_prefix() {
			return getRuleContext(Arrow_prefixContext.class,0);
		}
		public TerminalNode LCURL() { return getToken(MParser.LCURL, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public TerminalNode RCURL() { return getToken(MParser.RCURL, 0); }
		public ArrowStatementsBodyContext(Arrow_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterArrowStatementsBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitArrowStatementsBody(this);
		}
	}

	public final Arrow_expressionContext arrow_expression() throws RecognitionException {
		Arrow_expressionContext _localctx = new Arrow_expressionContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_arrow_expression);
		try {
			setState(2199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				_localctx = new ArrowExpressionBodyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2191);
				arrow_prefix();
				setState(2192);
				expression(0);
				}
				break;
			case 2:
				_localctx = new ArrowStatementsBodyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2194);
				arrow_prefix();
				setState(2195);
				match(LCURL);
				setState(2196);
				statement_list();
				setState(2197);
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
		public TerminalNode EGT() { return getToken(MParser.EGT, 0); }
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterArrow_prefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitArrow_prefix(this);
		}
	}

	public final Arrow_prefixContext arrow_prefix() throws RecognitionException {
		Arrow_prefixContext _localctx = new Arrow_prefixContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_arrow_prefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2201);
			arrow_args();
			setState(2202);
			((Arrow_prefixContext)_localctx).s1 = ws_plus();
			setState(2203);
			match(EGT);
			setState(2204);
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
		public TerminalNode LPAR() { return getToken(MParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(MParser.RPAR, 0); }
		public Variable_identifier_listContext variable_identifier_list() {
			return getRuleContext(Variable_identifier_listContext.class,0);
		}
		public ArrowListArgContext(Arrow_argsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterArrowListArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitArrowListArg(this);
		}
	}
	public static class ArrowSingleArgContext extends Arrow_argsContext {
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public ArrowSingleArgContext(Arrow_argsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterArrowSingleArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitArrowSingleArg(this);
		}
	}

	public final Arrow_argsContext arrow_args() throws RecognitionException {
		Arrow_argsContext _localctx = new Arrow_argsContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_arrow_args);
		int _la;
		try {
			setState(2212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE_IDENTIFIER:
				_localctx = new ArrowSingleArgContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2206);
				variable_identifier();
				}
				break;
			case LPAR:
				_localctx = new ArrowListArgContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2207);
				match(LPAR);
				setState(2209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VARIABLE_IDENTIFIER) {
					{
					setState(2208);
					variable_identifier_list();
					}
				}

				setState(2211);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterSorted_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitSorted_key(this);
		}
	}

	public final Sorted_keyContext sorted_key() throws RecognitionException {
		Sorted_keyContext _localctx = new Sorted_keyContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_sorted_key);
		try {
			setState(2216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2214);
				instance_expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2215);
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
		public TerminalNode READ() { return getToken(MParser.READ, 0); }
		public TerminalNode BLOB() { return getToken(MParser.BLOB, 0); }
		public TerminalNode FROM() { return getToken(MParser.FROM, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Read_blob_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_blob_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterRead_blob_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitRead_blob_expression(this);
		}
	}

	public final Read_blob_expressionContext read_blob_expression() throws RecognitionException {
		Read_blob_expressionContext _localctx = new Read_blob_expressionContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_read_blob_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2218);
			match(READ);
			setState(2219);
			match(BLOB);
			setState(2220);
			match(FROM);
			setState(2221);
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
		public TerminalNode READ() { return getToken(MParser.READ, 0); }
		public TerminalNode ALL() { return getToken(MParser.ALL, 0); }
		public TerminalNode FROM() { return getToken(MParser.FROM, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Read_all_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_all_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterRead_all_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitRead_all_expression(this);
		}
	}

	public final Read_all_expressionContext read_all_expression() throws RecognitionException {
		Read_all_expressionContext _localctx = new Read_all_expressionContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_read_all_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2223);
			match(READ);
			setState(2224);
			match(ALL);
			setState(2225);
			match(FROM);
			setState(2226);
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
		public TerminalNode READ() { return getToken(MParser.READ, 0); }
		public TerminalNode ONE() { return getToken(MParser.ONE, 0); }
		public TerminalNode FROM() { return getToken(MParser.FROM, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Read_one_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_one_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterRead_one_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitRead_one_expression(this);
		}
	}

	public final Read_one_expressionContext read_one_expression() throws RecognitionException {
		Read_one_expressionContext _localctx = new Read_one_expressionContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_read_one_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2228);
			match(READ);
			setState(2229);
			match(ONE);
			setState(2230);
			match(FROM);
			setState(2231);
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
		public List<TerminalNode> COMMA() { return getTokens(MParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MParser.COMMA, i);
		}
		public Order_by_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterOrder_by_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitOrder_by_list(this);
		}
	}

	public final Order_by_listContext order_by_list() throws RecognitionException {
		Order_by_listContext _localctx = new Order_by_listContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_order_by_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2233);
			order_by();
			setState(2238);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2234);
					match(COMMA);
					setState(2235);
					order_by();
					}
					} 
				}
				setState(2240);
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

	public static class Order_byContext extends ParserRuleContext {
		public List<Variable_identifierContext> variable_identifier() {
			return getRuleContexts(Variable_identifierContext.class);
		}
		public Variable_identifierContext variable_identifier(int i) {
			return getRuleContext(Variable_identifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(MParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(MParser.DOT, i);
		}
		public TerminalNode ASC() { return getToken(MParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(MParser.DESC, 0); }
		public Order_byContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterOrder_by(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitOrder_by(this);
		}
	}

	public final Order_byContext order_by() throws RecognitionException {
		Order_byContext _localctx = new Order_byContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_order_by);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2241);
			variable_identifier();
			setState(2246);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2242);
					match(DOT);
					setState(2243);
					variable_identifier();
					}
					} 
				}
				setState(2248);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
			}
			setState(2250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				{
				setState(2249);
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
		public TerminalNode PLUS() { return getToken(MParser.PLUS, 0); }
		public OperatorPlusContext(OperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterOperatorPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitOperatorPlus(this);
		}
	}
	public static class OperatorDivideContext extends OperatorContext {
		public DivideContext divide() {
			return getRuleContext(DivideContext.class,0);
		}
		public OperatorDivideContext(OperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterOperatorDivide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitOperatorDivide(this);
		}
	}
	public static class OperatorIDivideContext extends OperatorContext {
		public IdivideContext idivide() {
			return getRuleContext(IdivideContext.class,0);
		}
		public OperatorIDivideContext(OperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterOperatorIDivide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitOperatorIDivide(this);
		}
	}
	public static class OperatorMultiplyContext extends OperatorContext {
		public MultiplyContext multiply() {
			return getRuleContext(MultiplyContext.class,0);
		}
		public OperatorMultiplyContext(OperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterOperatorMultiply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitOperatorMultiply(this);
		}
	}
	public static class OperatorMinusContext extends OperatorContext {
		public TerminalNode MINUS() { return getToken(MParser.MINUS, 0); }
		public OperatorMinusContext(OperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterOperatorMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitOperatorMinus(this);
		}
	}
	public static class OperatorModuloContext extends OperatorContext {
		public ModuloContext modulo() {
			return getRuleContext(ModuloContext.class,0);
		}
		public OperatorModuloContext(OperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterOperatorModulo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitOperatorModulo(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_operator);
		try {
			setState(2258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				_localctx = new OperatorPlusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2252);
				match(PLUS);
				}
				break;
			case MINUS:
				_localctx = new OperatorMinusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2253);
				match(MINUS);
				}
				break;
			case STAR:
				_localctx = new OperatorMultiplyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2254);
				multiply();
				}
				break;
			case SLASH:
				_localctx = new OperatorDivideContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2255);
				divide();
				}
				break;
			case BSLASH:
				_localctx = new OperatorIDivideContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2256);
				idivide();
				}
				break;
			case PERCENT:
			case MODULO:
				_localctx = new OperatorModuloContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2257);
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
		public TerminalNode JAVA() { return getToken(MParser.JAVA, 0); }
		public TerminalNode CSHARP() { return getToken(MParser.CSHARP, 0); }
		public TerminalNode PYTHON2() { return getToken(MParser.PYTHON2, 0); }
		public TerminalNode PYTHON3() { return getToken(MParser.PYTHON3, 0); }
		public TerminalNode JAVASCRIPT() { return getToken(MParser.JAVASCRIPT, 0); }
		public TerminalNode SWIFT() { return getToken(MParser.SWIFT, 0); }
		public TerminalNode BOOLEAN() { return getToken(MParser.BOOLEAN, 0); }
		public TerminalNode CHARACTER() { return getToken(MParser.CHARACTER, 0); }
		public TerminalNode TEXT() { return getToken(MParser.TEXT, 0); }
		public TerminalNode INTEGER() { return getToken(MParser.INTEGER, 0); }
		public TerminalNode DECIMAL() { return getToken(MParser.DECIMAL, 0); }
		public TerminalNode DATE() { return getToken(MParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(MParser.TIME, 0); }
		public TerminalNode DATETIME() { return getToken(MParser.DATETIME, 0); }
		public TerminalNode PERIOD() { return getToken(MParser.PERIOD, 0); }
		public TerminalNode VERSION() { return getToken(MParser.VERSION, 0); }
		public TerminalNode CODE() { return getToken(MParser.CODE, 0); }
		public TerminalNode DOCUMENT() { return getToken(MParser.DOCUMENT, 0); }
		public TerminalNode BLOB() { return getToken(MParser.BLOB, 0); }
		public TerminalNode IMAGE() { return getToken(MParser.IMAGE, 0); }
		public TerminalNode UUID() { return getToken(MParser.UUID, 0); }
		public TerminalNode ITERATOR() { return getToken(MParser.ITERATOR, 0); }
		public TerminalNode CURSOR() { return getToken(MParser.CURSOR, 0); }
		public TerminalNode HTML() { return getToken(MParser.HTML, 0); }
		public TerminalNode ABSTRACT() { return getToken(MParser.ABSTRACT, 0); }
		public TerminalNode ALL() { return getToken(MParser.ALL, 0); }
		public TerminalNode ALWAYS() { return getToken(MParser.ALWAYS, 0); }
		public TerminalNode AND() { return getToken(MParser.AND, 0); }
		public TerminalNode ANY() { return getToken(MParser.ANY, 0); }
		public TerminalNode AS() { return getToken(MParser.AS, 0); }
		public TerminalNode ASC() { return getToken(MParser.ASC, 0); }
		public TerminalNode ATTR() { return getToken(MParser.ATTR, 0); }
		public TerminalNode ATTRIBUTE() { return getToken(MParser.ATTRIBUTE, 0); }
		public TerminalNode ATTRIBUTES() { return getToken(MParser.ATTRIBUTES, 0); }
		public TerminalNode BINDINGS() { return getToken(MParser.BINDINGS, 0); }
		public TerminalNode BREAK() { return getToken(MParser.BREAK, 0); }
		public TerminalNode BY() { return getToken(MParser.BY, 0); }
		public TerminalNode CASE() { return getToken(MParser.CASE, 0); }
		public TerminalNode CATCH() { return getToken(MParser.CATCH, 0); }
		public TerminalNode CATEGORY() { return getToken(MParser.CATEGORY, 0); }
		public TerminalNode CLASS() { return getToken(MParser.CLASS, 0); }
		public TerminalNode CONTAINS() { return getToken(MParser.CONTAINS, 0); }
		public TerminalNode DEF() { return getToken(MParser.DEF, 0); }
		public TerminalNode DEFAULT() { return getToken(MParser.DEFAULT, 0); }
		public TerminalNode DEFINE() { return getToken(MParser.DEFINE, 0); }
		public TerminalNode DELETE() { return getToken(MParser.DELETE, 0); }
		public TerminalNode DESC() { return getToken(MParser.DESC, 0); }
		public TerminalNode DO() { return getToken(MParser.DO, 0); }
		public TerminalNode DOING() { return getToken(MParser.DOING, 0); }
		public TerminalNode EACH() { return getToken(MParser.EACH, 0); }
		public TerminalNode ELSE() { return getToken(MParser.ELSE, 0); }
		public TerminalNode ENUM() { return getToken(MParser.ENUM, 0); }
		public TerminalNode ENUMERATED() { return getToken(MParser.ENUMERATED, 0); }
		public TerminalNode EXCEPT() { return getToken(MParser.EXCEPT, 0); }
		public TerminalNode EXECUTE() { return getToken(MParser.EXECUTE, 0); }
		public TerminalNode EXPECTING() { return getToken(MParser.EXPECTING, 0); }
		public TerminalNode EXTENDS() { return getToken(MParser.EXTENDS, 0); }
		public TerminalNode FETCH() { return getToken(MParser.FETCH, 0); }
		public TerminalNode FILTERED() { return getToken(MParser.FILTERED, 0); }
		public TerminalNode FINALLY() { return getToken(MParser.FINALLY, 0); }
		public TerminalNode FLUSH() { return getToken(MParser.FLUSH, 0); }
		public TerminalNode FOR() { return getToken(MParser.FOR, 0); }
		public TerminalNode FROM() { return getToken(MParser.FROM, 0); }
		public TerminalNode GETTER() { return getToken(MParser.GETTER, 0); }
		public TerminalNode HAS() { return getToken(MParser.HAS, 0); }
		public TerminalNode IF() { return getToken(MParser.IF, 0); }
		public TerminalNode IN() { return getToken(MParser.IN, 0); }
		public TerminalNode INDEX() { return getToken(MParser.INDEX, 0); }
		public TerminalNode IS() { return getToken(MParser.IS, 0); }
		public TerminalNode MATCHING() { return getToken(MParser.MATCHING, 0); }
		public TerminalNode METHOD() { return getToken(MParser.METHOD, 0); }
		public TerminalNode METHODS() { return getToken(MParser.METHODS, 0); }
		public TerminalNode MODULO() { return getToken(MParser.MODULO, 0); }
		public TerminalNode MUTABLE() { return getToken(MParser.MUTABLE, 0); }
		public TerminalNode NATIVE() { return getToken(MParser.NATIVE, 0); }
		public TerminalNode NONE() { return getToken(MParser.NONE, 0); }
		public TerminalNode NOT() { return getToken(MParser.NOT, 0); }
		public TerminalNode NOTHING() { return getToken(MParser.NOTHING, 0); }
		public TerminalNode NULL() { return getToken(MParser.NULL, 0); }
		public TerminalNode ON() { return getToken(MParser.ON, 0); }
		public TerminalNode ONE() { return getToken(MParser.ONE, 0); }
		public TerminalNode OPERATOR() { return getToken(MParser.OPERATOR, 0); }
		public TerminalNode OR() { return getToken(MParser.OR, 0); }
		public TerminalNode ORDER() { return getToken(MParser.ORDER, 0); }
		public TerminalNode OTHERWISE() { return getToken(MParser.OTHERWISE, 0); }
		public TerminalNode PASS() { return getToken(MParser.PASS, 0); }
		public TerminalNode RAISE() { return getToken(MParser.RAISE, 0); }
		public TerminalNode READ() { return getToken(MParser.READ, 0); }
		public TerminalNode RECEIVING() { return getToken(MParser.RECEIVING, 0); }
		public TerminalNode RESOURCE() { return getToken(MParser.RESOURCE, 0); }
		public TerminalNode RETURN() { return getToken(MParser.RETURN, 0); }
		public TerminalNode RETURNING() { return getToken(MParser.RETURNING, 0); }
		public TerminalNode ROWS() { return getToken(MParser.ROWS, 0); }
		public TerminalNode SELF() { return getToken(MParser.SELF, 0); }
		public TerminalNode SETTER() { return getToken(MParser.SETTER, 0); }
		public TerminalNode SINGLETON() { return getToken(MParser.SINGLETON, 0); }
		public TerminalNode SORTED() { return getToken(MParser.SORTED, 0); }
		public TerminalNode SUPER() { return getToken(MParser.SUPER, 0); }
		public TerminalNode STORABLE() { return getToken(MParser.STORABLE, 0); }
		public TerminalNode STORE() { return getToken(MParser.STORE, 0); }
		public TerminalNode SWITCH() { return getToken(MParser.SWITCH, 0); }
		public TerminalNode TEST() { return getToken(MParser.TEST, 0); }
		public TerminalNode THIS() { return getToken(MParser.THIS, 0); }
		public TerminalNode THROW() { return getToken(MParser.THROW, 0); }
		public TerminalNode TO() { return getToken(MParser.TO, 0); }
		public TerminalNode TRY() { return getToken(MParser.TRY, 0); }
		public TerminalNode VERIFYING() { return getToken(MParser.VERIFYING, 0); }
		public TerminalNode WIDGET() { return getToken(MParser.WIDGET, 0); }
		public TerminalNode WITH() { return getToken(MParser.WITH, 0); }
		public TerminalNode WHEN() { return getToken(MParser.WHEN, 0); }
		public TerminalNode WHERE() { return getToken(MParser.WHERE, 0); }
		public TerminalNode WHILE() { return getToken(MParser.WHILE, 0); }
		public TerminalNode WRITE() { return getToken(MParser.WRITE, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitKeyword(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2260);
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
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(MParser.VARIABLE_IDENTIFIER, 0); }
		public New_tokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterNew_token(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitNew_token(this);
		}
	}

	public final New_tokenContext new_token() throws RecognitionException {
		New_tokenContext _localctx = new New_tokenContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_new_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2262);
			((New_tokenContext)_localctx).i1 = match(VARIABLE_IDENTIFIER);
			setState(2263);
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
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(MParser.VARIABLE_IDENTIFIER, 0); }
		public Key_tokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterKey_token(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitKey_token(this);
		}
	}

	public final Key_tokenContext key_token() throws RecognitionException {
		Key_tokenContext _localctx = new Key_tokenContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_key_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2265);
			((Key_tokenContext)_localctx).i1 = match(VARIABLE_IDENTIFIER);
			setState(2266);
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
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(MParser.VARIABLE_IDENTIFIER, 0); }
		public Module_tokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterModule_token(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitModule_token(this);
		}
	}

	public final Module_tokenContext module_token() throws RecognitionException {
		Module_tokenContext _localctx = new Module_tokenContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_module_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2268);
			((Module_tokenContext)_localctx).i1 = match(VARIABLE_IDENTIFIER);
			setState(2269);
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
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(MParser.VARIABLE_IDENTIFIER, 0); }
		public Value_tokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterValue_token(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitValue_token(this);
		}
	}

	public final Value_tokenContext value_token() throws RecognitionException {
		Value_tokenContext _localctx = new Value_tokenContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_value_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2271);
			((Value_tokenContext)_localctx).i1 = match(VARIABLE_IDENTIFIER);
			setState(2272);
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
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(MParser.VARIABLE_IDENTIFIER, 0); }
		public Symbols_tokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbols_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterSymbols_token(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitSymbols_token(this);
		}
	}

	public final Symbols_tokenContext symbols_token() throws RecognitionException {
		Symbols_tokenContext _localctx = new Symbols_tokenContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_symbols_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2274);
			((Symbols_tokenContext)_localctx).i1 = match(VARIABLE_IDENTIFIER);
			setState(2275);
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
		public TerminalNode EQ() { return getToken(MParser.EQ, 0); }
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2277);
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
		public TerminalNode STAR() { return getToken(MParser.STAR, 0); }
		public MultiplyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiply; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterMultiply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitMultiply(this);
		}
	}

	public final MultiplyContext multiply() throws RecognitionException {
		MultiplyContext _localctx = new MultiplyContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_multiply);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2279);
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
		public TerminalNode SLASH() { return getToken(MParser.SLASH, 0); }
		public DivideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divide; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterDivide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitDivide(this);
		}
	}

	public final DivideContext divide() throws RecognitionException {
		DivideContext _localctx = new DivideContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_divide);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2281);
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
		public TerminalNode BSLASH() { return getToken(MParser.BSLASH, 0); }
		public IdivideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idivide; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterIdivide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitIdivide(this);
		}
	}

	public final IdivideContext idivide() throws RecognitionException {
		IdivideContext _localctx = new IdivideContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_idivide);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2283);
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
		public TerminalNode PERCENT() { return getToken(MParser.PERCENT, 0); }
		public TerminalNode MODULO() { return getToken(MParser.MODULO, 0); }
		public ModuloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modulo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterModulo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitModulo(this);
		}
	}

	public final ModuloContext modulo() throws RecognitionException {
		ModuloContext _localctx = new ModuloContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_modulo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2285);
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
		public TerminalNode SEMI() { return getToken(MParser.SEMI, 0); }
		public Javascript_expressionContext javascript_expression() {
			return getRuleContext(Javascript_expressionContext.class,0);
		}
		public JavascriptStatementContext(Javascript_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJavascriptStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJavascriptStatement(this);
		}
	}
	public static class JavascriptReturnStatementContext extends Javascript_statementContext {
		public Javascript_expressionContext exp;
		public TerminalNode RETURN() { return getToken(MParser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(MParser.SEMI, 0); }
		public Javascript_expressionContext javascript_expression() {
			return getRuleContext(Javascript_expressionContext.class,0);
		}
		public JavascriptReturnStatementContext(Javascript_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJavascriptReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJavascriptReturnStatement(this);
		}
	}

	public final Javascript_statementContext javascript_statement() throws RecognitionException {
		Javascript_statementContext _localctx = new Javascript_statementContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_javascript_statement);
		try {
			setState(2294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				_localctx = new JavascriptReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2287);
				match(RETURN);
				setState(2288);
				((JavascriptReturnStatementContext)_localctx).exp = javascript_expression(0);
				setState(2289);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new JavascriptStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2291);
				((JavascriptStatementContext)_localctx).exp = javascript_expression(0);
				setState(2292);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJavascriptSelectorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJavascriptSelectorExpression(this);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJavascriptPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJavascriptPrimaryExpression(this);
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
		int _startState = 360;
		enterRecursionRule(_localctx, 360, RULE_javascript_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavascriptPrimaryExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2297);
			((JavascriptPrimaryExpressionContext)_localctx).exp = javascript_primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(2303);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,191,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavascriptSelectorExpressionContext(new Javascript_expressionContext(_parentctx, _parentState));
					((JavascriptSelectorExpressionContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_javascript_expression);
					setState(2299);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2300);
					((JavascriptSelectorExpressionContext)_localctx).child = javascript_selector_expression();
					}
					} 
				}
				setState(2305);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,191,_ctx);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJavascript_primary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJavascript_primary_expression(this);
		}
	}

	public final Javascript_primary_expressionContext javascript_primary_expression() throws RecognitionException {
		Javascript_primary_expressionContext _localctx = new Javascript_primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_javascript_primary_expression);
		try {
			setState(2313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2306);
				javascript_this_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2307);
				javascript_new_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2308);
				javascript_parenthesis_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2309);
				javascript_identifier_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2310);
				javascript_literal_expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2311);
				javascript_method_expression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2312);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJavascript_this_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJavascript_this_expression(this);
		}
	}

	public final Javascript_this_expressionContext javascript_this_expression() throws RecognitionException {
		Javascript_this_expressionContext _localctx = new Javascript_this_expressionContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_javascript_this_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2315);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJavascript_new_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJavascript_new_expression(this);
		}
	}

	public final Javascript_new_expressionContext javascript_new_expression() throws RecognitionException {
		Javascript_new_expressionContext _localctx = new Javascript_new_expressionContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_javascript_new_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2317);
			new_token();
			setState(2318);
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
		public TerminalNode DOT() { return getToken(MParser.DOT, 0); }
		public Javascript_identifierContext javascript_identifier() {
			return getRuleContext(Javascript_identifierContext.class,0);
		}
		public JavaScriptMemberExpressionContext(Javascript_selector_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJavaScriptMemberExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJavaScriptMemberExpression(this);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJavaScriptItemExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJavaScriptItemExpression(this);
		}
	}
	public static class JavaScriptMethodExpressionContext extends Javascript_selector_expressionContext {
		public Javascript_method_expressionContext method;
		public TerminalNode DOT() { return getToken(MParser.DOT, 0); }
		public Javascript_method_expressionContext javascript_method_expression() {
			return getRuleContext(Javascript_method_expressionContext.class,0);
		}
		public JavaScriptMethodExpressionContext(Javascript_selector_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJavaScriptMethodExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJavaScriptMethodExpression(this);
		}
	}

	public final Javascript_selector_expressionContext javascript_selector_expression() throws RecognitionException {
		Javascript_selector_expressionContext _localctx = new Javascript_selector_expressionContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_javascript_selector_expression);
		try {
			setState(2325);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
			case 1:
				_localctx = new JavaScriptMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2320);
				match(DOT);
				setState(2321);
				((JavaScriptMethodExpressionContext)_localctx).method = javascript_method_expression();
				}
				break;
			case 2:
				_localctx = new JavaScriptMemberExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2322);
				match(DOT);
				setState(2323);
				((JavaScriptMemberExpressionContext)_localctx).name = javascript_identifier();
				}
				break;
			case 3:
				_localctx = new JavaScriptItemExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2324);
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
		public TerminalNode LPAR() { return getToken(MParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(MParser.RPAR, 0); }
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJavascript_method_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJavascript_method_expression(this);
		}
	}

	public final Javascript_method_expressionContext javascript_method_expression() throws RecognitionException {
		Javascript_method_expressionContext _localctx = new Javascript_method_expressionContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_javascript_method_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2327);
			((Javascript_method_expressionContext)_localctx).name = javascript_identifier();
			setState(2328);
			match(LPAR);
			setState(2330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA) | (1L << CSHARP) | (1L << PYTHON2) | (1L << PYTHON3) | (1L << JAVASCRIPT) | (1L << SWIFT) | (1L << LPAR) | (1L << LBRAK) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (CODE - 65)) | (1L << (DOCUMENT - 65)) | (1L << (BLOB - 65)) | (1L << (IMAGE - 65)) | (1L << (UUID - 65)) | (1L << (ITERATOR - 65)) | (1L << (CURSOR - 65)) | (1L << (HTML - 65)) | (1L << (ABSTRACT - 65)) | (1L << (ALL - 65)) | (1L << (ALWAYS - 65)) | (1L << (AND - 65)) | (1L << (ANY - 65)) | (1L << (AS - 65)) | (1L << (ASC - 65)) | (1L << (ATTR - 65)) | (1L << (ATTRIBUTE - 65)) | (1L << (ATTRIBUTES - 65)) | (1L << (BINDINGS - 65)) | (1L << (BREAK - 65)) | (1L << (BY - 65)) | (1L << (CASE - 65)) | (1L << (CATCH - 65)) | (1L << (CATEGORY - 65)) | (1L << (CLASS - 65)) | (1L << (CONTAINS - 65)) | (1L << (DEF - 65)) | (1L << (DEFAULT - 65)) | (1L << (DEFINE - 65)) | (1L << (DELETE - 65)) | (1L << (DESC - 65)) | (1L << (DO - 65)) | (1L << (DOING - 65)) | (1L << (EACH - 65)) | (1L << (ELSE - 65)) | (1L << (ENUM - 65)) | (1L << (ENUMERATED - 65)) | (1L << (EXCEPT - 65)) | (1L << (EXECUTE - 65)) | (1L << (EXPECTING - 65)) | (1L << (EXTENDS - 65)) | (1L << (FETCH - 65)) | (1L << (FILTERED - 65)) | (1L << (FINALLY - 65)) | (1L << (FLUSH - 65)) | (1L << (FOR - 65)) | (1L << (FROM - 65)) | (1L << (GETTER - 65)) | (1L << (HAS - 65)) | (1L << (IF - 65)) | (1L << (IN - 65)) | (1L << (INDEX - 65)) | (1L << (IS - 65)) | (1L << (MATCHING - 65)) | (1L << (METHOD - 65)) | (1L << (METHODS - 65)) | (1L << (MODULO - 65)) | (1L << (MUTABLE - 65)) | (1L << (NATIVE - 65)) | (1L << (NONE - 65)) | (1L << (NOT - 65)) | (1L << (NOTHING - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (NULL - 129)) | (1L << (ON - 129)) | (1L << (ONE - 129)) | (1L << (OPERATOR - 129)) | (1L << (OR - 129)) | (1L << (ORDER - 129)) | (1L << (OTHERWISE - 129)) | (1L << (PASS - 129)) | (1L << (RAISE - 129)) | (1L << (READ - 129)) | (1L << (RECEIVING - 129)) | (1L << (RESOURCE - 129)) | (1L << (RETURN - 129)) | (1L << (RETURNING - 129)) | (1L << (ROWS - 129)) | (1L << (SELF - 129)) | (1L << (SETTER - 129)) | (1L << (SINGLETON - 129)) | (1L << (SORTED - 129)) | (1L << (STORABLE - 129)) | (1L << (STORE - 129)) | (1L << (SUPER - 129)) | (1L << (SWITCH - 129)) | (1L << (TEST - 129)) | (1L << (THIS - 129)) | (1L << (THROW - 129)) | (1L << (TO - 129)) | (1L << (TRY - 129)) | (1L << (VERIFYING - 129)) | (1L << (WIDGET - 129)) | (1L << (WITH - 129)) | (1L << (WHEN - 129)) | (1L << (WHERE - 129)) | (1L << (WHILE - 129)) | (1L << (WRITE - 129)) | (1L << (BOOLEAN_LITERAL - 129)) | (1L << (CHAR_LITERAL - 129)) | (1L << (SYMBOL_IDENTIFIER - 129)) | (1L << (TYPE_IDENTIFIER - 129)) | (1L << (VARIABLE_IDENTIFIER - 129)) | (1L << (DOLLAR_IDENTIFIER - 129)) | (1L << (TEXT_LITERAL - 129)) | (1L << (INTEGER_LITERAL - 129)) | (1L << (DECIMAL_LITERAL - 129)))) != 0)) {
				{
				setState(2329);
				((Javascript_method_expressionContext)_localctx).args = javascript_arguments(0);
				}
			}

			setState(2332);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJavascriptArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJavascriptArgumentList(this);
		}
	}
	public static class JavascriptArgumentListItemContext extends Javascript_argumentsContext {
		public Javascript_argumentsContext items;
		public Javascript_expressionContext item;
		public TerminalNode COMMA() { return getToken(MParser.COMMA, 0); }
		public Javascript_argumentsContext javascript_arguments() {
			return getRuleContext(Javascript_argumentsContext.class,0);
		}
		public Javascript_expressionContext javascript_expression() {
			return getRuleContext(Javascript_expressionContext.class,0);
		}
		public JavascriptArgumentListItemContext(Javascript_argumentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJavascriptArgumentListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJavascriptArgumentListItem(this);
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
		int _startState = 372;
		enterRecursionRule(_localctx, 372, RULE_javascript_arguments, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavascriptArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2335);
			((JavascriptArgumentListContext)_localctx).item = javascript_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2342);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavascriptArgumentListItemContext(new Javascript_argumentsContext(_parentctx, _parentState));
					((JavascriptArgumentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_javascript_arguments);
					setState(2337);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2338);
					match(COMMA);
					setState(2339);
					((JavascriptArgumentListItemContext)_localctx).item = javascript_expression(0);
					}
					} 
				}
				setState(2344);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Javascript_item_expressionContext extends ParserRuleContext {
		public Javascript_expressionContext exp;
		public TerminalNode LBRAK() { return getToken(MParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(MParser.RBRAK, 0); }
		public Javascript_expressionContext javascript_expression() {
			return getRuleContext(Javascript_expressionContext.class,0);
		}
		public Javascript_item_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javascript_item_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJavascript_item_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJavascript_item_expression(this);
		}
	}

	public final Javascript_item_expressionContext javascript_item_expression() throws RecognitionException {
		Javascript_item_expressionContext _localctx = new Javascript_item_expressionContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_javascript_item_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2345);
			match(LBRAK);
			setState(2346);
			((Javascript_item_expressionContext)_localctx).exp = javascript_expression(0);
			setState(2347);
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
		public TerminalNode LPAR() { return getToken(MParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(MParser.RPAR, 0); }
		public Javascript_expressionContext javascript_expression() {
			return getRuleContext(Javascript_expressionContext.class,0);
		}
		public Javascript_parenthesis_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javascript_parenthesis_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJavascript_parenthesis_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJavascript_parenthesis_expression(this);
		}
	}

	public final Javascript_parenthesis_expressionContext javascript_parenthesis_expression() throws RecognitionException {
		Javascript_parenthesis_expressionContext _localctx = new Javascript_parenthesis_expressionContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_javascript_parenthesis_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2349);
			match(LPAR);
			setState(2350);
			((Javascript_parenthesis_expressionContext)_localctx).exp = javascript_expression(0);
			setState(2351);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJavascript_identifier_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJavascript_identifier_expression(this);
		}
	}

	public final Javascript_identifier_expressionContext javascript_identifier_expression() throws RecognitionException {
		Javascript_identifier_expressionContext _localctx = new Javascript_identifier_expressionContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_javascript_identifier_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2353);
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
		public TerminalNode INTEGER_LITERAL() { return getToken(MParser.INTEGER_LITERAL, 0); }
		public JavascriptIntegerLiteralContext(Javascript_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJavascriptIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJavascriptIntegerLiteral(this);
		}
	}
	public static class JavascriptBooleanLiteralContext extends Javascript_literal_expressionContext {
		public Token t;
		public TerminalNode BOOLEAN_LITERAL() { return getToken(MParser.BOOLEAN_LITERAL, 0); }
		public JavascriptBooleanLiteralContext(Javascript_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJavascriptBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJavascriptBooleanLiteral(this);
		}
	}
	public static class JavascriptCharacterLiteralContext extends Javascript_literal_expressionContext {
		public Token t;
		public TerminalNode CHAR_LITERAL() { return getToken(MParser.CHAR_LITERAL, 0); }
		public JavascriptCharacterLiteralContext(Javascript_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJavascriptCharacterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJavascriptCharacterLiteral(this);
		}
	}
	public static class JavascriptTextLiteralContext extends Javascript_literal_expressionContext {
		public Token t;
		public TerminalNode TEXT_LITERAL() { return getToken(MParser.TEXT_LITERAL, 0); }
		public JavascriptTextLiteralContext(Javascript_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJavascriptTextLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJavascriptTextLiteral(this);
		}
	}
	public static class JavascriptDecimalLiteralContext extends Javascript_literal_expressionContext {
		public Token t;
		public TerminalNode DECIMAL_LITERAL() { return getToken(MParser.DECIMAL_LITERAL, 0); }
		public JavascriptDecimalLiteralContext(Javascript_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJavascriptDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJavascriptDecimalLiteral(this);
		}
	}

	public final Javascript_literal_expressionContext javascript_literal_expression() throws RecognitionException {
		Javascript_literal_expressionContext _localctx = new Javascript_literal_expressionContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_javascript_literal_expression);
		try {
			setState(2360);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				_localctx = new JavascriptIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2355);
				((JavascriptIntegerLiteralContext)_localctx).t = match(INTEGER_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				_localctx = new JavascriptDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2356);
				((JavascriptDecimalLiteralContext)_localctx).t = match(DECIMAL_LITERAL);
				}
				break;
			case TEXT_LITERAL:
				_localctx = new JavascriptTextLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2357);
				((JavascriptTextLiteralContext)_localctx).t = match(TEXT_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new JavascriptBooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2358);
				((JavascriptBooleanLiteralContext)_localctx).t = match(BOOLEAN_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new JavascriptCharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2359);
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
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(MParser.VARIABLE_IDENTIFIER, 0); }
		public TerminalNode SYMBOL_IDENTIFIER() { return getToken(MParser.SYMBOL_IDENTIFIER, 0); }
		public TerminalNode DOLLAR_IDENTIFIER() { return getToken(MParser.DOLLAR_IDENTIFIER, 0); }
		public TerminalNode TYPE_IDENTIFIER() { return getToken(MParser.TYPE_IDENTIFIER, 0); }
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public Javascript_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javascript_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJavascript_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJavascript_identifier(this);
		}
	}

	public final Javascript_identifierContext javascript_identifier() throws RecognitionException {
		Javascript_identifierContext _localctx = new Javascript_identifierContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_javascript_identifier);
		try {
			setState(2367);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2362);
				match(VARIABLE_IDENTIFIER);
				}
				break;
			case SYMBOL_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2363);
				match(SYMBOL_IDENTIFIER);
				}
				break;
			case DOLLAR_IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(2364);
				match(DOLLAR_IDENTIFIER);
				}
				break;
			case TYPE_IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(2365);
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
				setState(2366);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterPythonStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitPythonStatement(this);
		}
	}
	public static class PythonReturnStatementContext extends Python_statementContext {
		public Python_expressionContext exp;
		public TerminalNode RETURN() { return getToken(MParser.RETURN, 0); }
		public Python_expressionContext python_expression() {
			return getRuleContext(Python_expressionContext.class,0);
		}
		public PythonReturnStatementContext(Python_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterPythonReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitPythonReturnStatement(this);
		}
	}

	public final Python_statementContext python_statement() throws RecognitionException {
		Python_statementContext _localctx = new Python_statementContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_python_statement);
		try {
			setState(2372);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
			case 1:
				_localctx = new PythonReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2369);
				match(RETURN);
				setState(2370);
				((PythonReturnStatementContext)_localctx).exp = python_expression(0);
				}
				break;
			case 2:
				_localctx = new PythonStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2371);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterPythonSelectorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitPythonSelectorExpression(this);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterPythonPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitPythonPrimaryExpression(this);
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
		int _startState = 386;
		enterRecursionRule(_localctx, 386, RULE_python_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PythonPrimaryExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2375);
			((PythonPrimaryExpressionContext)_localctx).exp = python_primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(2381);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PythonSelectorExpressionContext(new Python_expressionContext(_parentctx, _parentState));
					((PythonSelectorExpressionContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_python_expression);
					setState(2377);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2378);
					((PythonSelectorExpressionContext)_localctx).child = python_selector_expression();
					}
					} 
				}
				setState(2383);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterPythonParenthesisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitPythonParenthesisExpression(this);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterPythonIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitPythonIdentifierExpression(this);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterPythonSelfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitPythonSelfExpression(this);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterPythonLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitPythonLiteralExpression(this);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterPythonGlobalMethodExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitPythonGlobalMethodExpression(this);
		}
	}

	public final Python_primary_expressionContext python_primary_expression() throws RecognitionException {
		Python_primary_expressionContext _localctx = new Python_primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_python_primary_expression);
		try {
			setState(2389);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				_localctx = new PythonSelfExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2384);
				((PythonSelfExpressionContext)_localctx).exp = python_self_expression();
				}
				break;
			case 2:
				_localctx = new PythonParenthesisExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2385);
				((PythonParenthesisExpressionContext)_localctx).exp = python_parenthesis_expression();
				}
				break;
			case 3:
				_localctx = new PythonIdentifierExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2386);
				((PythonIdentifierExpressionContext)_localctx).exp = python_identifier_expression(0);
				}
				break;
			case 4:
				_localctx = new PythonLiteralExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2387);
				((PythonLiteralExpressionContext)_localctx).exp = python_literal_expression();
				}
				break;
			case 5:
				_localctx = new PythonGlobalMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2388);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterPython_self_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitPython_self_expression(this);
		}
	}

	public final Python_self_expressionContext python_self_expression() throws RecognitionException {
		Python_self_expressionContext _localctx = new Python_self_expressionContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_python_self_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2391);
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
		public TerminalNode DOT() { return getToken(MParser.DOT, 0); }
		public Python_method_expressionContext python_method_expression() {
			return getRuleContext(Python_method_expressionContext.class,0);
		}
		public PythonMethodExpressionContext(Python_selector_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterPythonMethodExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitPythonMethodExpression(this);
		}
	}
	public static class PythonItemExpressionContext extends Python_selector_expressionContext {
		public Python_expressionContext exp;
		public TerminalNode LBRAK() { return getToken(MParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(MParser.RBRAK, 0); }
		public Python_expressionContext python_expression() {
			return getRuleContext(Python_expressionContext.class,0);
		}
		public PythonItemExpressionContext(Python_selector_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterPythonItemExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitPythonItemExpression(this);
		}
	}

	public final Python_selector_expressionContext python_selector_expression() throws RecognitionException {
		Python_selector_expressionContext _localctx = new Python_selector_expressionContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_python_selector_expression);
		try {
			setState(2399);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				_localctx = new PythonMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2393);
				match(DOT);
				setState(2394);
				((PythonMethodExpressionContext)_localctx).exp = python_method_expression();
				}
				break;
			case LBRAK:
				_localctx = new PythonItemExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2395);
				match(LBRAK);
				setState(2396);
				((PythonItemExpressionContext)_localctx).exp = python_expression(0);
				setState(2397);
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
		public TerminalNode LPAR() { return getToken(MParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(MParser.RPAR, 0); }
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterPython_method_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitPython_method_expression(this);
		}
	}

	public final Python_method_expressionContext python_method_expression() throws RecognitionException {
		Python_method_expressionContext _localctx = new Python_method_expressionContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_python_method_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2401);
			((Python_method_expressionContext)_localctx).name = python_identifier();
			setState(2402);
			match(LPAR);
			setState(2404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA) | (1L << CSHARP) | (1L << PYTHON2) | (1L << PYTHON3) | (1L << JAVASCRIPT) | (1L << SWIFT) | (1L << LPAR) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (CODE - 65)) | (1L << (DOCUMENT - 65)) | (1L << (BLOB - 65)) | (1L << (IMAGE - 65)) | (1L << (UUID - 65)) | (1L << (ITERATOR - 65)) | (1L << (CURSOR - 65)) | (1L << (HTML - 65)) | (1L << (ABSTRACT - 65)) | (1L << (ALL - 65)) | (1L << (ALWAYS - 65)) | (1L << (AND - 65)) | (1L << (ANY - 65)) | (1L << (AS - 65)) | (1L << (ASC - 65)) | (1L << (ATTR - 65)) | (1L << (ATTRIBUTE - 65)) | (1L << (ATTRIBUTES - 65)) | (1L << (BINDINGS - 65)) | (1L << (BREAK - 65)) | (1L << (BY - 65)) | (1L << (CASE - 65)) | (1L << (CATCH - 65)) | (1L << (CATEGORY - 65)) | (1L << (CLASS - 65)) | (1L << (CONTAINS - 65)) | (1L << (DEF - 65)) | (1L << (DEFAULT - 65)) | (1L << (DEFINE - 65)) | (1L << (DELETE - 65)) | (1L << (DESC - 65)) | (1L << (DO - 65)) | (1L << (DOING - 65)) | (1L << (EACH - 65)) | (1L << (ELSE - 65)) | (1L << (ENUM - 65)) | (1L << (ENUMERATED - 65)) | (1L << (EXCEPT - 65)) | (1L << (EXECUTE - 65)) | (1L << (EXPECTING - 65)) | (1L << (EXTENDS - 65)) | (1L << (FETCH - 65)) | (1L << (FILTERED - 65)) | (1L << (FINALLY - 65)) | (1L << (FLUSH - 65)) | (1L << (FOR - 65)) | (1L << (FROM - 65)) | (1L << (GETTER - 65)) | (1L << (HAS - 65)) | (1L << (IF - 65)) | (1L << (IN - 65)) | (1L << (INDEX - 65)) | (1L << (IS - 65)) | (1L << (MATCHING - 65)) | (1L << (METHOD - 65)) | (1L << (METHODS - 65)) | (1L << (MODULO - 65)) | (1L << (MUTABLE - 65)) | (1L << (NATIVE - 65)) | (1L << (NONE - 65)) | (1L << (NOT - 65)) | (1L << (NOTHING - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (NULL - 129)) | (1L << (ON - 129)) | (1L << (ONE - 129)) | (1L << (OPERATOR - 129)) | (1L << (OR - 129)) | (1L << (ORDER - 129)) | (1L << (OTHERWISE - 129)) | (1L << (PASS - 129)) | (1L << (RAISE - 129)) | (1L << (READ - 129)) | (1L << (RECEIVING - 129)) | (1L << (RESOURCE - 129)) | (1L << (RETURN - 129)) | (1L << (RETURNING - 129)) | (1L << (ROWS - 129)) | (1L << (SELF - 129)) | (1L << (SETTER - 129)) | (1L << (SINGLETON - 129)) | (1L << (SORTED - 129)) | (1L << (STORABLE - 129)) | (1L << (STORE - 129)) | (1L << (SUPER - 129)) | (1L << (SWITCH - 129)) | (1L << (TEST - 129)) | (1L << (THIS - 129)) | (1L << (THROW - 129)) | (1L << (TO - 129)) | (1L << (TRY - 129)) | (1L << (VERIFYING - 129)) | (1L << (WIDGET - 129)) | (1L << (WITH - 129)) | (1L << (WHEN - 129)) | (1L << (WHERE - 129)) | (1L << (WHILE - 129)) | (1L << (WRITE - 129)) | (1L << (BOOLEAN_LITERAL - 129)) | (1L << (CHAR_LITERAL - 129)) | (1L << (SYMBOL_IDENTIFIER - 129)) | (1L << (TYPE_IDENTIFIER - 129)) | (1L << (VARIABLE_IDENTIFIER - 129)) | (1L << (DOLLAR_IDENTIFIER - 129)) | (1L << (TEXT_LITERAL - 129)) | (1L << (INTEGER_LITERAL - 129)) | (1L << (DECIMAL_LITERAL - 129)))) != 0)) {
				{
				setState(2403);
				((Python_method_expressionContext)_localctx).args = python_argument_list();
				}
			}

			setState(2406);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterPythonOrdinalOnlyArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitPythonOrdinalOnlyArgumentList(this);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterPythonNamedOnlyArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitPythonNamedOnlyArgumentList(this);
		}
	}
	public static class PythonArgumentListContext extends Python_argument_listContext {
		public Python_ordinal_argument_listContext ordinal;
		public Python_named_argument_listContext named;
		public TerminalNode COMMA() { return getToken(MParser.COMMA, 0); }
		public Python_ordinal_argument_listContext python_ordinal_argument_list() {
			return getRuleContext(Python_ordinal_argument_listContext.class,0);
		}
		public Python_named_argument_listContext python_named_argument_list() {
			return getRuleContext(Python_named_argument_listContext.class,0);
		}
		public PythonArgumentListContext(Python_argument_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterPythonArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitPythonArgumentList(this);
		}
	}

	public final Python_argument_listContext python_argument_list() throws RecognitionException {
		Python_argument_listContext _localctx = new Python_argument_listContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_python_argument_list);
		try {
			setState(2414);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				_localctx = new PythonOrdinalOnlyArgumentListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2408);
				((PythonOrdinalOnlyArgumentListContext)_localctx).ordinal = python_ordinal_argument_list(0);
				}
				break;
			case 2:
				_localctx = new PythonNamedOnlyArgumentListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2409);
				((PythonNamedOnlyArgumentListContext)_localctx).named = python_named_argument_list(0);
				}
				break;
			case 3:
				_localctx = new PythonArgumentListContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2410);
				((PythonArgumentListContext)_localctx).ordinal = python_ordinal_argument_list(0);
				setState(2411);
				match(COMMA);
				setState(2412);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterPythonOrdinalArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitPythonOrdinalArgumentList(this);
		}
	}
	public static class PythonOrdinalArgumentListItemContext extends Python_ordinal_argument_listContext {
		public Python_ordinal_argument_listContext items;
		public Python_expressionContext item;
		public TerminalNode COMMA() { return getToken(MParser.COMMA, 0); }
		public Python_ordinal_argument_listContext python_ordinal_argument_list() {
			return getRuleContext(Python_ordinal_argument_listContext.class,0);
		}
		public Python_expressionContext python_expression() {
			return getRuleContext(Python_expressionContext.class,0);
		}
		public PythonOrdinalArgumentListItemContext(Python_ordinal_argument_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterPythonOrdinalArgumentListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitPythonOrdinalArgumentListItem(this);
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
		int _startState = 398;
		enterRecursionRule(_localctx, 398, RULE_python_ordinal_argument_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PythonOrdinalArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2417);
			((PythonOrdinalArgumentListContext)_localctx).item = python_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2424);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PythonOrdinalArgumentListItemContext(new Python_ordinal_argument_listContext(_parentctx, _parentState));
					((PythonOrdinalArgumentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_python_ordinal_argument_list);
					setState(2419);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2420);
					match(COMMA);
					setState(2421);
					((PythonOrdinalArgumentListItemContext)_localctx).item = python_expression(0);
					}
					} 
				}
				setState(2426);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
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
		public TerminalNode EQ() { return getToken(MParser.EQ, 0); }
		public Python_identifierContext python_identifier() {
			return getRuleContext(Python_identifierContext.class,0);
		}
		public Python_expressionContext python_expression() {
			return getRuleContext(Python_expressionContext.class,0);
		}
		public PythonNamedArgumentListContext(Python_named_argument_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterPythonNamedArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitPythonNamedArgumentList(this);
		}
	}
	public static class PythonNamedArgumentListItemContext extends Python_named_argument_listContext {
		public Python_named_argument_listContext items;
		public Python_identifierContext name;
		public Python_expressionContext exp;
		public TerminalNode COMMA() { return getToken(MParser.COMMA, 0); }
		public TerminalNode EQ() { return getToken(MParser.EQ, 0); }
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterPythonNamedArgumentListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitPythonNamedArgumentListItem(this);
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
		int _startState = 400;
		enterRecursionRule(_localctx, 400, RULE_python_named_argument_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PythonNamedArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2428);
			((PythonNamedArgumentListContext)_localctx).name = python_identifier();
			setState(2429);
			match(EQ);
			setState(2430);
			((PythonNamedArgumentListContext)_localctx).exp = python_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2440);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,205,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PythonNamedArgumentListItemContext(new Python_named_argument_listContext(_parentctx, _parentState));
					((PythonNamedArgumentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_python_named_argument_list);
					setState(2432);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2433);
					match(COMMA);
					setState(2434);
					((PythonNamedArgumentListItemContext)_localctx).name = python_identifier();
					setState(2435);
					match(EQ);
					setState(2436);
					((PythonNamedArgumentListItemContext)_localctx).exp = python_expression(0);
					}
					} 
				}
				setState(2442);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,205,_ctx);
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
		public TerminalNode LPAR() { return getToken(MParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(MParser.RPAR, 0); }
		public Python_expressionContext python_expression() {
			return getRuleContext(Python_expressionContext.class,0);
		}
		public Python_parenthesis_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_python_parenthesis_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterPython_parenthesis_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitPython_parenthesis_expression(this);
		}
	}

	public final Python_parenthesis_expressionContext python_parenthesis_expression() throws RecognitionException {
		Python_parenthesis_expressionContext _localctx = new Python_parenthesis_expressionContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_python_parenthesis_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2443);
			match(LPAR);
			setState(2444);
			((Python_parenthesis_expressionContext)_localctx).exp = python_expression(0);
			setState(2445);
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
		public TerminalNode DOT() { return getToken(MParser.DOT, 0); }
		public Python_identifier_expressionContext python_identifier_expression() {
			return getRuleContext(Python_identifier_expressionContext.class,0);
		}
		public Python_identifierContext python_identifier() {
			return getRuleContext(Python_identifierContext.class,0);
		}
		public PythonChildIdentifierContext(Python_identifier_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterPythonChildIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitPythonChildIdentifier(this);
		}
	}
	public static class PythonPromptoIdentifierContext extends Python_identifier_expressionContext {
		public TerminalNode DOLLAR_IDENTIFIER() { return getToken(MParser.DOLLAR_IDENTIFIER, 0); }
		public PythonPromptoIdentifierContext(Python_identifier_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterPythonPromptoIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitPythonPromptoIdentifier(this);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterPythonIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitPythonIdentifier(this);
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
		int _startState = 404;
		enterRecursionRule(_localctx, 404, RULE_python_identifier_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2450);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
			case 1:
				{
				_localctx = new PythonPromptoIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2448);
				match(DOLLAR_IDENTIFIER);
				}
				break;
			case 2:
				{
				_localctx = new PythonIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2449);
				((PythonIdentifierContext)_localctx).name = python_identifier();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2457);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PythonChildIdentifierContext(new Python_identifier_expressionContext(_parentctx, _parentState));
					((PythonChildIdentifierContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_python_identifier_expression);
					setState(2452);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2453);
					match(DOT);
					setState(2454);
					((PythonChildIdentifierContext)_localctx).name = python_identifier();
					}
					} 
				}
				setState(2459);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
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
		public TerminalNode INTEGER_LITERAL() { return getToken(MParser.INTEGER_LITERAL, 0); }
		public PythonIntegerLiteralContext(Python_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterPythonIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitPythonIntegerLiteral(this);
		}
	}
	public static class PythonBooleanLiteralContext extends Python_literal_expressionContext {
		public Token t;
		public TerminalNode BOOLEAN_LITERAL() { return getToken(MParser.BOOLEAN_LITERAL, 0); }
		public PythonBooleanLiteralContext(Python_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterPythonBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitPythonBooleanLiteral(this);
		}
	}
	public static class PythonCharacterLiteralContext extends Python_literal_expressionContext {
		public Token t;
		public TerminalNode CHAR_LITERAL() { return getToken(MParser.CHAR_LITERAL, 0); }
		public PythonCharacterLiteralContext(Python_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterPythonCharacterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitPythonCharacterLiteral(this);
		}
	}
	public static class PythonTextLiteralContext extends Python_literal_expressionContext {
		public Token t;
		public TerminalNode TEXT_LITERAL() { return getToken(MParser.TEXT_LITERAL, 0); }
		public PythonTextLiteralContext(Python_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterPythonTextLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitPythonTextLiteral(this);
		}
	}
	public static class PythonDecimalLiteralContext extends Python_literal_expressionContext {
		public Token t;
		public TerminalNode DECIMAL_LITERAL() { return getToken(MParser.DECIMAL_LITERAL, 0); }
		public PythonDecimalLiteralContext(Python_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterPythonDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitPythonDecimalLiteral(this);
		}
	}

	public final Python_literal_expressionContext python_literal_expression() throws RecognitionException {
		Python_literal_expressionContext _localctx = new Python_literal_expressionContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_python_literal_expression);
		try {
			setState(2465);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				_localctx = new PythonIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2460);
				((PythonIntegerLiteralContext)_localctx).t = match(INTEGER_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				_localctx = new PythonDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2461);
				((PythonDecimalLiteralContext)_localctx).t = match(DECIMAL_LITERAL);
				}
				break;
			case TEXT_LITERAL:
				_localctx = new PythonTextLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2462);
				((PythonTextLiteralContext)_localctx).t = match(TEXT_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new PythonBooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2463);
				((PythonBooleanLiteralContext)_localctx).t = match(BOOLEAN_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new PythonCharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2464);
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
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(MParser.VARIABLE_IDENTIFIER, 0); }
		public TerminalNode SYMBOL_IDENTIFIER() { return getToken(MParser.SYMBOL_IDENTIFIER, 0); }
		public TerminalNode DOLLAR_IDENTIFIER() { return getToken(MParser.DOLLAR_IDENTIFIER, 0); }
		public TerminalNode TYPE_IDENTIFIER() { return getToken(MParser.TYPE_IDENTIFIER, 0); }
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public Python_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_python_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterPython_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitPython_identifier(this);
		}
	}

	public final Python_identifierContext python_identifier() throws RecognitionException {
		Python_identifierContext _localctx = new Python_identifierContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_python_identifier);
		try {
			setState(2472);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2467);
				match(VARIABLE_IDENTIFIER);
				}
				break;
			case SYMBOL_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2468);
				match(SYMBOL_IDENTIFIER);
				}
				break;
			case DOLLAR_IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(2469);
				match(DOLLAR_IDENTIFIER);
				}
				break;
			case TYPE_IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(2470);
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
				setState(2471);
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
		public TerminalNode RETURN() { return getToken(MParser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(MParser.SEMI, 0); }
		public Java_expressionContext java_expression() {
			return getRuleContext(Java_expressionContext.class,0);
		}
		public JavaReturnStatementContext(Java_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJavaReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJavaReturnStatement(this);
		}
	}
	public static class JavaStatementContext extends Java_statementContext {
		public Java_expressionContext exp;
		public TerminalNode SEMI() { return getToken(MParser.SEMI, 0); }
		public Java_expressionContext java_expression() {
			return getRuleContext(Java_expressionContext.class,0);
		}
		public JavaStatementContext(Java_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJavaStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJavaStatement(this);
		}
	}

	public final Java_statementContext java_statement() throws RecognitionException {
		Java_statementContext _localctx = new Java_statementContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_java_statement);
		try {
			setState(2481);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				_localctx = new JavaReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2474);
				match(RETURN);
				setState(2475);
				((JavaReturnStatementContext)_localctx).exp = java_expression(0);
				setState(2476);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new JavaStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2478);
				((JavaStatementContext)_localctx).exp = java_expression(0);
				setState(2479);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJavaSelectorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJavaSelectorExpression(this);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJavaPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJavaPrimaryExpression(this);
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
		int _startState = 412;
		enterRecursionRule(_localctx, 412, RULE_java_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavaPrimaryExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2484);
			((JavaPrimaryExpressionContext)_localctx).exp = java_primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(2490);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,211,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavaSelectorExpressionContext(new Java_expressionContext(_parentctx, _parentState));
					((JavaSelectorExpressionContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_java_expression);
					setState(2486);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2487);
					((JavaSelectorExpressionContext)_localctx).child = java_selector_expression();
					}
					} 
				}
				setState(2492);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJava_primary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJava_primary_expression(this);
		}
	}

	public final Java_primary_expressionContext java_primary_expression() throws RecognitionException {
		Java_primary_expressionContext _localctx = new Java_primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_java_primary_expression);
		try {
			setState(2498);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2493);
				java_this_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2494);
				java_new_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2495);
				java_parenthesis_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2496);
				java_identifier_expression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2497);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJava_this_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJava_this_expression(this);
		}
	}

	public final Java_this_expressionContext java_this_expression() throws RecognitionException {
		Java_this_expressionContext _localctx = new Java_this_expressionContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_java_this_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2500);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJava_new_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJava_new_expression(this);
		}
	}

	public final Java_new_expressionContext java_new_expression() throws RecognitionException {
		Java_new_expressionContext _localctx = new Java_new_expressionContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_java_new_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2502);
			new_token();
			setState(2503);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJavaItemExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJavaItemExpression(this);
		}
	}
	public static class JavaMethodExpressionContext extends Java_selector_expressionContext {
		public Java_method_expressionContext exp;
		public TerminalNode DOT() { return getToken(MParser.DOT, 0); }
		public Java_method_expressionContext java_method_expression() {
			return getRuleContext(Java_method_expressionContext.class,0);
		}
		public JavaMethodExpressionContext(Java_selector_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJavaMethodExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJavaMethodExpression(this);
		}
	}

	public final Java_selector_expressionContext java_selector_expression() throws RecognitionException {
		Java_selector_expressionContext _localctx = new Java_selector_expressionContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_java_selector_expression);
		try {
			setState(2508);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				_localctx = new JavaMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2505);
				match(DOT);
				setState(2506);
				((JavaMethodExpressionContext)_localctx).exp = java_method_expression();
				}
				break;
			case LBRAK:
				_localctx = new JavaItemExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2507);
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
		public TerminalNode LPAR() { return getToken(MParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(MParser.RPAR, 0); }
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJava_method_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJava_method_expression(this);
		}
	}

	public final Java_method_expressionContext java_method_expression() throws RecognitionException {
		Java_method_expressionContext _localctx = new Java_method_expressionContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_java_method_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2510);
			((Java_method_expressionContext)_localctx).name = java_identifier();
			setState(2511);
			match(LPAR);
			setState(2513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA) | (1L << CSHARP) | (1L << PYTHON2) | (1L << PYTHON3) | (1L << JAVASCRIPT) | (1L << SWIFT) | (1L << LPAR) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (CODE - 65)) | (1L << (DOCUMENT - 65)) | (1L << (BLOB - 65)) | (1L << (IMAGE - 65)) | (1L << (UUID - 65)) | (1L << (ITERATOR - 65)) | (1L << (CURSOR - 65)) | (1L << (HTML - 65)) | (1L << (ABSTRACT - 65)) | (1L << (ALL - 65)) | (1L << (ALWAYS - 65)) | (1L << (AND - 65)) | (1L << (ANY - 65)) | (1L << (AS - 65)) | (1L << (ASC - 65)) | (1L << (ATTR - 65)) | (1L << (ATTRIBUTE - 65)) | (1L << (ATTRIBUTES - 65)) | (1L << (BINDINGS - 65)) | (1L << (BREAK - 65)) | (1L << (BY - 65)) | (1L << (CASE - 65)) | (1L << (CATCH - 65)) | (1L << (CATEGORY - 65)) | (1L << (CLASS - 65)) | (1L << (CONTAINS - 65)) | (1L << (DEF - 65)) | (1L << (DEFAULT - 65)) | (1L << (DEFINE - 65)) | (1L << (DELETE - 65)) | (1L << (DESC - 65)) | (1L << (DO - 65)) | (1L << (DOING - 65)) | (1L << (EACH - 65)) | (1L << (ELSE - 65)) | (1L << (ENUM - 65)) | (1L << (ENUMERATED - 65)) | (1L << (EXCEPT - 65)) | (1L << (EXECUTE - 65)) | (1L << (EXPECTING - 65)) | (1L << (EXTENDS - 65)) | (1L << (FETCH - 65)) | (1L << (FILTERED - 65)) | (1L << (FINALLY - 65)) | (1L << (FLUSH - 65)) | (1L << (FOR - 65)) | (1L << (FROM - 65)) | (1L << (GETTER - 65)) | (1L << (HAS - 65)) | (1L << (IF - 65)) | (1L << (IN - 65)) | (1L << (INDEX - 65)) | (1L << (IS - 65)) | (1L << (MATCHING - 65)) | (1L << (METHOD - 65)) | (1L << (METHODS - 65)) | (1L << (MODULO - 65)) | (1L << (MUTABLE - 65)) | (1L << (NATIVE - 65)) | (1L << (NONE - 65)) | (1L << (NOT - 65)) | (1L << (NOTHING - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (NULL - 129)) | (1L << (ON - 129)) | (1L << (ONE - 129)) | (1L << (OPERATOR - 129)) | (1L << (OR - 129)) | (1L << (ORDER - 129)) | (1L << (OTHERWISE - 129)) | (1L << (PASS - 129)) | (1L << (RAISE - 129)) | (1L << (READ - 129)) | (1L << (RECEIVING - 129)) | (1L << (RESOURCE - 129)) | (1L << (RETURN - 129)) | (1L << (RETURNING - 129)) | (1L << (ROWS - 129)) | (1L << (SELF - 129)) | (1L << (SETTER - 129)) | (1L << (SINGLETON - 129)) | (1L << (SORTED - 129)) | (1L << (STORABLE - 129)) | (1L << (STORE - 129)) | (1L << (SUPER - 129)) | (1L << (SWITCH - 129)) | (1L << (TEST - 129)) | (1L << (THIS - 129)) | (1L << (THROW - 129)) | (1L << (TO - 129)) | (1L << (TRY - 129)) | (1L << (VERIFYING - 129)) | (1L << (WIDGET - 129)) | (1L << (WITH - 129)) | (1L << (WHEN - 129)) | (1L << (WHERE - 129)) | (1L << (WHILE - 129)) | (1L << (WRITE - 129)) | (1L << (BOOLEAN_LITERAL - 129)) | (1L << (CHAR_LITERAL - 129)) | (1L << (SYMBOL_IDENTIFIER - 129)) | (1L << (TYPE_IDENTIFIER - 129)) | (1L << (VARIABLE_IDENTIFIER - 129)) | (1L << (DOLLAR_IDENTIFIER - 129)) | (1L << (TEXT_LITERAL - 129)) | (1L << (INTEGER_LITERAL - 129)) | (1L << (DECIMAL_LITERAL - 129)))) != 0)) {
				{
				setState(2512);
				((Java_method_expressionContext)_localctx).args = java_arguments(0);
				}
			}

			setState(2515);
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
		public TerminalNode COMMA() { return getToken(MParser.COMMA, 0); }
		public Java_argumentsContext java_arguments() {
			return getRuleContext(Java_argumentsContext.class,0);
		}
		public Java_expressionContext java_expression() {
			return getRuleContext(Java_expressionContext.class,0);
		}
		public JavaArgumentListItemContext(Java_argumentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJavaArgumentListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJavaArgumentListItem(this);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJavaArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJavaArgumentList(this);
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
		int _startState = 424;
		enterRecursionRule(_localctx, 424, RULE_java_arguments, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavaArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2518);
			((JavaArgumentListContext)_localctx).item = java_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2525);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,215,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavaArgumentListItemContext(new Java_argumentsContext(_parentctx, _parentState));
					((JavaArgumentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_java_arguments);
					setState(2520);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2521);
					match(COMMA);
					setState(2522);
					((JavaArgumentListItemContext)_localctx).item = java_expression(0);
					}
					} 
				}
				setState(2527);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,215,_ctx);
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
		public TerminalNode LBRAK() { return getToken(MParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(MParser.RBRAK, 0); }
		public Java_expressionContext java_expression() {
			return getRuleContext(Java_expressionContext.class,0);
		}
		public Java_item_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_item_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJava_item_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJava_item_expression(this);
		}
	}

	public final Java_item_expressionContext java_item_expression() throws RecognitionException {
		Java_item_expressionContext _localctx = new Java_item_expressionContext(_ctx, getState());
		enterRule(_localctx, 426, RULE_java_item_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2528);
			match(LBRAK);
			setState(2529);
			((Java_item_expressionContext)_localctx).exp = java_expression(0);
			setState(2530);
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
		public TerminalNode LPAR() { return getToken(MParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(MParser.RPAR, 0); }
		public Java_expressionContext java_expression() {
			return getRuleContext(Java_expressionContext.class,0);
		}
		public Java_parenthesis_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_parenthesis_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJava_parenthesis_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJava_parenthesis_expression(this);
		}
	}

	public final Java_parenthesis_expressionContext java_parenthesis_expression() throws RecognitionException {
		Java_parenthesis_expressionContext _localctx = new Java_parenthesis_expressionContext(_ctx, getState());
		enterRule(_localctx, 428, RULE_java_parenthesis_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2532);
			match(LPAR);
			setState(2533);
			((Java_parenthesis_expressionContext)_localctx).exp = java_expression(0);
			setState(2534);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJavaIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJavaIdentifier(this);
		}
	}
	public static class JavaChildIdentifierContext extends Java_identifier_expressionContext {
		public Java_identifier_expressionContext parent;
		public Java_identifierContext name;
		public TerminalNode DOT() { return getToken(MParser.DOT, 0); }
		public Java_identifier_expressionContext java_identifier_expression() {
			return getRuleContext(Java_identifier_expressionContext.class,0);
		}
		public Java_identifierContext java_identifier() {
			return getRuleContext(Java_identifierContext.class,0);
		}
		public JavaChildIdentifierContext(Java_identifier_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJavaChildIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJavaChildIdentifier(this);
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
		int _startState = 430;
		enterRecursionRule(_localctx, 430, RULE_java_identifier_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavaIdentifierContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2537);
			((JavaIdentifierContext)_localctx).name = java_identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(2544);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,216,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavaChildIdentifierContext(new Java_identifier_expressionContext(_parentctx, _parentState));
					((JavaChildIdentifierContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_java_identifier_expression);
					setState(2539);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2540);
					match(DOT);
					setState(2541);
					((JavaChildIdentifierContext)_localctx).name = java_identifier();
					}
					} 
				}
				setState(2546);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJavaClassIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJavaClassIdentifier(this);
		}
	}
	public static class JavaChildClassIdentifierContext extends Java_class_identifier_expressionContext {
		public Java_class_identifier_expressionContext parent;
		public Token name;
		public Java_class_identifier_expressionContext java_class_identifier_expression() {
			return getRuleContext(Java_class_identifier_expressionContext.class,0);
		}
		public TerminalNode DOLLAR_IDENTIFIER() { return getToken(MParser.DOLLAR_IDENTIFIER, 0); }
		public JavaChildClassIdentifierContext(Java_class_identifier_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJavaChildClassIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJavaChildClassIdentifier(this);
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
		int _startState = 432;
		enterRecursionRule(_localctx, 432, RULE_java_class_identifier_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavaClassIdentifierContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2548);
			((JavaClassIdentifierContext)_localctx).klass = java_identifier_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2554);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,217,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavaChildClassIdentifierContext(new Java_class_identifier_expressionContext(_parentctx, _parentState));
					((JavaChildClassIdentifierContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_java_class_identifier_expression);
					setState(2550);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2551);
					((JavaChildClassIdentifierContext)_localctx).name = match(DOLLAR_IDENTIFIER);
					}
					} 
				}
				setState(2556);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,217,_ctx);
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
		public TerminalNode BOOLEAN_LITERAL() { return getToken(MParser.BOOLEAN_LITERAL, 0); }
		public JavaBooleanLiteralContext(Java_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJavaBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJavaBooleanLiteral(this);
		}
	}
	public static class JavaCharacterLiteralContext extends Java_literal_expressionContext {
		public Token t;
		public TerminalNode CHAR_LITERAL() { return getToken(MParser.CHAR_LITERAL, 0); }
		public JavaCharacterLiteralContext(Java_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJavaCharacterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJavaCharacterLiteral(this);
		}
	}
	public static class JavaIntegerLiteralContext extends Java_literal_expressionContext {
		public Token t;
		public TerminalNode INTEGER_LITERAL() { return getToken(MParser.INTEGER_LITERAL, 0); }
		public JavaIntegerLiteralContext(Java_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJavaIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJavaIntegerLiteral(this);
		}
	}
	public static class JavaTextLiteralContext extends Java_literal_expressionContext {
		public Token t;
		public TerminalNode TEXT_LITERAL() { return getToken(MParser.TEXT_LITERAL, 0); }
		public JavaTextLiteralContext(Java_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJavaTextLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJavaTextLiteral(this);
		}
	}
	public static class JavaDecimalLiteralContext extends Java_literal_expressionContext {
		public Token t;
		public TerminalNode DECIMAL_LITERAL() { return getToken(MParser.DECIMAL_LITERAL, 0); }
		public JavaDecimalLiteralContext(Java_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJavaDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJavaDecimalLiteral(this);
		}
	}

	public final Java_literal_expressionContext java_literal_expression() throws RecognitionException {
		Java_literal_expressionContext _localctx = new Java_literal_expressionContext(_ctx, getState());
		enterRule(_localctx, 434, RULE_java_literal_expression);
		try {
			setState(2562);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				_localctx = new JavaIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2557);
				((JavaIntegerLiteralContext)_localctx).t = match(INTEGER_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				_localctx = new JavaDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2558);
				((JavaDecimalLiteralContext)_localctx).t = match(DECIMAL_LITERAL);
				}
				break;
			case TEXT_LITERAL:
				_localctx = new JavaTextLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2559);
				((JavaTextLiteralContext)_localctx).t = match(TEXT_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new JavaBooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2560);
				((JavaBooleanLiteralContext)_localctx).t = match(BOOLEAN_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new JavaCharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2561);
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
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(MParser.VARIABLE_IDENTIFIER, 0); }
		public TerminalNode SYMBOL_IDENTIFIER() { return getToken(MParser.SYMBOL_IDENTIFIER, 0); }
		public TerminalNode DOLLAR_IDENTIFIER() { return getToken(MParser.DOLLAR_IDENTIFIER, 0); }
		public TerminalNode TYPE_IDENTIFIER() { return getToken(MParser.TYPE_IDENTIFIER, 0); }
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public Java_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJava_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJava_identifier(this);
		}
	}

	public final Java_identifierContext java_identifier() throws RecognitionException {
		Java_identifierContext _localctx = new Java_identifierContext(_ctx, getState());
		enterRule(_localctx, 436, RULE_java_identifier);
		try {
			setState(2569);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2564);
				match(VARIABLE_IDENTIFIER);
				}
				break;
			case SYMBOL_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2565);
				match(SYMBOL_IDENTIFIER);
				}
				break;
			case DOLLAR_IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(2566);
				match(DOLLAR_IDENTIFIER);
				}
				break;
			case TYPE_IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(2567);
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
				setState(2568);
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
		public TerminalNode RETURN() { return getToken(MParser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(MParser.SEMI, 0); }
		public Csharp_expressionContext csharp_expression() {
			return getRuleContext(Csharp_expressionContext.class,0);
		}
		public CSharpReturnStatementContext(Csharp_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterCSharpReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitCSharpReturnStatement(this);
		}
	}
	public static class CSharpStatementContext extends Csharp_statementContext {
		public Csharp_expressionContext exp;
		public TerminalNode SEMI() { return getToken(MParser.SEMI, 0); }
		public Csharp_expressionContext csharp_expression() {
			return getRuleContext(Csharp_expressionContext.class,0);
		}
		public CSharpStatementContext(Csharp_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterCSharpStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitCSharpStatement(this);
		}
	}

	public final Csharp_statementContext csharp_statement() throws RecognitionException {
		Csharp_statementContext _localctx = new Csharp_statementContext(_ctx, getState());
		enterRule(_localctx, 438, RULE_csharp_statement);
		try {
			setState(2578);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				_localctx = new CSharpReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2571);
				match(RETURN);
				setState(2572);
				((CSharpReturnStatementContext)_localctx).exp = csharp_expression(0);
				setState(2573);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new CSharpStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2575);
				((CSharpStatementContext)_localctx).exp = csharp_expression(0);
				setState(2576);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterCSharpSelectorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitCSharpSelectorExpression(this);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterCSharpPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitCSharpPrimaryExpression(this);
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
		int _startState = 440;
		enterRecursionRule(_localctx, 440, RULE_csharp_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new CSharpPrimaryExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2581);
			((CSharpPrimaryExpressionContext)_localctx).exp = csharp_primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(2587);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,221,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CSharpSelectorExpressionContext(new Csharp_expressionContext(_parentctx, _parentState));
					((CSharpSelectorExpressionContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_csharp_expression);
					setState(2583);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2584);
					((CSharpSelectorExpressionContext)_localctx).child = csharp_selector_expression();
					}
					} 
				}
				setState(2589);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterCsharp_primary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitCsharp_primary_expression(this);
		}
	}

	public final Csharp_primary_expressionContext csharp_primary_expression() throws RecognitionException {
		Csharp_primary_expressionContext _localctx = new Csharp_primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 442, RULE_csharp_primary_expression);
		try {
			setState(2595);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2590);
				csharp_this_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2591);
				csharp_new_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2592);
				csharp_parenthesis_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2593);
				csharp_identifier_expression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2594);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterCsharp_this_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitCsharp_this_expression(this);
		}
	}

	public final Csharp_this_expressionContext csharp_this_expression() throws RecognitionException {
		Csharp_this_expressionContext _localctx = new Csharp_this_expressionContext(_ctx, getState());
		enterRule(_localctx, 444, RULE_csharp_this_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2597);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterCsharp_new_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitCsharp_new_expression(this);
		}
	}

	public final Csharp_new_expressionContext csharp_new_expression() throws RecognitionException {
		Csharp_new_expressionContext _localctx = new Csharp_new_expressionContext(_ctx, getState());
		enterRule(_localctx, 446, RULE_csharp_new_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2599);
			new_token();
			setState(2600);
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
		public TerminalNode DOT() { return getToken(MParser.DOT, 0); }
		public Csharp_method_expressionContext csharp_method_expression() {
			return getRuleContext(Csharp_method_expressionContext.class,0);
		}
		public CSharpMethodExpressionContext(Csharp_selector_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterCSharpMethodExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitCSharpMethodExpression(this);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterCSharpItemExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitCSharpItemExpression(this);
		}
	}

	public final Csharp_selector_expressionContext csharp_selector_expression() throws RecognitionException {
		Csharp_selector_expressionContext _localctx = new Csharp_selector_expressionContext(_ctx, getState());
		enterRule(_localctx, 448, RULE_csharp_selector_expression);
		try {
			setState(2605);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				_localctx = new CSharpMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2602);
				match(DOT);
				setState(2603);
				((CSharpMethodExpressionContext)_localctx).exp = csharp_method_expression();
				}
				break;
			case LBRAK:
				_localctx = new CSharpItemExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2604);
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
		public TerminalNode LPAR() { return getToken(MParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(MParser.RPAR, 0); }
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterCsharp_method_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitCsharp_method_expression(this);
		}
	}

	public final Csharp_method_expressionContext csharp_method_expression() throws RecognitionException {
		Csharp_method_expressionContext _localctx = new Csharp_method_expressionContext(_ctx, getState());
		enterRule(_localctx, 450, RULE_csharp_method_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2607);
			((Csharp_method_expressionContext)_localctx).name = csharp_identifier();
			setState(2608);
			match(LPAR);
			setState(2610);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA) | (1L << CSHARP) | (1L << PYTHON2) | (1L << PYTHON3) | (1L << JAVASCRIPT) | (1L << SWIFT) | (1L << LPAR) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (CODE - 65)) | (1L << (DOCUMENT - 65)) | (1L << (BLOB - 65)) | (1L << (IMAGE - 65)) | (1L << (UUID - 65)) | (1L << (ITERATOR - 65)) | (1L << (CURSOR - 65)) | (1L << (HTML - 65)) | (1L << (ABSTRACT - 65)) | (1L << (ALL - 65)) | (1L << (ALWAYS - 65)) | (1L << (AND - 65)) | (1L << (ANY - 65)) | (1L << (AS - 65)) | (1L << (ASC - 65)) | (1L << (ATTR - 65)) | (1L << (ATTRIBUTE - 65)) | (1L << (ATTRIBUTES - 65)) | (1L << (BINDINGS - 65)) | (1L << (BREAK - 65)) | (1L << (BY - 65)) | (1L << (CASE - 65)) | (1L << (CATCH - 65)) | (1L << (CATEGORY - 65)) | (1L << (CLASS - 65)) | (1L << (CONTAINS - 65)) | (1L << (DEF - 65)) | (1L << (DEFAULT - 65)) | (1L << (DEFINE - 65)) | (1L << (DELETE - 65)) | (1L << (DESC - 65)) | (1L << (DO - 65)) | (1L << (DOING - 65)) | (1L << (EACH - 65)) | (1L << (ELSE - 65)) | (1L << (ENUM - 65)) | (1L << (ENUMERATED - 65)) | (1L << (EXCEPT - 65)) | (1L << (EXECUTE - 65)) | (1L << (EXPECTING - 65)) | (1L << (EXTENDS - 65)) | (1L << (FETCH - 65)) | (1L << (FILTERED - 65)) | (1L << (FINALLY - 65)) | (1L << (FLUSH - 65)) | (1L << (FOR - 65)) | (1L << (FROM - 65)) | (1L << (GETTER - 65)) | (1L << (HAS - 65)) | (1L << (IF - 65)) | (1L << (IN - 65)) | (1L << (INDEX - 65)) | (1L << (IS - 65)) | (1L << (MATCHING - 65)) | (1L << (METHOD - 65)) | (1L << (METHODS - 65)) | (1L << (MODULO - 65)) | (1L << (MUTABLE - 65)) | (1L << (NATIVE - 65)) | (1L << (NONE - 65)) | (1L << (NOT - 65)) | (1L << (NOTHING - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (NULL - 129)) | (1L << (ON - 129)) | (1L << (ONE - 129)) | (1L << (OPERATOR - 129)) | (1L << (OR - 129)) | (1L << (ORDER - 129)) | (1L << (OTHERWISE - 129)) | (1L << (PASS - 129)) | (1L << (RAISE - 129)) | (1L << (READ - 129)) | (1L << (RECEIVING - 129)) | (1L << (RESOURCE - 129)) | (1L << (RETURN - 129)) | (1L << (RETURNING - 129)) | (1L << (ROWS - 129)) | (1L << (SELF - 129)) | (1L << (SETTER - 129)) | (1L << (SINGLETON - 129)) | (1L << (SORTED - 129)) | (1L << (STORABLE - 129)) | (1L << (STORE - 129)) | (1L << (SUPER - 129)) | (1L << (SWITCH - 129)) | (1L << (TEST - 129)) | (1L << (THIS - 129)) | (1L << (THROW - 129)) | (1L << (TO - 129)) | (1L << (TRY - 129)) | (1L << (VERIFYING - 129)) | (1L << (WIDGET - 129)) | (1L << (WITH - 129)) | (1L << (WHEN - 129)) | (1L << (WHERE - 129)) | (1L << (WHILE - 129)) | (1L << (WRITE - 129)) | (1L << (BOOLEAN_LITERAL - 129)) | (1L << (CHAR_LITERAL - 129)) | (1L << (SYMBOL_IDENTIFIER - 129)) | (1L << (TYPE_IDENTIFIER - 129)) | (1L << (VARIABLE_IDENTIFIER - 129)) | (1L << (DOLLAR_IDENTIFIER - 129)) | (1L << (TEXT_LITERAL - 129)) | (1L << (INTEGER_LITERAL - 129)) | (1L << (DECIMAL_LITERAL - 129)))) != 0)) {
				{
				setState(2609);
				((Csharp_method_expressionContext)_localctx).args = csharp_arguments(0);
				}
			}

			setState(2612);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterCSharpArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitCSharpArgumentList(this);
		}
	}
	public static class CSharpArgumentListItemContext extends Csharp_argumentsContext {
		public Csharp_argumentsContext items;
		public Csharp_expressionContext item;
		public TerminalNode COMMA() { return getToken(MParser.COMMA, 0); }
		public Csharp_argumentsContext csharp_arguments() {
			return getRuleContext(Csharp_argumentsContext.class,0);
		}
		public Csharp_expressionContext csharp_expression() {
			return getRuleContext(Csharp_expressionContext.class,0);
		}
		public CSharpArgumentListItemContext(Csharp_argumentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterCSharpArgumentListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitCSharpArgumentListItem(this);
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
		int _startState = 452;
		enterRecursionRule(_localctx, 452, RULE_csharp_arguments, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new CSharpArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2615);
			((CSharpArgumentListContext)_localctx).item = csharp_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2622);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,225,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CSharpArgumentListItemContext(new Csharp_argumentsContext(_parentctx, _parentState));
					((CSharpArgumentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_csharp_arguments);
					setState(2617);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2618);
					match(COMMA);
					setState(2619);
					((CSharpArgumentListItemContext)_localctx).item = csharp_expression(0);
					}
					} 
				}
				setState(2624);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,225,_ctx);
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
		public TerminalNode LBRAK() { return getToken(MParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(MParser.RBRAK, 0); }
		public Csharp_expressionContext csharp_expression() {
			return getRuleContext(Csharp_expressionContext.class,0);
		}
		public Csharp_item_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csharp_item_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterCsharp_item_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitCsharp_item_expression(this);
		}
	}

	public final Csharp_item_expressionContext csharp_item_expression() throws RecognitionException {
		Csharp_item_expressionContext _localctx = new Csharp_item_expressionContext(_ctx, getState());
		enterRule(_localctx, 454, RULE_csharp_item_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2625);
			match(LBRAK);
			setState(2626);
			((Csharp_item_expressionContext)_localctx).exp = csharp_expression(0);
			setState(2627);
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
		public TerminalNode LPAR() { return getToken(MParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(MParser.RPAR, 0); }
		public Csharp_expressionContext csharp_expression() {
			return getRuleContext(Csharp_expressionContext.class,0);
		}
		public Csharp_parenthesis_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csharp_parenthesis_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterCsharp_parenthesis_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitCsharp_parenthesis_expression(this);
		}
	}

	public final Csharp_parenthesis_expressionContext csharp_parenthesis_expression() throws RecognitionException {
		Csharp_parenthesis_expressionContext _localctx = new Csharp_parenthesis_expressionContext(_ctx, getState());
		enterRule(_localctx, 456, RULE_csharp_parenthesis_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2629);
			match(LPAR);
			setState(2630);
			((Csharp_parenthesis_expressionContext)_localctx).exp = csharp_expression(0);
			setState(2631);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterCSharpIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitCSharpIdentifier(this);
		}
	}
	public static class CSharpChildIdentifierContext extends Csharp_identifier_expressionContext {
		public Csharp_identifier_expressionContext parent;
		public Csharp_identifierContext name;
		public TerminalNode DOT() { return getToken(MParser.DOT, 0); }
		public Csharp_identifier_expressionContext csharp_identifier_expression() {
			return getRuleContext(Csharp_identifier_expressionContext.class,0);
		}
		public Csharp_identifierContext csharp_identifier() {
			return getRuleContext(Csharp_identifierContext.class,0);
		}
		public CSharpChildIdentifierContext(Csharp_identifier_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterCSharpChildIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitCSharpChildIdentifier(this);
		}
	}
	public static class CSharpPromptoIdentifierContext extends Csharp_identifier_expressionContext {
		public TerminalNode DOLLAR_IDENTIFIER() { return getToken(MParser.DOLLAR_IDENTIFIER, 0); }
		public CSharpPromptoIdentifierContext(Csharp_identifier_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterCSharpPromptoIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitCSharpPromptoIdentifier(this);
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
		int _startState = 458;
		enterRecursionRule(_localctx, 458, RULE_csharp_identifier_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2636);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
			case 1:
				{
				_localctx = new CSharpPromptoIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2634);
				match(DOLLAR_IDENTIFIER);
				}
				break;
			case 2:
				{
				_localctx = new CSharpIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2635);
				((CSharpIdentifierContext)_localctx).name = csharp_identifier();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2643);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,227,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CSharpChildIdentifierContext(new Csharp_identifier_expressionContext(_parentctx, _parentState));
					((CSharpChildIdentifierContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_csharp_identifier_expression);
					setState(2638);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2639);
					match(DOT);
					setState(2640);
					((CSharpChildIdentifierContext)_localctx).name = csharp_identifier();
					}
					} 
				}
				setState(2645);
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
		public TerminalNode BOOLEAN_LITERAL() { return getToken(MParser.BOOLEAN_LITERAL, 0); }
		public CSharpBooleanLiteralContext(Csharp_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterCSharpBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitCSharpBooleanLiteral(this);
		}
	}
	public static class CSharpIntegerLiteralContext extends Csharp_literal_expressionContext {
		public TerminalNode INTEGER_LITERAL() { return getToken(MParser.INTEGER_LITERAL, 0); }
		public CSharpIntegerLiteralContext(Csharp_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterCSharpIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitCSharpIntegerLiteral(this);
		}
	}
	public static class CSharpDecimalLiteralContext extends Csharp_literal_expressionContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(MParser.DECIMAL_LITERAL, 0); }
		public CSharpDecimalLiteralContext(Csharp_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterCSharpDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitCSharpDecimalLiteral(this);
		}
	}
	public static class CSharpCharacterLiteralContext extends Csharp_literal_expressionContext {
		public TerminalNode CHAR_LITERAL() { return getToken(MParser.CHAR_LITERAL, 0); }
		public CSharpCharacterLiteralContext(Csharp_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterCSharpCharacterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitCSharpCharacterLiteral(this);
		}
	}
	public static class CSharpTextLiteralContext extends Csharp_literal_expressionContext {
		public TerminalNode TEXT_LITERAL() { return getToken(MParser.TEXT_LITERAL, 0); }
		public CSharpTextLiteralContext(Csharp_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterCSharpTextLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitCSharpTextLiteral(this);
		}
	}

	public final Csharp_literal_expressionContext csharp_literal_expression() throws RecognitionException {
		Csharp_literal_expressionContext _localctx = new Csharp_literal_expressionContext(_ctx, getState());
		enterRule(_localctx, 460, RULE_csharp_literal_expression);
		try {
			setState(2651);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				_localctx = new CSharpIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2646);
				match(INTEGER_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				_localctx = new CSharpDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2647);
				match(DECIMAL_LITERAL);
				}
				break;
			case TEXT_LITERAL:
				_localctx = new CSharpTextLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2648);
				match(TEXT_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new CSharpBooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2649);
				match(BOOLEAN_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new CSharpCharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2650);
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
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(MParser.VARIABLE_IDENTIFIER, 0); }
		public TerminalNode SYMBOL_IDENTIFIER() { return getToken(MParser.SYMBOL_IDENTIFIER, 0); }
		public TerminalNode DOLLAR_IDENTIFIER() { return getToken(MParser.DOLLAR_IDENTIFIER, 0); }
		public TerminalNode TYPE_IDENTIFIER() { return getToken(MParser.TYPE_IDENTIFIER, 0); }
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public Csharp_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csharp_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterCsharp_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitCsharp_identifier(this);
		}
	}

	public final Csharp_identifierContext csharp_identifier() throws RecognitionException {
		Csharp_identifierContext _localctx = new Csharp_identifierContext(_ctx, getState());
		enterRule(_localctx, 462, RULE_csharp_identifier);
		try {
			setState(2658);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2653);
				match(VARIABLE_IDENTIFIER);
				}
				break;
			case SYMBOL_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2654);
				match(SYMBOL_IDENTIFIER);
				}
				break;
			case DOLLAR_IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(2655);
				match(DOLLAR_IDENTIFIER);
				}
				break;
			case TYPE_IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(2656);
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
				setState(2657);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJsx_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJsx_expression(this);
		}
	}

	public final Jsx_expressionContext jsx_expression() throws RecognitionException {
		Jsx_expressionContext _localctx = new Jsx_expressionContext(_ctx, getState());
		enterRule(_localctx, 464, RULE_jsx_expression);
		try {
			setState(2662);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2660);
				jsx_element();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2661);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJsxSelfClosing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJsxSelfClosing(this);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJsxElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJsxElement(this);
		}
	}

	public final Jsx_elementContext jsx_element() throws RecognitionException {
		Jsx_elementContext _localctx = new Jsx_elementContext(_ctx, getState());
		enterRule(_localctx, 466, RULE_jsx_element);
		try {
			setState(2671);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
			case 1:
				_localctx = new JsxSelfClosingContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2664);
				((JsxSelfClosingContext)_localctx).jsx = jsx_self_closing();
				}
				break;
			case 2:
				_localctx = new JsxElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2665);
				((JsxElementContext)_localctx).opening = jsx_opening();
				setState(2667);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
				case 1:
					{
					setState(2666);
					((JsxElementContext)_localctx).children_ = jsx_children();
					}
					break;
				}
				setState(2669);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJsx_fragment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJsx_fragment(this);
		}
	}

	public final Jsx_fragmentContext jsx_fragment() throws RecognitionException {
		Jsx_fragmentContext _localctx = new Jsx_fragmentContext(_ctx, getState());
		enterRule(_localctx, 468, RULE_jsx_fragment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2673);
			jsx_fragment_start();
			setState(2674);
			ws_plus();
			setState(2676);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
			case 1:
				{
				setState(2675);
				((Jsx_fragmentContext)_localctx).children_ = jsx_children();
				}
				break;
			}
			setState(2678);
			ws_plus();
			setState(2679);
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
		public TerminalNode LT() { return getToken(MParser.LT, 0); }
		public TerminalNode GT() { return getToken(MParser.GT, 0); }
		public TerminalNode LTGT() { return getToken(MParser.LTGT, 0); }
		public Jsx_fragment_startContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsx_fragment_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJsx_fragment_start(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJsx_fragment_start(this);
		}
	}

	public final Jsx_fragment_startContext jsx_fragment_start() throws RecognitionException {
		Jsx_fragment_startContext _localctx = new Jsx_fragment_startContext(_ctx, getState());
		enterRule(_localctx, 470, RULE_jsx_fragment_start);
		try {
			setState(2684);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2681);
				match(LT);
				setState(2682);
				match(GT);
				}
				break;
			case LTGT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2683);
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
		public TerminalNode LT() { return getToken(MParser.LT, 0); }
		public TerminalNode SLASH() { return getToken(MParser.SLASH, 0); }
		public TerminalNode GT() { return getToken(MParser.GT, 0); }
		public Jsx_fragment_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsx_fragment_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJsx_fragment_end(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJsx_fragment_end(this);
		}
	}

	public final Jsx_fragment_endContext jsx_fragment_end() throws RecognitionException {
		Jsx_fragment_endContext _localctx = new Jsx_fragment_endContext(_ctx, getState());
		enterRule(_localctx, 472, RULE_jsx_fragment_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2686);
			match(LT);
			setState(2687);
			match(SLASH);
			setState(2688);
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
		public TerminalNode LT() { return getToken(MParser.LT, 0); }
		public Ws_plusContext ws_plus() {
			return getRuleContext(Ws_plusContext.class,0);
		}
		public TerminalNode SLASH() { return getToken(MParser.SLASH, 0); }
		public TerminalNode GT() { return getToken(MParser.GT, 0); }
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJsx_self_closing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJsx_self_closing(this);
		}
	}

	public final Jsx_self_closingContext jsx_self_closing() throws RecognitionException {
		Jsx_self_closingContext _localctx = new Jsx_self_closingContext(_ctx, getState());
		enterRule(_localctx, 474, RULE_jsx_self_closing);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2690);
			match(LT);
			setState(2691);
			((Jsx_self_closingContext)_localctx).name = jsx_element_name();
			setState(2692);
			ws_plus();
			setState(2696);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA) | (1L << CSHARP) | (1L << PYTHON2) | (1L << PYTHON3) | (1L << JAVASCRIPT) | (1L << SWIFT) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (CODE - 65)) | (1L << (DOCUMENT - 65)) | (1L << (BLOB - 65)) | (1L << (IMAGE - 65)) | (1L << (UUID - 65)) | (1L << (ITERATOR - 65)) | (1L << (CURSOR - 65)) | (1L << (HTML - 65)) | (1L << (ABSTRACT - 65)) | (1L << (ALL - 65)) | (1L << (ALWAYS - 65)) | (1L << (AND - 65)) | (1L << (ANY - 65)) | (1L << (AS - 65)) | (1L << (ASC - 65)) | (1L << (ATTR - 65)) | (1L << (ATTRIBUTE - 65)) | (1L << (ATTRIBUTES - 65)) | (1L << (BINDINGS - 65)) | (1L << (BREAK - 65)) | (1L << (BY - 65)) | (1L << (CASE - 65)) | (1L << (CATCH - 65)) | (1L << (CATEGORY - 65)) | (1L << (CLASS - 65)) | (1L << (CONTAINS - 65)) | (1L << (DEF - 65)) | (1L << (DEFAULT - 65)) | (1L << (DEFINE - 65)) | (1L << (DELETE - 65)) | (1L << (DESC - 65)) | (1L << (DO - 65)) | (1L << (DOING - 65)) | (1L << (EACH - 65)) | (1L << (ELSE - 65)) | (1L << (ENUM - 65)) | (1L << (ENUMERATED - 65)) | (1L << (EXCEPT - 65)) | (1L << (EXECUTE - 65)) | (1L << (EXPECTING - 65)) | (1L << (EXTENDS - 65)) | (1L << (FETCH - 65)) | (1L << (FILTERED - 65)) | (1L << (FINALLY - 65)) | (1L << (FLUSH - 65)) | (1L << (FOR - 65)) | (1L << (FROM - 65)) | (1L << (GETTER - 65)) | (1L << (HAS - 65)) | (1L << (IF - 65)) | (1L << (IN - 65)) | (1L << (INDEX - 65)) | (1L << (IS - 65)) | (1L << (MATCHING - 65)) | (1L << (METHOD - 65)) | (1L << (METHODS - 65)) | (1L << (MODULO - 65)) | (1L << (MUTABLE - 65)) | (1L << (NATIVE - 65)) | (1L << (NONE - 65)) | (1L << (NOT - 65)) | (1L << (NOTHING - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (NULL - 129)) | (1L << (ON - 129)) | (1L << (ONE - 129)) | (1L << (OPERATOR - 129)) | (1L << (OR - 129)) | (1L << (ORDER - 129)) | (1L << (OTHERWISE - 129)) | (1L << (PASS - 129)) | (1L << (RAISE - 129)) | (1L << (READ - 129)) | (1L << (RECEIVING - 129)) | (1L << (RESOURCE - 129)) | (1L << (RETURN - 129)) | (1L << (RETURNING - 129)) | (1L << (ROWS - 129)) | (1L << (SELF - 129)) | (1L << (SETTER - 129)) | (1L << (SINGLETON - 129)) | (1L << (SORTED - 129)) | (1L << (STORABLE - 129)) | (1L << (STORE - 129)) | (1L << (SUPER - 129)) | (1L << (SWITCH - 129)) | (1L << (TEST - 129)) | (1L << (THIS - 129)) | (1L << (THROW - 129)) | (1L << (TO - 129)) | (1L << (TRY - 129)) | (1L << (VERIFYING - 129)) | (1L << (WIDGET - 129)) | (1L << (WITH - 129)) | (1L << (WHEN - 129)) | (1L << (WHERE - 129)) | (1L << (WHILE - 129)) | (1L << (WRITE - 129)) | (1L << (SYMBOL_IDENTIFIER - 129)) | (1L << (TYPE_IDENTIFIER - 129)) | (1L << (VARIABLE_IDENTIFIER - 129)))) != 0)) {
				{
				{
				setState(2693);
				((Jsx_self_closingContext)_localctx).attributes = jsx_attribute();
				}
				}
				setState(2698);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2699);
			match(SLASH);
			setState(2700);
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
		public TerminalNode LT() { return getToken(MParser.LT, 0); }
		public Ws_plusContext ws_plus() {
			return getRuleContext(Ws_plusContext.class,0);
		}
		public TerminalNode GT() { return getToken(MParser.GT, 0); }
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJsx_opening(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJsx_opening(this);
		}
	}

	public final Jsx_openingContext jsx_opening() throws RecognitionException {
		Jsx_openingContext _localctx = new Jsx_openingContext(_ctx, getState());
		enterRule(_localctx, 476, RULE_jsx_opening);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2702);
			match(LT);
			setState(2703);
			((Jsx_openingContext)_localctx).name = jsx_element_name();
			setState(2704);
			ws_plus();
			setState(2708);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA) | (1L << CSHARP) | (1L << PYTHON2) | (1L << PYTHON3) | (1L << JAVASCRIPT) | (1L << SWIFT) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (CODE - 65)) | (1L << (DOCUMENT - 65)) | (1L << (BLOB - 65)) | (1L << (IMAGE - 65)) | (1L << (UUID - 65)) | (1L << (ITERATOR - 65)) | (1L << (CURSOR - 65)) | (1L << (HTML - 65)) | (1L << (ABSTRACT - 65)) | (1L << (ALL - 65)) | (1L << (ALWAYS - 65)) | (1L << (AND - 65)) | (1L << (ANY - 65)) | (1L << (AS - 65)) | (1L << (ASC - 65)) | (1L << (ATTR - 65)) | (1L << (ATTRIBUTE - 65)) | (1L << (ATTRIBUTES - 65)) | (1L << (BINDINGS - 65)) | (1L << (BREAK - 65)) | (1L << (BY - 65)) | (1L << (CASE - 65)) | (1L << (CATCH - 65)) | (1L << (CATEGORY - 65)) | (1L << (CLASS - 65)) | (1L << (CONTAINS - 65)) | (1L << (DEF - 65)) | (1L << (DEFAULT - 65)) | (1L << (DEFINE - 65)) | (1L << (DELETE - 65)) | (1L << (DESC - 65)) | (1L << (DO - 65)) | (1L << (DOING - 65)) | (1L << (EACH - 65)) | (1L << (ELSE - 65)) | (1L << (ENUM - 65)) | (1L << (ENUMERATED - 65)) | (1L << (EXCEPT - 65)) | (1L << (EXECUTE - 65)) | (1L << (EXPECTING - 65)) | (1L << (EXTENDS - 65)) | (1L << (FETCH - 65)) | (1L << (FILTERED - 65)) | (1L << (FINALLY - 65)) | (1L << (FLUSH - 65)) | (1L << (FOR - 65)) | (1L << (FROM - 65)) | (1L << (GETTER - 65)) | (1L << (HAS - 65)) | (1L << (IF - 65)) | (1L << (IN - 65)) | (1L << (INDEX - 65)) | (1L << (IS - 65)) | (1L << (MATCHING - 65)) | (1L << (METHOD - 65)) | (1L << (METHODS - 65)) | (1L << (MODULO - 65)) | (1L << (MUTABLE - 65)) | (1L << (NATIVE - 65)) | (1L << (NONE - 65)) | (1L << (NOT - 65)) | (1L << (NOTHING - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (NULL - 129)) | (1L << (ON - 129)) | (1L << (ONE - 129)) | (1L << (OPERATOR - 129)) | (1L << (OR - 129)) | (1L << (ORDER - 129)) | (1L << (OTHERWISE - 129)) | (1L << (PASS - 129)) | (1L << (RAISE - 129)) | (1L << (READ - 129)) | (1L << (RECEIVING - 129)) | (1L << (RESOURCE - 129)) | (1L << (RETURN - 129)) | (1L << (RETURNING - 129)) | (1L << (ROWS - 129)) | (1L << (SELF - 129)) | (1L << (SETTER - 129)) | (1L << (SINGLETON - 129)) | (1L << (SORTED - 129)) | (1L << (STORABLE - 129)) | (1L << (STORE - 129)) | (1L << (SUPER - 129)) | (1L << (SWITCH - 129)) | (1L << (TEST - 129)) | (1L << (THIS - 129)) | (1L << (THROW - 129)) | (1L << (TO - 129)) | (1L << (TRY - 129)) | (1L << (VERIFYING - 129)) | (1L << (WIDGET - 129)) | (1L << (WITH - 129)) | (1L << (WHEN - 129)) | (1L << (WHERE - 129)) | (1L << (WHILE - 129)) | (1L << (WRITE - 129)) | (1L << (SYMBOL_IDENTIFIER - 129)) | (1L << (TYPE_IDENTIFIER - 129)) | (1L << (VARIABLE_IDENTIFIER - 129)))) != 0)) {
				{
				{
				setState(2705);
				((Jsx_openingContext)_localctx).attributes = jsx_attribute();
				}
				}
				setState(2710);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2711);
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
		public TerminalNode LT() { return getToken(MParser.LT, 0); }
		public TerminalNode SLASH() { return getToken(MParser.SLASH, 0); }
		public TerminalNode GT() { return getToken(MParser.GT, 0); }
		public Jsx_element_nameContext jsx_element_name() {
			return getRuleContext(Jsx_element_nameContext.class,0);
		}
		public Jsx_closingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsx_closing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJsx_closing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJsx_closing(this);
		}
	}

	public final Jsx_closingContext jsx_closing() throws RecognitionException {
		Jsx_closingContext _localctx = new Jsx_closingContext(_ctx, getState());
		enterRule(_localctx, 478, RULE_jsx_closing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2713);
			match(LT);
			setState(2714);
			match(SLASH);
			setState(2715);
			((Jsx_closingContext)_localctx).name = jsx_element_name();
			setState(2716);
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
		public List<TerminalNode> DOT() { return getTokens(MParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(MParser.DOT, i);
		}
		public Jsx_element_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsx_element_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJsx_element_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJsx_element_name(this);
		}
	}

	public final Jsx_element_nameContext jsx_element_name() throws RecognitionException {
		Jsx_element_nameContext _localctx = new Jsx_element_nameContext(_ctx, getState());
		enterRule(_localctx, 480, RULE_jsx_element_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2718);
			jsx_identifier();
			setState(2723);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(2719);
				match(DOT);
				setState(2720);
				jsx_identifier();
				}
				}
				setState(2725);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJsx_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJsx_identifier(this);
		}
	}

	public final Jsx_identifierContext jsx_identifier() throws RecognitionException {
		Jsx_identifierContext _localctx = new Jsx_identifierContext(_ctx, getState());
		enterRule(_localctx, 482, RULE_jsx_identifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2726);
			identifier_or_keyword();
			setState(2730);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,238,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2727);
					nospace_hyphen_identifier_or_keyword();
					}
					} 
				}
				setState(2732);
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
		public TerminalNode EQ() { return getToken(MParser.EQ, 0); }
		public Jsx_attribute_valueContext jsx_attribute_value() {
			return getRuleContext(Jsx_attribute_valueContext.class,0);
		}
		public Jsx_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsx_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJsx_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJsx_attribute(this);
		}
	}

	public final Jsx_attributeContext jsx_attribute() throws RecognitionException {
		Jsx_attributeContext _localctx = new Jsx_attributeContext(_ctx, getState());
		enterRule(_localctx, 484, RULE_jsx_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2733);
			((Jsx_attributeContext)_localctx).name = jsx_identifier();
			setState(2736);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(2734);
				match(EQ);
				setState(2735);
				((Jsx_attributeContext)_localctx).value = jsx_attribute_value();
				}
			}

			setState(2738);
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
		public TerminalNode LCURL() { return getToken(MParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(MParser.RCURL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public JsxValueContext(Jsx_attribute_valueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJsxValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJsxValue(this);
		}
	}
	public static class JsxLiteralContext extends Jsx_attribute_valueContext {
		public TerminalNode TEXT_LITERAL() { return getToken(MParser.TEXT_LITERAL, 0); }
		public JsxLiteralContext(Jsx_attribute_valueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJsxLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJsxLiteral(this);
		}
	}

	public final Jsx_attribute_valueContext jsx_attribute_value() throws RecognitionException {
		Jsx_attribute_valueContext _localctx = new Jsx_attribute_valueContext(_ctx, getState());
		enterRule(_localctx, 486, RULE_jsx_attribute_value);
		try {
			setState(2745);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT_LITERAL:
				_localctx = new JsxLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2740);
				match(TEXT_LITERAL);
				}
				break;
			case LCURL:
				_localctx = new JsxValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2741);
				match(LCURL);
				setState(2742);
				((JsxValueContext)_localctx).exp = expression(0);
				setState(2743);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJsx_children(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJsx_children(this);
		}
	}

	public final Jsx_childrenContext jsx_children() throws RecognitionException {
		Jsx_childrenContext _localctx = new Jsx_childrenContext(_ctx, getState());
		enterRule(_localctx, 488, RULE_jsx_children);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2748); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2747);
					jsx_child();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2750); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,241,_ctx);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJsxText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJsxText(this);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJsxChild(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJsxChild(this);
		}
	}
	public static class JsxCodeContext extends Jsx_childContext {
		public ExpressionContext exp;
		public TerminalNode LCURL() { return getToken(MParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(MParser.RCURL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public JsxCodeContext(Jsx_childContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJsxCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJsxCode(this);
		}
	}

	public final Jsx_childContext jsx_child() throws RecognitionException {
		Jsx_childContext _localctx = new Jsx_childContext(_ctx, getState());
		enterRule(_localctx, 490, RULE_jsx_child);
		int _la;
		try {
			setState(2759);
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
				setState(2752);
				((JsxTextContext)_localctx).text = jsx_text();
				}
				break;
			case LT:
				_localctx = new JsxChildContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2753);
				((JsxChildContext)_localctx).jsx = jsx_element();
				}
				break;
			case LCURL:
				_localctx = new JsxCodeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2754);
				match(LCURL);
				setState(2756);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << LTCOLONGT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (CODE - 65)) | (1L << (DOCUMENT - 65)) | (1L << (BLOB - 65)) | (1L << (IMAGE - 65)) | (1L << (UUID - 65)) | (1L << (ITERATOR - 65)) | (1L << (CURSOR - 65)) | (1L << (HTML - 65)) | (1L << (ANY - 65)) | (1L << (EXECUTE - 65)) | (1L << (FETCH - 65)) | (1L << (MUTABLE - 65)) | (1L << (NONE - 65)) | (1L << (NOT - 65)))) != 0) || ((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & ((1L << (READ - 138)) | (1L << (SELF - 138)) | (1L << (SORTED - 138)) | (1L << (SUPER - 138)) | (1L << (THIS - 138)) | (1L << (BOOLEAN_LITERAL - 138)) | (1L << (CHAR_LITERAL - 138)) | (1L << (MIN_INTEGER - 138)) | (1L << (MAX_INTEGER - 138)) | (1L << (SYMBOL_IDENTIFIER - 138)) | (1L << (TYPE_IDENTIFIER - 138)) | (1L << (VARIABLE_IDENTIFIER - 138)) | (1L << (TEXT_LITERAL - 138)) | (1L << (UUID_LITERAL - 138)) | (1L << (INTEGER_LITERAL - 138)) | (1L << (HEXA_LITERAL - 138)) | (1L << (DECIMAL_LITERAL - 138)) | (1L << (DATETIME_LITERAL - 138)) | (1L << (TIME_LITERAL - 138)) | (1L << (DATE_LITERAL - 138)) | (1L << (PERIOD_LITERAL - 138)) | (1L << (VERSION_LITERAL - 138)))) != 0)) {
					{
					setState(2755);
					((JsxCodeContext)_localctx).exp = expression(0);
					}
				}

				setState(2758);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJsx_text(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJsx_text(this);
		}
	}

	public final Jsx_textContext jsx_text() throws RecognitionException {
		Jsx_textContext _localctx = new Jsx_textContext(_ctx, getState());
		enterRule(_localctx, 492, RULE_jsx_text);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2762); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2761);
					jsx_char();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2764); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,244,_ctx);
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
		public TerminalNode LCURL() { return getToken(MParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(MParser.RCURL, 0); }
		public TerminalNode LT() { return getToken(MParser.LT, 0); }
		public TerminalNode GT() { return getToken(MParser.GT, 0); }
		public TerminalNode JSX_TEXT() { return getToken(MParser.JSX_TEXT, 0); }
		public Jsx_charContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsx_char; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterJsx_char(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitJsx_char(this);
		}
	}

	public final Jsx_charContext jsx_char() throws RecognitionException {
		Jsx_charContext _localctx = new Jsx_charContext(_ctx, getState());
		enterRule(_localctx, 494, RULE_jsx_char);
		int _la;
		try {
			setState(2768);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2766);
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
				setState(2767);
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
		public TerminalNode LCURL() { return getToken(MParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(MParser.RCURL, 0); }
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterCss_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitCss_expression(this);
		}
	}

	public final Css_expressionContext css_expression() throws RecognitionException {
		Css_expressionContext _localctx = new Css_expressionContext(_ctx, getState());
		enterRule(_localctx, 496, RULE_css_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2770);
			match(LCURL);
			setState(2772); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2771);
				((Css_expressionContext)_localctx).field = css_field();
				}
				}
				setState(2774); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA) | (1L << CSHARP) | (1L << PYTHON2) | (1L << PYTHON3) | (1L << JAVASCRIPT) | (1L << SWIFT) | (1L << MINUS) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (CODE - 65)) | (1L << (DOCUMENT - 65)) | (1L << (BLOB - 65)) | (1L << (IMAGE - 65)) | (1L << (UUID - 65)) | (1L << (ITERATOR - 65)) | (1L << (CURSOR - 65)) | (1L << (HTML - 65)) | (1L << (ABSTRACT - 65)) | (1L << (ALL - 65)) | (1L << (ALWAYS - 65)) | (1L << (AND - 65)) | (1L << (ANY - 65)) | (1L << (AS - 65)) | (1L << (ASC - 65)) | (1L << (ATTR - 65)) | (1L << (ATTRIBUTE - 65)) | (1L << (ATTRIBUTES - 65)) | (1L << (BINDINGS - 65)) | (1L << (BREAK - 65)) | (1L << (BY - 65)) | (1L << (CASE - 65)) | (1L << (CATCH - 65)) | (1L << (CATEGORY - 65)) | (1L << (CLASS - 65)) | (1L << (CONTAINS - 65)) | (1L << (DEF - 65)) | (1L << (DEFAULT - 65)) | (1L << (DEFINE - 65)) | (1L << (DELETE - 65)) | (1L << (DESC - 65)) | (1L << (DO - 65)) | (1L << (DOING - 65)) | (1L << (EACH - 65)) | (1L << (ELSE - 65)) | (1L << (ENUM - 65)) | (1L << (ENUMERATED - 65)) | (1L << (EXCEPT - 65)) | (1L << (EXECUTE - 65)) | (1L << (EXPECTING - 65)) | (1L << (EXTENDS - 65)) | (1L << (FETCH - 65)) | (1L << (FILTERED - 65)) | (1L << (FINALLY - 65)) | (1L << (FLUSH - 65)) | (1L << (FOR - 65)) | (1L << (FROM - 65)) | (1L << (GETTER - 65)) | (1L << (HAS - 65)) | (1L << (IF - 65)) | (1L << (IN - 65)) | (1L << (INDEX - 65)) | (1L << (IS - 65)) | (1L << (MATCHING - 65)) | (1L << (METHOD - 65)) | (1L << (METHODS - 65)) | (1L << (MODULO - 65)) | (1L << (MUTABLE - 65)) | (1L << (NATIVE - 65)) | (1L << (NONE - 65)) | (1L << (NOT - 65)) | (1L << (NOTHING - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (NULL - 129)) | (1L << (ON - 129)) | (1L << (ONE - 129)) | (1L << (OPERATOR - 129)) | (1L << (OR - 129)) | (1L << (ORDER - 129)) | (1L << (OTHERWISE - 129)) | (1L << (PASS - 129)) | (1L << (RAISE - 129)) | (1L << (READ - 129)) | (1L << (RECEIVING - 129)) | (1L << (RESOURCE - 129)) | (1L << (RETURN - 129)) | (1L << (RETURNING - 129)) | (1L << (ROWS - 129)) | (1L << (SELF - 129)) | (1L << (SETTER - 129)) | (1L << (SINGLETON - 129)) | (1L << (SORTED - 129)) | (1L << (STORABLE - 129)) | (1L << (STORE - 129)) | (1L << (SUPER - 129)) | (1L << (SWITCH - 129)) | (1L << (TEST - 129)) | (1L << (THIS - 129)) | (1L << (THROW - 129)) | (1L << (TO - 129)) | (1L << (TRY - 129)) | (1L << (VERIFYING - 129)) | (1L << (WIDGET - 129)) | (1L << (WITH - 129)) | (1L << (WHEN - 129)) | (1L << (WHERE - 129)) | (1L << (WHILE - 129)) | (1L << (WRITE - 129)) | (1L << (SYMBOL_IDENTIFIER - 129)) | (1L << (TYPE_IDENTIFIER - 129)) | (1L << (VARIABLE_IDENTIFIER - 129)))) != 0) );
			setState(2776);
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
		public TerminalNode COLON() { return getToken(MParser.COLON, 0); }
		public TerminalNode SEMI() { return getToken(MParser.SEMI, 0); }
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterCss_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitCss_field(this);
		}
	}

	public final Css_fieldContext css_field() throws RecognitionException {
		Css_fieldContext _localctx = new Css_fieldContext(_ctx, getState());
		enterRule(_localctx, 498, RULE_css_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2778);
			((Css_fieldContext)_localctx).name = css_identifier(0);
			setState(2779);
			match(COLON);
			setState(2780);
			((Css_fieldContext)_localctx).value = css_value();
			setState(2781);
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
		public TerminalNode MINUS() { return getToken(MParser.MINUS, 0); }
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterCss_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitCss_identifier(this);
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
		int _startState = 500;
		enterRecursionRule(_localctx, 500, RULE_css_identifier, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2787);
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
				setState(2784);
				identifier_or_keyword();
				}
				break;
			case MINUS:
				{
				setState(2785);
				match(MINUS);
				setState(2786);
				nospace_identifier_or_keyword();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(2797);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,249,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Css_identifierContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_css_identifier);
					setState(2789);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2791); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(2790);
							nospace_hyphen_identifier_or_keyword();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(2793); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,248,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					} 
				}
				setState(2799);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterCssText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitCssText(this);
		}
	}
	public static class CssValueContext extends Css_valueContext {
		public ExpressionContext exp;
		public TerminalNode LCURL() { return getToken(MParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(MParser.RCURL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CssValueContext(Css_valueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterCssValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitCssValue(this);
		}
	}

	public final Css_valueContext css_value() throws RecognitionException {
		Css_valueContext _localctx = new Css_valueContext(_ctx, getState());
		enterRule(_localctx, 502, RULE_css_value);
		try {
			setState(2805);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
			case 1:
				_localctx = new CssValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2800);
				match(LCURL);
				setState(2801);
				((CssValueContext)_localctx).exp = expression(0);
				setState(2802);
				match(RCURL);
				}
				break;
			case 2:
				_localctx = new CssTextContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2804);
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
		public List<TerminalNode> SEMI() { return getTokens(MParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(MParser.SEMI, i);
		}
		public Css_textContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_css_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterCss_text(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitCss_text(this);
		}
	}

	public final Css_textContext css_text() throws RecognitionException {
		Css_textContext _localctx = new Css_textContext(_ctx, getState());
		enterRule(_localctx, 504, RULE_css_text);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2808); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(2807);
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
				setState(2810); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,251,_ctx);
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
		case 19:
			return native_category_binding_list_sempred((Native_category_binding_listContext)_localctx, predIndex);
		case 39:
			return else_if_statement_list_sempred((Else_if_statement_listContext)_localctx, predIndex);
		case 45:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 48:
			return instance_expression_sempred((Instance_expressionContext)_localctx, predIndex);
		case 49:
			return mutable_instance_expression_sempred((Mutable_instance_expressionContext)_localctx, predIndex);
		case 55:
			return copy_from_sempred((Copy_fromContext)_localctx, predIndex);
		case 56:
			return argument_assignment_list_sempred((Argument_assignment_listContext)_localctx, predIndex);
		case 64:
			return child_instance_sempred((Child_instanceContext)_localctx, predIndex);
		case 92:
			return typedef_sempred((TypedefContext)_localctx, predIndex);
		case 103:
			return nospace_hyphen_identifier_or_keyword_sempred((Nospace_hyphen_identifier_or_keywordContext)_localctx, predIndex);
		case 104:
			return nospace_identifier_or_keyword_sempred((Nospace_identifier_or_keywordContext)_localctx, predIndex);
		case 117:
			return any_type_sempred((Any_typeContext)_localctx, predIndex);
		case 156:
			return assignable_instance_sempred((Assignable_instanceContext)_localctx, predIndex);
		case 157:
			return is_expression_sempred((Is_expressionContext)_localctx, predIndex);
		case 169:
			return new_token_sempred((New_tokenContext)_localctx, predIndex);
		case 170:
			return key_token_sempred((Key_tokenContext)_localctx, predIndex);
		case 171:
			return module_token_sempred((Module_tokenContext)_localctx, predIndex);
		case 172:
			return value_token_sempred((Value_tokenContext)_localctx, predIndex);
		case 173:
			return symbols_token_sempred((Symbols_tokenContext)_localctx, predIndex);
		case 180:
			return javascript_expression_sempred((Javascript_expressionContext)_localctx, predIndex);
		case 186:
			return javascript_arguments_sempred((Javascript_argumentsContext)_localctx, predIndex);
		case 193:
			return python_expression_sempred((Python_expressionContext)_localctx, predIndex);
		case 199:
			return python_ordinal_argument_list_sempred((Python_ordinal_argument_listContext)_localctx, predIndex);
		case 200:
			return python_named_argument_list_sempred((Python_named_argument_listContext)_localctx, predIndex);
		case 202:
			return python_identifier_expression_sempred((Python_identifier_expressionContext)_localctx, predIndex);
		case 206:
			return java_expression_sempred((Java_expressionContext)_localctx, predIndex);
		case 212:
			return java_arguments_sempred((Java_argumentsContext)_localctx, predIndex);
		case 215:
			return java_identifier_expression_sempred((Java_identifier_expressionContext)_localctx, predIndex);
		case 216:
			return java_class_identifier_expression_sempred((Java_class_identifier_expressionContext)_localctx, predIndex);
		case 220:
			return csharp_expression_sempred((Csharp_expressionContext)_localctx, predIndex);
		case 226:
			return csharp_arguments_sempred((Csharp_argumentsContext)_localctx, predIndex);
		case 229:
			return csharp_identifier_expression_sempred((Csharp_identifier_expressionContext)_localctx, predIndex);
		case 250:
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
			return precpred(_ctx, 32);
		case 3:
			return precpred(_ctx, 31);
		case 4:
			return precpred(_ctx, 30);
		case 5:
			return precpred(_ctx, 29);
		case 6:
			return precpred(_ctx, 28);
		case 7:
			return precpred(_ctx, 26);
		case 8:
			return precpred(_ctx, 25);
		case 9:
			return precpred(_ctx, 24);
		case 10:
			return precpred(_ctx, 23);
		case 11:
			return precpred(_ctx, 20);
		case 12:
			return precpred(_ctx, 19);
		case 13:
			return precpred(_ctx, 18);
		case 14:
			return precpred(_ctx, 17);
		case 15:
			return precpred(_ctx, 16);
		case 16:
			return precpred(_ctx, 15);
		case 17:
			return precpred(_ctx, 14);
		case 18:
			return precpred(_ctx, 13);
		case 19:
			return precpred(_ctx, 12);
		case 20:
			return precpred(_ctx, 11);
		case 21:
			return precpred(_ctx, 10);
		case 22:
			return precpred(_ctx, 9);
		case 23:
			return precpred(_ctx, 8);
		case 24:
			return precpred(_ctx, 7);
		case 25:
			return precpred(_ctx, 6);
		case 26:
			return precpred(_ctx, 5);
		case 27:
			return precpred(_ctx, 1);
		case 28:
			return precpred(_ctx, 35);
		case 29:
			return precpred(_ctx, 27);
		case 30:
			return precpred(_ctx, 22);
		case 31:
			return precpred(_ctx, 21);
		}
		return true;
	}
	private boolean instance_expression_sempred(Instance_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 32:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean mutable_instance_expression_sempred(Mutable_instance_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 33:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean copy_from_sempred(Copy_fromContext _localctx, int predIndex) {
		switch (predIndex) {
		case 34:
			return this.willNotBe(this.equalToken());
		}
		return true;
	}
	private boolean argument_assignment_list_sempred(Argument_assignment_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 35:
			return this.willNotBe(this.equalToken());
		case 36:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean child_instance_sempred(Child_instanceContext _localctx, int predIndex) {
		switch (predIndex) {
		case 37:
			return this.wasNot(MParser.WS);
		case 38:
			return this.wasNot(MParser.WS);
		}
		return true;
	}
	private boolean typedef_sempred(TypedefContext _localctx, int predIndex) {
		switch (predIndex) {
		case 39:
			return precpred(_ctx, 5);
		case 40:
			return precpred(_ctx, 4);
		case 41:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean nospace_hyphen_identifier_or_keyword_sempred(Nospace_hyphen_identifier_or_keywordContext _localctx, int predIndex) {
		switch (predIndex) {
		case 42:
			return this.wasNotWhiteSpace();
		}
		return true;
	}
	private boolean nospace_identifier_or_keyword_sempred(Nospace_identifier_or_keywordContext _localctx, int predIndex) {
		switch (predIndex) {
		case 43:
			return this.wasNotWhiteSpace();
		}
		return true;
	}
	private boolean any_type_sempred(Any_typeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 44:
			return precpred(_ctx, 2);
		case 45:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean assignable_instance_sempred(Assignable_instanceContext _localctx, int predIndex) {
		switch (predIndex) {
		case 46:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean is_expression_sempred(Is_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 47:
			return this.willBeAOrAn();
		}
		return true;
	}
	private boolean new_token_sempred(New_tokenContext _localctx, int predIndex) {
		switch (predIndex) {
		case 48:
			return this.isText(((New_tokenContext)_localctx).i1,"new");
		}
		return true;
	}
	private boolean key_token_sempred(Key_tokenContext _localctx, int predIndex) {
		switch (predIndex) {
		case 49:
			return this.isText(((Key_tokenContext)_localctx).i1,"key");
		}
		return true;
	}
	private boolean module_token_sempred(Module_tokenContext _localctx, int predIndex) {
		switch (predIndex) {
		case 50:
			return this.isText(((Module_tokenContext)_localctx).i1,"module");
		}
		return true;
	}
	private boolean value_token_sempred(Value_tokenContext _localctx, int predIndex) {
		switch (predIndex) {
		case 51:
			return this.isText(((Value_tokenContext)_localctx).i1,"value");
		}
		return true;
	}
	private boolean symbols_token_sempred(Symbols_tokenContext _localctx, int predIndex) {
		switch (predIndex) {
		case 52:
			return this.isText(((Symbols_tokenContext)_localctx).i1,"symbols");
		}
		return true;
	}
	private boolean javascript_expression_sempred(Javascript_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 53:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean javascript_arguments_sempred(Javascript_argumentsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 54:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean python_expression_sempred(Python_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 55:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean python_ordinal_argument_list_sempred(Python_ordinal_argument_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 56:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean python_named_argument_list_sempred(Python_named_argument_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 57:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean python_identifier_expression_sempred(Python_identifier_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 58:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean java_expression_sempred(Java_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 59:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean java_arguments_sempred(Java_argumentsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 60:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean java_identifier_expression_sempred(Java_identifier_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 61:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean java_class_identifier_expression_sempred(Java_class_identifier_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 62:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean csharp_expression_sempred(Csharp_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 63:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean csharp_arguments_sempred(Csharp_argumentsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 64:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean csharp_identifier_expression_sempred(Csharp_identifier_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 65:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean css_identifier_sempred(Css_identifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 66:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00bb\u0aff\4\2\t"+
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
		"\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u0203\n\2\3\2\5\2\u0206\n\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\5\5\u021f\n\5\3\5\3\5\3\6\5\6\u0224\n\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0232\n\6\3\6\3\6\3\6\3\6\5\6\u0238\n\6"+
		"\5\6\u023a\n\6\5\6\u023c\n\6\3\6\3\6\5\6\u0240\n\6\3\7\3\7\3\7\5\7\u0245"+
		"\n\7\3\7\3\7\3\b\3\b\3\b\3\b\5\b\u024d\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u0254"+
		"\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\5\n\u0265"+
		"\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0270\n\n\3\n\3\n\3\n\3\n"+
		"\3\n\5\n\u0277\n\n\3\n\3\n\5\n\u027b\n\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13\u0286\n\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\5\r\u0294\n\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\5\17\u02a8\n\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\5\21\u02bf\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\5\22\u02ca\n\22\3\22\3\22\3\22\3\22\3\22\5\22\u02d1\n\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u02da\n\22\3\22\3\22\3\23\5\23"+
		"\u02df\n\23\3\23\3\23\3\23\3\23\3\23\5\23\u02e6\n\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\5\23\u02ef\n\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u0302\n\25\f\25"+
		"\16\25\u0305\13\25\3\26\3\26\3\26\3\26\3\26\5\26\u030c\n\26\3\26\3\26"+
		"\3\26\5\26\u0311\n\26\3\26\5\26\u0314\n\26\3\27\3\27\3\27\3\27\5\27\u031a"+
		"\n\27\3\27\3\27\3\27\5\27\u031f\n\27\3\27\5\27\u0322\n\27\3\27\3\27\3"+
		"\27\3\27\5\27\u0328\n\27\3\27\3\27\3\30\3\30\5\30\u032e\n\30\3\30\3\30"+
		"\3\30\5\30\u0333\n\30\3\30\3\30\3\30\5\30\u0338\n\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\5\31\u0350\n\31\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\5\33\u035b\n\33\3\33\3\33\5\33\u035f\n\33\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\5\34\u0375\n\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0385\n\36\3\36\3\36\3\36\3\36"+
		"\3\36\5\36\u038c\n\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0394\n\36\3"+
		"\37\3\37\3\37\5\37\u0399\n\37\3\37\3\37\3 \3 \3 \5 \u03a0\n \3 \3 \3 "+
		"\3 \5 \u03a6\n \3 \3 \3 \3 \3 \5 \u03ad\n \3!\3!\3!\3!\3!\3!\3!\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u03ca"+
		"\n#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u03dd\n$\3%"+
		"\3%\3%\3%\5%\u03e3\n%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u0405\n(\3"+
		"(\3(\3(\3(\3(\3(\3(\5(\u040e\n(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\7)\u0423\n)\f)\16)\u0426\13)\3*\3*\3*\3+\3+\3+\3+"+
		"\3+\3+\3+\3+\5+\u0433\n+\3+\3+\3+\3+\3+\3+\3+\5+\u043c\n+\3+\3+\3+\3+"+
		"\3+\3+\3+\5+\u0445\n+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,"+
		"\3,\3,\3,\3,\3,\5,\u045c\n,\3-\3-\3.\3.\5.\u0462\n.\3/\3/\3/\3/\3/\3/"+
		"\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u0479\n/\3/\3/\3/\3/"+
		"\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/"+
		"\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/"+
		"\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/"+
		"\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/"+
		"\3/\3/\3/\3/\3/\3/\3/\5/\u04e2\n/\3/\3/\3/\3/\3/\3/\3/\3/\7/\u04ec\n/"+
		"\f/\16/\u04ef\13/\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u04f9\n"+
		"\61\3\62\3\62\3\62\3\62\3\62\7\62\u0500\n\62\f\62\16\62\u0503\13\62\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\7\63\u050b\n\63\f\63\16\63\u050e\13\63\3"+
		"\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u0519\n\64\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u0527\n\65\3\66"+
		"\3\66\3\66\5\66\u052c\n\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\5\67\u0535"+
		"\n\67\3\67\3\67\38\38\38\38\38\58\u053e\n8\38\38\38\38\38\58\u0545\n8"+
		"\38\38\58\u0549\n8\39\39\39\39\39\3:\3:\3:\3:\3:\5:\u0555\n:\3:\3:\3:"+
		"\7:\u055a\n:\f:\16:\u055d\13:\3;\3;\3;\3;\5;\u0563\n;\3<\3<\3<\3<\3<\3"+
		"=\3=\3=\5=\u056d\n=\3=\3=\3=\3>\3>\3>\5>\u0575\n>\3>\3>\3>\3>\3>\3>\3"+
		">\3>\3>\5>\u0580\n>\3>\3>\5>\u0584\n>\3>\3>\3>\5>\u0589\n>\3>\3>\3>\5"+
		">\u058e\n>\5>\u0590\n>\3?\3?\3?\5?\u0595\n?\3?\3?\3?\3?\3?\3?\3?\3?\3"+
		"?\3?\3?\3?\3?\3?\3?\3?\3?\5?\u05a8\n?\3?\3?\5?\u05ac\n?\3?\3?\3?\5?\u05b1"+
		"\n?\3?\3?\3?\5?\u05b6\n?\3?\3?\3?\3?\3?\3?\3?\3?\5?\u05c0\n?\3@\3@\5@"+
		"\u05c4\n@\3@\3@\3@\3@\3@\3@\3@\5@\u05cd\n@\3@\3@\3A\3A\3A\3A\3B\3B\3B"+
		"\3B\3B\3B\3B\3B\5B\u05dd\nB\3C\3C\3C\3C\3D\7D\u05e4\nD\fD\16D\u05e7\13"+
		"D\3E\6E\u05ea\nE\rE\16E\u05eb\3F\7F\u05ef\nF\fF\16F\u05f2\13F\3G\6G\u05f5"+
		"\nG\rG\16G\u05f6\3G\3G\3H\7H\u05fc\nH\fH\16H\u05ff\13H\3H\3H\3I\3I\3J"+
		"\3J\3K\3K\3K\5K\u060a\nK\3L\5L\u060d\nL\3L\3L\3L\3M\3M\3M\3M\7M\u0616"+
		"\nM\fM\16M\u0619\13M\3N\3N\3N\7N\u061e\nN\fN\16N\u0621\13N\3N\3N\3N\7"+
		"N\u0626\nN\fN\16N\u0629\13N\3N\3N\3N\3N\3N\3N\5N\u0631\nN\3O\3O\3O\3O"+
		"\3O\3O\7O\u0639\nO\fO\16O\u063c\13O\5O\u063e\nO\3O\3O\5O\u0642\nO\3P\3"+
		"P\3Q\3Q\3Q\3Q\3R\3R\3S\3S\5S\u064e\nS\3T\3T\3U\3U\5U\u0654\nU\3V\3V\3"+
		"V\3V\7V\u065a\nV\fV\16V\u065d\13V\3W\3W\3W\3W\7W\u0663\nW\fW\16W\u0666"+
		"\13W\3X\3X\3X\7X\u066b\nX\fX\16X\u066e\13X\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y"+
		"\3Y\5Y\u067a\nY\3Z\5Z\u067d\nZ\3Z\3Z\5Z\u0681\nZ\3Z\3Z\3[\5[\u0686\n["+
		"\3[\3[\5[\u068a\n[\3[\3[\3\\\3\\\3\\\7\\\u0691\n\\\f\\\16\\\u0694\13\\"+
		"\3]\3]\3]\3]\3]\3]\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\5^\u06a8\n^\3^"+
		"\3^\3^\3^\3^\3^\3^\7^\u06b1\n^\f^\16^\u06b4\13^\3_\3_\5_\u06b8\n_\3`\3"+
		"`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\5`\u06cb\n`\3a\3a\3b\5"+
		"b\u06d0\nb\3b\3b\3c\3c\3d\3d\3d\5d\u06d9\nd\3e\3e\5e\u06dd\ne\3f\3f\3"+
		"f\7f\u06e2\nf\ff\16f\u06e5\13f\3g\3g\5g\u06e9\ng\3h\3h\5h\u06ed\nh\3i"+
		"\3i\3i\3i\3j\3j\3j\3k\3k\3k\5k\u06f9\nk\3l\3l\3m\3m\3n\3n\3o\3o\3p\3p"+
		"\3q\3q\3q\7q\u0708\nq\fq\16q\u070b\13q\3r\3r\5r\u070f\nr\3r\5r\u0712\n"+
		"r\3s\3s\5s\u0716\ns\3t\3t\3t\5t\u071b\nt\3u\3u\3u\3v\3v\5v\u0722\nv\3"+
		"w\3w\3w\3w\3w\3w\3w\3w\3w\7w\u072d\nw\fw\16w\u0730\13w\3x\3x\3x\3x\7x"+
		"\u0736\nx\fx\16x\u0739\13x\3y\3y\3y\7y\u073e\ny\fy\16y\u0741\13y\3y\3"+
		"y\3y\7y\u0746\ny\fy\16y\u0749\13y\3y\3y\3y\3y\3y\5y\u0750\ny\3z\3z\3z"+
		"\3z\7z\u0756\nz\fz\16z\u0759\13z\3{\3{\3{\5{\u075e\n{\3|\3|\3|\3|\3|\3"+
		"|\3|\3|\3|\3|\5|\u076a\n|\3}\3}\5}\u076e\n}\3~\3~\3~\3~\3~\3~\7~\u0776"+
		"\n~\f~\16~\u0779\13~\3\177\3\177\3\177\7\177\u077e\n\177\f\177\16\177"+
		"\u0781\13\177\3\177\5\177\u0784\n\177\3\u0080\3\u0080\3\u0080\3\u0080"+
		"\5\u0080\u078a\n\u0080\3\u0080\3\u0080\3\u0080\7\u0080\u078f\n\u0080\f"+
		"\u0080\16\u0080\u0792\13\u0080\3\u0080\3\u0080\5\u0080\u0796\n\u0080\3"+
		"\u0081\3\u0081\3\u0081\7\u0081\u079b\n\u0081\f\u0081\16\u0081\u079e\13"+
		"\u0081\3\u0082\3\u0082\3\u0082\7\u0082\u07a3\n\u0082\f\u0082\16\u0082"+
		"\u07a6\13\u0082\3\u0083\3\u0083\3\u0083\3\u0083\5\u0083\u07ac\n\u0083"+
		"\3\u0084\3\u0084\3\u0085\3\u0085\3\u0085\3\u0085\7\u0085\u07b4\n\u0085"+
		"\f\u0085\16\u0085\u07b7\13\u0085\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086"+
		"\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\5\u0086\u07c3\n\u0086\3\u0087"+
		"\3\u0087\5\u0087\u07c7\n\u0087\3\u0087\5\u0087\u07ca\n\u0087\3\u0088\3"+
		"\u0088\5\u0088\u07ce\n\u0088\3\u0088\5\u0088\u07d1\n\u0088\3\u0089\3\u0089"+
		"\3\u0089\3\u0089\7\u0089\u07d7\n\u0089\f\u0089\16\u0089\u07da\13\u0089"+
		"\3\u008a\3\u008a\3\u008a\3\u008a\7\u008a\u07e0\n\u008a\f\u008a\16\u008a"+
		"\u07e3\13\u008a\3\u008b\3\u008b\3\u008b\3\u008b\7\u008b\u07e9\n\u008b"+
		"\f\u008b\16\u008b\u07ec\13\u008b\3\u008c\3\u008c\3\u008c\3\u008c\7\u008c"+
		"\u07f2\n\u008c\f\u008c\16\u008c\u07f5\13\u008c\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\5\u008d\u0805\n\u008d\3\u008e\3\u008e\3\u008e\3\u008e"+
		"\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e"+
		"\3\u008e\3\u008e\3\u008e\3\u008e\5\u008e\u0818\n\u008e\3\u008f\3\u008f"+
		"\3\u008f\7\u008f\u081d\n\u008f\f\u008f\16\u008f\u0820\13\u008f\3\u0090"+
		"\3\u0090\3\u0091\3\u0091\3\u0091\5\u0091\u0827\n\u0091\3\u0091\3\u0091"+
		"\3\u0092\3\u0092\3\u0092\3\u0092\3\u0093\3\u0093\5\u0093\u0831\n\u0093"+
		"\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\5\u0094\u0839\n\u0094"+
		"\3\u0095\5\u0095\u083c\n\u0095\3\u0095\3\u0095\5\u0095\u0840\n\u0095\3"+
		"\u0095\3\u0095\3\u0096\5\u0096\u0845\n\u0096\3\u0096\3\u0096\3\u0096\3"+
		"\u0096\3\u0096\3\u0096\3\u0096\3\u0096\5\u0096\u084f\n\u0096\3\u0097\3"+
		"\u0097\5\u0097\u0853\n\u0097\3\u0097\3\u0097\3\u0098\3\u0098\3\u0098\3"+
		"\u0098\3\u0098\7\u0098\u085c\n\u0098\f\u0098\16\u0098\u085f\13\u0098\5"+
		"\u0098\u0861\n\u0098\3\u0099\3\u0099\3\u0099\7\u0099\u0866\n\u0099\f\u0099"+
		"\16\u0099\u0869\13\u0099\3\u009a\3\u009a\3\u009a\3\u009a\3\u009b\3\u009b"+
		"\5\u009b\u0871\n\u009b\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c"+
		"\3\u009c\3\u009c\3\u009c\5\u009c\u087c\n\u009c\3\u009d\3\u009d\3\u009d"+
		"\3\u009d\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\7\u009e\u0887\n\u009e"+
		"\f\u009e\16\u009e\u088a\13\u009e\3\u009f\3\u009f\3\u009f\3\u009f\5\u009f"+
		"\u0890\n\u009f\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0"+
		"\3\u00a0\5\u00a0\u089a\n\u00a0\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1"+
		"\3\u00a2\3\u00a2\3\u00a2\5\u00a2\u08a4\n\u00a2\3\u00a2\5\u00a2\u08a7\n"+
		"\u00a2\3\u00a3\3\u00a3\5\u00a3\u08ab\n\u00a3\3\u00a4\3\u00a4\3\u00a4\3"+
		"\u00a4\3\u00a4\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a6\3\u00a6"+
		"\3\u00a6\3\u00a6\3\u00a6\3\u00a7\3\u00a7\3\u00a7\7\u00a7\u08bf\n\u00a7"+
		"\f\u00a7\16\u00a7\u08c2\13\u00a7\3\u00a8\3\u00a8\3\u00a8\7\u00a8\u08c7"+
		"\n\u00a8\f\u00a8\16\u00a8\u08ca\13\u00a8\3\u00a8\5\u00a8\u08cd\n\u00a8"+
		"\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\5\u00a9\u08d5\n\u00a9"+
		"\3\u00aa\3\u00aa\3\u00ab\3\u00ab\3\u00ab\3\u00ac\3\u00ac\3\u00ac\3\u00ad"+
		"\3\u00ad\3\u00ad\3\u00ae\3\u00ae\3\u00ae\3\u00af\3\u00af\3\u00af\3\u00b0"+
		"\3\u00b0\3\u00b1\3\u00b1\3\u00b2\3\u00b2\3\u00b3\3\u00b3\3\u00b4\3\u00b4"+
		"\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\5\u00b5\u08f9"+
		"\n\u00b5\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\7\u00b6\u0900\n\u00b6"+
		"\f\u00b6\16\u00b6\u0903\13\u00b6\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7"+
		"\3\u00b7\3\u00b7\5\u00b7\u090c\n\u00b7\3\u00b8\3\u00b8\3\u00b9\3\u00b9"+
		"\3\u00b9\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\5\u00ba\u0918\n\u00ba"+
		"\3\u00bb\3\u00bb\3\u00bb\5\u00bb\u091d\n\u00bb\3\u00bb\3\u00bb\3\u00bc"+
		"\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\7\u00bc\u0927\n\u00bc\f\u00bc"+
		"\16\u00bc\u092a\13\u00bc\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00be\3\u00be"+
		"\3\u00be\3\u00be\3\u00bf\3\u00bf\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0"+
		"\5\u00c0\u093b\n\u00c0\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\5\u00c1"+
		"\u0942\n\u00c1\3\u00c2\3\u00c2\3\u00c2\5\u00c2\u0947\n\u00c2\3\u00c3\3"+
		"\u00c3\3\u00c3\3\u00c3\3\u00c3\7\u00c3\u094e\n\u00c3\f\u00c3\16\u00c3"+
		"\u0951\13\u00c3\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\5\u00c4\u0958"+
		"\n\u00c4\3\u00c5\3\u00c5\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6"+
		"\5\u00c6\u0962\n\u00c6\3\u00c7\3\u00c7\3\u00c7\5\u00c7\u0967\n\u00c7\3"+
		"\u00c7\3\u00c7\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8"+
		"\u0971\n\u00c8\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\7\u00c9"+
		"\u0979\n\u00c9\f\u00c9\16\u00c9\u097c\13\u00c9\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\7\u00ca"+
		"\u0989\n\u00ca\f\u00ca\16\u00ca\u098c\13\u00ca\3\u00cb\3\u00cb\3\u00cb"+
		"\3\u00cb\3\u00cc\3\u00cc\3\u00cc\5\u00cc\u0995\n\u00cc\3\u00cc\3\u00cc"+
		"\3\u00cc\7\u00cc\u099a\n\u00cc\f\u00cc\16\u00cc\u099d\13\u00cc\3\u00cd"+
		"\3\u00cd\3\u00cd\3\u00cd\3\u00cd\5\u00cd\u09a4\n\u00cd\3\u00ce\3\u00ce"+
		"\3\u00ce\3\u00ce\3\u00ce\5\u00ce\u09ab\n\u00ce\3\u00cf\3\u00cf\3\u00cf"+
		"\3\u00cf\3\u00cf\3\u00cf\3\u00cf\5\u00cf\u09b4\n\u00cf\3\u00d0\3\u00d0"+
		"\3\u00d0\3\u00d0\3\u00d0\7\u00d0\u09bb\n\u00d0\f\u00d0\16\u00d0\u09be"+
		"\13\u00d0\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\5\u00d1\u09c5\n\u00d1"+
		"\3\u00d2\3\u00d2\3\u00d3\3\u00d3\3\u00d3\3\u00d4\3\u00d4\3\u00d4\5\u00d4"+
		"\u09cf\n\u00d4\3\u00d5\3\u00d5\3\u00d5\5\u00d5\u09d4\n\u00d5\3\u00d5\3"+
		"\u00d5\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\7\u00d6\u09de\n"+
		"\u00d6\f\u00d6\16\u00d6\u09e1\13\u00d6\3\u00d7\3\u00d7\3\u00d7\3\u00d7"+
		"\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9"+
		"\3\u00d9\7\u00d9\u09f1\n\u00d9\f\u00d9\16\u00d9\u09f4\13\u00d9\3\u00da"+
		"\3\u00da\3\u00da\3\u00da\3\u00da\7\u00da\u09fb\n\u00da\f\u00da\16\u00da"+
		"\u09fe\13\u00da\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db\5\u00db\u0a05"+
		"\n\u00db\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\5\u00dc\u0a0c\n\u00dc"+
		"\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\5\u00dd\u0a15"+
		"\n\u00dd\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\7\u00de\u0a1c\n\u00de"+
		"\f\u00de\16\u00de\u0a1f\13\u00de\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df"+
		"\5\u00df\u0a26\n\u00df\3\u00e0\3\u00e0\3\u00e1\3\u00e1\3\u00e1\3\u00e2"+
		"\3\u00e2\3\u00e2\5\u00e2\u0a30\n\u00e2\3\u00e3\3\u00e3\3\u00e3\5\u00e3"+
		"\u0a35\n\u00e3\3\u00e3\3\u00e3\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4"+
		"\3\u00e4\7\u00e4\u0a3f\n\u00e4\f\u00e4\16\u00e4\u0a42\13\u00e4\3\u00e5"+
		"\3\u00e5\3\u00e5\3\u00e5\3\u00e6\3\u00e6\3\u00e6\3\u00e6\3\u00e7\3\u00e7"+
		"\3\u00e7\5\u00e7\u0a4f\n\u00e7\3\u00e7\3\u00e7\3\u00e7\7\u00e7\u0a54\n"+
		"\u00e7\f\u00e7\16\u00e7\u0a57\13\u00e7\3\u00e8\3\u00e8\3\u00e8\3\u00e8"+
		"\3\u00e8\5\u00e8\u0a5e\n\u00e8\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9"+
		"\5\u00e9\u0a65\n\u00e9\3\u00ea\3\u00ea\5\u00ea\u0a69\n\u00ea\3\u00eb\3"+
		"\u00eb\3\u00eb\5\u00eb\u0a6e\n\u00eb\3\u00eb\3\u00eb\5\u00eb\u0a72\n\u00eb"+
		"\3\u00ec\3\u00ec\3\u00ec\5\u00ec\u0a77\n\u00ec\3\u00ec\3\u00ec\3\u00ec"+
		"\3\u00ed\3\u00ed\3\u00ed\5\u00ed\u0a7f\n\u00ed\3\u00ee\3\u00ee\3\u00ee"+
		"\3\u00ee\3\u00ef\3\u00ef\3\u00ef\3\u00ef\7\u00ef\u0a89\n\u00ef\f\u00ef"+
		"\16\u00ef\u0a8c\13\u00ef\3\u00ef\3\u00ef\3\u00ef\3\u00f0\3\u00f0\3\u00f0"+
		"\3\u00f0\7\u00f0\u0a95\n\u00f0\f\u00f0\16\u00f0\u0a98\13\u00f0\3\u00f0"+
		"\3\u00f0\3\u00f1\3\u00f1\3\u00f1\3\u00f1\3\u00f1\3\u00f2\3\u00f2\3\u00f2"+
		"\7\u00f2\u0aa4\n\u00f2\f\u00f2\16\u00f2\u0aa7\13\u00f2\3\u00f3\3\u00f3"+
		"\7\u00f3\u0aab\n\u00f3\f\u00f3\16\u00f3\u0aae\13\u00f3\3\u00f4\3\u00f4"+
		"\3\u00f4\5\u00f4\u0ab3\n\u00f4\3\u00f4\3\u00f4\3\u00f5\3\u00f5\3\u00f5"+
		"\3\u00f5\3\u00f5\5\u00f5\u0abc\n\u00f5\3\u00f6\6\u00f6\u0abf\n\u00f6\r"+
		"\u00f6\16\u00f6\u0ac0\3\u00f7\3\u00f7\3\u00f7\3\u00f7\5\u00f7\u0ac7\n"+
		"\u00f7\3\u00f7\5\u00f7\u0aca\n\u00f7\3\u00f8\6\u00f8\u0acd\n\u00f8\r\u00f8"+
		"\16\u00f8\u0ace\3\u00f9\3\u00f9\5\u00f9\u0ad3\n\u00f9\3\u00fa\3\u00fa"+
		"\6\u00fa\u0ad7\n\u00fa\r\u00fa\16\u00fa\u0ad8\3\u00fa\3\u00fa\3\u00fb"+
		"\3\u00fb\3\u00fb\3\u00fb\3\u00fb\3\u00fc\3\u00fc\3\u00fc\3\u00fc\5\u00fc"+
		"\u0ae6\n\u00fc\3\u00fc\3\u00fc\6\u00fc\u0aea\n\u00fc\r\u00fc\16\u00fc"+
		"\u0aeb\7\u00fc\u0aee\n\u00fc\f\u00fc\16\u00fc\u0af1\13\u00fc\3\u00fd\3"+
		"\u00fd\3\u00fd\3\u00fd\3\u00fd\5\u00fd\u0af8\n\u00fd\3\u00fe\6\u00fe\u0afb"+
		"\n\u00fe\r\u00fe\16\u00fe\u0afc\3\u00fe\3\u0afc\31(P\\bdr\u00ba\u00ec"+
		"\u013a\u016a\u0176\u0184\u0190\u0192\u0196\u019e\u01aa\u01b0\u01b2\u01ba"+
		"\u01c6\u01cc\u01f6\u00ff\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&("+
		"*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4"+
		"\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc"+
		"\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4"+
		"\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc"+
		"\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114"+
		"\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c"+
		"\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144"+
		"\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c"+
		"\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e\u0170\u0172\u0174"+
		"\u0176\u0178\u017a\u017c\u017e\u0180\u0182\u0184\u0186\u0188\u018a\u018c"+
		"\u018e\u0190\u0192\u0194\u0196\u0198\u019a\u019c\u019e\u01a0\u01a2\u01a4"+
		"\u01a6\u01a8\u01aa\u01ac\u01ae\u01b0\u01b2\u01b4\u01b6\u01b8\u01ba\u01bc"+
		"\u01be\u01c0\u01c2\u01c4\u01c6\u01c8\u01ca\u01cc\u01ce\u01d0\u01d2\u01d4"+
		"\u01d6\u01d8\u01da\u01dc\u01de\u01e0\u01e2\u01e4\u01e6\u01e8\u01ea\u01ec"+
		"\u01ee\u01f0\u01f2\u01f4\u01f6\u01f8\u01fa\2\16\3\2[\\\3\2\"#\4\2\3\3"+
		"\7\t\5\2ss\u0093\u0093\u00ad\u00ad\4\2[[\u00ad\u00ad\4\2\u0096\u0096\u00ad"+
		"\u00ad\4\2\u0092\u0092\u009c\u009c\4\2RRbb\t\2\13\20\67\679ACJLwy\u009a"+
		"\u009c\u00a6\4\2\'\'}}\5\2\32\33))++\3\2\22\22\2\u0bab\2\u01fc\3\2\2\2"+
		"\4\u020d\3\2\2\2\6\u0217\3\2\2\2\b\u021b\3\2\2\2\n\u0223\3\2\2\2\f\u0241"+
		"\3\2\2\2\16\u0248\3\2\2\2\20\u0257\3\2\2\2\22\u0264\3\2\2\2\24\u027c\3"+
		"\2\2\2\26\u0289\3\2\2\2\30\u028b\3\2\2\2\32\u029a\3\2\2\2\34\u02a4\3\2"+
		"\2\2\36\u02b1\3\2\2\2 \u02bb\3\2\2\2\"\u02c9\3\2\2\2$\u02de\3\2\2\2&\u02f2"+
		"\3\2\2\2(\u02fa\3\2\2\2*\u0306\3\2\2\2,\u0315\3\2\2\2.\u032b\3\2\2\2\60"+
		"\u033e\3\2\2\2\62\u0351\3\2\2\2\64\u0353\3\2\2\2\66\u0374\3\2\2\28\u0376"+
		"\3\2\2\2:\u038b\3\2\2\2<\u0395\3\2\2\2>\u039f\3\2\2\2@\u03ae\3\2\2\2B"+
		"\u03b5\3\2\2\2D\u03bc\3\2\2\2F\u03dc\3\2\2\2H\u03de\3\2\2\2J\u03eb\3\2"+
		"\2\2L\u03f4\3\2\2\2N\u03fb\3\2\2\2P\u040f\3\2\2\2R\u0427\3\2\2\2T\u042a"+
		"\3\2\2\2V\u045b\3\2\2\2X\u045d\3\2\2\2Z\u045f\3\2\2\2\\\u0478\3\2\2\2"+
		"^\u04f0\3\2\2\2`\u04f8\3\2\2\2b\u04fa\3\2\2\2d\u0504\3\2\2\2f\u0518\3"+
		"\2\2\2h\u0526\3\2\2\2j\u0528\3\2\2\2l\u052f\3\2\2\2n\u0548\3\2\2\2p\u054a"+
		"\3\2\2\2r\u0554\3\2\2\2t\u055e\3\2\2\2v\u0564\3\2\2\2x\u0569\3\2\2\2z"+
		"\u058f\3\2\2\2|\u05bf\3\2\2\2~\u05c1\3\2\2\2\u0080\u05d0\3\2\2\2\u0082"+
		"\u05dc\3\2\2\2\u0084\u05de\3\2\2\2\u0086\u05e5\3\2\2\2\u0088\u05e9\3\2"+
		"\2\2\u008a\u05f0\3\2\2\2\u008c\u05f4\3\2\2\2\u008e\u05fd\3\2\2\2\u0090"+
		"\u0602\3\2\2\2\u0092\u0604\3\2\2\2\u0094\u0609\3\2\2\2\u0096\u060c\3\2"+
		"\2\2\u0098\u0611\3\2\2\2\u009a\u061f\3\2\2\2\u009c\u0632\3\2\2\2\u009e"+
		"\u0643\3\2\2\2\u00a0\u0645\3\2\2\2\u00a2\u0649\3\2\2\2\u00a4\u064d\3\2"+
		"\2\2\u00a6\u064f\3\2\2\2\u00a8\u0653\3\2\2\2\u00aa\u0655\3\2\2\2\u00ac"+
		"\u065e\3\2\2\2\u00ae\u0667\3\2\2\2\u00b0\u0679\3\2\2\2\u00b2\u067c\3\2"+
		"\2\2\u00b4\u0685\3\2\2\2\u00b6\u068d\3\2\2\2\u00b8\u0695\3\2\2\2\u00ba"+
		"\u06a7\3\2\2\2\u00bc\u06b7\3\2\2\2\u00be\u06ca\3\2\2\2\u00c0\u06cc\3\2"+
		"\2\2\u00c2\u06cf\3\2\2\2\u00c4\u06d3\3\2\2\2\u00c6\u06d8\3\2\2\2\u00c8"+
		"\u06dc\3\2\2\2\u00ca\u06de\3\2\2\2\u00cc\u06e8\3\2\2\2\u00ce\u06ec\3\2"+
		"\2\2\u00d0\u06ee\3\2\2\2\u00d2\u06f2\3\2\2\2\u00d4\u06f8\3\2\2\2\u00d6"+
		"\u06fa\3\2\2\2\u00d8\u06fc\3\2\2\2\u00da\u06fe\3\2\2\2\u00dc\u0700\3\2"+
		"\2\2\u00de\u0702\3\2\2\2\u00e0\u0704\3\2\2\2\u00e2\u0711\3\2\2\2\u00e4"+
		"\u0715\3\2\2\2\u00e6\u0717\3\2\2\2\u00e8\u071c\3\2\2\2\u00ea\u0721\3\2"+
		"\2\2\u00ec\u0723\3\2\2\2\u00ee\u0731\3\2\2\2\u00f0\u073f\3\2\2\2\u00f2"+
		"\u0751\3\2\2\2\u00f4\u075d\3\2\2\2\u00f6\u0769\3\2\2\2\u00f8\u076b\3\2"+
		"\2\2\u00fa\u076f\3\2\2\2\u00fc\u077a\3\2\2\2\u00fe\u0785\3\2\2\2\u0100"+
		"\u0797\3\2\2\2\u0102\u079f\3\2\2\2\u0104\u07ab\3\2\2\2\u0106\u07ad\3\2"+
		"\2\2\u0108\u07af\3\2\2\2\u010a\u07c2\3\2\2\2\u010c\u07c4\3\2\2\2\u010e"+
		"\u07cb\3\2\2\2\u0110\u07d2\3\2\2\2\u0112\u07db\3\2\2\2\u0114\u07e4\3\2"+
		"\2\2\u0116\u07ed\3\2\2\2\u0118\u0804\3\2\2\2\u011a\u0817\3\2\2\2\u011c"+
		"\u0819\3\2\2\2\u011e\u0821\3\2\2\2\u0120\u0826\3\2\2\2\u0122\u082a\3\2"+
		"\2\2\u0124\u0830\3\2\2\2\u0126\u0838\3\2\2\2\u0128\u083b\3\2\2\2\u012a"+
		"\u0844\3\2\2\2\u012c\u0850\3\2\2\2\u012e\u0856\3\2\2\2\u0130\u0862\3\2"+
		"\2\2\u0132\u086a\3\2\2\2\u0134\u0870\3\2\2\2\u0136\u087b\3\2\2\2\u0138"+
		"\u087d\3\2\2\2\u013a\u0881\3\2\2\2\u013c\u088f\3\2\2\2\u013e\u0899\3\2"+
		"\2\2\u0140\u089b\3\2\2\2\u0142\u08a6\3\2\2\2\u0144\u08aa\3\2\2\2\u0146"+
		"\u08ac\3\2\2\2\u0148\u08b1\3\2\2\2\u014a\u08b6\3\2\2\2\u014c\u08bb\3\2"+
		"\2\2\u014e\u08c3\3\2\2\2\u0150\u08d4\3\2\2\2\u0152\u08d6\3\2\2\2\u0154"+
		"\u08d8\3\2\2\2\u0156\u08db\3\2\2\2\u0158\u08de\3\2\2\2\u015a\u08e1\3\2"+
		"\2\2\u015c\u08e4\3\2\2\2\u015e\u08e7\3\2\2\2\u0160\u08e9\3\2\2\2\u0162"+
		"\u08eb\3\2\2\2\u0164\u08ed\3\2\2\2\u0166\u08ef\3\2\2\2\u0168\u08f8\3\2"+
		"\2\2\u016a\u08fa\3\2\2\2\u016c\u090b\3\2\2\2\u016e\u090d\3\2\2\2\u0170"+
		"\u090f\3\2\2\2\u0172\u0917\3\2\2\2\u0174\u0919\3\2\2\2\u0176\u0920\3\2"+
		"\2\2\u0178\u092b\3\2\2\2\u017a\u092f\3\2\2\2\u017c\u0933\3\2\2\2\u017e"+
		"\u093a\3\2\2\2\u0180\u0941\3\2\2\2\u0182\u0946\3\2\2\2\u0184\u0948\3\2"+
		"\2\2\u0186\u0957\3\2\2\2\u0188\u0959\3\2\2\2\u018a\u0961\3\2\2\2\u018c"+
		"\u0963\3\2\2\2\u018e\u0970\3\2\2\2\u0190\u0972\3\2\2\2\u0192\u097d\3\2"+
		"\2\2\u0194\u098d\3\2\2\2\u0196\u0994\3\2\2\2\u0198\u09a3\3\2\2\2\u019a"+
		"\u09aa\3\2\2\2\u019c\u09b3\3\2\2\2\u019e\u09b5\3\2\2\2\u01a0\u09c4\3\2"+
		"\2\2\u01a2\u09c6\3\2\2\2\u01a4\u09c8\3\2\2\2\u01a6\u09ce\3\2\2\2\u01a8"+
		"\u09d0\3\2\2\2\u01aa\u09d7\3\2\2\2\u01ac\u09e2\3\2\2\2\u01ae\u09e6\3\2"+
		"\2\2\u01b0\u09ea\3\2\2\2\u01b2\u09f5\3\2\2\2\u01b4\u0a04\3\2\2\2\u01b6"+
		"\u0a0b\3\2\2\2\u01b8\u0a14\3\2\2\2\u01ba\u0a16\3\2\2\2\u01bc\u0a25\3\2"+
		"\2\2\u01be\u0a27\3\2\2\2\u01c0\u0a29\3\2\2\2\u01c2\u0a2f\3\2\2\2\u01c4"+
		"\u0a31\3\2\2\2\u01c6\u0a38\3\2\2\2\u01c8\u0a43\3\2\2\2\u01ca\u0a47\3\2"+
		"\2\2\u01cc\u0a4e\3\2\2\2\u01ce\u0a5d\3\2\2\2\u01d0\u0a64\3\2\2\2\u01d2"+
		"\u0a68\3\2\2\2\u01d4\u0a71\3\2\2\2\u01d6\u0a73\3\2\2\2\u01d8\u0a7e\3\2"+
		"\2\2\u01da\u0a80\3\2\2\2\u01dc\u0a84\3\2\2\2\u01de\u0a90\3\2\2\2\u01e0"+
		"\u0a9b\3\2\2\2\u01e2\u0aa0\3\2\2\2\u01e4\u0aa8\3\2\2\2\u01e6\u0aaf\3\2"+
		"\2\2\u01e8\u0abb\3\2\2\2\u01ea\u0abe\3\2\2\2\u01ec\u0ac9\3\2\2\2\u01ee"+
		"\u0acc\3\2\2\2\u01f0\u0ad2\3\2\2\2\u01f2\u0ad4\3\2\2\2\u01f4\u0adc\3\2"+
		"\2\2\u01f6\u0ae5\3\2\2\2\u01f8\u0af7\3\2\2\2\u01fa\u0afa\3\2\2\2\u01fc"+
		"\u01fd\7g\2\2\u01fd\u01fe\5\u00dco\2\u01fe\u0205\7\26\2\2\u01ff\u0202"+
		"\5\u00dco\2\u0200\u0201\7\23\2\2\u0201\u0203\5\u0102\u0082\2\u0202\u0200"+
		"\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0206\3\2\2\2\u0204\u0206\5\u0102\u0082"+
		"\2\u0205\u01ff\3\2\2\2\u0205\u0204\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u0208"+
		"\7\27\2\2\u0208\u0209\7\21\2\2\u0209\u020a\5\u008cG\2\u020a\u020b\5\u00ac"+
		"W\2\u020b\u020c\5\u008eH\2\u020c\3\3\2\2\2\u020d\u020e\7g\2\2\u020e\u020f"+
		"\5\u00dco\2\u020f\u0210\7\26\2\2\u0210\u0211\5\u00be`\2\u0211\u0212\7"+
		"\27\2\2\u0212\u0213\7\21\2\2\u0213\u0214\5\u008cG\2\u0214\u0215\5\u00aa"+
		"V\2\u0215\u0216\5\u008eH\2\u0216\5\3\2\2\2\u0217\u0218\5\u00dep\2\u0218"+
		"\u0219\7/\2\2\u0219\u021a\5\\/\2\u021a\7\3\2\2\2\u021b\u021c\5\u00dep"+
		"\2\u021c\u021e\7\26\2\2\u021d\u021f\5r:\2\u021e\u021d\3\2\2\2\u021e\u021f"+
		"\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0221\7\27\2\2\u0221\t\3\2\2\2\u0222"+
		"\u0224\7\u0096\2\2\u0223\u0222\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0225"+
		"\3\2\2\2\u0225\u0226\7S\2\2\u0226\u0227\5\u00dan\2\u0227\u0228\7\26\2"+
		"\2\u0228\u0229\5\u00ba^\2\u0229\u023f\7\27\2\2\u022a\u022b\7\21\2\2\u022b"+
		"\u023b\5\u008cG\2\u022c\u023c\7\u008a\2\2\u022d\u0231\5\u00b0Y\2\u022e"+
		"\u022f\5\u0088E\2\u022f\u0230\5\f\7\2\u0230\u0232\3\2\2\2\u0231\u022e"+
		"\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u023a\3\2\2\2\u0233\u0237\5\f\7\2\u0234"+
		"\u0235\5\u0088E\2\u0235\u0236\5\u00b0Y\2\u0236\u0238\3\2\2\2\u0237\u0234"+
		"\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u023a\3\2\2\2\u0239\u022d\3\2\2\2\u0239"+
		"\u0233\3\2\2\2\u023a\u023c\3\2\2\2\u023b\u022c\3\2\2\2\u023b\u0239\3\2"+
		"\2\2\u023c\u023d\3\2\2\2\u023d\u023e\5\u008eH\2\u023e\u0240\3\2\2\2\u023f"+
		"\u022a\3\2\2\2\u023f\u0240\3\2\2\2\u0240\13\3\2\2\2\u0241\u0242\7w\2\2"+
		"\u0242\u0244\7\26\2\2\u0243\u0245\5\u0100\u0081\2\u0244\u0243\3\2\2\2"+
		"\u0244\u0245\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0247\7\27\2\2\u0247\r"+
		"\3\2\2\2\u0248\u0249\7\u00a1\2\2\u0249\u024a\5\u00dco\2\u024a\u024c\7"+
		"\26\2\2\u024b\u024d\5\u00dco\2\u024c\u024b\3\2\2\2\u024c\u024d\3\2\2\2"+
		"\u024d\u024e\3\2\2\2\u024e\u024f\7\27\2\2\u024f\u0250\7\21\2\2\u0250\u0253"+
		"\5\u008cG\2\u0251\u0254\5\u00eex\2\u0252\u0254\7\u008a\2\2\u0253\u0251"+
		"\3\2\2\2\u0253\u0252\3\2\2\2\u0254\u0255\3\2\2\2\u0255\u0256\5\u008eH"+
		"\2\u0256\17\3\2\2\2\u0257\u0258\7\177\2\2\u0258\u0259\7\u00a1\2\2\u0259"+
		"\u025a\5\u00dco\2\u025a\u025b\7\26\2\2\u025b\u025c\7\27\2\2\u025c\u025d"+
		"\7\21\2\2\u025d\u025e\5\u008cG\2\u025e\u025f\5&\24\2\u025f\u0260\5\u0088"+
		"E\2\u0260\u0261\5\u00f2z\2\u0261\u0262\5\u008eH\2\u0262\21\3\2\2\2\u0263"+
		"\u0265\7\u0096\2\2\u0264\u0263\3\2\2\2\u0264\u0265\3\2\2\2\u0265\u0266"+
		"\3\2\2\2\u0266\u0267\t\2\2\2\u0267\u0268\5\u00dco\2\u0268\u026f\7\26\2"+
		"\2\u0269\u0270\5\26\f\2\u026a\u0270\5\u0102\u0082\2\u026b\u026c\5\26\f"+
		"\2\u026c\u026d\7\23\2\2\u026d\u026e\5\u0102\u0082\2\u026e\u0270\3\2\2"+
		"\2\u026f\u0269\3\2\2\2\u026f\u026a\3\2\2\2\u026f\u026b\3\2\2\2\u0270\u0271"+
		"\3\2\2\2\u0271\u027a\7\27\2\2\u0272\u0273\7\21\2\2\u0273\u0276\5\u008c"+
		"G\2\u0274\u0277\5\u00eex\2\u0275\u0277\7\u008a\2\2\u0276\u0274\3\2\2\2"+
		"\u0276\u0275\3\2\2\2\u0277\u0278\3\2\2\2\u0278\u0279\5\u008eH\2\u0279"+
		"\u027b\3\2\2\2\u027a\u0272\3\2\2\2\u027a\u027b\3\2\2\2\u027b\23\3\2\2"+
		"\2\u027c\u027d\7\u0094\2\2\u027d\u027e\5\u00dco\2\u027e\u027f\7\26\2\2"+
		"\u027f\u0280\5\u0102\u0082\2\u0280\u0281\7\27\2\2\u0281\u0282\7\21\2\2"+
		"\u0282\u0285\5\u008cG\2\u0283\u0286\5\u00eex\2\u0284\u0286\7\u008a\2\2"+
		"\u0285\u0283\3\2\2\2\u0285\u0284\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u0288"+
		"\5\u008eH\2\u0288\25\3\2\2\2\u0289\u028a\5\u00caf\2\u028a\27\3\2\2\2\u028b"+
		"\u028c\7^\2\2\u028c\u028d\7\u0086\2\2\u028d\u028e\5\u0150\u00a9\2\u028e"+
		"\u028f\7\26\2\2\u028f\u0290\5\u00e4s\2\u0290\u0293\7\27\2\2\u0291\u0292"+
		"\7\65\2\2\u0292\u0294\5\u00ba^\2\u0293\u0291\3\2\2\2\u0293\u0294\3\2\2"+
		"\2\u0294\u0295\3\2\2\2\u0295\u0296\7\21\2\2\u0296\u0297\5\u008cG\2\u0297"+
		"\u0298\5\u0110\u0089\2\u0298\u0299\5\u008eH\2\u0299\31\3\2\2\2\u029a\u029b"+
		"\7^\2\2\u029b\u029c\5\u00d8m\2\u029c\u029d\7\u0093\2\2\u029d\u029e\7\26"+
		"\2\2\u029e\u029f\7\27\2\2\u029f\u02a0\7\21\2\2\u02a0\u02a1\5\u008cG\2"+
		"\u02a1\u02a2\5\u0110\u0089\2\u02a2\u02a3\5\u008eH\2\u02a3\33\3\2\2\2\u02a4"+
		"\u02a5\7^\2\2\u02a5\u02a7\5\u00d8m\2\u02a6\u02a8\7\177\2\2\u02a7\u02a6"+
		"\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02aa\7\u0093\2"+
		"\2\u02aa\u02ab\7\26\2\2\u02ab\u02ac\7\27\2\2\u02ac\u02ad\7\21\2\2\u02ad"+
		"\u02ae\5\u008cG\2\u02ae\u02af\5\u0108\u0085\2\u02af\u02b0\5\u008eH\2\u02b0"+
		"\35\3\2\2\2\u02b1\u02b2\7^\2\2\u02b2\u02b3\5\u00d8m\2\u02b3\u02b4\7s\2"+
		"\2\u02b4\u02b5\7\26\2\2\u02b5\u02b6\7\27\2\2\u02b6\u02b7\7\21\2\2\u02b7"+
		"\u02b8\5\u008cG\2\u02b8\u02b9\5\u0110\u0089\2\u02b9\u02ba\5\u008eH\2\u02ba"+
		"\37\3\2\2\2\u02bb\u02bc\7^\2\2\u02bc\u02be\5\u00d8m\2\u02bd\u02bf\7\177"+
		"\2\2\u02be\u02bd\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0"+
		"\u02c1\7s\2\2\u02c1\u02c2\7\26\2\2\u02c2\u02c3\7\27\2\2\u02c3\u02c4\7"+
		"\21\2\2\u02c4\u02c5\5\u008cG\2\u02c5\u02c6\5\u0108\u0085\2\u02c6\u02c7"+
		"\5\u008eH\2\u02c7!\3\2\2\2\u02c8\u02ca\7\u0096\2\2\u02c9\u02c8\3\2\2\2"+
		"\u02c9\u02ca\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02cc\7\177\2\2\u02cc\u02cd"+
		"\t\2\2\2\u02cd\u02ce\5\u00dco\2\u02ce\u02d0\7\26\2\2\u02cf\u02d1\5\u0102"+
		"\u0082\2\u02d0\u02cf\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2"+
		"\u02d3\7\27\2\2\u02d3\u02d4\7\21\2\2\u02d4\u02d5\5\u008cG\2\u02d5\u02d9"+
		"\5&\24\2\u02d6\u02d7\5\u0088E\2\u02d7\u02d8\5\u00f2z\2\u02d8\u02da\3\2"+
		"\2\2\u02d9\u02d6\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02db\3\2\2\2\u02db"+
		"\u02dc\5\u008eH\2\u02dc#\3\2\2\2\u02dd\u02df\7\u0096\2\2\u02de\u02dd\3"+
		"\2\2\2\u02de\u02df\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0\u02e1\7\177\2\2\u02e1"+
		"\u02e2\7\u008e\2\2\u02e2\u02e3\5\u00dco\2\u02e3\u02e5\7\26\2\2\u02e4\u02e6"+
		"\5\u0102\u0082\2\u02e5\u02e4\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6\u02e7\3"+
		"\2\2\2\u02e7\u02e8\7\27\2\2\u02e8\u02e9\7\21\2\2\u02e9\u02ea\5\u008cG"+
		"\2\u02ea\u02ee\5&\24\2\u02eb\u02ec\5\u0088E\2\u02ec\u02ed\5\u00f2z\2\u02ed"+
		"\u02ef\3\2\2\2\u02ee\u02eb\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef\u02f0\3\2"+
		"\2\2\u02f0\u02f1\5\u008eH\2\u02f1%\3\2\2\2\u02f2\u02f3\7^\2\2\u02f3\u02f4"+
		"\t\2\2\2\u02f4\u02f5\7V\2\2\u02f5\u02f6\7\21\2\2\u02f6\u02f7\5\u008cG"+
		"\2\u02f7\u02f8\5(\25\2\u02f8\u02f9\5\u008eH\2\u02f9\'\3\2\2\2\u02fa\u02fb"+
		"\b\25\1\2\u02fb\u02fc\5\u00f6|\2\u02fc\u0303\3\2\2\2\u02fd\u02fe\f\3\2"+
		"\2\u02fe\u02ff\5\u0088E\2\u02ff\u0300\5\u00f6|\2\u0300\u0302\3\2\2\2\u0301"+
		"\u02fd\3\2\2\2\u0302\u0305\3\2\2\2\u0303\u0301\3\2\2\2\u0303\u0304\3\2"+
		"\2\2\u0304)\3\2\2\2\u0305\u0303\3\2\2\2\u0306\u0307\7L\2\2\u0307\u0308"+
		"\7^\2\2\u0308\u0309\5\u00ccg\2\u0309\u030b\7\26\2\2\u030a\u030c\5\u00e0"+
		"q\2\u030b\u030a\3\2\2\2\u030b\u030c\3\2\2\2\u030c\u030d\3\2\2\2\u030d"+
		"\u0313\7\27\2\2\u030e\u0310\7\65\2\2\u030f\u0311\7~\2\2\u0310\u030f\3"+
		"\2\2\2\u0310\u0311\3\2\2\2\u0311\u0312\3\2\2\2\u0312\u0314\5\u00ba^\2"+
		"\u0313\u030e\3\2\2\2\u0313\u0314\3\2\2\2\u0314+\3\2\2\2\u0315\u0316\7"+
		"^\2\2\u0316\u0317\5\u00ccg\2\u0317\u0319\7\26\2\2\u0318\u031a\5\u00e0"+
		"q\2\u0319\u0318\3\2\2\2\u0319\u031a\3\2\2\2\u031a\u031b\3\2\2\2\u031b"+
		"\u0321\7\27\2\2\u031c\u031e\7\65\2\2\u031d\u031f\7~\2\2\u031e\u031d\3"+
		"\2\2\2\u031e\u031f\3\2\2\2\u031f\u0320\3\2\2\2\u0320\u0322\5\u00ba^\2"+
		"\u0321\u031c\3\2\2\2\u0321\u0322\3\2\2\2\u0322\u0323\3\2\2\2\u0323\u0324"+
		"\7\21\2\2\u0324\u0327\5\u008cG\2\u0325\u0328\5\u0110\u0089\2\u0326\u0328"+
		"\7\u008a\2\2\u0327\u0325\3\2\2\2\u0327\u0326\3\2\2\2\u0328\u0329\3\2\2"+
		"\2\u0329\u032a\5\u008eH\2\u032a-\3\2\2\2\u032b\u032d\7^\2\2\u032c\u032e"+
		"\7\177\2\2\u032d\u032c\3\2\2\2\u032d\u032e\3\2\2\2\u032e\u032f\3\2\2\2"+
		"\u032f\u0330\5\u00ccg\2\u0330\u0332\7\26\2\2\u0331\u0333\5\u00e0q\2\u0332"+
		"\u0331\3\2\2\2\u0332\u0333\3\2\2\2\u0333\u0334\3\2\2\2\u0334\u0337\7\27"+
		"\2\2\u0335\u0336\7\65\2\2\u0336\u0338\5\u00eav\2\u0337\u0335\3\2\2\2\u0337"+
		"\u0338\3\2\2\2\u0338\u0339\3\2\2\2\u0339\u033a\7\21\2\2\u033a\u033b\5"+
		"\u008cG\2\u033b\u033c\5\u0108\u0085\2\u033c\u033d\5\u008eH\2\u033d/\3"+
		"\2\2\2\u033e\u033f\7^\2\2\u033f\u0340\7\u009a\2\2\u0340\u0341\7\u00b1"+
		"\2\2\u0341\u0342\7\26\2\2\u0342\u0343\7\27\2\2\u0343\u0344\7\21\2\2\u0344"+
		"\u0345\5\u008cG\2\u0345\u0346\5\u0110\u0089\2\u0346\u0347\5\u008eH\2\u0347"+
		"\u0348\5\u0088E\2\u0348\u0349\7\u00a0\2\2\u0349\u034f\7\21\2\2\u034a\u034b"+
		"\5\u008cG\2\u034b\u034c\5\u0112\u008a\2\u034c\u034d\5\u008eH\2\u034d\u0350"+
		"\3\2\2\2\u034e\u0350\5\u00dep\2\u034f\u034a\3\2\2\2\u034f\u034e\3\2\2"+
		"\2\u0350\61\3\2\2\2\u0351\u0352\5\\/\2\u0352\63\3\2\2\2\u0353\u0354\5"+
		"\u00d8m\2\u0354\u0355\7\21\2\2\u0355\u035a\5\u00eav\2\u0356\u0357\7\26"+
		"\2\2\u0357\u0358\5\u0102\u0082\2\u0358\u0359\7\27\2\2\u0359\u035b\3\2"+
		"\2\2\u035a\u0356\3\2\2\2\u035a\u035b\3\2\2\2\u035b\u035e\3\2\2\2\u035c"+
		"\u035d\7/\2\2\u035d\u035f\5\u0124\u0093\2\u035e\u035c\3\2\2\2\u035e\u035f"+
		"\3\2\2\2\u035f\65\3\2\2\2\u0360\u0375\5> \2\u0361\u0375\5\u0080A\2\u0362"+
		"\u0375\5\u0084C\2\u0363\u0375\5:\36\2\u0364\u0375\5|?\2\u0365\u0375\5"+
		"8\35\2\u0366\u0375\5X-\2\u0367\u0375\5Z.\2\u0368\u0375\5N(\2\u0369\u0375"+
		"\5D#\2\u036a\u0375\5H%\2\u036b\u0375\5L\'\2\u036c\u0375\5J&\2\u036d\u0375"+
		"\5R*\2\u036e\u0375\5T+\2\u036f\u0375\5v<\2\u0370\u0375\5@!\2\u0371\u0375"+
		"\5B\"\2\u0372\u0375\5,\27\2\u0373\u0375\5\u0106\u0084\2\u0374\u0360\3"+
		"\2\2\2\u0374\u0361\3\2\2\2\u0374\u0362\3\2\2\2\u0374\u0363\3\2\2\2\u0374"+
		"\u0364\3\2\2\2\u0374\u0365\3\2\2\2\u0374\u0366\3\2\2\2\u0374\u0367\3\2"+
		"\2\2\u0374\u0368\3\2\2\2\u0374\u0369\3\2\2\2\u0374\u036a\3\2\2\2\u0374"+
		"\u036b\3\2\2\2\u0374\u036c\3\2\2\2\u0374\u036d\3\2\2\2\u0374\u036e\3\2"+
		"\2\2\u0374\u036f\3\2\2\2\u0374\u0370\3\2\2\2\u0374\u0371\3\2\2\2\u0374"+
		"\u0372\3\2\2\2\u0374\u0373\3\2\2\2\u0375\67\3\2\2\2\u0376\u0377\7p\2\2"+
		"\u0377\u0378\7\26\2\2\u0378\u0379\7\27\2\2\u03799\3\2\2\2\u037a\u037b"+
		"\7a\2\2\u037b\u037c\7\26\2\2\u037c\u037d\5\u00b6\\\2\u037d\u0384\7\27"+
		"\2\2\u037e\u037f\7O\2\2\u037f\u0380\7\u0097\2\2\u0380\u0381\7\26\2\2\u0381"+
		"\u0382\5\u00b6\\\2\u0382\u0383\7\27\2\2\u0383\u0385\3\2\2\2\u0384\u037e"+
		"\3\2\2\2\u0384\u0385\3\2\2\2\u0385\u038c\3\2\2\2\u0386\u0387\7\u0097\2"+
		"\2\u0387\u0388\7\26\2\2\u0388\u0389\5\u00b6\\\2\u0389\u038a\7\27\2\2\u038a"+
		"\u038c\3\2\2\2\u038b\u037a\3\2\2\2\u038b\u0386\3\2\2\2\u038c\u0393\3\2"+
		"\2\2\u038d\u038e\7\u009b\2\2\u038e\u038f\7\21\2\2\u038f\u0390\5\u008c"+
		"G\2\u0390\u0391\5\u0110\u0089\2\u0391\u0392\5\u008eH\2\u0392\u0394\3\2"+
		"\2\2\u0393\u038d\3\2\2\2\u0393\u0394\3\2\2\2\u0394;\3\2\2\2\u0395\u0396"+
		"\5\u00ccg\2\u0396\u0398\7\26\2\2\u0397\u0399\5r:\2\u0398\u0397\3\2\2\2"+
		"\u0398\u0399\3\2\2\2\u0399\u039a\3\2\2\2\u039a\u039b\7\27\2\2\u039b=\3"+
		"\2\2\2\u039c\u039d\5b\62\2\u039d\u039e\7\25\2\2\u039e\u03a0\3\2\2\2\u039f"+
		"\u039c\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1\u03ac\5<"+
		"\37\2\u03a2\u03a5\7\u009b\2\2\u03a3\u03a4\7\u00a2\2\2\u03a4\u03a6\5\u00d8"+
		"m\2\u03a5\u03a3\3\2\2\2\u03a5\u03a6\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7"+
		"\u03a8\7\21\2\2\u03a8\u03a9\5\u008cG\2\u03a9\u03aa\5\u0110\u0089\2\u03aa"+
		"\u03ab\5\u008eH\2\u03ab\u03ad\3\2\2\2\u03ac\u03a2\3\2\2\2\u03ac\u03ad"+
		"\3\2\2\2\u03ad?\3\2\2\2\u03ae\u03af\7\u00a2\2\2\u03af\u03b0\5\u0138\u009d"+
		"\2\u03b0\u03b1\7\21\2\2\u03b1\u03b2\5\u008cG\2\u03b2\u03b3\5\u0110\u0089"+
		"\2\u03b3\u03b4\5\u008eH\2\u03b4A\3\2\2\2\u03b5\u03b6\7\u00a2\2\2\u03b6"+
		"\u03b7\5\u00dco\2\u03b7\u03b8\7\21\2\2\u03b8\u03b9\5\u008cG\2\u03b9\u03ba"+
		"\5\u0110\u0089\2\u03ba\u03bb\5\u008eH\2\u03bbC\3\2\2\2\u03bc\u03bd\7\u0099"+
		"\2\2\u03bd\u03be\7\u0084\2\2\u03be\u03bf\5\\/\2\u03bf\u03c0\7\21\2\2\u03c0"+
		"\u03c1\5\u008cG\2\u03c1\u03c9\5\u0114\u008b\2\u03c2\u03c3\5\u0088E\2\u03c3"+
		"\u03c4\7\u0089\2\2\u03c4\u03c5\7\21\2\2\u03c5\u03c6\5\u008cG\2\u03c6\u03c7"+
		"\5\u0110\u0089\2\u03c7\u03c8\5\u008eH\2\u03c8\u03ca\3\2\2\2\u03c9\u03c2"+
		"\3\2\2\2\u03c9\u03ca\3\2\2\2\u03ca\u03cb\3\2\2\2\u03cb\u03cc\5\u008eH"+
		"\2\u03ccE\3\2\2\2\u03cd\u03ce\7\u00a3\2\2\u03ce\u03cf\5\u011a\u008e\2"+
		"\u03cf\u03d0\7\21\2\2\u03d0\u03d1\5\u008cG\2\u03d1\u03d2\5\u0110\u0089"+
		"\2\u03d2\u03d3\5\u008eH\2\u03d3\u03dd\3\2\2\2\u03d4\u03d5\7\u00a3\2\2"+
		"\u03d5\u03d6\7v\2\2\u03d6\u03d7\5\u0118\u008d\2\u03d7\u03d8\7\21\2\2\u03d8"+
		"\u03d9\5\u008cG\2\u03d9\u03da\5\u0110\u0089\2\u03da\u03db\5\u008eH\2\u03db"+
		"\u03dd\3\2\2\2\u03dc\u03cd\3\2\2\2\u03dc\u03d4\3\2\2\2\u03ddG\3\2\2\2"+
		"\u03de\u03df\7q\2\2\u03df\u03e2\5\u00d8m\2\u03e0\u03e1\7\23\2\2\u03e1"+
		"\u03e3\5\u00d8m\2\u03e2\u03e0\3\2\2\2\u03e2\u03e3\3\2\2\2\u03e3\u03e4"+
		"\3\2\2\2\u03e4\u03e5\7v\2\2\u03e5\u03e6\5\\/\2\u03e6\u03e7\7\21\2\2\u03e7"+
		"\u03e8\5\u008cG\2\u03e8\u03e9\5\u0110\u0089\2\u03e9\u03ea\5\u008eH\2\u03ea"+
		"I\3\2\2\2\u03eb\u03ec\7c\2\2\u03ec\u03ed\7\21\2\2\u03ed\u03ee\5\u008c"+
		"G\2\u03ee\u03ef\5\u0110\u0089\2\u03ef\u03f0\5\u008eH\2\u03f0\u03f1\5\u0088"+
		"E\2\u03f1\u03f2\7\u00a5\2\2\u03f2\u03f3\5\\/\2\u03f3K\3\2\2\2\u03f4\u03f5"+
		"\7\u00a5\2\2\u03f5\u03f6\5\\/\2\u03f6\u03f7\7\21\2\2\u03f7\u03f8\5\u008c"+
		"G\2\u03f8\u03f9\5\u0110\u0089\2\u03f9\u03fa\5\u008eH\2\u03faM\3\2\2\2"+
		"\u03fb\u03fc\7u\2\2\u03fc\u03fd\5\\/\2\u03fd\u03fe\7\21\2\2\u03fe\u03ff"+
		"\5\u008cG\2\u03ff\u0400\5\u0110\u0089\2\u0400\u0404\5\u008eH\2\u0401\u0402"+
		"\5\u0088E\2\u0402\u0403\5P)\2\u0403\u0405\3\2\2\2\u0404\u0401\3\2\2\2"+
		"\u0404\u0405\3\2\2\2\u0405\u040d\3\2\2\2\u0406\u0407\5\u0088E\2\u0407"+
		"\u0408\7f\2\2\u0408\u0409\7\21\2\2\u0409\u040a\5\u008cG\2\u040a\u040b"+
		"\5\u0110\u0089\2\u040b\u040c\5\u008eH\2\u040c\u040e\3\2\2\2\u040d\u0406"+
		"\3\2\2\2\u040d\u040e\3\2\2\2\u040eO\3\2\2\2\u040f\u0410\b)\1\2\u0410\u0411"+
		"\7f\2\2\u0411\u0412\7u\2\2\u0412\u0413\5\\/\2\u0413\u0414\7\21\2\2\u0414"+
		"\u0415\5\u008cG\2\u0415\u0416\5\u0110\u0089\2\u0416\u0417\5\u008eH\2\u0417"+
		"\u0424\3\2\2\2\u0418\u0419\f\3\2\2\u0419\u041a\5\u0088E\2\u041a\u041b"+
		"\7f\2\2\u041b\u041c\7u\2\2\u041c\u041d\5\\/\2\u041d\u041e\7\21\2\2\u041e"+
		"\u041f\5\u008cG\2\u041f\u0420\5\u0110\u0089\2\u0420\u0421\5\u008eH\2\u0421"+
		"\u0423\3\2\2\2\u0422\u0418\3\2\2\2\u0423\u0426\3\2\2\2\u0424\u0422\3\2"+
		"\2\2\u0424\u0425\3\2\2\2\u0425Q\3\2\2\2\u0426\u0424\3\2\2\2\u0427\u0428"+
		"\7\u008b\2\2\u0428\u0429\5\\/\2\u0429S\3\2\2\2\u042a\u042b\7\u009f\2\2"+
		"\u042b\u042c\5\u00d8m\2\u042c\u042d\7\21\2\2\u042d\u042e\5\u008cG\2\u042e"+
		"\u042f\5\u0110\u0089\2\u042f\u0430\5\u008eH\2\u0430\u0432\5\u0086D\2\u0431"+
		"\u0433\5\u0116\u008c\2\u0432\u0431\3\2\2\2\u0432\u0433\3\2\2\2\u0433\u043b"+
		"\3\2\2\2\u0434\u0435\7i\2\2\u0435\u0436\7\21\2\2\u0436\u0437\5\u008cG"+
		"\2\u0437\u0438\5\u0110\u0089\2\u0438\u0439\5\u008eH\2\u0439\u043a\5\u0086"+
		"D\2\u043a\u043c\3\2\2\2\u043b\u0434\3\2\2\2\u043b\u043c\3\2\2\2\u043c"+
		"\u0444\3\2\2\2\u043d\u043e\7o\2\2\u043e\u043f\7\21\2\2\u043f\u0440\5\u008c"+
		"G\2\u0440\u0441\5\u0110\u0089\2\u0441\u0442\5\u008eH\2\u0442\u0443\5\u0086"+
		"D\2\u0443\u0445\3\2\2\2\u0444\u043d\3\2\2\2\u0444\u0445\3\2\2\2\u0445"+
		"\u0446\3\2\2\2\u0446\u0447\5\u0086D\2\u0447U\3\2\2\2\u0448\u0449\7i\2"+
		"\2\u0449\u044a\5\u00dep\2\u044a\u044b\7\21\2\2\u044b\u044c\5\u008cG\2"+
		"\u044c\u044d\5\u0110\u0089\2\u044d\u044e\5\u008eH\2\u044e\u044f\5\u0086"+
		"D\2\u044f\u045c\3\2\2\2\u0450\u0451\7i\2\2\u0451\u0452\7v\2\2\u0452\u0453"+
		"\7\30\2\2\u0453\u0454\5\u00aeX\2\u0454\u0455\7\31\2\2\u0455\u0456\7\21"+
		"\2\2\u0456\u0457\5\u008cG\2\u0457\u0458\5\u0110\u0089\2\u0458\u0459\5"+
		"\u008eH\2\u0459\u045a\5\u0086D\2\u045a\u045c\3\2\2\2\u045b\u0448\3\2\2"+
		"\2\u045b\u0450\3\2\2\2\u045cW\3\2\2\2\u045d\u045e\7W\2\2\u045eY\3\2\2"+
		"\2\u045f\u0461\7\u008f\2\2\u0460\u0462\5\\/\2\u0461\u0460\3\2\2\2\u0461"+
		"\u0462\3\2\2\2\u0462[\3\2\2\2\u0463\u0464\b/\1\2\u0464\u0479\5\u01f2\u00fa"+
		"\2\u0465\u0479\5\u01d2\u00ea\2\u0466\u0479\5b\62\2\u0467\u0479\5d\63\2"+
		"\u0468\u0479\5\u013e\u00a0\2\u0469\u046a\7#\2\2\u046a\u0479\5\\/$\u046b"+
		"\u046c\7\u0081\2\2\u046c\u0479\5\\/#\u046d\u046e\7C\2\2\u046e\u046f\7"+
		"\26\2\2\u046f\u0470\5\\/\2\u0470\u0471\7\27\2\2\u0471\u0479\3\2\2\2\u0472"+
		"\u0473\7j\2\2\u0473\u0474\7\26\2\2\u0474\u0475\5\u00d8m\2\u0475\u0476"+
		"\7\27\2\2\u0476\u0479\3\2\2\2\u0477\u0479\5^\60\2\u0478\u0463\3\2\2\2"+
		"\u0478\u0465\3\2\2\2\u0478\u0466\3\2\2\2\u0478\u0467\3\2\2\2\u0478\u0468"+
		"\3\2\2\2\u0478\u0469\3\2\2\2\u0478\u046b\3\2\2\2\u0478\u046d\3\2\2\2\u0478"+
		"\u0472\3\2\2\2\u0478\u0477\3\2\2\2\u0479\u04ed\3\2\2\2\u047a\u047b\f\""+
		"\2\2\u047b\u047c\5\u0160\u00b1\2\u047c\u047d\5\\/#\u047d\u04ec\3\2\2\2"+
		"\u047e\u047f\f!\2\2\u047f\u0480\5\u0162\u00b2\2\u0480\u0481\5\\/\"\u0481"+
		"\u04ec\3\2\2\2\u0482\u0483\f \2\2\u0483\u0484\5\u0166\u00b4\2\u0484\u0485"+
		"\5\\/!\u0485\u04ec\3\2\2\2\u0486\u0487\f\37\2\2\u0487\u0488\5\u0164\u00b3"+
		"\2\u0488\u0489\5\\/ \u0489\u04ec\3\2\2\2\u048a\u048b\f\36\2\2\u048b\u048c"+
		"\t\3\2\2\u048c\u04ec\5\\/\37\u048d\u048e\f\34\2\2\u048e\u048f\7+\2\2\u048f"+
		"\u04ec\5\\/\35\u0490\u0491\f\33\2\2\u0491\u0492\7,\2\2\u0492\u04ec\5\\"+
		"/\34\u0493\u0494\f\32\2\2\u0494\u0495\7)\2\2\u0495\u04ec\5\\/\33\u0496"+
		"\u0497\f\31\2\2\u0497\u0498\7*\2\2\u0498\u04ec\5\\/\32\u0499\u049a\f\26"+
		"\2\2\u049a\u049b\7\61\2\2\u049b\u04ec\5\\/\27\u049c\u049d\f\25\2\2\u049d"+
		"\u049e\7\60\2\2\u049e\u04ec\5\\/\26\u049f\u04a0\f\24\2\2\u04a0\u04a1\7"+
		"\62\2\2\u04a1\u04ec\5\\/\25\u04a2\u04a3\f\23\2\2\u04a3\u04a4\7]\2\2\u04a4"+
		"\u04ec\5\\/\24\u04a5\u04a6\f\22\2\2\u04a6\u04a7\7v\2\2\u04a7\u04ec\5\\"+
		"/\23\u04a8\u04a9\f\21\2\2\u04a9\u04aa\7t\2\2\u04aa\u04ec\5\\/\22\u04ab"+
		"\u04ac\f\20\2\2\u04ac\u04ad\7t\2\2\u04ad\u04ae\7M\2\2\u04ae\u04ec\5\\"+
		"/\21\u04af\u04b0\f\17\2\2\u04b0\u04b1\7t\2\2\u04b1\u04b2\7P\2\2\u04b2"+
		"\u04ec\5\\/\20\u04b3\u04b4\f\16\2\2\u04b4\u04b5\7\u0081\2\2\u04b5\u04b6"+
		"\7]\2\2\u04b6\u04ec\5\\/\17\u04b7\u04b8\f\r\2\2\u04b8\u04b9\7\u0081\2"+
		"\2\u04b9\u04ba\7v\2\2\u04ba\u04ec\5\\/\16\u04bb\u04bc\f\f\2\2\u04bc\u04bd"+
		"\7\u0081\2\2\u04bd\u04be\7t\2\2\u04be\u04ec\5\\/\r\u04bf\u04c0\f\13\2"+
		"\2\u04c0\u04c1\7\u0081\2\2\u04c1\u04c2\7t\2\2\u04c2\u04c3\7M\2\2\u04c3"+
		"\u04ec\5\\/\f\u04c4\u04c5\f\n\2\2\u04c5\u04c6\7\u0081\2\2\u04c6\u04c7"+
		"\7t\2\2\u04c7\u04c8\7P\2\2\u04c8\u04ec\5\\/\13\u04c9\u04ca\f\t\2\2\u04ca"+
		"\u04cb\7\u0087\2\2\u04cb\u04ec\5\\/\n\u04cc\u04cd\f\b\2\2\u04cd\u04ce"+
		"\7O\2\2\u04ce\u04ec\5\\/\t\u04cf\u04d0\f\7\2\2\u04d0\u04d1\7u\2\2\u04d1"+
		"\u04d2\5\\/\2\u04d2\u04d3\7f\2\2\u04d3\u04d4\5\\/\b\u04d4\u04ec\3\2\2"+
		"\2\u04d5\u04d6\f\3\2\2\u04d6\u04d7\7q\2\2\u04d7\u04d8\7e\2\2\u04d8\u04d9"+
		"\5\u00d8m\2\u04d9\u04da\7v\2\2\u04da\u04db\5\\/\4\u04db\u04ec\3\2\2\2"+
		"\u04dc\u04dd\f%\2\2\u04dd\u04ec\5x=\2\u04de\u04df\f\35\2\2\u04df\u04e1"+
		"\7Q\2\2\u04e0\u04e2\7~\2\2\u04e1\u04e0\3\2\2\2\u04e1\u04e2\3\2\2\2\u04e2"+
		"\u04e3\3\2\2\2\u04e3\u04ec\5\u00eav\2\u04e4\u04e5\f\30\2\2\u04e5\u04e6"+
		"\7y\2\2\u04e6\u04e7\7\u0081\2\2\u04e7\u04ec\5\u013c\u009f\2\u04e8\u04e9"+
		"\f\27\2\2\u04e9\u04ea\7y\2\2\u04ea\u04ec\5\u013c\u009f\2\u04eb\u047a\3"+
		"\2\2\2\u04eb\u047e\3\2\2\2\u04eb\u0482\3\2\2\2\u04eb\u0486\3\2\2\2\u04eb"+
		"\u048a\3\2\2\2\u04eb\u048d\3\2\2\2\u04eb\u0490\3\2\2\2\u04eb\u0493\3\2"+
		"\2\2\u04eb\u0496\3\2\2\2\u04eb\u0499\3\2\2\2\u04eb\u049c\3\2\2\2\u04eb"+
		"\u049f\3\2\2\2\u04eb\u04a2\3\2\2\2\u04eb\u04a5\3\2\2\2\u04eb\u04a8\3\2"+
		"\2\2\u04eb\u04ab\3\2\2\2\u04eb\u04af\3\2\2\2\u04eb\u04b3\3\2\2\2\u04eb"+
		"\u04b7\3\2\2\2\u04eb\u04bb\3\2\2\2\u04eb\u04bf\3\2\2\2\u04eb\u04c4\3\2"+
		"\2\2\u04eb\u04c9\3\2\2\2\u04eb\u04cc\3\2\2\2\u04eb\u04cf\3\2\2\2\u04eb"+
		"\u04d5\3\2\2\2\u04eb\u04dc\3\2\2\2\u04eb\u04de\3\2\2\2\u04eb\u04e4\3\2"+
		"\2\2\u04eb\u04e8\3\2\2\2\u04ec\u04ef\3\2\2\2\u04ed\u04eb\3\2\2\2\u04ed"+
		"\u04ee\3\2\2\2\u04ee]\3\2\2\2\u04ef\u04ed\3\2\2\2\u04f0\u04f1\5\u00dc"+
		"o\2\u04f1_\3\2\2\2\u04f2\u04f9\5f\64\2\u04f3\u04f9\5\u0122\u0092\2\u04f4"+
		"\u04f9\5\u0124\u0093\2\u04f5\u04f9\5\u00d4k\2\u04f6\u04f9\5\u011e\u0090"+
		"\2\u04f7\u04f9\5\u0120\u0091\2\u04f8\u04f2\3\2\2\2\u04f8\u04f3\3\2\2\2"+
		"\u04f8\u04f4\3\2\2\2\u04f8\u04f5\3\2\2\2\u04f8\u04f6\3\2\2\2\u04f8\u04f7"+
		"\3\2\2\2\u04f9a\3\2\2\2\u04fa\u04fb\b\62\1\2\u04fb\u04fc\5`\61\2\u04fc"+
		"\u0501\3\2\2\2\u04fd\u04fe\f\3\2\2\u04fe\u0500\5h\65\2\u04ff\u04fd\3\2"+
		"\2\2\u0500\u0503\3\2\2\2\u0501\u04ff\3\2\2\2\u0501\u0502\3\2\2\2\u0502"+
		"c\3\2\2\2\u0503\u0501\3\2\2\2\u0504\u0505\b\63\1\2\u0505\u0506\7~\2\2"+
		"\u0506\u0507\5\u00d4k\2\u0507\u050c\3\2\2\2\u0508\u0509\f\3\2\2\u0509"+
		"\u050b\5h\65\2\u050a\u0508\3\2\2\2\u050b\u050e\3\2\2\2\u050c\u050a\3\2"+
		"\2\2\u050c\u050d\3\2\2\2\u050de\3\2\2\2\u050e\u050c\3\2\2\2\u050f\u0519"+
		"\5j\66\2\u0510\u0519\5l\67\2\u0511\u0519\5z>\2\u0512\u0519\5\u0146\u00a4"+
		"\2\u0513\u0519\5\u0148\u00a5\2\u0514\u0519\5\u014a\u00a6\2\u0515\u0519"+
		"\5~@\2\u0516\u0519\5<\37\2\u0517\u0519\5n8\2\u0518\u050f\3\2\2\2\u0518"+
		"\u0510\3\2\2\2\u0518\u0511\3\2\2\2\u0518\u0512\3\2\2\2\u0518\u0513\3\2"+
		"\2\2\u0518\u0514\3\2\2\2\u0518\u0515\3\2\2\2\u0518\u0516\3\2\2\2\u0518"+
		"\u0517\3\2\2\2\u0519g\3\2\2\2\u051a\u051b\7\25\2\2\u051b\u0527\5\u00d6"+
		"l\2\u051c\u051d\7\25\2\2\u051d\u0527\5<\37\2\u051e\u051f\7\30\2\2\u051f"+
		"\u0520\5\u0136\u009c\2\u0520\u0521\7\31\2\2\u0521\u0527\3\2\2\2\u0522"+
		"\u0523\7\30\2\2\u0523\u0524\5\\/\2\u0524\u0525\7\31\2\2\u0525\u0527\3"+
		"\2\2\2\u0526\u051a\3\2\2\2\u0526\u051c\3\2\2\2\u0526\u051e\3\2\2\2\u0526"+
		"\u0522\3\2\2\2\u0527i\3\2\2\2\u0528\u0529\7E\2\2\u0529\u052b\7\26\2\2"+
		"\u052a\u052c\5\\/\2\u052b\u052a\3\2\2\2\u052b\u052c\3\2\2\2\u052c\u052d"+
		"\3\2\2\2\u052d\u052e\7\27\2\2\u052ek\3\2\2\2\u052f\u0530\7D\2\2\u0530"+
		"\u0534\7\26\2\2\u0531\u0532\7r\2\2\u0532\u0533\7/\2\2\u0533\u0535\5\\"+
		"/\2\u0534\u0531\3\2\2\2\u0534\u0535\3\2\2\2\u0535\u0536\3\2\2\2\u0536"+
		"\u0537\7\27\2\2\u0537m\3\2\2\2\u0538\u0539\5\u00c2b\2\u0539\u053a\7\26"+
		"\2\2\u053a\u053d\5p9\2\u053b\u053c\7\23\2\2\u053c\u053e\5r:\2\u053d\u053b"+
		"\3\2\2\2\u053d\u053e\3\2\2\2\u053e\u053f\3\2\2\2\u053f\u0540\7\27\2\2"+
		"\u0540\u0549\3\2\2\2\u0541\u0542\5\u00c2b\2\u0542\u0544\7\26\2\2\u0543"+
		"\u0545\5r:\2\u0544\u0543\3\2\2\2\u0544\u0545\3\2\2\2\u0545\u0546\3\2\2"+
		"\2\u0546\u0547\7\27\2\2\u0547\u0549\3\2\2\2\u0548\u0538\3\2\2\2\u0548"+
		"\u0541\3\2\2\2\u0549o\3\2\2\2\u054a\u054b\7r\2\2\u054b\u054c\5\u015e\u00b0"+
		"\2\u054c\u054d\5\\/\2\u054d\u054e\69$\3\u054eq\3\2\2\2\u054f\u0550\b:"+
		"\1\2\u0550\u0551\5\\/\2\u0551\u0552\6:%\3\u0552\u0555\3\2\2\2\u0553\u0555"+
		"\5t;\2\u0554\u054f\3\2\2\2\u0554\u0553\3\2\2\2\u0555\u055b\3\2\2\2\u0556"+
		"\u0557\f\3\2\2\u0557\u0558\7\23\2\2\u0558\u055a\5t;\2\u0559\u0556\3\2"+
		"\2\2\u055a\u055d\3\2\2\2\u055b\u0559\3\2\2\2\u055b\u055c\3\2\2\2\u055c"+
		"s\3\2\2\2\u055d\u055b\3\2\2\2\u055e\u0562\5\u00d8m\2\u055f\u0560\5\u015e"+
		"\u00b0\2\u0560\u0561\5\\/\2\u0561\u0563\3\2\2\2\u0562\u055f\3\2\2\2\u0562"+
		"\u0563\3\2\2\2\u0563u\3\2\2\2\u0564\u0565\7\u00a6\2\2\u0565\u0566\5\\"+
		"/\2\u0566\u0567\7\u009e\2\2\u0567\u0568\5\\/\2\u0568w\3\2\2\2\u0569\u056c"+
		"\7n\2\2\u056a\u056b\7\u00a2\2\2\u056b\u056d\5\u00d8m\2\u056c\u056a\3\2"+
		"\2\2\u056c\u056d\3\2\2\2\u056d\u056e\3\2\2\2\u056e\u056f\7\u00a4\2\2\u056f"+
		"\u0570\5\\/\2\u0570y\3\2\2\2\u0571\u0572\7m\2\2\u0572\u0574\7\u0085\2"+
		"\2\u0573\u0575\5\u00c2b\2\u0574\u0573\3\2\2\2\u0574\u0575\3\2\2\2\u0575"+
		"\u0576\3\2\2\2\u0576\u0577\7\u00a4\2\2\u0577\u0590\5\\/\2\u0578\u057f"+
		"\7m\2\2\u0579\u0580\7M\2\2\u057a\u057b\7\u0091\2\2\u057b\u057c\5\\/\2"+
		"\u057c\u057d\7\u009e\2\2\u057d\u057e\5\\/\2\u057e\u0580\3\2\2\2\u057f"+
		"\u0579\3\2\2\2\u057f\u057a\3\2\2\2\u0580\u0581\3\2\2\2\u0581\u0583\7\26"+
		"\2\2\u0582\u0584\5\u00c2b\2\u0583\u0582\3\2\2\2\u0583\u0584\3\2\2\2\u0584"+
		"\u0585\3\2\2\2\u0585\u0588\7\27\2\2\u0586\u0587\7\u00a4\2\2\u0587\u0589"+
		"\5\\/\2\u0588\u0586\3\2\2\2\u0588\u0589\3\2\2\2\u0589\u058d\3\2\2\2\u058a"+
		"\u058b\7\u0088\2\2\u058b\u058c\7X\2\2\u058c\u058e\5\u014c\u00a7\2\u058d"+
		"\u058a\3\2\2\2\u058d\u058e\3\2\2\2\u058e\u0590\3\2\2\2\u058f\u0571\3\2"+
		"\2\2\u058f\u0578\3\2\2\2\u0590{\3\2\2\2\u0591\u0592\7m\2\2\u0592\u0594"+
		"\7\u0085\2\2\u0593\u0595\5\u00c2b\2\u0594\u0593\3\2\2\2\u0594\u0595\3"+
		"\2\2\2\u0595\u0596\3\2\2\2\u0596\u0597\7\u00a4\2\2\u0597\u0598\5\\/\2"+
		"\u0598\u0599\7\u009b\2\2\u0599\u059a\7\u00a2\2\2\u059a\u059b\5\u00d8m"+
		"\2\u059b\u059c\7\21\2\2\u059c\u059d\5\u008cG\2\u059d\u059e\5\u0110\u0089"+
		"\2\u059e\u059f\5\u008eH\2\u059f\u05c0\3\2\2\2\u05a0\u05a7\7m\2\2\u05a1"+
		"\u05a8\7M\2\2\u05a2\u05a3\7\u0091\2\2\u05a3\u05a4\5\\/\2\u05a4\u05a5\7"+
		"\u009e\2\2\u05a5\u05a6\5\\/\2\u05a6\u05a8\3\2\2\2\u05a7\u05a1\3\2\2\2"+
		"\u05a7\u05a2\3\2\2\2\u05a8\u05a9\3\2\2\2\u05a9\u05ab\7\26\2\2\u05aa\u05ac"+
		"\5\u00c2b\2\u05ab\u05aa\3\2\2\2\u05ab\u05ac\3\2\2\2\u05ac\u05ad\3\2\2"+
		"\2\u05ad\u05b0\7\27\2\2\u05ae\u05af\7\u00a4\2\2\u05af\u05b1\5\\/\2\u05b0"+
		"\u05ae\3\2\2\2\u05b0\u05b1\3\2\2\2\u05b1\u05b5\3\2\2\2\u05b2\u05b3\7\u0088"+
		"\2\2\u05b3\u05b4\7X\2\2\u05b4\u05b6\5\u014c\u00a7\2\u05b5\u05b2\3\2\2"+
		"\2\u05b5\u05b6\3\2\2\2\u05b6\u05b7\3\2\2\2\u05b7\u05b8\7\u009b\2\2\u05b8"+
		"\u05b9\7\u00a2\2\2\u05b9\u05ba\5\u00d8m\2\u05ba\u05bb\7\21\2\2\u05bb\u05bc"+
		"\5\u008cG\2\u05bc\u05bd\5\u0110\u0089\2\u05bd\u05be\5\u008eH\2\u05be\u05c0"+
		"\3\2\2\2\u05bf\u0591\3\2\2\2\u05bf\u05a0\3\2\2\2\u05c0}\3\2\2\2\u05c1"+
		"\u05c3\7\u0095\2\2\u05c2\u05c4\7b\2\2\u05c3\u05c2\3\2\2\2\u05c3\u05c4"+
		"\3\2\2\2\u05c4\u05c5\3\2\2\2\u05c5\u05c6\7\26\2\2\u05c6\u05cc\5b\62\2"+
		"\u05c7\u05c8\7\23\2\2\u05c8\u05c9\5\u0156\u00ac\2\u05c9\u05ca\7/\2\2\u05ca"+
		"\u05cb\5\u0144\u00a3\2\u05cb\u05cd\3\2\2\2\u05cc\u05c7\3\2\2\2\u05cc\u05cd"+
		"\3\2\2\2\u05cd\u05ce\3\2\2\2\u05ce\u05cf\7\27\2\2\u05cf\177\3\2\2\2\u05d0"+
		"\u05d1\5\u013a\u009e\2\u05d1\u05d2\5\u015e\u00b0\2\u05d2\u05d3\5\\/\2"+
		"\u05d3\u0081\3\2\2\2\u05d4\u05d5\6B\'\3\u05d5\u05d6\7\25\2\2\u05d6\u05dd"+
		"\5\u00d8m\2\u05d7\u05d8\6B(\3\u05d8\u05d9\7\30\2\2\u05d9\u05da\5\\/\2"+
		"\u05da\u05db\7\31\2\2\u05db\u05dd\3\2\2\2\u05dc\u05d4\3\2\2\2\u05dc\u05d7"+
		"\3\2\2\2\u05dd\u0083\3\2\2\2\u05de\u05df\5\u0100\u0081\2\u05df\u05e0\5"+
		"\u015e\u00b0\2\u05e0\u05e1\5\\/\2\u05e1\u0085\3\2\2\2\u05e2\u05e4\7\7"+
		"\2\2\u05e3\u05e2\3\2\2\2\u05e4\u05e7\3\2\2\2\u05e5\u05e3\3\2\2\2\u05e5"+
		"\u05e6\3\2\2\2\u05e6\u0087\3\2\2\2\u05e7\u05e5\3\2\2\2\u05e8\u05ea\7\7"+
		"\2\2\u05e9\u05e8\3\2\2\2\u05ea\u05eb\3\2\2\2\u05eb\u05e9\3\2\2\2\u05eb"+
		"\u05ec\3\2\2\2\u05ec\u0089\3\2\2\2\u05ed\u05ef\t\4\2\2\u05ee\u05ed\3\2"+
		"\2\2\u05ef\u05f2\3\2\2\2\u05f0\u05ee\3\2\2\2\u05f0\u05f1\3\2\2\2\u05f1"+
		"\u008b\3\2\2\2\u05f2\u05f0\3\2\2\2\u05f3\u05f5\7\7\2\2\u05f4\u05f3\3\2"+
		"\2\2\u05f5\u05f6\3\2\2\2\u05f6\u05f4\3\2\2\2\u05f6\u05f7\3\2\2\2\u05f7"+
		"\u05f8\3\2\2\2\u05f8\u05f9\7\3\2\2\u05f9\u008d\3\2\2\2\u05fa\u05fc\7\7"+
		"\2\2\u05fb\u05fa\3\2\2\2\u05fc\u05ff\3\2\2\2\u05fd\u05fb\3\2\2\2\u05fd"+
		"\u05fe\3\2\2\2\u05fe\u0600\3\2\2\2\u05ff\u05fd\3\2\2\2\u0600\u0601\7\4"+
		"\2\2\u0601\u008f\3\2\2\2\u0602\u0603\5\u00eav\2\u0603\u0091\3\2\2\2\u0604"+
		"\u0605\7\u0080\2\2\u0605\u0093\3\2\2\2\u0606\u060a\5\u009aN\2\u0607\u060a"+
		"\5\66\34\2\u0608\u060a\5\\/\2\u0609\u0606\3\2\2\2\u0609\u0607\3\2\2\2"+
		"\u0609\u0608\3\2\2\2\u060a\u0095\3\2\2\2\u060b\u060d\5\u0098M\2\u060c"+
		"\u060b\3\2\2\2\u060c\u060d\3\2\2\2\u060d\u060e\3\2\2\2\u060e\u060f\5\u0086"+
		"D\2\u060f\u0610\7\2\2\3\u0610\u0097\3\2\2\2\u0611\u0617\5\u009aN\2\u0612"+
		"\u0613\5\u0088E\2\u0613\u0614\5\u009aN\2\u0614\u0616\3\2\2\2\u0615\u0612"+
		"\3\2\2\2\u0616\u0619\3\2\2\2\u0617\u0615\3\2\2\2\u0617\u0618\3\2\2\2\u0618"+
		"\u0099\3\2\2\2\u0619\u0617\3\2\2\2\u061a\u061b\5\u0106\u0084\2\u061b\u061c"+
		"\5\u0088E\2\u061c\u061e\3\2\2\2\u061d\u061a\3\2\2\2\u061e\u0621\3\2\2"+
		"\2\u061f\u061d\3\2\2\2\u061f\u0620\3\2\2\2\u0620\u0627\3\2\2\2\u0621\u061f"+
		"\3\2\2\2\u0622\u0623\5\u009cO\2\u0623\u0624\5\u0088E\2\u0624\u0626\3\2"+
		"\2\2\u0625\u0622\3\2\2\2\u0626\u0629\3\2\2\2\u0627\u0625\3\2\2\2\u0627"+
		"\u0628\3\2\2\2\u0628\u0630\3\2\2\2\u0629\u0627\3\2\2\2\u062a\u0631\5\n"+
		"\6\2\u062b\u0631\5\u00c6d\2\u062c\u0631\5\u00a6T\2\u062d\u0631\5\u00a8"+
		"U\2\u062e\u0631\5\u00c8e\2\u062f\u0631\5\u0104\u0083\2\u0630\u062a\3\2"+
		"\2\2\u0630\u062b\3\2\2\2\u0630\u062c\3\2\2\2\u0630\u062d\3\2\2\2\u0630"+
		"\u062e\3\2\2\2\u0630\u062f\3\2\2\2\u0631\u009b\3\2\2\2\u0632\u0641\5\u009e"+
		"P\2\u0633\u063d\7\26\2\2\u0634\u063e\5\u00a4S\2\u0635\u063a\5\u00a0Q\2"+
		"\u0636\u0637\7\23\2\2\u0637\u0639\5\u00a0Q\2\u0638\u0636\3\2\2\2\u0639"+
		"\u063c\3\2\2\2\u063a\u0638\3\2\2\2\u063a\u063b\3\2\2\2\u063b\u063e\3\2"+
		"\2\2\u063c\u063a\3\2\2\2\u063d\u0634\3\2\2\2\u063d\u0635\3\2\2\2\u063e"+
		"\u063f\3\2\2\2\u063f\u0640\7\27\2\2\u0640\u0642\3\2\2\2\u0641\u0633\3"+
		"\2\2\2\u0641\u0642\3\2\2\2\u0642\u009d\3\2\2\2\u0643\u0644\7\u00b0\2\2"+
		"\u0644\u009f\3\2\2\2\u0645\u0646\5\u00a2R\2\u0646\u0647\7/\2\2\u0647\u0648"+
		"\5\u00a4S\2\u0648\u00a1\3\2\2\2\u0649\u064a\t\5\2\2\u064a\u00a3\3\2\2"+
		"\2\u064b\u064e\5\u0124\u0093\2\u064c\u064e\5\u00bc_\2\u064d\u064b\3\2"+
		"\2\2\u064d\u064c\3\2\2\2\u064e\u00a5\3\2\2\2\u064f\u0650\5$\23\2\u0650"+
		"\u00a7\3\2\2\2\u0651\u0654\5\2\2\2\u0652\u0654\5\4\3\2\u0653\u0651\3\2"+
		"\2\2\u0653\u0652\3\2\2\2\u0654\u00a9\3\2\2\2\u0655\u065b\5\6\4\2\u0656"+
		"\u0657\5\u0088E\2\u0657\u0658\5\6\4\2\u0658\u065a\3\2\2\2\u0659\u0656"+
		"\3\2\2\2\u065a\u065d\3\2\2\2\u065b\u0659\3\2\2\2\u065b\u065c\3\2\2\2\u065c"+
		"\u00ab\3\2\2\2\u065d\u065b\3\2\2\2\u065e\u0664\5\b\5\2\u065f\u0660\5\u0088"+
		"E\2\u0660\u0661\5\b\5\2\u0661\u0663\3\2\2\2\u0662\u065f\3\2\2\2\u0663"+
		"\u0666\3\2\2\2\u0664\u0662\3\2\2\2\u0664\u0665\3\2\2\2\u0665\u00ad\3\2"+
		"\2\2\u0666\u0664\3\2\2\2\u0667\u066c\5\u00dep\2\u0668\u0669\7\23\2\2\u0669"+
		"\u066b\5\u00dep\2\u066a\u0668\3\2\2\2\u066b\u066e\3\2\2\2\u066c\u066a"+
		"\3\2\2\2\u066c\u066d\3\2\2\2\u066d\u00af\3\2\2\2\u066e\u066c\3\2\2\2\u066f"+
		"\u0670\7v\2\2\u0670\u067a\5\u00b2Z\2\u0671\u0672\7v\2\2\u0672\u067a\5"+
		"\u00b4[\2\u0673\u0674\7v\2\2\u0674\u067a\5\u00b8]\2\u0675\u0676\7z\2\2"+
		"\u0676\u067a\7\u00b1\2\2\u0677\u0678\7z\2\2\u0678\u067a\5\\/\2\u0679\u066f"+
		"\3\2\2\2\u0679\u0671\3\2\2\2\u0679\u0673\3\2\2\2\u0679\u0675\3\2\2\2\u0679"+
		"\u0677\3\2\2\2\u067a\u00b1\3\2\2\2\u067b\u067d\7~\2\2\u067c\u067b\3\2"+
		"\2\2\u067c\u067d\3\2\2\2\u067d\u067e\3\2\2\2\u067e\u0680\7\30\2\2\u067f"+
		"\u0681\5\u00b6\\\2\u0680\u067f\3\2\2\2\u0680\u0681\3\2\2\2\u0681\u0682"+
		"\3\2\2\2\u0682\u0683\7\31\2\2\u0683\u00b3\3\2\2\2\u0684\u0686\7~\2\2\u0685"+
		"\u0684\3\2\2\2\u0685\u0686\3\2\2\2\u0686\u0687\3\2\2\2\u0687\u0689\7+"+
		"\2\2\u0688\u068a\5\u00b6\\\2\u0689\u0688\3\2\2\2\u0689\u068a\3\2\2\2\u068a"+
		"\u068b\3\2\2\2\u068b\u068c\7)\2\2\u068c\u00b5\3\2\2\2\u068d\u0692\5\\"+
		"/\2\u068e\u068f\7\23\2\2\u068f\u0691\5\\/\2\u0690\u068e\3\2\2\2\u0691"+
		"\u0694\3\2\2\2\u0692\u0690\3\2\2\2\u0692\u0693\3\2\2\2\u0693\u00b7\3\2"+
		"\2\2\u0694\u0692\3\2\2\2\u0695\u0696\7\30\2\2\u0696\u0697\5\\/\2\u0697"+
		"\u0698\7\24\2\2\u0698\u0699\5\\/\2\u0699\u069a\7\31\2\2\u069a\u00b9\3"+
		"\2\2\2\u069b\u069c\b^\1\2\u069c\u06a8\5\u00bc_\2\u069d\u069e\7I\2\2\u069e"+
		"\u069f\7+\2\2\u069f\u06a0\5\u00ba^\2\u06a0\u06a1\7)\2\2\u06a1\u06a8\3"+
		"\2\2\2\u06a2\u06a3\7H\2\2\u06a3\u06a4\7+\2\2\u06a4\u06a5\5\u00ba^\2\u06a5"+
		"\u06a6\7)\2\2\u06a6\u06a8\3\2\2\2\u06a7\u069b\3\2\2\2\u06a7\u069d\3\2"+
		"\2\2\u06a7\u06a2\3\2\2\2\u06a8\u06b2\3\2\2\2\u06a9\u06aa\f\7\2\2\u06aa"+
		"\u06b1\7-\2\2\u06ab\u06ac\f\6\2\2\u06ac\u06ad\7\30\2\2\u06ad\u06b1\7\31"+
		"\2\2\u06ae\u06af\f\5\2\2\u06af\u06b1\7.\2\2\u06b0\u06a9\3\2\2\2\u06b0"+
		"\u06ab\3\2\2\2\u06b0\u06ae\3\2\2\2\u06b1\u06b4\3\2\2\2\u06b2\u06b0\3\2"+
		"\2\2\u06b2\u06b3\3\2\2\2\u06b3\u00bb\3\2\2\2\u06b4\u06b2\3\2\2\2\u06b5"+
		"\u06b8\5\u00be`\2\u06b6\u06b8\5\u00c0a\2\u06b7\u06b5\3\2\2\2\u06b7\u06b6"+
		"\3\2\2\2\u06b8\u00bd\3\2\2\2\u06b9\u06cb\7\67\2\2\u06ba\u06cb\78\2\2\u06bb"+
		"\u06cb\79\2\2\u06bc\u06cb\7:\2\2\u06bd\u06cb\7F\2\2\u06be\u06cb\7;\2\2"+
		"\u06bf\u06cb\7<\2\2\u06c0\u06cb\7D\2\2\u06c1\u06cb\7=\2\2\u06c2\u06cb"+
		"\7?\2\2\u06c3\u06cb\7>\2\2\u06c4\u06cb\7@\2\2\u06c5\u06cb\7A\2\2\u06c6"+
		"\u06cb\7C\2\2\u06c7\u06cb\7E\2\2\u06c8\u06cb\7G\2\2\u06c9\u06cb\7J\2\2"+
		"\u06ca\u06b9\3\2\2\2\u06ca\u06ba\3\2\2\2\u06ca\u06bb\3\2\2\2\u06ca\u06bc"+
		"\3\2\2\2\u06ca\u06bd\3\2\2\2\u06ca\u06be\3\2\2\2\u06ca\u06bf\3\2\2\2\u06ca"+
		"\u06c0\3\2\2\2\u06ca\u06c1\3\2\2\2\u06ca\u06c2\3\2\2\2\u06ca\u06c3\3\2"+
		"\2\2\u06ca\u06c4\3\2\2\2\u06ca\u06c5\3\2\2\2\u06ca\u06c6\3\2\2\2\u06ca"+
		"\u06c7\3\2\2\2\u06ca\u06c8\3\2\2\2\u06ca\u06c9\3\2\2\2\u06cb\u00bf\3\2"+
		"\2\2\u06cc\u06cd\7\u00ac\2\2\u06cd\u00c1\3\2\2\2\u06ce\u06d0\7~\2\2\u06cf"+
		"\u06ce\3\2\2\2\u06cf\u06d0\3\2\2\2\u06d0\u06d1\3\2\2\2\u06d1\u06d2\5\u00c0"+
		"a\2\u06d2\u00c3\3\2\2\2\u06d3\u06d4\7C\2\2\u06d4\u00c5\3\2\2\2\u06d5\u06d9"+
		"\5\22\n\2\u06d6\u06d9\5\"\22\2\u06d7\u06d9\5\24\13\2\u06d8\u06d5\3\2\2"+
		"\2\u06d8\u06d6\3\2\2\2\u06d8\u06d7\3\2\2\2\u06d9\u00c7\3\2\2\2\u06da\u06dd"+
		"\5\16\b\2\u06db\u06dd\5\20\t\2\u06dc\u06da\3\2\2\2\u06dc\u06db\3\2\2\2"+
		"\u06dd\u00c9\3\2\2\2\u06de\u06e3\5\u00dco\2\u06df\u06e0\7\23\2\2\u06e0"+
		"\u06e2\5\u00dco\2\u06e1\u06df\3\2\2\2\u06e2\u06e5\3\2\2\2\u06e3\u06e1"+
		"\3\2\2\2\u06e3\u06e4\3\2\2\2\u06e4\u00cb\3\2\2\2\u06e5\u06e3\3\2\2\2\u06e6"+
		"\u06e9\5\u00d8m\2\u06e7\u06e9\5\u00dco\2\u06e8\u06e6\3\2\2\2\u06e8\u06e7"+
		"\3\2\2\2\u06e9\u00cd\3\2\2\2\u06ea\u06ed\5\u00d4k\2\u06eb\u06ed\5\u0152"+
		"\u00aa\2\u06ec\u06ea\3\2\2\2\u06ec\u06eb\3\2\2\2\u06ed\u00cf\3\2\2\2\u06ee"+
		"\u06ef\6i,\3\u06ef\u06f0\7#\2\2\u06f0\u06f1\5\u00d2j\2\u06f1\u00d1\3\2"+
		"\2\2\u06f2\u06f3\6j-\3\u06f3\u06f4\5\u00ceh\2\u06f4\u00d3\3\2\2\2\u06f5"+
		"\u06f9\5\u00d8m\2\u06f6\u06f9\5\u00dco\2\u06f7\u06f9\5\u00dep\2\u06f8"+
		"\u06f5\3\2\2\2\u06f8\u06f6\3\2\2\2\u06f8\u06f7\3\2\2\2\u06f9\u00d5\3\2"+
		"\2\2\u06fa\u06fb\t\6\2\2\u06fb\u00d7\3\2\2\2\u06fc\u06fd\7\u00ad\2\2\u06fd"+
		"\u00d9\3\2\2\2\u06fe\u06ff\t\7\2\2\u06ff\u00db\3\2\2\2\u0700\u0701\7\u00ac"+
		"\2\2\u0701\u00dd\3\2\2\2\u0702\u0703\7\u00ab\2\2\u0703\u00df\3\2\2\2\u0704"+
		"\u0709\5\u00e2r\2\u0705\u0706\7\23\2\2\u0706\u0708\5\u00e2r\2\u0707\u0705"+
		"\3\2\2\2\u0708\u070b\3\2\2\2\u0709\u0707\3\2\2\2\u0709\u070a\3\2\2\2\u070a"+
		"\u00e1\3\2\2\2\u070b\u0709\3\2\2\2\u070c\u0712\5\u00e8u\2\u070d\u070f"+
		"\7~\2\2\u070e\u070d\3\2\2\2\u070e\u070f\3\2\2\2\u070f\u0710\3\2\2\2\u0710"+
		"\u0712\5\u00e4s\2\u0711\u070c\3\2\2\2\u0711\u070e\3\2\2\2\u0712\u00e3"+
		"\3\2\2\2\u0713\u0716\5\u00e6t\2\u0714\u0716\5\64\33\2\u0715\u0713\3\2"+
		"\2\2\u0715\u0714\3\2\2\2\u0716\u00e5\3\2\2\2\u0717\u071a\5\u00d8m\2\u0718"+
		"\u0719\7/\2\2\u0719\u071b\5\u0124\u0093\2\u071a\u0718\3\2\2\2\u071a\u071b"+
		"\3\2\2\2\u071b\u00e7\3\2\2\2\u071c\u071d\5\u00c4c\2\u071d\u071e\5\u00d8"+
		"m\2\u071e\u00e9\3\2\2\2\u071f\u0722\5\u00ba^\2\u0720\u0722\5\u00ecw\2"+
		"\u0721\u071f\3\2\2\2\u0721\u0720\3\2\2\2\u0722\u00eb\3\2\2\2\u0723\u0724"+
		"\bw\1\2\u0724\u0725\7P\2\2\u0725\u072e\3\2\2\2\u0726\u0727\f\4\2\2\u0727"+
		"\u0728\7\30\2\2\u0728\u072d\7\31\2\2\u0729\u072a\f\3\2\2\u072a\u072b\7"+
		"\32\2\2\u072b\u072d\7\33\2\2\u072c\u0726\3\2\2\2\u072c\u0729\3\2\2\2\u072d"+
		"\u0730\3\2\2\2\u072e\u072c\3\2\2\2\u072e\u072f\3\2\2\2\u072f\u00ed\3\2"+
		"\2\2\u0730\u072e\3\2\2\2\u0731\u0737\5\u00f0y\2\u0732\u0733\5\u0088E\2"+
		"\u0733\u0734\5\u00f0y\2\u0734\u0736\3\2\2\2\u0735\u0732\3\2\2\2\u0736"+
		"\u0739\3\2\2\2\u0737\u0735\3\2\2\2\u0737\u0738\3\2\2\2\u0738\u00ef\3\2"+
		"\2\2\u0739\u0737\3\2\2\2\u073a\u073b\5\u0106\u0084\2\u073b\u073c\5\u0088"+
		"E\2\u073c\u073e\3\2\2\2\u073d\u073a\3\2\2\2\u073e\u0741\3\2\2\2\u073f"+
		"\u073d\3\2\2\2\u073f\u0740\3\2\2\2\u0740\u0747\3\2\2\2\u0741\u073f\3\2"+
		"\2\2\u0742\u0743\5\u009cO\2\u0743\u0744\5\u0088E\2\u0744\u0746\3\2\2\2"+
		"\u0745\u0742\3\2\2\2\u0746\u0749\3\2\2\2\u0747\u0745\3\2\2\2\u0747\u0748"+
		"\3\2\2\2\u0748\u074f\3\2\2\2\u0749\u0747\3\2\2\2\u074a\u0750\5\32\16\2"+
		"\u074b\u0750\5\36\20\2\u074c\u0750\5,\27\2\u074d\u0750\5*\26\2\u074e\u0750"+
		"\5\30\r\2\u074f\u074a\3\2\2\2\u074f\u074b\3\2\2\2\u074f\u074c\3\2\2\2"+
		"\u074f\u074d\3\2\2\2\u074f\u074e\3\2\2\2\u0750\u00f1\3\2\2\2\u0751\u0757"+
		"\5\u00f4{\2\u0752\u0753\5\u0088E\2\u0753\u0754\5\u00f4{\2\u0754\u0756"+
		"\3\2\2\2\u0755\u0752\3\2\2\2\u0756\u0759\3\2\2\2\u0757\u0755\3\2\2\2\u0757"+
		"\u0758\3\2\2\2\u0758\u00f3\3\2\2\2\u0759\u0757\3\2\2\2\u075a\u075e\5 "+
		"\21\2\u075b\u075e\5\34\17\2\u075c\u075e\5.\30\2\u075d\u075a\3\2\2\2\u075d"+
		"\u075b\3\2\2\2\u075d\u075c\3\2\2\2\u075e\u00f5\3\2\2\2\u075f\u0760\7\13"+
		"\2\2\u0760\u076a\5\u01b2\u00da\2\u0761\u0762\7\f\2\2\u0762\u076a\5\u01cc"+
		"\u00e7\2\u0763\u0764\7\r\2\2\u0764\u076a\5\u00f8}\2\u0765\u0766\7\16\2"+
		"\2\u0766\u076a\5\u00f8}\2\u0767\u0768\7\17\2\2\u0768\u076a\5\u00fc\177"+
		"\2\u0769\u075f\3\2\2\2\u0769\u0761\3\2\2\2\u0769\u0763\3\2\2\2\u0769\u0765"+
		"\3\2\2\2\u0769\u0767\3\2\2\2\u076a\u00f7\3\2\2\2\u076b\u076d\5\u00d4k"+
		"\2\u076c\u076e\5\u00fa~\2\u076d\u076c\3\2\2\2\u076d\u076e\3\2\2\2\u076e"+
		"\u00f9\3\2\2\2\u076f\u0770\7r\2\2\u0770\u0771\5\u0158\u00ad\2\u0771\u0772"+
		"\7\21\2\2\u0772\u0777\5\u019a\u00ce\2\u0773\u0774\7\25\2\2\u0774\u0776"+
		"\5\u019a\u00ce\2\u0775\u0773\3\2\2\2\u0776\u0779\3\2\2\2\u0777\u0775\3"+
		"\2\2\2\u0777\u0778\3\2\2\2\u0778\u00fb\3\2\2\2\u0779\u0777\3\2\2\2\u077a"+
		"\u077f\5\u0180\u00c1\2\u077b\u077c\7\25\2\2\u077c\u077e\5\u0180\u00c1"+
		"\2\u077d\u077b\3\2\2\2\u077e\u0781\3\2\2\2\u077f\u077d\3\2\2\2\u077f\u0780"+
		"\3\2\2\2\u0780\u0783\3\2\2\2\u0781\u077f\3\2\2\2\u0782\u0784\5\u00fe\u0080"+
		"\2\u0783\u0782\3\2\2\2\u0783\u0784\3\2\2\2\u0784\u00fd\3\2\2\2\u0785\u0786"+
		"\7r\2\2\u0786\u0787\5\u0158\u00ad\2\u0787\u0789\7\21\2\2\u0788\u078a\7"+
		"%\2\2\u0789\u0788\3\2\2\2\u0789\u078a\3\2\2\2\u078a\u078b\3\2\2\2\u078b"+
		"\u0790\5\u0180\u00c1\2\u078c\u078d\7%\2\2\u078d\u078f\5\u0180\u00c1\2"+
		"\u078e\u078c\3\2\2\2\u078f\u0792\3\2\2\2\u0790\u078e\3\2\2\2\u0790\u0791"+
		"\3\2\2\2\u0791\u0795\3\2\2\2\u0792\u0790\3\2\2\2\u0793\u0794\7\25\2\2"+
		"\u0794\u0796\5\u0180\u00c1\2\u0795\u0793\3\2\2\2\u0795\u0796\3\2\2\2\u0796"+
		"\u00ff\3\2\2\2\u0797\u079c\5\u00d8m\2\u0798\u0799\7\23\2\2\u0799\u079b"+
		"\5\u00d8m\2\u079a\u0798\3\2\2\2\u079b\u079e\3\2\2\2\u079c\u079a\3\2\2"+
		"\2\u079c\u079d\3\2\2\2\u079d\u0101\3\2\2\2\u079e\u079c\3\2\2\2\u079f\u07a4"+
		"\5\u00dan\2\u07a0\u07a1\7\23\2\2\u07a1\u07a3\5\u00dan\2\u07a2\u07a0\3"+
		"\2\2\2\u07a3\u07a6\3\2\2\2\u07a4\u07a2\3\2\2\2\u07a4\u07a5\3\2\2\2\u07a5"+
		"\u0103\3\2\2\2\u07a6\u07a4\3\2\2\2\u07a7\u07ac\5*\26\2\u07a8\u07ac\5,"+
		"\27\2\u07a9\u07ac\5.\30\2\u07aa\u07ac\5\60\31\2\u07ab\u07a7\3\2\2\2\u07ab"+
		"\u07a8\3\2\2\2\u07ab\u07a9\3\2\2\2\u07ab\u07aa\3\2\2\2\u07ac\u0105\3\2"+
		"\2\2\u07ad\u07ae\7\n\2\2\u07ae\u0107\3\2\2\2\u07af\u07b5\5\u010a\u0086"+
		"\2\u07b0\u07b1\5\u0088E\2\u07b1\u07b2\5\u010a\u0086\2\u07b2\u07b4\3\2"+
		"\2\2\u07b3\u07b0\3\2\2\2\u07b4\u07b7\3\2\2\2\u07b5\u07b3\3\2\2\2\u07b5"+
		"\u07b6\3\2\2\2\u07b6\u0109\3\2\2\2\u07b7\u07b5\3\2\2\2\u07b8\u07b9\7\13"+
		"\2\2\u07b9\u07c3\5\u019c\u00cf\2\u07ba\u07bb\7\f\2\2\u07bb\u07c3\5\u01b8"+
		"\u00dd\2\u07bc\u07bd\7\r\2\2\u07bd\u07c3\5\u010c\u0087\2\u07be\u07bf\7"+
		"\16\2\2\u07bf\u07c3\5\u010c\u0087\2\u07c0\u07c1\7\17\2\2\u07c1\u07c3\5"+
		"\u010e\u0088\2\u07c2\u07b8\3\2\2\2\u07c2\u07ba\3\2\2\2\u07c2\u07bc\3\2"+
		"\2\2\u07c2\u07be\3\2\2\2\u07c2\u07c0\3\2\2\2\u07c3\u010b\3\2\2\2\u07c4"+
		"\u07c6\5\u0182\u00c2\2\u07c5\u07c7\7\22\2\2\u07c6\u07c5\3\2\2\2\u07c6"+
		"\u07c7\3\2\2\2\u07c7\u07c9\3\2\2\2\u07c8\u07ca\5\u00fa~\2\u07c9\u07c8"+
		"\3\2\2\2\u07c9\u07ca\3\2\2\2\u07ca\u010d\3\2\2\2\u07cb\u07cd\5\u0168\u00b5"+
		"\2\u07cc\u07ce\7\22\2\2\u07cd\u07cc\3\2\2\2\u07cd\u07ce\3\2\2\2\u07ce"+
		"\u07d0\3\2\2\2\u07cf\u07d1\5\u00fe\u0080\2\u07d0\u07cf\3\2\2\2\u07d0\u07d1"+
		"\3\2\2\2\u07d1\u010f\3\2\2\2\u07d2\u07d8\5\66\34\2\u07d3\u07d4\5\u0088"+
		"E\2\u07d4\u07d5\5\66\34\2\u07d5\u07d7\3\2\2\2\u07d6\u07d3\3\2\2\2\u07d7"+
		"\u07da\3\2\2\2\u07d8\u07d6\3\2\2\2\u07d8\u07d9\3\2\2\2\u07d9\u0111\3\2"+
		"\2\2\u07da\u07d8\3\2\2\2\u07db\u07e1\5\62\32\2\u07dc\u07dd\5\u0088E\2"+
		"\u07dd\u07de\5\62\32\2\u07de\u07e0\3\2\2\2\u07df\u07dc\3\2\2\2\u07e0\u07e3"+
		"\3\2\2\2\u07e1\u07df\3\2\2\2\u07e1\u07e2\3\2\2\2\u07e2\u0113\3\2\2\2\u07e3"+
		"\u07e1\3\2\2\2\u07e4\u07ea\5F$\2\u07e5\u07e6\5\u0088E\2\u07e6\u07e7\5"+
		"F$\2\u07e7\u07e9\3\2\2\2\u07e8\u07e5\3\2\2\2\u07e9\u07ec\3\2\2\2\u07ea"+
		"\u07e8\3\2\2\2\u07ea\u07eb\3\2\2\2\u07eb\u0115\3\2\2\2\u07ec\u07ea\3\2"+
		"\2\2\u07ed\u07f3\5V,\2\u07ee\u07ef\5\u0088E\2\u07ef\u07f0\5V,\2\u07f0"+
		"\u07f2\3\2\2\2\u07f1\u07ee\3\2\2\2\u07f2\u07f5\3\2\2\2\u07f3\u07f1\3\2"+
		"\2\2\u07f3\u07f4\3\2\2\2\u07f4\u0117\3\2\2\2\u07f5\u07f3\3\2\2\2\u07f6"+
		"\u07f7\7\30\2\2\u07f7\u07f8\5\u011a\u008e\2\u07f8\u07f9\7\24\2\2\u07f9"+
		"\u07fa\5\u011a\u008e\2\u07fa\u07fb\7\31\2\2\u07fb\u0805\3\2\2\2\u07fc"+
		"\u07fd\7\30\2\2\u07fd\u07fe\5\u011c\u008f\2\u07fe\u07ff\7\31\2\2\u07ff"+
		"\u0805\3\2\2\2\u0800\u0801\7+\2\2\u0801\u0802\5\u011c\u008f\2\u0802\u0803"+
		"\7)\2\2\u0803\u0805\3\2\2\2\u0804\u07f6\3\2\2\2\u0804\u07fc\3\2\2\2\u0804"+
		"\u0800\3\2\2\2\u0805\u0119\3\2\2\2\u0806\u0818\7\u00a9\2\2\u0807\u0818"+
		"\7\u00aa\2\2\u0808\u0818\7\u00b3\2\2\u0809\u0818\7\u00b4\2\2\u080a\u0818"+
		"\7\u00a8\2\2\u080b\u0818\7\u00b8\2\2\u080c\u0818\7\u00b7\2\2\u080d\u0818"+
		"\7\u00b1\2\2\u080e\u0818\7\u00b5\2\2\u080f\u0818\7\u00b6\2\2\u0810\u0818"+
		"\7\u00a7\2\2\u0811\u0818\7\u00b9\2\2\u0812\u0818\7\u00ba\2\2\u0813\u0818"+
		"\7\u00b2\2\2\u0814\u0818\5\u00dep\2\u0815\u0818\5\u0090I\2\u0816\u0818"+
		"\5\u0092J\2\u0817\u0806\3\2\2\2\u0817\u0807\3\2\2\2\u0817\u0808\3\2\2"+
		"\2\u0817\u0809\3\2\2\2\u0817\u080a\3\2\2\2\u0817\u080b\3\2\2\2\u0817\u080c"+
		"\3\2\2\2\u0817\u080d\3\2\2\2\u0817\u080e\3\2\2\2\u0817\u080f\3\2\2\2\u0817"+
		"\u0810\3\2\2\2\u0817\u0811\3\2\2\2\u0817\u0812\3\2\2\2\u0817\u0813\3\2"+
		"\2\2\u0817\u0814\3\2\2\2\u0817\u0815\3\2\2\2\u0817\u0816\3\2\2\2\u0818"+
		"\u011b\3\2\2\2\u0819\u081e\5\u011a\u008e\2\u081a\u081b\7\23\2\2\u081b"+
		"\u081d\5\u011a\u008e\2\u081c\u081a\3\2\2\2\u081d\u0820\3\2\2\2\u081e\u081c"+
		"\3\2\2\2\u081e\u081f\3\2\2\2\u081f\u011d\3\2\2\2\u0820\u081e\3\2\2\2\u0821"+
		"\u0822\t\b\2\2\u0822\u011f\3\2\2\2\u0823\u0824\5\u00c0a\2\u0824\u0825"+
		"\7\25\2\2\u0825\u0827\3\2\2\2\u0826\u0823\3\2\2\2\u0826\u0827\3\2\2\2"+
		"\u0827\u0828\3\2\2\2\u0828\u0829\7\u0098\2\2\u0829\u0121\3\2\2\2\u082a"+
		"\u082b\7\26\2\2\u082b\u082c\5\\/\2\u082c\u082d\7\27\2\2\u082d\u0123\3"+
		"\2\2\2\u082e\u0831\5\u011a\u008e\2\u082f\u0831\5\u0126\u0094\2\u0830\u082e"+
		"\3\2\2\2\u0830\u082f\3\2\2\2\u0831\u0125\3\2\2\2\u0832\u0839\5\u00b8]"+
		"\2\u0833\u0839\5\u00b2Z\2\u0834\u0839\5\u00b4[\2\u0835\u0839\5\u012a\u0096"+
		"\2\u0836\u0839\5\u012c\u0097\2\u0837\u0839\5\u0128\u0095\2\u0838\u0832"+
		"\3\2\2\2\u0838\u0833\3\2\2\2\u0838\u0834\3\2\2\2\u0838\u0835\3\2\2\2\u0838"+
		"\u0836\3\2\2\2\u0838\u0837\3\2\2\2\u0839\u0127\3\2\2\2\u083a\u083c\7~"+
		"\2\2\u083b\u083a\3\2\2\2\u083b\u083c\3\2\2\2\u083c\u083d\3\2\2\2\u083d"+
		"\u083f\7\26\2\2\u083e\u0840\5\u012e\u0098\2\u083f\u083e\3\2\2\2\u083f"+
		"\u0840\3\2\2\2\u0840\u0841\3\2\2\2\u0841\u0842\7\27\2\2\u0842\u0129\3"+
		"\2\2\2\u0843\u0845\7~\2\2\u0844\u0843\3\2\2\2\u0844\u0845\3\2\2\2\u0845"+
		"\u084e\3\2\2\2\u0846\u0847\7+\2\2\u0847\u0848\5\u0130\u0099\2\u0848\u0849"+
		"\7)\2\2\u0849\u084f\3\2\2\2\u084a\u084f\7.\2\2\u084b\u084c\7+\2\2\u084c"+
		"\u084d\7\21\2\2\u084d\u084f\7)\2\2\u084e\u0846\3\2\2\2\u084e\u084a\3\2"+
		"\2\2\u084e\u084b\3\2\2\2\u084f\u012b\3\2\2\2\u0850\u0852\7\32\2\2\u0851"+
		"\u0853\5\u0130\u0099\2\u0852\u0851\3\2\2\2\u0852\u0853\3\2\2\2\u0853\u0854"+
		"\3\2\2\2\u0854\u0855\7\33\2\2\u0855\u012d\3\2\2\2\u0856\u0857\5\\/\2\u0857"+
		"\u0860\7\23\2\2\u0858\u085d\5\\/\2\u0859\u085a\7\23\2\2\u085a\u085c\5"+
		"\\/\2\u085b\u0859\3\2\2\2\u085c\u085f\3\2\2\2\u085d\u085b\3\2\2\2\u085d"+
		"\u085e\3\2\2\2\u085e\u0861\3\2\2\2\u085f\u085d\3\2\2\2\u0860\u0858\3\2"+
		"\2\2\u0860\u0861\3\2\2\2\u0861\u012f\3\2\2\2\u0862\u0867\5\u0132\u009a"+
		"\2\u0863\u0864\7\23\2\2\u0864\u0866\5\u0132\u009a\2\u0865\u0863\3\2\2"+
		"\2\u0866\u0869\3\2\2\2\u0867\u0865\3\2\2\2\u0867\u0868\3\2\2\2\u0868\u0131"+
		"\3\2\2\2\u0869\u0867\3\2\2\2\u086a\u086b\5\u0134\u009b\2\u086b\u086c\7"+
		"\21\2\2\u086c\u086d\5\\/\2\u086d\u0133\3\2\2\2\u086e\u0871\5\u00ceh\2"+
		"\u086f\u0871\7\u00b1\2\2\u0870\u086e\3\2\2\2\u0870\u086f\3\2\2\2\u0871"+
		"\u0135\3\2\2\2\u0872\u0873\5\\/\2\u0873\u0874\7\21\2\2\u0874\u0875\5\\"+
		"/\2\u0875\u087c\3\2\2\2\u0876\u0877\5\\/\2\u0877\u0878\7\21\2\2\u0878"+
		"\u087c\3\2\2\2\u0879\u087a\7\21\2\2\u087a\u087c\5\\/\2\u087b\u0872\3\2"+
		"\2\2\u087b\u0876\3\2\2\2\u087b\u0879\3\2\2\2\u087c\u0137\3\2\2\2\u087d"+
		"\u087e\5\u00d8m\2\u087e\u087f\5\u015e\u00b0\2\u087f\u0880\5\\/\2\u0880"+
		"\u0139\3\2\2\2\u0881\u0882\b\u009e\1\2\u0882\u0883\5\u00d8m\2\u0883\u0888"+
		"\3\2\2\2\u0884\u0885\f\3\2\2\u0885\u0887\5\u0082B\2\u0886\u0884\3\2\2"+
		"\2\u0887\u088a\3\2\2\2\u0888\u0886\3\2\2\2\u0888\u0889\3\2\2\2\u0889\u013b"+
		"\3\2\2\2\u088a\u0888\3\2\2\2\u088b\u088c\6\u009f\61\3\u088c\u088d\7\u00ad"+
		"\2\2\u088d\u0890\5\u00eav\2\u088e\u0890\5\\/\2\u088f\u088b\3\2\2\2\u088f"+
		"\u088e\3\2\2\2\u0890\u013d\3\2\2\2\u0891\u0892\5\u0140\u00a1\2\u0892\u0893"+
		"\5\\/\2\u0893\u089a\3\2\2\2\u0894\u0895\5\u0140\u00a1\2\u0895\u0896\7"+
		"\32\2\2\u0896\u0897\5\u0110\u0089\2\u0897\u0898\7\33\2\2\u0898\u089a\3"+
		"\2\2\2\u0899\u0891\3\2\2\2\u0899\u0894\3\2\2\2\u089a\u013f\3\2\2\2\u089b"+
		"\u089c\5\u0142\u00a2\2\u089c\u089d\5\u008aF\2\u089d\u089e\7\66\2\2\u089e"+
		"\u089f\5\u008aF\2\u089f\u0141\3\2\2\2\u08a0\u08a7\5\u00d8m\2\u08a1\u08a3"+
		"\7\26\2\2\u08a2\u08a4\5\u0100\u0081\2\u08a3\u08a2\3\2\2\2\u08a3\u08a4"+
		"\3\2\2\2\u08a4\u08a5\3\2\2\2\u08a5\u08a7\7\27\2\2\u08a6\u08a0\3\2\2\2"+
		"\u08a6\u08a1\3\2\2\2\u08a7\u0143\3\2\2\2\u08a8\u08ab\5b\62\2\u08a9\u08ab"+
		"\5\u013e\u00a0\2\u08aa\u08a8\3\2\2\2\u08aa\u08a9\3\2\2\2\u08ab\u0145\3"+
		"\2\2\2\u08ac\u08ad\7\u008c\2\2\u08ad\u08ae\7E\2\2\u08ae\u08af\7r\2\2\u08af"+
		"\u08b0\5\\/\2\u08b0\u0147\3\2\2\2\u08b1\u08b2\7\u008c\2\2\u08b2\u08b3"+
		"\7M\2\2\u08b3\u08b4\7r\2\2\u08b4\u08b5\5\\/\2\u08b5\u0149\3\2\2\2\u08b6"+
		"\u08b7\7\u008c\2\2\u08b7\u08b8\7\u0085\2\2\u08b8\u08b9\7r\2\2\u08b9\u08ba"+
		"\5\\/\2\u08ba\u014b\3\2\2\2\u08bb\u08c0\5\u014e\u00a8\2\u08bc\u08bd\7"+
		"\23\2\2\u08bd\u08bf\5\u014e\u00a8\2\u08be\u08bc\3\2\2\2\u08bf\u08c2\3"+
		"\2\2\2\u08c0\u08be\3\2\2\2\u08c0\u08c1\3\2\2\2\u08c1\u014d\3\2\2\2\u08c2"+
		"\u08c0\3\2\2\2\u08c3\u08c8\5\u00d8m\2\u08c4\u08c5\7\25\2\2\u08c5\u08c7"+
		"\5\u00d8m\2\u08c6\u08c4\3\2\2\2\u08c7\u08ca\3\2\2\2\u08c8\u08c6\3\2\2"+
		"\2\u08c8\u08c9\3\2\2\2\u08c9\u08cc\3\2\2\2\u08ca\u08c8\3\2\2\2\u08cb\u08cd"+
		"\t\t\2\2\u08cc\u08cb\3\2\2\2\u08cc\u08cd\3\2\2\2\u08cd\u014f\3\2\2\2\u08ce"+
		"\u08d5\7\"\2\2\u08cf\u08d5\7#\2\2\u08d0\u08d5\5\u0160\u00b1\2\u08d1\u08d5"+
		"\5\u0162\u00b2\2\u08d2\u08d5\5\u0164\u00b3\2\u08d3\u08d5\5\u0166\u00b4"+
		"\2\u08d4\u08ce\3\2\2\2\u08d4\u08cf\3\2\2\2\u08d4\u08d0\3\2\2\2\u08d4\u08d1"+
		"\3\2\2\2\u08d4\u08d2\3\2\2\2\u08d4\u08d3\3\2\2\2\u08d5\u0151\3\2\2\2\u08d6"+
		"\u08d7\t\n\2\2\u08d7\u0153\3\2\2\2\u08d8\u08d9\7\u00ad\2\2\u08d9\u08da"+
		"\6\u00ab\62\3\u08da\u0155\3\2\2\2\u08db\u08dc\7\u00ad\2\2\u08dc\u08dd"+
		"\6\u00ac\63\3\u08dd\u0157\3\2\2\2\u08de\u08df\7\u00ad\2\2\u08df\u08e0"+
		"\6\u00ad\64\3\u08e0\u0159\3\2\2\2\u08e1\u08e2\7\u00ad\2\2\u08e2\u08e3"+
		"\6\u00ae\65\3\u08e3\u015b\3\2\2\2\u08e4\u08e5\7\u00ad\2\2\u08e5\u08e6"+
		"\6\u00af\66\3\u08e6\u015d\3\2\2\2\u08e7\u08e8\7/\2\2\u08e8\u015f\3\2\2"+
		"\2\u08e9\u08ea\7$\2\2\u08ea\u0161\3\2\2\2\u08eb\u08ec\7%\2\2\u08ec\u0163"+
		"\3\2\2\2\u08ed\u08ee\7&\2\2\u08ee\u0165\3\2\2\2\u08ef\u08f0\t\13\2\2\u08f0"+
		"\u0167\3\2\2\2\u08f1\u08f2\7\u008f\2\2\u08f2\u08f3\5\u016a\u00b6\2\u08f3"+
		"\u08f4\7\22\2\2\u08f4\u08f9\3\2\2\2\u08f5\u08f6\5\u016a\u00b6\2\u08f6"+
		"\u08f7\7\22\2\2\u08f7\u08f9\3\2\2\2\u08f8\u08f1\3\2\2\2\u08f8\u08f5\3"+
		"\2\2\2\u08f9\u0169\3\2\2\2\u08fa\u08fb\b\u00b6\1\2\u08fb\u08fc\5\u016c"+
		"\u00b7\2\u08fc\u0901\3\2\2\2\u08fd\u08fe\f\3\2\2\u08fe\u0900\5\u0172\u00ba"+
		"\2\u08ff\u08fd\3\2\2\2\u0900\u0903\3\2\2\2\u0901\u08ff\3\2\2\2\u0901\u0902"+
		"\3\2\2\2\u0902\u016b\3\2\2\2\u0903\u0901\3\2\2\2\u0904\u090c\5\u016e\u00b8"+
		"\2\u0905\u090c\5\u0170\u00b9\2\u0906\u090c\5\u017a\u00be\2\u0907\u090c"+
		"\5\u017c\u00bf\2\u0908\u090c\5\u017e\u00c0\2\u0909\u090c\5\u0174\u00bb"+
		"\2\u090a\u090c\5\u0178\u00bd\2\u090b\u0904\3\2\2\2\u090b\u0905\3\2\2\2"+
		"\u090b\u0906\3\2\2\2\u090b\u0907\3\2\2\2\u090b\u0908\3\2\2\2\u090b\u0909"+
		"\3\2\2\2\u090b\u090a\3\2\2\2\u090c\u016d\3\2\2\2\u090d\u090e\5\u011e\u0090"+
		"\2\u090e\u016f\3\2\2\2\u090f\u0910\5\u0154\u00ab\2\u0910\u0911\5\u0174"+
		"\u00bb\2\u0911\u0171\3\2\2\2\u0912\u0913\7\25\2\2\u0913\u0918\5\u0174"+
		"\u00bb\2\u0914\u0915\7\25\2\2\u0915\u0918\5\u0180\u00c1\2\u0916\u0918"+
		"\5\u0178\u00bd\2\u0917\u0912\3\2\2\2\u0917\u0914\3\2\2\2\u0917\u0916\3"+
		"\2\2\2\u0918\u0173\3\2\2\2\u0919\u091a\5\u0180\u00c1\2\u091a\u091c\7\26"+
		"\2\2\u091b\u091d\5\u0176\u00bc\2\u091c\u091b\3\2\2\2\u091c\u091d\3\2\2"+
		"\2\u091d\u091e\3\2\2\2\u091e\u091f\7\27\2\2\u091f\u0175\3\2\2\2\u0920"+
		"\u0921\b\u00bc\1\2\u0921\u0922\5\u016a\u00b6\2\u0922\u0928\3\2\2\2\u0923"+
		"\u0924\f\3\2\2\u0924\u0925\7\23\2\2\u0925\u0927\5\u016a\u00b6\2\u0926"+
		"\u0923\3\2\2\2\u0927\u092a\3\2\2\2\u0928\u0926\3\2\2\2\u0928\u0929\3\2"+
		"\2\2\u0929\u0177\3\2\2\2\u092a\u0928\3\2\2\2\u092b\u092c\7\30\2\2\u092c"+
		"\u092d\5\u016a\u00b6\2\u092d\u092e\7\31\2\2\u092e\u0179\3\2\2\2\u092f"+
		"\u0930\7\26\2\2\u0930\u0931\5\u016a\u00b6\2\u0931\u0932\7\27\2\2\u0932"+
		"\u017b\3\2\2\2\u0933\u0934\5\u0180\u00c1\2\u0934\u017d\3\2\2\2\u0935\u093b"+
		"\7\u00b3\2\2\u0936\u093b\7\u00b5\2\2\u0937\u093b\7\u00b1\2\2\u0938\u093b"+
		"\7\u00a7\2\2\u0939\u093b\7\u00a8\2\2\u093a\u0935\3\2\2\2\u093a\u0936\3"+
		"\2\2\2\u093a\u0937\3\2\2\2\u093a\u0938\3\2\2\2\u093a\u0939\3\2\2\2\u093b"+
		"\u017f\3\2\2\2\u093c\u0942\7\u00ad\2\2\u093d\u0942\7\u00ab\2\2\u093e\u0942"+
		"\7\u00af\2\2\u093f\u0942\7\u00ac\2\2\u0940\u0942\5\u0152\u00aa\2\u0941"+
		"\u093c\3\2\2\2\u0941\u093d\3\2\2\2\u0941\u093e\3\2\2\2\u0941\u093f\3\2"+
		"\2\2\u0941\u0940\3\2\2\2\u0942\u0181\3\2\2\2\u0943\u0944\7\u008f\2\2\u0944"+
		"\u0947\5\u0184\u00c3\2\u0945\u0947\5\u0184\u00c3\2\u0946\u0943\3\2\2\2"+
		"\u0946\u0945\3\2\2\2\u0947\u0183\3\2\2\2\u0948\u0949\b\u00c3\1\2\u0949"+
		"\u094a\5\u0186\u00c4\2\u094a\u094f\3\2\2\2\u094b\u094c\f\3\2\2\u094c\u094e"+
		"\5\u018a\u00c6\2\u094d\u094b\3\2\2\2\u094e\u0951\3\2\2\2\u094f\u094d\3"+
		"\2\2\2\u094f\u0950\3\2\2\2\u0950\u0185\3\2\2\2\u0951\u094f\3\2\2\2\u0952"+
		"\u0958\5\u0188\u00c5\2\u0953\u0958\5\u0194\u00cb\2\u0954\u0958\5\u0196"+
		"\u00cc\2\u0955\u0958\5\u0198\u00cd\2\u0956\u0958\5\u018c\u00c7\2\u0957"+
		"\u0952\3\2\2\2\u0957\u0953\3\2\2\2\u0957\u0954\3\2\2\2\u0957\u0955\3\2"+
		"\2\2\u0957\u0956\3\2\2\2\u0958\u0187\3\2\2\2\u0959\u095a\5\u011e\u0090"+
		"\2\u095a\u0189\3\2\2\2\u095b\u095c\7\25\2\2\u095c\u0962\5\u018c\u00c7"+
		"\2\u095d\u095e\7\30\2\2\u095e\u095f\5\u0184\u00c3\2\u095f\u0960\7\31\2"+
		"\2\u0960\u0962\3\2\2\2\u0961\u095b\3\2\2\2\u0961\u095d\3\2\2\2\u0962\u018b"+
		"\3\2\2\2\u0963\u0964\5\u019a\u00ce\2\u0964\u0966\7\26\2\2\u0965\u0967"+
		"\5\u018e\u00c8\2\u0966\u0965\3\2\2\2\u0966\u0967\3\2\2\2\u0967\u0968\3"+
		"\2\2\2\u0968\u0969\7\27\2\2\u0969\u018d\3\2\2\2\u096a\u0971\5\u0190\u00c9"+
		"\2\u096b\u0971\5\u0192\u00ca\2\u096c\u096d\5\u0190\u00c9\2\u096d\u096e"+
		"\7\23\2\2\u096e\u096f\5\u0192\u00ca\2\u096f\u0971\3\2\2\2\u0970\u096a"+
		"\3\2\2\2\u0970\u096b\3\2\2\2\u0970\u096c\3\2\2\2\u0971\u018f\3\2\2\2\u0972"+
		"\u0973\b\u00c9\1\2\u0973\u0974\5\u0184\u00c3\2\u0974\u097a\3\2\2\2\u0975"+
		"\u0976\f\3\2\2\u0976\u0977\7\23\2\2\u0977\u0979\5\u0184\u00c3\2\u0978"+
		"\u0975\3\2\2\2\u0979\u097c\3\2\2\2\u097a\u0978\3\2\2\2\u097a\u097b\3\2"+
		"\2\2\u097b\u0191\3\2\2\2\u097c\u097a\3\2\2\2\u097d\u097e\b\u00ca\1\2\u097e"+
		"\u097f\5\u019a\u00ce\2\u097f\u0980\7/\2\2\u0980\u0981\5\u0184\u00c3\2"+
		"\u0981\u098a\3\2\2\2\u0982\u0983\f\3\2\2\u0983\u0984\7\23\2\2\u0984\u0985"+
		"\5\u019a\u00ce\2\u0985\u0986\7/\2\2\u0986\u0987\5\u0184\u00c3\2\u0987"+
		"\u0989\3\2\2\2\u0988\u0982\3\2\2\2\u0989\u098c\3\2\2\2\u098a\u0988\3\2"+
		"\2\2\u098a\u098b\3\2\2\2\u098b\u0193\3\2\2\2\u098c\u098a\3\2\2\2\u098d"+
		"\u098e\7\26\2\2\u098e\u098f\5\u0184\u00c3\2\u098f\u0990\7\27\2\2\u0990"+
		"\u0195\3\2\2\2\u0991\u0992\b\u00cc\1\2\u0992\u0995\7\u00af\2\2\u0993\u0995"+
		"\5\u019a\u00ce\2\u0994\u0991\3\2\2\2\u0994\u0993\3\2\2\2\u0995\u099b\3"+
		"\2\2\2\u0996\u0997\f\3\2\2\u0997\u0998\7\25\2\2\u0998\u099a\5\u019a\u00ce"+
		"\2\u0999\u0996\3\2\2\2\u099a\u099d\3\2\2\2\u099b\u0999\3\2\2\2\u099b\u099c"+
		"\3\2\2\2\u099c\u0197\3\2\2\2\u099d\u099b\3\2\2\2\u099e\u09a4\7\u00b3\2"+
		"\2\u099f\u09a4\7\u00b5\2\2\u09a0\u09a4\7\u00b1\2\2\u09a1\u09a4\7\u00a7"+
		"\2\2\u09a2\u09a4\7\u00a8\2\2\u09a3\u099e\3\2\2\2\u09a3\u099f\3\2\2\2\u09a3"+
		"\u09a0\3\2\2\2\u09a3\u09a1\3\2\2\2\u09a3\u09a2\3\2\2\2\u09a4\u0199\3\2"+
		"\2\2\u09a5\u09ab\7\u00ad\2\2\u09a6\u09ab\7\u00ab\2\2\u09a7\u09ab\7\u00af"+
		"\2\2\u09a8\u09ab\7\u00ac\2\2\u09a9\u09ab\5\u0152\u00aa\2\u09aa\u09a5\3"+
		"\2\2\2\u09aa\u09a6\3\2\2\2\u09aa\u09a7\3\2\2\2\u09aa\u09a8\3\2\2\2\u09aa"+
		"\u09a9\3\2\2\2\u09ab\u019b\3\2\2\2\u09ac\u09ad\7\u008f\2\2\u09ad\u09ae"+
		"\5\u019e\u00d0\2";
	private static final String _serializedATNSegment1 =
		"\u09ae\u09af\7\22\2\2\u09af\u09b4\3\2\2\2\u09b0\u09b1\5\u019e\u00d0\2"+
		"\u09b1\u09b2\7\22\2\2\u09b2\u09b4\3\2\2\2\u09b3\u09ac\3\2\2\2\u09b3\u09b0"+
		"\3\2\2\2\u09b4\u019d\3\2\2\2\u09b5\u09b6\b\u00d0\1\2\u09b6\u09b7\5\u01a0"+
		"\u00d1\2\u09b7\u09bc\3\2\2\2\u09b8\u09b9\f\3\2\2\u09b9\u09bb\5\u01a6\u00d4"+
		"\2\u09ba\u09b8\3\2\2\2\u09bb\u09be\3\2\2\2\u09bc\u09ba\3\2\2\2\u09bc\u09bd"+
		"\3\2\2\2\u09bd\u019f\3\2\2\2\u09be\u09bc\3\2\2\2\u09bf\u09c5\5\u01a2\u00d2"+
		"\2\u09c0\u09c5\5\u01a4\u00d3\2\u09c1\u09c5\5\u01ae\u00d8\2\u09c2\u09c5"+
		"\5\u01b0\u00d9\2\u09c3\u09c5\5\u01b4\u00db\2\u09c4\u09bf\3\2\2\2\u09c4"+
		"\u09c0\3\2\2\2\u09c4\u09c1\3\2\2\2\u09c4\u09c2\3\2\2\2\u09c4\u09c3\3\2"+
		"\2\2\u09c5\u01a1\3\2\2\2\u09c6\u09c7\5\u011e\u0090\2\u09c7\u01a3\3\2\2"+
		"\2\u09c8\u09c9\5\u0154\u00ab\2\u09c9\u09ca\5\u01a8\u00d5\2\u09ca\u01a5"+
		"\3\2\2\2\u09cb\u09cc\7\25\2\2\u09cc\u09cf\5\u01a8\u00d5\2\u09cd\u09cf"+
		"\5\u01ac\u00d7\2\u09ce\u09cb\3\2\2\2\u09ce\u09cd\3\2\2\2\u09cf\u01a7\3"+
		"\2\2\2\u09d0\u09d1\5\u01b6\u00dc\2\u09d1\u09d3\7\26\2\2\u09d2\u09d4\5"+
		"\u01aa\u00d6\2\u09d3\u09d2\3\2\2\2\u09d3\u09d4\3\2\2\2\u09d4\u09d5\3\2"+
		"\2\2\u09d5\u09d6\7\27\2\2\u09d6\u01a9\3\2\2\2\u09d7\u09d8\b\u00d6\1\2"+
		"\u09d8\u09d9\5\u019e\u00d0\2\u09d9\u09df\3\2\2\2\u09da\u09db\f\3\2\2\u09db"+
		"\u09dc\7\23\2\2\u09dc\u09de\5\u019e\u00d0\2\u09dd\u09da\3\2\2\2\u09de"+
		"\u09e1\3\2\2\2\u09df\u09dd\3\2\2\2\u09df\u09e0\3\2\2\2\u09e0\u01ab\3\2"+
		"\2\2\u09e1\u09df\3\2\2\2\u09e2\u09e3\7\30\2\2\u09e3\u09e4\5\u019e\u00d0"+
		"\2\u09e4\u09e5\7\31\2\2\u09e5\u01ad\3\2\2\2\u09e6\u09e7\7\26\2\2\u09e7"+
		"\u09e8\5\u019e\u00d0\2\u09e8\u09e9\7\27\2\2\u09e9\u01af\3\2\2\2\u09ea"+
		"\u09eb\b\u00d9\1\2\u09eb\u09ec\5\u01b6\u00dc\2\u09ec\u09f2\3\2\2\2\u09ed"+
		"\u09ee\f\3\2\2\u09ee\u09ef\7\25\2\2\u09ef\u09f1\5\u01b6\u00dc\2\u09f0"+
		"\u09ed\3\2\2\2\u09f1\u09f4\3\2\2\2\u09f2\u09f0\3\2\2\2\u09f2\u09f3\3\2"+
		"\2\2\u09f3\u01b1\3\2\2\2\u09f4\u09f2\3\2\2\2\u09f5\u09f6\b\u00da\1\2\u09f6"+
		"\u09f7\5\u01b0\u00d9\2\u09f7\u09fc\3\2\2\2\u09f8\u09f9\f\3\2\2\u09f9\u09fb"+
		"\7\u00af\2\2\u09fa\u09f8\3\2\2\2\u09fb\u09fe\3\2\2\2\u09fc\u09fa\3\2\2"+
		"\2\u09fc\u09fd\3\2\2\2\u09fd\u01b3\3\2\2\2\u09fe\u09fc\3\2\2\2\u09ff\u0a05"+
		"\7\u00b3\2\2\u0a00\u0a05\7\u00b5\2\2\u0a01\u0a05\7\u00b1\2\2\u0a02\u0a05"+
		"\7\u00a7\2\2\u0a03\u0a05\7\u00a8\2\2\u0a04\u09ff\3\2\2\2\u0a04\u0a00\3"+
		"\2\2\2\u0a04\u0a01\3\2\2\2\u0a04\u0a02\3\2\2\2\u0a04\u0a03\3\2\2\2\u0a05"+
		"\u01b5\3\2\2\2\u0a06\u0a0c\7\u00ad\2\2\u0a07\u0a0c\7\u00ab\2\2\u0a08\u0a0c"+
		"\7\u00af\2\2\u0a09\u0a0c\7\u00ac\2\2\u0a0a\u0a0c\5\u0152\u00aa\2\u0a0b"+
		"\u0a06\3\2\2\2\u0a0b\u0a07\3\2\2\2\u0a0b\u0a08\3\2\2\2\u0a0b\u0a09\3\2"+
		"\2\2\u0a0b\u0a0a\3\2\2\2\u0a0c\u01b7\3\2\2\2\u0a0d\u0a0e\7\u008f\2\2\u0a0e"+
		"\u0a0f\5\u01ba\u00de\2\u0a0f\u0a10\7\22\2\2\u0a10\u0a15\3\2\2\2\u0a11"+
		"\u0a12\5\u01ba\u00de\2\u0a12\u0a13\7\22\2\2\u0a13\u0a15\3\2\2\2\u0a14"+
		"\u0a0d\3\2\2\2\u0a14\u0a11\3\2\2\2\u0a15\u01b9\3\2\2\2\u0a16\u0a17\b\u00de"+
		"\1\2\u0a17\u0a18\5\u01bc\u00df\2\u0a18\u0a1d\3\2\2\2\u0a19\u0a1a\f\3\2"+
		"\2\u0a1a\u0a1c\5\u01c2\u00e2\2\u0a1b\u0a19\3\2\2\2\u0a1c\u0a1f\3\2\2\2"+
		"\u0a1d\u0a1b\3\2\2\2\u0a1d\u0a1e\3\2\2\2\u0a1e\u01bb\3\2\2\2\u0a1f\u0a1d"+
		"\3\2\2\2\u0a20\u0a26\5\u01be\u00e0\2\u0a21\u0a26\5\u01c0\u00e1\2\u0a22"+
		"\u0a26\5\u01ca\u00e6\2\u0a23\u0a26\5\u01cc\u00e7\2\u0a24\u0a26\5\u01ce"+
		"\u00e8\2\u0a25\u0a20\3\2\2\2\u0a25\u0a21\3\2\2\2\u0a25\u0a22\3\2\2\2\u0a25"+
		"\u0a23\3\2\2\2\u0a25\u0a24\3\2\2\2\u0a26\u01bd\3\2\2\2\u0a27\u0a28\5\u011e"+
		"\u0090\2\u0a28\u01bf\3\2\2\2\u0a29\u0a2a\5\u0154\u00ab\2\u0a2a\u0a2b\5"+
		"\u01c4\u00e3\2\u0a2b\u01c1\3\2\2\2\u0a2c\u0a2d\7\25\2\2\u0a2d\u0a30\5"+
		"\u01c4\u00e3\2\u0a2e\u0a30\5\u01c8\u00e5\2\u0a2f\u0a2c\3\2\2\2\u0a2f\u0a2e"+
		"\3\2\2\2\u0a30\u01c3\3\2\2\2\u0a31\u0a32\5\u01d0\u00e9\2\u0a32\u0a34\7"+
		"\26\2\2\u0a33\u0a35\5\u01c6\u00e4\2\u0a34\u0a33\3\2\2\2\u0a34\u0a35\3"+
		"\2\2\2\u0a35\u0a36\3\2\2\2\u0a36\u0a37\7\27\2\2\u0a37\u01c5\3\2\2\2\u0a38"+
		"\u0a39\b\u00e4\1\2\u0a39\u0a3a\5\u01ba\u00de\2\u0a3a\u0a40\3\2\2\2\u0a3b"+
		"\u0a3c\f\3\2\2\u0a3c\u0a3d\7\23\2\2\u0a3d\u0a3f\5\u01ba\u00de\2\u0a3e"+
		"\u0a3b\3\2\2\2\u0a3f\u0a42\3\2\2\2\u0a40\u0a3e\3\2\2\2\u0a40\u0a41\3\2"+
		"\2\2\u0a41\u01c7\3\2\2\2\u0a42\u0a40\3\2\2\2\u0a43\u0a44\7\30\2\2\u0a44"+
		"\u0a45\5\u01ba\u00de\2\u0a45\u0a46\7\31\2\2\u0a46\u01c9\3\2\2\2\u0a47"+
		"\u0a48\7\26\2\2\u0a48\u0a49\5\u01ba\u00de\2\u0a49\u0a4a\7\27\2\2\u0a4a"+
		"\u01cb\3\2\2\2\u0a4b\u0a4c\b\u00e7\1\2\u0a4c\u0a4f\7\u00af\2\2\u0a4d\u0a4f"+
		"\5\u01d0\u00e9\2\u0a4e\u0a4b\3\2\2\2\u0a4e\u0a4d\3\2\2\2\u0a4f\u0a55\3"+
		"\2\2\2\u0a50\u0a51\f\3\2\2\u0a51\u0a52\7\25\2\2\u0a52\u0a54\5\u01d0\u00e9"+
		"\2\u0a53\u0a50\3\2\2\2\u0a54\u0a57\3\2\2\2\u0a55\u0a53\3\2\2\2\u0a55\u0a56"+
		"\3\2\2\2\u0a56\u01cd\3\2\2\2\u0a57\u0a55\3\2\2\2\u0a58\u0a5e\7\u00b3\2"+
		"\2\u0a59\u0a5e\7\u00b5\2\2\u0a5a\u0a5e\7\u00b1\2\2\u0a5b\u0a5e\7\u00a7"+
		"\2\2\u0a5c\u0a5e\7\u00a8\2\2\u0a5d\u0a58\3\2\2\2\u0a5d\u0a59\3\2\2\2\u0a5d"+
		"\u0a5a\3\2\2\2\u0a5d\u0a5b\3\2\2\2\u0a5d\u0a5c\3\2\2\2\u0a5e\u01cf\3\2"+
		"\2\2\u0a5f\u0a65\7\u00ad\2\2\u0a60\u0a65\7\u00ab\2\2\u0a61\u0a65\7\u00af"+
		"\2\2\u0a62\u0a65\7\u00ac\2\2\u0a63\u0a65\5\u0152\u00aa\2\u0a64\u0a5f\3"+
		"\2\2\2\u0a64\u0a60\3\2\2\2\u0a64\u0a61\3\2\2\2\u0a64\u0a62\3\2\2\2\u0a64"+
		"\u0a63\3\2\2\2\u0a65\u01d1\3\2\2\2\u0a66\u0a69\5\u01d4\u00eb\2\u0a67\u0a69"+
		"\5\u01d6\u00ec\2\u0a68\u0a66\3\2\2\2\u0a68\u0a67\3\2\2\2\u0a69\u01d3\3"+
		"\2\2\2\u0a6a\u0a72\5\u01dc\u00ef\2\u0a6b\u0a6d\5\u01de\u00f0\2\u0a6c\u0a6e"+
		"\5\u01ea\u00f6\2\u0a6d\u0a6c\3\2\2\2\u0a6d\u0a6e\3\2\2\2\u0a6e\u0a6f\3"+
		"\2\2\2\u0a6f\u0a70\5\u01e0\u00f1\2\u0a70\u0a72\3\2\2\2\u0a71\u0a6a\3\2"+
		"\2\2\u0a71\u0a6b\3\2\2\2\u0a72\u01d5\3\2\2\2\u0a73\u0a74\5\u01d8\u00ed"+
		"\2\u0a74\u0a76\5\u008aF\2\u0a75\u0a77\5\u01ea\u00f6\2\u0a76\u0a75\3\2"+
		"\2\2\u0a76\u0a77\3\2\2\2\u0a77\u0a78\3\2\2\2\u0a78\u0a79\5\u008aF\2\u0a79"+
		"\u0a7a\5\u01da\u00ee\2\u0a7a\u01d7\3\2\2\2\u0a7b\u0a7c\7+\2\2\u0a7c\u0a7f"+
		"\7)\2\2\u0a7d\u0a7f\7-\2\2\u0a7e\u0a7b\3\2\2\2\u0a7e\u0a7d\3\2\2\2\u0a7f"+
		"\u01d9\3\2\2\2\u0a80\u0a81\7+\2\2\u0a81\u0a82\7%\2\2\u0a82\u0a83\7)\2"+
		"\2\u0a83\u01db\3\2\2\2\u0a84\u0a85\7+\2\2\u0a85\u0a86\5\u01e2\u00f2\2"+
		"\u0a86\u0a8a\5\u008aF\2\u0a87\u0a89\5\u01e6\u00f4\2\u0a88\u0a87\3\2\2"+
		"\2\u0a89\u0a8c\3\2\2\2\u0a8a\u0a88\3\2\2\2\u0a8a\u0a8b\3\2\2\2\u0a8b\u0a8d"+
		"\3\2\2\2\u0a8c\u0a8a\3\2\2\2\u0a8d\u0a8e\7%\2\2\u0a8e\u0a8f\7)\2\2\u0a8f"+
		"\u01dd\3\2\2\2\u0a90\u0a91\7+\2\2\u0a91\u0a92\5\u01e2\u00f2\2\u0a92\u0a96"+
		"\5\u008aF\2\u0a93\u0a95\5\u01e6\u00f4\2\u0a94\u0a93\3\2\2\2\u0a95\u0a98"+
		"\3\2\2\2\u0a96\u0a94\3\2\2\2\u0a96\u0a97\3\2\2\2\u0a97\u0a99\3\2\2\2\u0a98"+
		"\u0a96\3\2\2\2\u0a99\u0a9a\7)\2\2\u0a9a\u01df\3\2\2\2\u0a9b\u0a9c\7+\2"+
		"\2\u0a9c\u0a9d\7%\2\2\u0a9d\u0a9e\5\u01e2\u00f2\2\u0a9e\u0a9f\7)\2\2\u0a9f"+
		"\u01e1\3\2\2\2\u0aa0\u0aa5\5\u01e4\u00f3\2\u0aa1\u0aa2\7\25\2\2\u0aa2"+
		"\u0aa4\5\u01e4\u00f3\2\u0aa3\u0aa1\3\2\2\2\u0aa4\u0aa7\3\2\2\2\u0aa5\u0aa3"+
		"\3\2\2\2\u0aa5\u0aa6\3\2\2\2\u0aa6\u01e3\3\2\2\2\u0aa7\u0aa5\3\2\2\2\u0aa8"+
		"\u0aac\5\u00ceh\2\u0aa9\u0aab\5\u00d0i\2\u0aaa\u0aa9\3\2\2\2\u0aab\u0aae"+
		"\3\2\2\2\u0aac\u0aaa\3\2\2\2\u0aac\u0aad\3\2\2\2\u0aad\u01e5\3\2\2\2\u0aae"+
		"\u0aac\3\2\2\2\u0aaf\u0ab2\5\u01e4\u00f3\2\u0ab0\u0ab1\7/\2\2\u0ab1\u0ab3"+
		"\5\u01e8\u00f5\2\u0ab2\u0ab0\3\2\2\2\u0ab2\u0ab3\3\2\2\2\u0ab3\u0ab4\3"+
		"\2\2\2\u0ab4\u0ab5\5\u008aF\2\u0ab5\u01e7\3\2\2\2\u0ab6\u0abc\7\u00b1"+
		"\2\2\u0ab7\u0ab8\7\32\2\2\u0ab8\u0ab9\5\\/\2\u0ab9\u0aba\7\33\2\2\u0aba"+
		"\u0abc\3\2\2\2\u0abb\u0ab6\3\2\2\2\u0abb\u0ab7\3\2\2\2\u0abc\u01e9\3\2"+
		"\2\2\u0abd\u0abf\5\u01ec\u00f7\2\u0abe\u0abd\3\2\2\2\u0abf\u0ac0\3\2\2"+
		"\2\u0ac0\u0abe\3\2\2\2\u0ac0\u0ac1\3\2\2\2\u0ac1\u01eb\3\2\2\2\u0ac2\u0aca"+
		"\5\u01ee\u00f8\2\u0ac3\u0aca\5\u01d4\u00eb\2\u0ac4\u0ac6\7\32\2\2\u0ac5"+
		"\u0ac7\5\\/\2\u0ac6\u0ac5\3\2\2\2\u0ac6\u0ac7\3\2\2\2\u0ac7\u0ac8\3\2"+
		"\2\2\u0ac8\u0aca\7\33\2\2\u0ac9\u0ac2\3\2\2\2\u0ac9\u0ac3\3\2\2\2\u0ac9"+
		"\u0ac4\3\2\2\2\u0aca\u01ed\3\2\2\2\u0acb\u0acd\5\u01f0\u00f9\2\u0acc\u0acb"+
		"\3\2\2\2\u0acd\u0ace\3\2\2\2\u0ace\u0acc\3\2\2\2\u0ace\u0acf\3\2\2\2\u0acf"+
		"\u01ef\3\2\2\2\u0ad0\u0ad3\n\f\2\2\u0ad1\u0ad3\7\u00bb\2\2\u0ad2\u0ad0"+
		"\3\2\2\2\u0ad2\u0ad1\3\2\2\2\u0ad3\u01f1\3\2\2\2\u0ad4\u0ad6\7\32\2\2"+
		"\u0ad5\u0ad7\5\u01f4\u00fb\2\u0ad6\u0ad5\3\2\2\2\u0ad7\u0ad8\3\2\2\2\u0ad8"+
		"\u0ad6\3\2\2\2\u0ad8\u0ad9\3\2\2\2\u0ad9\u0ada\3\2\2\2\u0ada\u0adb\7\33"+
		"\2\2\u0adb\u01f3\3\2\2\2\u0adc\u0add\5\u01f6\u00fc\2\u0add\u0ade\7\21"+
		"\2\2\u0ade\u0adf\5\u01f8\u00fd\2\u0adf\u0ae0\7\22\2\2\u0ae0\u01f5\3\2"+
		"\2\2\u0ae1\u0ae2\b\u00fc\1\2\u0ae2\u0ae6\5\u00ceh\2\u0ae3\u0ae4\7#\2\2"+
		"\u0ae4\u0ae6\5\u00d2j\2\u0ae5\u0ae1\3\2\2\2\u0ae5\u0ae3\3\2\2\2\u0ae6"+
		"\u0aef\3\2\2\2\u0ae7\u0ae9\f\3\2\2\u0ae8\u0aea\5\u00d0i\2\u0ae9\u0ae8"+
		"\3\2\2\2\u0aea\u0aeb\3\2\2\2\u0aeb\u0ae9\3\2\2\2\u0aeb\u0aec\3\2\2\2\u0aec"+
		"\u0aee\3\2\2\2\u0aed\u0ae7\3\2\2\2\u0aee\u0af1\3\2\2\2\u0aef\u0aed\3\2"+
		"\2\2\u0aef\u0af0\3\2\2\2\u0af0\u01f7\3\2\2\2\u0af1\u0aef\3\2\2\2\u0af2"+
		"\u0af3\7\32\2\2\u0af3\u0af4\5\\/\2\u0af4\u0af5\7\33\2\2\u0af5\u0af8\3"+
		"\2\2\2\u0af6\u0af8\5\u01fa\u00fe\2\u0af7\u0af2\3\2\2\2\u0af7\u0af6\3\2"+
		"\2\2\u0af8\u01f9\3\2\2\2\u0af9\u0afb\n\r\2\2\u0afa\u0af9\3\2\2\2\u0afb"+
		"\u0afc\3\2\2\2\u0afc\u0afd\3\2\2\2\u0afc\u0afa\3\2\2\2\u0afd\u01fb\3\2"+
		"\2\2\u00fe\u0202\u0205\u021e\u0223\u0231\u0237\u0239\u023b\u023f\u0244"+
		"\u024c\u0253\u0264\u026f\u0276\u027a\u0285\u0293\u02a7\u02be\u02c9\u02d0"+
		"\u02d9\u02de\u02e5\u02ee\u0303\u030b\u0310\u0313\u0319\u031e\u0321\u0327"+
		"\u032d\u0332\u0337\u034f\u035a\u035e\u0374\u0384\u038b\u0393\u0398\u039f"+
		"\u03a5\u03ac\u03c9\u03dc\u03e2\u0404\u040d\u0424\u0432\u043b\u0444\u045b"+
		"\u0461\u0478\u04e1\u04eb\u04ed\u04f8\u0501\u050c\u0518\u0526\u052b\u0534"+
		"\u053d\u0544\u0548\u0554\u055b\u0562\u056c\u0574\u057f\u0583\u0588\u058d"+
		"\u058f\u0594\u05a7\u05ab\u05b0\u05b5\u05bf\u05c3\u05cc\u05dc\u05e5\u05eb"+
		"\u05f0\u05f6\u05fd\u0609\u060c\u0617\u061f\u0627\u0630\u063a\u063d\u0641"+
		"\u064d\u0653\u065b\u0664\u066c\u0679\u067c\u0680\u0685\u0689\u0692\u06a7"+
		"\u06b0\u06b2\u06b7\u06ca\u06cf\u06d8\u06dc\u06e3\u06e8\u06ec\u06f8\u0709"+
		"\u070e\u0711\u0715\u071a\u0721\u072c\u072e\u0737\u073f\u0747\u074f\u0757"+
		"\u075d\u0769\u076d\u0777\u077f\u0783\u0789\u0790\u0795\u079c\u07a4\u07ab"+
		"\u07b5\u07c2\u07c6\u07c9\u07cd\u07d0\u07d8\u07e1\u07ea\u07f3\u0804\u0817"+
		"\u081e\u0826\u0830\u0838\u083b\u083f\u0844\u084e\u0852\u085d\u0860\u0867"+
		"\u0870\u087b\u0888\u088f\u0899\u08a3\u08a6\u08aa\u08c0\u08c8\u08cc\u08d4"+
		"\u08f8\u0901\u090b\u0917\u091c\u0928\u093a\u0941\u0946\u094f\u0957\u0961"+
		"\u0966\u0970\u097a\u098a\u0994\u099b\u09a3\u09aa\u09b3\u09bc\u09c4\u09ce"+
		"\u09d3\u09df\u09f2\u09fc\u0a04\u0a0b\u0a14\u0a1d\u0a25\u0a2f\u0a34\u0a40"+
		"\u0a4e\u0a55\u0a5d\u0a64\u0a68\u0a6d\u0a71\u0a76\u0a7e\u0a8a\u0a96\u0aa5"+
		"\u0aac\u0ab2\u0abb\u0ac0\u0ac6\u0ac9\u0ace\u0ad2\u0ad8\u0ae5\u0aeb\u0aef"+
		"\u0af7\u0afc";
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