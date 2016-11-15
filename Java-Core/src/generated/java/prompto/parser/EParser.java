// Generated from EParser.g4 by ANTLR 4.5
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
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

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
		DATE=55, TIME=56, DATETIME=57, PERIOD=58, METHOD_T=59, CODE=60, DOCUMENT=61, 
		BLOB=62, IMAGE=63, UUID=64, ITERATOR=65, CURSOR=66, ABSTRACT=67, ALL=68, 
		ALWAYS=69, AND=70, ANY=71, AS=72, ASC=73, ATTR=74, ATTRIBUTE=75, ATTRIBUTES=76, 
		BINDINGS=77, BREAK=78, BY=79, CASE=80, CATCH=81, CATEGORY=82, CLASS=83, 
		CLOSE=84, CONTAINS=85, DEF=86, DEFAULT=87, DEFINE=88, DELETE=89, DESC=90, 
		DO=91, DOING=92, EACH=93, ELSE=94, ENUM=95, ENUMERATED=96, EXCEPT=97, 
		EXECUTE=98, EXPECTING=99, EXTENDS=100, FETCH=101, FILTERED=102, FINALLY=103, 
		FLUSH=104, FOR=105, FROM=106, GETTER=107, IF=108, IN=109, INDEX=110, INVOKE=111, 
		IS=112, MATCHING=113, METHOD=114, METHODS=115, MODULO=116, MUTABLE=117, 
		NATIVE=118, NONE=119, NOT=120, NOTHING=121, NULL=122, ON=123, ONE=124, 
		OPEN=125, OPERATOR=126, OR=127, ORDER=128, OTHERWISE=129, PASS=130, RAISE=131, 
		READ=132, RECEIVING=133, RESOURCE=134, RETURN=135, RETURNING=136, ROWS=137, 
		SELF=138, SETTER=139, SINGLETON=140, SORTED=141, STORABLE=142, STORE=143, 
		SWITCH=144, TEST=145, THIS=146, THROW=147, TO=148, TRY=149, VERIFYING=150, 
		WITH=151, WHEN=152, WHERE=153, WHILE=154, WRITE=155, BOOLEAN_LITERAL=156, 
		CHAR_LITERAL=157, MIN_INTEGER=158, MAX_INTEGER=159, SYMBOL_IDENTIFIER=160, 
		TYPE_IDENTIFIER=161, VARIABLE_IDENTIFIER=162, NATIVE_IDENTIFIER=163, DOLLAR_IDENTIFIER=164, 
		TEXT_LITERAL=165, UUID_LITERAL=166, INTEGER_LITERAL=167, HEXA_LITERAL=168, 
		DECIMAL_LITERAL=169, DATETIME_LITERAL=170, TIME_LITERAL=171, DATE_LITERAL=172, 
		PERIOD_LITERAL=173;
	public static final int
		RULE_enum_category_declaration = 0, RULE_enum_native_declaration = 1, 
		RULE_native_symbol = 2, RULE_category_symbol = 3, RULE_attribute_declaration = 4, 
		RULE_concrete_category_declaration = 5, RULE_singleton_category_declaration = 6, 
		RULE_derived_list = 7, RULE_operator_method_declaration = 8, RULE_setter_method_declaration = 9, 
		RULE_native_setter_declaration = 10, RULE_getter_method_declaration = 11, 
		RULE_native_getter_declaration = 12, RULE_native_category_declaration = 13, 
		RULE_native_resource_declaration = 14, RULE_native_category_bindings = 15, 
		RULE_native_category_binding_list = 16, RULE_attribute_list = 17, RULE_abstract_method_declaration = 18, 
		RULE_concrete_method_declaration = 19, RULE_native_method_declaration = 20, 
		RULE_test_method_declaration = 21, RULE_assertion = 22, RULE_full_argument_list = 23, 
		RULE_typed_argument = 24, RULE_statement = 25, RULE_flush_statement = 26, 
		RULE_store_statement = 27, RULE_method_call_statement = 28, RULE_with_resource_statement = 29, 
		RULE_with_singleton_statement = 30, RULE_switch_statement = 31, RULE_switch_case_statement = 32, 
		RULE_for_each_statement = 33, RULE_do_while_statement = 34, RULE_while_statement = 35, 
		RULE_if_statement = 36, RULE_else_if_statement_list = 37, RULE_raise_statement = 38, 
		RULE_try_statement = 39, RULE_catch_statement = 40, RULE_break_statement = 41, 
		RULE_return_statement = 42, RULE_expression = 43, RULE_unresolved_expression = 44, 
		RULE_unresolved_selector = 45, RULE_invocation_expression = 46, RULE_invocation_trailer = 47, 
		RULE_instance_expression = 48, RULE_instance_selector = 49, RULE_document_expression = 50, 
		RULE_blob_expression = 51, RULE_constructor_expression = 52, RULE_write_statement = 53, 
		RULE_ambiguous_expression = 54, RULE_filtered_list_suffix = 55, RULE_fetch_store_expression = 56, 
		RULE_sorted_expression = 57, RULE_argument_assignment_list = 58, RULE_with_argument_assignment_list = 59, 
		RULE_argument_assignment = 60, RULE_assign_instance_statement = 61, RULE_child_instance = 62, 
		RULE_assign_tuple_statement = 63, RULE_lfs = 64, RULE_lfp = 65, RULE_indent = 66, 
		RULE_dedent = 67, RULE_null_literal = 68, RULE_declaration_list = 69, 
		RULE_declarations = 70, RULE_declaration = 71, RULE_resource_declaration = 72, 
		RULE_enum_declaration = 73, RULE_native_symbol_list = 74, RULE_category_symbol_list = 75, 
		RULE_symbol_list = 76, RULE_attribute_constraint = 77, RULE_list_literal = 78, 
		RULE_set_literal = 79, RULE_expression_list = 80, RULE_range_literal = 81, 
		RULE_typedef = 82, RULE_primary_type = 83, RULE_native_type = 84, RULE_category_type = 85, 
		RULE_mutable_category_type = 86, RULE_code_type = 87, RULE_category_declaration = 88, 
		RULE_type_identifier_list = 89, RULE_method_identifier = 90, RULE_identifier = 91, 
		RULE_variable_identifier = 92, RULE_attribute_identifier = 93, RULE_type_identifier = 94, 
		RULE_symbol_identifier = 95, RULE_argument_list = 96, RULE_argument = 97, 
		RULE_operator_argument = 98, RULE_named_argument = 99, RULE_code_argument = 100, 
		RULE_category_or_any_type = 101, RULE_any_type = 102, RULE_member_method_declaration_list = 103, 
		RULE_member_method_declaration = 104, RULE_native_member_method_declaration_list = 105, 
		RULE_native_member_method_declaration = 106, RULE_native_category_binding = 107, 
		RULE_python_category_binding = 108, RULE_python_module = 109, RULE_javascript_category_binding = 110, 
		RULE_javascript_module = 111, RULE_variable_identifier_list = 112, RULE_attribute_identifier_list = 113, 
		RULE_method_declaration = 114, RULE_comment_statement = 115, RULE_native_statement_list = 116, 
		RULE_native_statement = 117, RULE_python_native_statement = 118, RULE_javascript_native_statement = 119, 
		RULE_statement_list = 120, RULE_assertion_list = 121, RULE_switch_case_statement_list = 122, 
		RULE_catch_statement_list = 123, RULE_literal_collection = 124, RULE_atomic_literal = 125, 
		RULE_literal_list_literal = 126, RULE_selectable_expression = 127, RULE_this_expression = 128, 
		RULE_parenthesis_expression = 129, RULE_literal_expression = 130, RULE_collection_literal = 131, 
		RULE_tuple_literal = 132, RULE_dict_literal = 133, RULE_expression_tuple = 134, 
		RULE_dict_entry_list = 135, RULE_dict_entry = 136, RULE_slice_arguments = 137, 
		RULE_assign_variable_statement = 138, RULE_assignable_instance = 139, 
		RULE_is_expression = 140, RULE_read_all_expression = 141, RULE_read_one_expression = 142, 
		RULE_order_by_list = 143, RULE_order_by = 144, RULE_operator = 145, RULE_new_token = 146, 
		RULE_key_token = 147, RULE_module_token = 148, RULE_value_token = 149, 
		RULE_symbols_token = 150, RULE_assign = 151, RULE_multiply = 152, RULE_divide = 153, 
		RULE_idivide = 154, RULE_modulo = 155, RULE_javascript_statement = 156, 
		RULE_javascript_expression = 157, RULE_javascript_primary_expression = 158, 
		RULE_javascript_this_expression = 159, RULE_javascript_new_expression = 160, 
		RULE_javascript_selector_expression = 161, RULE_javascript_method_expression = 162, 
		RULE_javascript_arguments = 163, RULE_javascript_item_expression = 164, 
		RULE_javascript_parenthesis_expression = 165, RULE_javascript_identifier_expression = 166, 
		RULE_javascript_literal_expression = 167, RULE_javascript_identifier = 168, 
		RULE_python_statement = 169, RULE_python_expression = 170, RULE_python_primary_expression = 171, 
		RULE_python_selector_expression = 172, RULE_python_method_expression = 173, 
		RULE_python_argument_list = 174, RULE_python_ordinal_argument_list = 175, 
		RULE_python_named_argument_list = 176, RULE_python_parenthesis_expression = 177, 
		RULE_python_identifier_expression = 178, RULE_python_literal_expression = 179, 
		RULE_python_identifier = 180, RULE_java_statement = 181, RULE_java_expression = 182, 
		RULE_java_primary_expression = 183, RULE_java_this_expression = 184, RULE_java_new_expression = 185, 
		RULE_java_selector_expression = 186, RULE_java_method_expression = 187, 
		RULE_java_arguments = 188, RULE_java_item_expression = 189, RULE_java_parenthesis_expression = 190, 
		RULE_java_identifier_expression = 191, RULE_java_class_identifier_expression = 192, 
		RULE_java_literal_expression = 193, RULE_java_identifier = 194, RULE_csharp_statement = 195, 
		RULE_csharp_expression = 196, RULE_csharp_primary_expression = 197, RULE_csharp_this_expression = 198, 
		RULE_csharp_new_expression = 199, RULE_csharp_selector_expression = 200, 
		RULE_csharp_method_expression = 201, RULE_csharp_arguments = 202, RULE_csharp_item_expression = 203, 
		RULE_csharp_parenthesis_expression = 204, RULE_csharp_identifier_expression = 205, 
		RULE_csharp_literal_expression = 206, RULE_csharp_identifier = 207;
	public static final String[] ruleNames = {
		"enum_category_declaration", "enum_native_declaration", "native_symbol", 
		"category_symbol", "attribute_declaration", "concrete_category_declaration", 
		"singleton_category_declaration", "derived_list", "operator_method_declaration", 
		"setter_method_declaration", "native_setter_declaration", "getter_method_declaration", 
		"native_getter_declaration", "native_category_declaration", "native_resource_declaration", 
		"native_category_bindings", "native_category_binding_list", "attribute_list", 
		"abstract_method_declaration", "concrete_method_declaration", "native_method_declaration", 
		"test_method_declaration", "assertion", "full_argument_list", "typed_argument", 
		"statement", "flush_statement", "store_statement", "method_call_statement", 
		"with_resource_statement", "with_singleton_statement", "switch_statement", 
		"switch_case_statement", "for_each_statement", "do_while_statement", "while_statement", 
		"if_statement", "else_if_statement_list", "raise_statement", "try_statement", 
		"catch_statement", "break_statement", "return_statement", "expression", 
		"unresolved_expression", "unresolved_selector", "invocation_expression", 
		"invocation_trailer", "instance_expression", "instance_selector", "document_expression", 
		"blob_expression", "constructor_expression", "write_statement", "ambiguous_expression", 
		"filtered_list_suffix", "fetch_store_expression", "sorted_expression", 
		"argument_assignment_list", "with_argument_assignment_list", "argument_assignment", 
		"assign_instance_statement", "child_instance", "assign_tuple_statement", 
		"lfs", "lfp", "indent", "dedent", "null_literal", "declaration_list", 
		"declarations", "declaration", "resource_declaration", "enum_declaration", 
		"native_symbol_list", "category_symbol_list", "symbol_list", "attribute_constraint", 
		"list_literal", "set_literal", "expression_list", "range_literal", "typedef", 
		"primary_type", "native_type", "category_type", "mutable_category_type", 
		"code_type", "category_declaration", "type_identifier_list", "method_identifier", 
		"identifier", "variable_identifier", "attribute_identifier", "type_identifier", 
		"symbol_identifier", "argument_list", "argument", "operator_argument", 
		"named_argument", "code_argument", "category_or_any_type", "any_type", 
		"member_method_declaration_list", "member_method_declaration", "native_member_method_declaration_list", 
		"native_member_method_declaration", "native_category_binding", "python_category_binding", 
		"python_module", "javascript_category_binding", "javascript_module", "variable_identifier_list", 
		"attribute_identifier_list", "method_declaration", "comment_statement", 
		"native_statement_list", "native_statement", "python_native_statement", 
		"javascript_native_statement", "statement_list", "assertion_list", "switch_case_statement_list", 
		"catch_statement_list", "literal_collection", "atomic_literal", "literal_list_literal", 
		"selectable_expression", "this_expression", "parenthesis_expression", 
		"literal_expression", "collection_literal", "tuple_literal", "dict_literal", 
		"expression_tuple", "dict_entry_list", "dict_entry", "slice_arguments", 
		"assign_variable_statement", "assignable_instance", "is_expression", "read_all_expression", 
		"read_one_expression", "order_by_list", "order_by", "operator", "new_token", 
		"key_token", "module_token", "value_token", "symbols_token", "assign", 
		"multiply", "divide", "idivide", "modulo", "javascript_statement", "javascript_expression", 
		"javascript_primary_expression", "javascript_this_expression", "javascript_new_expression", 
		"javascript_selector_expression", "javascript_method_expression", "javascript_arguments", 
		"javascript_item_expression", "javascript_parenthesis_expression", "javascript_identifier_expression", 
		"javascript_literal_expression", "javascript_identifier", "python_statement", 
		"python_expression", "python_primary_expression", "python_selector_expression", 
		"python_method_expression", "python_argument_list", "python_ordinal_argument_list", 
		"python_named_argument_list", "python_parenthesis_expression", "python_identifier_expression", 
		"python_literal_expression", "python_identifier", "java_statement", "java_expression", 
		"java_primary_expression", "java_this_expression", "java_new_expression", 
		"java_selector_expression", "java_method_expression", "java_arguments", 
		"java_item_expression", "java_parenthesis_expression", "java_identifier_expression", 
		"java_class_identifier_expression", "java_literal_expression", "java_identifier", 
		"csharp_statement", "csharp_expression", "csharp_primary_expression", 
		"csharp_this_expression", "csharp_new_expression", "csharp_selector_expression", 
		"csharp_method_expression", "csharp_arguments", "csharp_item_expression", 
		"csharp_parenthesis_expression", "csharp_identifier_expression", "csharp_literal_expression", 
		"csharp_identifier"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, "'\t'", "' '", null, "'Java:'", "'C#:'", 
		"'Python2:'", "'Python3:'", "'JavaScript:'", "'Swift:'", "':'", "';'", 
		"','", "'..'", "'.'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'?'", 
		"'!'", "'&'", "'&&'", "'|'", "'||'", "'+'", "'-'", "'*'", "'/'", "'\\'", 
		"'%'", "'>'", "'>='", "'<'", "'<='", "'<>'", "'='", "'!='", "'=='", "'~='", 
		"'~'", "'<-'", "'->'", "'Boolean'", "'Character'", "'Text'", "'Integer'", 
		"'Decimal'", "'Date'", "'Time'", "'DateTime'", "'Period'", "'Method'", 
		"'Code'", "'Document'", "'Blob'", "'Image'", "'UUID'", "'Iterator'", "'Cursor'", 
		"'abstract'", "'all'", "'always'", "'and'", "'any'", "'as'", null, "'attr'", 
		"'attribute'", "'attributes'", "'bindings'", "'break'", "'by'", "'case'", 
		"'catch'", "'category'", "'class'", "'close'", "'contains'", "'def'", 
		"'default'", "'define'", "'delete'", null, "'do'", "'doing'", "'each'", 
		"'else'", "'enum'", "'enumerated'", "'except'", "'execute'", "'expecting'", 
		"'extends'", "'fetch'", "'filtered'", "'finally'", "'flush'", "'for'", 
		"'from'", "'getter'", "'if'", "'in'", "'index'", "'invoke'", "'is'", "'matching'", 
		"'method'", "'methods'", "'modulo'", "'mutable'", "'native'", "'None'", 
		"'not'", null, "'null'", "'on'", "'one'", "'open'", "'operator'", "'or'", 
		"'order'", "'otherwise'", "'pass'", "'raise'", "'read'", "'receiving'", 
		"'resource'", "'return'", "'returning'", "'rows'", "'self'", "'setter'", 
		"'singleton'", "'sorted'", "'storable'", "'store'", "'switch'", "'test'", 
		"'this'", "'throw'", "'to'", "'try'", "'verifying'", "'with'", "'when'", 
		"'where'", "'while'", "'write'", null, null, "'MIN_INTEGER'", "'MAX_INTEGER'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INDENT", "DEDENT", "LF_TAB", "LF_MORE", "LF", "TAB", "WS", "COMMENT", 
		"JAVA", "CSHARP", "PYTHON2", "PYTHON3", "JAVASCRIPT", "SWIFT", "COLON", 
		"SEMI", "COMMA", "RANGE", "DOT", "LPAR", "RPAR", "LBRAK", "RBRAK", "LCURL", 
		"RCURL", "QMARK", "XMARK", "AMP", "AMP2", "PIPE", "PIPE2", "PLUS", "MINUS", 
		"STAR", "SLASH", "BSLASH", "PERCENT", "GT", "GTE", "LT", "LTE", "LTGT", 
		"EQ", "XEQ", "EQ2", "TEQ", "TILDE", "LARROW", "RARROW", "BOOLEAN", "CHARACTER", 
		"TEXT", "INTEGER", "DECIMAL", "DATE", "TIME", "DATETIME", "PERIOD", "METHOD_T", 
		"CODE", "DOCUMENT", "BLOB", "IMAGE", "UUID", "ITERATOR", "CURSOR", "ABSTRACT", 
		"ALL", "ALWAYS", "AND", "ANY", "AS", "ASC", "ATTR", "ATTRIBUTE", "ATTRIBUTES", 
		"BINDINGS", "BREAK", "BY", "CASE", "CATCH", "CATEGORY", "CLASS", "CLOSE", 
		"CONTAINS", "DEF", "DEFAULT", "DEFINE", "DELETE", "DESC", "DO", "DOING", 
		"EACH", "ELSE", "ENUM", "ENUMERATED", "EXCEPT", "EXECUTE", "EXPECTING", 
		"EXTENDS", "FETCH", "FILTERED", "FINALLY", "FLUSH", "FOR", "FROM", "GETTER", 
		"IF", "IN", "INDEX", "INVOKE", "IS", "MATCHING", "METHOD", "METHODS", 
		"MODULO", "MUTABLE", "NATIVE", "NONE", "NOT", "NOTHING", "NULL", "ON", 
		"ONE", "OPEN", "OPERATOR", "OR", "ORDER", "OTHERWISE", "PASS", "RAISE", 
		"READ", "RECEIVING", "RESOURCE", "RETURN", "RETURNING", "ROWS", "SELF", 
		"SETTER", "SINGLETON", "SORTED", "STORABLE", "STORE", "SWITCH", "TEST", 
		"THIS", "THROW", "TO", "TRY", "VERIFYING", "WITH", "WHEN", "WHERE", "WHILE", 
		"WRITE", "BOOLEAN_LITERAL", "CHAR_LITERAL", "MIN_INTEGER", "MAX_INTEGER", 
		"SYMBOL_IDENTIFIER", "TYPE_IDENTIFIER", "VARIABLE_IDENTIFIER", "NATIVE_IDENTIFIER", 
		"DOLLAR_IDENTIFIER", "TEXT_LITERAL", "UUID_LITERAL", "INTEGER_LITERAL", 
		"HEXA_LITERAL", "DECIMAL_LITERAL", "DATETIME_LITERAL", "TIME_LITERAL", 
		"DATE_LITERAL", "PERIOD_LITERAL"
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
	@NotNull
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
			setState(416); 
			match(DEFINE);
			setState(417); 
			((Enum_category_declarationContext)_localctx).name = type_identifier();
			setState(418); 
			match(AS);
			setState(419); 
			match(ENUMERATED);
			setState(422);
			switch (_input.LA(1)) {
			case CATEGORY:
				{
				setState(420); 
				match(CATEGORY);
				}
				break;
			case TYPE_IDENTIFIER:
				{
				setState(421); 
				((Enum_category_declarationContext)_localctx).derived = type_identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(429);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				{
				setState(424); 
				((Enum_category_declarationContext)_localctx).attrs = attribute_list();
				setState(425); 
				match(COMMA);
				setState(426); 
				match(AND);
				}
				}
				break;
			case 2:
				{
				setState(428); 
				match(WITH);
				}
				break;
			}
			setState(431); 
			symbols_token();
			setState(432); 
			match(COLON);
			setState(433); 
			indent();
			setState(434); 
			((Enum_category_declarationContext)_localctx).symbols = category_symbol_list();
			setState(435); 
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
			setState(437); 
			match(DEFINE);
			setState(438); 
			((Enum_native_declarationContext)_localctx).name = type_identifier();
			setState(439); 
			match(AS);
			setState(440); 
			match(ENUMERATED);
			setState(441); 
			((Enum_native_declarationContext)_localctx).typ = native_type();
			setState(442); 
			match(WITH);
			setState(443); 
			symbols_token();
			setState(444); 
			match(COLON);
			setState(445); 
			indent();
			setState(446); 
			((Enum_native_declarationContext)_localctx).symbols = native_symbol_list();
			setState(447); 
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
			setState(449); 
			((Native_symbolContext)_localctx).name = symbol_identifier();
			setState(450); 
			match(WITH);
			setState(451); 
			((Native_symbolContext)_localctx).exp = expression(0);
			setState(452); 
			match(AS);
			setState(453); 
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
			setState(455); 
			((Category_symbolContext)_localctx).name = symbol_identifier();
			setState(456); 
			((Category_symbolContext)_localctx).args = with_argument_assignment_list(0);
			setState(459);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(457); 
				match(AND);
				setState(458); 
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
			setState(461); 
			match(DEFINE);
			setState(462); 
			((Attribute_declarationContext)_localctx).name = attribute_identifier();
			setState(463); 
			match(AS);
			setState(465);
			_la = _input.LA(1);
			if (_la==STORABLE) {
				{
				setState(464); 
				match(STORABLE);
				}
			}

			setState(467); 
			((Attribute_declarationContext)_localctx).typ = typedef(0);
			setState(468); 
			match(ATTRIBUTE);
			setState(470);
			_la = _input.LA(1);
			if (_la==IN || _la==MATCHING) {
				{
				setState(469); 
				((Attribute_declarationContext)_localctx).match = attribute_constraint();
				}
			}

			setState(481);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(472); 
				match(WITH);
				setState(478);
				_la = _input.LA(1);
				if (_la==VARIABLE_IDENTIFIER) {
					{
					setState(473); 
					((Attribute_declarationContext)_localctx).indices = variable_identifier_list();
					setState(476);
					_la = _input.LA(1);
					if (_la==AND) {
						{
						setState(474); 
						match(AND);
						setState(475); 
						((Attribute_declarationContext)_localctx).index = variable_identifier();
						}
					}

					}
				}

				setState(480); 
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
		enterRule(_localctx, 10, RULE_concrete_category_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483); 
			match(DEFINE);
			setState(484); 
			((Concrete_category_declarationContext)_localctx).name = type_identifier();
			setState(485); 
			match(AS);
			setState(487);
			_la = _input.LA(1);
			if (_la==STORABLE) {
				{
				setState(486); 
				match(STORABLE);
				}
			}

			setState(491);
			switch (_input.LA(1)) {
			case CATEGORY:
				{
				setState(489); 
				match(CATEGORY);
				}
				break;
			case TYPE_IDENTIFIER:
				{
				setState(490); 
				((Concrete_category_declarationContext)_localctx).derived = derived_list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(511);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				{
				setState(493); 
				((Concrete_category_declarationContext)_localctx).attrs = attribute_list();
				setState(502);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(494); 
					match(COMMA);
					setState(495); 
					match(AND);
					setState(496); 
					match(METHODS);
					setState(497); 
					match(COLON);
					setState(498); 
					indent();
					setState(499); 
					((Concrete_category_declarationContext)_localctx).methods = member_method_declaration_list();
					setState(500); 
					dedent();
					}
				}

				}
				}
				break;
			case 2:
				{
				{
				setState(504); 
				match(WITH);
				setState(505); 
				match(METHODS);
				setState(506); 
				match(COLON);
				setState(507); 
				indent();
				setState(508); 
				((Concrete_category_declarationContext)_localctx).methods = member_method_declaration_list();
				setState(509); 
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
		enterRule(_localctx, 12, RULE_singleton_category_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513); 
			match(DEFINE);
			setState(514); 
			((Singleton_category_declarationContext)_localctx).name = type_identifier();
			setState(515); 
			match(AS);
			setState(516); 
			match(SINGLETON);
			setState(535);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				{
				setState(517); 
				((Singleton_category_declarationContext)_localctx).attrs = attribute_list();
				setState(526);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(518); 
					match(COMMA);
					setState(519); 
					match(AND);
					setState(520); 
					match(METHODS);
					setState(521); 
					match(COLON);
					setState(522); 
					indent();
					setState(523); 
					((Singleton_category_declarationContext)_localctx).methods = member_method_declaration_list();
					setState(524); 
					dedent();
					}
				}

				}
				}
				break;
			case 2:
				{
				{
				setState(528); 
				match(WITH);
				setState(529); 
				match(METHODS);
				setState(530); 
				match(COLON);
				setState(531); 
				indent();
				setState(532); 
				((Singleton_category_declarationContext)_localctx).methods = member_method_declaration_list();
				setState(533); 
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
		enterRule(_localctx, 14, RULE_derived_list);
		try {
			setState(542);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new DerivedListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(537); 
				((DerivedListContext)_localctx).items = type_identifier_list();
				}
				break;
			case 2:
				_localctx = new DerivedListItemContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(538); 
				((DerivedListItemContext)_localctx).items = type_identifier_list();
				setState(539); 
				match(AND);
				setState(540); 
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
		enterRule(_localctx, 16, RULE_operator_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544); 
			match(DEFINE);
			setState(545); 
			((Operator_method_declarationContext)_localctx).op = operator();
			setState(546); 
			match(AS);
			setState(547); 
			match(OPERATOR);
			setState(548); 
			match(RECEIVING);
			setState(549); 
			((Operator_method_declarationContext)_localctx).arg = operator_argument();
			setState(552);
			_la = _input.LA(1);
			if (_la==RETURNING) {
				{
				setState(550); 
				match(RETURNING);
				setState(551); 
				((Operator_method_declarationContext)_localctx).typ = typedef(0);
				}
			}

			setState(554); 
			match(DOING);
			setState(555); 
			match(COLON);
			setState(556); 
			indent();
			setState(557); 
			((Operator_method_declarationContext)_localctx).stmts = statement_list();
			setState(558); 
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
		enterRule(_localctx, 18, RULE_setter_method_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560); 
			match(DEFINE);
			setState(561); 
			((Setter_method_declarationContext)_localctx).name = variable_identifier();
			setState(562); 
			match(AS);
			setState(563); 
			match(SETTER);
			setState(564); 
			match(DOING);
			setState(565); 
			match(COLON);
			setState(566); 
			indent();
			setState(567); 
			((Setter_method_declarationContext)_localctx).stmts = statement_list();
			setState(568); 
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
		enterRule(_localctx, 20, RULE_native_setter_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570); 
			match(DEFINE);
			setState(571); 
			((Native_setter_declarationContext)_localctx).name = variable_identifier();
			setState(572); 
			match(AS);
			setState(574);
			_la = _input.LA(1);
			if (_la==NATIVE) {
				{
				setState(573); 
				match(NATIVE);
				}
			}

			setState(576); 
			match(SETTER);
			setState(577); 
			match(DOING);
			setState(578); 
			match(COLON);
			setState(579); 
			indent();
			setState(580); 
			((Native_setter_declarationContext)_localctx).stmts = native_statement_list();
			setState(581); 
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
		enterRule(_localctx, 22, RULE_getter_method_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583); 
			match(DEFINE);
			setState(584); 
			((Getter_method_declarationContext)_localctx).name = variable_identifier();
			setState(585); 
			match(AS);
			setState(586); 
			match(GETTER);
			setState(587); 
			match(DOING);
			setState(588); 
			match(COLON);
			setState(589); 
			indent();
			setState(590); 
			((Getter_method_declarationContext)_localctx).stmts = statement_list();
			setState(591); 
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
		enterRule(_localctx, 24, RULE_native_getter_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593); 
			match(DEFINE);
			setState(594); 
			((Native_getter_declarationContext)_localctx).name = variable_identifier();
			setState(595); 
			match(AS);
			setState(597);
			_la = _input.LA(1);
			if (_la==NATIVE) {
				{
				setState(596); 
				match(NATIVE);
				}
			}

			setState(599); 
			match(GETTER);
			setState(600); 
			match(DOING);
			setState(601); 
			match(COLON);
			setState(602); 
			indent();
			setState(603); 
			((Native_getter_declarationContext)_localctx).stmts = native_statement_list();
			setState(604); 
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
		enterRule(_localctx, 26, RULE_native_category_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606); 
			match(DEFINE);
			setState(607); 
			((Native_category_declarationContext)_localctx).name = type_identifier();
			setState(608); 
			match(AS);
			setState(610);
			_la = _input.LA(1);
			if (_la==STORABLE) {
				{
				setState(609); 
				match(STORABLE);
				}
			}

			setState(612); 
			match(NATIVE);
			setState(613); 
			match(CATEGORY);
			setState(621);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				{
				setState(614); 
				((Native_category_declarationContext)_localctx).attrs = attribute_list();
				setState(615); 
				match(COMMA);
				setState(616); 
				match(AND);
				setState(617); 
				match(BINDINGS);
				}
				}
				break;
			case 2:
				{
				setState(619); 
				match(WITH);
				setState(620); 
				match(BINDINGS);
				}
				break;
			}
			setState(623); 
			match(COLON);
			setState(624); 
			indent();
			setState(625); 
			((Native_category_declarationContext)_localctx).bindings = native_category_bindings();
			setState(626); 
			dedent();
			setState(635);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(627); 
				lfp();
				setState(628); 
				match(AND);
				setState(629); 
				match(METHODS);
				setState(630); 
				match(COLON);
				setState(631); 
				indent();
				setState(632); 
				((Native_category_declarationContext)_localctx).methods = native_member_method_declaration_list();
				setState(633); 
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
		enterRule(_localctx, 28, RULE_native_resource_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637); 
			match(DEFINE);
			setState(638); 
			((Native_resource_declarationContext)_localctx).name = type_identifier();
			setState(639); 
			match(AS);
			setState(640); 
			match(NATIVE);
			setState(641); 
			match(RESOURCE);
			setState(649);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				{
				setState(642); 
				((Native_resource_declarationContext)_localctx).attrs = attribute_list();
				setState(643); 
				match(COMMA);
				setState(644); 
				match(AND);
				setState(645); 
				match(BINDINGS);
				}
				}
				break;
			case 2:
				{
				setState(647); 
				match(WITH);
				setState(648); 
				match(BINDINGS);
				}
				break;
			}
			setState(651); 
			match(COLON);
			setState(652); 
			indent();
			setState(653); 
			((Native_resource_declarationContext)_localctx).bindings = native_category_bindings();
			setState(654); 
			dedent();
			setState(663);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(655); 
				lfp();
				setState(656); 
				match(AND);
				setState(657); 
				match(METHODS);
				setState(658); 
				match(COLON);
				setState(659); 
				indent();
				setState(660); 
				((Native_resource_declarationContext)_localctx).methods = native_member_method_declaration_list();
				setState(661); 
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
		enterRule(_localctx, 30, RULE_native_category_bindings);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665); 
			match(DEFINE);
			setState(666); 
			match(CATEGORY);
			setState(667); 
			match(BINDINGS);
			setState(668); 
			match(AS);
			setState(669); 
			match(COLON);
			setState(670); 
			indent();
			setState(671); 
			((Native_category_bindingsContext)_localctx).items = native_category_binding_list(0);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_native_category_binding_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new NativeCategoryBindingListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(675); 
			((NativeCategoryBindingListContext)_localctx).item = native_category_binding();
			}
			_ctx.stop = _input.LT(-1);
			setState(683);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NativeCategoryBindingListItemContext(new Native_category_binding_listContext(_parentctx, _parentState));
					((NativeCategoryBindingListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_native_category_binding_list);
					setState(677);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(678); 
					lfp();
					setState(679); 
					((NativeCategoryBindingListItemContext)_localctx).item = native_category_binding();
					}
					} 
				}
				setState(685);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
		enterRule(_localctx, 34, RULE_attribute_list);
		try {
			setState(696);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new AttributeListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(686); 
				match(WITH);
				setState(687); 
				match(ATTRIBUTE);
				setState(688); 
				((AttributeListContext)_localctx).item = attribute_identifier();
				}
				break;
			case 2:
				_localctx = new AttributeListItemContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(689); 
				match(WITH);
				setState(690); 
				match(ATTRIBUTES);
				setState(691); 
				((AttributeListItemContext)_localctx).items = attribute_identifier_list();
				setState(694);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(692); 
					match(AND);
					setState(693); 
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
		enterRule(_localctx, 36, RULE_abstract_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698); 
			match(DEFINE);
			setState(699); 
			((Abstract_method_declarationContext)_localctx).name = method_identifier();
			setState(700); 
			match(AS);
			setState(701); 
			match(ABSTRACT);
			setState(702); 
			match(METHOD);
			setState(705);
			_la = _input.LA(1);
			if (_la==RECEIVING) {
				{
				setState(703); 
				match(RECEIVING);
				setState(704); 
				((Abstract_method_declarationContext)_localctx).args = full_argument_list();
				}
			}

			setState(709);
			_la = _input.LA(1);
			if (_la==RETURNING) {
				{
				setState(707); 
				match(RETURNING);
				setState(708); 
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
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public TerminalNode RECEIVING() { return getToken(EParser.RECEIVING, 0); }
		public TerminalNode RETURNING() { return getToken(EParser.RETURNING, 0); }
		public Full_argument_listContext full_argument_list() {
			return getRuleContext(Full_argument_listContext.class,0);
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
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterConcrete_method_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitConcrete_method_declaration(this);
		}
	}

	public final Concrete_method_declarationContext concrete_method_declaration() throws RecognitionException {
		Concrete_method_declarationContext _localctx = new Concrete_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_concrete_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(711); 
			match(DEFINE);
			setState(712); 
			((Concrete_method_declarationContext)_localctx).name = method_identifier();
			setState(713); 
			match(AS);
			setState(714); 
			match(METHOD);
			setState(717);
			_la = _input.LA(1);
			if (_la==RECEIVING) {
				{
				setState(715); 
				match(RECEIVING);
				setState(716); 
				((Concrete_method_declarationContext)_localctx).args = full_argument_list();
				}
			}

			setState(721);
			_la = _input.LA(1);
			if (_la==RETURNING) {
				{
				setState(719); 
				match(RETURNING);
				setState(720); 
				((Concrete_method_declarationContext)_localctx).typ = typedef(0);
				}
			}

			setState(723); 
			match(DOING);
			setState(724); 
			match(COLON);
			setState(725); 
			indent();
			setState(726); 
			((Concrete_method_declarationContext)_localctx).stmts = statement_list();
			setState(727); 
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
		enterRule(_localctx, 40, RULE_native_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(729); 
			match(DEFINE);
			setState(730); 
			((Native_method_declarationContext)_localctx).name = method_identifier();
			setState(731); 
			match(AS);
			setState(733);
			_la = _input.LA(1);
			if (_la==NATIVE) {
				{
				setState(732); 
				match(NATIVE);
				}
			}

			setState(735); 
			match(METHOD);
			setState(738);
			_la = _input.LA(1);
			if (_la==RECEIVING) {
				{
				setState(736); 
				match(RECEIVING);
				setState(737); 
				((Native_method_declarationContext)_localctx).args = full_argument_list();
				}
			}

			setState(742);
			_la = _input.LA(1);
			if (_la==RETURNING) {
				{
				setState(740); 
				match(RETURNING);
				setState(741); 
				((Native_method_declarationContext)_localctx).typ = category_or_any_type();
				}
			}

			setState(744); 
			match(DOING);
			setState(745); 
			match(COLON);
			setState(746); 
			indent();
			setState(747); 
			((Native_method_declarationContext)_localctx).stmts = native_statement_list();
			setState(748); 
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
		enterRule(_localctx, 42, RULE_test_method_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(750); 
			match(DEFINE);
			setState(751); 
			((Test_method_declarationContext)_localctx).name = match(TEXT_LITERAL);
			setState(752); 
			match(AS);
			setState(753); 
			match(TEST);
			setState(754); 
			match(METHOD);
			setState(755); 
			match(DOING);
			setState(756); 
			match(COLON);
			setState(757); 
			indent();
			setState(758); 
			((Test_method_declarationContext)_localctx).stmts = statement_list();
			setState(759); 
			dedent();
			setState(760); 
			lfp();
			setState(761); 
			match(AND);
			setState(762); 
			match(VERIFYING);
			setState(769);
			switch (_input.LA(1)) {
			case COLON:
				{
				{
				setState(763); 
				match(COLON);
				setState(764); 
				indent();
				setState(765); 
				((Test_method_declarationContext)_localctx).exps = assertion_list();
				setState(766); 
				dedent();
				}
				}
				break;
			case SYMBOL_IDENTIFIER:
				{
				setState(768); 
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
		enterRule(_localctx, 44, RULE_assertion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(771); 
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
		enterRule(_localctx, 46, RULE_full_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(773); 
			((Full_argument_listContext)_localctx).items = argument_list();
			setState(776);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(774); 
				match(AND);
				setState(775); 
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
		enterRule(_localctx, 48, RULE_typed_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(778); 
			((Typed_argumentContext)_localctx).typ = category_or_any_type();
			setState(779); 
			((Typed_argumentContext)_localctx).name = variable_identifier();
			setState(781);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(780); 
				((Typed_argumentContext)_localctx).attrs = attribute_list();
				}
			}

			setState(785);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(783); 
				match(EQ);
				setState(784); 
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
		enterRule(_localctx, 50, RULE_statement);
		try {
			setState(806);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				_localctx = new AssignInstanceStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(787); 
				((AssignInstanceStatementContext)_localctx).stmt = assign_instance_statement();
				}
				break;
			case 2:
				_localctx = new MethodCallStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(788); 
				((MethodCallStatementContext)_localctx).stmt = method_call_statement();
				}
				break;
			case 3:
				_localctx = new AssignTupleStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(789); 
				((AssignTupleStatementContext)_localctx).stmt = assign_tuple_statement();
				}
				break;
			case 4:
				_localctx = new StoreStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(790); 
				((StoreStatementContext)_localctx).stmt = store_statement();
				}
				break;
			case 5:
				_localctx = new FlushStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(791); 
				((FlushStatementContext)_localctx).stmt = flush_statement();
				}
				break;
			case 6:
				_localctx = new BreakStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(792); 
				((BreakStatementContext)_localctx).stmt = break_statement();
				}
				break;
			case 7:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(793); 
				((ReturnStatementContext)_localctx).stmt = return_statement();
				}
				break;
			case 8:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(794); 
				((IfStatementContext)_localctx).stmt = if_statement();
				}
				break;
			case 9:
				_localctx = new SwitchStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(795); 
				((SwitchStatementContext)_localctx).stmt = switch_statement();
				}
				break;
			case 10:
				_localctx = new ForEachStatementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(796); 
				((ForEachStatementContext)_localctx).stmt = for_each_statement();
				}
				break;
			case 11:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(797); 
				((WhileStatementContext)_localctx).stmt = while_statement();
				}
				break;
			case 12:
				_localctx = new DoWhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(798); 
				((DoWhileStatementContext)_localctx).stmt = do_while_statement();
				}
				break;
			case 13:
				_localctx = new RaiseStatementContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(799); 
				((RaiseStatementContext)_localctx).stmt = raise_statement();
				}
				break;
			case 14:
				_localctx = new TryStatementContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(800); 
				((TryStatementContext)_localctx).stmt = try_statement();
				}
				break;
			case 15:
				_localctx = new WriteStatementContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(801); 
				((WriteStatementContext)_localctx).stmt = write_statement();
				}
				break;
			case 16:
				_localctx = new WithResourceStatementContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(802); 
				((WithResourceStatementContext)_localctx).stmt = with_resource_statement();
				}
				break;
			case 17:
				_localctx = new WithSingletonStatementContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(803); 
				((WithSingletonStatementContext)_localctx).stmt = with_singleton_statement();
				}
				break;
			case 18:
				_localctx = new ClosureStatementContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(804); 
				((ClosureStatementContext)_localctx).decl = concrete_method_declaration();
				}
				break;
			case 19:
				_localctx = new CommentStatementContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(805); 
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
		enterRule(_localctx, 52, RULE_flush_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(808); 
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
		public TerminalNode DELETE() { return getToken(EParser.DELETE, 0); }
		public List<Expression_listContext> expression_list() {
			return getRuleContexts(Expression_listContext.class);
		}
		public Expression_listContext expression_list(int i) {
			return getRuleContext(Expression_listContext.class,i);
		}
		public TerminalNode STORE() { return getToken(EParser.STORE, 0); }
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
		enterRule(_localctx, 54, RULE_store_statement);
		try {
			setState(820);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(810); 
				match(DELETE);
				setState(811); 
				((Store_statementContext)_localctx).to_del = expression_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(812); 
				match(STORE);
				setState(813); 
				((Store_statementContext)_localctx).to_add = expression_list();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(814); 
				match(DELETE);
				setState(815); 
				((Store_statementContext)_localctx).to_del = expression_list();
				setState(816); 
				match(AND);
				setState(817); 
				match(STORE);
				setState(818); 
				((Store_statementContext)_localctx).to_add = expression_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
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
		public Unresolved_expressionContext exp;
		public Argument_assignment_listContext args;
		public Unresolved_expressionContext unresolved_expression() {
			return getRuleContext(Unresolved_expressionContext.class,0);
		}
		public Argument_assignment_listContext argument_assignment_list() {
			return getRuleContext(Argument_assignment_listContext.class,0);
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
		enterRule(_localctx, 56, RULE_method_call_statement);
		try {
			setState(827);
			switch (_input.LA(1)) {
			case SYMBOL_IDENTIFIER:
			case TYPE_IDENTIFIER:
			case VARIABLE_IDENTIFIER:
				_localctx = new UnresolvedWithArgsStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(822); 
				((UnresolvedWithArgsStatementContext)_localctx).exp = unresolved_expression(0);
				setState(824);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(823); 
					((UnresolvedWithArgsStatementContext)_localctx).args = argument_assignment_list();
					}
					break;
				}
				}
				break;
			case INVOKE:
				_localctx = new InvokeStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(826); 
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
		enterRule(_localctx, 58, RULE_with_resource_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(829); 
			match(WITH);
			setState(830); 
			((With_resource_statementContext)_localctx).stmt = assign_variable_statement();
			setState(831); 
			match(COMMA);
			setState(832); 
			match(DO);
			setState(833); 
			match(COLON);
			setState(834); 
			indent();
			setState(835); 
			((With_resource_statementContext)_localctx).stmts = statement_list();
			setState(836); 
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
		enterRule(_localctx, 60, RULE_with_singleton_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(838); 
			match(WITH);
			setState(839); 
			((With_singleton_statementContext)_localctx).typ = type_identifier();
			setState(840); 
			match(COMMA);
			setState(841); 
			match(DO);
			setState(842); 
			match(COLON);
			setState(843); 
			indent();
			setState(844); 
			((With_singleton_statementContext)_localctx).stmts = statement_list();
			setState(845); 
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
		enterRule(_localctx, 62, RULE_switch_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(847); 
			match(SWITCH);
			setState(848); 
			match(ON);
			setState(849); 
			((Switch_statementContext)_localctx).exp = expression(0);
			setState(850); 
			match(COLON);
			setState(851); 
			indent();
			setState(852); 
			((Switch_statementContext)_localctx).cases = switch_case_statement_list();
			setState(860);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(853); 
				lfp();
				setState(854); 
				match(OTHERWISE);
				setState(855); 
				match(COLON);
				setState(856); 
				indent();
				setState(857); 
				((Switch_statementContext)_localctx).stmts = statement_list();
				setState(858); 
				dedent();
				}
				break;
			}
			setState(862); 
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
		enterRule(_localctx, 64, RULE_switch_case_statement);
		try {
			setState(879);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				_localctx = new AtomicSwitchCaseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(864); 
				match(WHEN);
				setState(865); 
				((AtomicSwitchCaseContext)_localctx).exp = atomic_literal();
				setState(866); 
				match(COLON);
				setState(867); 
				indent();
				setState(868); 
				((AtomicSwitchCaseContext)_localctx).stmts = statement_list();
				setState(869); 
				dedent();
				}
				break;
			case 2:
				_localctx = new CollectionSwitchCaseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(871); 
				match(WHEN);
				setState(872); 
				match(IN);
				setState(873); 
				((CollectionSwitchCaseContext)_localctx).exp = literal_collection();
				setState(874); 
				match(COLON);
				setState(875); 
				indent();
				setState(876); 
				((CollectionSwitchCaseContext)_localctx).stmts = statement_list();
				setState(877); 
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
		enterRule(_localctx, 66, RULE_for_each_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(881); 
			match(FOR);
			setState(882); 
			match(EACH);
			setState(883); 
			((For_each_statementContext)_localctx).name1 = variable_identifier();
			setState(886);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(884); 
				match(COMMA);
				setState(885); 
				((For_each_statementContext)_localctx).name2 = variable_identifier();
				}
			}

			setState(888); 
			match(IN);
			setState(889); 
			((For_each_statementContext)_localctx).source = expression(0);
			setState(890); 
			match(COLON);
			setState(891); 
			indent();
			setState(892); 
			((For_each_statementContext)_localctx).stmts = statement_list();
			setState(893); 
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
		enterRule(_localctx, 68, RULE_do_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(895); 
			match(DO);
			setState(896); 
			match(COLON);
			setState(897); 
			indent();
			setState(898); 
			((Do_while_statementContext)_localctx).stmts = statement_list();
			setState(899); 
			dedent();
			setState(900); 
			lfp();
			setState(901); 
			match(WHILE);
			setState(902); 
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
		enterRule(_localctx, 70, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(904); 
			match(WHILE);
			setState(905); 
			((While_statementContext)_localctx).exp = expression(0);
			setState(906); 
			match(COLON);
			setState(907); 
			indent();
			setState(908); 
			((While_statementContext)_localctx).stmts = statement_list();
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
		enterRule(_localctx, 72, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(911); 
			match(IF);
			setState(912); 
			((If_statementContext)_localctx).exp = expression(0);
			setState(913); 
			match(COLON);
			setState(914); 
			indent();
			setState(915); 
			((If_statementContext)_localctx).stmts = statement_list();
			setState(916); 
			dedent();
			setState(920);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(917); 
				lfp();
				setState(918); 
				((If_statementContext)_localctx).elseIfs = else_if_statement_list(0);
				}
				break;
			}
			setState(929);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(922); 
				lfp();
				setState(923); 
				match(ELSE);
				setState(924); 
				match(COLON);
				setState(925); 
				indent();
				setState(926); 
				((If_statementContext)_localctx).elseStmts = statement_list();
				setState(927); 
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
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_else_if_statement_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ElseIfStatementListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(932); 
			match(ELSE);
			setState(933); 
			match(IF);
			setState(934); 
			((ElseIfStatementListContext)_localctx).exp = expression(0);
			setState(935); 
			match(COLON);
			setState(936); 
			indent();
			setState(937); 
			((ElseIfStatementListContext)_localctx).stmts = statement_list();
			setState(938); 
			dedent();
			}
			_ctx.stop = _input.LT(-1);
			setState(952);
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
					setState(940);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(941); 
					lfp();
					setState(942); 
					match(ELSE);
					setState(943); 
					match(IF);
					setState(944); 
					((ElseIfStatementListItemContext)_localctx).exp = expression(0);
					setState(945); 
					match(COLON);
					setState(946); 
					indent();
					setState(947); 
					((ElseIfStatementListItemContext)_localctx).stmts = statement_list();
					setState(948); 
					dedent();
					}
					} 
				}
				setState(954);
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
		enterRule(_localctx, 76, RULE_raise_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(955); 
			match(RAISE);
			setState(956); 
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
		enterRule(_localctx, 78, RULE_try_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(958); 
			match(SWITCH);
			setState(959); 
			match(ON);
			setState(960); 
			((Try_statementContext)_localctx).name = variable_identifier();
			setState(961); 
			match(DOING);
			setState(962); 
			match(COLON);
			setState(963); 
			indent();
			setState(964); 
			((Try_statementContext)_localctx).stmts = statement_list();
			setState(965); 
			dedent();
			setState(966); 
			lfs();
			setState(968);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(967); 
				((Try_statementContext)_localctx).handlers = catch_statement_list();
				}
				break;
			}
			setState(981);
			_la = _input.LA(1);
			if (_la==OTHERWISE || _la==WHEN) {
				{
				setState(973);
				switch (_input.LA(1)) {
				case OTHERWISE:
					{
					setState(970); 
					match(OTHERWISE);
					}
					break;
				case WHEN:
					{
					{
					setState(971); 
					match(WHEN);
					setState(972); 
					match(ANY);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(975); 
				match(COLON);
				setState(976); 
				indent();
				setState(977); 
				((Try_statementContext)_localctx).anyStmts = statement_list();
				setState(978); 
				dedent();
				setState(979); 
				lfs();
				}
			}

			setState(990);
			_la = _input.LA(1);
			if (_la==ALWAYS) {
				{
				setState(983); 
				match(ALWAYS);
				setState(984); 
				match(COLON);
				setState(985); 
				indent();
				setState(986); 
				((Try_statementContext)_localctx).finalStmts = statement_list();
				setState(987); 
				dedent();
				setState(988); 
				lfs();
				}
			}

			setState(992); 
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
		enterRule(_localctx, 80, RULE_catch_statement);
		try {
			setState(1013);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				_localctx = new CatchAtomicStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(994); 
				match(WHEN);
				setState(995); 
				((CatchAtomicStatementContext)_localctx).name = symbol_identifier();
				setState(996); 
				match(COLON);
				setState(997); 
				indent();
				setState(998); 
				((CatchAtomicStatementContext)_localctx).stmts = statement_list();
				setState(999); 
				dedent();
				setState(1000); 
				lfs();
				}
				break;
			case 2:
				_localctx = new CatchCollectionStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1002); 
				match(WHEN);
				setState(1003); 
				match(IN);
				setState(1004); 
				match(LBRAK);
				setState(1005); 
				((CatchCollectionStatementContext)_localctx).exp = symbol_list();
				setState(1006); 
				match(RBRAK);
				setState(1007); 
				match(COLON);
				setState(1008); 
				indent();
				setState(1009); 
				((CatchCollectionStatementContext)_localctx).stmts = statement_list();
				setState(1010); 
				dedent();
				setState(1011); 
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
		enterRule(_localctx, 82, RULE_break_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1015); 
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
		enterRule(_localctx, 84, RULE_return_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1017); 
			match(RETURN);
			setState(1019);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << METHOD_T) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (EXECUTE - 98)) | (1L << (FETCH - 98)) | (1L << (INVOKE - 98)) | (1L << (MUTABLE - 98)) | (1L << (NOT - 98)) | (1L << (NOTHING - 98)) | (1L << (READ - 98)) | (1L << (SELF - 98)) | (1L << (SORTED - 98)) | (1L << (THIS - 98)) | (1L << (BOOLEAN_LITERAL - 98)) | (1L << (CHAR_LITERAL - 98)) | (1L << (MIN_INTEGER - 98)) | (1L << (MAX_INTEGER - 98)) | (1L << (SYMBOL_IDENTIFIER - 98)) | (1L << (TYPE_IDENTIFIER - 98)))) != 0) || ((((_la - 162)) & ~0x3f) == 0 && ((1L << (_la - 162)) & ((1L << (VARIABLE_IDENTIFIER - 162)) | (1L << (TEXT_LITERAL - 162)) | (1L << (UUID_LITERAL - 162)) | (1L << (INTEGER_LITERAL - 162)) | (1L << (HEXA_LITERAL - 162)) | (1L << (DECIMAL_LITERAL - 162)) | (1L << (DATETIME_LITERAL - 162)) | (1L << (TIME_LITERAL - 162)) | (1L << (DATE_LITERAL - 162)) | (1L << (PERIOD_LITERAL - 162)))) != 0)) {
				{
				setState(1018); 
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
	public static class FetchStoreExpressionContext extends ExpressionContext {
		public Fetch_store_expressionContext exp;
		public Fetch_store_expressionContext fetch_store_expression() {
			return getRuleContext(Fetch_store_expressionContext.class,0);
		}
		public FetchStoreExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterFetchStoreExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitFetchStoreExpression(this);
		}
	}
	public static class ContainsAllExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode CONTAINS() { return getToken(EParser.CONTAINS, 0); }
		public TerminalNode ALL() { return getToken(EParser.ALL, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ContainsAllExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterContainsAllExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitContainsAllExpression(this);
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
	public static class MethodCallExpressionContext extends ExpressionContext {
		public Unresolved_expressionContext exp;
		public Argument_assignment_listContext args;
		public Unresolved_expressionContext unresolved_expression() {
			return getRuleContext(Unresolved_expressionContext.class,0);
		}
		public Argument_assignment_listContext argument_assignment_list() {
			return getRuleContext(Argument_assignment_listContext.class,0);
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
	public static class ClosureExpressionContext extends ExpressionContext {
		public Method_identifierContext name;
		public TerminalNode METHOD_T() { return getToken(EParser.METHOD_T, 0); }
		public TerminalNode COLON() { return getToken(EParser.COLON, 0); }
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
	public static class NotContainsAnyExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode NOT() { return getToken(EParser.NOT, 0); }
		public TerminalNode CONTAINS() { return getToken(EParser.CONTAINS, 0); }
		public TerminalNode ANY() { return getToken(EParser.ANY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public NotContainsAnyExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterNotContainsAnyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitNotContainsAnyExpression(this);
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
	public static class NotContainsAllExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode NOT() { return getToken(EParser.NOT, 0); }
		public TerminalNode CONTAINS() { return getToken(EParser.CONTAINS, 0); }
		public TerminalNode ALL() { return getToken(EParser.ALL, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public NotContainsAllExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterNotContainsAllExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitNotContainsAllExpression(this);
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
	public static class ContainsAnyExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode CONTAINS() { return getToken(EParser.CONTAINS, 0); }
		public TerminalNode ANY() { return getToken(EParser.ANY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ContainsAnyExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterContainsAnyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitContainsAnyExpression(this);
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
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1049);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				_localctx = new MinusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1022); 
				match(MINUS);
				setState(1023); 
				((MinusExpressionContext)_localctx).exp = expression(42);
				}
				break;
			case 2:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1024); 
				match(NOT);
				setState(1025); 
				((NotExpressionContext)_localctx).exp = expression(41);
				}
				break;
			case 3:
				{
				_localctx = new CodeExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1026); 
				match(CODE);
				setState(1027); 
				match(COLON);
				setState(1028); 
				((CodeExpressionContext)_localctx).exp = expression(14);
				}
				break;
			case 4:
				{
				_localctx = new InstanceExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1029); 
				((InstanceExpressionContext)_localctx).exp = instance_expression(0);
				}
				break;
			case 5:
				{
				_localctx = new UnresolvedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1030); 
				((UnresolvedExpressionContext)_localctx).exp = unresolved_expression(0);
				}
				break;
			case 6:
				{
				_localctx = new MethodCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1031); 
				((MethodCallExpressionContext)_localctx).exp = unresolved_expression(0);
				setState(1032); 
				((MethodCallExpressionContext)_localctx).args = argument_assignment_list();
				}
				break;
			case 7:
				{
				_localctx = new ExecuteExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1034); 
				match(EXECUTE);
				setState(1035); 
				match(COLON);
				setState(1036); 
				((ExecuteExpressionContext)_localctx).name = variable_identifier();
				}
				break;
			case 8:
				{
				_localctx = new ClosureExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1037); 
				match(METHOD_T);
				setState(1038); 
				match(COLON);
				setState(1039); 
				((ClosureExpressionContext)_localctx).name = method_identifier();
				}
				break;
			case 9:
				{
				_localctx = new BlobExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1040); 
				((BlobExpressionContext)_localctx).exp = blob_expression();
				}
				break;
			case 10:
				{
				_localctx = new DocumentExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1041); 
				((DocumentExpressionContext)_localctx).exp = document_expression();
				}
				break;
			case 11:
				{
				_localctx = new ConstructorExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1042); 
				((ConstructorExpressionContext)_localctx).exp = constructor_expression();
				}
				break;
			case 12:
				{
				_localctx = new FetchStoreExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1043); 
				((FetchStoreExpressionContext)_localctx).exp = fetch_store_expression();
				}
				break;
			case 13:
				{
				_localctx = new ReadAllExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1044); 
				((ReadAllExpressionContext)_localctx).exp = read_all_expression();
				}
				break;
			case 14:
				{
				_localctx = new ReadOneExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1045); 
				((ReadOneExpressionContext)_localctx).exp = read_one_expression();
				}
				break;
			case 15:
				{
				_localctx = new SortedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1046); 
				((SortedExpressionContext)_localctx).exp = sorted_expression();
				}
				break;
			case 16:
				{
				_localctx = new AmbiguousExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1047); 
				((AmbiguousExpressionContext)_localctx).exp = ambiguous_expression();
				}
				break;
			case 17:
				{
				_localctx = new InvocationExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1048); 
				((InvocationExpressionContext)_localctx).exp = invocation_expression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1156);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1154);
					switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplyExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((MultiplyExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1051);
						if (!(precpred(_ctx, 40))) throw new FailedPredicateException(this, "precpred(_ctx, 40)");
						setState(1052); 
						multiply();
						setState(1053); 
						((MultiplyExpressionContext)_localctx).right = expression(41);
						}
						break;
					case 2:
						{
						_localctx = new DivideExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((DivideExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1055);
						if (!(precpred(_ctx, 39))) throw new FailedPredicateException(this, "precpred(_ctx, 39)");
						setState(1056); 
						divide();
						setState(1057); 
						((DivideExpressionContext)_localctx).right = expression(40);
						}
						break;
					case 3:
						{
						_localctx = new ModuloExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ModuloExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1059);
						if (!(precpred(_ctx, 38))) throw new FailedPredicateException(this, "precpred(_ctx, 38)");
						setState(1060); 
						modulo();
						setState(1061); 
						((ModuloExpressionContext)_localctx).right = expression(39);
						}
						break;
					case 4:
						{
						_localctx = new IntDivideExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((IntDivideExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1063);
						if (!(precpred(_ctx, 37))) throw new FailedPredicateException(this, "precpred(_ctx, 37)");
						setState(1064); 
						idivide();
						setState(1065); 
						((IntDivideExpressionContext)_localctx).right = expression(38);
						}
						break;
					case 5:
						{
						_localctx = new AddExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((AddExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1067);
						if (!(precpred(_ctx, 36))) throw new FailedPredicateException(this, "precpred(_ctx, 36)");
						setState(1068);
						((AddExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((AddExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(1069); 
						((AddExpressionContext)_localctx).right = expression(37);
						}
						break;
					case 6:
						{
						_localctx = new LessThanExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((LessThanExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1070);
						if (!(precpred(_ctx, 35))) throw new FailedPredicateException(this, "precpred(_ctx, 35)");
						setState(1071); 
						match(LT);
						setState(1072); 
						((LessThanExpressionContext)_localctx).right = expression(36);
						}
						break;
					case 7:
						{
						_localctx = new LessThanOrEqualExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((LessThanOrEqualExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1073);
						if (!(precpred(_ctx, 34))) throw new FailedPredicateException(this, "precpred(_ctx, 34)");
						setState(1074); 
						match(LTE);
						setState(1075); 
						((LessThanOrEqualExpressionContext)_localctx).right = expression(35);
						}
						break;
					case 8:
						{
						_localctx = new GreaterThanExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((GreaterThanExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1076);
						if (!(precpred(_ctx, 33))) throw new FailedPredicateException(this, "precpred(_ctx, 33)");
						setState(1077); 
						match(GT);
						setState(1078); 
						((GreaterThanExpressionContext)_localctx).right = expression(34);
						}
						break;
					case 9:
						{
						_localctx = new GreaterThanOrEqualExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((GreaterThanOrEqualExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1079);
						if (!(precpred(_ctx, 32))) throw new FailedPredicateException(this, "precpred(_ctx, 32)");
						setState(1080); 
						match(GTE);
						setState(1081); 
						((GreaterThanOrEqualExpressionContext)_localctx).right = expression(33);
						}
						break;
					case 10:
						{
						_localctx = new EqualsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((EqualsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1082);
						if (!(precpred(_ctx, 29))) throw new FailedPredicateException(this, "precpred(_ctx, 29)");
						setState(1083); 
						match(EQ);
						setState(1084); 
						((EqualsExpressionContext)_localctx).right = expression(30);
						}
						break;
					case 11:
						{
						_localctx = new NotEqualsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((NotEqualsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1085);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(1086); 
						match(LTGT);
						setState(1087); 
						((NotEqualsExpressionContext)_localctx).right = expression(29);
						}
						break;
					case 12:
						{
						_localctx = new RoughlyEqualsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((RoughlyEqualsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1088);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(1089); 
						match(TILDE);
						setState(1090); 
						((RoughlyEqualsExpressionContext)_localctx).right = expression(28);
						}
						break;
					case 13:
						{
						_localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((OrExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1091);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(1092); 
						match(OR);
						setState(1093); 
						((OrExpressionContext)_localctx).right = expression(27);
						}
						break;
					case 14:
						{
						_localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((AndExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1094);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(1095); 
						match(AND);
						setState(1096); 
						((AndExpressionContext)_localctx).right = expression(26);
						}
						break;
					case 15:
						{
						_localctx = new TernaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((TernaryExpressionContext)_localctx).ifTrue = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1097);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(1098); 
						match(IF);
						setState(1099); 
						((TernaryExpressionContext)_localctx).test = expression(0);
						setState(1100); 
						match(ELSE);
						setState(1101); 
						((TernaryExpressionContext)_localctx).ifFalse = expression(25);
						}
						break;
					case 16:
						{
						_localctx = new InExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((InExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1103);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(1104); 
						match(IN);
						setState(1105); 
						((InExpressionContext)_localctx).right = expression(23);
						}
						break;
					case 17:
						{
						_localctx = new ContainsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ContainsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1106);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1107); 
						match(CONTAINS);
						setState(1108); 
						((ContainsExpressionContext)_localctx).right = expression(22);
						}
						break;
					case 18:
						{
						_localctx = new ContainsAllExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ContainsAllExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1109);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1110); 
						match(CONTAINS);
						setState(1111); 
						match(ALL);
						setState(1112); 
						((ContainsAllExpressionContext)_localctx).right = expression(21);
						}
						break;
					case 19:
						{
						_localctx = new ContainsAnyExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ContainsAnyExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1113);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1114); 
						match(CONTAINS);
						setState(1115); 
						match(ANY);
						setState(1116); 
						((ContainsAnyExpressionContext)_localctx).right = expression(20);
						}
						break;
					case 20:
						{
						_localctx = new NotInExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((NotInExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1117);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1118); 
						match(NOT);
						setState(1119); 
						match(IN);
						setState(1120); 
						((NotInExpressionContext)_localctx).right = expression(19);
						}
						break;
					case 21:
						{
						_localctx = new NotContainsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((NotContainsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1121);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1122); 
						match(NOT);
						setState(1123); 
						match(CONTAINS);
						setState(1124); 
						((NotContainsExpressionContext)_localctx).right = expression(18);
						}
						break;
					case 22:
						{
						_localctx = new NotContainsAllExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((NotContainsAllExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1125);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1126); 
						match(NOT);
						setState(1127); 
						match(CONTAINS);
						setState(1128); 
						match(ALL);
						setState(1129); 
						((NotContainsAllExpressionContext)_localctx).right = expression(17);
						}
						break;
					case 23:
						{
						_localctx = new NotContainsAnyExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((NotContainsAnyExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1130);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1131); 
						match(NOT);
						setState(1132); 
						match(CONTAINS);
						setState(1133); 
						match(ANY);
						setState(1134); 
						((NotContainsAnyExpressionContext)_localctx).right = expression(16);
						}
						break;
					case 24:
						{
						_localctx = new IteratorExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((IteratorExpressionContext)_localctx).exp = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1135);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1136); 
						match(FOR);
						setState(1137); 
						match(EACH);
						setState(1138); 
						((IteratorExpressionContext)_localctx).name = variable_identifier();
						setState(1139); 
						match(IN);
						setState(1140); 
						((IteratorExpressionContext)_localctx).source = expression(2);
						}
						break;
					case 25:
						{
						_localctx = new IsNotExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((IsNotExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1142);
						if (!(precpred(_ctx, 31))) throw new FailedPredicateException(this, "precpred(_ctx, 31)");
						setState(1143); 
						match(IS);
						setState(1144); 
						match(NOT);
						setState(1145); 
						((IsNotExpressionContext)_localctx).right = is_expression();
						}
						break;
					case 26:
						{
						_localctx = new IsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((IsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1146);
						if (!(precpred(_ctx, 30))) throw new FailedPredicateException(this, "precpred(_ctx, 30)");
						setState(1147); 
						match(IS);
						setState(1148); 
						((IsExpressionContext)_localctx).right = is_expression();
						}
						break;
					case 27:
						{
						_localctx = new CastExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((CastExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1149);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(1150); 
						match(AS);
						setState(1151); 
						((CastExpressionContext)_localctx).right = category_or_any_type();
						}
						break;
					case 28:
						{
						_localctx = new FilteredListExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((FilteredListExpressionContext)_localctx).src = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1152);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1153); 
						filtered_list_suffix();
						}
						break;
					}
					} 
				}
				setState(1158);
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
		int _startState = 88;
		enterRecursionRule(_localctx, 88, RULE_unresolved_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new UnresolvedIdentifierContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1160); 
			((UnresolvedIdentifierContext)_localctx).name = identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(1166);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new UnresolvedSelectorContext(new Unresolved_expressionContext(_parentctx, _parentState));
					((UnresolvedSelectorContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_unresolved_expression);
					setState(1162);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1163); 
					((UnresolvedSelectorContext)_localctx).selector = unresolved_selector();
					}
					} 
				}
				setState(1168);
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
		enterRule(_localctx, 90, RULE_unresolved_selector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1169);
			if (!(this.wasNot(EParser.WS))) throw new FailedPredicateException(this, "$parser.wasNot(EParser.WS)");
			setState(1170); 
			match(DOT);
			setState(1171); 
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
		public TerminalNode INVOKE() { return getToken(EParser.INVOKE, 0); }
		public TerminalNode COLON() { return getToken(EParser.COLON, 0); }
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
		enterRule(_localctx, 92, RULE_invocation_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1173); 
			match(INVOKE);
			setState(1174); 
			match(COLON);
			setState(1175); 
			((Invocation_expressionContext)_localctx).name = variable_identifier();
			setState(1176); 
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
		enterRule(_localctx, 94, RULE_invocation_trailer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1178);
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

			setState(1181); 
			((SelectableExpressionContext)_localctx).parent = selectable_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(1187);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SelectorExpressionContext(new Instance_expressionContext(_parentctx, _parentState));
					((SelectorExpressionContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_instance_expression);
					setState(1183);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1184); 
					((SelectorExpressionContext)_localctx).selector = instance_selector();
					}
					} 
				}
				setState(1189);
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
		public Variable_identifierContext name;
		public TerminalNode DOT() { return getToken(EParser.DOT, 0); }
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
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
		enterRule(_localctx, 98, RULE_instance_selector);
		try {
			setState(1203);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				_localctx = new MemberSelectorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1190);
				if (!(this.wasNot(EParser.WS))) throw new FailedPredicateException(this, "$parser.wasNot(EParser.WS)");
				setState(1191); 
				match(DOT);
				setState(1192); 
				((MemberSelectorContext)_localctx).name = variable_identifier();
				}
				break;
			case 2:
				_localctx = new SliceSelectorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1193);
				if (!(this.wasNot(EParser.WS))) throw new FailedPredicateException(this, "$parser.wasNot(EParser.WS)");
				setState(1194); 
				match(LBRAK);
				setState(1195); 
				((SliceSelectorContext)_localctx).xslice = slice_arguments();
				setState(1196); 
				match(RBRAK);
				}
				break;
			case 3:
				_localctx = new ItemSelectorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1198);
				if (!(this.wasNot(EParser.WS))) throw new FailedPredicateException(this, "$parser.wasNot(EParser.WS)");
				setState(1199); 
				match(LBRAK);
				setState(1200); 
				((ItemSelectorContext)_localctx).exp = expression(0);
				setState(1201); 
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

	public static class Document_expressionContext extends ParserRuleContext {
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
		enterRule(_localctx, 100, RULE_document_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1205); 
			match(DOCUMENT);
			setState(1208);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(1206); 
				match(FROM);
				setState(1207); 
				expression(0);
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
		enterRule(_localctx, 102, RULE_blob_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1210); 
			match(BLOB);
			setState(1211); 
			match(FROM);
			setState(1212); 
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
		public ExpressionContext firstArg;
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
		enterRule(_localctx, 104, RULE_constructor_expression);
		int _la;
		try {
			setState(1235);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				_localctx = new ConstructorFromContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1214); 
				((ConstructorFromContext)_localctx).typ = mutable_category_type();
				setState(1215); 
				match(FROM);
				setState(1216); 
				((ConstructorFromContext)_localctx).firstArg = expression(0);
				setState(1225);
				switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
				case 1:
					{
					setState(1218);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(1217); 
						match(COMMA);
						}
					}

					setState(1220); 
					((ConstructorFromContext)_localctx).args = with_argument_assignment_list(0);
					setState(1223);
					switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
					case 1:
						{
						setState(1221); 
						match(AND);
						setState(1222); 
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
				setState(1227); 
				((ConstructorNoFromContext)_localctx).typ = mutable_category_type();
				setState(1233);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(1228); 
					((ConstructorNoFromContext)_localctx).args = with_argument_assignment_list(0);
					setState(1231);
					switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
					case 1:
						{
						setState(1229); 
						match(AND);
						setState(1230); 
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
		enterRule(_localctx, 106, RULE_write_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1237); 
			match(WRITE);
			setState(1238); 
			((Write_statementContext)_localctx).what = expression(0);
			setState(1239); 
			match(TO);
			setState(1240); 
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
		enterRule(_localctx, 108, RULE_ambiguous_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1242); 
			((Ambiguous_expressionContext)_localctx).method = unresolved_expression(0);
			setState(1243); 
			match(MINUS);
			setState(1244); 
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
		public TerminalNode WITH() { return getToken(EParser.WITH, 0); }
		public TerminalNode WHERE() { return getToken(EParser.WHERE, 0); }
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
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterFiltered_list_suffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitFiltered_list_suffix(this);
		}
	}

	public final Filtered_list_suffixContext filtered_list_suffix() throws RecognitionException {
		Filtered_list_suffixContext _localctx = new Filtered_list_suffixContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_filtered_list_suffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1246); 
			match(FILTERED);
			setState(1247); 
			match(WITH);
			setState(1248); 
			((Filtered_list_suffixContext)_localctx).name = variable_identifier();
			setState(1249); 
			match(WHERE);
			setState(1250); 
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
		public TerminalNode FETCH() { return getToken(EParser.FETCH, 0); }
		public TerminalNode ONE() { return getToken(EParser.ONE, 0); }
		public TerminalNode WHERE() { return getToken(EParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Mutable_category_typeContext mutable_category_type() {
			return getRuleContext(Mutable_category_typeContext.class,0);
		}
		public FetchOneContext(Fetch_store_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterFetchOne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitFetchOne(this);
		}
	}
	public static class FetchManyContext extends Fetch_store_expressionContext {
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
		public FetchManyContext(Fetch_store_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterFetchMany(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitFetchMany(this);
		}
	}

	public final Fetch_store_expressionContext fetch_store_expression() throws RecognitionException {
		Fetch_store_expressionContext _localctx = new Fetch_store_expressionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_fetch_store_expression);
		int _la;
		try {
			setState(1282);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				_localctx = new FetchOneContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1252); 
				match(FETCH);
				setState(1253); 
				match(ONE);
				{
				setState(1255);
				_la = _input.LA(1);
				if (_la==MUTABLE || _la==TYPE_IDENTIFIER) {
					{
					setState(1254); 
					((FetchOneContext)_localctx).typ = mutable_category_type();
					}
				}

				}
				setState(1257); 
				match(WHERE);
				setState(1258); 
				((FetchOneContext)_localctx).predicate = expression(0);
				}
				break;
			case 2:
				_localctx = new FetchManyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1259); 
				match(FETCH);
				setState(1271);
				switch (_input.LA(1)) {
				case ALL:
					{
					{
					setState(1260); 
					match(ALL);
					setState(1262);
					switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
					case 1:
						{
						setState(1261); 
						((FetchManyContext)_localctx).typ = mutable_category_type();
						}
						break;
					}
					}
					}
					break;
				case LPAR:
				case LBRAK:
				case LCURL:
				case MINUS:
				case LT:
				case METHOD_T:
				case CODE:
				case DOCUMENT:
				case BLOB:
				case EXECUTE:
				case FETCH:
				case INVOKE:
				case MUTABLE:
				case NOT:
				case NOTHING:
				case READ:
				case SELF:
				case SORTED:
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
					{
					{
					setState(1265);
					switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
					case 1:
						{
						setState(1264); 
						((FetchManyContext)_localctx).typ = mutable_category_type();
						}
						break;
					}
					setState(1267); 
					((FetchManyContext)_localctx).xstart = expression(0);
					setState(1268); 
					match(TO);
					setState(1269); 
					((FetchManyContext)_localctx).xstop = expression(0);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1275);
				switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
				case 1:
					{
					setState(1273); 
					match(WHERE);
					setState(1274); 
					((FetchManyContext)_localctx).predicate = expression(0);
					}
					break;
				}
				setState(1280);
				switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
				case 1:
					{
					setState(1277); 
					match(ORDER);
					setState(1278); 
					match(BY);
					setState(1279); 
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
		public TerminalNode SORTED() { return getToken(EParser.SORTED, 0); }
		public List<Instance_expressionContext> instance_expression() {
			return getRuleContexts(Instance_expressionContext.class);
		}
		public Instance_expressionContext instance_expression(int i) {
			return getRuleContext(Instance_expressionContext.class,i);
		}
		public TerminalNode DESC() { return getToken(EParser.DESC, 0); }
		public TerminalNode WITH() { return getToken(EParser.WITH, 0); }
		public TerminalNode AS() { return getToken(EParser.AS, 0); }
		public Key_tokenContext key_token() {
			return getRuleContext(Key_tokenContext.class,0);
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
		enterRule(_localctx, 114, RULE_sorted_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1284); 
			match(SORTED);
			setState(1286);
			_la = _input.LA(1);
			if (_la==DESC) {
				{
				setState(1285); 
				match(DESC);
				}
			}

			setState(1288); 
			((Sorted_expressionContext)_localctx).source = instance_expression(0);
			setState(1294);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(1289); 
				match(WITH);
				setState(1290); 
				((Sorted_expressionContext)_localctx).key = instance_expression(0);
				setState(1291); 
				match(AS);
				setState(1292); 
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
		enterRule(_localctx, 116, RULE_argument_assignment_list);
		try {
			setState(1310);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				_localctx = new ArgumentAssignmentListExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1296);
				if (!(this.was(EParser.WS))) throw new FailedPredicateException(this, "$parser.was(EParser.WS)");
				setState(1297); 
				((ArgumentAssignmentListExpressionContext)_localctx).exp = expression(0);
				setState(1303);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(1298); 
					((ArgumentAssignmentListExpressionContext)_localctx).items = with_argument_assignment_list(0);
					setState(1301);
					switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
					case 1:
						{
						setState(1299); 
						match(AND);
						setState(1300); 
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
				setState(1305); 
				((ArgumentAssignmentListNoExpressionContext)_localctx).items = with_argument_assignment_list(0);
				setState(1308);
				switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					{
					setState(1306); 
					match(AND);
					setState(1307); 
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
		int _startState = 118;
		enterRecursionRule(_localctx, 118, RULE_with_argument_assignment_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ArgumentAssignmentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1313); 
			match(WITH);
			setState(1314); 
			((ArgumentAssignmentListContext)_localctx).item = argument_assignment();
			}
			_ctx.stop = _input.LT(-1);
			setState(1321);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArgumentAssignmentListItemContext(new With_argument_assignment_listContext(_parentctx, _parentState));
					((ArgumentAssignmentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_with_argument_assignment_list);
					setState(1316);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1317); 
					match(COMMA);
					setState(1318); 
					((ArgumentAssignmentListItemContext)_localctx).item = argument_assignment();
					}
					} 
				}
				setState(1323);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
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
		public TerminalNode AS() { return getToken(EParser.AS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
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
		enterRule(_localctx, 120, RULE_argument_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1324); 
			((Argument_assignmentContext)_localctx).exp = expression(0);
			setState(1325); 
			match(AS);
			setState(1326); 
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
		enterRule(_localctx, 122, RULE_assign_instance_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1328); 
			((Assign_instance_statementContext)_localctx).inst = assignable_instance(0);
			setState(1329); 
			assign();
			setState(1330); 
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
		enterRule(_localctx, 124, RULE_child_instance);
		try {
			setState(1340);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				_localctx = new MemberInstanceContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1332);
				if (!(this.wasNot(EParser.WS))) throw new FailedPredicateException(this, "$parser.wasNot(EParser.WS)");
				setState(1333); 
				match(DOT);
				setState(1334); 
				((MemberInstanceContext)_localctx).name = variable_identifier();
				}
				break;
			case 2:
				_localctx = new ItemInstanceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1335);
				if (!(this.wasNot(EParser.WS))) throw new FailedPredicateException(this, "$parser.wasNot(EParser.WS)");
				setState(1336); 
				match(LBRAK);
				setState(1337); 
				((ItemInstanceContext)_localctx).exp = expression(0);
				setState(1338); 
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
		enterRule(_localctx, 126, RULE_assign_tuple_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1342); 
			((Assign_tuple_statementContext)_localctx).items = variable_identifier_list();
			setState(1343); 
			assign();
			setState(1344); 
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
		enterRule(_localctx, 128, RULE_lfs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1349);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1346); 
					match(LF);
					}
					} 
				}
				setState(1351);
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
		enterRule(_localctx, 130, RULE_lfp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1353); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1352); 
				match(LF);
				}
				}
				setState(1355); 
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
		enterRule(_localctx, 132, RULE_indent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1358); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1357); 
				match(LF);
				}
				}
				setState(1360); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LF );
			setState(1362); 
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
		enterRule(_localctx, 134, RULE_dedent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LF) {
				{
				{
				setState(1364); 
				match(LF);
				}
				}
				setState(1369);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1370); 
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
		enterRule(_localctx, 136, RULE_null_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1372); 
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
		enterRule(_localctx, 138, RULE_declaration_list);
		int _la;
		try {
			_localctx = new FullDeclarationListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1375);
			_la = _input.LA(1);
			if (_la==COMMENT || _la==DEFINE) {
				{
				setState(1374); 
				declarations();
				}
			}

			setState(1377); 
			lfs();
			setState(1378); 
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
		enterRule(_localctx, 140, RULE_declarations);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1380); 
			declaration();
			setState(1386);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1381); 
					lfp();
					setState(1382); 
					declaration();
					}
					} 
				}
				setState(1388);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(1389); 
				comment_statement();
				setState(1390); 
				lfp();
				}
				}
				setState(1396);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1402);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(1397); 
				attribute_declaration();
				}
				break;
			case 2:
				{
				setState(1398); 
				category_declaration();
				}
				break;
			case 3:
				{
				setState(1399); 
				resource_declaration();
				}
				break;
			case 4:
				{
				setState(1400); 
				enum_declaration();
				}
				break;
			case 5:
				{
				setState(1401); 
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
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterResource_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitResource_declaration(this);
		}
	}

	public final Resource_declarationContext resource_declaration() throws RecognitionException {
		Resource_declarationContext _localctx = new Resource_declarationContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_resource_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1404); 
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
		enterRule(_localctx, 146, RULE_enum_declaration);
		try {
			setState(1408);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1406); 
				enum_category_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1407); 
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
		enterRule(_localctx, 148, RULE_native_symbol_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1410); 
			native_symbol();
			setState(1416);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1411); 
					lfp();
					setState(1412); 
					native_symbol();
					}
					} 
				}
				setState(1418);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 150, RULE_category_symbol_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1419); 
			category_symbol();
			setState(1425);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1420); 
					lfp();
					setState(1421); 
					category_symbol();
					}
					} 
				}
				setState(1427);
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
		enterRule(_localctx, 152, RULE_symbol_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1428); 
			symbol_identifier();
			setState(1433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1429); 
				match(COMMA);
				setState(1430); 
				symbol_identifier();
				}
				}
				setState(1435);
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
		enterRule(_localctx, 154, RULE_attribute_constraint);
		try {
			setState(1446);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				_localctx = new MatchingListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1436); 
				match(IN);
				setState(1437); 
				((MatchingListContext)_localctx).source = list_literal();
				}
				break;
			case 2:
				_localctx = new MatchingSetContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1438); 
				match(IN);
				setState(1439); 
				((MatchingSetContext)_localctx).source = set_literal();
				}
				break;
			case 3:
				_localctx = new MatchingRangeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1440); 
				match(IN);
				setState(1441); 
				((MatchingRangeContext)_localctx).source = range_literal();
				}
				break;
			case 4:
				_localctx = new MatchingPatternContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1442); 
				match(MATCHING);
				setState(1443); 
				((MatchingPatternContext)_localctx).text = match(TEXT_LITERAL);
				}
				break;
			case 5:
				_localctx = new MatchingExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1444); 
				match(MATCHING);
				setState(1445); 
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
		enterRule(_localctx, 156, RULE_list_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1449);
			_la = _input.LA(1);
			if (_la==MUTABLE) {
				{
				setState(1448); 
				match(MUTABLE);
				}
			}

			setState(1451); 
			match(LBRAK);
			setState(1453);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << METHOD_T) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (EXECUTE - 98)) | (1L << (FETCH - 98)) | (1L << (INVOKE - 98)) | (1L << (MUTABLE - 98)) | (1L << (NOT - 98)) | (1L << (NOTHING - 98)) | (1L << (READ - 98)) | (1L << (SELF - 98)) | (1L << (SORTED - 98)) | (1L << (THIS - 98)) | (1L << (BOOLEAN_LITERAL - 98)) | (1L << (CHAR_LITERAL - 98)) | (1L << (MIN_INTEGER - 98)) | (1L << (MAX_INTEGER - 98)) | (1L << (SYMBOL_IDENTIFIER - 98)) | (1L << (TYPE_IDENTIFIER - 98)))) != 0) || ((((_la - 162)) & ~0x3f) == 0 && ((1L << (_la - 162)) & ((1L << (VARIABLE_IDENTIFIER - 162)) | (1L << (TEXT_LITERAL - 162)) | (1L << (UUID_LITERAL - 162)) | (1L << (INTEGER_LITERAL - 162)) | (1L << (HEXA_LITERAL - 162)) | (1L << (DECIMAL_LITERAL - 162)) | (1L << (DATETIME_LITERAL - 162)) | (1L << (TIME_LITERAL - 162)) | (1L << (DATE_LITERAL - 162)) | (1L << (PERIOD_LITERAL - 162)))) != 0)) {
				{
				setState(1452); 
				expression_list();
				}
			}

			setState(1455); 
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
		enterRule(_localctx, 158, RULE_set_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1458);
			_la = _input.LA(1);
			if (_la==MUTABLE) {
				{
				setState(1457); 
				match(MUTABLE);
				}
			}

			setState(1460); 
			match(LT);
			setState(1462);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << METHOD_T) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (EXECUTE - 98)) | (1L << (FETCH - 98)) | (1L << (INVOKE - 98)) | (1L << (MUTABLE - 98)) | (1L << (NOT - 98)) | (1L << (NOTHING - 98)) | (1L << (READ - 98)) | (1L << (SELF - 98)) | (1L << (SORTED - 98)) | (1L << (THIS - 98)) | (1L << (BOOLEAN_LITERAL - 98)) | (1L << (CHAR_LITERAL - 98)) | (1L << (MIN_INTEGER - 98)) | (1L << (MAX_INTEGER - 98)) | (1L << (SYMBOL_IDENTIFIER - 98)) | (1L << (TYPE_IDENTIFIER - 98)))) != 0) || ((((_la - 162)) & ~0x3f) == 0 && ((1L << (_la - 162)) & ((1L << (VARIABLE_IDENTIFIER - 162)) | (1L << (TEXT_LITERAL - 162)) | (1L << (UUID_LITERAL - 162)) | (1L << (INTEGER_LITERAL - 162)) | (1L << (HEXA_LITERAL - 162)) | (1L << (DECIMAL_LITERAL - 162)) | (1L << (DATETIME_LITERAL - 162)) | (1L << (TIME_LITERAL - 162)) | (1L << (DATE_LITERAL - 162)) | (1L << (PERIOD_LITERAL - 162)))) != 0)) {
				{
				setState(1461); 
				expression_list();
				}
			}

			setState(1464); 
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
		enterRule(_localctx, 160, RULE_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1466); 
			expression(0);
			setState(1471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1467); 
				match(COMMA);
				setState(1468); 
				expression(0);
				}
				}
				setState(1473);
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
		enterRule(_localctx, 162, RULE_range_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1474); 
			match(LBRAK);
			setState(1475); 
			((Range_literalContext)_localctx).low = expression(0);
			setState(1476); 
			match(RANGE);
			setState(1477); 
			((Range_literalContext)_localctx).high = expression(0);
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
		public TerminalNode LCURL() { return getToken(EParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(EParser.RCURL, 0); }
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
		int _startState = 164;
		enterRecursionRule(_localctx, 164, RULE_typedef, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1492);
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
			case CODE:
			case DOCUMENT:
			case BLOB:
			case IMAGE:
			case UUID:
			case TYPE_IDENTIFIER:
				{
				_localctx = new PrimaryTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1481); 
				((PrimaryTypeContext)_localctx).p = primary_type();
				}
				break;
			case CURSOR:
				{
				_localctx = new CursorTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1482); 
				match(CURSOR);
				setState(1483); 
				match(LT);
				setState(1484); 
				((CursorTypeContext)_localctx).c = typedef(0);
				setState(1485); 
				match(GT);
				}
				break;
			case ITERATOR:
				{
				_localctx = new IteratorTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1487); 
				match(ITERATOR);
				setState(1488); 
				match(LT);
				setState(1489); 
				((IteratorTypeContext)_localctx).i = typedef(0);
				setState(1490); 
				match(GT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1504);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1502);
					switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
					case 1:
						{
						_localctx = new SetTypeContext(new TypedefContext(_parentctx, _parentState));
						((SetTypeContext)_localctx).s = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_typedef);
						setState(1494);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1495); 
						match(LTGT);
						}
						break;
					case 2:
						{
						_localctx = new ListTypeContext(new TypedefContext(_parentctx, _parentState));
						((ListTypeContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_typedef);
						setState(1496);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1497); 
						match(LBRAK);
						setState(1498); 
						match(RBRAK);
						}
						break;
					case 3:
						{
						_localctx = new DictTypeContext(new TypedefContext(_parentctx, _parentState));
						((DictTypeContext)_localctx).d = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_typedef);
						setState(1499);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1500); 
						match(LCURL);
						setState(1501); 
						match(RCURL);
						}
						break;
					}
					} 
				}
				setState(1506);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
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
		enterRule(_localctx, 166, RULE_primary_type);
		try {
			setState(1509);
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
			case CODE:
			case DOCUMENT:
			case BLOB:
			case IMAGE:
			case UUID:
				_localctx = new NativeTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1507); 
				((NativeTypeContext)_localctx).n = native_type();
				}
				break;
			case TYPE_IDENTIFIER:
				_localctx = new CategoryTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1508); 
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
		enterRule(_localctx, 168, RULE_native_type);
		try {
			setState(1525);
			switch (_input.LA(1)) {
			case BOOLEAN:
				_localctx = new BooleanTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1511); 
				match(BOOLEAN);
				}
				break;
			case CHARACTER:
				_localctx = new CharacterTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1512); 
				match(CHARACTER);
				}
				break;
			case TEXT:
				_localctx = new TextTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1513); 
				match(TEXT);
				}
				break;
			case IMAGE:
				_localctx = new ImageTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1514); 
				match(IMAGE);
				}
				break;
			case INTEGER:
				_localctx = new IntegerTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1515); 
				match(INTEGER);
				}
				break;
			case DECIMAL:
				_localctx = new DecimalTypeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1516); 
				match(DECIMAL);
				}
				break;
			case DOCUMENT:
				_localctx = new DocumentTypeContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1517); 
				match(DOCUMENT);
				}
				break;
			case DATE:
				_localctx = new DateTypeContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1518); 
				match(DATE);
				}
				break;
			case DATETIME:
				_localctx = new DateTimeTypeContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1519); 
				match(DATETIME);
				}
				break;
			case TIME:
				_localctx = new TimeTypeContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1520); 
				match(TIME);
				}
				break;
			case PERIOD:
				_localctx = new PeriodTypeContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(1521); 
				match(PERIOD);
				}
				break;
			case CODE:
				_localctx = new CodeTypeContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(1522); 
				match(CODE);
				}
				break;
			case BLOB:
				_localctx = new BlobTypeContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(1523); 
				match(BLOB);
				}
				break;
			case UUID:
				_localctx = new UUIDTypeContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(1524); 
				match(UUID);
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
		enterRule(_localctx, 170, RULE_category_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1527); 
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
		enterRule(_localctx, 172, RULE_mutable_category_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1530);
			_la = _input.LA(1);
			if (_la==MUTABLE) {
				{
				setState(1529); 
				match(MUTABLE);
				}
			}

			setState(1532); 
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
		enterRule(_localctx, 174, RULE_code_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1534); 
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
		enterRule(_localctx, 176, RULE_category_declaration);
		try {
			setState(1539);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				_localctx = new ConcreteCategoryDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1536); 
				((ConcreteCategoryDeclarationContext)_localctx).decl = concrete_category_declaration();
				}
				break;
			case 2:
				_localctx = new NativeCategoryDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1537); 
				((NativeCategoryDeclarationContext)_localctx).decl = native_category_declaration();
				}
				break;
			case 3:
				_localctx = new SingletonCategoryDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1538); 
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
		enterRule(_localctx, 178, RULE_type_identifier_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1541); 
			type_identifier();
			setState(1546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1542); 
				match(COMMA);
				setState(1543); 
				type_identifier();
				}
				}
				setState(1548);
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
		enterRule(_localctx, 180, RULE_method_identifier);
		try {
			setState(1551);
			switch (_input.LA(1)) {
			case VARIABLE_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1549); 
				variable_identifier();
				}
				break;
			case TYPE_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1550); 
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
		enterRule(_localctx, 182, RULE_identifier);
		try {
			setState(1556);
			switch (_input.LA(1)) {
			case VARIABLE_IDENTIFIER:
				_localctx = new VariableIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1553); 
				variable_identifier();
				}
				break;
			case TYPE_IDENTIFIER:
				_localctx = new TypeIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1554); 
				type_identifier();
				}
				break;
			case SYMBOL_IDENTIFIER:
				_localctx = new SymbolIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1555); 
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
		enterRule(_localctx, 184, RULE_variable_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1558); 
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
		enterRule(_localctx, 186, RULE_attribute_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1560);
			_la = _input.LA(1);
			if ( !(_la==STORABLE || _la==VARIABLE_IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 188, RULE_type_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1562); 
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
		enterRule(_localctx, 190, RULE_symbol_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1564); 
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
		enterRule(_localctx, 192, RULE_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1566); 
			argument();
			setState(1571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1567); 
				match(COMMA);
				setState(1568); 
				argument();
				}
				}
				setState(1573);
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
		enterRule(_localctx, 194, RULE_argument);
		int _la;
		try {
			setState(1579);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				_localctx = new CodeArgumentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1574); 
				((CodeArgumentContext)_localctx).arg = code_argument();
				}
				break;
			case 2:
				_localctx = new OperatorArgumentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1576);
				_la = _input.LA(1);
				if (_la==MUTABLE) {
					{
					setState(1575); 
					match(MUTABLE);
					}
				}

				setState(1578); 
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
		enterRule(_localctx, 196, RULE_operator_argument);
		try {
			setState(1583);
			switch (_input.LA(1)) {
			case VARIABLE_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1581); 
				named_argument();
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
			case CODE:
			case DOCUMENT:
			case BLOB:
			case IMAGE:
			case UUID:
			case ITERATOR:
			case CURSOR:
			case ANY:
			case TYPE_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1582); 
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
		enterRule(_localctx, 198, RULE_named_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1585); 
			variable_identifier();
			setState(1588);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(1586); 
				match(EQ);
				setState(1587); 
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
		enterRule(_localctx, 200, RULE_code_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1590); 
			code_type();
			setState(1591); 
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
		enterRule(_localctx, 202, RULE_category_or_any_type);
		try {
			setState(1595);
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
			case CODE:
			case DOCUMENT:
			case BLOB:
			case IMAGE:
			case UUID:
			case ITERATOR:
			case CURSOR:
			case TYPE_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1593); 
				typedef(0);
				}
				break;
			case ANY:
				enterOuterAlt(_localctx, 2);
				{
				setState(1594); 
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
		int _startState = 204;
		enterRecursionRule(_localctx, 204, RULE_any_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AnyTypeContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1598); 
			match(ANY);
			}
			_ctx.stop = _input.LT(-1);
			setState(1608);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1606);
					switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
					case 1:
						{
						_localctx = new AnyListTypeContext(new Any_typeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_any_type);
						setState(1600);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1601); 
						match(LBRAK);
						setState(1602); 
						match(RBRAK);
						}
						break;
					case 2:
						{
						_localctx = new AnyDictTypeContext(new Any_typeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_any_type);
						setState(1603);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1604); 
						match(LCURL);
						setState(1605); 
						match(RCURL);
						}
						break;
					}
					} 
				}
				setState(1610);
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
		enterRule(_localctx, 206, RULE_member_method_declaration_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1611); 
			member_method_declaration();
			setState(1617);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1612); 
					lfp();
					setState(1613); 
					member_method_declaration();
					}
					} 
				}
				setState(1619);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterMember_method_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitMember_method_declaration(this);
		}
	}

	public final Member_method_declarationContext member_method_declaration() throws RecognitionException {
		Member_method_declarationContext _localctx = new Member_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_member_method_declaration);
		try {
			setState(1625);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1620); 
				setter_method_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1621); 
				getter_method_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1622); 
				concrete_method_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1623); 
				abstract_method_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1624); 
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
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterNative_member_method_declaration_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitNative_member_method_declaration_list(this);
		}
	}

	public final Native_member_method_declaration_listContext native_member_method_declaration_list() throws RecognitionException {
		Native_member_method_declaration_listContext _localctx = new Native_member_method_declaration_listContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_native_member_method_declaration_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1627); 
			native_member_method_declaration();
			setState(1633);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1628); 
					lfp();
					setState(1629); 
					native_member_method_declaration();
					}
					} 
				}
				setState(1635);
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
		enterRule(_localctx, 212, RULE_native_member_method_declaration);
		try {
			setState(1639);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1636); 
				native_getter_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1637); 
				native_setter_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1638); 
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
		enterRule(_localctx, 214, RULE_native_category_binding);
		try {
			setState(1651);
			switch (_input.LA(1)) {
			case JAVA:
				_localctx = new JavaCategoryBindingContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1641); 
				match(JAVA);
				setState(1642); 
				((JavaCategoryBindingContext)_localctx).binding = java_class_identifier_expression(0);
				}
				break;
			case CSHARP:
				_localctx = new CSharpCategoryBindingContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1643); 
				match(CSHARP);
				setState(1644); 
				((CSharpCategoryBindingContext)_localctx).binding = csharp_identifier_expression(0);
				}
				break;
			case PYTHON2:
				_localctx = new Python2CategoryBindingContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1645); 
				match(PYTHON2);
				setState(1646); 
				((Python2CategoryBindingContext)_localctx).binding = python_category_binding();
				}
				break;
			case PYTHON3:
				_localctx = new Python3CategoryBindingContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1647); 
				match(PYTHON3);
				setState(1648); 
				((Python3CategoryBindingContext)_localctx).binding = python_category_binding();
				}
				break;
			case JAVASCRIPT:
				_localctx = new JavaScriptCategoryBindingContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1649); 
				match(JAVASCRIPT);
				setState(1650); 
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
		enterRule(_localctx, 216, RULE_python_category_binding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1653); 
			identifier();
			setState(1655);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				{
				setState(1654); 
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
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
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
		enterRule(_localctx, 218, RULE_python_module);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1657); 
			match(FROM);
			setState(1658); 
			module_token();
			setState(1659); 
			match(COLON);
			setState(1660); 
			identifier();
			setState(1665);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1661); 
					match(DOT);
					setState(1662); 
					identifier();
					}
					} 
				}
				setState(1667);
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
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJavascript_category_binding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJavascript_category_binding(this);
		}
	}

	public final Javascript_category_bindingContext javascript_category_binding() throws RecognitionException {
		Javascript_category_bindingContext _localctx = new Javascript_category_bindingContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_javascript_category_binding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1668); 
			identifier();
			setState(1670);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				{
				setState(1669); 
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
		enterRule(_localctx, 222, RULE_javascript_module);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1672); 
			match(FROM);
			setState(1673); 
			module_token();
			setState(1674); 
			match(COLON);
			setState(1676);
			_la = _input.LA(1);
			if (_la==SLASH) {
				{
				setState(1675); 
				match(SLASH);
				}
			}

			setState(1678); 
			javascript_identifier();
			setState(1683);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1679); 
					match(SLASH);
					setState(1680); 
					javascript_identifier();
					}
					} 
				}
				setState(1685);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
			}
			setState(1688);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				{
				setState(1686); 
				match(DOT);
				setState(1687); 
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
		enterRule(_localctx, 224, RULE_variable_identifier_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1690); 
			variable_identifier();
			setState(1695);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1691); 
				match(COMMA);
				setState(1692); 
				variable_identifier();
				}
				}
				setState(1697);
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
		enterRule(_localctx, 226, RULE_attribute_identifier_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1698); 
			attribute_identifier();
			setState(1703);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1699); 
					match(COMMA);
					setState(1700); 
					attribute_identifier();
					}
					} 
				}
				setState(1705);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 228, RULE_method_declaration);
		try {
			setState(1710);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1706); 
				abstract_method_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1707); 
				concrete_method_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1708); 
				native_method_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1709); 
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
		enterRule(_localctx, 230, RULE_comment_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1712); 
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
		enterRule(_localctx, 232, RULE_native_statement_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1714); 
			native_statement();
			setState(1720);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1715); 
					lfp();
					setState(1716); 
					native_statement();
					}
					} 
				}
				setState(1722);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 234, RULE_native_statement);
		try {
			setState(1733);
			switch (_input.LA(1)) {
			case JAVA:
				_localctx = new JavaNativeStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1723); 
				match(JAVA);
				setState(1724); 
				java_statement();
				}
				break;
			case CSHARP:
				_localctx = new CSharpNativeStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1725); 
				match(CSHARP);
				setState(1726); 
				csharp_statement();
				}
				break;
			case PYTHON2:
				_localctx = new Python2NativeStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1727); 
				match(PYTHON2);
				setState(1728); 
				python_native_statement();
				}
				break;
			case PYTHON3:
				_localctx = new Python3NativeStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1729); 
				match(PYTHON3);
				setState(1730); 
				python_native_statement();
				}
				break;
			case JAVASCRIPT:
				_localctx = new JavaScriptNativeStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1731); 
				match(JAVASCRIPT);
				setState(1732); 
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
		enterRule(_localctx, 236, RULE_python_native_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1735); 
			python_statement();
			setState(1737);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1736); 
				match(SEMI);
				}
			}

			setState(1740);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(1739); 
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
		enterRule(_localctx, 238, RULE_javascript_native_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1742); 
			javascript_statement();
			setState(1744);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1743); 
				match(SEMI);
				}
			}

			setState(1747);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(1746); 
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
		enterRule(_localctx, 240, RULE_statement_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1749); 
			statement();
			setState(1755);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1750); 
					lfp();
					setState(1751); 
					statement();
					}
					} 
				}
				setState(1757);
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
		enterRule(_localctx, 242, RULE_assertion_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1758); 
			assertion();
			setState(1764);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1759); 
					lfp();
					setState(1760); 
					assertion();
					}
					} 
				}
				setState(1766);
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
		enterRule(_localctx, 244, RULE_switch_case_statement_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1767); 
			switch_case_statement();
			setState(1773);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1768); 
					lfp();
					setState(1769); 
					switch_case_statement();
					}
					} 
				}
				setState(1775);
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
		enterRule(_localctx, 246, RULE_catch_statement_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1776); 
			catch_statement();
			setState(1782);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1777); 
					lfp();
					setState(1778); 
					catch_statement();
					}
					} 
				}
				setState(1784);
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
		enterRule(_localctx, 248, RULE_literal_collection);
		try {
			setState(1799);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				_localctx = new LiteralRangeLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1785); 
				match(LBRAK);
				setState(1786); 
				((LiteralRangeLiteralContext)_localctx).low = atomic_literal();
				setState(1787); 
				match(RANGE);
				setState(1788); 
				((LiteralRangeLiteralContext)_localctx).high = atomic_literal();
				setState(1789); 
				match(RBRAK);
				}
				break;
			case 2:
				_localctx = new LiteralListLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1791); 
				match(LBRAK);
				setState(1792); 
				literal_list_literal();
				setState(1793); 
				match(RBRAK);
				}
				break;
			case 3:
				_localctx = new LiteralSetLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1795); 
				match(LT);
				setState(1796); 
				literal_list_literal();
				setState(1797); 
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
		public Token t;
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
	public static class BooleanLiteralContext extends Atomic_literalContext {
		public Token t;
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
	public static class HexadecimalLiteralContext extends Atomic_literalContext {
		public Token t;
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
		public Token t;
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
		public Token t;
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
	public static class DateTimeLiteralContext extends Atomic_literalContext {
		public Token t;
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
		public Token t;
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
		public Token t;
		public TerminalNode DECIMAL_LITERAL() { return getToken(EParser.DECIMAL_LITERAL, 0); }
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
		public Token t;
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
		public Null_literalContext n;
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
		public Token t;
		public TerminalNode INTEGER_LITERAL() { return getToken(EParser.INTEGER_LITERAL, 0); }
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
		public Token t;
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
		public Token t;
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
		enterRule(_localctx, 250, RULE_atomic_literal);
		try {
			setState(1815);
			switch (_input.LA(1)) {
			case MIN_INTEGER:
				_localctx = new MinIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1801); 
				((MinIntegerLiteralContext)_localctx).t = match(MIN_INTEGER);
				}
				break;
			case MAX_INTEGER:
				_localctx = new MaxIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1802); 
				((MaxIntegerLiteralContext)_localctx).t = match(MAX_INTEGER);
				}
				break;
			case INTEGER_LITERAL:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1803); 
				((IntegerLiteralContext)_localctx).t = match(INTEGER_LITERAL);
				}
				break;
			case HEXA_LITERAL:
				_localctx = new HexadecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1804); 
				((HexadecimalLiteralContext)_localctx).t = match(HEXA_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new CharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1805); 
				((CharacterLiteralContext)_localctx).t = match(CHAR_LITERAL);
				}
				break;
			case DATE_LITERAL:
				_localctx = new DateLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1806); 
				((DateLiteralContext)_localctx).t = match(DATE_LITERAL);
				}
				break;
			case TIME_LITERAL:
				_localctx = new TimeLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1807); 
				((TimeLiteralContext)_localctx).t = match(TIME_LITERAL);
				}
				break;
			case TEXT_LITERAL:
				_localctx = new TextLiteralContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1808); 
				((TextLiteralContext)_localctx).t = match(TEXT_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1809); 
				((DecimalLiteralContext)_localctx).t = match(DECIMAL_LITERAL);
				}
				break;
			case DATETIME_LITERAL:
				_localctx = new DateTimeLiteralContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1810); 
				((DateTimeLiteralContext)_localctx).t = match(DATETIME_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(1811); 
				((BooleanLiteralContext)_localctx).t = match(BOOLEAN_LITERAL);
				}
				break;
			case PERIOD_LITERAL:
				_localctx = new PeriodLiteralContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(1812); 
				((PeriodLiteralContext)_localctx).t = match(PERIOD_LITERAL);
				}
				break;
			case UUID_LITERAL:
				_localctx = new UUIDLiteralContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(1813); 
				((UUIDLiteralContext)_localctx).t = match(UUID_LITERAL);
				}
				break;
			case NOTHING:
				_localctx = new NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(1814); 
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
		enterRule(_localctx, 252, RULE_literal_list_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1817); 
			atomic_literal();
			setState(1822);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1818); 
				match(COMMA);
				setState(1819); 
				atomic_literal();
				}
				}
				setState(1824);
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
		enterRule(_localctx, 254, RULE_selectable_expression);
		try {
			setState(1829);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				_localctx = new ParenthesisExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1825); 
				((ParenthesisExpressionContext)_localctx).exp = parenthesis_expression();
				}
				break;
			case 2:
				_localctx = new LiteralExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1826); 
				((LiteralExpressionContext)_localctx).exp = literal_expression();
				}
				break;
			case 3:
				_localctx = new IdentifierExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1827); 
				((IdentifierExpressionContext)_localctx).exp = identifier();
				}
				break;
			case 4:
				_localctx = new ThisExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1828); 
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
		enterRule(_localctx, 256, RULE_this_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1831);
			_la = _input.LA(1);
			if ( !(_la==SELF || _la==THIS) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 258, RULE_parenthesis_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1833); 
			match(LPAR);
			setState(1834); 
			expression(0);
			setState(1835); 
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
		enterRule(_localctx, 260, RULE_literal_expression);
		try {
			setState(1839);
			switch (_input.LA(1)) {
			case NOTHING:
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
				enterOuterAlt(_localctx, 1);
				{
				setState(1837); 
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
				setState(1838); 
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
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterCollection_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitCollection_literal(this);
		}
	}

	public final Collection_literalContext collection_literal() throws RecognitionException {
		Collection_literalContext _localctx = new Collection_literalContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_collection_literal);
		try {
			setState(1846);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1841); 
				range_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1842); 
				list_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1843); 
				set_literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1844); 
				dict_literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1845); 
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
		enterRule(_localctx, 264, RULE_tuple_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1849);
			_la = _input.LA(1);
			if (_la==MUTABLE) {
				{
				setState(1848); 
				match(MUTABLE);
				}
			}

			setState(1851); 
			match(LPAR);
			setState(1853);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << METHOD_T) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (EXECUTE - 98)) | (1L << (FETCH - 98)) | (1L << (INVOKE - 98)) | (1L << (MUTABLE - 98)) | (1L << (NOT - 98)) | (1L << (NOTHING - 98)) | (1L << (READ - 98)) | (1L << (SELF - 98)) | (1L << (SORTED - 98)) | (1L << (THIS - 98)) | (1L << (BOOLEAN_LITERAL - 98)) | (1L << (CHAR_LITERAL - 98)) | (1L << (MIN_INTEGER - 98)) | (1L << (MAX_INTEGER - 98)) | (1L << (SYMBOL_IDENTIFIER - 98)) | (1L << (TYPE_IDENTIFIER - 98)))) != 0) || ((((_la - 162)) & ~0x3f) == 0 && ((1L << (_la - 162)) & ((1L << (VARIABLE_IDENTIFIER - 162)) | (1L << (TEXT_LITERAL - 162)) | (1L << (UUID_LITERAL - 162)) | (1L << (INTEGER_LITERAL - 162)) | (1L << (HEXA_LITERAL - 162)) | (1L << (DECIMAL_LITERAL - 162)) | (1L << (DATETIME_LITERAL - 162)) | (1L << (TIME_LITERAL - 162)) | (1L << (DATE_LITERAL - 162)) | (1L << (PERIOD_LITERAL - 162)))) != 0)) {
				{
				setState(1852); 
				expression_tuple();
				}
			}

			setState(1855); 
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
		public TerminalNode LCURL() { return getToken(EParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(EParser.RCURL, 0); }
		public TerminalNode MUTABLE() { return getToken(EParser.MUTABLE, 0); }
		public Dict_entry_listContext dict_entry_list() {
			return getRuleContext(Dict_entry_listContext.class,0);
		}
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
		enterRule(_localctx, 266, RULE_dict_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1858);
			_la = _input.LA(1);
			if (_la==MUTABLE) {
				{
				setState(1857); 
				match(MUTABLE);
				}
			}

			setState(1860); 
			match(LCURL);
			setState(1862);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << METHOD_T) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (EXECUTE - 98)) | (1L << (FETCH - 98)) | (1L << (INVOKE - 98)) | (1L << (MUTABLE - 98)) | (1L << (NOT - 98)) | (1L << (NOTHING - 98)) | (1L << (READ - 98)) | (1L << (SELF - 98)) | (1L << (SORTED - 98)) | (1L << (THIS - 98)) | (1L << (BOOLEAN_LITERAL - 98)) | (1L << (CHAR_LITERAL - 98)) | (1L << (MIN_INTEGER - 98)) | (1L << (MAX_INTEGER - 98)) | (1L << (SYMBOL_IDENTIFIER - 98)) | (1L << (TYPE_IDENTIFIER - 98)))) != 0) || ((((_la - 162)) & ~0x3f) == 0 && ((1L << (_la - 162)) & ((1L << (VARIABLE_IDENTIFIER - 162)) | (1L << (TEXT_LITERAL - 162)) | (1L << (UUID_LITERAL - 162)) | (1L << (INTEGER_LITERAL - 162)) | (1L << (HEXA_LITERAL - 162)) | (1L << (DECIMAL_LITERAL - 162)) | (1L << (DATETIME_LITERAL - 162)) | (1L << (TIME_LITERAL - 162)) | (1L << (DATE_LITERAL - 162)) | (1L << (PERIOD_LITERAL - 162)))) != 0)) {
				{
				setState(1861); 
				dict_entry_list();
				}
			}

			setState(1864); 
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
		enterRule(_localctx, 268, RULE_expression_tuple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1866); 
			expression(0);
			setState(1867); 
			match(COMMA);
			setState(1876);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << METHOD_T) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (EXECUTE - 98)) | (1L << (FETCH - 98)) | (1L << (INVOKE - 98)) | (1L << (MUTABLE - 98)) | (1L << (NOT - 98)) | (1L << (NOTHING - 98)) | (1L << (READ - 98)) | (1L << (SELF - 98)) | (1L << (SORTED - 98)) | (1L << (THIS - 98)) | (1L << (BOOLEAN_LITERAL - 98)) | (1L << (CHAR_LITERAL - 98)) | (1L << (MIN_INTEGER - 98)) | (1L << (MAX_INTEGER - 98)) | (1L << (SYMBOL_IDENTIFIER - 98)) | (1L << (TYPE_IDENTIFIER - 98)))) != 0) || ((((_la - 162)) & ~0x3f) == 0 && ((1L << (_la - 162)) & ((1L << (VARIABLE_IDENTIFIER - 162)) | (1L << (TEXT_LITERAL - 162)) | (1L << (UUID_LITERAL - 162)) | (1L << (INTEGER_LITERAL - 162)) | (1L << (HEXA_LITERAL - 162)) | (1L << (DECIMAL_LITERAL - 162)) | (1L << (DATETIME_LITERAL - 162)) | (1L << (TIME_LITERAL - 162)) | (1L << (DATE_LITERAL - 162)) | (1L << (PERIOD_LITERAL - 162)))) != 0)) {
				{
				setState(1868); 
				expression(0);
				setState(1873);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1869); 
					match(COMMA);
					setState(1870); 
					expression(0);
					}
					}
					setState(1875);
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
		enterRule(_localctx, 270, RULE_dict_entry_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1878); 
			dict_entry();
			setState(1883);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1879); 
				match(COMMA);
				setState(1880); 
				dict_entry();
				}
				}
				setState(1885);
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
		public TerminalNode COLON() { return getToken(EParser.COLON, 0); }
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
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterDict_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitDict_entry(this);
		}
	}

	public final Dict_entryContext dict_entry() throws RecognitionException {
		Dict_entryContext _localctx = new Dict_entryContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_dict_entry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1886); 
			((Dict_entryContext)_localctx).key = expression(0);
			setState(1887); 
			match(COLON);
			setState(1888); 
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
		enterRule(_localctx, 274, RULE_slice_arguments);
		try {
			setState(1899);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				_localctx = new SliceFirstAndLastContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1890); 
				((SliceFirstAndLastContext)_localctx).first = expression(0);
				setState(1891); 
				match(COLON);
				setState(1892); 
				((SliceFirstAndLastContext)_localctx).last = expression(0);
				}
				break;
			case 2:
				_localctx = new SliceFirstOnlyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1894); 
				((SliceFirstOnlyContext)_localctx).first = expression(0);
				setState(1895); 
				match(COLON);
				}
				break;
			case 3:
				_localctx = new SliceLastOnlyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1897); 
				match(COLON);
				setState(1898); 
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
		enterRule(_localctx, 276, RULE_assign_variable_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1901); 
			variable_identifier();
			setState(1902); 
			assign();
			setState(1903); 
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
		int _startState = 278;
		enterRecursionRule(_localctx, 278, RULE_assignable_instance, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new RootInstanceContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1906); 
			variable_identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(1912);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ChildInstanceContext(new Assignable_instanceContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_assignable_instance);
					setState(1908);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1909); 
					child_instance();
					}
					} 
				}
				setState(1914);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
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
		enterRule(_localctx, 280, RULE_is_expression);
		try {
			setState(1919);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				_localctx = new IsATypeExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1915);
				if (!(this.willBeAOrAn())) throw new FailedPredicateException(this, "$parser.willBeAOrAn()");
				setState(1916); 
				match(VARIABLE_IDENTIFIER);
				setState(1917); 
				category_or_any_type();
				}
				break;
			case 2:
				_localctx = new IsOtherExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1918); 
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
		enterRule(_localctx, 282, RULE_read_all_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1921); 
			match(READ);
			setState(1922); 
			match(ALL);
			setState(1923); 
			match(FROM);
			setState(1924); 
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
		enterRule(_localctx, 284, RULE_read_one_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1926); 
			match(READ);
			setState(1927); 
			match(ONE);
			setState(1928); 
			match(FROM);
			setState(1929); 
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
		enterRule(_localctx, 286, RULE_order_by_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1931); 
			order_by();
			setState(1936);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1932); 
					match(COMMA);
					setState(1933); 
					order_by();
					}
					} 
				}
				setState(1938);
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
		enterRule(_localctx, 288, RULE_order_by);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1939); 
			variable_identifier();
			setState(1944);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,158,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1940); 
					match(DOT);
					setState(1941); 
					variable_identifier();
					}
					} 
				}
				setState(1946);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,158,_ctx);
			}
			setState(1948);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				{
				setState(1947);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				}
				consume();
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
		enterRule(_localctx, 290, RULE_operator);
		try {
			setState(1956);
			switch (_input.LA(1)) {
			case PLUS:
				_localctx = new OperatorPlusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1950); 
				match(PLUS);
				}
				break;
			case MINUS:
				_localctx = new OperatorMinusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1951); 
				match(MINUS);
				}
				break;
			case STAR:
				_localctx = new OperatorMultiplyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1952); 
				multiply();
				}
				break;
			case SLASH:
				_localctx = new OperatorDivideContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1953); 
				divide();
				}
				break;
			case BSLASH:
				_localctx = new OperatorIDivideContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1954); 
				idivide();
				}
				break;
			case PERCENT:
			case MODULO:
				_localctx = new OperatorModuloContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1955); 
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
		enterRule(_localctx, 292, RULE_new_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1958); 
			((New_tokenContext)_localctx).i1 = match(VARIABLE_IDENTIFIER);
			setState(1959);
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
		enterRule(_localctx, 294, RULE_key_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1961); 
			((Key_tokenContext)_localctx).i1 = match(VARIABLE_IDENTIFIER);
			setState(1962);
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
		enterRule(_localctx, 296, RULE_module_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1964); 
			((Module_tokenContext)_localctx).i1 = match(VARIABLE_IDENTIFIER);
			setState(1965);
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
		enterRule(_localctx, 298, RULE_value_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1967); 
			((Value_tokenContext)_localctx).i1 = match(VARIABLE_IDENTIFIER);
			setState(1968);
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
		enterRule(_localctx, 300, RULE_symbols_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1970); 
			((Symbols_tokenContext)_localctx).i1 = match(VARIABLE_IDENTIFIER);
			setState(1971);
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
		enterRule(_localctx, 302, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1973); 
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
		enterRule(_localctx, 304, RULE_multiply);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1975); 
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
		enterRule(_localctx, 306, RULE_divide);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1977); 
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
		enterRule(_localctx, 308, RULE_idivide);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1979); 
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
		enterRule(_localctx, 310, RULE_modulo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1981);
			_la = _input.LA(1);
			if ( !(_la==PERCENT || _la==MODULO) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 312, RULE_javascript_statement);
		try {
			setState(1990);
			switch (_input.LA(1)) {
			case RETURN:
				_localctx = new JavascriptReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1983); 
				match(RETURN);
				setState(1984); 
				((JavascriptReturnStatementContext)_localctx).exp = javascript_expression(0);
				setState(1985); 
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
				setState(1987); 
				((JavascriptStatementContext)_localctx).exp = javascript_expression(0);
				setState(1988); 
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
		int _startState = 314;
		enterRecursionRule(_localctx, 314, RULE_javascript_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavascriptPrimaryExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1993); 
			((JavascriptPrimaryExpressionContext)_localctx).exp = javascript_primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(1999);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavascriptSelectorExpressionContext(new Javascript_expressionContext(_parentctx, _parentState));
					((JavascriptSelectorExpressionContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_javascript_expression);
					setState(1995);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1996); 
					((JavascriptSelectorExpressionContext)_localctx).child = javascript_selector_expression();
					}
					} 
				}
				setState(2001);
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
		enterRule(_localctx, 316, RULE_javascript_primary_expression);
		try {
			setState(2009);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2002); 
				javascript_this_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2003); 
				javascript_new_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2004); 
				javascript_parenthesis_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2005); 
				javascript_identifier_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2006); 
				javascript_literal_expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2007); 
				javascript_method_expression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2008); 
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
		enterRule(_localctx, 318, RULE_javascript_this_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2011); 
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
		enterRule(_localctx, 320, RULE_javascript_new_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2013); 
			new_token();
			setState(2014); 
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
		enterRule(_localctx, 322, RULE_javascript_selector_expression);
		try {
			setState(2021);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				_localctx = new JavaScriptMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2016); 
				match(DOT);
				setState(2017); 
				((JavaScriptMethodExpressionContext)_localctx).method = javascript_method_expression();
				}
				break;
			case 2:
				_localctx = new JavaScriptMemberExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2018); 
				match(DOT);
				setState(2019); 
				((JavaScriptMemberExpressionContext)_localctx).name = javascript_identifier();
				}
				break;
			case 3:
				_localctx = new JavaScriptItemExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2020); 
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
		enterRule(_localctx, 324, RULE_javascript_method_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2023); 
			((Javascript_method_expressionContext)_localctx).name = javascript_identifier();
			setState(2024); 
			match(LPAR);
			setState(2026);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (READ - 132)) | (1L << (SELF - 132)) | (1L << (TEST - 132)) | (1L << (THIS - 132)) | (1L << (WRITE - 132)) | (1L << (BOOLEAN_LITERAL - 132)) | (1L << (CHAR_LITERAL - 132)) | (1L << (SYMBOL_IDENTIFIER - 132)) | (1L << (TYPE_IDENTIFIER - 132)) | (1L << (VARIABLE_IDENTIFIER - 132)) | (1L << (DOLLAR_IDENTIFIER - 132)) | (1L << (TEXT_LITERAL - 132)) | (1L << (INTEGER_LITERAL - 132)) | (1L << (DECIMAL_LITERAL - 132)))) != 0)) {
				{
				setState(2025); 
				((Javascript_method_expressionContext)_localctx).args = javascript_arguments(0);
				}
			}

			setState(2028); 
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
		int _startState = 326;
		enterRecursionRule(_localctx, 326, RULE_javascript_arguments, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavascriptArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2031); 
			((JavascriptArgumentListContext)_localctx).item = javascript_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2038);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavascriptArgumentListItemContext(new Javascript_argumentsContext(_parentctx, _parentState));
					((JavascriptArgumentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_javascript_arguments);
					setState(2033);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2034); 
					match(COMMA);
					setState(2035); 
					((JavascriptArgumentListItemContext)_localctx).item = javascript_expression(0);
					}
					} 
				}
				setState(2040);
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
		enterRule(_localctx, 328, RULE_javascript_item_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2041); 
			match(LBRAK);
			setState(2042); 
			((Javascript_item_expressionContext)_localctx).exp = javascript_expression(0);
			setState(2043); 
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
		enterRule(_localctx, 330, RULE_javascript_parenthesis_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2045); 
			match(LPAR);
			setState(2046); 
			((Javascript_parenthesis_expressionContext)_localctx).exp = javascript_expression(0);
			setState(2047); 
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
		enterRule(_localctx, 332, RULE_javascript_identifier_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2049); 
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
		enterRule(_localctx, 334, RULE_javascript_literal_expression);
		try {
			setState(2056);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				_localctx = new JavascriptIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2051); 
				((JavascriptIntegerLiteralContext)_localctx).t = match(INTEGER_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				_localctx = new JavascriptDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2052); 
				((JavascriptDecimalLiteralContext)_localctx).t = match(DECIMAL_LITERAL);
				}
				break;
			case TEXT_LITERAL:
				_localctx = new JavascriptTextLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2053); 
				((JavascriptTextLiteralContext)_localctx).t = match(TEXT_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new JavascriptBooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2054); 
				((JavascriptBooleanLiteralContext)_localctx).t = match(BOOLEAN_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new JavascriptCharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2055); 
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
		public TerminalNode BOOLEAN() { return getToken(EParser.BOOLEAN, 0); }
		public TerminalNode CHARACTER() { return getToken(EParser.CHARACTER, 0); }
		public TerminalNode TEXT() { return getToken(EParser.TEXT, 0); }
		public TerminalNode INTEGER() { return getToken(EParser.INTEGER, 0); }
		public TerminalNode DECIMAL() { return getToken(EParser.DECIMAL, 0); }
		public TerminalNode DATE() { return getToken(EParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(EParser.TIME, 0); }
		public TerminalNode DATETIME() { return getToken(EParser.DATETIME, 0); }
		public TerminalNode PERIOD() { return getToken(EParser.PERIOD, 0); }
		public TerminalNode READ() { return getToken(EParser.READ, 0); }
		public TerminalNode WRITE() { return getToken(EParser.WRITE, 0); }
		public TerminalNode TEST() { return getToken(EParser.TEST, 0); }
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
		enterRule(_localctx, 336, RULE_javascript_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2058);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (READ - 132)) | (1L << (TEST - 132)) | (1L << (WRITE - 132)) | (1L << (SYMBOL_IDENTIFIER - 132)) | (1L << (TYPE_IDENTIFIER - 132)) | (1L << (VARIABLE_IDENTIFIER - 132)) | (1L << (DOLLAR_IDENTIFIER - 132)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 338, RULE_python_statement);
		try {
			setState(2063);
			switch (_input.LA(1)) {
			case RETURN:
				_localctx = new PythonReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2060); 
				match(RETURN);
				setState(2061); 
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
				setState(2062); 
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
		int _startState = 340;
		enterRecursionRule(_localctx, 340, RULE_python_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PythonPrimaryExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2066); 
			((PythonPrimaryExpressionContext)_localctx).exp = python_primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(2072);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PythonSelectorExpressionContext(new Python_expressionContext(_parentctx, _parentState));
					((PythonSelectorExpressionContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_python_expression);
					setState(2068);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2069); 
					((PythonSelectorExpressionContext)_localctx).child = python_selector_expression();
					}
					} 
				}
				setState(2074);
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
		enterRule(_localctx, 342, RULE_python_primary_expression);
		try {
			setState(2079);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				_localctx = new PythonParenthesisExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2075); 
				((PythonParenthesisExpressionContext)_localctx).exp = python_parenthesis_expression();
				}
				break;
			case 2:
				_localctx = new PythonIdentifierExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2076); 
				((PythonIdentifierExpressionContext)_localctx).exp = python_identifier_expression(0);
				}
				break;
			case 3:
				_localctx = new PythonLiteralExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2077); 
				((PythonLiteralExpressionContext)_localctx).exp = python_literal_expression();
				}
				break;
			case 4:
				_localctx = new PythonGlobalMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2078); 
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
		enterRule(_localctx, 344, RULE_python_selector_expression);
		try {
			setState(2087);
			switch (_input.LA(1)) {
			case DOT:
				_localctx = new PythonMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2081); 
				match(DOT);
				setState(2082); 
				((PythonMethodExpressionContext)_localctx).exp = python_method_expression();
				}
				break;
			case LBRAK:
				_localctx = new PythonItemExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2083); 
				match(LBRAK);
				setState(2084); 
				((PythonItemExpressionContext)_localctx).exp = python_expression(0);
				setState(2085); 
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
		enterRule(_localctx, 346, RULE_python_method_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2089); 
			((Python_method_expressionContext)_localctx).name = python_identifier();
			setState(2090); 
			match(LPAR);
			setState(2092);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (READ - 132)) | (1L << (SELF - 132)) | (1L << (TEST - 132)) | (1L << (THIS - 132)) | (1L << (WRITE - 132)) | (1L << (BOOLEAN_LITERAL - 132)) | (1L << (CHAR_LITERAL - 132)) | (1L << (SYMBOL_IDENTIFIER - 132)) | (1L << (TYPE_IDENTIFIER - 132)) | (1L << (VARIABLE_IDENTIFIER - 132)) | (1L << (DOLLAR_IDENTIFIER - 132)) | (1L << (TEXT_LITERAL - 132)) | (1L << (INTEGER_LITERAL - 132)) | (1L << (DECIMAL_LITERAL - 132)))) != 0)) {
				{
				setState(2091); 
				((Python_method_expressionContext)_localctx).args = python_argument_list();
				}
			}

			setState(2094); 
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
		enterRule(_localctx, 348, RULE_python_argument_list);
		try {
			setState(2102);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				_localctx = new PythonOrdinalOnlyArgumentListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2096); 
				((PythonOrdinalOnlyArgumentListContext)_localctx).ordinal = python_ordinal_argument_list(0);
				}
				break;
			case 2:
				_localctx = new PythonNamedOnlyArgumentListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2097); 
				((PythonNamedOnlyArgumentListContext)_localctx).named = python_named_argument_list(0);
				}
				break;
			case 3:
				_localctx = new PythonArgumentListContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2098); 
				((PythonArgumentListContext)_localctx).ordinal = python_ordinal_argument_list(0);
				setState(2099); 
				match(COMMA);
				setState(2100); 
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
		int _startState = 350;
		enterRecursionRule(_localctx, 350, RULE_python_ordinal_argument_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PythonOrdinalArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2105); 
			((PythonOrdinalArgumentListContext)_localctx).item = python_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2112);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,174,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PythonOrdinalArgumentListItemContext(new Python_ordinal_argument_listContext(_parentctx, _parentState));
					((PythonOrdinalArgumentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_python_ordinal_argument_list);
					setState(2107);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2108); 
					match(COMMA);
					setState(2109); 
					((PythonOrdinalArgumentListItemContext)_localctx).item = python_expression(0);
					}
					} 
				}
				setState(2114);
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
		int _startState = 352;
		enterRecursionRule(_localctx, 352, RULE_python_named_argument_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PythonNamedArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2116); 
			((PythonNamedArgumentListContext)_localctx).name = python_identifier();
			setState(2117); 
			match(EQ);
			setState(2118); 
			((PythonNamedArgumentListContext)_localctx).exp = python_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2128);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PythonNamedArgumentListItemContext(new Python_named_argument_listContext(_parentctx, _parentState));
					((PythonNamedArgumentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_python_named_argument_list);
					setState(2120);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2121); 
					match(COMMA);
					setState(2122); 
					((PythonNamedArgumentListItemContext)_localctx).name = python_identifier();
					setState(2123); 
					match(EQ);
					setState(2124); 
					((PythonNamedArgumentListItemContext)_localctx).exp = python_expression(0);
					}
					} 
				}
				setState(2130);
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
		enterRule(_localctx, 354, RULE_python_parenthesis_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2131); 
			match(LPAR);
			setState(2132); 
			((Python_parenthesis_expressionContext)_localctx).exp = python_expression(0);
			setState(2133); 
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
		int _startState = 356;
		enterRecursionRule(_localctx, 356, RULE_python_identifier_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2138);
			switch (_input.LA(1)) {
			case DOLLAR_IDENTIFIER:
				{
				_localctx = new PythonPromptoIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2136); 
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
			case READ:
			case SELF:
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
				setState(2137); 
				((PythonIdentifierContext)_localctx).name = python_identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(2145);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PythonChildIdentifierContext(new Python_identifier_expressionContext(_parentctx, _parentState));
					((PythonChildIdentifierContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_python_identifier_expression);
					setState(2140);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2141); 
					match(DOT);
					setState(2142); 
					((PythonChildIdentifierContext)_localctx).name = python_identifier();
					}
					} 
				}
				setState(2147);
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
		enterRule(_localctx, 358, RULE_python_literal_expression);
		try {
			setState(2153);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				_localctx = new PythonIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2148); 
				((PythonIntegerLiteralContext)_localctx).t = match(INTEGER_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				_localctx = new PythonDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2149); 
				((PythonDecimalLiteralContext)_localctx).t = match(DECIMAL_LITERAL);
				}
				break;
			case TEXT_LITERAL:
				_localctx = new PythonTextLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2150); 
				((PythonTextLiteralContext)_localctx).t = match(TEXT_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new PythonBooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2151); 
				((PythonBooleanLiteralContext)_localctx).t = match(BOOLEAN_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new PythonCharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2152); 
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
		public TerminalNode TYPE_IDENTIFIER() { return getToken(EParser.TYPE_IDENTIFIER, 0); }
		public TerminalNode BOOLEAN() { return getToken(EParser.BOOLEAN, 0); }
		public TerminalNode CHARACTER() { return getToken(EParser.CHARACTER, 0); }
		public TerminalNode TEXT() { return getToken(EParser.TEXT, 0); }
		public TerminalNode INTEGER() { return getToken(EParser.INTEGER, 0); }
		public TerminalNode DECIMAL() { return getToken(EParser.DECIMAL, 0); }
		public TerminalNode DATE() { return getToken(EParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(EParser.TIME, 0); }
		public TerminalNode DATETIME() { return getToken(EParser.DATETIME, 0); }
		public TerminalNode PERIOD() { return getToken(EParser.PERIOD, 0); }
		public TerminalNode READ() { return getToken(EParser.READ, 0); }
		public TerminalNode WRITE() { return getToken(EParser.WRITE, 0); }
		public TerminalNode TEST() { return getToken(EParser.TEST, 0); }
		public TerminalNode SELF() { return getToken(EParser.SELF, 0); }
		public TerminalNode THIS() { return getToken(EParser.THIS, 0); }
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
		enterRule(_localctx, 360, RULE_python_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2155);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (READ - 132)) | (1L << (SELF - 132)) | (1L << (TEST - 132)) | (1L << (THIS - 132)) | (1L << (WRITE - 132)) | (1L << (SYMBOL_IDENTIFIER - 132)) | (1L << (TYPE_IDENTIFIER - 132)) | (1L << (VARIABLE_IDENTIFIER - 132)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 362, RULE_java_statement);
		try {
			setState(2164);
			switch (_input.LA(1)) {
			case RETURN:
				_localctx = new JavaReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2157); 
				match(RETURN);
				setState(2158); 
				((JavaReturnStatementContext)_localctx).exp = java_expression(0);
				setState(2159); 
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
				setState(2161); 
				((JavaStatementContext)_localctx).exp = java_expression(0);
				setState(2162); 
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
		int _startState = 364;
		enterRecursionRule(_localctx, 364, RULE_java_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavaPrimaryExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2167); 
			((JavaPrimaryExpressionContext)_localctx).exp = java_primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(2173);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavaSelectorExpressionContext(new Java_expressionContext(_parentctx, _parentState));
					((JavaSelectorExpressionContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_java_expression);
					setState(2169);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2170); 
					((JavaSelectorExpressionContext)_localctx).child = java_selector_expression();
					}
					} 
				}
				setState(2175);
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
		enterRule(_localctx, 366, RULE_java_primary_expression);
		try {
			setState(2181);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2176); 
				java_this_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2177); 
				java_new_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2178); 
				java_parenthesis_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2179); 
				java_identifier_expression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2180); 
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
		enterRule(_localctx, 368, RULE_java_this_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2183); 
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
		enterRule(_localctx, 370, RULE_java_new_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2185); 
			new_token();
			setState(2186); 
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
		enterRule(_localctx, 372, RULE_java_selector_expression);
		try {
			setState(2191);
			switch (_input.LA(1)) {
			case DOT:
				_localctx = new JavaMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2188); 
				match(DOT);
				setState(2189); 
				((JavaMethodExpressionContext)_localctx).exp = java_method_expression();
				}
				break;
			case LBRAK:
				_localctx = new JavaItemExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2190); 
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
		enterRule(_localctx, 374, RULE_java_method_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2193); 
			((Java_method_expressionContext)_localctx).name = java_identifier();
			setState(2194); 
			match(LPAR);
			setState(2196);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (READ - 132)) | (1L << (SELF - 132)) | (1L << (TEST - 132)) | (1L << (THIS - 132)) | (1L << (WRITE - 132)) | (1L << (BOOLEAN_LITERAL - 132)) | (1L << (CHAR_LITERAL - 132)) | (1L << (SYMBOL_IDENTIFIER - 132)) | (1L << (TYPE_IDENTIFIER - 132)) | (1L << (VARIABLE_IDENTIFIER - 132)) | (1L << (NATIVE_IDENTIFIER - 132)) | (1L << (DOLLAR_IDENTIFIER - 132)) | (1L << (TEXT_LITERAL - 132)) | (1L << (INTEGER_LITERAL - 132)) | (1L << (DECIMAL_LITERAL - 132)))) != 0)) {
				{
				setState(2195); 
				((Java_method_expressionContext)_localctx).args = java_arguments(0);
				}
			}

			setState(2198); 
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
		int _startState = 376;
		enterRecursionRule(_localctx, 376, RULE_java_arguments, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavaArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2201); 
			((JavaArgumentListContext)_localctx).item = java_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2208);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavaArgumentListItemContext(new Java_argumentsContext(_parentctx, _parentState));
					((JavaArgumentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_java_arguments);
					setState(2203);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2204); 
					match(COMMA);
					setState(2205); 
					((JavaArgumentListItemContext)_localctx).item = java_expression(0);
					}
					} 
				}
				setState(2210);
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
		enterRule(_localctx, 378, RULE_java_item_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2211); 
			match(LBRAK);
			setState(2212); 
			((Java_item_expressionContext)_localctx).exp = java_expression(0);
			setState(2213); 
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
		enterRule(_localctx, 380, RULE_java_parenthesis_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2215); 
			match(LPAR);
			setState(2216); 
			((Java_parenthesis_expressionContext)_localctx).exp = java_expression(0);
			setState(2217); 
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
		int _startState = 382;
		enterRecursionRule(_localctx, 382, RULE_java_identifier_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavaIdentifierContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2220); 
			((JavaIdentifierContext)_localctx).name = java_identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(2227);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavaChildIdentifierContext(new Java_identifier_expressionContext(_parentctx, _parentState));
					((JavaChildIdentifierContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_java_identifier_expression);
					setState(2222);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2223); 
					match(DOT);
					setState(2224); 
					((JavaChildIdentifierContext)_localctx).name = java_identifier();
					}
					} 
				}
				setState(2229);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
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
		int _startState = 384;
		enterRecursionRule(_localctx, 384, RULE_java_class_identifier_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavaClassIdentifierContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2231); 
			((JavaClassIdentifierContext)_localctx).klass = java_identifier_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2237);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavaChildClassIdentifierContext(new Java_class_identifier_expressionContext(_parentctx, _parentState));
					((JavaChildClassIdentifierContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_java_class_identifier_expression);
					setState(2233);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2234); 
					((JavaChildClassIdentifierContext)_localctx).name = match(DOLLAR_IDENTIFIER);
					}
					} 
				}
				setState(2239);
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
		enterRule(_localctx, 386, RULE_java_literal_expression);
		try {
			setState(2245);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				_localctx = new JavaIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2240); 
				((JavaIntegerLiteralContext)_localctx).t = match(INTEGER_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				_localctx = new JavaDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2241); 
				((JavaDecimalLiteralContext)_localctx).t = match(DECIMAL_LITERAL);
				}
				break;
			case TEXT_LITERAL:
				_localctx = new JavaTextLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2242); 
				((JavaTextLiteralContext)_localctx).t = match(TEXT_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new JavaBooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2243); 
				((JavaBooleanLiteralContext)_localctx).t = match(BOOLEAN_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new JavaCharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2244); 
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
		public TerminalNode NATIVE_IDENTIFIER() { return getToken(EParser.NATIVE_IDENTIFIER, 0); }
		public TerminalNode DOLLAR_IDENTIFIER() { return getToken(EParser.DOLLAR_IDENTIFIER, 0); }
		public TerminalNode TYPE_IDENTIFIER() { return getToken(EParser.TYPE_IDENTIFIER, 0); }
		public TerminalNode BOOLEAN() { return getToken(EParser.BOOLEAN, 0); }
		public TerminalNode CHARACTER() { return getToken(EParser.CHARACTER, 0); }
		public TerminalNode TEXT() { return getToken(EParser.TEXT, 0); }
		public TerminalNode INTEGER() { return getToken(EParser.INTEGER, 0); }
		public TerminalNode DECIMAL() { return getToken(EParser.DECIMAL, 0); }
		public TerminalNode DATE() { return getToken(EParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(EParser.TIME, 0); }
		public TerminalNode DATETIME() { return getToken(EParser.DATETIME, 0); }
		public TerminalNode PERIOD() { return getToken(EParser.PERIOD, 0); }
		public TerminalNode READ() { return getToken(EParser.READ, 0); }
		public TerminalNode WRITE() { return getToken(EParser.WRITE, 0); }
		public TerminalNode TEST() { return getToken(EParser.TEST, 0); }
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
		enterRule(_localctx, 388, RULE_java_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2247);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (READ - 132)) | (1L << (TEST - 132)) | (1L << (WRITE - 132)) | (1L << (SYMBOL_IDENTIFIER - 132)) | (1L << (TYPE_IDENTIFIER - 132)) | (1L << (VARIABLE_IDENTIFIER - 132)) | (1L << (NATIVE_IDENTIFIER - 132)) | (1L << (DOLLAR_IDENTIFIER - 132)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 390, RULE_csharp_statement);
		try {
			setState(2256);
			switch (_input.LA(1)) {
			case RETURN:
				_localctx = new CSharpReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2249); 
				match(RETURN);
				setState(2250); 
				((CSharpReturnStatementContext)_localctx).exp = csharp_expression(0);
				setState(2251); 
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
				setState(2253); 
				((CSharpStatementContext)_localctx).exp = csharp_expression(0);
				setState(2254); 
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
		int _startState = 392;
		enterRecursionRule(_localctx, 392, RULE_csharp_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new CSharpPrimaryExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2259); 
			((CSharpPrimaryExpressionContext)_localctx).exp = csharp_primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(2265);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CSharpSelectorExpressionContext(new Csharp_expressionContext(_parentctx, _parentState));
					((CSharpSelectorExpressionContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_csharp_expression);
					setState(2261);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2262); 
					((CSharpSelectorExpressionContext)_localctx).child = csharp_selector_expression();
					}
					} 
				}
				setState(2267);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
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
		enterRule(_localctx, 394, RULE_csharp_primary_expression);
		try {
			setState(2273);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2268); 
				csharp_this_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2269); 
				csharp_new_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2270); 
				csharp_parenthesis_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2271); 
				csharp_identifier_expression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2272); 
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
		enterRule(_localctx, 396, RULE_csharp_this_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2275); 
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
		enterRule(_localctx, 398, RULE_csharp_new_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2277); 
			new_token();
			setState(2278); 
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
		enterRule(_localctx, 400, RULE_csharp_selector_expression);
		try {
			setState(2283);
			switch (_input.LA(1)) {
			case DOT:
				_localctx = new CSharpMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2280); 
				match(DOT);
				setState(2281); 
				((CSharpMethodExpressionContext)_localctx).exp = csharp_method_expression();
				}
				break;
			case LBRAK:
				_localctx = new CSharpItemExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2282); 
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
		enterRule(_localctx, 402, RULE_csharp_method_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2285); 
			((Csharp_method_expressionContext)_localctx).name = csharp_identifier();
			setState(2286); 
			match(LPAR);
			setState(2288);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (READ - 132)) | (1L << (SELF - 132)) | (1L << (TEST - 132)) | (1L << (THIS - 132)) | (1L << (WRITE - 132)) | (1L << (BOOLEAN_LITERAL - 132)) | (1L << (CHAR_LITERAL - 132)) | (1L << (SYMBOL_IDENTIFIER - 132)) | (1L << (TYPE_IDENTIFIER - 132)) | (1L << (VARIABLE_IDENTIFIER - 132)) | (1L << (DOLLAR_IDENTIFIER - 132)) | (1L << (TEXT_LITERAL - 132)) | (1L << (INTEGER_LITERAL - 132)) | (1L << (DECIMAL_LITERAL - 132)))) != 0)) {
				{
				setState(2287); 
				((Csharp_method_expressionContext)_localctx).args = csharp_arguments(0);
				}
			}

			setState(2290); 
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
		int _startState = 404;
		enterRecursionRule(_localctx, 404, RULE_csharp_arguments, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new CSharpArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2293); 
			((CSharpArgumentListContext)_localctx).item = csharp_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2300);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,193,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CSharpArgumentListItemContext(new Csharp_argumentsContext(_parentctx, _parentState));
					((CSharpArgumentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_csharp_arguments);
					setState(2295);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2296); 
					match(COMMA);
					setState(2297); 
					((CSharpArgumentListItemContext)_localctx).item = csharp_expression(0);
					}
					} 
				}
				setState(2302);
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
		enterRule(_localctx, 406, RULE_csharp_item_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2303); 
			match(LBRAK);
			setState(2304); 
			((Csharp_item_expressionContext)_localctx).exp = csharp_expression(0);
			setState(2305); 
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
		enterRule(_localctx, 408, RULE_csharp_parenthesis_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2307); 
			match(LPAR);
			setState(2308); 
			((Csharp_parenthesis_expressionContext)_localctx).exp = csharp_expression(0);
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
		int _startState = 410;
		enterRecursionRule(_localctx, 410, RULE_csharp_identifier_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2314);
			switch (_input.LA(1)) {
			case DOLLAR_IDENTIFIER:
				{
				_localctx = new CSharpPromptoIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2312); 
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
			case READ:
			case TEST:
			case WRITE:
			case SYMBOL_IDENTIFIER:
			case TYPE_IDENTIFIER:
			case VARIABLE_IDENTIFIER:
				{
				_localctx = new CSharpIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2313); 
				((CSharpIdentifierContext)_localctx).name = csharp_identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(2321);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CSharpChildIdentifierContext(new Csharp_identifier_expressionContext(_parentctx, _parentState));
					((CSharpChildIdentifierContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_csharp_identifier_expression);
					setState(2316);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2317); 
					match(DOT);
					setState(2318); 
					((CSharpChildIdentifierContext)_localctx).name = csharp_identifier();
					}
					} 
				}
				setState(2323);
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
		enterRule(_localctx, 412, RULE_csharp_literal_expression);
		try {
			setState(2329);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				_localctx = new CSharpIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2324); 
				match(INTEGER_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				_localctx = new CSharpDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2325); 
				match(DECIMAL_LITERAL);
				}
				break;
			case TEXT_LITERAL:
				_localctx = new CSharpTextLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2326); 
				match(TEXT_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new CSharpBooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2327); 
				match(BOOLEAN_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new CSharpCharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2328); 
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
		public TerminalNode TYPE_IDENTIFIER() { return getToken(EParser.TYPE_IDENTIFIER, 0); }
		public TerminalNode BOOLEAN() { return getToken(EParser.BOOLEAN, 0); }
		public TerminalNode CHARACTER() { return getToken(EParser.CHARACTER, 0); }
		public TerminalNode TEXT() { return getToken(EParser.TEXT, 0); }
		public TerminalNode INTEGER() { return getToken(EParser.INTEGER, 0); }
		public TerminalNode DECIMAL() { return getToken(EParser.DECIMAL, 0); }
		public TerminalNode DATE() { return getToken(EParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(EParser.TIME, 0); }
		public TerminalNode DATETIME() { return getToken(EParser.DATETIME, 0); }
		public TerminalNode PERIOD() { return getToken(EParser.PERIOD, 0); }
		public TerminalNode READ() { return getToken(EParser.READ, 0); }
		public TerminalNode WRITE() { return getToken(EParser.WRITE, 0); }
		public TerminalNode TEST() { return getToken(EParser.TEST, 0); }
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
		enterRule(_localctx, 414, RULE_csharp_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2331);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (READ - 132)) | (1L << (TEST - 132)) | (1L << (WRITE - 132)) | (1L << (SYMBOL_IDENTIFIER - 132)) | (1L << (TYPE_IDENTIFIER - 132)) | (1L << (VARIABLE_IDENTIFIER - 132)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
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
		case 16: 
			return native_category_binding_list_sempred((Native_category_binding_listContext)_localctx, predIndex);
		case 37: 
			return else_if_statement_list_sempred((Else_if_statement_listContext)_localctx, predIndex);
		case 43: 
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 44: 
			return unresolved_expression_sempred((Unresolved_expressionContext)_localctx, predIndex);
		case 45: 
			return unresolved_selector_sempred((Unresolved_selectorContext)_localctx, predIndex);
		case 47: 
			return invocation_trailer_sempred((Invocation_trailerContext)_localctx, predIndex);
		case 48: 
			return instance_expression_sempred((Instance_expressionContext)_localctx, predIndex);
		case 49: 
			return instance_selector_sempred((Instance_selectorContext)_localctx, predIndex);
		case 58: 
			return argument_assignment_list_sempred((Argument_assignment_listContext)_localctx, predIndex);
		case 59: 
			return with_argument_assignment_list_sempred((With_argument_assignment_listContext)_localctx, predIndex);
		case 62: 
			return child_instance_sempred((Child_instanceContext)_localctx, predIndex);
		case 82: 
			return typedef_sempred((TypedefContext)_localctx, predIndex);
		case 102: 
			return any_type_sempred((Any_typeContext)_localctx, predIndex);
		case 139: 
			return assignable_instance_sempred((Assignable_instanceContext)_localctx, predIndex);
		case 140: 
			return is_expression_sempred((Is_expressionContext)_localctx, predIndex);
		case 146: 
			return new_token_sempred((New_tokenContext)_localctx, predIndex);
		case 147: 
			return key_token_sempred((Key_tokenContext)_localctx, predIndex);
		case 148: 
			return module_token_sempred((Module_tokenContext)_localctx, predIndex);
		case 149: 
			return value_token_sempred((Value_tokenContext)_localctx, predIndex);
		case 150: 
			return symbols_token_sempred((Symbols_tokenContext)_localctx, predIndex);
		case 157: 
			return javascript_expression_sempred((Javascript_expressionContext)_localctx, predIndex);
		case 163: 
			return javascript_arguments_sempred((Javascript_argumentsContext)_localctx, predIndex);
		case 170: 
			return python_expression_sempred((Python_expressionContext)_localctx, predIndex);
		case 175: 
			return python_ordinal_argument_list_sempred((Python_ordinal_argument_listContext)_localctx, predIndex);
		case 176: 
			return python_named_argument_list_sempred((Python_named_argument_listContext)_localctx, predIndex);
		case 178: 
			return python_identifier_expression_sempred((Python_identifier_expressionContext)_localctx, predIndex);
		case 182: 
			return java_expression_sempred((Java_expressionContext)_localctx, predIndex);
		case 188: 
			return java_arguments_sempred((Java_argumentsContext)_localctx, predIndex);
		case 191: 
			return java_identifier_expression_sempred((Java_identifier_expressionContext)_localctx, predIndex);
		case 192: 
			return java_class_identifier_expression_sempred((Java_class_identifier_expressionContext)_localctx, predIndex);
		case 196: 
			return csharp_expression_sempred((Csharp_expressionContext)_localctx, predIndex);
		case 202: 
			return csharp_arguments_sempred((Csharp_argumentsContext)_localctx, predIndex);
		case 205: 
			return csharp_identifier_expression_sempred((Csharp_identifier_expressionContext)_localctx, predIndex);
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
			return precpred(_ctx, 40);
		case 3: 
			return precpred(_ctx, 39);
		case 4: 
			return precpred(_ctx, 38);
		case 5: 
			return precpred(_ctx, 37);
		case 6: 
			return precpred(_ctx, 36);
		case 7: 
			return precpred(_ctx, 35);
		case 8: 
			return precpred(_ctx, 34);
		case 9: 
			return precpred(_ctx, 33);
		case 10: 
			return precpred(_ctx, 32);
		case 11: 
			return precpred(_ctx, 29);
		case 12: 
			return precpred(_ctx, 28);
		case 13: 
			return precpred(_ctx, 27);
		case 14: 
			return precpred(_ctx, 26);
		case 15: 
			return precpred(_ctx, 25);
		case 16: 
			return precpred(_ctx, 24);
		case 17: 
			return precpred(_ctx, 22);
		case 18: 
			return precpred(_ctx, 21);
		case 19: 
			return precpred(_ctx, 20);
		case 20: 
			return precpred(_ctx, 19);
		case 21: 
			return precpred(_ctx, 18);
		case 22: 
			return precpred(_ctx, 17);
		case 23: 
			return precpred(_ctx, 16);
		case 24: 
			return precpred(_ctx, 15);
		case 25: 
			return precpred(_ctx, 1);
		case 26: 
			return precpred(_ctx, 31);
		case 27: 
			return precpred(_ctx, 30);
		case 28: 
			return precpred(_ctx, 23);
		case 29: 
			return precpred(_ctx, 8);
		}
		return true;
	}
	private boolean unresolved_expression_sempred(Unresolved_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 30: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean unresolved_selector_sempred(Unresolved_selectorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 31: 
			return this.wasNot(EParser.WS);
		}
		return true;
	}
	private boolean invocation_trailer_sempred(Invocation_trailerContext _localctx, int predIndex) {
		switch (predIndex) {
		case 32: 
			return this.willBe(EParser.LF);
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
			return this.wasNot(EParser.WS);
		case 35: 
			return this.wasNot(EParser.WS);
		case 36: 
			return this.wasNot(EParser.WS);
		}
		return true;
	}
	private boolean argument_assignment_list_sempred(Argument_assignment_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 37: 
			return this.was(EParser.WS);
		}
		return true;
	}
	private boolean with_argument_assignment_list_sempred(With_argument_assignment_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 38: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean child_instance_sempred(Child_instanceContext _localctx, int predIndex) {
		switch (predIndex) {
		case 39: 
			return this.wasNot(EParser.WS);
		case 40: 
			return this.wasNot(EParser.WS);
		}
		return true;
	}
	private boolean typedef_sempred(TypedefContext _localctx, int predIndex) {
		switch (predIndex) {
		case 41: 
			return precpred(_ctx, 5);
		case 42: 
			return precpred(_ctx, 4);
		case 43: 
			return precpred(_ctx, 3);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u00af\u0920\4\2\t"+
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
		"\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u01a9\n\2\3\2\3\2\3\2\3\2\3\2\5\2\u01b0\n"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5\u01ce\n\5\3\6\3\6\3\6"+
		"\3\6\5\6\u01d4\n\6\3\6\3\6\3\6\5\6\u01d9\n\6\3\6\3\6\3\6\3\6\5\6\u01df"+
		"\n\6\5\6\u01e1\n\6\3\6\5\6\u01e4\n\6\3\7\3\7\3\7\3\7\5\7\u01ea\n\7\3\7"+
		"\3\7\5\7\u01ee\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u01f9\n\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0202\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\5\b\u0211\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u021a"+
		"\n\b\3\t\3\t\3\t\3\t\3\t\5\t\u0221\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\5\n\u022b\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u0241\n\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\5\16"+
		"\u0258\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\5\17"+
		"\u0265\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0270\n"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u027e"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u028c\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u029a\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\7\22\u02ac\n\22\f\22\16\22\u02af\13\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u02b9\n\23\5\23\u02bb\n\23\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u02c4\n\24\3\24\3\24\5\24\u02c8"+
		"\n\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u02d0\n\25\3\25\3\25\5\25\u02d4"+
		"\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u02e0\n\26"+
		"\3\26\3\26\3\26\5\26\u02e5\n\26\3\26\3\26\5\26\u02e9\n\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0304\n\27\3\30\3\30"+
		"\3\31\3\31\3\31\5\31\u030b\n\31\3\32\3\32\3\32\5\32\u0310\n\32\3\32\3"+
		"\32\5\32\u0314\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0329\n\33\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0337\n\35\3\36"+
		"\3\36\5\36\u033b\n\36\3\36\5\36\u033e\n\36\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!"+
		"\3!\3!\3!\3!\3!\5!\u035f\n!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0372\n\"\3#\3#\3#\3#\3#\5#\u0379\n#\3#\3"+
		"#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\5&\u039b\n&\3&\3&\3&\3&\3&\3&\3&\5&\u03a4\n&\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\7\'\u03b9\n\'\f\'\16\'\u03bc\13\'\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\5)\u03cb\n)\3)\3)\3)\5)\u03d0\n)\3)\3)\3)\3)\3)\3)\5)\u03d8\n"+
		")\3)\3)\3)\3)\3)\3)\3)\5)\u03e1\n)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u03f8\n*\3+\3+\3,\3,\5,\u03fe\n,\3-\3"+
		"-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3"+
		"-\3-\3-\3-\5-\u041c\n-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3"+
		"-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3"+
		"-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3"+
		"-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3"+
		"-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\7-\u0485\n-\f"+
		"-\16-\u0488\13-\3.\3.\3.\3.\3.\7.\u048f\n.\f.\16.\u0492\13.\3/\3/\3/\3"+
		"/\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3\62\3\62\7\62\u04a4"+
		"\n\62\f\62\16\62\u04a7\13\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\5\63\u04b6\n\63\3\64\3\64\3\64\5\64\u04bb\n\64"+
		"\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\5\66\u04c5\n\66\3\66\3\66\3\66"+
		"\5\66\u04ca\n\66\5\66\u04cc\n\66\3\66\3\66\3\66\3\66\5\66\u04d2\n\66\5"+
		"\66\u04d4\n\66\5\66\u04d6\n\66\3\67\3\67\3\67\3\67\3\67\38\38\38\38\3"+
		"9\39\39\39\39\39\3:\3:\3:\5:\u04ea\n:\3:\3:\3:\3:\3:\5:\u04f1\n:\3:\5"+
		":\u04f4\n:\3:\3:\3:\3:\5:\u04fa\n:\3:\3:\5:\u04fe\n:\3:\3:\3:\5:\u0503"+
		"\n:\5:\u0505\n:\3;\3;\5;\u0509\n;\3;\3;\3;\3;\3;\3;\5;\u0511\n;\3<\3<"+
		"\3<\3<\3<\5<\u0518\n<\5<\u051a\n<\3<\3<\3<\5<\u051f\n<\5<\u0521\n<\3="+
		"\3=\3=\3=\3=\3=\3=\7=\u052a\n=\f=\16=\u052d\13=\3>\3>\3>\3>\3?\3?\3?\3"+
		"?\3@\3@\3@\3@\3@\3@\3@\3@\5@\u053f\n@\3A\3A\3A\3A\3B\7B\u0546\nB\fB\16"+
		"B\u0549\13B\3C\6C\u054c\nC\rC\16C\u054d\3D\6D\u0551\nD\rD\16D\u0552\3"+
		"D\3D\3E\7E\u0558\nE\fE\16E\u055b\13E\3E\3E\3F\3F\3G\5G\u0562\nG\3G\3G"+
		"\3G\3H\3H\3H\3H\7H\u056b\nH\fH\16H\u056e\13H\3I\3I\3I\7I\u0573\nI\fI\16"+
		"I\u0576\13I\3I\3I\3I\3I\3I\5I\u057d\nI\3J\3J\3K\3K\5K\u0583\nK\3L\3L\3"+
		"L\3L\7L\u0589\nL\fL\16L\u058c\13L\3M\3M\3M\3M\7M\u0592\nM\fM\16M\u0595"+
		"\13M\3N\3N\3N\7N\u059a\nN\fN\16N\u059d\13N\3O\3O\3O\3O\3O\3O\3O\3O\3O"+
		"\3O\5O\u05a9\nO\3P\5P\u05ac\nP\3P\3P\5P\u05b0\nP\3P\3P\3Q\5Q\u05b5\nQ"+
		"\3Q\3Q\5Q\u05b9\nQ\3Q\3Q\3R\3R\3R\7R\u05c0\nR\fR\16R\u05c3\13R\3S\3S\3"+
		"S\3S\3S\3S\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\5T\u05d7\nT\3T\3T\3T\3"+
		"T\3T\3T\3T\3T\7T\u05e1\nT\fT\16T\u05e4\13T\3U\3U\5U\u05e8\nU\3V\3V\3V"+
		"\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\5V\u05f8\nV\3W\3W\3X\5X\u05fd\nX\3X"+
		"\3X\3Y\3Y\3Z\3Z\3Z\5Z\u0606\nZ\3[\3[\3[\7[\u060b\n[\f[\16[\u060e\13[\3"+
		"\\\3\\\5\\\u0612\n\\\3]\3]\3]\5]\u0617\n]\3^\3^\3_\3_\3`\3`\3a\3a\3b\3"+
		"b\3b\7b\u0624\nb\fb\16b\u0627\13b\3c\3c\5c\u062b\nc\3c\5c\u062e\nc\3d"+
		"\3d\5d\u0632\nd\3e\3e\3e\5e\u0637\ne\3f\3f\3f\3g\3g\5g\u063e\ng\3h\3h"+
		"\3h\3h\3h\3h\3h\3h\3h\7h\u0649\nh\fh\16h\u064c\13h\3i\3i\3i\3i\7i\u0652"+
		"\ni\fi\16i\u0655\13i\3j\3j\3j\3j\3j\5j\u065c\nj\3k\3k\3k\3k\7k\u0662\n"+
		"k\fk\16k\u0665\13k\3l\3l\3l\5l\u066a\nl\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m"+
		"\5m\u0676\nm\3n\3n\5n\u067a\nn\3o\3o\3o\3o\3o\3o\7o\u0682\no\fo\16o\u0685"+
		"\13o\3p\3p\5p\u0689\np\3q\3q\3q\3q\5q\u068f\nq\3q\3q\3q\7q\u0694\nq\f"+
		"q\16q\u0697\13q\3q\3q\5q\u069b\nq\3r\3r\3r\7r\u06a0\nr\fr\16r\u06a3\13"+
		"r\3s\3s\3s\7s\u06a8\ns\fs\16s\u06ab\13s\3t\3t\3t\3t\5t\u06b1\nt\3u\3u"+
		"\3v\3v\3v\3v\7v\u06b9\nv\fv\16v\u06bc\13v\3w\3w\3w\3w\3w\3w\3w\3w\3w\3"+
		"w\5w\u06c8\nw\3x\3x\5x\u06cc\nx\3x\5x\u06cf\nx\3y\3y\5y\u06d3\ny\3y\5"+
		"y\u06d6\ny\3z\3z\3z\3z\7z\u06dc\nz\fz\16z\u06df\13z\3{\3{\3{\3{\7{\u06e5"+
		"\n{\f{\16{\u06e8\13{\3|\3|\3|\3|\7|\u06ee\n|\f|\16|\u06f1\13|\3}\3}\3"+
		"}\3}\7}\u06f7\n}\f}\16}\u06fa\13}\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~"+
		"\3~\3~\5~\u070a\n~\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177"+
		"\3\177\3\177\3\177\3\177\3\177\5\177\u071a\n\177\3\u0080\3\u0080\3\u0080"+
		"\7\u0080\u071f\n\u0080\f\u0080\16\u0080\u0722\13\u0080\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\5\u0081\u0728\n\u0081\3\u0082\3\u0082\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0084\3\u0084\5\u0084\u0732\n\u0084\3\u0085\3\u0085"+
		"\3\u0085\3\u0085\3\u0085\5\u0085\u0739\n\u0085\3\u0086\5\u0086\u073c\n"+
		"\u0086\3\u0086\3\u0086\5\u0086\u0740\n\u0086\3\u0086\3\u0086\3\u0087\5"+
		"\u0087\u0745\n\u0087\3\u0087\3\u0087\5\u0087\u0749\n\u0087\3\u0087\3\u0087"+
		"\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\7\u0088\u0752\n\u0088\f\u0088"+
		"\16\u0088\u0755\13\u0088\5\u0088\u0757\n\u0088\3\u0089\3\u0089\3\u0089"+
		"\7\u0089\u075c\n\u0089\f\u0089\16\u0089\u075f\13\u0089\3\u008a\3\u008a"+
		"\3\u008a\3\u008a\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b"+
		"\3\u008b\3\u008b\5\u008b\u076e\n\u008b\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\7\u008d\u0779\n\u008d\f\u008d"+
		"\16\u008d\u077c\13\u008d\3\u008e\3\u008e\3\u008e\3\u008e\5\u008e\u0782"+
		"\n\u008e\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u0090\3\u0090\3\u0090"+
		"\3\u0090\3\u0090\3\u0091\3\u0091\3\u0091\7\u0091\u0791\n\u0091\f\u0091"+
		"\16\u0091\u0794\13\u0091\3\u0092\3\u0092\3\u0092\7\u0092\u0799\n\u0092"+
		"\f\u0092\16\u0092\u079c\13\u0092\3\u0092\5\u0092\u079f\n\u0092\3\u0093"+
		"\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\5\u0093\u07a7\n\u0093\3\u0094"+
		"\3\u0094\3\u0094\3\u0095\3\u0095\3\u0095\3\u0096\3\u0096\3\u0096\3\u0097"+
		"\3\u0097\3\u0097\3\u0098\3\u0098\3\u0098\3\u0099\3\u0099\3\u009a\3\u009a"+
		"\3\u009b\3\u009b\3\u009c\3\u009c\3\u009d\3\u009d\3\u009e\3\u009e\3\u009e"+
		"\3\u009e\3\u009e\3\u009e\3\u009e\5\u009e\u07c9\n\u009e\3\u009f\3\u009f"+
		"\3\u009f\3\u009f\3\u009f\7\u009f\u07d0\n\u009f\f\u009f\16\u009f\u07d3"+
		"\13\u009f\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\5\u00a0"+
		"\u07dc\n\u00a0\3\u00a1\3\u00a1\3\u00a2\3\u00a2\3\u00a2\3\u00a3\3\u00a3"+
		"\3\u00a3\3\u00a3\3\u00a3\5\u00a3\u07e8\n\u00a3\3\u00a4\3\u00a4\3\u00a4"+
		"\5\u00a4\u07ed\n\u00a4\3\u00a4\3\u00a4\3\u00a5\3\u00a5\3\u00a5\3\u00a5"+
		"\3\u00a5\3\u00a5\7\u00a5\u07f7\n\u00a5\f\u00a5\16\u00a5\u07fa\13\u00a5"+
		"\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a8"+
		"\3\u00a8\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\5\u00a9\u080b\n\u00a9"+
		"\3\u00aa\3\u00aa\3\u00ab\3\u00ab\3\u00ab\5\u00ab\u0812\n\u00ab\3\u00ac"+
		"\3\u00ac\3\u00ac\3\u00ac\3\u00ac\7\u00ac\u0819\n\u00ac\f\u00ac\16\u00ac"+
		"\u081c\13\u00ac\3\u00ad\3\u00ad\3\u00ad\3\u00ad\5\u00ad\u0822\n\u00ad"+
		"\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\5\u00ae\u082a\n\u00ae"+
		"\3\u00af\3\u00af\3\u00af\5\u00af\u082f\n\u00af\3\u00af\3\u00af\3\u00b0"+
		"\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\5\u00b0\u0839\n\u00b0\3\u00b1"+
		"\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\7\u00b1\u0841\n\u00b1\f\u00b1"+
		"\16\u00b1\u0844\13\u00b1\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2"+
		"\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\7\u00b2\u0851\n\u00b2\f\u00b2"+
		"\16\u00b2\u0854\13\u00b2\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b4\3\u00b4"+
		"\3\u00b4\5\u00b4\u085d\n\u00b4\3\u00b4\3\u00b4\3\u00b4\7\u00b4\u0862\n"+
		"\u00b4\f\u00b4\16\u00b4\u0865\13\u00b4\3\u00b5\3\u00b5\3\u00b5\3\u00b5"+
		"\3\u00b5\5\u00b5\u086c\n\u00b5\3\u00b6\3\u00b6\3\u00b7\3\u00b7\3\u00b7"+
		"\3\u00b7\3\u00b7\3\u00b7\3\u00b7\5\u00b7\u0877\n\u00b7\3\u00b8\3\u00b8"+
		"\3\u00b8\3\u00b8\3\u00b8\7\u00b8\u087e\n\u00b8\f\u00b8\16\u00b8\u0881"+
		"\13\u00b8\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\5\u00b9\u0888\n\u00b9"+
		"\3\u00ba\3\u00ba\3\u00bb\3\u00bb\3\u00bb\3\u00bc\3\u00bc\3\u00bc\5\u00bc"+
		"\u0892\n\u00bc\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u0897\n\u00bd\3\u00bd\3"+
		"\u00bd\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\7\u00be\u08a1\n"+
		"\u00be\f\u00be\16\u00be\u08a4\13\u00be\3\u00bf\3\u00bf\3\u00bf\3\u00bf"+
		"\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1"+
		"\3\u00c1\7\u00c1\u08b4\n\u00c1\f\u00c1\16\u00c1\u08b7\13\u00c1\3\u00c2"+
		"\3\u00c2\3\u00c2\3\u00c2\3\u00c2\7\u00c2\u08be\n\u00c2\f\u00c2\16\u00c2"+
		"\u08c1\13\u00c2\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\5\u00c3\u08c8"+
		"\n\u00c3\3\u00c4\3\u00c4\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5"+
		"\3\u00c5\5\u00c5\u08d3\n\u00c5\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6"+
		"\7\u00c6\u08da\n\u00c6\f\u00c6\16\u00c6\u08dd\13\u00c6\3\u00c7\3\u00c7"+
		"\3\u00c7\3\u00c7\3\u00c7\5\u00c7\u08e4\n\u00c7\3\u00c8\3\u00c8\3\u00c9"+
		"\3\u00c9\3\u00c9\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u08ee\n\u00ca\3\u00cb"+
		"\3\u00cb\3\u00cb\5\u00cb\u08f3\n\u00cb\3\u00cb\3\u00cb\3\u00cc\3\u00cc"+
		"\3\u00cc\3\u00cc\3\u00cc\3\u00cc\7\u00cc\u08fd\n\u00cc\f\u00cc\16\u00cc"+
		"\u0900\13\u00cc\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00ce\3\u00ce\3\u00ce"+
		"\3\u00ce\3\u00cf\3\u00cf\3\u00cf\5\u00cf\u090d\n\u00cf\3\u00cf\3\u00cf"+
		"\3\u00cf\7\u00cf\u0912\n\u00cf\f\u00cf\16\u00cf\u0915\13\u00cf\3\u00d0"+
		"\3\u00d0\3\u00d0\3\u00d0\3\u00d0\5\u00d0\u091c\n\u00d0\3\u00d1\3\u00d1"+
		"\3\u00d1\2\30\"LXZbx\u00a6\u00ce\u0118\u013c\u0148\u0156\u0160\u0162\u0166"+
		"\u016e\u017a\u0180\u0182\u018a\u0196\u019c\u00d2\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp"+
		"rtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac"+
		"\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4"+
		"\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc"+
		"\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4"+
		"\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c"+
		"\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124"+
		"\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c"+
		"\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154"+
		"\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c"+
		"\u016e\u0170\u0172\u0174\u0176\u0178\u017a\u017c\u017e\u0180\u0182\u0184"+
		"\u0186\u0188\u018a\u018c\u018e\u0190\u0192\u0194\u0196\u0198\u019a\u019c"+
		"\u019e\u01a0\2\13\3\2\"#\4\2\u0090\u0090\u00a4\u00a4\4\2\u008c\u008c\u0094"+
		"\u0094\4\2KK\\\\\4\2\'\'vv\b\2\64<\u0086\u0086\u0093\u0093\u009d\u009d"+
		"\u00a2\u00a4\u00a6\u00a6\b\2\64<\u0086\u0086\u008c\u008c\u0093\u0094\u009d"+
		"\u009d\u00a2\u00a4\7\2\64<\u0086\u0086\u0093\u0093\u009d\u009d\u00a2\u00a6"+
		"\7\2\64<\u0086\u0086\u0093\u0093\u009d\u009d\u00a2\u00a4\u09a6\2\u01a2"+
		"\3\2\2\2\4\u01b7\3\2\2\2\6\u01c3\3\2\2\2\b\u01c9\3\2\2\2\n\u01cf\3\2\2"+
		"\2\f\u01e5\3\2\2\2\16\u0203\3\2\2\2\20\u0220\3\2\2\2\22\u0222\3\2\2\2"+
		"\24\u0232\3\2\2\2\26\u023c\3\2\2\2\30\u0249\3\2\2\2\32\u0253\3\2\2\2\34"+
		"\u0260\3\2\2\2\36\u027f\3\2\2\2 \u029b\3\2\2\2\"\u02a4\3\2\2\2$\u02ba"+
		"\3\2\2\2&\u02bc\3\2\2\2(\u02c9\3\2\2\2*\u02db\3\2\2\2,\u02f0\3\2\2\2."+
		"\u0305\3\2\2\2\60\u0307\3\2\2\2\62\u030c\3\2\2\2\64\u0328\3\2\2\2\66\u032a"+
		"\3\2\2\28\u0336\3\2\2\2:\u033d\3\2\2\2<\u033f\3\2\2\2>\u0348\3\2\2\2@"+
		"\u0351\3\2\2\2B\u0371\3\2\2\2D\u0373\3\2\2\2F\u0381\3\2\2\2H\u038a\3\2"+
		"\2\2J\u0391\3\2\2\2L\u03a5\3\2\2\2N\u03bd\3\2\2\2P\u03c0\3\2\2\2R\u03f7"+
		"\3\2\2\2T\u03f9\3\2\2\2V\u03fb\3\2\2\2X\u041b\3\2\2\2Z\u0489\3\2\2\2\\"+
		"\u0493\3\2\2\2^\u0497\3\2\2\2`\u049c\3\2\2\2b\u049e\3\2\2\2d\u04b5\3\2"+
		"\2\2f\u04b7\3\2\2\2h\u04bc\3\2\2\2j\u04d5\3\2\2\2l\u04d7\3\2\2\2n\u04dc"+
		"\3\2\2\2p\u04e0\3\2\2\2r\u0504\3\2\2\2t\u0506\3\2\2\2v\u0520\3\2\2\2x"+
		"\u0522\3\2\2\2z\u052e\3\2\2\2|\u0532\3\2\2\2~\u053e\3\2\2\2\u0080\u0540"+
		"\3\2\2\2\u0082\u0547\3\2\2\2\u0084\u054b\3\2\2\2\u0086\u0550\3\2\2\2\u0088"+
		"\u0559\3\2\2\2\u008a\u055e\3\2\2\2\u008c\u0561\3\2\2\2\u008e\u0566\3\2"+
		"\2\2\u0090\u0574\3\2\2\2\u0092\u057e\3\2\2\2\u0094\u0582\3\2\2\2\u0096"+
		"\u0584\3\2\2\2\u0098\u058d\3\2\2\2\u009a\u0596\3\2\2\2\u009c\u05a8\3\2"+
		"\2\2\u009e\u05ab\3\2\2\2\u00a0\u05b4\3\2\2\2\u00a2\u05bc\3\2\2\2\u00a4"+
		"\u05c4\3\2\2\2\u00a6\u05d6\3\2\2\2\u00a8\u05e7\3\2\2\2\u00aa\u05f7\3\2"+
		"\2\2\u00ac\u05f9\3\2\2\2\u00ae\u05fc\3\2\2\2\u00b0\u0600\3\2\2\2\u00b2"+
		"\u0605\3\2\2\2\u00b4\u0607\3\2\2\2\u00b6\u0611\3\2\2\2\u00b8\u0616\3\2"+
		"\2\2\u00ba\u0618\3\2\2\2\u00bc\u061a\3\2\2\2\u00be\u061c\3\2\2\2\u00c0"+
		"\u061e\3\2\2\2\u00c2\u0620\3\2\2\2\u00c4\u062d\3\2\2\2\u00c6\u0631\3\2"+
		"\2\2\u00c8\u0633\3\2\2\2\u00ca\u0638\3\2\2\2\u00cc\u063d\3\2\2\2\u00ce"+
		"\u063f\3\2\2\2\u00d0\u064d\3\2\2\2\u00d2\u065b\3\2\2\2\u00d4\u065d\3\2"+
		"\2\2\u00d6\u0669\3\2\2\2\u00d8\u0675\3\2\2\2\u00da\u0677\3\2\2\2\u00dc"+
		"\u067b\3\2\2\2\u00de\u0686\3\2\2\2\u00e0\u068a\3\2\2\2\u00e2\u069c\3\2"+
		"\2\2\u00e4\u06a4\3\2\2\2\u00e6\u06b0\3\2\2\2\u00e8\u06b2\3\2\2\2\u00ea"+
		"\u06b4\3\2\2\2\u00ec\u06c7\3\2\2\2\u00ee\u06c9\3\2\2\2\u00f0\u06d0\3\2"+
		"\2\2\u00f2\u06d7\3\2\2\2\u00f4\u06e0\3\2\2\2\u00f6\u06e9\3\2\2\2\u00f8"+
		"\u06f2\3\2\2\2\u00fa\u0709\3\2\2\2\u00fc\u0719\3\2\2\2\u00fe\u071b\3\2"+
		"\2\2\u0100\u0727\3\2\2\2\u0102\u0729\3\2\2\2\u0104\u072b\3\2\2\2\u0106"+
		"\u0731\3\2\2\2\u0108\u0738\3\2\2\2\u010a\u073b\3\2\2\2\u010c\u0744\3\2"+
		"\2\2\u010e\u074c\3\2\2\2\u0110\u0758\3\2\2\2\u0112\u0760\3\2\2\2\u0114"+
		"\u076d\3\2\2\2\u0116\u076f\3\2\2\2\u0118\u0773\3\2\2\2\u011a\u0781\3\2"+
		"\2\2\u011c\u0783\3\2\2\2\u011e\u0788\3\2\2\2\u0120\u078d\3\2\2\2\u0122"+
		"\u0795\3\2\2\2\u0124\u07a6\3\2\2\2\u0126\u07a8\3\2\2\2\u0128\u07ab\3\2"+
		"\2\2\u012a\u07ae\3\2\2\2\u012c\u07b1\3\2\2\2\u012e\u07b4\3\2\2\2\u0130"+
		"\u07b7\3\2\2\2\u0132\u07b9\3\2\2\2\u0134\u07bb\3\2\2\2\u0136\u07bd\3\2"+
		"\2\2\u0138\u07bf\3\2\2\2\u013a\u07c8\3\2\2\2\u013c\u07ca\3\2\2\2\u013e"+
		"\u07db\3\2\2\2\u0140\u07dd\3\2\2\2\u0142\u07df\3\2\2\2\u0144\u07e7\3\2"+
		"\2\2\u0146\u07e9\3\2\2\2\u0148\u07f0\3\2\2\2\u014a\u07fb\3\2\2\2\u014c"+
		"\u07ff\3\2\2\2\u014e\u0803\3\2\2\2\u0150\u080a\3\2\2\2\u0152\u080c\3\2"+
		"\2\2\u0154\u0811\3\2\2\2\u0156\u0813\3\2\2\2\u0158\u0821\3\2\2\2\u015a"+
		"\u0829\3\2\2\2\u015c\u082b\3\2\2\2\u015e\u0838\3\2\2\2\u0160\u083a\3\2"+
		"\2\2\u0162\u0845\3\2\2\2\u0164\u0855\3\2\2\2\u0166\u085c\3\2\2\2\u0168"+
		"\u086b\3\2\2\2\u016a\u086d\3\2\2\2\u016c\u0876\3\2\2\2\u016e\u0878\3\2"+
		"\2\2\u0170\u0887\3\2\2\2\u0172\u0889\3\2\2\2\u0174\u088b\3\2\2\2\u0176"+
		"\u0891\3\2\2\2\u0178\u0893\3\2\2\2\u017a\u089a\3\2\2\2\u017c\u08a5\3\2"+
		"\2\2\u017e\u08a9\3\2\2\2\u0180\u08ad\3\2\2\2\u0182\u08b8\3\2\2\2\u0184"+
		"\u08c7\3\2\2\2\u0186\u08c9\3\2\2\2\u0188\u08d2\3\2\2\2\u018a\u08d4\3\2"+
		"\2\2\u018c\u08e3\3\2\2\2\u018e\u08e5\3\2\2\2\u0190\u08e7\3\2\2\2\u0192"+
		"\u08ed\3\2\2\2\u0194\u08ef\3\2\2\2\u0196\u08f6\3\2\2\2\u0198\u0901\3\2"+
		"\2\2\u019a\u0905\3\2\2\2\u019c\u090c\3\2\2\2\u019e\u091b\3\2\2\2\u01a0"+
		"\u091d\3\2\2\2\u01a2\u01a3\7Z\2\2\u01a3\u01a4\5\u00be`\2\u01a4\u01a5\7"+
		"J\2\2\u01a5\u01a8\7b\2\2\u01a6\u01a9\7T\2\2\u01a7\u01a9\5\u00be`\2\u01a8"+
		"\u01a6\3\2\2\2\u01a8\u01a7\3\2\2\2\u01a9\u01af\3\2\2\2\u01aa\u01ab\5$"+
		"\23\2\u01ab\u01ac\7\23\2\2\u01ac\u01ad\7H\2\2\u01ad\u01b0\3\2\2\2\u01ae"+
		"\u01b0\7\u0099\2\2\u01af\u01aa\3\2\2\2\u01af\u01ae\3\2\2\2\u01b0\u01b1"+
		"\3\2\2\2\u01b1\u01b2\5\u012e\u0098\2\u01b2\u01b3\7\21\2\2\u01b3\u01b4"+
		"\5\u0086D\2\u01b4\u01b5\5\u0098M\2\u01b5\u01b6\5\u0088E\2\u01b6\3\3\2"+
		"\2\2\u01b7\u01b8\7Z\2\2\u01b8\u01b9\5\u00be`\2\u01b9\u01ba\7J\2\2\u01ba"+
		"\u01bb\7b\2\2\u01bb\u01bc\5\u00aaV\2\u01bc\u01bd\7\u0099\2\2\u01bd\u01be"+
		"\5\u012e\u0098\2\u01be\u01bf\7\21\2\2\u01bf\u01c0\5\u0086D\2\u01c0\u01c1"+
		"\5\u0096L\2\u01c1\u01c2\5\u0088E\2\u01c2\5\3\2\2\2\u01c3\u01c4\5\u00c0"+
		"a\2\u01c4\u01c5\7\u0099\2\2\u01c5\u01c6\5X-\2\u01c6\u01c7\7J\2\2\u01c7"+
		"\u01c8\5\u012c\u0097\2\u01c8\7\3\2\2\2\u01c9\u01ca\5\u00c0a\2\u01ca\u01cd"+
		"\5x=\2\u01cb\u01cc\7H\2\2\u01cc\u01ce\5z>\2\u01cd\u01cb\3\2\2\2\u01cd"+
		"\u01ce\3\2\2\2\u01ce\t\3\2\2\2\u01cf\u01d0\7Z\2\2\u01d0\u01d1\5\u00bc"+
		"_\2\u01d1\u01d3\7J\2\2\u01d2\u01d4\7\u0090\2\2\u01d3\u01d2\3\2\2\2\u01d3"+
		"\u01d4\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d6\5\u00a6T\2\u01d6\u01d8"+
		"\7M\2\2\u01d7\u01d9\5\u009cO\2\u01d8\u01d7\3\2\2\2\u01d8\u01d9\3\2\2\2"+
		"\u01d9\u01e3\3\2\2\2\u01da\u01e0\7\u0099\2\2\u01db\u01de\5\u00e2r\2\u01dc"+
		"\u01dd\7H\2\2\u01dd\u01df\5\u00ba^\2\u01de\u01dc\3\2\2\2\u01de\u01df\3"+
		"\2\2\2\u01df\u01e1\3\2\2\2\u01e0\u01db\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1"+
		"\u01e2\3\2\2\2\u01e2\u01e4\7p\2\2\u01e3\u01da\3\2\2\2\u01e3\u01e4\3\2"+
		"\2\2\u01e4\13\3\2\2\2\u01e5\u01e6\7Z\2\2\u01e6\u01e7\5\u00be`\2\u01e7"+
		"\u01e9\7J\2\2\u01e8\u01ea\7\u0090\2\2\u01e9\u01e8\3\2\2\2\u01e9\u01ea"+
		"\3\2\2\2\u01ea\u01ed\3\2\2\2\u01eb\u01ee\7T\2\2\u01ec\u01ee\5\20\t\2\u01ed"+
		"\u01eb\3\2\2\2\u01ed\u01ec\3\2\2\2\u01ee\u0201\3\2\2\2\u01ef\u01f8\5$"+
		"\23\2\u01f0\u01f1\7\23\2\2\u01f1\u01f2\7H\2\2\u01f2\u01f3\7u\2\2\u01f3"+
		"\u01f4\7\21\2\2\u01f4\u01f5\5\u0086D\2\u01f5\u01f6\5\u00d0i\2\u01f6\u01f7"+
		"\5\u0088E\2\u01f7\u01f9\3\2\2\2\u01f8\u01f0\3\2\2\2\u01f8\u01f9\3\2\2"+
		"\2\u01f9\u0202\3\2\2\2\u01fa\u01fb\7\u0099\2\2\u01fb\u01fc\7u\2\2\u01fc"+
		"\u01fd\7\21\2\2\u01fd\u01fe\5\u0086D\2\u01fe\u01ff\5\u00d0i\2\u01ff\u0200"+
		"\5\u0088E\2\u0200\u0202\3\2\2\2\u0201\u01ef\3\2\2\2\u0201\u01fa\3\2\2"+
		"\2\u0201\u0202\3\2\2\2\u0202\r\3\2\2\2\u0203\u0204\7Z\2\2\u0204\u0205"+
		"\5\u00be`\2\u0205\u0206\7J\2\2\u0206\u0219\7\u008e\2\2\u0207\u0210\5$"+
		"\23\2\u0208\u0209\7\23\2\2\u0209\u020a\7H\2\2\u020a\u020b\7u\2\2\u020b"+
		"\u020c\7\21\2\2\u020c\u020d\5\u0086D\2\u020d\u020e\5\u00d0i\2\u020e\u020f"+
		"\5\u0088E\2\u020f\u0211\3\2\2\2\u0210\u0208\3\2\2\2\u0210\u0211\3\2\2"+
		"\2\u0211\u021a\3\2\2\2\u0212\u0213\7\u0099\2\2\u0213\u0214\7u\2\2\u0214"+
		"\u0215\7\21\2\2\u0215\u0216\5\u0086D\2\u0216\u0217\5\u00d0i\2\u0217\u0218"+
		"\5\u0088E\2\u0218\u021a\3\2\2\2\u0219\u0207\3\2\2\2\u0219\u0212\3\2\2"+
		"\2\u0219\u021a\3\2\2\2\u021a\17\3\2\2\2\u021b\u0221\5\u00b4[\2\u021c\u021d"+
		"\5\u00b4[\2\u021d\u021e\7H\2\2\u021e\u021f\5\u00be`\2\u021f\u0221\3\2"+
		"\2\2\u0220\u021b\3\2\2\2\u0220\u021c\3\2\2\2\u0221\21\3\2\2\2\u0222\u0223"+
		"\7Z\2\2\u0223\u0224\5\u0124\u0093\2\u0224\u0225\7J\2\2\u0225\u0226\7\u0080"+
		"\2\2\u0226\u0227\7\u0087\2\2\u0227\u022a\5\u00c6d\2\u0228\u0229\7\u008a"+
		"\2\2\u0229\u022b\5\u00a6T\2\u022a\u0228\3\2\2\2\u022a\u022b\3\2\2\2\u022b"+
		"\u022c\3\2\2\2\u022c\u022d\7^\2\2\u022d\u022e\7\21\2\2\u022e\u022f\5\u0086"+
		"D\2\u022f\u0230\5\u00f2z\2\u0230\u0231\5\u0088E\2\u0231\23\3\2\2\2\u0232"+
		"\u0233\7Z\2\2\u0233\u0234\5\u00ba^\2\u0234\u0235\7J\2\2\u0235\u0236\7"+
		"\u008d\2\2\u0236\u0237\7^\2\2\u0237\u0238\7\21\2\2\u0238\u0239\5\u0086"+
		"D\2\u0239\u023a\5\u00f2z\2\u023a\u023b\5\u0088E\2\u023b\25\3\2\2\2\u023c"+
		"\u023d\7Z\2\2\u023d\u023e\5\u00ba^\2\u023e\u0240\7J\2\2\u023f\u0241\7"+
		"x\2\2\u0240\u023f\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u0242\3\2\2\2\u0242"+
		"\u0243\7\u008d\2\2\u0243\u0244\7^\2\2\u0244\u0245\7\21\2\2\u0245\u0246"+
		"\5\u0086D\2\u0246\u0247\5\u00eav\2\u0247\u0248\5\u0088E\2\u0248\27\3\2"+
		"\2\2\u0249\u024a\7Z\2\2\u024a\u024b\5\u00ba^\2\u024b\u024c\7J\2\2\u024c"+
		"\u024d\7m\2\2\u024d\u024e\7^\2\2\u024e\u024f\7\21\2\2\u024f\u0250\5\u0086"+
		"D\2\u0250\u0251\5\u00f2z\2\u0251\u0252\5\u0088E\2\u0252\31\3\2\2\2\u0253"+
		"\u0254\7Z\2\2\u0254\u0255\5\u00ba^\2\u0255\u0257\7J\2\2\u0256\u0258\7"+
		"x\2\2\u0257\u0256\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u0259\3\2\2\2\u0259"+
		"\u025a\7m\2\2\u025a\u025b\7^\2\2\u025b\u025c\7\21\2\2\u025c\u025d\5\u0086"+
		"D\2\u025d\u025e\5\u00eav\2\u025e\u025f\5\u0088E\2\u025f\33\3\2\2\2\u0260"+
		"\u0261\7Z\2\2\u0261\u0262\5\u00be`\2\u0262\u0264\7J\2\2\u0263\u0265\7"+
		"\u0090\2\2\u0264\u0263\3\2\2\2\u0264\u0265\3\2\2\2\u0265\u0266\3\2\2\2"+
		"\u0266\u0267\7x\2\2\u0267\u026f\7T\2\2\u0268\u0269\5$\23\2\u0269\u026a"+
		"\7\23\2\2\u026a\u026b\7H\2\2\u026b\u026c\7O\2\2\u026c\u0270\3\2\2\2\u026d"+
		"\u026e\7\u0099\2\2\u026e\u0270\7O\2\2\u026f\u0268\3\2\2\2\u026f\u026d"+
		"\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u0272\7\21\2\2\u0272\u0273\5\u0086"+
		"D\2\u0273\u0274\5 \21\2\u0274\u027d\5\u0088E\2\u0275\u0276\5\u0084C\2"+
		"\u0276\u0277\7H\2\2\u0277\u0278\7u\2\2\u0278\u0279\7\21\2\2\u0279\u027a"+
		"\5\u0086D\2\u027a\u027b\5\u00d4k\2\u027b\u027c\5\u0088E\2\u027c\u027e"+
		"\3\2\2\2\u027d\u0275\3\2\2\2\u027d\u027e\3\2\2\2\u027e\35\3\2\2\2\u027f"+
		"\u0280\7Z\2\2\u0280\u0281\5\u00be`\2\u0281\u0282\7J\2\2\u0282\u0283\7"+
		"x\2\2\u0283\u028b\7\u0088\2\2\u0284\u0285\5$\23\2\u0285\u0286\7\23\2\2"+
		"\u0286\u0287\7H\2\2\u0287\u0288\7O\2\2\u0288\u028c\3\2\2\2\u0289\u028a"+
		"\7\u0099\2\2\u028a\u028c\7O\2\2\u028b\u0284\3\2\2\2\u028b\u0289\3\2\2"+
		"\2\u028c\u028d\3\2\2\2\u028d\u028e\7\21\2\2\u028e\u028f\5\u0086D\2\u028f"+
		"\u0290\5 \21\2\u0290\u0299\5\u0088E\2\u0291\u0292\5\u0084C\2\u0292\u0293"+
		"\7H\2\2\u0293\u0294\7u\2\2\u0294\u0295\7\21\2\2\u0295\u0296\5\u0086D\2"+
		"\u0296\u0297\5\u00d4k\2\u0297\u0298\5\u0088E\2\u0298\u029a\3\2\2\2\u0299"+
		"\u0291\3\2\2\2\u0299\u029a\3\2\2\2\u029a\37\3\2\2\2\u029b\u029c\7Z\2\2"+
		"\u029c\u029d\7T\2\2\u029d\u029e\7O\2\2\u029e\u029f\7J\2\2\u029f\u02a0"+
		"\7\21\2\2\u02a0\u02a1\5\u0086D\2\u02a1\u02a2\5\"\22\2\u02a2\u02a3\5\u0088"+
		"E\2\u02a3!\3\2\2\2\u02a4\u02a5\b\22\1\2\u02a5\u02a6\5\u00d8m\2\u02a6\u02ad"+
		"\3\2\2\2\u02a7\u02a8\f\3\2\2\u02a8\u02a9\5\u0084C\2\u02a9\u02aa\5\u00d8"+
		"m\2\u02aa\u02ac\3\2\2\2\u02ab\u02a7\3\2\2\2\u02ac\u02af\3\2\2\2\u02ad"+
		"\u02ab\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae#\3\2\2\2\u02af\u02ad\3\2\2\2"+
		"\u02b0\u02b1\7\u0099\2\2\u02b1\u02b2\7M\2\2\u02b2\u02bb\5\u00bc_\2\u02b3"+
		"\u02b4\7\u0099\2\2\u02b4\u02b5\7N\2\2\u02b5\u02b8\5\u00e4s\2\u02b6\u02b7"+
		"\7H\2\2\u02b7\u02b9\5\u00bc_\2\u02b8\u02b6\3\2\2\2\u02b8\u02b9\3\2\2\2"+
		"\u02b9\u02bb\3\2\2\2\u02ba\u02b0\3\2\2\2\u02ba\u02b3\3\2\2\2\u02bb%\3"+
		"\2\2\2\u02bc\u02bd\7Z\2\2\u02bd\u02be\5\u00b6\\\2\u02be\u02bf\7J\2\2\u02bf"+
		"\u02c0\7E\2\2\u02c0\u02c3\7t\2\2\u02c1\u02c2\7\u0087\2\2\u02c2\u02c4\5"+
		"\60\31\2\u02c3\u02c1\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4\u02c7\3\2\2\2\u02c5"+
		"\u02c6\7\u008a\2\2\u02c6\u02c8\5\u00a6T\2\u02c7\u02c5\3\2\2\2\u02c7\u02c8"+
		"\3\2\2\2\u02c8\'\3\2\2\2\u02c9\u02ca\7Z\2\2\u02ca\u02cb\5\u00b6\\\2\u02cb"+
		"\u02cc\7J\2\2\u02cc\u02cf\7t\2\2\u02cd\u02ce\7\u0087\2\2\u02ce\u02d0\5"+
		"\60\31\2\u02cf\u02cd\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02d3\3\2\2\2\u02d1"+
		"\u02d2\7\u008a\2\2\u02d2\u02d4\5\u00a6T\2\u02d3\u02d1\3\2\2\2\u02d3\u02d4"+
		"\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5\u02d6\7^\2\2\u02d6\u02d7\7\21\2\2\u02d7"+
		"\u02d8\5\u0086D\2\u02d8\u02d9\5\u00f2z\2\u02d9\u02da\5\u0088E\2\u02da"+
		")\3\2\2\2\u02db\u02dc\7Z\2\2\u02dc\u02dd\5\u00b6\\\2\u02dd\u02df\7J\2"+
		"\2\u02de\u02e0\7x\2\2\u02df\u02de\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0\u02e1"+
		"\3\2\2\2\u02e1\u02e4\7t\2\2\u02e2\u02e3\7\u0087\2\2\u02e3\u02e5\5\60\31"+
		"\2\u02e4\u02e2\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5\u02e8\3\2\2\2\u02e6\u02e7"+
		"\7\u008a\2\2\u02e7\u02e9\5\u00ccg\2\u02e8\u02e6\3\2\2\2\u02e8\u02e9\3"+
		"\2\2\2\u02e9\u02ea\3\2\2\2\u02ea\u02eb\7^\2\2\u02eb\u02ec\7\21\2\2\u02ec"+
		"\u02ed\5\u0086D\2\u02ed\u02ee\5\u00eav\2\u02ee\u02ef\5\u0088E\2\u02ef"+
		"+\3\2\2\2\u02f0\u02f1\7Z\2\2\u02f1\u02f2\7\u00a7\2\2\u02f2\u02f3\7J\2"+
		"\2\u02f3\u02f4\7\u0093\2\2\u02f4\u02f5\7t\2\2\u02f5\u02f6\7^\2\2\u02f6"+
		"\u02f7\7\21\2\2\u02f7\u02f8\5\u0086D\2\u02f8\u02f9\5\u00f2z\2\u02f9\u02fa"+
		"\5\u0088E\2\u02fa\u02fb\5\u0084C\2\u02fb\u02fc\7H\2\2\u02fc\u0303\7\u0098"+
		"\2\2\u02fd\u02fe\7\21\2\2\u02fe\u02ff\5\u0086D\2\u02ff\u0300\5\u00f4{"+
		"\2\u0300\u0301\5\u0088E\2\u0301\u0304\3\2\2\2\u0302\u0304\5\u00c0a\2\u0303"+
		"\u02fd\3\2\2\2\u0303\u0302\3\2\2\2\u0304-\3\2\2\2\u0305\u0306\5X-\2\u0306"+
		"/\3\2\2\2\u0307\u030a\5\u00c2b\2\u0308\u0309\7H\2\2\u0309\u030b\5\u00c4"+
		"c\2\u030a\u0308\3\2\2\2\u030a\u030b\3\2\2\2\u030b\61\3\2\2\2\u030c\u030d"+
		"\5\u00ccg\2\u030d\u030f\5\u00ba^\2\u030e\u0310\5$\23\2\u030f\u030e\3\2"+
		"\2\2\u030f\u0310\3\2\2\2\u0310\u0313\3\2\2\2\u0311\u0312\7-\2\2\u0312"+
		"\u0314\5\u0106\u0084\2\u0313\u0311\3\2\2\2\u0313\u0314\3\2\2\2\u0314\63"+
		"\3\2\2\2\u0315\u0329\5|?\2\u0316\u0329\5:\36\2\u0317\u0329\5\u0080A\2"+
		"\u0318\u0329\58\35\2\u0319\u0329\5\66\34\2\u031a\u0329\5T+\2\u031b\u0329"+
		"\5V,\2\u031c\u0329\5J&\2\u031d\u0329\5@!\2\u031e\u0329\5D#\2\u031f\u0329"+
		"\5H%\2\u0320\u0329\5F$\2\u0321\u0329\5N(\2\u0322\u0329\5P)\2\u0323\u0329"+
		"\5l\67\2\u0324\u0329\5<\37\2\u0325\u0329\5> \2\u0326\u0329\5(\25\2\u0327"+
		"\u0329\5\u00e8u\2\u0328\u0315\3\2\2\2\u0328\u0316\3\2\2\2\u0328\u0317"+
		"\3\2\2\2\u0328\u0318\3\2\2\2\u0328\u0319\3\2\2\2\u0328\u031a\3\2\2\2\u0328"+
		"\u031b\3\2\2\2\u0328\u031c\3\2\2\2\u0328\u031d\3\2\2\2\u0328\u031e\3\2"+
		"\2\2\u0328\u031f\3\2\2\2\u0328\u0320\3\2\2\2\u0328\u0321\3\2\2\2\u0328"+
		"\u0322\3\2\2\2\u0328\u0323\3\2\2\2\u0328\u0324\3\2\2\2\u0328\u0325\3\2"+
		"\2\2\u0328\u0326\3\2\2\2\u0328\u0327\3\2\2\2\u0329\65\3\2\2\2\u032a\u032b"+
		"\7j\2\2\u032b\67\3\2\2\2\u032c\u032d\7[\2\2\u032d\u0337\5\u00a2R\2\u032e"+
		"\u032f\7\u0091\2\2\u032f\u0337\5\u00a2R\2\u0330\u0331\7[\2\2\u0331\u0332"+
		"\5\u00a2R\2\u0332\u0333\7H\2\2\u0333\u0334\7\u0091\2\2\u0334\u0335\5\u00a2"+
		"R\2\u0335\u0337\3\2\2\2\u0336\u032c\3\2\2\2\u0336\u032e\3\2\2\2\u0336"+
		"\u0330\3\2\2\2\u03379\3\2\2\2\u0338\u033a\5Z.\2\u0339\u033b\5v<\2\u033a"+
		"\u0339\3\2\2\2\u033a\u033b\3\2\2\2\u033b\u033e\3\2\2\2\u033c\u033e\5^"+
		"\60\2\u033d\u0338\3\2\2\2\u033d\u033c\3\2\2\2\u033e;\3\2\2\2\u033f\u0340"+
		"\7\u0099\2\2\u0340\u0341\5\u0116\u008c\2\u0341\u0342\7\23\2\2\u0342\u0343"+
		"\7]\2\2\u0343\u0344\7\21\2\2\u0344\u0345\5\u0086D\2\u0345\u0346\5\u00f2"+
		"z\2\u0346\u0347\5\u0088E\2\u0347=\3\2\2\2\u0348\u0349\7\u0099\2\2\u0349"+
		"\u034a\5\u00be`\2\u034a\u034b\7\23\2\2\u034b\u034c\7]\2\2\u034c\u034d"+
		"\7\21\2\2\u034d\u034e\5\u0086D\2\u034e\u034f\5\u00f2z\2\u034f\u0350\5"+
		"\u0088E\2\u0350?\3\2\2\2\u0351\u0352\7\u0092\2\2\u0352\u0353\7}\2\2\u0353"+
		"\u0354\5X-\2\u0354\u0355\7\21\2\2\u0355\u0356\5\u0086D\2\u0356\u035e\5"+
		"\u00f6|\2\u0357\u0358\5\u0084C\2\u0358\u0359\7\u0083\2\2\u0359\u035a\7"+
		"\21\2\2\u035a\u035b\5\u0086D\2\u035b\u035c\5\u00f2z\2\u035c\u035d\5\u0088"+
		"E\2\u035d\u035f\3\2\2\2\u035e\u0357\3\2\2\2\u035e\u035f\3\2\2\2\u035f"+
		"\u0360\3\2\2\2\u0360\u0361\5\u0088E\2\u0361A\3\2\2\2\u0362\u0363\7\u009a"+
		"\2\2\u0363\u0364\5\u00fc\177\2\u0364\u0365\7\21\2\2\u0365\u0366\5\u0086"+
		"D\2\u0366\u0367\5\u00f2z\2\u0367\u0368\5\u0088E\2\u0368\u0372\3\2\2\2"+
		"\u0369\u036a\7\u009a\2\2\u036a\u036b\7o\2\2\u036b\u036c\5\u00fa~\2\u036c"+
		"\u036d\7\21\2\2\u036d\u036e\5\u0086D\2\u036e\u036f\5\u00f2z\2\u036f\u0370"+
		"\5\u0088E\2\u0370\u0372\3\2\2\2\u0371\u0362\3\2\2\2\u0371\u0369\3\2\2"+
		"\2\u0372C\3\2\2\2\u0373\u0374\7k\2\2\u0374\u0375\7_\2\2\u0375\u0378\5"+
		"\u00ba^\2\u0376\u0377\7\23\2\2\u0377\u0379\5\u00ba^\2\u0378\u0376\3\2"+
		"\2\2\u0378\u0379\3\2\2\2\u0379\u037a\3\2\2\2\u037a\u037b\7o\2\2\u037b"+
		"\u037c\5X-\2\u037c\u037d\7\21\2\2\u037d\u037e\5\u0086D\2\u037e\u037f\5"+
		"\u00f2z\2\u037f\u0380\5\u0088E\2\u0380E\3\2\2\2\u0381\u0382\7]\2\2\u0382"+
		"\u0383\7\21\2\2\u0383\u0384\5\u0086D\2\u0384\u0385\5\u00f2z\2\u0385\u0386"+
		"\5\u0088E\2\u0386\u0387\5\u0084C\2\u0387\u0388\7\u009c\2\2\u0388\u0389"+
		"\5X-\2\u0389G\3\2\2\2\u038a\u038b\7\u009c\2\2\u038b\u038c\5X-\2\u038c"+
		"\u038d\7\21\2\2\u038d\u038e\5\u0086D\2\u038e\u038f\5\u00f2z\2\u038f\u0390"+
		"\5\u0088E\2\u0390I\3\2\2\2\u0391\u0392\7n\2\2\u0392\u0393\5X-\2\u0393"+
		"\u0394\7\21\2\2\u0394\u0395\5\u0086D\2\u0395\u0396\5\u00f2z\2\u0396\u039a"+
		"\5\u0088E\2\u0397\u0398\5\u0084C\2\u0398\u0399\5L\'\2\u0399\u039b\3\2"+
		"\2\2\u039a\u0397\3\2\2\2\u039a\u039b\3\2\2\2\u039b\u03a3\3\2\2\2\u039c"+
		"\u039d\5\u0084C\2\u039d\u039e\7`\2\2\u039e\u039f\7\21\2\2\u039f\u03a0"+
		"\5\u0086D\2\u03a0\u03a1\5\u00f2z\2\u03a1\u03a2\5\u0088E\2\u03a2\u03a4"+
		"\3\2\2\2\u03a3\u039c\3\2\2\2\u03a3\u03a4\3\2\2\2\u03a4K\3\2\2\2\u03a5"+
		"\u03a6\b\'\1\2\u03a6\u03a7\7`\2\2\u03a7\u03a8\7n\2\2\u03a8\u03a9\5X-\2"+
		"\u03a9\u03aa\7\21\2\2\u03aa\u03ab\5\u0086D\2\u03ab\u03ac\5\u00f2z\2\u03ac"+
		"\u03ad\5\u0088E\2\u03ad\u03ba\3\2\2\2\u03ae\u03af\f\3\2\2\u03af\u03b0"+
		"\5\u0084C\2\u03b0\u03b1\7`\2\2\u03b1\u03b2\7n\2\2\u03b2\u03b3\5X-\2\u03b3"+
		"\u03b4\7\21\2\2\u03b4\u03b5\5\u0086D\2\u03b5\u03b6\5\u00f2z\2\u03b6\u03b7"+
		"\5\u0088E\2\u03b7\u03b9\3\2\2\2\u03b8\u03ae\3\2\2\2\u03b9\u03bc\3\2\2"+
		"\2\u03ba\u03b8\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bbM\3\2\2\2\u03bc\u03ba"+
		"\3\2\2\2\u03bd\u03be\7\u0085\2\2\u03be\u03bf\5X-\2\u03bfO\3\2\2\2\u03c0"+
		"\u03c1\7\u0092\2\2\u03c1\u03c2\7}\2\2\u03c2\u03c3\5\u00ba^\2\u03c3\u03c4"+
		"\7^\2\2\u03c4\u03c5\7\21\2\2\u03c5\u03c6\5\u0086D\2\u03c6\u03c7\5\u00f2"+
		"z\2\u03c7\u03c8\5\u0088E\2\u03c8\u03ca\5\u0082B\2\u03c9\u03cb\5\u00f8"+
		"}\2\u03ca\u03c9\3\2\2\2\u03ca\u03cb\3\2\2\2\u03cb\u03d7\3\2\2\2\u03cc"+
		"\u03d0\7\u0083\2\2\u03cd\u03ce\7\u009a\2\2\u03ce\u03d0\7I\2\2\u03cf\u03cc"+
		"\3\2\2\2\u03cf\u03cd\3\2\2\2\u03d0\u03d1\3\2\2\2\u03d1\u03d2\7\21\2\2"+
		"\u03d2\u03d3\5\u0086D\2\u03d3\u03d4\5\u00f2z\2\u03d4\u03d5\5\u0088E\2"+
		"\u03d5\u03d6\5\u0082B\2\u03d6\u03d8\3\2\2\2\u03d7\u03cf\3\2\2\2\u03d7"+
		"\u03d8\3\2\2\2\u03d8\u03e0\3\2\2\2\u03d9\u03da\7G\2\2\u03da\u03db\7\21"+
		"\2\2\u03db\u03dc\5\u0086D\2\u03dc\u03dd\5\u00f2z\2\u03dd\u03de\5\u0088"+
		"E\2\u03de\u03df\5\u0082B\2\u03df\u03e1\3\2\2\2\u03e0\u03d9\3\2\2\2\u03e0"+
		"\u03e1\3\2\2\2\u03e1\u03e2\3\2\2\2\u03e2\u03e3\5\u0082B\2\u03e3Q\3\2\2"+
		"\2\u03e4\u03e5\7\u009a\2\2\u03e5\u03e6\5\u00c0a\2\u03e6\u03e7\7\21\2\2"+
		"\u03e7\u03e8\5\u0086D\2\u03e8\u03e9\5\u00f2z\2\u03e9\u03ea\5\u0088E\2"+
		"\u03ea\u03eb\5\u0082B\2\u03eb\u03f8\3\2\2\2\u03ec\u03ed\7\u009a\2\2\u03ed"+
		"\u03ee\7o\2\2\u03ee\u03ef\7\30\2\2\u03ef\u03f0\5\u009aN\2\u03f0\u03f1"+
		"\7\31\2\2\u03f1\u03f2\7\21\2\2\u03f2\u03f3\5\u0086D\2\u03f3\u03f4\5\u00f2"+
		"z\2\u03f4\u03f5\5\u0088E\2\u03f5\u03f6\5\u0082B\2\u03f6\u03f8\3\2\2\2"+
		"\u03f7\u03e4\3\2\2\2\u03f7\u03ec\3\2\2\2\u03f8S\3\2\2\2\u03f9\u03fa\7"+
		"P\2\2\u03faU\3\2\2\2\u03fb\u03fd\7\u0089\2\2\u03fc\u03fe\5X-\2\u03fd\u03fc"+
		"\3\2\2\2\u03fd\u03fe\3\2\2\2\u03feW\3\2\2\2\u03ff\u0400\b-\1\2\u0400\u0401"+
		"\7#\2\2\u0401\u041c\5X-,\u0402\u0403\7z\2\2\u0403\u041c\5X-+\u0404\u0405"+
		"\7>\2\2\u0405\u0406\7\21\2\2\u0406\u041c\5X-\20\u0407\u041c\5b\62\2\u0408"+
		"\u041c\5Z.\2\u0409\u040a\5Z.\2\u040a\u040b\5v<\2\u040b\u041c\3\2\2\2\u040c"+
		"\u040d\7d\2\2\u040d\u040e\7\21\2\2\u040e\u041c\5\u00ba^\2\u040f\u0410"+
		"\7=\2\2\u0410\u0411\7\21\2\2\u0411\u041c\5\u00b6\\\2\u0412\u041c\5h\65"+
		"\2\u0413\u041c\5f\64\2\u0414\u041c\5j\66\2\u0415\u041c\5r:\2\u0416\u041c"+
		"\5\u011c\u008f\2\u0417\u041c\5\u011e\u0090\2\u0418\u041c\5t;\2\u0419\u041c"+
		"\5n8\2\u041a\u041c\5^\60\2\u041b\u03ff\3\2\2\2\u041b\u0402\3\2\2\2\u041b"+
		"\u0404\3\2\2\2\u041b\u0407\3\2\2\2\u041b\u0408\3\2\2\2\u041b\u0409\3\2"+
		"\2\2\u041b\u040c\3\2\2\2\u041b\u040f\3\2\2\2\u041b\u0412\3\2\2\2\u041b"+
		"\u0413\3\2\2\2\u041b\u0414\3\2\2\2\u041b\u0415\3\2\2\2\u041b\u0416\3\2"+
		"\2\2\u041b\u0417\3\2\2\2\u041b\u0418\3\2\2\2\u041b\u0419\3\2\2\2\u041b"+
		"\u041a\3\2\2\2\u041c\u0486\3\2\2\2\u041d\u041e\f*\2\2\u041e\u041f\5\u0132"+
		"\u009a\2\u041f\u0420\5X-+\u0420\u0485\3\2\2\2\u0421\u0422\f)\2\2\u0422"+
		"\u0423\5\u0134\u009b\2\u0423\u0424\5X-*\u0424\u0485\3\2\2\2\u0425\u0426"+
		"\f(\2\2\u0426\u0427\5\u0138\u009d\2\u0427\u0428\5X-)\u0428\u0485\3\2\2"+
		"\2\u0429\u042a\f\'\2\2\u042a\u042b\5\u0136\u009c\2\u042b\u042c\5X-(\u042c"+
		"\u0485\3\2\2\2\u042d\u042e\f&\2\2\u042e\u042f\t\2\2\2\u042f\u0485\5X-"+
		"\'\u0430\u0431\f%\2\2\u0431\u0432\7*\2\2\u0432\u0485\5X-&\u0433\u0434"+
		"\f$\2\2\u0434\u0435\7+\2\2\u0435\u0485\5X-%\u0436\u0437\f#\2\2\u0437\u0438"+
		"\7(\2\2\u0438\u0485\5X-$\u0439\u043a\f\"\2\2\u043a\u043b\7)\2\2\u043b"+
		"\u0485\5X-#\u043c\u043d\f\37\2\2\u043d\u043e\7-\2\2\u043e\u0485\5X- \u043f"+
		"\u0440\f\36\2\2\u0440\u0441\7,\2\2\u0441\u0485\5X-\37\u0442\u0443\f\35"+
		"\2\2\u0443\u0444\7\61\2\2\u0444\u0485\5X-\36\u0445\u0446\f\34\2\2\u0446"+
		"\u0447\7\u0081\2\2\u0447\u0485\5X-\35\u0448\u0449\f\33\2\2\u0449\u044a"+
		"\7H\2\2\u044a\u0485\5X-\34\u044b\u044c\f\32\2\2\u044c\u044d\7n\2\2\u044d"+
		"\u044e\5X-\2\u044e\u044f\7`\2\2\u044f\u0450\5X-\33\u0450\u0485\3\2\2\2"+
		"\u0451\u0452\f\30\2\2\u0452\u0453\7o\2\2\u0453\u0485\5X-\31\u0454\u0455"+
		"\f\27\2\2\u0455\u0456\7W\2\2\u0456\u0485\5X-\30\u0457\u0458\f\26\2\2\u0458"+
		"\u0459\7W\2\2\u0459\u045a\7F\2\2\u045a\u0485\5X-\27\u045b\u045c\f\25\2"+
		"\2\u045c\u045d\7W\2\2\u045d\u045e\7I\2\2\u045e\u0485\5X-\26\u045f\u0460"+
		"\f\24\2\2\u0460\u0461\7z\2\2\u0461\u0462\7o\2\2\u0462\u0485\5X-\25\u0463"+
		"\u0464\f\23\2\2\u0464\u0465\7z\2\2\u0465\u0466\7W\2\2\u0466\u0485\5X-"+
		"\24\u0467\u0468\f\22\2\2\u0468\u0469\7z\2\2\u0469\u046a\7W\2\2\u046a\u046b"+
		"\7F\2\2\u046b\u0485\5X-\23\u046c\u046d\f\21\2\2\u046d\u046e\7z\2\2\u046e"+
		"\u046f\7W\2\2\u046f\u0470\7I\2\2\u0470\u0485\5X-\22\u0471\u0472\f\3\2"+
		"\2\u0472\u0473\7k\2\2\u0473\u0474\7_\2\2\u0474\u0475\5\u00ba^\2\u0475"+
		"\u0476\7o\2\2\u0476\u0477\5X-\4\u0477\u0485\3\2\2\2\u0478\u0479\f!\2\2"+
		"\u0479\u047a\7r\2\2\u047a\u047b\7z\2\2\u047b\u0485\5\u011a\u008e\2\u047c"+
		"\u047d\f \2\2\u047d\u047e\7r\2\2\u047e\u0485\5\u011a\u008e\2\u047f\u0480"+
		"\f\31\2\2\u0480\u0481\7J\2\2\u0481\u0485\5\u00ccg\2\u0482\u0483\f\n\2"+
		"\2\u0483\u0485\5p9\2\u0484\u041d\3\2\2\2\u0484\u0421\3\2\2\2\u0484\u0425"+
		"\3\2\2\2\u0484\u0429\3\2\2\2\u0484\u042d\3\2\2\2\u0484\u0430\3\2\2\2\u0484"+
		"\u0433\3\2\2\2\u0484\u0436\3\2\2\2\u0484\u0439\3\2\2\2\u0484\u043c\3\2"+
		"\2\2\u0484\u043f\3\2\2\2\u0484\u0442\3\2\2\2\u0484\u0445\3\2\2\2\u0484"+
		"\u0448\3\2\2\2\u0484\u044b\3\2\2\2\u0484\u0451\3\2\2\2\u0484\u0454\3\2"+
		"\2\2\u0484\u0457\3\2\2\2\u0484\u045b\3\2\2\2\u0484\u045f\3\2\2\2\u0484"+
		"\u0463\3\2\2\2\u0484\u0467\3\2\2\2\u0484\u046c\3\2\2\2\u0484\u0471\3\2"+
		"\2\2\u0484\u0478\3\2\2\2\u0484\u047c\3\2\2\2\u0484\u047f\3\2\2\2\u0484"+
		"\u0482\3\2\2\2\u0485\u0488\3\2\2\2\u0486\u0484\3\2\2\2\u0486\u0487\3\2"+
		"\2\2\u0487Y\3\2\2\2\u0488\u0486\3\2\2\2\u0489\u048a\b.\1\2\u048a\u048b"+
		"\5\u00b8]\2\u048b\u0490\3\2\2\2\u048c\u048d\f\3\2\2\u048d\u048f\5\\/\2"+
		"\u048e\u048c\3\2\2\2\u048f\u0492\3\2\2\2\u0490\u048e\3\2\2\2\u0490\u0491"+
		"\3\2\2\2\u0491[\3\2\2\2\u0492\u0490\3\2\2\2\u0493\u0494\6/!\3\u0494\u0495"+
		"\7\25\2\2\u0495\u0496\5\u00b8]\2\u0496]\3\2\2\2\u0497\u0498\7q\2\2\u0498"+
		"\u0499\7\21\2\2\u0499\u049a\5\u00ba^\2\u049a\u049b\5`\61\2\u049b_\3\2"+
		"\2\2\u049c\u049d\6\61\"\3\u049da\3\2\2\2\u049e\u049f\b\62\1\2\u049f\u04a0"+
		"\5\u0100\u0081\2\u04a0\u04a5\3\2\2\2\u04a1\u04a2\f\3\2\2\u04a2\u04a4\5"+
		"d\63\2\u04a3\u04a1\3\2\2\2\u04a4\u04a7\3\2\2\2\u04a5\u04a3\3\2\2\2\u04a5"+
		"\u04a6\3\2\2\2\u04a6c\3\2\2\2\u04a7\u04a5\3\2\2\2\u04a8\u04a9\6\63$\3"+
		"\u04a9\u04aa\7\25\2\2\u04aa\u04b6\5\u00ba^\2\u04ab\u04ac\6\63%\3\u04ac"+
		"\u04ad\7\30\2\2\u04ad\u04ae\5\u0114\u008b\2\u04ae\u04af\7\31\2\2\u04af"+
		"\u04b6\3\2\2\2\u04b0\u04b1\6\63&\3\u04b1\u04b2\7\30\2\2\u04b2\u04b3\5"+
		"X-\2\u04b3\u04b4\7\31\2\2\u04b4\u04b6\3\2\2\2\u04b5\u04a8\3\2\2\2\u04b5"+
		"\u04ab\3\2\2\2\u04b5\u04b0\3\2\2\2\u04b6e\3\2\2\2\u04b7\u04ba\7?\2\2\u04b8"+
		"\u04b9\7l\2\2\u04b9\u04bb\5X-\2\u04ba\u04b8\3\2\2\2\u04ba\u04bb\3\2\2"+
		"\2\u04bbg\3\2\2\2\u04bc\u04bd\7@\2\2\u04bd\u04be\7l\2\2\u04be\u04bf\5"+
		"X-\2\u04bfi\3\2\2\2\u04c0\u04c1\5\u00aeX\2\u04c1\u04c2\7l\2\2\u04c2\u04cb"+
		"\5X-\2\u04c3\u04c5\7\23\2\2\u04c4\u04c3\3\2\2\2\u04c4\u04c5\3\2\2\2\u04c5"+
		"\u04c6\3\2\2\2\u04c6\u04c9\5x=\2\u04c7\u04c8\7H\2\2\u04c8\u04ca\5z>\2"+
		"\u04c9\u04c7\3\2\2\2\u04c9\u04ca\3\2\2\2\u04ca\u04cc\3\2\2\2\u04cb\u04c4"+
		"\3\2\2\2\u04cb\u04cc\3\2\2\2\u04cc\u04d6\3\2\2\2\u04cd\u04d3\5\u00aeX"+
		"\2\u04ce\u04d1\5x=\2\u04cf\u04d0\7H\2\2\u04d0\u04d2\5z>\2\u04d1\u04cf"+
		"\3\2\2\2\u04d1\u04d2\3\2\2\2\u04d2\u04d4\3\2\2\2\u04d3\u04ce\3\2\2\2\u04d3"+
		"\u04d4\3\2\2\2\u04d4\u04d6\3\2\2\2\u04d5\u04c0\3\2\2\2\u04d5\u04cd\3\2"+
		"\2\2\u04d6k\3\2\2\2\u04d7\u04d8\7\u009d\2\2\u04d8\u04d9\5X-\2\u04d9\u04da"+
		"\7\u0096\2\2\u04da\u04db\5X-\2\u04dbm\3\2\2\2\u04dc\u04dd\5Z.\2\u04dd"+
		"\u04de\7#\2\2\u04de\u04df\5X-\2\u04dfo\3\2\2\2\u04e0\u04e1\7h\2\2\u04e1"+
		"\u04e2\7\u0099\2\2\u04e2\u04e3\5\u00ba^\2\u04e3\u04e4\7\u009b\2\2\u04e4"+
		"\u04e5\5X-\2\u04e5q\3\2\2\2\u04e6\u04e7\7g\2\2\u04e7\u04e9\7~\2\2\u04e8"+
		"\u04ea\5\u00aeX\2\u04e9\u04e8\3\2\2\2\u04e9\u04ea\3\2\2\2\u04ea\u04eb"+
		"\3\2\2\2\u04eb\u04ec\7\u009b\2\2\u04ec\u0505\5X-\2\u04ed\u04f9\7g\2\2"+
		"\u04ee\u04f0\7F\2\2\u04ef\u04f1\5\u00aeX\2\u04f0\u04ef\3\2\2\2\u04f0\u04f1"+
		"\3\2\2\2\u04f1\u04fa\3\2\2\2\u04f2\u04f4\5\u00aeX\2\u04f3\u04f2\3\2\2"+
		"\2\u04f3\u04f4\3\2\2\2\u04f4\u04f5\3\2\2\2\u04f5\u04f6\5X-\2\u04f6\u04f7"+
		"\7\u0096\2\2\u04f7\u04f8\5X-\2\u04f8\u04fa\3\2\2\2\u04f9\u04ee\3\2\2\2"+
		"\u04f9\u04f3\3\2\2\2\u04fa\u04fd\3\2\2\2\u04fb\u04fc\7\u009b\2\2\u04fc"+
		"\u04fe\5X-\2\u04fd\u04fb\3\2\2\2\u04fd\u04fe\3\2\2\2\u04fe\u0502\3\2\2"+
		"\2\u04ff\u0500\7\u0082\2\2\u0500\u0501\7Q\2\2\u0501\u0503\5\u0120\u0091"+
		"\2\u0502\u04ff\3\2\2\2\u0502\u0503\3\2\2\2\u0503\u0505\3\2\2\2\u0504\u04e6"+
		"\3\2\2\2\u0504\u04ed\3\2\2\2\u0505s\3\2\2\2\u0506\u0508\7\u008f\2\2\u0507"+
		"\u0509\7\\\2\2\u0508\u0507\3\2\2\2\u0508\u0509\3\2\2\2\u0509\u050a\3\2"+
		"\2\2\u050a\u0510\5b\62\2\u050b\u050c\7\u0099\2\2\u050c\u050d\5b\62\2\u050d"+
		"\u050e\7J\2\2\u050e\u050f\5\u0128\u0095\2\u050f\u0511\3\2\2\2\u0510\u050b"+
		"\3\2\2\2\u0510\u0511\3\2\2\2\u0511u\3\2\2\2\u0512\u0513\6<\'\3\u0513\u0519"+
		"\5X-\2\u0514\u0517\5x=\2\u0515\u0516\7H\2\2\u0516\u0518\5z>\2\u0517\u0515"+
		"\3\2\2\2\u0517\u0518\3\2\2\2\u0518\u051a\3\2\2\2\u0519\u0514\3\2\2\2\u0519"+
		"\u051a\3\2\2\2\u051a\u0521\3\2\2\2\u051b\u051e\5x=\2\u051c\u051d\7H\2"+
		"\2\u051d\u051f\5z>\2\u051e\u051c\3\2\2\2\u051e\u051f\3\2\2\2\u051f\u0521"+
		"\3\2\2\2\u0520\u0512\3\2\2\2\u0520\u051b\3\2\2\2\u0521w\3\2\2\2\u0522"+
		"\u0523\b=\1\2\u0523\u0524\7\u0099\2\2\u0524\u0525\5z>\2\u0525\u052b\3"+
		"\2\2\2\u0526\u0527\f\3\2\2\u0527\u0528\7\23\2\2\u0528\u052a\5z>\2\u0529"+
		"\u0526\3\2\2\2\u052a\u052d\3\2\2\2\u052b\u0529\3\2\2\2\u052b\u052c\3\2"+
		"\2\2\u052cy\3\2\2\2\u052d\u052b\3\2\2\2\u052e\u052f\5X-\2\u052f\u0530"+
		"\7J\2\2\u0530\u0531\5\u00ba^\2\u0531{\3\2\2\2\u0532\u0533\5\u0118\u008d"+
		"\2\u0533\u0534\5\u0130\u0099\2\u0534\u0535\5X-\2\u0535}\3\2\2\2\u0536"+
		"\u0537\6@)\3\u0537\u0538\7\25\2\2\u0538\u053f\5\u00ba^\2\u0539\u053a\6"+
		"@*\3\u053a\u053b\7\30\2\2\u053b\u053c\5X-\2\u053c\u053d\7\31\2\2\u053d"+
		"\u053f\3\2\2\2\u053e\u0536\3\2\2\2\u053e\u0539\3\2\2\2\u053f\177\3\2\2"+
		"\2\u0540\u0541\5\u00e2r\2\u0541\u0542\5\u0130\u0099\2\u0542\u0543\5X-"+
		"\2\u0543\u0081\3\2\2\2\u0544\u0546\7\7\2\2\u0545\u0544\3\2\2\2\u0546\u0549"+
		"\3\2\2\2\u0547\u0545\3\2\2\2\u0547\u0548\3\2\2\2\u0548\u0083\3\2\2\2\u0549"+
		"\u0547\3\2\2\2\u054a\u054c\7\7\2\2\u054b\u054a\3\2\2\2\u054c\u054d\3\2"+
		"\2\2\u054d\u054b\3\2\2\2\u054d\u054e\3\2\2\2\u054e\u0085\3\2\2\2\u054f"+
		"\u0551\7\7\2\2\u0550\u054f\3\2\2\2\u0551\u0552\3\2\2\2\u0552\u0550\3\2"+
		"\2\2\u0552\u0553\3\2\2\2\u0553\u0554\3\2\2\2\u0554\u0555\7\3\2\2\u0555"+
		"\u0087\3\2\2\2\u0556\u0558\7\7\2\2\u0557\u0556\3\2\2\2\u0558\u055b\3\2"+
		"\2\2\u0559\u0557\3\2\2\2\u0559\u055a\3\2\2\2\u055a\u055c\3\2\2\2\u055b"+
		"\u0559\3\2\2\2\u055c\u055d\7\4\2\2\u055d\u0089\3\2\2\2\u055e\u055f\7{"+
		"\2\2\u055f\u008b\3\2\2\2\u0560\u0562\5\u008eH\2\u0561\u0560\3\2\2\2\u0561"+
		"\u0562\3\2\2\2\u0562\u0563\3\2\2\2\u0563\u0564\5\u0082B\2\u0564\u0565"+
		"\7\2\2\3\u0565\u008d\3\2\2\2\u0566\u056c\5\u0090I\2\u0567\u0568\5\u0084"+
		"C\2\u0568\u0569\5\u0090I\2\u0569\u056b\3\2\2\2\u056a\u0567\3\2\2\2\u056b"+
		"\u056e\3\2\2\2\u056c\u056a\3\2\2\2\u056c\u056d\3\2\2\2\u056d\u008f\3\2"+
		"\2\2\u056e\u056c\3\2\2\2\u056f\u0570\5\u00e8u\2\u0570\u0571\5\u0084C\2"+
		"\u0571\u0573\3\2\2\2\u0572\u056f\3\2\2\2\u0573\u0576\3\2\2\2\u0574\u0572"+
		"\3\2\2\2\u0574\u0575\3\2\2\2\u0575\u057c\3\2\2\2\u0576\u0574\3\2\2\2\u0577"+
		"\u057d\5\n\6\2\u0578\u057d\5\u00b2Z\2\u0579\u057d\5\u0092J\2\u057a\u057d"+
		"\5\u0094K\2\u057b\u057d\5\u00e6t\2\u057c\u0577\3\2\2\2\u057c\u0578\3\2"+
		"\2\2\u057c\u0579\3\2\2\2\u057c\u057a\3\2\2\2\u057c\u057b\3\2\2\2\u057d"+
		"\u0091\3\2\2\2\u057e\u057f\5\36\20\2\u057f\u0093\3\2\2\2\u0580\u0583\5"+
		"\2\2\2\u0581\u0583\5\4\3\2\u0582\u0580\3\2\2\2\u0582\u0581\3\2\2\2\u0583"+
		"\u0095\3\2\2\2\u0584\u058a\5\6\4\2\u0585\u0586\5\u0084C\2\u0586\u0587"+
		"\5\6\4\2\u0587\u0589\3\2\2\2\u0588\u0585\3\2\2\2\u0589\u058c\3\2\2\2\u058a"+
		"\u0588\3\2\2\2\u058a\u058b\3\2\2\2\u058b\u0097\3\2\2\2\u058c\u058a\3\2"+
		"\2\2\u058d\u0593\5\b\5\2\u058e\u058f\5\u0084C\2\u058f\u0590\5\b\5\2\u0590"+
		"\u0592\3\2\2\2\u0591\u058e\3\2\2\2\u0592\u0595\3\2\2\2\u0593\u0591\3\2"+
		"\2\2\u0593\u0594\3\2\2\2\u0594\u0099\3\2\2\2\u0595\u0593\3\2\2\2\u0596"+
		"\u059b\5\u00c0a\2\u0597\u0598\7\23\2\2\u0598\u059a\5\u00c0a\2\u0599\u0597"+
		"\3\2\2\2\u059a\u059d\3\2\2\2\u059b\u0599\3\2\2\2\u059b\u059c\3\2\2\2\u059c"+
		"\u009b\3\2\2\2\u059d\u059b\3\2\2\2\u059e\u059f\7o\2\2\u059f\u05a9\5\u009e"+
		"P\2\u05a0\u05a1\7o\2\2\u05a1\u05a9\5\u00a0Q\2\u05a2\u05a3\7o\2\2\u05a3"+
		"\u05a9\5\u00a4S\2\u05a4\u05a5\7s\2\2\u05a5\u05a9\7\u00a7\2\2\u05a6\u05a7"+
		"\7s\2\2\u05a7\u05a9\5X-\2\u05a8\u059e\3\2\2\2\u05a8\u05a0\3\2\2\2\u05a8"+
		"\u05a2\3\2\2\2\u05a8\u05a4\3\2\2\2\u05a8\u05a6\3\2\2\2\u05a9\u009d\3\2"+
		"\2\2\u05aa\u05ac\7w\2\2\u05ab\u05aa\3\2\2\2\u05ab\u05ac\3\2\2\2\u05ac"+
		"\u05ad\3\2\2\2\u05ad\u05af\7\30\2\2\u05ae\u05b0\5\u00a2R\2\u05af\u05ae"+
		"\3\2\2\2\u05af\u05b0\3\2\2\2\u05b0\u05b1\3\2\2\2\u05b1\u05b2\7\31\2\2"+
		"\u05b2\u009f\3\2\2\2\u05b3\u05b5\7w\2\2\u05b4\u05b3\3\2\2\2\u05b4\u05b5"+
		"\3\2\2\2\u05b5\u05b6\3\2\2\2\u05b6\u05b8\7*\2\2\u05b7\u05b9\5\u00a2R\2"+
		"\u05b8\u05b7\3\2\2\2\u05b8\u05b9\3\2\2\2\u05b9\u05ba\3\2\2\2\u05ba\u05bb"+
		"\7(\2\2\u05bb\u00a1\3\2\2\2\u05bc\u05c1\5X-\2\u05bd\u05be\7\23\2\2\u05be"+
		"\u05c0\5X-\2\u05bf\u05bd\3\2\2\2\u05c0\u05c3\3\2\2\2\u05c1\u05bf\3\2\2"+
		"\2\u05c1\u05c2\3\2\2\2\u05c2\u00a3\3\2\2\2\u05c3\u05c1\3\2\2\2\u05c4\u05c5"+
		"\7\30\2\2\u05c5\u05c6\5X-\2\u05c6\u05c7\7\24\2\2\u05c7\u05c8\5X-\2\u05c8"+
		"\u05c9\7\31\2\2\u05c9\u00a5\3\2\2\2\u05ca\u05cb\bT\1\2\u05cb\u05d7\5\u00a8"+
		"U\2\u05cc\u05cd\7D\2\2\u05cd\u05ce\7*\2\2\u05ce\u05cf\5\u00a6T\2\u05cf"+
		"\u05d0\7(\2\2\u05d0\u05d7\3\2\2\2\u05d1\u05d2\7C\2\2\u05d2\u05d3\7*\2"+
		"\2\u05d3\u05d4\5\u00a6T\2\u05d4\u05d5\7(\2\2\u05d5\u05d7\3\2\2\2\u05d6"+
		"\u05ca\3\2\2\2\u05d6\u05cc\3\2\2\2\u05d6\u05d1\3\2\2\2\u05d7\u05e2\3\2"+
		"\2\2\u05d8\u05d9\f\7\2\2\u05d9\u05e1\7,\2\2\u05da\u05db\f\6\2\2\u05db"+
		"\u05dc\7\30\2\2\u05dc\u05e1\7\31\2\2\u05dd\u05de\f\5\2\2\u05de\u05df\7"+
		"\32\2\2\u05df\u05e1\7\33\2\2\u05e0\u05d8\3\2\2\2\u05e0\u05da\3\2\2\2\u05e0"+
		"\u05dd\3\2\2\2\u05e1\u05e4\3\2\2\2\u05e2\u05e0\3\2\2\2\u05e2\u05e3\3\2"+
		"\2\2\u05e3\u00a7\3\2\2\2\u05e4\u05e2\3\2\2\2\u05e5\u05e8\5\u00aaV\2\u05e6"+
		"\u05e8\5\u00acW\2\u05e7\u05e5\3\2\2\2\u05e7\u05e6\3\2\2\2\u05e8\u00a9"+
		"\3\2\2\2\u05e9\u05f8\7\64\2\2\u05ea\u05f8\7\65\2\2\u05eb\u05f8\7\66\2"+
		"\2\u05ec\u05f8\7A\2\2\u05ed\u05f8\7\67\2\2\u05ee\u05f8\78\2\2\u05ef\u05f8"+
		"\7?\2\2\u05f0\u05f8\79\2\2\u05f1\u05f8\7;\2\2\u05f2\u05f8\7:\2\2\u05f3"+
		"\u05f8\7<\2\2\u05f4\u05f8\7>\2\2\u05f5\u05f8\7@\2\2\u05f6\u05f8\7B\2\2"+
		"\u05f7\u05e9\3\2\2\2\u05f7\u05ea\3\2\2\2\u05f7\u05eb\3\2\2\2\u05f7\u05ec"+
		"\3\2\2\2\u05f7\u05ed\3\2\2\2\u05f7\u05ee\3\2\2\2\u05f7\u05ef\3\2\2\2\u05f7"+
		"\u05f0\3\2\2\2\u05f7\u05f1\3\2\2\2\u05f7\u05f2\3\2\2\2\u05f7\u05f3\3\2"+
		"\2\2\u05f7\u05f4\3\2\2\2\u05f7\u05f5\3\2\2\2\u05f7\u05f6\3\2\2\2\u05f8"+
		"\u00ab\3\2\2\2\u05f9\u05fa\7\u00a3\2\2\u05fa\u00ad\3\2\2\2\u05fb\u05fd"+
		"\7w\2\2\u05fc\u05fb\3\2\2\2\u05fc\u05fd\3\2\2\2\u05fd\u05fe\3\2\2\2\u05fe"+
		"\u05ff\5\u00acW\2\u05ff\u00af\3\2\2\2\u0600\u0601\7>\2\2\u0601\u00b1\3"+
		"\2\2\2\u0602\u0606\5\f\7\2\u0603\u0606\5\34\17\2\u0604\u0606\5\16\b\2"+
		"\u0605\u0602\3\2\2\2\u0605\u0603\3\2\2\2\u0605\u0604\3\2\2\2\u0606\u00b3"+
		"\3\2\2\2\u0607\u060c\5\u00be`\2\u0608\u0609\7\23\2\2\u0609\u060b\5\u00be"+
		"`\2\u060a\u0608\3\2\2\2\u060b\u060e\3\2\2\2\u060c\u060a\3\2\2\2\u060c"+
		"\u060d\3\2\2\2\u060d\u00b5\3\2\2\2\u060e\u060c\3\2\2\2\u060f\u0612\5\u00ba"+
		"^\2\u0610\u0612\5\u00be`\2\u0611\u060f\3\2\2\2\u0611\u0610\3\2\2\2\u0612"+
		"\u00b7\3\2\2\2\u0613\u0617\5\u00ba^\2\u0614\u0617\5\u00be`\2\u0615\u0617"+
		"\5\u00c0a\2\u0616\u0613\3\2\2\2\u0616\u0614\3\2\2\2\u0616\u0615\3\2\2"+
		"\2\u0617\u00b9\3\2\2\2\u0618\u0619\7\u00a4\2\2\u0619\u00bb\3\2\2\2\u061a"+
		"\u061b\t\3\2\2\u061b\u00bd\3\2\2\2\u061c\u061d\7\u00a3\2\2\u061d\u00bf"+
		"\3\2\2\2\u061e\u061f\7\u00a2\2\2\u061f\u00c1\3\2\2\2\u0620\u0625\5\u00c4"+
		"c\2\u0621\u0622\7\23\2\2\u0622\u0624\5\u00c4c\2\u0623\u0621\3\2\2\2\u0624"+
		"\u0627\3\2\2\2\u0625\u0623\3\2\2\2\u0625\u0626\3\2\2\2\u0626\u00c3\3\2"+
		"\2\2\u0627\u0625\3\2\2\2\u0628\u062e\5\u00caf\2\u0629\u062b\7w\2\2\u062a"+
		"\u0629\3\2\2\2\u062a\u062b\3\2\2\2\u062b\u062c\3\2\2\2\u062c\u062e\5\u00c6"+
		"d\2\u062d\u0628\3\2\2\2\u062d\u062a\3\2\2\2\u062e\u00c5\3\2\2\2\u062f"+
		"\u0632\5\u00c8e\2\u0630\u0632\5\62\32\2\u0631\u062f\3\2\2\2\u0631\u0630"+
		"\3\2\2\2\u0632\u00c7\3\2\2\2\u0633\u0636\5\u00ba^\2\u0634\u0635\7-\2\2"+
		"\u0635\u0637\5\u0106\u0084\2\u0636\u0634\3\2\2\2\u0636\u0637\3\2\2\2\u0637"+
		"\u00c9\3\2\2\2\u0638\u0639\5\u00b0Y\2\u0639\u063a\5\u00ba^\2\u063a\u00cb"+
		"\3\2\2\2\u063b\u063e\5\u00a6T\2\u063c\u063e\5\u00ceh\2\u063d\u063b\3\2"+
		"\2\2\u063d\u063c\3\2\2\2\u063e\u00cd\3\2\2\2\u063f\u0640\bh\1\2\u0640"+
		"\u0641\7I\2\2\u0641\u064a\3\2\2\2\u0642\u0643\f\4\2\2\u0643\u0644\7\30"+
		"\2\2\u0644\u0649\7\31\2\2\u0645\u0646\f\3\2\2\u0646\u0647\7\32\2\2\u0647"+
		"\u0649\7\33\2\2\u0648\u0642\3\2\2\2\u0648\u0645\3\2\2\2\u0649\u064c\3"+
		"\2\2\2\u064a\u0648\3\2\2\2\u064a\u064b\3\2\2\2\u064b\u00cf\3\2\2\2\u064c"+
		"\u064a\3\2\2\2\u064d\u0653\5\u00d2j\2\u064e\u064f\5\u0084C\2\u064f\u0650"+
		"\5\u00d2j\2\u0650\u0652\3\2\2\2\u0651\u064e\3\2\2\2\u0652\u0655\3\2\2"+
		"\2\u0653\u0651\3\2\2\2\u0653\u0654\3\2\2\2\u0654\u00d1\3\2\2\2\u0655\u0653"+
		"\3\2\2\2\u0656\u065c\5\24\13\2\u0657\u065c\5\30\r\2\u0658\u065c\5(\25"+
		"\2\u0659\u065c\5&\24\2\u065a\u065c\5\22\n\2\u065b\u0656\3\2\2\2\u065b"+
		"\u0657\3\2\2\2\u065b\u0658\3\2\2\2\u065b\u0659\3\2\2\2\u065b\u065a\3\2"+
		"\2\2\u065c\u00d3\3\2\2\2\u065d\u0663\5\u00d6l\2\u065e\u065f\5\u0084C\2"+
		"\u065f\u0660\5\u00d6l\2\u0660\u0662\3\2\2\2\u0661\u065e\3\2\2\2\u0662"+
		"\u0665\3\2\2\2\u0663\u0661\3\2\2\2\u0663\u0664\3\2\2\2\u0664\u00d5\3\2"+
		"\2\2\u0665\u0663\3\2\2\2\u0666\u066a\5\32\16\2\u0667\u066a\5\26\f\2\u0668"+
		"\u066a\5*\26\2\u0669\u0666\3\2\2\2\u0669\u0667\3\2\2\2\u0669\u0668\3\2"+
		"\2\2\u066a\u00d7\3\2\2\2\u066b\u066c\7\13\2\2\u066c\u0676\5\u0182\u00c2"+
		"\2\u066d\u066e\7\f\2\2\u066e\u0676\5\u019c\u00cf\2\u066f\u0670\7\r\2\2"+
		"\u0670\u0676\5\u00dan\2\u0671\u0672\7\16\2\2\u0672\u0676\5\u00dan\2\u0673"+
		"\u0674\7\17\2\2\u0674\u0676\5\u00dep\2\u0675\u066b\3\2\2\2\u0675\u066d"+
		"\3\2\2\2\u0675\u066f\3\2\2\2\u0675\u0671\3\2\2\2\u0675\u0673\3\2\2\2\u0676"+
		"\u00d9\3\2\2\2\u0677\u0679\5\u00b8]\2\u0678\u067a\5\u00dco\2\u0679\u0678"+
		"\3\2\2\2\u0679\u067a\3\2\2\2\u067a\u00db\3\2\2\2\u067b\u067c\7l\2\2\u067c"+
		"\u067d\5\u012a\u0096\2\u067d\u067e\7\21\2\2\u067e\u0683\5\u00b8]\2\u067f"+
		"\u0680\7\25\2\2\u0680\u0682\5\u00b8]\2\u0681\u067f\3\2\2\2\u0682\u0685"+
		"\3\2\2\2\u0683\u0681\3\2\2\2\u0683\u0684\3\2\2\2\u0684\u00dd\3\2\2\2\u0685"+
		"\u0683\3\2\2\2\u0686\u0688\5\u00b8]\2\u0687\u0689\5\u00e0q\2\u0688\u0687"+
		"\3\2\2\2\u0688\u0689\3\2\2\2\u0689\u00df\3\2\2\2\u068a\u068b\7l\2\2\u068b"+
		"\u068c\5\u012a\u0096\2\u068c\u068e\7\21\2\2\u068d\u068f\7%\2\2\u068e\u068d"+
		"\3\2\2\2\u068e\u068f\3\2\2\2\u068f\u0690\3\2\2\2\u0690\u0695\5\u0152\u00aa"+
		"\2\u0691\u0692\7%\2\2\u0692\u0694\5\u0152\u00aa\2\u0693\u0691\3\2\2\2"+
		"\u0694\u0697\3\2\2\2\u0695\u0693\3\2\2\2\u0695\u0696\3\2\2\2\u0696\u069a"+
		"\3\2\2\2\u0697\u0695\3\2\2\2\u0698\u0699\7\25\2\2\u0699\u069b\5\u0152"+
		"\u00aa\2\u069a\u0698\3\2\2\2\u069a\u069b\3\2\2\2\u069b\u00e1\3\2\2\2\u069c"+
		"\u06a1\5\u00ba^\2\u069d\u069e\7\23\2\2\u069e\u06a0\5\u00ba^\2\u069f\u069d"+
		"\3\2\2\2\u06a0\u06a3\3\2\2\2\u06a1\u069f\3\2\2\2\u06a1\u06a2\3\2\2\2\u06a2"+
		"\u00e3\3\2\2\2\u06a3\u06a1\3\2\2\2\u06a4\u06a9\5\u00bc_\2\u06a5\u06a6"+
		"\7\23\2\2\u06a6\u06a8\5\u00bc_\2\u06a7\u06a5\3\2\2\2\u06a8\u06ab\3\2\2"+
		"\2\u06a9\u06a7\3\2\2\2\u06a9\u06aa\3\2\2\2\u06aa\u00e5\3\2\2\2\u06ab\u06a9"+
		"\3\2\2\2\u06ac\u06b1\5&\24\2\u06ad\u06b1\5(\25\2\u06ae\u06b1\5*\26\2\u06af"+
		"\u06b1\5,\27\2\u06b0\u06ac\3\2\2\2\u06b0\u06ad\3\2\2\2\u06b0\u06ae\3\2"+
		"\2\2\u06b0\u06af\3\2\2\2\u06b1\u00e7\3\2\2\2\u06b2\u06b3\7\n\2\2\u06b3"+
		"\u00e9\3\2\2\2\u06b4\u06ba\5\u00ecw\2\u06b5\u06b6\5\u0084C\2\u06b6\u06b7"+
		"\5\u00ecw\2\u06b7\u06b9\3\2\2\2\u06b8\u06b5\3\2\2\2\u06b9\u06bc\3\2\2"+
		"\2\u06ba\u06b8\3\2\2\2\u06ba\u06bb\3\2\2\2\u06bb\u00eb\3\2\2\2\u06bc\u06ba"+
		"\3\2\2\2\u06bd\u06be\7\13\2\2\u06be\u06c8\5\u016c\u00b7\2\u06bf\u06c0"+
		"\7\f\2\2\u06c0\u06c8\5\u0188\u00c5\2\u06c1\u06c2\7\r\2\2\u06c2\u06c8\5"+
		"\u00eex\2\u06c3\u06c4\7\16\2\2\u06c4\u06c8\5\u00eex\2\u06c5\u06c6\7\17"+
		"\2\2\u06c6\u06c8\5\u00f0y\2\u06c7\u06bd\3\2\2\2\u06c7\u06bf\3\2\2\2\u06c7"+
		"\u06c1\3\2\2\2\u06c7\u06c3\3\2\2\2\u06c7\u06c5\3\2\2\2\u06c8\u00ed\3\2"+
		"\2\2\u06c9\u06cb\5\u0154\u00ab\2\u06ca\u06cc\7\22\2\2\u06cb\u06ca\3\2"+
		"\2\2\u06cb\u06cc\3\2\2\2\u06cc\u06ce\3\2\2\2\u06cd\u06cf\5\u00dco\2\u06ce"+
		"\u06cd\3\2\2\2\u06ce\u06cf\3\2\2\2\u06cf\u00ef\3\2\2\2\u06d0\u06d2\5\u013a"+
		"\u009e\2\u06d1\u06d3\7\22\2\2\u06d2\u06d1\3\2\2\2\u06d2\u06d3\3\2\2\2"+
		"\u06d3\u06d5\3\2\2\2\u06d4\u06d6\5\u00e0q\2\u06d5\u06d4\3\2\2\2\u06d5"+
		"\u06d6\3\2\2\2\u06d6\u00f1\3\2\2\2\u06d7\u06dd\5\64\33\2\u06d8\u06d9\5"+
		"\u0084C\2\u06d9\u06da\5\64\33\2\u06da\u06dc\3\2\2\2\u06db\u06d8\3\2\2"+
		"\2\u06dc\u06df\3\2\2\2\u06dd\u06db\3\2\2\2\u06dd\u06de\3\2\2\2\u06de\u00f3"+
		"\3\2\2\2\u06df\u06dd\3\2\2\2\u06e0\u06e6\5.\30\2\u06e1\u06e2\5\u0084C"+
		"\2\u06e2\u06e3\5.\30\2\u06e3\u06e5\3\2\2\2\u06e4\u06e1\3\2\2\2\u06e5\u06e8"+
		"\3\2\2\2\u06e6\u06e4\3\2\2\2\u06e6\u06e7\3\2\2\2\u06e7\u00f5\3\2\2\2\u06e8"+
		"\u06e6\3\2\2\2\u06e9\u06ef\5B\"\2\u06ea\u06eb\5\u0084C\2\u06eb\u06ec\5"+
		"B\"\2\u06ec\u06ee\3\2\2\2\u06ed\u06ea\3\2\2\2\u06ee\u06f1\3\2\2\2\u06ef"+
		"\u06ed\3\2\2\2\u06ef\u06f0\3\2\2\2\u06f0\u00f7\3\2\2\2\u06f1\u06ef\3\2"+
		"\2\2\u06f2\u06f8\5R*\2\u06f3\u06f4\5\u0084C\2\u06f4\u06f5\5R*\2\u06f5"+
		"\u06f7\3\2\2\2\u06f6\u06f3\3\2\2\2\u06f7\u06fa\3\2\2\2\u06f8\u06f6\3\2"+
		"\2\2\u06f8\u06f9\3\2\2\2\u06f9\u00f9\3\2\2\2\u06fa\u06f8\3\2\2\2\u06fb"+
		"\u06fc\7\30\2\2\u06fc\u06fd\5\u00fc\177\2\u06fd\u06fe\7\24\2\2\u06fe\u06ff"+
		"\5\u00fc\177\2\u06ff\u0700\7\31\2\2\u0700\u070a\3\2\2\2\u0701\u0702\7"+
		"\30\2\2\u0702\u0703\5\u00fe\u0080\2\u0703\u0704\7\31\2\2\u0704\u070a\3"+
		"\2\2\2\u0705\u0706\7*\2\2\u0706\u0707\5\u00fe\u0080\2\u0707\u0708\7(\2"+
		"\2\u0708\u070a\3\2\2\2\u0709\u06fb\3\2\2\2\u0709\u0701\3\2\2\2\u0709\u0705"+
		"\3\2\2\2\u070a\u00fb\3\2\2\2\u070b\u071a\7\u00a0\2\2\u070c\u071a\7\u00a1"+
		"\2\2\u070d\u071a\7\u00a9\2\2\u070e\u071a\7\u00aa\2\2\u070f\u071a\7\u009f"+
		"\2\2\u0710\u071a\7\u00ae\2\2\u0711\u071a\7\u00ad\2\2\u0712\u071a\7\u00a7"+
		"\2\2\u0713\u071a\7\u00ab\2\2\u0714\u071a\7\u00ac\2\2\u0715\u071a\7\u009e"+
		"\2\2\u0716\u071a\7\u00af\2\2\u0717\u071a\7\u00a8\2\2\u0718\u071a\5\u008a"+
		"F\2\u0719\u070b\3\2\2\2\u0719\u070c\3\2\2\2\u0719\u070d\3\2\2\2\u0719"+
		"\u070e\3\2\2\2\u0719\u070f\3\2\2\2\u0719\u0710\3\2\2\2\u0719\u0711\3\2"+
		"\2\2\u0719\u0712\3\2\2\2\u0719\u0713\3\2\2\2\u0719\u0714\3\2\2\2\u0719"+
		"\u0715\3\2\2\2\u0719\u0716\3\2\2\2\u0719\u0717\3\2\2\2\u0719\u0718\3\2"+
		"\2\2\u071a\u00fd\3\2\2\2\u071b\u0720\5\u00fc\177\2\u071c\u071d\7\23\2"+
		"\2\u071d\u071f\5\u00fc\177\2\u071e\u071c\3\2\2\2\u071f\u0722\3\2\2\2\u0720"+
		"\u071e\3\2\2\2\u0720\u0721\3\2\2\2\u0721\u00ff\3\2\2\2\u0722\u0720\3\2"+
		"\2\2\u0723\u0728\5\u0104\u0083\2\u0724\u0728\5\u0106\u0084\2\u0725\u0728"+
		"\5\u00b8]\2\u0726\u0728\5\u0102\u0082\2\u0727\u0723\3\2\2\2\u0727\u0724"+
		"\3\2\2\2\u0727\u0725\3\2\2\2\u0727\u0726\3\2\2\2\u0728\u0101\3\2\2\2\u0729"+
		"\u072a\t\4\2\2\u072a\u0103\3\2\2\2\u072b\u072c\7\26\2\2\u072c\u072d\5"+
		"X-\2\u072d\u072e\7\27\2\2\u072e\u0105\3\2\2\2\u072f\u0732\5\u00fc\177"+
		"\2\u0730\u0732\5\u0108\u0085\2\u0731\u072f\3\2\2\2\u0731\u0730\3\2\2\2"+
		"\u0732\u0107\3\2\2\2\u0733\u0739\5\u00a4S\2\u0734\u0739\5\u009eP\2\u0735"+
		"\u0739\5\u00a0Q\2\u0736\u0739\5\u010c\u0087\2\u0737\u0739\5\u010a\u0086"+
		"\2\u0738\u0733\3\2\2\2\u0738\u0734\3\2\2\2\u0738\u0735\3\2\2\2\u0738\u0736"+
		"\3\2\2\2\u0738\u0737\3\2\2\2\u0739\u0109\3\2\2\2\u073a\u073c\7w\2\2\u073b"+
		"\u073a\3\2\2\2\u073b\u073c\3\2\2\2\u073c\u073d\3\2\2\2\u073d\u073f\7\26"+
		"\2\2\u073e\u0740\5\u010e\u0088\2\u073f\u073e\3\2\2\2\u073f\u0740\3\2\2"+
		"\2\u0740\u0741\3\2\2\2\u0741\u0742\7\27\2\2\u0742\u010b\3\2\2\2\u0743"+
		"\u0745\7w\2\2\u0744\u0743\3\2\2\2\u0744\u0745\3\2\2\2\u0745\u0746\3\2"+
		"\2\2\u0746\u0748\7\32\2\2\u0747\u0749\5\u0110\u0089\2\u0748\u0747\3\2"+
		"\2\2\u0748\u0749\3\2\2\2\u0749\u074a\3\2\2\2\u074a\u074b\7\33\2\2\u074b"+
		"\u010d\3\2\2\2\u074c\u074d\5X-\2\u074d\u0756\7\23\2\2\u074e\u0753\5X-"+
		"\2\u074f\u0750\7\23\2\2\u0750\u0752\5X-\2\u0751\u074f\3\2\2\2\u0752\u0755"+
		"\3\2\2\2\u0753\u0751\3\2\2\2\u0753\u0754\3\2\2\2\u0754\u0757\3\2\2\2\u0755"+
		"\u0753\3\2\2\2\u0756\u074e\3\2\2\2\u0756\u0757\3\2\2\2\u0757\u010f\3\2"+
		"\2\2\u0758\u075d\5\u0112\u008a\2\u0759\u075a\7\23\2\2\u075a\u075c\5\u0112"+
		"\u008a\2\u075b\u0759\3\2\2\2\u075c\u075f\3\2\2\2\u075d\u075b\3\2\2\2\u075d"+
		"\u075e\3\2\2\2\u075e\u0111\3\2\2\2\u075f\u075d\3\2\2\2\u0760\u0761\5X"+
		"-\2\u0761\u0762\7\21\2\2\u0762\u0763\5X-\2\u0763\u0113\3\2\2\2\u0764\u0765"+
		"\5X-\2\u0765\u0766\7\21\2\2\u0766\u0767\5X-\2\u0767\u076e\3\2\2\2\u0768"+
		"\u0769\5X-\2\u0769\u076a\7\21\2\2\u076a\u076e\3\2\2\2\u076b\u076c\7\21"+
		"\2\2\u076c\u076e\5X-\2\u076d\u0764\3\2\2\2\u076d\u0768\3\2\2\2\u076d\u076b"+
		"\3\2\2\2\u076e\u0115\3\2\2\2\u076f\u0770\5\u00ba^\2\u0770\u0771\5\u0130"+
		"\u0099\2\u0771\u0772\5X-\2\u0772\u0117\3\2\2\2\u0773\u0774\b\u008d\1\2"+
		"\u0774\u0775\5\u00ba^\2\u0775\u077a\3\2\2\2\u0776\u0777\f\3\2\2\u0777"+
		"\u0779\5~@\2\u0778\u0776\3\2\2\2\u0779\u077c\3\2\2\2\u077a\u0778\3\2\2"+
		"\2\u077a\u077b\3\2\2\2\u077b\u0119\3\2\2\2\u077c\u077a\3\2\2\2\u077d\u077e"+
		"\6\u008e\61\3\u077e\u077f\7\u00a4\2\2\u077f\u0782\5\u00ccg\2\u0780\u0782"+
		"\5X-\2\u0781\u077d\3\2\2\2\u0781\u0780\3\2\2\2\u0782\u011b\3\2\2\2\u0783"+
		"\u0784\7\u0086\2\2\u0784\u0785\7F\2\2\u0785\u0786\7l\2\2\u0786\u0787\5"+
		"X-\2\u0787\u011d\3\2\2\2\u0788\u0789\7\u0086\2\2\u0789\u078a\7~\2\2\u078a"+
		"\u078b\7l\2\2\u078b\u078c\5X-\2\u078c\u011f\3\2\2\2\u078d\u0792\5\u0122"+
		"\u0092\2\u078e\u078f\7\23\2\2\u078f\u0791\5\u0122\u0092\2\u0790\u078e"+
		"\3\2\2\2\u0791\u0794\3\2\2\2\u0792\u0790\3\2\2\2\u0792\u0793\3\2\2\2\u0793"+
		"\u0121\3\2\2\2\u0794\u0792\3\2\2\2\u0795\u079a\5\u00ba^\2\u0796\u0797"+
		"\7\25\2\2\u0797\u0799\5\u00ba^\2\u0798\u0796\3\2\2\2\u0799\u079c\3\2\2"+
		"\2\u079a\u0798\3\2\2\2\u079a\u079b\3\2\2\2\u079b\u079e\3\2\2\2\u079c\u079a"+
		"\3\2\2\2\u079d\u079f\t\5\2\2\u079e\u079d\3\2\2\2\u079e\u079f\3\2\2\2\u079f"+
		"\u0123\3\2\2\2\u07a0\u07a7\7\"\2\2\u07a1\u07a7\7#\2\2\u07a2\u07a7\5\u0132"+
		"\u009a\2\u07a3\u07a7\5\u0134\u009b\2\u07a4\u07a7\5\u0136\u009c\2\u07a5"+
		"\u07a7\5\u0138\u009d\2\u07a6\u07a0\3\2\2\2\u07a6\u07a1\3\2\2\2\u07a6\u07a2"+
		"\3\2\2\2\u07a6\u07a3\3\2\2\2\u07a6\u07a4\3\2\2\2\u07a6\u07a5\3\2\2\2\u07a7"+
		"\u0125\3\2\2\2\u07a8\u07a9\7\u00a4\2\2\u07a9\u07aa\6\u0094\62\3\u07aa"+
		"\u0127\3\2\2\2\u07ab\u07ac\7\u00a4\2\2\u07ac\u07ad\6\u0095\63\3\u07ad"+
		"\u0129\3\2\2\2\u07ae\u07af\7\u00a4\2\2\u07af\u07b0\6\u0096\64\3\u07b0"+
		"\u012b\3\2\2\2\u07b1\u07b2\7\u00a4\2\2\u07b2\u07b3\6\u0097\65\3\u07b3"+
		"\u012d\3\2\2\2\u07b4\u07b5\7\u00a4\2\2\u07b5\u07b6\6\u0098\66\3\u07b6"+
		"\u012f\3\2\2\2\u07b7\u07b8\7-\2\2\u07b8\u0131\3\2\2\2\u07b9\u07ba\7$\2"+
		"\2\u07ba\u0133\3\2\2\2\u07bb\u07bc\7%\2\2\u07bc\u0135\3\2\2\2\u07bd\u07be"+
		"\7&\2\2\u07be\u0137\3\2\2\2\u07bf\u07c0\t\6\2\2\u07c0\u0139\3\2\2\2\u07c1"+
		"\u07c2\7\u0089\2\2\u07c2\u07c3\5\u013c\u009f\2\u07c3\u07c4\7\22\2\2\u07c4"+
		"\u07c9\3\2\2\2\u07c5\u07c6\5\u013c\u009f\2\u07c6\u07c7\7\22\2\2\u07c7"+
		"\u07c9\3\2\2\2\u07c8\u07c1\3\2\2\2\u07c8\u07c5\3\2\2\2\u07c9\u013b\3\2"+
		"\2\2\u07ca\u07cb\b\u009f\1\2\u07cb\u07cc\5\u013e\u00a0\2\u07cc\u07d1\3"+
		"\2\2\2\u07cd\u07ce\f\3\2\2\u07ce\u07d0\5\u0144\u00a3\2\u07cf\u07cd\3\2"+
		"\2\2\u07d0\u07d3\3\2\2\2\u07d1\u07cf\3\2\2\2\u07d1\u07d2\3\2\2\2\u07d2"+
		"\u013d\3\2\2\2\u07d3\u07d1\3\2\2\2\u07d4\u07dc\5\u0140\u00a1\2\u07d5\u07dc"+
		"\5\u0142\u00a2\2\u07d6\u07dc\5\u014c\u00a7\2\u07d7\u07dc\5\u014e\u00a8"+
		"\2\u07d8\u07dc\5\u0150\u00a9\2\u07d9\u07dc\5\u0146\u00a4\2\u07da\u07dc"+
		"\5\u014a\u00a6\2\u07db\u07d4\3\2\2\2\u07db\u07d5\3\2\2\2\u07db\u07d6\3"+
		"\2\2\2\u07db\u07d7\3\2\2\2\u07db\u07d8\3\2\2\2\u07db\u07d9\3\2\2\2\u07db"+
		"\u07da\3\2\2\2\u07dc\u013f\3\2\2\2\u07dd\u07de\5\u0102\u0082\2\u07de\u0141"+
		"\3\2\2\2\u07df\u07e0\5\u0126\u0094\2\u07e0\u07e1\5\u0146\u00a4\2\u07e1"+
		"\u0143\3\2\2\2\u07e2\u07e3\7\25\2\2\u07e3\u07e8\5\u0146\u00a4\2\u07e4"+
		"\u07e5\7\25\2\2\u07e5\u07e8\5\u0152\u00aa\2\u07e6\u07e8\5\u014a\u00a6"+
		"\2\u07e7\u07e2\3\2\2\2\u07e7\u07e4\3\2\2\2\u07e7\u07e6\3\2\2\2\u07e8\u0145"+
		"\3\2\2\2\u07e9\u07ea\5\u0152\u00aa\2\u07ea\u07ec\7\26\2\2\u07eb\u07ed"+
		"\5\u0148\u00a5\2\u07ec\u07eb\3\2\2\2\u07ec\u07ed\3\2\2\2\u07ed\u07ee\3"+
		"\2\2\2\u07ee\u07ef\7\27\2\2\u07ef\u0147\3\2\2\2\u07f0\u07f1\b\u00a5\1"+
		"\2\u07f1\u07f2\5\u013c\u009f\2\u07f2\u07f8\3\2\2\2\u07f3\u07f4\f\3\2\2"+
		"\u07f4\u07f5\7\23\2\2\u07f5\u07f7\5\u013c\u009f\2\u07f6\u07f3\3\2\2\2"+
		"\u07f7\u07fa\3\2\2\2\u07f8\u07f6\3\2\2\2\u07f8\u07f9\3\2\2\2\u07f9\u0149"+
		"\3\2\2\2\u07fa\u07f8\3\2\2\2\u07fb\u07fc\7\30\2\2\u07fc\u07fd\5\u013c"+
		"\u009f\2\u07fd\u07fe\7\31\2\2\u07fe\u014b\3\2\2\2\u07ff\u0800\7\26\2\2"+
		"\u0800\u0801\5\u013c\u009f\2\u0801\u0802\7\27\2\2\u0802\u014d\3\2\2\2"+
		"\u0803\u0804\5\u0152\u00aa\2\u0804\u014f\3\2\2\2\u0805\u080b\7\u00a9\2"+
		"\2\u0806\u080b\7\u00ab\2\2\u0807\u080b\7\u00a7\2\2\u0808\u080b\7\u009e"+
		"\2\2\u0809\u080b\7\u009f\2\2\u080a\u0805\3\2\2\2\u080a\u0806\3\2\2\2\u080a"+
		"\u0807\3\2\2\2\u080a\u0808\3\2\2\2\u080a\u0809\3\2\2\2\u080b\u0151\3\2"+
		"\2\2\u080c\u080d\t\7\2\2\u080d\u0153\3\2\2\2\u080e\u080f\7\u0089\2\2\u080f"+
		"\u0812\5\u0156\u00ac\2\u0810\u0812\5\u0156\u00ac\2\u0811\u080e\3\2\2\2"+
		"\u0811\u0810\3\2\2\2\u0812\u0155\3\2\2\2\u0813\u0814\b\u00ac\1\2\u0814"+
		"\u0815\5\u0158\u00ad\2\u0815\u081a\3\2\2\2\u0816\u0817\f\3\2\2\u0817\u0819"+
		"\5\u015a\u00ae\2\u0818\u0816\3\2\2\2\u0819\u081c\3\2\2\2\u081a\u0818\3"+
		"\2\2\2\u081a\u081b\3\2\2\2\u081b\u0157\3\2\2\2\u081c\u081a\3\2\2\2\u081d"+
		"\u0822\5\u0164\u00b3\2\u081e\u0822\5\u0166\u00b4\2\u081f\u0822\5\u0168"+
		"\u00b5\2\u0820\u0822\5\u015c\u00af\2\u0821\u081d\3\2\2\2\u0821\u081e\3"+
		"\2\2\2\u0821\u081f\3\2\2\2\u0821\u0820\3\2\2\2\u0822\u0159\3\2\2\2\u0823"+
		"\u0824\7\25\2\2\u0824\u082a\5\u015c\u00af\2\u0825\u0826\7\30\2\2\u0826"+
		"\u0827\5\u0156\u00ac\2\u0827\u0828\7\31\2\2\u0828\u082a\3\2\2\2\u0829"+
		"\u0823\3\2\2\2\u0829\u0825\3\2\2\2\u082a\u015b\3\2\2\2\u082b\u082c\5\u016a"+
		"\u00b6\2\u082c\u082e\7\26\2\2\u082d\u082f\5\u015e\u00b0\2\u082e\u082d"+
		"\3\2\2\2\u082e\u082f\3\2\2\2\u082f\u0830\3\2\2\2\u0830\u0831\7\27\2\2"+
		"\u0831\u015d\3\2\2\2\u0832\u0839\5\u0160\u00b1\2\u0833\u0839\5\u0162\u00b2"+
		"\2\u0834\u0835\5\u0160\u00b1\2\u0835\u0836\7\23\2\2\u0836\u0837\5\u0162"+
		"\u00b2\2\u0837\u0839\3\2\2\2\u0838\u0832\3\2\2\2\u0838\u0833\3\2\2\2\u0838"+
		"\u0834\3\2\2\2\u0839\u015f\3\2\2\2\u083a\u083b\b\u00b1\1\2\u083b\u083c"+
		"\5\u0156\u00ac\2\u083c\u0842\3\2\2\2\u083d\u083e\f\3\2\2\u083e\u083f\7"+
		"\23\2\2\u083f\u0841\5\u0156\u00ac\2\u0840\u083d\3\2\2\2\u0841\u0844\3"+
		"\2\2\2\u0842\u0840\3\2\2\2\u0842\u0843\3\2\2\2\u0843\u0161\3\2\2\2\u0844"+
		"\u0842\3\2\2\2\u0845\u0846\b\u00b2\1\2\u0846\u0847\5\u016a\u00b6\2\u0847"+
		"\u0848\7-\2\2\u0848\u0849\5\u0156\u00ac\2\u0849\u0852\3\2\2\2\u084a\u084b"+
		"\f\3\2\2\u084b\u084c\7\23\2\2\u084c\u084d\5\u016a\u00b6\2\u084d\u084e"+
		"\7-\2\2\u084e\u084f\5\u0156\u00ac\2\u084f\u0851\3\2\2\2\u0850\u084a\3"+
		"\2\2\2\u0851\u0854\3\2\2\2\u0852\u0850\3\2\2\2\u0852\u0853\3\2\2\2\u0853"+
		"\u0163\3\2\2\2\u0854\u0852\3\2\2\2\u0855\u0856\7\26\2\2\u0856\u0857\5"+
		"\u0156\u00ac\2\u0857\u0858\7\27\2\2\u0858\u0165\3\2\2\2\u0859\u085a\b"+
		"\u00b4\1\2\u085a\u085d\7\u00a6\2\2\u085b\u085d\5\u016a\u00b6\2\u085c\u0859"+
		"\3\2\2\2\u085c\u085b\3\2\2\2\u085d\u0863\3\2\2\2\u085e\u085f\f\3\2\2\u085f"+
		"\u0860\7\25\2\2\u0860\u0862\5\u016a\u00b6\2\u0861\u085e\3\2\2\2\u0862"+
		"\u0865\3\2\2\2\u0863\u0861\3\2\2\2\u0863\u0864\3\2\2\2\u0864\u0167\3\2"+
		"\2\2\u0865\u0863\3\2\2\2\u0866\u086c\7\u00a9\2\2\u0867\u086c\7\u00ab\2"+
		"\2\u0868\u086c\7\u00a7\2\2\u0869\u086c\7\u009e\2\2\u086a\u086c\7\u009f"+
		"\2\2\u086b\u0866\3\2\2\2\u086b\u0867\3\2\2\2\u086b\u0868\3\2\2\2\u086b"+
		"\u0869\3\2\2\2\u086b\u086a\3\2\2\2\u086c\u0169\3\2\2\2\u086d\u086e\t\b"+
		"\2\2\u086e\u016b\3\2\2\2\u086f\u0870\7\u0089\2\2\u0870\u0871\5\u016e\u00b8"+
		"\2\u0871\u0872\7\22\2\2\u0872\u0877\3\2\2\2\u0873\u0874\5\u016e\u00b8"+
		"\2\u0874\u0875\7\22\2\2\u0875\u0877\3\2\2\2\u0876\u086f\3\2\2\2\u0876"+
		"\u0873\3\2\2\2\u0877\u016d\3\2\2\2\u0878\u0879\b\u00b8\1\2\u0879\u087a"+
		"\5\u0170\u00b9\2\u087a\u087f\3\2\2\2\u087b\u087c\f\3\2\2\u087c\u087e\5"+
		"\u0176\u00bc\2\u087d\u087b\3\2\2\2\u087e\u0881\3\2\2\2\u087f\u087d\3\2"+
		"\2\2\u087f\u0880\3\2\2\2\u0880\u016f\3\2\2\2\u0881\u087f\3\2\2\2\u0882"+
		"\u0888\5\u0172\u00ba\2\u0883\u0888\5\u0174\u00bb\2\u0884\u0888\5\u017e"+
		"\u00c0\2\u0885\u0888\5\u0180\u00c1\2\u0886\u0888\5\u0184\u00c3\2\u0887"+
		"\u0882\3\2\2\2\u0887\u0883\3\2\2\2\u0887\u0884\3\2\2\2\u0887\u0885\3\2"+
		"\2\2\u0887\u0886\3\2\2\2\u0888\u0171\3\2\2\2\u0889\u088a\5\u0102\u0082"+
		"\2\u088a\u0173\3\2\2\2\u088b\u088c\5\u0126\u0094\2\u088c\u088d\5\u0178"+
		"\u00bd\2\u088d\u0175\3\2\2\2\u088e\u088f\7\25\2\2\u088f\u0892\5\u0178"+
		"\u00bd\2\u0890\u0892\5\u017c\u00bf\2\u0891\u088e\3\2\2\2\u0891\u0890\3"+
		"\2\2\2\u0892\u0177\3\2\2\2\u0893\u0894\5\u0186\u00c4\2\u0894\u0896\7\26"+
		"\2\2\u0895\u0897\5\u017a\u00be\2\u0896\u0895\3\2\2\2\u0896\u0897\3\2\2"+
		"\2\u0897\u0898\3\2\2\2\u0898\u0899\7\27\2\2\u0899\u0179\3\2\2\2\u089a"+
		"\u089b\b\u00be\1\2\u089b\u089c\5\u016e\u00b8\2\u089c\u08a2\3\2\2\2\u089d"+
		"\u089e\f\3\2\2\u089e\u089f\7\23\2\2\u089f\u08a1\5\u016e\u00b8\2\u08a0"+
		"\u089d\3\2\2\2\u08a1\u08a4\3\2\2\2\u08a2\u08a0\3\2\2\2\u08a2\u08a3\3\2"+
		"\2\2\u08a3\u017b\3\2\2\2\u08a4\u08a2\3\2\2\2\u08a5\u08a6\7\30\2\2\u08a6"+
		"\u08a7\5\u016e\u00b8\2\u08a7\u08a8\7\31\2\2\u08a8\u017d\3\2\2\2\u08a9"+
		"\u08aa\7\26\2\2\u08aa\u08ab\5\u016e\u00b8\2\u08ab\u08ac\7\27\2\2\u08ac"+
		"\u017f\3\2\2\2\u08ad\u08ae\b\u00c1\1\2\u08ae\u08af\5\u0186\u00c4\2\u08af"+
		"\u08b5\3\2\2\2\u08b0\u08b1\f\3\2\2\u08b1\u08b2\7\25\2\2\u08b2\u08b4\5"+
		"\u0186\u00c4\2\u08b3\u08b0\3\2\2\2\u08b4\u08b7\3\2\2\2\u08b5\u08b3\3\2"+
		"\2\2\u08b5\u08b6\3\2\2\2\u08b6\u0181\3\2\2\2\u08b7\u08b5\3\2\2\2\u08b8"+
		"\u08b9\b\u00c2\1\2\u08b9\u08ba\5\u0180\u00c1\2\u08ba\u08bf\3\2\2\2\u08bb"+
		"\u08bc\f\3\2\2\u08bc\u08be\7\u00a6\2\2\u08bd\u08bb\3\2\2\2\u08be\u08c1"+
		"\3\2\2\2\u08bf\u08bd\3\2\2\2\u08bf\u08c0\3\2\2\2\u08c0\u0183\3\2\2\2\u08c1"+
		"\u08bf\3\2\2\2\u08c2\u08c8\7\u00a9\2\2\u08c3\u08c8\7\u00ab\2\2\u08c4\u08c8"+
		"\7\u00a7\2\2\u08c5\u08c8\7\u009e\2\2\u08c6\u08c8\7\u009f\2\2\u08c7\u08c2"+
		"\3\2\2\2\u08c7\u08c3\3\2\2\2\u08c7\u08c4\3\2\2\2\u08c7\u08c5\3\2\2\2\u08c7"+
		"\u08c6\3\2\2\2\u08c8\u0185\3\2\2\2\u08c9\u08ca\t\t\2\2\u08ca\u0187\3\2"+
		"\2\2\u08cb\u08cc\7\u0089\2\2\u08cc\u08cd\5\u018a\u00c6\2\u08cd\u08ce\7"+
		"\22\2\2\u08ce\u08d3\3\2\2\2\u08cf\u08d0\5\u018a\u00c6\2\u08d0\u08d1\7"+
		"\22\2\2\u08d1\u08d3\3\2\2\2\u08d2\u08cb\3\2\2\2\u08d2\u08cf\3\2\2\2\u08d3"+
		"\u0189\3\2\2\2\u08d4\u08d5\b\u00c6\1\2\u08d5\u08d6\5\u018c\u00c7\2\u08d6"+
		"\u08db\3\2\2\2\u08d7\u08d8\f\3\2\2\u08d8\u08da\5\u0192\u00ca\2\u08d9\u08d7"+
		"\3\2\2\2\u08da\u08dd\3\2\2\2\u08db\u08d9\3\2\2\2\u08db\u08dc\3\2\2\2\u08dc"+
		"\u018b\3\2\2\2\u08dd\u08db\3\2\2\2\u08de\u08e4\5\u018e\u00c8\2\u08df\u08e4"+
		"\5\u0190\u00c9\2\u08e0\u08e4\5\u019a\u00ce\2\u08e1\u08e4\5\u019c\u00cf"+
		"\2\u08e2\u08e4\5\u019e\u00d0\2\u08e3\u08de\3\2\2\2\u08e3\u08df\3\2\2\2"+
		"\u08e3\u08e0\3\2\2\2\u08e3\u08e1\3\2\2\2\u08e3\u08e2\3\2\2\2\u08e4\u018d"+
		"\3\2\2\2\u08e5\u08e6\5\u0102\u0082\2\u08e6\u018f\3\2\2\2\u08e7\u08e8\5"+
		"\u0126\u0094\2\u08e8\u08e9\5\u0194\u00cb\2\u08e9\u0191\3\2\2\2\u08ea\u08eb"+
		"\7\25\2\2\u08eb\u08ee\5\u0194\u00cb\2\u08ec\u08ee\5\u0198\u00cd\2\u08ed"+
		"\u08ea\3\2\2\2\u08ed\u08ec\3\2\2\2\u08ee\u0193\3\2\2\2\u08ef\u08f0\5\u01a0"+
		"\u00d1\2\u08f0\u08f2\7\26\2\2\u08f1\u08f3\5\u0196\u00cc\2\u08f2\u08f1"+
		"\3\2\2\2\u08f2\u08f3\3\2\2\2\u08f3\u08f4\3\2\2\2\u08f4\u08f5\7\27\2\2"+
		"\u08f5\u0195\3\2\2\2\u08f6\u08f7\b\u00cc\1\2\u08f7\u08f8\5\u018a\u00c6"+
		"\2\u08f8\u08fe\3\2\2\2\u08f9\u08fa\f\3\2\2\u08fa\u08fb\7\23\2\2\u08fb"+
		"\u08fd\5\u018a\u00c6\2\u08fc\u08f9\3\2\2\2\u08fd\u0900\3\2\2\2\u08fe\u08fc"+
		"\3\2\2\2\u08fe\u08ff\3\2\2\2\u08ff\u0197\3\2\2\2\u0900\u08fe\3\2\2\2\u0901"+
		"\u0902\7\30\2\2\u0902\u0903\5\u018a\u00c6\2\u0903\u0904\7\31\2\2\u0904"+
		"\u0199\3\2\2\2\u0905\u0906\7\26\2\2\u0906\u0907\5\u018a\u00c6\2\u0907"+
		"\u0908\7\27\2\2\u0908\u019b\3\2\2\2\u0909\u090a\b\u00cf\1\2\u090a\u090d"+
		"\7\u00a6\2\2\u090b\u090d\5\u01a0\u00d1\2\u090c\u0909\3\2\2\2\u090c\u090b"+
		"\3\2\2\2\u090d\u0913\3\2\2\2\u090e\u090f\f\3\2\2\u090f\u0910\7\25\2\2"+
		"\u0910\u0912\5\u01a0\u00d1\2\u0911\u090e\3\2\2\2\u0912\u0915\3\2\2\2\u0913"+
		"\u0911\3\2\2\2\u0913\u0914\3\2\2\2\u0914\u019d\3\2\2\2\u0915\u0913\3\2"+
		"\2\2\u0916\u091c\7\u00a9\2\2\u0917\u091c\7\u00ab\2\2\u0918\u091c\7\u00a7"+
		"\2\2\u0919\u091c\7\u009e\2\2\u091a\u091c\7\u009f\2\2\u091b\u0916\3\2\2"+
		"\2\u091b\u0917\3\2\2\2\u091b\u0918\3\2\2\2\u091b\u0919\3\2\2\2\u091b\u091a"+
		"\3\2\2\2\u091c\u019f\3\2\2\2\u091d\u091e\t\n\2\2\u091e\u01a1\3\2\2\2\u00c7"+
		"\u01a8\u01af\u01cd\u01d3\u01d8\u01de\u01e0\u01e3\u01e9\u01ed\u01f8\u0201"+
		"\u0210\u0219\u0220\u022a\u0240\u0257\u0264\u026f\u027d\u028b\u0299\u02ad"+
		"\u02b8\u02ba\u02c3\u02c7\u02cf\u02d3\u02df\u02e4\u02e8\u0303\u030a\u030f"+
		"\u0313\u0328\u0336\u033a\u033d\u035e\u0371\u0378\u039a\u03a3\u03ba\u03ca"+
		"\u03cf\u03d7\u03e0\u03f7\u03fd\u041b\u0484\u0486\u0490\u04a5\u04b5\u04ba"+
		"\u04c4\u04c9\u04cb\u04d1\u04d3\u04d5\u04e9\u04f0\u04f3\u04f9\u04fd\u0502"+
		"\u0504\u0508\u0510\u0517\u0519\u051e\u0520\u052b\u053e\u0547\u054d\u0552"+
		"\u0559\u0561\u056c\u0574\u057c\u0582\u058a\u0593\u059b\u05a8\u05ab\u05af"+
		"\u05b4\u05b8\u05c1\u05d6\u05e0\u05e2\u05e7\u05f7\u05fc\u0605\u060c\u0611"+
		"\u0616\u0625\u062a\u062d\u0631\u0636\u063d\u0648\u064a\u0653\u065b\u0663"+
		"\u0669\u0675\u0679\u0683\u0688\u068e\u0695\u069a\u06a1\u06a9\u06b0\u06ba"+
		"\u06c7\u06cb\u06ce\u06d2\u06d5\u06dd\u06e6\u06ef\u06f8\u0709\u0719\u0720"+
		"\u0727\u0731\u0738\u073b\u073f\u0744\u0748\u0753\u0756\u075d\u076d\u077a"+
		"\u0781\u0792\u079a\u079e\u07a6\u07c8\u07d1\u07db\u07e7\u07ec\u07f8\u080a"+
		"\u0811\u081a\u0821\u0829\u082e\u0838\u0842\u0852\u085c\u0863\u086b\u0876"+
		"\u087f\u0887\u0891\u0896\u08a2\u08b5\u08bf\u08c7\u08d2\u08db\u08e3\u08ed"+
		"\u08f2\u08fe\u090c\u0913\u091b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}