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
		PLUS=32, MINUS=33, STAR=34, SLASH=35, BSLASH=36, PERCENT=37, GT=38, GTE=39, 
		LT=40, LTE=41, LTGT=42, LTCOLONGT=43, EQ=44, XEQ=45, EQ2=46, TEQ=47, TILDE=48, 
		LARROW=49, RARROW=50, EGT=51, BOOLEAN=52, CSS=53, CHARACTER=54, TEXT=55, 
		INTEGER=56, DECIMAL=57, DATE=58, TIME=59, DATETIME=60, PERIOD=61, VERSION=62, 
		METHOD_COLON=63, CODE=64, DOCUMENT=65, BLOB=66, IMAGE=67, UUID=68, ITERATOR=69, 
		CURSOR=70, HTML=71, TYPE=72, ABSTRACT=73, ALL=74, ALWAYS=75, AND=76, ANY=77, 
		AS=78, ASC=79, ATTR=80, ATTRIBUTE=81, ATTRIBUTES=82, BINDINGS=83, BREAK=84, 
		BY=85, CASE=86, CATCH=87, CATEGORY=88, CLASS=89, CLOSE=90, CONTAINS=91, 
		DEF=92, DEFAULT=93, DEFINE=94, DELETE=95, DESC=96, DO=97, DOING=98, EACH=99, 
		ELSE=100, ENUM=101, ENUMERATED=102, EXCEPT=103, EXECUTE=104, EXPECTING=105, 
		EXTENDS=106, FETCH=107, FILTERED=108, FINALLY=109, FLUSH=110, FOR=111, 
		FROM=112, GETTER=113, HAS=114, IF=115, IN=116, INDEX=117, INVOKE_COLON=118, 
		IS=119, MATCHING=120, METHOD=121, METHODS=122, MODULO=123, MUTABLE=124, 
		NATIVE=125, NONE=126, NOT=127, NOTHING=128, NULL=129, ON=130, ONE=131, 
		OPEN=132, OPERATOR=133, OR=134, ORDER=135, OTHERWISE=136, PASS=137, RAISE=138, 
		READ=139, RECEIVING=140, RESOURCE=141, RETURN=142, RETURNING=143, ROWS=144, 
		SELF=145, SETTER=146, SINGLETON=147, SORTED=148, STORABLE=149, STORE=150, 
		SWITCH=151, TEST=152, THEN=153, THIS=154, THROW=155, TO=156, TRY=157, 
		VERIFYING=158, WIDGET=159, WITH=160, WHEN=161, WHERE=162, WHILE=163, WRITE=164, 
		BOOLEAN_LITERAL=165, CHAR_LITERAL=166, MIN_INTEGER=167, MAX_INTEGER=168, 
		SYMBOL_IDENTIFIER=169, TYPE_IDENTIFIER=170, VARIABLE_IDENTIFIER=171, NATIVE_IDENTIFIER=172, 
		DOLLAR_IDENTIFIER=173, ARONDBASE_IDENTIFIER=174, TEXT_LITERAL=175, UUID_LITERAL=176, 
		INTEGER_LITERAL=177, HEXA_LITERAL=178, DECIMAL_LITERAL=179, DATETIME_LITERAL=180, 
		TIME_LITERAL=181, DATE_LITERAL=182, PERIOD_LITERAL=183, VERSION_LITERAL=184;
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
		RULE_nospace_identifier_or_keyword = 104, RULE_identifier = 105, RULE_variable_identifier = 106, 
		RULE_attribute_identifier = 107, RULE_type_identifier = 108, RULE_symbol_identifier = 109, 
		RULE_argument_list = 110, RULE_argument = 111, RULE_operator_argument = 112, 
		RULE_named_argument = 113, RULE_code_argument = 114, RULE_category_or_any_type = 115, 
		RULE_any_type = 116, RULE_member_method_declaration_list = 117, RULE_member_method_declaration = 118, 
		RULE_native_member_method_declaration_list = 119, RULE_native_member_method_declaration = 120, 
		RULE_native_category_binding = 121, RULE_python_category_binding = 122, 
		RULE_python_module = 123, RULE_javascript_category_binding = 124, RULE_javascript_module = 125, 
		RULE_variable_identifier_list = 126, RULE_attribute_identifier_list = 127, 
		RULE_method_declaration = 128, RULE_comment_statement = 129, RULE_native_statement_list = 130, 
		RULE_native_statement = 131, RULE_python_native_statement = 132, RULE_javascript_native_statement = 133, 
		RULE_statement_list = 134, RULE_assertion_list = 135, RULE_switch_case_statement_list = 136, 
		RULE_catch_statement_list = 137, RULE_literal_collection = 138, RULE_atomic_literal = 139, 
		RULE_literal_list_literal = 140, RULE_this_expression = 141, RULE_parenthesis_expression = 142, 
		RULE_literal_expression = 143, RULE_collection_literal = 144, RULE_tuple_literal = 145, 
		RULE_dict_literal = 146, RULE_document_literal = 147, RULE_expression_tuple = 148, 
		RULE_dict_entry_list = 149, RULE_dict_entry = 150, RULE_dict_key = 151, 
		RULE_slice_arguments = 152, RULE_assign_variable_statement = 153, RULE_assignable_instance = 154, 
		RULE_is_expression = 155, RULE_arrow_expression = 156, RULE_arrow_prefix = 157, 
		RULE_arrow_args = 158, RULE_sorted_key = 159, RULE_read_all_expression = 160, 
		RULE_read_one_expression = 161, RULE_order_by_list = 162, RULE_order_by = 163, 
		RULE_operator = 164, RULE_keyword = 165, RULE_new_token = 166, RULE_key_token = 167, 
		RULE_module_token = 168, RULE_value_token = 169, RULE_symbols_token = 170, 
		RULE_assign = 171, RULE_multiply = 172, RULE_divide = 173, RULE_idivide = 174, 
		RULE_modulo = 175, RULE_javascript_statement = 176, RULE_javascript_expression = 177, 
		RULE_javascript_primary_expression = 178, RULE_javascript_this_expression = 179, 
		RULE_javascript_new_expression = 180, RULE_javascript_selector_expression = 181, 
		RULE_javascript_method_expression = 182, RULE_javascript_arguments = 183, 
		RULE_javascript_item_expression = 184, RULE_javascript_parenthesis_expression = 185, 
		RULE_javascript_identifier_expression = 186, RULE_javascript_literal_expression = 187, 
		RULE_javascript_identifier = 188, RULE_python_statement = 189, RULE_python_expression = 190, 
		RULE_python_primary_expression = 191, RULE_python_self_expression = 192, 
		RULE_python_selector_expression = 193, RULE_python_method_expression = 194, 
		RULE_python_argument_list = 195, RULE_python_ordinal_argument_list = 196, 
		RULE_python_named_argument_list = 197, RULE_python_parenthesis_expression = 198, 
		RULE_python_identifier_expression = 199, RULE_python_literal_expression = 200, 
		RULE_python_identifier = 201, RULE_java_statement = 202, RULE_java_expression = 203, 
		RULE_java_primary_expression = 204, RULE_java_this_expression = 205, RULE_java_new_expression = 206, 
		RULE_java_selector_expression = 207, RULE_java_method_expression = 208, 
		RULE_java_arguments = 209, RULE_java_item_expression = 210, RULE_java_parenthesis_expression = 211, 
		RULE_java_identifier_expression = 212, RULE_java_class_identifier_expression = 213, 
		RULE_java_literal_expression = 214, RULE_java_identifier = 215, RULE_csharp_statement = 216, 
		RULE_csharp_expression = 217, RULE_csharp_primary_expression = 218, RULE_csharp_this_expression = 219, 
		RULE_csharp_new_expression = 220, RULE_csharp_selector_expression = 221, 
		RULE_csharp_method_expression = 222, RULE_csharp_arguments = 223, RULE_csharp_item_expression = 224, 
		RULE_csharp_parenthesis_expression = 225, RULE_csharp_identifier_expression = 226, 
		RULE_csharp_literal_expression = 227, RULE_csharp_identifier = 228, RULE_jsx_expression = 229, 
		RULE_jsx_element = 230, RULE_jsx_fragment = 231, RULE_jsx_fragment_start = 232, 
		RULE_jsx_fragment_end = 233, RULE_jsx_self_closing = 234, RULE_jsx_opening = 235, 
		RULE_jsx_closing = 236, RULE_jsx_element_name = 237, RULE_jsx_identifier = 238, 
		RULE_jsx_attribute = 239, RULE_jsx_attribute_value = 240, RULE_jsx_children = 241, 
		RULE_jsx_child = 242, RULE_jsx_text = 243, RULE_css_expression = 244, 
		RULE_css_field = 245, RULE_css_identifier = 246, RULE_css_value = 247, 
		RULE_css_text = 248;
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
		"nospace_identifier_or_keyword", "identifier", "variable_identifier", 
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
		"this_expression", "parenthesis_expression", "literal_expression", "collection_literal", 
		"tuple_literal", "dict_literal", "document_literal", "expression_tuple", 
		"dict_entry_list", "dict_entry", "dict_key", "slice_arguments", "assign_variable_statement", 
		"assignable_instance", "is_expression", "arrow_expression", "arrow_prefix", 
		"arrow_args", "sorted_key", "read_all_expression", "read_one_expression", 
		"order_by_list", "order_by", "operator", "keyword", "new_token", "key_token", 
		"module_token", "value_token", "symbols_token", "assign", "multiply", 
		"divide", "idivide", "modulo", "javascript_statement", "javascript_expression", 
		"javascript_primary_expression", "javascript_this_expression", "javascript_new_expression", 
		"javascript_selector_expression", "javascript_method_expression", "javascript_arguments", 
		"javascript_item_expression", "javascript_parenthesis_expression", "javascript_identifier_expression", 
		"javascript_literal_expression", "javascript_identifier", "python_statement", 
		"python_expression", "python_primary_expression", "python_self_expression", 
		"python_selector_expression", "python_method_expression", "python_argument_list", 
		"python_ordinal_argument_list", "python_named_argument_list", "python_parenthesis_expression", 
		"python_identifier_expression", "python_literal_expression", "python_identifier", 
		"java_statement", "java_expression", "java_primary_expression", "java_this_expression", 
		"java_new_expression", "java_selector_expression", "java_method_expression", 
		"java_arguments", "java_item_expression", "java_parenthesis_expression", 
		"java_identifier_expression", "java_class_identifier_expression", "java_literal_expression", 
		"java_identifier", "csharp_statement", "csharp_expression", "csharp_primary_expression", 
		"csharp_this_expression", "csharp_new_expression", "csharp_selector_expression", 
		"csharp_method_expression", "csharp_arguments", "csharp_item_expression", 
		"csharp_parenthesis_expression", "csharp_identifier_expression", "csharp_literal_expression", 
		"csharp_identifier", "jsx_expression", "jsx_element", "jsx_fragment", 
		"jsx_fragment_start", "jsx_fragment_end", "jsx_self_closing", "jsx_opening", 
		"jsx_closing", "jsx_element_name", "jsx_identifier", "jsx_attribute", 
		"jsx_attribute_value", "jsx_children", "jsx_child", "jsx_text", "css_expression", 
		"css_field", "css_identifier", "css_value", "css_text"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, "'\t'", "' '", null, "'Java:'", "'C#:'", 
		"'Python2:'", "'Python3:'", "'JavaScript:'", "'Swift:'", "':'", "';'", 
		null, "'..'", null, null, null, null, null, null, null, null, "'!'", "'&'", 
		"'&&'", "'|'", "'||'", null, "'-'", "'*'", "'/'", "'\\'", "'%'", "'>'", 
		"'>='", "'<'", "'<='", "'<>'", "'<:>'", "'='", "'!='", "'=='", "'~='", 
		"'~'", "'<-'", "'->'", "'=>'", "'Boolean'", "'Css'", "'Character'", "'Text'", 
		"'Integer'", "'Decimal'", "'Date'", "'Time'", "'DateTime'", "'Period'", 
		"'Version'", "'Method:'", "'Code'", "'Document'", "'Blob'", "'Image'", 
		"'Uuid'", "'Iterator'", "'Cursor'", "'Html'", "'Type'", "'abstract'", 
		"'all'", "'always'", "'and'", "'any'", "'as'", null, "'attr'", "'attribute'", 
		"'attributes'", "'bindings'", "'break'", "'by'", "'case'", "'catch'", 
		"'category'", "'class'", "'close'", "'contains'", "'def'", "'default'", 
		"'define'", "'delete'", null, "'do'", "'doing'", "'each'", "'else'", "'enum'", 
		"'enumerated'", "'except'", "'execute'", "'expecting'", "'extends'", "'fetch'", 
		"'filtered'", "'finally'", "'flush'", "'for'", "'from'", "'getter'", "'has'", 
		"'if'", "'in'", "'index'", "'invoke:'", "'is'", "'matching'", "'method'", 
		"'methods'", "'modulo'", "'mutable'", "'native'", "'None'", "'not'", null, 
		"'null'", "'on'", "'one'", "'open'", "'operator'", "'or'", "'order'", 
		"'otherwise'", "'pass'", "'raise'", "'read'", "'receiving'", "'resource'", 
		"'return'", "'returning'", "'rows'", "'self'", "'setter'", "'singleton'", 
		"'sorted'", "'storable'", "'store'", "'switch'", "'test'", "'then'", "'this'", 
		"'throw'", "'to'", "'try'", "'verifying'", "'widget'", "'with'", "'when'", 
		"'where'", "'while'", "'write'", null, null, "'MIN_INTEGER'", "'MAX_INTEGER'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INDENT", "DEDENT", "LF_TAB", "LF_MORE", "LF", "TAB", "WS", "COMMENT", 
		"JAVA", "CSHARP", "PYTHON2", "PYTHON3", "JAVASCRIPT", "SWIFT", "COLON", 
		"SEMI", "COMMA", "RANGE", "DOT", "LPAR", "RPAR", "LBRAK", "RBRAK", "LCURL", 
		"RCURL", "QMARK", "XMARK", "AMP", "AMP2", "PIPE", "PIPE2", "PLUS", "MINUS", 
		"STAR", "SLASH", "BSLASH", "PERCENT", "GT", "GTE", "LT", "LTE", "LTGT", 
		"LTCOLONGT", "EQ", "XEQ", "EQ2", "TEQ", "TILDE", "LARROW", "RARROW", "EGT", 
		"BOOLEAN", "CSS", "CHARACTER", "TEXT", "INTEGER", "DECIMAL", "DATE", "TIME", 
		"DATETIME", "PERIOD", "VERSION", "METHOD_COLON", "CODE", "DOCUMENT", "BLOB", 
		"IMAGE", "UUID", "ITERATOR", "CURSOR", "HTML", "TYPE", "ABSTRACT", "ALL", 
		"ALWAYS", "AND", "ANY", "AS", "ASC", "ATTR", "ATTRIBUTE", "ATTRIBUTES", 
		"BINDINGS", "BREAK", "BY", "CASE", "CATCH", "CATEGORY", "CLASS", "CLOSE", 
		"CONTAINS", "DEF", "DEFAULT", "DEFINE", "DELETE", "DESC", "DO", "DOING", 
		"EACH", "ELSE", "ENUM", "ENUMERATED", "EXCEPT", "EXECUTE", "EXPECTING", 
		"EXTENDS", "FETCH", "FILTERED", "FINALLY", "FLUSH", "FOR", "FROM", "GETTER", 
		"HAS", "IF", "IN", "INDEX", "INVOKE_COLON", "IS", "MATCHING", "METHOD", 
		"METHODS", "MODULO", "MUTABLE", "NATIVE", "NONE", "NOT", "NOTHING", "NULL", 
		"ON", "ONE", "OPEN", "OPERATOR", "OR", "ORDER", "OTHERWISE", "PASS", "RAISE", 
		"READ", "RECEIVING", "RESOURCE", "RETURN", "RETURNING", "ROWS", "SELF", 
		"SETTER", "SINGLETON", "SORTED", "STORABLE", "STORE", "SWITCH", "TEST", 
		"THEN", "THIS", "THROW", "TO", "TRY", "VERIFYING", "WIDGET", "WITH", "WHEN", 
		"WHERE", "WHILE", "WRITE", "BOOLEAN_LITERAL", "CHAR_LITERAL", "MIN_INTEGER", 
		"MAX_INTEGER", "SYMBOL_IDENTIFIER", "TYPE_IDENTIFIER", "VARIABLE_IDENTIFIER", 
		"NATIVE_IDENTIFIER", "DOLLAR_IDENTIFIER", "ARONDBASE_IDENTIFIER", "TEXT_LITERAL", 
		"UUID_LITERAL", "INTEGER_LITERAL", "HEXA_LITERAL", "DECIMAL_LITERAL", 
		"DATETIME_LITERAL", "TIME_LITERAL", "DATE_LITERAL", "PERIOD_LITERAL", 
		"VERSION_LITERAL"
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
			setState(498);
			match(ENUM);
			setState(499);
			((Enum_category_declarationContext)_localctx).name = type_identifier();
			setState(500);
			match(LPAR);
			setState(507);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE_IDENTIFIER:
				{
				setState(501);
				((Enum_category_declarationContext)_localctx).derived = type_identifier();
				setState(504);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(502);
					match(COMMA);
					setState(503);
					((Enum_category_declarationContext)_localctx).attrs = attribute_identifier_list();
					}
				}

				}
				break;
			case STORABLE:
			case VARIABLE_IDENTIFIER:
				{
				setState(506);
				((Enum_category_declarationContext)_localctx).attrs = attribute_identifier_list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(509);
			match(RPAR);
			setState(510);
			match(COLON);
			setState(511);
			indent();
			setState(512);
			((Enum_category_declarationContext)_localctx).symbols = category_symbol_list();
			setState(513);
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
			setState(515);
			match(ENUM);
			setState(516);
			((Enum_native_declarationContext)_localctx).name = type_identifier();
			setState(517);
			match(LPAR);
			setState(518);
			((Enum_native_declarationContext)_localctx).typ = native_type();
			setState(519);
			match(RPAR);
			setState(520);
			match(COLON);
			setState(521);
			indent();
			setState(522);
			((Enum_native_declarationContext)_localctx).symbols = native_symbol_list();
			setState(523);
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
			setState(525);
			((Native_symbolContext)_localctx).name = symbol_identifier();
			setState(526);
			match(EQ);
			setState(527);
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
			setState(529);
			((Category_symbolContext)_localctx).name = symbol_identifier();
			setState(530);
			match(LPAR);
			setState(532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << LTCOLONGT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CODE - 64)) | (1L << (DOCUMENT - 64)) | (1L << (BLOB - 64)) | (1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (ANY - 64)) | (1L << (EXECUTE - 64)) | (1L << (FETCH - 64)) | (1L << (MUTABLE - 64)) | (1L << (NONE - 64)) | (1L << (NOT - 64)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (READ - 139)) | (1L << (SELF - 139)) | (1L << (SORTED - 139)) | (1L << (THIS - 139)) | (1L << (BOOLEAN_LITERAL - 139)) | (1L << (CHAR_LITERAL - 139)) | (1L << (MIN_INTEGER - 139)) | (1L << (MAX_INTEGER - 139)) | (1L << (SYMBOL_IDENTIFIER - 139)) | (1L << (TYPE_IDENTIFIER - 139)) | (1L << (VARIABLE_IDENTIFIER - 139)) | (1L << (TEXT_LITERAL - 139)) | (1L << (UUID_LITERAL - 139)) | (1L << (INTEGER_LITERAL - 139)) | (1L << (HEXA_LITERAL - 139)) | (1L << (DECIMAL_LITERAL - 139)) | (1L << (DATETIME_LITERAL - 139)) | (1L << (TIME_LITERAL - 139)) | (1L << (DATE_LITERAL - 139)) | (1L << (PERIOD_LITERAL - 139)) | (1L << (VERSION_LITERAL - 139)))) != 0)) {
				{
				setState(531);
				((Category_symbolContext)_localctx).args = argument_assignment_list(0);
				}
			}

			setState(534);
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
			setState(537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STORABLE) {
				{
				setState(536);
				match(STORABLE);
				}
			}

			setState(539);
			match(ATTR);
			setState(540);
			((Attribute_declarationContext)_localctx).name = attribute_identifier();
			setState(541);
			match(LPAR);
			setState(542);
			((Attribute_declarationContext)_localctx).typ = typedef(0);
			setState(543);
			match(RPAR);
			setState(565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(544);
				match(COLON);
				setState(545);
				indent();
				setState(561);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PASS:
					{
					setState(546);
					match(PASS);
					}
					break;
				case IN:
				case INDEX:
				case MATCHING:
					{
					setState(559);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IN:
					case MATCHING:
						{
						setState(547);
						((Attribute_declarationContext)_localctx).match = attribute_constraint();
						setState(551);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
						case 1:
							{
							setState(548);
							lfp();
							setState(549);
							((Attribute_declarationContext)_localctx).indices = index_clause();
							}
							break;
						}
						}
						break;
					case INDEX:
						{
						setState(553);
						((Attribute_declarationContext)_localctx).indices = index_clause();
						setState(557);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
						case 1:
							{
							setState(554);
							lfp();
							setState(555);
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
				setState(563);
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
			setState(567);
			match(INDEX);
			setState(568);
			match(LPAR);
			setState(570);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARIABLE_IDENTIFIER) {
				{
				setState(569);
				((Index_clauseContext)_localctx).indices = variable_identifier_list();
				}
			}

			setState(572);
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
			setState(574);
			match(WIDGET);
			setState(575);
			((Concrete_widget_declarationContext)_localctx).name = type_identifier();
			setState(576);
			match(LPAR);
			setState(578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE_IDENTIFIER) {
				{
				setState(577);
				((Concrete_widget_declarationContext)_localctx).derived = type_identifier();
				}
			}

			setState(580);
			match(RPAR);
			setState(581);
			match(COLON);
			setState(582);
			indent();
			setState(585);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMENT:
			case ABSTRACT:
			case DEF:
			case ARONDBASE_IDENTIFIER:
				{
				setState(583);
				((Concrete_widget_declarationContext)_localctx).methods = member_method_declaration_list();
				}
				break;
			case PASS:
				{
				setState(584);
				match(PASS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(587);
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
			setState(589);
			match(NATIVE);
			setState(590);
			match(WIDGET);
			setState(591);
			((Native_widget_declarationContext)_localctx).name = type_identifier();
			setState(592);
			match(LPAR);
			setState(593);
			match(RPAR);
			setState(594);
			match(COLON);
			setState(595);
			indent();
			setState(596);
			((Native_widget_declarationContext)_localctx).bindings = native_category_bindings();
			setState(597);
			lfp();
			setState(598);
			((Native_widget_declarationContext)_localctx).methods = native_member_method_declaration_list();
			setState(599);
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
			_la = _input.LA(1);
			if ( !(_la==CATEGORY || _la==CLASS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(605);
			((Concrete_category_declarationContext)_localctx).name = type_identifier();
			setState(606);
			match(LPAR);
			setState(613);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(607);
				((Concrete_category_declarationContext)_localctx).derived = derived_list();
				}
				break;
			case 2:
				{
				setState(608);
				((Concrete_category_declarationContext)_localctx).attrs = attribute_identifier_list();
				}
				break;
			case 3:
				{
				setState(609);
				((Concrete_category_declarationContext)_localctx).derived = derived_list();
				setState(610);
				match(COMMA);
				setState(611);
				((Concrete_category_declarationContext)_localctx).attrs = attribute_identifier_list();
				}
				break;
			}
			setState(615);
			match(RPAR);
			setState(624);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(616);
				match(COLON);
				setState(617);
				indent();
				setState(620);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COMMENT:
				case ABSTRACT:
				case DEF:
				case ARONDBASE_IDENTIFIER:
					{
					setState(618);
					((Concrete_category_declarationContext)_localctx).methods = member_method_declaration_list();
					}
					break;
				case PASS:
					{
					setState(619);
					match(PASS);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(622);
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
			setState(626);
			match(SINGLETON);
			setState(627);
			((Singleton_category_declarationContext)_localctx).name = type_identifier();
			setState(628);
			match(LPAR);
			setState(629);
			((Singleton_category_declarationContext)_localctx).attrs = attribute_identifier_list();
			setState(630);
			match(RPAR);
			setState(631);
			match(COLON);
			setState(632);
			indent();
			setState(635);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMENT:
			case ABSTRACT:
			case DEF:
			case ARONDBASE_IDENTIFIER:
				{
				setState(633);
				((Singleton_category_declarationContext)_localctx).methods = member_method_declaration_list();
				}
				break;
			case PASS:
				{
				setState(634);
				match(PASS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(637);
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
			setState(639);
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
			setState(641);
			match(DEF);
			setState(642);
			match(OPERATOR);
			setState(643);
			((Operator_method_declarationContext)_localctx).op = operator();
			setState(644);
			match(LPAR);
			setState(645);
			((Operator_method_declarationContext)_localctx).arg = operator_argument();
			setState(646);
			match(RPAR);
			setState(649);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RARROW) {
				{
				setState(647);
				match(RARROW);
				setState(648);
				((Operator_method_declarationContext)_localctx).typ = typedef(0);
				}
			}

			setState(651);
			match(COLON);
			setState(652);
			indent();
			setState(653);
			((Operator_method_declarationContext)_localctx).stmts = statement_list();
			setState(654);
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
			setState(656);
			match(DEF);
			setState(657);
			((Setter_method_declarationContext)_localctx).name = variable_identifier();
			setState(658);
			match(SETTER);
			setState(659);
			match(LPAR);
			setState(660);
			match(RPAR);
			setState(661);
			match(COLON);
			setState(662);
			indent();
			setState(663);
			((Setter_method_declarationContext)_localctx).stmts = statement_list();
			setState(664);
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
			setState(666);
			match(DEF);
			setState(667);
			((Native_setter_declarationContext)_localctx).name = variable_identifier();
			setState(669);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NATIVE) {
				{
				setState(668);
				match(NATIVE);
				}
			}

			setState(671);
			match(SETTER);
			setState(672);
			match(LPAR);
			setState(673);
			match(RPAR);
			setState(674);
			match(COLON);
			setState(675);
			indent();
			setState(676);
			((Native_setter_declarationContext)_localctx).stmts = native_statement_list();
			setState(677);
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
			setState(679);
			match(DEF);
			setState(680);
			((Getter_method_declarationContext)_localctx).name = variable_identifier();
			setState(681);
			match(GETTER);
			setState(682);
			match(LPAR);
			setState(683);
			match(RPAR);
			setState(684);
			match(COLON);
			setState(685);
			indent();
			setState(686);
			((Getter_method_declarationContext)_localctx).stmts = statement_list();
			setState(687);
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
			setState(689);
			match(DEF);
			setState(690);
			((Native_getter_declarationContext)_localctx).name = variable_identifier();
			setState(692);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NATIVE) {
				{
				setState(691);
				match(NATIVE);
				}
			}

			setState(694);
			match(GETTER);
			setState(695);
			match(LPAR);
			setState(696);
			match(RPAR);
			setState(697);
			match(COLON);
			setState(698);
			indent();
			setState(699);
			((Native_getter_declarationContext)_localctx).stmts = native_statement_list();
			setState(700);
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
			setState(703);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STORABLE) {
				{
				setState(702);
				match(STORABLE);
				}
			}

			setState(705);
			match(NATIVE);
			setState(706);
			_la = _input.LA(1);
			if ( !(_la==CATEGORY || _la==CLASS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(707);
			((Native_category_declarationContext)_localctx).name = type_identifier();
			setState(708);
			match(LPAR);
			setState(710);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STORABLE || _la==VARIABLE_IDENTIFIER) {
				{
				setState(709);
				((Native_category_declarationContext)_localctx).attrs = attribute_identifier_list();
				}
			}

			setState(712);
			match(RPAR);
			setState(713);
			match(COLON);
			setState(714);
			indent();
			setState(715);
			((Native_category_declarationContext)_localctx).bindings = native_category_bindings();
			setState(719);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(716);
				lfp();
				setState(717);
				((Native_category_declarationContext)_localctx).methods = native_member_method_declaration_list();
				}
				break;
			}
			setState(721);
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
			setState(724);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STORABLE) {
				{
				setState(723);
				match(STORABLE);
				}
			}

			setState(726);
			match(NATIVE);
			setState(727);
			match(RESOURCE);
			setState(728);
			((Native_resource_declarationContext)_localctx).name = type_identifier();
			setState(729);
			match(LPAR);
			setState(731);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STORABLE || _la==VARIABLE_IDENTIFIER) {
				{
				setState(730);
				((Native_resource_declarationContext)_localctx).attrs = attribute_identifier_list();
				}
			}

			setState(733);
			match(RPAR);
			setState(734);
			match(COLON);
			setState(735);
			indent();
			setState(736);
			((Native_resource_declarationContext)_localctx).bindings = native_category_bindings();
			setState(740);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(737);
				lfp();
				setState(738);
				((Native_resource_declarationContext)_localctx).methods = native_member_method_declaration_list();
				}
				break;
			}
			setState(742);
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
			setState(744);
			match(DEF);
			setState(745);
			_la = _input.LA(1);
			if ( !(_la==CATEGORY || _la==CLASS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(746);
			match(BINDINGS);
			setState(747);
			match(COLON);
			setState(748);
			indent();
			setState(749);
			((Native_category_bindingsContext)_localctx).items = native_category_binding_list(0);
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

			setState(753);
			((NativeCategoryBindingListContext)_localctx).item = native_category_binding();
			}
			_ctx.stop = _input.LT(-1);
			setState(761);
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
					setState(755);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(756);
					lfp();
					setState(757);
					((NativeCategoryBindingListItemContext)_localctx).item = native_category_binding();
					}
					} 
				}
				setState(763);
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
			setState(764);
			match(ABSTRACT);
			setState(765);
			match(DEF);
			setState(766);
			((Abstract_method_declarationContext)_localctx).name = method_identifier();
			setState(767);
			match(LPAR);
			setState(769);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CODE || _la==MUTABLE || _la==VARIABLE_IDENTIFIER) {
				{
				setState(768);
				((Abstract_method_declarationContext)_localctx).args = argument_list();
				}
			}

			setState(771);
			match(RPAR);
			setState(774);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RARROW) {
				{
				setState(772);
				match(RARROW);
				setState(773);
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
			setState(776);
			match(DEF);
			setState(777);
			((Concrete_method_declarationContext)_localctx).name = method_identifier();
			setState(778);
			match(LPAR);
			setState(780);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CODE || _la==MUTABLE || _la==VARIABLE_IDENTIFIER) {
				{
				setState(779);
				((Concrete_method_declarationContext)_localctx).args = argument_list();
				}
			}

			setState(782);
			match(RPAR);
			setState(785);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RARROW) {
				{
				setState(783);
				match(RARROW);
				setState(784);
				((Concrete_method_declarationContext)_localctx).typ = typedef(0);
				}
			}

			setState(787);
			match(COLON);
			setState(788);
			indent();
			setState(791);
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
				setState(789);
				((Concrete_method_declarationContext)_localctx).stmts = statement_list();
				}
				break;
			case PASS:
				{
				setState(790);
				match(PASS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(793);
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
			setState(795);
			match(DEF);
			setState(797);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NATIVE) {
				{
				setState(796);
				match(NATIVE);
				}
			}

			setState(799);
			((Native_method_declarationContext)_localctx).name = method_identifier();
			setState(800);
			match(LPAR);
			setState(802);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CODE || _la==MUTABLE || _la==VARIABLE_IDENTIFIER) {
				{
				setState(801);
				((Native_method_declarationContext)_localctx).args = argument_list();
				}
			}

			setState(804);
			match(RPAR);
			setState(807);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RARROW) {
				{
				setState(805);
				match(RARROW);
				setState(806);
				((Native_method_declarationContext)_localctx).typ = category_or_any_type();
				}
			}

			setState(809);
			match(COLON);
			setState(810);
			indent();
			setState(811);
			((Native_method_declarationContext)_localctx).stmts = native_statement_list();
			setState(812);
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
			setState(814);
			match(DEF);
			setState(815);
			match(TEST);
			setState(816);
			((Test_method_declarationContext)_localctx).name = match(TEXT_LITERAL);
			setState(817);
			match(LPAR);
			setState(818);
			match(RPAR);
			setState(819);
			match(COLON);
			setState(820);
			indent();
			setState(821);
			((Test_method_declarationContext)_localctx).stmts = statement_list();
			setState(822);
			dedent();
			setState(823);
			lfp();
			setState(824);
			match(VERIFYING);
			setState(825);
			match(COLON);
			setState(831);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LF:
				{
				{
				setState(826);
				indent();
				setState(827);
				((Test_method_declarationContext)_localctx).exps = assertion_list();
				setState(828);
				dedent();
				}
				}
				break;
			case SYMBOL_IDENTIFIER:
				{
				{
				setState(830);
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
			setState(833);
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
			setState(835);
			((Typed_argumentContext)_localctx).name = variable_identifier();
			setState(836);
			match(COLON);
			setState(837);
			((Typed_argumentContext)_localctx).typ = category_or_any_type();
			setState(842);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(838);
				match(LPAR);
				setState(839);
				((Typed_argumentContext)_localctx).attrs = attribute_identifier_list();
				setState(840);
				match(RPAR);
				}
			}

			setState(846);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(844);
				match(EQ);
				setState(845);
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
			setState(868);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
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
				_localctx = new FlushStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(853);
				((FlushStatementContext)_localctx).stmt = flush_statement();
				}
				break;
			case 7:
				_localctx = new BreakStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(854);
				((BreakStatementContext)_localctx).stmt = break_statement();
				}
				break;
			case 8:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(855);
				((ReturnStatementContext)_localctx).stmt = return_statement();
				}
				break;
			case 9:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(856);
				((IfStatementContext)_localctx).stmt = if_statement();
				}
				break;
			case 10:
				_localctx = new SwitchStatementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(857);
				((SwitchStatementContext)_localctx).stmt = switch_statement();
				}
				break;
			case 11:
				_localctx = new ForEachStatementContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(858);
				((ForEachStatementContext)_localctx).stmt = for_each_statement();
				}
				break;
			case 12:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(859);
				((WhileStatementContext)_localctx).stmt = while_statement();
				}
				break;
			case 13:
				_localctx = new DoWhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(860);
				((DoWhileStatementContext)_localctx).stmt = do_while_statement();
				}
				break;
			case 14:
				_localctx = new RaiseStatementContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(861);
				((RaiseStatementContext)_localctx).stmt = raise_statement();
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
				_localctx = new WriteStatementContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(863);
				((WriteStatementContext)_localctx).stmt = write_statement();
				}
				break;
			case 17:
				_localctx = new WithResourceStatementContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(864);
				((WithResourceStatementContext)_localctx).stmt = with_resource_statement();
				}
				break;
			case 18:
				_localctx = new WithSingletonStatementContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(865);
				((WithSingletonStatementContext)_localctx).stmt = with_singleton_statement();
				}
				break;
			case 19:
				_localctx = new ClosureStatementContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(866);
				((ClosureStatementContext)_localctx).decl = concrete_method_declaration();
				}
				break;
			case 20:
				_localctx = new CommentStatementContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(867);
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
			setState(870);
			match(FLUSH);
			setState(871);
			match(LPAR);
			setState(872);
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
			setState(891);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DELETE:
				{
				setState(874);
				match(DELETE);
				setState(875);
				match(LPAR);
				setState(876);
				((Store_statementContext)_localctx).to_del = expression_list();
				setState(877);
				match(RPAR);
				setState(884);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AND) {
					{
					setState(878);
					match(AND);
					setState(879);
					match(STORE);
					setState(880);
					match(LPAR);
					setState(881);
					((Store_statementContext)_localctx).to_add = expression_list();
					setState(882);
					match(RPAR);
					}
				}

				}
				break;
			case STORE:
				{
				setState(886);
				match(STORE);
				setState(887);
				match(LPAR);
				setState(888);
				((Store_statementContext)_localctx).to_add = expression_list();
				setState(889);
				match(RPAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(899);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THEN) {
				{
				setState(893);
				match(THEN);
				setState(894);
				match(COLON);
				setState(895);
				indent();
				setState(896);
				((Store_statementContext)_localctx).stmts = statement_list();
				setState(897);
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
			setState(901);
			((Method_call_expressionContext)_localctx).name = method_identifier();
			setState(902);
			match(LPAR);
			setState(904);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << LTCOLONGT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CODE - 64)) | (1L << (DOCUMENT - 64)) | (1L << (BLOB - 64)) | (1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (ANY - 64)) | (1L << (EXECUTE - 64)) | (1L << (FETCH - 64)) | (1L << (MUTABLE - 64)) | (1L << (NONE - 64)) | (1L << (NOT - 64)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (READ - 139)) | (1L << (SELF - 139)) | (1L << (SORTED - 139)) | (1L << (THIS - 139)) | (1L << (BOOLEAN_LITERAL - 139)) | (1L << (CHAR_LITERAL - 139)) | (1L << (MIN_INTEGER - 139)) | (1L << (MAX_INTEGER - 139)) | (1L << (SYMBOL_IDENTIFIER - 139)) | (1L << (TYPE_IDENTIFIER - 139)) | (1L << (VARIABLE_IDENTIFIER - 139)) | (1L << (TEXT_LITERAL - 139)) | (1L << (UUID_LITERAL - 139)) | (1L << (INTEGER_LITERAL - 139)) | (1L << (HEXA_LITERAL - 139)) | (1L << (DECIMAL_LITERAL - 139)) | (1L << (DATETIME_LITERAL - 139)) | (1L << (TIME_LITERAL - 139)) | (1L << (DATE_LITERAL - 139)) | (1L << (PERIOD_LITERAL - 139)) | (1L << (VERSION_LITERAL - 139)))) != 0)) {
				{
				setState(903);
				((Method_call_expressionContext)_localctx).args = argument_assignment_list(0);
				}
			}

			setState(906);
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
			setState(911);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(908);
				((Method_call_statementContext)_localctx).parent = instance_expression(0);
				setState(909);
				match(DOT);
				}
				break;
			}
			setState(913);
			((Method_call_statementContext)_localctx).method = method_call_expression();
			setState(924);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THEN) {
				{
				setState(914);
				match(THEN);
				setState(917);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(915);
					match(WITH);
					setState(916);
					((Method_call_statementContext)_localctx).name = variable_identifier();
					}
				}

				setState(919);
				match(COLON);
				setState(920);
				indent();
				setState(921);
				((Method_call_statementContext)_localctx).stmts = statement_list();
				setState(922);
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
			setState(926);
			match(WITH);
			setState(927);
			((With_resource_statementContext)_localctx).stmt = assign_variable_statement();
			setState(928);
			match(COLON);
			setState(929);
			indent();
			setState(930);
			((With_resource_statementContext)_localctx).stmts = statement_list();
			setState(931);
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
			setState(933);
			match(WITH);
			setState(934);
			((With_singleton_statementContext)_localctx).typ = type_identifier();
			setState(935);
			match(COLON);
			setState(936);
			indent();
			setState(937);
			((With_singleton_statementContext)_localctx).stmts = statement_list();
			setState(938);
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
			setState(940);
			match(SWITCH);
			setState(941);
			match(ON);
			setState(942);
			((Switch_statementContext)_localctx).exp = expression(0);
			setState(943);
			match(COLON);
			setState(944);
			indent();
			setState(945);
			((Switch_statementContext)_localctx).cases = switch_case_statement_list();
			setState(953);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(946);
				lfp();
				setState(947);
				match(OTHERWISE);
				setState(948);
				match(COLON);
				setState(949);
				indent();
				setState(950);
				((Switch_statementContext)_localctx).stmts = statement_list();
				setState(951);
				dedent();
				}
				break;
			}
			setState(955);
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
			setState(972);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				_localctx = new AtomicSwitchCaseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(957);
				match(WHEN);
				setState(958);
				((AtomicSwitchCaseContext)_localctx).exp = atomic_literal();
				setState(959);
				match(COLON);
				setState(960);
				indent();
				setState(961);
				((AtomicSwitchCaseContext)_localctx).stmts = statement_list();
				setState(962);
				dedent();
				}
				break;
			case 2:
				_localctx = new CollectionSwitchCaseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(964);
				match(WHEN);
				setState(965);
				match(IN);
				setState(966);
				((CollectionSwitchCaseContext)_localctx).exp = literal_collection();
				setState(967);
				match(COLON);
				setState(968);
				indent();
				setState(969);
				((CollectionSwitchCaseContext)_localctx).stmts = statement_list();
				setState(970);
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
			setState(974);
			match(FOR);
			setState(975);
			((For_each_statementContext)_localctx).name1 = variable_identifier();
			setState(978);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(976);
				match(COMMA);
				setState(977);
				((For_each_statementContext)_localctx).name2 = variable_identifier();
				}
			}

			setState(980);
			match(IN);
			setState(981);
			((For_each_statementContext)_localctx).source = expression(0);
			setState(982);
			match(COLON);
			setState(983);
			indent();
			setState(984);
			((For_each_statementContext)_localctx).stmts = statement_list();
			setState(985);
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
			setState(987);
			match(DO);
			setState(988);
			match(COLON);
			setState(989);
			indent();
			setState(990);
			((Do_while_statementContext)_localctx).stmts = statement_list();
			setState(991);
			dedent();
			setState(992);
			lfp();
			setState(993);
			match(WHILE);
			setState(994);
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
			setState(996);
			match(WHILE);
			setState(997);
			((While_statementContext)_localctx).exp = expression(0);
			setState(998);
			match(COLON);
			setState(999);
			indent();
			setState(1000);
			((While_statementContext)_localctx).stmts = statement_list();
			setState(1001);
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
			setState(1003);
			match(IF);
			setState(1004);
			((If_statementContext)_localctx).exp = expression(0);
			setState(1005);
			match(COLON);
			setState(1006);
			indent();
			setState(1007);
			((If_statementContext)_localctx).stmts = statement_list();
			setState(1008);
			dedent();
			setState(1012);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(1009);
				lfp();
				setState(1010);
				((If_statementContext)_localctx).elseIfs = else_if_statement_list(0);
				}
				break;
			}
			setState(1021);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(1014);
				lfp();
				setState(1015);
				match(ELSE);
				setState(1016);
				match(COLON);
				setState(1017);
				indent();
				setState(1018);
				((If_statementContext)_localctx).elseStmts = statement_list();
				setState(1019);
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

			setState(1024);
			match(ELSE);
			setState(1025);
			match(IF);
			setState(1026);
			((ElseIfStatementListContext)_localctx).exp = expression(0);
			setState(1027);
			match(COLON);
			setState(1028);
			indent();
			setState(1029);
			((ElseIfStatementListContext)_localctx).stmts = statement_list();
			setState(1030);
			dedent();
			}
			_ctx.stop = _input.LT(-1);
			setState(1044);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ElseIfStatementListItemContext(new Else_if_statement_listContext(_parentctx, _parentState));
					((ElseIfStatementListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_else_if_statement_list);
					setState(1032);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1033);
					lfp();
					setState(1034);
					match(ELSE);
					setState(1035);
					match(IF);
					setState(1036);
					((ElseIfStatementListItemContext)_localctx).exp = expression(0);
					setState(1037);
					match(COLON);
					setState(1038);
					indent();
					setState(1039);
					((ElseIfStatementListItemContext)_localctx).stmts = statement_list();
					setState(1040);
					dedent();
					}
					} 
				}
				setState(1046);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
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
			setState(1047);
			match(RAISE);
			setState(1048);
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
			setState(1050);
			match(TRY);
			setState(1051);
			((Try_statementContext)_localctx).name = variable_identifier();
			setState(1052);
			match(COLON);
			setState(1053);
			indent();
			setState(1054);
			((Try_statementContext)_localctx).stmts = statement_list();
			setState(1055);
			dedent();
			setState(1056);
			lfs();
			setState(1058);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(1057);
				((Try_statementContext)_localctx).handlers = catch_statement_list();
				}
				break;
			}
			setState(1067);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXCEPT) {
				{
				setState(1060);
				match(EXCEPT);
				setState(1061);
				match(COLON);
				setState(1062);
				indent();
				setState(1063);
				((Try_statementContext)_localctx).anyStmts = statement_list();
				setState(1064);
				dedent();
				setState(1065);
				lfs();
				}
			}

			setState(1076);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINALLY) {
				{
				setState(1069);
				match(FINALLY);
				setState(1070);
				match(COLON);
				setState(1071);
				indent();
				setState(1072);
				((Try_statementContext)_localctx).finalStmts = statement_list();
				setState(1073);
				dedent();
				setState(1074);
				lfs();
				}
			}

			setState(1078);
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
			setState(1099);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				_localctx = new CatchAtomicStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1080);
				match(EXCEPT);
				setState(1081);
				((CatchAtomicStatementContext)_localctx).name = symbol_identifier();
				setState(1082);
				match(COLON);
				setState(1083);
				indent();
				setState(1084);
				((CatchAtomicStatementContext)_localctx).stmts = statement_list();
				setState(1085);
				dedent();
				setState(1086);
				lfs();
				}
				break;
			case 2:
				_localctx = new CatchCollectionStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1088);
				match(EXCEPT);
				setState(1089);
				match(IN);
				setState(1090);
				match(LBRAK);
				setState(1091);
				((CatchCollectionStatementContext)_localctx).exp = symbol_list();
				setState(1092);
				match(RBRAK);
				setState(1093);
				match(COLON);
				setState(1094);
				indent();
				setState(1095);
				((CatchCollectionStatementContext)_localctx).stmts = statement_list();
				setState(1096);
				dedent();
				setState(1097);
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
			setState(1101);
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
			setState(1103);
			match(RETURN);
			setState(1105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << LTCOLONGT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CODE - 64)) | (1L << (DOCUMENT - 64)) | (1L << (BLOB - 64)) | (1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (ANY - 64)) | (1L << (EXECUTE - 64)) | (1L << (FETCH - 64)) | (1L << (MUTABLE - 64)) | (1L << (NONE - 64)) | (1L << (NOT - 64)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (READ - 139)) | (1L << (SELF - 139)) | (1L << (SORTED - 139)) | (1L << (THIS - 139)) | (1L << (BOOLEAN_LITERAL - 139)) | (1L << (CHAR_LITERAL - 139)) | (1L << (MIN_INTEGER - 139)) | (1L << (MAX_INTEGER - 139)) | (1L << (SYMBOL_IDENTIFIER - 139)) | (1L << (TYPE_IDENTIFIER - 139)) | (1L << (VARIABLE_IDENTIFIER - 139)) | (1L << (TEXT_LITERAL - 139)) | (1L << (UUID_LITERAL - 139)) | (1L << (INTEGER_LITERAL - 139)) | (1L << (HEXA_LITERAL - 139)) | (1L << (DECIMAL_LITERAL - 139)) | (1L << (DATETIME_LITERAL - 139)) | (1L << (TIME_LITERAL - 139)) | (1L << (DATE_LITERAL - 139)) | (1L << (PERIOD_LITERAL - 139)) | (1L << (VERSION_LITERAL - 139)))) != 0)) {
				{
				setState(1104);
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
			setState(1128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				_localctx = new CssExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1108);
				((CssExpressionContext)_localctx).exp = css_expression();
				}
				break;
			case 2:
				{
				_localctx = new JsxExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1109);
				((JsxExpressionContext)_localctx).exp = jsx_expression();
				}
				break;
			case 3:
				{
				_localctx = new InstanceExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1110);
				((InstanceExpressionContext)_localctx).exp = instance_expression(0);
				}
				break;
			case 4:
				{
				_localctx = new MutableInstanceExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1111);
				((MutableInstanceExpressionContext)_localctx).exp = mutable_instance_expression(0);
				}
				break;
			case 5:
				{
				_localctx = new ArrowExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1112);
				((ArrowExpressionContext)_localctx).exp = arrow_expression();
				}
				break;
			case 6:
				{
				_localctx = new MinusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1113);
				match(MINUS);
				setState(1114);
				((MinusExpressionContext)_localctx).exp = expression(34);
				}
				break;
			case 7:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1115);
				match(NOT);
				setState(1116);
				((NotExpressionContext)_localctx).exp = expression(33);
				}
				break;
			case 8:
				{
				_localctx = new CodeExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1117);
				match(CODE);
				setState(1118);
				match(LPAR);
				setState(1119);
				((CodeExpressionContext)_localctx).exp = expression(0);
				setState(1120);
				match(RPAR);
				}
				break;
			case 9:
				{
				_localctx = new ExecuteExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1122);
				match(EXECUTE);
				setState(1123);
				match(LPAR);
				setState(1124);
				((ExecuteExpressionContext)_localctx).name = variable_identifier();
				setState(1125);
				match(RPAR);
				}
				break;
			case 10:
				{
				_localctx = new ClosureExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1127);
				((ClosureExpressionContext)_localctx).exp = closure_expression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1242);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1240);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplyExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((MultiplyExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1130);
						if (!(precpred(_ctx, 32))) throw new FailedPredicateException(this, "precpred(_ctx, 32)");
						setState(1131);
						multiply();
						setState(1132);
						((MultiplyExpressionContext)_localctx).right = expression(33);
						}
						break;
					case 2:
						{
						_localctx = new DivideExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((DivideExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1134);
						if (!(precpred(_ctx, 31))) throw new FailedPredicateException(this, "precpred(_ctx, 31)");
						setState(1135);
						divide();
						setState(1136);
						((DivideExpressionContext)_localctx).right = expression(32);
						}
						break;
					case 3:
						{
						_localctx = new ModuloExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ModuloExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1138);
						if (!(precpred(_ctx, 30))) throw new FailedPredicateException(this, "precpred(_ctx, 30)");
						setState(1139);
						modulo();
						setState(1140);
						((ModuloExpressionContext)_localctx).right = expression(31);
						}
						break;
					case 4:
						{
						_localctx = new IntDivideExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((IntDivideExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1142);
						if (!(precpred(_ctx, 29))) throw new FailedPredicateException(this, "precpred(_ctx, 29)");
						setState(1143);
						idivide();
						setState(1144);
						((IntDivideExpressionContext)_localctx).right = expression(30);
						}
						break;
					case 5:
						{
						_localctx = new AddExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((AddExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1146);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(1147);
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
						setState(1148);
						((AddExpressionContext)_localctx).right = expression(29);
						}
						break;
					case 6:
						{
						_localctx = new LessThanExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((LessThanExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1149);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(1150);
						match(LT);
						setState(1151);
						((LessThanExpressionContext)_localctx).right = expression(27);
						}
						break;
					case 7:
						{
						_localctx = new LessThanOrEqualExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((LessThanOrEqualExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1152);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(1153);
						match(LTE);
						setState(1154);
						((LessThanOrEqualExpressionContext)_localctx).right = expression(26);
						}
						break;
					case 8:
						{
						_localctx = new GreaterThanExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((GreaterThanExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1155);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(1156);
						match(GT);
						setState(1157);
						((GreaterThanExpressionContext)_localctx).right = expression(25);
						}
						break;
					case 9:
						{
						_localctx = new GreaterThanOrEqualExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((GreaterThanOrEqualExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1158);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(1159);
						match(GTE);
						setState(1160);
						((GreaterThanOrEqualExpressionContext)_localctx).right = expression(24);
						}
						break;
					case 10:
						{
						_localctx = new EqualsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((EqualsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1161);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1162);
						match(EQ2);
						setState(1163);
						((EqualsExpressionContext)_localctx).right = expression(21);
						}
						break;
					case 11:
						{
						_localctx = new NotEqualsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((NotEqualsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1164);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1165);
						match(XEQ);
						setState(1166);
						((NotEqualsExpressionContext)_localctx).right = expression(20);
						}
						break;
					case 12:
						{
						_localctx = new RoughlyEqualsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((RoughlyEqualsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1167);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1168);
						match(TEQ);
						setState(1169);
						((RoughlyEqualsExpressionContext)_localctx).right = expression(19);
						}
						break;
					case 13:
						{
						_localctx = new ContainsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ContainsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1170);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1171);
						match(CONTAINS);
						setState(1172);
						((ContainsExpressionContext)_localctx).right = expression(18);
						}
						break;
					case 14:
						{
						_localctx = new InExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((InExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1173);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1174);
						match(IN);
						setState(1175);
						((InExpressionContext)_localctx).right = expression(17);
						}
						break;
					case 15:
						{
						_localctx = new HasExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((HasExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1176);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1177);
						match(HAS);
						setState(1178);
						((HasExpressionContext)_localctx).right = expression(16);
						}
						break;
					case 16:
						{
						_localctx = new HasAllExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((HasAllExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1179);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1180);
						match(HAS);
						setState(1181);
						match(ALL);
						setState(1182);
						((HasAllExpressionContext)_localctx).right = expression(15);
						}
						break;
					case 17:
						{
						_localctx = new HasAnyExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((HasAnyExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1183);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1184);
						match(HAS);
						setState(1185);
						match(ANY);
						setState(1186);
						((HasAnyExpressionContext)_localctx).right = expression(14);
						}
						break;
					case 18:
						{
						_localctx = new NotContainsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((NotContainsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1187);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1188);
						match(NOT);
						setState(1189);
						match(CONTAINS);
						setState(1190);
						((NotContainsExpressionContext)_localctx).right = expression(13);
						}
						break;
					case 19:
						{
						_localctx = new NotInExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((NotInExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1191);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1192);
						match(NOT);
						setState(1193);
						match(IN);
						setState(1194);
						((NotInExpressionContext)_localctx).right = expression(12);
						}
						break;
					case 20:
						{
						_localctx = new NotHasExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((NotHasExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1195);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1196);
						match(NOT);
						setState(1197);
						match(HAS);
						setState(1198);
						((NotHasExpressionContext)_localctx).right = expression(11);
						}
						break;
					case 21:
						{
						_localctx = new NotHasAllExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((NotHasAllExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1199);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1200);
						match(NOT);
						setState(1201);
						match(HAS);
						setState(1202);
						match(ALL);
						setState(1203);
						((NotHasAllExpressionContext)_localctx).right = expression(10);
						}
						break;
					case 22:
						{
						_localctx = new NotHasAnyExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((NotHasAnyExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1204);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1205);
						match(NOT);
						setState(1206);
						match(HAS);
						setState(1207);
						match(ANY);
						setState(1208);
						((NotHasAnyExpressionContext)_localctx).right = expression(9);
						}
						break;
					case 23:
						{
						_localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((OrExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1209);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1210);
						match(OR);
						setState(1211);
						((OrExpressionContext)_localctx).right = expression(8);
						}
						break;
					case 24:
						{
						_localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((AndExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1212);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1213);
						match(AND);
						setState(1214);
						((AndExpressionContext)_localctx).right = expression(7);
						}
						break;
					case 25:
						{
						_localctx = new TernaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((TernaryExpressionContext)_localctx).ifTrue = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1215);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1216);
						match(IF);
						setState(1217);
						((TernaryExpressionContext)_localctx).test = expression(0);
						setState(1218);
						match(ELSE);
						setState(1219);
						((TernaryExpressionContext)_localctx).ifFalse = expression(6);
						}
						break;
					case 26:
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
						((IteratorExpressionContext)_localctx).name = variable_identifier();
						setState(1225);
						match(IN);
						setState(1226);
						((IteratorExpressionContext)_localctx).source = expression(2);
						}
						break;
					case 27:
						{
						_localctx = new FilteredListExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((FilteredListExpressionContext)_localctx).src = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1228);
						if (!(precpred(_ctx, 35))) throw new FailedPredicateException(this, "precpred(_ctx, 35)");
						setState(1229);
						filtered_list_suffix();
						}
						break;
					case 28:
						{
						_localctx = new CastExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((CastExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1230);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(1231);
						match(AS);
						setState(1232);
						((CastExpressionContext)_localctx).right = category_or_any_type();
						}
						break;
					case 29:
						{
						_localctx = new IsNotExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((IsNotExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1233);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(1234);
						match(IS);
						setState(1235);
						match(NOT);
						setState(1236);
						((IsNotExpressionContext)_localctx).right = is_expression();
						}
						break;
					case 30:
						{
						_localctx = new IsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((IsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1237);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1238);
						match(IS);
						setState(1239);
						((IsExpressionContext)_localctx).right = is_expression();
						}
						break;
					}
					} 
				}
				setState(1244);
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
			setState(1245);
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
			setState(1252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				_localctx = new MethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1247);
				((MethodExpressionContext)_localctx).exp = method_expression();
				}
				break;
			case 2:
				_localctx = new ParenthesisExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1248);
				((ParenthesisExpressionContext)_localctx).exp = parenthesis_expression();
				}
				break;
			case 3:
				_localctx = new LiteralExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1249);
				((LiteralExpressionContext)_localctx).exp = literal_expression();
				}
				break;
			case 4:
				_localctx = new IdentifierExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1250);
				((IdentifierExpressionContext)_localctx).exp = identifier();
				}
				break;
			case 5:
				_localctx = new ThisExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1251);
				((ThisExpressionContext)_localctx).exp = this_expression();
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

			setState(1255);
			((SelectableExpressionContext)_localctx).parent = selectable_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(1261);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SelectorExpressionContext(new Instance_expressionContext(_parentctx, _parentState));
					((SelectorExpressionContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_instance_expression);
					setState(1257);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1258);
					((SelectorExpressionContext)_localctx).selector = instance_selector();
					}
					} 
				}
				setState(1263);
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

			setState(1265);
			match(MUTABLE);
			setState(1266);
			((MutableSelectableExpressionContext)_localctx).exp = identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(1272);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MutableSelectorExpressionContext(new Mutable_instance_expressionContext(_parentctx, _parentState));
					((MutableSelectorExpressionContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_mutable_instance_expression);
					setState(1268);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1269);
					((MutableSelectorExpressionContext)_localctx).selector = instance_selector();
					}
					} 
				}
				setState(1274);
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
			setState(1283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1275);
				blob_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1276);
				document_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1277);
				fetch_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1278);
				read_all_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1279);
				read_one_expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1280);
				sorted_expression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1281);
				method_call_expression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1282);
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
		public Variable_identifierContext name;
		public TerminalNode DOT() { return getToken(MParser.DOT, 0); }
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
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
			setState(1297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				_localctx = new MemberSelectorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1285);
				match(DOT);
				setState(1286);
				((MemberSelectorContext)_localctx).name = variable_identifier();
				}
				break;
			case 2:
				_localctx = new MethodSelectorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1287);
				match(DOT);
				setState(1288);
				((MethodSelectorContext)_localctx).method = method_call_expression();
				}
				break;
			case 3:
				_localctx = new SliceSelectorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1289);
				match(LBRAK);
				setState(1290);
				((SliceSelectorContext)_localctx).xslice = slice_arguments();
				setState(1291);
				match(RBRAK);
				}
				break;
			case 4:
				_localctx = new ItemSelectorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1293);
				match(LBRAK);
				setState(1294);
				((ItemSelectorContext)_localctx).exp = expression(0);
				setState(1295);
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
			setState(1299);
			match(BLOB);
			setState(1300);
			match(LPAR);
			setState(1302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << LTCOLONGT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CODE - 64)) | (1L << (DOCUMENT - 64)) | (1L << (BLOB - 64)) | (1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (ANY - 64)) | (1L << (EXECUTE - 64)) | (1L << (FETCH - 64)) | (1L << (MUTABLE - 64)) | (1L << (NONE - 64)) | (1L << (NOT - 64)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (READ - 139)) | (1L << (SELF - 139)) | (1L << (SORTED - 139)) | (1L << (THIS - 139)) | (1L << (BOOLEAN_LITERAL - 139)) | (1L << (CHAR_LITERAL - 139)) | (1L << (MIN_INTEGER - 139)) | (1L << (MAX_INTEGER - 139)) | (1L << (SYMBOL_IDENTIFIER - 139)) | (1L << (TYPE_IDENTIFIER - 139)) | (1L << (VARIABLE_IDENTIFIER - 139)) | (1L << (TEXT_LITERAL - 139)) | (1L << (UUID_LITERAL - 139)) | (1L << (INTEGER_LITERAL - 139)) | (1L << (HEXA_LITERAL - 139)) | (1L << (DECIMAL_LITERAL - 139)) | (1L << (DATETIME_LITERAL - 139)) | (1L << (TIME_LITERAL - 139)) | (1L << (DATE_LITERAL - 139)) | (1L << (PERIOD_LITERAL - 139)) | (1L << (VERSION_LITERAL - 139)))) != 0)) {
				{
				setState(1301);
				expression(0);
				}
			}

			setState(1304);
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
		public TerminalNode DOCUMENT() { return getToken(MParser.DOCUMENT, 0); }
		public TerminalNode LPAR() { return getToken(MParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(MParser.RPAR, 0); }
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
			setState(1306);
			match(DOCUMENT);
			setState(1307);
			match(LPAR);
			setState(1309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << LTCOLONGT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CODE - 64)) | (1L << (DOCUMENT - 64)) | (1L << (BLOB - 64)) | (1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (ANY - 64)) | (1L << (EXECUTE - 64)) | (1L << (FETCH - 64)) | (1L << (MUTABLE - 64)) | (1L << (NONE - 64)) | (1L << (NOT - 64)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (READ - 139)) | (1L << (SELF - 139)) | (1L << (SORTED - 139)) | (1L << (THIS - 139)) | (1L << (BOOLEAN_LITERAL - 139)) | (1L << (CHAR_LITERAL - 139)) | (1L << (MIN_INTEGER - 139)) | (1L << (MAX_INTEGER - 139)) | (1L << (SYMBOL_IDENTIFIER - 139)) | (1L << (TYPE_IDENTIFIER - 139)) | (1L << (VARIABLE_IDENTIFIER - 139)) | (1L << (TEXT_LITERAL - 139)) | (1L << (UUID_LITERAL - 139)) | (1L << (INTEGER_LITERAL - 139)) | (1L << (HEXA_LITERAL - 139)) | (1L << (DECIMAL_LITERAL - 139)) | (1L << (DATETIME_LITERAL - 139)) | (1L << (TIME_LITERAL - 139)) | (1L << (DATE_LITERAL - 139)) | (1L << (PERIOD_LITERAL - 139)) | (1L << (VERSION_LITERAL - 139)))) != 0)) {
				{
				setState(1308);
				expression(0);
				}
			}

			setState(1311);
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
			setState(1329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				_localctx = new ConstructorFromContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1313);
				((ConstructorFromContext)_localctx).typ = mutable_category_type();
				setState(1314);
				match(LPAR);
				setState(1315);
				((ConstructorFromContext)_localctx).copyExp = copy_from();
				setState(1318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1316);
					match(COMMA);
					setState(1317);
					((ConstructorFromContext)_localctx).args = argument_assignment_list(0);
					}
				}

				setState(1320);
				match(RPAR);
				}
				break;
			case 2:
				_localctx = new ConstructorNoFromContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1322);
				((ConstructorNoFromContext)_localctx).typ = mutable_category_type();
				setState(1323);
				match(LPAR);
				setState(1325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << LTCOLONGT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CODE - 64)) | (1L << (DOCUMENT - 64)) | (1L << (BLOB - 64)) | (1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (ANY - 64)) | (1L << (EXECUTE - 64)) | (1L << (FETCH - 64)) | (1L << (MUTABLE - 64)) | (1L << (NONE - 64)) | (1L << (NOT - 64)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (READ - 139)) | (1L << (SELF - 139)) | (1L << (SORTED - 139)) | (1L << (THIS - 139)) | (1L << (BOOLEAN_LITERAL - 139)) | (1L << (CHAR_LITERAL - 139)) | (1L << (MIN_INTEGER - 139)) | (1L << (MAX_INTEGER - 139)) | (1L << (SYMBOL_IDENTIFIER - 139)) | (1L << (TYPE_IDENTIFIER - 139)) | (1L << (VARIABLE_IDENTIFIER - 139)) | (1L << (TEXT_LITERAL - 139)) | (1L << (UUID_LITERAL - 139)) | (1L << (INTEGER_LITERAL - 139)) | (1L << (HEXA_LITERAL - 139)) | (1L << (DECIMAL_LITERAL - 139)) | (1L << (DATETIME_LITERAL - 139)) | (1L << (TIME_LITERAL - 139)) | (1L << (DATE_LITERAL - 139)) | (1L << (PERIOD_LITERAL - 139)) | (1L << (VERSION_LITERAL - 139)))) != 0)) {
					{
					setState(1324);
					((ConstructorNoFromContext)_localctx).args = argument_assignment_list(0);
					}
				}

				setState(1327);
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
			setState(1331);
			match(FROM);
			setState(1332);
			assign();
			setState(1333);
			((Copy_fromContext)_localctx).exp = expression(0);
			setState(1334);
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
			setState(1341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				_localctx = new ExpressionAssignmentListContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1337);
				((ExpressionAssignmentListContext)_localctx).exp = expression(0);
				setState(1338);
				if (!(this.willNotBe(this.equalToken()))) throw new FailedPredicateException(this, "$parser.willNotBe($parser.equalToken())");
				}
				break;
			case 2:
				{
				_localctx = new ArgumentAssignmentListContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1340);
				((ArgumentAssignmentListContext)_localctx).item = argument_assignment();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1348);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArgumentAssignmentListItemContext(new Argument_assignment_listContext(_parentctx, _parentState));
					((ArgumentAssignmentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_argument_assignment_list);
					setState(1343);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1344);
					match(COMMA);
					setState(1345);
					((ArgumentAssignmentListItemContext)_localctx).item = argument_assignment();
					}
					} 
				}
				setState(1350);
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
			setState(1351);
			((Argument_assignmentContext)_localctx).name = variable_identifier();
			setState(1355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(1352);
				assign();
				setState(1353);
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
			setState(1357);
			match(WRITE);
			setState(1358);
			((Write_statementContext)_localctx).what = expression(0);
			setState(1359);
			match(TO);
			setState(1360);
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
			setState(1362);
			match(FILTERED);
			setState(1365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1363);
				match(WITH);
				setState(1364);
				((Filtered_list_suffixContext)_localctx).name = variable_identifier();
				}
			}

			setState(1367);
			match(WHERE);
			setState(1368);
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
			setState(1400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				_localctx = new FetchOneContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1370);
				match(FETCH);
				setState(1371);
				match(ONE);
				setState(1373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MUTABLE || _la==TYPE_IDENTIFIER) {
					{
					setState(1372);
					((FetchOneContext)_localctx).typ = mutable_category_type();
					}
				}

				setState(1375);
				match(WHERE);
				setState(1376);
				((FetchOneContext)_localctx).predicate = expression(0);
				}
				break;
			case 2:
				_localctx = new FetchManyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1377);
				match(FETCH);
				setState(1384);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ALL:
					{
					setState(1378);
					match(ALL);
					}
					break;
				case ROWS:
					{
					setState(1379);
					match(ROWS);
					setState(1380);
					((FetchManyContext)_localctx).xstart = expression(0);
					setState(1381);
					match(TO);
					setState(1382);
					((FetchManyContext)_localctx).xstop = expression(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1386);
				match(LPAR);
				setState(1388);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MUTABLE || _la==TYPE_IDENTIFIER) {
					{
					setState(1387);
					((FetchManyContext)_localctx).typ = mutable_category_type();
					}
				}

				setState(1390);
				match(RPAR);
				setState(1393);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					{
					setState(1391);
					match(WHERE);
					setState(1392);
					((FetchManyContext)_localctx).predicate = expression(0);
					}
					break;
				}
				setState(1398);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
				case 1:
					{
					setState(1395);
					match(ORDER);
					setState(1396);
					match(BY);
					setState(1397);
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
			setState(1448);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				_localctx = new FetchOneAsyncContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1402);
				match(FETCH);
				setState(1403);
				match(ONE);
				setState(1405);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MUTABLE || _la==TYPE_IDENTIFIER) {
					{
					setState(1404);
					((FetchOneAsyncContext)_localctx).typ = mutable_category_type();
					}
				}

				setState(1407);
				match(WHERE);
				setState(1408);
				((FetchOneAsyncContext)_localctx).predicate = expression(0);
				setState(1409);
				match(THEN);
				setState(1410);
				match(WITH);
				setState(1411);
				((FetchOneAsyncContext)_localctx).name = variable_identifier();
				setState(1412);
				match(COLON);
				setState(1413);
				indent();
				setState(1414);
				((FetchOneAsyncContext)_localctx).stmts = statement_list();
				setState(1415);
				dedent();
				}
				break;
			case 2:
				_localctx = new FetchManyAsyncContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1417);
				match(FETCH);
				setState(1424);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ALL:
					{
					setState(1418);
					match(ALL);
					}
					break;
				case ROWS:
					{
					setState(1419);
					match(ROWS);
					setState(1420);
					((FetchManyAsyncContext)_localctx).xstart = expression(0);
					setState(1421);
					match(TO);
					setState(1422);
					((FetchManyAsyncContext)_localctx).xstop = expression(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1426);
				match(LPAR);
				setState(1428);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MUTABLE || _la==TYPE_IDENTIFIER) {
					{
					setState(1427);
					((FetchManyAsyncContext)_localctx).typ = mutable_category_type();
					}
				}

				setState(1430);
				match(RPAR);
				setState(1433);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(1431);
					match(WHERE);
					setState(1432);
					((FetchManyAsyncContext)_localctx).predicate = expression(0);
					}
				}

				setState(1438);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ORDER) {
					{
					setState(1435);
					match(ORDER);
					setState(1436);
					match(BY);
					setState(1437);
					((FetchManyAsyncContext)_localctx).orderby = order_by_list();
					}
				}

				setState(1440);
				match(THEN);
				setState(1441);
				match(WITH);
				setState(1442);
				((FetchManyAsyncContext)_localctx).name = variable_identifier();
				setState(1443);
				match(COLON);
				setState(1444);
				indent();
				setState(1445);
				((FetchManyAsyncContext)_localctx).stmts = statement_list();
				setState(1446);
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
			setState(1450);
			match(SORTED);
			setState(1452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DESC) {
				{
				setState(1451);
				match(DESC);
				}
			}

			setState(1454);
			match(LPAR);
			setState(1455);
			((Sorted_expressionContext)_localctx).source = instance_expression(0);
			setState(1461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1456);
				match(COMMA);
				setState(1457);
				key_token();
				setState(1458);
				match(EQ);
				setState(1459);
				((Sorted_expressionContext)_localctx).key = sorted_key();
				}
			}

			setState(1463);
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
			setState(1465);
			((Assign_instance_statementContext)_localctx).inst = assignable_instance(0);
			setState(1466);
			assign();
			setState(1467);
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
			setState(1477);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				_localctx = new MemberInstanceContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1469);
				if (!(this.wasNot(MParser.WS))) throw new FailedPredicateException(this, "$parser.wasNot(MParser.WS)");
				setState(1470);
				match(DOT);
				setState(1471);
				((MemberInstanceContext)_localctx).name = variable_identifier();
				}
				break;
			case 2:
				_localctx = new ItemInstanceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1472);
				if (!(this.wasNot(MParser.WS))) throw new FailedPredicateException(this, "$parser.wasNot(MParser.WS)");
				setState(1473);
				match(LBRAK);
				setState(1474);
				((ItemInstanceContext)_localctx).exp = expression(0);
				setState(1475);
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
			setState(1479);
			((Assign_tuple_statementContext)_localctx).items = variable_identifier_list();
			setState(1480);
			assign();
			setState(1481);
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
			setState(1486);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1483);
					match(LF);
					}
					} 
				}
				setState(1488);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
			setState(1490); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1489);
				match(LF);
				}
				}
				setState(1492); 
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
			setState(1497);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1494);
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
				setState(1499);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
			setState(1501); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1500);
				match(LF);
				}
				}
				setState(1503); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LF );
			setState(1505);
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
			setState(1510);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LF) {
				{
				{
				setState(1507);
				match(LF);
				}
				}
				setState(1512);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1513);
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
			setState(1515);
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
			setState(1517);
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
			setState(1522);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1519);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1520);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1521);
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
			setState(1525);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (ABSTRACT - 73)) | (1L << (ATTR - 73)) | (1L << (CATEGORY - 73)) | (1L << (CLASS - 73)) | (1L << (DEF - 73)) | (1L << (ENUM - 73)) | (1L << (NATIVE - 73)))) != 0) || ((((_la - 147)) & ~0x3f) == 0 && ((1L << (_la - 147)) & ((1L << (SINGLETON - 147)) | (1L << (STORABLE - 147)) | (1L << (WIDGET - 147)) | (1L << (ARONDBASE_IDENTIFIER - 147)))) != 0)) {
				{
				setState(1524);
				declarations();
				}
			}

			setState(1527);
			lfs();
			setState(1528);
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
			setState(1530);
			declaration();
			setState(1536);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1531);
					lfp();
					setState(1532);
					declaration();
					}
					} 
				}
				setState(1538);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
			setState(1544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(1539);
				comment_statement();
				setState(1540);
				lfp();
				}
				}
				setState(1546);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ARONDBASE_IDENTIFIER) {
				{
				{
				setState(1547);
				annotation_constructor();
				setState(1548);
				lfp();
				}
				}
				setState(1554);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1561);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(1555);
				attribute_declaration();
				}
				break;
			case 2:
				{
				setState(1556);
				category_declaration();
				}
				break;
			case 3:
				{
				setState(1557);
				resource_declaration();
				}
				break;
			case 4:
				{
				setState(1558);
				enum_declaration();
				}
				break;
			case 5:
				{
				setState(1559);
				widget_declaration();
				}
				break;
			case 6:
				{
				setState(1560);
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
			setState(1563);
			((Annotation_constructorContext)_localctx).name = annotation_identifier();
			setState(1578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(1564);
				match(LPAR);
				setState(1574);
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
					setState(1565);
					((Annotation_constructorContext)_localctx).exp = annotation_argument_value();
					}
					break;
				case GETTER:
				case SETTER:
				case VARIABLE_IDENTIFIER:
					{
					{
					setState(1566);
					annotation_argument();
					setState(1571);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1567);
						match(COMMA);
						setState(1568);
						annotation_argument();
						}
						}
						setState(1573);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1576);
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
			setState(1580);
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
			setState(1582);
			((Annotation_argumentContext)_localctx).name = annotation_argument_name();
			setState(1583);
			match(EQ);
			setState(1584);
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
			setState(1586);
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
			setState(1590);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				_localctx = new AnnotationLiteralValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1588);
				((AnnotationLiteralValueContext)_localctx).exp = literal_expression();
				}
				break;
			case 2:
				_localctx = new AnnotationTypeValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1589);
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
			setState(1592);
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
			setState(1596);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1594);
				enum_category_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1595);
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
			setState(1598);
			native_symbol();
			setState(1604);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1599);
					lfp();
					setState(1600);
					native_symbol();
					}
					} 
				}
				setState(1606);
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
			setState(1607);
			category_symbol();
			setState(1613);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1608);
					lfp();
					setState(1609);
					category_symbol();
					}
					} 
				}
				setState(1615);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
			setState(1616);
			symbol_identifier();
			setState(1621);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1617);
				match(COMMA);
				setState(1618);
				symbol_identifier();
				}
				}
				setState(1623);
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
			setState(1634);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				_localctx = new MatchingListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1624);
				match(IN);
				setState(1625);
				((MatchingListContext)_localctx).source = list_literal();
				}
				break;
			case 2:
				_localctx = new MatchingSetContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1626);
				match(IN);
				setState(1627);
				((MatchingSetContext)_localctx).source = set_literal();
				}
				break;
			case 3:
				_localctx = new MatchingRangeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1628);
				match(IN);
				setState(1629);
				((MatchingRangeContext)_localctx).source = range_literal();
				}
				break;
			case 4:
				_localctx = new MatchingPatternContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1630);
				match(MATCHING);
				setState(1631);
				((MatchingPatternContext)_localctx).text = match(TEXT_LITERAL);
				}
				break;
			case 5:
				_localctx = new MatchingExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1632);
				match(MATCHING);
				setState(1633);
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
			setState(1637);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUTABLE) {
				{
				setState(1636);
				match(MUTABLE);
				}
			}

			setState(1639);
			match(LBRAK);
			setState(1641);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << LTCOLONGT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CODE - 64)) | (1L << (DOCUMENT - 64)) | (1L << (BLOB - 64)) | (1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (ANY - 64)) | (1L << (EXECUTE - 64)) | (1L << (FETCH - 64)) | (1L << (MUTABLE - 64)) | (1L << (NONE - 64)) | (1L << (NOT - 64)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (READ - 139)) | (1L << (SELF - 139)) | (1L << (SORTED - 139)) | (1L << (THIS - 139)) | (1L << (BOOLEAN_LITERAL - 139)) | (1L << (CHAR_LITERAL - 139)) | (1L << (MIN_INTEGER - 139)) | (1L << (MAX_INTEGER - 139)) | (1L << (SYMBOL_IDENTIFIER - 139)) | (1L << (TYPE_IDENTIFIER - 139)) | (1L << (VARIABLE_IDENTIFIER - 139)) | (1L << (TEXT_LITERAL - 139)) | (1L << (UUID_LITERAL - 139)) | (1L << (INTEGER_LITERAL - 139)) | (1L << (HEXA_LITERAL - 139)) | (1L << (DECIMAL_LITERAL - 139)) | (1L << (DATETIME_LITERAL - 139)) | (1L << (TIME_LITERAL - 139)) | (1L << (DATE_LITERAL - 139)) | (1L << (PERIOD_LITERAL - 139)) | (1L << (VERSION_LITERAL - 139)))) != 0)) {
				{
				setState(1640);
				expression_list();
				}
			}

			setState(1643);
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
			setState(1646);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUTABLE) {
				{
				setState(1645);
				match(MUTABLE);
				}
			}

			setState(1648);
			match(LT);
			setState(1650);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << LTCOLONGT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CODE - 64)) | (1L << (DOCUMENT - 64)) | (1L << (BLOB - 64)) | (1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (ANY - 64)) | (1L << (EXECUTE - 64)) | (1L << (FETCH - 64)) | (1L << (MUTABLE - 64)) | (1L << (NONE - 64)) | (1L << (NOT - 64)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (READ - 139)) | (1L << (SELF - 139)) | (1L << (SORTED - 139)) | (1L << (THIS - 139)) | (1L << (BOOLEAN_LITERAL - 139)) | (1L << (CHAR_LITERAL - 139)) | (1L << (MIN_INTEGER - 139)) | (1L << (MAX_INTEGER - 139)) | (1L << (SYMBOL_IDENTIFIER - 139)) | (1L << (TYPE_IDENTIFIER - 139)) | (1L << (VARIABLE_IDENTIFIER - 139)) | (1L << (TEXT_LITERAL - 139)) | (1L << (UUID_LITERAL - 139)) | (1L << (INTEGER_LITERAL - 139)) | (1L << (HEXA_LITERAL - 139)) | (1L << (DECIMAL_LITERAL - 139)) | (1L << (DATETIME_LITERAL - 139)) | (1L << (TIME_LITERAL - 139)) | (1L << (DATE_LITERAL - 139)) | (1L << (PERIOD_LITERAL - 139)) | (1L << (VERSION_LITERAL - 139)))) != 0)) {
				{
				setState(1649);
				expression_list();
				}
			}

			setState(1652);
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
			setState(1654);
			expression(0);
			setState(1659);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1655);
				match(COMMA);
				setState(1656);
				expression(0);
				}
				}
				setState(1661);
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
			setState(1662);
			match(LBRAK);
			setState(1663);
			((Range_literalContext)_localctx).low = expression(0);
			setState(1664);
			match(RANGE);
			setState(1665);
			((Range_literalContext)_localctx).high = expression(0);
			setState(1666);
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
			setState(1680);
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

				setState(1669);
				((PrimaryTypeContext)_localctx).p = primary_type();
				}
				break;
			case CURSOR:
				{
				_localctx = new CursorTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1670);
				match(CURSOR);
				setState(1671);
				match(LT);
				setState(1672);
				((CursorTypeContext)_localctx).c = typedef(0);
				setState(1673);
				match(GT);
				}
				break;
			case ITERATOR:
				{
				_localctx = new IteratorTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1675);
				match(ITERATOR);
				setState(1676);
				match(LT);
				setState(1677);
				((IteratorTypeContext)_localctx).i = typedef(0);
				setState(1678);
				match(GT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1691);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1689);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
					case 1:
						{
						_localctx = new SetTypeContext(new TypedefContext(_parentctx, _parentState));
						((SetTypeContext)_localctx).s = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_typedef);
						setState(1682);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1683);
						match(LTGT);
						}
						break;
					case 2:
						{
						_localctx = new ListTypeContext(new TypedefContext(_parentctx, _parentState));
						((ListTypeContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_typedef);
						setState(1684);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1685);
						match(LBRAK);
						setState(1686);
						match(RBRAK);
						}
						break;
					case 3:
						{
						_localctx = new DictTypeContext(new TypedefContext(_parentctx, _parentState));
						((DictTypeContext)_localctx).d = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_typedef);
						setState(1687);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1688);
						match(LTCOLONGT);
						}
						break;
					}
					} 
				}
				setState(1693);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
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
			setState(1696);
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
				setState(1694);
				((NativeTypeContext)_localctx).n = native_type();
				}
				break;
			case TYPE_IDENTIFIER:
				_localctx = new CategoryTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1695);
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
			setState(1715);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
				_localctx = new BooleanTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1698);
				match(BOOLEAN);
				}
				break;
			case CSS:
				_localctx = new CssTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1699);
				match(CSS);
				}
				break;
			case CHARACTER:
				_localctx = new CharacterTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1700);
				match(CHARACTER);
				}
				break;
			case TEXT:
				_localctx = new TextTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1701);
				match(TEXT);
				}
				break;
			case IMAGE:
				_localctx = new ImageTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1702);
				match(IMAGE);
				}
				break;
			case INTEGER:
				_localctx = new IntegerTypeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1703);
				match(INTEGER);
				}
				break;
			case DECIMAL:
				_localctx = new DecimalTypeContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1704);
				match(DECIMAL);
				}
				break;
			case DOCUMENT:
				_localctx = new DocumentTypeContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1705);
				match(DOCUMENT);
				}
				break;
			case DATE:
				_localctx = new DateTypeContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1706);
				match(DATE);
				}
				break;
			case DATETIME:
				_localctx = new DateTimeTypeContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1707);
				match(DATETIME);
				}
				break;
			case TIME:
				_localctx = new TimeTypeContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(1708);
				match(TIME);
				}
				break;
			case PERIOD:
				_localctx = new PeriodTypeContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(1709);
				match(PERIOD);
				}
				break;
			case VERSION:
				_localctx = new VersionTypeContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(1710);
				match(VERSION);
				}
				break;
			case CODE:
				_localctx = new CodeTypeContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(1711);
				match(CODE);
				}
				break;
			case BLOB:
				_localctx = new BlobTypeContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(1712);
				match(BLOB);
				}
				break;
			case UUID:
				_localctx = new UUIDTypeContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(1713);
				match(UUID);
				}
				break;
			case HTML:
				_localctx = new HtmlTypeContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(1714);
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
			setState(1717);
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
			setState(1720);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUTABLE) {
				{
				setState(1719);
				match(MUTABLE);
				}
			}

			setState(1722);
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
			setState(1724);
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
			setState(1729);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				_localctx = new ConcreteCategoryDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1726);
				((ConcreteCategoryDeclarationContext)_localctx).decl = concrete_category_declaration();
				}
				break;
			case 2:
				_localctx = new NativeCategoryDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1727);
				((NativeCategoryDeclarationContext)_localctx).decl = native_category_declaration();
				}
				break;
			case 3:
				_localctx = new SingletonCategoryDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1728);
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
			setState(1733);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WIDGET:
				_localctx = new ConcreteWidgetDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1731);
				((ConcreteWidgetDeclarationContext)_localctx).decl = concrete_widget_declaration();
				}
				break;
			case NATIVE:
				_localctx = new NativeWidgetDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1732);
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
			setState(1735);
			type_identifier();
			setState(1740);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1736);
					match(COMMA);
					setState(1737);
					type_identifier();
					}
					} 
				}
				setState(1742);
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
			setState(1745);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1743);
				variable_identifier();
				}
				break;
			case TYPE_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1744);
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
			setState(1749);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SYMBOL_IDENTIFIER:
			case TYPE_IDENTIFIER:
			case VARIABLE_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1747);
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
			case CLOSE:
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
			case OPEN:
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
				setState(1748);
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
			setState(1751);
			if (!(this.wasNotWhiteSpace())) throw new FailedPredicateException(this, "$parser.wasNotWhiteSpace()");
			setState(1752);
			match(MINUS);
			setState(1753);
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
			setState(1755);
			if (!(this.wasNotWhiteSpace())) throw new FailedPredicateException(this, "$parser.wasNotWhiteSpace()");
			setState(1756);
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
			setState(1761);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE_IDENTIFIER:
				_localctx = new VariableIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1758);
				variable_identifier();
				}
				break;
			case TYPE_IDENTIFIER:
				_localctx = new TypeIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1759);
				type_identifier();
				}
				break;
			case SYMBOL_IDENTIFIER:
				_localctx = new SymbolIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1760);
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
		enterRule(_localctx, 212, RULE_variable_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1763);
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
		enterRule(_localctx, 214, RULE_attribute_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1765);
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
		enterRule(_localctx, 216, RULE_type_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1767);
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
		enterRule(_localctx, 218, RULE_symbol_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1769);
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
		enterRule(_localctx, 220, RULE_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1771);
			argument();
			setState(1776);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1772);
				match(COMMA);
				setState(1773);
				argument();
				}
				}
				setState(1778);
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
		enterRule(_localctx, 222, RULE_argument);
		int _la;
		try {
			setState(1784);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CODE:
				_localctx = new CodeArgumentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1779);
				((CodeArgumentContext)_localctx).arg = code_argument();
				}
				break;
			case MUTABLE:
			case VARIABLE_IDENTIFIER:
				_localctx = new OperatorArgumentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1781);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MUTABLE) {
					{
					setState(1780);
					match(MUTABLE);
					}
				}

				setState(1783);
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
		enterRule(_localctx, 224, RULE_operator_argument);
		try {
			setState(1788);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1786);
				named_argument();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1787);
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
		enterRule(_localctx, 226, RULE_named_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1790);
			variable_identifier();
			setState(1793);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(1791);
				match(EQ);
				setState(1792);
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
		enterRule(_localctx, 228, RULE_code_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1795);
			code_type();
			setState(1796);
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
		enterRule(_localctx, 230, RULE_category_or_any_type);
		try {
			setState(1800);
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
				setState(1798);
				typedef(0);
				}
				break;
			case ANY:
				enterOuterAlt(_localctx, 2);
				{
				setState(1799);
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
		int _startState = 232;
		enterRecursionRule(_localctx, 232, RULE_any_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AnyTypeContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1803);
			match(ANY);
			}
			_ctx.stop = _input.LT(-1);
			setState(1813);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,133,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1811);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
					case 1:
						{
						_localctx = new AnyListTypeContext(new Any_typeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_any_type);
						setState(1805);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1806);
						match(LBRAK);
						setState(1807);
						match(RBRAK);
						}
						break;
					case 2:
						{
						_localctx = new AnyDictTypeContext(new Any_typeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_any_type);
						setState(1808);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1809);
						match(LCURL);
						setState(1810);
						match(RCURL);
						}
						break;
					}
					} 
				}
				setState(1815);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,133,_ctx);
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
		enterRule(_localctx, 234, RULE_member_method_declaration_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1816);
			member_method_declaration();
			setState(1822);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1817);
					lfp();
					setState(1818);
					member_method_declaration();
					}
					} 
				}
				setState(1824);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 236, RULE_member_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1830);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(1825);
				comment_statement();
				setState(1826);
				lfp();
				}
				}
				setState(1832);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1838);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ARONDBASE_IDENTIFIER) {
				{
				{
				setState(1833);
				annotation_constructor();
				setState(1834);
				lfp();
				}
				}
				setState(1840);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1846);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				{
				setState(1841);
				setter_method_declaration();
				}
				break;
			case 2:
				{
				setState(1842);
				getter_method_declaration();
				}
				break;
			case 3:
				{
				setState(1843);
				concrete_method_declaration();
				}
				break;
			case 4:
				{
				setState(1844);
				abstract_method_declaration();
				}
				break;
			case 5:
				{
				setState(1845);
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
		enterRule(_localctx, 238, RULE_native_member_method_declaration_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1848);
			native_member_method_declaration();
			setState(1854);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1849);
					lfp();
					setState(1850);
					native_member_method_declaration();
					}
					} 
				}
				setState(1856);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 240, RULE_native_member_method_declaration);
		try {
			setState(1860);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1857);
				native_getter_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1858);
				native_setter_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1859);
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
		enterRule(_localctx, 242, RULE_native_category_binding);
		try {
			setState(1872);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JAVA:
				_localctx = new JavaCategoryBindingContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1862);
				match(JAVA);
				setState(1863);
				((JavaCategoryBindingContext)_localctx).binding = java_class_identifier_expression(0);
				}
				break;
			case CSHARP:
				_localctx = new CSharpCategoryBindingContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1864);
				match(CSHARP);
				setState(1865);
				((CSharpCategoryBindingContext)_localctx).binding = csharp_identifier_expression(0);
				}
				break;
			case PYTHON2:
				_localctx = new Python2CategoryBindingContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1866);
				match(PYTHON2);
				setState(1867);
				((Python2CategoryBindingContext)_localctx).binding = python_category_binding();
				}
				break;
			case PYTHON3:
				_localctx = new Python3CategoryBindingContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1868);
				match(PYTHON3);
				setState(1869);
				((Python3CategoryBindingContext)_localctx).binding = python_category_binding();
				}
				break;
			case JAVASCRIPT:
				_localctx = new JavaScriptCategoryBindingContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1870);
				match(JAVASCRIPT);
				setState(1871);
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
		enterRule(_localctx, 244, RULE_python_category_binding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1874);
			identifier();
			setState(1876);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				{
				setState(1875);
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
		enterRule(_localctx, 246, RULE_python_module);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1878);
			match(FROM);
			setState(1879);
			module_token();
			setState(1880);
			match(COLON);
			setState(1881);
			python_identifier();
			setState(1886);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1882);
					match(DOT);
					setState(1883);
					python_identifier();
					}
					} 
				}
				setState(1888);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 248, RULE_javascript_category_binding);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1889);
			javascript_identifier();
			setState(1894);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1890);
					match(DOT);
					setState(1891);
					javascript_identifier();
					}
					} 
				}
				setState(1896);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
			}
			setState(1898);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				{
				setState(1897);
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
		enterRule(_localctx, 250, RULE_javascript_module);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1900);
			match(FROM);
			setState(1901);
			module_token();
			setState(1902);
			match(COLON);
			setState(1904);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SLASH) {
				{
				setState(1903);
				match(SLASH);
				}
			}

			setState(1906);
			javascript_identifier();
			setState(1911);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1907);
					match(SLASH);
					setState(1908);
					javascript_identifier();
					}
					} 
				}
				setState(1913);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
			}
			setState(1916);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				{
				setState(1914);
				match(DOT);
				setState(1915);
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
		enterRule(_localctx, 252, RULE_variable_identifier_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1918);
			variable_identifier();
			setState(1923);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1919);
				match(COMMA);
				setState(1920);
				variable_identifier();
				}
				}
				setState(1925);
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
		enterRule(_localctx, 254, RULE_attribute_identifier_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1926);
			attribute_identifier();
			setState(1931);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1927);
				match(COMMA);
				setState(1928);
				attribute_identifier();
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
		enterRule(_localctx, 256, RULE_method_declaration);
		try {
			setState(1938);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1934);
				abstract_method_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1935);
				concrete_method_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1936);
				native_method_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1937);
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
		enterRule(_localctx, 258, RULE_comment_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1940);
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
		enterRule(_localctx, 260, RULE_native_statement_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1942);
			native_statement();
			setState(1948);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1943);
					lfp();
					setState(1944);
					native_statement();
					}
					} 
				}
				setState(1950);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 262, RULE_native_statement);
		try {
			setState(1961);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JAVA:
				_localctx = new JavaNativeStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1951);
				match(JAVA);
				setState(1952);
				java_statement();
				}
				break;
			case CSHARP:
				_localctx = new CSharpNativeStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1953);
				match(CSHARP);
				setState(1954);
				csharp_statement();
				}
				break;
			case PYTHON2:
				_localctx = new Python2NativeStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1955);
				match(PYTHON2);
				setState(1956);
				python_native_statement();
				}
				break;
			case PYTHON3:
				_localctx = new Python3NativeStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1957);
				match(PYTHON3);
				setState(1958);
				python_native_statement();
				}
				break;
			case JAVASCRIPT:
				_localctx = new JavaScriptNativeStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1959);
				match(JAVASCRIPT);
				setState(1960);
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
		enterRule(_localctx, 264, RULE_python_native_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1963);
			python_statement();
			setState(1965);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1964);
				match(SEMI);
				}
			}

			setState(1968);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(1967);
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
		enterRule(_localctx, 266, RULE_javascript_native_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1970);
			javascript_statement();
			setState(1972);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1971);
				match(SEMI);
				}
			}

			setState(1975);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(1974);
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
		enterRule(_localctx, 268, RULE_statement_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1977);
			statement();
			setState(1983);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1978);
					lfp();
					setState(1979);
					statement();
					}
					} 
				}
				setState(1985);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 270, RULE_assertion_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1986);
			assertion();
			setState(1992);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,158,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1987);
					lfp();
					setState(1988);
					assertion();
					}
					} 
				}
				setState(1994);
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
		enterRule(_localctx, 272, RULE_switch_case_statement_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1995);
			switch_case_statement();
			setState(2001);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1996);
					lfp();
					setState(1997);
					switch_case_statement();
					}
					} 
				}
				setState(2003);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 274, RULE_catch_statement_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2004);
			catch_statement();
			setState(2010);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2005);
					lfp();
					setState(2006);
					catch_statement();
					}
					} 
				}
				setState(2012);
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
		enterRule(_localctx, 276, RULE_literal_collection);
		try {
			setState(2027);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				_localctx = new LiteralRangeLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2013);
				match(LBRAK);
				setState(2014);
				((LiteralRangeLiteralContext)_localctx).low = atomic_literal();
				setState(2015);
				match(RANGE);
				setState(2016);
				((LiteralRangeLiteralContext)_localctx).high = atomic_literal();
				setState(2017);
				match(RBRAK);
				}
				break;
			case 2:
				_localctx = new LiteralListLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2019);
				match(LBRAK);
				setState(2020);
				literal_list_literal();
				setState(2021);
				match(RBRAK);
				}
				break;
			case 3:
				_localctx = new LiteralSetLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2023);
				match(LT);
				setState(2024);
				literal_list_literal();
				setState(2025);
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
		enterRule(_localctx, 278, RULE_atomic_literal);
		try {
			setState(2045);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MIN_INTEGER:
				_localctx = new MinIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2029);
				match(MIN_INTEGER);
				}
				break;
			case MAX_INTEGER:
				_localctx = new MaxIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2030);
				match(MAX_INTEGER);
				}
				break;
			case INTEGER_LITERAL:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2031);
				match(INTEGER_LITERAL);
				}
				break;
			case HEXA_LITERAL:
				_localctx = new HexadecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2032);
				match(HEXA_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new CharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2033);
				match(CHAR_LITERAL);
				}
				break;
			case DATE_LITERAL:
				_localctx = new DateLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2034);
				match(DATE_LITERAL);
				}
				break;
			case TIME_LITERAL:
				_localctx = new TimeLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(2035);
				match(TIME_LITERAL);
				}
				break;
			case TEXT_LITERAL:
				_localctx = new TextLiteralContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(2036);
				match(TEXT_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(2037);
				match(DECIMAL_LITERAL);
				}
				break;
			case DATETIME_LITERAL:
				_localctx = new DateTimeLiteralContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(2038);
				match(DATETIME_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(2039);
				match(BOOLEAN_LITERAL);
				}
				break;
			case PERIOD_LITERAL:
				_localctx = new PeriodLiteralContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(2040);
				match(PERIOD_LITERAL);
				}
				break;
			case VERSION_LITERAL:
				_localctx = new VersionLiteralContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(2041);
				match(VERSION_LITERAL);
				}
				break;
			case UUID_LITERAL:
				_localctx = new UUIDLiteralContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(2042);
				match(UUID_LITERAL);
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
				enterOuterAlt(_localctx, 15);
				{
				setState(2043);
				type_literal();
				}
				break;
			case NONE:
				_localctx = new NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(2044);
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
		enterRule(_localctx, 280, RULE_literal_list_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2047);
			atomic_literal();
			setState(2052);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2048);
				match(COMMA);
				setState(2049);
				atomic_literal();
				}
				}
				setState(2054);
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
		enterRule(_localctx, 282, RULE_this_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2055);
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
		enterRule(_localctx, 284, RULE_parenthesis_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2057);
			match(LPAR);
			setState(2058);
			expression(0);
			setState(2059);
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
		enterRule(_localctx, 286, RULE_literal_expression);
		try {
			setState(2063);
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
				setState(2061);
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
				setState(2062);
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
		enterRule(_localctx, 288, RULE_collection_literal);
		try {
			setState(2071);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2065);
				range_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2066);
				list_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2067);
				set_literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2068);
				dict_literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2069);
				document_literal();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2070);
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
		enterRule(_localctx, 290, RULE_tuple_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2074);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUTABLE) {
				{
				setState(2073);
				match(MUTABLE);
				}
			}

			setState(2076);
			match(LPAR);
			setState(2078);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << LTCOLONGT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CODE - 64)) | (1L << (DOCUMENT - 64)) | (1L << (BLOB - 64)) | (1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (ANY - 64)) | (1L << (EXECUTE - 64)) | (1L << (FETCH - 64)) | (1L << (MUTABLE - 64)) | (1L << (NONE - 64)) | (1L << (NOT - 64)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (READ - 139)) | (1L << (SELF - 139)) | (1L << (SORTED - 139)) | (1L << (THIS - 139)) | (1L << (BOOLEAN_LITERAL - 139)) | (1L << (CHAR_LITERAL - 139)) | (1L << (MIN_INTEGER - 139)) | (1L << (MAX_INTEGER - 139)) | (1L << (SYMBOL_IDENTIFIER - 139)) | (1L << (TYPE_IDENTIFIER - 139)) | (1L << (VARIABLE_IDENTIFIER - 139)) | (1L << (TEXT_LITERAL - 139)) | (1L << (UUID_LITERAL - 139)) | (1L << (INTEGER_LITERAL - 139)) | (1L << (HEXA_LITERAL - 139)) | (1L << (DECIMAL_LITERAL - 139)) | (1L << (DATETIME_LITERAL - 139)) | (1L << (TIME_LITERAL - 139)) | (1L << (DATE_LITERAL - 139)) | (1L << (PERIOD_LITERAL - 139)) | (1L << (VERSION_LITERAL - 139)))) != 0)) {
				{
				setState(2077);
				expression_tuple();
				}
			}

			setState(2080);
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
		enterRule(_localctx, 292, RULE_dict_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2083);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUTABLE) {
				{
				setState(2082);
				match(MUTABLE);
				}
			}

			setState(2093);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				{
				{
				setState(2085);
				match(LT);
				setState(2086);
				dict_entry_list();
				setState(2087);
				match(GT);
				}
				}
				break;
			case 2:
				{
				setState(2089);
				match(LTCOLONGT);
				}
				break;
			case 3:
				{
				{
				setState(2090);
				match(LT);
				setState(2091);
				match(COLON);
				setState(2092);
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
		enterRule(_localctx, 294, RULE_document_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2095);
			match(LCURL);
			setState(2097);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA) | (1L << CSHARP) | (1L << PYTHON2) | (1L << PYTHON3) | (1L << JAVASCRIPT) | (1L << SWIFT) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CODE - 64)) | (1L << (DOCUMENT - 64)) | (1L << (BLOB - 64)) | (1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (ABSTRACT - 64)) | (1L << (ALL - 64)) | (1L << (ALWAYS - 64)) | (1L << (AND - 64)) | (1L << (ANY - 64)) | (1L << (AS - 64)) | (1L << (ASC - 64)) | (1L << (ATTR - 64)) | (1L << (ATTRIBUTE - 64)) | (1L << (ATTRIBUTES - 64)) | (1L << (BINDINGS - 64)) | (1L << (BREAK - 64)) | (1L << (BY - 64)) | (1L << (CASE - 64)) | (1L << (CATCH - 64)) | (1L << (CATEGORY - 64)) | (1L << (CLASS - 64)) | (1L << (CLOSE - 64)) | (1L << (CONTAINS - 64)) | (1L << (DEF - 64)) | (1L << (DEFAULT - 64)) | (1L << (DEFINE - 64)) | (1L << (DELETE - 64)) | (1L << (DESC - 64)) | (1L << (DO - 64)) | (1L << (DOING - 64)) | (1L << (EACH - 64)) | (1L << (ELSE - 64)) | (1L << (ENUM - 64)) | (1L << (ENUMERATED - 64)) | (1L << (EXCEPT - 64)) | (1L << (EXECUTE - 64)) | (1L << (EXPECTING - 64)) | (1L << (EXTENDS - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (FINALLY - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (FROM - 64)) | (1L << (GETTER - 64)) | (1L << (HAS - 64)) | (1L << (IF - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (IS - 64)) | (1L << (MATCHING - 64)) | (1L << (METHOD - 64)) | (1L << (METHODS - 64)) | (1L << (MODULO - 64)) | (1L << (MUTABLE - 64)) | (1L << (NATIVE - 64)) | (1L << (NONE - 64)) | (1L << (NOT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (NOTHING - 128)) | (1L << (NULL - 128)) | (1L << (ON - 128)) | (1L << (ONE - 128)) | (1L << (OPEN - 128)) | (1L << (OPERATOR - 128)) | (1L << (OR - 128)) | (1L << (ORDER - 128)) | (1L << (OTHERWISE - 128)) | (1L << (PASS - 128)) | (1L << (RAISE - 128)) | (1L << (READ - 128)) | (1L << (RECEIVING - 128)) | (1L << (RESOURCE - 128)) | (1L << (RETURN - 128)) | (1L << (RETURNING - 128)) | (1L << (ROWS - 128)) | (1L << (SELF - 128)) | (1L << (SETTER - 128)) | (1L << (SINGLETON - 128)) | (1L << (SORTED - 128)) | (1L << (STORABLE - 128)) | (1L << (STORE - 128)) | (1L << (SWITCH - 128)) | (1L << (TEST - 128)) | (1L << (THIS - 128)) | (1L << (THROW - 128)) | (1L << (TO - 128)) | (1L << (TRY - 128)) | (1L << (VERIFYING - 128)) | (1L << (WIDGET - 128)) | (1L << (WITH - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WHILE - 128)) | (1L << (WRITE - 128)) | (1L << (SYMBOL_IDENTIFIER - 128)) | (1L << (TYPE_IDENTIFIER - 128)) | (1L << (VARIABLE_IDENTIFIER - 128)) | (1L << (TEXT_LITERAL - 128)))) != 0)) {
				{
				setState(2096);
				dict_entry_list();
				}
			}

			setState(2099);
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
		enterRule(_localctx, 296, RULE_expression_tuple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2101);
			expression(0);
			setState(2102);
			match(COMMA);
			setState(2111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << LTCOLONGT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CODE - 64)) | (1L << (DOCUMENT - 64)) | (1L << (BLOB - 64)) | (1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (ANY - 64)) | (1L << (EXECUTE - 64)) | (1L << (FETCH - 64)) | (1L << (MUTABLE - 64)) | (1L << (NONE - 64)) | (1L << (NOT - 64)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (READ - 139)) | (1L << (SELF - 139)) | (1L << (SORTED - 139)) | (1L << (THIS - 139)) | (1L << (BOOLEAN_LITERAL - 139)) | (1L << (CHAR_LITERAL - 139)) | (1L << (MIN_INTEGER - 139)) | (1L << (MAX_INTEGER - 139)) | (1L << (SYMBOL_IDENTIFIER - 139)) | (1L << (TYPE_IDENTIFIER - 139)) | (1L << (VARIABLE_IDENTIFIER - 139)) | (1L << (TEXT_LITERAL - 139)) | (1L << (UUID_LITERAL - 139)) | (1L << (INTEGER_LITERAL - 139)) | (1L << (HEXA_LITERAL - 139)) | (1L << (DECIMAL_LITERAL - 139)) | (1L << (DATETIME_LITERAL - 139)) | (1L << (TIME_LITERAL - 139)) | (1L << (DATE_LITERAL - 139)) | (1L << (PERIOD_LITERAL - 139)) | (1L << (VERSION_LITERAL - 139)))) != 0)) {
				{
				setState(2103);
				expression(0);
				setState(2108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2104);
					match(COMMA);
					setState(2105);
					expression(0);
					}
					}
					setState(2110);
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
		enterRule(_localctx, 298, RULE_dict_entry_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2113);
			dict_entry();
			setState(2118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2114);
				match(COMMA);
				setState(2115);
				dict_entry();
				}
				}
				setState(2120);
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
		enterRule(_localctx, 300, RULE_dict_entry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2121);
			((Dict_entryContext)_localctx).key = dict_key();
			setState(2122);
			match(COLON);
			setState(2123);
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
		enterRule(_localctx, 302, RULE_dict_key);
		try {
			setState(2127);
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
			case CLOSE:
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
			case OPEN:
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
				setState(2125);
				((DictKeyIdentifierContext)_localctx).name = identifier_or_keyword();
				}
				break;
			case TEXT_LITERAL:
				_localctx = new DictKeyTextContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2126);
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
		enterRule(_localctx, 304, RULE_slice_arguments);
		try {
			setState(2138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
			case 1:
				_localctx = new SliceFirstAndLastContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2129);
				((SliceFirstAndLastContext)_localctx).first = expression(0);
				setState(2130);
				match(COLON);
				setState(2131);
				((SliceFirstAndLastContext)_localctx).last = expression(0);
				}
				break;
			case 2:
				_localctx = new SliceFirstOnlyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2133);
				((SliceFirstOnlyContext)_localctx).first = expression(0);
				setState(2134);
				match(COLON);
				}
				break;
			case 3:
				_localctx = new SliceLastOnlyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2136);
				match(COLON);
				setState(2137);
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
		enterRule(_localctx, 306, RULE_assign_variable_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2140);
			variable_identifier();
			setState(2141);
			assign();
			setState(2142);
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
		int _startState = 308;
		enterRecursionRule(_localctx, 308, RULE_assignable_instance, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new RootInstanceContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2145);
			variable_identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(2151);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ChildInstanceContext(new Assignable_instanceContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_assignable_instance);
					setState(2147);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2148);
					child_instance();
					}
					} 
				}
				setState(2153);
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
		enterRule(_localctx, 310, RULE_is_expression);
		try {
			setState(2158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				_localctx = new IsATypeExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2154);
				if (!(this.willBeAOrAn())) throw new FailedPredicateException(this, "$parser.willBeAOrAn()");
				setState(2155);
				match(VARIABLE_IDENTIFIER);
				setState(2156);
				category_or_any_type();
				}
				break;
			case 2:
				_localctx = new IsOtherExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2157);
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
		enterRule(_localctx, 312, RULE_arrow_expression);
		try {
			setState(2168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
			case 1:
				_localctx = new ArrowExpressionBodyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2160);
				arrow_prefix();
				setState(2161);
				expression(0);
				}
				break;
			case 2:
				_localctx = new ArrowStatementsBodyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2163);
				arrow_prefix();
				setState(2164);
				match(LCURL);
				setState(2165);
				statement_list();
				setState(2166);
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
		enterRule(_localctx, 314, RULE_arrow_prefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2170);
			arrow_args();
			setState(2171);
			((Arrow_prefixContext)_localctx).s1 = ws_plus();
			setState(2172);
			match(EGT);
			setState(2173);
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
		enterRule(_localctx, 316, RULE_arrow_args);
		int _la;
		try {
			setState(2181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE_IDENTIFIER:
				_localctx = new ArrowSingleArgContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2175);
				variable_identifier();
				}
				break;
			case LPAR:
				_localctx = new ArrowListArgContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2176);
				match(LPAR);
				setState(2178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VARIABLE_IDENTIFIER) {
					{
					setState(2177);
					variable_identifier_list();
					}
				}

				setState(2180);
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
		enterRule(_localctx, 318, RULE_sorted_key);
		try {
			setState(2185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2183);
				instance_expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2184);
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
		enterRule(_localctx, 320, RULE_read_all_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2187);
			match(READ);
			setState(2188);
			match(ALL);
			setState(2189);
			match(FROM);
			setState(2190);
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
		enterRule(_localctx, 322, RULE_read_one_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2192);
			match(READ);
			setState(2193);
			match(ONE);
			setState(2194);
			match(FROM);
			setState(2195);
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
		enterRule(_localctx, 324, RULE_order_by_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2197);
			order_by();
			setState(2202);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,182,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2198);
					match(COMMA);
					setState(2199);
					order_by();
					}
					} 
				}
				setState(2204);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,182,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 326, RULE_order_by);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2205);
			variable_identifier();
			setState(2210);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,183,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2206);
					match(DOT);
					setState(2207);
					variable_identifier();
					}
					} 
				}
				setState(2212);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,183,_ctx);
			}
			setState(2214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				{
				setState(2213);
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
		enterRule(_localctx, 328, RULE_operator);
		try {
			setState(2222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				_localctx = new OperatorPlusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2216);
				match(PLUS);
				}
				break;
			case MINUS:
				_localctx = new OperatorMinusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2217);
				match(MINUS);
				}
				break;
			case STAR:
				_localctx = new OperatorMultiplyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2218);
				multiply();
				}
				break;
			case SLASH:
				_localctx = new OperatorDivideContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2219);
				divide();
				}
				break;
			case BSLASH:
				_localctx = new OperatorIDivideContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2220);
				idivide();
				}
				break;
			case PERCENT:
			case MODULO:
				_localctx = new OperatorModuloContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2221);
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
		public TerminalNode CLOSE() { return getToken(MParser.CLOSE, 0); }
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
		public TerminalNode OPEN() { return getToken(MParser.OPEN, 0); }
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
		enterRule(_localctx, 330, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2224);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA) | (1L << CSHARP) | (1L << PYTHON2) | (1L << PYTHON3) | (1L << JAVASCRIPT) | (1L << SWIFT) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CODE - 64)) | (1L << (DOCUMENT - 64)) | (1L << (BLOB - 64)) | (1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (ABSTRACT - 64)) | (1L << (ALL - 64)) | (1L << (ALWAYS - 64)) | (1L << (AND - 64)) | (1L << (ANY - 64)) | (1L << (AS - 64)) | (1L << (ASC - 64)) | (1L << (ATTR - 64)) | (1L << (ATTRIBUTE - 64)) | (1L << (ATTRIBUTES - 64)) | (1L << (BINDINGS - 64)) | (1L << (BREAK - 64)) | (1L << (BY - 64)) | (1L << (CASE - 64)) | (1L << (CATCH - 64)) | (1L << (CATEGORY - 64)) | (1L << (CLASS - 64)) | (1L << (CLOSE - 64)) | (1L << (CONTAINS - 64)) | (1L << (DEF - 64)) | (1L << (DEFAULT - 64)) | (1L << (DEFINE - 64)) | (1L << (DELETE - 64)) | (1L << (DESC - 64)) | (1L << (DO - 64)) | (1L << (DOING - 64)) | (1L << (EACH - 64)) | (1L << (ELSE - 64)) | (1L << (ENUM - 64)) | (1L << (ENUMERATED - 64)) | (1L << (EXCEPT - 64)) | (1L << (EXECUTE - 64)) | (1L << (EXPECTING - 64)) | (1L << (EXTENDS - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (FINALLY - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (FROM - 64)) | (1L << (GETTER - 64)) | (1L << (HAS - 64)) | (1L << (IF - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (IS - 64)) | (1L << (MATCHING - 64)) | (1L << (METHOD - 64)) | (1L << (METHODS - 64)) | (1L << (MODULO - 64)) | (1L << (MUTABLE - 64)) | (1L << (NATIVE - 64)) | (1L << (NONE - 64)) | (1L << (NOT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (NOTHING - 128)) | (1L << (NULL - 128)) | (1L << (ON - 128)) | (1L << (ONE - 128)) | (1L << (OPEN - 128)) | (1L << (OPERATOR - 128)) | (1L << (OR - 128)) | (1L << (ORDER - 128)) | (1L << (OTHERWISE - 128)) | (1L << (PASS - 128)) | (1L << (RAISE - 128)) | (1L << (READ - 128)) | (1L << (RECEIVING - 128)) | (1L << (RESOURCE - 128)) | (1L << (RETURN - 128)) | (1L << (RETURNING - 128)) | (1L << (ROWS - 128)) | (1L << (SELF - 128)) | (1L << (SETTER - 128)) | (1L << (SINGLETON - 128)) | (1L << (SORTED - 128)) | (1L << (STORABLE - 128)) | (1L << (STORE - 128)) | (1L << (SWITCH - 128)) | (1L << (TEST - 128)) | (1L << (THIS - 128)) | (1L << (THROW - 128)) | (1L << (TO - 128)) | (1L << (TRY - 128)) | (1L << (VERIFYING - 128)) | (1L << (WIDGET - 128)) | (1L << (WITH - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WHILE - 128)) | (1L << (WRITE - 128)))) != 0)) ) {
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
		enterRule(_localctx, 332, RULE_new_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2226);
			((New_tokenContext)_localctx).i1 = match(VARIABLE_IDENTIFIER);
			setState(2227);
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
		enterRule(_localctx, 334, RULE_key_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2229);
			((Key_tokenContext)_localctx).i1 = match(VARIABLE_IDENTIFIER);
			setState(2230);
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
		enterRule(_localctx, 336, RULE_module_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2232);
			((Module_tokenContext)_localctx).i1 = match(VARIABLE_IDENTIFIER);
			setState(2233);
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
		enterRule(_localctx, 338, RULE_value_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2235);
			((Value_tokenContext)_localctx).i1 = match(VARIABLE_IDENTIFIER);
			setState(2236);
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
		enterRule(_localctx, 340, RULE_symbols_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2238);
			((Symbols_tokenContext)_localctx).i1 = match(VARIABLE_IDENTIFIER);
			setState(2239);
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
		enterRule(_localctx, 342, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2241);
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
		enterRule(_localctx, 344, RULE_multiply);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2243);
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
		enterRule(_localctx, 346, RULE_divide);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2245);
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
		enterRule(_localctx, 348, RULE_idivide);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2247);
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
		enterRule(_localctx, 350, RULE_modulo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2249);
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
		enterRule(_localctx, 352, RULE_javascript_statement);
		try {
			setState(2258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
				_localctx = new JavascriptReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2251);
				match(RETURN);
				setState(2252);
				((JavascriptReturnStatementContext)_localctx).exp = javascript_expression(0);
				setState(2253);
				match(SEMI);
				}
				break;
			case LPAR:
			case LBRAK:
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
			case UUID:
			case HTML:
			case NONE:
			case NULL:
			case READ:
			case SELF:
			case TEST:
			case THIS:
			case WRITE:
			case BOOLEAN_LITERAL:
			case CHAR_LITERAL:
			case SYMBOL_IDENTIFIER:
			case TYPE_IDENTIFIER:
			case VARIABLE_IDENTIFIER:
			case DOLLAR_IDENTIFIER:
			case TEXT_LITERAL:
			case INTEGER_LITERAL:
			case DECIMAL_LITERAL:
				_localctx = new JavascriptStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2255);
				((JavascriptStatementContext)_localctx).exp = javascript_expression(0);
				setState(2256);
				match(SEMI);
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
		int _startState = 354;
		enterRecursionRule(_localctx, 354, RULE_javascript_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavascriptPrimaryExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2261);
			((JavascriptPrimaryExpressionContext)_localctx).exp = javascript_primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(2267);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavascriptSelectorExpressionContext(new Javascript_expressionContext(_parentctx, _parentState));
					((JavascriptSelectorExpressionContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_javascript_expression);
					setState(2263);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2264);
					((JavascriptSelectorExpressionContext)_localctx).child = javascript_selector_expression();
					}
					} 
				}
				setState(2269);
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
		enterRule(_localctx, 356, RULE_javascript_primary_expression);
		try {
			setState(2277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2270);
				javascript_this_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2271);
				javascript_new_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2272);
				javascript_parenthesis_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2273);
				javascript_identifier_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2274);
				javascript_literal_expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2275);
				javascript_method_expression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2276);
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
		enterRule(_localctx, 358, RULE_javascript_this_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2279);
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
		enterRule(_localctx, 360, RULE_javascript_new_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2281);
			new_token();
			setState(2282);
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
		enterRule(_localctx, 362, RULE_javascript_selector_expression);
		try {
			setState(2289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
			case 1:
				_localctx = new JavaScriptMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2284);
				match(DOT);
				setState(2285);
				((JavaScriptMethodExpressionContext)_localctx).method = javascript_method_expression();
				}
				break;
			case 2:
				_localctx = new JavaScriptMemberExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2286);
				match(DOT);
				setState(2287);
				((JavaScriptMemberExpressionContext)_localctx).name = javascript_identifier();
				}
				break;
			case 3:
				_localctx = new JavaScriptItemExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2288);
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
		enterRule(_localctx, 364, RULE_javascript_method_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2291);
			((Javascript_method_expressionContext)_localctx).name = javascript_identifier();
			setState(2292);
			match(LPAR);
			setState(2294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (LPAR - 20)) | (1L << (LBRAK - 20)) | (1L << (BOOLEAN - 20)) | (1L << (CHARACTER - 20)) | (1L << (TEXT - 20)) | (1L << (INTEGER - 20)) | (1L << (DECIMAL - 20)) | (1L << (DATE - 20)) | (1L << (TIME - 20)) | (1L << (DATETIME - 20)) | (1L << (PERIOD - 20)) | (1L << (VERSION - 20)) | (1L << (UUID - 20)) | (1L << (HTML - 20)))) != 0) || ((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & ((1L << (NONE - 126)) | (1L << (NULL - 126)) | (1L << (READ - 126)) | (1L << (SELF - 126)) | (1L << (TEST - 126)) | (1L << (THIS - 126)) | (1L << (WRITE - 126)) | (1L << (BOOLEAN_LITERAL - 126)) | (1L << (CHAR_LITERAL - 126)) | (1L << (SYMBOL_IDENTIFIER - 126)) | (1L << (TYPE_IDENTIFIER - 126)) | (1L << (VARIABLE_IDENTIFIER - 126)) | (1L << (DOLLAR_IDENTIFIER - 126)) | (1L << (TEXT_LITERAL - 126)) | (1L << (INTEGER_LITERAL - 126)) | (1L << (DECIMAL_LITERAL - 126)))) != 0)) {
				{
				setState(2293);
				((Javascript_method_expressionContext)_localctx).args = javascript_arguments(0);
				}
			}

			setState(2296);
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
		int _startState = 366;
		enterRecursionRule(_localctx, 366, RULE_javascript_arguments, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavascriptArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2299);
			((JavascriptArgumentListContext)_localctx).item = javascript_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2306);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,191,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavascriptArgumentListItemContext(new Javascript_argumentsContext(_parentctx, _parentState));
					((JavascriptArgumentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_javascript_arguments);
					setState(2301);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2302);
					match(COMMA);
					setState(2303);
					((JavascriptArgumentListItemContext)_localctx).item = javascript_expression(0);
					}
					} 
				}
				setState(2308);
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
		enterRule(_localctx, 368, RULE_javascript_item_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2309);
			match(LBRAK);
			setState(2310);
			((Javascript_item_expressionContext)_localctx).exp = javascript_expression(0);
			setState(2311);
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
		enterRule(_localctx, 370, RULE_javascript_parenthesis_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2313);
			match(LPAR);
			setState(2314);
			((Javascript_parenthesis_expressionContext)_localctx).exp = javascript_expression(0);
			setState(2315);
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
		enterRule(_localctx, 372, RULE_javascript_identifier_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2317);
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
		enterRule(_localctx, 374, RULE_javascript_literal_expression);
		try {
			setState(2324);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				_localctx = new JavascriptIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2319);
				((JavascriptIntegerLiteralContext)_localctx).t = match(INTEGER_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				_localctx = new JavascriptDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2320);
				((JavascriptDecimalLiteralContext)_localctx).t = match(DECIMAL_LITERAL);
				}
				break;
			case TEXT_LITERAL:
				_localctx = new JavascriptTextLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2321);
				((JavascriptTextLiteralContext)_localctx).t = match(TEXT_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new JavascriptBooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2322);
				((JavascriptBooleanLiteralContext)_localctx).t = match(BOOLEAN_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new JavascriptCharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2323);
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
		public TerminalNode UUID() { return getToken(MParser.UUID, 0); }
		public TerminalNode HTML() { return getToken(MParser.HTML, 0); }
		public TerminalNode READ() { return getToken(MParser.READ, 0); }
		public TerminalNode WRITE() { return getToken(MParser.WRITE, 0); }
		public TerminalNode TEST() { return getToken(MParser.TEST, 0); }
		public TerminalNode SELF() { return getToken(MParser.SELF, 0); }
		public TerminalNode NONE() { return getToken(MParser.NONE, 0); }
		public TerminalNode NULL() { return getToken(MParser.NULL, 0); }
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
		enterRule(_localctx, 376, RULE_javascript_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2326);
			_la = _input.LA(1);
			if ( !(((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (BOOLEAN - 52)) | (1L << (CHARACTER - 52)) | (1L << (TEXT - 52)) | (1L << (INTEGER - 52)) | (1L << (DECIMAL - 52)) | (1L << (DATE - 52)) | (1L << (TIME - 52)) | (1L << (DATETIME - 52)) | (1L << (PERIOD - 52)) | (1L << (VERSION - 52)) | (1L << (UUID - 52)) | (1L << (HTML - 52)))) != 0) || ((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & ((1L << (NONE - 126)) | (1L << (NULL - 126)) | (1L << (READ - 126)) | (1L << (SELF - 126)) | (1L << (TEST - 126)) | (1L << (WRITE - 126)) | (1L << (SYMBOL_IDENTIFIER - 126)) | (1L << (TYPE_IDENTIFIER - 126)) | (1L << (VARIABLE_IDENTIFIER - 126)) | (1L << (DOLLAR_IDENTIFIER - 126)))) != 0)) ) {
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
		enterRule(_localctx, 378, RULE_python_statement);
		try {
			setState(2331);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
				_localctx = new PythonReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2328);
				match(RETURN);
				setState(2329);
				((PythonReturnStatementContext)_localctx).exp = python_expression(0);
				}
				break;
			case LPAR:
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
			case UUID:
			case HTML:
			case NONE:
			case NULL:
			case READ:
			case SELF:
			case TEST:
			case THIS:
			case WRITE:
			case BOOLEAN_LITERAL:
			case CHAR_LITERAL:
			case SYMBOL_IDENTIFIER:
			case TYPE_IDENTIFIER:
			case VARIABLE_IDENTIFIER:
			case DOLLAR_IDENTIFIER:
			case TEXT_LITERAL:
			case INTEGER_LITERAL:
			case DECIMAL_LITERAL:
				_localctx = new PythonStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2330);
				((PythonStatementContext)_localctx).exp = python_expression(0);
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
		int _startState = 380;
		enterRecursionRule(_localctx, 380, RULE_python_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PythonPrimaryExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2334);
			((PythonPrimaryExpressionContext)_localctx).exp = python_primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(2340);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,194,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PythonSelectorExpressionContext(new Python_expressionContext(_parentctx, _parentState));
					((PythonSelectorExpressionContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_python_expression);
					setState(2336);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2337);
					((PythonSelectorExpressionContext)_localctx).child = python_selector_expression();
					}
					} 
				}
				setState(2342);
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
		enterRule(_localctx, 382, RULE_python_primary_expression);
		try {
			setState(2348);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				_localctx = new PythonSelfExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2343);
				((PythonSelfExpressionContext)_localctx).exp = python_self_expression();
				}
				break;
			case 2:
				_localctx = new PythonParenthesisExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2344);
				((PythonParenthesisExpressionContext)_localctx).exp = python_parenthesis_expression();
				}
				break;
			case 3:
				_localctx = new PythonIdentifierExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2345);
				((PythonIdentifierExpressionContext)_localctx).exp = python_identifier_expression(0);
				}
				break;
			case 4:
				_localctx = new PythonLiteralExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2346);
				((PythonLiteralExpressionContext)_localctx).exp = python_literal_expression();
				}
				break;
			case 5:
				_localctx = new PythonGlobalMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2347);
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
		enterRule(_localctx, 384, RULE_python_self_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2350);
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
		enterRule(_localctx, 386, RULE_python_selector_expression);
		try {
			setState(2358);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				_localctx = new PythonMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2352);
				match(DOT);
				setState(2353);
				((PythonMethodExpressionContext)_localctx).exp = python_method_expression();
				}
				break;
			case LBRAK:
				_localctx = new PythonItemExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2354);
				match(LBRAK);
				setState(2355);
				((PythonItemExpressionContext)_localctx).exp = python_expression(0);
				setState(2356);
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
		enterRule(_localctx, 388, RULE_python_method_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2360);
			((Python_method_expressionContext)_localctx).name = python_identifier();
			setState(2361);
			match(LPAR);
			setState(2363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (LPAR - 20)) | (1L << (BOOLEAN - 20)) | (1L << (CHARACTER - 20)) | (1L << (TEXT - 20)) | (1L << (INTEGER - 20)) | (1L << (DECIMAL - 20)) | (1L << (DATE - 20)) | (1L << (TIME - 20)) | (1L << (DATETIME - 20)) | (1L << (PERIOD - 20)) | (1L << (VERSION - 20)) | (1L << (UUID - 20)) | (1L << (HTML - 20)))) != 0) || ((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & ((1L << (NONE - 126)) | (1L << (NULL - 126)) | (1L << (READ - 126)) | (1L << (SELF - 126)) | (1L << (TEST - 126)) | (1L << (THIS - 126)) | (1L << (WRITE - 126)) | (1L << (BOOLEAN_LITERAL - 126)) | (1L << (CHAR_LITERAL - 126)) | (1L << (SYMBOL_IDENTIFIER - 126)) | (1L << (TYPE_IDENTIFIER - 126)) | (1L << (VARIABLE_IDENTIFIER - 126)) | (1L << (DOLLAR_IDENTIFIER - 126)) | (1L << (TEXT_LITERAL - 126)) | (1L << (INTEGER_LITERAL - 126)) | (1L << (DECIMAL_LITERAL - 126)))) != 0)) {
				{
				setState(2362);
				((Python_method_expressionContext)_localctx).args = python_argument_list();
				}
			}

			setState(2365);
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
		enterRule(_localctx, 390, RULE_python_argument_list);
		try {
			setState(2373);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
			case 1:
				_localctx = new PythonOrdinalOnlyArgumentListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2367);
				((PythonOrdinalOnlyArgumentListContext)_localctx).ordinal = python_ordinal_argument_list(0);
				}
				break;
			case 2:
				_localctx = new PythonNamedOnlyArgumentListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2368);
				((PythonNamedOnlyArgumentListContext)_localctx).named = python_named_argument_list(0);
				}
				break;
			case 3:
				_localctx = new PythonArgumentListContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2369);
				((PythonArgumentListContext)_localctx).ordinal = python_ordinal_argument_list(0);
				setState(2370);
				match(COMMA);
				setState(2371);
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
		int _startState = 392;
		enterRecursionRule(_localctx, 392, RULE_python_ordinal_argument_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PythonOrdinalArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2376);
			((PythonOrdinalArgumentListContext)_localctx).item = python_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2383);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PythonOrdinalArgumentListItemContext(new Python_ordinal_argument_listContext(_parentctx, _parentState));
					((PythonOrdinalArgumentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_python_ordinal_argument_list);
					setState(2378);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2379);
					match(COMMA);
					setState(2380);
					((PythonOrdinalArgumentListItemContext)_localctx).item = python_expression(0);
					}
					} 
				}
				setState(2385);
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
		int _startState = 394;
		enterRecursionRule(_localctx, 394, RULE_python_named_argument_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PythonNamedArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2387);
			((PythonNamedArgumentListContext)_localctx).name = python_identifier();
			setState(2388);
			match(EQ);
			setState(2389);
			((PythonNamedArgumentListContext)_localctx).exp = python_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2399);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,200,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PythonNamedArgumentListItemContext(new Python_named_argument_listContext(_parentctx, _parentState));
					((PythonNamedArgumentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_python_named_argument_list);
					setState(2391);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2392);
					match(COMMA);
					setState(2393);
					((PythonNamedArgumentListItemContext)_localctx).name = python_identifier();
					setState(2394);
					match(EQ);
					setState(2395);
					((PythonNamedArgumentListItemContext)_localctx).exp = python_expression(0);
					}
					} 
				}
				setState(2401);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,200,_ctx);
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
		enterRule(_localctx, 396, RULE_python_parenthesis_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2402);
			match(LPAR);
			setState(2403);
			((Python_parenthesis_expressionContext)_localctx).exp = python_expression(0);
			setState(2404);
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
		int _startState = 398;
		enterRecursionRule(_localctx, 398, RULE_python_identifier_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2409);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOLLAR_IDENTIFIER:
				{
				_localctx = new PythonPromptoIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2407);
				match(DOLLAR_IDENTIFIER);
				}
				break;
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
			case UUID:
			case HTML:
			case NONE:
			case NULL:
			case READ:
			case TEST:
			case THIS:
			case WRITE:
			case SYMBOL_IDENTIFIER:
			case TYPE_IDENTIFIER:
			case VARIABLE_IDENTIFIER:
				{
				_localctx = new PythonIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2408);
				((PythonIdentifierContext)_localctx).name = python_identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(2416);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,202,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PythonChildIdentifierContext(new Python_identifier_expressionContext(_parentctx, _parentState));
					((PythonChildIdentifierContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_python_identifier_expression);
					setState(2411);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2412);
					match(DOT);
					setState(2413);
					((PythonChildIdentifierContext)_localctx).name = python_identifier();
					}
					} 
				}
				setState(2418);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,202,_ctx);
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
		enterRule(_localctx, 400, RULE_python_literal_expression);
		try {
			setState(2424);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				_localctx = new PythonIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2419);
				((PythonIntegerLiteralContext)_localctx).t = match(INTEGER_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				_localctx = new PythonDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2420);
				((PythonDecimalLiteralContext)_localctx).t = match(DECIMAL_LITERAL);
				}
				break;
			case TEXT_LITERAL:
				_localctx = new PythonTextLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2421);
				((PythonTextLiteralContext)_localctx).t = match(TEXT_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new PythonBooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2422);
				((PythonBooleanLiteralContext)_localctx).t = match(BOOLEAN_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new PythonCharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2423);
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
		public TerminalNode TYPE_IDENTIFIER() { return getToken(MParser.TYPE_IDENTIFIER, 0); }
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
		public TerminalNode UUID() { return getToken(MParser.UUID, 0); }
		public TerminalNode HTML() { return getToken(MParser.HTML, 0); }
		public TerminalNode READ() { return getToken(MParser.READ, 0); }
		public TerminalNode WRITE() { return getToken(MParser.WRITE, 0); }
		public TerminalNode TEST() { return getToken(MParser.TEST, 0); }
		public TerminalNode THIS() { return getToken(MParser.THIS, 0); }
		public TerminalNode NONE() { return getToken(MParser.NONE, 0); }
		public TerminalNode NULL() { return getToken(MParser.NULL, 0); }
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
		enterRule(_localctx, 402, RULE_python_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2426);
			_la = _input.LA(1);
			if ( !(((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (BOOLEAN - 52)) | (1L << (CHARACTER - 52)) | (1L << (TEXT - 52)) | (1L << (INTEGER - 52)) | (1L << (DECIMAL - 52)) | (1L << (DATE - 52)) | (1L << (TIME - 52)) | (1L << (DATETIME - 52)) | (1L << (PERIOD - 52)) | (1L << (VERSION - 52)) | (1L << (UUID - 52)) | (1L << (HTML - 52)))) != 0) || ((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & ((1L << (NONE - 126)) | (1L << (NULL - 126)) | (1L << (READ - 126)) | (1L << (TEST - 126)) | (1L << (THIS - 126)) | (1L << (WRITE - 126)) | (1L << (SYMBOL_IDENTIFIER - 126)) | (1L << (TYPE_IDENTIFIER - 126)) | (1L << (VARIABLE_IDENTIFIER - 126)))) != 0)) ) {
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
		enterRule(_localctx, 404, RULE_java_statement);
		try {
			setState(2435);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
				_localctx = new JavaReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2428);
				match(RETURN);
				setState(2429);
				((JavaReturnStatementContext)_localctx).exp = java_expression(0);
				setState(2430);
				match(SEMI);
				}
				break;
			case LPAR:
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
			case UUID:
			case HTML:
			case NONE:
			case NULL:
			case READ:
			case SELF:
			case TEST:
			case THIS:
			case WRITE:
			case BOOLEAN_LITERAL:
			case CHAR_LITERAL:
			case SYMBOL_IDENTIFIER:
			case TYPE_IDENTIFIER:
			case VARIABLE_IDENTIFIER:
			case NATIVE_IDENTIFIER:
			case DOLLAR_IDENTIFIER:
			case TEXT_LITERAL:
			case INTEGER_LITERAL:
			case DECIMAL_LITERAL:
				_localctx = new JavaStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2432);
				((JavaStatementContext)_localctx).exp = java_expression(0);
				setState(2433);
				match(SEMI);
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
		int _startState = 406;
		enterRecursionRule(_localctx, 406, RULE_java_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavaPrimaryExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2438);
			((JavaPrimaryExpressionContext)_localctx).exp = java_primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(2444);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,205,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavaSelectorExpressionContext(new Java_expressionContext(_parentctx, _parentState));
					((JavaSelectorExpressionContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_java_expression);
					setState(2440);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2441);
					((JavaSelectorExpressionContext)_localctx).child = java_selector_expression();
					}
					} 
				}
				setState(2446);
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
		enterRule(_localctx, 408, RULE_java_primary_expression);
		try {
			setState(2452);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2447);
				java_this_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2448);
				java_new_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2449);
				java_parenthesis_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2450);
				java_identifier_expression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2451);
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
		enterRule(_localctx, 410, RULE_java_this_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2454);
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
		enterRule(_localctx, 412, RULE_java_new_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2456);
			new_token();
			setState(2457);
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
		enterRule(_localctx, 414, RULE_java_selector_expression);
		try {
			setState(2462);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				_localctx = new JavaMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2459);
				match(DOT);
				setState(2460);
				((JavaMethodExpressionContext)_localctx).exp = java_method_expression();
				}
				break;
			case LBRAK:
				_localctx = new JavaItemExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2461);
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
		enterRule(_localctx, 416, RULE_java_method_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2464);
			((Java_method_expressionContext)_localctx).name = java_identifier();
			setState(2465);
			match(LPAR);
			setState(2467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (LPAR - 20)) | (1L << (BOOLEAN - 20)) | (1L << (CHARACTER - 20)) | (1L << (TEXT - 20)) | (1L << (INTEGER - 20)) | (1L << (DECIMAL - 20)) | (1L << (DATE - 20)) | (1L << (TIME - 20)) | (1L << (DATETIME - 20)) | (1L << (PERIOD - 20)) | (1L << (VERSION - 20)) | (1L << (UUID - 20)) | (1L << (HTML - 20)))) != 0) || ((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & ((1L << (NONE - 126)) | (1L << (NULL - 126)) | (1L << (READ - 126)) | (1L << (SELF - 126)) | (1L << (TEST - 126)) | (1L << (THIS - 126)) | (1L << (WRITE - 126)) | (1L << (BOOLEAN_LITERAL - 126)) | (1L << (CHAR_LITERAL - 126)) | (1L << (SYMBOL_IDENTIFIER - 126)) | (1L << (TYPE_IDENTIFIER - 126)) | (1L << (VARIABLE_IDENTIFIER - 126)) | (1L << (NATIVE_IDENTIFIER - 126)) | (1L << (DOLLAR_IDENTIFIER - 126)) | (1L << (TEXT_LITERAL - 126)) | (1L << (INTEGER_LITERAL - 126)) | (1L << (DECIMAL_LITERAL - 126)))) != 0)) {
				{
				setState(2466);
				((Java_method_expressionContext)_localctx).args = java_arguments(0);
				}
			}

			setState(2469);
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
		int _startState = 418;
		enterRecursionRule(_localctx, 418, RULE_java_arguments, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavaArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2472);
			((JavaArgumentListContext)_localctx).item = java_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2479);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,209,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavaArgumentListItemContext(new Java_argumentsContext(_parentctx, _parentState));
					((JavaArgumentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_java_arguments);
					setState(2474);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2475);
					match(COMMA);
					setState(2476);
					((JavaArgumentListItemContext)_localctx).item = java_expression(0);
					}
					} 
				}
				setState(2481);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,209,_ctx);
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
		enterRule(_localctx, 420, RULE_java_item_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2482);
			match(LBRAK);
			setState(2483);
			((Java_item_expressionContext)_localctx).exp = java_expression(0);
			setState(2484);
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
		enterRule(_localctx, 422, RULE_java_parenthesis_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2486);
			match(LPAR);
			setState(2487);
			((Java_parenthesis_expressionContext)_localctx).exp = java_expression(0);
			setState(2488);
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
		int _startState = 424;
		enterRecursionRule(_localctx, 424, RULE_java_identifier_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavaIdentifierContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2491);
			((JavaIdentifierContext)_localctx).name = java_identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(2498);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,210,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavaChildIdentifierContext(new Java_identifier_expressionContext(_parentctx, _parentState));
					((JavaChildIdentifierContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_java_identifier_expression);
					setState(2493);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2494);
					match(DOT);
					setState(2495);
					((JavaChildIdentifierContext)_localctx).name = java_identifier();
					}
					} 
				}
				setState(2500);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,210,_ctx);
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
		int _startState = 426;
		enterRecursionRule(_localctx, 426, RULE_java_class_identifier_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavaClassIdentifierContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2502);
			((JavaClassIdentifierContext)_localctx).klass = java_identifier_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2508);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,211,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavaChildClassIdentifierContext(new Java_class_identifier_expressionContext(_parentctx, _parentState));
					((JavaChildClassIdentifierContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_java_class_identifier_expression);
					setState(2504);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2505);
					((JavaChildClassIdentifierContext)_localctx).name = match(DOLLAR_IDENTIFIER);
					}
					} 
				}
				setState(2510);
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
		enterRule(_localctx, 428, RULE_java_literal_expression);
		try {
			setState(2516);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				_localctx = new JavaIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2511);
				((JavaIntegerLiteralContext)_localctx).t = match(INTEGER_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				_localctx = new JavaDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2512);
				((JavaDecimalLiteralContext)_localctx).t = match(DECIMAL_LITERAL);
				}
				break;
			case TEXT_LITERAL:
				_localctx = new JavaTextLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2513);
				((JavaTextLiteralContext)_localctx).t = match(TEXT_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new JavaBooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2514);
				((JavaBooleanLiteralContext)_localctx).t = match(BOOLEAN_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new JavaCharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2515);
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
		public TerminalNode NATIVE_IDENTIFIER() { return getToken(MParser.NATIVE_IDENTIFIER, 0); }
		public TerminalNode DOLLAR_IDENTIFIER() { return getToken(MParser.DOLLAR_IDENTIFIER, 0); }
		public TerminalNode TYPE_IDENTIFIER() { return getToken(MParser.TYPE_IDENTIFIER, 0); }
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
		public TerminalNode UUID() { return getToken(MParser.UUID, 0); }
		public TerminalNode HTML() { return getToken(MParser.HTML, 0); }
		public TerminalNode READ() { return getToken(MParser.READ, 0); }
		public TerminalNode WRITE() { return getToken(MParser.WRITE, 0); }
		public TerminalNode TEST() { return getToken(MParser.TEST, 0); }
		public TerminalNode SELF() { return getToken(MParser.SELF, 0); }
		public TerminalNode NONE() { return getToken(MParser.NONE, 0); }
		public TerminalNode NULL() { return getToken(MParser.NULL, 0); }
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
		enterRule(_localctx, 430, RULE_java_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2518);
			_la = _input.LA(1);
			if ( !(((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (BOOLEAN - 52)) | (1L << (CHARACTER - 52)) | (1L << (TEXT - 52)) | (1L << (INTEGER - 52)) | (1L << (DECIMAL - 52)) | (1L << (DATE - 52)) | (1L << (TIME - 52)) | (1L << (DATETIME - 52)) | (1L << (PERIOD - 52)) | (1L << (VERSION - 52)) | (1L << (UUID - 52)) | (1L << (HTML - 52)))) != 0) || ((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & ((1L << (NONE - 126)) | (1L << (NULL - 126)) | (1L << (READ - 126)) | (1L << (SELF - 126)) | (1L << (TEST - 126)) | (1L << (WRITE - 126)) | (1L << (SYMBOL_IDENTIFIER - 126)) | (1L << (TYPE_IDENTIFIER - 126)) | (1L << (VARIABLE_IDENTIFIER - 126)) | (1L << (NATIVE_IDENTIFIER - 126)) | (1L << (DOLLAR_IDENTIFIER - 126)))) != 0)) ) {
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
		enterRule(_localctx, 432, RULE_csharp_statement);
		try {
			setState(2527);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
				_localctx = new CSharpReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2520);
				match(RETURN);
				setState(2521);
				((CSharpReturnStatementContext)_localctx).exp = csharp_expression(0);
				setState(2522);
				match(SEMI);
				}
				break;
			case LPAR:
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
			case UUID:
			case HTML:
			case NONE:
			case NULL:
			case READ:
			case SELF:
			case TEST:
			case THIS:
			case WRITE:
			case BOOLEAN_LITERAL:
			case CHAR_LITERAL:
			case SYMBOL_IDENTIFIER:
			case TYPE_IDENTIFIER:
			case VARIABLE_IDENTIFIER:
			case DOLLAR_IDENTIFIER:
			case TEXT_LITERAL:
			case INTEGER_LITERAL:
			case DECIMAL_LITERAL:
				_localctx = new CSharpStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2524);
				((CSharpStatementContext)_localctx).exp = csharp_expression(0);
				setState(2525);
				match(SEMI);
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
		int _startState = 434;
		enterRecursionRule(_localctx, 434, RULE_csharp_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new CSharpPrimaryExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2530);
			((CSharpPrimaryExpressionContext)_localctx).exp = csharp_primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(2536);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CSharpSelectorExpressionContext(new Csharp_expressionContext(_parentctx, _parentState));
					((CSharpSelectorExpressionContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_csharp_expression);
					setState(2532);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2533);
					((CSharpSelectorExpressionContext)_localctx).child = csharp_selector_expression();
					}
					} 
				}
				setState(2538);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
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
		enterRule(_localctx, 436, RULE_csharp_primary_expression);
		try {
			setState(2544);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2539);
				csharp_this_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2540);
				csharp_new_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2541);
				csharp_parenthesis_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2542);
				csharp_identifier_expression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2543);
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
		enterRule(_localctx, 438, RULE_csharp_this_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2546);
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
		enterRule(_localctx, 440, RULE_csharp_new_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2548);
			new_token();
			setState(2549);
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
		enterRule(_localctx, 442, RULE_csharp_selector_expression);
		try {
			setState(2554);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				_localctx = new CSharpMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2551);
				match(DOT);
				setState(2552);
				((CSharpMethodExpressionContext)_localctx).exp = csharp_method_expression();
				}
				break;
			case LBRAK:
				_localctx = new CSharpItemExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2553);
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
		enterRule(_localctx, 444, RULE_csharp_method_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2556);
			((Csharp_method_expressionContext)_localctx).name = csharp_identifier();
			setState(2557);
			match(LPAR);
			setState(2559);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (LPAR - 20)) | (1L << (BOOLEAN - 20)) | (1L << (CHARACTER - 20)) | (1L << (TEXT - 20)) | (1L << (INTEGER - 20)) | (1L << (DECIMAL - 20)) | (1L << (DATE - 20)) | (1L << (TIME - 20)) | (1L << (DATETIME - 20)) | (1L << (PERIOD - 20)) | (1L << (VERSION - 20)) | (1L << (UUID - 20)) | (1L << (HTML - 20)))) != 0) || ((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & ((1L << (NONE - 126)) | (1L << (NULL - 126)) | (1L << (READ - 126)) | (1L << (SELF - 126)) | (1L << (TEST - 126)) | (1L << (THIS - 126)) | (1L << (WRITE - 126)) | (1L << (BOOLEAN_LITERAL - 126)) | (1L << (CHAR_LITERAL - 126)) | (1L << (SYMBOL_IDENTIFIER - 126)) | (1L << (TYPE_IDENTIFIER - 126)) | (1L << (VARIABLE_IDENTIFIER - 126)) | (1L << (DOLLAR_IDENTIFIER - 126)) | (1L << (TEXT_LITERAL - 126)) | (1L << (INTEGER_LITERAL - 126)) | (1L << (DECIMAL_LITERAL - 126)))) != 0)) {
				{
				setState(2558);
				((Csharp_method_expressionContext)_localctx).args = csharp_arguments(0);
				}
			}

			setState(2561);
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
		int _startState = 446;
		enterRecursionRule(_localctx, 446, RULE_csharp_arguments, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new CSharpArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2564);
			((CSharpArgumentListContext)_localctx).item = csharp_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2571);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,218,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CSharpArgumentListItemContext(new Csharp_argumentsContext(_parentctx, _parentState));
					((CSharpArgumentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_csharp_arguments);
					setState(2566);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2567);
					match(COMMA);
					setState(2568);
					((CSharpArgumentListItemContext)_localctx).item = csharp_expression(0);
					}
					} 
				}
				setState(2573);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,218,_ctx);
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
		enterRule(_localctx, 448, RULE_csharp_item_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2574);
			match(LBRAK);
			setState(2575);
			((Csharp_item_expressionContext)_localctx).exp = csharp_expression(0);
			setState(2576);
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
		enterRule(_localctx, 450, RULE_csharp_parenthesis_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2578);
			match(LPAR);
			setState(2579);
			((Csharp_parenthesis_expressionContext)_localctx).exp = csharp_expression(0);
			setState(2580);
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
		int _startState = 452;
		enterRecursionRule(_localctx, 452, RULE_csharp_identifier_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2585);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOLLAR_IDENTIFIER:
				{
				_localctx = new CSharpPromptoIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2583);
				match(DOLLAR_IDENTIFIER);
				}
				break;
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
			case UUID:
			case HTML:
			case NONE:
			case NULL:
			case READ:
			case SELF:
			case TEST:
			case WRITE:
			case SYMBOL_IDENTIFIER:
			case TYPE_IDENTIFIER:
			case VARIABLE_IDENTIFIER:
				{
				_localctx = new CSharpIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2584);
				((CSharpIdentifierContext)_localctx).name = csharp_identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(2592);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,220,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CSharpChildIdentifierContext(new Csharp_identifier_expressionContext(_parentctx, _parentState));
					((CSharpChildIdentifierContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_csharp_identifier_expression);
					setState(2587);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2588);
					match(DOT);
					setState(2589);
					((CSharpChildIdentifierContext)_localctx).name = csharp_identifier();
					}
					} 
				}
				setState(2594);
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
		enterRule(_localctx, 454, RULE_csharp_literal_expression);
		try {
			setState(2600);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				_localctx = new CSharpIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2595);
				match(INTEGER_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				_localctx = new CSharpDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2596);
				match(DECIMAL_LITERAL);
				}
				break;
			case TEXT_LITERAL:
				_localctx = new CSharpTextLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2597);
				match(TEXT_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new CSharpBooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2598);
				match(BOOLEAN_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new CSharpCharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2599);
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
		public TerminalNode TYPE_IDENTIFIER() { return getToken(MParser.TYPE_IDENTIFIER, 0); }
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
		public TerminalNode UUID() { return getToken(MParser.UUID, 0); }
		public TerminalNode HTML() { return getToken(MParser.HTML, 0); }
		public TerminalNode READ() { return getToken(MParser.READ, 0); }
		public TerminalNode WRITE() { return getToken(MParser.WRITE, 0); }
		public TerminalNode TEST() { return getToken(MParser.TEST, 0); }
		public TerminalNode SELF() { return getToken(MParser.SELF, 0); }
		public TerminalNode NONE() { return getToken(MParser.NONE, 0); }
		public TerminalNode NULL() { return getToken(MParser.NULL, 0); }
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
		enterRule(_localctx, 456, RULE_csharp_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2602);
			_la = _input.LA(1);
			if ( !(((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (BOOLEAN - 52)) | (1L << (CHARACTER - 52)) | (1L << (TEXT - 52)) | (1L << (INTEGER - 52)) | (1L << (DECIMAL - 52)) | (1L << (DATE - 52)) | (1L << (TIME - 52)) | (1L << (DATETIME - 52)) | (1L << (PERIOD - 52)) | (1L << (VERSION - 52)) | (1L << (UUID - 52)) | (1L << (HTML - 52)))) != 0) || ((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & ((1L << (NONE - 126)) | (1L << (NULL - 126)) | (1L << (READ - 126)) | (1L << (SELF - 126)) | (1L << (TEST - 126)) | (1L << (WRITE - 126)) | (1L << (SYMBOL_IDENTIFIER - 126)) | (1L << (TYPE_IDENTIFIER - 126)) | (1L << (VARIABLE_IDENTIFIER - 126)))) != 0)) ) {
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
		enterRule(_localctx, 458, RULE_jsx_expression);
		try {
			setState(2606);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2604);
				jsx_element();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2605);
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
		enterRule(_localctx, 460, RULE_jsx_element);
		try {
			setState(2615);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
			case 1:
				_localctx = new JsxSelfClosingContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2608);
				((JsxSelfClosingContext)_localctx).jsx = jsx_self_closing();
				}
				break;
			case 2:
				_localctx = new JsxElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2609);
				((JsxElementContext)_localctx).opening = jsx_opening();
				setState(2611);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
				case 1:
					{
					setState(2610);
					((JsxElementContext)_localctx).children_ = jsx_children();
					}
					break;
				}
				setState(2613);
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
		enterRule(_localctx, 462, RULE_jsx_fragment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2617);
			jsx_fragment_start();
			setState(2618);
			ws_plus();
			setState(2620);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
			case 1:
				{
				setState(2619);
				((Jsx_fragmentContext)_localctx).children_ = jsx_children();
				}
				break;
			}
			setState(2622);
			ws_plus();
			setState(2623);
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
		enterRule(_localctx, 464, RULE_jsx_fragment_start);
		try {
			setState(2628);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2625);
				match(LT);
				setState(2626);
				match(GT);
				}
				break;
			case LTGT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2627);
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
		enterRule(_localctx, 466, RULE_jsx_fragment_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2630);
			match(LT);
			setState(2631);
			match(SLASH);
			setState(2632);
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
		enterRule(_localctx, 468, RULE_jsx_self_closing);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2634);
			match(LT);
			setState(2635);
			((Jsx_self_closingContext)_localctx).name = jsx_element_name();
			setState(2636);
			ws_plus();
			setState(2640);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA) | (1L << CSHARP) | (1L << PYTHON2) | (1L << PYTHON3) | (1L << JAVASCRIPT) | (1L << SWIFT) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CODE - 64)) | (1L << (DOCUMENT - 64)) | (1L << (BLOB - 64)) | (1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (ABSTRACT - 64)) | (1L << (ALL - 64)) | (1L << (ALWAYS - 64)) | (1L << (AND - 64)) | (1L << (ANY - 64)) | (1L << (AS - 64)) | (1L << (ASC - 64)) | (1L << (ATTR - 64)) | (1L << (ATTRIBUTE - 64)) | (1L << (ATTRIBUTES - 64)) | (1L << (BINDINGS - 64)) | (1L << (BREAK - 64)) | (1L << (BY - 64)) | (1L << (CASE - 64)) | (1L << (CATCH - 64)) | (1L << (CATEGORY - 64)) | (1L << (CLASS - 64)) | (1L << (CLOSE - 64)) | (1L << (CONTAINS - 64)) | (1L << (DEF - 64)) | (1L << (DEFAULT - 64)) | (1L << (DEFINE - 64)) | (1L << (DELETE - 64)) | (1L << (DESC - 64)) | (1L << (DO - 64)) | (1L << (DOING - 64)) | (1L << (EACH - 64)) | (1L << (ELSE - 64)) | (1L << (ENUM - 64)) | (1L << (ENUMERATED - 64)) | (1L << (EXCEPT - 64)) | (1L << (EXECUTE - 64)) | (1L << (EXPECTING - 64)) | (1L << (EXTENDS - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (FINALLY - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (FROM - 64)) | (1L << (GETTER - 64)) | (1L << (HAS - 64)) | (1L << (IF - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (IS - 64)) | (1L << (MATCHING - 64)) | (1L << (METHOD - 64)) | (1L << (METHODS - 64)) | (1L << (MODULO - 64)) | (1L << (MUTABLE - 64)) | (1L << (NATIVE - 64)) | (1L << (NONE - 64)) | (1L << (NOT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (NOTHING - 128)) | (1L << (NULL - 128)) | (1L << (ON - 128)) | (1L << (ONE - 128)) | (1L << (OPEN - 128)) | (1L << (OPERATOR - 128)) | (1L << (OR - 128)) | (1L << (ORDER - 128)) | (1L << (OTHERWISE - 128)) | (1L << (PASS - 128)) | (1L << (RAISE - 128)) | (1L << (READ - 128)) | (1L << (RECEIVING - 128)) | (1L << (RESOURCE - 128)) | (1L << (RETURN - 128)) | (1L << (RETURNING - 128)) | (1L << (ROWS - 128)) | (1L << (SELF - 128)) | (1L << (SETTER - 128)) | (1L << (SINGLETON - 128)) | (1L << (SORTED - 128)) | (1L << (STORABLE - 128)) | (1L << (STORE - 128)) | (1L << (SWITCH - 128)) | (1L << (TEST - 128)) | (1L << (THIS - 128)) | (1L << (THROW - 128)) | (1L << (TO - 128)) | (1L << (TRY - 128)) | (1L << (VERIFYING - 128)) | (1L << (WIDGET - 128)) | (1L << (WITH - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WHILE - 128)) | (1L << (WRITE - 128)) | (1L << (SYMBOL_IDENTIFIER - 128)) | (1L << (TYPE_IDENTIFIER - 128)) | (1L << (VARIABLE_IDENTIFIER - 128)))) != 0)) {
				{
				{
				setState(2637);
				((Jsx_self_closingContext)_localctx).attributes = jsx_attribute();
				}
				}
				setState(2642);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2643);
			match(SLASH);
			setState(2644);
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
		enterRule(_localctx, 470, RULE_jsx_opening);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2646);
			match(LT);
			setState(2647);
			((Jsx_openingContext)_localctx).name = jsx_element_name();
			setState(2648);
			ws_plus();
			setState(2652);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA) | (1L << CSHARP) | (1L << PYTHON2) | (1L << PYTHON3) | (1L << JAVASCRIPT) | (1L << SWIFT) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CODE - 64)) | (1L << (DOCUMENT - 64)) | (1L << (BLOB - 64)) | (1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (ABSTRACT - 64)) | (1L << (ALL - 64)) | (1L << (ALWAYS - 64)) | (1L << (AND - 64)) | (1L << (ANY - 64)) | (1L << (AS - 64)) | (1L << (ASC - 64)) | (1L << (ATTR - 64)) | (1L << (ATTRIBUTE - 64)) | (1L << (ATTRIBUTES - 64)) | (1L << (BINDINGS - 64)) | (1L << (BREAK - 64)) | (1L << (BY - 64)) | (1L << (CASE - 64)) | (1L << (CATCH - 64)) | (1L << (CATEGORY - 64)) | (1L << (CLASS - 64)) | (1L << (CLOSE - 64)) | (1L << (CONTAINS - 64)) | (1L << (DEF - 64)) | (1L << (DEFAULT - 64)) | (1L << (DEFINE - 64)) | (1L << (DELETE - 64)) | (1L << (DESC - 64)) | (1L << (DO - 64)) | (1L << (DOING - 64)) | (1L << (EACH - 64)) | (1L << (ELSE - 64)) | (1L << (ENUM - 64)) | (1L << (ENUMERATED - 64)) | (1L << (EXCEPT - 64)) | (1L << (EXECUTE - 64)) | (1L << (EXPECTING - 64)) | (1L << (EXTENDS - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (FINALLY - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (FROM - 64)) | (1L << (GETTER - 64)) | (1L << (HAS - 64)) | (1L << (IF - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (IS - 64)) | (1L << (MATCHING - 64)) | (1L << (METHOD - 64)) | (1L << (METHODS - 64)) | (1L << (MODULO - 64)) | (1L << (MUTABLE - 64)) | (1L << (NATIVE - 64)) | (1L << (NONE - 64)) | (1L << (NOT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (NOTHING - 128)) | (1L << (NULL - 128)) | (1L << (ON - 128)) | (1L << (ONE - 128)) | (1L << (OPEN - 128)) | (1L << (OPERATOR - 128)) | (1L << (OR - 128)) | (1L << (ORDER - 128)) | (1L << (OTHERWISE - 128)) | (1L << (PASS - 128)) | (1L << (RAISE - 128)) | (1L << (READ - 128)) | (1L << (RECEIVING - 128)) | (1L << (RESOURCE - 128)) | (1L << (RETURN - 128)) | (1L << (RETURNING - 128)) | (1L << (ROWS - 128)) | (1L << (SELF - 128)) | (1L << (SETTER - 128)) | (1L << (SINGLETON - 128)) | (1L << (SORTED - 128)) | (1L << (STORABLE - 128)) | (1L << (STORE - 128)) | (1L << (SWITCH - 128)) | (1L << (TEST - 128)) | (1L << (THIS - 128)) | (1L << (THROW - 128)) | (1L << (TO - 128)) | (1L << (TRY - 128)) | (1L << (VERIFYING - 128)) | (1L << (WIDGET - 128)) | (1L << (WITH - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WHILE - 128)) | (1L << (WRITE - 128)) | (1L << (SYMBOL_IDENTIFIER - 128)) | (1L << (TYPE_IDENTIFIER - 128)) | (1L << (VARIABLE_IDENTIFIER - 128)))) != 0)) {
				{
				{
				setState(2649);
				((Jsx_openingContext)_localctx).attributes = jsx_attribute();
				}
				}
				setState(2654);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2655);
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
		enterRule(_localctx, 472, RULE_jsx_closing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2657);
			match(LT);
			setState(2658);
			match(SLASH);
			setState(2659);
			((Jsx_closingContext)_localctx).name = jsx_element_name();
			setState(2660);
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
		enterRule(_localctx, 474, RULE_jsx_element_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2662);
			jsx_identifier();
			setState(2667);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(2663);
				match(DOT);
				setState(2664);
				jsx_identifier();
				}
				}
				setState(2669);
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
		enterRule(_localctx, 476, RULE_jsx_identifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2670);
			identifier_or_keyword();
			setState(2674);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,230,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2671);
					nospace_hyphen_identifier_or_keyword();
					}
					} 
				}
				setState(2676);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,230,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 478, RULE_jsx_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2677);
			((Jsx_attributeContext)_localctx).name = jsx_identifier();
			setState(2680);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(2678);
				match(EQ);
				setState(2679);
				((Jsx_attributeContext)_localctx).value = jsx_attribute_value();
				}
			}

			setState(2682);
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
		enterRule(_localctx, 480, RULE_jsx_attribute_value);
		try {
			setState(2689);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT_LITERAL:
				_localctx = new JsxLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2684);
				match(TEXT_LITERAL);
				}
				break;
			case LCURL:
				_localctx = new JsxValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2685);
				match(LCURL);
				setState(2686);
				((JsxValueContext)_localctx).exp = expression(0);
				setState(2687);
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
		enterRule(_localctx, 482, RULE_jsx_children);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2692); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2691);
					jsx_child();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2694); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,233,_ctx);
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
		enterRule(_localctx, 484, RULE_jsx_child);
		int _la;
		try {
			setState(2703);
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
			case CLOSE:
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
			case OPEN:
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
				_localctx = new JsxTextContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2696);
				((JsxTextContext)_localctx).text = jsx_text();
				}
				break;
			case LT:
				_localctx = new JsxChildContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2697);
				((JsxChildContext)_localctx).jsx = jsx_element();
				}
				break;
			case LCURL:
				_localctx = new JsxCodeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2698);
				match(LCURL);
				setState(2700);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << LTCOLONGT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CODE - 64)) | (1L << (DOCUMENT - 64)) | (1L << (BLOB - 64)) | (1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (ANY - 64)) | (1L << (EXECUTE - 64)) | (1L << (FETCH - 64)) | (1L << (MUTABLE - 64)) | (1L << (NONE - 64)) | (1L << (NOT - 64)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (READ - 139)) | (1L << (SELF - 139)) | (1L << (SORTED - 139)) | (1L << (THIS - 139)) | (1L << (BOOLEAN_LITERAL - 139)) | (1L << (CHAR_LITERAL - 139)) | (1L << (MIN_INTEGER - 139)) | (1L << (MAX_INTEGER - 139)) | (1L << (SYMBOL_IDENTIFIER - 139)) | (1L << (TYPE_IDENTIFIER - 139)) | (1L << (VARIABLE_IDENTIFIER - 139)) | (1L << (TEXT_LITERAL - 139)) | (1L << (UUID_LITERAL - 139)) | (1L << (INTEGER_LITERAL - 139)) | (1L << (HEXA_LITERAL - 139)) | (1L << (DECIMAL_LITERAL - 139)) | (1L << (DATETIME_LITERAL - 139)) | (1L << (TIME_LITERAL - 139)) | (1L << (DATE_LITERAL - 139)) | (1L << (PERIOD_LITERAL - 139)) | (1L << (VERSION_LITERAL - 139)))) != 0)) {
					{
					setState(2699);
					((JsxCodeContext)_localctx).exp = expression(0);
					}
				}

				setState(2702);
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
		public List<TerminalNode> LCURL() { return getTokens(MParser.LCURL); }
		public TerminalNode LCURL(int i) {
			return getToken(MParser.LCURL, i);
		}
		public List<TerminalNode> RCURL() { return getTokens(MParser.RCURL); }
		public TerminalNode RCURL(int i) {
			return getToken(MParser.RCURL, i);
		}
		public List<TerminalNode> LT() { return getTokens(MParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(MParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(MParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(MParser.GT, i);
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
		enterRule(_localctx, 486, RULE_jsx_text);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2706); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2705);
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
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2708); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,236,_ctx);
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
		enterRule(_localctx, 488, RULE_css_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2710);
			match(LCURL);
			setState(2712); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2711);
				((Css_expressionContext)_localctx).field = css_field();
				}
				}
				setState(2714); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA) | (1L << CSHARP) | (1L << PYTHON2) | (1L << PYTHON3) | (1L << JAVASCRIPT) | (1L << SWIFT) | (1L << MINUS) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CODE - 64)) | (1L << (DOCUMENT - 64)) | (1L << (BLOB - 64)) | (1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (ABSTRACT - 64)) | (1L << (ALL - 64)) | (1L << (ALWAYS - 64)) | (1L << (AND - 64)) | (1L << (ANY - 64)) | (1L << (AS - 64)) | (1L << (ASC - 64)) | (1L << (ATTR - 64)) | (1L << (ATTRIBUTE - 64)) | (1L << (ATTRIBUTES - 64)) | (1L << (BINDINGS - 64)) | (1L << (BREAK - 64)) | (1L << (BY - 64)) | (1L << (CASE - 64)) | (1L << (CATCH - 64)) | (1L << (CATEGORY - 64)) | (1L << (CLASS - 64)) | (1L << (CLOSE - 64)) | (1L << (CONTAINS - 64)) | (1L << (DEF - 64)) | (1L << (DEFAULT - 64)) | (1L << (DEFINE - 64)) | (1L << (DELETE - 64)) | (1L << (DESC - 64)) | (1L << (DO - 64)) | (1L << (DOING - 64)) | (1L << (EACH - 64)) | (1L << (ELSE - 64)) | (1L << (ENUM - 64)) | (1L << (ENUMERATED - 64)) | (1L << (EXCEPT - 64)) | (1L << (EXECUTE - 64)) | (1L << (EXPECTING - 64)) | (1L << (EXTENDS - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (FINALLY - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (FROM - 64)) | (1L << (GETTER - 64)) | (1L << (HAS - 64)) | (1L << (IF - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (IS - 64)) | (1L << (MATCHING - 64)) | (1L << (METHOD - 64)) | (1L << (METHODS - 64)) | (1L << (MODULO - 64)) | (1L << (MUTABLE - 64)) | (1L << (NATIVE - 64)) | (1L << (NONE - 64)) | (1L << (NOT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (NOTHING - 128)) | (1L << (NULL - 128)) | (1L << (ON - 128)) | (1L << (ONE - 128)) | (1L << (OPEN - 128)) | (1L << (OPERATOR - 128)) | (1L << (OR - 128)) | (1L << (ORDER - 128)) | (1L << (OTHERWISE - 128)) | (1L << (PASS - 128)) | (1L << (RAISE - 128)) | (1L << (READ - 128)) | (1L << (RECEIVING - 128)) | (1L << (RESOURCE - 128)) | (1L << (RETURN - 128)) | (1L << (RETURNING - 128)) | (1L << (ROWS - 128)) | (1L << (SELF - 128)) | (1L << (SETTER - 128)) | (1L << (SINGLETON - 128)) | (1L << (SORTED - 128)) | (1L << (STORABLE - 128)) | (1L << (STORE - 128)) | (1L << (SWITCH - 128)) | (1L << (TEST - 128)) | (1L << (THIS - 128)) | (1L << (THROW - 128)) | (1L << (TO - 128)) | (1L << (TRY - 128)) | (1L << (VERIFYING - 128)) | (1L << (WIDGET - 128)) | (1L << (WITH - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WHILE - 128)) | (1L << (WRITE - 128)) | (1L << (SYMBOL_IDENTIFIER - 128)) | (1L << (TYPE_IDENTIFIER - 128)) | (1L << (VARIABLE_IDENTIFIER - 128)))) != 0) );
			setState(2716);
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
		enterRule(_localctx, 490, RULE_css_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2718);
			((Css_fieldContext)_localctx).name = css_identifier(0);
			setState(2719);
			match(COLON);
			setState(2720);
			((Css_fieldContext)_localctx).value = css_value();
			setState(2721);
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
		int _startState = 492;
		enterRecursionRule(_localctx, 492, RULE_css_identifier, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2727);
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
			case CLOSE:
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
			case OPEN:
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
				setState(2724);
				identifier_or_keyword();
				}
				break;
			case MINUS:
				{
				setState(2725);
				match(MINUS);
				setState(2726);
				nospace_identifier_or_keyword();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(2737);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,240,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Css_identifierContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_css_identifier);
					setState(2729);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2731); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(2730);
							nospace_hyphen_identifier_or_keyword();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(2733); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,239,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					} 
				}
				setState(2739);
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
		enterRule(_localctx, 494, RULE_css_value);
		try {
			setState(2745);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURL:
				_localctx = new CssValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2740);
				match(LCURL);
				setState(2741);
				((CssValueContext)_localctx).exp = expression(0);
				setState(2742);
				match(RCURL);
				}
				break;
			case INDENT:
			case DEDENT:
			case LF_TAB:
			case LF_MORE:
			case LF:
			case TAB:
			case COMMENT:
			case JAVA:
			case CSHARP:
			case PYTHON2:
			case PYTHON3:
			case JAVASCRIPT:
			case SWIFT:
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
			case CLOSE:
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
			case OPEN:
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
				_localctx = new CssTextContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2744);
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
		public List<TerminalNode> LCURL() { return getTokens(MParser.LCURL); }
		public TerminalNode LCURL(int i) {
			return getToken(MParser.LCURL, i);
		}
		public List<TerminalNode> RCURL() { return getTokens(MParser.RCURL); }
		public TerminalNode RCURL(int i) {
			return getToken(MParser.RCURL, i);
		}
		public List<TerminalNode> COLON() { return getTokens(MParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(MParser.COLON, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(MParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(MParser.SEMI, i);
		}
		public List<TerminalNode> WS() { return getTokens(MParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(MParser.WS, i);
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
		enterRule(_localctx, 496, RULE_css_text);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2748); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2747);
				_la = _input.LA(1);
				if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << COLON) | (1L << SEMI) | (1L << LCURL) | (1L << RCURL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(2750); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INDENT) | (1L << DEDENT) | (1L << LF_TAB) | (1L << LF_MORE) | (1L << LF) | (1L << TAB) | (1L << COMMENT) | (1L << JAVA) | (1L << CSHARP) | (1L << PYTHON2) | (1L << PYTHON3) | (1L << JAVASCRIPT) | (1L << SWIFT) | (1L << COMMA) | (1L << RANGE) | (1L << DOT) | (1L << LPAR) | (1L << RPAR) | (1L << LBRAK) | (1L << RBRAK) | (1L << QMARK) | (1L << XMARK) | (1L << AMP) | (1L << AMP2) | (1L << PIPE) | (1L << PIPE2) | (1L << PLUS) | (1L << MINUS) | (1L << STAR) | (1L << SLASH) | (1L << BSLASH) | (1L << PERCENT) | (1L << GT) | (1L << GTE) | (1L << LT) | (1L << LTE) | (1L << LTGT) | (1L << LTCOLONGT) | (1L << EQ) | (1L << XEQ) | (1L << EQ2) | (1L << TEQ) | (1L << TILDE) | (1L << LARROW) | (1L << RARROW) | (1L << EGT) | (1L << BOOLEAN) | (1L << CSS) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << METHOD_COLON))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CODE - 64)) | (1L << (DOCUMENT - 64)) | (1L << (BLOB - 64)) | (1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (TYPE - 64)) | (1L << (ABSTRACT - 64)) | (1L << (ALL - 64)) | (1L << (ALWAYS - 64)) | (1L << (AND - 64)) | (1L << (ANY - 64)) | (1L << (AS - 64)) | (1L << (ASC - 64)) | (1L << (ATTR - 64)) | (1L << (ATTRIBUTE - 64)) | (1L << (ATTRIBUTES - 64)) | (1L << (BINDINGS - 64)) | (1L << (BREAK - 64)) | (1L << (BY - 64)) | (1L << (CASE - 64)) | (1L << (CATCH - 64)) | (1L << (CATEGORY - 64)) | (1L << (CLASS - 64)) | (1L << (CLOSE - 64)) | (1L << (CONTAINS - 64)) | (1L << (DEF - 64)) | (1L << (DEFAULT - 64)) | (1L << (DEFINE - 64)) | (1L << (DELETE - 64)) | (1L << (DESC - 64)) | (1L << (DO - 64)) | (1L << (DOING - 64)) | (1L << (EACH - 64)) | (1L << (ELSE - 64)) | (1L << (ENUM - 64)) | (1L << (ENUMERATED - 64)) | (1L << (EXCEPT - 64)) | (1L << (EXECUTE - 64)) | (1L << (EXPECTING - 64)) | (1L << (EXTENDS - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (FINALLY - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (FROM - 64)) | (1L << (GETTER - 64)) | (1L << (HAS - 64)) | (1L << (IF - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INVOKE_COLON - 64)) | (1L << (IS - 64)) | (1L << (MATCHING - 64)) | (1L << (METHOD - 64)) | (1L << (METHODS - 64)) | (1L << (MODULO - 64)) | (1L << (MUTABLE - 64)) | (1L << (NATIVE - 64)) | (1L << (NONE - 64)) | (1L << (NOT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (NOTHING - 128)) | (1L << (NULL - 128)) | (1L << (ON - 128)) | (1L << (ONE - 128)) | (1L << (OPEN - 128)) | (1L << (OPERATOR - 128)) | (1L << (OR - 128)) | (1L << (ORDER - 128)) | (1L << (OTHERWISE - 128)) | (1L << (PASS - 128)) | (1L << (RAISE - 128)) | (1L << (READ - 128)) | (1L << (RECEIVING - 128)) | (1L << (RESOURCE - 128)) | (1L << (RETURN - 128)) | (1L << (RETURNING - 128)) | (1L << (ROWS - 128)) | (1L << (SELF - 128)) | (1L << (SETTER - 128)) | (1L << (SINGLETON - 128)) | (1L << (SORTED - 128)) | (1L << (STORABLE - 128)) | (1L << (STORE - 128)) | (1L << (SWITCH - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (THIS - 128)) | (1L << (THROW - 128)) | (1L << (TO - 128)) | (1L << (TRY - 128)) | (1L << (VERIFYING - 128)) | (1L << (WIDGET - 128)) | (1L << (WITH - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WHILE - 128)) | (1L << (WRITE - 128)) | (1L << (BOOLEAN_LITERAL - 128)) | (1L << (CHAR_LITERAL - 128)) | (1L << (MIN_INTEGER - 128)) | (1L << (MAX_INTEGER - 128)) | (1L << (SYMBOL_IDENTIFIER - 128)) | (1L << (TYPE_IDENTIFIER - 128)) | (1L << (VARIABLE_IDENTIFIER - 128)) | (1L << (NATIVE_IDENTIFIER - 128)) | (1L << (DOLLAR_IDENTIFIER - 128)) | (1L << (ARONDBASE_IDENTIFIER - 128)) | (1L << (TEXT_LITERAL - 128)) | (1L << (UUID_LITERAL - 128)) | (1L << (INTEGER_LITERAL - 128)) | (1L << (HEXA_LITERAL - 128)) | (1L << (DECIMAL_LITERAL - 128)) | (1L << (DATETIME_LITERAL - 128)) | (1L << (TIME_LITERAL - 128)) | (1L << (DATE_LITERAL - 128)) | (1L << (PERIOD_LITERAL - 128)) | (1L << (VERSION_LITERAL - 128)))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
		case 116:
			return any_type_sempred((Any_typeContext)_localctx, predIndex);
		case 154:
			return assignable_instance_sempred((Assignable_instanceContext)_localctx, predIndex);
		case 155:
			return is_expression_sempred((Is_expressionContext)_localctx, predIndex);
		case 166:
			return new_token_sempred((New_tokenContext)_localctx, predIndex);
		case 167:
			return key_token_sempred((Key_tokenContext)_localctx, predIndex);
		case 168:
			return module_token_sempred((Module_tokenContext)_localctx, predIndex);
		case 169:
			return value_token_sempred((Value_tokenContext)_localctx, predIndex);
		case 170:
			return symbols_token_sempred((Symbols_tokenContext)_localctx, predIndex);
		case 177:
			return javascript_expression_sempred((Javascript_expressionContext)_localctx, predIndex);
		case 183:
			return javascript_arguments_sempred((Javascript_argumentsContext)_localctx, predIndex);
		case 190:
			return python_expression_sempred((Python_expressionContext)_localctx, predIndex);
		case 196:
			return python_ordinal_argument_list_sempred((Python_ordinal_argument_listContext)_localctx, predIndex);
		case 197:
			return python_named_argument_list_sempred((Python_named_argument_listContext)_localctx, predIndex);
		case 199:
			return python_identifier_expression_sempred((Python_identifier_expressionContext)_localctx, predIndex);
		case 203:
			return java_expression_sempred((Java_expressionContext)_localctx, predIndex);
		case 209:
			return java_arguments_sempred((Java_argumentsContext)_localctx, predIndex);
		case 212:
			return java_identifier_expression_sempred((Java_identifier_expressionContext)_localctx, predIndex);
		case 213:
			return java_class_identifier_expression_sempred((Java_class_identifier_expressionContext)_localctx, predIndex);
		case 217:
			return csharp_expression_sempred((Csharp_expressionContext)_localctx, predIndex);
		case 223:
			return csharp_arguments_sempred((Csharp_argumentsContext)_localctx, predIndex);
		case 226:
			return csharp_identifier_expression_sempred((Csharp_identifier_expressionContext)_localctx, predIndex);
		case 246:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00ba\u0ac3\4\2\t"+
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
		"\t\u00fa\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u01fb\n\2\3\2\5\2\u01fe\n\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\5\5\u0217\n\5\3\5\3\5\3\6\5\6\u021c\n\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u022a\n\6\3\6\3\6\3\6\3\6\5\6\u0230"+
		"\n\6\5\6\u0232\n\6\5\6\u0234\n\6\3\6\3\6\5\6\u0238\n\6\3\7\3\7\3\7\5\7"+
		"\u023d\n\7\3\7\3\7\3\b\3\b\3\b\3\b\5\b\u0245\n\b\3\b\3\b\3\b\3\b\3\b\5"+
		"\b\u024c\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\5\n\u025d\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0268\n\n\3\n"+
		"\3\n\3\n\3\n\3\n\5\n\u026f\n\n\3\n\3\n\5\n\u0273\n\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\5\13\u027e\n\13\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u028c\n\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\5\17\u02a0\n\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\5\21\u02b7\n\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\5\22\u02c2\n\22\3\22\3\22\3\22\3\22\3\22\5\22"+
		"\u02c9\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u02d2\n\22\3\22\3"+
		"\22\3\23\5\23\u02d7\n\23\3\23\3\23\3\23\3\23\3\23\5\23\u02de\n\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u02e7\n\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u02fa"+
		"\n\25\f\25\16\25\u02fd\13\25\3\26\3\26\3\26\3\26\3\26\5\26\u0304\n\26"+
		"\3\26\3\26\3\26\5\26\u0309\n\26\3\27\3\27\3\27\3\27\5\27\u030f\n\27\3"+
		"\27\3\27\3\27\5\27\u0314\n\27\3\27\3\27\3\27\3\27\5\27\u031a\n\27\3\27"+
		"\3\27\3\30\3\30\5\30\u0320\n\30\3\30\3\30\3\30\5\30\u0325\n\30\3\30\3"+
		"\30\3\30\5\30\u032a\n\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31"+
		"\u0342\n\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u034d\n"+
		"\33\3\33\3\33\5\33\u0351\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0367"+
		"\n\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\5\36\u0377\n\36\3\36\3\36\3\36\3\36\3\36\5\36\u037e\n\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\5\36\u0386\n\36\3\37\3\37\3\37\5\37\u038b\n\37"+
		"\3\37\3\37\3 \3 \3 \5 \u0392\n \3 \3 \3 \3 \5 \u0398\n \3 \3 \3 \3 \3"+
		" \5 \u039f\n \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u03bc\n#\3#\3#\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u03cf\n$\3%\3%\3%\3%\5%\u03d5\n%\3%\3%\3"+
		"%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u03f7\n(\3(\3(\3(\3(\3(\3(\3(\5(\u0400\n"+
		"(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\7)\u0415\n"+
		")\f)\16)\u0418\13)\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\5+\u0425\n+\3+\3+"+
		"\3+\3+\3+\3+\3+\5+\u042e\n+\3+\3+\3+\3+\3+\3+\3+\5+\u0437\n+\3+\3+\3,"+
		"\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u044e\n,\3-"+
		"\3-\3.\3.\5.\u0454\n.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/"+
		"\3/\3/\3/\3/\3/\5/\u046b\n/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/"+
		"\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/"+
		"\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/"+
		"\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/"+
		"\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/"+
		"\3/\3/\3/\3/\7/\u04db\n/\f/\16/\u04de\13/\3\60\3\60\3\61\3\61\3\61\3\61"+
		"\3\61\5\61\u04e7\n\61\3\62\3\62\3\62\3\62\3\62\7\62\u04ee\n\62\f\62\16"+
		"\62\u04f1\13\62\3\63\3\63\3\63\3\63\3\63\3\63\7\63\u04f9\n\63\f\63\16"+
		"\63\u04fc\13\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u0506\n\64"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u0514"+
		"\n\65\3\66\3\66\3\66\5\66\u0519\n\66\3\66\3\66\3\67\3\67\3\67\5\67\u0520"+
		"\n\67\3\67\3\67\38\38\38\38\38\58\u0529\n8\38\38\38\38\38\58\u0530\n8"+
		"\38\38\58\u0534\n8\39\39\39\39\39\3:\3:\3:\3:\3:\5:\u0540\n:\3:\3:\3:"+
		"\7:\u0545\n:\f:\16:\u0548\13:\3;\3;\3;\3;\5;\u054e\n;\3<\3<\3<\3<\3<\3"+
		"=\3=\3=\5=\u0558\n=\3=\3=\3=\3>\3>\3>\5>\u0560\n>\3>\3>\3>\3>\3>\3>\3"+
		">\3>\3>\5>\u056b\n>\3>\3>\5>\u056f\n>\3>\3>\3>\5>\u0574\n>\3>\3>\3>\5"+
		">\u0579\n>\5>\u057b\n>\3?\3?\3?\5?\u0580\n?\3?\3?\3?\3?\3?\3?\3?\3?\3"+
		"?\3?\3?\3?\3?\3?\3?\3?\3?\5?\u0593\n?\3?\3?\5?\u0597\n?\3?\3?\3?\5?\u059c"+
		"\n?\3?\3?\3?\5?\u05a1\n?\3?\3?\3?\3?\3?\3?\3?\3?\5?\u05ab\n?\3@\3@\5@"+
		"\u05af\n@\3@\3@\3@\3@\3@\3@\3@\5@\u05b8\n@\3@\3@\3A\3A\3A\3A\3B\3B\3B"+
		"\3B\3B\3B\3B\3B\5B\u05c8\nB\3C\3C\3C\3C\3D\7D\u05cf\nD\fD\16D\u05d2\13"+
		"D\3E\6E\u05d5\nE\rE\16E\u05d6\3F\7F\u05da\nF\fF\16F\u05dd\13F\3G\6G\u05e0"+
		"\nG\rG\16G\u05e1\3G\3G\3H\7H\u05e7\nH\fH\16H\u05ea\13H\3H\3H\3I\3I\3J"+
		"\3J\3K\3K\3K\5K\u05f5\nK\3L\5L\u05f8\nL\3L\3L\3L\3M\3M\3M\3M\7M\u0601"+
		"\nM\fM\16M\u0604\13M\3N\3N\3N\7N\u0609\nN\fN\16N\u060c\13N\3N\3N\3N\7"+
		"N\u0611\nN\fN\16N\u0614\13N\3N\3N\3N\3N\3N\3N\5N\u061c\nN\3O\3O\3O\3O"+
		"\3O\3O\7O\u0624\nO\fO\16O\u0627\13O\5O\u0629\nO\3O\3O\5O\u062d\nO\3P\3"+
		"P\3Q\3Q\3Q\3Q\3R\3R\3S\3S\5S\u0639\nS\3T\3T\3U\3U\5U\u063f\nU\3V\3V\3"+
		"V\3V\7V\u0645\nV\fV\16V\u0648\13V\3W\3W\3W\3W\7W\u064e\nW\fW\16W\u0651"+
		"\13W\3X\3X\3X\7X\u0656\nX\fX\16X\u0659\13X\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y"+
		"\3Y\5Y\u0665\nY\3Z\5Z\u0668\nZ\3Z\3Z\5Z\u066c\nZ\3Z\3Z\3[\5[\u0671\n["+
		"\3[\3[\5[\u0675\n[\3[\3[\3\\\3\\\3\\\7\\\u067c\n\\\f\\\16\\\u067f\13\\"+
		"\3]\3]\3]\3]\3]\3]\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\5^\u0693\n^\3^"+
		"\3^\3^\3^\3^\3^\3^\7^\u069c\n^\f^\16^\u069f\13^\3_\3_\5_\u06a3\n_\3`\3"+
		"`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\5`\u06b6\n`\3a\3a\3b\5"+
		"b\u06bb\nb\3b\3b\3c\3c\3d\3d\3d\5d\u06c4\nd\3e\3e\5e\u06c8\ne\3f\3f\3"+
		"f\7f\u06cd\nf\ff\16f\u06d0\13f\3g\3g\5g\u06d4\ng\3h\3h\5h\u06d8\nh\3i"+
		"\3i\3i\3i\3j\3j\3j\3k\3k\3k\5k\u06e4\nk\3l\3l\3m\3m\3n\3n\3o\3o\3p\3p"+
		"\3p\7p\u06f1\np\fp\16p\u06f4\13p\3q\3q\5q\u06f8\nq\3q\5q\u06fb\nq\3r\3"+
		"r\5r\u06ff\nr\3s\3s\3s\5s\u0704\ns\3t\3t\3t\3u\3u\5u\u070b\nu\3v\3v\3"+
		"v\3v\3v\3v\3v\3v\3v\7v\u0716\nv\fv\16v\u0719\13v\3w\3w\3w\3w\7w\u071f"+
		"\nw\fw\16w\u0722\13w\3x\3x\3x\7x\u0727\nx\fx\16x\u072a\13x\3x\3x\3x\7"+
		"x\u072f\nx\fx\16x\u0732\13x\3x\3x\3x\3x\3x\5x\u0739\nx\3y\3y\3y\3y\7y"+
		"\u073f\ny\fy\16y\u0742\13y\3z\3z\3z\5z\u0747\nz\3{\3{\3{\3{\3{\3{\3{\3"+
		"{\3{\3{\5{\u0753\n{\3|\3|\5|\u0757\n|\3}\3}\3}\3}\3}\3}\7}\u075f\n}\f"+
		"}\16}\u0762\13}\3~\3~\3~\7~\u0767\n~\f~\16~\u076a\13~\3~\5~\u076d\n~\3"+
		"\177\3\177\3\177\3\177\5\177\u0773\n\177\3\177\3\177\3\177\7\177\u0778"+
		"\n\177\f\177\16\177\u077b\13\177\3\177\3\177\5\177\u077f\n\177\3\u0080"+
		"\3\u0080\3\u0080\7\u0080\u0784\n\u0080\f\u0080\16\u0080\u0787\13\u0080"+
		"\3\u0081\3\u0081\3\u0081\7\u0081\u078c\n\u0081\f\u0081\16\u0081\u078f"+
		"\13\u0081\3\u0082\3\u0082\3\u0082\3\u0082\5\u0082\u0795\n\u0082\3\u0083"+
		"\3\u0083\3\u0084\3\u0084\3\u0084\3\u0084\7\u0084\u079d\n\u0084\f\u0084"+
		"\16\u0084\u07a0\13\u0084\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\3\u0085\3\u0085\3\u0085\5\u0085\u07ac\n\u0085\3\u0086\3\u0086"+
		"\5\u0086\u07b0\n\u0086\3\u0086\5\u0086\u07b3\n\u0086\3\u0087\3\u0087\5"+
		"\u0087\u07b7\n\u0087\3\u0087\5\u0087\u07ba\n\u0087\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\7\u0088\u07c0\n\u0088\f\u0088\16\u0088\u07c3\13\u0088\3\u0089"+
		"\3\u0089\3\u0089\3\u0089\7\u0089\u07c9\n\u0089\f\u0089\16\u0089\u07cc"+
		"\13\u0089\3\u008a\3\u008a\3\u008a\3\u008a\7\u008a\u07d2\n\u008a\f\u008a"+
		"\16\u008a\u07d5\13\u008a\3\u008b\3\u008b\3\u008b\3\u008b\7\u008b\u07db"+
		"\n\u008b\f\u008b\16\u008b\u07de\13\u008b\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\5\u008c\u07ee\n\u008c\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\5\u008d\u0800\n\u008d\3\u008e\3\u008e\3\u008e\7\u008e"+
		"\u0805\n\u008e\f\u008e\16\u008e\u0808\13\u008e\3\u008f\3\u008f\3\u0090"+
		"\3\u0090\3\u0090\3\u0090\3\u0091\3\u0091\5\u0091\u0812\n\u0091\3\u0092"+
		"\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\5\u0092\u081a\n\u0092\3\u0093"+
		"\5\u0093\u081d\n\u0093\3\u0093\3\u0093\5\u0093\u0821\n\u0093\3\u0093\3"+
		"\u0093\3\u0094\5\u0094\u0826\n\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3"+
		"\u0094\3\u0094\3\u0094\3\u0094\5\u0094\u0830\n\u0094\3\u0095\3\u0095\5"+
		"\u0095\u0834\n\u0095\3\u0095\3\u0095\3\u0096\3\u0096\3\u0096\3\u0096\3"+
		"\u0096\7\u0096\u083d\n\u0096\f\u0096\16\u0096\u0840\13\u0096\5\u0096\u0842"+
		"\n\u0096\3\u0097\3\u0097\3\u0097\7\u0097\u0847\n\u0097\f\u0097\16\u0097"+
		"\u084a\13\u0097\3\u0098\3\u0098\3\u0098\3\u0098\3\u0099\3\u0099\5\u0099"+
		"\u0852\n\u0099\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a"+
		"\3\u009a\3\u009a\5\u009a\u085d\n\u009a\3\u009b\3\u009b\3\u009b\3\u009b"+
		"\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\7\u009c\u0868\n\u009c\f\u009c"+
		"\16\u009c\u086b\13\u009c\3\u009d\3\u009d\3\u009d\3\u009d\5\u009d\u0871"+
		"\n\u009d\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e"+
		"\5\u009e\u087b\n\u009e\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u00a0"+
		"\3\u00a0\3\u00a0\5\u00a0\u0885\n\u00a0\3\u00a0\5\u00a0\u0888\n\u00a0\3"+
		"\u00a1\3\u00a1\5\u00a1\u088c\n\u00a1\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3"+
		"\u00a2\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a4\3\u00a4\3\u00a4"+
		"\7\u00a4\u089b\n\u00a4\f\u00a4\16\u00a4\u089e\13\u00a4\3\u00a5\3\u00a5"+
		"\3\u00a5\7\u00a5\u08a3\n\u00a5\f\u00a5\16\u00a5\u08a6\13\u00a5\3\u00a5"+
		"\5\u00a5\u08a9\n\u00a5\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6"+
		"\5\u00a6\u08b1\n\u00a6\3\u00a7\3\u00a7\3\u00a8\3\u00a8\3\u00a8\3\u00a9"+
		"\3\u00a9\3\u00a9\3\u00aa\3\u00aa\3\u00aa\3\u00ab\3\u00ab\3\u00ab\3\u00ac"+
		"\3\u00ac\3\u00ac\3\u00ad\3\u00ad\3\u00ae\3\u00ae\3\u00af\3\u00af\3\u00b0"+
		"\3\u00b0\3\u00b1\3\u00b1\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2"+
		"\3\u00b2\5\u00b2\u08d5\n\u00b2\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3"+
		"\7\u00b3\u08dc\n\u00b3\f\u00b3\16\u00b3\u08df\13\u00b3\3\u00b4\3\u00b4"+
		"\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\5\u00b4\u08e8\n\u00b4\3\u00b5"+
		"\3\u00b5\3\u00b6\3\u00b6\3\u00b6\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7"+
		"\5\u00b7\u08f4\n\u00b7\3\u00b8\3\u00b8\3\u00b8\5\u00b8\u08f9\n\u00b8\3"+
		"\u00b8\3\u00b8\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\7\u00b9"+
		"\u0903\n\u00b9\f\u00b9\16\u00b9\u0906\13\u00b9\3\u00ba\3\u00ba\3\u00ba"+
		"\3\u00ba\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bc\3\u00bc\3\u00bd\3\u00bd"+
		"\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u0917\n\u00bd\3\u00be\3\u00be\3\u00bf"+
		"\3\u00bf\3\u00bf\5\u00bf\u091e\n\u00bf\3\u00c0\3\u00c0\3\u00c0\3\u00c0"+
		"\3\u00c0\7\u00c0\u0925\n\u00c0\f\u00c0\16\u00c0\u0928\13\u00c0\3\u00c1"+
		"\3\u00c1\3\u00c1\3\u00c1\3\u00c1\5\u00c1\u092f\n\u00c1\3\u00c2\3\u00c2"+
		"\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\5\u00c3\u0939\n\u00c3"+
		"\3\u00c4\3\u00c4\3\u00c4\5\u00c4\u093e\n\u00c4\3\u00c4\3\u00c4\3\u00c5"+
		"\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\5\u00c5\u0948\n\u00c5\3\u00c6"+
		"\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\7\u00c6\u0950\n\u00c6\f\u00c6"+
		"\16\u00c6\u0953\13\u00c6\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7"+
		"\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\7\u00c7\u0960\n\u00c7\f\u00c7"+
		"\16\u00c7\u0963\13\u00c7\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c9\3\u00c9"+
		"\3\u00c9\5\u00c9\u096c\n\u00c9\3\u00c9\3\u00c9\3\u00c9\7\u00c9\u0971\n"+
		"\u00c9\f\u00c9\16\u00c9\u0974\13\u00c9\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\5\u00ca\u097b\n\u00ca\3\u00cb\3\u00cb\3\u00cc\3\u00cc\3\u00cc"+
		"\3\u00cc\3\u00cc\3\u00cc\3\u00cc\5\u00cc\u0986\n\u00cc\3\u00cd\3\u00cd"+
		"\3\u00cd\3\u00cd\3\u00cd\7\u00cd\u098d\n\u00cd\f\u00cd\16\u00cd\u0990"+
		"\13\u00cd\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\5\u00ce\u0997\n\u00ce"+
		"\3\u00cf\3\u00cf\3\u00d0\3\u00d0\3\u00d0\3\u00d1\3\u00d1\3\u00d1\5\u00d1"+
		"\u09a1\n\u00d1\3\u00d2\3\u00d2\3\u00d2\5\u00d2\u09a6\n\u00d2\3\u00d2\3"+
		"\u00d2\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\7\u00d3\u09b0\n"+
		"\u00d3\f\u00d3\16\u00d3\u09b3\13\u00d3\3\u00d4\3\u00d4\3\u00d4\3\u00d4"+
		"\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6"+
		"\3\u00d6\7\u00d6\u09c3\n\u00d6\f\u00d6\16\u00d6\u09c6\13\u00d6\3\u00d7"+
		"\3\u00d7\3\u00d7\3\u00d7\3\u00d7\7\u00d7\u09cd\n\u00d7\f\u00d7\16\u00d7"+
		"\u09d0\13\u00d7\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\5\u00d8\u09d7"+
		"\n\u00d8\3\u00d9\3\u00d9\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da"+
		"\3\u00da\5\u00da\u09e2\n\u00da\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db"+
		"\7\u00db\u09e9\n\u00db\f\u00db\16\u00db\u09ec\13\u00db\3\u00dc\3\u00dc"+
		"\3\u00dc\3\u00dc\3\u00dc\5\u00dc\u09f3\n\u00dc\3\u00dd\3\u00dd\3\u00de"+
		"\3\u00de\3\u00de\3\u00df\3\u00df\3\u00df\5\u00df\u09fd\n\u00df\3\u00e0"+
		"\3\u00e0\3\u00e0\5\u00e0\u0a02\n\u00e0\3\u00e0\3\u00e0\3\u00e1\3\u00e1"+
		"\3\u00e1\3\u00e1\3\u00e1\3\u00e1\7\u00e1\u0a0c\n\u00e1\f\u00e1\16\u00e1"+
		"\u0a0f\13\u00e1\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e3\3\u00e3\3\u00e3"+
		"\3\u00e3\3\u00e4\3\u00e4\3\u00e4\5\u00e4\u0a1c\n\u00e4\3\u00e4\3\u00e4"+
		"\3\u00e4\7\u00e4\u0a21\n\u00e4\f\u00e4\16\u00e4\u0a24\13\u00e4\3\u00e5"+
		"\3\u00e5\3\u00e5\3\u00e5\3\u00e5\5\u00e5\u0a2b\n\u00e5\3\u00e6\3\u00e6"+
		"\3\u00e7\3\u00e7\5\u00e7\u0a31\n\u00e7\3\u00e8\3\u00e8\3\u00e8\5\u00e8"+
		"\u0a36\n\u00e8\3\u00e8\3\u00e8\5\u00e8\u0a3a\n\u00e8\3\u00e9\3\u00e9\3"+
		"\u00e9\5\u00e9\u0a3f\n\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00ea\3\u00ea\3"+
		"\u00ea\5\u00ea\u0a47\n\u00ea\3\u00eb\3\u00eb\3\u00eb\3\u00eb\3\u00ec\3"+
		"\u00ec\3\u00ec\3\u00ec\7\u00ec\u0a51\n\u00ec\f\u00ec\16\u00ec\u0a54\13"+
		"\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ed\3\u00ed\3\u00ed\3\u00ed\7\u00ed"+
		"\u0a5d\n\u00ed\f\u00ed\16\u00ed\u0a60\13\u00ed\3\u00ed\3\u00ed\3\u00ee"+
		"\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ef\3\u00ef\3\u00ef\7\u00ef\u0a6c"+
		"\n\u00ef\f\u00ef\16\u00ef\u0a6f\13\u00ef\3\u00f0\3\u00f0\7\u00f0\u0a73"+
		"\n\u00f0\f\u00f0\16\u00f0\u0a76\13\u00f0\3\u00f1\3\u00f1\3\u00f1\5\u00f1"+
		"\u0a7b\n\u00f1\3\u00f1\3\u00f1\3\u00f2\3\u00f2\3\u00f2\3\u00f2\3\u00f2"+
		"\5\u00f2\u0a84\n\u00f2\3\u00f3\6\u00f3\u0a87\n\u00f3\r\u00f3\16\u00f3"+
		"\u0a88\3\u00f4\3\u00f4\3\u00f4\3\u00f4\5\u00f4\u0a8f\n\u00f4\3\u00f4\5"+
		"\u00f4\u0a92\n\u00f4\3\u00f5\6\u00f5\u0a95\n\u00f5\r\u00f5\16\u00f5\u0a96"+
		"\3\u00f6\3\u00f6\6\u00f6\u0a9b\n\u00f6\r\u00f6\16\u00f6\u0a9c\3\u00f6"+
		"\3\u00f6\3\u00f7\3\u00f7\3\u00f7\3\u00f7\3\u00f7\3\u00f8\3\u00f8\3\u00f8"+
		"\3\u00f8\5\u00f8\u0aaa\n\u00f8\3\u00f8\3\u00f8\6\u00f8\u0aae\n\u00f8\r"+
		"\u00f8\16\u00f8\u0aaf\7\u00f8\u0ab2\n\u00f8\f\u00f8\16\u00f8\u0ab5\13"+
		"\u00f8\3\u00f9\3\u00f9\3\u00f9\3\u00f9\3\u00f9\5\u00f9\u0abc\n\u00f9\3"+
		"\u00fa\6\u00fa\u0abf\n\u00fa\r\u00fa\16\u00fa\u0ac0\3\u00fa\2\31(P\\b"+
		"dr\u00ba\u00ea\u0136\u0164\u0170\u017e\u018a\u018c\u0190\u0198\u01a4\u01aa"+
		"\u01ac\u01b4\u01c0\u01c6\u01ee\u00fb\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0"+
		"\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8"+
		"\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0"+
		"\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8"+
		"\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110"+
		"\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128"+
		"\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140"+
		"\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158"+
		"\u015a\u015c\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e\u0170"+
		"\u0172\u0174\u0176\u0178\u017a\u017c\u017e\u0180\u0182\u0184\u0186\u0188"+
		"\u018a\u018c\u018e\u0190\u0192\u0194\u0196\u0198\u019a\u019c\u019e\u01a0"+
		"\u01a2\u01a4\u01a6\u01a8\u01aa\u01ac\u01ae\u01b0\u01b2\u01b4\u01b6\u01b8"+
		"\u01ba\u01bc\u01be\u01c0\u01c2\u01c4\u01c6\u01c8\u01ca\u01cc\u01ce\u01d0"+
		"\u01d2\u01d4\u01d6\u01d8\u01da\u01dc\u01de\u01e0\u01e2\u01e4\u01e6\u01e8"+
		"\u01ea\u01ec\u01ee\u01f0\u01f2\2\21\3\2Z[\3\2\"#\4\2\3\3\7\t\5\2ss\u0094"+
		"\u0094\u00ad\u00ad\4\2\u0097\u0097\u00ad\u00ad\4\2\u0093\u0093\u009c\u009c"+
		"\4\2QQbb\t\2\13\20\66\668@BIKwy\u009a\u009c\u00a6\4\2\'\'}}\16\2\66\66"+
		"8@FFII\u0080\u0080\u0083\u0083\u008d\u008d\u0093\u0093\u009a\u009a\u00a6"+
		"\u00a6\u00ab\u00ad\u00af\u00af\r\2\66\668@FFII\u0080\u0080\u0083\u0083"+
		"\u008d\u008d\u009a\u009a\u009c\u009c\u00a6\u00a6\u00ab\u00ad\r\2\66\66"+
		"8@FFII\u0080\u0080\u0083\u0083\u008d\u008d\u0093\u0093\u009a\u009a\u00a6"+
		"\u00a6\u00ab\u00af\r\2\66\668@FFII\u0080\u0080\u0083\u0083\u008d\u008d"+
		"\u0093\u0093\u009a\u009a\u00a6\u00a6\u00ab\u00ad\5\2\32\33((**\5\2\t\t"+
		"\21\22\32\33\2\u0b5b\2\u01f4\3\2\2\2\4\u0205\3\2\2\2\6\u020f\3\2\2\2\b"+
		"\u0213\3\2\2\2\n\u021b\3\2\2\2\f\u0239\3\2\2\2\16\u0240\3\2\2\2\20\u024f"+
		"\3\2\2\2\22\u025c\3\2\2\2\24\u0274\3\2\2\2\26\u0281\3\2\2\2\30\u0283\3"+
		"\2\2\2\32\u0292\3\2\2\2\34\u029c\3\2\2\2\36\u02a9\3\2\2\2 \u02b3\3\2\2"+
		"\2\"\u02c1\3\2\2\2$\u02d6\3\2\2\2&\u02ea\3\2\2\2(\u02f2\3\2\2\2*\u02fe"+
		"\3\2\2\2,\u030a\3\2\2\2.\u031d\3\2\2\2\60\u0330\3\2\2\2\62\u0343\3\2\2"+
		"\2\64\u0345\3\2\2\2\66\u0366\3\2\2\28\u0368\3\2\2\2:\u037d\3\2\2\2<\u0387"+
		"\3\2\2\2>\u0391\3\2\2\2@\u03a0\3\2\2\2B\u03a7\3\2\2\2D\u03ae\3\2\2\2F"+
		"\u03ce\3\2\2\2H\u03d0\3\2\2\2J\u03dd\3\2\2\2L\u03e6\3\2\2\2N\u03ed\3\2"+
		"\2\2P\u0401\3\2\2\2R\u0419\3\2\2\2T\u041c\3\2\2\2V\u044d\3\2\2\2X\u044f"+
		"\3\2\2\2Z\u0451\3\2\2\2\\\u046a\3\2\2\2^\u04df\3\2\2\2`\u04e6\3\2\2\2"+
		"b\u04e8\3\2\2\2d\u04f2\3\2\2\2f\u0505\3\2\2\2h\u0513\3\2\2\2j\u0515\3"+
		"\2\2\2l\u051c\3\2\2\2n\u0533\3\2\2\2p\u0535\3\2\2\2r\u053f\3\2\2\2t\u0549"+
		"\3\2\2\2v\u054f\3\2\2\2x\u0554\3\2\2\2z\u057a\3\2\2\2|\u05aa\3\2\2\2~"+
		"\u05ac\3\2\2\2\u0080\u05bb\3\2\2\2\u0082\u05c7\3\2\2\2\u0084\u05c9\3\2"+
		"\2\2\u0086\u05d0\3\2\2\2\u0088\u05d4\3\2\2\2\u008a\u05db\3\2\2\2\u008c"+
		"\u05df\3\2\2\2\u008e\u05e8\3\2\2\2\u0090\u05ed\3\2\2\2\u0092\u05ef\3\2"+
		"\2\2\u0094\u05f4\3\2\2\2\u0096\u05f7\3\2\2\2\u0098\u05fc\3\2\2\2\u009a"+
		"\u060a\3\2\2\2\u009c\u061d\3\2\2\2\u009e\u062e\3\2\2\2\u00a0\u0630\3\2"+
		"\2\2\u00a2\u0634\3\2\2\2\u00a4\u0638\3\2\2\2\u00a6\u063a\3\2\2\2\u00a8"+
		"\u063e\3\2\2\2\u00aa\u0640\3\2\2\2\u00ac\u0649\3\2\2\2\u00ae\u0652\3\2"+
		"\2\2\u00b0\u0664\3\2\2\2\u00b2\u0667\3\2\2\2\u00b4\u0670\3\2\2\2\u00b6"+
		"\u0678\3\2\2\2\u00b8\u0680\3\2\2\2\u00ba\u0692\3\2\2\2\u00bc\u06a2\3\2"+
		"\2\2\u00be\u06b5\3\2\2\2\u00c0\u06b7\3\2\2\2\u00c2\u06ba\3\2\2\2\u00c4"+
		"\u06be\3\2\2\2\u00c6\u06c3\3\2\2\2\u00c8\u06c7\3\2\2\2\u00ca\u06c9\3\2"+
		"\2\2\u00cc\u06d3\3\2\2\2\u00ce\u06d7\3\2\2\2\u00d0\u06d9\3\2\2\2\u00d2"+
		"\u06dd\3\2\2\2\u00d4\u06e3\3\2\2\2\u00d6\u06e5\3\2\2\2\u00d8\u06e7\3\2"+
		"\2\2\u00da\u06e9\3\2\2\2\u00dc\u06eb\3\2\2\2\u00de\u06ed\3\2\2\2\u00e0"+
		"\u06fa\3\2\2\2\u00e2\u06fe\3\2\2\2\u00e4\u0700\3\2\2\2\u00e6\u0705\3\2"+
		"\2\2\u00e8\u070a\3\2\2\2\u00ea\u070c\3\2\2\2\u00ec\u071a\3\2\2\2\u00ee"+
		"\u0728\3\2\2\2\u00f0\u073a\3\2\2\2\u00f2\u0746\3\2\2\2\u00f4\u0752\3\2"+
		"\2\2\u00f6\u0754\3\2\2\2\u00f8\u0758\3\2\2\2\u00fa\u0763\3\2\2\2\u00fc"+
		"\u076e\3\2\2\2\u00fe\u0780\3\2\2\2\u0100\u0788\3\2\2\2\u0102\u0794\3\2"+
		"\2\2\u0104\u0796\3\2\2\2\u0106\u0798\3\2\2\2\u0108\u07ab\3\2\2\2\u010a"+
		"\u07ad\3\2\2\2\u010c\u07b4\3\2\2\2\u010e\u07bb\3\2\2\2\u0110\u07c4\3\2"+
		"\2\2\u0112\u07cd\3\2\2\2\u0114\u07d6\3\2\2\2\u0116\u07ed\3\2\2\2\u0118"+
		"\u07ff\3\2\2\2\u011a\u0801\3\2\2\2\u011c\u0809\3\2\2\2\u011e\u080b\3\2"+
		"\2\2\u0120\u0811\3\2\2\2\u0122\u0819\3\2\2\2\u0124\u081c\3\2\2\2\u0126"+
		"\u0825\3\2\2\2\u0128\u0831\3\2\2\2\u012a\u0837\3\2\2\2\u012c\u0843\3\2"+
		"\2\2\u012e\u084b\3\2\2\2\u0130\u0851\3\2\2\2\u0132\u085c\3\2\2\2\u0134"+
		"\u085e\3\2\2\2\u0136\u0862\3\2\2\2\u0138\u0870\3\2\2\2\u013a\u087a\3\2"+
		"\2\2\u013c\u087c\3\2\2\2\u013e\u0887\3\2\2\2\u0140\u088b\3\2\2\2\u0142"+
		"\u088d\3\2\2\2\u0144\u0892\3\2\2\2\u0146\u0897\3\2\2\2\u0148\u089f\3\2"+
		"\2\2\u014a\u08b0\3\2\2\2\u014c\u08b2\3\2\2\2\u014e\u08b4\3\2\2\2\u0150"+
		"\u08b7\3\2\2\2\u0152\u08ba\3\2\2\2\u0154\u08bd\3\2\2\2\u0156\u08c0\3\2"+
		"\2\2\u0158\u08c3\3\2\2\2\u015a\u08c5\3\2\2\2\u015c\u08c7\3\2\2\2\u015e"+
		"\u08c9\3\2\2\2\u0160\u08cb\3\2\2\2\u0162\u08d4\3\2\2\2\u0164\u08d6\3\2"+
		"\2\2\u0166\u08e7\3\2\2\2\u0168\u08e9\3\2\2\2\u016a\u08eb\3\2\2\2\u016c"+
		"\u08f3\3\2\2\2\u016e\u08f5\3\2\2\2\u0170\u08fc\3\2\2\2\u0172\u0907\3\2"+
		"\2\2\u0174\u090b\3\2\2\2\u0176\u090f\3\2\2\2\u0178\u0916\3\2\2\2\u017a"+
		"\u0918\3\2\2\2\u017c\u091d\3\2\2\2\u017e\u091f\3\2\2\2\u0180\u092e\3\2"+
		"\2\2\u0182\u0930\3\2\2\2\u0184\u0938\3\2\2\2\u0186\u093a\3\2\2\2\u0188"+
		"\u0947\3\2\2\2\u018a\u0949\3\2\2\2\u018c\u0954\3\2\2\2\u018e\u0964\3\2"+
		"\2\2\u0190\u096b\3\2\2\2\u0192\u097a\3\2\2\2\u0194\u097c\3\2\2\2\u0196"+
		"\u0985\3\2\2\2\u0198\u0987\3\2\2\2\u019a\u0996\3\2\2\2\u019c\u0998\3\2"+
		"\2\2\u019e\u099a\3\2\2\2\u01a0\u09a0\3\2\2\2\u01a2\u09a2\3\2\2\2\u01a4"+
		"\u09a9\3\2\2\2\u01a6\u09b4\3\2\2\2\u01a8\u09b8\3\2\2\2\u01aa\u09bc\3\2"+
		"\2\2\u01ac\u09c7\3\2\2\2\u01ae\u09d6\3\2\2\2\u01b0\u09d8\3\2\2\2\u01b2"+
		"\u09e1\3\2\2\2\u01b4\u09e3\3\2\2\2\u01b6\u09f2\3\2\2\2\u01b8\u09f4\3\2"+
		"\2\2\u01ba\u09f6\3\2\2\2\u01bc\u09fc\3\2\2\2\u01be\u09fe\3\2\2\2\u01c0"+
		"\u0a05\3\2\2\2\u01c2\u0a10\3\2\2\2\u01c4\u0a14\3\2\2\2\u01c6\u0a1b\3\2"+
		"\2\2\u01c8\u0a2a\3\2\2\2\u01ca\u0a2c\3\2\2\2\u01cc\u0a30\3\2\2\2\u01ce"+
		"\u0a39\3\2\2\2\u01d0\u0a3b\3\2\2\2\u01d2\u0a46\3\2\2\2\u01d4\u0a48\3\2"+
		"\2\2\u01d6\u0a4c\3\2\2\2\u01d8\u0a58\3\2\2\2\u01da\u0a63\3\2\2\2\u01dc"+
		"\u0a68\3\2\2\2\u01de\u0a70\3\2\2\2\u01e0\u0a77\3\2\2\2\u01e2\u0a83\3\2"+
		"\2\2\u01e4\u0a86\3\2\2\2\u01e6\u0a91\3\2\2\2\u01e8\u0a94\3\2\2\2\u01ea"+
		"\u0a98\3\2\2\2\u01ec\u0aa0\3\2\2\2\u01ee\u0aa9\3\2\2\2\u01f0\u0abb\3\2"+
		"\2\2\u01f2\u0abe\3\2\2\2\u01f4\u01f5\7g\2\2\u01f5\u01f6\5\u00dan\2\u01f6"+
		"\u01fd\7\26\2\2\u01f7\u01fa\5\u00dan\2\u01f8\u01f9\7\23\2\2\u01f9\u01fb"+
		"\5\u0100\u0081\2\u01fa\u01f8\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fe\3"+
		"\2\2\2\u01fc\u01fe\5\u0100\u0081\2\u01fd\u01f7\3\2\2\2\u01fd\u01fc\3\2"+
		"\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0200\7\27\2\2\u0200\u0201\7\21\2\2\u0201"+
		"\u0202\5\u008cG\2\u0202\u0203\5\u00acW\2\u0203\u0204\5\u008eH\2\u0204"+
		"\3\3\2\2\2\u0205\u0206\7g\2\2\u0206\u0207\5\u00dan\2\u0207\u0208\7\26"+
		"\2\2\u0208\u0209\5\u00be`\2\u0209\u020a\7\27\2\2\u020a\u020b\7\21\2\2"+
		"\u020b\u020c\5\u008cG\2\u020c\u020d\5\u00aaV\2\u020d\u020e\5\u008eH\2"+
		"\u020e\5\3\2\2\2\u020f\u0210\5\u00dco\2\u0210\u0211\7.\2\2\u0211\u0212"+
		"\5\\/\2\u0212\7\3\2\2\2\u0213\u0214\5\u00dco\2\u0214\u0216\7\26\2\2\u0215"+
		"\u0217\5r:\2\u0216\u0215\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u0218\3\2\2"+
		"\2\u0218\u0219\7\27\2\2\u0219\t\3\2\2\2\u021a\u021c\7\u0097\2\2\u021b"+
		"\u021a\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u021e\7R"+
		"\2\2\u021e\u021f\5\u00d8m\2\u021f\u0220\7\26\2\2\u0220\u0221\5\u00ba^"+
		"\2\u0221\u0237\7\27\2\2\u0222\u0223\7\21\2\2\u0223\u0233\5\u008cG\2\u0224"+
		"\u0234\7\u008b\2\2\u0225\u0229\5\u00b0Y\2\u0226\u0227\5\u0088E\2\u0227"+
		"\u0228\5\f\7\2\u0228\u022a\3\2\2\2\u0229\u0226\3\2\2\2\u0229\u022a\3\2"+
		"\2\2\u022a\u0232\3\2\2\2\u022b\u022f\5\f\7\2\u022c\u022d\5\u0088E\2\u022d"+
		"\u022e\5\u00b0Y\2\u022e\u0230\3\2\2\2\u022f\u022c\3\2\2\2\u022f\u0230"+
		"\3\2\2\2\u0230\u0232\3\2\2\2\u0231\u0225\3\2\2\2\u0231\u022b\3\2\2\2\u0232"+
		"\u0234\3\2\2\2\u0233\u0224\3\2\2\2\u0233\u0231\3\2\2\2\u0234\u0235\3\2"+
		"\2\2\u0235\u0236\5\u008eH\2\u0236\u0238\3\2\2\2\u0237\u0222\3\2\2\2\u0237"+
		"\u0238\3\2\2\2\u0238\13\3\2\2\2\u0239\u023a\7w\2\2\u023a\u023c\7\26\2"+
		"\2\u023b\u023d\5\u00fe\u0080\2\u023c\u023b\3\2\2\2\u023c\u023d\3\2\2\2"+
		"\u023d\u023e\3\2\2\2\u023e\u023f\7\27\2\2\u023f\r\3\2\2\2\u0240\u0241"+
		"\7\u00a1\2\2\u0241\u0242\5\u00dan\2\u0242\u0244\7\26\2\2\u0243\u0245\5"+
		"\u00dan\2\u0244\u0243\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0246\3\2\2\2"+
		"\u0246\u0247\7\27\2\2\u0247\u0248\7\21\2\2\u0248\u024b\5\u008cG\2\u0249"+
		"\u024c\5\u00ecw\2\u024a\u024c\7\u008b\2\2\u024b\u0249\3\2\2\2\u024b\u024a"+
		"\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u024e\5\u008eH\2\u024e\17\3\2\2\2\u024f"+
		"\u0250\7\177\2\2\u0250\u0251\7\u00a1\2\2\u0251\u0252\5\u00dan\2\u0252"+
		"\u0253\7\26\2\2\u0253\u0254\7\27\2\2\u0254\u0255\7\21\2\2\u0255\u0256"+
		"\5\u008cG\2\u0256\u0257\5&\24\2\u0257\u0258\5\u0088E\2\u0258\u0259\5\u00f0"+
		"y\2\u0259\u025a\5\u008eH\2\u025a\21\3\2\2\2\u025b\u025d\7\u0097\2\2\u025c"+
		"\u025b\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u025f\t\2"+
		"\2\2\u025f\u0260\5\u00dan\2\u0260\u0267\7\26\2\2\u0261\u0268\5\26\f\2"+
		"\u0262\u0268\5\u0100\u0081\2\u0263\u0264\5\26\f\2\u0264\u0265\7\23\2\2"+
		"\u0265\u0266\5\u0100\u0081\2\u0266\u0268\3\2\2\2\u0267\u0261\3\2\2\2\u0267"+
		"\u0262\3\2\2\2\u0267\u0263\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u0272\7\27"+
		"\2\2\u026a\u026b\7\21\2\2\u026b\u026e\5\u008cG\2\u026c\u026f\5\u00ecw"+
		"\2\u026d\u026f\7\u008b\2\2\u026e\u026c\3\2\2\2\u026e\u026d\3\2\2\2\u026f"+
		"\u0270\3\2\2\2\u0270\u0271\5\u008eH\2\u0271\u0273\3\2\2\2\u0272\u026a"+
		"\3\2\2\2\u0272\u0273\3\2\2\2\u0273\23\3\2\2\2\u0274\u0275\7\u0095\2\2"+
		"\u0275\u0276\5\u00dan\2\u0276\u0277\7\26\2\2\u0277\u0278\5\u0100\u0081"+
		"\2\u0278\u0279\7\27\2\2\u0279\u027a\7\21\2\2\u027a\u027d\5\u008cG\2\u027b"+
		"\u027e\5\u00ecw\2\u027c\u027e\7\u008b\2\2\u027d\u027b\3\2\2\2\u027d\u027c"+
		"\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u0280\5\u008eH\2\u0280\25\3\2\2\2\u0281"+
		"\u0282\5\u00caf\2\u0282\27\3\2\2\2\u0283\u0284\7^\2\2\u0284\u0285\7\u0087"+
		"\2\2\u0285\u0286\5\u014a\u00a6\2\u0286\u0287\7\26\2\2\u0287\u0288\5\u00e2"+
		"r\2\u0288\u028b\7\27\2\2\u0289\u028a\7\64\2\2\u028a\u028c\5\u00ba^\2\u028b"+
		"\u0289\3\2\2\2\u028b\u028c\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u028e\7\21"+
		"\2\2\u028e\u028f\5\u008cG\2\u028f\u0290\5\u010e\u0088\2\u0290\u0291\5"+
		"\u008eH\2\u0291\31\3\2\2\2\u0292\u0293\7^\2\2\u0293\u0294\5\u00d6l\2\u0294"+
		"\u0295\7\u0094\2\2\u0295\u0296\7\26\2\2\u0296\u0297\7\27\2\2\u0297\u0298"+
		"\7\21\2\2\u0298\u0299\5\u008cG\2\u0299\u029a\5\u010e\u0088\2\u029a\u029b"+
		"\5\u008eH\2\u029b\33\3\2\2\2\u029c\u029d\7^\2\2\u029d\u029f\5\u00d6l\2"+
		"\u029e\u02a0\7\177\2\2\u029f\u029e\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u02a1"+
		"\3\2\2\2\u02a1\u02a2\7\u0094\2\2\u02a2\u02a3\7\26\2\2\u02a3\u02a4\7\27"+
		"\2\2\u02a4\u02a5\7\21\2\2\u02a5\u02a6\5\u008cG\2\u02a6\u02a7\5\u0106\u0084"+
		"\2\u02a7\u02a8\5\u008eH\2\u02a8\35\3\2\2\2\u02a9\u02aa\7^\2\2\u02aa\u02ab"+
		"\5\u00d6l\2\u02ab\u02ac\7s\2\2\u02ac\u02ad\7\26\2\2\u02ad\u02ae\7\27\2"+
		"\2\u02ae\u02af\7\21\2\2\u02af\u02b0\5\u008cG\2\u02b0\u02b1\5\u010e\u0088"+
		"\2\u02b1\u02b2\5\u008eH\2\u02b2\37\3\2\2\2\u02b3\u02b4\7^\2\2\u02b4\u02b6"+
		"\5\u00d6l\2\u02b5\u02b7\7\177\2\2\u02b6\u02b5\3\2\2\2\u02b6\u02b7\3\2"+
		"\2\2\u02b7\u02b8\3\2\2\2\u02b8\u02b9\7s\2\2\u02b9\u02ba\7\26\2\2\u02ba"+
		"\u02bb\7\27\2\2\u02bb\u02bc\7\21\2\2\u02bc\u02bd\5\u008cG\2\u02bd\u02be"+
		"\5\u0106\u0084\2\u02be\u02bf\5\u008eH\2\u02bf!\3\2\2\2\u02c0\u02c2\7\u0097"+
		"\2\2\u02c1\u02c0\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3"+
		"\u02c4\7\177\2\2\u02c4\u02c5\t\2\2\2\u02c5\u02c6\5\u00dan\2\u02c6\u02c8"+
		"\7\26\2\2\u02c7\u02c9\5\u0100\u0081\2\u02c8\u02c7\3\2\2\2\u02c8\u02c9"+
		"\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca\u02cb\7\27\2\2\u02cb\u02cc\7\21\2\2"+
		"\u02cc\u02cd\5\u008cG\2\u02cd\u02d1\5&\24\2\u02ce\u02cf\5\u0088E\2\u02cf"+
		"\u02d0\5\u00f0y\2\u02d0\u02d2\3\2\2\2\u02d1\u02ce\3\2\2\2\u02d1\u02d2"+
		"\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3\u02d4\5\u008eH\2\u02d4#\3\2\2\2\u02d5"+
		"\u02d7\7\u0097\2\2\u02d6\u02d5\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7\u02d8"+
		"\3\2\2\2\u02d8\u02d9\7\177\2\2\u02d9\u02da\7\u008f\2\2\u02da\u02db\5\u00da"+
		"n\2\u02db\u02dd\7\26\2\2\u02dc\u02de\5\u0100\u0081\2\u02dd\u02dc\3\2\2"+
		"\2\u02dd\u02de\3\2\2\2\u02de\u02df\3\2\2\2\u02df\u02e0\7\27\2\2\u02e0"+
		"\u02e1\7\21\2\2\u02e1\u02e2\5\u008cG\2\u02e2\u02e6\5&\24\2\u02e3\u02e4"+
		"\5\u0088E\2\u02e4\u02e5\5\u00f0y\2\u02e5\u02e7\3\2\2\2\u02e6\u02e3\3\2"+
		"\2\2\u02e6\u02e7\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8\u02e9\5\u008eH\2\u02e9"+
		"%\3\2\2\2\u02ea\u02eb\7^\2\2\u02eb\u02ec\t\2\2\2\u02ec\u02ed\7U\2\2\u02ed"+
		"\u02ee\7\21\2\2\u02ee\u02ef\5\u008cG\2\u02ef\u02f0\5(\25\2\u02f0\u02f1"+
		"\5\u008eH\2\u02f1\'\3\2\2\2\u02f2\u02f3\b\25\1\2\u02f3\u02f4\5\u00f4{"+
		"\2\u02f4\u02fb\3\2\2\2\u02f5\u02f6\f\3\2\2\u02f6\u02f7\5\u0088E\2\u02f7"+
		"\u02f8\5\u00f4{\2\u02f8\u02fa\3\2\2\2\u02f9\u02f5\3\2\2\2\u02fa\u02fd"+
		"\3\2\2\2\u02fb\u02f9\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc)\3\2\2\2\u02fd"+
		"\u02fb\3\2\2\2\u02fe\u02ff\7K\2\2\u02ff\u0300\7^\2\2\u0300\u0301\5\u00cc"+
		"g\2\u0301\u0303\7\26\2\2\u0302\u0304\5\u00dep\2\u0303\u0302\3\2\2\2\u0303"+
		"\u0304\3\2\2\2\u0304\u0305\3\2\2\2\u0305\u0308\7\27\2\2\u0306\u0307\7"+
		"\64\2\2\u0307\u0309\5\u00ba^\2\u0308\u0306\3\2\2\2\u0308\u0309\3\2\2\2"+
		"\u0309+\3\2\2\2\u030a\u030b\7^\2\2\u030b\u030c\5\u00ccg\2\u030c\u030e"+
		"\7\26\2\2\u030d\u030f\5\u00dep\2\u030e\u030d\3\2\2\2\u030e\u030f\3\2\2"+
		"\2\u030f\u0310\3\2\2\2\u0310\u0313\7\27\2\2\u0311\u0312\7\64\2\2\u0312"+
		"\u0314\5\u00ba^\2\u0313\u0311\3\2\2\2\u0313\u0314\3\2\2\2\u0314\u0315"+
		"\3\2\2\2\u0315\u0316\7\21\2\2\u0316\u0319\5\u008cG\2\u0317\u031a\5\u010e"+
		"\u0088\2\u0318\u031a\7\u008b\2\2\u0319\u0317\3\2\2\2\u0319\u0318\3\2\2"+
		"\2\u031a\u031b\3\2\2\2\u031b\u031c\5\u008eH\2\u031c-\3\2\2\2\u031d\u031f"+
		"\7^\2\2\u031e\u0320\7\177\2\2\u031f\u031e\3\2\2\2\u031f\u0320\3\2\2\2"+
		"\u0320\u0321\3\2\2\2\u0321\u0322\5\u00ccg\2\u0322\u0324\7\26\2\2\u0323"+
		"\u0325\5\u00dep\2\u0324\u0323\3\2\2\2\u0324\u0325\3\2\2\2\u0325\u0326"+
		"\3\2\2\2\u0326\u0329\7\27\2\2\u0327\u0328\7\64\2\2\u0328\u032a\5\u00e8"+
		"u\2\u0329\u0327\3\2\2\2\u0329\u032a\3\2\2\2\u032a\u032b\3\2\2\2\u032b"+
		"\u032c\7\21\2\2\u032c\u032d\5\u008cG\2\u032d\u032e\5\u0106\u0084\2\u032e"+
		"\u032f\5\u008eH\2\u032f/\3\2\2\2\u0330\u0331\7^\2\2\u0331\u0332\7\u009a"+
		"\2\2\u0332\u0333\7\u00b1\2\2\u0333\u0334\7\26\2\2\u0334\u0335\7\27\2\2"+
		"\u0335\u0336\7\21\2\2\u0336\u0337\5\u008cG\2\u0337\u0338\5\u010e\u0088"+
		"\2\u0338\u0339\5\u008eH\2\u0339\u033a\5\u0088E\2\u033a\u033b\7\u00a0\2"+
		"\2\u033b\u0341\7\21\2\2\u033c\u033d\5\u008cG\2\u033d\u033e\5\u0110\u0089"+
		"\2\u033e\u033f\5\u008eH\2\u033f\u0342\3\2\2\2\u0340\u0342\5\u00dco\2\u0341"+
		"\u033c\3\2\2\2\u0341\u0340\3\2\2\2\u0342\61\3\2\2\2\u0343\u0344\5\\/\2"+
		"\u0344\63\3\2\2\2\u0345\u0346\5\u00d6l\2\u0346\u0347\7\21\2\2\u0347\u034c"+
		"\5\u00e8u\2\u0348\u0349\7\26\2\2\u0349\u034a\5\u0100\u0081\2\u034a\u034b"+
		"\7\27\2\2\u034b\u034d\3\2\2\2\u034c\u0348\3\2\2\2\u034c\u034d\3\2\2\2"+
		"\u034d\u0350\3\2\2\2\u034e\u034f\7.\2\2\u034f\u0351\5\u0120\u0091\2\u0350"+
		"\u034e\3\2\2\2\u0350\u0351\3\2\2\2\u0351\65\3\2\2\2\u0352\u0367\5> \2"+
		"\u0353\u0367\5\u0080A\2\u0354\u0367\5\u0084C\2\u0355\u0367\5:\36\2\u0356"+
		"\u0367\5|?\2\u0357\u0367\58\35\2\u0358\u0367\5X-\2\u0359\u0367\5Z.\2\u035a"+
		"\u0367\5N(\2\u035b\u0367\5D#\2\u035c\u0367\5H%\2\u035d\u0367\5L\'\2\u035e"+
		"\u0367\5J&\2\u035f\u0367\5R*\2\u0360\u0367\5T+\2\u0361\u0367\5v<\2\u0362"+
		"\u0367\5@!\2\u0363\u0367\5B\"\2\u0364\u0367\5,\27\2\u0365\u0367\5\u0104"+
		"\u0083\2\u0366\u0352\3\2\2\2\u0366\u0353\3\2\2\2\u0366\u0354\3\2\2\2\u0366"+
		"\u0355\3\2\2\2\u0366\u0356\3\2\2\2\u0366\u0357\3\2\2\2\u0366\u0358\3\2"+
		"\2\2\u0366\u0359\3\2\2\2\u0366\u035a\3\2\2\2\u0366\u035b\3\2\2\2\u0366"+
		"\u035c\3\2\2\2\u0366\u035d\3\2\2\2\u0366\u035e\3\2\2\2\u0366\u035f\3\2"+
		"\2\2\u0366\u0360\3\2\2\2\u0366\u0361\3\2\2\2\u0366\u0362\3\2\2\2\u0366"+
		"\u0363\3\2\2\2\u0366\u0364\3\2\2\2\u0366\u0365\3\2\2\2\u0367\67\3\2\2"+
		"\2\u0368\u0369\7p\2\2\u0369\u036a\7\26\2\2\u036a\u036b\7\27\2\2\u036b"+
		"9\3\2\2\2\u036c\u036d\7a\2\2\u036d\u036e\7\26\2\2\u036e\u036f\5\u00b6"+
		"\\\2\u036f\u0376\7\27\2\2\u0370\u0371\7N\2\2\u0371\u0372\7\u0098\2\2\u0372"+
		"\u0373\7\26\2\2\u0373\u0374\5\u00b6\\\2\u0374\u0375\7\27\2\2\u0375\u0377"+
		"\3\2\2\2\u0376\u0370\3\2\2\2\u0376\u0377\3\2\2\2\u0377\u037e\3\2\2\2\u0378"+
		"\u0379\7\u0098\2\2\u0379\u037a\7\26\2\2\u037a\u037b\5\u00b6\\\2\u037b"+
		"\u037c\7\27\2\2\u037c\u037e\3\2\2\2\u037d\u036c\3\2\2\2\u037d\u0378\3"+
		"\2\2\2\u037e\u0385\3\2\2\2\u037f\u0380\7\u009b\2\2\u0380\u0381\7\21\2"+
		"\2\u0381\u0382\5\u008cG\2\u0382\u0383\5\u010e\u0088\2\u0383\u0384\5\u008e"+
		"H\2\u0384\u0386\3\2\2\2\u0385\u037f\3\2\2\2\u0385\u0386\3\2\2\2\u0386"+
		";\3\2\2\2\u0387\u0388\5\u00ccg\2\u0388\u038a\7\26\2\2\u0389\u038b\5r:"+
		"\2\u038a\u0389\3\2\2\2\u038a\u038b\3\2\2\2\u038b\u038c\3\2\2\2\u038c\u038d"+
		"\7\27\2\2\u038d=\3\2\2\2\u038e\u038f\5b\62\2\u038f\u0390\7\25\2\2\u0390"+
		"\u0392\3\2\2\2\u0391\u038e\3\2\2\2\u0391\u0392\3\2\2\2\u0392\u0393\3\2"+
		"\2\2\u0393\u039e\5<\37\2\u0394\u0397\7\u009b\2\2\u0395\u0396\7\u00a2\2"+
		"\2\u0396\u0398\5\u00d6l\2\u0397\u0395\3\2\2\2\u0397\u0398\3\2\2\2\u0398"+
		"\u0399\3\2\2\2\u0399\u039a\7\21\2\2\u039a\u039b\5\u008cG\2\u039b\u039c"+
		"\5\u010e\u0088\2\u039c\u039d\5\u008eH\2\u039d\u039f\3\2\2\2\u039e\u0394"+
		"\3\2\2\2\u039e\u039f\3\2\2\2\u039f?\3\2\2\2\u03a0\u03a1\7\u00a2\2\2\u03a1"+
		"\u03a2\5\u0134\u009b\2\u03a2\u03a3\7\21\2\2\u03a3\u03a4\5\u008cG\2\u03a4"+
		"\u03a5\5\u010e\u0088\2\u03a5\u03a6\5\u008eH\2\u03a6A\3\2\2\2\u03a7\u03a8"+
		"\7\u00a2\2\2\u03a8\u03a9\5\u00dan\2\u03a9\u03aa\7\21\2\2\u03aa\u03ab\5"+
		"\u008cG\2\u03ab\u03ac\5\u010e\u0088\2\u03ac\u03ad\5\u008eH\2\u03adC\3"+
		"\2\2\2\u03ae\u03af\7\u0099\2\2\u03af\u03b0\7\u0084\2\2\u03b0\u03b1\5\\"+
		"/\2\u03b1\u03b2\7\21\2\2\u03b2\u03b3\5\u008cG\2\u03b3\u03bb\5\u0112\u008a"+
		"\2\u03b4\u03b5\5\u0088E\2\u03b5\u03b6\7\u008a\2\2\u03b6\u03b7\7\21\2\2"+
		"\u03b7\u03b8\5\u008cG\2\u03b8\u03b9\5\u010e\u0088\2\u03b9\u03ba\5\u008e"+
		"H\2\u03ba\u03bc\3\2\2\2\u03bb\u03b4\3\2\2\2\u03bb\u03bc\3\2\2\2\u03bc"+
		"\u03bd\3\2\2\2\u03bd\u03be\5\u008eH\2\u03beE\3\2\2\2\u03bf\u03c0\7\u00a3"+
		"\2\2\u03c0\u03c1\5\u0118\u008d\2\u03c1\u03c2\7\21\2\2\u03c2\u03c3\5\u008c"+
		"G\2\u03c3\u03c4\5\u010e\u0088\2\u03c4\u03c5\5\u008eH\2\u03c5\u03cf\3\2"+
		"\2\2\u03c6\u03c7\7\u00a3\2\2\u03c7\u03c8\7v\2\2\u03c8\u03c9\5\u0116\u008c"+
		"\2\u03c9\u03ca\7\21\2\2\u03ca\u03cb\5\u008cG\2\u03cb\u03cc\5\u010e\u0088"+
		"\2\u03cc\u03cd\5\u008eH\2\u03cd\u03cf\3\2\2\2\u03ce\u03bf\3\2\2\2\u03ce"+
		"\u03c6\3\2\2\2\u03cfG\3\2\2\2\u03d0\u03d1\7q\2\2\u03d1\u03d4\5\u00d6l"+
		"\2\u03d2\u03d3\7\23\2\2\u03d3\u03d5\5\u00d6l\2\u03d4\u03d2\3\2\2\2\u03d4"+
		"\u03d5\3\2\2\2\u03d5\u03d6\3\2\2\2\u03d6\u03d7\7v\2\2\u03d7\u03d8\5\\"+
		"/\2\u03d8\u03d9\7\21\2\2\u03d9\u03da\5\u008cG\2\u03da\u03db\5\u010e\u0088"+
		"\2\u03db\u03dc\5\u008eH\2\u03dcI\3\2\2\2\u03dd\u03de\7c\2\2\u03de\u03df"+
		"\7\21\2\2\u03df\u03e0\5\u008cG\2\u03e0\u03e1\5\u010e\u0088\2\u03e1\u03e2"+
		"\5\u008eH\2\u03e2\u03e3\5\u0088E\2\u03e3\u03e4\7\u00a5\2\2\u03e4\u03e5"+
		"\5\\/\2\u03e5K\3\2\2\2\u03e6\u03e7\7\u00a5\2\2\u03e7\u03e8\5\\/\2\u03e8"+
		"\u03e9\7\21\2\2\u03e9\u03ea\5\u008cG\2\u03ea\u03eb\5\u010e\u0088\2\u03eb"+
		"\u03ec\5\u008eH\2\u03ecM\3\2\2\2\u03ed\u03ee\7u\2\2\u03ee\u03ef\5\\/\2"+
		"\u03ef\u03f0\7\21\2\2\u03f0\u03f1\5\u008cG\2\u03f1\u03f2\5\u010e\u0088"+
		"\2\u03f2\u03f6\5\u008eH\2\u03f3\u03f4\5\u0088E\2\u03f4\u03f5\5P)\2\u03f5"+
		"\u03f7\3\2\2\2\u03f6\u03f3\3\2\2\2\u03f6\u03f7\3\2\2\2\u03f7\u03ff\3\2"+
		"\2\2\u03f8\u03f9\5\u0088E\2\u03f9\u03fa\7f\2\2\u03fa\u03fb\7\21\2\2\u03fb"+
		"\u03fc\5\u008cG\2\u03fc\u03fd\5\u010e\u0088\2\u03fd\u03fe\5\u008eH\2\u03fe"+
		"\u0400\3\2\2\2\u03ff\u03f8\3\2\2\2\u03ff\u0400\3\2\2\2\u0400O\3\2\2\2"+
		"\u0401\u0402\b)\1\2\u0402\u0403\7f\2\2\u0403\u0404\7u\2\2\u0404\u0405"+
		"\5\\/\2\u0405\u0406\7\21\2\2\u0406\u0407\5\u008cG\2\u0407\u0408\5\u010e"+
		"\u0088\2\u0408\u0409\5\u008eH\2\u0409\u0416\3\2\2\2\u040a\u040b\f\3\2"+
		"\2\u040b\u040c\5\u0088E\2\u040c\u040d\7f\2\2\u040d\u040e\7u\2\2\u040e"+
		"\u040f\5\\/\2\u040f\u0410\7\21\2\2\u0410\u0411\5\u008cG\2\u0411\u0412"+
		"\5\u010e\u0088\2\u0412\u0413\5\u008eH\2\u0413\u0415\3\2\2\2\u0414\u040a"+
		"\3\2\2\2\u0415\u0418\3\2\2\2\u0416\u0414\3\2\2\2\u0416\u0417\3\2\2\2\u0417"+
		"Q\3\2\2\2\u0418\u0416\3\2\2\2\u0419\u041a\7\u008c\2\2\u041a\u041b\5\\"+
		"/\2\u041bS\3\2\2\2\u041c\u041d\7\u009f\2\2\u041d\u041e\5\u00d6l\2\u041e"+
		"\u041f\7\21\2\2\u041f\u0420\5\u008cG\2\u0420\u0421\5\u010e\u0088\2\u0421"+
		"\u0422\5\u008eH\2\u0422\u0424\5\u0086D\2\u0423\u0425\5\u0114\u008b\2\u0424"+
		"\u0423\3\2\2\2\u0424\u0425\3\2\2\2\u0425\u042d\3\2\2\2\u0426\u0427\7i"+
		"\2\2\u0427\u0428\7\21\2\2\u0428\u0429\5\u008cG\2\u0429\u042a\5\u010e\u0088"+
		"\2\u042a\u042b\5\u008eH\2\u042b\u042c\5\u0086D\2\u042c\u042e\3\2\2\2\u042d"+
		"\u0426\3\2\2\2\u042d\u042e\3\2\2\2\u042e\u0436\3\2\2\2\u042f\u0430\7o"+
		"\2\2\u0430\u0431\7\21\2\2\u0431\u0432\5\u008cG\2\u0432\u0433\5\u010e\u0088"+
		"\2\u0433\u0434\5\u008eH\2\u0434\u0435\5\u0086D\2\u0435\u0437\3\2\2\2\u0436"+
		"\u042f\3\2\2\2\u0436\u0437\3\2\2\2\u0437\u0438\3\2\2\2\u0438\u0439\5\u0086"+
		"D\2\u0439U\3\2\2\2\u043a\u043b\7i\2\2\u043b\u043c\5\u00dco\2\u043c\u043d"+
		"\7\21\2\2\u043d\u043e\5\u008cG\2\u043e\u043f\5\u010e\u0088\2\u043f\u0440"+
		"\5\u008eH\2\u0440\u0441\5\u0086D\2\u0441\u044e\3\2\2\2\u0442\u0443\7i"+
		"\2\2\u0443\u0444\7v\2\2\u0444\u0445\7\30\2\2\u0445\u0446\5\u00aeX\2\u0446"+
		"\u0447\7\31\2\2\u0447\u0448\7\21\2\2\u0448\u0449\5\u008cG\2\u0449\u044a"+
		"\5\u010e\u0088\2\u044a\u044b\5\u008eH\2\u044b\u044c\5\u0086D\2\u044c\u044e"+
		"\3\2\2\2\u044d\u043a\3\2\2\2\u044d\u0442\3\2\2\2\u044eW\3\2\2\2\u044f"+
		"\u0450\7V\2\2\u0450Y\3\2\2\2\u0451\u0453\7\u0090\2\2\u0452\u0454\5\\/"+
		"\2\u0453\u0452\3\2\2\2\u0453\u0454\3\2\2\2\u0454[\3\2\2\2\u0455\u0456"+
		"\b/\1\2\u0456\u046b\5\u01ea\u00f6\2\u0457\u046b\5\u01cc\u00e7\2\u0458"+
		"\u046b\5b\62\2\u0459\u046b\5d\63\2\u045a\u046b\5\u013a\u009e\2\u045b\u045c"+
		"\7#\2\2\u045c\u046b\5\\/$\u045d\u045e\7\u0081\2\2\u045e\u046b\5\\/#\u045f"+
		"\u0460\7B\2\2\u0460\u0461\7\26\2\2\u0461\u0462\5\\/\2\u0462\u0463\7\27"+
		"\2\2\u0463\u046b\3\2\2\2\u0464\u0465\7j\2\2\u0465\u0466\7\26\2\2\u0466"+
		"\u0467\5\u00d6l\2\u0467\u0468\7\27\2\2\u0468\u046b\3\2\2\2\u0469\u046b"+
		"\5^\60\2\u046a\u0455\3\2\2\2\u046a\u0457\3\2\2\2\u046a\u0458\3\2\2\2\u046a"+
		"\u0459\3\2\2\2\u046a\u045a\3\2\2\2\u046a\u045b\3\2\2\2\u046a\u045d\3\2"+
		"\2\2\u046a\u045f\3\2\2\2\u046a\u0464\3\2\2\2\u046a\u0469\3\2\2\2\u046b"+
		"\u04dc\3\2\2\2\u046c\u046d\f\"\2\2\u046d\u046e\5\u015a\u00ae\2\u046e\u046f"+
		"\5\\/#\u046f\u04db\3\2\2\2\u0470\u0471\f!\2\2\u0471\u0472\5\u015c\u00af"+
		"\2\u0472\u0473\5\\/\"\u0473\u04db\3\2\2\2\u0474\u0475\f \2\2\u0475\u0476"+
		"\5\u0160\u00b1\2\u0476\u0477\5\\/!\u0477\u04db\3\2\2\2\u0478\u0479\f\37"+
		"\2\2\u0479\u047a\5\u015e\u00b0\2\u047a\u047b\5\\/ \u047b\u04db\3\2\2\2"+
		"\u047c\u047d\f\36\2\2\u047d\u047e\t\3\2\2\u047e\u04db\5\\/\37\u047f\u0480"+
		"\f\34\2\2\u0480\u0481\7*\2\2\u0481\u04db\5\\/\35\u0482\u0483\f\33\2\2"+
		"\u0483\u0484\7+\2\2\u0484\u04db\5\\/\34\u0485\u0486\f\32\2\2\u0486\u0487"+
		"\7(\2\2\u0487\u04db\5\\/\33\u0488\u0489\f\31\2\2\u0489\u048a\7)\2\2\u048a"+
		"\u04db\5\\/\32\u048b\u048c\f\26\2\2\u048c\u048d\7\60\2\2\u048d\u04db\5"+
		"\\/\27\u048e\u048f\f\25\2\2\u048f\u0490\7/\2\2\u0490\u04db\5\\/\26\u0491"+
		"\u0492\f\24\2\2\u0492\u0493\7\61\2\2\u0493\u04db\5\\/\25\u0494\u0495\f"+
		"\23\2\2\u0495\u0496\7]\2\2\u0496\u04db\5\\/\24\u0497\u0498\f\22\2\2\u0498"+
		"\u0499\7v\2\2\u0499\u04db\5\\/\23\u049a\u049b\f\21\2\2\u049b\u049c\7t"+
		"\2\2\u049c\u04db\5\\/\22\u049d\u049e\f\20\2\2\u049e\u049f\7t\2\2\u049f"+
		"\u04a0\7L\2\2\u04a0\u04db\5\\/\21\u04a1\u04a2\f\17\2\2\u04a2\u04a3\7t"+
		"\2\2\u04a3\u04a4\7O\2\2\u04a4\u04db\5\\/\20\u04a5\u04a6\f\16\2\2\u04a6"+
		"\u04a7\7\u0081\2\2\u04a7\u04a8\7]\2\2\u04a8\u04db\5\\/\17\u04a9\u04aa"+
		"\f\r\2\2\u04aa\u04ab\7\u0081\2\2\u04ab\u04ac\7v\2\2\u04ac\u04db\5\\/\16"+
		"\u04ad\u04ae\f\f\2\2\u04ae\u04af\7\u0081\2\2\u04af\u04b0\7t\2\2\u04b0"+
		"\u04db\5\\/\r\u04b1\u04b2\f\13\2\2\u04b2\u04b3\7\u0081\2\2\u04b3\u04b4"+
		"\7t\2\2\u04b4\u04b5\7L\2\2\u04b5\u04db\5\\/\f\u04b6\u04b7\f\n\2\2\u04b7"+
		"\u04b8\7\u0081\2\2\u04b8\u04b9\7t\2\2\u04b9\u04ba\7O\2\2\u04ba\u04db\5"+
		"\\/\13\u04bb\u04bc\f\t\2\2\u04bc\u04bd\7\u0088\2\2\u04bd\u04db\5\\/\n"+
		"\u04be\u04bf\f\b\2\2\u04bf\u04c0\7N\2\2\u04c0\u04db\5\\/\t\u04c1\u04c2"+
		"\f\7\2\2\u04c2\u04c3\7u\2\2\u04c3\u04c4\5\\/\2\u04c4\u04c5\7f\2\2\u04c5"+
		"\u04c6\5\\/\b\u04c6\u04db\3\2\2\2\u04c7\u04c8\f\3\2\2\u04c8\u04c9\7q\2"+
		"\2\u04c9\u04ca\7e\2\2\u04ca\u04cb\5\u00d6l\2\u04cb\u04cc\7v\2\2\u04cc"+
		"\u04cd\5\\/\4\u04cd\u04db\3\2\2\2\u04ce\u04cf\f%\2\2\u04cf\u04db\5x=\2"+
		"\u04d0\u04d1\f\35\2\2\u04d1\u04d2\7P\2\2\u04d2\u04db\5\u00e8u\2\u04d3"+
		"\u04d4\f\30\2\2\u04d4\u04d5\7y\2\2\u04d5\u04d6\7\u0081\2\2\u04d6\u04db"+
		"\5\u0138\u009d\2\u04d7\u04d8\f\27\2\2\u04d8\u04d9\7y\2\2\u04d9\u04db\5"+
		"\u0138\u009d\2\u04da\u046c\3\2\2\2\u04da\u0470\3\2\2\2\u04da\u0474\3\2"+
		"\2\2\u04da\u0478\3\2\2\2\u04da\u047c\3\2\2\2\u04da\u047f\3\2\2\2\u04da"+
		"\u0482\3\2\2\2\u04da\u0485\3\2\2\2\u04da\u0488\3\2\2\2\u04da\u048b\3\2"+
		"\2\2\u04da\u048e\3\2\2\2\u04da\u0491\3\2\2\2\u04da\u0494\3\2\2\2\u04da"+
		"\u0497\3\2\2\2\u04da\u049a\3\2\2\2\u04da\u049d\3\2\2\2\u04da\u04a1\3\2"+
		"\2\2\u04da\u04a5\3\2\2\2\u04da\u04a9\3\2\2\2\u04da\u04ad\3\2\2\2\u04da"+
		"\u04b1\3\2\2\2\u04da\u04b6\3\2\2\2\u04da\u04bb\3\2\2\2\u04da\u04be\3\2"+
		"\2\2\u04da\u04c1\3\2\2\2\u04da\u04c7\3\2\2\2\u04da\u04ce\3\2\2\2\u04da"+
		"\u04d0\3\2\2\2\u04da\u04d3\3\2\2\2\u04da\u04d7\3\2\2\2\u04db\u04de\3\2"+
		"\2\2\u04dc\u04da\3\2\2\2\u04dc\u04dd\3\2\2\2\u04dd]\3\2\2\2\u04de\u04dc"+
		"\3\2\2\2\u04df\u04e0\5\u00dan\2\u04e0_\3\2\2\2\u04e1\u04e7\5f\64\2\u04e2"+
		"\u04e7\5\u011e\u0090\2\u04e3\u04e7\5\u0120\u0091\2\u04e4\u04e7\5\u00d4"+
		"k\2\u04e5\u04e7\5\u011c\u008f\2\u04e6\u04e1\3\2\2\2\u04e6\u04e2\3\2\2"+
		"\2\u04e6\u04e3\3\2\2\2\u04e6\u04e4\3\2\2\2\u04e6\u04e5\3\2\2\2\u04e7a"+
		"\3\2\2\2\u04e8\u04e9\b\62\1\2\u04e9\u04ea\5`\61\2\u04ea\u04ef\3\2\2\2"+
		"\u04eb\u04ec\f\3\2\2\u04ec\u04ee\5h\65\2\u04ed\u04eb\3\2\2\2\u04ee\u04f1"+
		"\3\2\2\2\u04ef\u04ed\3\2\2\2\u04ef\u04f0\3\2\2\2\u04f0c\3\2\2\2\u04f1"+
		"\u04ef\3\2\2\2\u04f2\u04f3\b\63\1\2\u04f3\u04f4\7~\2\2\u04f4\u04f5\5\u00d4"+
		"k\2\u04f5\u04fa\3\2\2\2\u04f6\u04f7\f\3\2\2\u04f7\u04f9\5h\65\2\u04f8"+
		"\u04f6\3\2\2\2\u04f9\u04fc\3\2\2\2\u04fa\u04f8\3\2\2\2\u04fa\u04fb\3\2"+
		"\2\2\u04fbe\3\2\2\2\u04fc\u04fa\3\2\2\2\u04fd\u0506\5j\66\2\u04fe\u0506"+
		"\5l\67\2\u04ff\u0506\5z>\2\u0500\u0506\5\u0142\u00a2\2\u0501\u0506\5\u0144"+
		"\u00a3\2\u0502\u0506\5~@\2\u0503\u0506\5<\37\2\u0504\u0506\5n8\2\u0505"+
		"\u04fd\3\2\2\2\u0505\u04fe\3\2\2\2\u0505\u04ff\3\2\2\2\u0505\u0500\3\2"+
		"\2\2\u0505\u0501\3\2\2\2\u0505\u0502\3\2\2\2\u0505\u0503\3\2\2\2\u0505"+
		"\u0504\3\2\2\2\u0506g\3\2\2\2\u0507\u0508\7\25\2\2\u0508\u0514\5\u00d6"+
		"l\2\u0509\u050a\7\25\2\2\u050a\u0514\5<\37\2\u050b\u050c\7\30\2\2\u050c"+
		"\u050d\5\u0132\u009a\2\u050d\u050e\7\31\2\2\u050e\u0514\3\2\2\2\u050f"+
		"\u0510\7\30\2\2\u0510\u0511\5\\/\2\u0511\u0512\7\31\2\2\u0512\u0514\3"+
		"\2\2\2\u0513\u0507\3\2\2\2\u0513\u0509\3\2\2\2\u0513\u050b\3\2\2\2\u0513"+
		"\u050f\3\2\2\2\u0514i\3\2\2\2\u0515\u0516\7D\2\2\u0516\u0518\7\26\2\2"+
		"\u0517\u0519\5\\/\2\u0518\u0517\3\2\2\2\u0518\u0519\3\2\2\2\u0519\u051a"+
		"\3\2\2\2\u051a\u051b\7\27\2\2\u051bk\3\2\2\2\u051c\u051d\7C\2\2\u051d"+
		"\u051f\7\26\2\2\u051e\u0520\5\\/\2\u051f\u051e\3\2\2\2\u051f\u0520\3\2"+
		"\2\2\u0520\u0521\3\2\2\2\u0521\u0522\7\27\2\2\u0522m\3\2\2\2\u0523\u0524"+
		"\5\u00c2b\2\u0524\u0525\7\26\2\2\u0525\u0528\5p9\2\u0526\u0527\7\23\2"+
		"\2\u0527\u0529\5r:\2\u0528\u0526\3\2\2\2\u0528\u0529\3\2\2\2\u0529\u052a"+
		"\3\2\2\2\u052a\u052b\7\27\2\2\u052b\u0534\3\2\2\2\u052c\u052d\5\u00c2"+
		"b\2\u052d\u052f\7\26\2\2\u052e\u0530\5r:\2\u052f\u052e\3\2\2\2\u052f\u0530"+
		"\3\2\2\2\u0530\u0531\3\2\2\2\u0531\u0532\7\27\2\2\u0532\u0534\3\2\2\2"+
		"\u0533\u0523\3\2\2\2\u0533\u052c\3\2\2\2\u0534o\3\2\2\2\u0535\u0536\7"+
		"r\2\2\u0536\u0537\5\u0158\u00ad\2\u0537\u0538\5\\/\2\u0538\u0539\69$\3"+
		"\u0539q\3\2\2\2\u053a\u053b\b:\1\2\u053b\u053c\5\\/\2\u053c\u053d\6:%"+
		"\3\u053d\u0540\3\2\2\2\u053e\u0540\5t;\2\u053f\u053a\3\2\2\2\u053f\u053e"+
		"\3\2\2\2\u0540\u0546\3\2\2\2\u0541\u0542\f\3\2\2\u0542\u0543\7\23\2\2"+
		"\u0543\u0545\5t;\2\u0544\u0541\3\2\2\2\u0545\u0548\3\2\2\2\u0546\u0544"+
		"\3\2\2\2\u0546\u0547\3\2\2\2\u0547s\3\2\2\2\u0548\u0546\3\2\2\2\u0549"+
		"\u054d\5\u00d6l\2\u054a\u054b\5\u0158\u00ad\2\u054b\u054c\5\\/\2\u054c"+
		"\u054e\3\2\2\2\u054d\u054a\3\2\2\2\u054d\u054e\3\2\2\2\u054eu\3\2\2\2"+
		"\u054f\u0550\7\u00a6\2\2\u0550\u0551\5\\/\2\u0551\u0552\7\u009e\2\2\u0552"+
		"\u0553\5\\/\2\u0553w\3\2\2\2\u0554\u0557\7n\2\2\u0555\u0556\7\u00a2\2"+
		"\2\u0556\u0558\5\u00d6l\2\u0557\u0555\3\2\2\2\u0557\u0558\3\2\2\2\u0558"+
		"\u0559\3\2\2\2\u0559\u055a\7\u00a4\2\2\u055a\u055b\5\\/\2\u055by\3\2\2"+
		"\2\u055c\u055d\7m\2\2\u055d\u055f\7\u0085\2\2\u055e\u0560\5\u00c2b\2\u055f"+
		"\u055e\3\2\2\2\u055f\u0560\3\2\2\2\u0560\u0561\3\2\2\2\u0561\u0562\7\u00a4"+
		"\2\2\u0562\u057b\5\\/\2\u0563\u056a\7m\2\2\u0564\u056b\7L\2\2\u0565\u0566"+
		"\7\u0092\2\2\u0566\u0567\5\\/\2\u0567\u0568\7\u009e\2\2\u0568\u0569\5"+
		"\\/\2\u0569\u056b\3\2\2\2\u056a\u0564\3\2\2\2\u056a\u0565\3\2\2\2\u056b"+
		"\u056c\3\2\2\2\u056c\u056e\7\26\2\2\u056d\u056f\5\u00c2b\2\u056e\u056d"+
		"\3\2\2\2\u056e\u056f\3\2\2\2\u056f\u0570\3\2\2\2\u0570\u0573\7\27\2\2"+
		"\u0571\u0572\7\u00a4\2\2\u0572\u0574\5\\/\2\u0573\u0571\3\2\2\2\u0573"+
		"\u0574\3\2\2\2\u0574\u0578\3\2\2\2\u0575\u0576\7\u0089\2\2\u0576\u0577"+
		"\7W\2\2\u0577\u0579\5\u0146\u00a4\2\u0578\u0575\3\2\2\2\u0578\u0579\3"+
		"\2\2\2\u0579\u057b\3\2\2\2\u057a\u055c\3\2\2\2\u057a\u0563\3\2\2\2\u057b"+
		"{\3\2\2\2\u057c\u057d\7m\2\2\u057d\u057f\7\u0085\2\2\u057e\u0580\5\u00c2"+
		"b\2\u057f\u057e\3\2\2\2\u057f\u0580\3\2\2\2\u0580\u0581\3\2\2\2\u0581"+
		"\u0582\7\u00a4\2\2\u0582\u0583\5\\/\2\u0583\u0584\7\u009b\2\2\u0584\u0585"+
		"\7\u00a2\2\2\u0585\u0586\5\u00d6l\2\u0586\u0587\7\21\2\2\u0587\u0588\5"+
		"\u008cG\2\u0588\u0589\5\u010e\u0088\2\u0589\u058a\5\u008eH\2\u058a\u05ab"+
		"\3\2\2\2\u058b\u0592\7m\2\2\u058c\u0593\7L\2\2\u058d\u058e\7\u0092\2\2"+
		"\u058e\u058f\5\\/\2\u058f\u0590\7\u009e\2\2\u0590\u0591\5\\/\2\u0591\u0593"+
		"\3\2\2\2\u0592\u058c\3\2\2\2\u0592\u058d\3\2\2\2\u0593\u0594\3\2\2\2\u0594"+
		"\u0596\7\26\2\2\u0595\u0597\5\u00c2b\2\u0596\u0595\3\2\2\2\u0596\u0597"+
		"\3\2\2\2\u0597\u0598\3\2\2\2\u0598\u059b\7\27\2\2\u0599\u059a\7\u00a4"+
		"\2\2\u059a\u059c\5\\/\2\u059b\u0599\3\2\2\2\u059b\u059c\3\2\2\2\u059c"+
		"\u05a0\3\2\2\2\u059d\u059e\7\u0089\2\2\u059e\u059f\7W\2\2\u059f\u05a1"+
		"\5\u0146\u00a4\2\u05a0\u059d\3\2\2\2\u05a0\u05a1\3\2\2\2\u05a1\u05a2\3"+
		"\2\2\2\u05a2\u05a3\7\u009b\2\2\u05a3\u05a4\7\u00a2\2\2\u05a4\u05a5\5\u00d6"+
		"l\2\u05a5\u05a6\7\21\2\2\u05a6\u05a7\5\u008cG\2\u05a7\u05a8\5\u010e\u0088"+
		"\2\u05a8\u05a9\5\u008eH\2\u05a9\u05ab\3\2\2\2\u05aa\u057c\3\2\2\2\u05aa"+
		"\u058b\3\2\2\2\u05ab}\3\2\2\2\u05ac\u05ae\7\u0096\2\2\u05ad\u05af\7b\2"+
		"\2\u05ae\u05ad\3\2\2\2\u05ae\u05af\3\2\2\2\u05af\u05b0\3\2\2\2\u05b0\u05b1"+
		"\7\26\2\2\u05b1\u05b7\5b\62\2\u05b2\u05b3\7\23\2\2\u05b3\u05b4\5\u0150"+
		"\u00a9\2\u05b4\u05b5\7.\2\2\u05b5\u05b6\5\u0140\u00a1\2\u05b6\u05b8\3"+
		"\2\2\2\u05b7\u05b2\3\2\2\2\u05b7\u05b8\3\2\2\2\u05b8\u05b9\3\2\2\2\u05b9"+
		"\u05ba\7\27\2\2\u05ba\177\3\2\2\2\u05bb\u05bc\5\u0136\u009c\2\u05bc\u05bd"+
		"\5\u0158\u00ad\2\u05bd\u05be\5\\/\2\u05be\u0081\3\2\2\2\u05bf\u05c0\6"+
		"B\'\3\u05c0\u05c1\7\25\2\2\u05c1\u05c8\5\u00d6l\2\u05c2\u05c3\6B(\3\u05c3"+
		"\u05c4\7\30\2\2\u05c4\u05c5\5\\/\2\u05c5\u05c6\7\31\2\2\u05c6\u05c8\3"+
		"\2\2\2\u05c7\u05bf\3\2\2\2\u05c7\u05c2\3\2\2\2\u05c8\u0083\3\2\2\2\u05c9"+
		"\u05ca\5\u00fe\u0080\2\u05ca\u05cb\5\u0158\u00ad\2\u05cb\u05cc\5\\/\2"+
		"\u05cc\u0085\3\2\2\2\u05cd\u05cf\7\7\2\2\u05ce\u05cd\3\2\2\2\u05cf\u05d2"+
		"\3\2\2\2\u05d0\u05ce\3\2\2\2\u05d0\u05d1\3\2\2\2\u05d1\u0087\3\2\2\2\u05d2"+
		"\u05d0\3\2\2\2\u05d3\u05d5\7\7\2\2\u05d4\u05d3\3\2\2\2\u05d5\u05d6\3\2"+
		"\2\2\u05d6\u05d4\3\2\2\2\u05d6\u05d7\3\2\2\2\u05d7\u0089\3\2\2\2\u05d8"+
		"\u05da\t\4\2\2\u05d9\u05d8\3\2\2\2\u05da\u05dd\3\2\2\2\u05db\u05d9\3\2"+
		"\2\2\u05db\u05dc\3\2\2\2\u05dc\u008b\3\2\2\2\u05dd\u05db\3\2\2\2\u05de"+
		"\u05e0\7\7\2\2\u05df\u05de\3\2\2\2\u05e0\u05e1\3\2\2\2\u05e1\u05df\3\2"+
		"\2\2\u05e1\u05e2\3\2\2\2\u05e2\u05e3\3\2\2\2\u05e3\u05e4\7\3\2\2\u05e4"+
		"\u008d\3\2\2\2\u05e5\u05e7\7\7\2\2\u05e6\u05e5\3\2\2\2\u05e7\u05ea\3\2"+
		"\2\2\u05e8\u05e6\3\2\2\2\u05e8\u05e9\3\2\2\2\u05e9\u05eb\3\2\2\2\u05ea"+
		"\u05e8\3\2\2\2\u05eb\u05ec\7\4\2\2\u05ec\u008f\3\2\2\2\u05ed\u05ee\5\u00e8"+
		"u\2\u05ee\u0091\3\2\2\2\u05ef\u05f0\7\u0080\2\2\u05f0\u0093\3\2\2\2\u05f1"+
		"\u05f5\5\u009aN\2\u05f2\u05f5\5\66\34\2\u05f3\u05f5\5\\/\2\u05f4\u05f1"+
		"\3\2\2\2\u05f4\u05f2\3\2\2\2\u05f4\u05f3\3\2\2\2\u05f5\u0095\3\2\2\2\u05f6"+
		"\u05f8\5\u0098M\2\u05f7\u05f6\3\2\2\2\u05f7\u05f8\3\2\2\2\u05f8\u05f9"+
		"\3\2\2\2\u05f9\u05fa\5\u0086D\2\u05fa\u05fb\7\2\2\3\u05fb\u0097\3\2\2"+
		"\2\u05fc\u0602\5\u009aN\2\u05fd\u05fe\5\u0088E\2\u05fe\u05ff\5\u009aN"+
		"\2\u05ff\u0601\3\2\2\2\u0600\u05fd\3\2\2\2\u0601\u0604\3\2\2\2\u0602\u0600"+
		"\3\2\2\2\u0602\u0603\3\2\2\2\u0603\u0099\3\2\2\2\u0604\u0602\3\2\2\2\u0605"+
		"\u0606\5\u0104\u0083\2\u0606\u0607\5\u0088E\2\u0607\u0609\3\2\2\2\u0608"+
		"\u0605\3\2\2\2\u0609\u060c\3\2\2\2\u060a\u0608\3\2\2\2\u060a\u060b\3\2"+
		"\2\2\u060b\u0612\3\2\2\2\u060c\u060a\3\2\2\2\u060d\u060e\5\u009cO\2\u060e"+
		"\u060f\5\u0088E\2\u060f\u0611\3\2\2\2\u0610\u060d\3\2\2\2\u0611\u0614"+
		"\3\2\2\2\u0612\u0610\3\2\2\2\u0612\u0613\3\2\2\2\u0613\u061b\3\2\2\2\u0614"+
		"\u0612\3\2\2\2\u0615\u061c\5\n\6\2\u0616\u061c\5\u00c6d\2\u0617\u061c"+
		"\5\u00a6T\2\u0618\u061c\5\u00a8U\2\u0619\u061c\5\u00c8e\2\u061a\u061c"+
		"\5\u0102\u0082\2\u061b\u0615\3\2\2\2\u061b\u0616\3\2\2\2\u061b\u0617\3"+
		"\2\2\2\u061b\u0618\3\2\2\2\u061b\u0619\3\2\2\2\u061b\u061a\3\2\2\2\u061c"+
		"\u009b\3\2\2\2\u061d\u062c\5\u009eP\2\u061e\u0628\7\26\2\2\u061f\u0629"+
		"\5\u00a4S\2\u0620\u0625\5\u00a0Q\2\u0621\u0622\7\23\2\2\u0622\u0624\5"+
		"\u00a0Q\2\u0623\u0621\3\2\2\2\u0624\u0627\3\2\2\2\u0625\u0623\3\2\2\2"+
		"\u0625\u0626\3\2\2\2\u0626\u0629\3\2\2\2\u0627\u0625\3\2\2\2\u0628\u061f"+
		"\3\2\2\2\u0628\u0620\3\2\2\2\u0629\u062a\3\2\2\2\u062a\u062b\7\27\2\2"+
		"\u062b\u062d\3\2\2\2\u062c\u061e\3\2\2\2\u062c\u062d\3\2\2\2\u062d\u009d"+
		"\3\2\2\2\u062e\u062f\7\u00b0\2\2\u062f\u009f\3\2\2\2\u0630\u0631\5\u00a2"+
		"R\2\u0631\u0632\7.\2\2\u0632\u0633\5\u00a4S\2\u0633\u00a1\3\2\2\2\u0634"+
		"\u0635\t\5\2\2\u0635\u00a3\3\2\2\2\u0636\u0639\5\u0120\u0091\2\u0637\u0639"+
		"\5\u00bc_\2\u0638\u0636\3\2\2\2\u0638\u0637\3\2\2\2\u0639\u00a5\3\2\2"+
		"\2\u063a\u063b\5$\23\2\u063b\u00a7\3\2\2\2\u063c\u063f\5\2\2\2\u063d\u063f"+
		"\5\4\3\2\u063e\u063c\3\2\2\2\u063e\u063d\3\2\2\2\u063f\u00a9\3\2\2\2\u0640"+
		"\u0646\5\6\4\2\u0641\u0642\5\u0088E\2\u0642\u0643\5\6\4\2\u0643\u0645"+
		"\3\2\2\2\u0644\u0641\3\2\2\2\u0645\u0648\3\2\2\2\u0646\u0644\3\2\2\2\u0646"+
		"\u0647\3\2\2\2\u0647\u00ab\3\2\2\2\u0648\u0646\3\2\2\2\u0649\u064f\5\b"+
		"\5\2\u064a\u064b\5\u0088E\2\u064b\u064c\5\b\5\2\u064c\u064e\3\2\2\2\u064d"+
		"\u064a\3\2\2\2\u064e\u0651\3\2\2\2\u064f\u064d\3\2\2\2\u064f\u0650\3\2"+
		"\2\2\u0650\u00ad\3\2\2\2\u0651\u064f\3\2\2\2\u0652\u0657\5\u00dco\2\u0653"+
		"\u0654\7\23\2\2\u0654\u0656\5\u00dco\2\u0655\u0653\3\2\2\2\u0656\u0659"+
		"\3\2\2\2\u0657\u0655\3\2\2\2\u0657\u0658\3\2\2\2\u0658\u00af\3\2\2\2\u0659"+
		"\u0657\3\2\2\2\u065a\u065b\7v\2\2\u065b\u0665\5\u00b2Z\2\u065c\u065d\7"+
		"v\2\2\u065d\u0665\5\u00b4[\2\u065e\u065f\7v\2\2\u065f\u0665\5\u00b8]\2"+
		"\u0660\u0661\7z\2\2\u0661\u0665\7\u00b1\2\2\u0662\u0663\7z\2\2\u0663\u0665"+
		"\5\\/\2\u0664\u065a\3\2\2\2\u0664\u065c\3\2\2\2\u0664\u065e\3\2\2\2\u0664"+
		"\u0660\3\2\2\2\u0664\u0662\3\2\2\2\u0665\u00b1\3\2\2\2\u0666\u0668\7~"+
		"\2\2\u0667\u0666\3\2\2\2\u0667\u0668\3\2\2\2\u0668\u0669\3\2\2\2\u0669"+
		"\u066b\7\30\2\2\u066a\u066c\5\u00b6\\\2\u066b\u066a\3\2\2\2\u066b\u066c"+
		"\3\2\2\2\u066c\u066d\3\2\2\2\u066d\u066e\7\31\2\2\u066e\u00b3\3\2\2\2"+
		"\u066f\u0671\7~\2\2\u0670\u066f\3\2\2\2\u0670\u0671\3\2\2\2\u0671\u0672"+
		"\3\2\2\2\u0672\u0674\7*\2\2\u0673\u0675\5\u00b6\\\2\u0674\u0673\3\2\2"+
		"\2\u0674\u0675\3\2\2\2\u0675\u0676\3\2\2\2\u0676\u0677\7(\2\2\u0677\u00b5"+
		"\3\2\2\2\u0678\u067d\5\\/\2\u0679\u067a\7\23\2\2\u067a\u067c\5\\/\2\u067b"+
		"\u0679\3\2\2\2\u067c\u067f\3\2\2\2\u067d\u067b\3\2\2\2\u067d\u067e\3\2"+
		"\2\2\u067e\u00b7\3\2\2\2\u067f\u067d\3\2\2\2\u0680\u0681\7\30\2\2\u0681"+
		"\u0682\5\\/\2\u0682\u0683\7\24\2\2\u0683\u0684\5\\/\2\u0684\u0685\7\31"+
		"\2\2\u0685\u00b9\3\2\2\2\u0686\u0687\b^\1\2\u0687\u0693\5\u00bc_\2\u0688"+
		"\u0689\7H\2\2\u0689\u068a\7*\2\2\u068a\u068b\5\u00ba^\2\u068b\u068c\7"+
		"(\2\2\u068c\u0693\3\2\2\2\u068d\u068e\7G\2\2\u068e\u068f\7*\2\2\u068f"+
		"\u0690\5\u00ba^\2\u0690\u0691\7(\2\2\u0691\u0693\3\2\2\2\u0692\u0686\3"+
		"\2\2\2\u0692\u0688\3\2\2\2\u0692\u068d\3\2\2\2\u0693\u069d\3\2\2\2\u0694"+
		"\u0695\f\7\2\2\u0695\u069c\7,\2\2\u0696\u0697\f\6\2\2\u0697\u0698\7\30"+
		"\2\2\u0698\u069c\7\31\2\2\u0699\u069a\f\5\2\2\u069a\u069c\7-\2\2\u069b"+
		"\u0694\3\2\2\2\u069b\u0696\3\2\2\2\u069b\u0699\3\2\2\2\u069c\u069f\3\2"+
		"\2\2\u069d\u069b\3\2\2\2\u069d\u069e\3\2\2\2\u069e\u00bb\3\2\2\2\u069f"+
		"\u069d\3\2\2\2\u06a0\u06a3\5\u00be`\2\u06a1\u06a3\5\u00c0a\2\u06a2\u06a0"+
		"\3\2\2\2\u06a2\u06a1\3\2\2\2\u06a3\u00bd\3\2\2\2\u06a4\u06b6\7\66\2\2"+
		"\u06a5\u06b6\7\67\2\2\u06a6\u06b6\78\2\2\u06a7\u06b6\79\2\2\u06a8\u06b6"+
		"\7E\2\2\u06a9\u06b6\7:\2\2\u06aa\u06b6\7;\2\2\u06ab\u06b6\7C\2\2\u06ac"+
		"\u06b6\7<\2\2\u06ad\u06b6\7>\2\2\u06ae\u06b6\7=\2\2\u06af\u06b6\7?\2\2"+
		"\u06b0\u06b6\7@\2\2\u06b1\u06b6\7B\2\2\u06b2\u06b6\7D\2\2\u06b3\u06b6"+
		"\7F\2\2\u06b4\u06b6\7I\2\2\u06b5\u06a4\3\2\2\2\u06b5\u06a5\3\2\2\2\u06b5"+
		"\u06a6\3\2\2\2\u06b5\u06a7\3\2\2\2\u06b5\u06a8\3\2\2\2\u06b5\u06a9\3\2"+
		"\2\2\u06b5\u06aa\3\2\2\2\u06b5\u06ab\3\2\2\2\u06b5\u06ac\3\2\2\2\u06b5"+
		"\u06ad\3\2\2\2\u06b5\u06ae\3\2\2\2\u06b5\u06af\3\2\2\2\u06b5\u06b0\3\2"+
		"\2\2\u06b5\u06b1\3\2\2\2\u06b5\u06b2\3\2\2\2\u06b5\u06b3\3\2\2\2\u06b5"+
		"\u06b4\3\2\2\2\u06b6\u00bf\3\2\2\2\u06b7\u06b8\7\u00ac\2\2\u06b8\u00c1"+
		"\3\2\2\2\u06b9\u06bb\7~\2\2\u06ba\u06b9\3\2\2\2\u06ba\u06bb\3\2\2\2\u06bb"+
		"\u06bc\3\2\2\2\u06bc\u06bd\5\u00c0a\2\u06bd\u00c3\3\2\2\2\u06be\u06bf"+
		"\7B\2\2\u06bf\u00c5\3\2\2\2\u06c0\u06c4\5\22\n\2\u06c1\u06c4\5\"\22\2"+
		"\u06c2\u06c4\5\24\13\2\u06c3\u06c0\3\2\2\2\u06c3\u06c1\3\2\2\2\u06c3\u06c2"+
		"\3\2\2\2\u06c4\u00c7\3\2\2\2\u06c5\u06c8\5\16\b\2\u06c6\u06c8\5\20\t\2"+
		"\u06c7\u06c5\3\2\2\2\u06c7\u06c6\3\2\2\2\u06c8\u00c9\3\2\2\2\u06c9\u06ce"+
		"\5\u00dan\2\u06ca\u06cb\7\23\2\2\u06cb\u06cd\5\u00dan\2\u06cc\u06ca\3"+
		"\2\2\2\u06cd\u06d0\3\2\2\2\u06ce\u06cc\3\2\2\2\u06ce\u06cf\3\2\2\2\u06cf"+
		"\u00cb\3\2\2\2\u06d0\u06ce\3\2\2\2\u06d1\u06d4\5\u00d6l\2\u06d2\u06d4"+
		"\5\u00dan\2\u06d3\u06d1\3\2\2\2\u06d3\u06d2\3\2\2\2\u06d4\u00cd\3\2\2"+
		"\2\u06d5\u06d8\5\u00d4k\2\u06d6\u06d8\5\u014c\u00a7\2\u06d7\u06d5\3\2"+
		"\2\2\u06d7\u06d6\3\2\2\2\u06d8\u00cf\3\2\2\2\u06d9\u06da\6i,\3\u06da\u06db"+
		"\7#\2\2\u06db\u06dc\5\u00d2j\2\u06dc\u00d1\3\2\2\2\u06dd\u06de\6j-\3\u06de"+
		"\u06df\5\u00ceh\2\u06df\u00d3\3\2\2\2\u06e0\u06e4\5\u00d6l\2\u06e1\u06e4"+
		"\5\u00dan\2\u06e2\u06e4\5\u00dco\2\u06e3\u06e0\3\2\2\2\u06e3\u06e1\3\2"+
		"\2\2\u06e3\u06e2\3\2\2\2\u06e4\u00d5\3\2\2\2\u06e5\u06e6\7\u00ad\2\2\u06e6"+
		"\u00d7\3\2\2\2\u06e7\u06e8\t\6\2\2\u06e8\u00d9\3\2\2\2\u06e9\u06ea\7\u00ac"+
		"\2\2\u06ea\u00db\3\2\2\2\u06eb\u06ec\7\u00ab\2\2\u06ec\u00dd\3\2\2\2\u06ed"+
		"\u06f2\5\u00e0q\2\u06ee\u06ef\7\23\2\2\u06ef\u06f1\5\u00e0q\2\u06f0\u06ee"+
		"\3\2\2\2\u06f1\u06f4\3\2\2\2\u06f2\u06f0\3\2\2\2\u06f2\u06f3\3\2\2\2\u06f3"+
		"\u00df\3\2\2\2\u06f4\u06f2\3\2\2\2\u06f5\u06fb\5\u00e6t\2\u06f6\u06f8"+
		"\7~\2\2\u06f7\u06f6\3\2\2\2\u06f7\u06f8\3\2\2\2\u06f8\u06f9\3\2\2\2\u06f9"+
		"\u06fb\5\u00e2r\2\u06fa\u06f5\3\2\2\2\u06fa\u06f7\3\2\2\2\u06fb\u00e1"+
		"\3\2\2\2\u06fc\u06ff\5\u00e4s\2\u06fd\u06ff\5\64\33\2\u06fe\u06fc\3\2"+
		"\2\2\u06fe\u06fd\3\2\2\2\u06ff\u00e3\3\2\2\2\u0700\u0703\5\u00d6l\2\u0701"+
		"\u0702\7.\2\2\u0702\u0704\5\u0120\u0091\2\u0703\u0701\3\2\2\2\u0703\u0704"+
		"\3\2\2\2\u0704\u00e5\3\2\2\2\u0705\u0706\5\u00c4c\2\u0706\u0707\5\u00d6"+
		"l\2\u0707\u00e7\3\2\2\2\u0708\u070b\5\u00ba^\2\u0709\u070b\5\u00eav\2"+
		"\u070a\u0708\3\2\2\2\u070a\u0709\3\2\2\2\u070b\u00e9\3\2\2\2\u070c\u070d"+
		"\bv\1\2\u070d\u070e\7O\2\2\u070e\u0717\3\2\2\2\u070f\u0710\f\4\2\2\u0710"+
		"\u0711\7\30\2\2\u0711\u0716\7\31\2\2\u0712\u0713\f\3\2\2\u0713\u0714\7"+
		"\32\2\2\u0714\u0716\7\33\2\2\u0715\u070f\3\2\2\2\u0715\u0712\3\2\2\2\u0716"+
		"\u0719\3\2\2\2\u0717\u0715\3\2\2\2\u0717\u0718\3\2\2\2\u0718\u00eb\3\2"+
		"\2\2\u0719\u0717\3\2\2\2\u071a\u0720\5\u00eex\2\u071b\u071c\5\u0088E\2"+
		"\u071c\u071d\5\u00eex\2\u071d\u071f\3\2\2\2\u071e\u071b\3\2\2\2\u071f"+
		"\u0722\3\2\2\2\u0720\u071e\3\2\2\2\u0720\u0721\3\2\2\2\u0721\u00ed\3\2"+
		"\2\2\u0722\u0720\3\2\2\2\u0723\u0724\5\u0104\u0083\2\u0724\u0725\5\u0088"+
		"E\2\u0725\u0727\3\2\2\2\u0726\u0723\3\2\2\2\u0727\u072a\3\2\2\2\u0728"+
		"\u0726\3\2\2\2\u0728\u0729\3\2\2\2\u0729\u0730\3\2\2\2\u072a\u0728\3\2"+
		"\2\2\u072b\u072c\5\u009cO\2\u072c\u072d\5\u0088E\2\u072d\u072f\3\2\2\2"+
		"\u072e\u072b\3\2\2\2\u072f\u0732\3\2\2\2\u0730\u072e\3\2\2\2\u0730\u0731"+
		"\3\2\2\2\u0731\u0738\3\2\2\2\u0732\u0730\3\2\2\2\u0733\u0739\5\32\16\2"+
		"\u0734\u0739\5\36\20\2\u0735\u0739\5,\27\2\u0736\u0739\5*\26\2\u0737\u0739"+
		"\5\30\r\2\u0738\u0733\3\2\2\2\u0738\u0734\3\2\2\2\u0738\u0735\3\2\2\2"+
		"\u0738\u0736\3\2\2\2\u0738\u0737\3\2\2\2\u0739\u00ef\3\2\2\2\u073a\u0740"+
		"\5\u00f2z\2\u073b\u073c\5\u0088E\2\u073c\u073d\5\u00f2z\2\u073d\u073f"+
		"\3\2\2\2\u073e\u073b\3\2\2\2\u073f\u0742\3\2\2\2\u0740\u073e\3\2\2\2\u0740"+
		"\u0741\3\2\2\2\u0741\u00f1\3\2\2\2\u0742\u0740\3\2\2\2\u0743\u0747\5 "+
		"\21\2\u0744\u0747\5\34\17\2\u0745\u0747\5.\30\2\u0746\u0743\3\2\2\2\u0746"+
		"\u0744\3\2\2\2\u0746\u0745\3\2\2\2\u0747\u00f3\3\2\2\2\u0748\u0749\7\13"+
		"\2\2\u0749\u0753\5\u01ac\u00d7\2\u074a\u074b\7\f\2\2\u074b\u0753\5\u01c6"+
		"\u00e4\2\u074c\u074d\7\r\2\2\u074d\u0753\5\u00f6|\2\u074e\u074f\7\16\2"+
		"\2\u074f\u0753\5\u00f6|\2\u0750\u0751\7\17\2\2\u0751\u0753\5\u00fa~\2"+
		"\u0752\u0748\3\2\2\2\u0752\u074a\3\2\2\2\u0752\u074c\3\2\2\2\u0752\u074e"+
		"\3\2\2\2\u0752\u0750\3\2\2\2\u0753\u00f5\3\2\2\2\u0754\u0756\5\u00d4k"+
		"\2\u0755\u0757\5\u00f8}\2\u0756\u0755\3\2\2\2\u0756\u0757\3\2\2\2\u0757"+
		"\u00f7\3\2\2\2\u0758\u0759\7r\2\2\u0759\u075a\5\u0152\u00aa\2\u075a\u075b"+
		"\7\21\2\2\u075b\u0760\5\u0194\u00cb\2\u075c\u075d\7\25\2\2\u075d\u075f"+
		"\5\u0194\u00cb\2\u075e\u075c\3\2\2\2\u075f\u0762\3\2\2\2\u0760\u075e\3"+
		"\2\2\2\u0760\u0761\3\2\2\2\u0761\u00f9\3\2\2\2\u0762\u0760\3\2\2\2\u0763"+
		"\u0768\5\u017a\u00be\2\u0764\u0765\7\25\2\2\u0765\u0767\5\u017a\u00be"+
		"\2\u0766\u0764\3\2\2\2\u0767\u076a\3\2\2\2\u0768\u0766\3\2\2\2\u0768\u0769"+
		"\3\2\2\2\u0769\u076c\3\2\2\2\u076a\u0768\3\2\2\2\u076b\u076d\5\u00fc\177"+
		"\2\u076c\u076b\3\2\2\2\u076c\u076d\3\2\2\2\u076d\u00fb\3\2\2\2\u076e\u076f"+
		"\7r\2\2\u076f\u0770\5\u0152\u00aa\2\u0770\u0772\7\21\2\2\u0771\u0773\7"+
		"%\2\2\u0772\u0771\3\2\2\2\u0772\u0773\3\2\2\2\u0773\u0774\3\2\2\2\u0774"+
		"\u0779\5\u017a\u00be\2\u0775\u0776\7%\2\2\u0776\u0778\5\u017a\u00be\2"+
		"\u0777\u0775\3\2\2\2\u0778\u077b\3\2\2\2\u0779\u0777\3\2\2\2\u0779\u077a"+
		"\3\2\2\2\u077a\u077e\3\2\2\2\u077b\u0779\3\2\2\2\u077c\u077d\7\25\2\2"+
		"\u077d\u077f\5\u017a\u00be\2\u077e\u077c\3\2\2\2\u077e\u077f\3\2\2\2\u077f"+
		"\u00fd\3\2\2\2\u0780\u0785\5\u00d6l\2\u0781\u0782\7\23\2\2\u0782\u0784"+
		"\5\u00d6l\2\u0783\u0781\3\2\2\2\u0784\u0787\3\2\2\2\u0785\u0783\3\2\2"+
		"\2\u0785\u0786\3\2\2\2\u0786\u00ff\3\2\2\2\u0787\u0785\3\2\2\2\u0788\u078d"+
		"\5\u00d8m\2\u0789\u078a\7\23\2\2\u078a\u078c\5\u00d8m\2\u078b\u0789\3"+
		"\2\2\2\u078c\u078f\3\2\2\2\u078d\u078b\3\2\2\2\u078d\u078e\3\2\2\2\u078e"+
		"\u0101\3\2\2\2\u078f\u078d\3\2\2\2\u0790\u0795\5*\26\2\u0791\u0795\5,"+
		"\27\2\u0792\u0795\5.\30\2\u0793\u0795\5\60\31\2\u0794\u0790\3\2\2\2\u0794"+
		"\u0791\3\2\2\2\u0794\u0792\3\2\2\2\u0794\u0793\3\2\2\2\u0795\u0103\3\2"+
		"\2\2\u0796\u0797\7\n\2\2\u0797\u0105\3\2\2\2\u0798\u079e\5\u0108\u0085"+
		"\2\u0799\u079a\5\u0088E\2\u079a\u079b\5\u0108\u0085\2\u079b\u079d\3\2"+
		"\2\2\u079c\u0799\3\2\2\2\u079d\u07a0\3\2\2\2\u079e\u079c\3\2\2\2\u079e"+
		"\u079f\3\2\2\2\u079f\u0107\3\2\2\2\u07a0\u079e\3\2\2\2\u07a1\u07a2\7\13"+
		"\2\2\u07a2\u07ac\5\u0196\u00cc\2\u07a3\u07a4\7\f\2\2\u07a4\u07ac\5\u01b2"+
		"\u00da\2\u07a5\u07a6\7\r\2\2\u07a6\u07ac\5\u010a\u0086\2\u07a7\u07a8\7"+
		"\16\2\2\u07a8\u07ac\5\u010a\u0086\2\u07a9\u07aa\7\17\2\2\u07aa\u07ac\5"+
		"\u010c\u0087\2\u07ab\u07a1\3\2\2\2\u07ab\u07a3\3\2\2\2\u07ab\u07a5\3\2"+
		"\2\2\u07ab\u07a7\3\2\2\2\u07ab\u07a9\3\2\2\2\u07ac\u0109\3\2\2\2\u07ad"+
		"\u07af\5\u017c\u00bf\2\u07ae\u07b0\7\22\2\2\u07af\u07ae\3\2\2\2\u07af"+
		"\u07b0\3\2\2\2\u07b0\u07b2\3\2\2\2\u07b1\u07b3\5\u00f8}\2\u07b2\u07b1"+
		"\3\2\2\2\u07b2\u07b3\3\2\2\2\u07b3\u010b\3\2\2\2\u07b4\u07b6\5\u0162\u00b2"+
		"\2\u07b5\u07b7\7\22\2\2\u07b6\u07b5\3\2\2\2\u07b6\u07b7\3\2\2\2\u07b7"+
		"\u07b9\3\2\2\2\u07b8\u07ba\5\u00fc\177\2\u07b9\u07b8\3\2\2\2\u07b9\u07ba"+
		"\3\2\2\2\u07ba\u010d\3\2\2\2\u07bb\u07c1\5\66\34\2\u07bc\u07bd\5\u0088"+
		"E\2\u07bd\u07be\5\66\34\2\u07be\u07c0\3\2\2\2\u07bf\u07bc\3\2\2\2\u07c0"+
		"\u07c3\3\2\2\2\u07c1\u07bf\3\2\2\2\u07c1\u07c2\3\2\2\2\u07c2\u010f\3\2"+
		"\2\2\u07c3\u07c1\3\2\2\2\u07c4\u07ca\5\62\32\2\u07c5\u07c6\5\u0088E\2"+
		"\u07c6\u07c7\5\62\32\2\u07c7\u07c9\3\2\2\2\u07c8\u07c5\3\2\2\2\u07c9\u07cc"+
		"\3\2\2\2\u07ca\u07c8\3\2\2\2\u07ca\u07cb\3\2\2\2\u07cb\u0111\3\2\2\2\u07cc"+
		"\u07ca\3\2\2\2\u07cd\u07d3\5F$\2\u07ce\u07cf\5\u0088E\2\u07cf\u07d0\5"+
		"F$\2\u07d0\u07d2\3\2\2\2\u07d1\u07ce\3\2\2\2\u07d2\u07d5\3\2\2\2\u07d3"+
		"\u07d1\3\2\2\2\u07d3\u07d4\3\2\2\2\u07d4\u0113\3\2\2\2\u07d5\u07d3\3\2"+
		"\2\2\u07d6\u07dc\5V,\2\u07d7\u07d8\5\u0088E\2\u07d8\u07d9\5V,\2\u07d9"+
		"\u07db\3\2\2\2\u07da\u07d7\3\2\2\2\u07db\u07de\3\2\2\2\u07dc\u07da\3\2"+
		"\2\2\u07dc\u07dd\3\2\2\2\u07dd\u0115\3\2\2\2\u07de\u07dc\3\2\2\2\u07df"+
		"\u07e0\7\30\2\2\u07e0\u07e1\5\u0118\u008d\2\u07e1\u07e2\7\24\2\2\u07e2"+
		"\u07e3\5\u0118\u008d\2\u07e3\u07e4\7\31\2\2\u07e4\u07ee\3\2\2\2\u07e5"+
		"\u07e6\7\30\2\2\u07e6\u07e7\5\u011a\u008e\2\u07e7\u07e8\7\31\2\2\u07e8"+
		"\u07ee\3\2\2\2\u07e9\u07ea\7*\2\2\u07ea\u07eb\5\u011a\u008e\2\u07eb\u07ec"+
		"\7(\2\2\u07ec\u07ee\3\2\2\2\u07ed\u07df\3\2\2\2\u07ed\u07e5\3\2\2\2\u07ed"+
		"\u07e9\3\2\2\2\u07ee\u0117\3\2\2\2\u07ef\u0800\7\u00a9\2\2\u07f0\u0800"+
		"\7\u00aa\2\2\u07f1\u0800\7\u00b3\2\2\u07f2\u0800\7\u00b4\2\2\u07f3\u0800"+
		"\7\u00a8\2\2\u07f4\u0800\7\u00b8\2\2\u07f5\u0800\7\u00b7\2\2\u07f6\u0800"+
		"\7\u00b1\2\2\u07f7\u0800\7\u00b5\2\2\u07f8\u0800\7\u00b6\2\2\u07f9\u0800"+
		"\7\u00a7\2\2\u07fa\u0800\7\u00b9\2\2\u07fb\u0800\7\u00ba\2\2\u07fc\u0800"+
		"\7\u00b2\2\2\u07fd\u0800\5\u0090I\2\u07fe\u0800\5\u0092J\2\u07ff\u07ef"+
		"\3\2\2\2\u07ff\u07f0\3\2\2\2\u07ff\u07f1\3\2\2\2\u07ff\u07f2\3\2\2\2\u07ff"+
		"\u07f3\3\2\2\2\u07ff\u07f4\3\2\2\2\u07ff\u07f5\3\2\2\2\u07ff\u07f6\3\2"+
		"\2\2\u07ff\u07f7\3\2\2\2\u07ff\u07f8\3\2\2\2\u07ff\u07f9\3\2\2\2\u07ff"+
		"\u07fa\3\2\2\2\u07ff\u07fb\3\2\2\2\u07ff\u07fc\3\2\2\2\u07ff\u07fd\3\2"+
		"\2\2\u07ff\u07fe\3\2\2\2\u0800\u0119\3\2\2\2\u0801\u0806\5\u0118\u008d"+
		"\2\u0802\u0803\7\23\2\2\u0803\u0805\5\u0118\u008d\2\u0804\u0802\3\2\2"+
		"\2\u0805\u0808\3\2\2\2\u0806\u0804\3\2\2\2\u0806\u0807\3\2\2\2\u0807\u011b"+
		"\3\2\2\2\u0808\u0806\3\2\2\2\u0809\u080a\t\7\2\2\u080a\u011d\3\2\2\2\u080b"+
		"\u080c\7\26\2\2\u080c\u080d\5\\/\2\u080d\u080e\7\27\2\2\u080e\u011f\3"+
		"\2\2\2\u080f\u0812\5\u0118\u008d\2\u0810\u0812\5\u0122\u0092\2\u0811\u080f"+
		"\3\2\2\2\u0811\u0810\3\2\2\2\u0812\u0121\3\2\2\2\u0813\u081a\5\u00b8]"+
		"\2\u0814\u081a\5\u00b2Z\2\u0815\u081a\5\u00b4[\2\u0816\u081a\5\u0126\u0094"+
		"\2\u0817\u081a\5\u0128\u0095\2\u0818\u081a\5\u0124\u0093\2\u0819\u0813"+
		"\3\2\2\2\u0819\u0814\3\2\2\2\u0819\u0815\3\2\2\2\u0819\u0816\3\2\2\2\u0819"+
		"\u0817\3\2\2\2\u0819\u0818\3\2\2\2\u081a\u0123\3\2\2\2\u081b\u081d\7~"+
		"\2\2\u081c\u081b\3\2\2\2\u081c\u081d\3\2\2\2\u081d\u081e\3\2\2\2\u081e"+
		"\u0820\7\26\2\2\u081f\u0821\5\u012a\u0096\2\u0820\u081f\3\2\2\2\u0820"+
		"\u0821\3\2\2\2\u0821\u0822\3\2\2\2\u0822\u0823\7\27\2\2\u0823\u0125\3"+
		"\2\2\2\u0824\u0826\7~\2\2\u0825\u0824\3\2\2\2\u0825\u0826\3\2\2\2\u0826"+
		"\u082f\3\2\2\2\u0827\u0828\7*\2\2\u0828\u0829\5\u012c\u0097\2\u0829\u082a"+
		"\7(\2\2\u082a\u0830\3\2\2\2\u082b\u0830\7-\2\2\u082c\u082d\7*\2\2\u082d"+
		"\u082e\7\21\2\2\u082e\u0830\7(\2\2\u082f\u0827\3\2\2\2\u082f\u082b\3\2"+
		"\2\2\u082f\u082c\3\2\2\2\u0830\u0127\3\2\2\2\u0831\u0833\7\32\2\2\u0832"+
		"\u0834\5\u012c\u0097\2\u0833\u0832\3\2\2\2\u0833\u0834\3\2\2\2\u0834\u0835"+
		"\3\2\2\2\u0835\u0836\7\33\2\2\u0836\u0129\3\2\2\2\u0837\u0838\5\\/\2\u0838"+
		"\u0841\7\23\2\2\u0839\u083e\5\\/\2\u083a\u083b\7\23\2\2\u083b\u083d\5"+
		"\\/\2\u083c\u083a\3\2\2\2\u083d\u0840\3\2\2\2\u083e\u083c\3\2\2\2\u083e"+
		"\u083f\3\2\2\2\u083f\u0842\3\2\2\2\u0840\u083e\3\2\2\2\u0841\u0839\3\2"+
		"\2\2\u0841\u0842\3\2\2\2\u0842\u012b\3\2\2\2\u0843\u0848\5\u012e\u0098"+
		"\2\u0844\u0845\7\23\2\2\u0845\u0847\5\u012e\u0098\2\u0846\u0844\3\2\2"+
		"\2\u0847\u084a\3\2\2\2\u0848\u0846\3\2\2\2\u0848\u0849\3\2\2\2\u0849\u012d"+
		"\3\2\2\2\u084a\u0848\3\2\2\2\u084b\u084c\5\u0130\u0099\2\u084c\u084d\7"+
		"\21\2\2\u084d\u084e\5\\/\2\u084e\u012f\3\2\2\2\u084f\u0852\5\u00ceh\2"+
		"\u0850\u0852\7\u00b1\2\2\u0851\u084f\3\2\2\2\u0851\u0850\3\2\2\2\u0852"+
		"\u0131\3\2\2\2\u0853\u0854\5\\/\2\u0854\u0855\7\21\2\2\u0855\u0856\5\\"+
		"/\2\u0856\u085d\3\2\2\2\u0857\u0858\5\\/\2\u0858\u0859\7\21\2\2\u0859"+
		"\u085d\3\2\2\2\u085a\u085b\7\21\2\2\u085b\u085d\5\\/\2\u085c\u0853\3\2"+
		"\2\2\u085c\u0857\3\2\2\2\u085c\u085a\3\2\2\2\u085d\u0133\3\2\2\2\u085e"+
		"\u085f\5\u00d6l\2\u085f\u0860\5\u0158\u00ad\2\u0860\u0861\5\\/\2\u0861"+
		"\u0135\3\2\2\2\u0862\u0863\b\u009c\1\2\u0863\u0864\5\u00d6l\2\u0864\u0869"+
		"\3\2\2\2\u0865\u0866\f\3\2\2\u0866\u0868\5\u0082B\2\u0867\u0865\3\2\2"+
		"\2\u0868\u086b\3\2\2\2\u0869\u0867\3\2\2\2\u0869\u086a\3\2\2\2\u086a\u0137"+
		"\3\2\2\2\u086b\u0869\3\2\2\2\u086c\u086d\6\u009d\61\3\u086d\u086e\7\u00ad"+
		"\2\2\u086e\u0871\5\u00e8u\2\u086f\u0871\5\\/\2\u0870\u086c\3\2\2\2\u0870"+
		"\u086f\3\2\2\2\u0871\u0139\3\2\2\2\u0872\u0873\5\u013c\u009f\2\u0873\u0874"+
		"\5\\/\2\u0874\u087b\3\2\2\2\u0875\u0876\5\u013c\u009f\2\u0876\u0877\7"+
		"\32\2\2\u0877\u0878\5\u010e\u0088\2\u0878\u0879\7\33\2\2\u0879\u087b\3"+
		"\2\2\2\u087a\u0872\3\2\2\2\u087a\u0875\3\2\2\2\u087b\u013b\3\2\2\2\u087c"+
		"\u087d\5\u013e\u00a0\2\u087d\u087e\5\u008aF\2\u087e\u087f\7\65\2\2\u087f"+
		"\u0880\5\u008aF\2\u0880\u013d\3\2\2\2\u0881\u0888\5\u00d6l\2\u0882\u0884"+
		"\7\26\2\2\u0883\u0885\5\u00fe\u0080\2\u0884\u0883\3\2\2\2\u0884\u0885"+
		"\3\2\2\2\u0885\u0886\3\2\2\2\u0886\u0888\7\27\2\2\u0887\u0881\3\2\2\2"+
		"\u0887\u0882\3\2\2\2\u0888\u013f\3\2\2\2\u0889\u088c\5b\62\2\u088a\u088c"+
		"\5\u013a\u009e\2\u088b\u0889\3\2\2\2\u088b\u088a\3\2\2\2\u088c\u0141\3"+
		"\2\2\2\u088d\u088e\7\u008d\2\2\u088e\u088f\7L\2\2\u088f\u0890\7r\2\2\u0890"+
		"\u0891\5\\/\2\u0891\u0143\3\2\2\2\u0892\u0893\7\u008d\2\2\u0893\u0894"+
		"\7\u0085\2\2\u0894\u0895\7r\2\2\u0895\u0896\5\\/\2\u0896\u0145\3\2\2\2"+
		"\u0897\u089c\5\u0148\u00a5\2\u0898\u0899\7\23\2\2\u0899\u089b\5\u0148"+
		"\u00a5\2\u089a\u0898\3\2\2\2\u089b\u089e\3\2\2\2\u089c\u089a\3\2\2\2\u089c"+
		"\u089d\3\2\2\2\u089d\u0147\3\2\2\2\u089e\u089c\3\2\2\2\u089f\u08a4\5\u00d6"+
		"l\2\u08a0\u08a1\7\25\2\2\u08a1\u08a3\5\u00d6l\2\u08a2\u08a0\3\2\2\2\u08a3"+
		"\u08a6\3\2\2\2\u08a4\u08a2\3\2\2\2\u08a4\u08a5\3\2\2\2\u08a5\u08a8\3\2"+
		"\2\2\u08a6\u08a4\3\2\2\2\u08a7\u08a9\t\b\2\2\u08a8\u08a7\3\2\2\2\u08a8"+
		"\u08a9\3\2\2\2\u08a9\u0149\3\2\2\2\u08aa\u08b1\7\"\2\2\u08ab\u08b1\7#"+
		"\2\2\u08ac\u08b1\5\u015a\u00ae\2\u08ad\u08b1\5\u015c\u00af\2\u08ae\u08b1"+
		"\5\u015e\u00b0\2\u08af\u08b1\5\u0160\u00b1\2\u08b0\u08aa\3\2\2\2\u08b0"+
		"\u08ab\3\2\2\2\u08b0\u08ac\3\2\2\2\u08b0\u08ad\3\2\2\2\u08b0\u08ae\3\2"+
		"\2\2\u08b0\u08af\3\2\2\2\u08b1\u014b\3\2\2\2\u08b2\u08b3\t\t\2\2\u08b3"+
		"\u014d\3\2\2\2\u08b4\u08b5\7\u00ad\2\2\u08b5\u08b6\6\u00a8\62\3\u08b6"+
		"\u014f\3\2\2\2\u08b7\u08b8\7\u00ad\2\2\u08b8\u08b9\6\u00a9\63\3\u08b9"+
		"\u0151\3\2\2\2\u08ba\u08bb\7\u00ad\2\2\u08bb\u08bc\6\u00aa\64\3\u08bc"+
		"\u0153\3\2\2\2\u08bd\u08be\7\u00ad\2\2\u08be\u08bf\6\u00ab\65\3\u08bf"+
		"\u0155\3\2\2\2\u08c0\u08c1\7\u00ad\2\2\u08c1\u08c2\6\u00ac\66\3\u08c2"+
		"\u0157\3\2\2\2\u08c3\u08c4\7.\2\2\u08c4\u0159\3\2\2\2\u08c5\u08c6\7$\2"+
		"\2\u08c6\u015b\3\2\2\2\u08c7\u08c8\7%\2\2\u08c8\u015d\3\2\2\2\u08c9\u08ca"+
		"\7&\2\2\u08ca\u015f\3\2\2\2\u08cb\u08cc\t\n\2\2\u08cc\u0161\3\2\2\2\u08cd"+
		"\u08ce\7\u0090\2\2\u08ce\u08cf\5\u0164\u00b3\2\u08cf\u08d0\7\22\2\2\u08d0"+
		"\u08d5\3\2\2\2\u08d1\u08d2\5\u0164\u00b3\2\u08d2\u08d3\7\22\2\2\u08d3"+
		"\u08d5\3\2\2\2\u08d4\u08cd\3\2\2\2\u08d4\u08d1\3\2\2\2\u08d5\u0163\3\2"+
		"\2\2\u08d6\u08d7\b\u00b3\1\2\u08d7\u08d8\5\u0166\u00b4\2\u08d8\u08dd\3"+
		"\2\2\2\u08d9\u08da\f\3\2\2\u08da\u08dc\5\u016c\u00b7\2\u08db\u08d9\3\2"+
		"\2\2\u08dc\u08df\3\2\2\2\u08dd\u08db\3\2\2\2\u08dd\u08de\3\2\2\2\u08de"+
		"\u0165\3\2\2\2\u08df\u08dd\3\2\2\2\u08e0\u08e8\5\u0168\u00b5\2\u08e1\u08e8"+
		"\5\u016a\u00b6\2\u08e2\u08e8\5\u0174\u00bb\2\u08e3\u08e8\5\u0176\u00bc"+
		"\2\u08e4\u08e8\5\u0178\u00bd\2\u08e5\u08e8\5\u016e\u00b8\2\u08e6\u08e8"+
		"\5\u0172\u00ba\2\u08e7\u08e0\3\2\2\2\u08e7\u08e1\3\2\2\2\u08e7\u08e2\3"+
		"\2\2\2\u08e7\u08e3\3\2\2\2\u08e7\u08e4\3\2\2\2\u08e7\u08e5\3\2\2\2\u08e7"+
		"\u08e6\3\2\2\2\u08e8\u0167\3\2\2\2\u08e9\u08ea\5\u011c\u008f\2\u08ea\u0169"+
		"\3\2\2\2\u08eb\u08ec\5\u014e\u00a8\2\u08ec\u08ed\5\u016e\u00b8\2\u08ed"+
		"\u016b\3\2\2\2\u08ee\u08ef\7\25\2\2\u08ef\u08f4\5\u016e\u00b8\2\u08f0"+
		"\u08f1\7\25\2\2\u08f1\u08f4\5\u017a\u00be\2\u08f2\u08f4\5\u0172\u00ba"+
		"\2\u08f3\u08ee\3\2\2\2\u08f3\u08f0\3\2\2\2\u08f3\u08f2\3\2\2\2\u08f4\u016d"+
		"\3\2\2\2\u08f5\u08f6\5\u017a\u00be\2\u08f6\u08f8\7\26\2\2\u08f7\u08f9"+
		"\5\u0170\u00b9\2\u08f8\u08f7\3\2\2\2\u08f8\u08f9\3\2\2\2\u08f9\u08fa\3"+
		"\2\2\2\u08fa\u08fb\7\27\2\2\u08fb\u016f\3\2\2\2\u08fc\u08fd\b\u00b9\1"+
		"\2\u08fd\u08fe\5\u0164\u00b3\2\u08fe\u0904\3\2\2\2\u08ff\u0900\f\3\2\2"+
		"\u0900\u0901\7\23\2\2\u0901\u0903\5\u0164\u00b3\2\u0902\u08ff\3\2\2\2"+
		"\u0903\u0906\3\2\2\2\u0904\u0902\3\2\2\2\u0904\u0905\3\2\2\2\u0905\u0171"+
		"\3\2\2\2\u0906\u0904\3\2\2\2\u0907\u0908\7\30\2\2\u0908\u0909\5\u0164"+
		"\u00b3\2\u0909\u090a\7\31\2\2\u090a\u0173\3\2\2\2\u090b\u090c\7\26\2\2"+
		"\u090c\u090d\5\u0164\u00b3\2\u090d\u090e\7\27\2\2\u090e\u0175\3\2\2\2"+
		"\u090f\u0910\5\u017a\u00be\2\u0910\u0177\3\2\2\2\u0911\u0917\7\u00b3\2"+
		"\2\u0912\u0917\7\u00b5\2\2\u0913\u0917\7\u00b1\2\2\u0914\u0917\7\u00a7"+
		"\2\2\u0915\u0917\7\u00a8\2\2\u0916\u0911\3\2\2\2\u0916\u0912\3\2\2\2\u0916"+
		"\u0913\3\2\2\2\u0916\u0914\3\2\2\2\u0916\u0915\3\2\2\2\u0917\u0179\3\2"+
		"\2\2\u0918\u0919\t\13\2\2\u0919\u017b\3\2\2\2\u091a\u091b\7\u0090\2\2"+
		"\u091b\u091e\5\u017e\u00c0\2\u091c\u091e\5\u017e\u00c0\2\u091d\u091a\3"+
		"\2\2\2\u091d\u091c\3\2\2\2\u091e\u017d\3\2\2\2\u091f\u0920\b\u00c0\1\2"+
		"\u0920\u0921\5\u0180\u00c1\2\u0921\u0926\3\2\2\2\u0922\u0923\f\3\2\2\u0923"+
		"\u0925\5\u0184\u00c3\2\u0924\u0922\3\2\2\2\u0925\u0928\3\2\2\2\u0926\u0924"+
		"\3\2\2\2\u0926\u0927\3\2\2\2\u0927\u017f\3\2\2\2\u0928\u0926\3\2\2\2\u0929"+
		"\u092f\5\u0182\u00c2\2\u092a\u092f\5\u018e\u00c8\2\u092b\u092f\5\u0190"+
		"\u00c9\2\u092c\u092f\5\u0192\u00ca\2\u092d\u092f\5\u0186\u00c4\2\u092e"+
		"\u0929\3\2\2\2\u092e\u092a\3\2\2\2\u092e\u092b\3\2\2\2\u092e\u092c\3\2"+
		"\2\2\u092e\u092d\3\2\2\2\u092f\u0181\3\2\2\2\u0930\u0931\5\u011c\u008f"+
		"\2\u0931\u0183\3\2\2\2\u0932\u0933\7\25\2\2\u0933\u0939\5\u0186\u00c4"+
		"\2\u0934\u0935\7\30\2\2\u0935\u0936\5\u017e\u00c0\2\u0936\u0937\7\31\2"+
		"\2\u0937\u0939\3\2\2\2\u0938\u0932\3\2\2\2\u0938\u0934\3\2\2\2\u0939\u0185"+
		"\3\2\2\2\u093a\u093b\5\u0194\u00cb\2\u093b\u093d\7\26\2\2\u093c\u093e"+
		"\5\u0188\u00c5\2\u093d\u093c\3\2\2\2\u093d\u093e\3\2\2\2\u093e\u093f\3"+
		"\2\2\2\u093f\u0940\7\27\2\2\u0940\u0187\3\2\2\2\u0941\u0948\5\u018a\u00c6"+
		"\2\u0942\u0948\5\u018c\u00c7\2\u0943\u0944\5\u018a\u00c6\2\u0944\u0945"+
		"\7\23\2\2\u0945\u0946\5\u018c\u00c7\2\u0946\u0948\3\2\2\2\u0947\u0941"+
		"\3\2\2\2\u0947\u0942\3\2\2\2\u0947\u0943\3\2\2\2\u0948\u0189\3\2\2\2\u0949"+
		"\u094a\b\u00c6\1\2\u094a\u094b\5\u017e\u00c0\2\u094b\u0951\3\2\2\2\u094c"+
		"\u094d\f\3\2\2\u094d\u094e\7\23\2\2\u094e\u0950\5\u017e\u00c0\2\u094f"+
		"\u094c\3\2\2\2\u0950\u0953\3\2\2\2\u0951\u094f\3\2\2\2\u0951\u0952\3\2"+
		"\2\2\u0952\u018b\3\2\2\2\u0953\u0951\3\2\2\2\u0954\u0955\b\u00c7\1\2\u0955"+
		"\u0956\5\u0194\u00cb\2\u0956\u0957\7.\2\2\u0957\u0958\5\u017e\u00c0\2"+
		"\u0958\u0961\3\2\2\2\u0959\u095a\f\3\2\2\u095a\u095b\7\23\2\2\u095b\u095c"+
		"\5\u0194\u00cb\2\u095c\u095d\7.\2\2\u095d\u095e\5\u017e\u00c0\2\u095e"+
		"\u0960\3\2\2\2\u095f\u0959\3\2\2\2\u0960\u0963\3\2\2\2\u0961\u095f\3\2"+
		"\2\2\u0961\u0962\3\2\2\2\u0962\u018d\3\2\2\2\u0963\u0961\3\2\2\2\u0964"+
		"\u0965\7\26\2\2\u0965\u0966\5\u017e\u00c0\2\u0966\u0967\7\27\2\2\u0967"+
		"\u018f\3\2\2\2\u0968\u0969\b\u00c9\1\2\u0969\u096c\7\u00af\2\2\u096a\u096c"+
		"\5\u0194\u00cb\2\u096b\u0968\3\2\2\2\u096b\u096a\3\2\2\2\u096c\u0972\3"+
		"\2\2\2\u096d\u096e\f\3\2\2\u096e\u096f\7\25\2\2\u096f\u0971\5\u0194\u00cb"+
		"\2\u0970\u096d\3\2\2\2\u0971\u0974\3\2\2\2\u0972\u0970\3\2\2\2\u0972\u0973"+
		"\3\2\2\2\u0973\u0191\3\2\2\2\u0974\u0972\3\2\2\2\u0975\u097b\7\u00b3\2"+
		"\2\u0976\u097b\7\u00b5\2\2\u0977\u097b\7\u00b1\2\2\u0978\u097b\7\u00a7"+
		"\2\2\u0979\u097b\7\u00a8\2\2\u097a\u0975\3\2\2\2\u097a\u0976\3\2\2\2\u097a"+
		"\u0977\3\2\2\2\u097a\u0978\3\2\2\2\u097a\u0979\3\2\2\2\u097b\u0193\3\2"+
		"\2\2\u097c\u097d\t\f\2\2\u097d\u0195\3\2\2\2\u097e\u097f\7\u0090\2\2\u097f"+
		"\u0980\5\u0198\u00cd\2\u0980\u0981\7\22\2\2\u0981\u0986\3\2\2\2\u0982"+
		"\u0983\5\u0198\u00cd\2\u0983\u0984\7\22\2\2\u0984\u0986\3\2\2\2\u0985"+
		"\u097e\3\2\2\2\u0985\u0982\3\2\2\2\u0986\u0197\3\2\2\2\u0987\u0988\b\u00cd"+
		"\1\2\u0988\u0989\5\u019a\u00ce\2\u0989\u098e\3\2\2\2\u098a\u098b\f\3\2"+
		"\2\u098b\u098d\5\u01a0\u00d1\2\u098c\u098a\3\2\2\2\u098d\u0990\3\2\2\2"+
		"\u098e\u098c\3\2\2\2\u098e\u098f\3\2\2\2\u098f\u0199\3\2\2\2\u0990\u098e"+
		"\3\2\2\2\u0991\u0997\5\u019c\u00cf\2\u0992\u0997\5\u019e\u00d0\2\u0993"+
		"\u0997\5\u01a8\u00d5\2\u0994\u0997\5\u01aa\u00d6\2\u0995\u0997\5\u01ae"+
		"\u00d8\2\u0996\u0991\3\2\2\2\u0996\u0992\3\2\2\2\u0996\u0993\3\2\2\2\u0996"+
		"\u0994\3\2\2\2\u0996\u0995\3\2\2\2\u0997\u019b\3\2\2\2\u0998\u0999\5\u011c"+
		"\u008f\2\u0999\u019d\3\2\2\2\u099a\u099b\5\u014e\u00a8\2\u099b\u099c\5"+
		"\u01a2\u00d2\2\u099c\u019f\3\2\2\2\u099d\u099e\7\25\2\2\u099e\u09a1\5"+
		"\u01a2\u00d2\2\u099f\u09a1\5\u01a6\u00d4\2\u09a0\u099d\3\2\2\2\u09a0\u099f"+
		"\3\2\2\2\u09a1\u01a1\3\2\2\2\u09a2\u09a3\5\u01b0\u00d9\2\u09a3\u09a5\7"+
		"\26\2\2\u09a4\u09a6\5\u01a4\u00d3\2\u09a5\u09a4\3\2\2\2\u09a5\u09a6\3"+
		"\2\2\2\u09a6\u09a7\3\2\2\2\u09a7\u09a8\7\27\2\2\u09a8\u01a3\3\2\2\2\u09a9"+
		"\u09aa\b\u00d3\1\2\u09aa\u09ab\5\u0198\u00cd\2\u09ab\u09b1\3\2\2\2\u09ac"+
		"\u09ad\f\3\2\2\u09ad\u09ae\7\23\2\2\u09ae\u09b0\5\u0198\u00cd\2\u09af"+
		"\u09ac\3\2\2\2\u09b0\u09b3\3\2\2\2\u09b1\u09af\3\2\2\2\u09b1\u09b2\3\2"+
		"\2\2\u09b2\u01a5\3\2\2\2\u09b3\u09b1\3\2\2\2\u09b4\u09b5\7\30\2\2\u09b5"+
		"\u09b6\5\u0198\u00cd\2\u09b6\u09b7";
	private static final String _serializedATNSegment1 =
		"\7\31\2\2\u09b7\u01a7\3\2\2\2\u09b8\u09b9\7\26\2\2\u09b9\u09ba\5\u0198"+
		"\u00cd\2\u09ba\u09bb\7\27\2\2\u09bb\u01a9\3\2\2\2\u09bc\u09bd\b\u00d6"+
		"\1\2\u09bd\u09be\5\u01b0\u00d9\2\u09be\u09c4\3\2\2\2\u09bf\u09c0\f\3\2"+
		"\2\u09c0\u09c1\7\25\2\2\u09c1\u09c3\5\u01b0\u00d9\2\u09c2\u09bf\3\2\2"+
		"\2\u09c3\u09c6\3\2\2\2\u09c4\u09c2\3\2\2\2\u09c4\u09c5\3\2\2\2\u09c5\u01ab"+
		"\3\2\2\2\u09c6\u09c4\3\2\2\2\u09c7\u09c8\b\u00d7\1\2\u09c8\u09c9\5\u01aa"+
		"\u00d6\2\u09c9\u09ce\3\2\2\2\u09ca\u09cb\f\3\2\2\u09cb\u09cd\7\u00af\2"+
		"\2\u09cc\u09ca\3\2\2\2\u09cd\u09d0\3\2\2\2\u09ce\u09cc\3\2\2\2\u09ce\u09cf"+
		"\3\2\2\2\u09cf\u01ad\3\2\2\2\u09d0\u09ce\3\2\2\2\u09d1\u09d7\7\u00b3\2"+
		"\2\u09d2\u09d7\7\u00b5\2\2\u09d3\u09d7\7\u00b1\2\2\u09d4\u09d7\7\u00a7"+
		"\2\2\u09d5\u09d7\7\u00a8\2\2\u09d6\u09d1\3\2\2\2\u09d6\u09d2\3\2\2\2\u09d6"+
		"\u09d3\3\2\2\2\u09d6\u09d4\3\2\2\2\u09d6\u09d5\3\2\2\2\u09d7\u01af\3\2"+
		"\2\2\u09d8\u09d9\t\r\2\2\u09d9\u01b1\3\2\2\2\u09da\u09db\7\u0090\2\2\u09db"+
		"\u09dc\5\u01b4\u00db\2\u09dc\u09dd\7\22\2\2\u09dd\u09e2\3\2\2\2\u09de"+
		"\u09df\5\u01b4\u00db\2\u09df\u09e0\7\22\2\2\u09e0\u09e2\3\2\2\2\u09e1"+
		"\u09da\3\2\2\2\u09e1\u09de\3\2\2\2\u09e2\u01b3\3\2\2\2\u09e3\u09e4\b\u00db"+
		"\1\2\u09e4\u09e5\5\u01b6\u00dc\2\u09e5\u09ea\3\2\2\2\u09e6\u09e7\f\3\2"+
		"\2\u09e7\u09e9\5\u01bc\u00df\2\u09e8\u09e6\3\2\2\2\u09e9\u09ec\3\2\2\2"+
		"\u09ea\u09e8\3\2\2\2\u09ea\u09eb\3\2\2\2\u09eb\u01b5\3\2\2\2\u09ec\u09ea"+
		"\3\2\2\2\u09ed\u09f3\5\u01b8\u00dd\2\u09ee\u09f3\5\u01ba\u00de\2\u09ef"+
		"\u09f3\5\u01c4\u00e3\2\u09f0\u09f3\5\u01c6\u00e4\2\u09f1\u09f3\5\u01c8"+
		"\u00e5\2\u09f2\u09ed\3\2\2\2\u09f2\u09ee\3\2\2\2\u09f2\u09ef\3\2\2\2\u09f2"+
		"\u09f0\3\2\2\2\u09f2\u09f1\3\2\2\2\u09f3\u01b7\3\2\2\2\u09f4\u09f5\5\u011c"+
		"\u008f\2\u09f5\u01b9\3\2\2\2\u09f6\u09f7\5\u014e\u00a8\2\u09f7\u09f8\5"+
		"\u01be\u00e0\2\u09f8\u01bb\3\2\2\2\u09f9\u09fa\7\25\2\2\u09fa\u09fd\5"+
		"\u01be\u00e0\2\u09fb\u09fd\5\u01c2\u00e2\2\u09fc\u09f9\3\2\2\2\u09fc\u09fb"+
		"\3\2\2\2\u09fd\u01bd\3\2\2\2\u09fe\u09ff\5\u01ca\u00e6\2\u09ff\u0a01\7"+
		"\26\2\2\u0a00\u0a02\5\u01c0\u00e1\2\u0a01\u0a00\3\2\2\2\u0a01\u0a02\3"+
		"\2\2\2\u0a02\u0a03\3\2\2\2\u0a03\u0a04\7\27\2\2\u0a04\u01bf\3\2\2\2\u0a05"+
		"\u0a06\b\u00e1\1\2\u0a06\u0a07\5\u01b4\u00db\2\u0a07\u0a0d\3\2\2\2\u0a08"+
		"\u0a09\f\3\2\2\u0a09\u0a0a\7\23\2\2\u0a0a\u0a0c\5\u01b4\u00db\2\u0a0b"+
		"\u0a08\3\2\2\2\u0a0c\u0a0f\3\2\2\2\u0a0d\u0a0b\3\2\2\2\u0a0d\u0a0e\3\2"+
		"\2\2\u0a0e\u01c1\3\2\2\2\u0a0f\u0a0d\3\2\2\2\u0a10\u0a11\7\30\2\2\u0a11"+
		"\u0a12\5\u01b4\u00db\2\u0a12\u0a13\7\31\2\2\u0a13\u01c3\3\2\2\2\u0a14"+
		"\u0a15\7\26\2\2\u0a15\u0a16\5\u01b4\u00db\2\u0a16\u0a17\7\27\2\2\u0a17"+
		"\u01c5\3\2\2\2\u0a18\u0a19\b\u00e4\1\2\u0a19\u0a1c\7\u00af\2\2\u0a1a\u0a1c"+
		"\5\u01ca\u00e6\2\u0a1b\u0a18\3\2\2\2\u0a1b\u0a1a\3\2\2\2\u0a1c\u0a22\3"+
		"\2\2\2\u0a1d\u0a1e\f\3\2\2\u0a1e\u0a1f\7\25\2\2\u0a1f\u0a21\5\u01ca\u00e6"+
		"\2\u0a20\u0a1d\3\2\2\2\u0a21\u0a24\3\2\2\2\u0a22\u0a20\3\2\2\2\u0a22\u0a23"+
		"\3\2\2\2\u0a23\u01c7\3\2\2\2\u0a24\u0a22\3\2\2\2\u0a25\u0a2b\7\u00b3\2"+
		"\2\u0a26\u0a2b\7\u00b5\2\2\u0a27\u0a2b\7\u00b1\2\2\u0a28\u0a2b\7\u00a7"+
		"\2\2\u0a29\u0a2b\7\u00a8\2\2\u0a2a\u0a25\3\2\2\2\u0a2a\u0a26\3\2\2\2\u0a2a"+
		"\u0a27\3\2\2\2\u0a2a\u0a28\3\2\2\2\u0a2a\u0a29\3\2\2\2\u0a2b\u01c9\3\2"+
		"\2\2\u0a2c\u0a2d\t\16\2\2\u0a2d\u01cb\3\2\2\2\u0a2e\u0a31\5\u01ce\u00e8"+
		"\2\u0a2f\u0a31\5\u01d0\u00e9\2\u0a30\u0a2e\3\2\2\2\u0a30\u0a2f\3\2\2\2"+
		"\u0a31\u01cd\3\2\2\2\u0a32\u0a3a\5\u01d6\u00ec\2\u0a33\u0a35\5\u01d8\u00ed"+
		"\2\u0a34\u0a36\5\u01e4\u00f3\2\u0a35\u0a34\3\2\2\2\u0a35\u0a36\3\2\2\2"+
		"\u0a36\u0a37\3\2\2\2\u0a37\u0a38\5\u01da\u00ee\2\u0a38\u0a3a\3\2\2\2\u0a39"+
		"\u0a32\3\2\2\2\u0a39\u0a33\3\2\2\2\u0a3a\u01cf\3\2\2\2\u0a3b\u0a3c\5\u01d2"+
		"\u00ea\2\u0a3c\u0a3e\5\u008aF\2\u0a3d\u0a3f\5\u01e4\u00f3\2\u0a3e\u0a3d"+
		"\3\2\2\2\u0a3e\u0a3f\3\2\2\2\u0a3f\u0a40\3\2\2\2\u0a40\u0a41\5\u008aF"+
		"\2\u0a41\u0a42\5\u01d4\u00eb\2\u0a42\u01d1\3\2\2\2\u0a43\u0a44\7*\2\2"+
		"\u0a44\u0a47\7(\2\2\u0a45\u0a47\7,\2\2\u0a46\u0a43\3\2\2\2\u0a46\u0a45"+
		"\3\2\2\2\u0a47\u01d3\3\2\2\2\u0a48\u0a49\7*\2\2\u0a49\u0a4a\7%\2\2\u0a4a"+
		"\u0a4b\7(\2\2\u0a4b\u01d5\3\2\2\2\u0a4c\u0a4d\7*\2\2\u0a4d\u0a4e\5\u01dc"+
		"\u00ef\2\u0a4e\u0a52\5\u008aF\2\u0a4f\u0a51\5\u01e0\u00f1\2\u0a50\u0a4f"+
		"\3\2\2\2\u0a51\u0a54\3\2\2\2\u0a52\u0a50\3\2\2\2\u0a52\u0a53\3\2\2\2\u0a53"+
		"\u0a55\3\2\2\2\u0a54\u0a52\3\2\2\2\u0a55\u0a56\7%\2\2\u0a56\u0a57\7(\2"+
		"\2\u0a57\u01d7\3\2\2\2\u0a58\u0a59\7*\2\2\u0a59\u0a5a\5\u01dc\u00ef\2"+
		"\u0a5a\u0a5e\5\u008aF\2\u0a5b\u0a5d\5\u01e0\u00f1\2\u0a5c\u0a5b\3\2\2"+
		"\2\u0a5d\u0a60\3\2\2\2\u0a5e\u0a5c\3\2\2\2\u0a5e\u0a5f\3\2\2\2\u0a5f\u0a61"+
		"\3\2\2\2\u0a60\u0a5e\3\2\2\2\u0a61\u0a62\7(\2\2\u0a62\u01d9\3\2\2\2\u0a63"+
		"\u0a64\7*\2\2\u0a64\u0a65\7%\2\2\u0a65\u0a66\5\u01dc\u00ef\2\u0a66\u0a67"+
		"\7(\2\2\u0a67\u01db\3\2\2\2\u0a68\u0a6d\5\u01de\u00f0\2\u0a69\u0a6a\7"+
		"\25\2\2\u0a6a\u0a6c\5\u01de\u00f0\2\u0a6b\u0a69\3\2\2\2\u0a6c\u0a6f\3"+
		"\2\2\2\u0a6d\u0a6b\3\2\2\2\u0a6d\u0a6e\3\2\2\2\u0a6e\u01dd\3\2\2\2\u0a6f"+
		"\u0a6d\3\2\2\2\u0a70\u0a74\5\u00ceh\2\u0a71\u0a73\5\u00d0i\2\u0a72\u0a71"+
		"\3\2\2\2\u0a73\u0a76\3\2\2\2\u0a74\u0a72\3\2\2\2\u0a74\u0a75\3\2\2\2\u0a75"+
		"\u01df\3\2\2\2\u0a76\u0a74\3\2\2\2\u0a77\u0a7a\5\u01de\u00f0\2\u0a78\u0a79"+
		"\7.\2\2\u0a79\u0a7b\5\u01e2\u00f2\2\u0a7a\u0a78\3\2\2\2\u0a7a\u0a7b\3"+
		"\2\2\2\u0a7b\u0a7c\3\2\2\2\u0a7c\u0a7d\5\u008aF\2\u0a7d\u01e1\3\2\2\2"+
		"\u0a7e\u0a84\7\u00b1\2\2\u0a7f\u0a80\7\32\2\2\u0a80\u0a81\5\\/\2\u0a81"+
		"\u0a82\7\33\2\2\u0a82\u0a84\3\2\2\2\u0a83\u0a7e\3\2\2\2\u0a83\u0a7f\3"+
		"\2\2\2\u0a84\u01e3\3\2\2\2\u0a85\u0a87\5\u01e6\u00f4\2\u0a86\u0a85\3\2"+
		"\2\2\u0a87\u0a88\3\2\2\2\u0a88\u0a86\3\2\2\2\u0a88\u0a89\3\2\2\2\u0a89"+
		"\u01e5\3\2\2\2\u0a8a\u0a92\5\u01e8\u00f5\2\u0a8b\u0a92\5\u01ce\u00e8\2"+
		"\u0a8c\u0a8e\7\32\2\2\u0a8d\u0a8f\5\\/\2\u0a8e\u0a8d\3\2\2\2\u0a8e\u0a8f"+
		"\3\2\2\2\u0a8f\u0a90\3\2\2\2\u0a90\u0a92\7\33\2\2\u0a91\u0a8a\3\2\2\2"+
		"\u0a91\u0a8b\3\2\2\2\u0a91\u0a8c\3\2\2\2\u0a92\u01e7\3\2\2\2\u0a93\u0a95"+
		"\n\17\2\2\u0a94\u0a93\3\2\2\2\u0a95\u0a96\3\2\2\2\u0a96\u0a94\3\2\2\2"+
		"\u0a96\u0a97\3\2\2\2\u0a97\u01e9\3\2\2\2\u0a98\u0a9a\7\32\2\2\u0a99\u0a9b"+
		"\5\u01ec\u00f7\2\u0a9a\u0a99\3\2\2\2\u0a9b\u0a9c\3\2\2\2\u0a9c\u0a9a\3"+
		"\2\2\2\u0a9c\u0a9d\3\2\2\2\u0a9d\u0a9e\3\2\2\2\u0a9e\u0a9f\7\33\2\2\u0a9f"+
		"\u01eb\3\2\2\2\u0aa0\u0aa1\5\u01ee\u00f8\2\u0aa1\u0aa2\7\21\2\2\u0aa2"+
		"\u0aa3\5\u01f0\u00f9\2\u0aa3\u0aa4\7\22\2\2\u0aa4\u01ed\3\2\2\2\u0aa5"+
		"\u0aa6\b\u00f8\1\2\u0aa6\u0aaa\5\u00ceh\2\u0aa7\u0aa8\7#\2\2\u0aa8\u0aaa"+
		"\5\u00d2j\2\u0aa9\u0aa5\3\2\2\2\u0aa9\u0aa7\3\2\2\2\u0aaa\u0ab3\3\2\2"+
		"\2\u0aab\u0aad\f\3\2\2\u0aac\u0aae\5\u00d0i\2\u0aad\u0aac\3\2\2\2\u0aae"+
		"\u0aaf\3\2\2\2\u0aaf\u0aad\3\2\2\2\u0aaf\u0ab0\3\2\2\2\u0ab0\u0ab2\3\2"+
		"\2\2\u0ab1\u0aab\3\2\2\2\u0ab2\u0ab5\3\2\2\2\u0ab3\u0ab1\3\2\2\2\u0ab3"+
		"\u0ab4\3\2\2\2\u0ab4\u01ef\3\2\2\2\u0ab5\u0ab3\3\2\2\2\u0ab6\u0ab7\7\32"+
		"\2\2\u0ab7\u0ab8\5\\/\2\u0ab8\u0ab9\7\33\2\2\u0ab9\u0abc\3\2\2\2\u0aba"+
		"\u0abc\5\u01f2\u00fa\2\u0abb\u0ab6\3\2\2\2\u0abb\u0aba\3\2\2\2\u0abc\u01f1"+
		"\3\2\2\2\u0abd\u0abf\n\20\2\2\u0abe\u0abd\3\2\2\2\u0abf\u0ac0\3\2\2\2"+
		"\u0ac0\u0abe\3\2\2\2\u0ac0\u0ac1\3\2\2\2\u0ac1\u01f3\3\2\2\2\u00f5\u01fa"+
		"\u01fd\u0216\u021b\u0229\u022f\u0231\u0233\u0237\u023c\u0244\u024b\u025c"+
		"\u0267\u026e\u0272\u027d\u028b\u029f\u02b6\u02c1\u02c8\u02d1\u02d6\u02dd"+
		"\u02e6\u02fb\u0303\u0308\u030e\u0313\u0319\u031f\u0324\u0329\u0341\u034c"+
		"\u0350\u0366\u0376\u037d\u0385\u038a\u0391\u0397\u039e\u03bb\u03ce\u03d4"+
		"\u03f6\u03ff\u0416\u0424\u042d\u0436\u044d\u0453\u046a\u04da\u04dc\u04e6"+
		"\u04ef\u04fa\u0505\u0513\u0518\u051f\u0528\u052f\u0533\u053f\u0546\u054d"+
		"\u0557\u055f\u056a\u056e\u0573\u0578\u057a\u057f\u0592\u0596\u059b\u05a0"+
		"\u05aa\u05ae\u05b7\u05c7\u05d0\u05d6\u05db\u05e1\u05e8\u05f4\u05f7\u0602"+
		"\u060a\u0612\u061b\u0625\u0628\u062c\u0638\u063e\u0646\u064f\u0657\u0664"+
		"\u0667\u066b\u0670\u0674\u067d\u0692\u069b\u069d\u06a2\u06b5\u06ba\u06c3"+
		"\u06c7\u06ce\u06d3\u06d7\u06e3\u06f2\u06f7\u06fa\u06fe\u0703\u070a\u0715"+
		"\u0717\u0720\u0728\u0730\u0738\u0740\u0746\u0752\u0756\u0760\u0768\u076c"+
		"\u0772\u0779\u077e\u0785\u078d\u0794\u079e\u07ab\u07af\u07b2\u07b6\u07b9"+
		"\u07c1\u07ca\u07d3\u07dc\u07ed\u07ff\u0806\u0811\u0819\u081c\u0820\u0825"+
		"\u082f\u0833\u083e\u0841\u0848\u0851\u085c\u0869\u0870\u087a\u0884\u0887"+
		"\u088b\u089c\u08a4\u08a8\u08b0\u08d4\u08dd\u08e7\u08f3\u08f8\u0904\u0916"+
		"\u091d\u0926\u092e\u0938\u093d\u0947\u0951\u0961\u096b\u0972\u097a\u0985"+
		"\u098e\u0996\u09a0\u09a5\u09b1\u09c4\u09ce\u09d6\u09e1\u09ea\u09f2\u09fc"+
		"\u0a01\u0a0d\u0a1b\u0a22\u0a2a\u0a30\u0a35\u0a39\u0a3e\u0a46\u0a52\u0a5e"+
		"\u0a6d\u0a74\u0a7a\u0a83\u0a88\u0a8e\u0a91\u0a96\u0a9c\u0aa9\u0aaf\u0ab3"+
		"\u0abb\u0ac0";
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