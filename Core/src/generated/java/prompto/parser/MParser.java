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
		RULE_python_selector_expression = 170, RULE_python_method_expression = 171, 
		RULE_python_argument_list = 172, RULE_python_ordinal_argument_list = 173, 
		RULE_python_named_argument_list = 174, RULE_python_parenthesis_expression = 175, 
		RULE_python_identifier_expression = 176, RULE_python_literal_expression = 177, 
		RULE_python_identifier = 178, RULE_java_statement = 179, RULE_java_expression = 180, 
		RULE_java_primary_expression = 181, RULE_java_this_expression = 182, RULE_java_new_expression = 183, 
		RULE_java_selector_expression = 184, RULE_java_method_expression = 185, 
		RULE_java_arguments = 186, RULE_java_item_expression = 187, RULE_java_parenthesis_expression = 188, 
		RULE_java_identifier_expression = 189, RULE_java_class_identifier_expression = 190, 
		RULE_java_literal_expression = 191, RULE_java_identifier = 192, RULE_csharp_statement = 193, 
		RULE_csharp_expression = 194, RULE_csharp_primary_expression = 195, RULE_csharp_this_expression = 196, 
		RULE_csharp_new_expression = 197, RULE_csharp_selector_expression = 198, 
		RULE_csharp_method_expression = 199, RULE_csharp_arguments = 200, RULE_csharp_item_expression = 201, 
		RULE_csharp_parenthesis_expression = 202, RULE_csharp_identifier_expression = 203, 
		RULE_csharp_literal_expression = 204, RULE_csharp_identifier = 205;
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
			setState(412); 
			match(ENUM);
			setState(413); 
			((Enum_category_declarationContext)_localctx).name = type_identifier();
			setState(414); 
			match(LPAR);
			setState(421);
			switch (_input.LA(1)) {
			case TYPE_IDENTIFIER:
				{
				setState(415); 
				((Enum_category_declarationContext)_localctx).derived = type_identifier();
				setState(418);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(416); 
					match(COMMA);
					setState(417); 
					((Enum_category_declarationContext)_localctx).attrs = attribute_identifier_list();
					}
				}

				}
				break;
			case STORABLE:
			case VARIABLE_IDENTIFIER:
				{
				setState(420); 
				((Enum_category_declarationContext)_localctx).attrs = attribute_identifier_list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(423); 
			match(RPAR);
			setState(424); 
			match(COLON);
			setState(425); 
			indent();
			setState(426); 
			((Enum_category_declarationContext)_localctx).symbols = category_symbol_list();
			setState(427); 
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
			setState(429); 
			match(ENUM);
			setState(430); 
			((Enum_native_declarationContext)_localctx).name = type_identifier();
			setState(431); 
			match(LPAR);
			setState(432); 
			((Enum_native_declarationContext)_localctx).typ = native_type();
			setState(433); 
			match(RPAR);
			setState(434); 
			match(COLON);
			setState(435); 
			indent();
			setState(436); 
			((Enum_native_declarationContext)_localctx).symbols = native_symbol_list();
			setState(437); 
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
			setState(439); 
			((Native_symbolContext)_localctx).name = symbol_identifier();
			setState(440); 
			match(EQ);
			setState(441); 
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
			setState(443); 
			((Category_symbolContext)_localctx).name = symbol_identifier();
			setState(444); 
			match(LPAR);
			setState(446);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (EXECUTE - 98)) | (1L << (FETCH - 98)) | (1L << (MUTABLE - 98)) | (1L << (NONE - 98)) | (1L << (NOT - 98)) | (1L << (READ - 98)) | (1L << (SELF - 98)) | (1L << (SORTED - 98)) | (1L << (THIS - 98)) | (1L << (BOOLEAN_LITERAL - 98)) | (1L << (CHAR_LITERAL - 98)) | (1L << (MIN_INTEGER - 98)) | (1L << (MAX_INTEGER - 98)) | (1L << (SYMBOL_IDENTIFIER - 98)) | (1L << (TYPE_IDENTIFIER - 98)))) != 0) || ((((_la - 162)) & ~0x3f) == 0 && ((1L << (_la - 162)) & ((1L << (VARIABLE_IDENTIFIER - 162)) | (1L << (TEXT_LITERAL - 162)) | (1L << (UUID_LITERAL - 162)) | (1L << (INTEGER_LITERAL - 162)) | (1L << (HEXA_LITERAL - 162)) | (1L << (DECIMAL_LITERAL - 162)) | (1L << (DATETIME_LITERAL - 162)) | (1L << (TIME_LITERAL - 162)) | (1L << (DATE_LITERAL - 162)) | (1L << (PERIOD_LITERAL - 162)))) != 0)) {
				{
				setState(445); 
				((Category_symbolContext)_localctx).args = argument_assignment_list(0);
				}
			}

			setState(448); 
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
			setState(451);
			_la = _input.LA(1);
			if (_la==STORABLE) {
				{
				setState(450); 
				match(STORABLE);
				}
			}

			setState(453); 
			match(ATTR);
			setState(454); 
			((Attribute_declarationContext)_localctx).name = attribute_identifier();
			setState(455); 
			match(LPAR);
			setState(456); 
			((Attribute_declarationContext)_localctx).typ = typedef(0);
			setState(457); 
			match(RPAR);
			setState(458); 
			match(COLON);
			setState(459); 
			indent();
			setState(475);
			switch (_input.LA(1)) {
			case PASS:
				{
				setState(460); 
				match(PASS);
				}
				break;
			case IN:
			case INDEX:
			case MATCHING:
				{
				setState(473);
				switch (_input.LA(1)) {
				case IN:
				case MATCHING:
					{
					setState(461); 
					((Attribute_declarationContext)_localctx).match = attribute_constraint();
					setState(465);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						setState(462); 
						lfp();
						setState(463); 
						((Attribute_declarationContext)_localctx).indices = index_clause();
						}
						break;
					}
					}
					break;
				case INDEX:
					{
					setState(467); 
					((Attribute_declarationContext)_localctx).indices = index_clause();
					setState(471);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						setState(468); 
						lfp();
						setState(469); 
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
			setState(477); 
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
			setState(479); 
			match(INDEX);
			setState(480); 
			match(LPAR);
			setState(482);
			_la = _input.LA(1);
			if (_la==VARIABLE_IDENTIFIER) {
				{
				setState(481); 
				((Index_clauseContext)_localctx).indices = variable_identifier_list();
				}
			}

			setState(484); 
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
			setState(487);
			_la = _input.LA(1);
			if (_la==STORABLE) {
				{
				setState(486); 
				match(STORABLE);
				}
			}

			setState(489);
			_la = _input.LA(1);
			if ( !(_la==CATEGORY || _la==CLASS) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(490); 
			((Concrete_category_declarationContext)_localctx).name = type_identifier();
			setState(491); 
			match(LPAR);
			setState(498);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(492); 
				((Concrete_category_declarationContext)_localctx).derived = derived_list();
				}
				break;
			case 2:
				{
				setState(493); 
				((Concrete_category_declarationContext)_localctx).attrs = attribute_identifier_list();
				}
				break;
			case 3:
				{
				setState(494); 
				((Concrete_category_declarationContext)_localctx).derived = derived_list();
				setState(495); 
				match(COMMA);
				setState(496); 
				((Concrete_category_declarationContext)_localctx).attrs = attribute_identifier_list();
				}
				break;
			}
			setState(500); 
			match(RPAR);
			setState(501); 
			match(COLON);
			setState(502); 
			indent();
			setState(505);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case DEF:
				{
				setState(503); 
				((Concrete_category_declarationContext)_localctx).methods = member_method_declaration_list();
				}
				break;
			case PASS:
				{
				setState(504); 
				match(PASS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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
			setState(509); 
			match(SINGLETON);
			setState(510); 
			((Singleton_category_declarationContext)_localctx).name = type_identifier();
			setState(511); 
			match(LPAR);
			setState(512); 
			((Singleton_category_declarationContext)_localctx).attrs = attribute_identifier_list();
			setState(513); 
			match(RPAR);
			setState(514); 
			match(COLON);
			setState(515); 
			indent();
			setState(518);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case DEF:
				{
				setState(516); 
				((Singleton_category_declarationContext)_localctx).methods = member_method_declaration_list();
				}
				break;
			case PASS:
				{
				setState(517); 
				match(PASS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(520); 
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
			setState(522); 
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
			setState(524); 
			match(DEF);
			setState(525); 
			match(OPERATOR);
			setState(526); 
			((Operator_method_declarationContext)_localctx).op = operator();
			setState(527); 
			match(LPAR);
			setState(528); 
			((Operator_method_declarationContext)_localctx).arg = operator_argument();
			setState(529); 
			match(RPAR);
			setState(532);
			_la = _input.LA(1);
			if (_la==RARROW) {
				{
				setState(530); 
				match(RARROW);
				setState(531); 
				((Operator_method_declarationContext)_localctx).typ = typedef(0);
				}
			}

			setState(534); 
			match(COLON);
			setState(535); 
			indent();
			setState(536); 
			((Operator_method_declarationContext)_localctx).stmts = statement_list();
			setState(537); 
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
			setState(539); 
			match(DEF);
			setState(540); 
			((Setter_method_declarationContext)_localctx).name = variable_identifier();
			setState(541); 
			match(SETTER);
			setState(542); 
			match(LPAR);
			setState(543); 
			match(RPAR);
			setState(544); 
			match(COLON);
			setState(545); 
			indent();
			setState(546); 
			((Setter_method_declarationContext)_localctx).stmts = statement_list();
			setState(547); 
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
			setState(549); 
			match(DEF);
			setState(550); 
			((Native_setter_declarationContext)_localctx).name = variable_identifier();
			setState(552);
			_la = _input.LA(1);
			if (_la==NATIVE) {
				{
				setState(551); 
				match(NATIVE);
				}
			}

			setState(554); 
			match(SETTER);
			setState(555); 
			match(LPAR);
			setState(556); 
			match(RPAR);
			setState(557); 
			match(COLON);
			setState(558); 
			indent();
			setState(559); 
			((Native_setter_declarationContext)_localctx).stmts = native_statement_list();
			setState(560); 
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
			setState(562); 
			match(DEF);
			setState(563); 
			((Getter_method_declarationContext)_localctx).name = variable_identifier();
			setState(564); 
			match(GETTER);
			setState(565); 
			match(LPAR);
			setState(566); 
			match(RPAR);
			setState(567); 
			match(COLON);
			setState(568); 
			indent();
			setState(569); 
			((Getter_method_declarationContext)_localctx).stmts = statement_list();
			setState(570); 
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
			setState(572); 
			match(DEF);
			setState(573); 
			((Native_getter_declarationContext)_localctx).name = variable_identifier();
			setState(575);
			_la = _input.LA(1);
			if (_la==NATIVE) {
				{
				setState(574); 
				match(NATIVE);
				}
			}

			setState(577); 
			match(GETTER);
			setState(578); 
			match(LPAR);
			setState(579); 
			match(RPAR);
			setState(580); 
			match(COLON);
			setState(581); 
			indent();
			setState(582); 
			((Native_getter_declarationContext)_localctx).stmts = native_statement_list();
			setState(583); 
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
			setState(586);
			_la = _input.LA(1);
			if (_la==STORABLE) {
				{
				setState(585); 
				match(STORABLE);
				}
			}

			setState(588); 
			match(NATIVE);
			setState(589);
			_la = _input.LA(1);
			if ( !(_la==CATEGORY || _la==CLASS) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(590); 
			((Native_category_declarationContext)_localctx).name = type_identifier();
			setState(591); 
			match(LPAR);
			setState(593);
			_la = _input.LA(1);
			if (_la==STORABLE || _la==VARIABLE_IDENTIFIER) {
				{
				setState(592); 
				((Native_category_declarationContext)_localctx).attrs = attribute_identifier_list();
				}
			}

			setState(595); 
			match(RPAR);
			setState(596); 
			match(COLON);
			setState(597); 
			indent();
			setState(598); 
			((Native_category_declarationContext)_localctx).bindings = native_category_bindings();
			setState(602);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(599); 
				lfp();
				setState(600); 
				((Native_category_declarationContext)_localctx).methods = native_member_method_declaration_list();
				}
				break;
			}
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
			setState(606); 
			match(NATIVE);
			setState(607); 
			match(RESOURCE);
			setState(608); 
			((Native_resource_declarationContext)_localctx).name = type_identifier();
			setState(609); 
			match(LPAR);
			setState(611);
			_la = _input.LA(1);
			if (_la==STORABLE || _la==VARIABLE_IDENTIFIER) {
				{
				setState(610); 
				((Native_resource_declarationContext)_localctx).attrs = attribute_identifier_list();
				}
			}

			setState(613); 
			match(RPAR);
			setState(614); 
			match(COLON);
			setState(615); 
			indent();
			setState(616); 
			((Native_resource_declarationContext)_localctx).bindings = native_category_bindings();
			setState(620);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(617); 
				lfp();
				setState(618); 
				((Native_resource_declarationContext)_localctx).methods = native_member_method_declaration_list();
				}
				break;
			}
			setState(622); 
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
			setState(624); 
			match(DEF);
			setState(625);
			_la = _input.LA(1);
			if ( !(_la==CATEGORY || _la==CLASS) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(626); 
			match(BINDINGS);
			setState(627); 
			match(COLON);
			setState(628); 
			indent();
			setState(629); 
			((Native_category_bindingsContext)_localctx).items = native_category_binding_list(0);
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

			setState(633); 
			((NativeCategoryBindingListContext)_localctx).item = native_category_binding();
			}
			_ctx.stop = _input.LT(-1);
			setState(641);
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
					setState(635);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(636); 
					lfp();
					setState(637); 
					((NativeCategoryBindingListItemContext)_localctx).item = native_category_binding();
					}
					} 
				}
				setState(643);
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
			setState(644); 
			match(ABSTRACT);
			setState(645); 
			match(DEF);
			setState(646); 
			((Abstract_method_declarationContext)_localctx).name = method_identifier();
			setState(647); 
			match(LPAR);
			setState(649);
			_la = _input.LA(1);
			if (_la==CODE || _la==MUTABLE || _la==VARIABLE_IDENTIFIER) {
				{
				setState(648); 
				((Abstract_method_declarationContext)_localctx).args = argument_list();
				}
			}

			setState(651); 
			match(RPAR);
			setState(654);
			_la = _input.LA(1);
			if (_la==RARROW) {
				{
				setState(652); 
				match(RARROW);
				setState(653); 
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
			setState(656); 
			match(DEF);
			setState(657); 
			((Concrete_method_declarationContext)_localctx).name = method_identifier();
			setState(658); 
			match(LPAR);
			setState(660);
			_la = _input.LA(1);
			if (_la==CODE || _la==MUTABLE || _la==VARIABLE_IDENTIFIER) {
				{
				setState(659); 
				((Concrete_method_declarationContext)_localctx).args = argument_list();
				}
			}

			setState(662); 
			match(RPAR);
			setState(665);
			_la = _input.LA(1);
			if (_la==RARROW) {
				{
				setState(663); 
				match(RARROW);
				setState(664); 
				((Concrete_method_declarationContext)_localctx).typ = typedef(0);
				}
			}

			setState(667); 
			match(COLON);
			setState(668); 
			indent();
			setState(669); 
			((Concrete_method_declarationContext)_localctx).stmts = statement_list();
			setState(670); 
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
			setState(672); 
			match(DEF);
			setState(674);
			_la = _input.LA(1);
			if (_la==NATIVE) {
				{
				setState(673); 
				match(NATIVE);
				}
			}

			setState(676); 
			((Native_method_declarationContext)_localctx).name = method_identifier();
			setState(677); 
			match(LPAR);
			setState(679);
			_la = _input.LA(1);
			if (_la==CODE || _la==MUTABLE || _la==VARIABLE_IDENTIFIER) {
				{
				setState(678); 
				((Native_method_declarationContext)_localctx).args = argument_list();
				}
			}

			setState(681); 
			match(RPAR);
			setState(684);
			_la = _input.LA(1);
			if (_la==RARROW) {
				{
				setState(682); 
				match(RARROW);
				setState(683); 
				((Native_method_declarationContext)_localctx).typ = category_or_any_type();
				}
			}

			setState(686); 
			match(COLON);
			setState(687); 
			indent();
			setState(688); 
			((Native_method_declarationContext)_localctx).stmts = native_statement_list();
			setState(689); 
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
			setState(691); 
			match(DEF);
			setState(692); 
			match(TEST);
			setState(693); 
			((Test_method_declarationContext)_localctx).name = match(TEXT_LITERAL);
			setState(694); 
			match(LPAR);
			setState(695); 
			match(RPAR);
			setState(696); 
			match(COLON);
			setState(697); 
			indent();
			setState(698); 
			((Test_method_declarationContext)_localctx).stmts = statement_list();
			setState(699); 
			dedent();
			setState(700); 
			lfp();
			setState(701); 
			match(VERIFYING);
			setState(702); 
			match(COLON);
			setState(708);
			switch (_input.LA(1)) {
			case LF:
				{
				{
				setState(703); 
				indent();
				setState(704); 
				((Test_method_declarationContext)_localctx).exps = assertion_list();
				setState(705); 
				dedent();
				}
				}
				break;
			case SYMBOL_IDENTIFIER:
				{
				{
				setState(707); 
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
			setState(710); 
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
			setState(712); 
			((Typed_argumentContext)_localctx).name = variable_identifier();
			setState(713); 
			match(COLON);
			setState(714); 
			((Typed_argumentContext)_localctx).typ = category_or_any_type();
			setState(719);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(715); 
				match(LPAR);
				setState(716); 
				((Typed_argumentContext)_localctx).attrs = attribute_identifier_list();
				setState(717); 
				match(RPAR);
				}
			}

			setState(723);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(721); 
				match(EQ);
				setState(722); 
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
			setState(744);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				_localctx = new MethodCallStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(725); 
				((MethodCallStatementContext)_localctx).stmt = method_call();
				}
				break;
			case 2:
				_localctx = new AssignInstanceStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(726); 
				((AssignInstanceStatementContext)_localctx).stmt = assign_instance_statement();
				}
				break;
			case 3:
				_localctx = new AssignTupleStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(727); 
				((AssignTupleStatementContext)_localctx).stmt = assign_tuple_statement();
				}
				break;
			case 4:
				_localctx = new StoreStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(728); 
				((StoreStatementContext)_localctx).stmt = store_statement();
				}
				break;
			case 5:
				_localctx = new FlushStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(729); 
				((FlushStatementContext)_localctx).stmt = flush_statement();
				}
				break;
			case 6:
				_localctx = new BreakStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(730); 
				((BreakStatementContext)_localctx).stmt = break_statement();
				}
				break;
			case 7:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(731); 
				((ReturnStatementContext)_localctx).stmt = return_statement();
				}
				break;
			case 8:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(732); 
				((IfStatementContext)_localctx).stmt = if_statement();
				}
				break;
			case 9:
				_localctx = new SwitchStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(733); 
				((SwitchStatementContext)_localctx).stmt = switch_statement();
				}
				break;
			case 10:
				_localctx = new ForEachStatementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(734); 
				((ForEachStatementContext)_localctx).stmt = for_each_statement();
				}
				break;
			case 11:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(735); 
				((WhileStatementContext)_localctx).stmt = while_statement();
				}
				break;
			case 12:
				_localctx = new DoWhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(736); 
				((DoWhileStatementContext)_localctx).stmt = do_while_statement();
				}
				break;
			case 13:
				_localctx = new RaiseStatementContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(737); 
				((RaiseStatementContext)_localctx).stmt = raise_statement();
				}
				break;
			case 14:
				_localctx = new TryStatementContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(738); 
				((TryStatementContext)_localctx).stmt = try_statement();
				}
				break;
			case 15:
				_localctx = new WriteStatementContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(739); 
				((WriteStatementContext)_localctx).stmt = write_statement();
				}
				break;
			case 16:
				_localctx = new WithResourceStatementContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(740); 
				((WithResourceStatementContext)_localctx).stmt = with_resource_statement();
				}
				break;
			case 17:
				_localctx = new WithSingletonStatementContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(741); 
				((WithSingletonStatementContext)_localctx).stmt = with_singleton_statement();
				}
				break;
			case 18:
				_localctx = new ClosureStatementContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(742); 
				((ClosureStatementContext)_localctx).decl = concrete_method_declaration();
				}
				break;
			case 19:
				_localctx = new CommentStatementContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(743); 
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
			setState(746); 
			match(FLUSH);
			setState(747); 
			match(LPAR);
			setState(748); 
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
			setState(770);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(750); 
				match(DELETE);
				setState(751); 
				match(LPAR);
				setState(752); 
				((Store_statementContext)_localctx).to_del = expression_list();
				setState(753); 
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(755); 
				match(STORE);
				setState(756); 
				match(LPAR);
				setState(757); 
				((Store_statementContext)_localctx).to_add = expression_list();
				setState(758); 
				match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(760); 
				match(DELETE);
				setState(761); 
				match(LPAR);
				setState(762); 
				((Store_statementContext)_localctx).to_del = expression_list();
				setState(763); 
				match(RPAR);
				setState(764); 
				match(AND);
				setState(765); 
				match(STORE);
				setState(766); 
				match(LPAR);
				setState(767); 
				((Store_statementContext)_localctx).to_add = expression_list();
				setState(768); 
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
			setState(772); 
			((Method_callContext)_localctx).method = method_selector();
			setState(773); 
			match(LPAR);
			setState(775);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (EXECUTE - 98)) | (1L << (FETCH - 98)) | (1L << (MUTABLE - 98)) | (1L << (NONE - 98)) | (1L << (NOT - 98)) | (1L << (READ - 98)) | (1L << (SELF - 98)) | (1L << (SORTED - 98)) | (1L << (THIS - 98)) | (1L << (BOOLEAN_LITERAL - 98)) | (1L << (CHAR_LITERAL - 98)) | (1L << (MIN_INTEGER - 98)) | (1L << (MAX_INTEGER - 98)) | (1L << (SYMBOL_IDENTIFIER - 98)) | (1L << (TYPE_IDENTIFIER - 98)))) != 0) || ((((_la - 162)) & ~0x3f) == 0 && ((1L << (_la - 162)) & ((1L << (VARIABLE_IDENTIFIER - 162)) | (1L << (TEXT_LITERAL - 162)) | (1L << (UUID_LITERAL - 162)) | (1L << (INTEGER_LITERAL - 162)) | (1L << (HEXA_LITERAL - 162)) | (1L << (DECIMAL_LITERAL - 162)) | (1L << (DATETIME_LITERAL - 162)) | (1L << (TIME_LITERAL - 162)) | (1L << (DATE_LITERAL - 162)) | (1L << (PERIOD_LITERAL - 162)))) != 0)) {
				{
				setState(774); 
				((Method_callContext)_localctx).args = argument_assignment_list(0);
				}
			}

			setState(777); 
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
			setState(784);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				_localctx = new MethodNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(779); 
				((MethodNameContext)_localctx).name = method_identifier();
				}
				break;
			case 2:
				_localctx = new MethodParentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(780); 
				((MethodParentContext)_localctx).parent = callable_parent(0);
				setState(781); 
				match(DOT);
				setState(782); 
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

			setState(787); 
			((CallableRootContext)_localctx).name = identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(793);
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
					setState(789);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(790); 
					((CallableSelectorContext)_localctx).select = callable_selector();
					}
					} 
				}
				setState(795);
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
			setState(802);
			switch (_input.LA(1)) {
			case DOT:
				_localctx = new CallableMemberSelectorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(796); 
				match(DOT);
				setState(797); 
				((CallableMemberSelectorContext)_localctx).name = variable_identifier();
				}
				break;
			case LBRAK:
				_localctx = new CallableItemSelectorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(798); 
				match(LBRAK);
				setState(799); 
				((CallableItemSelectorContext)_localctx).exp = expression(0);
				setState(800); 
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
			setState(804); 
			match(WITH);
			setState(805); 
			((With_resource_statementContext)_localctx).stmt = assign_variable_statement();
			setState(806); 
			match(COLON);
			setState(807); 
			indent();
			setState(808); 
			((With_resource_statementContext)_localctx).stmts = statement_list();
			setState(809); 
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
			setState(811); 
			match(WITH);
			setState(812); 
			((With_singleton_statementContext)_localctx).typ = type_identifier();
			setState(813); 
			match(COLON);
			setState(814); 
			indent();
			setState(815); 
			((With_singleton_statementContext)_localctx).stmts = statement_list();
			setState(816); 
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
			setState(818); 
			match(SWITCH);
			setState(819); 
			match(ON);
			setState(820); 
			((Switch_statementContext)_localctx).exp = expression(0);
			setState(821); 
			match(COLON);
			setState(822); 
			indent();
			setState(823); 
			((Switch_statementContext)_localctx).cases = switch_case_statement_list();
			setState(831);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(824); 
				lfp();
				setState(825); 
				match(OTHERWISE);
				setState(826); 
				match(COLON);
				setState(827); 
				indent();
				setState(828); 
				((Switch_statementContext)_localctx).stmts = statement_list();
				setState(829); 
				dedent();
				}
				break;
			}
			setState(833); 
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
			setState(850);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				_localctx = new AtomicSwitchCaseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(835); 
				match(WHEN);
				setState(836); 
				((AtomicSwitchCaseContext)_localctx).exp = atomic_literal();
				setState(837); 
				match(COLON);
				setState(838); 
				indent();
				setState(839); 
				((AtomicSwitchCaseContext)_localctx).stmts = statement_list();
				setState(840); 
				dedent();
				}
				break;
			case 2:
				_localctx = new CollectionSwitchCaseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(842); 
				match(WHEN);
				setState(843); 
				match(IN);
				setState(844); 
				((CollectionSwitchCaseContext)_localctx).exp = literal_collection();
				setState(845); 
				match(COLON);
				setState(846); 
				indent();
				setState(847); 
				((CollectionSwitchCaseContext)_localctx).stmts = statement_list();
				setState(848); 
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
			setState(852); 
			match(FOR);
			setState(853); 
			((For_each_statementContext)_localctx).name1 = variable_identifier();
			setState(856);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(854); 
				match(COMMA);
				setState(855); 
				((For_each_statementContext)_localctx).name2 = variable_identifier();
				}
			}

			setState(858); 
			match(IN);
			setState(859); 
			((For_each_statementContext)_localctx).source = expression(0);
			setState(860); 
			match(COLON);
			setState(861); 
			indent();
			setState(862); 
			((For_each_statementContext)_localctx).stmts = statement_list();
			setState(863); 
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
			setState(865); 
			match(DO);
			setState(866); 
			match(COLON);
			setState(867); 
			indent();
			setState(868); 
			((Do_while_statementContext)_localctx).stmts = statement_list();
			setState(869); 
			dedent();
			setState(870); 
			lfp();
			setState(871); 
			match(WHILE);
			setState(872); 
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
			setState(874); 
			match(WHILE);
			setState(875); 
			((While_statementContext)_localctx).exp = expression(0);
			setState(876); 
			match(COLON);
			setState(877); 
			indent();
			setState(878); 
			((While_statementContext)_localctx).stmts = statement_list();
			setState(879); 
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
			setState(881); 
			match(IF);
			setState(882); 
			((If_statementContext)_localctx).exp = expression(0);
			setState(883); 
			match(COLON);
			setState(884); 
			indent();
			setState(885); 
			((If_statementContext)_localctx).stmts = statement_list();
			setState(886); 
			dedent();
			setState(890);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(887); 
				lfp();
				setState(888); 
				((If_statementContext)_localctx).elseIfs = else_if_statement_list(0);
				}
				break;
			}
			setState(899);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(892); 
				lfp();
				setState(893); 
				match(ELSE);
				setState(894); 
				match(COLON);
				setState(895); 
				indent();
				setState(896); 
				((If_statementContext)_localctx).elseStmts = statement_list();
				setState(897); 
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

			setState(902); 
			match(ELSE);
			setState(903); 
			match(IF);
			setState(904); 
			((ElseIfStatementListContext)_localctx).exp = expression(0);
			setState(905); 
			match(COLON);
			setState(906); 
			indent();
			setState(907); 
			((ElseIfStatementListContext)_localctx).stmts = statement_list();
			setState(908); 
			dedent();
			}
			_ctx.stop = _input.LT(-1);
			setState(922);
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
					setState(910);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(911); 
					lfp();
					setState(912); 
					match(ELSE);
					setState(913); 
					match(IF);
					setState(914); 
					((ElseIfStatementListItemContext)_localctx).exp = expression(0);
					setState(915); 
					match(COLON);
					setState(916); 
					indent();
					setState(917); 
					((ElseIfStatementListItemContext)_localctx).stmts = statement_list();
					setState(918); 
					dedent();
					}
					} 
				}
				setState(924);
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
			setState(925); 
			match(RAISE);
			setState(926); 
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
			setState(928); 
			match(TRY);
			setState(929); 
			((Try_statementContext)_localctx).name = variable_identifier();
			setState(930); 
			match(COLON);
			setState(931); 
			indent();
			setState(932); 
			((Try_statementContext)_localctx).stmts = statement_list();
			setState(933); 
			dedent();
			setState(934); 
			lfs();
			setState(936);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(935); 
				((Try_statementContext)_localctx).handlers = catch_statement_list();
				}
				break;
			}
			setState(945);
			_la = _input.LA(1);
			if (_la==EXCEPT) {
				{
				setState(938); 
				match(EXCEPT);
				setState(939); 
				match(COLON);
				setState(940); 
				indent();
				setState(941); 
				((Try_statementContext)_localctx).anyStmts = statement_list();
				setState(942); 
				dedent();
				setState(943); 
				lfs();
				}
			}

			setState(954);
			_la = _input.LA(1);
			if (_la==FINALLY) {
				{
				setState(947); 
				match(FINALLY);
				setState(948); 
				match(COLON);
				setState(949); 
				indent();
				setState(950); 
				((Try_statementContext)_localctx).finalStmts = statement_list();
				setState(951); 
				dedent();
				setState(952); 
				lfs();
				}
			}

			setState(956); 
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
			setState(977);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				_localctx = new CatchAtomicStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(958); 
				match(EXCEPT);
				setState(959); 
				((CatchAtomicStatementContext)_localctx).name = symbol_identifier();
				setState(960); 
				match(COLON);
				setState(961); 
				indent();
				setState(962); 
				((CatchAtomicStatementContext)_localctx).stmts = statement_list();
				setState(963); 
				dedent();
				setState(964); 
				lfs();
				}
				break;
			case 2:
				_localctx = new CatchCollectionStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(966); 
				match(EXCEPT);
				setState(967); 
				match(IN);
				setState(968); 
				match(LBRAK);
				setState(969); 
				((CatchCollectionStatementContext)_localctx).exp = symbol_list();
				setState(970); 
				match(RBRAK);
				setState(971); 
				match(COLON);
				setState(972); 
				indent();
				setState(973); 
				((CatchCollectionStatementContext)_localctx).stmts = statement_list();
				setState(974); 
				dedent();
				setState(975); 
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
			setState(979); 
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
			setState(981); 
			match(RETURN);
			setState(983);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (EXECUTE - 98)) | (1L << (FETCH - 98)) | (1L << (MUTABLE - 98)) | (1L << (NONE - 98)) | (1L << (NOT - 98)) | (1L << (READ - 98)) | (1L << (SELF - 98)) | (1L << (SORTED - 98)) | (1L << (THIS - 98)) | (1L << (BOOLEAN_LITERAL - 98)) | (1L << (CHAR_LITERAL - 98)) | (1L << (MIN_INTEGER - 98)) | (1L << (MAX_INTEGER - 98)) | (1L << (SYMBOL_IDENTIFIER - 98)) | (1L << (TYPE_IDENTIFIER - 98)))) != 0) || ((((_la - 162)) & ~0x3f) == 0 && ((1L << (_la - 162)) & ((1L << (VARIABLE_IDENTIFIER - 162)) | (1L << (TEXT_LITERAL - 162)) | (1L << (UUID_LITERAL - 162)) | (1L << (INTEGER_LITERAL - 162)) | (1L << (HEXA_LITERAL - 162)) | (1L << (DECIMAL_LITERAL - 162)) | (1L << (DATETIME_LITERAL - 162)) | (1L << (TIME_LITERAL - 162)) | (1L << (DATE_LITERAL - 162)) | (1L << (PERIOD_LITERAL - 162)))) != 0)) {
				{
				setState(982); 
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
			setState(1003);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				_localctx = new MinusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(986); 
				match(MINUS);
				setState(987); 
				((MinusExpressionContext)_localctx).exp = expression(32);
				}
				break;
			case 2:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(988); 
				match(NOT);
				setState(989); 
				((NotExpressionContext)_localctx).exp = expression(31);
				}
				break;
			case 3:
				{
				_localctx = new InstanceExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(990); 
				((InstanceExpressionContext)_localctx).exp = instance_expression(0);
				}
				break;
			case 4:
				{
				_localctx = new MethodExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(991); 
				((MethodExpressionContext)_localctx).exp = method_expression();
				}
				break;
			case 5:
				{
				_localctx = new CodeExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(992); 
				match(CODE);
				setState(993); 
				match(LPAR);
				setState(994); 
				((CodeExpressionContext)_localctx).exp = expression(0);
				setState(995); 
				match(RPAR);
				}
				break;
			case 6:
				{
				_localctx = new ExecuteExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(997); 
				match(EXECUTE);
				setState(998); 
				match(LPAR);
				setState(999); 
				((ExecuteExpressionContext)_localctx).name = variable_identifier();
				setState(1000); 
				match(RPAR);
				}
				break;
			case 7:
				{
				_localctx = new ClosureExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1002); 
				((ClosureExpressionContext)_localctx).exp = closure_expression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1109);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1107);
					switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplyExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((MultiplyExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1005);
						if (!(precpred(_ctx, 30))) throw new FailedPredicateException(this, "precpred(_ctx, 30)");
						setState(1006); 
						multiply();
						setState(1007); 
						((MultiplyExpressionContext)_localctx).right = expression(31);
						}
						break;
					case 2:
						{
						_localctx = new DivideExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((DivideExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1009);
						if (!(precpred(_ctx, 29))) throw new FailedPredicateException(this, "precpred(_ctx, 29)");
						setState(1010); 
						divide();
						setState(1011); 
						((DivideExpressionContext)_localctx).right = expression(30);
						}
						break;
					case 3:
						{
						_localctx = new ModuloExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ModuloExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1013);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(1014); 
						modulo();
						setState(1015); 
						((ModuloExpressionContext)_localctx).right = expression(29);
						}
						break;
					case 4:
						{
						_localctx = new IntDivideExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((IntDivideExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1017);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(1018); 
						idivide();
						setState(1019); 
						((IntDivideExpressionContext)_localctx).right = expression(28);
						}
						break;
					case 5:
						{
						_localctx = new AddExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((AddExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1021);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(1022);
						((AddExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((AddExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(1023); 
						((AddExpressionContext)_localctx).right = expression(27);
						}
						break;
					case 6:
						{
						_localctx = new LessThanExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((LessThanExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1024);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(1025); 
						match(LT);
						setState(1026); 
						((LessThanExpressionContext)_localctx).right = expression(26);
						}
						break;
					case 7:
						{
						_localctx = new LessThanOrEqualExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((LessThanOrEqualExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1027);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(1028); 
						match(LTE);
						setState(1029); 
						((LessThanOrEqualExpressionContext)_localctx).right = expression(25);
						}
						break;
					case 8:
						{
						_localctx = new GreaterThanExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((GreaterThanExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1030);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(1031); 
						match(GT);
						setState(1032); 
						((GreaterThanExpressionContext)_localctx).right = expression(24);
						}
						break;
					case 9:
						{
						_localctx = new GreaterThanOrEqualExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((GreaterThanOrEqualExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1033);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(1034); 
						match(GTE);
						setState(1035); 
						((GreaterThanOrEqualExpressionContext)_localctx).right = expression(23);
						}
						break;
					case 10:
						{
						_localctx = new EqualsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((EqualsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1036);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1037); 
						match(EQ2);
						setState(1038); 
						((EqualsExpressionContext)_localctx).right = expression(20);
						}
						break;
					case 11:
						{
						_localctx = new NotEqualsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((NotEqualsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1039);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1040); 
						match(XEQ);
						setState(1041); 
						((NotEqualsExpressionContext)_localctx).right = expression(19);
						}
						break;
					case 12:
						{
						_localctx = new RoughlyEqualsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((RoughlyEqualsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1042);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1043); 
						match(TEQ);
						setState(1044); 
						((RoughlyEqualsExpressionContext)_localctx).right = expression(18);
						}
						break;
					case 13:
						{
						_localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((OrExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1045);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1046); 
						match(OR);
						setState(1047); 
						((OrExpressionContext)_localctx).right = expression(17);
						}
						break;
					case 14:
						{
						_localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((AndExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1048);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1049); 
						match(AND);
						setState(1050); 
						((AndExpressionContext)_localctx).right = expression(16);
						}
						break;
					case 15:
						{
						_localctx = new TernaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((TernaryExpressionContext)_localctx).ifTrue = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1051);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1052); 
						match(IF);
						setState(1053); 
						((TernaryExpressionContext)_localctx).test = expression(0);
						setState(1054); 
						match(ELSE);
						setState(1055); 
						((TernaryExpressionContext)_localctx).ifFalse = expression(15);
						}
						break;
					case 16:
						{
						_localctx = new InExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((InExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1057);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1058); 
						match(IN);
						setState(1059); 
						((InExpressionContext)_localctx).right = expression(13);
						}
						break;
					case 17:
						{
						_localctx = new ContainsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ContainsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1060);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1061); 
						match(CONTAINS);
						setState(1062); 
						((ContainsExpressionContext)_localctx).right = expression(12);
						}
						break;
					case 18:
						{
						_localctx = new ContainsAllExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ContainsAllExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1063);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1064); 
						match(CONTAINS);
						setState(1065); 
						match(ALL);
						setState(1066); 
						((ContainsAllExpressionContext)_localctx).right = expression(11);
						}
						break;
					case 19:
						{
						_localctx = new ContainsAnyExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ContainsAnyExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1067);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1068); 
						match(CONTAINS);
						setState(1069); 
						match(ANY);
						setState(1070); 
						((ContainsAnyExpressionContext)_localctx).right = expression(10);
						}
						break;
					case 20:
						{
						_localctx = new NotInExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((NotInExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1071);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1072); 
						match(NOT);
						setState(1073); 
						match(IN);
						setState(1074); 
						((NotInExpressionContext)_localctx).right = expression(9);
						}
						break;
					case 21:
						{
						_localctx = new NotContainsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((NotContainsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1075);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1076); 
						match(NOT);
						setState(1077); 
						match(CONTAINS);
						setState(1078); 
						((NotContainsExpressionContext)_localctx).right = expression(8);
						}
						break;
					case 22:
						{
						_localctx = new NotContainsAllExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((NotContainsAllExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1079);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1080); 
						match(NOT);
						setState(1081); 
						match(CONTAINS);
						setState(1082); 
						match(ALL);
						setState(1083); 
						((NotContainsAllExpressionContext)_localctx).right = expression(7);
						}
						break;
					case 23:
						{
						_localctx = new NotContainsAnyExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((NotContainsAnyExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1084);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1085); 
						match(NOT);
						setState(1086); 
						match(CONTAINS);
						setState(1087); 
						match(ANY);
						setState(1088); 
						((NotContainsAnyExpressionContext)_localctx).right = expression(6);
						}
						break;
					case 24:
						{
						_localctx = new IteratorExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((IteratorExpressionContext)_localctx).exp = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1089);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1090); 
						match(FOR);
						setState(1091); 
						((IteratorExpressionContext)_localctx).name = variable_identifier();
						setState(1092); 
						match(IN);
						setState(1093); 
						((IteratorExpressionContext)_localctx).source = expression(2);
						}
						break;
					case 25:
						{
						_localctx = new FilteredListExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((FilteredListExpressionContext)_localctx).src = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1095);
						if (!(precpred(_ctx, 34))) throw new FailedPredicateException(this, "precpred(_ctx, 34)");
						setState(1096); 
						filtered_list_suffix();
						}
						break;
					case 26:
						{
						_localctx = new IsNotExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((IsNotExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1097);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1098); 
						match(IS);
						setState(1099); 
						match(NOT);
						setState(1100); 
						((IsNotExpressionContext)_localctx).right = is_expression();
						}
						break;
					case 27:
						{
						_localctx = new IsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((IsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1101);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1102); 
						match(IS);
						setState(1103); 
						((IsExpressionContext)_localctx).right = is_expression();
						}
						break;
					case 28:
						{
						_localctx = new CastExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((CastExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1104);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1105); 
						match(AS);
						setState(1106); 
						((CastExpressionContext)_localctx).right = category_or_any_type();
						}
						break;
					}
					} 
				}
				setState(1111);
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
			setState(1112); 
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

			setState(1115); 
			((SelectableExpressionContext)_localctx).parent = selectable_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(1121);
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
					setState(1117);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1118); 
					((SelectorExpressionContext)_localctx).selector = instance_selector();
					}
					} 
				}
				setState(1123);
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
			setState(1132);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1124); 
				blob_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1125); 
				document_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1126); 
				fetch_store_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1127); 
				read_all_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1128); 
				read_one_expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1129); 
				sorted_expression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1130); 
				method_call();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1131); 
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
			setState(1147);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				_localctx = new MemberSelectorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1134);
				if (!(this.wasNot(MParser.WS))) throw new FailedPredicateException(this, "$parser.wasNot(MParser.WS)");
				setState(1135); 
				match(DOT);
				setState(1136); 
				((MemberSelectorContext)_localctx).name = variable_identifier();
				}
				break;
			case 2:
				_localctx = new SliceSelectorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1137);
				if (!(this.wasNot(MParser.WS))) throw new FailedPredicateException(this, "$parser.wasNot(MParser.WS)");
				setState(1138); 
				match(LBRAK);
				setState(1139); 
				((SliceSelectorContext)_localctx).xslice = slice_arguments();
				setState(1140); 
				match(RBRAK);
				}
				break;
			case 3:
				_localctx = new ItemSelectorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1142);
				if (!(this.wasNot(MParser.WS))) throw new FailedPredicateException(this, "$parser.wasNot(MParser.WS)");
				setState(1143); 
				match(LBRAK);
				setState(1144); 
				((ItemSelectorContext)_localctx).exp = expression(0);
				setState(1145); 
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
			setState(1149); 
			match(BLOB);
			setState(1150); 
			match(LPAR);
			setState(1152);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (EXECUTE - 98)) | (1L << (FETCH - 98)) | (1L << (MUTABLE - 98)) | (1L << (NONE - 98)) | (1L << (NOT - 98)) | (1L << (READ - 98)) | (1L << (SELF - 98)) | (1L << (SORTED - 98)) | (1L << (THIS - 98)) | (1L << (BOOLEAN_LITERAL - 98)) | (1L << (CHAR_LITERAL - 98)) | (1L << (MIN_INTEGER - 98)) | (1L << (MAX_INTEGER - 98)) | (1L << (SYMBOL_IDENTIFIER - 98)) | (1L << (TYPE_IDENTIFIER - 98)))) != 0) || ((((_la - 162)) & ~0x3f) == 0 && ((1L << (_la - 162)) & ((1L << (VARIABLE_IDENTIFIER - 162)) | (1L << (TEXT_LITERAL - 162)) | (1L << (UUID_LITERAL - 162)) | (1L << (INTEGER_LITERAL - 162)) | (1L << (HEXA_LITERAL - 162)) | (1L << (DECIMAL_LITERAL - 162)) | (1L << (DATETIME_LITERAL - 162)) | (1L << (TIME_LITERAL - 162)) | (1L << (DATE_LITERAL - 162)) | (1L << (PERIOD_LITERAL - 162)))) != 0)) {
				{
				setState(1151); 
				expression(0);
				}
			}

			setState(1154); 
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
			setState(1156); 
			match(DOCUMENT);
			setState(1157); 
			match(LPAR);
			setState(1159);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (EXECUTE - 98)) | (1L << (FETCH - 98)) | (1L << (MUTABLE - 98)) | (1L << (NONE - 98)) | (1L << (NOT - 98)) | (1L << (READ - 98)) | (1L << (SELF - 98)) | (1L << (SORTED - 98)) | (1L << (THIS - 98)) | (1L << (BOOLEAN_LITERAL - 98)) | (1L << (CHAR_LITERAL - 98)) | (1L << (MIN_INTEGER - 98)) | (1L << (MAX_INTEGER - 98)) | (1L << (SYMBOL_IDENTIFIER - 98)) | (1L << (TYPE_IDENTIFIER - 98)))) != 0) || ((((_la - 162)) & ~0x3f) == 0 && ((1L << (_la - 162)) & ((1L << (VARIABLE_IDENTIFIER - 162)) | (1L << (TEXT_LITERAL - 162)) | (1L << (UUID_LITERAL - 162)) | (1L << (INTEGER_LITERAL - 162)) | (1L << (HEXA_LITERAL - 162)) | (1L << (DECIMAL_LITERAL - 162)) | (1L << (DATETIME_LITERAL - 162)) | (1L << (TIME_LITERAL - 162)) | (1L << (DATE_LITERAL - 162)) | (1L << (PERIOD_LITERAL - 162)))) != 0)) {
				{
				setState(1158); 
				expression(0);
				}
			}

			setState(1161); 
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
			setState(1163); 
			((Constructor_expressionContext)_localctx).typ = mutable_category_type();
			setState(1164); 
			match(LPAR);
			setState(1166);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (EXECUTE - 98)) | (1L << (FETCH - 98)) | (1L << (MUTABLE - 98)) | (1L << (NONE - 98)) | (1L << (NOT - 98)) | (1L << (READ - 98)) | (1L << (SELF - 98)) | (1L << (SORTED - 98)) | (1L << (THIS - 98)) | (1L << (BOOLEAN_LITERAL - 98)) | (1L << (CHAR_LITERAL - 98)) | (1L << (MIN_INTEGER - 98)) | (1L << (MAX_INTEGER - 98)) | (1L << (SYMBOL_IDENTIFIER - 98)) | (1L << (TYPE_IDENTIFIER - 98)))) != 0) || ((((_la - 162)) & ~0x3f) == 0 && ((1L << (_la - 162)) & ((1L << (VARIABLE_IDENTIFIER - 162)) | (1L << (TEXT_LITERAL - 162)) | (1L << (UUID_LITERAL - 162)) | (1L << (INTEGER_LITERAL - 162)) | (1L << (HEXA_LITERAL - 162)) | (1L << (DECIMAL_LITERAL - 162)) | (1L << (DATETIME_LITERAL - 162)) | (1L << (TIME_LITERAL - 162)) | (1L << (DATE_LITERAL - 162)) | (1L << (PERIOD_LITERAL - 162)))) != 0)) {
				{
				setState(1165); 
				((Constructor_expressionContext)_localctx).args = argument_assignment_list(0);
				}
			}

			setState(1168); 
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
			setState(1175);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				_localctx = new ExpressionAssignmentListContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1171); 
				((ExpressionAssignmentListContext)_localctx).exp = expression(0);
				setState(1172);
				if (!(this.willNotBe(this.equalToken()))) throw new FailedPredicateException(this, "$parser.willNotBe($parser.equalToken())");
				}
				break;
			case 2:
				{
				_localctx = new ArgumentAssignmentListContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1174); 
				((ArgumentAssignmentListContext)_localctx).item = argument_assignment();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1182);
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
					setState(1177);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1178); 
					match(COMMA);
					setState(1179); 
					((ArgumentAssignmentListItemContext)_localctx).item = argument_assignment();
					}
					} 
				}
				setState(1184);
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
			setState(1185); 
			((Argument_assignmentContext)_localctx).name = variable_identifier();
			setState(1186); 
			assign();
			setState(1187); 
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
			setState(1189); 
			match(WRITE);
			setState(1190); 
			((Write_statementContext)_localctx).what = expression(0);
			setState(1191); 
			match(TO);
			setState(1192); 
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
			setState(1194); 
			match(FILTERED);
			setState(1195); 
			match(WITH);
			setState(1196); 
			((Filtered_list_suffixContext)_localctx).name = variable_identifier();
			setState(1197); 
			match(WHERE);
			setState(1198); 
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
			setState(1230);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				_localctx = new FetchOneContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1200); 
				match(FETCH);
				setState(1201); 
				match(ONE);
				setState(1203);
				_la = _input.LA(1);
				if (_la==MUTABLE || _la==TYPE_IDENTIFIER) {
					{
					setState(1202); 
					((FetchOneContext)_localctx).typ = mutable_category_type();
					}
				}

				setState(1205); 
				match(WHERE);
				setState(1206); 
				((FetchOneContext)_localctx).predicate = expression(0);
				}
				break;
			case 2:
				_localctx = new FetchManyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1207); 
				match(FETCH);
				setState(1214);
				switch (_input.LA(1)) {
				case ALL:
					{
					setState(1208); 
					match(ALL);
					}
					break;
				case ROWS:
					{
					setState(1209); 
					match(ROWS);
					setState(1210); 
					((FetchManyContext)_localctx).xstart = expression(0);
					setState(1211); 
					match(TO);
					setState(1212); 
					((FetchManyContext)_localctx).xstop = expression(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1216); 
				match(LPAR);
				setState(1218);
				_la = _input.LA(1);
				if (_la==MUTABLE || _la==TYPE_IDENTIFIER) {
					{
					setState(1217); 
					((FetchManyContext)_localctx).typ = mutable_category_type();
					}
				}

				setState(1220); 
				match(RPAR);
				setState(1223);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(1221); 
					match(WHERE);
					setState(1222); 
					((FetchManyContext)_localctx).predicate = expression(0);
					}
					break;
				}
				setState(1228);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(1225); 
					match(ORDER);
					setState(1226); 
					match(BY);
					setState(1227); 
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
			setState(1232); 
			match(SORTED);
			setState(1234);
			_la = _input.LA(1);
			if (_la==DESC) {
				{
				setState(1233); 
				match(DESC);
				}
			}

			setState(1236); 
			match(LPAR);
			setState(1237); 
			((Sorted_expressionContext)_localctx).source = instance_expression(0);
			setState(1243);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1238); 
				match(COMMA);
				setState(1239); 
				key_token();
				setState(1240); 
				match(EQ);
				setState(1241); 
				((Sorted_expressionContext)_localctx).key = instance_expression(0);
				}
			}

			setState(1245); 
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
			setState(1247); 
			((Assign_instance_statementContext)_localctx).inst = assignable_instance(0);
			setState(1248); 
			assign();
			setState(1249); 
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
			setState(1259);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				_localctx = new MemberInstanceContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1251);
				if (!(this.wasNot(MParser.WS))) throw new FailedPredicateException(this, "$parser.wasNot(MParser.WS)");
				setState(1252); 
				match(DOT);
				setState(1253); 
				((MemberInstanceContext)_localctx).name = variable_identifier();
				}
				break;
			case 2:
				_localctx = new ItemInstanceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1254);
				if (!(this.wasNot(MParser.WS))) throw new FailedPredicateException(this, "$parser.wasNot(MParser.WS)");
				setState(1255); 
				match(LBRAK);
				setState(1256); 
				((ItemInstanceContext)_localctx).exp = expression(0);
				setState(1257); 
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
			setState(1261); 
			((Assign_tuple_statementContext)_localctx).items = variable_identifier_list();
			setState(1262); 
			assign();
			setState(1263); 
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
			setState(1268);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1265); 
					match(LF);
					}
					} 
				}
				setState(1270);
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
			setState(1272); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1271); 
				match(LF);
				}
				}
				setState(1274); 
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
			setState(1277); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1276); 
				match(LF);
				}
				}
				setState(1279); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LF );
			setState(1281); 
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
			setState(1286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LF) {
				{
				{
				setState(1283); 
				match(LF);
				}
				}
				setState(1288);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1289); 
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
			setState(1291); 
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
			setState(1294);
			_la = _input.LA(1);
			if (_la==COMMENT || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (ABSTRACT - 67)) | (1L << (ATTR - 67)) | (1L << (CATEGORY - 67)) | (1L << (CLASS - 67)) | (1L << (DEF - 67)) | (1L << (ENUM - 67)) | (1L << (NATIVE - 67)))) != 0) || _la==SINGLETON || _la==STORABLE) {
				{
				setState(1293); 
				declarations();
				}
			}

			setState(1296); 
			lfs();
			setState(1297); 
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
			setState(1299); 
			declaration();
			setState(1305);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1300); 
					lfp();
					setState(1301); 
					declaration();
					}
					} 
				}
				setState(1307);
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
			setState(1313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(1308); 
				comment_statement();
				setState(1309); 
				lfp();
				}
				}
				setState(1315);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1321);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(1316); 
				attribute_declaration();
				}
				break;
			case 2:
				{
				setState(1317); 
				category_declaration();
				}
				break;
			case 3:
				{
				setState(1318); 
				resource_declaration();
				}
				break;
			case 4:
				{
				setState(1319); 
				enum_declaration();
				}
				break;
			case 5:
				{
				setState(1320); 
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
			setState(1323); 
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
			setState(1327);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1325); 
				enum_category_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1326); 
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
			setState(1329); 
			native_symbol();
			setState(1335);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1330); 
					lfp();
					setState(1331); 
					native_symbol();
					}
					} 
				}
				setState(1337);
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
			setState(1338); 
			category_symbol();
			setState(1344);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1339); 
					lfp();
					setState(1340); 
					category_symbol();
					}
					} 
				}
				setState(1346);
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
			setState(1347); 
			symbol_identifier();
			setState(1352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1348); 
				match(COMMA);
				setState(1349); 
				symbol_identifier();
				}
				}
				setState(1354);
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
			setState(1365);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				_localctx = new MatchingListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1355); 
				match(IN);
				setState(1356); 
				((MatchingListContext)_localctx).source = list_literal();
				}
				break;
			case 2:
				_localctx = new MatchingSetContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1357); 
				match(IN);
				setState(1358); 
				((MatchingSetContext)_localctx).source = set_literal();
				}
				break;
			case 3:
				_localctx = new MatchingRangeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1359); 
				match(IN);
				setState(1360); 
				((MatchingRangeContext)_localctx).source = range_literal();
				}
				break;
			case 4:
				_localctx = new MatchingPatternContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1361); 
				match(MATCHING);
				setState(1362); 
				((MatchingPatternContext)_localctx).text = match(TEXT_LITERAL);
				}
				break;
			case 5:
				_localctx = new MatchingExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1363); 
				match(MATCHING);
				setState(1364); 
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
			setState(1368);
			_la = _input.LA(1);
			if (_la==MUTABLE) {
				{
				setState(1367); 
				match(MUTABLE);
				}
			}

			setState(1370); 
			match(LBRAK);
			setState(1372);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (EXECUTE - 98)) | (1L << (FETCH - 98)) | (1L << (MUTABLE - 98)) | (1L << (NONE - 98)) | (1L << (NOT - 98)) | (1L << (READ - 98)) | (1L << (SELF - 98)) | (1L << (SORTED - 98)) | (1L << (THIS - 98)) | (1L << (BOOLEAN_LITERAL - 98)) | (1L << (CHAR_LITERAL - 98)) | (1L << (MIN_INTEGER - 98)) | (1L << (MAX_INTEGER - 98)) | (1L << (SYMBOL_IDENTIFIER - 98)) | (1L << (TYPE_IDENTIFIER - 98)))) != 0) || ((((_la - 162)) & ~0x3f) == 0 && ((1L << (_la - 162)) & ((1L << (VARIABLE_IDENTIFIER - 162)) | (1L << (TEXT_LITERAL - 162)) | (1L << (UUID_LITERAL - 162)) | (1L << (INTEGER_LITERAL - 162)) | (1L << (HEXA_LITERAL - 162)) | (1L << (DECIMAL_LITERAL - 162)) | (1L << (DATETIME_LITERAL - 162)) | (1L << (TIME_LITERAL - 162)) | (1L << (DATE_LITERAL - 162)) | (1L << (PERIOD_LITERAL - 162)))) != 0)) {
				{
				setState(1371); 
				expression_list();
				}
			}

			setState(1374); 
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
			setState(1377);
			_la = _input.LA(1);
			if (_la==MUTABLE) {
				{
				setState(1376); 
				match(MUTABLE);
				}
			}

			setState(1379); 
			match(LT);
			setState(1381);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (EXECUTE - 98)) | (1L << (FETCH - 98)) | (1L << (MUTABLE - 98)) | (1L << (NONE - 98)) | (1L << (NOT - 98)) | (1L << (READ - 98)) | (1L << (SELF - 98)) | (1L << (SORTED - 98)) | (1L << (THIS - 98)) | (1L << (BOOLEAN_LITERAL - 98)) | (1L << (CHAR_LITERAL - 98)) | (1L << (MIN_INTEGER - 98)) | (1L << (MAX_INTEGER - 98)) | (1L << (SYMBOL_IDENTIFIER - 98)) | (1L << (TYPE_IDENTIFIER - 98)))) != 0) || ((((_la - 162)) & ~0x3f) == 0 && ((1L << (_la - 162)) & ((1L << (VARIABLE_IDENTIFIER - 162)) | (1L << (TEXT_LITERAL - 162)) | (1L << (UUID_LITERAL - 162)) | (1L << (INTEGER_LITERAL - 162)) | (1L << (HEXA_LITERAL - 162)) | (1L << (DECIMAL_LITERAL - 162)) | (1L << (DATETIME_LITERAL - 162)) | (1L << (TIME_LITERAL - 162)) | (1L << (DATE_LITERAL - 162)) | (1L << (PERIOD_LITERAL - 162)))) != 0)) {
				{
				setState(1380); 
				expression_list();
				}
			}

			setState(1383); 
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
			setState(1385); 
			expression(0);
			setState(1390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1386); 
				match(COMMA);
				setState(1387); 
				expression(0);
				}
				}
				setState(1392);
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
			setState(1393); 
			match(LBRAK);
			setState(1394); 
			((Range_literalContext)_localctx).low = expression(0);
			setState(1395); 
			match(RANGE);
			setState(1396); 
			((Range_literalContext)_localctx).high = expression(0);
			setState(1397); 
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
			setState(1411);
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

				setState(1400); 
				((PrimaryTypeContext)_localctx).p = primary_type();
				}
				break;
			case CURSOR:
				{
				_localctx = new CursorTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1401); 
				match(CURSOR);
				setState(1402); 
				match(LT);
				setState(1403); 
				((CursorTypeContext)_localctx).c = typedef(0);
				setState(1404); 
				match(GT);
				}
				break;
			case ITERATOR:
				{
				_localctx = new IteratorTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1406); 
				match(ITERATOR);
				setState(1407); 
				match(LT);
				setState(1408); 
				((IteratorTypeContext)_localctx).i = typedef(0);
				setState(1409); 
				match(GT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1423);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1421);
					switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
					case 1:
						{
						_localctx = new SetTypeContext(new TypedefContext(_parentctx, _parentState));
						((SetTypeContext)_localctx).s = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_typedef);
						setState(1413);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1414); 
						match(LTGT);
						}
						break;
					case 2:
						{
						_localctx = new ListTypeContext(new TypedefContext(_parentctx, _parentState));
						((ListTypeContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_typedef);
						setState(1415);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1416); 
						match(LBRAK);
						setState(1417); 
						match(RBRAK);
						}
						break;
					case 3:
						{
						_localctx = new DictTypeContext(new TypedefContext(_parentctx, _parentState));
						((DictTypeContext)_localctx).d = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_typedef);
						setState(1418);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1419); 
						match(LCURL);
						setState(1420); 
						match(RCURL);
						}
						break;
					}
					} 
				}
				setState(1425);
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
			setState(1428);
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
				setState(1426); 
				((NativeTypeContext)_localctx).n = native_type();
				}
				break;
			case TYPE_IDENTIFIER:
				_localctx = new CategoryTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1427); 
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
			setState(1444);
			switch (_input.LA(1)) {
			case BOOLEAN:
				_localctx = new BooleanTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1430); 
				match(BOOLEAN);
				}
				break;
			case CHARACTER:
				_localctx = new CharacterTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1431); 
				match(CHARACTER);
				}
				break;
			case TEXT:
				_localctx = new TextTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1432); 
				match(TEXT);
				}
				break;
			case IMAGE:
				_localctx = new ImageTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1433); 
				match(IMAGE);
				}
				break;
			case INTEGER:
				_localctx = new IntegerTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1434); 
				match(INTEGER);
				}
				break;
			case DECIMAL:
				_localctx = new DecimalTypeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1435); 
				match(DECIMAL);
				}
				break;
			case DOCUMENT:
				_localctx = new DocumentTypeContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1436); 
				match(DOCUMENT);
				}
				break;
			case DATE:
				_localctx = new DateTypeContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1437); 
				match(DATE);
				}
				break;
			case DATETIME:
				_localctx = new DateTimeTypeContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1438); 
				match(DATETIME);
				}
				break;
			case TIME:
				_localctx = new TimeTypeContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1439); 
				match(TIME);
				}
				break;
			case PERIOD:
				_localctx = new PeriodTypeContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(1440); 
				match(PERIOD);
				}
				break;
			case CODE:
				_localctx = new CodeTypeContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(1441); 
				match(CODE);
				}
				break;
			case BLOB:
				_localctx = new BlobTypeContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(1442); 
				match(BLOB);
				}
				break;
			case UUID:
				_localctx = new UUIDTypeContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(1443); 
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
			setState(1446); 
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
			setState(1449);
			_la = _input.LA(1);
			if (_la==MUTABLE) {
				{
				setState(1448); 
				match(MUTABLE);
				}
			}

			setState(1451); 
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
			setState(1453); 
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
			setState(1458);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				_localctx = new ConcreteCategoryDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1455); 
				((ConcreteCategoryDeclarationContext)_localctx).decl = concrete_category_declaration();
				}
				break;
			case 2:
				_localctx = new NativeCategoryDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1456); 
				((NativeCategoryDeclarationContext)_localctx).decl = native_category_declaration();
				}
				break;
			case 3:
				_localctx = new SingletonCategoryDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1457); 
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
			setState(1460); 
			type_identifier();
			setState(1465);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1461); 
					match(COMMA);
					setState(1462); 
					type_identifier();
					}
					} 
				}
				setState(1467);
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
			setState(1470);
			switch (_input.LA(1)) {
			case VARIABLE_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1468); 
				variable_identifier();
				}
				break;
			case TYPE_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1469); 
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
			setState(1475);
			switch (_input.LA(1)) {
			case VARIABLE_IDENTIFIER:
				_localctx = new VariableIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1472); 
				variable_identifier();
				}
				break;
			case TYPE_IDENTIFIER:
				_localctx = new TypeIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1473); 
				type_identifier();
				}
				break;
			case SYMBOL_IDENTIFIER:
				_localctx = new SymbolIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1474); 
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
			setState(1477); 
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
			setState(1479);
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
			setState(1481); 
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
			setState(1483); 
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
			setState(1485); 
			argument();
			setState(1490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1486); 
				match(COMMA);
				setState(1487); 
				argument();
				}
				}
				setState(1492);
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
			setState(1498);
			switch (_input.LA(1)) {
			case CODE:
				_localctx = new CodeArgumentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1493); 
				((CodeArgumentContext)_localctx).arg = code_argument();
				}
				break;
			case MUTABLE:
			case VARIABLE_IDENTIFIER:
				_localctx = new OperatorArgumentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1495);
				_la = _input.LA(1);
				if (_la==MUTABLE) {
					{
					setState(1494); 
					match(MUTABLE);
					}
				}

				setState(1497); 
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
			setState(1502);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1500); 
				named_argument();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1501); 
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
			setState(1504); 
			variable_identifier();
			setState(1507);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(1505); 
				match(EQ);
				setState(1506); 
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
			setState(1509); 
			code_type();
			setState(1510); 
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
			setState(1514);
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
				setState(1512); 
				typedef(0);
				}
				break;
			case ANY:
				enterOuterAlt(_localctx, 2);
				{
				setState(1513); 
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

			setState(1517); 
			match(ANY);
			}
			_ctx.stop = _input.LT(-1);
			setState(1527);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1525);
					switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
					case 1:
						{
						_localctx = new AnyListTypeContext(new Any_typeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_any_type);
						setState(1519);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1520); 
						match(LBRAK);
						setState(1521); 
						match(RBRAK);
						}
						break;
					case 2:
						{
						_localctx = new AnyDictTypeContext(new Any_typeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_any_type);
						setState(1522);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
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
			setState(1530); 
			member_method_declaration();
			setState(1536);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1531); 
					lfp();
					setState(1532); 
					member_method_declaration();
					}
					} 
				}
				setState(1538);
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
			setState(1544);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1539); 
				setter_method_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1540); 
				getter_method_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1541); 
				concrete_method_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1542); 
				abstract_method_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1543); 
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
			setState(1546); 
			native_member_method_declaration();
			setState(1552);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1547); 
					lfp();
					setState(1548); 
					native_member_method_declaration();
					}
					} 
				}
				setState(1554);
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
			setState(1558);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1555); 
				native_getter_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1556); 
				native_setter_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1557); 
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
			setState(1570);
			switch (_input.LA(1)) {
			case JAVA:
				_localctx = new JavaCategoryBindingContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1560); 
				match(JAVA);
				setState(1561); 
				((JavaCategoryBindingContext)_localctx).binding = java_class_identifier_expression(0);
				}
				break;
			case CSHARP:
				_localctx = new CSharpCategoryBindingContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1562); 
				match(CSHARP);
				setState(1563); 
				((CSharpCategoryBindingContext)_localctx).binding = csharp_identifier_expression(0);
				}
				break;
			case PYTHON2:
				_localctx = new Python2CategoryBindingContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1564); 
				match(PYTHON2);
				setState(1565); 
				((Python2CategoryBindingContext)_localctx).binding = python_category_binding();
				}
				break;
			case PYTHON3:
				_localctx = new Python3CategoryBindingContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1566); 
				match(PYTHON3);
				setState(1567); 
				((Python3CategoryBindingContext)_localctx).binding = python_category_binding();
				}
				break;
			case JAVASCRIPT:
				_localctx = new JavaScriptCategoryBindingContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1568); 
				match(JAVASCRIPT);
				setState(1569); 
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
			setState(1572); 
			identifier();
			setState(1574);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				{
				setState(1573); 
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
			setState(1576); 
			match(FROM);
			setState(1577); 
			module_token();
			setState(1578); 
			match(COLON);
			setState(1579); 
			identifier();
			setState(1584);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1580); 
					match(DOT);
					setState(1581); 
					identifier();
					}
					} 
				}
				setState(1586);
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
			setState(1587); 
			identifier();
			setState(1589);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				{
				setState(1588); 
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
			setState(1591); 
			match(FROM);
			setState(1592); 
			module_token();
			setState(1593); 
			match(COLON);
			setState(1595);
			_la = _input.LA(1);
			if (_la==SLASH) {
				{
				setState(1594); 
				match(SLASH);
				}
			}

			setState(1597); 
			javascript_identifier();
			setState(1602);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1598); 
					match(SLASH);
					setState(1599); 
					javascript_identifier();
					}
					} 
				}
				setState(1604);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			}
			setState(1607);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				{
				setState(1605); 
				match(DOT);
				setState(1606); 
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
			setState(1609); 
			variable_identifier();
			setState(1614);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1610); 
				match(COMMA);
				setState(1611); 
				variable_identifier();
				}
				}
				setState(1616);
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
			setState(1617); 
			attribute_identifier();
			setState(1622);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1618); 
				match(COMMA);
				setState(1619); 
				attribute_identifier();
				}
				}
				setState(1624);
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
			setState(1629);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1625); 
				abstract_method_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1626); 
				concrete_method_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1627); 
				native_method_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1628); 
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
			setState(1631); 
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
			setState(1633); 
			native_statement();
			setState(1639);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1634); 
					lfp();
					setState(1635); 
					native_statement();
					}
					} 
				}
				setState(1641);
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
			setState(1652);
			switch (_input.LA(1)) {
			case JAVA:
				_localctx = new JavaNativeStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1642); 
				match(JAVA);
				setState(1643); 
				java_statement();
				}
				break;
			case CSHARP:
				_localctx = new CSharpNativeStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1644); 
				match(CSHARP);
				setState(1645); 
				csharp_statement();
				}
				break;
			case PYTHON2:
				_localctx = new Python2NativeStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1646); 
				match(PYTHON2);
				setState(1647); 
				python_native_statement();
				}
				break;
			case PYTHON3:
				_localctx = new Python3NativeStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1648); 
				match(PYTHON3);
				setState(1649); 
				python_native_statement();
				}
				break;
			case JAVASCRIPT:
				_localctx = new JavaScriptNativeStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1650); 
				match(JAVASCRIPT);
				setState(1651); 
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
			setState(1654); 
			python_statement();
			setState(1656);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1655); 
				match(SEMI);
				}
			}

			setState(1659);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(1658); 
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
			setState(1661); 
			javascript_statement();
			setState(1663);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1662); 
				match(SEMI);
				}
			}

			setState(1666);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(1665); 
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
			setState(1668); 
			statement();
			setState(1674);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1669); 
					lfp();
					setState(1670); 
					statement();
					}
					} 
				}
				setState(1676);
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
			setState(1677); 
			assertion();
			setState(1683);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1678); 
					lfp();
					setState(1679); 
					assertion();
					}
					} 
				}
				setState(1685);
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
			setState(1686); 
			switch_case_statement();
			setState(1692);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1687); 
					lfp();
					setState(1688); 
					switch_case_statement();
					}
					} 
				}
				setState(1694);
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
			setState(1695); 
			catch_statement();
			setState(1701);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1696); 
					lfp();
					setState(1697); 
					catch_statement();
					}
					} 
				}
				setState(1703);
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
			setState(1718);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				_localctx = new LiteralRangeLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1704); 
				match(LBRAK);
				setState(1705); 
				((LiteralRangeLiteralContext)_localctx).low = atomic_literal();
				setState(1706); 
				match(RANGE);
				setState(1707); 
				((LiteralRangeLiteralContext)_localctx).high = atomic_literal();
				setState(1708); 
				match(RBRAK);
				}
				break;
			case 2:
				_localctx = new LiteralListLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1710); 
				match(LBRAK);
				setState(1711); 
				literal_list_literal();
				setState(1712); 
				match(RBRAK);
				}
				break;
			case 3:
				_localctx = new LiteralSetLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1714); 
				match(LT);
				setState(1715); 
				literal_list_literal();
				setState(1716); 
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
			setState(1734);
			switch (_input.LA(1)) {
			case MIN_INTEGER:
				_localctx = new MinIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1720); 
				((MinIntegerLiteralContext)_localctx).t = match(MIN_INTEGER);
				}
				break;
			case MAX_INTEGER:
				_localctx = new MaxIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1721); 
				((MaxIntegerLiteralContext)_localctx).t = match(MAX_INTEGER);
				}
				break;
			case INTEGER_LITERAL:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1722); 
				((IntegerLiteralContext)_localctx).t = match(INTEGER_LITERAL);
				}
				break;
			case HEXA_LITERAL:
				_localctx = new HexadecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1723); 
				((HexadecimalLiteralContext)_localctx).t = match(HEXA_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new CharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1724); 
				((CharacterLiteralContext)_localctx).t = match(CHAR_LITERAL);
				}
				break;
			case DATE_LITERAL:
				_localctx = new DateLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1725); 
				((DateLiteralContext)_localctx).t = match(DATE_LITERAL);
				}
				break;
			case TIME_LITERAL:
				_localctx = new TimeLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1726); 
				((TimeLiteralContext)_localctx).t = match(TIME_LITERAL);
				}
				break;
			case TEXT_LITERAL:
				_localctx = new TextLiteralContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1727); 
				((TextLiteralContext)_localctx).t = match(TEXT_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1728); 
				((DecimalLiteralContext)_localctx).t = match(DECIMAL_LITERAL);
				}
				break;
			case DATETIME_LITERAL:
				_localctx = new DateTimeLiteralContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1729); 
				((DateTimeLiteralContext)_localctx).t = match(DATETIME_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(1730); 
				((BooleanLiteralContext)_localctx).t = match(BOOLEAN_LITERAL);
				}
				break;
			case PERIOD_LITERAL:
				_localctx = new PeriodLiteralContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(1731); 
				((PeriodLiteralContext)_localctx).t = match(PERIOD_LITERAL);
				}
				break;
			case UUID_LITERAL:
				_localctx = new UUIDLiteralContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(1732); 
				((UUIDLiteralContext)_localctx).t = match(UUID_LITERAL);
				}
				break;
			case NONE:
				_localctx = new NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(1733); 
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
			setState(1736); 
			atomic_literal();
			setState(1741);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1737); 
				match(COMMA);
				setState(1738); 
				atomic_literal();
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
			setState(1748);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				_localctx = new ParenthesisExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1744); 
				((ParenthesisExpressionContext)_localctx).exp = parenthesis_expression();
				}
				break;
			case 2:
				_localctx = new LiteralExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1745); 
				((LiteralExpressionContext)_localctx).exp = literal_expression();
				}
				break;
			case 3:
				_localctx = new IdentifierExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1746); 
				((IdentifierExpressionContext)_localctx).exp = identifier();
				}
				break;
			case 4:
				_localctx = new ThisExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1747); 
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
			setState(1750);
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
			setState(1752); 
			match(LPAR);
			setState(1753); 
			expression(0);
			setState(1754); 
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
			setState(1758);
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
				enterOuterAlt(_localctx, 1);
				{
				setState(1756); 
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
				setState(1757); 
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
			setState(1765);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1760); 
				range_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1761); 
				list_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1762); 
				set_literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1763); 
				dict_literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1764); 
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
			setState(1768);
			_la = _input.LA(1);
			if (_la==MUTABLE) {
				{
				setState(1767); 
				match(MUTABLE);
				}
			}

			setState(1770); 
			match(LPAR);
			setState(1772);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (EXECUTE - 98)) | (1L << (FETCH - 98)) | (1L << (MUTABLE - 98)) | (1L << (NONE - 98)) | (1L << (NOT - 98)) | (1L << (READ - 98)) | (1L << (SELF - 98)) | (1L << (SORTED - 98)) | (1L << (THIS - 98)) | (1L << (BOOLEAN_LITERAL - 98)) | (1L << (CHAR_LITERAL - 98)) | (1L << (MIN_INTEGER - 98)) | (1L << (MAX_INTEGER - 98)) | (1L << (SYMBOL_IDENTIFIER - 98)) | (1L << (TYPE_IDENTIFIER - 98)))) != 0) || ((((_la - 162)) & ~0x3f) == 0 && ((1L << (_la - 162)) & ((1L << (VARIABLE_IDENTIFIER - 162)) | (1L << (TEXT_LITERAL - 162)) | (1L << (UUID_LITERAL - 162)) | (1L << (INTEGER_LITERAL - 162)) | (1L << (HEXA_LITERAL - 162)) | (1L << (DECIMAL_LITERAL - 162)) | (1L << (DATETIME_LITERAL - 162)) | (1L << (TIME_LITERAL - 162)) | (1L << (DATE_LITERAL - 162)) | (1L << (PERIOD_LITERAL - 162)))) != 0)) {
				{
				setState(1771); 
				expression_tuple();
				}
			}

			setState(1774); 
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
			setState(1777);
			_la = _input.LA(1);
			if (_la==MUTABLE) {
				{
				setState(1776); 
				match(MUTABLE);
				}
			}

			setState(1779); 
			match(LCURL);
			setState(1781);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (EXECUTE - 98)) | (1L << (FETCH - 98)) | (1L << (MUTABLE - 98)) | (1L << (NONE - 98)) | (1L << (NOT - 98)) | (1L << (READ - 98)) | (1L << (SELF - 98)) | (1L << (SORTED - 98)) | (1L << (THIS - 98)) | (1L << (BOOLEAN_LITERAL - 98)) | (1L << (CHAR_LITERAL - 98)) | (1L << (MIN_INTEGER - 98)) | (1L << (MAX_INTEGER - 98)) | (1L << (SYMBOL_IDENTIFIER - 98)) | (1L << (TYPE_IDENTIFIER - 98)))) != 0) || ((((_la - 162)) & ~0x3f) == 0 && ((1L << (_la - 162)) & ((1L << (VARIABLE_IDENTIFIER - 162)) | (1L << (TEXT_LITERAL - 162)) | (1L << (UUID_LITERAL - 162)) | (1L << (INTEGER_LITERAL - 162)) | (1L << (HEXA_LITERAL - 162)) | (1L << (DECIMAL_LITERAL - 162)) | (1L << (DATETIME_LITERAL - 162)) | (1L << (TIME_LITERAL - 162)) | (1L << (DATE_LITERAL - 162)) | (1L << (PERIOD_LITERAL - 162)))) != 0)) {
				{
				setState(1780); 
				dict_entry_list();
				}
			}

			setState(1783); 
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
			setState(1785); 
			expression(0);
			setState(1786); 
			match(COMMA);
			setState(1795);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << MINUS) | (1L << LT) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (EXECUTE - 98)) | (1L << (FETCH - 98)) | (1L << (MUTABLE - 98)) | (1L << (NONE - 98)) | (1L << (NOT - 98)) | (1L << (READ - 98)) | (1L << (SELF - 98)) | (1L << (SORTED - 98)) | (1L << (THIS - 98)) | (1L << (BOOLEAN_LITERAL - 98)) | (1L << (CHAR_LITERAL - 98)) | (1L << (MIN_INTEGER - 98)) | (1L << (MAX_INTEGER - 98)) | (1L << (SYMBOL_IDENTIFIER - 98)) | (1L << (TYPE_IDENTIFIER - 98)))) != 0) || ((((_la - 162)) & ~0x3f) == 0 && ((1L << (_la - 162)) & ((1L << (VARIABLE_IDENTIFIER - 162)) | (1L << (TEXT_LITERAL - 162)) | (1L << (UUID_LITERAL - 162)) | (1L << (INTEGER_LITERAL - 162)) | (1L << (HEXA_LITERAL - 162)) | (1L << (DECIMAL_LITERAL - 162)) | (1L << (DATETIME_LITERAL - 162)) | (1L << (TIME_LITERAL - 162)) | (1L << (DATE_LITERAL - 162)) | (1L << (PERIOD_LITERAL - 162)))) != 0)) {
				{
				setState(1787); 
				expression(0);
				setState(1792);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1788); 
					match(COMMA);
					setState(1789); 
					expression(0);
					}
					}
					setState(1794);
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
			setState(1797); 
			dict_entry();
			setState(1802);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1798); 
				match(COMMA);
				setState(1799); 
				dict_entry();
				}
				}
				setState(1804);
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
			setState(1805); 
			((Dict_entryContext)_localctx).key = expression(0);
			setState(1806); 
			match(COLON);
			setState(1807); 
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
			setState(1818);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				_localctx = new SliceFirstAndLastContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1809); 
				((SliceFirstAndLastContext)_localctx).first = expression(0);
				setState(1810); 
				match(COLON);
				setState(1811); 
				((SliceFirstAndLastContext)_localctx).last = expression(0);
				}
				break;
			case 2:
				_localctx = new SliceFirstOnlyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1813); 
				((SliceFirstOnlyContext)_localctx).first = expression(0);
				setState(1814); 
				match(COLON);
				}
				break;
			case 3:
				_localctx = new SliceLastOnlyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1816); 
				match(COLON);
				setState(1817); 
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
			setState(1820); 
			variable_identifier();
			setState(1821); 
			assign();
			setState(1822); 
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

			setState(1825); 
			variable_identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(1831);
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
					setState(1827);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1828); 
					child_instance();
					}
					} 
				}
				setState(1833);
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
			setState(1838);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				_localctx = new IsATypeExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1834);
				if (!(this.willBeAOrAn())) throw new FailedPredicateException(this, "$parser.willBeAOrAn()");
				setState(1835); 
				match(VARIABLE_IDENTIFIER);
				setState(1836); 
				category_or_any_type();
				}
				break;
			case 2:
				_localctx = new IsOtherExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1837); 
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
			setState(1840); 
			match(READ);
			setState(1841); 
			match(ALL);
			setState(1842); 
			match(FROM);
			setState(1843); 
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
			setState(1845); 
			match(READ);
			setState(1846); 
			match(ONE);
			setState(1847); 
			match(FROM);
			setState(1848); 
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
			setState(1850); 
			order_by();
			setState(1855);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1851); 
					match(COMMA);
					setState(1852); 
					order_by();
					}
					} 
				}
				setState(1857);
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
			setState(1858); 
			variable_identifier();
			setState(1863);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1859); 
					match(DOT);
					setState(1860); 
					variable_identifier();
					}
					} 
				}
				setState(1865);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
			}
			setState(1867);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				{
				setState(1866);
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
			setState(1875);
			switch (_input.LA(1)) {
			case PLUS:
				_localctx = new OperatorPlusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1869); 
				match(PLUS);
				}
				break;
			case MINUS:
				_localctx = new OperatorMinusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1870); 
				match(MINUS);
				}
				break;
			case STAR:
				_localctx = new OperatorMultiplyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1871); 
				multiply();
				}
				break;
			case SLASH:
				_localctx = new OperatorDivideContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1872); 
				divide();
				}
				break;
			case BSLASH:
				_localctx = new OperatorIDivideContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1873); 
				idivide();
				}
				break;
			case PERCENT:
			case MODULO:
				_localctx = new OperatorModuloContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1874); 
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
			setState(1877); 
			((New_tokenContext)_localctx).i1 = match(VARIABLE_IDENTIFIER);
			setState(1878);
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
			setState(1880); 
			((Key_tokenContext)_localctx).i1 = match(VARIABLE_IDENTIFIER);
			setState(1881);
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
			setState(1883); 
			((Module_tokenContext)_localctx).i1 = match(VARIABLE_IDENTIFIER);
			setState(1884);
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
			setState(1886); 
			((Value_tokenContext)_localctx).i1 = match(VARIABLE_IDENTIFIER);
			setState(1887);
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
			setState(1889); 
			((Symbols_tokenContext)_localctx).i1 = match(VARIABLE_IDENTIFIER);
			setState(1890);
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
			setState(1892); 
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
			setState(1894); 
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
			setState(1896); 
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
			setState(1898); 
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
			setState(1900);
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
			setState(1909);
			switch (_input.LA(1)) {
			case RETURN:
				_localctx = new JavascriptReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1902); 
				match(RETURN);
				setState(1903); 
				((JavascriptReturnStatementContext)_localctx).exp = javascript_expression(0);
				setState(1904); 
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
				setState(1906); 
				((JavascriptStatementContext)_localctx).exp = javascript_expression(0);
				setState(1907); 
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

			setState(1912); 
			((JavascriptPrimaryExpressionContext)_localctx).exp = javascript_primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(1918);
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
					setState(1914);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1915); 
					((JavascriptSelectorExpressionContext)_localctx).child = javascript_selector_expression();
					}
					} 
				}
				setState(1920);
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
			setState(1928);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1921); 
				javascript_this_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1922); 
				javascript_new_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1923); 
				javascript_parenthesis_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1924); 
				javascript_identifier_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1925); 
				javascript_literal_expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1926); 
				javascript_method_expression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1927); 
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
			setState(1930); 
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
			setState(1932); 
			new_token();
			setState(1933); 
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
			setState(1940);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				_localctx = new JavaScriptMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1935); 
				match(DOT);
				setState(1936); 
				((JavaScriptMethodExpressionContext)_localctx).method = javascript_method_expression();
				}
				break;
			case 2:
				_localctx = new JavaScriptMemberExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1937); 
				match(DOT);
				setState(1938); 
				((JavaScriptMemberExpressionContext)_localctx).name = javascript_identifier();
				}
				break;
			case 3:
				_localctx = new JavaScriptItemExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1939); 
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
			setState(1942); 
			((Javascript_method_expressionContext)_localctx).name = javascript_identifier();
			setState(1943); 
			match(LPAR);
			setState(1945);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (READ - 132)) | (1L << (SELF - 132)) | (1L << (TEST - 132)) | (1L << (THIS - 132)) | (1L << (WRITE - 132)) | (1L << (BOOLEAN_LITERAL - 132)) | (1L << (CHAR_LITERAL - 132)) | (1L << (SYMBOL_IDENTIFIER - 132)) | (1L << (TYPE_IDENTIFIER - 132)) | (1L << (VARIABLE_IDENTIFIER - 132)) | (1L << (DOLLAR_IDENTIFIER - 132)) | (1L << (TEXT_LITERAL - 132)) | (1L << (INTEGER_LITERAL - 132)) | (1L << (DECIMAL_LITERAL - 132)))) != 0)) {
				{
				setState(1944); 
				((Javascript_method_expressionContext)_localctx).args = javascript_arguments(0);
				}
			}

			setState(1947); 
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

			setState(1950); 
			((JavascriptArgumentListContext)_localctx).item = javascript_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1957);
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
					setState(1952);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1953); 
					match(COMMA);
					setState(1954); 
					((JavascriptArgumentListItemContext)_localctx).item = javascript_expression(0);
					}
					} 
				}
				setState(1959);
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
			setState(1960); 
			match(LBRAK);
			setState(1961); 
			((Javascript_item_expressionContext)_localctx).exp = javascript_expression(0);
			setState(1962); 
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
			setState(1964); 
			match(LPAR);
			setState(1965); 
			((Javascript_parenthesis_expressionContext)_localctx).exp = javascript_expression(0);
			setState(1966); 
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
			setState(1968); 
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
			setState(1975);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				_localctx = new JavascriptIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1970); 
				((JavascriptIntegerLiteralContext)_localctx).t = match(INTEGER_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				_localctx = new JavascriptDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1971); 
				((JavascriptDecimalLiteralContext)_localctx).t = match(DECIMAL_LITERAL);
				}
				break;
			case TEXT_LITERAL:
				_localctx = new JavascriptTextLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1972); 
				((JavascriptTextLiteralContext)_localctx).t = match(TEXT_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new JavascriptBooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1973); 
				((JavascriptBooleanLiteralContext)_localctx).t = match(BOOLEAN_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new JavascriptCharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1974); 
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
			setState(1977);
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
			setState(1982);
			switch (_input.LA(1)) {
			case RETURN:
				_localctx = new PythonReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1979); 
				match(RETURN);
				setState(1980); 
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
				setState(1981); 
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

			setState(1985); 
			((PythonPrimaryExpressionContext)_localctx).exp = python_primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(1991);
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
					setState(1987);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1988); 
					((PythonSelectorExpressionContext)_localctx).child = python_selector_expression();
					}
					} 
				}
				setState(1993);
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
			setState(1998);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				_localctx = new PythonParenthesisExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1994); 
				((PythonParenthesisExpressionContext)_localctx).exp = python_parenthesis_expression();
				}
				break;
			case 2:
				_localctx = new PythonIdentifierExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1995); 
				((PythonIdentifierExpressionContext)_localctx).exp = python_identifier_expression(0);
				}
				break;
			case 3:
				_localctx = new PythonLiteralExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1996); 
				((PythonLiteralExpressionContext)_localctx).exp = python_literal_expression();
				}
				break;
			case 4:
				_localctx = new PythonGlobalMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1997); 
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
		enterRule(_localctx, 340, RULE_python_selector_expression);
		try {
			setState(2006);
			switch (_input.LA(1)) {
			case DOT:
				_localctx = new PythonMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2000); 
				match(DOT);
				setState(2001); 
				((PythonMethodExpressionContext)_localctx).exp = python_method_expression();
				}
				break;
			case LBRAK:
				_localctx = new PythonItemExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2002); 
				match(LBRAK);
				setState(2003); 
				((PythonItemExpressionContext)_localctx).exp = python_expression(0);
				setState(2004); 
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
		enterRule(_localctx, 342, RULE_python_method_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2008); 
			((Python_method_expressionContext)_localctx).name = python_identifier();
			setState(2009); 
			match(LPAR);
			setState(2011);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (READ - 132)) | (1L << (SELF - 132)) | (1L << (TEST - 132)) | (1L << (THIS - 132)) | (1L << (WRITE - 132)) | (1L << (BOOLEAN_LITERAL - 132)) | (1L << (CHAR_LITERAL - 132)) | (1L << (SYMBOL_IDENTIFIER - 132)) | (1L << (TYPE_IDENTIFIER - 132)) | (1L << (VARIABLE_IDENTIFIER - 132)) | (1L << (DOLLAR_IDENTIFIER - 132)) | (1L << (TEXT_LITERAL - 132)) | (1L << (INTEGER_LITERAL - 132)) | (1L << (DECIMAL_LITERAL - 132)))) != 0)) {
				{
				setState(2010); 
				((Python_method_expressionContext)_localctx).args = python_argument_list();
				}
			}

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
		enterRule(_localctx, 344, RULE_python_argument_list);
		try {
			setState(2021);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				_localctx = new PythonOrdinalOnlyArgumentListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2015); 
				((PythonOrdinalOnlyArgumentListContext)_localctx).ordinal = python_ordinal_argument_list(0);
				}
				break;
			case 2:
				_localctx = new PythonNamedOnlyArgumentListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2016); 
				((PythonNamedOnlyArgumentListContext)_localctx).named = python_named_argument_list(0);
				}
				break;
			case 3:
				_localctx = new PythonArgumentListContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2017); 
				((PythonArgumentListContext)_localctx).ordinal = python_ordinal_argument_list(0);
				setState(2018); 
				match(COMMA);
				setState(2019); 
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
		int _startState = 346;
		enterRecursionRule(_localctx, 346, RULE_python_ordinal_argument_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PythonOrdinalArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2024); 
			((PythonOrdinalArgumentListContext)_localctx).item = python_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2031);
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
					setState(2026);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2027); 
					match(COMMA);
					setState(2028); 
					((PythonOrdinalArgumentListItemContext)_localctx).item = python_expression(0);
					}
					} 
				}
				setState(2033);
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
		int _startState = 348;
		enterRecursionRule(_localctx, 348, RULE_python_named_argument_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PythonNamedArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2035); 
			((PythonNamedArgumentListContext)_localctx).name = python_identifier();
			setState(2036); 
			match(EQ);
			setState(2037); 
			((PythonNamedArgumentListContext)_localctx).exp = python_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2047);
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
					setState(2039);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2040); 
					match(COMMA);
					setState(2041); 
					((PythonNamedArgumentListItemContext)_localctx).name = python_identifier();
					setState(2042); 
					match(EQ);
					setState(2043); 
					((PythonNamedArgumentListItemContext)_localctx).exp = python_expression(0);
					}
					} 
				}
				setState(2049);
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
		enterRule(_localctx, 350, RULE_python_parenthesis_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2050); 
			match(LPAR);
			setState(2051); 
			((Python_parenthesis_expressionContext)_localctx).exp = python_expression(0);
			setState(2052); 
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
		int _startState = 352;
		enterRecursionRule(_localctx, 352, RULE_python_identifier_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2057);
			switch (_input.LA(1)) {
			case DOLLAR_IDENTIFIER:
				{
				_localctx = new PythonPromptoIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2055); 
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
				setState(2056); 
				((PythonIdentifierContext)_localctx).name = python_identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(2064);
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
					setState(2059);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2060); 
					match(DOT);
					setState(2061); 
					((PythonChildIdentifierContext)_localctx).name = python_identifier();
					}
					} 
				}
				setState(2066);
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
		enterRule(_localctx, 354, RULE_python_literal_expression);
		try {
			setState(2072);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				_localctx = new PythonIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2067); 
				((PythonIntegerLiteralContext)_localctx).t = match(INTEGER_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				_localctx = new PythonDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2068); 
				((PythonDecimalLiteralContext)_localctx).t = match(DECIMAL_LITERAL);
				}
				break;
			case TEXT_LITERAL:
				_localctx = new PythonTextLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2069); 
				((PythonTextLiteralContext)_localctx).t = match(TEXT_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new PythonBooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2070); 
				((PythonBooleanLiteralContext)_localctx).t = match(BOOLEAN_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new PythonCharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2071); 
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
		enterRule(_localctx, 356, RULE_python_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2074);
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
		enterRule(_localctx, 358, RULE_java_statement);
		try {
			setState(2083);
			switch (_input.LA(1)) {
			case RETURN:
				_localctx = new JavaReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2076); 
				match(RETURN);
				setState(2077); 
				((JavaReturnStatementContext)_localctx).exp = java_expression(0);
				setState(2078); 
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
				setState(2080); 
				((JavaStatementContext)_localctx).exp = java_expression(0);
				setState(2081); 
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
		int _startState = 360;
		enterRecursionRule(_localctx, 360, RULE_java_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavaPrimaryExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2086); 
			((JavaPrimaryExpressionContext)_localctx).exp = java_primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(2092);
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
					setState(2088);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2089); 
					((JavaSelectorExpressionContext)_localctx).child = java_selector_expression();
					}
					} 
				}
				setState(2094);
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
		enterRule(_localctx, 362, RULE_java_primary_expression);
		try {
			setState(2100);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2095); 
				java_this_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2096); 
				java_new_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2097); 
				java_parenthesis_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2098); 
				java_identifier_expression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2099); 
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
		enterRule(_localctx, 364, RULE_java_this_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2102); 
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
		enterRule(_localctx, 366, RULE_java_new_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2104); 
			new_token();
			setState(2105); 
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
		enterRule(_localctx, 368, RULE_java_selector_expression);
		try {
			setState(2110);
			switch (_input.LA(1)) {
			case DOT:
				_localctx = new JavaMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2107); 
				match(DOT);
				setState(2108); 
				((JavaMethodExpressionContext)_localctx).exp = java_method_expression();
				}
				break;
			case LBRAK:
				_localctx = new JavaItemExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2109); 
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
		enterRule(_localctx, 370, RULE_java_method_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2112); 
			((Java_method_expressionContext)_localctx).name = java_identifier();
			setState(2113); 
			match(LPAR);
			setState(2115);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (READ - 132)) | (1L << (SELF - 132)) | (1L << (TEST - 132)) | (1L << (THIS - 132)) | (1L << (WRITE - 132)) | (1L << (BOOLEAN_LITERAL - 132)) | (1L << (CHAR_LITERAL - 132)) | (1L << (SYMBOL_IDENTIFIER - 132)) | (1L << (TYPE_IDENTIFIER - 132)) | (1L << (VARIABLE_IDENTIFIER - 132)) | (1L << (NATIVE_IDENTIFIER - 132)) | (1L << (DOLLAR_IDENTIFIER - 132)) | (1L << (TEXT_LITERAL - 132)) | (1L << (INTEGER_LITERAL - 132)) | (1L << (DECIMAL_LITERAL - 132)))) != 0)) {
				{
				setState(2114); 
				((Java_method_expressionContext)_localctx).args = java_arguments(0);
				}
			}

			setState(2117); 
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
		int _startState = 372;
		enterRecursionRule(_localctx, 372, RULE_java_arguments, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavaArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2120); 
			((JavaArgumentListContext)_localctx).item = java_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2127);
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
					setState(2122);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2123); 
					match(COMMA);
					setState(2124); 
					((JavaArgumentListItemContext)_localctx).item = java_expression(0);
					}
					} 
				}
				setState(2129);
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
		enterRule(_localctx, 374, RULE_java_item_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2130); 
			match(LBRAK);
			setState(2131); 
			((Java_item_expressionContext)_localctx).exp = java_expression(0);
			setState(2132); 
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
		enterRule(_localctx, 376, RULE_java_parenthesis_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2134); 
			match(LPAR);
			setState(2135); 
			((Java_parenthesis_expressionContext)_localctx).exp = java_expression(0);
			setState(2136); 
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
		int _startState = 378;
		enterRecursionRule(_localctx, 378, RULE_java_identifier_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavaIdentifierContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2139); 
			((JavaIdentifierContext)_localctx).name = java_identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(2146);
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
					setState(2141);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2142); 
					match(DOT);
					setState(2143); 
					((JavaChildIdentifierContext)_localctx).name = java_identifier();
					}
					} 
				}
				setState(2148);
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
		int _startState = 380;
		enterRecursionRule(_localctx, 380, RULE_java_class_identifier_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavaClassIdentifierContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2150); 
			((JavaClassIdentifierContext)_localctx).klass = java_identifier_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2156);
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
					setState(2152);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2153); 
					((JavaChildClassIdentifierContext)_localctx).name = match(DOLLAR_IDENTIFIER);
					}
					} 
				}
				setState(2158);
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
		enterRule(_localctx, 382, RULE_java_literal_expression);
		try {
			setState(2164);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				_localctx = new JavaIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2159); 
				((JavaIntegerLiteralContext)_localctx).t = match(INTEGER_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				_localctx = new JavaDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2160); 
				((JavaDecimalLiteralContext)_localctx).t = match(DECIMAL_LITERAL);
				}
				break;
			case TEXT_LITERAL:
				_localctx = new JavaTextLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2161); 
				((JavaTextLiteralContext)_localctx).t = match(TEXT_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new JavaBooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2162); 
				((JavaBooleanLiteralContext)_localctx).t = match(BOOLEAN_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new JavaCharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2163); 
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
		enterRule(_localctx, 384, RULE_java_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2166);
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
		enterRule(_localctx, 386, RULE_csharp_statement);
		try {
			setState(2175);
			switch (_input.LA(1)) {
			case RETURN:
				_localctx = new CSharpReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2168); 
				match(RETURN);
				setState(2169); 
				((CSharpReturnStatementContext)_localctx).exp = csharp_expression(0);
				setState(2170); 
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
				setState(2172); 
				((CSharpStatementContext)_localctx).exp = csharp_expression(0);
				setState(2173); 
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
		int _startState = 388;
		enterRecursionRule(_localctx, 388, RULE_csharp_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new CSharpPrimaryExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2178); 
			((CSharpPrimaryExpressionContext)_localctx).exp = csharp_primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(2184);
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
					setState(2180);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2181); 
					((CSharpSelectorExpressionContext)_localctx).child = csharp_selector_expression();
					}
					} 
				}
				setState(2186);
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
		enterRule(_localctx, 390, RULE_csharp_primary_expression);
		try {
			setState(2192);
			switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2187); 
				csharp_this_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2188); 
				csharp_new_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2189); 
				csharp_parenthesis_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2190); 
				csharp_identifier_expression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2191); 
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
		enterRule(_localctx, 392, RULE_csharp_this_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2194); 
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
		enterRule(_localctx, 394, RULE_csharp_new_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2196); 
			new_token();
			setState(2197); 
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
		enterRule(_localctx, 396, RULE_csharp_selector_expression);
		try {
			setState(2202);
			switch (_input.LA(1)) {
			case DOT:
				_localctx = new CSharpMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2199); 
				match(DOT);
				setState(2200); 
				((CSharpMethodExpressionContext)_localctx).exp = csharp_method_expression();
				}
				break;
			case LBRAK:
				_localctx = new CSharpItemExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2201); 
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
		enterRule(_localctx, 398, RULE_csharp_method_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2204); 
			((Csharp_method_expressionContext)_localctx).name = csharp_identifier();
			setState(2205); 
			match(LPAR);
			setState(2207);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (READ - 132)) | (1L << (SELF - 132)) | (1L << (TEST - 132)) | (1L << (THIS - 132)) | (1L << (WRITE - 132)) | (1L << (BOOLEAN_LITERAL - 132)) | (1L << (CHAR_LITERAL - 132)) | (1L << (SYMBOL_IDENTIFIER - 132)) | (1L << (TYPE_IDENTIFIER - 132)) | (1L << (VARIABLE_IDENTIFIER - 132)) | (1L << (DOLLAR_IDENTIFIER - 132)) | (1L << (TEXT_LITERAL - 132)) | (1L << (INTEGER_LITERAL - 132)) | (1L << (DECIMAL_LITERAL - 132)))) != 0)) {
				{
				setState(2206); 
				((Csharp_method_expressionContext)_localctx).args = csharp_arguments(0);
				}
			}

			setState(2209); 
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
		int _startState = 400;
		enterRecursionRule(_localctx, 400, RULE_csharp_arguments, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new CSharpArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2212); 
			((CSharpArgumentListContext)_localctx).item = csharp_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2219);
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
					setState(2214);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2215); 
					match(COMMA);
					setState(2216); 
					((CSharpArgumentListItemContext)_localctx).item = csharp_expression(0);
					}
					} 
				}
				setState(2221);
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
		enterRule(_localctx, 402, RULE_csharp_item_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2222); 
			match(LBRAK);
			setState(2223); 
			((Csharp_item_expressionContext)_localctx).exp = csharp_expression(0);
			setState(2224); 
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
		enterRule(_localctx, 404, RULE_csharp_parenthesis_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2226); 
			match(LPAR);
			setState(2227); 
			((Csharp_parenthesis_expressionContext)_localctx).exp = csharp_expression(0);
			setState(2228); 
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
		int _startState = 406;
		enterRecursionRule(_localctx, 406, RULE_csharp_identifier_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2233);
			switch (_input.LA(1)) {
			case DOLLAR_IDENTIFIER:
				{
				_localctx = new CSharpPromptoIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2231); 
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
				setState(2232); 
				((CSharpIdentifierContext)_localctx).name = csharp_identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(2240);
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
					setState(2235);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2236); 
					match(DOT);
					setState(2237); 
					((CSharpChildIdentifierContext)_localctx).name = csharp_identifier();
					}
					} 
				}
				setState(2242);
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
		enterRule(_localctx, 408, RULE_csharp_literal_expression);
		try {
			setState(2248);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				_localctx = new CSharpIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2243); 
				match(INTEGER_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				_localctx = new CSharpDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2244); 
				match(DECIMAL_LITERAL);
				}
				break;
			case TEXT_LITERAL:
				_localctx = new CSharpTextLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2245); 
				match(TEXT_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new CSharpBooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2246); 
				match(BOOLEAN_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new CSharpCharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2247); 
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
		enterRule(_localctx, 410, RULE_csharp_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2250);
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
		case 173: 
			return python_ordinal_argument_list_sempred((Python_ordinal_argument_listContext)_localctx, predIndex);
		case 174: 
			return python_named_argument_list_sempred((Python_named_argument_listContext)_localctx, predIndex);
		case 176: 
			return python_identifier_expression_sempred((Python_identifier_expressionContext)_localctx, predIndex);
		case 180: 
			return java_expression_sempred((Java_expressionContext)_localctx, predIndex);
		case 186: 
			return java_arguments_sempred((Java_argumentsContext)_localctx, predIndex);
		case 189: 
			return java_identifier_expression_sempred((Java_identifier_expressionContext)_localctx, predIndex);
		case 190: 
			return java_class_identifier_expression_sempred((Java_class_identifier_expressionContext)_localctx, predIndex);
		case 194: 
			return csharp_expression_sempred((Csharp_expressionContext)_localctx, predIndex);
		case 200: 
			return csharp_arguments_sempred((Csharp_argumentsContext)_localctx, predIndex);
		case 203: 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u00af\u08cf\4\2\t"+
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
		"\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u01a5"+
		"\n\2\3\2\5\2\u01a8\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\5\5\u01c1\n\5\3\5\3\5\3\6"+
		"\5\6\u01c6\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u01d4"+
		"\n\6\3\6\3\6\3\6\3\6\5\6\u01da\n\6\5\6\u01dc\n\6\5\6\u01de\n\6\3\6\3\6"+
		"\3\7\3\7\3\7\5\7\u01e5\n\7\3\7\3\7\3\b\5\b\u01ea\n\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\5\b\u01f5\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u01fc\n\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0209\n\t\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0217\n\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\5\r\u022b"+
		"\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\5\17\u0242\n\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\5\20\u024d\n\20\3\20\3\20\3\20\3\20\3\20\5\20\u0254"+
		"\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u025d\n\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u0266\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u026f\n\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0282\n\23\f\23\16\23\u0285\13\23"+
		"\3\24\3\24\3\24\3\24\3\24\5\24\u028c\n\24\3\24\3\24\3\24\5\24\u0291\n"+
		"\24\3\25\3\25\3\25\3\25\5\25\u0297\n\25\3\25\3\25\3\25\5\25\u029c\n\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\26\3\26\5\26\u02a5\n\26\3\26\3\26\3\26\5\26"+
		"\u02aa\n\26\3\26\3\26\3\26\5\26\u02af\n\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\5\27\u02c7\n\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\5\31\u02d2\n\31\3\31\3\31\5\31\u02d6\n\31\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\5\32\u02eb\n\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\5\34\u0305\n\34\3\35\3\35\3\35\5\35\u030a\n\35\3\35\3\35\3\36\3\36\3"+
		"\36\3\36\3\36\5\36\u0313\n\36\3\37\3\37\3\37\3\37\3\37\7\37\u031a\n\37"+
		"\f\37\16\37\u031d\13\37\3 \3 \3 \3 \3 \3 \5 \u0325\n \3!\3!\3!\3!\3!\3"+
		"!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\5#\u0342\n#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u0355"+
		"\n$\3%\3%\3%\3%\5%\u035b\n%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u037d"+
		"\n(\3(\3(\3(\3(\3(\3(\3(\5(\u0386\n(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)"+
		"\3)\3)\3)\3)\3)\3)\3)\3)\7)\u039b\n)\f)\16)\u039e\13)\3*\3*\3*\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\5+\u03ab\n+\3+\3+\3+\3+\3+\3+\3+\5+\u03b4\n+\3+\3+\3"+
		"+\3+\3+\3+\3+\5+\u03bd\n+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3"+
		",\3,\3,\3,\3,\3,\3,\5,\u03d4\n,\3-\3-\3.\3.\5.\u03da\n.\3/\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u03ee\n/\3/\3/\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\7/\u0456\n/\f/\16/\u0459\13/\3\60\3\60\3\61\3\61\3\61\3"+
		"\61\3\61\7\61\u0462\n\61\f\61\16\61\u0465\13\61\3\62\3\62\3\62\3\62\3"+
		"\62\3\62\3\62\3\62\5\62\u046f\n\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u047e\n\63\3\64\3\64\3\64\5\64\u0483"+
		"\n\64\3\64\3\64\3\65\3\65\3\65\5\65\u048a\n\65\3\65\3\65\3\66\3\66\3\66"+
		"\5\66\u0491\n\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\5\67\u049a\n\67\3"+
		"\67\3\67\3\67\7\67\u049f\n\67\f\67\16\67\u04a2\13\67\38\38\38\38\39\3"+
		"9\39\39\39\3:\3:\3:\3:\3:\3:\3;\3;\3;\5;\u04b6\n;\3;\3;\3;\3;\3;\3;\3"+
		";\3;\3;\5;\u04c1\n;\3;\3;\5;\u04c5\n;\3;\3;\3;\5;\u04ca\n;\3;\3;\3;\5"+
		";\u04cf\n;\5;\u04d1\n;\3<\3<\5<\u04d5\n<\3<\3<\3<\3<\3<\3<\3<\5<\u04de"+
		"\n<\3<\3<\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\5>\u04ee\n>\3?\3?\3?\3?"+
		"\3@\7@\u04f5\n@\f@\16@\u04f8\13@\3A\6A\u04fb\nA\rA\16A\u04fc\3B\6B\u0500"+
		"\nB\rB\16B\u0501\3B\3B\3C\7C\u0507\nC\fC\16C\u050a\13C\3C\3C\3D\3D\3E"+
		"\5E\u0511\nE\3E\3E\3E\3F\3F\3F\3F\7F\u051a\nF\fF\16F\u051d\13F\3G\3G\3"+
		"G\7G\u0522\nG\fG\16G\u0525\13G\3G\3G\3G\3G\3G\5G\u052c\nG\3H\3H\3I\3I"+
		"\5I\u0532\nI\3J\3J\3J\3J\7J\u0538\nJ\fJ\16J\u053b\13J\3K\3K\3K\3K\7K\u0541"+
		"\nK\fK\16K\u0544\13K\3L\3L\3L\7L\u0549\nL\fL\16L\u054c\13L\3M\3M\3M\3"+
		"M\3M\3M\3M\3M\3M\3M\5M\u0558\nM\3N\5N\u055b\nN\3N\3N\5N\u055f\nN\3N\3"+
		"N\3O\5O\u0564\nO\3O\3O\5O\u0568\nO\3O\3O\3P\3P\3P\7P\u056f\nP\fP\16P\u0572"+
		"\13P\3Q\3Q\3Q\3Q\3Q\3Q\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\5R\u0586\n"+
		"R\3R\3R\3R\3R\3R\3R\3R\3R\7R\u0590\nR\fR\16R\u0593\13R\3S\3S\5S\u0597"+
		"\nS\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\5T\u05a7\nT\3U\3U\3V\5V"+
		"\u05ac\nV\3V\3V\3W\3W\3X\3X\3X\5X\u05b5\nX\3Y\3Y\3Y\7Y\u05ba\nY\fY\16"+
		"Y\u05bd\13Y\3Z\3Z\5Z\u05c1\nZ\3[\3[\3[\5[\u05c6\n[\3\\\3\\\3]\3]\3^\3"+
		"^\3_\3_\3`\3`\3`\7`\u05d3\n`\f`\16`\u05d6\13`\3a\3a\5a\u05da\na\3a\5a"+
		"\u05dd\na\3b\3b\5b\u05e1\nb\3c\3c\3c\5c\u05e6\nc\3d\3d\3d\3e\3e\5e\u05ed"+
		"\ne\3f\3f\3f\3f\3f\3f\3f\3f\3f\7f\u05f8\nf\ff\16f\u05fb\13f\3g\3g\3g\3"+
		"g\7g\u0601\ng\fg\16g\u0604\13g\3h\3h\3h\3h\3h\5h\u060b\nh\3i\3i\3i\3i"+
		"\7i\u0611\ni\fi\16i\u0614\13i\3j\3j\3j\5j\u0619\nj\3k\3k\3k\3k\3k\3k\3"+
		"k\3k\3k\3k\5k\u0625\nk\3l\3l\5l\u0629\nl\3m\3m\3m\3m\3m\3m\7m\u0631\n"+
		"m\fm\16m\u0634\13m\3n\3n\5n\u0638\nn\3o\3o\3o\3o\5o\u063e\no\3o\3o\3o"+
		"\7o\u0643\no\fo\16o\u0646\13o\3o\3o\5o\u064a\no\3p\3p\3p\7p\u064f\np\f"+
		"p\16p\u0652\13p\3q\3q\3q\7q\u0657\nq\fq\16q\u065a\13q\3r\3r\3r\3r\5r\u0660"+
		"\nr\3s\3s\3t\3t\3t\3t\7t\u0668\nt\ft\16t\u066b\13t\3u\3u\3u\3u\3u\3u\3"+
		"u\3u\3u\3u\5u\u0677\nu\3v\3v\5v\u067b\nv\3v\5v\u067e\nv\3w\3w\5w\u0682"+
		"\nw\3w\5w\u0685\nw\3x\3x\3x\3x\7x\u068b\nx\fx\16x\u068e\13x\3y\3y\3y\3"+
		"y\7y\u0694\ny\fy\16y\u0697\13y\3z\3z\3z\3z\7z\u069d\nz\fz\16z\u06a0\13"+
		"z\3{\3{\3{\3{\7{\u06a6\n{\f{\16{\u06a9\13{\3|\3|\3|\3|\3|\3|\3|\3|\3|"+
		"\3|\3|\3|\3|\3|\5|\u06b9\n|\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}"+
		"\5}\u06c9\n}\3~\3~\3~\7~\u06ce\n~\f~\16~\u06d1\13~\3\177\3\177\3\177\3"+
		"\177\5\177\u06d7\n\177\3\u0080\3\u0080\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\3\u0082\3\u0082\5\u0082\u06e1\n\u0082\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\5\u0083\u06e8\n\u0083\3\u0084\5\u0084\u06eb\n\u0084\3\u0084\3"+
		"\u0084\5\u0084\u06ef\n\u0084\3\u0084\3\u0084\3\u0085\5\u0085\u06f4\n\u0085"+
		"\3\u0085\3\u0085\5\u0085\u06f8\n\u0085\3\u0085\3\u0085\3\u0086\3\u0086"+
		"\3\u0086\3\u0086\3\u0086\7\u0086\u0701\n\u0086\f\u0086\16\u0086\u0704"+
		"\13\u0086\5\u0086\u0706\n\u0086\3\u0087\3\u0087\3\u0087\7\u0087\u070b"+
		"\n\u0087\f\u0087\16\u0087\u070e\13\u0087\3\u0088\3\u0088\3\u0088\3\u0088"+
		"\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089"+
		"\5\u0089\u071d\n\u0089\3\u008a\3\u008a\3\u008a\3\u008a\3\u008b\3\u008b"+
		"\3\u008b\3\u008b\3\u008b\7\u008b\u0728\n\u008b\f\u008b\16\u008b\u072b"+
		"\13\u008b\3\u008c\3\u008c\3\u008c\3\u008c\5\u008c\u0731\n\u008c\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e"+
		"\3\u008f\3\u008f\3\u008f\7\u008f\u0740\n\u008f\f\u008f\16\u008f\u0743"+
		"\13\u008f\3\u0090\3\u0090\3\u0090\7\u0090\u0748\n\u0090\f\u0090\16\u0090"+
		"\u074b\13\u0090\3\u0090\5\u0090\u074e\n\u0090\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\5\u0091\u0756\n\u0091\3\u0092\3\u0092\3\u0092"+
		"\3\u0093\3\u0093\3\u0093\3\u0094\3\u0094\3\u0094\3\u0095\3\u0095\3\u0095"+
		"\3\u0096\3\u0096\3\u0096\3\u0097\3\u0097\3\u0098\3\u0098\3\u0099\3\u0099"+
		"\3\u009a\3\u009a\3\u009b\3\u009b\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c"+
		"\3\u009c\3\u009c\5\u009c\u0778\n\u009c\3\u009d\3\u009d\3\u009d\3\u009d"+
		"\3\u009d\7\u009d\u077f\n\u009d\f\u009d\16\u009d\u0782\13\u009d\3\u009e"+
		"\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\5\u009e\u078b\n\u009e"+
		"\3\u009f\3\u009f\3\u00a0\3\u00a0\3\u00a0\3\u00a1\3\u00a1\3\u00a1\3\u00a1"+
		"\3\u00a1\5\u00a1\u0797\n\u00a1\3\u00a2\3\u00a2\3\u00a2\5\u00a2\u079c\n"+
		"\u00a2\3\u00a2\3\u00a2\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3"+
		"\7\u00a3\u07a6\n\u00a3\f\u00a3\16\u00a3\u07a9\13\u00a3\3\u00a4\3\u00a4"+
		"\3\u00a4\3\u00a4\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a6\3\u00a6\3\u00a7"+
		"\3\u00a7\3\u00a7\3\u00a7\3\u00a7\5\u00a7\u07ba\n\u00a7\3\u00a8\3\u00a8"+
		"\3\u00a9\3\u00a9\3\u00a9\5\u00a9\u07c1\n\u00a9\3\u00aa\3\u00aa\3\u00aa"+
		"\3\u00aa\3\u00aa\7\u00aa\u07c8\n\u00aa\f\u00aa\16\u00aa\u07cb\13\u00aa"+
		"\3\u00ab\3\u00ab\3\u00ab\3\u00ab\5\u00ab\u07d1\n\u00ab\3\u00ac\3\u00ac"+
		"\3\u00ac\3\u00ac\3\u00ac\3\u00ac\5\u00ac\u07d9\n\u00ac\3\u00ad\3\u00ad"+
		"\3\u00ad\5\u00ad\u07de\n\u00ad\3\u00ad\3\u00ad\3\u00ae\3\u00ae\3\u00ae"+
		"\3\u00ae\3\u00ae\3\u00ae\5\u00ae\u07e8\n\u00ae\3\u00af\3\u00af\3\u00af"+
		"\3\u00af\3\u00af\3\u00af\7\u00af\u07f0\n\u00af\f\u00af\16\u00af\u07f3"+
		"\13\u00af\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0"+
		"\3\u00b0\3\u00b0\3\u00b0\7\u00b0\u0800\n\u00b0\f\u00b0\16\u00b0\u0803"+
		"\13\u00b0\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b2\3\u00b2\3\u00b2\5\u00b2"+
		"\u080c\n\u00b2\3\u00b2\3\u00b2\3\u00b2\7\u00b2\u0811\n\u00b2\f\u00b2\16"+
		"\u00b2\u0814\13\u00b2\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\5\u00b3"+
		"\u081b\n\u00b3\3\u00b4\3\u00b4\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5"+
		"\3\u00b5\3\u00b5\5\u00b5\u0826\n\u00b5\3\u00b6\3\u00b6\3\u00b6\3\u00b6"+
		"\3\u00b6\7\u00b6\u082d\n\u00b6\f\u00b6\16\u00b6\u0830\13\u00b6\3\u00b7"+
		"\3\u00b7\3\u00b7\3\u00b7\3\u00b7\5\u00b7\u0837\n\u00b7\3\u00b8\3\u00b8"+
		"\3\u00b9\3\u00b9\3\u00b9\3\u00ba\3\u00ba\3\u00ba\5\u00ba\u0841\n\u00ba"+
		"\3\u00bb\3\u00bb\3\u00bb\5\u00bb\u0846\n\u00bb\3\u00bb\3\u00bb\3\u00bc"+
		"\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\7\u00bc\u0850\n\u00bc\f\u00bc"+
		"\16\u00bc\u0853\13\u00bc\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00be\3\u00be"+
		"\3\u00be\3\u00be\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\7\u00bf"+
		"\u0863\n\u00bf\f\u00bf\16\u00bf\u0866\13\u00bf\3\u00c0\3\u00c0\3\u00c0"+
		"\3\u00c0\3\u00c0\7\u00c0\u086d\n\u00c0\f\u00c0\16\u00c0\u0870\13\u00c0"+
		"\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\5\u00c1\u0877\n\u00c1\3\u00c2"+
		"\3\u00c2\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\5\u00c3"+
		"\u0882\n\u00c3\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\7\u00c4\u0889\n"+
		"\u00c4\f\u00c4\16\u00c4\u088c\13\u00c4\3\u00c5\3\u00c5\3\u00c5\3\u00c5"+
		"\3\u00c5\5\u00c5\u0893\n\u00c5\3\u00c6\3\u00c6\3\u00c7\3\u00c7\3\u00c7"+
		"\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u089d\n\u00c8\3\u00c9\3\u00c9\3\u00c9"+
		"\5\u00c9\u08a2\n\u00c9\3\u00c9\3\u00c9\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\7\u00ca\u08ac\n\u00ca\f\u00ca\16\u00ca\u08af\13\u00ca"+
		"\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cd"+
		"\3\u00cd\3\u00cd\5\u00cd\u08bc\n\u00cd\3\u00cd\3\u00cd\3\u00cd\7\u00cd"+
		"\u08c1\n\u00cd\f\u00cd\16\u00cd\u08c4\13\u00cd\3\u00ce\3\u00ce\3\u00ce"+
		"\3\u00ce\3\u00ce\5\u00ce\u08cb\n\u00ce\3\u00cf\3\u00cf\3\u00cf\2\30$<"+
		"P\\`l\u00a2\u00ca\u0114\u0138\u0144\u0152\u015c\u015e\u0162\u016a\u0176"+
		"\u017c\u017e\u0186\u0192\u0198\u00d0\2\4\6\b\n\f\16\20\22\24\26\30\32"+
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
		"\u018a\u018c\u018e\u0190\u0192\u0194\u0196\u0198\u019a\u019c\2\f\3\2T"+
		"U\3\2\"#\4\2\u0090\u0090\u00a4\u00a4\4\2\u008c\u008c\u0094\u0094\4\2K"+
		"K\\\\\4\2\'\'vv\b\2\64<\u0086\u0086\u0093\u0093\u009d\u009d\u00a2\u00a4"+
		"\u00a6\u00a6\b\2\64<\u0086\u0086\u008c\u008c\u0093\u0094\u009d\u009d\u00a2"+
		"\u00a4\7\2\64<\u0086\u0086\u0093\u0093\u009d\u009d\u00a2\u00a6\7\2\64"+
		"<\u0086\u0086\u0093\u0093\u009d\u009d\u00a2\u00a4\u0946\2\u019e\3\2\2"+
		"\2\4\u01af\3\2\2\2\6\u01b9\3\2\2\2\b\u01bd\3\2\2\2\n\u01c5\3\2\2\2\f\u01e1"+
		"\3\2\2\2\16\u01e9\3\2\2\2\20\u01ff\3\2\2\2\22\u020c\3\2\2\2\24\u020e\3"+
		"\2\2\2\26\u021d\3\2\2\2\30\u0227\3\2\2\2\32\u0234\3\2\2\2\34\u023e\3\2"+
		"\2\2\36\u024c\3\2\2\2 \u0260\3\2\2\2\"\u0272\3\2\2\2$\u027a\3\2\2\2&\u0286"+
		"\3\2\2\2(\u0292\3\2\2\2*\u02a2\3\2\2\2,\u02b5\3\2\2\2.\u02c8\3\2\2\2\60"+
		"\u02ca\3\2\2\2\62\u02ea\3\2\2\2\64\u02ec\3\2\2\2\66\u0304\3\2\2\28\u0306"+
		"\3\2\2\2:\u0312\3\2\2\2<\u0314\3\2\2\2>\u0324\3\2\2\2@\u0326\3\2\2\2B"+
		"\u032d\3\2\2\2D\u0334\3\2\2\2F\u0354\3\2\2\2H\u0356\3\2\2\2J\u0363\3\2"+
		"\2\2L\u036c\3\2\2\2N\u0373\3\2\2\2P\u0387\3\2\2\2R\u039f\3\2\2\2T\u03a2"+
		"\3\2\2\2V\u03d3\3\2\2\2X\u03d5\3\2\2\2Z\u03d7\3\2\2\2\\\u03ed\3\2\2\2"+
		"^\u045a\3\2\2\2`\u045c\3\2\2\2b\u046e\3\2\2\2d\u047d\3\2\2\2f\u047f\3"+
		"\2\2\2h\u0486\3\2\2\2j\u048d\3\2\2\2l\u0499\3\2\2\2n\u04a3\3\2\2\2p\u04a7"+
		"\3\2\2\2r\u04ac\3\2\2\2t\u04d0\3\2\2\2v\u04d2\3\2\2\2x\u04e1\3\2\2\2z"+
		"\u04ed\3\2\2\2|\u04ef\3\2\2\2~\u04f6\3\2\2\2\u0080\u04fa\3\2\2\2\u0082"+
		"\u04ff\3\2\2\2\u0084\u0508\3\2\2\2\u0086\u050d\3\2\2\2\u0088\u0510\3\2"+
		"\2\2\u008a\u0515\3\2\2\2\u008c\u0523\3\2\2\2\u008e\u052d\3\2\2\2\u0090"+
		"\u0531\3\2\2\2\u0092\u0533\3\2\2\2\u0094\u053c\3\2\2\2\u0096\u0545\3\2"+
		"\2\2\u0098\u0557\3\2\2\2\u009a\u055a\3\2\2\2\u009c\u0563\3\2\2\2\u009e"+
		"\u056b\3\2\2\2\u00a0\u0573\3\2\2\2\u00a2\u0585\3\2\2\2\u00a4\u0596\3\2"+
		"\2\2\u00a6\u05a6\3\2\2\2\u00a8\u05a8\3\2\2\2\u00aa\u05ab\3\2\2\2\u00ac"+
		"\u05af\3\2\2\2\u00ae\u05b4\3\2\2\2\u00b0\u05b6\3\2\2\2\u00b2\u05c0\3\2"+
		"\2\2\u00b4\u05c5\3\2\2\2\u00b6\u05c7\3\2\2\2\u00b8\u05c9\3\2\2\2\u00ba"+
		"\u05cb\3\2\2\2\u00bc\u05cd\3\2\2\2\u00be\u05cf\3\2\2\2\u00c0\u05dc\3\2"+
		"\2\2\u00c2\u05e0\3\2\2\2\u00c4\u05e2\3\2\2\2\u00c6\u05e7\3\2\2\2\u00c8"+
		"\u05ec\3\2\2\2\u00ca\u05ee\3\2\2\2\u00cc\u05fc\3\2\2\2\u00ce\u060a\3\2"+
		"\2\2\u00d0\u060c\3\2\2\2\u00d2\u0618\3\2\2\2\u00d4\u0624\3\2\2\2\u00d6"+
		"\u0626\3\2\2\2\u00d8\u062a\3\2\2\2\u00da\u0635\3\2\2\2\u00dc\u0639\3\2"+
		"\2\2\u00de\u064b\3\2\2\2\u00e0\u0653\3\2\2\2\u00e2\u065f\3\2\2\2\u00e4"+
		"\u0661\3\2\2\2\u00e6\u0663\3\2\2\2\u00e8\u0676\3\2\2\2\u00ea\u0678\3\2"+
		"\2\2\u00ec\u067f\3\2\2\2\u00ee\u0686\3\2\2\2\u00f0\u068f\3\2\2\2\u00f2"+
		"\u0698\3\2\2\2\u00f4\u06a1\3\2\2\2\u00f6\u06b8\3\2\2\2\u00f8\u06c8\3\2"+
		"\2\2\u00fa\u06ca\3\2\2\2\u00fc\u06d6\3\2\2\2\u00fe\u06d8\3\2\2\2\u0100"+
		"\u06da\3\2\2\2\u0102\u06e0\3\2\2\2\u0104\u06e7\3\2\2\2\u0106\u06ea\3\2"+
		"\2\2\u0108\u06f3\3\2\2\2\u010a\u06fb\3\2\2\2\u010c\u0707\3\2\2\2\u010e"+
		"\u070f\3\2\2\2\u0110\u071c\3\2\2\2\u0112\u071e\3\2\2\2\u0114\u0722\3\2"+
		"\2\2\u0116\u0730\3\2\2\2\u0118\u0732\3\2\2\2\u011a\u0737\3\2\2\2\u011c"+
		"\u073c\3\2\2\2\u011e\u0744\3\2\2\2\u0120\u0755\3\2\2\2\u0122\u0757\3\2"+
		"\2\2\u0124\u075a\3\2\2\2\u0126\u075d\3\2\2\2\u0128\u0760\3\2\2\2\u012a"+
		"\u0763\3\2\2\2\u012c\u0766\3\2\2\2\u012e\u0768\3\2\2\2\u0130\u076a\3\2"+
		"\2\2\u0132\u076c\3\2\2\2\u0134\u076e\3\2\2\2\u0136\u0777\3\2\2\2\u0138"+
		"\u0779\3\2\2\2\u013a\u078a\3\2\2\2\u013c\u078c\3\2\2\2\u013e\u078e\3\2"+
		"\2\2\u0140\u0796\3\2\2\2\u0142\u0798\3\2\2\2\u0144\u079f\3\2\2\2\u0146"+
		"\u07aa\3\2\2\2\u0148\u07ae\3\2\2\2\u014a\u07b2\3\2\2\2\u014c\u07b9\3\2"+
		"\2\2\u014e\u07bb\3\2\2\2\u0150\u07c0\3\2\2\2\u0152\u07c2\3\2\2\2\u0154"+
		"\u07d0\3\2\2\2\u0156\u07d8\3\2\2\2\u0158\u07da\3\2\2\2\u015a\u07e7\3\2"+
		"\2\2\u015c\u07e9\3\2\2\2\u015e\u07f4\3\2\2\2\u0160\u0804\3\2\2\2\u0162"+
		"\u080b\3\2\2\2\u0164\u081a\3\2\2\2\u0166\u081c\3\2\2\2\u0168\u0825\3\2"+
		"\2\2\u016a\u0827\3\2\2\2\u016c\u0836\3\2\2\2\u016e\u0838\3\2\2\2\u0170"+
		"\u083a\3\2\2\2\u0172\u0840\3\2\2\2\u0174\u0842\3\2\2\2\u0176\u0849\3\2"+
		"\2\2\u0178\u0854\3\2\2\2\u017a\u0858\3\2\2\2\u017c\u085c\3\2\2\2\u017e"+
		"\u0867\3\2\2\2\u0180\u0876\3\2\2\2\u0182\u0878\3\2\2\2\u0184\u0881\3\2"+
		"\2\2\u0186\u0883\3\2\2\2\u0188\u0892\3\2\2\2\u018a\u0894\3\2\2\2\u018c"+
		"\u0896\3\2\2\2\u018e\u089c\3\2\2\2\u0190\u089e\3\2\2\2\u0192\u08a5\3\2"+
		"\2\2\u0194\u08b0\3\2\2\2\u0196\u08b4\3\2\2\2\u0198\u08bb\3\2\2\2\u019a"+
		"\u08ca\3\2\2\2\u019c\u08cc\3\2\2\2\u019e\u019f\7a\2\2\u019f\u01a0\5\u00ba"+
		"^\2\u01a0\u01a7\7\26\2\2\u01a1\u01a4\5\u00ba^\2\u01a2\u01a3\7\23\2\2\u01a3"+
		"\u01a5\5\u00e0q\2\u01a4\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a8"+
		"\3\2\2\2\u01a6\u01a8\5\u00e0q\2\u01a7\u01a1\3\2\2\2\u01a7\u01a6\3\2\2"+
		"\2\u01a8\u01a9\3\2\2\2\u01a9\u01aa\7\27\2\2\u01aa\u01ab\7\21\2\2\u01ab"+
		"\u01ac\5\u0082B\2\u01ac\u01ad\5\u0094K\2\u01ad\u01ae\5\u0084C\2\u01ae"+
		"\3\3\2\2\2\u01af\u01b0\7a\2\2\u01b0\u01b1\5\u00ba^\2\u01b1\u01b2\7\26"+
		"\2\2\u01b2\u01b3\5\u00a6T\2\u01b3\u01b4\7\27\2\2\u01b4\u01b5\7\21\2\2"+
		"\u01b5\u01b6\5\u0082B\2\u01b6\u01b7\5\u0092J\2\u01b7\u01b8\5\u0084C\2"+
		"\u01b8\5\3\2\2\2\u01b9\u01ba\5\u00bc_\2\u01ba\u01bb\7-\2\2\u01bb\u01bc"+
		"\5\\/\2\u01bc\7\3\2\2\2\u01bd\u01be\5\u00bc_\2\u01be\u01c0\7\26\2\2\u01bf"+
		"\u01c1\5l\67\2\u01c0\u01bf\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c2\3\2"+
		"\2\2\u01c2\u01c3\7\27\2\2\u01c3\t\3\2\2\2\u01c4\u01c6\7\u0090\2\2\u01c5"+
		"\u01c4\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c8\7L"+
		"\2\2\u01c8\u01c9\5\u00b8]\2\u01c9\u01ca\7\26\2\2\u01ca\u01cb\5\u00a2R"+
		"\2\u01cb\u01cc\7\27\2\2\u01cc\u01cd\7\21\2\2\u01cd\u01dd\5\u0082B\2\u01ce"+
		"\u01de\7\u0084\2\2\u01cf\u01d3\5\u0098M\2\u01d0\u01d1\5\u0080A\2\u01d1"+
		"\u01d2\5\f\7\2\u01d2\u01d4\3\2\2\2\u01d3\u01d0\3\2\2\2\u01d3\u01d4\3\2"+
		"\2\2\u01d4\u01dc\3\2\2\2\u01d5\u01d9\5\f\7\2\u01d6\u01d7\5\u0080A\2\u01d7"+
		"\u01d8\5\u0098M\2\u01d8\u01da\3\2\2\2\u01d9\u01d6\3\2\2\2\u01d9\u01da"+
		"\3\2\2\2\u01da\u01dc\3\2\2\2\u01db\u01cf\3\2\2\2\u01db\u01d5\3\2\2\2\u01dc"+
		"\u01de\3\2\2\2\u01dd\u01ce\3\2\2\2\u01dd\u01db\3\2\2\2\u01de\u01df\3\2"+
		"\2\2\u01df\u01e0\5\u0084C\2\u01e0\13\3\2\2\2\u01e1\u01e2\7p\2\2\u01e2"+
		"\u01e4\7\26\2\2\u01e3\u01e5\5\u00dep\2\u01e4\u01e3\3\2\2\2\u01e4\u01e5"+
		"\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7\7\27\2\2\u01e7\r\3\2\2\2\u01e8"+
		"\u01ea\7\u0090\2\2\u01e9\u01e8\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01eb"+
		"\3\2\2\2\u01eb\u01ec\t\2\2\2\u01ec\u01ed\5\u00ba^\2\u01ed\u01f4\7\26\2"+
		"\2\u01ee\u01f5\5\22\n\2\u01ef\u01f5\5\u00e0q\2\u01f0\u01f1\5\22\n\2\u01f1"+
		"\u01f2\7\23\2\2\u01f2\u01f3\5\u00e0q\2\u01f3\u01f5\3\2\2\2\u01f4\u01ee"+
		"\3\2\2\2\u01f4\u01ef\3\2\2\2\u01f4\u01f0\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6"+
		"\u01f7\7\27\2\2\u01f7\u01f8\7\21\2\2\u01f8\u01fb\5\u0082B\2\u01f9\u01fc"+
		"\5\u00ccg\2\u01fa\u01fc\7\u0084\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fa\3"+
		"\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fe\5\u0084C\2\u01fe\17\3\2\2\2\u01ff"+
		"\u0200\7\u008e\2\2\u0200\u0201\5\u00ba^\2\u0201\u0202\7\26\2\2\u0202\u0203"+
		"\5\u00e0q\2\u0203\u0204\7\27\2\2\u0204\u0205\7\21\2\2\u0205\u0208\5\u0082"+
		"B\2\u0206\u0209\5\u00ccg\2\u0207\u0209\7\u0084\2\2\u0208\u0206\3\2\2\2"+
		"\u0208\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020b\5\u0084C\2\u020b"+
		"\21\3\2\2\2\u020c\u020d\5\u00b0Y\2\u020d\23\3\2\2\2\u020e\u020f\7X\2\2"+
		"\u020f\u0210\7\u0080\2\2\u0210\u0211\5\u0120\u0091\2\u0211\u0212\7\26"+
		"\2\2\u0212\u0213\5\u00c2b\2\u0213\u0216\7\27\2\2\u0214\u0215\7\63\2\2"+
		"\u0215\u0217\5\u00a2R\2\u0216\u0214\3\2\2\2\u0216\u0217\3\2\2\2\u0217"+
		"\u0218\3\2\2\2\u0218\u0219\7\21\2\2\u0219\u021a\5\u0082B\2\u021a\u021b"+
		"\5\u00eex\2\u021b\u021c\5\u0084C\2\u021c\25\3\2\2\2\u021d\u021e\7X\2\2"+
		"\u021e\u021f\5\u00b6\\\2\u021f\u0220\7\u008d\2\2\u0220\u0221\7\26\2\2"+
		"\u0221\u0222\7\27\2\2\u0222\u0223\7\21\2\2\u0223\u0224\5\u0082B\2\u0224"+
		"\u0225\5\u00eex\2\u0225\u0226\5\u0084C\2\u0226\27\3\2\2\2\u0227\u0228"+
		"\7X\2\2\u0228\u022a\5\u00b6\\\2\u0229\u022b\7x\2\2\u022a\u0229\3\2\2\2"+
		"\u022a\u022b\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022d\7\u008d\2\2\u022d"+
		"\u022e\7\26\2\2\u022e\u022f\7\27\2\2\u022f\u0230\7\21\2\2\u0230\u0231"+
		"\5\u0082B\2\u0231\u0232\5\u00e6t\2\u0232\u0233\5\u0084C\2\u0233\31\3\2"+
		"\2\2\u0234\u0235\7X\2\2\u0235\u0236\5\u00b6\\\2\u0236\u0237\7m\2\2\u0237"+
		"\u0238\7\26\2\2\u0238\u0239\7\27\2\2\u0239\u023a\7\21\2\2\u023a\u023b"+
		"\5\u0082B\2\u023b\u023c\5\u00eex\2\u023c\u023d\5\u0084C\2\u023d\33\3\2"+
		"\2\2\u023e\u023f\7X\2\2\u023f\u0241\5\u00b6\\\2\u0240\u0242\7x\2\2\u0241"+
		"\u0240\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0244\7m"+
		"\2\2\u0244\u0245\7\26\2\2\u0245\u0246\7\27\2\2\u0246\u0247\7\21\2\2\u0247"+
		"\u0248\5\u0082B\2\u0248\u0249\5\u00e6t\2\u0249\u024a\5\u0084C\2\u024a"+
		"\35\3\2\2\2\u024b\u024d\7\u0090\2\2\u024c\u024b\3\2\2\2\u024c\u024d\3"+
		"\2\2\2\u024d\u024e\3\2\2\2\u024e\u024f\7x\2\2\u024f\u0250\t\2\2\2\u0250"+
		"\u0251\5\u00ba^\2\u0251\u0253\7\26\2\2\u0252\u0254\5\u00e0q\2\u0253\u0252"+
		"\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0255\3\2\2\2\u0255\u0256\7\27\2\2"+
		"\u0256\u0257\7\21\2\2\u0257\u0258\5\u0082B\2\u0258\u025c\5\"\22\2\u0259"+
		"\u025a\5\u0080A\2\u025a\u025b\5\u00d0i\2\u025b\u025d\3\2\2\2\u025c\u0259"+
		"\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u025f\5\u0084C"+
		"\2\u025f\37\3\2\2\2\u0260\u0261\7x\2\2\u0261\u0262\7\u0088\2\2\u0262\u0263"+
		"\5\u00ba^\2\u0263\u0265\7\26\2\2\u0264\u0266\5\u00e0q\2\u0265\u0264\3"+
		"\2\2\2\u0265\u0266\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u0268\7\27\2\2\u0268"+
		"\u0269\7\21\2\2\u0269\u026a\5\u0082B\2\u026a\u026e\5\"\22\2\u026b\u026c"+
		"\5\u0080A\2\u026c\u026d\5\u00d0i\2\u026d\u026f\3\2\2\2\u026e\u026b\3\2"+
		"\2\2\u026e\u026f\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u0271\5\u0084C\2\u0271"+
		"!\3\2\2\2\u0272\u0273\7X\2\2\u0273\u0274\t\2\2\2\u0274\u0275\7O\2\2\u0275"+
		"\u0276\7\21\2\2\u0276\u0277\5\u0082B\2\u0277\u0278\5$\23\2\u0278\u0279"+
		"\5\u0084C\2\u0279#\3\2\2\2\u027a\u027b\b\23\1\2\u027b\u027c\5\u00d4k\2"+
		"\u027c\u0283\3\2\2\2\u027d\u027e\f\3\2\2\u027e\u027f\5\u0080A\2\u027f"+
		"\u0280\5\u00d4k\2\u0280\u0282\3\2\2\2\u0281\u027d\3\2\2\2\u0282\u0285"+
		"\3\2\2\2\u0283\u0281\3\2\2\2\u0283\u0284\3\2\2\2\u0284%\3\2\2\2\u0285"+
		"\u0283\3\2\2\2\u0286\u0287\7E\2\2\u0287\u0288\7X\2\2\u0288\u0289\5\u00b2"+
		"Z\2\u0289\u028b\7\26\2\2\u028a\u028c\5\u00be`\2\u028b\u028a\3\2\2\2\u028b"+
		"\u028c\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u0290\7\27\2\2\u028e\u028f\7"+
		"\63\2\2\u028f\u0291\5\u00a2R\2\u0290\u028e\3\2\2\2\u0290\u0291\3\2\2\2"+
		"\u0291\'\3\2\2\2\u0292\u0293\7X\2\2\u0293\u0294\5\u00b2Z\2\u0294\u0296"+
		"\7\26\2\2\u0295\u0297\5\u00be`\2\u0296\u0295\3\2\2\2\u0296\u0297\3\2\2"+
		"\2\u0297\u0298\3\2\2\2\u0298\u029b\7\27\2\2\u0299\u029a\7\63\2\2\u029a"+
		"\u029c\5\u00a2R\2\u029b\u0299\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u029d"+
		"\3\2\2\2\u029d\u029e\7\21\2\2\u029e\u029f\5\u0082B\2\u029f\u02a0\5\u00ee"+
		"x\2\u02a0\u02a1\5\u0084C\2\u02a1)\3\2\2\2\u02a2\u02a4\7X\2\2\u02a3\u02a5"+
		"\7x\2\2\u02a4\u02a3\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6"+
		"\u02a7\5\u00b2Z\2\u02a7\u02a9\7\26\2\2\u02a8\u02aa\5\u00be`\2\u02a9\u02a8"+
		"\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab\u02ae\7\27\2\2"+
		"\u02ac\u02ad\7\63\2\2\u02ad\u02af\5\u00c8e\2\u02ae\u02ac\3\2\2\2\u02ae"+
		"\u02af\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0\u02b1\7\21\2\2\u02b1\u02b2\5"+
		"\u0082B\2\u02b2\u02b3\5\u00e6t\2\u02b3\u02b4\5\u0084C\2\u02b4+\3\2\2\2"+
		"\u02b5\u02b6\7X\2\2\u02b6\u02b7\7\u0093\2\2\u02b7\u02b8\7\u00a7\2\2\u02b8"+
		"\u02b9\7\26\2\2\u02b9\u02ba\7\27\2\2\u02ba\u02bb\7\21\2\2\u02bb\u02bc"+
		"\5\u0082B\2\u02bc\u02bd\5\u00eex\2\u02bd\u02be\5\u0084C\2\u02be\u02bf"+
		"\5\u0080A\2\u02bf\u02c0\7\u0098\2\2\u02c0\u02c6\7\21\2\2\u02c1\u02c2\5"+
		"\u0082B\2\u02c2\u02c3\5\u00f0y\2\u02c3\u02c4\5\u0084C\2\u02c4\u02c7\3"+
		"\2\2\2\u02c5\u02c7\5\u00bc_\2\u02c6\u02c1\3\2\2\2\u02c6\u02c5\3\2\2\2"+
		"\u02c7-\3\2\2\2\u02c8\u02c9\5\\/\2\u02c9/\3\2\2\2\u02ca\u02cb\5\u00b6"+
		"\\\2\u02cb\u02cc\7\21\2\2\u02cc\u02d1\5\u00c8e\2\u02cd\u02ce\7\26\2\2"+
		"\u02ce\u02cf\5\u00e0q\2\u02cf\u02d0\7\27\2\2\u02d0\u02d2\3\2\2\2\u02d1"+
		"\u02cd\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2\u02d5\3\2\2\2\u02d3\u02d4\7-"+
		"\2\2\u02d4\u02d6\5\u0102\u0082\2\u02d5\u02d3\3\2\2\2\u02d5\u02d6\3\2\2"+
		"\2\u02d6\61\3\2\2\2\u02d7\u02eb\58\35\2\u02d8\u02eb\5x=\2\u02d9\u02eb"+
		"\5|?\2\u02da\u02eb\5\66\34\2\u02db\u02eb\5\64\33\2\u02dc\u02eb\5X-\2\u02dd"+
		"\u02eb\5Z.\2\u02de\u02eb\5N(\2\u02df\u02eb\5D#\2\u02e0\u02eb\5H%\2\u02e1"+
		"\u02eb\5L\'\2\u02e2\u02eb\5J&\2\u02e3\u02eb\5R*\2\u02e4\u02eb\5T+\2\u02e5"+
		"\u02eb\5p9\2\u02e6\u02eb\5@!\2\u02e7\u02eb\5B\"\2\u02e8\u02eb\5(\25\2"+
		"\u02e9\u02eb\5\u00e4s\2\u02ea\u02d7\3\2\2\2\u02ea\u02d8\3\2\2\2\u02ea"+
		"\u02d9\3\2\2\2\u02ea\u02da\3\2\2\2\u02ea\u02db\3\2\2\2\u02ea\u02dc\3\2"+
		"\2\2\u02ea\u02dd\3\2\2\2\u02ea\u02de\3\2\2\2\u02ea\u02df\3\2\2\2\u02ea"+
		"\u02e0\3\2\2\2\u02ea\u02e1\3\2\2\2\u02ea\u02e2\3\2\2\2\u02ea\u02e3\3\2"+
		"\2\2\u02ea\u02e4\3\2\2\2\u02ea\u02e5\3\2\2\2\u02ea\u02e6\3\2\2\2\u02ea"+
		"\u02e7\3\2\2\2\u02ea\u02e8\3\2\2\2\u02ea\u02e9\3\2\2\2\u02eb\63\3\2\2"+
		"\2\u02ec\u02ed\7j\2\2\u02ed\u02ee\7\26\2\2\u02ee\u02ef\7\27\2\2\u02ef"+
		"\65\3\2\2\2\u02f0\u02f1\7[\2\2\u02f1\u02f2\7\26\2\2\u02f2\u02f3\5\u009e"+
		"P\2\u02f3\u02f4\7\27\2\2\u02f4\u0305\3\2\2\2\u02f5\u02f6\7\u0091\2\2\u02f6"+
		"\u02f7\7\26\2\2\u02f7\u02f8\5\u009eP\2\u02f8\u02f9\7\27\2\2\u02f9\u0305"+
		"\3\2\2\2\u02fa\u02fb\7[\2\2\u02fb\u02fc\7\26\2\2\u02fc\u02fd\5\u009eP"+
		"\2\u02fd\u02fe\7\27\2\2\u02fe\u02ff\7H\2\2\u02ff\u0300\7\u0091\2\2\u0300"+
		"\u0301\7\26\2\2\u0301\u0302\5\u009eP\2\u0302\u0303\7\27\2\2\u0303\u0305"+
		"\3\2\2\2\u0304\u02f0\3\2\2\2\u0304\u02f5\3\2\2\2\u0304\u02fa\3\2\2\2\u0305"+
		"\67\3\2\2\2\u0306\u0307\5:\36\2\u0307\u0309\7\26\2\2\u0308\u030a\5l\67"+
		"\2\u0309\u0308\3\2\2\2\u0309\u030a\3\2\2\2\u030a\u030b\3\2\2\2\u030b\u030c"+
		"\7\27\2\2\u030c9\3\2\2\2\u030d\u0313\5\u00b2Z\2\u030e\u030f\5<\37\2\u030f"+
		"\u0310\7\25\2\2\u0310\u0311\5\u00b2Z\2\u0311\u0313\3\2\2\2\u0312\u030d"+
		"\3\2\2\2\u0312\u030e\3\2\2\2\u0313;\3\2\2\2\u0314\u0315\b\37\1\2\u0315"+
		"\u0316\5\u00b4[\2\u0316\u031b\3\2\2\2\u0317\u0318\f\3\2\2\u0318\u031a"+
		"\5> \2\u0319\u0317\3\2\2\2\u031a\u031d\3\2\2\2\u031b\u0319\3\2\2\2\u031b"+
		"\u031c\3\2\2\2\u031c=\3\2\2\2\u031d\u031b\3\2\2\2\u031e\u031f\7\25\2\2"+
		"\u031f\u0325\5\u00b6\\\2\u0320\u0321\7\30\2\2\u0321\u0322\5\\/\2\u0322"+
		"\u0323\7\31\2\2\u0323\u0325\3\2\2\2\u0324\u031e\3\2\2\2\u0324\u0320\3"+
		"\2\2\2\u0325?\3\2\2\2\u0326\u0327\7\u0099\2\2\u0327\u0328\5\u0112\u008a"+
		"\2\u0328\u0329\7\21\2\2\u0329\u032a\5\u0082B\2\u032a\u032b\5\u00eex\2"+
		"\u032b\u032c\5\u0084C\2\u032cA\3\2\2\2\u032d\u032e\7\u0099\2\2\u032e\u032f"+
		"\5\u00ba^\2\u032f\u0330\7\21\2\2\u0330\u0331\5\u0082B\2\u0331\u0332\5"+
		"\u00eex\2\u0332\u0333\5\u0084C\2\u0333C\3\2\2\2\u0334\u0335\7\u0092\2"+
		"\2\u0335\u0336\7}\2\2\u0336\u0337\5\\/\2\u0337\u0338\7\21\2\2\u0338\u0339"+
		"\5\u0082B\2\u0339\u0341\5\u00f2z\2\u033a\u033b\5\u0080A\2\u033b\u033c"+
		"\7\u0083\2\2\u033c\u033d\7\21\2\2\u033d\u033e\5\u0082B\2\u033e\u033f\5"+
		"\u00eex\2\u033f\u0340\5\u0084C\2\u0340\u0342\3\2\2\2\u0341\u033a\3\2\2"+
		"\2\u0341\u0342\3\2\2\2\u0342\u0343\3\2\2\2\u0343\u0344\5\u0084C\2\u0344"+
		"E\3\2\2\2\u0345\u0346\7\u009a\2\2\u0346\u0347\5\u00f8}\2\u0347\u0348\7"+
		"\21\2\2\u0348\u0349\5\u0082B\2\u0349\u034a\5\u00eex\2\u034a\u034b\5\u0084"+
		"C\2\u034b\u0355\3\2\2\2\u034c\u034d\7\u009a\2\2\u034d\u034e\7o\2\2\u034e"+
		"\u034f\5\u00f6|\2\u034f\u0350\7\21\2\2\u0350\u0351\5\u0082B\2\u0351\u0352"+
		"\5\u00eex\2\u0352\u0353\5\u0084C\2\u0353\u0355\3\2\2\2\u0354\u0345\3\2"+
		"\2\2\u0354\u034c\3\2\2\2\u0355G\3\2\2\2\u0356\u0357\7k\2\2\u0357\u035a"+
		"\5\u00b6\\\2\u0358\u0359\7\23\2\2\u0359\u035b\5\u00b6\\\2\u035a\u0358"+
		"\3\2\2\2\u035a\u035b\3\2\2\2\u035b\u035c\3\2\2\2\u035c\u035d\7o\2\2\u035d"+
		"\u035e\5\\/\2\u035e\u035f\7\21\2\2\u035f\u0360\5\u0082B\2\u0360\u0361"+
		"\5\u00eex\2\u0361\u0362\5\u0084C\2\u0362I\3\2\2\2\u0363\u0364\7]\2\2\u0364"+
		"\u0365\7\21\2\2\u0365\u0366\5\u0082B\2\u0366\u0367\5\u00eex\2\u0367\u0368"+
		"\5\u0084C\2\u0368\u0369\5\u0080A\2\u0369\u036a\7\u009c\2\2\u036a\u036b"+
		"\5\\/\2\u036bK\3\2\2\2\u036c\u036d\7\u009c\2\2\u036d\u036e\5\\/\2\u036e"+
		"\u036f\7\21\2\2\u036f\u0370\5\u0082B\2\u0370\u0371\5\u00eex\2\u0371\u0372"+
		"\5\u0084C\2\u0372M\3\2\2\2\u0373\u0374\7n\2\2\u0374\u0375\5\\/\2\u0375"+
		"\u0376\7\21\2\2\u0376\u0377\5\u0082B\2\u0377\u0378\5\u00eex\2\u0378\u037c"+
		"\5\u0084C\2\u0379\u037a\5\u0080A\2\u037a\u037b\5P)\2\u037b\u037d\3\2\2"+
		"\2\u037c\u0379\3\2\2\2\u037c\u037d\3\2\2\2\u037d\u0385\3\2\2\2\u037e\u037f"+
		"\5\u0080A\2\u037f\u0380\7`\2\2\u0380\u0381\7\21\2\2\u0381\u0382\5\u0082"+
		"B\2\u0382\u0383\5\u00eex\2\u0383\u0384\5\u0084C\2\u0384\u0386\3\2\2\2"+
		"\u0385\u037e\3\2\2\2\u0385\u0386\3\2\2\2\u0386O\3\2\2\2\u0387\u0388\b"+
		")\1\2\u0388\u0389\7`\2\2\u0389\u038a\7n\2\2\u038a\u038b\5\\/\2\u038b\u038c"+
		"\7\21\2\2\u038c\u038d\5\u0082B\2\u038d\u038e\5\u00eex\2\u038e\u038f\5"+
		"\u0084C\2\u038f\u039c\3\2\2\2\u0390\u0391\f\3\2\2\u0391\u0392\5\u0080"+
		"A\2\u0392\u0393\7`\2\2\u0393\u0394\7n\2\2\u0394\u0395\5\\/\2\u0395\u0396"+
		"\7\21\2\2\u0396\u0397\5\u0082B\2\u0397\u0398\5\u00eex\2\u0398\u0399\5"+
		"\u0084C\2\u0399\u039b\3\2\2\2\u039a\u0390\3\2\2\2\u039b\u039e\3\2\2\2"+
		"\u039c\u039a\3\2\2\2\u039c\u039d\3\2\2\2\u039dQ\3\2\2\2\u039e\u039c\3"+
		"\2\2\2\u039f\u03a0\7\u0085\2\2\u03a0\u03a1\5\\/\2\u03a1S\3\2\2\2\u03a2"+
		"\u03a3\7\u0097\2\2\u03a3\u03a4\5\u00b6\\\2\u03a4\u03a5\7\21\2\2\u03a5"+
		"\u03a6\5\u0082B\2\u03a6\u03a7\5\u00eex\2\u03a7\u03a8\5\u0084C\2\u03a8"+
		"\u03aa\5~@\2\u03a9\u03ab\5\u00f4{\2\u03aa\u03a9\3\2\2\2\u03aa\u03ab\3"+
		"\2\2\2\u03ab\u03b3\3\2\2\2\u03ac\u03ad\7c\2\2\u03ad\u03ae\7\21\2\2\u03ae"+
		"\u03af\5\u0082B\2\u03af\u03b0\5\u00eex\2\u03b0\u03b1\5\u0084C\2\u03b1"+
		"\u03b2\5~@\2\u03b2\u03b4\3\2\2\2\u03b3\u03ac\3\2\2\2\u03b3\u03b4\3\2\2"+
		"\2\u03b4\u03bc\3\2\2\2\u03b5\u03b6\7i\2\2\u03b6\u03b7\7\21\2\2\u03b7\u03b8"+
		"\5\u0082B\2\u03b8\u03b9\5\u00eex\2\u03b9\u03ba\5\u0084C\2\u03ba\u03bb"+
		"\5~@\2\u03bb\u03bd\3\2\2\2\u03bc\u03b5\3\2\2\2\u03bc\u03bd\3\2\2\2\u03bd"+
		"\u03be\3\2\2\2\u03be\u03bf\5~@\2\u03bfU\3\2\2\2\u03c0\u03c1\7c\2\2\u03c1"+
		"\u03c2\5\u00bc_\2\u03c2\u03c3\7\21\2\2\u03c3\u03c4\5\u0082B\2\u03c4\u03c5"+
		"\5\u00eex\2\u03c5\u03c6\5\u0084C\2\u03c6\u03c7\5~@\2\u03c7\u03d4\3\2\2"+
		"\2\u03c8\u03c9\7c\2\2\u03c9\u03ca\7o\2\2\u03ca\u03cb\7\30\2\2\u03cb\u03cc"+
		"\5\u0096L\2\u03cc\u03cd\7\31\2\2\u03cd\u03ce\7\21\2\2\u03ce\u03cf\5\u0082"+
		"B\2\u03cf\u03d0\5\u00eex\2\u03d0\u03d1\5\u0084C\2\u03d1\u03d2\5~@\2\u03d2"+
		"\u03d4\3\2\2\2\u03d3\u03c0\3\2\2\2\u03d3\u03c8\3\2\2\2\u03d4W\3\2\2\2"+
		"\u03d5\u03d6\7P\2\2\u03d6Y\3\2\2\2\u03d7\u03d9\7\u0089\2\2\u03d8\u03da"+
		"\5\\/\2\u03d9\u03d8\3\2\2\2\u03d9\u03da\3\2\2\2\u03da[\3\2\2\2\u03db\u03dc"+
		"\b/\1\2\u03dc\u03dd\7#\2\2\u03dd\u03ee\5\\/\"\u03de\u03df\7z\2\2\u03df"+
		"\u03ee\5\\/!\u03e0\u03ee\5`\61\2\u03e1\u03ee\5b\62\2\u03e2\u03e3\7>\2"+
		"\2\u03e3\u03e4\7\26\2\2\u03e4\u03e5\5\\/\2\u03e5\u03e6\7\27\2\2\u03e6"+
		"\u03ee\3\2\2\2\u03e7\u03e8\7d\2\2\u03e8\u03e9\7\26\2\2\u03e9\u03ea\5\u00b6"+
		"\\\2\u03ea\u03eb\7\27\2\2\u03eb\u03ee\3\2\2\2\u03ec\u03ee\5^\60\2\u03ed"+
		"\u03db\3\2\2\2\u03ed\u03de\3\2\2\2\u03ed\u03e0\3\2\2\2\u03ed\u03e1\3\2"+
		"\2\2\u03ed\u03e2\3\2\2\2\u03ed\u03e7\3\2\2\2\u03ed\u03ec\3\2\2\2\u03ee"+
		"\u0457\3\2\2\2\u03ef\u03f0\f \2\2\u03f0\u03f1\5\u012e\u0098\2\u03f1\u03f2"+
		"\5\\/!\u03f2\u0456\3\2\2\2\u03f3\u03f4\f\37\2\2\u03f4\u03f5\5\u0130\u0099"+
		"\2\u03f5\u03f6\5\\/ \u03f6\u0456\3\2\2\2\u03f7\u03f8\f\36\2\2\u03f8\u03f9"+
		"\5\u0134\u009b\2\u03f9\u03fa\5\\/\37\u03fa\u0456\3\2\2\2\u03fb\u03fc\f"+
		"\35\2\2\u03fc\u03fd\5\u0132\u009a\2\u03fd\u03fe\5\\/\36\u03fe\u0456\3"+
		"\2\2\2\u03ff\u0400\f\34\2\2\u0400\u0401\t\3\2\2\u0401\u0456\5\\/\35\u0402"+
		"\u0403\f\33\2\2\u0403\u0404\7*\2\2\u0404\u0456\5\\/\34\u0405\u0406\f\32"+
		"\2\2\u0406\u0407\7+\2\2\u0407\u0456\5\\/\33\u0408\u0409\f\31\2\2\u0409"+
		"\u040a\7(\2\2\u040a\u0456\5\\/\32\u040b\u040c\f\30\2\2\u040c\u040d\7)"+
		"\2\2\u040d\u0456\5\\/\31\u040e\u040f\f\25\2\2\u040f\u0410\7/\2\2\u0410"+
		"\u0456\5\\/\26\u0411\u0412\f\24\2\2\u0412\u0413\7.\2\2\u0413\u0456\5\\"+
		"/\25\u0414\u0415\f\23\2\2\u0415\u0416\7\60\2\2\u0416\u0456\5\\/\24\u0417"+
		"\u0418\f\22\2\2\u0418\u0419\7\u0081\2\2\u0419\u0456\5\\/\23\u041a\u041b"+
		"\f\21\2\2\u041b\u041c\7H\2\2\u041c\u0456\5\\/\22\u041d\u041e\f\20\2\2"+
		"\u041e\u041f\7n\2\2\u041f\u0420\5\\/\2\u0420\u0421\7`\2\2\u0421\u0422"+
		"\5\\/\21\u0422\u0456\3\2\2\2\u0423\u0424\f\16\2\2\u0424\u0425\7o\2\2\u0425"+
		"\u0456\5\\/\17\u0426\u0427\f\r\2\2\u0427\u0428\7W\2\2\u0428\u0456\5\\"+
		"/\16\u0429\u042a\f\f\2\2\u042a\u042b\7W\2\2\u042b\u042c\7F\2\2\u042c\u0456"+
		"\5\\/\r\u042d\u042e\f\13\2\2\u042e\u042f\7W\2\2\u042f\u0430\7I\2\2\u0430"+
		"\u0456\5\\/\f\u0431\u0432\f\n\2\2\u0432\u0433\7z\2\2\u0433\u0434\7o\2"+
		"\2\u0434\u0456\5\\/\13\u0435\u0436\f\t\2\2\u0436\u0437\7z\2\2\u0437\u0438"+
		"\7W\2\2\u0438\u0456\5\\/\n\u0439\u043a\f\b\2\2\u043a\u043b\7z\2\2\u043b"+
		"\u043c\7W\2\2\u043c\u043d\7F\2\2\u043d\u0456\5\\/\t\u043e\u043f\f\7\2"+
		"\2\u043f\u0440\7z\2\2\u0440\u0441\7W\2\2\u0441\u0442\7I\2\2\u0442\u0456"+
		"\5\\/\b\u0443\u0444\f\3\2\2\u0444\u0445\7k\2\2\u0445\u0446\5\u00b6\\\2"+
		"\u0446\u0447\7o\2\2\u0447\u0448\5\\/\4\u0448\u0456\3\2\2\2\u0449\u044a"+
		"\f$\2\2\u044a\u0456\5r:\2\u044b\u044c\f\27\2\2\u044c\u044d\7r\2\2\u044d"+
		"\u044e\7z\2\2\u044e\u0456\5\u0116\u008c\2\u044f\u0450\f\26\2\2\u0450\u0451"+
		"\7r\2\2\u0451\u0456\5\u0116\u008c\2\u0452\u0453\f\17\2\2\u0453\u0454\7"+
		"J\2\2\u0454\u0456\5\u00c8e\2\u0455\u03ef\3\2\2\2\u0455\u03f3\3\2\2\2\u0455"+
		"\u03f7\3\2\2\2\u0455\u03fb\3\2\2\2\u0455\u03ff\3\2\2\2\u0455\u0402\3\2"+
		"\2\2\u0455\u0405\3\2\2\2\u0455\u0408\3\2\2\2\u0455\u040b\3\2\2\2\u0455"+
		"\u040e\3\2\2\2\u0455\u0411\3\2\2\2\u0455\u0414\3\2\2\2\u0455\u0417\3\2"+
		"\2\2\u0455\u041a\3\2\2\2\u0455\u041d\3\2\2\2\u0455\u0423\3\2\2\2\u0455"+
		"\u0426\3\2\2\2\u0455\u0429\3\2\2\2\u0455\u042d\3\2\2\2\u0455\u0431\3\2"+
		"\2\2\u0455\u0435\3\2\2\2\u0455\u0439\3\2\2\2\u0455\u043e\3\2\2\2\u0455"+
		"\u0443\3\2\2\2\u0455\u0449\3\2\2\2\u0455\u044b\3\2\2\2\u0455\u044f\3\2"+
		"\2\2\u0455\u0452\3\2\2\2\u0456\u0459\3\2\2\2\u0457\u0455\3\2\2\2\u0457"+
		"\u0458\3\2\2\2\u0458]\3\2\2\2\u0459\u0457\3\2\2\2\u045a\u045b\5\u00ba"+
		"^\2\u045b_\3\2\2\2\u045c\u045d\b\61\1\2\u045d\u045e\5\u00fc\177\2\u045e"+
		"\u0463\3\2\2\2\u045f\u0460\f\3\2\2\u0460\u0462\5d\63\2\u0461\u045f\3\2"+
		"\2\2\u0462\u0465\3\2\2\2\u0463\u0461\3\2\2\2\u0463\u0464\3\2\2\2\u0464"+
		"a\3\2\2\2\u0465\u0463\3\2\2\2\u0466\u046f\5f\64\2\u0467\u046f\5h\65\2"+
		"\u0468\u046f\5t;\2\u0469\u046f\5\u0118\u008d\2\u046a\u046f\5\u011a\u008e"+
		"\2\u046b\u046f\5v<\2\u046c\u046f\58\35\2\u046d\u046f\5j\66\2\u046e\u0466"+
		"\3\2\2\2\u046e\u0467\3\2\2\2\u046e\u0468\3\2\2\2\u046e\u0469\3\2\2\2\u046e"+
		"\u046a\3\2\2\2\u046e\u046b\3\2\2\2\u046e\u046c\3\2\2\2\u046e\u046d\3\2"+
		"\2\2\u046fc\3\2\2\2\u0470\u0471\6\63\"\3\u0471\u0472\7\25\2\2\u0472\u047e"+
		"\5\u00b6\\\2\u0473\u0474\6\63#\3\u0474\u0475\7\30\2\2\u0475\u0476\5\u0110"+
		"\u0089\2\u0476\u0477\7\31\2\2\u0477\u047e\3\2\2\2\u0478\u0479\6\63$\3"+
		"\u0479\u047a\7\30\2\2\u047a\u047b\5\\/\2\u047b\u047c\7\31\2\2\u047c\u047e"+
		"\3\2\2\2\u047d\u0470\3\2\2\2\u047d\u0473\3\2\2\2\u047d\u0478\3\2\2\2\u047e"+
		"e\3\2\2\2\u047f\u0480\7@\2\2\u0480\u0482\7\26\2\2\u0481\u0483\5\\/\2\u0482"+
		"\u0481\3\2\2\2\u0482\u0483\3\2\2\2\u0483\u0484\3\2\2\2\u0484\u0485\7\27"+
		"\2\2\u0485g\3\2\2\2\u0486\u0487\7?\2\2\u0487\u0489\7\26\2\2\u0488\u048a"+
		"\5\\/\2\u0489\u0488\3\2\2\2\u0489\u048a\3\2\2\2\u048a\u048b\3\2\2\2\u048b"+
		"\u048c\7\27\2\2\u048ci\3\2\2\2\u048d\u048e\5\u00aaV\2\u048e\u0490\7\26"+
		"\2\2\u048f\u0491\5l\67\2\u0490\u048f\3\2\2\2\u0490\u0491\3\2\2\2\u0491"+
		"\u0492\3\2\2\2\u0492\u0493\7\27\2\2\u0493k\3\2\2\2\u0494\u0495\b\67\1"+
		"\2\u0495\u0496\5\\/\2\u0496\u0497\6\67%\3\u0497\u049a\3\2\2\2\u0498\u049a"+
		"\5n8\2\u0499\u0494\3\2\2\2\u0499\u0498\3\2\2\2\u049a\u04a0\3\2\2\2\u049b"+
		"\u049c\f\3\2\2\u049c\u049d\7\23\2\2\u049d\u049f\5n8\2\u049e\u049b\3\2"+
		"\2\2\u049f\u04a2\3\2\2\2\u04a0\u049e\3\2\2\2\u04a0\u04a1\3\2\2\2\u04a1"+
		"m\3\2\2\2\u04a2\u04a0\3\2\2\2\u04a3\u04a4\5\u00b6\\\2\u04a4\u04a5\5\u012c"+
		"\u0097\2\u04a5\u04a6\5\\/\2\u04a6o\3\2\2\2\u04a7\u04a8\7\u009d\2\2\u04a8"+
		"\u04a9\5\\/\2\u04a9\u04aa\7\u0096\2\2\u04aa\u04ab\5\\/\2\u04abq\3\2\2"+
		"\2\u04ac\u04ad\7h\2\2\u04ad\u04ae\7\u0099\2\2\u04ae\u04af\5\u00b6\\\2"+
		"\u04af\u04b0\7\u009b\2\2\u04b0\u04b1\5\\/\2\u04b1s\3\2\2\2\u04b2\u04b3"+
		"\7g\2\2\u04b3\u04b5\7~\2\2\u04b4\u04b6\5\u00aaV\2\u04b5\u04b4\3\2\2\2"+
		"\u04b5\u04b6\3\2\2\2\u04b6\u04b7\3\2\2\2\u04b7\u04b8\7\u009b\2\2\u04b8"+
		"\u04d1\5\\/\2\u04b9\u04c0\7g\2\2\u04ba\u04c1\7F\2\2\u04bb\u04bc\7\u008b"+
		"\2\2\u04bc\u04bd\5\\/\2\u04bd\u04be\7\u0096\2\2\u04be\u04bf\5\\/\2\u04bf"+
		"\u04c1\3\2\2\2\u04c0\u04ba\3\2\2\2\u04c0\u04bb\3\2\2\2\u04c1\u04c2\3\2"+
		"\2\2\u04c2\u04c4\7\26\2\2\u04c3\u04c5\5\u00aaV\2\u04c4\u04c3\3\2\2\2\u04c4"+
		"\u04c5\3\2\2\2\u04c5\u04c6\3\2\2\2\u04c6\u04c9\7\27\2\2\u04c7\u04c8\7"+
		"\u009b\2\2\u04c8\u04ca\5\\/\2\u04c9\u04c7\3\2\2\2\u04c9\u04ca\3\2\2\2"+
		"\u04ca\u04ce\3\2\2\2\u04cb\u04cc\7\u0082\2\2\u04cc\u04cd\7Q\2\2\u04cd"+
		"\u04cf\5\u011c\u008f\2\u04ce\u04cb\3\2\2\2\u04ce\u04cf\3\2\2\2\u04cf\u04d1"+
		"\3\2\2\2\u04d0\u04b2\3\2\2\2\u04d0\u04b9\3\2\2\2\u04d1u\3\2\2\2\u04d2"+
		"\u04d4\7\u008f\2\2\u04d3\u04d5\7\\\2\2\u04d4\u04d3\3\2\2\2\u04d4\u04d5"+
		"\3\2\2\2\u04d5\u04d6\3\2\2\2\u04d6\u04d7\7\26\2\2\u04d7\u04dd\5`\61\2"+
		"\u04d8\u04d9\7\23\2\2\u04d9\u04da\5\u0124\u0093\2\u04da\u04db\7-\2\2\u04db"+
		"\u04dc\5`\61\2\u04dc\u04de\3\2\2\2\u04dd\u04d8\3\2\2\2\u04dd\u04de\3\2"+
		"\2\2\u04de\u04df\3\2\2\2\u04df\u04e0\7\27\2\2\u04e0w\3\2\2\2\u04e1\u04e2"+
		"\5\u0114\u008b\2\u04e2\u04e3\5\u012c\u0097\2\u04e3\u04e4\5\\/\2\u04e4"+
		"y\3\2\2\2\u04e5\u04e6\6>\'\3\u04e6\u04e7\7\25\2\2\u04e7\u04ee\5\u00b6"+
		"\\\2\u04e8\u04e9\6>(\3\u04e9\u04ea\7\30\2\2\u04ea\u04eb\5\\/\2\u04eb\u04ec"+
		"\7\31\2\2\u04ec\u04ee\3\2\2\2\u04ed\u04e5\3\2\2\2\u04ed\u04e8\3\2\2\2"+
		"\u04ee{\3\2\2\2\u04ef\u04f0\5\u00dep\2\u04f0\u04f1\5\u012c\u0097\2\u04f1"+
		"\u04f2\5\\/\2\u04f2}\3\2\2\2\u04f3\u04f5\7\7\2\2\u04f4\u04f3\3\2\2\2\u04f5"+
		"\u04f8\3\2\2\2\u04f6\u04f4\3\2\2\2\u04f6\u04f7\3\2\2\2\u04f7\177\3\2\2"+
		"\2\u04f8\u04f6\3\2\2\2\u04f9\u04fb\7\7\2\2\u04fa\u04f9\3\2\2\2\u04fb\u04fc"+
		"\3\2\2\2\u04fc\u04fa\3\2\2\2\u04fc\u04fd\3\2\2\2\u04fd\u0081\3\2\2\2\u04fe"+
		"\u0500\7\7\2\2\u04ff\u04fe\3\2\2\2\u0500\u0501\3\2\2\2\u0501\u04ff\3\2"+
		"\2\2\u0501\u0502\3\2\2\2\u0502\u0503\3\2\2\2\u0503\u0504\7\3\2\2\u0504"+
		"\u0083\3\2\2\2\u0505\u0507\7\7\2\2\u0506\u0505\3\2\2\2\u0507\u050a\3\2"+
		"\2\2\u0508\u0506\3\2\2\2\u0508\u0509\3\2\2\2\u0509\u050b\3\2\2\2\u050a"+
		"\u0508\3\2\2\2\u050b\u050c\7\4\2\2\u050c\u0085\3\2\2\2\u050d\u050e\7y"+
		"\2\2\u050e\u0087\3\2\2\2\u050f\u0511\5\u008aF\2\u0510\u050f\3\2\2\2\u0510"+
		"\u0511\3\2\2\2\u0511\u0512\3\2\2\2\u0512\u0513\5~@\2\u0513\u0514\7\2\2"+
		"\3\u0514\u0089\3\2\2\2\u0515\u051b\5\u008cG\2\u0516\u0517\5\u0080A\2\u0517"+
		"\u0518\5\u008cG\2\u0518\u051a\3\2\2\2\u0519\u0516\3\2\2\2\u051a\u051d"+
		"\3\2\2\2\u051b\u0519\3\2\2\2\u051b\u051c\3\2\2\2\u051c\u008b\3\2\2\2\u051d"+
		"\u051b\3\2\2\2\u051e\u051f\5\u00e4s\2\u051f\u0520\5\u0080A\2\u0520\u0522"+
		"\3\2\2\2\u0521\u051e\3\2\2\2\u0522\u0525\3\2\2\2\u0523\u0521\3\2\2\2\u0523"+
		"\u0524\3\2\2\2\u0524\u052b\3\2\2\2\u0525\u0523\3\2\2\2\u0526\u052c\5\n"+
		"\6\2\u0527\u052c\5\u00aeX\2\u0528\u052c\5\u008eH\2\u0529\u052c\5\u0090"+
		"I\2\u052a\u052c\5\u00e2r\2\u052b\u0526\3\2\2\2\u052b\u0527\3\2\2\2\u052b"+
		"\u0528\3\2\2\2\u052b\u0529\3\2\2\2\u052b\u052a\3\2\2\2\u052c\u008d\3\2"+
		"\2\2\u052d\u052e\5 \21\2\u052e\u008f\3\2\2\2\u052f\u0532\5\2\2\2\u0530"+
		"\u0532\5\4\3\2\u0531\u052f\3\2\2\2\u0531\u0530\3\2\2\2\u0532\u0091\3\2"+
		"\2\2\u0533\u0539\5\6\4\2\u0534\u0535\5\u0080A\2\u0535\u0536\5\6\4\2\u0536"+
		"\u0538\3\2\2\2\u0537\u0534\3\2\2\2\u0538\u053b\3\2\2\2\u0539\u0537\3\2"+
		"\2\2\u0539\u053a\3\2\2\2\u053a\u0093\3\2\2\2\u053b\u0539\3\2\2\2\u053c"+
		"\u0542\5\b\5\2\u053d\u053e\5\u0080A\2\u053e\u053f\5\b\5\2\u053f\u0541"+
		"\3\2\2\2\u0540\u053d\3\2\2\2\u0541\u0544\3\2\2\2\u0542\u0540\3\2\2\2\u0542"+
		"\u0543\3\2\2\2\u0543\u0095\3\2\2\2\u0544\u0542\3\2\2\2\u0545\u054a\5\u00bc"+
		"_\2\u0546\u0547\7\23\2\2\u0547\u0549\5\u00bc_\2\u0548\u0546\3\2\2\2\u0549"+
		"\u054c\3\2\2\2\u054a\u0548\3\2\2\2\u054a\u054b\3\2\2\2\u054b\u0097\3\2"+
		"\2\2\u054c\u054a\3\2\2\2\u054d\u054e\7o\2\2\u054e\u0558\5\u009aN\2\u054f"+
		"\u0550\7o\2\2\u0550\u0558\5\u009cO\2\u0551\u0552\7o\2\2\u0552\u0558\5"+
		"\u00a0Q\2\u0553\u0554\7s\2\2\u0554\u0558\7\u00a7\2\2\u0555\u0556\7s\2"+
		"\2\u0556\u0558\5\\/\2\u0557\u054d\3\2\2\2\u0557\u054f\3\2\2\2\u0557\u0551"+
		"\3\2\2\2\u0557\u0553\3\2\2\2\u0557\u0555\3\2\2\2\u0558\u0099\3\2\2\2\u0559"+
		"\u055b\7w\2\2\u055a\u0559\3\2\2\2\u055a\u055b\3\2\2\2\u055b\u055c\3\2"+
		"\2\2\u055c\u055e\7\30\2\2\u055d\u055f\5\u009eP\2\u055e\u055d\3\2\2\2\u055e"+
		"\u055f\3\2\2\2\u055f\u0560\3\2\2\2\u0560\u0561\7\31\2\2\u0561\u009b\3"+
		"\2\2\2\u0562\u0564\7w\2\2\u0563\u0562\3\2\2\2\u0563\u0564\3\2\2\2\u0564"+
		"\u0565\3\2\2\2\u0565\u0567\7*\2\2\u0566\u0568\5\u009eP\2\u0567\u0566\3"+
		"\2\2\2\u0567\u0568\3\2\2\2\u0568\u0569\3\2\2\2\u0569\u056a\7(\2\2\u056a"+
		"\u009d\3\2\2\2\u056b\u0570\5\\/\2\u056c\u056d\7\23\2\2\u056d\u056f\5\\"+
		"/\2\u056e\u056c\3\2\2\2\u056f\u0572\3\2\2\2\u0570\u056e\3\2\2\2\u0570"+
		"\u0571\3\2\2\2\u0571\u009f\3\2\2\2\u0572\u0570\3\2\2\2\u0573\u0574\7\30"+
		"\2\2\u0574\u0575\5\\/\2\u0575\u0576\7\24\2\2\u0576\u0577\5\\/\2\u0577"+
		"\u0578\7\31\2\2\u0578\u00a1\3\2\2\2\u0579\u057a\bR\1\2\u057a\u0586\5\u00a4"+
		"S\2\u057b\u057c\7D\2\2\u057c\u057d\7*\2\2\u057d\u057e\5\u00a2R\2\u057e"+
		"\u057f\7(\2\2\u057f\u0586\3\2\2\2\u0580\u0581\7C\2\2\u0581\u0582\7*\2"+
		"\2\u0582\u0583\5\u00a2R\2\u0583\u0584\7(\2\2\u0584\u0586\3\2\2\2\u0585"+
		"\u0579\3\2\2\2\u0585\u057b\3\2\2\2\u0585\u0580\3\2\2\2\u0586\u0591\3\2"+
		"\2\2\u0587\u0588\f\7\2\2\u0588\u0590\7,\2\2\u0589\u058a\f\6\2\2\u058a"+
		"\u058b\7\30\2\2\u058b\u0590\7\31\2\2\u058c\u058d\f\5\2\2\u058d\u058e\7"+
		"\32\2\2\u058e\u0590\7\33\2\2\u058f\u0587\3\2\2\2\u058f\u0589\3\2\2\2\u058f"+
		"\u058c\3\2\2\2\u0590\u0593\3\2\2\2\u0591\u058f\3\2\2\2\u0591\u0592\3\2"+
		"\2\2\u0592\u00a3\3\2\2\2\u0593\u0591\3\2\2\2\u0594\u0597\5\u00a6T\2\u0595"+
		"\u0597\5\u00a8U\2\u0596\u0594\3\2\2\2\u0596\u0595\3\2\2\2\u0597\u00a5"+
		"\3\2\2\2\u0598\u05a7\7\64\2\2\u0599\u05a7\7\65\2\2\u059a\u05a7\7\66\2"+
		"\2\u059b\u05a7\7A\2\2\u059c\u05a7\7\67\2\2\u059d\u05a7\78\2\2\u059e\u05a7"+
		"\7?\2\2\u059f\u05a7\79\2\2\u05a0\u05a7\7;\2\2\u05a1\u05a7\7:\2\2\u05a2"+
		"\u05a7\7<\2\2\u05a3\u05a7\7>\2\2\u05a4\u05a7\7@\2\2\u05a5\u05a7\7B\2\2"+
		"\u05a6\u0598\3\2\2\2\u05a6\u0599\3\2\2\2\u05a6\u059a\3\2\2\2\u05a6\u059b"+
		"\3\2\2\2\u05a6\u059c\3\2\2\2\u05a6\u059d\3\2\2\2\u05a6\u059e\3\2\2\2\u05a6"+
		"\u059f\3\2\2\2\u05a6\u05a0\3\2\2\2\u05a6\u05a1\3\2\2\2\u05a6\u05a2\3\2"+
		"\2\2\u05a6\u05a3\3\2\2\2\u05a6\u05a4\3\2\2\2\u05a6\u05a5\3\2\2\2\u05a7"+
		"\u00a7\3\2\2\2\u05a8\u05a9\7\u00a3\2\2\u05a9\u00a9\3\2\2\2\u05aa\u05ac"+
		"\7w\2\2\u05ab\u05aa\3\2\2\2\u05ab\u05ac\3\2\2\2\u05ac\u05ad\3\2\2\2\u05ad"+
		"\u05ae\5\u00a8U\2\u05ae\u00ab\3\2\2\2\u05af\u05b0\7>\2\2\u05b0\u00ad\3"+
		"\2\2\2\u05b1\u05b5\5\16\b\2\u05b2\u05b5\5\36\20\2\u05b3\u05b5\5\20\t\2"+
		"\u05b4\u05b1\3\2\2\2\u05b4\u05b2\3\2\2\2\u05b4\u05b3\3\2\2\2\u05b5\u00af"+
		"\3\2\2\2\u05b6\u05bb\5\u00ba^\2\u05b7\u05b8\7\23\2\2\u05b8\u05ba\5\u00ba"+
		"^\2\u05b9\u05b7\3\2\2\2\u05ba\u05bd\3\2\2\2\u05bb\u05b9\3\2\2\2\u05bb"+
		"\u05bc\3\2\2\2\u05bc\u00b1\3\2\2\2\u05bd\u05bb\3\2\2\2\u05be\u05c1\5\u00b6"+
		"\\\2\u05bf\u05c1\5\u00ba^\2\u05c0\u05be\3\2\2\2\u05c0\u05bf\3\2\2\2\u05c1"+
		"\u00b3\3\2\2\2\u05c2\u05c6\5\u00b6\\\2\u05c3\u05c6\5\u00ba^\2\u05c4\u05c6"+
		"\5\u00bc_\2\u05c5\u05c2\3\2\2\2\u05c5\u05c3\3\2\2\2\u05c5\u05c4\3\2\2"+
		"\2\u05c6\u00b5\3\2\2\2\u05c7\u05c8\7\u00a4\2\2\u05c8\u00b7\3\2\2\2\u05c9"+
		"\u05ca\t\4\2\2\u05ca\u00b9\3\2\2\2\u05cb\u05cc\7\u00a3\2\2\u05cc\u00bb"+
		"\3\2\2\2\u05cd\u05ce\7\u00a2\2\2\u05ce\u00bd\3\2\2\2\u05cf\u05d4\5\u00c0"+
		"a\2\u05d0\u05d1\7\23\2\2\u05d1\u05d3\5\u00c0a\2\u05d2\u05d0\3\2\2\2\u05d3"+
		"\u05d6\3\2\2\2\u05d4\u05d2\3\2\2\2\u05d4\u05d5\3\2\2\2\u05d5\u00bf\3\2"+
		"\2\2\u05d6\u05d4\3\2\2\2\u05d7\u05dd\5\u00c6d\2\u05d8\u05da\7w\2\2\u05d9"+
		"\u05d8\3\2\2\2\u05d9\u05da\3\2\2\2\u05da\u05db\3\2\2\2\u05db\u05dd\5\u00c2"+
		"b\2\u05dc\u05d7\3\2\2\2\u05dc\u05d9\3\2\2\2\u05dd\u00c1\3\2\2\2\u05de"+
		"\u05e1\5\u00c4c\2\u05df\u05e1\5\60\31\2\u05e0\u05de\3\2\2\2\u05e0\u05df"+
		"\3\2\2\2\u05e1\u00c3\3\2\2\2\u05e2\u05e5\5\u00b6\\\2\u05e3\u05e4\7-\2"+
		"\2\u05e4\u05e6\5\u0102\u0082\2\u05e5\u05e3\3\2\2\2\u05e5\u05e6\3\2\2\2"+
		"\u05e6\u00c5\3\2\2\2\u05e7\u05e8\5\u00acW\2\u05e8\u05e9\5\u00b6\\\2\u05e9"+
		"\u00c7\3\2\2\2\u05ea\u05ed\5\u00a2R\2\u05eb\u05ed\5\u00caf\2\u05ec\u05ea"+
		"\3\2\2\2\u05ec\u05eb\3\2\2\2\u05ed\u00c9\3\2\2\2\u05ee\u05ef\bf\1\2\u05ef"+
		"\u05f0\7I\2\2\u05f0\u05f9\3\2\2\2\u05f1\u05f2\f\4\2\2\u05f2\u05f3\7\30"+
		"\2\2\u05f3\u05f8\7\31\2\2\u05f4\u05f5\f\3\2\2\u05f5\u05f6\7\32\2\2\u05f6"+
		"\u05f8\7\33\2\2\u05f7\u05f1\3\2\2\2\u05f7\u05f4\3\2\2\2\u05f8\u05fb\3"+
		"\2\2\2\u05f9\u05f7\3\2\2\2\u05f9\u05fa\3\2\2\2\u05fa\u00cb\3\2\2\2\u05fb"+
		"\u05f9\3\2\2\2\u05fc\u0602\5\u00ceh\2\u05fd\u05fe\5\u0080A\2\u05fe\u05ff"+
		"\5\u00ceh\2\u05ff\u0601\3\2\2\2\u0600\u05fd\3\2\2\2\u0601\u0604\3\2\2"+
		"\2\u0602\u0600\3\2\2\2\u0602\u0603\3\2\2\2\u0603\u00cd\3\2\2\2\u0604\u0602"+
		"\3\2\2\2\u0605\u060b\5\26\f\2\u0606\u060b\5\32\16\2\u0607\u060b\5(\25"+
		"\2\u0608\u060b\5&\24\2\u0609\u060b\5\24\13\2\u060a\u0605\3\2\2\2\u060a"+
		"\u0606\3\2\2\2\u060a\u0607\3\2\2\2\u060a\u0608\3\2\2\2\u060a\u0609\3\2"+
		"\2\2\u060b\u00cf\3\2\2\2\u060c\u0612\5\u00d2j\2\u060d\u060e\5\u0080A\2"+
		"\u060e\u060f\5\u00d2j\2\u060f\u0611\3\2\2\2\u0610\u060d\3\2\2\2\u0611"+
		"\u0614\3\2\2\2\u0612\u0610\3\2\2\2\u0612\u0613\3\2\2\2\u0613\u00d1\3\2"+
		"\2\2\u0614\u0612\3\2\2\2\u0615\u0619\5\34\17\2\u0616\u0619\5\30\r\2\u0617"+
		"\u0619\5*\26\2\u0618\u0615\3\2\2\2\u0618\u0616\3\2\2\2\u0618\u0617\3\2"+
		"\2\2\u0619\u00d3\3\2\2\2\u061a\u061b\7\13\2\2\u061b\u0625\5\u017e\u00c0"+
		"\2\u061c\u061d\7\f\2\2\u061d\u0625\5\u0198\u00cd\2\u061e\u061f\7\r\2\2"+
		"\u061f\u0625\5\u00d6l\2\u0620\u0621\7\16\2\2\u0621\u0625\5\u00d6l\2\u0622"+
		"\u0623\7\17\2\2\u0623\u0625\5\u00dan\2\u0624\u061a\3\2\2\2\u0624\u061c"+
		"\3\2\2\2\u0624\u061e\3\2\2\2\u0624\u0620\3\2\2\2\u0624\u0622\3\2\2\2\u0625"+
		"\u00d5\3\2\2\2\u0626\u0628\5\u00b4[\2\u0627\u0629\5\u00d8m\2\u0628\u0627"+
		"\3\2\2\2\u0628\u0629\3\2\2\2\u0629\u00d7\3\2\2\2\u062a\u062b\7l\2\2\u062b"+
		"\u062c\5\u0126\u0094\2\u062c\u062d\7\21\2\2\u062d\u0632\5\u00b4[\2\u062e"+
		"\u062f\7\25\2\2\u062f\u0631\5\u00b4[\2\u0630\u062e\3\2\2\2\u0631\u0634"+
		"\3\2\2\2\u0632\u0630\3\2\2\2\u0632\u0633\3\2\2\2\u0633\u00d9\3\2\2\2\u0634"+
		"\u0632\3\2\2\2\u0635\u0637\5\u00b4[\2\u0636\u0638\5\u00dco\2\u0637\u0636"+
		"\3\2\2\2\u0637\u0638\3\2\2\2\u0638\u00db\3\2\2\2\u0639\u063a\7l\2\2\u063a"+
		"\u063b\5\u0126\u0094\2\u063b\u063d\7\21\2\2\u063c\u063e\7%\2\2\u063d\u063c"+
		"\3\2\2\2\u063d\u063e\3\2\2\2\u063e\u063f\3\2\2\2\u063f\u0644\5\u014e\u00a8"+
		"\2\u0640\u0641\7%\2\2\u0641\u0643\5\u014e\u00a8\2\u0642\u0640\3\2\2\2"+
		"\u0643\u0646\3\2\2\2\u0644\u0642\3\2\2\2\u0644\u0645\3\2\2\2\u0645\u0649"+
		"\3\2\2\2\u0646\u0644\3\2\2\2\u0647\u0648\7\25\2\2\u0648\u064a\5\u014e"+
		"\u00a8\2\u0649\u0647\3\2\2\2\u0649\u064a\3\2\2\2\u064a\u00dd\3\2\2\2\u064b"+
		"\u0650\5\u00b6\\\2\u064c\u064d\7\23\2\2\u064d\u064f\5\u00b6\\\2\u064e"+
		"\u064c\3\2\2\2\u064f\u0652\3\2\2\2\u0650\u064e\3\2\2\2\u0650\u0651\3\2"+
		"\2\2\u0651\u00df\3\2\2\2\u0652\u0650\3\2\2\2\u0653\u0658\5\u00b8]\2\u0654"+
		"\u0655\7\23\2\2\u0655\u0657\5\u00b8]\2\u0656\u0654\3\2\2\2\u0657\u065a"+
		"\3\2\2\2\u0658\u0656\3\2\2\2\u0658\u0659\3\2\2\2\u0659\u00e1\3\2\2\2\u065a"+
		"\u0658\3\2\2\2\u065b\u0660\5&\24\2\u065c\u0660\5(\25\2\u065d\u0660\5*"+
		"\26\2\u065e\u0660\5,\27\2\u065f\u065b\3\2\2\2\u065f\u065c\3\2\2\2\u065f"+
		"\u065d\3\2\2\2\u065f\u065e\3\2\2\2\u0660\u00e3\3\2\2\2\u0661\u0662\7\n"+
		"\2\2\u0662\u00e5\3\2\2\2\u0663\u0669\5\u00e8u\2\u0664\u0665\5\u0080A\2"+
		"\u0665\u0666\5\u00e8u\2\u0666\u0668\3\2\2\2\u0667\u0664\3\2\2\2\u0668"+
		"\u066b\3\2\2\2\u0669\u0667\3\2\2\2\u0669\u066a\3\2\2\2\u066a\u00e7\3\2"+
		"\2\2\u066b\u0669\3\2\2\2\u066c\u066d\7\13\2\2\u066d\u0677\5\u0168\u00b5"+
		"\2\u066e\u066f\7\f\2\2\u066f\u0677\5\u0184\u00c3\2\u0670\u0671\7\r\2\2"+
		"\u0671\u0677\5\u00eav\2\u0672\u0673\7\16\2\2\u0673\u0677\5\u00eav\2\u0674"+
		"\u0675\7\17\2\2\u0675\u0677\5\u00ecw\2\u0676\u066c\3\2\2\2\u0676\u066e"+
		"\3\2\2\2\u0676\u0670\3\2\2\2\u0676\u0672\3\2\2\2\u0676\u0674\3\2\2\2\u0677"+
		"\u00e9\3\2\2\2\u0678\u067a\5\u0150\u00a9\2\u0679\u067b\7\22\2\2\u067a"+
		"\u0679\3\2\2\2\u067a\u067b\3\2\2\2\u067b\u067d\3\2\2\2\u067c\u067e\5\u00d8"+
		"m\2\u067d\u067c\3\2\2\2\u067d\u067e\3\2\2\2\u067e\u00eb\3\2\2\2\u067f"+
		"\u0681\5\u0136\u009c\2\u0680\u0682\7\22\2\2\u0681\u0680\3\2\2\2\u0681"+
		"\u0682\3\2\2\2\u0682\u0684\3\2\2\2\u0683\u0685\5\u00dco\2\u0684\u0683"+
		"\3\2\2\2\u0684\u0685\3\2\2\2\u0685\u00ed\3\2\2\2\u0686\u068c\5\62\32\2"+
		"\u0687\u0688\5\u0080A\2\u0688\u0689\5\62\32\2\u0689\u068b\3\2\2\2\u068a"+
		"\u0687\3\2\2\2\u068b\u068e\3\2\2\2\u068c\u068a\3\2\2\2\u068c\u068d\3\2"+
		"\2\2\u068d\u00ef\3\2\2\2\u068e\u068c\3\2\2\2\u068f\u0695\5.\30\2\u0690"+
		"\u0691\5\u0080A\2\u0691\u0692\5.\30\2\u0692\u0694\3\2\2\2\u0693\u0690"+
		"\3\2\2\2\u0694\u0697\3\2\2\2\u0695\u0693\3\2\2\2\u0695\u0696\3\2\2\2\u0696"+
		"\u00f1\3\2\2\2\u0697\u0695\3\2\2\2\u0698\u069e\5F$\2\u0699\u069a\5\u0080"+
		"A\2\u069a\u069b\5F$\2\u069b\u069d\3\2\2\2\u069c\u0699\3\2\2\2\u069d\u06a0"+
		"\3\2\2\2\u069e\u069c\3\2\2\2\u069e\u069f\3\2\2\2\u069f\u00f3\3\2\2\2\u06a0"+
		"\u069e\3\2\2\2\u06a1\u06a7\5V,\2\u06a2\u06a3\5\u0080A\2\u06a3\u06a4\5"+
		"V,\2\u06a4\u06a6\3\2\2\2\u06a5\u06a2\3\2\2\2\u06a6\u06a9\3\2\2\2\u06a7"+
		"\u06a5\3\2\2\2\u06a7\u06a8\3\2\2\2\u06a8\u00f5\3\2\2\2\u06a9\u06a7\3\2"+
		"\2\2\u06aa\u06ab\7\30\2\2\u06ab\u06ac\5\u00f8}\2\u06ac\u06ad\7\24\2\2"+
		"\u06ad\u06ae\5\u00f8}\2\u06ae\u06af\7\31\2\2\u06af\u06b9\3\2\2\2\u06b0"+
		"\u06b1\7\30\2\2\u06b1\u06b2\5\u00fa~\2\u06b2\u06b3\7\31\2\2\u06b3\u06b9"+
		"\3\2\2\2\u06b4\u06b5\7*\2\2\u06b5\u06b6\5\u00fa~\2\u06b6\u06b7\7(\2\2"+
		"\u06b7\u06b9\3\2\2\2\u06b8\u06aa\3\2\2\2\u06b8\u06b0\3\2\2\2\u06b8\u06b4"+
		"\3\2\2\2\u06b9\u00f7\3\2\2\2\u06ba\u06c9\7\u00a0\2\2\u06bb\u06c9\7\u00a1"+
		"\2\2\u06bc\u06c9\7\u00a9\2\2\u06bd\u06c9\7\u00aa\2\2\u06be\u06c9\7\u009f"+
		"\2\2\u06bf\u06c9\7\u00ae\2\2\u06c0\u06c9\7\u00ad\2\2\u06c1\u06c9\7\u00a7"+
		"\2\2\u06c2\u06c9\7\u00ab\2\2\u06c3\u06c9\7\u00ac\2\2\u06c4\u06c9\7\u009e"+
		"\2\2\u06c5\u06c9\7\u00af\2\2\u06c6\u06c9\7\u00a8\2\2\u06c7\u06c9\5\u0086"+
		"D\2\u06c8\u06ba\3\2\2\2\u06c8\u06bb\3\2\2\2\u06c8\u06bc\3\2\2\2\u06c8"+
		"\u06bd\3\2\2\2\u06c8\u06be\3\2\2\2\u06c8\u06bf\3\2\2\2\u06c8\u06c0\3\2"+
		"\2\2\u06c8\u06c1\3\2\2\2\u06c8\u06c2\3\2\2\2\u06c8\u06c3\3\2\2\2\u06c8"+
		"\u06c4\3\2\2\2\u06c8\u06c5\3\2\2\2\u06c8\u06c6\3\2\2\2\u06c8\u06c7\3\2"+
		"\2\2\u06c9\u00f9\3\2\2\2\u06ca\u06cf\5\u00f8}\2\u06cb\u06cc\7\23\2\2\u06cc"+
		"\u06ce\5\u00f8}\2\u06cd\u06cb\3\2\2\2\u06ce\u06d1\3\2\2\2\u06cf\u06cd"+
		"\3\2\2\2\u06cf\u06d0\3\2\2\2\u06d0\u00fb\3\2\2\2\u06d1\u06cf\3\2\2\2\u06d2"+
		"\u06d7\5\u0100\u0081\2\u06d3\u06d7\5\u0102\u0082\2\u06d4\u06d7\5\u00b4"+
		"[\2\u06d5\u06d7\5\u00fe\u0080\2\u06d6\u06d2\3\2\2\2\u06d6\u06d3\3\2\2"+
		"\2\u06d6\u06d4\3\2\2\2\u06d6\u06d5\3\2\2\2\u06d7\u00fd\3\2\2\2\u06d8\u06d9"+
		"\t\5\2\2\u06d9\u00ff\3\2\2\2\u06da\u06db\7\26\2\2\u06db\u06dc\5\\/\2\u06dc"+
		"\u06dd\7\27\2\2\u06dd\u0101\3\2\2\2\u06de\u06e1\5\u00f8}\2\u06df\u06e1"+
		"\5\u0104\u0083\2\u06e0\u06de\3\2\2\2\u06e0\u06df\3\2\2\2\u06e1\u0103\3"+
		"\2\2\2\u06e2\u06e8\5\u00a0Q\2\u06e3\u06e8\5\u009aN\2\u06e4\u06e8\5\u009c"+
		"O\2\u06e5\u06e8\5\u0108\u0085\2\u06e6\u06e8\5\u0106\u0084\2\u06e7\u06e2"+
		"\3\2\2\2\u06e7\u06e3\3\2\2\2\u06e7\u06e4\3\2\2\2\u06e7\u06e5\3\2\2\2\u06e7"+
		"\u06e6\3\2\2\2\u06e8\u0105\3\2\2\2\u06e9\u06eb\7w\2\2\u06ea\u06e9\3\2"+
		"\2\2\u06ea\u06eb\3\2\2\2\u06eb\u06ec\3\2\2\2\u06ec\u06ee\7\26\2\2\u06ed"+
		"\u06ef\5\u010a\u0086\2\u06ee\u06ed\3\2\2\2\u06ee\u06ef\3\2\2\2\u06ef\u06f0"+
		"\3\2\2\2\u06f0\u06f1\7\27\2\2\u06f1\u0107\3\2\2\2\u06f2\u06f4\7w\2\2\u06f3"+
		"\u06f2\3\2\2\2\u06f3\u06f4\3\2\2\2\u06f4\u06f5\3\2\2\2\u06f5\u06f7\7\32"+
		"\2\2\u06f6\u06f8\5\u010c\u0087\2\u06f7\u06f6\3\2\2\2\u06f7\u06f8\3\2\2"+
		"\2\u06f8\u06f9\3\2\2\2\u06f9\u06fa\7\33\2\2\u06fa\u0109\3\2\2\2\u06fb"+
		"\u06fc\5\\/\2\u06fc\u0705\7\23\2\2\u06fd\u0702\5\\/\2\u06fe\u06ff\7\23"+
		"\2\2\u06ff\u0701\5\\/\2\u0700\u06fe\3\2\2\2\u0701\u0704\3\2\2\2\u0702"+
		"\u0700\3\2\2\2\u0702\u0703\3\2\2\2\u0703\u0706\3\2\2\2\u0704\u0702\3\2"+
		"\2\2\u0705\u06fd\3\2\2\2\u0705\u0706\3\2\2\2\u0706\u010b\3\2\2\2\u0707"+
		"\u070c\5\u010e\u0088\2\u0708\u0709\7\23\2\2\u0709\u070b\5\u010e\u0088"+
		"\2\u070a\u0708\3\2\2\2\u070b\u070e\3\2\2\2\u070c\u070a\3\2\2\2\u070c\u070d"+
		"\3\2\2\2\u070d\u010d\3\2\2\2\u070e\u070c\3\2\2\2\u070f\u0710\5\\/\2\u0710"+
		"\u0711\7\21\2\2\u0711\u0712\5\\/\2\u0712\u010f\3\2\2\2\u0713\u0714\5\\"+
		"/\2\u0714\u0715\7\21\2\2\u0715\u0716\5\\/\2\u0716\u071d\3\2\2\2\u0717"+
		"\u0718\5\\/\2\u0718\u0719\7\21\2\2\u0719\u071d\3\2\2\2\u071a\u071b\7\21"+
		"\2\2\u071b\u071d\5\\/\2\u071c\u0713\3\2\2\2\u071c\u0717\3\2\2\2\u071c"+
		"\u071a\3\2\2\2\u071d\u0111\3\2\2\2\u071e\u071f\5\u00b6\\\2\u071f\u0720"+
		"\5\u012c\u0097\2\u0720\u0721\5\\/\2\u0721\u0113\3\2\2\2\u0722\u0723\b"+
		"\u008b\1\2\u0723\u0724\5\u00b6\\\2\u0724\u0729\3\2\2\2\u0725\u0726\f\3"+
		"\2\2\u0726\u0728\5z>\2\u0727\u0725\3\2\2\2\u0728\u072b\3\2\2\2\u0729\u0727"+
		"\3\2\2\2\u0729\u072a\3\2\2\2\u072a\u0115\3\2\2\2\u072b\u0729\3\2\2\2\u072c"+
		"\u072d\6\u008c/\3\u072d\u072e\7\u00a4\2\2\u072e\u0731\5\u00c8e\2\u072f"+
		"\u0731\5\\/\2\u0730\u072c\3\2\2\2\u0730\u072f\3\2\2\2\u0731\u0117\3\2"+
		"\2\2\u0732\u0733\7\u0086\2\2\u0733\u0734\7F\2\2\u0734\u0735\7l\2\2\u0735"+
		"\u0736\5\\/\2\u0736\u0119\3\2\2\2\u0737\u0738\7\u0086\2\2\u0738\u0739"+
		"\7~\2\2\u0739\u073a\7l\2\2\u073a\u073b\5\\/\2\u073b\u011b\3\2\2\2\u073c"+
		"\u0741\5\u011e\u0090\2\u073d\u073e\7\23\2\2\u073e\u0740\5\u011e\u0090"+
		"\2\u073f\u073d\3\2\2\2\u0740\u0743\3\2\2\2\u0741\u073f\3\2\2\2\u0741\u0742"+
		"\3\2\2\2\u0742\u011d\3\2\2\2\u0743\u0741\3\2\2\2\u0744\u0749\5\u00b6\\"+
		"\2\u0745\u0746\7\25\2\2\u0746\u0748\5\u00b6\\\2\u0747\u0745\3\2\2\2\u0748"+
		"\u074b\3\2\2\2\u0749\u0747\3\2\2\2\u0749\u074a\3\2\2\2\u074a\u074d\3\2"+
		"\2\2\u074b\u0749\3\2\2\2\u074c\u074e\t\6\2\2\u074d\u074c\3\2\2\2\u074d"+
		"\u074e\3\2\2\2\u074e\u011f\3\2\2\2\u074f\u0756\7\"\2\2\u0750\u0756\7#"+
		"\2\2\u0751\u0756\5\u012e\u0098\2\u0752\u0756\5\u0130\u0099\2\u0753\u0756"+
		"\5\u0132\u009a\2\u0754\u0756\5\u0134\u009b\2\u0755\u074f\3\2\2\2\u0755"+
		"\u0750\3\2\2\2\u0755\u0751\3\2\2\2\u0755\u0752\3\2\2\2\u0755\u0753\3\2"+
		"\2\2\u0755\u0754\3\2\2\2\u0756\u0121\3\2\2\2\u0757\u0758\7\u00a4\2\2\u0758"+
		"\u0759\6\u0092\60\3\u0759\u0123\3\2\2\2\u075a\u075b\7\u00a4\2\2\u075b"+
		"\u075c\6\u0093\61\3\u075c\u0125\3\2\2\2\u075d\u075e\7\u00a4\2\2\u075e"+
		"\u075f\6\u0094\62\3\u075f\u0127\3\2\2\2\u0760\u0761\7\u00a4\2\2\u0761"+
		"\u0762\6\u0095\63\3\u0762\u0129\3\2\2\2\u0763\u0764\7\u00a4\2\2\u0764"+
		"\u0765\6\u0096\64\3\u0765\u012b\3\2\2\2\u0766\u0767\7-\2\2\u0767\u012d"+
		"\3\2\2\2\u0768\u0769\7$\2\2\u0769\u012f\3\2\2\2\u076a\u076b\7%\2\2\u076b"+
		"\u0131\3\2\2\2\u076c\u076d\7&\2\2\u076d\u0133\3\2\2\2\u076e\u076f\t\7"+
		"\2\2\u076f\u0135\3\2\2\2\u0770\u0771\7\u0089\2\2\u0771\u0772\5\u0138\u009d"+
		"\2\u0772\u0773\7\22\2\2\u0773\u0778\3\2\2\2\u0774\u0775\5\u0138\u009d"+
		"\2\u0775\u0776\7\22\2\2\u0776\u0778\3\2\2\2\u0777\u0770\3\2\2\2\u0777"+
		"\u0774\3\2\2\2\u0778\u0137\3\2\2\2\u0779\u077a\b\u009d\1\2\u077a\u077b"+
		"\5\u013a\u009e\2\u077b\u0780\3\2\2\2\u077c\u077d\f\3\2\2\u077d\u077f\5"+
		"\u0140\u00a1\2\u077e\u077c\3\2\2\2\u077f\u0782\3\2\2\2\u0780\u077e\3\2"+
		"\2\2\u0780\u0781\3\2\2\2\u0781\u0139\3\2\2\2\u0782\u0780\3\2\2\2\u0783"+
		"\u078b\5\u013c\u009f\2\u0784\u078b\5\u013e\u00a0\2\u0785\u078b\5\u0148"+
		"\u00a5\2\u0786\u078b\5\u014a\u00a6\2\u0787\u078b\5\u014c\u00a7\2\u0788"+
		"\u078b\5\u0142\u00a2\2\u0789\u078b\5\u0146\u00a4\2\u078a\u0783\3\2\2\2"+
		"\u078a\u0784\3\2\2\2\u078a\u0785\3\2\2\2\u078a\u0786\3\2\2\2\u078a\u0787"+
		"\3\2\2\2\u078a\u0788\3\2\2\2\u078a\u0789\3\2\2\2\u078b\u013b\3\2\2\2\u078c"+
		"\u078d\5\u00fe\u0080\2\u078d\u013d\3\2\2\2\u078e\u078f\5\u0122\u0092\2"+
		"\u078f\u0790\5\u0142\u00a2\2\u0790\u013f\3\2\2\2\u0791\u0792\7\25\2\2"+
		"\u0792\u0797\5\u0142\u00a2\2\u0793\u0794\7\25\2\2\u0794\u0797\5\u014e"+
		"\u00a8\2\u0795\u0797\5\u0146\u00a4\2\u0796\u0791\3\2\2\2\u0796\u0793\3"+
		"\2\2\2\u0796\u0795\3\2\2\2\u0797\u0141\3\2\2\2\u0798\u0799\5\u014e\u00a8"+
		"\2\u0799\u079b\7\26\2\2\u079a\u079c\5\u0144\u00a3\2\u079b\u079a\3\2\2"+
		"\2\u079b\u079c\3\2\2\2\u079c\u079d\3\2\2\2\u079d\u079e\7\27\2\2\u079e"+
		"\u0143\3\2\2\2\u079f\u07a0\b\u00a3\1\2\u07a0\u07a1\5\u0138\u009d\2\u07a1"+
		"\u07a7\3\2\2\2\u07a2\u07a3\f\3\2\2\u07a3\u07a4\7\23\2\2\u07a4\u07a6\5"+
		"\u0138\u009d\2\u07a5\u07a2\3\2\2\2\u07a6\u07a9\3\2\2\2\u07a7\u07a5\3\2"+
		"\2\2\u07a7\u07a8\3\2\2\2\u07a8\u0145\3\2\2\2\u07a9\u07a7\3\2\2\2\u07aa"+
		"\u07ab\7\30\2\2\u07ab\u07ac\5\u0138\u009d\2\u07ac\u07ad\7\31\2\2\u07ad"+
		"\u0147\3\2\2\2\u07ae\u07af\7\26\2\2\u07af\u07b0\5\u0138\u009d\2\u07b0"+
		"\u07b1\7\27\2\2\u07b1\u0149\3\2\2\2\u07b2\u07b3\5\u014e\u00a8\2\u07b3"+
		"\u014b\3\2\2\2\u07b4\u07ba\7\u00a9\2\2\u07b5\u07ba\7\u00ab\2\2\u07b6\u07ba"+
		"\7\u00a7\2\2\u07b7\u07ba\7\u009e\2\2\u07b8\u07ba\7\u009f\2\2\u07b9\u07b4"+
		"\3\2\2\2\u07b9\u07b5\3\2\2\2\u07b9\u07b6\3\2\2\2\u07b9\u07b7\3\2\2\2\u07b9"+
		"\u07b8\3\2\2\2\u07ba\u014d\3\2\2\2\u07bb\u07bc\t\b\2\2\u07bc\u014f\3\2"+
		"\2\2\u07bd\u07be\7\u0089\2\2\u07be\u07c1\5\u0152\u00aa\2\u07bf\u07c1\5"+
		"\u0152\u00aa\2\u07c0\u07bd\3\2\2\2\u07c0\u07bf\3\2\2\2\u07c1\u0151\3\2"+
		"\2\2\u07c2\u07c3\b\u00aa\1\2\u07c3\u07c4\5\u0154\u00ab\2\u07c4\u07c9\3"+
		"\2\2\2\u07c5\u07c6\f\3\2\2\u07c6\u07c8\5\u0156\u00ac\2\u07c7\u07c5\3\2"+
		"\2\2\u07c8\u07cb\3\2\2\2\u07c9\u07c7\3\2\2\2\u07c9\u07ca\3\2\2\2\u07ca"+
		"\u0153\3\2\2\2\u07cb\u07c9\3\2\2\2\u07cc\u07d1\5\u0160\u00b1\2\u07cd\u07d1"+
		"\5\u0162\u00b2\2\u07ce\u07d1\5\u0164\u00b3\2\u07cf\u07d1\5\u0158\u00ad"+
		"\2\u07d0\u07cc\3\2\2\2\u07d0\u07cd\3\2\2\2\u07d0\u07ce\3\2\2\2\u07d0\u07cf"+
		"\3\2\2\2\u07d1\u0155\3\2\2\2\u07d2\u07d3\7\25\2\2\u07d3\u07d9\5\u0158"+
		"\u00ad\2\u07d4\u07d5\7\30\2\2\u07d5\u07d6\5\u0152\u00aa\2\u07d6\u07d7"+
		"\7\31\2\2\u07d7\u07d9\3\2\2\2\u07d8\u07d2\3\2\2\2\u07d8\u07d4\3\2\2\2"+
		"\u07d9\u0157\3\2\2\2\u07da\u07db\5\u0166\u00b4\2\u07db\u07dd\7\26\2\2"+
		"\u07dc\u07de\5\u015a\u00ae\2\u07dd\u07dc\3\2\2\2\u07dd\u07de\3\2\2\2\u07de"+
		"\u07df\3\2\2\2\u07df\u07e0\7\27\2\2\u07e0\u0159\3\2\2\2\u07e1\u07e8\5"+
		"\u015c\u00af\2\u07e2\u07e8\5\u015e\u00b0\2\u07e3\u07e4\5\u015c\u00af\2"+
		"\u07e4\u07e5\7\23\2\2\u07e5\u07e6\5\u015e\u00b0\2\u07e6\u07e8\3\2\2\2"+
		"\u07e7\u07e1\3\2\2\2\u07e7\u07e2\3\2\2\2\u07e7\u07e3\3\2\2\2\u07e8\u015b"+
		"\3\2\2\2\u07e9\u07ea\b\u00af\1\2\u07ea\u07eb\5\u0152\u00aa\2\u07eb\u07f1"+
		"\3\2\2\2\u07ec\u07ed\f\3\2\2\u07ed\u07ee\7\23\2\2\u07ee\u07f0\5\u0152"+
		"\u00aa\2\u07ef\u07ec\3\2\2\2\u07f0\u07f3\3\2\2\2\u07f1\u07ef\3\2\2\2\u07f1"+
		"\u07f2\3\2\2\2\u07f2\u015d\3\2\2\2\u07f3\u07f1\3\2\2\2\u07f4\u07f5\b\u00b0"+
		"\1\2\u07f5\u07f6\5\u0166\u00b4\2\u07f6\u07f7\7-\2\2\u07f7\u07f8\5\u0152"+
		"\u00aa\2\u07f8\u0801\3\2\2\2\u07f9\u07fa\f\3\2\2\u07fa\u07fb\7\23\2\2"+
		"\u07fb\u07fc\5\u0166\u00b4\2\u07fc\u07fd\7-\2\2\u07fd\u07fe\5\u0152\u00aa"+
		"\2\u07fe\u0800\3\2\2\2\u07ff\u07f9\3\2\2\2\u0800\u0803\3\2\2\2\u0801\u07ff"+
		"\3\2\2\2\u0801\u0802\3\2\2\2\u0802\u015f\3\2\2\2\u0803\u0801\3\2\2\2\u0804"+
		"\u0805\7\26\2\2\u0805\u0806\5\u0152\u00aa\2\u0806\u0807\7\27\2\2\u0807"+
		"\u0161\3\2\2\2\u0808\u0809\b\u00b2\1\2\u0809\u080c\7\u00a6\2\2\u080a\u080c"+
		"\5\u0166\u00b4\2\u080b\u0808\3\2\2\2\u080b\u080a\3\2\2\2\u080c\u0812\3"+
		"\2\2\2\u080d\u080e\f\3\2\2\u080e\u080f\7\25\2\2\u080f\u0811\5\u0166\u00b4"+
		"\2\u0810\u080d\3\2\2\2\u0811\u0814\3\2\2\2\u0812\u0810\3\2\2\2\u0812\u0813"+
		"\3\2\2\2\u0813\u0163\3\2\2\2\u0814\u0812\3\2\2\2\u0815\u081b\7\u00a9\2"+
		"\2\u0816\u081b\7\u00ab\2\2\u0817\u081b\7\u00a7\2\2\u0818\u081b\7\u009e"+
		"\2\2\u0819\u081b\7\u009f\2\2\u081a\u0815\3\2\2\2\u081a\u0816\3\2\2\2\u081a"+
		"\u0817\3\2\2\2\u081a\u0818\3\2\2\2\u081a\u0819\3\2\2\2\u081b\u0165\3\2"+
		"\2\2\u081c\u081d\t\t\2\2\u081d\u0167\3\2\2\2\u081e\u081f\7\u0089\2\2\u081f"+
		"\u0820\5\u016a\u00b6\2\u0820\u0821\7\22\2\2\u0821\u0826\3\2\2\2\u0822"+
		"\u0823\5\u016a\u00b6\2\u0823\u0824\7\22\2\2\u0824\u0826\3\2\2\2\u0825"+
		"\u081e\3\2\2\2\u0825\u0822\3\2\2\2\u0826\u0169\3\2\2\2\u0827\u0828\b\u00b6"+
		"\1\2\u0828\u0829\5\u016c\u00b7\2\u0829\u082e\3\2\2\2\u082a\u082b\f\3\2"+
		"\2\u082b\u082d\5\u0172\u00ba\2\u082c\u082a\3\2\2\2\u082d\u0830\3\2\2\2"+
		"\u082e\u082c\3\2\2\2\u082e\u082f\3\2\2\2\u082f\u016b\3\2\2\2\u0830\u082e"+
		"\3\2\2\2\u0831\u0837\5\u016e\u00b8\2\u0832\u0837\5\u0170\u00b9\2\u0833"+
		"\u0837\5\u017a\u00be\2\u0834\u0837\5\u017c\u00bf\2\u0835\u0837\5\u0180"+
		"\u00c1\2\u0836\u0831\3\2\2\2\u0836\u0832\3\2\2\2\u0836\u0833\3\2\2\2\u0836"+
		"\u0834\3\2\2\2\u0836\u0835\3\2\2\2\u0837\u016d\3\2\2\2\u0838\u0839\5\u00fe"+
		"\u0080\2\u0839\u016f\3\2\2\2\u083a\u083b\5\u0122\u0092\2\u083b\u083c\5"+
		"\u0174\u00bb\2\u083c\u0171\3\2\2\2\u083d\u083e\7\25\2\2\u083e\u0841\5"+
		"\u0174\u00bb\2\u083f\u0841\5\u0178\u00bd\2\u0840\u083d\3\2\2\2\u0840\u083f"+
		"\3\2\2\2\u0841\u0173\3\2\2\2\u0842\u0843\5\u0182\u00c2\2\u0843\u0845\7"+
		"\26\2\2\u0844\u0846\5\u0176\u00bc\2\u0845\u0844\3\2\2\2\u0845\u0846\3"+
		"\2\2\2\u0846\u0847\3\2\2\2\u0847\u0848\7\27\2\2\u0848\u0175\3\2\2\2\u0849"+
		"\u084a\b\u00bc\1\2\u084a\u084b\5\u016a\u00b6\2\u084b\u0851\3\2\2\2\u084c"+
		"\u084d\f\3\2\2\u084d\u084e\7\23\2\2\u084e\u0850\5\u016a\u00b6\2\u084f"+
		"\u084c\3\2\2\2\u0850\u0853\3\2\2\2\u0851\u084f\3\2\2\2\u0851\u0852\3\2"+
		"\2\2\u0852\u0177\3\2\2\2\u0853\u0851\3\2\2\2\u0854\u0855\7\30\2\2\u0855"+
		"\u0856\5\u016a\u00b6\2\u0856\u0857\7\31\2\2\u0857\u0179\3\2\2\2\u0858"+
		"\u0859\7\26\2\2\u0859\u085a\5\u016a\u00b6\2\u085a\u085b\7\27\2\2\u085b"+
		"\u017b\3\2\2\2\u085c\u085d\b\u00bf\1\2\u085d\u085e\5\u0182\u00c2\2\u085e"+
		"\u0864\3\2\2\2\u085f\u0860\f\3\2\2\u0860\u0861\7\25\2\2\u0861\u0863\5"+
		"\u0182\u00c2\2\u0862\u085f\3\2\2\2\u0863\u0866\3\2\2\2\u0864\u0862\3\2"+
		"\2\2\u0864\u0865\3\2\2\2\u0865\u017d\3\2\2\2\u0866\u0864\3\2\2\2\u0867"+
		"\u0868\b\u00c0\1\2\u0868\u0869\5\u017c\u00bf\2\u0869\u086e\3\2\2\2\u086a"+
		"\u086b\f\3\2\2\u086b\u086d\7\u00a6\2\2\u086c\u086a\3\2\2\2\u086d\u0870"+
		"\3\2\2\2\u086e\u086c\3\2\2\2\u086e\u086f\3\2\2\2\u086f\u017f\3\2\2\2\u0870"+
		"\u086e\3\2\2\2\u0871\u0877\7\u00a9\2\2\u0872\u0877\7\u00ab\2\2\u0873\u0877"+
		"\7\u00a7\2\2\u0874\u0877\7\u009e\2\2\u0875\u0877\7\u009f\2\2\u0876\u0871"+
		"\3\2\2\2\u0876\u0872\3\2\2\2\u0876\u0873\3\2\2\2\u0876\u0874\3\2\2\2\u0876"+
		"\u0875\3\2\2\2\u0877\u0181\3\2\2\2\u0878\u0879\t\n\2\2\u0879\u0183\3\2"+
		"\2\2\u087a\u087b\7\u0089\2\2\u087b\u087c\5\u0186\u00c4\2\u087c\u087d\7"+
		"\22\2\2\u087d\u0882\3\2\2\2\u087e\u087f\5\u0186\u00c4\2\u087f\u0880\7"+
		"\22\2\2\u0880\u0882\3\2\2\2\u0881\u087a\3\2\2\2\u0881\u087e\3\2\2\2\u0882"+
		"\u0185\3\2\2\2\u0883\u0884\b\u00c4\1\2\u0884\u0885\5\u0188\u00c5\2\u0885"+
		"\u088a\3\2\2\2\u0886\u0887\f\3\2\2\u0887\u0889\5\u018e\u00c8\2\u0888\u0886"+
		"\3\2\2\2\u0889\u088c\3\2\2\2\u088a\u0888\3\2\2\2\u088a\u088b\3\2\2\2\u088b"+
		"\u0187\3\2\2\2\u088c\u088a\3\2\2\2\u088d\u0893\5\u018a\u00c6\2\u088e\u0893"+
		"\5\u018c\u00c7\2\u088f\u0893\5\u0196\u00cc\2\u0890\u0893\5\u0198\u00cd"+
		"\2\u0891\u0893\5\u019a\u00ce\2\u0892\u088d\3\2\2\2\u0892\u088e\3\2\2\2"+
		"\u0892\u088f\3\2\2\2\u0892\u0890\3\2\2\2\u0892\u0891\3\2\2\2\u0893\u0189"+
		"\3\2\2\2\u0894\u0895\5\u00fe\u0080\2\u0895\u018b\3\2\2\2\u0896\u0897\5"+
		"\u0122\u0092\2\u0897\u0898\5\u0190\u00c9\2\u0898\u018d\3\2\2\2\u0899\u089a"+
		"\7\25\2\2\u089a\u089d\5\u0190\u00c9\2\u089b\u089d\5\u0194\u00cb\2\u089c"+
		"\u0899\3\2\2\2\u089c\u089b\3\2\2\2\u089d\u018f\3\2\2\2\u089e\u089f\5\u019c"+
		"\u00cf\2\u089f\u08a1\7\26\2\2\u08a0\u08a2\5\u0192\u00ca\2\u08a1\u08a0"+
		"\3\2\2\2\u08a1\u08a2\3\2\2\2\u08a2\u08a3\3\2\2\2\u08a3\u08a4\7\27\2\2"+
		"\u08a4\u0191\3\2\2\2\u08a5\u08a6\b\u00ca\1\2\u08a6\u08a7\5\u0186\u00c4"+
		"\2\u08a7\u08ad\3\2\2\2\u08a8\u08a9\f\3\2\2\u08a9\u08aa\7\23\2\2\u08aa"+
		"\u08ac\5\u0186\u00c4\2\u08ab\u08a8\3\2\2\2\u08ac\u08af\3\2\2\2\u08ad\u08ab"+
		"\3\2\2\2\u08ad\u08ae\3\2\2\2\u08ae\u0193\3\2\2\2\u08af\u08ad\3\2\2\2\u08b0"+
		"\u08b1\7\30\2\2\u08b1\u08b2\5\u0186\u00c4\2\u08b2\u08b3\7\31\2\2\u08b3"+
		"\u0195\3\2\2\2\u08b4\u08b5\7\26\2\2\u08b5\u08b6\5\u0186\u00c4\2\u08b6"+
		"\u08b7\7\27\2\2\u08b7\u0197\3\2\2\2\u08b8\u08b9\b\u00cd\1\2\u08b9\u08bc"+
		"\7\u00a6\2\2\u08ba\u08bc\5\u019c\u00cf\2\u08bb\u08b8\3\2\2\2\u08bb\u08ba"+
		"\3\2\2\2\u08bc\u08c2\3\2\2\2\u08bd\u08be\f\3\2\2\u08be\u08bf\7\25\2\2"+
		"\u08bf\u08c1\5\u019c\u00cf\2\u08c0\u08bd\3\2\2\2\u08c1\u08c4\3\2\2\2\u08c2"+
		"\u08c0\3\2\2\2\u08c2\u08c3\3\2\2\2\u08c3\u0199\3\2\2\2\u08c4\u08c2\3\2"+
		"\2\2\u08c5\u08cb\7\u00a9\2\2\u08c6\u08cb\7\u00ab\2\2\u08c7\u08cb\7\u00a7"+
		"\2\2\u08c8\u08cb\7\u009e\2\2\u08c9\u08cb\7\u009f\2\2\u08ca\u08c5\3\2\2"+
		"\2\u08ca\u08c6\3\2\2\2\u08ca\u08c7\3\2\2\2\u08ca\u08c8\3\2\2\2\u08ca\u08c9"+
		"\3\2\2\2\u08cb\u019b\3\2\2\2\u08cc\u08cd\t\13\2\2\u08cd\u019d\3\2\2\2"+
		"\u00bb\u01a4\u01a7\u01c0\u01c5\u01d3\u01d9\u01db\u01dd\u01e4\u01e9\u01f4"+
		"\u01fb\u0208\u0216\u022a\u0241\u024c\u0253\u025c\u0265\u026e\u0283\u028b"+
		"\u0290\u0296\u029b\u02a4\u02a9\u02ae\u02c6\u02d1\u02d5\u02ea\u0304\u0309"+
		"\u0312\u031b\u0324\u0341\u0354\u035a\u037c\u0385\u039c\u03aa\u03b3\u03bc"+
		"\u03d3\u03d9\u03ed\u0455\u0457\u0463\u046e\u047d\u0482\u0489\u0490\u0499"+
		"\u04a0\u04b5\u04c0\u04c4\u04c9\u04ce\u04d0\u04d4\u04dd\u04ed\u04f6\u04fc"+
		"\u0501\u0508\u0510\u051b\u0523\u052b\u0531\u0539\u0542\u054a\u0557\u055a"+
		"\u055e\u0563\u0567\u0570\u0585\u058f\u0591\u0596\u05a6\u05ab\u05b4\u05bb"+
		"\u05c0\u05c5\u05d4\u05d9\u05dc\u05e0\u05e5\u05ec\u05f7\u05f9\u0602\u060a"+
		"\u0612\u0618\u0624\u0628\u0632\u0637\u063d\u0644\u0649\u0650\u0658\u065f"+
		"\u0669\u0676\u067a\u067d\u0681\u0684\u068c\u0695\u069e\u06a7\u06b8\u06c8"+
		"\u06cf\u06d6\u06e0\u06e7\u06ea\u06ee\u06f3\u06f7\u0702\u0705\u070c\u071c"+
		"\u0729\u0730\u0741\u0749\u074d\u0755\u0777\u0780\u078a\u0796\u079b\u07a7"+
		"\u07b9\u07c0\u07c9\u07d0\u07d8\u07dd\u07e7\u07f1\u0801\u080b\u0812\u081a"+
		"\u0825\u082e\u0836\u0840\u0845\u0851\u0864\u086e\u0876\u0881\u088a\u0892"+
		"\u089c\u08a1\u08ad\u08bb\u08c2\u08ca";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}