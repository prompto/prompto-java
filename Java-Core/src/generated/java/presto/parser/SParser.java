// Generated from SParser.g4 by ANTLR 4.5
package presto.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SParser extends AbstractParser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INDENT=1, DEDENT=2, LF_TAB=3, LF_MORE=4, LF=5, TAB=6, WS=7, JAVA=8, CSHARP=9, 
		PYTHON2=10, PYTHON3=11, JAVASCRIPT=12, SWIFT=13, COLON=14, SEMI=15, COMMA=16, 
		RANGE=17, DOT=18, LPAR=19, RPAR=20, LBRAK=21, RBRAK=22, LCURL=23, RCURL=24, 
		QMARK=25, XMARK=26, AMP=27, AMP2=28, PIPE=29, PIPE2=30, PLUS=31, MINUS=32, 
		STAR=33, SLASH=34, BSLASH=35, PERCENT=36, GT=37, GTE=38, LT=39, LTE=40, 
		LTGT=41, EQ=42, XEQ=43, EQ2=44, TEQ=45, TILDE=46, LARROW=47, RARROW=48, 
		BOOLEAN=49, CHARACTER=50, TEXT=51, INTEGER=52, DECIMAL=53, DATE=54, TIME=55, 
		DATETIME=56, PERIOD=57, METHOD_T=58, CODE=59, DOCUMENT=60, ABSTRACT=61, 
		ALL=62, ALWAYS=63, AND=64, ANY=65, AS=66, ATTR=67, ATTRIBUTE=68, ATTRIBUTES=69, 
		BINDINGS=70, CASE=71, CATCH=72, CATEGORY=73, CLASS=74, CLOSE=75, CONTAINS=76, 
		DEF=77, DEFAULT=78, DEFINE=79, DO=80, DOING=81, EACH=82, ELSE=83, ENUM=84, 
		ENUMERATED=85, EXCEPT=86, EXECUTE=87, EXPECTING=88, EXTENDS=89, FETCH=90, 
		FINALLY=91, FOR=92, FROM=93, GETTER=94, IF=95, IN=96, INVOKE=97, IS=98, 
		MATCHING=99, METHOD=100, METHODS=101, MODULO=102, MUTABLE=103, NATIVE=104, 
		NONE=105, NOT=106, NOTHING=107, NULL=108, ON=109, OPEN=110, OPERATOR=111, 
		OR=112, OTHERWISE=113, PASS=114, RAISE=115, READ=116, RECEIVING=117, RESOURCE=118, 
		RETURN=119, RETURNING=120, SELF=121, SETTER=122, SINGLETON=123, SORTED=124, 
		SWITCH=125, TEST=126, THIS=127, THROW=128, TO=129, TRY=130, WITH=131, 
		WHEN=132, WHERE=133, WHILE=134, WRITE=135, BOOLEAN_LITERAL=136, CHAR_LITERAL=137, 
		MIN_INTEGER=138, MAX_INTEGER=139, SYMBOL_IDENTIFIER=140, TYPE_IDENTIFIER=141, 
		VARIABLE_IDENTIFIER=142, NATIVE_IDENTIFIER=143, DOLLAR_IDENTIFIER=144, 
		TEXT_LITERAL=145, INTEGER_LITERAL=146, HEXA_LITERAL=147, DECIMAL_LITERAL=148, 
		DATETIME_LITERAL=149, TIME_LITERAL=150, DATE_LITERAL=151, PERIOD_LITERAL=152, 
		COMMENT=153;
	public static final int
		RULE_enum_category_declaration = 0, RULE_enum_native_declaration = 1, 
		RULE_native_symbol = 2, RULE_category_symbol = 3, RULE_attribute_declaration = 4, 
		RULE_concrete_category_declaration = 5, RULE_singleton_category_declaration = 6, 
		RULE_derived_list = 7, RULE_operator_method_declaration = 8, RULE_setter_method_declaration = 9, 
		RULE_getter_method_declaration = 10, RULE_native_category_declaration = 11, 
		RULE_native_resource_declaration = 12, RULE_native_category_bindings = 13, 
		RULE_native_category_binding_list = 14, RULE_attribute_list = 15, RULE_abstract_method_declaration = 16, 
		RULE_concrete_method_declaration = 17, RULE_native_method_declaration = 18, 
		RULE_test_method_declaration = 19, RULE_assertion = 20, RULE_typed_argument = 21, 
		RULE_statement = 22, RULE_method_call = 23, RULE_method_selector = 24, 
		RULE_callable_parent = 25, RULE_callable_selector = 26, RULE_with_resource_statement = 27, 
		RULE_with_singleton_statement = 28, RULE_switch_statement = 29, RULE_switch_case_statement = 30, 
		RULE_for_each_statement = 31, RULE_do_while_statement = 32, RULE_while_statement = 33, 
		RULE_if_statement = 34, RULE_else_if_statement_list = 35, RULE_raise_statement = 36, 
		RULE_try_statement = 37, RULE_catch_statement = 38, RULE_return_statement = 39, 
		RULE_expression = 40, RULE_closure_expression = 41, RULE_instance_expression = 42, 
		RULE_method_expression = 43, RULE_instance_selector = 44, RULE_document_expression = 45, 
		RULE_constructor_expression = 46, RULE_argument_assignment_list = 47, 
		RULE_argument_assignment = 48, RULE_read_expression = 49, RULE_write_statement = 50, 
		RULE_fetch_expression = 51, RULE_sorted_expression = 52, RULE_assign_instance_statement = 53, 
		RULE_child_instance = 54, RULE_assign_tuple_statement = 55, RULE_lfs = 56, 
		RULE_lfp = 57, RULE_indent = 58, RULE_dedent = 59, RULE_null_literal = 60, 
		RULE_declaration_list = 61, RULE_declarations = 62, RULE_declaration = 63, 
		RULE_resource_declaration = 64, RULE_enum_declaration = 65, RULE_native_symbol_list = 66, 
		RULE_category_symbol_list = 67, RULE_symbol_list = 68, RULE_attribute_constraint = 69, 
		RULE_list_literal = 70, RULE_set_literal = 71, RULE_expression_list = 72, 
		RULE_range_literal = 73, RULE_typedef = 74, RULE_primary_type = 75, RULE_native_type = 76, 
		RULE_category_type = 77, RULE_code_type = 78, RULE_document_type = 79, 
		RULE_category_declaration = 80, RULE_type_identifier_list = 81, RULE_method_identifier = 82, 
		RULE_identifier = 83, RULE_variable_identifier = 84, RULE_type_identifier = 85, 
		RULE_symbol_identifier = 86, RULE_argument_list = 87, RULE_argument = 88, 
		RULE_operator_argument = 89, RULE_named_argument = 90, RULE_code_argument = 91, 
		RULE_category_or_any_type = 92, RULE_any_type = 93, RULE_member_method_declaration_list = 94, 
		RULE_member_method_declaration = 95, RULE_native_member_method_declaration_list = 96, 
		RULE_native_member_method_declaration = 97, RULE_native_category_binding = 98, 
		RULE_python_category_binding = 99, RULE_python_module = 100, RULE_module_token = 101, 
		RULE_javascript_category_binding = 102, RULE_javascript_module = 103, 
		RULE_variable_identifier_list = 104, RULE_method_declaration = 105, RULE_native_statement_list = 106, 
		RULE_native_statement = 107, RULE_python_native_statement = 108, RULE_javascript_native_statement = 109, 
		RULE_statement_list = 110, RULE_assertion_list = 111, RULE_switch_case_statement_list = 112, 
		RULE_catch_statement_list = 113, RULE_literal_collection = 114, RULE_atomic_literal = 115, 
		RULE_literal_list_literal = 116, RULE_selectable_expression = 117, RULE_this_expression = 118, 
		RULE_parenthesis_expression = 119, RULE_literal_expression = 120, RULE_collection_literal = 121, 
		RULE_tuple_literal = 122, RULE_dict_literal = 123, RULE_expression_tuple = 124, 
		RULE_dict_entry_list = 125, RULE_dict_entry = 126, RULE_slice_arguments = 127, 
		RULE_assign_variable_statement = 128, RULE_assignable_instance = 129, 
		RULE_is_expression = 130, RULE_operator = 131, RULE_key_token = 132, RULE_value_token = 133, 
		RULE_symbols_token = 134, RULE_assign = 135, RULE_multiply = 136, RULE_divide = 137, 
		RULE_idivide = 138, RULE_modulo = 139, RULE_javascript_statement = 140, 
		RULE_javascript_expression = 141, RULE_javascript_primary_expression = 142, 
		RULE_javascript_selector_expression = 143, RULE_javascript_method_expression = 144, 
		RULE_javascript_arguments = 145, RULE_javascript_item_expression = 146, 
		RULE_javascript_parenthesis_expression = 147, RULE_javascript_identifier_expression = 148, 
		RULE_javascript_literal_expression = 149, RULE_javascript_identifier = 150, 
		RULE_python_statement = 151, RULE_python_expression = 152, RULE_python_primary_expression = 153, 
		RULE_python_selector_expression = 154, RULE_python_method_expression = 155, 
		RULE_python_argument_list = 156, RULE_python_ordinal_argument_list = 157, 
		RULE_python_named_argument_list = 158, RULE_python_parenthesis_expression = 159, 
		RULE_python_identifier_expression = 160, RULE_python_literal_expression = 161, 
		RULE_python_identifier = 162, RULE_java_statement = 163, RULE_java_expression = 164, 
		RULE_java_primary_expression = 165, RULE_java_this_expression = 166, RULE_java_selector_expression = 167, 
		RULE_java_method_expression = 168, RULE_java_arguments = 169, RULE_java_item_expression = 170, 
		RULE_java_parenthesis_expression = 171, RULE_java_identifier_expression = 172, 
		RULE_java_class_identifier_expression = 173, RULE_java_literal_expression = 174, 
		RULE_java_identifier = 175, RULE_csharp_statement = 176, RULE_csharp_expression = 177, 
		RULE_csharp_primary_expression = 178, RULE_csharp_this_expression = 179, 
		RULE_csharp_selector_expression = 180, RULE_csharp_method_expression = 181, 
		RULE_csharp_arguments = 182, RULE_csharp_item_expression = 183, RULE_csharp_parenthesis_expression = 184, 
		RULE_csharp_identifier_expression = 185, RULE_csharp_literal_expression = 186, 
		RULE_csharp_identifier = 187;
	public static final String[] ruleNames = {
		"enum_category_declaration", "enum_native_declaration", "native_symbol", 
		"category_symbol", "attribute_declaration", "concrete_category_declaration", 
		"singleton_category_declaration", "derived_list", "operator_method_declaration", 
		"setter_method_declaration", "getter_method_declaration", "native_category_declaration", 
		"native_resource_declaration", "native_category_bindings", "native_category_binding_list", 
		"attribute_list", "abstract_method_declaration", "concrete_method_declaration", 
		"native_method_declaration", "test_method_declaration", "assertion", "typed_argument", 
		"statement", "method_call", "method_selector", "callable_parent", "callable_selector", 
		"with_resource_statement", "with_singleton_statement", "switch_statement", 
		"switch_case_statement", "for_each_statement", "do_while_statement", "while_statement", 
		"if_statement", "else_if_statement_list", "raise_statement", "try_statement", 
		"catch_statement", "return_statement", "expression", "closure_expression", 
		"instance_expression", "method_expression", "instance_selector", "document_expression", 
		"constructor_expression", "argument_assignment_list", "argument_assignment", 
		"read_expression", "write_statement", "fetch_expression", "sorted_expression", 
		"assign_instance_statement", "child_instance", "assign_tuple_statement", 
		"lfs", "lfp", "indent", "dedent", "null_literal", "declaration_list", 
		"declarations", "declaration", "resource_declaration", "enum_declaration", 
		"native_symbol_list", "category_symbol_list", "symbol_list", "attribute_constraint", 
		"list_literal", "set_literal", "expression_list", "range_literal", "typedef", 
		"primary_type", "native_type", "category_type", "code_type", "document_type", 
		"category_declaration", "type_identifier_list", "method_identifier", "identifier", 
		"variable_identifier", "type_identifier", "symbol_identifier", "argument_list", 
		"argument", "operator_argument", "named_argument", "code_argument", "category_or_any_type", 
		"any_type", "member_method_declaration_list", "member_method_declaration", 
		"native_member_method_declaration_list", "native_member_method_declaration", 
		"native_category_binding", "python_category_binding", "python_module", 
		"module_token", "javascript_category_binding", "javascript_module", "variable_identifier_list", 
		"method_declaration", "native_statement_list", "native_statement", "python_native_statement", 
		"javascript_native_statement", "statement_list", "assertion_list", "switch_case_statement_list", 
		"catch_statement_list", "literal_collection", "atomic_literal", "literal_list_literal", 
		"selectable_expression", "this_expression", "parenthesis_expression", 
		"literal_expression", "collection_literal", "tuple_literal", "dict_literal", 
		"expression_tuple", "dict_entry_list", "dict_entry", "slice_arguments", 
		"assign_variable_statement", "assignable_instance", "is_expression", "operator", 
		"key_token", "value_token", "symbols_token", "assign", "multiply", "divide", 
		"idivide", "modulo", "javascript_statement", "javascript_expression", 
		"javascript_primary_expression", "javascript_selector_expression", "javascript_method_expression", 
		"javascript_arguments", "javascript_item_expression", "javascript_parenthesis_expression", 
		"javascript_identifier_expression", "javascript_literal_expression", "javascript_identifier", 
		"python_statement", "python_expression", "python_primary_expression", 
		"python_selector_expression", "python_method_expression", "python_argument_list", 
		"python_ordinal_argument_list", "python_named_argument_list", "python_parenthesis_expression", 
		"python_identifier_expression", "python_literal_expression", "python_identifier", 
		"java_statement", "java_expression", "java_primary_expression", "java_this_expression", 
		"java_selector_expression", "java_method_expression", "java_arguments", 
		"java_item_expression", "java_parenthesis_expression", "java_identifier_expression", 
		"java_class_identifier_expression", "java_literal_expression", "java_identifier", 
		"csharp_statement", "csharp_expression", "csharp_primary_expression", 
		"csharp_this_expression", "csharp_selector_expression", "csharp_method_expression", 
		"csharp_arguments", "csharp_item_expression", "csharp_parenthesis_expression", 
		"csharp_identifier_expression", "csharp_literal_expression", "csharp_identifier"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, "'\t'", "' '", "'Java:'", "'C#:'", 
		"'Python2:'", "'Python3:'", "'JavaScript:'", "'Swift:'", "':'", "';'", 
		"','", "'..'", "'.'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'?'", 
		"'!'", "'&'", "'&&'", "'|'", "'||'", "'+'", "'-'", "'*'", "'/'", "'\\'", 
		"'%'", "'>'", "'>='", "'<'", "'<='", "'<>'", "'='", "'!='", "'=='", "'~='", 
		"'~'", "'<-'", "'->'", "'Boolean'", "'Character'", "'Text'", "'Integer'", 
		"'Decimal'", "'Date'", "'Time'", "'DateTime'", "'Period'", "'Method'", 
		"'Code'", "'Document'", "'abstract'", "'all'", "'always'", "'and'", "'any'", 
		"'as'", "'attr'", "'attribute'", "'attributes'", "'bindings'", "'case'", 
		"'catch'", "'category'", "'class'", "'close'", "'contains'", "'def'", 
		"'default'", "'define'", "'do'", "'doing'", "'each'", "'else'", "'enum'", 
		"'enumerated'", "'except'", "'execute'", "'expecting'", "'extends'", "'fetch'", 
		"'finally'", "'for'", "'from'", "'getter'", "'if'", "'in'", "'invoke'", 
		"'is'", "'matching'", "'method'", "'methods'", "'modulo'", "'mutable'", 
		"'native'", "'None'", "'not'", null, "'null'", "'on'", "'open'", "'operator'", 
		"'or'", "'otherwise'", "'pass'", "'raise'", "'read'", "'receiving'", "'resource'", 
		"'return'", "'returning'", "'self'", "'setter'", "'singleton'", "'sorted'", 
		"'switch'", "'test'", "'this'", "'throw'", "'to'", "'try'", "'with'", 
		"'when'", "'where'", "'while'", "'write'", null, null, "'MIN_INTEGER'", 
		"'MAX_INTEGER'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INDENT", "DEDENT", "LF_TAB", "LF_MORE", "LF", "TAB", "WS", "JAVA", 
		"CSHARP", "PYTHON2", "PYTHON3", "JAVASCRIPT", "SWIFT", "COLON", "SEMI", 
		"COMMA", "RANGE", "DOT", "LPAR", "RPAR", "LBRAK", "RBRAK", "LCURL", "RCURL", 
		"QMARK", "XMARK", "AMP", "AMP2", "PIPE", "PIPE2", "PLUS", "MINUS", "STAR", 
		"SLASH", "BSLASH", "PERCENT", "GT", "GTE", "LT", "LTE", "LTGT", "EQ", 
		"XEQ", "EQ2", "TEQ", "TILDE", "LARROW", "RARROW", "BOOLEAN", "CHARACTER", 
		"TEXT", "INTEGER", "DECIMAL", "DATE", "TIME", "DATETIME", "PERIOD", "METHOD_T", 
		"CODE", "DOCUMENT", "ABSTRACT", "ALL", "ALWAYS", "AND", "ANY", "AS", "ATTR", 
		"ATTRIBUTE", "ATTRIBUTES", "BINDINGS", "CASE", "CATCH", "CATEGORY", "CLASS", 
		"CLOSE", "CONTAINS", "DEF", "DEFAULT", "DEFINE", "DO", "DOING", "EACH", 
		"ELSE", "ENUM", "ENUMERATED", "EXCEPT", "EXECUTE", "EXPECTING", "EXTENDS", 
		"FETCH", "FINALLY", "FOR", "FROM", "GETTER", "IF", "IN", "INVOKE", "IS", 
		"MATCHING", "METHOD", "METHODS", "MODULO", "MUTABLE", "NATIVE", "NONE", 
		"NOT", "NOTHING", "NULL", "ON", "OPEN", "OPERATOR", "OR", "OTHERWISE", 
		"PASS", "RAISE", "READ", "RECEIVING", "RESOURCE", "RETURN", "RETURNING", 
		"SELF", "SETTER", "SINGLETON", "SORTED", "SWITCH", "TEST", "THIS", "THROW", 
		"TO", "TRY", "WITH", "WHEN", "WHERE", "WHILE", "WRITE", "BOOLEAN_LITERAL", 
		"CHAR_LITERAL", "MIN_INTEGER", "MAX_INTEGER", "SYMBOL_IDENTIFIER", "TYPE_IDENTIFIER", 
		"VARIABLE_IDENTIFIER", "NATIVE_IDENTIFIER", "DOLLAR_IDENTIFIER", "TEXT_LITERAL", 
		"INTEGER_LITERAL", "HEXA_LITERAL", "DECIMAL_LITERAL", "DATETIME_LITERAL", 
		"TIME_LITERAL", "DATE_LITERAL", "PERIOD_LITERAL", "COMMENT"
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
	public String getGrammarFileName() { return "SParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Enum_category_declarationContext extends ParserRuleContext {
		public Type_identifierContext name;
		public Type_identifierContext derived;
		public Attribute_listContext attrs;
		public Category_symbol_listContext symbols;
		public TerminalNode ENUM() { return getToken(SParser.ENUM, 0); }
		public TerminalNode LPAR() { return getToken(SParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SParser.RPAR, 0); }
		public TerminalNode COLON() { return getToken(SParser.COLON, 0); }
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
		public Attribute_listContext attribute_list() {
			return getRuleContext(Attribute_listContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(SParser.COMMA, 0); }
		public Enum_category_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_category_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterEnum_category_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitEnum_category_declaration(this);
		}
	}

	public final Enum_category_declarationContext enum_category_declaration() throws RecognitionException {
		Enum_category_declarationContext _localctx = new Enum_category_declarationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_enum_category_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376); 
			match(ENUM);
			setState(377); 
			((Enum_category_declarationContext)_localctx).name = type_identifier();
			setState(378); 
			match(LPAR);
			setState(385);
			switch (_input.LA(1)) {
			case TYPE_IDENTIFIER:
				{
				setState(379); 
				((Enum_category_declarationContext)_localctx).derived = type_identifier();
				setState(382);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(380); 
					match(COMMA);
					setState(381); 
					((Enum_category_declarationContext)_localctx).attrs = attribute_list();
					}
				}

				}
				break;
			case VARIABLE_IDENTIFIER:
				{
				setState(384); 
				((Enum_category_declarationContext)_localctx).attrs = attribute_list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(387); 
			match(RPAR);
			setState(388); 
			match(COLON);
			setState(389); 
			indent();
			setState(390); 
			((Enum_category_declarationContext)_localctx).symbols = category_symbol_list(0);
			setState(391); 
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
		public TerminalNode ENUM() { return getToken(SParser.ENUM, 0); }
		public TerminalNode LPAR() { return getToken(SParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SParser.RPAR, 0); }
		public TerminalNode COLON() { return getToken(SParser.COLON, 0); }
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterEnum_native_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitEnum_native_declaration(this);
		}
	}

	public final Enum_native_declarationContext enum_native_declaration() throws RecognitionException {
		Enum_native_declarationContext _localctx = new Enum_native_declarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_enum_native_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393); 
			match(ENUM);
			setState(394); 
			((Enum_native_declarationContext)_localctx).name = type_identifier();
			setState(395); 
			match(LPAR);
			setState(396); 
			((Enum_native_declarationContext)_localctx).typ = native_type();
			setState(397); 
			match(RPAR);
			setState(398); 
			match(COLON);
			setState(399); 
			indent();
			setState(400); 
			((Enum_native_declarationContext)_localctx).symbols = native_symbol_list(0);
			setState(401); 
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
		public TerminalNode EQ() { return getToken(SParser.EQ, 0); }
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterNative_symbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitNative_symbol(this);
		}
	}

	public final Native_symbolContext native_symbol() throws RecognitionException {
		Native_symbolContext _localctx = new Native_symbolContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_native_symbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403); 
			((Native_symbolContext)_localctx).name = symbol_identifier();
			setState(404); 
			match(EQ);
			setState(405); 
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
		public TerminalNode LPAR() { return getToken(SParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SParser.RPAR, 0); }
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterCategory_symbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitCategory_symbol(this);
		}
	}

	public final Category_symbolContext category_symbol() throws RecognitionException {
		Category_symbolContext _localctx = new Category_symbolContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_category_symbol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407); 
			((Category_symbolContext)_localctx).name = symbol_identifier();
			setState(408); 
			match(LPAR);
			setState(410);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << CODE) | (1L << DOCUMENT))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (EXECUTE - 87)) | (1L << (FETCH - 87)) | (1L << (MUTABLE - 87)) | (1L << (NONE - 87)) | (1L << (NOT - 87)) | (1L << (READ - 87)) | (1L << (SELF - 87)) | (1L << (SORTED - 87)) | (1L << (THIS - 87)) | (1L << (BOOLEAN_LITERAL - 87)) | (1L << (CHAR_LITERAL - 87)) | (1L << (MIN_INTEGER - 87)) | (1L << (MAX_INTEGER - 87)) | (1L << (SYMBOL_IDENTIFIER - 87)) | (1L << (TYPE_IDENTIFIER - 87)) | (1L << (VARIABLE_IDENTIFIER - 87)) | (1L << (TEXT_LITERAL - 87)) | (1L << (INTEGER_LITERAL - 87)) | (1L << (HEXA_LITERAL - 87)) | (1L << (DECIMAL_LITERAL - 87)) | (1L << (DATETIME_LITERAL - 87)) | (1L << (TIME_LITERAL - 87)))) != 0) || _la==DATE_LITERAL || _la==PERIOD_LITERAL) {
				{
				setState(409); 
				((Category_symbolContext)_localctx).args = argument_assignment_list(0);
				}
			}

			setState(412); 
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
		public Variable_identifierContext name;
		public TypedefContext typ;
		public Attribute_constraintContext match;
		public TerminalNode ATTR() { return getToken(SParser.ATTR, 0); }
		public TerminalNode LPAR() { return getToken(SParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SParser.RPAR, 0); }
		public TerminalNode COLON() { return getToken(SParser.COLON, 0); }
		public IndentContext indent() {
			return getRuleContext(IndentContext.class,0);
		}
		public DedentContext dedent() {
			return getRuleContext(DedentContext.class,0);
		}
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public TypedefContext typedef() {
			return getRuleContext(TypedefContext.class,0);
		}
		public TerminalNode PASS() { return getToken(SParser.PASS, 0); }
		public Attribute_constraintContext attribute_constraint() {
			return getRuleContext(Attribute_constraintContext.class,0);
		}
		public Attribute_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterAttribute_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitAttribute_declaration(this);
		}
	}

	public final Attribute_declarationContext attribute_declaration() throws RecognitionException {
		Attribute_declarationContext _localctx = new Attribute_declarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_attribute_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414); 
			match(ATTR);
			setState(415); 
			((Attribute_declarationContext)_localctx).name = variable_identifier();
			setState(416); 
			match(LPAR);
			setState(417); 
			((Attribute_declarationContext)_localctx).typ = typedef(0);
			setState(418); 
			match(RPAR);
			setState(419); 
			match(COLON);
			setState(420); 
			indent();
			setState(423);
			switch (_input.LA(1)) {
			case IN:
			case MATCHING:
				{
				setState(421); 
				((Attribute_declarationContext)_localctx).match = attribute_constraint();
				}
				break;
			case PASS:
				{
				setState(422); 
				match(PASS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(425); 
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
		public TerminalNode LPAR() { return getToken(SParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SParser.RPAR, 0); }
		public TerminalNode COLON() { return getToken(SParser.COLON, 0); }
		public IndentContext indent() {
			return getRuleContext(IndentContext.class,0);
		}
		public DedentContext dedent() {
			return getRuleContext(DedentContext.class,0);
		}
		public TerminalNode CLASS() { return getToken(SParser.CLASS, 0); }
		public TerminalNode CATEGORY() { return getToken(SParser.CATEGORY, 0); }
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(SParser.COMMA, 0); }
		public TerminalNode PASS() { return getToken(SParser.PASS, 0); }
		public Derived_listContext derived_list() {
			return getRuleContext(Derived_listContext.class,0);
		}
		public Attribute_listContext attribute_list() {
			return getRuleContext(Attribute_listContext.class,0);
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterConcrete_category_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitConcrete_category_declaration(this);
		}
	}

	public final Concrete_category_declarationContext concrete_category_declaration() throws RecognitionException {
		Concrete_category_declarationContext _localctx = new Concrete_category_declarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_concrete_category_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			_la = _input.LA(1);
			if ( !(_la==CATEGORY || _la==CLASS) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(428); 
			((Concrete_category_declarationContext)_localctx).name = type_identifier();
			setState(429); 
			match(LPAR);
			setState(436);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(430); 
				((Concrete_category_declarationContext)_localctx).derived = derived_list();
				}
				break;
			case 2:
				{
				setState(431); 
				((Concrete_category_declarationContext)_localctx).attrs = attribute_list();
				}
				break;
			case 3:
				{
				setState(432); 
				((Concrete_category_declarationContext)_localctx).derived = derived_list();
				setState(433); 
				match(COMMA);
				setState(434); 
				((Concrete_category_declarationContext)_localctx).attrs = attribute_list();
				}
				break;
			}
			setState(438); 
			match(RPAR);
			setState(439); 
			match(COLON);
			setState(440); 
			indent();
			setState(443);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case DEF:
				{
				setState(441); 
				((Concrete_category_declarationContext)_localctx).methods = member_method_declaration_list(0);
				}
				break;
			case PASS:
				{
				setState(442); 
				match(PASS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(445); 
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
		public Attribute_listContext attrs;
		public Member_method_declaration_listContext methods;
		public TerminalNode SINGLETON() { return getToken(SParser.SINGLETON, 0); }
		public TerminalNode LPAR() { return getToken(SParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SParser.RPAR, 0); }
		public TerminalNode COLON() { return getToken(SParser.COLON, 0); }
		public IndentContext indent() {
			return getRuleContext(IndentContext.class,0);
		}
		public DedentContext dedent() {
			return getRuleContext(DedentContext.class,0);
		}
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Attribute_listContext attribute_list() {
			return getRuleContext(Attribute_listContext.class,0);
		}
		public TerminalNode PASS() { return getToken(SParser.PASS, 0); }
		public Member_method_declaration_listContext member_method_declaration_list() {
			return getRuleContext(Member_method_declaration_listContext.class,0);
		}
		public Singleton_category_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleton_category_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterSingleton_category_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitSingleton_category_declaration(this);
		}
	}

	public final Singleton_category_declarationContext singleton_category_declaration() throws RecognitionException {
		Singleton_category_declarationContext _localctx = new Singleton_category_declarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_singleton_category_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447); 
			match(SINGLETON);
			setState(448); 
			((Singleton_category_declarationContext)_localctx).name = type_identifier();
			setState(449); 
			match(LPAR);
			setState(450); 
			((Singleton_category_declarationContext)_localctx).attrs = attribute_list();
			setState(451); 
			match(RPAR);
			setState(452); 
			match(COLON);
			setState(453); 
			indent();
			setState(456);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case DEF:
				{
				setState(454); 
				((Singleton_category_declarationContext)_localctx).methods = member_method_declaration_list(0);
				}
				break;
			case PASS:
				{
				setState(455); 
				match(PASS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(458); 
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterDerived_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitDerived_list(this);
		}
	}

	public final Derived_listContext derived_list() throws RecognitionException {
		Derived_listContext _localctx = new Derived_listContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_derived_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460); 
			((Derived_listContext)_localctx).items = type_identifier_list(0);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode DEF() { return getToken(SParser.DEF, 0); }
		public TerminalNode OPERATOR() { return getToken(SParser.OPERATOR, 0); }
		public TerminalNode LPAR() { return getToken(SParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SParser.RPAR, 0); }
		public TerminalNode COLON() { return getToken(SParser.COLON, 0); }
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
		public TerminalNode RARROW() { return getToken(SParser.RARROW, 0); }
		public TypedefContext typedef() {
			return getRuleContext(TypedefContext.class,0);
		}
		public Operator_method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_method_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterOperator_method_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitOperator_method_declaration(this);
		}
	}

	public final Operator_method_declarationContext operator_method_declaration() throws RecognitionException {
		Operator_method_declarationContext _localctx = new Operator_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_operator_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462); 
			match(DEF);
			setState(463); 
			match(OPERATOR);
			setState(464); 
			((Operator_method_declarationContext)_localctx).op = operator();
			setState(465); 
			match(LPAR);
			setState(466); 
			((Operator_method_declarationContext)_localctx).arg = operator_argument();
			setState(467); 
			match(RPAR);
			setState(470);
			_la = _input.LA(1);
			if (_la==RARROW) {
				{
				setState(468); 
				match(RARROW);
				setState(469); 
				((Operator_method_declarationContext)_localctx).typ = typedef(0);
				}
			}

			setState(472); 
			match(COLON);
			setState(473); 
			indent();
			setState(474); 
			((Operator_method_declarationContext)_localctx).stmts = statement_list(0);
			setState(475); 
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
		public TerminalNode DEF() { return getToken(SParser.DEF, 0); }
		public TerminalNode SETTER() { return getToken(SParser.SETTER, 0); }
		public TerminalNode LPAR() { return getToken(SParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SParser.RPAR, 0); }
		public TerminalNode COLON() { return getToken(SParser.COLON, 0); }
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterSetter_method_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitSetter_method_declaration(this);
		}
	}

	public final Setter_method_declarationContext setter_method_declaration() throws RecognitionException {
		Setter_method_declarationContext _localctx = new Setter_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_setter_method_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477); 
			match(DEF);
			setState(478); 
			((Setter_method_declarationContext)_localctx).name = variable_identifier();
			setState(479); 
			match(SETTER);
			setState(480); 
			match(LPAR);
			setState(481); 
			match(RPAR);
			setState(482); 
			match(COLON);
			setState(483); 
			indent();
			setState(484); 
			((Setter_method_declarationContext)_localctx).stmts = statement_list(0);
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

	public static class Getter_method_declarationContext extends ParserRuleContext {
		public Variable_identifierContext name;
		public Statement_listContext stmts;
		public TerminalNode DEF() { return getToken(SParser.DEF, 0); }
		public TerminalNode GETTER() { return getToken(SParser.GETTER, 0); }
		public TerminalNode LPAR() { return getToken(SParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SParser.RPAR, 0); }
		public TerminalNode COLON() { return getToken(SParser.COLON, 0); }
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterGetter_method_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitGetter_method_declaration(this);
		}
	}

	public final Getter_method_declarationContext getter_method_declaration() throws RecognitionException {
		Getter_method_declarationContext _localctx = new Getter_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_getter_method_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487); 
			match(DEF);
			setState(488); 
			((Getter_method_declarationContext)_localctx).name = variable_identifier();
			setState(489); 
			match(GETTER);
			setState(490); 
			match(LPAR);
			setState(491); 
			match(RPAR);
			setState(492); 
			match(COLON);
			setState(493); 
			indent();
			setState(494); 
			((Getter_method_declarationContext)_localctx).stmts = statement_list(0);
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

	public static class Native_category_declarationContext extends ParserRuleContext {
		public Type_identifierContext name;
		public Attribute_listContext attrs;
		public Native_category_bindingsContext bindings;
		public Native_member_method_declaration_listContext methods;
		public TerminalNode NATIVE() { return getToken(SParser.NATIVE, 0); }
		public TerminalNode LPAR() { return getToken(SParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SParser.RPAR, 0); }
		public TerminalNode COLON() { return getToken(SParser.COLON, 0); }
		public IndentContext indent() {
			return getRuleContext(IndentContext.class,0);
		}
		public DedentContext dedent() {
			return getRuleContext(DedentContext.class,0);
		}
		public TerminalNode CLASS() { return getToken(SParser.CLASS, 0); }
		public TerminalNode CATEGORY() { return getToken(SParser.CATEGORY, 0); }
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Native_category_bindingsContext native_category_bindings() {
			return getRuleContext(Native_category_bindingsContext.class,0);
		}
		public LfpContext lfp() {
			return getRuleContext(LfpContext.class,0);
		}
		public Attribute_listContext attribute_list() {
			return getRuleContext(Attribute_listContext.class,0);
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterNative_category_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitNative_category_declaration(this);
		}
	}

	public final Native_category_declarationContext native_category_declaration() throws RecognitionException {
		Native_category_declarationContext _localctx = new Native_category_declarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_native_category_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497); 
			match(NATIVE);
			setState(498);
			_la = _input.LA(1);
			if ( !(_la==CATEGORY || _la==CLASS) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(499); 
			((Native_category_declarationContext)_localctx).name = type_identifier();
			setState(500); 
			match(LPAR);
			setState(502);
			_la = _input.LA(1);
			if (_la==VARIABLE_IDENTIFIER) {
				{
				setState(501); 
				((Native_category_declarationContext)_localctx).attrs = attribute_list();
				}
			}

			setState(504); 
			match(RPAR);
			setState(505); 
			match(COLON);
			setState(506); 
			indent();
			setState(507); 
			((Native_category_declarationContext)_localctx).bindings = native_category_bindings();
			setState(511);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(508); 
				lfp();
				setState(509); 
				((Native_category_declarationContext)_localctx).methods = native_member_method_declaration_list(0);
				}
				break;
			}
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

	public static class Native_resource_declarationContext extends ParserRuleContext {
		public Type_identifierContext name;
		public Attribute_listContext attrs;
		public Native_category_bindingsContext bindings;
		public Native_member_method_declaration_listContext methods;
		public TerminalNode NATIVE() { return getToken(SParser.NATIVE, 0); }
		public TerminalNode RESOURCE() { return getToken(SParser.RESOURCE, 0); }
		public TerminalNode LPAR() { return getToken(SParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SParser.RPAR, 0); }
		public TerminalNode COLON() { return getToken(SParser.COLON, 0); }
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
		public Attribute_listContext attribute_list() {
			return getRuleContext(Attribute_listContext.class,0);
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterNative_resource_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitNative_resource_declaration(this);
		}
	}

	public final Native_resource_declarationContext native_resource_declaration() throws RecognitionException {
		Native_resource_declarationContext _localctx = new Native_resource_declarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_native_resource_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515); 
			match(NATIVE);
			setState(516); 
			match(RESOURCE);
			setState(517); 
			((Native_resource_declarationContext)_localctx).name = type_identifier();
			setState(518); 
			match(LPAR);
			setState(520);
			_la = _input.LA(1);
			if (_la==VARIABLE_IDENTIFIER) {
				{
				setState(519); 
				((Native_resource_declarationContext)_localctx).attrs = attribute_list();
				}
			}

			setState(522); 
			match(RPAR);
			setState(523); 
			match(COLON);
			setState(524); 
			indent();
			setState(525); 
			((Native_resource_declarationContext)_localctx).bindings = native_category_bindings();
			setState(529);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(526); 
				lfp();
				setState(527); 
				((Native_resource_declarationContext)_localctx).methods = native_member_method_declaration_list(0);
				}
				break;
			}
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

	public static class Native_category_bindingsContext extends ParserRuleContext {
		public Native_category_binding_listContext items;
		public TerminalNode DEF() { return getToken(SParser.DEF, 0); }
		public TerminalNode BINDINGS() { return getToken(SParser.BINDINGS, 0); }
		public TerminalNode COLON() { return getToken(SParser.COLON, 0); }
		public IndentContext indent() {
			return getRuleContext(IndentContext.class,0);
		}
		public DedentContext dedent() {
			return getRuleContext(DedentContext.class,0);
		}
		public TerminalNode CLASS() { return getToken(SParser.CLASS, 0); }
		public TerminalNode CATEGORY() { return getToken(SParser.CATEGORY, 0); }
		public Native_category_binding_listContext native_category_binding_list() {
			return getRuleContext(Native_category_binding_listContext.class,0);
		}
		public Native_category_bindingsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_native_category_bindings; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterNative_category_bindings(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitNative_category_bindings(this);
		}
	}

	public final Native_category_bindingsContext native_category_bindings() throws RecognitionException {
		Native_category_bindingsContext _localctx = new Native_category_bindingsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_native_category_bindings);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533); 
			match(DEF);
			setState(534);
			_la = _input.LA(1);
			if ( !(_la==CATEGORY || _la==CLASS) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(535); 
			match(BINDINGS);
			setState(536); 
			match(COLON);
			setState(537); 
			indent();
			setState(538); 
			((Native_category_bindingsContext)_localctx).items = native_category_binding_list(0);
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
	public static class NativeCategoryBindingListContext extends Native_category_binding_listContext {
		public Native_category_bindingContext item;
		public Native_category_bindingContext native_category_binding() {
			return getRuleContext(Native_category_bindingContext.class,0);
		}
		public NativeCategoryBindingListContext(Native_category_binding_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterNativeCategoryBindingList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitNativeCategoryBindingList(this);
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterNativeCategoryBindingListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitNativeCategoryBindingListItem(this);
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_native_category_binding_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new NativeCategoryBindingListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(542); 
			((NativeCategoryBindingListContext)_localctx).item = native_category_binding();
			}
			_ctx.stop = _input.LT(-1);
			setState(550);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NativeCategoryBindingListItemContext(new Native_category_binding_listContext(_parentctx, _parentState));
					((NativeCategoryBindingListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_native_category_binding_list);
					setState(544);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(545); 
					lfp();
					setState(546); 
					((NativeCategoryBindingListItemContext)_localctx).item = native_category_binding();
					}
					} 
				}
				setState(552);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		public Variable_identifier_listContext items;
		public Variable_identifier_listContext variable_identifier_list() {
			return getRuleContext(Variable_identifier_listContext.class,0);
		}
		public Attribute_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterAttribute_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitAttribute_list(this);
		}
	}

	public final Attribute_listContext attribute_list() throws RecognitionException {
		Attribute_listContext _localctx = new Attribute_listContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_attribute_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553); 
			((Attribute_listContext)_localctx).items = variable_identifier_list(0);
			}
		}
		catch (RecognitionException re) {
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
		public Argument_listContext args;
		public TypedefContext typ;
		public TerminalNode ABSTRACT() { return getToken(SParser.ABSTRACT, 0); }
		public TerminalNode DEF() { return getToken(SParser.DEF, 0); }
		public TerminalNode LPAR() { return getToken(SParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SParser.RPAR, 0); }
		public Method_identifierContext method_identifier() {
			return getRuleContext(Method_identifierContext.class,0);
		}
		public TerminalNode RARROW() { return getToken(SParser.RARROW, 0); }
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterAbstract_method_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitAbstract_method_declaration(this);
		}
	}

	public final Abstract_method_declarationContext abstract_method_declaration() throws RecognitionException {
		Abstract_method_declarationContext _localctx = new Abstract_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_abstract_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555); 
			match(ABSTRACT);
			setState(556); 
			match(DEF);
			setState(557); 
			((Abstract_method_declarationContext)_localctx).name = method_identifier();
			setState(558); 
			match(LPAR);
			setState(560);
			_la = _input.LA(1);
			if (_la==CODE || _la==MUTABLE || _la==VARIABLE_IDENTIFIER) {
				{
				setState(559); 
				((Abstract_method_declarationContext)_localctx).args = argument_list(0);
				}
			}

			setState(562); 
			match(RPAR);
			setState(565);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(563); 
				match(RARROW);
				setState(564); 
				((Abstract_method_declarationContext)_localctx).typ = typedef(0);
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

	public static class Concrete_method_declarationContext extends ParserRuleContext {
		public Method_identifierContext name;
		public Argument_listContext args;
		public TypedefContext typ;
		public Statement_listContext stmts;
		public TerminalNode DEF() { return getToken(SParser.DEF, 0); }
		public TerminalNode LPAR() { return getToken(SParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SParser.RPAR, 0); }
		public TerminalNode COLON() { return getToken(SParser.COLON, 0); }
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
		public TerminalNode RARROW() { return getToken(SParser.RARROW, 0); }
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterConcrete_method_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitConcrete_method_declaration(this);
		}
	}

	public final Concrete_method_declarationContext concrete_method_declaration() throws RecognitionException {
		Concrete_method_declarationContext _localctx = new Concrete_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_concrete_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567); 
			match(DEF);
			setState(568); 
			((Concrete_method_declarationContext)_localctx).name = method_identifier();
			setState(569); 
			match(LPAR);
			setState(571);
			_la = _input.LA(1);
			if (_la==CODE || _la==MUTABLE || _la==VARIABLE_IDENTIFIER) {
				{
				setState(570); 
				((Concrete_method_declarationContext)_localctx).args = argument_list(0);
				}
			}

			setState(573); 
			match(RPAR);
			setState(576);
			_la = _input.LA(1);
			if (_la==RARROW) {
				{
				setState(574); 
				match(RARROW);
				setState(575); 
				((Concrete_method_declarationContext)_localctx).typ = typedef(0);
				}
			}

			setState(578); 
			match(COLON);
			setState(579); 
			indent();
			setState(580); 
			((Concrete_method_declarationContext)_localctx).stmts = statement_list(0);
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

	public static class Native_method_declarationContext extends ParserRuleContext {
		public Method_identifierContext name;
		public Argument_listContext args;
		public Category_or_any_typeContext typ;
		public Native_statement_listContext stmts;
		public TerminalNode DEF() { return getToken(SParser.DEF, 0); }
		public TerminalNode NATIVE() { return getToken(SParser.NATIVE, 0); }
		public TerminalNode LPAR() { return getToken(SParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SParser.RPAR, 0); }
		public TerminalNode COLON() { return getToken(SParser.COLON, 0); }
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
		public TerminalNode RARROW() { return getToken(SParser.RARROW, 0); }
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterNative_method_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitNative_method_declaration(this);
		}
	}

	public final Native_method_declarationContext native_method_declaration() throws RecognitionException {
		Native_method_declarationContext _localctx = new Native_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_native_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583); 
			match(DEF);
			setState(584); 
			match(NATIVE);
			setState(585); 
			((Native_method_declarationContext)_localctx).name = method_identifier();
			setState(586); 
			match(LPAR);
			setState(588);
			_la = _input.LA(1);
			if (_la==CODE || _la==MUTABLE || _la==VARIABLE_IDENTIFIER) {
				{
				setState(587); 
				((Native_method_declarationContext)_localctx).args = argument_list(0);
				}
			}

			setState(590); 
			match(RPAR);
			setState(593);
			_la = _input.LA(1);
			if (_la==RARROW) {
				{
				setState(591); 
				match(RARROW);
				setState(592); 
				((Native_method_declarationContext)_localctx).typ = category_or_any_type();
				}
			}

			setState(595); 
			match(COLON);
			setState(596); 
			indent();
			setState(597); 
			((Native_method_declarationContext)_localctx).stmts = native_statement_list(0);
			setState(598); 
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
		public TerminalNode DEF() { return getToken(SParser.DEF, 0); }
		public TerminalNode TEST() { return getToken(SParser.TEST, 0); }
		public TerminalNode LPAR() { return getToken(SParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SParser.RPAR, 0); }
		public List<TerminalNode> COLON() { return getTokens(SParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(SParser.COLON, i);
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
		public TerminalNode EXPECTING() { return getToken(SParser.EXPECTING, 0); }
		public TerminalNode TEXT_LITERAL() { return getToken(SParser.TEXT_LITERAL, 0); }
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterTest_method_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitTest_method_declaration(this);
		}
	}

	public final Test_method_declarationContext test_method_declaration() throws RecognitionException {
		Test_method_declarationContext _localctx = new Test_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_test_method_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600); 
			match(DEF);
			setState(601); 
			match(TEST);
			setState(602); 
			((Test_method_declarationContext)_localctx).name = match(TEXT_LITERAL);
			setState(603); 
			match(LPAR);
			setState(604); 
			match(RPAR);
			setState(605); 
			match(COLON);
			setState(606); 
			indent();
			setState(607); 
			((Test_method_declarationContext)_localctx).stmts = statement_list(0);
			setState(608); 
			dedent();
			setState(609); 
			lfp();
			setState(610); 
			match(EXPECTING);
			setState(611); 
			match(COLON);
			setState(617);
			switch (_input.LA(1)) {
			case LF:
				{
				{
				setState(612); 
				indent();
				setState(613); 
				((Test_method_declarationContext)_localctx).exps = assertion_list(0);
				setState(614); 
				dedent();
				}
				}
				break;
			case SYMBOL_IDENTIFIER:
				{
				{
				setState(616); 
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterAssertion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitAssertion(this);
		}
	}

	public final AssertionContext assertion() throws RecognitionException {
		AssertionContext _localctx = new AssertionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_assertion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619); 
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
		public Attribute_listContext attrs;
		public Literal_expressionContext value;
		public TerminalNode COLON() { return getToken(SParser.COLON, 0); }
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public Category_or_any_typeContext category_or_any_type() {
			return getRuleContext(Category_or_any_typeContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(SParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SParser.RPAR, 0); }
		public TerminalNode EQ() { return getToken(SParser.EQ, 0); }
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterTyped_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitTyped_argument(this);
		}
	}

	public final Typed_argumentContext typed_argument() throws RecognitionException {
		Typed_argumentContext _localctx = new Typed_argumentContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_typed_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621); 
			((Typed_argumentContext)_localctx).name = variable_identifier();
			setState(622); 
			match(COLON);
			setState(623); 
			((Typed_argumentContext)_localctx).typ = category_or_any_type();
			setState(628);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(624); 
				match(LPAR);
				setState(625); 
				((Typed_argumentContext)_localctx).attrs = attribute_list();
				setState(626); 
				match(RPAR);
				}
				break;
			}
			setState(632);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(630); 
				match(EQ);
				setState(631); 
				((Typed_argumentContext)_localctx).value = literal_expression();
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
	public static class AssignInstanceStatementContext extends StatementContext {
		public Assign_instance_statementContext stmt;
		public Assign_instance_statementContext assign_instance_statement() {
			return getRuleContext(Assign_instance_statementContext.class,0);
		}
		public AssignInstanceStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterAssignInstanceStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitAssignInstanceStatement(this);
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterWithResourceStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitWithResourceStatement(this);
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterAssignTupleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitAssignTupleStatement(this);
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterWriteStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitWriteStatement(this);
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitWhileStatement(this);
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterClosureStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitClosureStatement(this);
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterMethodCallStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitMethodCallStatement(this);
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterWithSingletonStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitWithSingletonStatement(this);
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitReturnStatement(this);
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterDoWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitDoWhileStatement(this);
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitIfStatement(this);
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitSwitchStatement(this);
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterRaiseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitRaiseStatement(this);
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterForEachStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitForEachStatement(this);
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterTryStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitTryStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_statement);
		try {
			setState(649);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new MethodCallStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(634); 
				((MethodCallStatementContext)_localctx).stmt = method_call();
				}
				break;
			case 2:
				_localctx = new AssignInstanceStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(635); 
				((AssignInstanceStatementContext)_localctx).stmt = assign_instance_statement();
				}
				break;
			case 3:
				_localctx = new AssignTupleStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(636); 
				((AssignTupleStatementContext)_localctx).stmt = assign_tuple_statement();
				}
				break;
			case 4:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(637); 
				((ReturnStatementContext)_localctx).stmt = return_statement();
				}
				break;
			case 5:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(638); 
				((IfStatementContext)_localctx).stmt = if_statement();
				}
				break;
			case 6:
				_localctx = new SwitchStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(639); 
				((SwitchStatementContext)_localctx).stmt = switch_statement();
				}
				break;
			case 7:
				_localctx = new ForEachStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(640); 
				((ForEachStatementContext)_localctx).stmt = for_each_statement();
				}
				break;
			case 8:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(641); 
				((WhileStatementContext)_localctx).stmt = while_statement();
				}
				break;
			case 9:
				_localctx = new DoWhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(642); 
				((DoWhileStatementContext)_localctx).stmt = do_while_statement();
				}
				break;
			case 10:
				_localctx = new RaiseStatementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(643); 
				((RaiseStatementContext)_localctx).stmt = raise_statement();
				}
				break;
			case 11:
				_localctx = new TryStatementContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(644); 
				((TryStatementContext)_localctx).stmt = try_statement();
				}
				break;
			case 12:
				_localctx = new WriteStatementContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(645); 
				((WriteStatementContext)_localctx).stmt = write_statement();
				}
				break;
			case 13:
				_localctx = new WithResourceStatementContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(646); 
				((WithResourceStatementContext)_localctx).stmt = with_resource_statement();
				}
				break;
			case 14:
				_localctx = new WithSingletonStatementContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(647); 
				((WithSingletonStatementContext)_localctx).stmt = with_singleton_statement();
				}
				break;
			case 15:
				_localctx = new ClosureStatementContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(648); 
				((ClosureStatementContext)_localctx).decl = concrete_method_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode LPAR() { return getToken(SParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SParser.RPAR, 0); }
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterMethod_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitMethod_call(this);
		}
	}

	public final Method_callContext method_call() throws RecognitionException {
		Method_callContext _localctx = new Method_callContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_method_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(651); 
			((Method_callContext)_localctx).method = method_selector();
			setState(652); 
			match(LPAR);
			setState(654);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << CODE) | (1L << DOCUMENT))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (EXECUTE - 87)) | (1L << (FETCH - 87)) | (1L << (MUTABLE - 87)) | (1L << (NONE - 87)) | (1L << (NOT - 87)) | (1L << (READ - 87)) | (1L << (SELF - 87)) | (1L << (SORTED - 87)) | (1L << (THIS - 87)) | (1L << (BOOLEAN_LITERAL - 87)) | (1L << (CHAR_LITERAL - 87)) | (1L << (MIN_INTEGER - 87)) | (1L << (MAX_INTEGER - 87)) | (1L << (SYMBOL_IDENTIFIER - 87)) | (1L << (TYPE_IDENTIFIER - 87)) | (1L << (VARIABLE_IDENTIFIER - 87)) | (1L << (TEXT_LITERAL - 87)) | (1L << (INTEGER_LITERAL - 87)) | (1L << (HEXA_LITERAL - 87)) | (1L << (DECIMAL_LITERAL - 87)) | (1L << (DATETIME_LITERAL - 87)) | (1L << (TIME_LITERAL - 87)))) != 0) || _la==DATE_LITERAL || _la==PERIOD_LITERAL) {
				{
				setState(653); 
				((Method_callContext)_localctx).args = argument_assignment_list(0);
				}
			}

			setState(656); 
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
	public static class MethodNameContext extends Method_selectorContext {
		public Method_identifierContext name;
		public Method_identifierContext method_identifier() {
			return getRuleContext(Method_identifierContext.class,0);
		}
		public MethodNameContext(Method_selectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterMethodName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitMethodName(this);
		}
	}
	public static class MethodParentContext extends Method_selectorContext {
		public Callable_parentContext parent;
		public Method_identifierContext name;
		public TerminalNode DOT() { return getToken(SParser.DOT, 0); }
		public Callable_parentContext callable_parent() {
			return getRuleContext(Callable_parentContext.class,0);
		}
		public Method_identifierContext method_identifier() {
			return getRuleContext(Method_identifierContext.class,0);
		}
		public MethodParentContext(Method_selectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterMethodParent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitMethodParent(this);
		}
	}

	public final Method_selectorContext method_selector() throws RecognitionException {
		Method_selectorContext _localctx = new Method_selectorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_method_selector);
		try {
			setState(663);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new MethodNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(658); 
				((MethodNameContext)_localctx).name = method_identifier();
				}
				break;
			case 2:
				_localctx = new MethodParentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(659); 
				((MethodParentContext)_localctx).parent = callable_parent(0);
				setState(660); 
				match(DOT);
				setState(661); 
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
	public static class CallableRootContext extends Callable_parentContext {
		public IdentifierContext name;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public CallableRootContext(Callable_parentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterCallableRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitCallableRoot(this);
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterCallableSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitCallableSelector(this);
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
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_callable_parent, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new CallableRootContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(666); 
			((CallableRootContext)_localctx).name = identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(672);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CallableSelectorContext(new Callable_parentContext(_parentctx, _parentState));
					((CallableSelectorContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_callable_parent);
					setState(668);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(669); 
					((CallableSelectorContext)_localctx).select = callable_selector();
					}
					} 
				}
				setState(674);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
		public TerminalNode LBRAK() { return getToken(SParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(SParser.RBRAK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CallableItemSelectorContext(Callable_selectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterCallableItemSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitCallableItemSelector(this);
		}
	}
	public static class CallableMemberSelectorContext extends Callable_selectorContext {
		public Variable_identifierContext name;
		public TerminalNode DOT() { return getToken(SParser.DOT, 0); }
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public CallableMemberSelectorContext(Callable_selectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterCallableMemberSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitCallableMemberSelector(this);
		}
	}

	public final Callable_selectorContext callable_selector() throws RecognitionException {
		Callable_selectorContext _localctx = new Callable_selectorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_callable_selector);
		try {
			setState(681);
			switch (_input.LA(1)) {
			case DOT:
				_localctx = new CallableMemberSelectorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(675); 
				match(DOT);
				setState(676); 
				((CallableMemberSelectorContext)_localctx).name = variable_identifier();
				}
				break;
			case LBRAK:
				_localctx = new CallableItemSelectorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(677); 
				match(LBRAK);
				setState(678); 
				((CallableItemSelectorContext)_localctx).exp = expression(0);
				setState(679); 
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
		public TerminalNode WITH() { return getToken(SParser.WITH, 0); }
		public TerminalNode COLON() { return getToken(SParser.COLON, 0); }
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterWith_resource_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitWith_resource_statement(this);
		}
	}

	public final With_resource_statementContext with_resource_statement() throws RecognitionException {
		With_resource_statementContext _localctx = new With_resource_statementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_with_resource_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(683); 
			match(WITH);
			setState(684); 
			((With_resource_statementContext)_localctx).stmt = assign_variable_statement();
			setState(685); 
			match(COLON);
			setState(686); 
			indent();
			setState(687); 
			((With_resource_statementContext)_localctx).stmts = statement_list(0);
			setState(688); 
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
		public TerminalNode WITH() { return getToken(SParser.WITH, 0); }
		public TerminalNode COLON() { return getToken(SParser.COLON, 0); }
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterWith_singleton_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitWith_singleton_statement(this);
		}
	}

	public final With_singleton_statementContext with_singleton_statement() throws RecognitionException {
		With_singleton_statementContext _localctx = new With_singleton_statementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_with_singleton_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(690); 
			match(WITH);
			setState(691); 
			((With_singleton_statementContext)_localctx).typ = type_identifier();
			setState(692); 
			match(COLON);
			setState(693); 
			indent();
			setState(694); 
			((With_singleton_statementContext)_localctx).stmts = statement_list(0);
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

	public static class Switch_statementContext extends ParserRuleContext {
		public ExpressionContext exp;
		public Switch_case_statement_listContext cases;
		public Statement_listContext stmts;
		public TerminalNode SWITCH() { return getToken(SParser.SWITCH, 0); }
		public TerminalNode ON() { return getToken(SParser.ON, 0); }
		public List<TerminalNode> COLON() { return getTokens(SParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(SParser.COLON, i);
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
		public TerminalNode OTHERWISE() { return getToken(SParser.OTHERWISE, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public Switch_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterSwitch_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitSwitch_statement(this);
		}
	}

	public final Switch_statementContext switch_statement() throws RecognitionException {
		Switch_statementContext _localctx = new Switch_statementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_switch_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697); 
			match(SWITCH);
			setState(698); 
			match(ON);
			setState(699); 
			((Switch_statementContext)_localctx).exp = expression(0);
			setState(700); 
			match(COLON);
			setState(701); 
			indent();
			setState(702); 
			((Switch_statementContext)_localctx).cases = switch_case_statement_list(0);
			setState(710);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(703); 
				lfp();
				setState(704); 
				match(OTHERWISE);
				setState(705); 
				match(COLON);
				setState(706); 
				indent();
				setState(707); 
				((Switch_statementContext)_localctx).stmts = statement_list(0);
				setState(708); 
				dedent();
				}
				break;
			}
			setState(712); 
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
		public TerminalNode WHEN() { return getToken(SParser.WHEN, 0); }
		public TerminalNode COLON() { return getToken(SParser.COLON, 0); }
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterAtomicSwitchCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitAtomicSwitchCase(this);
		}
	}
	public static class CollectionSwitchCaseContext extends Switch_case_statementContext {
		public Literal_collectionContext exp;
		public Statement_listContext stmts;
		public TerminalNode WHEN() { return getToken(SParser.WHEN, 0); }
		public TerminalNode IN() { return getToken(SParser.IN, 0); }
		public TerminalNode COLON() { return getToken(SParser.COLON, 0); }
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterCollectionSwitchCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitCollectionSwitchCase(this);
		}
	}

	public final Switch_case_statementContext switch_case_statement() throws RecognitionException {
		Switch_case_statementContext _localctx = new Switch_case_statementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_switch_case_statement);
		try {
			setState(729);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				_localctx = new AtomicSwitchCaseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(714); 
				match(WHEN);
				setState(715); 
				((AtomicSwitchCaseContext)_localctx).exp = atomic_literal();
				setState(716); 
				match(COLON);
				setState(717); 
				indent();
				setState(718); 
				((AtomicSwitchCaseContext)_localctx).stmts = statement_list(0);
				setState(719); 
				dedent();
				}
				break;
			case 2:
				_localctx = new CollectionSwitchCaseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(721); 
				match(WHEN);
				setState(722); 
				match(IN);
				setState(723); 
				((CollectionSwitchCaseContext)_localctx).exp = literal_collection();
				setState(724); 
				match(COLON);
				setState(725); 
				indent();
				setState(726); 
				((CollectionSwitchCaseContext)_localctx).stmts = statement_list(0);
				setState(727); 
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
		public TerminalNode FOR() { return getToken(SParser.FOR, 0); }
		public TerminalNode IN() { return getToken(SParser.IN, 0); }
		public TerminalNode COLON() { return getToken(SParser.COLON, 0); }
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
		public TerminalNode COMMA() { return getToken(SParser.COMMA, 0); }
		public For_each_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_each_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterFor_each_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitFor_each_statement(this);
		}
	}

	public final For_each_statementContext for_each_statement() throws RecognitionException {
		For_each_statementContext _localctx = new For_each_statementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_for_each_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731); 
			match(FOR);
			setState(732); 
			((For_each_statementContext)_localctx).name1 = variable_identifier();
			setState(735);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(733); 
				match(COMMA);
				setState(734); 
				((For_each_statementContext)_localctx).name2 = variable_identifier();
				}
			}

			setState(737); 
			match(IN);
			setState(738); 
			((For_each_statementContext)_localctx).source = expression(0);
			setState(739); 
			match(COLON);
			setState(740); 
			indent();
			setState(741); 
			((For_each_statementContext)_localctx).stmts = statement_list(0);
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

	public static class Do_while_statementContext extends ParserRuleContext {
		public Statement_listContext stmts;
		public ExpressionContext exp;
		public TerminalNode DO() { return getToken(SParser.DO, 0); }
		public TerminalNode COLON() { return getToken(SParser.COLON, 0); }
		public IndentContext indent() {
			return getRuleContext(IndentContext.class,0);
		}
		public DedentContext dedent() {
			return getRuleContext(DedentContext.class,0);
		}
		public LfpContext lfp() {
			return getRuleContext(LfpContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(SParser.WHILE, 0); }
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterDo_while_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitDo_while_statement(this);
		}
	}

	public final Do_while_statementContext do_while_statement() throws RecognitionException {
		Do_while_statementContext _localctx = new Do_while_statementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_do_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744); 
			match(DO);
			setState(745); 
			match(COLON);
			setState(746); 
			indent();
			setState(747); 
			((Do_while_statementContext)_localctx).stmts = statement_list(0);
			setState(748); 
			dedent();
			setState(749); 
			lfp();
			setState(750); 
			match(WHILE);
			setState(751); 
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
		public TerminalNode WHILE() { return getToken(SParser.WHILE, 0); }
		public TerminalNode COLON() { return getToken(SParser.COLON, 0); }
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitWhile_statement(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(753); 
			match(WHILE);
			setState(754); 
			((While_statementContext)_localctx).exp = expression(0);
			setState(755); 
			match(COLON);
			setState(756); 
			indent();
			setState(757); 
			((While_statementContext)_localctx).stmts = statement_list(0);
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

	public static class If_statementContext extends ParserRuleContext {
		public ExpressionContext exp;
		public Statement_listContext stmts;
		public Else_if_statement_listContext elseIfs;
		public Statement_listContext elseStmts;
		public TerminalNode IF() { return getToken(SParser.IF, 0); }
		public List<TerminalNode> COLON() { return getTokens(SParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(SParser.COLON, i);
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
		public TerminalNode ELSE() { return getToken(SParser.ELSE, 0); }
		public Else_if_statement_listContext else_if_statement_list() {
			return getRuleContext(Else_if_statement_listContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitIf_statement(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(760); 
			match(IF);
			setState(761); 
			((If_statementContext)_localctx).exp = expression(0);
			setState(762); 
			match(COLON);
			setState(763); 
			indent();
			setState(764); 
			((If_statementContext)_localctx).stmts = statement_list(0);
			setState(765); 
			dedent();
			setState(769);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(766); 
				lfp();
				setState(767); 
				((If_statementContext)_localctx).elseIfs = else_if_statement_list(0);
				}
				break;
			}
			setState(778);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(771); 
				lfp();
				setState(772); 
				match(ELSE);
				setState(773); 
				match(COLON);
				setState(774); 
				indent();
				setState(775); 
				((If_statementContext)_localctx).elseStmts = statement_list(0);
				setState(776); 
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
		public TerminalNode ELSE() { return getToken(SParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(SParser.IF, 0); }
		public TerminalNode COLON() { return getToken(SParser.COLON, 0); }
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterElseIfStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitElseIfStatementList(this);
		}
	}
	public static class ElseIfStatementListItemContext extends Else_if_statement_listContext {
		public Else_if_statement_listContext items;
		public ExpressionContext exp;
		public Statement_listContext stmts;
		public LfpContext lfp() {
			return getRuleContext(LfpContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(SParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(SParser.IF, 0); }
		public TerminalNode COLON() { return getToken(SParser.COLON, 0); }
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterElseIfStatementListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitElseIfStatementListItem(this);
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
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_else_if_statement_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ElseIfStatementListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(781); 
			match(ELSE);
			setState(782); 
			match(IF);
			setState(783); 
			((ElseIfStatementListContext)_localctx).exp = expression(0);
			setState(784); 
			match(COLON);
			setState(785); 
			indent();
			setState(786); 
			((ElseIfStatementListContext)_localctx).stmts = statement_list(0);
			setState(787); 
			dedent();
			}
			_ctx.stop = _input.LT(-1);
			setState(801);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ElseIfStatementListItemContext(new Else_if_statement_listContext(_parentctx, _parentState));
					((ElseIfStatementListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_else_if_statement_list);
					setState(789);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(790); 
					lfp();
					setState(791); 
					match(ELSE);
					setState(792); 
					match(IF);
					setState(793); 
					((ElseIfStatementListItemContext)_localctx).exp = expression(0);
					setState(794); 
					match(COLON);
					setState(795); 
					indent();
					setState(796); 
					((ElseIfStatementListItemContext)_localctx).stmts = statement_list(0);
					setState(797); 
					dedent();
					}
					} 
				}
				setState(803);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
		public TerminalNode RAISE() { return getToken(SParser.RAISE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Raise_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raise_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterRaise_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitRaise_statement(this);
		}
	}

	public final Raise_statementContext raise_statement() throws RecognitionException {
		Raise_statementContext _localctx = new Raise_statementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_raise_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(804); 
			match(RAISE);
			setState(805); 
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
		public TerminalNode TRY() { return getToken(SParser.TRY, 0); }
		public List<TerminalNode> COLON() { return getTokens(SParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(SParser.COLON, i);
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
		public TerminalNode EXCEPT() { return getToken(SParser.EXCEPT, 0); }
		public TerminalNode FINALLY() { return getToken(SParser.FINALLY, 0); }
		public Catch_statement_listContext catch_statement_list() {
			return getRuleContext(Catch_statement_listContext.class,0);
		}
		public Try_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_try_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterTry_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitTry_statement(this);
		}
	}

	public final Try_statementContext try_statement() throws RecognitionException {
		Try_statementContext _localctx = new Try_statementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_try_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(807); 
			match(TRY);
			setState(808); 
			((Try_statementContext)_localctx).name = variable_identifier();
			setState(809); 
			match(COLON);
			setState(810); 
			indent();
			setState(811); 
			((Try_statementContext)_localctx).stmts = statement_list(0);
			setState(812); 
			dedent();
			setState(813); 
			lfs();
			setState(815);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(814); 
				((Try_statementContext)_localctx).handlers = catch_statement_list(0);
				}
				break;
			}
			setState(824);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(817); 
				match(EXCEPT);
				setState(818); 
				match(COLON);
				setState(819); 
				indent();
				setState(820); 
				((Try_statementContext)_localctx).anyStmts = statement_list(0);
				setState(821); 
				dedent();
				setState(822); 
				lfs();
				}
				break;
			}
			setState(833);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(826); 
				match(FINALLY);
				setState(827); 
				match(COLON);
				setState(828); 
				indent();
				setState(829); 
				((Try_statementContext)_localctx).finalStmts = statement_list(0);
				setState(830); 
				dedent();
				setState(831); 
				lfs();
				}
				break;
			}
			setState(835); 
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
		public TerminalNode EXCEPT() { return getToken(SParser.EXCEPT, 0); }
		public TerminalNode COLON() { return getToken(SParser.COLON, 0); }
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterCatchAtomicStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitCatchAtomicStatement(this);
		}
	}
	public static class CatchCollectionStatementContext extends Catch_statementContext {
		public Symbol_listContext exp;
		public Statement_listContext stmts;
		public TerminalNode EXCEPT() { return getToken(SParser.EXCEPT, 0); }
		public TerminalNode IN() { return getToken(SParser.IN, 0); }
		public TerminalNode LBRAK() { return getToken(SParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(SParser.RBRAK, 0); }
		public TerminalNode COLON() { return getToken(SParser.COLON, 0); }
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterCatchCollectionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitCatchCollectionStatement(this);
		}
	}

	public final Catch_statementContext catch_statement() throws RecognitionException {
		Catch_statementContext _localctx = new Catch_statementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_catch_statement);
		try {
			setState(856);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				_localctx = new CatchAtomicStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(837); 
				match(EXCEPT);
				setState(838); 
				((CatchAtomicStatementContext)_localctx).name = symbol_identifier();
				setState(839); 
				match(COLON);
				setState(840); 
				indent();
				setState(841); 
				((CatchAtomicStatementContext)_localctx).stmts = statement_list(0);
				setState(842); 
				dedent();
				setState(843); 
				lfs();
				}
				break;
			case 2:
				_localctx = new CatchCollectionStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(845); 
				match(EXCEPT);
				setState(846); 
				match(IN);
				setState(847); 
				match(LBRAK);
				setState(848); 
				((CatchCollectionStatementContext)_localctx).exp = symbol_list(0);
				setState(849); 
				match(RBRAK);
				setState(850); 
				match(COLON);
				setState(851); 
				indent();
				setState(852); 
				((CatchCollectionStatementContext)_localctx).stmts = statement_list(0);
				setState(853); 
				dedent();
				setState(854); 
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

	public static class Return_statementContext extends ParserRuleContext {
		public ExpressionContext exp;
		public TerminalNode RETURN() { return getToken(SParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitReturn_statement(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(858); 
			match(RETURN);
			setState(860);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(859); 
				((Return_statementContext)_localctx).exp = expression(0);
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
	public static class TernaryExpressionContext extends ExpressionContext {
		public ExpressionContext ifTrue;
		public ExpressionContext test;
		public ExpressionContext ifFalse;
		public TerminalNode IF() { return getToken(SParser.IF, 0); }
		public TerminalNode ELSE() { return getToken(SParser.ELSE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TernaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterTernaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitTernaryExpression(this);
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterClosureExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitClosureExpression(this);
		}
	}
	public static class OrExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode OR() { return getToken(SParser.OR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OrExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitOrExpression(this);
		}
	}
	public static class EqualsExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode EQ2() { return getToken(SParser.EQ2, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public EqualsExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterEqualsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitEqualsExpression(this);
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterIntDivideExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitIntDivideExpression(this);
		}
	}
	public static class NotContainsAnyExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode NOT() { return getToken(SParser.NOT, 0); }
		public TerminalNode CONTAINS() { return getToken(SParser.CONTAINS, 0); }
		public TerminalNode ANY() { return getToken(SParser.ANY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public NotContainsAnyExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterNotContainsAnyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitNotContainsAnyExpression(this);
		}
	}
	public static class RoughlyEqualsExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode TEQ() { return getToken(SParser.TEQ, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public RoughlyEqualsExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterRoughlyEqualsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitRoughlyEqualsExpression(this);
		}
	}
	public static class ContainsExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode CONTAINS() { return getToken(SParser.CONTAINS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ContainsExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterContainsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitContainsExpression(this);
		}
	}
	public static class CodeExpressionContext extends ExpressionContext {
		public ExpressionContext exp;
		public TerminalNode CODE() { return getToken(SParser.CODE, 0); }
		public TerminalNode LPAR() { return getToken(SParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SParser.RPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CodeExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterCodeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitCodeExpression(this);
		}
	}
	public static class NotEqualsExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode XEQ() { return getToken(SParser.XEQ, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public NotEqualsExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterNotEqualsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitNotEqualsExpression(this);
		}
	}
	public static class InExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode IN() { return getToken(SParser.IN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public InExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterInExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitInExpression(this);
		}
	}
	public static class CastExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Category_or_any_typeContext right;
		public TerminalNode AS() { return getToken(SParser.AS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Category_or_any_typeContext category_or_any_type() {
			return getRuleContext(Category_or_any_typeContext.class,0);
		}
		public CastExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitCastExpression(this);
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterInstanceExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitInstanceExpression(this);
		}
	}
	public static class NotExpressionContext extends ExpressionContext {
		public ExpressionContext exp;
		public TerminalNode NOT() { return getToken(SParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitNotExpression(this);
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterMethodExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitMethodExpression(this);
		}
	}
	public static class GreaterThanExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode GT() { return getToken(SParser.GT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GreaterThanExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterGreaterThanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitGreaterThanExpression(this);
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
		public TerminalNode PLUS() { return getToken(SParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SParser.MINUS, 0); }
		public AddExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterAddExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitAddExpression(this);
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterModuloExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitModuloExpression(this);
		}
	}
	public static class GreaterThanOrEqualExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode GTE() { return getToken(SParser.GTE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GreaterThanOrEqualExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterGreaterThanOrEqualExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitGreaterThanOrEqualExpression(this);
		}
	}
	public static class NotContainsAllExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode NOT() { return getToken(SParser.NOT, 0); }
		public TerminalNode CONTAINS() { return getToken(SParser.CONTAINS, 0); }
		public TerminalNode ALL() { return getToken(SParser.ALL, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public NotContainsAllExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterNotContainsAllExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitNotContainsAllExpression(this);
		}
	}
	public static class LessThanOrEqualExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode LTE() { return getToken(SParser.LTE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LessThanOrEqualExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterLessThanOrEqualExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitLessThanOrEqualExpression(this);
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterMultiplyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitMultiplyExpression(this);
		}
	}
	public static class AndExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode AND() { return getToken(SParser.AND, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AndExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitAndExpression(this);
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterDivideExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitDivideExpression(this);
		}
	}
	public static class ExecuteExpressionContext extends ExpressionContext {
		public Variable_identifierContext name;
		public TerminalNode EXECUTE() { return getToken(SParser.EXECUTE, 0); }
		public TerminalNode LPAR() { return getToken(SParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SParser.RPAR, 0); }
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public ExecuteExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterExecuteExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitExecuteExpression(this);
		}
	}
	public static class ContainsAllExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode CONTAINS() { return getToken(SParser.CONTAINS, 0); }
		public TerminalNode ALL() { return getToken(SParser.ALL, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ContainsAllExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterContainsAllExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitContainsAllExpression(this);
		}
	}
	public static class LessThanExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode LT() { return getToken(SParser.LT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LessThanExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterLessThanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitLessThanExpression(this);
		}
	}
	public static class NotInExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode NOT() { return getToken(SParser.NOT, 0); }
		public TerminalNode IN() { return getToken(SParser.IN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public NotInExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterNotInExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitNotInExpression(this);
		}
	}
	public static class NotContainsExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode NOT() { return getToken(SParser.NOT, 0); }
		public TerminalNode CONTAINS() { return getToken(SParser.CONTAINS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public NotContainsExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterNotContainsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitNotContainsExpression(this);
		}
	}
	public static class ContainsAnyExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode CONTAINS() { return getToken(SParser.CONTAINS, 0); }
		public TerminalNode ANY() { return getToken(SParser.ANY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ContainsAnyExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterContainsAnyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitContainsAnyExpression(this);
		}
	}
	public static class IsExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Is_expressionContext right;
		public TerminalNode IS() { return getToken(SParser.IS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Is_expressionContext is_expression() {
			return getRuleContext(Is_expressionContext.class,0);
		}
		public IsExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterIsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitIsExpression(this);
		}
	}
	public static class MinusExpressionContext extends ExpressionContext {
		public ExpressionContext exp;
		public TerminalNode MINUS() { return getToken(SParser.MINUS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MinusExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterMinusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitMinusExpression(this);
		}
	}
	public static class IsNotExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Is_expressionContext right;
		public TerminalNode IS() { return getToken(SParser.IS, 0); }
		public TerminalNode NOT() { return getToken(SParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Is_expressionContext is_expression() {
			return getRuleContext(Is_expressionContext.class,0);
		}
		public IsNotExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterIsNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitIsNotExpression(this);
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
		int _startState = 80;
		enterRecursionRule(_localctx, 80, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(880);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				_localctx = new MinusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(863); 
				match(MINUS);
				setState(864); 
				((MinusExpressionContext)_localctx).exp = expression(31);
				}
				break;
			case 2:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(865); 
				match(NOT);
				setState(866); 
				((NotExpressionContext)_localctx).exp = expression(30);
				}
				break;
			case 3:
				{
				_localctx = new InstanceExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(867); 
				((InstanceExpressionContext)_localctx).exp = instance_expression(0);
				}
				break;
			case 4:
				{
				_localctx = new MethodExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(868); 
				((MethodExpressionContext)_localctx).exp = method_expression();
				}
				break;
			case 5:
				{
				_localctx = new CodeExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(869); 
				match(CODE);
				setState(870); 
				match(LPAR);
				setState(871); 
				((CodeExpressionContext)_localctx).exp = expression(0);
				setState(872); 
				match(RPAR);
				}
				break;
			case 6:
				{
				_localctx = new ExecuteExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(874); 
				match(EXECUTE);
				setState(875); 
				match(LPAR);
				setState(876); 
				((ExecuteExpressionContext)_localctx).name = variable_identifier();
				setState(877); 
				match(RPAR);
				}
				break;
			case 7:
				{
				_localctx = new ClosureExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(879); 
				((ClosureExpressionContext)_localctx).exp = closure_expression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(978);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(976);
					switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplyExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((MultiplyExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(882);
						if (!(precpred(_ctx, 29))) throw new FailedPredicateException(this, "precpred(_ctx, 29)");
						setState(883); 
						multiply();
						setState(884); 
						((MultiplyExpressionContext)_localctx).right = expression(30);
						}
						break;
					case 2:
						{
						_localctx = new DivideExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((DivideExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(886);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(887); 
						divide();
						setState(888); 
						((DivideExpressionContext)_localctx).right = expression(29);
						}
						break;
					case 3:
						{
						_localctx = new ModuloExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ModuloExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(890);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(891); 
						modulo();
						setState(892); 
						((ModuloExpressionContext)_localctx).right = expression(28);
						}
						break;
					case 4:
						{
						_localctx = new IntDivideExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((IntDivideExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(894);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(895); 
						idivide();
						setState(896); 
						((IntDivideExpressionContext)_localctx).right = expression(27);
						}
						break;
					case 5:
						{
						_localctx = new AddExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((AddExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(898);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(899);
						((AddExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((AddExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(900); 
						((AddExpressionContext)_localctx).right = expression(26);
						}
						break;
					case 6:
						{
						_localctx = new LessThanExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((LessThanExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(901);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(902); 
						match(LT);
						setState(903); 
						((LessThanExpressionContext)_localctx).right = expression(25);
						}
						break;
					case 7:
						{
						_localctx = new LessThanOrEqualExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((LessThanOrEqualExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(904);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(905); 
						match(LTE);
						setState(906); 
						((LessThanOrEqualExpressionContext)_localctx).right = expression(24);
						}
						break;
					case 8:
						{
						_localctx = new GreaterThanExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((GreaterThanExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(907);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(908); 
						match(GT);
						setState(909); 
						((GreaterThanExpressionContext)_localctx).right = expression(23);
						}
						break;
					case 9:
						{
						_localctx = new GreaterThanOrEqualExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((GreaterThanOrEqualExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(910);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(911); 
						match(GTE);
						setState(912); 
						((GreaterThanOrEqualExpressionContext)_localctx).right = expression(22);
						}
						break;
					case 10:
						{
						_localctx = new EqualsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((EqualsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(913);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(914); 
						match(EQ2);
						setState(915); 
						((EqualsExpressionContext)_localctx).right = expression(19);
						}
						break;
					case 11:
						{
						_localctx = new NotEqualsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((NotEqualsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(916);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(917); 
						match(XEQ);
						setState(918); 
						((NotEqualsExpressionContext)_localctx).right = expression(18);
						}
						break;
					case 12:
						{
						_localctx = new RoughlyEqualsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((RoughlyEqualsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(919);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(920); 
						match(TEQ);
						setState(921); 
						((RoughlyEqualsExpressionContext)_localctx).right = expression(17);
						}
						break;
					case 13:
						{
						_localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((OrExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(922);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(923); 
						match(OR);
						setState(924); 
						((OrExpressionContext)_localctx).right = expression(16);
						}
						break;
					case 14:
						{
						_localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((AndExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(925);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(926); 
						match(AND);
						setState(927); 
						((AndExpressionContext)_localctx).right = expression(15);
						}
						break;
					case 15:
						{
						_localctx = new TernaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((TernaryExpressionContext)_localctx).ifTrue = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(928);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(929); 
						match(IF);
						setState(930); 
						((TernaryExpressionContext)_localctx).test = expression(0);
						setState(931); 
						match(ELSE);
						setState(932); 
						((TernaryExpressionContext)_localctx).ifFalse = expression(14);
						}
						break;
					case 16:
						{
						_localctx = new InExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((InExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(934);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(935); 
						match(IN);
						setState(936); 
						((InExpressionContext)_localctx).right = expression(12);
						}
						break;
					case 17:
						{
						_localctx = new ContainsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ContainsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(937);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(938); 
						match(CONTAINS);
						setState(939); 
						((ContainsExpressionContext)_localctx).right = expression(11);
						}
						break;
					case 18:
						{
						_localctx = new ContainsAllExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ContainsAllExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(940);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(941); 
						match(CONTAINS);
						setState(942); 
						match(ALL);
						setState(943); 
						((ContainsAllExpressionContext)_localctx).right = expression(10);
						}
						break;
					case 19:
						{
						_localctx = new ContainsAnyExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ContainsAnyExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(944);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(945); 
						match(CONTAINS);
						setState(946); 
						match(ANY);
						setState(947); 
						((ContainsAnyExpressionContext)_localctx).right = expression(9);
						}
						break;
					case 20:
						{
						_localctx = new NotInExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((NotInExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(948);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(949); 
						match(NOT);
						setState(950); 
						match(IN);
						setState(951); 
						((NotInExpressionContext)_localctx).right = expression(8);
						}
						break;
					case 21:
						{
						_localctx = new NotContainsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((NotContainsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(952);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(953); 
						match(NOT);
						setState(954); 
						match(CONTAINS);
						setState(955); 
						((NotContainsExpressionContext)_localctx).right = expression(7);
						}
						break;
					case 22:
						{
						_localctx = new NotContainsAllExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((NotContainsAllExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(956);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(957); 
						match(NOT);
						setState(958); 
						match(CONTAINS);
						setState(959); 
						match(ALL);
						setState(960); 
						((NotContainsAllExpressionContext)_localctx).right = expression(6);
						}
						break;
					case 23:
						{
						_localctx = new NotContainsAnyExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((NotContainsAnyExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(961);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(962); 
						match(NOT);
						setState(963); 
						match(CONTAINS);
						setState(964); 
						match(ANY);
						setState(965); 
						((NotContainsAnyExpressionContext)_localctx).right = expression(5);
						}
						break;
					case 24:
						{
						_localctx = new IsNotExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((IsNotExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(966);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(967); 
						match(IS);
						setState(968); 
						match(NOT);
						setState(969); 
						((IsNotExpressionContext)_localctx).right = is_expression();
						}
						break;
					case 25:
						{
						_localctx = new IsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((IsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(970);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(971); 
						match(IS);
						setState(972); 
						((IsExpressionContext)_localctx).right = is_expression();
						}
						break;
					case 26:
						{
						_localctx = new CastExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((CastExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(973);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(974); 
						match(AS);
						setState(975); 
						((CastExpressionContext)_localctx).right = category_or_any_type();
						}
						break;
					}
					} 
				}
				setState(980);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterClosure_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitClosure_expression(this);
		}
	}

	public final Closure_expressionContext closure_expression() throws RecognitionException {
		Closure_expressionContext _localctx = new Closure_expressionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_closure_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(981); 
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
	public static class SelectableExpressionContext extends Instance_expressionContext {
		public Selectable_expressionContext parent;
		public Selectable_expressionContext selectable_expression() {
			return getRuleContext(Selectable_expressionContext.class,0);
		}
		public SelectableExpressionContext(Instance_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterSelectableExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitSelectableExpression(this);
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterSelectorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitSelectorExpression(this);
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
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_instance_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SelectableExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(984); 
			((SelectableExpressionContext)_localctx).parent = selectable_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(990);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SelectorExpressionContext(new Instance_expressionContext(_parentctx, _parentState));
					((SelectorExpressionContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_instance_expression);
					setState(986);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(987); 
					((SelectorExpressionContext)_localctx).selector = instance_selector();
					}
					} 
				}
				setState(992);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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
		public Method_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_expression; }
	 
		public Method_expressionContext() { }
		public void copyFrom(Method_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MethodCallExpressionContext extends Method_expressionContext {
		public Method_callContext exp;
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public MethodCallExpressionContext(Method_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterMethodCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitMethodCallExpression(this);
		}
	}
	public static class SortedExpressionContext extends Method_expressionContext {
		public Sorted_expressionContext exp;
		public Sorted_expressionContext sorted_expression() {
			return getRuleContext(Sorted_expressionContext.class,0);
		}
		public SortedExpressionContext(Method_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterSortedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitSortedExpression(this);
		}
	}
	public static class ReadExpressionContext extends Method_expressionContext {
		public Read_expressionContext exp;
		public Read_expressionContext read_expression() {
			return getRuleContext(Read_expressionContext.class,0);
		}
		public ReadExpressionContext(Method_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterReadExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitReadExpression(this);
		}
	}
	public static class ConstructorExpressionContext extends Method_expressionContext {
		public Constructor_expressionContext exp;
		public Constructor_expressionContext constructor_expression() {
			return getRuleContext(Constructor_expressionContext.class,0);
		}
		public ConstructorExpressionContext(Method_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterConstructorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitConstructorExpression(this);
		}
	}
	public static class FetchExpressionContext extends Method_expressionContext {
		public Fetch_expressionContext exp;
		public Fetch_expressionContext fetch_expression() {
			return getRuleContext(Fetch_expressionContext.class,0);
		}
		public FetchExpressionContext(Method_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterFetchExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitFetchExpression(this);
		}
	}
	public static class DocumentExpressionContext extends Method_expressionContext {
		public Document_expressionContext exp;
		public Document_expressionContext document_expression() {
			return getRuleContext(Document_expressionContext.class,0);
		}
		public DocumentExpressionContext(Method_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterDocumentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitDocumentExpression(this);
		}
	}

	public final Method_expressionContext method_expression() throws RecognitionException {
		Method_expressionContext _localctx = new Method_expressionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_method_expression);
		try {
			setState(999);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				_localctx = new DocumentExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(993); 
				((DocumentExpressionContext)_localctx).exp = document_expression();
				}
				break;
			case 2:
				_localctx = new FetchExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(994); 
				((FetchExpressionContext)_localctx).exp = fetch_expression();
				}
				break;
			case 3:
				_localctx = new ReadExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(995); 
				((ReadExpressionContext)_localctx).exp = read_expression();
				}
				break;
			case 4:
				_localctx = new SortedExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(996); 
				((SortedExpressionContext)_localctx).exp = sorted_expression();
				}
				break;
			case 5:
				_localctx = new MethodCallExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(997); 
				((MethodCallExpressionContext)_localctx).exp = method_call();
				}
				break;
			case 6:
				_localctx = new ConstructorExpressionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(998); 
				((ConstructorExpressionContext)_localctx).exp = constructor_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode LBRAK() { return getToken(SParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(SParser.RBRAK, 0); }
		public Slice_argumentsContext slice_arguments() {
			return getRuleContext(Slice_argumentsContext.class,0);
		}
		public SliceSelectorContext(Instance_selectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterSliceSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitSliceSelector(this);
		}
	}
	public static class MemberSelectorContext extends Instance_selectorContext {
		public Variable_identifierContext name;
		public TerminalNode DOT() { return getToken(SParser.DOT, 0); }
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public MemberSelectorContext(Instance_selectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterMemberSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitMemberSelector(this);
		}
	}
	public static class ItemSelectorContext extends Instance_selectorContext {
		public ExpressionContext exp;
		public TerminalNode LBRAK() { return getToken(SParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(SParser.RBRAK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ItemSelectorContext(Instance_selectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterItemSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitItemSelector(this);
		}
	}

	public final Instance_selectorContext instance_selector() throws RecognitionException {
		Instance_selectorContext _localctx = new Instance_selectorContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_instance_selector);
		try {
			setState(1014);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				_localctx = new MemberSelectorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1001);
				if (!(this.wasNot(SParser.WS))) throw new FailedPredicateException(this, "$parser.wasNot(SParser.WS)");
				setState(1002); 
				match(DOT);
				setState(1003); 
				((MemberSelectorContext)_localctx).name = variable_identifier();
				}
				break;
			case 2:
				_localctx = new SliceSelectorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1004);
				if (!(this.wasNot(SParser.WS))) throw new FailedPredicateException(this, "$parser.wasNot(SParser.WS)");
				setState(1005); 
				match(LBRAK);
				setState(1006); 
				((SliceSelectorContext)_localctx).xslice = slice_arguments();
				setState(1007); 
				match(RBRAK);
				}
				break;
			case 3:
				_localctx = new ItemSelectorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1009);
				if (!(this.wasNot(SParser.WS))) throw new FailedPredicateException(this, "$parser.wasNot(SParser.WS)");
				setState(1010); 
				match(LBRAK);
				setState(1011); 
				((ItemSelectorContext)_localctx).exp = expression(0);
				setState(1012); 
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
		public Document_typeContext document_type() {
			return getRuleContext(Document_typeContext.class,0);
		}
		public Document_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterDocument_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitDocument_expression(this);
		}
	}

	public final Document_expressionContext document_expression() throws RecognitionException {
		Document_expressionContext _localctx = new Document_expressionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_document_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1016); 
			document_type();
			}
		}
		catch (RecognitionException re) {
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
		public Category_typeContext typ;
		public Argument_assignment_listContext args;
		public TerminalNode LPAR() { return getToken(SParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SParser.RPAR, 0); }
		public Category_typeContext category_type() {
			return getRuleContext(Category_typeContext.class,0);
		}
		public TerminalNode MUTABLE() { return getToken(SParser.MUTABLE, 0); }
		public Argument_assignment_listContext argument_assignment_list() {
			return getRuleContext(Argument_assignment_listContext.class,0);
		}
		public Constructor_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterConstructor_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitConstructor_expression(this);
		}
	}

	public final Constructor_expressionContext constructor_expression() throws RecognitionException {
		Constructor_expressionContext _localctx = new Constructor_expressionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_constructor_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1019);
			_la = _input.LA(1);
			if (_la==MUTABLE) {
				{
				setState(1018); 
				match(MUTABLE);
				}
			}

			setState(1021); 
			((Constructor_expressionContext)_localctx).typ = category_type();
			setState(1022); 
			match(LPAR);
			setState(1024);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << CODE) | (1L << DOCUMENT))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (EXECUTE - 87)) | (1L << (FETCH - 87)) | (1L << (MUTABLE - 87)) | (1L << (NONE - 87)) | (1L << (NOT - 87)) | (1L << (READ - 87)) | (1L << (SELF - 87)) | (1L << (SORTED - 87)) | (1L << (THIS - 87)) | (1L << (BOOLEAN_LITERAL - 87)) | (1L << (CHAR_LITERAL - 87)) | (1L << (MIN_INTEGER - 87)) | (1L << (MAX_INTEGER - 87)) | (1L << (SYMBOL_IDENTIFIER - 87)) | (1L << (TYPE_IDENTIFIER - 87)) | (1L << (VARIABLE_IDENTIFIER - 87)) | (1L << (TEXT_LITERAL - 87)) | (1L << (INTEGER_LITERAL - 87)) | (1L << (HEXA_LITERAL - 87)) | (1L << (DECIMAL_LITERAL - 87)) | (1L << (DATETIME_LITERAL - 87)) | (1L << (TIME_LITERAL - 87)))) != 0) || _la==DATE_LITERAL || _la==PERIOD_LITERAL) {
				{
				setState(1023); 
				((Constructor_expressionContext)_localctx).args = argument_assignment_list(0);
				}
			}

			setState(1026); 
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterExpressionAssignmentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitExpressionAssignmentList(this);
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterArgumentAssignmentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitArgumentAssignmentList(this);
		}
	}
	public static class ArgumentAssignmentListItemContext extends Argument_assignment_listContext {
		public Argument_assignment_listContext items;
		public Argument_assignmentContext item;
		public TerminalNode COMMA() { return getToken(SParser.COMMA, 0); }
		public Argument_assignment_listContext argument_assignment_list() {
			return getRuleContext(Argument_assignment_listContext.class,0);
		}
		public Argument_assignmentContext argument_assignment() {
			return getRuleContext(Argument_assignmentContext.class,0);
		}
		public ArgumentAssignmentListItemContext(Argument_assignment_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterArgumentAssignmentListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitArgumentAssignmentListItem(this);
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
		int _startState = 94;
		enterRecursionRule(_localctx, 94, RULE_argument_assignment_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1033);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				_localctx = new ExpressionAssignmentListContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1029); 
				((ExpressionAssignmentListContext)_localctx).exp = expression(0);
				setState(1030);
				if (!(this.willNotBe(this.equalToken()))) throw new FailedPredicateException(this, "$parser.willNotBe($parser.equalToken())");
				}
				break;
			case 2:
				{
				_localctx = new ArgumentAssignmentListContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1032); 
				((ArgumentAssignmentListContext)_localctx).item = argument_assignment();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1040);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArgumentAssignmentListItemContext(new Argument_assignment_listContext(_parentctx, _parentState));
					((ArgumentAssignmentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_argument_assignment_list);
					setState(1035);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1036); 
					match(COMMA);
					setState(1037); 
					((ArgumentAssignmentListItemContext)_localctx).item = argument_assignment();
					}
					} 
				}
				setState(1042);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterArgument_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitArgument_assignment(this);
		}
	}

	public final Argument_assignmentContext argument_assignment() throws RecognitionException {
		Argument_assignmentContext _localctx = new Argument_assignmentContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_argument_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1043); 
			((Argument_assignmentContext)_localctx).name = variable_identifier();
			setState(1044); 
			assign();
			setState(1045); 
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

	public static class Read_expressionContext extends ParserRuleContext {
		public ExpressionContext source;
		public TerminalNode READ() { return getToken(SParser.READ, 0); }
		public TerminalNode FROM() { return getToken(SParser.FROM, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Read_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterRead_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitRead_expression(this);
		}
	}

	public final Read_expressionContext read_expression() throws RecognitionException {
		Read_expressionContext _localctx = new Read_expressionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_read_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1047); 
			match(READ);
			setState(1048); 
			match(FROM);
			setState(1049); 
			((Read_expressionContext)_localctx).source = expression(0);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode WRITE() { return getToken(SParser.WRITE, 0); }
		public TerminalNode TO() { return getToken(SParser.TO, 0); }
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterWrite_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitWrite_statement(this);
		}
	}

	public final Write_statementContext write_statement() throws RecognitionException {
		Write_statementContext _localctx = new Write_statementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_write_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1051); 
			match(WRITE);
			setState(1052); 
			((Write_statementContext)_localctx).what = expression(0);
			setState(1053); 
			match(TO);
			setState(1054); 
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

	public static class Fetch_expressionContext extends ParserRuleContext {
		public Variable_identifierContext name;
		public ExpressionContext source;
		public ExpressionContext xfilter;
		public TerminalNode FETCH() { return getToken(SParser.FETCH, 0); }
		public TerminalNode FROM() { return getToken(SParser.FROM, 0); }
		public TerminalNode WHERE() { return getToken(SParser.WHERE, 0); }
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Fetch_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fetch_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterFetch_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitFetch_expression(this);
		}
	}

	public final Fetch_expressionContext fetch_expression() throws RecognitionException {
		Fetch_expressionContext _localctx = new Fetch_expressionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_fetch_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1056); 
			match(FETCH);
			setState(1057); 
			((Fetch_expressionContext)_localctx).name = variable_identifier();
			setState(1058); 
			match(FROM);
			setState(1059); 
			((Fetch_expressionContext)_localctx).source = expression(0);
			setState(1060); 
			match(WHERE);
			setState(1061); 
			((Fetch_expressionContext)_localctx).xfilter = expression(0);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode SORTED() { return getToken(SParser.SORTED, 0); }
		public TerminalNode LPAR() { return getToken(SParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SParser.RPAR, 0); }
		public List<Instance_expressionContext> instance_expression() {
			return getRuleContexts(Instance_expressionContext.class);
		}
		public Instance_expressionContext instance_expression(int i) {
			return getRuleContext(Instance_expressionContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(SParser.COMMA, 0); }
		public Key_tokenContext key_token() {
			return getRuleContext(Key_tokenContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SParser.EQ, 0); }
		public Sorted_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sorted_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterSorted_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitSorted_expression(this);
		}
	}

	public final Sorted_expressionContext sorted_expression() throws RecognitionException {
		Sorted_expressionContext _localctx = new Sorted_expressionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_sorted_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1063); 
			match(SORTED);
			setState(1064); 
			match(LPAR);
			setState(1065); 
			((Sorted_expressionContext)_localctx).source = instance_expression(0);
			setState(1071);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1066); 
				match(COMMA);
				setState(1067); 
				key_token();
				setState(1068); 
				match(EQ);
				setState(1069); 
				((Sorted_expressionContext)_localctx).key = instance_expression(0);
				}
			}

			setState(1073); 
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterAssign_instance_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitAssign_instance_statement(this);
		}
	}

	public final Assign_instance_statementContext assign_instance_statement() throws RecognitionException {
		Assign_instance_statementContext _localctx = new Assign_instance_statementContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_assign_instance_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1075); 
			((Assign_instance_statementContext)_localctx).inst = assignable_instance(0);
			setState(1076); 
			assign();
			setState(1077); 
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
		public TerminalNode DOT() { return getToken(SParser.DOT, 0); }
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public MemberInstanceContext(Child_instanceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterMemberInstance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitMemberInstance(this);
		}
	}
	public static class ItemInstanceContext extends Child_instanceContext {
		public ExpressionContext exp;
		public TerminalNode LBRAK() { return getToken(SParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(SParser.RBRAK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ItemInstanceContext(Child_instanceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterItemInstance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitItemInstance(this);
		}
	}

	public final Child_instanceContext child_instance() throws RecognitionException {
		Child_instanceContext _localctx = new Child_instanceContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_child_instance);
		try {
			setState(1087);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				_localctx = new MemberInstanceContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1079);
				if (!(this.wasNot(SParser.WS))) throw new FailedPredicateException(this, "$parser.wasNot(SParser.WS)");
				setState(1080); 
				match(DOT);
				setState(1081); 
				((MemberInstanceContext)_localctx).name = variable_identifier();
				}
				break;
			case 2:
				_localctx = new ItemInstanceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1082);
				if (!(this.wasNot(SParser.WS))) throw new FailedPredicateException(this, "$parser.wasNot(SParser.WS)");
				setState(1083); 
				match(LBRAK);
				setState(1084); 
				((ItemInstanceContext)_localctx).exp = expression(0);
				setState(1085); 
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterAssign_tuple_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitAssign_tuple_statement(this);
		}
	}

	public final Assign_tuple_statementContext assign_tuple_statement() throws RecognitionException {
		Assign_tuple_statementContext _localctx = new Assign_tuple_statementContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_assign_tuple_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1089); 
			((Assign_tuple_statementContext)_localctx).items = variable_identifier_list(0);
			setState(1090); 
			assign();
			setState(1091); 
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
		public List<TerminalNode> LF() { return getTokens(SParser.LF); }
		public TerminalNode LF(int i) {
			return getToken(SParser.LF, i);
		}
		public LfsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lfs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterLfs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitLfs(this);
		}
	}

	public final LfsContext lfs() throws RecognitionException {
		LfsContext _localctx = new LfsContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_lfs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1096);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1093); 
					match(LF);
					}
					} 
				}
				setState(1098);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
		public List<TerminalNode> LF() { return getTokens(SParser.LF); }
		public TerminalNode LF(int i) {
			return getToken(SParser.LF, i);
		}
		public LfpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lfp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterLfp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitLfp(this);
		}
	}

	public final LfpContext lfp() throws RecognitionException {
		LfpContext _localctx = new LfpContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_lfp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1100); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1099); 
				match(LF);
				}
				}
				setState(1102); 
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
		public TerminalNode INDENT() { return getToken(SParser.INDENT, 0); }
		public List<TerminalNode> LF() { return getTokens(SParser.LF); }
		public TerminalNode LF(int i) {
			return getToken(SParser.LF, i);
		}
		public IndentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterIndent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitIndent(this);
		}
	}

	public final IndentContext indent() throws RecognitionException {
		IndentContext _localctx = new IndentContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_indent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1105); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1104); 
				match(LF);
				}
				}
				setState(1107); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LF );
			setState(1109); 
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
		public TerminalNode DEDENT() { return getToken(SParser.DEDENT, 0); }
		public List<TerminalNode> LF() { return getTokens(SParser.LF); }
		public TerminalNode LF(int i) {
			return getToken(SParser.LF, i);
		}
		public DedentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dedent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterDedent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitDedent(this);
		}
	}

	public final DedentContext dedent() throws RecognitionException {
		DedentContext _localctx = new DedentContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_dedent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LF) {
				{
				{
				setState(1111); 
				match(LF);
				}
				}
				setState(1116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1117); 
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
		public TerminalNode NONE() { return getToken(SParser.NONE, 0); }
		public Null_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterNull_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitNull_literal(this);
		}
	}

	public final Null_literalContext null_literal() throws RecognitionException {
		Null_literalContext _localctx = new Null_literalContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_null_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1119); 
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
		public DeclarationsContext items;
		public LfsContext lfs() {
			return getRuleContext(LfsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SParser.EOF, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public FullDeclarationListContext(Declaration_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterFullDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitFullDeclarationList(this);
		}
	}

	public final Declaration_listContext declaration_list() throws RecognitionException {
		Declaration_listContext _localctx = new Declaration_listContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_declaration_list);
		int _la;
		try {
			_localctx = new FullDeclarationListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1122);
			_la = _input.LA(1);
			if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (ABSTRACT - 61)) | (1L << (ATTR - 61)) | (1L << (CATEGORY - 61)) | (1L << (CLASS - 61)) | (1L << (DEF - 61)) | (1L << (ENUM - 61)) | (1L << (NATIVE - 61)) | (1L << (SINGLETON - 61)))) != 0)) {
				{
				setState(1121); 
				((FullDeclarationListContext)_localctx).items = declarations(0);
				}
			}

			setState(1124); 
			lfs();
			setState(1125); 
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
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
	 
		public DeclarationsContext() { }
		public void copyFrom(DeclarationsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclarationListContext extends DeclarationsContext {
		public DeclarationContext item;
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclarationListContext(DeclarationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitDeclarationList(this);
		}
	}
	public static class DeclarationListItemContext extends DeclarationsContext {
		public DeclarationsContext items;
		public DeclarationContext item;
		public LfpContext lfp() {
			return getRuleContext(LfpContext.class,0);
		}
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclarationListItemContext(DeclarationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterDeclarationListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitDeclarationListItem(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		return declarations(0);
	}

	private DeclarationsContext declarations(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, _parentState);
		DeclarationsContext _prevctx = _localctx;
		int _startState = 124;
		enterRecursionRule(_localctx, 124, RULE_declarations, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new DeclarationListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1128); 
			((DeclarationListContext)_localctx).item = declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(1136);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DeclarationListItemContext(new DeclarationsContext(_parentctx, _parentState));
					((DeclarationListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_declarations);
					setState(1130);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1131); 
					lfp();
					setState(1132); 
					((DeclarationListItemContext)_localctx).item = declaration();
					}
					} 
				}
				setState(1138);
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

	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CategoryDeclarationContext extends DeclarationContext {
		public Category_declarationContext decl;
		public Category_declarationContext category_declaration() {
			return getRuleContext(Category_declarationContext.class,0);
		}
		public CategoryDeclarationContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterCategoryDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitCategoryDeclaration(this);
		}
	}
	public static class ResourceDeclarationContext extends DeclarationContext {
		public Resource_declarationContext decl;
		public Resource_declarationContext resource_declaration() {
			return getRuleContext(Resource_declarationContext.class,0);
		}
		public ResourceDeclarationContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterResourceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitResourceDeclaration(this);
		}
	}
	public static class AttributeDeclarationContext extends DeclarationContext {
		public Attribute_declarationContext decl;
		public Attribute_declarationContext attribute_declaration() {
			return getRuleContext(Attribute_declarationContext.class,0);
		}
		public AttributeDeclarationContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterAttributeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitAttributeDeclaration(this);
		}
	}
	public static class MethodDeclarationContext extends DeclarationContext {
		public Method_declarationContext decl;
		public Method_declarationContext method_declaration() {
			return getRuleContext(Method_declarationContext.class,0);
		}
		public MethodDeclarationContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitMethodDeclaration(this);
		}
	}
	public static class EnumDeclarationContext extends DeclarationContext {
		public Enum_declarationContext decl;
		public Enum_declarationContext enum_declaration() {
			return getRuleContext(Enum_declarationContext.class,0);
		}
		public EnumDeclarationContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitEnumDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_declaration);
		try {
			setState(1144);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				_localctx = new AttributeDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1139); 
				((AttributeDeclarationContext)_localctx).decl = attribute_declaration();
				}
				break;
			case 2:
				_localctx = new CategoryDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1140); 
				((CategoryDeclarationContext)_localctx).decl = category_declaration();
				}
				break;
			case 3:
				_localctx = new ResourceDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1141); 
				((ResourceDeclarationContext)_localctx).decl = resource_declaration();
				}
				break;
			case 4:
				_localctx = new EnumDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1142); 
				((EnumDeclarationContext)_localctx).decl = enum_declaration();
				}
				break;
			case 5:
				_localctx = new MethodDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1143); 
				((MethodDeclarationContext)_localctx).decl = method_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
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
		public Native_resource_declarationContext decl;
		public Native_resource_declarationContext native_resource_declaration() {
			return getRuleContext(Native_resource_declarationContext.class,0);
		}
		public Resource_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterResource_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitResource_declaration(this);
		}
	}

	public final Resource_declarationContext resource_declaration() throws RecognitionException {
		Resource_declarationContext _localctx = new Resource_declarationContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_resource_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1146); 
			((Resource_declarationContext)_localctx).decl = native_resource_declaration();
			}
		}
		catch (RecognitionException re) {
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
		public Enum_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_declaration; }
	 
		public Enum_declarationContext() { }
		public void copyFrom(Enum_declarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EnumNativeDeclarationContext extends Enum_declarationContext {
		public Enum_native_declarationContext decl;
		public Enum_native_declarationContext enum_native_declaration() {
			return getRuleContext(Enum_native_declarationContext.class,0);
		}
		public EnumNativeDeclarationContext(Enum_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterEnumNativeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitEnumNativeDeclaration(this);
		}
	}
	public static class EnumCategoryDeclarationContext extends Enum_declarationContext {
		public Enum_category_declarationContext decl;
		public Enum_category_declarationContext enum_category_declaration() {
			return getRuleContext(Enum_category_declarationContext.class,0);
		}
		public EnumCategoryDeclarationContext(Enum_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterEnumCategoryDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitEnumCategoryDeclaration(this);
		}
	}

	public final Enum_declarationContext enum_declaration() throws RecognitionException {
		Enum_declarationContext _localctx = new Enum_declarationContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_enum_declaration);
		try {
			setState(1150);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				_localctx = new EnumCategoryDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1148); 
				((EnumCategoryDeclarationContext)_localctx).decl = enum_category_declaration();
				}
				break;
			case 2:
				_localctx = new EnumNativeDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1149); 
				((EnumNativeDeclarationContext)_localctx).decl = enum_native_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
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
		public Native_symbol_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_native_symbol_list; }
	 
		public Native_symbol_listContext() { }
		public void copyFrom(Native_symbol_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NativeSymbolListContext extends Native_symbol_listContext {
		public Native_symbolContext item;
		public Native_symbolContext native_symbol() {
			return getRuleContext(Native_symbolContext.class,0);
		}
		public NativeSymbolListContext(Native_symbol_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterNativeSymbolList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitNativeSymbolList(this);
		}
	}
	public static class NativeSymbolListItemContext extends Native_symbol_listContext {
		public Native_symbol_listContext items;
		public Native_symbolContext item;
		public LfpContext lfp() {
			return getRuleContext(LfpContext.class,0);
		}
		public Native_symbol_listContext native_symbol_list() {
			return getRuleContext(Native_symbol_listContext.class,0);
		}
		public Native_symbolContext native_symbol() {
			return getRuleContext(Native_symbolContext.class,0);
		}
		public NativeSymbolListItemContext(Native_symbol_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterNativeSymbolListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitNativeSymbolListItem(this);
		}
	}

	public final Native_symbol_listContext native_symbol_list() throws RecognitionException {
		return native_symbol_list(0);
	}

	private Native_symbol_listContext native_symbol_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Native_symbol_listContext _localctx = new Native_symbol_listContext(_ctx, _parentState);
		Native_symbol_listContext _prevctx = _localctx;
		int _startState = 132;
		enterRecursionRule(_localctx, 132, RULE_native_symbol_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new NativeSymbolListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1153); 
			((NativeSymbolListContext)_localctx).item = native_symbol();
			}
			_ctx.stop = _input.LT(-1);
			setState(1161);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NativeSymbolListItemContext(new Native_symbol_listContext(_parentctx, _parentState));
					((NativeSymbolListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_native_symbol_list);
					setState(1155);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1156); 
					lfp();
					setState(1157); 
					((NativeSymbolListItemContext)_localctx).item = native_symbol();
					}
					} 
				}
				setState(1163);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
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

	public static class Category_symbol_listContext extends ParserRuleContext {
		public Category_symbol_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_category_symbol_list; }
	 
		public Category_symbol_listContext() { }
		public void copyFrom(Category_symbol_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CategorySymbolListItemContext extends Category_symbol_listContext {
		public Category_symbol_listContext items;
		public Category_symbolContext item;
		public LfpContext lfp() {
			return getRuleContext(LfpContext.class,0);
		}
		public Category_symbol_listContext category_symbol_list() {
			return getRuleContext(Category_symbol_listContext.class,0);
		}
		public Category_symbolContext category_symbol() {
			return getRuleContext(Category_symbolContext.class,0);
		}
		public CategorySymbolListItemContext(Category_symbol_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterCategorySymbolListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitCategorySymbolListItem(this);
		}
	}
	public static class CategorySymbolListContext extends Category_symbol_listContext {
		public Category_symbolContext item;
		public Category_symbolContext category_symbol() {
			return getRuleContext(Category_symbolContext.class,0);
		}
		public CategorySymbolListContext(Category_symbol_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterCategorySymbolList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitCategorySymbolList(this);
		}
	}

	public final Category_symbol_listContext category_symbol_list() throws RecognitionException {
		return category_symbol_list(0);
	}

	private Category_symbol_listContext category_symbol_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Category_symbol_listContext _localctx = new Category_symbol_listContext(_ctx, _parentState);
		Category_symbol_listContext _prevctx = _localctx;
		int _startState = 134;
		enterRecursionRule(_localctx, 134, RULE_category_symbol_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new CategorySymbolListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1165); 
			((CategorySymbolListContext)_localctx).item = category_symbol();
			}
			_ctx.stop = _input.LT(-1);
			setState(1173);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CategorySymbolListItemContext(new Category_symbol_listContext(_parentctx, _parentState));
					((CategorySymbolListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_category_symbol_list);
					setState(1167);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1168); 
					lfp();
					setState(1169); 
					((CategorySymbolListItemContext)_localctx).item = category_symbol();
					}
					} 
				}
				setState(1175);
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

	public static class Symbol_listContext extends ParserRuleContext {
		public Symbol_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbol_list; }
	 
		public Symbol_listContext() { }
		public void copyFrom(Symbol_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SymbolListContext extends Symbol_listContext {
		public Symbol_identifierContext item;
		public Symbol_identifierContext symbol_identifier() {
			return getRuleContext(Symbol_identifierContext.class,0);
		}
		public SymbolListContext(Symbol_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterSymbolList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitSymbolList(this);
		}
	}
	public static class SymbolListItemContext extends Symbol_listContext {
		public Symbol_listContext items;
		public Symbol_identifierContext item;
		public TerminalNode COMMA() { return getToken(SParser.COMMA, 0); }
		public Symbol_listContext symbol_list() {
			return getRuleContext(Symbol_listContext.class,0);
		}
		public Symbol_identifierContext symbol_identifier() {
			return getRuleContext(Symbol_identifierContext.class,0);
		}
		public SymbolListItemContext(Symbol_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterSymbolListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitSymbolListItem(this);
		}
	}

	public final Symbol_listContext symbol_list() throws RecognitionException {
		return symbol_list(0);
	}

	private Symbol_listContext symbol_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Symbol_listContext _localctx = new Symbol_listContext(_ctx, _parentState);
		Symbol_listContext _prevctx = _localctx;
		int _startState = 136;
		enterRecursionRule(_localctx, 136, RULE_symbol_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SymbolListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1177); 
			((SymbolListContext)_localctx).item = symbol_identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(1184);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SymbolListItemContext(new Symbol_listContext(_parentctx, _parentState));
					((SymbolListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_symbol_list);
					setState(1179);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1180); 
					match(COMMA);
					setState(1181); 
					((SymbolListItemContext)_localctx).item = symbol_identifier();
					}
					} 
				}
				setState(1186);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
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
	public static class MatchingExpressionContext extends Attribute_constraintContext {
		public ExpressionContext exp;
		public TerminalNode MATCHING() { return getToken(SParser.MATCHING, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MatchingExpressionContext(Attribute_constraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterMatchingExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitMatchingExpression(this);
		}
	}
	public static class MatchingListContext extends Attribute_constraintContext {
		public List_literalContext source;
		public TerminalNode IN() { return getToken(SParser.IN, 0); }
		public List_literalContext list_literal() {
			return getRuleContext(List_literalContext.class,0);
		}
		public MatchingListContext(Attribute_constraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterMatchingList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitMatchingList(this);
		}
	}
	public static class MatchingRangeContext extends Attribute_constraintContext {
		public Range_literalContext source;
		public TerminalNode IN() { return getToken(SParser.IN, 0); }
		public Range_literalContext range_literal() {
			return getRuleContext(Range_literalContext.class,0);
		}
		public MatchingRangeContext(Attribute_constraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterMatchingRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitMatchingRange(this);
		}
	}
	public static class MatchingSetContext extends Attribute_constraintContext {
		public Set_literalContext source;
		public TerminalNode IN() { return getToken(SParser.IN, 0); }
		public Set_literalContext set_literal() {
			return getRuleContext(Set_literalContext.class,0);
		}
		public MatchingSetContext(Attribute_constraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterMatchingSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitMatchingSet(this);
		}
	}
	public static class MatchingPatternContext extends Attribute_constraintContext {
		public Token text;
		public TerminalNode MATCHING() { return getToken(SParser.MATCHING, 0); }
		public TerminalNode TEXT_LITERAL() { return getToken(SParser.TEXT_LITERAL, 0); }
		public MatchingPatternContext(Attribute_constraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterMatchingPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitMatchingPattern(this);
		}
	}

	public final Attribute_constraintContext attribute_constraint() throws RecognitionException {
		Attribute_constraintContext _localctx = new Attribute_constraintContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_attribute_constraint);
		try {
			setState(1197);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				_localctx = new MatchingListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1187); 
				match(IN);
				setState(1188); 
				((MatchingListContext)_localctx).source = list_literal();
				}
				break;
			case 2:
				_localctx = new MatchingSetContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1189); 
				match(IN);
				setState(1190); 
				((MatchingSetContext)_localctx).source = set_literal();
				}
				break;
			case 3:
				_localctx = new MatchingRangeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1191); 
				match(IN);
				setState(1192); 
				((MatchingRangeContext)_localctx).source = range_literal();
				}
				break;
			case 4:
				_localctx = new MatchingPatternContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1193); 
				match(MATCHING);
				setState(1194); 
				((MatchingPatternContext)_localctx).text = match(TEXT_LITERAL);
				}
				break;
			case 5:
				_localctx = new MatchingExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1195); 
				match(MATCHING);
				setState(1196); 
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
		public Expression_listContext items;
		public TerminalNode LBRAK() { return getToken(SParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(SParser.RBRAK, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public List_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterList_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitList_literal(this);
		}
	}

	public final List_literalContext list_literal() throws RecognitionException {
		List_literalContext _localctx = new List_literalContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_list_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1199); 
			match(LBRAK);
			setState(1201);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << CODE) | (1L << DOCUMENT))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (EXECUTE - 87)) | (1L << (FETCH - 87)) | (1L << (MUTABLE - 87)) | (1L << (NONE - 87)) | (1L << (NOT - 87)) | (1L << (READ - 87)) | (1L << (SELF - 87)) | (1L << (SORTED - 87)) | (1L << (THIS - 87)) | (1L << (BOOLEAN_LITERAL - 87)) | (1L << (CHAR_LITERAL - 87)) | (1L << (MIN_INTEGER - 87)) | (1L << (MAX_INTEGER - 87)) | (1L << (SYMBOL_IDENTIFIER - 87)) | (1L << (TYPE_IDENTIFIER - 87)) | (1L << (VARIABLE_IDENTIFIER - 87)) | (1L << (TEXT_LITERAL - 87)) | (1L << (INTEGER_LITERAL - 87)) | (1L << (HEXA_LITERAL - 87)) | (1L << (DECIMAL_LITERAL - 87)) | (1L << (DATETIME_LITERAL - 87)) | (1L << (TIME_LITERAL - 87)))) != 0) || _la==DATE_LITERAL || _la==PERIOD_LITERAL) {
				{
				setState(1200); 
				((List_literalContext)_localctx).items = expression_list(0);
				}
			}

			setState(1203); 
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
		public Expression_listContext items;
		public TerminalNode LT() { return getToken(SParser.LT, 0); }
		public TerminalNode GT() { return getToken(SParser.GT, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Set_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterSet_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitSet_literal(this);
		}
	}

	public final Set_literalContext set_literal() throws RecognitionException {
		Set_literalContext _localctx = new Set_literalContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_set_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1205); 
			match(LT);
			setState(1207);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << CODE) | (1L << DOCUMENT))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (EXECUTE - 87)) | (1L << (FETCH - 87)) | (1L << (MUTABLE - 87)) | (1L << (NONE - 87)) | (1L << (NOT - 87)) | (1L << (READ - 87)) | (1L << (SELF - 87)) | (1L << (SORTED - 87)) | (1L << (THIS - 87)) | (1L << (BOOLEAN_LITERAL - 87)) | (1L << (CHAR_LITERAL - 87)) | (1L << (MIN_INTEGER - 87)) | (1L << (MAX_INTEGER - 87)) | (1L << (SYMBOL_IDENTIFIER - 87)) | (1L << (TYPE_IDENTIFIER - 87)) | (1L << (VARIABLE_IDENTIFIER - 87)) | (1L << (TEXT_LITERAL - 87)) | (1L << (INTEGER_LITERAL - 87)) | (1L << (HEXA_LITERAL - 87)) | (1L << (DECIMAL_LITERAL - 87)) | (1L << (DATETIME_LITERAL - 87)) | (1L << (TIME_LITERAL - 87)))) != 0) || _la==DATE_LITERAL || _la==PERIOD_LITERAL) {
				{
				setState(1206); 
				((Set_literalContext)_localctx).items = expression_list(0);
				}
			}

			setState(1209); 
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
		public Expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
	 
		public Expression_listContext() { }
		public void copyFrom(Expression_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValueListItemContext extends Expression_listContext {
		public Expression_listContext items;
		public ExpressionContext item;
		public TerminalNode COMMA() { return getToken(SParser.COMMA, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ValueListItemContext(Expression_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterValueListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitValueListItem(this);
		}
	}
	public static class ValueListContext extends Expression_listContext {
		public ExpressionContext item;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ValueListContext(Expression_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitValueList(this);
		}
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		return expression_list(0);
	}

	private Expression_listContext expression_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expression_listContext _localctx = new Expression_listContext(_ctx, _parentState);
		Expression_listContext _prevctx = _localctx;
		int _startState = 144;
		enterRecursionRule(_localctx, 144, RULE_expression_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ValueListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1212); 
			((ValueListContext)_localctx).item = expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1219);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ValueListItemContext(new Expression_listContext(_parentctx, _parentState));
					((ValueListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_expression_list);
					setState(1214);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1215); 
					match(COMMA);
					setState(1216); 
					((ValueListItemContext)_localctx).item = expression(0);
					}
					} 
				}
				setState(1221);
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

	public static class Range_literalContext extends ParserRuleContext {
		public ExpressionContext low;
		public ExpressionContext high;
		public TerminalNode LBRAK() { return getToken(SParser.LBRAK, 0); }
		public TerminalNode RANGE() { return getToken(SParser.RANGE, 0); }
		public TerminalNode RBRAK() { return getToken(SParser.RBRAK, 0); }
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterRange_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitRange_literal(this);
		}
	}

	public final Range_literalContext range_literal() throws RecognitionException {
		Range_literalContext _localctx = new Range_literalContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_range_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1222); 
			match(LBRAK);
			setState(1223); 
			((Range_literalContext)_localctx).low = expression(0);
			setState(1224); 
			match(RANGE);
			setState(1225); 
			((Range_literalContext)_localctx).high = expression(0);
			setState(1226); 
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
	public static class ListTypeContext extends TypedefContext {
		public TypedefContext l;
		public TerminalNode LBRAK() { return getToken(SParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(SParser.RBRAK, 0); }
		public TypedefContext typedef() {
			return getRuleContext(TypedefContext.class,0);
		}
		public ListTypeContext(TypedefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterListType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitListType(this);
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterPrimaryType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitPrimaryType(this);
		}
	}
	public static class DictTypeContext extends TypedefContext {
		public TypedefContext d;
		public TerminalNode LCURL() { return getToken(SParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(SParser.RCURL, 0); }
		public TypedefContext typedef() {
			return getRuleContext(TypedefContext.class,0);
		}
		public DictTypeContext(TypedefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterDictType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitDictType(this);
		}
	}
	public static class SetTypeContext extends TypedefContext {
		public TypedefContext s;
		public TerminalNode LTGT() { return getToken(SParser.LTGT, 0); }
		public TypedefContext typedef() {
			return getRuleContext(TypedefContext.class,0);
		}
		public SetTypeContext(TypedefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterSetType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitSetType(this);
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
		int _startState = 148;
		enterRecursionRule(_localctx, 148, RULE_typedef, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PrimaryTypeContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1229); 
			((PrimaryTypeContext)_localctx).p = primary_type();
			}
			_ctx.stop = _input.LT(-1);
			setState(1241);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1239);
					switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
					case 1:
						{
						_localctx = new SetTypeContext(new TypedefContext(_parentctx, _parentState));
						((SetTypeContext)_localctx).s = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_typedef);
						setState(1231);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1232); 
						match(LTGT);
						}
						break;
					case 2:
						{
						_localctx = new ListTypeContext(new TypedefContext(_parentctx, _parentState));
						((ListTypeContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_typedef);
						setState(1233);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1234); 
						match(LBRAK);
						setState(1235); 
						match(RBRAK);
						}
						break;
					case 3:
						{
						_localctx = new DictTypeContext(new TypedefContext(_parentctx, _parentState));
						((DictTypeContext)_localctx).d = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_typedef);
						setState(1236);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1237); 
						match(LCURL);
						setState(1238); 
						match(RCURL);
						}
						break;
					}
					} 
				}
				setState(1243);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
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
	public static class CategoryTypeContext extends Primary_typeContext {
		public Category_typeContext c;
		public Category_typeContext category_type() {
			return getRuleContext(Category_typeContext.class,0);
		}
		public CategoryTypeContext(Primary_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterCategoryType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitCategoryType(this);
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterNativeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitNativeType(this);
		}
	}

	public final Primary_typeContext primary_type() throws RecognitionException {
		Primary_typeContext _localctx = new Primary_typeContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_primary_type);
		try {
			setState(1246);
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
				_localctx = new NativeTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1244); 
				((NativeTypeContext)_localctx).n = native_type();
				}
				break;
			case TYPE_IDENTIFIER:
				_localctx = new CategoryTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1245); 
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
	public static class DateTimeTypeContext extends Native_typeContext {
		public Token t1;
		public TerminalNode DATETIME() { return getToken(SParser.DATETIME, 0); }
		public DateTimeTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterDateTimeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitDateTimeType(this);
		}
	}
	public static class TimeTypeContext extends Native_typeContext {
		public Token t1;
		public TerminalNode TIME() { return getToken(SParser.TIME, 0); }
		public TimeTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterTimeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitTimeType(this);
		}
	}
	public static class TextTypeContext extends Native_typeContext {
		public Token t1;
		public TerminalNode TEXT() { return getToken(SParser.TEXT, 0); }
		public TextTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterTextType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitTextType(this);
		}
	}
	public static class CodeTypeContext extends Native_typeContext {
		public Token t1;
		public TerminalNode CODE() { return getToken(SParser.CODE, 0); }
		public CodeTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterCodeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitCodeType(this);
		}
	}
	public static class IntegerTypeContext extends Native_typeContext {
		public Token t1;
		public TerminalNode INTEGER() { return getToken(SParser.INTEGER, 0); }
		public IntegerTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterIntegerType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitIntegerType(this);
		}
	}
	public static class DecimalTypeContext extends Native_typeContext {
		public Token t1;
		public TerminalNode DECIMAL() { return getToken(SParser.DECIMAL, 0); }
		public DecimalTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterDecimalType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitDecimalType(this);
		}
	}
	public static class PeriodTypeContext extends Native_typeContext {
		public Token t1;
		public TerminalNode PERIOD() { return getToken(SParser.PERIOD, 0); }
		public PeriodTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterPeriodType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitPeriodType(this);
		}
	}
	public static class DateTypeContext extends Native_typeContext {
		public Token t1;
		public TerminalNode DATE() { return getToken(SParser.DATE, 0); }
		public DateTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterDateType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitDateType(this);
		}
	}
	public static class CharacterTypeContext extends Native_typeContext {
		public Token t1;
		public TerminalNode CHARACTER() { return getToken(SParser.CHARACTER, 0); }
		public CharacterTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterCharacterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitCharacterType(this);
		}
	}
	public static class BooleanTypeContext extends Native_typeContext {
		public Token t1;
		public TerminalNode BOOLEAN() { return getToken(SParser.BOOLEAN, 0); }
		public BooleanTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterBooleanType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitBooleanType(this);
		}
	}

	public final Native_typeContext native_type() throws RecognitionException {
		Native_typeContext _localctx = new Native_typeContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_native_type);
		try {
			setState(1258);
			switch (_input.LA(1)) {
			case BOOLEAN:
				_localctx = new BooleanTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1248); 
				((BooleanTypeContext)_localctx).t1 = match(BOOLEAN);
				}
				break;
			case CHARACTER:
				_localctx = new CharacterTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1249); 
				((CharacterTypeContext)_localctx).t1 = match(CHARACTER);
				}
				break;
			case TEXT:
				_localctx = new TextTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1250); 
				((TextTypeContext)_localctx).t1 = match(TEXT);
				}
				break;
			case INTEGER:
				_localctx = new IntegerTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1251); 
				((IntegerTypeContext)_localctx).t1 = match(INTEGER);
				}
				break;
			case DECIMAL:
				_localctx = new DecimalTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1252); 
				((DecimalTypeContext)_localctx).t1 = match(DECIMAL);
				}
				break;
			case DATE:
				_localctx = new DateTypeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1253); 
				((DateTypeContext)_localctx).t1 = match(DATE);
				}
				break;
			case DATETIME:
				_localctx = new DateTimeTypeContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1254); 
				((DateTimeTypeContext)_localctx).t1 = match(DATETIME);
				}
				break;
			case TIME:
				_localctx = new TimeTypeContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1255); 
				((TimeTypeContext)_localctx).t1 = match(TIME);
				}
				break;
			case PERIOD:
				_localctx = new PeriodTypeContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1256); 
				((PeriodTypeContext)_localctx).t1 = match(PERIOD);
				}
				break;
			case CODE:
				_localctx = new CodeTypeContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1257); 
				((CodeTypeContext)_localctx).t1 = match(CODE);
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
		public TerminalNode TYPE_IDENTIFIER() { return getToken(SParser.TYPE_IDENTIFIER, 0); }
		public Category_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_category_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterCategory_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitCategory_type(this);
		}
	}

	public final Category_typeContext category_type() throws RecognitionException {
		Category_typeContext _localctx = new Category_typeContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_category_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1260); 
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

	public static class Code_typeContext extends ParserRuleContext {
		public Token t1;
		public TerminalNode CODE() { return getToken(SParser.CODE, 0); }
		public Code_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterCode_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitCode_type(this);
		}
	}

	public final Code_typeContext code_type() throws RecognitionException {
		Code_typeContext _localctx = new Code_typeContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_code_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1262); 
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

	public static class Document_typeContext extends ParserRuleContext {
		public Token t1;
		public TerminalNode DOCUMENT() { return getToken(SParser.DOCUMENT, 0); }
		public Document_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterDocument_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitDocument_type(this);
		}
	}

	public final Document_typeContext document_type() throws RecognitionException {
		Document_typeContext _localctx = new Document_typeContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_document_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1264); 
			((Document_typeContext)_localctx).t1 = match(DOCUMENT);
			}
		}
		catch (RecognitionException re) {
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterConcreteCategoryDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitConcreteCategoryDeclaration(this);
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterNativeCategoryDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitNativeCategoryDeclaration(this);
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterSingletonCategoryDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitSingletonCategoryDeclaration(this);
		}
	}

	public final Category_declarationContext category_declaration() throws RecognitionException {
		Category_declarationContext _localctx = new Category_declarationContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_category_declaration);
		try {
			setState(1269);
			switch (_input.LA(1)) {
			case CATEGORY:
			case CLASS:
				_localctx = new ConcreteCategoryDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1266); 
				((ConcreteCategoryDeclarationContext)_localctx).decl = concrete_category_declaration();
				}
				break;
			case NATIVE:
				_localctx = new NativeCategoryDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1267); 
				((NativeCategoryDeclarationContext)_localctx).decl = native_category_declaration();
				}
				break;
			case SINGLETON:
				_localctx = new SingletonCategoryDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1268); 
				((SingletonCategoryDeclarationContext)_localctx).decl = singleton_category_declaration();
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
		public Type_identifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_identifier_list; }
	 
		public Type_identifier_listContext() { }
		public void copyFrom(Type_identifier_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TypeIdentifierListItemContext extends Type_identifier_listContext {
		public Type_identifier_listContext items;
		public Type_identifierContext item;
		public TerminalNode COMMA() { return getToken(SParser.COMMA, 0); }
		public Type_identifier_listContext type_identifier_list() {
			return getRuleContext(Type_identifier_listContext.class,0);
		}
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public TypeIdentifierListItemContext(Type_identifier_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterTypeIdentifierListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitTypeIdentifierListItem(this);
		}
	}
	public static class TypeIdentifierListContext extends Type_identifier_listContext {
		public Type_identifierContext item;
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public TypeIdentifierListContext(Type_identifier_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterTypeIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitTypeIdentifierList(this);
		}
	}

	public final Type_identifier_listContext type_identifier_list() throws RecognitionException {
		return type_identifier_list(0);
	}

	private Type_identifier_listContext type_identifier_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Type_identifier_listContext _localctx = new Type_identifier_listContext(_ctx, _parentState);
		Type_identifier_listContext _prevctx = _localctx;
		int _startState = 162;
		enterRecursionRule(_localctx, 162, RULE_type_identifier_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new TypeIdentifierListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1272); 
			((TypeIdentifierListContext)_localctx).item = type_identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(1279);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeIdentifierListItemContext(new Type_identifier_listContext(_parentctx, _parentState));
					((TypeIdentifierListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_type_identifier_list);
					setState(1274);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1275); 
					match(COMMA);
					setState(1276); 
					((TypeIdentifierListItemContext)_localctx).item = type_identifier();
					}
					} 
				}
				setState(1281);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
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

	public static class Method_identifierContext extends ParserRuleContext {
		public Method_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_identifier; }
	 
		public Method_identifierContext() { }
		public void copyFrom(Method_identifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MethodVariableIdentifierContext extends Method_identifierContext {
		public Variable_identifierContext name;
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public MethodVariableIdentifierContext(Method_identifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterMethodVariableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitMethodVariableIdentifier(this);
		}
	}
	public static class MethodTypeIdentifierContext extends Method_identifierContext {
		public Type_identifierContext name;
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public MethodTypeIdentifierContext(Method_identifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterMethodTypeIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitMethodTypeIdentifier(this);
		}
	}

	public final Method_identifierContext method_identifier() throws RecognitionException {
		Method_identifierContext _localctx = new Method_identifierContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_method_identifier);
		try {
			setState(1284);
			switch (_input.LA(1)) {
			case VARIABLE_IDENTIFIER:
				_localctx = new MethodVariableIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1282); 
				((MethodVariableIdentifierContext)_localctx).name = variable_identifier();
				}
				break;
			case TYPE_IDENTIFIER:
				_localctx = new MethodTypeIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1283); 
				((MethodTypeIdentifierContext)_localctx).name = type_identifier();
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
	public static class SymbolIdentifierContext extends IdentifierContext {
		public Symbol_identifierContext name;
		public Symbol_identifierContext symbol_identifier() {
			return getRuleContext(Symbol_identifierContext.class,0);
		}
		public SymbolIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterSymbolIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitSymbolIdentifier(this);
		}
	}
	public static class VariableIdentifierContext extends IdentifierContext {
		public Variable_identifierContext name;
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public VariableIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterVariableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitVariableIdentifier(this);
		}
	}
	public static class TypeIdentifierContext extends IdentifierContext {
		public Type_identifierContext name;
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public TypeIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterTypeIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitTypeIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_identifier);
		try {
			setState(1289);
			switch (_input.LA(1)) {
			case VARIABLE_IDENTIFIER:
				_localctx = new VariableIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1286); 
				((VariableIdentifierContext)_localctx).name = variable_identifier();
				}
				break;
			case TYPE_IDENTIFIER:
				_localctx = new TypeIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1287); 
				((TypeIdentifierContext)_localctx).name = type_identifier();
				}
				break;
			case SYMBOL_IDENTIFIER:
				_localctx = new SymbolIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1288); 
				((SymbolIdentifierContext)_localctx).name = symbol_identifier();
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
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(SParser.VARIABLE_IDENTIFIER, 0); }
		public Variable_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterVariable_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitVariable_identifier(this);
		}
	}

	public final Variable_identifierContext variable_identifier() throws RecognitionException {
		Variable_identifierContext _localctx = new Variable_identifierContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_variable_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1291); 
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

	public static class Type_identifierContext extends ParserRuleContext {
		public TerminalNode TYPE_IDENTIFIER() { return getToken(SParser.TYPE_IDENTIFIER, 0); }
		public Type_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterType_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitType_identifier(this);
		}
	}

	public final Type_identifierContext type_identifier() throws RecognitionException {
		Type_identifierContext _localctx = new Type_identifierContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_type_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1293); 
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
		public TerminalNode SYMBOL_IDENTIFIER() { return getToken(SParser.SYMBOL_IDENTIFIER, 0); }
		public Symbol_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbol_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterSymbol_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitSymbol_identifier(this);
		}
	}

	public final Symbol_identifierContext symbol_identifier() throws RecognitionException {
		Symbol_identifierContext _localctx = new Symbol_identifierContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_symbol_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1295); 
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
		public Argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_list; }
	 
		public Argument_listContext() { }
		public void copyFrom(Argument_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArgumentListItemContext extends Argument_listContext {
		public Argument_listContext items;
		public ArgumentContext item;
		public TerminalNode COMMA() { return getToken(SParser.COMMA, 0); }
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public ArgumentListItemContext(Argument_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterArgumentListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitArgumentListItem(this);
		}
	}
	public static class ArgumentListContext extends Argument_listContext {
		public ArgumentContext item;
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public ArgumentListContext(Argument_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitArgumentList(this);
		}
	}

	public final Argument_listContext argument_list() throws RecognitionException {
		return argument_list(0);
	}

	private Argument_listContext argument_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Argument_listContext _localctx = new Argument_listContext(_ctx, _parentState);
		Argument_listContext _prevctx = _localctx;
		int _startState = 174;
		enterRecursionRule(_localctx, 174, RULE_argument_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1298); 
			((ArgumentListContext)_localctx).item = argument();
			}
			_ctx.stop = _input.LT(-1);
			setState(1305);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArgumentListItemContext(new Argument_listContext(_parentctx, _parentState));
					((ArgumentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_argument_list);
					setState(1300);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1301); 
					match(COMMA);
					setState(1302); 
					((ArgumentListItemContext)_localctx).item = argument();
					}
					} 
				}
				setState(1307);
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
		public TerminalNode MUTABLE() { return getToken(SParser.MUTABLE, 0); }
		public OperatorArgumentContext(ArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterOperatorArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitOperatorArgument(this);
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterCodeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitCodeArgument(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_argument);
		int _la;
		try {
			setState(1313);
			switch (_input.LA(1)) {
			case CODE:
				_localctx = new CodeArgumentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1308); 
				((CodeArgumentContext)_localctx).arg = code_argument();
				}
				break;
			case MUTABLE:
			case VARIABLE_IDENTIFIER:
				_localctx = new OperatorArgumentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1310);
				_la = _input.LA(1);
				if (_la==MUTABLE) {
					{
					setState(1309); 
					match(MUTABLE);
					}
				}

				setState(1312); 
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
		public Operator_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_argument; }
	 
		public Operator_argumentContext() { }
		public void copyFrom(Operator_argumentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NamedArgumentContext extends Operator_argumentContext {
		public Named_argumentContext arg;
		public Named_argumentContext named_argument() {
			return getRuleContext(Named_argumentContext.class,0);
		}
		public NamedArgumentContext(Operator_argumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterNamedArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitNamedArgument(this);
		}
	}
	public static class TypedArgumentContext extends Operator_argumentContext {
		public Typed_argumentContext arg;
		public Typed_argumentContext typed_argument() {
			return getRuleContext(Typed_argumentContext.class,0);
		}
		public TypedArgumentContext(Operator_argumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterTypedArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitTypedArgument(this);
		}
	}

	public final Operator_argumentContext operator_argument() throws RecognitionException {
		Operator_argumentContext _localctx = new Operator_argumentContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_operator_argument);
		try {
			setState(1317);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				_localctx = new NamedArgumentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1315); 
				((NamedArgumentContext)_localctx).arg = named_argument();
				}
				break;
			case 2:
				_localctx = new TypedArgumentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1316); 
				((TypedArgumentContext)_localctx).arg = typed_argument();
				}
				break;
			}
		}
		catch (RecognitionException re) {
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
		public Variable_identifierContext name;
		public Literal_expressionContext value;
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SParser.EQ, 0); }
		public Literal_expressionContext literal_expression() {
			return getRuleContext(Literal_expressionContext.class,0);
		}
		public Named_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_named_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterNamed_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitNamed_argument(this);
		}
	}

	public final Named_argumentContext named_argument() throws RecognitionException {
		Named_argumentContext _localctx = new Named_argumentContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_named_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1319); 
			((Named_argumentContext)_localctx).name = variable_identifier();
			setState(1322);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(1320); 
				match(EQ);
				setState(1321); 
				((Named_argumentContext)_localctx).value = literal_expression();
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterCode_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitCode_argument(this);
		}
	}

	public final Code_argumentContext code_argument() throws RecognitionException {
		Code_argumentContext _localctx = new Code_argumentContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_code_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1324); 
			code_type();
			setState(1325); 
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
		public Category_or_any_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_category_or_any_type; }
	 
		public Category_or_any_typeContext() { }
		public void copyFrom(Category_or_any_typeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AnyArgumentTypeContext extends Category_or_any_typeContext {
		public Any_typeContext typ;
		public Any_typeContext any_type() {
			return getRuleContext(Any_typeContext.class,0);
		}
		public AnyArgumentTypeContext(Category_or_any_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterAnyArgumentType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitAnyArgumentType(this);
		}
	}
	public static class CategoryArgumentTypeContext extends Category_or_any_typeContext {
		public TypedefContext typ;
		public TypedefContext typedef() {
			return getRuleContext(TypedefContext.class,0);
		}
		public CategoryArgumentTypeContext(Category_or_any_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterCategoryArgumentType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitCategoryArgumentType(this);
		}
	}

	public final Category_or_any_typeContext category_or_any_type() throws RecognitionException {
		Category_or_any_typeContext _localctx = new Category_or_any_typeContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_category_or_any_type);
		try {
			setState(1329);
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
			case TYPE_IDENTIFIER:
				_localctx = new CategoryArgumentTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1327); 
				((CategoryArgumentTypeContext)_localctx).typ = typedef(0);
				}
				break;
			case ANY:
				_localctx = new AnyArgumentTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1328); 
				((AnyArgumentTypeContext)_localctx).typ = any_type(0);
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
	public static class AnyTypeContext extends Any_typeContext {
		public TerminalNode ANY() { return getToken(SParser.ANY, 0); }
		public AnyTypeContext(Any_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterAnyType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitAnyType(this);
		}
	}
	public static class AnyListTypeContext extends Any_typeContext {
		public Any_typeContext typ;
		public TerminalNode LBRAK() { return getToken(SParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(SParser.RBRAK, 0); }
		public Any_typeContext any_type() {
			return getRuleContext(Any_typeContext.class,0);
		}
		public AnyListTypeContext(Any_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterAnyListType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitAnyListType(this);
		}
	}
	public static class AnyDictTypeContext extends Any_typeContext {
		public Any_typeContext typ;
		public TerminalNode LCURL() { return getToken(SParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(SParser.RCURL, 0); }
		public Any_typeContext any_type() {
			return getRuleContext(Any_typeContext.class,0);
		}
		public AnyDictTypeContext(Any_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterAnyDictType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitAnyDictType(this);
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
		int _startState = 186;
		enterRecursionRule(_localctx, 186, RULE_any_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AnyTypeContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1332); 
			match(ANY);
			}
			_ctx.stop = _input.LT(-1);
			setState(1342);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1340);
					switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
					case 1:
						{
						_localctx = new AnyListTypeContext(new Any_typeContext(_parentctx, _parentState));
						((AnyListTypeContext)_localctx).typ = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_any_type);
						setState(1334);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1335); 
						match(LBRAK);
						setState(1336); 
						match(RBRAK);
						}
						break;
					case 2:
						{
						_localctx = new AnyDictTypeContext(new Any_typeContext(_parentctx, _parentState));
						((AnyDictTypeContext)_localctx).typ = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_any_type);
						setState(1337);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1338); 
						match(LCURL);
						setState(1339); 
						match(RCURL);
						}
						break;
					}
					} 
				}
				setState(1344);
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

	public static class Member_method_declaration_listContext extends ParserRuleContext {
		public Member_method_declaration_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_method_declaration_list; }
	 
		public Member_method_declaration_listContext() { }
		public void copyFrom(Member_method_declaration_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CategoryMethodListContext extends Member_method_declaration_listContext {
		public Member_method_declarationContext item;
		public Member_method_declarationContext member_method_declaration() {
			return getRuleContext(Member_method_declarationContext.class,0);
		}
		public CategoryMethodListContext(Member_method_declaration_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterCategoryMethodList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitCategoryMethodList(this);
		}
	}
	public static class CategoryMethodListItemContext extends Member_method_declaration_listContext {
		public Member_method_declaration_listContext items;
		public Member_method_declarationContext item;
		public LfpContext lfp() {
			return getRuleContext(LfpContext.class,0);
		}
		public Member_method_declaration_listContext member_method_declaration_list() {
			return getRuleContext(Member_method_declaration_listContext.class,0);
		}
		public Member_method_declarationContext member_method_declaration() {
			return getRuleContext(Member_method_declarationContext.class,0);
		}
		public CategoryMethodListItemContext(Member_method_declaration_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterCategoryMethodListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitCategoryMethodListItem(this);
		}
	}

	public final Member_method_declaration_listContext member_method_declaration_list() throws RecognitionException {
		return member_method_declaration_list(0);
	}

	private Member_method_declaration_listContext member_method_declaration_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Member_method_declaration_listContext _localctx = new Member_method_declaration_listContext(_ctx, _parentState);
		Member_method_declaration_listContext _prevctx = _localctx;
		int _startState = 188;
		enterRecursionRule(_localctx, 188, RULE_member_method_declaration_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new CategoryMethodListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1346); 
			((CategoryMethodListContext)_localctx).item = member_method_declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(1354);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CategoryMethodListItemContext(new Member_method_declaration_listContext(_parentctx, _parentState));
					((CategoryMethodListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_member_method_declaration_list);
					setState(1348);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1349); 
					lfp();
					setState(1350); 
					((CategoryMethodListItemContext)_localctx).item = member_method_declaration();
					}
					} 
				}
				setState(1356);
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterMember_method_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitMember_method_declaration(this);
		}
	}

	public final Member_method_declarationContext member_method_declaration() throws RecognitionException {
		Member_method_declarationContext _localctx = new Member_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_member_method_declaration);
		try {
			setState(1362);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1357); 
				setter_method_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1358); 
				getter_method_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1359); 
				concrete_method_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1360); 
				abstract_method_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1361); 
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
		public Native_member_method_declaration_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_native_member_method_declaration_list; }
	 
		public Native_member_method_declaration_listContext() { }
		public void copyFrom(Native_member_method_declaration_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NativeCategoryMethodListContext extends Native_member_method_declaration_listContext {
		public Native_member_method_declarationContext item;
		public Native_member_method_declarationContext native_member_method_declaration() {
			return getRuleContext(Native_member_method_declarationContext.class,0);
		}
		public NativeCategoryMethodListContext(Native_member_method_declaration_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterNativeCategoryMethodList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitNativeCategoryMethodList(this);
		}
	}
	public static class NativeCategoryMethodListItemContext extends Native_member_method_declaration_listContext {
		public Native_member_method_declaration_listContext items;
		public Native_member_method_declarationContext item;
		public LfpContext lfp() {
			return getRuleContext(LfpContext.class,0);
		}
		public Native_member_method_declaration_listContext native_member_method_declaration_list() {
			return getRuleContext(Native_member_method_declaration_listContext.class,0);
		}
		public Native_member_method_declarationContext native_member_method_declaration() {
			return getRuleContext(Native_member_method_declarationContext.class,0);
		}
		public NativeCategoryMethodListItemContext(Native_member_method_declaration_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterNativeCategoryMethodListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitNativeCategoryMethodListItem(this);
		}
	}

	public final Native_member_method_declaration_listContext native_member_method_declaration_list() throws RecognitionException {
		return native_member_method_declaration_list(0);
	}

	private Native_member_method_declaration_listContext native_member_method_declaration_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Native_member_method_declaration_listContext _localctx = new Native_member_method_declaration_listContext(_ctx, _parentState);
		Native_member_method_declaration_listContext _prevctx = _localctx;
		int _startState = 192;
		enterRecursionRule(_localctx, 192, RULE_native_member_method_declaration_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new NativeCategoryMethodListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1365); 
			((NativeCategoryMethodListContext)_localctx).item = native_member_method_declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(1373);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NativeCategoryMethodListItemContext(new Native_member_method_declaration_listContext(_parentctx, _parentState));
					((NativeCategoryMethodListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_native_member_method_declaration_list);
					setState(1367);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1368); 
					lfp();
					setState(1369); 
					((NativeCategoryMethodListItemContext)_localctx).item = native_member_method_declaration();
					}
					} 
				}
				setState(1375);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
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

	public static class Native_member_method_declarationContext extends ParserRuleContext {
		public Member_method_declarationContext member_method_declaration() {
			return getRuleContext(Member_method_declarationContext.class,0);
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterNative_member_method_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitNative_member_method_declaration(this);
		}
	}

	public final Native_member_method_declarationContext native_member_method_declaration() throws RecognitionException {
		Native_member_method_declarationContext _localctx = new Native_member_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_native_member_method_declaration);
		try {
			setState(1378);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1376); 
				member_method_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1377); 
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
		public TerminalNode PYTHON2() { return getToken(SParser.PYTHON2, 0); }
		public Python_category_bindingContext python_category_binding() {
			return getRuleContext(Python_category_bindingContext.class,0);
		}
		public Python2CategoryBindingContext(Native_category_bindingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterPython2CategoryBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitPython2CategoryBinding(this);
		}
	}
	public static class CSharpCategoryBindingContext extends Native_category_bindingContext {
		public Csharp_identifier_expressionContext binding;
		public TerminalNode CSHARP() { return getToken(SParser.CSHARP, 0); }
		public Csharp_identifier_expressionContext csharp_identifier_expression() {
			return getRuleContext(Csharp_identifier_expressionContext.class,0);
		}
		public CSharpCategoryBindingContext(Native_category_bindingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterCSharpCategoryBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitCSharpCategoryBinding(this);
		}
	}
	public static class JavaScriptCategoryBindingContext extends Native_category_bindingContext {
		public Javascript_category_bindingContext binding;
		public TerminalNode JAVASCRIPT() { return getToken(SParser.JAVASCRIPT, 0); }
		public Javascript_category_bindingContext javascript_category_binding() {
			return getRuleContext(Javascript_category_bindingContext.class,0);
		}
		public JavaScriptCategoryBindingContext(Native_category_bindingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterJavaScriptCategoryBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitJavaScriptCategoryBinding(this);
		}
	}
	public static class JavaCategoryBindingContext extends Native_category_bindingContext {
		public Java_class_identifier_expressionContext binding;
		public TerminalNode JAVA() { return getToken(SParser.JAVA, 0); }
		public Java_class_identifier_expressionContext java_class_identifier_expression() {
			return getRuleContext(Java_class_identifier_expressionContext.class,0);
		}
		public JavaCategoryBindingContext(Native_category_bindingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterJavaCategoryBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitJavaCategoryBinding(this);
		}
	}
	public static class Python3CategoryBindingContext extends Native_category_bindingContext {
		public Python_category_bindingContext binding;
		public TerminalNode PYTHON3() { return getToken(SParser.PYTHON3, 0); }
		public Python_category_bindingContext python_category_binding() {
			return getRuleContext(Python_category_bindingContext.class,0);
		}
		public Python3CategoryBindingContext(Native_category_bindingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterPython3CategoryBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitPython3CategoryBinding(this);
		}
	}

	public final Native_category_bindingContext native_category_binding() throws RecognitionException {
		Native_category_bindingContext _localctx = new Native_category_bindingContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_native_category_binding);
		try {
			setState(1390);
			switch (_input.LA(1)) {
			case JAVA:
				_localctx = new JavaCategoryBindingContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1380); 
				match(JAVA);
				setState(1381); 
				((JavaCategoryBindingContext)_localctx).binding = java_class_identifier_expression(0);
				}
				break;
			case CSHARP:
				_localctx = new CSharpCategoryBindingContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1382); 
				match(CSHARP);
				setState(1383); 
				((CSharpCategoryBindingContext)_localctx).binding = csharp_identifier_expression(0);
				}
				break;
			case PYTHON2:
				_localctx = new Python2CategoryBindingContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1384); 
				match(PYTHON2);
				setState(1385); 
				((Python2CategoryBindingContext)_localctx).binding = python_category_binding();
				}
				break;
			case PYTHON3:
				_localctx = new Python3CategoryBindingContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1386); 
				match(PYTHON3);
				setState(1387); 
				((Python3CategoryBindingContext)_localctx).binding = python_category_binding();
				}
				break;
			case JAVASCRIPT:
				_localctx = new JavaScriptCategoryBindingContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1388); 
				match(JAVASCRIPT);
				setState(1389); 
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
		public IdentifierContext id_;
		public Python_moduleContext module;
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterPython_category_binding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitPython_category_binding(this);
		}
	}

	public final Python_category_bindingContext python_category_binding() throws RecognitionException {
		Python_category_bindingContext _localctx = new Python_category_bindingContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_python_category_binding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1392); 
			((Python_category_bindingContext)_localctx).id_ = identifier();
			setState(1394);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(1393); 
				((Python_category_bindingContext)_localctx).module = python_module();
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
		public TerminalNode FROM() { return getToken(SParser.FROM, 0); }
		public Module_tokenContext module_token() {
			return getRuleContext(Module_tokenContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SParser.COLON, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(SParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SParser.DOT, i);
		}
		public Python_moduleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_python_module; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterPython_module(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitPython_module(this);
		}
	}

	public final Python_moduleContext python_module() throws RecognitionException {
		Python_moduleContext _localctx = new Python_moduleContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_python_module);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1396); 
			match(FROM);
			setState(1397); 
			module_token();
			setState(1398); 
			match(COLON);
			setState(1399); 
			identifier();
			setState(1404);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1400); 
					match(DOT);
					setState(1401); 
					identifier();
					}
					} 
				}
				setState(1406);
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
			exitRule();
		}
		return _localctx;
	}

	public static class Module_tokenContext extends ParserRuleContext {
		public Token i1;
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(SParser.VARIABLE_IDENTIFIER, 0); }
		public Module_tokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterModule_token(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitModule_token(this);
		}
	}

	public final Module_tokenContext module_token() throws RecognitionException {
		Module_tokenContext _localctx = new Module_tokenContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_module_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1407); 
			((Module_tokenContext)_localctx).i1 = match(VARIABLE_IDENTIFIER);
			setState(1408);
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

	public static class Javascript_category_bindingContext extends ParserRuleContext {
		public IdentifierContext id_;
		public Javascript_moduleContext module;
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterJavascript_category_binding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitJavascript_category_binding(this);
		}
	}

	public final Javascript_category_bindingContext javascript_category_binding() throws RecognitionException {
		Javascript_category_bindingContext _localctx = new Javascript_category_bindingContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_javascript_category_binding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1410); 
			((Javascript_category_bindingContext)_localctx).id_ = identifier();
			setState(1412);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(1411); 
				((Javascript_category_bindingContext)_localctx).module = javascript_module();
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
		public TerminalNode FROM() { return getToken(SParser.FROM, 0); }
		public Module_tokenContext module_token() {
			return getRuleContext(Module_tokenContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SParser.COLON, 0); }
		public List<Javascript_identifierContext> javascript_identifier() {
			return getRuleContexts(Javascript_identifierContext.class);
		}
		public Javascript_identifierContext javascript_identifier(int i) {
			return getRuleContext(Javascript_identifierContext.class,i);
		}
		public List<TerminalNode> SLASH() { return getTokens(SParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(SParser.SLASH, i);
		}
		public TerminalNode DOT() { return getToken(SParser.DOT, 0); }
		public Javascript_moduleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javascript_module; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterJavascript_module(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitJavascript_module(this);
		}
	}

	public final Javascript_moduleContext javascript_module() throws RecognitionException {
		Javascript_moduleContext _localctx = new Javascript_moduleContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_javascript_module);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1414); 
			match(FROM);
			setState(1415); 
			module_token();
			setState(1416); 
			match(COLON);
			setState(1418);
			_la = _input.LA(1);
			if (_la==SLASH) {
				{
				setState(1417); 
				match(SLASH);
				}
			}

			setState(1420); 
			javascript_identifier();
			setState(1425);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1421); 
					match(SLASH);
					setState(1422); 
					javascript_identifier();
					}
					} 
				}
				setState(1427);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
			}
			setState(1430);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(1428); 
				match(DOT);
				setState(1429); 
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
		public Variable_identifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_identifier_list; }
	 
		public Variable_identifier_listContext() { }
		public void copyFrom(Variable_identifier_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariableListContext extends Variable_identifier_listContext {
		public Variable_identifierContext item;
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public VariableListContext(Variable_identifier_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterVariableList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitVariableList(this);
		}
	}
	public static class VariableListItemContext extends Variable_identifier_listContext {
		public Variable_identifier_listContext items;
		public Variable_identifierContext item;
		public TerminalNode COMMA() { return getToken(SParser.COMMA, 0); }
		public Variable_identifier_listContext variable_identifier_list() {
			return getRuleContext(Variable_identifier_listContext.class,0);
		}
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public VariableListItemContext(Variable_identifier_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterVariableListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitVariableListItem(this);
		}
	}

	public final Variable_identifier_listContext variable_identifier_list() throws RecognitionException {
		return variable_identifier_list(0);
	}

	private Variable_identifier_listContext variable_identifier_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Variable_identifier_listContext _localctx = new Variable_identifier_listContext(_ctx, _parentState);
		Variable_identifier_listContext _prevctx = _localctx;
		int _startState = 208;
		enterRecursionRule(_localctx, 208, RULE_variable_identifier_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new VariableListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1433); 
			((VariableListContext)_localctx).item = variable_identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(1440);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VariableListItemContext(new Variable_identifier_listContext(_parentctx, _parentState));
					((VariableListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_variable_identifier_list);
					setState(1435);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1436); 
					match(COMMA);
					setState(1437); 
					((VariableListItemContext)_localctx).item = variable_identifier();
					}
					} 
				}
				setState(1442);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Method_declarationContext extends ParserRuleContext {
		public Method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_declaration; }
	 
		public Method_declarationContext() { }
		public void copyFrom(Method_declarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConcreteMethodContext extends Method_declarationContext {
		public Concrete_method_declarationContext decl;
		public Concrete_method_declarationContext concrete_method_declaration() {
			return getRuleContext(Concrete_method_declarationContext.class,0);
		}
		public ConcreteMethodContext(Method_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterConcreteMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitConcreteMethod(this);
		}
	}
	public static class TestMethodContext extends Method_declarationContext {
		public Test_method_declarationContext decl;
		public Test_method_declarationContext test_method_declaration() {
			return getRuleContext(Test_method_declarationContext.class,0);
		}
		public TestMethodContext(Method_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterTestMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitTestMethod(this);
		}
	}
	public static class AbstractMethodContext extends Method_declarationContext {
		public Abstract_method_declarationContext decl;
		public Abstract_method_declarationContext abstract_method_declaration() {
			return getRuleContext(Abstract_method_declarationContext.class,0);
		}
		public AbstractMethodContext(Method_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterAbstractMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitAbstractMethod(this);
		}
	}
	public static class NativeMethodContext extends Method_declarationContext {
		public Native_method_declarationContext decl;
		public Native_method_declarationContext native_method_declaration() {
			return getRuleContext(Native_method_declarationContext.class,0);
		}
		public NativeMethodContext(Method_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterNativeMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitNativeMethod(this);
		}
	}

	public final Method_declarationContext method_declaration() throws RecognitionException {
		Method_declarationContext _localctx = new Method_declarationContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_method_declaration);
		try {
			setState(1447);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				_localctx = new AbstractMethodContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1443); 
				((AbstractMethodContext)_localctx).decl = abstract_method_declaration();
				}
				break;
			case 2:
				_localctx = new ConcreteMethodContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1444); 
				((ConcreteMethodContext)_localctx).decl = concrete_method_declaration();
				}
				break;
			case 3:
				_localctx = new NativeMethodContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1445); 
				((NativeMethodContext)_localctx).decl = native_method_declaration();
				}
				break;
			case 4:
				_localctx = new TestMethodContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1446); 
				((TestMethodContext)_localctx).decl = test_method_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
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
		public Native_statement_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_native_statement_list; }
	 
		public Native_statement_listContext() { }
		public void copyFrom(Native_statement_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NativeStatementListContext extends Native_statement_listContext {
		public Native_statementContext item;
		public Native_statementContext native_statement() {
			return getRuleContext(Native_statementContext.class,0);
		}
		public NativeStatementListContext(Native_statement_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterNativeStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitNativeStatementList(this);
		}
	}
	public static class NativeStatementListItemContext extends Native_statement_listContext {
		public Native_statement_listContext items;
		public Native_statementContext item;
		public LfpContext lfp() {
			return getRuleContext(LfpContext.class,0);
		}
		public Native_statement_listContext native_statement_list() {
			return getRuleContext(Native_statement_listContext.class,0);
		}
		public Native_statementContext native_statement() {
			return getRuleContext(Native_statementContext.class,0);
		}
		public NativeStatementListItemContext(Native_statement_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterNativeStatementListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitNativeStatementListItem(this);
		}
	}

	public final Native_statement_listContext native_statement_list() throws RecognitionException {
		return native_statement_list(0);
	}

	private Native_statement_listContext native_statement_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Native_statement_listContext _localctx = new Native_statement_listContext(_ctx, _parentState);
		Native_statement_listContext _prevctx = _localctx;
		int _startState = 212;
		enterRecursionRule(_localctx, 212, RULE_native_statement_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new NativeStatementListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1450); 
			((NativeStatementListContext)_localctx).item = native_statement();
			}
			_ctx.stop = _input.LT(-1);
			setState(1458);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NativeStatementListItemContext(new Native_statement_listContext(_parentctx, _parentState));
					((NativeStatementListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_native_statement_list);
					setState(1452);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1453); 
					lfp();
					setState(1454); 
					((NativeStatementListItemContext)_localctx).item = native_statement();
					}
					} 
				}
				setState(1460);
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
			unrollRecursionContexts(_parentctx);
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
	public static class Python2NativeStatementContext extends Native_statementContext {
		public Python_native_statementContext stmt;
		public TerminalNode PYTHON2() { return getToken(SParser.PYTHON2, 0); }
		public Python_native_statementContext python_native_statement() {
			return getRuleContext(Python_native_statementContext.class,0);
		}
		public Python2NativeStatementContext(Native_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterPython2NativeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitPython2NativeStatement(this);
		}
	}
	public static class CSharpNativeStatementContext extends Native_statementContext {
		public Csharp_statementContext stmt;
		public TerminalNode CSHARP() { return getToken(SParser.CSHARP, 0); }
		public Csharp_statementContext csharp_statement() {
			return getRuleContext(Csharp_statementContext.class,0);
		}
		public CSharpNativeStatementContext(Native_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterCSharpNativeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitCSharpNativeStatement(this);
		}
	}
	public static class JavaNativeStatementContext extends Native_statementContext {
		public Java_statementContext stmt;
		public TerminalNode JAVA() { return getToken(SParser.JAVA, 0); }
		public Java_statementContext java_statement() {
			return getRuleContext(Java_statementContext.class,0);
		}
		public JavaNativeStatementContext(Native_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterJavaNativeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitJavaNativeStatement(this);
		}
	}
	public static class JavaScriptNativeStatementContext extends Native_statementContext {
		public Javascript_native_statementContext stmt;
		public TerminalNode JAVASCRIPT() { return getToken(SParser.JAVASCRIPT, 0); }
		public Javascript_native_statementContext javascript_native_statement() {
			return getRuleContext(Javascript_native_statementContext.class,0);
		}
		public JavaScriptNativeStatementContext(Native_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterJavaScriptNativeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitJavaScriptNativeStatement(this);
		}
	}
	public static class Python3NativeStatementContext extends Native_statementContext {
		public Python_native_statementContext stmt;
		public TerminalNode PYTHON3() { return getToken(SParser.PYTHON3, 0); }
		public Python_native_statementContext python_native_statement() {
			return getRuleContext(Python_native_statementContext.class,0);
		}
		public Python3NativeStatementContext(Native_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterPython3NativeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitPython3NativeStatement(this);
		}
	}

	public final Native_statementContext native_statement() throws RecognitionException {
		Native_statementContext _localctx = new Native_statementContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_native_statement);
		try {
			setState(1471);
			switch (_input.LA(1)) {
			case JAVA:
				_localctx = new JavaNativeStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1461); 
				match(JAVA);
				setState(1462); 
				((JavaNativeStatementContext)_localctx).stmt = java_statement();
				}
				break;
			case CSHARP:
				_localctx = new CSharpNativeStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1463); 
				match(CSHARP);
				setState(1464); 
				((CSharpNativeStatementContext)_localctx).stmt = csharp_statement();
				}
				break;
			case PYTHON2:
				_localctx = new Python2NativeStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1465); 
				match(PYTHON2);
				setState(1466); 
				((Python2NativeStatementContext)_localctx).stmt = python_native_statement();
				}
				break;
			case PYTHON3:
				_localctx = new Python3NativeStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1467); 
				match(PYTHON3);
				setState(1468); 
				((Python3NativeStatementContext)_localctx).stmt = python_native_statement();
				}
				break;
			case JAVASCRIPT:
				_localctx = new JavaScriptNativeStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1469); 
				match(JAVASCRIPT);
				setState(1470); 
				((JavaScriptNativeStatementContext)_localctx).stmt = javascript_native_statement();
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
		public Python_statementContext stmt;
		public Python_moduleContext module;
		public Python_statementContext python_statement() {
			return getRuleContext(Python_statementContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SParser.SEMI, 0); }
		public Python_moduleContext python_module() {
			return getRuleContext(Python_moduleContext.class,0);
		}
		public Python_native_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_python_native_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterPython_native_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitPython_native_statement(this);
		}
	}

	public final Python_native_statementContext python_native_statement() throws RecognitionException {
		Python_native_statementContext _localctx = new Python_native_statementContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_python_native_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1473); 
			((Python_native_statementContext)_localctx).stmt = python_statement();
			setState(1475);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				{
				setState(1474); 
				match(SEMI);
				}
				break;
			}
			setState(1478);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				{
				setState(1477); 
				((Python_native_statementContext)_localctx).module = python_module();
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

	public static class Javascript_native_statementContext extends ParserRuleContext {
		public Javascript_statementContext stmt;
		public Javascript_moduleContext module;
		public Javascript_statementContext javascript_statement() {
			return getRuleContext(Javascript_statementContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SParser.SEMI, 0); }
		public Javascript_moduleContext javascript_module() {
			return getRuleContext(Javascript_moduleContext.class,0);
		}
		public Javascript_native_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javascript_native_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterJavascript_native_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitJavascript_native_statement(this);
		}
	}

	public final Javascript_native_statementContext javascript_native_statement() throws RecognitionException {
		Javascript_native_statementContext _localctx = new Javascript_native_statementContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_javascript_native_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1480); 
			((Javascript_native_statementContext)_localctx).stmt = javascript_statement();
			setState(1482);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(1481); 
				match(SEMI);
				}
				break;
			}
			setState(1485);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(1484); 
				((Javascript_native_statementContext)_localctx).module = javascript_module();
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

	public static class Statement_listContext extends ParserRuleContext {
		public Statement_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_list; }
	 
		public Statement_listContext() { }
		public void copyFrom(Statement_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StatementListItemContext extends Statement_listContext {
		public Statement_listContext items;
		public StatementContext item;
		public LfpContext lfp() {
			return getRuleContext(LfpContext.class,0);
		}
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementListItemContext(Statement_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterStatementListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitStatementListItem(this);
		}
	}
	public static class StatementListContext extends Statement_listContext {
		public StatementContext item;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementListContext(Statement_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitStatementList(this);
		}
	}

	public final Statement_listContext statement_list() throws RecognitionException {
		return statement_list(0);
	}

	private Statement_listContext statement_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Statement_listContext _localctx = new Statement_listContext(_ctx, _parentState);
		Statement_listContext _prevctx = _localctx;
		int _startState = 220;
		enterRecursionRule(_localctx, 220, RULE_statement_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new StatementListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1488); 
			((StatementListContext)_localctx).item = statement();
			}
			_ctx.stop = _input.LT(-1);
			setState(1496);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StatementListItemContext(new Statement_listContext(_parentctx, _parentState));
					((StatementListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_statement_list);
					setState(1490);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1491); 
					lfp();
					setState(1492); 
					((StatementListItemContext)_localctx).item = statement();
					}
					} 
				}
				setState(1498);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Assertion_listContext extends ParserRuleContext {
		public Assertion_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertion_list; }
	 
		public Assertion_listContext() { }
		public void copyFrom(Assertion_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssertionListItemContext extends Assertion_listContext {
		public Assertion_listContext items;
		public AssertionContext item;
		public LfpContext lfp() {
			return getRuleContext(LfpContext.class,0);
		}
		public Assertion_listContext assertion_list() {
			return getRuleContext(Assertion_listContext.class,0);
		}
		public AssertionContext assertion() {
			return getRuleContext(AssertionContext.class,0);
		}
		public AssertionListItemContext(Assertion_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterAssertionListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitAssertionListItem(this);
		}
	}
	public static class AssertionListContext extends Assertion_listContext {
		public AssertionContext item;
		public AssertionContext assertion() {
			return getRuleContext(AssertionContext.class,0);
		}
		public AssertionListContext(Assertion_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterAssertionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitAssertionList(this);
		}
	}

	public final Assertion_listContext assertion_list() throws RecognitionException {
		return assertion_list(0);
	}

	private Assertion_listContext assertion_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Assertion_listContext _localctx = new Assertion_listContext(_ctx, _parentState);
		Assertion_listContext _prevctx = _localctx;
		int _startState = 222;
		enterRecursionRule(_localctx, 222, RULE_assertion_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AssertionListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1500); 
			((AssertionListContext)_localctx).item = assertion();
			}
			_ctx.stop = _input.LT(-1);
			setState(1508);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AssertionListItemContext(new Assertion_listContext(_parentctx, _parentState));
					((AssertionListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_assertion_list);
					setState(1502);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1503); 
					lfp();
					setState(1504); 
					((AssertionListItemContext)_localctx).item = assertion();
					}
					} 
				}
				setState(1510);
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

	public static class Switch_case_statement_listContext extends ParserRuleContext {
		public Switch_case_statement_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_case_statement_list; }
	 
		public Switch_case_statement_listContext() { }
		public void copyFrom(Switch_case_statement_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SwitchCaseStatementListItemContext extends Switch_case_statement_listContext {
		public Switch_case_statement_listContext items;
		public Switch_case_statementContext item;
		public LfpContext lfp() {
			return getRuleContext(LfpContext.class,0);
		}
		public Switch_case_statement_listContext switch_case_statement_list() {
			return getRuleContext(Switch_case_statement_listContext.class,0);
		}
		public Switch_case_statementContext switch_case_statement() {
			return getRuleContext(Switch_case_statementContext.class,0);
		}
		public SwitchCaseStatementListItemContext(Switch_case_statement_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterSwitchCaseStatementListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitSwitchCaseStatementListItem(this);
		}
	}
	public static class SwitchCaseStatementListContext extends Switch_case_statement_listContext {
		public Switch_case_statementContext item;
		public Switch_case_statementContext switch_case_statement() {
			return getRuleContext(Switch_case_statementContext.class,0);
		}
		public SwitchCaseStatementListContext(Switch_case_statement_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterSwitchCaseStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitSwitchCaseStatementList(this);
		}
	}

	public final Switch_case_statement_listContext switch_case_statement_list() throws RecognitionException {
		return switch_case_statement_list(0);
	}

	private Switch_case_statement_listContext switch_case_statement_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Switch_case_statement_listContext _localctx = new Switch_case_statement_listContext(_ctx, _parentState);
		Switch_case_statement_listContext _prevctx = _localctx;
		int _startState = 224;
		enterRecursionRule(_localctx, 224, RULE_switch_case_statement_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SwitchCaseStatementListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1512); 
			((SwitchCaseStatementListContext)_localctx).item = switch_case_statement();
			}
			_ctx.stop = _input.LT(-1);
			setState(1520);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SwitchCaseStatementListItemContext(new Switch_case_statement_listContext(_parentctx, _parentState));
					((SwitchCaseStatementListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_switch_case_statement_list);
					setState(1514);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1515); 
					lfp();
					setState(1516); 
					((SwitchCaseStatementListItemContext)_localctx).item = switch_case_statement();
					}
					} 
				}
				setState(1522);
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

	public static class Catch_statement_listContext extends ParserRuleContext {
		public Catch_statement_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catch_statement_list; }
	 
		public Catch_statement_listContext() { }
		public void copyFrom(Catch_statement_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CatchStatementListContext extends Catch_statement_listContext {
		public Catch_statementContext item;
		public Catch_statementContext catch_statement() {
			return getRuleContext(Catch_statementContext.class,0);
		}
		public CatchStatementListContext(Catch_statement_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterCatchStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitCatchStatementList(this);
		}
	}
	public static class CatchStatementListItemContext extends Catch_statement_listContext {
		public Catch_statement_listContext items;
		public Catch_statementContext item;
		public LfpContext lfp() {
			return getRuleContext(LfpContext.class,0);
		}
		public Catch_statement_listContext catch_statement_list() {
			return getRuleContext(Catch_statement_listContext.class,0);
		}
		public Catch_statementContext catch_statement() {
			return getRuleContext(Catch_statementContext.class,0);
		}
		public CatchStatementListItemContext(Catch_statement_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterCatchStatementListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitCatchStatementListItem(this);
		}
	}

	public final Catch_statement_listContext catch_statement_list() throws RecognitionException {
		return catch_statement_list(0);
	}

	private Catch_statement_listContext catch_statement_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Catch_statement_listContext _localctx = new Catch_statement_listContext(_ctx, _parentState);
		Catch_statement_listContext _prevctx = _localctx;
		int _startState = 226;
		enterRecursionRule(_localctx, 226, RULE_catch_statement_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new CatchStatementListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1524); 
			((CatchStatementListContext)_localctx).item = catch_statement();
			}
			_ctx.stop = _input.LT(-1);
			setState(1532);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CatchStatementListItemContext(new Catch_statement_listContext(_parentctx, _parentState));
					((CatchStatementListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_catch_statement_list);
					setState(1526);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1527); 
					lfp();
					setState(1528); 
					((CatchStatementListItemContext)_localctx).item = catch_statement();
					}
					} 
				}
				setState(1534);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
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
	public static class LiteralSetLiteralContext extends Literal_collectionContext {
		public Literal_list_literalContext exp;
		public TerminalNode LT() { return getToken(SParser.LT, 0); }
		public TerminalNode GT() { return getToken(SParser.GT, 0); }
		public Literal_list_literalContext literal_list_literal() {
			return getRuleContext(Literal_list_literalContext.class,0);
		}
		public LiteralSetLiteralContext(Literal_collectionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterLiteralSetLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitLiteralSetLiteral(this);
		}
	}
	public static class LiteralListLiteralContext extends Literal_collectionContext {
		public Literal_list_literalContext exp;
		public TerminalNode LBRAK() { return getToken(SParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(SParser.RBRAK, 0); }
		public Literal_list_literalContext literal_list_literal() {
			return getRuleContext(Literal_list_literalContext.class,0);
		}
		public LiteralListLiteralContext(Literal_collectionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterLiteralListLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitLiteralListLiteral(this);
		}
	}
	public static class LiteralRangeLiteralContext extends Literal_collectionContext {
		public Atomic_literalContext low;
		public Atomic_literalContext high;
		public TerminalNode LBRAK() { return getToken(SParser.LBRAK, 0); }
		public TerminalNode RANGE() { return getToken(SParser.RANGE, 0); }
		public TerminalNode RBRAK() { return getToken(SParser.RBRAK, 0); }
		public List<Atomic_literalContext> atomic_literal() {
			return getRuleContexts(Atomic_literalContext.class);
		}
		public Atomic_literalContext atomic_literal(int i) {
			return getRuleContext(Atomic_literalContext.class,i);
		}
		public LiteralRangeLiteralContext(Literal_collectionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterLiteralRangeLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitLiteralRangeLiteral(this);
		}
	}

	public final Literal_collectionContext literal_collection() throws RecognitionException {
		Literal_collectionContext _localctx = new Literal_collectionContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_literal_collection);
		try {
			setState(1549);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				_localctx = new LiteralRangeLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1535); 
				match(LBRAK);
				setState(1536); 
				((LiteralRangeLiteralContext)_localctx).low = atomic_literal();
				setState(1537); 
				match(RANGE);
				setState(1538); 
				((LiteralRangeLiteralContext)_localctx).high = atomic_literal();
				setState(1539); 
				match(RBRAK);
				}
				break;
			case 2:
				_localctx = new LiteralListLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1541); 
				match(LBRAK);
				setState(1542); 
				((LiteralListLiteralContext)_localctx).exp = literal_list_literal(0);
				setState(1543); 
				match(RBRAK);
				}
				break;
			case 3:
				_localctx = new LiteralSetLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1545); 
				match(LT);
				setState(1546); 
				((LiteralSetLiteralContext)_localctx).exp = literal_list_literal(0);
				setState(1547); 
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
	public static class PeriodLiteralContext extends Atomic_literalContext {
		public Token t;
		public TerminalNode PERIOD_LITERAL() { return getToken(SParser.PERIOD_LITERAL, 0); }
		public PeriodLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterPeriodLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitPeriodLiteral(this);
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitNullLiteral(this);
		}
	}
	public static class TextLiteralContext extends Atomic_literalContext {
		public Token t;
		public TerminalNode TEXT_LITERAL() { return getToken(SParser.TEXT_LITERAL, 0); }
		public TextLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterTextLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitTextLiteral(this);
		}
	}
	public static class HexadecimalLiteralContext extends Atomic_literalContext {
		public Token t;
		public TerminalNode HEXA_LITERAL() { return getToken(SParser.HEXA_LITERAL, 0); }
		public HexadecimalLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterHexadecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitHexadecimalLiteral(this);
		}
	}
	public static class CharacterLiteralContext extends Atomic_literalContext {
		public Token t;
		public TerminalNode CHAR_LITERAL() { return getToken(SParser.CHAR_LITERAL, 0); }
		public CharacterLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterCharacterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitCharacterLiteral(this);
		}
	}
	public static class DateLiteralContext extends Atomic_literalContext {
		public Token t;
		public TerminalNode DATE_LITERAL() { return getToken(SParser.DATE_LITERAL, 0); }
		public DateLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterDateLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitDateLiteral(this);
		}
	}
	public static class TimeLiteralContext extends Atomic_literalContext {
		public Token t;
		public TerminalNode TIME_LITERAL() { return getToken(SParser.TIME_LITERAL, 0); }
		public TimeLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterTimeLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitTimeLiteral(this);
		}
	}
	public static class MaxIntegerLiteralContext extends Atomic_literalContext {
		public Token t;
		public TerminalNode MAX_INTEGER() { return getToken(SParser.MAX_INTEGER, 0); }
		public MaxIntegerLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterMaxIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitMaxIntegerLiteral(this);
		}
	}
	public static class IntegerLiteralContext extends Atomic_literalContext {
		public Token t;
		public TerminalNode INTEGER_LITERAL() { return getToken(SParser.INTEGER_LITERAL, 0); }
		public IntegerLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitIntegerLiteral(this);
		}
	}
	public static class DecimalLiteralContext extends Atomic_literalContext {
		public Token t;
		public TerminalNode DECIMAL_LITERAL() { return getToken(SParser.DECIMAL_LITERAL, 0); }
		public DecimalLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitDecimalLiteral(this);
		}
	}
	public static class MinIntegerLiteralContext extends Atomic_literalContext {
		public Token t;
		public TerminalNode MIN_INTEGER() { return getToken(SParser.MIN_INTEGER, 0); }
		public MinIntegerLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterMinIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitMinIntegerLiteral(this);
		}
	}
	public static class DateTimeLiteralContext extends Atomic_literalContext {
		public Token t;
		public TerminalNode DATETIME_LITERAL() { return getToken(SParser.DATETIME_LITERAL, 0); }
		public DateTimeLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterDateTimeLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitDateTimeLiteral(this);
		}
	}
	public static class BooleanLiteralContext extends Atomic_literalContext {
		public Token t;
		public TerminalNode BOOLEAN_LITERAL() { return getToken(SParser.BOOLEAN_LITERAL, 0); }
		public BooleanLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitBooleanLiteral(this);
		}
	}

	public final Atomic_literalContext atomic_literal() throws RecognitionException {
		Atomic_literalContext _localctx = new Atomic_literalContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_atomic_literal);
		try {
			setState(1564);
			switch (_input.LA(1)) {
			case MIN_INTEGER:
				_localctx = new MinIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1551); 
				((MinIntegerLiteralContext)_localctx).t = match(MIN_INTEGER);
				}
				break;
			case MAX_INTEGER:
				_localctx = new MaxIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1552); 
				((MaxIntegerLiteralContext)_localctx).t = match(MAX_INTEGER);
				}
				break;
			case INTEGER_LITERAL:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1553); 
				((IntegerLiteralContext)_localctx).t = match(INTEGER_LITERAL);
				}
				break;
			case HEXA_LITERAL:
				_localctx = new HexadecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1554); 
				((HexadecimalLiteralContext)_localctx).t = match(HEXA_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new CharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1555); 
				((CharacterLiteralContext)_localctx).t = match(CHAR_LITERAL);
				}
				break;
			case DATE_LITERAL:
				_localctx = new DateLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1556); 
				((DateLiteralContext)_localctx).t = match(DATE_LITERAL);
				}
				break;
			case TIME_LITERAL:
				_localctx = new TimeLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1557); 
				((TimeLiteralContext)_localctx).t = match(TIME_LITERAL);
				}
				break;
			case TEXT_LITERAL:
				_localctx = new TextLiteralContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1558); 
				((TextLiteralContext)_localctx).t = match(TEXT_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1559); 
				((DecimalLiteralContext)_localctx).t = match(DECIMAL_LITERAL);
				}
				break;
			case DATETIME_LITERAL:
				_localctx = new DateTimeLiteralContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1560); 
				((DateTimeLiteralContext)_localctx).t = match(DATETIME_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(1561); 
				((BooleanLiteralContext)_localctx).t = match(BOOLEAN_LITERAL);
				}
				break;
			case PERIOD_LITERAL:
				_localctx = new PeriodLiteralContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(1562); 
				((PeriodLiteralContext)_localctx).t = match(PERIOD_LITERAL);
				}
				break;
			case NONE:
				_localctx = new NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(1563); 
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
		public Literal_list_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_list_literal; }
	 
		public Literal_list_literalContext() { }
		public void copyFrom(Literal_list_literalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LiteralListContext extends Literal_list_literalContext {
		public Atomic_literalContext item;
		public Atomic_literalContext atomic_literal() {
			return getRuleContext(Atomic_literalContext.class,0);
		}
		public LiteralListContext(Literal_list_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterLiteralList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitLiteralList(this);
		}
	}
	public static class LiteralListItemContext extends Literal_list_literalContext {
		public Literal_list_literalContext items;
		public Atomic_literalContext item;
		public TerminalNode COMMA() { return getToken(SParser.COMMA, 0); }
		public Literal_list_literalContext literal_list_literal() {
			return getRuleContext(Literal_list_literalContext.class,0);
		}
		public Atomic_literalContext atomic_literal() {
			return getRuleContext(Atomic_literalContext.class,0);
		}
		public LiteralListItemContext(Literal_list_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterLiteralListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitLiteralListItem(this);
		}
	}

	public final Literal_list_literalContext literal_list_literal() throws RecognitionException {
		return literal_list_literal(0);
	}

	private Literal_list_literalContext literal_list_literal(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Literal_list_literalContext _localctx = new Literal_list_literalContext(_ctx, _parentState);
		Literal_list_literalContext _prevctx = _localctx;
		int _startState = 232;
		enterRecursionRule(_localctx, 232, RULE_literal_list_literal, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new LiteralListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1567); 
			((LiteralListContext)_localctx).item = atomic_literal();
			}
			_ctx.stop = _input.LT(-1);
			setState(1574);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LiteralListItemContext(new Literal_list_literalContext(_parentctx, _parentState));
					((LiteralListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_literal_list_literal);
					setState(1569);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1570); 
					match(COMMA);
					setState(1571); 
					((LiteralListItemContext)_localctx).item = atomic_literal();
					}
					} 
				}
				setState(1576);
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
			unrollRecursionContexts(_parentctx);
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
	public static class IdentifierExpressionContext extends Selectable_expressionContext {
		public IdentifierContext exp;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdentifierExpressionContext(Selectable_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitIdentifierExpression(this);
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterParenthesisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitParenthesisExpression(this);
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitLiteralExpression(this);
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterThisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitThisExpression(this);
		}
	}

	public final Selectable_expressionContext selectable_expression() throws RecognitionException {
		Selectable_expressionContext _localctx = new Selectable_expressionContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_selectable_expression);
		try {
			setState(1581);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				_localctx = new ParenthesisExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1577); 
				((ParenthesisExpressionContext)_localctx).exp = parenthesis_expression();
				}
				break;
			case 2:
				_localctx = new LiteralExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1578); 
				((LiteralExpressionContext)_localctx).exp = literal_expression();
				}
				break;
			case 3:
				_localctx = new IdentifierExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1579); 
				((IdentifierExpressionContext)_localctx).exp = identifier();
				}
				break;
			case 4:
				_localctx = new ThisExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1580); 
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
		public TerminalNode SELF() { return getToken(SParser.SELF, 0); }
		public TerminalNode THIS() { return getToken(SParser.THIS, 0); }
		public This_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_this_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterThis_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitThis_expression(this);
		}
	}

	public final This_expressionContext this_expression() throws RecognitionException {
		This_expressionContext _localctx = new This_expressionContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_this_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1583);
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
		public ExpressionContext exp;
		public TerminalNode LPAR() { return getToken(SParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SParser.RPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Parenthesis_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesis_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterParenthesis_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitParenthesis_expression(this);
		}
	}

	public final Parenthesis_expressionContext parenthesis_expression() throws RecognitionException {
		Parenthesis_expressionContext _localctx = new Parenthesis_expressionContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_parenthesis_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1585); 
			match(LPAR);
			setState(1586); 
			((Parenthesis_expressionContext)_localctx).exp = expression(0);
			setState(1587); 
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
		public Literal_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_expression; }
	 
		public Literal_expressionContext() { }
		public void copyFrom(Literal_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CollectionLiteralContext extends Literal_expressionContext {
		public Collection_literalContext exp;
		public Collection_literalContext collection_literal() {
			return getRuleContext(Collection_literalContext.class,0);
		}
		public CollectionLiteralContext(Literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterCollectionLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitCollectionLiteral(this);
		}
	}
	public static class AtomicLiteralContext extends Literal_expressionContext {
		public Atomic_literalContext exp;
		public Atomic_literalContext atomic_literal() {
			return getRuleContext(Atomic_literalContext.class,0);
		}
		public AtomicLiteralContext(Literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterAtomicLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitAtomicLiteral(this);
		}
	}

	public final Literal_expressionContext literal_expression() throws RecognitionException {
		Literal_expressionContext _localctx = new Literal_expressionContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_literal_expression);
		try {
			setState(1591);
			switch (_input.LA(1)) {
			case NONE:
			case BOOLEAN_LITERAL:
			case CHAR_LITERAL:
			case MIN_INTEGER:
			case MAX_INTEGER:
			case TEXT_LITERAL:
			case INTEGER_LITERAL:
			case HEXA_LITERAL:
			case DECIMAL_LITERAL:
			case DATETIME_LITERAL:
			case TIME_LITERAL:
			case DATE_LITERAL:
			case PERIOD_LITERAL:
				_localctx = new AtomicLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1589); 
				((AtomicLiteralContext)_localctx).exp = atomic_literal();
				}
				break;
			case LPAR:
			case LBRAK:
			case LCURL:
			case LT:
				_localctx = new CollectionLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1590); 
				((CollectionLiteralContext)_localctx).exp = collection_literal();
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
		public Collection_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collection_literal; }
	 
		public Collection_literalContext() { }
		public void copyFrom(Collection_literalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TupleLiteralContext extends Collection_literalContext {
		public Tuple_literalContext exp;
		public Tuple_literalContext tuple_literal() {
			return getRuleContext(Tuple_literalContext.class,0);
		}
		public TupleLiteralContext(Collection_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterTupleLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitTupleLiteral(this);
		}
	}
	public static class ListLiteralContext extends Collection_literalContext {
		public List_literalContext exp;
		public List_literalContext list_literal() {
			return getRuleContext(List_literalContext.class,0);
		}
		public ListLiteralContext(Collection_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterListLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitListLiteral(this);
		}
	}
	public static class DictLiteralContext extends Collection_literalContext {
		public Dict_literalContext exp;
		public Dict_literalContext dict_literal() {
			return getRuleContext(Dict_literalContext.class,0);
		}
		public DictLiteralContext(Collection_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterDictLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitDictLiteral(this);
		}
	}
	public static class RangeLiteralContext extends Collection_literalContext {
		public Range_literalContext exp;
		public Range_literalContext range_literal() {
			return getRuleContext(Range_literalContext.class,0);
		}
		public RangeLiteralContext(Collection_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterRangeLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitRangeLiteral(this);
		}
	}
	public static class SetLiteralContext extends Collection_literalContext {
		public Set_literalContext exp;
		public Set_literalContext set_literal() {
			return getRuleContext(Set_literalContext.class,0);
		}
		public SetLiteralContext(Collection_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterSetLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitSetLiteral(this);
		}
	}

	public final Collection_literalContext collection_literal() throws RecognitionException {
		Collection_literalContext _localctx = new Collection_literalContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_collection_literal);
		try {
			setState(1598);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				_localctx = new RangeLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1593); 
				((RangeLiteralContext)_localctx).exp = range_literal();
				}
				break;
			case 2:
				_localctx = new ListLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1594); 
				((ListLiteralContext)_localctx).exp = list_literal();
				}
				break;
			case 3:
				_localctx = new SetLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1595); 
				((SetLiteralContext)_localctx).exp = set_literal();
				}
				break;
			case 4:
				_localctx = new DictLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1596); 
				((DictLiteralContext)_localctx).exp = dict_literal();
				}
				break;
			case 5:
				_localctx = new TupleLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1597); 
				((TupleLiteralContext)_localctx).exp = tuple_literal();
				}
				break;
			}
		}
		catch (RecognitionException re) {
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
		public Expression_tupleContext items;
		public TerminalNode LPAR() { return getToken(SParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SParser.RPAR, 0); }
		public Expression_tupleContext expression_tuple() {
			return getRuleContext(Expression_tupleContext.class,0);
		}
		public Tuple_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterTuple_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitTuple_literal(this);
		}
	}

	public final Tuple_literalContext tuple_literal() throws RecognitionException {
		Tuple_literalContext _localctx = new Tuple_literalContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_tuple_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1600); 
			match(LPAR);
			setState(1602);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << CODE) | (1L << DOCUMENT))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (EXECUTE - 87)) | (1L << (FETCH - 87)) | (1L << (MUTABLE - 87)) | (1L << (NONE - 87)) | (1L << (NOT - 87)) | (1L << (READ - 87)) | (1L << (SELF - 87)) | (1L << (SORTED - 87)) | (1L << (THIS - 87)) | (1L << (BOOLEAN_LITERAL - 87)) | (1L << (CHAR_LITERAL - 87)) | (1L << (MIN_INTEGER - 87)) | (1L << (MAX_INTEGER - 87)) | (1L << (SYMBOL_IDENTIFIER - 87)) | (1L << (TYPE_IDENTIFIER - 87)) | (1L << (VARIABLE_IDENTIFIER - 87)) | (1L << (TEXT_LITERAL - 87)) | (1L << (INTEGER_LITERAL - 87)) | (1L << (HEXA_LITERAL - 87)) | (1L << (DECIMAL_LITERAL - 87)) | (1L << (DATETIME_LITERAL - 87)) | (1L << (TIME_LITERAL - 87)))) != 0) || _la==DATE_LITERAL || _la==PERIOD_LITERAL) {
				{
				setState(1601); 
				((Tuple_literalContext)_localctx).items = expression_tuple(0);
				}
			}

			setState(1604); 
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
		public Dict_entry_listContext items;
		public TerminalNode LCURL() { return getToken(SParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(SParser.RCURL, 0); }
		public Dict_entry_listContext dict_entry_list() {
			return getRuleContext(Dict_entry_listContext.class,0);
		}
		public Dict_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dict_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterDict_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitDict_literal(this);
		}
	}

	public final Dict_literalContext dict_literal() throws RecognitionException {
		Dict_literalContext _localctx = new Dict_literalContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_dict_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1606); 
			match(LCURL);
			setState(1608);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << CODE) | (1L << DOCUMENT))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (EXECUTE - 87)) | (1L << (FETCH - 87)) | (1L << (MUTABLE - 87)) | (1L << (NONE - 87)) | (1L << (NOT - 87)) | (1L << (READ - 87)) | (1L << (SELF - 87)) | (1L << (SORTED - 87)) | (1L << (THIS - 87)) | (1L << (BOOLEAN_LITERAL - 87)) | (1L << (CHAR_LITERAL - 87)) | (1L << (MIN_INTEGER - 87)) | (1L << (MAX_INTEGER - 87)) | (1L << (SYMBOL_IDENTIFIER - 87)) | (1L << (TYPE_IDENTIFIER - 87)) | (1L << (VARIABLE_IDENTIFIER - 87)) | (1L << (TEXT_LITERAL - 87)) | (1L << (INTEGER_LITERAL - 87)) | (1L << (HEXA_LITERAL - 87)) | (1L << (DECIMAL_LITERAL - 87)) | (1L << (DATETIME_LITERAL - 87)) | (1L << (TIME_LITERAL - 87)))) != 0) || _la==DATE_LITERAL || _la==PERIOD_LITERAL) {
				{
				setState(1607); 
				((Dict_literalContext)_localctx).items = dict_entry_list(0);
				}
			}

			setState(1610); 
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
		public Expression_tupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_tuple; }
	 
		public Expression_tupleContext() { }
		public void copyFrom(Expression_tupleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValueTupleItemContext extends Expression_tupleContext {
		public Expression_tupleContext items;
		public ExpressionContext item;
		public TerminalNode COMMA() { return getToken(SParser.COMMA, 0); }
		public Expression_tupleContext expression_tuple() {
			return getRuleContext(Expression_tupleContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ValueTupleItemContext(Expression_tupleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterValueTupleItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitValueTupleItem(this);
		}
	}
	public static class ValueTupleContext extends Expression_tupleContext {
		public ExpressionContext item;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ValueTupleContext(Expression_tupleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterValueTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitValueTuple(this);
		}
	}

	public final Expression_tupleContext expression_tuple() throws RecognitionException {
		return expression_tuple(0);
	}

	private Expression_tupleContext expression_tuple(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expression_tupleContext _localctx = new Expression_tupleContext(_ctx, _parentState);
		Expression_tupleContext _prevctx = _localctx;
		int _startState = 248;
		enterRecursionRule(_localctx, 248, RULE_expression_tuple, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ValueTupleContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1613); 
			((ValueTupleContext)_localctx).item = expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1620);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ValueTupleItemContext(new Expression_tupleContext(_parentctx, _parentState));
					((ValueTupleItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_expression_tuple);
					setState(1615);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1616); 
					match(COMMA);
					setState(1617); 
					((ValueTupleItemContext)_localctx).item = expression(0);
					}
					} 
				}
				setState(1622);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Dict_entry_listContext extends ParserRuleContext {
		public Dict_entry_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dict_entry_list; }
	 
		public Dict_entry_listContext() { }
		public void copyFrom(Dict_entry_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DictEntryListContext extends Dict_entry_listContext {
		public Dict_entryContext item;
		public Dict_entryContext dict_entry() {
			return getRuleContext(Dict_entryContext.class,0);
		}
		public DictEntryListContext(Dict_entry_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterDictEntryList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitDictEntryList(this);
		}
	}
	public static class DictEntryListItemContext extends Dict_entry_listContext {
		public Dict_entry_listContext items;
		public Dict_entryContext item;
		public TerminalNode COMMA() { return getToken(SParser.COMMA, 0); }
		public Dict_entry_listContext dict_entry_list() {
			return getRuleContext(Dict_entry_listContext.class,0);
		}
		public Dict_entryContext dict_entry() {
			return getRuleContext(Dict_entryContext.class,0);
		}
		public DictEntryListItemContext(Dict_entry_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterDictEntryListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitDictEntryListItem(this);
		}
	}

	public final Dict_entry_listContext dict_entry_list() throws RecognitionException {
		return dict_entry_list(0);
	}

	private Dict_entry_listContext dict_entry_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Dict_entry_listContext _localctx = new Dict_entry_listContext(_ctx, _parentState);
		Dict_entry_listContext _prevctx = _localctx;
		int _startState = 250;
		enterRecursionRule(_localctx, 250, RULE_dict_entry_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new DictEntryListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1624); 
			((DictEntryListContext)_localctx).item = dict_entry();
			}
			_ctx.stop = _input.LT(-1);
			setState(1631);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DictEntryListItemContext(new Dict_entry_listContext(_parentctx, _parentState));
					((DictEntryListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_dict_entry_list);
					setState(1626);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1627); 
					match(COMMA);
					setState(1628); 
					((DictEntryListItemContext)_localctx).item = dict_entry();
					}
					} 
				}
				setState(1633);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
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

	public static class Dict_entryContext extends ParserRuleContext {
		public ExpressionContext key;
		public ExpressionContext value;
		public TerminalNode COLON() { return getToken(SParser.COLON, 0); }
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterDict_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitDict_entry(this);
		}
	}

	public final Dict_entryContext dict_entry() throws RecognitionException {
		Dict_entryContext _localctx = new Dict_entryContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_dict_entry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1634); 
			((Dict_entryContext)_localctx).key = expression(0);
			setState(1635); 
			match(COLON);
			setState(1636); 
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
		public TerminalNode COLON() { return getToken(SParser.COLON, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SliceFirstAndLastContext(Slice_argumentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterSliceFirstAndLast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitSliceFirstAndLast(this);
		}
	}
	public static class SliceFirstOnlyContext extends Slice_argumentsContext {
		public ExpressionContext first;
		public TerminalNode COLON() { return getToken(SParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SliceFirstOnlyContext(Slice_argumentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterSliceFirstOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitSliceFirstOnly(this);
		}
	}
	public static class SliceLastOnlyContext extends Slice_argumentsContext {
		public ExpressionContext last;
		public TerminalNode COLON() { return getToken(SParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SliceLastOnlyContext(Slice_argumentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterSliceLastOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitSliceLastOnly(this);
		}
	}

	public final Slice_argumentsContext slice_arguments() throws RecognitionException {
		Slice_argumentsContext _localctx = new Slice_argumentsContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_slice_arguments);
		try {
			setState(1647);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				_localctx = new SliceFirstAndLastContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1638); 
				((SliceFirstAndLastContext)_localctx).first = expression(0);
				setState(1639); 
				match(COLON);
				setState(1640); 
				((SliceFirstAndLastContext)_localctx).last = expression(0);
				}
				break;
			case 2:
				_localctx = new SliceFirstOnlyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1642); 
				((SliceFirstOnlyContext)_localctx).first = expression(0);
				setState(1643); 
				match(COLON);
				}
				break;
			case 3:
				_localctx = new SliceLastOnlyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1645); 
				match(COLON);
				setState(1646); 
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
		public Assign_variable_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_variable_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterAssign_variable_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitAssign_variable_statement(this);
		}
	}

	public final Assign_variable_statementContext assign_variable_statement() throws RecognitionException {
		Assign_variable_statementContext _localctx = new Assign_variable_statementContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_assign_variable_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1649); 
			((Assign_variable_statementContext)_localctx).name = variable_identifier();
			setState(1650); 
			assign();
			setState(1651); 
			((Assign_variable_statementContext)_localctx).exp = expression(0);
			}
		}
		catch (RecognitionException re) {
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
	public static class RootInstanceContext extends Assignable_instanceContext {
		public Variable_identifierContext name;
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public RootInstanceContext(Assignable_instanceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterRootInstance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitRootInstance(this);
		}
	}
	public static class ChildInstanceContext extends Assignable_instanceContext {
		public Assignable_instanceContext parent;
		public Child_instanceContext child;
		public Assignable_instanceContext assignable_instance() {
			return getRuleContext(Assignable_instanceContext.class,0);
		}
		public Child_instanceContext child_instance() {
			return getRuleContext(Child_instanceContext.class,0);
		}
		public ChildInstanceContext(Assignable_instanceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterChildInstance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitChildInstance(this);
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
		int _startState = 258;
		enterRecursionRule(_localctx, 258, RULE_assignable_instance, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new RootInstanceContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1654); 
			((RootInstanceContext)_localctx).name = variable_identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(1660);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ChildInstanceContext(new Assignable_instanceContext(_parentctx, _parentState));
					((ChildInstanceContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_assignable_instance);
					setState(1656);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1657); 
					((ChildInstanceContext)_localctx).child = child_instance();
					}
					} 
				}
				setState(1662);
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
		public Category_or_any_typeContext typ;
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(SParser.VARIABLE_IDENTIFIER, 0); }
		public Category_or_any_typeContext category_or_any_type() {
			return getRuleContext(Category_or_any_typeContext.class,0);
		}
		public IsATypeExpressionContext(Is_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterIsATypeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitIsATypeExpression(this);
		}
	}
	public static class IsOtherExpressionContext extends Is_expressionContext {
		public ExpressionContext exp;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IsOtherExpressionContext(Is_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterIsOtherExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitIsOtherExpression(this);
		}
	}

	public final Is_expressionContext is_expression() throws RecognitionException {
		Is_expressionContext _localctx = new Is_expressionContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_is_expression);
		try {
			setState(1667);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				_localctx = new IsATypeExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1663);
				if (!(this.willBeAOrAn())) throw new FailedPredicateException(this, "$parser.willBeAOrAn()");
				setState(1664); 
				match(VARIABLE_IDENTIFIER);
				setState(1665); 
				((IsATypeExpressionContext)_localctx).typ = category_or_any_type();
				}
				break;
			case 2:
				_localctx = new IsOtherExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1666); 
				((IsOtherExpressionContext)_localctx).exp = expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode PLUS() { return getToken(SParser.PLUS, 0); }
		public OperatorPlusContext(OperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterOperatorPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitOperatorPlus(this);
		}
	}
	public static class OperatorModuloContext extends OperatorContext {
		public ModuloContext modulo() {
			return getRuleContext(ModuloContext.class,0);
		}
		public OperatorModuloContext(OperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterOperatorModulo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitOperatorModulo(this);
		}
	}
	public static class OperatorIDivideContext extends OperatorContext {
		public IdivideContext idivide() {
			return getRuleContext(IdivideContext.class,0);
		}
		public OperatorIDivideContext(OperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterOperatorIDivide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitOperatorIDivide(this);
		}
	}
	public static class OperatorMultiplyContext extends OperatorContext {
		public MultiplyContext multiply() {
			return getRuleContext(MultiplyContext.class,0);
		}
		public OperatorMultiplyContext(OperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterOperatorMultiply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitOperatorMultiply(this);
		}
	}
	public static class OperatorDivideContext extends OperatorContext {
		public DivideContext divide() {
			return getRuleContext(DivideContext.class,0);
		}
		public OperatorDivideContext(OperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterOperatorDivide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitOperatorDivide(this);
		}
	}
	public static class OperatorMinusContext extends OperatorContext {
		public TerminalNode MINUS() { return getToken(SParser.MINUS, 0); }
		public OperatorMinusContext(OperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterOperatorMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitOperatorMinus(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_operator);
		try {
			setState(1675);
			switch (_input.LA(1)) {
			case PLUS:
				_localctx = new OperatorPlusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1669); 
				match(PLUS);
				}
				break;
			case MINUS:
				_localctx = new OperatorMinusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1670); 
				match(MINUS);
				}
				break;
			case STAR:
				_localctx = new OperatorMultiplyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1671); 
				multiply();
				}
				break;
			case SLASH:
				_localctx = new OperatorDivideContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1672); 
				divide();
				}
				break;
			case BSLASH:
				_localctx = new OperatorIDivideContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1673); 
				idivide();
				}
				break;
			case PERCENT:
			case MODULO:
				_localctx = new OperatorModuloContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1674); 
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

	public static class Key_tokenContext extends ParserRuleContext {
		public Token i1;
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(SParser.VARIABLE_IDENTIFIER, 0); }
		public Key_tokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterKey_token(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitKey_token(this);
		}
	}

	public final Key_tokenContext key_token() throws RecognitionException {
		Key_tokenContext _localctx = new Key_tokenContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_key_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1677); 
			((Key_tokenContext)_localctx).i1 = match(VARIABLE_IDENTIFIER);
			setState(1678);
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

	public static class Value_tokenContext extends ParserRuleContext {
		public Token i1;
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(SParser.VARIABLE_IDENTIFIER, 0); }
		public Value_tokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterValue_token(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitValue_token(this);
		}
	}

	public final Value_tokenContext value_token() throws RecognitionException {
		Value_tokenContext _localctx = new Value_tokenContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_value_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1680); 
			((Value_tokenContext)_localctx).i1 = match(VARIABLE_IDENTIFIER);
			setState(1681);
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
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(SParser.VARIABLE_IDENTIFIER, 0); }
		public Symbols_tokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbols_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterSymbols_token(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitSymbols_token(this);
		}
	}

	public final Symbols_tokenContext symbols_token() throws RecognitionException {
		Symbols_tokenContext _localctx = new Symbols_tokenContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_symbols_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1683); 
			((Symbols_tokenContext)_localctx).i1 = match(VARIABLE_IDENTIFIER);
			setState(1684);
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
		public TerminalNode EQ() { return getToken(SParser.EQ, 0); }
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1686); 
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
		public TerminalNode STAR() { return getToken(SParser.STAR, 0); }
		public MultiplyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiply; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterMultiply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitMultiply(this);
		}
	}

	public final MultiplyContext multiply() throws RecognitionException {
		MultiplyContext _localctx = new MultiplyContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_multiply);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1688); 
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
		public TerminalNode SLASH() { return getToken(SParser.SLASH, 0); }
		public DivideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divide; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterDivide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitDivide(this);
		}
	}

	public final DivideContext divide() throws RecognitionException {
		DivideContext _localctx = new DivideContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_divide);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1690); 
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
		public TerminalNode BSLASH() { return getToken(SParser.BSLASH, 0); }
		public IdivideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idivide; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterIdivide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitIdivide(this);
		}
	}

	public final IdivideContext idivide() throws RecognitionException {
		IdivideContext _localctx = new IdivideContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_idivide);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1692); 
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
		public TerminalNode PERCENT() { return getToken(SParser.PERCENT, 0); }
		public TerminalNode MODULO() { return getToken(SParser.MODULO, 0); }
		public ModuloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modulo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterModulo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitModulo(this);
		}
	}

	public final ModuloContext modulo() throws RecognitionException {
		ModuloContext _localctx = new ModuloContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_modulo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1694);
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
	public static class JavascriptReturnStatementContext extends Javascript_statementContext {
		public Javascript_expressionContext exp;
		public TerminalNode RETURN() { return getToken(SParser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(SParser.SEMI, 0); }
		public Javascript_expressionContext javascript_expression() {
			return getRuleContext(Javascript_expressionContext.class,0);
		}
		public JavascriptReturnStatementContext(Javascript_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterJavascriptReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitJavascriptReturnStatement(this);
		}
	}
	public static class JavascriptStatementContext extends Javascript_statementContext {
		public Javascript_expressionContext exp;
		public TerminalNode SEMI() { return getToken(SParser.SEMI, 0); }
		public Javascript_expressionContext javascript_expression() {
			return getRuleContext(Javascript_expressionContext.class,0);
		}
		public JavascriptStatementContext(Javascript_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterJavascriptStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitJavascriptStatement(this);
		}
	}

	public final Javascript_statementContext javascript_statement() throws RecognitionException {
		Javascript_statementContext _localctx = new Javascript_statementContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_javascript_statement);
		try {
			setState(1703);
			switch (_input.LA(1)) {
			case RETURN:
				_localctx = new JavascriptReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1696); 
				match(RETURN);
				setState(1697); 
				((JavascriptReturnStatementContext)_localctx).exp = javascript_expression(0);
				setState(1698); 
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
				_localctx = new JavascriptStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1700); 
				((JavascriptStatementContext)_localctx).exp = javascript_expression(0);
				setState(1701); 
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
	public static class JavascriptPrimaryExpressionContext extends Javascript_expressionContext {
		public Javascript_primary_expressionContext exp;
		public Javascript_primary_expressionContext javascript_primary_expression() {
			return getRuleContext(Javascript_primary_expressionContext.class,0);
		}
		public JavascriptPrimaryExpressionContext(Javascript_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterJavascriptPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitJavascriptPrimaryExpression(this);
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterJavascriptSelectorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitJavascriptSelectorExpression(this);
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
		int _startState = 282;
		enterRecursionRule(_localctx, 282, RULE_javascript_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavascriptPrimaryExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1706); 
			((JavascriptPrimaryExpressionContext)_localctx).exp = javascript_primary_expression();
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
					{
					_localctx = new JavascriptSelectorExpressionContext(new Javascript_expressionContext(_parentctx, _parentState));
					((JavascriptSelectorExpressionContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_javascript_expression);
					setState(1708);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1709); 
					((JavascriptSelectorExpressionContext)_localctx).child = javascript_selector_expression();
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

	public static class Javascript_primary_expressionContext extends ParserRuleContext {
		public Javascript_primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javascript_primary_expression; }
	 
		public Javascript_primary_expressionContext() { }
		public void copyFrom(Javascript_primary_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class JavascriptParenthesisExpressionContext extends Javascript_primary_expressionContext {
		public Javascript_parenthesis_expressionContext exp;
		public Javascript_parenthesis_expressionContext javascript_parenthesis_expression() {
			return getRuleContext(Javascript_parenthesis_expressionContext.class,0);
		}
		public JavascriptParenthesisExpressionContext(Javascript_primary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterJavascriptParenthesisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitJavascriptParenthesisExpression(this);
		}
	}
	public static class JavascriptGlobalMethodExpressionContext extends Javascript_primary_expressionContext {
		public Javascript_method_expressionContext exp;
		public Javascript_method_expressionContext javascript_method_expression() {
			return getRuleContext(Javascript_method_expressionContext.class,0);
		}
		public JavascriptGlobalMethodExpressionContext(Javascript_primary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterJavascriptGlobalMethodExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitJavascriptGlobalMethodExpression(this);
		}
	}
	public static class JavascriptLiteralExpressionContext extends Javascript_primary_expressionContext {
		public Javascript_literal_expressionContext exp;
		public Javascript_literal_expressionContext javascript_literal_expression() {
			return getRuleContext(Javascript_literal_expressionContext.class,0);
		}
		public JavascriptLiteralExpressionContext(Javascript_primary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterJavascriptLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitJavascriptLiteralExpression(this);
		}
	}
	public static class JavascriptIdentifierExpressionContext extends Javascript_primary_expressionContext {
		public Javascript_identifier_expressionContext exp;
		public Javascript_identifier_expressionContext javascript_identifier_expression() {
			return getRuleContext(Javascript_identifier_expressionContext.class,0);
		}
		public JavascriptIdentifierExpressionContext(Javascript_primary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterJavascriptIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitJavascriptIdentifierExpression(this);
		}
	}

	public final Javascript_primary_expressionContext javascript_primary_expression() throws RecognitionException {
		Javascript_primary_expressionContext _localctx = new Javascript_primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_javascript_primary_expression);
		try {
			setState(1719);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				_localctx = new JavascriptParenthesisExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1715); 
				((JavascriptParenthesisExpressionContext)_localctx).exp = javascript_parenthesis_expression();
				}
				break;
			case 2:
				_localctx = new JavascriptIdentifierExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1716); 
				((JavascriptIdentifierExpressionContext)_localctx).exp = javascript_identifier_expression(0);
				}
				break;
			case 3:
				_localctx = new JavascriptLiteralExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1717); 
				((JavascriptLiteralExpressionContext)_localctx).exp = javascript_literal_expression();
				}
				break;
			case 4:
				_localctx = new JavascriptGlobalMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1718); 
				((JavascriptGlobalMethodExpressionContext)_localctx).exp = javascript_method_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
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
	public static class JavascriptMethodExpressionContext extends Javascript_selector_expressionContext {
		public Javascript_method_expressionContext exp;
		public TerminalNode DOT() { return getToken(SParser.DOT, 0); }
		public Javascript_method_expressionContext javascript_method_expression() {
			return getRuleContext(Javascript_method_expressionContext.class,0);
		}
		public JavascriptMethodExpressionContext(Javascript_selector_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterJavascriptMethodExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitJavascriptMethodExpression(this);
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterJavascriptItemExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitJavascriptItemExpression(this);
		}
	}

	public final Javascript_selector_expressionContext javascript_selector_expression() throws RecognitionException {
		Javascript_selector_expressionContext _localctx = new Javascript_selector_expressionContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_javascript_selector_expression);
		try {
			setState(1724);
			switch (_input.LA(1)) {
			case DOT:
				_localctx = new JavascriptMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1721); 
				match(DOT);
				setState(1722); 
				((JavascriptMethodExpressionContext)_localctx).exp = javascript_method_expression();
				}
				break;
			case LBRAK:
				_localctx = new JavascriptItemExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1723); 
				((JavascriptItemExpressionContext)_localctx).exp = javascript_item_expression();
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

	public static class Javascript_method_expressionContext extends ParserRuleContext {
		public Javascript_identifierContext name;
		public Javascript_argumentsContext args;
		public TerminalNode LPAR() { return getToken(SParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SParser.RPAR, 0); }
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterJavascript_method_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitJavascript_method_expression(this);
		}
	}

	public final Javascript_method_expressionContext javascript_method_expression() throws RecognitionException {
		Javascript_method_expressionContext _localctx = new Javascript_method_expressionContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_javascript_method_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1726); 
			((Javascript_method_expressionContext)_localctx).name = javascript_identifier();
			setState(1727); 
			match(LPAR);
			setState(1729);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD))) != 0) || ((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & ((1L << (READ - 116)) | (1L << (SELF - 116)) | (1L << (TEST - 116)) | (1L << (THIS - 116)) | (1L << (WRITE - 116)) | (1L << (BOOLEAN_LITERAL - 116)) | (1L << (CHAR_LITERAL - 116)) | (1L << (SYMBOL_IDENTIFIER - 116)) | (1L << (TYPE_IDENTIFIER - 116)) | (1L << (VARIABLE_IDENTIFIER - 116)) | (1L << (DOLLAR_IDENTIFIER - 116)) | (1L << (TEXT_LITERAL - 116)) | (1L << (INTEGER_LITERAL - 116)) | (1L << (DECIMAL_LITERAL - 116)))) != 0)) {
				{
				setState(1728); 
				((Javascript_method_expressionContext)_localctx).args = javascript_arguments(0);
				}
			}

			setState(1731); 
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
	public static class JavascriptArgumentListItemContext extends Javascript_argumentsContext {
		public Javascript_argumentsContext items;
		public Javascript_expressionContext item;
		public TerminalNode COMMA() { return getToken(SParser.COMMA, 0); }
		public Javascript_argumentsContext javascript_arguments() {
			return getRuleContext(Javascript_argumentsContext.class,0);
		}
		public Javascript_expressionContext javascript_expression() {
			return getRuleContext(Javascript_expressionContext.class,0);
		}
		public JavascriptArgumentListItemContext(Javascript_argumentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterJavascriptArgumentListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitJavascriptArgumentListItem(this);
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterJavascriptArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitJavascriptArgumentList(this);
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
		int _startState = 290;
		enterRecursionRule(_localctx, 290, RULE_javascript_arguments, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavascriptArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1734); 
			((JavascriptArgumentListContext)_localctx).item = javascript_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1741);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavascriptArgumentListItemContext(new Javascript_argumentsContext(_parentctx, _parentState));
					((JavascriptArgumentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_javascript_arguments);
					setState(1736);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1737); 
					match(COMMA);
					setState(1738); 
					((JavascriptArgumentListItemContext)_localctx).item = javascript_expression(0);
					}
					} 
				}
				setState(1743);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Javascript_item_expressionContext extends ParserRuleContext {
		public Javascript_expressionContext exp;
		public TerminalNode LBRAK() { return getToken(SParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(SParser.RBRAK, 0); }
		public Javascript_expressionContext javascript_expression() {
			return getRuleContext(Javascript_expressionContext.class,0);
		}
		public Javascript_item_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javascript_item_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterJavascript_item_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitJavascript_item_expression(this);
		}
	}

	public final Javascript_item_expressionContext javascript_item_expression() throws RecognitionException {
		Javascript_item_expressionContext _localctx = new Javascript_item_expressionContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_javascript_item_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1744); 
			match(LBRAK);
			setState(1745); 
			((Javascript_item_expressionContext)_localctx).exp = javascript_expression(0);
			setState(1746); 
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
		public TerminalNode LPAR() { return getToken(SParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SParser.RPAR, 0); }
		public Javascript_expressionContext javascript_expression() {
			return getRuleContext(Javascript_expressionContext.class,0);
		}
		public Javascript_parenthesis_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javascript_parenthesis_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterJavascript_parenthesis_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitJavascript_parenthesis_expression(this);
		}
	}

	public final Javascript_parenthesis_expressionContext javascript_parenthesis_expression() throws RecognitionException {
		Javascript_parenthesis_expressionContext _localctx = new Javascript_parenthesis_expressionContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_javascript_parenthesis_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1748); 
			match(LPAR);
			setState(1749); 
			((Javascript_parenthesis_expressionContext)_localctx).exp = javascript_expression(0);
			setState(1750); 
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
		public Javascript_identifier_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javascript_identifier_expression; }
	 
		public Javascript_identifier_expressionContext() { }
		public void copyFrom(Javascript_identifier_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class JavascriptIdentifierContext extends Javascript_identifier_expressionContext {
		public Javascript_identifierContext name;
		public Javascript_identifierContext javascript_identifier() {
			return getRuleContext(Javascript_identifierContext.class,0);
		}
		public JavascriptIdentifierContext(Javascript_identifier_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterJavascriptIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitJavascriptIdentifier(this);
		}
	}
	public static class JavascriptChildIdentifierContext extends Javascript_identifier_expressionContext {
		public Javascript_identifier_expressionContext parent;
		public Javascript_identifierContext name;
		public TerminalNode DOT() { return getToken(SParser.DOT, 0); }
		public Javascript_identifier_expressionContext javascript_identifier_expression() {
			return getRuleContext(Javascript_identifier_expressionContext.class,0);
		}
		public Javascript_identifierContext javascript_identifier() {
			return getRuleContext(Javascript_identifierContext.class,0);
		}
		public JavascriptChildIdentifierContext(Javascript_identifier_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterJavascriptChildIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitJavascriptChildIdentifier(this);
		}
	}

	public final Javascript_identifier_expressionContext javascript_identifier_expression() throws RecognitionException {
		return javascript_identifier_expression(0);
	}

	private Javascript_identifier_expressionContext javascript_identifier_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Javascript_identifier_expressionContext _localctx = new Javascript_identifier_expressionContext(_ctx, _parentState);
		Javascript_identifier_expressionContext _prevctx = _localctx;
		int _startState = 296;
		enterRecursionRule(_localctx, 296, RULE_javascript_identifier_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavascriptIdentifierContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1753); 
			((JavascriptIdentifierContext)_localctx).name = javascript_identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(1760);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavascriptChildIdentifierContext(new Javascript_identifier_expressionContext(_parentctx, _parentState));
					((JavascriptChildIdentifierContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_javascript_identifier_expression);
					setState(1755);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1756); 
					match(DOT);
					setState(1757); 
					((JavascriptChildIdentifierContext)_localctx).name = javascript_identifier();
					}
					} 
				}
				setState(1762);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
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
	public static class JavascriptDecimalLiteralContext extends Javascript_literal_expressionContext {
		public Token t;
		public TerminalNode DECIMAL_LITERAL() { return getToken(SParser.DECIMAL_LITERAL, 0); }
		public JavascriptDecimalLiteralContext(Javascript_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterJavascriptDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitJavascriptDecimalLiteral(this);
		}
	}
	public static class JavascriptCharacterLiteralContext extends Javascript_literal_expressionContext {
		public Token t;
		public TerminalNode CHAR_LITERAL() { return getToken(SParser.CHAR_LITERAL, 0); }
		public JavascriptCharacterLiteralContext(Javascript_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterJavascriptCharacterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitJavascriptCharacterLiteral(this);
		}
	}
	public static class JavascriptBooleanLiteralContext extends Javascript_literal_expressionContext {
		public Token t;
		public TerminalNode BOOLEAN_LITERAL() { return getToken(SParser.BOOLEAN_LITERAL, 0); }
		public JavascriptBooleanLiteralContext(Javascript_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterJavascriptBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitJavascriptBooleanLiteral(this);
		}
	}
	public static class JavascriptIntegerLiteralContext extends Javascript_literal_expressionContext {
		public Token t;
		public TerminalNode INTEGER_LITERAL() { return getToken(SParser.INTEGER_LITERAL, 0); }
		public JavascriptIntegerLiteralContext(Javascript_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterJavascriptIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitJavascriptIntegerLiteral(this);
		}
	}
	public static class JavascriptTextLiteralContext extends Javascript_literal_expressionContext {
		public Token t;
		public TerminalNode TEXT_LITERAL() { return getToken(SParser.TEXT_LITERAL, 0); }
		public JavascriptTextLiteralContext(Javascript_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterJavascriptTextLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitJavascriptTextLiteral(this);
		}
	}

	public final Javascript_literal_expressionContext javascript_literal_expression() throws RecognitionException {
		Javascript_literal_expressionContext _localctx = new Javascript_literal_expressionContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_javascript_literal_expression);
		try {
			setState(1768);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				_localctx = new JavascriptIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1763); 
				((JavascriptIntegerLiteralContext)_localctx).t = match(INTEGER_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				_localctx = new JavascriptDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1764); 
				((JavascriptDecimalLiteralContext)_localctx).t = match(DECIMAL_LITERAL);
				}
				break;
			case TEXT_LITERAL:
				_localctx = new JavascriptTextLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1765); 
				((JavascriptTextLiteralContext)_localctx).t = match(TEXT_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new JavascriptBooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1766); 
				((JavascriptBooleanLiteralContext)_localctx).t = match(BOOLEAN_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new JavascriptCharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1767); 
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
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(SParser.VARIABLE_IDENTIFIER, 0); }
		public TerminalNode SYMBOL_IDENTIFIER() { return getToken(SParser.SYMBOL_IDENTIFIER, 0); }
		public TerminalNode DOLLAR_IDENTIFIER() { return getToken(SParser.DOLLAR_IDENTIFIER, 0); }
		public TerminalNode TYPE_IDENTIFIER() { return getToken(SParser.TYPE_IDENTIFIER, 0); }
		public TerminalNode BOOLEAN() { return getToken(SParser.BOOLEAN, 0); }
		public TerminalNode CHARACTER() { return getToken(SParser.CHARACTER, 0); }
		public TerminalNode TEXT() { return getToken(SParser.TEXT, 0); }
		public TerminalNode INTEGER() { return getToken(SParser.INTEGER, 0); }
		public TerminalNode DECIMAL() { return getToken(SParser.DECIMAL, 0); }
		public TerminalNode DATE() { return getToken(SParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(SParser.TIME, 0); }
		public TerminalNode DATETIME() { return getToken(SParser.DATETIME, 0); }
		public TerminalNode PERIOD() { return getToken(SParser.PERIOD, 0); }
		public TerminalNode READ() { return getToken(SParser.READ, 0); }
		public TerminalNode WRITE() { return getToken(SParser.WRITE, 0); }
		public TerminalNode TEST() { return getToken(SParser.TEST, 0); }
		public TerminalNode SELF() { return getToken(SParser.SELF, 0); }
		public TerminalNode THIS() { return getToken(SParser.THIS, 0); }
		public Javascript_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javascript_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterJavascript_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitJavascript_identifier(this);
		}
	}

	public final Javascript_identifierContext javascript_identifier() throws RecognitionException {
		Javascript_identifierContext _localctx = new Javascript_identifierContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_javascript_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1770);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD))) != 0) || ((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & ((1L << (READ - 116)) | (1L << (SELF - 116)) | (1L << (TEST - 116)) | (1L << (THIS - 116)) | (1L << (WRITE - 116)) | (1L << (SYMBOL_IDENTIFIER - 116)) | (1L << (TYPE_IDENTIFIER - 116)) | (1L << (VARIABLE_IDENTIFIER - 116)) | (1L << (DOLLAR_IDENTIFIER - 116)))) != 0)) ) {
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
	public static class PythonReturnStatementContext extends Python_statementContext {
		public Python_expressionContext exp;
		public TerminalNode RETURN() { return getToken(SParser.RETURN, 0); }
		public Python_expressionContext python_expression() {
			return getRuleContext(Python_expressionContext.class,0);
		}
		public PythonReturnStatementContext(Python_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterPythonReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitPythonReturnStatement(this);
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterPythonStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitPythonStatement(this);
		}
	}

	public final Python_statementContext python_statement() throws RecognitionException {
		Python_statementContext _localctx = new Python_statementContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_python_statement);
		try {
			setState(1775);
			switch (_input.LA(1)) {
			case RETURN:
				_localctx = new PythonReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1772); 
				match(RETURN);
				setState(1773); 
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
				setState(1774); 
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
	public static class PythonPrimaryExpressionContext extends Python_expressionContext {
		public Python_primary_expressionContext exp;
		public Python_primary_expressionContext python_primary_expression() {
			return getRuleContext(Python_primary_expressionContext.class,0);
		}
		public PythonPrimaryExpressionContext(Python_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterPythonPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitPythonPrimaryExpression(this);
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterPythonSelectorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitPythonSelectorExpression(this);
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
		int _startState = 304;
		enterRecursionRule(_localctx, 304, RULE_python_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PythonPrimaryExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1778); 
			((PythonPrimaryExpressionContext)_localctx).exp = python_primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(1784);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PythonSelectorExpressionContext(new Python_expressionContext(_parentctx, _parentState));
					((PythonSelectorExpressionContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_python_expression);
					setState(1780);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1781); 
					((PythonSelectorExpressionContext)_localctx).child = python_selector_expression();
					}
					} 
				}
				setState(1786);
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
	public static class PythonIdentifierExpressionContext extends Python_primary_expressionContext {
		public Python_identifier_expressionContext exp;
		public Python_identifier_expressionContext python_identifier_expression() {
			return getRuleContext(Python_identifier_expressionContext.class,0);
		}
		public PythonIdentifierExpressionContext(Python_primary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterPythonIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitPythonIdentifierExpression(this);
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterPythonGlobalMethodExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitPythonGlobalMethodExpression(this);
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterPythonParenthesisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitPythonParenthesisExpression(this);
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterPythonLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitPythonLiteralExpression(this);
		}
	}

	public final Python_primary_expressionContext python_primary_expression() throws RecognitionException {
		Python_primary_expressionContext _localctx = new Python_primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_python_primary_expression);
		try {
			setState(1791);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				_localctx = new PythonParenthesisExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1787); 
				((PythonParenthesisExpressionContext)_localctx).exp = python_parenthesis_expression();
				}
				break;
			case 2:
				_localctx = new PythonIdentifierExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1788); 
				((PythonIdentifierExpressionContext)_localctx).exp = python_identifier_expression(0);
				}
				break;
			case 3:
				_localctx = new PythonLiteralExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1789); 
				((PythonLiteralExpressionContext)_localctx).exp = python_literal_expression();
				}
				break;
			case 4:
				_localctx = new PythonGlobalMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1790); 
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
	public static class PythonItemExpressionContext extends Python_selector_expressionContext {
		public Python_expressionContext exp;
		public TerminalNode LBRAK() { return getToken(SParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(SParser.RBRAK, 0); }
		public Python_expressionContext python_expression() {
			return getRuleContext(Python_expressionContext.class,0);
		}
		public PythonItemExpressionContext(Python_selector_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterPythonItemExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitPythonItemExpression(this);
		}
	}
	public static class PythonMethodExpressionContext extends Python_selector_expressionContext {
		public Python_method_expressionContext exp;
		public TerminalNode DOT() { return getToken(SParser.DOT, 0); }
		public Python_method_expressionContext python_method_expression() {
			return getRuleContext(Python_method_expressionContext.class,0);
		}
		public PythonMethodExpressionContext(Python_selector_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterPythonMethodExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitPythonMethodExpression(this);
		}
	}

	public final Python_selector_expressionContext python_selector_expression() throws RecognitionException {
		Python_selector_expressionContext _localctx = new Python_selector_expressionContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_python_selector_expression);
		try {
			setState(1799);
			switch (_input.LA(1)) {
			case DOT:
				_localctx = new PythonMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1793); 
				match(DOT);
				setState(1794); 
				((PythonMethodExpressionContext)_localctx).exp = python_method_expression();
				}
				break;
			case LBRAK:
				_localctx = new PythonItemExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1795); 
				match(LBRAK);
				setState(1796); 
				((PythonItemExpressionContext)_localctx).exp = python_expression(0);
				setState(1797); 
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
		public TerminalNode LPAR() { return getToken(SParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SParser.RPAR, 0); }
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterPython_method_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitPython_method_expression(this);
		}
	}

	public final Python_method_expressionContext python_method_expression() throws RecognitionException {
		Python_method_expressionContext _localctx = new Python_method_expressionContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_python_method_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1801); 
			((Python_method_expressionContext)_localctx).name = python_identifier();
			setState(1802); 
			match(LPAR);
			setState(1804);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD))) != 0) || ((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & ((1L << (READ - 116)) | (1L << (SELF - 116)) | (1L << (TEST - 116)) | (1L << (THIS - 116)) | (1L << (WRITE - 116)) | (1L << (BOOLEAN_LITERAL - 116)) | (1L << (CHAR_LITERAL - 116)) | (1L << (SYMBOL_IDENTIFIER - 116)) | (1L << (TYPE_IDENTIFIER - 116)) | (1L << (VARIABLE_IDENTIFIER - 116)) | (1L << (DOLLAR_IDENTIFIER - 116)) | (1L << (TEXT_LITERAL - 116)) | (1L << (INTEGER_LITERAL - 116)) | (1L << (DECIMAL_LITERAL - 116)))) != 0)) {
				{
				setState(1803); 
				((Python_method_expressionContext)_localctx).args = python_argument_list();
				}
			}

			setState(1806); 
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
	public static class PythonNamedOnlyArgumentListContext extends Python_argument_listContext {
		public Python_named_argument_listContext named;
		public Python_named_argument_listContext python_named_argument_list() {
			return getRuleContext(Python_named_argument_listContext.class,0);
		}
		public PythonNamedOnlyArgumentListContext(Python_argument_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterPythonNamedOnlyArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitPythonNamedOnlyArgumentList(this);
		}
	}
	public static class PythonArgumentListContext extends Python_argument_listContext {
		public Python_ordinal_argument_listContext ordinal;
		public Python_named_argument_listContext named;
		public TerminalNode COMMA() { return getToken(SParser.COMMA, 0); }
		public Python_ordinal_argument_listContext python_ordinal_argument_list() {
			return getRuleContext(Python_ordinal_argument_listContext.class,0);
		}
		public Python_named_argument_listContext python_named_argument_list() {
			return getRuleContext(Python_named_argument_listContext.class,0);
		}
		public PythonArgumentListContext(Python_argument_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterPythonArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitPythonArgumentList(this);
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterPythonOrdinalOnlyArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitPythonOrdinalOnlyArgumentList(this);
		}
	}

	public final Python_argument_listContext python_argument_list() throws RecognitionException {
		Python_argument_listContext _localctx = new Python_argument_listContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_python_argument_list);
		try {
			setState(1814);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				_localctx = new PythonOrdinalOnlyArgumentListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1808); 
				((PythonOrdinalOnlyArgumentListContext)_localctx).ordinal = python_ordinal_argument_list(0);
				}
				break;
			case 2:
				_localctx = new PythonNamedOnlyArgumentListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1809); 
				((PythonNamedOnlyArgumentListContext)_localctx).named = python_named_argument_list(0);
				}
				break;
			case 3:
				_localctx = new PythonArgumentListContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1810); 
				((PythonArgumentListContext)_localctx).ordinal = python_ordinal_argument_list(0);
				setState(1811); 
				match(COMMA);
				setState(1812); 
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
	public static class PythonOrdinalArgumentListItemContext extends Python_ordinal_argument_listContext {
		public Python_ordinal_argument_listContext items;
		public Python_expressionContext item;
		public TerminalNode COMMA() { return getToken(SParser.COMMA, 0); }
		public Python_ordinal_argument_listContext python_ordinal_argument_list() {
			return getRuleContext(Python_ordinal_argument_listContext.class,0);
		}
		public Python_expressionContext python_expression() {
			return getRuleContext(Python_expressionContext.class,0);
		}
		public PythonOrdinalArgumentListItemContext(Python_ordinal_argument_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterPythonOrdinalArgumentListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitPythonOrdinalArgumentListItem(this);
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterPythonOrdinalArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitPythonOrdinalArgumentList(this);
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
		int _startState = 314;
		enterRecursionRule(_localctx, 314, RULE_python_ordinal_argument_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PythonOrdinalArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1817); 
			((PythonOrdinalArgumentListContext)_localctx).item = python_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1824);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PythonOrdinalArgumentListItemContext(new Python_ordinal_argument_listContext(_parentctx, _parentState));
					((PythonOrdinalArgumentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_python_ordinal_argument_list);
					setState(1819);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1820); 
					match(COMMA);
					setState(1821); 
					((PythonOrdinalArgumentListItemContext)_localctx).item = python_expression(0);
					}
					} 
				}
				setState(1826);
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
	public static class PythonNamedArgumentListItemContext extends Python_named_argument_listContext {
		public Python_named_argument_listContext items;
		public Python_identifierContext name;
		public Python_expressionContext exp;
		public TerminalNode COMMA() { return getToken(SParser.COMMA, 0); }
		public TerminalNode EQ() { return getToken(SParser.EQ, 0); }
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterPythonNamedArgumentListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitPythonNamedArgumentListItem(this);
		}
	}
	public static class PythonNamedArgumentListContext extends Python_named_argument_listContext {
		public Python_identifierContext name;
		public Python_expressionContext exp;
		public TerminalNode EQ() { return getToken(SParser.EQ, 0); }
		public Python_identifierContext python_identifier() {
			return getRuleContext(Python_identifierContext.class,0);
		}
		public Python_expressionContext python_expression() {
			return getRuleContext(Python_expressionContext.class,0);
		}
		public PythonNamedArgumentListContext(Python_named_argument_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterPythonNamedArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitPythonNamedArgumentList(this);
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
		int _startState = 316;
		enterRecursionRule(_localctx, 316, RULE_python_named_argument_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PythonNamedArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1828); 
			((PythonNamedArgumentListContext)_localctx).name = python_identifier();
			setState(1829); 
			match(EQ);
			setState(1830); 
			((PythonNamedArgumentListContext)_localctx).exp = python_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1840);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,133,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PythonNamedArgumentListItemContext(new Python_named_argument_listContext(_parentctx, _parentState));
					((PythonNamedArgumentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_python_named_argument_list);
					setState(1832);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1833); 
					match(COMMA);
					setState(1834); 
					((PythonNamedArgumentListItemContext)_localctx).name = python_identifier();
					setState(1835); 
					match(EQ);
					setState(1836); 
					((PythonNamedArgumentListItemContext)_localctx).exp = python_expression(0);
					}
					} 
				}
				setState(1842);
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

	public static class Python_parenthesis_expressionContext extends ParserRuleContext {
		public Python_expressionContext exp;
		public TerminalNode LPAR() { return getToken(SParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SParser.RPAR, 0); }
		public Python_expressionContext python_expression() {
			return getRuleContext(Python_expressionContext.class,0);
		}
		public Python_parenthesis_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_python_parenthesis_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterPython_parenthesis_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitPython_parenthesis_expression(this);
		}
	}

	public final Python_parenthesis_expressionContext python_parenthesis_expression() throws RecognitionException {
		Python_parenthesis_expressionContext _localctx = new Python_parenthesis_expressionContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_python_parenthesis_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1843); 
			match(LPAR);
			setState(1844); 
			((Python_parenthesis_expressionContext)_localctx).exp = python_expression(0);
			setState(1845); 
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
		public TerminalNode DOT() { return getToken(SParser.DOT, 0); }
		public Python_identifier_expressionContext python_identifier_expression() {
			return getRuleContext(Python_identifier_expressionContext.class,0);
		}
		public Python_identifierContext python_identifier() {
			return getRuleContext(Python_identifierContext.class,0);
		}
		public PythonChildIdentifierContext(Python_identifier_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterPythonChildIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitPythonChildIdentifier(this);
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterPythonIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitPythonIdentifier(this);
		}
	}
	public static class PythonPrestoIdentifierContext extends Python_identifier_expressionContext {
		public TerminalNode DOLLAR_IDENTIFIER() { return getToken(SParser.DOLLAR_IDENTIFIER, 0); }
		public PythonPrestoIdentifierContext(Python_identifier_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterPythonPrestoIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitPythonPrestoIdentifier(this);
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
		int _startState = 320;
		enterRecursionRule(_localctx, 320, RULE_python_identifier_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1850);
			switch (_input.LA(1)) {
			case DOLLAR_IDENTIFIER:
				{
				_localctx = new PythonPrestoIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1848); 
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
				setState(1849); 
				((PythonIdentifierContext)_localctx).name = python_identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1857);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PythonChildIdentifierContext(new Python_identifier_expressionContext(_parentctx, _parentState));
					((PythonChildIdentifierContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_python_identifier_expression);
					setState(1852);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1853); 
					match(DOT);
					setState(1854); 
					((PythonChildIdentifierContext)_localctx).name = python_identifier();
					}
					} 
				}
				setState(1859);
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
	public static class PythonCharacterLiteralContext extends Python_literal_expressionContext {
		public Token t;
		public TerminalNode CHAR_LITERAL() { return getToken(SParser.CHAR_LITERAL, 0); }
		public PythonCharacterLiteralContext(Python_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterPythonCharacterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitPythonCharacterLiteral(this);
		}
	}
	public static class PythonTextLiteralContext extends Python_literal_expressionContext {
		public Token t;
		public TerminalNode TEXT_LITERAL() { return getToken(SParser.TEXT_LITERAL, 0); }
		public PythonTextLiteralContext(Python_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterPythonTextLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitPythonTextLiteral(this);
		}
	}
	public static class PythonIntegerLiteralContext extends Python_literal_expressionContext {
		public Token t;
		public TerminalNode INTEGER_LITERAL() { return getToken(SParser.INTEGER_LITERAL, 0); }
		public PythonIntegerLiteralContext(Python_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterPythonIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitPythonIntegerLiteral(this);
		}
	}
	public static class PythonDecimalLiteralContext extends Python_literal_expressionContext {
		public Token t;
		public TerminalNode DECIMAL_LITERAL() { return getToken(SParser.DECIMAL_LITERAL, 0); }
		public PythonDecimalLiteralContext(Python_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterPythonDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitPythonDecimalLiteral(this);
		}
	}
	public static class PythonBooleanLiteralContext extends Python_literal_expressionContext {
		public Token t;
		public TerminalNode BOOLEAN_LITERAL() { return getToken(SParser.BOOLEAN_LITERAL, 0); }
		public PythonBooleanLiteralContext(Python_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterPythonBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitPythonBooleanLiteral(this);
		}
	}

	public final Python_literal_expressionContext python_literal_expression() throws RecognitionException {
		Python_literal_expressionContext _localctx = new Python_literal_expressionContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_python_literal_expression);
		try {
			setState(1865);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				_localctx = new PythonIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1860); 
				((PythonIntegerLiteralContext)_localctx).t = match(INTEGER_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				_localctx = new PythonDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1861); 
				((PythonDecimalLiteralContext)_localctx).t = match(DECIMAL_LITERAL);
				}
				break;
			case TEXT_LITERAL:
				_localctx = new PythonTextLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1862); 
				((PythonTextLiteralContext)_localctx).t = match(TEXT_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new PythonBooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1863); 
				((PythonBooleanLiteralContext)_localctx).t = match(BOOLEAN_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new PythonCharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1864); 
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
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(SParser.VARIABLE_IDENTIFIER, 0); }
		public TerminalNode SYMBOL_IDENTIFIER() { return getToken(SParser.SYMBOL_IDENTIFIER, 0); }
		public TerminalNode TYPE_IDENTIFIER() { return getToken(SParser.TYPE_IDENTIFIER, 0); }
		public TerminalNode BOOLEAN() { return getToken(SParser.BOOLEAN, 0); }
		public TerminalNode CHARACTER() { return getToken(SParser.CHARACTER, 0); }
		public TerminalNode TEXT() { return getToken(SParser.TEXT, 0); }
		public TerminalNode INTEGER() { return getToken(SParser.INTEGER, 0); }
		public TerminalNode DECIMAL() { return getToken(SParser.DECIMAL, 0); }
		public TerminalNode DATE() { return getToken(SParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(SParser.TIME, 0); }
		public TerminalNode DATETIME() { return getToken(SParser.DATETIME, 0); }
		public TerminalNode PERIOD() { return getToken(SParser.PERIOD, 0); }
		public TerminalNode READ() { return getToken(SParser.READ, 0); }
		public TerminalNode WRITE() { return getToken(SParser.WRITE, 0); }
		public TerminalNode TEST() { return getToken(SParser.TEST, 0); }
		public TerminalNode SELF() { return getToken(SParser.SELF, 0); }
		public TerminalNode THIS() { return getToken(SParser.THIS, 0); }
		public Python_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_python_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterPython_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitPython_identifier(this);
		}
	}

	public final Python_identifierContext python_identifier() throws RecognitionException {
		Python_identifierContext _localctx = new Python_identifierContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_python_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1867);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD))) != 0) || ((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & ((1L << (READ - 116)) | (1L << (SELF - 116)) | (1L << (TEST - 116)) | (1L << (THIS - 116)) | (1L << (WRITE - 116)) | (1L << (SYMBOL_IDENTIFIER - 116)) | (1L << (TYPE_IDENTIFIER - 116)) | (1L << (VARIABLE_IDENTIFIER - 116)))) != 0)) ) {
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
	public static class JavaStatementContext extends Java_statementContext {
		public Java_expressionContext exp;
		public TerminalNode SEMI() { return getToken(SParser.SEMI, 0); }
		public Java_expressionContext java_expression() {
			return getRuleContext(Java_expressionContext.class,0);
		}
		public JavaStatementContext(Java_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterJavaStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitJavaStatement(this);
		}
	}
	public static class JavaReturnStatementContext extends Java_statementContext {
		public Java_expressionContext exp;
		public TerminalNode RETURN() { return getToken(SParser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(SParser.SEMI, 0); }
		public Java_expressionContext java_expression() {
			return getRuleContext(Java_expressionContext.class,0);
		}
		public JavaReturnStatementContext(Java_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterJavaReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitJavaReturnStatement(this);
		}
	}

	public final Java_statementContext java_statement() throws RecognitionException {
		Java_statementContext _localctx = new Java_statementContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_java_statement);
		try {
			setState(1876);
			switch (_input.LA(1)) {
			case RETURN:
				_localctx = new JavaReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1869); 
				match(RETURN);
				setState(1870); 
				((JavaReturnStatementContext)_localctx).exp = java_expression(0);
				setState(1871); 
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
				setState(1873); 
				((JavaStatementContext)_localctx).exp = java_expression(0);
				setState(1874); 
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
	public static class JavaPrimaryExpressionContext extends Java_expressionContext {
		public Java_primary_expressionContext exp;
		public Java_primary_expressionContext java_primary_expression() {
			return getRuleContext(Java_primary_expressionContext.class,0);
		}
		public JavaPrimaryExpressionContext(Java_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterJavaPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitJavaPrimaryExpression(this);
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterJavaSelectorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitJavaSelectorExpression(this);
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
		int _startState = 328;
		enterRecursionRule(_localctx, 328, RULE_java_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavaPrimaryExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1879); 
			((JavaPrimaryExpressionContext)_localctx).exp = java_primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(1885);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavaSelectorExpressionContext(new Java_expressionContext(_parentctx, _parentState));
					((JavaSelectorExpressionContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_java_expression);
					setState(1881);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1882); 
					((JavaSelectorExpressionContext)_localctx).child = java_selector_expression();
					}
					} 
				}
				setState(1887);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Java_primary_expressionContext extends ParserRuleContext {
		public Java_this_expressionContext java_this_expression() {
			return getRuleContext(Java_this_expressionContext.class,0);
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterJava_primary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitJava_primary_expression(this);
		}
	}

	public final Java_primary_expressionContext java_primary_expression() throws RecognitionException {
		Java_primary_expressionContext _localctx = new Java_primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_java_primary_expression);
		try {
			setState(1892);
			switch (_input.LA(1)) {
			case SELF:
			case THIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1888); 
				java_this_expression();
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(1889); 
				java_parenthesis_expression();
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
			case NATIVE_IDENTIFIER:
			case DOLLAR_IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(1890); 
				java_identifier_expression(0);
				}
				break;
			case BOOLEAN_LITERAL:
			case CHAR_LITERAL:
			case TEXT_LITERAL:
			case INTEGER_LITERAL:
			case DECIMAL_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1891); 
				java_literal_expression();
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterJava_this_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitJava_this_expression(this);
		}
	}

	public final Java_this_expressionContext java_this_expression() throws RecognitionException {
		Java_this_expressionContext _localctx = new Java_this_expressionContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_java_this_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1894); 
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterJavaItemExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitJavaItemExpression(this);
		}
	}
	public static class JavaMethodExpressionContext extends Java_selector_expressionContext {
		public Java_method_expressionContext exp;
		public TerminalNode DOT() { return getToken(SParser.DOT, 0); }
		public Java_method_expressionContext java_method_expression() {
			return getRuleContext(Java_method_expressionContext.class,0);
		}
		public JavaMethodExpressionContext(Java_selector_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterJavaMethodExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitJavaMethodExpression(this);
		}
	}

	public final Java_selector_expressionContext java_selector_expression() throws RecognitionException {
		Java_selector_expressionContext _localctx = new Java_selector_expressionContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_java_selector_expression);
		try {
			setState(1899);
			switch (_input.LA(1)) {
			case DOT:
				_localctx = new JavaMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1896); 
				match(DOT);
				setState(1897); 
				((JavaMethodExpressionContext)_localctx).exp = java_method_expression();
				}
				break;
			case LBRAK:
				_localctx = new JavaItemExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1898); 
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
		public TerminalNode LPAR() { return getToken(SParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SParser.RPAR, 0); }
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterJava_method_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitJava_method_expression(this);
		}
	}

	public final Java_method_expressionContext java_method_expression() throws RecognitionException {
		Java_method_expressionContext _localctx = new Java_method_expressionContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_java_method_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1901); 
			((Java_method_expressionContext)_localctx).name = java_identifier();
			setState(1902); 
			match(LPAR);
			setState(1904);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD))) != 0) || ((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & ((1L << (READ - 116)) | (1L << (SELF - 116)) | (1L << (TEST - 116)) | (1L << (THIS - 116)) | (1L << (WRITE - 116)) | (1L << (BOOLEAN_LITERAL - 116)) | (1L << (CHAR_LITERAL - 116)) | (1L << (SYMBOL_IDENTIFIER - 116)) | (1L << (TYPE_IDENTIFIER - 116)) | (1L << (VARIABLE_IDENTIFIER - 116)) | (1L << (NATIVE_IDENTIFIER - 116)) | (1L << (DOLLAR_IDENTIFIER - 116)) | (1L << (TEXT_LITERAL - 116)) | (1L << (INTEGER_LITERAL - 116)) | (1L << (DECIMAL_LITERAL - 116)))) != 0)) {
				{
				setState(1903); 
				((Java_method_expressionContext)_localctx).args = java_arguments(0);
				}
			}

			setState(1906); 
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
	public static class JavaArgumentListContext extends Java_argumentsContext {
		public Java_expressionContext item;
		public Java_expressionContext java_expression() {
			return getRuleContext(Java_expressionContext.class,0);
		}
		public JavaArgumentListContext(Java_argumentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterJavaArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitJavaArgumentList(this);
		}
	}
	public static class JavaArgumentListItemContext extends Java_argumentsContext {
		public Java_argumentsContext items;
		public Java_expressionContext item;
		public TerminalNode COMMA() { return getToken(SParser.COMMA, 0); }
		public Java_argumentsContext java_arguments() {
			return getRuleContext(Java_argumentsContext.class,0);
		}
		public Java_expressionContext java_expression() {
			return getRuleContext(Java_expressionContext.class,0);
		}
		public JavaArgumentListItemContext(Java_argumentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterJavaArgumentListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitJavaArgumentListItem(this);
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
		int _startState = 338;
		enterRecursionRule(_localctx, 338, RULE_java_arguments, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavaArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1909); 
			((JavaArgumentListContext)_localctx).item = java_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1916);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavaArgumentListItemContext(new Java_argumentsContext(_parentctx, _parentState));
					((JavaArgumentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_java_arguments);
					setState(1911);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1912); 
					match(COMMA);
					setState(1913); 
					((JavaArgumentListItemContext)_localctx).item = java_expression(0);
					}
					} 
				}
				setState(1918);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Java_item_expressionContext extends ParserRuleContext {
		public Java_expressionContext exp;
		public TerminalNode LBRAK() { return getToken(SParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(SParser.RBRAK, 0); }
		public Java_expressionContext java_expression() {
			return getRuleContext(Java_expressionContext.class,0);
		}
		public Java_item_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_item_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterJava_item_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitJava_item_expression(this);
		}
	}

	public final Java_item_expressionContext java_item_expression() throws RecognitionException {
		Java_item_expressionContext _localctx = new Java_item_expressionContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_java_item_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1919); 
			match(LBRAK);
			setState(1920); 
			((Java_item_expressionContext)_localctx).exp = java_expression(0);
			setState(1921); 
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
		public TerminalNode LPAR() { return getToken(SParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SParser.RPAR, 0); }
		public Java_expressionContext java_expression() {
			return getRuleContext(Java_expressionContext.class,0);
		}
		public Java_parenthesis_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_parenthesis_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterJava_parenthesis_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitJava_parenthesis_expression(this);
		}
	}

	public final Java_parenthesis_expressionContext java_parenthesis_expression() throws RecognitionException {
		Java_parenthesis_expressionContext _localctx = new Java_parenthesis_expressionContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_java_parenthesis_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1923); 
			match(LPAR);
			setState(1924); 
			((Java_parenthesis_expressionContext)_localctx).exp = java_expression(0);
			setState(1925); 
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterJavaIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitJavaIdentifier(this);
		}
	}
	public static class JavaChildIdentifierContext extends Java_identifier_expressionContext {
		public Java_identifier_expressionContext parent;
		public Java_identifierContext name;
		public TerminalNode DOT() { return getToken(SParser.DOT, 0); }
		public Java_identifier_expressionContext java_identifier_expression() {
			return getRuleContext(Java_identifier_expressionContext.class,0);
		}
		public Java_identifierContext java_identifier() {
			return getRuleContext(Java_identifierContext.class,0);
		}
		public JavaChildIdentifierContext(Java_identifier_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterJavaChildIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitJavaChildIdentifier(this);
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
		int _startState = 344;
		enterRecursionRule(_localctx, 344, RULE_java_identifier_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavaIdentifierContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1928); 
			((JavaIdentifierContext)_localctx).name = java_identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(1935);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavaChildIdentifierContext(new Java_identifier_expressionContext(_parentctx, _parentState));
					((JavaChildIdentifierContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_java_identifier_expression);
					setState(1930);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1931); 
					match(DOT);
					setState(1932); 
					((JavaChildIdentifierContext)_localctx).name = java_identifier();
					}
					} 
				}
				setState(1937);
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
	public static class JavaChildClassIdentifierContext extends Java_class_identifier_expressionContext {
		public Java_class_identifier_expressionContext parent;
		public Token name;
		public Java_class_identifier_expressionContext java_class_identifier_expression() {
			return getRuleContext(Java_class_identifier_expressionContext.class,0);
		}
		public TerminalNode DOLLAR_IDENTIFIER() { return getToken(SParser.DOLLAR_IDENTIFIER, 0); }
		public JavaChildClassIdentifierContext(Java_class_identifier_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterJavaChildClassIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitJavaChildClassIdentifier(this);
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterJavaClassIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitJavaClassIdentifier(this);
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
		int _startState = 346;
		enterRecursionRule(_localctx, 346, RULE_java_class_identifier_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavaClassIdentifierContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1939); 
			((JavaClassIdentifierContext)_localctx).klass = java_identifier_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1945);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavaChildClassIdentifierContext(new Java_class_identifier_expressionContext(_parentctx, _parentState));
					((JavaChildClassIdentifierContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_java_class_identifier_expression);
					setState(1941);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1942); 
					((JavaChildClassIdentifierContext)_localctx).name = match(DOLLAR_IDENTIFIER);
					}
					} 
				}
				setState(1947);
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
	public static class JavaCharacterLiteralContext extends Java_literal_expressionContext {
		public Token t;
		public TerminalNode CHAR_LITERAL() { return getToken(SParser.CHAR_LITERAL, 0); }
		public JavaCharacterLiteralContext(Java_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterJavaCharacterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitJavaCharacterLiteral(this);
		}
	}
	public static class JavaIntegerLiteralContext extends Java_literal_expressionContext {
		public Token t;
		public TerminalNode INTEGER_LITERAL() { return getToken(SParser.INTEGER_LITERAL, 0); }
		public JavaIntegerLiteralContext(Java_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterJavaIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitJavaIntegerLiteral(this);
		}
	}
	public static class JavaBooleanLiteralContext extends Java_literal_expressionContext {
		public Token t;
		public TerminalNode BOOLEAN_LITERAL() { return getToken(SParser.BOOLEAN_LITERAL, 0); }
		public JavaBooleanLiteralContext(Java_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterJavaBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitJavaBooleanLiteral(this);
		}
	}
	public static class JavaDecimalLiteralContext extends Java_literal_expressionContext {
		public Token t;
		public TerminalNode DECIMAL_LITERAL() { return getToken(SParser.DECIMAL_LITERAL, 0); }
		public JavaDecimalLiteralContext(Java_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterJavaDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitJavaDecimalLiteral(this);
		}
	}
	public static class JavaTextLiteralContext extends Java_literal_expressionContext {
		public Token t;
		public TerminalNode TEXT_LITERAL() { return getToken(SParser.TEXT_LITERAL, 0); }
		public JavaTextLiteralContext(Java_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterJavaTextLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitJavaTextLiteral(this);
		}
	}

	public final Java_literal_expressionContext java_literal_expression() throws RecognitionException {
		Java_literal_expressionContext _localctx = new Java_literal_expressionContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_java_literal_expression);
		try {
			setState(1953);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				_localctx = new JavaIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1948); 
				((JavaIntegerLiteralContext)_localctx).t = match(INTEGER_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				_localctx = new JavaDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1949); 
				((JavaDecimalLiteralContext)_localctx).t = match(DECIMAL_LITERAL);
				}
				break;
			case TEXT_LITERAL:
				_localctx = new JavaTextLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1950); 
				((JavaTextLiteralContext)_localctx).t = match(TEXT_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new JavaBooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1951); 
				((JavaBooleanLiteralContext)_localctx).t = match(BOOLEAN_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new JavaCharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1952); 
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
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(SParser.VARIABLE_IDENTIFIER, 0); }
		public TerminalNode SYMBOL_IDENTIFIER() { return getToken(SParser.SYMBOL_IDENTIFIER, 0); }
		public TerminalNode NATIVE_IDENTIFIER() { return getToken(SParser.NATIVE_IDENTIFIER, 0); }
		public TerminalNode DOLLAR_IDENTIFIER() { return getToken(SParser.DOLLAR_IDENTIFIER, 0); }
		public TerminalNode TYPE_IDENTIFIER() { return getToken(SParser.TYPE_IDENTIFIER, 0); }
		public TerminalNode BOOLEAN() { return getToken(SParser.BOOLEAN, 0); }
		public TerminalNode CHARACTER() { return getToken(SParser.CHARACTER, 0); }
		public TerminalNode TEXT() { return getToken(SParser.TEXT, 0); }
		public TerminalNode INTEGER() { return getToken(SParser.INTEGER, 0); }
		public TerminalNode DECIMAL() { return getToken(SParser.DECIMAL, 0); }
		public TerminalNode DATE() { return getToken(SParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(SParser.TIME, 0); }
		public TerminalNode DATETIME() { return getToken(SParser.DATETIME, 0); }
		public TerminalNode PERIOD() { return getToken(SParser.PERIOD, 0); }
		public TerminalNode READ() { return getToken(SParser.READ, 0); }
		public TerminalNode WRITE() { return getToken(SParser.WRITE, 0); }
		public TerminalNode TEST() { return getToken(SParser.TEST, 0); }
		public Java_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterJava_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitJava_identifier(this);
		}
	}

	public final Java_identifierContext java_identifier() throws RecognitionException {
		Java_identifierContext _localctx = new Java_identifierContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_java_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1955);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD))) != 0) || ((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & ((1L << (READ - 116)) | (1L << (TEST - 116)) | (1L << (WRITE - 116)) | (1L << (SYMBOL_IDENTIFIER - 116)) | (1L << (TYPE_IDENTIFIER - 116)) | (1L << (VARIABLE_IDENTIFIER - 116)) | (1L << (NATIVE_IDENTIFIER - 116)) | (1L << (DOLLAR_IDENTIFIER - 116)))) != 0)) ) {
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
	public static class CSharpStatementContext extends Csharp_statementContext {
		public Csharp_expressionContext exp;
		public TerminalNode SEMI() { return getToken(SParser.SEMI, 0); }
		public Csharp_expressionContext csharp_expression() {
			return getRuleContext(Csharp_expressionContext.class,0);
		}
		public CSharpStatementContext(Csharp_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterCSharpStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitCSharpStatement(this);
		}
	}
	public static class CSharpReturnStatementContext extends Csharp_statementContext {
		public Csharp_expressionContext exp;
		public TerminalNode RETURN() { return getToken(SParser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(SParser.SEMI, 0); }
		public Csharp_expressionContext csharp_expression() {
			return getRuleContext(Csharp_expressionContext.class,0);
		}
		public CSharpReturnStatementContext(Csharp_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterCSharpReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitCSharpReturnStatement(this);
		}
	}

	public final Csharp_statementContext csharp_statement() throws RecognitionException {
		Csharp_statementContext _localctx = new Csharp_statementContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_csharp_statement);
		try {
			setState(1964);
			switch (_input.LA(1)) {
			case RETURN:
				_localctx = new CSharpReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1957); 
				match(RETURN);
				setState(1958); 
				((CSharpReturnStatementContext)_localctx).exp = csharp_expression(0);
				setState(1959); 
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
				setState(1961); 
				((CSharpStatementContext)_localctx).exp = csharp_expression(0);
				setState(1962); 
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
	public static class CSharpPrimaryExpressionContext extends Csharp_expressionContext {
		public Csharp_primary_expressionContext exp;
		public Csharp_primary_expressionContext csharp_primary_expression() {
			return getRuleContext(Csharp_primary_expressionContext.class,0);
		}
		public CSharpPrimaryExpressionContext(Csharp_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterCSharpPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitCSharpPrimaryExpression(this);
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterCSharpSelectorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitCSharpSelectorExpression(this);
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
		int _startState = 354;
		enterRecursionRule(_localctx, 354, RULE_csharp_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new CSharpPrimaryExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1967); 
			((CSharpPrimaryExpressionContext)_localctx).exp = csharp_primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(1973);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CSharpSelectorExpressionContext(new Csharp_expressionContext(_parentctx, _parentState));
					((CSharpSelectorExpressionContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_csharp_expression);
					setState(1969);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1970); 
					((CSharpSelectorExpressionContext)_localctx).child = csharp_selector_expression();
					}
					} 
				}
				setState(1975);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterCsharp_primary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitCsharp_primary_expression(this);
		}
	}

	public final Csharp_primary_expressionContext csharp_primary_expression() throws RecognitionException {
		Csharp_primary_expressionContext _localctx = new Csharp_primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_csharp_primary_expression);
		try {
			setState(1980);
			switch (_input.LA(1)) {
			case SELF:
			case THIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1976); 
				csharp_this_expression();
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(1977); 
				csharp_parenthesis_expression();
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
			case DOLLAR_IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(1978); 
				csharp_identifier_expression(0);
				}
				break;
			case BOOLEAN_LITERAL:
			case CHAR_LITERAL:
			case TEXT_LITERAL:
			case INTEGER_LITERAL:
			case DECIMAL_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1979); 
				csharp_literal_expression();
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterCsharp_this_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitCsharp_this_expression(this);
		}
	}

	public final Csharp_this_expressionContext csharp_this_expression() throws RecognitionException {
		Csharp_this_expressionContext _localctx = new Csharp_this_expressionContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_csharp_this_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1982); 
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
	public static class CSharpItemExpressionContext extends Csharp_selector_expressionContext {
		public Csharp_item_expressionContext exp;
		public Csharp_item_expressionContext csharp_item_expression() {
			return getRuleContext(Csharp_item_expressionContext.class,0);
		}
		public CSharpItemExpressionContext(Csharp_selector_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterCSharpItemExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitCSharpItemExpression(this);
		}
	}
	public static class CSharpMethodExpressionContext extends Csharp_selector_expressionContext {
		public Csharp_method_expressionContext exp;
		public TerminalNode DOT() { return getToken(SParser.DOT, 0); }
		public Csharp_method_expressionContext csharp_method_expression() {
			return getRuleContext(Csharp_method_expressionContext.class,0);
		}
		public CSharpMethodExpressionContext(Csharp_selector_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterCSharpMethodExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitCSharpMethodExpression(this);
		}
	}

	public final Csharp_selector_expressionContext csharp_selector_expression() throws RecognitionException {
		Csharp_selector_expressionContext _localctx = new Csharp_selector_expressionContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_csharp_selector_expression);
		try {
			setState(1987);
			switch (_input.LA(1)) {
			case DOT:
				_localctx = new CSharpMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1984); 
				match(DOT);
				setState(1985); 
				((CSharpMethodExpressionContext)_localctx).exp = csharp_method_expression();
				}
				break;
			case LBRAK:
				_localctx = new CSharpItemExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1986); 
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
		public TerminalNode LPAR() { return getToken(SParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SParser.RPAR, 0); }
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterCsharp_method_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitCsharp_method_expression(this);
		}
	}

	public final Csharp_method_expressionContext csharp_method_expression() throws RecognitionException {
		Csharp_method_expressionContext _localctx = new Csharp_method_expressionContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_csharp_method_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1989); 
			((Csharp_method_expressionContext)_localctx).name = csharp_identifier();
			setState(1990); 
			match(LPAR);
			setState(1992);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD))) != 0) || ((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & ((1L << (READ - 116)) | (1L << (SELF - 116)) | (1L << (TEST - 116)) | (1L << (THIS - 116)) | (1L << (WRITE - 116)) | (1L << (BOOLEAN_LITERAL - 116)) | (1L << (CHAR_LITERAL - 116)) | (1L << (SYMBOL_IDENTIFIER - 116)) | (1L << (TYPE_IDENTIFIER - 116)) | (1L << (VARIABLE_IDENTIFIER - 116)) | (1L << (DOLLAR_IDENTIFIER - 116)) | (1L << (TEXT_LITERAL - 116)) | (1L << (INTEGER_LITERAL - 116)) | (1L << (DECIMAL_LITERAL - 116)))) != 0)) {
				{
				setState(1991); 
				((Csharp_method_expressionContext)_localctx).args = csharp_arguments(0);
				}
			}

			setState(1994); 
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterCSharpArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitCSharpArgumentList(this);
		}
	}
	public static class CSharpArgumentListItemContext extends Csharp_argumentsContext {
		public Csharp_argumentsContext items;
		public Csharp_expressionContext item;
		public TerminalNode COMMA() { return getToken(SParser.COMMA, 0); }
		public Csharp_argumentsContext csharp_arguments() {
			return getRuleContext(Csharp_argumentsContext.class,0);
		}
		public Csharp_expressionContext csharp_expression() {
			return getRuleContext(Csharp_expressionContext.class,0);
		}
		public CSharpArgumentListItemContext(Csharp_argumentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterCSharpArgumentListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitCSharpArgumentListItem(this);
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
		int _startState = 364;
		enterRecursionRule(_localctx, 364, RULE_csharp_arguments, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new CSharpArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1997); 
			((CSharpArgumentListContext)_localctx).item = csharp_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2004);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CSharpArgumentListItemContext(new Csharp_argumentsContext(_parentctx, _parentState));
					((CSharpArgumentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_csharp_arguments);
					setState(1999);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2000); 
					match(COMMA);
					setState(2001); 
					((CSharpArgumentListItemContext)_localctx).item = csharp_expression(0);
					}
					} 
				}
				setState(2006);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Csharp_item_expressionContext extends ParserRuleContext {
		public Csharp_expressionContext exp;
		public TerminalNode LBRAK() { return getToken(SParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(SParser.RBRAK, 0); }
		public Csharp_expressionContext csharp_expression() {
			return getRuleContext(Csharp_expressionContext.class,0);
		}
		public Csharp_item_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csharp_item_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterCsharp_item_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitCsharp_item_expression(this);
		}
	}

	public final Csharp_item_expressionContext csharp_item_expression() throws RecognitionException {
		Csharp_item_expressionContext _localctx = new Csharp_item_expressionContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_csharp_item_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2007); 
			match(LBRAK);
			setState(2008); 
			((Csharp_item_expressionContext)_localctx).exp = csharp_expression(0);
			setState(2009); 
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
		public TerminalNode LPAR() { return getToken(SParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SParser.RPAR, 0); }
		public Csharp_expressionContext csharp_expression() {
			return getRuleContext(Csharp_expressionContext.class,0);
		}
		public Csharp_parenthesis_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csharp_parenthesis_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterCsharp_parenthesis_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitCsharp_parenthesis_expression(this);
		}
	}

	public final Csharp_parenthesis_expressionContext csharp_parenthesis_expression() throws RecognitionException {
		Csharp_parenthesis_expressionContext _localctx = new Csharp_parenthesis_expressionContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_csharp_parenthesis_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2011); 
			match(LPAR);
			setState(2012); 
			((Csharp_parenthesis_expressionContext)_localctx).exp = csharp_expression(0);
			setState(2013); 
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
	public static class CSharpPrestoIdentifierContext extends Csharp_identifier_expressionContext {
		public TerminalNode DOLLAR_IDENTIFIER() { return getToken(SParser.DOLLAR_IDENTIFIER, 0); }
		public CSharpPrestoIdentifierContext(Csharp_identifier_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterCSharpPrestoIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitCSharpPrestoIdentifier(this);
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
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterCSharpIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitCSharpIdentifier(this);
		}
	}
	public static class CSharpChildIdentifierContext extends Csharp_identifier_expressionContext {
		public Csharp_identifier_expressionContext parent;
		public Csharp_identifierContext name;
		public TerminalNode DOT() { return getToken(SParser.DOT, 0); }
		public Csharp_identifier_expressionContext csharp_identifier_expression() {
			return getRuleContext(Csharp_identifier_expressionContext.class,0);
		}
		public Csharp_identifierContext csharp_identifier() {
			return getRuleContext(Csharp_identifierContext.class,0);
		}
		public CSharpChildIdentifierContext(Csharp_identifier_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterCSharpChildIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitCSharpChildIdentifier(this);
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
		int _startState = 370;
		enterRecursionRule(_localctx, 370, RULE_csharp_identifier_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2018);
			switch (_input.LA(1)) {
			case DOLLAR_IDENTIFIER:
				{
				_localctx = new CSharpPrestoIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2016); 
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
				setState(2017); 
				((CSharpIdentifierContext)_localctx).name = csharp_identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(2025);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CSharpChildIdentifierContext(new Csharp_identifier_expressionContext(_parentctx, _parentState));
					((CSharpChildIdentifierContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_csharp_identifier_expression);
					setState(2020);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2021); 
					match(DOT);
					setState(2022); 
					((CSharpChildIdentifierContext)_localctx).name = csharp_identifier();
					}
					} 
				}
				setState(2027);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
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
	public static class CSharpCharacterLiteralContext extends Csharp_literal_expressionContext {
		public TerminalNode CHAR_LITERAL() { return getToken(SParser.CHAR_LITERAL, 0); }
		public CSharpCharacterLiteralContext(Csharp_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterCSharpCharacterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitCSharpCharacterLiteral(this);
		}
	}
	public static class CSharpDecimalLiteralContext extends Csharp_literal_expressionContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(SParser.DECIMAL_LITERAL, 0); }
		public CSharpDecimalLiteralContext(Csharp_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterCSharpDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitCSharpDecimalLiteral(this);
		}
	}
	public static class CSharpBooleanLiteralContext extends Csharp_literal_expressionContext {
		public TerminalNode BOOLEAN_LITERAL() { return getToken(SParser.BOOLEAN_LITERAL, 0); }
		public CSharpBooleanLiteralContext(Csharp_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterCSharpBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitCSharpBooleanLiteral(this);
		}
	}
	public static class CSharpIntegerLiteralContext extends Csharp_literal_expressionContext {
		public TerminalNode INTEGER_LITERAL() { return getToken(SParser.INTEGER_LITERAL, 0); }
		public CSharpIntegerLiteralContext(Csharp_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterCSharpIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitCSharpIntegerLiteral(this);
		}
	}
	public static class CSharpTextLiteralContext extends Csharp_literal_expressionContext {
		public TerminalNode TEXT_LITERAL() { return getToken(SParser.TEXT_LITERAL, 0); }
		public CSharpTextLiteralContext(Csharp_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterCSharpTextLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitCSharpTextLiteral(this);
		}
	}

	public final Csharp_literal_expressionContext csharp_literal_expression() throws RecognitionException {
		Csharp_literal_expressionContext _localctx = new Csharp_literal_expressionContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_csharp_literal_expression);
		try {
			setState(2033);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				_localctx = new CSharpIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2028); 
				match(INTEGER_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				_localctx = new CSharpDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2029); 
				match(DECIMAL_LITERAL);
				}
				break;
			case TEXT_LITERAL:
				_localctx = new CSharpTextLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2030); 
				match(TEXT_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new CSharpBooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2031); 
				match(BOOLEAN_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new CSharpCharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2032); 
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
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(SParser.VARIABLE_IDENTIFIER, 0); }
		public TerminalNode SYMBOL_IDENTIFIER() { return getToken(SParser.SYMBOL_IDENTIFIER, 0); }
		public TerminalNode TYPE_IDENTIFIER() { return getToken(SParser.TYPE_IDENTIFIER, 0); }
		public TerminalNode BOOLEAN() { return getToken(SParser.BOOLEAN, 0); }
		public TerminalNode CHARACTER() { return getToken(SParser.CHARACTER, 0); }
		public TerminalNode TEXT() { return getToken(SParser.TEXT, 0); }
		public TerminalNode INTEGER() { return getToken(SParser.INTEGER, 0); }
		public TerminalNode DECIMAL() { return getToken(SParser.DECIMAL, 0); }
		public TerminalNode DATE() { return getToken(SParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(SParser.TIME, 0); }
		public TerminalNode DATETIME() { return getToken(SParser.DATETIME, 0); }
		public TerminalNode PERIOD() { return getToken(SParser.PERIOD, 0); }
		public TerminalNode READ() { return getToken(SParser.READ, 0); }
		public TerminalNode WRITE() { return getToken(SParser.WRITE, 0); }
		public TerminalNode TEST() { return getToken(SParser.TEST, 0); }
		public Csharp_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csharp_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).enterCsharp_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SParserListener ) ((SParserListener)listener).exitCsharp_identifier(this);
		}
	}

	public final Csharp_identifierContext csharp_identifier() throws RecognitionException {
		Csharp_identifierContext _localctx = new Csharp_identifierContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_csharp_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2035);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD))) != 0) || ((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & ((1L << (READ - 116)) | (1L << (TEST - 116)) | (1L << (WRITE - 116)) | (1L << (SYMBOL_IDENTIFIER - 116)) | (1L << (TYPE_IDENTIFIER - 116)) | (1L << (VARIABLE_IDENTIFIER - 116)))) != 0)) ) {
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
		case 14: 
			return native_category_binding_list_sempred((Native_category_binding_listContext)_localctx, predIndex);
		case 25: 
			return callable_parent_sempred((Callable_parentContext)_localctx, predIndex);
		case 35: 
			return else_if_statement_list_sempred((Else_if_statement_listContext)_localctx, predIndex);
		case 40: 
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 42: 
			return instance_expression_sempred((Instance_expressionContext)_localctx, predIndex);
		case 44: 
			return instance_selector_sempred((Instance_selectorContext)_localctx, predIndex);
		case 47: 
			return argument_assignment_list_sempred((Argument_assignment_listContext)_localctx, predIndex);
		case 54: 
			return child_instance_sempred((Child_instanceContext)_localctx, predIndex);
		case 62: 
			return declarations_sempred((DeclarationsContext)_localctx, predIndex);
		case 66: 
			return native_symbol_list_sempred((Native_symbol_listContext)_localctx, predIndex);
		case 67: 
			return category_symbol_list_sempred((Category_symbol_listContext)_localctx, predIndex);
		case 68: 
			return symbol_list_sempred((Symbol_listContext)_localctx, predIndex);
		case 72: 
			return expression_list_sempred((Expression_listContext)_localctx, predIndex);
		case 74: 
			return typedef_sempred((TypedefContext)_localctx, predIndex);
		case 81: 
			return type_identifier_list_sempred((Type_identifier_listContext)_localctx, predIndex);
		case 87: 
			return argument_list_sempred((Argument_listContext)_localctx, predIndex);
		case 93: 
			return any_type_sempred((Any_typeContext)_localctx, predIndex);
		case 94: 
			return member_method_declaration_list_sempred((Member_method_declaration_listContext)_localctx, predIndex);
		case 96: 
			return native_member_method_declaration_list_sempred((Native_member_method_declaration_listContext)_localctx, predIndex);
		case 101: 
			return module_token_sempred((Module_tokenContext)_localctx, predIndex);
		case 104: 
			return variable_identifier_list_sempred((Variable_identifier_listContext)_localctx, predIndex);
		case 106: 
			return native_statement_list_sempred((Native_statement_listContext)_localctx, predIndex);
		case 110: 
			return statement_list_sempred((Statement_listContext)_localctx, predIndex);
		case 111: 
			return assertion_list_sempred((Assertion_listContext)_localctx, predIndex);
		case 112: 
			return switch_case_statement_list_sempred((Switch_case_statement_listContext)_localctx, predIndex);
		case 113: 
			return catch_statement_list_sempred((Catch_statement_listContext)_localctx, predIndex);
		case 116: 
			return literal_list_literal_sempred((Literal_list_literalContext)_localctx, predIndex);
		case 124: 
			return expression_tuple_sempred((Expression_tupleContext)_localctx, predIndex);
		case 125: 
			return dict_entry_list_sempred((Dict_entry_listContext)_localctx, predIndex);
		case 129: 
			return assignable_instance_sempred((Assignable_instanceContext)_localctx, predIndex);
		case 130: 
			return is_expression_sempred((Is_expressionContext)_localctx, predIndex);
		case 132: 
			return key_token_sempred((Key_tokenContext)_localctx, predIndex);
		case 133: 
			return value_token_sempred((Value_tokenContext)_localctx, predIndex);
		case 134: 
			return symbols_token_sempred((Symbols_tokenContext)_localctx, predIndex);
		case 141: 
			return javascript_expression_sempred((Javascript_expressionContext)_localctx, predIndex);
		case 145: 
			return javascript_arguments_sempred((Javascript_argumentsContext)_localctx, predIndex);
		case 148: 
			return javascript_identifier_expression_sempred((Javascript_identifier_expressionContext)_localctx, predIndex);
		case 152: 
			return python_expression_sempred((Python_expressionContext)_localctx, predIndex);
		case 157: 
			return python_ordinal_argument_list_sempred((Python_ordinal_argument_listContext)_localctx, predIndex);
		case 158: 
			return python_named_argument_list_sempred((Python_named_argument_listContext)_localctx, predIndex);
		case 160: 
			return python_identifier_expression_sempred((Python_identifier_expressionContext)_localctx, predIndex);
		case 164: 
			return java_expression_sempred((Java_expressionContext)_localctx, predIndex);
		case 169: 
			return java_arguments_sempred((Java_argumentsContext)_localctx, predIndex);
		case 172: 
			return java_identifier_expression_sempred((Java_identifier_expressionContext)_localctx, predIndex);
		case 173: 
			return java_class_identifier_expression_sempred((Java_class_identifier_expressionContext)_localctx, predIndex);
		case 177: 
			return csharp_expression_sempred((Csharp_expressionContext)_localctx, predIndex);
		case 182: 
			return csharp_arguments_sempred((Csharp_argumentsContext)_localctx, predIndex);
		case 185: 
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
			return precpred(_ctx, 29);
		case 4: 
			return precpred(_ctx, 28);
		case 5: 
			return precpred(_ctx, 27);
		case 6: 
			return precpred(_ctx, 26);
		case 7: 
			return precpred(_ctx, 25);
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
			return precpred(_ctx, 15);
		case 16: 
			return precpred(_ctx, 14);
		case 17: 
			return precpred(_ctx, 13);
		case 18: 
			return precpred(_ctx, 11);
		case 19: 
			return precpred(_ctx, 10);
		case 20: 
			return precpred(_ctx, 9);
		case 21: 
			return precpred(_ctx, 8);
		case 22: 
			return precpred(_ctx, 7);
		case 23: 
			return precpred(_ctx, 6);
		case 24: 
			return precpred(_ctx, 5);
		case 25: 
			return precpred(_ctx, 4);
		case 26: 
			return precpred(_ctx, 20);
		case 27: 
			return precpred(_ctx, 19);
		case 28: 
			return precpred(_ctx, 12);
		}
		return true;
	}
	private boolean instance_expression_sempred(Instance_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 29: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean instance_selector_sempred(Instance_selectorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 30: 
			return this.wasNot(SParser.WS);
		case 31: 
			return this.wasNot(SParser.WS);
		case 32: 
			return this.wasNot(SParser.WS);
		}
		return true;
	}
	private boolean argument_assignment_list_sempred(Argument_assignment_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 33: 
			return this.willNotBe(this.equalToken());
		case 34: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean child_instance_sempred(Child_instanceContext _localctx, int predIndex) {
		switch (predIndex) {
		case 35: 
			return this.wasNot(SParser.WS);
		case 36: 
			return this.wasNot(SParser.WS);
		}
		return true;
	}
	private boolean declarations_sempred(DeclarationsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 37: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean native_symbol_list_sempred(Native_symbol_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 38: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean category_symbol_list_sempred(Category_symbol_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 39: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean symbol_list_sempred(Symbol_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 40: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_list_sempred(Expression_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 41: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean typedef_sempred(TypedefContext _localctx, int predIndex) {
		switch (predIndex) {
		case 42: 
			return precpred(_ctx, 3);
		case 43: 
			return precpred(_ctx, 2);
		case 44: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean type_identifier_list_sempred(Type_identifier_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 45: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean argument_list_sempred(Argument_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 46: 
			return precpred(_ctx, 1);
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
	private boolean member_method_declaration_list_sempred(Member_method_declaration_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 49: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean native_member_method_declaration_list_sempred(Native_member_method_declaration_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 50: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean module_token_sempred(Module_tokenContext _localctx, int predIndex) {
		switch (predIndex) {
		case 51: 
			return this.isText(((Module_tokenContext)_localctx).i1,"module");
		}
		return true;
	}
	private boolean variable_identifier_list_sempred(Variable_identifier_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 52: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean native_statement_list_sempred(Native_statement_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 53: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean statement_list_sempred(Statement_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 54: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean assertion_list_sempred(Assertion_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 55: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean switch_case_statement_list_sempred(Switch_case_statement_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 56: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean catch_statement_list_sempred(Catch_statement_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 57: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean literal_list_literal_sempred(Literal_list_literalContext _localctx, int predIndex) {
		switch (predIndex) {
		case 58: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_tuple_sempred(Expression_tupleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 59: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean dict_entry_list_sempred(Dict_entry_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 60: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean assignable_instance_sempred(Assignable_instanceContext _localctx, int predIndex) {
		switch (predIndex) {
		case 61: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean is_expression_sempred(Is_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 62: 
			return this.willBeAOrAn();
		}
		return true;
	}
	private boolean key_token_sempred(Key_tokenContext _localctx, int predIndex) {
		switch (predIndex) {
		case 63: 
			return this.isText(((Key_tokenContext)_localctx).i1,"key");
		}
		return true;
	}
	private boolean value_token_sempred(Value_tokenContext _localctx, int predIndex) {
		switch (predIndex) {
		case 64: 
			return this.isText(((Value_tokenContext)_localctx).i1,"value");
		}
		return true;
	}
	private boolean symbols_token_sempred(Symbols_tokenContext _localctx, int predIndex) {
		switch (predIndex) {
		case 65: 
			return this.isText(((Symbols_tokenContext)_localctx).i1,"symbols");
		}
		return true;
	}
	private boolean javascript_expression_sempred(Javascript_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 66: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean javascript_arguments_sempred(Javascript_argumentsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 67: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean javascript_identifier_expression_sempred(Javascript_identifier_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 68: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean python_expression_sempred(Python_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 69: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean python_ordinal_argument_list_sempred(Python_ordinal_argument_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 70: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean python_named_argument_list_sempred(Python_named_argument_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 71: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean python_identifier_expression_sempred(Python_identifier_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 72: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean java_expression_sempred(Java_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 73: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean java_arguments_sempred(Java_argumentsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 74: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean java_identifier_expression_sempred(Java_identifier_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 75: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean java_class_identifier_expression_sempred(Java_class_identifier_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 76: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean csharp_expression_sempred(Csharp_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 77: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean csharp_arguments_sempred(Csharp_argumentsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 78: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean csharp_identifier_expression_sempred(Csharp_identifier_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 79: 
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u009b\u07f8\4\2\t"+
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
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u0181"+
		"\n\2\3\2\5\2\u0184\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\5\5\u019d\n\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u01aa\n\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\5\7\u01b7\n\7\3\7\3\7\3\7\3\7\3\7\5\7\u01be\n\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u01cb\n\b\3\b\3\b\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u01d9\n\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\5\r\u01f9\n\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\5\r\u0202\n\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\5\16\u020b\n"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0214\n\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\7\20\u0227\n\20\f\20\16\20\u022a\13\20\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u0233\n\22\3\22\3\22\3\22\5\22\u0238\n\22\3\23\3\23\3\23\3"+
		"\23\5\23\u023e\n\23\3\23\3\23\3\23\5\23\u0243\n\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\5\24\u024f\n\24\3\24\3\24\3\24\5\24\u0254"+
		"\n\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u026c\n\25\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0277\n\27\3\27\3\27\5\27\u027b"+
		"\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\5\30\u028c\n\30\3\31\3\31\3\31\5\31\u0291\n\31\3\31\3\31\3"+
		"\32\3\32\3\32\3\32\3\32\5\32\u029a\n\32\3\33\3\33\3\33\3\33\3\33\7\33"+
		"\u02a1\n\33\f\33\16\33\u02a4\13\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34"+
		"\u02ac\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\5\37\u02c9\n\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \5 \u02dc\n \3!\3!\3!\3!\5!\u02e2\n!\3!\3!\3!\3!\3!\3!\3!\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$"+
		"\3$\3$\3$\5$\u0304\n$\3$\3$\3$\3$\3$\3$\3$\5$\u030d\n$\3%\3%\3%\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\7%\u0322\n%\f%\16%\u0325\13"+
		"%\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0332\n\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\5\'\u033b\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0344\n\'"+
		"\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u035b"+
		"\n(\3)\3)\5)\u035f\n)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*"+
		"\3*\3*\5*\u0373\n*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*"+
		"\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*"+
		"\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*"+
		"\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*"+
		"\3*\3*\3*\3*\3*\3*\3*\3*\7*\u03d3\n*\f*\16*\u03d6\13*\3+\3+\3,\3,\3,\3"+
		",\3,\7,\u03df\n,\f,\16,\u03e2\13,\3-\3-\3-\3-\3-\3-\5-\u03ea\n-\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u03f9\n.\3/\3/\3\60\5\60\u03fe\n"+
		"\60\3\60\3\60\3\60\5\60\u0403\n\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61"+
		"\5\61\u040c\n\61\3\61\3\61\3\61\7\61\u0411\n\61\f\61\16\61\u0414\13\61"+
		"\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\5\66\u0432\n\66\3\66\3\66\3\67\3\67\3\67\3\67\38\38\38\38\38\38\38\3"+
		"8\58\u0442\n8\39\39\39\39\3:\7:\u0449\n:\f:\16:\u044c\13:\3;\6;\u044f"+
		"\n;\r;\16;\u0450\3<\6<\u0454\n<\r<\16<\u0455\3<\3<\3=\7=\u045b\n=\f=\16"+
		"=\u045e\13=\3=\3=\3>\3>\3?\5?\u0465\n?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3@\7"+
		"@\u0471\n@\f@\16@\u0474\13@\3A\3A\3A\3A\3A\5A\u047b\nA\3B\3B\3C\3C\5C"+
		"\u0481\nC\3D\3D\3D\3D\3D\3D\3D\7D\u048a\nD\fD\16D\u048d\13D\3E\3E\3E\3"+
		"E\3E\3E\3E\7E\u0496\nE\fE\16E\u0499\13E\3F\3F\3F\3F\3F\3F\7F\u04a1\nF"+
		"\fF\16F\u04a4\13F\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\5G\u04b0\nG\3H\3H\5H\u04b4"+
		"\nH\3H\3H\3I\3I\5I\u04ba\nI\3I\3I\3J\3J\3J\3J\3J\3J\7J\u04c4\nJ\fJ\16"+
		"J\u04c7\13J\3K\3K\3K\3K\3K\3K\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\7L\u04da"+
		"\nL\fL\16L\u04dd\13L\3M\3M\5M\u04e1\nM\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\5"+
		"N\u04ed\nN\3O\3O\3P\3P\3Q\3Q\3R\3R\3R\5R\u04f8\nR\3S\3S\3S\3S\3S\3S\7"+
		"S\u0500\nS\fS\16S\u0503\13S\3T\3T\5T\u0507\nT\3U\3U\3U\5U\u050c\nU\3V"+
		"\3V\3W\3W\3X\3X\3Y\3Y\3Y\3Y\3Y\3Y\7Y\u051a\nY\fY\16Y\u051d\13Y\3Z\3Z\5"+
		"Z\u0521\nZ\3Z\5Z\u0524\nZ\3[\3[\5[\u0528\n[\3\\\3\\\3\\\5\\\u052d\n\\"+
		"\3]\3]\3]\3^\3^\5^\u0534\n^\3_\3_\3_\3_\3_\3_\3_\3_\3_\7_\u053f\n_\f_"+
		"\16_\u0542\13_\3`\3`\3`\3`\3`\3`\3`\7`\u054b\n`\f`\16`\u054e\13`\3a\3"+
		"a\3a\3a\3a\5a\u0555\na\3b\3b\3b\3b\3b\3b\3b\7b\u055e\nb\fb\16b\u0561\13"+
		"b\3c\3c\5c\u0565\nc\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\5d\u0571\nd\3e\3e\5"+
		"e\u0575\ne\3f\3f\3f\3f\3f\3f\7f\u057d\nf\ff\16f\u0580\13f\3g\3g\3g\3h"+
		"\3h\5h\u0587\nh\3i\3i\3i\3i\5i\u058d\ni\3i\3i\3i\7i\u0592\ni\fi\16i\u0595"+
		"\13i\3i\3i\5i\u0599\ni\3j\3j\3j\3j\3j\3j\7j\u05a1\nj\fj\16j\u05a4\13j"+
		"\3k\3k\3k\3k\5k\u05aa\nk\3l\3l\3l\3l\3l\3l\3l\7l\u05b3\nl\fl\16l\u05b6"+
		"\13l\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\5m\u05c2\nm\3n\3n\5n\u05c6\nn\3n\5"+
		"n\u05c9\nn\3o\3o\5o\u05cd\no\3o\5o\u05d0\no\3p\3p\3p\3p\3p\3p\3p\7p\u05d9"+
		"\np\fp\16p\u05dc\13p\3q\3q\3q\3q\3q\3q\3q\7q\u05e5\nq\fq\16q\u05e8\13"+
		"q\3r\3r\3r\3r\3r\3r\3r\7r\u05f1\nr\fr\16r\u05f4\13r\3s\3s\3s\3s\3s\3s"+
		"\3s\7s\u05fd\ns\fs\16s\u0600\13s\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3"+
		"t\3t\5t\u0610\nt\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\5u\u061f\nu\3"+
		"v\3v\3v\3v\3v\3v\7v\u0627\nv\fv\16v\u062a\13v\3w\3w\3w\3w\5w\u0630\nw"+
		"\3x\3x\3y\3y\3y\3y\3z\3z\5z\u063a\nz\3{\3{\3{\3{\3{\5{\u0641\n{\3|\3|"+
		"\5|\u0645\n|\3|\3|\3}\3}\5}\u064b\n}\3}\3}\3~\3~\3~\3~\3~\3~\7~\u0655"+
		"\n~\f~\16~\u0658\13~\3\177\3\177\3\177\3\177\3\177\3\177\7\177\u0660\n"+
		"\177\f\177\16\177\u0663\13\177\3\u0080\3\u0080\3\u0080\3\u0080\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\5\u0081"+
		"\u0672\n\u0081\3\u0082\3\u0082\3\u0082\3\u0082\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\7\u0083\u067d\n\u0083\f\u0083\16\u0083\u0680\13\u0083"+
		"\3\u0084\3\u0084\3\u0084\3\u0084\5\u0084\u0686\n\u0084\3\u0085\3\u0085"+
		"\3\u0085\3\u0085\3\u0085\3\u0085\5\u0085\u068e\n\u0085\3\u0086\3\u0086"+
		"\3\u0086\3\u0087\3\u0087\3\u0087\3\u0088\3\u0088\3\u0088\3\u0089\3\u0089"+
		"\3\u008a\3\u008a\3\u008b\3\u008b\3\u008c\3\u008c\3\u008d\3\u008d\3\u008e"+
		"\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\5\u008e\u06aa\n\u008e"+
		"\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\7\u008f\u06b1\n\u008f\f\u008f"+
		"\16\u008f\u06b4\13\u008f\3\u0090\3\u0090\3\u0090\3\u0090\5\u0090\u06ba"+
		"\n\u0090\3\u0091\3\u0091\3\u0091\5\u0091\u06bf\n\u0091\3\u0092\3\u0092"+
		"\3\u0092\5\u0092\u06c4\n\u0092\3\u0092\3\u0092\3\u0093\3\u0093\3\u0093"+
		"\3\u0093\3\u0093\3\u0093\7\u0093\u06ce\n\u0093\f\u0093\16\u0093\u06d1"+
		"\13\u0093\3\u0094\3\u0094\3\u0094\3\u0094\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\7\u0096\u06e1\n\u0096"+
		"\f\u0096\16\u0096\u06e4\13\u0096\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097"+
		"\5\u0097\u06eb\n\u0097\3\u0098\3\u0098\3\u0099\3\u0099\3\u0099\5\u0099"+
		"\u06f2\n\u0099\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\7\u009a\u06f9\n"+
		"\u009a\f\u009a\16\u009a\u06fc\13\u009a\3\u009b\3\u009b\3\u009b\3\u009b"+
		"\5\u009b\u0702\n\u009b\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c"+
		"\5\u009c\u070a\n\u009c\3\u009d\3\u009d\3\u009d\5\u009d\u070f\n\u009d\3"+
		"\u009d\3\u009d\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\5\u009e"+
		"\u0719\n\u009e\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\7\u009f"+
		"\u0721\n\u009f\f\u009f\16\u009f\u0724\13\u009f\3\u00a0\3\u00a0\3\u00a0"+
		"\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\7\u00a0"+
		"\u0731\n\u00a0\f\u00a0\16\u00a0\u0734\13\u00a0\3\u00a1\3\u00a1\3\u00a1"+
		"\3\u00a1\3\u00a2\3\u00a2\3\u00a2\5\u00a2\u073d\n\u00a2\3\u00a2\3\u00a2"+
		"\3\u00a2\7\u00a2\u0742\n\u00a2\f\u00a2\16\u00a2\u0745\13\u00a2\3\u00a3"+
		"\3\u00a3\3\u00a3\3\u00a3\3\u00a3\5\u00a3\u074c\n\u00a3\3\u00a4\3\u00a4"+
		"\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\5\u00a5\u0757"+
		"\n\u00a5\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\7\u00a6\u075e\n\u00a6"+
		"\f\u00a6\16\u00a6\u0761\13\u00a6\3\u00a7\3\u00a7\3\u00a7\3\u00a7\5\u00a7"+
		"\u0767\n\u00a7\3\u00a8\3\u00a8\3\u00a9\3\u00a9\3\u00a9\5\u00a9\u076e\n"+
		"\u00a9\3\u00aa\3\u00aa\3\u00aa\5\u00aa\u0773\n\u00aa\3\u00aa\3\u00aa\3"+
		"\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\7\u00ab\u077d\n\u00ab\f"+
		"\u00ab\16\u00ab\u0780\13\u00ab\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ad"+
		"\3\u00ad\3\u00ad\3\u00ad\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae"+
		"\7\u00ae\u0790\n\u00ae\f\u00ae\16\u00ae\u0793\13\u00ae\3\u00af\3\u00af"+
		"\3\u00af\3\u00af\3\u00af\7\u00af\u079a\n\u00af\f\u00af\16\u00af\u079d"+
		"\13\u00af\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\5\u00b0\u07a4\n\u00b0"+
		"\3\u00b1\3\u00b1\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2"+
		"\5\u00b2\u07af\n\u00b2\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\7\u00b3"+
		"\u07b6\n\u00b3\f\u00b3\16\u00b3\u07b9\13\u00b3\3\u00b4\3\u00b4\3\u00b4"+
		"\3\u00b4\5\u00b4\u07bf\n\u00b4\3\u00b5\3\u00b5\3\u00b6\3\u00b6\3\u00b6"+
		"\5\u00b6\u07c6\n\u00b6\3\u00b7\3\u00b7\3\u00b7\5\u00b7\u07cb\n\u00b7\3"+
		"\u00b7\3\u00b7\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\7\u00b8"+
		"\u07d5\n\u00b8\f\u00b8\16\u00b8\u07d8\13\u00b8\3\u00b9\3\u00b9\3\u00b9"+
		"\3\u00b9\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00bb\3\u00bb\3\u00bb\5\u00bb"+
		"\u07e5\n\u00bb\3\u00bb\3\u00bb\3\u00bb\7\u00bb\u07ea\n\u00bb\f\u00bb\16"+
		"\u00bb\u07ed\13\u00bb\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\5\u00bc"+
		"\u07f4\n\u00bc\3\u00bd\3\u00bd\3\u00bd\2+\36\64HRV`~\u0086\u0088\u008a"+
		"\u0092\u0096\u00a4\u00b0\u00bc\u00be\u00c2\u00d2\u00d6\u00de\u00e0\u00e2"+
		"\u00e4\u00ea\u00fa\u00fc\u0104\u011c\u0124\u012a\u0132\u013c\u013e\u0142"+
		"\u014a\u0154\u015a\u015c\u0164\u016e\u0174\u00be\2\4\6\b\n\f\16\20\22"+
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
		"\u016e\u0170\u0172\u0174\u0176\u0178\2\n\3\2KL\3\2!\"\4\2{{\u0081\u0081"+
		"\4\2&&hh\t\2\63;vv{{\u0080\u0081\u0089\u0089\u008e\u0090\u0092\u0092\b"+
		"\2\63;vv{{\u0080\u0081\u0089\u0089\u008e\u0090\7\2\63;vv\u0080\u0080\u0089"+
		"\u0089\u008e\u0092\7\2\63;vv\u0080\u0080\u0089\u0089\u008e\u0090\u084d"+
		"\2\u017a\3\2\2\2\4\u018b\3\2\2\2\6\u0195\3\2\2\2\b\u0199\3\2\2\2\n\u01a0"+
		"\3\2\2\2\f\u01ad\3\2\2\2\16\u01c1\3\2\2\2\20\u01ce\3\2\2\2\22\u01d0\3"+
		"\2\2\2\24\u01df\3\2\2\2\26\u01e9\3\2\2\2\30\u01f3\3\2\2\2\32\u0205\3\2"+
		"\2\2\34\u0217\3\2\2\2\36\u021f\3\2\2\2 \u022b\3\2\2\2\"\u022d\3\2\2\2"+
		"$\u0239\3\2\2\2&\u0249\3\2\2\2(\u025a\3\2\2\2*\u026d\3\2\2\2,\u026f\3"+
		"\2\2\2.\u028b\3\2\2\2\60\u028d\3\2\2\2\62\u0299\3\2\2\2\64\u029b\3\2\2"+
		"\2\66\u02ab\3\2\2\28\u02ad\3\2\2\2:\u02b4\3\2\2\2<\u02bb\3\2\2\2>\u02db"+
		"\3\2\2\2@\u02dd\3\2\2\2B\u02ea\3\2\2\2D\u02f3\3\2\2\2F\u02fa\3\2\2\2H"+
		"\u030e\3\2\2\2J\u0326\3\2\2\2L\u0329\3\2\2\2N\u035a\3\2\2\2P\u035c\3\2"+
		"\2\2R\u0372\3\2\2\2T\u03d7\3\2\2\2V\u03d9\3\2\2\2X\u03e9\3\2\2\2Z\u03f8"+
		"\3\2\2\2\\\u03fa\3\2\2\2^\u03fd\3\2\2\2`\u040b\3\2\2\2b\u0415\3\2\2\2"+
		"d\u0419\3\2\2\2f\u041d\3\2\2\2h\u0422\3\2\2\2j\u0429\3\2\2\2l\u0435\3"+
		"\2\2\2n\u0441\3\2\2\2p\u0443\3\2\2\2r\u044a\3\2\2\2t\u044e\3\2\2\2v\u0453"+
		"\3\2\2\2x\u045c\3\2\2\2z\u0461\3\2\2\2|\u0464\3\2\2\2~\u0469\3\2\2\2\u0080"+
		"\u047a\3\2\2\2\u0082\u047c\3\2\2\2\u0084\u0480\3\2\2\2\u0086\u0482\3\2"+
		"\2\2\u0088\u048e\3\2\2\2\u008a\u049a\3\2\2\2\u008c\u04af\3\2\2\2\u008e"+
		"\u04b1\3\2\2\2\u0090\u04b7\3\2\2\2\u0092\u04bd\3\2\2\2\u0094\u04c8\3\2"+
		"\2\2\u0096\u04ce\3\2\2\2\u0098\u04e0\3\2\2\2\u009a\u04ec\3\2\2\2\u009c"+
		"\u04ee\3\2\2\2\u009e\u04f0\3\2\2\2\u00a0\u04f2\3\2\2\2\u00a2\u04f7\3\2"+
		"\2\2\u00a4\u04f9\3\2\2\2\u00a6\u0506\3\2\2\2\u00a8\u050b\3\2\2\2\u00aa"+
		"\u050d\3\2\2\2\u00ac\u050f\3\2\2\2\u00ae\u0511\3\2\2\2\u00b0\u0513\3\2"+
		"\2\2\u00b2\u0523\3\2\2\2\u00b4\u0527\3\2\2\2\u00b6\u0529\3\2\2\2\u00b8"+
		"\u052e\3\2\2\2\u00ba\u0533\3\2\2\2\u00bc\u0535\3\2\2\2\u00be\u0543\3\2"+
		"\2\2\u00c0\u0554\3\2\2\2\u00c2\u0556\3\2\2\2\u00c4\u0564\3\2\2\2\u00c6"+
		"\u0570\3\2\2\2\u00c8\u0572\3\2\2\2\u00ca\u0576\3\2\2\2\u00cc\u0581\3\2"+
		"\2\2\u00ce\u0584\3\2\2\2\u00d0\u0588\3\2\2\2\u00d2\u059a\3\2\2\2\u00d4"+
		"\u05a9\3\2\2\2\u00d6\u05ab\3\2\2\2\u00d8\u05c1\3\2\2\2\u00da\u05c3\3\2"+
		"\2\2\u00dc\u05ca\3\2\2\2\u00de\u05d1\3\2\2\2\u00e0\u05dd\3\2\2\2\u00e2"+
		"\u05e9\3\2\2\2\u00e4\u05f5\3\2\2\2\u00e6\u060f\3\2\2\2\u00e8\u061e\3\2"+
		"\2\2\u00ea\u0620\3\2\2\2\u00ec\u062f\3\2\2\2\u00ee\u0631\3\2\2\2\u00f0"+
		"\u0633\3\2\2\2\u00f2\u0639\3\2\2\2\u00f4\u0640\3\2\2\2\u00f6\u0642\3\2"+
		"\2\2\u00f8\u0648\3\2\2\2\u00fa\u064e\3\2\2\2\u00fc\u0659\3\2\2\2\u00fe"+
		"\u0664\3\2\2\2\u0100\u0671\3\2\2\2\u0102\u0673\3\2\2\2\u0104\u0677\3\2"+
		"\2\2\u0106\u0685\3\2\2\2\u0108\u068d\3\2\2\2\u010a\u068f\3\2\2\2\u010c"+
		"\u0692\3\2\2\2\u010e\u0695\3\2\2\2\u0110\u0698\3\2\2\2\u0112\u069a\3\2"+
		"\2\2\u0114\u069c\3\2\2\2\u0116\u069e\3\2\2\2\u0118\u06a0\3\2\2\2\u011a"+
		"\u06a9\3\2\2\2\u011c\u06ab\3\2\2\2\u011e\u06b9\3\2\2\2\u0120\u06be\3\2"+
		"\2\2\u0122\u06c0\3\2\2\2\u0124\u06c7\3\2\2\2\u0126\u06d2\3\2\2\2\u0128"+
		"\u06d6\3\2\2\2\u012a\u06da\3\2\2\2\u012c\u06ea\3\2\2\2\u012e\u06ec\3\2"+
		"\2\2\u0130\u06f1\3\2\2\2\u0132\u06f3\3\2\2\2\u0134\u0701\3\2\2\2\u0136"+
		"\u0709\3\2\2\2\u0138\u070b\3\2\2\2\u013a\u0718\3\2\2\2\u013c\u071a\3\2"+
		"\2\2\u013e\u0725\3\2\2\2\u0140\u0735\3\2\2\2\u0142\u073c\3\2\2\2\u0144"+
		"\u074b\3\2\2\2\u0146\u074d\3\2\2\2\u0148\u0756\3\2\2\2\u014a\u0758\3\2"+
		"\2\2\u014c\u0766\3\2\2\2\u014e\u0768\3\2\2\2\u0150\u076d\3\2\2\2\u0152"+
		"\u076f\3\2\2\2\u0154\u0776\3\2\2\2\u0156\u0781\3\2\2\2\u0158\u0785\3\2"+
		"\2\2\u015a\u0789\3\2\2\2\u015c\u0794\3\2\2\2\u015e\u07a3\3\2\2\2\u0160"+
		"\u07a5\3\2\2\2\u0162\u07ae\3\2\2\2\u0164\u07b0\3\2\2\2\u0166\u07be\3\2"+
		"\2\2\u0168\u07c0\3\2\2\2\u016a\u07c5\3\2\2\2\u016c\u07c7\3\2\2\2\u016e"+
		"\u07ce\3\2\2\2\u0170\u07d9\3\2\2\2\u0172\u07dd\3\2\2\2\u0174\u07e4\3\2"+
		"\2\2\u0176\u07f3\3\2\2\2\u0178\u07f5\3\2\2\2\u017a\u017b\7V\2\2\u017b"+
		"\u017c\5\u00acW\2\u017c\u0183\7\25\2\2\u017d\u0180\5\u00acW\2\u017e\u017f"+
		"\7\22\2\2\u017f\u0181\5 \21\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2"+
		"\u0181\u0184\3\2\2\2\u0182\u0184\5 \21\2\u0183\u017d\3\2\2\2\u0183\u0182"+
		"\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186\7\26\2\2\u0186\u0187\7\20\2\2"+
		"\u0187\u0188\5v<\2\u0188\u0189\5\u0088E\2\u0189\u018a\5x=\2\u018a\3\3"+
		"\2\2\2\u018b\u018c\7V\2\2\u018c\u018d\5\u00acW\2\u018d\u018e\7\25\2\2"+
		"\u018e\u018f\5\u009aN\2\u018f\u0190\7\26\2\2\u0190\u0191\7\20\2\2\u0191"+
		"\u0192\5v<\2\u0192\u0193\5\u0086D\2\u0193\u0194\5x=\2\u0194\5\3\2\2\2"+
		"\u0195\u0196\5\u00aeX\2\u0196\u0197\7,\2\2\u0197\u0198\5R*\2\u0198\7\3"+
		"\2\2\2\u0199\u019a\5\u00aeX\2\u019a\u019c\7\25\2\2\u019b\u019d\5`\61\2"+
		"\u019c\u019b\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019f"+
		"\7\26\2\2\u019f\t\3\2\2\2\u01a0\u01a1\7E\2\2\u01a1\u01a2\5\u00aaV\2\u01a2"+
		"\u01a3\7\25\2\2\u01a3\u01a4\5\u0096L\2\u01a4\u01a5\7\26\2\2\u01a5\u01a6"+
		"\7\20\2\2\u01a6\u01a9\5v<\2\u01a7\u01aa\5\u008cG\2\u01a8\u01aa\7t\2\2"+
		"\u01a9\u01a7\3\2\2\2\u01a9\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ac"+
		"\5x=\2\u01ac\13\3\2\2\2\u01ad\u01ae\t\2\2\2\u01ae\u01af\5\u00acW\2\u01af"+
		"\u01b6\7\25\2\2\u01b0\u01b7\5\20\t\2\u01b1\u01b7\5 \21\2\u01b2\u01b3\5"+
		"\20\t\2\u01b3\u01b4\7\22\2\2\u01b4\u01b5\5 \21\2\u01b5\u01b7\3\2\2\2\u01b6"+
		"\u01b0\3\2\2\2\u01b6\u01b1\3\2\2\2\u01b6\u01b2\3\2\2\2\u01b7\u01b8\3\2"+
		"\2\2\u01b8\u01b9\7\26\2\2\u01b9\u01ba\7\20\2\2\u01ba\u01bd\5v<\2\u01bb"+
		"\u01be\5\u00be`\2\u01bc\u01be\7t\2\2\u01bd\u01bb\3\2\2\2\u01bd\u01bc\3"+
		"\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c0\5x=\2\u01c0\r\3\2\2\2\u01c1\u01c2"+
		"\7}\2\2\u01c2\u01c3\5\u00acW\2\u01c3\u01c4\7\25\2\2\u01c4\u01c5\5 \21"+
		"\2\u01c5\u01c6\7\26\2\2\u01c6\u01c7\7\20\2\2\u01c7\u01ca\5v<\2\u01c8\u01cb"+
		"\5\u00be`\2\u01c9\u01cb\7t\2\2\u01ca\u01c8\3\2\2\2\u01ca\u01c9\3\2\2\2"+
		"\u01cb\u01cc\3\2\2\2\u01cc\u01cd\5x=\2\u01cd\17\3\2\2\2\u01ce\u01cf\5"+
		"\u00a4S\2\u01cf\21\3\2\2\2\u01d0\u01d1\7O\2\2\u01d1\u01d2\7q\2\2\u01d2"+
		"\u01d3\5\u0108\u0085\2\u01d3\u01d4\7\25\2\2\u01d4\u01d5\5\u00b4[\2\u01d5"+
		"\u01d8\7\26\2\2\u01d6\u01d7\7\62\2\2\u01d7\u01d9\5\u0096L\2\u01d8\u01d6"+
		"\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01db\7\20\2\2"+
		"\u01db\u01dc\5v<\2\u01dc\u01dd\5\u00dep\2\u01dd\u01de\5x=\2\u01de\23\3"+
		"\2\2\2\u01df\u01e0\7O\2\2\u01e0\u01e1\5\u00aaV\2\u01e1\u01e2\7|\2\2\u01e2"+
		"\u01e3\7\25\2\2\u01e3\u01e4\7\26\2\2\u01e4\u01e5\7\20\2\2\u01e5\u01e6"+
		"\5v<\2\u01e6\u01e7\5\u00dep\2\u01e7\u01e8\5x=\2\u01e8\25\3\2\2\2\u01e9"+
		"\u01ea\7O\2\2\u01ea\u01eb\5\u00aaV\2\u01eb\u01ec\7`\2\2\u01ec\u01ed\7"+
		"\25\2\2\u01ed\u01ee\7\26\2\2\u01ee\u01ef\7\20\2\2\u01ef\u01f0\5v<\2\u01f0"+
		"\u01f1\5\u00dep\2\u01f1\u01f2\5x=\2\u01f2\27\3\2\2\2\u01f3\u01f4\7j\2"+
		"\2\u01f4\u01f5\t\2\2\2\u01f5\u01f6\5\u00acW\2\u01f6\u01f8\7\25\2\2\u01f7"+
		"\u01f9\5 \21\2\u01f8\u01f7\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fa\3\2"+
		"\2\2\u01fa\u01fb\7\26\2\2\u01fb\u01fc\7\20\2\2\u01fc\u01fd\5v<\2\u01fd"+
		"\u0201\5\34\17\2\u01fe\u01ff\5t;\2\u01ff\u0200\5\u00c2b\2\u0200\u0202"+
		"\3\2\2\2\u0201\u01fe\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0203\3\2\2\2\u0203"+
		"\u0204\5x=\2\u0204\31\3\2\2\2\u0205\u0206\7j\2\2\u0206\u0207\7x\2\2\u0207"+
		"\u0208\5\u00acW\2\u0208\u020a\7\25\2\2\u0209\u020b\5 \21\2\u020a\u0209"+
		"\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020d\7\26\2\2"+
		"\u020d\u020e\7\20\2\2\u020e\u020f\5v<\2\u020f\u0213\5\34\17\2\u0210\u0211"+
		"\5t;\2\u0211\u0212\5\u00c2b\2\u0212\u0214\3\2\2\2\u0213\u0210\3\2\2\2"+
		"\u0213\u0214\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0216\5x=\2\u0216\33\3"+
		"\2\2\2\u0217\u0218\7O\2\2\u0218\u0219\t\2\2\2\u0219\u021a\7H\2\2\u021a"+
		"\u021b\7\20\2\2\u021b\u021c\5v<\2\u021c\u021d\5\36\20\2\u021d\u021e\5"+
		"x=\2\u021e\35\3\2\2\2\u021f\u0220\b\20\1\2\u0220\u0221\5\u00c6d\2\u0221"+
		"\u0228\3\2\2\2\u0222\u0223\f\3\2\2\u0223\u0224\5t;\2\u0224\u0225\5\u00c6"+
		"d\2\u0225\u0227\3\2\2\2\u0226\u0222\3\2\2\2\u0227\u022a\3\2\2\2\u0228"+
		"\u0226\3\2\2\2\u0228\u0229\3\2\2\2\u0229\37\3\2\2\2\u022a\u0228\3\2\2"+
		"\2\u022b\u022c\5\u00d2j\2\u022c!\3\2\2\2\u022d\u022e\7?\2\2\u022e\u022f"+
		"\7O\2\2\u022f\u0230\5\u00a6T\2\u0230\u0232\7\25\2\2\u0231\u0233\5\u00b0"+
		"Y\2\u0232\u0231\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0234\3\2\2\2\u0234"+
		"\u0237\7\26\2\2\u0235\u0236\7\62\2\2\u0236\u0238\5\u0096L\2\u0237\u0235"+
		"\3\2\2\2\u0237\u0238\3\2\2\2\u0238#\3\2\2\2\u0239\u023a\7O\2\2\u023a\u023b"+
		"\5\u00a6T\2\u023b\u023d\7\25\2\2\u023c\u023e\5\u00b0Y\2\u023d\u023c\3"+
		"\2\2\2\u023d\u023e\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0242\7\26\2\2\u0240"+
		"\u0241\7\62\2\2\u0241\u0243\5\u0096L\2\u0242\u0240\3\2\2\2\u0242\u0243"+
		"\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0245\7\20\2\2\u0245\u0246\5v<\2\u0246"+
		"\u0247\5\u00dep\2\u0247\u0248\5x=\2\u0248%\3\2\2\2\u0249\u024a\7O\2\2"+
		"\u024a\u024b\7j\2\2\u024b\u024c\5\u00a6T\2\u024c\u024e\7\25\2\2\u024d"+
		"\u024f\5\u00b0Y\2\u024e\u024d\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u0250"+
		"\3\2\2\2\u0250\u0253\7\26\2\2\u0251\u0252\7\62\2\2\u0252\u0254\5\u00ba"+
		"^\2\u0253\u0251\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0255\3\2\2\2\u0255"+
		"\u0256\7\20\2\2\u0256\u0257\5v<\2\u0257\u0258\5\u00d6l\2\u0258\u0259\5"+
		"x=\2\u0259\'\3\2\2\2\u025a\u025b\7O\2\2\u025b\u025c\7\u0080\2\2\u025c"+
		"\u025d\7\u0093\2\2\u025d\u025e\7\25\2\2\u025e\u025f\7\26\2\2\u025f\u0260"+
		"\7\20\2\2\u0260\u0261\5v<\2\u0261\u0262\5\u00dep\2\u0262\u0263\5x=\2\u0263"+
		"\u0264\5t;\2\u0264\u0265\7Z\2\2\u0265\u026b\7\20\2\2\u0266\u0267\5v<\2"+
		"\u0267\u0268\5\u00e0q\2\u0268\u0269\5x=\2\u0269\u026c\3\2\2\2\u026a\u026c"+
		"\5\u00aeX\2\u026b\u0266\3\2\2\2\u026b\u026a\3\2\2\2\u026c)\3\2\2\2\u026d"+
		"\u026e\5R*\2\u026e+\3\2\2\2\u026f\u0270\5\u00aaV\2\u0270\u0271\7\20\2"+
		"\2\u0271\u0276\5\u00ba^\2\u0272\u0273\7\25\2\2\u0273\u0274\5 \21\2\u0274"+
		"\u0275\7\26\2\2\u0275\u0277\3\2\2\2\u0276\u0272\3\2\2\2\u0276\u0277\3"+
		"\2\2\2\u0277\u027a\3\2\2\2\u0278\u0279\7,\2\2\u0279\u027b\5\u00f2z\2\u027a"+
		"\u0278\3\2\2\2\u027a\u027b\3\2\2\2\u027b-\3\2\2\2\u027c\u028c\5\60\31"+
		"\2\u027d\u028c\5l\67\2\u027e\u028c\5p9\2\u027f\u028c\5P)\2\u0280\u028c"+
		"\5F$\2\u0281\u028c\5<\37\2\u0282\u028c\5@!\2\u0283\u028c\5D#\2\u0284\u028c"+
		"\5B\"\2\u0285\u028c\5J&\2\u0286\u028c\5L\'\2\u0287\u028c\5f\64\2\u0288"+
		"\u028c\58\35\2\u0289\u028c\5:\36\2\u028a\u028c\5$\23\2\u028b\u027c\3\2"+
		"\2\2\u028b\u027d\3\2\2\2\u028b\u027e\3\2\2\2\u028b\u027f\3\2\2\2\u028b"+
		"\u0280\3\2\2\2\u028b\u0281\3\2\2\2\u028b\u0282\3\2\2\2\u028b\u0283\3\2"+
		"\2\2\u028b\u0284\3\2\2\2\u028b\u0285\3\2\2\2\u028b\u0286\3\2\2\2\u028b"+
		"\u0287\3\2\2\2\u028b\u0288\3\2\2\2\u028b\u0289\3\2\2\2\u028b\u028a\3\2"+
		"\2\2\u028c/\3\2\2\2\u028d\u028e\5\62\32\2\u028e\u0290\7\25\2\2\u028f\u0291"+
		"\5`\61\2\u0290\u028f\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u0292\3\2\2\2\u0292"+
		"\u0293\7\26\2\2\u0293\61\3\2\2\2\u0294\u029a\5\u00a6T\2\u0295\u0296\5"+
		"\64\33\2\u0296\u0297\7\24\2\2\u0297\u0298\5\u00a6T\2\u0298\u029a\3\2\2"+
		"\2\u0299\u0294\3\2\2\2\u0299\u0295\3\2\2\2\u029a\63\3\2\2\2\u029b\u029c"+
		"\b\33\1\2\u029c\u029d\5\u00a8U\2\u029d\u02a2\3\2\2\2\u029e\u029f\f\3\2"+
		"\2\u029f\u02a1\5\66\34\2\u02a0\u029e\3\2\2\2\u02a1\u02a4\3\2\2\2\u02a2"+
		"\u02a0\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\65\3\2\2\2\u02a4\u02a2\3\2\2"+
		"\2\u02a5\u02a6\7\24\2\2\u02a6\u02ac\5\u00aaV\2\u02a7\u02a8\7\27\2\2\u02a8"+
		"\u02a9\5R*\2\u02a9\u02aa\7\30\2\2\u02aa\u02ac\3\2\2\2\u02ab\u02a5\3\2"+
		"\2\2\u02ab\u02a7\3\2\2\2\u02ac\67\3\2\2\2\u02ad\u02ae\7\u0085\2\2\u02ae"+
		"\u02af\5\u0102\u0082\2\u02af\u02b0\7\20\2\2\u02b0\u02b1\5v<\2\u02b1\u02b2"+
		"\5\u00dep\2\u02b2\u02b3\5x=\2\u02b39\3\2\2\2\u02b4\u02b5\7\u0085\2\2\u02b5"+
		"\u02b6\5\u00acW\2\u02b6\u02b7\7\20\2\2\u02b7\u02b8\5v<\2\u02b8\u02b9\5"+
		"\u00dep\2\u02b9\u02ba\5x=\2\u02ba;\3\2\2\2\u02bb\u02bc\7\177\2\2\u02bc"+
		"\u02bd\7o\2\2\u02bd\u02be\5R*\2\u02be\u02bf\7\20\2\2\u02bf\u02c0\5v<\2"+
		"\u02c0\u02c8\5\u00e2r\2\u02c1\u02c2\5t;\2\u02c2\u02c3\7s\2\2\u02c3\u02c4"+
		"\7\20\2\2\u02c4\u02c5\5v<\2\u02c5\u02c6\5\u00dep\2\u02c6\u02c7\5x=\2\u02c7"+
		"\u02c9\3\2\2\2\u02c8\u02c1\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9\u02ca\3\2"+
		"\2\2\u02ca\u02cb\5x=\2\u02cb=\3\2\2\2\u02cc\u02cd\7\u0086\2\2\u02cd\u02ce"+
		"\5\u00e8u\2\u02ce\u02cf\7\20\2\2\u02cf\u02d0\5v<\2\u02d0\u02d1\5\u00de"+
		"p\2\u02d1\u02d2\5x=\2\u02d2\u02dc\3\2\2\2\u02d3\u02d4\7\u0086\2\2\u02d4"+
		"\u02d5\7b\2\2\u02d5\u02d6\5\u00e6t\2\u02d6\u02d7\7\20\2\2\u02d7\u02d8"+
		"\5v<\2\u02d8\u02d9\5\u00dep\2\u02d9\u02da\5x=\2\u02da\u02dc\3\2\2\2\u02db"+
		"\u02cc\3\2\2\2\u02db\u02d3\3\2\2\2\u02dc?\3\2\2\2\u02dd\u02de\7^\2\2\u02de"+
		"\u02e1\5\u00aaV\2\u02df\u02e0\7\22\2\2\u02e0\u02e2\5\u00aaV\2\u02e1\u02df"+
		"\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e4\7b\2\2\u02e4"+
		"\u02e5\5R*\2\u02e5\u02e6\7\20\2\2\u02e6\u02e7\5v<\2\u02e7\u02e8\5\u00de"+
		"p\2\u02e8\u02e9\5x=\2\u02e9A\3\2\2\2\u02ea\u02eb\7R\2\2\u02eb\u02ec\7"+
		"\20\2\2\u02ec\u02ed\5v<\2\u02ed\u02ee\5\u00dep\2\u02ee\u02ef\5x=\2\u02ef"+
		"\u02f0\5t;\2\u02f0\u02f1\7\u0088\2\2\u02f1\u02f2\5R*\2\u02f2C\3\2\2\2"+
		"\u02f3\u02f4\7\u0088\2\2\u02f4\u02f5\5R*\2\u02f5\u02f6\7\20\2\2\u02f6"+
		"\u02f7\5v<\2\u02f7\u02f8\5\u00dep\2\u02f8\u02f9\5x=\2\u02f9E\3\2\2\2\u02fa"+
		"\u02fb\7a\2\2\u02fb\u02fc\5R*\2\u02fc\u02fd\7\20\2\2\u02fd\u02fe\5v<\2"+
		"\u02fe\u02ff\5\u00dep\2\u02ff\u0303\5x=\2\u0300\u0301\5t;\2\u0301\u0302"+
		"\5H%\2\u0302\u0304\3\2\2\2\u0303\u0300\3\2\2\2\u0303\u0304\3\2\2\2\u0304"+
		"\u030c\3\2\2\2\u0305\u0306\5t;\2\u0306\u0307\7U\2\2\u0307\u0308\7\20\2"+
		"\2\u0308\u0309\5v<\2\u0309\u030a\5\u00dep\2\u030a\u030b\5x=\2\u030b\u030d"+
		"\3\2\2\2\u030c\u0305\3\2\2\2\u030c\u030d\3\2\2\2\u030dG\3\2\2\2\u030e"+
		"\u030f\b%\1\2\u030f\u0310\7U\2\2\u0310\u0311\7a\2\2\u0311\u0312\5R*\2"+
		"\u0312\u0313\7\20\2\2\u0313\u0314\5v<\2\u0314\u0315\5\u00dep\2\u0315\u0316"+
		"\5x=\2\u0316\u0323\3\2\2\2\u0317\u0318\f\3\2\2\u0318\u0319\5t;\2\u0319"+
		"\u031a\7U\2\2\u031a\u031b\7a\2\2\u031b\u031c\5R*\2\u031c\u031d\7\20\2"+
		"\2\u031d\u031e\5v<\2\u031e\u031f\5\u00dep\2\u031f\u0320\5x=\2\u0320\u0322"+
		"\3\2\2\2\u0321\u0317\3\2\2\2\u0322\u0325\3\2\2\2\u0323\u0321\3\2\2\2\u0323"+
		"\u0324\3\2\2\2\u0324I\3\2\2\2\u0325\u0323\3\2\2\2\u0326\u0327\7u\2\2\u0327"+
		"\u0328\5R*\2\u0328K\3\2\2\2\u0329\u032a\7\u0084\2\2\u032a\u032b\5\u00aa"+
		"V\2\u032b\u032c\7\20\2\2\u032c\u032d\5v<\2\u032d\u032e\5\u00dep\2\u032e"+
		"\u032f\5x=\2\u032f\u0331\5r:\2\u0330\u0332\5\u00e4s\2\u0331\u0330\3\2"+
		"\2\2\u0331\u0332\3\2\2\2\u0332\u033a\3\2\2\2\u0333\u0334\7X\2\2\u0334"+
		"\u0335\7\20\2\2\u0335\u0336\5v<\2\u0336\u0337\5\u00dep\2\u0337\u0338\5"+
		"x=\2\u0338\u0339\5r:\2\u0339\u033b\3\2\2\2\u033a\u0333\3\2\2\2\u033a\u033b"+
		"\3\2\2\2\u033b\u0343\3\2\2\2\u033c\u033d\7]\2\2\u033d\u033e\7\20\2\2\u033e"+
		"\u033f\5v<\2\u033f\u0340\5\u00dep\2\u0340\u0341\5x=\2\u0341\u0342\5r:"+
		"\2\u0342\u0344\3\2\2\2\u0343\u033c\3\2\2\2\u0343\u0344\3\2\2\2\u0344\u0345"+
		"\3\2\2\2\u0345\u0346\5r:\2\u0346M\3\2\2\2\u0347\u0348\7X\2\2\u0348\u0349"+
		"\5\u00aeX\2\u0349\u034a\7\20\2\2\u034a\u034b\5v<\2\u034b\u034c\5\u00de"+
		"p\2\u034c\u034d\5x=\2\u034d\u034e\5r:\2\u034e\u035b\3\2\2\2\u034f\u0350"+
		"\7X\2\2\u0350\u0351\7b\2\2\u0351\u0352\7\27\2\2\u0352\u0353\5\u008aF\2"+
		"\u0353\u0354\7\30\2\2\u0354\u0355\7\20\2\2\u0355\u0356\5v<\2\u0356\u0357"+
		"\5\u00dep\2\u0357\u0358\5x=\2\u0358\u0359\5r:\2\u0359\u035b\3\2\2\2\u035a"+
		"\u0347\3\2\2\2\u035a\u034f\3\2\2\2\u035bO\3\2\2\2\u035c\u035e\7y\2\2\u035d"+
		"\u035f\5R*\2\u035e\u035d\3\2\2\2\u035e\u035f\3\2\2\2\u035fQ\3\2\2\2\u0360"+
		"\u0361\b*\1\2\u0361\u0362\7\"\2\2\u0362\u0373\5R*!\u0363\u0364\7l\2\2"+
		"\u0364\u0373\5R* \u0365\u0373\5V,\2\u0366\u0373\5X-\2\u0367\u0368\7=\2"+
		"\2\u0368\u0369\7\25\2\2\u0369\u036a\5R*\2\u036a\u036b\7\26\2\2\u036b\u0373"+
		"\3\2\2\2\u036c\u036d\7Y\2\2\u036d\u036e\7\25\2\2\u036e\u036f\5\u00aaV"+
		"\2\u036f\u0370\7\26\2\2\u0370\u0373\3\2\2\2\u0371\u0373\5T+\2\u0372\u0360"+
		"\3\2\2\2\u0372\u0363\3\2\2\2\u0372\u0365\3\2\2\2\u0372\u0366\3\2\2\2\u0372"+
		"\u0367\3\2\2\2\u0372\u036c\3\2\2\2\u0372\u0371\3\2\2\2\u0373\u03d4\3\2"+
		"\2\2\u0374\u0375\f\37\2\2\u0375\u0376\5\u0112\u008a\2\u0376\u0377\5R*"+
		" \u0377\u03d3\3\2\2\2\u0378\u0379\f\36\2\2\u0379\u037a\5\u0114\u008b\2"+
		"\u037a\u037b\5R*\37\u037b\u03d3\3\2\2\2\u037c\u037d\f\35\2\2\u037d\u037e"+
		"\5\u0118\u008d\2\u037e\u037f\5R*\36\u037f\u03d3\3\2\2\2\u0380\u0381\f"+
		"\34\2\2\u0381\u0382\5\u0116\u008c\2\u0382\u0383\5R*\35\u0383\u03d3\3\2"+
		"\2\2\u0384\u0385\f\33\2\2\u0385\u0386\t\3\2\2\u0386\u03d3\5R*\34\u0387"+
		"\u0388\f\32\2\2\u0388\u0389\7)\2\2\u0389\u03d3\5R*\33\u038a\u038b\f\31"+
		"\2\2\u038b\u038c\7*\2\2\u038c\u03d3\5R*\32\u038d\u038e\f\30\2\2\u038e"+
		"\u038f\7\'\2\2\u038f\u03d3\5R*\31\u0390\u0391\f\27\2\2\u0391\u0392\7("+
		"\2\2\u0392\u03d3\5R*\30\u0393\u0394\f\24\2\2\u0394\u0395\7.\2\2\u0395"+
		"\u03d3\5R*\25\u0396\u0397\f\23\2\2\u0397\u0398\7-\2\2\u0398\u03d3\5R*"+
		"\24\u0399\u039a\f\22\2\2\u039a\u039b\7/\2\2\u039b\u03d3\5R*\23\u039c\u039d"+
		"\f\21\2\2\u039d\u039e\7r\2\2\u039e\u03d3\5R*\22\u039f\u03a0\f\20\2\2\u03a0"+
		"\u03a1\7B\2\2\u03a1\u03d3\5R*\21\u03a2\u03a3\f\17\2\2\u03a3\u03a4\7a\2"+
		"\2\u03a4\u03a5\5R*\2\u03a5\u03a6\7U\2\2\u03a6\u03a7\5R*\20\u03a7\u03d3"+
		"\3\2\2\2\u03a8\u03a9\f\r\2\2\u03a9\u03aa\7b\2\2\u03aa\u03d3\5R*\16\u03ab"+
		"\u03ac\f\f\2\2\u03ac\u03ad\7N\2\2\u03ad\u03d3\5R*\r\u03ae\u03af\f\13\2"+
		"\2\u03af\u03b0\7N\2\2\u03b0\u03b1\7@\2\2\u03b1\u03d3\5R*\f\u03b2\u03b3"+
		"\f\n\2\2\u03b3\u03b4\7N\2\2\u03b4\u03b5\7C\2\2\u03b5\u03d3\5R*\13\u03b6"+
		"\u03b7\f\t\2\2\u03b7\u03b8\7l\2\2\u03b8\u03b9\7b\2\2\u03b9\u03d3\5R*\n"+
		"\u03ba\u03bb\f\b\2\2\u03bb\u03bc\7l\2\2\u03bc\u03bd\7N\2\2\u03bd\u03d3"+
		"\5R*\t\u03be\u03bf\f\7\2\2\u03bf\u03c0\7l\2\2\u03c0\u03c1\7N\2\2\u03c1"+
		"\u03c2\7@\2\2\u03c2\u03d3\5R*\b\u03c3\u03c4\f\6\2\2\u03c4\u03c5\7l\2\2"+
		"\u03c5\u03c6\7N\2\2\u03c6\u03c7\7C\2\2\u03c7\u03d3\5R*\7\u03c8\u03c9\f"+
		"\26\2\2\u03c9\u03ca\7d\2\2\u03ca\u03cb\7l\2\2\u03cb\u03d3\5\u0106\u0084"+
		"\2\u03cc\u03cd\f\25\2\2\u03cd\u03ce\7d\2\2\u03ce\u03d3\5\u0106\u0084\2"+
		"\u03cf\u03d0\f\16\2\2\u03d0\u03d1\7D\2\2\u03d1\u03d3\5\u00ba^\2\u03d2"+
		"\u0374\3\2\2\2\u03d2\u0378\3\2\2\2\u03d2\u037c\3\2\2\2\u03d2\u0380\3\2"+
		"\2\2\u03d2\u0384\3\2\2\2\u03d2\u0387\3\2\2\2\u03d2\u038a\3\2\2\2\u03d2"+
		"\u038d\3\2\2\2\u03d2\u0390\3\2\2\2\u03d2\u0393\3\2\2\2\u03d2\u0396\3\2"+
		"\2\2\u03d2\u0399\3\2\2\2\u03d2\u039c\3\2\2\2\u03d2\u039f\3\2\2\2\u03d2"+
		"\u03a2\3\2\2\2\u03d2\u03a8\3\2\2\2\u03d2\u03ab\3\2\2\2\u03d2\u03ae\3\2"+
		"\2\2\u03d2\u03b2\3\2\2\2\u03d2\u03b6\3\2\2\2\u03d2\u03ba\3\2\2\2\u03d2"+
		"\u03be\3\2\2\2\u03d2\u03c3\3\2\2\2\u03d2\u03c8\3\2\2\2\u03d2\u03cc\3\2"+
		"\2\2\u03d2\u03cf\3\2\2\2\u03d3\u03d6\3\2\2\2\u03d4\u03d2\3\2\2\2\u03d4"+
		"\u03d5\3\2\2\2\u03d5S\3\2\2\2\u03d6\u03d4\3\2\2\2\u03d7\u03d8\5\u00ac"+
		"W\2\u03d8U\3\2\2\2\u03d9\u03da\b,\1\2\u03da\u03db\5\u00ecw\2\u03db\u03e0"+
		"\3\2\2\2\u03dc\u03dd\f\3\2\2\u03dd\u03df\5Z.\2\u03de\u03dc\3\2\2\2\u03df"+
		"\u03e2\3\2\2\2\u03e0\u03de\3\2\2\2\u03e0\u03e1\3\2\2\2\u03e1W\3\2\2\2"+
		"\u03e2\u03e0\3\2\2\2\u03e3\u03ea\5\\/\2\u03e4\u03ea\5h\65\2\u03e5\u03ea"+
		"\5d\63\2\u03e6\u03ea\5j\66\2\u03e7\u03ea\5\60\31\2\u03e8\u03ea\5^\60\2"+
		"\u03e9\u03e3\3\2\2\2\u03e9\u03e4\3\2\2\2\u03e9\u03e5\3\2\2\2\u03e9\u03e6"+
		"\3\2\2\2\u03e9\u03e7\3\2\2\2\u03e9\u03e8\3\2\2\2\u03eaY\3\2\2\2\u03eb"+
		"\u03ec\6. \3\u03ec\u03ed\7\24\2\2\u03ed\u03f9\5\u00aaV\2\u03ee\u03ef\6"+
		".!\3\u03ef\u03f0\7\27\2\2\u03f0\u03f1\5\u0100\u0081\2\u03f1\u03f2\7\30"+
		"\2\2\u03f2\u03f9\3\2\2\2\u03f3\u03f4\6.\"\3\u03f4\u03f5\7\27\2\2\u03f5"+
		"\u03f6\5R*\2\u03f6\u03f7\7\30\2\2\u03f7\u03f9\3\2\2\2\u03f8\u03eb\3\2"+
		"\2\2\u03f8\u03ee\3\2\2\2\u03f8\u03f3\3\2\2\2\u03f9[\3\2\2\2\u03fa\u03fb"+
		"\5\u00a0Q\2\u03fb]\3\2\2\2\u03fc\u03fe\7i\2\2\u03fd\u03fc\3\2\2\2\u03fd"+
		"\u03fe\3\2\2\2\u03fe\u03ff\3\2\2\2\u03ff\u0400\5\u009cO\2\u0400\u0402"+
		"\7\25\2\2\u0401\u0403\5`\61\2\u0402\u0401\3\2\2\2\u0402\u0403\3\2\2\2"+
		"\u0403\u0404\3\2\2\2\u0404\u0405\7\26\2\2\u0405_\3\2\2\2\u0406\u0407\b"+
		"\61\1\2\u0407\u0408\5R*\2\u0408\u0409\6\61#\3\u0409\u040c\3\2\2\2\u040a"+
		"\u040c\5b\62\2\u040b\u0406\3\2\2\2\u040b\u040a\3\2\2\2\u040c\u0412\3\2"+
		"\2\2\u040d\u040e\f\3\2\2\u040e\u040f\7\22\2\2\u040f\u0411\5b\62\2\u0410"+
		"\u040d\3\2\2\2\u0411\u0414\3\2\2\2\u0412\u0410\3\2\2\2\u0412\u0413\3\2"+
		"\2\2\u0413a\3\2\2\2\u0414\u0412\3\2\2\2\u0415\u0416\5\u00aaV\2\u0416\u0417"+
		"\5\u0110\u0089\2\u0417\u0418\5R*\2\u0418c\3\2\2\2\u0419\u041a\7v\2\2\u041a"+
		"\u041b\7_\2\2\u041b\u041c\5R*\2\u041ce\3\2\2\2\u041d\u041e\7\u0089\2\2"+
		"\u041e\u041f\5R*\2\u041f\u0420\7\u0083\2\2\u0420\u0421\5R*\2\u0421g\3"+
		"\2\2\2\u0422\u0423\7\\\2\2\u0423\u0424\5\u00aaV\2\u0424\u0425\7_\2\2\u0425"+
		"\u0426\5R*\2\u0426\u0427\7\u0087\2\2\u0427\u0428\5R*\2\u0428i\3\2\2\2"+
		"\u0429\u042a\7~\2\2\u042a\u042b\7\25\2\2\u042b\u0431\5V,\2\u042c\u042d"+
		"\7\22\2\2\u042d\u042e\5\u010a\u0086\2\u042e\u042f\7,\2\2\u042f\u0430\5"+
		"V,\2\u0430\u0432\3\2\2\2\u0431\u042c\3\2\2\2\u0431\u0432\3\2\2\2\u0432"+
		"\u0433\3\2\2\2\u0433\u0434\7\26\2\2\u0434k\3\2\2\2\u0435\u0436\5\u0104"+
		"\u0083\2\u0436\u0437\5\u0110\u0089\2\u0437\u0438\5R*\2\u0438m\3\2\2\2"+
		"\u0439\u043a\68%\3\u043a\u043b\7\24\2\2\u043b\u0442\5\u00aaV\2\u043c\u043d"+
		"\68&\3\u043d\u043e\7\27\2\2\u043e\u043f\5R*\2\u043f\u0440\7\30\2\2\u0440"+
		"\u0442\3\2\2\2\u0441\u0439\3\2\2\2\u0441\u043c\3\2\2\2\u0442o\3\2\2\2"+
		"\u0443\u0444\5\u00d2j\2\u0444\u0445\5\u0110\u0089\2\u0445\u0446\5R*\2"+
		"\u0446q\3\2\2\2\u0447\u0449\7\7\2\2\u0448\u0447\3\2\2\2\u0449\u044c\3"+
		"\2\2\2\u044a\u0448\3\2\2\2\u044a\u044b\3\2\2\2\u044bs\3\2\2\2\u044c\u044a"+
		"\3\2\2\2\u044d\u044f\7\7\2\2\u044e\u044d\3\2\2\2\u044f\u0450\3\2\2\2\u0450"+
		"\u044e\3\2\2\2\u0450\u0451\3\2\2\2\u0451u\3\2\2\2\u0452\u0454\7\7\2\2"+
		"\u0453\u0452\3\2\2\2\u0454\u0455\3\2\2\2\u0455\u0453\3\2\2\2\u0455\u0456"+
		"\3\2\2\2\u0456\u0457\3\2\2\2\u0457\u0458\7\3\2\2\u0458w\3\2\2\2\u0459"+
		"\u045b\7\7\2\2\u045a\u0459\3\2\2\2\u045b\u045e\3\2\2\2\u045c\u045a\3\2"+
		"\2\2\u045c\u045d\3\2\2\2\u045d\u045f\3\2\2\2\u045e\u045c\3\2\2\2\u045f"+
		"\u0460\7\4\2\2\u0460y\3\2\2\2\u0461\u0462\7k\2\2\u0462{\3\2\2\2\u0463"+
		"\u0465\5~@\2\u0464\u0463\3\2\2\2\u0464\u0465\3\2\2\2\u0465\u0466\3\2\2"+
		"\2\u0466\u0467\5r:\2\u0467\u0468\7\2\2\3\u0468}\3\2\2\2\u0469\u046a\b"+
		"@\1\2\u046a\u046b\5\u0080A\2\u046b\u0472\3\2\2\2\u046c\u046d\f\3\2\2\u046d"+
		"\u046e\5t;\2\u046e\u046f\5\u0080A\2\u046f\u0471\3\2\2\2\u0470\u046c\3"+
		"\2\2\2\u0471\u0474\3\2\2\2\u0472\u0470\3\2\2\2\u0472\u0473\3\2\2\2\u0473"+
		"\177\3\2\2\2\u0474\u0472\3\2\2\2\u0475\u047b\5\n\6\2\u0476\u047b\5\u00a2"+
		"R\2\u0477\u047b\5\u0082B\2\u0478\u047b\5\u0084C\2\u0479\u047b\5\u00d4"+
		"k\2\u047a\u0475\3\2\2\2\u047a\u0476\3\2\2\2\u047a\u0477\3\2\2\2\u047a"+
		"\u0478\3\2\2\2\u047a\u0479\3\2\2\2\u047b\u0081\3\2\2\2\u047c\u047d\5\32"+
		"\16\2\u047d\u0083\3\2\2\2\u047e\u0481\5\2\2\2\u047f\u0481\5\4\3\2\u0480"+
		"\u047e\3\2\2\2\u0480\u047f\3\2\2\2\u0481\u0085\3\2\2\2\u0482\u0483\bD"+
		"\1\2\u0483\u0484\5\6\4\2\u0484\u048b\3\2\2\2\u0485\u0486\f\3\2\2\u0486"+
		"\u0487\5t;\2\u0487\u0488\5\6\4\2\u0488\u048a\3\2\2\2\u0489\u0485\3\2\2"+
		"\2\u048a\u048d\3\2\2\2\u048b\u0489\3\2\2\2\u048b\u048c\3\2\2\2\u048c\u0087"+
		"\3\2\2\2\u048d\u048b\3\2\2\2\u048e\u048f\bE\1\2\u048f\u0490\5\b\5\2\u0490"+
		"\u0497\3\2\2\2\u0491\u0492\f\3\2\2\u0492\u0493\5t;\2\u0493\u0494\5\b\5"+
		"\2\u0494\u0496\3\2\2\2\u0495\u0491\3\2\2\2\u0496\u0499\3\2\2\2\u0497\u0495"+
		"\3\2\2\2\u0497\u0498\3\2\2\2\u0498\u0089\3\2\2\2\u0499\u0497\3\2\2\2\u049a"+
		"\u049b\bF\1\2\u049b\u049c\5\u00aeX\2\u049c\u04a2\3\2\2\2\u049d\u049e\f"+
		"\3\2\2\u049e\u049f\7\22\2\2\u049f\u04a1\5\u00aeX\2\u04a0\u049d\3\2\2\2"+
		"\u04a1\u04a4\3\2\2\2\u04a2\u04a0\3\2\2\2\u04a2\u04a3\3\2\2\2\u04a3\u008b"+
		"\3\2\2\2\u04a4\u04a2\3\2\2\2\u04a5\u04a6\7b\2\2\u04a6\u04b0\5\u008eH\2"+
		"\u04a7\u04a8\7b\2\2\u04a8\u04b0\5\u0090I\2\u04a9\u04aa\7b\2\2\u04aa\u04b0"+
		"\5\u0094K\2\u04ab\u04ac\7e\2\2\u04ac\u04b0\7\u0093\2\2\u04ad\u04ae\7e"+
		"\2\2\u04ae\u04b0\5R*\2\u04af\u04a5\3\2\2\2\u04af\u04a7\3\2\2\2\u04af\u04a9"+
		"\3\2\2\2\u04af\u04ab\3\2\2\2\u04af\u04ad\3\2\2\2\u04b0\u008d\3\2\2\2\u04b1"+
		"\u04b3\7\27\2\2\u04b2\u04b4\5\u0092J\2\u04b3\u04b2\3\2\2\2\u04b3\u04b4"+
		"\3\2\2\2\u04b4\u04b5\3\2\2\2\u04b5\u04b6\7\30\2\2\u04b6\u008f\3\2\2\2"+
		"\u04b7\u04b9\7)\2\2\u04b8\u04ba\5\u0092J\2\u04b9\u04b8\3\2\2\2\u04b9\u04ba"+
		"\3\2\2\2\u04ba\u04bb\3\2\2\2\u04bb\u04bc\7\'\2\2\u04bc\u0091\3\2\2\2\u04bd"+
		"\u04be\bJ\1\2\u04be\u04bf\5R*\2\u04bf\u04c5\3\2\2\2\u04c0\u04c1\f\3\2"+
		"\2\u04c1\u04c2\7\22\2\2\u04c2\u04c4\5R*\2\u04c3\u04c0\3\2\2\2\u04c4\u04c7"+
		"\3\2\2\2\u04c5\u04c3\3\2\2\2\u04c5\u04c6\3\2\2\2\u04c6\u0093\3\2\2\2\u04c7"+
		"\u04c5\3\2\2\2\u04c8\u04c9\7\27\2\2\u04c9\u04ca\5R*\2\u04ca\u04cb\7\23"+
		"\2\2\u04cb\u04cc\5R*\2\u04cc\u04cd\7\30\2\2\u04cd\u0095\3\2\2\2\u04ce"+
		"\u04cf\bL\1\2\u04cf\u04d0\5\u0098M\2\u04d0\u04db\3\2\2\2\u04d1\u04d2\f"+
		"\5\2\2\u04d2\u04da\7+\2\2\u04d3\u04d4\f\4\2\2\u04d4\u04d5\7\27\2\2\u04d5"+
		"\u04da\7\30\2\2\u04d6\u04d7\f\3\2\2\u04d7\u04d8\7\31\2\2\u04d8\u04da\7"+
		"\32\2\2\u04d9\u04d1\3\2\2\2\u04d9\u04d3\3\2\2\2\u04d9\u04d6\3\2\2\2\u04da"+
		"\u04dd\3\2\2\2\u04db\u04d9\3\2\2\2\u04db\u04dc\3\2\2\2\u04dc\u0097\3\2"+
		"\2\2\u04dd\u04db\3\2\2\2\u04de\u04e1\5\u009aN\2\u04df\u04e1\5\u009cO\2"+
		"\u04e0\u04de\3\2\2\2\u04e0\u04df\3\2\2\2\u04e1\u0099\3\2\2\2\u04e2\u04ed"+
		"\7\63\2\2\u04e3\u04ed\7\64\2\2\u04e4\u04ed\7\65\2\2\u04e5\u04ed\7\66\2"+
		"\2\u04e6\u04ed\7\67\2\2\u04e7\u04ed\78\2\2\u04e8\u04ed\7:\2\2\u04e9\u04ed"+
		"\79\2\2\u04ea\u04ed\7;\2\2\u04eb\u04ed\7=\2\2\u04ec\u04e2\3\2\2\2\u04ec"+
		"\u04e3\3\2\2\2\u04ec\u04e4\3\2\2\2\u04ec\u04e5\3\2\2\2\u04ec\u04e6\3\2"+
		"\2\2\u04ec\u04e7\3\2\2\2\u04ec\u04e8\3\2\2\2\u04ec\u04e9\3\2\2\2\u04ec"+
		"\u04ea\3\2\2\2\u04ec\u04eb\3\2\2\2\u04ed\u009b\3\2\2\2\u04ee\u04ef\7\u008f"+
		"\2\2\u04ef\u009d\3\2\2\2\u04f0\u04f1\7=\2\2\u04f1\u009f\3\2\2\2\u04f2"+
		"\u04f3\7>\2\2\u04f3\u00a1\3\2\2\2\u04f4\u04f8\5\f\7\2\u04f5\u04f8\5\30"+
		"\r\2\u04f6\u04f8\5\16\b\2\u04f7\u04f4\3\2\2\2\u04f7\u04f5\3\2\2\2\u04f7"+
		"\u04f6\3\2\2\2\u04f8\u00a3\3\2\2\2\u04f9\u04fa\bS\1\2\u04fa\u04fb\5\u00ac"+
		"W\2\u04fb\u0501\3\2\2\2\u04fc\u04fd\f\3\2\2\u04fd\u04fe\7\22\2\2\u04fe"+
		"\u0500\5\u00acW\2\u04ff\u04fc\3\2\2\2\u0500\u0503\3\2\2\2\u0501\u04ff"+
		"\3\2\2\2\u0501\u0502\3\2\2\2\u0502\u00a5\3\2\2\2\u0503\u0501\3\2\2\2\u0504"+
		"\u0507\5\u00aaV\2\u0505\u0507\5\u00acW\2\u0506\u0504\3\2\2\2\u0506\u0505"+
		"\3\2\2\2\u0507\u00a7\3\2\2\2\u0508\u050c\5\u00aaV\2\u0509\u050c\5\u00ac"+
		"W\2\u050a\u050c\5\u00aeX\2\u050b\u0508\3\2\2\2\u050b\u0509\3\2\2\2\u050b"+
		"\u050a\3\2\2\2\u050c\u00a9\3\2\2\2\u050d\u050e\7\u0090\2\2\u050e\u00ab"+
		"\3\2\2\2\u050f\u0510\7\u008f\2\2\u0510\u00ad\3\2\2\2\u0511\u0512\7\u008e"+
		"\2\2\u0512\u00af\3\2\2\2\u0513\u0514\bY\1\2\u0514\u0515\5\u00b2Z\2\u0515"+
		"\u051b\3\2\2\2\u0516\u0517\f\3\2\2\u0517\u0518\7\22\2\2\u0518\u051a\5"+
		"\u00b2Z\2\u0519\u0516\3\2\2\2\u051a\u051d\3\2\2\2\u051b\u0519\3\2\2\2"+
		"\u051b\u051c\3\2\2\2\u051c\u00b1\3\2\2\2\u051d\u051b\3\2\2\2\u051e\u0524"+
		"\5\u00b8]\2\u051f\u0521\7i\2\2\u0520\u051f\3\2\2\2\u0520\u0521\3\2\2\2"+
		"\u0521\u0522\3\2\2\2\u0522\u0524\5\u00b4[\2\u0523\u051e\3\2\2\2\u0523"+
		"\u0520\3\2\2\2\u0524\u00b3\3\2\2\2\u0525\u0528\5\u00b6\\\2\u0526\u0528"+
		"\5,\27\2\u0527\u0525\3\2\2\2\u0527\u0526\3\2\2\2\u0528\u00b5\3\2\2\2\u0529"+
		"\u052c\5\u00aaV\2\u052a\u052b\7,\2\2\u052b\u052d\5\u00f2z\2\u052c\u052a"+
		"\3\2\2\2\u052c\u052d\3\2\2\2\u052d\u00b7\3\2\2\2\u052e\u052f\5\u009eP"+
		"\2\u052f\u0530\5\u00aaV\2\u0530\u00b9\3\2\2\2\u0531\u0534\5\u0096L\2\u0532"+
		"\u0534\5\u00bc_\2\u0533\u0531\3\2\2\2\u0533\u0532\3\2\2\2\u0534\u00bb"+
		"\3\2\2\2\u0535\u0536\b_\1\2\u0536\u0537\7C\2\2\u0537\u0540\3\2\2\2\u0538"+
		"\u0539\f\4\2\2\u0539\u053a\7\27\2\2\u053a\u053f\7\30\2\2\u053b\u053c\f"+
		"\3\2\2\u053c\u053d\7\31\2\2\u053d\u053f\7\32\2\2\u053e\u0538\3\2\2\2\u053e"+
		"\u053b\3\2\2\2\u053f\u0542\3\2\2\2\u0540\u053e\3\2\2\2\u0540\u0541\3\2"+
		"\2\2\u0541\u00bd\3\2\2\2\u0542\u0540\3\2\2\2\u0543\u0544\b`\1\2\u0544"+
		"\u0545\5\u00c0a\2\u0545\u054c\3\2\2\2\u0546\u0547\f\3\2\2\u0547\u0548"+
		"\5t;\2\u0548\u0549\5\u00c0a\2\u0549\u054b\3\2\2\2\u054a\u0546\3\2\2\2"+
		"\u054b\u054e\3\2\2\2\u054c\u054a\3\2\2\2\u054c\u054d\3\2\2\2\u054d\u00bf"+
		"\3\2\2\2\u054e\u054c\3\2\2\2\u054f\u0555\5\24\13\2\u0550\u0555\5\26\f"+
		"\2\u0551\u0555\5$\23\2\u0552\u0555\5\"\22\2\u0553\u0555\5\22\n\2\u0554"+
		"\u054f\3\2\2\2\u0554\u0550\3\2\2\2\u0554\u0551\3\2\2\2\u0554\u0552\3\2"+
		"\2\2\u0554\u0553\3\2\2\2\u0555\u00c1\3\2\2\2\u0556\u0557\bb\1\2\u0557"+
		"\u0558\5\u00c4c\2\u0558\u055f\3\2\2\2\u0559\u055a\f\3\2\2\u055a\u055b"+
		"\5t;\2\u055b\u055c\5\u00c4c\2\u055c\u055e\3\2\2\2\u055d\u0559\3\2\2\2"+
		"\u055e\u0561\3\2\2\2\u055f\u055d\3\2\2\2\u055f\u0560\3\2\2\2\u0560\u00c3"+
		"\3\2\2\2\u0561\u055f\3\2\2\2\u0562\u0565\5\u00c0a\2\u0563\u0565\5&\24"+
		"\2\u0564\u0562\3\2\2\2\u0564\u0563\3\2\2\2\u0565\u00c5\3\2\2\2\u0566\u0567"+
		"\7\n\2\2\u0567\u0571\5\u015c\u00af\2\u0568\u0569\7\13\2\2\u0569\u0571"+
		"\5\u0174\u00bb\2\u056a\u056b\7\f\2\2\u056b\u0571\5\u00c8e\2\u056c\u056d"+
		"\7\r\2\2\u056d\u0571\5\u00c8e\2\u056e\u056f\7\16\2\2\u056f\u0571\5\u00ce"+
		"h\2\u0570\u0566\3\2\2\2\u0570\u0568\3\2\2\2\u0570\u056a\3\2\2\2\u0570"+
		"\u056c\3\2\2\2\u0570\u056e\3\2\2\2\u0571\u00c7\3\2\2\2\u0572\u0574\5\u00a8"+
		"U\2\u0573\u0575\5\u00caf\2\u0574\u0573\3\2\2\2\u0574\u0575\3\2\2\2\u0575"+
		"\u00c9\3\2\2\2\u0576\u0577\7_\2\2\u0577\u0578\5\u00ccg\2\u0578\u0579\7"+
		"\20\2\2\u0579\u057e\5\u00a8U\2\u057a\u057b\7\24\2\2\u057b\u057d\5\u00a8"+
		"U\2\u057c\u057a\3\2\2\2\u057d\u0580\3\2\2\2\u057e\u057c\3\2\2\2\u057e"+
		"\u057f\3\2\2\2\u057f\u00cb\3\2\2\2\u0580\u057e\3\2\2\2\u0581\u0582\7\u0090"+
		"\2\2\u0582\u0583\6g\65\3\u0583\u00cd\3\2\2\2\u0584\u0586\5\u00a8U\2\u0585"+
		"\u0587\5\u00d0i\2\u0586\u0585\3\2\2\2\u0586\u0587\3\2\2\2\u0587\u00cf"+
		"\3\2\2\2\u0588\u0589\7_\2\2\u0589\u058a\5\u00ccg\2\u058a\u058c\7\20\2"+
		"\2\u058b\u058d\7$\2\2\u058c\u058b\3\2\2\2\u058c\u058d\3\2\2\2\u058d\u058e"+
		"\3\2\2\2\u058e\u0593\5\u012e\u0098\2\u058f\u0590\7$\2\2\u0590\u0592\5"+
		"\u012e\u0098\2\u0591\u058f\3\2\2\2\u0592\u0595\3\2\2\2\u0593\u0591\3\2"+
		"\2\2\u0593\u0594\3\2\2\2\u0594\u0598\3\2\2\2\u0595\u0593\3\2\2\2\u0596"+
		"\u0597\7\24\2\2\u0597\u0599\5\u012e\u0098\2\u0598\u0596\3\2\2\2\u0598"+
		"\u0599\3\2\2\2\u0599\u00d1\3\2\2\2\u059a\u059b\bj\1\2\u059b\u059c\5\u00aa"+
		"V\2\u059c\u05a2\3\2\2\2\u059d\u059e\f\3\2\2\u059e\u059f\7\22\2\2\u059f"+
		"\u05a1\5\u00aaV\2\u05a0\u059d\3\2\2\2\u05a1\u05a4\3\2\2\2\u05a2\u05a0"+
		"\3\2\2\2\u05a2\u05a3\3\2\2\2\u05a3\u00d3\3\2\2\2\u05a4\u05a2\3\2\2\2\u05a5"+
		"\u05aa\5\"\22\2\u05a6\u05aa\5$\23\2\u05a7\u05aa\5&\24\2\u05a8\u05aa\5"+
		"(\25\2\u05a9\u05a5\3\2\2\2\u05a9\u05a6\3\2\2\2\u05a9\u05a7\3\2\2\2\u05a9"+
		"\u05a8\3\2\2\2\u05aa\u00d5\3\2\2\2\u05ab\u05ac\bl\1\2\u05ac\u05ad\5\u00d8"+
		"m\2\u05ad\u05b4\3\2\2\2\u05ae\u05af\f\3\2\2\u05af\u05b0\5t;\2\u05b0\u05b1"+
		"\5\u00d8m\2\u05b1\u05b3\3\2\2\2\u05b2\u05ae\3\2\2\2\u05b3\u05b6\3\2\2"+
		"\2\u05b4\u05b2\3\2\2\2\u05b4\u05b5\3\2\2\2\u05b5\u00d7\3\2\2\2\u05b6\u05b4"+
		"\3\2\2\2\u05b7\u05b8\7\n\2\2\u05b8\u05c2\5\u0148\u00a5\2\u05b9\u05ba\7"+
		"\13\2\2\u05ba\u05c2\5\u0162\u00b2\2\u05bb\u05bc\7\f\2\2\u05bc\u05c2\5"+
		"\u00dan\2\u05bd\u05be\7\r\2\2\u05be\u05c2\5\u00dan\2\u05bf\u05c0\7\16"+
		"\2\2\u05c0\u05c2\5\u00dco\2\u05c1\u05b7\3\2\2\2\u05c1\u05b9\3\2\2\2\u05c1"+
		"\u05bb\3\2\2\2\u05c1\u05bd\3\2\2\2\u05c1\u05bf\3\2\2\2\u05c2\u00d9\3\2"+
		"\2\2\u05c3\u05c5\5\u0130\u0099\2\u05c4\u05c6\7\21\2\2\u05c5\u05c4\3\2"+
		"\2\2\u05c5\u05c6\3\2\2\2\u05c6\u05c8\3\2\2\2\u05c7\u05c9\5\u00caf\2\u05c8"+
		"\u05c7\3\2\2\2\u05c8\u05c9\3\2\2\2\u05c9\u00db\3\2\2\2\u05ca\u05cc\5\u011a"+
		"\u008e\2\u05cb\u05cd\7\21\2\2\u05cc\u05cb\3\2\2\2\u05cc\u05cd\3\2\2\2"+
		"\u05cd\u05cf\3\2\2\2\u05ce\u05d0\5\u00d0i\2\u05cf\u05ce\3\2\2\2\u05cf"+
		"\u05d0\3\2\2\2\u05d0\u00dd\3\2\2\2\u05d1\u05d2\bp\1\2\u05d2\u05d3\5.\30"+
		"\2\u05d3\u05da\3\2\2\2\u05d4\u05d5\f\3\2\2\u05d5\u05d6\5t;\2\u05d6\u05d7"+
		"\5.\30\2\u05d7\u05d9\3\2\2\2\u05d8\u05d4\3\2\2\2\u05d9\u05dc\3\2\2\2\u05da"+
		"\u05d8\3\2\2\2\u05da\u05db\3\2\2\2\u05db\u00df\3\2\2\2\u05dc\u05da\3\2"+
		"\2\2\u05dd\u05de\bq\1\2\u05de\u05df\5*\26\2\u05df\u05e6\3\2\2\2\u05e0"+
		"\u05e1\f\3\2\2\u05e1\u05e2\5t;\2\u05e2\u05e3\5*\26\2\u05e3\u05e5\3\2\2"+
		"\2\u05e4\u05e0\3\2\2\2\u05e5\u05e8\3\2\2\2\u05e6\u05e4\3\2\2\2\u05e6\u05e7"+
		"\3\2\2\2\u05e7\u00e1\3\2\2\2\u05e8\u05e6\3\2\2\2\u05e9\u05ea\br\1\2\u05ea"+
		"\u05eb\5> \2\u05eb\u05f2\3\2\2\2\u05ec\u05ed\f\3\2\2\u05ed\u05ee\5t;\2"+
		"\u05ee\u05ef\5> \2\u05ef\u05f1\3\2\2\2\u05f0\u05ec\3\2\2\2\u05f1\u05f4"+
		"\3\2\2\2\u05f2\u05f0\3\2\2\2\u05f2\u05f3\3\2\2\2\u05f3\u00e3\3\2\2\2\u05f4"+
		"\u05f2\3\2\2\2\u05f5\u05f6\bs\1\2\u05f6\u05f7\5N(\2\u05f7\u05fe\3\2\2"+
		"\2\u05f8\u05f9\f\3\2\2\u05f9\u05fa\5t;\2\u05fa\u05fb\5N(\2\u05fb\u05fd"+
		"\3\2\2\2\u05fc\u05f8\3\2\2\2\u05fd\u0600\3\2\2\2\u05fe\u05fc\3\2\2\2\u05fe"+
		"\u05ff\3\2\2\2\u05ff\u00e5\3\2\2\2\u0600\u05fe\3\2\2\2\u0601\u0602\7\27"+
		"\2\2\u0602\u0603\5\u00e8u\2\u0603\u0604\7\23\2\2\u0604\u0605\5\u00e8u"+
		"\2\u0605\u0606\7\30\2\2\u0606\u0610\3\2\2\2\u0607\u0608\7\27\2\2\u0608"+
		"\u0609\5\u00eav\2\u0609\u060a\7\30\2\2\u060a\u0610\3\2\2\2\u060b\u060c"+
		"\7)\2\2\u060c\u060d\5\u00eav\2\u060d\u060e\7\'\2\2\u060e\u0610\3\2\2\2"+
		"\u060f\u0601\3\2\2\2\u060f\u0607\3\2\2\2\u060f\u060b\3\2\2\2\u0610\u00e7"+
		"\3\2\2\2\u0611\u061f\7\u008c\2\2\u0612\u061f\7\u008d\2\2\u0613\u061f\7"+
		"\u0094\2\2\u0614\u061f\7\u0095\2\2\u0615\u061f\7\u008b\2\2\u0616\u061f"+
		"\7\u0099\2\2\u0617\u061f\7\u0098\2\2\u0618\u061f\7\u0093\2\2\u0619\u061f"+
		"\7\u0096\2\2\u061a\u061f\7\u0097\2\2\u061b\u061f\7\u008a\2\2\u061c\u061f"+
		"\7\u009a\2\2\u061d\u061f\5z>\2\u061e\u0611\3\2\2\2\u061e\u0612\3\2\2\2"+
		"\u061e\u0613\3\2\2\2\u061e\u0614\3\2\2\2\u061e\u0615\3\2\2\2\u061e\u0616"+
		"\3\2\2\2\u061e\u0617\3\2\2\2\u061e\u0618\3\2\2\2\u061e\u0619\3\2\2\2\u061e"+
		"\u061a\3\2\2\2\u061e\u061b\3\2\2\2\u061e\u061c\3\2\2\2\u061e\u061d\3\2"+
		"\2\2\u061f\u00e9\3\2\2\2\u0620\u0621\bv\1\2\u0621\u0622\5\u00e8u\2\u0622"+
		"\u0628\3\2\2\2\u0623\u0624\f\3\2\2\u0624\u0625\7\22\2\2\u0625\u0627\5"+
		"\u00e8u\2\u0626\u0623\3\2\2\2\u0627\u062a\3\2\2\2\u0628\u0626\3\2\2\2"+
		"\u0628\u0629\3\2\2\2\u0629\u00eb\3\2\2\2\u062a\u0628\3\2\2\2\u062b\u0630"+
		"\5\u00f0y\2\u062c\u0630\5\u00f2z\2\u062d\u0630\5\u00a8U\2\u062e\u0630"+
		"\5\u00eex\2\u062f\u062b\3\2\2\2\u062f\u062c\3\2\2\2\u062f\u062d\3\2\2"+
		"\2\u062f\u062e\3\2\2\2\u0630\u00ed\3\2\2\2\u0631\u0632\t\4\2\2\u0632\u00ef"+
		"\3\2\2\2\u0633\u0634\7\25\2\2\u0634\u0635\5R*\2\u0635\u0636\7\26\2\2\u0636"+
		"\u00f1\3\2\2\2\u0637\u063a\5\u00e8u\2\u0638\u063a\5\u00f4{\2\u0639\u0637"+
		"\3\2\2\2\u0639\u0638\3\2\2\2\u063a\u00f3\3\2\2\2\u063b\u0641\5\u0094K"+
		"\2\u063c\u0641\5\u008eH\2\u063d\u0641\5\u0090I\2\u063e\u0641\5\u00f8}"+
		"\2\u063f\u0641\5\u00f6|\2\u0640\u063b\3\2\2\2\u0640\u063c\3\2\2\2\u0640"+
		"\u063d\3\2\2\2\u0640\u063e\3\2\2\2\u0640\u063f\3\2\2\2\u0641\u00f5\3\2"+
		"\2\2\u0642\u0644\7\25\2\2\u0643\u0645\5\u00fa~\2\u0644\u0643\3\2\2\2\u0644"+
		"\u0645\3\2\2\2\u0645\u0646\3\2\2\2\u0646\u0647\7\26\2\2\u0647\u00f7\3"+
		"\2\2\2\u0648\u064a\7\31\2\2\u0649\u064b\5\u00fc\177\2\u064a\u0649\3\2"+
		"\2\2\u064a\u064b\3\2\2\2\u064b\u064c\3\2\2\2\u064c\u064d\7\32\2\2\u064d"+
		"\u00f9\3\2\2\2\u064e\u064f\b~\1\2\u064f\u0650\5R*\2\u0650\u0656\3\2\2"+
		"\2\u0651\u0652\f\3\2\2\u0652\u0653\7\22\2\2\u0653\u0655\5R*\2\u0654\u0651"+
		"\3\2\2\2\u0655\u0658\3\2\2\2\u0656\u0654\3\2\2\2\u0656\u0657\3\2\2\2\u0657"+
		"\u00fb\3\2\2\2\u0658\u0656\3\2\2\2\u0659\u065a\b\177\1\2\u065a\u065b\5"+
		"\u00fe\u0080\2\u065b\u0661\3\2\2\2\u065c\u065d\f\3\2\2\u065d\u065e\7\22"+
		"\2\2\u065e\u0660\5\u00fe\u0080\2\u065f\u065c\3\2\2\2\u0660\u0663\3\2\2"+
		"\2\u0661\u065f\3\2\2\2\u0661\u0662\3\2\2\2\u0662\u00fd\3\2\2\2\u0663\u0661"+
		"\3\2\2\2\u0664\u0665\5R*\2\u0665\u0666\7\20\2\2\u0666\u0667\5R*\2\u0667"+
		"\u00ff\3\2\2\2\u0668\u0669\5R*\2\u0669\u066a\7\20\2\2\u066a\u066b\5R*"+
		"\2\u066b\u0672\3\2\2\2\u066c\u066d\5R*\2\u066d\u066e\7\20\2\2\u066e\u0672"+
		"\3\2\2\2\u066f\u0670\7\20\2\2\u0670\u0672\5R*\2\u0671\u0668\3\2\2\2\u0671"+
		"\u066c\3\2\2\2\u0671\u066f\3\2\2\2\u0672\u0101\3\2\2\2\u0673\u0674\5\u00aa"+
		"V\2\u0674\u0675\5\u0110\u0089\2\u0675\u0676\5R*\2\u0676\u0103\3\2\2\2"+
		"\u0677\u0678\b\u0083\1\2\u0678\u0679\5\u00aaV\2\u0679\u067e\3\2\2\2\u067a"+
		"\u067b\f\3\2\2\u067b\u067d\5n8\2\u067c\u067a\3\2\2\2\u067d\u0680\3\2\2"+
		"\2\u067e\u067c\3\2\2\2\u067e\u067f\3\2\2\2\u067f\u0105\3\2\2\2\u0680\u067e"+
		"\3\2\2\2\u0681\u0682\6\u0084@\3\u0682\u0683\7\u0090\2\2\u0683\u0686\5"+
		"\u00ba^\2\u0684\u0686\5R*\2\u0685\u0681\3\2\2\2\u0685\u0684\3\2\2\2\u0686"+
		"\u0107\3\2\2\2\u0687\u068e\7!\2\2\u0688\u068e\7\"\2\2\u0689\u068e\5\u0112"+
		"\u008a\2\u068a\u068e\5\u0114\u008b\2\u068b\u068e\5\u0116\u008c\2\u068c"+
		"\u068e\5\u0118\u008d\2\u068d\u0687\3\2\2\2\u068d\u0688\3\2\2\2\u068d\u0689"+
		"\3\2\2\2\u068d\u068a\3\2\2\2\u068d\u068b\3\2\2\2\u068d\u068c\3\2\2\2\u068e"+
		"\u0109\3\2\2\2\u068f\u0690\7\u0090\2\2\u0690\u0691\6\u0086A\3\u0691\u010b"+
		"\3\2\2\2\u0692\u0693\7\u0090\2\2\u0693\u0694\6\u0087B\3\u0694\u010d\3"+
		"\2\2\2\u0695\u0696\7\u0090\2\2\u0696\u0697\6\u0088C\3\u0697\u010f\3\2"+
		"\2\2\u0698\u0699\7,\2\2\u0699\u0111\3\2\2\2\u069a\u069b\7#\2\2\u069b\u0113"+
		"\3\2\2\2\u069c\u069d\7$\2\2\u069d\u0115\3\2\2\2\u069e\u069f\7%\2\2\u069f"+
		"\u0117\3\2\2\2\u06a0\u06a1\t\5\2\2\u06a1\u0119\3\2\2\2\u06a2\u06a3\7y"+
		"\2\2\u06a3\u06a4\5\u011c\u008f\2\u06a4\u06a5\7\21\2\2\u06a5\u06aa\3\2"+
		"\2\2\u06a6\u06a7\5\u011c\u008f\2\u06a7\u06a8\7\21\2\2\u06a8\u06aa\3\2"+
		"\2\2\u06a9\u06a2\3\2\2\2\u06a9\u06a6\3\2\2\2\u06aa\u011b\3\2\2\2\u06ab"+
		"\u06ac\b\u008f\1\2\u06ac\u06ad\5\u011e\u0090\2\u06ad\u06b2\3\2\2\2\u06ae"+
		"\u06af\f\3\2\2\u06af\u06b1\5\u0120\u0091\2\u06b0\u06ae\3\2\2\2\u06b1\u06b4"+
		"\3\2\2\2\u06b2\u06b0\3\2\2\2\u06b2\u06b3\3\2\2\2\u06b3\u011d\3\2\2\2\u06b4"+
		"\u06b2\3\2\2\2\u06b5\u06ba\5\u0128\u0095\2\u06b6\u06ba\5\u012a\u0096\2"+
		"\u06b7\u06ba\5\u012c\u0097\2\u06b8\u06ba\5\u0122\u0092\2\u06b9\u06b5\3"+
		"\2\2\2\u06b9\u06b6\3\2\2\2\u06b9\u06b7\3\2\2\2\u06b9\u06b8\3\2\2\2\u06ba"+
		"\u011f\3\2\2\2\u06bb\u06bc\7\24\2\2\u06bc\u06bf\5\u0122\u0092\2\u06bd"+
		"\u06bf\5\u0126\u0094\2\u06be\u06bb\3\2\2\2\u06be\u06bd\3\2\2\2\u06bf\u0121"+
		"\3\2\2\2\u06c0\u06c1\5\u012e\u0098\2\u06c1\u06c3\7\25\2\2\u06c2\u06c4"+
		"\5\u0124\u0093\2\u06c3\u06c2\3\2\2\2\u06c3\u06c4\3\2\2\2\u06c4\u06c5\3"+
		"\2\2\2\u06c5\u06c6\7\26\2\2\u06c6\u0123\3\2\2\2\u06c7\u06c8\b\u0093\1"+
		"\2\u06c8\u06c9\5\u011c\u008f\2\u06c9\u06cf\3\2\2\2\u06ca\u06cb\f\3\2\2"+
		"\u06cb\u06cc\7\22\2\2\u06cc\u06ce\5\u011c\u008f\2\u06cd\u06ca\3\2\2\2"+
		"\u06ce\u06d1\3\2\2\2\u06cf\u06cd\3\2\2\2\u06cf\u06d0\3\2\2\2\u06d0\u0125"+
		"\3\2\2\2\u06d1\u06cf\3\2\2\2\u06d2\u06d3\7\27\2\2\u06d3\u06d4\5\u011c"+
		"\u008f\2\u06d4\u06d5\7\30\2\2\u06d5\u0127\3\2\2\2\u06d6\u06d7\7\25\2\2"+
		"\u06d7\u06d8\5\u011c\u008f\2\u06d8\u06d9\7\26\2\2\u06d9\u0129\3\2\2\2"+
		"\u06da\u06db\b\u0096\1\2\u06db\u06dc\5\u012e\u0098\2\u06dc\u06e2\3\2\2"+
		"\2\u06dd\u06de\f\3\2\2\u06de\u06df\7\24\2\2\u06df\u06e1\5\u012e\u0098"+
		"\2\u06e0\u06dd\3\2\2\2\u06e1\u06e4\3\2\2\2\u06e2\u06e0\3\2\2\2\u06e2\u06e3"+
		"\3\2\2\2\u06e3\u012b\3\2\2\2\u06e4\u06e2\3\2\2\2\u06e5\u06eb\7\u0094\2"+
		"\2\u06e6\u06eb\7\u0096\2\2\u06e7\u06eb\7\u0093\2\2\u06e8\u06eb\7\u008a"+
		"\2\2\u06e9\u06eb\7\u008b\2\2\u06ea\u06e5\3\2\2\2\u06ea\u06e6\3\2\2\2\u06ea"+
		"\u06e7\3\2\2\2\u06ea\u06e8\3\2\2\2\u06ea\u06e9\3\2\2\2\u06eb\u012d\3\2"+
		"\2\2\u06ec\u06ed\t\6\2\2\u06ed\u012f\3\2\2\2\u06ee\u06ef\7y\2\2\u06ef"+
		"\u06f2\5\u0132\u009a\2\u06f0\u06f2\5\u0132\u009a\2\u06f1\u06ee\3\2\2\2"+
		"\u06f1\u06f0\3\2\2\2\u06f2\u0131\3\2\2\2\u06f3\u06f4\b\u009a\1\2\u06f4"+
		"\u06f5\5\u0134\u009b\2\u06f5\u06fa\3\2\2\2\u06f6\u06f7\f\3\2\2\u06f7\u06f9"+
		"\5\u0136\u009c\2\u06f8\u06f6\3\2\2\2\u06f9\u06fc\3\2\2\2\u06fa\u06f8\3"+
		"\2\2\2\u06fa\u06fb\3\2\2\2\u06fb\u0133\3\2\2\2\u06fc\u06fa\3\2\2\2\u06fd"+
		"\u0702\5\u0140\u00a1\2\u06fe\u0702\5\u0142\u00a2\2\u06ff\u0702\5\u0144"+
		"\u00a3\2\u0700\u0702\5\u0138\u009d\2\u0701\u06fd\3\2\2\2\u0701\u06fe\3"+
		"\2\2\2\u0701\u06ff\3\2\2\2\u0701\u0700\3\2\2\2\u0702\u0135\3\2\2\2\u0703"+
		"\u0704\7\24\2\2\u0704\u070a\5\u0138\u009d\2\u0705\u0706\7\27\2\2\u0706"+
		"\u0707\5\u0132\u009a\2\u0707\u0708\7\30\2\2\u0708\u070a\3\2\2\2\u0709"+
		"\u0703\3\2\2\2\u0709\u0705\3\2\2\2\u070a\u0137\3\2\2\2\u070b\u070c\5\u0146"+
		"\u00a4\2\u070c\u070e\7\25\2\2\u070d\u070f\5\u013a\u009e\2\u070e\u070d"+
		"\3\2\2\2\u070e\u070f\3\2\2\2\u070f\u0710\3\2\2\2\u0710\u0711\7\26\2\2"+
		"\u0711\u0139\3\2\2\2\u0712\u0719\5\u013c\u009f\2\u0713\u0719\5\u013e\u00a0"+
		"\2\u0714\u0715\5\u013c\u009f\2\u0715\u0716\7\22\2\2\u0716\u0717\5\u013e"+
		"\u00a0\2\u0717\u0719\3\2\2\2\u0718\u0712\3\2\2\2\u0718\u0713\3\2\2\2\u0718"+
		"\u0714\3\2\2\2\u0719\u013b\3\2\2\2\u071a\u071b\b\u009f\1\2\u071b\u071c"+
		"\5\u0132\u009a\2\u071c\u0722\3\2\2\2\u071d\u071e\f\3\2\2\u071e\u071f\7"+
		"\22\2\2\u071f\u0721\5\u0132\u009a\2\u0720\u071d\3\2\2\2\u0721\u0724\3"+
		"\2\2\2\u0722\u0720\3\2\2\2\u0722\u0723\3\2\2\2\u0723\u013d\3\2\2\2\u0724"+
		"\u0722\3\2\2\2\u0725\u0726\b\u00a0\1\2\u0726\u0727\5\u0146\u00a4\2\u0727"+
		"\u0728\7,\2\2\u0728\u0729\5\u0132\u009a\2\u0729\u0732\3\2\2\2\u072a\u072b"+
		"\f\3\2\2\u072b\u072c\7\22\2\2\u072c\u072d\5\u0146\u00a4\2\u072d\u072e"+
		"\7,\2\2\u072e\u072f\5\u0132\u009a\2\u072f\u0731\3\2\2\2\u0730\u072a\3"+
		"\2\2\2\u0731\u0734\3\2\2\2\u0732\u0730\3\2\2\2\u0732\u0733\3\2\2\2\u0733"+
		"\u013f\3\2\2\2\u0734\u0732\3\2\2\2\u0735\u0736\7\25\2\2\u0736\u0737\5"+
		"\u0132\u009a\2\u0737\u0738\7\26\2\2\u0738\u0141\3\2\2\2\u0739\u073a\b"+
		"\u00a2\1\2\u073a\u073d\7\u0092\2\2\u073b\u073d\5\u0146\u00a4\2\u073c\u0739"+
		"\3\2\2\2\u073c\u073b\3\2\2\2\u073d\u0743\3\2\2\2\u073e\u073f\f\3\2\2\u073f"+
		"\u0740\7\24\2\2\u0740\u0742\5\u0146\u00a4\2\u0741\u073e\3\2\2\2\u0742"+
		"\u0745\3\2\2\2\u0743\u0741\3\2\2\2\u0743\u0744\3\2\2\2\u0744\u0143\3\2"+
		"\2\2\u0745\u0743\3\2\2\2\u0746\u074c\7\u0094\2\2\u0747\u074c\7\u0096\2"+
		"\2\u0748\u074c\7\u0093\2\2\u0749\u074c\7\u008a\2\2\u074a\u074c\7\u008b"+
		"\2\2\u074b\u0746\3\2\2\2\u074b\u0747\3\2\2\2\u074b\u0748\3\2\2\2\u074b"+
		"\u0749\3\2\2\2\u074b\u074a\3\2\2\2\u074c\u0145\3\2\2\2\u074d\u074e\t\7"+
		"\2\2\u074e\u0147\3\2\2\2\u074f\u0750\7y\2\2\u0750\u0751\5\u014a\u00a6"+
		"\2\u0751\u0752\7\21\2\2\u0752\u0757\3\2\2\2\u0753\u0754\5\u014a\u00a6"+
		"\2\u0754\u0755\7\21\2\2\u0755\u0757\3\2\2\2\u0756\u074f\3\2\2\2\u0756"+
		"\u0753\3\2\2\2\u0757\u0149\3\2\2\2\u0758\u0759\b\u00a6\1\2\u0759\u075a"+
		"\5\u014c\u00a7\2\u075a\u075f\3\2\2\2\u075b\u075c\f\3\2\2\u075c\u075e\5"+
		"\u0150\u00a9\2\u075d\u075b\3\2\2\2\u075e\u0761\3\2\2\2\u075f\u075d\3\2"+
		"\2\2\u075f\u0760\3\2\2\2\u0760\u014b\3\2\2\2\u0761\u075f\3\2\2\2\u0762"+
		"\u0767\5\u014e\u00a8\2\u0763\u0767\5\u0158\u00ad\2\u0764\u0767\5\u015a"+
		"\u00ae\2\u0765\u0767\5\u015e\u00b0\2\u0766\u0762\3\2\2\2\u0766\u0763\3"+
		"\2\2\2\u0766\u0764\3\2\2\2\u0766\u0765\3\2\2\2\u0767\u014d\3\2\2\2\u0768"+
		"\u0769\5\u00eex\2\u0769\u014f\3\2\2\2\u076a\u076b\7\24\2\2\u076b\u076e"+
		"\5\u0152\u00aa\2\u076c\u076e\5\u0156\u00ac\2\u076d\u076a\3\2\2\2\u076d"+
		"\u076c\3\2\2\2\u076e\u0151\3\2\2\2\u076f\u0770\5\u0160\u00b1\2\u0770\u0772"+
		"\7\25\2\2\u0771\u0773\5\u0154\u00ab\2\u0772\u0771\3\2\2\2\u0772\u0773"+
		"\3\2\2\2\u0773\u0774\3\2\2\2\u0774\u0775\7\26\2\2\u0775\u0153\3\2\2\2"+
		"\u0776\u0777\b\u00ab\1\2\u0777\u0778\5\u014a\u00a6\2\u0778\u077e\3\2\2"+
		"\2\u0779\u077a\f\3\2\2\u077a\u077b\7\22\2\2\u077b\u077d\5\u014a\u00a6"+
		"\2\u077c\u0779\3\2\2\2\u077d\u0780\3\2\2\2\u077e\u077c\3\2\2\2\u077e\u077f"+
		"\3\2\2\2\u077f\u0155\3\2\2\2\u0780\u077e\3\2\2\2\u0781\u0782\7\27\2\2"+
		"\u0782\u0783\5\u014a\u00a6\2\u0783\u0784\7\30\2\2\u0784\u0157\3\2\2\2"+
		"\u0785\u0786\7\25\2\2\u0786\u0787\5\u014a\u00a6\2\u0787\u0788\7\26\2\2"+
		"\u0788\u0159\3\2\2\2\u0789\u078a\b\u00ae\1\2\u078a\u078b\5\u0160\u00b1"+
		"\2\u078b\u0791\3\2\2\2\u078c\u078d\f\3\2\2\u078d\u078e\7\24\2\2\u078e"+
		"\u0790\5\u0160\u00b1\2\u078f\u078c\3\2\2\2\u0790\u0793\3\2\2\2\u0791\u078f"+
		"\3\2\2\2\u0791\u0792\3\2\2\2\u0792\u015b\3\2\2\2\u0793\u0791\3\2\2\2\u0794"+
		"\u0795\b\u00af\1\2\u0795\u0796\5\u015a\u00ae\2\u0796\u079b\3\2\2\2\u0797"+
		"\u0798\f\3\2\2\u0798\u079a\7\u0092\2\2\u0799\u0797\3\2\2\2\u079a\u079d"+
		"\3\2\2\2\u079b\u0799\3\2\2\2\u079b\u079c\3\2\2\2\u079c\u015d\3\2\2\2\u079d"+
		"\u079b\3\2\2\2\u079e\u07a4\7\u0094\2\2\u079f\u07a4\7\u0096\2\2\u07a0\u07a4"+
		"\7\u0093\2\2\u07a1\u07a4\7\u008a\2\2\u07a2\u07a4\7\u008b\2\2\u07a3\u079e"+
		"\3\2\2\2\u07a3\u079f\3\2\2\2\u07a3\u07a0\3\2\2\2\u07a3\u07a1\3\2\2\2\u07a3"+
		"\u07a2\3\2\2\2\u07a4\u015f\3\2\2\2\u07a5\u07a6\t\b\2\2\u07a6\u0161\3\2"+
		"\2\2\u07a7\u07a8\7y\2\2\u07a8\u07a9\5\u0164\u00b3\2\u07a9\u07aa\7\21\2"+
		"\2\u07aa\u07af\3\2\2\2\u07ab\u07ac\5\u0164\u00b3\2\u07ac\u07ad\7\21\2"+
		"\2\u07ad\u07af\3\2\2\2\u07ae\u07a7\3\2\2\2\u07ae\u07ab\3\2\2\2\u07af\u0163"+
		"\3\2\2\2\u07b0\u07b1\b\u00b3\1\2\u07b1\u07b2\5\u0166\u00b4\2\u07b2\u07b7"+
		"\3\2\2\2\u07b3\u07b4\f\3\2\2\u07b4\u07b6\5\u016a\u00b6\2\u07b5\u07b3\3"+
		"\2\2\2\u07b6\u07b9\3\2\2\2\u07b7\u07b5\3\2\2\2\u07b7\u07b8\3\2\2\2\u07b8"+
		"\u0165\3\2\2\2\u07b9\u07b7\3\2\2\2\u07ba\u07bf\5\u0168\u00b5\2\u07bb\u07bf"+
		"\5\u0172\u00ba\2\u07bc\u07bf\5\u0174\u00bb\2\u07bd\u07bf\5\u0176\u00bc"+
		"\2\u07be\u07ba\3\2\2\2\u07be\u07bb\3\2\2\2\u07be\u07bc\3\2\2\2\u07be\u07bd"+
		"\3\2\2\2\u07bf\u0167\3\2\2\2\u07c0\u07c1\5\u00eex\2\u07c1\u0169\3\2\2"+
		"\2\u07c2\u07c3\7\24\2\2\u07c3\u07c6\5\u016c\u00b7\2\u07c4\u07c6\5\u0170"+
		"\u00b9\2\u07c5\u07c2\3\2\2\2\u07c5\u07c4\3\2\2\2\u07c6\u016b\3\2\2\2\u07c7"+
		"\u07c8\5\u0178\u00bd\2\u07c8\u07ca\7\25\2\2\u07c9\u07cb\5\u016e\u00b8"+
		"\2\u07ca\u07c9\3\2\2\2\u07ca\u07cb\3\2\2\2\u07cb\u07cc\3\2\2\2\u07cc\u07cd"+
		"\7\26\2\2\u07cd\u016d\3\2\2\2\u07ce\u07cf\b\u00b8\1\2\u07cf\u07d0\5\u0164"+
		"\u00b3\2\u07d0\u07d6\3\2\2\2\u07d1\u07d2\f\3\2\2\u07d2\u07d3\7\22\2\2"+
		"\u07d3\u07d5\5\u0164\u00b3\2\u07d4\u07d1\3\2\2\2\u07d5\u07d8\3\2\2\2\u07d6"+
		"\u07d4\3\2\2\2\u07d6\u07d7\3\2\2\2\u07d7\u016f\3\2\2\2\u07d8\u07d6\3\2"+
		"\2\2\u07d9\u07da\7\27\2\2\u07da\u07db\5\u0164\u00b3\2\u07db\u07dc\7\30"+
		"\2\2\u07dc\u0171\3\2\2\2\u07dd\u07de\7\25\2\2\u07de\u07df\5\u0164\u00b3"+
		"\2\u07df\u07e0\7\26\2\2\u07e0\u0173\3\2\2\2\u07e1\u07e2\b\u00bb\1\2\u07e2"+
		"\u07e5\7\u0092\2\2\u07e3\u07e5\5\u0178\u00bd\2\u07e4\u07e1\3\2\2\2\u07e4"+
		"\u07e3\3\2\2\2\u07e5\u07eb\3\2\2\2\u07e6\u07e7\f\3\2\2\u07e7\u07e8\7\24"+
		"\2\2\u07e8\u07ea\5\u0178\u00bd\2\u07e9\u07e6\3\2\2\2\u07ea\u07ed\3\2\2"+
		"\2\u07eb\u07e9\3\2\2\2\u07eb\u07ec\3\2\2\2\u07ec\u0175\3\2\2\2\u07ed\u07eb"+
		"\3\2\2\2\u07ee\u07f4\7\u0094\2\2\u07ef\u07f4\7\u0096\2\2\u07f0\u07f4\7"+
		"\u0093\2\2\u07f1\u07f4\7\u008a\2\2\u07f2\u07f4\7\u008b\2\2\u07f3\u07ee"+
		"\3\2\2\2\u07f3\u07ef\3\2\2\2\u07f3\u07f0\3\2\2\2\u07f3\u07f1\3\2\2\2\u07f3"+
		"\u07f2\3\2\2\2\u07f4\u0177\3\2\2\2\u07f5\u07f6\t\t\2\2\u07f6\u0179\3\2"+
		"\2\2\u009d\u0180\u0183\u019c\u01a9\u01b6\u01bd\u01ca\u01d8\u01f8\u0201"+
		"\u020a\u0213\u0228\u0232\u0237\u023d\u0242\u024e\u0253\u026b\u0276\u027a"+
		"\u028b\u0290\u0299\u02a2\u02ab\u02c8\u02db\u02e1\u0303\u030c\u0323\u0331"+
		"\u033a\u0343\u035a\u035e\u0372\u03d2\u03d4\u03e0\u03e9\u03f8\u03fd\u0402"+
		"\u040b\u0412\u0431\u0441\u044a\u0450\u0455\u045c\u0464\u0472\u047a\u0480"+
		"\u048b\u0497\u04a2\u04af\u04b3\u04b9\u04c5\u04d9\u04db\u04e0\u04ec\u04f7"+
		"\u0501\u0506\u050b\u051b\u0520\u0523\u0527\u052c\u0533\u053e\u0540\u054c"+
		"\u0554\u055f\u0564\u0570\u0574\u057e\u0586\u058c\u0593\u0598\u05a2\u05a9"+
		"\u05b4\u05c1\u05c5\u05c8\u05cc\u05cf\u05da\u05e6\u05f2\u05fe\u060f\u061e"+
		"\u0628\u062f\u0639\u0640\u0644\u064a\u0656\u0661\u0671\u067e\u0685\u068d"+
		"\u06a9\u06b2\u06b9\u06be\u06c3\u06cf\u06e2\u06ea\u06f1\u06fa\u0701\u0709"+
		"\u070e\u0718\u0722\u0732\u073c\u0743\u074b\u0756\u075f\u0766\u076d\u0772"+
		"\u077e\u0791\u079b\u07a3\u07ae\u07b7\u07be\u07c5\u07ca\u07d6\u07e4\u07eb"+
		"\u07f3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}