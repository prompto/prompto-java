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
		RULE_test_method_declaration = 19, RULE_assertion = 20, RULE_full_argument_list = 21, 
		RULE_typed_argument = 22, RULE_statement = 23, RULE_method_call_statement = 24, 
		RULE_with_resource_statement = 25, RULE_with_singleton_statement = 26, 
		RULE_switch_statement = 27, RULE_switch_case_statement = 28, RULE_for_each_statement = 29, 
		RULE_do_while_statement = 30, RULE_while_statement = 31, RULE_if_statement = 32, 
		RULE_else_if_statement_list = 33, RULE_raise_statement = 34, RULE_try_statement = 35, 
		RULE_catch_statement = 36, RULE_return_statement = 37, RULE_expression = 38, 
		RULE_unresolved_expression = 39, RULE_unresolved_selector = 40, RULE_invocation_expression = 41, 
		RULE_invocation_trailer = 42, RULE_instance_expression = 43, RULE_instance_selector = 44, 
		RULE_document_expression = 45, RULE_constructor_expression = 46, RULE_read_expression = 47, 
		RULE_write_statement = 48, RULE_ambiguous_expression = 49, RULE_fetch_expression = 50, 
		RULE_sorted_expression = 51, RULE_argument_assignment_list = 52, RULE_with_argument_assignment_list = 53, 
		RULE_argument_assignment = 54, RULE_assign_instance_statement = 55, RULE_child_instance = 56, 
		RULE_assign_tuple_statement = 57, RULE_lfs = 58, RULE_lfp = 59, RULE_indent = 60, 
		RULE_dedent = 61, RULE_null_literal = 62, RULE_declaration_list = 63, 
		RULE_declarations = 64, RULE_declaration = 65, RULE_resource_declaration = 66, 
		RULE_enum_declaration = 67, RULE_native_symbol_list = 68, RULE_category_symbol_list = 69, 
		RULE_symbol_list = 70, RULE_attribute_constraint = 71, RULE_list_literal = 72, 
		RULE_set_literal = 73, RULE_expression_list = 74, RULE_range_literal = 75, 
		RULE_typedef = 76, RULE_primary_type = 77, RULE_native_type = 78, RULE_category_type = 79, 
		RULE_code_type = 80, RULE_document_type = 81, RULE_category_declaration = 82, 
		RULE_type_identifier_list = 83, RULE_method_identifier = 84, RULE_identifier = 85, 
		RULE_variable_identifier = 86, RULE_type_identifier = 87, RULE_symbol_identifier = 88, 
		RULE_argument_list = 89, RULE_argument = 90, RULE_operator_argument = 91, 
		RULE_named_argument = 92, RULE_code_argument = 93, RULE_category_or_any_type = 94, 
		RULE_any_type = 95, RULE_member_method_declaration_list = 96, RULE_member_method_declaration = 97, 
		RULE_native_member_method_declaration_list = 98, RULE_native_member_method_declaration = 99, 
		RULE_native_category_binding = 100, RULE_python_category_binding = 101, 
		RULE_python_module = 102, RULE_module_token = 103, RULE_javascript_category_binding = 104, 
		RULE_javascript_module = 105, RULE_variable_identifier_list = 106, RULE_method_declaration = 107, 
		RULE_native_statement_list = 108, RULE_native_statement = 109, RULE_python_native_statement = 110, 
		RULE_javascript_native_statement = 111, RULE_statement_list = 112, RULE_assertion_list = 113, 
		RULE_switch_case_statement_list = 114, RULE_catch_statement_list = 115, 
		RULE_literal_collection = 116, RULE_atomic_literal = 117, RULE_literal_list_literal = 118, 
		RULE_selectable_expression = 119, RULE_this_expression = 120, RULE_parenthesis_expression = 121, 
		RULE_literal_expression = 122, RULE_collection_literal = 123, RULE_tuple_literal = 124, 
		RULE_dict_literal = 125, RULE_expression_tuple = 126, RULE_dict_entry_list = 127, 
		RULE_dict_entry = 128, RULE_slice_arguments = 129, RULE_assign_variable_statement = 130, 
		RULE_assignable_instance = 131, RULE_is_expression = 132, RULE_operator = 133, 
		RULE_key_token = 134, RULE_value_token = 135, RULE_symbols_token = 136, 
		RULE_assign = 137, RULE_multiply = 138, RULE_divide = 139, RULE_idivide = 140, 
		RULE_modulo = 141, RULE_javascript_statement = 142, RULE_javascript_expression = 143, 
		RULE_javascript_primary_expression = 144, RULE_javascript_this_expression = 145, 
		RULE_javascript_selector_expression = 146, RULE_javascript_method_expression = 147, 
		RULE_javascript_arguments = 148, RULE_javascript_item_expression = 149, 
		RULE_javascript_parenthesis_expression = 150, RULE_javascript_identifier_expression = 151, 
		RULE_javascript_literal_expression = 152, RULE_javascript_identifier = 153, 
		RULE_python_statement = 154, RULE_python_expression = 155, RULE_python_primary_expression = 156, 
		RULE_python_selector_expression = 157, RULE_python_method_expression = 158, 
		RULE_python_argument_list = 159, RULE_python_ordinal_argument_list = 160, 
		RULE_python_named_argument_list = 161, RULE_python_parenthesis_expression = 162, 
		RULE_python_identifier_expression = 163, RULE_python_literal_expression = 164, 
		RULE_python_identifier = 165, RULE_java_statement = 166, RULE_java_expression = 167, 
		RULE_java_primary_expression = 168, RULE_java_this_expression = 169, RULE_java_selector_expression = 170, 
		RULE_java_method_expression = 171, RULE_java_arguments = 172, RULE_java_item_expression = 173, 
		RULE_java_parenthesis_expression = 174, RULE_java_identifier_expression = 175, 
		RULE_java_class_identifier_expression = 176, RULE_java_literal_expression = 177, 
		RULE_java_identifier = 178, RULE_csharp_statement = 179, RULE_csharp_expression = 180, 
		RULE_csharp_primary_expression = 181, RULE_csharp_this_expression = 182, 
		RULE_csharp_selector_expression = 183, RULE_csharp_method_expression = 184, 
		RULE_csharp_arguments = 185, RULE_csharp_item_expression = 186, RULE_csharp_parenthesis_expression = 187, 
		RULE_csharp_identifier_expression = 188, RULE_csharp_literal_expression = 189, 
		RULE_csharp_identifier = 190;
	public static final String[] ruleNames = {
		"enum_category_declaration", "enum_native_declaration", "native_symbol", 
		"category_symbol", "attribute_declaration", "concrete_category_declaration", 
		"singleton_category_declaration", "derived_list", "operator_method_declaration", 
		"setter_method_declaration", "getter_method_declaration", "native_category_declaration", 
		"native_resource_declaration", "native_category_bindings", "native_category_binding_list", 
		"attribute_list", "abstract_method_declaration", "concrete_method_declaration", 
		"native_method_declaration", "test_method_declaration", "assertion", "full_argument_list", 
		"typed_argument", "statement", "method_call_statement", "with_resource_statement", 
		"with_singleton_statement", "switch_statement", "switch_case_statement", 
		"for_each_statement", "do_while_statement", "while_statement", "if_statement", 
		"else_if_statement_list", "raise_statement", "try_statement", "catch_statement", 
		"return_statement", "expression", "unresolved_expression", "unresolved_selector", 
		"invocation_expression", "invocation_trailer", "instance_expression", 
		"instance_selector", "document_expression", "constructor_expression", 
		"read_expression", "write_statement", "ambiguous_expression", "fetch_expression", 
		"sorted_expression", "argument_assignment_list", "with_argument_assignment_list", 
		"argument_assignment", "assign_instance_statement", "child_instance", 
		"assign_tuple_statement", "lfs", "lfp", "indent", "dedent", "null_literal", 
		"declaration_list", "declarations", "declaration", "resource_declaration", 
		"enum_declaration", "native_symbol_list", "category_symbol_list", "symbol_list", 
		"attribute_constraint", "list_literal", "set_literal", "expression_list", 
		"range_literal", "typedef", "primary_type", "native_type", "category_type", 
		"code_type", "document_type", "category_declaration", "type_identifier_list", 
		"method_identifier", "identifier", "variable_identifier", "type_identifier", 
		"symbol_identifier", "argument_list", "argument", "operator_argument", 
		"named_argument", "code_argument", "category_or_any_type", "any_type", 
		"member_method_declaration_list", "member_method_declaration", "native_member_method_declaration_list", 
		"native_member_method_declaration", "native_category_binding", "python_category_binding", 
		"python_module", "module_token", "javascript_category_binding", "javascript_module", 
		"variable_identifier_list", "method_declaration", "native_statement_list", 
		"native_statement", "python_native_statement", "javascript_native_statement", 
		"statement_list", "assertion_list", "switch_case_statement_list", "catch_statement_list", 
		"literal_collection", "atomic_literal", "literal_list_literal", "selectable_expression", 
		"this_expression", "parenthesis_expression", "literal_expression", "collection_literal", 
		"tuple_literal", "dict_literal", "expression_tuple", "dict_entry_list", 
		"dict_entry", "slice_arguments", "assign_variable_statement", "assignable_instance", 
		"is_expression", "operator", "key_token", "value_token", "symbols_token", 
		"assign", "multiply", "divide", "idivide", "modulo", "javascript_statement", 
		"javascript_expression", "javascript_primary_expression", "javascript_this_expression", 
		"javascript_selector_expression", "javascript_method_expression", "javascript_arguments", 
		"javascript_item_expression", "javascript_parenthesis_expression", "javascript_identifier_expression", 
		"javascript_literal_expression", "javascript_identifier", "python_statement", 
		"python_expression", "python_primary_expression", "python_selector_expression", 
		"python_method_expression", "python_argument_list", "python_ordinal_argument_list", 
		"python_named_argument_list", "python_parenthesis_expression", "python_identifier_expression", 
		"python_literal_expression", "python_identifier", "java_statement", "java_expression", 
		"java_primary_expression", "java_this_expression", "java_selector_expression", 
		"java_method_expression", "java_arguments", "java_item_expression", "java_parenthesis_expression", 
		"java_identifier_expression", "java_class_identifier_expression", "java_literal_expression", 
		"java_identifier", "csharp_statement", "csharp_expression", "csharp_primary_expression", 
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
			setState(382); 
			match(DEFINE);
			setState(383); 
			((Enum_category_declarationContext)_localctx).name = type_identifier();
			setState(384); 
			match(AS);
			setState(385); 
			match(ENUMERATED);
			setState(388);
			switch (_input.LA(1)) {
			case CATEGORY:
				{
				setState(386); 
				match(CATEGORY);
				}
				break;
			case TYPE_IDENTIFIER:
				{
				setState(387); 
				((Enum_category_declarationContext)_localctx).derived = type_identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(395);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				{
				setState(390); 
				((Enum_category_declarationContext)_localctx).attrs = attribute_list();
				setState(391); 
				match(COMMA);
				setState(392); 
				match(AND);
				}
				}
				break;
			case 2:
				{
				setState(394); 
				match(WITH);
				}
				break;
			}
			setState(397); 
			symbols_token();
			setState(398); 
			match(COLON);
			setState(399); 
			indent();
			setState(400); 
			((Enum_category_declarationContext)_localctx).symbols = category_symbol_list(0);
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
			setState(403); 
			match(DEFINE);
			setState(404); 
			((Enum_native_declarationContext)_localctx).name = type_identifier();
			setState(405); 
			match(AS);
			setState(406); 
			match(ENUMERATED);
			setState(407); 
			((Enum_native_declarationContext)_localctx).typ = native_type();
			setState(408); 
			match(WITH);
			setState(409); 
			symbols_token();
			setState(410); 
			match(COLON);
			setState(411); 
			indent();
			setState(412); 
			((Enum_native_declarationContext)_localctx).symbols = native_symbol_list(0);
			setState(413); 
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
			setState(415); 
			((Native_symbolContext)_localctx).name = symbol_identifier();
			setState(416); 
			match(WITH);
			setState(417); 
			((Native_symbolContext)_localctx).exp = expression(0);
			setState(418); 
			match(AS);
			setState(419); 
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421); 
			((Category_symbolContext)_localctx).name = symbol_identifier();
			setState(422); 
			((Category_symbolContext)_localctx).args = with_argument_assignment_list(0);
			setState(425);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(423); 
				match(AND);
				setState(424); 
				((Category_symbolContext)_localctx).arg = argument_assignment();
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

	public static class Attribute_declarationContext extends ParserRuleContext {
		public Variable_identifierContext name;
		public TypedefContext typ;
		public Attribute_constraintContext match;
		public TerminalNode DEFINE() { return getToken(EParser.DEFINE, 0); }
		public TerminalNode AS() { return getToken(EParser.AS, 0); }
		public TerminalNode ATTRIBUTE() { return getToken(EParser.ATTRIBUTE, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427); 
			match(DEFINE);
			setState(428); 
			((Attribute_declarationContext)_localctx).name = variable_identifier();
			setState(429); 
			match(AS);
			setState(430); 
			((Attribute_declarationContext)_localctx).typ = typedef(0);
			setState(431); 
			match(ATTRIBUTE);
			setState(433);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(432); 
				((Attribute_declarationContext)_localctx).match = attribute_constraint();
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435); 
			match(DEFINE);
			setState(436); 
			((Concrete_category_declarationContext)_localctx).name = type_identifier();
			setState(437); 
			match(AS);
			setState(440);
			switch (_input.LA(1)) {
			case CATEGORY:
				{
				setState(438); 
				match(CATEGORY);
				}
				break;
			case TYPE_IDENTIFIER:
				{
				setState(439); 
				((Concrete_category_declarationContext)_localctx).derived = derived_list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(460);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				{
				setState(442); 
				((Concrete_category_declarationContext)_localctx).attrs = attribute_list();
				setState(451);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(443); 
					match(COMMA);
					setState(444); 
					match(AND);
					setState(445); 
					match(METHODS);
					setState(446); 
					match(COLON);
					setState(447); 
					indent();
					setState(448); 
					((Concrete_category_declarationContext)_localctx).methods = member_method_declaration_list(0);
					setState(449); 
					dedent();
					}
					break;
				}
				}
				}
				break;
			case 2:
				{
				{
				setState(453); 
				match(WITH);
				setState(454); 
				match(METHODS);
				setState(455); 
				match(COLON);
				setState(456); 
				indent();
				setState(457); 
				((Concrete_category_declarationContext)_localctx).methods = member_method_declaration_list(0);
				setState(458); 
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462); 
			match(DEFINE);
			setState(463); 
			((Singleton_category_declarationContext)_localctx).name = type_identifier();
			setState(464); 
			match(AS);
			setState(465); 
			match(SINGLETON);
			setState(484);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				{
				setState(466); 
				((Singleton_category_declarationContext)_localctx).attrs = attribute_list();
				setState(475);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(467); 
					match(COMMA);
					setState(468); 
					match(AND);
					setState(469); 
					match(METHODS);
					setState(470); 
					match(COLON);
					setState(471); 
					indent();
					setState(472); 
					((Singleton_category_declarationContext)_localctx).methods = member_method_declaration_list(0);
					setState(473); 
					dedent();
					}
					break;
				}
				}
				}
				break;
			case 2:
				{
				{
				setState(477); 
				match(WITH);
				setState(478); 
				match(METHODS);
				setState(479); 
				match(COLON);
				setState(480); 
				indent();
				setState(481); 
				((Singleton_category_declarationContext)_localctx).methods = member_method_declaration_list(0);
				setState(482); 
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
			setState(491);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new DerivedListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(486); 
				((DerivedListContext)_localctx).items = type_identifier_list(0);
				}
				break;
			case 2:
				_localctx = new DerivedListItemContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(487); 
				((DerivedListItemContext)_localctx).items = type_identifier_list(0);
				setState(488); 
				match(AND);
				setState(489); 
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
			setState(493); 
			match(DEFINE);
			setState(494); 
			((Operator_method_declarationContext)_localctx).op = operator();
			setState(495); 
			match(AS);
			setState(496); 
			match(OPERATOR);
			setState(497); 
			match(RECEIVING);
			setState(498); 
			((Operator_method_declarationContext)_localctx).arg = operator_argument();
			setState(501);
			_la = _input.LA(1);
			if (_la==RETURNING) {
				{
				setState(499); 
				match(RETURNING);
				setState(500); 
				((Operator_method_declarationContext)_localctx).typ = typedef(0);
				}
			}

			setState(503); 
			match(DOING);
			setState(504); 
			match(COLON);
			setState(505); 
			indent();
			setState(506); 
			((Operator_method_declarationContext)_localctx).stmts = statement_list(0);
			setState(507); 
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
			setState(509); 
			match(DEFINE);
			setState(510); 
			((Setter_method_declarationContext)_localctx).name = variable_identifier();
			setState(511); 
			match(SETTER);
			setState(512); 
			match(DOING);
			setState(513); 
			match(COLON);
			setState(514); 
			indent();
			setState(515); 
			((Setter_method_declarationContext)_localctx).stmts = statement_list(0);
			setState(516); 
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
		enterRule(_localctx, 20, RULE_getter_method_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518); 
			match(DEFINE);
			setState(519); 
			((Getter_method_declarationContext)_localctx).name = variable_identifier();
			setState(520); 
			match(GETTER);
			setState(521); 
			match(DOING);
			setState(522); 
			match(COLON);
			setState(523); 
			indent();
			setState(524); 
			((Getter_method_declarationContext)_localctx).stmts = statement_list(0);
			setState(525); 
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
		enterRule(_localctx, 22, RULE_native_category_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527); 
			match(DEFINE);
			setState(528); 
			((Native_category_declarationContext)_localctx).name = type_identifier();
			setState(529); 
			match(AS);
			setState(530); 
			match(NATIVE);
			setState(531); 
			match(CATEGORY);
			setState(539);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				{
				setState(532); 
				((Native_category_declarationContext)_localctx).attrs = attribute_list();
				setState(533); 
				match(COMMA);
				setState(534); 
				match(AND);
				setState(535); 
				match(BINDINGS);
				}
				}
				break;
			case 2:
				{
				setState(537); 
				match(WITH);
				setState(538); 
				match(BINDINGS);
				}
				break;
			}
			setState(541); 
			match(COLON);
			setState(542); 
			indent();
			setState(543); 
			((Native_category_declarationContext)_localctx).bindings = native_category_bindings();
			setState(544); 
			dedent();
			setState(553);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(545); 
				lfp();
				setState(546); 
				match(AND);
				setState(547); 
				match(METHODS);
				setState(548); 
				match(COLON);
				setState(549); 
				indent();
				setState(550); 
				((Native_category_declarationContext)_localctx).methods = native_member_method_declaration_list(0);
				setState(551); 
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
		enterRule(_localctx, 24, RULE_native_resource_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555); 
			match(DEFINE);
			setState(556); 
			((Native_resource_declarationContext)_localctx).name = type_identifier();
			setState(557); 
			match(AS);
			setState(558); 
			match(NATIVE);
			setState(559); 
			match(RESOURCE);
			setState(567);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				{
				setState(560); 
				((Native_resource_declarationContext)_localctx).attrs = attribute_list();
				setState(561); 
				match(COMMA);
				setState(562); 
				match(AND);
				setState(563); 
				match(BINDINGS);
				}
				}
				break;
			case 2:
				{
				setState(565); 
				match(WITH);
				setState(566); 
				match(BINDINGS);
				}
				break;
			}
			setState(569); 
			match(COLON);
			setState(570); 
			indent();
			setState(571); 
			((Native_resource_declarationContext)_localctx).bindings = native_category_bindings();
			setState(572); 
			dedent();
			setState(581);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(573); 
				lfp();
				setState(574); 
				match(AND);
				setState(575); 
				match(METHODS);
				setState(576); 
				match(COLON);
				setState(577); 
				indent();
				setState(578); 
				((Native_resource_declarationContext)_localctx).methods = native_member_method_declaration_list(0);
				setState(579); 
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
		enterRule(_localctx, 26, RULE_native_category_bindings);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583); 
			match(DEFINE);
			setState(584); 
			match(CATEGORY);
			setState(585); 
			match(BINDINGS);
			setState(586); 
			match(AS);
			setState(587); 
			match(COLON);
			setState(588); 
			indent();
			setState(589); 
			((Native_category_bindingsContext)_localctx).items = native_category_binding_list(0);
			setState(590); 
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

			setState(593); 
			((NativeCategoryBindingListContext)_localctx).item = native_category_binding();
			}
			_ctx.stop = _input.LT(-1);
			setState(601);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NativeCategoryBindingListItemContext(new Native_category_binding_listContext(_parentctx, _parentState));
					((NativeCategoryBindingListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_native_category_binding_list);
					setState(595);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(596); 
					lfp();
					setState(597); 
					((NativeCategoryBindingListItemContext)_localctx).item = native_category_binding();
					}
					} 
				}
				setState(603);
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
	public static class AttributeListContext extends Attribute_listContext {
		public Variable_identifierContext item;
		public TerminalNode WITH() { return getToken(EParser.WITH, 0); }
		public TerminalNode ATTRIBUTE() { return getToken(EParser.ATTRIBUTE, 0); }
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
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
		public Variable_identifier_listContext items;
		public Variable_identifierContext item;
		public TerminalNode WITH() { return getToken(EParser.WITH, 0); }
		public TerminalNode ATTRIBUTES() { return getToken(EParser.ATTRIBUTES, 0); }
		public Variable_identifier_listContext variable_identifier_list() {
			return getRuleContext(Variable_identifier_listContext.class,0);
		}
		public TerminalNode AND() { return getToken(EParser.AND, 0); }
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
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
		enterRule(_localctx, 30, RULE_attribute_list);
		try {
			setState(614);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new AttributeListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(604); 
				match(WITH);
				setState(605); 
				match(ATTRIBUTE);
				setState(606); 
				((AttributeListContext)_localctx).item = variable_identifier();
				}
				break;
			case 2:
				_localctx = new AttributeListItemContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(607); 
				match(WITH);
				setState(608); 
				match(ATTRIBUTES);
				setState(609); 
				((AttributeListItemContext)_localctx).items = variable_identifier_list(0);
				setState(612);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(610); 
					match(AND);
					setState(611); 
					((AttributeListItemContext)_localctx).item = variable_identifier();
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
		enterRule(_localctx, 32, RULE_abstract_method_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616); 
			match(DEFINE);
			setState(617); 
			((Abstract_method_declarationContext)_localctx).name = method_identifier();
			setState(618); 
			match(AS);
			setState(619); 
			match(ABSTRACT);
			setState(620); 
			match(METHOD);
			setState(623);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(621); 
				match(RECEIVING);
				setState(622); 
				((Abstract_method_declarationContext)_localctx).args = full_argument_list();
				}
				break;
			}
			setState(627);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(625); 
				match(RETURNING);
				setState(626); 
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
		enterRule(_localctx, 34, RULE_concrete_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(629); 
			match(DEFINE);
			setState(630); 
			((Concrete_method_declarationContext)_localctx).name = method_identifier();
			setState(631); 
			match(AS);
			setState(632); 
			match(METHOD);
			setState(635);
			_la = _input.LA(1);
			if (_la==RECEIVING) {
				{
				setState(633); 
				match(RECEIVING);
				setState(634); 
				((Concrete_method_declarationContext)_localctx).args = full_argument_list();
				}
			}

			setState(639);
			_la = _input.LA(1);
			if (_la==RETURNING) {
				{
				setState(637); 
				match(RETURNING);
				setState(638); 
				((Concrete_method_declarationContext)_localctx).typ = typedef(0);
				}
			}

			setState(641); 
			match(DOING);
			setState(642); 
			match(COLON);
			setState(643); 
			indent();
			setState(644); 
			((Concrete_method_declarationContext)_localctx).stmts = statement_list(0);
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

	public static class Native_method_declarationContext extends ParserRuleContext {
		public Method_identifierContext name;
		public Full_argument_listContext args;
		public Category_or_any_typeContext typ;
		public Native_statement_listContext stmts;
		public TerminalNode DEFINE() { return getToken(EParser.DEFINE, 0); }
		public TerminalNode AS() { return getToken(EParser.AS, 0); }
		public TerminalNode NATIVE() { return getToken(EParser.NATIVE, 0); }
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
		enterRule(_localctx, 36, RULE_native_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647); 
			match(DEFINE);
			setState(648); 
			((Native_method_declarationContext)_localctx).name = method_identifier();
			setState(649); 
			match(AS);
			setState(650); 
			match(NATIVE);
			setState(651); 
			match(METHOD);
			setState(654);
			_la = _input.LA(1);
			if (_la==RECEIVING) {
				{
				setState(652); 
				match(RECEIVING);
				setState(653); 
				((Native_method_declarationContext)_localctx).args = full_argument_list();
				}
			}

			setState(658);
			_la = _input.LA(1);
			if (_la==RETURNING) {
				{
				setState(656); 
				match(RETURNING);
				setState(657); 
				((Native_method_declarationContext)_localctx).typ = category_or_any_type();
				}
			}

			setState(660); 
			match(DOING);
			setState(661); 
			match(COLON);
			setState(662); 
			indent();
			setState(663); 
			((Native_method_declarationContext)_localctx).stmts = native_statement_list(0);
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
		public TerminalNode EXPECTING() { return getToken(EParser.EXPECTING, 0); }
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
		enterRule(_localctx, 38, RULE_test_method_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(666); 
			match(DEFINE);
			setState(667); 
			((Test_method_declarationContext)_localctx).name = match(TEXT_LITERAL);
			setState(668); 
			match(AS);
			setState(669); 
			match(TEST);
			setState(670); 
			match(METHOD);
			setState(671); 
			match(DOING);
			setState(672); 
			match(COLON);
			setState(673); 
			indent();
			setState(674); 
			((Test_method_declarationContext)_localctx).stmts = statement_list(0);
			setState(675); 
			dedent();
			setState(676); 
			lfp();
			setState(677); 
			match(AND);
			setState(678); 
			match(EXPECTING);
			setState(685);
			switch (_input.LA(1)) {
			case COLON:
				{
				{
				setState(679); 
				match(COLON);
				setState(680); 
				indent();
				setState(681); 
				((Test_method_declarationContext)_localctx).exps = assertion_list(0);
				setState(682); 
				dedent();
				}
				}
				break;
			case SYMBOL_IDENTIFIER:
				{
				setState(684); 
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
		enterRule(_localctx, 40, RULE_assertion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687); 
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
		enterRule(_localctx, 42, RULE_full_argument_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(689); 
			((Full_argument_listContext)_localctx).items = argument_list(0);
			setState(692);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(690); 
				match(AND);
				setState(691); 
				((Full_argument_listContext)_localctx).item = argument();
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
		enterRule(_localctx, 44, RULE_typed_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(694); 
			((Typed_argumentContext)_localctx).typ = category_or_any_type();
			setState(695); 
			((Typed_argumentContext)_localctx).name = variable_identifier();
			setState(697);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(696); 
				((Typed_argumentContext)_localctx).attrs = attribute_list();
				}
				break;
			}
			setState(701);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(699); 
				match(EQ);
				setState(700); 
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
		enterRule(_localctx, 46, RULE_statement);
		try {
			setState(718);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				_localctx = new AssignInstanceStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(703); 
				((AssignInstanceStatementContext)_localctx).stmt = assign_instance_statement();
				}
				break;
			case 2:
				_localctx = new MethodCallStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(704); 
				((MethodCallStatementContext)_localctx).stmt = method_call_statement();
				}
				break;
			case 3:
				_localctx = new AssignTupleStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(705); 
				((AssignTupleStatementContext)_localctx).stmt = assign_tuple_statement();
				}
				break;
			case 4:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(706); 
				((ReturnStatementContext)_localctx).stmt = return_statement();
				}
				break;
			case 5:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(707); 
				((IfStatementContext)_localctx).stmt = if_statement();
				}
				break;
			case 6:
				_localctx = new SwitchStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(708); 
				((SwitchStatementContext)_localctx).stmt = switch_statement();
				}
				break;
			case 7:
				_localctx = new ForEachStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(709); 
				((ForEachStatementContext)_localctx).stmt = for_each_statement();
				}
				break;
			case 8:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(710); 
				((WhileStatementContext)_localctx).stmt = while_statement();
				}
				break;
			case 9:
				_localctx = new DoWhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(711); 
				((DoWhileStatementContext)_localctx).stmt = do_while_statement();
				}
				break;
			case 10:
				_localctx = new RaiseStatementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(712); 
				((RaiseStatementContext)_localctx).stmt = raise_statement();
				}
				break;
			case 11:
				_localctx = new TryStatementContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(713); 
				((TryStatementContext)_localctx).stmt = try_statement();
				}
				break;
			case 12:
				_localctx = new WriteStatementContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(714); 
				((WriteStatementContext)_localctx).stmt = write_statement();
				}
				break;
			case 13:
				_localctx = new WithResourceStatementContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(715); 
				((WithResourceStatementContext)_localctx).stmt = with_resource_statement();
				}
				break;
			case 14:
				_localctx = new WithSingletonStatementContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(716); 
				((WithSingletonStatementContext)_localctx).stmt = with_singleton_statement();
				}
				break;
			case 15:
				_localctx = new ClosureStatementContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(717); 
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
		enterRule(_localctx, 48, RULE_method_call_statement);
		try {
			setState(725);
			switch (_input.LA(1)) {
			case SYMBOL_IDENTIFIER:
			case TYPE_IDENTIFIER:
			case VARIABLE_IDENTIFIER:
				_localctx = new UnresolvedWithArgsStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(720); 
				((UnresolvedWithArgsStatementContext)_localctx).exp = unresolved_expression(0);
				setState(722);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(721); 
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
				setState(724); 
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
		enterRule(_localctx, 50, RULE_with_resource_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(727); 
			match(WITH);
			setState(728); 
			((With_resource_statementContext)_localctx).stmt = assign_variable_statement();
			setState(729); 
			match(COMMA);
			setState(730); 
			match(DO);
			setState(731); 
			match(COLON);
			setState(732); 
			indent();
			setState(733); 
			((With_resource_statementContext)_localctx).stmts = statement_list(0);
			setState(734); 
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
		enterRule(_localctx, 52, RULE_with_singleton_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(736); 
			match(WITH);
			setState(737); 
			((With_singleton_statementContext)_localctx).typ = type_identifier();
			setState(738); 
			match(COMMA);
			setState(739); 
			match(DO);
			setState(740); 
			match(COLON);
			setState(741); 
			indent();
			setState(742); 
			((With_singleton_statementContext)_localctx).stmts = statement_list(0);
			setState(743); 
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
		enterRule(_localctx, 54, RULE_switch_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(745); 
			match(SWITCH);
			setState(746); 
			match(ON);
			setState(747); 
			((Switch_statementContext)_localctx).exp = expression(0);
			setState(748); 
			match(COLON);
			setState(749); 
			indent();
			setState(750); 
			((Switch_statementContext)_localctx).cases = switch_case_statement_list(0);
			setState(758);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(751); 
				lfp();
				setState(752); 
				match(OTHERWISE);
				setState(753); 
				match(COLON);
				setState(754); 
				indent();
				setState(755); 
				((Switch_statementContext)_localctx).stmts = statement_list(0);
				setState(756); 
				dedent();
				}
				break;
			}
			setState(760); 
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
		enterRule(_localctx, 56, RULE_switch_case_statement);
		try {
			setState(777);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				_localctx = new AtomicSwitchCaseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(762); 
				match(WHEN);
				setState(763); 
				((AtomicSwitchCaseContext)_localctx).exp = atomic_literal();
				setState(764); 
				match(COLON);
				setState(765); 
				indent();
				setState(766); 
				((AtomicSwitchCaseContext)_localctx).stmts = statement_list(0);
				setState(767); 
				dedent();
				}
				break;
			case 2:
				_localctx = new CollectionSwitchCaseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(769); 
				match(WHEN);
				setState(770); 
				match(IN);
				setState(771); 
				((CollectionSwitchCaseContext)_localctx).exp = literal_collection();
				setState(772); 
				match(COLON);
				setState(773); 
				indent();
				setState(774); 
				((CollectionSwitchCaseContext)_localctx).stmts = statement_list(0);
				setState(775); 
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
		enterRule(_localctx, 58, RULE_for_each_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(779); 
			match(FOR);
			setState(780); 
			match(EACH);
			setState(781); 
			((For_each_statementContext)_localctx).name1 = variable_identifier();
			setState(784);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(782); 
				match(COMMA);
				setState(783); 
				((For_each_statementContext)_localctx).name2 = variable_identifier();
				}
			}

			setState(786); 
			match(IN);
			setState(787); 
			((For_each_statementContext)_localctx).source = expression(0);
			setState(788); 
			match(COLON);
			setState(789); 
			indent();
			setState(790); 
			((For_each_statementContext)_localctx).stmts = statement_list(0);
			setState(791); 
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
		enterRule(_localctx, 60, RULE_do_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793); 
			match(DO);
			setState(794); 
			match(COLON);
			setState(795); 
			indent();
			setState(796); 
			((Do_while_statementContext)_localctx).stmts = statement_list(0);
			setState(797); 
			dedent();
			setState(798); 
			lfp();
			setState(799); 
			match(WHILE);
			setState(800); 
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
		enterRule(_localctx, 62, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(802); 
			match(WHILE);
			setState(803); 
			((While_statementContext)_localctx).exp = expression(0);
			setState(804); 
			match(COLON);
			setState(805); 
			indent();
			setState(806); 
			((While_statementContext)_localctx).stmts = statement_list(0);
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
		enterRule(_localctx, 64, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(809); 
			match(IF);
			setState(810); 
			((If_statementContext)_localctx).exp = expression(0);
			setState(811); 
			match(COLON);
			setState(812); 
			indent();
			setState(813); 
			((If_statementContext)_localctx).stmts = statement_list(0);
			setState(814); 
			dedent();
			setState(818);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(815); 
				lfp();
				setState(816); 
				((If_statementContext)_localctx).elseIfs = else_if_statement_list(0);
				}
				break;
			}
			setState(827);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(820); 
				lfp();
				setState(821); 
				match(ELSE);
				setState(822); 
				match(COLON);
				setState(823); 
				indent();
				setState(824); 
				((If_statementContext)_localctx).elseStmts = statement_list(0);
				setState(825); 
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

			setState(830); 
			match(ELSE);
			setState(831); 
			match(IF);
			setState(832); 
			((ElseIfStatementListContext)_localctx).exp = expression(0);
			setState(833); 
			match(COLON);
			setState(834); 
			indent();
			setState(835); 
			((ElseIfStatementListContext)_localctx).stmts = statement_list(0);
			setState(836); 
			dedent();
			}
			_ctx.stop = _input.LT(-1);
			setState(850);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ElseIfStatementListItemContext(new Else_if_statement_listContext(_parentctx, _parentState));
					((ElseIfStatementListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_else_if_statement_list);
					setState(838);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(839); 
					lfp();
					setState(840); 
					match(ELSE);
					setState(841); 
					match(IF);
					setState(842); 
					((ElseIfStatementListItemContext)_localctx).exp = expression(0);
					setState(843); 
					match(COLON);
					setState(844); 
					indent();
					setState(845); 
					((ElseIfStatementListItemContext)_localctx).stmts = statement_list(0);
					setState(846); 
					dedent();
					}
					} 
				}
				setState(852);
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
		enterRule(_localctx, 68, RULE_raise_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(853); 
			match(RAISE);
			setState(854); 
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
		enterRule(_localctx, 70, RULE_try_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(856); 
			match(SWITCH);
			setState(857); 
			match(ON);
			setState(858); 
			((Try_statementContext)_localctx).name = variable_identifier();
			setState(859); 
			match(DOING);
			setState(860); 
			match(COLON);
			setState(861); 
			indent();
			setState(862); 
			((Try_statementContext)_localctx).stmts = statement_list(0);
			setState(863); 
			dedent();
			setState(864); 
			lfs();
			setState(866);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(865); 
				((Try_statementContext)_localctx).handlers = catch_statement_list(0);
				}
				break;
			}
			setState(879);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(871);
				switch (_input.LA(1)) {
				case OTHERWISE:
					{
					setState(868); 
					match(OTHERWISE);
					}
					break;
				case WHEN:
					{
					{
					setState(869); 
					match(WHEN);
					setState(870); 
					match(ANY);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(873); 
				match(COLON);
				setState(874); 
				indent();
				setState(875); 
				((Try_statementContext)_localctx).anyStmts = statement_list(0);
				setState(876); 
				dedent();
				setState(877); 
				lfs();
				}
				break;
			}
			setState(888);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(881); 
				match(ALWAYS);
				setState(882); 
				match(COLON);
				setState(883); 
				indent();
				setState(884); 
				((Try_statementContext)_localctx).finalStmts = statement_list(0);
				setState(885); 
				dedent();
				setState(886); 
				lfs();
				}
				break;
			}
			setState(890); 
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
		enterRule(_localctx, 72, RULE_catch_statement);
		try {
			setState(911);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				_localctx = new CatchAtomicStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(892); 
				match(WHEN);
				setState(893); 
				((CatchAtomicStatementContext)_localctx).name = symbol_identifier();
				setState(894); 
				match(COLON);
				setState(895); 
				indent();
				setState(896); 
				((CatchAtomicStatementContext)_localctx).stmts = statement_list(0);
				setState(897); 
				dedent();
				setState(898); 
				lfs();
				}
				break;
			case 2:
				_localctx = new CatchCollectionStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(900); 
				match(WHEN);
				setState(901); 
				match(IN);
				setState(902); 
				match(LBRAK);
				setState(903); 
				((CatchCollectionStatementContext)_localctx).exp = symbol_list(0);
				setState(904); 
				match(RBRAK);
				setState(905); 
				match(COLON);
				setState(906); 
				indent();
				setState(907); 
				((CatchCollectionStatementContext)_localctx).stmts = statement_list(0);
				setState(908); 
				dedent();
				setState(909); 
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
		enterRule(_localctx, 74, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(913); 
			match(RETURN);
			setState(915);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(914); 
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
	public static class ReadExpressionContext extends ExpressionContext {
		public Read_expressionContext exp;
		public Read_expressionContext read_expression() {
			return getRuleContext(Read_expressionContext.class,0);
		}
		public ReadExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterReadExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitReadExpression(this);
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
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(943);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				_localctx = new MinusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(918); 
				match(MINUS);
				setState(919); 
				((MinusExpressionContext)_localctx).exp = expression(38);
				}
				break;
			case 2:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(920); 
				match(NOT);
				setState(921); 
				((NotExpressionContext)_localctx).exp = expression(37);
				}
				break;
			case 3:
				{
				_localctx = new CodeExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(922); 
				match(CODE);
				setState(923); 
				match(COLON);
				setState(924); 
				((CodeExpressionContext)_localctx).exp = expression(10);
				}
				break;
			case 4:
				{
				_localctx = new InstanceExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(925); 
				((InstanceExpressionContext)_localctx).exp = instance_expression(0);
				}
				break;
			case 5:
				{
				_localctx = new UnresolvedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(926); 
				((UnresolvedExpressionContext)_localctx).exp = unresolved_expression(0);
				}
				break;
			case 6:
				{
				_localctx = new MethodCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(927); 
				((MethodCallExpressionContext)_localctx).exp = unresolved_expression(0);
				setState(928); 
				((MethodCallExpressionContext)_localctx).args = argument_assignment_list();
				}
				break;
			case 7:
				{
				_localctx = new ExecuteExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(930); 
				match(EXECUTE);
				setState(931); 
				match(COLON);
				setState(932); 
				((ExecuteExpressionContext)_localctx).name = variable_identifier();
				}
				break;
			case 8:
				{
				_localctx = new ClosureExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(933); 
				match(METHOD_T);
				setState(934); 
				match(COLON);
				setState(935); 
				((ClosureExpressionContext)_localctx).name = method_identifier();
				}
				break;
			case 9:
				{
				_localctx = new DocumentExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(936); 
				((DocumentExpressionContext)_localctx).exp = document_expression();
				}
				break;
			case 10:
				{
				_localctx = new ConstructorExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(937); 
				((ConstructorExpressionContext)_localctx).exp = constructor_expression();
				}
				break;
			case 11:
				{
				_localctx = new FetchExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(938); 
				((FetchExpressionContext)_localctx).exp = fetch_expression();
				}
				break;
			case 12:
				{
				_localctx = new ReadExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(939); 
				((ReadExpressionContext)_localctx).exp = read_expression();
				}
				break;
			case 13:
				{
				_localctx = new SortedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(940); 
				((SortedExpressionContext)_localctx).exp = sorted_expression();
				}
				break;
			case 14:
				{
				_localctx = new AmbiguousExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(941); 
				((AmbiguousExpressionContext)_localctx).exp = ambiguous_expression();
				}
				break;
			case 15:
				{
				_localctx = new InvocationExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(942); 
				((InvocationExpressionContext)_localctx).exp = invocation_expression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1041);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1039);
					switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplyExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((MultiplyExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(945);
						if (!(precpred(_ctx, 36))) throw new FailedPredicateException(this, "precpred(_ctx, 36)");
						setState(946); 
						multiply();
						setState(947); 
						((MultiplyExpressionContext)_localctx).right = expression(37);
						}
						break;
					case 2:
						{
						_localctx = new DivideExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((DivideExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(949);
						if (!(precpred(_ctx, 35))) throw new FailedPredicateException(this, "precpred(_ctx, 35)");
						setState(950); 
						divide();
						setState(951); 
						((DivideExpressionContext)_localctx).right = expression(36);
						}
						break;
					case 3:
						{
						_localctx = new ModuloExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ModuloExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(953);
						if (!(precpred(_ctx, 34))) throw new FailedPredicateException(this, "precpred(_ctx, 34)");
						setState(954); 
						modulo();
						setState(955); 
						((ModuloExpressionContext)_localctx).right = expression(35);
						}
						break;
					case 4:
						{
						_localctx = new IntDivideExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((IntDivideExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(957);
						if (!(precpred(_ctx, 33))) throw new FailedPredicateException(this, "precpred(_ctx, 33)");
						setState(958); 
						idivide();
						setState(959); 
						((IntDivideExpressionContext)_localctx).right = expression(34);
						}
						break;
					case 5:
						{
						_localctx = new AddExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((AddExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(961);
						if (!(precpred(_ctx, 32))) throw new FailedPredicateException(this, "precpred(_ctx, 32)");
						setState(962);
						((AddExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((AddExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(963); 
						((AddExpressionContext)_localctx).right = expression(33);
						}
						break;
					case 6:
						{
						_localctx = new LessThanExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((LessThanExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(964);
						if (!(precpred(_ctx, 31))) throw new FailedPredicateException(this, "precpred(_ctx, 31)");
						setState(965); 
						match(LT);
						setState(966); 
						((LessThanExpressionContext)_localctx).right = expression(32);
						}
						break;
					case 7:
						{
						_localctx = new LessThanOrEqualExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((LessThanOrEqualExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(967);
						if (!(precpred(_ctx, 30))) throw new FailedPredicateException(this, "precpred(_ctx, 30)");
						setState(968); 
						match(LTE);
						setState(969); 
						((LessThanOrEqualExpressionContext)_localctx).right = expression(31);
						}
						break;
					case 8:
						{
						_localctx = new GreaterThanExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((GreaterThanExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(970);
						if (!(precpred(_ctx, 29))) throw new FailedPredicateException(this, "precpred(_ctx, 29)");
						setState(971); 
						match(GT);
						setState(972); 
						((GreaterThanExpressionContext)_localctx).right = expression(30);
						}
						break;
					case 9:
						{
						_localctx = new GreaterThanOrEqualExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((GreaterThanOrEqualExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(973);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(974); 
						match(GTE);
						setState(975); 
						((GreaterThanOrEqualExpressionContext)_localctx).right = expression(29);
						}
						break;
					case 10:
						{
						_localctx = new EqualsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((EqualsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(976);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(977); 
						match(EQ);
						setState(978); 
						((EqualsExpressionContext)_localctx).right = expression(26);
						}
						break;
					case 11:
						{
						_localctx = new NotEqualsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((NotEqualsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(979);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(980); 
						match(LTGT);
						setState(981); 
						((NotEqualsExpressionContext)_localctx).right = expression(25);
						}
						break;
					case 12:
						{
						_localctx = new RoughlyEqualsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((RoughlyEqualsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(982);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(983); 
						match(TILDE);
						setState(984); 
						((RoughlyEqualsExpressionContext)_localctx).right = expression(24);
						}
						break;
					case 13:
						{
						_localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((OrExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(985);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(986); 
						match(OR);
						setState(987); 
						((OrExpressionContext)_localctx).right = expression(23);
						}
						break;
					case 14:
						{
						_localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((AndExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(988);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(989); 
						match(AND);
						setState(990); 
						((AndExpressionContext)_localctx).right = expression(22);
						}
						break;
					case 15:
						{
						_localctx = new TernaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((TernaryExpressionContext)_localctx).ifTrue = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(991);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(992); 
						match(IF);
						setState(993); 
						((TernaryExpressionContext)_localctx).test = expression(0);
						setState(994); 
						match(ELSE);
						setState(995); 
						((TernaryExpressionContext)_localctx).ifFalse = expression(21);
						}
						break;
					case 16:
						{
						_localctx = new InExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((InExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(997);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(998); 
						match(IN);
						setState(999); 
						((InExpressionContext)_localctx).right = expression(19);
						}
						break;
					case 17:
						{
						_localctx = new ContainsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ContainsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1000);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1001); 
						match(CONTAINS);
						setState(1002); 
						((ContainsExpressionContext)_localctx).right = expression(18);
						}
						break;
					case 18:
						{
						_localctx = new ContainsAllExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ContainsAllExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1003);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1004); 
						match(CONTAINS);
						setState(1005); 
						match(ALL);
						setState(1006); 
						((ContainsAllExpressionContext)_localctx).right = expression(17);
						}
						break;
					case 19:
						{
						_localctx = new ContainsAnyExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ContainsAnyExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1007);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1008); 
						match(CONTAINS);
						setState(1009); 
						match(ANY);
						setState(1010); 
						((ContainsAnyExpressionContext)_localctx).right = expression(16);
						}
						break;
					case 20:
						{
						_localctx = new NotInExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((NotInExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1011);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1012); 
						match(NOT);
						setState(1013); 
						match(IN);
						setState(1014); 
						((NotInExpressionContext)_localctx).right = expression(15);
						}
						break;
					case 21:
						{
						_localctx = new NotContainsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((NotContainsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1015);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1016); 
						match(NOT);
						setState(1017); 
						match(CONTAINS);
						setState(1018); 
						((NotContainsExpressionContext)_localctx).right = expression(14);
						}
						break;
					case 22:
						{
						_localctx = new NotContainsAllExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((NotContainsAllExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1019);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1020); 
						match(NOT);
						setState(1021); 
						match(CONTAINS);
						setState(1022); 
						match(ALL);
						setState(1023); 
						((NotContainsAllExpressionContext)_localctx).right = expression(13);
						}
						break;
					case 23:
						{
						_localctx = new NotContainsAnyExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((NotContainsAnyExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1024);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1025); 
						match(NOT);
						setState(1026); 
						match(CONTAINS);
						setState(1027); 
						match(ANY);
						setState(1028); 
						((NotContainsAnyExpressionContext)_localctx).right = expression(12);
						}
						break;
					case 24:
						{
						_localctx = new IsNotExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((IsNotExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1029);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(1030); 
						match(IS);
						setState(1031); 
						match(NOT);
						setState(1032); 
						((IsNotExpressionContext)_localctx).right = is_expression();
						}
						break;
					case 25:
						{
						_localctx = new IsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((IsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1033);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(1034); 
						match(IS);
						setState(1035); 
						((IsExpressionContext)_localctx).right = is_expression();
						}
						break;
					case 26:
						{
						_localctx = new CastExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((CastExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1036);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1037); 
						match(AS);
						setState(1038); 
						((CastExpressionContext)_localctx).right = category_or_any_type();
						}
						break;
					}
					} 
				}
				setState(1043);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_unresolved_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new UnresolvedIdentifierContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1045); 
			((UnresolvedIdentifierContext)_localctx).name = identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(1051);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new UnresolvedSelectorContext(new Unresolved_expressionContext(_parentctx, _parentState));
					((UnresolvedSelectorContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_unresolved_expression);
					setState(1047);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1048); 
					((UnresolvedSelectorContext)_localctx).selector = unresolved_selector();
					}
					} 
				}
				setState(1053);
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
		enterRule(_localctx, 80, RULE_unresolved_selector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1054);
			if (!(this.wasNot(EParser.WS))) throw new FailedPredicateException(this, "$parser.wasNot(EParser.WS)");
			setState(1055); 
			match(DOT);
			setState(1056); 
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
		enterRule(_localctx, 82, RULE_invocation_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1058); 
			match(INVOKE);
			setState(1059); 
			match(COLON);
			setState(1060); 
			((Invocation_expressionContext)_localctx).name = variable_identifier();
			setState(1061); 
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
		enterRule(_localctx, 84, RULE_invocation_trailer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1063);
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
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_instance_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SelectableExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1066); 
			((SelectableExpressionContext)_localctx).parent = selectable_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(1072);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SelectorExpressionContext(new Instance_expressionContext(_parentctx, _parentState));
					((SelectorExpressionContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_instance_expression);
					setState(1068);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1069); 
					((SelectorExpressionContext)_localctx).selector = instance_selector();
					}
					} 
				}
				setState(1074);
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
		enterRule(_localctx, 88, RULE_instance_selector);
		try {
			setState(1088);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				_localctx = new MemberSelectorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1075);
				if (!(this.wasNot(EParser.WS))) throw new FailedPredicateException(this, "$parser.wasNot(EParser.WS)");
				setState(1076); 
				match(DOT);
				setState(1077); 
				((MemberSelectorContext)_localctx).name = variable_identifier();
				}
				break;
			case 2:
				_localctx = new SliceSelectorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1078);
				if (!(this.wasNot(EParser.WS))) throw new FailedPredicateException(this, "$parser.wasNot(EParser.WS)");
				setState(1079); 
				match(LBRAK);
				setState(1080); 
				((SliceSelectorContext)_localctx).xslice = slice_arguments();
				setState(1081); 
				match(RBRAK);
				}
				break;
			case 3:
				_localctx = new ItemSelectorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1083);
				if (!(this.wasNot(EParser.WS))) throw new FailedPredicateException(this, "$parser.wasNot(EParser.WS)");
				setState(1084); 
				match(LBRAK);
				setState(1085); 
				((ItemSelectorContext)_localctx).exp = expression(0);
				setState(1086); 
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
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterDocument_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitDocument_expression(this);
		}
	}

	public final Document_expressionContext document_expression() throws RecognitionException {
		Document_expressionContext _localctx = new Document_expressionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_document_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1090); 
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
		public Category_typeContext typ;
		public ExpressionContext firstArg;
		public With_argument_assignment_listContext args;
		public Argument_assignmentContext arg;
		public TerminalNode FROM() { return getToken(EParser.FROM, 0); }
		public Category_typeContext category_type() {
			return getRuleContext(Category_typeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode MUTABLE() { return getToken(EParser.MUTABLE, 0); }
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
		public Category_typeContext typ;
		public With_argument_assignment_listContext args;
		public Argument_assignmentContext arg;
		public Category_typeContext category_type() {
			return getRuleContext(Category_typeContext.class,0);
		}
		public TerminalNode MUTABLE() { return getToken(EParser.MUTABLE, 0); }
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
		enterRule(_localctx, 92, RULE_constructor_expression);
		int _la;
		try {
			setState(1119);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				_localctx = new ConstructorFromContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1093);
				_la = _input.LA(1);
				if (_la==MUTABLE) {
					{
					setState(1092); 
					match(MUTABLE);
					}
				}

				setState(1095); 
				((ConstructorFromContext)_localctx).typ = category_type();
				setState(1096); 
				match(FROM);
				setState(1097); 
				((ConstructorFromContext)_localctx).firstArg = expression(0);
				setState(1106);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(1099);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(1098); 
						match(COMMA);
						}
					}

					setState(1101); 
					((ConstructorFromContext)_localctx).args = with_argument_assignment_list(0);
					setState(1104);
					switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
					case 1:
						{
						setState(1102); 
						match(AND);
						setState(1103); 
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
				setState(1109);
				_la = _input.LA(1);
				if (_la==MUTABLE) {
					{
					setState(1108); 
					match(MUTABLE);
					}
				}

				setState(1111); 
				((ConstructorNoFromContext)_localctx).typ = category_type();
				setState(1117);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(1112); 
					((ConstructorNoFromContext)_localctx).args = with_argument_assignment_list(0);
					setState(1115);
					switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
					case 1:
						{
						setState(1113); 
						match(AND);
						setState(1114); 
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

	public static class Read_expressionContext extends ParserRuleContext {
		public ExpressionContext source;
		public TerminalNode READ() { return getToken(EParser.READ, 0); }
		public TerminalNode FROM() { return getToken(EParser.FROM, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Read_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterRead_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitRead_expression(this);
		}
	}

	public final Read_expressionContext read_expression() throws RecognitionException {
		Read_expressionContext _localctx = new Read_expressionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_read_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1121); 
			match(READ);
			setState(1122); 
			match(FROM);
			setState(1123); 
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
		enterRule(_localctx, 96, RULE_write_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1125); 
			match(WRITE);
			setState(1126); 
			((Write_statementContext)_localctx).what = expression(0);
			setState(1127); 
			match(TO);
			setState(1128); 
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
		enterRule(_localctx, 98, RULE_ambiguous_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1130); 
			((Ambiguous_expressionContext)_localctx).method = unresolved_expression(0);
			setState(1131); 
			match(MINUS);
			setState(1132); 
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

	public static class Fetch_expressionContext extends ParserRuleContext {
		public Variable_identifierContext name;
		public ExpressionContext source;
		public ExpressionContext xfilter;
		public TerminalNode FETCH() { return getToken(EParser.FETCH, 0); }
		public TerminalNode ANY() { return getToken(EParser.ANY, 0); }
		public TerminalNode FROM() { return getToken(EParser.FROM, 0); }
		public TerminalNode WHERE() { return getToken(EParser.WHERE, 0); }
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
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterFetch_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitFetch_expression(this);
		}
	}

	public final Fetch_expressionContext fetch_expression() throws RecognitionException {
		Fetch_expressionContext _localctx = new Fetch_expressionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_fetch_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1134); 
			match(FETCH);
			setState(1135); 
			match(ANY);
			setState(1136); 
			((Fetch_expressionContext)_localctx).name = variable_identifier();
			setState(1137); 
			match(FROM);
			setState(1138); 
			((Fetch_expressionContext)_localctx).source = expression(0);
			setState(1139); 
			match(WHERE);
			setState(1140); 
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
		public TerminalNode SORTED() { return getToken(EParser.SORTED, 0); }
		public List<Instance_expressionContext> instance_expression() {
			return getRuleContexts(Instance_expressionContext.class);
		}
		public Instance_expressionContext instance_expression(int i) {
			return getRuleContext(Instance_expressionContext.class,i);
		}
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
		enterRule(_localctx, 102, RULE_sorted_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1142); 
			match(SORTED);
			setState(1143); 
			((Sorted_expressionContext)_localctx).source = instance_expression(0);
			setState(1149);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(1144); 
				match(WITH);
				setState(1145); 
				((Sorted_expressionContext)_localctx).key = instance_expression(0);
				setState(1146); 
				match(AS);
				setState(1147); 
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
		enterRule(_localctx, 104, RULE_argument_assignment_list);
		try {
			setState(1165);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				_localctx = new ArgumentAssignmentListExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1151);
				if (!(this.was(EParser.WS))) throw new FailedPredicateException(this, "$parser.was(EParser.WS)");
				setState(1152); 
				((ArgumentAssignmentListExpressionContext)_localctx).exp = expression(0);
				setState(1158);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(1153); 
					((ArgumentAssignmentListExpressionContext)_localctx).items = with_argument_assignment_list(0);
					setState(1156);
					switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
					case 1:
						{
						setState(1154); 
						match(AND);
						setState(1155); 
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
				setState(1160); 
				((ArgumentAssignmentListNoExpressionContext)_localctx).items = with_argument_assignment_list(0);
				setState(1163);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(1161); 
					match(AND);
					setState(1162); 
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
		int _startState = 106;
		enterRecursionRule(_localctx, 106, RULE_with_argument_assignment_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ArgumentAssignmentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1168); 
			match(WITH);
			setState(1169); 
			((ArgumentAssignmentListContext)_localctx).item = argument_assignment();
			}
			_ctx.stop = _input.LT(-1);
			setState(1176);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArgumentAssignmentListItemContext(new With_argument_assignment_listContext(_parentctx, _parentState));
					((ArgumentAssignmentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_with_argument_assignment_list);
					setState(1171);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1172); 
					match(COMMA);
					setState(1173); 
					((ArgumentAssignmentListItemContext)_localctx).item = argument_assignment();
					}
					} 
				}
				setState(1178);
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
		enterRule(_localctx, 108, RULE_argument_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1179); 
			((Argument_assignmentContext)_localctx).exp = expression(0);
			setState(1180); 
			match(AS);
			setState(1181); 
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
		enterRule(_localctx, 110, RULE_assign_instance_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1183); 
			((Assign_instance_statementContext)_localctx).inst = assignable_instance(0);
			setState(1184); 
			assign();
			setState(1185); 
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
		enterRule(_localctx, 112, RULE_child_instance);
		try {
			setState(1195);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				_localctx = new MemberInstanceContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1187);
				if (!(this.wasNot(EParser.WS))) throw new FailedPredicateException(this, "$parser.wasNot(EParser.WS)");
				setState(1188); 
				match(DOT);
				setState(1189); 
				((MemberInstanceContext)_localctx).name = variable_identifier();
				}
				break;
			case 2:
				_localctx = new ItemInstanceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1190);
				if (!(this.wasNot(EParser.WS))) throw new FailedPredicateException(this, "$parser.wasNot(EParser.WS)");
				setState(1191); 
				match(LBRAK);
				setState(1192); 
				((ItemInstanceContext)_localctx).exp = expression(0);
				setState(1193); 
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
		enterRule(_localctx, 114, RULE_assign_tuple_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1197); 
			((Assign_tuple_statementContext)_localctx).items = variable_identifier_list(0);
			setState(1198); 
			assign();
			setState(1199); 
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
		enterRule(_localctx, 116, RULE_lfs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1204);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1201); 
					match(LF);
					}
					} 
				}
				setState(1206);
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
		enterRule(_localctx, 118, RULE_lfp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1208); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1207); 
				match(LF);
				}
				}
				setState(1210); 
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
		enterRule(_localctx, 120, RULE_indent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1213); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1212); 
				match(LF);
				}
				}
				setState(1215); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LF );
			setState(1217); 
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
		enterRule(_localctx, 122, RULE_dedent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LF) {
				{
				{
				setState(1219); 
				match(LF);
				}
				}
				setState(1224);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1225); 
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
		enterRule(_localctx, 124, RULE_null_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1227); 
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
		public DeclarationsContext items;
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
		enterRule(_localctx, 126, RULE_declaration_list);
		int _la;
		try {
			_localctx = new FullDeclarationListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1230);
			_la = _input.LA(1);
			if (_la==DEFINE) {
				{
				setState(1229); 
				((FullDeclarationListContext)_localctx).items = declarations(0);
				}
			}

			setState(1232); 
			lfs();
			setState(1233); 
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
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterDeclarationListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitDeclarationListItem(this);
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
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitDeclarationList(this);
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
		int _startState = 128;
		enterRecursionRule(_localctx, 128, RULE_declarations, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new DeclarationListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1236); 
			((DeclarationListContext)_localctx).item = declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(1244);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DeclarationListItemContext(new DeclarationsContext(_parentctx, _parentState));
					((DeclarationListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_declarations);
					setState(1238);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1239); 
					lfp();
					setState(1240); 
					((DeclarationListItemContext)_localctx).item = declaration();
					}
					} 
				}
				setState(1246);
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
	public static class ResourceDeclarationContext extends DeclarationContext {
		public Resource_declarationContext decl;
		public Resource_declarationContext resource_declaration() {
			return getRuleContext(Resource_declarationContext.class,0);
		}
		public ResourceDeclarationContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterResourceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitResourceDeclaration(this);
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
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitMethodDeclaration(this);
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
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterCategoryDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitCategoryDeclaration(this);
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
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterAttributeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitAttributeDeclaration(this);
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
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitEnumDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_declaration);
		try {
			setState(1252);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				_localctx = new AttributeDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1247); 
				((AttributeDeclarationContext)_localctx).decl = attribute_declaration();
				}
				break;
			case 2:
				_localctx = new CategoryDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1248); 
				((CategoryDeclarationContext)_localctx).decl = category_declaration();
				}
				break;
			case 3:
				_localctx = new ResourceDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1249); 
				((ResourceDeclarationContext)_localctx).decl = resource_declaration();
				}
				break;
			case 4:
				_localctx = new EnumDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1250); 
				((EnumDeclarationContext)_localctx).decl = enum_declaration();
				}
				break;
			case 5:
				_localctx = new MethodDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1251); 
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
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterResource_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitResource_declaration(this);
		}
	}

	public final Resource_declarationContext resource_declaration() throws RecognitionException {
		Resource_declarationContext _localctx = new Resource_declarationContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_resource_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1254); 
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
	public static class EnumCategoryDeclarationContext extends Enum_declarationContext {
		public Enum_category_declarationContext decl;
		public Enum_category_declarationContext enum_category_declaration() {
			return getRuleContext(Enum_category_declarationContext.class,0);
		}
		public EnumCategoryDeclarationContext(Enum_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterEnumCategoryDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitEnumCategoryDeclaration(this);
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
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterEnumNativeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitEnumNativeDeclaration(this);
		}
	}

	public final Enum_declarationContext enum_declaration() throws RecognitionException {
		Enum_declarationContext _localctx = new Enum_declarationContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_enum_declaration);
		try {
			setState(1258);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				_localctx = new EnumCategoryDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1256); 
				((EnumCategoryDeclarationContext)_localctx).decl = enum_category_declaration();
				}
				break;
			case 2:
				_localctx = new EnumNativeDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1257); 
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
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterNativeSymbolList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitNativeSymbolList(this);
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
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterNativeSymbolListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitNativeSymbolListItem(this);
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
		int _startState = 136;
		enterRecursionRule(_localctx, 136, RULE_native_symbol_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new NativeSymbolListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1261); 
			((NativeSymbolListContext)_localctx).item = native_symbol();
			}
			_ctx.stop = _input.LT(-1);
			setState(1269);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NativeSymbolListItemContext(new Native_symbol_listContext(_parentctx, _parentState));
					((NativeSymbolListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_native_symbol_list);
					setState(1263);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1264); 
					lfp();
					setState(1265); 
					((NativeSymbolListItemContext)_localctx).item = native_symbol();
					}
					} 
				}
				setState(1271);
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
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterCategorySymbolListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitCategorySymbolListItem(this);
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
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterCategorySymbolList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitCategorySymbolList(this);
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
		int _startState = 138;
		enterRecursionRule(_localctx, 138, RULE_category_symbol_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new CategorySymbolListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1273); 
			((CategorySymbolListContext)_localctx).item = category_symbol();
			}
			_ctx.stop = _input.LT(-1);
			setState(1281);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CategorySymbolListItemContext(new Category_symbol_listContext(_parentctx, _parentState));
					((CategorySymbolListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_category_symbol_list);
					setState(1275);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1276); 
					lfp();
					setState(1277); 
					((CategorySymbolListItemContext)_localctx).item = category_symbol();
					}
					} 
				}
				setState(1283);
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
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterSymbolList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitSymbolList(this);
		}
	}
	public static class SymbolListItemContext extends Symbol_listContext {
		public Symbol_listContext items;
		public Symbol_identifierContext item;
		public TerminalNode COMMA() { return getToken(EParser.COMMA, 0); }
		public Symbol_listContext symbol_list() {
			return getRuleContext(Symbol_listContext.class,0);
		}
		public Symbol_identifierContext symbol_identifier() {
			return getRuleContext(Symbol_identifierContext.class,0);
		}
		public SymbolListItemContext(Symbol_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterSymbolListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitSymbolListItem(this);
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
		int _startState = 140;
		enterRecursionRule(_localctx, 140, RULE_symbol_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SymbolListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1285); 
			((SymbolListContext)_localctx).item = symbol_identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(1292);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SymbolListItemContext(new Symbol_listContext(_parentctx, _parentState));
					((SymbolListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_symbol_list);
					setState(1287);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1288); 
					match(COMMA);
					setState(1289); 
					((SymbolListItemContext)_localctx).item = symbol_identifier();
					}
					} 
				}
				setState(1294);
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
		enterRule(_localctx, 142, RULE_attribute_constraint);
		try {
			setState(1305);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				_localctx = new MatchingListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1295); 
				match(IN);
				setState(1296); 
				((MatchingListContext)_localctx).source = list_literal();
				}
				break;
			case 2:
				_localctx = new MatchingSetContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1297); 
				match(IN);
				setState(1298); 
				((MatchingSetContext)_localctx).source = set_literal();
				}
				break;
			case 3:
				_localctx = new MatchingRangeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1299); 
				match(IN);
				setState(1300); 
				((MatchingRangeContext)_localctx).source = range_literal();
				}
				break;
			case 4:
				_localctx = new MatchingPatternContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1301); 
				match(MATCHING);
				setState(1302); 
				((MatchingPatternContext)_localctx).text = match(TEXT_LITERAL);
				}
				break;
			case 5:
				_localctx = new MatchingExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1303); 
				match(MATCHING);
				setState(1304); 
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
		public TerminalNode LBRAK() { return getToken(EParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(EParser.RBRAK, 0); }
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
		enterRule(_localctx, 144, RULE_list_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1307); 
			match(LBRAK);
			setState(1309);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << METHOD_T) | (1L << CODE) | (1L << DOCUMENT))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (EXECUTE - 87)) | (1L << (FETCH - 87)) | (1L << (INVOKE - 87)) | (1L << (MUTABLE - 87)) | (1L << (NOT - 87)) | (1L << (NOTHING - 87)) | (1L << (READ - 87)) | (1L << (SELF - 87)) | (1L << (SORTED - 87)) | (1L << (THIS - 87)) | (1L << (BOOLEAN_LITERAL - 87)) | (1L << (CHAR_LITERAL - 87)) | (1L << (MIN_INTEGER - 87)) | (1L << (MAX_INTEGER - 87)) | (1L << (SYMBOL_IDENTIFIER - 87)) | (1L << (TYPE_IDENTIFIER - 87)) | (1L << (VARIABLE_IDENTIFIER - 87)) | (1L << (TEXT_LITERAL - 87)) | (1L << (INTEGER_LITERAL - 87)) | (1L << (HEXA_LITERAL - 87)) | (1L << (DECIMAL_LITERAL - 87)) | (1L << (DATETIME_LITERAL - 87)) | (1L << (TIME_LITERAL - 87)))) != 0) || _la==DATE_LITERAL || _la==PERIOD_LITERAL) {
				{
				setState(1308); 
				((List_literalContext)_localctx).items = expression_list(0);
				}
			}

			setState(1311); 
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
		public TerminalNode LT() { return getToken(EParser.LT, 0); }
		public TerminalNode GT() { return getToken(EParser.GT, 0); }
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
		enterRule(_localctx, 146, RULE_set_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1313); 
			match(LT);
			setState(1315);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << METHOD_T) | (1L << CODE) | (1L << DOCUMENT))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (EXECUTE - 87)) | (1L << (FETCH - 87)) | (1L << (INVOKE - 87)) | (1L << (MUTABLE - 87)) | (1L << (NOT - 87)) | (1L << (NOTHING - 87)) | (1L << (READ - 87)) | (1L << (SELF - 87)) | (1L << (SORTED - 87)) | (1L << (THIS - 87)) | (1L << (BOOLEAN_LITERAL - 87)) | (1L << (CHAR_LITERAL - 87)) | (1L << (MIN_INTEGER - 87)) | (1L << (MAX_INTEGER - 87)) | (1L << (SYMBOL_IDENTIFIER - 87)) | (1L << (TYPE_IDENTIFIER - 87)) | (1L << (VARIABLE_IDENTIFIER - 87)) | (1L << (TEXT_LITERAL - 87)) | (1L << (INTEGER_LITERAL - 87)) | (1L << (HEXA_LITERAL - 87)) | (1L << (DECIMAL_LITERAL - 87)) | (1L << (DATETIME_LITERAL - 87)) | (1L << (TIME_LITERAL - 87)))) != 0) || _la==DATE_LITERAL || _la==PERIOD_LITERAL) {
				{
				setState(1314); 
				((Set_literalContext)_localctx).items = expression_list(0);
				}
			}

			setState(1317); 
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
	public static class ValueListContext extends Expression_listContext {
		public ExpressionContext item;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ValueListContext(Expression_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitValueList(this);
		}
	}
	public static class ValueListItemContext extends Expression_listContext {
		public Expression_listContext items;
		public ExpressionContext item;
		public TerminalNode COMMA() { return getToken(EParser.COMMA, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ValueListItemContext(Expression_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterValueListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitValueListItem(this);
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
		int _startState = 148;
		enterRecursionRule(_localctx, 148, RULE_expression_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ValueListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1320); 
			((ValueListContext)_localctx).item = expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1327);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ValueListItemContext(new Expression_listContext(_parentctx, _parentState));
					((ValueListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_expression_list);
					setState(1322);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1323); 
					match(COMMA);
					setState(1324); 
					((ValueListItemContext)_localctx).item = expression(0);
					}
					} 
				}
				setState(1329);
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
		enterRule(_localctx, 150, RULE_range_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1330); 
			match(LBRAK);
			setState(1331); 
			((Range_literalContext)_localctx).low = expression(0);
			setState(1332); 
			match(RANGE);
			setState(1333); 
			((Range_literalContext)_localctx).high = expression(0);
			setState(1334); 
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
		int _startState = 152;
		enterRecursionRule(_localctx, 152, RULE_typedef, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PrimaryTypeContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1337); 
			((PrimaryTypeContext)_localctx).p = primary_type();
			}
			_ctx.stop = _input.LT(-1);
			setState(1349);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1347);
					switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
					case 1:
						{
						_localctx = new SetTypeContext(new TypedefContext(_parentctx, _parentState));
						((SetTypeContext)_localctx).s = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_typedef);
						setState(1339);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1340); 
						match(LTGT);
						}
						break;
					case 2:
						{
						_localctx = new ListTypeContext(new TypedefContext(_parentctx, _parentState));
						((ListTypeContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_typedef);
						setState(1341);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1342); 
						match(LBRAK);
						setState(1343); 
						match(RBRAK);
						}
						break;
					case 3:
						{
						_localctx = new DictTypeContext(new TypedefContext(_parentctx, _parentState));
						((DictTypeContext)_localctx).d = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_typedef);
						setState(1344);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1345); 
						match(LCURL);
						setState(1346); 
						match(RCURL);
						}
						break;
					}
					} 
				}
				setState(1351);
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
		enterRule(_localctx, 154, RULE_primary_type);
		try {
			setState(1354);
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
				setState(1352); 
				((NativeTypeContext)_localctx).n = native_type();
				}
				break;
			case TYPE_IDENTIFIER:
				_localctx = new CategoryTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1353); 
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
	public static class IntegerTypeContext extends Native_typeContext {
		public Token t1;
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
	public static class PeriodTypeContext extends Native_typeContext {
		public Token t1;
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
	public static class DateTimeTypeContext extends Native_typeContext {
		public Token t1;
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
	public static class BooleanTypeContext extends Native_typeContext {
		public Token t1;
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
	public static class DecimalTypeContext extends Native_typeContext {
		public Token t1;
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
		public Token t1;
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
	public static class CharacterTypeContext extends Native_typeContext {
		public Token t1;
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
	public static class DateTypeContext extends Native_typeContext {
		public Token t1;
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
	public static class TextTypeContext extends Native_typeContext {
		public Token t1;
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
	public static class TimeTypeContext extends Native_typeContext {
		public Token t1;
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

	public final Native_typeContext native_type() throws RecognitionException {
		Native_typeContext _localctx = new Native_typeContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_native_type);
		try {
			setState(1366);
			switch (_input.LA(1)) {
			case BOOLEAN:
				_localctx = new BooleanTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1356); 
				((BooleanTypeContext)_localctx).t1 = match(BOOLEAN);
				}
				break;
			case CHARACTER:
				_localctx = new CharacterTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1357); 
				((CharacterTypeContext)_localctx).t1 = match(CHARACTER);
				}
				break;
			case TEXT:
				_localctx = new TextTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1358); 
				((TextTypeContext)_localctx).t1 = match(TEXT);
				}
				break;
			case INTEGER:
				_localctx = new IntegerTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1359); 
				((IntegerTypeContext)_localctx).t1 = match(INTEGER);
				}
				break;
			case DECIMAL:
				_localctx = new DecimalTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1360); 
				((DecimalTypeContext)_localctx).t1 = match(DECIMAL);
				}
				break;
			case DATE:
				_localctx = new DateTypeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1361); 
				((DateTypeContext)_localctx).t1 = match(DATE);
				}
				break;
			case DATETIME:
				_localctx = new DateTimeTypeContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1362); 
				((DateTimeTypeContext)_localctx).t1 = match(DATETIME);
				}
				break;
			case TIME:
				_localctx = new TimeTypeContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1363); 
				((TimeTypeContext)_localctx).t1 = match(TIME);
				}
				break;
			case PERIOD:
				_localctx = new PeriodTypeContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1364); 
				((PeriodTypeContext)_localctx).t1 = match(PERIOD);
				}
				break;
			case CODE:
				_localctx = new CodeTypeContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1365); 
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
		enterRule(_localctx, 158, RULE_category_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1368); 
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
		enterRule(_localctx, 160, RULE_code_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1370); 
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
		public TerminalNode DOCUMENT() { return getToken(EParser.DOCUMENT, 0); }
		public Document_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterDocument_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitDocument_type(this);
		}
	}

	public final Document_typeContext document_type() throws RecognitionException {
		Document_typeContext _localctx = new Document_typeContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_document_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1372); 
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
		enterRule(_localctx, 164, RULE_category_declaration);
		try {
			setState(1377);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				_localctx = new ConcreteCategoryDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1374); 
				((ConcreteCategoryDeclarationContext)_localctx).decl = concrete_category_declaration();
				}
				break;
			case 2:
				_localctx = new NativeCategoryDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1375); 
				((NativeCategoryDeclarationContext)_localctx).decl = native_category_declaration();
				}
				break;
			case 3:
				_localctx = new SingletonCategoryDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1376); 
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
		public Type_identifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_identifier_list; }
	 
		public Type_identifier_listContext() { }
		public void copyFrom(Type_identifier_listContext ctx) {
			super.copyFrom(ctx);
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
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterTypeIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitTypeIdentifierList(this);
		}
	}
	public static class TypeIdentifierListItemContext extends Type_identifier_listContext {
		public Type_identifier_listContext items;
		public Type_identifierContext item;
		public TerminalNode COMMA() { return getToken(EParser.COMMA, 0); }
		public Type_identifier_listContext type_identifier_list() {
			return getRuleContext(Type_identifier_listContext.class,0);
		}
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public TypeIdentifierListItemContext(Type_identifier_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterTypeIdentifierListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitTypeIdentifierListItem(this);
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
		int _startState = 166;
		enterRecursionRule(_localctx, 166, RULE_type_identifier_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new TypeIdentifierListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1380); 
			((TypeIdentifierListContext)_localctx).item = type_identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(1387);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeIdentifierListItemContext(new Type_identifier_listContext(_parentctx, _parentState));
					((TypeIdentifierListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_type_identifier_list);
					setState(1382);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1383); 
					match(COMMA);
					setState(1384); 
					((TypeIdentifierListItemContext)_localctx).item = type_identifier();
					}
					} 
				}
				setState(1389);
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
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterMethodVariableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitMethodVariableIdentifier(this);
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
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterMethodTypeIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitMethodTypeIdentifier(this);
		}
	}

	public final Method_identifierContext method_identifier() throws RecognitionException {
		Method_identifierContext _localctx = new Method_identifierContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_method_identifier);
		try {
			setState(1392);
			switch (_input.LA(1)) {
			case VARIABLE_IDENTIFIER:
				_localctx = new MethodVariableIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1390); 
				((MethodVariableIdentifierContext)_localctx).name = variable_identifier();
				}
				break;
			case TYPE_IDENTIFIER:
				_localctx = new MethodTypeIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1391); 
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
	public static class TypeIdentifierContext extends IdentifierContext {
		public Type_identifierContext name;
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
		public Symbol_identifierContext name;
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
		public Variable_identifierContext name;
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
		enterRule(_localctx, 170, RULE_identifier);
		try {
			setState(1397);
			switch (_input.LA(1)) {
			case VARIABLE_IDENTIFIER:
				_localctx = new VariableIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1394); 
				((VariableIdentifierContext)_localctx).name = variable_identifier();
				}
				break;
			case TYPE_IDENTIFIER:
				_localctx = new TypeIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1395); 
				((TypeIdentifierContext)_localctx).name = type_identifier();
				}
				break;
			case SYMBOL_IDENTIFIER:
				_localctx = new SymbolIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1396); 
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
		enterRule(_localctx, 172, RULE_variable_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1399); 
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
		enterRule(_localctx, 174, RULE_type_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1401); 
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
		enterRule(_localctx, 176, RULE_symbol_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1403); 
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
		public TerminalNode COMMA() { return getToken(EParser.COMMA, 0); }
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public ArgumentListItemContext(Argument_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterArgumentListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitArgumentListItem(this);
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
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitArgumentList(this);
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
		int _startState = 178;
		enterRecursionRule(_localctx, 178, RULE_argument_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1406); 
			((ArgumentListContext)_localctx).item = argument();
			}
			_ctx.stop = _input.LT(-1);
			setState(1413);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArgumentListItemContext(new Argument_listContext(_parentctx, _parentState));
					((ArgumentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_argument_list);
					setState(1408);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1409); 
					match(COMMA);
					setState(1410); 
					((ArgumentListItemContext)_localctx).item = argument();
					}
					} 
				}
				setState(1415);
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
		enterRule(_localctx, 180, RULE_argument);
		int _la;
		try {
			setState(1421);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				_localctx = new CodeArgumentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1416); 
				((CodeArgumentContext)_localctx).arg = code_argument();
				}
				break;
			case 2:
				_localctx = new OperatorArgumentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1418);
				_la = _input.LA(1);
				if (_la==MUTABLE) {
					{
					setState(1417); 
					match(MUTABLE);
					}
				}

				setState(1420); 
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
	public static class TypedArgumentContext extends Operator_argumentContext {
		public Typed_argumentContext arg;
		public Typed_argumentContext typed_argument() {
			return getRuleContext(Typed_argumentContext.class,0);
		}
		public TypedArgumentContext(Operator_argumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterTypedArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitTypedArgument(this);
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
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterNamedArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitNamedArgument(this);
		}
	}

	public final Operator_argumentContext operator_argument() throws RecognitionException {
		Operator_argumentContext _localctx = new Operator_argumentContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_operator_argument);
		try {
			setState(1425);
			switch (_input.LA(1)) {
			case VARIABLE_IDENTIFIER:
				_localctx = new NamedArgumentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1423); 
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
				setState(1424); 
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
		enterRule(_localctx, 184, RULE_named_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1427); 
			((Named_argumentContext)_localctx).name = variable_identifier();
			setState(1430);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(1428); 
				match(EQ);
				setState(1429); 
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
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterCode_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitCode_argument(this);
		}
	}

	public final Code_argumentContext code_argument() throws RecognitionException {
		Code_argumentContext _localctx = new Code_argumentContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_code_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1432); 
			code_type();
			setState(1433); 
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
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterAnyArgumentType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitAnyArgumentType(this);
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
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterCategoryArgumentType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitCategoryArgumentType(this);
		}
	}

	public final Category_or_any_typeContext category_or_any_type() throws RecognitionException {
		Category_or_any_typeContext _localctx = new Category_or_any_typeContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_category_or_any_type);
		try {
			setState(1437);
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
				setState(1435); 
				((CategoryArgumentTypeContext)_localctx).typ = typedef(0);
				}
				break;
			case ANY:
				_localctx = new AnyArgumentTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1436); 
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
	public static class AnyListTypeContext extends Any_typeContext {
		public Any_typeContext typ;
		public TerminalNode LBRAK() { return getToken(EParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(EParser.RBRAK, 0); }
		public Any_typeContext any_type() {
			return getRuleContext(Any_typeContext.class,0);
		}
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
		public Any_typeContext typ;
		public TerminalNode LCURL() { return getToken(EParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(EParser.RCURL, 0); }
		public Any_typeContext any_type() {
			return getRuleContext(Any_typeContext.class,0);
		}
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
		int _startState = 190;
		enterRecursionRule(_localctx, 190, RULE_any_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AnyTypeContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1440); 
			match(ANY);
			}
			_ctx.stop = _input.LT(-1);
			setState(1450);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1448);
					switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
					case 1:
						{
						_localctx = new AnyListTypeContext(new Any_typeContext(_parentctx, _parentState));
						((AnyListTypeContext)_localctx).typ = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_any_type);
						setState(1442);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1443); 
						match(LBRAK);
						setState(1444); 
						match(RBRAK);
						}
						break;
					case 2:
						{
						_localctx = new AnyDictTypeContext(new Any_typeContext(_parentctx, _parentState));
						((AnyDictTypeContext)_localctx).typ = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_any_type);
						setState(1445);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1446); 
						match(LCURL);
						setState(1447); 
						match(RCURL);
						}
						break;
					}
					} 
				}
				setState(1452);
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
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterCategoryMethodListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitCategoryMethodListItem(this);
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
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterCategoryMethodList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitCategoryMethodList(this);
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
		int _startState = 192;
		enterRecursionRule(_localctx, 192, RULE_member_method_declaration_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new CategoryMethodListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1454); 
			((CategoryMethodListContext)_localctx).item = member_method_declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(1462);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CategoryMethodListItemContext(new Member_method_declaration_listContext(_parentctx, _parentState));
					((CategoryMethodListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_member_method_declaration_list);
					setState(1456);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1457); 
					lfp();
					setState(1458); 
					((CategoryMethodListItemContext)_localctx).item = member_method_declaration();
					}
					} 
				}
				setState(1464);
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
		enterRule(_localctx, 194, RULE_member_method_declaration);
		try {
			setState(1470);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1465); 
				setter_method_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1466); 
				getter_method_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1467); 
				concrete_method_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1468); 
				abstract_method_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1469); 
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
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterNativeCategoryMethodList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitNativeCategoryMethodList(this);
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
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterNativeCategoryMethodListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitNativeCategoryMethodListItem(this);
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
		int _startState = 196;
		enterRecursionRule(_localctx, 196, RULE_native_member_method_declaration_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new NativeCategoryMethodListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1473); 
			((NativeCategoryMethodListContext)_localctx).item = native_member_method_declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(1481);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NativeCategoryMethodListItemContext(new Native_member_method_declaration_listContext(_parentctx, _parentState));
					((NativeCategoryMethodListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_native_member_method_declaration_list);
					setState(1475);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1476); 
					lfp();
					setState(1477); 
					((NativeCategoryMethodListItemContext)_localctx).item = native_member_method_declaration();
					}
					} 
				}
				setState(1483);
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
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterNative_member_method_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitNative_member_method_declaration(this);
		}
	}

	public final Native_member_method_declarationContext native_member_method_declaration() throws RecognitionException {
		Native_member_method_declarationContext _localctx = new Native_member_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_native_member_method_declaration);
		try {
			setState(1486);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1484); 
				member_method_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1485); 
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
		enterRule(_localctx, 200, RULE_native_category_binding);
		try {
			setState(1498);
			switch (_input.LA(1)) {
			case JAVA:
				_localctx = new JavaCategoryBindingContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1488); 
				match(JAVA);
				setState(1489); 
				((JavaCategoryBindingContext)_localctx).binding = java_class_identifier_expression(0);
				}
				break;
			case CSHARP:
				_localctx = new CSharpCategoryBindingContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1490); 
				match(CSHARP);
				setState(1491); 
				((CSharpCategoryBindingContext)_localctx).binding = csharp_identifier_expression(0);
				}
				break;
			case PYTHON2:
				_localctx = new Python2CategoryBindingContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1492); 
				match(PYTHON2);
				setState(1493); 
				((Python2CategoryBindingContext)_localctx).binding = python_category_binding();
				}
				break;
			case PYTHON3:
				_localctx = new Python3CategoryBindingContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1494); 
				match(PYTHON3);
				setState(1495); 
				((Python3CategoryBindingContext)_localctx).binding = python_category_binding();
				}
				break;
			case JAVASCRIPT:
				_localctx = new JavaScriptCategoryBindingContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1496); 
				match(JAVASCRIPT);
				setState(1497); 
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
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterPython_category_binding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitPython_category_binding(this);
		}
	}

	public final Python_category_bindingContext python_category_binding() throws RecognitionException {
		Python_category_bindingContext _localctx = new Python_category_bindingContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_python_category_binding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1500); 
			((Python_category_bindingContext)_localctx).id_ = identifier();
			setState(1502);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				{
				setState(1501); 
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
		enterRule(_localctx, 204, RULE_python_module);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1504); 
			match(FROM);
			setState(1505); 
			module_token();
			setState(1506); 
			match(COLON);
			setState(1507); 
			identifier();
			setState(1512);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1508); 
					match(DOT);
					setState(1509); 
					identifier();
					}
					} 
				}
				setState(1514);
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
		enterRule(_localctx, 206, RULE_module_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1515); 
			((Module_tokenContext)_localctx).i1 = match(VARIABLE_IDENTIFIER);
			setState(1516);
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
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJavascript_category_binding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJavascript_category_binding(this);
		}
	}

	public final Javascript_category_bindingContext javascript_category_binding() throws RecognitionException {
		Javascript_category_bindingContext _localctx = new Javascript_category_bindingContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_javascript_category_binding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1518); 
			((Javascript_category_bindingContext)_localctx).id_ = identifier();
			setState(1520);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				{
				setState(1519); 
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
		enterRule(_localctx, 210, RULE_javascript_module);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1522); 
			match(FROM);
			setState(1523); 
			module_token();
			setState(1524); 
			match(COLON);
			setState(1526);
			_la = _input.LA(1);
			if (_la==SLASH) {
				{
				setState(1525); 
				match(SLASH);
				}
			}

			setState(1528); 
			javascript_identifier();
			setState(1533);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1529); 
					match(SLASH);
					setState(1530); 
					javascript_identifier();
					}
					} 
				}
				setState(1535);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			}
			setState(1538);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				{
				setState(1536); 
				match(DOT);
				setState(1537); 
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
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterVariableList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitVariableList(this);
		}
	}
	public static class VariableListItemContext extends Variable_identifier_listContext {
		public Variable_identifier_listContext items;
		public Variable_identifierContext item;
		public TerminalNode COMMA() { return getToken(EParser.COMMA, 0); }
		public Variable_identifier_listContext variable_identifier_list() {
			return getRuleContext(Variable_identifier_listContext.class,0);
		}
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public VariableListItemContext(Variable_identifier_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterVariableListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitVariableListItem(this);
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
		int _startState = 212;
		enterRecursionRule(_localctx, 212, RULE_variable_identifier_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new VariableListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1541); 
			((VariableListContext)_localctx).item = variable_identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(1548);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VariableListItemContext(new Variable_identifier_listContext(_parentctx, _parentState));
					((VariableListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_variable_identifier_list);
					setState(1543);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1544); 
					match(COMMA);
					setState(1545); 
					((VariableListItemContext)_localctx).item = variable_identifier();
					}
					} 
				}
				setState(1550);
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
	public static class NativeMethodContext extends Method_declarationContext {
		public Native_method_declarationContext decl;
		public Native_method_declarationContext native_method_declaration() {
			return getRuleContext(Native_method_declarationContext.class,0);
		}
		public NativeMethodContext(Method_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterNativeMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitNativeMethod(this);
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
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterAbstractMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitAbstractMethod(this);
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
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterConcreteMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitConcreteMethod(this);
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
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterTestMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitTestMethod(this);
		}
	}

	public final Method_declarationContext method_declaration() throws RecognitionException {
		Method_declarationContext _localctx = new Method_declarationContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_method_declaration);
		try {
			setState(1555);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				_localctx = new AbstractMethodContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1551); 
				((AbstractMethodContext)_localctx).decl = abstract_method_declaration();
				}
				break;
			case 2:
				_localctx = new ConcreteMethodContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1552); 
				((ConcreteMethodContext)_localctx).decl = concrete_method_declaration();
				}
				break;
			case 3:
				_localctx = new NativeMethodContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1553); 
				((NativeMethodContext)_localctx).decl = native_method_declaration();
				}
				break;
			case 4:
				_localctx = new TestMethodContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1554); 
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
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterNativeStatementListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitNativeStatementListItem(this);
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
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterNativeStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitNativeStatementList(this);
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
		int _startState = 216;
		enterRecursionRule(_localctx, 216, RULE_native_statement_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new NativeStatementListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1558); 
			((NativeStatementListContext)_localctx).item = native_statement();
			}
			_ctx.stop = _input.LT(-1);
			setState(1566);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NativeStatementListItemContext(new Native_statement_listContext(_parentctx, _parentState));
					((NativeStatementListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_native_statement_list);
					setState(1560);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1561); 
					lfp();
					setState(1562); 
					((NativeStatementListItemContext)_localctx).item = native_statement();
					}
					} 
				}
				setState(1568);
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
	public static class CSharpNativeStatementContext extends Native_statementContext {
		public Csharp_statementContext stmt;
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
		public Java_statementContext stmt;
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
		public Javascript_native_statementContext stmt;
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
		public Python_native_statementContext stmt;
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
		public Python_native_statementContext stmt;
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
		enterRule(_localctx, 218, RULE_native_statement);
		try {
			setState(1579);
			switch (_input.LA(1)) {
			case JAVA:
				_localctx = new JavaNativeStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1569); 
				match(JAVA);
				setState(1570); 
				((JavaNativeStatementContext)_localctx).stmt = java_statement();
				}
				break;
			case CSHARP:
				_localctx = new CSharpNativeStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1571); 
				match(CSHARP);
				setState(1572); 
				((CSharpNativeStatementContext)_localctx).stmt = csharp_statement();
				}
				break;
			case PYTHON2:
				_localctx = new Python2NativeStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1573); 
				match(PYTHON2);
				setState(1574); 
				((Python2NativeStatementContext)_localctx).stmt = python_native_statement();
				}
				break;
			case PYTHON3:
				_localctx = new Python3NativeStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1575); 
				match(PYTHON3);
				setState(1576); 
				((Python3NativeStatementContext)_localctx).stmt = python_native_statement();
				}
				break;
			case JAVASCRIPT:
				_localctx = new JavaScriptNativeStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1577); 
				match(JAVASCRIPT);
				setState(1578); 
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
		enterRule(_localctx, 220, RULE_python_native_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1581); 
			((Python_native_statementContext)_localctx).stmt = python_statement();
			setState(1583);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				{
				setState(1582); 
				match(SEMI);
				}
				break;
			}
			setState(1586);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				{
				setState(1585); 
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
		enterRule(_localctx, 222, RULE_javascript_native_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1588); 
			((Javascript_native_statementContext)_localctx).stmt = javascript_statement();
			setState(1590);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				{
				setState(1589); 
				match(SEMI);
				}
				break;
			}
			setState(1593);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				{
				setState(1592); 
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
	public static class StatementListContext extends Statement_listContext {
		public StatementContext item;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementListContext(Statement_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitStatementList(this);
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
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterStatementListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitStatementListItem(this);
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
		int _startState = 224;
		enterRecursionRule(_localctx, 224, RULE_statement_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new StatementListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1596); 
			((StatementListContext)_localctx).item = statement();
			}
			_ctx.stop = _input.LT(-1);
			setState(1604);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StatementListItemContext(new Statement_listContext(_parentctx, _parentState));
					((StatementListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_statement_list);
					setState(1598);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1599); 
					lfp();
					setState(1600); 
					((StatementListItemContext)_localctx).item = statement();
					}
					} 
				}
				setState(1606);
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
	public static class AssertionListContext extends Assertion_listContext {
		public AssertionContext item;
		public AssertionContext assertion() {
			return getRuleContext(AssertionContext.class,0);
		}
		public AssertionListContext(Assertion_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterAssertionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitAssertionList(this);
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
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterAssertionListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitAssertionListItem(this);
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
		int _startState = 226;
		enterRecursionRule(_localctx, 226, RULE_assertion_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AssertionListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1608); 
			((AssertionListContext)_localctx).item = assertion();
			}
			_ctx.stop = _input.LT(-1);
			setState(1616);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AssertionListItemContext(new Assertion_listContext(_parentctx, _parentState));
					((AssertionListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_assertion_list);
					setState(1610);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1611); 
					lfp();
					setState(1612); 
					((AssertionListItemContext)_localctx).item = assertion();
					}
					} 
				}
				setState(1618);
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
	public static class SwitchCaseStatementListContext extends Switch_case_statement_listContext {
		public Switch_case_statementContext item;
		public Switch_case_statementContext switch_case_statement() {
			return getRuleContext(Switch_case_statementContext.class,0);
		}
		public SwitchCaseStatementListContext(Switch_case_statement_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterSwitchCaseStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitSwitchCaseStatementList(this);
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
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterSwitchCaseStatementListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitSwitchCaseStatementListItem(this);
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
		int _startState = 228;
		enterRecursionRule(_localctx, 228, RULE_switch_case_statement_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SwitchCaseStatementListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1620); 
			((SwitchCaseStatementListContext)_localctx).item = switch_case_statement();
			}
			_ctx.stop = _input.LT(-1);
			setState(1628);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SwitchCaseStatementListItemContext(new Switch_case_statement_listContext(_parentctx, _parentState));
					((SwitchCaseStatementListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_switch_case_statement_list);
					setState(1622);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1623); 
					lfp();
					setState(1624); 
					((SwitchCaseStatementListItemContext)_localctx).item = switch_case_statement();
					}
					} 
				}
				setState(1630);
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
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterCatchStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitCatchStatementList(this);
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
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterCatchStatementListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitCatchStatementListItem(this);
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
		int _startState = 230;
		enterRecursionRule(_localctx, 230, RULE_catch_statement_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new CatchStatementListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1632); 
			((CatchStatementListContext)_localctx).item = catch_statement();
			}
			_ctx.stop = _input.LT(-1);
			setState(1640);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CatchStatementListItemContext(new Catch_statement_listContext(_parentctx, _parentState));
					((CatchStatementListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_catch_statement_list);
					setState(1634);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1635); 
					lfp();
					setState(1636); 
					((CatchStatementListItemContext)_localctx).item = catch_statement();
					}
					} 
				}
				setState(1642);
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
	public static class LiteralListLiteralContext extends Literal_collectionContext {
		public Literal_list_literalContext exp;
		public TerminalNode LBRAK() { return getToken(EParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(EParser.RBRAK, 0); }
		public Literal_list_literalContext literal_list_literal() {
			return getRuleContext(Literal_list_literalContext.class,0);
		}
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
		public Literal_list_literalContext exp;
		public TerminalNode LT() { return getToken(EParser.LT, 0); }
		public TerminalNode GT() { return getToken(EParser.GT, 0); }
		public Literal_list_literalContext literal_list_literal() {
			return getRuleContext(Literal_list_literalContext.class,0);
		}
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
		enterRule(_localctx, 232, RULE_literal_collection);
		try {
			setState(1657);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				_localctx = new LiteralRangeLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1643); 
				match(LBRAK);
				setState(1644); 
				((LiteralRangeLiteralContext)_localctx).low = atomic_literal();
				setState(1645); 
				match(RANGE);
				setState(1646); 
				((LiteralRangeLiteralContext)_localctx).high = atomic_literal();
				setState(1647); 
				match(RBRAK);
				}
				break;
			case 2:
				_localctx = new LiteralListLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1649); 
				match(LBRAK);
				setState(1650); 
				((LiteralListLiteralContext)_localctx).exp = literal_list_literal(0);
				setState(1651); 
				match(RBRAK);
				}
				break;
			case 3:
				_localctx = new LiteralSetLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1653); 
				match(LT);
				setState(1654); 
				((LiteralSetLiteralContext)_localctx).exp = literal_list_literal(0);
				setState(1655); 
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
		enterRule(_localctx, 234, RULE_atomic_literal);
		try {
			setState(1672);
			switch (_input.LA(1)) {
			case MIN_INTEGER:
				_localctx = new MinIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1659); 
				((MinIntegerLiteralContext)_localctx).t = match(MIN_INTEGER);
				}
				break;
			case MAX_INTEGER:
				_localctx = new MaxIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1660); 
				((MaxIntegerLiteralContext)_localctx).t = match(MAX_INTEGER);
				}
				break;
			case INTEGER_LITERAL:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1661); 
				((IntegerLiteralContext)_localctx).t = match(INTEGER_LITERAL);
				}
				break;
			case HEXA_LITERAL:
				_localctx = new HexadecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1662); 
				((HexadecimalLiteralContext)_localctx).t = match(HEXA_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new CharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1663); 
				((CharacterLiteralContext)_localctx).t = match(CHAR_LITERAL);
				}
				break;
			case DATE_LITERAL:
				_localctx = new DateLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1664); 
				((DateLiteralContext)_localctx).t = match(DATE_LITERAL);
				}
				break;
			case TIME_LITERAL:
				_localctx = new TimeLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1665); 
				((TimeLiteralContext)_localctx).t = match(TIME_LITERAL);
				}
				break;
			case TEXT_LITERAL:
				_localctx = new TextLiteralContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1666); 
				((TextLiteralContext)_localctx).t = match(TEXT_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1667); 
				((DecimalLiteralContext)_localctx).t = match(DECIMAL_LITERAL);
				}
				break;
			case DATETIME_LITERAL:
				_localctx = new DateTimeLiteralContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1668); 
				((DateTimeLiteralContext)_localctx).t = match(DATETIME_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(1669); 
				((BooleanLiteralContext)_localctx).t = match(BOOLEAN_LITERAL);
				}
				break;
			case PERIOD_LITERAL:
				_localctx = new PeriodLiteralContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(1670); 
				((PeriodLiteralContext)_localctx).t = match(PERIOD_LITERAL);
				}
				break;
			case NOTHING:
				_localctx = new NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(1671); 
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
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterLiteralList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitLiteralList(this);
		}
	}
	public static class LiteralListItemContext extends Literal_list_literalContext {
		public Literal_list_literalContext items;
		public Atomic_literalContext item;
		public TerminalNode COMMA() { return getToken(EParser.COMMA, 0); }
		public Literal_list_literalContext literal_list_literal() {
			return getRuleContext(Literal_list_literalContext.class,0);
		}
		public Atomic_literalContext atomic_literal() {
			return getRuleContext(Atomic_literalContext.class,0);
		}
		public LiteralListItemContext(Literal_list_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterLiteralListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitLiteralListItem(this);
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
		int _startState = 236;
		enterRecursionRule(_localctx, 236, RULE_literal_list_literal, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new LiteralListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1675); 
			((LiteralListContext)_localctx).item = atomic_literal();
			}
			_ctx.stop = _input.LT(-1);
			setState(1682);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LiteralListItemContext(new Literal_list_literalContext(_parentctx, _parentState));
					((LiteralListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_literal_list_literal);
					setState(1677);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1678); 
					match(COMMA);
					setState(1679); 
					((LiteralListItemContext)_localctx).item = atomic_literal();
					}
					} 
				}
				setState(1684);
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
		enterRule(_localctx, 238, RULE_selectable_expression);
		try {
			setState(1689);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				_localctx = new ParenthesisExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1685); 
				((ParenthesisExpressionContext)_localctx).exp = parenthesis_expression();
				}
				break;
			case 2:
				_localctx = new LiteralExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1686); 
				((LiteralExpressionContext)_localctx).exp = literal_expression();
				}
				break;
			case 3:
				_localctx = new IdentifierExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1687); 
				((IdentifierExpressionContext)_localctx).exp = identifier();
				}
				break;
			case 4:
				_localctx = new ThisExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1688); 
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
		enterRule(_localctx, 240, RULE_this_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1691);
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
		public TerminalNode LPAR() { return getToken(EParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EParser.RPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		enterRule(_localctx, 242, RULE_parenthesis_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1693); 
			match(LPAR);
			setState(1694); 
			((Parenthesis_expressionContext)_localctx).exp = expression(0);
			setState(1695); 
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
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterCollectionLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitCollectionLiteral(this);
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
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterAtomicLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitAtomicLiteral(this);
		}
	}

	public final Literal_expressionContext literal_expression() throws RecognitionException {
		Literal_expressionContext _localctx = new Literal_expressionContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_literal_expression);
		try {
			setState(1699);
			switch (_input.LA(1)) {
			case NOTHING:
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
				setState(1697); 
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
				setState(1698); 
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
	public static class ListLiteralContext extends Collection_literalContext {
		public List_literalContext exp;
		public List_literalContext list_literal() {
			return getRuleContext(List_literalContext.class,0);
		}
		public ListLiteralContext(Collection_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterListLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitListLiteral(this);
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
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterRangeLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitRangeLiteral(this);
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
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterTupleLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitTupleLiteral(this);
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
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterSetLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitSetLiteral(this);
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
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterDictLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitDictLiteral(this);
		}
	}

	public final Collection_literalContext collection_literal() throws RecognitionException {
		Collection_literalContext _localctx = new Collection_literalContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_collection_literal);
		try {
			setState(1706);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				_localctx = new RangeLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1701); 
				((RangeLiteralContext)_localctx).exp = range_literal();
				}
				break;
			case 2:
				_localctx = new ListLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1702); 
				((ListLiteralContext)_localctx).exp = list_literal();
				}
				break;
			case 3:
				_localctx = new SetLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1703); 
				((SetLiteralContext)_localctx).exp = set_literal();
				}
				break;
			case 4:
				_localctx = new DictLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1704); 
				((DictLiteralContext)_localctx).exp = dict_literal();
				}
				break;
			case 5:
				_localctx = new TupleLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1705); 
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
		public TerminalNode LPAR() { return getToken(EParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EParser.RPAR, 0); }
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
		enterRule(_localctx, 248, RULE_tuple_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1708); 
			match(LPAR);
			setState(1710);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << METHOD_T) | (1L << CODE) | (1L << DOCUMENT))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (EXECUTE - 87)) | (1L << (FETCH - 87)) | (1L << (INVOKE - 87)) | (1L << (MUTABLE - 87)) | (1L << (NOT - 87)) | (1L << (NOTHING - 87)) | (1L << (READ - 87)) | (1L << (SELF - 87)) | (1L << (SORTED - 87)) | (1L << (THIS - 87)) | (1L << (BOOLEAN_LITERAL - 87)) | (1L << (CHAR_LITERAL - 87)) | (1L << (MIN_INTEGER - 87)) | (1L << (MAX_INTEGER - 87)) | (1L << (SYMBOL_IDENTIFIER - 87)) | (1L << (TYPE_IDENTIFIER - 87)) | (1L << (VARIABLE_IDENTIFIER - 87)) | (1L << (TEXT_LITERAL - 87)) | (1L << (INTEGER_LITERAL - 87)) | (1L << (HEXA_LITERAL - 87)) | (1L << (DECIMAL_LITERAL - 87)) | (1L << (DATETIME_LITERAL - 87)) | (1L << (TIME_LITERAL - 87)))) != 0) || _la==DATE_LITERAL || _la==PERIOD_LITERAL) {
				{
				setState(1709); 
				((Tuple_literalContext)_localctx).items = expression_tuple(0);
				}
			}

			setState(1712); 
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
		public TerminalNode LCURL() { return getToken(EParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(EParser.RCURL, 0); }
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
		enterRule(_localctx, 250, RULE_dict_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1714); 
			match(LCURL);
			setState(1716);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << METHOD_T) | (1L << CODE) | (1L << DOCUMENT))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (EXECUTE - 87)) | (1L << (FETCH - 87)) | (1L << (INVOKE - 87)) | (1L << (MUTABLE - 87)) | (1L << (NOT - 87)) | (1L << (NOTHING - 87)) | (1L << (READ - 87)) | (1L << (SELF - 87)) | (1L << (SORTED - 87)) | (1L << (THIS - 87)) | (1L << (BOOLEAN_LITERAL - 87)) | (1L << (CHAR_LITERAL - 87)) | (1L << (MIN_INTEGER - 87)) | (1L << (MAX_INTEGER - 87)) | (1L << (SYMBOL_IDENTIFIER - 87)) | (1L << (TYPE_IDENTIFIER - 87)) | (1L << (VARIABLE_IDENTIFIER - 87)) | (1L << (TEXT_LITERAL - 87)) | (1L << (INTEGER_LITERAL - 87)) | (1L << (HEXA_LITERAL - 87)) | (1L << (DECIMAL_LITERAL - 87)) | (1L << (DATETIME_LITERAL - 87)) | (1L << (TIME_LITERAL - 87)))) != 0) || _la==DATE_LITERAL || _la==PERIOD_LITERAL) {
				{
				setState(1715); 
				((Dict_literalContext)_localctx).items = dict_entry_list(0);
				}
			}

			setState(1718); 
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
	public static class ValueTupleContext extends Expression_tupleContext {
		public ExpressionContext item;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ValueTupleContext(Expression_tupleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterValueTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitValueTuple(this);
		}
	}
	public static class ValueTupleItemContext extends Expression_tupleContext {
		public Expression_tupleContext items;
		public ExpressionContext item;
		public TerminalNode COMMA() { return getToken(EParser.COMMA, 0); }
		public Expression_tupleContext expression_tuple() {
			return getRuleContext(Expression_tupleContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ValueTupleItemContext(Expression_tupleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterValueTupleItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitValueTupleItem(this);
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
		int _startState = 252;
		enterRecursionRule(_localctx, 252, RULE_expression_tuple, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ValueTupleContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1721); 
			((ValueTupleContext)_localctx).item = expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1728);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ValueTupleItemContext(new Expression_tupleContext(_parentctx, _parentState));
					((ValueTupleItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_expression_tuple);
					setState(1723);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1724); 
					match(COMMA);
					setState(1725); 
					((ValueTupleItemContext)_localctx).item = expression(0);
					}
					} 
				}
				setState(1730);
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
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterDictEntryList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitDictEntryList(this);
		}
	}
	public static class DictEntryListItemContext extends Dict_entry_listContext {
		public Dict_entry_listContext items;
		public Dict_entryContext item;
		public TerminalNode COMMA() { return getToken(EParser.COMMA, 0); }
		public Dict_entry_listContext dict_entry_list() {
			return getRuleContext(Dict_entry_listContext.class,0);
		}
		public Dict_entryContext dict_entry() {
			return getRuleContext(Dict_entryContext.class,0);
		}
		public DictEntryListItemContext(Dict_entry_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterDictEntryListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitDictEntryListItem(this);
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
		int _startState = 254;
		enterRecursionRule(_localctx, 254, RULE_dict_entry_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new DictEntryListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1732); 
			((DictEntryListContext)_localctx).item = dict_entry();
			}
			_ctx.stop = _input.LT(-1);
			setState(1739);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DictEntryListItemContext(new Dict_entry_listContext(_parentctx, _parentState));
					((DictEntryListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_dict_entry_list);
					setState(1734);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1735); 
					match(COMMA);
					setState(1736); 
					((DictEntryListItemContext)_localctx).item = dict_entry();
					}
					} 
				}
				setState(1741);
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
		enterRule(_localctx, 256, RULE_dict_entry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1742); 
			((Dict_entryContext)_localctx).key = expression(0);
			setState(1743); 
			match(COLON);
			setState(1744); 
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
		enterRule(_localctx, 258, RULE_slice_arguments);
		try {
			setState(1755);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				_localctx = new SliceFirstAndLastContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1746); 
				((SliceFirstAndLastContext)_localctx).first = expression(0);
				setState(1747); 
				match(COLON);
				setState(1748); 
				((SliceFirstAndLastContext)_localctx).last = expression(0);
				}
				break;
			case 2:
				_localctx = new SliceFirstOnlyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1750); 
				((SliceFirstOnlyContext)_localctx).first = expression(0);
				setState(1751); 
				match(COLON);
				}
				break;
			case 3:
				_localctx = new SliceLastOnlyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1753); 
				match(COLON);
				setState(1754); 
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
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterAssign_variable_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitAssign_variable_statement(this);
		}
	}

	public final Assign_variable_statementContext assign_variable_statement() throws RecognitionException {
		Assign_variable_statementContext _localctx = new Assign_variable_statementContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_assign_variable_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1757); 
			((Assign_variable_statementContext)_localctx).name = variable_identifier();
			setState(1758); 
			assign();
			setState(1759); 
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
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterChildInstance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitChildInstance(this);
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
		int _startState = 262;
		enterRecursionRule(_localctx, 262, RULE_assignable_instance, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new RootInstanceContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1762); 
			((RootInstanceContext)_localctx).name = variable_identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(1768);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ChildInstanceContext(new Assignable_instanceContext(_parentctx, _parentState));
					((ChildInstanceContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_assignable_instance);
					setState(1764);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1765); 
					((ChildInstanceContext)_localctx).child = child_instance();
					}
					} 
				}
				setState(1770);
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
		public ExpressionContext exp;
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
		enterRule(_localctx, 264, RULE_is_expression);
		try {
			setState(1775);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				_localctx = new IsATypeExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1771);
				if (!(this.willBeAOrAn())) throw new FailedPredicateException(this, "$parser.willBeAOrAn()");
				setState(1772); 
				match(VARIABLE_IDENTIFIER);
				setState(1773); 
				((IsATypeExpressionContext)_localctx).typ = category_or_any_type();
				}
				break;
			case 2:
				_localctx = new IsOtherExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1774); 
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
		enterRule(_localctx, 266, RULE_operator);
		try {
			setState(1783);
			switch (_input.LA(1)) {
			case PLUS:
				_localctx = new OperatorPlusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1777); 
				match(PLUS);
				}
				break;
			case MINUS:
				_localctx = new OperatorMinusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1778); 
				match(MINUS);
				}
				break;
			case STAR:
				_localctx = new OperatorMultiplyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1779); 
				multiply();
				}
				break;
			case SLASH:
				_localctx = new OperatorDivideContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1780); 
				divide();
				}
				break;
			case BSLASH:
				_localctx = new OperatorIDivideContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1781); 
				idivide();
				}
				break;
			case PERCENT:
			case MODULO:
				_localctx = new OperatorModuloContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1782); 
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
		enterRule(_localctx, 268, RULE_key_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1785); 
			((Key_tokenContext)_localctx).i1 = match(VARIABLE_IDENTIFIER);
			setState(1786);
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
		enterRule(_localctx, 270, RULE_value_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1788); 
			((Value_tokenContext)_localctx).i1 = match(VARIABLE_IDENTIFIER);
			setState(1789);
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
		enterRule(_localctx, 272, RULE_symbols_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1791); 
			((Symbols_tokenContext)_localctx).i1 = match(VARIABLE_IDENTIFIER);
			setState(1792);
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
		enterRule(_localctx, 274, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1794); 
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
		enterRule(_localctx, 276, RULE_multiply);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1796); 
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
		enterRule(_localctx, 278, RULE_divide);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1798); 
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
		enterRule(_localctx, 280, RULE_idivide);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1800); 
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
		enterRule(_localctx, 282, RULE_modulo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1802);
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
		enterRule(_localctx, 284, RULE_javascript_statement);
		try {
			setState(1811);
			switch (_input.LA(1)) {
			case RETURN:
				_localctx = new JavascriptReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1804); 
				match(RETURN);
				setState(1805); 
				((JavascriptReturnStatementContext)_localctx).exp = javascript_expression(0);
				setState(1806); 
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
				setState(1808); 
				((JavascriptStatementContext)_localctx).exp = javascript_expression(0);
				setState(1809); 
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
		int _startState = 286;
		enterRecursionRule(_localctx, 286, RULE_javascript_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavascriptPrimaryExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1814); 
			((JavascriptPrimaryExpressionContext)_localctx).exp = javascript_primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(1820);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,133,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavascriptSelectorExpressionContext(new Javascript_expressionContext(_parentctx, _parentState));
					((JavascriptSelectorExpressionContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_javascript_expression);
					setState(1816);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1817); 
					((JavascriptSelectorExpressionContext)_localctx).child = javascript_selector_expression();
					}
					} 
				}
				setState(1822);
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

	public static class Javascript_primary_expressionContext extends ParserRuleContext {
		public Javascript_this_expressionContext javascript_this_expression() {
			return getRuleContext(Javascript_this_expressionContext.class,0);
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
		enterRule(_localctx, 288, RULE_javascript_primary_expression);
		try {
			setState(1829);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1823); 
				javascript_this_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1824); 
				javascript_parenthesis_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1825); 
				javascript_identifier_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1826); 
				javascript_literal_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1827); 
				javascript_method_expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1828); 
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
		enterRule(_localctx, 290, RULE_javascript_this_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1831); 
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
		enterRule(_localctx, 292, RULE_javascript_selector_expression);
		try {
			setState(1838);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				_localctx = new JavaScriptMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1833); 
				match(DOT);
				setState(1834); 
				((JavaScriptMethodExpressionContext)_localctx).method = javascript_method_expression();
				}
				break;
			case 2:
				_localctx = new JavaScriptMemberExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1835); 
				match(DOT);
				setState(1836); 
				((JavaScriptMemberExpressionContext)_localctx).name = javascript_identifier();
				}
				break;
			case 3:
				_localctx = new JavaScriptItemExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1837); 
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
		enterRule(_localctx, 294, RULE_javascript_method_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1840); 
			((Javascript_method_expressionContext)_localctx).name = javascript_identifier();
			setState(1841); 
			match(LPAR);
			setState(1843);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD))) != 0) || ((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & ((1L << (READ - 116)) | (1L << (SELF - 116)) | (1L << (TEST - 116)) | (1L << (THIS - 116)) | (1L << (WRITE - 116)) | (1L << (BOOLEAN_LITERAL - 116)) | (1L << (CHAR_LITERAL - 116)) | (1L << (SYMBOL_IDENTIFIER - 116)) | (1L << (TYPE_IDENTIFIER - 116)) | (1L << (VARIABLE_IDENTIFIER - 116)) | (1L << (DOLLAR_IDENTIFIER - 116)) | (1L << (TEXT_LITERAL - 116)) | (1L << (INTEGER_LITERAL - 116)) | (1L << (DECIMAL_LITERAL - 116)))) != 0)) {
				{
				setState(1842); 
				((Javascript_method_expressionContext)_localctx).args = javascript_arguments(0);
				}
			}

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
		int _startState = 296;
		enterRecursionRule(_localctx, 296, RULE_javascript_arguments, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavascriptArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1848); 
			((JavascriptArgumentListContext)_localctx).item = javascript_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1855);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavascriptArgumentListItemContext(new Javascript_argumentsContext(_parentctx, _parentState));
					((JavascriptArgumentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_javascript_arguments);
					setState(1850);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1851); 
					match(COMMA);
					setState(1852); 
					((JavascriptArgumentListItemContext)_localctx).item = javascript_expression(0);
					}
					} 
				}
				setState(1857);
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
		enterRule(_localctx, 298, RULE_javascript_item_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1858); 
			match(LBRAK);
			setState(1859); 
			((Javascript_item_expressionContext)_localctx).exp = javascript_expression(0);
			setState(1860); 
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
		enterRule(_localctx, 300, RULE_javascript_parenthesis_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1862); 
			match(LPAR);
			setState(1863); 
			((Javascript_parenthesis_expressionContext)_localctx).exp = javascript_expression(0);
			setState(1864); 
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
		enterRule(_localctx, 302, RULE_javascript_identifier_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1866); 
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
		enterRule(_localctx, 304, RULE_javascript_literal_expression);
		try {
			setState(1873);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				_localctx = new JavascriptIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1868); 
				((JavascriptIntegerLiteralContext)_localctx).t = match(INTEGER_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				_localctx = new JavascriptDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1869); 
				((JavascriptDecimalLiteralContext)_localctx).t = match(DECIMAL_LITERAL);
				}
				break;
			case TEXT_LITERAL:
				_localctx = new JavascriptTextLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1870); 
				((JavascriptTextLiteralContext)_localctx).t = match(TEXT_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new JavascriptBooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1871); 
				((JavascriptBooleanLiteralContext)_localctx).t = match(BOOLEAN_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new JavascriptCharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1872); 
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
		enterRule(_localctx, 306, RULE_javascript_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1875);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD))) != 0) || ((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & ((1L << (READ - 116)) | (1L << (TEST - 116)) | (1L << (WRITE - 116)) | (1L << (SYMBOL_IDENTIFIER - 116)) | (1L << (TYPE_IDENTIFIER - 116)) | (1L << (VARIABLE_IDENTIFIER - 116)) | (1L << (DOLLAR_IDENTIFIER - 116)))) != 0)) ) {
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
		enterRule(_localctx, 308, RULE_python_statement);
		try {
			setState(1880);
			switch (_input.LA(1)) {
			case RETURN:
				_localctx = new PythonReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1877); 
				match(RETURN);
				setState(1878); 
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
				setState(1879); 
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
		int _startState = 310;
		enterRecursionRule(_localctx, 310, RULE_python_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PythonPrimaryExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1883); 
			((PythonPrimaryExpressionContext)_localctx).exp = python_primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(1889);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PythonSelectorExpressionContext(new Python_expressionContext(_parentctx, _parentState));
					((PythonSelectorExpressionContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_python_expression);
					setState(1885);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1886); 
					((PythonSelectorExpressionContext)_localctx).child = python_selector_expression();
					}
					} 
				}
				setState(1891);
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
		enterRule(_localctx, 312, RULE_python_primary_expression);
		try {
			setState(1896);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				_localctx = new PythonParenthesisExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1892); 
				((PythonParenthesisExpressionContext)_localctx).exp = python_parenthesis_expression();
				}
				break;
			case 2:
				_localctx = new PythonIdentifierExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1893); 
				((PythonIdentifierExpressionContext)_localctx).exp = python_identifier_expression(0);
				}
				break;
			case 3:
				_localctx = new PythonLiteralExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1894); 
				((PythonLiteralExpressionContext)_localctx).exp = python_literal_expression();
				}
				break;
			case 4:
				_localctx = new PythonGlobalMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1895); 
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
		enterRule(_localctx, 314, RULE_python_selector_expression);
		try {
			setState(1904);
			switch (_input.LA(1)) {
			case DOT:
				_localctx = new PythonMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1898); 
				match(DOT);
				setState(1899); 
				((PythonMethodExpressionContext)_localctx).exp = python_method_expression();
				}
				break;
			case LBRAK:
				_localctx = new PythonItemExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1900); 
				match(LBRAK);
				setState(1901); 
				((PythonItemExpressionContext)_localctx).exp = python_expression(0);
				setState(1902); 
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
		enterRule(_localctx, 316, RULE_python_method_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1906); 
			((Python_method_expressionContext)_localctx).name = python_identifier();
			setState(1907); 
			match(LPAR);
			setState(1909);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD))) != 0) || ((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & ((1L << (READ - 116)) | (1L << (SELF - 116)) | (1L << (TEST - 116)) | (1L << (THIS - 116)) | (1L << (WRITE - 116)) | (1L << (BOOLEAN_LITERAL - 116)) | (1L << (CHAR_LITERAL - 116)) | (1L << (SYMBOL_IDENTIFIER - 116)) | (1L << (TYPE_IDENTIFIER - 116)) | (1L << (VARIABLE_IDENTIFIER - 116)) | (1L << (DOLLAR_IDENTIFIER - 116)) | (1L << (TEXT_LITERAL - 116)) | (1L << (INTEGER_LITERAL - 116)) | (1L << (DECIMAL_LITERAL - 116)))) != 0)) {
				{
				setState(1908); 
				((Python_method_expressionContext)_localctx).args = python_argument_list();
				}
			}

			setState(1911); 
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
		enterRule(_localctx, 318, RULE_python_argument_list);
		try {
			setState(1919);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				_localctx = new PythonOrdinalOnlyArgumentListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1913); 
				((PythonOrdinalOnlyArgumentListContext)_localctx).ordinal = python_ordinal_argument_list(0);
				}
				break;
			case 2:
				_localctx = new PythonNamedOnlyArgumentListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1914); 
				((PythonNamedOnlyArgumentListContext)_localctx).named = python_named_argument_list(0);
				}
				break;
			case 3:
				_localctx = new PythonArgumentListContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1915); 
				((PythonArgumentListContext)_localctx).ordinal = python_ordinal_argument_list(0);
				setState(1916); 
				match(COMMA);
				setState(1917); 
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
		int _startState = 320;
		enterRecursionRule(_localctx, 320, RULE_python_ordinal_argument_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PythonOrdinalArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1922); 
			((PythonOrdinalArgumentListContext)_localctx).item = python_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1929);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PythonOrdinalArgumentListItemContext(new Python_ordinal_argument_listContext(_parentctx, _parentState));
					((PythonOrdinalArgumentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_python_ordinal_argument_list);
					setState(1924);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1925); 
					match(COMMA);
					setState(1926); 
					((PythonOrdinalArgumentListItemContext)_localctx).item = python_expression(0);
					}
					} 
				}
				setState(1931);
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
		int _startState = 322;
		enterRecursionRule(_localctx, 322, RULE_python_named_argument_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PythonNamedArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1933); 
			((PythonNamedArgumentListContext)_localctx).name = python_identifier();
			setState(1934); 
			match(EQ);
			setState(1935); 
			((PythonNamedArgumentListContext)_localctx).exp = python_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1945);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PythonNamedArgumentListItemContext(new Python_named_argument_listContext(_parentctx, _parentState));
					((PythonNamedArgumentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_python_named_argument_list);
					setState(1937);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1938); 
					match(COMMA);
					setState(1939); 
					((PythonNamedArgumentListItemContext)_localctx).name = python_identifier();
					setState(1940); 
					match(EQ);
					setState(1941); 
					((PythonNamedArgumentListItemContext)_localctx).exp = python_expression(0);
					}
					} 
				}
				setState(1947);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 324, RULE_python_parenthesis_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1948); 
			match(LPAR);
			setState(1949); 
			((Python_parenthesis_expressionContext)_localctx).exp = python_expression(0);
			setState(1950); 
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
		int _startState = 326;
		enterRecursionRule(_localctx, 326, RULE_python_identifier_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1955);
			switch (_input.LA(1)) {
			case DOLLAR_IDENTIFIER:
				{
				_localctx = new PythonPromptoIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1953); 
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
				setState(1954); 
				((PythonIdentifierContext)_localctx).name = python_identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1962);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PythonChildIdentifierContext(new Python_identifier_expressionContext(_parentctx, _parentState));
					((PythonChildIdentifierContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_python_identifier_expression);
					setState(1957);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1958); 
					match(DOT);
					setState(1959); 
					((PythonChildIdentifierContext)_localctx).name = python_identifier();
					}
					} 
				}
				setState(1964);
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
		enterRule(_localctx, 328, RULE_python_literal_expression);
		try {
			setState(1970);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				_localctx = new PythonIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1965); 
				((PythonIntegerLiteralContext)_localctx).t = match(INTEGER_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				_localctx = new PythonDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1966); 
				((PythonDecimalLiteralContext)_localctx).t = match(DECIMAL_LITERAL);
				}
				break;
			case TEXT_LITERAL:
				_localctx = new PythonTextLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1967); 
				((PythonTextLiteralContext)_localctx).t = match(TEXT_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new PythonBooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1968); 
				((PythonBooleanLiteralContext)_localctx).t = match(BOOLEAN_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new PythonCharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1969); 
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
		enterRule(_localctx, 330, RULE_python_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1972);
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
		enterRule(_localctx, 332, RULE_java_statement);
		try {
			setState(1981);
			switch (_input.LA(1)) {
			case RETURN:
				_localctx = new JavaReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1974); 
				match(RETURN);
				setState(1975); 
				((JavaReturnStatementContext)_localctx).exp = java_expression(0);
				setState(1976); 
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
				setState(1978); 
				((JavaStatementContext)_localctx).exp = java_expression(0);
				setState(1979); 
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
		int _startState = 334;
		enterRecursionRule(_localctx, 334, RULE_java_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavaPrimaryExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1984); 
			((JavaPrimaryExpressionContext)_localctx).exp = java_primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(1990);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavaSelectorExpressionContext(new Java_expressionContext(_parentctx, _parentState));
					((JavaSelectorExpressionContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_java_expression);
					setState(1986);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1987); 
					((JavaSelectorExpressionContext)_localctx).child = java_selector_expression();
					}
					} 
				}
				setState(1992);
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
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJava_primary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJava_primary_expression(this);
		}
	}

	public final Java_primary_expressionContext java_primary_expression() throws RecognitionException {
		Java_primary_expressionContext _localctx = new Java_primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_java_primary_expression);
		try {
			setState(1997);
			switch (_input.LA(1)) {
			case SELF:
			case THIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1993); 
				java_this_expression();
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(1994); 
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
				setState(1995); 
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
				setState(1996); 
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
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterJava_this_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitJava_this_expression(this);
		}
	}

	public final Java_this_expressionContext java_this_expression() throws RecognitionException {
		Java_this_expressionContext _localctx = new Java_this_expressionContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_java_this_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1999); 
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
		enterRule(_localctx, 340, RULE_java_selector_expression);
		try {
			setState(2004);
			switch (_input.LA(1)) {
			case DOT:
				_localctx = new JavaMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2001); 
				match(DOT);
				setState(2002); 
				((JavaMethodExpressionContext)_localctx).exp = java_method_expression();
				}
				break;
			case LBRAK:
				_localctx = new JavaItemExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2003); 
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
		enterRule(_localctx, 342, RULE_java_method_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2006); 
			((Java_method_expressionContext)_localctx).name = java_identifier();
			setState(2007); 
			match(LPAR);
			setState(2009);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD))) != 0) || ((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & ((1L << (READ - 116)) | (1L << (SELF - 116)) | (1L << (TEST - 116)) | (1L << (THIS - 116)) | (1L << (WRITE - 116)) | (1L << (BOOLEAN_LITERAL - 116)) | (1L << (CHAR_LITERAL - 116)) | (1L << (SYMBOL_IDENTIFIER - 116)) | (1L << (TYPE_IDENTIFIER - 116)) | (1L << (VARIABLE_IDENTIFIER - 116)) | (1L << (NATIVE_IDENTIFIER - 116)) | (1L << (DOLLAR_IDENTIFIER - 116)) | (1L << (TEXT_LITERAL - 116)) | (1L << (INTEGER_LITERAL - 116)) | (1L << (DECIMAL_LITERAL - 116)))) != 0)) {
				{
				setState(2008); 
				((Java_method_expressionContext)_localctx).args = java_arguments(0);
				}
			}

			setState(2011); 
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
		int _startState = 344;
		enterRecursionRule(_localctx, 344, RULE_java_arguments, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavaArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2014); 
			((JavaArgumentListContext)_localctx).item = java_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2021);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavaArgumentListItemContext(new Java_argumentsContext(_parentctx, _parentState));
					((JavaArgumentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_java_arguments);
					setState(2016);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2017); 
					match(COMMA);
					setState(2018); 
					((JavaArgumentListItemContext)_localctx).item = java_expression(0);
					}
					} 
				}
				setState(2023);
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
		enterRule(_localctx, 346, RULE_java_item_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2024); 
			match(LBRAK);
			setState(2025); 
			((Java_item_expressionContext)_localctx).exp = java_expression(0);
			setState(2026); 
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
		enterRule(_localctx, 348, RULE_java_parenthesis_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2028); 
			match(LPAR);
			setState(2029); 
			((Java_parenthesis_expressionContext)_localctx).exp = java_expression(0);
			setState(2030); 
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
		int _startState = 350;
		enterRecursionRule(_localctx, 350, RULE_java_identifier_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavaIdentifierContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2033); 
			((JavaIdentifierContext)_localctx).name = java_identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(2040);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,156,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavaChildIdentifierContext(new Java_identifier_expressionContext(_parentctx, _parentState));
					((JavaChildIdentifierContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_java_identifier_expression);
					setState(2035);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2036); 
					match(DOT);
					setState(2037); 
					((JavaChildIdentifierContext)_localctx).name = java_identifier();
					}
					} 
				}
				setState(2042);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,156,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
		int _startState = 352;
		enterRecursionRule(_localctx, 352, RULE_java_class_identifier_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavaClassIdentifierContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2044); 
			((JavaClassIdentifierContext)_localctx).klass = java_identifier_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2050);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavaChildClassIdentifierContext(new Java_class_identifier_expressionContext(_parentctx, _parentState));
					((JavaChildClassIdentifierContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_java_class_identifier_expression);
					setState(2046);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2047); 
					((JavaChildClassIdentifierContext)_localctx).name = match(DOLLAR_IDENTIFIER);
					}
					} 
				}
				setState(2052);
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
		enterRule(_localctx, 354, RULE_java_literal_expression);
		try {
			setState(2058);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				_localctx = new JavaIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2053); 
				((JavaIntegerLiteralContext)_localctx).t = match(INTEGER_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				_localctx = new JavaDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2054); 
				((JavaDecimalLiteralContext)_localctx).t = match(DECIMAL_LITERAL);
				}
				break;
			case TEXT_LITERAL:
				_localctx = new JavaTextLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2055); 
				((JavaTextLiteralContext)_localctx).t = match(TEXT_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new JavaBooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2056); 
				((JavaBooleanLiteralContext)_localctx).t = match(BOOLEAN_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new JavaCharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2057); 
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
		enterRule(_localctx, 356, RULE_java_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2060);
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
		enterRule(_localctx, 358, RULE_csharp_statement);
		try {
			setState(2069);
			switch (_input.LA(1)) {
			case RETURN:
				_localctx = new CSharpReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2062); 
				match(RETURN);
				setState(2063); 
				((CSharpReturnStatementContext)_localctx).exp = csharp_expression(0);
				setState(2064); 
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
				setState(2066); 
				((CSharpStatementContext)_localctx).exp = csharp_expression(0);
				setState(2067); 
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
		int _startState = 360;
		enterRecursionRule(_localctx, 360, RULE_csharp_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new CSharpPrimaryExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2072); 
			((CSharpPrimaryExpressionContext)_localctx).exp = csharp_primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(2078);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CSharpSelectorExpressionContext(new Csharp_expressionContext(_parentctx, _parentState));
					((CSharpSelectorExpressionContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_csharp_expression);
					setState(2074);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2075); 
					((CSharpSelectorExpressionContext)_localctx).child = csharp_selector_expression();
					}
					} 
				}
				setState(2080);
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
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterCsharp_primary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitCsharp_primary_expression(this);
		}
	}

	public final Csharp_primary_expressionContext csharp_primary_expression() throws RecognitionException {
		Csharp_primary_expressionContext _localctx = new Csharp_primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_csharp_primary_expression);
		try {
			setState(2085);
			switch (_input.LA(1)) {
			case SELF:
			case THIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(2081); 
				csharp_this_expression();
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(2082); 
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
				setState(2083); 
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
				setState(2084); 
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
			if ( listener instanceof EParserListener ) ((EParserListener)listener).enterCsharp_this_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EParserListener ) ((EParserListener)listener).exitCsharp_this_expression(this);
		}
	}

	public final Csharp_this_expressionContext csharp_this_expression() throws RecognitionException {
		Csharp_this_expressionContext _localctx = new Csharp_this_expressionContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_csharp_this_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2087); 
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
		enterRule(_localctx, 366, RULE_csharp_selector_expression);
		try {
			setState(2092);
			switch (_input.LA(1)) {
			case DOT:
				_localctx = new CSharpMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2089); 
				match(DOT);
				setState(2090); 
				((CSharpMethodExpressionContext)_localctx).exp = csharp_method_expression();
				}
				break;
			case LBRAK:
				_localctx = new CSharpItemExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2091); 
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
		enterRule(_localctx, 368, RULE_csharp_method_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2094); 
			((Csharp_method_expressionContext)_localctx).name = csharp_identifier();
			setState(2095); 
			match(LPAR);
			setState(2097);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD))) != 0) || ((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & ((1L << (READ - 116)) | (1L << (SELF - 116)) | (1L << (TEST - 116)) | (1L << (THIS - 116)) | (1L << (WRITE - 116)) | (1L << (BOOLEAN_LITERAL - 116)) | (1L << (CHAR_LITERAL - 116)) | (1L << (SYMBOL_IDENTIFIER - 116)) | (1L << (TYPE_IDENTIFIER - 116)) | (1L << (VARIABLE_IDENTIFIER - 116)) | (1L << (DOLLAR_IDENTIFIER - 116)) | (1L << (TEXT_LITERAL - 116)) | (1L << (INTEGER_LITERAL - 116)) | (1L << (DECIMAL_LITERAL - 116)))) != 0)) {
				{
				setState(2096); 
				((Csharp_method_expressionContext)_localctx).args = csharp_arguments(0);
				}
			}

			setState(2099); 
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
		int _startState = 370;
		enterRecursionRule(_localctx, 370, RULE_csharp_arguments, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new CSharpArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2102); 
			((CSharpArgumentListContext)_localctx).item = csharp_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2109);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CSharpArgumentListItemContext(new Csharp_argumentsContext(_parentctx, _parentState));
					((CSharpArgumentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_csharp_arguments);
					setState(2104);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2105); 
					match(COMMA);
					setState(2106); 
					((CSharpArgumentListItemContext)_localctx).item = csharp_expression(0);
					}
					} 
				}
				setState(2111);
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
		enterRule(_localctx, 372, RULE_csharp_item_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2112); 
			match(LBRAK);
			setState(2113); 
			((Csharp_item_expressionContext)_localctx).exp = csharp_expression(0);
			setState(2114); 
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
		enterRule(_localctx, 374, RULE_csharp_parenthesis_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2116); 
			match(LPAR);
			setState(2117); 
			((Csharp_parenthesis_expressionContext)_localctx).exp = csharp_expression(0);
			setState(2118); 
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
		int _startState = 376;
		enterRecursionRule(_localctx, 376, RULE_csharp_identifier_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2123);
			switch (_input.LA(1)) {
			case DOLLAR_IDENTIFIER:
				{
				_localctx = new CSharpPromptoIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2121); 
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
				setState(2122); 
				((CSharpIdentifierContext)_localctx).name = csharp_identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(2130);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CSharpChildIdentifierContext(new Csharp_identifier_expressionContext(_parentctx, _parentState));
					((CSharpChildIdentifierContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_csharp_identifier_expression);
					setState(2125);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2126); 
					match(DOT);
					setState(2127); 
					((CSharpChildIdentifierContext)_localctx).name = csharp_identifier();
					}
					} 
				}
				setState(2132);
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
		enterRule(_localctx, 378, RULE_csharp_literal_expression);
		try {
			setState(2138);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				_localctx = new CSharpIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2133); 
				match(INTEGER_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				_localctx = new CSharpDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2134); 
				match(DECIMAL_LITERAL);
				}
				break;
			case TEXT_LITERAL:
				_localctx = new CSharpTextLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2135); 
				match(TEXT_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new CSharpBooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2136); 
				match(BOOLEAN_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new CSharpCharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2137); 
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
		enterRule(_localctx, 380, RULE_csharp_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2140);
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
		case 33: 
			return else_if_statement_list_sempred((Else_if_statement_listContext)_localctx, predIndex);
		case 38: 
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 39: 
			return unresolved_expression_sempred((Unresolved_expressionContext)_localctx, predIndex);
		case 40: 
			return unresolved_selector_sempred((Unresolved_selectorContext)_localctx, predIndex);
		case 42: 
			return invocation_trailer_sempred((Invocation_trailerContext)_localctx, predIndex);
		case 43: 
			return instance_expression_sempred((Instance_expressionContext)_localctx, predIndex);
		case 44: 
			return instance_selector_sempred((Instance_selectorContext)_localctx, predIndex);
		case 52: 
			return argument_assignment_list_sempred((Argument_assignment_listContext)_localctx, predIndex);
		case 53: 
			return with_argument_assignment_list_sempred((With_argument_assignment_listContext)_localctx, predIndex);
		case 56: 
			return child_instance_sempred((Child_instanceContext)_localctx, predIndex);
		case 64: 
			return declarations_sempred((DeclarationsContext)_localctx, predIndex);
		case 68: 
			return native_symbol_list_sempred((Native_symbol_listContext)_localctx, predIndex);
		case 69: 
			return category_symbol_list_sempred((Category_symbol_listContext)_localctx, predIndex);
		case 70: 
			return symbol_list_sempred((Symbol_listContext)_localctx, predIndex);
		case 74: 
			return expression_list_sempred((Expression_listContext)_localctx, predIndex);
		case 76: 
			return typedef_sempred((TypedefContext)_localctx, predIndex);
		case 83: 
			return type_identifier_list_sempred((Type_identifier_listContext)_localctx, predIndex);
		case 89: 
			return argument_list_sempred((Argument_listContext)_localctx, predIndex);
		case 95: 
			return any_type_sempred((Any_typeContext)_localctx, predIndex);
		case 96: 
			return member_method_declaration_list_sempred((Member_method_declaration_listContext)_localctx, predIndex);
		case 98: 
			return native_member_method_declaration_list_sempred((Native_member_method_declaration_listContext)_localctx, predIndex);
		case 103: 
			return module_token_sempred((Module_tokenContext)_localctx, predIndex);
		case 106: 
			return variable_identifier_list_sempred((Variable_identifier_listContext)_localctx, predIndex);
		case 108: 
			return native_statement_list_sempred((Native_statement_listContext)_localctx, predIndex);
		case 112: 
			return statement_list_sempred((Statement_listContext)_localctx, predIndex);
		case 113: 
			return assertion_list_sempred((Assertion_listContext)_localctx, predIndex);
		case 114: 
			return switch_case_statement_list_sempred((Switch_case_statement_listContext)_localctx, predIndex);
		case 115: 
			return catch_statement_list_sempred((Catch_statement_listContext)_localctx, predIndex);
		case 118: 
			return literal_list_literal_sempred((Literal_list_literalContext)_localctx, predIndex);
		case 126: 
			return expression_tuple_sempred((Expression_tupleContext)_localctx, predIndex);
		case 127: 
			return dict_entry_list_sempred((Dict_entry_listContext)_localctx, predIndex);
		case 131: 
			return assignable_instance_sempred((Assignable_instanceContext)_localctx, predIndex);
		case 132: 
			return is_expression_sempred((Is_expressionContext)_localctx, predIndex);
		case 134: 
			return key_token_sempred((Key_tokenContext)_localctx, predIndex);
		case 135: 
			return value_token_sempred((Value_tokenContext)_localctx, predIndex);
		case 136: 
			return symbols_token_sempred((Symbols_tokenContext)_localctx, predIndex);
		case 143: 
			return javascript_expression_sempred((Javascript_expressionContext)_localctx, predIndex);
		case 148: 
			return javascript_arguments_sempred((Javascript_argumentsContext)_localctx, predIndex);
		case 155: 
			return python_expression_sempred((Python_expressionContext)_localctx, predIndex);
		case 160: 
			return python_ordinal_argument_list_sempred((Python_ordinal_argument_listContext)_localctx, predIndex);
		case 161: 
			return python_named_argument_list_sempred((Python_named_argument_listContext)_localctx, predIndex);
		case 163: 
			return python_identifier_expression_sempred((Python_identifier_expressionContext)_localctx, predIndex);
		case 167: 
			return java_expression_sempred((Java_expressionContext)_localctx, predIndex);
		case 172: 
			return java_arguments_sempred((Java_argumentsContext)_localctx, predIndex);
		case 175: 
			return java_identifier_expression_sempred((Java_identifier_expressionContext)_localctx, predIndex);
		case 176: 
			return java_class_identifier_expression_sempred((Java_class_identifier_expressionContext)_localctx, predIndex);
		case 180: 
			return csharp_expression_sempred((Csharp_expressionContext)_localctx, predIndex);
		case 185: 
			return csharp_arguments_sempred((Csharp_argumentsContext)_localctx, predIndex);
		case 188: 
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
			return precpred(_ctx, 36);
		case 3: 
			return precpred(_ctx, 35);
		case 4: 
			return precpred(_ctx, 34);
		case 5: 
			return precpred(_ctx, 33);
		case 6: 
			return precpred(_ctx, 32);
		case 7: 
			return precpred(_ctx, 31);
		case 8: 
			return precpred(_ctx, 30);
		case 9: 
			return precpred(_ctx, 29);
		case 10: 
			return precpred(_ctx, 28);
		case 11: 
			return precpred(_ctx, 25);
		case 12: 
			return precpred(_ctx, 24);
		case 13: 
			return precpred(_ctx, 23);
		case 14: 
			return precpred(_ctx, 22);
		case 15: 
			return precpred(_ctx, 21);
		case 16: 
			return precpred(_ctx, 20);
		case 17: 
			return precpred(_ctx, 18);
		case 18: 
			return precpred(_ctx, 17);
		case 19: 
			return precpred(_ctx, 16);
		case 20: 
			return precpred(_ctx, 15);
		case 21: 
			return precpred(_ctx, 14);
		case 22: 
			return precpred(_ctx, 13);
		case 23: 
			return precpred(_ctx, 12);
		case 24: 
			return precpred(_ctx, 11);
		case 25: 
			return precpred(_ctx, 27);
		case 26: 
			return precpred(_ctx, 26);
		case 27: 
			return precpred(_ctx, 19);
		}
		return true;
	}
	private boolean unresolved_expression_sempred(Unresolved_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 28: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean unresolved_selector_sempred(Unresolved_selectorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 29: 
			return this.wasNot(EParser.WS);
		}
		return true;
	}
	private boolean invocation_trailer_sempred(Invocation_trailerContext _localctx, int predIndex) {
		switch (predIndex) {
		case 30: 
			return this.willBe(EParser.LF);
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
			return this.wasNot(EParser.WS);
		case 33: 
			return this.wasNot(EParser.WS);
		case 34: 
			return this.wasNot(EParser.WS);
		}
		return true;
	}
	private boolean argument_assignment_list_sempred(Argument_assignment_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 35: 
			return this.was(EParser.WS);
		}
		return true;
	}
	private boolean with_argument_assignment_list_sempred(With_argument_assignment_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 36: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean child_instance_sempred(Child_instanceContext _localctx, int predIndex) {
		switch (predIndex) {
		case 37: 
			return this.wasNot(EParser.WS);
		case 38: 
			return this.wasNot(EParser.WS);
		}
		return true;
	}
	private boolean declarations_sempred(DeclarationsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 39: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean native_symbol_list_sempred(Native_symbol_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 40: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean category_symbol_list_sempred(Category_symbol_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 41: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean symbol_list_sempred(Symbol_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 42: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_list_sempred(Expression_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 43: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean typedef_sempred(TypedefContext _localctx, int predIndex) {
		switch (predIndex) {
		case 44: 
			return precpred(_ctx, 3);
		case 45: 
			return precpred(_ctx, 2);
		case 46: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean type_identifier_list_sempred(Type_identifier_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 47: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean argument_list_sempred(Argument_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 48: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean any_type_sempred(Any_typeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 49: 
			return precpred(_ctx, 2);
		case 50: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean member_method_declaration_list_sempred(Member_method_declaration_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 51: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean native_member_method_declaration_list_sempred(Native_member_method_declaration_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 52: 
			return precpred(_ctx, 1);
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
	private boolean variable_identifier_list_sempred(Variable_identifier_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 54: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean native_statement_list_sempred(Native_statement_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 55: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean statement_list_sempred(Statement_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 56: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean assertion_list_sempred(Assertion_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 57: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean switch_case_statement_list_sempred(Switch_case_statement_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 58: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean catch_statement_list_sempred(Catch_statement_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 59: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean literal_list_literal_sempred(Literal_list_literalContext _localctx, int predIndex) {
		switch (predIndex) {
		case 60: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_tuple_sempred(Expression_tupleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 61: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean dict_entry_list_sempred(Dict_entry_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 62: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean assignable_instance_sempred(Assignable_instanceContext _localctx, int predIndex) {
		switch (predIndex) {
		case 63: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean is_expression_sempred(Is_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 64: 
			return this.willBeAOrAn();
		}
		return true;
	}
	private boolean key_token_sempred(Key_tokenContext _localctx, int predIndex) {
		switch (predIndex) {
		case 65: 
			return this.isText(((Key_tokenContext)_localctx).i1,"key");
		}
		return true;
	}
	private boolean value_token_sempred(Value_tokenContext _localctx, int predIndex) {
		switch (predIndex) {
		case 66: 
			return this.isText(((Value_tokenContext)_localctx).i1,"value");
		}
		return true;
	}
	private boolean symbols_token_sempred(Symbols_tokenContext _localctx, int predIndex) {
		switch (predIndex) {
		case 67: 
			return this.isText(((Symbols_tokenContext)_localctx).i1,"symbols");
		}
		return true;
	}
	private boolean javascript_expression_sempred(Javascript_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 68: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean javascript_arguments_sempred(Javascript_argumentsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 69: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean python_expression_sempred(Python_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 70: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean python_ordinal_argument_list_sempred(Python_ordinal_argument_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 71: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean python_named_argument_list_sempred(Python_named_argument_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 72: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean python_identifier_expression_sempred(Python_identifier_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 73: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean java_expression_sempred(Java_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 74: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean java_arguments_sempred(Java_argumentsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 75: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean java_identifier_expression_sempred(Java_identifier_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 76: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean java_class_identifier_expression_sempred(Java_class_identifier_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 77: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean csharp_expression_sempred(Csharp_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 78: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean csharp_arguments_sempred(Csharp_argumentsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 79: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean csharp_identifier_expression_sempred(Csharp_identifier_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 80: 
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u009b\u0861\4\2\t"+
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
		"\4\u00c0\t\u00c0\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u0187\n\2\3\2\3\2\3\2\3\2"+
		"\3\2\5\2\u018e\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5\u01ac"+
		"\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u01b4\n\6\3\7\3\7\3\7\3\7\3\7\5\7\u01bb"+
		"\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u01c6\n\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\5\7\u01cf\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\5\b\u01de\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u01e7\n\b\3\t\3"+
		"\t\3\t\3\t\3\t\5\t\u01ee\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u01f8"+
		"\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\5\r\u021e\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\5\r\u022c\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u023a\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u0248\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u025a\n\20\f\20\16"+
		"\20\u025d\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0267\n\21"+
		"\5\21\u0269\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0272\n\22\3"+
		"\22\3\22\5\22\u0276\n\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u027e\n\23"+
		"\3\23\3\23\5\23\u0282\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u0291\n\24\3\24\3\24\5\24\u0295\n\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u02b0\n\25\3\26"+
		"\3\26\3\27\3\27\3\27\5\27\u02b7\n\27\3\30\3\30\3\30\5\30\u02bc\n\30\3"+
		"\30\3\30\5\30\u02c0\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u02d1\n\31\3\32\3\32\5\32\u02d5\n"+
		"\32\3\32\5\32\u02d8\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u02f9\n\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\5\36\u030c\n\36\3\37\3\37\3\37\3\37\3\37\5\37\u0313\n\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3"+
		"!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0335\n\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\5\"\u033e\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\3#\3#\7#\u0353\n#\f#\16#\u0356\13#\3$\3$\3$\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\5%\u0365\n%\3%\3%\3%\5%\u036a\n%\3%\3%\3%\3%\3%\3%\5%\u0372"+
		"\n%\3%\3%\3%\3%\3%\3%\3%\5%\u037b\n%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u0392\n&\3\'\3\'\5\'\u0396\n\'\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\5(\u03b2\n(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\7(\u0412\n(\f(\16(\u0415\13(\3)\3)\3)\3)\3)\7)"+
		"\u041c\n)\f)\16)\u041f\13)\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3-\3-\3-\3"+
		"-\3-\7-\u0431\n-\f-\16-\u0434\13-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3."+
		"\3.\5.\u0443\n.\3/\3/\3\60\5\60\u0448\n\60\3\60\3\60\3\60\3\60\5\60\u044e"+
		"\n\60\3\60\3\60\3\60\5\60\u0453\n\60\5\60\u0455\n\60\3\60\5\60\u0458\n"+
		"\60\3\60\3\60\3\60\3\60\5\60\u045e\n\60\5\60\u0460\n\60\5\60\u0462\n\60"+
		"\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\5\65\u0480\n\65\3\66\3\66\3\66\3\66\3\66\5\66\u0487\n\66\5\66\u0489\n"+
		"\66\3\66\3\66\3\66\5\66\u048e\n\66\5\66\u0490\n\66\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\7\67\u0499\n\67\f\67\16\67\u049c\13\67\38\38\38\38\39"+
		"\39\39\39\3:\3:\3:\3:\3:\3:\3:\3:\5:\u04ae\n:\3;\3;\3;\3;\3<\7<\u04b5"+
		"\n<\f<\16<\u04b8\13<\3=\6=\u04bb\n=\r=\16=\u04bc\3>\6>\u04c0\n>\r>\16"+
		">\u04c1\3>\3>\3?\7?\u04c7\n?\f?\16?\u04ca\13?\3?\3?\3@\3@\3A\5A\u04d1"+
		"\nA\3A\3A\3A\3B\3B\3B\3B\3B\3B\3B\7B\u04dd\nB\fB\16B\u04e0\13B\3C\3C\3"+
		"C\3C\3C\5C\u04e7\nC\3D\3D\3E\3E\5E\u04ed\nE\3F\3F\3F\3F\3F\3F\3F\7F\u04f6"+
		"\nF\fF\16F\u04f9\13F\3G\3G\3G\3G\3G\3G\3G\7G\u0502\nG\fG\16G\u0505\13"+
		"G\3H\3H\3H\3H\3H\3H\7H\u050d\nH\fH\16H\u0510\13H\3I\3I\3I\3I\3I\3I\3I"+
		"\3I\3I\3I\5I\u051c\nI\3J\3J\5J\u0520\nJ\3J\3J\3K\3K\5K\u0526\nK\3K\3K"+
		"\3L\3L\3L\3L\3L\3L\7L\u0530\nL\fL\16L\u0533\13L\3M\3M\3M\3M\3M\3M\3N\3"+
		"N\3N\3N\3N\3N\3N\3N\3N\3N\3N\7N\u0546\nN\fN\16N\u0549\13N\3O\3O\5O\u054d"+
		"\nO\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\5P\u0559\nP\3Q\3Q\3R\3R\3S\3S\3T\3T"+
		"\3T\5T\u0564\nT\3U\3U\3U\3U\3U\3U\7U\u056c\nU\fU\16U\u056f\13U\3V\3V\5"+
		"V\u0573\nV\3W\3W\3W\5W\u0578\nW\3X\3X\3Y\3Y\3Z\3Z\3[\3[\3[\3[\3[\3[\7"+
		"[\u0586\n[\f[\16[\u0589\13[\3\\\3\\\5\\\u058d\n\\\3\\\5\\\u0590\n\\\3"+
		"]\3]\5]\u0594\n]\3^\3^\3^\5^\u0599\n^\3_\3_\3_\3`\3`\5`\u05a0\n`\3a\3"+
		"a\3a\3a\3a\3a\3a\3a\3a\7a\u05ab\na\fa\16a\u05ae\13a\3b\3b\3b\3b\3b\3b"+
		"\3b\7b\u05b7\nb\fb\16b\u05ba\13b\3c\3c\3c\3c\3c\5c\u05c1\nc\3d\3d\3d\3"+
		"d\3d\3d\3d\7d\u05ca\nd\fd\16d\u05cd\13d\3e\3e\5e\u05d1\ne\3f\3f\3f\3f"+
		"\3f\3f\3f\3f\3f\3f\5f\u05dd\nf\3g\3g\5g\u05e1\ng\3h\3h\3h\3h\3h\3h\7h"+
		"\u05e9\nh\fh\16h\u05ec\13h\3i\3i\3i\3j\3j\5j\u05f3\nj\3k\3k\3k\3k\5k\u05f9"+
		"\nk\3k\3k\3k\7k\u05fe\nk\fk\16k\u0601\13k\3k\3k\5k\u0605\nk\3l\3l\3l\3"+
		"l\3l\3l\7l\u060d\nl\fl\16l\u0610\13l\3m\3m\3m\3m\5m\u0616\nm\3n\3n\3n"+
		"\3n\3n\3n\3n\7n\u061f\nn\fn\16n\u0622\13n\3o\3o\3o\3o\3o\3o\3o\3o\3o\3"+
		"o\5o\u062e\no\3p\3p\5p\u0632\np\3p\5p\u0635\np\3q\3q\5q\u0639\nq\3q\5"+
		"q\u063c\nq\3r\3r\3r\3r\3r\3r\3r\7r\u0645\nr\fr\16r\u0648\13r\3s\3s\3s"+
		"\3s\3s\3s\3s\7s\u0651\ns\fs\16s\u0654\13s\3t\3t\3t\3t\3t\3t\3t\7t\u065d"+
		"\nt\ft\16t\u0660\13t\3u\3u\3u\3u\3u\3u\3u\7u\u0669\nu\fu\16u\u066c\13"+
		"u\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\5v\u067c\nv\3w\3w\3w\3w\3"+
		"w\3w\3w\3w\3w\3w\3w\3w\3w\5w\u068b\nw\3x\3x\3x\3x\3x\3x\7x\u0693\nx\f"+
		"x\16x\u0696\13x\3y\3y\3y\3y\5y\u069c\ny\3z\3z\3{\3{\3{\3{\3|\3|\5|\u06a6"+
		"\n|\3}\3}\3}\3}\3}\5}\u06ad\n}\3~\3~\5~\u06b1\n~\3~\3~\3\177\3\177\5\177"+
		"\u06b7\n\177\3\177\3\177\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080"+
		"\7\u0080\u06c1\n\u0080\f\u0080\16\u0080\u06c4\13\u0080\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\7\u0081\u06cc\n\u0081\f\u0081\16\u0081"+
		"\u06cf\13\u0081\3\u0082\3\u0082\3\u0082\3\u0082\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\5\u0083\u06de\n\u0083"+
		"\3\u0084\3\u0084\3\u0084\3\u0084\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\7\u0085\u06e9\n\u0085\f\u0085\16\u0085\u06ec\13\u0085\3\u0086\3\u0086"+
		"\3\u0086\3\u0086\5\u0086\u06f2\n\u0086\3\u0087\3\u0087\3\u0087\3\u0087"+
		"\3\u0087\3\u0087\5\u0087\u06fa\n\u0087\3\u0088\3\u0088\3\u0088\3\u0089"+
		"\3\u0089\3\u0089\3\u008a\3\u008a\3\u008a\3\u008b\3\u008b\3\u008c\3\u008c"+
		"\3\u008d\3\u008d\3\u008e\3\u008e\3\u008f\3\u008f\3\u0090\3\u0090\3\u0090"+
		"\3\u0090\3\u0090\3\u0090\3\u0090\5\u0090\u0716\n\u0090\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\7\u0091\u071d\n\u0091\f\u0091\16\u0091\u0720"+
		"\13\u0091\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\5\u0092\u0728"+
		"\n\u0092\3\u0093\3\u0093\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\5\u0094"+
		"\u0731\n\u0094\3\u0095\3\u0095\3\u0095\5\u0095\u0736\n\u0095\3\u0095\3"+
		"\u0095\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\7\u0096\u0740\n"+
		"\u0096\f\u0096\16\u0096\u0743\13\u0096\3\u0097\3\u0097\3\u0097\3\u0097"+
		"\3\u0098\3\u0098\3\u0098\3\u0098\3\u0099\3\u0099\3\u009a\3\u009a\3\u009a"+
		"\3\u009a\3\u009a\5\u009a\u0754\n\u009a\3\u009b\3\u009b\3\u009c\3\u009c"+
		"\3\u009c\5\u009c\u075b\n\u009c\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d"+
		"\7\u009d\u0762\n\u009d\f\u009d\16\u009d\u0765\13\u009d\3\u009e\3\u009e"+
		"\3\u009e\3\u009e\5\u009e\u076b\n\u009e\3\u009f\3\u009f\3\u009f\3\u009f"+
		"\3\u009f\3\u009f\5\u009f\u0773\n\u009f\3\u00a0\3\u00a0\3\u00a0\5\u00a0"+
		"\u0778\n\u00a0\3\u00a0\3\u00a0\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1"+
		"\3\u00a1\5\u00a1\u0782\n\u00a1\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2"+
		"\3\u00a2\7\u00a2\u078a\n\u00a2\f\u00a2\16\u00a2\u078d\13\u00a2\3\u00a3"+
		"\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\7\u00a3\u079a\n\u00a3\f\u00a3\16\u00a3\u079d\13\u00a3\3\u00a4"+
		"\3\u00a4\3\u00a4\3\u00a4\3\u00a5\3\u00a5\3\u00a5\5\u00a5\u07a6\n\u00a5"+
		"\3\u00a5\3\u00a5\3\u00a5\7\u00a5\u07ab\n\u00a5\f\u00a5\16\u00a5\u07ae"+
		"\13\u00a5\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\5\u00a6\u07b5\n\u00a6"+
		"\3\u00a7\3\u00a7\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8"+
		"\5\u00a8\u07c0\n\u00a8\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\7\u00a9"+
		"\u07c7\n\u00a9\f\u00a9\16\u00a9\u07ca\13\u00a9\3\u00aa\3\u00aa\3\u00aa"+
		"\3\u00aa\5\u00aa\u07d0\n\u00aa\3\u00ab\3\u00ab\3\u00ac\3\u00ac\3\u00ac"+
		"\5\u00ac\u07d7\n\u00ac\3\u00ad\3\u00ad\3\u00ad\5\u00ad\u07dc\n\u00ad\3"+
		"\u00ad\3\u00ad\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\7\u00ae"+
		"\u07e6\n\u00ae\f\u00ae\16\u00ae\u07e9\13\u00ae\3\u00af\3\u00af\3\u00af"+
		"\3\u00af\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b1\3\u00b1\3\u00b1\3\u00b1"+
		"\3\u00b1\3\u00b1\7\u00b1\u07f9\n\u00b1\f\u00b1\16\u00b1\u07fc\13\u00b1"+
		"\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\7\u00b2\u0803\n\u00b2\f\u00b2"+
		"\16\u00b2\u0806\13\u00b2\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\5\u00b3"+
		"\u080d\n\u00b3\3\u00b4\3\u00b4\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5"+
		"\3\u00b5\3\u00b5\5\u00b5\u0818\n\u00b5\3\u00b6\3\u00b6\3\u00b6\3\u00b6"+
		"\3\u00b6\7\u00b6\u081f\n\u00b6\f\u00b6\16\u00b6\u0822\13\u00b6\3\u00b7"+
		"\3\u00b7\3\u00b7\3\u00b7\5\u00b7\u0828\n\u00b7\3\u00b8\3\u00b8\3\u00b9"+
		"\3\u00b9\3\u00b9\5\u00b9\u082f\n\u00b9\3\u00ba\3\u00ba\3\u00ba\5\u00ba"+
		"\u0834\n\u00ba\3\u00ba\3\u00ba\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb"+
		"\3\u00bb\7\u00bb\u083e\n\u00bb\f\u00bb\16\u00bb\u0841\13\u00bb\3\u00bc"+
		"\3\u00bc\3\u00bc\3\u00bc\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00be\3\u00be"+
		"\3\u00be\5\u00be\u084e\n\u00be\3\u00be\3\u00be\3\u00be\7\u00be\u0853\n"+
		"\u00be\f\u00be\16\u00be\u0856\13\u00be\3\u00bf\3\u00bf\3\u00bf\3\u00bf"+
		"\3\u00bf\5\u00bf\u085d\n\u00bf\3\u00c0\3\u00c0\3\u00c0\2*\36DNPXl\u0082"+
		"\u008a\u008c\u008e\u0096\u009a\u00a8\u00b4\u00c0\u00c2\u00c6\u00d6\u00da"+
		"\u00e2\u00e4\u00e6\u00e8\u00ee\u00fe\u0100\u0108\u0120\u012a\u0138\u0142"+
		"\u0144\u0148\u0150\u015a\u0160\u0162\u016a\u0174\u017a\u00c1\2\4\6\b\n"+
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
		"\u016a\u016c\u016e\u0170\u0172\u0174\u0176\u0178\u017a\u017c\u017e\2\t"+
		"\3\2!\"\4\2{{\u0081\u0081\4\2&&hh\b\2\63;vv\u0080\u0080\u0089\u0089\u008e"+
		"\u0090\u0092\u0092\b\2\63;vv{{\u0080\u0081\u0089\u0089\u008e\u0090\7\2"+
		"\63;vv\u0080\u0080\u0089\u0089\u008e\u0092\7\2\63;vv\u0080\u0080\u0089"+
		"\u0089\u008e\u0090\u08c8\2\u0180\3\2\2\2\4\u0195\3\2\2\2\6\u01a1\3\2\2"+
		"\2\b\u01a7\3\2\2\2\n\u01ad\3\2\2\2\f\u01b5\3\2\2\2\16\u01d0\3\2\2\2\20"+
		"\u01ed\3\2\2\2\22\u01ef\3\2\2\2\24\u01ff\3\2\2\2\26\u0208\3\2\2\2\30\u0211"+
		"\3\2\2\2\32\u022d\3\2\2\2\34\u0249\3\2\2\2\36\u0252\3\2\2\2 \u0268\3\2"+
		"\2\2\"\u026a\3\2\2\2$\u0277\3\2\2\2&\u0289\3\2\2\2(\u029c\3\2\2\2*\u02b1"+
		"\3\2\2\2,\u02b3\3\2\2\2.\u02b8\3\2\2\2\60\u02d0\3\2\2\2\62\u02d7\3\2\2"+
		"\2\64\u02d9\3\2\2\2\66\u02e2\3\2\2\28\u02eb\3\2\2\2:\u030b\3\2\2\2<\u030d"+
		"\3\2\2\2>\u031b\3\2\2\2@\u0324\3\2\2\2B\u032b\3\2\2\2D\u033f\3\2\2\2F"+
		"\u0357\3\2\2\2H\u035a\3\2\2\2J\u0391\3\2\2\2L\u0393\3\2\2\2N\u03b1\3\2"+
		"\2\2P\u0416\3\2\2\2R\u0420\3\2\2\2T\u0424\3\2\2\2V\u0429\3\2\2\2X\u042b"+
		"\3\2\2\2Z\u0442\3\2\2\2\\\u0444\3\2\2\2^\u0461\3\2\2\2`\u0463\3\2\2\2"+
		"b\u0467\3\2\2\2d\u046c\3\2\2\2f\u0470\3\2\2\2h\u0478\3\2\2\2j\u048f\3"+
		"\2\2\2l\u0491\3\2\2\2n\u049d\3\2\2\2p\u04a1\3\2\2\2r\u04ad\3\2\2\2t\u04af"+
		"\3\2\2\2v\u04b6\3\2\2\2x\u04ba\3\2\2\2z\u04bf\3\2\2\2|\u04c8\3\2\2\2~"+
		"\u04cd\3\2\2\2\u0080\u04d0\3\2\2\2\u0082\u04d5\3\2\2\2\u0084\u04e6\3\2"+
		"\2\2\u0086\u04e8\3\2\2\2\u0088\u04ec\3\2\2\2\u008a\u04ee\3\2\2\2\u008c"+
		"\u04fa\3\2\2\2\u008e\u0506\3\2\2\2\u0090\u051b\3\2\2\2\u0092\u051d\3\2"+
		"\2\2\u0094\u0523\3\2\2\2\u0096\u0529\3\2\2\2\u0098\u0534\3\2\2\2\u009a"+
		"\u053a\3\2\2\2\u009c\u054c\3\2\2\2\u009e\u0558\3\2\2\2\u00a0\u055a\3\2"+
		"\2\2\u00a2\u055c\3\2\2\2\u00a4\u055e\3\2\2\2\u00a6\u0563\3\2\2\2\u00a8"+
		"\u0565\3\2\2\2\u00aa\u0572\3\2\2\2\u00ac\u0577\3\2\2\2\u00ae\u0579\3\2"+
		"\2\2\u00b0\u057b\3\2\2\2\u00b2\u057d\3\2\2\2\u00b4\u057f\3\2\2\2\u00b6"+
		"\u058f\3\2\2\2\u00b8\u0593\3\2\2\2\u00ba\u0595\3\2\2\2\u00bc\u059a\3\2"+
		"\2\2\u00be\u059f\3\2\2\2\u00c0\u05a1\3\2\2\2\u00c2\u05af\3\2\2\2\u00c4"+
		"\u05c0\3\2\2\2\u00c6\u05c2\3\2\2\2\u00c8\u05d0\3\2\2\2\u00ca\u05dc\3\2"+
		"\2\2\u00cc\u05de\3\2\2\2\u00ce\u05e2\3\2\2\2\u00d0\u05ed\3\2\2\2\u00d2"+
		"\u05f0\3\2\2\2\u00d4\u05f4\3\2\2\2\u00d6\u0606\3\2\2\2\u00d8\u0615\3\2"+
		"\2\2\u00da\u0617\3\2\2\2\u00dc\u062d\3\2\2\2\u00de\u062f\3\2\2\2\u00e0"+
		"\u0636\3\2\2\2\u00e2\u063d\3\2\2\2\u00e4\u0649\3\2\2\2\u00e6\u0655\3\2"+
		"\2\2\u00e8\u0661\3\2\2\2\u00ea\u067b\3\2\2\2\u00ec\u068a\3\2\2\2\u00ee"+
		"\u068c\3\2\2\2\u00f0\u069b\3\2\2\2\u00f2\u069d\3\2\2\2\u00f4\u069f\3\2"+
		"\2\2\u00f6\u06a5\3\2\2\2\u00f8\u06ac\3\2\2\2\u00fa\u06ae\3\2\2\2\u00fc"+
		"\u06b4\3\2\2\2\u00fe\u06ba\3\2\2\2\u0100\u06c5\3\2\2\2\u0102\u06d0\3\2"+
		"\2\2\u0104\u06dd\3\2\2\2\u0106\u06df\3\2\2\2\u0108\u06e3\3\2\2\2\u010a"+
		"\u06f1\3\2\2\2\u010c\u06f9\3\2\2\2\u010e\u06fb\3\2\2\2\u0110\u06fe\3\2"+
		"\2\2\u0112\u0701\3\2\2\2\u0114\u0704\3\2\2\2\u0116\u0706\3\2\2\2\u0118"+
		"\u0708\3\2\2\2\u011a\u070a\3\2\2\2\u011c\u070c\3\2\2\2\u011e\u0715\3\2"+
		"\2\2\u0120\u0717\3\2\2\2\u0122\u0727\3\2\2\2\u0124\u0729\3\2\2\2\u0126"+
		"\u0730\3\2\2\2\u0128\u0732\3\2\2\2\u012a\u0739\3\2\2\2\u012c\u0744\3\2"+
		"\2\2\u012e\u0748\3\2\2\2\u0130\u074c\3\2\2\2\u0132\u0753\3\2\2\2\u0134"+
		"\u0755\3\2\2\2\u0136\u075a\3\2\2\2\u0138\u075c\3\2\2\2\u013a\u076a\3\2"+
		"\2\2\u013c\u0772\3\2\2\2\u013e\u0774\3\2\2\2\u0140\u0781\3\2\2\2\u0142"+
		"\u0783\3\2\2\2\u0144\u078e\3\2\2\2\u0146\u079e\3\2\2\2\u0148\u07a5\3\2"+
		"\2\2\u014a\u07b4\3\2\2\2\u014c\u07b6\3\2\2\2\u014e\u07bf\3\2\2\2\u0150"+
		"\u07c1\3\2\2\2\u0152\u07cf\3\2\2\2\u0154\u07d1\3\2\2\2\u0156\u07d6\3\2"+
		"\2\2\u0158\u07d8\3\2\2\2\u015a\u07df\3\2\2\2\u015c\u07ea\3\2\2\2\u015e"+
		"\u07ee\3\2\2\2\u0160\u07f2\3\2\2\2\u0162\u07fd\3\2\2\2\u0164\u080c\3\2"+
		"\2\2\u0166\u080e\3\2\2\2\u0168\u0817\3\2\2\2\u016a\u0819\3\2\2\2\u016c"+
		"\u0827\3\2\2\2\u016e\u0829\3\2\2\2\u0170\u082e\3\2\2\2\u0172\u0830\3\2"+
		"\2\2\u0174\u0837\3\2\2\2\u0176\u0842\3\2\2\2\u0178\u0846\3\2\2\2\u017a"+
		"\u084d\3\2\2\2\u017c\u085c\3\2\2\2\u017e\u085e\3\2\2\2\u0180\u0181\7Q"+
		"\2\2\u0181\u0182\5\u00b0Y\2\u0182\u0183\7D\2\2\u0183\u0186\7W\2\2\u0184"+
		"\u0187\7K\2\2\u0185\u0187\5\u00b0Y\2\u0186\u0184\3\2\2\2\u0186\u0185\3"+
		"\2\2\2\u0187\u018d\3\2\2\2\u0188\u0189\5 \21\2\u0189\u018a\7\22\2\2\u018a"+
		"\u018b\7B\2\2\u018b\u018e\3\2\2\2\u018c\u018e\7\u0085\2\2\u018d\u0188"+
		"\3\2\2\2\u018d\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0190\5\u0112\u008a"+
		"\2\u0190\u0191\7\20\2\2\u0191\u0192\5z>\2\u0192\u0193\5\u008cG\2\u0193"+
		"\u0194\5|?\2\u0194\3\3\2\2\2\u0195\u0196\7Q\2\2\u0196\u0197\5\u00b0Y\2"+
		"\u0197\u0198\7D\2\2\u0198\u0199\7W\2\2\u0199\u019a\5\u009eP\2\u019a\u019b"+
		"\7\u0085\2\2\u019b\u019c\5\u0112\u008a\2\u019c\u019d\7\20\2\2\u019d\u019e"+
		"\5z>\2\u019e\u019f\5\u008aF\2\u019f\u01a0\5|?\2\u01a0\5\3\2\2\2\u01a1"+
		"\u01a2\5\u00b2Z\2\u01a2\u01a3\7\u0085\2\2\u01a3\u01a4\5N(\2\u01a4\u01a5"+
		"\7D\2\2\u01a5\u01a6\5\u0110\u0089\2\u01a6\7\3\2\2\2\u01a7\u01a8\5\u00b2"+
		"Z\2\u01a8\u01ab\5l\67\2\u01a9\u01aa\7B\2\2\u01aa\u01ac\5n8\2\u01ab\u01a9"+
		"\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\t\3\2\2\2\u01ad\u01ae\7Q\2\2\u01ae"+
		"\u01af\5\u00aeX\2\u01af\u01b0\7D\2\2\u01b0\u01b1\5\u009aN\2\u01b1\u01b3"+
		"\7F\2\2\u01b2\u01b4\5\u0090I\2\u01b3\u01b2\3\2\2\2\u01b3\u01b4\3\2\2\2"+
		"\u01b4\13\3\2\2\2\u01b5\u01b6\7Q\2\2\u01b6\u01b7\5\u00b0Y\2\u01b7\u01ba"+
		"\7D\2\2\u01b8\u01bb\7K\2\2\u01b9\u01bb\5\20\t\2\u01ba\u01b8\3\2\2\2\u01ba"+
		"\u01b9\3\2\2\2\u01bb\u01ce\3\2\2\2\u01bc\u01c5\5 \21\2\u01bd\u01be\7\22"+
		"\2\2\u01be\u01bf\7B\2\2\u01bf\u01c0\7g\2\2\u01c0\u01c1\7\20\2\2\u01c1"+
		"\u01c2\5z>\2\u01c2\u01c3\5\u00c2b\2\u01c3\u01c4\5|?\2\u01c4\u01c6\3\2"+
		"\2\2\u01c5\u01bd\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01cf\3\2\2\2\u01c7"+
		"\u01c8\7\u0085\2\2\u01c8\u01c9\7g\2\2\u01c9\u01ca\7\20\2\2\u01ca\u01cb"+
		"\5z>\2\u01cb\u01cc\5\u00c2b\2\u01cc\u01cd\5|?\2\u01cd\u01cf\3\2\2\2\u01ce"+
		"\u01bc\3\2\2\2\u01ce\u01c7\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\r\3\2\2\2"+
		"\u01d0\u01d1\7Q\2\2\u01d1\u01d2\5\u00b0Y\2\u01d2\u01d3\7D\2\2\u01d3\u01e6"+
		"\7}\2\2\u01d4\u01dd\5 \21\2\u01d5\u01d6\7\22\2\2\u01d6\u01d7\7B\2\2\u01d7"+
		"\u01d8\7g\2\2\u01d8\u01d9\7\20\2\2\u01d9\u01da\5z>\2\u01da\u01db\5\u00c2"+
		"b\2\u01db\u01dc\5|?\2\u01dc\u01de\3\2\2\2\u01dd\u01d5\3\2\2\2\u01dd\u01de"+
		"\3\2\2\2\u01de\u01e7\3\2\2\2\u01df\u01e0\7\u0085\2\2\u01e0\u01e1\7g\2"+
		"\2\u01e1\u01e2\7\20\2\2\u01e2\u01e3\5z>\2\u01e3\u01e4\5\u00c2b\2\u01e4"+
		"\u01e5\5|?\2\u01e5\u01e7\3\2\2\2\u01e6\u01d4\3\2\2\2\u01e6\u01df\3\2\2"+
		"\2\u01e6\u01e7\3\2\2\2\u01e7\17\3\2\2\2\u01e8\u01ee\5\u00a8U\2\u01e9\u01ea"+
		"\5\u00a8U\2\u01ea\u01eb\7B\2\2\u01eb\u01ec\5\u00b0Y\2\u01ec\u01ee\3\2"+
		"\2\2\u01ed\u01e8\3\2\2\2\u01ed\u01e9\3\2\2\2\u01ee\21\3\2\2\2\u01ef\u01f0"+
		"\7Q\2\2\u01f0\u01f1\5\u010c\u0087\2\u01f1\u01f2\7D\2\2\u01f2\u01f3\7q"+
		"\2\2\u01f3\u01f4\7w\2\2\u01f4\u01f7\5\u00b8]\2\u01f5\u01f6\7z\2\2\u01f6"+
		"\u01f8\5\u009aN\2\u01f7\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01f9"+
		"\3\2\2\2\u01f9\u01fa\7S\2\2\u01fa\u01fb\7\20\2\2\u01fb\u01fc\5z>\2\u01fc"+
		"\u01fd\5\u00e2r\2\u01fd\u01fe\5|?\2\u01fe\23\3\2\2\2\u01ff\u0200\7Q\2"+
		"\2\u0200\u0201\5\u00aeX\2\u0201\u0202\7|\2\2\u0202\u0203\7S\2\2\u0203"+
		"\u0204\7\20\2\2\u0204\u0205\5z>\2\u0205\u0206\5\u00e2r\2\u0206\u0207\5"+
		"|?\2\u0207\25\3\2\2\2\u0208\u0209\7Q\2\2\u0209\u020a\5\u00aeX\2\u020a"+
		"\u020b\7`\2\2\u020b\u020c\7S\2\2\u020c\u020d\7\20\2\2\u020d\u020e\5z>"+
		"\2\u020e\u020f\5\u00e2r\2\u020f\u0210\5|?\2\u0210\27\3\2\2\2\u0211\u0212"+
		"\7Q\2\2\u0212\u0213\5\u00b0Y\2\u0213\u0214\7D\2\2\u0214\u0215\7j\2\2\u0215"+
		"\u021d\7K\2\2\u0216\u0217\5 \21\2\u0217\u0218\7\22\2\2\u0218\u0219\7B"+
		"\2\2\u0219\u021a\7H\2\2\u021a\u021e\3\2\2\2\u021b\u021c\7\u0085\2\2\u021c"+
		"\u021e\7H\2\2\u021d\u0216\3\2\2\2\u021d\u021b\3\2\2\2\u021e\u021f\3\2"+
		"\2\2\u021f\u0220\7\20\2\2\u0220\u0221\5z>\2\u0221\u0222\5\34\17\2\u0222"+
		"\u022b\5|?\2\u0223\u0224\5x=\2\u0224\u0225\7B\2\2\u0225\u0226\7g\2\2\u0226"+
		"\u0227\7\20\2\2\u0227\u0228\5z>\2\u0228\u0229\5\u00c6d\2\u0229\u022a\5"+
		"|?\2\u022a\u022c\3\2\2\2\u022b\u0223\3\2\2\2\u022b\u022c\3\2\2\2\u022c"+
		"\31\3\2\2\2\u022d\u022e\7Q\2\2\u022e\u022f\5\u00b0Y\2\u022f\u0230\7D\2"+
		"\2\u0230\u0231\7j\2\2\u0231\u0239\7x\2\2\u0232\u0233\5 \21\2\u0233\u0234"+
		"\7\22\2\2\u0234\u0235\7B\2\2\u0235\u0236\7H\2\2\u0236\u023a\3\2\2\2\u0237"+
		"\u0238\7\u0085\2\2\u0238\u023a\7H\2\2\u0239\u0232\3\2\2\2\u0239\u0237"+
		"\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u023c\7\20\2\2\u023c\u023d\5z>\2\u023d"+
		"\u023e\5\34\17\2\u023e\u0247\5|?\2\u023f\u0240\5x=\2\u0240\u0241\7B\2"+
		"\2\u0241\u0242\7g\2\2\u0242\u0243\7\20\2\2\u0243\u0244\5z>\2\u0244\u0245"+
		"\5\u00c6d\2\u0245\u0246\5|?\2\u0246\u0248\3\2\2\2\u0247\u023f\3\2\2\2"+
		"\u0247\u0248\3\2\2\2\u0248\33\3\2\2\2\u0249\u024a\7Q\2\2\u024a\u024b\7"+
		"K\2\2\u024b\u024c\7H\2\2\u024c\u024d\7D\2\2\u024d\u024e\7\20\2\2\u024e"+
		"\u024f\5z>\2\u024f\u0250\5\36\20\2\u0250\u0251\5|?\2\u0251\35\3\2\2\2"+
		"\u0252\u0253\b\20\1\2\u0253\u0254\5\u00caf\2\u0254\u025b\3\2\2\2\u0255"+
		"\u0256\f\3\2\2\u0256\u0257\5x=\2\u0257\u0258\5\u00caf\2\u0258\u025a\3"+
		"\2\2\2\u0259\u0255\3\2\2\2\u025a\u025d\3\2\2\2\u025b\u0259\3\2\2\2\u025b"+
		"\u025c\3\2\2\2\u025c\37\3\2\2\2\u025d\u025b\3\2\2\2\u025e\u025f\7\u0085"+
		"\2\2\u025f\u0260\7F\2\2\u0260\u0269\5\u00aeX\2\u0261\u0262\7\u0085\2\2"+
		"\u0262\u0263\7G\2\2\u0263\u0266\5\u00d6l\2\u0264\u0265\7B\2\2\u0265\u0267"+
		"\5\u00aeX\2\u0266\u0264\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u0269\3\2\2"+
		"\2\u0268\u025e\3\2\2\2\u0268\u0261\3\2\2\2\u0269!\3\2\2\2\u026a\u026b"+
		"\7Q\2\2\u026b\u026c\5\u00aaV\2\u026c\u026d\7D\2\2\u026d\u026e\7?\2\2\u026e"+
		"\u0271\7f\2\2\u026f\u0270\7w\2\2\u0270\u0272\5,\27\2\u0271\u026f\3\2\2"+
		"\2\u0271\u0272\3\2\2\2\u0272\u0275\3\2\2\2\u0273\u0274\7z\2\2\u0274\u0276"+
		"\5\u009aN\2\u0275\u0273\3\2\2\2\u0275\u0276\3\2\2\2\u0276#\3\2\2\2\u0277"+
		"\u0278\7Q\2\2\u0278\u0279\5\u00aaV\2\u0279\u027a\7D\2\2\u027a\u027d\7"+
		"f\2\2\u027b\u027c\7w\2\2\u027c\u027e\5,\27\2\u027d\u027b\3\2\2\2\u027d"+
		"\u027e\3\2\2\2\u027e\u0281\3\2\2\2\u027f\u0280\7z\2\2\u0280\u0282\5\u009a"+
		"N\2\u0281\u027f\3\2\2\2\u0281\u0282\3\2\2\2\u0282\u0283\3\2\2\2\u0283"+
		"\u0284\7S\2\2\u0284\u0285\7\20\2\2\u0285\u0286\5z>\2\u0286\u0287\5\u00e2"+
		"r\2\u0287\u0288\5|?\2\u0288%\3\2\2\2\u0289\u028a\7Q\2\2\u028a\u028b\5"+
		"\u00aaV\2\u028b\u028c\7D\2\2\u028c\u028d\7j\2\2\u028d\u0290\7f\2\2\u028e"+
		"\u028f\7w\2\2\u028f\u0291\5,\27\2\u0290\u028e\3\2\2\2\u0290\u0291\3\2"+
		"\2\2\u0291\u0294\3\2\2\2\u0292\u0293\7z\2\2\u0293\u0295\5\u00be`\2\u0294"+
		"\u0292\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0296\3\2\2\2\u0296\u0297\7S"+
		"\2\2\u0297\u0298\7\20\2\2\u0298\u0299\5z>\2\u0299\u029a\5\u00dan\2\u029a"+
		"\u029b\5|?\2\u029b\'\3\2\2\2\u029c\u029d\7Q\2\2\u029d\u029e\7\u0093\2"+
		"\2\u029e\u029f\7D\2\2\u029f\u02a0\7\u0080\2\2\u02a0\u02a1\7f\2\2\u02a1"+
		"\u02a2\7S\2\2\u02a2\u02a3\7\20\2\2\u02a3\u02a4\5z>\2\u02a4\u02a5\5\u00e2"+
		"r\2\u02a5\u02a6\5|?\2\u02a6\u02a7\5x=\2\u02a7\u02a8\7B\2\2\u02a8\u02af"+
		"\7Z\2\2\u02a9\u02aa\7\20\2\2\u02aa\u02ab\5z>\2\u02ab\u02ac\5\u00e4s\2"+
		"\u02ac\u02ad\5|?\2\u02ad\u02b0\3\2\2\2\u02ae\u02b0\5\u00b2Z\2\u02af\u02a9"+
		"\3\2\2\2\u02af\u02ae\3\2\2\2\u02b0)\3\2\2\2\u02b1\u02b2\5N(\2\u02b2+\3"+
		"\2\2\2\u02b3\u02b6\5\u00b4[\2\u02b4\u02b5\7B\2\2\u02b5\u02b7\5\u00b6\\"+
		"\2\u02b6\u02b4\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7-\3\2\2\2\u02b8\u02b9"+
		"\5\u00be`\2\u02b9\u02bb\5\u00aeX\2\u02ba\u02bc\5 \21\2\u02bb\u02ba\3\2"+
		"\2\2\u02bb\u02bc\3\2\2\2\u02bc\u02bf\3\2\2\2\u02bd\u02be\7,\2\2\u02be"+
		"\u02c0\5\u00f6|\2\u02bf\u02bd\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0/\3\2\2"+
		"\2\u02c1\u02d1\5p9\2\u02c2\u02d1\5\62\32\2\u02c3\u02d1\5t;\2\u02c4\u02d1"+
		"\5L\'\2\u02c5\u02d1\5B\"\2\u02c6\u02d1\58\35\2\u02c7\u02d1\5<\37\2\u02c8"+
		"\u02d1\5@!\2\u02c9\u02d1\5> \2\u02ca\u02d1\5F$\2\u02cb\u02d1\5H%\2\u02cc"+
		"\u02d1\5b\62\2\u02cd\u02d1\5\64\33\2\u02ce\u02d1\5\66\34\2\u02cf\u02d1"+
		"\5$\23\2\u02d0\u02c1\3\2\2\2\u02d0\u02c2\3\2\2\2\u02d0\u02c3\3\2\2\2\u02d0"+
		"\u02c4\3\2\2\2\u02d0\u02c5\3\2\2\2\u02d0\u02c6\3\2\2\2\u02d0\u02c7\3\2"+
		"\2\2\u02d0\u02c8\3\2\2\2\u02d0\u02c9\3\2\2\2\u02d0\u02ca\3\2\2\2\u02d0"+
		"\u02cb\3\2\2\2\u02d0\u02cc\3\2\2\2\u02d0\u02cd\3\2\2\2\u02d0\u02ce\3\2"+
		"\2\2\u02d0\u02cf\3\2\2\2\u02d1\61\3\2\2\2\u02d2\u02d4\5P)\2\u02d3\u02d5"+
		"\5j\66\2\u02d4\u02d3\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5\u02d8\3\2\2\2\u02d6"+
		"\u02d8\5T+\2\u02d7\u02d2\3\2\2\2\u02d7\u02d6\3\2\2\2\u02d8\63\3\2\2\2"+
		"\u02d9\u02da\7\u0085\2\2\u02da\u02db\5\u0106\u0084\2\u02db\u02dc\7\22"+
		"\2\2\u02dc\u02dd\7R\2\2\u02dd\u02de\7\20\2\2\u02de\u02df\5z>\2\u02df\u02e0"+
		"\5\u00e2r\2\u02e0\u02e1\5|?\2\u02e1\65\3\2\2\2\u02e2\u02e3\7\u0085\2\2"+
		"\u02e3\u02e4\5\u00b0Y\2\u02e4\u02e5\7\22\2\2\u02e5\u02e6\7R\2\2\u02e6"+
		"\u02e7\7\20\2\2\u02e7\u02e8\5z>\2\u02e8\u02e9\5\u00e2r\2\u02e9\u02ea\5"+
		"|?\2\u02ea\67\3\2\2\2\u02eb\u02ec\7\177\2\2\u02ec\u02ed\7o\2\2\u02ed\u02ee"+
		"\5N(\2\u02ee\u02ef\7\20\2\2\u02ef\u02f0\5z>\2\u02f0\u02f8\5\u00e6t\2\u02f1"+
		"\u02f2\5x=\2\u02f2\u02f3\7s\2\2\u02f3\u02f4\7\20\2\2\u02f4\u02f5\5z>\2"+
		"\u02f5\u02f6\5\u00e2r\2\u02f6\u02f7\5|?\2\u02f7\u02f9\3\2\2\2\u02f8\u02f1"+
		"\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa\u02fb\5|?\2\u02fb"+
		"9\3\2\2\2\u02fc\u02fd\7\u0086\2\2\u02fd\u02fe\5\u00ecw\2\u02fe\u02ff\7"+
		"\20\2\2\u02ff\u0300\5z>\2\u0300\u0301\5\u00e2r\2\u0301\u0302\5|?\2\u0302"+
		"\u030c\3\2\2\2\u0303\u0304\7\u0086\2\2\u0304\u0305\7b\2\2\u0305\u0306"+
		"\5\u00eav\2\u0306\u0307\7\20\2\2\u0307\u0308\5z>\2\u0308\u0309\5\u00e2"+
		"r\2\u0309\u030a\5|?\2\u030a\u030c\3\2\2\2\u030b\u02fc\3\2\2\2\u030b\u0303"+
		"\3\2\2\2\u030c;\3\2\2\2\u030d\u030e\7^\2\2\u030e\u030f\7T\2\2\u030f\u0312"+
		"\5\u00aeX\2\u0310\u0311\7\22\2\2\u0311\u0313\5\u00aeX\2\u0312\u0310\3"+
		"\2\2\2\u0312\u0313\3\2\2\2\u0313\u0314\3\2\2\2\u0314\u0315\7b\2\2\u0315"+
		"\u0316\5N(\2\u0316\u0317\7\20\2\2\u0317\u0318\5z>\2\u0318\u0319\5\u00e2"+
		"r\2\u0319\u031a\5|?\2\u031a=\3\2\2\2\u031b\u031c\7R\2\2\u031c\u031d\7"+
		"\20\2\2\u031d\u031e\5z>\2\u031e\u031f\5\u00e2r\2\u031f\u0320\5|?\2\u0320"+
		"\u0321\5x=\2\u0321\u0322\7\u0088\2\2\u0322\u0323\5N(\2\u0323?\3\2\2\2"+
		"\u0324\u0325\7\u0088\2\2\u0325\u0326\5N(\2\u0326\u0327\7\20\2\2\u0327"+
		"\u0328\5z>\2\u0328\u0329\5\u00e2r\2\u0329\u032a\5|?\2\u032aA\3\2\2\2\u032b"+
		"\u032c\7a\2\2\u032c\u032d\5N(\2\u032d\u032e\7\20\2\2\u032e\u032f\5z>\2"+
		"\u032f\u0330\5\u00e2r\2\u0330\u0334\5|?\2\u0331\u0332\5x=\2\u0332\u0333"+
		"\5D#\2\u0333\u0335\3\2\2\2\u0334\u0331\3\2\2\2\u0334\u0335\3\2\2\2\u0335"+
		"\u033d\3\2\2\2\u0336\u0337\5x=\2\u0337\u0338\7U\2\2\u0338\u0339\7\20\2"+
		"\2\u0339\u033a\5z>\2\u033a\u033b\5\u00e2r\2\u033b\u033c\5|?\2\u033c\u033e"+
		"\3\2\2\2\u033d\u0336\3\2\2\2\u033d\u033e\3\2\2\2\u033eC\3\2\2\2\u033f"+
		"\u0340\b#\1\2\u0340\u0341\7U\2\2\u0341\u0342\7a\2\2\u0342\u0343\5N(\2"+
		"\u0343\u0344\7\20\2\2\u0344\u0345\5z>\2\u0345\u0346\5\u00e2r\2\u0346\u0347"+
		"\5|?\2\u0347\u0354\3\2\2\2\u0348\u0349\f\3\2\2\u0349\u034a\5x=\2\u034a"+
		"\u034b\7U\2\2\u034b\u034c\7a\2\2\u034c\u034d\5N(\2\u034d\u034e\7\20\2"+
		"\2\u034e\u034f\5z>\2\u034f\u0350\5\u00e2r\2\u0350\u0351\5|?\2\u0351\u0353"+
		"\3\2\2\2\u0352\u0348\3\2\2\2\u0353\u0356\3\2\2\2\u0354\u0352\3\2\2\2\u0354"+
		"\u0355\3\2\2\2\u0355E\3\2\2\2\u0356\u0354\3\2\2\2\u0357\u0358\7u\2\2\u0358"+
		"\u0359\5N(\2\u0359G\3\2\2\2\u035a\u035b\7\177\2\2\u035b\u035c\7o\2\2\u035c"+
		"\u035d\5\u00aeX\2\u035d\u035e\7S\2\2\u035e\u035f\7\20\2\2\u035f\u0360"+
		"\5z>\2\u0360\u0361\5\u00e2r\2\u0361\u0362\5|?\2\u0362\u0364\5v<\2\u0363"+
		"\u0365\5\u00e8u\2\u0364\u0363\3\2\2\2\u0364\u0365\3\2\2\2\u0365\u0371"+
		"\3\2\2\2\u0366\u036a\7s\2\2\u0367\u0368\7\u0086\2\2\u0368\u036a\7C\2\2"+
		"\u0369\u0366\3\2\2\2\u0369\u0367\3\2\2\2\u036a\u036b\3\2\2\2\u036b\u036c"+
		"\7\20\2\2\u036c\u036d\5z>\2\u036d\u036e\5\u00e2r\2\u036e\u036f\5|?\2\u036f"+
		"\u0370\5v<\2\u0370\u0372\3\2\2\2\u0371\u0369\3\2\2\2\u0371\u0372\3\2\2"+
		"\2\u0372\u037a\3\2\2\2\u0373\u0374\7A\2\2\u0374\u0375\7\20\2\2\u0375\u0376"+
		"\5z>\2\u0376\u0377\5\u00e2r\2\u0377\u0378\5|?\2\u0378\u0379\5v<\2\u0379"+
		"\u037b\3\2\2\2\u037a\u0373\3\2\2\2\u037a\u037b\3\2\2\2\u037b\u037c\3\2"+
		"\2\2\u037c\u037d\5v<\2\u037dI\3\2\2\2\u037e\u037f\7\u0086\2\2\u037f\u0380"+
		"\5\u00b2Z\2\u0380\u0381\7\20\2\2\u0381\u0382\5z>\2\u0382\u0383\5\u00e2"+
		"r\2\u0383\u0384\5|?\2\u0384\u0385\5v<\2\u0385\u0392\3\2\2\2\u0386\u0387"+
		"\7\u0086\2\2\u0387\u0388\7b\2\2\u0388\u0389\7\27\2\2\u0389\u038a\5\u008e"+
		"H\2\u038a\u038b\7\30\2\2\u038b\u038c\7\20\2\2\u038c\u038d\5z>\2\u038d"+
		"\u038e\5\u00e2r\2\u038e\u038f\5|?\2\u038f\u0390\5v<\2\u0390\u0392\3\2"+
		"\2\2\u0391\u037e\3\2\2\2\u0391\u0386\3\2\2\2\u0392K\3\2\2\2\u0393\u0395"+
		"\7y\2\2\u0394\u0396\5N(\2\u0395\u0394\3\2\2\2\u0395\u0396\3\2\2\2\u0396"+
		"M\3\2\2\2\u0397\u0398\b(\1\2\u0398\u0399\7\"\2\2\u0399\u03b2\5N((\u039a"+
		"\u039b\7l\2\2\u039b\u03b2\5N(\'\u039c\u039d\7=\2\2\u039d\u039e\7\20\2"+
		"\2\u039e\u03b2\5N(\f\u039f\u03b2\5X-\2\u03a0\u03b2\5P)\2\u03a1\u03a2\5"+
		"P)\2\u03a2\u03a3\5j\66\2\u03a3\u03b2\3\2\2\2\u03a4\u03a5\7Y\2\2\u03a5"+
		"\u03a6\7\20\2\2\u03a6\u03b2\5\u00aeX\2\u03a7\u03a8\7<\2\2\u03a8\u03a9"+
		"\7\20\2\2\u03a9\u03b2\5\u00aaV\2\u03aa\u03b2\5\\/\2\u03ab\u03b2\5^\60"+
		"\2\u03ac\u03b2\5f\64\2\u03ad\u03b2\5`\61\2\u03ae\u03b2\5h\65\2\u03af\u03b2"+
		"\5d\63\2\u03b0\u03b2\5T+\2\u03b1\u0397\3\2\2\2\u03b1\u039a\3\2\2\2\u03b1"+
		"\u039c\3\2\2\2\u03b1\u039f\3\2\2\2\u03b1\u03a0\3\2\2\2\u03b1\u03a1\3\2"+
		"\2\2\u03b1\u03a4\3\2\2\2\u03b1\u03a7\3\2\2\2\u03b1\u03aa\3\2\2\2\u03b1"+
		"\u03ab\3\2\2\2\u03b1\u03ac\3\2\2\2\u03b1\u03ad\3\2\2\2\u03b1\u03ae\3\2"+
		"\2\2\u03b1\u03af\3\2\2\2\u03b1\u03b0\3\2\2\2\u03b2\u0413\3\2\2\2\u03b3"+
		"\u03b4\f&\2\2\u03b4\u03b5\5\u0116\u008c\2\u03b5\u03b6\5N(\'\u03b6\u0412"+
		"\3\2\2\2\u03b7\u03b8\f%\2\2\u03b8\u03b9\5\u0118\u008d\2\u03b9\u03ba\5"+
		"N(&\u03ba\u0412\3\2\2\2\u03bb\u03bc\f$\2\2\u03bc\u03bd\5\u011c\u008f\2"+
		"\u03bd\u03be\5N(%\u03be\u0412\3\2\2\2\u03bf\u03c0\f#\2\2\u03c0\u03c1\5"+
		"\u011a\u008e\2\u03c1\u03c2\5N($\u03c2\u0412\3\2\2\2\u03c3\u03c4\f\"\2"+
		"\2\u03c4\u03c5\t\2\2\2\u03c5\u0412\5N(#\u03c6\u03c7\f!\2\2\u03c7\u03c8"+
		"\7)\2\2\u03c8\u0412\5N(\"\u03c9\u03ca\f \2\2\u03ca\u03cb\7*\2\2\u03cb"+
		"\u0412\5N(!\u03cc\u03cd\f\37\2\2\u03cd\u03ce\7\'\2\2\u03ce\u0412\5N( "+
		"\u03cf\u03d0\f\36\2\2\u03d0\u03d1\7(\2\2\u03d1\u0412\5N(\37\u03d2\u03d3"+
		"\f\33\2\2\u03d3\u03d4\7,\2\2\u03d4\u0412\5N(\34\u03d5\u03d6\f\32\2\2\u03d6"+
		"\u03d7\7+\2\2\u03d7\u0412\5N(\33\u03d8\u03d9\f\31\2\2\u03d9\u03da\7\60"+
		"\2\2\u03da\u0412\5N(\32\u03db\u03dc\f\30\2\2\u03dc\u03dd\7r\2\2\u03dd"+
		"\u0412\5N(\31\u03de\u03df\f\27\2\2\u03df\u03e0\7B\2\2\u03e0\u0412\5N("+
		"\30\u03e1\u03e2\f\26\2\2\u03e2\u03e3\7a\2\2\u03e3\u03e4\5N(\2\u03e4\u03e5"+
		"\7U\2\2\u03e5\u03e6\5N(\27\u03e6\u0412\3\2\2\2\u03e7\u03e8\f\24\2\2\u03e8"+
		"\u03e9\7b\2\2\u03e9\u0412\5N(\25\u03ea\u03eb\f\23\2\2\u03eb\u03ec\7N\2"+
		"\2\u03ec\u0412\5N(\24\u03ed\u03ee\f\22\2\2\u03ee\u03ef\7N\2\2\u03ef\u03f0"+
		"\7@\2\2\u03f0\u0412\5N(\23\u03f1\u03f2\f\21\2\2\u03f2\u03f3\7N\2\2\u03f3"+
		"\u03f4\7C\2\2\u03f4\u0412\5N(\22\u03f5\u03f6\f\20\2\2\u03f6\u03f7\7l\2"+
		"\2\u03f7\u03f8\7b\2\2\u03f8\u0412\5N(\21\u03f9\u03fa\f\17\2\2\u03fa\u03fb"+
		"\7l\2\2\u03fb\u03fc\7N\2\2\u03fc\u0412\5N(\20\u03fd\u03fe\f\16\2\2\u03fe"+
		"\u03ff\7l\2\2\u03ff\u0400\7N\2\2\u0400\u0401\7@\2\2\u0401\u0412\5N(\17"+
		"\u0402\u0403\f\r\2\2\u0403\u0404\7l\2\2\u0404\u0405\7N\2\2\u0405\u0406"+
		"\7C\2\2\u0406\u0412\5N(\16\u0407\u0408\f\35\2\2\u0408\u0409\7d\2\2\u0409"+
		"\u040a\7l\2\2\u040a\u0412\5\u010a\u0086\2\u040b\u040c\f\34\2\2\u040c\u040d"+
		"\7d\2\2\u040d\u0412\5\u010a\u0086\2\u040e\u040f\f\25\2\2\u040f\u0410\7"+
		"D\2\2\u0410\u0412\5\u00be`\2\u0411\u03b3\3\2\2\2\u0411\u03b7\3\2\2\2\u0411"+
		"\u03bb\3\2\2\2\u0411\u03bf\3\2\2\2\u0411\u03c3\3\2\2\2\u0411\u03c6\3\2"+
		"\2\2\u0411\u03c9\3\2\2\2\u0411\u03cc\3\2\2\2\u0411\u03cf\3\2\2\2\u0411"+
		"\u03d2\3\2\2\2\u0411\u03d5\3\2\2\2\u0411\u03d8\3\2\2\2\u0411\u03db\3\2"+
		"\2\2\u0411\u03de\3\2\2\2\u0411\u03e1\3\2\2\2\u0411\u03e7\3\2\2\2\u0411"+
		"\u03ea\3\2\2\2\u0411\u03ed\3\2\2\2\u0411\u03f1\3\2\2\2\u0411\u03f5\3\2"+
		"\2\2\u0411\u03f9\3\2\2\2\u0411\u03fd\3\2\2\2\u0411\u0402\3\2\2\2\u0411"+
		"\u0407\3\2\2\2\u0411\u040b\3\2\2\2\u0411\u040e\3\2\2\2\u0412\u0415\3\2"+
		"\2\2\u0413\u0411\3\2\2\2\u0413\u0414\3\2\2\2\u0414O\3\2\2\2\u0415\u0413"+
		"\3\2\2\2\u0416\u0417\b)\1\2\u0417\u0418\5\u00acW\2\u0418\u041d\3\2\2\2"+
		"\u0419\u041a\f\3\2\2\u041a\u041c\5R*\2\u041b\u0419\3\2\2\2\u041c\u041f"+
		"\3\2\2\2\u041d\u041b\3\2\2\2\u041d\u041e\3\2\2\2\u041eQ\3\2\2\2\u041f"+
		"\u041d\3\2\2\2\u0420\u0421\6*\37\3\u0421\u0422\7\24\2\2\u0422\u0423\5"+
		"\u00acW\2\u0423S\3\2\2\2\u0424\u0425\7c\2\2\u0425\u0426\7\20\2\2\u0426"+
		"\u0427\5\u00aeX\2\u0427\u0428\5V,\2\u0428U\3\2\2\2\u0429\u042a\6, \3\u042a"+
		"W\3\2\2\2\u042b\u042c\b-\1\2\u042c\u042d\5\u00f0y\2\u042d\u0432\3\2\2"+
		"\2\u042e\u042f\f\3\2\2\u042f\u0431\5Z.\2\u0430\u042e\3\2\2\2\u0431\u0434"+
		"\3\2\2\2\u0432\u0430\3\2\2\2\u0432\u0433\3\2\2\2\u0433Y\3\2\2\2\u0434"+
		"\u0432\3\2\2\2\u0435\u0436\6.\"\3\u0436\u0437\7\24\2\2\u0437\u0443\5\u00ae"+
		"X\2\u0438\u0439\6.#\3\u0439\u043a\7\27\2\2\u043a\u043b\5\u0104\u0083\2"+
		"\u043b\u043c\7\30\2\2\u043c\u0443\3\2\2\2\u043d\u043e\6.$\3\u043e\u043f"+
		"\7\27\2\2\u043f\u0440\5N(\2\u0440\u0441\7\30\2\2\u0441\u0443\3\2\2\2\u0442"+
		"\u0435\3\2\2\2\u0442\u0438\3\2\2\2\u0442\u043d\3\2\2\2\u0443[\3\2\2\2"+
		"\u0444\u0445\5\u00a4S\2\u0445]\3\2\2\2\u0446\u0448\7i\2\2\u0447\u0446"+
		"\3\2\2\2\u0447\u0448\3\2\2\2\u0448\u0449\3\2\2\2\u0449\u044a\5\u00a0Q"+
		"\2\u044a\u044b\7_\2\2\u044b\u0454\5N(\2\u044c\u044e\7\22\2\2\u044d\u044c"+
		"\3\2\2\2\u044d\u044e\3\2\2\2\u044e\u044f\3\2\2\2\u044f\u0452\5l\67\2\u0450"+
		"\u0451\7B\2\2\u0451\u0453\5n8\2\u0452\u0450\3\2\2\2\u0452\u0453\3\2\2"+
		"\2\u0453\u0455\3\2\2\2\u0454\u044d\3\2\2\2\u0454\u0455\3\2\2\2\u0455\u0462"+
		"\3\2\2\2\u0456\u0458\7i\2\2\u0457\u0456\3\2\2\2\u0457\u0458\3\2\2\2\u0458"+
		"\u0459\3\2\2\2\u0459\u045f\5\u00a0Q\2\u045a\u045d\5l\67\2\u045b\u045c"+
		"\7B\2\2\u045c\u045e\5n8\2\u045d\u045b\3\2\2\2\u045d\u045e\3\2\2\2\u045e"+
		"\u0460\3\2\2\2\u045f\u045a\3\2\2\2\u045f\u0460\3\2\2\2\u0460\u0462\3\2"+
		"\2\2\u0461\u0447\3\2\2\2\u0461\u0457\3\2\2\2\u0462_\3\2\2\2\u0463\u0464"+
		"\7v\2\2\u0464\u0465\7_\2\2\u0465\u0466\5N(\2\u0466a\3\2\2\2\u0467\u0468"+
		"\7\u0089\2\2\u0468\u0469\5N(\2\u0469\u046a\7\u0083\2\2\u046a\u046b\5N"+
		"(\2\u046bc\3\2\2\2\u046c\u046d\5P)\2\u046d\u046e\7\"\2\2\u046e\u046f\5"+
		"N(\2\u046fe\3\2\2\2\u0470\u0471\7\\\2\2\u0471\u0472\7C\2\2\u0472\u0473"+
		"\5\u00aeX\2\u0473\u0474\7_\2\2\u0474\u0475\5N(\2\u0475\u0476\7\u0087\2"+
		"\2\u0476\u0477\5N(\2\u0477g\3\2\2\2\u0478\u0479\7~\2\2\u0479\u047f\5X"+
		"-\2\u047a\u047b\7\u0085\2\2\u047b\u047c\5X-\2\u047c\u047d\7D\2\2\u047d"+
		"\u047e\5\u010e\u0088\2\u047e\u0480\3\2\2\2\u047f\u047a\3\2\2\2\u047f\u0480"+
		"\3\2\2\2\u0480i\3\2\2\2\u0481\u0482\6\66%\3\u0482\u0488\5N(\2\u0483\u0486"+
		"\5l\67\2\u0484\u0485\7B\2\2\u0485\u0487\5n8\2\u0486\u0484\3\2\2\2\u0486"+
		"\u0487\3\2\2\2\u0487\u0489\3\2\2\2\u0488\u0483\3\2\2\2\u0488\u0489\3\2"+
		"\2\2\u0489\u0490\3\2\2\2\u048a\u048d\5l\67\2\u048b\u048c\7B\2\2\u048c"+
		"\u048e\5n8\2\u048d\u048b\3\2\2\2\u048d\u048e\3\2\2\2\u048e\u0490\3\2\2"+
		"\2\u048f\u0481\3\2\2\2\u048f\u048a\3\2\2\2\u0490k\3\2\2\2\u0491\u0492"+
		"\b\67\1\2\u0492\u0493\7\u0085\2\2\u0493\u0494\5n8\2\u0494\u049a\3\2\2"+
		"\2\u0495\u0496\f\3\2\2\u0496\u0497\7\22\2\2\u0497\u0499\5n8\2\u0498\u0495"+
		"\3\2\2\2\u0499\u049c\3\2\2\2\u049a\u0498\3\2\2\2\u049a\u049b\3\2\2\2\u049b"+
		"m\3\2\2\2\u049c\u049a\3\2\2\2\u049d\u049e\5N(\2\u049e\u049f\7D\2\2\u049f"+
		"\u04a0\5\u00aeX\2\u04a0o\3\2\2\2\u04a1\u04a2\5\u0108\u0085\2\u04a2\u04a3"+
		"\5\u0114\u008b\2\u04a3\u04a4\5N(\2\u04a4q\3\2\2\2\u04a5\u04a6\6:\'\3\u04a6"+
		"\u04a7\7\24\2\2\u04a7\u04ae\5\u00aeX\2\u04a8\u04a9\6:(\3\u04a9\u04aa\7"+
		"\27\2\2\u04aa\u04ab\5N(\2\u04ab\u04ac\7\30\2\2\u04ac\u04ae\3\2\2\2\u04ad"+
		"\u04a5\3\2\2\2\u04ad\u04a8\3\2\2\2\u04aes\3\2\2\2\u04af\u04b0\5\u00d6"+
		"l\2\u04b0\u04b1\5\u0114\u008b\2\u04b1\u04b2\5N(\2\u04b2u\3\2\2\2\u04b3"+
		"\u04b5\7\7\2\2\u04b4\u04b3\3\2\2\2\u04b5\u04b8\3\2\2\2\u04b6\u04b4\3\2"+
		"\2\2\u04b6\u04b7\3\2\2\2\u04b7w\3\2\2\2\u04b8\u04b6\3\2\2\2\u04b9\u04bb"+
		"\7\7\2\2\u04ba\u04b9\3\2\2\2\u04bb\u04bc\3\2\2\2\u04bc\u04ba\3\2\2\2\u04bc"+
		"\u04bd\3\2\2\2\u04bdy\3\2\2\2\u04be\u04c0\7\7\2\2\u04bf\u04be\3\2\2\2"+
		"\u04c0\u04c1\3\2\2\2\u04c1\u04bf\3\2\2\2\u04c1\u04c2\3\2\2\2\u04c2\u04c3"+
		"\3\2\2\2\u04c3\u04c4\7\3\2\2\u04c4{\3\2\2\2\u04c5\u04c7\7\7\2\2\u04c6"+
		"\u04c5\3\2\2\2\u04c7\u04ca\3\2\2\2\u04c8\u04c6\3\2\2\2\u04c8\u04c9\3\2"+
		"\2\2\u04c9\u04cb\3\2\2\2\u04ca\u04c8\3\2\2\2\u04cb\u04cc\7\4\2\2\u04cc"+
		"}\3\2\2\2\u04cd\u04ce\7m\2\2\u04ce\177\3\2\2\2\u04cf\u04d1\5\u0082B\2"+
		"\u04d0\u04cf\3\2\2\2\u04d0\u04d1\3\2\2\2\u04d1\u04d2\3\2\2\2\u04d2\u04d3"+
		"\5v<\2\u04d3\u04d4\7\2\2\3\u04d4\u0081\3\2\2\2\u04d5\u04d6\bB\1\2\u04d6"+
		"\u04d7\5\u0084C\2\u04d7\u04de\3\2\2\2\u04d8\u04d9\f\3\2\2\u04d9\u04da"+
		"\5x=\2\u04da\u04db\5\u0084C\2\u04db\u04dd\3\2\2\2\u04dc\u04d8\3\2\2\2"+
		"\u04dd\u04e0\3\2\2\2\u04de\u04dc\3\2\2\2\u04de\u04df\3\2\2\2\u04df\u0083"+
		"\3\2\2\2\u04e0\u04de\3\2\2\2\u04e1\u04e7\5\n\6\2\u04e2\u04e7\5\u00a6T"+
		"\2\u04e3\u04e7\5\u0086D\2\u04e4\u04e7\5\u0088E\2\u04e5\u04e7\5\u00d8m"+
		"\2\u04e6\u04e1\3\2\2\2\u04e6\u04e2\3\2\2\2\u04e6\u04e3\3\2\2\2\u04e6\u04e4"+
		"\3\2\2\2\u04e6\u04e5\3\2\2\2\u04e7\u0085\3\2\2\2\u04e8\u04e9\5\32\16\2"+
		"\u04e9\u0087\3\2\2\2\u04ea\u04ed\5\2\2\2\u04eb\u04ed\5\4\3\2\u04ec\u04ea"+
		"\3\2\2\2\u04ec\u04eb\3\2\2\2\u04ed\u0089\3\2\2\2\u04ee\u04ef\bF\1\2\u04ef"+
		"\u04f0\5\6\4\2\u04f0\u04f7\3\2\2\2\u04f1\u04f2\f\3\2\2\u04f2\u04f3\5x"+
		"=\2\u04f3\u04f4\5\6\4\2\u04f4\u04f6\3\2\2\2\u04f5\u04f1\3\2\2\2\u04f6"+
		"\u04f9\3\2\2\2\u04f7\u04f5\3\2\2\2\u04f7\u04f8\3\2\2\2\u04f8\u008b\3\2"+
		"\2\2\u04f9\u04f7\3\2\2\2\u04fa\u04fb\bG\1\2\u04fb\u04fc\5\b\5\2\u04fc"+
		"\u0503\3\2\2\2\u04fd\u04fe\f\3\2\2\u04fe\u04ff\5x=\2\u04ff\u0500\5\b\5"+
		"\2\u0500\u0502\3\2\2\2\u0501\u04fd\3\2\2\2\u0502\u0505\3\2\2\2\u0503\u0501"+
		"\3\2\2\2\u0503\u0504\3\2\2\2\u0504\u008d\3\2\2\2\u0505\u0503\3\2\2\2\u0506"+
		"\u0507\bH\1\2\u0507\u0508\5\u00b2Z\2\u0508\u050e\3\2\2\2\u0509\u050a\f"+
		"\3\2\2\u050a\u050b\7\22\2\2\u050b\u050d\5\u00b2Z\2\u050c\u0509\3\2\2\2"+
		"\u050d\u0510\3\2\2\2\u050e\u050c\3\2\2\2\u050e\u050f\3\2\2\2\u050f\u008f"+
		"\3\2\2\2\u0510\u050e\3\2\2\2\u0511\u0512\7b\2\2\u0512\u051c\5\u0092J\2"+
		"\u0513\u0514\7b\2\2\u0514\u051c\5\u0094K\2\u0515\u0516\7b\2\2\u0516\u051c"+
		"\5\u0098M\2\u0517\u0518\7e\2\2\u0518\u051c\7\u0093\2\2\u0519\u051a\7e"+
		"\2\2\u051a\u051c\5N(\2\u051b\u0511\3\2\2\2\u051b\u0513\3\2\2\2\u051b\u0515"+
		"\3\2\2\2\u051b\u0517\3\2\2\2\u051b\u0519\3\2\2\2\u051c\u0091\3\2\2\2\u051d"+
		"\u051f\7\27\2\2\u051e\u0520\5\u0096L\2\u051f\u051e\3\2\2\2\u051f\u0520"+
		"\3\2\2\2\u0520\u0521\3\2\2\2\u0521\u0522\7\30\2\2\u0522\u0093\3\2\2\2"+
		"\u0523\u0525\7)\2\2\u0524\u0526\5\u0096L\2\u0525\u0524\3\2\2\2\u0525\u0526"+
		"\3\2\2\2\u0526\u0527\3\2\2\2\u0527\u0528\7\'\2\2\u0528\u0095\3\2\2\2\u0529"+
		"\u052a\bL\1\2\u052a\u052b\5N(\2\u052b\u0531\3\2\2\2\u052c\u052d\f\3\2"+
		"\2\u052d\u052e\7\22\2\2\u052e\u0530\5N(\2\u052f\u052c\3\2\2\2\u0530\u0533"+
		"\3\2\2\2\u0531\u052f\3\2\2\2\u0531\u0532\3\2\2\2\u0532\u0097\3\2\2\2\u0533"+
		"\u0531\3\2\2\2\u0534\u0535\7\27\2\2\u0535\u0536\5N(\2\u0536\u0537\7\23"+
		"\2\2\u0537\u0538\5N(\2\u0538\u0539\7\30\2\2\u0539\u0099\3\2\2\2\u053a"+
		"\u053b\bN\1\2\u053b\u053c\5\u009cO\2\u053c\u0547\3\2\2\2\u053d\u053e\f"+
		"\5\2\2\u053e\u0546\7+\2\2\u053f\u0540\f\4\2\2\u0540\u0541\7\27\2\2\u0541"+
		"\u0546\7\30\2\2\u0542\u0543\f\3\2\2\u0543\u0544\7\31\2\2\u0544\u0546\7"+
		"\32\2\2\u0545\u053d\3\2\2\2\u0545\u053f\3\2\2\2\u0545\u0542\3\2\2\2\u0546"+
		"\u0549\3\2\2\2\u0547\u0545\3\2\2\2\u0547\u0548\3\2\2\2\u0548\u009b\3\2"+
		"\2\2\u0549\u0547\3\2\2\2\u054a\u054d\5\u009eP\2\u054b\u054d\5\u00a0Q\2"+
		"\u054c\u054a\3\2\2\2\u054c\u054b\3\2\2\2\u054d\u009d\3\2\2\2\u054e\u0559"+
		"\7\63\2\2\u054f\u0559\7\64\2\2\u0550\u0559\7\65\2\2\u0551\u0559\7\66\2"+
		"\2\u0552\u0559\7\67\2\2\u0553\u0559\78\2\2\u0554\u0559\7:\2\2\u0555\u0559"+
		"\79\2\2\u0556\u0559\7;\2\2\u0557\u0559\7=\2\2\u0558\u054e\3\2\2\2\u0558"+
		"\u054f\3\2\2\2\u0558\u0550\3\2\2\2\u0558\u0551\3\2\2\2\u0558\u0552\3\2"+
		"\2\2\u0558\u0553\3\2\2\2\u0558\u0554\3\2\2\2\u0558\u0555\3\2\2\2\u0558"+
		"\u0556\3\2\2\2\u0558\u0557\3\2\2\2\u0559\u009f\3\2\2\2\u055a\u055b\7\u008f"+
		"\2\2\u055b\u00a1\3\2\2\2\u055c\u055d\7=\2\2\u055d\u00a3\3\2\2\2\u055e"+
		"\u055f\7>\2\2\u055f\u00a5\3\2\2\2\u0560\u0564\5\f\7\2\u0561\u0564\5\30"+
		"\r\2\u0562\u0564\5\16\b\2\u0563\u0560\3\2\2\2\u0563\u0561\3\2\2\2\u0563"+
		"\u0562\3\2\2\2\u0564\u00a7\3\2\2\2\u0565\u0566\bU\1\2\u0566\u0567\5\u00b0"+
		"Y\2\u0567\u056d\3\2\2\2\u0568\u0569\f\3\2\2\u0569\u056a\7\22\2\2\u056a"+
		"\u056c\5\u00b0Y\2\u056b\u0568\3\2\2\2\u056c\u056f\3\2\2\2\u056d\u056b"+
		"\3\2\2\2\u056d\u056e\3\2\2\2\u056e\u00a9\3\2\2\2\u056f\u056d\3\2\2\2\u0570"+
		"\u0573\5\u00aeX\2\u0571\u0573\5\u00b0Y\2\u0572\u0570\3\2\2\2\u0572\u0571"+
		"\3\2\2\2\u0573\u00ab\3\2\2\2\u0574\u0578\5\u00aeX\2\u0575\u0578\5\u00b0"+
		"Y\2\u0576\u0578\5\u00b2Z\2\u0577\u0574\3\2\2\2\u0577\u0575\3\2\2\2\u0577"+
		"\u0576\3\2\2\2\u0578\u00ad\3\2\2\2\u0579\u057a\7\u0090\2\2\u057a\u00af"+
		"\3\2\2\2\u057b\u057c\7\u008f\2\2\u057c\u00b1\3\2\2\2\u057d\u057e\7\u008e"+
		"\2\2\u057e\u00b3\3\2\2\2\u057f\u0580\b[\1\2\u0580\u0581\5\u00b6\\\2\u0581"+
		"\u0587\3\2\2\2\u0582\u0583\f\3\2\2\u0583\u0584\7\22\2\2\u0584\u0586\5"+
		"\u00b6\\\2\u0585\u0582\3\2\2\2\u0586\u0589\3\2\2\2\u0587\u0585\3\2\2\2"+
		"\u0587\u0588\3\2\2\2\u0588\u00b5\3\2\2\2\u0589\u0587\3\2\2\2\u058a\u0590"+
		"\5\u00bc_\2\u058b\u058d\7i\2\2\u058c\u058b\3\2\2\2\u058c\u058d\3\2\2\2"+
		"\u058d\u058e\3\2\2\2\u058e\u0590\5\u00b8]\2\u058f\u058a\3\2\2\2\u058f"+
		"\u058c\3\2\2\2\u0590\u00b7\3\2\2\2\u0591\u0594\5\u00ba^\2\u0592\u0594"+
		"\5.\30\2\u0593\u0591\3\2\2\2\u0593\u0592\3\2\2\2\u0594\u00b9\3\2\2\2\u0595"+
		"\u0598\5\u00aeX\2\u0596\u0597\7,\2\2\u0597\u0599\5\u00f6|\2\u0598\u0596"+
		"\3\2\2\2\u0598\u0599\3\2\2\2\u0599\u00bb\3\2\2\2\u059a\u059b\5\u00a2R"+
		"\2\u059b\u059c\5\u00aeX\2\u059c\u00bd\3\2\2\2\u059d\u05a0\5\u009aN\2\u059e"+
		"\u05a0\5\u00c0a\2\u059f\u059d\3\2\2\2\u059f\u059e\3\2\2\2\u05a0\u00bf"+
		"\3\2\2\2\u05a1\u05a2\ba\1\2\u05a2\u05a3\7C\2\2\u05a3\u05ac\3\2\2\2\u05a4"+
		"\u05a5\f\4\2\2\u05a5\u05a6\7\27\2\2\u05a6\u05ab\7\30\2\2\u05a7\u05a8\f"+
		"\3\2\2\u05a8\u05a9\7\31\2\2\u05a9\u05ab\7\32\2\2\u05aa\u05a4\3\2\2\2\u05aa"+
		"\u05a7\3\2\2\2\u05ab\u05ae\3\2\2\2\u05ac\u05aa\3\2\2\2\u05ac\u05ad\3\2"+
		"\2\2\u05ad\u00c1\3\2\2\2\u05ae\u05ac\3\2\2\2\u05af\u05b0\bb\1\2\u05b0"+
		"\u05b1\5\u00c4c\2\u05b1\u05b8\3\2\2\2\u05b2\u05b3\f\3\2\2\u05b3\u05b4"+
		"\5x=\2\u05b4\u05b5\5\u00c4c\2\u05b5\u05b7\3\2\2\2\u05b6\u05b2\3\2\2\2"+
		"\u05b7\u05ba\3\2\2\2\u05b8\u05b6\3\2\2\2\u05b8\u05b9\3\2\2\2\u05b9\u00c3"+
		"\3\2\2\2\u05ba\u05b8\3\2\2\2\u05bb\u05c1\5\24\13\2\u05bc\u05c1\5\26\f"+
		"\2\u05bd\u05c1\5$\23\2\u05be\u05c1\5\"\22\2\u05bf\u05c1\5\22\n\2\u05c0"+
		"\u05bb\3\2\2\2\u05c0\u05bc\3\2\2\2\u05c0\u05bd\3\2\2\2\u05c0\u05be\3\2"+
		"\2\2\u05c0\u05bf\3\2\2\2\u05c1\u00c5\3\2\2\2\u05c2\u05c3\bd\1\2\u05c3"+
		"\u05c4\5\u00c8e\2\u05c4\u05cb\3\2\2\2\u05c5\u05c6\f\3\2\2\u05c6\u05c7"+
		"\5x=\2\u05c7\u05c8\5\u00c8e\2\u05c8\u05ca\3\2\2\2\u05c9\u05c5\3\2\2\2"+
		"\u05ca\u05cd\3\2\2\2\u05cb\u05c9\3\2\2\2\u05cb\u05cc\3\2\2\2\u05cc\u00c7"+
		"\3\2\2\2\u05cd\u05cb\3\2\2\2\u05ce\u05d1\5\u00c4c\2\u05cf\u05d1\5&\24"+
		"\2\u05d0\u05ce\3\2\2\2\u05d0\u05cf\3\2\2\2\u05d1\u00c9\3\2\2\2\u05d2\u05d3"+
		"\7\n\2\2\u05d3\u05dd\5\u0162\u00b2\2\u05d4\u05d5\7\13\2\2\u05d5\u05dd"+
		"\5\u017a\u00be\2\u05d6\u05d7\7\f\2\2\u05d7\u05dd\5\u00ccg\2\u05d8\u05d9"+
		"\7\r\2\2\u05d9\u05dd\5\u00ccg\2\u05da\u05db\7\16\2\2\u05db\u05dd\5\u00d2"+
		"j\2\u05dc\u05d2\3\2\2\2\u05dc\u05d4\3\2\2\2\u05dc\u05d6\3\2\2\2\u05dc"+
		"\u05d8\3\2\2\2\u05dc\u05da\3\2\2\2\u05dd\u00cb\3\2\2\2\u05de\u05e0\5\u00ac"+
		"W\2\u05df\u05e1\5\u00ceh\2\u05e0\u05df\3\2\2\2\u05e0\u05e1\3\2\2\2\u05e1"+
		"\u00cd\3\2\2\2\u05e2\u05e3\7_\2\2\u05e3\u05e4\5\u00d0i\2\u05e4\u05e5\7"+
		"\20\2\2\u05e5\u05ea\5\u00acW\2\u05e6\u05e7\7\24\2\2\u05e7\u05e9\5\u00ac"+
		"W\2\u05e8\u05e6\3\2\2\2\u05e9\u05ec\3\2\2\2\u05ea\u05e8\3\2\2\2\u05ea"+
		"\u05eb\3\2\2\2\u05eb\u00cf\3\2\2\2\u05ec\u05ea\3\2\2\2\u05ed\u05ee\7\u0090"+
		"\2\2\u05ee\u05ef\6i\67\3\u05ef\u00d1\3\2\2\2\u05f0\u05f2\5\u00acW\2\u05f1"+
		"\u05f3\5\u00d4k\2\u05f2\u05f1\3\2\2\2\u05f2\u05f3\3\2\2\2\u05f3\u00d3"+
		"\3\2\2\2\u05f4\u05f5\7_\2\2\u05f5\u05f6\5\u00d0i\2\u05f6\u05f8\7\20\2"+
		"\2\u05f7\u05f9\7$\2\2\u05f8\u05f7\3\2\2\2\u05f8\u05f9\3\2\2\2\u05f9\u05fa"+
		"\3\2\2\2\u05fa\u05ff\5\u0134\u009b\2\u05fb\u05fc\7$\2\2\u05fc\u05fe\5"+
		"\u0134\u009b\2\u05fd\u05fb\3\2\2\2\u05fe\u0601\3\2\2\2\u05ff\u05fd\3\2"+
		"\2\2\u05ff\u0600\3\2\2\2\u0600\u0604\3\2\2\2\u0601\u05ff\3\2\2\2\u0602"+
		"\u0603\7\24\2\2\u0603\u0605\5\u0134\u009b\2\u0604\u0602\3\2\2\2\u0604"+
		"\u0605\3\2\2\2\u0605\u00d5\3\2\2\2\u0606\u0607\bl\1\2\u0607\u0608\5\u00ae"+
		"X\2\u0608\u060e\3\2\2\2\u0609\u060a\f\3\2\2\u060a\u060b\7\22\2\2\u060b"+
		"\u060d\5\u00aeX\2\u060c\u0609\3\2\2\2\u060d\u0610\3\2\2\2\u060e\u060c"+
		"\3\2\2\2\u060e\u060f\3\2\2\2\u060f\u00d7\3\2\2\2\u0610\u060e\3\2\2\2\u0611"+
		"\u0616\5\"\22\2\u0612\u0616\5$\23\2\u0613\u0616\5&\24\2\u0614\u0616\5"+
		"(\25\2\u0615\u0611\3\2\2\2\u0615\u0612\3\2\2\2\u0615\u0613\3\2\2\2\u0615"+
		"\u0614\3\2\2\2\u0616\u00d9\3\2\2\2\u0617\u0618\bn\1\2\u0618\u0619\5\u00dc"+
		"o\2\u0619\u0620\3\2\2\2\u061a\u061b\f\3\2\2\u061b\u061c\5x=\2\u061c\u061d"+
		"\5\u00dco\2\u061d\u061f\3\2\2\2\u061e\u061a\3\2\2\2\u061f\u0622\3\2\2"+
		"\2\u0620\u061e\3\2\2\2\u0620\u0621\3\2\2\2\u0621\u00db\3\2\2\2\u0622\u0620"+
		"\3\2\2\2\u0623\u0624\7\n\2\2\u0624\u062e\5\u014e\u00a8\2\u0625\u0626\7"+
		"\13\2\2\u0626\u062e\5\u0168\u00b5\2\u0627\u0628\7\f\2\2\u0628\u062e\5"+
		"\u00dep\2\u0629\u062a\7\r\2\2\u062a\u062e\5\u00dep\2\u062b\u062c\7\16"+
		"\2\2\u062c\u062e\5\u00e0q\2\u062d\u0623\3\2\2\2\u062d\u0625\3\2\2\2\u062d"+
		"\u0627\3\2\2\2\u062d\u0629\3\2\2\2\u062d\u062b\3\2\2\2\u062e\u00dd\3\2"+
		"\2\2\u062f\u0631\5\u0136\u009c\2\u0630\u0632\7\21\2\2\u0631\u0630\3\2"+
		"\2\2\u0631\u0632\3\2\2\2\u0632\u0634\3\2\2\2\u0633\u0635\5\u00ceh\2\u0634"+
		"\u0633\3\2\2\2\u0634\u0635\3\2\2\2\u0635\u00df\3\2\2\2\u0636\u0638\5\u011e"+
		"\u0090\2\u0637\u0639\7\21\2\2\u0638\u0637\3\2\2\2\u0638\u0639\3\2\2\2"+
		"\u0639\u063b\3\2\2\2\u063a\u063c\5\u00d4k\2\u063b\u063a\3\2\2\2\u063b"+
		"\u063c\3\2\2\2\u063c\u00e1\3\2\2\2\u063d\u063e\br\1\2\u063e\u063f\5\60"+
		"\31\2\u063f\u0646\3\2\2\2\u0640\u0641\f\3\2\2\u0641\u0642\5x=\2\u0642"+
		"\u0643\5\60\31\2\u0643\u0645\3\2\2\2\u0644\u0640\3\2\2\2\u0645\u0648\3"+
		"\2\2\2\u0646\u0644\3\2\2\2\u0646\u0647\3\2\2\2\u0647\u00e3\3\2\2\2\u0648"+
		"\u0646\3\2\2\2\u0649\u064a\bs\1\2\u064a\u064b\5*\26\2\u064b\u0652\3\2"+
		"\2\2\u064c\u064d\f\3\2\2\u064d\u064e\5x=\2\u064e\u064f\5*\26\2\u064f\u0651"+
		"\3\2\2\2\u0650\u064c\3\2\2\2\u0651\u0654\3\2\2\2\u0652\u0650\3\2\2\2\u0652"+
		"\u0653\3\2\2\2\u0653\u00e5\3\2\2\2\u0654\u0652\3\2\2\2\u0655\u0656\bt"+
		"\1\2\u0656\u0657\5:\36\2\u0657\u065e\3\2\2\2\u0658\u0659\f\3\2\2\u0659"+
		"\u065a\5x=\2\u065a\u065b\5:\36\2\u065b\u065d\3\2\2\2\u065c\u0658\3\2\2"+
		"\2\u065d\u0660\3\2\2\2\u065e\u065c\3\2\2\2\u065e\u065f\3\2\2\2\u065f\u00e7"+
		"\3\2\2\2\u0660\u065e\3\2\2\2\u0661\u0662\bu\1\2\u0662\u0663\5J&\2\u0663"+
		"\u066a\3\2\2\2\u0664\u0665\f\3\2\2\u0665\u0666\5x=\2\u0666\u0667\5J&\2"+
		"\u0667\u0669\3\2\2\2\u0668\u0664\3\2\2\2\u0669\u066c\3\2\2\2\u066a\u0668"+
		"\3\2\2\2\u066a\u066b\3\2\2\2\u066b\u00e9\3\2\2\2\u066c\u066a\3\2\2\2\u066d"+
		"\u066e\7\27\2\2\u066e\u066f\5\u00ecw\2\u066f\u0670\7\23\2\2\u0670\u0671"+
		"\5\u00ecw\2\u0671\u0672\7\30\2\2\u0672\u067c\3\2\2\2\u0673\u0674\7\27"+
		"\2\2\u0674\u0675\5\u00eex\2\u0675\u0676\7\30\2\2\u0676\u067c\3\2\2\2\u0677"+
		"\u0678\7)\2\2\u0678\u0679\5\u00eex\2\u0679\u067a\7\'\2\2\u067a\u067c\3"+
		"\2\2\2\u067b\u066d\3\2\2\2\u067b\u0673\3\2\2\2\u067b\u0677\3\2\2\2\u067c"+
		"\u00eb\3\2\2\2\u067d\u068b\7\u008c\2\2\u067e\u068b\7\u008d\2\2\u067f\u068b"+
		"\7\u0094\2\2\u0680\u068b\7\u0095\2\2\u0681\u068b\7\u008b\2\2\u0682\u068b"+
		"\7\u0099\2\2\u0683\u068b\7\u0098\2\2\u0684\u068b\7\u0093\2\2\u0685\u068b"+
		"\7\u0096\2\2\u0686\u068b\7\u0097\2\2\u0687\u068b\7\u008a\2\2\u0688\u068b"+
		"\7\u009a\2\2\u0689\u068b\5~@\2\u068a\u067d\3\2\2\2\u068a\u067e\3\2\2\2"+
		"\u068a\u067f\3\2\2\2\u068a\u0680\3\2\2\2\u068a\u0681\3\2\2\2\u068a\u0682"+
		"\3\2\2\2\u068a\u0683\3\2\2\2\u068a\u0684\3\2\2\2\u068a\u0685\3\2\2\2\u068a"+
		"\u0686\3\2\2\2\u068a\u0687\3\2\2\2\u068a\u0688\3\2\2\2\u068a\u0689\3\2"+
		"\2\2\u068b\u00ed\3\2\2\2\u068c\u068d\bx\1\2\u068d\u068e\5\u00ecw\2\u068e"+
		"\u0694\3\2\2\2\u068f\u0690\f\3\2\2\u0690\u0691\7\22\2\2\u0691\u0693\5"+
		"\u00ecw\2\u0692\u068f\3\2\2\2\u0693\u0696\3\2\2\2\u0694\u0692\3\2\2\2"+
		"\u0694\u0695\3\2\2\2\u0695\u00ef\3\2\2\2\u0696\u0694\3\2\2\2\u0697\u069c"+
		"\5\u00f4{\2\u0698\u069c\5\u00f6|\2\u0699\u069c\5\u00acW\2\u069a\u069c"+
		"\5\u00f2z\2\u069b\u0697\3\2\2\2\u069b\u0698\3\2\2\2\u069b\u0699\3\2\2"+
		"\2\u069b\u069a\3\2\2\2\u069c\u00f1\3\2\2\2\u069d\u069e\t\3\2\2\u069e\u00f3"+
		"\3\2\2\2\u069f\u06a0\7\25\2\2\u06a0\u06a1\5N(\2\u06a1\u06a2\7\26\2\2\u06a2"+
		"\u00f5\3\2\2\2\u06a3\u06a6\5\u00ecw\2\u06a4\u06a6\5\u00f8}\2\u06a5\u06a3"+
		"\3\2\2\2\u06a5\u06a4\3\2\2\2\u06a6\u00f7\3\2\2\2\u06a7\u06ad\5\u0098M"+
		"\2\u06a8\u06ad\5\u0092J\2\u06a9\u06ad\5\u0094K\2\u06aa\u06ad\5\u00fc\177"+
		"\2\u06ab\u06ad\5\u00fa~\2\u06ac\u06a7\3\2\2\2\u06ac\u06a8\3\2\2\2\u06ac"+
		"\u06a9\3\2\2\2\u06ac\u06aa\3\2\2\2\u06ac\u06ab\3\2\2\2\u06ad\u00f9\3\2"+
		"\2\2\u06ae\u06b0\7\25\2\2\u06af\u06b1\5\u00fe\u0080\2\u06b0\u06af\3\2"+
		"\2\2\u06b0\u06b1\3\2\2\2\u06b1\u06b2\3\2\2\2\u06b2\u06b3\7\26\2\2\u06b3"+
		"\u00fb\3\2\2\2\u06b4\u06b6\7\31\2\2\u06b5\u06b7\5\u0100\u0081\2\u06b6"+
		"\u06b5\3\2\2\2\u06b6\u06b7\3\2\2\2\u06b7\u06b8\3\2\2\2\u06b8\u06b9\7\32"+
		"\2\2\u06b9\u00fd\3\2\2\2\u06ba\u06bb\b\u0080\1\2\u06bb\u06bc\5N(\2\u06bc"+
		"\u06c2\3\2\2\2\u06bd\u06be\f\3\2\2\u06be\u06bf\7\22\2\2\u06bf\u06c1\5"+
		"N(\2\u06c0\u06bd\3\2\2\2\u06c1\u06c4\3\2\2\2\u06c2\u06c0\3\2\2\2\u06c2"+
		"\u06c3\3\2\2\2\u06c3\u00ff\3\2\2\2\u06c4\u06c2\3\2\2\2\u06c5\u06c6\b\u0081"+
		"\1\2\u06c6\u06c7\5\u0102\u0082\2\u06c7\u06cd\3\2\2\2\u06c8\u06c9\f\3\2"+
		"\2\u06c9\u06ca\7\22\2\2\u06ca\u06cc\5\u0102\u0082\2\u06cb\u06c8\3\2\2"+
		"\2\u06cc\u06cf\3\2\2\2\u06cd\u06cb\3\2\2\2\u06cd\u06ce\3\2\2\2\u06ce\u0101"+
		"\3\2\2\2\u06cf\u06cd\3\2\2\2\u06d0\u06d1\5N(\2\u06d1\u06d2\7\20\2\2\u06d2"+
		"\u06d3\5N(\2\u06d3\u0103\3\2\2\2\u06d4\u06d5\5N(\2\u06d5\u06d6\7\20\2"+
		"\2\u06d6\u06d7\5N(\2\u06d7\u06de\3\2\2\2\u06d8\u06d9\5N(\2\u06d9\u06da"+
		"\7\20\2\2\u06da\u06de\3\2\2\2\u06db\u06dc\7\20\2\2\u06dc\u06de\5N(\2\u06dd"+
		"\u06d4\3\2\2\2\u06dd\u06d8\3\2\2\2\u06dd\u06db\3\2\2\2\u06de\u0105\3\2"+
		"\2\2\u06df\u06e0\5\u00aeX\2\u06e0\u06e1\5\u0114\u008b\2\u06e1\u06e2\5"+
		"N(\2\u06e2\u0107\3\2\2\2\u06e3\u06e4\b\u0085\1\2\u06e4\u06e5\5\u00aeX"+
		"\2\u06e5\u06ea\3\2\2\2\u06e6\u06e7\f\3\2\2\u06e7\u06e9\5r:\2\u06e8\u06e6"+
		"\3\2\2\2\u06e9\u06ec\3\2\2\2\u06ea\u06e8\3\2\2\2\u06ea\u06eb\3\2\2\2\u06eb"+
		"\u0109\3\2\2\2\u06ec\u06ea\3\2\2\2\u06ed\u06ee\6\u0086B\3\u06ee\u06ef"+
		"\7\u0090\2\2\u06ef\u06f2\5\u00be`\2\u06f0\u06f2\5N(\2\u06f1\u06ed\3\2"+
		"\2\2\u06f1\u06f0\3\2\2\2\u06f2\u010b\3\2\2\2\u06f3\u06fa\7!\2\2\u06f4"+
		"\u06fa\7\"\2\2\u06f5\u06fa\5\u0116\u008c\2\u06f6\u06fa\5\u0118\u008d\2"+
		"\u06f7\u06fa\5\u011a\u008e\2\u06f8\u06fa\5\u011c\u008f\2\u06f9\u06f3\3"+
		"\2\2\2\u06f9\u06f4\3\2\2\2\u06f9\u06f5\3\2\2\2\u06f9\u06f6\3\2\2\2\u06f9"+
		"\u06f7\3\2\2\2\u06f9\u06f8\3\2\2\2\u06fa\u010d\3\2\2\2\u06fb\u06fc\7\u0090"+
		"\2\2\u06fc\u06fd\6\u0088C\3\u06fd\u010f\3\2\2\2\u06fe\u06ff\7\u0090\2"+
		"\2\u06ff\u0700\6\u0089D\3\u0700\u0111\3\2\2\2\u0701\u0702\7\u0090\2\2"+
		"\u0702\u0703\6\u008aE\3\u0703\u0113\3\2\2\2\u0704\u0705\7,\2\2\u0705\u0115"+
		"\3\2\2\2\u0706\u0707\7#\2\2\u0707\u0117\3\2\2\2\u0708\u0709\7$\2\2\u0709"+
		"\u0119\3\2\2\2\u070a\u070b\7%\2\2\u070b\u011b\3\2\2\2\u070c\u070d\t\4"+
		"\2\2\u070d\u011d\3\2\2\2\u070e\u070f\7y\2\2\u070f\u0710\5\u0120\u0091"+
		"\2\u0710\u0711\7\21\2\2\u0711\u0716\3\2\2\2\u0712\u0713\5\u0120\u0091"+
		"\2\u0713\u0714\7\21\2\2\u0714\u0716\3\2\2\2\u0715\u070e\3\2\2\2\u0715"+
		"\u0712\3\2\2\2\u0716\u011f\3\2\2\2\u0717\u0718\b\u0091\1\2\u0718\u0719"+
		"\5\u0122\u0092\2\u0719\u071e\3\2\2\2\u071a\u071b\f\3\2\2\u071b\u071d\5"+
		"\u0126\u0094\2\u071c\u071a\3\2\2\2\u071d\u0720\3\2\2\2\u071e\u071c\3\2"+
		"\2\2\u071e\u071f\3\2\2\2\u071f\u0121\3\2\2\2\u0720\u071e\3\2\2\2\u0721"+
		"\u0728\5\u0124\u0093\2\u0722\u0728\5\u012e\u0098\2\u0723\u0728\5\u0130"+
		"\u0099\2\u0724\u0728\5\u0132\u009a\2\u0725\u0728\5\u0128\u0095\2\u0726"+
		"\u0728\5\u012c\u0097\2\u0727\u0721\3\2\2\2\u0727\u0722\3\2\2\2\u0727\u0723"+
		"\3\2\2\2\u0727\u0724\3\2\2\2\u0727\u0725\3\2\2\2\u0727\u0726\3\2\2\2\u0728"+
		"\u0123\3\2\2\2\u0729\u072a\5\u00f2z\2\u072a\u0125\3\2\2\2\u072b\u072c"+
		"\7\24\2\2\u072c\u0731\5\u0128\u0095\2\u072d\u072e\7\24\2\2\u072e\u0731"+
		"\5\u0134\u009b\2\u072f\u0731\5\u012c\u0097\2\u0730\u072b\3\2\2\2\u0730"+
		"\u072d\3\2\2\2\u0730\u072f\3\2\2\2\u0731\u0127\3\2\2\2\u0732\u0733\5\u0134"+
		"\u009b\2\u0733\u0735\7\25\2\2\u0734\u0736\5\u012a\u0096\2\u0735\u0734"+
		"\3\2\2\2\u0735\u0736\3\2\2\2\u0736\u0737\3\2\2\2\u0737\u0738\7\26\2\2"+
		"\u0738\u0129\3\2\2\2\u0739\u073a\b\u0096\1\2\u073a\u073b\5\u0120\u0091"+
		"\2\u073b\u0741\3\2\2\2\u073c\u073d\f\3\2\2\u073d\u073e\7\22\2\2\u073e"+
		"\u0740\5\u0120\u0091\2\u073f\u073c\3\2\2\2\u0740\u0743\3\2\2\2\u0741\u073f"+
		"\3\2\2\2\u0741\u0742\3\2\2\2\u0742\u012b\3\2\2\2\u0743\u0741\3\2\2\2\u0744"+
		"\u0745\7\27\2\2\u0745\u0746\5\u0120\u0091\2\u0746\u0747\7\30\2\2\u0747"+
		"\u012d\3\2\2\2\u0748\u0749\7\25\2\2\u0749\u074a\5\u0120\u0091\2\u074a"+
		"\u074b\7\26\2\2\u074b\u012f\3\2\2\2\u074c\u074d\5\u0134\u009b\2\u074d"+
		"\u0131\3\2\2\2\u074e\u0754\7\u0094\2\2\u074f\u0754\7\u0096\2\2\u0750\u0754"+
		"\7\u0093\2\2\u0751\u0754\7\u008a\2\2\u0752\u0754\7\u008b\2\2\u0753\u074e"+
		"\3\2\2\2\u0753\u074f\3\2\2\2\u0753\u0750\3\2\2\2\u0753\u0751\3\2\2\2\u0753"+
		"\u0752\3\2\2\2\u0754\u0133\3\2\2\2\u0755\u0756\t\5\2\2\u0756\u0135\3\2"+
		"\2\2\u0757\u0758\7y\2\2\u0758\u075b\5\u0138\u009d\2\u0759\u075b\5\u0138"+
		"\u009d\2\u075a\u0757\3\2\2\2\u075a\u0759\3\2\2\2\u075b\u0137\3\2\2\2\u075c"+
		"\u075d\b\u009d\1\2\u075d\u075e\5\u013a\u009e\2\u075e\u0763\3\2\2\2\u075f"+
		"\u0760\f\3\2\2\u0760\u0762\5\u013c\u009f\2\u0761\u075f\3\2\2\2\u0762\u0765"+
		"\3\2\2\2\u0763\u0761\3\2\2\2\u0763\u0764\3\2\2\2\u0764\u0139\3\2\2\2\u0765"+
		"\u0763\3\2\2\2\u0766\u076b\5\u0146\u00a4\2\u0767\u076b\5\u0148\u00a5\2"+
		"\u0768\u076b\5\u014a\u00a6\2\u0769\u076b\5\u013e\u00a0\2\u076a\u0766\3"+
		"\2\2\2\u076a\u0767\3\2\2\2\u076a\u0768\3\2\2\2\u076a\u0769\3\2\2\2\u076b"+
		"\u013b\3\2\2\2\u076c\u076d\7\24\2\2\u076d\u0773\5\u013e\u00a0\2\u076e"+
		"\u076f\7\27\2\2\u076f\u0770\5\u0138\u009d\2\u0770\u0771\7\30\2\2\u0771"+
		"\u0773\3\2\2\2\u0772\u076c\3\2\2\2\u0772\u076e\3\2\2\2\u0773\u013d\3\2"+
		"\2\2\u0774\u0775\5\u014c\u00a7\2\u0775\u0777\7\25\2\2\u0776\u0778\5\u0140"+
		"\u00a1\2\u0777\u0776\3\2\2\2\u0777\u0778\3\2\2\2\u0778\u0779\3\2\2\2\u0779"+
		"\u077a\7\26\2\2\u077a\u013f\3\2\2\2\u077b\u0782\5\u0142\u00a2\2\u077c"+
		"\u0782\5\u0144\u00a3\2\u077d\u077e\5\u0142\u00a2\2\u077e\u077f\7\22\2"+
		"\2\u077f\u0780\5\u0144\u00a3\2\u0780\u0782\3\2\2\2\u0781\u077b\3\2\2\2"+
		"\u0781\u077c\3\2\2\2\u0781\u077d\3\2\2\2\u0782\u0141\3\2\2\2\u0783\u0784"+
		"\b\u00a2\1\2\u0784\u0785\5\u0138\u009d\2\u0785\u078b\3\2\2\2\u0786\u0787"+
		"\f\3\2\2\u0787\u0788\7\22\2\2\u0788\u078a\5\u0138\u009d\2\u0789\u0786"+
		"\3\2\2\2\u078a\u078d\3\2\2\2\u078b\u0789\3\2\2\2\u078b\u078c\3\2\2\2\u078c"+
		"\u0143\3\2\2\2\u078d\u078b\3\2\2\2\u078e\u078f\b\u00a3\1\2\u078f\u0790"+
		"\5\u014c\u00a7\2\u0790\u0791\7,\2\2\u0791\u0792\5\u0138\u009d\2\u0792"+
		"\u079b\3\2\2\2\u0793\u0794\f\3\2\2\u0794\u0795\7\22\2\2\u0795\u0796\5"+
		"\u014c\u00a7\2\u0796\u0797\7,\2\2\u0797\u0798\5\u0138\u009d\2\u0798\u079a"+
		"\3\2\2\2\u0799\u0793\3\2\2\2\u079a\u079d\3\2\2\2\u079b\u0799\3\2\2\2\u079b"+
		"\u079c\3\2\2\2\u079c\u0145\3\2\2\2\u079d\u079b\3\2\2\2\u079e\u079f\7\25"+
		"\2\2\u079f\u07a0\5\u0138\u009d\2\u07a0\u07a1\7\26\2\2\u07a1\u0147\3\2"+
		"\2\2\u07a2\u07a3\b\u00a5\1\2\u07a3\u07a6\7\u0092\2\2\u07a4\u07a6\5\u014c"+
		"\u00a7\2\u07a5\u07a2\3\2\2\2\u07a5\u07a4\3\2\2\2\u07a6\u07ac\3\2\2\2\u07a7"+
		"\u07a8\f\3\2\2\u07a8\u07a9\7\24\2\2\u07a9\u07ab\5\u014c\u00a7\2\u07aa"+
		"\u07a7\3\2\2\2\u07ab\u07ae\3\2\2\2\u07ac\u07aa\3\2\2\2\u07ac\u07ad\3\2"+
		"\2\2\u07ad\u0149\3\2\2\2\u07ae\u07ac\3\2\2\2\u07af\u07b5\7\u0094\2\2\u07b0"+
		"\u07b5\7\u0096\2\2\u07b1\u07b5\7\u0093\2\2\u07b2\u07b5\7\u008a\2\2\u07b3"+
		"\u07b5\7\u008b\2\2\u07b4\u07af\3\2\2\2\u07b4\u07b0\3\2\2\2\u07b4\u07b1"+
		"\3\2\2\2\u07b4\u07b2\3\2\2\2\u07b4\u07b3\3\2\2\2\u07b5\u014b\3\2\2\2\u07b6"+
		"\u07b7\t\6\2\2\u07b7\u014d\3\2\2\2\u07b8\u07b9\7y\2\2\u07b9\u07ba\5\u0150"+
		"\u00a9\2\u07ba\u07bb\7\21\2\2\u07bb\u07c0\3\2\2\2\u07bc\u07bd\5\u0150"+
		"\u00a9\2\u07bd\u07be\7\21\2\2\u07be\u07c0\3\2\2\2\u07bf\u07b8\3\2\2\2"+
		"\u07bf\u07bc\3\2\2\2\u07c0\u014f\3\2\2\2\u07c1\u07c2\b\u00a9\1\2\u07c2"+
		"\u07c3\5\u0152\u00aa\2\u07c3\u07c8\3\2\2\2\u07c4\u07c5\f\3\2\2\u07c5\u07c7"+
		"\5\u0156\u00ac\2\u07c6\u07c4\3\2\2\2\u07c7\u07ca\3\2\2\2\u07c8\u07c6\3"+
		"\2\2\2\u07c8\u07c9\3\2\2\2\u07c9\u0151\3\2\2\2\u07ca\u07c8\3\2\2\2\u07cb"+
		"\u07d0\5\u0154\u00ab\2\u07cc\u07d0\5\u015e\u00b0\2\u07cd\u07d0\5\u0160"+
		"\u00b1\2\u07ce\u07d0\5\u0164\u00b3\2\u07cf\u07cb\3\2\2\2\u07cf\u07cc\3"+
		"\2\2\2\u07cf\u07cd\3\2\2\2\u07cf\u07ce\3\2\2\2\u07d0\u0153\3\2\2\2\u07d1"+
		"\u07d2\5\u00f2z\2\u07d2\u0155\3\2\2\2\u07d3\u07d4\7\24\2\2\u07d4\u07d7"+
		"\5\u0158\u00ad\2\u07d5\u07d7\5\u015c\u00af\2\u07d6\u07d3\3\2\2\2\u07d6"+
		"\u07d5\3\2\2\2\u07d7\u0157\3\2\2\2\u07d8\u07d9\5\u0166\u00b4\2\u07d9\u07db"+
		"\7\25\2\2\u07da\u07dc\5\u015a\u00ae\2\u07db\u07da\3\2\2\2\u07db\u07dc"+
		"\3\2\2\2\u07dc\u07dd\3\2\2\2\u07dd\u07de\7\26\2\2\u07de\u0159\3\2\2\2"+
		"\u07df\u07e0\b\u00ae\1\2\u07e0\u07e1\5\u0150\u00a9\2\u07e1\u07e7\3\2\2"+
		"\2\u07e2\u07e3\f\3\2\2\u07e3\u07e4\7\22\2\2\u07e4\u07e6\5\u0150\u00a9"+
		"\2\u07e5\u07e2\3\2\2\2\u07e6\u07e9\3\2\2\2\u07e7\u07e5\3\2\2\2\u07e7\u07e8"+
		"\3\2\2\2\u07e8\u015b\3\2\2\2\u07e9\u07e7\3\2\2\2\u07ea\u07eb\7\27\2\2"+
		"\u07eb\u07ec\5\u0150\u00a9\2\u07ec\u07ed\7\30\2\2\u07ed\u015d\3\2\2\2"+
		"\u07ee\u07ef\7\25\2\2\u07ef\u07f0\5\u0150\u00a9\2\u07f0\u07f1\7\26\2\2"+
		"\u07f1\u015f\3\2\2\2\u07f2\u07f3\b\u00b1\1\2\u07f3\u07f4\5\u0166\u00b4"+
		"\2\u07f4\u07fa\3\2\2\2\u07f5\u07f6\f\3\2\2\u07f6\u07f7\7\24\2\2\u07f7"+
		"\u07f9\5\u0166\u00b4\2\u07f8\u07f5\3\2\2\2\u07f9\u07fc\3\2\2\2\u07fa\u07f8"+
		"\3\2\2\2\u07fa\u07fb\3\2\2\2\u07fb\u0161\3\2\2\2\u07fc\u07fa\3\2\2\2\u07fd"+
		"\u07fe\b\u00b2\1\2\u07fe\u07ff\5\u0160\u00b1\2\u07ff\u0804\3\2\2\2\u0800"+
		"\u0801\f\3\2\2\u0801\u0803\7\u0092\2\2\u0802\u0800\3\2\2\2\u0803\u0806"+
		"\3\2\2\2\u0804\u0802\3\2\2\2\u0804\u0805\3\2\2\2\u0805\u0163\3\2\2\2\u0806"+
		"\u0804\3\2\2\2\u0807\u080d\7\u0094\2\2\u0808\u080d\7\u0096\2\2\u0809\u080d"+
		"\7\u0093\2\2\u080a\u080d\7\u008a\2\2\u080b\u080d\7\u008b\2\2\u080c\u0807"+
		"\3\2\2\2\u080c\u0808\3\2\2\2\u080c\u0809\3\2\2\2\u080c\u080a\3\2\2\2\u080c"+
		"\u080b\3\2\2\2\u080d\u0165\3\2\2\2\u080e\u080f\t\7\2\2\u080f\u0167\3\2"+
		"\2\2\u0810\u0811\7y\2\2\u0811\u0812\5\u016a\u00b6\2\u0812\u0813\7\21\2"+
		"\2\u0813\u0818\3\2\2\2\u0814\u0815\5\u016a\u00b6\2\u0815\u0816\7\21\2"+
		"\2\u0816\u0818\3\2\2\2\u0817\u0810\3\2\2\2\u0817\u0814\3\2\2\2\u0818\u0169"+
		"\3\2\2\2\u0819\u081a\b\u00b6\1\2\u081a\u081b\5\u016c\u00b7\2\u081b\u0820"+
		"\3\2\2\2\u081c\u081d\f\3\2\2\u081d\u081f\5\u0170\u00b9\2\u081e\u081c\3"+
		"\2\2\2\u081f\u0822\3\2\2\2\u0820\u081e\3\2\2\2\u0820\u0821\3\2\2\2\u0821"+
		"\u016b\3\2\2\2\u0822\u0820\3\2\2\2\u0823\u0828\5\u016e\u00b8\2\u0824\u0828"+
		"\5\u0178\u00bd\2\u0825\u0828\5\u017a\u00be\2\u0826\u0828\5\u017c\u00bf"+
		"\2\u0827\u0823\3\2\2\2\u0827\u0824\3\2\2\2\u0827\u0825\3\2\2\2\u0827\u0826"+
		"\3\2\2\2\u0828\u016d\3\2\2\2\u0829\u082a\5\u00f2z\2\u082a\u016f\3\2\2"+
		"\2\u082b\u082c\7\24\2\2\u082c\u082f\5\u0172\u00ba\2\u082d\u082f\5\u0176"+
		"\u00bc\2\u082e\u082b\3\2\2\2\u082e\u082d\3\2\2\2\u082f\u0171\3\2\2\2\u0830"+
		"\u0831\5\u017e\u00c0\2\u0831\u0833\7\25\2\2\u0832\u0834\5\u0174\u00bb"+
		"\2\u0833\u0832\3\2\2\2\u0833\u0834\3\2\2\2\u0834\u0835\3\2\2\2\u0835\u0836"+
		"\7\26\2\2\u0836\u0173\3\2\2\2\u0837\u0838\b\u00bb\1\2\u0838\u0839\5\u016a"+
		"\u00b6\2\u0839\u083f\3\2\2\2\u083a\u083b\f\3\2\2\u083b\u083c\7\22\2\2"+
		"\u083c\u083e\5\u016a\u00b6\2\u083d\u083a\3\2\2\2\u083e\u0841\3\2\2\2\u083f"+
		"\u083d\3\2\2\2\u083f\u0840\3\2\2\2\u0840\u0175\3\2\2\2\u0841\u083f\3\2"+
		"\2\2\u0842\u0843\7\27\2\2\u0843\u0844\5\u016a\u00b6\2\u0844\u0845\7\30"+
		"\2\2\u0845\u0177\3\2\2\2\u0846\u0847\7\25\2\2\u0847\u0848\5\u016a\u00b6"+
		"\2\u0848\u0849\7\26\2\2\u0849\u0179\3\2\2\2\u084a\u084b\b\u00be\1\2\u084b"+
		"\u084e\7\u0092\2\2\u084c\u084e\5\u017e\u00c0\2\u084d\u084a\3\2\2\2\u084d"+
		"\u084c\3\2\2\2\u084e\u0854\3\2\2\2\u084f\u0850\f\3\2\2\u0850\u0851\7\24"+
		"\2\2\u0851\u0853\5\u017e\u00c0\2\u0852\u084f\3\2\2\2\u0853\u0856\3\2\2"+
		"\2\u0854\u0852\3\2\2\2\u0854\u0855\3\2\2\2\u0855\u017b\3\2\2\2\u0856\u0854"+
		"\3\2\2\2\u0857\u085d\7\u0094\2\2\u0858\u085d\7\u0096\2\2\u0859\u085d\7"+
		"\u0093\2\2\u085a\u085d\7\u008a\2\2\u085b\u085d\7\u008b\2\2\u085c\u0857"+
		"\3\2\2\2\u085c\u0858\3\2\2\2\u085c\u0859\3\2\2\2\u085c\u085a\3\2\2\2\u085c"+
		"\u085b\3\2\2\2\u085d\u017d\3\2\2\2\u085e\u085f\t\b\2\2\u085f\u017f\3\2"+
		"\2\2\u00aa\u0186\u018d\u01ab\u01b3\u01ba\u01c5\u01ce\u01dd\u01e6\u01ed"+
		"\u01f7\u021d\u022b\u0239\u0247\u025b\u0266\u0268\u0271\u0275\u027d\u0281"+
		"\u0290\u0294\u02af\u02b6\u02bb\u02bf\u02d0\u02d4\u02d7\u02f8\u030b\u0312"+
		"\u0334\u033d\u0354\u0364\u0369\u0371\u037a\u0391\u0395\u03b1\u0411\u0413"+
		"\u041d\u0432\u0442\u0447\u044d\u0452\u0454\u0457\u045d\u045f\u0461\u047f"+
		"\u0486\u0488\u048d\u048f\u049a\u04ad\u04b6\u04bc\u04c1\u04c8\u04d0\u04de"+
		"\u04e6\u04ec\u04f7\u0503\u050e\u051b\u051f\u0525\u0531\u0545\u0547\u054c"+
		"\u0558\u0563\u056d\u0572\u0577\u0587\u058c\u058f\u0593\u0598\u059f\u05aa"+
		"\u05ac\u05b8\u05c0\u05cb\u05d0\u05dc\u05e0\u05ea\u05f2\u05f8\u05ff\u0604"+
		"\u060e\u0615\u0620\u062d\u0631\u0634\u0638\u063b\u0646\u0652\u065e\u066a"+
		"\u067b\u068a\u0694\u069b\u06a5\u06ac\u06b0\u06b6\u06c2\u06cd\u06dd\u06ea"+
		"\u06f1\u06f9\u0715\u071e\u0727\u0730\u0735\u0741\u0753\u075a\u0763\u076a"+
		"\u0772\u0777\u0781\u078b\u079b\u07a5\u07ac\u07b4\u07bf\u07c8\u07cf\u07d6"+
		"\u07db\u07e7\u07fa\u0804\u080c\u0817\u0820\u0827\u082e\u0833\u083f\u084d"+
		"\u0854\u085c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}