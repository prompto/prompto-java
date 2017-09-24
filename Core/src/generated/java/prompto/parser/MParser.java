// Generated from MParser.g4 by ANTLR 4.5
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
		DATE=55, TIME=56, DATETIME=57, PERIOD=58, VERSION=59, METHOD_T=60, CODE=61, 
		DOCUMENT=62, BLOB=63, IMAGE=64, UUID=65, ITERATOR=66, CURSOR=67, ABSTRACT=68, 
		ALL=69, ALWAYS=70, AND=71, ANY=72, AS=73, ASC=74, ATTR=75, ATTRIBUTE=76, 
		ATTRIBUTES=77, BINDINGS=78, BREAK=79, BY=80, CASE=81, CATCH=82, CATEGORY=83, 
		CLASS=84, CLOSE=85, CONTAINS=86, DEF=87, DEFAULT=88, DEFINE=89, DELETE=90, 
		DESC=91, DO=92, DOING=93, EACH=94, ELSE=95, ENUM=96, ENUMERATED=97, EXCEPT=98, 
		EXECUTE=99, EXPECTING=100, EXTENDS=101, FETCH=102, FILTERED=103, FINALLY=104, 
		FLUSH=105, FOR=106, FROM=107, GETTER=108, IF=109, IN=110, INDEX=111, INVOKE=112, 
		IS=113, MATCHING=114, METHOD=115, METHODS=116, MODULO=117, MUTABLE=118, 
		NATIVE=119, NONE=120, NOT=121, NOTHING=122, NULL=123, ON=124, ONE=125, 
		OPEN=126, OPERATOR=127, OR=128, ORDER=129, OTHERWISE=130, PASS=131, RAISE=132, 
		READ=133, RECEIVING=134, RESOURCE=135, RETURN=136, RETURNING=137, ROWS=138, 
		SELF=139, SETTER=140, SINGLETON=141, SORTED=142, STORABLE=143, STORE=144, 
		SWITCH=145, TEST=146, THIS=147, THROW=148, TO=149, TRY=150, VERIFYING=151, 
		WITH=152, WHEN=153, WHERE=154, WHILE=155, WRITE=156, BOOLEAN_LITERAL=157, 
		CHAR_LITERAL=158, MIN_INTEGER=159, MAX_INTEGER=160, SYMBOL_IDENTIFIER=161, 
		TYPE_IDENTIFIER=162, VARIABLE_IDENTIFIER=163, NATIVE_IDENTIFIER=164, DOLLAR_IDENTIFIER=165, 
		TEXT_LITERAL=166, UUID_LITERAL=167, INTEGER_LITERAL=168, HEXA_LITERAL=169, 
		DECIMAL_LITERAL=170, DATETIME_LITERAL=171, TIME_LITERAL=172, DATE_LITERAL=173, 
		PERIOD_LITERAL=174, VERSION_LITERAL=175;
	public static final int
		RULE_enum_category_declaration = 0, RULE_enum_native_declaration = 1, 
		RULE_native_symbol = 2, RULE_category_symbol = 3, RULE_attribute_declaration = 4, 
		RULE_index_clause = 5, RULE_concrete_category_declaration = 6, RULE_singleton_category_declaration = 7, 
		RULE_derived_list = 8, RULE_operator_method_declaration = 9, RULE_setter_method_declaration = 10, 
		RULE_native_setter_declaration = 11, RULE_getter_method_declaration = 12, 
		RULE_native_getter_declaration = 13, RULE_native_category_declaration = 14, 
		RULE_native_resource_declaration = 15, RULE_native_category_bindings = 16, 
		RULE_native_category_binding_list = 17, RULE_abstract_method_declaration = 18, 
		RULE_concrete_method_declaration = 19, RULE_native_method_declaration = 20, 
		RULE_test_method_declaration = 21, RULE_assertion = 22, RULE_typed_argument = 23, 
		RULE_statement = 24, RULE_flush_statement = 25, RULE_store_statement = 26, 
		RULE_method_call = 27, RULE_method_selector = 28, RULE_callable_parent = 29, 
		RULE_callable_selector = 30, RULE_with_resource_statement = 31, RULE_with_singleton_statement = 32, 
		RULE_switch_statement = 33, RULE_switch_case_statement = 34, RULE_for_each_statement = 35, 
		RULE_do_while_statement = 36, RULE_while_statement = 37, RULE_if_statement = 38, 
		RULE_else_if_statement_list = 39, RULE_raise_statement = 40, RULE_try_statement = 41, 
		RULE_catch_statement = 42, RULE_break_statement = 43, RULE_return_statement = 44, 
		RULE_expression = 45, RULE_closure_expression = 46, RULE_instance_expression = 47, 
		RULE_method_expression = 48, RULE_instance_selector = 49, RULE_blob_expression = 50, 
		RULE_document_expression = 51, RULE_constructor_expression = 52, RULE_argument_assignment_list = 53, 
		RULE_argument_assignment = 54, RULE_write_statement = 55, RULE_filtered_list_suffix = 56, 
		RULE_fetch_store_expression = 57, RULE_sorted_expression = 58, RULE_assign_instance_statement = 59, 
		RULE_child_instance = 60, RULE_assign_tuple_statement = 61, RULE_lfs = 62, 
		RULE_lfp = 63, RULE_indent = 64, RULE_dedent = 65, RULE_null_literal = 66, 
		RULE_declaration_list = 67, RULE_declarations = 68, RULE_declaration = 69, 
		RULE_resource_declaration = 70, RULE_enum_declaration = 71, RULE_native_symbol_list = 72, 
		RULE_category_symbol_list = 73, RULE_symbol_list = 74, RULE_attribute_constraint = 75, 
		RULE_list_literal = 76, RULE_set_literal = 77, RULE_expression_list = 78, 
		RULE_range_literal = 79, RULE_typedef = 80, RULE_primary_type = 81, RULE_native_type = 82, 
		RULE_category_type = 83, RULE_mutable_category_type = 84, RULE_code_type = 85, 
		RULE_category_declaration = 86, RULE_type_identifier_list = 87, RULE_method_identifier = 88, 
		RULE_identifier = 89, RULE_variable_identifier = 90, RULE_attribute_identifier = 91, 
		RULE_type_identifier = 92, RULE_symbol_identifier = 93, RULE_argument_list = 94, 
		RULE_argument = 95, RULE_operator_argument = 96, RULE_named_argument = 97, 
		RULE_code_argument = 98, RULE_category_or_any_type = 99, RULE_any_type = 100, 
		RULE_member_method_declaration_list = 101, RULE_member_method_declaration = 102, 
		RULE_native_member_method_declaration_list = 103, RULE_native_member_method_declaration = 104, 
		RULE_native_category_binding = 105, RULE_python_category_binding = 106, 
		RULE_python_module = 107, RULE_javascript_category_binding = 108, RULE_javascript_module = 109, 
		RULE_variable_identifier_list = 110, RULE_attribute_identifier_list = 111, 
		RULE_method_declaration = 112, RULE_comment_statement = 113, RULE_native_statement_list = 114, 
		RULE_native_statement = 115, RULE_python_native_statement = 116, RULE_javascript_native_statement = 117, 
		RULE_statement_list = 118, RULE_assertion_list = 119, RULE_switch_case_statement_list = 120, 
		RULE_catch_statement_list = 121, RULE_literal_collection = 122, RULE_atomic_literal = 123, 
		RULE_literal_list_literal = 124, RULE_selectable_expression = 125, RULE_this_expression = 126, 
		RULE_parenthesis_expression = 127, RULE_literal_expression = 128, RULE_collection_literal = 129, 
		RULE_tuple_literal = 130, RULE_dict_literal = 131, RULE_expression_tuple = 132, 
		RULE_dict_entry_list = 133, RULE_dict_entry = 134, RULE_slice_arguments = 135, 
		RULE_assign_variable_statement = 136, RULE_assignable_instance = 137, 
		RULE_is_expression = 138, RULE_read_all_expression = 139, RULE_read_one_expression = 140, 
		RULE_order_by_list = 141, RULE_order_by = 142, RULE_operator = 143, RULE_new_token = 144, 
		RULE_key_token = 145, RULE_module_token = 146, RULE_value_token = 147, 
		RULE_symbols_token = 148, RULE_assign = 149, RULE_multiply = 150, RULE_divide = 151, 
		RULE_idivide = 152, RULE_modulo = 153, RULE_javascript_statement = 154, 
		RULE_javascript_expression = 155, RULE_javascript_primary_expression = 156, 
		RULE_javascript_this_expression = 157, RULE_javascript_new_expression = 158, 
		RULE_javascript_selector_expression = 159, RULE_javascript_method_expression = 160, 
		RULE_javascript_arguments = 161, RULE_javascript_item_expression = 162, 
		RULE_javascript_parenthesis_expression = 163, RULE_javascript_identifier_expression = 164, 
		RULE_javascript_literal_expression = 165, RULE_javascript_identifier = 166, 
		RULE_python_statement = 167, RULE_python_expression = 168, RULE_python_primary_expression = 169, 
		RULE_python_self_expression = 170, RULE_python_selector_expression = 171, 
		RULE_python_method_expression = 172, RULE_python_argument_list = 173, 
		RULE_python_ordinal_argument_list = 174, RULE_python_named_argument_list = 175, 
		RULE_python_parenthesis_expression = 176, RULE_python_identifier_expression = 177, 
		RULE_python_literal_expression = 178, RULE_python_identifier = 179, RULE_java_statement = 180, 
		RULE_java_expression = 181, RULE_java_primary_expression = 182, RULE_java_this_expression = 183, 
		RULE_java_new_expression = 184, RULE_java_selector_expression = 185, RULE_java_method_expression = 186, 
		RULE_java_arguments = 187, RULE_java_item_expression = 188, RULE_java_parenthesis_expression = 189, 
		RULE_java_identifier_expression = 190, RULE_java_class_identifier_expression = 191, 
		RULE_java_literal_expression = 192, RULE_java_identifier = 193, RULE_csharp_statement = 194, 
		RULE_csharp_expression = 195, RULE_csharp_primary_expression = 196, RULE_csharp_this_expression = 197, 
		RULE_csharp_new_expression = 198, RULE_csharp_selector_expression = 199, 
		RULE_csharp_method_expression = 200, RULE_csharp_arguments = 201, RULE_csharp_item_expression = 202, 
		RULE_csharp_parenthesis_expression = 203, RULE_csharp_identifier_expression = 204, 
		RULE_csharp_literal_expression = 205, RULE_csharp_identifier = 206;
	public static final String[] ruleNames = {
		"enum_category_declaration", "enum_native_declaration", "native_symbol", 
		"category_symbol", "attribute_declaration", "index_clause", "concrete_category_declaration", 
		"singleton_category_declaration", "derived_list", "operator_method_declaration", 
		"setter_method_declaration", "native_setter_declaration", "getter_method_declaration", 
		"native_getter_declaration", "native_category_declaration", "native_resource_declaration", 
		"native_category_bindings", "native_category_binding_list", "abstract_method_declaration", 
		"concrete_method_declaration", "native_method_declaration", "test_method_declaration", 
		"assertion", "typed_argument", "statement", "flush_statement", "store_statement", 
		"method_call", "method_selector", "callable_parent", "callable_selector", 
		"with_resource_statement", "with_singleton_statement", "switch_statement", 
		"switch_case_statement", "for_each_statement", "do_while_statement", "while_statement", 
		"if_statement", "else_if_statement_list", "raise_statement", "try_statement", 
		"catch_statement", "break_statement", "return_statement", "expression", 
		"closure_expression", "instance_expression", "method_expression", "instance_selector", 
		"blob_expression", "document_expression", "constructor_expression", "argument_assignment_list", 
		"argument_assignment", "write_statement", "filtered_list_suffix", "fetch_store_expression", 
		"sorted_expression", "assign_instance_statement", "child_instance", "assign_tuple_statement", 
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
		"csharp_identifier"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, "'\t'", "' '", null, "'Java:'", "'C#:'", 
		"'Python2:'", "'Python3:'", "'JavaScript:'", "'Swift:'", "':'", "';'", 
		null, "'..'", null, null, null, null, null, null, null, null, "'!'", "'&'", 
		"'&&'", "'|'", "'||'", null, "'-'", "'*'", "'/'", "'\\'", "'%'", "'>'", 
		"'>='", "'<'", "'<='", "'<>'", "'='", "'!='", "'=='", "'~='", "'~'", "'<-'", 
		"'->'", "'Boolean'", "'Character'", "'Text'", "'Integer'", "'Decimal'", 
		"'Date'", "'Time'", "'DateTime'", "'Period'", "'Version'", "'Method'", 
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
		"TEXT", "INTEGER", "DECIMAL", "DATE", "TIME", "DATETIME", "PERIOD", "VERSION", 
		"METHOD_T", "CODE", "DOCUMENT", "BLOB", "IMAGE", "UUID", "ITERATOR", "CURSOR", 
		"ABSTRACT", "ALL", "ALWAYS", "AND", "ANY", "AS", "ASC", "ATTR", "ATTRIBUTE", 
		"ATTRIBUTES", "BINDINGS", "BREAK", "BY", "CASE", "CATCH", "CATEGORY", 
		"CLASS", "CLOSE", "CONTAINS", "DEF", "DEFAULT", "DEFINE", "DELETE", "DESC", 
		"DO", "DOING", "EACH", "ELSE", "ENUM", "ENUMERATED", "EXCEPT", "EXECUTE", 
		"EXPECTING", "EXTENDS", "FETCH", "FILTERED", "FINALLY", "FLUSH", "FOR", 
		"FROM", "GETTER", "IF", "IN", "INDEX", "INVOKE", "IS", "MATCHING", "METHOD", 
		"METHODS", "MODULO", "MUTABLE", "NATIVE", "NONE", "NOT", "NOTHING", "NULL", 
		"ON", "ONE", "OPEN", "OPERATOR", "OR", "ORDER", "OTHERWISE", "PASS", "RAISE", 
		"READ", "RECEIVING", "RESOURCE", "RETURN", "RETURNING", "ROWS", "SELF", 
		"SETTER", "SINGLETON", "SORTED", "STORABLE", "STORE", "SWITCH", "TEST", 
		"THIS", "THROW", "TO", "TRY", "VERIFYING", "WITH", "WHEN", "WHERE", "WHILE", 
		"WRITE", "BOOLEAN_LITERAL", "CHAR_LITERAL", "MIN_INTEGER", "MAX_INTEGER", 
		"SYMBOL_IDENTIFIER", "TYPE_IDENTIFIER", "VARIABLE_IDENTIFIER", "NATIVE_IDENTIFIER", 
		"DOLLAR_IDENTIFIER", "TEXT_LITERAL", "UUID_LITERAL", "INTEGER_LITERAL", 
		"HEXA_LITERAL", "DECIMAL_LITERAL", "DATETIME_LITERAL", "TIME_LITERAL", 
		"DATE_LITERAL", "PERIOD_LITERAL", "VERSION_LITERAL"
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
			setState(414); 
			match(ENUM);
			setState(415); 
			((Enum_category_declarationContext)_localctx).name = type_identifier();
			setState(416); 
			match(LPAR);
			setState(423);
			switch (_input.LA(1)) {
			case TYPE_IDENTIFIER:
				{
				setState(417); 
				((Enum_category_declarationContext)_localctx).derived = type_identifier();
				setState(420);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(418); 
					match(COMMA);
					setState(419); 
					((Enum_category_declarationContext)_localctx).attrs = attribute_identifier_list();
					}
				}

				}
				break;
			case STORABLE:
			case VARIABLE_IDENTIFIER:
				{
				setState(422); 
				((Enum_category_declarationContext)_localctx).attrs = attribute_identifier_list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(425); 
			match(RPAR);
			setState(426); 
			match(COLON);
			setState(427); 
			indent();
			setState(428); 
			((Enum_category_declarationContext)_localctx).symbols = category_symbol_list();
			setState(429); 
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
			setState(431); 
			match(ENUM);
			setState(432); 
			((Enum_native_declarationContext)_localctx).name = type_identifier();
			setState(433); 
			match(LPAR);
			setState(434); 
			((Enum_native_declarationContext)_localctx).typ = native_type();
			setState(435); 
			match(RPAR);
			setState(436); 
			match(COLON);
			setState(437); 
			indent();
			setState(438); 
			((Enum_native_declarationContext)_localctx).symbols = native_symbol_list();
			setState(439); 
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
			setState(441); 
			((Native_symbolContext)_localctx).name = symbol_identifier();
			setState(442); 
			match(EQ);
			setState(443); 
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
			setState(445); 
			((Category_symbolContext)_localctx).name = symbol_identifier();
			setState(446); 
			match(LPAR);
			setState(448);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (EXECUTE - 99)) | (1L << (FETCH - 99)) | (1L << (MUTABLE - 99)) | (1L << (NONE - 99)) | (1L << (NOT - 99)) | (1L << (READ - 99)) | (1L << (SELF - 99)) | (1L << (SORTED - 99)) | (1L << (THIS - 99)) | (1L << (BOOLEAN_LITERAL - 99)) | (1L << (CHAR_LITERAL - 99)) | (1L << (MIN_INTEGER - 99)) | (1L << (MAX_INTEGER - 99)) | (1L << (SYMBOL_IDENTIFIER - 99)) | (1L << (TYPE_IDENTIFIER - 99)))) != 0) || ((((_la - 163)) & ~0x3f) == 0 && ((1L << (_la - 163)) & ((1L << (VARIABLE_IDENTIFIER - 163)) | (1L << (TEXT_LITERAL - 163)) | (1L << (UUID_LITERAL - 163)) | (1L << (INTEGER_LITERAL - 163)) | (1L << (HEXA_LITERAL - 163)) | (1L << (DECIMAL_LITERAL - 163)) | (1L << (DATETIME_LITERAL - 163)) | (1L << (TIME_LITERAL - 163)) | (1L << (DATE_LITERAL - 163)) | (1L << (PERIOD_LITERAL - 163)) | (1L << (VERSION_LITERAL - 163)))) != 0)) {
				{
				setState(447); 
				((Category_symbolContext)_localctx).args = argument_assignment_list(0);
				}
			}

			setState(450); 
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
			setState(453);
			_la = _input.LA(1);
			if (_la==STORABLE) {
				{
				setState(452); 
				match(STORABLE);
				}
			}

			setState(455); 
			match(ATTR);
			setState(456); 
			((Attribute_declarationContext)_localctx).name = attribute_identifier();
			setState(457); 
			match(LPAR);
			setState(458); 
			((Attribute_declarationContext)_localctx).typ = typedef(0);
			setState(459); 
			match(RPAR);
			setState(460); 
			match(COLON);
			setState(461); 
			indent();
			setState(477);
			switch (_input.LA(1)) {
			case PASS:
				{
				setState(462); 
				match(PASS);
				}
				break;
			case IN:
			case INDEX:
			case MATCHING:
				{
				setState(475);
				switch (_input.LA(1)) {
				case IN:
				case MATCHING:
					{
					setState(463); 
					((Attribute_declarationContext)_localctx).match = attribute_constraint();
					setState(467);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						setState(464); 
						lfp();
						setState(465); 
						((Attribute_declarationContext)_localctx).indices = index_clause();
						}
						break;
					}
					}
					break;
				case INDEX:
					{
					setState(469); 
					((Attribute_declarationContext)_localctx).indices = index_clause();
					setState(473);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						setState(470); 
						lfp();
						setState(471); 
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
			setState(479); 
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
			setState(481); 
			match(INDEX);
			setState(482); 
			match(LPAR);
			setState(484);
			_la = _input.LA(1);
			if (_la==VARIABLE_IDENTIFIER) {
				{
				setState(483); 
				((Index_clauseContext)_localctx).indices = variable_identifier_list();
				}
			}

			setState(486); 
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
		enterRule(_localctx, 12, RULE_concrete_category_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			_la = _input.LA(1);
			if (_la==STORABLE) {
				{
				setState(488); 
				match(STORABLE);
				}
			}

			setState(491);
			_la = _input.LA(1);
			if ( !(_la==CATEGORY || _la==CLASS) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(492); 
			((Concrete_category_declarationContext)_localctx).name = type_identifier();
			setState(493); 
			match(LPAR);
			setState(500);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(494); 
				((Concrete_category_declarationContext)_localctx).derived = derived_list();
				}
				break;
			case 2:
				{
				setState(495); 
				((Concrete_category_declarationContext)_localctx).attrs = attribute_identifier_list();
				}
				break;
			case 3:
				{
				setState(496); 
				((Concrete_category_declarationContext)_localctx).derived = derived_list();
				setState(497); 
				match(COMMA);
				setState(498); 
				((Concrete_category_declarationContext)_localctx).attrs = attribute_identifier_list();
				}
				break;
			}
			setState(502); 
			match(RPAR);
			setState(503); 
			match(COLON);
			setState(504); 
			indent();
			setState(507);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case DEF:
				{
				setState(505); 
				((Concrete_category_declarationContext)_localctx).methods = member_method_declaration_list();
				}
				break;
			case PASS:
				{
				setState(506); 
				match(PASS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(509); 
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
		enterRule(_localctx, 14, RULE_singleton_category_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511); 
			match(SINGLETON);
			setState(512); 
			((Singleton_category_declarationContext)_localctx).name = type_identifier();
			setState(513); 
			match(LPAR);
			setState(514); 
			((Singleton_category_declarationContext)_localctx).attrs = attribute_identifier_list();
			setState(515); 
			match(RPAR);
			setState(516); 
			match(COLON);
			setState(517); 
			indent();
			setState(520);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case DEF:
				{
				setState(518); 
				((Singleton_category_declarationContext)_localctx).methods = member_method_declaration_list();
				}
				break;
			case PASS:
				{
				setState(519); 
				match(PASS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(522); 
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
		enterRule(_localctx, 16, RULE_derived_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524); 
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
		enterRule(_localctx, 18, RULE_operator_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526); 
			match(DEF);
			setState(527); 
			match(OPERATOR);
			setState(528); 
			((Operator_method_declarationContext)_localctx).op = operator();
			setState(529); 
			match(LPAR);
			setState(530); 
			((Operator_method_declarationContext)_localctx).arg = operator_argument();
			setState(531); 
			match(RPAR);
			setState(534);
			_la = _input.LA(1);
			if (_la==RARROW) {
				{
				setState(532); 
				match(RARROW);
				setState(533); 
				((Operator_method_declarationContext)_localctx).typ = typedef(0);
				}
			}

			setState(536); 
			match(COLON);
			setState(537); 
			indent();
			setState(538); 
			((Operator_method_declarationContext)_localctx).stmts = statement_list();
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
		enterRule(_localctx, 20, RULE_setter_method_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541); 
			match(DEF);
			setState(542); 
			((Setter_method_declarationContext)_localctx).name = variable_identifier();
			setState(543); 
			match(SETTER);
			setState(544); 
			match(LPAR);
			setState(545); 
			match(RPAR);
			setState(546); 
			match(COLON);
			setState(547); 
			indent();
			setState(548); 
			((Setter_method_declarationContext)_localctx).stmts = statement_list();
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
		enterRule(_localctx, 22, RULE_native_setter_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551); 
			match(DEF);
			setState(552); 
			((Native_setter_declarationContext)_localctx).name = variable_identifier();
			setState(554);
			_la = _input.LA(1);
			if (_la==NATIVE) {
				{
				setState(553); 
				match(NATIVE);
				}
			}

			setState(556); 
			match(SETTER);
			setState(557); 
			match(LPAR);
			setState(558); 
			match(RPAR);
			setState(559); 
			match(COLON);
			setState(560); 
			indent();
			setState(561); 
			((Native_setter_declarationContext)_localctx).stmts = native_statement_list();
			setState(562); 
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
		enterRule(_localctx, 24, RULE_getter_method_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564); 
			match(DEF);
			setState(565); 
			((Getter_method_declarationContext)_localctx).name = variable_identifier();
			setState(566); 
			match(GETTER);
			setState(567); 
			match(LPAR);
			setState(568); 
			match(RPAR);
			setState(569); 
			match(COLON);
			setState(570); 
			indent();
			setState(571); 
			((Getter_method_declarationContext)_localctx).stmts = statement_list();
			setState(572); 
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
		enterRule(_localctx, 26, RULE_native_getter_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574); 
			match(DEF);
			setState(575); 
			((Native_getter_declarationContext)_localctx).name = variable_identifier();
			setState(577);
			_la = _input.LA(1);
			if (_la==NATIVE) {
				{
				setState(576); 
				match(NATIVE);
				}
			}

			setState(579); 
			match(GETTER);
			setState(580); 
			match(LPAR);
			setState(581); 
			match(RPAR);
			setState(582); 
			match(COLON);
			setState(583); 
			indent();
			setState(584); 
			((Native_getter_declarationContext)_localctx).stmts = native_statement_list();
			setState(585); 
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
		enterRule(_localctx, 28, RULE_native_category_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			_la = _input.LA(1);
			if (_la==STORABLE) {
				{
				setState(587); 
				match(STORABLE);
				}
			}

			setState(590); 
			match(NATIVE);
			setState(591);
			_la = _input.LA(1);
			if ( !(_la==CATEGORY || _la==CLASS) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(592); 
			((Native_category_declarationContext)_localctx).name = type_identifier();
			setState(593); 
			match(LPAR);
			setState(595);
			_la = _input.LA(1);
			if (_la==STORABLE || _la==VARIABLE_IDENTIFIER) {
				{
				setState(594); 
				((Native_category_declarationContext)_localctx).attrs = attribute_identifier_list();
				}
			}

			setState(597); 
			match(RPAR);
			setState(598); 
			match(COLON);
			setState(599); 
			indent();
			setState(600); 
			((Native_category_declarationContext)_localctx).bindings = native_category_bindings();
			setState(604);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(601); 
				lfp();
				setState(602); 
				((Native_category_declarationContext)_localctx).methods = native_member_method_declaration_list();
				}
				break;
			}
			setState(606); 
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
		enterRule(_localctx, 30, RULE_native_resource_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608); 
			match(NATIVE);
			setState(609); 
			match(RESOURCE);
			setState(610); 
			((Native_resource_declarationContext)_localctx).name = type_identifier();
			setState(611); 
			match(LPAR);
			setState(613);
			_la = _input.LA(1);
			if (_la==STORABLE || _la==VARIABLE_IDENTIFIER) {
				{
				setState(612); 
				((Native_resource_declarationContext)_localctx).attrs = attribute_identifier_list();
				}
			}

			setState(615); 
			match(RPAR);
			setState(616); 
			match(COLON);
			setState(617); 
			indent();
			setState(618); 
			((Native_resource_declarationContext)_localctx).bindings = native_category_bindings();
			setState(622);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(619); 
				lfp();
				setState(620); 
				((Native_resource_declarationContext)_localctx).methods = native_member_method_declaration_list();
				}
				break;
			}
			setState(624); 
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
		enterRule(_localctx, 32, RULE_native_category_bindings);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626); 
			match(DEF);
			setState(627);
			_la = _input.LA(1);
			if ( !(_la==CATEGORY || _la==CLASS) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(628); 
			match(BINDINGS);
			setState(629); 
			match(COLON);
			setState(630); 
			indent();
			setState(631); 
			((Native_category_bindingsContext)_localctx).items = native_category_binding_list(0);
			setState(632); 
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_native_category_binding_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new NativeCategoryBindingListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(635); 
			((NativeCategoryBindingListContext)_localctx).item = native_category_binding();
			}
			_ctx.stop = _input.LT(-1);
			setState(643);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NativeCategoryBindingListItemContext(new Native_category_binding_listContext(_parentctx, _parentState));
					((NativeCategoryBindingListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_native_category_binding_list);
					setState(637);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(638); 
					lfp();
					setState(639); 
					((NativeCategoryBindingListItemContext)_localctx).item = native_category_binding();
					}
					} 
				}
				setState(645);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
		enterRule(_localctx, 36, RULE_abstract_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(646); 
			match(ABSTRACT);
			setState(647); 
			match(DEF);
			setState(648); 
			((Abstract_method_declarationContext)_localctx).name = method_identifier();
			setState(649); 
			match(LPAR);
			setState(651);
			_la = _input.LA(1);
			if (_la==CODE || _la==MUTABLE || _la==VARIABLE_IDENTIFIER) {
				{
				setState(650); 
				((Abstract_method_declarationContext)_localctx).args = argument_list();
				}
			}

			setState(653); 
			match(RPAR);
			setState(656);
			_la = _input.LA(1);
			if (_la==RARROW) {
				{
				setState(654); 
				match(RARROW);
				setState(655); 
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
		enterRule(_localctx, 38, RULE_concrete_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658); 
			match(DEF);
			setState(659); 
			((Concrete_method_declarationContext)_localctx).name = method_identifier();
			setState(660); 
			match(LPAR);
			setState(662);
			_la = _input.LA(1);
			if (_la==CODE || _la==MUTABLE || _la==VARIABLE_IDENTIFIER) {
				{
				setState(661); 
				((Concrete_method_declarationContext)_localctx).args = argument_list();
				}
			}

			setState(664); 
			match(RPAR);
			setState(667);
			_la = _input.LA(1);
			if (_la==RARROW) {
				{
				setState(665); 
				match(RARROW);
				setState(666); 
				((Concrete_method_declarationContext)_localctx).typ = typedef(0);
				}
			}

			setState(669); 
			match(COLON);
			setState(670); 
			indent();
			setState(671); 
			((Concrete_method_declarationContext)_localctx).stmts = statement_list();
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
		enterRule(_localctx, 40, RULE_native_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674); 
			match(DEF);
			setState(676);
			_la = _input.LA(1);
			if (_la==NATIVE) {
				{
				setState(675); 
				match(NATIVE);
				}
			}

			setState(678); 
			((Native_method_declarationContext)_localctx).name = method_identifier();
			setState(679); 
			match(LPAR);
			setState(681);
			_la = _input.LA(1);
			if (_la==CODE || _la==MUTABLE || _la==VARIABLE_IDENTIFIER) {
				{
				setState(680); 
				((Native_method_declarationContext)_localctx).args = argument_list();
				}
			}

			setState(683); 
			match(RPAR);
			setState(686);
			_la = _input.LA(1);
			if (_la==RARROW) {
				{
				setState(684); 
				match(RARROW);
				setState(685); 
				((Native_method_declarationContext)_localctx).typ = category_or_any_type();
				}
			}

			setState(688); 
			match(COLON);
			setState(689); 
			indent();
			setState(690); 
			((Native_method_declarationContext)_localctx).stmts = native_statement_list();
			setState(691); 
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
		enterRule(_localctx, 42, RULE_test_method_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693); 
			match(DEF);
			setState(694); 
			match(TEST);
			setState(695); 
			((Test_method_declarationContext)_localctx).name = match(TEXT_LITERAL);
			setState(696); 
			match(LPAR);
			setState(697); 
			match(RPAR);
			setState(698); 
			match(COLON);
			setState(699); 
			indent();
			setState(700); 
			((Test_method_declarationContext)_localctx).stmts = statement_list();
			setState(701); 
			dedent();
			setState(702); 
			lfp();
			setState(703); 
			match(VERIFYING);
			setState(704); 
			match(COLON);
			setState(710);
			switch (_input.LA(1)) {
			case LF:
				{
				{
				setState(705); 
				indent();
				setState(706); 
				((Test_method_declarationContext)_localctx).exps = assertion_list();
				setState(707); 
				dedent();
				}
				}
				break;
			case SYMBOL_IDENTIFIER:
				{
				{
				setState(709); 
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
		enterRule(_localctx, 44, RULE_assertion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712); 
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
		enterRule(_localctx, 46, RULE_typed_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(714); 
			((Typed_argumentContext)_localctx).name = variable_identifier();
			setState(715); 
			match(COLON);
			setState(716); 
			((Typed_argumentContext)_localctx).typ = category_or_any_type();
			setState(721);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(717); 
				match(LPAR);
				setState(718); 
				((Typed_argumentContext)_localctx).attrs = attribute_identifier_list();
				setState(719); 
				match(RPAR);
				}
			}

			setState(725);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(723); 
				match(EQ);
				setState(724); 
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
		enterRule(_localctx, 48, RULE_statement);
		try {
			setState(746);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				_localctx = new MethodCallStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(727); 
				((MethodCallStatementContext)_localctx).stmt = method_call();
				}
				break;
			case 2:
				_localctx = new AssignInstanceStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(728); 
				((AssignInstanceStatementContext)_localctx).stmt = assign_instance_statement();
				}
				break;
			case 3:
				_localctx = new AssignTupleStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(729); 
				((AssignTupleStatementContext)_localctx).stmt = assign_tuple_statement();
				}
				break;
			case 4:
				_localctx = new StoreStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(730); 
				((StoreStatementContext)_localctx).stmt = store_statement();
				}
				break;
			case 5:
				_localctx = new FlushStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(731); 
				((FlushStatementContext)_localctx).stmt = flush_statement();
				}
				break;
			case 6:
				_localctx = new BreakStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(732); 
				((BreakStatementContext)_localctx).stmt = break_statement();
				}
				break;
			case 7:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(733); 
				((ReturnStatementContext)_localctx).stmt = return_statement();
				}
				break;
			case 8:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(734); 
				((IfStatementContext)_localctx).stmt = if_statement();
				}
				break;
			case 9:
				_localctx = new SwitchStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(735); 
				((SwitchStatementContext)_localctx).stmt = switch_statement();
				}
				break;
			case 10:
				_localctx = new ForEachStatementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(736); 
				((ForEachStatementContext)_localctx).stmt = for_each_statement();
				}
				break;
			case 11:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(737); 
				((WhileStatementContext)_localctx).stmt = while_statement();
				}
				break;
			case 12:
				_localctx = new DoWhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(738); 
				((DoWhileStatementContext)_localctx).stmt = do_while_statement();
				}
				break;
			case 13:
				_localctx = new RaiseStatementContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(739); 
				((RaiseStatementContext)_localctx).stmt = raise_statement();
				}
				break;
			case 14:
				_localctx = new TryStatementContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(740); 
				((TryStatementContext)_localctx).stmt = try_statement();
				}
				break;
			case 15:
				_localctx = new WriteStatementContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(741); 
				((WriteStatementContext)_localctx).stmt = write_statement();
				}
				break;
			case 16:
				_localctx = new WithResourceStatementContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(742); 
				((WithResourceStatementContext)_localctx).stmt = with_resource_statement();
				}
				break;
			case 17:
				_localctx = new WithSingletonStatementContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(743); 
				((WithSingletonStatementContext)_localctx).stmt = with_singleton_statement();
				}
				break;
			case 18:
				_localctx = new ClosureStatementContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(744); 
				((ClosureStatementContext)_localctx).decl = concrete_method_declaration();
				}
				break;
			case 19:
				_localctx = new CommentStatementContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(745); 
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
		enterRule(_localctx, 50, RULE_flush_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(748); 
			match(FLUSH);
			setState(749); 
			match(LPAR);
			setState(750); 
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
		enterRule(_localctx, 52, RULE_store_statement);
		try {
			setState(772);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(752); 
				match(DELETE);
				setState(753); 
				match(LPAR);
				setState(754); 
				((Store_statementContext)_localctx).to_del = expression_list();
				setState(755); 
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(757); 
				match(STORE);
				setState(758); 
				match(LPAR);
				setState(759); 
				((Store_statementContext)_localctx).to_add = expression_list();
				setState(760); 
				match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(762); 
				match(DELETE);
				setState(763); 
				match(LPAR);
				setState(764); 
				((Store_statementContext)_localctx).to_del = expression_list();
				setState(765); 
				match(RPAR);
				setState(766); 
				match(AND);
				setState(767); 
				match(STORE);
				setState(768); 
				match(LPAR);
				setState(769); 
				((Store_statementContext)_localctx).to_add = expression_list();
				setState(770); 
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
		enterRule(_localctx, 54, RULE_method_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(774); 
			((Method_callContext)_localctx).method = method_selector();
			setState(775); 
			match(LPAR);
			setState(777);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (EXECUTE - 99)) | (1L << (FETCH - 99)) | (1L << (MUTABLE - 99)) | (1L << (NONE - 99)) | (1L << (NOT - 99)) | (1L << (READ - 99)) | (1L << (SELF - 99)) | (1L << (SORTED - 99)) | (1L << (THIS - 99)) | (1L << (BOOLEAN_LITERAL - 99)) | (1L << (CHAR_LITERAL - 99)) | (1L << (MIN_INTEGER - 99)) | (1L << (MAX_INTEGER - 99)) | (1L << (SYMBOL_IDENTIFIER - 99)) | (1L << (TYPE_IDENTIFIER - 99)))) != 0) || ((((_la - 163)) & ~0x3f) == 0 && ((1L << (_la - 163)) & ((1L << (VARIABLE_IDENTIFIER - 163)) | (1L << (TEXT_LITERAL - 163)) | (1L << (UUID_LITERAL - 163)) | (1L << (INTEGER_LITERAL - 163)) | (1L << (HEXA_LITERAL - 163)) | (1L << (DECIMAL_LITERAL - 163)) | (1L << (DATETIME_LITERAL - 163)) | (1L << (TIME_LITERAL - 163)) | (1L << (DATE_LITERAL - 163)) | (1L << (PERIOD_LITERAL - 163)) | (1L << (VERSION_LITERAL - 163)))) != 0)) {
				{
				setState(776); 
				((Method_callContext)_localctx).args = argument_assignment_list(0);
				}
			}

			setState(779); 
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
		enterRule(_localctx, 56, RULE_method_selector);
		try {
			setState(786);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				_localctx = new MethodNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(781); 
				((MethodNameContext)_localctx).name = method_identifier();
				}
				break;
			case 2:
				_localctx = new MethodParentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(782); 
				((MethodParentContext)_localctx).parent = callable_parent(0);
				setState(783); 
				match(DOT);
				setState(784); 
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
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_callable_parent, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new CallableRootContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(789); 
			((CallableRootContext)_localctx).name = identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(795);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CallableSelectorContext(new Callable_parentContext(_parentctx, _parentState));
					((CallableSelectorContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_callable_parent);
					setState(791);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(792); 
					((CallableSelectorContext)_localctx).select = callable_selector();
					}
					} 
				}
				setState(797);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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
		enterRule(_localctx, 60, RULE_callable_selector);
		try {
			setState(804);
			switch (_input.LA(1)) {
			case DOT:
				_localctx = new CallableMemberSelectorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(798); 
				match(DOT);
				setState(799); 
				((CallableMemberSelectorContext)_localctx).name = variable_identifier();
				}
				break;
			case LBRAK:
				_localctx = new CallableItemSelectorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(800); 
				match(LBRAK);
				setState(801); 
				((CallableItemSelectorContext)_localctx).exp = expression(0);
				setState(802); 
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
		enterRule(_localctx, 62, RULE_with_resource_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(806); 
			match(WITH);
			setState(807); 
			((With_resource_statementContext)_localctx).stmt = assign_variable_statement();
			setState(808); 
			match(COLON);
			setState(809); 
			indent();
			setState(810); 
			((With_resource_statementContext)_localctx).stmts = statement_list();
			setState(811); 
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
			setState(813); 
			match(WITH);
			setState(814); 
			((With_singleton_statementContext)_localctx).typ = type_identifier();
			setState(815); 
			match(COLON);
			setState(816); 
			indent();
			setState(817); 
			((With_singleton_statementContext)_localctx).stmts = statement_list();
			setState(818); 
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
			setState(820); 
			match(SWITCH);
			setState(821); 
			match(ON);
			setState(822); 
			((Switch_statementContext)_localctx).exp = expression(0);
			setState(823); 
			match(COLON);
			setState(824); 
			indent();
			setState(825); 
			((Switch_statementContext)_localctx).cases = switch_case_statement_list();
			setState(833);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(826); 
				lfp();
				setState(827); 
				match(OTHERWISE);
				setState(828); 
				match(COLON);
				setState(829); 
				indent();
				setState(830); 
				((Switch_statementContext)_localctx).stmts = statement_list();
				setState(831); 
				dedent();
				}
				break;
			}
			setState(835); 
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
			setState(852);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				_localctx = new AtomicSwitchCaseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(837); 
				match(WHEN);
				setState(838); 
				((AtomicSwitchCaseContext)_localctx).exp = atomic_literal();
				setState(839); 
				match(COLON);
				setState(840); 
				indent();
				setState(841); 
				((AtomicSwitchCaseContext)_localctx).stmts = statement_list();
				setState(842); 
				dedent();
				}
				break;
			case 2:
				_localctx = new CollectionSwitchCaseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(844); 
				match(WHEN);
				setState(845); 
				match(IN);
				setState(846); 
				((CollectionSwitchCaseContext)_localctx).exp = literal_collection();
				setState(847); 
				match(COLON);
				setState(848); 
				indent();
				setState(849); 
				((CollectionSwitchCaseContext)_localctx).stmts = statement_list();
				setState(850); 
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
			setState(854); 
			match(FOR);
			setState(855); 
			((For_each_statementContext)_localctx).name1 = variable_identifier();
			setState(858);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(856); 
				match(COMMA);
				setState(857); 
				((For_each_statementContext)_localctx).name2 = variable_identifier();
				}
			}

			setState(860); 
			match(IN);
			setState(861); 
			((For_each_statementContext)_localctx).source = expression(0);
			setState(862); 
			match(COLON);
			setState(863); 
			indent();
			setState(864); 
			((For_each_statementContext)_localctx).stmts = statement_list();
			setState(865); 
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
			setState(867); 
			match(DO);
			setState(868); 
			match(COLON);
			setState(869); 
			indent();
			setState(870); 
			((Do_while_statementContext)_localctx).stmts = statement_list();
			setState(871); 
			dedent();
			setState(872); 
			lfp();
			setState(873); 
			match(WHILE);
			setState(874); 
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
			setState(876); 
			match(WHILE);
			setState(877); 
			((While_statementContext)_localctx).exp = expression(0);
			setState(878); 
			match(COLON);
			setState(879); 
			indent();
			setState(880); 
			((While_statementContext)_localctx).stmts = statement_list();
			setState(881); 
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
			setState(883); 
			match(IF);
			setState(884); 
			((If_statementContext)_localctx).exp = expression(0);
			setState(885); 
			match(COLON);
			setState(886); 
			indent();
			setState(887); 
			((If_statementContext)_localctx).stmts = statement_list();
			setState(888); 
			dedent();
			setState(892);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(889); 
				lfp();
				setState(890); 
				((If_statementContext)_localctx).elseIfs = else_if_statement_list(0);
				}
				break;
			}
			setState(901);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(894); 
				lfp();
				setState(895); 
				match(ELSE);
				setState(896); 
				match(COLON);
				setState(897); 
				indent();
				setState(898); 
				((If_statementContext)_localctx).elseStmts = statement_list();
				setState(899); 
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

			setState(904); 
			match(ELSE);
			setState(905); 
			match(IF);
			setState(906); 
			((ElseIfStatementListContext)_localctx).exp = expression(0);
			setState(907); 
			match(COLON);
			setState(908); 
			indent();
			setState(909); 
			((ElseIfStatementListContext)_localctx).stmts = statement_list();
			setState(910); 
			dedent();
			}
			_ctx.stop = _input.LT(-1);
			setState(924);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ElseIfStatementListItemContext(new Else_if_statement_listContext(_parentctx, _parentState));
					((ElseIfStatementListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_else_if_statement_list);
					setState(912);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(913); 
					lfp();
					setState(914); 
					match(ELSE);
					setState(915); 
					match(IF);
					setState(916); 
					((ElseIfStatementListItemContext)_localctx).exp = expression(0);
					setState(917); 
					match(COLON);
					setState(918); 
					indent();
					setState(919); 
					((ElseIfStatementListItemContext)_localctx).stmts = statement_list();
					setState(920); 
					dedent();
					}
					} 
				}
				setState(926);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
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
			setState(927); 
			match(RAISE);
			setState(928); 
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
			setState(930); 
			match(TRY);
			setState(931); 
			((Try_statementContext)_localctx).name = variable_identifier();
			setState(932); 
			match(COLON);
			setState(933); 
			indent();
			setState(934); 
			((Try_statementContext)_localctx).stmts = statement_list();
			setState(935); 
			dedent();
			setState(936); 
			lfs();
			setState(938);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(937); 
				((Try_statementContext)_localctx).handlers = catch_statement_list();
				}
				break;
			}
			setState(947);
			_la = _input.LA(1);
			if (_la==EXCEPT) {
				{
				setState(940); 
				match(EXCEPT);
				setState(941); 
				match(COLON);
				setState(942); 
				indent();
				setState(943); 
				((Try_statementContext)_localctx).anyStmts = statement_list();
				setState(944); 
				dedent();
				setState(945); 
				lfs();
				}
			}

			setState(956);
			_la = _input.LA(1);
			if (_la==FINALLY) {
				{
				setState(949); 
				match(FINALLY);
				setState(950); 
				match(COLON);
				setState(951); 
				indent();
				setState(952); 
				((Try_statementContext)_localctx).finalStmts = statement_list();
				setState(953); 
				dedent();
				setState(954); 
				lfs();
				}
			}

			setState(958); 
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
			setState(979);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				_localctx = new CatchAtomicStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(960); 
				match(EXCEPT);
				setState(961); 
				((CatchAtomicStatementContext)_localctx).name = symbol_identifier();
				setState(962); 
				match(COLON);
				setState(963); 
				indent();
				setState(964); 
				((CatchAtomicStatementContext)_localctx).stmts = statement_list();
				setState(965); 
				dedent();
				setState(966); 
				lfs();
				}
				break;
			case 2:
				_localctx = new CatchCollectionStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(968); 
				match(EXCEPT);
				setState(969); 
				match(IN);
				setState(970); 
				match(LBRAK);
				setState(971); 
				((CatchCollectionStatementContext)_localctx).exp = symbol_list();
				setState(972); 
				match(RBRAK);
				setState(973); 
				match(COLON);
				setState(974); 
				indent();
				setState(975); 
				((CatchCollectionStatementContext)_localctx).stmts = statement_list();
				setState(976); 
				dedent();
				setState(977); 
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
			setState(981); 
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
			setState(983); 
			match(RETURN);
			setState(985);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (EXECUTE - 99)) | (1L << (FETCH - 99)) | (1L << (MUTABLE - 99)) | (1L << (NONE - 99)) | (1L << (NOT - 99)) | (1L << (READ - 99)) | (1L << (SELF - 99)) | (1L << (SORTED - 99)) | (1L << (THIS - 99)) | (1L << (BOOLEAN_LITERAL - 99)) | (1L << (CHAR_LITERAL - 99)) | (1L << (MIN_INTEGER - 99)) | (1L << (MAX_INTEGER - 99)) | (1L << (SYMBOL_IDENTIFIER - 99)) | (1L << (TYPE_IDENTIFIER - 99)))) != 0) || ((((_la - 163)) & ~0x3f) == 0 && ((1L << (_la - 163)) & ((1L << (VARIABLE_IDENTIFIER - 163)) | (1L << (TEXT_LITERAL - 163)) | (1L << (UUID_LITERAL - 163)) | (1L << (INTEGER_LITERAL - 163)) | (1L << (HEXA_LITERAL - 163)) | (1L << (DECIMAL_LITERAL - 163)) | (1L << (DATETIME_LITERAL - 163)) | (1L << (TIME_LITERAL - 163)) | (1L << (DATE_LITERAL - 163)) | (1L << (PERIOD_LITERAL - 163)) | (1L << (VERSION_LITERAL - 163)))) != 0)) {
				{
				setState(984); 
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
	public static class ContainsAllExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode CONTAINS() { return getToken(MParser.CONTAINS, 0); }
		public TerminalNode ALL() { return getToken(MParser.ALL, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ContainsAllExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterContainsAllExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitContainsAllExpression(this);
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
	public static class NotContainsAnyExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode NOT() { return getToken(MParser.NOT, 0); }
		public TerminalNode CONTAINS() { return getToken(MParser.CONTAINS, 0); }
		public TerminalNode ANY() { return getToken(MParser.ANY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public NotContainsAnyExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterNotContainsAnyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitNotContainsAnyExpression(this);
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
	public static class NotContainsAllExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode NOT() { return getToken(MParser.NOT, 0); }
		public TerminalNode CONTAINS() { return getToken(MParser.CONTAINS, 0); }
		public TerminalNode ALL() { return getToken(MParser.ALL, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public NotContainsAllExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterNotContainsAllExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitNotContainsAllExpression(this);
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
	public static class ContainsAnyExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode CONTAINS() { return getToken(MParser.CONTAINS, 0); }
		public TerminalNode ANY() { return getToken(MParser.ANY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ContainsAnyExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterContainsAnyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitContainsAnyExpression(this);
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
			setState(1005);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				_localctx = new MinusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(988); 
				match(MINUS);
				setState(989); 
				((MinusExpressionContext)_localctx).exp = expression(32);
				}
				break;
			case 2:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(990); 
				match(NOT);
				setState(991); 
				((NotExpressionContext)_localctx).exp = expression(31);
				}
				break;
			case 3:
				{
				_localctx = new InstanceExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(992); 
				((InstanceExpressionContext)_localctx).exp = instance_expression(0);
				}
				break;
			case 4:
				{
				_localctx = new MethodExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(993); 
				((MethodExpressionContext)_localctx).exp = method_expression();
				}
				break;
			case 5:
				{
				_localctx = new CodeExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(994); 
				match(CODE);
				setState(995); 
				match(LPAR);
				setState(996); 
				((CodeExpressionContext)_localctx).exp = expression(0);
				setState(997); 
				match(RPAR);
				}
				break;
			case 6:
				{
				_localctx = new ExecuteExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(999); 
				match(EXECUTE);
				setState(1000); 
				match(LPAR);
				setState(1001); 
				((ExecuteExpressionContext)_localctx).name = variable_identifier();
				setState(1002); 
				match(RPAR);
				}
				break;
			case 7:
				{
				_localctx = new ClosureExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1004); 
				((ClosureExpressionContext)_localctx).exp = closure_expression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1109);
					switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplyExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((MultiplyExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1007);
						if (!(precpred(_ctx, 30))) throw new FailedPredicateException(this, "precpred(_ctx, 30)");
						setState(1008); 
						multiply();
						setState(1009); 
						((MultiplyExpressionContext)_localctx).right = expression(31);
						}
						break;
					case 2:
						{
						_localctx = new DivideExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((DivideExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1011);
						if (!(precpred(_ctx, 29))) throw new FailedPredicateException(this, "precpred(_ctx, 29)");
						setState(1012); 
						divide();
						setState(1013); 
						((DivideExpressionContext)_localctx).right = expression(30);
						}
						break;
					case 3:
						{
						_localctx = new ModuloExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ModuloExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1015);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(1016); 
						modulo();
						setState(1017); 
						((ModuloExpressionContext)_localctx).right = expression(29);
						}
						break;
					case 4:
						{
						_localctx = new IntDivideExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((IntDivideExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1019);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(1020); 
						idivide();
						setState(1021); 
						((IntDivideExpressionContext)_localctx).right = expression(28);
						}
						break;
					case 5:
						{
						_localctx = new AddExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((AddExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1023);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(1024);
						((AddExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((AddExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(1025); 
						((AddExpressionContext)_localctx).right = expression(27);
						}
						break;
					case 6:
						{
						_localctx = new LessThanExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((LessThanExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1026);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(1027); 
						match(LT);
						setState(1028); 
						((LessThanExpressionContext)_localctx).right = expression(26);
						}
						break;
					case 7:
						{
						_localctx = new LessThanOrEqualExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((LessThanOrEqualExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1029);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(1030); 
						match(LTE);
						setState(1031); 
						((LessThanOrEqualExpressionContext)_localctx).right = expression(25);
						}
						break;
					case 8:
						{
						_localctx = new GreaterThanExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((GreaterThanExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1032);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(1033); 
						match(GT);
						setState(1034); 
						((GreaterThanExpressionContext)_localctx).right = expression(24);
						}
						break;
					case 9:
						{
						_localctx = new GreaterThanOrEqualExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((GreaterThanOrEqualExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1035);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(1036); 
						match(GTE);
						setState(1037); 
						((GreaterThanOrEqualExpressionContext)_localctx).right = expression(23);
						}
						break;
					case 10:
						{
						_localctx = new EqualsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((EqualsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1038);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1039); 
						match(EQ2);
						setState(1040); 
						((EqualsExpressionContext)_localctx).right = expression(20);
						}
						break;
					case 11:
						{
						_localctx = new NotEqualsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((NotEqualsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1041);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1042); 
						match(XEQ);
						setState(1043); 
						((NotEqualsExpressionContext)_localctx).right = expression(19);
						}
						break;
					case 12:
						{
						_localctx = new RoughlyEqualsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((RoughlyEqualsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1044);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1045); 
						match(TEQ);
						setState(1046); 
						((RoughlyEqualsExpressionContext)_localctx).right = expression(18);
						}
						break;
					case 13:
						{
						_localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((OrExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1047);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1048); 
						match(OR);
						setState(1049); 
						((OrExpressionContext)_localctx).right = expression(17);
						}
						break;
					case 14:
						{
						_localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((AndExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1050);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1051); 
						match(AND);
						setState(1052); 
						((AndExpressionContext)_localctx).right = expression(16);
						}
						break;
					case 15:
						{
						_localctx = new TernaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((TernaryExpressionContext)_localctx).ifTrue = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1053);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1054); 
						match(IF);
						setState(1055); 
						((TernaryExpressionContext)_localctx).test = expression(0);
						setState(1056); 
						match(ELSE);
						setState(1057); 
						((TernaryExpressionContext)_localctx).ifFalse = expression(15);
						}
						break;
					case 16:
						{
						_localctx = new InExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((InExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1059);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1060); 
						match(IN);
						setState(1061); 
						((InExpressionContext)_localctx).right = expression(13);
						}
						break;
					case 17:
						{
						_localctx = new ContainsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ContainsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1062);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1063); 
						match(CONTAINS);
						setState(1064); 
						((ContainsExpressionContext)_localctx).right = expression(12);
						}
						break;
					case 18:
						{
						_localctx = new ContainsAllExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ContainsAllExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1065);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1066); 
						match(CONTAINS);
						setState(1067); 
						match(ALL);
						setState(1068); 
						((ContainsAllExpressionContext)_localctx).right = expression(11);
						}
						break;
					case 19:
						{
						_localctx = new ContainsAnyExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ContainsAnyExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1069);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1070); 
						match(CONTAINS);
						setState(1071); 
						match(ANY);
						setState(1072); 
						((ContainsAnyExpressionContext)_localctx).right = expression(10);
						}
						break;
					case 20:
						{
						_localctx = new NotInExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((NotInExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1073);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1074); 
						match(NOT);
						setState(1075); 
						match(IN);
						setState(1076); 
						((NotInExpressionContext)_localctx).right = expression(9);
						}
						break;
					case 21:
						{
						_localctx = new NotContainsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((NotContainsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1077);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1078); 
						match(NOT);
						setState(1079); 
						match(CONTAINS);
						setState(1080); 
						((NotContainsExpressionContext)_localctx).right = expression(8);
						}
						break;
					case 22:
						{
						_localctx = new NotContainsAllExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((NotContainsAllExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1081);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1082); 
						match(NOT);
						setState(1083); 
						match(CONTAINS);
						setState(1084); 
						match(ALL);
						setState(1085); 
						((NotContainsAllExpressionContext)_localctx).right = expression(7);
						}
						break;
					case 23:
						{
						_localctx = new NotContainsAnyExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((NotContainsAnyExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1086);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1087); 
						match(NOT);
						setState(1088); 
						match(CONTAINS);
						setState(1089); 
						match(ANY);
						setState(1090); 
						((NotContainsAnyExpressionContext)_localctx).right = expression(6);
						}
						break;
					case 24:
						{
						_localctx = new IteratorExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((IteratorExpressionContext)_localctx).exp = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1091);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1092); 
						match(FOR);
						setState(1093); 
						((IteratorExpressionContext)_localctx).name = variable_identifier();
						setState(1094); 
						match(IN);
						setState(1095); 
						((IteratorExpressionContext)_localctx).source = expression(2);
						}
						break;
					case 25:
						{
						_localctx = new FilteredListExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((FilteredListExpressionContext)_localctx).src = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1097);
						if (!(precpred(_ctx, 34))) throw new FailedPredicateException(this, "precpred(_ctx, 34)");
						setState(1098); 
						filtered_list_suffix();
						}
						break;
					case 26:
						{
						_localctx = new IsNotExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((IsNotExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1099);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1100); 
						match(IS);
						setState(1101); 
						match(NOT);
						setState(1102); 
						((IsNotExpressionContext)_localctx).right = is_expression();
						}
						break;
					case 27:
						{
						_localctx = new IsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((IsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1103);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1104); 
						match(IS);
						setState(1105); 
						((IsExpressionContext)_localctx).right = is_expression();
						}
						break;
					case 28:
						{
						_localctx = new CastExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((CastExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1106);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1107); 
						match(AS);
						setState(1108); 
						((CastExpressionContext)_localctx).right = category_or_any_type();
						}
						break;
					}
					} 
				}
				setState(1113);
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
			setState(1114); 
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
		int _startState = 94;
		enterRecursionRule(_localctx, 94, RULE_instance_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SelectableExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1117); 
			((SelectableExpressionContext)_localctx).parent = selectable_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(1123);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SelectorExpressionContext(new Instance_expressionContext(_parentctx, _parentState));
					((SelectorExpressionContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_instance_expression);
					setState(1119);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1120); 
					((SelectorExpressionContext)_localctx).selector = instance_selector();
					}
					} 
				}
				setState(1125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
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
		enterRule(_localctx, 96, RULE_method_expression);
		try {
			setState(1134);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1126); 
				blob_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1127); 
				document_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1128); 
				fetch_store_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1129); 
				read_all_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1130); 
				read_one_expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1131); 
				sorted_expression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1132); 
				method_call();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1133); 
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
		enterRule(_localctx, 98, RULE_instance_selector);
		try {
			setState(1149);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				_localctx = new MemberSelectorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1136);
				if (!(this.wasNot(MParser.WS))) throw new FailedPredicateException(this, "$parser.wasNot(MParser.WS)");
				setState(1137); 
				match(DOT);
				setState(1138); 
				((MemberSelectorContext)_localctx).name = variable_identifier();
				}
				break;
			case 2:
				_localctx = new SliceSelectorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1139);
				if (!(this.wasNot(MParser.WS))) throw new FailedPredicateException(this, "$parser.wasNot(MParser.WS)");
				setState(1140); 
				match(LBRAK);
				setState(1141); 
				((SliceSelectorContext)_localctx).xslice = slice_arguments();
				setState(1142); 
				match(RBRAK);
				}
				break;
			case 3:
				_localctx = new ItemSelectorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1144);
				if (!(this.wasNot(MParser.WS))) throw new FailedPredicateException(this, "$parser.wasNot(MParser.WS)");
				setState(1145); 
				match(LBRAK);
				setState(1146); 
				((ItemSelectorContext)_localctx).exp = expression(0);
				setState(1147); 
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
		enterRule(_localctx, 100, RULE_blob_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1151); 
			match(BLOB);
			setState(1152); 
			match(LPAR);
			setState(1154);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (EXECUTE - 99)) | (1L << (FETCH - 99)) | (1L << (MUTABLE - 99)) | (1L << (NONE - 99)) | (1L << (NOT - 99)) | (1L << (READ - 99)) | (1L << (SELF - 99)) | (1L << (SORTED - 99)) | (1L << (THIS - 99)) | (1L << (BOOLEAN_LITERAL - 99)) | (1L << (CHAR_LITERAL - 99)) | (1L << (MIN_INTEGER - 99)) | (1L << (MAX_INTEGER - 99)) | (1L << (SYMBOL_IDENTIFIER - 99)) | (1L << (TYPE_IDENTIFIER - 99)))) != 0) || ((((_la - 163)) & ~0x3f) == 0 && ((1L << (_la - 163)) & ((1L << (VARIABLE_IDENTIFIER - 163)) | (1L << (TEXT_LITERAL - 163)) | (1L << (UUID_LITERAL - 163)) | (1L << (INTEGER_LITERAL - 163)) | (1L << (HEXA_LITERAL - 163)) | (1L << (DECIMAL_LITERAL - 163)) | (1L << (DATETIME_LITERAL - 163)) | (1L << (TIME_LITERAL - 163)) | (1L << (DATE_LITERAL - 163)) | (1L << (PERIOD_LITERAL - 163)) | (1L << (VERSION_LITERAL - 163)))) != 0)) {
				{
				setState(1153); 
				expression(0);
				}
			}

			setState(1156); 
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
		enterRule(_localctx, 102, RULE_document_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1158); 
			match(DOCUMENT);
			setState(1159); 
			match(LPAR);
			setState(1161);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (EXECUTE - 99)) | (1L << (FETCH - 99)) | (1L << (MUTABLE - 99)) | (1L << (NONE - 99)) | (1L << (NOT - 99)) | (1L << (READ - 99)) | (1L << (SELF - 99)) | (1L << (SORTED - 99)) | (1L << (THIS - 99)) | (1L << (BOOLEAN_LITERAL - 99)) | (1L << (CHAR_LITERAL - 99)) | (1L << (MIN_INTEGER - 99)) | (1L << (MAX_INTEGER - 99)) | (1L << (SYMBOL_IDENTIFIER - 99)) | (1L << (TYPE_IDENTIFIER - 99)))) != 0) || ((((_la - 163)) & ~0x3f) == 0 && ((1L << (_la - 163)) & ((1L << (VARIABLE_IDENTIFIER - 163)) | (1L << (TEXT_LITERAL - 163)) | (1L << (UUID_LITERAL - 163)) | (1L << (INTEGER_LITERAL - 163)) | (1L << (HEXA_LITERAL - 163)) | (1L << (DECIMAL_LITERAL - 163)) | (1L << (DATETIME_LITERAL - 163)) | (1L << (TIME_LITERAL - 163)) | (1L << (DATE_LITERAL - 163)) | (1L << (PERIOD_LITERAL - 163)) | (1L << (VERSION_LITERAL - 163)))) != 0)) {
				{
				setState(1160); 
				expression(0);
				}
			}

			setState(1163); 
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
		public Constructor_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterConstructor_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitConstructor_expression(this);
		}
	}

	public final Constructor_expressionContext constructor_expression() throws RecognitionException {
		Constructor_expressionContext _localctx = new Constructor_expressionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_constructor_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1165); 
			((Constructor_expressionContext)_localctx).typ = mutable_category_type();
			setState(1166); 
			match(LPAR);
			setState(1168);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (EXECUTE - 99)) | (1L << (FETCH - 99)) | (1L << (MUTABLE - 99)) | (1L << (NONE - 99)) | (1L << (NOT - 99)) | (1L << (READ - 99)) | (1L << (SELF - 99)) | (1L << (SORTED - 99)) | (1L << (THIS - 99)) | (1L << (BOOLEAN_LITERAL - 99)) | (1L << (CHAR_LITERAL - 99)) | (1L << (MIN_INTEGER - 99)) | (1L << (MAX_INTEGER - 99)) | (1L << (SYMBOL_IDENTIFIER - 99)) | (1L << (TYPE_IDENTIFIER - 99)))) != 0) || ((((_la - 163)) & ~0x3f) == 0 && ((1L << (_la - 163)) & ((1L << (VARIABLE_IDENTIFIER - 163)) | (1L << (TEXT_LITERAL - 163)) | (1L << (UUID_LITERAL - 163)) | (1L << (INTEGER_LITERAL - 163)) | (1L << (HEXA_LITERAL - 163)) | (1L << (DECIMAL_LITERAL - 163)) | (1L << (DATETIME_LITERAL - 163)) | (1L << (TIME_LITERAL - 163)) | (1L << (DATE_LITERAL - 163)) | (1L << (PERIOD_LITERAL - 163)) | (1L << (VERSION_LITERAL - 163)))) != 0)) {
				{
				setState(1167); 
				((Constructor_expressionContext)_localctx).args = argument_assignment_list(0);
				}
			}

			setState(1170); 
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
		int _startState = 106;
		enterRecursionRule(_localctx, 106, RULE_argument_assignment_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1177);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				_localctx = new ExpressionAssignmentListContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1173); 
				((ExpressionAssignmentListContext)_localctx).exp = expression(0);
				setState(1174);
				if (!(this.willNotBe(this.equalToken()))) throw new FailedPredicateException(this, "$parser.willNotBe($parser.equalToken())");
				}
				break;
			case 2:
				{
				_localctx = new ArgumentAssignmentListContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1176); 
				((ArgumentAssignmentListContext)_localctx).item = argument_assignment();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1184);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArgumentAssignmentListItemContext(new Argument_assignment_listContext(_parentctx, _parentState));
					((ArgumentAssignmentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_argument_assignment_list);
					setState(1179);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1180); 
					match(COMMA);
					setState(1181); 
					((ArgumentAssignmentListItemContext)_localctx).item = argument_assignment();
					}
					} 
				}
				setState(1186);
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

	public static class Argument_assignmentContext extends ParserRuleContext {
		public Variable_identifierContext name;
		public ExpressionContext exp;
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
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
		enterRule(_localctx, 108, RULE_argument_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1187); 
			((Argument_assignmentContext)_localctx).name = variable_identifier();
			setState(1188); 
			assign();
			setState(1189); 
			((Argument_assignmentContext)_localctx).exp = expression(0);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 110, RULE_write_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1191); 
			match(WRITE);
			setState(1192); 
			((Write_statementContext)_localctx).what = expression(0);
			setState(1193); 
			match(TO);
			setState(1194); 
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
		enterRule(_localctx, 112, RULE_filtered_list_suffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1196); 
			match(FILTERED);
			setState(1197); 
			match(WITH);
			setState(1198); 
			((Filtered_list_suffixContext)_localctx).name = variable_identifier();
			setState(1199); 
			match(WHERE);
			setState(1200); 
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
		enterRule(_localctx, 114, RULE_fetch_store_expression);
		int _la;
		try {
			setState(1232);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				_localctx = new FetchOneContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1202); 
				match(FETCH);
				setState(1203); 
				match(ONE);
				setState(1205);
				_la = _input.LA(1);
				if (_la==MUTABLE || _la==TYPE_IDENTIFIER) {
					{
					setState(1204); 
					((FetchOneContext)_localctx).typ = mutable_category_type();
					}
				}

				setState(1207); 
				match(WHERE);
				setState(1208); 
				((FetchOneContext)_localctx).predicate = expression(0);
				}
				break;
			case 2:
				_localctx = new FetchManyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1209); 
				match(FETCH);
				setState(1216);
				switch (_input.LA(1)) {
				case ALL:
					{
					setState(1210); 
					match(ALL);
					}
					break;
				case ROWS:
					{
					setState(1211); 
					match(ROWS);
					setState(1212); 
					((FetchManyContext)_localctx).xstart = expression(0);
					setState(1213); 
					match(TO);
					setState(1214); 
					((FetchManyContext)_localctx).xstop = expression(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1218); 
				match(LPAR);
				setState(1220);
				_la = _input.LA(1);
				if (_la==MUTABLE || _la==TYPE_IDENTIFIER) {
					{
					setState(1219); 
					((FetchManyContext)_localctx).typ = mutable_category_type();
					}
				}

				setState(1222); 
				match(RPAR);
				setState(1225);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(1223); 
					match(WHERE);
					setState(1224); 
					((FetchManyContext)_localctx).predicate = expression(0);
					}
					break;
				}
				setState(1230);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(1227); 
					match(ORDER);
					setState(1228); 
					match(BY);
					setState(1229); 
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
		enterRule(_localctx, 116, RULE_sorted_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1234); 
			match(SORTED);
			setState(1236);
			_la = _input.LA(1);
			if (_la==DESC) {
				{
				setState(1235); 
				match(DESC);
				}
			}

			setState(1238); 
			match(LPAR);
			setState(1239); 
			((Sorted_expressionContext)_localctx).source = instance_expression(0);
			setState(1245);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1240); 
				match(COMMA);
				setState(1241); 
				key_token();
				setState(1242); 
				match(EQ);
				setState(1243); 
				((Sorted_expressionContext)_localctx).key = instance_expression(0);
				}
			}

			setState(1247); 
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
		enterRule(_localctx, 118, RULE_assign_instance_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1249); 
			((Assign_instance_statementContext)_localctx).inst = assignable_instance(0);
			setState(1250); 
			assign();
			setState(1251); 
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
		enterRule(_localctx, 120, RULE_child_instance);
		try {
			setState(1261);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				_localctx = new MemberInstanceContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1253);
				if (!(this.wasNot(MParser.WS))) throw new FailedPredicateException(this, "$parser.wasNot(MParser.WS)");
				setState(1254); 
				match(DOT);
				setState(1255); 
				((MemberInstanceContext)_localctx).name = variable_identifier();
				}
				break;
			case 2:
				_localctx = new ItemInstanceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1256);
				if (!(this.wasNot(MParser.WS))) throw new FailedPredicateException(this, "$parser.wasNot(MParser.WS)");
				setState(1257); 
				match(LBRAK);
				setState(1258); 
				((ItemInstanceContext)_localctx).exp = expression(0);
				setState(1259); 
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
		enterRule(_localctx, 122, RULE_assign_tuple_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1263); 
			((Assign_tuple_statementContext)_localctx).items = variable_identifier_list();
			setState(1264); 
			assign();
			setState(1265); 
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
		enterRule(_localctx, 124, RULE_lfs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1270);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1267); 
					match(LF);
					}
					} 
				}
				setState(1272);
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
		enterRule(_localctx, 126, RULE_lfp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1274); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1273); 
				match(LF);
				}
				}
				setState(1276); 
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
		enterRule(_localctx, 128, RULE_indent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1279); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1278); 
				match(LF);
				}
				}
				setState(1281); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LF );
			setState(1283); 
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
		enterRule(_localctx, 130, RULE_dedent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LF) {
				{
				{
				setState(1285); 
				match(LF);
				}
				}
				setState(1290);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1291); 
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
		enterRule(_localctx, 132, RULE_null_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1293); 
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
		enterRule(_localctx, 134, RULE_declaration_list);
		int _la;
		try {
			_localctx = new FullDeclarationListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1296);
			_la = _input.LA(1);
			if (_la==COMMENT || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (ABSTRACT - 68)) | (1L << (ATTR - 68)) | (1L << (CATEGORY - 68)) | (1L << (CLASS - 68)) | (1L << (DEF - 68)) | (1L << (ENUM - 68)) | (1L << (NATIVE - 68)))) != 0) || _la==SINGLETON || _la==STORABLE) {
				{
				setState(1295); 
				declarations();
				}
			}

			setState(1298); 
			lfs();
			setState(1299); 
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
		enterRule(_localctx, 136, RULE_declarations);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1301); 
			declaration();
			setState(1307);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1302); 
					lfp();
					setState(1303); 
					declaration();
					}
					} 
				}
				setState(1309);
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
			if ( listener instanceof MParserListener ) ((MParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MParserListener ) ((MParserListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(1310); 
				comment_statement();
				setState(1311); 
				lfp();
				}
				}
				setState(1317);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1323);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(1318); 
				attribute_declaration();
				}
				break;
			case 2:
				{
				setState(1319); 
				category_declaration();
				}
				break;
			case 3:
				{
				setState(1320); 
				resource_declaration();
				}
				break;
			case 4:
				{
				setState(1321); 
				enum_declaration();
				}
				break;
			case 5:
				{
				setState(1322); 
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
		enterRule(_localctx, 140, RULE_resource_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1325); 
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
		enterRule(_localctx, 142, RULE_enum_declaration);
		try {
			setState(1329);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1327); 
				enum_category_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1328); 
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
		enterRule(_localctx, 144, RULE_native_symbol_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1331); 
			native_symbol();
			setState(1337);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1332); 
					lfp();
					setState(1333); 
					native_symbol();
					}
					} 
				}
				setState(1339);
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
		enterRule(_localctx, 146, RULE_category_symbol_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1340); 
			category_symbol();
			setState(1346);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1341); 
					lfp();
					setState(1342); 
					category_symbol();
					}
					} 
				}
				setState(1348);
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
		enterRule(_localctx, 148, RULE_symbol_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1349); 
			symbol_identifier();
			setState(1354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1350); 
				match(COMMA);
				setState(1351); 
				symbol_identifier();
				}
				}
				setState(1356);
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
		enterRule(_localctx, 150, RULE_attribute_constraint);
		try {
			setState(1367);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				_localctx = new MatchingListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1357); 
				match(IN);
				setState(1358); 
				((MatchingListContext)_localctx).source = list_literal();
				}
				break;
			case 2:
				_localctx = new MatchingSetContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1359); 
				match(IN);
				setState(1360); 
				((MatchingSetContext)_localctx).source = set_literal();
				}
				break;
			case 3:
				_localctx = new MatchingRangeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1361); 
				match(IN);
				setState(1362); 
				((MatchingRangeContext)_localctx).source = range_literal();
				}
				break;
			case 4:
				_localctx = new MatchingPatternContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1363); 
				match(MATCHING);
				setState(1364); 
				((MatchingPatternContext)_localctx).text = match(TEXT_LITERAL);
				}
				break;
			case 5:
				_localctx = new MatchingExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1365); 
				match(MATCHING);
				setState(1366); 
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
		enterRule(_localctx, 152, RULE_list_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1370);
			_la = _input.LA(1);
			if (_la==MUTABLE) {
				{
				setState(1369); 
				match(MUTABLE);
				}
			}

			setState(1372); 
			match(LBRAK);
			setState(1374);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (EXECUTE - 99)) | (1L << (FETCH - 99)) | (1L << (MUTABLE - 99)) | (1L << (NONE - 99)) | (1L << (NOT - 99)) | (1L << (READ - 99)) | (1L << (SELF - 99)) | (1L << (SORTED - 99)) | (1L << (THIS - 99)) | (1L << (BOOLEAN_LITERAL - 99)) | (1L << (CHAR_LITERAL - 99)) | (1L << (MIN_INTEGER - 99)) | (1L << (MAX_INTEGER - 99)) | (1L << (SYMBOL_IDENTIFIER - 99)) | (1L << (TYPE_IDENTIFIER - 99)))) != 0) || ((((_la - 163)) & ~0x3f) == 0 && ((1L << (_la - 163)) & ((1L << (VARIABLE_IDENTIFIER - 163)) | (1L << (TEXT_LITERAL - 163)) | (1L << (UUID_LITERAL - 163)) | (1L << (INTEGER_LITERAL - 163)) | (1L << (HEXA_LITERAL - 163)) | (1L << (DECIMAL_LITERAL - 163)) | (1L << (DATETIME_LITERAL - 163)) | (1L << (TIME_LITERAL - 163)) | (1L << (DATE_LITERAL - 163)) | (1L << (PERIOD_LITERAL - 163)) | (1L << (VERSION_LITERAL - 163)))) != 0)) {
				{
				setState(1373); 
				expression_list();
				}
			}

			setState(1376); 
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
		enterRule(_localctx, 154, RULE_set_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1379);
			_la = _input.LA(1);
			if (_la==MUTABLE) {
				{
				setState(1378); 
				match(MUTABLE);
				}
			}

			setState(1381); 
			match(LT);
			setState(1383);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (EXECUTE - 99)) | (1L << (FETCH - 99)) | (1L << (MUTABLE - 99)) | (1L << (NONE - 99)) | (1L << (NOT - 99)) | (1L << (READ - 99)) | (1L << (SELF - 99)) | (1L << (SORTED - 99)) | (1L << (THIS - 99)) | (1L << (BOOLEAN_LITERAL - 99)) | (1L << (CHAR_LITERAL - 99)) | (1L << (MIN_INTEGER - 99)) | (1L << (MAX_INTEGER - 99)) | (1L << (SYMBOL_IDENTIFIER - 99)) | (1L << (TYPE_IDENTIFIER - 99)))) != 0) || ((((_la - 163)) & ~0x3f) == 0 && ((1L << (_la - 163)) & ((1L << (VARIABLE_IDENTIFIER - 163)) | (1L << (TEXT_LITERAL - 163)) | (1L << (UUID_LITERAL - 163)) | (1L << (INTEGER_LITERAL - 163)) | (1L << (HEXA_LITERAL - 163)) | (1L << (DECIMAL_LITERAL - 163)) | (1L << (DATETIME_LITERAL - 163)) | (1L << (TIME_LITERAL - 163)) | (1L << (DATE_LITERAL - 163)) | (1L << (PERIOD_LITERAL - 163)) | (1L << (VERSION_LITERAL - 163)))) != 0)) {
				{
				setState(1382); 
				expression_list();
				}
			}

			setState(1385); 
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
		enterRule(_localctx, 156, RULE_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1387); 
			expression(0);
			setState(1392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1388); 
				match(COMMA);
				setState(1389); 
				expression(0);
				}
				}
				setState(1394);
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
		enterRule(_localctx, 158, RULE_range_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1395); 
			match(LBRAK);
			setState(1396); 
			((Range_literalContext)_localctx).low = expression(0);
			setState(1397); 
			match(RANGE);
			setState(1398); 
			((Range_literalContext)_localctx).high = expression(0);
			setState(1399); 
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
		int _startState = 160;
		enterRecursionRule(_localctx, 160, RULE_typedef, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1413);
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
			case TYPE_IDENTIFIER:
				{
				_localctx = new PrimaryTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1402); 
				((PrimaryTypeContext)_localctx).p = primary_type();
				}
				break;
			case CURSOR:
				{
				_localctx = new CursorTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1403); 
				match(CURSOR);
				setState(1404); 
				match(LT);
				setState(1405); 
				((CursorTypeContext)_localctx).c = typedef(0);
				setState(1406); 
				match(GT);
				}
				break;
			case ITERATOR:
				{
				_localctx = new IteratorTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1408); 
				match(ITERATOR);
				setState(1409); 
				match(LT);
				setState(1410); 
				((IteratorTypeContext)_localctx).i = typedef(0);
				setState(1411); 
				match(GT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1425);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1423);
					switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
					case 1:
						{
						_localctx = new SetTypeContext(new TypedefContext(_parentctx, _parentState));
						((SetTypeContext)_localctx).s = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_typedef);
						setState(1415);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1416); 
						match(LTGT);
						}
						break;
					case 2:
						{
						_localctx = new ListTypeContext(new TypedefContext(_parentctx, _parentState));
						((ListTypeContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_typedef);
						setState(1417);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1418); 
						match(LBRAK);
						setState(1419); 
						match(RBRAK);
						}
						break;
					case 3:
						{
						_localctx = new DictTypeContext(new TypedefContext(_parentctx, _parentState));
						((DictTypeContext)_localctx).d = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_typedef);
						setState(1420);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1421); 
						match(LCURL);
						setState(1422); 
						match(RCURL);
						}
						break;
					}
					} 
				}
				setState(1427);
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
		enterRule(_localctx, 162, RULE_primary_type);
		try {
			setState(1430);
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
				_localctx = new NativeTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1428); 
				((NativeTypeContext)_localctx).n = native_type();
				}
				break;
			case TYPE_IDENTIFIER:
				_localctx = new CategoryTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1429); 
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
		enterRule(_localctx, 164, RULE_native_type);
		try {
			setState(1447);
			switch (_input.LA(1)) {
			case BOOLEAN:
				_localctx = new BooleanTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1432); 
				match(BOOLEAN);
				}
				break;
			case CHARACTER:
				_localctx = new CharacterTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1433); 
				match(CHARACTER);
				}
				break;
			case TEXT:
				_localctx = new TextTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1434); 
				match(TEXT);
				}
				break;
			case IMAGE:
				_localctx = new ImageTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1435); 
				match(IMAGE);
				}
				break;
			case INTEGER:
				_localctx = new IntegerTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1436); 
				match(INTEGER);
				}
				break;
			case DECIMAL:
				_localctx = new DecimalTypeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1437); 
				match(DECIMAL);
				}
				break;
			case DOCUMENT:
				_localctx = new DocumentTypeContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1438); 
				match(DOCUMENT);
				}
				break;
			case DATE:
				_localctx = new DateTypeContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1439); 
				match(DATE);
				}
				break;
			case DATETIME:
				_localctx = new DateTimeTypeContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1440); 
				match(DATETIME);
				}
				break;
			case TIME:
				_localctx = new TimeTypeContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1441); 
				match(TIME);
				}
				break;
			case PERIOD:
				_localctx = new PeriodTypeContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(1442); 
				match(PERIOD);
				}
				break;
			case VERSION:
				_localctx = new VersionTypeContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(1443); 
				match(VERSION);
				}
				break;
			case CODE:
				_localctx = new CodeTypeContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(1444); 
				match(CODE);
				}
				break;
			case BLOB:
				_localctx = new BlobTypeContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(1445); 
				match(BLOB);
				}
				break;
			case UUID:
				_localctx = new UUIDTypeContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(1446); 
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
		enterRule(_localctx, 166, RULE_category_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1449); 
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
		enterRule(_localctx, 168, RULE_mutable_category_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1452);
			_la = _input.LA(1);
			if (_la==MUTABLE) {
				{
				setState(1451); 
				match(MUTABLE);
				}
			}

			setState(1454); 
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
		enterRule(_localctx, 170, RULE_code_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1456); 
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
		enterRule(_localctx, 172, RULE_category_declaration);
		try {
			setState(1461);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				_localctx = new ConcreteCategoryDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1458); 
				((ConcreteCategoryDeclarationContext)_localctx).decl = concrete_category_declaration();
				}
				break;
			case 2:
				_localctx = new NativeCategoryDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1459); 
				((NativeCategoryDeclarationContext)_localctx).decl = native_category_declaration();
				}
				break;
			case 3:
				_localctx = new SingletonCategoryDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1460); 
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
		enterRule(_localctx, 174, RULE_type_identifier_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1463); 
			type_identifier();
			setState(1468);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1464); 
					match(COMMA);
					setState(1465); 
					type_identifier();
					}
					} 
				}
				setState(1470);
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
		enterRule(_localctx, 176, RULE_method_identifier);
		try {
			setState(1473);
			switch (_input.LA(1)) {
			case VARIABLE_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1471); 
				variable_identifier();
				}
				break;
			case TYPE_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1472); 
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
		enterRule(_localctx, 178, RULE_identifier);
		try {
			setState(1478);
			switch (_input.LA(1)) {
			case VARIABLE_IDENTIFIER:
				_localctx = new VariableIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1475); 
				variable_identifier();
				}
				break;
			case TYPE_IDENTIFIER:
				_localctx = new TypeIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1476); 
				type_identifier();
				}
				break;
			case SYMBOL_IDENTIFIER:
				_localctx = new SymbolIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1477); 
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
		enterRule(_localctx, 180, RULE_variable_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1480); 
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
		enterRule(_localctx, 182, RULE_attribute_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1482);
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
		enterRule(_localctx, 184, RULE_type_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1484); 
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
		enterRule(_localctx, 186, RULE_symbol_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1486); 
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
		enterRule(_localctx, 188, RULE_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1488); 
			argument();
			setState(1493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1489); 
				match(COMMA);
				setState(1490); 
				argument();
				}
				}
				setState(1495);
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
		enterRule(_localctx, 190, RULE_argument);
		int _la;
		try {
			setState(1501);
			switch (_input.LA(1)) {
			case CODE:
				_localctx = new CodeArgumentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1496); 
				((CodeArgumentContext)_localctx).arg = code_argument();
				}
				break;
			case MUTABLE:
			case VARIABLE_IDENTIFIER:
				_localctx = new OperatorArgumentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1498);
				_la = _input.LA(1);
				if (_la==MUTABLE) {
					{
					setState(1497); 
					match(MUTABLE);
					}
				}

				setState(1500); 
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
		enterRule(_localctx, 192, RULE_operator_argument);
		try {
			setState(1505);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1503); 
				named_argument();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1504); 
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
		enterRule(_localctx, 194, RULE_named_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1507); 
			variable_identifier();
			setState(1510);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(1508); 
				match(EQ);
				setState(1509); 
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
		enterRule(_localctx, 196, RULE_code_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1512); 
			code_type();
			setState(1513); 
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
		enterRule(_localctx, 198, RULE_category_or_any_type);
		try {
			setState(1517);
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
			case TYPE_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1515); 
				typedef(0);
				}
				break;
			case ANY:
				enterOuterAlt(_localctx, 2);
				{
				setState(1516); 
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
		int _startState = 200;
		enterRecursionRule(_localctx, 200, RULE_any_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AnyTypeContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1520); 
			match(ANY);
			}
			_ctx.stop = _input.LT(-1);
			setState(1530);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1528);
					switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
					case 1:
						{
						_localctx = new AnyListTypeContext(new Any_typeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_any_type);
						setState(1522);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1523); 
						match(LBRAK);
						setState(1524); 
						match(RBRAK);
						}
						break;
					case 2:
						{
						_localctx = new AnyDictTypeContext(new Any_typeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_any_type);
						setState(1525);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1526); 
						match(LCURL);
						setState(1527); 
						match(RCURL);
						}
						break;
					}
					} 
				}
				setState(1532);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
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
		enterRule(_localctx, 202, RULE_member_method_declaration_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1533); 
			member_method_declaration();
			setState(1539);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1534); 
					lfp();
					setState(1535); 
					member_method_declaration();
					}
					} 
				}
				setState(1541);
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
		enterRule(_localctx, 204, RULE_member_method_declaration);
		try {
			setState(1547);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1542); 
				setter_method_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1543); 
				getter_method_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1544); 
				concrete_method_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1545); 
				abstract_method_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1546); 
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
		enterRule(_localctx, 206, RULE_native_member_method_declaration_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1549); 
			native_member_method_declaration();
			setState(1555);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1550); 
					lfp();
					setState(1551); 
					native_member_method_declaration();
					}
					} 
				}
				setState(1557);
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
		enterRule(_localctx, 208, RULE_native_member_method_declaration);
		try {
			setState(1561);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1558); 
				native_getter_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1559); 
				native_setter_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1560); 
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
		enterRule(_localctx, 210, RULE_native_category_binding);
		try {
			setState(1573);
			switch (_input.LA(1)) {
			case JAVA:
				_localctx = new JavaCategoryBindingContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1563); 
				match(JAVA);
				setState(1564); 
				((JavaCategoryBindingContext)_localctx).binding = java_class_identifier_expression(0);
				}
				break;
			case CSHARP:
				_localctx = new CSharpCategoryBindingContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1565); 
				match(CSHARP);
				setState(1566); 
				((CSharpCategoryBindingContext)_localctx).binding = csharp_identifier_expression(0);
				}
				break;
			case PYTHON2:
				_localctx = new Python2CategoryBindingContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1567); 
				match(PYTHON2);
				setState(1568); 
				((Python2CategoryBindingContext)_localctx).binding = python_category_binding();
				}
				break;
			case PYTHON3:
				_localctx = new Python3CategoryBindingContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1569); 
				match(PYTHON3);
				setState(1570); 
				((Python3CategoryBindingContext)_localctx).binding = python_category_binding();
				}
				break;
			case JAVASCRIPT:
				_localctx = new JavaScriptCategoryBindingContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1571); 
				match(JAVASCRIPT);
				setState(1572); 
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
		enterRule(_localctx, 212, RULE_python_category_binding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1575); 
			identifier();
			setState(1577);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				{
				setState(1576); 
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
		enterRule(_localctx, 214, RULE_python_module);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1579); 
			match(FROM);
			setState(1580); 
			module_token();
			setState(1581); 
			match(COLON);
			setState(1582); 
			identifier();
			setState(1587);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1583); 
					match(DOT);
					setState(1584); 
					identifier();
					}
					} 
				}
				setState(1589);
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
		enterRule(_localctx, 216, RULE_javascript_category_binding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1590); 
			identifier();
			setState(1592);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				{
				setState(1591); 
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
		enterRule(_localctx, 218, RULE_javascript_module);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1594); 
			match(FROM);
			setState(1595); 
			module_token();
			setState(1596); 
			match(COLON);
			setState(1598);
			_la = _input.LA(1);
			if (_la==SLASH) {
				{
				setState(1597); 
				match(SLASH);
				}
			}

			setState(1600); 
			javascript_identifier();
			setState(1605);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1601); 
					match(SLASH);
					setState(1602); 
					javascript_identifier();
					}
					} 
				}
				setState(1607);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			}
			setState(1610);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				{
				setState(1608); 
				match(DOT);
				setState(1609); 
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
		enterRule(_localctx, 220, RULE_variable_identifier_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1612); 
			variable_identifier();
			setState(1617);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1613); 
				match(COMMA);
				setState(1614); 
				variable_identifier();
				}
				}
				setState(1619);
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
		enterRule(_localctx, 222, RULE_attribute_identifier_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1620); 
			attribute_identifier();
			setState(1625);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1621); 
				match(COMMA);
				setState(1622); 
				attribute_identifier();
				}
				}
				setState(1627);
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
		enterRule(_localctx, 224, RULE_method_declaration);
		try {
			setState(1632);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1628); 
				abstract_method_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1629); 
				concrete_method_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1630); 
				native_method_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1631); 
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
		enterRule(_localctx, 226, RULE_comment_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1634); 
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
		enterRule(_localctx, 228, RULE_native_statement_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1636); 
			native_statement();
			setState(1642);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1637); 
					lfp();
					setState(1638); 
					native_statement();
					}
					} 
				}
				setState(1644);
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
		enterRule(_localctx, 230, RULE_native_statement);
		try {
			setState(1655);
			switch (_input.LA(1)) {
			case JAVA:
				_localctx = new JavaNativeStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1645); 
				match(JAVA);
				setState(1646); 
				java_statement();
				}
				break;
			case CSHARP:
				_localctx = new CSharpNativeStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1647); 
				match(CSHARP);
				setState(1648); 
				csharp_statement();
				}
				break;
			case PYTHON2:
				_localctx = new Python2NativeStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1649); 
				match(PYTHON2);
				setState(1650); 
				python_native_statement();
				}
				break;
			case PYTHON3:
				_localctx = new Python3NativeStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1651); 
				match(PYTHON3);
				setState(1652); 
				python_native_statement();
				}
				break;
			case JAVASCRIPT:
				_localctx = new JavaScriptNativeStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1653); 
				match(JAVASCRIPT);
				setState(1654); 
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
		enterRule(_localctx, 232, RULE_python_native_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1657); 
			python_statement();
			setState(1659);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1658); 
				match(SEMI);
				}
			}

			setState(1662);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(1661); 
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
		enterRule(_localctx, 234, RULE_javascript_native_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1664); 
			javascript_statement();
			setState(1666);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1665); 
				match(SEMI);
				}
			}

			setState(1669);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(1668); 
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
		enterRule(_localctx, 236, RULE_statement_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1671); 
			statement();
			setState(1677);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1672); 
					lfp();
					setState(1673); 
					statement();
					}
					} 
				}
				setState(1679);
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
		enterRule(_localctx, 238, RULE_assertion_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1680); 
			assertion();
			setState(1686);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1681); 
					lfp();
					setState(1682); 
					assertion();
					}
					} 
				}
				setState(1688);
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
		enterRule(_localctx, 240, RULE_switch_case_statement_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1689); 
			switch_case_statement();
			setState(1695);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1690); 
					lfp();
					setState(1691); 
					switch_case_statement();
					}
					} 
				}
				setState(1697);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 242, RULE_catch_statement_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1698); 
			catch_statement();
			setState(1704);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1699); 
					lfp();
					setState(1700); 
					catch_statement();
					}
					} 
				}
				setState(1706);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 244, RULE_literal_collection);
		try {
			setState(1721);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				_localctx = new LiteralRangeLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1707); 
				match(LBRAK);
				setState(1708); 
				((LiteralRangeLiteralContext)_localctx).low = atomic_literal();
				setState(1709); 
				match(RANGE);
				setState(1710); 
				((LiteralRangeLiteralContext)_localctx).high = atomic_literal();
				setState(1711); 
				match(RBRAK);
				}
				break;
			case 2:
				_localctx = new LiteralListLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1713); 
				match(LBRAK);
				setState(1714); 
				literal_list_literal();
				setState(1715); 
				match(RBRAK);
				}
				break;
			case 3:
				_localctx = new LiteralSetLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1717); 
				match(LT);
				setState(1718); 
				literal_list_literal();
				setState(1719); 
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
		enterRule(_localctx, 246, RULE_atomic_literal);
		try {
			setState(1738);
			switch (_input.LA(1)) {
			case MIN_INTEGER:
				_localctx = new MinIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1723); 
				((MinIntegerLiteralContext)_localctx).t = match(MIN_INTEGER);
				}
				break;
			case MAX_INTEGER:
				_localctx = new MaxIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1724); 
				((MaxIntegerLiteralContext)_localctx).t = match(MAX_INTEGER);
				}
				break;
			case INTEGER_LITERAL:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1725); 
				((IntegerLiteralContext)_localctx).t = match(INTEGER_LITERAL);
				}
				break;
			case HEXA_LITERAL:
				_localctx = new HexadecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1726); 
				((HexadecimalLiteralContext)_localctx).t = match(HEXA_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new CharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1727); 
				((CharacterLiteralContext)_localctx).t = match(CHAR_LITERAL);
				}
				break;
			case DATE_LITERAL:
				_localctx = new DateLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1728); 
				((DateLiteralContext)_localctx).t = match(DATE_LITERAL);
				}
				break;
			case TIME_LITERAL:
				_localctx = new TimeLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1729); 
				((TimeLiteralContext)_localctx).t = match(TIME_LITERAL);
				}
				break;
			case TEXT_LITERAL:
				_localctx = new TextLiteralContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1730); 
				((TextLiteralContext)_localctx).t = match(TEXT_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1731); 
				((DecimalLiteralContext)_localctx).t = match(DECIMAL_LITERAL);
				}
				break;
			case DATETIME_LITERAL:
				_localctx = new DateTimeLiteralContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1732); 
				((DateTimeLiteralContext)_localctx).t = match(DATETIME_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(1733); 
				((BooleanLiteralContext)_localctx).t = match(BOOLEAN_LITERAL);
				}
				break;
			case PERIOD_LITERAL:
				_localctx = new PeriodLiteralContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(1734); 
				((PeriodLiteralContext)_localctx).t = match(PERIOD_LITERAL);
				}
				break;
			case VERSION_LITERAL:
				_localctx = new VersionLiteralContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(1735); 
				((VersionLiteralContext)_localctx).t = match(VERSION_LITERAL);
				}
				break;
			case UUID_LITERAL:
				_localctx = new UUIDLiteralContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(1736); 
				((UUIDLiteralContext)_localctx).t = match(UUID_LITERAL);
				}
				break;
			case NONE:
				_localctx = new NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(1737); 
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
		enterRule(_localctx, 248, RULE_literal_list_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1740); 
			atomic_literal();
			setState(1745);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1741); 
				match(COMMA);
				setState(1742); 
				atomic_literal();
				}
				}
				setState(1747);
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
		enterRule(_localctx, 250, RULE_selectable_expression);
		try {
			setState(1752);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				_localctx = new ParenthesisExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1748); 
				((ParenthesisExpressionContext)_localctx).exp = parenthesis_expression();
				}
				break;
			case 2:
				_localctx = new LiteralExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1749); 
				((LiteralExpressionContext)_localctx).exp = literal_expression();
				}
				break;
			case 3:
				_localctx = new IdentifierExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1750); 
				((IdentifierExpressionContext)_localctx).exp = identifier();
				}
				break;
			case 4:
				_localctx = new ThisExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1751); 
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
		enterRule(_localctx, 252, RULE_this_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1754);
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
		enterRule(_localctx, 254, RULE_parenthesis_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1756); 
			match(LPAR);
			setState(1757); 
			expression(0);
			setState(1758); 
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
		enterRule(_localctx, 256, RULE_literal_expression);
		try {
			setState(1762);
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
				setState(1760); 
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
				setState(1761); 
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
		enterRule(_localctx, 258, RULE_collection_literal);
		try {
			setState(1769);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1764); 
				range_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1765); 
				list_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1766); 
				set_literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1767); 
				dict_literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1768); 
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
		enterRule(_localctx, 260, RULE_tuple_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1772);
			_la = _input.LA(1);
			if (_la==MUTABLE) {
				{
				setState(1771); 
				match(MUTABLE);
				}
			}

			setState(1774); 
			match(LPAR);
			setState(1776);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (EXECUTE - 99)) | (1L << (FETCH - 99)) | (1L << (MUTABLE - 99)) | (1L << (NONE - 99)) | (1L << (NOT - 99)) | (1L << (READ - 99)) | (1L << (SELF - 99)) | (1L << (SORTED - 99)) | (1L << (THIS - 99)) | (1L << (BOOLEAN_LITERAL - 99)) | (1L << (CHAR_LITERAL - 99)) | (1L << (MIN_INTEGER - 99)) | (1L << (MAX_INTEGER - 99)) | (1L << (SYMBOL_IDENTIFIER - 99)) | (1L << (TYPE_IDENTIFIER - 99)))) != 0) || ((((_la - 163)) & ~0x3f) == 0 && ((1L << (_la - 163)) & ((1L << (VARIABLE_IDENTIFIER - 163)) | (1L << (TEXT_LITERAL - 163)) | (1L << (UUID_LITERAL - 163)) | (1L << (INTEGER_LITERAL - 163)) | (1L << (HEXA_LITERAL - 163)) | (1L << (DECIMAL_LITERAL - 163)) | (1L << (DATETIME_LITERAL - 163)) | (1L << (TIME_LITERAL - 163)) | (1L << (DATE_LITERAL - 163)) | (1L << (PERIOD_LITERAL - 163)) | (1L << (VERSION_LITERAL - 163)))) != 0)) {
				{
				setState(1775); 
				expression_tuple();
				}
			}

			setState(1778); 
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
		enterRule(_localctx, 262, RULE_dict_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1781);
			_la = _input.LA(1);
			if (_la==MUTABLE) {
				{
				setState(1780); 
				match(MUTABLE);
				}
			}

			setState(1783); 
			match(LCURL);
			setState(1785);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (EXECUTE - 99)) | (1L << (FETCH - 99)) | (1L << (MUTABLE - 99)) | (1L << (NONE - 99)) | (1L << (NOT - 99)) | (1L << (READ - 99)) | (1L << (SELF - 99)) | (1L << (SORTED - 99)) | (1L << (THIS - 99)) | (1L << (BOOLEAN_LITERAL - 99)) | (1L << (CHAR_LITERAL - 99)) | (1L << (MIN_INTEGER - 99)) | (1L << (MAX_INTEGER - 99)) | (1L << (SYMBOL_IDENTIFIER - 99)) | (1L << (TYPE_IDENTIFIER - 99)))) != 0) || ((((_la - 163)) & ~0x3f) == 0 && ((1L << (_la - 163)) & ((1L << (VARIABLE_IDENTIFIER - 163)) | (1L << (TEXT_LITERAL - 163)) | (1L << (UUID_LITERAL - 163)) | (1L << (INTEGER_LITERAL - 163)) | (1L << (HEXA_LITERAL - 163)) | (1L << (DECIMAL_LITERAL - 163)) | (1L << (DATETIME_LITERAL - 163)) | (1L << (TIME_LITERAL - 163)) | (1L << (DATE_LITERAL - 163)) | (1L << (PERIOD_LITERAL - 163)) | (1L << (VERSION_LITERAL - 163)))) != 0)) {
				{
				setState(1784); 
				dict_entry_list();
				}
			}

			setState(1787); 
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
		enterRule(_localctx, 264, RULE_expression_tuple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1789); 
			expression(0);
			setState(1790); 
			match(COMMA);
			setState(1799);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (EXECUTE - 99)) | (1L << (FETCH - 99)) | (1L << (MUTABLE - 99)) | (1L << (NONE - 99)) | (1L << (NOT - 99)) | (1L << (READ - 99)) | (1L << (SELF - 99)) | (1L << (SORTED - 99)) | (1L << (THIS - 99)) | (1L << (BOOLEAN_LITERAL - 99)) | (1L << (CHAR_LITERAL - 99)) | (1L << (MIN_INTEGER - 99)) | (1L << (MAX_INTEGER - 99)) | (1L << (SYMBOL_IDENTIFIER - 99)) | (1L << (TYPE_IDENTIFIER - 99)))) != 0) || ((((_la - 163)) & ~0x3f) == 0 && ((1L << (_la - 163)) & ((1L << (VARIABLE_IDENTIFIER - 163)) | (1L << (TEXT_LITERAL - 163)) | (1L << (UUID_LITERAL - 163)) | (1L << (INTEGER_LITERAL - 163)) | (1L << (HEXA_LITERAL - 163)) | (1L << (DECIMAL_LITERAL - 163)) | (1L << (DATETIME_LITERAL - 163)) | (1L << (TIME_LITERAL - 163)) | (1L << (DATE_LITERAL - 163)) | (1L << (PERIOD_LITERAL - 163)) | (1L << (VERSION_LITERAL - 163)))) != 0)) {
				{
				setState(1791); 
				expression(0);
				setState(1796);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1792); 
					match(COMMA);
					setState(1793); 
					expression(0);
					}
					}
					setState(1798);
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
		enterRule(_localctx, 266, RULE_dict_entry_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1801); 
			dict_entry();
			setState(1806);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1802); 
				match(COMMA);
				setState(1803); 
				dict_entry();
				}
				}
				setState(1808);
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
		enterRule(_localctx, 268, RULE_dict_entry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1809); 
			((Dict_entryContext)_localctx).key = expression(0);
			setState(1810); 
			match(COLON);
			setState(1811); 
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
		enterRule(_localctx, 270, RULE_slice_arguments);
		try {
			setState(1822);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				_localctx = new SliceFirstAndLastContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1813); 
				((SliceFirstAndLastContext)_localctx).first = expression(0);
				setState(1814); 
				match(COLON);
				setState(1815); 
				((SliceFirstAndLastContext)_localctx).last = expression(0);
				}
				break;
			case 2:
				_localctx = new SliceFirstOnlyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1817); 
				((SliceFirstOnlyContext)_localctx).first = expression(0);
				setState(1818); 
				match(COLON);
				}
				break;
			case 3:
				_localctx = new SliceLastOnlyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1820); 
				match(COLON);
				setState(1821); 
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
		enterRule(_localctx, 272, RULE_assign_variable_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1824); 
			variable_identifier();
			setState(1825); 
			assign();
			setState(1826); 
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
		int _startState = 274;
		enterRecursionRule(_localctx, 274, RULE_assignable_instance, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new RootInstanceContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1829); 
			variable_identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(1835);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ChildInstanceContext(new Assignable_instanceContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_assignable_instance);
					setState(1831);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1832); 
					child_instance();
					}
					} 
				}
				setState(1837);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
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
		enterRule(_localctx, 276, RULE_is_expression);
		try {
			setState(1842);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				_localctx = new IsATypeExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1838);
				if (!(this.willBeAOrAn())) throw new FailedPredicateException(this, "$parser.willBeAOrAn()");
				setState(1839); 
				match(VARIABLE_IDENTIFIER);
				setState(1840); 
				category_or_any_type();
				}
				break;
			case 2:
				_localctx = new IsOtherExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1841); 
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
		enterRule(_localctx, 278, RULE_read_all_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1844); 
			match(READ);
			setState(1845); 
			match(ALL);
			setState(1846); 
			match(FROM);
			setState(1847); 
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
		enterRule(_localctx, 280, RULE_read_one_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1849); 
			match(READ);
			setState(1850); 
			match(ONE);
			setState(1851); 
			match(FROM);
			setState(1852); 
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
		enterRule(_localctx, 282, RULE_order_by_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1854); 
			order_by();
			setState(1859);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1855); 
					match(COMMA);
					setState(1856); 
					order_by();
					}
					} 
				}
				setState(1861);
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
		enterRule(_localctx, 284, RULE_order_by);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1862); 
			variable_identifier();
			setState(1867);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1863); 
					match(DOT);
					setState(1864); 
					variable_identifier();
					}
					} 
				}
				setState(1869);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
			}
			setState(1871);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				{
				setState(1870);
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
		enterRule(_localctx, 286, RULE_operator);
		try {
			setState(1879);
			switch (_input.LA(1)) {
			case PLUS:
				_localctx = new OperatorPlusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1873); 
				match(PLUS);
				}
				break;
			case MINUS:
				_localctx = new OperatorMinusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1874); 
				match(MINUS);
				}
				break;
			case STAR:
				_localctx = new OperatorMultiplyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1875); 
				multiply();
				}
				break;
			case SLASH:
				_localctx = new OperatorDivideContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1876); 
				divide();
				}
				break;
			case BSLASH:
				_localctx = new OperatorIDivideContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1877); 
				idivide();
				}
				break;
			case PERCENT:
			case MODULO:
				_localctx = new OperatorModuloContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1878); 
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
		enterRule(_localctx, 288, RULE_new_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1881); 
			((New_tokenContext)_localctx).i1 = match(VARIABLE_IDENTIFIER);
			setState(1882);
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
		enterRule(_localctx, 290, RULE_key_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1884); 
			((Key_tokenContext)_localctx).i1 = match(VARIABLE_IDENTIFIER);
			setState(1885);
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
		enterRule(_localctx, 292, RULE_module_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1887); 
			((Module_tokenContext)_localctx).i1 = match(VARIABLE_IDENTIFIER);
			setState(1888);
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
		enterRule(_localctx, 294, RULE_value_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1890); 
			((Value_tokenContext)_localctx).i1 = match(VARIABLE_IDENTIFIER);
			setState(1891);
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
		enterRule(_localctx, 296, RULE_symbols_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1893); 
			((Symbols_tokenContext)_localctx).i1 = match(VARIABLE_IDENTIFIER);
			setState(1894);
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
		enterRule(_localctx, 298, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1896); 
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
		enterRule(_localctx, 300, RULE_multiply);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1898); 
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
		enterRule(_localctx, 302, RULE_divide);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1900); 
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
		enterRule(_localctx, 304, RULE_idivide);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1902); 
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
		enterRule(_localctx, 306, RULE_modulo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1904);
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
		enterRule(_localctx, 308, RULE_javascript_statement);
		try {
			setState(1913);
			switch (_input.LA(1)) {
			case RETURN:
				_localctx = new JavascriptReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1906); 
				match(RETURN);
				setState(1907); 
				((JavascriptReturnStatementContext)_localctx).exp = javascript_expression(0);
				setState(1908); 
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
				setState(1910); 
				((JavascriptStatementContext)_localctx).exp = javascript_expression(0);
				setState(1911); 
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
		int _startState = 310;
		enterRecursionRule(_localctx, 310, RULE_javascript_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavascriptPrimaryExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1916); 
			((JavascriptPrimaryExpressionContext)_localctx).exp = javascript_primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(1922);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavascriptSelectorExpressionContext(new Javascript_expressionContext(_parentctx, _parentState));
					((JavascriptSelectorExpressionContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_javascript_expression);
					setState(1918);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1919); 
					((JavascriptSelectorExpressionContext)_localctx).child = javascript_selector_expression();
					}
					} 
				}
				setState(1924);
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
		enterRule(_localctx, 312, RULE_javascript_primary_expression);
		try {
			setState(1932);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1925); 
				javascript_this_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1926); 
				javascript_new_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1927); 
				javascript_parenthesis_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1928); 
				javascript_identifier_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1929); 
				javascript_literal_expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1930); 
				javascript_method_expression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1931); 
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
		enterRule(_localctx, 314, RULE_javascript_this_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1934); 
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
		enterRule(_localctx, 316, RULE_javascript_new_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1936); 
			new_token();
			setState(1937); 
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
		enterRule(_localctx, 318, RULE_javascript_selector_expression);
		try {
			setState(1944);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				_localctx = new JavaScriptMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1939); 
				match(DOT);
				setState(1940); 
				((JavaScriptMethodExpressionContext)_localctx).method = javascript_method_expression();
				}
				break;
			case 2:
				_localctx = new JavaScriptMemberExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1941); 
				match(DOT);
				setState(1942); 
				((JavaScriptMemberExpressionContext)_localctx).name = javascript_identifier();
				}
				break;
			case 3:
				_localctx = new JavaScriptItemExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1943); 
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
		enterRule(_localctx, 320, RULE_javascript_method_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1946); 
			((Javascript_method_expressionContext)_localctx).name = javascript_identifier();
			setState(1947); 
			match(LPAR);
			setState(1949);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (READ - 133)) | (1L << (SELF - 133)) | (1L << (TEST - 133)) | (1L << (THIS - 133)) | (1L << (WRITE - 133)) | (1L << (BOOLEAN_LITERAL - 133)) | (1L << (CHAR_LITERAL - 133)) | (1L << (SYMBOL_IDENTIFIER - 133)) | (1L << (TYPE_IDENTIFIER - 133)) | (1L << (VARIABLE_IDENTIFIER - 133)) | (1L << (DOLLAR_IDENTIFIER - 133)) | (1L << (TEXT_LITERAL - 133)) | (1L << (INTEGER_LITERAL - 133)) | (1L << (DECIMAL_LITERAL - 133)))) != 0)) {
				{
				setState(1948); 
				((Javascript_method_expressionContext)_localctx).args = javascript_arguments(0);
				}
			}

			setState(1951); 
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
		int _startState = 322;
		enterRecursionRule(_localctx, 322, RULE_javascript_arguments, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavascriptArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1954); 
			((JavascriptArgumentListContext)_localctx).item = javascript_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1961);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,154,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavascriptArgumentListItemContext(new Javascript_argumentsContext(_parentctx, _parentState));
					((JavascriptArgumentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_javascript_arguments);
					setState(1956);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1957); 
					match(COMMA);
					setState(1958); 
					((JavascriptArgumentListItemContext)_localctx).item = javascript_expression(0);
					}
					} 
				}
				setState(1963);
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
		enterRule(_localctx, 324, RULE_javascript_item_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1964); 
			match(LBRAK);
			setState(1965); 
			((Javascript_item_expressionContext)_localctx).exp = javascript_expression(0);
			setState(1966); 
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
		enterRule(_localctx, 326, RULE_javascript_parenthesis_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1968); 
			match(LPAR);
			setState(1969); 
			((Javascript_parenthesis_expressionContext)_localctx).exp = javascript_expression(0);
			setState(1970); 
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
		enterRule(_localctx, 328, RULE_javascript_identifier_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1972); 
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
		enterRule(_localctx, 330, RULE_javascript_literal_expression);
		try {
			setState(1979);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				_localctx = new JavascriptIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1974); 
				((JavascriptIntegerLiteralContext)_localctx).t = match(INTEGER_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				_localctx = new JavascriptDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1975); 
				((JavascriptDecimalLiteralContext)_localctx).t = match(DECIMAL_LITERAL);
				}
				break;
			case TEXT_LITERAL:
				_localctx = new JavascriptTextLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1976); 
				((JavascriptTextLiteralContext)_localctx).t = match(TEXT_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new JavascriptBooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1977); 
				((JavascriptBooleanLiteralContext)_localctx).t = match(BOOLEAN_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new JavascriptCharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1978); 
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
		public TerminalNode READ() { return getToken(MParser.READ, 0); }
		public TerminalNode WRITE() { return getToken(MParser.WRITE, 0); }
		public TerminalNode TEST() { return getToken(MParser.TEST, 0); }
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
		enterRule(_localctx, 332, RULE_javascript_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1981);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (READ - 133)) | (1L << (TEST - 133)) | (1L << (WRITE - 133)) | (1L << (SYMBOL_IDENTIFIER - 133)) | (1L << (TYPE_IDENTIFIER - 133)) | (1L << (VARIABLE_IDENTIFIER - 133)) | (1L << (DOLLAR_IDENTIFIER - 133)))) != 0)) ) {
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
		enterRule(_localctx, 334, RULE_python_statement);
		try {
			setState(1986);
			switch (_input.LA(1)) {
			case RETURN:
				_localctx = new PythonReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1983); 
				match(RETURN);
				setState(1984); 
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
				setState(1985); 
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
		int _startState = 336;
		enterRecursionRule(_localctx, 336, RULE_python_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PythonPrimaryExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1989); 
			((PythonPrimaryExpressionContext)_localctx).exp = python_primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(1995);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PythonSelectorExpressionContext(new Python_expressionContext(_parentctx, _parentState));
					((PythonSelectorExpressionContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_python_expression);
					setState(1991);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1992); 
					((PythonSelectorExpressionContext)_localctx).child = python_selector_expression();
					}
					} 
				}
				setState(1997);
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
		enterRule(_localctx, 338, RULE_python_primary_expression);
		try {
			setState(2003);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				_localctx = new PythonSelfExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1998); 
				((PythonSelfExpressionContext)_localctx).exp = python_self_expression();
				}
				break;
			case 2:
				_localctx = new PythonParenthesisExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1999); 
				((PythonParenthesisExpressionContext)_localctx).exp = python_parenthesis_expression();
				}
				break;
			case 3:
				_localctx = new PythonIdentifierExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2000); 
				((PythonIdentifierExpressionContext)_localctx).exp = python_identifier_expression(0);
				}
				break;
			case 4:
				_localctx = new PythonLiteralExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2001); 
				((PythonLiteralExpressionContext)_localctx).exp = python_literal_expression();
				}
				break;
			case 5:
				_localctx = new PythonGlobalMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2002); 
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
		enterRule(_localctx, 340, RULE_python_self_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2005); 
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
		enterRule(_localctx, 342, RULE_python_selector_expression);
		try {
			setState(2013);
			switch (_input.LA(1)) {
			case DOT:
				_localctx = new PythonMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2007); 
				match(DOT);
				setState(2008); 
				((PythonMethodExpressionContext)_localctx).exp = python_method_expression();
				}
				break;
			case LBRAK:
				_localctx = new PythonItemExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2009); 
				match(LBRAK);
				setState(2010); 
				((PythonItemExpressionContext)_localctx).exp = python_expression(0);
				setState(2011); 
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
		enterRule(_localctx, 344, RULE_python_method_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2015); 
			((Python_method_expressionContext)_localctx).name = python_identifier();
			setState(2016); 
			match(LPAR);
			setState(2018);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (READ - 133)) | (1L << (SELF - 133)) | (1L << (TEST - 133)) | (1L << (THIS - 133)) | (1L << (WRITE - 133)) | (1L << (BOOLEAN_LITERAL - 133)) | (1L << (CHAR_LITERAL - 133)) | (1L << (SYMBOL_IDENTIFIER - 133)) | (1L << (TYPE_IDENTIFIER - 133)) | (1L << (VARIABLE_IDENTIFIER - 133)) | (1L << (DOLLAR_IDENTIFIER - 133)) | (1L << (TEXT_LITERAL - 133)) | (1L << (INTEGER_LITERAL - 133)) | (1L << (DECIMAL_LITERAL - 133)))) != 0)) {
				{
				setState(2017); 
				((Python_method_expressionContext)_localctx).args = python_argument_list();
				}
			}

			setState(2020); 
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
		enterRule(_localctx, 346, RULE_python_argument_list);
		try {
			setState(2028);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				_localctx = new PythonOrdinalOnlyArgumentListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2022); 
				((PythonOrdinalOnlyArgumentListContext)_localctx).ordinal = python_ordinal_argument_list(0);
				}
				break;
			case 2:
				_localctx = new PythonNamedOnlyArgumentListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2023); 
				((PythonNamedOnlyArgumentListContext)_localctx).named = python_named_argument_list(0);
				}
				break;
			case 3:
				_localctx = new PythonArgumentListContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2024); 
				((PythonArgumentListContext)_localctx).ordinal = python_ordinal_argument_list(0);
				setState(2025); 
				match(COMMA);
				setState(2026); 
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
		int _startState = 348;
		enterRecursionRule(_localctx, 348, RULE_python_ordinal_argument_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PythonOrdinalArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2031); 
			((PythonOrdinalArgumentListContext)_localctx).item = python_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2038);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PythonOrdinalArgumentListItemContext(new Python_ordinal_argument_listContext(_parentctx, _parentState));
					((PythonOrdinalArgumentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_python_ordinal_argument_list);
					setState(2033);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2034); 
					match(COMMA);
					setState(2035); 
					((PythonOrdinalArgumentListItemContext)_localctx).item = python_expression(0);
					}
					} 
				}
				setState(2040);
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
		int _startState = 350;
		enterRecursionRule(_localctx, 350, RULE_python_named_argument_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PythonNamedArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2042); 
			((PythonNamedArgumentListContext)_localctx).name = python_identifier();
			setState(2043); 
			match(EQ);
			setState(2044); 
			((PythonNamedArgumentListContext)_localctx).exp = python_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2054);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,163,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PythonNamedArgumentListItemContext(new Python_named_argument_listContext(_parentctx, _parentState));
					((PythonNamedArgumentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_python_named_argument_list);
					setState(2046);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2047); 
					match(COMMA);
					setState(2048); 
					((PythonNamedArgumentListItemContext)_localctx).name = python_identifier();
					setState(2049); 
					match(EQ);
					setState(2050); 
					((PythonNamedArgumentListItemContext)_localctx).exp = python_expression(0);
					}
					} 
				}
				setState(2056);
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
		enterRule(_localctx, 352, RULE_python_parenthesis_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2057); 
			match(LPAR);
			setState(2058); 
			((Python_parenthesis_expressionContext)_localctx).exp = python_expression(0);
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
		int _startState = 354;
		enterRecursionRule(_localctx, 354, RULE_python_identifier_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2064);
			switch (_input.LA(1)) {
			case DOLLAR_IDENTIFIER:
				{
				_localctx = new PythonPromptoIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2062); 
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
				setState(2063); 
				((PythonIdentifierContext)_localctx).name = python_identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(2071);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PythonChildIdentifierContext(new Python_identifier_expressionContext(_parentctx, _parentState));
					((PythonChildIdentifierContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_python_identifier_expression);
					setState(2066);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2067); 
					match(DOT);
					setState(2068); 
					((PythonChildIdentifierContext)_localctx).name = python_identifier();
					}
					} 
				}
				setState(2073);
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
		enterRule(_localctx, 356, RULE_python_literal_expression);
		try {
			setState(2079);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				_localctx = new PythonIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2074); 
				((PythonIntegerLiteralContext)_localctx).t = match(INTEGER_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				_localctx = new PythonDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2075); 
				((PythonDecimalLiteralContext)_localctx).t = match(DECIMAL_LITERAL);
				}
				break;
			case TEXT_LITERAL:
				_localctx = new PythonTextLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2076); 
				((PythonTextLiteralContext)_localctx).t = match(TEXT_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new PythonBooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2077); 
				((PythonBooleanLiteralContext)_localctx).t = match(BOOLEAN_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new PythonCharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2078); 
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
		public TerminalNode READ() { return getToken(MParser.READ, 0); }
		public TerminalNode WRITE() { return getToken(MParser.WRITE, 0); }
		public TerminalNode TEST() { return getToken(MParser.TEST, 0); }
		public TerminalNode SELF() { return getToken(MParser.SELF, 0); }
		public TerminalNode THIS() { return getToken(MParser.THIS, 0); }
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
		enterRule(_localctx, 358, RULE_python_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2081);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (READ - 133)) | (1L << (SELF - 133)) | (1L << (TEST - 133)) | (1L << (THIS - 133)) | (1L << (WRITE - 133)) | (1L << (SYMBOL_IDENTIFIER - 133)) | (1L << (TYPE_IDENTIFIER - 133)) | (1L << (VARIABLE_IDENTIFIER - 133)))) != 0)) ) {
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
		enterRule(_localctx, 360, RULE_java_statement);
		try {
			setState(2090);
			switch (_input.LA(1)) {
			case RETURN:
				_localctx = new JavaReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2083); 
				match(RETURN);
				setState(2084); 
				((JavaReturnStatementContext)_localctx).exp = java_expression(0);
				setState(2085); 
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
				setState(2087); 
				((JavaStatementContext)_localctx).exp = java_expression(0);
				setState(2088); 
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
		int _startState = 362;
		enterRecursionRule(_localctx, 362, RULE_java_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavaPrimaryExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2093); 
			((JavaPrimaryExpressionContext)_localctx).exp = java_primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(2099);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavaSelectorExpressionContext(new Java_expressionContext(_parentctx, _parentState));
					((JavaSelectorExpressionContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_java_expression);
					setState(2095);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2096); 
					((JavaSelectorExpressionContext)_localctx).child = java_selector_expression();
					}
					} 
				}
				setState(2101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
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
		enterRule(_localctx, 364, RULE_java_primary_expression);
		try {
			setState(2107);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2102); 
				java_this_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2103); 
				java_new_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2104); 
				java_parenthesis_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2105); 
				java_identifier_expression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2106); 
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
		enterRule(_localctx, 366, RULE_java_this_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2109); 
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
		enterRule(_localctx, 368, RULE_java_new_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2111); 
			new_token();
			setState(2112); 
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
		enterRule(_localctx, 370, RULE_java_selector_expression);
		try {
			setState(2117);
			switch (_input.LA(1)) {
			case DOT:
				_localctx = new JavaMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2114); 
				match(DOT);
				setState(2115); 
				((JavaMethodExpressionContext)_localctx).exp = java_method_expression();
				}
				break;
			case LBRAK:
				_localctx = new JavaItemExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2116); 
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
		enterRule(_localctx, 372, RULE_java_method_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2119); 
			((Java_method_expressionContext)_localctx).name = java_identifier();
			setState(2120); 
			match(LPAR);
			setState(2122);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (READ - 133)) | (1L << (SELF - 133)) | (1L << (TEST - 133)) | (1L << (THIS - 133)) | (1L << (WRITE - 133)) | (1L << (BOOLEAN_LITERAL - 133)) | (1L << (CHAR_LITERAL - 133)) | (1L << (SYMBOL_IDENTIFIER - 133)) | (1L << (TYPE_IDENTIFIER - 133)) | (1L << (VARIABLE_IDENTIFIER - 133)) | (1L << (NATIVE_IDENTIFIER - 133)) | (1L << (DOLLAR_IDENTIFIER - 133)) | (1L << (TEXT_LITERAL - 133)) | (1L << (INTEGER_LITERAL - 133)) | (1L << (DECIMAL_LITERAL - 133)))) != 0)) {
				{
				setState(2121); 
				((Java_method_expressionContext)_localctx).args = java_arguments(0);
				}
			}

			setState(2124); 
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
		int _startState = 374;
		enterRecursionRule(_localctx, 374, RULE_java_arguments, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavaArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2127); 
			((JavaArgumentListContext)_localctx).item = java_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2134);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavaArgumentListItemContext(new Java_argumentsContext(_parentctx, _parentState));
					((JavaArgumentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_java_arguments);
					setState(2129);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2130); 
					match(COMMA);
					setState(2131); 
					((JavaArgumentListItemContext)_localctx).item = java_expression(0);
					}
					} 
				}
				setState(2136);
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
		enterRule(_localctx, 376, RULE_java_item_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2137); 
			match(LBRAK);
			setState(2138); 
			((Java_item_expressionContext)_localctx).exp = java_expression(0);
			setState(2139); 
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
		enterRule(_localctx, 378, RULE_java_parenthesis_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2141); 
			match(LPAR);
			setState(2142); 
			((Java_parenthesis_expressionContext)_localctx).exp = java_expression(0);
			setState(2143); 
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
		int _startState = 380;
		enterRecursionRule(_localctx, 380, RULE_java_identifier_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavaIdentifierContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2146); 
			((JavaIdentifierContext)_localctx).name = java_identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(2153);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavaChildIdentifierContext(new Java_identifier_expressionContext(_parentctx, _parentState));
					((JavaChildIdentifierContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_java_identifier_expression);
					setState(2148);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2149); 
					match(DOT);
					setState(2150); 
					((JavaChildIdentifierContext)_localctx).name = java_identifier();
					}
					} 
				}
				setState(2155);
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
		int _startState = 382;
		enterRecursionRule(_localctx, 382, RULE_java_class_identifier_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavaClassIdentifierContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2157); 
			((JavaClassIdentifierContext)_localctx).klass = java_identifier_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2163);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,174,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavaChildClassIdentifierContext(new Java_class_identifier_expressionContext(_parentctx, _parentState));
					((JavaChildClassIdentifierContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_java_class_identifier_expression);
					setState(2159);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2160); 
					((JavaChildClassIdentifierContext)_localctx).name = match(DOLLAR_IDENTIFIER);
					}
					} 
				}
				setState(2165);
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
		enterRule(_localctx, 384, RULE_java_literal_expression);
		try {
			setState(2171);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				_localctx = new JavaIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2166); 
				((JavaIntegerLiteralContext)_localctx).t = match(INTEGER_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				_localctx = new JavaDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2167); 
				((JavaDecimalLiteralContext)_localctx).t = match(DECIMAL_LITERAL);
				}
				break;
			case TEXT_LITERAL:
				_localctx = new JavaTextLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2168); 
				((JavaTextLiteralContext)_localctx).t = match(TEXT_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new JavaBooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2169); 
				((JavaBooleanLiteralContext)_localctx).t = match(BOOLEAN_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new JavaCharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2170); 
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
		public TerminalNode READ() { return getToken(MParser.READ, 0); }
		public TerminalNode WRITE() { return getToken(MParser.WRITE, 0); }
		public TerminalNode TEST() { return getToken(MParser.TEST, 0); }
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
		enterRule(_localctx, 386, RULE_java_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2173);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (READ - 133)) | (1L << (TEST - 133)) | (1L << (WRITE - 133)) | (1L << (SYMBOL_IDENTIFIER - 133)) | (1L << (TYPE_IDENTIFIER - 133)) | (1L << (VARIABLE_IDENTIFIER - 133)) | (1L << (NATIVE_IDENTIFIER - 133)) | (1L << (DOLLAR_IDENTIFIER - 133)))) != 0)) ) {
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
		enterRule(_localctx, 388, RULE_csharp_statement);
		try {
			setState(2182);
			switch (_input.LA(1)) {
			case RETURN:
				_localctx = new CSharpReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2175); 
				match(RETURN);
				setState(2176); 
				((CSharpReturnStatementContext)_localctx).exp = csharp_expression(0);
				setState(2177); 
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
				setState(2179); 
				((CSharpStatementContext)_localctx).exp = csharp_expression(0);
				setState(2180); 
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
		int _startState = 390;
		enterRecursionRule(_localctx, 390, RULE_csharp_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new CSharpPrimaryExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2185); 
			((CSharpPrimaryExpressionContext)_localctx).exp = csharp_primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(2191);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CSharpSelectorExpressionContext(new Csharp_expressionContext(_parentctx, _parentState));
					((CSharpSelectorExpressionContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_csharp_expression);
					setState(2187);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2188); 
					((CSharpSelectorExpressionContext)_localctx).child = csharp_selector_expression();
					}
					} 
				}
				setState(2193);
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
		enterRule(_localctx, 392, RULE_csharp_primary_expression);
		try {
			setState(2199);
			switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2194); 
				csharp_this_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2195); 
				csharp_new_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2196); 
				csharp_parenthesis_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2197); 
				csharp_identifier_expression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2198); 
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
		enterRule(_localctx, 394, RULE_csharp_this_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2201); 
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
		enterRule(_localctx, 396, RULE_csharp_new_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2203); 
			new_token();
			setState(2204); 
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
		enterRule(_localctx, 398, RULE_csharp_selector_expression);
		try {
			setState(2209);
			switch (_input.LA(1)) {
			case DOT:
				_localctx = new CSharpMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2206); 
				match(DOT);
				setState(2207); 
				((CSharpMethodExpressionContext)_localctx).exp = csharp_method_expression();
				}
				break;
			case LBRAK:
				_localctx = new CSharpItemExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2208); 
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
		enterRule(_localctx, 400, RULE_csharp_method_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2211); 
			((Csharp_method_expressionContext)_localctx).name = csharp_identifier();
			setState(2212); 
			match(LPAR);
			setState(2214);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (READ - 133)) | (1L << (SELF - 133)) | (1L << (TEST - 133)) | (1L << (THIS - 133)) | (1L << (WRITE - 133)) | (1L << (BOOLEAN_LITERAL - 133)) | (1L << (CHAR_LITERAL - 133)) | (1L << (SYMBOL_IDENTIFIER - 133)) | (1L << (TYPE_IDENTIFIER - 133)) | (1L << (VARIABLE_IDENTIFIER - 133)) | (1L << (DOLLAR_IDENTIFIER - 133)) | (1L << (TEXT_LITERAL - 133)) | (1L << (INTEGER_LITERAL - 133)) | (1L << (DECIMAL_LITERAL - 133)))) != 0)) {
				{
				setState(2213); 
				((Csharp_method_expressionContext)_localctx).args = csharp_arguments(0);
				}
			}

			setState(2216); 
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
		int _startState = 402;
		enterRecursionRule(_localctx, 402, RULE_csharp_arguments, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new CSharpArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2219); 
			((CSharpArgumentListContext)_localctx).item = csharp_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2226);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CSharpArgumentListItemContext(new Csharp_argumentsContext(_parentctx, _parentState));
					((CSharpArgumentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_csharp_arguments);
					setState(2221);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2222); 
					match(COMMA);
					setState(2223); 
					((CSharpArgumentListItemContext)_localctx).item = csharp_expression(0);
					}
					} 
				}
				setState(2228);
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
		enterRule(_localctx, 404, RULE_csharp_item_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2229); 
			match(LBRAK);
			setState(2230); 
			((Csharp_item_expressionContext)_localctx).exp = csharp_expression(0);
			setState(2231); 
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
		enterRule(_localctx, 406, RULE_csharp_parenthesis_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2233); 
			match(LPAR);
			setState(2234); 
			((Csharp_parenthesis_expressionContext)_localctx).exp = csharp_expression(0);
			setState(2235); 
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
		int _startState = 408;
		enterRecursionRule(_localctx, 408, RULE_csharp_identifier_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2240);
			switch (_input.LA(1)) {
			case DOLLAR_IDENTIFIER:
				{
				_localctx = new CSharpPromptoIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2238); 
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
				setState(2239); 
				((CSharpIdentifierContext)_localctx).name = csharp_identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(2247);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,183,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CSharpChildIdentifierContext(new Csharp_identifier_expressionContext(_parentctx, _parentState));
					((CSharpChildIdentifierContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_csharp_identifier_expression);
					setState(2242);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2243); 
					match(DOT);
					setState(2244); 
					((CSharpChildIdentifierContext)_localctx).name = csharp_identifier();
					}
					} 
				}
				setState(2249);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,183,_ctx);
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
		enterRule(_localctx, 410, RULE_csharp_literal_expression);
		try {
			setState(2255);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				_localctx = new CSharpIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2250); 
				match(INTEGER_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				_localctx = new CSharpDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2251); 
				match(DECIMAL_LITERAL);
				}
				break;
			case TEXT_LITERAL:
				_localctx = new CSharpTextLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2252); 
				match(TEXT_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new CSharpBooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2253); 
				match(BOOLEAN_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new CSharpCharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2254); 
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
		public TerminalNode READ() { return getToken(MParser.READ, 0); }
		public TerminalNode WRITE() { return getToken(MParser.WRITE, 0); }
		public TerminalNode TEST() { return getToken(MParser.TEST, 0); }
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
		enterRule(_localctx, 412, RULE_csharp_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2257);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (READ - 133)) | (1L << (TEST - 133)) | (1L << (WRITE - 133)) | (1L << (SYMBOL_IDENTIFIER - 133)) | (1L << (TYPE_IDENTIFIER - 133)) | (1L << (VARIABLE_IDENTIFIER - 133)))) != 0)) ) {
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
		case 17: 
			return native_category_binding_list_sempred((Native_category_binding_listContext)_localctx, predIndex);
		case 29: 
			return callable_parent_sempred((Callable_parentContext)_localctx, predIndex);
		case 39: 
			return else_if_statement_list_sempred((Else_if_statement_listContext)_localctx, predIndex);
		case 45: 
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 47: 
			return instance_expression_sempred((Instance_expressionContext)_localctx, predIndex);
		case 49: 
			return instance_selector_sempred((Instance_selectorContext)_localctx, predIndex);
		case 53: 
			return argument_assignment_list_sempred((Argument_assignment_listContext)_localctx, predIndex);
		case 60: 
			return child_instance_sempred((Child_instanceContext)_localctx, predIndex);
		case 80: 
			return typedef_sempred((TypedefContext)_localctx, predIndex);
		case 100: 
			return any_type_sempred((Any_typeContext)_localctx, predIndex);
		case 137: 
			return assignable_instance_sempred((Assignable_instanceContext)_localctx, predIndex);
		case 138: 
			return is_expression_sempred((Is_expressionContext)_localctx, predIndex);
		case 144: 
			return new_token_sempred((New_tokenContext)_localctx, predIndex);
		case 145: 
			return key_token_sempred((Key_tokenContext)_localctx, predIndex);
		case 146: 
			return module_token_sempred((Module_tokenContext)_localctx, predIndex);
		case 147: 
			return value_token_sempred((Value_tokenContext)_localctx, predIndex);
		case 148: 
			return symbols_token_sempred((Symbols_tokenContext)_localctx, predIndex);
		case 155: 
			return javascript_expression_sempred((Javascript_expressionContext)_localctx, predIndex);
		case 161: 
			return javascript_arguments_sempred((Javascript_argumentsContext)_localctx, predIndex);
		case 168: 
			return python_expression_sempred((Python_expressionContext)_localctx, predIndex);
		case 174: 
			return python_ordinal_argument_list_sempred((Python_ordinal_argument_listContext)_localctx, predIndex);
		case 175: 
			return python_named_argument_list_sempred((Python_named_argument_listContext)_localctx, predIndex);
		case 177: 
			return python_identifier_expression_sempred((Python_identifier_expressionContext)_localctx, predIndex);
		case 181: 
			return java_expression_sempred((Java_expressionContext)_localctx, predIndex);
		case 187: 
			return java_arguments_sempred((Java_argumentsContext)_localctx, predIndex);
		case 190: 
			return java_identifier_expression_sempred((Java_identifier_expressionContext)_localctx, predIndex);
		case 191: 
			return java_class_identifier_expression_sempred((Java_class_identifier_expressionContext)_localctx, predIndex);
		case 195: 
			return csharp_expression_sempred((Csharp_expressionContext)_localctx, predIndex);
		case 201: 
			return csharp_arguments_sempred((Csharp_argumentsContext)_localctx, predIndex);
		case 204: 
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
			return precpred(_ctx, 25);
		case 9: 
			return precpred(_ctx, 24);
		case 10: 
			return precpred(_ctx, 23);
		case 11: 
			return precpred(_ctx, 22);
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
			return precpred(_ctx, 12);
		case 19: 
			return precpred(_ctx, 11);
		case 20: 
			return precpred(_ctx, 10);
		case 21: 
			return precpred(_ctx, 9);
		case 22: 
			return precpred(_ctx, 8);
		case 23: 
			return precpred(_ctx, 7);
		case 24: 
			return precpred(_ctx, 6);
		case 25: 
			return precpred(_ctx, 5);
		case 26: 
			return precpred(_ctx, 1);
		case 27: 
			return precpred(_ctx, 34);
		case 28: 
			return precpred(_ctx, 21);
		case 29: 
			return precpred(_ctx, 20);
		case 30: 
			return precpred(_ctx, 13);
		}
		return true;
	}
	private boolean instance_expression_sempred(Instance_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 31: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean instance_selector_sempred(Instance_selectorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 32: 
			return this.wasNot(MParser.WS);
		case 33: 
			return this.wasNot(MParser.WS);
		case 34: 
			return this.wasNot(MParser.WS);
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
	private boolean any_type_sempred(Any_typeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 42: 
			return precpred(_ctx, 2);
		case 43: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean assignable_instance_sempred(Assignable_instanceContext _localctx, int predIndex) {
		switch (predIndex) {
		case 44: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean is_expression_sempred(Is_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 45: 
			return this.willBeAOrAn();
		}
		return true;
	}
	private boolean new_token_sempred(New_tokenContext _localctx, int predIndex) {
		switch (predIndex) {
		case 46: 
			return this.isText(((New_tokenContext)_localctx).i1,"new");
		}
		return true;
	}
	private boolean key_token_sempred(Key_tokenContext _localctx, int predIndex) {
		switch (predIndex) {
		case 47: 
			return this.isText(((Key_tokenContext)_localctx).i1,"key");
		}
		return true;
	}
	private boolean module_token_sempred(Module_tokenContext _localctx, int predIndex) {
		switch (predIndex) {
		case 48: 
			return this.isText(((Module_tokenContext)_localctx).i1,"module");
		}
		return true;
	}
	private boolean value_token_sempred(Value_tokenContext _localctx, int predIndex) {
		switch (predIndex) {
		case 49: 
			return this.isText(((Value_tokenContext)_localctx).i1,"value");
		}
		return true;
	}
	private boolean symbols_token_sempred(Symbols_tokenContext _localctx, int predIndex) {
		switch (predIndex) {
		case 50: 
			return this.isText(((Symbols_tokenContext)_localctx).i1,"symbols");
		}
		return true;
	}
	private boolean javascript_expression_sempred(Javascript_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 51: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean javascript_arguments_sempred(Javascript_argumentsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 52: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean python_expression_sempred(Python_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 53: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean python_ordinal_argument_list_sempred(Python_ordinal_argument_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 54: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean python_named_argument_list_sempred(Python_named_argument_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 55: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean python_identifier_expression_sempred(Python_identifier_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 56: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean java_expression_sempred(Java_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 57: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean java_arguments_sempred(Java_argumentsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 58: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean java_identifier_expression_sempred(Java_identifier_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 59: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean java_class_identifier_expression_sempred(Java_class_identifier_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 60: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean csharp_expression_sempred(Csharp_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 61: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean csharp_arguments_sempred(Csharp_argumentsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 62: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean csharp_identifier_expression_sempred(Csharp_identifier_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 63: 
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u00b1\u08d6\4\2\t"+
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
		"\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\4\u00d0\t\u00d0\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\5\2\u01a7\n\2\3\2\5\2\u01aa\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\5\5\u01c3"+
		"\n\5\3\5\3\5\3\6\5\6\u01c8\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\5\6\u01d6\n\6\3\6\3\6\3\6\3\6\5\6\u01dc\n\6\5\6\u01de\n\6\5\6"+
		"\u01e0\n\6\3\6\3\6\3\7\3\7\3\7\5\7\u01e7\n\7\3\7\3\7\3\b\5\b\u01ec\n\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u01f7\n\b\3\b\3\b\3\b\3\b\3\b"+
		"\5\b\u01fe\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u020b\n"+
		"\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0219"+
		"\n\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\5\r\u022d\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\5\17\u0244\n\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\5\20\u024f\n\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u0256\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u025f\n\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\5\21\u0268\n\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\5\21\u0271\n\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0284"+
		"\n\23\f\23\16\23\u0287\13\23\3\24\3\24\3\24\3\24\3\24\5\24\u028e\n\24"+
		"\3\24\3\24\3\24\5\24\u0293\n\24\3\25\3\25\3\25\3\25\5\25\u0299\n\25\3"+
		"\25\3\25\3\25\5\25\u029e\n\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\5\26"+
		"\u02a7\n\26\3\26\3\26\3\26\5\26\u02ac\n\26\3\26\3\26\3\26\5\26\u02b1\n"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u02c9\n\27\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u02d4\n\31\3\31\3\31\5\31\u02d8"+
		"\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u02ed\n\32\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\5\34\u0307\n\34\3\35\3\35\3\35\5\35\u030c\n"+
		"\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\5\36\u0315\n\36\3\37\3\37\3\37"+
		"\3\37\3\37\7\37\u031c\n\37\f\37\16\37\u031f\13\37\3 \3 \3 \3 \3 \3 \5"+
		" \u0327\n \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0344\n#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\5$\u0357\n$\3%\3%\3%\3%\5%\u035d\n%\3%\3%\3%\3"+
		"%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\5(\u037f\n(\3(\3(\3(\3(\3(\3(\3(\5(\u0388\n(\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\7)\u039d\n)\f"+
		")\16)\u03a0\13)\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\5+\u03ad\n+\3+\3+\3+"+
		"\3+\3+\3+\3+\5+\u03b6\n+\3+\3+\3+\3+\3+\3+\3+\5+\u03bf\n+\3+\3+\3,\3,"+
		"\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u03d6\n,\3-\3-"+
		"\3.\3.\5.\u03dc\n.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/"+
		"\3/\5/\u03f0\n/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/"+
		"\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/"+
		"\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/"+
		"\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/"+
		"\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\7/\u0458\n/\f/\16/\u045b"+
		"\13/\3\60\3\60\3\61\3\61\3\61\3\61\3\61\7\61\u0464\n\61\f\61\16\61\u0467"+
		"\13\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u0471\n\62\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u0480"+
		"\n\63\3\64\3\64\3\64\5\64\u0485\n\64\3\64\3\64\3\65\3\65\3\65\5\65\u048c"+
		"\n\65\3\65\3\65\3\66\3\66\3\66\5\66\u0493\n\66\3\66\3\66\3\67\3\67\3\67"+
		"\3\67\3\67\5\67\u049c\n\67\3\67\3\67\3\67\7\67\u04a1\n\67\f\67\16\67\u04a4"+
		"\13\67\38\38\38\38\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3;\3;\3;\5;\u04b8"+
		"\n;\3;\3;\3;\3;\3;\3;\3;\3;\3;\5;\u04c3\n;\3;\3;\5;\u04c7\n;\3;\3;\3;"+
		"\5;\u04cc\n;\3;\3;\3;\5;\u04d1\n;\5;\u04d3\n;\3<\3<\5<\u04d7\n<\3<\3<"+
		"\3<\3<\3<\3<\3<\5<\u04e0\n<\3<\3<\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>"+
		"\5>\u04f0\n>\3?\3?\3?\3?\3@\7@\u04f7\n@\f@\16@\u04fa\13@\3A\6A\u04fd\n"+
		"A\rA\16A\u04fe\3B\6B\u0502\nB\rB\16B\u0503\3B\3B\3C\7C\u0509\nC\fC\16"+
		"C\u050c\13C\3C\3C\3D\3D\3E\5E\u0513\nE\3E\3E\3E\3F\3F\3F\3F\7F\u051c\n"+
		"F\fF\16F\u051f\13F\3G\3G\3G\7G\u0524\nG\fG\16G\u0527\13G\3G\3G\3G\3G\3"+
		"G\5G\u052e\nG\3H\3H\3I\3I\5I\u0534\nI\3J\3J\3J\3J\7J\u053a\nJ\fJ\16J\u053d"+
		"\13J\3K\3K\3K\3K\7K\u0543\nK\fK\16K\u0546\13K\3L\3L\3L\7L\u054b\nL\fL"+
		"\16L\u054e\13L\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\5M\u055a\nM\3N\5N\u055d\n"+
		"N\3N\3N\5N\u0561\nN\3N\3N\3O\5O\u0566\nO\3O\3O\5O\u056a\nO\3O\3O\3P\3"+
		"P\3P\7P\u0571\nP\fP\16P\u0574\13P\3Q\3Q\3Q\3Q\3Q\3Q\3R\3R\3R\3R\3R\3R"+
		"\3R\3R\3R\3R\3R\3R\5R\u0588\nR\3R\3R\3R\3R\3R\3R\3R\3R\7R\u0592\nR\fR"+
		"\16R\u0595\13R\3S\3S\5S\u0599\nS\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3"+
		"T\3T\3T\5T\u05aa\nT\3U\3U\3V\5V\u05af\nV\3V\3V\3W\3W\3X\3X\3X\5X\u05b8"+
		"\nX\3Y\3Y\3Y\7Y\u05bd\nY\fY\16Y\u05c0\13Y\3Z\3Z\5Z\u05c4\nZ\3[\3[\3[\5"+
		"[\u05c9\n[\3\\\3\\\3]\3]\3^\3^\3_\3_\3`\3`\3`\7`\u05d6\n`\f`\16`\u05d9"+
		"\13`\3a\3a\5a\u05dd\na\3a\5a\u05e0\na\3b\3b\5b\u05e4\nb\3c\3c\3c\5c\u05e9"+
		"\nc\3d\3d\3d\3e\3e\5e\u05f0\ne\3f\3f\3f\3f\3f\3f\3f\3f\3f\7f\u05fb\nf"+
		"\ff\16f\u05fe\13f\3g\3g\3g\3g\7g\u0604\ng\fg\16g\u0607\13g\3h\3h\3h\3"+
		"h\3h\5h\u060e\nh\3i\3i\3i\3i\7i\u0614\ni\fi\16i\u0617\13i\3j\3j\3j\5j"+
		"\u061c\nj\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\5k\u0628\nk\3l\3l\5l\u062c\nl"+
		"\3m\3m\3m\3m\3m\3m\7m\u0634\nm\fm\16m\u0637\13m\3n\3n\5n\u063b\nn\3o\3"+
		"o\3o\3o\5o\u0641\no\3o\3o\3o\7o\u0646\no\fo\16o\u0649\13o\3o\3o\5o\u064d"+
		"\no\3p\3p\3p\7p\u0652\np\fp\16p\u0655\13p\3q\3q\3q\7q\u065a\nq\fq\16q"+
		"\u065d\13q\3r\3r\3r\3r\5r\u0663\nr\3s\3s\3t\3t\3t\3t\7t\u066b\nt\ft\16"+
		"t\u066e\13t\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\5u\u067a\nu\3v\3v\5v\u067e\n"+
		"v\3v\5v\u0681\nv\3w\3w\5w\u0685\nw\3w\5w\u0688\nw\3x\3x\3x\3x\7x\u068e"+
		"\nx\fx\16x\u0691\13x\3y\3y\3y\3y\7y\u0697\ny\fy\16y\u069a\13y\3z\3z\3"+
		"z\3z\7z\u06a0\nz\fz\16z\u06a3\13z\3{\3{\3{\3{\7{\u06a9\n{\f{\16{\u06ac"+
		"\13{\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\5|\u06bc\n|\3}\3}\3}\3"+
		"}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\5}\u06cd\n}\3~\3~\3~\7~\u06d2\n~\f"+
		"~\16~\u06d5\13~\3\177\3\177\3\177\3\177\5\177\u06db\n\177\3\u0080\3\u0080"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0082\3\u0082\5\u0082\u06e5\n\u0082"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\5\u0083\u06ec\n\u0083\3\u0084"+
		"\5\u0084\u06ef\n\u0084\3\u0084\3\u0084\5\u0084\u06f3\n\u0084\3\u0084\3"+
		"\u0084\3\u0085\5\u0085\u06f8\n\u0085\3\u0085\3\u0085\5\u0085\u06fc\n\u0085"+
		"\3\u0085\3\u0085\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\7\u0086\u0705"+
		"\n\u0086\f\u0086\16\u0086\u0708\13\u0086\5\u0086\u070a\n\u0086\3\u0087"+
		"\3\u0087\3\u0087\7\u0087\u070f\n\u0087\f\u0087\16\u0087\u0712\13\u0087"+
		"\3\u0088\3\u0088\3\u0088\3\u0088\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089"+
		"\3\u0089\3\u0089\3\u0089\3\u0089\5\u0089\u0721\n\u0089\3\u008a\3\u008a"+
		"\3\u008a\3\u008a\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\7\u008b\u072c"+
		"\n\u008b\f\u008b\16\u008b\u072f\13\u008b\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\5\u008c\u0735\n\u008c\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008e"+
		"\3\u008e\3\u008e\3\u008e\3\u008e\3\u008f\3\u008f\3\u008f\7\u008f\u0744"+
		"\n\u008f\f\u008f\16\u008f\u0747\13\u008f\3\u0090\3\u0090\3\u0090\7\u0090"+
		"\u074c\n\u0090\f\u0090\16\u0090\u074f\13\u0090\3\u0090\5\u0090\u0752\n"+
		"\u0090\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\5\u0091\u075a\n"+
		"\u0091\3\u0092\3\u0092\3\u0092\3\u0093\3\u0093\3\u0093\3\u0094\3\u0094"+
		"\3\u0094\3\u0095\3\u0095\3\u0095\3\u0096\3\u0096\3\u0096\3\u0097\3\u0097"+
		"\3\u0098\3\u0098\3\u0099\3\u0099\3\u009a\3\u009a\3\u009b\3\u009b\3\u009c"+
		"\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\5\u009c\u077c\n\u009c"+
		"\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\7\u009d\u0783\n\u009d\f\u009d"+
		"\16\u009d\u0786\13\u009d\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e"+
		"\3\u009e\5\u009e\u078f\n\u009e\3\u009f\3\u009f\3\u00a0\3\u00a0\3\u00a0"+
		"\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\5\u00a1\u079b\n\u00a1\3\u00a2"+
		"\3\u00a2\3\u00a2\5\u00a2\u07a0\n\u00a2\3\u00a2\3\u00a2\3\u00a3\3\u00a3"+
		"\3\u00a3\3\u00a3\3\u00a3\3\u00a3\7\u00a3\u07aa\n\u00a3\f\u00a3\16\u00a3"+
		"\u07ad\13\u00a3\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a5\3\u00a5\3\u00a5"+
		"\3\u00a5\3\u00a6\3\u00a6\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\5\u00a7"+
		"\u07be\n\u00a7\3\u00a8\3\u00a8\3\u00a9\3\u00a9\3\u00a9\5\u00a9\u07c5\n"+
		"\u00a9\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\7\u00aa\u07cc\n\u00aa\f"+
		"\u00aa\16\u00aa\u07cf\13\u00aa\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab"+
		"\5\u00ab\u07d6\n\u00ab\3\u00ac\3\u00ac\3\u00ad\3\u00ad\3\u00ad\3\u00ad"+
		"\3\u00ad\3\u00ad\5\u00ad\u07e0\n\u00ad\3\u00ae\3\u00ae\3\u00ae\5\u00ae"+
		"\u07e5\n\u00ae\3\u00ae\3\u00ae\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af"+
		"\3\u00af\5\u00af\u07ef\n\u00af\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0"+
		"\3\u00b0\7\u00b0\u07f7\n\u00b0\f\u00b0\16\u00b0\u07fa\13\u00b0\3\u00b1"+
		"\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1"+
		"\3\u00b1\7\u00b1\u0807\n\u00b1\f\u00b1\16\u00b1\u080a\13\u00b1\3\u00b2"+
		"\3\u00b2\3\u00b2\3\u00b2\3\u00b3\3\u00b3\3\u00b3\5\u00b3\u0813\n\u00b3"+
		"\3\u00b3\3\u00b3\3\u00b3\7\u00b3\u0818\n\u00b3\f\u00b3\16\u00b3\u081b"+
		"\13\u00b3\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\5\u00b4\u0822\n\u00b4"+
		"\3\u00b5\3\u00b5\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6"+
		"\5\u00b6\u082d\n\u00b6\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\7\u00b7"+
		"\u0834\n\u00b7\f\u00b7\16\u00b7\u0837\13\u00b7\3\u00b8\3\u00b8\3\u00b8"+
		"\3\u00b8\3\u00b8\5\u00b8\u083e\n\u00b8\3\u00b9\3\u00b9\3\u00ba\3\u00ba"+
		"\3\u00ba\3\u00bb\3\u00bb\3\u00bb\5\u00bb\u0848\n\u00bb\3\u00bc\3\u00bc"+
		"\3\u00bc\5\u00bc\u084d\n\u00bc\3\u00bc\3\u00bc\3\u00bd\3\u00bd\3\u00bd"+
		"\3\u00bd\3\u00bd\3\u00bd\7\u00bd\u0857\n\u00bd\f\u00bd\16\u00bd\u085a"+
		"\13\u00bd\3\u00be\3\u00be\3\u00be\3\u00be\3\u00bf\3\u00bf\3\u00bf\3\u00bf"+
		"\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\7\u00c0\u086a\n\u00c0"+
		"\f\u00c0\16\u00c0\u086d\13\u00c0\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1"+
		"\7\u00c1\u0874\n\u00c1\f\u00c1\16\u00c1\u0877\13\u00c1\3\u00c2\3\u00c2"+
		"\3\u00c2\3\u00c2\3\u00c2\5\u00c2\u087e\n\u00c2\3\u00c3\3\u00c3\3\u00c4"+
		"\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\5\u00c4\u0889\n\u00c4"+
		"\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\7\u00c5\u0890\n\u00c5\f\u00c5"+
		"\16\u00c5\u0893\13\u00c5\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6"+
		"\u089a\n\u00c6\3\u00c7\3\u00c7\3\u00c8\3\u00c8\3\u00c8\3\u00c9\3\u00c9"+
		"\3\u00c9\5\u00c9\u08a4\n\u00c9\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u08a9\n"+
		"\u00ca\3\u00ca\3\u00ca\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb"+
		"\7\u00cb\u08b3\n\u00cb\f\u00cb\16\u00cb\u08b6\13\u00cb\3\u00cc\3\u00cc"+
		"\3\u00cc\3\u00cc\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00ce\3\u00ce\3\u00ce"+
		"\5\u00ce\u08c3\n\u00ce\3\u00ce\3\u00ce\3\u00ce\7\u00ce\u08c8\n\u00ce\f"+
		"\u00ce\16\u00ce\u08cb\13\u00ce\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf"+
		"\5\u00cf\u08d2\n\u00cf\3\u00d0\3\u00d0\3\u00d0\2\30$<P\\`l\u00a2\u00ca"+
		"\u0114\u0138\u0144\u0152\u015e\u0160\u0164\u016c\u0178\u017e\u0180\u0188"+
		"\u0194\u019a\u00d1\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6"+
		"\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce"+
		"\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6"+
		"\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe"+
		"\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116"+
		"\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e"+
		"\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146"+
		"\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c\u015e"+
		"\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e\u0170\u0172\u0174\u0176"+
		"\u0178\u017a\u017c\u017e\u0180\u0182\u0184\u0186\u0188\u018a\u018c\u018e"+
		"\u0190\u0192\u0194\u0196\u0198\u019a\u019c\u019e\2\f\3\2UV\3\2\"#\4\2"+
		"\u0091\u0091\u00a5\u00a5\4\2\u008d\u008d\u0095\u0095\4\2LL]]\4\2\'\'w"+
		"w\b\2\64=\u0087\u0087\u0094\u0094\u009e\u009e\u00a3\u00a5\u00a7\u00a7"+
		"\b\2\64=\u0087\u0087\u008d\u008d\u0094\u0095\u009e\u009e\u00a3\u00a5\7"+
		"\2\64=\u0087\u0087\u0094\u0094\u009e\u009e\u00a3\u00a7\7\2\64=\u0087\u0087"+
		"\u0094\u0094\u009e\u009e\u00a3\u00a5\u094f\2\u01a0\3\2\2\2\4\u01b1\3\2"+
		"\2\2\6\u01bb\3\2\2\2\b\u01bf\3\2\2\2\n\u01c7\3\2\2\2\f\u01e3\3\2\2\2\16"+
		"\u01eb\3\2\2\2\20\u0201\3\2\2\2\22\u020e\3\2\2\2\24\u0210\3\2\2\2\26\u021f"+
		"\3\2\2\2\30\u0229\3\2\2\2\32\u0236\3\2\2\2\34\u0240\3\2\2\2\36\u024e\3"+
		"\2\2\2 \u0262\3\2\2\2\"\u0274\3\2\2\2$\u027c\3\2\2\2&\u0288\3\2\2\2(\u0294"+
		"\3\2\2\2*\u02a4\3\2\2\2,\u02b7\3\2\2\2.\u02ca\3\2\2\2\60\u02cc\3\2\2\2"+
		"\62\u02ec\3\2\2\2\64\u02ee\3\2\2\2\66\u0306\3\2\2\28\u0308\3\2\2\2:\u0314"+
		"\3\2\2\2<\u0316\3\2\2\2>\u0326\3\2\2\2@\u0328\3\2\2\2B\u032f\3\2\2\2D"+
		"\u0336\3\2\2\2F\u0356\3\2\2\2H\u0358\3\2\2\2J\u0365\3\2\2\2L\u036e\3\2"+
		"\2\2N\u0375\3\2\2\2P\u0389\3\2\2\2R\u03a1\3\2\2\2T\u03a4\3\2\2\2V\u03d5"+
		"\3\2\2\2X\u03d7\3\2\2\2Z\u03d9\3\2\2\2\\\u03ef\3\2\2\2^\u045c\3\2\2\2"+
		"`\u045e\3\2\2\2b\u0470\3\2\2\2d\u047f\3\2\2\2f\u0481\3\2\2\2h\u0488\3"+
		"\2\2\2j\u048f\3\2\2\2l\u049b\3\2\2\2n\u04a5\3\2\2\2p\u04a9\3\2\2\2r\u04ae"+
		"\3\2\2\2t\u04d2\3\2\2\2v\u04d4\3\2\2\2x\u04e3\3\2\2\2z\u04ef\3\2\2\2|"+
		"\u04f1\3\2\2\2~\u04f8\3\2\2\2\u0080\u04fc\3\2\2\2\u0082\u0501\3\2\2\2"+
		"\u0084\u050a\3\2\2\2\u0086\u050f\3\2\2\2\u0088\u0512\3\2\2\2\u008a\u0517"+
		"\3\2\2\2\u008c\u0525\3\2\2\2\u008e\u052f\3\2\2\2\u0090\u0533\3\2\2\2\u0092"+
		"\u0535\3\2\2\2\u0094\u053e\3\2\2\2\u0096\u0547\3\2\2\2\u0098\u0559\3\2"+
		"\2\2\u009a\u055c\3\2\2\2\u009c\u0565\3\2\2\2\u009e\u056d\3\2\2\2\u00a0"+
		"\u0575\3\2\2\2\u00a2\u0587\3\2\2\2\u00a4\u0598\3\2\2\2\u00a6\u05a9\3\2"+
		"\2\2\u00a8\u05ab\3\2\2\2\u00aa\u05ae\3\2\2\2\u00ac\u05b2\3\2\2\2\u00ae"+
		"\u05b7\3\2\2\2\u00b0\u05b9\3\2\2\2\u00b2\u05c3\3\2\2\2\u00b4\u05c8\3\2"+
		"\2\2\u00b6\u05ca\3\2\2\2\u00b8\u05cc\3\2\2\2\u00ba\u05ce\3\2\2\2\u00bc"+
		"\u05d0\3\2\2\2\u00be\u05d2\3\2\2\2\u00c0\u05df\3\2\2\2\u00c2\u05e3\3\2"+
		"\2\2\u00c4\u05e5\3\2\2\2\u00c6\u05ea\3\2\2\2\u00c8\u05ef\3\2\2\2\u00ca"+
		"\u05f1\3\2\2\2\u00cc\u05ff\3\2\2\2\u00ce\u060d\3\2\2\2\u00d0\u060f\3\2"+
		"\2\2\u00d2\u061b\3\2\2\2\u00d4\u0627\3\2\2\2\u00d6\u0629\3\2\2\2\u00d8"+
		"\u062d\3\2\2\2\u00da\u0638\3\2\2\2\u00dc\u063c\3\2\2\2\u00de\u064e\3\2"+
		"\2\2\u00e0\u0656\3\2\2\2\u00e2\u0662\3\2\2\2\u00e4\u0664\3\2\2\2\u00e6"+
		"\u0666\3\2\2\2\u00e8\u0679\3\2\2\2\u00ea\u067b\3\2\2\2\u00ec\u0682\3\2"+
		"\2\2\u00ee\u0689\3\2\2\2\u00f0\u0692\3\2\2\2\u00f2\u069b\3\2\2\2\u00f4"+
		"\u06a4\3\2\2\2\u00f6\u06bb\3\2\2\2\u00f8\u06cc\3\2\2\2\u00fa\u06ce\3\2"+
		"\2\2\u00fc\u06da\3\2\2\2\u00fe\u06dc\3\2\2\2\u0100\u06de\3\2\2\2\u0102"+
		"\u06e4\3\2\2\2\u0104\u06eb\3\2\2\2\u0106\u06ee\3\2\2\2\u0108\u06f7\3\2"+
		"\2\2\u010a\u06ff\3\2\2\2\u010c\u070b\3\2\2\2\u010e\u0713\3\2\2\2\u0110"+
		"\u0720\3\2\2\2\u0112\u0722\3\2\2\2\u0114\u0726\3\2\2\2\u0116\u0734\3\2"+
		"\2\2\u0118\u0736\3\2\2\2\u011a\u073b\3\2\2\2\u011c\u0740\3\2\2\2\u011e"+
		"\u0748\3\2\2\2\u0120\u0759\3\2\2\2\u0122\u075b\3\2\2\2\u0124\u075e\3\2"+
		"\2\2\u0126\u0761\3\2\2\2\u0128\u0764\3\2\2\2\u012a\u0767\3\2\2\2\u012c"+
		"\u076a\3\2\2\2\u012e\u076c\3\2\2\2\u0130\u076e\3\2\2\2\u0132\u0770\3\2"+
		"\2\2\u0134\u0772\3\2\2\2\u0136\u077b\3\2\2\2\u0138\u077d\3\2\2\2\u013a"+
		"\u078e\3\2\2\2\u013c\u0790\3\2\2\2\u013e\u0792\3\2\2\2\u0140\u079a\3\2"+
		"\2\2\u0142\u079c\3\2\2\2\u0144\u07a3\3\2\2\2\u0146\u07ae\3\2\2\2\u0148"+
		"\u07b2\3\2\2\2\u014a\u07b6\3\2\2\2\u014c\u07bd\3\2\2\2\u014e\u07bf\3\2"+
		"\2\2\u0150\u07c4\3\2\2\2\u0152\u07c6\3\2\2\2\u0154\u07d5\3\2\2\2\u0156"+
		"\u07d7\3\2\2\2\u0158\u07df\3\2\2\2\u015a\u07e1\3\2\2\2\u015c\u07ee\3\2"+
		"\2\2\u015e\u07f0\3\2\2\2\u0160\u07fb\3\2\2\2\u0162\u080b\3\2\2\2\u0164"+
		"\u0812\3\2\2\2\u0166\u0821\3\2\2\2\u0168\u0823\3\2\2\2\u016a\u082c\3\2"+
		"\2\2\u016c\u082e\3\2\2\2\u016e\u083d\3\2\2\2\u0170\u083f\3\2\2\2\u0172"+
		"\u0841\3\2\2\2\u0174\u0847\3\2\2\2\u0176\u0849\3\2\2\2\u0178\u0850\3\2"+
		"\2\2\u017a\u085b\3\2\2\2\u017c\u085f\3\2\2\2\u017e\u0863\3\2\2\2\u0180"+
		"\u086e\3\2\2\2\u0182\u087d\3\2\2\2\u0184\u087f\3\2\2\2\u0186\u0888\3\2"+
		"\2\2\u0188\u088a\3\2\2\2\u018a\u0899\3\2\2\2\u018c\u089b\3\2\2\2\u018e"+
		"\u089d\3\2\2\2\u0190\u08a3\3\2\2\2\u0192\u08a5\3\2\2\2\u0194\u08ac\3\2"+
		"\2\2\u0196\u08b7\3\2\2\2\u0198\u08bb\3\2\2\2\u019a\u08c2\3\2\2\2\u019c"+
		"\u08d1\3\2\2\2\u019e\u08d3\3\2\2\2\u01a0\u01a1\7b\2\2\u01a1\u01a2\5\u00ba"+
		"^\2\u01a2\u01a9\7\26\2\2\u01a3\u01a6\5\u00ba^\2\u01a4\u01a5\7\23\2\2\u01a5"+
		"\u01a7\5\u00e0q\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01aa"+
		"\3\2\2\2\u01a8\u01aa\5\u00e0q\2\u01a9\u01a3\3\2\2\2\u01a9\u01a8\3\2\2"+
		"\2\u01aa\u01ab\3\2\2\2\u01ab\u01ac\7\27\2\2\u01ac\u01ad\7\21\2\2\u01ad"+
		"\u01ae\5\u0082B\2\u01ae\u01af\5\u0094K\2\u01af\u01b0\5\u0084C\2\u01b0"+
		"\3\3\2\2\2\u01b1\u01b2\7b\2\2\u01b2\u01b3\5\u00ba^\2\u01b3\u01b4\7\26"+
		"\2\2\u01b4\u01b5\5\u00a6T\2\u01b5\u01b6\7\27\2\2\u01b6\u01b7\7\21\2\2"+
		"\u01b7\u01b8\5\u0082B\2\u01b8\u01b9\5\u0092J\2\u01b9\u01ba\5\u0084C\2"+
		"\u01ba\5\3\2\2\2\u01bb\u01bc\5\u00bc_\2\u01bc\u01bd\7-\2\2\u01bd\u01be"+
		"\5\\/\2\u01be\7\3\2\2\2\u01bf\u01c0\5\u00bc_\2\u01c0\u01c2\7\26\2\2\u01c1"+
		"\u01c3\5l\67\2\u01c2\u01c1\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c4\3\2"+
		"\2\2\u01c4\u01c5\7\27\2\2\u01c5\t\3\2\2\2\u01c6\u01c8\7\u0091\2\2\u01c7"+
		"\u01c6\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01ca\7M"+
		"\2\2\u01ca\u01cb\5\u00b8]\2\u01cb\u01cc\7\26\2\2\u01cc\u01cd\5\u00a2R"+
		"\2\u01cd\u01ce\7\27\2\2\u01ce\u01cf\7\21\2\2\u01cf\u01df\5\u0082B\2\u01d0"+
		"\u01e0\7\u0085\2\2\u01d1\u01d5\5\u0098M\2\u01d2\u01d3\5\u0080A\2\u01d3"+
		"\u01d4\5\f\7\2\u01d4\u01d6\3\2\2\2\u01d5\u01d2\3\2\2\2\u01d5\u01d6\3\2"+
		"\2\2\u01d6\u01de\3\2\2\2\u01d7\u01db\5\f\7\2\u01d8\u01d9\5\u0080A\2\u01d9"+
		"\u01da\5\u0098M\2\u01da\u01dc\3\2\2\2\u01db\u01d8\3\2\2\2\u01db\u01dc"+
		"\3\2\2\2\u01dc\u01de\3\2\2\2\u01dd\u01d1\3\2\2\2\u01dd\u01d7\3\2\2\2\u01de"+
		"\u01e0\3\2\2\2\u01df\u01d0\3\2\2\2\u01df\u01dd\3\2\2\2\u01e0\u01e1\3\2"+
		"\2\2\u01e1\u01e2\5\u0084C\2\u01e2\13\3\2\2\2\u01e3\u01e4\7q\2\2\u01e4"+
		"\u01e6\7\26\2\2\u01e5\u01e7\5\u00dep\2\u01e6\u01e5\3\2\2\2\u01e6\u01e7"+
		"\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01e9\7\27\2\2\u01e9\r\3\2\2\2\u01ea"+
		"\u01ec\7\u0091\2\2\u01eb\u01ea\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ed"+
		"\3\2\2\2\u01ed\u01ee\t\2\2\2\u01ee\u01ef\5\u00ba^\2\u01ef\u01f6\7\26\2"+
		"\2\u01f0\u01f7\5\22\n\2\u01f1\u01f7\5\u00e0q\2\u01f2\u01f3\5\22\n\2\u01f3"+
		"\u01f4\7\23\2\2\u01f4\u01f5\5\u00e0q\2\u01f5\u01f7\3\2\2\2\u01f6\u01f0"+
		"\3\2\2\2\u01f6\u01f1\3\2\2\2\u01f6\u01f2\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8"+
		"\u01f9\7\27\2\2\u01f9\u01fa\7\21\2\2\u01fa\u01fd\5\u0082B\2\u01fb\u01fe"+
		"\5\u00ccg\2\u01fc\u01fe\7\u0085\2\2\u01fd\u01fb\3\2\2\2\u01fd\u01fc\3"+
		"\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0200\5\u0084C\2\u0200\17\3\2\2\2\u0201"+
		"\u0202\7\u008f\2\2\u0202\u0203\5\u00ba^\2\u0203\u0204\7\26\2\2\u0204\u0205"+
		"\5\u00e0q\2\u0205\u0206\7\27\2\2\u0206\u0207\7\21\2\2\u0207\u020a\5\u0082"+
		"B\2\u0208\u020b\5\u00ccg\2\u0209\u020b\7\u0085\2\2\u020a\u0208\3\2\2\2"+
		"\u020a\u0209\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020d\5\u0084C\2\u020d"+
		"\21\3\2\2\2\u020e\u020f\5\u00b0Y\2\u020f\23\3\2\2\2\u0210\u0211\7Y\2\2"+
		"\u0211\u0212\7\u0081\2\2\u0212\u0213\5\u0120\u0091\2\u0213\u0214\7\26"+
		"\2\2\u0214\u0215\5\u00c2b\2\u0215\u0218\7\27\2\2\u0216\u0217\7\63\2\2"+
		"\u0217\u0219\5\u00a2R\2\u0218\u0216\3\2\2\2\u0218\u0219\3\2\2\2\u0219"+
		"\u021a\3\2\2\2\u021a\u021b\7\21\2\2\u021b\u021c\5\u0082B\2\u021c\u021d"+
		"\5\u00eex\2\u021d\u021e\5\u0084C\2\u021e\25\3\2\2\2\u021f\u0220\7Y\2\2"+
		"\u0220\u0221\5\u00b6\\\2\u0221\u0222\7\u008e\2\2\u0222\u0223\7\26\2\2"+
		"\u0223\u0224\7\27\2\2\u0224\u0225\7\21\2\2\u0225\u0226\5\u0082B\2\u0226"+
		"\u0227\5\u00eex\2\u0227\u0228\5\u0084C\2\u0228\27\3\2\2\2\u0229\u022a"+
		"\7Y\2\2\u022a\u022c\5\u00b6\\\2\u022b\u022d\7y\2\2\u022c\u022b\3\2\2\2"+
		"\u022c\u022d\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u022f\7\u008e\2\2\u022f"+
		"\u0230\7\26\2\2\u0230\u0231\7\27\2\2\u0231\u0232\7\21\2\2\u0232\u0233"+
		"\5\u0082B\2\u0233\u0234\5\u00e6t\2\u0234\u0235\5\u0084C\2\u0235\31\3\2"+
		"\2\2\u0236\u0237\7Y\2\2\u0237\u0238\5\u00b6\\\2\u0238\u0239\7n\2\2\u0239"+
		"\u023a\7\26\2\2\u023a\u023b\7\27\2\2\u023b\u023c\7\21\2\2\u023c\u023d"+
		"\5\u0082B\2\u023d\u023e\5\u00eex\2\u023e\u023f\5\u0084C\2\u023f\33\3\2"+
		"\2\2\u0240\u0241\7Y\2\2\u0241\u0243\5\u00b6\\\2\u0242\u0244\7y\2\2\u0243"+
		"\u0242\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0246\7n"+
		"\2\2\u0246\u0247\7\26\2\2\u0247\u0248\7\27\2\2\u0248\u0249\7\21\2\2\u0249"+
		"\u024a\5\u0082B\2\u024a\u024b\5\u00e6t\2\u024b\u024c\5\u0084C\2\u024c"+
		"\35\3\2\2\2\u024d\u024f\7\u0091\2\2\u024e\u024d\3\2\2\2\u024e\u024f\3"+
		"\2\2\2\u024f\u0250\3\2\2\2\u0250\u0251\7y\2\2\u0251\u0252\t\2\2\2\u0252"+
		"\u0253\5\u00ba^\2\u0253\u0255\7\26\2\2\u0254\u0256\5\u00e0q\2\u0255\u0254"+
		"\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u0258\7\27\2\2"+
		"\u0258\u0259\7\21\2\2\u0259\u025a\5\u0082B\2\u025a\u025e\5\"\22\2\u025b"+
		"\u025c\5\u0080A\2\u025c\u025d\5\u00d0i\2\u025d\u025f\3\2\2\2\u025e\u025b"+
		"\3\2\2\2\u025e\u025f\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u0261\5\u0084C"+
		"\2\u0261\37\3\2\2\2\u0262\u0263\7y\2\2\u0263\u0264\7\u0089\2\2\u0264\u0265"+
		"\5\u00ba^\2\u0265\u0267\7\26\2\2\u0266\u0268\5\u00e0q\2\u0267\u0266\3"+
		"\2\2\2\u0267\u0268\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u026a\7\27\2\2\u026a"+
		"\u026b\7\21\2\2\u026b\u026c\5\u0082B\2\u026c\u0270\5\"\22\2\u026d\u026e"+
		"\5\u0080A\2\u026e\u026f\5\u00d0i\2\u026f\u0271\3\2\2\2\u0270\u026d\3\2"+
		"\2\2\u0270\u0271\3\2\2\2\u0271\u0272\3\2\2\2\u0272\u0273\5\u0084C\2\u0273"+
		"!\3\2\2\2\u0274\u0275\7Y\2\2\u0275\u0276\t\2\2\2\u0276\u0277\7P\2\2\u0277"+
		"\u0278\7\21\2\2\u0278\u0279\5\u0082B\2\u0279\u027a\5$\23\2\u027a\u027b"+
		"\5\u0084C\2\u027b#\3\2\2\2\u027c\u027d\b\23\1\2\u027d\u027e\5\u00d4k\2"+
		"\u027e\u0285\3\2\2\2\u027f\u0280\f\3\2\2\u0280\u0281\5\u0080A\2\u0281"+
		"\u0282\5\u00d4k\2\u0282\u0284\3\2\2\2\u0283\u027f\3\2\2\2\u0284\u0287"+
		"\3\2\2\2\u0285\u0283\3\2\2\2\u0285\u0286\3\2\2\2\u0286%\3\2\2\2\u0287"+
		"\u0285\3\2\2\2\u0288\u0289\7F\2\2\u0289\u028a\7Y\2\2\u028a\u028b\5\u00b2"+
		"Z\2\u028b\u028d\7\26\2\2\u028c\u028e\5\u00be`\2\u028d\u028c\3\2\2\2\u028d"+
		"\u028e\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u0292\7\27\2\2\u0290\u0291\7"+
		"\63\2\2\u0291\u0293\5\u00a2R\2\u0292\u0290\3\2\2\2\u0292\u0293\3\2\2\2"+
		"\u0293\'\3\2\2\2\u0294\u0295\7Y\2\2\u0295\u0296\5\u00b2Z\2\u0296\u0298"+
		"\7\26\2\2\u0297\u0299\5\u00be`\2\u0298\u0297\3\2\2\2\u0298\u0299\3\2\2"+
		"\2\u0299\u029a\3\2\2\2\u029a\u029d\7\27\2\2\u029b\u029c\7\63\2\2\u029c"+
		"\u029e\5\u00a2R\2\u029d\u029b\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u029f"+
		"\3\2\2\2\u029f\u02a0\7\21\2\2\u02a0\u02a1\5\u0082B\2\u02a1\u02a2\5\u00ee"+
		"x\2\u02a2\u02a3\5\u0084C\2\u02a3)\3\2\2\2\u02a4\u02a6\7Y\2\2\u02a5\u02a7"+
		"\7y\2\2\u02a6\u02a5\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8"+
		"\u02a9\5\u00b2Z\2\u02a9\u02ab\7\26\2\2\u02aa\u02ac\5\u00be`\2\u02ab\u02aa"+
		"\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\u02b0\7\27\2\2"+
		"\u02ae\u02af\7\63\2\2\u02af\u02b1\5\u00c8e\2\u02b0\u02ae\3\2\2\2\u02b0"+
		"\u02b1\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2\u02b3\7\21\2\2\u02b3\u02b4\5"+
		"\u0082B\2\u02b4\u02b5\5\u00e6t\2\u02b5\u02b6\5\u0084C\2\u02b6+\3\2\2\2"+
		"\u02b7\u02b8\7Y\2\2\u02b8\u02b9\7\u0094\2\2\u02b9\u02ba\7\u00a8\2\2\u02ba"+
		"\u02bb\7\26\2\2\u02bb\u02bc\7\27\2\2\u02bc\u02bd\7\21\2\2\u02bd\u02be"+
		"\5\u0082B\2\u02be\u02bf\5\u00eex\2\u02bf\u02c0\5\u0084C\2\u02c0\u02c1"+
		"\5\u0080A\2\u02c1\u02c2\7\u0099\2\2\u02c2\u02c8\7\21\2\2\u02c3\u02c4\5"+
		"\u0082B\2\u02c4\u02c5\5\u00f0y\2\u02c5\u02c6\5\u0084C\2\u02c6\u02c9\3"+
		"\2\2\2\u02c7\u02c9\5\u00bc_\2\u02c8\u02c3\3\2\2\2\u02c8\u02c7\3\2\2\2"+
		"\u02c9-\3\2\2\2\u02ca\u02cb\5\\/\2\u02cb/\3\2\2\2\u02cc\u02cd\5\u00b6"+
		"\\\2\u02cd\u02ce\7\21\2\2\u02ce\u02d3\5\u00c8e\2\u02cf\u02d0\7\26\2\2"+
		"\u02d0\u02d1\5\u00e0q\2\u02d1\u02d2\7\27\2\2\u02d2\u02d4\3\2\2\2\u02d3"+
		"\u02cf\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4\u02d7\3\2\2\2\u02d5\u02d6\7-"+
		"\2\2\u02d6\u02d8\5\u0102\u0082\2\u02d7\u02d5\3\2\2\2\u02d7\u02d8\3\2\2"+
		"\2\u02d8\61\3\2\2\2\u02d9\u02ed\58\35\2\u02da\u02ed\5x=\2\u02db\u02ed"+
		"\5|?\2\u02dc\u02ed\5\66\34\2\u02dd\u02ed\5\64\33\2\u02de\u02ed\5X-\2\u02df"+
		"\u02ed\5Z.\2\u02e0\u02ed\5N(\2\u02e1\u02ed\5D#\2\u02e2\u02ed\5H%\2\u02e3"+
		"\u02ed\5L\'\2\u02e4\u02ed\5J&\2\u02e5\u02ed\5R*\2\u02e6\u02ed\5T+\2\u02e7"+
		"\u02ed\5p9\2\u02e8\u02ed\5@!\2\u02e9\u02ed\5B\"\2\u02ea\u02ed\5(\25\2"+
		"\u02eb\u02ed\5\u00e4s\2\u02ec\u02d9\3\2\2\2\u02ec\u02da\3\2\2\2\u02ec"+
		"\u02db\3\2\2\2\u02ec\u02dc\3\2\2\2\u02ec\u02dd\3\2\2\2\u02ec\u02de\3\2"+
		"\2\2\u02ec\u02df\3\2\2\2\u02ec\u02e0\3\2\2\2\u02ec\u02e1\3\2\2\2\u02ec"+
		"\u02e2\3\2\2\2\u02ec\u02e3\3\2\2\2\u02ec\u02e4\3\2\2\2\u02ec\u02e5\3\2"+
		"\2\2\u02ec\u02e6\3\2\2\2\u02ec\u02e7\3\2\2\2\u02ec\u02e8\3\2\2\2\u02ec"+
		"\u02e9\3\2\2\2\u02ec\u02ea\3\2\2\2\u02ec\u02eb\3\2\2\2\u02ed\63\3\2\2"+
		"\2\u02ee\u02ef\7k\2\2\u02ef\u02f0\7\26\2\2\u02f0\u02f1\7\27\2\2\u02f1"+
		"\65\3\2\2\2\u02f2\u02f3\7\\\2\2\u02f3\u02f4\7\26\2\2\u02f4\u02f5\5\u009e"+
		"P\2\u02f5\u02f6\7\27\2\2\u02f6\u0307\3\2\2\2\u02f7\u02f8\7\u0092\2\2\u02f8"+
		"\u02f9\7\26\2\2\u02f9\u02fa\5\u009eP\2\u02fa\u02fb\7\27\2\2\u02fb\u0307"+
		"\3\2\2\2\u02fc\u02fd\7\\\2\2\u02fd\u02fe\7\26\2\2\u02fe\u02ff\5\u009e"+
		"P\2\u02ff\u0300\7\27\2\2\u0300\u0301\7I\2\2\u0301\u0302\7\u0092\2\2\u0302"+
		"\u0303\7\26\2\2\u0303\u0304\5\u009eP\2\u0304\u0305\7\27\2\2\u0305\u0307"+
		"\3\2\2\2\u0306\u02f2\3\2\2\2\u0306\u02f7\3\2\2\2\u0306\u02fc\3\2\2\2\u0307"+
		"\67\3\2\2\2\u0308\u0309\5:\36\2\u0309\u030b\7\26\2\2\u030a\u030c\5l\67"+
		"\2\u030b\u030a\3\2\2\2\u030b\u030c\3\2\2\2\u030c\u030d\3\2\2\2\u030d\u030e"+
		"\7\27\2\2\u030e9\3\2\2\2\u030f\u0315\5\u00b2Z\2\u0310\u0311\5<\37\2\u0311"+
		"\u0312\7\25\2\2\u0312\u0313\5\u00b2Z\2\u0313\u0315\3\2\2\2\u0314\u030f"+
		"\3\2\2\2\u0314\u0310\3\2\2\2\u0315;\3\2\2\2\u0316\u0317\b\37\1\2\u0317"+
		"\u0318\5\u00b4[\2\u0318\u031d\3\2\2\2\u0319\u031a\f\3\2\2\u031a\u031c"+
		"\5> \2\u031b\u0319\3\2\2\2\u031c\u031f\3\2\2\2\u031d\u031b\3\2\2\2\u031d"+
		"\u031e\3\2\2\2\u031e=\3\2\2\2\u031f\u031d\3\2\2\2\u0320\u0321\7\25\2\2"+
		"\u0321\u0327\5\u00b6\\\2\u0322\u0323\7\30\2\2\u0323\u0324\5\\/\2\u0324"+
		"\u0325\7\31\2\2\u0325\u0327\3\2\2\2\u0326\u0320\3\2\2\2\u0326\u0322\3"+
		"\2\2\2\u0327?\3\2\2\2\u0328\u0329\7\u009a\2\2\u0329\u032a\5\u0112\u008a"+
		"\2\u032a\u032b\7\21\2\2\u032b\u032c\5\u0082B\2\u032c\u032d\5\u00eex\2"+
		"\u032d\u032e\5\u0084C\2\u032eA\3\2\2\2\u032f\u0330\7\u009a\2\2\u0330\u0331"+
		"\5\u00ba^\2\u0331\u0332\7\21\2\2\u0332\u0333\5\u0082B\2\u0333\u0334\5"+
		"\u00eex\2\u0334\u0335\5\u0084C\2\u0335C\3\2\2\2\u0336\u0337\7\u0093\2"+
		"\2\u0337\u0338\7~\2\2\u0338\u0339\5\\/\2\u0339\u033a\7\21\2\2\u033a\u033b"+
		"\5\u0082B\2\u033b\u0343\5\u00f2z\2\u033c\u033d\5\u0080A\2\u033d\u033e"+
		"\7\u0084\2\2\u033e\u033f\7\21\2\2\u033f\u0340\5\u0082B\2\u0340\u0341\5"+
		"\u00eex\2\u0341\u0342\5\u0084C\2\u0342\u0344\3\2\2\2\u0343\u033c\3\2\2"+
		"\2\u0343\u0344\3\2\2\2\u0344\u0345\3\2\2\2\u0345\u0346\5\u0084C\2\u0346"+
		"E\3\2\2\2\u0347\u0348\7\u009b\2\2\u0348\u0349\5\u00f8}\2\u0349\u034a\7"+
		"\21\2\2\u034a\u034b\5\u0082B\2\u034b\u034c\5\u00eex\2\u034c\u034d\5\u0084"+
		"C\2\u034d\u0357\3\2\2\2\u034e\u034f\7\u009b\2\2\u034f\u0350\7p\2\2\u0350"+
		"\u0351\5\u00f6|\2\u0351\u0352\7\21\2\2\u0352\u0353\5\u0082B\2\u0353\u0354"+
		"\5\u00eex\2\u0354\u0355\5\u0084C\2\u0355\u0357\3\2\2\2\u0356\u0347\3\2"+
		"\2\2\u0356\u034e\3\2\2\2\u0357G\3\2\2\2\u0358\u0359\7l\2\2\u0359\u035c"+
		"\5\u00b6\\\2\u035a\u035b\7\23\2\2\u035b\u035d\5\u00b6\\\2\u035c\u035a"+
		"\3\2\2\2\u035c\u035d\3\2\2\2\u035d\u035e\3\2\2\2\u035e\u035f\7p\2\2\u035f"+
		"\u0360\5\\/\2\u0360\u0361\7\21\2\2\u0361\u0362\5\u0082B\2\u0362\u0363"+
		"\5\u00eex\2\u0363\u0364\5\u0084C\2\u0364I\3\2\2\2\u0365\u0366\7^\2\2\u0366"+
		"\u0367\7\21\2\2\u0367\u0368\5\u0082B\2\u0368\u0369\5\u00eex\2\u0369\u036a"+
		"\5\u0084C\2\u036a\u036b\5\u0080A\2\u036b\u036c\7\u009d\2\2\u036c\u036d"+
		"\5\\/\2\u036dK\3\2\2\2\u036e\u036f\7\u009d\2\2\u036f\u0370\5\\/\2\u0370"+
		"\u0371\7\21\2\2\u0371\u0372\5\u0082B\2\u0372\u0373\5\u00eex\2\u0373\u0374"+
		"\5\u0084C\2\u0374M\3\2\2\2\u0375\u0376\7o\2\2\u0376\u0377\5\\/\2\u0377"+
		"\u0378\7\21\2\2\u0378\u0379\5\u0082B\2\u0379\u037a\5\u00eex\2\u037a\u037e"+
		"\5\u0084C\2\u037b\u037c\5\u0080A\2\u037c\u037d\5P)\2\u037d\u037f\3\2\2"+
		"\2\u037e\u037b\3\2\2\2\u037e\u037f\3\2\2\2\u037f\u0387\3\2\2\2\u0380\u0381"+
		"\5\u0080A\2\u0381\u0382\7a\2\2\u0382\u0383\7\21\2\2\u0383\u0384\5\u0082"+
		"B\2\u0384\u0385\5\u00eex\2\u0385\u0386\5\u0084C\2\u0386\u0388\3\2\2\2"+
		"\u0387\u0380\3\2\2\2\u0387\u0388\3\2\2\2\u0388O\3\2\2\2\u0389\u038a\b"+
		")\1\2\u038a\u038b\7a\2\2\u038b\u038c\7o\2\2\u038c\u038d\5\\/\2\u038d\u038e"+
		"\7\21\2\2\u038e\u038f\5\u0082B\2\u038f\u0390\5\u00eex\2\u0390\u0391\5"+
		"\u0084C\2\u0391\u039e\3\2\2\2\u0392\u0393\f\3\2\2\u0393\u0394\5\u0080"+
		"A\2\u0394\u0395\7a\2\2\u0395\u0396\7o\2\2\u0396\u0397\5\\/\2\u0397\u0398"+
		"\7\21\2\2\u0398\u0399\5\u0082B\2\u0399\u039a\5\u00eex\2\u039a\u039b\5"+
		"\u0084C\2\u039b\u039d\3\2\2\2\u039c\u0392\3\2\2\2\u039d\u03a0\3\2\2\2"+
		"\u039e\u039c\3\2\2\2\u039e\u039f\3\2\2\2\u039fQ\3\2\2\2\u03a0\u039e\3"+
		"\2\2\2\u03a1\u03a2\7\u0086\2\2\u03a2\u03a3\5\\/\2\u03a3S\3\2\2\2\u03a4"+
		"\u03a5\7\u0098\2\2\u03a5\u03a6\5\u00b6\\\2\u03a6\u03a7\7\21\2\2\u03a7"+
		"\u03a8\5\u0082B\2\u03a8\u03a9\5\u00eex\2\u03a9\u03aa\5\u0084C\2\u03aa"+
		"\u03ac\5~@\2\u03ab\u03ad\5\u00f4{\2\u03ac\u03ab\3\2\2\2\u03ac\u03ad\3"+
		"\2\2\2\u03ad\u03b5\3\2\2\2\u03ae\u03af\7d\2\2\u03af\u03b0\7\21\2\2\u03b0"+
		"\u03b1\5\u0082B\2\u03b1\u03b2\5\u00eex\2\u03b2\u03b3\5\u0084C\2\u03b3"+
		"\u03b4\5~@\2\u03b4\u03b6\3\2\2\2\u03b5\u03ae\3\2\2\2\u03b5\u03b6\3\2\2"+
		"\2\u03b6\u03be\3\2\2\2\u03b7\u03b8\7j\2\2\u03b8\u03b9\7\21\2\2\u03b9\u03ba"+
		"\5\u0082B\2\u03ba\u03bb\5\u00eex\2\u03bb\u03bc\5\u0084C\2\u03bc\u03bd"+
		"\5~@\2\u03bd\u03bf\3\2\2\2\u03be\u03b7\3\2\2\2\u03be\u03bf\3\2\2\2\u03bf"+
		"\u03c0\3\2\2\2\u03c0\u03c1\5~@\2\u03c1U\3\2\2\2\u03c2\u03c3\7d\2\2\u03c3"+
		"\u03c4\5\u00bc_\2\u03c4\u03c5\7\21\2\2\u03c5\u03c6\5\u0082B\2\u03c6\u03c7"+
		"\5\u00eex\2\u03c7\u03c8\5\u0084C\2\u03c8\u03c9\5~@\2\u03c9\u03d6\3\2\2"+
		"\2\u03ca\u03cb\7d\2\2\u03cb\u03cc\7p\2\2\u03cc\u03cd\7\30\2\2\u03cd\u03ce"+
		"\5\u0096L\2\u03ce\u03cf\7\31\2\2\u03cf\u03d0\7\21\2\2\u03d0\u03d1\5\u0082"+
		"B\2\u03d1\u03d2\5\u00eex\2\u03d2\u03d3\5\u0084C\2\u03d3\u03d4\5~@\2\u03d4"+
		"\u03d6\3\2\2\2\u03d5\u03c2\3\2\2\2\u03d5\u03ca\3\2\2\2\u03d6W\3\2\2\2"+
		"\u03d7\u03d8\7Q\2\2\u03d8Y\3\2\2\2\u03d9\u03db\7\u008a\2\2\u03da\u03dc"+
		"\5\\/\2\u03db\u03da\3\2\2\2\u03db\u03dc\3\2\2\2\u03dc[\3\2\2\2\u03dd\u03de"+
		"\b/\1\2\u03de\u03df\7#\2\2\u03df\u03f0\5\\/\"\u03e0\u03e1\7{\2\2\u03e1"+
		"\u03f0\5\\/!\u03e2\u03f0\5`\61\2\u03e3\u03f0\5b\62\2\u03e4\u03e5\7?\2"+
		"\2\u03e5\u03e6\7\26\2\2\u03e6\u03e7\5\\/\2\u03e7\u03e8\7\27\2\2\u03e8"+
		"\u03f0\3\2\2\2\u03e9\u03ea\7e\2\2\u03ea\u03eb\7\26\2\2\u03eb\u03ec\5\u00b6"+
		"\\\2\u03ec\u03ed\7\27\2\2\u03ed\u03f0\3\2\2\2\u03ee\u03f0\5^\60\2\u03ef"+
		"\u03dd\3\2\2\2\u03ef\u03e0\3\2\2\2\u03ef\u03e2\3\2\2\2\u03ef\u03e3\3\2"+
		"\2\2\u03ef\u03e4\3\2\2\2\u03ef\u03e9\3\2\2\2\u03ef\u03ee\3\2\2\2\u03f0"+
		"\u0459\3\2\2\2\u03f1\u03f2\f \2\2\u03f2\u03f3\5\u012e\u0098\2\u03f3\u03f4"+
		"\5\\/!\u03f4\u0458\3\2\2\2\u03f5\u03f6\f\37\2\2\u03f6\u03f7\5\u0130\u0099"+
		"\2\u03f7\u03f8\5\\/ \u03f8\u0458\3\2\2\2\u03f9\u03fa\f\36\2\2\u03fa\u03fb"+
		"\5\u0134\u009b\2\u03fb\u03fc\5\\/\37\u03fc\u0458\3\2\2\2\u03fd\u03fe\f"+
		"\35\2\2\u03fe\u03ff\5\u0132\u009a\2\u03ff\u0400\5\\/\36\u0400\u0458\3"+
		"\2\2\2\u0401\u0402\f\34\2\2\u0402\u0403\t\3\2\2\u0403\u0458\5\\/\35\u0404"+
		"\u0405\f\33\2\2\u0405\u0406\7*\2\2\u0406\u0458\5\\/\34\u0407\u0408\f\32"+
		"\2\2\u0408\u0409\7+\2\2\u0409\u0458\5\\/\33\u040a\u040b\f\31\2\2\u040b"+
		"\u040c\7(\2\2\u040c\u0458\5\\/\32\u040d\u040e\f\30\2\2\u040e\u040f\7)"+
		"\2\2\u040f\u0458\5\\/\31\u0410\u0411\f\25\2\2\u0411\u0412\7/\2\2\u0412"+
		"\u0458\5\\/\26\u0413\u0414\f\24\2\2\u0414\u0415\7.\2\2\u0415\u0458\5\\"+
		"/\25\u0416\u0417\f\23\2\2\u0417\u0418\7\60\2\2\u0418\u0458\5\\/\24\u0419"+
		"\u041a\f\22\2\2\u041a\u041b\7\u0082\2\2\u041b\u0458\5\\/\23\u041c\u041d"+
		"\f\21\2\2\u041d\u041e\7I\2\2\u041e\u0458\5\\/\22\u041f\u0420\f\20\2\2"+
		"\u0420\u0421\7o\2\2\u0421\u0422\5\\/\2\u0422\u0423\7a\2\2\u0423\u0424"+
		"\5\\/\21\u0424\u0458\3\2\2\2\u0425\u0426\f\16\2\2\u0426\u0427\7p\2\2\u0427"+
		"\u0458\5\\/\17\u0428\u0429\f\r\2\2\u0429\u042a\7X\2\2\u042a\u0458\5\\"+
		"/\16\u042b\u042c\f\f\2\2\u042c\u042d\7X\2\2\u042d\u042e\7G\2\2\u042e\u0458"+
		"\5\\/\r\u042f\u0430\f\13\2\2\u0430\u0431\7X\2\2\u0431\u0432\7J\2\2\u0432"+
		"\u0458\5\\/\f\u0433\u0434\f\n\2\2\u0434\u0435\7{\2\2\u0435\u0436\7p\2"+
		"\2\u0436\u0458\5\\/\13\u0437\u0438\f\t\2\2\u0438\u0439\7{\2\2\u0439\u043a"+
		"\7X\2\2\u043a\u0458\5\\/\n\u043b\u043c\f\b\2\2\u043c\u043d\7{\2\2\u043d"+
		"\u043e\7X\2\2\u043e\u043f\7G\2\2\u043f\u0458\5\\/\t\u0440\u0441\f\7\2"+
		"\2\u0441\u0442\7{\2\2\u0442\u0443\7X\2\2\u0443\u0444\7J\2\2\u0444\u0458"+
		"\5\\/\b\u0445\u0446\f\3\2\2\u0446\u0447\7l\2\2\u0447\u0448\5\u00b6\\\2"+
		"\u0448\u0449\7p\2\2\u0449\u044a\5\\/\4\u044a\u0458\3\2\2\2\u044b\u044c"+
		"\f$\2\2\u044c\u0458\5r:\2\u044d\u044e\f\27\2\2\u044e\u044f\7s\2\2\u044f"+
		"\u0450\7{\2\2\u0450\u0458\5\u0116\u008c\2\u0451\u0452\f\26\2\2\u0452\u0453"+
		"\7s\2\2\u0453\u0458\5\u0116\u008c\2\u0454\u0455\f\17\2\2\u0455\u0456\7"+
		"K\2\2\u0456\u0458\5\u00c8e\2\u0457\u03f1\3\2\2\2\u0457\u03f5\3\2\2\2\u0457"+
		"\u03f9\3\2\2\2\u0457\u03fd\3\2\2\2\u0457\u0401\3\2\2\2\u0457\u0404\3\2"+
		"\2\2\u0457\u0407\3\2\2\2\u0457\u040a\3\2\2\2\u0457\u040d\3\2\2\2\u0457"+
		"\u0410\3\2\2\2\u0457\u0413\3\2\2\2\u0457\u0416\3\2\2\2\u0457\u0419\3\2"+
		"\2\2\u0457\u041c\3\2\2\2\u0457\u041f\3\2\2\2\u0457\u0425\3\2\2\2\u0457"+
		"\u0428\3\2\2\2\u0457\u042b\3\2\2\2\u0457\u042f\3\2\2\2\u0457\u0433\3\2"+
		"\2\2\u0457\u0437\3\2\2\2\u0457\u043b\3\2\2\2\u0457\u0440\3\2\2\2\u0457"+
		"\u0445\3\2\2\2\u0457\u044b\3\2\2\2\u0457\u044d\3\2\2\2\u0457\u0451\3\2"+
		"\2\2\u0457\u0454\3\2\2\2\u0458\u045b\3\2\2\2\u0459\u0457\3\2\2\2\u0459"+
		"\u045a\3\2\2\2\u045a]\3\2\2\2\u045b\u0459\3\2\2\2\u045c\u045d\5\u00ba"+
		"^\2\u045d_\3\2\2\2\u045e\u045f\b\61\1\2\u045f\u0460\5\u00fc\177\2\u0460"+
		"\u0465\3\2\2\2\u0461\u0462\f\3\2\2\u0462\u0464\5d\63\2\u0463\u0461\3\2"+
		"\2\2\u0464\u0467\3\2\2\2\u0465\u0463\3\2\2\2\u0465\u0466\3\2\2\2\u0466"+
		"a\3\2\2\2\u0467\u0465\3\2\2\2\u0468\u0471\5f\64\2\u0469\u0471\5h\65\2"+
		"\u046a\u0471\5t;\2\u046b\u0471\5\u0118\u008d\2\u046c\u0471\5\u011a\u008e"+
		"\2\u046d\u0471\5v<\2\u046e\u0471\58\35\2\u046f\u0471\5j\66\2\u0470\u0468"+
		"\3\2\2\2\u0470\u0469\3\2\2\2\u0470\u046a\3\2\2\2\u0470\u046b\3\2\2\2\u0470"+
		"\u046c\3\2\2\2\u0470\u046d\3\2\2\2\u0470\u046e\3\2\2\2\u0470\u046f\3\2"+
		"\2\2\u0471c\3\2\2\2\u0472\u0473\6\63\"\3\u0473\u0474\7\25\2\2\u0474\u0480"+
		"\5\u00b6\\\2\u0475\u0476\6\63#\3\u0476\u0477\7\30\2\2\u0477\u0478\5\u0110"+
		"\u0089\2\u0478\u0479\7\31\2\2\u0479\u0480\3\2\2\2\u047a\u047b\6\63$\3"+
		"\u047b\u047c\7\30\2\2\u047c\u047d\5\\/\2\u047d\u047e\7\31\2\2\u047e\u0480"+
		"\3\2\2\2\u047f\u0472\3\2\2\2\u047f\u0475\3\2\2\2\u047f\u047a\3\2\2\2\u0480"+
		"e\3\2\2\2\u0481\u0482\7A\2\2\u0482\u0484\7\26\2\2\u0483\u0485\5\\/\2\u0484"+
		"\u0483\3\2\2\2\u0484\u0485\3\2\2\2\u0485\u0486\3\2\2\2\u0486\u0487\7\27"+
		"\2\2\u0487g\3\2\2\2\u0488\u0489\7@\2\2\u0489\u048b\7\26\2\2\u048a\u048c"+
		"\5\\/\2\u048b\u048a\3\2\2\2\u048b\u048c\3\2\2\2\u048c\u048d\3\2\2\2\u048d"+
		"\u048e\7\27\2\2\u048ei\3\2\2\2\u048f\u0490\5\u00aaV\2\u0490\u0492\7\26"+
		"\2\2\u0491\u0493\5l\67\2\u0492\u0491\3\2\2\2\u0492\u0493\3\2\2\2\u0493"+
		"\u0494\3\2\2\2\u0494\u0495\7\27\2\2\u0495k\3\2\2\2\u0496\u0497\b\67\1"+
		"\2\u0497\u0498\5\\/\2\u0498\u0499\6\67%\3\u0499\u049c\3\2\2\2\u049a\u049c"+
		"\5n8\2\u049b\u0496\3\2\2\2\u049b\u049a\3\2\2\2\u049c\u04a2\3\2\2\2\u049d"+
		"\u049e\f\3\2\2\u049e\u049f\7\23\2\2\u049f\u04a1\5n8\2\u04a0\u049d\3\2"+
		"\2\2\u04a1\u04a4\3\2\2\2\u04a2\u04a0\3\2\2\2\u04a2\u04a3\3\2\2\2\u04a3"+
		"m\3\2\2\2\u04a4\u04a2\3\2\2\2\u04a5\u04a6\5\u00b6\\\2\u04a6\u04a7\5\u012c"+
		"\u0097\2\u04a7\u04a8\5\\/\2\u04a8o\3\2\2\2\u04a9\u04aa\7\u009e\2\2\u04aa"+
		"\u04ab\5\\/\2\u04ab\u04ac\7\u0097\2\2\u04ac\u04ad\5\\/\2\u04adq\3\2\2"+
		"\2\u04ae\u04af\7i\2\2\u04af\u04b0\7\u009a\2\2\u04b0\u04b1\5\u00b6\\\2"+
		"\u04b1\u04b2\7\u009c\2\2\u04b2\u04b3\5\\/\2\u04b3s\3\2\2\2\u04b4\u04b5"+
		"\7h\2\2\u04b5\u04b7\7\177\2\2\u04b6\u04b8\5\u00aaV\2\u04b7\u04b6\3\2\2"+
		"\2\u04b7\u04b8\3\2\2\2\u04b8\u04b9\3\2\2\2\u04b9\u04ba\7\u009c\2\2\u04ba"+
		"\u04d3\5\\/\2\u04bb\u04c2\7h\2\2\u04bc\u04c3\7G\2\2\u04bd\u04be\7\u008c"+
		"\2\2\u04be\u04bf\5\\/\2\u04bf\u04c0\7\u0097\2\2\u04c0\u04c1\5\\/\2\u04c1"+
		"\u04c3\3\2\2\2\u04c2\u04bc\3\2\2\2\u04c2\u04bd\3\2\2\2\u04c3\u04c4\3\2"+
		"\2\2\u04c4\u04c6\7\26\2\2\u04c5\u04c7\5\u00aaV\2\u04c6\u04c5\3\2\2\2\u04c6"+
		"\u04c7\3\2\2\2\u04c7\u04c8\3\2\2\2\u04c8\u04cb\7\27\2\2\u04c9\u04ca\7"+
		"\u009c\2\2\u04ca\u04cc\5\\/\2\u04cb\u04c9\3\2\2\2\u04cb\u04cc\3\2\2\2"+
		"\u04cc\u04d0\3\2\2\2\u04cd\u04ce\7\u0083\2\2\u04ce\u04cf\7R\2\2\u04cf"+
		"\u04d1\5\u011c\u008f\2\u04d0\u04cd\3\2\2\2\u04d0\u04d1\3\2\2\2\u04d1\u04d3"+
		"\3\2\2\2\u04d2\u04b4\3\2\2\2\u04d2\u04bb\3\2\2\2\u04d3u\3\2\2\2\u04d4"+
		"\u04d6\7\u0090\2\2\u04d5\u04d7\7]\2\2\u04d6\u04d5\3\2\2\2\u04d6\u04d7"+
		"\3\2\2\2\u04d7\u04d8\3\2\2\2\u04d8\u04d9\7\26\2\2\u04d9\u04df\5`\61\2"+
		"\u04da\u04db\7\23\2\2\u04db\u04dc\5\u0124\u0093\2\u04dc\u04dd\7-\2\2\u04dd"+
		"\u04de\5`\61\2\u04de\u04e0\3\2\2\2\u04df\u04da\3\2\2\2\u04df\u04e0\3\2"+
		"\2\2\u04e0\u04e1\3\2\2\2\u04e1\u04e2\7\27\2\2\u04e2w\3\2\2\2\u04e3\u04e4"+
		"\5\u0114\u008b\2\u04e4\u04e5\5\u012c\u0097\2\u04e5\u04e6\5\\/\2\u04e6"+
		"y\3\2\2\2\u04e7\u04e8\6>\'\3\u04e8\u04e9\7\25\2\2\u04e9\u04f0\5\u00b6"+
		"\\\2\u04ea\u04eb\6>(\3\u04eb\u04ec\7\30\2\2\u04ec\u04ed\5\\/\2\u04ed\u04ee"+
		"\7\31\2\2\u04ee\u04f0\3\2\2\2\u04ef\u04e7\3\2\2\2\u04ef\u04ea\3\2\2\2"+
		"\u04f0{\3\2\2\2\u04f1\u04f2\5\u00dep\2\u04f2\u04f3\5\u012c\u0097\2\u04f3"+
		"\u04f4\5\\/\2\u04f4}\3\2\2\2\u04f5\u04f7\7\7\2\2\u04f6\u04f5\3\2\2\2\u04f7"+
		"\u04fa\3\2\2\2\u04f8\u04f6\3\2\2\2\u04f8\u04f9\3\2\2\2\u04f9\177\3\2\2"+
		"\2\u04fa\u04f8\3\2\2\2\u04fb\u04fd\7\7\2\2\u04fc\u04fb\3\2\2\2\u04fd\u04fe"+
		"\3\2\2\2\u04fe\u04fc\3\2\2\2\u04fe\u04ff\3\2\2\2\u04ff\u0081\3\2\2\2\u0500"+
		"\u0502\7\7\2\2\u0501\u0500\3\2\2\2\u0502\u0503\3\2\2\2\u0503\u0501\3\2"+
		"\2\2\u0503\u0504\3\2\2\2\u0504\u0505\3\2\2\2\u0505\u0506\7\3\2\2\u0506"+
		"\u0083\3\2\2\2\u0507\u0509\7\7\2\2\u0508\u0507\3\2\2\2\u0509\u050c\3\2"+
		"\2\2\u050a\u0508\3\2\2\2\u050a\u050b\3\2\2\2\u050b\u050d\3\2\2\2\u050c"+
		"\u050a\3\2\2\2\u050d\u050e\7\4\2\2\u050e\u0085\3\2\2\2\u050f\u0510\7z"+
		"\2\2\u0510\u0087\3\2\2\2\u0511\u0513\5\u008aF\2\u0512\u0511\3\2\2\2\u0512"+
		"\u0513\3\2\2\2\u0513\u0514\3\2\2\2\u0514\u0515\5~@\2\u0515\u0516\7\2\2"+
		"\3\u0516\u0089\3\2\2\2\u0517\u051d\5\u008cG\2\u0518\u0519\5\u0080A\2\u0519"+
		"\u051a\5\u008cG\2\u051a\u051c\3\2\2\2\u051b\u0518\3\2\2\2\u051c\u051f"+
		"\3\2\2\2\u051d\u051b\3\2\2\2\u051d\u051e\3\2\2\2\u051e\u008b\3\2\2\2\u051f"+
		"\u051d\3\2\2\2\u0520\u0521\5\u00e4s\2\u0521\u0522\5\u0080A\2\u0522\u0524"+
		"\3\2\2\2\u0523\u0520\3\2\2\2\u0524\u0527\3\2\2\2\u0525\u0523\3\2\2\2\u0525"+
		"\u0526\3\2\2\2\u0526\u052d\3\2\2\2\u0527\u0525\3\2\2\2\u0528\u052e\5\n"+
		"\6\2\u0529\u052e\5\u00aeX\2\u052a\u052e\5\u008eH\2\u052b\u052e\5\u0090"+
		"I\2\u052c\u052e\5\u00e2r\2\u052d\u0528\3\2\2\2\u052d\u0529\3\2\2\2\u052d"+
		"\u052a\3\2\2\2\u052d\u052b\3\2\2\2\u052d\u052c\3\2\2\2\u052e\u008d\3\2"+
		"\2\2\u052f\u0530\5 \21\2\u0530\u008f\3\2\2\2\u0531\u0534\5\2\2\2\u0532"+
		"\u0534\5\4\3\2\u0533\u0531\3\2\2\2\u0533\u0532\3\2\2\2\u0534\u0091\3\2"+
		"\2\2\u0535\u053b\5\6\4\2\u0536\u0537\5\u0080A\2\u0537\u0538\5\6\4\2\u0538"+
		"\u053a\3\2\2\2\u0539\u0536\3\2\2\2\u053a\u053d\3\2\2\2\u053b\u0539\3\2"+
		"\2\2\u053b\u053c\3\2\2\2\u053c\u0093\3\2\2\2\u053d\u053b\3\2\2\2\u053e"+
		"\u0544\5\b\5\2\u053f\u0540\5\u0080A\2\u0540\u0541\5\b\5\2\u0541\u0543"+
		"\3\2\2\2\u0542\u053f\3\2\2\2\u0543\u0546\3\2\2\2\u0544\u0542\3\2\2\2\u0544"+
		"\u0545\3\2\2\2\u0545\u0095\3\2\2\2\u0546\u0544\3\2\2\2\u0547\u054c\5\u00bc"+
		"_\2\u0548\u0549\7\23\2\2\u0549\u054b\5\u00bc_\2\u054a\u0548\3\2\2\2\u054b"+
		"\u054e\3\2\2\2\u054c\u054a\3\2\2\2\u054c\u054d\3\2\2\2\u054d\u0097\3\2"+
		"\2\2\u054e\u054c\3\2\2\2\u054f\u0550\7p\2\2\u0550\u055a\5\u009aN\2\u0551"+
		"\u0552\7p\2\2\u0552\u055a\5\u009cO\2\u0553\u0554\7p\2\2\u0554\u055a\5"+
		"\u00a0Q\2\u0555\u0556\7t\2\2\u0556\u055a\7\u00a8\2\2\u0557\u0558\7t\2"+
		"\2\u0558\u055a\5\\/\2\u0559\u054f\3\2\2\2\u0559\u0551\3\2\2\2\u0559\u0553"+
		"\3\2\2\2\u0559\u0555\3\2\2\2\u0559\u0557\3\2\2\2\u055a\u0099\3\2\2\2\u055b"+
		"\u055d\7x\2\2\u055c\u055b\3\2\2\2\u055c\u055d\3\2\2\2\u055d\u055e\3\2"+
		"\2\2\u055e\u0560\7\30\2\2\u055f\u0561\5\u009eP\2\u0560\u055f\3\2\2\2\u0560"+
		"\u0561\3\2\2\2\u0561\u0562\3\2\2\2\u0562\u0563\7\31\2\2\u0563\u009b\3"+
		"\2\2\2\u0564\u0566\7x\2\2\u0565\u0564\3\2\2\2\u0565\u0566\3\2\2\2\u0566"+
		"\u0567\3\2\2\2\u0567\u0569\7*\2\2\u0568\u056a\5\u009eP\2\u0569\u0568\3"+
		"\2\2\2\u0569\u056a\3\2\2\2\u056a\u056b\3\2\2\2\u056b\u056c\7(\2\2\u056c"+
		"\u009d\3\2\2\2\u056d\u0572\5\\/\2\u056e\u056f\7\23\2\2\u056f\u0571\5\\"+
		"/\2\u0570\u056e\3\2\2\2\u0571\u0574\3\2\2\2\u0572\u0570\3\2\2\2\u0572"+
		"\u0573\3\2\2\2\u0573\u009f\3\2\2\2\u0574\u0572\3\2\2\2\u0575\u0576\7\30"+
		"\2\2\u0576\u0577\5\\/\2\u0577\u0578\7\24\2\2\u0578\u0579\5\\/\2\u0579"+
		"\u057a\7\31\2\2\u057a\u00a1\3\2\2\2\u057b\u057c\bR\1\2\u057c\u0588\5\u00a4"+
		"S\2\u057d\u057e\7E\2\2\u057e\u057f\7*\2\2\u057f\u0580\5\u00a2R\2\u0580"+
		"\u0581\7(\2\2\u0581\u0588\3\2\2\2\u0582\u0583\7D\2\2\u0583\u0584\7*\2"+
		"\2\u0584\u0585\5\u00a2R\2\u0585\u0586\7(\2\2\u0586\u0588\3\2\2\2\u0587"+
		"\u057b\3\2\2\2\u0587\u057d\3\2\2\2\u0587\u0582\3\2\2\2\u0588\u0593\3\2"+
		"\2\2\u0589\u058a\f\7\2\2\u058a\u0592\7,\2\2\u058b\u058c\f\6\2\2\u058c"+
		"\u058d\7\30\2\2\u058d\u0592\7\31\2\2\u058e\u058f\f\5\2\2\u058f\u0590\7"+
		"\32\2\2\u0590\u0592\7\33\2\2\u0591\u0589\3\2\2\2\u0591\u058b\3\2\2\2\u0591"+
		"\u058e\3\2\2\2\u0592\u0595\3\2\2\2\u0593\u0591\3\2\2\2\u0593\u0594\3\2"+
		"\2\2\u0594\u00a3\3\2\2\2\u0595\u0593\3\2\2\2\u0596\u0599\5\u00a6T\2\u0597"+
		"\u0599\5\u00a8U\2\u0598\u0596\3\2\2\2\u0598\u0597\3\2\2\2\u0599\u00a5"+
		"\3\2\2\2\u059a\u05aa\7\64\2\2\u059b\u05aa\7\65\2\2\u059c\u05aa\7\66\2"+
		"\2\u059d\u05aa\7B\2\2\u059e\u05aa\7\67\2\2\u059f\u05aa\78\2\2\u05a0\u05aa"+
		"\7@\2\2\u05a1\u05aa\79\2\2\u05a2\u05aa\7;\2\2\u05a3\u05aa\7:\2\2\u05a4"+
		"\u05aa\7<\2\2\u05a5\u05aa\7=\2\2\u05a6\u05aa\7?\2\2\u05a7\u05aa\7A\2\2"+
		"\u05a8\u05aa\7C\2\2\u05a9\u059a\3\2\2\2\u05a9\u059b\3\2\2\2\u05a9\u059c"+
		"\3\2\2\2\u05a9\u059d\3\2\2\2\u05a9\u059e\3\2\2\2\u05a9\u059f\3\2\2\2\u05a9"+
		"\u05a0\3\2\2\2\u05a9\u05a1\3\2\2\2\u05a9\u05a2\3\2\2\2\u05a9\u05a3\3\2"+
		"\2\2\u05a9\u05a4\3\2\2\2\u05a9\u05a5\3\2\2\2\u05a9\u05a6\3\2\2\2\u05a9"+
		"\u05a7\3\2\2\2\u05a9\u05a8\3\2\2\2\u05aa\u00a7\3\2\2\2\u05ab\u05ac\7\u00a4"+
		"\2\2\u05ac\u00a9\3\2\2\2\u05ad\u05af\7x\2\2\u05ae\u05ad\3\2\2\2\u05ae"+
		"\u05af\3\2\2\2\u05af\u05b0\3\2\2\2\u05b0\u05b1\5\u00a8U\2\u05b1\u00ab"+
		"\3\2\2\2\u05b2\u05b3\7?\2\2\u05b3\u00ad\3\2\2\2\u05b4\u05b8\5\16\b\2\u05b5"+
		"\u05b8\5\36\20\2\u05b6\u05b8\5\20\t\2\u05b7\u05b4\3\2\2\2\u05b7\u05b5"+
		"\3\2\2\2\u05b7\u05b6\3\2\2\2\u05b8\u00af\3\2\2\2\u05b9\u05be\5\u00ba^"+
		"\2\u05ba\u05bb\7\23\2\2\u05bb\u05bd\5\u00ba^\2\u05bc\u05ba\3\2\2\2\u05bd"+
		"\u05c0\3\2\2\2\u05be\u05bc\3\2\2\2\u05be\u05bf\3\2\2\2\u05bf\u00b1\3\2"+
		"\2\2\u05c0\u05be\3\2\2\2\u05c1\u05c4\5\u00b6\\\2\u05c2\u05c4\5\u00ba^"+
		"\2\u05c3\u05c1\3\2\2\2\u05c3\u05c2\3\2\2\2\u05c4\u00b3\3\2\2\2\u05c5\u05c9"+
		"\5\u00b6\\\2\u05c6\u05c9\5\u00ba^\2\u05c7\u05c9\5\u00bc_\2\u05c8\u05c5"+
		"\3\2\2\2\u05c8\u05c6\3\2\2\2\u05c8\u05c7\3\2\2\2\u05c9\u00b5\3\2\2\2\u05ca"+
		"\u05cb\7\u00a5\2\2\u05cb\u00b7\3\2\2\2\u05cc\u05cd\t\4\2\2\u05cd\u00b9"+
		"\3\2\2\2\u05ce\u05cf\7\u00a4\2\2\u05cf\u00bb\3\2\2\2\u05d0\u05d1\7\u00a3"+
		"\2\2\u05d1\u00bd\3\2\2\2\u05d2\u05d7\5\u00c0a\2\u05d3\u05d4\7\23\2\2\u05d4"+
		"\u05d6\5\u00c0a\2\u05d5\u05d3\3\2\2\2\u05d6\u05d9\3\2\2\2\u05d7\u05d5"+
		"\3\2\2\2\u05d7\u05d8\3\2\2\2\u05d8\u00bf\3\2\2\2\u05d9\u05d7\3\2\2\2\u05da"+
		"\u05e0\5\u00c6d\2\u05db\u05dd\7x\2\2\u05dc\u05db\3\2\2\2\u05dc\u05dd\3"+
		"\2\2\2\u05dd\u05de\3\2\2\2\u05de\u05e0\5\u00c2b\2\u05df\u05da\3\2\2\2"+
		"\u05df\u05dc\3\2\2\2\u05e0\u00c1\3\2\2\2\u05e1\u05e4\5\u00c4c\2\u05e2"+
		"\u05e4\5\60\31\2\u05e3\u05e1\3\2\2\2\u05e3\u05e2\3\2\2\2\u05e4\u00c3\3"+
		"\2\2\2\u05e5\u05e8\5\u00b6\\\2\u05e6\u05e7\7-\2\2\u05e7\u05e9\5\u0102"+
		"\u0082\2\u05e8\u05e6\3\2\2\2\u05e8\u05e9\3\2\2\2\u05e9\u00c5\3\2\2\2\u05ea"+
		"\u05eb\5\u00acW\2\u05eb\u05ec\5\u00b6\\\2\u05ec\u00c7\3\2\2\2\u05ed\u05f0"+
		"\5\u00a2R\2\u05ee\u05f0\5\u00caf\2\u05ef\u05ed\3\2\2\2\u05ef\u05ee\3\2"+
		"\2\2\u05f0\u00c9\3\2\2\2\u05f1\u05f2\bf\1\2\u05f2\u05f3\7J\2\2\u05f3\u05fc"+
		"\3\2\2\2\u05f4\u05f5\f\4\2\2\u05f5\u05f6\7\30\2\2\u05f6\u05fb\7\31\2\2"+
		"\u05f7\u05f8\f\3\2\2\u05f8\u05f9\7\32\2\2\u05f9\u05fb\7\33\2\2\u05fa\u05f4"+
		"\3\2\2\2\u05fa\u05f7\3\2\2\2\u05fb\u05fe\3\2\2\2\u05fc\u05fa\3\2\2\2\u05fc"+
		"\u05fd\3\2\2\2\u05fd\u00cb\3\2\2\2\u05fe\u05fc\3\2\2\2\u05ff\u0605\5\u00ce"+
		"h\2\u0600\u0601\5\u0080A\2\u0601\u0602\5\u00ceh\2\u0602\u0604\3\2\2\2"+
		"\u0603\u0600\3\2\2\2\u0604\u0607\3\2\2\2\u0605\u0603\3\2\2\2\u0605\u0606"+
		"\3\2\2\2\u0606\u00cd\3\2\2\2\u0607\u0605\3\2\2\2\u0608\u060e\5\26\f\2"+
		"\u0609\u060e\5\32\16\2\u060a\u060e\5(\25\2\u060b\u060e\5&\24\2\u060c\u060e"+
		"\5\24\13\2\u060d\u0608\3\2\2\2\u060d\u0609\3\2\2\2\u060d\u060a\3\2\2\2"+
		"\u060d\u060b\3\2\2\2\u060d\u060c\3\2\2\2\u060e\u00cf\3\2\2\2\u060f\u0615"+
		"\5\u00d2j\2\u0610\u0611\5\u0080A\2\u0611\u0612\5\u00d2j\2\u0612\u0614"+
		"\3\2\2\2\u0613\u0610\3\2\2\2\u0614\u0617\3\2\2\2\u0615\u0613\3\2\2\2\u0615"+
		"\u0616\3\2\2\2\u0616\u00d1\3\2\2\2\u0617\u0615\3\2\2\2\u0618\u061c\5\34"+
		"\17\2\u0619\u061c\5\30\r\2\u061a\u061c\5*\26\2\u061b\u0618\3\2\2\2\u061b"+
		"\u0619\3\2\2\2\u061b\u061a\3\2\2\2\u061c\u00d3\3\2\2\2\u061d\u061e\7\13"+
		"\2\2\u061e\u0628\5\u0180\u00c1\2\u061f\u0620\7\f\2\2\u0620\u0628\5\u019a"+
		"\u00ce\2\u0621\u0622\7\r\2\2\u0622\u0628\5\u00d6l\2\u0623\u0624\7\16\2"+
		"\2\u0624\u0628\5\u00d6l\2\u0625\u0626\7\17\2\2\u0626\u0628\5\u00dan\2"+
		"\u0627\u061d\3\2\2\2\u0627\u061f\3\2\2\2\u0627\u0621\3\2\2\2\u0627\u0623"+
		"\3\2\2\2\u0627\u0625\3\2\2\2\u0628\u00d5\3\2\2\2\u0629\u062b\5\u00b4["+
		"\2\u062a\u062c\5\u00d8m\2\u062b\u062a\3\2\2\2\u062b\u062c\3\2\2\2\u062c"+
		"\u00d7\3\2\2\2\u062d\u062e\7m\2\2\u062e\u062f\5\u0126\u0094\2\u062f\u0630"+
		"\7\21\2\2\u0630\u0635\5\u00b4[\2\u0631\u0632\7\25\2\2\u0632\u0634\5\u00b4"+
		"[\2\u0633\u0631\3\2\2\2\u0634\u0637\3\2\2\2\u0635\u0633\3\2\2\2\u0635"+
		"\u0636\3\2\2\2\u0636\u00d9\3\2\2\2\u0637\u0635\3\2\2\2\u0638\u063a\5\u00b4"+
		"[\2\u0639\u063b\5\u00dco\2\u063a\u0639\3\2\2\2\u063a\u063b\3\2\2\2\u063b"+
		"\u00db\3\2\2\2\u063c\u063d\7m\2\2\u063d\u063e\5\u0126\u0094\2\u063e\u0640"+
		"\7\21\2\2\u063f\u0641\7%\2\2\u0640\u063f\3\2\2\2\u0640\u0641\3\2\2\2\u0641"+
		"\u0642\3\2\2\2\u0642\u0647\5\u014e\u00a8\2\u0643\u0644\7%\2\2\u0644\u0646"+
		"\5\u014e\u00a8\2\u0645\u0643\3\2\2\2\u0646\u0649\3\2\2\2\u0647\u0645\3"+
		"\2\2\2\u0647\u0648\3\2\2\2\u0648\u064c\3\2\2\2\u0649\u0647\3\2\2\2\u064a"+
		"\u064b\7\25\2\2\u064b\u064d\5\u014e\u00a8\2\u064c\u064a\3\2\2\2\u064c"+
		"\u064d\3\2\2\2\u064d\u00dd\3\2\2\2\u064e\u0653\5\u00b6\\\2\u064f\u0650"+
		"\7\23\2\2\u0650\u0652\5\u00b6\\\2\u0651\u064f\3\2\2\2\u0652\u0655\3\2"+
		"\2\2\u0653\u0651\3\2\2\2\u0653\u0654\3\2\2\2\u0654\u00df\3\2\2\2\u0655"+
		"\u0653\3\2\2\2\u0656\u065b\5\u00b8]\2\u0657\u0658\7\23\2\2\u0658\u065a"+
		"\5\u00b8]\2\u0659\u0657\3\2\2\2\u065a\u065d\3\2\2\2\u065b\u0659\3\2\2"+
		"\2\u065b\u065c\3\2\2\2\u065c\u00e1\3\2\2\2\u065d\u065b\3\2\2\2\u065e\u0663"+
		"\5&\24\2\u065f\u0663\5(\25\2\u0660\u0663\5*\26\2\u0661\u0663\5,\27\2\u0662"+
		"\u065e\3\2\2\2\u0662\u065f\3\2\2\2\u0662\u0660\3\2\2\2\u0662\u0661\3\2"+
		"\2\2\u0663\u00e3\3\2\2\2\u0664\u0665\7\n\2\2\u0665\u00e5\3\2\2\2\u0666"+
		"\u066c\5\u00e8u\2\u0667\u0668\5\u0080A\2\u0668\u0669\5\u00e8u\2\u0669"+
		"\u066b\3\2\2\2\u066a\u0667\3\2\2\2\u066b\u066e\3\2\2\2\u066c\u066a\3\2"+
		"\2\2\u066c\u066d\3\2\2\2\u066d\u00e7\3\2\2\2\u066e\u066c\3\2\2\2\u066f"+
		"\u0670\7\13\2\2\u0670\u067a\5\u016a\u00b6\2\u0671\u0672\7\f\2\2\u0672"+
		"\u067a\5\u0186\u00c4\2\u0673\u0674\7\r\2\2\u0674\u067a\5\u00eav\2\u0675"+
		"\u0676\7\16\2\2\u0676\u067a\5\u00eav\2\u0677\u0678\7\17\2\2\u0678\u067a"+
		"\5\u00ecw\2\u0679\u066f\3\2\2\2\u0679\u0671\3\2\2\2\u0679\u0673\3\2\2"+
		"\2\u0679\u0675\3\2\2\2\u0679\u0677\3\2\2\2\u067a\u00e9\3\2\2\2\u067b\u067d"+
		"\5\u0150\u00a9\2\u067c\u067e\7\22\2\2\u067d\u067c\3\2\2\2\u067d\u067e"+
		"\3\2\2\2\u067e\u0680\3\2\2\2\u067f\u0681\5\u00d8m\2\u0680\u067f\3\2\2"+
		"\2\u0680\u0681\3\2\2\2\u0681\u00eb\3\2\2\2\u0682\u0684\5\u0136\u009c\2"+
		"\u0683\u0685\7\22\2\2\u0684\u0683\3\2\2\2\u0684\u0685\3\2\2\2\u0685\u0687"+
		"\3\2\2\2\u0686\u0688\5\u00dco\2\u0687\u0686\3\2\2\2\u0687\u0688\3\2\2"+
		"\2\u0688\u00ed\3\2\2\2\u0689\u068f\5\62\32\2\u068a\u068b\5\u0080A\2\u068b"+
		"\u068c\5\62\32\2\u068c\u068e\3\2\2\2\u068d\u068a\3\2\2\2\u068e\u0691\3"+
		"\2\2\2\u068f\u068d\3\2\2\2\u068f\u0690\3\2\2\2\u0690\u00ef\3\2\2\2\u0691"+
		"\u068f\3\2\2\2\u0692\u0698\5.\30\2\u0693\u0694\5\u0080A\2\u0694\u0695"+
		"\5.\30\2\u0695\u0697\3\2\2\2\u0696\u0693\3\2\2\2\u0697\u069a\3\2\2\2\u0698"+
		"\u0696\3\2\2\2\u0698\u0699\3\2\2\2\u0699\u00f1\3\2\2\2\u069a\u0698\3\2"+
		"\2\2\u069b\u06a1\5F$\2\u069c\u069d\5\u0080A\2\u069d\u069e\5F$\2\u069e"+
		"\u06a0\3\2\2\2\u069f\u069c\3\2\2\2\u06a0\u06a3\3\2\2\2\u06a1\u069f\3\2"+
		"\2\2\u06a1\u06a2\3\2\2\2\u06a2\u00f3\3\2\2\2\u06a3\u06a1\3\2\2\2\u06a4"+
		"\u06aa\5V,\2\u06a5\u06a6\5\u0080A\2\u06a6\u06a7\5V,\2\u06a7\u06a9\3\2"+
		"\2\2\u06a8\u06a5\3\2\2\2\u06a9\u06ac\3\2\2\2\u06aa\u06a8\3\2\2\2\u06aa"+
		"\u06ab\3\2\2\2\u06ab\u00f5\3\2\2\2\u06ac\u06aa\3\2\2\2\u06ad\u06ae\7\30"+
		"\2\2\u06ae\u06af\5\u00f8}\2\u06af\u06b0\7\24\2\2\u06b0\u06b1\5\u00f8}"+
		"\2\u06b1\u06b2\7\31\2\2\u06b2\u06bc\3\2\2\2\u06b3\u06b4\7\30\2\2\u06b4"+
		"\u06b5\5\u00fa~\2\u06b5\u06b6\7\31\2\2\u06b6\u06bc\3\2\2\2\u06b7\u06b8"+
		"\7*\2\2\u06b8\u06b9\5\u00fa~\2\u06b9\u06ba\7(\2\2\u06ba\u06bc\3\2\2\2"+
		"\u06bb\u06ad\3\2\2\2\u06bb\u06b3\3\2\2\2\u06bb\u06b7\3\2\2\2\u06bc\u00f7"+
		"\3\2\2\2\u06bd\u06cd\7\u00a1\2\2\u06be\u06cd\7\u00a2\2\2\u06bf\u06cd\7"+
		"\u00aa\2\2\u06c0\u06cd\7\u00ab\2\2\u06c1\u06cd\7\u00a0\2\2\u06c2\u06cd"+
		"\7\u00af\2\2\u06c3\u06cd\7\u00ae\2\2\u06c4\u06cd\7\u00a8\2\2\u06c5\u06cd"+
		"\7\u00ac\2\2\u06c6\u06cd\7\u00ad\2\2\u06c7\u06cd\7\u009f\2\2\u06c8\u06cd"+
		"\7\u00b0\2\2\u06c9\u06cd\7\u00b1\2\2\u06ca\u06cd\7\u00a9\2\2\u06cb\u06cd"+
		"\5\u0086D\2\u06cc\u06bd\3\2\2\2\u06cc\u06be\3\2\2\2\u06cc\u06bf\3\2\2"+
		"\2\u06cc\u06c0\3\2\2\2\u06cc\u06c1\3\2\2\2\u06cc\u06c2\3\2\2\2\u06cc\u06c3"+
		"\3\2\2\2\u06cc\u06c4\3\2\2\2\u06cc\u06c5\3\2\2\2\u06cc\u06c6\3\2\2\2\u06cc"+
		"\u06c7\3\2\2\2\u06cc\u06c8\3\2\2\2\u06cc\u06c9\3\2\2\2\u06cc\u06ca\3\2"+
		"\2\2\u06cc\u06cb\3\2\2\2\u06cd\u00f9\3\2\2\2\u06ce\u06d3\5\u00f8}\2\u06cf"+
		"\u06d0\7\23\2\2\u06d0\u06d2\5\u00f8}\2\u06d1\u06cf\3\2\2\2\u06d2\u06d5"+
		"\3\2\2\2\u06d3\u06d1\3\2\2\2\u06d3\u06d4\3\2\2\2\u06d4\u00fb\3\2\2\2\u06d5"+
		"\u06d3\3\2\2\2\u06d6\u06db\5\u0100\u0081\2\u06d7\u06db\5\u0102\u0082\2"+
		"\u06d8\u06db\5\u00b4[\2\u06d9\u06db\5\u00fe\u0080\2\u06da\u06d6\3\2\2"+
		"\2\u06da\u06d7\3\2\2\2\u06da\u06d8\3\2\2\2\u06da\u06d9\3\2\2\2\u06db\u00fd"+
		"\3\2\2\2\u06dc\u06dd\t\5\2\2\u06dd\u00ff\3\2\2\2\u06de\u06df\7\26\2\2"+
		"\u06df\u06e0\5\\/\2\u06e0\u06e1\7\27\2\2\u06e1\u0101\3\2\2\2\u06e2\u06e5"+
		"\5\u00f8}\2\u06e3\u06e5\5\u0104\u0083\2\u06e4\u06e2\3\2\2\2\u06e4\u06e3"+
		"\3\2\2\2\u06e5\u0103\3\2\2\2\u06e6\u06ec\5\u00a0Q\2\u06e7\u06ec\5\u009a"+
		"N\2\u06e8\u06ec\5\u009cO\2\u06e9\u06ec\5\u0108\u0085\2\u06ea\u06ec\5\u0106"+
		"\u0084\2\u06eb\u06e6\3\2\2\2\u06eb\u06e7\3\2\2\2\u06eb\u06e8\3\2\2\2\u06eb"+
		"\u06e9\3\2\2\2\u06eb\u06ea\3\2\2\2\u06ec\u0105\3\2\2\2\u06ed\u06ef\7x"+
		"\2\2\u06ee\u06ed\3\2\2\2\u06ee\u06ef\3\2\2\2\u06ef\u06f0\3\2\2\2\u06f0"+
		"\u06f2\7\26\2\2\u06f1\u06f3\5\u010a\u0086\2\u06f2\u06f1\3\2\2\2\u06f2"+
		"\u06f3\3\2\2\2\u06f3\u06f4\3\2\2\2\u06f4\u06f5\7\27\2\2\u06f5\u0107\3"+
		"\2\2\2\u06f6\u06f8\7x\2\2\u06f7\u06f6\3\2\2\2\u06f7\u06f8\3\2\2\2\u06f8"+
		"\u06f9\3\2\2\2\u06f9\u06fb\7\32\2\2\u06fa\u06fc\5\u010c\u0087\2\u06fb"+
		"\u06fa\3\2\2\2\u06fb\u06fc\3\2\2\2\u06fc\u06fd\3\2\2\2\u06fd\u06fe\7\33"+
		"\2\2\u06fe\u0109\3\2\2\2\u06ff\u0700\5\\/\2\u0700\u0709\7\23\2\2\u0701"+
		"\u0706\5\\/\2\u0702\u0703\7\23\2\2\u0703\u0705\5\\/\2\u0704\u0702\3\2"+
		"\2\2\u0705\u0708\3\2\2\2\u0706\u0704\3\2\2\2\u0706\u0707\3\2\2\2\u0707"+
		"\u070a\3\2\2\2\u0708\u0706\3\2\2\2\u0709\u0701\3\2\2\2\u0709\u070a\3\2"+
		"\2\2\u070a\u010b\3\2\2\2\u070b\u0710\5\u010e\u0088\2\u070c\u070d\7\23"+
		"\2\2\u070d\u070f\5\u010e\u0088\2\u070e\u070c\3\2\2\2\u070f\u0712\3\2\2"+
		"\2\u0710\u070e\3\2\2\2\u0710\u0711\3\2\2\2\u0711\u010d\3\2\2\2\u0712\u0710"+
		"\3\2\2\2\u0713\u0714\5\\/\2\u0714\u0715\7\21\2\2\u0715\u0716\5\\/\2\u0716"+
		"\u010f\3\2\2\2\u0717\u0718\5\\/\2\u0718\u0719\7\21\2\2\u0719\u071a\5\\"+
		"/\2\u071a\u0721\3\2\2\2\u071b\u071c\5\\/\2\u071c\u071d\7\21\2\2\u071d"+
		"\u0721\3\2\2\2\u071e\u071f\7\21\2\2\u071f\u0721\5\\/\2\u0720\u0717\3\2"+
		"\2\2\u0720\u071b\3\2\2\2\u0720\u071e\3\2\2\2\u0721\u0111\3\2\2\2\u0722"+
		"\u0723\5\u00b6\\\2\u0723\u0724\5\u012c\u0097\2\u0724\u0725\5\\/\2\u0725"+
		"\u0113\3\2\2\2\u0726\u0727\b\u008b\1\2\u0727\u0728\5\u00b6\\\2\u0728\u072d"+
		"\3\2\2\2\u0729\u072a\f\3\2\2\u072a\u072c\5z>\2\u072b\u0729\3\2\2\2\u072c"+
		"\u072f\3\2\2\2\u072d\u072b\3\2\2\2\u072d\u072e\3\2\2\2\u072e\u0115\3\2"+
		"\2\2\u072f\u072d\3\2\2\2\u0730\u0731\6\u008c/\3\u0731\u0732\7\u00a5\2"+
		"\2\u0732\u0735\5\u00c8e\2\u0733\u0735\5\\/\2\u0734\u0730\3\2\2\2\u0734"+
		"\u0733\3\2\2\2\u0735\u0117\3\2\2\2\u0736\u0737\7\u0087\2\2\u0737\u0738"+
		"\7G\2\2\u0738\u0739\7m\2\2\u0739\u073a\5\\/\2\u073a\u0119\3\2\2\2\u073b"+
		"\u073c\7\u0087\2\2\u073c\u073d\7\177\2\2\u073d\u073e\7m\2\2\u073e\u073f"+
		"\5\\/\2\u073f\u011b\3\2\2\2\u0740\u0745\5\u011e\u0090\2\u0741\u0742\7"+
		"\23\2\2\u0742\u0744\5\u011e\u0090\2\u0743\u0741\3\2\2\2\u0744\u0747\3"+
		"\2\2\2\u0745\u0743\3\2\2\2\u0745\u0746\3\2\2\2\u0746\u011d\3\2\2\2\u0747"+
		"\u0745\3\2\2\2\u0748\u074d\5\u00b6\\\2\u0749\u074a\7\25\2\2\u074a\u074c"+
		"\5\u00b6\\\2\u074b\u0749\3\2\2\2\u074c\u074f\3\2\2\2\u074d\u074b\3\2\2"+
		"\2\u074d\u074e\3\2\2\2\u074e\u0751\3\2\2\2\u074f\u074d\3\2\2\2\u0750\u0752"+
		"\t\6\2\2\u0751\u0750\3\2\2\2\u0751\u0752\3\2\2\2\u0752\u011f\3\2\2\2\u0753"+
		"\u075a\7\"\2\2\u0754\u075a\7#\2\2\u0755\u075a\5\u012e\u0098\2\u0756\u075a"+
		"\5\u0130\u0099\2\u0757\u075a\5\u0132\u009a\2\u0758\u075a\5\u0134\u009b"+
		"\2\u0759\u0753\3\2\2\2\u0759\u0754\3\2\2\2\u0759\u0755\3\2\2\2\u0759\u0756"+
		"\3\2\2\2\u0759\u0757\3\2\2\2\u0759\u0758\3\2\2\2\u075a\u0121\3\2\2\2\u075b"+
		"\u075c\7\u00a5\2\2\u075c\u075d\6\u0092\60\3\u075d\u0123\3\2\2\2\u075e"+
		"\u075f\7\u00a5\2\2\u075f\u0760\6\u0093\61\3\u0760\u0125\3\2\2\2\u0761"+
		"\u0762\7\u00a5\2\2\u0762\u0763\6\u0094\62\3\u0763\u0127\3\2\2\2\u0764"+
		"\u0765\7\u00a5\2\2\u0765\u0766\6\u0095\63\3\u0766\u0129\3\2\2\2\u0767"+
		"\u0768\7\u00a5\2\2\u0768\u0769\6\u0096\64\3\u0769\u012b\3\2\2\2\u076a"+
		"\u076b\7-\2\2\u076b\u012d\3\2\2\2\u076c\u076d\7$\2\2\u076d\u012f\3\2\2"+
		"\2\u076e\u076f\7%\2\2\u076f\u0131\3\2\2\2\u0770\u0771\7&\2\2\u0771\u0133"+
		"\3\2\2\2\u0772\u0773\t\7\2\2\u0773\u0135\3\2\2\2\u0774\u0775\7\u008a\2"+
		"\2\u0775\u0776\5\u0138\u009d\2\u0776\u0777\7\22\2\2\u0777\u077c\3\2\2"+
		"\2\u0778\u0779\5\u0138\u009d\2\u0779\u077a\7\22\2\2\u077a\u077c\3\2\2"+
		"\2\u077b\u0774\3\2\2\2\u077b\u0778\3\2\2\2\u077c\u0137\3\2\2\2\u077d\u077e"+
		"\b\u009d\1\2\u077e\u077f\5\u013a\u009e\2\u077f\u0784\3\2\2\2\u0780\u0781"+
		"\f\3\2\2\u0781\u0783\5\u0140\u00a1\2\u0782\u0780\3\2\2\2\u0783\u0786\3"+
		"\2\2\2\u0784\u0782\3\2\2\2\u0784\u0785\3\2\2\2\u0785\u0139\3\2\2\2\u0786"+
		"\u0784\3\2\2\2\u0787\u078f\5\u013c\u009f\2\u0788\u078f\5\u013e\u00a0\2"+
		"\u0789\u078f\5\u0148\u00a5\2\u078a\u078f\5\u014a\u00a6\2\u078b\u078f\5"+
		"\u014c\u00a7\2\u078c\u078f\5\u0142\u00a2\2\u078d\u078f\5\u0146\u00a4\2"+
		"\u078e\u0787\3\2\2\2\u078e\u0788\3\2\2\2\u078e\u0789\3\2\2\2\u078e\u078a"+
		"\3\2\2\2\u078e\u078b\3\2\2\2\u078e\u078c\3\2\2\2\u078e\u078d\3\2\2\2\u078f"+
		"\u013b\3\2\2\2\u0790\u0791\5\u00fe\u0080\2\u0791\u013d\3\2\2\2\u0792\u0793"+
		"\5\u0122\u0092\2\u0793\u0794\5\u0142\u00a2\2\u0794\u013f\3\2\2\2\u0795"+
		"\u0796\7\25\2\2\u0796\u079b\5\u0142\u00a2\2\u0797\u0798\7\25\2\2\u0798"+
		"\u079b\5\u014e\u00a8\2\u0799\u079b\5\u0146\u00a4\2\u079a\u0795\3\2\2\2"+
		"\u079a\u0797\3\2\2\2\u079a\u0799\3\2\2\2\u079b\u0141\3\2\2\2\u079c\u079d"+
		"\5\u014e\u00a8\2\u079d\u079f\7\26\2\2\u079e\u07a0\5\u0144\u00a3\2\u079f"+
		"\u079e\3\2\2\2\u079f\u07a0\3\2\2\2\u07a0\u07a1\3\2\2\2\u07a1\u07a2\7\27"+
		"\2\2\u07a2\u0143\3\2\2\2\u07a3\u07a4\b\u00a3\1\2\u07a4\u07a5\5\u0138\u009d"+
		"\2\u07a5\u07ab\3\2\2\2\u07a6\u07a7\f\3\2\2\u07a7\u07a8\7\23\2\2\u07a8"+
		"\u07aa\5\u0138\u009d\2\u07a9\u07a6\3\2\2\2\u07aa\u07ad\3\2\2\2\u07ab\u07a9"+
		"\3\2\2\2\u07ab\u07ac\3\2\2\2\u07ac\u0145\3\2\2\2\u07ad\u07ab\3\2\2\2\u07ae"+
		"\u07af\7\30\2\2\u07af\u07b0\5\u0138\u009d\2\u07b0\u07b1\7\31\2\2\u07b1"+
		"\u0147\3\2\2\2\u07b2\u07b3\7\26\2\2\u07b3\u07b4\5\u0138\u009d\2\u07b4"+
		"\u07b5\7\27\2\2\u07b5\u0149\3\2\2\2\u07b6\u07b7\5\u014e\u00a8\2\u07b7"+
		"\u014b\3\2\2\2\u07b8\u07be\7\u00aa\2\2\u07b9\u07be\7\u00ac\2\2\u07ba\u07be"+
		"\7\u00a8\2\2\u07bb\u07be\7\u009f\2\2\u07bc\u07be\7\u00a0\2\2\u07bd\u07b8"+
		"\3\2\2\2\u07bd\u07b9\3\2\2\2\u07bd\u07ba\3\2\2\2\u07bd\u07bb\3\2\2\2\u07bd"+
		"\u07bc\3\2\2\2\u07be\u014d\3\2\2\2\u07bf\u07c0\t\b\2\2\u07c0\u014f\3\2"+
		"\2\2\u07c1\u07c2\7\u008a\2\2\u07c2\u07c5\5\u0152\u00aa\2\u07c3\u07c5\5"+
		"\u0152\u00aa\2\u07c4\u07c1\3\2\2\2\u07c4\u07c3\3\2\2\2\u07c5\u0151\3\2"+
		"\2\2\u07c6\u07c7\b\u00aa\1\2\u07c7\u07c8\5\u0154\u00ab\2\u07c8\u07cd\3"+
		"\2\2\2\u07c9\u07ca\f\3\2\2\u07ca\u07cc\5\u0158\u00ad\2\u07cb\u07c9\3\2"+
		"\2\2\u07cc\u07cf\3\2\2\2\u07cd\u07cb\3\2\2\2\u07cd\u07ce\3\2\2\2\u07ce"+
		"\u0153\3\2\2\2\u07cf\u07cd\3\2\2\2\u07d0\u07d6\5\u0156\u00ac\2\u07d1\u07d6"+
		"\5\u0162\u00b2\2\u07d2\u07d6\5\u0164\u00b3\2\u07d3\u07d6\5\u0166\u00b4"+
		"\2\u07d4\u07d6\5\u015a\u00ae\2\u07d5\u07d0\3\2\2\2\u07d5\u07d1\3\2\2\2"+
		"\u07d5\u07d2\3\2\2\2\u07d5\u07d3\3\2\2\2\u07d5\u07d4\3\2\2\2\u07d6\u0155"+
		"\3\2\2\2\u07d7\u07d8\5\u00fe\u0080\2\u07d8\u0157\3\2\2\2\u07d9\u07da\7"+
		"\25\2\2\u07da\u07e0\5\u015a\u00ae\2\u07db\u07dc\7\30\2\2\u07dc\u07dd\5"+
		"\u0152\u00aa\2\u07dd\u07de\7\31\2\2\u07de\u07e0\3\2\2\2\u07df\u07d9\3"+
		"\2\2\2\u07df\u07db\3\2\2\2\u07e0\u0159\3\2\2\2\u07e1\u07e2\5\u0168\u00b5"+
		"\2\u07e2\u07e4\7\26\2\2\u07e3\u07e5\5\u015c\u00af\2\u07e4\u07e3\3\2\2"+
		"\2\u07e4\u07e5\3\2\2\2\u07e5\u07e6\3\2\2\2\u07e6\u07e7\7\27\2\2\u07e7"+
		"\u015b\3\2\2\2\u07e8\u07ef\5\u015e\u00b0\2\u07e9\u07ef\5\u0160\u00b1\2"+
		"\u07ea\u07eb\5\u015e\u00b0\2\u07eb\u07ec\7\23\2\2\u07ec\u07ed\5\u0160"+
		"\u00b1\2\u07ed\u07ef\3\2\2\2\u07ee\u07e8\3\2\2\2\u07ee\u07e9\3\2\2\2\u07ee"+
		"\u07ea\3\2\2\2\u07ef\u015d\3\2\2\2\u07f0\u07f1\b\u00b0\1\2\u07f1\u07f2"+
		"\5\u0152\u00aa\2\u07f2\u07f8\3\2\2\2\u07f3\u07f4\f\3\2\2\u07f4\u07f5\7"+
		"\23\2\2\u07f5\u07f7\5\u0152\u00aa\2\u07f6\u07f3\3\2\2\2\u07f7\u07fa\3"+
		"\2\2\2\u07f8\u07f6\3\2\2\2\u07f8\u07f9\3\2\2\2\u07f9\u015f\3\2\2\2\u07fa"+
		"\u07f8\3\2\2\2\u07fb\u07fc\b\u00b1\1\2\u07fc\u07fd\5\u0168\u00b5\2\u07fd"+
		"\u07fe\7-\2\2\u07fe\u07ff\5\u0152\u00aa\2\u07ff\u0808\3\2\2\2\u0800\u0801"+
		"\f\3\2\2\u0801\u0802\7\23\2\2\u0802\u0803\5\u0168\u00b5\2\u0803\u0804"+
		"\7-\2\2\u0804\u0805\5\u0152\u00aa\2\u0805\u0807\3\2\2\2\u0806\u0800\3"+
		"\2\2\2\u0807\u080a\3\2\2\2\u0808\u0806\3\2\2\2\u0808\u0809\3\2\2\2\u0809"+
		"\u0161\3\2\2\2\u080a\u0808\3\2\2\2\u080b\u080c\7\26\2\2\u080c\u080d\5"+
		"\u0152\u00aa\2\u080d\u080e\7\27\2\2\u080e\u0163\3\2\2\2\u080f\u0810\b"+
		"\u00b3\1\2\u0810\u0813\7\u00a7\2\2\u0811\u0813\5\u0168\u00b5\2\u0812\u080f"+
		"\3\2\2\2\u0812\u0811\3\2\2\2\u0813\u0819\3\2\2\2\u0814\u0815\f\3\2\2\u0815"+
		"\u0816\7\25\2\2\u0816\u0818\5\u0168\u00b5\2\u0817\u0814\3\2\2\2\u0818"+
		"\u081b\3\2\2\2\u0819\u0817\3\2\2\2\u0819\u081a\3\2\2\2\u081a\u0165\3\2"+
		"\2\2\u081b\u0819\3\2\2\2\u081c\u0822\7\u00aa\2\2\u081d\u0822\7\u00ac\2"+
		"\2\u081e\u0822\7\u00a8\2\2\u081f\u0822\7\u009f\2\2\u0820\u0822\7\u00a0"+
		"\2\2\u0821\u081c\3\2\2\2\u0821\u081d\3\2\2\2\u0821\u081e\3\2\2\2\u0821"+
		"\u081f\3\2\2\2\u0821\u0820\3\2\2\2\u0822\u0167\3\2\2\2\u0823\u0824\t\t"+
		"\2\2\u0824\u0169\3\2\2\2\u0825\u0826\7\u008a\2\2\u0826\u0827\5\u016c\u00b7"+
		"\2\u0827\u0828\7\22\2\2\u0828\u082d\3\2\2\2\u0829\u082a\5\u016c\u00b7"+
		"\2\u082a\u082b\7\22\2\2\u082b\u082d\3\2\2\2\u082c\u0825\3\2\2\2\u082c"+
		"\u0829\3\2\2\2\u082d\u016b\3\2\2\2\u082e\u082f\b\u00b7\1\2\u082f\u0830"+
		"\5\u016e\u00b8\2\u0830\u0835\3\2\2\2\u0831\u0832\f\3\2\2\u0832\u0834\5"+
		"\u0174\u00bb\2\u0833\u0831\3\2\2\2\u0834\u0837\3\2\2\2\u0835\u0833\3\2"+
		"\2\2\u0835\u0836\3\2\2\2\u0836\u016d\3\2\2\2\u0837\u0835\3\2\2\2\u0838"+
		"\u083e\5\u0170\u00b9\2\u0839\u083e\5\u0172\u00ba\2\u083a\u083e\5\u017c"+
		"\u00bf\2\u083b\u083e\5\u017e\u00c0\2\u083c\u083e\5\u0182\u00c2\2\u083d"+
		"\u0838\3\2\2\2\u083d\u0839\3\2\2\2\u083d\u083a\3\2\2\2\u083d\u083b\3\2"+
		"\2\2\u083d\u083c\3\2\2\2\u083e\u016f\3\2\2\2\u083f\u0840\5\u00fe\u0080"+
		"\2\u0840\u0171\3\2\2\2\u0841\u0842\5\u0122\u0092\2\u0842\u0843\5\u0176"+
		"\u00bc\2\u0843\u0173\3\2\2\2\u0844\u0845\7\25\2\2\u0845\u0848\5\u0176"+
		"\u00bc\2\u0846\u0848\5\u017a\u00be\2\u0847\u0844\3\2\2\2\u0847\u0846\3"+
		"\2\2\2\u0848\u0175\3\2\2\2\u0849\u084a\5\u0184\u00c3\2\u084a\u084c\7\26"+
		"\2\2\u084b\u084d\5\u0178\u00bd\2\u084c\u084b\3\2\2\2\u084c\u084d\3\2\2"+
		"\2\u084d\u084e\3\2\2\2\u084e\u084f\7\27\2\2\u084f\u0177\3\2\2\2\u0850"+
		"\u0851\b\u00bd\1\2\u0851\u0852\5\u016c\u00b7\2\u0852\u0858\3\2\2\2\u0853"+
		"\u0854\f\3\2\2\u0854\u0855\7\23\2\2\u0855\u0857\5\u016c\u00b7\2\u0856"+
		"\u0853\3\2\2\2\u0857\u085a\3\2\2\2\u0858\u0856\3\2\2\2\u0858\u0859\3\2"+
		"\2\2\u0859\u0179\3\2\2\2\u085a\u0858\3\2\2\2\u085b\u085c\7\30\2\2\u085c"+
		"\u085d\5\u016c\u00b7\2\u085d\u085e\7\31\2\2\u085e\u017b\3\2\2\2\u085f"+
		"\u0860\7\26\2\2\u0860\u0861\5\u016c\u00b7\2\u0861\u0862\7\27\2\2\u0862"+
		"\u017d\3\2\2\2\u0863\u0864\b\u00c0\1\2\u0864\u0865\5\u0184\u00c3\2\u0865"+
		"\u086b\3\2\2\2\u0866\u0867\f\3\2\2\u0867\u0868\7\25\2\2\u0868\u086a\5"+
		"\u0184\u00c3\2\u0869\u0866\3\2\2\2\u086a\u086d\3\2\2\2\u086b\u0869\3\2"+
		"\2\2\u086b\u086c\3\2\2\2\u086c\u017f\3\2\2\2\u086d\u086b\3\2\2\2\u086e"+
		"\u086f\b\u00c1\1\2\u086f\u0870\5\u017e\u00c0\2\u0870\u0875\3\2\2\2\u0871"+
		"\u0872\f\3\2\2\u0872\u0874\7\u00a7\2\2\u0873\u0871\3\2\2\2\u0874\u0877"+
		"\3\2\2\2\u0875\u0873\3\2\2\2\u0875\u0876\3\2\2\2\u0876\u0181\3\2\2\2\u0877"+
		"\u0875\3\2\2\2\u0878\u087e\7\u00aa\2\2\u0879\u087e\7\u00ac\2\2\u087a\u087e"+
		"\7\u00a8\2\2\u087b\u087e\7\u009f\2\2\u087c\u087e\7\u00a0\2\2\u087d\u0878"+
		"\3\2\2\2\u087d\u0879\3\2\2\2\u087d\u087a\3\2\2\2\u087d\u087b\3\2\2\2\u087d"+
		"\u087c\3\2\2\2\u087e\u0183\3\2\2\2\u087f\u0880\t\n\2\2\u0880\u0185\3\2"+
		"\2\2\u0881\u0882\7\u008a\2\2\u0882\u0883\5\u0188\u00c5\2\u0883\u0884\7"+
		"\22\2\2\u0884\u0889\3\2\2\2\u0885\u0886\5\u0188\u00c5\2\u0886\u0887\7"+
		"\22\2\2\u0887\u0889\3\2\2\2\u0888\u0881\3\2\2\2\u0888\u0885\3\2\2\2\u0889"+
		"\u0187\3\2\2\2\u088a\u088b\b\u00c5\1\2\u088b\u088c\5\u018a\u00c6\2\u088c"+
		"\u0891\3\2\2\2\u088d\u088e\f\3\2\2\u088e\u0890\5\u0190\u00c9\2\u088f\u088d"+
		"\3\2\2\2\u0890\u0893\3\2\2\2\u0891\u088f\3\2\2\2\u0891\u0892\3\2\2\2\u0892"+
		"\u0189\3\2\2\2\u0893\u0891\3\2\2\2\u0894\u089a\5\u018c\u00c7\2\u0895\u089a"+
		"\5\u018e\u00c8\2\u0896\u089a\5\u0198\u00cd\2\u0897\u089a\5\u019a\u00ce"+
		"\2\u0898\u089a\5\u019c\u00cf\2\u0899\u0894\3\2\2\2\u0899\u0895\3\2\2\2"+
		"\u0899\u0896\3\2\2\2\u0899\u0897\3\2\2\2\u0899\u0898\3\2\2\2\u089a\u018b"+
		"\3\2\2\2\u089b\u089c\5\u00fe\u0080\2\u089c\u018d\3\2\2\2\u089d\u089e\5"+
		"\u0122\u0092\2\u089e\u089f\5\u0192\u00ca\2\u089f\u018f\3\2\2\2\u08a0\u08a1"+
		"\7\25\2\2\u08a1\u08a4\5\u0192\u00ca\2\u08a2\u08a4\5\u0196\u00cc\2\u08a3"+
		"\u08a0\3\2\2\2\u08a3\u08a2\3\2\2\2\u08a4\u0191\3\2\2\2\u08a5\u08a6\5\u019e"+
		"\u00d0\2\u08a6\u08a8\7\26\2\2\u08a7\u08a9\5\u0194\u00cb\2\u08a8\u08a7"+
		"\3\2\2\2\u08a8\u08a9\3\2\2\2\u08a9\u08aa\3\2\2\2\u08aa\u08ab\7\27\2\2"+
		"\u08ab\u0193\3\2\2\2\u08ac\u08ad\b\u00cb\1\2\u08ad\u08ae\5\u0188\u00c5"+
		"\2\u08ae\u08b4\3\2\2\2\u08af\u08b0\f\3\2\2\u08b0\u08b1\7\23\2\2\u08b1"+
		"\u08b3\5\u0188\u00c5\2\u08b2\u08af\3\2\2\2\u08b3\u08b6\3\2\2\2\u08b4\u08b2"+
		"\3\2\2\2\u08b4\u08b5\3\2\2\2\u08b5\u0195\3\2\2\2\u08b6\u08b4\3\2\2\2\u08b7"+
		"\u08b8\7\30\2\2\u08b8\u08b9\5\u0188\u00c5\2\u08b9\u08ba\7\31\2\2\u08ba"+
		"\u0197\3\2\2\2\u08bb\u08bc\7\26\2\2\u08bc\u08bd\5\u0188\u00c5\2\u08bd"+
		"\u08be\7\27\2\2\u08be\u0199\3\2\2\2\u08bf\u08c0\b\u00ce\1\2\u08c0\u08c3"+
		"\7\u00a7\2\2\u08c1\u08c3\5\u019e\u00d0\2\u08c2\u08bf\3\2\2\2\u08c2\u08c1"+
		"\3\2\2\2\u08c3\u08c9\3\2\2\2\u08c4\u08c5\f\3\2\2\u08c5\u08c6\7\25\2\2"+
		"\u08c6\u08c8\5\u019e\u00d0\2\u08c7\u08c4\3\2\2\2\u08c8\u08cb\3\2\2\2\u08c9"+
		"\u08c7\3\2\2\2\u08c9\u08ca\3\2\2\2\u08ca\u019b\3\2\2\2\u08cb\u08c9\3\2"+
		"\2\2\u08cc\u08d2\7\u00aa\2\2\u08cd\u08d2\7\u00ac\2\2\u08ce\u08d2\7\u00a8"+
		"\2\2\u08cf\u08d2\7\u009f\2\2\u08d0\u08d2\7\u00a0\2\2\u08d1\u08cc\3\2\2"+
		"\2\u08d1\u08cd\3\2\2\2\u08d1\u08ce\3\2\2\2\u08d1\u08cf\3\2\2\2\u08d1\u08d0"+
		"\3\2\2\2\u08d2\u019d\3\2\2\2\u08d3\u08d4\t\13\2\2\u08d4\u019f\3\2\2\2"+
		"\u00bb\u01a6\u01a9\u01c2\u01c7\u01d5\u01db\u01dd\u01df\u01e6\u01eb\u01f6"+
		"\u01fd\u020a\u0218\u022c\u0243\u024e\u0255\u025e\u0267\u0270\u0285\u028d"+
		"\u0292\u0298\u029d\u02a6\u02ab\u02b0\u02c8\u02d3\u02d7\u02ec\u0306\u030b"+
		"\u0314\u031d\u0326\u0343\u0356\u035c\u037e\u0387\u039e\u03ac\u03b5\u03be"+
		"\u03d5\u03db\u03ef\u0457\u0459\u0465\u0470\u047f\u0484\u048b\u0492\u049b"+
		"\u04a2\u04b7\u04c2\u04c6\u04cb\u04d0\u04d2\u04d6\u04df\u04ef\u04f8\u04fe"+
		"\u0503\u050a\u0512\u051d\u0525\u052d\u0533\u053b\u0544\u054c\u0559\u055c"+
		"\u0560\u0565\u0569\u0572\u0587\u0591\u0593\u0598\u05a9\u05ae\u05b7\u05be"+
		"\u05c3\u05c8\u05d7\u05dc\u05df\u05e3\u05e8\u05ef\u05fa\u05fc\u0605\u060d"+
		"\u0615\u061b\u0627\u062b\u0635\u063a\u0640\u0647\u064c\u0653\u065b\u0662"+
		"\u066c\u0679\u067d\u0680\u0684\u0687\u068f\u0698\u06a1\u06aa\u06bb\u06cc"+
		"\u06d3\u06da\u06e4\u06eb\u06ee\u06f2\u06f7\u06fb\u0706\u0709\u0710\u0720"+
		"\u072d\u0734\u0745\u074d\u0751\u0759\u077b\u0784\u078e\u079a\u079f\u07ab"+
		"\u07bd\u07c4\u07cd\u07d5\u07df\u07e4\u07ee\u07f8\u0808\u0812\u0819\u0821"+
		"\u082c\u0835\u083d\u0847\u084c\u0858\u086b\u0875\u087d\u0888\u0891\u0899"+
		"\u08a3\u08a8\u08b4\u08c2\u08c9\u08d1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}