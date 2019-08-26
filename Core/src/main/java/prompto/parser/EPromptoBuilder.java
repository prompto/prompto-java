package prompto.parser;

import static prompto.parser.EParser.INDENT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;

import prompto.constraint.IAttributeConstraint;
import prompto.constraint.MatchingCollectionConstraint;
import prompto.constraint.MatchingExpressionConstraint;
import prompto.constraint.MatchingPatternConstraint;
import prompto.csharp.CSharpBooleanLiteral;
import prompto.csharp.CSharpCharacterLiteral;
import prompto.csharp.CSharpDecimalLiteral;
import prompto.csharp.CSharpExpression;
import prompto.csharp.CSharpExpressionList;
import prompto.csharp.CSharpIdentifierExpression;
import prompto.csharp.CSharpIntegerLiteral;
import prompto.csharp.CSharpMethodExpression;
import prompto.csharp.CSharpNativeCall;
import prompto.csharp.CSharpNativeCategoryBinding;
import prompto.csharp.CSharpSelectorExpression;
import prompto.csharp.CSharpStatement;
import prompto.csharp.CSharpTextLiteral;
import prompto.csharp.CSharpThisExpression;
import prompto.css.CssCode;
import prompto.css.CssExpression;
import prompto.css.CssField;
import prompto.css.CssText;
import prompto.css.ICssValue;
import prompto.declaration.AbstractMethodDeclaration;
import prompto.declaration.AttributeDeclaration;
import prompto.declaration.CategoryDeclaration;
import prompto.declaration.ConcreteCategoryDeclaration;
import prompto.declaration.ConcreteMethodDeclaration;
import prompto.declaration.ConcreteWidgetDeclaration;
import prompto.declaration.DeclarationList;
import prompto.declaration.EnumeratedCategoryDeclaration;
import prompto.declaration.EnumeratedNativeDeclaration;
import prompto.declaration.GetterMethodDeclaration;
import prompto.declaration.IDeclaration;
import prompto.declaration.IMethodDeclaration;
import prompto.declaration.NativeCategoryDeclaration;
import prompto.declaration.NativeGetterMethodDeclaration;
import prompto.declaration.NativeMethodDeclaration;
import prompto.declaration.NativeResourceDeclaration;
import prompto.declaration.NativeSetterMethodDeclaration;
import prompto.declaration.NativeWidgetDeclaration;
import prompto.declaration.OperatorMethodDeclaration;
import prompto.declaration.SetterMethodDeclaration;
import prompto.declaration.SingletonCategoryDeclaration;
import prompto.declaration.TestMethodDeclaration;
import prompto.expression.AndExpression;
import prompto.expression.ArrowExpression;
import prompto.expression.BlobExpression;
import prompto.expression.CastExpression;
import prompto.expression.CategorySymbol;
import prompto.expression.CodeExpression;
import prompto.expression.CompareExpression;
import prompto.expression.ConstructorExpression;
import prompto.expression.ContainsExpression;
import prompto.expression.DivideExpression;
import prompto.expression.DocumentExpression;
import prompto.expression.EqualsExpression;
import prompto.expression.ExecuteExpression;
import prompto.expression.FetchManyExpression;
import prompto.expression.FetchOneExpression;
import prompto.expression.FilteredExpression;
import prompto.expression.IExpression;
import prompto.expression.InstanceExpression;
import prompto.expression.IntDivideExpression;
import prompto.expression.ItemSelector;
import prompto.expression.IteratorExpression;
import prompto.expression.MemberSelector;
import prompto.expression.MethodExpression;
import prompto.expression.MethodSelector;
import prompto.expression.MinusExpression;
import prompto.expression.ModuloExpression;
import prompto.expression.MultiplyExpression;
import prompto.expression.MutableExpression;
import prompto.expression.NativeSymbol;
import prompto.expression.NotExpression;
import prompto.expression.OrExpression;
import prompto.expression.ParenthesisExpression;
import prompto.expression.PlusExpression;
import prompto.expression.ReadAllExpression;
import prompto.expression.ReadOneExpression;
import prompto.expression.SelectorExpression;
import prompto.expression.SliceSelector;
import prompto.expression.SortedExpression;
import prompto.expression.SubtractExpression;
import prompto.expression.SymbolExpression;
import prompto.expression.TernaryExpression;
import prompto.expression.ThisExpression;
import prompto.expression.TypeExpression;
import prompto.expression.UnresolvedIdentifier;
import prompto.expression.UnresolvedSelector;
import prompto.grammar.Annotation;
import prompto.grammar.Argument;
import prompto.grammar.ArgumentList;
import prompto.grammar.ParameterList;
import prompto.grammar.CategorySymbolList;
import prompto.grammar.CmpOp;
import prompto.grammar.ContOp;
import prompto.grammar.EqOp;
import prompto.grammar.Identifier;
import prompto.grammar.MethodDeclarationList;
import prompto.grammar.NativeCategoryBinding;
import prompto.grammar.NativeCategoryBindingList;
import prompto.grammar.NativeSymbolList;
import prompto.grammar.Operator;
import prompto.grammar.OrderByClause;
import prompto.grammar.OrderByClauseList;
import prompto.instance.IAssignableInstance;
import prompto.instance.IAssignableSelector;
import prompto.instance.ItemInstance;
import prompto.instance.MemberInstance;
import prompto.instance.VariableInstance;
import prompto.java.JavaBooleanLiteral;
import prompto.java.JavaCharacterLiteral;
import prompto.java.JavaDecimalLiteral;
import prompto.java.JavaExpression;
import prompto.java.JavaExpressionList;
import prompto.java.JavaIdentifierExpression;
import prompto.java.JavaIntegerLiteral;
import prompto.java.JavaItemExpression;
import prompto.java.JavaMethodExpression;
import prompto.java.JavaNativeCall;
import prompto.java.JavaNativeCategoryBinding;
import prompto.java.JavaSelectorExpression;
import prompto.java.JavaStatement;
import prompto.java.JavaTextLiteral;
import prompto.java.JavaThisExpression;
import prompto.javascript.JavaScriptBooleanLiteral;
import prompto.javascript.JavaScriptCharacterLiteral;
import prompto.javascript.JavaScriptDecimalLiteral;
import prompto.javascript.JavaScriptExpression;
import prompto.javascript.JavaScriptExpressionList;
import prompto.javascript.JavaScriptIdentifierExpression;
import prompto.javascript.JavaScriptIntegerLiteral;
import prompto.javascript.JavaScriptMemberExpression;
import prompto.javascript.JavaScriptMethodExpression;
import prompto.javascript.JavaScriptModule;
import prompto.javascript.JavaScriptNativeCall;
import prompto.javascript.JavaScriptNativeCategoryBinding;
import prompto.javascript.JavaScriptNewExpression;
import prompto.javascript.JavaScriptSelectorExpression;
import prompto.javascript.JavaScriptStatement;
import prompto.javascript.JavaScriptTextLiteral;
import prompto.javascript.JavaScriptThisExpression;
import prompto.jsx.IJsxExpression;
import prompto.jsx.IJsxValue;
import prompto.jsx.JsxProperty;
import prompto.jsx.JsxClosing;
import prompto.jsx.JsxCode;
import prompto.jsx.JsxElement;
import prompto.jsx.JsxExpression;
import prompto.jsx.JsxLiteral;
import prompto.jsx.JsxSelfClosing;
import prompto.jsx.JsxText;
import prompto.literal.BooleanLiteral;
import prompto.literal.CharacterLiteral;
import prompto.literal.ContainerLiteral;
import prompto.literal.DateLiteral;
import prompto.literal.DateTimeLiteral;
import prompto.literal.DecimalLiteral;
import prompto.literal.DictEntry;
import prompto.literal.DictEntryList;
import prompto.literal.DictIdentifierKey;
import prompto.literal.DictKey;
import prompto.literal.DictLiteral;
import prompto.literal.DictTextKey;
import prompto.literal.DocEntryList;
import prompto.literal.DocumentLiteral;
import prompto.literal.HexaLiteral;
import prompto.literal.IntegerLiteral;
import prompto.literal.ListLiteral;
import prompto.literal.MaxIntegerLiteral;
import prompto.literal.MinIntegerLiteral;
import prompto.literal.NullLiteral;
import prompto.literal.PeriodLiteral;
import prompto.literal.RangeLiteral;
import prompto.literal.SetLiteral;
import prompto.literal.TextLiteral;
import prompto.literal.TimeLiteral;
import prompto.literal.TupleLiteral;
import prompto.literal.TypeLiteral;
import prompto.literal.UuidLiteral;
import prompto.literal.VersionLiteral;
import prompto.param.CategoryParameter;
import prompto.param.CodeParameter;
import prompto.param.ExtendedParameter;
import prompto.param.IParameter;
import prompto.param.UnresolvedParameter;
import prompto.parser.EParser.*;
import prompto.python.Python2NativeCall;
import prompto.python.Python2NativeCategoryBinding;
import prompto.python.Python3NativeCall;
import prompto.python.Python3NativeCategoryBinding;
import prompto.python.PythonArgumentList;
import prompto.python.PythonBooleanLiteral;
import prompto.python.PythonCharacterLiteral;
import prompto.python.PythonDecimalLiteral;
import prompto.python.PythonExpression;
import prompto.python.PythonIdentifierExpression;
import prompto.python.PythonIntegerLiteral;
import prompto.python.PythonMethodExpression;
import prompto.python.PythonModule;
import prompto.python.PythonNamedArgument;
import prompto.python.PythonNativeCategoryBinding;
import prompto.python.PythonOrdinalArgument;
import prompto.python.PythonSelectorExpression;
import prompto.python.PythonSelfExpression;
import prompto.python.PythonStatement;
import prompto.python.PythonTextLiteral;
import prompto.statement.AssignInstanceStatement;
import prompto.statement.AssignTupleStatement;
import prompto.statement.AssignVariableStatement;
import prompto.statement.AtomicSwitchCase;
import prompto.statement.BaseSwitchStatement.SwitchCaseList;
import prompto.statement.BreakStatement;
import prompto.statement.CollectionSwitchCase;
import prompto.statement.CommentStatement;
import prompto.statement.DeclarationStatement;
import prompto.statement.DoWhileStatement;
import prompto.statement.FetchManyStatement;
import prompto.statement.FetchOneStatement;
import prompto.statement.FlushStatement;
import prompto.statement.ForEachStatement;
import prompto.statement.IStatement;
import prompto.statement.IfStatement;
import prompto.statement.IfStatement.IfElement;
import prompto.statement.IfStatement.IfElementList;
import prompto.statement.MethodCall;
import prompto.statement.RaiseStatement;
import prompto.statement.RemoteCall;
import prompto.statement.ReturnStatement;
import prompto.statement.StatementList;
import prompto.statement.StoreStatement;
import prompto.statement.SwitchCase;
import prompto.statement.SwitchErrorStatement;
import prompto.statement.SwitchStatement;
import prompto.statement.UnresolvedCall;
import prompto.statement.WhileStatement;
import prompto.statement.WithResourceStatement;
import prompto.statement.WithSingletonStatement;
import prompto.statement.WriteStatement;
import prompto.type.AnyType;
import prompto.type.BlobType;
import prompto.type.BooleanType;
import prompto.type.CategoryType;
import prompto.type.CharacterType;
import prompto.type.CodeType;
import prompto.type.DateTimeType;
import prompto.type.DateType;
import prompto.type.DecimalType;
import prompto.type.DictType;
import prompto.type.DocumentType;
import prompto.type.HtmlType;
import prompto.type.IType;
import prompto.type.ImageType;
import prompto.type.IntegerType;
import prompto.type.IteratorType;
import prompto.type.ListType;
import prompto.type.NativeType;
import prompto.type.PeriodType;
import prompto.type.SetType;
import prompto.type.TextType;
import prompto.type.TimeType;
import prompto.type.UuidType;
import prompto.type.VersionType;
import prompto.utils.AssertionList;
import prompto.utils.ExpressionList;
import prompto.utils.IdentifierList;
import prompto.value.SetValue;

public class EPromptoBuilder extends EParserBaseListener {

	ParseTreeProperty<Object> nodeValues = new ParseTreeProperty<Object>();
	BufferedTokenStream input;
	String path = "";

	public EPromptoBuilder(ECleverParser parser) {
		this.input = (BufferedTokenStream)parser.getTokenStream();
		this.path = parser.getPath();
	}
	
	protected String getHiddenTokensBefore(Token token) {
		List<Token> hidden = input.getHiddenTokensToLeft(token.getTokenIndex());
		return getHiddenTokensText(hidden);
	}
	
	protected String getHiddenTokensAfter(Token token) {
		List<Token> hidden = input.getHiddenTokensToRight(token.getTokenIndex());
		return getHiddenTokensText(hidden);
	}
	
	
	private String getHiddenTokensText(List<Token> hidden) {
		if(hidden==null || hidden.isEmpty())
			return null;
		else
			return hidden.stream()
					.map(Token::getText)
					.collect(Collectors.joining());
	}

	private String getWhiteSpacePlus(ParserRuleContext ctx) {
		String within = ctx.children==null ? null : ctx.children.stream()
				.filter(child->isNotIndent(child))
				.map(child->child.getText())
				.collect(Collectors.joining());
		if(within==null)
			return null;
		String before = getHiddenTokensBefore(ctx.getStart());
		if(before!=null)
			within = before + within;
		String after = getHiddenTokensAfter(ctx.getStop());
		if(after!=null)
			within = within + after;
		return within; 
	}
	
	private static boolean isNotIndent(ParseTree tree) {
		return !(tree instanceof TerminalNode) || ((TerminalNode)tree).getSymbol().getType()!=INDENT;
	}
	
	public void buildSection(ParserRuleContext node, Section section) {
		Token first = findFirstValidToken(node.start.getTokenIndex());
		Token last = findLastValidToken(node.stop.getTokenIndex());
		section.setFrom(path, first, last, Dialect.E);
	}
	
	private List<Annotation> readAnnotations(List<? extends ParseTree> contexts) {
		List<Annotation> annotations = contexts.stream()
			.map(cx->(Annotation)getNodeValue(cx))
			.collect(Collectors.toList());
		return annotations.isEmpty() ?  null : annotations;
	}

	private List<CommentStatement> readComments(List<? extends ParseTree> contexts) {
		List<CommentStatement> comments = contexts.stream()
			.map(cx->(CommentStatement)getNodeValue(cx))
			.collect(Collectors.toList());
		return comments.isEmpty() ? null : comments;
	}

	@Override
	public void exitAbstract_method_declaration(Abstract_method_declarationContext ctx) {
		IType type = getNodeValue(ctx.typ);
		Identifier name = getNodeValue(ctx.name);
		ParameterList args = getNodeValue(ctx.args);
		setNodeValue(ctx, new AbstractMethodDeclaration(name, args, type));
	}
	
	@Override
	public void exitAddExpression(AddExpressionContext ctx) {
		IExpression left = getNodeValue(ctx.left);
		IExpression right = getNodeValue(ctx.right);
		IExpression exp = ctx.op.getType()==EParser.PLUS ? new PlusExpression(left, right) : new SubtractExpression(left, right);
		setNodeValue(ctx, exp);
	}

	@Override
	public void exitAndExpression(AndExpressionContext ctx) {
		IExpression left = getNodeValue(ctx.left);
		IExpression right = getNodeValue(ctx.right);
		setNodeValue(ctx, new AndExpression(left, right));
	}
	
	@Override
	public void exitAnnotation_constructor(Annotation_constructorContext ctx) {
		Identifier name = getNodeValue(ctx.name);
		DictEntryList args = new DictEntryList();
		IExpression exp = getNodeValue(ctx.exp);
		if(exp!=null)
			args.add(new DictEntry(null, exp));
		ctx.annotation_argument().forEach(argCtx->{
			DictEntry arg = getNodeValue(argCtx);
			args.add(arg);
		});
		setNodeValue(ctx, new Annotation(name, args));
	}

	@Override
	public void exitAnnotation_argument(Annotation_argumentContext ctx) {
		Identifier name = getNodeValue(ctx.name);
		IExpression exp = getNodeValue(ctx.exp);
		setNodeValue(ctx, new DictEntry(new DictIdentifierKey(name), exp));
	}
	
	@Override
	public void exitAnnotation_identifier(Annotation_identifierContext ctx) {
		setNodeValue(ctx, new Identifier(ctx.getText()));
	}
	
	@Override
	public void exitAnnotation_argument_name(Annotation_argument_nameContext ctx) {
		setNodeValue(ctx, new Identifier(ctx.getText()));
	}
	
	@Override
	public void exitAnnotationLiteralValue(AnnotationLiteralValueContext ctx) {
		IExpression exp = getNodeValue(ctx.exp);
		setNodeValue(ctx, exp);
	}
	
	@Override
	public void exitAnnotationTypeValue(AnnotationTypeValueContext ctx) {
		IType type = getNodeValue(ctx.typ);
		setNodeValue(ctx, new TypeExpression(type));
	}
	
	@Override
	public void exitAnyDictType(AnyDictTypeContext ctx) {
		IType type = getNodeValue(ctx.any_type());
		setNodeValue(ctx, new DictType(type));
	}

	@Override
	public void exitAnyListType(AnyListTypeContext ctx) {
		IType type = getNodeValue(ctx.any_type());
		setNodeValue(ctx, new ListType(type));
	}
	
	@Override
	public void exitAnyType(AnyTypeContext ctx) {
		setNodeValue(ctx, AnyType.instance());
	}
	
	@Override
	public void exitArgument_assignment(Argument_assignmentContext ctx) {
		Identifier name = getNodeValue(ctx.name);
		IExpression exp = getNodeValue(ctx.exp);
		IParameter arg = new UnresolvedParameter(name);
		Argument item = new Argument(arg, exp);
		setNodeValue(ctx, item);
	}

	@Override
	public void exitArgument_list(Argument_listContext ctx) {
		ParameterList items = new ParameterList();
		ctx.argument().forEach((a)->{
			IParameter item = getNodeValue(a); 
			items.add(item);
		});
		setNodeValue(ctx, items);
	}

	@Override
	public void exitArgumentAssignmentList(ArgumentAssignmentListContext ctx) {
		Argument item = getNodeValue(ctx.item);
		ArgumentList items = new ArgumentList(Collections.singletonList(item));
		setNodeValue(ctx, items);
	}
	
	@Override
	public void exitArgumentAssignmentListExpression(ArgumentAssignmentListExpressionContext ctx) {
		IExpression exp = getNodeValue(ctx.exp);
		ArgumentList items = getNodeValue(ctx.items);
		if(items==null)
			items = new ArgumentList();
		items.add(0, new Argument(null, exp));
		Argument item = getNodeValue(ctx.item);
		if(item!=null)
			items.add(item);
		else
			items.checkLastAnd();
		setNodeValue(ctx, items);
	}

	@Override
	public void exitArgumentAssignmentListItem(ArgumentAssignmentListItemContext ctx) {
		Argument item = getNodeValue(ctx.item);
		ArgumentList items = getNodeValue(ctx.items);
		items.add(item);
		setNodeValue(ctx, items);
	}

	@Override
	public void exitArgumentAssignmentListNoExpression(ArgumentAssignmentListNoExpressionContext ctx) {
		ArgumentList items = getNodeValue(ctx.items);
		Argument item = getNodeValue(ctx.item);
		if(item!=null)
			items.add(item);
		else
			items.checkLastAnd();
		setNodeValue(ctx, items);
	}
	

	@Override
	public void exitArrow_prefix(Arrow_prefixContext ctx) {
		IdentifierList args = getNodeValue(ctx.arrow_args());
		String argsSuite = getWhiteSpacePlus(ctx.s1);
		if(argsSuite==null) // happens when only WS
			argsSuite = getHiddenTokensBefore(ctx.EGT().getSymbol());
		String arrowSuite = getWhiteSpacePlus(ctx.s2);
		if(arrowSuite==null) // happens when only WS
			arrowSuite = getHiddenTokensAfter(ctx.EGT().getSymbol());
		setNodeValue(ctx, new ArrowExpression(args, argsSuite, arrowSuite));
	}
	
	@Override
	public void exitArrowExpression(ArrowExpressionContext ctx) {
		setNodeValue(ctx, getNodeValue(ctx.exp));
	}
	
	@Override
	public void exitArrowExpressionBody(ArrowExpressionBodyContext ctx) {
		ArrowExpression arrow = getNodeValue(ctx.arrow_prefix());
		IExpression exp = getNodeValue(ctx.expression());
		arrow.setExpression(exp);
		setNodeValue(ctx, arrow);
	}
	
	@Override
	public void exitArrowListArg(ArrowListArgContext ctx) {
		IdentifierList list = getNodeValue(ctx.variable_identifier_list());
		setNodeValue(ctx, list);
	}
	
	@Override
	public void exitArrowSingleArg(ArrowSingleArgContext ctx) {
		Identifier arg = getNodeValue(ctx.variable_identifier());
		setNodeValue(ctx, new IdentifierList(arg));
	}
	
	
	@Override
	public void exitArrowStatementsBody(ArrowStatementsBodyContext ctx) {
		ArrowExpression arrow = getNodeValue(ctx.arrow_prefix());
		StatementList stmts = getNodeValue(ctx.statement_list());
		arrow.setStatements(stmts);
		setNodeValue(ctx, arrow);
	}
	
	@Override
	public void exitAssertion(AssertionContext ctx) {
		IExpression exp = getNodeValue(ctx.exp);
		setNodeValue(ctx, new Assertion(exp));
	}
	
	@Override
	public void exitAssertion_list(Assertion_listContext ctx) {
		AssertionList items = new AssertionList();
		ctx.assertion().forEach((a)->{
			Assertion item = getNodeValue(a);
			items.add(item);
		});
		setNodeValue(ctx, items);
	}
	
	@Override
	public void exitAssign_instance_statement(Assign_instance_statementContext ctx) {
		IAssignableInstance inst = getNodeValue(ctx.inst);
		IExpression exp = getNodeValue(ctx.exp);
		setNodeValue(ctx, new AssignInstanceStatement(inst, exp));
	}
	
	@Override
	public void exitAssign_tuple_statement(Assign_tuple_statementContext ctx) {
		IdentifierList items = getNodeValue(ctx.items);
		IExpression exp = getNodeValue(ctx.exp);
		setNodeValue(ctx, new AssignTupleStatement(items, exp));
	}

	@Override
	public void exitAssign_variable_statement(Assign_variable_statementContext ctx) {
		Identifier name = getNodeValue(ctx.variable_identifier());
		IExpression exp = getNodeValue(ctx.expression());
		setNodeValue(ctx, new AssignVariableStatement(name, exp));
	}
	
	@Override
	public void exitAssignInstanceStatement(AssignInstanceStatementContext ctx) {
		IStatement stmt = getNodeValue(ctx.stmt);
		setNodeValue(ctx, stmt);
	}

	@Override
	public void exitAssignTupleStatement(AssignTupleStatementContext ctx) {
		IStatement stmt = getNodeValue(ctx.stmt);
		setNodeValue(ctx, stmt);
	}
	
	@Override
	public void exitAtomicSwitchCase(AtomicSwitchCaseContext ctx) {
		IExpression exp = getNodeValue(ctx.exp);
		StatementList stmts = getNodeValue(ctx.stmts);
		setNodeValue(ctx, new AtomicSwitchCase(exp, stmts));
	}

	@Override
	public void exitAttribute_declaration(Attribute_declarationContext ctx) {
		Identifier name = getNodeValue(ctx.name);
		IType type = getNodeValue(ctx.typ);
		IAttributeConstraint match = getNodeValue(ctx.match);
		IdentifierList indices = ctx.INDEX()!=null ? new IdentifierList() : null;
		if(ctx.indices!=null)
			indices.addAll(getNodeValue(ctx.indices));
		if(ctx.index!=null)
			indices.add(getNodeValue(ctx.index));
		AttributeDeclaration decl = new AttributeDeclaration(name, type, match, indices);
		decl.setStorable(ctx.STORABLE()!=null);
		setNodeValue(ctx, decl);
	}

	@Override
	public void exitAttribute_identifier(Attribute_identifierContext ctx) {
		setNodeValue(ctx, new Identifier(ctx.getText()));
	}
	
	@Override
	public void exitAttribute_identifier_list(Attribute_identifier_listContext ctx) {
		IdentifierList list = new IdentifierList();
		for(Attribute_identifierContext v : ctx.attribute_identifier()){
			Identifier item = getNodeValue(v);
			list.add(item);
		}
		setNodeValue(ctx, list);
	}
	
	@Override
	public void exitAttributeList(AttributeListContext ctx) {
		Identifier item = getNodeValue(ctx.item);
		setNodeValue(ctx, new IdentifierList(item));
	}

	@Override
	public void exitAttributeListItem(AttributeListItemContext ctx) {
		IdentifierList items = getNodeValue(ctx.items);
		Identifier item = getNodeValue(ctx.item);
		items.add(item);
		setNodeValue(ctx, items);
	}

	@Override
	public void exitBlobExpression(BlobExpressionContext ctx) {
		IExpression exp = getNodeValue(ctx.exp);
		setNodeValue(ctx, exp);
	}
	
	@Override
	public void exitBlob_expression(Blob_expressionContext ctx) {
		IExpression exp = getNodeValue(ctx.expression());
		setNodeValue(ctx, new BlobExpression(exp));
	}
	

	@Override
	public void exitBlobType(BlobTypeContext ctx) {
		setNodeValue(ctx, BlobType.instance());
	}
	
	@Override
	public void exitBooleanLiteral(BooleanLiteralContext ctx) {
		setNodeValue(ctx, new BooleanLiteral(ctx.getText()));
	}

	@Override
	public void exitBooleanType(BooleanTypeContext ctx) {
		setNodeValue(ctx, BooleanType.instance());
	}
	
	
	@Override
	public void exitBreakStatement(BreakStatementContext ctx) {
		setNodeValue(ctx, new BreakStatement());
	}
	
	@Override
	public void exitCastExpression(CastExpressionContext ctx) {
		IExpression exp = getNodeValue(ctx.left);
		IType type = getNodeValue(ctx.right);
		setNodeValue(ctx, new CastExpression(exp, type));
	}
	
	@Override
	public void exitCatchAtomicStatement(CatchAtomicStatementContext ctx) {
		Identifier name = getNodeValue(ctx.name);
		StatementList stmts = getNodeValue(ctx.stmts);
		setNodeValue(ctx, new AtomicSwitchCase(new SymbolExpression(name), stmts));
	}

	@Override
	public void exitCatchCollectionStatement(CatchCollectionStatementContext ctx) {
		IExpression exp = getNodeValue(ctx.exp);
		StatementList stmts = getNodeValue(ctx.stmts);
		setNodeValue(ctx, new CollectionSwitchCase(exp, stmts));
	}
	
	
	@Override
	public void exitCatch_statement_list(Catch_statement_listContext ctx) {
		SwitchCaseList items = new SwitchCaseList();
		ctx.catch_statement().forEach((s)->{
			SwitchCase item = getNodeValue(s);
			items.add(item);
		});
		setNodeValue(ctx, items);
	}
	
	@Override
	public void exitCategory_or_any_type(Category_or_any_typeContext ctx) {
		IType type = getNodeValue(ctx.getChild(0));
		setNodeValue(ctx, type);
	}
	
	@Override
	public void exitCategory_symbol(Category_symbolContext ctx) {
		Identifier name = getNodeValue(ctx.name);
		ArgumentList args = getNodeValue(ctx.args);
		Argument arg = getNodeValue(ctx.arg);
		if(arg!=null)
			args.add(arg);
		setNodeValue(ctx, new CategorySymbol(name, args));
	}
	
	@Override
	public void exitCategory_symbol_list(Category_symbol_listContext ctx) {
		CategorySymbolList items = new CategorySymbolList();
		ctx.category_symbol().forEach((s)->{
			CategorySymbol item = getNodeValue(s);
			items.add(item);
		});
		setNodeValue(ctx, items);
	}
	

	
	@Override
	public void exitCategory_type(Category_typeContext ctx) {
		Identifier name = new Identifier(ctx.getText());
		setNodeValue(ctx, new CategoryType(name));
	}


	@Override
	public void exitCategoryType(CategoryTypeContext ctx) {
		IType type = getNodeValue(ctx.c);
		setNodeValue(ctx, type);
	}

	@Override
	public void exitCharacterLiteral(CharacterLiteralContext ctx) {
		setNodeValue(ctx, new CharacterLiteral(ctx.getText()));
	}

	@Override
	public void exitCharacterType(CharacterTypeContext ctx) {
		setNodeValue(ctx, CharacterType.instance());
	}
	
	@Override
	public void exitChildInstance(ChildInstanceContext ctx) {
		IAssignableInstance parent = getNodeValue(ctx.assignable_instance());
		IAssignableSelector child = getNodeValue(ctx.child_instance());
		child.setParent(parent);
		setNodeValue(ctx, child);
	}

	@Override
	public void exitClosureExpression(ClosureExpressionContext ctx) {
		Identifier name = getNodeValue(ctx.name);
		setNodeValue(ctx, new MethodExpression(name));
	}

	@Override
	public void exitClosureStatement(ClosureStatementContext ctx) {
		ConcreteMethodDeclaration decl = getNodeValue(ctx.decl);
		setNodeValue(ctx, new DeclarationStatement<ConcreteMethodDeclaration>(decl));
	}

	@Override
	public void exitCode_argument(Code_argumentContext ctx) {
		Identifier name = getNodeValue(ctx.name);
		setNodeValue(ctx, new CodeParameter(name));
	}

	@Override
	public void exitCode_type(Code_typeContext ctx) {
		setNodeValue(ctx, CodeType.instance());
	}
	
	@Override
	public void exitCodeArgument(CodeArgumentContext ctx) {
		IParameter arg = getNodeValue(ctx.arg);
		setNodeValue(ctx, arg);
	}

	@Override
	public void exitCodeExpression(CodeExpressionContext ctx) {
		IExpression exp = getNodeValue(ctx.exp);
		setNodeValue(ctx, new CodeExpression(exp));
	}

	@Override
	public void exitCodeType(CodeTypeContext ctx) {
		setNodeValue(ctx, CodeType.instance());
	}
	

	@Override
	public void exitCollection_literal(Collection_literalContext ctx) {
		IExpression exp = getNodeValue(ctx.getChild(0));
		setNodeValue(ctx, exp);
	}
	
	@Override
	public void exitCollectionSwitchCase(CollectionSwitchCaseContext ctx) {
		IExpression exp = getNodeValue(ctx.exp);
		StatementList stmts = getNodeValue(ctx.stmts);
		setNodeValue(ctx, new CollectionSwitchCase(exp, stmts));
	}
	
	@Override
	public void exitCommentStatement(CommentStatementContext ctx) {
		setNodeValue(ctx, getNodeValue(ctx.comment_statement()));
	}
	
	@Override
	public void exitComment_statement(Comment_statementContext ctx) {
		setNodeValue(ctx, new CommentStatement(ctx.getText()));
	}

	@Override
	public void exitConcrete_category_declaration(Concrete_category_declarationContext ctx) {
		Identifier name = getNodeValue(ctx.name);
		IdentifierList attrs = getNodeValue(ctx.attrs);
		IdentifierList derived = getNodeValue(ctx.derived);
		MethodDeclarationList methods = getNodeValue(ctx.methods);
		ConcreteCategoryDeclaration decl = new ConcreteCategoryDeclaration(name, attrs, derived, methods);
		decl.setStorable(ctx.STORABLE()!=null);
		setNodeValue(ctx, decl);
	}

	@Override
	public void exitConcrete_method_declaration(Concrete_method_declarationContext ctx) {
		IType type = getNodeValue(ctx.typ);
		Identifier name = getNodeValue(ctx.name);
		ParameterList args = getNodeValue(ctx.args);
		StatementList stmts = getNodeValue(ctx.stmts);
		setNodeValue(ctx, new ConcreteMethodDeclaration(name, args, type, stmts));
	}
	
	@Override
	public void exitConcrete_widget_declaration(Concrete_widget_declarationContext ctx) {
		Identifier name = getNodeValue(ctx.name);
		Identifier derived = getNodeValue(ctx.derived);
		MethodDeclarationList methods = getNodeValue(ctx.methods);
		ConcreteWidgetDeclaration decl = new ConcreteWidgetDeclaration(name, derived, methods);
		setNodeValue(ctx, decl);
	}

	@Override
	public void exitConcreteCategoryDeclaration(ConcreteCategoryDeclarationContext ctx) {
		setNodeValue(ctx, getNodeValue(ctx.decl));
	}
	
	
	@Override
	public void exitConcreteWidgetDeclaration(ConcreteWidgetDeclarationContext ctx) {
		setNodeValue(ctx, getNodeValue(ctx.decl));
	}

	@Override
	public void exitConstructorExpression(ConstructorExpressionContext ctx) {
		IExpression exp = getNodeValue(ctx.exp);
		setNodeValue(ctx, exp);
	}

	@Override
	public void exitConstructorFrom(ConstructorFromContext ctx) {
		CategoryType type = getNodeValue(ctx.typ);
		IExpression copyFrom = getNodeValue(ctx.copyExp);
		ArgumentList args = getNodeValue(ctx.args);
		Argument arg = getNodeValue(ctx.arg);
		if(arg!=null) {
			if(args==null) {
				args = new ArgumentList();
			}
			args.add(arg);
		} else if(args!=null)
			args.checkLastAnd();
		setNodeValue(ctx, new ConstructorExpression(type, copyFrom, args, true));
	}

	@Override
	public void exitConstructorNoFrom(ConstructorNoFromContext ctx) {
		CategoryType type = getNodeValue(ctx.typ);
		ArgumentList args = getNodeValue(ctx.args);
		Argument arg = getNodeValue(ctx.arg);
		if(arg!=null) {
			if(args==null) {
				args = new ArgumentList();
			}
			args.add(arg);
		}
		else if(args!=null)
			args.checkLastAnd();
		setNodeValue(ctx, new ConstructorExpression(type, null, args, true));
	}

	@Override
	public void exitHasExpression(HasExpressionContext ctx) {
		IExpression left = getNodeValue(ctx.left);
		IExpression right = getNodeValue(ctx.right);
		setNodeValue(ctx, new ContainsExpression(left, ContOp.HAS, right));
	}

	@Override
	public void exitHasAllExpression(HasAllExpressionContext ctx) {
		IExpression left = getNodeValue(ctx.left);
		IExpression right = getNodeValue(ctx.right);
		setNodeValue(ctx, new ContainsExpression(left, ContOp.HAS_ALL, right));
	}
	
	@Override
	public void exitHasAnyExpression(HasAnyExpressionContext ctx) {
		IExpression left = getNodeValue(ctx.left);
		IExpression right = getNodeValue(ctx.right);
		setNodeValue(ctx, new ContainsExpression(left, ContOp.HAS_ANY, right));
	}
	
	@Override
	public void exitContainsExpression(ContainsExpressionContext ctx) {
		IExpression left = getNodeValue(ctx.left);
		IExpression right = getNodeValue(ctx.right);
		setNodeValue(ctx, new EqualsExpression(left, EqOp.CONTAINS, right));
	}
	
	@Override
	public void exitCsharp_identifier(Csharp_identifierContext ctx) {
		setNodeValue(ctx, ctx.getText());
	}
	
	@Override
	public void exitCsharp_method_expression(Csharp_method_expressionContext ctx) {
		String name = getNodeValue(ctx.name);
		CSharpExpressionList args = getNodeValue(ctx.args);
		setNodeValue(ctx, new CSharpMethodExpression(name, args));
	}
	
	@Override
	public void exitCsharp_primary_expression(Csharp_primary_expressionContext ctx) {
		CSharpExpression exp = getNodeValue(ctx.getChild(0));
		setNodeValue(ctx, exp);
	}
	
	@Override
	public void exitCsharp_this_expression(Csharp_this_expressionContext ctx) {
		setNodeValue(ctx, new CSharpThisExpression());
	}
	
	@Override
	public void exitCSharpArgumentList(CSharpArgumentListContext ctx) {
		CSharpExpression item = getNodeValue(ctx.item);
		setNodeValue(ctx, new CSharpExpressionList(item));
	}
	
	@Override
	public void exitCSharpArgumentListItem(CSharpArgumentListItemContext ctx) {
		CSharpExpression item = getNodeValue(ctx.item);
		CSharpExpressionList items = getNodeValue(ctx.items);
		items.add(item);
		setNodeValue(ctx, items);
	}
	
	@Override
	public void exitCSharpBooleanLiteral(CSharpBooleanLiteralContext ctx) {
		setNodeValue(ctx, new CSharpBooleanLiteral(ctx.getText()));
	}
	
	@Override
	public void exitCSharpCategoryBinding(CSharpCategoryBindingContext ctx) {
		CSharpIdentifierExpression map = getNodeValue(ctx.binding);
		setNodeValue(ctx, new CSharpNativeCategoryBinding(map));
	}
	
	@Override
	public void exitCSharpCharacterLiteral(CSharpCharacterLiteralContext ctx) {
		setNodeValue(ctx, new CSharpCharacterLiteral(ctx.getText()));
	}
	
	@Override
	public void exitCSharpChildIdentifier(CSharpChildIdentifierContext ctx) {
		CSharpIdentifierExpression parent = getNodeValue(ctx.parent);
		String name = getNodeValue(ctx.name);
		CSharpIdentifierExpression child = new CSharpIdentifierExpression(parent, name);
		setNodeValue(ctx, child);
	}
	
	@Override
	public void exitCSharpDecimalLiteral(CSharpDecimalLiteralContext ctx) {
		setNodeValue(ctx, new CSharpDecimalLiteral(ctx.getText()));
	}
	
	@Override
	public void exitCSharpIdentifier(CSharpIdentifierContext ctx) {
		String name = getNodeValue(ctx.name);
		setNodeValue(ctx, new CSharpIdentifierExpression(name));
	}
	
	
	@Override
	public void exitCSharpIntegerLiteral(CSharpIntegerLiteralContext ctx) {
		setNodeValue(ctx, new CSharpIntegerLiteral(ctx.getText()));
	}
	
	@Override
	public void exitCSharpMethodExpression(CSharpMethodExpressionContext ctx) {
		CSharpExpression exp = getNodeValue(ctx.exp);
		setNodeValue(ctx, exp);
	}
	
	@Override
	public void exitCSharpNativeStatement(CSharpNativeStatementContext ctx) {
		CSharpStatement stmt = getNodeValue(ctx.csharp_statement());
		setNodeValue(ctx, new CSharpNativeCall(stmt));
	}
	
	@Override
	public void exitCSharpPromptoIdentifier(CSharpPromptoIdentifierContext ctx) {
		String name = ctx.DOLLAR_IDENTIFIER().getText();
		setNodeValue(ctx, new CSharpIdentifierExpression(name));
	};
	
	@Override
	public void exitCSharpPrimaryExpression(CSharpPrimaryExpressionContext ctx) {
		CSharpExpression exp = getNodeValue(ctx.exp);
		setNodeValue(ctx, exp);
	}
	

	@Override
	public void exitCSharpReturnStatement(CSharpReturnStatementContext ctx) {
		CSharpExpression exp = getNodeValue(ctx.exp);
		setNodeValue(ctx, new CSharpStatement(exp,true));
	}
	
	@Override
	public void exitCSharpSelectorExpression(CSharpSelectorExpressionContext ctx) {
		CSharpExpression parent = getNodeValue(ctx.parent);
		CSharpSelectorExpression child = getNodeValue(ctx.child);
		child.setParent(parent);
		setNodeValue(ctx, child);
	}
	
	@Override
	public void exitCSharpStatement(CSharpStatementContext ctx) {
		CSharpExpression exp = getNodeValue(ctx.exp);
		setNodeValue(ctx, new CSharpStatement(exp,false));
	}
	
	@Override
	public void exitCSharpTextLiteral(CSharpTextLiteralContext ctx) {
		setNodeValue(ctx, new CSharpTextLiteral(ctx.getText()));
	}
	
	@Override
	public void exitCssExpression(CssExpressionContext ctx) {
		setNodeValue(ctx, (CssExpression)getNodeValue(ctx.exp));
	}
	
	@Override
	public void exitCss_expression(Css_expressionContext ctx) {
		CssExpression exp = new CssExpression();
		ctx.css_field().forEach(cx->{
			CssField field = getNodeValue(cx);
			exp.addField(field);
		});
		setNodeValue(ctx, exp);
	}
	
	@Override
	public void exitCss_field(Css_fieldContext ctx) {
		String name = ctx.name.getText();
		ICssValue value = getNodeValue(ctx.value);
		setNodeValue(ctx, new CssField(name, value));
	}
	
	@Override
	public void exitCssText(CssTextContext ctx) {
		String text = ctx.text.getText();
		setNodeValue(ctx, new CssText(text));
	}
	
	@Override
	public void exitCssValue(CssValueContext ctx) {
		IExpression exp = getNodeValue(ctx.exp);
		setNodeValue(ctx, new CssCode(exp));
	}

	@Override
	public void exitDateLiteral(DateLiteralContext ctx) {
		setNodeValue(ctx, new DateLiteral(ctx.getText()));
	}
	
	@Override
	public void exitDateTimeLiteral(DateTimeLiteralContext ctx) {
		setNodeValue(ctx, new DateTimeLiteral(ctx.getText()));
	}
	
	@Override
	public void exitDateTimeType(DateTimeTypeContext ctx) {
		setNodeValue(ctx, DateTimeType.instance());
	}
	
	@Override
	public void exitDateType(DateTypeContext ctx) {
		setNodeValue(ctx, DateType.instance());
	}

	@Override
	public void exitDecimalLiteral(DecimalLiteralContext ctx) {
		setNodeValue(ctx, new DecimalLiteral(ctx.getText()));
	}
	
	@Override
	public void exitDecimalType(DecimalTypeContext ctx) {
		setNodeValue(ctx, DecimalType.instance());
	}
	
	@Override
	public void exitDeclaration(DeclarationContext ctx) {
		List<CommentStatement> comments = readComments(ctx.comment_statement());
		List<Annotation> annotations = readAnnotations(ctx.annotation_constructor());
		ParseTree ctx_ = ctx.getChild(ctx.getChildCount()-1);
		IDeclaration decl = getNodeValue(ctx_);
		if(decl!=null) {
			decl.setComments(comments);
			decl.setAnnotations(annotations);
			setNodeValue(ctx, decl);
		}
	}
	

	@Override
	public void exitDeclarations(DeclarationsContext ctx) {
		DeclarationList items = new DeclarationList();
		ctx.declaration().forEach((d)->{
			IDeclaration item = getNodeValue(d);
			items.add(item);
		});
		setNodeValue(ctx, items);
	}
	
	
	@Override
	public void exitDerivedList(DerivedListContext ctx) {
		IdentifierList items = getNodeValue(ctx.items);
		setNodeValue(ctx, items);
	}
	
	
	@Override
	public void exitDerivedListItem(DerivedListItemContext ctx) {
		IdentifierList items = getNodeValue(ctx.items);
		Identifier item = getNodeValue(ctx.item);
		items.add(item);
		setNodeValue(ctx, items);
	}
	
	
	@Override
	public void exitDict_entry(Dict_entryContext ctx) {
		DictKey key = getNodeValue(ctx.key);
		IExpression value = getNodeValue(ctx.value);
		DictEntry entry = new DictEntry(key, value);
		setNodeValue(ctx, entry);
	}
	
	@Override
	public void exitDict_literal(Dict_literalContext ctx) {
		boolean mutable = ctx.MUTABLE()!=null;
		DictEntryList items = getNodeValue(ctx.dict_entry_list());
		IExpression value = items==null ? new DictLiteral(mutable) : new DictLiteral(items, mutable);
		setNodeValue(ctx, value);
	}
	
	
	@Override
	public void exitDict_entry_list(Dict_entry_listContext ctx) {
		DictEntryList items = new DictEntryList();
		ctx.dict_entry().forEach((e)->{
			DictEntry item = getNodeValue(e);
			items.add(item);
		});
		setNodeValue(ctx, items);
	}
	
	@Override
	public void exitDictKeyIdentifier(DictKeyIdentifierContext ctx) {
		String text = ctx.name.getText();
		setNodeValue(ctx, new DictIdentifierKey(new Identifier(text)));
	}
	
	@Override
	public void exitDictKeyText(DictKeyTextContext ctx) {
		String text = ctx.name.getText();
		setNodeValue(ctx, new DictTextKey(text));
	}

	
	@Override
	public void exitDictType(DictTypeContext ctx) {
		IType type = getNodeValue(ctx.d);
		setNodeValue(ctx, new DictType(type));
	}
	

	@Override
	public void exitDivideExpression(DivideExpressionContext ctx) {
		IExpression left = getNodeValue(ctx.left);
		IExpression right = getNodeValue(ctx.right);
		setNodeValue(ctx, new DivideExpression(left, right));
	}
	
	@Override
	public void exitDo_while_statement(Do_while_statementContext ctx) {
		IExpression exp = getNodeValue(ctx.exp);
		StatementList stmts = getNodeValue(ctx.stmts);
		setNodeValue(ctx, new DoWhileStatement(exp, stmts));
	}
	
	@Override
	public void exitDocument_expression(Document_expressionContext ctx) {
		IExpression exp = getNodeValue(ctx.expression());
		setNodeValue(ctx, new DocumentExpression(exp));
	}
	
	@Override
	public void exitDocumentType(DocumentTypeContext ctx) {
		setNodeValue(ctx, DocumentType.instance());
	}
	
	@Override
	public void exitDocumentExpression(DocumentExpressionContext ctx) {
		IExpression exp = getNodeValue(ctx.exp);
		setNodeValue(ctx, exp);
	}
	
	@Override
	public void exitDocument_literal(Document_literalContext ctx) {
		DictEntryList entries = getNodeValue(ctx.dict_entry_list());
		DocEntryList items = entries!=null ? new DocEntryList(entries) : new DocEntryList();
		setNodeValue(ctx, new DocumentLiteral(items));
	}
	
	@Override
	public void exitDoWhileStatement(DoWhileStatementContext ctx) {
		IStatement stmt = getNodeValue(ctx.stmt);
		setNodeValue(ctx, stmt);
	}
	
	@Override
	public void exitElseIfStatementList(ElseIfStatementListContext ctx) {
		IExpression exp = getNodeValue(ctx.exp);
		StatementList stmts = getNodeValue(ctx.stmts);
		IfElement elem = new IfElement(exp, stmts);
		setNodeValue(ctx, new IfElementList(elem));
	}
	
	@Override
	public void exitElseIfStatementListItem(ElseIfStatementListItemContext ctx) {
		IfElementList items = getNodeValue(ctx.items);
		IExpression exp = getNodeValue(ctx.exp);
		StatementList stmts = getNodeValue(ctx.stmts);
		IfElement elem = new IfElement(exp, stmts);
		items.add(elem);
		setNodeValue(ctx, items);
	}
	
	@Override
	public void exitEnum_category_declaration(Enum_category_declarationContext ctx) {
		Identifier name = getNodeValue(ctx.name);
		IdentifierList attrs = getNodeValue(ctx.attrs);
		Identifier parent = getNodeValue(ctx.derived);
		IdentifierList derived = parent==null ? null : new IdentifierList(parent);
		CategorySymbolList symbols = getNodeValue(ctx.symbols);
		setNodeValue(ctx, new EnumeratedCategoryDeclaration(name, attrs, derived, symbols));
	}
	
	@Override
	public void exitEnum_native_declaration(Enum_native_declarationContext ctx) {
		Identifier name = getNodeValue(ctx.name);
		NativeType type = getNodeValue(ctx.typ);
		NativeSymbolList symbols = getNodeValue(ctx.symbols);
		setNodeValue(ctx, new EnumeratedNativeDeclaration(name, type, symbols));
	}
	
	@Override
	public void exitEnum_declaration(Enum_declarationContext ctx) {
		IDeclaration decl = getNodeValue(ctx.getChild(0));
		setNodeValue(ctx, decl);
	}
	
	@Override
	public void exitEqualsExpression(EqualsExpressionContext ctx) {
		IExpression left = getNodeValue(ctx.left);
		IExpression right = getNodeValue(ctx.right);
		setNodeValue(ctx, new EqualsExpression(left, EqOp.EQUALS, right));
	}

	
	@Override
	public void exitExecuteExpression(ExecuteExpressionContext ctx) {
		Identifier name = getNodeValue(ctx.name);
		setNodeValue(ctx, new ExecuteExpression(name));
	}
	
	
	@Override
	public void exitFetchExpression(FetchExpressionContext ctx) {
		setNodeValue(ctx, getNodeValue(ctx.exp));
	};
	
	@Override
	public void exitFetchStatement(FetchStatementContext ctx) {
		setNodeValue(ctx, getNodeValue(ctx.stmt));
	};
	

	@Override
	public void exitFetchOne(FetchOneContext ctx) {
		CategoryType category = getNodeValue(ctx.typ);
		IExpression filter = getNodeValue(ctx.predicate);
		setNodeValue(ctx, new FetchOneExpression(category, filter));
	}
	
	
	@Override
	public void exitFetchOneAsync(FetchOneAsyncContext ctx) {
		CategoryType category = getNodeValue(ctx.typ);
		IExpression filter = getNodeValue(ctx.predicate);
		Identifier name = getNodeValue(ctx.name);
		StatementList stmts = 	getNodeValue(ctx.stmts);
		setNodeValue(ctx, new FetchOneStatement(category, filter, name, stmts));
	}

	@Override
	public void exitFetchMany(FetchManyContext ctx) {
		CategoryType category = getNodeValue(ctx.typ);
		IExpression start = getNodeValue(ctx.xstart);
		IExpression stop = getNodeValue(ctx.xstop);
		IExpression predicate = getNodeValue(ctx.predicate);
		OrderByClauseList orderBy = getNodeValue(ctx.orderby);
		setNodeValue(ctx, new FetchManyExpression(category, start, stop, predicate, orderBy));
	}

	
	@Override
	public void exitFetchManyAsync(FetchManyAsyncContext ctx) {
		CategoryType category = getNodeValue(ctx.typ);
		IExpression start = getNodeValue(ctx.xstart);
		IExpression stop = getNodeValue(ctx.xstop);
		IExpression predicate = getNodeValue(ctx.predicate);
		OrderByClauseList orderBy = getNodeValue(ctx.orderby);
		Identifier name = getNodeValue(ctx.name);
		StatementList stmts = getNodeValue(ctx.stmts);
		setNodeValue(ctx, new FetchManyStatement(category, start, stop, predicate, orderBy, name, stmts));
	}

	
	@Override
	public void exitFilteredListExpression(FilteredListExpressionContext ctx) {
		FilteredExpression fetch = getNodeValue(ctx.filtered_list_suffix());
		IExpression source = getNodeValue(ctx.src);
		fetch.setSource(source);
		setNodeValue(ctx, fetch);
	}
	
	@Override
	public void exitFiltered_list_suffix(Filtered_list_suffixContext ctx) {
		Identifier itemName = getNodeValue(ctx.variable_identifier());
		IExpression predicate = getNodeValue(ctx.predicate);
		setNodeValue(ctx, new FilteredExpression(itemName, null, predicate));
	}
	
	
	
	
	@Override
	public void exitFlush_statement(Flush_statementContext ctx) {
		setNodeValue(ctx, new FlushStatement());
	}
	
	
	@Override
	public void exitFlushStatement(FlushStatementContext ctx) {
		setNodeValue(ctx, getNodeValue(ctx.stmt));
	}
	
	
	@Override
	public void exitFor_each_statement(For_each_statementContext ctx) {
		Identifier name1 = getNodeValue(ctx.name1);
		Identifier name2 = getNodeValue(ctx.name2);
		IExpression source = getNodeValue(ctx.source);
		StatementList stmts = getNodeValue(ctx.stmts);
		setNodeValue(ctx, new ForEachStatement(name1, name2, source, stmts));
	}
	
	@Override
	public void exitForEachStatement(ForEachStatementContext ctx) {
		IStatement stmt = getNodeValue(ctx.stmt);
		setNodeValue(ctx, stmt);
	}
	
	@Override
	public void exitFull_argument_list(Full_argument_listContext ctx) {
		ParameterList items = getNodeValue(ctx.items); 
		IParameter item = getNodeValue(ctx.item); 
		if(item!=null)
			items.add(item);
		setNodeValue(ctx, items);
	}

	@Override
	public void exitFullDeclarationList(FullDeclarationListContext ctx) {
		DeclarationList items = getNodeValue(ctx.declarations());
		if(items==null)
			items = new DeclarationList();
		setNodeValue(ctx, items);
	}
	
	@Override
	public void exitGetter_method_declaration(Getter_method_declarationContext ctx) {
		Identifier name = getNodeValue(ctx.name);
		StatementList stmts = getNodeValue(ctx.stmts);
		setNodeValue(ctx, new GetterMethodDeclaration(name, stmts));
	}
	
	@Override
	public void exitGreaterThanExpression(GreaterThanExpressionContext ctx) {
		IExpression left = getNodeValue(ctx.left);
		IExpression right = getNodeValue(ctx.right);
		setNodeValue(ctx, new CompareExpression(left, CmpOp.GT, right));
	}
	
	@Override
	public void exitGreaterThanOrEqualExpression(GreaterThanOrEqualExpressionContext ctx) {
		IExpression left = getNodeValue(ctx.left);
		IExpression right = getNodeValue(ctx.right);
		setNodeValue(ctx, new CompareExpression(left, CmpOp.GTE, right));
	}

	@Override
	public void exitHexadecimalLiteral(HexadecimalLiteralContext ctx) {
		setNodeValue(ctx, new HexaLiteral(ctx.getText()));
	}
	
	
	@Override
	public void exitHtmlType(HtmlTypeContext ctx) {
		setNodeValue(ctx, HtmlType.instance());
	}
	
	@Override
	public void exitIdentifierExpression(IdentifierExpressionContext ctx) {
		Identifier name = getNodeValue(ctx.exp);
		setNodeValue(ctx, new UnresolvedIdentifier(name));
	}
	
	@Override
	public void exitIf_statement(If_statementContext ctx) {
		IExpression exp = getNodeValue(ctx.exp);
		StatementList stmts = getNodeValue(ctx.stmts);
		IfElementList elseIfs = getNodeValue(ctx.elseIfs);
		StatementList elseStmts = getNodeValue(ctx.elseStmts);
		setNodeValue(ctx, new IfStatement(exp, stmts, elseIfs, elseStmts));
	}
	
	@Override
	public void exitIfStatement(IfStatementContext ctx) {
		IStatement stmt = getNodeValue(ctx.stmt);
		setNodeValue(ctx, stmt);
	}
	
	@Override
	public void exitImageType(ImageTypeContext ctx) {
		setNodeValue(ctx, ImageType.instance());
	}
	
	@Override
	public void exitInExpression(InExpressionContext ctx) {
		IExpression left = getNodeValue(ctx.left);
		IExpression right = getNodeValue(ctx.right);
		setNodeValue(ctx, new ContainsExpression(left, ContOp.IN, right));
	}
	
	@Override
	public void exitInstanceExpression(InstanceExpressionContext ctx) {
		IExpression exp = getNodeValue(ctx.exp);
		setNodeValue(ctx, exp);
	}
	
	@Override
	public void exitIntDivideExpression(IntDivideExpressionContext ctx) {
		IExpression left = getNodeValue(ctx.left);
		IExpression right = getNodeValue(ctx.right);
		setNodeValue(ctx, new IntDivideExpression(left, right));
	}
	
	@Override
	public void exitIntegerLiteral(IntegerLiteralContext ctx) {
		setNodeValue(ctx, new IntegerLiteral(ctx.getText()));
	}
	
	@Override
	public void exitIntegerType(IntegerTypeContext ctx) {
		setNodeValue(ctx, IntegerType.instance());
	}
	
	@Override
	public void exitInvocation_expression(Invocation_expressionContext ctx) {
		Identifier name = getNodeValue(ctx.name);
		MethodSelector select = new MethodSelector(name);
		setNodeValue(ctx, new MethodCall(select));
	}
	
	@Override
	public void exitInvocationExpression(InvocationExpressionContext ctx) {
		IExpression exp = getNodeValue(ctx.exp);
		setNodeValue(ctx, exp);
	}
	
	@Override
	public void exitInvokeStatement(InvokeStatementContext ctx) {
		IStatement exp = getNodeValue(ctx.exp);
		setNodeValue(ctx, exp);
	}
	
	@Override
	public void exitIsATypeExpression(IsATypeExpressionContext ctx) {
		IType type = getNodeValue(ctx.category_or_any_type());
		IExpression exp = new TypeExpression(type);
		setNodeValue(ctx, exp);
	}
	
	
	@Override
	public void exitIsExpression(IsExpressionContext ctx) {
		IExpression left = getNodeValue(ctx.left);
		IExpression right = getNodeValue(ctx.right);
		EqOp op = right instanceof TypeExpression ? EqOp.IS_A : EqOp.IS;
		setNodeValue(ctx, new EqualsExpression(left, op, right));
	}
	
	@Override
	public void exitIsNotExpression(IsNotExpressionContext ctx) {
		IExpression left = getNodeValue(ctx.left);
		IExpression right = getNodeValue(ctx.right);
		EqOp op = right instanceof TypeExpression ? EqOp.IS_NOT_A : EqOp.IS_NOT;
		setNodeValue(ctx, new EqualsExpression(left, op, right));
	}
	
	@Override
	public void exitIsOtherExpression(IsOtherExpressionContext ctx) {
		IExpression exp = getNodeValue(ctx.expression());
		setNodeValue(ctx, exp);
	}
	
	@Override
	public void exitItemInstance(ItemInstanceContext ctx) {
		IExpression exp = getNodeValue(ctx.exp);
		setNodeValue(ctx, new ItemInstance(exp));
	}
	
	@Override
	public void exitItemSelector(ItemSelectorContext ctx) {
		IExpression exp = getNodeValue(ctx.exp);
		setNodeValue(ctx, new ItemSelector(exp));
	}

	@Override
	public void exitIteratorExpression(IteratorExpressionContext ctx) {
		IExpression exp = getNodeValue(ctx.exp);
		Identifier name = getNodeValue(ctx.name);
		IExpression source = getNodeValue(ctx.source);
		setNodeValue(ctx, new IteratorExpression(name, source, exp));
	}
	
	
	@Override
	public void exitIteratorType(IteratorTypeContext ctx) {
		IType type = getNodeValue(ctx.i);
		setNodeValue(ctx, new IteratorType(type));
	}
	
	
	@Override
	public void exitJava_identifier(Java_identifierContext ctx) {
		setNodeValue(ctx, ctx.getText());
	}
	
	@Override
	public void exitJava_item_expression(Java_item_expressionContext ctx) {
		JavaExpression exp = getNodeValue(ctx.exp);
		setNodeValue(ctx, new JavaItemExpression(exp));
	}
	
	@Override
	public void exitJava_method_expression(Java_method_expressionContext ctx) {
		String name = getNodeValue(ctx.name);
		JavaExpressionList args = getNodeValue(ctx.args);
		setNodeValue(ctx, new JavaMethodExpression(name, args));
	}
	
	@Override
	public void exitJava_parenthesis_expression(Java_parenthesis_expressionContext ctx) {
		JavaExpression exp = getNodeValue(ctx.exp);
		setNodeValue(ctx, exp);
	}
	
	@Override
	public void exitJava_primary_expression(Java_primary_expressionContext ctx) {
		JavaExpression exp = getNodeValue(ctx.getChild(0));
		setNodeValue(ctx, exp);
	}
	
	
	
	@Override
	public void exitJava_this_expression(Java_this_expressionContext ctx) {
		setNodeValue(ctx, new JavaThisExpression());
	}
	
	@Override
	public void exitJavaArgumentList(JavaArgumentListContext ctx) {
		JavaExpression item = getNodeValue(ctx.item);
		setNodeValue(ctx, new JavaExpressionList(item));
	}
	
	@Override
	public void exitJavaArgumentListItem(JavaArgumentListItemContext ctx) {
		JavaExpression item = getNodeValue(ctx.item);
		JavaExpressionList items = getNodeValue(ctx.items);
		items.add(item);
		setNodeValue(ctx, items);
	}
	
	@Override
	public void exitJavaBooleanLiteral(JavaBooleanLiteralContext ctx) {
		setNodeValue(ctx, new JavaBooleanLiteral(ctx.getText()));
	}
	
	@Override
	public void exitJavaCategoryBinding(JavaCategoryBindingContext ctx) {
		JavaIdentifierExpression map = getNodeValue(ctx.binding);
		setNodeValue(ctx, new JavaNativeCategoryBinding(map));
	}
	
	@Override
	public void exitJavaCharacterLiteral(JavaCharacterLiteralContext ctx) {
		setNodeValue(ctx, new JavaCharacterLiteral(ctx.getText()));
	}
	
	@Override
	public void exitJavaChildClassIdentifier(JavaChildClassIdentifierContext ctx) {
		JavaIdentifierExpression parent = getNodeValue(ctx.parent);
		JavaIdentifierExpression child = new JavaIdentifierExpression(parent, ctx.name.getText());
		setNodeValue(ctx, child);
	}
	
	@Override
	public void exitJavaChildIdentifier(JavaChildIdentifierContext ctx) {
		JavaIdentifierExpression parent = getNodeValue(ctx.parent);
		String name = getNodeValue(ctx.name);
		JavaIdentifierExpression child = new JavaIdentifierExpression(parent, name);
		setNodeValue(ctx, child);
	}
	
	@Override
	public void exitJavaClassIdentifier(JavaClassIdentifierContext ctx) {
		JavaIdentifierExpression klass = getNodeValue(ctx.klass);
		setNodeValue(ctx, klass);
	}
	
	@Override
	public void exitJavaDecimalLiteral(JavaDecimalLiteralContext ctx) {
		setNodeValue(ctx, new JavaDecimalLiteral(ctx.getText()));
	}
	
	@Override
	public void exitJavaIdentifier(JavaIdentifierContext ctx) {
		String name = getNodeValue(ctx.name);
		setNodeValue(ctx, new JavaIdentifierExpression(name));
	}
	
	@Override
	public void exitJavaIntegerLiteral(JavaIntegerLiteralContext ctx) {
		setNodeValue(ctx, new JavaIntegerLiteral(ctx.getText()));
	}
	
	@Override
	public void exitJavaItemExpression(JavaItemExpressionContext ctx) {
		JavaExpression exp = getNodeValue(ctx.exp);
		setNodeValue(ctx, exp);
	}

	@Override
	public void exitJavaMethodExpression(JavaMethodExpressionContext ctx) {
		JavaExpression exp = getNodeValue(ctx.exp);
		setNodeValue(ctx, exp);
	}
	
	@Override
	public void exitJavaNativeStatement(JavaNativeStatementContext ctx) {
		JavaStatement stmt = getNodeValue(ctx.java_statement());
		setNodeValue(ctx, new JavaNativeCall(stmt));
	}
	
	@Override
	public void exitJavaPrimaryExpression(JavaPrimaryExpressionContext ctx) {
		JavaExpression exp = getNodeValue(ctx.exp);
		setNodeValue(ctx, exp);
	}
	

	@Override
	public void exitJavaReturnStatement(JavaReturnStatementContext ctx) {
		JavaExpression exp = getNodeValue(ctx.exp);
		setNodeValue(ctx, new JavaStatement(exp,true));
	}
	
	@Override
	public void exitJavascript_category_binding(Javascript_category_bindingContext ctx) {
		String identifier = ctx.javascript_identifier().stream()
				.map(cx->cx.getText())
				.collect(Collectors.joining("."));
		JavaScriptModule module = getNodeValue(ctx.javascript_module());
		JavaScriptNativeCategoryBinding map = new JavaScriptNativeCategoryBinding(identifier, module);
		setNodeValue(ctx, map);
	}
	
	@Override
	public void exitJavascript_identifier(Javascript_identifierContext ctx) {
		String name = ctx.getText();
		setNodeValue(ctx, name);
	}
	
	@Override
	public void exitJavascript_identifier_expression(Javascript_identifier_expressionContext ctx) {
		String name = ctx.getText();
		setNodeValue(ctx, new JavaScriptIdentifierExpression(name));
	}
	
	@Override
	public void exitJavascript_method_expression(Javascript_method_expressionContext ctx) {
		String name = getNodeValue(ctx.name);
		JavaScriptMethodExpression method = new JavaScriptMethodExpression(name);
		JavaScriptExpressionList args = getNodeValue(ctx.args);
		method.setArguments(args);
		setNodeValue(ctx, method);
	}
	
	@Override
	public void exitJavascript_module(Javascript_moduleContext ctx) {
		List<String> ids = new ArrayList<String>();
		for(Javascript_identifierContext ic : ctx.javascript_identifier())
			ids.add(ic.getText());
		JavaScriptModule module = new JavaScriptModule(ids);
		setNodeValue(ctx, module);
	}
	
	@Override
	public void exitJavascript_native_statement(Javascript_native_statementContext ctx) {
		JavaScriptStatement stmt = getNodeValue(ctx.javascript_statement());
		JavaScriptModule module = getNodeValue(ctx.javascript_module());
		stmt.setModule(module);
		setNodeValue(ctx, stmt);
	}
	
	@Override
	public void exitJavascript_primary_expression( Javascript_primary_expressionContext ctx) {
		JavaScriptExpression exp = getNodeValue(ctx.getChild(0));
		setNodeValue(ctx, exp);
	}

	@Override
	public void exitJavascript_this_expression(Javascript_this_expressionContext ctx) {
		setNodeValue(ctx, new JavaScriptThisExpression());		
	}
	
	@Override
	public void exitJavascriptArgumentList(JavascriptArgumentListContext ctx) {
		JavaScriptExpression exp = getNodeValue(ctx.item);
		JavaScriptExpressionList list = new JavaScriptExpressionList(exp);
		setNodeValue(ctx, list);
	}
	
	@Override
	public void exitJavascriptArgumentListItem(JavascriptArgumentListItemContext ctx) {
		JavaScriptExpression exp = getNodeValue(ctx.item);
		JavaScriptExpressionList list = getNodeValue(ctx.items);
		list.add(exp);
		setNodeValue(ctx, list);
	};
	
	@Override
	public void exitJavascriptBooleanLiteral(JavascriptBooleanLiteralContext ctx) {
		String text = ctx.t.getText();
		setNodeValue(ctx, new JavaScriptBooleanLiteral(text));		
	}
	
	@Override
	public void exitJavaScriptCategoryBinding(JavaScriptCategoryBindingContext ctx) {
		JavaScriptNativeCategoryBinding binding = getNodeValue(ctx.binding);
		setNodeValue(ctx, binding);
	}
	
	@Override
	public void exitJavascriptCharacterLiteral(JavascriptCharacterLiteralContext ctx) {
		String text = ctx.t.getText();
		setNodeValue(ctx, new JavaScriptCharacterLiteral(text));		
	}
	
	@Override
	public void exitJavascriptDecimalLiteral(JavascriptDecimalLiteralContext ctx) {
		String text = ctx.t.getText();
		setNodeValue(ctx, new JavaScriptDecimalLiteral(text));		
	}
	
	@Override
	public void exitJavascriptIntegerLiteral(JavascriptIntegerLiteralContext ctx) {
		String text = ctx.t.getText();
		setNodeValue(ctx, new JavaScriptIntegerLiteral(text));		
	}
	
	@Override
	public void exitJavaScriptMemberExpression(JavaScriptMemberExpressionContext ctx) {
		String name = ctx.name.getText();
		setNodeValue(ctx, new JavaScriptMemberExpression(name));
	}
	
	@Override
	public void exitJavaScriptMethodExpression(JavaScriptMethodExpressionContext ctx) {
		JavaScriptExpression method = getNodeValue(ctx.method);
		setNodeValue(ctx, method);
	}
	
	@Override
	public void exitJavaScriptNativeStatement(JavaScriptNativeStatementContext ctx) {
		JavaScriptStatement stmt = getNodeValue(ctx.javascript_native_statement());
		setNodeValue(ctx, new JavaScriptNativeCall(stmt));
	}
	
	@Override
	public void exitJavascript_new_expression(Javascript_new_expressionContext ctx) {
		JavaScriptMethodExpression exp = getNodeValue(ctx.javascript_method_expression());
		setNodeValue(ctx, new JavaScriptNewExpression(exp));
	}
	
	@Override
	public void exitJavascriptPrimaryExpression(JavascriptPrimaryExpressionContext ctx) {
		JavaScriptExpression exp = getNodeValue(ctx.exp);
		setNodeValue(ctx, exp);
	}
	
	@Override
	public void exitJavascriptReturnStatement(JavascriptReturnStatementContext ctx) {
		JavaScriptExpression exp = getNodeValue(ctx.exp);
		setNodeValue(ctx, new JavaScriptStatement(exp, true));
	}
	
	@Override
	public void exitJavascriptSelectorExpression(JavascriptSelectorExpressionContext ctx) {
		JavaScriptExpression parent = getNodeValue(ctx.parent);
		JavaScriptSelectorExpression child = getNodeValue(ctx.child);
		child.setParent(parent);
		setNodeValue(ctx, child);
	}
	
	@Override
	public void exitJavascriptStatement(JavascriptStatementContext ctx) {
		JavaScriptExpression exp = getNodeValue(ctx.exp);
		setNodeValue(ctx, new JavaScriptStatement(exp, false));
	}
	
	@Override
	public void exitJavascriptTextLiteral(JavascriptTextLiteralContext ctx) {
		String text = ctx.t.getText();
		setNodeValue(ctx, new JavaScriptTextLiteral(text));		
	}

	@Override
	public void exitJavaSelectorExpression(JavaSelectorExpressionContext ctx) {
		JavaExpression parent = getNodeValue(ctx.parent);
		JavaSelectorExpression child = getNodeValue(ctx.child);
		child.setParent(parent);
		setNodeValue(ctx, child);
	}
	
	@Override
	public void exitJavaStatement(JavaStatementContext ctx) {
		JavaExpression exp = getNodeValue(ctx.exp);
		setNodeValue(ctx, new JavaStatement(exp,false));
	}
	
	@Override
	public void exitJavaTextLiteral(JavaTextLiteralContext ctx) {
		setNodeValue(ctx, new JavaTextLiteral(ctx.getText()));
	}
	
	
	@Override
	public void exitJsxChild(JsxChildContext ctx) {
		Object jsx = getNodeValue(ctx.jsx);
		setNodeValue(ctx, jsx);
	}
	
	
	@Override
	public void exitJsxCode(JsxCodeContext ctx) {
		IExpression exp = getNodeValue(ctx.exp);
		setNodeValue(ctx, new JsxCode(exp));
	}
	

	@Override
	public void exitJsxExpression(JsxExpressionContext ctx) {
		Object exp = getNodeValue(ctx.exp);
		setNodeValue(ctx, exp);
	}
	
	
	@Override
	public void exitJsxElement(JsxElementContext ctx) {
		JsxElement element = getNodeValue(ctx.opening);
		JsxClosing closing = getNodeValue(ctx.closing);
		element.setClosing(closing);
		List<IJsxExpression> children = getNodeValue(ctx.children_);
		element.setChildren(children);
		setNodeValue(ctx, element);
	}
	
	@Override
	public void exitJsxSelfClosing(JsxSelfClosingContext ctx) {
		setNodeValue(ctx, (JsxSelfClosing)getNodeValue(ctx.jsx));
	}
	
	
	@Override
	public void exitJsxText(JsxTextContext ctx) {
		String text = ParserUtils.getFullText(ctx.text);
		setNodeValue(ctx, new JsxText(text));
	}
	
	
	@Override
	public void exitJsxValue(JsxValueContext ctx) {
		IExpression exp = getNodeValue(ctx.exp);
		setNodeValue(ctx, new JsxExpression(exp));
	}
	
	@Override
	public void exitJsx_attribute(Jsx_attributeContext ctx) {
		Identifier name = getNodeValue(ctx.name);
		IJsxValue value = getNodeValue(ctx.value);
		String suite = getWhiteSpacePlus(ctx.ws_plus());
		setNodeValue(ctx, new JsxProperty(name, value, suite));
	}
	
	
	@Override
	public void exitJsx_children(Jsx_childrenContext ctx) {
		List<IJsxExpression> list = ctx.jsx_child().stream()
				.map(cx -> (IJsxExpression)getNodeValue(cx))
				.collect(Collectors.toList());
		setNodeValue(ctx, list);
	}
	
	@Override
	public void exitJsx_element_name(Jsx_element_nameContext ctx) {
		String name = ctx.getText();
		setNodeValue(ctx, new Identifier(name));
	}
	
	@Override
	public void exitJsx_expression(Jsx_expressionContext ctx) {
		Object exp = getNodeValue(ctx.getChild(0));
		setNodeValue(ctx, exp);
	}
	
	@Override
	public void exitJsx_identifier(Jsx_identifierContext ctx) {
		String name = ctx.getText();
		setNodeValue(ctx, new Identifier(name));
	}
	
	@Override
	public void exitJsxLiteral(JsxLiteralContext ctx) {
		String text = ctx.getText();
		setNodeValue(ctx, new JsxLiteral(text));
	}
	
	@Override
	public void exitJsx_opening(Jsx_openingContext ctx) {
		Identifier name = getNodeValue(ctx.name);
		String nameSuite = getWhiteSpacePlus(ctx.ws_plus());
		List<JsxProperty> attributes = ctx.jsx_attribute().stream()
				.map(cx->(JsxProperty)getNodeValue(cx))
				.collect(Collectors.toList());
		setNodeValue(ctx, new JsxElement(name, nameSuite, attributes, null));
	}
	
	
	@Override
	public void exitJsx_closing(Jsx_closingContext ctx) {
		Identifier name = getNodeValue(ctx.name);
		setNodeValue(ctx, new JsxClosing(name, null));
	}
	
	@Override
	public void exitJsx_self_closing(Jsx_self_closingContext ctx) {
		Identifier name = getNodeValue(ctx.name);
		String nameSuite = getWhiteSpacePlus(ctx.ws_plus());
		List<JsxProperty> attributes = ctx.jsx_attribute().stream()
				.map(cx->(JsxProperty)getNodeValue(cx))
				.collect(Collectors.toList());
		setNodeValue(ctx, new JsxSelfClosing(name, nameSuite, attributes, null));
	}
	
	@Override
	public void exitKey_token(Key_tokenContext ctx) {
		setNodeValue(ctx, ctx.getText());
	}
	
	@Override
	public void exitLessThanExpression(LessThanExpressionContext ctx) {
		IExpression left = getNodeValue(ctx.left);
		IExpression right = getNodeValue(ctx.right);
		setNodeValue(ctx, new CompareExpression(left, CmpOp.LT, right));
	}
	
	@Override
	public void exitLessThanOrEqualExpression(LessThanOrEqualExpressionContext ctx) {
		IExpression left = getNodeValue(ctx.left);
		IExpression right = getNodeValue(ctx.right);
		setNodeValue(ctx, new CompareExpression(left, CmpOp.LTE, right));
	}
	
	@Override
	public void exitList_literal(List_literalContext ctx) {
		boolean mutable = ctx.MUTABLE()!=null;
		ExpressionList items = getNodeValue(ctx.expression_list());
		IExpression value = items==null ? new ListLiteral(mutable) : new ListLiteral(items, mutable);
		setNodeValue(ctx, value);
	}
	
	
	@Override
	public void exitListType(ListTypeContext ctx) {
		IType type = getNodeValue(ctx.l);
		setNodeValue(ctx, new ListType(type));
	}
	
	
	@Override
	public void exitLiteral_expression(Literal_expressionContext ctx) {
		IExpression exp = getNodeValue(ctx.getChild(0));
		setNodeValue(ctx, exp);
	}
	
	@Override
	public void exitLiteralExpression(LiteralExpressionContext ctx) {
		IExpression exp = getNodeValue(ctx.exp);
		setNodeValue(ctx, exp);
	}
	
	@Override
	public void exitLiteral_list_literal(Literal_list_literalContext ctx) {
		ExpressionList items = new ExpressionList();
		ctx.atomic_literal().forEach((l)->{
			IExpression item = getNodeValue(l);
			items.add(item);
		});
		setNodeValue(ctx, items);
	}

	@Override
	public void exitLiteralListLiteral(LiteralListLiteralContext ctx) {
		ExpressionList items = getNodeValue(ctx.literal_list_literal());
		setNodeValue(ctx, new ListLiteral(items, false));
	}
	
	@Override
	public void exitLiteralRangeLiteral(LiteralRangeLiteralContext ctx) {
		IExpression low = getNodeValue(ctx.low);
		IExpression high = getNodeValue(ctx.high);
		setNodeValue(ctx, new RangeLiteral(low, high));
	}
	
	@Override
	public void exitLiteralSetLiteral(LiteralSetLiteralContext ctx) {
		ExpressionList items = getNodeValue(ctx.literal_list_literal());
		setNodeValue(ctx, new SetLiteral(items));
	}
	
	@Override
	public void exitMatchingExpression(MatchingExpressionContext ctx) {
		IExpression exp = getNodeValue(ctx.exp);
		setNodeValue(ctx, new MatchingExpressionConstraint(exp));
	}
	
	@Override
	public void exitMatchingList(MatchingListContext ctx) {
		IExpression exp = getNodeValue(ctx.source);
		setNodeValue(ctx, new MatchingCollectionConstraint(exp));
	}
	
	@Override
	public void exitMatchingPattern(MatchingPatternContext ctx) {
		setNodeValue(ctx, new MatchingPatternConstraint(new TextLiteral(ctx.text.getText())));
	}


	@Override
	public void exitMatchingRange(MatchingRangeContext ctx) {
		IExpression exp = getNodeValue(ctx.source);
		setNodeValue(ctx, new MatchingCollectionConstraint(exp));
	}

	@Override
	public void exitMatchingSet(MatchingSetContext ctx) {
		IExpression exp = getNodeValue(ctx.source);
		setNodeValue(ctx, new MatchingCollectionConstraint(exp));
	}
	
	@Override
	public void exitMaxIntegerLiteral(MaxIntegerLiteralContext ctx) {
		setNodeValue(ctx, new MaxIntegerLiteral());
	}

	@Override
	public void exitMember_method_declaration(Member_method_declarationContext ctx) {
		List<CommentStatement> comments = readComments(ctx.comment_statement());
		List<Annotation> annotations = readAnnotations(ctx.annotation_constructor());
		ParseTree ctx_ = ctx.getChild(ctx.getChildCount()-1);
		IDeclaration decl = getNodeValue(ctx_);
		if(decl!=null) {
			decl.setComments(comments);
			decl.setAnnotations(annotations);
			setNodeValue(ctx, decl);
		}
	}
	
	@Override
	public void exitMember_method_declaration_list(Member_method_declaration_listContext ctx) {
		MethodDeclarationList items = new MethodDeclarationList();
		ctx.member_method_declaration().forEach((m)->{
			IMethodDeclaration item = getNodeValue(m);
			items.add(item);
		});
		setNodeValue(ctx, items);
	}
	
	@Override
	public void exitMemberInstance(MemberInstanceContext ctx) {
		Identifier name = getNodeValue(ctx.name);
		setNodeValue(ctx, new MemberInstance(name));
	}
	
	@Override
	public void exitMemberSelector(MemberSelectorContext ctx) {
		Identifier name = getNodeValue(ctx.name);
		setNodeValue(ctx, new UnresolvedSelector(name));
	}
	
	
	@Override
	public void exitMethod_declaration(Method_declarationContext ctx) {
		IDeclaration decl = getNodeValue(ctx.getChild(0));
		setNodeValue(ctx, decl);
	}
	
	@Override
	public void exitMethod_identifier(Method_identifierContext ctx) {
		setNodeValue(ctx, (Object)getNodeValue(ctx.getChild(0)));
	}
	
	@Override
	public void exitMethodCallExpression(MethodCallExpressionContext ctx) {
		IExpression exp = ctx.exp1!=null ? getNodeValue(ctx.exp1) : getNodeValue(ctx.exp2);
		ArgumentList args = getNodeValue(ctx.args);
		UnresolvedCall call = new UnresolvedCall(exp, args);
		setNodeValue(ctx, call);
	};
	
	@Override
	public void exitMethodCallStatement(MethodCallStatementContext ctx) {
		IStatement stmt = getNodeValue(ctx.stmt);
		setNodeValue(ctx, stmt);
	}
	
	@Override
	public void exitMinIntegerLiteral(MinIntegerLiteralContext ctx) {
		setNodeValue(ctx, new MinIntegerLiteral());
	}
	
	@Override
	public void exitMinusExpression(MinusExpressionContext ctx) {
		IExpression exp = getNodeValue(ctx.exp);
		setNodeValue(ctx, new MinusExpression(exp));
	}
	
	@Override
	public void exitModuloExpression(ModuloExpressionContext ctx) {
		IExpression left = getNodeValue(ctx.left);
		IExpression right = getNodeValue(ctx.right);
		setNodeValue(ctx, new ModuloExpression(left, right));
	}
	
	@Override
	public void exitMultiplyExpression(MultiplyExpressionContext ctx) {
		IExpression left = getNodeValue(ctx.left);
		IExpression right = getNodeValue(ctx.right);
		setNodeValue(ctx, new MultiplyExpression(left, right));
	}
	
	@Override
	public void exitMutable_category_type(Mutable_category_typeContext ctx) {
		CategoryType typ = getNodeValue(ctx.category_type());
		typ.setMutable(ctx.MUTABLE()!=null);
		setNodeValue(ctx, typ);
	}
	
	@Override
	public void exitMutableInstanceExpression(MutableInstanceExpressionContext ctx) {
		IExpression source = getNodeValue(ctx.exp);
		setNodeValue(ctx, new MutableExpression(source));
	}
	
	
	@Override
	public void exitMutableSelectableExpression(MutableSelectableExpressionContext ctx) {
		Identifier name = getNodeValue(ctx.exp);
		setNodeValue(ctx, new InstanceExpression(name));
	}
	
	
	@Override
	public void exitMutableSelectorExpression(MutableSelectorExpressionContext ctx) {
		IExpression parent = getNodeValue(ctx.parent);
		SelectorExpression selector = getNodeValue(ctx.selector);
		selector.setParent(parent);
		setNodeValue(ctx, selector);
	}
	
	@Override
	public void exitNamed_argument(Named_argumentContext ctx) {
		Identifier name = getNodeValue(ctx.variable_identifier());
		UnresolvedParameter arg = new UnresolvedParameter(name);
		IExpression exp = getNodeValue(ctx.literal_expression());
		arg.setDefaultExpression(exp);
		setNodeValue(ctx, arg);
	}
	
	@Override
	public void exitNative_category_bindings(Native_category_bindingsContext ctx) {
		NativeCategoryBindingList items = getNodeValue(ctx.items);
		setNodeValue(ctx, items);
	}
	
	@Override
	public void exitNative_category_declaration(Native_category_declarationContext ctx) {
		Identifier name = getNodeValue(ctx.name);
		IdentifierList attrs = getNodeValue(ctx.attrs);
		NativeCategoryBindingList bindings = getNodeValue(ctx.bindings);
		MethodDeclarationList methods = getNodeValue(ctx.methods);
		CategoryDeclaration decl = new NativeCategoryDeclaration(name, attrs, bindings, null, methods);
		decl.setStorable(ctx.STORABLE()!=null);
		setNodeValue(ctx, decl);
	}
	
	@Override
	public void exitNative_widget_declaration(Native_widget_declarationContext ctx) {
		Identifier name = getNodeValue(ctx.name);
		NativeCategoryBindingList bindings = getNodeValue(ctx.bindings);
		MethodDeclarationList methods = getNodeValue(ctx.methods);
		setNodeValue(ctx, new NativeWidgetDeclaration(name, bindings, methods));
	}
	
	@Override
	public void exitNative_member_method_declaration(Native_member_method_declarationContext ctx) {
		IDeclaration decl = getNodeValue(ctx.getChild(0));
		setNodeValue(ctx, decl);
	}
	
	@Override
	public void exitNative_getter_declaration(Native_getter_declarationContext ctx) {
		Identifier name = getNodeValue(ctx.name);
		StatementList stmts = getNodeValue(ctx.stmts);
		setNodeValue(ctx, new NativeGetterMethodDeclaration(name, stmts));
	}
	
	@Override
	public void exitNative_method_declaration(Native_method_declarationContext ctx) {
		IType type = getNodeValue(ctx.typ);
		Identifier name = getNodeValue(ctx.name);
		ParameterList args = getNodeValue(ctx.args);
		StatementList stmts = getNodeValue(ctx.stmts);
		setNodeValue(ctx, new NativeMethodDeclaration(name, args, type, stmts));
	}
	
	@Override
	public void exitNative_resource_declaration(Native_resource_declarationContext ctx) {
		Identifier name = getNodeValue(ctx.name);
		IdentifierList attrs = getNodeValue(ctx.attrs);
		NativeCategoryBindingList bindings = getNodeValue(ctx.bindings);
		MethodDeclarationList methods = getNodeValue(ctx.methods);
		NativeResourceDeclaration decl = new NativeResourceDeclaration(name, attrs, bindings, null, methods);
		decl.setStorable(ctx.STORABLE()!=null);
		setNodeValue(ctx, decl);
	}
	
	@Override
	public void exitNative_setter_declaration(Native_setter_declarationContext ctx) {
		Identifier name = getNodeValue(ctx.name);
		StatementList stmts = getNodeValue(ctx.stmts);
		setNodeValue(ctx, new NativeSetterMethodDeclaration(name, stmts));
	}
	
	@Override
	public void exitNative_symbol(Native_symbolContext ctx) {
		Identifier name = getNodeValue(ctx.name);
		IExpression exp = getNodeValue(ctx.exp);
		setNodeValue(ctx, new NativeSymbol(name, exp));
	}

	@Override
	public void exitNativeCategoryBindingList(NativeCategoryBindingListContext ctx) {
		NativeCategoryBinding item = getNodeValue(ctx.item);
		NativeCategoryBindingList items = new NativeCategoryBindingList(item);
		setNodeValue(ctx, items);
	}
	
	@Override
	public void exitNativeCategoryBindingListItem(NativeCategoryBindingListItemContext ctx) {
		NativeCategoryBinding item = getNodeValue(ctx.item);
		NativeCategoryBindingList items = getNodeValue(ctx.items);
		items.add(item);
		setNodeValue(ctx, items);
	}
	
	@Override
	public void exitNativeCategoryDeclaration(NativeCategoryDeclarationContext ctx) {
		setNodeValue(ctx, getNodeValue(ctx.decl));
	}
	
	
	@Override
	public void exitNativeWidgetDeclaration(NativeWidgetDeclarationContext ctx) {
		setNodeValue(ctx, getNodeValue(ctx.decl));
	}
	
	@Override
	public void exitNative_member_method_declaration_list(Native_member_method_declaration_listContext ctx) {
		MethodDeclarationList items = new MethodDeclarationList();
		ctx.native_member_method_declaration().forEach((m)->{
			IMethodDeclaration item = getNodeValue(m);
			items.add(item);
		});
		setNodeValue(ctx, items);
	}
	
	@Override
	public void exitNative_statement_list(Native_statement_listContext ctx) {
		StatementList items = new StatementList();
		ctx.native_statement().forEach((s)->{
			IStatement item = getNodeValue(s);
			items.add(item);
		});
		setNodeValue(ctx, items);
	}
	
	@Override
	public void exitNative_symbol_list(Native_symbol_listContext ctx) {
		NativeSymbolList items = new NativeSymbolList();
		ctx.native_symbol().forEach((s)->{
			NativeSymbol item = getNodeValue(s);
			items.add(item);
		});
		setNodeValue(ctx, items);
	}

	
	@Override
	public void exitNativeType(NativeTypeContext ctx) {
		IType type = getNodeValue(ctx.n);
		setNodeValue(ctx, type);
	}
	
	@Override
	public void exitNotHasExpression(NotHasExpressionContext ctx) {
		IExpression left = getNodeValue(ctx.left);
		IExpression right = getNodeValue(ctx.right);
		setNodeValue(ctx, new ContainsExpression(left, ContOp.NOT_HAS, right));
	}

	@Override
	public void exitNotHasAllExpression(NotHasAllExpressionContext ctx) {
		IExpression left = getNodeValue(ctx.left);
		IExpression right = getNodeValue(ctx.right);
		setNodeValue(ctx, new ContainsExpression(left, ContOp.NOT_HAS_ALL, right));
	}
	
	@Override
	public void exitNotHasAnyExpression(NotHasAnyExpressionContext ctx) {
		IExpression left = getNodeValue(ctx.left);
		IExpression right = getNodeValue(ctx.right);
		setNodeValue(ctx, new ContainsExpression(left, ContOp.NOT_HAS_ANY, right));
	}
	
	@Override
	public void exitNotContainsExpression(NotContainsExpressionContext ctx) {
		IExpression left = getNodeValue(ctx.left);
		IExpression right = getNodeValue(ctx.right);
		setNodeValue(ctx, new EqualsExpression(left, EqOp.NOT_CONTAINS, right));
	}
	
	@Override
	public void exitNotEqualsExpression(NotEqualsExpressionContext ctx) {
		IExpression left = getNodeValue(ctx.left);
		IExpression right = getNodeValue(ctx.right);
		setNodeValue(ctx, new EqualsExpression(left, EqOp.NOT_EQUALS, right));
	}
	
	@Override
	public void exitNotExpression(NotExpressionContext ctx) {
		IExpression exp = getNodeValue(ctx.exp);
		setNodeValue(ctx, new NotExpression(exp));
	}
	
	@Override
	public void exitNotInExpression(NotInExpressionContext ctx) {
		IExpression left = getNodeValue(ctx.left);
		IExpression right = getNodeValue(ctx.right);
		setNodeValue(ctx, new ContainsExpression(left, ContOp.NOT_IN, right));
	}
	
	@Override
	public void exitNullLiteral(NullLiteralContext ctx) {
		setNodeValue(ctx, NullLiteral.instance());
	}
	
	
	@Override
	public void exitOperator_argument(Operator_argumentContext ctx) {
		IParameter arg = getNodeValue(ctx.getChild(0));
		setNodeValue(ctx, arg);
	}
	
	@Override
	public void exitOperator_method_declaration(Operator_method_declarationContext ctx) {
		Operator op = getNodeValue(ctx.op);
		IParameter arg = getNodeValue(ctx.arg);
		IType typ = getNodeValue(ctx.typ);
		StatementList stmts = getNodeValue(ctx.stmts);
		OperatorMethodDeclaration decl = new OperatorMethodDeclaration(op, arg, typ, stmts);
		setNodeValue(ctx, decl);
	}
	
	@Override
	public void exitOperatorArgument(OperatorArgumentContext ctx) {
		boolean mutable = ctx.MUTABLE()!=null;
		IParameter arg = getNodeValue(ctx.arg);
		arg.setMutable(mutable);
		setNodeValue(ctx, arg);
	}
	
	@Override
	public void exitOperatorDivide(OperatorDivideContext ctx) {
		setNodeValue(ctx, Operator.DIVIDE);
	}
	
	@Override
	public void exitOperatorIDivide(OperatorIDivideContext ctx) {
		setNodeValue(ctx, Operator.IDIVIDE);
	}
	
	@Override
	public void exitOperatorMinus(OperatorMinusContext ctx) {
		setNodeValue(ctx, Operator.MINUS);
	}
	
	@Override
	public void exitOperatorModulo(OperatorModuloContext ctx) {
		setNodeValue(ctx, Operator.MODULO);
	}
	
	@Override
	public void exitOperatorMultiply(OperatorMultiplyContext ctx) {
		setNodeValue(ctx, Operator.MULTIPLY);
	}
	
	@Override
	public void exitOperatorPlus(OperatorPlusContext ctx) {
		setNodeValue(ctx, Operator.PLUS);
	}
	
	@Override
	public void exitOrder_by(Order_byContext ctx) {
		IdentifierList names = new IdentifierList();
		for(Variable_identifierContext ctx_ : ctx.variable_identifier())
			names.add(getNodeValue(ctx_));
		OrderByClause clause = new OrderByClause(names, ctx.DESC()!=null);
		setNodeValue(ctx, clause);
	}
	
	@Override
	public void exitOrder_by_list(Order_by_listContext ctx) {
		OrderByClauseList list = new OrderByClauseList();
		for(Order_byContext ctx_ : ctx.order_by())
			list.add(getNodeValue(ctx_));
		setNodeValue(ctx, list);
	}
	
	@Override
	public void exitOrExpression(OrExpressionContext ctx) {
		IExpression left = getNodeValue(ctx.left);
		IExpression right = getNodeValue(ctx.right);
		setNodeValue(ctx, new OrExpression(left, right));
	}
	
	@Override
	public void exitParenthesis_expression(Parenthesis_expressionContext ctx) {
		IExpression exp = getNodeValue(ctx.expression());
		setNodeValue(ctx, new ParenthesisExpression(exp));
	}
	
	@Override
	public void exitParenthesisExpression(ParenthesisExpressionContext ctx) {
		IExpression exp = getNodeValue(ctx.exp);
		setNodeValue(ctx, exp);
	}
	
	@Override
	public void exitPeriodLiteral(PeriodLiteralContext ctx) {
		setNodeValue(ctx, new PeriodLiteral(ctx.getText()));
	}
	
	@Override
	public void exitPeriodType(PeriodTypeContext ctx) {
		setNodeValue(ctx, PeriodType.instance());
	}

	@Override
	public void exitPrimaryType(PrimaryTypeContext ctx) {
		IType type = getNodeValue(ctx.p);
		setNodeValue(ctx, type);
	}
	
	@Override
	public void exitPython_category_binding(Python_category_bindingContext ctx) {
		String identifier = ctx.identifier().getText();
		PythonModule module = getNodeValue(ctx.python_module());
		PythonNativeCategoryBinding map = new PythonNativeCategoryBinding(identifier, module);
		setNodeValue(ctx, map);
	}
	
	@Override
	public void exitPython_identifier(Python_identifierContext ctx) {
		setNodeValue(ctx, ctx.getText());
	}
	
	@Override
	public void exitPython_method_expression(Python_method_expressionContext ctx) {
		String name = getNodeValue(ctx.name);
		PythonArgumentList args = getNodeValue(ctx.args);
		PythonMethodExpression method = new PythonMethodExpression(name);
		method.setArguments(args);
		setNodeValue(ctx, method);
	}
	
	@Override
	public void exitPython_module(Python_moduleContext ctx) {
		List<String> ids = new ArrayList<String>();
		for(Python_identifierContext ic : ctx.python_identifier())
			ids.add(ic.getText());
		PythonModule module = new PythonModule(ids);
		setNodeValue(ctx, module);
	}
	
	@Override
	public void exitPython_native_statement(Python_native_statementContext ctx) {
		PythonStatement stmt = getNodeValue(ctx.python_statement());
		PythonModule module = getNodeValue(ctx.python_module());
		stmt.setModule(module);
		setNodeValue(ctx, stmt);
	}
	
	@Override
	public void exitPython2CategoryBinding(Python2CategoryBindingContext ctx) {
		PythonNativeCategoryBinding map = getNodeValue(ctx.binding);
		setNodeValue(ctx, new Python2NativeCategoryBinding(map));
	}
	
	@Override
	public void exitPython2NativeStatement(Python2NativeStatementContext ctx) {
		PythonStatement stmt = getNodeValue(ctx.python_native_statement());
		setNodeValue(ctx, new Python2NativeCall(stmt));
	}
	
	@Override
	public void exitPython3CategoryBinding(Python3CategoryBindingContext ctx) {
		PythonNativeCategoryBinding map = getNodeValue(ctx.binding);
		setNodeValue(ctx, new Python3NativeCategoryBinding(map));
	}
	
	@Override
	public void exitPython3NativeStatement(Python3NativeStatementContext ctx) {
		PythonStatement stmt = getNodeValue(ctx.python_native_statement());
		setNodeValue(ctx, new Python3NativeCall(stmt));
	}
	
	@Override
	public void exitPythonArgumentList(PythonArgumentListContext ctx) {
		PythonArgumentList ordinal = getNodeValue(ctx.ordinal);
		PythonArgumentList named = getNodeValue(ctx.named);
		if(ordinal==null)
			ordinal = new PythonArgumentList();
		if(named!=null)
			ordinal.addAll(named);
		setNodeValue(ctx, ordinal);
	}
	
	@Override
	public void exitPythonBooleanLiteral(PythonBooleanLiteralContext ctx) {
		setNodeValue(ctx, new PythonBooleanLiteral(ctx.getText()));
	}
	
	@Override
	public void exitPythonCharacterLiteral(PythonCharacterLiteralContext ctx) {
		setNodeValue(ctx, new PythonCharacterLiteral(ctx.getText()));
	};
	
	@Override
	public void exitPythonChildIdentifier(PythonChildIdentifierContext ctx) {
		PythonIdentifierExpression parent = getNodeValue(ctx.parent);
		String name = getNodeValue(ctx.name);
		PythonIdentifierExpression child = new PythonIdentifierExpression(parent, name);
		setNodeValue(ctx, child);
	}
	
	@Override
	public void exitPythonDecimalLiteral(PythonDecimalLiteralContext ctx) {
		setNodeValue(ctx, new PythonDecimalLiteral(ctx.getText()));
	}
	
	@Override
	public void exitPythonGlobalMethodExpression(PythonGlobalMethodExpressionContext ctx) {
		PythonMethodExpression exp = getNodeValue(ctx.exp);
		setNodeValue(ctx, exp);
	}
	
	@Override
	public void exitPythonIdentifier(PythonIdentifierContext ctx) {
		String name = getNodeValue(ctx.name);
		setNodeValue(ctx, new PythonIdentifierExpression(name));
	}
	
	@Override
	public void exitPythonIdentifierExpression(PythonIdentifierExpressionContext ctx) {
		PythonIdentifierExpression exp = getNodeValue(ctx.exp);
		setNodeValue(ctx, exp);
	}
	
	@Override
	public void exitPythonIntegerLiteral(PythonIntegerLiteralContext ctx) {
		setNodeValue(ctx, new PythonIntegerLiteral(ctx.getText()));
	}
	
	@Override
	public void exitPythonLiteralExpression(PythonLiteralExpressionContext ctx) {
		PythonExpression exp = getNodeValue(ctx.exp);
		setNodeValue(ctx, exp);
	}
	
	@Override
	public void exitPythonMethodExpression(PythonMethodExpressionContext ctx) {
		PythonMethodExpression exp = getNodeValue(ctx.exp);
		setNodeValue(ctx, exp);
	}
	
	@Override
	public void exitPythonNamedArgumentList(PythonNamedArgumentListContext ctx) {
		String name = getNodeValue(ctx.name);
		PythonExpression exp = getNodeValue(ctx.exp);
		PythonNamedArgument arg = new PythonNamedArgument(name, exp);
		setNodeValue(ctx, new PythonArgumentList(arg));
	}
	
	@Override
	public void exitPythonNamedArgumentListItem(PythonNamedArgumentListItemContext ctx) {
		String name = getNodeValue(ctx.name);
		PythonExpression exp = getNodeValue(ctx.exp);
		PythonNamedArgument arg = new PythonNamedArgument(name, exp);
		PythonArgumentList items = getNodeValue(ctx.items);
		items.add(arg);
		setNodeValue(ctx, items);
	}
	
	@Override
	public void exitPythonNamedOnlyArgumentList(PythonNamedOnlyArgumentListContext ctx) {
		PythonArgumentList named = getNodeValue(ctx.named);
		setNodeValue(ctx, named);
	}
	
	@Override
	public void exitPythonOrdinalArgumentList( PythonOrdinalArgumentListContext ctx) {
		PythonExpression exp = getNodeValue(ctx.item);
		PythonOrdinalArgument arg = new PythonOrdinalArgument(exp);
		setNodeValue(ctx, new PythonArgumentList(arg));
	}
	
	@Override
	public void exitPythonOrdinalArgumentListItem( PythonOrdinalArgumentListItemContext ctx) {
		PythonExpression exp = getNodeValue(ctx.item);
		PythonOrdinalArgument arg = new PythonOrdinalArgument(exp);
		PythonArgumentList items = getNodeValue(ctx.items);
		items.add(arg);
		setNodeValue(ctx, items);
	}
	
	@Override
	public void exitPythonOrdinalOnlyArgumentList(PythonOrdinalOnlyArgumentListContext ctx) {
		PythonArgumentList ordinal = getNodeValue(ctx.ordinal);
		setNodeValue(ctx, ordinal);
	}

	@Override
	public void exitPythonPromptoIdentifier(PythonPromptoIdentifierContext ctx) {
		String name = ctx.DOLLAR_IDENTIFIER().getText();
		setNodeValue(ctx, new PythonIdentifierExpression(name));
	}
	
	@Override
	public void exitPythonPrimaryExpression(PythonPrimaryExpressionContext ctx) {
		PythonExpression exp = getNodeValue(ctx.exp);
		setNodeValue(ctx, exp);
	}
	
	@Override
	public void exitPythonReturnStatement(PythonReturnStatementContext ctx) {
		PythonExpression exp = getNodeValue(ctx.exp);
		setNodeValue(ctx, new PythonStatement(exp,true));
	}
	
	@Override
	public void exitPythonSelectorExpression(PythonSelectorExpressionContext ctx) {
		PythonExpression parent = getNodeValue(ctx.parent);
		PythonSelectorExpression selector = getNodeValue(ctx.child);
		selector.setParent(parent);
		setNodeValue(ctx, selector);
	}
	
	@Override
	public void exitPythonSelfExpression(PythonSelfExpressionContext ctx) {
		setNodeValue(ctx, new PythonSelfExpression());
	}
	
	
	@Override
	public void exitPythonStatement(PythonStatementContext ctx) {
		PythonExpression exp = getNodeValue(ctx.exp);
		setNodeValue(ctx, new PythonStatement(exp,false));
	}
	
	@Override
	public void exitPythonTextLiteral(PythonTextLiteralContext ctx) {
		setNodeValue(ctx, new PythonTextLiteral(ctx.getText()));
	}
	
	@Override
	public void exitRaise_statement(Raise_statementContext ctx) {
		IExpression exp = getNodeValue(ctx.exp);
		setNodeValue(ctx, new RaiseStatement(exp));
	}
	
	@Override
	public void exitRaiseStatement(RaiseStatementContext ctx) {
		IStatement stmt = getNodeValue(ctx.stmt);
		setNodeValue(ctx, stmt);
	}
	
	@Override
	public void exitRange_literal(Range_literalContext ctx) {
		IExpression low = getNodeValue(ctx.low);
		IExpression high = getNodeValue(ctx.high);
		setNodeValue(ctx, new RangeLiteral(low, high));
	}
	
	
	@Override
	public void exitRead_all_expression(Read_all_expressionContext ctx) {
		IExpression source = getNodeValue(ctx.source);
		setNodeValue(ctx, new ReadAllExpression(source));
	}
	
	@Override
	public void exitRead_one_expression(Read_one_expressionContext ctx) {
		IExpression source = getNodeValue(ctx.source);
		setNodeValue(ctx, new ReadOneExpression(source));
	}
	
	@Override
	public void exitReadAllExpression(ReadAllExpressionContext ctx) {
		IExpression exp = getNodeValue(ctx.exp);
		setNodeValue(ctx, exp);
	};
	
	@Override
	public void exitReadOneExpression(ReadOneExpressionContext ctx) {
		IExpression exp = getNodeValue(ctx.exp);
		setNodeValue(ctx, exp);
	}
	
	@Override
	public void exitResource_declaration(Resource_declarationContext ctx) {
		IDeclaration decl = getNodeValue(ctx.native_resource_declaration());
		setNodeValue(ctx, decl);
	}
	
	@Override
	public void exitReturn_statement(Return_statementContext ctx) {
		IExpression exp = getNodeValue(ctx.exp);
		setNodeValue(ctx, new ReturnStatement(exp));
	}
	
	@Override
	public void exitReturnStatement(ReturnStatementContext ctx) {
		IStatement stmt = getNodeValue(ctx.stmt);
		setNodeValue(ctx, stmt);
	}
	
	@Override
	public void exitRootInstance(RootInstanceContext ctx) {
		Identifier name = getNodeValue(ctx.variable_identifier());
		setNodeValue(ctx, new VariableInstance(name));
	}
	
	@Override
	public void exitRoughlyEqualsExpression(RoughlyEqualsExpressionContext ctx) {
		IExpression left = getNodeValue(ctx.left);
		IExpression right = getNodeValue(ctx.right);
		setNodeValue(ctx, new EqualsExpression(left, EqOp.ROUGHLY, right));
	};
	
	@Override
	public void exitSelectableExpression(SelectableExpressionContext ctx) {
		IExpression parent = getNodeValue(ctx.selectable_expression());
		setNodeValue(ctx, parent);
	}
	
	@Override
	public void exitSelectorExpression(SelectorExpressionContext ctx) {
		IExpression parent = getNodeValue(ctx.parent);
		SelectorExpression selector = getNodeValue(ctx.selector);
		selector.setParent(parent);
		setNodeValue(ctx, selector);
	}
	
	@Override
	public void exitSet_literal(Set_literalContext ctx) {
		ExpressionList items = getNodeValue(ctx.expression_list());
		ContainerLiteral<SetValue> set = items==null ? new SetLiteral() : new SetLiteral(items);
		setNodeValue(ctx, set);
	}
	
	
	@Override
	public void exitSetter_method_declaration(Setter_method_declarationContext ctx) {
		Identifier name = getNodeValue(ctx.name);
		StatementList stmts = getNodeValue(ctx.stmts);
		setNodeValue(ctx, new SetterMethodDeclaration(name, stmts));
	}
	
	@Override
	public void exitSetType(SetTypeContext ctx) {
		IType itemType = getNodeValue(ctx.s);
		setNodeValue(ctx, new SetType(itemType));
	}
	
	@Override
	public void exitSingleton_category_declaration(Singleton_category_declarationContext ctx) {
		Identifier name = getNodeValue(ctx.name);
		IdentifierList attrs = getNodeValue(ctx.attrs);
		MethodDeclarationList methods = getNodeValue(ctx.methods);
		setNodeValue(ctx, new SingletonCategoryDeclaration(name, attrs, methods));
	}
	
	@Override
	public void exitSingletonCategoryDeclaration(SingletonCategoryDeclarationContext ctx) {
		IDeclaration decl = getNodeValue(ctx.decl);
		setNodeValue(ctx, decl);
	}
	
	@Override
	public void exitSliceFirstAndLast(SliceFirstAndLastContext ctx) {
		IExpression first = getNodeValue(ctx.first);
		IExpression last = getNodeValue(ctx.last);
		setNodeValue(ctx, new SliceSelector(first, last));
	}
	
	@Override
	public void exitSliceFirstOnly(SliceFirstOnlyContext ctx) {
		IExpression first = getNodeValue(ctx.first);
		setNodeValue(ctx, new SliceSelector(first, null));
	}
	
	@Override
	public void exitSliceLastOnly(SliceLastOnlyContext ctx) {
		IExpression last = getNodeValue(ctx.last);
		setNodeValue(ctx, new SliceSelector(null, last));
	}
	
	@Override
	public void exitSliceSelector(SliceSelectorContext ctx) {
		IExpression slice = getNodeValue(ctx.xslice);
		setNodeValue(ctx, slice);
	}
	
	@Override
	public void exitSorted_expression(Sorted_expressionContext ctx) {
		IExpression source = getNodeValue(ctx.source);
		boolean descending = ctx.DESC()!=null;
		IExpression key = getNodeValue(ctx.key);
		setNodeValue(ctx, new SortedExpression(source, descending, key));
	}
	
	
	@Override
	public void exitSorted_key(Sorted_keyContext ctx) {
		setNodeValue(ctx, (Object)getNodeValue(ctx.getChild(0)));
	}

	
	@Override
	public void exitSortedExpression(SortedExpressionContext ctx) {
		setNodeValue(ctx, (Object)getNodeValue(ctx.exp));
	}
	
	
	@Override
	public void exitStatement_list(Statement_listContext ctx) {
		StatementList items = new StatementList();
		ctx.statement().forEach((s)->{
			IStatement item = getNodeValue(s);
			items.add(item);
		});
		setNodeValue(ctx, items);
	}
	
	@Override
	public void exitStore_statement(Store_statementContext ctx) {
		ExpressionList deletables = getNodeValue(ctx.to_del);
		ExpressionList storables = getNodeValue(ctx.to_add);
		StatementList andThen = getNodeValue(ctx.stmts);
		StoreStatement stmt = new StoreStatement(deletables, storables, andThen);
		setNodeValue(ctx, stmt);
	}
	
	@Override
	public void exitStoreStatement(StoreStatementContext ctx) {
		setNodeValue(ctx, getNodeValue(ctx.stmt));
	}

	@Override
	public void exitSwitch_statement(Switch_statementContext ctx) {
		IExpression exp = getNodeValue(ctx.exp);
		SwitchCaseList cases = getNodeValue(ctx.cases);
		StatementList stmts = getNodeValue(ctx.stmts);
		SwitchStatement stmt = new SwitchStatement(exp, cases, stmts);
		setNodeValue(ctx, stmt);
	}
	
	@Override
	public void exitSwitch_case_statement_list(Switch_case_statement_listContext ctx) {
		SwitchCaseList items = new SwitchCaseList();
		ctx.switch_case_statement().forEach((s)->{
			SwitchCase item = getNodeValue(s);
			items.add(item);
		});
		setNodeValue(ctx, items);
	}

	@Override
	public void exitSwitchStatement(SwitchStatementContext ctx) {
		IStatement stmt = getNodeValue(ctx.stmt);
		setNodeValue(ctx, stmt);
	}

	@Override
	public void exitSymbol_identifier(Symbol_identifierContext ctx) {
		setNodeValue(ctx, new Identifier(ctx.getText()));
	}
	
	@Override
	public void exitSymbol_list(Symbol_listContext ctx) {
		throw new UnsupportedOperationException();
	}
	

	@Override
	public void exitSymbolIdentifier(SymbolIdentifierContext ctx) {
		Identifier name = getNodeValue(ctx.symbol_identifier());
		setNodeValue(ctx, name);
	}
	
	@Override
	public void exitSymbols_token(Symbols_tokenContext ctx) {
		setNodeValue(ctx, ctx.getText());
	}
	
	@Override
	public void exitTernaryExpression(TernaryExpressionContext ctx) {
		IExpression condition = getNodeValue(ctx.test);
		IExpression ifTrue = getNodeValue(ctx.ifTrue);
		IExpression ifFalse = getNodeValue(ctx.ifFalse);
		TernaryExpression exp = new TernaryExpression(condition, ifTrue, ifFalse);
		setNodeValue(ctx, exp);
	};
	
	@Override
	public void exitTest_method_declaration(Test_method_declarationContext ctx) {
		Identifier name = new Identifier(ctx.name.getText());
		StatementList stmts = getNodeValue(ctx.stmts);
		AssertionList exps = getNodeValue(ctx.exps);
		Identifier errorName = getNodeValue(ctx.error);
		SymbolExpression error = errorName==null ? null : new SymbolExpression(errorName);
		setNodeValue(ctx, new TestMethodDeclaration(name, stmts, exps, error));
	}

	@Override
	public void exitTextLiteral(TextLiteralContext ctx) {
		setNodeValue(ctx, new TextLiteral(ctx.getText()));
	}
	
	@Override
	public void exitTextType(TextTypeContext ctx) {
		setNodeValue(ctx, TextType.instance());
	}
	
	@Override
	public void exitThisExpression(ThisExpressionContext ctx) {
		setNodeValue(ctx, new ThisExpression());
	}
	
	@Override
	public void exitTimeLiteral(TimeLiteralContext ctx) {
		setNodeValue(ctx, new TimeLiteral(ctx.getText()));
	}
	
	@Override
	public void exitTimeType(TimeTypeContext ctx) {
		setNodeValue(ctx, TimeType.instance());
	}
	
	@Override
	public void exitTry_statement(Try_statementContext ctx) {
		Identifier name = getNodeValue(ctx.name);
		StatementList stmts = getNodeValue(ctx.stmts);
		SwitchCaseList handlers = getNodeValue(ctx.handlers);
		StatementList anyStmts = getNodeValue(ctx.anyStmts);
		StatementList finalStmts = getNodeValue(ctx.finalStmts);
		SwitchErrorStatement stmt = new SwitchErrorStatement(name, stmts, handlers, anyStmts, finalStmts);
		setNodeValue(ctx, stmt);
	}
	
	@Override
	public void exitTryStatement(TryStatementContext ctx) {
		IStatement stmt = getNodeValue(ctx.stmt);
		setNodeValue(ctx, stmt);
	}
	
	@Override
	public void exitTuple_literal(Tuple_literalContext ctx) {
		boolean mutable = ctx.MUTABLE()!=null;
		ExpressionList items = getNodeValue(ctx.expression_tuple());
		IExpression value = items==null ? new TupleLiteral(mutable) : new TupleLiteral(items, mutable);
		setNodeValue(ctx, value);
	}
	
	@Override
	public void exitType_identifier(Type_identifierContext ctx) {
		setNodeValue(ctx, new Identifier(ctx.getText()));
	}
	
	
	@Override
	public void exitType_identifier_list(Type_identifier_listContext ctx) {
		IdentifierList items = new IdentifierList();
		ctx.type_identifier().forEach((i)->{
			Identifier item = getNodeValue(i);
			items.add(item);
		});
		setNodeValue(ctx, items);
	}
	
	
	@Override
	public void exitType_literal(Type_literalContext ctx) {
		IType type = getNodeValue(ctx.typedef());
		setNodeValue(ctx, new TypeLiteral(type));
	}
	
	@Override
	public void exitTyped_argument(Typed_argumentContext ctx) {
		IType type = getNodeValue(ctx.typ);
		Identifier name = getNodeValue(ctx.name);
		IdentifierList attrs = getNodeValue(ctx.attrs);
		CategoryParameter arg = attrs==null ?
				new CategoryParameter(type, name) : 
				new ExtendedParameter(type, name, attrs); 
		IExpression exp = getNodeValue(ctx.value);
		arg.setDefaultExpression(exp);
		setNodeValue(ctx, arg);
	}
	
	@Override
	public void exitTypeIdentifier(TypeIdentifierContext ctx) {
		Identifier name = getNodeValue(ctx.type_identifier());
		setNodeValue(ctx, name);
	}
	
	
	@Override
	public void exitTypeLiteral(TypeLiteralContext ctx) {
		setNodeValue(ctx, getNodeValue(ctx.type_literal()));
	}

	
	@Override
	public void exitUnresolved_selector(Unresolved_selectorContext ctx) {
		Identifier name = getNodeValue(ctx.name);
		setNodeValue(ctx, new MemberSelector(name));
	}
	
	@Override
	public void exitUnresolvedExpression(UnresolvedExpressionContext ctx) {
		IExpression exp = getNodeValue(ctx.exp);
		setNodeValue(ctx, exp);
	}
	
	@Override
	public void exitUnresolvedIdentifier(UnresolvedIdentifierContext ctx) {
		Identifier name = getNodeValue(ctx.name);
		setNodeValue(ctx, new UnresolvedIdentifier(name));
	}
	
	@Override
	public void exitUnresolvedSelector(UnresolvedSelectorContext ctx) {
		IExpression parent = getNodeValue(ctx.parent);
		SelectorExpression selector = getNodeValue(ctx.selector);
		selector.setParent(parent);
		setNodeValue(ctx, selector);
	}
	
	@Override
	public void exitUnresolvedWithArgsStatement(UnresolvedWithArgsStatementContext ctx) {
		IExpression exp = getNodeValue(ctx.exp);
		ArgumentList args = getNodeValue(ctx.args);
		Identifier resultName = getNodeValue(ctx.name);
		StatementList stmts = getNodeValue(ctx.stmts);
		if(resultName!=null || stmts!=null)
			setNodeValue(ctx, new RemoteCall(exp, args, resultName, stmts));
		else	
			setNodeValue(ctx, new UnresolvedCall(exp, args));
	}
	
	
	@Override
	public void exitUUIDLiteral(UUIDLiteralContext ctx) {
		setNodeValue(ctx, new UuidLiteral(ctx.getText()));
	}
	
	@Override
	public void exitUUIDType(UUIDTypeContext ctx) {
		setNodeValue(ctx, UuidType.instance());
	}
	
	@Override
	public void exitValue_token(Value_tokenContext ctx) {
		setNodeValue(ctx, ctx.getText());
	}
	
	@Override
	public void exitExpression_list(Expression_listContext ctx) {
		ExpressionList items = new ExpressionList();
		ctx.expression().forEach((e)->{
			IExpression item = getNodeValue(e);
			items.add(item);
		});
		setNodeValue(ctx, items);
	}
	
	@Override
	public void exitExpression_tuple(Expression_tupleContext ctx) {
		ExpressionList items = new ExpressionList();
		ctx.expression().forEach((e)->{
			IExpression item = getNodeValue(e);
			items.add(item);
		});
		setNodeValue(ctx, items);
	}
	
	@Override
	public void exitVariable_identifier(Variable_identifierContext ctx) {
		setNodeValue(ctx, new Identifier(ctx.getText()));
	}
	
	@Override
	public void exitVariableIdentifier(VariableIdentifierContext ctx) {
		Identifier name = getNodeValue(ctx.variable_identifier());
		setNodeValue(ctx, name);
	}
	
	@Override
	public void exitVariable_identifier_list(Variable_identifier_listContext ctx) {
		IdentifierList list = new IdentifierList();
		for(Variable_identifierContext v : ctx.variable_identifier()){
			Identifier item = getNodeValue(v);
			list.add(item);
		}
		setNodeValue(ctx, list);
	}
	
	@Override
	public void exitVersionType(VersionTypeContext ctx) {
		setNodeValue(ctx, VersionType.instance());
	}

	@Override
	public void exitVersionLiteral(VersionLiteralContext ctx) {
		setNodeValue(ctx, new VersionLiteral(ctx.getText()));
	}
	

	
	@Override
	public void exitWhile_statement(While_statementContext ctx) {
		IExpression exp = getNodeValue(ctx.exp);
		StatementList stmts = getNodeValue(ctx.stmts);
		setNodeValue(ctx, new WhileStatement(exp, stmts));
	}
	
	@Override
	public void exitWhileStatement(WhileStatementContext ctx) {
		IStatement stmt = getNodeValue(ctx.stmt);
		setNodeValue(ctx, stmt);
	}
	
	@Override
	public void exitWith_resource_statement(With_resource_statementContext ctx) {
		AssignVariableStatement stmt = getNodeValue(ctx.stmt);
		StatementList stmts = getNodeValue(ctx.stmts);
		setNodeValue(ctx, new WithResourceStatement(stmt, stmts));
	}
	
	@Override
	public void exitWith_singleton_statement(With_singleton_statementContext ctx) {
		Identifier name = getNodeValue(ctx.typ);
		CategoryType type = new CategoryType(name);
		StatementList stmts = getNodeValue(ctx.stmts);
		setNodeValue(ctx, new WithSingletonStatement(type, stmts));
	}
	
	@Override
	public void exitWithResourceStatement(WithResourceStatementContext ctx) {
		IStatement stmt = getNodeValue(ctx.stmt);
		setNodeValue(ctx, stmt);
	}
	
	@Override
	public void exitWithSingletonStatement(WithSingletonStatementContext ctx) {
		IStatement stmt = getNodeValue(ctx.stmt);
		setNodeValue(ctx, stmt);
	}
	
	@Override
	public void exitWrite_statement(Write_statementContext ctx) {
		IExpression what = getNodeValue(ctx.what);
		IExpression target = getNodeValue(ctx.target);
		setNodeValue(ctx, new WriteStatement(what, target));
	}
	
	@Override
	public void exitWriteStatement(WriteStatementContext ctx) {
		IStatement stmt = getNodeValue(ctx.stmt);
		setNodeValue(ctx, stmt);
	}
	
	private Token findFirstValidToken(int idx) {
		if(idx==-1) // happens because input.index() is called before any other read operation (bug?)
			idx = 0;
		do {
			Token token = readValidToken(idx++);
			if(token!=null)
				return token;
		} while(idx<input.size());
		return null;
	}
	
	private Token findLastValidToken(int idx) {
		if(idx==-1) // happens because input.index() is called before any other read operation (bug?)
			idx = 0;
		while(idx>=0) {
			Token token = readValidToken(idx--);
			if(token!=null)
				return token;
		}
		return null;
	}
	
	@SuppressWarnings("unchecked")
	public <T extends Object> T getNodeValue(ParseTree node) {
		return (T)nodeValues.get(node);
	};
	
	private Token readValidToken(int idx) {
		Token token = input.get(idx);
		String text = token.getText();
		if(text!=null && text.length()>0 && !Character.isWhitespace(text.charAt(0)))
			return token;
		else
			return null;
	}
	
	public void setNodeValue(ParserRuleContext node, Section value) {
		nodeValues.put(node, value);
		buildSection(node, value);
	}
	
	public void setNodeValue(ParseTree node, Object value) {
		nodeValues.put(node, value);
		if(node instanceof ParserRuleContext && value instanceof Section)
			buildSection((ParserRuleContext)node, (Section)value);
	}
	
}