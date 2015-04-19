// Generated from OParser.g4 by ANTLR 4.5
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
public class OParser extends AbstractParser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SPACE=1, WS=2, LF=3, JAVA=4, CSHARP=5, PYTHON2=6, PYTHON3=7, JAVASCRIPT=8, 
		SWIFT=9, COLON=10, SEMI=11, COMMA=12, RANGE=13, DOT=14, LPAR=15, RPAR=16, 
		LBRAK=17, RBRAK=18, LCURL=19, RCURL=20, QMARK=21, XMARK=22, AMP=23, AMP2=24, 
		PIPE=25, PIPE2=26, PLUS=27, MINUS=28, STAR=29, SLASH=30, BSLASH=31, PERCENT=32, 
		GT=33, GTE=34, LT=35, LTE=36, LTGT=37, EQ=38, XEQ=39, EQ2=40, TEQ=41, 
		TILDE=42, LARROW=43, RARROW=44, BOOLEAN=45, CHARACTER=46, TEXT=47, INTEGER=48, 
		DECIMAL=49, DATE=50, TIME=51, DATETIME=52, PERIOD=53, METHOD_T=54, CODE=55, 
		DOCUMENT=56, ABSTRACT=57, ALL=58, ALWAYS=59, AND=60, ANY=61, AS=62, ATTR=63, 
		ATTRIBUTE=64, ATTRIBUTES=65, CASE=66, CATCH=67, CATEGORY=68, CLASS=69, 
		CLOSE=70, CONTAINS=71, DEF=72, DEFAULT=73, DEFINE=74, DO=75, DOING=76, 
		EACH=77, ELSE=78, ENUM=79, ENUMERATED=80, EXCEPT=81, EXECUTE=82, EXPECTING=83, 
		EXTENDS=84, FETCH=85, FINALLY=86, FOR=87, FROM=88, GETTER=89, IF=90, IN=91, 
		INVOKE=92, IS=93, MAPPINGS=94, MATCHING=95, METHOD=96, METHODS=97, MODULO=98, 
		MUTABLE=99, NATIVE=100, NONE=101, NOT=102, NOTHING=103, NULL=104, ON=105, 
		OPEN=106, OPERATOR=107, OR=108, OTHERWISE=109, PASS=110, RAISE=111, READ=112, 
		RECEIVING=113, RESOURCE=114, RETURN=115, RETURNING=116, SELF=117, SETTER=118, 
		SINGLETON=119, SORTED=120, SWITCH=121, TEST=122, THIS=123, THROW=124, 
		TO=125, TRY=126, WITH=127, WHEN=128, WHERE=129, WHILE=130, WRITE=131, 
		BOOLEAN_LITERAL=132, CHAR_LITERAL=133, MIN_INTEGER=134, MAX_INTEGER=135, 
		SYMBOL_IDENTIFIER=136, TYPE_IDENTIFIER=137, VARIABLE_IDENTIFIER=138, NATIVE_IDENTIFIER=139, 
		DOLLAR_IDENTIFIER=140, TEXT_LITERAL=141, INTEGER_LITERAL=142, HEXA_LITERAL=143, 
		DECIMAL_LITERAL=144, DATETIME_LITERAL=145, TIME_LITERAL=146, DATE_LITERAL=147, 
		PERIOD_LITERAL=148, COMMENT=149;
	public static final int
		RULE_enum_category_declaration = 0, RULE_enum_native_declaration = 1, 
		RULE_category_symbol = 2, RULE_native_symbol = 3, RULE_attribute_declaration = 4, 
		RULE_concrete_category_declaration = 5, RULE_singleton_category_declaration = 6, 
		RULE_derived_list = 7, RULE_category_method_list = 8, RULE_operator_method_declaration = 9, 
		RULE_setter_method_declaration = 10, RULE_getter_method_declaration = 11, 
		RULE_native_resource_declaration = 12, RULE_native_category_declaration = 13, 
		RULE_native_category_mappings = 14, RULE_native_category_mapping_list = 15, 
		RULE_attribute_list = 16, RULE_abstract_method_declaration = 17, RULE_concrete_method_declaration = 18, 
		RULE_native_method_declaration = 19, RULE_test_method_declaration = 20, 
		RULE_assertion = 21, RULE_typed_argument = 22, RULE_statement_or_list = 23, 
		RULE_statement = 24, RULE_with_resource_statement = 25, RULE_with_singleton_statement = 26, 
		RULE_switch_statement = 27, RULE_switch_case_statement = 28, RULE_for_each_statement = 29, 
		RULE_do_while_statement = 30, RULE_while_statement = 31, RULE_if_statement = 32, 
		RULE_else_if_statement_list = 33, RULE_raise_statement = 34, RULE_try_statement = 35, 
		RULE_catch_statement = 36, RULE_return_statement = 37, RULE_method_call = 38, 
		RULE_method_selector = 39, RULE_callable_parent = 40, RULE_callable_selector = 41, 
		RULE_expression = 42, RULE_closure_expression = 43, RULE_instance_expression = 44, 
		RULE_method_expression = 45, RULE_document_expression = 46, RULE_read_expression = 47, 
		RULE_write_statement = 48, RULE_fetch_expression = 49, RULE_sorted_expression = 50, 
		RULE_selector_expression = 51, RULE_constructor_expression = 52, RULE_argument_assignment_list = 53, 
		RULE_argument_assignment = 54, RULE_assign_instance_statement = 55, RULE_child_instance = 56, 
		RULE_assign_tuple_statement = 57, RULE_null_literal = 58, RULE_declaration_list = 59, 
		RULE_declarations = 60, RULE_declaration = 61, RULE_resource_declaration = 62, 
		RULE_enum_declaration = 63, RULE_native_symbol_list = 64, RULE_category_symbol_list = 65, 
		RULE_symbol_list = 66, RULE_attribute_constraint = 67, RULE_list_literal = 68, 
		RULE_set_literal = 69, RULE_expression_list = 70, RULE_range_literal = 71, 
		RULE_typedef = 72, RULE_primary_type = 73, RULE_native_type = 74, RULE_category_type = 75, 
		RULE_code_type = 76, RULE_document_type = 77, RULE_category_declaration = 78, 
		RULE_type_identifier_list = 79, RULE_method_identifier = 80, RULE_identifier = 81, 
		RULE_variable_identifier = 82, RULE_type_identifier = 83, RULE_symbol_identifier = 84, 
		RULE_argument_list = 85, RULE_argument = 86, RULE_operator_argument = 87, 
		RULE_named_argument = 88, RULE_code_argument = 89, RULE_category_or_any_type = 90, 
		RULE_any_type = 91, RULE_member_method_declaration_list = 92, RULE_member_method_declaration = 93, 
		RULE_native_category_mapping = 94, RULE_python_category_mapping = 95, 
		RULE_python_module = 96, RULE_module_token = 97, RULE_javascript_category_mapping = 98, 
		RULE_javascript_module = 99, RULE_variable_identifier_list = 100, RULE_method_declaration = 101, 
		RULE_native_statement_list = 102, RULE_native_statement = 103, RULE_python_native_statement = 104, 
		RULE_javascript_native_statement = 105, RULE_statement_list = 106, RULE_assertion_list = 107, 
		RULE_switch_case_statement_list = 108, RULE_catch_statement_list = 109, 
		RULE_literal_collection = 110, RULE_atomic_literal = 111, RULE_literal_list_literal = 112, 
		RULE_selectable_expression = 113, RULE_this_expression = 114, RULE_parenthesis_expression = 115, 
		RULE_literal_expression = 116, RULE_collection_literal = 117, RULE_tuple_literal = 118, 
		RULE_dict_literal = 119, RULE_expression_tuple = 120, RULE_dict_entry_list = 121, 
		RULE_dict_entry = 122, RULE_slice_arguments = 123, RULE_assign_variable_statement = 124, 
		RULE_assignable_instance = 125, RULE_is_expression = 126, RULE_operator = 127, 
		RULE_key_token = 128, RULE_value_token = 129, RULE_symbols_token = 130, 
		RULE_assign = 131, RULE_multiply = 132, RULE_divide = 133, RULE_idivide = 134, 
		RULE_modulo = 135, RULE_lfs = 136, RULE_lfp = 137, RULE_javascript_statement = 138, 
		RULE_javascript_expression = 139, RULE_javascript_primary_expression = 140, 
		RULE_javascript_selector_expression = 141, RULE_javascript_method_expression = 142, 
		RULE_javascript_arguments = 143, RULE_javascript_item_expression = 144, 
		RULE_javascript_parenthesis_expression = 145, RULE_javascript_identifier_expression = 146, 
		RULE_javascript_literal_expression = 147, RULE_javascript_identifier = 148, 
		RULE_python_statement = 149, RULE_python_expression = 150, RULE_python_primary_expression = 151, 
		RULE_python_selector_expression = 152, RULE_python_method_expression = 153, 
		RULE_python_argument_list = 154, RULE_python_ordinal_argument_list = 155, 
		RULE_python_named_argument_list = 156, RULE_python_parenthesis_expression = 157, 
		RULE_python_identifier_expression = 158, RULE_python_literal_expression = 159, 
		RULE_python_identifier = 160, RULE_java_statement = 161, RULE_java_expression = 162, 
		RULE_java_primary_expression = 163, RULE_java_selector_expression = 164, 
		RULE_java_method_expression = 165, RULE_java_arguments = 166, RULE_java_item_expression = 167, 
		RULE_java_parenthesis_expression = 168, RULE_java_identifier_expression = 169, 
		RULE_java_class_identifier_expression = 170, RULE_java_literal_expression = 171, 
		RULE_java_identifier = 172, RULE_csharp_statement = 173, RULE_csharp_expression = 174, 
		RULE_csharp_primary_expression = 175, RULE_csharp_selector_expression = 176, 
		RULE_csharp_method_expression = 177, RULE_csharp_arguments = 178, RULE_csharp_item_expression = 179, 
		RULE_csharp_parenthesis_expression = 180, RULE_csharp_identifier_expression = 181, 
		RULE_csharp_literal_expression = 182, RULE_csharp_identifier = 183;
	public static final String[] ruleNames = {
		"enum_category_declaration", "enum_native_declaration", "category_symbol", 
		"native_symbol", "attribute_declaration", "concrete_category_declaration", 
		"singleton_category_declaration", "derived_list", "category_method_list", 
		"operator_method_declaration", "setter_method_declaration", "getter_method_declaration", 
		"native_resource_declaration", "native_category_declaration", "native_category_mappings", 
		"native_category_mapping_list", "attribute_list", "abstract_method_declaration", 
		"concrete_method_declaration", "native_method_declaration", "test_method_declaration", 
		"assertion", "typed_argument", "statement_or_list", "statement", "with_resource_statement", 
		"with_singleton_statement", "switch_statement", "switch_case_statement", 
		"for_each_statement", "do_while_statement", "while_statement", "if_statement", 
		"else_if_statement_list", "raise_statement", "try_statement", "catch_statement", 
		"return_statement", "method_call", "method_selector", "callable_parent", 
		"callable_selector", "expression", "closure_expression", "instance_expression", 
		"method_expression", "document_expression", "read_expression", "write_statement", 
		"fetch_expression", "sorted_expression", "selector_expression", "constructor_expression", 
		"argument_assignment_list", "argument_assignment", "assign_instance_statement", 
		"child_instance", "assign_tuple_statement", "null_literal", "declaration_list", 
		"declarations", "declaration", "resource_declaration", "enum_declaration", 
		"native_symbol_list", "category_symbol_list", "symbol_list", "attribute_constraint", 
		"list_literal", "set_literal", "expression_list", "range_literal", "typedef", 
		"primary_type", "native_type", "category_type", "code_type", "document_type", 
		"category_declaration", "type_identifier_list", "method_identifier", "identifier", 
		"variable_identifier", "type_identifier", "symbol_identifier", "argument_list", 
		"argument", "operator_argument", "named_argument", "code_argument", "category_or_any_type", 
		"any_type", "member_method_declaration_list", "member_method_declaration", 
		"native_category_mapping", "python_category_mapping", "python_module", 
		"module_token", "javascript_category_mapping", "javascript_module", "variable_identifier_list", 
		"method_declaration", "native_statement_list", "native_statement", "python_native_statement", 
		"javascript_native_statement", "statement_list", "assertion_list", "switch_case_statement_list", 
		"catch_statement_list", "literal_collection", "atomic_literal", "literal_list_literal", 
		"selectable_expression", "this_expression", "parenthesis_expression", 
		"literal_expression", "collection_literal", "tuple_literal", "dict_literal", 
		"expression_tuple", "dict_entry_list", "dict_entry", "slice_arguments", 
		"assign_variable_statement", "assignable_instance", "is_expression", "operator", 
		"key_token", "value_token", "symbols_token", "assign", "multiply", "divide", 
		"idivide", "modulo", "lfs", "lfp", "javascript_statement", "javascript_expression", 
		"javascript_primary_expression", "javascript_selector_expression", "javascript_method_expression", 
		"javascript_arguments", "javascript_item_expression", "javascript_parenthesis_expression", 
		"javascript_identifier_expression", "javascript_literal_expression", "javascript_identifier", 
		"python_statement", "python_expression", "python_primary_expression", 
		"python_selector_expression", "python_method_expression", "python_argument_list", 
		"python_ordinal_argument_list", "python_named_argument_list", "python_parenthesis_expression", 
		"python_identifier_expression", "python_literal_expression", "python_identifier", 
		"java_statement", "java_expression", "java_primary_expression", "java_selector_expression", 
		"java_method_expression", "java_arguments", "java_item_expression", "java_parenthesis_expression", 
		"java_identifier_expression", "java_class_identifier_expression", "java_literal_expression", 
		"java_identifier", "csharp_statement", "csharp_expression", "csharp_primary_expression", 
		"csharp_selector_expression", "csharp_method_expression", "csharp_arguments", 
		"csharp_item_expression", "csharp_parenthesis_expression", "csharp_identifier_expression", 
		"csharp_literal_expression", "csharp_identifier"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "' '", null, null, "'Java:'", "'C#:'", "'Python2:'", "'Python3:'", 
		"'JavaScript:'", "'Swift:'", "':'", "';'", "','", "'..'", "'.'", "'('", 
		"')'", "'['", "']'", "'{'", "'}'", "'?'", "'!'", "'&'", "'&&'", "'|'", 
		"'||'", "'+'", "'-'", "'*'", "'/'", "'\\'", "'%'", "'>'", "'>='", "'<'", 
		"'<='", "'<>'", "'='", "'!='", "'=='", "'~='", "'~'", "'<-'", "'->'", 
		"'Boolean'", "'Character'", "'Text'", "'Integer'", "'Decimal'", "'Date'", 
		"'Time'", "'DateTime'", "'Period'", "'Method'", "'Code'", "'Document'", 
		"'abstract'", "'all'", "'always'", "'and'", "'any'", "'as'", "'attr'", 
		"'attribute'", "'attributes'", "'case'", "'catch'", "'category'", "'class'", 
		"'close'", "'contains'", "'def'", "'default'", "'define'", "'do'", "'doing'", 
		"'each'", "'else'", "'enum'", "'enumerated'", "'except'", "'execute'", 
		"'expecting'", "'extends'", "'fetch'", "'finally'", "'for'", "'from'", 
		"'getter'", "'if'", "'in'", "'invoke'", "'is'", "'mappings'", "'matching'", 
		"'method'", "'methods'", "'modulo'", "'mutable'", "'native'", "'None'", 
		"'not'", null, "'null'", "'on'", "'open'", "'operator'", "'or'", "'otherwise'", 
		"'pass'", "'raise'", "'read'", "'receiving'", "'resource'", "'return'", 
		"'returning'", "'self'", "'setter'", "'singleton'", "'sorted'", "'switch'", 
		"'test'", "'this'", "'throw'", "'to'", "'try'", "'with'", "'when'", "'where'", 
		"'while'", "'write'", null, null, "'MIN_INTEGER'", "'MAX_INTEGER'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SPACE", "WS", "LF", "JAVA", "CSHARP", "PYTHON2", "PYTHON3", "JAVASCRIPT", 
		"SWIFT", "COLON", "SEMI", "COMMA", "RANGE", "DOT", "LPAR", "RPAR", "LBRAK", 
		"RBRAK", "LCURL", "RCURL", "QMARK", "XMARK", "AMP", "AMP2", "PIPE", "PIPE2", 
		"PLUS", "MINUS", "STAR", "SLASH", "BSLASH", "PERCENT", "GT", "GTE", "LT", 
		"LTE", "LTGT", "EQ", "XEQ", "EQ2", "TEQ", "TILDE", "LARROW", "RARROW", 
		"BOOLEAN", "CHARACTER", "TEXT", "INTEGER", "DECIMAL", "DATE", "TIME", 
		"DATETIME", "PERIOD", "METHOD_T", "CODE", "DOCUMENT", "ABSTRACT", "ALL", 
		"ALWAYS", "AND", "ANY", "AS", "ATTR", "ATTRIBUTE", "ATTRIBUTES", "CASE", 
		"CATCH", "CATEGORY", "CLASS", "CLOSE", "CONTAINS", "DEF", "DEFAULT", "DEFINE", 
		"DO", "DOING", "EACH", "ELSE", "ENUM", "ENUMERATED", "EXCEPT", "EXECUTE", 
		"EXPECTING", "EXTENDS", "FETCH", "FINALLY", "FOR", "FROM", "GETTER", "IF", 
		"IN", "INVOKE", "IS", "MAPPINGS", "MATCHING", "METHOD", "METHODS", "MODULO", 
		"MUTABLE", "NATIVE", "NONE", "NOT", "NOTHING", "NULL", "ON", "OPEN", "OPERATOR", 
		"OR", "OTHERWISE", "PASS", "RAISE", "READ", "RECEIVING", "RESOURCE", "RETURN", 
		"RETURNING", "SELF", "SETTER", "SINGLETON", "SORTED", "SWITCH", "TEST", 
		"THIS", "THROW", "TO", "TRY", "WITH", "WHEN", "WHERE", "WHILE", "WRITE", 
		"BOOLEAN_LITERAL", "CHAR_LITERAL", "MIN_INTEGER", "MAX_INTEGER", "SYMBOL_IDENTIFIER", 
		"TYPE_IDENTIFIER", "VARIABLE_IDENTIFIER", "NATIVE_IDENTIFIER", "DOLLAR_IDENTIFIER", 
		"TEXT_LITERAL", "INTEGER_LITERAL", "HEXA_LITERAL", "DECIMAL_LITERAL", 
		"DATETIME_LITERAL", "TIME_LITERAL", "DATE_LITERAL", "PERIOD_LITERAL", 
		"COMMENT"
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
		public Attribute_listContext attrs;
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
		public Attribute_listContext attribute_list() {
			return getRuleContext(Attribute_listContext.class,0);
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
			setState(368); 
			match(ENUMERATED);
			setState(369); 
			match(CATEGORY);
			setState(370); 
			((Enum_category_declarationContext)_localctx).name = type_identifier();
			setState(375);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(371); 
				match(LPAR);
				setState(372); 
				((Enum_category_declarationContext)_localctx).attrs = attribute_list(0);
				setState(373); 
				match(RPAR);
				}
			}

			setState(379);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(377); 
				match(EXTENDS);
				setState(378); 
				((Enum_category_declarationContext)_localctx).derived = type_identifier();
				}
			}

			setState(381); 
			match(LCURL);
			setState(382); 
			((Enum_category_declarationContext)_localctx).symbols = category_symbol_list(0);
			setState(383); 
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
			setState(385); 
			match(ENUMERATED);
			setState(386); 
			((Enum_native_declarationContext)_localctx).name = type_identifier();
			setState(387); 
			match(LPAR);
			setState(388); 
			((Enum_native_declarationContext)_localctx).typ = native_type();
			setState(389); 
			match(RPAR);
			setState(390); 
			match(LCURL);
			setState(391); 
			((Enum_native_declarationContext)_localctx).symbols = native_symbol_list(0);
			setState(392); 
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
			setState(394); 
			((Category_symbolContext)_localctx).name = symbol_identifier();
			setState(395); 
			match(LPAR);
			setState(396); 
			((Category_symbolContext)_localctx).args = argument_assignment_list(0);
			setState(397); 
			match(RPAR);
			setState(398); 
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
			setState(400); 
			((Native_symbolContext)_localctx).name = symbol_identifier();
			setState(401); 
			match(EQ);
			setState(402); 
			((Native_symbolContext)_localctx).exp = expression(0);
			setState(403); 
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
		public Variable_identifierContext name;
		public TypedefContext typ;
		public Attribute_constraintContext match;
		public TerminalNode ATTRIBUTE() { return getToken(OParser.ATTRIBUTE, 0); }
		public TerminalNode COLON() { return getToken(OParser.COLON, 0); }
		public TerminalNode SEMI() { return getToken(OParser.SEMI, 0); }
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public TypedefContext typedef() {
			return getRuleContext(TypedefContext.class,0);
		}
		public Attribute_constraintContext attribute_constraint() {
			return getRuleContext(Attribute_constraintContext.class,0);
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
			setState(405); 
			match(ATTRIBUTE);
			setState(406); 
			((Attribute_declarationContext)_localctx).name = variable_identifier();
			setState(407); 
			match(COLON);
			setState(408); 
			((Attribute_declarationContext)_localctx).typ = typedef(0);
			setState(410);
			_la = _input.LA(1);
			if (_la==IN || _la==MATCHING) {
				{
				setState(409); 
				((Attribute_declarationContext)_localctx).match = attribute_constraint();
				}
			}

			setState(412); 
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

	public static class Concrete_category_declarationContext extends ParserRuleContext {
		public Type_identifierContext name;
		public Attribute_listContext attrs;
		public Derived_listContext derived;
		public Category_method_listContext methods;
		public TerminalNode CATEGORY() { return getToken(OParser.CATEGORY, 0); }
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Category_method_listContext category_method_list() {
			return getRuleContext(Category_method_listContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public TerminalNode EXTENDS() { return getToken(OParser.EXTENDS, 0); }
		public Attribute_listContext attribute_list() {
			return getRuleContext(Attribute_listContext.class,0);
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
		enterRule(_localctx, 10, RULE_concrete_category_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414); 
			match(CATEGORY);
			setState(415); 
			((Concrete_category_declarationContext)_localctx).name = type_identifier();
			setState(420);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(416); 
				match(LPAR);
				setState(417); 
				((Concrete_category_declarationContext)_localctx).attrs = attribute_list(0);
				setState(418); 
				match(RPAR);
				}
			}

			setState(424);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(422); 
				match(EXTENDS);
				setState(423); 
				((Concrete_category_declarationContext)_localctx).derived = derived_list(0);
				}
			}

			setState(426); 
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
		public Attribute_listContext attrs;
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
		public Attribute_listContext attribute_list() {
			return getRuleContext(Attribute_listContext.class,0);
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
		enterRule(_localctx, 12, RULE_singleton_category_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428); 
			match(SINGLETON);
			setState(429); 
			((Singleton_category_declarationContext)_localctx).name = type_identifier();
			setState(434);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(430); 
				match(LPAR);
				setState(431); 
				((Singleton_category_declarationContext)_localctx).attrs = attribute_list(0);
				setState(432); 
				match(RPAR);
				}
			}

			setState(436); 
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

	public final Derived_listContext derived_list() throws RecognitionException {
		return derived_list(0);
	}

	private Derived_listContext derived_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Derived_listContext _localctx = new Derived_listContext(_ctx, _parentState);
		Derived_listContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_derived_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new DerivedListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(439); 
			((DerivedListContext)_localctx).item = type_identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(446);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DerivedListItemContext(new Derived_listContext(_parentctx, _parentState));
					((DerivedListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_derived_list);
					setState(441);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(442); 
					match(COMMA);
					setState(443); 
					((DerivedListItemContext)_localctx).item = type_identifier();
					}
					} 
				}
				setState(448);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
		enterRule(_localctx, 16, RULE_category_method_list);
		int _la;
		try {
			setState(455);
			switch (_input.LA(1)) {
			case SEMI:
				_localctx = new EmptyCategoryMethodListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(449); 
				match(SEMI);
				}
				break;
			case LCURL:
				_localctx = new CurlyCategoryMethodListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(450); 
				match(LCURL);
				setState(452);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << CODE) | (1L << ABSTRACT))) != 0) || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (GETTER - 89)) | (1L << (METHOD - 89)) | (1L << (OPERATOR - 89)) | (1L << (SETTER - 89)) | (1L << (TYPE_IDENTIFIER - 89)))) != 0)) {
					{
					setState(451); 
					((CurlyCategoryMethodListContext)_localctx).items = member_method_declaration_list(0);
					}
				}

				setState(454); 
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
		enterRule(_localctx, 18, RULE_operator_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << CODE))) != 0) || _la==TYPE_IDENTIFIER) {
				{
				setState(457); 
				((Operator_method_declarationContext)_localctx).typ = typedef(0);
				}
			}

			setState(460); 
			match(OPERATOR);
			setState(461); 
			((Operator_method_declarationContext)_localctx).op = operator();
			setState(462); 
			match(LPAR);
			setState(463); 
			((Operator_method_declarationContext)_localctx).arg = operator_argument();
			setState(464); 
			match(RPAR);
			setState(465); 
			match(LCURL);
			setState(467);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << CODE))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (DO - 75)) | (1L << (FOR - 75)) | (1L << (IF - 75)) | (1L << (METHOD - 75)) | (1L << (RETURN - 75)) | (1L << (SWITCH - 75)) | (1L << (THROW - 75)) | (1L << (TRY - 75)) | (1L << (WITH - 75)) | (1L << (WHILE - 75)) | (1L << (WRITE - 75)) | (1L << (SYMBOL_IDENTIFIER - 75)) | (1L << (TYPE_IDENTIFIER - 75)) | (1L << (VARIABLE_IDENTIFIER - 75)))) != 0)) {
				{
				setState(466); 
				((Operator_method_declarationContext)_localctx).stmts = statement_list(0);
				}
			}

			setState(469); 
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
		enterRule(_localctx, 20, RULE_setter_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471); 
			match(SETTER);
			setState(472); 
			((Setter_method_declarationContext)_localctx).name = variable_identifier();
			setState(473); 
			match(LCURL);
			setState(475);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << CODE))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (DO - 75)) | (1L << (FOR - 75)) | (1L << (IF - 75)) | (1L << (METHOD - 75)) | (1L << (RETURN - 75)) | (1L << (SWITCH - 75)) | (1L << (THROW - 75)) | (1L << (TRY - 75)) | (1L << (WITH - 75)) | (1L << (WHILE - 75)) | (1L << (WRITE - 75)) | (1L << (SYMBOL_IDENTIFIER - 75)) | (1L << (TYPE_IDENTIFIER - 75)) | (1L << (VARIABLE_IDENTIFIER - 75)))) != 0)) {
				{
				setState(474); 
				((Setter_method_declarationContext)_localctx).stmts = statement_list(0);
				}
			}

			setState(477); 
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
		enterRule(_localctx, 22, RULE_getter_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479); 
			match(GETTER);
			setState(480); 
			((Getter_method_declarationContext)_localctx).name = variable_identifier();
			setState(481); 
			match(LCURL);
			setState(483);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << CODE))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (DO - 75)) | (1L << (FOR - 75)) | (1L << (IF - 75)) | (1L << (METHOD - 75)) | (1L << (RETURN - 75)) | (1L << (SWITCH - 75)) | (1L << (THROW - 75)) | (1L << (TRY - 75)) | (1L << (WITH - 75)) | (1L << (WHILE - 75)) | (1L << (WRITE - 75)) | (1L << (SYMBOL_IDENTIFIER - 75)) | (1L << (TYPE_IDENTIFIER - 75)) | (1L << (VARIABLE_IDENTIFIER - 75)))) != 0)) {
				{
				setState(482); 
				((Getter_method_declarationContext)_localctx).stmts = statement_list(0);
				}
			}

			setState(485); 
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
		public Attribute_listContext attrs;
		public Native_category_mappingsContext mappings;
		public TerminalNode NATIVE() { return getToken(OParser.NATIVE, 0); }
		public TerminalNode RESOURCE() { return getToken(OParser.RESOURCE, 0); }
		public TerminalNode LCURL() { return getToken(OParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(OParser.RCURL, 0); }
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Native_category_mappingsContext native_category_mappings() {
			return getRuleContext(Native_category_mappingsContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public Attribute_listContext attribute_list() {
			return getRuleContext(Attribute_listContext.class,0);
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
		enterRule(_localctx, 24, RULE_native_resource_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487); 
			match(NATIVE);
			setState(488); 
			match(RESOURCE);
			setState(489); 
			((Native_resource_declarationContext)_localctx).name = type_identifier();
			setState(494);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(490); 
				match(LPAR);
				setState(491); 
				((Native_resource_declarationContext)_localctx).attrs = attribute_list(0);
				setState(492); 
				match(RPAR);
				}
			}

			setState(496); 
			match(LCURL);
			setState(497); 
			((Native_resource_declarationContext)_localctx).mappings = native_category_mappings();
			setState(498); 
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
		public Attribute_listContext attrs;
		public Native_category_mappingsContext mappings;
		public TerminalNode NATIVE() { return getToken(OParser.NATIVE, 0); }
		public TerminalNode CATEGORY() { return getToken(OParser.CATEGORY, 0); }
		public TerminalNode LCURL() { return getToken(OParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(OParser.RCURL, 0); }
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Native_category_mappingsContext native_category_mappings() {
			return getRuleContext(Native_category_mappingsContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public Attribute_listContext attribute_list() {
			return getRuleContext(Attribute_listContext.class,0);
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
		enterRule(_localctx, 26, RULE_native_category_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500); 
			match(NATIVE);
			setState(501); 
			match(CATEGORY);
			setState(502); 
			((Native_category_declarationContext)_localctx).name = type_identifier();
			setState(507);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(503); 
				match(LPAR);
				setState(504); 
				((Native_category_declarationContext)_localctx).attrs = attribute_list(0);
				setState(505); 
				match(RPAR);
				}
			}

			setState(509); 
			match(LCURL);
			setState(510); 
			((Native_category_declarationContext)_localctx).mappings = native_category_mappings();
			setState(511); 
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

	public static class Native_category_mappingsContext extends ParserRuleContext {
		public Native_category_mapping_listContext items;
		public TerminalNode CATEGORY() { return getToken(OParser.CATEGORY, 0); }
		public TerminalNode MAPPINGS() { return getToken(OParser.MAPPINGS, 0); }
		public TerminalNode LCURL() { return getToken(OParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(OParser.RCURL, 0); }
		public Native_category_mapping_listContext native_category_mapping_list() {
			return getRuleContext(Native_category_mapping_listContext.class,0);
		}
		public Native_category_mappingsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_native_category_mappings; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterNative_category_mappings(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitNative_category_mappings(this);
		}
	}

	public final Native_category_mappingsContext native_category_mappings() throws RecognitionException {
		Native_category_mappingsContext _localctx = new Native_category_mappingsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_native_category_mappings);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513); 
			match(CATEGORY);
			setState(514); 
			match(MAPPINGS);
			setState(515); 
			match(LCURL);
			setState(516); 
			((Native_category_mappingsContext)_localctx).items = native_category_mapping_list(0);
			setState(517); 
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

	public static class Native_category_mapping_listContext extends ParserRuleContext {
		public Native_category_mapping_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_native_category_mapping_list; }
	 
		public Native_category_mapping_listContext() { }
		public void copyFrom(Native_category_mapping_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NativeCategoryMappingListContext extends Native_category_mapping_listContext {
		public Native_category_mappingContext item;
		public TerminalNode SEMI() { return getToken(OParser.SEMI, 0); }
		public Native_category_mappingContext native_category_mapping() {
			return getRuleContext(Native_category_mappingContext.class,0);
		}
		public NativeCategoryMappingListContext(Native_category_mapping_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterNativeCategoryMappingList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitNativeCategoryMappingList(this);
		}
	}
	public static class NativeCategoryMappingListItemContext extends Native_category_mapping_listContext {
		public Native_category_mapping_listContext items;
		public Native_category_mappingContext item;
		public TerminalNode SEMI() { return getToken(OParser.SEMI, 0); }
		public Native_category_mapping_listContext native_category_mapping_list() {
			return getRuleContext(Native_category_mapping_listContext.class,0);
		}
		public Native_category_mappingContext native_category_mapping() {
			return getRuleContext(Native_category_mappingContext.class,0);
		}
		public NativeCategoryMappingListItemContext(Native_category_mapping_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterNativeCategoryMappingListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitNativeCategoryMappingListItem(this);
		}
	}

	public final Native_category_mapping_listContext native_category_mapping_list() throws RecognitionException {
		return native_category_mapping_list(0);
	}

	private Native_category_mapping_listContext native_category_mapping_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Native_category_mapping_listContext _localctx = new Native_category_mapping_listContext(_ctx, _parentState);
		Native_category_mapping_listContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_native_category_mapping_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new NativeCategoryMappingListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(520); 
			((NativeCategoryMappingListContext)_localctx).item = native_category_mapping();
			setState(521); 
			match(SEMI);
			}
			_ctx.stop = _input.LT(-1);
			setState(529);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NativeCategoryMappingListItemContext(new Native_category_mapping_listContext(_parentctx, _parentState));
					((NativeCategoryMappingListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_native_category_mapping_list);
					setState(523);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(524); 
					((NativeCategoryMappingListItemContext)_localctx).item = native_category_mapping();
					setState(525); 
					match(SEMI);
					}
					} 
				}
				setState(531);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
	public static class AttributeListItemContext extends Attribute_listContext {
		public Attribute_listContext items;
		public Variable_identifierContext item;
		public TerminalNode COMMA() { return getToken(OParser.COMMA, 0); }
		public Attribute_listContext attribute_list() {
			return getRuleContext(Attribute_listContext.class,0);
		}
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public AttributeListItemContext(Attribute_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterAttributeListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitAttributeListItem(this);
		}
	}
	public static class AttributeListContext extends Attribute_listContext {
		public Variable_identifierContext item;
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public AttributeListContext(Attribute_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterAttributeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitAttributeList(this);
		}
	}

	public final Attribute_listContext attribute_list() throws RecognitionException {
		return attribute_list(0);
	}

	private Attribute_listContext attribute_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Attribute_listContext _localctx = new Attribute_listContext(_ctx, _parentState);
		Attribute_listContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_attribute_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AttributeListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(533); 
			((AttributeListContext)_localctx).item = variable_identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(540);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AttributeListItemContext(new Attribute_listContext(_parentctx, _parentState));
					((AttributeListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_attribute_list);
					setState(535);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(536); 
					match(COMMA);
					setState(537); 
					((AttributeListItemContext)_localctx).item = variable_identifier();
					}
					} 
				}
				setState(542);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		enterRule(_localctx, 34, RULE_abstract_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543); 
			match(ABSTRACT);
			setState(545);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << CODE))) != 0) || _la==TYPE_IDENTIFIER) {
				{
				setState(544); 
				((Abstract_method_declarationContext)_localctx).typ = typedef(0);
				}
			}

			setState(547); 
			match(METHOD);
			setState(548); 
			((Abstract_method_declarationContext)_localctx).name = method_identifier();
			setState(549); 
			match(LPAR);
			setState(551);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << CODE) | (1L << ANY))) != 0) || ((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (MUTABLE - 99)) | (1L << (TYPE_IDENTIFIER - 99)) | (1L << (VARIABLE_IDENTIFIER - 99)))) != 0)) {
				{
				setState(550); 
				((Abstract_method_declarationContext)_localctx).args = argument_list(0);
				}
			}

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
		enterRule(_localctx, 36, RULE_concrete_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << CODE))) != 0) || _la==TYPE_IDENTIFIER) {
				{
				setState(556); 
				((Concrete_method_declarationContext)_localctx).typ = typedef(0);
				}
			}

			setState(559); 
			match(METHOD);
			setState(560); 
			((Concrete_method_declarationContext)_localctx).name = method_identifier();
			setState(561); 
			match(LPAR);
			setState(563);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << CODE) | (1L << ANY))) != 0) || ((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (MUTABLE - 99)) | (1L << (TYPE_IDENTIFIER - 99)) | (1L << (VARIABLE_IDENTIFIER - 99)))) != 0)) {
				{
				setState(562); 
				((Concrete_method_declarationContext)_localctx).args = argument_list(0);
				}
			}

			setState(565); 
			match(RPAR);
			setState(566); 
			match(LCURL);
			setState(568);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << CODE))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (DO - 75)) | (1L << (FOR - 75)) | (1L << (IF - 75)) | (1L << (METHOD - 75)) | (1L << (RETURN - 75)) | (1L << (SWITCH - 75)) | (1L << (THROW - 75)) | (1L << (TRY - 75)) | (1L << (WITH - 75)) | (1L << (WHILE - 75)) | (1L << (WRITE - 75)) | (1L << (SYMBOL_IDENTIFIER - 75)) | (1L << (TYPE_IDENTIFIER - 75)) | (1L << (VARIABLE_IDENTIFIER - 75)))) != 0)) {
				{
				setState(567); 
				((Concrete_method_declarationContext)_localctx).stmts = statement_list(0);
				}
			}

			setState(570); 
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
		public TerminalNode NATIVE() { return getToken(OParser.NATIVE, 0); }
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
		enterRule(_localctx, 38, RULE_native_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << CODE) | (1L << ANY))) != 0) || _la==TYPE_IDENTIFIER) {
				{
				setState(572); 
				((Native_method_declarationContext)_localctx).typ = category_or_any_type();
				}
			}

			setState(575); 
			match(NATIVE);
			setState(576); 
			match(METHOD);
			setState(577); 
			((Native_method_declarationContext)_localctx).name = method_identifier();
			setState(578); 
			match(LPAR);
			setState(580);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << CODE) | (1L << ANY))) != 0) || ((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (MUTABLE - 99)) | (1L << (TYPE_IDENTIFIER - 99)) | (1L << (VARIABLE_IDENTIFIER - 99)))) != 0)) {
				{
				setState(579); 
				((Native_method_declarationContext)_localctx).args = argument_list(0);
				}
			}

			setState(582); 
			match(RPAR);
			setState(583); 
			match(LCURL);
			setState(584); 
			((Native_method_declarationContext)_localctx).stmts = native_statement_list(0);
			setState(585); 
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
		public TerminalNode EXPECTING() { return getToken(OParser.EXPECTING, 0); }
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
		enterRule(_localctx, 40, RULE_test_method_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587); 
			match(TEST);
			setState(588); 
			match(METHOD);
			setState(589); 
			((Test_method_declarationContext)_localctx).name = match(TEXT_LITERAL);
			setState(590); 
			match(LPAR);
			setState(591); 
			match(RPAR);
			setState(592); 
			match(LCURL);
			setState(593); 
			((Test_method_declarationContext)_localctx).stmts = statement_list(0);
			setState(594); 
			match(RCURL);
			setState(595); 
			match(EXPECTING);
			setState(603);
			switch (_input.LA(1)) {
			case LCURL:
				{
				{
				setState(596); 
				match(LCURL);
				setState(597); 
				((Test_method_declarationContext)_localctx).exps = assertion_list(0);
				setState(598); 
				match(RCURL);
				}
				}
				break;
			case SYMBOL_IDENTIFIER:
				{
				{
				setState(600); 
				((Test_method_declarationContext)_localctx).error = symbol_identifier();
				setState(601); 
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
		enterRule(_localctx, 42, RULE_assertion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605); 
			((AssertionContext)_localctx).exp = expression(0);
			setState(606); 
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
		public Attribute_listContext attrs;
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterTyped_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitTyped_argument(this);
		}
	}

	public final Typed_argumentContext typed_argument() throws RecognitionException {
		Typed_argumentContext _localctx = new Typed_argumentContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_typed_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608); 
			((Typed_argumentContext)_localctx).typ = category_or_any_type();
			setState(613);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(609); 
				match(LPAR);
				setState(610); 
				((Typed_argumentContext)_localctx).attrs = attribute_list(0);
				setState(611); 
				match(RPAR);
				}
			}

			setState(615); 
			((Typed_argumentContext)_localctx).name = variable_identifier();
			setState(618);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(616); 
				match(EQ);
				setState(617); 
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
		enterRule(_localctx, 46, RULE_statement_or_list);
		try {
			setState(627);
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
			case DO:
			case FOR:
			case IF:
			case METHOD:
			case RETURN:
			case SWITCH:
			case THROW:
			case TRY:
			case WITH:
			case WHILE:
			case WRITE:
			case SYMBOL_IDENTIFIER:
			case TYPE_IDENTIFIER:
			case VARIABLE_IDENTIFIER:
				_localctx = new SingleStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(620); 
				((SingleStatementContext)_localctx).stmt = statement();
				}
				break;
			case LCURL:
				_localctx = new CurlyStatementListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(621); 
				match(LCURL);
				setState(625);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(622); 
					((CurlyStatementListContext)_localctx).items = statement_list(0);
					setState(623); 
					match(RCURL);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterAssignInstanceStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitAssignInstanceStatement(this);
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
	public static class MethodCallStatementContext extends StatementContext {
		public Method_callContext stmt;
		public TerminalNode SEMI() { return getToken(OParser.SEMI, 0); }
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
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

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_statement);
		try {
			setState(646);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				_localctx = new MethodCallStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(629); 
				((MethodCallStatementContext)_localctx).stmt = method_call();
				setState(630); 
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new AssignInstanceStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(632); 
				((AssignInstanceStatementContext)_localctx).stmt = assign_instance_statement();
				}
				break;
			case 3:
				_localctx = new AssignTupleStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(633); 
				((AssignTupleStatementContext)_localctx).stmt = assign_tuple_statement();
				}
				break;
			case 4:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(634); 
				((ReturnStatementContext)_localctx).stmt = return_statement();
				}
				break;
			case 5:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(635); 
				((IfStatementContext)_localctx).stmt = if_statement();
				}
				break;
			case 6:
				_localctx = new SwitchStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(636); 
				((SwitchStatementContext)_localctx).stmt = switch_statement();
				}
				break;
			case 7:
				_localctx = new ForEachStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(637); 
				((ForEachStatementContext)_localctx).stmt = for_each_statement();
				}
				break;
			case 8:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(638); 
				((WhileStatementContext)_localctx).stmt = while_statement();
				}
				break;
			case 9:
				_localctx = new DoWhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(639); 
				((DoWhileStatementContext)_localctx).stmt = do_while_statement();
				}
				break;
			case 10:
				_localctx = new TryStatementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(640); 
				((TryStatementContext)_localctx).stmt = try_statement();
				}
				break;
			case 11:
				_localctx = new RaiseStatementContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(641); 
				((RaiseStatementContext)_localctx).stmt = raise_statement();
				}
				break;
			case 12:
				_localctx = new WriteStatementContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(642); 
				((WriteStatementContext)_localctx).stmt = write_statement();
				}
				break;
			case 13:
				_localctx = new WithResourceStatementContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(643); 
				((WithResourceStatementContext)_localctx).stmt = with_resource_statement();
				}
				break;
			case 14:
				_localctx = new WithSingletonStatementContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(644); 
				((WithSingletonStatementContext)_localctx).stmt = with_singleton_statement();
				}
				break;
			case 15:
				_localctx = new ClosureStatementContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(645); 
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
		enterRule(_localctx, 50, RULE_with_resource_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648); 
			match(WITH);
			setState(649); 
			match(LPAR);
			setState(650); 
			((With_resource_statementContext)_localctx).stmt = assign_variable_statement();
			setState(651); 
			match(RPAR);
			setState(652); 
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
		enterRule(_localctx, 52, RULE_with_singleton_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654); 
			match(WITH);
			setState(655); 
			match(LPAR);
			setState(656); 
			((With_singleton_statementContext)_localctx).typ = type_identifier();
			setState(657); 
			match(RPAR);
			setState(658); 
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
		enterRule(_localctx, 54, RULE_switch_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660); 
			match(SWITCH);
			setState(661); 
			match(LPAR);
			setState(662); 
			((Switch_statementContext)_localctx).exp = expression(0);
			setState(663); 
			match(RPAR);
			setState(664); 
			match(LCURL);
			setState(665); 
			((Switch_statementContext)_localctx).cases = switch_case_statement_list(0);
			setState(671);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(666); 
				match(DEFAULT);
				setState(667); 
				match(COLON);
				setState(669);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << CODE))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (DO - 75)) | (1L << (FOR - 75)) | (1L << (IF - 75)) | (1L << (METHOD - 75)) | (1L << (RETURN - 75)) | (1L << (SWITCH - 75)) | (1L << (THROW - 75)) | (1L << (TRY - 75)) | (1L << (WITH - 75)) | (1L << (WHILE - 75)) | (1L << (WRITE - 75)) | (1L << (SYMBOL_IDENTIFIER - 75)) | (1L << (TYPE_IDENTIFIER - 75)) | (1L << (VARIABLE_IDENTIFIER - 75)))) != 0)) {
					{
					setState(668); 
					((Switch_statementContext)_localctx).stmts = statement_list(0);
					}
				}

				}
			}

			setState(673); 
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
		enterRule(_localctx, 56, RULE_switch_case_statement);
		try {
			setState(688);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				_localctx = new AtomicSwitchCaseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(675); 
				match(CASE);
				setState(676); 
				((AtomicSwitchCaseContext)_localctx).exp = atomic_literal();
				setState(677); 
				match(COLON);
				setState(679);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(678); 
					((AtomicSwitchCaseContext)_localctx).stmts = statement_list(0);
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new CollectionSwitchCaseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(681); 
				match(CASE);
				setState(682); 
				match(IN);
				setState(683); 
				((CollectionSwitchCaseContext)_localctx).exp = literal_collection();
				setState(684); 
				match(COLON);
				setState(686);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(685); 
					((CollectionSwitchCaseContext)_localctx).stmts = statement_list(0);
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
		enterRule(_localctx, 58, RULE_for_each_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(690); 
			match(FOR);
			setState(691); 
			match(EACH);
			setState(692); 
			match(LPAR);
			setState(693); 
			((For_each_statementContext)_localctx).name1 = variable_identifier();
			setState(696);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(694); 
				match(COMMA);
				setState(695); 
				((For_each_statementContext)_localctx).name2 = variable_identifier();
				}
			}

			setState(698); 
			match(IN);
			setState(699); 
			((For_each_statementContext)_localctx).source = expression(0);
			setState(700); 
			match(RPAR);
			setState(701); 
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
		enterRule(_localctx, 60, RULE_do_while_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703); 
			match(DO);
			setState(704); 
			match(LCURL);
			setState(706);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << CODE))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (DO - 75)) | (1L << (FOR - 75)) | (1L << (IF - 75)) | (1L << (METHOD - 75)) | (1L << (RETURN - 75)) | (1L << (SWITCH - 75)) | (1L << (THROW - 75)) | (1L << (TRY - 75)) | (1L << (WITH - 75)) | (1L << (WHILE - 75)) | (1L << (WRITE - 75)) | (1L << (SYMBOL_IDENTIFIER - 75)) | (1L << (TYPE_IDENTIFIER - 75)) | (1L << (VARIABLE_IDENTIFIER - 75)))) != 0)) {
				{
				setState(705); 
				((Do_while_statementContext)_localctx).stmts = statement_list(0);
				}
			}

			setState(708); 
			match(RCURL);
			setState(709); 
			match(WHILE);
			setState(710); 
			match(LPAR);
			setState(711); 
			((Do_while_statementContext)_localctx).exp = expression(0);
			setState(712); 
			match(RPAR);
			setState(713); 
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
		enterRule(_localctx, 62, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(715); 
			match(WHILE);
			setState(716); 
			match(LPAR);
			setState(717); 
			((While_statementContext)_localctx).exp = expression(0);
			setState(718); 
			match(RPAR);
			setState(719); 
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
		enterRule(_localctx, 64, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(721); 
			match(IF);
			setState(722); 
			match(LPAR);
			setState(723); 
			((If_statementContext)_localctx).exp = expression(0);
			setState(724); 
			match(RPAR);
			setState(725); 
			((If_statementContext)_localctx).stmts = statement_or_list();
			setState(727);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(726); 
				((If_statementContext)_localctx).elseIfs = else_if_statement_list(0);
				}
				break;
			}
			setState(731);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(729); 
				match(ELSE);
				setState(730); 
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
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_else_if_statement_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ElseIfStatementListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(734); 
			match(ELSE);
			setState(735); 
			match(IF);
			setState(736); 
			match(LPAR);
			setState(737); 
			((ElseIfStatementListContext)_localctx).exp = expression(0);
			setState(738); 
			match(RPAR);
			setState(739); 
			((ElseIfStatementListContext)_localctx).stmts = statement_or_list();
			}
			_ctx.stop = _input.LT(-1);
			setState(751);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ElseIfStatementListItemContext(new Else_if_statement_listContext(_parentctx, _parentState));
					((ElseIfStatementListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_else_if_statement_list);
					setState(741);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(742); 
					match(ELSE);
					setState(743); 
					match(IF);
					setState(744); 
					match(LPAR);
					setState(745); 
					((ElseIfStatementListItemContext)_localctx).exp = expression(0);
					setState(746); 
					match(RPAR);
					setState(747); 
					((ElseIfStatementListItemContext)_localctx).stmts = statement_or_list();
					}
					} 
				}
				setState(753);
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
		enterRule(_localctx, 68, RULE_raise_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(754); 
			match(THROW);
			setState(755); 
			((Raise_statementContext)_localctx).exp = expression(0);
			setState(756); 
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
		enterRule(_localctx, 70, RULE_try_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(758); 
			match(TRY);
			setState(759); 
			match(LPAR);
			setState(760); 
			((Try_statementContext)_localctx).name = variable_identifier();
			setState(761); 
			match(RPAR);
			setState(762); 
			match(LCURL);
			setState(764);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << CODE))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (DO - 75)) | (1L << (FOR - 75)) | (1L << (IF - 75)) | (1L << (METHOD - 75)) | (1L << (RETURN - 75)) | (1L << (SWITCH - 75)) | (1L << (THROW - 75)) | (1L << (TRY - 75)) | (1L << (WITH - 75)) | (1L << (WHILE - 75)) | (1L << (WRITE - 75)) | (1L << (SYMBOL_IDENTIFIER - 75)) | (1L << (TYPE_IDENTIFIER - 75)) | (1L << (VARIABLE_IDENTIFIER - 75)))) != 0)) {
				{
				setState(763); 
				((Try_statementContext)_localctx).stmts = statement_list(0);
				}
			}

			setState(766); 
			match(RCURL);
			setState(768);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(767); 
				((Try_statementContext)_localctx).handlers = catch_statement_list(0);
				}
				break;
			}
			setState(779);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(770); 
				match(CATCH);
				setState(771); 
				match(LPAR);
				setState(772); 
				match(ANY);
				setState(773); 
				match(RPAR);
				setState(774); 
				match(LCURL);
				setState(776);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << CODE))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (DO - 75)) | (1L << (FOR - 75)) | (1L << (IF - 75)) | (1L << (METHOD - 75)) | (1L << (RETURN - 75)) | (1L << (SWITCH - 75)) | (1L << (THROW - 75)) | (1L << (TRY - 75)) | (1L << (WITH - 75)) | (1L << (WHILE - 75)) | (1L << (WRITE - 75)) | (1L << (SYMBOL_IDENTIFIER - 75)) | (1L << (TYPE_IDENTIFIER - 75)) | (1L << (VARIABLE_IDENTIFIER - 75)))) != 0)) {
					{
					setState(775); 
					((Try_statementContext)_localctx).anyStmts = statement_list(0);
					}
				}

				setState(778); 
				match(RCURL);
				}
				break;
			}
			setState(787);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(781); 
				match(FINALLY);
				setState(782); 
				match(LCURL);
				setState(784);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << CODE))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (DO - 75)) | (1L << (FOR - 75)) | (1L << (IF - 75)) | (1L << (METHOD - 75)) | (1L << (RETURN - 75)) | (1L << (SWITCH - 75)) | (1L << (THROW - 75)) | (1L << (TRY - 75)) | (1L << (WITH - 75)) | (1L << (WHILE - 75)) | (1L << (WRITE - 75)) | (1L << (SYMBOL_IDENTIFIER - 75)) | (1L << (TYPE_IDENTIFIER - 75)) | (1L << (VARIABLE_IDENTIFIER - 75)))) != 0)) {
					{
					setState(783); 
					((Try_statementContext)_localctx).finalStmts = statement_list(0);
					}
				}

				setState(786); 
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
		enterRule(_localctx, 72, RULE_catch_statement);
		int _la;
		try {
			setState(810);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				_localctx = new CatchAtomicStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(789); 
				match(CATCH);
				setState(790); 
				match(LPAR);
				setState(791); 
				((CatchAtomicStatementContext)_localctx).name = symbol_identifier();
				setState(792); 
				match(RPAR);
				setState(793); 
				match(LCURL);
				setState(795);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << CODE))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (DO - 75)) | (1L << (FOR - 75)) | (1L << (IF - 75)) | (1L << (METHOD - 75)) | (1L << (RETURN - 75)) | (1L << (SWITCH - 75)) | (1L << (THROW - 75)) | (1L << (TRY - 75)) | (1L << (WITH - 75)) | (1L << (WHILE - 75)) | (1L << (WRITE - 75)) | (1L << (SYMBOL_IDENTIFIER - 75)) | (1L << (TYPE_IDENTIFIER - 75)) | (1L << (VARIABLE_IDENTIFIER - 75)))) != 0)) {
					{
					setState(794); 
					((CatchAtomicStatementContext)_localctx).stmts = statement_list(0);
					}
				}

				setState(797); 
				match(RCURL);
				}
				break;
			case 2:
				_localctx = new CatchCollectionStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(799); 
				match(CATCH);
				setState(800); 
				match(IN);
				setState(801); 
				match(LPAR);
				setState(802); 
				((CatchCollectionStatementContext)_localctx).exp = symbol_list(0);
				setState(803); 
				match(RPAR);
				setState(804); 
				match(LCURL);
				setState(806);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << CODE))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (DO - 75)) | (1L << (FOR - 75)) | (1L << (IF - 75)) | (1L << (METHOD - 75)) | (1L << (RETURN - 75)) | (1L << (SWITCH - 75)) | (1L << (THROW - 75)) | (1L << (TRY - 75)) | (1L << (WITH - 75)) | (1L << (WHILE - 75)) | (1L << (WRITE - 75)) | (1L << (SYMBOL_IDENTIFIER - 75)) | (1L << (TYPE_IDENTIFIER - 75)) | (1L << (VARIABLE_IDENTIFIER - 75)))) != 0)) {
					{
					setState(805); 
					((CatchCollectionStatementContext)_localctx).stmts = statement_list(0);
					}
				}

				setState(808); 
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
		enterRule(_localctx, 74, RULE_return_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(812); 
			match(RETURN);
			setState(814);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << XMARK) | (1L << MINUS) | (1L << LT) | (1L << CODE) | (1L << DOCUMENT))) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (EXECUTE - 82)) | (1L << (FETCH - 82)) | (1L << (MUTABLE - 82)) | (1L << (NULL - 82)) | (1L << (READ - 82)) | (1L << (SELF - 82)) | (1L << (SORTED - 82)) | (1L << (THIS - 82)) | (1L << (BOOLEAN_LITERAL - 82)) | (1L << (CHAR_LITERAL - 82)) | (1L << (MIN_INTEGER - 82)) | (1L << (MAX_INTEGER - 82)) | (1L << (SYMBOL_IDENTIFIER - 82)) | (1L << (TYPE_IDENTIFIER - 82)) | (1L << (VARIABLE_IDENTIFIER - 82)) | (1L << (TEXT_LITERAL - 82)) | (1L << (INTEGER_LITERAL - 82)) | (1L << (HEXA_LITERAL - 82)) | (1L << (DECIMAL_LITERAL - 82)) | (1L << (DATETIME_LITERAL - 82)))) != 0) || ((((_la - 146)) & ~0x3f) == 0 && ((1L << (_la - 146)) & ((1L << (TIME_LITERAL - 146)) | (1L << (DATE_LITERAL - 146)) | (1L << (PERIOD_LITERAL - 146)))) != 0)) {
				{
				setState(813); 
				((Return_statementContext)_localctx).exp = expression(0);
				}
			}

			setState(816); 
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

	public static class Method_callContext extends ParserRuleContext {
		public Method_selectorContext method;
		public Argument_assignment_listContext args;
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterMethod_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitMethod_call(this);
		}
	}

	public final Method_callContext method_call() throws RecognitionException {
		Method_callContext _localctx = new Method_callContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_method_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(818); 
			((Method_callContext)_localctx).method = method_selector();
			setState(819); 
			match(LPAR);
			setState(821);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << XMARK) | (1L << MINUS) | (1L << LT) | (1L << CODE) | (1L << DOCUMENT))) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (EXECUTE - 82)) | (1L << (FETCH - 82)) | (1L << (MUTABLE - 82)) | (1L << (NULL - 82)) | (1L << (READ - 82)) | (1L << (SELF - 82)) | (1L << (SORTED - 82)) | (1L << (THIS - 82)) | (1L << (BOOLEAN_LITERAL - 82)) | (1L << (CHAR_LITERAL - 82)) | (1L << (MIN_INTEGER - 82)) | (1L << (MAX_INTEGER - 82)) | (1L << (SYMBOL_IDENTIFIER - 82)) | (1L << (TYPE_IDENTIFIER - 82)) | (1L << (VARIABLE_IDENTIFIER - 82)) | (1L << (TEXT_LITERAL - 82)) | (1L << (INTEGER_LITERAL - 82)) | (1L << (HEXA_LITERAL - 82)) | (1L << (DECIMAL_LITERAL - 82)) | (1L << (DATETIME_LITERAL - 82)))) != 0) || ((((_la - 146)) & ~0x3f) == 0 && ((1L << (_la - 146)) & ((1L << (TIME_LITERAL - 146)) | (1L << (DATE_LITERAL - 146)) | (1L << (PERIOD_LITERAL - 146)))) != 0)) {
				{
				setState(820); 
				((Method_callContext)_localctx).args = argument_assignment_list(0);
				}
			}

			setState(823); 
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterMethodName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitMethodName(this);
		}
	}
	public static class MethodParentContext extends Method_selectorContext {
		public Callable_parentContext parent;
		public Method_identifierContext name;
		public TerminalNode DOT() { return getToken(OParser.DOT, 0); }
		public Callable_parentContext callable_parent() {
			return getRuleContext(Callable_parentContext.class,0);
		}
		public Method_identifierContext method_identifier() {
			return getRuleContext(Method_identifierContext.class,0);
		}
		public MethodParentContext(Method_selectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterMethodParent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitMethodParent(this);
		}
	}

	public final Method_selectorContext method_selector() throws RecognitionException {
		Method_selectorContext _localctx = new Method_selectorContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_method_selector);
		try {
			setState(830);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				_localctx = new MethodNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(825); 
				((MethodNameContext)_localctx).name = method_identifier();
				}
				break;
			case 2:
				_localctx = new MethodParentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(826); 
				((MethodParentContext)_localctx).parent = callable_parent(0);
				setState(827); 
				match(DOT);
				setState(828); 
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCallableRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCallableRoot(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCallableSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCallableSelector(this);
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
		int _startState = 80;
		enterRecursionRule(_localctx, 80, RULE_callable_parent, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new CallableRootContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(833); 
			((CallableRootContext)_localctx).name = identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(839);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CallableSelectorContext(new Callable_parentContext(_parentctx, _parentState));
					((CallableSelectorContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_callable_parent);
					setState(835);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(836); 
					((CallableSelectorContext)_localctx).select = callable_selector();
					}
					} 
				}
				setState(841);
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
		public TerminalNode LBRAK() { return getToken(OParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(OParser.RBRAK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CallableItemSelectorContext(Callable_selectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCallableItemSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCallableItemSelector(this);
		}
	}
	public static class CallableMemberSelectorContext extends Callable_selectorContext {
		public Variable_identifierContext name;
		public TerminalNode DOT() { return getToken(OParser.DOT, 0); }
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public CallableMemberSelectorContext(Callable_selectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCallableMemberSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCallableMemberSelector(this);
		}
	}

	public final Callable_selectorContext callable_selector() throws RecognitionException {
		Callable_selectorContext _localctx = new Callable_selectorContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_callable_selector);
		try {
			setState(848);
			switch (_input.LA(1)) {
			case DOT:
				_localctx = new CallableMemberSelectorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(842); 
				match(DOT);
				setState(843); 
				((CallableMemberSelectorContext)_localctx).name = variable_identifier();
				}
				break;
			case LBRAK:
				_localctx = new CallableItemSelectorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(844); 
				match(LBRAK);
				setState(845); 
				((CallableItemSelectorContext)_localctx).exp = expression(0);
				setState(846); 
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
	public static class ClosureExpressionContext extends ExpressionContext {
		public Closure_expressionContext exp;
		public Closure_expressionContext closure_expression() {
			return getRuleContext(Closure_expressionContext.class,0);
		}
		public ClosureExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterClosureExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitClosureExpression(this);
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
	public static class EqualsExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode EQ2() { return getToken(OParser.EQ2, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
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
	public static class NotContainsAnyExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode NOT() { return getToken(OParser.NOT, 0); }
		public TerminalNode CONTAINS() { return getToken(OParser.CONTAINS, 0); }
		public TerminalNode ANY() { return getToken(OParser.ANY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public NotContainsAnyExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterNotContainsAnyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitNotContainsAnyExpression(this);
		}
	}
	public static class RoughlyEqualsExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode TEQ() { return getToken(OParser.TEQ, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public RoughlyEqualsExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterRoughlyEqualsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitRoughlyEqualsExpression(this);
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
	public static class NotEqualsExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode XEQ() { return getToken(OParser.XEQ, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public NotEqualsExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterNotEqualsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitNotEqualsExpression(this);
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
	public static class MethodExpressionContext extends ExpressionContext {
		public Method_expressionContext exp;
		public Method_expressionContext method_expression() {
			return getRuleContext(Method_expressionContext.class,0);
		}
		public MethodExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterMethodExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitMethodExpression(this);
		}
	}
	public static class GreaterThanExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode GT() { return getToken(OParser.GT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GreaterThanExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterGreaterThanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitGreaterThanExpression(this);
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
	public static class GreaterThanOrEqualExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode GTE() { return getToken(OParser.GTE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GreaterThanOrEqualExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterGreaterThanOrEqualExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitGreaterThanOrEqualExpression(this);
		}
	}
	public static class NotContainsAllExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode NOT() { return getToken(OParser.NOT, 0); }
		public TerminalNode CONTAINS() { return getToken(OParser.CONTAINS, 0); }
		public TerminalNode ALL() { return getToken(OParser.ALL, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public NotContainsAllExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterNotContainsAllExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitNotContainsAllExpression(this);
		}
	}
	public static class LessThanOrEqualExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode LTE() { return getToken(OParser.LTE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LessThanOrEqualExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterLessThanOrEqualExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitLessThanOrEqualExpression(this);
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
	public static class ContainsAllExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode CONTAINS() { return getToken(OParser.CONTAINS, 0); }
		public TerminalNode ALL() { return getToken(OParser.ALL, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ContainsAllExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterContainsAllExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitContainsAllExpression(this);
		}
	}
	public static class LessThanExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode LT() { return getToken(OParser.LT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LessThanExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterLessThanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitLessThanExpression(this);
		}
	}
	public static class NotInExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode NOT() { return getToken(OParser.NOT, 0); }
		public TerminalNode IN() { return getToken(OParser.IN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public NotInExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterNotInExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitNotInExpression(this);
		}
	}
	public static class NotContainsExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode NOT() { return getToken(OParser.NOT, 0); }
		public TerminalNode CONTAINS() { return getToken(OParser.CONTAINS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public NotContainsExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterNotContainsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitNotContainsExpression(this);
		}
	}
	public static class ContainsAnyExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode CONTAINS() { return getToken(OParser.CONTAINS, 0); }
		public TerminalNode ANY() { return getToken(OParser.ANY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ContainsAnyExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterContainsAnyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitContainsAnyExpression(this);
		}
	}
	public static class IsExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Is_expressionContext right;
		public TerminalNode IS() { return getToken(OParser.IS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Is_expressionContext is_expression() {
			return getRuleContext(Is_expressionContext.class,0);
		}
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
	public static class IsNotExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Is_expressionContext right;
		public TerminalNode IS() { return getToken(OParser.IS, 0); }
		public TerminalNode NOT() { return getToken(OParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Is_expressionContext is_expression() {
			return getRuleContext(Is_expressionContext.class,0);
		}
		public IsNotExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterIsNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitIsNotExpression(this);
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
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(873);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				_localctx = new MinusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(851); 
				match(MINUS);
				setState(852); 
				((MinusExpressionContext)_localctx).exp = expression(31);
				}
				break;
			case 2:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(853); 
				match(XMARK);
				setState(854); 
				((NotExpressionContext)_localctx).exp = expression(30);
				}
				break;
			case 3:
				{
				_localctx = new CastExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(855); 
				match(LPAR);
				setState(856); 
				((CastExpressionContext)_localctx).right = category_or_any_type();
				setState(857); 
				match(RPAR);
				setState(858); 
				((CastExpressionContext)_localctx).left = expression(12);
				}
				break;
			case 4:
				{
				_localctx = new InstanceExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(860); 
				((InstanceExpressionContext)_localctx).exp = instance_expression(0);
				}
				break;
			case 5:
				{
				_localctx = new MethodExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(861); 
				((MethodExpressionContext)_localctx).exp = method_expression();
				}
				break;
			case 6:
				{
				_localctx = new CodeExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(862); 
				match(CODE);
				setState(863); 
				match(LPAR);
				setState(864); 
				((CodeExpressionContext)_localctx).exp = expression(0);
				setState(865); 
				match(RPAR);
				}
				break;
			case 7:
				{
				_localctx = new ExecuteExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(867); 
				match(EXECUTE);
				setState(868); 
				match(LPAR);
				setState(869); 
				((ExecuteExpressionContext)_localctx).name = variable_identifier();
				setState(870); 
				match(RPAR);
				}
				break;
			case 8:
				{
				_localctx = new ClosureExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(872); 
				((ClosureExpressionContext)_localctx).exp = closure_expression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(968);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(966);
					switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplyExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((MultiplyExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(875);
						if (!(precpred(_ctx, 29))) throw new FailedPredicateException(this, "precpred(_ctx, 29)");
						setState(876); 
						multiply();
						setState(877); 
						((MultiplyExpressionContext)_localctx).right = expression(30);
						}
						break;
					case 2:
						{
						_localctx = new DivideExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((DivideExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(879);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(880); 
						divide();
						setState(881); 
						((DivideExpressionContext)_localctx).right = expression(29);
						}
						break;
					case 3:
						{
						_localctx = new ModuloExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ModuloExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(883);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(884); 
						modulo();
						setState(885); 
						((ModuloExpressionContext)_localctx).right = expression(28);
						}
						break;
					case 4:
						{
						_localctx = new IntDivideExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((IntDivideExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(887);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(888); 
						idivide();
						setState(889); 
						((IntDivideExpressionContext)_localctx).right = expression(27);
						}
						break;
					case 5:
						{
						_localctx = new AddExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((AddExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(891);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(892);
						((AddExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((AddExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(893); 
						((AddExpressionContext)_localctx).right = expression(26);
						}
						break;
					case 6:
						{
						_localctx = new LessThanExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((LessThanExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(894);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(895); 
						match(LT);
						setState(896); 
						((LessThanExpressionContext)_localctx).right = expression(25);
						}
						break;
					case 7:
						{
						_localctx = new LessThanOrEqualExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((LessThanOrEqualExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(897);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(898); 
						match(LTE);
						setState(899); 
						((LessThanOrEqualExpressionContext)_localctx).right = expression(24);
						}
						break;
					case 8:
						{
						_localctx = new GreaterThanExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((GreaterThanExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(900);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(901); 
						match(GT);
						setState(902); 
						((GreaterThanExpressionContext)_localctx).right = expression(23);
						}
						break;
					case 9:
						{
						_localctx = new GreaterThanOrEqualExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((GreaterThanOrEqualExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(903);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(904); 
						match(GTE);
						setState(905); 
						((GreaterThanOrEqualExpressionContext)_localctx).right = expression(22);
						}
						break;
					case 10:
						{
						_localctx = new EqualsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((EqualsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(906);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(907); 
						match(EQ2);
						setState(908); 
						((EqualsExpressionContext)_localctx).right = expression(19);
						}
						break;
					case 11:
						{
						_localctx = new NotEqualsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((NotEqualsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(909);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(910); 
						match(XEQ);
						setState(911); 
						((NotEqualsExpressionContext)_localctx).right = expression(18);
						}
						break;
					case 12:
						{
						_localctx = new RoughlyEqualsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((RoughlyEqualsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(912);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(913); 
						match(TEQ);
						setState(914); 
						((RoughlyEqualsExpressionContext)_localctx).right = expression(17);
						}
						break;
					case 13:
						{
						_localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((OrExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(915);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(916); 
						match(PIPE2);
						setState(917); 
						((OrExpressionContext)_localctx).right = expression(16);
						}
						break;
					case 14:
						{
						_localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((AndExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(918);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(919); 
						match(AMP2);
						setState(920); 
						((AndExpressionContext)_localctx).right = expression(15);
						}
						break;
					case 15:
						{
						_localctx = new TernaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((TernaryExpressionContext)_localctx).test = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(921);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(922); 
						match(QMARK);
						setState(923); 
						((TernaryExpressionContext)_localctx).ifTrue = expression(0);
						setState(924); 
						match(COLON);
						setState(925); 
						((TernaryExpressionContext)_localctx).ifFalse = expression(14);
						}
						break;
					case 16:
						{
						_localctx = new InExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((InExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(927);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(928); 
						match(IN);
						setState(929); 
						((InExpressionContext)_localctx).right = expression(12);
						}
						break;
					case 17:
						{
						_localctx = new ContainsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ContainsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(930);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(931); 
						match(CONTAINS);
						setState(932); 
						((ContainsExpressionContext)_localctx).right = expression(11);
						}
						break;
					case 18:
						{
						_localctx = new ContainsAllExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ContainsAllExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(933);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(934); 
						match(CONTAINS);
						setState(935); 
						match(ALL);
						setState(936); 
						((ContainsAllExpressionContext)_localctx).right = expression(10);
						}
						break;
					case 19:
						{
						_localctx = new ContainsAnyExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ContainsAnyExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(937);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(938); 
						match(CONTAINS);
						setState(939); 
						match(ANY);
						setState(940); 
						((ContainsAnyExpressionContext)_localctx).right = expression(9);
						}
						break;
					case 20:
						{
						_localctx = new NotInExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((NotInExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(941);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(942); 
						match(NOT);
						setState(943); 
						match(IN);
						setState(944); 
						((NotInExpressionContext)_localctx).right = expression(8);
						}
						break;
					case 21:
						{
						_localctx = new NotContainsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((NotContainsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(945);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(946); 
						match(NOT);
						setState(947); 
						match(CONTAINS);
						setState(948); 
						((NotContainsExpressionContext)_localctx).right = expression(7);
						}
						break;
					case 22:
						{
						_localctx = new NotContainsAllExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((NotContainsAllExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(949);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(950); 
						match(NOT);
						setState(951); 
						match(CONTAINS);
						setState(952); 
						match(ALL);
						setState(953); 
						((NotContainsAllExpressionContext)_localctx).right = expression(6);
						}
						break;
					case 23:
						{
						_localctx = new NotContainsAnyExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((NotContainsAnyExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(954);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(955); 
						match(NOT);
						setState(956); 
						match(CONTAINS);
						setState(957); 
						match(ANY);
						setState(958); 
						((NotContainsAnyExpressionContext)_localctx).right = expression(5);
						}
						break;
					case 24:
						{
						_localctx = new IsNotExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((IsNotExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(959);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(960); 
						match(IS);
						setState(961); 
						match(NOT);
						setState(962); 
						((IsNotExpressionContext)_localctx).right = is_expression();
						}
						break;
					case 25:
						{
						_localctx = new IsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((IsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(963);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(964); 
						match(IS);
						setState(965); 
						((IsExpressionContext)_localctx).right = is_expression();
						}
						break;
					}
					} 
				}
				setState(970);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterClosure_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitClosure_expression(this);
		}
	}

	public final Closure_expressionContext closure_expression() throws RecognitionException {
		Closure_expressionContext _localctx = new Closure_expressionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_closure_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(971); 
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterSelectableExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitSelectableExpression(this);
		}
	}
	public static class SelectorExpressionContext extends Instance_expressionContext {
		public Instance_expressionContext parent;
		public Selector_expressionContext selector;
		public Instance_expressionContext instance_expression() {
			return getRuleContext(Instance_expressionContext.class,0);
		}
		public Selector_expressionContext selector_expression() {
			return getRuleContext(Selector_expressionContext.class,0);
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

	public final Instance_expressionContext instance_expression() throws RecognitionException {
		return instance_expression(0);
	}

	private Instance_expressionContext instance_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Instance_expressionContext _localctx = new Instance_expressionContext(_ctx, _parentState);
		Instance_expressionContext _prevctx = _localctx;
		int _startState = 88;
		enterRecursionRule(_localctx, 88, RULE_instance_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SelectableExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(974); 
			((SelectableExpressionContext)_localctx).parent = selectable_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(980);
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
					setState(976);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(977); 
					((SelectorExpressionContext)_localctx).selector = selector_expression();
					}
					} 
				}
				setState(982);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterMethodCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitMethodCallExpression(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterSortedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitSortedExpression(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterReadExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitReadExpression(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterConstructorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitConstructorExpression(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterFetchExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitFetchExpression(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterDocumentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitDocumentExpression(this);
		}
	}

	public final Method_expressionContext method_expression() throws RecognitionException {
		Method_expressionContext _localctx = new Method_expressionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_method_expression);
		try {
			setState(989);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				_localctx = new DocumentExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(983); 
				((DocumentExpressionContext)_localctx).exp = document_expression();
				}
				break;
			case 2:
				_localctx = new FetchExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(984); 
				((FetchExpressionContext)_localctx).exp = fetch_expression();
				}
				break;
			case 3:
				_localctx = new ReadExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(985); 
				((ReadExpressionContext)_localctx).exp = read_expression();
				}
				break;
			case 4:
				_localctx = new SortedExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(986); 
				((SortedExpressionContext)_localctx).exp = sorted_expression();
				}
				break;
			case 5:
				_localctx = new MethodCallExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(987); 
				((MethodCallExpressionContext)_localctx).exp = method_call();
				}
				break;
			case 6:
				_localctx = new ConstructorExpressionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(988); 
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

	public static class Document_expressionContext extends ParserRuleContext {
		public Document_typeContext document_type() {
			return getRuleContext(Document_typeContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
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
		enterRule(_localctx, 92, RULE_document_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(991); 
			document_type();
			setState(992); 
			match(LPAR);
			setState(993); 
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

	public static class Read_expressionContext extends ParserRuleContext {
		public ExpressionContext source;
		public TerminalNode READ() { return getToken(OParser.READ, 0); }
		public TerminalNode FROM() { return getToken(OParser.FROM, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Read_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterRead_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitRead_expression(this);
		}
	}

	public final Read_expressionContext read_expression() throws RecognitionException {
		Read_expressionContext _localctx = new Read_expressionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_read_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(995); 
			match(READ);
			setState(996); 
			match(FROM);
			setState(997); 
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
		public TerminalNode WRITE() { return getToken(OParser.WRITE, 0); }
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public TerminalNode TO() { return getToken(OParser.TO, 0); }
		public TerminalNode SEMI() { return getToken(OParser.SEMI, 0); }
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterWrite_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitWrite_statement(this);
		}
	}

	public final Write_statementContext write_statement() throws RecognitionException {
		Write_statementContext _localctx = new Write_statementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_write_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(999); 
			match(WRITE);
			setState(1000); 
			match(LPAR);
			setState(1001); 
			((Write_statementContext)_localctx).what = expression(0);
			setState(1002); 
			match(RPAR);
			setState(1003); 
			match(TO);
			setState(1004); 
			((Write_statementContext)_localctx).target = expression(0);
			setState(1005); 
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

	public static class Fetch_expressionContext extends ParserRuleContext {
		public Variable_identifierContext name;
		public ExpressionContext source;
		public ExpressionContext xfilter;
		public TerminalNode FETCH() { return getToken(OParser.FETCH, 0); }
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public TerminalNode FROM() { return getToken(OParser.FROM, 0); }
		public TerminalNode WHERE() { return getToken(OParser.WHERE, 0); }
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterFetch_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitFetch_expression(this);
		}
	}

	public final Fetch_expressionContext fetch_expression() throws RecognitionException {
		Fetch_expressionContext _localctx = new Fetch_expressionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_fetch_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1007); 
			match(FETCH);
			setState(1008); 
			match(LPAR);
			setState(1009); 
			((Fetch_expressionContext)_localctx).name = variable_identifier();
			setState(1010); 
			match(RPAR);
			setState(1011); 
			match(FROM);
			setState(1012); 
			((Fetch_expressionContext)_localctx).source = expression(0);
			setState(1013); 
			match(WHERE);
			setState(1014); 
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
		public TerminalNode SORTED() { return getToken(OParser.SORTED, 0); }
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public List<Instance_expressionContext> instance_expression() {
			return getRuleContexts(Instance_expressionContext.class);
		}
		public Instance_expressionContext instance_expression(int i) {
			return getRuleContext(Instance_expressionContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(OParser.COMMA, 0); }
		public Key_tokenContext key_token() {
			return getRuleContext(Key_tokenContext.class,0);
		}
		public TerminalNode EQ() { return getToken(OParser.EQ, 0); }
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
		enterRule(_localctx, 100, RULE_sorted_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1016); 
			match(SORTED);
			setState(1017); 
			match(LPAR);
			setState(1018); 
			((Sorted_expressionContext)_localctx).source = instance_expression(0);
			setState(1024);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1019); 
				match(COMMA);
				setState(1020); 
				key_token();
				setState(1021); 
				match(EQ);
				setState(1022); 
				((Sorted_expressionContext)_localctx).key = instance_expression(0);
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

	public static class Selector_expressionContext extends ParserRuleContext {
		public Selector_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector_expression; }
	 
		public Selector_expressionContext() { }
		public void copyFrom(Selector_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SliceSelectorContext extends Selector_expressionContext {
		public Slice_argumentsContext xslice;
		public TerminalNode LBRAK() { return getToken(OParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(OParser.RBRAK, 0); }
		public Slice_argumentsContext slice_arguments() {
			return getRuleContext(Slice_argumentsContext.class,0);
		}
		public SliceSelectorContext(Selector_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterSliceSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitSliceSelector(this);
		}
	}
	public static class MemberSelectorContext extends Selector_expressionContext {
		public Variable_identifierContext name;
		public TerminalNode DOT() { return getToken(OParser.DOT, 0); }
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public MemberSelectorContext(Selector_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterMemberSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitMemberSelector(this);
		}
	}
	public static class ItemSelectorContext extends Selector_expressionContext {
		public ExpressionContext exp;
		public TerminalNode LBRAK() { return getToken(OParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(OParser.RBRAK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ItemSelectorContext(Selector_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterItemSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitItemSelector(this);
		}
	}

	public final Selector_expressionContext selector_expression() throws RecognitionException {
		Selector_expressionContext _localctx = new Selector_expressionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_selector_expression);
		try {
			setState(1038);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				_localctx = new MemberSelectorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1028); 
				match(DOT);
				setState(1029); 
				((MemberSelectorContext)_localctx).name = variable_identifier();
				}
				break;
			case 2:
				_localctx = new ItemSelectorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1030); 
				match(LBRAK);
				setState(1031); 
				((ItemSelectorContext)_localctx).exp = expression(0);
				setState(1032); 
				match(RBRAK);
				}
				break;
			case 3:
				_localctx = new SliceSelectorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1034); 
				match(LBRAK);
				setState(1035); 
				((SliceSelectorContext)_localctx).xslice = slice_arguments();
				setState(1036); 
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
		public Category_typeContext typ;
		public Argument_assignment_listContext args;
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public Category_typeContext category_type() {
			return getRuleContext(Category_typeContext.class,0);
		}
		public TerminalNode MUTABLE() { return getToken(OParser.MUTABLE, 0); }
		public Argument_assignment_listContext argument_assignment_list() {
			return getRuleContext(Argument_assignment_listContext.class,0);
		}
		public Constructor_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterConstructor_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitConstructor_expression(this);
		}
	}

	public final Constructor_expressionContext constructor_expression() throws RecognitionException {
		Constructor_expressionContext _localctx = new Constructor_expressionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_constructor_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1041);
			_la = _input.LA(1);
			if (_la==MUTABLE) {
				{
				setState(1040); 
				match(MUTABLE);
				}
			}

			setState(1043); 
			((Constructor_expressionContext)_localctx).typ = category_type();
			setState(1044); 
			match(LPAR);
			setState(1046);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << XMARK) | (1L << MINUS) | (1L << LT) | (1L << CODE) | (1L << DOCUMENT))) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (EXECUTE - 82)) | (1L << (FETCH - 82)) | (1L << (MUTABLE - 82)) | (1L << (NULL - 82)) | (1L << (READ - 82)) | (1L << (SELF - 82)) | (1L << (SORTED - 82)) | (1L << (THIS - 82)) | (1L << (BOOLEAN_LITERAL - 82)) | (1L << (CHAR_LITERAL - 82)) | (1L << (MIN_INTEGER - 82)) | (1L << (MAX_INTEGER - 82)) | (1L << (SYMBOL_IDENTIFIER - 82)) | (1L << (TYPE_IDENTIFIER - 82)) | (1L << (VARIABLE_IDENTIFIER - 82)) | (1L << (TEXT_LITERAL - 82)) | (1L << (INTEGER_LITERAL - 82)) | (1L << (HEXA_LITERAL - 82)) | (1L << (DECIMAL_LITERAL - 82)) | (1L << (DATETIME_LITERAL - 82)))) != 0) || ((((_la - 146)) & ~0x3f) == 0 && ((1L << (_la - 146)) & ((1L << (TIME_LITERAL - 146)) | (1L << (DATE_LITERAL - 146)) | (1L << (PERIOD_LITERAL - 146)))) != 0)) {
				{
				setState(1045); 
				((Constructor_expressionContext)_localctx).args = argument_assignment_list(0);
				}
			}

			setState(1048); 
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
		int _startState = 106;
		enterRecursionRule(_localctx, 106, RULE_argument_assignment_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1055);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				_localctx = new ExpressionAssignmentListContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1051); 
				((ExpressionAssignmentListContext)_localctx).exp = expression(0);
				setState(1052);
				if (!(this.willNotBe(this.equalToken()))) throw new FailedPredicateException(this, "$parser.willNotBe($parser.equalToken())");
				}
				break;
			case 2:
				{
				_localctx = new ArgumentAssignmentListContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1054); 
				((ArgumentAssignmentListContext)_localctx).item = argument_assignment();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1062);
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
					setState(1057);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1058); 
					match(COMMA);
					setState(1059); 
					((ArgumentAssignmentListItemContext)_localctx).item = argument_assignment();
					}
					} 
				}
				setState(1064);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterArgument_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitArgument_assignment(this);
		}
	}

	public final Argument_assignmentContext argument_assignment() throws RecognitionException {
		Argument_assignmentContext _localctx = new Argument_assignmentContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_argument_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1065); 
			((Argument_assignmentContext)_localctx).name = variable_identifier();
			setState(1066); 
			assign();
			setState(1067); 
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
		enterRule(_localctx, 110, RULE_assign_instance_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1069); 
			((Assign_instance_statementContext)_localctx).inst = assignable_instance(0);
			setState(1070); 
			assign();
			setState(1071); 
			((Assign_instance_statementContext)_localctx).exp = expression(0);
			setState(1072); 
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
		enterRule(_localctx, 112, RULE_child_instance);
		try {
			setState(1080);
			switch (_input.LA(1)) {
			case DOT:
				_localctx = new MemberInstanceContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1074); 
				match(DOT);
				setState(1075); 
				((MemberInstanceContext)_localctx).name = variable_identifier();
				}
				break;
			case LBRAK:
				_localctx = new ItemInstanceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1076); 
				match(LBRAK);
				setState(1077); 
				((ItemInstanceContext)_localctx).exp = expression(0);
				setState(1078); 
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
		enterRule(_localctx, 114, RULE_assign_tuple_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1082); 
			((Assign_tuple_statementContext)_localctx).items = variable_identifier_list(0);
			setState(1083); 
			assign();
			setState(1084); 
			((Assign_tuple_statementContext)_localctx).exp = expression(0);
			setState(1085); 
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
		enterRule(_localctx, 116, RULE_null_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1087); 
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
		enterRule(_localctx, 118, RULE_declaration_list);
		int _la;
		try {
			_localctx = new FullDeclarationListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1090);
			_la = _input.LA(1);
			if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (BOOLEAN - 45)) | (1L << (CHARACTER - 45)) | (1L << (TEXT - 45)) | (1L << (INTEGER - 45)) | (1L << (DECIMAL - 45)) | (1L << (DATE - 45)) | (1L << (TIME - 45)) | (1L << (DATETIME - 45)) | (1L << (PERIOD - 45)) | (1L << (CODE - 45)) | (1L << (ABSTRACT - 45)) | (1L << (ANY - 45)) | (1L << (ATTRIBUTE - 45)) | (1L << (CATEGORY - 45)) | (1L << (ENUMERATED - 45)) | (1L << (METHOD - 45)) | (1L << (NATIVE - 45)))) != 0) || ((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (SINGLETON - 119)) | (1L << (TEST - 119)) | (1L << (TYPE_IDENTIFIER - 119)))) != 0)) {
				{
				setState(1089); 
				((FullDeclarationListContext)_localctx).items = declarations(0);
				}
			}

			setState(1092); 
			lfs();
			setState(1093); 
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitDeclarationList(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterDeclarationListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitDeclarationListItem(this);
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
		int _startState = 120;
		enterRecursionRule(_localctx, 120, RULE_declarations, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new DeclarationListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1096); 
			((DeclarationListContext)_localctx).item = declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(1104);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DeclarationListItemContext(new DeclarationsContext(_parentctx, _parentState));
					((DeclarationListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_declarations);
					setState(1098);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1099); 
					lfp();
					setState(1100); 
					((DeclarationListItemContext)_localctx).item = declaration();
					}
					} 
				}
				setState(1106);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCategoryDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCategoryDeclaration(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterResourceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitResourceDeclaration(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterAttributeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitAttributeDeclaration(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitMethodDeclaration(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitEnumDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_declaration);
		try {
			setState(1112);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				_localctx = new AttributeDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1107); 
				((AttributeDeclarationContext)_localctx).decl = attribute_declaration();
				}
				break;
			case 2:
				_localctx = new CategoryDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1108); 
				((CategoryDeclarationContext)_localctx).decl = category_declaration();
				}
				break;
			case 3:
				_localctx = new ResourceDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1109); 
				((ResourceDeclarationContext)_localctx).decl = resource_declaration();
				}
				break;
			case 4:
				_localctx = new EnumDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1110); 
				((EnumDeclarationContext)_localctx).decl = enum_declaration();
				}
				break;
			case 5:
				_localctx = new MethodDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1111); 
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterResource_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitResource_declaration(this);
		}
	}

	public final Resource_declarationContext resource_declaration() throws RecognitionException {
		Resource_declarationContext _localctx = new Resource_declarationContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_resource_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1114); 
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterEnumNativeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitEnumNativeDeclaration(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterEnumCategoryDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitEnumCategoryDeclaration(this);
		}
	}

	public final Enum_declarationContext enum_declaration() throws RecognitionException {
		Enum_declarationContext _localctx = new Enum_declarationContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_enum_declaration);
		try {
			setState(1118);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				_localctx = new EnumCategoryDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1116); 
				((EnumCategoryDeclarationContext)_localctx).decl = enum_category_declaration();
				}
				break;
			case 2:
				_localctx = new EnumNativeDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1117); 
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterNativeSymbolList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitNativeSymbolList(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterNativeSymbolListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitNativeSymbolListItem(this);
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
		int _startState = 128;
		enterRecursionRule(_localctx, 128, RULE_native_symbol_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new NativeSymbolListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1121); 
			((NativeSymbolListContext)_localctx).item = native_symbol();
			}
			_ctx.stop = _input.LT(-1);
			setState(1129);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NativeSymbolListItemContext(new Native_symbol_listContext(_parentctx, _parentState));
					((NativeSymbolListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_native_symbol_list);
					setState(1123);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1124); 
					lfp();
					setState(1125); 
					((NativeSymbolListItemContext)_localctx).item = native_symbol();
					}
					} 
				}
				setState(1131);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCategorySymbolListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCategorySymbolListItem(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCategorySymbolList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCategorySymbolList(this);
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
		int _startState = 130;
		enterRecursionRule(_localctx, 130, RULE_category_symbol_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new CategorySymbolListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1133); 
			((CategorySymbolListContext)_localctx).item = category_symbol();
			}
			_ctx.stop = _input.LT(-1);
			setState(1141);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CategorySymbolListItemContext(new Category_symbol_listContext(_parentctx, _parentState));
					((CategorySymbolListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_category_symbol_list);
					setState(1135);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1136); 
					lfp();
					setState(1137); 
					((CategorySymbolListItemContext)_localctx).item = category_symbol();
					}
					} 
				}
				setState(1143);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterSymbolList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitSymbolList(this);
		}
	}
	public static class SymbolListItemContext extends Symbol_listContext {
		public Symbol_listContext items;
		public Symbol_identifierContext item;
		public TerminalNode COMMA() { return getToken(OParser.COMMA, 0); }
		public Symbol_listContext symbol_list() {
			return getRuleContext(Symbol_listContext.class,0);
		}
		public Symbol_identifierContext symbol_identifier() {
			return getRuleContext(Symbol_identifierContext.class,0);
		}
		public SymbolListItemContext(Symbol_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterSymbolListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitSymbolListItem(this);
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
		int _startState = 132;
		enterRecursionRule(_localctx, 132, RULE_symbol_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SymbolListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1145); 
			((SymbolListContext)_localctx).item = symbol_identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(1152);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SymbolListItemContext(new Symbol_listContext(_parentctx, _parentState));
					((SymbolListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_symbol_list);
					setState(1147);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1148); 
					match(COMMA);
					setState(1149); 
					((SymbolListItemContext)_localctx).item = symbol_identifier();
					}
					} 
				}
				setState(1154);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
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

	public final Attribute_constraintContext attribute_constraint() throws RecognitionException {
		Attribute_constraintContext _localctx = new Attribute_constraintContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_attribute_constraint);
		try {
			setState(1165);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				_localctx = new MatchingListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1155); 
				match(IN);
				setState(1156); 
				((MatchingListContext)_localctx).source = list_literal();
				}
				break;
			case 2:
				_localctx = new MatchingSetContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1157); 
				match(IN);
				setState(1158); 
				((MatchingSetContext)_localctx).source = set_literal();
				}
				break;
			case 3:
				_localctx = new MatchingRangeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1159); 
				match(IN);
				setState(1160); 
				((MatchingRangeContext)_localctx).source = range_literal();
				}
				break;
			case 4:
				_localctx = new MatchingPatternContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1161); 
				match(MATCHING);
				setState(1162); 
				((MatchingPatternContext)_localctx).text = match(TEXT_LITERAL);
				}
				break;
			case 5:
				_localctx = new MatchingExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1163); 
				match(MATCHING);
				setState(1164); 
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
		public TerminalNode LBRAK() { return getToken(OParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(OParser.RBRAK, 0); }
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
		enterRule(_localctx, 136, RULE_list_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1167); 
			match(LBRAK);
			setState(1169);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << XMARK) | (1L << MINUS) | (1L << LT) | (1L << CODE) | (1L << DOCUMENT))) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (EXECUTE - 82)) | (1L << (FETCH - 82)) | (1L << (MUTABLE - 82)) | (1L << (NULL - 82)) | (1L << (READ - 82)) | (1L << (SELF - 82)) | (1L << (SORTED - 82)) | (1L << (THIS - 82)) | (1L << (BOOLEAN_LITERAL - 82)) | (1L << (CHAR_LITERAL - 82)) | (1L << (MIN_INTEGER - 82)) | (1L << (MAX_INTEGER - 82)) | (1L << (SYMBOL_IDENTIFIER - 82)) | (1L << (TYPE_IDENTIFIER - 82)) | (1L << (VARIABLE_IDENTIFIER - 82)) | (1L << (TEXT_LITERAL - 82)) | (1L << (INTEGER_LITERAL - 82)) | (1L << (HEXA_LITERAL - 82)) | (1L << (DECIMAL_LITERAL - 82)) | (1L << (DATETIME_LITERAL - 82)))) != 0) || ((((_la - 146)) & ~0x3f) == 0 && ((1L << (_la - 146)) & ((1L << (TIME_LITERAL - 146)) | (1L << (DATE_LITERAL - 146)) | (1L << (PERIOD_LITERAL - 146)))) != 0)) {
				{
				setState(1168); 
				((List_literalContext)_localctx).items = expression_list(0);
				}
			}

			setState(1171); 
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
		public TerminalNode LT() { return getToken(OParser.LT, 0); }
		public TerminalNode GT() { return getToken(OParser.GT, 0); }
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
		enterRule(_localctx, 138, RULE_set_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1173); 
			match(LT);
			setState(1175);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << XMARK) | (1L << MINUS) | (1L << LT) | (1L << CODE) | (1L << DOCUMENT))) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (EXECUTE - 82)) | (1L << (FETCH - 82)) | (1L << (MUTABLE - 82)) | (1L << (NULL - 82)) | (1L << (READ - 82)) | (1L << (SELF - 82)) | (1L << (SORTED - 82)) | (1L << (THIS - 82)) | (1L << (BOOLEAN_LITERAL - 82)) | (1L << (CHAR_LITERAL - 82)) | (1L << (MIN_INTEGER - 82)) | (1L << (MAX_INTEGER - 82)) | (1L << (SYMBOL_IDENTIFIER - 82)) | (1L << (TYPE_IDENTIFIER - 82)) | (1L << (VARIABLE_IDENTIFIER - 82)) | (1L << (TEXT_LITERAL - 82)) | (1L << (INTEGER_LITERAL - 82)) | (1L << (HEXA_LITERAL - 82)) | (1L << (DECIMAL_LITERAL - 82)) | (1L << (DATETIME_LITERAL - 82)))) != 0) || ((((_la - 146)) & ~0x3f) == 0 && ((1L << (_la - 146)) & ((1L << (TIME_LITERAL - 146)) | (1L << (DATE_LITERAL - 146)) | (1L << (PERIOD_LITERAL - 146)))) != 0)) {
				{
				setState(1174); 
				((Set_literalContext)_localctx).items = expression_list(0);
				}
			}

			setState(1177); 
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
		public TerminalNode COMMA() { return getToken(OParser.COMMA, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ValueListItemContext(Expression_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterValueListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitValueListItem(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitValueList(this);
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
		int _startState = 140;
		enterRecursionRule(_localctx, 140, RULE_expression_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ValueListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1180); 
			((ValueListContext)_localctx).item = expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1187);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ValueListItemContext(new Expression_listContext(_parentctx, _parentState));
					((ValueListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_expression_list);
					setState(1182);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1183); 
					match(COMMA);
					setState(1184); 
					((ValueListItemContext)_localctx).item = expression(0);
					}
					} 
				}
				setState(1189);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
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
		enterRule(_localctx, 142, RULE_range_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1190); 
			match(LBRAK);
			setState(1191); 
			((Range_literalContext)_localctx).low = expression(0);
			setState(1192); 
			match(RANGE);
			setState(1193); 
			((Range_literalContext)_localctx).high = expression(0);
			setState(1194); 
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
	public static class DictTypeContext extends TypedefContext {
		public TypedefContext d;
		public TerminalNode LCURL() { return getToken(OParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(OParser.RCURL, 0); }
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

	public final TypedefContext typedef() throws RecognitionException {
		return typedef(0);
	}

	private TypedefContext typedef(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypedefContext _localctx = new TypedefContext(_ctx, _parentState);
		TypedefContext _prevctx = _localctx;
		int _startState = 144;
		enterRecursionRule(_localctx, 144, RULE_typedef, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PrimaryTypeContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1197); 
			((PrimaryTypeContext)_localctx).p = primary_type();
			}
			_ctx.stop = _input.LT(-1);
			setState(1209);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1207);
					switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
					case 1:
						{
						_localctx = new SetTypeContext(new TypedefContext(_parentctx, _parentState));
						((SetTypeContext)_localctx).s = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_typedef);
						setState(1199);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1200); 
						match(LTGT);
						}
						break;
					case 2:
						{
						_localctx = new ListTypeContext(new TypedefContext(_parentctx, _parentState));
						((ListTypeContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_typedef);
						setState(1201);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1202); 
						match(LBRAK);
						setState(1203); 
						match(RBRAK);
						}
						break;
					case 3:
						{
						_localctx = new DictTypeContext(new TypedefContext(_parentctx, _parentState));
						((DictTypeContext)_localctx).d = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_typedef);
						setState(1204);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1205); 
						match(LCURL);
						setState(1206); 
						match(RCURL);
						}
						break;
					}
					} 
				}
				setState(1211);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCategoryType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCategoryType(this);
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

	public final Primary_typeContext primary_type() throws RecognitionException {
		Primary_typeContext _localctx = new Primary_typeContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_primary_type);
		try {
			setState(1214);
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
				setState(1212); 
				((NativeTypeContext)_localctx).n = native_type();
				}
				break;
			case TYPE_IDENTIFIER:
				_localctx = new CategoryTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1213); 
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
	public static class TimeTypeContext extends Native_typeContext {
		public Token t1;
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
	public static class TextTypeContext extends Native_typeContext {
		public Token t1;
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
	public static class CodeTypeContext extends Native_typeContext {
		public Token t1;
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
	public static class IntegerTypeContext extends Native_typeContext {
		public Token t1;
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
	public static class DecimalTypeContext extends Native_typeContext {
		public Token t1;
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
	public static class PeriodTypeContext extends Native_typeContext {
		public Token t1;
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
	public static class DateTypeContext extends Native_typeContext {
		public Token t1;
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
	public static class CharacterTypeContext extends Native_typeContext {
		public Token t1;
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
	public static class BooleanTypeContext extends Native_typeContext {
		public Token t1;
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

	public final Native_typeContext native_type() throws RecognitionException {
		Native_typeContext _localctx = new Native_typeContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_native_type);
		try {
			setState(1226);
			switch (_input.LA(1)) {
			case BOOLEAN:
				_localctx = new BooleanTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1216); 
				((BooleanTypeContext)_localctx).t1 = match(BOOLEAN);
				}
				break;
			case CHARACTER:
				_localctx = new CharacterTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1217); 
				((CharacterTypeContext)_localctx).t1 = match(CHARACTER);
				}
				break;
			case TEXT:
				_localctx = new TextTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1218); 
				((TextTypeContext)_localctx).t1 = match(TEXT);
				}
				break;
			case INTEGER:
				_localctx = new IntegerTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1219); 
				((IntegerTypeContext)_localctx).t1 = match(INTEGER);
				}
				break;
			case DECIMAL:
				_localctx = new DecimalTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1220); 
				((DecimalTypeContext)_localctx).t1 = match(DECIMAL);
				}
				break;
			case DATE:
				_localctx = new DateTypeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1221); 
				((DateTypeContext)_localctx).t1 = match(DATE);
				}
				break;
			case DATETIME:
				_localctx = new DateTimeTypeContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1222); 
				((DateTimeTypeContext)_localctx).t1 = match(DATETIME);
				}
				break;
			case TIME:
				_localctx = new TimeTypeContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1223); 
				((TimeTypeContext)_localctx).t1 = match(TIME);
				}
				break;
			case PERIOD:
				_localctx = new PeriodTypeContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1224); 
				((PeriodTypeContext)_localctx).t1 = match(PERIOD);
				}
				break;
			case CODE:
				_localctx = new CodeTypeContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1225); 
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
		enterRule(_localctx, 150, RULE_category_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1228); 
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
		enterRule(_localctx, 152, RULE_code_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1230); 
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
		public TerminalNode DOCUMENT() { return getToken(OParser.DOCUMENT, 0); }
		public Document_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterDocument_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitDocument_type(this);
		}
	}

	public final Document_typeContext document_type() throws RecognitionException {
		Document_typeContext _localctx = new Document_typeContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_document_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1232); 
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
		enterRule(_localctx, 156, RULE_category_declaration);
		try {
			setState(1237);
			switch (_input.LA(1)) {
			case CATEGORY:
				_localctx = new ConcreteCategoryDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1234); 
				((ConcreteCategoryDeclarationContext)_localctx).decl = concrete_category_declaration();
				}
				break;
			case NATIVE:
				_localctx = new NativeCategoryDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1235); 
				((NativeCategoryDeclarationContext)_localctx).decl = native_category_declaration();
				}
				break;
			case SINGLETON:
				_localctx = new SingletonCategoryDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1236); 
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
		public TerminalNode COMMA() { return getToken(OParser.COMMA, 0); }
		public Type_identifier_listContext type_identifier_list() {
			return getRuleContext(Type_identifier_listContext.class,0);
		}
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public TypeIdentifierListItemContext(Type_identifier_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterTypeIdentifierListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitTypeIdentifierListItem(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterTypeIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitTypeIdentifierList(this);
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
		int _startState = 158;
		enterRecursionRule(_localctx, 158, RULE_type_identifier_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new TypeIdentifierListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1240); 
			((TypeIdentifierListContext)_localctx).item = type_identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(1247);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeIdentifierListItemContext(new Type_identifier_listContext(_parentctx, _parentState));
					((TypeIdentifierListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_type_identifier_list);
					setState(1242);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1243); 
					match(COMMA);
					setState(1244); 
					((TypeIdentifierListItemContext)_localctx).item = type_identifier();
					}
					} 
				}
				setState(1249);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterMethodVariableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitMethodVariableIdentifier(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterMethodTypeIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitMethodTypeIdentifier(this);
		}
	}

	public final Method_identifierContext method_identifier() throws RecognitionException {
		Method_identifierContext _localctx = new Method_identifierContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_method_identifier);
		try {
			setState(1252);
			switch (_input.LA(1)) {
			case VARIABLE_IDENTIFIER:
				_localctx = new MethodVariableIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1250); 
				((MethodVariableIdentifierContext)_localctx).name = variable_identifier();
				}
				break;
			case TYPE_IDENTIFIER:
				_localctx = new MethodTypeIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1251); 
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterSymbolIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitSymbolIdentifier(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterVariableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitVariableIdentifier(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterTypeIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitTypeIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_identifier);
		try {
			setState(1257);
			switch (_input.LA(1)) {
			case VARIABLE_IDENTIFIER:
				_localctx = new VariableIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1254); 
				((VariableIdentifierContext)_localctx).name = variable_identifier();
				}
				break;
			case TYPE_IDENTIFIER:
				_localctx = new TypeIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1255); 
				((TypeIdentifierContext)_localctx).name = type_identifier();
				}
				break;
			case SYMBOL_IDENTIFIER:
				_localctx = new SymbolIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1256); 
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
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(OParser.VARIABLE_IDENTIFIER, 0); }
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
		enterRule(_localctx, 164, RULE_variable_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1259); 
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
		enterRule(_localctx, 166, RULE_type_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1261); 
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
		enterRule(_localctx, 168, RULE_symbol_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1263); 
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
		public TerminalNode COMMA() { return getToken(OParser.COMMA, 0); }
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public ArgumentListItemContext(Argument_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterArgumentListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitArgumentListItem(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitArgumentList(this);
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
		int _startState = 170;
		enterRecursionRule(_localctx, 170, RULE_argument_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1266); 
			((ArgumentListContext)_localctx).item = argument();
			}
			_ctx.stop = _input.LT(-1);
			setState(1273);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArgumentListItemContext(new Argument_listContext(_parentctx, _parentState));
					((ArgumentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_argument_list);
					setState(1268);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1269); 
					match(COMMA);
					setState(1270); 
					((ArgumentListItemContext)_localctx).item = argument();
					}
					} 
				}
				setState(1275);
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
		enterRule(_localctx, 172, RULE_argument);
		int _la;
		try {
			setState(1281);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				_localctx = new CodeArgumentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1276); 
				((CodeArgumentContext)_localctx).arg = code_argument();
				}
				break;
			case 2:
				_localctx = new OperatorArgumentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1278);
				_la = _input.LA(1);
				if (_la==MUTABLE) {
					{
					setState(1277); 
					match(MUTABLE);
					}
				}

				setState(1280); 
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterNamedArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitNamedArgument(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterTypedArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitTypedArgument(this);
		}
	}

	public final Operator_argumentContext operator_argument() throws RecognitionException {
		Operator_argumentContext _localctx = new Operator_argumentContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_operator_argument);
		try {
			setState(1285);
			switch (_input.LA(1)) {
			case VARIABLE_IDENTIFIER:
				_localctx = new NamedArgumentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1283); 
				((NamedArgumentContext)_localctx).arg = named_argument();
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
			case ANY:
			case TYPE_IDENTIFIER:
				_localctx = new TypedArgumentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1284); 
				((TypedArgumentContext)_localctx).arg = typed_argument();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 176, RULE_named_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1287); 
			((Named_argumentContext)_localctx).name = variable_identifier();
			setState(1290);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				setState(1288); 
				match(EQ);
				setState(1289); 
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCode_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCode_argument(this);
		}
	}

	public final Code_argumentContext code_argument() throws RecognitionException {
		Code_argumentContext _localctx = new Code_argumentContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_code_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1292); 
			code_type();
			setState(1293); 
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterAnyArgumentType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitAnyArgumentType(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCategoryArgumentType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCategoryArgumentType(this);
		}
	}

	public final Category_or_any_typeContext category_or_any_type() throws RecognitionException {
		Category_or_any_typeContext _localctx = new Category_or_any_typeContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_category_or_any_type);
		try {
			setState(1297);
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
				setState(1295); 
				((CategoryArgumentTypeContext)_localctx).typ = typedef(0);
				}
				break;
			case ANY:
				_localctx = new AnyArgumentTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1296); 
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
	public static class AnyListTypeContext extends Any_typeContext {
		public Any_typeContext typ;
		public TerminalNode LBRAK() { return getToken(OParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(OParser.RBRAK, 0); }
		public Any_typeContext any_type() {
			return getRuleContext(Any_typeContext.class,0);
		}
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
	public static class AnyDictTypeContext extends Any_typeContext {
		public Any_typeContext typ;
		public TerminalNode LCURL() { return getToken(OParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(OParser.RCURL, 0); }
		public Any_typeContext any_type() {
			return getRuleContext(Any_typeContext.class,0);
		}
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
		int _startState = 182;
		enterRecursionRule(_localctx, 182, RULE_any_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AnyTypeContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1300); 
			match(ANY);
			}
			_ctx.stop = _input.LT(-1);
			setState(1310);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1308);
					switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
					case 1:
						{
						_localctx = new AnyListTypeContext(new Any_typeContext(_parentctx, _parentState));
						((AnyListTypeContext)_localctx).typ = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_any_type);
						setState(1302);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1303); 
						match(LBRAK);
						setState(1304); 
						match(RBRAK);
						}
						break;
					case 2:
						{
						_localctx = new AnyDictTypeContext(new Any_typeContext(_parentctx, _parentState));
						((AnyDictTypeContext)_localctx).typ = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_any_type);
						setState(1305);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1306); 
						match(LCURL);
						setState(1307); 
						match(RCURL);
						}
						break;
					}
					} 
				}
				setState(1312);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCategoryMethodList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCategoryMethodList(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCategoryMethodListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCategoryMethodListItem(this);
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
		int _startState = 184;
		enterRecursionRule(_localctx, 184, RULE_member_method_declaration_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new CategoryMethodListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1314); 
			((CategoryMethodListContext)_localctx).item = member_method_declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(1322);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CategoryMethodListItemContext(new Member_method_declaration_listContext(_parentctx, _parentState));
					((CategoryMethodListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_member_method_declaration_list);
					setState(1316);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1317); 
					lfp();
					setState(1318); 
					((CategoryMethodListItemContext)_localctx).item = member_method_declaration();
					}
					} 
				}
				setState(1324);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
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
		public Member_method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_method_declaration; }
	 
		public Member_method_declarationContext() { }
		public void copyFrom(Member_method_declarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AbstractMemberMethodContext extends Member_method_declarationContext {
		public Abstract_method_declarationContext decl;
		public Abstract_method_declarationContext abstract_method_declaration() {
			return getRuleContext(Abstract_method_declarationContext.class,0);
		}
		public AbstractMemberMethodContext(Member_method_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterAbstractMemberMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitAbstractMemberMethod(this);
		}
	}
	public static class OperatorMemberMethodContext extends Member_method_declarationContext {
		public Operator_method_declarationContext decl;
		public Operator_method_declarationContext operator_method_declaration() {
			return getRuleContext(Operator_method_declarationContext.class,0);
		}
		public OperatorMemberMethodContext(Member_method_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterOperatorMemberMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitOperatorMemberMethod(this);
		}
	}
	public static class SetterMemberMethodContext extends Member_method_declarationContext {
		public Setter_method_declarationContext decl;
		public Setter_method_declarationContext setter_method_declaration() {
			return getRuleContext(Setter_method_declarationContext.class,0);
		}
		public SetterMemberMethodContext(Member_method_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterSetterMemberMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitSetterMemberMethod(this);
		}
	}
	public static class GetterMemberMethodContext extends Member_method_declarationContext {
		public Getter_method_declarationContext decl;
		public Getter_method_declarationContext getter_method_declaration() {
			return getRuleContext(Getter_method_declarationContext.class,0);
		}
		public GetterMemberMethodContext(Member_method_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterGetterMemberMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitGetterMemberMethod(this);
		}
	}
	public static class ConcreteMemberMethodContext extends Member_method_declarationContext {
		public Concrete_method_declarationContext decl;
		public Concrete_method_declarationContext concrete_method_declaration() {
			return getRuleContext(Concrete_method_declarationContext.class,0);
		}
		public ConcreteMemberMethodContext(Member_method_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterConcreteMemberMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitConcreteMemberMethod(this);
		}
	}

	public final Member_method_declarationContext member_method_declaration() throws RecognitionException {
		Member_method_declarationContext _localctx = new Member_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_member_method_declaration);
		try {
			setState(1330);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				_localctx = new SetterMemberMethodContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1325); 
				((SetterMemberMethodContext)_localctx).decl = setter_method_declaration();
				}
				break;
			case 2:
				_localctx = new GetterMemberMethodContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1326); 
				((GetterMemberMethodContext)_localctx).decl = getter_method_declaration();
				}
				break;
			case 3:
				_localctx = new ConcreteMemberMethodContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1327); 
				((ConcreteMemberMethodContext)_localctx).decl = concrete_method_declaration();
				}
				break;
			case 4:
				_localctx = new AbstractMemberMethodContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1328); 
				((AbstractMemberMethodContext)_localctx).decl = abstract_method_declaration();
				}
				break;
			case 5:
				_localctx = new OperatorMemberMethodContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1329); 
				((OperatorMemberMethodContext)_localctx).decl = operator_method_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Native_category_mappingContext extends ParserRuleContext {
		public Native_category_mappingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_native_category_mapping; }
	 
		public Native_category_mappingContext() { }
		public void copyFrom(Native_category_mappingContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CSharpCategoryMappingContext extends Native_category_mappingContext {
		public Csharp_identifier_expressionContext mapping;
		public TerminalNode CSHARP() { return getToken(OParser.CSHARP, 0); }
		public Csharp_identifier_expressionContext csharp_identifier_expression() {
			return getRuleContext(Csharp_identifier_expressionContext.class,0);
		}
		public CSharpCategoryMappingContext(Native_category_mappingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCSharpCategoryMapping(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCSharpCategoryMapping(this);
		}
	}
	public static class JavaCategoryMappingContext extends Native_category_mappingContext {
		public Java_class_identifier_expressionContext mapping;
		public TerminalNode JAVA() { return getToken(OParser.JAVA, 0); }
		public Java_class_identifier_expressionContext java_class_identifier_expression() {
			return getRuleContext(Java_class_identifier_expressionContext.class,0);
		}
		public JavaCategoryMappingContext(Native_category_mappingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavaCategoryMapping(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavaCategoryMapping(this);
		}
	}
	public static class JavaScriptCategoryMappingContext extends Native_category_mappingContext {
		public Javascript_category_mappingContext mapping;
		public TerminalNode JAVASCRIPT() { return getToken(OParser.JAVASCRIPT, 0); }
		public Javascript_category_mappingContext javascript_category_mapping() {
			return getRuleContext(Javascript_category_mappingContext.class,0);
		}
		public JavaScriptCategoryMappingContext(Native_category_mappingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavaScriptCategoryMapping(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavaScriptCategoryMapping(this);
		}
	}
	public static class Python3CategoryMappingContext extends Native_category_mappingContext {
		public Python_category_mappingContext mapping;
		public TerminalNode PYTHON3() { return getToken(OParser.PYTHON3, 0); }
		public Python_category_mappingContext python_category_mapping() {
			return getRuleContext(Python_category_mappingContext.class,0);
		}
		public Python3CategoryMappingContext(Native_category_mappingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPython3CategoryMapping(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPython3CategoryMapping(this);
		}
	}
	public static class Python2CategoryMappingContext extends Native_category_mappingContext {
		public Python_category_mappingContext mapping;
		public TerminalNode PYTHON2() { return getToken(OParser.PYTHON2, 0); }
		public Python_category_mappingContext python_category_mapping() {
			return getRuleContext(Python_category_mappingContext.class,0);
		}
		public Python2CategoryMappingContext(Native_category_mappingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPython2CategoryMapping(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPython2CategoryMapping(this);
		}
	}

	public final Native_category_mappingContext native_category_mapping() throws RecognitionException {
		Native_category_mappingContext _localctx = new Native_category_mappingContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_native_category_mapping);
		try {
			setState(1342);
			switch (_input.LA(1)) {
			case JAVA:
				_localctx = new JavaCategoryMappingContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1332); 
				match(JAVA);
				setState(1333); 
				((JavaCategoryMappingContext)_localctx).mapping = java_class_identifier_expression(0);
				}
				break;
			case CSHARP:
				_localctx = new CSharpCategoryMappingContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1334); 
				match(CSHARP);
				setState(1335); 
				((CSharpCategoryMappingContext)_localctx).mapping = csharp_identifier_expression(0);
				}
				break;
			case PYTHON2:
				_localctx = new Python2CategoryMappingContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1336); 
				match(PYTHON2);
				setState(1337); 
				((Python2CategoryMappingContext)_localctx).mapping = python_category_mapping();
				}
				break;
			case PYTHON3:
				_localctx = new Python3CategoryMappingContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1338); 
				match(PYTHON3);
				setState(1339); 
				((Python3CategoryMappingContext)_localctx).mapping = python_category_mapping();
				}
				break;
			case JAVASCRIPT:
				_localctx = new JavaScriptCategoryMappingContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1340); 
				match(JAVASCRIPT);
				setState(1341); 
				((JavaScriptCategoryMappingContext)_localctx).mapping = javascript_category_mapping();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Python_category_mappingContext extends ParserRuleContext {
		public IdentifierContext id_;
		public Python_moduleContext module;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Python_moduleContext python_module() {
			return getRuleContext(Python_moduleContext.class,0);
		}
		public Python_category_mappingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_python_category_mapping; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPython_category_mapping(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPython_category_mapping(this);
		}
	}

	public final Python_category_mappingContext python_category_mapping() throws RecognitionException {
		Python_category_mappingContext _localctx = new Python_category_mappingContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_python_category_mapping);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1344); 
			((Python_category_mappingContext)_localctx).id_ = identifier();
			setState(1346);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(1345); 
				((Python_category_mappingContext)_localctx).module = python_module();
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
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
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
		enterRule(_localctx, 192, RULE_python_module);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1348); 
			match(FROM);
			setState(1349); 
			module_token();
			setState(1350); 
			match(COLON);
			setState(1351); 
			identifier();
			setState(1356);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1352); 
					match(DOT);
					setState(1353); 
					identifier();
					}
					} 
				}
				setState(1358);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 194, RULE_module_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1359); 
			((Module_tokenContext)_localctx).i1 = match(VARIABLE_IDENTIFIER);
			setState(1360);
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

	public static class Javascript_category_mappingContext extends ParserRuleContext {
		public IdentifierContext id_;
		public Javascript_moduleContext module;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Javascript_moduleContext javascript_module() {
			return getRuleContext(Javascript_moduleContext.class,0);
		}
		public Javascript_category_mappingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javascript_category_mapping; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavascript_category_mapping(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavascript_category_mapping(this);
		}
	}

	public final Javascript_category_mappingContext javascript_category_mapping() throws RecognitionException {
		Javascript_category_mappingContext _localctx = new Javascript_category_mappingContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_javascript_category_mapping);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1362); 
			((Javascript_category_mappingContext)_localctx).id_ = identifier();
			setState(1364);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(1363); 
				((Javascript_category_mappingContext)_localctx).module = javascript_module();
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
		enterRule(_localctx, 198, RULE_javascript_module);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1366); 
			match(FROM);
			setState(1367); 
			module_token();
			setState(1368); 
			match(COLON);
			setState(1370);
			_la = _input.LA(1);
			if (_la==SLASH) {
				{
				setState(1369); 
				match(SLASH);
				}
			}

			setState(1372); 
			javascript_identifier();
			setState(1377);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1373); 
					match(SLASH);
					setState(1374); 
					javascript_identifier();
					}
					} 
				}
				setState(1379);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			}
			setState(1382);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				{
				setState(1380); 
				match(DOT);
				setState(1381); 
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterVariableList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitVariableList(this);
		}
	}
	public static class VariableListItemContext extends Variable_identifier_listContext {
		public Variable_identifier_listContext items;
		public Variable_identifierContext item;
		public TerminalNode COMMA() { return getToken(OParser.COMMA, 0); }
		public Variable_identifier_listContext variable_identifier_list() {
			return getRuleContext(Variable_identifier_listContext.class,0);
		}
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public VariableListItemContext(Variable_identifier_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterVariableListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitVariableListItem(this);
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
		int _startState = 200;
		enterRecursionRule(_localctx, 200, RULE_variable_identifier_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new VariableListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1385); 
			((VariableListContext)_localctx).item = variable_identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(1392);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VariableListItemContext(new Variable_identifier_listContext(_parentctx, _parentState));
					((VariableListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_variable_identifier_list);
					setState(1387);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1388); 
					match(COMMA);
					setState(1389); 
					((VariableListItemContext)_localctx).item = variable_identifier();
					}
					} 
				}
				setState(1394);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterConcreteMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitConcreteMethod(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterTestMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitTestMethod(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterAbstractMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitAbstractMethod(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterNativeMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitNativeMethod(this);
		}
	}

	public final Method_declarationContext method_declaration() throws RecognitionException {
		Method_declarationContext _localctx = new Method_declarationContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_method_declaration);
		try {
			setState(1399);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				_localctx = new AbstractMethodContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1395); 
				((AbstractMethodContext)_localctx).decl = abstract_method_declaration();
				}
				break;
			case 2:
				_localctx = new ConcreteMethodContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1396); 
				((ConcreteMethodContext)_localctx).decl = concrete_method_declaration();
				}
				break;
			case 3:
				_localctx = new NativeMethodContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1397); 
				((NativeMethodContext)_localctx).decl = native_method_declaration();
				}
				break;
			case 4:
				_localctx = new TestMethodContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1398); 
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterNativeStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitNativeStatementList(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterNativeStatementListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitNativeStatementListItem(this);
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
		int _startState = 204;
		enterRecursionRule(_localctx, 204, RULE_native_statement_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new NativeStatementListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1402); 
			((NativeStatementListContext)_localctx).item = native_statement();
			}
			_ctx.stop = _input.LT(-1);
			setState(1410);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NativeStatementListItemContext(new Native_statement_listContext(_parentctx, _parentState));
					((NativeStatementListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_native_statement_list);
					setState(1404);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1405); 
					lfp();
					setState(1406); 
					((NativeStatementListItemContext)_localctx).item = native_statement();
					}
					} 
				}
				setState(1412);
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
	public static class CSharpNativeStatementContext extends Native_statementContext {
		public Csharp_statementContext stmt;
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
		public Java_statementContext stmt;
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
	public static class JavaScriptNativeStatementContext extends Native_statementContext {
		public Javascript_native_statementContext stmt;
		public TerminalNode JAVASCRIPT() { return getToken(OParser.JAVASCRIPT, 0); }
		public Javascript_native_statementContext javascript_native_statement() {
			return getRuleContext(Javascript_native_statementContext.class,0);
		}
		public JavaScriptNativeStatementContext(Native_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavaScriptNativeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavaScriptNativeStatement(this);
		}
	}
	public static class Python3NativeStatementContext extends Native_statementContext {
		public Python_native_statementContext stmt;
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
		enterRule(_localctx, 206, RULE_native_statement);
		try {
			setState(1423);
			switch (_input.LA(1)) {
			case JAVA:
				_localctx = new JavaNativeStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1413); 
				match(JAVA);
				setState(1414); 
				((JavaNativeStatementContext)_localctx).stmt = java_statement();
				}
				break;
			case CSHARP:
				_localctx = new CSharpNativeStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1415); 
				match(CSHARP);
				setState(1416); 
				((CSharpNativeStatementContext)_localctx).stmt = csharp_statement();
				}
				break;
			case PYTHON2:
				_localctx = new Python2NativeStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1417); 
				match(PYTHON2);
				setState(1418); 
				((Python2NativeStatementContext)_localctx).stmt = python_native_statement();
				}
				break;
			case PYTHON3:
				_localctx = new Python3NativeStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1419); 
				match(PYTHON3);
				setState(1420); 
				((Python3NativeStatementContext)_localctx).stmt = python_native_statement();
				}
				break;
			case JAVASCRIPT:
				_localctx = new JavaScriptNativeStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1421); 
				match(JAVASCRIPT);
				setState(1422); 
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
		enterRule(_localctx, 208, RULE_python_native_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1425); 
			((Python_native_statementContext)_localctx).stmt = python_statement();
			setState(1427);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(1426); 
				match(SEMI);
				}
				break;
			}
			setState(1430);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				{
				setState(1429); 
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
		enterRule(_localctx, 210, RULE_javascript_native_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1432); 
			((Javascript_native_statementContext)_localctx).stmt = javascript_statement();
			setState(1434);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(1433); 
				match(SEMI);
				}
				break;
			}
			setState(1437);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				{
				setState(1436); 
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterStatementListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitStatementListItem(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitStatementList(this);
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
		int _startState = 212;
		enterRecursionRule(_localctx, 212, RULE_statement_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new StatementListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1440); 
			((StatementListContext)_localctx).item = statement();
			}
			_ctx.stop = _input.LT(-1);
			setState(1448);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StatementListItemContext(new Statement_listContext(_parentctx, _parentState));
					((StatementListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_statement_list);
					setState(1442);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1443); 
					lfp();
					setState(1444); 
					((StatementListItemContext)_localctx).item = statement();
					}
					} 
				}
				setState(1450);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterAssertionListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitAssertionListItem(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterAssertionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitAssertionList(this);
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
		int _startState = 214;
		enterRecursionRule(_localctx, 214, RULE_assertion_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AssertionListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1452); 
			((AssertionListContext)_localctx).item = assertion();
			}
			_ctx.stop = _input.LT(-1);
			setState(1460);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AssertionListItemContext(new Assertion_listContext(_parentctx, _parentState));
					((AssertionListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_assertion_list);
					setState(1454);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1455); 
					lfp();
					setState(1456); 
					((AssertionListItemContext)_localctx).item = assertion();
					}
					} 
				}
				setState(1462);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterSwitchCaseStatementListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitSwitchCaseStatementListItem(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterSwitchCaseStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitSwitchCaseStatementList(this);
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
		int _startState = 216;
		enterRecursionRule(_localctx, 216, RULE_switch_case_statement_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SwitchCaseStatementListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1464); 
			((SwitchCaseStatementListContext)_localctx).item = switch_case_statement();
			}
			_ctx.stop = _input.LT(-1);
			setState(1472);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SwitchCaseStatementListItemContext(new Switch_case_statement_listContext(_parentctx, _parentState));
					((SwitchCaseStatementListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_switch_case_statement_list);
					setState(1466);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1467); 
					lfp();
					setState(1468); 
					((SwitchCaseStatementListItemContext)_localctx).item = switch_case_statement();
					}
					} 
				}
				setState(1474);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCatchStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCatchStatementList(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCatchStatementListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCatchStatementListItem(this);
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
		int _startState = 218;
		enterRecursionRule(_localctx, 218, RULE_catch_statement_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new CatchStatementListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1476); 
			((CatchStatementListContext)_localctx).item = catch_statement();
			}
			_ctx.stop = _input.LT(-1);
			setState(1484);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CatchStatementListItemContext(new Catch_statement_listContext(_parentctx, _parentState));
					((CatchStatementListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_catch_statement_list);
					setState(1478);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1479); 
					lfp();
					setState(1480); 
					((CatchStatementListItemContext)_localctx).item = catch_statement();
					}
					} 
				}
				setState(1486);
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
		public TerminalNode LT() { return getToken(OParser.LT, 0); }
		public TerminalNode GT() { return getToken(OParser.GT, 0); }
		public Literal_list_literalContext literal_list_literal() {
			return getRuleContext(Literal_list_literalContext.class,0);
		}
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
	public static class LiteralListLiteralContext extends Literal_collectionContext {
		public Literal_list_literalContext exp;
		public TerminalNode LBRAK() { return getToken(OParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(OParser.RBRAK, 0); }
		public Literal_list_literalContext literal_list_literal() {
			return getRuleContext(Literal_list_literalContext.class,0);
		}
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

	public final Literal_collectionContext literal_collection() throws RecognitionException {
		Literal_collectionContext _localctx = new Literal_collectionContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_literal_collection);
		try {
			setState(1501);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				_localctx = new LiteralRangeLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1487); 
				match(LBRAK);
				setState(1488); 
				((LiteralRangeLiteralContext)_localctx).low = atomic_literal();
				setState(1489); 
				match(RANGE);
				setState(1490); 
				((LiteralRangeLiteralContext)_localctx).high = atomic_literal();
				setState(1491); 
				match(RBRAK);
				}
				break;
			case 2:
				_localctx = new LiteralListLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1493); 
				match(LBRAK);
				setState(1494); 
				((LiteralListLiteralContext)_localctx).exp = literal_list_literal(0);
				setState(1495); 
				match(RBRAK);
				}
				break;
			case 3:
				_localctx = new LiteralSetLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1497); 
				match(LT);
				setState(1498); 
				((LiteralSetLiteralContext)_localctx).exp = literal_list_literal(0);
				setState(1499); 
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
	public static class NullLiteralContext extends Atomic_literalContext {
		public Null_literalContext n;
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
	public static class TextLiteralContext extends Atomic_literalContext {
		public Token t;
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
	public static class HexadecimalLiteralContext extends Atomic_literalContext {
		public Token t;
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
	public static class CharacterLiteralContext extends Atomic_literalContext {
		public Token t;
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
	public static class DateLiteralContext extends Atomic_literalContext {
		public Token t;
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
	public static class TimeLiteralContext extends Atomic_literalContext {
		public Token t;
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
	public static class MaxIntegerLiteralContext extends Atomic_literalContext {
		public Token t;
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
	public static class IntegerLiteralContext extends Atomic_literalContext {
		public Token t;
		public TerminalNode INTEGER_LITERAL() { return getToken(OParser.INTEGER_LITERAL, 0); }
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
	public static class DecimalLiteralContext extends Atomic_literalContext {
		public Token t;
		public TerminalNode DECIMAL_LITERAL() { return getToken(OParser.DECIMAL_LITERAL, 0); }
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
	public static class MinIntegerLiteralContext extends Atomic_literalContext {
		public Token t;
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
	public static class DateTimeLiteralContext extends Atomic_literalContext {
		public Token t;
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
	public static class BooleanLiteralContext extends Atomic_literalContext {
		public Token t;
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

	public final Atomic_literalContext atomic_literal() throws RecognitionException {
		Atomic_literalContext _localctx = new Atomic_literalContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_atomic_literal);
		try {
			setState(1516);
			switch (_input.LA(1)) {
			case MIN_INTEGER:
				_localctx = new MinIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1503); 
				((MinIntegerLiteralContext)_localctx).t = match(MIN_INTEGER);
				}
				break;
			case MAX_INTEGER:
				_localctx = new MaxIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1504); 
				((MaxIntegerLiteralContext)_localctx).t = match(MAX_INTEGER);
				}
				break;
			case INTEGER_LITERAL:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1505); 
				((IntegerLiteralContext)_localctx).t = match(INTEGER_LITERAL);
				}
				break;
			case HEXA_LITERAL:
				_localctx = new HexadecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1506); 
				((HexadecimalLiteralContext)_localctx).t = match(HEXA_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new CharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1507); 
				((CharacterLiteralContext)_localctx).t = match(CHAR_LITERAL);
				}
				break;
			case DATE_LITERAL:
				_localctx = new DateLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1508); 
				((DateLiteralContext)_localctx).t = match(DATE_LITERAL);
				}
				break;
			case TIME_LITERAL:
				_localctx = new TimeLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1509); 
				((TimeLiteralContext)_localctx).t = match(TIME_LITERAL);
				}
				break;
			case TEXT_LITERAL:
				_localctx = new TextLiteralContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1510); 
				((TextLiteralContext)_localctx).t = match(TEXT_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1511); 
				((DecimalLiteralContext)_localctx).t = match(DECIMAL_LITERAL);
				}
				break;
			case DATETIME_LITERAL:
				_localctx = new DateTimeLiteralContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1512); 
				((DateTimeLiteralContext)_localctx).t = match(DATETIME_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(1513); 
				((BooleanLiteralContext)_localctx).t = match(BOOLEAN_LITERAL);
				}
				break;
			case PERIOD_LITERAL:
				_localctx = new PeriodLiteralContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(1514); 
				((PeriodLiteralContext)_localctx).t = match(PERIOD_LITERAL);
				}
				break;
			case NULL:
				_localctx = new NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(1515); 
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterLiteralList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitLiteralList(this);
		}
	}
	public static class LiteralListItemContext extends Literal_list_literalContext {
		public Literal_list_literalContext items;
		public Atomic_literalContext item;
		public TerminalNode COMMA() { return getToken(OParser.COMMA, 0); }
		public Literal_list_literalContext literal_list_literal() {
			return getRuleContext(Literal_list_literalContext.class,0);
		}
		public Atomic_literalContext atomic_literal() {
			return getRuleContext(Atomic_literalContext.class,0);
		}
		public LiteralListItemContext(Literal_list_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterLiteralListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitLiteralListItem(this);
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
		int _startState = 224;
		enterRecursionRule(_localctx, 224, RULE_literal_list_literal, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new LiteralListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1519); 
			((LiteralListContext)_localctx).item = atomic_literal();
			}
			_ctx.stop = _input.LT(-1);
			setState(1526);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LiteralListItemContext(new Literal_list_literalContext(_parentctx, _parentState));
					((LiteralListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_literal_list_literal);
					setState(1521);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1522); 
					match(COMMA);
					setState(1523); 
					((LiteralListItemContext)_localctx).item = atomic_literal();
					}
					} 
				}
				setState(1528);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitIdentifierExpression(this);
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

	public final Selectable_expressionContext selectable_expression() throws RecognitionException {
		Selectable_expressionContext _localctx = new Selectable_expressionContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_selectable_expression);
		try {
			setState(1533);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				_localctx = new ParenthesisExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1529); 
				((ParenthesisExpressionContext)_localctx).exp = parenthesis_expression();
				}
				break;
			case 2:
				_localctx = new LiteralExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1530); 
				((LiteralExpressionContext)_localctx).exp = literal_expression();
				}
				break;
			case 3:
				_localctx = new IdentifierExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1531); 
				((IdentifierExpressionContext)_localctx).exp = identifier();
				}
				break;
			case 4:
				_localctx = new ThisExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1532); 
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
		enterRule(_localctx, 228, RULE_this_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1535);
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
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		enterRule(_localctx, 230, RULE_parenthesis_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1537); 
			match(LPAR);
			setState(1538); 
			((Parenthesis_expressionContext)_localctx).exp = expression(0);
			setState(1539); 
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCollectionLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCollectionLiteral(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterAtomicLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitAtomicLiteral(this);
		}
	}

	public final Literal_expressionContext literal_expression() throws RecognitionException {
		Literal_expressionContext _localctx = new Literal_expressionContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_literal_expression);
		try {
			setState(1543);
			switch (_input.LA(1)) {
			case NULL:
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
				setState(1541); 
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
				setState(1542); 
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterTupleLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitTupleLiteral(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterListLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitListLiteral(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterDictLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitDictLiteral(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterRangeLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitRangeLiteral(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterSetLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitSetLiteral(this);
		}
	}

	public final Collection_literalContext collection_literal() throws RecognitionException {
		Collection_literalContext _localctx = new Collection_literalContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_collection_literal);
		try {
			setState(1550);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				_localctx = new RangeLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1545); 
				((RangeLiteralContext)_localctx).exp = range_literal();
				}
				break;
			case 2:
				_localctx = new ListLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1546); 
				((ListLiteralContext)_localctx).exp = list_literal();
				}
				break;
			case 3:
				_localctx = new SetLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1547); 
				((SetLiteralContext)_localctx).exp = set_literal();
				}
				break;
			case 4:
				_localctx = new DictLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1548); 
				((DictLiteralContext)_localctx).exp = dict_literal();
				}
				break;
			case 5:
				_localctx = new TupleLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1549); 
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
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
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
		enterRule(_localctx, 236, RULE_tuple_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1552); 
			match(LPAR);
			setState(1554);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << XMARK) | (1L << MINUS) | (1L << LT) | (1L << CODE) | (1L << DOCUMENT))) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (EXECUTE - 82)) | (1L << (FETCH - 82)) | (1L << (MUTABLE - 82)) | (1L << (NULL - 82)) | (1L << (READ - 82)) | (1L << (SELF - 82)) | (1L << (SORTED - 82)) | (1L << (THIS - 82)) | (1L << (BOOLEAN_LITERAL - 82)) | (1L << (CHAR_LITERAL - 82)) | (1L << (MIN_INTEGER - 82)) | (1L << (MAX_INTEGER - 82)) | (1L << (SYMBOL_IDENTIFIER - 82)) | (1L << (TYPE_IDENTIFIER - 82)) | (1L << (VARIABLE_IDENTIFIER - 82)) | (1L << (TEXT_LITERAL - 82)) | (1L << (INTEGER_LITERAL - 82)) | (1L << (HEXA_LITERAL - 82)) | (1L << (DECIMAL_LITERAL - 82)) | (1L << (DATETIME_LITERAL - 82)))) != 0) || ((((_la - 146)) & ~0x3f) == 0 && ((1L << (_la - 146)) & ((1L << (TIME_LITERAL - 146)) | (1L << (DATE_LITERAL - 146)) | (1L << (PERIOD_LITERAL - 146)))) != 0)) {
				{
				setState(1553); 
				((Tuple_literalContext)_localctx).items = expression_tuple(0);
				}
			}

			setState(1556); 
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
		public TerminalNode LCURL() { return getToken(OParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(OParser.RCURL, 0); }
		public Dict_entry_listContext dict_entry_list() {
			return getRuleContext(Dict_entry_listContext.class,0);
		}
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
		enterRule(_localctx, 238, RULE_dict_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1558); 
			match(LCURL);
			setState(1560);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << XMARK) | (1L << MINUS) | (1L << LT) | (1L << CODE) | (1L << DOCUMENT))) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (EXECUTE - 82)) | (1L << (FETCH - 82)) | (1L << (MUTABLE - 82)) | (1L << (NULL - 82)) | (1L << (READ - 82)) | (1L << (SELF - 82)) | (1L << (SORTED - 82)) | (1L << (THIS - 82)) | (1L << (BOOLEAN_LITERAL - 82)) | (1L << (CHAR_LITERAL - 82)) | (1L << (MIN_INTEGER - 82)) | (1L << (MAX_INTEGER - 82)) | (1L << (SYMBOL_IDENTIFIER - 82)) | (1L << (TYPE_IDENTIFIER - 82)) | (1L << (VARIABLE_IDENTIFIER - 82)) | (1L << (TEXT_LITERAL - 82)) | (1L << (INTEGER_LITERAL - 82)) | (1L << (HEXA_LITERAL - 82)) | (1L << (DECIMAL_LITERAL - 82)) | (1L << (DATETIME_LITERAL - 82)))) != 0) || ((((_la - 146)) & ~0x3f) == 0 && ((1L << (_la - 146)) & ((1L << (TIME_LITERAL - 146)) | (1L << (DATE_LITERAL - 146)) | (1L << (PERIOD_LITERAL - 146)))) != 0)) {
				{
				setState(1559); 
				((Dict_literalContext)_localctx).items = dict_entry_list(0);
				}
			}

			setState(1562); 
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
		public TerminalNode COMMA() { return getToken(OParser.COMMA, 0); }
		public Expression_tupleContext expression_tuple() {
			return getRuleContext(Expression_tupleContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ValueTupleItemContext(Expression_tupleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterValueTupleItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitValueTupleItem(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterValueTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitValueTuple(this);
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
		int _startState = 240;
		enterRecursionRule(_localctx, 240, RULE_expression_tuple, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ValueTupleContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1565); 
			((ValueTupleContext)_localctx).item = expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1572);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ValueTupleItemContext(new Expression_tupleContext(_parentctx, _parentState));
					((ValueTupleItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_expression_tuple);
					setState(1567);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1568); 
					match(COMMA);
					setState(1569); 
					((ValueTupleItemContext)_localctx).item = expression(0);
					}
					} 
				}
				setState(1574);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterDictEntryList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitDictEntryList(this);
		}
	}
	public static class DictEntryListItemContext extends Dict_entry_listContext {
		public Dict_entry_listContext items;
		public Dict_entryContext item;
		public TerminalNode COMMA() { return getToken(OParser.COMMA, 0); }
		public Dict_entry_listContext dict_entry_list() {
			return getRuleContext(Dict_entry_listContext.class,0);
		}
		public Dict_entryContext dict_entry() {
			return getRuleContext(Dict_entryContext.class,0);
		}
		public DictEntryListItemContext(Dict_entry_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterDictEntryListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitDictEntryListItem(this);
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
		int _startState = 242;
		enterRecursionRule(_localctx, 242, RULE_dict_entry_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new DictEntryListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1576); 
			((DictEntryListContext)_localctx).item = dict_entry();
			}
			_ctx.stop = _input.LT(-1);
			setState(1583);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DictEntryListItemContext(new Dict_entry_listContext(_parentctx, _parentState));
					((DictEntryListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_dict_entry_list);
					setState(1578);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1579); 
					match(COMMA);
					setState(1580); 
					((DictEntryListItemContext)_localctx).item = dict_entry();
					}
					} 
				}
				setState(1585);
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

	public static class Dict_entryContext extends ParserRuleContext {
		public ExpressionContext key;
		public ExpressionContext value;
		public TerminalNode COLON() { return getToken(OParser.COLON, 0); }
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterDict_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitDict_entry(this);
		}
	}

	public final Dict_entryContext dict_entry() throws RecognitionException {
		Dict_entryContext _localctx = new Dict_entryContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_dict_entry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1586); 
			((Dict_entryContext)_localctx).key = expression(0);
			setState(1587); 
			match(COLON);
			setState(1588); 
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

	public final Slice_argumentsContext slice_arguments() throws RecognitionException {
		Slice_argumentsContext _localctx = new Slice_argumentsContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_slice_arguments);
		try {
			setState(1599);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				_localctx = new SliceFirstAndLastContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1590); 
				((SliceFirstAndLastContext)_localctx).first = expression(0);
				setState(1591); 
				match(COLON);
				setState(1592); 
				((SliceFirstAndLastContext)_localctx).last = expression(0);
				}
				break;
			case 2:
				_localctx = new SliceFirstOnlyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1594); 
				((SliceFirstOnlyContext)_localctx).first = expression(0);
				setState(1595); 
				match(COLON);
				}
				break;
			case 3:
				_localctx = new SliceLastOnlyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1597); 
				match(COLON);
				setState(1598); 
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterAssign_variable_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitAssign_variable_statement(this);
		}
	}

	public final Assign_variable_statementContext assign_variable_statement() throws RecognitionException {
		Assign_variable_statementContext _localctx = new Assign_variable_statementContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_assign_variable_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1601); 
			((Assign_variable_statementContext)_localctx).name = variable_identifier();
			setState(1602); 
			assign();
			setState(1603); 
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterRootInstance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitRootInstance(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterChildInstance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitChildInstance(this);
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
		int _startState = 250;
		enterRecursionRule(_localctx, 250, RULE_assignable_instance, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new RootInstanceContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1606); 
			((RootInstanceContext)_localctx).name = variable_identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(1612);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ChildInstanceContext(new Assignable_instanceContext(_parentctx, _parentState));
					((ChildInstanceContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_assignable_instance);
					setState(1608);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1609); 
					((ChildInstanceContext)_localctx).child = child_instance();
					}
					} 
				}
				setState(1614);
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
		public ExpressionContext exp;
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
		enterRule(_localctx, 252, RULE_is_expression);
		try {
			setState(1619);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				_localctx = new IsATypeExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1615);
				if (!(this.willBeAOrAn())) throw new FailedPredicateException(this, "$parser.willBeAOrAn()");
				setState(1616); 
				match(VARIABLE_IDENTIFIER);
				setState(1617); 
				((IsATypeExpressionContext)_localctx).typ = category_or_any_type();
				}
				break;
			case 2:
				_localctx = new IsOtherExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1618); 
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

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_operator);
		try {
			setState(1627);
			switch (_input.LA(1)) {
			case PLUS:
				_localctx = new OperatorPlusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1621); 
				match(PLUS);
				}
				break;
			case MINUS:
				_localctx = new OperatorMinusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1622); 
				match(MINUS);
				}
				break;
			case STAR:
				_localctx = new OperatorMultiplyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1623); 
				multiply();
				}
				break;
			case SLASH:
				_localctx = new OperatorDivideContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1624); 
				divide();
				}
				break;
			case BSLASH:
				_localctx = new OperatorIDivideContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1625); 
				idivide();
				}
				break;
			case PERCENT:
			case MODULO:
				_localctx = new OperatorModuloContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1626); 
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
		enterRule(_localctx, 256, RULE_key_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1629); 
			((Key_tokenContext)_localctx).i1 = match(VARIABLE_IDENTIFIER);
			setState(1630);
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
		enterRule(_localctx, 258, RULE_value_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1632); 
			((Value_tokenContext)_localctx).i1 = match(VARIABLE_IDENTIFIER);
			setState(1633);
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
		enterRule(_localctx, 260, RULE_symbols_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1635); 
			((Symbols_tokenContext)_localctx).i1 = match(VARIABLE_IDENTIFIER);
			setState(1636);
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
		enterRule(_localctx, 262, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1638); 
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
		enterRule(_localctx, 264, RULE_multiply);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1640); 
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
		enterRule(_localctx, 266, RULE_divide);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1642); 
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
		enterRule(_localctx, 268, RULE_idivide);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1644); 
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
		enterRule(_localctx, 270, RULE_modulo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1646);
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
		enterRule(_localctx, 272, RULE_lfs);
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
		enterRule(_localctx, 274, RULE_lfp);
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

	public final Javascript_statementContext javascript_statement() throws RecognitionException {
		Javascript_statementContext _localctx = new Javascript_statementContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_javascript_statement);
		try {
			setState(1659);
			switch (_input.LA(1)) {
			case RETURN:
				_localctx = new JavascriptReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1652); 
				match(RETURN);
				setState(1653); 
				((JavascriptReturnStatementContext)_localctx).exp = javascript_expression(0);
				setState(1654); 
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
			case TEST:
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
				setState(1656); 
				((JavascriptStatementContext)_localctx).exp = javascript_expression(0);
				setState(1657); 
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavascriptPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavascriptPrimaryExpression(this);
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

	public final Javascript_expressionContext javascript_expression() throws RecognitionException {
		return javascript_expression(0);
	}

	private Javascript_expressionContext javascript_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Javascript_expressionContext _localctx = new Javascript_expressionContext(_ctx, _parentState);
		Javascript_expressionContext _prevctx = _localctx;
		int _startState = 278;
		enterRecursionRule(_localctx, 278, RULE_javascript_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavascriptPrimaryExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1662); 
			((JavascriptPrimaryExpressionContext)_localctx).exp = javascript_primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(1668);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavascriptSelectorExpressionContext(new Javascript_expressionContext(_parentctx, _parentState));
					((JavascriptSelectorExpressionContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_javascript_expression);
					setState(1664);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1665); 
					((JavascriptSelectorExpressionContext)_localctx).child = javascript_selector_expression();
					}
					} 
				}
				setState(1670);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavascriptParenthesisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavascriptParenthesisExpression(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavascriptLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavascriptLiteralExpression(this);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavascriptIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavascriptIdentifierExpression(this);
		}
	}

	public final Javascript_primary_expressionContext javascript_primary_expression() throws RecognitionException {
		Javascript_primary_expressionContext _localctx = new Javascript_primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_javascript_primary_expression);
		try {
			setState(1674);
			switch (_input.LA(1)) {
			case LPAR:
				_localctx = new JavascriptParenthesisExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1671); 
				((JavascriptParenthesisExpressionContext)_localctx).exp = javascript_parenthesis_expression();
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
				_localctx = new JavascriptIdentifierExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1672); 
				((JavascriptIdentifierExpressionContext)_localctx).exp = javascript_identifier_expression(0);
				}
				break;
			case BOOLEAN_LITERAL:
			case CHAR_LITERAL:
			case TEXT_LITERAL:
			case INTEGER_LITERAL:
			case DECIMAL_LITERAL:
				_localctx = new JavascriptLiteralExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1673); 
				((JavascriptLiteralExpressionContext)_localctx).exp = javascript_literal_expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
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

	public final Javascript_selector_expressionContext javascript_selector_expression() throws RecognitionException {
		Javascript_selector_expressionContext _localctx = new Javascript_selector_expressionContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_javascript_selector_expression);
		try {
			setState(1679);
			switch (_input.LA(1)) {
			case DOT:
				_localctx = new JavascriptMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1676); 
				match(DOT);
				setState(1677); 
				((JavascriptMethodExpressionContext)_localctx).exp = javascript_method_expression();
				}
				break;
			case LBRAK:
				_localctx = new JavascriptItemExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1678); 
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
		enterRule(_localctx, 284, RULE_javascript_method_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1681); 
			((Javascript_method_expressionContext)_localctx).name = javascript_identifier();
			setState(1682); 
			match(LPAR);
			setState(1684);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD))) != 0) || ((((_la - 112)) & ~0x3f) == 0 && ((1L << (_la - 112)) & ((1L << (READ - 112)) | (1L << (TEST - 112)) | (1L << (WRITE - 112)) | (1L << (BOOLEAN_LITERAL - 112)) | (1L << (CHAR_LITERAL - 112)) | (1L << (SYMBOL_IDENTIFIER - 112)) | (1L << (TYPE_IDENTIFIER - 112)) | (1L << (VARIABLE_IDENTIFIER - 112)) | (1L << (DOLLAR_IDENTIFIER - 112)) | (1L << (TEXT_LITERAL - 112)) | (1L << (INTEGER_LITERAL - 112)) | (1L << (DECIMAL_LITERAL - 112)))) != 0)) {
				{
				setState(1683); 
				((Javascript_method_expressionContext)_localctx).args = javascript_arguments(0);
				}
			}

			setState(1686); 
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

	public final Javascript_argumentsContext javascript_arguments() throws RecognitionException {
		return javascript_arguments(0);
	}

	private Javascript_argumentsContext javascript_arguments(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Javascript_argumentsContext _localctx = new Javascript_argumentsContext(_ctx, _parentState);
		Javascript_argumentsContext _prevctx = _localctx;
		int _startState = 286;
		enterRecursionRule(_localctx, 286, RULE_javascript_arguments, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavascriptArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1689); 
			((JavascriptArgumentListContext)_localctx).item = javascript_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1696);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,133,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavascriptArgumentListItemContext(new Javascript_argumentsContext(_parentctx, _parentState));
					((JavascriptArgumentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_javascript_arguments);
					setState(1691);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1692); 
					match(COMMA);
					setState(1693); 
					((JavascriptArgumentListItemContext)_localctx).item = javascript_expression(0);
					}
					} 
				}
				setState(1698);
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
		enterRule(_localctx, 288, RULE_javascript_item_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1699); 
			match(LBRAK);
			setState(1700); 
			((Javascript_item_expressionContext)_localctx).exp = javascript_expression(0);
			setState(1701); 
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
		enterRule(_localctx, 290, RULE_javascript_parenthesis_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1703); 
			match(LPAR);
			setState(1704); 
			((Javascript_parenthesis_expressionContext)_localctx).exp = javascript_expression(0);
			setState(1705); 
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavascriptIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavascriptIdentifier(this);
		}
	}
	public static class JavascriptChildIdentifierContext extends Javascript_identifier_expressionContext {
		public Javascript_identifier_expressionContext parent;
		public Javascript_identifierContext name;
		public TerminalNode DOT() { return getToken(OParser.DOT, 0); }
		public Javascript_identifier_expressionContext javascript_identifier_expression() {
			return getRuleContext(Javascript_identifier_expressionContext.class,0);
		}
		public Javascript_identifierContext javascript_identifier() {
			return getRuleContext(Javascript_identifierContext.class,0);
		}
		public JavascriptChildIdentifierContext(Javascript_identifier_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavascriptChildIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavascriptChildIdentifier(this);
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
		int _startState = 292;
		enterRecursionRule(_localctx, 292, RULE_javascript_identifier_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavascriptIdentifierContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1708); 
			((JavascriptIdentifierContext)_localctx).name = javascript_identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(1715);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavascriptChildIdentifierContext(new Javascript_identifier_expressionContext(_parentctx, _parentState));
					((JavascriptChildIdentifierContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_javascript_identifier_expression);
					setState(1710);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1711); 
					match(DOT);
					setState(1712); 
					((JavascriptChildIdentifierContext)_localctx).name = javascript_identifier();
					}
					} 
				}
				setState(1717);
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

	public final Javascript_literal_expressionContext javascript_literal_expression() throws RecognitionException {
		Javascript_literal_expressionContext _localctx = new Javascript_literal_expressionContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_javascript_literal_expression);
		try {
			setState(1723);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				_localctx = new JavascriptIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1718); 
				((JavascriptIntegerLiteralContext)_localctx).t = match(INTEGER_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				_localctx = new JavascriptDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1719); 
				((JavascriptDecimalLiteralContext)_localctx).t = match(DECIMAL_LITERAL);
				}
				break;
			case TEXT_LITERAL:
				_localctx = new JavascriptTextLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1720); 
				((JavascriptTextLiteralContext)_localctx).t = match(TEXT_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new JavascriptBooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1721); 
				((JavascriptBooleanLiteralContext)_localctx).t = match(BOOLEAN_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new JavascriptCharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1722); 
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
		public TerminalNode BOOLEAN() { return getToken(OParser.BOOLEAN, 0); }
		public TerminalNode CHARACTER() { return getToken(OParser.CHARACTER, 0); }
		public TerminalNode TEXT() { return getToken(OParser.TEXT, 0); }
		public TerminalNode INTEGER() { return getToken(OParser.INTEGER, 0); }
		public TerminalNode DECIMAL() { return getToken(OParser.DECIMAL, 0); }
		public TerminalNode DATE() { return getToken(OParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(OParser.TIME, 0); }
		public TerminalNode DATETIME() { return getToken(OParser.DATETIME, 0); }
		public TerminalNode PERIOD() { return getToken(OParser.PERIOD, 0); }
		public TerminalNode READ() { return getToken(OParser.READ, 0); }
		public TerminalNode WRITE() { return getToken(OParser.WRITE, 0); }
		public TerminalNode TEST() { return getToken(OParser.TEST, 0); }
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
		enterRule(_localctx, 296, RULE_javascript_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1725);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD))) != 0) || ((((_la - 112)) & ~0x3f) == 0 && ((1L << (_la - 112)) & ((1L << (READ - 112)) | (1L << (TEST - 112)) | (1L << (WRITE - 112)) | (1L << (SYMBOL_IDENTIFIER - 112)) | (1L << (TYPE_IDENTIFIER - 112)) | (1L << (VARIABLE_IDENTIFIER - 112)) | (1L << (DOLLAR_IDENTIFIER - 112)))) != 0)) ) {
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

	public final Python_statementContext python_statement() throws RecognitionException {
		Python_statementContext _localctx = new Python_statementContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_python_statement);
		try {
			setState(1730);
			switch (_input.LA(1)) {
			case RETURN:
				_localctx = new PythonReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1727); 
				match(RETURN);
				setState(1728); 
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
			case TEST:
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
				setState(1729); 
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPythonPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPythonPrimaryExpression(this);
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

	public final Python_expressionContext python_expression() throws RecognitionException {
		return python_expression(0);
	}

	private Python_expressionContext python_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Python_expressionContext _localctx = new Python_expressionContext(_ctx, _parentState);
		Python_expressionContext _prevctx = _localctx;
		int _startState = 300;
		enterRecursionRule(_localctx, 300, RULE_python_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PythonPrimaryExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1733); 
			((PythonPrimaryExpressionContext)_localctx).exp = python_primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(1739);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PythonSelectorExpressionContext(new Python_expressionContext(_parentctx, _parentState));
					((PythonSelectorExpressionContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_python_expression);
					setState(1735);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1736); 
					((PythonSelectorExpressionContext)_localctx).child = python_selector_expression();
					}
					} 
				}
				setState(1741);
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPythonIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPythonIdentifierExpression(this);
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

	public final Python_primary_expressionContext python_primary_expression() throws RecognitionException {
		Python_primary_expressionContext _localctx = new Python_primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_python_primary_expression);
		try {
			setState(1746);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				_localctx = new PythonParenthesisExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1742); 
				((PythonParenthesisExpressionContext)_localctx).exp = python_parenthesis_expression();
				}
				break;
			case 2:
				_localctx = new PythonIdentifierExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1743); 
				((PythonIdentifierExpressionContext)_localctx).exp = python_identifier_expression(0);
				}
				break;
			case 3:
				_localctx = new PythonLiteralExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1744); 
				((PythonLiteralExpressionContext)_localctx).exp = python_literal_expression();
				}
				break;
			case 4:
				_localctx = new PythonGlobalMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1745); 
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

	public final Python_selector_expressionContext python_selector_expression() throws RecognitionException {
		Python_selector_expressionContext _localctx = new Python_selector_expressionContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_python_selector_expression);
		try {
			setState(1754);
			switch (_input.LA(1)) {
			case DOT:
				_localctx = new PythonMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1748); 
				match(DOT);
				setState(1749); 
				((PythonMethodExpressionContext)_localctx).exp = python_method_expression();
				}
				break;
			case LBRAK:
				_localctx = new PythonItemExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1750); 
				match(LBRAK);
				setState(1751); 
				((PythonItemExpressionContext)_localctx).exp = python_expression(0);
				setState(1752); 
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
		enterRule(_localctx, 306, RULE_python_method_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1756); 
			((Python_method_expressionContext)_localctx).name = python_identifier();
			setState(1757); 
			match(LPAR);
			setState(1759);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD))) != 0) || ((((_la - 112)) & ~0x3f) == 0 && ((1L << (_la - 112)) & ((1L << (READ - 112)) | (1L << (TEST - 112)) | (1L << (WRITE - 112)) | (1L << (BOOLEAN_LITERAL - 112)) | (1L << (CHAR_LITERAL - 112)) | (1L << (SYMBOL_IDENTIFIER - 112)) | (1L << (TYPE_IDENTIFIER - 112)) | (1L << (VARIABLE_IDENTIFIER - 112)) | (1L << (DOLLAR_IDENTIFIER - 112)) | (1L << (TEXT_LITERAL - 112)) | (1L << (INTEGER_LITERAL - 112)) | (1L << (DECIMAL_LITERAL - 112)))) != 0)) {
				{
				setState(1758); 
				((Python_method_expressionContext)_localctx).args = python_argument_list();
				}
			}

			setState(1761); 
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

	public final Python_argument_listContext python_argument_list() throws RecognitionException {
		Python_argument_listContext _localctx = new Python_argument_listContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_python_argument_list);
		try {
			setState(1769);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				_localctx = new PythonOrdinalOnlyArgumentListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1763); 
				((PythonOrdinalOnlyArgumentListContext)_localctx).ordinal = python_ordinal_argument_list(0);
				}
				break;
			case 2:
				_localctx = new PythonNamedOnlyArgumentListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1764); 
				((PythonNamedOnlyArgumentListContext)_localctx).named = python_named_argument_list(0);
				}
				break;
			case 3:
				_localctx = new PythonArgumentListContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1765); 
				((PythonArgumentListContext)_localctx).ordinal = python_ordinal_argument_list(0);
				setState(1766); 
				match(COMMA);
				setState(1767); 
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

	public final Python_ordinal_argument_listContext python_ordinal_argument_list() throws RecognitionException {
		return python_ordinal_argument_list(0);
	}

	private Python_ordinal_argument_listContext python_ordinal_argument_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Python_ordinal_argument_listContext _localctx = new Python_ordinal_argument_listContext(_ctx, _parentState);
		Python_ordinal_argument_listContext _prevctx = _localctx;
		int _startState = 310;
		enterRecursionRule(_localctx, 310, RULE_python_ordinal_argument_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PythonOrdinalArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1772); 
			((PythonOrdinalArgumentListContext)_localctx).item = python_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1779);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PythonOrdinalArgumentListItemContext(new Python_ordinal_argument_listContext(_parentctx, _parentState));
					((PythonOrdinalArgumentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_python_ordinal_argument_list);
					setState(1774);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1775); 
					match(COMMA);
					setState(1776); 
					((PythonOrdinalArgumentListItemContext)_localctx).item = python_expression(0);
					}
					} 
				}
				setState(1781);
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

	public final Python_named_argument_listContext python_named_argument_list() throws RecognitionException {
		return python_named_argument_list(0);
	}

	private Python_named_argument_listContext python_named_argument_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Python_named_argument_listContext _localctx = new Python_named_argument_listContext(_ctx, _parentState);
		Python_named_argument_listContext _prevctx = _localctx;
		int _startState = 312;
		enterRecursionRule(_localctx, 312, RULE_python_named_argument_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PythonNamedArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1783); 
			((PythonNamedArgumentListContext)_localctx).name = python_identifier();
			setState(1784); 
			match(EQ);
			setState(1785); 
			((PythonNamedArgumentListContext)_localctx).exp = python_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1795);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PythonNamedArgumentListItemContext(new Python_named_argument_listContext(_parentctx, _parentState));
					((PythonNamedArgumentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_python_named_argument_list);
					setState(1787);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1788); 
					match(COMMA);
					setState(1789); 
					((PythonNamedArgumentListItemContext)_localctx).name = python_identifier();
					setState(1790); 
					match(EQ);
					setState(1791); 
					((PythonNamedArgumentListItemContext)_localctx).exp = python_expression(0);
					}
					} 
				}
				setState(1797);
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
		enterRule(_localctx, 314, RULE_python_parenthesis_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1798); 
			match(LPAR);
			setState(1799); 
			((Python_parenthesis_expressionContext)_localctx).exp = python_expression(0);
			setState(1800); 
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
	public static class PythonPrestoIdentifierContext extends Python_identifier_expressionContext {
		public TerminalNode DOLLAR_IDENTIFIER() { return getToken(OParser.DOLLAR_IDENTIFIER, 0); }
		public PythonPrestoIdentifierContext(Python_identifier_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPythonPrestoIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPythonPrestoIdentifier(this);
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
		int _startState = 316;
		enterRecursionRule(_localctx, 316, RULE_python_identifier_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1805);
			switch (_input.LA(1)) {
			case DOLLAR_IDENTIFIER:
				{
				_localctx = new PythonPrestoIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1803); 
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
				_localctx = new PythonIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1804); 
				((PythonIdentifierContext)_localctx).name = python_identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1812);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PythonChildIdentifierContext(new Python_identifier_expressionContext(_parentctx, _parentState));
					((PythonChildIdentifierContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_python_identifier_expression);
					setState(1807);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1808); 
					match(DOT);
					setState(1809); 
					((PythonChildIdentifierContext)_localctx).name = python_identifier();
					}
					} 
				}
				setState(1814);
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

	public final Python_literal_expressionContext python_literal_expression() throws RecognitionException {
		Python_literal_expressionContext _localctx = new Python_literal_expressionContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_python_literal_expression);
		try {
			setState(1820);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				_localctx = new PythonIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1815); 
				((PythonIntegerLiteralContext)_localctx).t = match(INTEGER_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				_localctx = new PythonDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1816); 
				((PythonDecimalLiteralContext)_localctx).t = match(DECIMAL_LITERAL);
				}
				break;
			case TEXT_LITERAL:
				_localctx = new PythonTextLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1817); 
				((PythonTextLiteralContext)_localctx).t = match(TEXT_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new PythonBooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1818); 
				((PythonBooleanLiteralContext)_localctx).t = match(BOOLEAN_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new PythonCharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1819); 
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
		public TerminalNode TYPE_IDENTIFIER() { return getToken(OParser.TYPE_IDENTIFIER, 0); }
		public TerminalNode BOOLEAN() { return getToken(OParser.BOOLEAN, 0); }
		public TerminalNode CHARACTER() { return getToken(OParser.CHARACTER, 0); }
		public TerminalNode TEXT() { return getToken(OParser.TEXT, 0); }
		public TerminalNode INTEGER() { return getToken(OParser.INTEGER, 0); }
		public TerminalNode DECIMAL() { return getToken(OParser.DECIMAL, 0); }
		public TerminalNode DATE() { return getToken(OParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(OParser.TIME, 0); }
		public TerminalNode DATETIME() { return getToken(OParser.DATETIME, 0); }
		public TerminalNode PERIOD() { return getToken(OParser.PERIOD, 0); }
		public TerminalNode READ() { return getToken(OParser.READ, 0); }
		public TerminalNode WRITE() { return getToken(OParser.WRITE, 0); }
		public TerminalNode TEST() { return getToken(OParser.TEST, 0); }
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
		enterRule(_localctx, 320, RULE_python_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1822);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD))) != 0) || ((((_la - 112)) & ~0x3f) == 0 && ((1L << (_la - 112)) & ((1L << (READ - 112)) | (1L << (TEST - 112)) | (1L << (WRITE - 112)) | (1L << (SYMBOL_IDENTIFIER - 112)) | (1L << (TYPE_IDENTIFIER - 112)) | (1L << (VARIABLE_IDENTIFIER - 112)))) != 0)) ) {
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

	public final Java_statementContext java_statement() throws RecognitionException {
		Java_statementContext _localctx = new Java_statementContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_java_statement);
		try {
			setState(1831);
			switch (_input.LA(1)) {
			case RETURN:
				_localctx = new JavaReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1824); 
				match(RETURN);
				setState(1825); 
				((JavaReturnStatementContext)_localctx).exp = java_expression(0);
				setState(1826); 
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
			case TEST:
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
				setState(1828); 
				((JavaStatementContext)_localctx).exp = java_expression(0);
				setState(1829); 
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavaPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavaPrimaryExpression(this);
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

	public final Java_expressionContext java_expression() throws RecognitionException {
		return java_expression(0);
	}

	private Java_expressionContext java_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Java_expressionContext _localctx = new Java_expressionContext(_ctx, _parentState);
		Java_expressionContext _prevctx = _localctx;
		int _startState = 324;
		enterRecursionRule(_localctx, 324, RULE_java_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavaPrimaryExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1834); 
			((JavaPrimaryExpressionContext)_localctx).exp = java_primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(1840);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavaSelectorExpressionContext(new Java_expressionContext(_parentctx, _parentState));
					((JavaSelectorExpressionContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_java_expression);
					setState(1836);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1837); 
					((JavaSelectorExpressionContext)_localctx).child = java_selector_expression();
					}
					} 
				}
				setState(1842);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
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
		public Java_primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_primary_expression; }
	 
		public Java_primary_expressionContext() { }
		public void copyFrom(Java_primary_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class JavaIdentifierExpressionContext extends Java_primary_expressionContext {
		public Java_identifier_expressionContext exp;
		public Java_identifier_expressionContext java_identifier_expression() {
			return getRuleContext(Java_identifier_expressionContext.class,0);
		}
		public JavaIdentifierExpressionContext(Java_primary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavaIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavaIdentifierExpression(this);
		}
	}
	public static class JavaLiteralExpressionContext extends Java_primary_expressionContext {
		public Java_literal_expressionContext exp;
		public Java_literal_expressionContext java_literal_expression() {
			return getRuleContext(Java_literal_expressionContext.class,0);
		}
		public JavaLiteralExpressionContext(Java_primary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavaLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavaLiteralExpression(this);
		}
	}
	public static class JavaParenthesisExpressionContext extends Java_primary_expressionContext {
		public Java_parenthesis_expressionContext exp;
		public Java_parenthesis_expressionContext java_parenthesis_expression() {
			return getRuleContext(Java_parenthesis_expressionContext.class,0);
		}
		public JavaParenthesisExpressionContext(Java_primary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavaParenthesisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavaParenthesisExpression(this);
		}
	}

	public final Java_primary_expressionContext java_primary_expression() throws RecognitionException {
		Java_primary_expressionContext _localctx = new Java_primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_java_primary_expression);
		try {
			setState(1846);
			switch (_input.LA(1)) {
			case LPAR:
				_localctx = new JavaParenthesisExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1843); 
				((JavaParenthesisExpressionContext)_localctx).exp = java_parenthesis_expression();
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
				_localctx = new JavaIdentifierExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1844); 
				((JavaIdentifierExpressionContext)_localctx).exp = java_identifier_expression(0);
				}
				break;
			case BOOLEAN_LITERAL:
			case CHAR_LITERAL:
			case TEXT_LITERAL:
			case INTEGER_LITERAL:
			case DECIMAL_LITERAL:
				_localctx = new JavaLiteralExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1845); 
				((JavaLiteralExpressionContext)_localctx).exp = java_literal_expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 328, RULE_java_selector_expression);
		try {
			setState(1851);
			switch (_input.LA(1)) {
			case DOT:
				_localctx = new JavaMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1848); 
				match(DOT);
				setState(1849); 
				((JavaMethodExpressionContext)_localctx).exp = java_method_expression();
				}
				break;
			case LBRAK:
				_localctx = new JavaItemExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1850); 
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
		enterRule(_localctx, 330, RULE_java_method_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1853); 
			((Java_method_expressionContext)_localctx).name = java_identifier();
			setState(1854); 
			match(LPAR);
			setState(1856);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD))) != 0) || ((((_la - 112)) & ~0x3f) == 0 && ((1L << (_la - 112)) & ((1L << (READ - 112)) | (1L << (TEST - 112)) | (1L << (WRITE - 112)) | (1L << (BOOLEAN_LITERAL - 112)) | (1L << (CHAR_LITERAL - 112)) | (1L << (SYMBOL_IDENTIFIER - 112)) | (1L << (TYPE_IDENTIFIER - 112)) | (1L << (VARIABLE_IDENTIFIER - 112)) | (1L << (NATIVE_IDENTIFIER - 112)) | (1L << (DOLLAR_IDENTIFIER - 112)) | (1L << (TEXT_LITERAL - 112)) | (1L << (INTEGER_LITERAL - 112)) | (1L << (DECIMAL_LITERAL - 112)))) != 0)) {
				{
				setState(1855); 
				((Java_method_expressionContext)_localctx).args = java_arguments(0);
				}
			}

			setState(1858); 
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavaArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavaArgumentList(this);
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

	public final Java_argumentsContext java_arguments() throws RecognitionException {
		return java_arguments(0);
	}

	private Java_argumentsContext java_arguments(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Java_argumentsContext _localctx = new Java_argumentsContext(_ctx, _parentState);
		Java_argumentsContext _prevctx = _localctx;
		int _startState = 332;
		enterRecursionRule(_localctx, 332, RULE_java_arguments, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavaArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1861); 
			((JavaArgumentListContext)_localctx).item = java_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1868);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavaArgumentListItemContext(new Java_argumentsContext(_parentctx, _parentState));
					((JavaArgumentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_java_arguments);
					setState(1863);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1864); 
					match(COMMA);
					setState(1865); 
					((JavaArgumentListItemContext)_localctx).item = java_expression(0);
					}
					} 
				}
				setState(1870);
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
		enterRule(_localctx, 334, RULE_java_item_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1871); 
			match(LBRAK);
			setState(1872); 
			((Java_item_expressionContext)_localctx).exp = java_expression(0);
			setState(1873); 
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
		enterRule(_localctx, 336, RULE_java_parenthesis_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1875); 
			match(LPAR);
			setState(1876); 
			((Java_parenthesis_expressionContext)_localctx).exp = java_expression(0);
			setState(1877); 
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
		int _startState = 338;
		enterRecursionRule(_localctx, 338, RULE_java_identifier_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavaIdentifierContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1880); 
			((JavaIdentifierContext)_localctx).name = java_identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(1887);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavaChildIdentifierContext(new Java_identifier_expressionContext(_parentctx, _parentState));
					((JavaChildIdentifierContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_java_identifier_expression);
					setState(1882);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1883); 
					match(DOT);
					setState(1884); 
					((JavaChildIdentifierContext)_localctx).name = java_identifier();
					}
					} 
				}
				setState(1889);
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

	public final Java_class_identifier_expressionContext java_class_identifier_expression() throws RecognitionException {
		return java_class_identifier_expression(0);
	}

	private Java_class_identifier_expressionContext java_class_identifier_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Java_class_identifier_expressionContext _localctx = new Java_class_identifier_expressionContext(_ctx, _parentState);
		Java_class_identifier_expressionContext _prevctx = _localctx;
		int _startState = 340;
		enterRecursionRule(_localctx, 340, RULE_java_class_identifier_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavaClassIdentifierContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1891); 
			((JavaClassIdentifierContext)_localctx).klass = java_identifier_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1897);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,154,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavaChildClassIdentifierContext(new Java_class_identifier_expressionContext(_parentctx, _parentState));
					((JavaChildClassIdentifierContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_java_class_identifier_expression);
					setState(1893);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1894); 
					((JavaChildClassIdentifierContext)_localctx).name = match(DOLLAR_IDENTIFIER);
					}
					} 
				}
				setState(1899);
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

	public final Java_literal_expressionContext java_literal_expression() throws RecognitionException {
		Java_literal_expressionContext _localctx = new Java_literal_expressionContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_java_literal_expression);
		try {
			setState(1905);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				_localctx = new JavaIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1900); 
				((JavaIntegerLiteralContext)_localctx).t = match(INTEGER_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				_localctx = new JavaDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1901); 
				((JavaDecimalLiteralContext)_localctx).t = match(DECIMAL_LITERAL);
				}
				break;
			case TEXT_LITERAL:
				_localctx = new JavaTextLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1902); 
				((JavaTextLiteralContext)_localctx).t = match(TEXT_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new JavaBooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1903); 
				((JavaBooleanLiteralContext)_localctx).t = match(BOOLEAN_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new JavaCharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1904); 
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
		public TerminalNode NATIVE_IDENTIFIER() { return getToken(OParser.NATIVE_IDENTIFIER, 0); }
		public TerminalNode DOLLAR_IDENTIFIER() { return getToken(OParser.DOLLAR_IDENTIFIER, 0); }
		public TerminalNode TYPE_IDENTIFIER() { return getToken(OParser.TYPE_IDENTIFIER, 0); }
		public TerminalNode BOOLEAN() { return getToken(OParser.BOOLEAN, 0); }
		public TerminalNode CHARACTER() { return getToken(OParser.CHARACTER, 0); }
		public TerminalNode TEXT() { return getToken(OParser.TEXT, 0); }
		public TerminalNode INTEGER() { return getToken(OParser.INTEGER, 0); }
		public TerminalNode DECIMAL() { return getToken(OParser.DECIMAL, 0); }
		public TerminalNode DATE() { return getToken(OParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(OParser.TIME, 0); }
		public TerminalNode DATETIME() { return getToken(OParser.DATETIME, 0); }
		public TerminalNode PERIOD() { return getToken(OParser.PERIOD, 0); }
		public TerminalNode READ() { return getToken(OParser.READ, 0); }
		public TerminalNode WRITE() { return getToken(OParser.WRITE, 0); }
		public TerminalNode TEST() { return getToken(OParser.TEST, 0); }
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
		enterRule(_localctx, 344, RULE_java_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1907);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD))) != 0) || ((((_la - 112)) & ~0x3f) == 0 && ((1L << (_la - 112)) & ((1L << (READ - 112)) | (1L << (TEST - 112)) | (1L << (WRITE - 112)) | (1L << (SYMBOL_IDENTIFIER - 112)) | (1L << (TYPE_IDENTIFIER - 112)) | (1L << (VARIABLE_IDENTIFIER - 112)) | (1L << (NATIVE_IDENTIFIER - 112)) | (1L << (DOLLAR_IDENTIFIER - 112)))) != 0)) ) {
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

	public final Csharp_statementContext csharp_statement() throws RecognitionException {
		Csharp_statementContext _localctx = new Csharp_statementContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_csharp_statement);
		try {
			setState(1916);
			switch (_input.LA(1)) {
			case RETURN:
				_localctx = new CSharpReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1909); 
				match(RETURN);
				setState(1910); 
				((CSharpReturnStatementContext)_localctx).exp = csharp_expression(0);
				setState(1911); 
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
			case TEST:
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
				setState(1913); 
				((CSharpStatementContext)_localctx).exp = csharp_expression(0);
				setState(1914); 
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCSharpPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCSharpPrimaryExpression(this);
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

	public final Csharp_expressionContext csharp_expression() throws RecognitionException {
		return csharp_expression(0);
	}

	private Csharp_expressionContext csharp_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Csharp_expressionContext _localctx = new Csharp_expressionContext(_ctx, _parentState);
		Csharp_expressionContext _prevctx = _localctx;
		int _startState = 348;
		enterRecursionRule(_localctx, 348, RULE_csharp_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new CSharpPrimaryExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1919); 
			((CSharpPrimaryExpressionContext)_localctx).exp = csharp_primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(1925);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CSharpSelectorExpressionContext(new Csharp_expressionContext(_parentctx, _parentState));
					((CSharpSelectorExpressionContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_csharp_expression);
					setState(1921);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1922); 
					((CSharpSelectorExpressionContext)_localctx).child = csharp_selector_expression();
					}
					} 
				}
				setState(1927);
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

	public static class Csharp_primary_expressionContext extends ParserRuleContext {
		public Csharp_primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csharp_primary_expression; }
	 
		public Csharp_primary_expressionContext() { }
		public void copyFrom(Csharp_primary_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CSharpLiteralExpressionContext extends Csharp_primary_expressionContext {
		public Csharp_literal_expressionContext exp;
		public Csharp_literal_expressionContext csharp_literal_expression() {
			return getRuleContext(Csharp_literal_expressionContext.class,0);
		}
		public CSharpLiteralExpressionContext(Csharp_primary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCSharpLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCSharpLiteralExpression(this);
		}
	}
	public static class CSharpParenthesisExpressionContext extends Csharp_primary_expressionContext {
		public Csharp_parenthesis_expressionContext exp;
		public Csharp_parenthesis_expressionContext csharp_parenthesis_expression() {
			return getRuleContext(Csharp_parenthesis_expressionContext.class,0);
		}
		public CSharpParenthesisExpressionContext(Csharp_primary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCSharpParenthesisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCSharpParenthesisExpression(this);
		}
	}
	public static class CSharpIdentifierExpressionContext extends Csharp_primary_expressionContext {
		public Csharp_identifier_expressionContext exp;
		public Csharp_identifier_expressionContext csharp_identifier_expression() {
			return getRuleContext(Csharp_identifier_expressionContext.class,0);
		}
		public CSharpIdentifierExpressionContext(Csharp_primary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCSharpIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCSharpIdentifierExpression(this);
		}
	}

	public final Csharp_primary_expressionContext csharp_primary_expression() throws RecognitionException {
		Csharp_primary_expressionContext _localctx = new Csharp_primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_csharp_primary_expression);
		try {
			setState(1931);
			switch (_input.LA(1)) {
			case LPAR:
				_localctx = new CSharpParenthesisExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1928); 
				((CSharpParenthesisExpressionContext)_localctx).exp = csharp_parenthesis_expression();
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
				_localctx = new CSharpIdentifierExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1929); 
				((CSharpIdentifierExpressionContext)_localctx).exp = csharp_identifier_expression(0);
				}
				break;
			case BOOLEAN_LITERAL:
			case CHAR_LITERAL:
			case TEXT_LITERAL:
			case INTEGER_LITERAL:
			case DECIMAL_LITERAL:
				_localctx = new CSharpLiteralExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1930); 
				((CSharpLiteralExpressionContext)_localctx).exp = csharp_literal_expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
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
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCSharpItemExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCSharpItemExpression(this);
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

	public final Csharp_selector_expressionContext csharp_selector_expression() throws RecognitionException {
		Csharp_selector_expressionContext _localctx = new Csharp_selector_expressionContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_csharp_selector_expression);
		try {
			setState(1936);
			switch (_input.LA(1)) {
			case DOT:
				_localctx = new CSharpMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1933); 
				match(DOT);
				setState(1934); 
				((CSharpMethodExpressionContext)_localctx).exp = csharp_method_expression();
				}
				break;
			case LBRAK:
				_localctx = new CSharpItemExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1935); 
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
		enterRule(_localctx, 354, RULE_csharp_method_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1938); 
			((Csharp_method_expressionContext)_localctx).name = csharp_identifier();
			setState(1939); 
			match(LPAR);
			setState(1941);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD))) != 0) || ((((_la - 112)) & ~0x3f) == 0 && ((1L << (_la - 112)) & ((1L << (READ - 112)) | (1L << (TEST - 112)) | (1L << (WRITE - 112)) | (1L << (BOOLEAN_LITERAL - 112)) | (1L << (CHAR_LITERAL - 112)) | (1L << (SYMBOL_IDENTIFIER - 112)) | (1L << (TYPE_IDENTIFIER - 112)) | (1L << (VARIABLE_IDENTIFIER - 112)) | (1L << (DOLLAR_IDENTIFIER - 112)) | (1L << (TEXT_LITERAL - 112)) | (1L << (INTEGER_LITERAL - 112)) | (1L << (DECIMAL_LITERAL - 112)))) != 0)) {
				{
				setState(1940); 
				((Csharp_method_expressionContext)_localctx).args = csharp_arguments(0);
				}
			}

			setState(1943); 
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
		int _startState = 356;
		enterRecursionRule(_localctx, 356, RULE_csharp_arguments, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new CSharpArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1946); 
			((CSharpArgumentListContext)_localctx).item = csharp_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1953);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CSharpArgumentListItemContext(new Csharp_argumentsContext(_parentctx, _parentState));
					((CSharpArgumentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_csharp_arguments);
					setState(1948);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1949); 
					match(COMMA);
					setState(1950); 
					((CSharpArgumentListItemContext)_localctx).item = csharp_expression(0);
					}
					} 
				}
				setState(1955);
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
		enterRule(_localctx, 358, RULE_csharp_item_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1956); 
			match(LBRAK);
			setState(1957); 
			((Csharp_item_expressionContext)_localctx).exp = csharp_expression(0);
			setState(1958); 
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
		enterRule(_localctx, 360, RULE_csharp_parenthesis_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1960); 
			match(LPAR);
			setState(1961); 
			((Csharp_parenthesis_expressionContext)_localctx).exp = csharp_expression(0);
			setState(1962); 
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
		public TerminalNode DOLLAR_IDENTIFIER() { return getToken(OParser.DOLLAR_IDENTIFIER, 0); }
		public CSharpPrestoIdentifierContext(Csharp_identifier_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCSharpPrestoIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCSharpPrestoIdentifier(this);
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

	public final Csharp_identifier_expressionContext csharp_identifier_expression() throws RecognitionException {
		return csharp_identifier_expression(0);
	}

	private Csharp_identifier_expressionContext csharp_identifier_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Csharp_identifier_expressionContext _localctx = new Csharp_identifier_expressionContext(_ctx, _parentState);
		Csharp_identifier_expressionContext _prevctx = _localctx;
		int _startState = 362;
		enterRecursionRule(_localctx, 362, RULE_csharp_identifier_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1967);
			switch (_input.LA(1)) {
			case DOLLAR_IDENTIFIER:
				{
				_localctx = new CSharpPrestoIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1965); 
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
				setState(1966); 
				((CSharpIdentifierContext)_localctx).name = csharp_identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1974);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,163,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CSharpChildIdentifierContext(new Csharp_identifier_expressionContext(_parentctx, _parentState));
					((CSharpChildIdentifierContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_csharp_identifier_expression);
					setState(1969);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1970); 
					match(DOT);
					setState(1971); 
					((CSharpChildIdentifierContext)_localctx).name = csharp_identifier();
					}
					} 
				}
				setState(1976);
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
		enterRule(_localctx, 364, RULE_csharp_literal_expression);
		try {
			setState(1982);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				_localctx = new CSharpIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1977); 
				match(INTEGER_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				_localctx = new CSharpDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1978); 
				match(DECIMAL_LITERAL);
				}
				break;
			case TEXT_LITERAL:
				_localctx = new CSharpTextLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1979); 
				match(TEXT_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new CSharpBooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1980); 
				match(BOOLEAN_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new CSharpCharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1981); 
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
		public TerminalNode TYPE_IDENTIFIER() { return getToken(OParser.TYPE_IDENTIFIER, 0); }
		public TerminalNode BOOLEAN() { return getToken(OParser.BOOLEAN, 0); }
		public TerminalNode CHARACTER() { return getToken(OParser.CHARACTER, 0); }
		public TerminalNode TEXT() { return getToken(OParser.TEXT, 0); }
		public TerminalNode INTEGER() { return getToken(OParser.INTEGER, 0); }
		public TerminalNode DECIMAL() { return getToken(OParser.DECIMAL, 0); }
		public TerminalNode DATE() { return getToken(OParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(OParser.TIME, 0); }
		public TerminalNode DATETIME() { return getToken(OParser.DATETIME, 0); }
		public TerminalNode PERIOD() { return getToken(OParser.PERIOD, 0); }
		public TerminalNode READ() { return getToken(OParser.READ, 0); }
		public TerminalNode WRITE() { return getToken(OParser.WRITE, 0); }
		public TerminalNode TEST() { return getToken(OParser.TEST, 0); }
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
		enterRule(_localctx, 366, RULE_csharp_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1984);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD))) != 0) || ((((_la - 112)) & ~0x3f) == 0 && ((1L << (_la - 112)) & ((1L << (READ - 112)) | (1L << (TEST - 112)) | (1L << (WRITE - 112)) | (1L << (SYMBOL_IDENTIFIER - 112)) | (1L << (TYPE_IDENTIFIER - 112)) | (1L << (VARIABLE_IDENTIFIER - 112)))) != 0)) ) {
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
		case 7: 
			return derived_list_sempred((Derived_listContext)_localctx, predIndex);
		case 15: 
			return native_category_mapping_list_sempred((Native_category_mapping_listContext)_localctx, predIndex);
		case 16: 
			return attribute_list_sempred((Attribute_listContext)_localctx, predIndex);
		case 33: 
			return else_if_statement_list_sempred((Else_if_statement_listContext)_localctx, predIndex);
		case 40: 
			return callable_parent_sempred((Callable_parentContext)_localctx, predIndex);
		case 42: 
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 44: 
			return instance_expression_sempred((Instance_expressionContext)_localctx, predIndex);
		case 53: 
			return argument_assignment_list_sempred((Argument_assignment_listContext)_localctx, predIndex);
		case 60: 
			return declarations_sempred((DeclarationsContext)_localctx, predIndex);
		case 64: 
			return native_symbol_list_sempred((Native_symbol_listContext)_localctx, predIndex);
		case 65: 
			return category_symbol_list_sempred((Category_symbol_listContext)_localctx, predIndex);
		case 66: 
			return symbol_list_sempred((Symbol_listContext)_localctx, predIndex);
		case 70: 
			return expression_list_sempred((Expression_listContext)_localctx, predIndex);
		case 72: 
			return typedef_sempred((TypedefContext)_localctx, predIndex);
		case 79: 
			return type_identifier_list_sempred((Type_identifier_listContext)_localctx, predIndex);
		case 85: 
			return argument_list_sempred((Argument_listContext)_localctx, predIndex);
		case 91: 
			return any_type_sempred((Any_typeContext)_localctx, predIndex);
		case 92: 
			return member_method_declaration_list_sempred((Member_method_declaration_listContext)_localctx, predIndex);
		case 97: 
			return module_token_sempred((Module_tokenContext)_localctx, predIndex);
		case 100: 
			return variable_identifier_list_sempred((Variable_identifier_listContext)_localctx, predIndex);
		case 102: 
			return native_statement_list_sempred((Native_statement_listContext)_localctx, predIndex);
		case 106: 
			return statement_list_sempred((Statement_listContext)_localctx, predIndex);
		case 107: 
			return assertion_list_sempred((Assertion_listContext)_localctx, predIndex);
		case 108: 
			return switch_case_statement_list_sempred((Switch_case_statement_listContext)_localctx, predIndex);
		case 109: 
			return catch_statement_list_sempred((Catch_statement_listContext)_localctx, predIndex);
		case 112: 
			return literal_list_literal_sempred((Literal_list_literalContext)_localctx, predIndex);
		case 120: 
			return expression_tuple_sempred((Expression_tupleContext)_localctx, predIndex);
		case 121: 
			return dict_entry_list_sempred((Dict_entry_listContext)_localctx, predIndex);
		case 125: 
			return assignable_instance_sempred((Assignable_instanceContext)_localctx, predIndex);
		case 126: 
			return is_expression_sempred((Is_expressionContext)_localctx, predIndex);
		case 128: 
			return key_token_sempred((Key_tokenContext)_localctx, predIndex);
		case 129: 
			return value_token_sempred((Value_tokenContext)_localctx, predIndex);
		case 130: 
			return symbols_token_sempred((Symbols_tokenContext)_localctx, predIndex);
		case 139: 
			return javascript_expression_sempred((Javascript_expressionContext)_localctx, predIndex);
		case 143: 
			return javascript_arguments_sempred((Javascript_argumentsContext)_localctx, predIndex);
		case 146: 
			return javascript_identifier_expression_sempred((Javascript_identifier_expressionContext)_localctx, predIndex);
		case 150: 
			return python_expression_sempred((Python_expressionContext)_localctx, predIndex);
		case 155: 
			return python_ordinal_argument_list_sempred((Python_ordinal_argument_listContext)_localctx, predIndex);
		case 156: 
			return python_named_argument_list_sempred((Python_named_argument_listContext)_localctx, predIndex);
		case 158: 
			return python_identifier_expression_sempred((Python_identifier_expressionContext)_localctx, predIndex);
		case 162: 
			return java_expression_sempred((Java_expressionContext)_localctx, predIndex);
		case 166: 
			return java_arguments_sempred((Java_argumentsContext)_localctx, predIndex);
		case 169: 
			return java_identifier_expression_sempred((Java_identifier_expressionContext)_localctx, predIndex);
		case 170: 
			return java_class_identifier_expression_sempred((Java_class_identifier_expressionContext)_localctx, predIndex);
		case 174: 
			return csharp_expression_sempred((Csharp_expressionContext)_localctx, predIndex);
		case 178: 
			return csharp_arguments_sempred((Csharp_argumentsContext)_localctx, predIndex);
		case 181: 
			return csharp_identifier_expression_sempred((Csharp_identifier_expressionContext)_localctx, predIndex);
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
	private boolean native_category_mapping_list_sempred(Native_category_mapping_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean attribute_list_sempred(Attribute_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean else_if_statement_list_sempred(Else_if_statement_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean callable_parent_sempred(Callable_parentContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5: 
			return precpred(_ctx, 29);
		case 6: 
			return precpred(_ctx, 28);
		case 7: 
			return precpred(_ctx, 27);
		case 8: 
			return precpred(_ctx, 26);
		case 9: 
			return precpred(_ctx, 25);
		case 10: 
			return precpred(_ctx, 24);
		case 11: 
			return precpred(_ctx, 23);
		case 12: 
			return precpred(_ctx, 22);
		case 13: 
			return precpred(_ctx, 21);
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
			return precpred(_ctx, 4);
		case 28: 
			return precpred(_ctx, 20);
		case 29: 
			return precpred(_ctx, 19);
		}
		return true;
	}
	private boolean instance_expression_sempred(Instance_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 30: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean argument_assignment_list_sempred(Argument_assignment_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 31: 
			return this.willNotBe(this.equalToken());
		case 32: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean declarations_sempred(DeclarationsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 33: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean native_symbol_list_sempred(Native_symbol_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 34: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean category_symbol_list_sempred(Category_symbol_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 35: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean symbol_list_sempred(Symbol_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 36: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_list_sempred(Expression_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 37: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean typedef_sempred(TypedefContext _localctx, int predIndex) {
		switch (predIndex) {
		case 38: 
			return precpred(_ctx, 3);
		case 39: 
			return precpred(_ctx, 2);
		case 40: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean type_identifier_list_sempred(Type_identifier_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 41: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean argument_list_sempred(Argument_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 42: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean any_type_sempred(Any_typeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 43: 
			return precpred(_ctx, 2);
		case 44: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean member_method_declaration_list_sempred(Member_method_declaration_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 45: 
			return precpred(_ctx, 1);
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
	private boolean variable_identifier_list_sempred(Variable_identifier_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 47: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean native_statement_list_sempred(Native_statement_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 48: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean statement_list_sempred(Statement_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 49: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean assertion_list_sempred(Assertion_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 50: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean switch_case_statement_list_sempred(Switch_case_statement_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 51: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean catch_statement_list_sempred(Catch_statement_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 52: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean literal_list_literal_sempred(Literal_list_literalContext _localctx, int predIndex) {
		switch (predIndex) {
		case 53: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_tuple_sempred(Expression_tupleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 54: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean dict_entry_list_sempred(Dict_entry_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 55: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean assignable_instance_sempred(Assignable_instanceContext _localctx, int predIndex) {
		switch (predIndex) {
		case 56: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean is_expression_sempred(Is_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 57: 
			return this.willBeAOrAn();
		}
		return true;
	}
	private boolean key_token_sempred(Key_tokenContext _localctx, int predIndex) {
		switch (predIndex) {
		case 58: 
			return this.isText(((Key_tokenContext)_localctx).i1,"key");
		}
		return true;
	}
	private boolean value_token_sempred(Value_tokenContext _localctx, int predIndex) {
		switch (predIndex) {
		case 59: 
			return this.isText(((Value_tokenContext)_localctx).i1,"value");
		}
		return true;
	}
	private boolean symbols_token_sempred(Symbols_tokenContext _localctx, int predIndex) {
		switch (predIndex) {
		case 60: 
			return this.isText(((Symbols_tokenContext)_localctx).i1,"symbols");
		}
		return true;
	}
	private boolean javascript_expression_sempred(Javascript_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 61: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean javascript_arguments_sempred(Javascript_argumentsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 62: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean javascript_identifier_expression_sempred(Javascript_identifier_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 63: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean python_expression_sempred(Python_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 64: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean python_ordinal_argument_list_sempred(Python_ordinal_argument_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 65: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean python_named_argument_list_sempred(Python_named_argument_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 66: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean python_identifier_expression_sempred(Python_identifier_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 67: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean java_expression_sempred(Java_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 68: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean java_arguments_sempred(Java_argumentsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 69: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean java_identifier_expression_sempred(Java_identifier_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 70: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean java_class_identifier_expression_sempred(Java_class_identifier_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 71: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean csharp_expression_sempred(Csharp_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 72: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean csharp_arguments_sempred(Csharp_argumentsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 73: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean csharp_identifier_expression_sempred(Csharp_identifier_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 74: 
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u0097\u07c5\4\2\t"+
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
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\5\2\u017a\n\2\3\2\3\2\5\2\u017e\n\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\5\6\u019d\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u01a7"+
		"\n\7\3\7\3\7\5\7\u01ab\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u01b5\n"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u01bf\n\t\f\t\16\t\u01c2\13\t\3"+
		"\n\3\n\3\n\5\n\u01c7\n\n\3\n\5\n\u01ca\n\n\3\13\5\13\u01cd\n\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\5\13\u01d6\n\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\5\f\u01de\n\f\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u01e6\n\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\5\16\u01f1\n\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u01fe\n\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0212"+
		"\n\21\f\21\16\21\u0215\13\21\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u021d"+
		"\n\22\f\22\16\22\u0220\13\22\3\23\3\23\5\23\u0224\n\23\3\23\3\23\3\23"+
		"\3\23\5\23\u022a\n\23\3\23\3\23\3\23\3\24\5\24\u0230\n\24\3\24\3\24\3"+
		"\24\3\24\5\24\u0236\n\24\3\24\3\24\3\24\5\24\u023b\n\24\3\24\3\24\3\25"+
		"\5\25\u0240\n\25\3\25\3\25\3\25\3\25\3\25\5\25\u0247\n\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\5\26\u025e\n\26\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\5\30\u0268\n\30\3\30\3\30\3\30\5\30\u026d\n\30\3\31\3\31\3"+
		"\31\3\31\3\31\5\31\u0274\n\31\5\31\u0276\n\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0289"+
		"\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u02a0\n\35\5\35\u02a2\n"+
		"\35\3\35\3\35\3\36\3\36\3\36\3\36\5\36\u02aa\n\36\3\36\3\36\3\36\3\36"+
		"\3\36\5\36\u02b1\n\36\5\36\u02b3\n\36\3\37\3\37\3\37\3\37\3\37\3\37\5"+
		"\37\u02bb\n\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \5 \u02c5\n \3 \3 \3 "+
		"\3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u02da\n\"\3"+
		"\"\3\"\5\"\u02de\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\7"+
		"#\u02f0\n#\f#\16#\u02f3\13#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\5%\u02ff\n%"+
		"\3%\3%\5%\u0303\n%\3%\3%\3%\3%\3%\3%\5%\u030b\n%\3%\5%\u030e\n%\3%\3%"+
		"\3%\5%\u0313\n%\3%\5%\u0316\n%\3&\3&\3&\3&\3&\3&\5&\u031e\n&\3&\3&\3&"+
		"\3&\3&\3&\3&\3&\3&\5&\u0329\n&\3&\3&\5&\u032d\n&\3\'\3\'\5\'\u0331\n\'"+
		"\3\'\3\'\3(\3(\3(\5(\u0338\n(\3(\3(\3)\3)\3)\3)\3)\5)\u0341\n)\3*\3*\3"+
		"*\3*\3*\7*\u0348\n*\f*\16*\u034b\13*\3+\3+\3+\3+\3+\3+\5+\u0353\n+\3,"+
		"\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,"+
		"\u036c\n,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,"+
		"\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,"+
		"\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,"+
		"\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,"+
		"\3,\3,\7,\u03c9\n,\f,\16,\u03cc\13,\3-\3-\3.\3.\3.\3.\3.\7.\u03d5\n.\f"+
		".\16.\u03d8\13.\3/\3/\3/\3/\3/\3/\5/\u03e0\n/\3\60\3\60\3\60\3\60\3\61"+
		"\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\5\64\u0403\n\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\5\65\u0411\n\65\3\66\5\66\u0414\n\66\3\66\3\66\3\66\5\66\u0419\n"+
		"\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\5\67\u0422\n\67\3\67\3\67\3\67"+
		"\7\67\u0427\n\67\f\67\16\67\u042a\13\67\38\38\38\38\39\39\39\39\39\3:"+
		"\3:\3:\3:\3:\3:\5:\u043b\n:\3;\3;\3;\3;\3;\3<\3<\3=\5=\u0445\n=\3=\3="+
		"\3=\3>\3>\3>\3>\3>\3>\3>\7>\u0451\n>\f>\16>\u0454\13>\3?\3?\3?\3?\3?\5"+
		"?\u045b\n?\3@\3@\3A\3A\5A\u0461\nA\3B\3B\3B\3B\3B\3B\3B\7B\u046a\nB\f"+
		"B\16B\u046d\13B\3C\3C\3C\3C\3C\3C\3C\7C\u0476\nC\fC\16C\u0479\13C\3D\3"+
		"D\3D\3D\3D\3D\7D\u0481\nD\fD\16D\u0484\13D\3E\3E\3E\3E\3E\3E\3E\3E\3E"+
		"\3E\5E\u0490\nE\3F\3F\5F\u0494\nF\3F\3F\3G\3G\5G\u049a\nG\3G\3G\3H\3H"+
		"\3H\3H\3H\3H\7H\u04a4\nH\fH\16H\u04a7\13H\3I\3I\3I\3I\3I\3I\3J\3J\3J\3"+
		"J\3J\3J\3J\3J\3J\3J\3J\7J\u04ba\nJ\fJ\16J\u04bd\13J\3K\3K\5K\u04c1\nK"+
		"\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\5L\u04cd\nL\3M\3M\3N\3N\3O\3O\3P\3P\3P"+
		"\5P\u04d8\nP\3Q\3Q\3Q\3Q\3Q\3Q\7Q\u04e0\nQ\fQ\16Q\u04e3\13Q\3R\3R\5R\u04e7"+
		"\nR\3S\3S\3S\5S\u04ec\nS\3T\3T\3U\3U\3V\3V\3W\3W\3W\3W\3W\3W\7W\u04fa"+
		"\nW\fW\16W\u04fd\13W\3X\3X\5X\u0501\nX\3X\5X\u0504\nX\3Y\3Y\5Y\u0508\n"+
		"Y\3Z\3Z\3Z\5Z\u050d\nZ\3[\3[\3[\3\\\3\\\5\\\u0514\n\\\3]\3]\3]\3]\3]\3"+
		"]\3]\3]\3]\7]\u051f\n]\f]\16]\u0522\13]\3^\3^\3^\3^\3^\3^\3^\7^\u052b"+
		"\n^\f^\16^\u052e\13^\3_\3_\3_\3_\3_\5_\u0535\n_\3`\3`\3`\3`\3`\3`\3`\3"+
		"`\3`\3`\5`\u0541\n`\3a\3a\5a\u0545\na\3b\3b\3b\3b\3b\3b\7b\u054d\nb\f"+
		"b\16b\u0550\13b\3c\3c\3c\3d\3d\5d\u0557\nd\3e\3e\3e\3e\5e\u055d\ne\3e"+
		"\3e\3e\7e\u0562\ne\fe\16e\u0565\13e\3e\3e\5e\u0569\ne\3f\3f\3f\3f\3f\3"+
		"f\7f\u0571\nf\ff\16f\u0574\13f\3g\3g\3g\3g\5g\u057a\ng\3h\3h\3h\3h\3h"+
		"\3h\3h\7h\u0583\nh\fh\16h\u0586\13h\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\5i\u0592"+
		"\ni\3j\3j\5j\u0596\nj\3j\5j\u0599\nj\3k\3k\5k\u059d\nk\3k\5k\u05a0\nk"+
		"\3l\3l\3l\3l\3l\3l\3l\7l\u05a9\nl\fl\16l\u05ac\13l\3m\3m\3m\3m\3m\3m\3"+
		"m\7m\u05b5\nm\fm\16m\u05b8\13m\3n\3n\3n\3n\3n\3n\3n\7n\u05c1\nn\fn\16"+
		"n\u05c4\13n\3o\3o\3o\3o\3o\3o\3o\7o\u05cd\no\fo\16o\u05d0\13o\3p\3p\3"+
		"p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\5p\u05e0\np\3q\3q\3q\3q\3q\3q\3q\3"+
		"q\3q\3q\3q\3q\3q\5q\u05ef\nq\3r\3r\3r\3r\3r\3r\7r\u05f7\nr\fr\16r\u05fa"+
		"\13r\3s\3s\3s\3s\5s\u0600\ns\3t\3t\3u\3u\3u\3u\3v\3v\5v\u060a\nv\3w\3"+
		"w\3w\3w\3w\5w\u0611\nw\3x\3x\5x\u0615\nx\3x\3x\3y\3y\5y\u061b\ny\3y\3"+
		"y\3z\3z\3z\3z\3z\3z\7z\u0625\nz\fz\16z\u0628\13z\3{\3{\3{\3{\3{\3{\7{"+
		"\u0630\n{\f{\16{\u0633\13{\3|\3|\3|\3|\3}\3}\3}\3}\3}\3}\3}\3}\3}\5}\u0642"+
		"\n}\3~\3~\3~\3~\3\177\3\177\3\177\3\177\3\177\7\177\u064d\n\177\f\177"+
		"\16\177\u0650\13\177\3\u0080\3\u0080\3\u0080\3\u0080\5\u0080\u0656\n\u0080"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\5\u0081\u065e\n\u0081"+
		"\3\u0082\3\u0082\3\u0082\3\u0083\3\u0083\3\u0083\3\u0084\3\u0084\3\u0084"+
		"\3\u0085\3\u0085\3\u0086\3\u0086\3\u0087\3\u0087\3\u0088\3\u0088\3\u0089"+
		"\3\u0089\3\u008a\3\u008a\3\u008b\3\u008b\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\5\u008c\u067e\n\u008c\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\7\u008d\u0685\n\u008d\f\u008d\16\u008d\u0688\13\u008d"+
		"\3\u008e\3\u008e\3\u008e\5\u008e\u068d\n\u008e\3\u008f\3\u008f\3\u008f"+
		"\5\u008f\u0692\n\u008f\3\u0090\3\u0090\3\u0090\5\u0090\u0697\n\u0090\3"+
		"\u0090\3\u0090\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\7\u0091"+
		"\u06a1\n\u0091\f\u0091\16\u0091\u06a4\13\u0091\3\u0092\3\u0092\3\u0092"+
		"\3\u0092\3\u0093\3\u0093\3\u0093\3\u0093\3\u0094\3\u0094\3\u0094\3\u0094"+
		"\3\u0094\3\u0094\7\u0094\u06b4\n\u0094\f\u0094\16\u0094\u06b7\13\u0094"+
		"\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\5\u0095\u06be\n\u0095\3\u0096"+
		"\3\u0096\3\u0097\3\u0097\3\u0097\5\u0097\u06c5\n\u0097\3\u0098\3\u0098"+
		"\3\u0098\3\u0098\3\u0098\7\u0098\u06cc\n\u0098\f\u0098\16\u0098\u06cf"+
		"\13\u0098\3\u0099\3\u0099\3\u0099\3\u0099\5\u0099\u06d5\n\u0099\3\u009a"+
		"\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\5\u009a\u06dd\n\u009a\3\u009b"+
		"\3\u009b\3\u009b\5\u009b\u06e2\n\u009b\3\u009b\3\u009b\3\u009c\3\u009c"+
		"\3\u009c\3\u009c\3\u009c\3\u009c\5\u009c\u06ec\n\u009c\3\u009d\3\u009d"+
		"\3\u009d\3\u009d\3\u009d\3\u009d\7\u009d\u06f4\n\u009d\f\u009d\16\u009d"+
		"\u06f7\13\u009d\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e"+
		"\3\u009e\3\u009e\3\u009e\3\u009e\7\u009e\u0704\n\u009e\f\u009e\16\u009e"+
		"\u0707\13\u009e\3\u009f\3\u009f\3\u009f\3\u009f\3\u00a0\3\u00a0\3\u00a0"+
		"\5\u00a0\u0710\n\u00a0\3\u00a0\3\u00a0\3\u00a0\7\u00a0\u0715\n\u00a0\f"+
		"\u00a0\16\u00a0\u0718\13\u00a0\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1"+
		"\5\u00a1\u071f\n\u00a1\3\u00a2\3\u00a2\3\u00a3\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\3\u00a3\3\u00a3\5\u00a3\u072a\n\u00a3\3\u00a4\3\u00a4\3\u00a4"+
		"\3\u00a4\3\u00a4\7\u00a4\u0731\n\u00a4\f\u00a4\16\u00a4\u0734\13\u00a4"+
		"\3\u00a5\3\u00a5\3\u00a5\5\u00a5\u0739\n\u00a5\3\u00a6\3\u00a6\3\u00a6"+
		"\5\u00a6\u073e\n\u00a6\3\u00a7\3\u00a7\3\u00a7\5\u00a7\u0743\n\u00a7\3"+
		"\u00a7\3\u00a7\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\7\u00a8"+
		"\u074d\n\u00a8\f\u00a8\16\u00a8\u0750\13\u00a8\3\u00a9\3\u00a9\3\u00a9"+
		"\3\u00a9\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00ab\3\u00ab\3\u00ab\3\u00ab"+
		"\3\u00ab\3\u00ab\7\u00ab\u0760\n\u00ab\f\u00ab\16\u00ab\u0763\13\u00ab"+
		"\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\7\u00ac\u076a\n\u00ac\f\u00ac"+
		"\16\u00ac\u076d\13\u00ac\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\5\u00ad"+
		"\u0774\n\u00ad\3\u00ae\3\u00ae\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af"+
		"\3\u00af\3\u00af\5\u00af\u077f\n\u00af\3\u00b0\3\u00b0\3\u00b0\3\u00b0"+
		"\3\u00b0\7\u00b0\u0786\n\u00b0\f\u00b0\16\u00b0\u0789\13\u00b0\3\u00b1"+
		"\3\u00b1\3\u00b1\5\u00b1\u078e\n\u00b1\3\u00b2\3\u00b2\3\u00b2\5\u00b2"+
		"\u0793\n\u00b2\3\u00b3\3\u00b3\3\u00b3\5\u00b3\u0798\n\u00b3\3\u00b3\3"+
		"\u00b3\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\7\u00b4\u07a2\n"+
		"\u00b4\f\u00b4\16\u00b4\u07a5\13\u00b4\3\u00b5\3\u00b5\3\u00b5\3\u00b5"+
		"\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b7\3\u00b7\3\u00b7\5\u00b7\u07b2"+
		"\n\u00b7\3\u00b7\3\u00b7\3\u00b7\7\u00b7\u07b7\n\u00b7\f\u00b7\16\u00b7"+
		"\u07ba\13\u00b7\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\5\u00b8\u07c1"+
		"\n\u00b8\3\u00b9\3\u00b9\3\u00b9\2,\20 \"DRVZlz\u0082\u0084\u0086\u008e"+
		"\u0092\u00a0\u00ac\u00b8\u00ba\u00ca\u00ce\u00d6\u00d8\u00da\u00dc\u00e2"+
		"\u00f2\u00f4\u00fc\u0118\u0120\u0126\u012e\u0138\u013a\u013e\u0146\u014e"+
		"\u0154\u0156\u015e\u0166\u016c\u00ba\2\4\6\b\n\f\16\20\22\24\26\30\32"+
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
		"\2\b\3\2\35\36\4\2ww}}\4\2\"\"dd\b\2/\67rr||\u0085\u0085\u008a\u008c\u008e"+
		"\u008e\7\2/\67rr||\u0085\u0085\u008a\u008c\7\2/\67rr||\u0085\u0085\u008a"+
		"\u008e\u0824\2\u0172\3\2\2\2\4\u0183\3\2\2\2\6\u018c\3\2\2\2\b\u0192\3"+
		"\2\2\2\n\u0197\3\2\2\2\f\u01a0\3\2\2\2\16\u01ae\3\2\2\2\20\u01b8\3\2\2"+
		"\2\22\u01c9\3\2\2\2\24\u01cc\3\2\2\2\26\u01d9\3\2\2\2\30\u01e1\3\2\2\2"+
		"\32\u01e9\3\2\2\2\34\u01f6\3\2\2\2\36\u0203\3\2\2\2 \u0209\3\2\2\2\"\u0216"+
		"\3\2\2\2$\u0221\3\2\2\2&\u022f\3\2\2\2(\u023f\3\2\2\2*\u024d\3\2\2\2,"+
		"\u025f\3\2\2\2.\u0262\3\2\2\2\60\u0275\3\2\2\2\62\u0288\3\2\2\2\64\u028a"+
		"\3\2\2\2\66\u0290\3\2\2\28\u0296\3\2\2\2:\u02b2\3\2\2\2<\u02b4\3\2\2\2"+
		">\u02c1\3\2\2\2@\u02cd\3\2\2\2B\u02d3\3\2\2\2D\u02df\3\2\2\2F\u02f4\3"+
		"\2\2\2H\u02f8\3\2\2\2J\u032c\3\2\2\2L\u032e\3\2\2\2N\u0334\3\2\2\2P\u0340"+
		"\3\2\2\2R\u0342\3\2\2\2T\u0352\3\2\2\2V\u036b\3\2\2\2X\u03cd\3\2\2\2Z"+
		"\u03cf\3\2\2\2\\\u03df\3\2\2\2^\u03e1\3\2\2\2`\u03e5\3\2\2\2b\u03e9\3"+
		"\2\2\2d\u03f1\3\2\2\2f\u03fa\3\2\2\2h\u0410\3\2\2\2j\u0413\3\2\2\2l\u0421"+
		"\3\2\2\2n\u042b\3\2\2\2p\u042f\3\2\2\2r\u043a\3\2\2\2t\u043c\3\2\2\2v"+
		"\u0441\3\2\2\2x\u0444\3\2\2\2z\u0449\3\2\2\2|\u045a\3\2\2\2~\u045c\3\2"+
		"\2\2\u0080\u0460\3\2\2\2\u0082\u0462\3\2\2\2\u0084\u046e\3\2\2\2\u0086"+
		"\u047a\3\2\2\2\u0088\u048f\3\2\2\2\u008a\u0491\3\2\2\2\u008c\u0497\3\2"+
		"\2\2\u008e\u049d\3\2\2\2\u0090\u04a8\3\2\2\2\u0092\u04ae\3\2\2\2\u0094"+
		"\u04c0\3\2\2\2\u0096\u04cc\3\2\2\2\u0098\u04ce\3\2\2\2\u009a\u04d0\3\2"+
		"\2\2\u009c\u04d2\3\2\2\2\u009e\u04d7\3\2\2\2\u00a0\u04d9\3\2\2\2\u00a2"+
		"\u04e6\3\2\2\2\u00a4\u04eb\3\2\2\2\u00a6\u04ed\3\2\2\2\u00a8\u04ef\3\2"+
		"\2\2\u00aa\u04f1\3\2\2\2\u00ac\u04f3\3\2\2\2\u00ae\u0503\3\2\2\2\u00b0"+
		"\u0507\3\2\2\2\u00b2\u0509\3\2\2\2\u00b4\u050e\3\2\2\2\u00b6\u0513\3\2"+
		"\2\2\u00b8\u0515\3\2\2\2\u00ba\u0523\3\2\2\2\u00bc\u0534\3\2\2\2\u00be"+
		"\u0540\3\2\2\2\u00c0\u0542\3\2\2\2\u00c2\u0546\3\2\2\2\u00c4\u0551\3\2"+
		"\2\2\u00c6\u0554\3\2\2\2\u00c8\u0558\3\2\2\2\u00ca\u056a\3\2\2\2\u00cc"+
		"\u0579\3\2\2\2\u00ce\u057b\3\2\2\2\u00d0\u0591\3\2\2\2\u00d2\u0593\3\2"+
		"\2\2\u00d4\u059a\3\2\2\2\u00d6\u05a1\3\2\2\2\u00d8\u05ad\3\2\2\2\u00da"+
		"\u05b9\3\2\2\2\u00dc\u05c5\3\2\2\2\u00de\u05df\3\2\2\2\u00e0\u05ee\3\2"+
		"\2\2\u00e2\u05f0\3\2\2\2\u00e4\u05ff\3\2\2\2\u00e6\u0601\3\2\2\2\u00e8"+
		"\u0603\3\2\2\2\u00ea\u0609\3\2\2\2\u00ec\u0610\3\2\2\2\u00ee\u0612\3\2"+
		"\2\2\u00f0\u0618\3\2\2\2\u00f2\u061e\3\2\2\2\u00f4\u0629\3\2\2\2\u00f6"+
		"\u0634\3\2\2\2\u00f8\u0641\3\2\2\2\u00fa\u0643\3\2\2\2\u00fc\u0647\3\2"+
		"\2\2\u00fe\u0655\3\2\2\2\u0100\u065d\3\2\2\2\u0102\u065f\3\2\2\2\u0104"+
		"\u0662\3\2\2\2\u0106\u0665\3\2\2\2\u0108\u0668\3\2\2\2\u010a\u066a\3\2"+
		"\2\2\u010c\u066c\3\2\2\2\u010e\u066e\3\2\2\2\u0110\u0670\3\2\2\2\u0112"+
		"\u0672\3\2\2\2\u0114\u0674\3\2\2\2\u0116\u067d\3\2\2\2\u0118\u067f\3\2"+
		"\2\2\u011a\u068c\3\2\2\2\u011c\u0691\3\2\2\2\u011e\u0693\3\2\2\2\u0120"+
		"\u069a\3\2\2\2\u0122\u06a5\3\2\2\2\u0124\u06a9\3\2\2\2\u0126\u06ad\3\2"+
		"\2\2\u0128\u06bd\3\2\2\2\u012a\u06bf\3\2\2\2\u012c\u06c4\3\2\2\2\u012e"+
		"\u06c6\3\2\2\2\u0130\u06d4\3\2\2\2\u0132\u06dc\3\2\2\2\u0134\u06de\3\2"+
		"\2\2\u0136\u06eb\3\2\2\2\u0138\u06ed\3\2\2\2\u013a\u06f8\3\2\2\2\u013c"+
		"\u0708\3\2\2\2\u013e\u070f\3\2\2\2\u0140\u071e\3\2\2\2\u0142\u0720\3\2"+
		"\2\2\u0144\u0729\3\2\2\2\u0146\u072b\3\2\2\2\u0148\u0738\3\2\2\2\u014a"+
		"\u073d\3\2\2\2\u014c\u073f\3\2\2\2\u014e\u0746\3\2\2\2\u0150\u0751\3\2"+
		"\2\2\u0152\u0755\3\2\2\2\u0154\u0759\3\2\2\2\u0156\u0764\3\2\2\2\u0158"+
		"\u0773\3\2\2\2\u015a\u0775\3\2\2\2\u015c\u077e\3\2\2\2\u015e\u0780\3\2"+
		"\2\2\u0160\u078d\3\2\2\2\u0162\u0792\3\2\2\2\u0164\u0794\3\2\2\2\u0166"+
		"\u079b\3\2\2\2\u0168\u07a6\3\2\2\2\u016a\u07aa\3\2\2\2\u016c\u07b1\3\2"+
		"\2\2\u016e\u07c0\3\2\2\2\u0170\u07c2\3\2\2\2\u0172\u0173\7R\2\2\u0173"+
		"\u0174\7F\2\2\u0174\u0179\5\u00a8U\2\u0175\u0176\7\21\2\2\u0176\u0177"+
		"\5\"\22\2\u0177\u0178\7\22\2\2\u0178\u017a\3\2\2\2\u0179\u0175\3\2\2\2"+
		"\u0179\u017a\3\2\2\2\u017a\u017d\3\2\2\2\u017b\u017c\7V\2\2\u017c\u017e"+
		"\5\u00a8U\2\u017d\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u017f\3\2\2"+
		"\2\u017f\u0180\7\25\2\2\u0180\u0181\5\u0084C\2\u0181\u0182\7\26\2\2\u0182"+
		"\3\3\2\2\2\u0183\u0184\7R\2\2\u0184\u0185\5\u00a8U\2\u0185\u0186\7\21"+
		"\2\2\u0186\u0187\5\u0096L\2\u0187\u0188\7\22\2\2\u0188\u0189\7\25\2\2"+
		"\u0189\u018a\5\u0082B\2\u018a\u018b\7\26\2\2\u018b\5\3\2\2\2\u018c\u018d"+
		"\5\u00aaV\2\u018d\u018e\7\21\2\2\u018e\u018f\5l\67\2\u018f\u0190\7\22"+
		"\2\2\u0190\u0191\7\r\2\2\u0191\7\3\2\2\2\u0192\u0193\5\u00aaV\2\u0193"+
		"\u0194\7(\2\2\u0194\u0195\5V,\2\u0195\u0196\7\r\2\2\u0196\t\3\2\2\2\u0197"+
		"\u0198\7B\2\2\u0198\u0199\5\u00a6T\2\u0199\u019a\7\f\2\2\u019a\u019c\5"+
		"\u0092J\2\u019b\u019d\5\u0088E\2\u019c\u019b\3\2\2\2\u019c\u019d\3\2\2"+
		"\2\u019d\u019e\3\2\2\2\u019e\u019f\7\r\2\2\u019f\13\3\2\2\2\u01a0\u01a1"+
		"\7F\2\2\u01a1\u01a6\5\u00a8U\2\u01a2\u01a3\7\21\2\2\u01a3\u01a4\5\"\22"+
		"\2\u01a4\u01a5\7\22\2\2\u01a5\u01a7\3\2\2\2\u01a6\u01a2\3\2\2\2\u01a6"+
		"\u01a7\3\2\2\2\u01a7\u01aa\3\2\2\2\u01a8\u01a9\7V\2\2\u01a9\u01ab\5\20"+
		"\t\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac"+
		"\u01ad\5\22\n\2\u01ad\r\3\2\2\2\u01ae\u01af\7y\2\2\u01af\u01b4\5\u00a8"+
		"U\2\u01b0\u01b1\7\21\2\2\u01b1\u01b2\5\"\22\2\u01b2\u01b3\7\22\2\2\u01b3"+
		"\u01b5\3\2\2\2\u01b4\u01b0\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b6\3\2"+
		"\2\2\u01b6\u01b7\5\22\n\2\u01b7\17\3\2\2\2\u01b8\u01b9\b\t\1\2\u01b9\u01ba"+
		"\5\u00a8U\2\u01ba\u01c0\3\2\2\2\u01bb\u01bc\f\3\2\2\u01bc\u01bd\7\16\2"+
		"\2\u01bd\u01bf\5\u00a8U\2\u01be\u01bb\3\2\2\2\u01bf\u01c2\3\2\2\2\u01c0"+
		"\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\21\3\2\2\2\u01c2\u01c0\3\2\2"+
		"\2\u01c3\u01ca\7\r\2\2\u01c4\u01c6\7\25\2\2\u01c5\u01c7\5\u00ba^\2\u01c6"+
		"\u01c5\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01ca\7\26"+
		"\2\2\u01c9\u01c3\3\2\2\2\u01c9\u01c4\3\2\2\2\u01ca\23\3\2\2\2\u01cb\u01cd"+
		"\5\u0092J\2\u01cc\u01cb\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01ce\3\2\2"+
		"\2\u01ce\u01cf\7m\2\2\u01cf\u01d0\5\u0100\u0081\2\u01d0\u01d1\7\21\2\2"+
		"\u01d1\u01d2\5\u00b0Y\2\u01d2\u01d3\7\22\2\2\u01d3\u01d5\7\25\2\2\u01d4"+
		"\u01d6\5\u00d6l\2\u01d5\u01d4\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d7"+
		"\3\2\2\2\u01d7\u01d8\7\26\2\2\u01d8\25\3\2\2\2\u01d9\u01da\7x\2\2\u01da"+
		"\u01db\5\u00a6T\2\u01db\u01dd\7\25\2\2\u01dc\u01de\5\u00d6l\2\u01dd\u01dc"+
		"\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e0\7\26\2\2"+
		"\u01e0\27\3\2\2\2\u01e1\u01e2\7[\2\2\u01e2\u01e3\5\u00a6T\2\u01e3\u01e5"+
		"\7\25\2\2\u01e4\u01e6\5\u00d6l\2\u01e5\u01e4\3\2\2\2\u01e5\u01e6\3\2\2"+
		"\2\u01e6\u01e7\3\2\2\2\u01e7\u01e8\7\26\2\2\u01e8\31\3\2\2\2\u01e9\u01ea"+
		"\7f\2\2\u01ea\u01eb\7t\2\2\u01eb\u01f0\5\u00a8U\2\u01ec\u01ed\7\21\2\2"+
		"\u01ed\u01ee\5\"\22\2\u01ee\u01ef\7\22\2\2\u01ef\u01f1\3\2\2\2\u01f0\u01ec"+
		"\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f3\7\25\2\2"+
		"\u01f3\u01f4\5\36\20\2\u01f4\u01f5\7\26\2\2\u01f5\33\3\2\2\2\u01f6\u01f7"+
		"\7f\2\2\u01f7\u01f8\7F\2\2\u01f8\u01fd\5\u00a8U\2\u01f9\u01fa\7\21\2\2"+
		"\u01fa\u01fb\5\"\22\2\u01fb\u01fc\7\22\2\2\u01fc\u01fe\3\2\2\2\u01fd\u01f9"+
		"\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0200\7\25\2\2"+
		"\u0200\u0201\5\36\20\2\u0201\u0202\7\26\2\2\u0202\35\3\2\2\2\u0203\u0204"+
		"\7F\2\2\u0204\u0205\7`\2\2\u0205\u0206\7\25\2\2\u0206\u0207\5 \21\2\u0207"+
		"\u0208\7\26\2\2\u0208\37\3\2\2\2\u0209\u020a\b\21\1\2\u020a\u020b\5\u00be"+
		"`\2\u020b\u020c\7\r\2\2\u020c\u0213\3\2\2\2\u020d\u020e\f\3\2\2\u020e"+
		"\u020f\5\u00be`\2\u020f\u0210\7\r\2\2\u0210\u0212\3\2\2\2\u0211\u020d"+
		"\3\2\2\2\u0212\u0215\3\2\2\2\u0213\u0211\3\2\2\2\u0213\u0214\3\2\2\2\u0214"+
		"!\3\2\2\2\u0215\u0213\3\2\2\2\u0216\u0217\b\22\1\2\u0217\u0218\5\u00a6"+
		"T\2\u0218\u021e\3\2\2\2\u0219\u021a\f\3\2\2\u021a\u021b\7\16\2\2\u021b"+
		"\u021d\5\u00a6T\2\u021c\u0219\3\2\2\2\u021d\u0220\3\2\2\2\u021e\u021c"+
		"\3\2\2\2\u021e\u021f\3\2\2\2\u021f#\3\2\2\2\u0220\u021e\3\2\2\2\u0221"+
		"\u0223\7;\2\2\u0222\u0224\5\u0092J\2\u0223\u0222\3\2\2\2\u0223\u0224\3"+
		"\2\2\2\u0224\u0225\3\2\2\2\u0225\u0226\7b\2\2\u0226\u0227\5\u00a2R\2\u0227"+
		"\u0229\7\21\2\2\u0228\u022a\5\u00acW\2\u0229\u0228\3\2\2\2\u0229\u022a"+
		"\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u022c\7\22\2\2\u022c\u022d\7\r\2\2"+
		"\u022d%\3\2\2\2\u022e\u0230\5\u0092J\2\u022f\u022e\3\2\2\2\u022f\u0230"+
		"\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0232\7b\2\2\u0232\u0233\5\u00a2R\2"+
		"\u0233\u0235\7\21\2\2\u0234\u0236\5\u00acW\2\u0235\u0234\3\2\2\2\u0235"+
		"\u0236\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u0238\7\22\2\2\u0238\u023a\7"+
		"\25\2\2\u0239\u023b\5\u00d6l\2\u023a\u0239\3\2\2\2\u023a\u023b\3\2\2\2"+
		"\u023b\u023c\3\2\2\2\u023c\u023d\7\26\2\2\u023d\'\3\2\2\2\u023e\u0240"+
		"\5\u00b6\\\2\u023f\u023e\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0241\3\2\2"+
		"\2\u0241\u0242\7f\2\2\u0242\u0243\7b\2\2\u0243\u0244\5\u00a2R\2\u0244"+
		"\u0246\7\21\2\2\u0245\u0247\5\u00acW\2\u0246\u0245\3\2\2\2\u0246\u0247"+
		"\3\2\2\2\u0247\u0248\3\2\2\2\u0248\u0249\7\22\2\2\u0249\u024a\7\25\2\2"+
		"\u024a\u024b\5\u00ceh\2\u024b\u024c\7\26\2\2\u024c)\3\2\2\2\u024d\u024e"+
		"\7|\2\2\u024e\u024f\7b\2\2\u024f\u0250\7\u008f\2\2\u0250\u0251\7\21\2"+
		"\2\u0251\u0252\7\22\2\2\u0252\u0253\7\25\2\2\u0253\u0254\5\u00d6l\2\u0254"+
		"\u0255\7\26\2\2\u0255\u025d\7U\2\2\u0256\u0257\7\25\2\2\u0257\u0258\5"+
		"\u00d8m\2\u0258\u0259\7\26\2\2\u0259\u025e\3\2\2\2\u025a\u025b\5\u00aa"+
		"V\2\u025b\u025c\7\r\2\2\u025c\u025e\3\2\2\2\u025d\u0256\3\2\2\2\u025d"+
		"\u025a\3\2\2\2\u025e+\3\2\2\2\u025f\u0260\5V,\2\u0260\u0261\7\r\2\2\u0261"+
		"-\3\2\2\2\u0262\u0267\5\u00b6\\\2\u0263\u0264\7\21\2\2\u0264\u0265\5\""+
		"\22\2\u0265\u0266\7\22\2\2\u0266\u0268\3\2\2\2\u0267\u0263\3\2\2\2\u0267"+
		"\u0268\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u026c\5\u00a6T\2\u026a\u026b"+
		"\7(\2\2\u026b\u026d\5\u00eav\2\u026c\u026a\3\2\2\2\u026c\u026d\3\2\2\2"+
		"\u026d/\3\2\2\2\u026e\u0276\5\62\32\2\u026f\u0273\7\25\2\2\u0270\u0271"+
		"\5\u00d6l\2\u0271\u0272\7\26\2\2\u0272\u0274\3\2\2\2\u0273\u0270\3\2\2"+
		"\2\u0273\u0274\3\2\2\2\u0274\u0276\3\2\2\2\u0275\u026e\3\2\2\2\u0275\u026f"+
		"\3\2\2\2\u0276\61\3\2\2\2\u0277\u0278\5N(\2\u0278\u0279\7\r\2\2\u0279"+
		"\u0289\3\2\2\2\u027a\u0289\5p9\2\u027b\u0289\5t;\2\u027c\u0289\5L\'\2"+
		"\u027d\u0289\5B\"\2\u027e\u0289\58\35\2\u027f\u0289\5<\37\2\u0280\u0289"+
		"\5@!\2\u0281\u0289\5> \2\u0282\u0289\5H%\2\u0283\u0289\5F$\2\u0284\u0289"+
		"\5b\62\2\u0285\u0289\5\64\33\2\u0286\u0289\5\66\34\2\u0287\u0289\5&\24"+
		"\2\u0288\u0277\3\2\2\2\u0288\u027a\3\2\2\2\u0288\u027b\3\2\2\2\u0288\u027c"+
		"\3\2\2\2\u0288\u027d\3\2\2\2\u0288\u027e\3\2\2\2\u0288\u027f\3\2\2\2\u0288"+
		"\u0280\3\2\2\2\u0288\u0281\3\2\2\2\u0288\u0282\3\2\2\2\u0288\u0283\3\2"+
		"\2\2\u0288\u0284\3\2\2\2\u0288\u0285\3\2\2\2\u0288\u0286\3\2\2\2\u0288"+
		"\u0287\3\2\2\2\u0289\63\3\2\2\2\u028a\u028b\7\u0081\2\2\u028b\u028c\7"+
		"\21\2\2\u028c\u028d\5\u00fa~\2\u028d\u028e\7\22\2\2\u028e\u028f\5\60\31"+
		"\2\u028f\65\3\2\2\2\u0290\u0291\7\u0081\2\2\u0291\u0292\7\21\2\2\u0292"+
		"\u0293\5\u00a8U\2\u0293\u0294\7\22\2\2\u0294\u0295\5\60\31\2\u0295\67"+
		"\3\2\2\2\u0296\u0297\7{\2\2\u0297\u0298\7\21\2\2\u0298\u0299\5V,\2\u0299"+
		"\u029a\7\22\2\2\u029a\u029b\7\25\2\2\u029b\u02a1\5\u00dan\2\u029c\u029d"+
		"\7K\2\2\u029d\u029f\7\f\2\2\u029e\u02a0\5\u00d6l\2\u029f\u029e\3\2\2\2"+
		"\u029f\u02a0\3\2\2\2\u02a0\u02a2\3\2\2\2\u02a1\u029c\3\2\2\2\u02a1\u02a2"+
		"\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02a4\7\26\2\2\u02a49\3\2\2\2\u02a5"+
		"\u02a6\7D\2\2\u02a6\u02a7\5\u00e0q\2\u02a7\u02a9\7\f\2\2\u02a8\u02aa\5"+
		"\u00d6l\2\u02a9\u02a8\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa\u02b3\3\2\2\2"+
		"\u02ab\u02ac\7D\2\2\u02ac\u02ad\7]\2\2\u02ad\u02ae\5\u00dep\2\u02ae\u02b0"+
		"\7\f\2\2\u02af\u02b1\5\u00d6l\2\u02b0\u02af\3\2\2\2\u02b0\u02b1\3\2\2"+
		"\2\u02b1\u02b3\3\2\2\2\u02b2\u02a5\3\2\2\2\u02b2\u02ab\3\2\2\2\u02b3;"+
		"\3\2\2\2\u02b4\u02b5\7Y\2\2\u02b5\u02b6\7O\2\2\u02b6\u02b7\7\21\2\2\u02b7"+
		"\u02ba\5\u00a6T\2\u02b8\u02b9\7\16\2\2\u02b9\u02bb\5\u00a6T\2\u02ba\u02b8"+
		"\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc\u02bd\7]\2\2\u02bd"+
		"\u02be\5V,\2\u02be\u02bf\7\22\2\2\u02bf\u02c0\5\60\31\2\u02c0=\3\2\2\2"+
		"\u02c1\u02c2\7M\2\2\u02c2\u02c4\7\25\2\2\u02c3\u02c5\5\u00d6l\2\u02c4"+
		"\u02c3\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02c7\7\26"+
		"\2\2\u02c7\u02c8\7\u0084\2\2\u02c8\u02c9\7\21\2\2\u02c9\u02ca\5V,\2\u02ca"+
		"\u02cb\7\22\2\2\u02cb\u02cc\7\r\2\2\u02cc?\3\2\2\2\u02cd\u02ce\7\u0084"+
		"\2\2\u02ce\u02cf\7\21\2\2\u02cf\u02d0\5V,\2\u02d0\u02d1\7\22\2\2\u02d1"+
		"\u02d2\5\60\31\2\u02d2A\3\2\2\2\u02d3\u02d4\7\\\2\2\u02d4\u02d5\7\21\2"+
		"\2\u02d5\u02d6\5V,\2\u02d6\u02d7\7\22\2\2\u02d7\u02d9\5\60\31\2\u02d8"+
		"\u02da\5D#\2\u02d9\u02d8\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02dd\3\2\2"+
		"\2\u02db\u02dc\7P\2\2\u02dc\u02de\5\60\31\2\u02dd\u02db\3\2\2\2\u02dd"+
		"\u02de\3\2\2\2\u02deC\3\2\2\2\u02df\u02e0\b#\1\2\u02e0\u02e1\7P\2\2\u02e1"+
		"\u02e2\7\\\2\2\u02e2\u02e3\7\21\2\2\u02e3\u02e4\5V,\2\u02e4\u02e5\7\22"+
		"\2\2\u02e5\u02e6\5\60\31\2\u02e6\u02f1\3\2\2\2\u02e7\u02e8\f\3\2\2\u02e8"+
		"\u02e9\7P\2\2\u02e9\u02ea\7\\\2\2\u02ea\u02eb\7\21\2\2\u02eb\u02ec\5V"+
		",\2\u02ec\u02ed\7\22\2\2\u02ed\u02ee\5\60\31\2\u02ee\u02f0\3\2\2\2\u02ef"+
		"\u02e7\3\2\2\2\u02f0\u02f3\3\2\2\2\u02f1\u02ef\3\2\2\2\u02f1\u02f2\3\2"+
		"\2\2\u02f2E\3\2\2\2\u02f3\u02f1\3\2\2\2\u02f4\u02f5\7~\2\2\u02f5\u02f6"+
		"\5V,\2\u02f6\u02f7\7\r\2\2\u02f7G\3\2\2\2\u02f8\u02f9\7\u0080\2\2\u02f9"+
		"\u02fa\7\21\2\2\u02fa\u02fb\5\u00a6T\2\u02fb\u02fc\7\22\2\2\u02fc\u02fe"+
		"\7\25\2\2\u02fd\u02ff\5\u00d6l\2\u02fe\u02fd\3\2\2\2\u02fe\u02ff\3\2\2"+
		"\2\u02ff\u0300\3\2\2\2\u0300\u0302\7\26\2\2\u0301\u0303\5\u00dco\2\u0302"+
		"\u0301\3\2\2\2\u0302\u0303\3\2\2\2\u0303\u030d\3\2\2\2\u0304\u0305\7E"+
		"\2\2\u0305\u0306\7\21\2\2\u0306\u0307\7?\2\2\u0307\u0308\7\22\2\2\u0308"+
		"\u030a\7\25\2\2\u0309\u030b\5\u00d6l\2\u030a\u0309\3\2\2\2\u030a\u030b"+
		"\3\2\2\2\u030b\u030c\3\2\2\2\u030c\u030e\7\26\2\2\u030d\u0304\3\2\2\2"+
		"\u030d\u030e\3\2\2\2\u030e\u0315\3\2\2\2\u030f\u0310\7X\2\2\u0310\u0312"+
		"\7\25\2\2\u0311\u0313\5\u00d6l\2\u0312\u0311\3\2\2\2\u0312\u0313\3\2\2"+
		"\2\u0313\u0314\3\2\2\2\u0314\u0316\7\26\2\2\u0315\u030f\3\2\2\2\u0315"+
		"\u0316\3\2\2\2\u0316I\3\2\2\2\u0317\u0318\7E\2\2\u0318\u0319\7\21\2\2"+
		"\u0319\u031a\5\u00aaV\2\u031a\u031b\7\22\2\2\u031b\u031d\7\25\2\2\u031c"+
		"\u031e\5\u00d6l\2\u031d\u031c\3\2\2\2\u031d\u031e\3\2\2\2\u031e\u031f"+
		"\3\2\2\2\u031f\u0320\7\26\2\2\u0320\u032d\3\2\2\2\u0321\u0322\7E\2\2\u0322"+
		"\u0323\7]\2\2\u0323\u0324\7\21\2\2\u0324\u0325\5\u0086D\2\u0325\u0326"+
		"\7\22\2\2\u0326\u0328\7\25\2\2\u0327\u0329\5\u00d6l\2\u0328\u0327\3\2"+
		"\2\2\u0328\u0329\3\2\2\2\u0329\u032a\3\2\2\2\u032a\u032b\7\26\2\2\u032b"+
		"\u032d\3\2\2\2\u032c\u0317\3\2\2\2\u032c\u0321\3\2\2\2\u032dK\3\2\2\2"+
		"\u032e\u0330\7u\2\2\u032f\u0331\5V,\2\u0330\u032f\3\2\2\2\u0330\u0331"+
		"\3\2\2\2\u0331\u0332\3\2\2\2\u0332\u0333\7\r\2\2\u0333M\3\2\2\2\u0334"+
		"\u0335\5P)\2\u0335\u0337\7\21\2\2\u0336\u0338\5l\67\2\u0337\u0336\3\2"+
		"\2\2\u0337\u0338\3\2\2\2\u0338\u0339\3\2\2\2\u0339\u033a\7\22\2\2\u033a"+
		"O\3\2\2\2\u033b\u0341\5\u00a2R\2\u033c\u033d\5R*\2\u033d\u033e\7\20\2"+
		"\2\u033e\u033f\5\u00a2R\2\u033f\u0341\3\2\2\2\u0340\u033b\3\2\2\2\u0340"+
		"\u033c\3\2\2\2\u0341Q\3\2\2\2\u0342\u0343\b*\1\2\u0343\u0344\5\u00a4S"+
		"\2\u0344\u0349\3\2\2\2\u0345\u0346\f\3\2\2\u0346\u0348\5T+\2\u0347\u0345"+
		"\3\2\2\2\u0348\u034b\3\2\2\2\u0349\u0347\3\2\2\2\u0349\u034a\3\2\2\2\u034a"+
		"S\3\2\2\2\u034b\u0349\3\2\2\2\u034c\u034d\7\20\2\2\u034d\u0353\5\u00a6"+
		"T\2\u034e\u034f\7\23\2\2\u034f\u0350\5V,\2\u0350\u0351\7\24\2\2\u0351"+
		"\u0353\3\2\2\2\u0352\u034c\3\2\2\2\u0352\u034e\3\2\2\2\u0353U\3\2\2\2"+
		"\u0354\u0355\b,\1\2\u0355\u0356\7\36\2\2\u0356\u036c\5V,!\u0357\u0358"+
		"\7\30\2\2\u0358\u036c\5V, \u0359\u035a\7\21\2\2\u035a\u035b\5\u00b6\\"+
		"\2\u035b\u035c\7\22\2\2\u035c\u035d\5V,\16\u035d\u036c\3\2\2\2\u035e\u036c"+
		"\5Z.\2\u035f\u036c\5\\/\2\u0360\u0361\79\2\2\u0361\u0362\7\21\2\2\u0362"+
		"\u0363\5V,\2\u0363\u0364\7\22\2\2\u0364\u036c\3\2\2\2\u0365\u0366\7T\2"+
		"\2\u0366\u0367\7\21\2\2\u0367\u0368\5\u00a6T\2\u0368\u0369\7\22\2\2\u0369"+
		"\u036c\3\2\2\2\u036a\u036c\5X-\2\u036b\u0354\3\2\2\2\u036b\u0357\3\2\2"+
		"\2\u036b\u0359\3\2\2\2\u036b\u035e\3\2\2\2\u036b\u035f\3\2\2\2\u036b\u0360"+
		"\3\2\2\2\u036b\u0365\3\2\2\2\u036b\u036a\3\2\2\2\u036c\u03ca\3\2\2\2\u036d"+
		"\u036e\f\37\2\2\u036e\u036f\5\u010a\u0086\2\u036f\u0370\5V, \u0370\u03c9"+
		"\3\2\2\2\u0371\u0372\f\36\2\2\u0372\u0373\5\u010c\u0087\2\u0373\u0374"+
		"\5V,\37\u0374\u03c9\3\2\2\2\u0375\u0376\f\35\2\2\u0376\u0377\5\u0110\u0089"+
		"\2\u0377\u0378\5V,\36\u0378\u03c9\3\2\2\2\u0379\u037a\f\34\2\2\u037a\u037b"+
		"\5\u010e\u0088\2\u037b\u037c\5V,\35\u037c\u03c9\3\2\2\2\u037d\u037e\f"+
		"\33\2\2\u037e\u037f\t\2\2\2\u037f\u03c9\5V,\34\u0380\u0381\f\32\2\2\u0381"+
		"\u0382\7%\2\2\u0382\u03c9\5V,\33\u0383\u0384\f\31\2\2\u0384\u0385\7&\2"+
		"\2\u0385\u03c9\5V,\32\u0386\u0387\f\30\2\2\u0387\u0388\7#\2\2\u0388\u03c9"+
		"\5V,\31\u0389\u038a\f\27\2\2\u038a\u038b\7$\2\2\u038b\u03c9\5V,\30\u038c"+
		"\u038d\f\24\2\2\u038d\u038e\7*\2\2\u038e\u03c9\5V,\25\u038f\u0390\f\23"+
		"\2\2\u0390\u0391\7)\2\2\u0391\u03c9\5V,\24\u0392\u0393\f\22\2\2\u0393"+
		"\u0394\7+\2\2\u0394\u03c9\5V,\23\u0395\u0396\f\21\2\2\u0396\u0397\7\34"+
		"\2\2\u0397\u03c9\5V,\22\u0398\u0399\f\20\2\2\u0399\u039a\7\32\2\2\u039a"+
		"\u03c9\5V,\21\u039b\u039c\f\17\2\2\u039c\u039d\7\27\2\2\u039d\u039e\5"+
		"V,\2\u039e\u039f\7\f\2\2\u039f\u03a0\5V,\20\u03a0\u03c9\3\2\2\2\u03a1"+
		"\u03a2\f\r\2\2\u03a2\u03a3\7]\2\2\u03a3\u03c9\5V,\16\u03a4\u03a5\f\f\2"+
		"\2\u03a5\u03a6\7I\2\2\u03a6\u03c9\5V,\r\u03a7\u03a8\f\13\2\2\u03a8\u03a9"+
		"\7I\2\2\u03a9\u03aa\7<\2\2\u03aa\u03c9\5V,\f\u03ab\u03ac\f\n\2\2\u03ac"+
		"\u03ad\7I\2\2\u03ad\u03ae\7?\2\2\u03ae\u03c9\5V,\13\u03af\u03b0\f\t\2"+
		"\2\u03b0\u03b1\7h\2\2\u03b1\u03b2\7]\2\2\u03b2\u03c9\5V,\n\u03b3\u03b4"+
		"\f\b\2\2\u03b4\u03b5\7h\2\2\u03b5\u03b6\7I\2\2\u03b6\u03c9\5V,\t\u03b7"+
		"\u03b8\f\7\2\2\u03b8\u03b9\7h\2\2\u03b9\u03ba\7I\2\2\u03ba\u03bb\7<\2"+
		"\2\u03bb\u03c9\5V,\b\u03bc\u03bd\f\6\2\2\u03bd\u03be\7h\2\2\u03be\u03bf"+
		"\7I\2\2\u03bf\u03c0\7?\2\2\u03c0\u03c9\5V,\7\u03c1\u03c2\f\26\2\2\u03c2"+
		"\u03c3\7_\2\2\u03c3\u03c4\7h\2\2\u03c4\u03c9\5\u00fe\u0080\2\u03c5\u03c6"+
		"\f\25\2\2\u03c6\u03c7\7_\2\2\u03c7\u03c9\5\u00fe\u0080\2\u03c8\u036d\3"+
		"\2\2\2\u03c8\u0371\3\2\2\2\u03c8\u0375\3\2\2\2\u03c8\u0379\3\2\2\2\u03c8"+
		"\u037d\3\2\2\2\u03c8\u0380\3\2\2\2\u03c8\u0383\3\2\2\2\u03c8\u0386\3\2"+
		"\2\2\u03c8\u0389\3\2\2\2\u03c8\u038c\3\2\2\2\u03c8\u038f\3\2\2\2\u03c8"+
		"\u0392\3\2\2\2\u03c8\u0395\3\2\2\2\u03c8\u0398\3\2\2\2\u03c8\u039b\3\2"+
		"\2\2\u03c8\u03a1\3\2\2\2\u03c8\u03a4\3\2\2\2\u03c8\u03a7\3\2\2\2\u03c8"+
		"\u03ab\3\2\2\2\u03c8\u03af\3\2\2\2\u03c8\u03b3\3\2\2\2\u03c8\u03b7\3\2"+
		"\2\2\u03c8\u03bc\3\2\2\2\u03c8\u03c1\3\2\2\2\u03c8\u03c5\3\2\2\2\u03c9"+
		"\u03cc\3\2\2\2\u03ca\u03c8\3\2\2\2\u03ca\u03cb\3\2\2\2\u03cbW\3\2\2\2"+
		"\u03cc\u03ca\3\2\2\2\u03cd\u03ce\5\u00a8U\2\u03ceY\3\2\2\2\u03cf\u03d0"+
		"\b.\1\2\u03d0\u03d1\5\u00e4s\2\u03d1\u03d6\3\2\2\2\u03d2\u03d3\f\3\2\2"+
		"\u03d3\u03d5\5h\65\2\u03d4\u03d2\3\2\2\2\u03d5\u03d8\3\2\2\2\u03d6\u03d4"+
		"\3\2\2\2\u03d6\u03d7\3\2\2\2\u03d7[\3\2\2\2\u03d8\u03d6\3\2\2\2\u03d9"+
		"\u03e0\5^\60\2\u03da\u03e0\5d\63\2\u03db\u03e0\5`\61\2\u03dc\u03e0\5f"+
		"\64\2\u03dd\u03e0\5N(\2\u03de\u03e0\5j\66\2\u03df\u03d9\3\2\2\2\u03df"+
		"\u03da\3\2\2\2\u03df\u03db\3\2\2\2\u03df\u03dc\3\2\2\2\u03df\u03dd\3\2"+
		"\2\2\u03df\u03de\3\2\2\2\u03e0]\3\2\2\2\u03e1\u03e2\5\u009cO\2\u03e2\u03e3"+
		"\7\21\2\2\u03e3\u03e4\7\22\2\2\u03e4_\3\2\2\2\u03e5\u03e6\7r\2\2\u03e6"+
		"\u03e7\7Z\2\2\u03e7\u03e8\5V,\2\u03e8a\3\2\2\2\u03e9\u03ea\7\u0085\2\2"+
		"\u03ea\u03eb\7\21\2\2\u03eb\u03ec\5V,\2\u03ec\u03ed\7\22\2\2\u03ed\u03ee"+
		"\7\177\2\2\u03ee\u03ef\5V,\2\u03ef\u03f0\7\r\2\2\u03f0c\3\2\2\2\u03f1"+
		"\u03f2\7W\2\2\u03f2\u03f3\7\21\2\2\u03f3\u03f4\5\u00a6T\2\u03f4\u03f5"+
		"\7\22\2\2\u03f5\u03f6\7Z\2\2\u03f6\u03f7\5V,\2\u03f7\u03f8\7\u0083\2\2"+
		"\u03f8\u03f9\5V,\2\u03f9e\3\2\2\2\u03fa\u03fb\7z\2\2\u03fb\u03fc\7\21"+
		"\2\2\u03fc\u0402\5Z.\2\u03fd\u03fe\7\16\2\2\u03fe\u03ff\5\u0102\u0082"+
		"\2\u03ff\u0400\7(\2\2\u0400\u0401\5Z.\2\u0401\u0403\3\2\2\2\u0402\u03fd"+
		"\3\2\2\2\u0402\u0403\3\2\2\2\u0403\u0404\3\2\2\2\u0404\u0405\7\22\2\2"+
		"\u0405g\3\2\2\2\u0406\u0407\7\20\2\2\u0407\u0411\5\u00a6T\2\u0408\u0409"+
		"\7\23\2\2\u0409\u040a\5V,\2\u040a\u040b\7\24\2\2\u040b\u0411\3\2\2\2\u040c"+
		"\u040d\7\23\2\2\u040d\u040e\5\u00f8}\2\u040e\u040f\7\24\2\2\u040f\u0411"+
		"\3\2\2\2\u0410\u0406\3\2\2\2\u0410\u0408\3\2\2\2\u0410\u040c\3\2\2\2\u0411"+
		"i\3\2\2\2\u0412\u0414\7e\2\2\u0413\u0412\3\2\2\2\u0413\u0414\3\2\2\2\u0414"+
		"\u0415\3\2\2\2\u0415\u0416\5\u0098M\2\u0416\u0418\7\21\2\2\u0417\u0419"+
		"\5l\67\2\u0418\u0417\3\2\2\2\u0418\u0419\3\2\2\2\u0419\u041a\3\2\2\2\u041a"+
		"\u041b\7\22\2\2\u041bk\3\2\2\2\u041c\u041d\b\67\1\2\u041d\u041e\5V,\2"+
		"\u041e\u041f\6\67!\3\u041f\u0422\3\2\2\2\u0420\u0422\5n8\2\u0421\u041c"+
		"\3\2\2\2\u0421\u0420\3\2\2\2\u0422\u0428\3\2\2\2\u0423\u0424\f\3\2\2\u0424"+
		"\u0425\7\16\2\2\u0425\u0427\5n8\2\u0426\u0423\3\2\2\2\u0427\u042a\3\2"+
		"\2\2\u0428\u0426\3\2\2\2\u0428\u0429\3\2\2\2\u0429m\3\2\2\2\u042a\u0428"+
		"\3\2\2\2\u042b\u042c\5\u00a6T\2\u042c\u042d\5\u0108\u0085\2\u042d\u042e"+
		"\5V,\2\u042eo\3\2\2\2\u042f\u0430\5\u00fc\177\2\u0430\u0431\5\u0108\u0085"+
		"\2\u0431\u0432\5V,\2\u0432\u0433\7\r\2\2\u0433q\3\2\2\2\u0434\u0435\7"+
		"\20\2\2\u0435\u043b\5\u00a6T\2\u0436\u0437\7\23\2\2\u0437\u0438\5V,\2"+
		"\u0438\u0439\7\24\2\2\u0439\u043b\3\2\2\2\u043a\u0434\3\2\2\2\u043a\u0436"+
		"\3\2\2\2\u043bs\3\2\2\2\u043c\u043d\5\u00caf\2\u043d\u043e\5\u0108\u0085"+
		"\2\u043e\u043f\5V,\2\u043f\u0440\7\r\2\2\u0440u\3\2\2\2\u0441\u0442\7"+
		"j\2\2\u0442w\3\2\2\2\u0443\u0445\5z>\2\u0444\u0443\3\2\2\2\u0444\u0445"+
		"\3\2\2\2\u0445\u0446\3\2\2\2\u0446\u0447\5\u0112\u008a\2\u0447\u0448\7"+
		"\2\2\3\u0448y\3\2\2\2\u0449\u044a\b>\1\2\u044a\u044b\5|?\2\u044b\u0452"+
		"\3\2\2\2\u044c\u044d\f\3\2\2\u044d\u044e\5\u0114\u008b\2\u044e\u044f\5"+
		"|?\2\u044f\u0451\3\2\2\2\u0450\u044c\3\2\2\2\u0451\u0454\3\2\2\2\u0452"+
		"\u0450\3\2\2\2\u0452\u0453\3\2\2\2\u0453{\3\2\2\2\u0454\u0452\3\2\2\2"+
		"\u0455\u045b\5\n\6\2\u0456\u045b\5\u009eP\2\u0457\u045b\5~@\2\u0458\u045b"+
		"\5\u0080A\2\u0459\u045b\5\u00ccg\2\u045a\u0455\3\2\2\2\u045a\u0456\3\2"+
		"\2\2\u045a\u0457\3\2\2\2\u045a\u0458\3\2\2\2\u045a\u0459\3\2\2\2\u045b"+
		"}\3\2\2\2\u045c\u045d\5\32\16\2\u045d\177\3\2\2\2\u045e\u0461\5\2\2\2"+
		"\u045f\u0461\5\4\3\2\u0460\u045e\3\2\2\2\u0460\u045f\3\2\2\2\u0461\u0081"+
		"\3\2\2\2\u0462\u0463\bB\1\2\u0463\u0464\5\b\5\2\u0464\u046b\3\2\2\2\u0465"+
		"\u0466\f\3\2\2\u0466\u0467\5\u0114\u008b\2\u0467\u0468\5\b\5\2\u0468\u046a"+
		"\3\2\2\2\u0469\u0465\3\2\2\2\u046a\u046d\3\2\2\2\u046b\u0469\3\2\2\2\u046b"+
		"\u046c\3\2\2\2\u046c\u0083\3\2\2\2\u046d\u046b\3\2\2\2\u046e\u046f\bC"+
		"\1\2\u046f\u0470\5\6\4\2\u0470\u0477\3\2\2\2\u0471\u0472\f\3\2\2\u0472"+
		"\u0473\5\u0114\u008b\2\u0473\u0474\5\6\4\2\u0474\u0476\3\2\2\2\u0475\u0471"+
		"\3\2\2\2\u0476\u0479\3\2\2\2\u0477\u0475\3\2\2\2\u0477\u0478\3\2\2\2\u0478"+
		"\u0085\3\2\2\2\u0479\u0477\3\2\2\2\u047a\u047b\bD\1\2\u047b\u047c\5\u00aa"+
		"V\2\u047c\u0482\3\2\2\2\u047d\u047e\f\3\2\2\u047e\u047f\7\16\2\2\u047f"+
		"\u0481\5\u00aaV\2\u0480\u047d\3\2\2\2\u0481\u0484\3\2\2\2\u0482\u0480"+
		"\3\2\2\2\u0482\u0483\3\2\2\2\u0483\u0087\3\2\2\2\u0484\u0482\3\2\2\2\u0485"+
		"\u0486\7]\2\2\u0486\u0490\5\u008aF\2\u0487\u0488\7]\2\2\u0488\u0490\5"+
		"\u008cG\2\u0489\u048a\7]\2\2\u048a\u0490\5\u0090I\2\u048b\u048c\7a\2\2"+
		"\u048c\u0490\7\u008f\2\2\u048d\u048e\7a\2\2\u048e\u0490\5V,\2\u048f\u0485"+
		"\3\2\2\2\u048f\u0487\3\2\2\2\u048f\u0489\3\2\2\2\u048f\u048b\3\2\2\2\u048f"+
		"\u048d\3\2\2\2\u0490\u0089\3\2\2\2\u0491\u0493\7\23\2\2\u0492\u0494\5"+
		"\u008eH\2\u0493\u0492\3\2\2\2\u0493\u0494\3\2\2\2\u0494\u0495\3\2\2\2"+
		"\u0495\u0496\7\24\2\2\u0496\u008b\3\2\2\2\u0497\u0499\7%\2\2\u0498\u049a"+
		"\5\u008eH\2\u0499\u0498\3\2\2\2\u0499\u049a\3\2\2\2\u049a\u049b\3\2\2"+
		"\2\u049b\u049c\7#\2\2\u049c\u008d\3\2\2\2\u049d\u049e\bH\1\2\u049e\u049f"+
		"\5V,\2\u049f\u04a5\3\2\2\2\u04a0\u04a1\f\3\2\2\u04a1\u04a2\7\16\2\2\u04a2"+
		"\u04a4\5V,\2\u04a3\u04a0\3\2\2\2\u04a4\u04a7\3\2\2\2\u04a5\u04a3\3\2\2"+
		"\2\u04a5\u04a6\3\2\2\2\u04a6\u008f\3\2\2\2\u04a7\u04a5\3\2\2\2\u04a8\u04a9"+
		"\7\23\2\2\u04a9\u04aa\5V,\2\u04aa\u04ab\7\17\2\2\u04ab\u04ac\5V,\2\u04ac"+
		"\u04ad\7\24\2\2\u04ad\u0091\3\2\2\2\u04ae\u04af\bJ\1\2\u04af\u04b0\5\u0094"+
		"K\2\u04b0\u04bb\3\2\2\2\u04b1\u04b2\f\5\2\2\u04b2\u04ba\7\'\2\2\u04b3"+
		"\u04b4\f\4\2\2\u04b4\u04b5\7\23\2\2\u04b5\u04ba\7\24\2\2\u04b6\u04b7\f"+
		"\3\2\2\u04b7\u04b8\7\25\2\2\u04b8\u04ba\7\26\2\2\u04b9\u04b1\3\2\2\2\u04b9"+
		"\u04b3\3\2\2\2\u04b9\u04b6\3\2\2\2\u04ba\u04bd\3\2\2\2\u04bb\u04b9\3\2"+
		"\2\2\u04bb\u04bc\3\2\2\2\u04bc\u0093\3\2\2\2\u04bd\u04bb\3\2\2\2\u04be"+
		"\u04c1\5\u0096L\2\u04bf\u04c1\5\u0098M\2\u04c0\u04be\3\2\2\2\u04c0\u04bf"+
		"\3\2\2\2\u04c1\u0095\3\2\2\2\u04c2\u04cd\7/\2\2\u04c3\u04cd\7\60\2\2\u04c4"+
		"\u04cd\7\61\2\2\u04c5\u04cd\7\62\2\2\u04c6\u04cd\7\63\2\2\u04c7\u04cd"+
		"\7\64\2\2\u04c8\u04cd\7\66\2\2\u04c9\u04cd\7\65\2\2\u04ca\u04cd\7\67\2"+
		"\2\u04cb\u04cd\79\2\2\u04cc\u04c2\3\2\2\2\u04cc\u04c3\3\2\2\2\u04cc\u04c4"+
		"\3\2\2\2\u04cc\u04c5\3\2\2\2\u04cc\u04c6\3\2\2\2\u04cc\u04c7\3\2\2\2\u04cc"+
		"\u04c8\3\2\2\2\u04cc\u04c9\3\2\2\2\u04cc\u04ca\3\2\2\2\u04cc\u04cb\3\2"+
		"\2\2\u04cd\u0097\3\2\2\2\u04ce\u04cf\7\u008b\2\2\u04cf\u0099\3\2\2\2\u04d0"+
		"\u04d1\79\2\2\u04d1\u009b\3\2\2\2\u04d2\u04d3\7:\2\2\u04d3\u009d\3\2\2"+
		"\2\u04d4\u04d8\5\f\7\2\u04d5\u04d8\5\34\17\2\u04d6\u04d8\5\16\b\2\u04d7"+
		"\u04d4\3\2\2\2\u04d7\u04d5\3\2\2\2\u04d7\u04d6\3\2\2\2\u04d8\u009f\3\2"+
		"\2\2\u04d9\u04da\bQ\1\2\u04da\u04db\5\u00a8U\2\u04db\u04e1\3\2\2\2\u04dc"+
		"\u04dd\f\3\2\2\u04dd\u04de\7\16\2\2\u04de\u04e0\5\u00a8U\2\u04df\u04dc"+
		"\3\2\2\2\u04e0\u04e3\3\2\2\2\u04e1\u04df\3\2\2\2\u04e1\u04e2\3\2\2\2\u04e2"+
		"\u00a1\3\2\2\2\u04e3\u04e1\3\2\2\2\u04e4\u04e7\5\u00a6T\2\u04e5\u04e7"+
		"\5\u00a8U\2\u04e6\u04e4\3\2\2\2\u04e6\u04e5\3\2\2\2\u04e7\u00a3\3\2\2"+
		"\2\u04e8\u04ec\5\u00a6T\2\u04e9\u04ec\5\u00a8U\2\u04ea\u04ec\5\u00aaV"+
		"\2\u04eb\u04e8\3\2\2\2\u04eb\u04e9\3\2\2\2\u04eb\u04ea\3\2\2\2\u04ec\u00a5"+
		"\3\2\2\2\u04ed\u04ee\7\u008c\2\2\u04ee\u00a7\3\2\2\2\u04ef\u04f0\7\u008b"+
		"\2\2\u04f0\u00a9\3\2\2\2\u04f1\u04f2\7\u008a\2\2\u04f2\u00ab\3\2\2\2\u04f3"+
		"\u04f4\bW\1\2\u04f4\u04f5\5\u00aeX\2\u04f5\u04fb\3\2\2\2\u04f6\u04f7\f"+
		"\3\2\2\u04f7\u04f8\7\16\2\2\u04f8\u04fa\5\u00aeX\2\u04f9\u04f6\3\2\2\2"+
		"\u04fa\u04fd\3\2\2\2\u04fb\u04f9\3\2\2\2\u04fb\u04fc\3\2\2\2\u04fc\u00ad"+
		"\3\2\2\2\u04fd\u04fb\3\2\2\2\u04fe\u0504\5\u00b4[\2\u04ff\u0501\7e\2\2"+
		"\u0500\u04ff\3\2\2\2\u0500\u0501\3\2\2\2\u0501\u0502\3\2\2\2\u0502\u0504"+
		"\5\u00b0Y\2\u0503\u04fe\3\2\2\2\u0503\u0500\3\2\2\2\u0504\u00af\3\2\2"+
		"\2\u0505\u0508\5\u00b2Z\2\u0506\u0508\5.\30\2\u0507\u0505\3\2\2\2\u0507"+
		"\u0506\3\2\2\2\u0508\u00b1\3\2\2\2\u0509\u050c\5\u00a6T\2\u050a\u050b"+
		"\7(\2\2\u050b\u050d\5\u00eav\2\u050c\u050a\3\2\2\2\u050c\u050d\3\2\2\2"+
		"\u050d\u00b3\3\2\2\2\u050e\u050f\5\u009aN\2\u050f\u0510\5\u00a6T\2\u0510"+
		"\u00b5\3\2\2\2\u0511\u0514\5\u0092J\2\u0512\u0514\5\u00b8]\2\u0513\u0511"+
		"\3\2\2\2\u0513\u0512\3\2\2\2\u0514\u00b7\3\2\2\2\u0515\u0516\b]\1\2\u0516"+
		"\u0517\7?\2\2\u0517\u0520\3\2\2\2\u0518\u0519\f\4\2\2\u0519\u051a\7\23"+
		"\2\2\u051a\u051f\7\24\2\2\u051b\u051c\f\3\2\2\u051c\u051d\7\25\2\2\u051d"+
		"\u051f\7\26\2\2\u051e\u0518\3\2\2\2\u051e\u051b\3\2\2\2\u051f\u0522\3"+
		"\2\2\2\u0520\u051e\3\2\2\2\u0520\u0521\3\2\2\2\u0521\u00b9\3\2\2\2\u0522"+
		"\u0520\3\2\2\2\u0523\u0524\b^\1\2\u0524\u0525\5\u00bc_\2\u0525\u052c\3"+
		"\2\2\2\u0526\u0527\f\3\2\2\u0527\u0528\5\u0114\u008b\2\u0528\u0529\5\u00bc"+
		"_\2\u0529\u052b\3\2\2\2\u052a\u0526\3\2\2\2\u052b\u052e\3\2\2\2\u052c"+
		"\u052a\3\2\2\2\u052c\u052d\3\2\2\2\u052d\u00bb\3\2\2\2\u052e\u052c\3\2"+
		"\2\2\u052f\u0535\5\26\f\2\u0530\u0535\5\30\r\2\u0531\u0535\5&\24\2\u0532"+
		"\u0535\5$\23\2\u0533\u0535\5\24\13\2\u0534\u052f\3\2\2\2\u0534\u0530\3"+
		"\2\2\2\u0534\u0531\3\2\2\2\u0534\u0532\3\2\2\2\u0534\u0533\3\2\2\2\u0535"+
		"\u00bd\3\2\2\2\u0536\u0537\7\6\2\2\u0537\u0541\5\u0156\u00ac\2\u0538\u0539"+
		"\7\7\2\2\u0539\u0541\5\u016c\u00b7\2\u053a\u053b\7\b\2\2\u053b\u0541\5"+
		"\u00c0a\2\u053c\u053d\7\t\2\2\u053d\u0541\5\u00c0a\2\u053e\u053f\7\n\2"+
		"\2\u053f\u0541\5\u00c6d\2\u0540\u0536\3\2\2\2\u0540\u0538\3\2\2\2\u0540"+
		"\u053a\3\2\2\2\u0540\u053c\3\2\2\2\u0540\u053e\3\2\2\2\u0541\u00bf\3\2"+
		"\2\2\u0542\u0544\5\u00a4S\2\u0543\u0545\5\u00c2b\2\u0544\u0543\3\2\2\2"+
		"\u0544\u0545\3\2\2\2\u0545\u00c1\3\2\2\2\u0546\u0547\7Z\2\2\u0547\u0548"+
		"\5\u00c4c\2\u0548\u0549\7\f\2\2\u0549\u054e\5\u00a4S\2\u054a\u054b\7\20"+
		"\2\2\u054b\u054d\5\u00a4S\2\u054c\u054a\3\2\2\2\u054d\u0550\3\2\2\2\u054e"+
		"\u054c\3\2\2\2\u054e\u054f\3\2\2\2\u054f\u00c3\3\2\2\2\u0550\u054e\3\2"+
		"\2\2\u0551\u0552\7\u008c\2\2\u0552\u0553\6c\60\3\u0553\u00c5\3\2\2\2\u0554"+
		"\u0556\5\u00a4S\2\u0555\u0557\5\u00c8e\2\u0556\u0555\3\2\2\2\u0556\u0557"+
		"\3\2\2\2\u0557\u00c7\3\2\2\2\u0558\u0559\7Z\2\2\u0559\u055a\5\u00c4c\2"+
		"\u055a\u055c\7\f\2\2\u055b\u055d\7 \2\2\u055c\u055b\3\2\2\2\u055c\u055d"+
		"\3\2\2\2\u055d\u055e\3\2\2\2\u055e\u0563\5\u012a\u0096\2\u055f\u0560\7"+
		" \2\2\u0560\u0562\5\u012a\u0096\2\u0561\u055f\3\2\2\2\u0562\u0565\3\2"+
		"\2\2\u0563\u0561\3\2\2\2\u0563\u0564\3\2\2\2\u0564\u0568\3\2\2\2\u0565"+
		"\u0563\3\2\2\2\u0566\u0567\7\20\2\2\u0567\u0569\5\u012a\u0096\2\u0568"+
		"\u0566\3\2\2\2\u0568\u0569\3\2\2\2\u0569\u00c9\3\2\2\2\u056a\u056b\bf"+
		"\1\2\u056b\u056c\5\u00a6T\2\u056c\u0572\3\2\2\2\u056d\u056e\f\3\2\2\u056e"+
		"\u056f\7\16\2\2\u056f\u0571\5\u00a6T\2\u0570\u056d\3\2\2\2\u0571\u0574"+
		"\3\2\2\2\u0572\u0570\3\2\2\2\u0572\u0573\3\2\2\2\u0573\u00cb\3\2\2\2\u0574"+
		"\u0572\3\2\2\2\u0575\u057a\5$\23\2\u0576\u057a\5&\24\2\u0577\u057a\5("+
		"\25\2\u0578\u057a\5*\26\2\u0579\u0575\3\2\2\2\u0579\u0576\3\2\2\2\u0579"+
		"\u0577\3\2\2\2\u0579\u0578\3\2\2\2\u057a\u00cd\3\2\2\2\u057b\u057c\bh"+
		"\1\2\u057c\u057d\5\u00d0i\2\u057d\u0584\3\2\2\2\u057e\u057f\f\3\2\2\u057f"+
		"\u0580\5\u0114\u008b\2\u0580\u0581\5\u00d0i\2\u0581\u0583\3\2\2\2\u0582"+
		"\u057e\3\2\2\2\u0583\u0586\3\2\2\2\u0584\u0582\3\2\2\2\u0584\u0585\3\2"+
		"\2\2\u0585\u00cf\3\2\2\2\u0586\u0584\3\2\2\2\u0587\u0588\7\6\2\2\u0588"+
		"\u0592\5\u0144\u00a3\2\u0589\u058a\7\7\2\2\u058a\u0592\5\u015c\u00af\2"+
		"\u058b\u058c\7\b\2\2\u058c\u0592\5\u00d2j\2\u058d\u058e\7\t\2\2\u058e"+
		"\u0592\5\u00d2j\2\u058f\u0590\7\n\2\2\u0590\u0592\5\u00d4k\2\u0591\u0587"+
		"\3\2\2\2\u0591\u0589\3\2\2\2\u0591\u058b\3\2\2\2\u0591\u058d\3\2\2\2\u0591"+
		"\u058f\3\2\2\2\u0592\u00d1\3\2\2\2\u0593\u0595\5\u012c\u0097\2\u0594\u0596"+
		"\7\r\2\2\u0595\u0594\3\2\2\2\u0595\u0596\3\2\2\2\u0596\u0598\3\2\2\2\u0597"+
		"\u0599\5\u00c2b\2\u0598\u0597\3\2\2\2\u0598\u0599\3\2\2\2\u0599\u00d3"+
		"\3\2\2\2\u059a\u059c\5\u0116\u008c\2\u059b\u059d\7\r\2\2\u059c\u059b\3"+
		"\2\2\2\u059c\u059d\3\2\2\2\u059d\u059f\3\2\2\2\u059e\u05a0\5\u00c8e\2"+
		"\u059f\u059e\3\2\2\2\u059f\u05a0\3\2\2\2\u05a0\u00d5\3\2\2\2\u05a1\u05a2"+
		"\bl\1\2\u05a2\u05a3\5\62\32\2\u05a3\u05aa\3\2\2\2\u05a4\u05a5\f\3\2\2"+
		"\u05a5\u05a6\5\u0114\u008b\2\u05a6\u05a7\5\62\32\2\u05a7\u05a9\3\2\2\2"+
		"\u05a8\u05a4\3\2\2\2\u05a9\u05ac\3\2\2\2\u05aa\u05a8\3\2\2\2\u05aa\u05ab"+
		"\3\2\2\2\u05ab\u00d7\3\2\2\2\u05ac\u05aa\3\2\2\2\u05ad\u05ae\bm\1\2\u05ae"+
		"\u05af\5,\27\2\u05af\u05b6\3\2\2\2\u05b0\u05b1\f\3\2\2\u05b1\u05b2\5\u0114"+
		"\u008b\2\u05b2\u05b3\5,\27\2\u05b3\u05b5\3\2\2\2\u05b4\u05b0\3\2\2\2\u05b5"+
		"\u05b8\3\2\2\2\u05b6\u05b4\3\2\2\2\u05b6\u05b7\3\2\2\2\u05b7\u00d9\3\2"+
		"\2\2\u05b8\u05b6\3\2\2\2\u05b9\u05ba\bn\1\2\u05ba\u05bb\5:\36\2\u05bb"+
		"\u05c2\3\2\2\2\u05bc\u05bd\f\3\2\2\u05bd\u05be\5\u0114\u008b\2\u05be\u05bf"+
		"\5:\36\2\u05bf\u05c1\3\2\2\2\u05c0\u05bc\3\2\2\2\u05c1\u05c4\3\2\2\2\u05c2"+
		"\u05c0\3\2\2\2\u05c2\u05c3\3\2\2\2\u05c3\u00db\3\2\2\2\u05c4\u05c2\3\2"+
		"\2\2\u05c5\u05c6\bo\1\2\u05c6\u05c7\5J&\2\u05c7\u05ce\3\2\2\2\u05c8\u05c9"+
		"\f\3\2\2\u05c9\u05ca\5\u0114\u008b\2\u05ca\u05cb\5J&\2\u05cb\u05cd\3\2"+
		"\2\2\u05cc\u05c8\3\2\2\2\u05cd\u05d0\3\2\2\2\u05ce\u05cc\3\2\2\2\u05ce"+
		"\u05cf\3\2\2\2\u05cf\u00dd\3\2\2\2\u05d0\u05ce\3\2\2\2\u05d1\u05d2\7\23"+
		"\2\2\u05d2\u05d3\5\u00e0q\2\u05d3\u05d4\7\17\2\2\u05d4\u05d5\5\u00e0q"+
		"\2\u05d5\u05d6\7\24\2\2\u05d6\u05e0\3\2\2\2\u05d7\u05d8\7\23\2\2\u05d8"+
		"\u05d9\5\u00e2r\2\u05d9\u05da\7\24\2\2\u05da\u05e0\3\2\2\2\u05db\u05dc"+
		"\7%\2\2\u05dc\u05dd\5\u00e2r\2\u05dd\u05de\7#\2\2\u05de\u05e0\3\2\2\2"+
		"\u05df\u05d1\3\2\2\2\u05df\u05d7\3\2\2\2\u05df\u05db\3\2\2\2\u05e0\u00df"+
		"\3\2\2\2\u05e1\u05ef\7\u0088\2\2\u05e2\u05ef\7\u0089\2\2\u05e3\u05ef\7"+
		"\u0090\2\2\u05e4\u05ef\7\u0091\2\2\u05e5\u05ef\7\u0087\2\2\u05e6\u05ef"+
		"\7\u0095\2\2\u05e7\u05ef\7\u0094\2\2\u05e8\u05ef\7\u008f\2\2\u05e9\u05ef"+
		"\7\u0092\2\2\u05ea\u05ef\7\u0093\2\2\u05eb\u05ef\7\u0086\2\2\u05ec\u05ef"+
		"\7\u0096\2\2\u05ed\u05ef\5v<\2\u05ee\u05e1\3\2\2\2\u05ee\u05e2\3\2\2\2"+
		"\u05ee\u05e3\3\2\2\2\u05ee\u05e4\3\2\2\2\u05ee\u05e5\3\2\2\2\u05ee\u05e6"+
		"\3\2\2\2\u05ee\u05e7\3\2\2\2\u05ee\u05e8\3\2\2\2\u05ee\u05e9\3\2\2\2\u05ee"+
		"\u05ea\3\2\2\2\u05ee\u05eb\3\2\2\2\u05ee\u05ec\3\2\2\2\u05ee\u05ed\3\2"+
		"\2\2\u05ef\u00e1\3\2\2\2\u05f0\u05f1\br\1\2\u05f1\u05f2\5\u00e0q\2\u05f2"+
		"\u05f8\3\2\2\2\u05f3\u05f4\f\3\2\2\u05f4\u05f5\7\16\2\2\u05f5\u05f7\5"+
		"\u00e0q\2\u05f6\u05f3\3\2\2\2\u05f7\u05fa\3\2\2\2\u05f8\u05f6\3\2\2\2"+
		"\u05f8\u05f9\3\2\2\2\u05f9\u00e3\3\2\2\2\u05fa\u05f8\3\2\2\2\u05fb\u0600"+
		"\5\u00e8u\2\u05fc\u0600\5\u00eav\2\u05fd\u0600\5\u00a4S\2\u05fe\u0600"+
		"\5\u00e6t\2\u05ff\u05fb\3\2\2\2\u05ff\u05fc\3\2\2\2\u05ff\u05fd\3\2\2"+
		"\2\u05ff\u05fe\3\2\2\2\u0600\u00e5\3\2\2\2\u0601\u0602\t\3\2\2\u0602\u00e7"+
		"\3\2\2\2\u0603\u0604\7\21\2\2\u0604\u0605\5V,\2\u0605\u0606\7\22\2\2\u0606"+
		"\u00e9\3\2\2\2\u0607\u060a\5\u00e0q\2\u0608\u060a\5\u00ecw\2\u0609\u0607"+
		"\3\2\2\2\u0609\u0608\3\2\2\2\u060a\u00eb\3\2\2\2\u060b\u0611\5\u0090I"+
		"\2\u060c\u0611\5\u008aF\2\u060d\u0611\5\u008cG\2\u060e\u0611\5\u00f0y"+
		"\2\u060f\u0611\5\u00eex\2\u0610\u060b\3\2\2\2\u0610\u060c\3\2\2\2\u0610"+
		"\u060d\3\2\2\2\u0610\u060e\3\2\2\2\u0610\u060f\3\2\2\2\u0611\u00ed\3\2"+
		"\2\2\u0612\u0614\7\21\2\2\u0613\u0615\5\u00f2z\2\u0614\u0613\3\2\2\2\u0614"+
		"\u0615\3\2\2\2\u0615\u0616\3\2\2\2\u0616\u0617\7\22\2\2\u0617\u00ef\3"+
		"\2\2\2\u0618\u061a\7\25\2\2\u0619\u061b\5\u00f4{\2\u061a\u0619\3\2\2\2"+
		"\u061a\u061b\3\2\2\2\u061b\u061c\3\2\2\2\u061c\u061d\7\26\2\2\u061d\u00f1"+
		"\3\2\2\2\u061e\u061f\bz\1\2\u061f\u0620\5V,\2\u0620\u0626\3\2\2\2\u0621"+
		"\u0622\f\3\2\2\u0622\u0623\7\16\2\2\u0623\u0625\5V,\2\u0624\u0621\3\2"+
		"\2\2\u0625\u0628\3\2\2\2\u0626\u0624\3\2\2\2\u0626\u0627\3\2\2\2\u0627"+
		"\u00f3\3\2\2\2\u0628\u0626\3\2\2\2\u0629\u062a\b{\1\2\u062a\u062b\5\u00f6"+
		"|\2\u062b\u0631\3\2\2\2\u062c\u062d\f\3\2\2\u062d\u062e\7\16\2\2\u062e"+
		"\u0630\5\u00f6|\2\u062f\u062c\3\2\2\2\u0630\u0633\3\2\2\2\u0631\u062f"+
		"\3\2\2\2\u0631\u0632\3\2\2\2\u0632\u00f5\3\2\2\2\u0633\u0631\3\2\2\2\u0634"+
		"\u0635\5V,\2\u0635\u0636\7\f\2\2\u0636\u0637\5V,\2\u0637\u00f7\3\2\2\2"+
		"\u0638\u0639\5V,\2\u0639\u063a\7\f\2\2\u063a\u063b\5V,\2\u063b\u0642\3"+
		"\2\2\2\u063c\u063d\5V,\2\u063d\u063e\7\f\2\2\u063e\u0642\3\2\2\2\u063f"+
		"\u0640\7\f\2\2\u0640\u0642\5V,\2\u0641\u0638\3\2\2\2\u0641\u063c\3\2\2"+
		"\2\u0641\u063f\3\2\2\2\u0642\u00f9\3\2\2\2\u0643\u0644\5\u00a6T\2\u0644"+
		"\u0645\5\u0108\u0085\2\u0645\u0646\5V,\2\u0646\u00fb\3\2\2\2\u0647\u0648"+
		"\b\177\1\2\u0648\u0649\5\u00a6T\2\u0649\u064e\3\2\2\2\u064a\u064b\f\3"+
		"\2\2\u064b\u064d\5r:\2\u064c\u064a\3\2\2\2\u064d\u0650\3\2\2\2\u064e\u064c"+
		"\3\2\2\2\u064e\u064f\3\2\2\2\u064f\u00fd\3\2\2\2\u0650\u064e\3\2\2\2\u0651"+
		"\u0652\6\u0080;\3\u0652\u0653\7\u008c\2\2\u0653\u0656\5\u00b6\\\2\u0654"+
		"\u0656\5V,\2\u0655\u0651\3\2\2\2\u0655\u0654\3\2\2\2\u0656\u00ff\3\2\2"+
		"\2\u0657\u065e\7\35\2\2\u0658\u065e\7\36\2\2\u0659\u065e\5\u010a\u0086"+
		"\2\u065a\u065e\5\u010c\u0087\2\u065b\u065e\5\u010e\u0088\2\u065c\u065e"+
		"\5\u0110\u0089\2\u065d\u0657\3\2\2\2\u065d\u0658\3\2\2\2\u065d\u0659\3"+
		"\2\2\2\u065d\u065a\3\2\2\2\u065d\u065b\3\2\2\2\u065d\u065c\3\2\2\2\u065e"+
		"\u0101\3\2\2\2\u065f\u0660\7\u008c\2\2\u0660\u0661\6\u0082<\3\u0661\u0103"+
		"\3\2\2\2\u0662\u0663\7\u008c\2\2\u0663\u0664\6\u0083=\3\u0664\u0105\3"+
		"\2\2\2\u0665\u0666\7\u008c\2\2\u0666\u0667\6\u0084>\3\u0667\u0107\3\2"+
		"\2\2\u0668\u0669\7(\2\2\u0669\u0109\3\2\2\2\u066a\u066b\7\37\2\2\u066b"+
		"\u010b\3\2\2\2\u066c\u066d\7 \2\2\u066d\u010d\3\2\2\2\u066e\u066f\7!\2"+
		"\2\u066f\u010f\3\2\2\2\u0670\u0671\t\4\2\2\u0671\u0111\3\2\2\2\u0672\u0673"+
		"\3\2\2\2\u0673\u0113\3\2\2\2\u0674\u0675\3\2\2\2\u0675\u0115\3\2\2\2\u0676"+
		"\u0677\7u\2\2\u0677\u0678\5\u0118\u008d\2\u0678\u0679\7\r\2\2\u0679\u067e"+
		"\3\2\2\2\u067a\u067b\5\u0118\u008d\2\u067b\u067c\7\r\2\2\u067c\u067e\3"+
		"\2\2\2\u067d\u0676\3\2\2\2\u067d\u067a\3\2\2\2\u067e\u0117\3\2\2\2\u067f"+
		"\u0680\b\u008d\1\2\u0680\u0681\5\u011a\u008e\2\u0681\u0686\3\2\2\2\u0682"+
		"\u0683\f\3\2\2\u0683\u0685\5\u011c\u008f\2\u0684\u0682\3\2\2\2\u0685\u0688"+
		"\3\2\2\2\u0686\u0684\3\2\2\2\u0686\u0687\3\2\2\2\u0687\u0119\3\2\2\2\u0688"+
		"\u0686\3\2\2\2\u0689\u068d\5\u0124\u0093\2\u068a\u068d\5\u0126\u0094\2"+
		"\u068b\u068d\5\u0128\u0095\2\u068c\u0689\3\2\2\2\u068c\u068a\3\2\2\2\u068c"+
		"\u068b\3\2\2\2\u068d\u011b\3\2\2\2\u068e\u068f\7\20\2\2\u068f\u0692\5"+
		"\u011e\u0090\2\u0690\u0692\5\u0122\u0092\2\u0691\u068e\3\2\2\2\u0691\u0690"+
		"\3\2\2\2\u0692\u011d\3\2\2\2\u0693\u0694\5\u012a\u0096\2\u0694\u0696\7"+
		"\21\2\2\u0695\u0697\5\u0120\u0091\2\u0696\u0695\3\2\2\2\u0696\u0697\3"+
		"\2\2\2\u0697\u0698\3\2\2\2\u0698\u0699\7\22\2\2\u0699\u011f\3\2\2\2\u069a"+
		"\u069b\b\u0091\1\2\u069b\u069c\5\u0118\u008d\2\u069c\u06a2\3\2\2\2\u069d"+
		"\u069e\f\3\2\2\u069e\u069f\7\16\2\2\u069f\u06a1\5\u0118\u008d\2\u06a0"+
		"\u069d\3\2\2\2\u06a1\u06a4\3\2\2\2\u06a2\u06a0\3\2\2\2\u06a2\u06a3\3\2"+
		"\2\2\u06a3\u0121\3\2\2\2\u06a4\u06a2\3\2\2\2\u06a5\u06a6\7\23\2\2\u06a6"+
		"\u06a7\5\u0118\u008d\2\u06a7\u06a8\7\24\2\2\u06a8\u0123\3\2\2\2\u06a9"+
		"\u06aa\7\21\2\2\u06aa\u06ab\5\u0118\u008d\2\u06ab\u06ac\7\22\2\2\u06ac"+
		"\u0125\3\2\2\2\u06ad\u06ae\b\u0094\1\2\u06ae\u06af\5\u012a\u0096\2\u06af"+
		"\u06b5\3\2\2\2\u06b0\u06b1\f\3\2\2\u06b1\u06b2\7\20\2\2\u06b2\u06b4\5"+
		"\u012a\u0096\2\u06b3\u06b0\3\2\2\2\u06b4\u06b7\3\2\2\2\u06b5\u06b3\3\2"+
		"\2\2\u06b5\u06b6\3\2\2\2\u06b6\u0127\3\2\2\2\u06b7\u06b5\3\2\2\2\u06b8"+
		"\u06be\7\u0090\2\2\u06b9\u06be\7\u0092\2\2\u06ba\u06be\7\u008f\2\2\u06bb"+
		"\u06be\7\u0086\2\2\u06bc\u06be\7\u0087\2\2\u06bd\u06b8\3\2\2\2\u06bd\u06b9"+
		"\3\2\2\2\u06bd\u06ba\3\2\2\2\u06bd\u06bb\3\2\2\2\u06bd\u06bc\3\2\2\2\u06be"+
		"\u0129\3\2\2\2\u06bf\u06c0\t\5\2\2\u06c0\u012b\3\2\2\2\u06c1\u06c2\7u"+
		"\2\2\u06c2\u06c5\5\u012e\u0098\2\u06c3\u06c5\5\u012e\u0098\2\u06c4\u06c1"+
		"\3\2\2\2\u06c4\u06c3\3\2\2\2\u06c5\u012d\3\2\2\2\u06c6\u06c7\b\u0098\1"+
		"\2\u06c7\u06c8\5\u0130\u0099\2\u06c8\u06cd\3\2\2\2\u06c9\u06ca\f\3\2\2"+
		"\u06ca\u06cc\5\u0132\u009a\2\u06cb\u06c9\3\2\2\2\u06cc\u06cf\3\2\2\2\u06cd"+
		"\u06cb\3\2\2\2\u06cd\u06ce\3\2\2\2\u06ce\u012f\3\2\2\2\u06cf\u06cd\3\2"+
		"\2\2\u06d0\u06d5\5\u013c\u009f\2\u06d1\u06d5\5\u013e\u00a0\2\u06d2\u06d5"+
		"\5\u0140\u00a1\2\u06d3\u06d5\5\u0134\u009b\2\u06d4\u06d0\3\2\2\2\u06d4"+
		"\u06d1\3\2\2\2\u06d4\u06d2\3\2\2\2\u06d4\u06d3\3\2\2\2\u06d5\u0131\3\2"+
		"\2\2\u06d6\u06d7\7\20\2\2\u06d7\u06dd\5\u0134\u009b\2\u06d8\u06d9\7\23"+
		"\2\2\u06d9\u06da\5\u012e\u0098\2\u06da\u06db\7\24\2\2\u06db\u06dd\3\2"+
		"\2\2\u06dc\u06d6\3\2\2\2\u06dc\u06d8\3\2\2\2\u06dd\u0133\3\2\2\2\u06de"+
		"\u06df\5\u0142\u00a2\2\u06df\u06e1\7\21\2\2\u06e0\u06e2\5\u0136\u009c"+
		"\2\u06e1\u06e0\3\2\2\2\u06e1\u06e2\3\2\2\2\u06e2\u06e3\3\2\2\2\u06e3\u06e4"+
		"\7\22\2\2\u06e4\u0135\3\2\2\2\u06e5\u06ec\5\u0138\u009d\2\u06e6\u06ec"+
		"\5\u013a\u009e\2\u06e7\u06e8\5\u0138\u009d\2\u06e8\u06e9\7\16\2\2\u06e9"+
		"\u06ea\5\u013a\u009e\2\u06ea\u06ec\3\2\2\2\u06eb\u06e5\3\2\2\2\u06eb\u06e6"+
		"\3\2\2\2\u06eb\u06e7\3\2\2\2\u06ec\u0137\3\2\2\2\u06ed\u06ee\b\u009d\1"+
		"\2\u06ee\u06ef\5\u012e\u0098\2\u06ef\u06f5\3\2\2\2\u06f0\u06f1\f\3\2\2"+
		"\u06f1\u06f2\7\16\2\2\u06f2\u06f4\5\u012e\u0098\2\u06f3\u06f0\3\2\2\2"+
		"\u06f4\u06f7\3\2\2\2\u06f5\u06f3\3\2\2\2\u06f5\u06f6\3\2\2\2\u06f6\u0139"+
		"\3\2\2\2\u06f7\u06f5\3\2\2\2\u06f8\u06f9\b\u009e\1\2\u06f9\u06fa\5\u0142"+
		"\u00a2\2\u06fa\u06fb\7(\2\2\u06fb\u06fc\5\u012e\u0098\2\u06fc\u0705\3"+
		"\2\2\2\u06fd\u06fe\f\3\2\2\u06fe\u06ff\7\16\2\2\u06ff\u0700\5\u0142\u00a2"+
		"\2\u0700\u0701\7(\2\2\u0701\u0702\5\u012e\u0098\2\u0702\u0704\3\2\2\2"+
		"\u0703\u06fd\3\2\2\2\u0704\u0707\3\2\2\2\u0705\u0703\3\2\2\2\u0705\u0706"+
		"\3\2\2\2\u0706\u013b\3\2\2\2\u0707\u0705\3\2\2\2\u0708\u0709\7\21\2\2"+
		"\u0709\u070a\5\u012e\u0098\2\u070a\u070b\7\22\2\2\u070b\u013d\3\2\2\2"+
		"\u070c\u070d\b\u00a0\1\2\u070d\u0710\7\u008e\2\2\u070e\u0710\5\u0142\u00a2"+
		"\2\u070f\u070c\3\2\2\2\u070f\u070e\3\2\2\2\u0710\u0716\3\2\2\2\u0711\u0712"+
		"\f\3\2\2\u0712\u0713\7\20\2\2\u0713\u0715\5\u0142\u00a2\2\u0714\u0711"+
		"\3\2\2\2\u0715\u0718\3\2\2\2\u0716\u0714\3\2\2\2\u0716\u0717\3\2\2\2\u0717"+
		"\u013f\3\2\2\2\u0718\u0716\3\2\2\2\u0719\u071f\7\u0090\2\2\u071a\u071f"+
		"\7\u0092\2\2\u071b\u071f\7\u008f\2\2\u071c\u071f\7\u0086\2\2\u071d\u071f"+
		"\7\u0087\2\2\u071e\u0719\3\2\2\2\u071e\u071a\3\2\2\2\u071e\u071b\3\2\2"+
		"\2\u071e\u071c\3\2\2\2\u071e\u071d\3\2\2\2\u071f\u0141\3\2\2\2\u0720\u0721"+
		"\t\6\2\2\u0721\u0143\3\2\2\2\u0722\u0723\7u\2\2\u0723\u0724\5\u0146\u00a4"+
		"\2\u0724\u0725\7\r\2\2\u0725\u072a\3\2\2\2\u0726\u0727\5\u0146\u00a4\2"+
		"\u0727\u0728\7\r\2\2\u0728\u072a\3\2\2\2\u0729\u0722\3\2\2\2\u0729\u0726"+
		"\3\2\2\2\u072a\u0145\3\2\2\2\u072b\u072c\b\u00a4\1\2\u072c\u072d\5\u0148"+
		"\u00a5\2\u072d\u0732\3\2\2\2\u072e\u072f\f\3\2\2\u072f\u0731\5\u014a\u00a6"+
		"\2\u0730\u072e\3\2\2\2\u0731\u0734\3\2\2\2\u0732\u0730\3\2\2\2\u0732\u0733"+
		"\3\2\2\2\u0733\u0147\3\2\2\2\u0734\u0732\3\2\2\2\u0735\u0739\5\u0152\u00aa"+
		"\2\u0736\u0739\5\u0154\u00ab\2\u0737\u0739\5\u0158\u00ad\2\u0738\u0735"+
		"\3\2\2\2\u0738\u0736\3\2\2\2\u0738\u0737\3\2\2\2\u0739\u0149\3\2\2\2\u073a"+
		"\u073b\7\20\2\2\u073b\u073e\5\u014c\u00a7\2\u073c\u073e\5\u0150\u00a9"+
		"\2\u073d\u073a\3\2\2\2\u073d\u073c\3\2\2\2\u073e\u014b\3\2\2\2\u073f\u0740"+
		"\5\u015a\u00ae\2\u0740\u0742\7\21\2\2\u0741\u0743\5\u014e\u00a8\2\u0742"+
		"\u0741\3\2\2\2\u0742\u0743\3\2\2\2\u0743\u0744\3\2\2\2\u0744\u0745\7\22"+
		"\2\2\u0745\u014d\3\2\2\2\u0746\u0747\b\u00a8\1\2\u0747\u0748\5\u0146\u00a4"+
		"\2\u0748\u074e\3\2\2\2\u0749\u074a\f\3\2\2\u074a\u074b\7\16\2\2\u074b"+
		"\u074d\5\u0146\u00a4\2\u074c\u0749\3\2\2\2\u074d\u0750\3\2\2\2\u074e\u074c"+
		"\3\2\2\2\u074e\u074f\3\2\2\2\u074f\u014f\3\2\2\2\u0750\u074e\3\2\2\2\u0751"+
		"\u0752\7\23\2\2\u0752\u0753\5\u0146\u00a4\2\u0753\u0754\7\24\2\2\u0754"+
		"\u0151\3\2\2\2\u0755\u0756\7\21\2\2\u0756\u0757\5\u0146\u00a4\2\u0757"+
		"\u0758\7\22\2\2\u0758\u0153\3\2\2\2\u0759\u075a\b\u00ab\1\2\u075a\u075b"+
		"\5\u015a\u00ae\2\u075b\u0761\3\2\2\2\u075c\u075d\f\3\2\2\u075d\u075e\7"+
		"\20\2\2\u075e\u0760\5\u015a\u00ae\2\u075f\u075c\3\2\2\2\u0760\u0763\3"+
		"\2\2\2\u0761\u075f\3\2\2\2\u0761\u0762\3\2\2\2\u0762\u0155\3\2\2\2\u0763"+
		"\u0761\3\2\2\2\u0764\u0765\b\u00ac\1\2\u0765\u0766\5\u0154\u00ab\2\u0766"+
		"\u076b\3\2\2\2\u0767\u0768\f\3\2\2\u0768\u076a\7\u008e\2\2\u0769\u0767"+
		"\3\2\2\2\u076a\u076d\3\2\2\2\u076b\u0769\3\2\2\2\u076b\u076c\3\2\2\2\u076c"+
		"\u0157\3\2\2\2\u076d\u076b\3\2\2\2\u076e\u0774\7\u0090\2\2\u076f\u0774"+
		"\7\u0092\2\2\u0770\u0774\7\u008f\2\2\u0771\u0774\7\u0086\2\2\u0772\u0774"+
		"\7\u0087\2\2\u0773\u076e\3\2\2\2\u0773\u076f\3\2\2\2\u0773\u0770\3\2\2"+
		"\2\u0773\u0771\3\2\2\2\u0773\u0772\3\2\2\2\u0774\u0159\3\2\2\2\u0775\u0776"+
		"\t\7\2\2\u0776\u015b\3\2\2\2\u0777\u0778\7u\2\2\u0778\u0779\5\u015e\u00b0"+
		"\2\u0779\u077a\7\r\2\2\u077a\u077f\3\2\2\2\u077b\u077c\5\u015e\u00b0\2"+
		"\u077c\u077d\7\r\2\2\u077d\u077f\3\2\2\2\u077e\u0777\3\2\2\2\u077e\u077b"+
		"\3\2\2\2\u077f\u015d\3\2\2\2\u0780\u0781\b\u00b0\1\2\u0781\u0782\5\u0160"+
		"\u00b1\2\u0782\u0787\3\2\2\2\u0783\u0784\f\3\2\2\u0784\u0786\5\u0162\u00b2"+
		"\2\u0785\u0783\3\2\2\2\u0786\u0789\3\2\2\2\u0787\u0785\3\2\2\2\u0787\u0788"+
		"\3\2\2\2\u0788\u015f\3\2\2\2\u0789\u0787\3\2\2\2\u078a\u078e\5\u016a\u00b6"+
		"\2\u078b\u078e\5\u016c\u00b7\2\u078c\u078e\5\u016e\u00b8\2\u078d\u078a"+
		"\3\2\2\2\u078d\u078b\3\2\2\2\u078d\u078c\3\2\2\2\u078e\u0161\3\2\2\2\u078f"+
		"\u0790\7\20\2\2\u0790\u0793\5\u0164\u00b3\2\u0791\u0793\5\u0168\u00b5"+
		"\2\u0792\u078f\3\2\2\2\u0792\u0791\3\2\2\2\u0793\u0163\3\2\2\2\u0794\u0795"+
		"\5\u0170\u00b9\2\u0795\u0797\7\21\2\2\u0796\u0798\5\u0166\u00b4\2\u0797"+
		"\u0796\3\2\2\2\u0797\u0798\3\2\2\2\u0798\u0799\3\2\2\2\u0799\u079a\7\22"+
		"\2\2\u079a\u0165\3\2\2\2\u079b\u079c\b\u00b4\1\2\u079c\u079d\5\u015e\u00b0"+
		"\2\u079d\u07a3\3\2\2\2\u079e\u079f\f\3\2\2\u079f\u07a0\7\16\2\2\u07a0"+
		"\u07a2\5\u015e\u00b0\2\u07a1\u079e\3\2\2\2\u07a2\u07a5\3\2\2\2\u07a3\u07a1"+
		"\3\2\2\2\u07a3\u07a4\3\2\2\2\u07a4\u0167\3\2\2\2\u07a5\u07a3\3\2\2\2\u07a6"+
		"\u07a7\7\23\2\2\u07a7\u07a8\5\u015e\u00b0\2\u07a8\u07a9\7\24\2\2\u07a9"+
		"\u0169\3\2\2\2\u07aa\u07ab\7\21\2\2\u07ab\u07ac\5\u015e\u00b0\2\u07ac"+
		"\u07ad\7\22\2\2\u07ad\u016b\3\2\2\2\u07ae\u07af\b\u00b7\1\2\u07af\u07b2"+
		"\7\u008e\2\2\u07b0\u07b2\5\u0170\u00b9\2\u07b1\u07ae\3\2\2\2\u07b1\u07b0"+
		"\3\2\2\2\u07b2\u07b8\3\2\2\2\u07b3\u07b4\f\3\2\2\u07b4\u07b5\7\20\2\2"+
		"\u07b5\u07b7\5\u0170\u00b9\2\u07b6\u07b3\3\2\2\2\u07b7\u07ba\3\2\2\2\u07b8"+
		"\u07b6\3\2\2\2\u07b8\u07b9\3\2\2\2\u07b9\u016d\3\2\2\2\u07ba\u07b8\3\2"+
		"\2\2\u07bb\u07c1\7\u0090\2\2\u07bc\u07c1\7\u0092\2\2\u07bd\u07c1\7\u008f"+
		"\2\2\u07be\u07c1\7\u0086\2\2\u07bf\u07c1\7\u0087\2\2\u07c0\u07bb\3\2\2"+
		"\2\u07c0\u07bc\3\2\2\2\u07c0\u07bd\3\2\2\2\u07c0\u07be\3\2\2\2\u07c0\u07bf"+
		"\3\2\2\2\u07c1\u016f\3\2\2\2\u07c2\u07c3\t\6\2\2\u07c3\u0171\3\2\2\2\u00a7"+
		"\u0179\u017d\u019c\u01a6\u01aa\u01b4\u01c0\u01c6\u01c9\u01cc\u01d5\u01dd"+
		"\u01e5\u01f0\u01fd\u0213\u021e\u0223\u0229\u022f\u0235\u023a\u023f\u0246"+
		"\u025d\u0267\u026c\u0273\u0275\u0288\u029f\u02a1\u02a9\u02b0\u02b2\u02ba"+
		"\u02c4\u02d9\u02dd\u02f1\u02fe\u0302\u030a\u030d\u0312\u0315\u031d\u0328"+
		"\u032c\u0330\u0337\u0340\u0349\u0352\u036b\u03c8\u03ca\u03d6\u03df\u0402"+
		"\u0410\u0413\u0418\u0421\u0428\u043a\u0444\u0452\u045a\u0460\u046b\u0477"+
		"\u0482\u048f\u0493\u0499\u04a5\u04b9\u04bb\u04c0\u04cc\u04d7\u04e1\u04e6"+
		"\u04eb\u04fb\u0500\u0503\u0507\u050c\u0513\u051e\u0520\u052c\u0534\u0540"+
		"\u0544\u054e\u0556\u055c\u0563\u0568\u0572\u0579\u0584\u0591\u0595\u0598"+
		"\u059c\u059f\u05aa\u05b6\u05c2\u05ce\u05df\u05ee\u05f8\u05ff\u0609\u0610"+
		"\u0614\u061a\u0626\u0631\u0641\u064e\u0655\u065d\u067d\u0686\u068c\u0691"+
		"\u0696\u06a2\u06b5\u06bd\u06c4\u06cd\u06d4\u06dc\u06e1\u06eb\u06f5\u0705"+
		"\u070f\u0716\u071e\u0729\u0732\u0738\u073d\u0742\u074e\u0761\u076b\u0773"+
		"\u077e\u0787\u078d\u0792\u0797\u07a3\u07b1\u07b8\u07c0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}