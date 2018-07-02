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
		LT=40, LTE=41, LTGT=42, EQ=43, XEQ=44, EQ2=45, TEQ=46, TILDE=47, LARROW=48, 
		RARROW=49, BOOLEAN=50, CHARACTER=51, TEXT=52, INTEGER=53, DECIMAL=54, 
		DATE=55, TIME=56, DATETIME=57, PERIOD=58, VERSION=59, METHOD_T=60, CODE=61, 
		DOCUMENT=62, BLOB=63, IMAGE=64, UUID=65, ITERATOR=66, CURSOR=67, HTML=68, 
		ABSTRACT=69, ALL=70, ALWAYS=71, AND=72, ANY=73, AS=74, ASC=75, ATTR=76, 
		ATTRIBUTE=77, ATTRIBUTES=78, BINDINGS=79, BREAK=80, BY=81, CASE=82, CATCH=83, 
		CATEGORY=84, CLASS=85, CLOSE=86, CONTAINS=87, DEF=88, DEFAULT=89, DEFINE=90, 
		DELETE=91, DESC=92, DO=93, DOING=94, EACH=95, ELSE=96, ENUM=97, ENUMERATED=98, 
		EXCEPT=99, EXECUTE=100, EXPECTING=101, EXTENDS=102, FETCH=103, FILTERED=104, 
		FINALLY=105, FLUSH=106, FOR=107, FROM=108, GETTER=109, HAS=110, IF=111, 
		IN=112, INDEX=113, INVOKE=114, IS=115, MATCHING=116, METHOD=117, METHODS=118, 
		MODULO=119, MUTABLE=120, NATIVE=121, NONE=122, NOT=123, NOTHING=124, NULL=125, 
		ON=126, ONE=127, OPEN=128, OPERATOR=129, OR=130, ORDER=131, OTHERWISE=132, 
		PASS=133, RAISE=134, READ=135, RECEIVING=136, RESOURCE=137, RETURN=138, 
		RETURNING=139, ROWS=140, SELF=141, SETTER=142, SINGLETON=143, SORTED=144, 
		STORABLE=145, STORE=146, SWITCH=147, TEST=148, THIS=149, THROW=150, TO=151, 
		TRY=152, VERIFYING=153, WIDGET=154, WITH=155, WHEN=156, WHERE=157, WHILE=158, 
		WRITE=159, BOOLEAN_LITERAL=160, CHAR_LITERAL=161, MIN_INTEGER=162, MAX_INTEGER=163, 
		SYMBOL_IDENTIFIER=164, TYPE_IDENTIFIER=165, VARIABLE_IDENTIFIER=166, NATIVE_IDENTIFIER=167, 
		DOLLAR_IDENTIFIER=168, TEXT_LITERAL=169, UUID_LITERAL=170, INTEGER_LITERAL=171, 
		HEXA_LITERAL=172, DECIMAL_LITERAL=173, DATETIME_LITERAL=174, TIME_LITERAL=175, 
		DATE_LITERAL=176, PERIOD_LITERAL=177, VERSION_LITERAL=178;
	public static final int
		RULE_enum_category_declaration = 0, RULE_enum_native_declaration = 1, 
		RULE_native_symbol = 2, RULE_category_symbol = 3, RULE_attribute_declaration = 4, 
		RULE_index_clause = 5, RULE_concrete_widget_declaration = 6, RULE_concrete_category_declaration = 7, 
		RULE_singleton_category_declaration = 8, RULE_derived_list = 9, RULE_operator_method_declaration = 10, 
		RULE_setter_method_declaration = 11, RULE_native_setter_declaration = 12, 
		RULE_getter_method_declaration = 13, RULE_native_getter_declaration = 14, 
		RULE_native_category_declaration = 15, RULE_native_resource_declaration = 16, 
		RULE_native_category_bindings = 17, RULE_native_category_binding_list = 18, 
		RULE_abstract_method_declaration = 19, RULE_concrete_method_declaration = 20, 
		RULE_native_method_declaration = 21, RULE_test_method_declaration = 22, 
		RULE_assertion = 23, RULE_typed_argument = 24, RULE_statement = 25, RULE_flush_statement = 26, 
		RULE_store_statement = 27, RULE_method_call = 28, RULE_method_selector = 29, 
		RULE_callable_parent = 30, RULE_callable_selector = 31, RULE_with_resource_statement = 32, 
		RULE_with_singleton_statement = 33, RULE_switch_statement = 34, RULE_switch_case_statement = 35, 
		RULE_for_each_statement = 36, RULE_do_while_statement = 37, RULE_while_statement = 38, 
		RULE_if_statement = 39, RULE_else_if_statement_list = 40, RULE_raise_statement = 41, 
		RULE_try_statement = 42, RULE_catch_statement = 43, RULE_break_statement = 44, 
		RULE_return_statement = 45, RULE_expression = 46, RULE_closure_expression = 47, 
		RULE_instance_expression = 48, RULE_method_expression = 49, RULE_instance_selector = 50, 
		RULE_blob_expression = 51, RULE_document_expression = 52, RULE_constructor_expression = 53, 
		RULE_copy_from = 54, RULE_argument_assignment_list = 55, RULE_argument_assignment = 56, 
		RULE_write_statement = 57, RULE_filtered_list_suffix = 58, RULE_fetch_store_expression = 59, 
		RULE_sorted_expression = 60, RULE_assign_instance_statement = 61, RULE_child_instance = 62, 
		RULE_assign_tuple_statement = 63, RULE_lfs = 64, RULE_lfp = 65, RULE_indent = 66, 
		RULE_dedent = 67, RULE_null_literal = 68, RULE_declaration_list = 69, 
		RULE_declarations = 70, RULE_declaration = 71, RULE_resource_declaration = 72, 
		RULE_enum_declaration = 73, RULE_native_symbol_list = 74, RULE_category_symbol_list = 75, 
		RULE_symbol_list = 76, RULE_attribute_constraint = 77, RULE_list_literal = 78, 
		RULE_set_literal = 79, RULE_expression_list = 80, RULE_range_literal = 81, 
		RULE_typedef = 82, RULE_primary_type = 83, RULE_native_type = 84, RULE_category_type = 85, 
		RULE_mutable_category_type = 86, RULE_code_type = 87, RULE_category_declaration = 88, 
		RULE_widget_declaration = 89, RULE_type_identifier_list = 90, RULE_method_identifier = 91, 
		RULE_identifier_or_keyword = 92, RULE_nospace_hyphen_identifier_or_keyword = 93, 
		RULE_nospace_identifier_or_keyword = 94, RULE_identifier = 95, RULE_variable_identifier = 96, 
		RULE_attribute_identifier = 97, RULE_type_identifier = 98, RULE_symbol_identifier = 99, 
		RULE_argument_list = 100, RULE_argument = 101, RULE_operator_argument = 102, 
		RULE_named_argument = 103, RULE_code_argument = 104, RULE_category_or_any_type = 105, 
		RULE_any_type = 106, RULE_member_method_declaration_list = 107, RULE_member_method_declaration = 108, 
		RULE_native_member_method_declaration_list = 109, RULE_native_member_method_declaration = 110, 
		RULE_native_category_binding = 111, RULE_python_category_binding = 112, 
		RULE_python_module = 113, RULE_javascript_category_binding = 114, RULE_javascript_module = 115, 
		RULE_variable_identifier_list = 116, RULE_attribute_identifier_list = 117, 
		RULE_method_declaration = 118, RULE_comment_statement = 119, RULE_native_statement_list = 120, 
		RULE_native_statement = 121, RULE_python_native_statement = 122, RULE_javascript_native_statement = 123, 
		RULE_statement_list = 124, RULE_assertion_list = 125, RULE_switch_case_statement_list = 126, 
		RULE_catch_statement_list = 127, RULE_literal_collection = 128, RULE_atomic_literal = 129, 
		RULE_literal_list_literal = 130, RULE_selectable_expression = 131, RULE_this_expression = 132, 
		RULE_parenthesis_expression = 133, RULE_literal_expression = 134, RULE_collection_literal = 135, 
		RULE_tuple_literal = 136, RULE_dict_literal = 137, RULE_expression_tuple = 138, 
		RULE_dict_entry_list = 139, RULE_dict_entry = 140, RULE_slice_arguments = 141, 
		RULE_assign_variable_statement = 142, RULE_assignable_instance = 143, 
		RULE_is_expression = 144, RULE_read_all_expression = 145, RULE_read_one_expression = 146, 
		RULE_order_by_list = 147, RULE_order_by = 148, RULE_operator = 149, RULE_keyword = 150, 
		RULE_new_token = 151, RULE_key_token = 152, RULE_module_token = 153, RULE_value_token = 154, 
		RULE_symbols_token = 155, RULE_assign = 156, RULE_multiply = 157, RULE_divide = 158, 
		RULE_idivide = 159, RULE_modulo = 160, RULE_native_widget_declaration = 161, 
		RULE_javascript_statement = 162, RULE_javascript_expression = 163, RULE_javascript_primary_expression = 164, 
		RULE_javascript_this_expression = 165, RULE_javascript_new_expression = 166, 
		RULE_javascript_selector_expression = 167, RULE_javascript_method_expression = 168, 
		RULE_javascript_arguments = 169, RULE_javascript_item_expression = 170, 
		RULE_javascript_parenthesis_expression = 171, RULE_javascript_identifier_expression = 172, 
		RULE_javascript_literal_expression = 173, RULE_javascript_identifier = 174, 
		RULE_python_statement = 175, RULE_python_expression = 176, RULE_python_primary_expression = 177, 
		RULE_python_self_expression = 178, RULE_python_selector_expression = 179, 
		RULE_python_method_expression = 180, RULE_python_argument_list = 181, 
		RULE_python_ordinal_argument_list = 182, RULE_python_named_argument_list = 183, 
		RULE_python_parenthesis_expression = 184, RULE_python_identifier_expression = 185, 
		RULE_python_literal_expression = 186, RULE_python_identifier = 187, RULE_java_statement = 188, 
		RULE_java_expression = 189, RULE_java_primary_expression = 190, RULE_java_this_expression = 191, 
		RULE_java_new_expression = 192, RULE_java_selector_expression = 193, RULE_java_method_expression = 194, 
		RULE_java_arguments = 195, RULE_java_item_expression = 196, RULE_java_parenthesis_expression = 197, 
		RULE_java_identifier_expression = 198, RULE_java_class_identifier_expression = 199, 
		RULE_java_literal_expression = 200, RULE_java_identifier = 201, RULE_csharp_statement = 202, 
		RULE_csharp_expression = 203, RULE_csharp_primary_expression = 204, RULE_csharp_this_expression = 205, 
		RULE_csharp_new_expression = 206, RULE_csharp_selector_expression = 207, 
		RULE_csharp_method_expression = 208, RULE_csharp_arguments = 209, RULE_csharp_item_expression = 210, 
		RULE_csharp_parenthesis_expression = 211, RULE_csharp_identifier_expression = 212, 
		RULE_csharp_literal_expression = 213, RULE_csharp_identifier = 214, RULE_jsx_expression = 215, 
		RULE_jsx_element = 216, RULE_jsx_fragment = 217, RULE_jsx_fragment_start = 218, 
		RULE_jsx_fragment_end = 219, RULE_jsx_self_closing = 220, RULE_jsx_opening = 221, 
		RULE_jsx_closing = 222, RULE_jsx_element_name = 223, RULE_jsx_identifier = 224, 
		RULE_jsx_attribute = 225, RULE_jsx_attribute_value = 226, RULE_jsx_children = 227, 
		RULE_jsx_child = 228, RULE_jsx_text = 229, RULE_css_expression = 230, 
		RULE_css_field = 231, RULE_css_identifier = 232, RULE_css_value = 233, 
		RULE_css_text = 234;
	public static final String[] ruleNames = {
		"enum_category_declaration", "enum_native_declaration", "native_symbol", 
		"category_symbol", "attribute_declaration", "index_clause", "concrete_widget_declaration", 
		"concrete_category_declaration", "singleton_category_declaration", "derived_list", 
		"operator_method_declaration", "setter_method_declaration", "native_setter_declaration", 
		"getter_method_declaration", "native_getter_declaration", "native_category_declaration", 
		"native_resource_declaration", "native_category_bindings", "native_category_binding_list", 
		"abstract_method_declaration", "concrete_method_declaration", "native_method_declaration", 
		"test_method_declaration", "assertion", "typed_argument", "statement", 
		"flush_statement", "store_statement", "method_call", "method_selector", 
		"callable_parent", "callable_selector", "with_resource_statement", "with_singleton_statement", 
		"switch_statement", "switch_case_statement", "for_each_statement", "do_while_statement", 
		"while_statement", "if_statement", "else_if_statement_list", "raise_statement", 
		"try_statement", "catch_statement", "break_statement", "return_statement", 
		"expression", "closure_expression", "instance_expression", "method_expression", 
		"instance_selector", "blob_expression", "document_expression", "constructor_expression", 
		"copy_from", "argument_assignment_list", "argument_assignment", "write_statement", 
		"filtered_list_suffix", "fetch_store_expression", "sorted_expression", 
		"assign_instance_statement", "child_instance", "assign_tuple_statement", 
		"lfs", "lfp", "indent", "dedent", "null_literal", "declaration_list", 
		"declarations", "declaration", "resource_declaration", "enum_declaration", 
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
		"selectable_expression", "this_expression", "parenthesis_expression", 
		"literal_expression", "collection_literal", "tuple_literal", "dict_literal", 
		"expression_tuple", "dict_entry_list", "dict_entry", "slice_arguments", 
		"assign_variable_statement", "assignable_instance", "is_expression", "read_all_expression", 
		"read_one_expression", "order_by_list", "order_by", "operator", "keyword", 
		"new_token", "key_token", "module_token", "value_token", "symbols_token", 
		"assign", "multiply", "divide", "idivide", "modulo", "native_widget_declaration", 
		"javascript_statement", "javascript_expression", "javascript_primary_expression", 
		"javascript_this_expression", "javascript_new_expression", "javascript_selector_expression", 
		"javascript_method_expression", "javascript_arguments", "javascript_item_expression", 
		"javascript_parenthesis_expression", "javascript_identifier_expression", 
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
		"'>='", "'<'", "'<='", "'<>'", "'='", "'!='", "'=='", "'~='", "'~'", "'<-'", 
		"'->'", "'Boolean'", "'Character'", "'Text'", "'Integer'", "'Decimal'", 
		"'Date'", "'Time'", "'DateTime'", "'Period'", "'Version'", "'Method'", 
		"'Code'", "'Document'", "'Blob'", "'Image'", "'Uuid'", "'Iterator'", "'Cursor'", 
		"'Html'", "'abstract'", "'all'", "'always'", "'and'", "'any'", "'as'", 
		null, "'attr'", "'attribute'", "'attributes'", "'bindings'", "'break'", 
		"'by'", "'case'", "'catch'", "'category'", "'class'", "'close'", "'contains'", 
		"'def'", "'default'", "'define'", "'delete'", null, "'do'", "'doing'", 
		"'each'", "'else'", "'enum'", "'enumerated'", "'except'", "'execute'", 
		"'expecting'", "'extends'", "'fetch'", "'filtered'", "'finally'", "'flush'", 
		"'for'", "'from'", "'getter'", "'has'", "'if'", "'in'", "'index'", "'invoke'", 
		"'is'", "'matching'", "'method'", "'methods'", "'modulo'", "'mutable'", 
		"'native'", "'None'", "'not'", null, "'null'", "'on'", "'one'", "'open'", 
		"'operator'", "'or'", "'order'", "'otherwise'", "'pass'", "'raise'", "'read'", 
		"'receiving'", "'resource'", "'return'", "'returning'", "'rows'", "'self'", 
		"'setter'", "'singleton'", "'sorted'", "'storable'", "'store'", "'switch'", 
		"'test'", "'this'", "'throw'", "'to'", "'try'", "'verifying'", "'widget'", 
		"'with'", "'when'", "'where'", "'while'", "'write'", null, null, "'MIN_INTEGER'", 
		"'MAX_INTEGER'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INDENT", "DEDENT", "LF_TAB", "LF_MORE", "LF", "TAB", "WS", "COMMENT", 
		"JAVA", "CSHARP", "PYTHON2", "PYTHON3", "JAVASCRIPT", "SWIFT", "COLON", 
		"SEMI", "COMMA", "RANGE", "DOT", "LPAR", "RPAR", "LBRAK", "RBRAK", "LCURL", 
		"RCURL", "QMARK", "XMARK", "AMP", "AMP2", "PIPE", "PIPE2", "PLUS", "MINUS", 
		"STAR", "SLASH", "BSLASH", "PERCENT", "GT", "GTE", "LT", "LTE", "LTGT", 
		"EQ", "XEQ", "EQ2", "TEQ", "TILDE", "LARROW", "RARROW", "BOOLEAN", "CHARACTER", 
		"TEXT", "INTEGER", "DECIMAL", "DATE", "TIME", "DATETIME", "PERIOD", "VERSION", 
		"METHOD_T", "CODE", "DOCUMENT", "BLOB", "IMAGE", "UUID", "ITERATOR", "CURSOR", 
		"HTML", "ABSTRACT", "ALL", "ALWAYS", "AND", "ANY", "AS", "ASC", "ATTR", 
		"ATTRIBUTE", "ATTRIBUTES", "BINDINGS", "BREAK", "BY", "CASE", "CATCH", 
		"CATEGORY", "CLASS", "CLOSE", "CONTAINS", "DEF", "DEFAULT", "DEFINE", 
		"DELETE", "DESC", "DO", "DOING", "EACH", "ELSE", "ENUM", "ENUMERATED", 
		"EXCEPT", "EXECUTE", "EXPECTING", "EXTENDS", "FETCH", "FILTERED", "FINALLY", 
		"FLUSH", "FOR", "FROM", "GETTER", "HAS", "IF", "IN", "INDEX", "INVOKE", 
		"IS", "MATCHING", "METHOD", "METHODS", "MODULO", "MUTABLE", "NATIVE", 
		"NONE", "NOT", "NOTHING", "NULL", "ON", "ONE", "OPEN", "OPERATOR", "OR", 
		"ORDER", "OTHERWISE", "PASS", "RAISE", "READ", "RECEIVING", "RESOURCE", 
		"RETURN", "RETURNING", "ROWS", "SELF", "SETTER", "SINGLETON", "SORTED", 
		"STORABLE", "STORE", "SWITCH", "TEST", "THIS", "THROW", "TO", "TRY", "VERIFYING", 
		"WIDGET", "WITH", "WHEN", "WHERE", "WHILE", "WRITE", "BOOLEAN_LITERAL", 
		"CHAR_LITERAL", "MIN_INTEGER", "MAX_INTEGER", "SYMBOL_IDENTIFIER", "TYPE_IDENTIFIER", 
		"VARIABLE_IDENTIFIER", "NATIVE_IDENTIFIER", "DOLLAR_IDENTIFIER", "TEXT_LITERAL", 
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
			setState(470);
			match(ENUM);
			setState(471);
			((Enum_category_declarationContext)_localctx).name = type_identifier();
			setState(472);
			match(LPAR);
			setState(479);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE_IDENTIFIER:
				{
				setState(473);
				((Enum_category_declarationContext)_localctx).derived = type_identifier();
				setState(476);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(474);
					match(COMMA);
					setState(475);
					((Enum_category_declarationContext)_localctx).attrs = attribute_identifier_list();
					}
				}

				}
				break;
			case STORABLE:
			case VARIABLE_IDENTIFIER:
				{
				setState(478);
				((Enum_category_declarationContext)_localctx).attrs = attribute_identifier_list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(481);
			match(RPAR);
			setState(482);
			match(COLON);
			setState(483);
			indent();
			setState(484);
			((Enum_category_declarationContext)_localctx).symbols = category_symbol_list();
			setState(485);
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
			setState(487);
			match(ENUM);
			setState(488);
			((Enum_native_declarationContext)_localctx).name = type_identifier();
			setState(489);
			match(LPAR);
			setState(490);
			((Enum_native_declarationContext)_localctx).typ = native_type();
			setState(491);
			match(RPAR);
			setState(492);
			match(COLON);
			setState(493);
			indent();
			setState(494);
			((Enum_native_declarationContext)_localctx).symbols = native_symbol_list();
			setState(495);
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
			setState(497);
			((Native_symbolContext)_localctx).name = symbol_identifier();
			setState(498);
			match(EQ);
			setState(499);
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
			setState(501);
			((Category_symbolContext)_localctx).name = symbol_identifier();
			setState(502);
			match(LPAR);
			setState(504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & ((1L << (EXECUTE - 100)) | (1L << (FETCH - 100)) | (1L << (MUTABLE - 100)) | (1L << (NONE - 100)) | (1L << (NOT - 100)) | (1L << (READ - 100)) | (1L << (SELF - 100)) | (1L << (SORTED - 100)) | (1L << (THIS - 100)) | (1L << (BOOLEAN_LITERAL - 100)) | (1L << (CHAR_LITERAL - 100)) | (1L << (MIN_INTEGER - 100)) | (1L << (MAX_INTEGER - 100)))) != 0) || ((((_la - 164)) & ~0x3f) == 0 && ((1L << (_la - 164)) & ((1L << (SYMBOL_IDENTIFIER - 164)) | (1L << (TYPE_IDENTIFIER - 164)) | (1L << (VARIABLE_IDENTIFIER - 164)) | (1L << (TEXT_LITERAL - 164)) | (1L << (UUID_LITERAL - 164)) | (1L << (INTEGER_LITERAL - 164)) | (1L << (HEXA_LITERAL - 164)) | (1L << (DECIMAL_LITERAL - 164)) | (1L << (DATETIME_LITERAL - 164)) | (1L << (TIME_LITERAL - 164)) | (1L << (DATE_LITERAL - 164)) | (1L << (PERIOD_LITERAL - 164)) | (1L << (VERSION_LITERAL - 164)))) != 0)) {
				{
				setState(503);
				((Category_symbolContext)_localctx).args = argument_assignment_list(0);
				}
			}

			setState(506);
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
		public TerminalNode COLON() { return getToken(MParser.COLON, 0); }
		public IndentContext indent() {
			return getRuleContext(IndentContext.class,0);
		}
		public DedentContext dedent() {
			return getRuleContext(DedentContext.class,0);
		}
		public Attribute_identifierContext attribute_identifier() {
			return getRuleContext(Attribute_identifierContext.class,0);
		}
		public TypedefContext typedef() {
			return getRuleContext(TypedefContext.class,0);
		}
		public TerminalNode PASS() { return getToken(MParser.PASS, 0); }
		public TerminalNode STORABLE() { return getToken(MParser.STORABLE, 0); }
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
			setState(509);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STORABLE) {
				{
				setState(508);
				match(STORABLE);
				}
			}

			setState(511);
			match(ATTR);
			setState(512);
			((Attribute_declarationContext)_localctx).name = attribute_identifier();
			setState(513);
			match(LPAR);
			setState(514);
			((Attribute_declarationContext)_localctx).typ = typedef(0);
			setState(515);
			match(RPAR);
			setState(516);
			match(COLON);
			setState(517);
			indent();
			setState(533);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PASS:
				{
				setState(518);
				match(PASS);
				}
				break;
			case IN:
			case INDEX:
			case MATCHING:
				{
				setState(531);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IN:
				case MATCHING:
					{
					setState(519);
					((Attribute_declarationContext)_localctx).match = attribute_constraint();
					setState(523);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						setState(520);
						lfp();
						setState(521);
						((Attribute_declarationContext)_localctx).indices = index_clause();
						}
						break;
					}
					}
					break;
				case INDEX:
					{
					setState(525);
					((Attribute_declarationContext)_localctx).indices = index_clause();
					setState(529);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						setState(526);
						lfp();
						setState(527);
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
			setState(535);
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
			setState(537);
			match(INDEX);
			setState(538);
			match(LPAR);
			setState(540);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARIABLE_IDENTIFIER) {
				{
				setState(539);
				((Index_clauseContext)_localctx).indices = variable_identifier_list();
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
			setState(544);
			match(WIDGET);
			setState(545);
			((Concrete_widget_declarationContext)_localctx).name = type_identifier();
			setState(546);
			match(LPAR);
			setState(548);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE_IDENTIFIER) {
				{
				setState(547);
				((Concrete_widget_declarationContext)_localctx).derived = type_identifier();
				}
			}

			setState(550);
			match(RPAR);
			setState(551);
			match(COLON);
			setState(552);
			indent();
			setState(555);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case DEF:
				{
				setState(553);
				((Concrete_widget_declarationContext)_localctx).methods = member_method_declaration_list();
				}
				break;
			case PASS:
				{
				setState(554);
				match(PASS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(557);
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
		public TerminalNode COMMA() { return getToken(MParser.COMMA, 0); }
		public TerminalNode PASS() { return getToken(MParser.PASS, 0); }
		public TerminalNode STORABLE() { return getToken(MParser.STORABLE, 0); }
		public Derived_listContext derived_list() {
			return getRuleContext(Derived_listContext.class,0);
		}
		public Attribute_identifier_listContext attribute_identifier_list() {
			return getRuleContext(Attribute_identifier_listContext.class,0);
		}
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
		enterRule(_localctx, 14, RULE_concrete_category_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STORABLE) {
				{
				setState(559);
				match(STORABLE);
				}
			}

			setState(562);
			_la = _input.LA(1);
			if ( !(_la==CATEGORY || _la==CLASS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(563);
			((Concrete_category_declarationContext)_localctx).name = type_identifier();
			setState(564);
			match(LPAR);
			setState(571);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(565);
				((Concrete_category_declarationContext)_localctx).derived = derived_list();
				}
				break;
			case 2:
				{
				setState(566);
				((Concrete_category_declarationContext)_localctx).attrs = attribute_identifier_list();
				}
				break;
			case 3:
				{
				setState(567);
				((Concrete_category_declarationContext)_localctx).derived = derived_list();
				setState(568);
				match(COMMA);
				setState(569);
				((Concrete_category_declarationContext)_localctx).attrs = attribute_identifier_list();
				}
				break;
			}
			setState(573);
			match(RPAR);
			setState(574);
			match(COLON);
			setState(575);
			indent();
			setState(578);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case DEF:
				{
				setState(576);
				((Concrete_category_declarationContext)_localctx).methods = member_method_declaration_list();
				}
				break;
			case PASS:
				{
				setState(577);
				match(PASS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(580);
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
		enterRule(_localctx, 16, RULE_singleton_category_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			match(SINGLETON);
			setState(583);
			((Singleton_category_declarationContext)_localctx).name = type_identifier();
			setState(584);
			match(LPAR);
			setState(585);
			((Singleton_category_declarationContext)_localctx).attrs = attribute_identifier_list();
			setState(586);
			match(RPAR);
			setState(587);
			match(COLON);
			setState(588);
			indent();
			setState(591);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case DEF:
				{
				setState(589);
				((Singleton_category_declarationContext)_localctx).methods = member_method_declaration_list();
				}
				break;
			case PASS:
				{
				setState(590);
				match(PASS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(593);
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
		enterRule(_localctx, 18, RULE_derived_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
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
		enterRule(_localctx, 20, RULE_operator_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			match(DEF);
			setState(598);
			match(OPERATOR);
			setState(599);
			((Operator_method_declarationContext)_localctx).op = operator();
			setState(600);
			match(LPAR);
			setState(601);
			((Operator_method_declarationContext)_localctx).arg = operator_argument();
			setState(602);
			match(RPAR);
			setState(605);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RARROW) {
				{
				setState(603);
				match(RARROW);
				setState(604);
				((Operator_method_declarationContext)_localctx).typ = typedef(0);
				}
			}

			setState(607);
			match(COLON);
			setState(608);
			indent();
			setState(609);
			((Operator_method_declarationContext)_localctx).stmts = statement_list();
			setState(610);
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
		enterRule(_localctx, 22, RULE_setter_method_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			match(DEF);
			setState(613);
			((Setter_method_declarationContext)_localctx).name = variable_identifier();
			setState(614);
			match(SETTER);
			setState(615);
			match(LPAR);
			setState(616);
			match(RPAR);
			setState(617);
			match(COLON);
			setState(618);
			indent();
			setState(619);
			((Setter_method_declarationContext)_localctx).stmts = statement_list();
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
		enterRule(_localctx, 24, RULE_native_setter_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			match(DEF);
			setState(623);
			((Native_setter_declarationContext)_localctx).name = variable_identifier();
			setState(625);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NATIVE) {
				{
				setState(624);
				match(NATIVE);
				}
			}

			setState(627);
			match(SETTER);
			setState(628);
			match(LPAR);
			setState(629);
			match(RPAR);
			setState(630);
			match(COLON);
			setState(631);
			indent();
			setState(632);
			((Native_setter_declarationContext)_localctx).stmts = native_statement_list();
			setState(633);
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
		enterRule(_localctx, 26, RULE_getter_method_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			match(DEF);
			setState(636);
			((Getter_method_declarationContext)_localctx).name = variable_identifier();
			setState(637);
			match(GETTER);
			setState(638);
			match(LPAR);
			setState(639);
			match(RPAR);
			setState(640);
			match(COLON);
			setState(641);
			indent();
			setState(642);
			((Getter_method_declarationContext)_localctx).stmts = statement_list();
			setState(643);
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
		enterRule(_localctx, 28, RULE_native_getter_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			match(DEF);
			setState(646);
			((Native_getter_declarationContext)_localctx).name = variable_identifier();
			setState(648);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NATIVE) {
				{
				setState(647);
				match(NATIVE);
				}
			}

			setState(650);
			match(GETTER);
			setState(651);
			match(LPAR);
			setState(652);
			match(RPAR);
			setState(653);
			match(COLON);
			setState(654);
			indent();
			setState(655);
			((Native_getter_declarationContext)_localctx).stmts = native_statement_list();
			setState(656);
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
		enterRule(_localctx, 30, RULE_native_category_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STORABLE) {
				{
				setState(658);
				match(STORABLE);
				}
			}

			setState(661);
			match(NATIVE);
			setState(662);
			_la = _input.LA(1);
			if ( !(_la==CATEGORY || _la==CLASS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(663);
			((Native_category_declarationContext)_localctx).name = type_identifier();
			setState(664);
			match(LPAR);
			setState(666);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STORABLE || _la==VARIABLE_IDENTIFIER) {
				{
				setState(665);
				((Native_category_declarationContext)_localctx).attrs = attribute_identifier_list();
				}
			}

			setState(668);
			match(RPAR);
			setState(669);
			match(COLON);
			setState(670);
			indent();
			setState(671);
			((Native_category_declarationContext)_localctx).bindings = native_category_bindings();
			setState(675);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(672);
				lfp();
				setState(673);
				((Native_category_declarationContext)_localctx).methods = native_member_method_declaration_list();
				}
				break;
			}
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
		enterRule(_localctx, 32, RULE_native_resource_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(680);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STORABLE) {
				{
				setState(679);
				match(STORABLE);
				}
			}

			setState(682);
			match(NATIVE);
			setState(683);
			match(RESOURCE);
			setState(684);
			((Native_resource_declarationContext)_localctx).name = type_identifier();
			setState(685);
			match(LPAR);
			setState(687);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STORABLE || _la==VARIABLE_IDENTIFIER) {
				{
				setState(686);
				((Native_resource_declarationContext)_localctx).attrs = attribute_identifier_list();
				}
			}

			setState(689);
			match(RPAR);
			setState(690);
			match(COLON);
			setState(691);
			indent();
			setState(692);
			((Native_resource_declarationContext)_localctx).bindings = native_category_bindings();
			setState(696);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(693);
				lfp();
				setState(694);
				((Native_resource_declarationContext)_localctx).methods = native_member_method_declaration_list();
				}
				break;
			}
			setState(698);
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
		enterRule(_localctx, 34, RULE_native_category_bindings);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			match(DEF);
			setState(701);
			_la = _input.LA(1);
			if ( !(_la==CATEGORY || _la==CLASS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(702);
			match(BINDINGS);
			setState(703);
			match(COLON);
			setState(704);
			indent();
			setState(705);
			((Native_category_bindingsContext)_localctx).items = native_category_binding_list(0);
			setState(706);
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

			setState(709);
			((NativeCategoryBindingListContext)_localctx).item = native_category_binding();
			}
			_ctx.stop = _input.LT(-1);
			setState(717);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NativeCategoryBindingListItemContext(new Native_category_binding_listContext(_parentctx, _parentState));
					((NativeCategoryBindingListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_native_category_binding_list);
					setState(711);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(712);
					lfp();
					setState(713);
					((NativeCategoryBindingListItemContext)_localctx).item = native_category_binding();
					}
					} 
				}
				setState(719);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		enterRule(_localctx, 38, RULE_abstract_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			match(ABSTRACT);
			setState(721);
			match(DEF);
			setState(722);
			((Abstract_method_declarationContext)_localctx).name = method_identifier();
			setState(723);
			match(LPAR);
			setState(725);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CODE || _la==MUTABLE || _la==VARIABLE_IDENTIFIER) {
				{
				setState(724);
				((Abstract_method_declarationContext)_localctx).args = argument_list();
				}
			}

			setState(727);
			match(RPAR);
			setState(730);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RARROW) {
				{
				setState(728);
				match(RARROW);
				setState(729);
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
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public TerminalNode RARROW() { return getToken(MParser.RARROW, 0); }
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
		enterRule(_localctx, 40, RULE_concrete_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
			match(DEF);
			setState(733);
			((Concrete_method_declarationContext)_localctx).name = method_identifier();
			setState(734);
			match(LPAR);
			setState(736);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CODE || _la==MUTABLE || _la==VARIABLE_IDENTIFIER) {
				{
				setState(735);
				((Concrete_method_declarationContext)_localctx).args = argument_list();
				}
			}

			setState(738);
			match(RPAR);
			setState(741);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RARROW) {
				{
				setState(739);
				match(RARROW);
				setState(740);
				((Concrete_method_declarationContext)_localctx).typ = typedef(0);
				}
			}

			setState(743);
			match(COLON);
			setState(744);
			indent();
			setState(745);
			((Concrete_method_declarationContext)_localctx).stmts = statement_list();
			setState(746);
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
		enterRule(_localctx, 42, RULE_native_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(748);
			match(DEF);
			setState(750);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NATIVE) {
				{
				setState(749);
				match(NATIVE);
				}
			}

			setState(752);
			((Native_method_declarationContext)_localctx).name = method_identifier();
			setState(753);
			match(LPAR);
			setState(755);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CODE || _la==MUTABLE || _la==VARIABLE_IDENTIFIER) {
				{
				setState(754);
				((Native_method_declarationContext)_localctx).args = argument_list();
				}
			}

			setState(757);
			match(RPAR);
			setState(760);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RARROW) {
				{
				setState(758);
				match(RARROW);
				setState(759);
				((Native_method_declarationContext)_localctx).typ = category_or_any_type();
				}
			}

			setState(762);
			match(COLON);
			setState(763);
			indent();
			setState(764);
			((Native_method_declarationContext)_localctx).stmts = native_statement_list();
			setState(765);
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
		enterRule(_localctx, 44, RULE_test_method_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
			match(DEF);
			setState(768);
			match(TEST);
			setState(769);
			((Test_method_declarationContext)_localctx).name = match(TEXT_LITERAL);
			setState(770);
			match(LPAR);
			setState(771);
			match(RPAR);
			setState(772);
			match(COLON);
			setState(773);
			indent();
			setState(774);
			((Test_method_declarationContext)_localctx).stmts = statement_list();
			setState(775);
			dedent();
			setState(776);
			lfp();
			setState(777);
			match(VERIFYING);
			setState(778);
			match(COLON);
			setState(784);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LF:
				{
				{
				setState(779);
				indent();
				setState(780);
				((Test_method_declarationContext)_localctx).exps = assertion_list();
				setState(781);
				dedent();
				}
				}
				break;
			case SYMBOL_IDENTIFIER:
				{
				{
				setState(783);
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
		enterRule(_localctx, 46, RULE_assertion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(786);
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
		enterRule(_localctx, 48, RULE_typed_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(788);
			((Typed_argumentContext)_localctx).name = variable_identifier();
			setState(789);
			match(COLON);
			setState(790);
			((Typed_argumentContext)_localctx).typ = category_or_any_type();
			setState(795);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(791);
				match(LPAR);
				setState(792);
				((Typed_argumentContext)_localctx).attrs = attribute_identifier_list();
				setState(793);
				match(RPAR);
				}
			}

			setState(799);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(797);
				match(EQ);
				setState(798);
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
		public Method_callContext stmt;
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
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
		enterRule(_localctx, 50, RULE_statement);
		try {
			setState(820);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				_localctx = new MethodCallStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(801);
				((MethodCallStatementContext)_localctx).stmt = method_call();
				}
				break;
			case 2:
				_localctx = new AssignInstanceStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(802);
				((AssignInstanceStatementContext)_localctx).stmt = assign_instance_statement();
				}
				break;
			case 3:
				_localctx = new AssignTupleStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(803);
				((AssignTupleStatementContext)_localctx).stmt = assign_tuple_statement();
				}
				break;
			case 4:
				_localctx = new StoreStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(804);
				((StoreStatementContext)_localctx).stmt = store_statement();
				}
				break;
			case 5:
				_localctx = new FlushStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(805);
				((FlushStatementContext)_localctx).stmt = flush_statement();
				}
				break;
			case 6:
				_localctx = new BreakStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(806);
				((BreakStatementContext)_localctx).stmt = break_statement();
				}
				break;
			case 7:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(807);
				((ReturnStatementContext)_localctx).stmt = return_statement();
				}
				break;
			case 8:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(808);
				((IfStatementContext)_localctx).stmt = if_statement();
				}
				break;
			case 9:
				_localctx = new SwitchStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(809);
				((SwitchStatementContext)_localctx).stmt = switch_statement();
				}
				break;
			case 10:
				_localctx = new ForEachStatementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(810);
				((ForEachStatementContext)_localctx).stmt = for_each_statement();
				}
				break;
			case 11:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(811);
				((WhileStatementContext)_localctx).stmt = while_statement();
				}
				break;
			case 12:
				_localctx = new DoWhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(812);
				((DoWhileStatementContext)_localctx).stmt = do_while_statement();
				}
				break;
			case 13:
				_localctx = new RaiseStatementContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(813);
				((RaiseStatementContext)_localctx).stmt = raise_statement();
				}
				break;
			case 14:
				_localctx = new TryStatementContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(814);
				((TryStatementContext)_localctx).stmt = try_statement();
				}
				break;
			case 15:
				_localctx = new WriteStatementContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(815);
				((WriteStatementContext)_localctx).stmt = write_statement();
				}
				break;
			case 16:
				_localctx = new WithResourceStatementContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(816);
				((WithResourceStatementContext)_localctx).stmt = with_resource_statement();
				}
				break;
			case 17:
				_localctx = new WithSingletonStatementContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(817);
				((WithSingletonStatementContext)_localctx).stmt = with_singleton_statement();
				}
				break;
			case 18:
				_localctx = new ClosureStatementContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(818);
				((ClosureStatementContext)_localctx).decl = concrete_method_declaration();
				}
				break;
			case 19:
				_localctx = new CommentStatementContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(819);
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
		enterRule(_localctx, 52, RULE_flush_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(822);
			match(FLUSH);
			setState(823);
			match(LPAR);
			setState(824);
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
		public TerminalNode DELETE() { return getToken(MParser.DELETE, 0); }
		public List<TerminalNode> LPAR() { return getTokens(MParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(MParser.LPAR, i);
		}
		public List<TerminalNode> RPAR() { return getTokens(MParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(MParser.RPAR, i);
		}
		public List<Expression_listContext> expression_list() {
			return getRuleContexts(Expression_listContext.class);
		}
		public Expression_listContext expression_list(int i) {
			return getRuleContext(Expression_listContext.class,i);
		}
		public TerminalNode STORE() { return getToken(MParser.STORE, 0); }
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
		enterRule(_localctx, 54, RULE_store_statement);
		try {
			setState(846);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(826);
				match(DELETE);
				setState(827);
				match(LPAR);
				setState(828);
				((Store_statementContext)_localctx).to_del = expression_list();
				setState(829);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(831);
				match(STORE);
				setState(832);
				match(LPAR);
				setState(833);
				((Store_statementContext)_localctx).to_add = expression_list();
				setState(834);
				match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(836);
				match(DELETE);
				setState(837);
				match(LPAR);
				setState(838);
				((Store_statementContext)_localctx).to_del = expression_list();
				setState(839);
				match(RPAR);
				setState(840);
				match(AND);
				setState(841);
				match(STORE);
				setState(842);
				match(LPAR);
				setState(843);
				((Store_statementContext)_localctx).to_add = expression_list();
				setState(844);
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

	public static class Method_callContext extends ParserRuleContext {
		public Method_selectorContext method;
		public Argument_assignment_listContext args;
		public TerminalNode LPAR() { return getToken(MParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(MParser.RPAR, 0); }
		public Method_selectorContext method_selector() {
			return getRuleContext(Method_selectorContext.class,0);
		}
		public Argument_assignment_listContext argument_assignment_list() {
			return getRuleContext(Argument_assignment_listContext.class,0);
		}
		public Method_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterMethod_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitMethod_call(this);
		}
	}

	public final Method_callContext method_call() throws RecognitionException {
		Method_callContext _localctx = new Method_callContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_method_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(848);
			((Method_callContext)_localctx).method = method_selector();
			setState(849);
			match(LPAR);
			setState(851);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & ((1L << (EXECUTE - 100)) | (1L << (FETCH - 100)) | (1L << (MUTABLE - 100)) | (1L << (NONE - 100)) | (1L << (NOT - 100)) | (1L << (READ - 100)) | (1L << (SELF - 100)) | (1L << (SORTED - 100)) | (1L << (THIS - 100)) | (1L << (BOOLEAN_LITERAL - 100)) | (1L << (CHAR_LITERAL - 100)) | (1L << (MIN_INTEGER - 100)) | (1L << (MAX_INTEGER - 100)))) != 0) || ((((_la - 164)) & ~0x3f) == 0 && ((1L << (_la - 164)) & ((1L << (SYMBOL_IDENTIFIER - 164)) | (1L << (TYPE_IDENTIFIER - 164)) | (1L << (VARIABLE_IDENTIFIER - 164)) | (1L << (TEXT_LITERAL - 164)) | (1L << (UUID_LITERAL - 164)) | (1L << (INTEGER_LITERAL - 164)) | (1L << (HEXA_LITERAL - 164)) | (1L << (DECIMAL_LITERAL - 164)) | (1L << (DATETIME_LITERAL - 164)) | (1L << (TIME_LITERAL - 164)) | (1L << (DATE_LITERAL - 164)) | (1L << (PERIOD_LITERAL - 164)) | (1L << (VERSION_LITERAL - 164)))) != 0)) {
				{
				setState(850);
				((Method_callContext)_localctx).args = argument_assignment_list(0);
				}
			}

			setState(853);
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

	public static class Method_selectorContext extends ParserRuleContext {
		public Method_selectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_selector; }
	 
		public Method_selectorContext() { }
		public void copyFrom(Method_selectorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MethodParentContext extends Method_selectorContext {
		public Callable_parentContext parent;
		public Method_identifierContext name;
		public TerminalNode DOT() { return getToken(MParser.DOT, 0); }
		public Callable_parentContext callable_parent() {
			return getRuleContext(Callable_parentContext.class,0);
		}
		public Method_identifierContext method_identifier() {
			return getRuleContext(Method_identifierContext.class,0);
		}
		public MethodParentContext(Method_selectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterMethodParent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitMethodParent(this);
		}
	}
	public static class MethodNameContext extends Method_selectorContext {
		public Method_identifierContext name;
		public Method_identifierContext method_identifier() {
			return getRuleContext(Method_identifierContext.class,0);
		}
		public MethodNameContext(Method_selectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterMethodName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitMethodName(this);
		}
	}

	public final Method_selectorContext method_selector() throws RecognitionException {
		Method_selectorContext _localctx = new Method_selectorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_method_selector);
		try {
			setState(860);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				_localctx = new MethodNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(855);
				((MethodNameContext)_localctx).name = method_identifier();
				}
				break;
			case 2:
				_localctx = new MethodParentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(856);
				((MethodParentContext)_localctx).parent = callable_parent(0);
				setState(857);
				match(DOT);
				setState(858);
				((MethodParentContext)_localctx).name = method_identifier();
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

	public static class Callable_parentContext extends ParserRuleContext {
		public Callable_parentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callable_parent; }
	 
		public Callable_parentContext() { }
		public void copyFrom(Callable_parentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CallableSelectorContext extends Callable_parentContext {
		public Callable_parentContext parent;
		public Callable_selectorContext select;
		public Callable_parentContext callable_parent() {
			return getRuleContext(Callable_parentContext.class,0);
		}
		public Callable_selectorContext callable_selector() {
			return getRuleContext(Callable_selectorContext.class,0);
		}
		public CallableSelectorContext(Callable_parentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterCallableSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitCallableSelector(this);
		}
	}
	public static class CallableRootContext extends Callable_parentContext {
		public IdentifierContext name;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public CallableRootContext(Callable_parentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterCallableRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitCallableRoot(this);
		}
	}

	public final Callable_parentContext callable_parent() throws RecognitionException {
		return callable_parent(0);
	}

	private Callable_parentContext callable_parent(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Callable_parentContext _localctx = new Callable_parentContext(_ctx, _parentState);
		Callable_parentContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_callable_parent, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new CallableRootContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(863);
			((CallableRootContext)_localctx).name = identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(869);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CallableSelectorContext(new Callable_parentContext(_parentctx, _parentState));
					((CallableSelectorContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_callable_parent);
					setState(865);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(866);
					((CallableSelectorContext)_localctx).select = callable_selector();
					}
					} 
				}
				setState(871);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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

	public static class Callable_selectorContext extends ParserRuleContext {
		public Callable_selectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callable_selector; }
	 
		public Callable_selectorContext() { }
		public void copyFrom(Callable_selectorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CallableItemSelectorContext extends Callable_selectorContext {
		public ExpressionContext exp;
		public TerminalNode LBRAK() { return getToken(MParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(MParser.RBRAK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CallableItemSelectorContext(Callable_selectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterCallableItemSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitCallableItemSelector(this);
		}
	}
	public static class CallableMemberSelectorContext extends Callable_selectorContext {
		public Variable_identifierContext name;
		public TerminalNode DOT() { return getToken(MParser.DOT, 0); }
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public CallableMemberSelectorContext(Callable_selectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterCallableMemberSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitCallableMemberSelector(this);
		}
	}

	public final Callable_selectorContext callable_selector() throws RecognitionException {
		Callable_selectorContext _localctx = new Callable_selectorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_callable_selector);
		try {
			setState(878);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				_localctx = new CallableMemberSelectorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(872);
				match(DOT);
				setState(873);
				((CallableMemberSelectorContext)_localctx).name = variable_identifier();
				}
				break;
			case LBRAK:
				_localctx = new CallableItemSelectorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(874);
				match(LBRAK);
				setState(875);
				((CallableItemSelectorContext)_localctx).exp = expression(0);
				setState(876);
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
		enterRule(_localctx, 64, RULE_with_resource_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(880);
			match(WITH);
			setState(881);
			((With_resource_statementContext)_localctx).stmt = assign_variable_statement();
			setState(882);
			match(COLON);
			setState(883);
			indent();
			setState(884);
			((With_resource_statementContext)_localctx).stmts = statement_list();
			setState(885);
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
		enterRule(_localctx, 66, RULE_with_singleton_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(887);
			match(WITH);
			setState(888);
			((With_singleton_statementContext)_localctx).typ = type_identifier();
			setState(889);
			match(COLON);
			setState(890);
			indent();
			setState(891);
			((With_singleton_statementContext)_localctx).stmts = statement_list();
			setState(892);
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
		enterRule(_localctx, 68, RULE_switch_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(894);
			match(SWITCH);
			setState(895);
			match(ON);
			setState(896);
			((Switch_statementContext)_localctx).exp = expression(0);
			setState(897);
			match(COLON);
			setState(898);
			indent();
			setState(899);
			((Switch_statementContext)_localctx).cases = switch_case_statement_list();
			setState(907);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(900);
				lfp();
				setState(901);
				match(OTHERWISE);
				setState(902);
				match(COLON);
				setState(903);
				indent();
				setState(904);
				((Switch_statementContext)_localctx).stmts = statement_list();
				setState(905);
				dedent();
				}
				break;
			}
			setState(909);
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
		enterRule(_localctx, 70, RULE_switch_case_statement);
		try {
			setState(926);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				_localctx = new AtomicSwitchCaseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(911);
				match(WHEN);
				setState(912);
				((AtomicSwitchCaseContext)_localctx).exp = atomic_literal();
				setState(913);
				match(COLON);
				setState(914);
				indent();
				setState(915);
				((AtomicSwitchCaseContext)_localctx).stmts = statement_list();
				setState(916);
				dedent();
				}
				break;
			case 2:
				_localctx = new CollectionSwitchCaseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(918);
				match(WHEN);
				setState(919);
				match(IN);
				setState(920);
				((CollectionSwitchCaseContext)_localctx).exp = literal_collection();
				setState(921);
				match(COLON);
				setState(922);
				indent();
				setState(923);
				((CollectionSwitchCaseContext)_localctx).stmts = statement_list();
				setState(924);
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
		enterRule(_localctx, 72, RULE_for_each_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(928);
			match(FOR);
			setState(929);
			((For_each_statementContext)_localctx).name1 = variable_identifier();
			setState(932);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(930);
				match(COMMA);
				setState(931);
				((For_each_statementContext)_localctx).name2 = variable_identifier();
				}
			}

			setState(934);
			match(IN);
			setState(935);
			((For_each_statementContext)_localctx).source = expression(0);
			setState(936);
			match(COLON);
			setState(937);
			indent();
			setState(938);
			((For_each_statementContext)_localctx).stmts = statement_list();
			setState(939);
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
		enterRule(_localctx, 74, RULE_do_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(941);
			match(DO);
			setState(942);
			match(COLON);
			setState(943);
			indent();
			setState(944);
			((Do_while_statementContext)_localctx).stmts = statement_list();
			setState(945);
			dedent();
			setState(946);
			lfp();
			setState(947);
			match(WHILE);
			setState(948);
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
		enterRule(_localctx, 76, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(950);
			match(WHILE);
			setState(951);
			((While_statementContext)_localctx).exp = expression(0);
			setState(952);
			match(COLON);
			setState(953);
			indent();
			setState(954);
			((While_statementContext)_localctx).stmts = statement_list();
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
		enterRule(_localctx, 78, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(957);
			match(IF);
			setState(958);
			((If_statementContext)_localctx).exp = expression(0);
			setState(959);
			match(COLON);
			setState(960);
			indent();
			setState(961);
			((If_statementContext)_localctx).stmts = statement_list();
			setState(962);
			dedent();
			setState(966);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(963);
				lfp();
				setState(964);
				((If_statementContext)_localctx).elseIfs = else_if_statement_list(0);
				}
				break;
			}
			setState(975);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(968);
				lfp();
				setState(969);
				match(ELSE);
				setState(970);
				match(COLON);
				setState(971);
				indent();
				setState(972);
				((If_statementContext)_localctx).elseStmts = statement_list();
				setState(973);
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

			setState(978);
			match(ELSE);
			setState(979);
			match(IF);
			setState(980);
			((ElseIfStatementListContext)_localctx).exp = expression(0);
			setState(981);
			match(COLON);
			setState(982);
			indent();
			setState(983);
			((ElseIfStatementListContext)_localctx).stmts = statement_list();
			setState(984);
			dedent();
			}
			_ctx.stop = _input.LT(-1);
			setState(998);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ElseIfStatementListItemContext(new Else_if_statement_listContext(_parentctx, _parentState));
					((ElseIfStatementListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_else_if_statement_list);
					setState(986);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(987);
					lfp();
					setState(988);
					match(ELSE);
					setState(989);
					match(IF);
					setState(990);
					((ElseIfStatementListItemContext)_localctx).exp = expression(0);
					setState(991);
					match(COLON);
					setState(992);
					indent();
					setState(993);
					((ElseIfStatementListItemContext)_localctx).stmts = statement_list();
					setState(994);
					dedent();
					}
					} 
				}
				setState(1000);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
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
		enterRule(_localctx, 82, RULE_raise_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1001);
			match(RAISE);
			setState(1002);
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
		enterRule(_localctx, 84, RULE_try_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1004);
			match(TRY);
			setState(1005);
			((Try_statementContext)_localctx).name = variable_identifier();
			setState(1006);
			match(COLON);
			setState(1007);
			indent();
			setState(1008);
			((Try_statementContext)_localctx).stmts = statement_list();
			setState(1009);
			dedent();
			setState(1010);
			lfs();
			setState(1012);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(1011);
				((Try_statementContext)_localctx).handlers = catch_statement_list();
				}
				break;
			}
			setState(1021);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXCEPT) {
				{
				setState(1014);
				match(EXCEPT);
				setState(1015);
				match(COLON);
				setState(1016);
				indent();
				setState(1017);
				((Try_statementContext)_localctx).anyStmts = statement_list();
				setState(1018);
				dedent();
				setState(1019);
				lfs();
				}
			}

			setState(1030);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINALLY) {
				{
				setState(1023);
				match(FINALLY);
				setState(1024);
				match(COLON);
				setState(1025);
				indent();
				setState(1026);
				((Try_statementContext)_localctx).finalStmts = statement_list();
				setState(1027);
				dedent();
				setState(1028);
				lfs();
				}
			}

			setState(1032);
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
		enterRule(_localctx, 86, RULE_catch_statement);
		try {
			setState(1053);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				_localctx = new CatchAtomicStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1034);
				match(EXCEPT);
				setState(1035);
				((CatchAtomicStatementContext)_localctx).name = symbol_identifier();
				setState(1036);
				match(COLON);
				setState(1037);
				indent();
				setState(1038);
				((CatchAtomicStatementContext)_localctx).stmts = statement_list();
				setState(1039);
				dedent();
				setState(1040);
				lfs();
				}
				break;
			case 2:
				_localctx = new CatchCollectionStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1042);
				match(EXCEPT);
				setState(1043);
				match(IN);
				setState(1044);
				match(LBRAK);
				setState(1045);
				((CatchCollectionStatementContext)_localctx).exp = symbol_list();
				setState(1046);
				match(RBRAK);
				setState(1047);
				match(COLON);
				setState(1048);
				indent();
				setState(1049);
				((CatchCollectionStatementContext)_localctx).stmts = statement_list();
				setState(1050);
				dedent();
				setState(1051);
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
		enterRule(_localctx, 88, RULE_break_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1055);
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
		enterRule(_localctx, 90, RULE_return_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1057);
			match(RETURN);
			setState(1059);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & ((1L << (EXECUTE - 100)) | (1L << (FETCH - 100)) | (1L << (MUTABLE - 100)) | (1L << (NONE - 100)) | (1L << (NOT - 100)) | (1L << (READ - 100)) | (1L << (SELF - 100)) | (1L << (SORTED - 100)) | (1L << (THIS - 100)) | (1L << (BOOLEAN_LITERAL - 100)) | (1L << (CHAR_LITERAL - 100)) | (1L << (MIN_INTEGER - 100)) | (1L << (MAX_INTEGER - 100)))) != 0) || ((((_la - 164)) & ~0x3f) == 0 && ((1L << (_la - 164)) & ((1L << (SYMBOL_IDENTIFIER - 164)) | (1L << (TYPE_IDENTIFIER - 164)) | (1L << (VARIABLE_IDENTIFIER - 164)) | (1L << (TEXT_LITERAL - 164)) | (1L << (UUID_LITERAL - 164)) | (1L << (INTEGER_LITERAL - 164)) | (1L << (HEXA_LITERAL - 164)) | (1L << (DECIMAL_LITERAL - 164)) | (1L << (DATETIME_LITERAL - 164)) | (1L << (TIME_LITERAL - 164)) | (1L << (DATE_LITERAL - 164)) | (1L << (PERIOD_LITERAL - 164)) | (1L << (VERSION_LITERAL - 164)))) != 0)) {
				{
				setState(1058);
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
	public static class MethodExpressionContext extends ExpressionContext {
		public Method_expressionContext exp;
		public Method_expressionContext method_expression() {
			return getRuleContext(Method_expressionContext.class,0);
		}
		public MethodExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterMethodExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitMethodExpression(this);
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
		int _startState = 92;
		enterRecursionRule(_localctx, 92, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1081);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				_localctx = new CssExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1062);
				((CssExpressionContext)_localctx).exp = css_expression();
				}
				break;
			case 2:
				{
				_localctx = new JsxExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1063);
				((JsxExpressionContext)_localctx).exp = jsx_expression();
				}
				break;
			case 3:
				{
				_localctx = new InstanceExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1064);
				((InstanceExpressionContext)_localctx).exp = instance_expression(0);
				}
				break;
			case 4:
				{
				_localctx = new MethodExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1065);
				((MethodExpressionContext)_localctx).exp = method_expression();
				}
				break;
			case 5:
				{
				_localctx = new MinusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1066);
				match(MINUS);
				setState(1067);
				((MinusExpressionContext)_localctx).exp = expression(34);
				}
				break;
			case 6:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1068);
				match(NOT);
				setState(1069);
				((NotExpressionContext)_localctx).exp = expression(33);
				}
				break;
			case 7:
				{
				_localctx = new CodeExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1070);
				match(CODE);
				setState(1071);
				match(LPAR);
				setState(1072);
				((CodeExpressionContext)_localctx).exp = expression(0);
				setState(1073);
				match(RPAR);
				}
				break;
			case 8:
				{
				_localctx = new ExecuteExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1075);
				match(EXECUTE);
				setState(1076);
				match(LPAR);
				setState(1077);
				((ExecuteExpressionContext)_localctx).name = variable_identifier();
				setState(1078);
				match(RPAR);
				}
				break;
			case 9:
				{
				_localctx = new ClosureExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1080);
				((ClosureExpressionContext)_localctx).exp = closure_expression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1194);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1192);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplyExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((MultiplyExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1083);
						if (!(precpred(_ctx, 32))) throw new FailedPredicateException(this, "precpred(_ctx, 32)");
						setState(1084);
						multiply();
						setState(1085);
						((MultiplyExpressionContext)_localctx).right = expression(33);
						}
						break;
					case 2:
						{
						_localctx = new DivideExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((DivideExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1087);
						if (!(precpred(_ctx, 31))) throw new FailedPredicateException(this, "precpred(_ctx, 31)");
						setState(1088);
						divide();
						setState(1089);
						((DivideExpressionContext)_localctx).right = expression(32);
						}
						break;
					case 3:
						{
						_localctx = new ModuloExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ModuloExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1091);
						if (!(precpred(_ctx, 30))) throw new FailedPredicateException(this, "precpred(_ctx, 30)");
						setState(1092);
						modulo();
						setState(1093);
						((ModuloExpressionContext)_localctx).right = expression(31);
						}
						break;
					case 4:
						{
						_localctx = new IntDivideExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((IntDivideExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1095);
						if (!(precpred(_ctx, 29))) throw new FailedPredicateException(this, "precpred(_ctx, 29)");
						setState(1096);
						idivide();
						setState(1097);
						((IntDivideExpressionContext)_localctx).right = expression(30);
						}
						break;
					case 5:
						{
						_localctx = new AddExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((AddExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1099);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(1100);
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
						setState(1101);
						((AddExpressionContext)_localctx).right = expression(29);
						}
						break;
					case 6:
						{
						_localctx = new LessThanExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((LessThanExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1102);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(1103);
						match(LT);
						setState(1104);
						((LessThanExpressionContext)_localctx).right = expression(27);
						}
						break;
					case 7:
						{
						_localctx = new LessThanOrEqualExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((LessThanOrEqualExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1105);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(1106);
						match(LTE);
						setState(1107);
						((LessThanOrEqualExpressionContext)_localctx).right = expression(26);
						}
						break;
					case 8:
						{
						_localctx = new GreaterThanExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((GreaterThanExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1108);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(1109);
						match(GT);
						setState(1110);
						((GreaterThanExpressionContext)_localctx).right = expression(25);
						}
						break;
					case 9:
						{
						_localctx = new GreaterThanOrEqualExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((GreaterThanOrEqualExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1111);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(1112);
						match(GTE);
						setState(1113);
						((GreaterThanOrEqualExpressionContext)_localctx).right = expression(24);
						}
						break;
					case 10:
						{
						_localctx = new EqualsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((EqualsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1114);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1115);
						match(EQ2);
						setState(1116);
						((EqualsExpressionContext)_localctx).right = expression(21);
						}
						break;
					case 11:
						{
						_localctx = new NotEqualsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((NotEqualsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1117);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1118);
						match(XEQ);
						setState(1119);
						((NotEqualsExpressionContext)_localctx).right = expression(20);
						}
						break;
					case 12:
						{
						_localctx = new RoughlyEqualsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((RoughlyEqualsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1120);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1121);
						match(TEQ);
						setState(1122);
						((RoughlyEqualsExpressionContext)_localctx).right = expression(19);
						}
						break;
					case 13:
						{
						_localctx = new ContainsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ContainsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1123);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1124);
						match(CONTAINS);
						setState(1125);
						((ContainsExpressionContext)_localctx).right = expression(18);
						}
						break;
					case 14:
						{
						_localctx = new InExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((InExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1126);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1127);
						match(IN);
						setState(1128);
						((InExpressionContext)_localctx).right = expression(17);
						}
						break;
					case 15:
						{
						_localctx = new HasExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((HasExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1129);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1130);
						match(HAS);
						setState(1131);
						((HasExpressionContext)_localctx).right = expression(16);
						}
						break;
					case 16:
						{
						_localctx = new HasAllExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((HasAllExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1132);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1133);
						match(HAS);
						setState(1134);
						match(ALL);
						setState(1135);
						((HasAllExpressionContext)_localctx).right = expression(15);
						}
						break;
					case 17:
						{
						_localctx = new HasAnyExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((HasAnyExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1136);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1137);
						match(HAS);
						setState(1138);
						match(ANY);
						setState(1139);
						((HasAnyExpressionContext)_localctx).right = expression(14);
						}
						break;
					case 18:
						{
						_localctx = new NotContainsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((NotContainsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1140);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1141);
						match(NOT);
						setState(1142);
						match(CONTAINS);
						setState(1143);
						((NotContainsExpressionContext)_localctx).right = expression(13);
						}
						break;
					case 19:
						{
						_localctx = new NotInExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((NotInExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1144);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1145);
						match(NOT);
						setState(1146);
						match(IN);
						setState(1147);
						((NotInExpressionContext)_localctx).right = expression(12);
						}
						break;
					case 20:
						{
						_localctx = new NotHasExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((NotHasExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1148);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1149);
						match(NOT);
						setState(1150);
						match(HAS);
						setState(1151);
						((NotHasExpressionContext)_localctx).right = expression(11);
						}
						break;
					case 21:
						{
						_localctx = new NotHasAllExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((NotHasAllExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1152);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1153);
						match(NOT);
						setState(1154);
						match(HAS);
						setState(1155);
						match(ALL);
						setState(1156);
						((NotHasAllExpressionContext)_localctx).right = expression(10);
						}
						break;
					case 22:
						{
						_localctx = new NotHasAnyExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((NotHasAnyExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1157);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1158);
						match(NOT);
						setState(1159);
						match(HAS);
						setState(1160);
						match(ANY);
						setState(1161);
						((NotHasAnyExpressionContext)_localctx).right = expression(9);
						}
						break;
					case 23:
						{
						_localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((OrExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1162);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1163);
						match(OR);
						setState(1164);
						((OrExpressionContext)_localctx).right = expression(8);
						}
						break;
					case 24:
						{
						_localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((AndExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1165);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1166);
						match(AND);
						setState(1167);
						((AndExpressionContext)_localctx).right = expression(7);
						}
						break;
					case 25:
						{
						_localctx = new TernaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((TernaryExpressionContext)_localctx).ifTrue = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1168);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1169);
						match(IF);
						setState(1170);
						((TernaryExpressionContext)_localctx).test = expression(0);
						setState(1171);
						match(ELSE);
						setState(1172);
						((TernaryExpressionContext)_localctx).ifFalse = expression(6);
						}
						break;
					case 26:
						{
						_localctx = new IteratorExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((IteratorExpressionContext)_localctx).exp = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1174);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1175);
						match(FOR);
						setState(1176);
						((IteratorExpressionContext)_localctx).name = variable_identifier();
						setState(1177);
						match(IN);
						setState(1178);
						((IteratorExpressionContext)_localctx).source = expression(2);
						}
						break;
					case 27:
						{
						_localctx = new FilteredListExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((FilteredListExpressionContext)_localctx).src = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1180);
						if (!(precpred(_ctx, 36))) throw new FailedPredicateException(this, "precpred(_ctx, 36)");
						setState(1181);
						filtered_list_suffix();
						}
						break;
					case 28:
						{
						_localctx = new CastExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((CastExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1182);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(1183);
						match(AS);
						setState(1184);
						((CastExpressionContext)_localctx).right = category_or_any_type();
						}
						break;
					case 29:
						{
						_localctx = new IsNotExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((IsNotExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1185);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(1186);
						match(IS);
						setState(1187);
						match(NOT);
						setState(1188);
						((IsNotExpressionContext)_localctx).right = is_expression();
						}
						break;
					case 30:
						{
						_localctx = new IsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((IsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1189);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1190);
						match(IS);
						setState(1191);
						((IsExpressionContext)_localctx).right = is_expression();
						}
						break;
					}
					} 
				}
				setState(1196);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
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
		enterRule(_localctx, 94, RULE_closure_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1197);
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

			setState(1200);
			((SelectableExpressionContext)_localctx).parent = selectable_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(1206);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SelectorExpressionContext(new Instance_expressionContext(_parentctx, _parentState));
					((SelectorExpressionContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_instance_expression);
					setState(1202);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1203);
					((SelectorExpressionContext)_localctx).selector = instance_selector();
					}
					} 
				}
				setState(1208);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
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
		public Fetch_store_expressionContext fetch_store_expression() {
			return getRuleContext(Fetch_store_expressionContext.class,0);
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
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
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
		enterRule(_localctx, 98, RULE_method_expression);
		try {
			setState(1217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1209);
				blob_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1210);
				document_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1211);
				fetch_store_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1212);
				read_all_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1213);
				read_one_expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1214);
				sorted_expression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1215);
				method_call();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1216);
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
		enterRule(_localctx, 100, RULE_instance_selector);
		try {
			setState(1232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				_localctx = new MemberSelectorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1219);
				if (!(this.wasNot(MParser.WS))) throw new FailedPredicateException(this, "$parser.wasNot(MParser.WS)");
				setState(1220);
				match(DOT);
				setState(1221);
				((MemberSelectorContext)_localctx).name = variable_identifier();
				}
				break;
			case 2:
				_localctx = new SliceSelectorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1222);
				if (!(this.wasNot(MParser.WS))) throw new FailedPredicateException(this, "$parser.wasNot(MParser.WS)");
				setState(1223);
				match(LBRAK);
				setState(1224);
				((SliceSelectorContext)_localctx).xslice = slice_arguments();
				setState(1225);
				match(RBRAK);
				}
				break;
			case 3:
				_localctx = new ItemSelectorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1227);
				if (!(this.wasNot(MParser.WS))) throw new FailedPredicateException(this, "$parser.wasNot(MParser.WS)");
				setState(1228);
				match(LBRAK);
				setState(1229);
				((ItemSelectorContext)_localctx).exp = expression(0);
				setState(1230);
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
		enterRule(_localctx, 102, RULE_blob_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1234);
			match(BLOB);
			setState(1235);
			match(LPAR);
			setState(1237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & ((1L << (EXECUTE - 100)) | (1L << (FETCH - 100)) | (1L << (MUTABLE - 100)) | (1L << (NONE - 100)) | (1L << (NOT - 100)) | (1L << (READ - 100)) | (1L << (SELF - 100)) | (1L << (SORTED - 100)) | (1L << (THIS - 100)) | (1L << (BOOLEAN_LITERAL - 100)) | (1L << (CHAR_LITERAL - 100)) | (1L << (MIN_INTEGER - 100)) | (1L << (MAX_INTEGER - 100)))) != 0) || ((((_la - 164)) & ~0x3f) == 0 && ((1L << (_la - 164)) & ((1L << (SYMBOL_IDENTIFIER - 164)) | (1L << (TYPE_IDENTIFIER - 164)) | (1L << (VARIABLE_IDENTIFIER - 164)) | (1L << (TEXT_LITERAL - 164)) | (1L << (UUID_LITERAL - 164)) | (1L << (INTEGER_LITERAL - 164)) | (1L << (HEXA_LITERAL - 164)) | (1L << (DECIMAL_LITERAL - 164)) | (1L << (DATETIME_LITERAL - 164)) | (1L << (TIME_LITERAL - 164)) | (1L << (DATE_LITERAL - 164)) | (1L << (PERIOD_LITERAL - 164)) | (1L << (VERSION_LITERAL - 164)))) != 0)) {
				{
				setState(1236);
				expression(0);
				}
			}

			setState(1239);
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
		enterRule(_localctx, 104, RULE_document_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1241);
			match(DOCUMENT);
			setState(1242);
			match(LPAR);
			setState(1244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & ((1L << (EXECUTE - 100)) | (1L << (FETCH - 100)) | (1L << (MUTABLE - 100)) | (1L << (NONE - 100)) | (1L << (NOT - 100)) | (1L << (READ - 100)) | (1L << (SELF - 100)) | (1L << (SORTED - 100)) | (1L << (THIS - 100)) | (1L << (BOOLEAN_LITERAL - 100)) | (1L << (CHAR_LITERAL - 100)) | (1L << (MIN_INTEGER - 100)) | (1L << (MAX_INTEGER - 100)))) != 0) || ((((_la - 164)) & ~0x3f) == 0 && ((1L << (_la - 164)) & ((1L << (SYMBOL_IDENTIFIER - 164)) | (1L << (TYPE_IDENTIFIER - 164)) | (1L << (VARIABLE_IDENTIFIER - 164)) | (1L << (TEXT_LITERAL - 164)) | (1L << (UUID_LITERAL - 164)) | (1L << (INTEGER_LITERAL - 164)) | (1L << (HEXA_LITERAL - 164)) | (1L << (DECIMAL_LITERAL - 164)) | (1L << (DATETIME_LITERAL - 164)) | (1L << (TIME_LITERAL - 164)) | (1L << (DATE_LITERAL - 164)) | (1L << (PERIOD_LITERAL - 164)) | (1L << (VERSION_LITERAL - 164)))) != 0)) {
				{
				setState(1243);
				expression(0);
				}
			}

			setState(1246);
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
		enterRule(_localctx, 106, RULE_constructor_expression);
		int _la;
		try {
			setState(1264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				_localctx = new ConstructorFromContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1248);
				((ConstructorFromContext)_localctx).typ = mutable_category_type();
				setState(1249);
				match(LPAR);
				setState(1250);
				((ConstructorFromContext)_localctx).copyExp = copy_from();
				setState(1253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1251);
					match(COMMA);
					setState(1252);
					((ConstructorFromContext)_localctx).args = argument_assignment_list(0);
					}
				}

				setState(1255);
				match(RPAR);
				}
				break;
			case 2:
				_localctx = new ConstructorNoFromContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1257);
				((ConstructorNoFromContext)_localctx).typ = mutable_category_type();
				setState(1258);
				match(LPAR);
				setState(1260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & ((1L << (EXECUTE - 100)) | (1L << (FETCH - 100)) | (1L << (MUTABLE - 100)) | (1L << (NONE - 100)) | (1L << (NOT - 100)) | (1L << (READ - 100)) | (1L << (SELF - 100)) | (1L << (SORTED - 100)) | (1L << (THIS - 100)) | (1L << (BOOLEAN_LITERAL - 100)) | (1L << (CHAR_LITERAL - 100)) | (1L << (MIN_INTEGER - 100)) | (1L << (MAX_INTEGER - 100)))) != 0) || ((((_la - 164)) & ~0x3f) == 0 && ((1L << (_la - 164)) & ((1L << (SYMBOL_IDENTIFIER - 164)) | (1L << (TYPE_IDENTIFIER - 164)) | (1L << (VARIABLE_IDENTIFIER - 164)) | (1L << (TEXT_LITERAL - 164)) | (1L << (UUID_LITERAL - 164)) | (1L << (INTEGER_LITERAL - 164)) | (1L << (HEXA_LITERAL - 164)) | (1L << (DECIMAL_LITERAL - 164)) | (1L << (DATETIME_LITERAL - 164)) | (1L << (TIME_LITERAL - 164)) | (1L << (DATE_LITERAL - 164)) | (1L << (PERIOD_LITERAL - 164)) | (1L << (VERSION_LITERAL - 164)))) != 0)) {
					{
					setState(1259);
					((ConstructorNoFromContext)_localctx).args = argument_assignment_list(0);
					}
				}

				setState(1262);
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
		enterRule(_localctx, 108, RULE_copy_from);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1266);
			match(FROM);
			setState(1267);
			assign();
			setState(1268);
			((Copy_fromContext)_localctx).exp = expression(0);
			setState(1269);
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
		int _startState = 110;
		enterRecursionRule(_localctx, 110, RULE_argument_assignment_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				_localctx = new ExpressionAssignmentListContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1272);
				((ExpressionAssignmentListContext)_localctx).exp = expression(0);
				setState(1273);
				if (!(this.willNotBe(this.equalToken()))) throw new FailedPredicateException(this, "$parser.willNotBe($parser.equalToken())");
				}
				break;
			case 2:
				{
				_localctx = new ArgumentAssignmentListContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1275);
				((ArgumentAssignmentListContext)_localctx).item = argument_assignment();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1283);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArgumentAssignmentListItemContext(new Argument_assignment_listContext(_parentctx, _parentState));
					((ArgumentAssignmentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_argument_assignment_list);
					setState(1278);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1279);
					match(COMMA);
					setState(1280);
					((ArgumentAssignmentListItemContext)_localctx).item = argument_assignment();
					}
					} 
				}
				setState(1285);
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
		enterRule(_localctx, 112, RULE_argument_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1286);
			((Argument_assignmentContext)_localctx).name = variable_identifier();
			setState(1290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(1287);
				assign();
				setState(1288);
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
		enterRule(_localctx, 114, RULE_write_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1292);
			match(WRITE);
			setState(1293);
			((Write_statementContext)_localctx).what = expression(0);
			setState(1294);
			match(TO);
			setState(1295);
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
		public TerminalNode WITH() { return getToken(MParser.WITH, 0); }
		public TerminalNode WHERE() { return getToken(MParser.WHERE, 0); }
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 116, RULE_filtered_list_suffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1297);
			match(FILTERED);
			setState(1298);
			match(WITH);
			setState(1299);
			((Filtered_list_suffixContext)_localctx).name = variable_identifier();
			setState(1300);
			match(WHERE);
			setState(1301);
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

	public static class Fetch_store_expressionContext extends ParserRuleContext {
		public Fetch_store_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fetch_store_expression; }
	 
		public Fetch_store_expressionContext() { }
		public void copyFrom(Fetch_store_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FetchOneContext extends Fetch_store_expressionContext {
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
		public FetchOneContext(Fetch_store_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterFetchOne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitFetchOne(this);
		}
	}
	public static class FetchManyContext extends Fetch_store_expressionContext {
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
		public FetchManyContext(Fetch_store_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterFetchMany(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitFetchMany(this);
		}
	}

	public final Fetch_store_expressionContext fetch_store_expression() throws RecognitionException {
		Fetch_store_expressionContext _localctx = new Fetch_store_expressionContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_fetch_store_expression);
		int _la;
		try {
			setState(1333);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				_localctx = new FetchOneContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1303);
				match(FETCH);
				setState(1304);
				match(ONE);
				setState(1306);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MUTABLE || _la==TYPE_IDENTIFIER) {
					{
					setState(1305);
					((FetchOneContext)_localctx).typ = mutable_category_type();
					}
				}

				setState(1308);
				match(WHERE);
				setState(1309);
				((FetchOneContext)_localctx).predicate = expression(0);
				}
				break;
			case 2:
				_localctx = new FetchManyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1310);
				match(FETCH);
				setState(1317);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ALL:
					{
					setState(1311);
					match(ALL);
					}
					break;
				case ROWS:
					{
					setState(1312);
					match(ROWS);
					setState(1313);
					((FetchManyContext)_localctx).xstart = expression(0);
					setState(1314);
					match(TO);
					setState(1315);
					((FetchManyContext)_localctx).xstop = expression(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1319);
				match(LPAR);
				setState(1321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MUTABLE || _la==TYPE_IDENTIFIER) {
					{
					setState(1320);
					((FetchManyContext)_localctx).typ = mutable_category_type();
					}
				}

				setState(1323);
				match(RPAR);
				setState(1326);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
				case 1:
					{
					setState(1324);
					match(WHERE);
					setState(1325);
					((FetchManyContext)_localctx).predicate = expression(0);
					}
					break;
				}
				setState(1331);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
				case 1:
					{
					setState(1328);
					match(ORDER);
					setState(1329);
					match(BY);
					setState(1330);
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

	public static class Sorted_expressionContext extends ParserRuleContext {
		public Instance_expressionContext source;
		public Instance_expressionContext key;
		public TerminalNode SORTED() { return getToken(MParser.SORTED, 0); }
		public TerminalNode LPAR() { return getToken(MParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(MParser.RPAR, 0); }
		public List<Instance_expressionContext> instance_expression() {
			return getRuleContexts(Instance_expressionContext.class);
		}
		public Instance_expressionContext instance_expression(int i) {
			return getRuleContext(Instance_expressionContext.class,i);
		}
		public TerminalNode DESC() { return getToken(MParser.DESC, 0); }
		public TerminalNode COMMA() { return getToken(MParser.COMMA, 0); }
		public Key_tokenContext key_token() {
			return getRuleContext(Key_tokenContext.class,0);
		}
		public TerminalNode EQ() { return getToken(MParser.EQ, 0); }
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
		enterRule(_localctx, 120, RULE_sorted_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1335);
			match(SORTED);
			setState(1337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DESC) {
				{
				setState(1336);
				match(DESC);
				}
			}

			setState(1339);
			match(LPAR);
			setState(1340);
			((Sorted_expressionContext)_localctx).source = instance_expression(0);
			setState(1346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1341);
				match(COMMA);
				setState(1342);
				key_token();
				setState(1343);
				match(EQ);
				setState(1344);
				((Sorted_expressionContext)_localctx).key = instance_expression(0);
				}
			}

			setState(1348);
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
		enterRule(_localctx, 122, RULE_assign_instance_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1350);
			((Assign_instance_statementContext)_localctx).inst = assignable_instance(0);
			setState(1351);
			assign();
			setState(1352);
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
		enterRule(_localctx, 124, RULE_child_instance);
		try {
			setState(1362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				_localctx = new MemberInstanceContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1354);
				if (!(this.wasNot(MParser.WS))) throw new FailedPredicateException(this, "$parser.wasNot(MParser.WS)");
				setState(1355);
				match(DOT);
				setState(1356);
				((MemberInstanceContext)_localctx).name = variable_identifier();
				}
				break;
			case 2:
				_localctx = new ItemInstanceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1357);
				if (!(this.wasNot(MParser.WS))) throw new FailedPredicateException(this, "$parser.wasNot(MParser.WS)");
				setState(1358);
				match(LBRAK);
				setState(1359);
				((ItemInstanceContext)_localctx).exp = expression(0);
				setState(1360);
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
		enterRule(_localctx, 126, RULE_assign_tuple_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1364);
			((Assign_tuple_statementContext)_localctx).items = variable_identifier_list();
			setState(1365);
			assign();
			setState(1366);
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
		enterRule(_localctx, 128, RULE_lfs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1371);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1368);
					match(LF);
					}
					} 
				}
				setState(1373);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 130, RULE_lfp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1375); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1374);
				match(LF);
				}
				}
				setState(1377); 
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
		enterRule(_localctx, 132, RULE_indent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1380); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1379);
				match(LF);
				}
				}
				setState(1382); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LF );
			setState(1384);
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
		enterRule(_localctx, 134, RULE_dedent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LF) {
				{
				{
				setState(1386);
				match(LF);
				}
				}
				setState(1391);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1392);
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
		enterRule(_localctx, 136, RULE_null_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1394);
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
		enterRule(_localctx, 138, RULE_declaration_list);
		int _la;
		try {
			_localctx = new FullDeclarationListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (ABSTRACT - 69)) | (1L << (ATTR - 69)) | (1L << (CATEGORY - 69)) | (1L << (CLASS - 69)) | (1L << (DEF - 69)) | (1L << (ENUM - 69)) | (1L << (NATIVE - 69)))) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & ((1L << (SINGLETON - 143)) | (1L << (STORABLE - 143)) | (1L << (WIDGET - 143)))) != 0)) {
				{
				setState(1396);
				declarations();
				}
			}

			setState(1399);
			lfs();
			setState(1400);
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
		enterRule(_localctx, 140, RULE_declarations);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1402);
			declaration();
			setState(1408);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1403);
					lfp();
					setState(1404);
					declaration();
					}
					} 
				}
				setState(1410);
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
		enterRule(_localctx, 142, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(1411);
				comment_statement();
				setState(1412);
				lfp();
				}
				}
				setState(1418);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(1419);
				attribute_declaration();
				}
				break;
			case 2:
				{
				setState(1420);
				category_declaration();
				}
				break;
			case 3:
				{
				setState(1421);
				resource_declaration();
				}
				break;
			case 4:
				{
				setState(1422);
				enum_declaration();
				}
				break;
			case 5:
				{
				setState(1423);
				widget_declaration();
				}
				break;
			case 6:
				{
				setState(1424);
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
		enterRule(_localctx, 144, RULE_resource_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1427);
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
		enterRule(_localctx, 146, RULE_enum_declaration);
		try {
			setState(1431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1429);
				enum_category_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1430);
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
		enterRule(_localctx, 148, RULE_native_symbol_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1433);
			native_symbol();
			setState(1439);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1434);
					lfp();
					setState(1435);
					native_symbol();
					}
					} 
				}
				setState(1441);
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
		enterRule(_localctx, 150, RULE_category_symbol_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1442);
			category_symbol();
			setState(1448);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1443);
					lfp();
					setState(1444);
					category_symbol();
					}
					} 
				}
				setState(1450);
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
		enterRule(_localctx, 152, RULE_symbol_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1451);
			symbol_identifier();
			setState(1456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1452);
				match(COMMA);
				setState(1453);
				symbol_identifier();
				}
				}
				setState(1458);
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
		enterRule(_localctx, 154, RULE_attribute_constraint);
		try {
			setState(1469);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				_localctx = new MatchingListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1459);
				match(IN);
				setState(1460);
				((MatchingListContext)_localctx).source = list_literal();
				}
				break;
			case 2:
				_localctx = new MatchingSetContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1461);
				match(IN);
				setState(1462);
				((MatchingSetContext)_localctx).source = set_literal();
				}
				break;
			case 3:
				_localctx = new MatchingRangeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1463);
				match(IN);
				setState(1464);
				((MatchingRangeContext)_localctx).source = range_literal();
				}
				break;
			case 4:
				_localctx = new MatchingPatternContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1465);
				match(MATCHING);
				setState(1466);
				((MatchingPatternContext)_localctx).text = match(TEXT_LITERAL);
				}
				break;
			case 5:
				_localctx = new MatchingExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1467);
				match(MATCHING);
				setState(1468);
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
		enterRule(_localctx, 156, RULE_list_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUTABLE) {
				{
				setState(1471);
				match(MUTABLE);
				}
			}

			setState(1474);
			match(LBRAK);
			setState(1476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & ((1L << (EXECUTE - 100)) | (1L << (FETCH - 100)) | (1L << (MUTABLE - 100)) | (1L << (NONE - 100)) | (1L << (NOT - 100)) | (1L << (READ - 100)) | (1L << (SELF - 100)) | (1L << (SORTED - 100)) | (1L << (THIS - 100)) | (1L << (BOOLEAN_LITERAL - 100)) | (1L << (CHAR_LITERAL - 100)) | (1L << (MIN_INTEGER - 100)) | (1L << (MAX_INTEGER - 100)))) != 0) || ((((_la - 164)) & ~0x3f) == 0 && ((1L << (_la - 164)) & ((1L << (SYMBOL_IDENTIFIER - 164)) | (1L << (TYPE_IDENTIFIER - 164)) | (1L << (VARIABLE_IDENTIFIER - 164)) | (1L << (TEXT_LITERAL - 164)) | (1L << (UUID_LITERAL - 164)) | (1L << (INTEGER_LITERAL - 164)) | (1L << (HEXA_LITERAL - 164)) | (1L << (DECIMAL_LITERAL - 164)) | (1L << (DATETIME_LITERAL - 164)) | (1L << (TIME_LITERAL - 164)) | (1L << (DATE_LITERAL - 164)) | (1L << (PERIOD_LITERAL - 164)) | (1L << (VERSION_LITERAL - 164)))) != 0)) {
				{
				setState(1475);
				expression_list();
				}
			}

			setState(1478);
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
		enterRule(_localctx, 158, RULE_set_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUTABLE) {
				{
				setState(1480);
				match(MUTABLE);
				}
			}

			setState(1483);
			match(LT);
			setState(1485);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & ((1L << (EXECUTE - 100)) | (1L << (FETCH - 100)) | (1L << (MUTABLE - 100)) | (1L << (NONE - 100)) | (1L << (NOT - 100)) | (1L << (READ - 100)) | (1L << (SELF - 100)) | (1L << (SORTED - 100)) | (1L << (THIS - 100)) | (1L << (BOOLEAN_LITERAL - 100)) | (1L << (CHAR_LITERAL - 100)) | (1L << (MIN_INTEGER - 100)) | (1L << (MAX_INTEGER - 100)))) != 0) || ((((_la - 164)) & ~0x3f) == 0 && ((1L << (_la - 164)) & ((1L << (SYMBOL_IDENTIFIER - 164)) | (1L << (TYPE_IDENTIFIER - 164)) | (1L << (VARIABLE_IDENTIFIER - 164)) | (1L << (TEXT_LITERAL - 164)) | (1L << (UUID_LITERAL - 164)) | (1L << (INTEGER_LITERAL - 164)) | (1L << (HEXA_LITERAL - 164)) | (1L << (DECIMAL_LITERAL - 164)) | (1L << (DATETIME_LITERAL - 164)) | (1L << (TIME_LITERAL - 164)) | (1L << (DATE_LITERAL - 164)) | (1L << (PERIOD_LITERAL - 164)) | (1L << (VERSION_LITERAL - 164)))) != 0)) {
				{
				setState(1484);
				expression_list();
				}
			}

			setState(1487);
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
		enterRule(_localctx, 160, RULE_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1489);
			expression(0);
			setState(1494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1490);
				match(COMMA);
				setState(1491);
				expression(0);
				}
				}
				setState(1496);
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
		enterRule(_localctx, 162, RULE_range_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1497);
			match(LBRAK);
			setState(1498);
			((Range_literalContext)_localctx).low = expression(0);
			setState(1499);
			match(RANGE);
			setState(1500);
			((Range_literalContext)_localctx).high = expression(0);
			setState(1501);
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
		public TerminalNode LCURL() { return getToken(MParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(MParser.RCURL, 0); }
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
		int _startState = 164;
		enterRecursionRule(_localctx, 164, RULE_typedef, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1515);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
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
			case HTML:
			case TYPE_IDENTIFIER:
				{
				_localctx = new PrimaryTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1504);
				((PrimaryTypeContext)_localctx).p = primary_type();
				}
				break;
			case CURSOR:
				{
				_localctx = new CursorTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1505);
				match(CURSOR);
				setState(1506);
				match(LT);
				setState(1507);
				((CursorTypeContext)_localctx).c = typedef(0);
				setState(1508);
				match(GT);
				}
				break;
			case ITERATOR:
				{
				_localctx = new IteratorTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1510);
				match(ITERATOR);
				setState(1511);
				match(LT);
				setState(1512);
				((IteratorTypeContext)_localctx).i = typedef(0);
				setState(1513);
				match(GT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1527);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1525);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
					case 1:
						{
						_localctx = new SetTypeContext(new TypedefContext(_parentctx, _parentState));
						((SetTypeContext)_localctx).s = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_typedef);
						setState(1517);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1518);
						match(LTGT);
						}
						break;
					case 2:
						{
						_localctx = new ListTypeContext(new TypedefContext(_parentctx, _parentState));
						((ListTypeContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_typedef);
						setState(1519);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1520);
						match(LBRAK);
						setState(1521);
						match(RBRAK);
						}
						break;
					case 3:
						{
						_localctx = new DictTypeContext(new TypedefContext(_parentctx, _parentState));
						((DictTypeContext)_localctx).d = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_typedef);
						setState(1522);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1523);
						match(LCURL);
						setState(1524);
						match(RCURL);
						}
						break;
					}
					} 
				}
				setState(1529);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
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
		enterRule(_localctx, 166, RULE_primary_type);
		try {
			setState(1532);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
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
			case HTML:
				_localctx = new NativeTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1530);
				((NativeTypeContext)_localctx).n = native_type();
				}
				break;
			case TYPE_IDENTIFIER:
				_localctx = new CategoryTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1531);
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
		enterRule(_localctx, 168, RULE_native_type);
		try {
			setState(1550);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
				_localctx = new BooleanTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1534);
				match(BOOLEAN);
				}
				break;
			case CHARACTER:
				_localctx = new CharacterTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1535);
				match(CHARACTER);
				}
				break;
			case TEXT:
				_localctx = new TextTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1536);
				match(TEXT);
				}
				break;
			case IMAGE:
				_localctx = new ImageTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1537);
				match(IMAGE);
				}
				break;
			case INTEGER:
				_localctx = new IntegerTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1538);
				match(INTEGER);
				}
				break;
			case DECIMAL:
				_localctx = new DecimalTypeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1539);
				match(DECIMAL);
				}
				break;
			case DOCUMENT:
				_localctx = new DocumentTypeContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1540);
				match(DOCUMENT);
				}
				break;
			case DATE:
				_localctx = new DateTypeContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1541);
				match(DATE);
				}
				break;
			case DATETIME:
				_localctx = new DateTimeTypeContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1542);
				match(DATETIME);
				}
				break;
			case TIME:
				_localctx = new TimeTypeContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1543);
				match(TIME);
				}
				break;
			case PERIOD:
				_localctx = new PeriodTypeContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(1544);
				match(PERIOD);
				}
				break;
			case VERSION:
				_localctx = new VersionTypeContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(1545);
				match(VERSION);
				}
				break;
			case CODE:
				_localctx = new CodeTypeContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(1546);
				match(CODE);
				}
				break;
			case BLOB:
				_localctx = new BlobTypeContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(1547);
				match(BLOB);
				}
				break;
			case UUID:
				_localctx = new UUIDTypeContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(1548);
				match(UUID);
				}
				break;
			case HTML:
				_localctx = new HtmlTypeContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(1549);
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
		enterRule(_localctx, 170, RULE_category_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1552);
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
		enterRule(_localctx, 172, RULE_mutable_category_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1555);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUTABLE) {
				{
				setState(1554);
				match(MUTABLE);
				}
			}

			setState(1557);
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
		enterRule(_localctx, 174, RULE_code_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1559);
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
		enterRule(_localctx, 176, RULE_category_declaration);
		try {
			setState(1564);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				_localctx = new ConcreteCategoryDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1561);
				((ConcreteCategoryDeclarationContext)_localctx).decl = concrete_category_declaration();
				}
				break;
			case 2:
				_localctx = new NativeCategoryDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1562);
				((NativeCategoryDeclarationContext)_localctx).decl = native_category_declaration();
				}
				break;
			case 3:
				_localctx = new SingletonCategoryDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1563);
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

	public final Widget_declarationContext widget_declaration() throws RecognitionException {
		Widget_declarationContext _localctx = new Widget_declarationContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_widget_declaration);
		try {
			_localctx = new ConcreteWidgetDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1566);
			((ConcreteWidgetDeclarationContext)_localctx).decl = concrete_widget_declaration();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 180, RULE_type_identifier_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1568);
			type_identifier();
			setState(1573);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1569);
					match(COMMA);
					setState(1570);
					type_identifier();
					}
					} 
				}
				setState(1575);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 182, RULE_method_identifier);
		try {
			setState(1578);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1576);
				variable_identifier();
				}
				break;
			case TYPE_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1577);
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
		enterRule(_localctx, 184, RULE_identifier_or_keyword);
		try {
			setState(1582);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SYMBOL_IDENTIFIER:
			case TYPE_IDENTIFIER:
			case VARIABLE_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1580);
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
			case METHOD_T:
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
			case INVOKE:
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
				setState(1581);
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
		enterRule(_localctx, 186, RULE_nospace_hyphen_identifier_or_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1584);
			if (!(this.wasNotWhiteSpace())) throw new FailedPredicateException(this, "$parser.wasNotWhiteSpace()");
			setState(1585);
			match(MINUS);
			setState(1586);
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
		enterRule(_localctx, 188, RULE_nospace_identifier_or_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1588);
			if (!(this.wasNotWhiteSpace())) throw new FailedPredicateException(this, "$parser.wasNotWhiteSpace()");
			setState(1589);
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
		enterRule(_localctx, 190, RULE_identifier);
		try {
			setState(1594);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE_IDENTIFIER:
				_localctx = new VariableIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1591);
				variable_identifier();
				}
				break;
			case TYPE_IDENTIFIER:
				_localctx = new TypeIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1592);
				type_identifier();
				}
				break;
			case SYMBOL_IDENTIFIER:
				_localctx = new SymbolIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1593);
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
		enterRule(_localctx, 192, RULE_variable_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1596);
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
		enterRule(_localctx, 194, RULE_attribute_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1598);
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
		enterRule(_localctx, 196, RULE_type_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1600);
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
		enterRule(_localctx, 198, RULE_symbol_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1602);
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
		enterRule(_localctx, 200, RULE_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1604);
			argument();
			setState(1609);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1605);
				match(COMMA);
				setState(1606);
				argument();
				}
				}
				setState(1611);
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
		enterRule(_localctx, 202, RULE_argument);
		int _la;
		try {
			setState(1617);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CODE:
				_localctx = new CodeArgumentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1612);
				((CodeArgumentContext)_localctx).arg = code_argument();
				}
				break;
			case MUTABLE:
			case VARIABLE_IDENTIFIER:
				_localctx = new OperatorArgumentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1614);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MUTABLE) {
					{
					setState(1613);
					match(MUTABLE);
					}
				}

				setState(1616);
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
		enterRule(_localctx, 204, RULE_operator_argument);
		try {
			setState(1621);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1619);
				named_argument();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1620);
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
		enterRule(_localctx, 206, RULE_named_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1623);
			variable_identifier();
			setState(1626);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(1624);
				match(EQ);
				setState(1625);
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
		enterRule(_localctx, 208, RULE_code_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1628);
			code_type();
			setState(1629);
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
		enterRule(_localctx, 210, RULE_category_or_any_type);
		try {
			setState(1633);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
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
			case TYPE_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1631);
				typedef(0);
				}
				break;
			case ANY:
				enterOuterAlt(_localctx, 2);
				{
				setState(1632);
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
		int _startState = 212;
		enterRecursionRule(_localctx, 212, RULE_any_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AnyTypeContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1636);
			match(ANY);
			}
			_ctx.stop = _input.LT(-1);
			setState(1646);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1644);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
					case 1:
						{
						_localctx = new AnyListTypeContext(new Any_typeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_any_type);
						setState(1638);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1639);
						match(LBRAK);
						setState(1640);
						match(RBRAK);
						}
						break;
					case 2:
						{
						_localctx = new AnyDictTypeContext(new Any_typeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_any_type);
						setState(1641);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1642);
						match(LCURL);
						setState(1643);
						match(RCURL);
						}
						break;
					}
					} 
				}
				setState(1648);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
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
		enterRule(_localctx, 214, RULE_member_method_declaration_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1649);
			member_method_declaration();
			setState(1655);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1650);
					lfp();
					setState(1651);
					member_method_declaration();
					}
					} 
				}
				setState(1657);
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
		enterRule(_localctx, 216, RULE_member_method_declaration);
		try {
			setState(1663);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1658);
				setter_method_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1659);
				getter_method_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1660);
				concrete_method_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1661);
				abstract_method_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1662);
				operator_method_declaration();
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
		enterRule(_localctx, 218, RULE_native_member_method_declaration_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1665);
			native_member_method_declaration();
			setState(1671);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1666);
					lfp();
					setState(1667);
					native_member_method_declaration();
					}
					} 
				}
				setState(1673);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 220, RULE_native_member_method_declaration);
		try {
			setState(1677);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1674);
				native_getter_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1675);
				native_setter_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1676);
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
		enterRule(_localctx, 222, RULE_native_category_binding);
		try {
			setState(1689);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JAVA:
				_localctx = new JavaCategoryBindingContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1679);
				match(JAVA);
				setState(1680);
				((JavaCategoryBindingContext)_localctx).binding = java_class_identifier_expression(0);
				}
				break;
			case CSHARP:
				_localctx = new CSharpCategoryBindingContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1681);
				match(CSHARP);
				setState(1682);
				((CSharpCategoryBindingContext)_localctx).binding = csharp_identifier_expression(0);
				}
				break;
			case PYTHON2:
				_localctx = new Python2CategoryBindingContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1683);
				match(PYTHON2);
				setState(1684);
				((Python2CategoryBindingContext)_localctx).binding = python_category_binding();
				}
				break;
			case PYTHON3:
				_localctx = new Python3CategoryBindingContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1685);
				match(PYTHON3);
				setState(1686);
				((Python3CategoryBindingContext)_localctx).binding = python_category_binding();
				}
				break;
			case JAVASCRIPT:
				_localctx = new JavaScriptCategoryBindingContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1687);
				match(JAVASCRIPT);
				setState(1688);
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
		enterRule(_localctx, 224, RULE_python_category_binding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1691);
			identifier();
			setState(1693);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				{
				setState(1692);
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
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
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
		enterRule(_localctx, 226, RULE_python_module);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1695);
			match(FROM);
			setState(1696);
			module_token();
			setState(1697);
			match(COLON);
			setState(1698);
			identifier();
			setState(1703);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1699);
					match(DOT);
					setState(1700);
					identifier();
					}
					} 
				}
				setState(1705);
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

	public static class Javascript_category_bindingContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
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
		enterRule(_localctx, 228, RULE_javascript_category_binding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1706);
			identifier();
			setState(1708);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				{
				setState(1707);
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
		enterRule(_localctx, 230, RULE_javascript_module);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1710);
			match(FROM);
			setState(1711);
			module_token();
			setState(1712);
			match(COLON);
			setState(1714);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SLASH) {
				{
				setState(1713);
				match(SLASH);
				}
			}

			setState(1716);
			javascript_identifier();
			setState(1721);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1717);
					match(SLASH);
					setState(1718);
					javascript_identifier();
					}
					} 
				}
				setState(1723);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
			}
			setState(1726);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				{
				setState(1724);
				match(DOT);
				setState(1725);
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
		enterRule(_localctx, 232, RULE_variable_identifier_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1728);
			variable_identifier();
			setState(1733);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1729);
				match(COMMA);
				setState(1730);
				variable_identifier();
				}
				}
				setState(1735);
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
		enterRule(_localctx, 234, RULE_attribute_identifier_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1736);
			attribute_identifier();
			setState(1741);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1737);
				match(COMMA);
				setState(1738);
				attribute_identifier();
				}
				}
				setState(1743);
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
		enterRule(_localctx, 236, RULE_method_declaration);
		try {
			setState(1748);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1744);
				abstract_method_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1745);
				concrete_method_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1746);
				native_method_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1747);
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
		enterRule(_localctx, 238, RULE_comment_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1750);
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
		enterRule(_localctx, 240, RULE_native_statement_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1752);
			native_statement();
			setState(1758);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1753);
					lfp();
					setState(1754);
					native_statement();
					}
					} 
				}
				setState(1760);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 242, RULE_native_statement);
		try {
			setState(1771);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JAVA:
				_localctx = new JavaNativeStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1761);
				match(JAVA);
				setState(1762);
				java_statement();
				}
				break;
			case CSHARP:
				_localctx = new CSharpNativeStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1763);
				match(CSHARP);
				setState(1764);
				csharp_statement();
				}
				break;
			case PYTHON2:
				_localctx = new Python2NativeStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1765);
				match(PYTHON2);
				setState(1766);
				python_native_statement();
				}
				break;
			case PYTHON3:
				_localctx = new Python3NativeStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1767);
				match(PYTHON3);
				setState(1768);
				python_native_statement();
				}
				break;
			case JAVASCRIPT:
				_localctx = new JavaScriptNativeStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1769);
				match(JAVASCRIPT);
				setState(1770);
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
		enterRule(_localctx, 244, RULE_python_native_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1773);
			python_statement();
			setState(1775);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1774);
				match(SEMI);
				}
			}

			setState(1778);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(1777);
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
		enterRule(_localctx, 246, RULE_javascript_native_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1780);
			javascript_statement();
			setState(1782);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1781);
				match(SEMI);
				}
			}

			setState(1785);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(1784);
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
		enterRule(_localctx, 248, RULE_statement_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1787);
			statement();
			setState(1793);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1788);
					lfp();
					setState(1789);
					statement();
					}
					} 
				}
				setState(1795);
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
		enterRule(_localctx, 250, RULE_assertion_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1796);
			assertion();
			setState(1802);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,133,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1797);
					lfp();
					setState(1798);
					assertion();
					}
					} 
				}
				setState(1804);
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
		enterRule(_localctx, 252, RULE_switch_case_statement_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1805);
			switch_case_statement();
			setState(1811);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1806);
					lfp();
					setState(1807);
					switch_case_statement();
					}
					} 
				}
				setState(1813);
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
		enterRule(_localctx, 254, RULE_catch_statement_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1814);
			catch_statement();
			setState(1820);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1815);
					lfp();
					setState(1816);
					catch_statement();
					}
					} 
				}
				setState(1822);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 256, RULE_literal_collection);
		try {
			setState(1837);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				_localctx = new LiteralRangeLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1823);
				match(LBRAK);
				setState(1824);
				((LiteralRangeLiteralContext)_localctx).low = atomic_literal();
				setState(1825);
				match(RANGE);
				setState(1826);
				((LiteralRangeLiteralContext)_localctx).high = atomic_literal();
				setState(1827);
				match(RBRAK);
				}
				break;
			case 2:
				_localctx = new LiteralListLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1829);
				match(LBRAK);
				setState(1830);
				literal_list_literal();
				setState(1831);
				match(RBRAK);
				}
				break;
			case 3:
				_localctx = new LiteralSetLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1833);
				match(LT);
				setState(1834);
				literal_list_literal();
				setState(1835);
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
		public Token t;
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
		public Token t;
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
		public Token t;
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
		public Token t;
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
		public Token t;
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
		public Token t;
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
		public Token t;
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
	public static class DateTimeLiteralContext extends Atomic_literalContext {
		public Token t;
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
		public Token t;
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
		public Token t;
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
		public Token t;
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
		public Null_literalContext n;
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
		public Token t;
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
		public Token t;
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
		public Token t;
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
		enterRule(_localctx, 258, RULE_atomic_literal);
		try {
			setState(1854);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MIN_INTEGER:
				_localctx = new MinIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1839);
				((MinIntegerLiteralContext)_localctx).t = match(MIN_INTEGER);
				}
				break;
			case MAX_INTEGER:
				_localctx = new MaxIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1840);
				((MaxIntegerLiteralContext)_localctx).t = match(MAX_INTEGER);
				}
				break;
			case INTEGER_LITERAL:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1841);
				((IntegerLiteralContext)_localctx).t = match(INTEGER_LITERAL);
				}
				break;
			case HEXA_LITERAL:
				_localctx = new HexadecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1842);
				((HexadecimalLiteralContext)_localctx).t = match(HEXA_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new CharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1843);
				((CharacterLiteralContext)_localctx).t = match(CHAR_LITERAL);
				}
				break;
			case DATE_LITERAL:
				_localctx = new DateLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1844);
				((DateLiteralContext)_localctx).t = match(DATE_LITERAL);
				}
				break;
			case TIME_LITERAL:
				_localctx = new TimeLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1845);
				((TimeLiteralContext)_localctx).t = match(TIME_LITERAL);
				}
				break;
			case TEXT_LITERAL:
				_localctx = new TextLiteralContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1846);
				((TextLiteralContext)_localctx).t = match(TEXT_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1847);
				((DecimalLiteralContext)_localctx).t = match(DECIMAL_LITERAL);
				}
				break;
			case DATETIME_LITERAL:
				_localctx = new DateTimeLiteralContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1848);
				((DateTimeLiteralContext)_localctx).t = match(DATETIME_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(1849);
				((BooleanLiteralContext)_localctx).t = match(BOOLEAN_LITERAL);
				}
				break;
			case PERIOD_LITERAL:
				_localctx = new PeriodLiteralContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(1850);
				((PeriodLiteralContext)_localctx).t = match(PERIOD_LITERAL);
				}
				break;
			case VERSION_LITERAL:
				_localctx = new VersionLiteralContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(1851);
				((VersionLiteralContext)_localctx).t = match(VERSION_LITERAL);
				}
				break;
			case UUID_LITERAL:
				_localctx = new UUIDLiteralContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(1852);
				((UUIDLiteralContext)_localctx).t = match(UUID_LITERAL);
				}
				break;
			case NONE:
				_localctx = new NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(1853);
				((NullLiteralContext)_localctx).n = null_literal();
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
		enterRule(_localctx, 260, RULE_literal_list_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1856);
			atomic_literal();
			setState(1861);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1857);
				match(COMMA);
				setState(1858);
				atomic_literal();
				}
				}
				setState(1863);
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
		enterRule(_localctx, 262, RULE_selectable_expression);
		try {
			setState(1868);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				_localctx = new ParenthesisExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1864);
				((ParenthesisExpressionContext)_localctx).exp = parenthesis_expression();
				}
				break;
			case 2:
				_localctx = new LiteralExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1865);
				((LiteralExpressionContext)_localctx).exp = literal_expression();
				}
				break;
			case 3:
				_localctx = new IdentifierExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1866);
				((IdentifierExpressionContext)_localctx).exp = identifier();
				}
				break;
			case 4:
				_localctx = new ThisExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1867);
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
		enterRule(_localctx, 264, RULE_this_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1870);
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
		enterRule(_localctx, 266, RULE_parenthesis_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1872);
			match(LPAR);
			setState(1873);
			expression(0);
			setState(1874);
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
		enterRule(_localctx, 268, RULE_literal_expression);
		try {
			setState(1878);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONE:
			case BOOLEAN_LITERAL:
			case CHAR_LITERAL:
			case MIN_INTEGER:
			case MAX_INTEGER:
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
				setState(1876);
				atomic_literal();
				}
				break;
			case LPAR:
			case LBRAK:
			case LCURL:
			case LT:
			case MUTABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1877);
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
		enterRule(_localctx, 270, RULE_collection_literal);
		try {
			setState(1885);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1880);
				range_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1881);
				list_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1882);
				set_literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1883);
				dict_literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1884);
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
		enterRule(_localctx, 272, RULE_tuple_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1888);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUTABLE) {
				{
				setState(1887);
				match(MUTABLE);
				}
			}

			setState(1890);
			match(LPAR);
			setState(1892);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & ((1L << (EXECUTE - 100)) | (1L << (FETCH - 100)) | (1L << (MUTABLE - 100)) | (1L << (NONE - 100)) | (1L << (NOT - 100)) | (1L << (READ - 100)) | (1L << (SELF - 100)) | (1L << (SORTED - 100)) | (1L << (THIS - 100)) | (1L << (BOOLEAN_LITERAL - 100)) | (1L << (CHAR_LITERAL - 100)) | (1L << (MIN_INTEGER - 100)) | (1L << (MAX_INTEGER - 100)))) != 0) || ((((_la - 164)) & ~0x3f) == 0 && ((1L << (_la - 164)) & ((1L << (SYMBOL_IDENTIFIER - 164)) | (1L << (TYPE_IDENTIFIER - 164)) | (1L << (VARIABLE_IDENTIFIER - 164)) | (1L << (TEXT_LITERAL - 164)) | (1L << (UUID_LITERAL - 164)) | (1L << (INTEGER_LITERAL - 164)) | (1L << (HEXA_LITERAL - 164)) | (1L << (DECIMAL_LITERAL - 164)) | (1L << (DATETIME_LITERAL - 164)) | (1L << (TIME_LITERAL - 164)) | (1L << (DATE_LITERAL - 164)) | (1L << (PERIOD_LITERAL - 164)) | (1L << (VERSION_LITERAL - 164)))) != 0)) {
				{
				setState(1891);
				expression_tuple();
				}
			}

			setState(1894);
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
		public TerminalNode LCURL() { return getToken(MParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(MParser.RCURL, 0); }
		public TerminalNode MUTABLE() { return getToken(MParser.MUTABLE, 0); }
		public Dict_entry_listContext dict_entry_list() {
			return getRuleContext(Dict_entry_listContext.class,0);
		}
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
		enterRule(_localctx, 274, RULE_dict_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1897);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUTABLE) {
				{
				setState(1896);
				match(MUTABLE);
				}
			}

			setState(1899);
			match(LCURL);
			setState(1901);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & ((1L << (EXECUTE - 100)) | (1L << (FETCH - 100)) | (1L << (MUTABLE - 100)) | (1L << (NONE - 100)) | (1L << (NOT - 100)) | (1L << (READ - 100)) | (1L << (SELF - 100)) | (1L << (SORTED - 100)) | (1L << (THIS - 100)) | (1L << (BOOLEAN_LITERAL - 100)) | (1L << (CHAR_LITERAL - 100)) | (1L << (MIN_INTEGER - 100)) | (1L << (MAX_INTEGER - 100)))) != 0) || ((((_la - 164)) & ~0x3f) == 0 && ((1L << (_la - 164)) & ((1L << (SYMBOL_IDENTIFIER - 164)) | (1L << (TYPE_IDENTIFIER - 164)) | (1L << (VARIABLE_IDENTIFIER - 164)) | (1L << (TEXT_LITERAL - 164)) | (1L << (UUID_LITERAL - 164)) | (1L << (INTEGER_LITERAL - 164)) | (1L << (HEXA_LITERAL - 164)) | (1L << (DECIMAL_LITERAL - 164)) | (1L << (DATETIME_LITERAL - 164)) | (1L << (TIME_LITERAL - 164)) | (1L << (DATE_LITERAL - 164)) | (1L << (PERIOD_LITERAL - 164)) | (1L << (VERSION_LITERAL - 164)))) != 0)) {
				{
				setState(1900);
				dict_entry_list();
				}
			}

			setState(1903);
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
		enterRule(_localctx, 276, RULE_expression_tuple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1905);
			expression(0);
			setState(1906);
			match(COMMA);
			setState(1915);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & ((1L << (EXECUTE - 100)) | (1L << (FETCH - 100)) | (1L << (MUTABLE - 100)) | (1L << (NONE - 100)) | (1L << (NOT - 100)) | (1L << (READ - 100)) | (1L << (SELF - 100)) | (1L << (SORTED - 100)) | (1L << (THIS - 100)) | (1L << (BOOLEAN_LITERAL - 100)) | (1L << (CHAR_LITERAL - 100)) | (1L << (MIN_INTEGER - 100)) | (1L << (MAX_INTEGER - 100)))) != 0) || ((((_la - 164)) & ~0x3f) == 0 && ((1L << (_la - 164)) & ((1L << (SYMBOL_IDENTIFIER - 164)) | (1L << (TYPE_IDENTIFIER - 164)) | (1L << (VARIABLE_IDENTIFIER - 164)) | (1L << (TEXT_LITERAL - 164)) | (1L << (UUID_LITERAL - 164)) | (1L << (INTEGER_LITERAL - 164)) | (1L << (HEXA_LITERAL - 164)) | (1L << (DECIMAL_LITERAL - 164)) | (1L << (DATETIME_LITERAL - 164)) | (1L << (TIME_LITERAL - 164)) | (1L << (DATE_LITERAL - 164)) | (1L << (PERIOD_LITERAL - 164)) | (1L << (VERSION_LITERAL - 164)))) != 0)) {
				{
				setState(1907);
				expression(0);
				setState(1912);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1908);
					match(COMMA);
					setState(1909);
					expression(0);
					}
					}
					setState(1914);
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
		enterRule(_localctx, 278, RULE_dict_entry_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1917);
			dict_entry();
			setState(1922);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1918);
				match(COMMA);
				setState(1919);
				dict_entry();
				}
				}
				setState(1924);
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
		public ExpressionContext key;
		public ExpressionContext value;
		public TerminalNode COLON() { return getToken(MParser.COLON, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
		enterRule(_localctx, 280, RULE_dict_entry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1925);
			((Dict_entryContext)_localctx).key = expression(0);
			setState(1926);
			match(COLON);
			setState(1927);
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
		enterRule(_localctx, 282, RULE_slice_arguments);
		try {
			setState(1938);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				_localctx = new SliceFirstAndLastContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1929);
				((SliceFirstAndLastContext)_localctx).first = expression(0);
				setState(1930);
				match(COLON);
				setState(1931);
				((SliceFirstAndLastContext)_localctx).last = expression(0);
				}
				break;
			case 2:
				_localctx = new SliceFirstOnlyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1933);
				((SliceFirstOnlyContext)_localctx).first = expression(0);
				setState(1934);
				match(COLON);
				}
				break;
			case 3:
				_localctx = new SliceLastOnlyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1936);
				match(COLON);
				setState(1937);
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
		enterRule(_localctx, 284, RULE_assign_variable_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1940);
			variable_identifier();
			setState(1941);
			assign();
			setState(1942);
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
		int _startState = 286;
		enterRecursionRule(_localctx, 286, RULE_assignable_instance, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new RootInstanceContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1945);
			variable_identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(1951);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ChildInstanceContext(new Assignable_instanceContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_assignable_instance);
					setState(1947);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1948);
					child_instance();
					}
					} 
				}
				setState(1953);
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
		enterRule(_localctx, 288, RULE_is_expression);
		try {
			setState(1958);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				_localctx = new IsATypeExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1954);
				if (!(this.willBeAOrAn())) throw new FailedPredicateException(this, "$parser.willBeAOrAn()");
				setState(1955);
				match(VARIABLE_IDENTIFIER);
				setState(1956);
				category_or_any_type();
				}
				break;
			case 2:
				_localctx = new IsOtherExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1957);
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
		enterRule(_localctx, 290, RULE_read_all_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1960);
			match(READ);
			setState(1961);
			match(ALL);
			setState(1962);
			match(FROM);
			setState(1963);
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
		enterRule(_localctx, 292, RULE_read_one_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1965);
			match(READ);
			setState(1966);
			match(ONE);
			setState(1967);
			match(FROM);
			setState(1968);
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
		enterRule(_localctx, 294, RULE_order_by_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1970);
			order_by();
			setState(1975);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1971);
					match(COMMA);
					setState(1972);
					order_by();
					}
					} 
				}
				setState(1977);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 296, RULE_order_by);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1978);
			variable_identifier();
			setState(1983);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1979);
					match(DOT);
					setState(1980);
					variable_identifier();
					}
					} 
				}
				setState(1985);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
			}
			setState(1987);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				{
				setState(1986);
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
		enterRule(_localctx, 298, RULE_operator);
		try {
			setState(1995);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				_localctx = new OperatorPlusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1989);
				match(PLUS);
				}
				break;
			case MINUS:
				_localctx = new OperatorMinusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1990);
				match(MINUS);
				}
				break;
			case STAR:
				_localctx = new OperatorMultiplyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1991);
				multiply();
				}
				break;
			case SLASH:
				_localctx = new OperatorDivideContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1992);
				divide();
				}
				break;
			case BSLASH:
				_localctx = new OperatorIDivideContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1993);
				idivide();
				}
				break;
			case PERCENT:
			case MODULO:
				_localctx = new OperatorModuloContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1994);
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
		public TerminalNode METHOD_T() { return getToken(MParser.METHOD_T, 0); }
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
		public TerminalNode INVOKE() { return getToken(MParser.INVOKE, 0); }
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
		enterRule(_localctx, 300, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1997);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA) | (1L << CSHARP) | (1L << PYTHON2) | (1L << PYTHON3) | (1L << JAVASCRIPT) | (1L << SWIFT) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << METHOD_T) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (ABSTRACT - 64)) | (1L << (ALL - 64)) | (1L << (ALWAYS - 64)) | (1L << (AND - 64)) | (1L << (ANY - 64)) | (1L << (AS - 64)) | (1L << (ASC - 64)) | (1L << (ATTR - 64)) | (1L << (ATTRIBUTE - 64)) | (1L << (ATTRIBUTES - 64)) | (1L << (BINDINGS - 64)) | (1L << (BREAK - 64)) | (1L << (BY - 64)) | (1L << (CASE - 64)) | (1L << (CATCH - 64)) | (1L << (CATEGORY - 64)) | (1L << (CLASS - 64)) | (1L << (CLOSE - 64)) | (1L << (CONTAINS - 64)) | (1L << (DEF - 64)) | (1L << (DEFAULT - 64)) | (1L << (DEFINE - 64)) | (1L << (DELETE - 64)) | (1L << (DESC - 64)) | (1L << (DO - 64)) | (1L << (DOING - 64)) | (1L << (EACH - 64)) | (1L << (ELSE - 64)) | (1L << (ENUM - 64)) | (1L << (ENUMERATED - 64)) | (1L << (EXCEPT - 64)) | (1L << (EXECUTE - 64)) | (1L << (EXPECTING - 64)) | (1L << (EXTENDS - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (FINALLY - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (FROM - 64)) | (1L << (GETTER - 64)) | (1L << (HAS - 64)) | (1L << (IF - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INVOKE - 64)) | (1L << (IS - 64)) | (1L << (MATCHING - 64)) | (1L << (METHOD - 64)) | (1L << (METHODS - 64)) | (1L << (MODULO - 64)) | (1L << (MUTABLE - 64)) | (1L << (NATIVE - 64)) | (1L << (NONE - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)) | (1L << (ON - 64)) | (1L << (ONE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (OPEN - 128)) | (1L << (OPERATOR - 128)) | (1L << (OR - 128)) | (1L << (ORDER - 128)) | (1L << (OTHERWISE - 128)) | (1L << (PASS - 128)) | (1L << (RAISE - 128)) | (1L << (READ - 128)) | (1L << (RECEIVING - 128)) | (1L << (RESOURCE - 128)) | (1L << (RETURN - 128)) | (1L << (RETURNING - 128)) | (1L << (ROWS - 128)) | (1L << (SELF - 128)) | (1L << (SETTER - 128)) | (1L << (SINGLETON - 128)) | (1L << (SORTED - 128)) | (1L << (STORABLE - 128)) | (1L << (STORE - 128)) | (1L << (SWITCH - 128)) | (1L << (TEST - 128)) | (1L << (THIS - 128)) | (1L << (THROW - 128)) | (1L << (TO - 128)) | (1L << (TRY - 128)) | (1L << (VERIFYING - 128)) | (1L << (WIDGET - 128)) | (1L << (WITH - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WHILE - 128)) | (1L << (WRITE - 128)))) != 0)) ) {
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
		enterRule(_localctx, 302, RULE_new_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1999);
			((New_tokenContext)_localctx).i1 = match(VARIABLE_IDENTIFIER);
			setState(2000);
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
		enterRule(_localctx, 304, RULE_key_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2002);
			((Key_tokenContext)_localctx).i1 = match(VARIABLE_IDENTIFIER);
			setState(2003);
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
		enterRule(_localctx, 306, RULE_module_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2005);
			((Module_tokenContext)_localctx).i1 = match(VARIABLE_IDENTIFIER);
			setState(2006);
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
		enterRule(_localctx, 308, RULE_value_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2008);
			((Value_tokenContext)_localctx).i1 = match(VARIABLE_IDENTIFIER);
			setState(2009);
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
		enterRule(_localctx, 310, RULE_symbols_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2011);
			((Symbols_tokenContext)_localctx).i1 = match(VARIABLE_IDENTIFIER);
			setState(2012);
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
		enterRule(_localctx, 312, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2014);
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
		enterRule(_localctx, 314, RULE_multiply);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2016);
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
		enterRule(_localctx, 316, RULE_divide);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2018);
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
		enterRule(_localctx, 318, RULE_idivide);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2020);
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
		enterRule(_localctx, 320, RULE_modulo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2022);
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

	public static class Native_widget_declarationContext extends ParserRuleContext {
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
		enterRule(_localctx, 322, RULE_native_widget_declaration);
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
		enterRule(_localctx, 324, RULE_javascript_statement);
		try {
			setState(2033);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
				_localctx = new JavascriptReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2026);
				match(RETURN);
				setState(2027);
				((JavascriptReturnStatementContext)_localctx).exp = javascript_expression(0);
				setState(2028);
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
				setState(2030);
				((JavascriptStatementContext)_localctx).exp = javascript_expression(0);
				setState(2031);
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
		int _startState = 326;
		enterRecursionRule(_localctx, 326, RULE_javascript_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavascriptPrimaryExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2036);
			((JavascriptPrimaryExpressionContext)_localctx).exp = javascript_primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(2042);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavascriptSelectorExpressionContext(new Javascript_expressionContext(_parentctx, _parentState));
					((JavascriptSelectorExpressionContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_javascript_expression);
					setState(2038);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2039);
					((JavascriptSelectorExpressionContext)_localctx).child = javascript_selector_expression();
					}
					} 
				}
				setState(2044);
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
		enterRule(_localctx, 328, RULE_javascript_primary_expression);
		try {
			setState(2052);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2045);
				javascript_this_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2046);
				javascript_new_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2047);
				javascript_parenthesis_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2048);
				javascript_identifier_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2049);
				javascript_literal_expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2050);
				javascript_method_expression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2051);
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
		enterRule(_localctx, 330, RULE_javascript_this_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2054);
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
		enterRule(_localctx, 332, RULE_javascript_new_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2056);
			new_token();
			setState(2057);
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
		enterRule(_localctx, 334, RULE_javascript_selector_expression);
		try {
			setState(2064);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				_localctx = new JavaScriptMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2059);
				match(DOT);
				setState(2060);
				((JavaScriptMethodExpressionContext)_localctx).method = javascript_method_expression();
				}
				break;
			case 2:
				_localctx = new JavaScriptMemberExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2061);
				match(DOT);
				setState(2062);
				((JavaScriptMemberExpressionContext)_localctx).name = javascript_identifier();
				}
				break;
			case 3:
				_localctx = new JavaScriptItemExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2063);
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
		enterRule(_localctx, 336, RULE_javascript_method_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2066);
			((Javascript_method_expressionContext)_localctx).name = javascript_identifier();
			setState(2067);
			match(LPAR);
			setState(2069);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (LPAR - 20)) | (1L << (LBRAK - 20)) | (1L << (BOOLEAN - 20)) | (1L << (CHARACTER - 20)) | (1L << (TEXT - 20)) | (1L << (INTEGER - 20)) | (1L << (DECIMAL - 20)) | (1L << (DATE - 20)) | (1L << (TIME - 20)) | (1L << (DATETIME - 20)) | (1L << (PERIOD - 20)) | (1L << (VERSION - 20)) | (1L << (UUID - 20)) | (1L << (HTML - 20)))) != 0) || ((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & ((1L << (NONE - 122)) | (1L << (NULL - 122)) | (1L << (READ - 122)) | (1L << (SELF - 122)) | (1L << (TEST - 122)) | (1L << (THIS - 122)) | (1L << (WRITE - 122)) | (1L << (BOOLEAN_LITERAL - 122)) | (1L << (CHAR_LITERAL - 122)) | (1L << (SYMBOL_IDENTIFIER - 122)) | (1L << (TYPE_IDENTIFIER - 122)) | (1L << (VARIABLE_IDENTIFIER - 122)) | (1L << (DOLLAR_IDENTIFIER - 122)) | (1L << (TEXT_LITERAL - 122)) | (1L << (INTEGER_LITERAL - 122)) | (1L << (DECIMAL_LITERAL - 122)))) != 0)) {
				{
				setState(2068);
				((Javascript_method_expressionContext)_localctx).args = javascript_arguments(0);
				}
			}

			setState(2071);
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
		int _startState = 338;
		enterRecursionRule(_localctx, 338, RULE_javascript_arguments, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavascriptArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2074);
			((JavascriptArgumentListContext)_localctx).item = javascript_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2081);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavascriptArgumentListItemContext(new Javascript_argumentsContext(_parentctx, _parentState));
					((JavascriptArgumentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_javascript_arguments);
					setState(2076);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2077);
					match(COMMA);
					setState(2078);
					((JavascriptArgumentListItemContext)_localctx).item = javascript_expression(0);
					}
					} 
				}
				setState(2083);
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
		enterRule(_localctx, 340, RULE_javascript_item_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2084);
			match(LBRAK);
			setState(2085);
			((Javascript_item_expressionContext)_localctx).exp = javascript_expression(0);
			setState(2086);
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
		enterRule(_localctx, 342, RULE_javascript_parenthesis_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2088);
			match(LPAR);
			setState(2089);
			((Javascript_parenthesis_expressionContext)_localctx).exp = javascript_expression(0);
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
		enterRule(_localctx, 344, RULE_javascript_identifier_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2092);
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
		enterRule(_localctx, 346, RULE_javascript_literal_expression);
		try {
			setState(2099);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				_localctx = new JavascriptIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2094);
				((JavascriptIntegerLiteralContext)_localctx).t = match(INTEGER_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				_localctx = new JavascriptDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2095);
				((JavascriptDecimalLiteralContext)_localctx).t = match(DECIMAL_LITERAL);
				}
				break;
			case TEXT_LITERAL:
				_localctx = new JavascriptTextLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2096);
				((JavascriptTextLiteralContext)_localctx).t = match(TEXT_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new JavascriptBooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2097);
				((JavascriptBooleanLiteralContext)_localctx).t = match(BOOLEAN_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new JavascriptCharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2098);
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
		enterRule(_localctx, 348, RULE_javascript_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2101);
			_la = _input.LA(1);
			if ( !(((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & ((1L << (BOOLEAN - 50)) | (1L << (CHARACTER - 50)) | (1L << (TEXT - 50)) | (1L << (INTEGER - 50)) | (1L << (DECIMAL - 50)) | (1L << (DATE - 50)) | (1L << (TIME - 50)) | (1L << (DATETIME - 50)) | (1L << (PERIOD - 50)) | (1L << (VERSION - 50)) | (1L << (UUID - 50)) | (1L << (HTML - 50)))) != 0) || ((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & ((1L << (NONE - 122)) | (1L << (NULL - 122)) | (1L << (READ - 122)) | (1L << (SELF - 122)) | (1L << (TEST - 122)) | (1L << (WRITE - 122)) | (1L << (SYMBOL_IDENTIFIER - 122)) | (1L << (TYPE_IDENTIFIER - 122)) | (1L << (VARIABLE_IDENTIFIER - 122)) | (1L << (DOLLAR_IDENTIFIER - 122)))) != 0)) ) {
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
		enterRule(_localctx, 350, RULE_python_statement);
		try {
			setState(2106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
				_localctx = new PythonReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2103);
				match(RETURN);
				setState(2104);
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
				setState(2105);
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
		int _startState = 352;
		enterRecursionRule(_localctx, 352, RULE_python_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PythonPrimaryExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2109);
			((PythonPrimaryExpressionContext)_localctx).exp = python_primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(2115);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PythonSelectorExpressionContext(new Python_expressionContext(_parentctx, _parentState));
					((PythonSelectorExpressionContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_python_expression);
					setState(2111);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2112);
					((PythonSelectorExpressionContext)_localctx).child = python_selector_expression();
					}
					} 
				}
				setState(2117);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
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
		enterRule(_localctx, 354, RULE_python_primary_expression);
		try {
			setState(2123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				_localctx = new PythonSelfExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2118);
				((PythonSelfExpressionContext)_localctx).exp = python_self_expression();
				}
				break;
			case 2:
				_localctx = new PythonParenthesisExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2119);
				((PythonParenthesisExpressionContext)_localctx).exp = python_parenthesis_expression();
				}
				break;
			case 3:
				_localctx = new PythonIdentifierExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2120);
				((PythonIdentifierExpressionContext)_localctx).exp = python_identifier_expression(0);
				}
				break;
			case 4:
				_localctx = new PythonLiteralExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2121);
				((PythonLiteralExpressionContext)_localctx).exp = python_literal_expression();
				}
				break;
			case 5:
				_localctx = new PythonGlobalMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2122);
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
		enterRule(_localctx, 356, RULE_python_self_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2125);
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
		enterRule(_localctx, 358, RULE_python_selector_expression);
		try {
			setState(2133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				_localctx = new PythonMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2127);
				match(DOT);
				setState(2128);
				((PythonMethodExpressionContext)_localctx).exp = python_method_expression();
				}
				break;
			case LBRAK:
				_localctx = new PythonItemExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2129);
				match(LBRAK);
				setState(2130);
				((PythonItemExpressionContext)_localctx).exp = python_expression(0);
				setState(2131);
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
		enterRule(_localctx, 360, RULE_python_method_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2135);
			((Python_method_expressionContext)_localctx).name = python_identifier();
			setState(2136);
			match(LPAR);
			setState(2138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (LPAR - 20)) | (1L << (BOOLEAN - 20)) | (1L << (CHARACTER - 20)) | (1L << (TEXT - 20)) | (1L << (INTEGER - 20)) | (1L << (DECIMAL - 20)) | (1L << (DATE - 20)) | (1L << (TIME - 20)) | (1L << (DATETIME - 20)) | (1L << (PERIOD - 20)) | (1L << (VERSION - 20)) | (1L << (UUID - 20)) | (1L << (HTML - 20)))) != 0) || ((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & ((1L << (NONE - 122)) | (1L << (NULL - 122)) | (1L << (READ - 122)) | (1L << (SELF - 122)) | (1L << (TEST - 122)) | (1L << (THIS - 122)) | (1L << (WRITE - 122)) | (1L << (BOOLEAN_LITERAL - 122)) | (1L << (CHAR_LITERAL - 122)) | (1L << (SYMBOL_IDENTIFIER - 122)) | (1L << (TYPE_IDENTIFIER - 122)) | (1L << (VARIABLE_IDENTIFIER - 122)) | (1L << (DOLLAR_IDENTIFIER - 122)) | (1L << (TEXT_LITERAL - 122)) | (1L << (INTEGER_LITERAL - 122)) | (1L << (DECIMAL_LITERAL - 122)))) != 0)) {
				{
				setState(2137);
				((Python_method_expressionContext)_localctx).args = python_argument_list();
				}
			}

			setState(2140);
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
		enterRule(_localctx, 362, RULE_python_argument_list);
		try {
			setState(2148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				_localctx = new PythonOrdinalOnlyArgumentListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2142);
				((PythonOrdinalOnlyArgumentListContext)_localctx).ordinal = python_ordinal_argument_list(0);
				}
				break;
			case 2:
				_localctx = new PythonNamedOnlyArgumentListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2143);
				((PythonNamedOnlyArgumentListContext)_localctx).named = python_named_argument_list(0);
				}
				break;
			case 3:
				_localctx = new PythonArgumentListContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2144);
				((PythonArgumentListContext)_localctx).ordinal = python_ordinal_argument_list(0);
				setState(2145);
				match(COMMA);
				setState(2146);
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
		int _startState = 364;
		enterRecursionRule(_localctx, 364, RULE_python_ordinal_argument_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PythonOrdinalArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2151);
			((PythonOrdinalArgumentListContext)_localctx).item = python_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2158);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PythonOrdinalArgumentListItemContext(new Python_ordinal_argument_listContext(_parentctx, _parentState));
					((PythonOrdinalArgumentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_python_ordinal_argument_list);
					setState(2153);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2154);
					match(COMMA);
					setState(2155);
					((PythonOrdinalArgumentListItemContext)_localctx).item = python_expression(0);
					}
					} 
				}
				setState(2160);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
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
		int _startState = 366;
		enterRecursionRule(_localctx, 366, RULE_python_named_argument_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PythonNamedArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2162);
			((PythonNamedArgumentListContext)_localctx).name = python_identifier();
			setState(2163);
			match(EQ);
			setState(2164);
			((PythonNamedArgumentListContext)_localctx).exp = python_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2174);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PythonNamedArgumentListItemContext(new Python_named_argument_listContext(_parentctx, _parentState));
					((PythonNamedArgumentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_python_named_argument_list);
					setState(2166);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2167);
					match(COMMA);
					setState(2168);
					((PythonNamedArgumentListItemContext)_localctx).name = python_identifier();
					setState(2169);
					match(EQ);
					setState(2170);
					((PythonNamedArgumentListItemContext)_localctx).exp = python_expression(0);
					}
					} 
				}
				setState(2176);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
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
		enterRule(_localctx, 368, RULE_python_parenthesis_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2177);
			match(LPAR);
			setState(2178);
			((Python_parenthesis_expressionContext)_localctx).exp = python_expression(0);
			setState(2179);
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
		int _startState = 370;
		enterRecursionRule(_localctx, 370, RULE_python_identifier_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOLLAR_IDENTIFIER:
				{
				_localctx = new PythonPromptoIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2182);
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
				setState(2183);
				((PythonIdentifierContext)_localctx).name = python_identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(2191);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PythonChildIdentifierContext(new Python_identifier_expressionContext(_parentctx, _parentState));
					((PythonChildIdentifierContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_python_identifier_expression);
					setState(2186);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2187);
					match(DOT);
					setState(2188);
					((PythonChildIdentifierContext)_localctx).name = python_identifier();
					}
					} 
				}
				setState(2193);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
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
		enterRule(_localctx, 372, RULE_python_literal_expression);
		try {
			setState(2199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				_localctx = new PythonIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2194);
				((PythonIntegerLiteralContext)_localctx).t = match(INTEGER_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				_localctx = new PythonDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2195);
				((PythonDecimalLiteralContext)_localctx).t = match(DECIMAL_LITERAL);
				}
				break;
			case TEXT_LITERAL:
				_localctx = new PythonTextLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2196);
				((PythonTextLiteralContext)_localctx).t = match(TEXT_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new PythonBooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2197);
				((PythonBooleanLiteralContext)_localctx).t = match(BOOLEAN_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new PythonCharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2198);
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
		enterRule(_localctx, 374, RULE_python_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2201);
			_la = _input.LA(1);
			if ( !(((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & ((1L << (BOOLEAN - 50)) | (1L << (CHARACTER - 50)) | (1L << (TEXT - 50)) | (1L << (INTEGER - 50)) | (1L << (DECIMAL - 50)) | (1L << (DATE - 50)) | (1L << (TIME - 50)) | (1L << (DATETIME - 50)) | (1L << (PERIOD - 50)) | (1L << (VERSION - 50)) | (1L << (UUID - 50)) | (1L << (HTML - 50)))) != 0) || ((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & ((1L << (NONE - 122)) | (1L << (NULL - 122)) | (1L << (READ - 122)) | (1L << (TEST - 122)) | (1L << (THIS - 122)) | (1L << (WRITE - 122)) | (1L << (SYMBOL_IDENTIFIER - 122)) | (1L << (TYPE_IDENTIFIER - 122)) | (1L << (VARIABLE_IDENTIFIER - 122)))) != 0)) ) {
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
		enterRule(_localctx, 376, RULE_java_statement);
		try {
			setState(2210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
				_localctx = new JavaReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2203);
				match(RETURN);
				setState(2204);
				((JavaReturnStatementContext)_localctx).exp = java_expression(0);
				setState(2205);
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
				setState(2207);
				((JavaStatementContext)_localctx).exp = java_expression(0);
				setState(2208);
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
		int _startState = 378;
		enterRecursionRule(_localctx, 378, RULE_java_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavaPrimaryExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2213);
			((JavaPrimaryExpressionContext)_localctx).exp = java_primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(2219);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavaSelectorExpressionContext(new Java_expressionContext(_parentctx, _parentState));
					((JavaSelectorExpressionContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_java_expression);
					setState(2215);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2216);
					((JavaSelectorExpressionContext)_localctx).child = java_selector_expression();
					}
					} 
				}
				setState(2221);
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
		enterRule(_localctx, 380, RULE_java_primary_expression);
		try {
			setState(2227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2222);
				java_this_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2223);
				java_new_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2224);
				java_parenthesis_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2225);
				java_identifier_expression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2226);
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
		enterRule(_localctx, 382, RULE_java_this_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2229);
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
		enterRule(_localctx, 384, RULE_java_new_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2231);
			new_token();
			setState(2232);
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
		enterRule(_localctx, 386, RULE_java_selector_expression);
		try {
			setState(2237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				_localctx = new JavaMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2234);
				match(DOT);
				setState(2235);
				((JavaMethodExpressionContext)_localctx).exp = java_method_expression();
				}
				break;
			case LBRAK:
				_localctx = new JavaItemExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2236);
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
		enterRule(_localctx, 388, RULE_java_method_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2239);
			((Java_method_expressionContext)_localctx).name = java_identifier();
			setState(2240);
			match(LPAR);
			setState(2242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (LPAR - 20)) | (1L << (BOOLEAN - 20)) | (1L << (CHARACTER - 20)) | (1L << (TEXT - 20)) | (1L << (INTEGER - 20)) | (1L << (DECIMAL - 20)) | (1L << (DATE - 20)) | (1L << (TIME - 20)) | (1L << (DATETIME - 20)) | (1L << (PERIOD - 20)) | (1L << (VERSION - 20)) | (1L << (UUID - 20)) | (1L << (HTML - 20)))) != 0) || ((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & ((1L << (NONE - 122)) | (1L << (NULL - 122)) | (1L << (READ - 122)) | (1L << (SELF - 122)) | (1L << (TEST - 122)) | (1L << (THIS - 122)) | (1L << (WRITE - 122)) | (1L << (BOOLEAN_LITERAL - 122)) | (1L << (CHAR_LITERAL - 122)) | (1L << (SYMBOL_IDENTIFIER - 122)) | (1L << (TYPE_IDENTIFIER - 122)) | (1L << (VARIABLE_IDENTIFIER - 122)) | (1L << (NATIVE_IDENTIFIER - 122)) | (1L << (DOLLAR_IDENTIFIER - 122)) | (1L << (TEXT_LITERAL - 122)) | (1L << (INTEGER_LITERAL - 122)) | (1L << (DECIMAL_LITERAL - 122)))) != 0)) {
				{
				setState(2241);
				((Java_method_expressionContext)_localctx).args = java_arguments(0);
				}
			}

			setState(2244);
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
		int _startState = 390;
		enterRecursionRule(_localctx, 390, RULE_java_arguments, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavaArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2247);
			((JavaArgumentListContext)_localctx).item = java_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2254);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavaArgumentListItemContext(new Java_argumentsContext(_parentctx, _parentState));
					((JavaArgumentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_java_arguments);
					setState(2249);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2250);
					match(COMMA);
					setState(2251);
					((JavaArgumentListItemContext)_localctx).item = java_expression(0);
					}
					} 
				}
				setState(2256);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
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
		enterRule(_localctx, 392, RULE_java_item_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2257);
			match(LBRAK);
			setState(2258);
			((Java_item_expressionContext)_localctx).exp = java_expression(0);
			setState(2259);
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
		enterRule(_localctx, 394, RULE_java_parenthesis_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2261);
			match(LPAR);
			setState(2262);
			((Java_parenthesis_expressionContext)_localctx).exp = java_expression(0);
			setState(2263);
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
		int _startState = 396;
		enterRecursionRule(_localctx, 396, RULE_java_identifier_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavaIdentifierContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2266);
			((JavaIdentifierContext)_localctx).name = java_identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(2273);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavaChildIdentifierContext(new Java_identifier_expressionContext(_parentctx, _parentState));
					((JavaChildIdentifierContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_java_identifier_expression);
					setState(2268);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2269);
					match(DOT);
					setState(2270);
					((JavaChildIdentifierContext)_localctx).name = java_identifier();
					}
					} 
				}
				setState(2275);
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
		int _startState = 398;
		enterRecursionRule(_localctx, 398, RULE_java_class_identifier_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavaClassIdentifierContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2277);
			((JavaClassIdentifierContext)_localctx).klass = java_identifier_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2283);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavaChildClassIdentifierContext(new Java_class_identifier_expressionContext(_parentctx, _parentState));
					((JavaChildClassIdentifierContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_java_class_identifier_expression);
					setState(2279);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2280);
					((JavaChildClassIdentifierContext)_localctx).name = match(DOLLAR_IDENTIFIER);
					}
					} 
				}
				setState(2285);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
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
		enterRule(_localctx, 400, RULE_java_literal_expression);
		try {
			setState(2291);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				_localctx = new JavaIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2286);
				((JavaIntegerLiteralContext)_localctx).t = match(INTEGER_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				_localctx = new JavaDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2287);
				((JavaDecimalLiteralContext)_localctx).t = match(DECIMAL_LITERAL);
				}
				break;
			case TEXT_LITERAL:
				_localctx = new JavaTextLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2288);
				((JavaTextLiteralContext)_localctx).t = match(TEXT_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new JavaBooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2289);
				((JavaBooleanLiteralContext)_localctx).t = match(BOOLEAN_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new JavaCharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2290);
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
		enterRule(_localctx, 402, RULE_java_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2293);
			_la = _input.LA(1);
			if ( !(((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & ((1L << (BOOLEAN - 50)) | (1L << (CHARACTER - 50)) | (1L << (TEXT - 50)) | (1L << (INTEGER - 50)) | (1L << (DECIMAL - 50)) | (1L << (DATE - 50)) | (1L << (TIME - 50)) | (1L << (DATETIME - 50)) | (1L << (PERIOD - 50)) | (1L << (VERSION - 50)) | (1L << (UUID - 50)) | (1L << (HTML - 50)))) != 0) || ((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & ((1L << (NONE - 122)) | (1L << (NULL - 122)) | (1L << (READ - 122)) | (1L << (SELF - 122)) | (1L << (TEST - 122)) | (1L << (WRITE - 122)) | (1L << (SYMBOL_IDENTIFIER - 122)) | (1L << (TYPE_IDENTIFIER - 122)) | (1L << (VARIABLE_IDENTIFIER - 122)) | (1L << (NATIVE_IDENTIFIER - 122)) | (1L << (DOLLAR_IDENTIFIER - 122)))) != 0)) ) {
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
		enterRule(_localctx, 404, RULE_csharp_statement);
		try {
			setState(2302);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
				_localctx = new CSharpReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2295);
				match(RETURN);
				setState(2296);
				((CSharpReturnStatementContext)_localctx).exp = csharp_expression(0);
				setState(2297);
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
				setState(2299);
				((CSharpStatementContext)_localctx).exp = csharp_expression(0);
				setState(2300);
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
		int _startState = 406;
		enterRecursionRule(_localctx, 406, RULE_csharp_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new CSharpPrimaryExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2305);
			((CSharpPrimaryExpressionContext)_localctx).exp = csharp_primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(2311);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CSharpSelectorExpressionContext(new Csharp_expressionContext(_parentctx, _parentState));
					((CSharpSelectorExpressionContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_csharp_expression);
					setState(2307);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2308);
					((CSharpSelectorExpressionContext)_localctx).child = csharp_selector_expression();
					}
					} 
				}
				setState(2313);
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
		enterRule(_localctx, 408, RULE_csharp_primary_expression);
		try {
			setState(2319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2314);
				csharp_this_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2315);
				csharp_new_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2316);
				csharp_parenthesis_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2317);
				csharp_identifier_expression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2318);
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
		enterRule(_localctx, 410, RULE_csharp_this_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2321);
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
		enterRule(_localctx, 412, RULE_csharp_new_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2323);
			new_token();
			setState(2324);
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
		enterRule(_localctx, 414, RULE_csharp_selector_expression);
		try {
			setState(2329);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				_localctx = new CSharpMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2326);
				match(DOT);
				setState(2327);
				((CSharpMethodExpressionContext)_localctx).exp = csharp_method_expression();
				}
				break;
			case LBRAK:
				_localctx = new CSharpItemExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2328);
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
		enterRule(_localctx, 416, RULE_csharp_method_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2331);
			((Csharp_method_expressionContext)_localctx).name = csharp_identifier();
			setState(2332);
			match(LPAR);
			setState(2334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (LPAR - 20)) | (1L << (BOOLEAN - 20)) | (1L << (CHARACTER - 20)) | (1L << (TEXT - 20)) | (1L << (INTEGER - 20)) | (1L << (DECIMAL - 20)) | (1L << (DATE - 20)) | (1L << (TIME - 20)) | (1L << (DATETIME - 20)) | (1L << (PERIOD - 20)) | (1L << (VERSION - 20)) | (1L << (UUID - 20)) | (1L << (HTML - 20)))) != 0) || ((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & ((1L << (NONE - 122)) | (1L << (NULL - 122)) | (1L << (READ - 122)) | (1L << (SELF - 122)) | (1L << (TEST - 122)) | (1L << (THIS - 122)) | (1L << (WRITE - 122)) | (1L << (BOOLEAN_LITERAL - 122)) | (1L << (CHAR_LITERAL - 122)) | (1L << (SYMBOL_IDENTIFIER - 122)) | (1L << (TYPE_IDENTIFIER - 122)) | (1L << (VARIABLE_IDENTIFIER - 122)) | (1L << (DOLLAR_IDENTIFIER - 122)) | (1L << (TEXT_LITERAL - 122)) | (1L << (INTEGER_LITERAL - 122)) | (1L << (DECIMAL_LITERAL - 122)))) != 0)) {
				{
				setState(2333);
				((Csharp_method_expressionContext)_localctx).args = csharp_arguments(0);
				}
			}

			setState(2336);
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
		int _startState = 418;
		enterRecursionRule(_localctx, 418, RULE_csharp_arguments, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new CSharpArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2339);
			((CSharpArgumentListContext)_localctx).item = csharp_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2346);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,188,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CSharpArgumentListItemContext(new Csharp_argumentsContext(_parentctx, _parentState));
					((CSharpArgumentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_csharp_arguments);
					setState(2341);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2342);
					match(COMMA);
					setState(2343);
					((CSharpArgumentListItemContext)_localctx).item = csharp_expression(0);
					}
					} 
				}
				setState(2348);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,188,_ctx);
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
		enterRule(_localctx, 420, RULE_csharp_item_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2349);
			match(LBRAK);
			setState(2350);
			((Csharp_item_expressionContext)_localctx).exp = csharp_expression(0);
			setState(2351);
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
		enterRule(_localctx, 422, RULE_csharp_parenthesis_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2353);
			match(LPAR);
			setState(2354);
			((Csharp_parenthesis_expressionContext)_localctx).exp = csharp_expression(0);
			setState(2355);
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
		int _startState = 424;
		enterRecursionRule(_localctx, 424, RULE_csharp_identifier_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2360);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOLLAR_IDENTIFIER:
				{
				_localctx = new CSharpPromptoIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2358);
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
				setState(2359);
				((CSharpIdentifierContext)_localctx).name = csharp_identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(2367);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CSharpChildIdentifierContext(new Csharp_identifier_expressionContext(_parentctx, _parentState));
					((CSharpChildIdentifierContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_csharp_identifier_expression);
					setState(2362);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2363);
					match(DOT);
					setState(2364);
					((CSharpChildIdentifierContext)_localctx).name = csharp_identifier();
					}
					} 
				}
				setState(2369);
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
		enterRule(_localctx, 426, RULE_csharp_literal_expression);
		try {
			setState(2375);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				_localctx = new CSharpIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2370);
				match(INTEGER_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				_localctx = new CSharpDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2371);
				match(DECIMAL_LITERAL);
				}
				break;
			case TEXT_LITERAL:
				_localctx = new CSharpTextLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2372);
				match(TEXT_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new CSharpBooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2373);
				match(BOOLEAN_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new CSharpCharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2374);
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
		enterRule(_localctx, 428, RULE_csharp_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2377);
			_la = _input.LA(1);
			if ( !(((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & ((1L << (BOOLEAN - 50)) | (1L << (CHARACTER - 50)) | (1L << (TEXT - 50)) | (1L << (INTEGER - 50)) | (1L << (DECIMAL - 50)) | (1L << (DATE - 50)) | (1L << (TIME - 50)) | (1L << (DATETIME - 50)) | (1L << (PERIOD - 50)) | (1L << (VERSION - 50)) | (1L << (UUID - 50)) | (1L << (HTML - 50)))) != 0) || ((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & ((1L << (NONE - 122)) | (1L << (NULL - 122)) | (1L << (READ - 122)) | (1L << (SELF - 122)) | (1L << (TEST - 122)) | (1L << (WRITE - 122)) | (1L << (SYMBOL_IDENTIFIER - 122)) | (1L << (TYPE_IDENTIFIER - 122)) | (1L << (VARIABLE_IDENTIFIER - 122)))) != 0)) ) {
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
		enterRule(_localctx, 430, RULE_jsx_expression);
		try {
			setState(2381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2379);
				jsx_element();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2380);
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
		public Jsx_openingContext jsx;
		public Jsx_childrenContext children_;
		public Jsx_closingContext jsx_closing() {
			return getRuleContext(Jsx_closingContext.class,0);
		}
		public Jsx_openingContext jsx_opening() {
			return getRuleContext(Jsx_openingContext.class,0);
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
		enterRule(_localctx, 432, RULE_jsx_element);
		try {
			setState(2390);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				_localctx = new JsxSelfClosingContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2383);
				((JsxSelfClosingContext)_localctx).jsx = jsx_self_closing();
				}
				break;
			case 2:
				_localctx = new JsxElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2384);
				((JsxElementContext)_localctx).jsx = jsx_opening();
				setState(2386);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
				case 1:
					{
					setState(2385);
					((JsxElementContext)_localctx).children_ = jsx_children();
					}
					break;
				}
				setState(2388);
				jsx_closing();
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
		enterRule(_localctx, 434, RULE_jsx_fragment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2392);
			jsx_fragment_start();
			setState(2394);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				{
				setState(2393);
				((Jsx_fragmentContext)_localctx).children_ = jsx_children();
				}
				break;
			}
			setState(2396);
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
		enterRule(_localctx, 436, RULE_jsx_fragment_start);
		try {
			setState(2401);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2398);
				match(LT);
				setState(2399);
				match(GT);
				}
				break;
			case LTGT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2400);
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
		enterRule(_localctx, 438, RULE_jsx_fragment_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2403);
			match(LT);
			setState(2404);
			match(SLASH);
			setState(2405);
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
		enterRule(_localctx, 440, RULE_jsx_self_closing);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2407);
			match(LT);
			setState(2408);
			((Jsx_self_closingContext)_localctx).name = jsx_element_name();
			setState(2412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA) | (1L << CSHARP) | (1L << PYTHON2) | (1L << PYTHON3) | (1L << JAVASCRIPT) | (1L << SWIFT) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << METHOD_T) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (ABSTRACT - 64)) | (1L << (ALL - 64)) | (1L << (ALWAYS - 64)) | (1L << (AND - 64)) | (1L << (ANY - 64)) | (1L << (AS - 64)) | (1L << (ASC - 64)) | (1L << (ATTR - 64)) | (1L << (ATTRIBUTE - 64)) | (1L << (ATTRIBUTES - 64)) | (1L << (BINDINGS - 64)) | (1L << (BREAK - 64)) | (1L << (BY - 64)) | (1L << (CASE - 64)) | (1L << (CATCH - 64)) | (1L << (CATEGORY - 64)) | (1L << (CLASS - 64)) | (1L << (CLOSE - 64)) | (1L << (CONTAINS - 64)) | (1L << (DEF - 64)) | (1L << (DEFAULT - 64)) | (1L << (DEFINE - 64)) | (1L << (DELETE - 64)) | (1L << (DESC - 64)) | (1L << (DO - 64)) | (1L << (DOING - 64)) | (1L << (EACH - 64)) | (1L << (ELSE - 64)) | (1L << (ENUM - 64)) | (1L << (ENUMERATED - 64)) | (1L << (EXCEPT - 64)) | (1L << (EXECUTE - 64)) | (1L << (EXPECTING - 64)) | (1L << (EXTENDS - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (FINALLY - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (FROM - 64)) | (1L << (GETTER - 64)) | (1L << (HAS - 64)) | (1L << (IF - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INVOKE - 64)) | (1L << (IS - 64)) | (1L << (MATCHING - 64)) | (1L << (METHOD - 64)) | (1L << (METHODS - 64)) | (1L << (MODULO - 64)) | (1L << (MUTABLE - 64)) | (1L << (NATIVE - 64)) | (1L << (NONE - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)) | (1L << (ON - 64)) | (1L << (ONE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (OPEN - 128)) | (1L << (OPERATOR - 128)) | (1L << (OR - 128)) | (1L << (ORDER - 128)) | (1L << (OTHERWISE - 128)) | (1L << (PASS - 128)) | (1L << (RAISE - 128)) | (1L << (READ - 128)) | (1L << (RECEIVING - 128)) | (1L << (RESOURCE - 128)) | (1L << (RETURN - 128)) | (1L << (RETURNING - 128)) | (1L << (ROWS - 128)) | (1L << (SELF - 128)) | (1L << (SETTER - 128)) | (1L << (SINGLETON - 128)) | (1L << (SORTED - 128)) | (1L << (STORABLE - 128)) | (1L << (STORE - 128)) | (1L << (SWITCH - 128)) | (1L << (TEST - 128)) | (1L << (THIS - 128)) | (1L << (THROW - 128)) | (1L << (TO - 128)) | (1L << (TRY - 128)) | (1L << (VERIFYING - 128)) | (1L << (WIDGET - 128)) | (1L << (WITH - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WHILE - 128)) | (1L << (WRITE - 128)) | (1L << (SYMBOL_IDENTIFIER - 128)) | (1L << (TYPE_IDENTIFIER - 128)) | (1L << (VARIABLE_IDENTIFIER - 128)))) != 0)) {
				{
				{
				setState(2409);
				((Jsx_self_closingContext)_localctx).attributes = jsx_attribute();
				}
				}
				setState(2414);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2415);
			match(SLASH);
			setState(2416);
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
		enterRule(_localctx, 442, RULE_jsx_opening);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2418);
			match(LT);
			setState(2419);
			((Jsx_openingContext)_localctx).name = jsx_element_name();
			setState(2423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA) | (1L << CSHARP) | (1L << PYTHON2) | (1L << PYTHON3) | (1L << JAVASCRIPT) | (1L << SWIFT) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << METHOD_T) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (ABSTRACT - 64)) | (1L << (ALL - 64)) | (1L << (ALWAYS - 64)) | (1L << (AND - 64)) | (1L << (ANY - 64)) | (1L << (AS - 64)) | (1L << (ASC - 64)) | (1L << (ATTR - 64)) | (1L << (ATTRIBUTE - 64)) | (1L << (ATTRIBUTES - 64)) | (1L << (BINDINGS - 64)) | (1L << (BREAK - 64)) | (1L << (BY - 64)) | (1L << (CASE - 64)) | (1L << (CATCH - 64)) | (1L << (CATEGORY - 64)) | (1L << (CLASS - 64)) | (1L << (CLOSE - 64)) | (1L << (CONTAINS - 64)) | (1L << (DEF - 64)) | (1L << (DEFAULT - 64)) | (1L << (DEFINE - 64)) | (1L << (DELETE - 64)) | (1L << (DESC - 64)) | (1L << (DO - 64)) | (1L << (DOING - 64)) | (1L << (EACH - 64)) | (1L << (ELSE - 64)) | (1L << (ENUM - 64)) | (1L << (ENUMERATED - 64)) | (1L << (EXCEPT - 64)) | (1L << (EXECUTE - 64)) | (1L << (EXPECTING - 64)) | (1L << (EXTENDS - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (FINALLY - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (FROM - 64)) | (1L << (GETTER - 64)) | (1L << (HAS - 64)) | (1L << (IF - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INVOKE - 64)) | (1L << (IS - 64)) | (1L << (MATCHING - 64)) | (1L << (METHOD - 64)) | (1L << (METHODS - 64)) | (1L << (MODULO - 64)) | (1L << (MUTABLE - 64)) | (1L << (NATIVE - 64)) | (1L << (NONE - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)) | (1L << (ON - 64)) | (1L << (ONE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (OPEN - 128)) | (1L << (OPERATOR - 128)) | (1L << (OR - 128)) | (1L << (ORDER - 128)) | (1L << (OTHERWISE - 128)) | (1L << (PASS - 128)) | (1L << (RAISE - 128)) | (1L << (READ - 128)) | (1L << (RECEIVING - 128)) | (1L << (RESOURCE - 128)) | (1L << (RETURN - 128)) | (1L << (RETURNING - 128)) | (1L << (ROWS - 128)) | (1L << (SELF - 128)) | (1L << (SETTER - 128)) | (1L << (SINGLETON - 128)) | (1L << (SORTED - 128)) | (1L << (STORABLE - 128)) | (1L << (STORE - 128)) | (1L << (SWITCH - 128)) | (1L << (TEST - 128)) | (1L << (THIS - 128)) | (1L << (THROW - 128)) | (1L << (TO - 128)) | (1L << (TRY - 128)) | (1L << (VERIFYING - 128)) | (1L << (WIDGET - 128)) | (1L << (WITH - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WHILE - 128)) | (1L << (WRITE - 128)) | (1L << (SYMBOL_IDENTIFIER - 128)) | (1L << (TYPE_IDENTIFIER - 128)) | (1L << (VARIABLE_IDENTIFIER - 128)))) != 0)) {
				{
				{
				setState(2420);
				((Jsx_openingContext)_localctx).attributes = jsx_attribute();
				}
				}
				setState(2425);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2426);
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
		enterRule(_localctx, 444, RULE_jsx_closing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2428);
			match(LT);
			setState(2429);
			match(SLASH);
			setState(2430);
			((Jsx_closingContext)_localctx).name = jsx_element_name();
			setState(2431);
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
		enterRule(_localctx, 446, RULE_jsx_element_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2433);
			jsx_identifier();
			setState(2438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(2434);
				match(DOT);
				setState(2435);
				jsx_identifier();
				}
				}
				setState(2440);
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
		enterRule(_localctx, 448, RULE_jsx_identifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2441);
			identifier_or_keyword();
			setState(2445);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,200,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2442);
					nospace_hyphen_identifier_or_keyword();
					}
					} 
				}
				setState(2447);
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
			exitRule();
		}
		return _localctx;
	}

	public static class Jsx_attributeContext extends ParserRuleContext {
		public Jsx_identifierContext name;
		public Jsx_attribute_valueContext value;
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
		enterRule(_localctx, 450, RULE_jsx_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2448);
			((Jsx_attributeContext)_localctx).name = jsx_identifier();
			setState(2451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(2449);
				match(EQ);
				setState(2450);
				((Jsx_attributeContext)_localctx).value = jsx_attribute_value();
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
		enterRule(_localctx, 452, RULE_jsx_attribute_value);
		try {
			setState(2458);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT_LITERAL:
				_localctx = new JsxLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2453);
				match(TEXT_LITERAL);
				}
				break;
			case LCURL:
				_localctx = new JsxValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2454);
				match(LCURL);
				setState(2455);
				((JsxValueContext)_localctx).exp = expression(0);
				setState(2456);
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
		enterRule(_localctx, 454, RULE_jsx_children);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2461); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2460);
					jsx_child();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2463); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,203,_ctx);
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
		enterRule(_localctx, 456, RULE_jsx_child);
		int _la;
		try {
			setState(2472);
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
			case EQ:
			case XEQ:
			case EQ2:
			case TEQ:
			case TILDE:
			case LARROW:
			case RARROW:
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
			case METHOD_T:
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
			case INVOKE:
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
			case BOOLEAN_LITERAL:
			case CHAR_LITERAL:
			case MIN_INTEGER:
			case MAX_INTEGER:
			case SYMBOL_IDENTIFIER:
			case TYPE_IDENTIFIER:
			case VARIABLE_IDENTIFIER:
			case NATIVE_IDENTIFIER:
			case DOLLAR_IDENTIFIER:
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
				setState(2465);
				((JsxTextContext)_localctx).text = jsx_text();
				}
				break;
			case LT:
				_localctx = new JsxChildContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2466);
				((JsxChildContext)_localctx).jsx = jsx_element();
				}
				break;
			case LCURL:
				_localctx = new JsxCodeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2467);
				match(LCURL);
				setState(2469);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & ((1L << (EXECUTE - 100)) | (1L << (FETCH - 100)) | (1L << (MUTABLE - 100)) | (1L << (NONE - 100)) | (1L << (NOT - 100)) | (1L << (READ - 100)) | (1L << (SELF - 100)) | (1L << (SORTED - 100)) | (1L << (THIS - 100)) | (1L << (BOOLEAN_LITERAL - 100)) | (1L << (CHAR_LITERAL - 100)) | (1L << (MIN_INTEGER - 100)) | (1L << (MAX_INTEGER - 100)))) != 0) || ((((_la - 164)) & ~0x3f) == 0 && ((1L << (_la - 164)) & ((1L << (SYMBOL_IDENTIFIER - 164)) | (1L << (TYPE_IDENTIFIER - 164)) | (1L << (VARIABLE_IDENTIFIER - 164)) | (1L << (TEXT_LITERAL - 164)) | (1L << (UUID_LITERAL - 164)) | (1L << (INTEGER_LITERAL - 164)) | (1L << (HEXA_LITERAL - 164)) | (1L << (DECIMAL_LITERAL - 164)) | (1L << (DATETIME_LITERAL - 164)) | (1L << (TIME_LITERAL - 164)) | (1L << (DATE_LITERAL - 164)) | (1L << (PERIOD_LITERAL - 164)) | (1L << (VERSION_LITERAL - 164)))) != 0)) {
					{
					setState(2468);
					((JsxCodeContext)_localctx).exp = expression(0);
					}
				}

				setState(2471);
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
		enterRule(_localctx, 458, RULE_jsx_text);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2475); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2474);
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
				setState(2477); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,206,_ctx);
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
		enterRule(_localctx, 460, RULE_css_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2479);
			match(LCURL);
			setState(2481); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2480);
				((Css_expressionContext)_localctx).field = css_field();
				}
				}
				setState(2483); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA) | (1L << CSHARP) | (1L << PYTHON2) | (1L << PYTHON3) | (1L << JAVASCRIPT) | (1L << SWIFT) | (1L << MINUS) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << METHOD_T) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (ABSTRACT - 64)) | (1L << (ALL - 64)) | (1L << (ALWAYS - 64)) | (1L << (AND - 64)) | (1L << (ANY - 64)) | (1L << (AS - 64)) | (1L << (ASC - 64)) | (1L << (ATTR - 64)) | (1L << (ATTRIBUTE - 64)) | (1L << (ATTRIBUTES - 64)) | (1L << (BINDINGS - 64)) | (1L << (BREAK - 64)) | (1L << (BY - 64)) | (1L << (CASE - 64)) | (1L << (CATCH - 64)) | (1L << (CATEGORY - 64)) | (1L << (CLASS - 64)) | (1L << (CLOSE - 64)) | (1L << (CONTAINS - 64)) | (1L << (DEF - 64)) | (1L << (DEFAULT - 64)) | (1L << (DEFINE - 64)) | (1L << (DELETE - 64)) | (1L << (DESC - 64)) | (1L << (DO - 64)) | (1L << (DOING - 64)) | (1L << (EACH - 64)) | (1L << (ELSE - 64)) | (1L << (ENUM - 64)) | (1L << (ENUMERATED - 64)) | (1L << (EXCEPT - 64)) | (1L << (EXECUTE - 64)) | (1L << (EXPECTING - 64)) | (1L << (EXTENDS - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (FINALLY - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (FROM - 64)) | (1L << (GETTER - 64)) | (1L << (HAS - 64)) | (1L << (IF - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INVOKE - 64)) | (1L << (IS - 64)) | (1L << (MATCHING - 64)) | (1L << (METHOD - 64)) | (1L << (METHODS - 64)) | (1L << (MODULO - 64)) | (1L << (MUTABLE - 64)) | (1L << (NATIVE - 64)) | (1L << (NONE - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)) | (1L << (ON - 64)) | (1L << (ONE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (OPEN - 128)) | (1L << (OPERATOR - 128)) | (1L << (OR - 128)) | (1L << (ORDER - 128)) | (1L << (OTHERWISE - 128)) | (1L << (PASS - 128)) | (1L << (RAISE - 128)) | (1L << (READ - 128)) | (1L << (RECEIVING - 128)) | (1L << (RESOURCE - 128)) | (1L << (RETURN - 128)) | (1L << (RETURNING - 128)) | (1L << (ROWS - 128)) | (1L << (SELF - 128)) | (1L << (SETTER - 128)) | (1L << (SINGLETON - 128)) | (1L << (SORTED - 128)) | (1L << (STORABLE - 128)) | (1L << (STORE - 128)) | (1L << (SWITCH - 128)) | (1L << (TEST - 128)) | (1L << (THIS - 128)) | (1L << (THROW - 128)) | (1L << (TO - 128)) | (1L << (TRY - 128)) | (1L << (VERIFYING - 128)) | (1L << (WIDGET - 128)) | (1L << (WITH - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WHILE - 128)) | (1L << (WRITE - 128)) | (1L << (SYMBOL_IDENTIFIER - 128)) | (1L << (TYPE_IDENTIFIER - 128)) | (1L << (VARIABLE_IDENTIFIER - 128)))) != 0) );
			setState(2485);
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
		enterRule(_localctx, 462, RULE_css_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2487);
			((Css_fieldContext)_localctx).name = css_identifier(0);
			setState(2488);
			match(COLON);
			setState(2489);
			((Css_fieldContext)_localctx).value = css_value();
			setState(2490);
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
		int _startState = 464;
		enterRecursionRule(_localctx, 464, RULE_css_identifier, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2496);
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
			case METHOD_T:
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
			case INVOKE:
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
				setState(2493);
				identifier_or_keyword();
				}
				break;
			case MINUS:
				{
				setState(2494);
				match(MINUS);
				setState(2495);
				nospace_identifier_or_keyword();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(2506);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,210,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Css_identifierContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_css_identifier);
					setState(2498);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2500); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(2499);
							nospace_hyphen_identifier_or_keyword();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(2502); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,209,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					} 
				}
				setState(2508);
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
		enterRule(_localctx, 466, RULE_css_value);
		try {
			setState(2514);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURL:
				_localctx = new CssValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2509);
				match(LCURL);
				setState(2510);
				((CssValueContext)_localctx).exp = expression(0);
				setState(2511);
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
			case EQ:
			case XEQ:
			case EQ2:
			case TEQ:
			case TILDE:
			case LARROW:
			case RARROW:
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
			case METHOD_T:
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
			case INVOKE:
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
			case BOOLEAN_LITERAL:
			case CHAR_LITERAL:
			case MIN_INTEGER:
			case MAX_INTEGER:
			case SYMBOL_IDENTIFIER:
			case TYPE_IDENTIFIER:
			case VARIABLE_IDENTIFIER:
			case NATIVE_IDENTIFIER:
			case DOLLAR_IDENTIFIER:
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
				setState(2513);
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
		enterRule(_localctx, 468, RULE_css_text);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2517); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2516);
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
				setState(2519); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INDENT) | (1L << DEDENT) | (1L << LF_TAB) | (1L << LF_MORE) | (1L << LF) | (1L << TAB) | (1L << COMMENT) | (1L << JAVA) | (1L << CSHARP) | (1L << PYTHON2) | (1L << PYTHON3) | (1L << JAVASCRIPT) | (1L << SWIFT) | (1L << COMMA) | (1L << RANGE) | (1L << DOT) | (1L << LPAR) | (1L << RPAR) | (1L << LBRAK) | (1L << RBRAK) | (1L << QMARK) | (1L << XMARK) | (1L << AMP) | (1L << AMP2) | (1L << PIPE) | (1L << PIPE2) | (1L << PLUS) | (1L << MINUS) | (1L << STAR) | (1L << SLASH) | (1L << BSLASH) | (1L << PERCENT) | (1L << GT) | (1L << GTE) | (1L << LT) | (1L << LTE) | (1L << LTGT) | (1L << EQ) | (1L << XEQ) | (1L << EQ2) | (1L << TEQ) | (1L << TILDE) | (1L << LARROW) | (1L << RARROW) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << METHOD_T) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IMAGE - 64)) | (1L << (UUID - 64)) | (1L << (ITERATOR - 64)) | (1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (ABSTRACT - 64)) | (1L << (ALL - 64)) | (1L << (ALWAYS - 64)) | (1L << (AND - 64)) | (1L << (ANY - 64)) | (1L << (AS - 64)) | (1L << (ASC - 64)) | (1L << (ATTR - 64)) | (1L << (ATTRIBUTE - 64)) | (1L << (ATTRIBUTES - 64)) | (1L << (BINDINGS - 64)) | (1L << (BREAK - 64)) | (1L << (BY - 64)) | (1L << (CASE - 64)) | (1L << (CATCH - 64)) | (1L << (CATEGORY - 64)) | (1L << (CLASS - 64)) | (1L << (CLOSE - 64)) | (1L << (CONTAINS - 64)) | (1L << (DEF - 64)) | (1L << (DEFAULT - 64)) | (1L << (DEFINE - 64)) | (1L << (DELETE - 64)) | (1L << (DESC - 64)) | (1L << (DO - 64)) | (1L << (DOING - 64)) | (1L << (EACH - 64)) | (1L << (ELSE - 64)) | (1L << (ENUM - 64)) | (1L << (ENUMERATED - 64)) | (1L << (EXCEPT - 64)) | (1L << (EXECUTE - 64)) | (1L << (EXPECTING - 64)) | (1L << (EXTENDS - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (FINALLY - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (FROM - 64)) | (1L << (GETTER - 64)) | (1L << (HAS - 64)) | (1L << (IF - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INVOKE - 64)) | (1L << (IS - 64)) | (1L << (MATCHING - 64)) | (1L << (METHOD - 64)) | (1L << (METHODS - 64)) | (1L << (MODULO - 64)) | (1L << (MUTABLE - 64)) | (1L << (NATIVE - 64)) | (1L << (NONE - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)) | (1L << (ON - 64)) | (1L << (ONE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (OPEN - 128)) | (1L << (OPERATOR - 128)) | (1L << (OR - 128)) | (1L << (ORDER - 128)) | (1L << (OTHERWISE - 128)) | (1L << (PASS - 128)) | (1L << (RAISE - 128)) | (1L << (READ - 128)) | (1L << (RECEIVING - 128)) | (1L << (RESOURCE - 128)) | (1L << (RETURN - 128)) | (1L << (RETURNING - 128)) | (1L << (ROWS - 128)) | (1L << (SELF - 128)) | (1L << (SETTER - 128)) | (1L << (SINGLETON - 128)) | (1L << (SORTED - 128)) | (1L << (STORABLE - 128)) | (1L << (STORE - 128)) | (1L << (SWITCH - 128)) | (1L << (TEST - 128)) | (1L << (THIS - 128)) | (1L << (THROW - 128)) | (1L << (TO - 128)) | (1L << (TRY - 128)) | (1L << (VERIFYING - 128)) | (1L << (WIDGET - 128)) | (1L << (WITH - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WHILE - 128)) | (1L << (WRITE - 128)) | (1L << (BOOLEAN_LITERAL - 128)) | (1L << (CHAR_LITERAL - 128)) | (1L << (MIN_INTEGER - 128)) | (1L << (MAX_INTEGER - 128)) | (1L << (SYMBOL_IDENTIFIER - 128)) | (1L << (TYPE_IDENTIFIER - 128)) | (1L << (VARIABLE_IDENTIFIER - 128)) | (1L << (NATIVE_IDENTIFIER - 128)) | (1L << (DOLLAR_IDENTIFIER - 128)) | (1L << (TEXT_LITERAL - 128)) | (1L << (UUID_LITERAL - 128)) | (1L << (INTEGER_LITERAL - 128)) | (1L << (HEXA_LITERAL - 128)) | (1L << (DECIMAL_LITERAL - 128)) | (1L << (DATETIME_LITERAL - 128)) | (1L << (TIME_LITERAL - 128)) | (1L << (DATE_LITERAL - 128)) | (1L << (PERIOD_LITERAL - 128)) | (1L << (VERSION_LITERAL - 128)))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
		case 30:
			return callable_parent_sempred((Callable_parentContext)_localctx, predIndex);
		case 40:
			return else_if_statement_list_sempred((Else_if_statement_listContext)_localctx, predIndex);
		case 46:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 48:
			return instance_expression_sempred((Instance_expressionContext)_localctx, predIndex);
		case 50:
			return instance_selector_sempred((Instance_selectorContext)_localctx, predIndex);
		case 54:
			return copy_from_sempred((Copy_fromContext)_localctx, predIndex);
		case 55:
			return argument_assignment_list_sempred((Argument_assignment_listContext)_localctx, predIndex);
		case 62:
			return child_instance_sempred((Child_instanceContext)_localctx, predIndex);
		case 82:
			return typedef_sempred((TypedefContext)_localctx, predIndex);
		case 93:
			return nospace_hyphen_identifier_or_keyword_sempred((Nospace_hyphen_identifier_or_keywordContext)_localctx, predIndex);
		case 94:
			return nospace_identifier_or_keyword_sempred((Nospace_identifier_or_keywordContext)_localctx, predIndex);
		case 106:
			return any_type_sempred((Any_typeContext)_localctx, predIndex);
		case 143:
			return assignable_instance_sempred((Assignable_instanceContext)_localctx, predIndex);
		case 144:
			return is_expression_sempred((Is_expressionContext)_localctx, predIndex);
		case 151:
			return new_token_sempred((New_tokenContext)_localctx, predIndex);
		case 152:
			return key_token_sempred((Key_tokenContext)_localctx, predIndex);
		case 153:
			return module_token_sempred((Module_tokenContext)_localctx, predIndex);
		case 154:
			return value_token_sempred((Value_tokenContext)_localctx, predIndex);
		case 155:
			return symbols_token_sempred((Symbols_tokenContext)_localctx, predIndex);
		case 163:
			return javascript_expression_sempred((Javascript_expressionContext)_localctx, predIndex);
		case 169:
			return javascript_arguments_sempred((Javascript_argumentsContext)_localctx, predIndex);
		case 176:
			return python_expression_sempred((Python_expressionContext)_localctx, predIndex);
		case 182:
			return python_ordinal_argument_list_sempred((Python_ordinal_argument_listContext)_localctx, predIndex);
		case 183:
			return python_named_argument_list_sempred((Python_named_argument_listContext)_localctx, predIndex);
		case 185:
			return python_identifier_expression_sempred((Python_identifier_expressionContext)_localctx, predIndex);
		case 189:
			return java_expression_sempred((Java_expressionContext)_localctx, predIndex);
		case 195:
			return java_arguments_sempred((Java_argumentsContext)_localctx, predIndex);
		case 198:
			return java_identifier_expression_sempred((Java_identifier_expressionContext)_localctx, predIndex);
		case 199:
			return java_class_identifier_expression_sempred((Java_class_identifier_expressionContext)_localctx, predIndex);
		case 203:
			return csharp_expression_sempred((Csharp_expressionContext)_localctx, predIndex);
		case 209:
			return csharp_arguments_sempred((Csharp_argumentsContext)_localctx, predIndex);
		case 212:
			return csharp_identifier_expression_sempred((Csharp_identifier_expressionContext)_localctx, predIndex);
		case 232:
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
	private boolean callable_parent_sempred(Callable_parentContext _localctx, int predIndex) {
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
			return precpred(_ctx, 32);
		case 4:
			return precpred(_ctx, 31);
		case 5:
			return precpred(_ctx, 30);
		case 6:
			return precpred(_ctx, 29);
		case 7:
			return precpred(_ctx, 28);
		case 8:
			return precpred(_ctx, 26);
		case 9:
			return precpred(_ctx, 25);
		case 10:
			return precpred(_ctx, 24);
		case 11:
			return precpred(_ctx, 23);
		case 12:
			return precpred(_ctx, 20);
		case 13:
			return precpred(_ctx, 19);
		case 14:
			return precpred(_ctx, 18);
		case 15:
			return precpred(_ctx, 17);
		case 16:
			return precpred(_ctx, 16);
		case 17:
			return precpred(_ctx, 15);
		case 18:
			return precpred(_ctx, 14);
		case 19:
			return precpred(_ctx, 13);
		case 20:
			return precpred(_ctx, 12);
		case 21:
			return precpred(_ctx, 11);
		case 22:
			return precpred(_ctx, 10);
		case 23:
			return precpred(_ctx, 9);
		case 24:
			return precpred(_ctx, 8);
		case 25:
			return precpred(_ctx, 7);
		case 26:
			return precpred(_ctx, 6);
		case 27:
			return precpred(_ctx, 5);
		case 28:
			return precpred(_ctx, 1);
		case 29:
			return precpred(_ctx, 36);
		case 30:
			return precpred(_ctx, 27);
		case 31:
			return precpred(_ctx, 22);
		case 32:
			return precpred(_ctx, 21);
		}
		return true;
	}
	private boolean instance_expression_sempred(Instance_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 33:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean instance_selector_sempred(Instance_selectorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 34:
			return this.wasNot(MParser.WS);
		case 35:
			return this.wasNot(MParser.WS);
		case 36:
			return this.wasNot(MParser.WS);
		}
		return true;
	}
	private boolean copy_from_sempred(Copy_fromContext _localctx, int predIndex) {
		switch (predIndex) {
		case 37:
			return this.willNotBe(this.equalToken());
		}
		return true;
	}
	private boolean argument_assignment_list_sempred(Argument_assignment_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 38:
			return this.willNotBe(this.equalToken());
		case 39:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean child_instance_sempred(Child_instanceContext _localctx, int predIndex) {
		switch (predIndex) {
		case 40:
			return this.wasNot(MParser.WS);
		case 41:
			return this.wasNot(MParser.WS);
		}
		return true;
	}
	private boolean typedef_sempred(TypedefContext _localctx, int predIndex) {
		switch (predIndex) {
		case 42:
			return precpred(_ctx, 5);
		case 43:
			return precpred(_ctx, 4);
		case 44:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean nospace_hyphen_identifier_or_keyword_sempred(Nospace_hyphen_identifier_or_keywordContext _localctx, int predIndex) {
		switch (predIndex) {
		case 45:
			return this.wasNotWhiteSpace();
		}
		return true;
	}
	private boolean nospace_identifier_or_keyword_sempred(Nospace_identifier_or_keywordContext _localctx, int predIndex) {
		switch (predIndex) {
		case 46:
			return this.wasNotWhiteSpace();
		}
		return true;
	}
	private boolean any_type_sempred(Any_typeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 47:
			return precpred(_ctx, 2);
		case 48:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean assignable_instance_sempred(Assignable_instanceContext _localctx, int predIndex) {
		switch (predIndex) {
		case 49:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean is_expression_sempred(Is_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 50:
			return this.willBeAOrAn();
		}
		return true;
	}
	private boolean new_token_sempred(New_tokenContext _localctx, int predIndex) {
		switch (predIndex) {
		case 51:
			return this.isText(((New_tokenContext)_localctx).i1,"new");
		}
		return true;
	}
	private boolean key_token_sempred(Key_tokenContext _localctx, int predIndex) {
		switch (predIndex) {
		case 52:
			return this.isText(((Key_tokenContext)_localctx).i1,"key");
		}
		return true;
	}
	private boolean module_token_sempred(Module_tokenContext _localctx, int predIndex) {
		switch (predIndex) {
		case 53:
			return this.isText(((Module_tokenContext)_localctx).i1,"module");
		}
		return true;
	}
	private boolean value_token_sempred(Value_tokenContext _localctx, int predIndex) {
		switch (predIndex) {
		case 54:
			return this.isText(((Value_tokenContext)_localctx).i1,"value");
		}
		return true;
	}
	private boolean symbols_token_sempred(Symbols_tokenContext _localctx, int predIndex) {
		switch (predIndex) {
		case 55:
			return this.isText(((Symbols_tokenContext)_localctx).i1,"symbols");
		}
		return true;
	}
	private boolean javascript_expression_sempred(Javascript_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 56:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean javascript_arguments_sempred(Javascript_argumentsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 57:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean python_expression_sempred(Python_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 58:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean python_ordinal_argument_list_sempred(Python_ordinal_argument_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 59:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean python_named_argument_list_sempred(Python_named_argument_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 60:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean python_identifier_expression_sempred(Python_identifier_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 61:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean java_expression_sempred(Java_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 62:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean java_arguments_sempred(Java_argumentsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 63:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean java_identifier_expression_sempred(Java_identifier_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 64:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean java_class_identifier_expression_sempred(Java_class_identifier_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 65:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean csharp_expression_sempred(Csharp_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 66:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean csharp_arguments_sempred(Csharp_argumentsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 67:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean csharp_identifier_expression_sempred(Csharp_identifier_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 68:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean css_identifier_sempred(Css_identifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 69:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00b4\u09dc\4\2\t"+
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
		"\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u01df\n\2\3\2\5\2\u01e2\n\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\5\5\u01fb\n\5\3\5\3\5\3\6\5\6\u0200\n\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u020e\n\6\3\6\3\6\3\6\3\6\5\6\u0214\n\6"+
		"\5\6\u0216\n\6\5\6\u0218\n\6\3\6\3\6\3\7\3\7\3\7\5\7\u021f\n\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\5\b\u0227\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u022e\n\b\3\b\3"+
		"\b\3\t\5\t\u0233\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u023e\n\t"+
		"\3\t\3\t\3\t\3\t\3\t\5\t\u0245\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\5\n\u0252\n\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\5\f\u0260\n\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\5\16\u0274\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\5\20\u028b\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\5\21"+
		"\u0296\n\21\3\21\3\21\3\21\3\21\3\21\5\21\u029d\n\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\5\21\u02a6\n\21\3\21\3\21\3\22\5\22\u02ab\n\22\3\22"+
		"\3\22\3\22\3\22\3\22\5\22\u02b2\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u02bb\n\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u02ce\n\24\f\24\16\24\u02d1\13\24"+
		"\3\25\3\25\3\25\3\25\3\25\5\25\u02d8\n\25\3\25\3\25\3\25\5\25\u02dd\n"+
		"\25\3\26\3\26\3\26\3\26\5\26\u02e3\n\26\3\26\3\26\3\26\5\26\u02e8\n\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\5\27\u02f1\n\27\3\27\3\27\3\27\5\27"+
		"\u02f6\n\27\3\27\3\27\3\27\5\27\u02fb\n\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\5\30\u0313\n\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\5\32\u031e\n\32\3\32\3\32\5\32\u0322\n\32\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\5\33\u0337\n\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\5\35\u0351\n\35\3\36\3\36\3\36\5\36\u0356\n\36\3\36\3\36\3\37\3\37\3"+
		"\37\3\37\3\37\5\37\u035f\n\37\3 \3 \3 \3 \3 \7 \u0366\n \f \16 \u0369"+
		"\13 \3!\3!\3!\3!\3!\3!\5!\u0371\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3"+
		"#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u038e\n$\3$\3"+
		"$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u03a1\n%\3&\3&\3&\3"+
		"&\5&\u03a7\n&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u03c9\n)\3)\3)\3)"+
		"\3)\3)\3)\3)\5)\u03d2\n)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*"+
		"\3*\3*\3*\3*\7*\u03e7\n*\f*\16*\u03ea\13*\3+\3+\3+\3,\3,\3,\3,\3,\3,\3"+
		",\3,\5,\u03f7\n,\3,\3,\3,\3,\3,\3,\3,\5,\u0400\n,\3,\3,\3,\3,\3,\3,\3"+
		",\5,\u0409\n,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3"+
		"-\3-\3-\5-\u0420\n-\3.\3.\3/\3/\5/\u0426\n/\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\5\60\u043c\n\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\7\60\u04ab\n\60\f\60\16\60\u04ae\13\60\3\61\3\61\3\62\3\62\3\62"+
		"\3\62\3\62\7\62\u04b7\n\62\f\62\16\62\u04ba\13\62\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\5\63\u04c4\n\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u04d3\n\64\3\65\3\65\3\65\5\65\u04d8"+
		"\n\65\3\65\3\65\3\66\3\66\3\66\5\66\u04df\n\66\3\66\3\66\3\67\3\67\3\67"+
		"\3\67\3\67\5\67\u04e8\n\67\3\67\3\67\3\67\3\67\3\67\5\67\u04ef\n\67\3"+
		"\67\3\67\5\67\u04f3\n\67\38\38\38\38\38\39\39\39\39\39\59\u04ff\n9\39"+
		"\39\39\79\u0504\n9\f9\169\u0507\139\3:\3:\3:\3:\5:\u050d\n:\3;\3;\3;\3"+
		";\3;\3<\3<\3<\3<\3<\3<\3=\3=\3=\5=\u051d\n=\3=\3=\3=\3=\3=\3=\3=\3=\3"+
		"=\5=\u0528\n=\3=\3=\5=\u052c\n=\3=\3=\3=\5=\u0531\n=\3=\3=\3=\5=\u0536"+
		"\n=\5=\u0538\n=\3>\3>\5>\u053c\n>\3>\3>\3>\3>\3>\3>\3>\5>\u0545\n>\3>"+
		"\3>\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3@\3@\5@\u0555\n@\3A\3A\3A\3A\3B\7B"+
		"\u055c\nB\fB\16B\u055f\13B\3C\6C\u0562\nC\rC\16C\u0563\3D\6D\u0567\nD"+
		"\rD\16D\u0568\3D\3D\3E\7E\u056e\nE\fE\16E\u0571\13E\3E\3E\3F\3F\3G\5G"+
		"\u0578\nG\3G\3G\3G\3H\3H\3H\3H\7H\u0581\nH\fH\16H\u0584\13H\3I\3I\3I\7"+
		"I\u0589\nI\fI\16I\u058c\13I\3I\3I\3I\3I\3I\3I\5I\u0594\nI\3J\3J\3K\3K"+
		"\5K\u059a\nK\3L\3L\3L\3L\7L\u05a0\nL\fL\16L\u05a3\13L\3M\3M\3M\3M\7M\u05a9"+
		"\nM\fM\16M\u05ac\13M\3N\3N\3N\7N\u05b1\nN\fN\16N\u05b4\13N\3O\3O\3O\3"+
		"O\3O\3O\3O\3O\3O\3O\5O\u05c0\nO\3P\5P\u05c3\nP\3P\3P\5P\u05c7\nP\3P\3"+
		"P\3Q\5Q\u05cc\nQ\3Q\3Q\5Q\u05d0\nQ\3Q\3Q\3R\3R\3R\7R\u05d7\nR\fR\16R\u05da"+
		"\13R\3S\3S\3S\3S\3S\3S\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\5T\u05ee\n"+
		"T\3T\3T\3T\3T\3T\3T\3T\3T\7T\u05f8\nT\fT\16T\u05fb\13T\3U\3U\5U\u05ff"+
		"\nU\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\5V\u0611\nV\3W\3W"+
		"\3X\5X\u0616\nX\3X\3X\3Y\3Y\3Z\3Z\3Z\5Z\u061f\nZ\3[\3[\3\\\3\\\3\\\7\\"+
		"\u0626\n\\\f\\\16\\\u0629\13\\\3]\3]\5]\u062d\n]\3^\3^\5^\u0631\n^\3_"+
		"\3_\3_\3_\3`\3`\3`\3a\3a\3a\5a\u063d\na\3b\3b\3c\3c\3d\3d\3e\3e\3f\3f"+
		"\3f\7f\u064a\nf\ff\16f\u064d\13f\3g\3g\5g\u0651\ng\3g\5g\u0654\ng\3h\3"+
		"h\5h\u0658\nh\3i\3i\3i\5i\u065d\ni\3j\3j\3j\3k\3k\5k\u0664\nk\3l\3l\3"+
		"l\3l\3l\3l\3l\3l\3l\7l\u066f\nl\fl\16l\u0672\13l\3m\3m\3m\3m\7m\u0678"+
		"\nm\fm\16m\u067b\13m\3n\3n\3n\3n\3n\5n\u0682\nn\3o\3o\3o\3o\7o\u0688\n"+
		"o\fo\16o\u068b\13o\3p\3p\3p\5p\u0690\np\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q"+
		"\5q\u069c\nq\3r\3r\5r\u06a0\nr\3s\3s\3s\3s\3s\3s\7s\u06a8\ns\fs\16s\u06ab"+
		"\13s\3t\3t\5t\u06af\nt\3u\3u\3u\3u\5u\u06b5\nu\3u\3u\3u\7u\u06ba\nu\f"+
		"u\16u\u06bd\13u\3u\3u\5u\u06c1\nu\3v\3v\3v\7v\u06c6\nv\fv\16v\u06c9\13"+
		"v\3w\3w\3w\7w\u06ce\nw\fw\16w\u06d1\13w\3x\3x\3x\3x\5x\u06d7\nx\3y\3y"+
		"\3z\3z\3z\3z\7z\u06df\nz\fz\16z\u06e2\13z\3{\3{\3{\3{\3{\3{\3{\3{\3{\3"+
		"{\5{\u06ee\n{\3|\3|\5|\u06f2\n|\3|\5|\u06f5\n|\3}\3}\5}\u06f9\n}\3}\5"+
		"}\u06fc\n}\3~\3~\3~\3~\7~\u0702\n~\f~\16~\u0705\13~\3\177\3\177\3\177"+
		"\3\177\7\177\u070b\n\177\f\177\16\177\u070e\13\177\3\u0080\3\u0080\3\u0080"+
		"\3\u0080\7\u0080\u0714\n\u0080\f\u0080\16\u0080\u0717\13\u0080\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\7\u0081\u071d\n\u0081\f\u0081\16\u0081\u0720"+
		"\13\u0081\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\5\u0082\u0730\n\u0082"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\5\u0083\u0741\n\u0083"+
		"\3\u0084\3\u0084\3\u0084\7\u0084\u0746\n\u0084\f\u0084\16\u0084\u0749"+
		"\13\u0084\3\u0085\3\u0085\3\u0085\3\u0085\5\u0085\u074f\n\u0085\3\u0086"+
		"\3\u0086\3\u0087\3\u0087\3\u0087\3\u0087\3\u0088\3\u0088\5\u0088\u0759"+
		"\n\u0088\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\5\u0089\u0760\n\u0089"+
		"\3\u008a\5\u008a\u0763\n\u008a\3\u008a\3\u008a\5\u008a\u0767\n\u008a\3"+
		"\u008a\3\u008a\3\u008b\5\u008b\u076c\n\u008b\3\u008b\3\u008b\5\u008b\u0770"+
		"\n\u008b\3\u008b\3\u008b\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\7\u008c"+
		"\u0779\n\u008c\f\u008c\16\u008c\u077c\13\u008c\5\u008c\u077e\n\u008c\3"+
		"\u008d\3\u008d\3\u008d\7\u008d\u0783\n\u008d\f\u008d\16\u008d\u0786\13"+
		"\u008d\3\u008e\3\u008e\3\u008e\3\u008e\3\u008f\3\u008f\3\u008f\3\u008f"+
		"\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\5\u008f\u0795\n\u008f\3\u0090"+
		"\3\u0090\3\u0090\3\u0090\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\7\u0091"+
		"\u07a0\n\u0091\f\u0091\16\u0091\u07a3\13\u0091\3\u0092\3\u0092\3\u0092"+
		"\3\u0092\5\u0092\u07a9\n\u0092\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093"+
		"\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0095\3\u0095\3\u0095\7\u0095"+
		"\u07b8\n\u0095\f\u0095\16\u0095\u07bb\13\u0095\3\u0096\3\u0096\3\u0096"+
		"\7\u0096\u07c0\n\u0096\f\u0096\16\u0096\u07c3\13\u0096\3\u0096\5\u0096"+
		"\u07c6\n\u0096\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\5\u0097"+
		"\u07ce\n\u0097\3\u0098\3\u0098\3\u0099\3\u0099\3\u0099\3\u009a\3\u009a"+
		"\3\u009a\3\u009b\3\u009b\3\u009b\3\u009c\3\u009c\3\u009c\3\u009d\3\u009d"+
		"\3\u009d\3\u009e\3\u009e\3\u009f\3\u009f\3\u00a0\3\u00a0\3\u00a1\3\u00a1"+
		"\3\u00a2\3\u00a2\3\u00a3\3\u00a3\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4"+
		"\3\u00a4\3\u00a4\5\u00a4\u07f4\n\u00a4\3\u00a5\3\u00a5\3\u00a5\3\u00a5"+
		"\3\u00a5\7\u00a5\u07fb\n\u00a5\f\u00a5\16\u00a5\u07fe\13\u00a5\3\u00a6"+
		"\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\5\u00a6\u0807\n\u00a6"+
		"\3\u00a7\3\u00a7\3\u00a8\3\u00a8\3\u00a8\3\u00a9\3\u00a9\3\u00a9\3\u00a9"+
		"\3\u00a9\5\u00a9\u0813\n\u00a9\3\u00aa\3\u00aa\3\u00aa\5\u00aa\u0818\n"+
		"\u00aa\3\u00aa\3\u00aa\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab"+
		"\7\u00ab\u0822\n\u00ab\f\u00ab\16\u00ab\u0825\13\u00ab\3\u00ac\3\u00ac"+
		"\3\u00ac\3\u00ac\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ae\3\u00ae\3\u00af"+
		"\3\u00af\3\u00af\3\u00af\3\u00af\5\u00af\u0836\n\u00af\3\u00b0\3\u00b0"+
		"\3\u00b1\3\u00b1\3\u00b1\5\u00b1\u083d\n\u00b1\3\u00b2\3\u00b2\3\u00b2"+
		"\3\u00b2\3\u00b2\7\u00b2\u0844\n\u00b2\f\u00b2\16\u00b2\u0847\13\u00b2"+
		"\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\5\u00b3\u084e\n\u00b3\3\u00b4"+
		"\3\u00b4\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\5\u00b5\u0858"+
		"\n\u00b5\3\u00b6\3\u00b6\3\u00b6\5\u00b6\u085d\n\u00b6\3\u00b6\3\u00b6"+
		"\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\5\u00b7\u0867\n\u00b7"+
		"\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\7\u00b8\u086f\n\u00b8"+
		"\f\u00b8\16\u00b8\u0872\13\u00b8\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9"+
		"\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\7\u00b9\u087f\n\u00b9"+
		"\f\u00b9\16\u00b9\u0882\13\u00b9\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00bb"+
		"\3\u00bb\3\u00bb\5\u00bb\u088b\n\u00bb\3\u00bb\3\u00bb\3\u00bb\7\u00bb"+
		"\u0890\n\u00bb\f\u00bb\16\u00bb\u0893\13\u00bb\3\u00bc\3\u00bc\3\u00bc"+
		"\3\u00bc\3\u00bc\5\u00bc\u089a\n\u00bc\3\u00bd\3\u00bd\3\u00be\3\u00be"+
		"\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\5\u00be\u08a5\n\u00be\3\u00bf"+
		"\3\u00bf\3\u00bf\3\u00bf\3\u00bf\7\u00bf\u08ac\n\u00bf\f\u00bf\16\u00bf"+
		"\u08af\13\u00bf\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\5\u00c0\u08b6"+
		"\n\u00c0\3\u00c1\3\u00c1\3\u00c2\3\u00c2\3\u00c2\3\u00c3\3\u00c3\3\u00c3"+
		"\5\u00c3\u08c0\n\u00c3\3\u00c4\3\u00c4\3\u00c4\5\u00c4\u08c5\n\u00c4\3"+
		"\u00c4\3\u00c4\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\7\u00c5"+
		"\u08cf\n\u00c5\f\u00c5\16\u00c5\u08d2\13\u00c5\3\u00c6\3\u00c6\3\u00c6"+
		"\3\u00c6\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c8\3\u00c8\3\u00c8\3\u00c8"+
		"\3\u00c8\3\u00c8\7\u00c8\u08e2\n\u00c8\f\u00c8\16\u00c8\u08e5\13\u00c8"+
		"\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\7\u00c9\u08ec\n\u00c9\f\u00c9"+
		"\16\u00c9\u08ef\13\u00c9\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\5\u00ca"+
		"\u08f6\n\u00ca\3\u00cb\3\u00cb\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc"+
		"\3\u00cc\3\u00cc\5\u00cc\u0901\n\u00cc\3\u00cd\3\u00cd\3\u00cd\3\u00cd"+
		"\3\u00cd\7\u00cd\u0908\n\u00cd\f\u00cd\16\u00cd\u090b\13\u00cd\3\u00ce"+
		"\3\u00ce\3\u00ce\3\u00ce\3\u00ce\5\u00ce\u0912\n\u00ce\3\u00cf\3\u00cf"+
		"\3\u00d0\3\u00d0\3\u00d0\3\u00d1\3\u00d1\3\u00d1\5\u00d1\u091c\n\u00d1"+
		"\3\u00d2\3\u00d2\3\u00d2\5\u00d2\u0921\n\u00d2\3\u00d2\3\u00d2\3\u00d3"+
		"\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\7\u00d3\u092b\n\u00d3\f\u00d3"+
		"\16\u00d3\u092e\13\u00d3\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d5\3\u00d5"+
		"\3\u00d5\3\u00d5\3\u00d6\3\u00d6\3\u00d6\5\u00d6\u093b\n\u00d6\3\u00d6"+
		"\3\u00d6\3\u00d6\7\u00d6\u0940\n\u00d6\f\u00d6\16\u00d6\u0943\13\u00d6"+
		"\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\5\u00d7\u094a\n\u00d7\3\u00d8"+
		"\3\u00d8\3\u00d9\3\u00d9\5\u00d9\u0950\n\u00d9\3\u00da\3\u00da\3\u00da"+
		"\5\u00da\u0955\n\u00da\3\u00da\3\u00da\5\u00da\u0959\n\u00da\3\u00db\3"+
		"\u00db\5\u00db\u095d\n\u00db\3\u00db\3\u00db\3\u00dc\3\u00dc\3\u00dc\5"+
		"\u00dc\u0964\n\u00dc\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00de\3\u00de\3"+
		"\u00de\7\u00de\u096d\n\u00de\f\u00de\16\u00de\u0970\13\u00de\3\u00de\3"+
		"\u00de\3\u00de\3\u00df\3\u00df\3\u00df\7\u00df\u0978\n\u00df\f\u00df\16"+
		"\u00df\u097b\13\u00df\3\u00df\3\u00df\3\u00e0\3\u00e0\3\u00e0\3\u00e0"+
		"\3\u00e0\3\u00e1\3\u00e1\3\u00e1\7\u00e1\u0987\n\u00e1\f\u00e1\16\u00e1"+
		"\u098a\13\u00e1\3\u00e2\3\u00e2\7\u00e2\u098e\n\u00e2\f\u00e2\16\u00e2"+
		"\u0991\13\u00e2\3\u00e3\3\u00e3\3\u00e3\5\u00e3\u0996\n\u00e3\3\u00e4"+
		"\3\u00e4\3\u00e4\3\u00e4\3\u00e4\5\u00e4\u099d\n\u00e4\3\u00e5\6\u00e5"+
		"\u09a0\n\u00e5\r\u00e5\16\u00e5\u09a1\3\u00e6\3\u00e6\3\u00e6\3\u00e6"+
		"\5\u00e6\u09a8\n\u00e6\3\u00e6\5\u00e6\u09ab\n\u00e6\3\u00e7\6\u00e7\u09ae"+
		"\n\u00e7\r\u00e7\16\u00e7\u09af\3\u00e8\3\u00e8\6\u00e8\u09b4\n\u00e8"+
		"\r\u00e8\16\u00e8\u09b5\3\u00e8\3\u00e8\3\u00e9\3\u00e9\3\u00e9\3\u00e9"+
		"\3\u00e9\3\u00ea\3\u00ea\3\u00ea\3\u00ea\5\u00ea\u09c3\n\u00ea\3\u00ea"+
		"\3\u00ea\6\u00ea\u09c7\n\u00ea\r\u00ea\16\u00ea\u09c8\7\u00ea\u09cb\n"+
		"\u00ea\f\u00ea\16\u00ea\u09ce\13\u00ea\3\u00eb\3\u00eb\3\u00eb\3\u00eb"+
		"\3\u00eb\5\u00eb\u09d5\n\u00eb\3\u00ec\6\u00ec\u09d8\n\u00ec\r\u00ec\16"+
		"\u00ec\u09d9\3\u00ec\2\31&>R^bp\u00a6\u00d6\u0120\u0148\u0154\u0162\u016e"+
		"\u0170\u0174\u017c\u0188\u018e\u0190\u0198\u01a4\u01aa\u01d2\u00ed\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP"+
		"RTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6"+
		"\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be"+
		"\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6"+
		"\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee"+
		"\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106"+
		"\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e"+
		"\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136"+
		"\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e"+
		"\u0150\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164\u0166"+
		"\u0168\u016a\u016c\u016e\u0170\u0172\u0174\u0176\u0178\u017a\u017c\u017e"+
		"\u0180\u0182\u0184\u0186\u0188\u018a\u018c\u018e\u0190\u0192\u0194\u0196"+
		"\u0198\u019a\u019c\u019e\u01a0\u01a2\u01a4\u01a6\u01a8\u01aa\u01ac\u01ae"+
		"\u01b0\u01b2\u01b4\u01b6\u01b8\u01ba\u01bc\u01be\u01c0\u01c2\u01c4\u01c6"+
		"\u01c8\u01ca\u01cc\u01ce\u01d0\u01d2\u01d4\u01d6\2\17\3\2VW\3\2\"#\4\2"+
		"\u0093\u0093\u00a8\u00a8\4\2\u008f\u008f\u0097\u0097\4\2MM^^\4\2\13\20"+
		"\64\u00a1\4\2\'\'yy\r\2\64=CCFF||\177\177\u0089\u0089\u008f\u008f\u0096"+
		"\u0096\u00a1\u00a1\u00a6\u00a8\u00aa\u00aa\13\2\64=CCFF||\177\177\u0089"+
		"\u0089\u0096\u0097\u00a1\u00a1\u00a6\u00a8\f\2\64=CCFF||\177\177\u0089"+
		"\u0089\u008f\u008f\u0096\u0096\u00a1\u00a1\u00a6\u00aa\f\2\64=CCFF||\177"+
		"\177\u0089\u0089\u008f\u008f\u0096\u0096\u00a1\u00a1\u00a6\u00a8\5\2\32"+
		"\33((**\5\2\t\t\21\22\32\33\2\u0a5c\2\u01d8\3\2\2\2\4\u01e9\3\2\2\2\6"+
		"\u01f3\3\2\2\2\b\u01f7\3\2\2\2\n\u01ff\3\2\2\2\f\u021b\3\2\2\2\16\u0222"+
		"\3\2\2\2\20\u0232\3\2\2\2\22\u0248\3\2\2\2\24\u0255\3\2\2\2\26\u0257\3"+
		"\2\2\2\30\u0266\3\2\2\2\32\u0270\3\2\2\2\34\u027d\3\2\2\2\36\u0287\3\2"+
		"\2\2 \u0295\3\2\2\2\"\u02aa\3\2\2\2$\u02be\3\2\2\2&\u02c6\3\2\2\2(\u02d2"+
		"\3\2\2\2*\u02de\3\2\2\2,\u02ee\3\2\2\2.\u0301\3\2\2\2\60\u0314\3\2\2\2"+
		"\62\u0316\3\2\2\2\64\u0336\3\2\2\2\66\u0338\3\2\2\28\u0350\3\2\2\2:\u0352"+
		"\3\2\2\2<\u035e\3\2\2\2>\u0360\3\2\2\2@\u0370\3\2\2\2B\u0372\3\2\2\2D"+
		"\u0379\3\2\2\2F\u0380\3\2\2\2H\u03a0\3\2\2\2J\u03a2\3\2\2\2L\u03af\3\2"+
		"\2\2N\u03b8\3\2\2\2P\u03bf\3\2\2\2R\u03d3\3\2\2\2T\u03eb\3\2\2\2V\u03ee"+
		"\3\2\2\2X\u041f\3\2\2\2Z\u0421\3\2\2\2\\\u0423\3\2\2\2^\u043b\3\2\2\2"+
		"`\u04af\3\2\2\2b\u04b1\3\2\2\2d\u04c3\3\2\2\2f\u04d2\3\2\2\2h\u04d4\3"+
		"\2\2\2j\u04db\3\2\2\2l\u04f2\3\2\2\2n\u04f4\3\2\2\2p\u04fe\3\2\2\2r\u0508"+
		"\3\2\2\2t\u050e\3\2\2\2v\u0513\3\2\2\2x\u0537\3\2\2\2z\u0539\3\2\2\2|"+
		"\u0548\3\2\2\2~\u0554\3\2\2\2\u0080\u0556\3\2\2\2\u0082\u055d\3\2\2\2"+
		"\u0084\u0561\3\2\2\2\u0086\u0566\3\2\2\2\u0088\u056f\3\2\2\2\u008a\u0574"+
		"\3\2\2\2\u008c\u0577\3\2\2\2\u008e\u057c\3\2\2\2\u0090\u058a\3\2\2\2\u0092"+
		"\u0595\3\2\2\2\u0094\u0599\3\2\2\2\u0096\u059b\3\2\2\2\u0098\u05a4\3\2"+
		"\2\2\u009a\u05ad\3\2\2\2\u009c\u05bf\3\2\2\2\u009e\u05c2\3\2\2\2\u00a0"+
		"\u05cb\3\2\2\2\u00a2\u05d3\3\2\2\2\u00a4\u05db\3\2\2\2\u00a6\u05ed\3\2"+
		"\2\2\u00a8\u05fe\3\2\2\2\u00aa\u0610\3\2\2\2\u00ac\u0612\3\2\2\2\u00ae"+
		"\u0615\3\2\2\2\u00b0\u0619\3\2\2\2\u00b2\u061e\3\2\2\2\u00b4\u0620\3\2"+
		"\2\2\u00b6\u0622\3\2\2\2\u00b8\u062c\3\2\2\2\u00ba\u0630\3\2\2\2\u00bc"+
		"\u0632\3\2\2\2\u00be\u0636\3\2\2\2\u00c0\u063c\3\2\2\2\u00c2\u063e\3\2"+
		"\2\2\u00c4\u0640\3\2\2\2\u00c6\u0642\3\2\2\2\u00c8\u0644\3\2\2\2\u00ca"+
		"\u0646\3\2\2\2\u00cc\u0653\3\2\2\2\u00ce\u0657\3\2\2\2\u00d0\u0659\3\2"+
		"\2\2\u00d2\u065e\3\2\2\2\u00d4\u0663\3\2\2\2\u00d6\u0665\3\2\2\2\u00d8"+
		"\u0673\3\2\2\2\u00da\u0681\3\2\2\2\u00dc\u0683\3\2\2\2\u00de\u068f\3\2"+
		"\2\2\u00e0\u069b\3\2\2\2\u00e2\u069d\3\2\2\2\u00e4\u06a1\3\2\2\2\u00e6"+
		"\u06ac\3\2\2\2\u00e8\u06b0\3\2\2\2\u00ea\u06c2\3\2\2\2\u00ec\u06ca\3\2"+
		"\2\2\u00ee\u06d6\3\2\2\2\u00f0\u06d8\3\2\2\2\u00f2\u06da\3\2\2\2\u00f4"+
		"\u06ed\3\2\2\2\u00f6\u06ef\3\2\2\2\u00f8\u06f6\3\2\2\2\u00fa\u06fd\3\2"+
		"\2\2\u00fc\u0706\3\2\2\2\u00fe\u070f\3\2\2\2\u0100\u0718\3\2\2\2\u0102"+
		"\u072f\3\2\2\2\u0104\u0740\3\2\2\2\u0106\u0742\3\2\2\2\u0108\u074e\3\2"+
		"\2\2\u010a\u0750\3\2\2\2\u010c\u0752\3\2\2\2\u010e\u0758\3\2\2\2\u0110"+
		"\u075f\3\2\2\2\u0112\u0762\3\2\2\2\u0114\u076b\3\2\2\2\u0116\u0773\3\2"+
		"\2\2\u0118\u077f\3\2\2\2\u011a\u0787\3\2\2\2\u011c\u0794\3\2\2\2\u011e"+
		"\u0796\3\2\2\2\u0120\u079a\3\2\2\2\u0122\u07a8\3\2\2\2\u0124\u07aa\3\2"+
		"\2\2\u0126\u07af\3\2\2\2\u0128\u07b4\3\2\2\2\u012a\u07bc\3\2\2\2\u012c"+
		"\u07cd\3\2\2\2\u012e\u07cf\3\2\2\2\u0130\u07d1\3\2\2\2\u0132\u07d4\3\2"+
		"\2\2\u0134\u07d7\3\2\2\2\u0136\u07da\3\2\2\2\u0138\u07dd\3\2\2\2\u013a"+
		"\u07e0\3\2\2\2\u013c\u07e2\3\2\2\2\u013e\u07e4\3\2\2\2\u0140\u07e6\3\2"+
		"\2\2\u0142\u07e8\3\2\2\2\u0144\u07ea\3\2\2\2\u0146\u07f3\3\2\2\2\u0148"+
		"\u07f5\3\2\2\2\u014a\u0806\3\2\2\2\u014c\u0808\3\2\2\2\u014e\u080a\3\2"+
		"\2\2\u0150\u0812\3\2\2\2\u0152\u0814\3\2\2\2\u0154\u081b\3\2\2\2\u0156"+
		"\u0826\3\2\2\2\u0158\u082a\3\2\2\2\u015a\u082e\3\2\2\2\u015c\u0835\3\2"+
		"\2\2\u015e\u0837\3\2\2\2\u0160\u083c\3\2\2\2\u0162\u083e\3\2\2\2\u0164"+
		"\u084d\3\2\2\2\u0166\u084f\3\2\2\2\u0168\u0857\3\2\2\2\u016a\u0859\3\2"+
		"\2\2\u016c\u0866\3\2\2\2\u016e\u0868\3\2\2\2\u0170\u0873\3\2\2\2\u0172"+
		"\u0883\3\2\2\2\u0174\u088a\3\2\2\2\u0176\u0899\3\2\2\2\u0178\u089b\3\2"+
		"\2\2\u017a\u08a4\3\2\2\2\u017c\u08a6\3\2\2\2\u017e\u08b5\3\2\2\2\u0180"+
		"\u08b7\3\2\2\2\u0182\u08b9\3\2\2\2\u0184\u08bf\3\2\2\2\u0186\u08c1\3\2"+
		"\2\2\u0188\u08c8\3\2\2\2\u018a\u08d3\3\2\2\2\u018c\u08d7\3\2\2\2\u018e"+
		"\u08db\3\2\2\2\u0190\u08e6\3\2\2\2\u0192\u08f5\3\2\2\2\u0194\u08f7\3\2"+
		"\2\2\u0196\u0900\3\2\2\2\u0198\u0902\3\2\2\2\u019a\u0911\3\2\2\2\u019c"+
		"\u0913\3\2\2\2\u019e\u0915\3\2\2\2\u01a0\u091b\3\2\2\2\u01a2\u091d\3\2"+
		"\2\2\u01a4\u0924\3\2\2\2\u01a6\u092f\3\2\2\2\u01a8\u0933\3\2\2\2\u01aa"+
		"\u093a\3\2\2\2\u01ac\u0949\3\2\2\2\u01ae\u094b\3\2\2\2\u01b0\u094f\3\2"+
		"\2\2\u01b2\u0958\3\2\2\2\u01b4\u095a\3\2\2\2\u01b6\u0963\3\2\2\2\u01b8"+
		"\u0965\3\2\2\2\u01ba\u0969\3\2\2\2\u01bc\u0974\3\2\2\2\u01be\u097e\3\2"+
		"\2\2\u01c0\u0983\3\2\2\2\u01c2\u098b\3\2\2\2\u01c4\u0992\3\2\2\2\u01c6"+
		"\u099c\3\2\2\2\u01c8\u099f\3\2\2\2\u01ca\u09aa\3\2\2\2\u01cc\u09ad\3\2"+
		"\2\2\u01ce\u09b1\3\2\2\2\u01d0\u09b9\3\2\2\2\u01d2\u09c2\3\2\2\2\u01d4"+
		"\u09d4\3\2\2\2\u01d6\u09d7\3\2\2\2\u01d8\u01d9\7c\2\2\u01d9\u01da\5\u00c6"+
		"d\2\u01da\u01e1\7\26\2\2\u01db\u01de\5\u00c6d\2\u01dc\u01dd\7\23\2\2\u01dd"+
		"\u01df\5\u00ecw\2\u01de\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e2"+
		"\3\2\2\2\u01e0\u01e2\5\u00ecw\2\u01e1\u01db\3\2\2\2\u01e1\u01e0\3\2\2"+
		"\2\u01e2\u01e3\3\2\2\2\u01e3\u01e4\7\27\2\2\u01e4\u01e5\7\21\2\2\u01e5"+
		"\u01e6\5\u0086D\2\u01e6\u01e7\5\u0098M\2\u01e7\u01e8\5\u0088E\2\u01e8"+
		"\3\3\2\2\2\u01e9\u01ea\7c\2\2\u01ea\u01eb\5\u00c6d\2\u01eb\u01ec\7\26"+
		"\2\2\u01ec\u01ed\5\u00aaV\2\u01ed\u01ee\7\27\2\2\u01ee\u01ef\7\21\2\2"+
		"\u01ef\u01f0\5\u0086D\2\u01f0\u01f1\5\u0096L\2\u01f1\u01f2\5\u0088E\2"+
		"\u01f2\5\3\2\2\2\u01f3\u01f4\5\u00c8e\2\u01f4\u01f5\7-\2\2\u01f5\u01f6"+
		"\5^\60\2\u01f6\7\3\2\2\2\u01f7\u01f8\5\u00c8e\2\u01f8\u01fa\7\26\2\2\u01f9"+
		"\u01fb\5p9\2\u01fa\u01f9\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fc\3\2\2"+
		"\2\u01fc\u01fd\7\27\2\2\u01fd\t\3\2\2\2\u01fe\u0200\7\u0093\2\2\u01ff"+
		"\u01fe\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0202\7N"+
		"\2\2\u0202\u0203\5\u00c4c\2\u0203\u0204\7\26\2\2\u0204\u0205\5\u00a6T"+
		"\2\u0205\u0206\7\27\2\2\u0206\u0207\7\21\2\2\u0207\u0217\5\u0086D\2\u0208"+
		"\u0218\7\u0087\2\2\u0209\u020d\5\u009cO\2\u020a\u020b\5\u0084C\2\u020b"+
		"\u020c\5\f\7\2\u020c\u020e\3\2\2\2\u020d\u020a\3\2\2\2\u020d\u020e\3\2"+
		"\2\2\u020e\u0216\3\2\2\2\u020f\u0213\5\f\7\2\u0210\u0211\5\u0084C\2\u0211"+
		"\u0212\5\u009cO\2\u0212\u0214\3\2\2\2\u0213\u0210\3\2\2\2\u0213\u0214"+
		"\3\2\2\2\u0214\u0216\3\2\2\2\u0215\u0209\3\2\2\2\u0215\u020f\3\2\2\2\u0216"+
		"\u0218\3\2\2\2\u0217\u0208\3\2\2\2\u0217\u0215\3\2\2\2\u0218\u0219\3\2"+
		"\2\2\u0219\u021a\5\u0088E\2\u021a\13\3\2\2\2\u021b\u021c\7s\2\2\u021c"+
		"\u021e\7\26\2\2\u021d\u021f\5\u00eav\2\u021e\u021d\3\2\2\2\u021e\u021f"+
		"\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0221\7\27\2\2\u0221\r\3\2\2\2\u0222"+
		"\u0223\7\u009c\2\2\u0223\u0224\5\u00c6d\2\u0224\u0226\7\26\2\2\u0225\u0227"+
		"\5\u00c6d\2\u0226\u0225\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u0228\3\2\2"+
		"\2\u0228\u0229\7\27\2\2\u0229\u022a\7\21\2\2\u022a\u022d\5\u0086D\2\u022b"+
		"\u022e\5\u00d8m\2\u022c\u022e\7\u0087\2\2\u022d\u022b\3\2\2\2\u022d\u022c"+
		"\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0230\5\u0088E\2\u0230\17\3\2\2\2\u0231"+
		"\u0233\7\u0093\2\2\u0232\u0231\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0234"+
		"\3\2\2\2\u0234\u0235\t\2\2\2\u0235\u0236\5\u00c6d\2\u0236\u023d\7\26\2"+
		"\2\u0237\u023e\5\24\13\2\u0238\u023e\5\u00ecw\2\u0239\u023a\5\24\13\2"+
		"\u023a\u023b\7\23\2\2\u023b\u023c\5\u00ecw\2\u023c\u023e\3\2\2\2\u023d"+
		"\u0237\3\2\2\2\u023d\u0238\3\2\2\2\u023d\u0239\3\2\2\2\u023e\u023f\3\2"+
		"\2\2\u023f\u0240\7\27\2\2\u0240\u0241\7\21\2\2\u0241\u0244\5\u0086D\2"+
		"\u0242\u0245\5\u00d8m\2\u0243\u0245\7\u0087\2\2\u0244\u0242\3\2\2\2\u0244"+
		"\u0243\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0247\5\u0088E\2\u0247\21\3\2"+
		"\2\2\u0248\u0249\7\u0091\2\2\u0249\u024a\5\u00c6d\2\u024a\u024b\7\26\2"+
		"\2\u024b\u024c\5\u00ecw\2\u024c\u024d\7\27\2\2\u024d\u024e\7\21\2\2\u024e"+
		"\u0251\5\u0086D\2\u024f\u0252\5\u00d8m\2\u0250\u0252\7\u0087\2\2\u0251"+
		"\u024f\3\2\2\2\u0251\u0250\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0254\5\u0088"+
		"E\2\u0254\23\3\2\2\2\u0255\u0256\5\u00b6\\\2\u0256\25\3\2\2\2\u0257\u0258"+
		"\7Z\2\2\u0258\u0259\7\u0083\2\2\u0259\u025a\5\u012c\u0097\2\u025a\u025b"+
		"\7\26\2\2\u025b\u025c\5\u00ceh\2\u025c\u025f\7\27\2\2\u025d\u025e\7\63"+
		"\2\2\u025e\u0260\5\u00a6T\2\u025f\u025d\3\2\2\2\u025f\u0260\3\2\2\2\u0260"+
		"\u0261\3\2\2\2\u0261\u0262\7\21\2\2\u0262\u0263\5\u0086D\2\u0263\u0264"+
		"\5\u00fa~\2\u0264\u0265\5\u0088E\2\u0265\27\3\2\2\2\u0266\u0267\7Z\2\2"+
		"\u0267\u0268\5\u00c2b\2\u0268\u0269\7\u0090\2\2\u0269\u026a\7\26\2\2\u026a"+
		"\u026b\7\27\2\2\u026b\u026c\7\21\2\2\u026c\u026d\5\u0086D\2\u026d\u026e"+
		"\5\u00fa~\2\u026e\u026f\5\u0088E\2\u026f\31\3\2\2\2\u0270\u0271\7Z\2\2"+
		"\u0271\u0273\5\u00c2b\2\u0272\u0274\7{\2\2\u0273\u0272\3\2\2\2\u0273\u0274"+
		"\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0276\7\u0090\2\2\u0276\u0277\7\26"+
		"\2\2\u0277\u0278\7\27\2\2\u0278\u0279\7\21\2\2\u0279\u027a\5\u0086D\2"+
		"\u027a\u027b\5\u00f2z\2\u027b\u027c\5\u0088E\2\u027c\33\3\2\2\2\u027d"+
		"\u027e\7Z\2\2\u027e\u027f\5\u00c2b\2\u027f\u0280\7o\2\2\u0280\u0281\7"+
		"\26\2\2\u0281\u0282\7\27\2\2\u0282\u0283\7\21\2\2\u0283\u0284\5\u0086"+
		"D\2\u0284\u0285\5\u00fa~\2\u0285\u0286\5\u0088E\2\u0286\35\3\2\2\2\u0287"+
		"\u0288\7Z\2\2\u0288\u028a\5\u00c2b\2\u0289\u028b\7{\2\2\u028a\u0289\3"+
		"\2\2\2\u028a\u028b\3\2\2\2\u028b\u028c\3\2\2\2\u028c\u028d\7o\2\2\u028d"+
		"\u028e\7\26\2\2\u028e\u028f\7\27\2\2\u028f\u0290\7\21\2\2\u0290\u0291"+
		"\5\u0086D\2\u0291\u0292\5\u00f2z\2\u0292\u0293\5\u0088E\2\u0293\37\3\2"+
		"\2\2\u0294\u0296\7\u0093\2\2\u0295\u0294\3\2\2\2\u0295\u0296\3\2\2\2\u0296"+
		"\u0297\3\2\2\2\u0297\u0298\7{\2\2\u0298\u0299\t\2\2\2\u0299\u029a\5\u00c6"+
		"d\2\u029a\u029c\7\26\2\2\u029b\u029d\5\u00ecw\2\u029c\u029b\3\2\2\2\u029c"+
		"\u029d\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u029f\7\27\2\2\u029f\u02a0\7"+
		"\21\2\2\u02a0\u02a1\5\u0086D\2\u02a1\u02a5\5$\23\2\u02a2\u02a3\5\u0084"+
		"C\2\u02a3\u02a4\5\u00dco\2\u02a4\u02a6\3\2\2\2\u02a5\u02a2\3\2\2\2\u02a5"+
		"\u02a6\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02a8\5\u0088E\2\u02a8!\3\2\2"+
		"\2\u02a9\u02ab\7\u0093\2\2\u02aa\u02a9\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab"+
		"\u02ac\3\2\2\2\u02ac\u02ad\7{\2\2\u02ad\u02ae\7\u008b\2\2\u02ae\u02af"+
		"\5\u00c6d\2\u02af\u02b1\7\26\2\2\u02b0\u02b2\5\u00ecw\2\u02b1\u02b0\3"+
		"\2\2\2\u02b1\u02b2\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b4\7\27\2\2\u02b4"+
		"\u02b5\7\21\2\2\u02b5\u02b6\5\u0086D\2\u02b6\u02ba\5$\23\2\u02b7\u02b8"+
		"\5\u0084C\2\u02b8\u02b9\5\u00dco\2\u02b9\u02bb\3\2\2\2\u02ba\u02b7\3\2"+
		"\2\2\u02ba\u02bb\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc\u02bd\5\u0088E\2\u02bd"+
		"#\3\2\2\2\u02be\u02bf\7Z\2\2\u02bf\u02c0\t\2\2\2\u02c0\u02c1\7Q\2\2\u02c1"+
		"\u02c2\7\21\2\2\u02c2\u02c3\5\u0086D\2\u02c3\u02c4\5&\24\2\u02c4\u02c5"+
		"\5\u0088E\2\u02c5%\3\2\2\2\u02c6\u02c7\b\24\1\2\u02c7\u02c8\5\u00e0q\2"+
		"\u02c8\u02cf\3\2\2\2\u02c9\u02ca\f\3\2\2\u02ca\u02cb\5\u0084C\2\u02cb"+
		"\u02cc\5\u00e0q\2\u02cc\u02ce\3\2\2\2\u02cd\u02c9\3\2\2\2\u02ce\u02d1"+
		"\3\2\2\2\u02cf\u02cd\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\'\3\2\2\2\u02d1"+
		"\u02cf\3\2\2\2\u02d2\u02d3\7G\2\2\u02d3\u02d4\7Z\2\2\u02d4\u02d5\5\u00b8"+
		"]\2\u02d5\u02d7\7\26\2\2\u02d6\u02d8\5\u00caf\2\u02d7\u02d6\3\2\2\2\u02d7"+
		"\u02d8\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9\u02dc\7\27\2\2\u02da\u02db\7"+
		"\63\2\2\u02db\u02dd\5\u00a6T\2\u02dc\u02da\3\2\2\2\u02dc\u02dd\3\2\2\2"+
		"\u02dd)\3\2\2\2\u02de\u02df\7Z\2\2\u02df\u02e0\5\u00b8]\2\u02e0\u02e2"+
		"\7\26\2\2\u02e1\u02e3\5\u00caf\2\u02e2\u02e1\3\2\2\2\u02e2\u02e3\3\2\2"+
		"\2\u02e3\u02e4\3\2\2\2\u02e4\u02e7\7\27\2\2\u02e5\u02e6\7\63\2\2\u02e6"+
		"\u02e8\5\u00a6T\2\u02e7\u02e5\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8\u02e9"+
		"\3\2\2\2\u02e9\u02ea\7\21\2\2\u02ea\u02eb\5\u0086D\2\u02eb\u02ec\5\u00fa"+
		"~\2\u02ec\u02ed\5\u0088E\2\u02ed+\3\2\2\2\u02ee\u02f0\7Z\2\2\u02ef\u02f1"+
		"\7{\2\2\u02f0\u02ef\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2"+
		"\u02f3\5\u00b8]\2\u02f3\u02f5\7\26\2\2\u02f4\u02f6\5\u00caf\2\u02f5\u02f4"+
		"\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7\u02fa\7\27\2\2"+
		"\u02f8\u02f9\7\63\2\2\u02f9\u02fb\5\u00d4k\2\u02fa\u02f8\3\2\2\2\u02fa"+
		"\u02fb\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\u02fd\7\21\2\2\u02fd\u02fe\5"+
		"\u0086D\2\u02fe\u02ff\5\u00f2z\2\u02ff\u0300\5\u0088E\2\u0300-\3\2\2\2"+
		"\u0301\u0302\7Z\2\2\u0302\u0303\7\u0096\2\2\u0303\u0304\7\u00ab\2\2\u0304"+
		"\u0305\7\26\2\2\u0305\u0306\7\27\2\2\u0306\u0307\7\21\2\2\u0307\u0308"+
		"\5\u0086D\2\u0308\u0309\5\u00fa~\2\u0309\u030a\5\u0088E\2\u030a\u030b"+
		"\5\u0084C\2\u030b\u030c\7\u009b\2\2\u030c\u0312\7\21\2\2\u030d\u030e\5"+
		"\u0086D\2\u030e\u030f\5\u00fc\177\2\u030f\u0310\5\u0088E\2\u0310\u0313"+
		"\3\2\2\2\u0311\u0313\5\u00c8e\2\u0312\u030d\3\2\2\2\u0312\u0311\3\2\2"+
		"\2\u0313/\3\2\2\2\u0314\u0315\5^\60\2\u0315\61\3\2\2\2\u0316\u0317\5\u00c2"+
		"b\2\u0317\u0318\7\21\2\2\u0318\u031d\5\u00d4k\2\u0319\u031a\7\26\2\2\u031a"+
		"\u031b\5\u00ecw\2\u031b\u031c\7\27\2\2\u031c\u031e\3\2\2\2\u031d\u0319"+
		"\3\2\2\2\u031d\u031e\3\2\2\2\u031e\u0321\3\2\2\2\u031f\u0320\7-\2\2\u0320"+
		"\u0322\5\u010e\u0088\2\u0321\u031f\3\2\2\2\u0321\u0322\3\2\2\2\u0322\63"+
		"\3\2\2\2\u0323\u0337\5:\36\2\u0324\u0337\5|?\2\u0325\u0337\5\u0080A\2"+
		"\u0326\u0337\58\35\2\u0327\u0337\5\66\34\2\u0328\u0337\5Z.\2\u0329\u0337"+
		"\5\\/\2\u032a\u0337\5P)\2\u032b\u0337\5F$\2\u032c\u0337\5J&\2\u032d\u0337"+
		"\5N(\2\u032e\u0337\5L\'\2\u032f\u0337\5T+\2\u0330\u0337\5V,\2\u0331\u0337"+
		"\5t;\2\u0332\u0337\5B\"\2\u0333\u0337\5D#\2\u0334\u0337\5*\26\2\u0335"+
		"\u0337\5\u00f0y\2\u0336\u0323\3\2\2\2\u0336\u0324\3\2\2\2\u0336\u0325"+
		"\3\2\2\2\u0336\u0326\3\2\2\2\u0336\u0327\3\2\2\2\u0336\u0328\3\2\2\2\u0336"+
		"\u0329\3\2\2\2\u0336\u032a\3\2\2\2\u0336\u032b\3\2\2\2\u0336\u032c\3\2"+
		"\2\2\u0336\u032d\3\2\2\2\u0336\u032e\3\2\2\2\u0336\u032f\3\2\2\2\u0336"+
		"\u0330\3\2\2\2\u0336\u0331\3\2\2\2\u0336\u0332\3\2\2\2\u0336\u0333\3\2"+
		"\2\2\u0336\u0334\3\2\2\2\u0336\u0335\3\2\2\2\u0337\65\3\2\2\2\u0338\u0339"+
		"\7l\2\2\u0339\u033a\7\26\2\2\u033a\u033b\7\27\2\2\u033b\67\3\2\2\2\u033c"+
		"\u033d\7]\2\2\u033d\u033e\7\26\2\2\u033e\u033f\5\u00a2R\2\u033f\u0340"+
		"\7\27\2\2\u0340\u0351\3\2\2\2\u0341\u0342\7\u0094\2\2\u0342\u0343\7\26"+
		"\2\2\u0343\u0344\5\u00a2R\2\u0344\u0345\7\27\2\2\u0345\u0351\3\2\2\2\u0346"+
		"\u0347\7]\2\2\u0347\u0348\7\26\2\2\u0348\u0349\5\u00a2R\2\u0349\u034a"+
		"\7\27\2\2\u034a\u034b\7J\2\2\u034b\u034c\7\u0094\2\2\u034c\u034d\7\26"+
		"\2\2\u034d\u034e\5\u00a2R\2\u034e\u034f\7\27\2\2\u034f\u0351\3\2\2\2\u0350"+
		"\u033c\3\2\2\2\u0350\u0341\3\2\2\2\u0350\u0346\3\2\2\2\u03519\3\2\2\2"+
		"\u0352\u0353\5<\37\2\u0353\u0355\7\26\2\2\u0354\u0356\5p9\2\u0355\u0354"+
		"\3\2\2\2\u0355\u0356\3\2\2\2\u0356\u0357\3\2\2\2\u0357\u0358\7\27\2\2"+
		"\u0358;\3\2\2\2\u0359\u035f\5\u00b8]\2\u035a\u035b\5> \2\u035b\u035c\7"+
		"\25\2\2\u035c\u035d\5\u00b8]\2\u035d\u035f\3\2\2\2\u035e\u0359\3\2\2\2"+
		"\u035e\u035a\3\2\2\2\u035f=\3\2\2\2\u0360\u0361\b \1\2\u0361\u0362\5\u00c0"+
		"a\2\u0362\u0367\3\2\2\2\u0363\u0364\f\3\2\2\u0364\u0366\5@!\2\u0365\u0363"+
		"\3\2\2\2\u0366\u0369\3\2\2\2\u0367\u0365\3\2\2\2\u0367\u0368\3\2\2\2\u0368"+
		"?\3\2\2\2\u0369\u0367\3\2\2\2\u036a\u036b\7\25\2\2\u036b\u0371\5\u00c2"+
		"b\2\u036c\u036d\7\30\2\2\u036d\u036e\5^\60\2\u036e\u036f\7\31\2\2\u036f"+
		"\u0371\3\2\2\2\u0370\u036a\3\2\2\2\u0370\u036c\3\2\2\2\u0371A\3\2\2\2"+
		"\u0372\u0373\7\u009d\2\2\u0373\u0374\5\u011e\u0090\2\u0374\u0375\7\21"+
		"\2\2\u0375\u0376\5\u0086D\2\u0376\u0377\5\u00fa~\2\u0377\u0378\5\u0088"+
		"E\2\u0378C\3\2\2\2\u0379\u037a\7\u009d\2\2\u037a\u037b\5\u00c6d\2\u037b"+
		"\u037c\7\21\2\2\u037c\u037d\5\u0086D\2\u037d\u037e\5\u00fa~\2\u037e\u037f"+
		"\5\u0088E\2\u037fE\3\2\2\2\u0380\u0381\7\u0095\2\2\u0381\u0382\7\u0080"+
		"\2\2\u0382\u0383\5^\60\2\u0383\u0384\7\21\2\2\u0384\u0385\5\u0086D\2\u0385"+
		"\u038d\5\u00fe\u0080\2\u0386\u0387\5\u0084C\2\u0387\u0388\7\u0086\2\2"+
		"\u0388\u0389\7\21\2\2\u0389\u038a\5\u0086D\2\u038a\u038b\5\u00fa~\2\u038b"+
		"\u038c\5\u0088E\2\u038c\u038e\3\2\2\2\u038d\u0386\3\2\2\2\u038d\u038e"+
		"\3\2\2\2\u038e\u038f\3\2\2\2\u038f\u0390\5\u0088E\2\u0390G\3\2\2\2\u0391"+
		"\u0392\7\u009e\2\2\u0392\u0393\5\u0104\u0083\2\u0393\u0394\7\21\2\2\u0394"+
		"\u0395\5\u0086D\2\u0395\u0396\5\u00fa~\2\u0396\u0397\5\u0088E\2\u0397"+
		"\u03a1\3\2\2\2\u0398\u0399\7\u009e\2\2\u0399\u039a\7r\2\2\u039a\u039b"+
		"\5\u0102\u0082\2\u039b\u039c\7\21\2\2\u039c\u039d\5\u0086D\2\u039d\u039e"+
		"\5\u00fa~\2\u039e\u039f\5\u0088E\2\u039f\u03a1\3\2\2\2\u03a0\u0391\3\2"+
		"\2\2\u03a0\u0398\3\2\2\2\u03a1I\3\2\2\2\u03a2\u03a3\7m\2\2\u03a3\u03a6"+
		"\5\u00c2b\2\u03a4\u03a5\7\23\2\2\u03a5\u03a7\5\u00c2b\2\u03a6\u03a4\3"+
		"\2\2\2\u03a6\u03a7\3\2\2\2\u03a7\u03a8\3\2\2\2\u03a8\u03a9\7r\2\2\u03a9"+
		"\u03aa\5^\60\2\u03aa\u03ab\7\21\2\2\u03ab\u03ac\5\u0086D\2\u03ac\u03ad"+
		"\5\u00fa~\2\u03ad\u03ae\5\u0088E\2\u03aeK\3\2\2\2\u03af\u03b0\7_\2\2\u03b0"+
		"\u03b1\7\21\2\2\u03b1\u03b2\5\u0086D\2\u03b2\u03b3\5\u00fa~\2\u03b3\u03b4"+
		"\5\u0088E\2\u03b4\u03b5\5\u0084C\2\u03b5\u03b6\7\u00a0\2\2\u03b6\u03b7"+
		"\5^\60\2\u03b7M\3\2\2\2\u03b8\u03b9\7\u00a0\2\2\u03b9\u03ba\5^\60\2\u03ba"+
		"\u03bb\7\21\2\2\u03bb\u03bc\5\u0086D\2\u03bc\u03bd\5\u00fa~\2\u03bd\u03be"+
		"\5\u0088E\2\u03beO\3\2\2\2\u03bf\u03c0\7q\2\2\u03c0\u03c1\5^\60\2\u03c1"+
		"\u03c2\7\21\2\2\u03c2\u03c3\5\u0086D\2\u03c3\u03c4\5\u00fa~\2\u03c4\u03c8"+
		"\5\u0088E\2\u03c5\u03c6\5\u0084C\2\u03c6\u03c7\5R*\2\u03c7\u03c9\3\2\2"+
		"\2\u03c8\u03c5\3\2\2\2\u03c8\u03c9\3\2\2\2\u03c9\u03d1\3\2\2\2\u03ca\u03cb"+
		"\5\u0084C\2\u03cb\u03cc\7b\2\2\u03cc\u03cd\7\21\2\2\u03cd\u03ce\5\u0086"+
		"D\2\u03ce\u03cf\5\u00fa~\2\u03cf\u03d0\5\u0088E\2\u03d0\u03d2\3\2\2\2"+
		"\u03d1\u03ca\3\2\2\2\u03d1\u03d2\3\2\2\2\u03d2Q\3\2\2\2\u03d3\u03d4\b"+
		"*\1\2\u03d4\u03d5\7b\2\2\u03d5\u03d6\7q\2\2\u03d6\u03d7\5^\60\2\u03d7"+
		"\u03d8\7\21\2\2\u03d8\u03d9\5\u0086D\2\u03d9\u03da\5\u00fa~\2\u03da\u03db"+
		"\5\u0088E\2\u03db\u03e8\3\2\2\2\u03dc\u03dd\f\3\2\2\u03dd\u03de\5\u0084"+
		"C\2\u03de\u03df\7b\2\2\u03df\u03e0\7q\2\2\u03e0\u03e1\5^\60\2\u03e1\u03e2"+
		"\7\21\2\2\u03e2\u03e3\5\u0086D\2\u03e3\u03e4\5\u00fa~\2\u03e4\u03e5\5"+
		"\u0088E\2\u03e5\u03e7\3\2\2\2\u03e6\u03dc\3\2\2\2\u03e7\u03ea\3\2\2\2"+
		"\u03e8\u03e6\3\2\2\2\u03e8\u03e9\3\2\2\2\u03e9S\3\2\2\2\u03ea\u03e8\3"+
		"\2\2\2\u03eb\u03ec\7\u0088\2\2\u03ec\u03ed\5^\60\2\u03edU\3\2\2\2\u03ee"+
		"\u03ef\7\u009a\2\2\u03ef\u03f0\5\u00c2b\2\u03f0\u03f1\7\21\2\2\u03f1\u03f2"+
		"\5\u0086D\2\u03f2\u03f3\5\u00fa~\2\u03f3\u03f4\5\u0088E\2\u03f4\u03f6"+
		"\5\u0082B\2\u03f5\u03f7\5\u0100\u0081\2\u03f6\u03f5\3\2\2\2\u03f6\u03f7"+
		"\3\2\2\2\u03f7\u03ff\3\2\2\2\u03f8\u03f9\7e\2\2\u03f9\u03fa\7\21\2\2\u03fa"+
		"\u03fb\5\u0086D\2\u03fb\u03fc\5\u00fa~\2\u03fc\u03fd\5\u0088E\2\u03fd"+
		"\u03fe\5\u0082B\2\u03fe\u0400\3\2\2\2\u03ff\u03f8\3\2\2\2\u03ff\u0400"+
		"\3\2\2\2\u0400\u0408\3\2\2\2\u0401\u0402\7k\2\2\u0402\u0403\7\21\2\2\u0403"+
		"\u0404\5\u0086D\2\u0404\u0405\5\u00fa~\2\u0405\u0406\5\u0088E\2\u0406"+
		"\u0407\5\u0082B\2\u0407\u0409\3\2\2\2\u0408\u0401\3\2\2\2\u0408\u0409"+
		"\3\2\2\2\u0409\u040a\3\2\2\2\u040a\u040b\5\u0082B\2\u040bW\3\2\2\2\u040c"+
		"\u040d\7e\2\2\u040d\u040e\5\u00c8e\2\u040e\u040f\7\21\2\2\u040f\u0410"+
		"\5\u0086D\2\u0410\u0411\5\u00fa~\2\u0411\u0412\5\u0088E\2\u0412\u0413"+
		"\5\u0082B\2\u0413\u0420\3\2\2\2\u0414\u0415\7e\2\2\u0415\u0416\7r\2\2"+
		"\u0416\u0417\7\30\2\2\u0417\u0418\5\u009aN\2\u0418\u0419\7\31\2\2\u0419"+
		"\u041a\7\21\2\2\u041a\u041b\5\u0086D\2\u041b\u041c\5\u00fa~\2\u041c\u041d"+
		"\5\u0088E\2\u041d\u041e\5\u0082B\2\u041e\u0420\3\2\2\2\u041f\u040c\3\2"+
		"\2\2\u041f\u0414\3\2\2\2\u0420Y\3\2\2\2\u0421\u0422\7R\2\2\u0422[\3\2"+
		"\2\2\u0423\u0425\7\u008c\2\2\u0424\u0426\5^\60\2\u0425\u0424\3\2\2\2\u0425"+
		"\u0426\3\2\2\2\u0426]\3\2\2\2\u0427\u0428\b\60\1\2\u0428\u043c\5\u01ce"+
		"\u00e8\2\u0429\u043c\5\u01b0\u00d9\2\u042a\u043c\5b\62\2\u042b\u043c\5"+
		"d\63\2\u042c\u042d\7#\2\2\u042d\u043c\5^\60$\u042e\u042f\7}\2\2\u042f"+
		"\u043c\5^\60#\u0430\u0431\7?\2\2\u0431\u0432\7\26\2\2\u0432\u0433\5^\60"+
		"\2\u0433\u0434\7\27\2\2\u0434\u043c\3\2\2\2\u0435\u0436\7f\2\2\u0436\u0437"+
		"\7\26\2\2\u0437\u0438\5\u00c2b\2\u0438\u0439\7\27\2\2\u0439\u043c\3\2"+
		"\2\2\u043a\u043c\5`\61\2\u043b\u0427\3\2\2\2\u043b\u0429\3\2\2\2\u043b"+
		"\u042a\3\2\2\2\u043b\u042b\3\2\2\2\u043b\u042c\3\2\2\2\u043b\u042e\3\2"+
		"\2\2\u043b\u0430\3\2\2\2\u043b\u0435\3\2\2\2\u043b\u043a\3\2\2\2\u043c"+
		"\u04ac\3\2\2\2\u043d\u043e\f\"\2\2\u043e\u043f\5\u013c\u009f\2\u043f\u0440"+
		"\5^\60#\u0440\u04ab\3\2\2\2\u0441\u0442\f!\2\2\u0442\u0443\5\u013e\u00a0"+
		"\2\u0443\u0444\5^\60\"\u0444\u04ab\3\2\2\2\u0445\u0446\f \2\2\u0446\u0447"+
		"\5\u0142\u00a2\2\u0447\u0448\5^\60!\u0448\u04ab\3\2\2\2\u0449\u044a\f"+
		"\37\2\2\u044a\u044b\5\u0140\u00a1\2\u044b\u044c\5^\60 \u044c\u04ab\3\2"+
		"\2\2\u044d\u044e\f\36\2\2\u044e\u044f\t\3\2\2\u044f\u04ab\5^\60\37\u0450"+
		"\u0451\f\34\2\2\u0451\u0452\7*\2\2\u0452\u04ab\5^\60\35\u0453\u0454\f"+
		"\33\2\2\u0454\u0455\7+\2\2\u0455\u04ab\5^\60\34\u0456\u0457\f\32\2\2\u0457"+
		"\u0458\7(\2\2\u0458\u04ab\5^\60\33\u0459\u045a\f\31\2\2\u045a\u045b\7"+
		")\2\2\u045b\u04ab\5^\60\32\u045c\u045d\f\26\2\2\u045d\u045e\7/\2\2\u045e"+
		"\u04ab\5^\60\27\u045f\u0460\f\25\2\2\u0460\u0461\7.\2\2\u0461\u04ab\5"+
		"^\60\26\u0462\u0463\f\24\2\2\u0463\u0464\7\60\2\2\u0464\u04ab\5^\60\25"+
		"\u0465\u0466\f\23\2\2\u0466\u0467\7Y\2\2\u0467\u04ab\5^\60\24\u0468\u0469"+
		"\f\22\2\2\u0469\u046a\7r\2\2\u046a\u04ab\5^\60\23\u046b\u046c\f\21\2\2"+
		"\u046c\u046d\7p\2\2\u046d\u04ab\5^\60\22\u046e\u046f\f\20\2\2\u046f\u0470"+
		"\7p\2\2\u0470\u0471\7H\2\2\u0471\u04ab\5^\60\21\u0472\u0473\f\17\2\2\u0473"+
		"\u0474\7p\2\2\u0474\u0475\7K\2\2\u0475\u04ab\5^\60\20\u0476\u0477\f\16"+
		"\2\2\u0477\u0478\7}\2\2\u0478\u0479\7Y\2\2\u0479\u04ab\5^\60\17\u047a"+
		"\u047b\f\r\2\2\u047b\u047c\7}\2\2\u047c\u047d\7r\2\2\u047d\u04ab\5^\60"+
		"\16\u047e\u047f\f\f\2\2\u047f\u0480\7}\2\2\u0480\u0481\7p\2\2\u0481\u04ab"+
		"\5^\60\r\u0482\u0483\f\13\2\2\u0483\u0484\7}\2\2\u0484\u0485\7p\2\2\u0485"+
		"\u0486\7H\2\2\u0486\u04ab\5^\60\f\u0487\u0488\f\n\2\2\u0488\u0489\7}\2"+
		"\2\u0489\u048a\7p\2\2\u048a\u048b\7K\2\2\u048b\u04ab\5^\60\13\u048c\u048d"+
		"\f\t\2\2\u048d\u048e\7\u0084\2\2\u048e\u04ab\5^\60\n\u048f\u0490\f\b\2"+
		"\2\u0490\u0491\7J\2\2\u0491\u04ab\5^\60\t\u0492\u0493\f\7\2\2\u0493\u0494"+
		"\7q\2\2\u0494\u0495\5^\60\2\u0495\u0496\7b\2\2\u0496\u0497\5^\60\b\u0497"+
		"\u04ab\3\2\2\2\u0498\u0499\f\3\2\2\u0499\u049a\7m\2\2\u049a\u049b\5\u00c2"+
		"b\2\u049b\u049c\7r\2\2\u049c\u049d\5^\60\4\u049d\u04ab\3\2\2\2\u049e\u049f"+
		"\f&\2\2\u049f\u04ab\5v<\2\u04a0\u04a1\f\35\2\2\u04a1\u04a2\7L\2\2\u04a2"+
		"\u04ab\5\u00d4k\2\u04a3\u04a4\f\30\2\2\u04a4\u04a5\7u\2\2\u04a5\u04a6"+
		"\7}\2\2\u04a6\u04ab\5\u0122\u0092\2\u04a7\u04a8\f\27\2\2\u04a8\u04a9\7"+
		"u\2\2\u04a9\u04ab\5\u0122\u0092\2\u04aa\u043d\3\2\2\2\u04aa\u0441\3\2"+
		"\2\2\u04aa\u0445\3\2\2\2\u04aa\u0449\3\2\2\2\u04aa\u044d\3\2\2\2\u04aa"+
		"\u0450\3\2\2\2\u04aa\u0453\3\2\2\2\u04aa\u0456\3\2\2\2\u04aa\u0459\3\2"+
		"\2\2\u04aa\u045c\3\2\2\2\u04aa\u045f\3\2\2\2\u04aa\u0462\3\2\2\2\u04aa"+
		"\u0465\3\2\2\2\u04aa\u0468\3\2\2\2\u04aa\u046b\3\2\2\2\u04aa\u046e\3\2"+
		"\2\2\u04aa\u0472\3\2\2\2\u04aa\u0476\3\2\2\2\u04aa\u047a\3\2\2\2\u04aa"+
		"\u047e\3\2\2\2\u04aa\u0482\3\2\2\2\u04aa\u0487\3\2\2\2\u04aa\u048c\3\2"+
		"\2\2\u04aa\u048f\3\2\2\2\u04aa\u0492\3\2\2\2\u04aa\u0498\3\2\2\2\u04aa"+
		"\u049e\3\2\2\2\u04aa\u04a0\3\2\2\2\u04aa\u04a3\3\2\2\2\u04aa\u04a7\3\2"+
		"\2\2\u04ab\u04ae\3\2\2\2\u04ac\u04aa\3\2\2\2\u04ac\u04ad\3\2\2\2\u04ad"+
		"_\3\2\2\2\u04ae\u04ac\3\2\2\2\u04af\u04b0\5\u00c6d\2\u04b0a\3\2\2\2\u04b1"+
		"\u04b2\b\62\1\2\u04b2\u04b3\5\u0108\u0085\2\u04b3\u04b8\3\2\2\2\u04b4"+
		"\u04b5\f\3\2\2\u04b5\u04b7\5f\64\2\u04b6\u04b4\3\2\2\2\u04b7\u04ba\3\2"+
		"\2\2\u04b8\u04b6\3\2\2\2\u04b8\u04b9\3\2\2\2\u04b9c\3\2\2\2\u04ba\u04b8"+
		"\3\2\2\2\u04bb\u04c4\5h\65\2\u04bc\u04c4\5j\66\2\u04bd\u04c4\5x=\2\u04be"+
		"\u04c4\5\u0124\u0093\2\u04bf\u04c4\5\u0126\u0094\2\u04c0\u04c4\5z>\2\u04c1"+
		"\u04c4\5:\36\2\u04c2\u04c4\5l\67\2\u04c3\u04bb\3\2\2\2\u04c3\u04bc\3\2"+
		"\2\2\u04c3\u04bd\3\2\2\2\u04c3\u04be\3\2\2\2\u04c3\u04bf\3\2\2\2\u04c3"+
		"\u04c0\3\2\2\2\u04c3\u04c1\3\2\2\2\u04c3\u04c2\3\2\2\2\u04c4e\3\2\2\2"+
		"\u04c5\u04c6\6\64$\3\u04c6\u04c7\7\25\2\2\u04c7\u04d3\5\u00c2b\2\u04c8"+
		"\u04c9\6\64%\3\u04c9\u04ca\7\30\2\2\u04ca\u04cb\5\u011c\u008f\2\u04cb"+
		"\u04cc\7\31\2\2\u04cc\u04d3\3\2\2\2\u04cd\u04ce\6\64&\3\u04ce\u04cf\7"+
		"\30\2\2\u04cf\u04d0\5^\60\2\u04d0\u04d1\7\31\2\2\u04d1\u04d3\3\2\2\2\u04d2"+
		"\u04c5\3\2\2\2\u04d2\u04c8\3\2\2\2\u04d2\u04cd\3\2\2\2\u04d3g\3\2\2\2"+
		"\u04d4\u04d5\7A\2\2\u04d5\u04d7\7\26\2\2\u04d6\u04d8\5^\60\2\u04d7\u04d6"+
		"\3\2\2\2\u04d7\u04d8\3\2\2\2\u04d8\u04d9\3\2\2\2\u04d9\u04da\7\27\2\2"+
		"\u04dai\3\2\2\2\u04db\u04dc\7@\2\2\u04dc\u04de\7\26\2\2\u04dd\u04df\5"+
		"^\60\2\u04de\u04dd\3\2\2\2\u04de\u04df\3\2\2\2\u04df\u04e0\3\2\2\2\u04e0"+
		"\u04e1\7\27\2\2\u04e1k\3\2\2\2\u04e2\u04e3\5\u00aeX\2\u04e3\u04e4\7\26"+
		"\2\2\u04e4\u04e7\5n8\2\u04e5\u04e6\7\23\2\2\u04e6\u04e8\5p9\2\u04e7\u04e5"+
		"\3\2\2\2\u04e7\u04e8\3\2\2\2\u04e8\u04e9\3\2\2\2\u04e9\u04ea\7\27\2\2"+
		"\u04ea\u04f3\3\2\2\2\u04eb\u04ec\5\u00aeX\2\u04ec\u04ee\7\26\2\2\u04ed"+
		"\u04ef\5p9\2\u04ee\u04ed\3\2\2\2\u04ee\u04ef\3\2\2\2\u04ef\u04f0\3\2\2"+
		"\2\u04f0\u04f1\7\27\2\2\u04f1\u04f3\3\2\2\2\u04f2\u04e2\3\2\2\2\u04f2"+
		"\u04eb\3\2\2\2\u04f3m\3\2\2\2\u04f4\u04f5\7n\2\2\u04f5\u04f6\5\u013a\u009e"+
		"\2\u04f6\u04f7\5^\60\2\u04f7\u04f8\68\'\3\u04f8o\3\2\2\2\u04f9\u04fa\b"+
		"9\1\2\u04fa\u04fb\5^\60\2\u04fb\u04fc\69(\3\u04fc\u04ff\3\2\2\2\u04fd"+
		"\u04ff\5r:\2\u04fe\u04f9\3\2\2\2\u04fe\u04fd\3\2\2\2\u04ff\u0505\3\2\2"+
		"\2\u0500\u0501\f\3\2\2\u0501\u0502\7\23\2\2\u0502\u0504\5r:\2\u0503\u0500"+
		"\3\2\2\2\u0504\u0507\3\2\2\2\u0505\u0503\3\2\2\2\u0505\u0506\3\2\2\2\u0506"+
		"q\3\2\2\2\u0507\u0505\3\2\2\2\u0508\u050c\5\u00c2b\2\u0509\u050a\5\u013a"+
		"\u009e\2\u050a\u050b\5^\60\2\u050b\u050d\3\2\2\2\u050c\u0509\3\2\2\2\u050c"+
		"\u050d\3\2\2\2\u050ds\3\2\2\2\u050e\u050f\7\u00a1\2\2\u050f\u0510\5^\60"+
		"\2\u0510\u0511\7\u0099\2\2\u0511\u0512\5^\60\2\u0512u\3\2\2\2\u0513\u0514"+
		"\7j\2\2\u0514\u0515\7\u009d\2\2\u0515\u0516\5\u00c2b\2\u0516\u0517\7\u009f"+
		"\2\2\u0517\u0518\5^\60\2\u0518w\3\2\2\2\u0519\u051a\7i\2\2\u051a\u051c"+
		"\7\u0081\2\2\u051b\u051d\5\u00aeX\2\u051c\u051b\3\2\2\2\u051c\u051d\3"+
		"\2\2\2\u051d\u051e\3\2\2\2\u051e\u051f\7\u009f\2\2\u051f\u0538\5^\60\2"+
		"\u0520\u0527\7i\2\2\u0521\u0528\7H\2\2\u0522\u0523\7\u008e\2\2\u0523\u0524"+
		"\5^\60\2\u0524\u0525\7\u0099\2\2\u0525\u0526\5^\60\2\u0526\u0528\3\2\2"+
		"\2\u0527\u0521\3\2\2\2\u0527\u0522\3\2\2\2\u0528\u0529\3\2\2\2\u0529\u052b"+
		"\7\26\2\2\u052a\u052c\5\u00aeX\2\u052b\u052a\3\2\2\2\u052b\u052c\3\2\2"+
		"\2\u052c\u052d\3\2\2\2\u052d\u0530\7\27\2\2\u052e\u052f\7\u009f\2\2\u052f"+
		"\u0531\5^\60\2\u0530\u052e\3\2\2\2\u0530\u0531\3\2\2\2\u0531\u0535\3\2"+
		"\2\2\u0532\u0533\7\u0085\2\2\u0533\u0534\7S\2\2\u0534\u0536\5\u0128\u0095"+
		"\2\u0535\u0532\3\2\2\2\u0535\u0536\3\2\2\2\u0536\u0538\3\2\2\2\u0537\u0519"+
		"\3\2\2\2\u0537\u0520\3\2\2\2\u0538y\3\2\2\2\u0539\u053b\7\u0092\2\2\u053a"+
		"\u053c\7^\2\2\u053b\u053a\3\2\2\2\u053b\u053c\3\2\2\2\u053c\u053d\3\2"+
		"\2\2\u053d\u053e\7\26\2\2\u053e\u0544\5b\62\2\u053f\u0540\7\23\2\2\u0540"+
		"\u0541\5\u0132\u009a\2\u0541\u0542\7-\2\2\u0542\u0543\5b\62\2\u0543\u0545"+
		"\3\2\2\2\u0544\u053f\3\2\2\2\u0544\u0545\3\2\2\2\u0545\u0546\3\2\2\2\u0546"+
		"\u0547\7\27\2\2\u0547{\3\2\2\2\u0548\u0549\5\u0120\u0091\2\u0549\u054a"+
		"\5\u013a\u009e\2\u054a\u054b\5^\60\2\u054b}\3\2\2\2\u054c\u054d\6@*\3"+
		"\u054d\u054e\7\25\2\2\u054e\u0555\5\u00c2b\2\u054f\u0550\6@+\3\u0550\u0551"+
		"\7\30\2\2\u0551\u0552\5^\60\2\u0552\u0553\7\31\2\2\u0553\u0555\3\2\2\2"+
		"\u0554\u054c\3\2\2\2\u0554\u054f\3\2\2\2\u0555\177\3\2\2\2\u0556\u0557"+
		"\5\u00eav\2\u0557\u0558\5\u013a\u009e\2\u0558\u0559\5^\60\2\u0559\u0081"+
		"\3\2\2\2\u055a\u055c\7\7\2\2\u055b\u055a\3\2\2\2\u055c\u055f\3\2\2\2\u055d"+
		"\u055b\3\2\2\2\u055d\u055e\3\2\2\2\u055e\u0083\3\2\2\2\u055f\u055d\3\2"+
		"\2\2\u0560\u0562\7\7\2\2\u0561\u0560\3\2\2\2\u0562\u0563\3\2\2\2\u0563"+
		"\u0561\3\2\2\2\u0563\u0564\3\2\2\2\u0564\u0085\3\2\2\2\u0565\u0567\7\7"+
		"\2\2\u0566\u0565\3\2\2\2\u0567\u0568\3\2\2\2\u0568\u0566\3\2\2\2\u0568"+
		"\u0569\3\2\2\2\u0569\u056a\3\2\2\2\u056a\u056b\7\3\2\2\u056b\u0087\3\2"+
		"\2\2\u056c\u056e\7\7\2\2\u056d\u056c\3\2\2\2\u056e\u0571\3\2\2\2\u056f"+
		"\u056d\3\2\2\2\u056f\u0570\3\2\2\2\u0570\u0572\3\2\2\2\u0571\u056f\3\2"+
		"\2\2\u0572\u0573\7\4\2\2\u0573\u0089\3\2\2\2\u0574\u0575\7|\2\2\u0575"+
		"\u008b\3\2\2\2\u0576\u0578\5\u008eH\2\u0577\u0576\3\2\2\2\u0577\u0578"+
		"\3\2\2\2\u0578\u0579\3\2\2\2\u0579\u057a\5\u0082B\2\u057a\u057b\7\2\2"+
		"\3\u057b\u008d\3\2\2\2\u057c\u0582\5\u0090I\2\u057d\u057e\5\u0084C\2\u057e"+
		"\u057f\5\u0090I\2\u057f\u0581\3\2\2\2\u0580\u057d\3\2\2\2\u0581\u0584"+
		"\3\2\2\2\u0582\u0580\3\2\2\2\u0582\u0583\3\2\2\2\u0583\u008f\3\2\2\2\u0584"+
		"\u0582\3\2\2\2\u0585\u0586\5\u00f0y\2\u0586\u0587\5\u0084C\2\u0587\u0589"+
		"\3\2\2\2\u0588\u0585\3\2\2\2\u0589\u058c\3\2\2\2\u058a\u0588\3\2\2\2\u058a"+
		"\u058b\3\2\2\2\u058b\u0593\3\2\2\2\u058c\u058a\3\2\2\2\u058d\u0594\5\n"+
		"\6\2\u058e\u0594\5\u00b2Z\2\u058f\u0594\5\u0092J\2\u0590\u0594\5\u0094"+
		"K\2\u0591\u0594\5\u00b4[\2\u0592\u0594\5\u00eex\2\u0593\u058d\3\2\2\2"+
		"\u0593\u058e\3\2\2\2\u0593\u058f\3\2\2\2\u0593\u0590\3\2\2\2\u0593\u0591"+
		"\3\2\2\2\u0593\u0592\3\2\2\2\u0594\u0091\3\2\2\2\u0595\u0596\5\"\22\2"+
		"\u0596\u0093\3\2\2\2\u0597\u059a\5\2\2\2\u0598\u059a\5\4\3\2\u0599\u0597"+
		"\3\2\2\2\u0599\u0598\3\2\2\2\u059a\u0095\3\2\2\2\u059b\u05a1\5\6\4\2\u059c"+
		"\u059d\5\u0084C\2\u059d\u059e\5\6\4\2\u059e\u05a0\3\2\2\2\u059f\u059c"+
		"\3\2\2\2\u05a0\u05a3\3\2\2\2\u05a1\u059f\3\2\2\2\u05a1\u05a2\3\2\2\2\u05a2"+
		"\u0097\3\2\2\2\u05a3\u05a1\3\2\2\2\u05a4\u05aa\5\b\5\2\u05a5\u05a6\5\u0084"+
		"C\2\u05a6\u05a7\5\b\5\2\u05a7\u05a9\3\2\2\2\u05a8\u05a5\3\2\2\2\u05a9"+
		"\u05ac\3\2\2\2\u05aa\u05a8\3\2\2\2\u05aa\u05ab\3\2\2\2\u05ab\u0099\3\2"+
		"\2\2\u05ac\u05aa\3\2\2\2\u05ad\u05b2\5\u00c8e\2\u05ae\u05af\7\23\2\2\u05af"+
		"\u05b1\5\u00c8e\2\u05b0\u05ae\3\2\2\2\u05b1\u05b4\3\2\2\2\u05b2\u05b0"+
		"\3\2\2\2\u05b2\u05b3\3\2\2\2\u05b3\u009b\3\2\2\2\u05b4\u05b2\3\2\2\2\u05b5"+
		"\u05b6\7r\2\2\u05b6\u05c0\5\u009eP\2\u05b7\u05b8\7r\2\2\u05b8\u05c0\5"+
		"\u00a0Q\2\u05b9\u05ba\7r\2\2\u05ba\u05c0\5\u00a4S\2\u05bb\u05bc\7v\2\2"+
		"\u05bc\u05c0\7\u00ab\2\2\u05bd\u05be\7v\2\2\u05be\u05c0\5^\60\2\u05bf"+
		"\u05b5\3\2\2\2\u05bf\u05b7\3\2\2\2\u05bf\u05b9\3\2\2\2\u05bf\u05bb\3\2"+
		"\2\2\u05bf\u05bd\3\2\2\2\u05c0\u009d\3\2\2\2\u05c1\u05c3\7z\2\2\u05c2"+
		"\u05c1\3\2\2\2\u05c2\u05c3\3\2\2\2\u05c3\u05c4\3\2\2\2\u05c4\u05c6\7\30"+
		"\2\2\u05c5\u05c7\5\u00a2R\2\u05c6\u05c5\3\2\2\2\u05c6\u05c7\3\2\2\2\u05c7"+
		"\u05c8\3\2\2\2\u05c8\u05c9\7\31\2\2\u05c9\u009f\3\2\2\2\u05ca\u05cc\7"+
		"z\2\2\u05cb\u05ca\3\2\2\2\u05cb\u05cc\3\2\2\2\u05cc\u05cd\3\2\2\2\u05cd"+
		"\u05cf\7*\2\2\u05ce\u05d0\5\u00a2R\2\u05cf\u05ce\3\2\2\2\u05cf\u05d0\3"+
		"\2\2\2\u05d0\u05d1\3\2\2\2\u05d1\u05d2\7(\2\2\u05d2\u00a1\3\2\2\2\u05d3"+
		"\u05d8\5^\60\2\u05d4\u05d5\7\23\2\2\u05d5\u05d7\5^\60\2\u05d6\u05d4\3"+
		"\2\2\2\u05d7\u05da\3\2\2\2\u05d8\u05d6\3\2\2\2\u05d8\u05d9\3\2\2\2\u05d9"+
		"\u00a3\3\2\2\2\u05da\u05d8\3\2\2\2\u05db\u05dc\7\30\2\2\u05dc\u05dd\5"+
		"^\60\2\u05dd\u05de\7\24\2\2\u05de\u05df\5^\60\2\u05df\u05e0\7\31\2\2\u05e0"+
		"\u00a5\3\2\2\2\u05e1\u05e2\bT\1\2\u05e2\u05ee\5\u00a8U\2\u05e3\u05e4\7"+
		"E\2\2\u05e4\u05e5\7*\2\2\u05e5\u05e6\5\u00a6T\2\u05e6\u05e7\7(\2\2\u05e7"+
		"\u05ee\3\2\2\2\u05e8\u05e9\7D\2\2\u05e9\u05ea\7*\2\2\u05ea\u05eb\5\u00a6"+
		"T\2\u05eb\u05ec\7(\2\2\u05ec\u05ee\3\2\2\2\u05ed\u05e1\3\2\2\2\u05ed\u05e3"+
		"\3\2\2\2\u05ed\u05e8\3\2\2\2\u05ee\u05f9\3\2\2\2\u05ef\u05f0\f\7\2\2\u05f0"+
		"\u05f8\7,\2\2\u05f1\u05f2\f\6\2\2\u05f2\u05f3\7\30\2\2\u05f3\u05f8\7\31"+
		"\2\2\u05f4\u05f5\f\5\2\2\u05f5\u05f6\7\32\2\2\u05f6\u05f8\7\33\2\2\u05f7"+
		"\u05ef\3\2\2\2\u05f7\u05f1\3\2\2\2\u05f7\u05f4\3\2\2\2\u05f8\u05fb\3\2"+
		"\2\2\u05f9\u05f7\3\2\2\2\u05f9\u05fa\3\2\2\2\u05fa\u00a7\3\2\2\2\u05fb"+
		"\u05f9\3\2\2\2\u05fc\u05ff\5\u00aaV\2\u05fd\u05ff\5\u00acW\2\u05fe\u05fc"+
		"\3\2\2\2\u05fe\u05fd\3\2\2\2\u05ff\u00a9\3\2\2\2\u0600\u0611\7\64\2\2"+
		"\u0601\u0611\7\65\2\2\u0602\u0611\7\66\2\2\u0603\u0611\7B\2\2\u0604\u0611"+
		"\7\67\2\2\u0605\u0611\78\2\2\u0606\u0611\7@\2\2\u0607\u0611\79\2\2\u0608"+
		"\u0611\7;\2\2\u0609\u0611\7:\2\2\u060a\u0611\7<\2\2\u060b\u0611\7=\2\2"+
		"\u060c\u0611\7?\2\2\u060d\u0611\7A\2\2\u060e\u0611\7C\2\2\u060f\u0611"+
		"\7F\2\2\u0610\u0600\3\2\2\2\u0610\u0601\3\2\2\2\u0610\u0602\3\2\2\2\u0610"+
		"\u0603\3\2\2\2\u0610\u0604\3\2\2\2\u0610\u0605\3\2\2\2\u0610\u0606\3\2"+
		"\2\2\u0610\u0607\3\2\2\2\u0610\u0608\3\2\2\2\u0610\u0609\3\2\2\2\u0610"+
		"\u060a\3\2\2\2\u0610\u060b\3\2\2\2\u0610\u060c\3\2\2\2\u0610\u060d\3\2"+
		"\2\2\u0610\u060e\3\2\2\2\u0610\u060f\3\2\2\2\u0611\u00ab\3\2\2\2\u0612"+
		"\u0613\7\u00a7\2\2\u0613\u00ad\3\2\2\2\u0614\u0616\7z\2\2\u0615\u0614"+
		"\3\2\2\2\u0615\u0616\3\2\2\2\u0616\u0617\3\2\2\2\u0617\u0618\5\u00acW"+
		"\2\u0618\u00af\3\2\2\2\u0619\u061a\7?\2\2\u061a\u00b1\3\2\2\2\u061b\u061f"+
		"\5\20\t\2\u061c\u061f\5 \21\2\u061d\u061f\5\22\n\2\u061e\u061b\3\2\2\2"+
		"\u061e\u061c\3\2\2\2\u061e\u061d\3\2\2\2\u061f\u00b3\3\2\2\2\u0620\u0621"+
		"\5\16\b\2\u0621\u00b5\3\2\2\2\u0622\u0627\5\u00c6d\2\u0623\u0624\7\23"+
		"\2\2\u0624\u0626\5\u00c6d\2\u0625\u0623\3\2\2\2\u0626\u0629\3\2\2\2\u0627"+
		"\u0625\3\2\2\2\u0627\u0628\3\2\2\2\u0628\u00b7\3\2\2\2\u0629\u0627\3\2"+
		"\2\2\u062a\u062d\5\u00c2b\2\u062b\u062d\5\u00c6d\2\u062c\u062a\3\2\2\2"+
		"\u062c\u062b\3\2\2\2\u062d\u00b9\3\2\2\2\u062e\u0631\5\u00c0a\2\u062f"+
		"\u0631\5\u012e\u0098\2\u0630\u062e\3\2\2\2\u0630\u062f\3\2\2\2\u0631\u00bb"+
		"\3\2\2\2\u0632\u0633\6_/\3\u0633\u0634\7#\2\2\u0634\u0635\5\u00be`\2\u0635"+
		"\u00bd\3\2\2\2\u0636\u0637\6`\60\3\u0637\u0638\5\u00ba^\2\u0638\u00bf"+
		"\3\2\2\2\u0639\u063d\5\u00c2b\2\u063a\u063d\5\u00c6d\2\u063b\u063d\5\u00c8"+
		"e\2\u063c\u0639\3\2\2\2\u063c\u063a\3\2\2\2\u063c\u063b\3\2\2\2\u063d"+
		"\u00c1\3\2\2\2\u063e\u063f\7\u00a8\2\2\u063f\u00c3\3\2\2\2\u0640\u0641"+
		"\t\4\2\2\u0641\u00c5\3\2\2\2\u0642\u0643\7\u00a7\2\2\u0643\u00c7\3\2\2"+
		"\2\u0644\u0645\7\u00a6\2\2\u0645\u00c9\3\2\2\2\u0646\u064b\5\u00ccg\2"+
		"\u0647\u0648\7\23\2\2\u0648\u064a\5\u00ccg\2\u0649\u0647\3\2\2\2\u064a"+
		"\u064d\3\2\2\2\u064b\u0649\3\2\2\2\u064b\u064c\3\2\2\2\u064c\u00cb\3\2"+
		"\2\2\u064d\u064b\3\2\2\2\u064e\u0654\5\u00d2j\2\u064f\u0651\7z\2\2\u0650"+
		"\u064f\3\2\2\2\u0650\u0651\3\2\2\2\u0651\u0652\3\2\2\2\u0652\u0654\5\u00ce"+
		"h\2\u0653\u064e\3\2\2\2\u0653\u0650\3\2\2\2\u0654\u00cd\3\2\2\2\u0655"+
		"\u0658\5\u00d0i\2\u0656\u0658\5\62\32\2\u0657\u0655\3\2\2\2\u0657\u0656"+
		"\3\2\2\2\u0658\u00cf\3\2\2\2\u0659\u065c\5\u00c2b\2\u065a\u065b\7-\2\2"+
		"\u065b\u065d\5\u010e\u0088\2\u065c\u065a\3\2\2\2\u065c\u065d\3\2\2\2\u065d"+
		"\u00d1\3\2\2\2\u065e\u065f\5\u00b0Y\2\u065f\u0660\5\u00c2b\2\u0660\u00d3"+
		"\3\2\2\2\u0661\u0664\5\u00a6T\2\u0662\u0664\5\u00d6l\2\u0663\u0661\3\2"+
		"\2\2\u0663\u0662\3\2\2\2\u0664\u00d5\3\2\2\2\u0665\u0666\bl\1\2\u0666"+
		"\u0667\7K\2\2\u0667\u0670\3\2\2\2\u0668\u0669\f\4\2\2\u0669\u066a\7\30"+
		"\2\2\u066a\u066f\7\31\2\2\u066b\u066c\f\3\2\2\u066c\u066d\7\32\2\2\u066d"+
		"\u066f\7\33\2\2\u066e\u0668\3\2\2\2\u066e\u066b\3\2\2\2\u066f\u0672\3"+
		"\2\2\2\u0670\u066e\3\2\2\2\u0670\u0671\3\2\2\2\u0671\u00d7\3\2\2\2\u0672"+
		"\u0670\3\2\2\2\u0673\u0679\5\u00dan\2\u0674\u0675\5\u0084C\2\u0675\u0676"+
		"\5\u00dan\2\u0676\u0678\3\2\2\2\u0677\u0674\3\2\2\2\u0678\u067b\3\2\2"+
		"\2\u0679\u0677\3\2\2\2\u0679\u067a\3\2\2\2\u067a\u00d9\3\2\2\2\u067b\u0679"+
		"\3\2\2\2\u067c\u0682\5\30\r\2\u067d\u0682\5\34\17\2\u067e\u0682\5*\26"+
		"\2\u067f\u0682\5(\25\2\u0680\u0682\5\26\f\2\u0681\u067c\3\2\2\2\u0681"+
		"\u067d\3\2\2\2\u0681\u067e\3\2\2\2\u0681\u067f\3\2\2\2\u0681\u0680\3\2"+
		"\2\2\u0682\u00db\3\2\2\2\u0683\u0689\5\u00dep\2\u0684\u0685\5\u0084C\2"+
		"\u0685\u0686\5\u00dep\2\u0686\u0688\3\2\2\2\u0687\u0684\3\2\2\2\u0688"+
		"\u068b\3\2\2\2\u0689\u0687\3\2\2\2\u0689\u068a\3\2\2\2\u068a\u00dd\3\2"+
		"\2\2\u068b\u0689\3\2\2\2\u068c\u0690\5\36\20\2\u068d\u0690\5\32\16\2\u068e"+
		"\u0690\5,\27\2\u068f\u068c\3\2\2\2\u068f\u068d\3\2\2\2\u068f\u068e\3\2"+
		"\2\2\u0690\u00df\3\2\2\2\u0691\u0692\7\13\2\2\u0692\u069c\5\u0190\u00c9"+
		"\2\u0693\u0694\7\f\2\2\u0694\u069c\5\u01aa\u00d6\2\u0695\u0696\7\r\2\2"+
		"\u0696\u069c\5\u00e2r\2\u0697\u0698\7\16\2\2\u0698\u069c\5\u00e2r\2\u0699"+
		"\u069a\7\17\2\2\u069a\u069c\5\u00e6t\2\u069b\u0691\3\2\2\2\u069b\u0693"+
		"\3\2\2\2\u069b\u0695\3\2\2\2\u069b\u0697\3\2\2\2\u069b\u0699\3\2\2\2\u069c"+
		"\u00e1\3\2\2\2\u069d\u069f\5\u00c0a\2\u069e\u06a0\5\u00e4s\2\u069f\u069e"+
		"\3\2\2\2\u069f\u06a0\3\2\2\2\u06a0\u00e3\3\2\2\2\u06a1\u06a2\7n\2\2\u06a2"+
		"\u06a3\5\u0134\u009b\2\u06a3\u06a4\7\21\2\2\u06a4\u06a9\5\u00c0a\2\u06a5"+
		"\u06a6\7\25\2\2\u06a6\u06a8\5\u00c0a\2\u06a7\u06a5\3\2\2\2\u06a8\u06ab"+
		"\3\2\2\2\u06a9\u06a7\3\2\2\2\u06a9\u06aa\3\2\2\2\u06aa\u00e5\3\2\2\2\u06ab"+
		"\u06a9\3\2\2\2\u06ac\u06ae\5\u00c0a\2\u06ad\u06af\5\u00e8u\2\u06ae\u06ad"+
		"\3\2\2\2\u06ae\u06af\3\2\2\2\u06af\u00e7\3\2\2\2\u06b0\u06b1\7n\2\2\u06b1"+
		"\u06b2\5\u0134\u009b\2\u06b2\u06b4\7\21\2\2\u06b3\u06b5\7%\2\2\u06b4\u06b3"+
		"\3\2\2\2\u06b4\u06b5\3\2\2\2\u06b5\u06b6\3\2\2\2\u06b6\u06bb\5\u015e\u00b0"+
		"\2\u06b7\u06b8\7%\2\2\u06b8\u06ba\5\u015e\u00b0\2\u06b9\u06b7\3\2\2\2"+
		"\u06ba\u06bd\3\2\2\2\u06bb\u06b9\3\2\2\2\u06bb\u06bc\3\2\2\2\u06bc\u06c0"+
		"\3\2\2\2\u06bd\u06bb\3\2\2\2\u06be\u06bf\7\25\2\2\u06bf\u06c1\5\u015e"+
		"\u00b0\2\u06c0\u06be\3\2\2\2\u06c0\u06c1\3\2\2\2\u06c1\u00e9\3\2\2\2\u06c2"+
		"\u06c7\5\u00c2b\2\u06c3\u06c4\7\23\2\2\u06c4\u06c6\5\u00c2b\2\u06c5\u06c3"+
		"\3\2\2\2\u06c6\u06c9\3\2\2\2\u06c7\u06c5\3\2\2\2\u06c7\u06c8\3\2\2\2\u06c8"+
		"\u00eb\3\2\2\2\u06c9\u06c7\3\2\2\2\u06ca\u06cf\5\u00c4c\2\u06cb\u06cc"+
		"\7\23\2\2\u06cc\u06ce\5\u00c4c\2\u06cd\u06cb\3\2\2\2\u06ce\u06d1\3\2\2"+
		"\2\u06cf\u06cd\3\2\2\2\u06cf\u06d0\3\2\2\2\u06d0\u00ed\3\2\2\2\u06d1\u06cf"+
		"\3\2\2\2\u06d2\u06d7\5(\25\2\u06d3\u06d7\5*\26\2\u06d4\u06d7\5,\27\2\u06d5"+
		"\u06d7\5.\30\2\u06d6\u06d2\3\2\2\2\u06d6\u06d3\3\2\2\2\u06d6\u06d4\3\2"+
		"\2\2\u06d6\u06d5\3\2\2\2\u06d7\u00ef\3\2\2\2\u06d8\u06d9\7\n\2\2\u06d9"+
		"\u00f1\3\2\2\2\u06da\u06e0\5\u00f4{\2\u06db\u06dc\5\u0084C\2\u06dc\u06dd"+
		"\5\u00f4{\2\u06dd\u06df\3\2\2\2\u06de\u06db\3\2\2\2\u06df\u06e2\3\2\2"+
		"\2\u06e0\u06de\3\2\2\2\u06e0\u06e1\3\2\2\2\u06e1\u00f3\3\2\2\2\u06e2\u06e0"+
		"\3\2\2\2\u06e3\u06e4\7\13\2\2\u06e4\u06ee\5\u017a\u00be\2\u06e5\u06e6"+
		"\7\f\2\2\u06e6\u06ee\5\u0196\u00cc\2\u06e7\u06e8\7\r\2\2\u06e8\u06ee\5"+
		"\u00f6|\2\u06e9\u06ea\7\16\2\2\u06ea\u06ee\5\u00f6|\2\u06eb\u06ec\7\17"+
		"\2\2\u06ec\u06ee\5\u00f8}\2\u06ed\u06e3\3\2\2\2\u06ed\u06e5\3\2\2\2\u06ed"+
		"\u06e7\3\2\2\2\u06ed\u06e9\3\2\2\2\u06ed\u06eb\3\2\2\2\u06ee\u00f5\3\2"+
		"\2\2\u06ef\u06f1\5\u0160\u00b1\2\u06f0\u06f2\7\22\2\2\u06f1\u06f0\3\2"+
		"\2\2\u06f1\u06f2\3\2\2\2\u06f2\u06f4\3\2\2\2\u06f3\u06f5\5\u00e4s\2\u06f4"+
		"\u06f3\3\2\2\2\u06f4\u06f5\3\2\2\2\u06f5\u00f7\3\2\2\2\u06f6\u06f8\5\u0146"+
		"\u00a4\2\u06f7\u06f9\7\22\2\2\u06f8\u06f7\3\2\2\2\u06f8\u06f9\3\2\2\2"+
		"\u06f9\u06fb\3\2\2\2\u06fa\u06fc\5\u00e8u\2\u06fb\u06fa\3\2\2\2\u06fb"+
		"\u06fc\3\2\2\2\u06fc\u00f9\3\2\2\2\u06fd\u0703\5\64\33\2\u06fe\u06ff\5"+
		"\u0084C\2\u06ff\u0700\5\64\33\2\u0700\u0702\3\2\2\2\u0701\u06fe\3\2\2"+
		"\2\u0702\u0705\3\2\2\2\u0703\u0701\3\2\2\2\u0703\u0704\3\2\2\2\u0704\u00fb"+
		"\3\2\2\2\u0705\u0703\3\2\2\2\u0706\u070c\5\60\31\2\u0707\u0708\5\u0084"+
		"C\2\u0708\u0709\5\60\31\2\u0709\u070b\3\2\2\2\u070a\u0707\3\2\2\2\u070b"+
		"\u070e\3\2\2\2\u070c\u070a\3\2\2\2\u070c\u070d\3\2\2\2\u070d\u00fd\3\2"+
		"\2\2\u070e\u070c\3\2\2\2\u070f\u0715\5H%\2\u0710\u0711\5\u0084C\2\u0711"+
		"\u0712\5H%\2\u0712\u0714\3\2\2\2\u0713\u0710\3\2\2\2\u0714\u0717\3\2\2"+
		"\2\u0715\u0713\3\2\2\2\u0715\u0716\3\2\2\2\u0716\u00ff\3\2\2\2\u0717\u0715"+
		"\3\2\2\2\u0718\u071e\5X-\2\u0719\u071a\5\u0084C\2\u071a\u071b\5X-\2\u071b"+
		"\u071d\3\2\2\2\u071c\u0719\3\2\2\2\u071d\u0720\3\2\2\2\u071e\u071c\3\2"+
		"\2\2\u071e\u071f\3\2\2\2\u071f\u0101\3\2\2\2\u0720\u071e\3\2\2\2\u0721"+
		"\u0722\7\30\2\2\u0722\u0723\5\u0104\u0083\2\u0723\u0724\7\24\2\2\u0724"+
		"\u0725\5\u0104\u0083\2\u0725\u0726\7\31\2\2\u0726\u0730\3\2\2\2\u0727"+
		"\u0728\7\30\2\2\u0728\u0729\5\u0106\u0084\2\u0729\u072a\7\31\2\2\u072a"+
		"\u0730\3\2\2\2\u072b\u072c\7*\2\2\u072c\u072d\5\u0106\u0084\2\u072d\u072e"+
		"\7(\2\2\u072e\u0730\3\2\2\2\u072f\u0721\3\2\2\2\u072f\u0727\3\2\2\2\u072f"+
		"\u072b\3\2\2\2\u0730\u0103\3\2\2\2\u0731\u0741\7\u00a4\2\2\u0732\u0741"+
		"\7\u00a5\2\2\u0733\u0741\7\u00ad\2\2\u0734\u0741\7\u00ae\2\2\u0735\u0741"+
		"\7\u00a3\2\2\u0736\u0741\7\u00b2\2\2\u0737\u0741\7\u00b1\2\2\u0738\u0741"+
		"\7\u00ab\2\2\u0739\u0741\7\u00af\2\2\u073a\u0741\7\u00b0\2\2\u073b\u0741"+
		"\7\u00a2\2\2\u073c\u0741\7\u00b3\2\2\u073d\u0741\7\u00b4\2\2\u073e\u0741"+
		"\7\u00ac\2\2\u073f\u0741\5\u008aF\2\u0740\u0731\3\2\2\2\u0740\u0732\3"+
		"\2\2\2\u0740\u0733\3\2\2\2\u0740\u0734\3\2\2\2\u0740\u0735\3\2\2\2\u0740"+
		"\u0736\3\2\2\2\u0740\u0737\3\2\2\2\u0740\u0738\3\2\2\2\u0740\u0739\3\2"+
		"\2\2\u0740\u073a\3\2\2\2\u0740\u073b\3\2\2\2\u0740\u073c\3\2\2\2\u0740"+
		"\u073d\3\2\2\2\u0740\u073e\3\2\2\2\u0740\u073f\3\2\2\2\u0741\u0105\3\2"+
		"\2\2\u0742\u0747\5\u0104\u0083\2\u0743\u0744\7\23\2\2\u0744\u0746\5\u0104"+
		"\u0083\2\u0745\u0743\3\2\2\2\u0746\u0749\3\2\2\2\u0747\u0745\3\2\2\2\u0747"+
		"\u0748\3\2\2\2\u0748\u0107\3\2\2\2\u0749\u0747\3\2\2\2\u074a\u074f\5\u010c"+
		"\u0087\2\u074b\u074f\5\u010e\u0088\2\u074c\u074f\5\u00c0a\2\u074d\u074f"+
		"\5\u010a\u0086\2\u074e\u074a\3\2\2\2\u074e\u074b\3\2\2\2\u074e\u074c\3"+
		"\2\2\2\u074e\u074d\3\2\2\2\u074f\u0109\3\2\2\2\u0750\u0751\t\5\2\2\u0751"+
		"\u010b\3\2\2\2\u0752\u0753\7\26\2\2\u0753\u0754\5^\60\2\u0754\u0755\7"+
		"\27\2\2\u0755\u010d\3\2\2\2\u0756\u0759\5\u0104\u0083\2\u0757\u0759\5"+
		"\u0110\u0089\2\u0758\u0756\3\2\2\2\u0758\u0757\3\2\2\2\u0759\u010f\3\2"+
		"\2\2\u075a\u0760\5\u00a4S\2\u075b\u0760\5\u009eP\2\u075c\u0760\5\u00a0"+
		"Q\2\u075d\u0760\5\u0114\u008b\2\u075e\u0760\5\u0112\u008a\2\u075f\u075a"+
		"\3\2\2\2\u075f\u075b\3\2\2\2\u075f\u075c\3\2\2\2\u075f\u075d\3\2\2\2\u075f"+
		"\u075e\3\2\2\2\u0760\u0111\3\2\2\2\u0761\u0763\7z\2\2\u0762\u0761\3\2"+
		"\2\2\u0762\u0763\3\2\2\2\u0763\u0764\3\2\2\2\u0764\u0766\7\26\2\2\u0765"+
		"\u0767\5\u0116\u008c\2\u0766\u0765\3\2\2\2\u0766\u0767\3\2\2\2\u0767\u0768"+
		"\3\2\2\2\u0768\u0769\7\27\2\2\u0769\u0113\3\2\2\2\u076a\u076c\7z\2\2\u076b"+
		"\u076a\3\2\2\2\u076b\u076c\3\2\2\2\u076c\u076d\3\2\2\2\u076d\u076f\7\32"+
		"\2\2\u076e\u0770\5\u0118\u008d\2\u076f\u076e\3\2\2\2\u076f\u0770\3\2\2"+
		"\2\u0770\u0771\3\2\2\2\u0771\u0772\7\33\2\2\u0772\u0115\3\2\2\2\u0773"+
		"\u0774\5^\60\2\u0774\u077d\7\23\2\2\u0775\u077a\5^\60\2\u0776\u0777\7"+
		"\23\2\2\u0777\u0779\5^\60\2\u0778\u0776\3\2\2\2\u0779\u077c\3\2\2\2\u077a"+
		"\u0778\3\2\2\2\u077a\u077b\3\2\2\2\u077b\u077e\3\2\2\2\u077c\u077a\3\2"+
		"\2\2\u077d\u0775\3\2\2\2\u077d\u077e\3\2\2\2\u077e\u0117\3\2\2\2\u077f"+
		"\u0784\5\u011a\u008e\2\u0780\u0781\7\23\2\2\u0781\u0783\5\u011a\u008e"+
		"\2\u0782\u0780\3\2\2\2\u0783\u0786\3\2\2\2\u0784\u0782\3\2\2\2\u0784\u0785"+
		"\3\2\2\2\u0785\u0119\3\2\2\2\u0786\u0784\3\2\2\2\u0787\u0788\5^\60\2\u0788"+
		"\u0789\7\21\2\2\u0789\u078a\5^\60\2\u078a\u011b\3\2\2\2\u078b\u078c\5"+
		"^\60\2\u078c\u078d\7\21\2\2\u078d\u078e\5^\60\2\u078e\u0795\3\2\2\2\u078f"+
		"\u0790\5^\60\2\u0790\u0791\7\21\2\2\u0791\u0795\3\2\2\2\u0792\u0793\7"+
		"\21\2\2\u0793\u0795\5^\60\2\u0794\u078b\3\2\2\2\u0794\u078f\3\2\2\2\u0794"+
		"\u0792\3\2\2\2\u0795\u011d\3\2\2\2\u0796\u0797\5\u00c2b\2\u0797\u0798"+
		"\5\u013a\u009e\2\u0798\u0799\5^\60\2\u0799\u011f\3\2\2\2\u079a\u079b\b"+
		"\u0091\1\2\u079b\u079c\5\u00c2b\2\u079c\u07a1\3\2\2\2\u079d\u079e\f\3"+
		"\2\2\u079e\u07a0\5~@\2\u079f\u079d\3\2\2\2\u07a0\u07a3\3\2\2\2\u07a1\u079f"+
		"\3\2\2\2\u07a1\u07a2\3\2\2\2\u07a2\u0121\3\2\2\2\u07a3\u07a1\3\2\2\2\u07a4"+
		"\u07a5\6\u0092\64\3\u07a5\u07a6\7\u00a8\2\2\u07a6\u07a9\5\u00d4k\2\u07a7"+
		"\u07a9\5^\60\2\u07a8\u07a4\3\2\2\2\u07a8\u07a7\3\2\2\2\u07a9\u0123\3\2"+
		"\2\2\u07aa\u07ab\7\u0089\2\2\u07ab\u07ac\7H\2\2\u07ac\u07ad\7n\2\2\u07ad"+
		"\u07ae\5^\60\2\u07ae\u0125\3\2\2\2\u07af\u07b0\7\u0089\2\2\u07b0\u07b1"+
		"\7\u0081\2\2\u07b1\u07b2\7n\2\2\u07b2\u07b3\5^\60\2\u07b3\u0127\3\2\2"+
		"\2\u07b4\u07b9\5\u012a\u0096\2\u07b5\u07b6\7\23\2\2\u07b6\u07b8\5\u012a"+
		"\u0096\2\u07b7\u07b5\3\2\2\2\u07b8\u07bb\3\2\2\2\u07b9\u07b7\3\2\2\2\u07b9"+
		"\u07ba\3\2\2\2\u07ba\u0129\3\2\2\2\u07bb\u07b9\3\2\2\2\u07bc\u07c1\5\u00c2"+
		"b\2\u07bd\u07be\7\25\2\2\u07be\u07c0\5\u00c2b\2\u07bf\u07bd\3\2\2\2\u07c0"+
		"\u07c3\3\2\2\2\u07c1\u07bf\3\2\2\2\u07c1\u07c2\3\2\2\2\u07c2\u07c5\3\2"+
		"\2\2\u07c3\u07c1\3\2\2\2\u07c4\u07c6\t\6\2\2\u07c5\u07c4\3\2\2\2\u07c5"+
		"\u07c6\3\2\2\2\u07c6\u012b\3\2\2\2\u07c7\u07ce\7\"\2\2\u07c8\u07ce\7#"+
		"\2\2\u07c9\u07ce\5\u013c\u009f\2\u07ca\u07ce\5\u013e\u00a0\2\u07cb\u07ce"+
		"\5\u0140\u00a1\2\u07cc\u07ce\5\u0142\u00a2\2\u07cd\u07c7\3\2\2\2\u07cd"+
		"\u07c8\3\2\2\2\u07cd\u07c9\3\2\2\2\u07cd\u07ca\3\2\2\2\u07cd\u07cb\3\2"+
		"\2\2\u07cd\u07cc\3\2\2\2\u07ce\u012d\3\2\2\2\u07cf\u07d0\t\7\2\2\u07d0"+
		"\u012f\3\2\2\2\u07d1\u07d2\7\u00a8\2\2\u07d2\u07d3\6\u0099\65\3\u07d3"+
		"\u0131\3\2\2\2\u07d4\u07d5\7\u00a8\2\2\u07d5\u07d6\6\u009a\66\3\u07d6"+
		"\u0133\3\2\2\2\u07d7\u07d8\7\u00a8\2\2\u07d8\u07d9\6\u009b\67\3\u07d9"+
		"\u0135\3\2\2\2\u07da\u07db\7\u00a8\2\2\u07db\u07dc\6\u009c8\3\u07dc\u0137"+
		"\3\2\2\2\u07dd\u07de\7\u00a8\2\2\u07de\u07df\6\u009d9\3\u07df\u0139\3"+
		"\2\2\2\u07e0\u07e1\7-\2\2\u07e1\u013b\3\2\2\2\u07e2\u07e3\7$\2\2\u07e3"+
		"\u013d\3\2\2\2\u07e4\u07e5\7%\2\2\u07e5\u013f\3\2\2\2\u07e6\u07e7\7&\2"+
		"\2\u07e7\u0141\3\2\2\2\u07e8\u07e9\t\b\2\2\u07e9\u0143\3\2\2\2\u07ea\u07eb"+
		"\3\2\2\2\u07eb\u0145\3\2\2\2\u07ec\u07ed\7\u008c\2\2\u07ed\u07ee\5\u0148"+
		"\u00a5\2\u07ee\u07ef\7\22\2\2\u07ef\u07f4\3\2\2\2\u07f0\u07f1\5\u0148"+
		"\u00a5\2\u07f1\u07f2\7\22\2\2\u07f2\u07f4\3\2\2\2\u07f3\u07ec\3\2\2\2"+
		"\u07f3\u07f0\3\2\2\2\u07f4\u0147\3\2\2\2\u07f5\u07f6\b\u00a5\1\2\u07f6"+
		"\u07f7\5\u014a\u00a6\2\u07f7\u07fc\3\2\2\2\u07f8\u07f9\f\3\2\2\u07f9\u07fb"+
		"\5\u0150\u00a9\2\u07fa\u07f8\3\2\2\2\u07fb\u07fe\3\2\2\2\u07fc\u07fa\3"+
		"\2\2\2\u07fc\u07fd\3\2\2\2\u07fd\u0149\3\2\2\2\u07fe\u07fc\3\2\2\2\u07ff"+
		"\u0807\5\u014c\u00a7\2\u0800\u0807\5\u014e\u00a8\2\u0801\u0807\5\u0158"+
		"\u00ad\2\u0802\u0807\5\u015a\u00ae\2\u0803\u0807\5\u015c\u00af\2\u0804"+
		"\u0807\5\u0152\u00aa\2\u0805\u0807\5\u0156\u00ac\2\u0806\u07ff\3\2\2\2"+
		"\u0806\u0800\3\2\2\2\u0806\u0801\3\2\2\2\u0806\u0802\3\2\2\2\u0806\u0803"+
		"\3\2\2\2\u0806\u0804\3\2\2\2\u0806\u0805\3\2\2\2\u0807\u014b\3\2\2\2\u0808"+
		"\u0809\5\u010a\u0086\2\u0809\u014d\3\2\2\2\u080a\u080b\5\u0130\u0099\2"+
		"\u080b\u080c\5\u0152\u00aa\2\u080c\u014f\3\2\2\2\u080d\u080e\7\25\2\2"+
		"\u080e\u0813\5\u0152\u00aa\2\u080f\u0810\7\25\2\2\u0810\u0813\5\u015e"+
		"\u00b0\2\u0811\u0813\5\u0156\u00ac\2\u0812\u080d\3\2\2\2\u0812\u080f\3"+
		"\2\2\2\u0812\u0811\3\2\2\2\u0813\u0151\3\2\2\2\u0814\u0815\5\u015e\u00b0"+
		"\2\u0815\u0817\7\26\2\2\u0816\u0818\5\u0154\u00ab\2\u0817\u0816\3\2\2"+
		"\2\u0817\u0818\3\2\2\2\u0818\u0819\3\2\2\2\u0819\u081a\7\27\2\2\u081a"+
		"\u0153\3\2\2\2\u081b\u081c\b\u00ab\1\2\u081c\u081d\5\u0148\u00a5\2\u081d"+
		"\u0823\3\2\2\2\u081e\u081f\f\3\2\2\u081f\u0820\7\23\2\2\u0820\u0822\5"+
		"\u0148\u00a5\2\u0821\u081e\3\2\2\2\u0822\u0825\3\2\2\2\u0823\u0821\3\2"+
		"\2\2\u0823\u0824\3\2\2\2\u0824\u0155\3\2\2\2\u0825\u0823\3\2\2\2\u0826"+
		"\u0827\7\30\2\2\u0827\u0828\5\u0148\u00a5\2\u0828\u0829\7\31\2\2\u0829"+
		"\u0157\3\2\2\2\u082a\u082b\7\26\2\2\u082b\u082c\5\u0148\u00a5\2\u082c"+
		"\u082d\7\27\2\2\u082d\u0159\3\2\2\2\u082e\u082f\5\u015e\u00b0\2\u082f"+
		"\u015b\3\2\2\2\u0830\u0836\7\u00ad\2\2\u0831\u0836\7\u00af\2\2\u0832\u0836"+
		"\7\u00ab\2\2\u0833\u0836\7\u00a2\2\2\u0834\u0836\7\u00a3\2\2\u0835\u0830"+
		"\3\2\2\2\u0835\u0831\3\2\2\2\u0835\u0832\3\2\2\2\u0835\u0833\3\2\2\2\u0835"+
		"\u0834\3\2\2\2\u0836\u015d\3\2\2\2\u0837\u0838\t\t\2\2\u0838\u015f\3\2"+
		"\2\2\u0839\u083a\7\u008c\2\2\u083a\u083d\5\u0162\u00b2\2\u083b\u083d\5"+
		"\u0162\u00b2\2\u083c\u0839\3\2\2\2\u083c\u083b\3\2\2\2\u083d\u0161\3\2"+
		"\2\2\u083e\u083f\b\u00b2\1\2\u083f\u0840\5\u0164\u00b3\2\u0840\u0845\3"+
		"\2\2\2\u0841\u0842\f\3\2\2\u0842\u0844\5\u0168\u00b5\2\u0843\u0841\3\2"+
		"\2\2\u0844\u0847\3\2\2\2\u0845\u0843\3\2\2\2\u0845\u0846\3\2\2\2\u0846"+
		"\u0163\3\2\2\2\u0847\u0845\3\2\2\2\u0848\u084e\5\u0166\u00b4\2\u0849\u084e"+
		"\5\u0172\u00ba\2\u084a\u084e\5\u0174\u00bb\2\u084b\u084e\5\u0176\u00bc"+
		"\2\u084c\u084e\5\u016a\u00b6\2\u084d\u0848\3\2\2\2\u084d\u0849\3\2\2\2"+
		"\u084d\u084a\3\2\2\2\u084d\u084b\3\2\2\2\u084d\u084c\3\2\2\2\u084e\u0165"+
		"\3\2\2\2\u084f\u0850\5\u010a\u0086\2\u0850\u0167\3\2\2\2\u0851\u0852\7"+
		"\25\2\2\u0852\u0858\5\u016a\u00b6\2\u0853\u0854\7\30\2\2\u0854\u0855\5"+
		"\u0162\u00b2\2\u0855\u0856\7\31\2\2\u0856\u0858\3\2\2\2\u0857\u0851\3"+
		"\2\2\2\u0857\u0853\3\2\2\2\u0858\u0169\3\2\2\2\u0859\u085a\5\u0178\u00bd"+
		"\2\u085a\u085c\7\26\2\2\u085b\u085d\5\u016c\u00b7\2\u085c\u085b\3\2\2"+
		"\2\u085c\u085d\3\2\2\2\u085d\u085e\3\2\2\2\u085e\u085f\7\27\2\2\u085f"+
		"\u016b\3\2\2\2\u0860\u0867\5\u016e\u00b8\2\u0861\u0867\5\u0170\u00b9\2"+
		"\u0862\u0863\5\u016e\u00b8\2\u0863\u0864\7\23\2\2\u0864\u0865\5\u0170"+
		"\u00b9\2\u0865\u0867\3\2\2\2\u0866\u0860\3\2\2\2\u0866\u0861\3\2\2\2\u0866"+
		"\u0862\3\2\2\2\u0867\u016d\3\2\2\2\u0868\u0869\b\u00b8\1\2\u0869\u086a"+
		"\5\u0162\u00b2\2\u086a\u0870\3\2\2\2\u086b\u086c\f\3\2\2\u086c\u086d\7"+
		"\23\2\2\u086d\u086f\5\u0162\u00b2\2\u086e\u086b\3\2\2\2\u086f\u0872\3"+
		"\2\2\2\u0870\u086e\3\2\2\2\u0870\u0871\3\2\2\2\u0871\u016f\3\2\2\2\u0872"+
		"\u0870\3\2\2\2\u0873\u0874\b\u00b9\1\2\u0874\u0875\5\u0178\u00bd\2\u0875"+
		"\u0876\7-\2\2\u0876\u0877\5\u0162\u00b2\2\u0877\u0880\3\2\2\2\u0878\u0879"+
		"\f\3\2\2\u0879\u087a\7\23\2\2\u087a\u087b\5\u0178\u00bd\2\u087b\u087c"+
		"\7-\2\2\u087c\u087d\5\u0162\u00b2\2\u087d\u087f\3\2\2\2\u087e\u0878\3"+
		"\2\2\2\u087f\u0882\3\2\2\2\u0880\u087e\3\2\2\2\u0880\u0881\3\2\2\2\u0881"+
		"\u0171\3\2\2\2\u0882\u0880\3\2\2\2\u0883\u0884\7\26\2\2\u0884\u0885\5"+
		"\u0162\u00b2\2\u0885\u0886\7\27\2\2\u0886\u0173\3\2\2\2\u0887\u0888\b"+
		"\u00bb\1\2\u0888\u088b\7\u00aa\2\2\u0889\u088b\5\u0178\u00bd\2\u088a\u0887"+
		"\3\2\2\2\u088a\u0889\3\2\2\2\u088b\u0891\3\2\2\2\u088c\u088d\f\3\2\2\u088d"+
		"\u088e\7\25\2\2\u088e\u0890\5\u0178\u00bd\2\u088f\u088c\3\2\2\2\u0890"+
		"\u0893\3\2\2\2\u0891\u088f\3\2\2\2\u0891\u0892\3\2\2\2\u0892\u0175\3\2"+
		"\2\2\u0893\u0891\3\2\2\2\u0894\u089a\7\u00ad\2\2\u0895\u089a\7\u00af\2"+
		"\2\u0896\u089a\7\u00ab\2\2\u0897\u089a\7\u00a2\2\2\u0898\u089a\7\u00a3"+
		"\2\2\u0899\u0894\3\2\2\2\u0899\u0895\3\2\2\2\u0899\u0896\3\2\2\2\u0899"+
		"\u0897\3\2\2\2\u0899\u0898\3\2\2\2\u089a\u0177\3\2\2\2\u089b\u089c\t\n"+
		"\2\2\u089c\u0179\3\2\2\2\u089d\u089e\7\u008c\2\2\u089e\u089f\5\u017c\u00bf"+
		"\2\u089f\u08a0\7\22\2\2\u08a0\u08a5\3\2\2\2\u08a1\u08a2\5\u017c\u00bf"+
		"\2\u08a2\u08a3\7\22\2\2\u08a3\u08a5\3\2\2\2\u08a4\u089d\3\2\2\2\u08a4"+
		"\u08a1\3\2\2\2\u08a5\u017b\3\2\2\2\u08a6\u08a7\b\u00bf\1\2\u08a7\u08a8"+
		"\5\u017e\u00c0\2\u08a8\u08ad\3\2\2\2\u08a9\u08aa\f\3\2\2\u08aa\u08ac\5"+
		"\u0184\u00c3\2\u08ab\u08a9\3\2\2\2\u08ac\u08af\3\2\2\2\u08ad\u08ab\3\2"+
		"\2\2\u08ad\u08ae\3\2\2\2\u08ae\u017d\3\2\2\2\u08af\u08ad\3\2\2\2\u08b0"+
		"\u08b6\5\u0180\u00c1\2\u08b1\u08b6\5\u0182\u00c2\2\u08b2\u08b6\5\u018c"+
		"\u00c7\2\u08b3\u08b6\5\u018e\u00c8\2\u08b4\u08b6\5\u0192\u00ca\2\u08b5"+
		"\u08b0\3\2\2\2\u08b5\u08b1\3\2\2\2\u08b5\u08b2\3\2\2\2\u08b5\u08b3\3\2"+
		"\2\2\u08b5\u08b4\3\2\2\2\u08b6\u017f\3\2\2\2\u08b7\u08b8\5\u010a\u0086"+
		"\2\u08b8\u0181\3\2\2\2\u08b9\u08ba\5\u0130\u0099\2\u08ba\u08bb\5\u0186"+
		"\u00c4\2\u08bb\u0183\3\2\2\2\u08bc\u08bd\7\25\2\2\u08bd\u08c0\5\u0186"+
		"\u00c4\2\u08be\u08c0\5\u018a\u00c6\2\u08bf\u08bc\3\2\2\2\u08bf\u08be\3"+
		"\2\2\2\u08c0\u0185\3\2\2\2\u08c1\u08c2\5\u0194\u00cb\2\u08c2\u08c4\7\26"+
		"\2\2\u08c3\u08c5\5\u0188\u00c5\2\u08c4\u08c3\3\2\2\2\u08c4\u08c5\3\2\2"+
		"\2\u08c5\u08c6\3\2\2\2\u08c6\u08c7\7\27\2\2\u08c7\u0187\3\2\2\2\u08c8"+
		"\u08c9\b\u00c5\1\2\u08c9\u08ca\5\u017c\u00bf\2\u08ca\u08d0\3\2\2\2\u08cb"+
		"\u08cc\f\3\2\2\u08cc\u08cd\7\23\2\2\u08cd\u08cf\5\u017c\u00bf\2\u08ce"+
		"\u08cb\3\2\2\2\u08cf\u08d2\3\2\2\2\u08d0\u08ce\3\2\2\2\u08d0\u08d1\3\2"+
		"\2\2\u08d1\u0189\3\2\2\2\u08d2\u08d0\3\2\2\2\u08d3\u08d4\7\30\2\2\u08d4"+
		"\u08d5\5\u017c\u00bf\2\u08d5\u08d6\7\31\2\2\u08d6\u018b\3\2\2\2\u08d7"+
		"\u08d8\7\26\2\2\u08d8\u08d9\5\u017c\u00bf\2\u08d9\u08da\7\27\2\2\u08da"+
		"\u018d\3\2\2\2\u08db\u08dc\b\u00c8\1\2\u08dc\u08dd\5\u0194\u00cb\2\u08dd"+
		"\u08e3\3\2\2\2\u08de\u08df\f\3\2\2\u08df\u08e0\7\25\2\2\u08e0\u08e2\5"+
		"\u0194\u00cb\2\u08e1\u08de\3\2\2\2\u08e2\u08e5\3\2\2\2\u08e3\u08e1\3\2"+
		"\2\2\u08e3\u08e4\3\2\2\2\u08e4\u018f\3\2\2\2\u08e5\u08e3\3\2\2\2\u08e6"+
		"\u08e7\b\u00c9\1\2\u08e7\u08e8\5\u018e\u00c8\2\u08e8\u08ed\3\2\2\2\u08e9"+
		"\u08ea\f\3\2\2\u08ea\u08ec\7\u00aa\2\2\u08eb\u08e9\3\2\2\2\u08ec\u08ef"+
		"\3\2\2\2\u08ed\u08eb\3\2\2\2\u08ed\u08ee\3\2\2\2\u08ee\u0191\3\2\2\2\u08ef"+
		"\u08ed\3\2\2\2\u08f0\u08f6\7\u00ad\2\2\u08f1\u08f6\7\u00af\2\2\u08f2\u08f6"+
		"\7\u00ab\2\2\u08f3\u08f6\7\u00a2\2\2\u08f4\u08f6\7\u00a3\2\2\u08f5\u08f0"+
		"\3\2\2\2\u08f5\u08f1\3\2\2\2\u08f5\u08f2\3\2\2\2\u08f5\u08f3\3\2\2\2\u08f5"+
		"\u08f4\3\2\2\2\u08f6\u0193\3\2\2\2\u08f7\u08f8\t\13\2\2\u08f8\u0195\3"+
		"\2\2\2\u08f9\u08fa\7\u008c\2\2\u08fa\u08fb\5\u0198\u00cd\2\u08fb\u08fc"+
		"\7\22\2\2\u08fc\u0901\3\2\2\2\u08fd\u08fe\5\u0198\u00cd\2\u08fe\u08ff"+
		"\7\22\2\2\u08ff\u0901\3\2\2\2\u0900\u08f9\3\2\2\2\u0900\u08fd\3\2\2\2"+
		"\u0901\u0197\3\2\2\2\u0902\u0903\b\u00cd\1\2\u0903\u0904\5\u019a\u00ce"+
		"\2\u0904\u0909\3\2\2\2\u0905\u0906\f\3\2\2\u0906\u0908\5\u01a0\u00d1\2"+
		"\u0907\u0905\3\2\2\2\u0908\u090b\3\2\2\2\u0909\u0907\3\2\2\2\u0909\u090a"+
		"\3\2\2\2\u090a\u0199\3\2\2\2\u090b\u0909\3\2\2\2\u090c\u0912\5\u019c\u00cf"+
		"\2\u090d\u0912\5\u019e\u00d0\2\u090e\u0912\5\u01a8\u00d5\2\u090f\u0912"+
		"\5\u01aa\u00d6\2\u0910\u0912\5\u01ac\u00d7\2\u0911\u090c\3\2\2\2\u0911"+
		"\u090d\3\2\2\2\u0911\u090e\3\2\2\2\u0911\u090f\3\2\2\2\u0911\u0910\3\2"+
		"\2\2\u0912\u019b\3\2\2\2\u0913\u0914\5\u010a\u0086\2\u0914\u019d\3\2\2"+
		"\2\u0915\u0916\5\u0130\u0099\2\u0916\u0917\5\u01a2\u00d2\2\u0917\u019f"+
		"\3\2\2\2\u0918\u0919\7\25\2\2\u0919\u091c\5\u01a2\u00d2\2\u091a\u091c"+
		"\5\u01a6\u00d4\2\u091b\u0918\3\2\2\2\u091b\u091a\3\2\2\2\u091c\u01a1\3"+
		"\2\2\2\u091d\u091e\5\u01ae\u00d8\2\u091e\u0920\7\26\2\2\u091f\u0921\5"+
		"\u01a4\u00d3\2\u0920\u091f\3\2\2\2\u0920\u0921\3\2\2\2\u0921\u0922\3\2"+
		"\2\2\u0922\u0923\7\27\2\2\u0923\u01a3\3\2\2\2\u0924\u0925\b\u00d3\1\2"+
		"\u0925\u0926\5\u0198\u00cd\2\u0926\u092c\3\2\2\2\u0927\u0928\f\3\2\2\u0928"+
		"\u0929\7\23\2\2\u0929\u092b\5\u0198\u00cd\2\u092a\u0927\3\2\2\2\u092b"+
		"\u092e\3\2\2\2\u092c\u092a\3\2\2\2\u092c\u092d\3\2\2\2\u092d\u01a5\3\2"+
		"\2\2\u092e\u092c\3\2\2\2\u092f\u0930\7\30\2\2\u0930\u0931\5\u0198\u00cd"+
		"\2\u0931\u0932\7\31\2\2\u0932\u01a7\3\2\2\2\u0933\u0934\7\26\2\2\u0934"+
		"\u0935\5\u0198\u00cd\2\u0935\u0936\7\27\2\2\u0936\u01a9\3\2\2\2\u0937"+
		"\u0938\b\u00d6\1\2\u0938\u093b\7\u00aa\2\2\u0939\u093b\5\u01ae\u00d8\2"+
		"\u093a\u0937\3\2\2\2\u093a\u0939\3\2\2\2\u093b\u0941\3\2\2\2\u093c\u093d"+
		"\f\3\2\2\u093d\u093e\7\25\2\2\u093e\u0940\5\u01ae\u00d8\2\u093f\u093c"+
		"\3\2\2\2\u0940\u0943\3\2\2\2\u0941\u093f\3\2\2\2\u0941\u0942\3\2\2\2\u0942"+
		"\u01ab\3\2\2\2\u0943\u0941\3\2\2\2\u0944\u094a\7\u00ad\2\2\u0945\u094a"+
		"\7\u00af\2\2\u0946\u094a\7\u00ab\2\2\u0947\u094a\7\u00a2\2\2\u0948\u094a"+
		"\7\u00a3\2\2\u0949\u0944\3\2\2\2\u0949\u0945\3\2\2\2\u0949\u0946\3\2\2"+
		"\2\u0949\u0947\3\2\2\2\u0949\u0948\3\2\2\2\u094a\u01ad\3\2\2\2\u094b\u094c"+
		"\t\f\2\2\u094c\u01af\3\2\2\2\u094d\u0950\5\u01b2\u00da\2\u094e\u0950\5"+
		"\u01b4\u00db\2\u094f\u094d\3\2\2\2\u094f\u094e\3\2\2\2\u0950\u01b1\3\2"+
		"\2\2\u0951\u0959\5\u01ba\u00de\2\u0952\u0954\5\u01bc\u00df\2\u0953\u0955"+
		"\5\u01c8\u00e5\2\u0954\u0953\3\2\2\2\u0954\u0955\3\2\2\2\u0955\u0956\3"+
		"\2\2\2\u0956\u0957\5\u01be\u00e0\2\u0957\u0959\3\2\2\2\u0958\u0951\3\2"+
		"\2\2\u0958\u0952\3\2\2\2\u0959\u01b3\3\2\2\2\u095a\u095c\5\u01b6\u00dc"+
		"\2\u095b\u095d\5\u01c8\u00e5\2\u095c\u095b\3\2\2\2\u095c\u095d\3\2\2\2"+
		"\u095d\u095e\3\2\2\2\u095e\u095f\5\u01b8\u00dd\2\u095f\u01b5\3\2\2\2\u0960"+
		"\u0961\7*\2\2\u0961\u0964\7(\2\2\u0962\u0964\7,\2\2\u0963\u0960\3\2\2"+
		"\2\u0963\u0962\3\2\2\2\u0964\u01b7\3\2\2\2\u0965\u0966\7*\2\2\u0966\u0967"+
		"\7%\2\2\u0967\u0968\7(\2\2\u0968\u01b9\3\2\2\2\u0969\u096a\7*\2\2\u096a"+
		"\u096e\5\u01c0\u00e1\2\u096b\u096d\5\u01c4\u00e3\2\u096c\u096b\3\2\2\2"+
		"\u096d\u0970\3\2\2\2\u096e\u096c\3\2\2\2\u096e\u096f\3\2\2\2\u096f\u0971"+
		"\3\2\2\2\u0970\u096e\3\2\2\2\u0971\u0972\7%\2\2\u0972\u0973\7(\2\2\u0973"+
		"\u01bb\3\2\2\2\u0974\u0975\7*\2\2\u0975\u0979\5\u01c0\u00e1\2\u0976\u0978"+
		"\5\u01c4\u00e3\2\u0977\u0976\3\2\2\2\u0978\u097b\3\2\2\2\u0979\u0977\3"+
		"\2\2\2\u0979\u097a\3\2\2\2\u097a\u097c\3\2\2\2\u097b\u0979\3\2\2\2\u097c"+
		"\u097d\7(\2\2\u097d\u01bd\3\2\2\2\u097e\u097f\7*\2\2\u097f\u0980\7%\2"+
		"\2\u0980\u0981\5\u01c0\u00e1\2\u0981\u0982\7(\2\2\u0982\u01bf\3\2\2\2"+
		"\u0983\u0988\5\u01c2\u00e2\2\u0984\u0985\7\25\2\2\u0985\u0987\5\u01c2"+
		"\u00e2\2\u0986\u0984\3\2\2\2\u0987\u098a\3\2\2\2\u0988\u0986\3\2\2\2\u0988"+
		"\u0989\3\2\2\2\u0989\u01c1\3\2\2\2\u098a\u0988\3\2\2\2\u098b\u098f\5\u00ba"+
		"^\2\u098c\u098e\5\u00bc_\2\u098d\u098c\3\2\2\2\u098e\u0991\3\2\2\2\u098f"+
		"\u098d\3\2\2\2\u098f\u0990\3\2\2\2\u0990\u01c3\3\2\2\2\u0991\u098f\3\2"+
		"\2\2\u0992\u0995\5\u01c2\u00e2\2\u0993\u0994\7-\2\2\u0994\u0996\5\u01c6"+
		"\u00e4\2\u0995\u0993\3\2\2\2\u0995\u0996\3\2\2\2\u0996\u01c5\3\2\2\2\u0997"+
		"\u099d\7\u00ab\2\2\u0998\u0999\7\32\2\2\u0999\u099a\5^\60\2\u099a\u099b"+
		"\7\33\2\2\u099b\u099d\3\2\2\2\u099c\u0997\3\2\2\2\u099c\u0998\3\2\2\2"+
		"\u099d\u01c7\3\2\2\2\u099e\u09a0\5\u01ca\u00e6\2\u099f\u099e\3\2\2\2\u09a0"+
		"\u09a1\3\2\2\2\u09a1\u099f\3\2\2\2\u09a1\u09a2\3\2\2\2\u09a2\u01c9\3\2"+
		"\2\2\u09a3\u09ab\5\u01cc\u00e7\2\u09a4\u09ab\5\u01b2\u00da\2\u09a5\u09a7"+
		"\7\32\2\2\u09a6\u09a8\5^\60\2\u09a7\u09a6\3\2\2\2\u09a7\u09a8\3\2\2\2"+
		"\u09a8\u09a9\3\2\2\2\u09a9\u09ab\7\33\2\2\u09aa\u09a3\3\2\2\2\u09aa\u09a4"+
		"\3\2\2\2\u09aa\u09a5\3\2\2\2\u09ab\u01cb\3\2\2\2\u09ac\u09ae\n\r\2\2\u09ad"+
		"\u09ac\3\2\2\2\u09ae\u09af\3\2\2\2\u09af\u09ad\3\2\2\2\u09af\u09b0\3\2"+
		"\2\2\u09b0\u01cd\3\2\2\2\u09b1\u09b3\7\32\2\2\u09b2\u09b4\5\u01d0\u00e9"+
		"\2\u09b3\u09b2\3\2\2\2\u09b4\u09b5\3\2\2\2\u09b5\u09b3\3\2\2\2\u09b5\u09b6"+
		"\3\2\2\2\u09b6\u09b7\3\2\2\2\u09b7\u09b8\7\33\2\2\u09b8\u01cf\3\2\2\2"+
		"\u09b9\u09ba\5\u01d2\u00ea\2\u09ba\u09bb\7\21\2\2\u09bb\u09bc\5\u01d4"+
		"\u00eb\2\u09bc\u09bd\7\22\2\2\u09bd\u01d1\3\2\2\2\u09be\u09bf\b\u00ea"+
		"\1\2\u09bf\u09c3\5\u00ba^\2\u09c0\u09c1\7#\2\2\u09c1\u09c3\5\u00be`\2"+
		"\u09c2\u09be\3\2\2\2\u09c2\u09c0\3\2\2\2\u09c3\u09cc\3\2\2\2\u09c4\u09c6"+
		"\f\3\2\2\u09c5\u09c7\5\u00bc_\2\u09c6\u09c5\3\2\2\2\u09c7\u09c8\3\2\2"+
		"\2\u09c8\u09c6\3\2\2\2\u09c8\u09c9\3\2\2\2\u09c9\u09cb\3\2\2\2\u09ca\u09c4"+
		"\3\2\2\2\u09cb\u09ce\3\2\2\2\u09cc\u09ca\3\2\2\2\u09cc\u09cd\3\2\2\2\u09cd"+
		"\u01d3\3\2\2\2\u09ce\u09cc\3\2\2\2\u09cf\u09d0\7\32\2\2\u09d0\u09d1\5"+
		"^\60\2\u09d1\u09d2\7\33\2\2\u09d2\u09d5\3\2\2\2\u09d3\u09d5\5\u01d6\u00ec"+
		"\2\u09d4\u09cf\3\2\2\2\u09d4\u09d3\3\2\2\2\u09d5\u01d5\3\2\2\2\u09d6\u09d8"+
		"\n\16\2\2\u09d7\u09d6\3\2\2\2\u09d8\u09d9\3\2\2\2\u09d9\u09d7\3\2\2\2"+
		"\u09d9\u09da\3\2\2\2\u09da\u01d7\3\2\2\2\u00d7\u01de\u01e1\u01fa\u01ff"+
		"\u020d\u0213\u0215\u0217\u021e\u0226\u022d\u0232\u023d\u0244\u0251\u025f"+
		"\u0273\u028a\u0295\u029c\u02a5\u02aa\u02b1\u02ba\u02cf\u02d7\u02dc\u02e2"+
		"\u02e7\u02f0\u02f5\u02fa\u0312\u031d\u0321\u0336\u0350\u0355\u035e\u0367"+
		"\u0370\u038d\u03a0\u03a6\u03c8\u03d1\u03e8\u03f6\u03ff\u0408\u041f\u0425"+
		"\u043b\u04aa\u04ac\u04b8\u04c3\u04d2\u04d7\u04de\u04e7\u04ee\u04f2\u04fe"+
		"\u0505\u050c\u051c\u0527\u052b\u0530\u0535\u0537\u053b\u0544\u0554\u055d"+
		"\u0563\u0568\u056f\u0577\u0582\u058a\u0593\u0599\u05a1\u05aa\u05b2\u05bf"+
		"\u05c2\u05c6\u05cb\u05cf\u05d8\u05ed\u05f7\u05f9\u05fe\u0610\u0615\u061e"+
		"\u0627\u062c\u0630\u063c\u064b\u0650\u0653\u0657\u065c\u0663\u066e\u0670"+
		"\u0679\u0681\u0689\u068f\u069b\u069f\u06a9\u06ae\u06b4\u06bb\u06c0\u06c7"+
		"\u06cf\u06d6\u06e0\u06ed\u06f1\u06f4\u06f8\u06fb\u0703\u070c\u0715\u071e"+
		"\u072f\u0740\u0747\u074e\u0758\u075f\u0762\u0766\u076b\u076f\u077a\u077d"+
		"\u0784\u0794\u07a1\u07a8\u07b9\u07c1\u07c5\u07cd\u07f3\u07fc\u0806\u0812"+
		"\u0817\u0823\u0835\u083c\u0845\u084d\u0857\u085c\u0866\u0870\u0880\u088a"+
		"\u0891\u0899\u08a4\u08ad\u08b5\u08bf\u08c4\u08d0\u08e3\u08ed\u08f5\u0900"+
		"\u0909\u0911\u091b\u0920\u092c\u093a\u0941\u0949\u094f\u0954\u0958\u095c"+
		"\u0963\u096e\u0979\u0988\u098f\u0995\u099c\u09a1\u09a7\u09aa\u09af\u09b5"+
		"\u09c2\u09c8\u09cc";
	private static final String _serializedATNSegment1 =
		"\u09d4\u09d9";
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