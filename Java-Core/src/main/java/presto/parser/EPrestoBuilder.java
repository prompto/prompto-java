package presto.parser;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import presto.csharp.CSharpBooleanLiteral;
import presto.csharp.CSharpCharacterLiteral;
import presto.csharp.CSharpDecimalLiteral;
import presto.csharp.CSharpExpression;
import presto.csharp.CSharpExpressionList;
import presto.csharp.CSharpIdentifierExpression;
import presto.csharp.CSharpIntegerLiteral;
import presto.csharp.CSharpMethodExpression;
import presto.csharp.CSharpNativeCall;
import presto.csharp.CSharpNativeCategoryMapping;
import presto.csharp.CSharpSelectorExpression;
import presto.csharp.CSharpStatement;
import presto.csharp.CSharpTextLiteral;
import presto.declaration.AbstractMethodDeclaration;
import presto.declaration.AttributeDeclaration;
import presto.declaration.ConcreteCategoryDeclaration;
import presto.declaration.ConcreteMethodDeclaration;
import presto.declaration.EnumeratedCategoryDeclaration;
import presto.declaration.EnumeratedNativeDeclaration;
import presto.declaration.GetterMethodDeclaration;
import presto.declaration.ICategoryMethodDeclaration;
import presto.declaration.IDeclaration;
import presto.declaration.NativeCategoryDeclaration;
import presto.declaration.NativeMethodDeclaration;
import presto.declaration.NativeResourceDeclaration;
import presto.declaration.OperatorMethodDeclaration;
import presto.declaration.SetterMethodDeclaration;
import presto.declaration.SingletonCategoryDeclaration;
import presto.declaration.TestMethodDeclaration;
import presto.expression.AddExpression;
import presto.expression.AndExpression;
import presto.expression.CastExpression;
import presto.expression.CodeExpression;
import presto.expression.CompareExpression;
import presto.expression.ConstructorExpression;
import presto.expression.ContainsExpression;
import presto.expression.DivideExpression;
import presto.expression.DocumentExpression;
import presto.expression.EqualsExpression;
import presto.expression.ExecuteExpression;
import presto.expression.FetchExpression;
import presto.expression.IExpression;
import presto.expression.IntDivideExpression;
import presto.expression.ItemSelector;
import presto.expression.MemberSelector;
import presto.expression.MethodExpression;
import presto.expression.MethodSelector;
import presto.expression.MinusExpression;
import presto.expression.ModuloExpression;
import presto.expression.MultiplyExpression;
import presto.expression.NotExpression;
import presto.expression.OrExpression;
import presto.expression.ParenthesisExpression;
import presto.expression.ReadExpression;
import presto.expression.SelectorExpression;
import presto.expression.SliceSelector;
import presto.expression.SortedExpression;
import presto.expression.SubtractExpression;
import presto.expression.SymbolExpression;
import presto.expression.TernaryExpression;
import presto.expression.ThisExpression;
import presto.expression.TypeExpression;
import presto.grammar.ArgumentAssignment;
import presto.grammar.ArgumentAssignmentList;
import presto.grammar.ArgumentList;
import presto.grammar.CategoryArgument;
import presto.grammar.CategoryMethodDeclarationList;
import presto.grammar.CategorySymbol;
import presto.grammar.CategorySymbolList;
import presto.grammar.CmpOp;
import presto.grammar.CodeArgument;
import presto.grammar.ContOp;
import presto.grammar.DeclarationList;
import presto.grammar.EqOp;
import presto.grammar.IArgument;
import presto.grammar.IAssignableInstance;
import presto.grammar.IAssignableSelector;
import presto.grammar.IAttributeConstraint;
import presto.grammar.Identifier;
import presto.grammar.ItemInstance;
import presto.grammar.MatchingCollectionConstraint;
import presto.grammar.MatchingExpressionConstraint;
import presto.grammar.MatchingPatternConstraint;
import presto.grammar.MemberInstance;
import presto.grammar.NativeCategoryMapping;
import presto.grammar.NativeCategoryMappingList;
import presto.grammar.NativeSymbol;
import presto.grammar.NativeSymbolList;
import presto.grammar.Operator;
import presto.grammar.UnresolvedArgument;
import presto.grammar.UnresolvedIdentifier;
import presto.grammar.VariableInstance;
import presto.java.JavaBooleanLiteral;
import presto.java.JavaCharacterLiteral;
import presto.java.JavaDecimalLiteral;
import presto.java.JavaExpression;
import presto.java.JavaExpressionList;
import presto.java.JavaIdentifierExpression;
import presto.java.JavaIntegerLiteral;
import presto.java.JavaItemExpression;
import presto.java.JavaMethodExpression;
import presto.java.JavaNativeCall;
import presto.java.JavaNativeCategoryMapping;
import presto.java.JavaSelectorExpression;
import presto.java.JavaStatement;
import presto.java.JavaTextLiteral;
import presto.javascript.JavaScriptBooleanLiteral;
import presto.javascript.JavaScriptCharacterLiteral;
import presto.javascript.JavaScriptDecimalLiteral;
import presto.javascript.JavaScriptExpression;
import presto.javascript.JavaScriptExpressionList;
import presto.javascript.JavaScriptIdentifierExpression;
import presto.javascript.JavaScriptIntegerLiteral;
import presto.javascript.JavaScriptMethodExpression;
import presto.javascript.JavaScriptModule;
import presto.javascript.JavaScriptNativeCall;
import presto.javascript.JavaScriptNativeCategoryMapping;
import presto.javascript.JavaScriptSelectorExpression;
import presto.javascript.JavaScriptStatement;
import presto.javascript.JavaScriptTextLiteral;
import presto.literal.BooleanLiteral;
import presto.literal.CharacterLiteral;
import presto.literal.DateLiteral;
import presto.literal.DateTimeLiteral;
import presto.literal.DecimalLiteral;
import presto.literal.DictEntry;
import presto.literal.DictEntryList;
import presto.literal.DictLiteral;
import presto.literal.HexaLiteral;
import presto.literal.IntegerLiteral;
import presto.literal.ListLiteral;
import presto.literal.MaxIntegerLiteral;
import presto.literal.MinIntegerLiteral;
import presto.literal.NullLiteral;
import presto.literal.PeriodLiteral;
import presto.literal.RangeLiteral;
import presto.literal.SetLiteral;
import presto.literal.TextLiteral;
import presto.literal.TimeLiteral;
import presto.literal.TupleLiteral;
import presto.parser.EParser.*;
import presto.python.Python2NativeCall;
import presto.python.Python2NativeCategoryMapping;
import presto.python.Python3NativeCall;
import presto.python.Python3NativeCategoryMapping;
import presto.python.PythonArgumentList;
import presto.python.PythonBooleanLiteral;
import presto.python.PythonCharacterLiteral;
import presto.python.PythonDecimalLiteral;
import presto.python.PythonExpression;
import presto.python.PythonIdentifierExpression;
import presto.python.PythonIntegerLiteral;
import presto.python.PythonMethodExpression;
import presto.python.PythonModule;
import presto.python.PythonNamedArgument;
import presto.python.PythonNativeCategoryMapping;
import presto.python.PythonOrdinalArgument;
import presto.python.PythonSelectorExpression;
import presto.python.PythonStatement;
import presto.python.PythonTextLiteral;
import presto.statement.AssignInstanceStatement;
import presto.statement.AssignTupleStatement;
import presto.statement.AssignVariableStatement;
import presto.statement.AtomicSwitchCase;
import presto.statement.BaseSwitchStatement.SwitchCaseList;
import presto.statement.CollectionSwitchCase;
import presto.statement.DeclarationInstruction;
import presto.statement.DoWhileStatement;
import presto.statement.ForEachStatement;
import presto.statement.IStatement;
import presto.statement.IfStatement;
import presto.statement.IfStatement.IfElement;
import presto.statement.IfStatement.IfElementList;
import presto.statement.MethodCall;
import presto.statement.RaiseStatement;
import presto.statement.ReturnStatement;
import presto.statement.StatementList;
import presto.statement.SwitchCase;
import presto.statement.SwitchErrorStatement;
import presto.statement.SwitchStatement;
import presto.statement.UnresolvedCall;
import presto.statement.WhileStatement;
import presto.statement.WithResourceStatement;
import presto.statement.WithSingletonStatement;
import presto.statement.WriteStatement;
import presto.type.AnyType;
import presto.type.BooleanType;
import presto.type.CategoryType;
import presto.type.CharacterType;
import presto.type.CodeType;
import presto.type.DateType;
import presto.type.DecimalType;
import presto.type.DictType;
import presto.type.DocumentType;
import presto.type.IType;
import presto.type.IntegerType;
import presto.type.ListType;
import presto.type.NativeType;
import presto.type.SetType;
import presto.type.TextType;
import presto.type.TimeType;
import presto.utils.AssertionList;
import presto.utils.ExpressionList;
import presto.utils.IdentifierList;

public class EPrestoBuilder extends EParserBaseListener {

	ParseTreeProperty<Object> nodeValues = new ParseTreeProperty<Object>();
	TokenStream input;
	String path = "";

	public EPrestoBuilder(ECleverParser parser) {
		this.input = parser.getTokenStream();
		this.path = parser.getPath();
	}
	
	public void buildSection(ParserRuleContext node, Section section) {
		Token first = findFirstValidToken(node.start.getTokenIndex());
		Token last = findLastValidToken(node.stop.getTokenIndex());
		section.setFrom(path, first, last, Dialect.E);
	}
	
	@Override
	public void exitAbstract_method_declaration(Abstract_method_declarationContext ctx) {
		IType type = this.<IType>getNodeValue(ctx.typ);
		Identifier name = this.<Identifier>getNodeValue(ctx.name);
		ArgumentList args = this.<ArgumentList>getNodeValue(ctx.args);
		setNodeValue(ctx, new AbstractMethodDeclaration(name, args, type));
	}
	
	@Override
	public void exitAbstractMethod(AbstractMethodContext ctx) {
		IDeclaration decl = this.<IDeclaration>getNodeValue(ctx.decl);
		setNodeValue(ctx, decl);
	}

	@Override
	public void exitAddExpression(AddExpressionContext ctx) {
		IExpression left = this.<IExpression>getNodeValue(ctx.left);
		IExpression right = this.<IExpression>getNodeValue(ctx.right);
		IExpression exp = ctx.op.getType()==EParser.PLUS ? new AddExpression(left, right) : new SubtractExpression(left, right);
		setNodeValue(ctx, exp);
	}

	@Override
	public void exitAndExpression(AndExpressionContext ctx) {
		IExpression left = this.<IExpression>getNodeValue(ctx.left);
		IExpression right = this.<IExpression>getNodeValue(ctx.right);
		setNodeValue(ctx, new AndExpression(left, right));
	}
	
	@Override
	public void exitAnyArgumentType(AnyArgumentTypeContext ctx) {
		IType type = this.<IType>getNodeValue(ctx.typ);
		setNodeValue(ctx, type);
	}
	
	@Override
	public void exitAnyDictType(AnyDictTypeContext ctx) {
		IType type = this.<IType>getNodeValue(ctx.typ);
		setNodeValue(ctx, new DictType(type));
	}

	@Override
	public void exitAnyListType(AnyListTypeContext ctx) {
		IType type = this.<IType>getNodeValue(ctx.typ);
		setNodeValue(ctx, new ListType(type));
	}
	
	@Override
	public void exitAnyType(AnyTypeContext ctx) {
		setNodeValue(ctx, AnyType.instance());
	}
	
	@Override
	public void exitArgument_assignment(Argument_assignmentContext ctx) {
		Identifier name = this.<Identifier>getNodeValue(ctx.name);
		IExpression exp = this.<IExpression>getNodeValue(ctx.exp);
		IArgument arg = new UnresolvedArgument(name);
		ArgumentAssignment item = new ArgumentAssignment(arg, exp);
		setNodeValue(ctx, item);
	}

	@Override
	public void exitArgumentAssignmentList(ArgumentAssignmentListContext ctx) {
		ArgumentAssignment item = this.<ArgumentAssignment>getNodeValue(ctx.item);
		ArgumentAssignmentList items = new ArgumentAssignmentList(item);
		setNodeValue(ctx, items);
	}
	
	@Override
	public void exitArgumentAssignmentListExpression(ArgumentAssignmentListExpressionContext ctx) {
		IExpression exp = this.<IExpression>getNodeValue(ctx.exp);
		ArgumentAssignmentList items = this.<ArgumentAssignmentList>getNodeValue(ctx.items);
		if(items==null)
			items = new ArgumentAssignmentList();
		items.add(0, new ArgumentAssignment(null, exp));
		ArgumentAssignment item = this.<ArgumentAssignment>getNodeValue(ctx.item);
		if(item!=null)
			items.add(item);
		setNodeValue(ctx, items);
	}

	@Override
	public void exitArgumentAssignmentListItem(ArgumentAssignmentListItemContext ctx) {
		ArgumentAssignment item = this.<ArgumentAssignment>getNodeValue(ctx.item);
		ArgumentAssignmentList items = this.<ArgumentAssignmentList>getNodeValue(ctx.items);
		items.add(item);
		setNodeValue(ctx, items);
	}

	@Override
	public void exitArgumentAssignmentListNoExpression(ArgumentAssignmentListNoExpressionContext ctx) {
		ArgumentAssignmentList items = this.<ArgumentAssignmentList>getNodeValue(ctx.items);
		ArgumentAssignment item = this.<ArgumentAssignment>getNodeValue(ctx.item);
		if(item!=null)
			items.add(item);
		setNodeValue(ctx, items);
	}
		
	@Override
	public void exitArgumentList(ArgumentListContext ctx) {
		IArgument item = this.<IArgument>getNodeValue(ctx.item); 
		setNodeValue(ctx, new ArgumentList(item));
	}
	
	@Override
	public void exitArgumentListItem(ArgumentListItemContext ctx) {
		ArgumentList items = this.<ArgumentList>getNodeValue(ctx.items); 
		IArgument item = this.<IArgument>getNodeValue(ctx.item); 
		items.add(item);
		setNodeValue(ctx, items);
	}

	@Override
	public void exitAssertion(AssertionContext ctx) {
		IExpression exp = this.<IExpression>getNodeValue(ctx.exp);
		setNodeValue(ctx, new Assertion(exp));
	}
	
	@Override
	public void exitAssertionList(AssertionListContext ctx) {
		Assertion item = this.<Assertion>getNodeValue(ctx.item);
		AssertionList items = new AssertionList(item);
		setNodeValue(ctx, items);
	}
	
	@Override
	public void exitAssertionListItem(AssertionListItemContext ctx) {
		Assertion item = this.<Assertion>getNodeValue(ctx.item);
		AssertionList items = this.<AssertionList>getNodeValue(ctx.items);
		items.add(item);
		setNodeValue(ctx, items);
	}
	
	@Override
	public void exitAssign_instance_statement(Assign_instance_statementContext ctx) {
		IAssignableInstance inst = this.<IAssignableInstance>getNodeValue(ctx.inst);
		IExpression exp = this.<IExpression>getNodeValue(ctx.exp);
		setNodeValue(ctx, new AssignInstanceStatement(inst, exp));
	}
	
	@Override
	public void exitAssign_tuple_statement(Assign_tuple_statementContext ctx) {
		IdentifierList items = this.<IdentifierList>getNodeValue(ctx.items);
		IExpression exp = this.<IExpression>getNodeValue(ctx.exp);
		setNodeValue(ctx, new AssignTupleStatement(items, exp));
	}

	@Override
	public void exitAssign_variable_statement(Assign_variable_statementContext ctx) {
		Identifier name = this.<Identifier>getNodeValue(ctx.name);
		IExpression exp = this.<IExpression>getNodeValue(ctx.exp);
		setNodeValue(ctx, new AssignVariableStatement(name, exp));
	}
	
	@Override
	public void exitAssignInstanceStatement(AssignInstanceStatementContext ctx) {
		IStatement stmt = this.<IStatement>getNodeValue(ctx.stmt);
		setNodeValue(ctx, stmt);
	}

	@Override
	public void exitAssignTupleStatement(AssignTupleStatementContext ctx) {
		IStatement stmt = this.<IStatement>getNodeValue(ctx.stmt);
		setNodeValue(ctx, stmt);
	}
	
	@Override
	public void exitAtomicLiteral(AtomicLiteralContext ctx) {
		IExpression exp = this.<IExpression>getNodeValue(ctx.exp);
		setNodeValue(ctx, exp);
	}

	@Override
	public void exitAtomicSwitchCase(AtomicSwitchCaseContext ctx) {
		IExpression exp = this.<IExpression>getNodeValue(ctx.exp);
		StatementList stmts = this.<StatementList>getNodeValue(ctx.stmts);
		setNodeValue(ctx, new AtomicSwitchCase(exp, stmts));
	}

	@Override
	public void exitAttribute_declaration(Attribute_declarationContext ctx) {
		Identifier name = this.<Identifier>getNodeValue(ctx.name);
		IType type = this.<IType>getNodeValue(ctx.typ);
		IAttributeConstraint match = this.<IAttributeConstraint>getNodeValue(ctx.match);
		setNodeValue(ctx, new AttributeDeclaration(name, type, match));
	}

	@Override
	public void exitAttributeDeclaration(AttributeDeclarationContext ctx) {
		IDeclaration decl = this.<IDeclaration>getNodeValue(ctx.decl);
		setNodeValue(ctx, decl);
	}

	@Override
	public void exitAttributeList(AttributeListContext ctx) {
		Identifier item = this.<Identifier>getNodeValue(ctx.item);
		setNodeValue(ctx, new IdentifierList(item));
	}

	@Override
	public void exitAttributeListItem(AttributeListItemContext ctx) {
		IdentifierList items = this.<IdentifierList>getNodeValue(ctx.items);
		Identifier item = this.<Identifier>getNodeValue(ctx.item);
		items.add(item);
		setNodeValue(ctx, items);
	}

	@Override
	public void exitBooleanLiteral(BooleanLiteralContext ctx) {
		setNodeValue(ctx, new BooleanLiteral(ctx.t.getText()));
	}

	@Override
	public void exitBooleanType(BooleanTypeContext ctx) {
		setNodeValue(ctx, BooleanType.instance());
	}
	
	@Override
	public void exitCastExpression(CastExpressionContext ctx) {
		IExpression exp = this.<IExpression>getNodeValue(ctx.left);
		IType type = this.<IType>getNodeValue(ctx.right);
		setNodeValue(ctx, new CastExpression(exp, type));
	}
	
	@Override
	public void exitCatchAtomicStatement(CatchAtomicStatementContext ctx) {
		Identifier name = this.<Identifier>getNodeValue(ctx.name);
		StatementList stmts = this.<StatementList>getNodeValue(ctx.stmts);
		setNodeValue(ctx, new AtomicSwitchCase(new SymbolExpression(name), stmts));
	}

	@Override
	public void exitCatchCollectionStatement(CatchCollectionStatementContext ctx) {
		IExpression exp = this.<IExpression>getNodeValue(ctx.exp);
		StatementList stmts = this.<StatementList>getNodeValue(ctx.stmts);
		setNodeValue(ctx, new CollectionSwitchCase(exp, stmts));
	}
	
	@Override
	public void exitCatchStatementList(CatchStatementListContext ctx) {
		SwitchCase item = this.<SwitchCase>getNodeValue(ctx.item);
		setNodeValue(ctx, new SwitchCaseList(item));
	}
	
	@Override
	public void exitCatchStatementListItem(CatchStatementListItemContext ctx) {
		SwitchCase item = this.<SwitchCase>getNodeValue(ctx.item);
		SwitchCaseList items = this.<SwitchCaseList>getNodeValue(ctx.items);
		items.add(item);
		setNodeValue(ctx, items);
	}
	
	@Override
	public void exitCategory_symbol(Category_symbolContext ctx) {
		Identifier name = this.<Identifier>getNodeValue(ctx.name);
		ArgumentAssignmentList args = this.<ArgumentAssignmentList>getNodeValue(ctx.args);
		ArgumentAssignment arg = this.<ArgumentAssignment>getNodeValue(ctx.arg);
		if(arg!=null)
			args.add(arg);
		setNodeValue(ctx, new CategorySymbol(name, args));
	}
	
	@Override
	public void exitCategory_type(Category_typeContext ctx) {
		Identifier name = new Identifier(ctx.getText());
		setNodeValue(ctx, new CategoryType(name));
	}

	@Override
	public void exitCategoryArgumentType(CategoryArgumentTypeContext ctx) {
		IType type = this.<IType>getNodeValue(ctx.typ);
		setNodeValue(ctx, type);
	}

	@Override
	public void exitCategoryDeclaration(CategoryDeclarationContext ctx) {
		IDeclaration decl = this.<IDeclaration>getNodeValue(ctx.decl);
		setNodeValue(ctx, decl);
	}

	@Override
	public void exitCategoryMethodList(CategoryMethodListContext ctx) {
		ICategoryMethodDeclaration item = this.<ICategoryMethodDeclaration>getNodeValue(ctx.item);
		CategoryMethodDeclarationList items = new CategoryMethodDeclarationList(item);
		setNodeValue(ctx, items);
	}

	@Override
	public void exitCategoryMethodListItem(CategoryMethodListItemContext ctx) {
		ICategoryMethodDeclaration item = this.<ICategoryMethodDeclaration>getNodeValue(ctx.item);
		CategoryMethodDeclarationList items = this.<CategoryMethodDeclarationList>getNodeValue(ctx.items);
		items.add(item);
		setNodeValue(ctx, items);
	}

	@Override
	public void exitCategorySymbolList(CategorySymbolListContext ctx) {
		CategorySymbol item = this.<CategorySymbol>getNodeValue(ctx.item);
		setNodeValue(ctx, new CategorySymbolList(item));
	}

	@Override
	public void exitCategorySymbolListItem(CategorySymbolListItemContext ctx) {
		CategorySymbol item = this.<CategorySymbol>getNodeValue(ctx.item);
		CategorySymbolList items = this.<CategorySymbolList>getNodeValue(ctx.items);
		items.add(item);
		setNodeValue(ctx, items);
	}

	@Override
	public void exitCategoryType(CategoryTypeContext ctx) {
		IType type = this.<IType>getNodeValue(ctx.c);
		setNodeValue(ctx, type);
	}
	
	@Override
	public void exitCharacterLiteral(CharacterLiteralContext ctx) {
		setNodeValue(ctx, new CharacterLiteral(ctx.t.getText()));
	}

	@Override
	public void exitCharacterType(CharacterTypeContext ctx) {
		setNodeValue(ctx, CharacterType.instance());
	}

	@Override
	public void exitChildInstance(ChildInstanceContext ctx) {
		IAssignableInstance parent = this.<IAssignableInstance>getNodeValue(ctx.parent);
		IAssignableSelector child = this.<IAssignableSelector>getNodeValue(ctx.child);
		child.setParent(parent);
		setNodeValue(ctx, child);
	}

	@Override
	public void exitClosureExpression(ClosureExpressionContext ctx) {
		Identifier name = this.<Identifier>getNodeValue(ctx.name);
		setNodeValue(ctx, new MethodExpression(name));
	}

	@Override
	public void exitClosureStatement(ClosureStatementContext ctx) {
		ConcreteMethodDeclaration decl = this.<ConcreteMethodDeclaration>getNodeValue(ctx.decl);
		setNodeValue(ctx, new DeclarationInstruction<ConcreteMethodDeclaration>(decl));
	}
	
	@Override
	public void exitCode_argument(Code_argumentContext ctx) {
		Identifier name = this.<Identifier>getNodeValue(ctx.name);
		setNodeValue(ctx, new CodeArgument(name));
	}

	@Override
	public void exitCode_type(Code_typeContext ctx) {
		setNodeValue(ctx, CodeType.instance());
	}

	@Override
	public void exitCodeArgument(CodeArgumentContext ctx) {
		IArgument arg = this.<IArgument>getNodeValue(ctx.arg);
		setNodeValue(ctx, arg);
	}
	
	@Override
	public void exitCodeExpression(CodeExpressionContext ctx) {
		IExpression exp = this.<IExpression>getNodeValue(ctx.exp);
		setNodeValue(ctx, new CodeExpression(exp));
	}

	@Override
	public void exitCodeType(CodeTypeContext ctx) {
		setNodeValue(ctx, CodeType.instance());
	}

	@Override
	public void exitCollectionLiteral(CollectionLiteralContext ctx) {
		IExpression exp = this.<IExpression>getNodeValue(ctx.exp);
		setNodeValue(ctx, exp);
	}

	@Override
	public void exitCollectionSwitchCase(CollectionSwitchCaseContext ctx) {
		IExpression exp = this.<IExpression>getNodeValue(ctx.exp);
		StatementList stmts = this.<StatementList>getNodeValue(ctx.stmts);
		setNodeValue(ctx, new CollectionSwitchCase(exp, stmts));
	}

	@Override
	public void exitConcrete_category_declaration(Concrete_category_declarationContext ctx) {
		Identifier name = this.<Identifier>getNodeValue(ctx.name);
		IdentifierList attrs = this.<IdentifierList>getNodeValue(ctx.attrs);
		IdentifierList derived = this.<IdentifierList>getNodeValue(ctx.derived);
		CategoryMethodDeclarationList methods = this.<CategoryMethodDeclarationList>getNodeValue(ctx.methods);
		setNodeValue(ctx, new ConcreteCategoryDeclaration(name, attrs, derived, methods));
	}

	@Override
	public void exitConcrete_method_declaration(Concrete_method_declarationContext ctx) {
		IType type = this.<IType>getNodeValue(ctx.typ);
		Identifier name = this.<Identifier>getNodeValue(ctx.name);
		ArgumentList args = this.<ArgumentList>getNodeValue(ctx.args);
		StatementList stmts = this.<StatementList>getNodeValue(ctx.stmts);
		setNodeValue(ctx, new ConcreteMethodDeclaration(name, args, type, stmts));
	}

	@Override
	public void exitConcreteCategoryDeclaration(ConcreteCategoryDeclarationContext ctx) {
		ConcreteCategoryDeclaration decl = this.<ConcreteCategoryDeclaration>getNodeValue(ctx.decl);
		setNodeValue(ctx, decl);
	}

	@Override
	public void exitConcreteMethod(ConcreteMethodContext ctx) {
		IDeclaration decl = this.<IDeclaration>getNodeValue(ctx.decl);
		setNodeValue(ctx, decl);
	}

	@Override
	public void exitConstructorExpression(ConstructorExpressionContext ctx) {
		IExpression exp = this.<IExpression>getNodeValue(ctx.exp);
		setNodeValue(ctx, exp);
	}

	@Override
	public void exitConstructorFrom(ConstructorFromContext ctx) {
		boolean mutable = ctx.MUTABLE()!=null;
		CategoryType type = this.<CategoryType>getNodeValue(ctx.typ);
		ArgumentAssignmentList args = this.<ArgumentAssignmentList>getNodeValue(ctx.args);
		if(args==null)
			args = new ArgumentAssignmentList();
		IExpression firstArg = this.<IExpression>getNodeValue(ctx.firstArg);
		args.add(0, new ArgumentAssignment(null, firstArg));
		ArgumentAssignment arg = this.<ArgumentAssignment>getNodeValue(ctx.arg);
		if(arg!=null)
			args.add(arg);
		setNodeValue(ctx, new ConstructorExpression(type, mutable, args));
	}
	
	@Override
	public void exitConstructorNoFrom(ConstructorNoFromContext ctx) {
		boolean mutable = ctx.MUTABLE()!=null;
		CategoryType type = this.<CategoryType>getNodeValue(ctx.typ);
		ArgumentAssignmentList args = this.<ArgumentAssignmentList>getNodeValue(ctx.args);
		if(args==null)
			args = new ArgumentAssignmentList();
		ArgumentAssignment arg = this.<ArgumentAssignment>getNodeValue(ctx.arg);
		if(arg!=null)
			args.add(arg);
		setNodeValue(ctx, new ConstructorExpression(type, mutable, args));
	}
	
	@Override
	public void exitContainsAllExpression(ContainsAllExpressionContext ctx) {
		IExpression left = this.<IExpression>getNodeValue(ctx.left);
		IExpression right = this.<IExpression>getNodeValue(ctx.right);
		setNodeValue(ctx, new ContainsExpression(left, ContOp.CONTAINS_ALL, right));
	}
	
	@Override
	public void exitContainsAnyExpression(ContainsAnyExpressionContext ctx) {
		IExpression left = this.<IExpression>getNodeValue(ctx.left);
		IExpression right = this.<IExpression>getNodeValue(ctx.right);
		setNodeValue(ctx, new ContainsExpression(left, ContOp.CONTAINS_ANY, right));
	}
	
	@Override
	public void exitContainsExpression(ContainsExpressionContext ctx) {
		IExpression left = this.<IExpression>getNodeValue(ctx.left);
		IExpression right = this.<IExpression>getNodeValue(ctx.right);
		setNodeValue(ctx, new ContainsExpression(left, ContOp.CONTAINS, right));
	}
	
	@Override
	public void exitCsharp_identifier(Csharp_identifierContext ctx) {
		setNodeValue(ctx, ctx.getText());
	}
	
	@Override
	public void exitCsharp_method_expression(Csharp_method_expressionContext ctx) {
		String name = this.<String>getNodeValue(ctx.name);
		CSharpExpressionList args = this.<CSharpExpressionList>getNodeValue(ctx.args);
		setNodeValue(ctx, new CSharpMethodExpression(name, args));
	}
	
	@Override
	public void exitCSharpArgumentList(CSharpArgumentListContext ctx) {
		CSharpExpression item = this.<CSharpExpression>getNodeValue(ctx.item);
		setNodeValue(ctx, new CSharpExpressionList(item));
	}
	
	@Override
	public void exitCSharpArgumentListItem(CSharpArgumentListItemContext ctx) {
		CSharpExpression item = this.<CSharpExpression>getNodeValue(ctx.item);
		CSharpExpressionList items = this.<CSharpExpressionList>getNodeValue(ctx.items);
		items.add(item);
		setNodeValue(ctx, items);
	}
	
	@Override
	public void exitCSharpBooleanLiteral(CSharpBooleanLiteralContext ctx) {
		setNodeValue(ctx, new CSharpBooleanLiteral(ctx.getText()));
	}
	
	@Override
	public void exitCSharpCategoryMapping(CSharpCategoryMappingContext ctx) {
		CSharpIdentifierExpression map = this.<CSharpIdentifierExpression>getNodeValue(ctx.mapping);
		setNodeValue(ctx, new CSharpNativeCategoryMapping(map));
	}
	
	@Override
	public void exitCSharpCharacterLiteral(CSharpCharacterLiteralContext ctx) {
		setNodeValue(ctx, new CSharpCharacterLiteral(ctx.getText()));
	}
	
	@Override
	public void exitCSharpChildIdentifier(CSharpChildIdentifierContext ctx) {
		CSharpIdentifierExpression parent = this.<CSharpIdentifierExpression>getNodeValue(ctx.parent);
		String name = this.<String>getNodeValue(ctx.name);
		CSharpIdentifierExpression child = new CSharpIdentifierExpression(parent, name);
		setNodeValue(ctx, child);
	}
	
	@Override
	public void exitCSharpDecimalLiteral(CSharpDecimalLiteralContext ctx) {
		setNodeValue(ctx, new CSharpDecimalLiteral(ctx.getText()));
	}
	
	@Override
	public void exitCSharpIdentifier(CSharpIdentifierContext ctx) {
		String name = this.<String>getNodeValue(ctx.name);
		setNodeValue(ctx, new CSharpIdentifierExpression(name));
	}
	
	
	@Override
	public void exitCSharpIdentifierExpression(CSharpIdentifierExpressionContext ctx) {
		CSharpIdentifierExpression exp = this.<CSharpIdentifierExpression>getNodeValue(ctx.exp);
		setNodeValue(ctx, exp);
	}
	
	@Override
	public void exitCSharpIntegerLiteral(CSharpIntegerLiteralContext ctx) {
		setNodeValue(ctx, new CSharpIntegerLiteral(ctx.getText()));
	}
	
	@Override
	public void exitCSharpLiteralExpression(CSharpLiteralExpressionContext ctx) {
		CSharpExpression exp = this.<CSharpExpression>getNodeValue(ctx.exp);
		setNodeValue(ctx, exp);
	}
	
	@Override
	public void exitCSharpMethodExpression(CSharpMethodExpressionContext ctx) {
		CSharpExpression exp = this.<CSharpExpression>getNodeValue(ctx.exp);
		setNodeValue(ctx, exp);
	}
	
	@Override
	public void exitCSharpNativeStatement(CSharpNativeStatementContext ctx) {
		CSharpStatement stmt = this.<CSharpStatement>getNodeValue(ctx.stmt);
		setNodeValue(ctx, new CSharpNativeCall(stmt));
	}
	
	public void exitCSharpPrestoIdentifier(CSharpPrestoIdentifierContext ctx) {
		String name = ctx.DOLLAR_IDENTIFIER().getText();
		setNodeValue(ctx, new CSharpIdentifierExpression(name));
	};
	
	@Override
	public void exitCSharpPrimaryExpression(CSharpPrimaryExpressionContext ctx) {
		CSharpExpression exp = this.<CSharpExpression>getNodeValue(ctx.exp);
		setNodeValue(ctx, exp);
	}
	
	@Override
	public void exitCSharpReturnStatement(CSharpReturnStatementContext ctx) {
		CSharpExpression exp = this.<CSharpExpression>getNodeValue(ctx.exp);
		setNodeValue(ctx, new CSharpStatement(exp,true));
	}
	
	@Override
	public void exitCSharpSelectorExpression(CSharpSelectorExpressionContext ctx) {
		CSharpExpression parent = this.<CSharpExpression>getNodeValue(ctx.parent);
		CSharpSelectorExpression child = this.<CSharpSelectorExpression>getNodeValue(ctx.child);
		child.setParent(parent);
		setNodeValue(ctx, child);
	}
	
	@Override
	public void exitCSharpStatement(CSharpStatementContext ctx) {
		CSharpExpression exp = this.<CSharpExpression>getNodeValue(ctx.exp);
		setNodeValue(ctx, new CSharpStatement(exp,false));
	}
	
	@Override
	public void exitCSharpTextLiteral(CSharpTextLiteralContext ctx) {
		setNodeValue(ctx, new CSharpTextLiteral(ctx.getText()));
	}
	
	@Override
	public void exitDateLiteral(DateLiteralContext ctx) {
		setNodeValue(ctx, new DateLiteral(ctx.t.getText()));
	}
	
	@Override
	public void exitDateTimeLiteral(DateTimeLiteralContext ctx) {
		setNodeValue(ctx, new DateTimeLiteral(ctx.t.getText()));
	}

	@Override
	public void exitDateTimeType(DateTimeTypeContext ctx) {
		setNodeValue(ctx, TextType.instance());
	}
	
	@Override
	public void exitDateType(DateTypeContext ctx) {
		setNodeValue(ctx, DateType.instance());
	}
	
	@Override
	public void exitDecimalLiteral(DecimalLiteralContext ctx) {
		setNodeValue(ctx, new DecimalLiteral(ctx.t.getText()));
	}
	
	@Override
	public void exitDecimalType(DecimalTypeContext ctx) {
		setNodeValue(ctx, DecimalType.instance());
	}
	
	@Override
	public void exitDeclarationList(DeclarationListContext ctx) {
		IDeclaration item = this.<IDeclaration>getNodeValue(ctx.item);
		DeclarationList items = new DeclarationList(item);
		setNodeValue(ctx, items);
	}
	
	@Override
	public void exitDeclarationListItem(DeclarationListItemContext ctx) {
		IDeclaration item = this.<IDeclaration>getNodeValue(ctx.item);
		DeclarationList items = this.<DeclarationList>getNodeValue(ctx.items);
		items.add(item);
		setNodeValue(ctx, items);
	}
	
	@Override
	public void exitDerivedList(DerivedListContext ctx) {
		IdentifierList items = this.<IdentifierList>getNodeValue(ctx.items);
		setNodeValue(ctx, items);
	}
	
	@Override
	public void exitDerivedListItem(DerivedListItemContext ctx) {
		IdentifierList items = this.<IdentifierList>getNodeValue(ctx.items);
		Identifier item = this.<Identifier>getNodeValue(ctx.item);
		items.add(item);
		setNodeValue(ctx, items);
	}
	
	@Override
	public void exitDict_entry(Dict_entryContext ctx) {
		IExpression key = this.<IExpression>getNodeValue(ctx.key);
		IExpression value = this.<IExpression>getNodeValue(ctx.value);
		DictEntry entry = new DictEntry(key, value);
		setNodeValue(ctx, entry);
	}
	
	@Override
	public void exitDict_literal(Dict_literalContext ctx) {
		DictEntryList items = this.<DictEntryList>getNodeValue(ctx.items);
		IExpression value = items==null ? new DictLiteral() : new DictLiteral(items);
		setNodeValue(ctx, value);
	}
	
	@Override
	public void exitDictEntryList(DictEntryListContext ctx) {
		DictEntry item = this.<DictEntry>getNodeValue(ctx.item);
		setNodeValue(ctx, new DictEntryList(item));
	}
	
	@Override
	public void exitDictEntryListItem(DictEntryListItemContext ctx) {
		DictEntryList items = this.<DictEntryList>getNodeValue(ctx.items);
		DictEntry item = this.<DictEntry>getNodeValue(ctx.item);
		items.add(item);
		setNodeValue(ctx, items);
	}
	

	@Override
	public void exitDictLiteral(DictLiteralContext ctx) {
		IExpression exp = this.<IExpression>getNodeValue(ctx.exp);
		setNodeValue(ctx, exp);
	}
	
	@Override
	public void exitDictType(DictTypeContext ctx) {
		IType type = this.<IType>getNodeValue(ctx.d);
		setNodeValue(ctx, new DictType(type));
	}
	
	@Override
	public void exitDivideExpression(DivideExpressionContext ctx) {
		IExpression left = this.<IExpression>getNodeValue(ctx.left);
		IExpression right = this.<IExpression>getNodeValue(ctx.right);
		setNodeValue(ctx, new DivideExpression(left, right));
	}
	
	@Override
	public void exitDo_while_statement(Do_while_statementContext ctx) {
		IExpression exp = this.<IExpression>getNodeValue(ctx.exp);
		StatementList stmts = this.<StatementList>getNodeValue(ctx.stmts);
		setNodeValue(ctx, new DoWhileStatement(exp, stmts));
	}
	
	@Override
	public void exitDocument_expression(Document_expressionContext ctx) {
		setNodeValue(ctx, new DocumentExpression());
	}
	
	@Override
	public void exitDocument_type(Document_typeContext ctx) {
		setNodeValue(ctx, DocumentType.instance());
	}
	
	@Override
	public void exitDocumentExpression(DocumentExpressionContext ctx) {
		IExpression exp = this.<IExpression>getNodeValue(ctx.exp);
		setNodeValue(ctx, exp);
	}
	
	@Override
	public void exitDoWhileStatement(DoWhileStatementContext ctx) {
		IStatement stmt = this.<IStatement>getNodeValue(ctx.stmt);
		setNodeValue(ctx, stmt);
	}
	
	@Override
	public void exitElseIfStatementList(ElseIfStatementListContext ctx) {
		IExpression exp = this.<IExpression>getNodeValue(ctx.exp);
		StatementList stmts = this.<StatementList>getNodeValue(ctx.stmts);
		IfElement elem = new IfElement(exp, stmts);
		setNodeValue(ctx, new IfElementList(elem));
	}
	
	@Override
	public void exitElseIfStatementListItem(ElseIfStatementListItemContext ctx) {
		IfElementList items = this.<IfElementList>getNodeValue(ctx.items);
		IExpression exp = this.<IExpression>getNodeValue(ctx.exp);
		StatementList stmts = this.<StatementList>getNodeValue(ctx.stmts);
		IfElement elem = new IfElement(exp, stmts);
		items.add(elem);
		setNodeValue(ctx, items);
	}
	
	@Override
	public void exitEnum_category_declaration(Enum_category_declarationContext ctx) {
		Identifier name = this.<Identifier>getNodeValue(ctx.name);
		IdentifierList attrs = this.<IdentifierList>getNodeValue(ctx.attrs);
		Identifier parent = this.<Identifier>getNodeValue(ctx.derived);
		IdentifierList derived = parent==null ? null : new IdentifierList(parent);
		CategorySymbolList symbols = this.<CategorySymbolList>getNodeValue(ctx.symbols);
		setNodeValue(ctx, new EnumeratedCategoryDeclaration(name, attrs, derived, symbols));
	}
	
	@Override
	public void exitEnum_native_declaration(Enum_native_declarationContext ctx) {
		Identifier name = this.<Identifier>getNodeValue(ctx.name);
		NativeType type = this.<NativeType>getNodeValue(ctx.typ);
		NativeSymbolList symbols = this.<NativeSymbolList>getNodeValue(ctx.symbols);
		setNodeValue(ctx, new EnumeratedNativeDeclaration(name, type, symbols));
	}
	
	@Override
	public void exitEnumCategoryDeclaration(EnumCategoryDeclarationContext ctx) {
		IDeclaration decl = this.<IDeclaration>getNodeValue(ctx.decl);
		setNodeValue(ctx, decl);
	}
	
	@Override
	public void exitEnumDeclaration(EnumDeclarationContext ctx) {
		IDeclaration decl = this.<IDeclaration>getNodeValue(ctx.decl);
		setNodeValue(ctx, decl);
	}
	
	@Override
	public void exitEnumNativeDeclaration(EnumNativeDeclarationContext ctx) {
		IDeclaration decl = this.<IDeclaration>getNodeValue(ctx.decl);
		setNodeValue(ctx, decl);
	}
	
	@Override
	public void exitEqualsExpression(EqualsExpressionContext ctx) {
		IExpression left = this.<IExpression>getNodeValue(ctx.left);
		IExpression right = this.<IExpression>getNodeValue(ctx.right);
		setNodeValue(ctx, new EqualsExpression(left, EqOp.EQUALS, right));
	}
	
	@Override
	public void exitExecuteExpression(ExecuteExpressionContext ctx) {
		Identifier name = this.<Identifier>getNodeValue(ctx.name);
		setNodeValue(ctx, new ExecuteExpression(name));
	}
	
	@Override
	public void exitFetch_expression(Fetch_expressionContext ctx) {
		Identifier itemName = this.<Identifier>getNodeValue(ctx.name);
		IExpression source = this.<IExpression>getNodeValue(ctx.source);
		IExpression filter = this.<IExpression>getNodeValue(ctx.xfilter);
		setNodeValue(ctx, new FetchExpression(itemName, source, filter));
	}
	
	@Override
	public void exitFetchExpression(FetchExpressionContext ctx) {
		IExpression exp = this.<IExpression>getNodeValue(ctx.exp);
		setNodeValue(ctx, exp);
	}
	
	@Override
	public void exitFor_each_statement(For_each_statementContext ctx) {
		Identifier name1 = this.<Identifier>getNodeValue(ctx.name1);
		Identifier name2 = this.<Identifier>getNodeValue(ctx.name2);
		IExpression source = this.<IExpression>getNodeValue(ctx.source);
		StatementList stmts = this.<StatementList>getNodeValue(ctx.stmts);
		setNodeValue(ctx, new ForEachStatement(name1, name2, source, stmts));
	}

	@Override
	public void exitForEachStatement(ForEachStatementContext ctx) {
		IStatement stmt = this.<IStatement>getNodeValue(ctx.stmt);
		setNodeValue(ctx, stmt);
	}
	
	@Override
	public void exitFull_argument_list(Full_argument_listContext ctx) {
		ArgumentList items = this.<ArgumentList>getNodeValue(ctx.items); 
		IArgument item = this.<IArgument>getNodeValue(ctx.item); 
		if(item!=null)
			items.add(item);
		setNodeValue(ctx, items);
	}
	
	@Override
	public void exitFullDeclarationList(FullDeclarationListContext ctx) {
		DeclarationList items = this.<DeclarationList>getNodeValue(ctx.items);
		if(items==null)
			items = new DeclarationList();
		setNodeValue(ctx, items);
	}
	
	@Override
	public void exitGetter_method_declaration(Getter_method_declarationContext ctx) {
		Identifier name = this.<Identifier>getNodeValue(ctx.name);
		StatementList stmts = this.<StatementList>getNodeValue(ctx.stmts);
		setNodeValue(ctx, new GetterMethodDeclaration(name, stmts));
	}

	@Override
	public void exitGetterMemberMethod(GetterMemberMethodContext ctx) {
		IDeclaration decl = this.<IDeclaration>getNodeValue(ctx.decl);
		setNodeValue(ctx, decl);
	}
	
	@Override
	public void exitGreaterThanExpression(GreaterThanExpressionContext ctx) {
		IExpression left = this.<IExpression>getNodeValue(ctx.left);
		IExpression right = this.<IExpression>getNodeValue(ctx.right);
		setNodeValue(ctx, new CompareExpression(left, CmpOp.GT, right));
	}
	
	@Override
	public void exitGreaterThanOrEqualExpression(GreaterThanOrEqualExpressionContext ctx) {
		IExpression left = this.<IExpression>getNodeValue(ctx.left);
		IExpression right = this.<IExpression>getNodeValue(ctx.right);
		setNodeValue(ctx, new CompareExpression(left, CmpOp.GTE, right));
	}
	
	@Override
	public void exitHexadecimalLiteral(HexadecimalLiteralContext ctx) {
		setNodeValue(ctx, new HexaLiteral(ctx.t.getText()));
	}
	
	@Override
	public void exitIdentifierExpression(IdentifierExpressionContext ctx) {
		Identifier name = this.<Identifier>getNodeValue(ctx.exp);
		setNodeValue(ctx, new UnresolvedIdentifier(name));
	}
	
	@Override
	public void exitIf_statement(If_statementContext ctx) {
		IExpression exp = this.<IExpression>getNodeValue(ctx.exp);
		StatementList stmts = this.<StatementList>getNodeValue(ctx.stmts);
		IfElementList elseIfs = this.<IfElementList>getNodeValue(ctx.elseIfs);
		StatementList elseStmts = this.<StatementList>getNodeValue(ctx.elseStmts);
		setNodeValue(ctx, new IfStatement(exp, stmts, elseIfs, elseStmts));
	}
	
	@Override
	public void exitIfStatement(IfStatementContext ctx) {
		IStatement stmt = this.<IStatement>getNodeValue(ctx.stmt);
		setNodeValue(ctx, stmt);
	}
	
	@Override
	public void exitInExpression(InExpressionContext ctx) {
		IExpression left = this.<IExpression>getNodeValue(ctx.left);
		IExpression right = this.<IExpression>getNodeValue(ctx.right);
		setNodeValue(ctx, new ContainsExpression(left, ContOp.IN, right));
	}
	
	@Override
	public void exitInstanceExpression(InstanceExpressionContext ctx) {
		IExpression exp = this.<IExpression>getNodeValue(ctx.exp);
		setNodeValue(ctx, exp);
	}
	
	@Override
	public void exitIntDivideExpression(IntDivideExpressionContext ctx) {
		IExpression left = this.<IExpression>getNodeValue(ctx.left);
		IExpression right = this.<IExpression>getNodeValue(ctx.right);
		setNodeValue(ctx, new IntDivideExpression(left, right));
	}
	
	@Override
	public void exitIntegerLiteral(IntegerLiteralContext ctx) {
		setNodeValue(ctx, new IntegerLiteral(ctx.t.getText()));
	}
	
	@Override
	public void exitIntegerType(IntegerTypeContext ctx) {
		setNodeValue(ctx, IntegerType.instance());
	}
	
	@Override
	public void exitInvocation_expression(Invocation_expressionContext ctx) {
		Identifier name = this.<Identifier>getNodeValue(ctx.name);
		MethodSelector select = new MethodSelector(name);
		setNodeValue(ctx, new MethodCall(select));
	}
	
	@Override
	public void exitInvocationExpression(InvocationExpressionContext ctx) {
		IExpression exp = this.<IExpression>getNodeValue(ctx.exp);
		setNodeValue(ctx, exp);
	}
	
	
	@Override
	public void exitInvokeStatement(InvokeStatementContext ctx) {
		IStatement exp = this.<IStatement>getNodeValue(ctx.exp);
		setNodeValue(ctx, exp);
	}
	
	@Override
	public void exitIsATypeExpression(IsATypeExpressionContext ctx) {
		IType type = this.<IType>getNodeValue(ctx.typ);
		IExpression exp = new TypeExpression(type);
		setNodeValue(ctx, exp);
	}
	
	@Override
	public void exitIsOtherExpression(IsOtherExpressionContext ctx) {
		IExpression exp = this.<IExpression>getNodeValue(ctx.exp);
		setNodeValue(ctx, exp);
	}
	
	@Override
	public void exitIsExpression(IsExpressionContext ctx) {
		IExpression left = this.<IExpression>getNodeValue(ctx.left);
		IExpression right = this.<IExpression>getNodeValue(ctx.right);
		EqOp op = right instanceof TypeExpression ? EqOp.IS_A : EqOp.IS;
		setNodeValue(ctx, new EqualsExpression(left, op, right));
	}
	
	@Override
	public void exitIsNotExpression(IsNotExpressionContext ctx) {
		IExpression left = this.<IExpression>getNodeValue(ctx.left);
		IExpression right = this.<IExpression>getNodeValue(ctx.right);
		EqOp op = right instanceof TypeExpression ? EqOp.IS_NOT_A : EqOp.IS_NOT;
		setNodeValue(ctx, new EqualsExpression(left, op, right));
	}

	@Override
	public void exitItemInstance(ItemInstanceContext ctx) {
		IExpression exp = this.<IExpression>getNodeValue(ctx.exp);
		setNodeValue(ctx, new ItemInstance(exp));
	}
	
	@Override
	public void exitItemSelector(ItemSelectorContext ctx) {
		IExpression exp = this.<IExpression>getNodeValue(ctx.exp);
		setNodeValue(ctx, new ItemSelector(exp));
	}
	
	@Override
	public void exitJava_identifier(Java_identifierContext ctx) {
		setNodeValue(ctx, ctx.getText());
	}
	
	@Override
	public void exitJava_item_expression(Java_item_expressionContext ctx) {
		JavaExpression exp = this.<JavaExpression>getNodeValue(ctx.exp);
		setNodeValue(ctx, new JavaItemExpression(exp));
	}
	
	@Override
	public void exitJava_method_expression(Java_method_expressionContext ctx) {
		String name = this.<String>getNodeValue(ctx.name);
		JavaExpressionList args = this.<JavaExpressionList>getNodeValue(ctx.args);
		setNodeValue(ctx, new JavaMethodExpression(name, args));
	}
	
	@Override
	public void exitJava_parenthesis_expression(Java_parenthesis_expressionContext ctx) {
		JavaExpression exp = this.<JavaExpression>getNodeValue(ctx.exp);
		setNodeValue(ctx, exp);
	}
	
	@Override
	public void exitJavaArgumentList(JavaArgumentListContext ctx) {
		JavaExpression item = this.<JavaExpression>getNodeValue(ctx.item);
		setNodeValue(ctx, new JavaExpressionList(item));
	}
	
	@Override
	public void exitJavaArgumentListItem(JavaArgumentListItemContext ctx) {
		JavaExpression item = this.<JavaExpression>getNodeValue(ctx.item);
		JavaExpressionList items = this.<JavaExpressionList>getNodeValue(ctx.items);
		items.add(item);
		setNodeValue(ctx, items);
	}
	
	@Override
	public void exitJavaBooleanLiteral(JavaBooleanLiteralContext ctx) {
		setNodeValue(ctx, new JavaBooleanLiteral(ctx.getText()));
	}
	
	@Override
	public void exitJavaCategoryMapping(JavaCategoryMappingContext ctx) {
		JavaIdentifierExpression map = this.<JavaIdentifierExpression>getNodeValue(ctx.mapping);
		setNodeValue(ctx, new JavaNativeCategoryMapping(map));
	}
	
	@Override
	public void exitJavaCharacterLiteral(JavaCharacterLiteralContext ctx) {
		setNodeValue(ctx, new JavaCharacterLiteral(ctx.getText()));
	}
	
	@Override
	public void exitJavaChildClassIdentifier(JavaChildClassIdentifierContext ctx) {
		JavaIdentifierExpression parent = this.<JavaIdentifierExpression>getNodeValue(ctx.parent);
		JavaIdentifierExpression child = new JavaIdentifierExpression(parent, ctx.name.getText());
		setNodeValue(ctx, child);
	}
	
	@Override
	public void exitJavaChildIdentifier(JavaChildIdentifierContext ctx) {
		JavaIdentifierExpression parent = this.<JavaIdentifierExpression>getNodeValue(ctx.parent);
		String name = this.<String>getNodeValue(ctx.name);
		JavaIdentifierExpression child = new JavaIdentifierExpression(parent, name);
		setNodeValue(ctx, child);
	}
	
	@Override
	public void exitJavaClassIdentifier(JavaClassIdentifierContext ctx) {
		JavaIdentifierExpression klass = this.<JavaIdentifierExpression>getNodeValue(ctx.klass);
		setNodeValue(ctx, klass);
	}
	
	@Override
	public void exitJavaDecimalLiteral(JavaDecimalLiteralContext ctx) {
		setNodeValue(ctx, new JavaDecimalLiteral(ctx.getText()));
	}
	
	@Override
	public void exitJavaIdentifier(JavaIdentifierContext ctx) {
		String name = this.<String>getNodeValue(ctx.name);
		setNodeValue(ctx, new JavaIdentifierExpression(name));
	}
	
	@Override
	public void exitJavaIdentifierExpression(JavaIdentifierExpressionContext ctx) {
		JavaExpression exp = this.<JavaIdentifierExpression>getNodeValue(ctx.exp);
		setNodeValue(ctx, exp);
	}
	
	@Override
	public void exitJavaIntegerLiteral(JavaIntegerLiteralContext ctx) {
		setNodeValue(ctx, new JavaIntegerLiteral(ctx.getText()));
	}
	
	@Override
	public void exitJavaItemExpression(JavaItemExpressionContext ctx) {
		JavaExpression exp = this.<JavaExpression>getNodeValue(ctx.exp);
		setNodeValue(ctx, exp);
	}

	@Override
	public void exitJavaLiteralExpression(JavaLiteralExpressionContext ctx) {
		JavaExpression exp = this.<JavaExpression>getNodeValue(ctx.exp);
		setNodeValue(ctx, exp);
	}
	
	@Override
	public void exitJavaMethodExpression(JavaMethodExpressionContext ctx) {
		JavaExpression exp = this.<JavaExpression>getNodeValue(ctx.exp);
		setNodeValue(ctx, exp);
	}
	
	@Override
	public void exitJavaNativeStatement(JavaNativeStatementContext ctx) {
		JavaStatement stmt = this.<JavaStatement>getNodeValue(ctx.stmt);
		setNodeValue(ctx, new JavaNativeCall(stmt));
	}
	
	@Override
	public void exitJavaParenthesisExpression(JavaParenthesisExpressionContext ctx) {
		JavaExpression exp = this.<JavaExpression>getNodeValue(ctx.exp);
		setNodeValue(ctx, exp);
	}
	
	@Override
	public void exitJavaPrimaryExpression(JavaPrimaryExpressionContext ctx) {
		JavaExpression exp = this.<JavaExpression>getNodeValue(ctx.exp);
		setNodeValue(ctx, exp);
	}
	
	@Override
	public void exitJavaReturnStatement(JavaReturnStatementContext ctx) {
		JavaExpression exp = this.<JavaExpression>getNodeValue(ctx.exp);
		setNodeValue(ctx, new JavaStatement(exp,true));
	}
	
	@Override
	public void exitJavascript_category_mapping(Javascript_category_mappingContext ctx) {
		String identifier = ctx.identifier().getText();
		JavaScriptModule module = this.<JavaScriptModule>getNodeValue(ctx.javascript_module());
		JavaScriptNativeCategoryMapping map = new JavaScriptNativeCategoryMapping(identifier, module);
		setNodeValue(ctx, map);
	}
	
	@Override
	public void exitJavascript_identifier(Javascript_identifierContext ctx) {
		String name = ctx.getText();
		setNodeValue(ctx, name);
	}
	
	@Override
	public void exitJavascript_method_expression(Javascript_method_expressionContext ctx) {
		String name = this.<String>getNodeValue(ctx.name);
		JavaScriptMethodExpression method = new JavaScriptMethodExpression(name);
		JavaScriptExpressionList args = this.<JavaScriptExpressionList>getNodeValue(ctx.args);
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
		JavaScriptStatement stmt = this.<JavaScriptStatement>getNodeValue(ctx.stmt);
		JavaScriptModule module = this.<JavaScriptModule>getNodeValue(ctx.module);
		stmt.setModule(module);
		setNodeValue(ctx, stmt);
	}
	
	@Override
	public void exitJavascriptArgumentList(JavascriptArgumentListContext ctx) {
		JavaScriptExpression exp = this.<JavaScriptExpression>getNodeValue(ctx.item);
		JavaScriptExpressionList list = new JavaScriptExpressionList(exp);
		setNodeValue(ctx, list);
	}
	
	@Override
	public void exitJavascriptArgumentListItem(JavascriptArgumentListItemContext ctx) {
		JavaScriptExpression exp = this.<JavaScriptExpression>getNodeValue(ctx.item);
		JavaScriptExpressionList list = this.<JavaScriptExpressionList>getNodeValue(ctx.items);
		list.add(exp);
		setNodeValue(ctx, list);
	}

	@Override
	public void exitJavascriptBooleanLiteral(JavascriptBooleanLiteralContext ctx) {
		String text = ctx.t.getText();
		setNodeValue(ctx, new JavaScriptBooleanLiteral(text));		
	}
	
	@Override
	public void exitJavaScriptCategoryMapping(JavaScriptCategoryMappingContext ctx) {
		setNodeValue(ctx, this.<Object>getNodeValue(ctx.mapping));
	}
	
	@Override
	public void exitJavascriptCharacterLiteral(JavascriptCharacterLiteralContext ctx) {
		String text = ctx.t.getText();
		setNodeValue(ctx, new JavaScriptCharacterLiteral(text));		
	};
	
	@Override
	public void exitJavascriptChildIdentifier(JavascriptChildIdentifierContext ctx) {
		JavaScriptIdentifierExpression parent = this.<JavaScriptIdentifierExpression>getNodeValue(ctx.parent);
		String name = this.<String>getNodeValue(ctx.name);
		JavaScriptIdentifierExpression exp = new JavaScriptIdentifierExpression(parent, name);
		setNodeValue(ctx, exp);
	}
	
	@Override
	public void exitJavascriptDecimalLiteral(JavascriptDecimalLiteralContext ctx) {
		String text = ctx.t.getText();
		setNodeValue(ctx, new JavaScriptDecimalLiteral(text));		
	}
	
	@Override
	public void exitJavascriptIdentifier(JavascriptIdentifierContext ctx) {
		String name = this.<String>getNodeValue(ctx.name);
		setNodeValue(ctx, new JavaScriptIdentifierExpression(name));
	}
	
	@Override
	public void exitJavascriptIdentifierExpression(JavascriptIdentifierExpressionContext ctx) {
		JavaScriptIdentifierExpression exp = this.<JavaScriptIdentifierExpression>getNodeValue(ctx.exp);
		setNodeValue(ctx, exp);
	}
	
	@Override
	public void exitJavascriptIntegerLiteral(JavascriptIntegerLiteralContext ctx) {
		String text = ctx.t.getText();
		setNodeValue(ctx, new JavaScriptIntegerLiteral(text));		
	}
	
	@Override
	public void exitJavascriptLiteralExpression(JavascriptLiteralExpressionContext ctx) {
		JavaScriptExpression exp = this.<JavaScriptExpression>getNodeValue(ctx.exp);
		setNodeValue(ctx, exp);
	}
	
	@Override
	public void exitJavascriptMethodExpression(JavascriptMethodExpressionContext ctx) {
		JavaScriptMethodExpression method = this.<JavaScriptMethodExpression>getNodeValue(ctx.exp);
		setNodeValue(ctx, method);
	}

	@Override
	public void exitJavaScriptNativeStatement(JavaScriptNativeStatementContext ctx) {
		JavaScriptStatement stmt = this.<JavaScriptStatement>getNodeValue(ctx.stmt);
		setNodeValue(ctx, new JavaScriptNativeCall(stmt));
	}
	
	@Override
	public void exitJavascriptPrimaryExpression(JavascriptPrimaryExpressionContext ctx) {
		JavaScriptExpression exp = this.<JavaScriptExpression>getNodeValue(ctx.exp);
		setNodeValue(ctx, exp);
	}
	
	@Override
	public void exitJavascriptReturnStatement(JavascriptReturnStatementContext ctx) {
		JavaScriptExpression exp = this.<JavaScriptExpression>getNodeValue(ctx.exp);
		setNodeValue(ctx, new JavaScriptStatement(exp, true));
	}
	
	@Override
	public void exitJavascriptSelectorExpression(JavascriptSelectorExpressionContext ctx) {
		JavaScriptExpression parent = this.<JavaScriptExpression>getNodeValue(ctx.parent);
		JavaScriptSelectorExpression child = this.<JavaScriptSelectorExpression>getNodeValue(ctx.child);
		child.setParent(parent);
		setNodeValue(ctx, child);
	}
	

	@Override
	public void exitJavascriptStatement(JavascriptStatementContext ctx) {
		JavaScriptExpression exp = this.<JavaScriptExpression>getNodeValue(ctx.exp);
		setNodeValue(ctx, new JavaScriptStatement(exp, false));
	}
	
	@Override
	public void exitJavascriptTextLiteral(JavascriptTextLiteralContext ctx) {
		String text = ctx.t.getText();
		setNodeValue(ctx, new JavaScriptTextLiteral(text));		
	}

	@Override
	public void exitJavaSelectorExpression(JavaSelectorExpressionContext ctx) {
		JavaExpression parent = this.<JavaExpression>getNodeValue(ctx.parent);
		JavaSelectorExpression child = this.<JavaSelectorExpression>getNodeValue(ctx.child);
		child.setParent(parent);
		setNodeValue(ctx, child);
	}
	
	@Override
	public void exitJavaStatement(JavaStatementContext ctx) {
		JavaExpression exp = this.<JavaExpression>getNodeValue(ctx.exp);
		setNodeValue(ctx, new JavaStatement(exp,false));
	}
	
	@Override
	public void exitJavaTextLiteral(JavaTextLiteralContext ctx) {
		setNodeValue(ctx, new JavaTextLiteral(ctx.getText()));
	}
	
	@Override
	public void exitKey_token(Key_tokenContext ctx) {
		setNodeValue(ctx, ctx.getText());
	}
	
	@Override
	public void exitLessThanExpression(LessThanExpressionContext ctx) {
		IExpression left = this.<IExpression>getNodeValue(ctx.left);
		IExpression right = this.<IExpression>getNodeValue(ctx.right);
		setNodeValue(ctx, new CompareExpression(left, CmpOp.LT, right));
	}
	
	
	@Override
	public void exitLessThanOrEqualExpression(LessThanOrEqualExpressionContext ctx) {
		IExpression left = this.<IExpression>getNodeValue(ctx.left);
		IExpression right = this.<IExpression>getNodeValue(ctx.right);
		setNodeValue(ctx, new CompareExpression(left, CmpOp.LTE, right));
	}

	@Override
	public void exitList_literal(List_literalContext ctx) {
		ExpressionList items = this.<ExpressionList>getNodeValue(ctx.items);
		IExpression value = items==null ? new ListLiteral() : new ListLiteral(items);
		setNodeValue(ctx, value);
	}
	
	@Override
	public void exitListLiteral(ListLiteralContext ctx) {
		IExpression exp = this.<IExpression>getNodeValue(ctx.exp);
		setNodeValue(ctx, exp);
	}
	
	@Override
	public void exitListType(ListTypeContext ctx) {
		IType type = this.<IType>getNodeValue(ctx.l);
		setNodeValue(ctx, new ListType(type));
	}
	
	@Override
	public void exitLiteralExpression(LiteralExpressionContext ctx) {
		IExpression exp = this.<IExpression>getNodeValue(ctx.exp);
		setNodeValue(ctx, exp);
	}

	@Override
	public void exitLiteralList(LiteralListContext ctx) {
		IExpression item = this.<IExpression>getNodeValue(ctx.item);
		setNodeValue(ctx, new ExpressionList(item));
	}
	
	@Override
	public void exitLiteralListItem(LiteralListItemContext ctx) {
		ExpressionList items = this.<ExpressionList>getNodeValue(ctx.items);
		IExpression item = this.<IExpression>getNodeValue(ctx.item);
		items.add(item);
		setNodeValue(ctx, items);
	}
	
	@Override
	public void exitLiteralListLiteral(LiteralListLiteralContext ctx) {
		ExpressionList items = this.<ExpressionList>getNodeValue(ctx.exp);
		setNodeValue(ctx, new ListLiteral(items));
	}
	
	@Override
	public void exitLiteralRangeLiteral(LiteralRangeLiteralContext ctx) {
		IExpression low = this.<IExpression>getNodeValue(ctx.low);
		IExpression high = this.<IExpression>getNodeValue(ctx.high);
		setNodeValue(ctx, new RangeLiteral(low, high));
	}
	
	@Override
	public void exitLiteralSetLiteral(LiteralSetLiteralContext ctx) {
		ExpressionList items = this.<ExpressionList>getNodeValue(ctx.exp);
		setNodeValue(ctx, new SetLiteral(items));
	}
	
	@Override
	public void exitMatchingExpression(MatchingExpressionContext ctx) {
		IExpression exp = this.<IExpression>getNodeValue(ctx.exp);
		setNodeValue(ctx, new MatchingExpressionConstraint(exp));
	}


	@Override
	public void exitMatchingList(MatchingListContext ctx) {
		IExpression exp = this.<IExpression>getNodeValue(ctx.source);
		setNodeValue(ctx, new MatchingCollectionConstraint(exp));
	}

	@Override
	public void exitMatchingPattern(MatchingPatternContext ctx) {
		setNodeValue(ctx, new MatchingPatternConstraint(new TextLiteral(ctx.text.getText())));
	}
	
	@Override
	public void exitMatchingRange(MatchingRangeContext ctx) {
		IExpression exp = this.<IExpression>getNodeValue(ctx.source);
		setNodeValue(ctx, new MatchingCollectionConstraint(exp));
	}

	@Override
	public void exitMatchingSet(MatchingSetContext ctx) {
		IExpression exp = this.<IExpression>getNodeValue(ctx.source);
		setNodeValue(ctx, new MatchingCollectionConstraint(exp));
	}
	
	@Override
	public void exitMaxIntegerLiteral(MaxIntegerLiteralContext ctx) {
		setNodeValue(ctx, new MaxIntegerLiteral());
	}
	
	@Override
	public void exitMemberInstance(MemberInstanceContext ctx) {
		Identifier name = this.<Identifier>getNodeValue(ctx.name);
		setNodeValue(ctx, new MemberInstance(name));
	}
	
	@Override
	public void exitAbstractMemberMethod(AbstractMemberMethodContext ctx) {
		IDeclaration decl = this.<IDeclaration>getNodeValue(ctx.decl);
		setNodeValue(ctx, decl);
	};
	
	@Override
	public void exitConcreteMemberMethod(ConcreteMemberMethodContext ctx) {
		IDeclaration decl = this.<IDeclaration>getNodeValue(ctx.decl);
		setNodeValue(ctx, decl);
	};

	@Override
	public void exitMemberSelector(MemberSelectorContext ctx) {
		Identifier name = this.<Identifier>getNodeValue(ctx.name);
		setNodeValue(ctx, new MemberSelector(name));
	}
	
	@Override
	public void exitMethodCallExpression(MethodCallExpressionContext ctx) {
		IExpression exp = this.<IExpression>getNodeValue(ctx.exp);
		ArgumentAssignmentList args = this.<ArgumentAssignmentList>getNodeValue(ctx.args);
		UnresolvedCall call = new UnresolvedCall(exp,args);
		setNodeValue(ctx, call);
	}
	
	@Override
	public void exitMethodCallStatement(MethodCallStatementContext ctx) {
		IStatement stmt = this.<IStatement>getNodeValue(ctx.stmt);
		setNodeValue(ctx, stmt);
	}
	
	@Override
	public void exitMethodDeclaration(MethodDeclarationContext ctx) {
		IDeclaration decl = this.<IDeclaration>getNodeValue(ctx.decl);
		setNodeValue(ctx, decl);
	}
	
	@Override
	public void exitMethodTypeIdentifier(MethodTypeIdentifierContext ctx) {
		Identifier name = this.<Identifier>getNodeValue(ctx.name);
		setNodeValue(ctx, name);
	}
	
	@Override
	public void exitMethodVariableIdentifier(MethodVariableIdentifierContext ctx) {
		Identifier name = this.<Identifier>getNodeValue(ctx.name);
		setNodeValue(ctx, name);
	}
	
	@Override
	public void exitMinIntegerLiteral(MinIntegerLiteralContext ctx) {
		setNodeValue(ctx, new MinIntegerLiteral());
	}
	
	@Override
	public void exitMinusExpression(MinusExpressionContext ctx) {
		IExpression exp = this.<IExpression>getNodeValue(ctx.exp);
		setNodeValue(ctx, new MinusExpression(exp));
	}
	
	@Override
	public void exitModuloExpression(ModuloExpressionContext ctx) {
		IExpression left = this.<IExpression>getNodeValue(ctx.left);
		IExpression right = this.<IExpression>getNodeValue(ctx.right);
		setNodeValue(ctx, new ModuloExpression(left, right));
	}
	
	@Override
	public void exitMultiplyExpression(MultiplyExpressionContext ctx) {
		IExpression left = this.<IExpression>getNodeValue(ctx.left);
		IExpression right = this.<IExpression>getNodeValue(ctx.right);
		setNodeValue(ctx, new MultiplyExpression(left, right));
	}
	
	@Override
	public void exitNamed_argument(Named_argumentContext ctx) {
		Identifier name = this.<Identifier>getNodeValue(ctx.name);
		UnresolvedArgument arg = new UnresolvedArgument(name);
		IExpression exp = this.<IExpression>getNodeValue(ctx.value);
		arg.setDefaultExpression(exp);
		setNodeValue(ctx, arg);
	}
	
	@Override
	public void exitNamedArgument(NamedArgumentContext ctx) {
		IArgument arg = this.<IArgument>getNodeValue(ctx.arg);
		setNodeValue(ctx, arg);
	}
	
	@Override
	public void exitNative_category_declaration(Native_category_declarationContext ctx) {
		Identifier name = this.<Identifier>getNodeValue(ctx.name);
		IdentifierList attrs = this.<IdentifierList>getNodeValue(ctx.attrs);
		NativeCategoryMappingList mappings = this.<NativeCategoryMappingList>getNodeValue(ctx.mappings);
		setNodeValue(ctx, new NativeCategoryDeclaration(name, attrs, mappings, null));
	}
	
	@Override
	public void exitNative_category_mappings(Native_category_mappingsContext ctx) {
		NativeCategoryMappingList items = this.<NativeCategoryMappingList>getNodeValue(ctx.items);
		setNodeValue(ctx, items);
	}
	
	@Override
	public void exitNative_method_declaration(Native_method_declarationContext ctx) {
		IType type = this.<IType>getNodeValue(ctx.typ);
		Identifier name = this.<Identifier>getNodeValue(ctx.name);
		ArgumentList args = this.<ArgumentList>getNodeValue(ctx.args);
		StatementList stmts = this.<StatementList>getNodeValue(ctx.stmts);
		setNodeValue(ctx, new NativeMethodDeclaration(name, args, type, stmts));
	}

	@Override
	public void exitNative_resource_declaration(Native_resource_declarationContext ctx) {
		Identifier name = this.<Identifier>getNodeValue(ctx.name);
		IdentifierList attrs = this.<IdentifierList>getNodeValue(ctx.attrs);
		NativeCategoryMappingList mappings = this.<NativeCategoryMappingList>getNodeValue(ctx.mappings);
		setNodeValue(ctx, new NativeResourceDeclaration(name, attrs, mappings, null));
	}
	
	@Override
	public void exitNative_symbol(Native_symbolContext ctx) {
		Identifier name = this.<Identifier>getNodeValue(ctx.name);
		IExpression exp = this.<IExpression>getNodeValue(ctx.exp);
		setNodeValue(ctx, new NativeSymbol(name, exp));
	}
	
	@Override
	public void exitNativeCategoryDeclaration(NativeCategoryDeclarationContext ctx) {
		IDeclaration decl = this.<IDeclaration>getNodeValue(ctx.decl);
		setNodeValue(ctx, decl);
	}
	
	@Override
	public void exitNativeCategoryMappingList(NativeCategoryMappingListContext ctx) {
		NativeCategoryMapping item = this.<NativeCategoryMapping>getNodeValue(ctx.item);
		NativeCategoryMappingList items = new NativeCategoryMappingList(item);
		setNodeValue(ctx, items);
	}
	
	@Override
	public void exitNativeCategoryMappingListItem(NativeCategoryMappingListItemContext ctx) {
		NativeCategoryMapping item = this.<NativeCategoryMapping>getNodeValue(ctx.item);
		NativeCategoryMappingList items = this.<NativeCategoryMappingList>getNodeValue(ctx.items);
		items.add(item);
		setNodeValue(ctx, items);
	}
	
	@Override
	public void exitNativeMethod(NativeMethodContext ctx) {
		IDeclaration decl = this.<IDeclaration>getNodeValue(ctx.decl);
		setNodeValue(ctx, decl);
	}
	
	@Override
	public void exitNativeStatementList(NativeStatementListContext ctx) {
		IStatement item = this.<IStatement>getNodeValue(ctx.item);
		StatementList items = new StatementList(item);
		setNodeValue(ctx, items);
	}
	
	@Override
	public void exitNativeStatementListItem(NativeStatementListItemContext ctx) {
		IStatement item = this.<IStatement>getNodeValue(ctx.item);
		StatementList items = this.<StatementList>getNodeValue(ctx.items);
		items.add(item);
		setNodeValue(ctx, items);
	}
	
	@Override
	public void exitNativeSymbolList(NativeSymbolListContext ctx) {
		NativeSymbol item = this.<NativeSymbol>getNodeValue(ctx.item);
		setNodeValue(ctx, new NativeSymbolList(item));
	}
	
	@Override
	public void exitNativeSymbolListItem(NativeSymbolListItemContext ctx) {
		NativeSymbol item = this.<NativeSymbol>getNodeValue(ctx.item);
		NativeSymbolList items = this.<NativeSymbolList>getNodeValue(ctx.items);
		items.add(item);
		setNodeValue(ctx, items);
	}
	
	@Override
	public void exitNativeType(NativeTypeContext ctx) {
		IType type = this.<IType>getNodeValue(ctx.n);
		setNodeValue(ctx, type);
	}
	
	@Override
	public void exitNotContainsAllExpression(NotContainsAllExpressionContext ctx) {
		IExpression left = this.<IExpression>getNodeValue(ctx.left);
		IExpression right = this.<IExpression>getNodeValue(ctx.right);
		setNodeValue(ctx, new ContainsExpression(left, ContOp.NOT_CONTAINS_ALL, right));
	}
	
	@Override
	public void exitNotContainsAnyExpression(NotContainsAnyExpressionContext ctx) {
		IExpression left = this.<IExpression>getNodeValue(ctx.left);
		IExpression right = this.<IExpression>getNodeValue(ctx.right);
		setNodeValue(ctx, new ContainsExpression(left, ContOp.NOT_CONTAINS_ANY, right));
	}
	
	@Override
	public void exitNotContainsExpression(NotContainsExpressionContext ctx) {
		IExpression left = this.<IExpression>getNodeValue(ctx.left);
		IExpression right = this.<IExpression>getNodeValue(ctx.right);
		setNodeValue(ctx, new ContainsExpression(left, ContOp.NOT_CONTAINS, right));
	}
	
	@Override
	public void exitNotEqualsExpression(NotEqualsExpressionContext ctx) {
		IExpression left = this.<IExpression>getNodeValue(ctx.left);
		IExpression right = this.<IExpression>getNodeValue(ctx.right);
		setNodeValue(ctx, new EqualsExpression(left, EqOp.NOT_EQUALS, right));
	}
	
	@Override
	public void exitNotExpression(NotExpressionContext ctx) {
		IExpression exp = this.<IExpression>getNodeValue(ctx.exp);
		setNodeValue(ctx, new NotExpression(exp));
	}
	
	@Override
	public void exitNotInExpression(NotInExpressionContext ctx) {
		IExpression left = this.<IExpression>getNodeValue(ctx.left);
		IExpression right = this.<IExpression>getNodeValue(ctx.right);
		setNodeValue(ctx, new ContainsExpression(left, ContOp.NOT_IN, right));
	}
	
	@Override
	public void exitNullLiteral(NullLiteralContext ctx) {
		setNodeValue(ctx, NullLiteral.instance());
	}
	
	@Override
	public void exitOperatorArgument(OperatorArgumentContext ctx) {
		boolean mutable = ctx.MUTABLE()!=null;
		IArgument arg = this.<IArgument>getNodeValue(ctx.arg);
		arg.setMutable(mutable);
		setNodeValue(ctx, arg);
	}
	
	@Override
	public void exitOperatorPlus(OperatorPlusContext ctx) {
		setNodeValue(ctx, Operator.PLUS);
	}
	
	@Override
	public void exitOperatorMinus(OperatorMinusContext ctx) {
		setNodeValue(ctx, Operator.MINUS);
	}
	
	@Override
	public void exitOperatorMultiply(OperatorMultiplyContext ctx) {
		setNodeValue(ctx, Operator.MULTIPLY);
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
	public void exitOperatorModulo(OperatorModuloContext ctx) {
		setNodeValue(ctx, Operator.MODULO);
	}
	
	@Override
	public void exitOperator_method_declaration(Operator_method_declarationContext ctx) {
		Operator op = this.<Operator>getNodeValue(ctx.op);
		IArgument arg = this.<IArgument>getNodeValue(ctx.arg);
		IType typ = this.<IType>getNodeValue(ctx.typ);
		StatementList stmts = this.<StatementList>getNodeValue(ctx.stmts);
		OperatorMethodDeclaration decl = new OperatorMethodDeclaration(op, arg, typ, stmts);
		setNodeValue(ctx, decl);
	}
	
	@Override
	public void exitOperatorMemberMethod(OperatorMemberMethodContext ctx) {
		OperatorMethodDeclaration decl = this.<OperatorMethodDeclaration>getNodeValue(ctx.decl);
		setNodeValue(ctx, decl);
	}
	
	@Override
	public void exitOrExpression(OrExpressionContext ctx) {
		IExpression left = this.<IExpression>getNodeValue(ctx.left);
		IExpression right = this.<IExpression>getNodeValue(ctx.right);
		setNodeValue(ctx, new OrExpression(left, right));
	}
	
	@Override
	public void exitParenthesis_expression(Parenthesis_expressionContext ctx) {
		IExpression exp = this.<IExpression>getNodeValue(ctx.exp);
		setNodeValue(ctx, new ParenthesisExpression(exp));
	}
	
	@Override
	public void exitParenthesisExpression(ParenthesisExpressionContext ctx) {
		IExpression exp = this.<IExpression>getNodeValue(ctx.exp);
		setNodeValue(ctx, exp);
	}
	
	@Override
	public void exitPeriodLiteral(PeriodLiteralContext ctx) {
		setNodeValue(ctx, new PeriodLiteral(ctx.t.getText()));
	}
	
	@Override
	public void exitPrimaryType(PrimaryTypeContext ctx) {
		IType type = this.<IType>getNodeValue(ctx.p);
		setNodeValue(ctx, type);
	}
	
	public void exitPython_category_mapping(Python_category_mappingContext ctx) {
		String identifier = ctx.identifier().getText();
		PythonModule module = this.<PythonModule>getNodeValue(ctx.python_module());
		PythonNativeCategoryMapping map = new PythonNativeCategoryMapping(identifier, module);
		setNodeValue(ctx, map);
	}
	
	@Override
	public void exitPython_identifier(Python_identifierContext ctx) {
		setNodeValue(ctx, ctx.getText());
	}
	
	@Override
	public void exitPython_method_expression(Python_method_expressionContext ctx) {
		String name = this.<String>getNodeValue(ctx.name);
		PythonArgumentList args = this.<PythonArgumentList>getNodeValue(ctx.args);
		PythonMethodExpression method = new PythonMethodExpression(name);
		method.setArguments(args);
		setNodeValue(ctx, method);
	}
	
	@Override
	public void exitPython_module(Python_moduleContext ctx) {
		List<String> ids = new ArrayList<String>();
		for(IdentifierContext ic : ctx.identifier())
			ids.add(ic.getText());
		PythonModule module = new PythonModule(ids);
		setNodeValue(ctx, module);
	}
	
	@Override
	public void exitPython_native_statement(Python_native_statementContext ctx) {
		PythonStatement stmt = this.<PythonStatement>getNodeValue(ctx.stmt);
		PythonModule module = this.<PythonModule>getNodeValue(ctx.module);
		stmt.setModule(module);
		setNodeValue(ctx, stmt);
	}
	
	@Override
	public void exitPython2CategoryMapping(Python2CategoryMappingContext ctx) {
		PythonNativeCategoryMapping map = this.<PythonNativeCategoryMapping>getNodeValue(ctx.mapping);
		setNodeValue(ctx, new Python2NativeCategoryMapping(map));
	}
	
	@Override
	public void exitPython2NativeStatement(Python2NativeStatementContext ctx) {
		PythonStatement stmt = this.<PythonStatement>getNodeValue(ctx.stmt);
		setNodeValue(ctx, new Python2NativeCall(stmt));
	}
	
	@Override
	public void exitPython3CategoryMapping(Python3CategoryMappingContext ctx) {
		PythonNativeCategoryMapping map = this.<PythonNativeCategoryMapping>getNodeValue(ctx.mapping);
		setNodeValue(ctx, new Python3NativeCategoryMapping(map));
	}
	
	@Override
	public void exitPython3NativeStatement(Python3NativeStatementContext ctx) {
		PythonStatement stmt = this.<PythonStatement>getNodeValue(ctx.stmt);
		setNodeValue(ctx, new Python3NativeCall(stmt));
	}
	
	@Override
	public void exitPythonArgumentList(PythonArgumentListContext ctx) {
		PythonArgumentList ordinal = this.<PythonArgumentList>getNodeValue(ctx.ordinal);
		PythonArgumentList named = this.<PythonArgumentList>getNodeValue(ctx.named);
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
		PythonIdentifierExpression parent = this.<PythonIdentifierExpression>getNodeValue(ctx.parent);
		String name = this.<String>getNodeValue(ctx.name);
		PythonIdentifierExpression child = new PythonIdentifierExpression(parent, name);
		setNodeValue(ctx, child);
	}
	
	@Override
	public void exitPythonDecimalLiteral(PythonDecimalLiteralContext ctx) {
		setNodeValue(ctx, new PythonDecimalLiteral(ctx.getText()));
	}
	
	@Override
	public void exitPythonGlobalMethodExpression(PythonGlobalMethodExpressionContext ctx) {
		PythonMethodExpression exp = this.<PythonMethodExpression>getNodeValue(ctx.exp);
		setNodeValue(ctx, exp);
	}
	
	@Override
	public void exitPythonIdentifier(PythonIdentifierContext ctx) {
		String name = this.<String>getNodeValue(ctx.name);
		setNodeValue(ctx, new PythonIdentifierExpression(name));
	}
	
	@Override
	public void exitPythonIdentifierExpression(PythonIdentifierExpressionContext ctx) {
		PythonIdentifierExpression exp = this.<PythonIdentifierExpression>getNodeValue(ctx.exp);
		setNodeValue(ctx, exp);
	}
	
	@Override
	public void exitPythonIntegerLiteral(PythonIntegerLiteralContext ctx) {
		setNodeValue(ctx, new PythonIntegerLiteral(ctx.getText()));
	}
	
	@Override
	public void exitPythonLiteralExpression(PythonLiteralExpressionContext ctx) {
		PythonExpression exp = this.<PythonExpression>getNodeValue(ctx.exp);
		setNodeValue(ctx, exp);
	}
	
	@Override
	public void exitPythonMethodExpression(PythonMethodExpressionContext ctx) {
		PythonMethodExpression exp = this.<PythonMethodExpression>getNodeValue(ctx.exp);
		setNodeValue(ctx, exp);
	}
	
	@Override
	public void exitPythonNamedArgumentList(PythonNamedArgumentListContext ctx) {
		String name = this.<String>getNodeValue(ctx.name);
		PythonExpression exp = this.<PythonExpression>getNodeValue(ctx.exp);
		PythonNamedArgument arg = new PythonNamedArgument(name, exp);
		setNodeValue(ctx, new PythonArgumentList(arg));
	}
	
	@Override
	public void exitPythonNamedArgumentListItem(PythonNamedArgumentListItemContext ctx) {
		String name = this.<String>getNodeValue(ctx.name);
		PythonExpression exp = this.<PythonExpression>getNodeValue(ctx.exp);
		PythonNamedArgument arg = new PythonNamedArgument(name, exp);
		PythonArgumentList items = this.<PythonArgumentList>getNodeValue(ctx.items);
		items.add(arg);
		setNodeValue(ctx, items);
	}
	
	@Override
	public void exitPythonNamedOnlyArgumentList(PythonNamedOnlyArgumentListContext ctx) {
		PythonArgumentList named = this.<PythonArgumentList>getNodeValue(ctx.named);
		setNodeValue(ctx, named);
	}
	
	@Override
	public void exitPythonOrdinalArgumentList( PythonOrdinalArgumentListContext ctx) {
		PythonExpression exp = this.<PythonExpression>getNodeValue(ctx.item);
		PythonOrdinalArgument arg = new PythonOrdinalArgument(exp);
		setNodeValue(ctx, new PythonArgumentList(arg));
	}
	
	@Override
	public void exitPythonOrdinalArgumentListItem( PythonOrdinalArgumentListItemContext ctx) {
		PythonExpression exp = this.<PythonExpression>getNodeValue(ctx.item);
		PythonOrdinalArgument arg = new PythonOrdinalArgument(exp);
		PythonArgumentList items = this.<PythonArgumentList>getNodeValue(ctx.items);
		items.add(arg);
		setNodeValue(ctx, items);
	}
	
	@Override
	public void exitPythonOrdinalOnlyArgumentList(PythonOrdinalOnlyArgumentListContext ctx) {
		PythonArgumentList ordinal = this.<PythonArgumentList>getNodeValue(ctx.ordinal);
		setNodeValue(ctx, ordinal);
	}

	
	@Override
	public void exitPythonPrimaryExpression(PythonPrimaryExpressionContext ctx) {
		PythonExpression exp = this.<PythonExpression>getNodeValue(ctx.exp);
		setNodeValue(ctx, exp);
	}
	
	@Override
	public void exitPythonReturnStatement(PythonReturnStatementContext ctx) {
		PythonExpression exp = this.<PythonExpression>getNodeValue(ctx.exp);
		setNodeValue(ctx, new PythonStatement(exp,true));
	}
	
	@Override
	public void exitPythonSelectorExpression(PythonSelectorExpressionContext ctx) {
		PythonExpression parent = this.<PythonExpression>getNodeValue(ctx.parent);
		PythonSelectorExpression selector = this.<PythonSelectorExpression>getNodeValue(ctx.child);
		selector.setParent(parent);
		setNodeValue(ctx, selector);
	}
	
	@Override
	public void exitPythonStatement(PythonStatementContext ctx) {
		PythonExpression exp = this.<PythonExpression>getNodeValue(ctx.exp);
		setNodeValue(ctx, new PythonStatement(exp,false));
	}
	
	@Override
	public void exitPythonTextLiteral(PythonTextLiteralContext ctx) {
		setNodeValue(ctx, new PythonTextLiteral(ctx.getText()));
	}
	
	@Override
	public void exitRaise_statement(Raise_statementContext ctx) {
		IExpression exp = this.<IExpression>getNodeValue(ctx.exp);
		setNodeValue(ctx, new RaiseStatement(exp));
	}
	
	@Override
	public void exitRaiseStatement(RaiseStatementContext ctx) {
		IStatement stmt = this.<IStatement>getNodeValue(ctx.stmt);
		setNodeValue(ctx, stmt);
	}
	
	@Override
	public void exitRange_literal(Range_literalContext ctx) {
		IExpression low = this.<IExpression>getNodeValue(ctx.low);
		IExpression high = this.<IExpression>getNodeValue(ctx.high);
		setNodeValue(ctx, new RangeLiteral(low, high));
	}
	
	@Override
	public void exitRangeLiteral(RangeLiteralContext ctx) {
		IExpression exp = this.<IExpression>getNodeValue(ctx.exp);
		setNodeValue(ctx, exp);
	}
	
	@Override
	public void exitRead_expression(Read_expressionContext ctx) {
		IExpression source = this.<IExpression>getNodeValue(ctx.source);
		setNodeValue(ctx, new ReadExpression(source));
	}
	
	@Override
	public void exitReadExpression(ReadExpressionContext ctx) {
		IExpression exp = this.<IExpression>getNodeValue(ctx.exp);
		setNodeValue(ctx, exp);
	}
	
	@Override
	public void exitResource_declaration(Resource_declarationContext ctx) {
		IDeclaration decl = this.<IDeclaration>getNodeValue(ctx.decl);
		setNodeValue(ctx, decl);
	}
	
	@Override
	public void exitResourceDeclaration(ResourceDeclarationContext ctx) {
		IDeclaration decl = this.<IDeclaration>getNodeValue(ctx.decl);
		setNodeValue(ctx, decl);
	}
	
	@Override
	public void exitReturn_statement(Return_statementContext ctx) {
		IExpression exp = this.<IExpression>getNodeValue(ctx.exp);
		setNodeValue(ctx, new ReturnStatement(exp));
	}
	
	@Override
	public void exitReturnStatement(ReturnStatementContext ctx) {
		IStatement stmt = this.<IStatement>getNodeValue(ctx.stmt);
		setNodeValue(ctx, stmt);
	}
	
	@Override
	public void exitRootInstance(RootInstanceContext ctx) {
		Identifier name = this.<Identifier>getNodeValue(ctx.name);
		setNodeValue(ctx, new VariableInstance(name));
	}
	
	@Override
	public void exitRoughlyEqualsExpression(RoughlyEqualsExpressionContext ctx) {
		IExpression left = this.<IExpression>getNodeValue(ctx.left);
		IExpression right = this.<IExpression>getNodeValue(ctx.right);
		setNodeValue(ctx, new EqualsExpression(left, EqOp.ROUGHLY, right));
	};
	
	@Override
	public void exitSelectableExpression(SelectableExpressionContext ctx) {
		IExpression parent = this.<IExpression>getNodeValue(ctx.parent);
		setNodeValue(ctx, parent);
	}
	
	@Override
	public void exitSelectorExpression(SelectorExpressionContext ctx) {
		IExpression parent = this.<IExpression>getNodeValue(ctx.parent);
		SelectorExpression selector = this.<SelectorExpression>getNodeValue(ctx.selector);
		selector.setParent(parent);
		setNodeValue(ctx, selector);
	}
	
	@Override
	public void exitSet_literal(Set_literalContext ctx) {
		ExpressionList items = this.<ExpressionList>getNodeValue(ctx.items);
		SetLiteral set = items==null ? new SetLiteral() : new SetLiteral(items);
		setNodeValue(ctx, set);
	}
	
	@Override
	public void exitSetLiteral(SetLiteralContext ctx) {
		IExpression exp = this.<IExpression>getNodeValue(ctx.exp);
		setNodeValue(ctx, exp);
	}
	
	@Override
	public void exitSetter_method_declaration(Setter_method_declarationContext ctx) {
		Identifier name = this.<Identifier>getNodeValue(ctx.name);
		StatementList stmts = this.<StatementList>getNodeValue(ctx.stmts);
		setNodeValue(ctx, new SetterMethodDeclaration(name, stmts));
	}
	
	@Override
	public void exitSetterMemberMethod(SetterMemberMethodContext ctx) {
		IDeclaration decl = this.<IDeclaration>getNodeValue(ctx.decl);
		setNodeValue(ctx, decl);
	}
	
	@Override
	public void exitSetType(SetTypeContext ctx) {
		IType itemType = this.<IType>getNodeValue(ctx.s);
		setNodeValue(ctx, new SetType(itemType));
	}
	
	@Override
	public void exitSingleton_category_declaration(Singleton_category_declarationContext ctx) {
		Identifier name = this.<Identifier>getNodeValue(ctx.name);
		IdentifierList attrs = this.<IdentifierList>getNodeValue(ctx.attrs);
		CategoryMethodDeclarationList methods = this.<CategoryMethodDeclarationList>getNodeValue(ctx.methods);
		setNodeValue(ctx, new SingletonCategoryDeclaration(name, attrs, methods));
	}
	
	@Override
	public void exitSingletonCategoryDeclaration(SingletonCategoryDeclarationContext ctx) {
		IDeclaration decl = this.<IDeclaration>getNodeValue(ctx.decl);
		setNodeValue(ctx, decl);
	}
	
	@Override
	public void exitSliceFirstAndLast(SliceFirstAndLastContext ctx) {
		IExpression first = this.<IExpression>getNodeValue(ctx.first);
		IExpression last = this.<IExpression>getNodeValue(ctx.last);
		setNodeValue(ctx, new SliceSelector(first, last));
	}
	
	@Override
	public void exitSliceFirstOnly(SliceFirstOnlyContext ctx) {
		IExpression first = this.<IExpression>getNodeValue(ctx.first);
		setNodeValue(ctx, new SliceSelector(first, null));
	}
	
	@Override
	public void exitSliceLastOnly(SliceLastOnlyContext ctx) {
		IExpression last = this.<IExpression>getNodeValue(ctx.last);
		setNodeValue(ctx, new SliceSelector(null, last));
	}
	
	@Override
	public void exitSliceSelector(SliceSelectorContext ctx) {
		IExpression slice = this.<IExpression>getNodeValue(ctx.xslice);
		setNodeValue(ctx, slice);
	}
	
	@Override
	public void exitSorted_expression(Sorted_expressionContext ctx) {
		IExpression source = this.<IExpression>getNodeValue(ctx.source);
		IExpression key = this.<IExpression>getNodeValue(ctx.key);
		setNodeValue(ctx, new SortedExpression(source, key));
	}
	
	@Override
	public void exitSortedExpression(SortedExpressionContext ctx) {
		IExpression exp = this.<IExpression>getNodeValue(ctx.exp);
		setNodeValue(ctx, exp);
	}
	
	@Override
	public void exitStatementList(StatementListContext ctx) {
		IStatement item = this.<IStatement>getNodeValue(ctx.item);
		setNodeValue(ctx, new StatementList(item));
	}
	
	@Override
	public void exitStatementListItem(StatementListItemContext ctx) {
		IStatement item = this.<IStatement>getNodeValue(ctx.item);
		StatementList items = this.<StatementList>getNodeValue(ctx.items);
		items.add(item);
		setNodeValue(ctx, items);
	}
	
	@Override
	public void exitSwitch_statement(Switch_statementContext ctx) {
		IExpression exp = this.<IExpression>getNodeValue(ctx.exp);
		SwitchCaseList cases = this.<SwitchCaseList>getNodeValue(ctx.cases);
		StatementList stmts = this.<StatementList>getNodeValue(ctx.stmts);
		SwitchStatement stmt = new SwitchStatement(exp, cases, stmts);
		setNodeValue(ctx, stmt);
	}
	
	@Override
	public void exitSwitchCaseStatementList(SwitchCaseStatementListContext ctx) {
		SwitchCase item = this.<SwitchCase>getNodeValue(ctx.item);
		setNodeValue(ctx, new SwitchCaseList(item));
	}
	
	@Override
	public void exitSwitchCaseStatementListItem(SwitchCaseStatementListItemContext ctx) {
		SwitchCase item = this.<SwitchCase>getNodeValue(ctx.item);
		SwitchCaseList items = this.<SwitchCaseList>getNodeValue(ctx.items);
		items.add(item);
		setNodeValue(ctx, items);
	}
	
	@Override
	public void exitSwitchStatement(SwitchStatementContext ctx) {
		IStatement stmt = this.<IStatement>getNodeValue(ctx.stmt);
		setNodeValue(ctx, stmt);
	}

	@Override
	public void exitSymbol_identifier(Symbol_identifierContext ctx) {
		setNodeValue(ctx, new Identifier(ctx.getText()));
	}
	
	@Override
	public void exitSymbolIdentifier(SymbolIdentifierContext ctx) {
		Identifier name = this.<Identifier>getNodeValue(ctx.name);
		setNodeValue(ctx, name);
	}
	
	@Override
	public void exitSymbols_token(Symbols_tokenContext ctx) {
		setNodeValue(ctx, ctx.getText());
	}
	
	@Override
	public void exitTernaryExpression(TernaryExpressionContext ctx) {
		IExpression condition = this.<IExpression>getNodeValue(ctx.test);
		IExpression ifTrue = this.<IExpression>getNodeValue(ctx.ifTrue);
		IExpression ifFalse = this.<IExpression>getNodeValue(ctx.ifFalse);
		TernaryExpression exp = new TernaryExpression(condition, ifTrue, ifFalse);
		setNodeValue(ctx, exp);
	};
	
	@Override
	public void exitTest_method_declaration(Test_method_declarationContext ctx) {
		Identifier name = new Identifier(ctx.name.getText());
		StatementList stmts = this.<StatementList>getNodeValue(ctx.stmts);
		AssertionList exps = this.<AssertionList>getNodeValue(ctx.exps);
		Identifier errorName = this.<Identifier>getNodeValue(ctx.error);
		SymbolExpression error = errorName==null ? null : new SymbolExpression(errorName);
		setNodeValue(ctx, new TestMethodDeclaration(name, stmts, exps, error));
	}

	@Override
	public void exitTestMethod(TestMethodContext ctx) {
		IDeclaration decl = this.<IDeclaration>getNodeValue(ctx.decl);
		setNodeValue(ctx, decl);
	}
	
	@Override
	public void exitTextLiteral(TextLiteralContext ctx) {
		setNodeValue(ctx, new TextLiteral(ctx.t.getText()));
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
		setNodeValue(ctx, new TimeLiteral(ctx.t.getText()));
	}
	
	@Override
	public void exitTimeType(TimeTypeContext ctx) {
		setNodeValue(ctx, TimeType.instance());
	}
	
	@Override
	public void exitTry_statement(Try_statementContext ctx) {
		Identifier name = this.<Identifier>getNodeValue(ctx.name);
		StatementList stmts = this.<StatementList>getNodeValue(ctx.stmts);
		SwitchCaseList handlers = this.<SwitchCaseList>getNodeValue(ctx.handlers);
		StatementList anyStmts = this.<StatementList>getNodeValue(ctx.anyStmts);
		StatementList finalStmts = this.<StatementList>getNodeValue(ctx.finalStmts);
		SwitchErrorStatement stmt = new SwitchErrorStatement(name, stmts, handlers, anyStmts, finalStmts);
		setNodeValue(ctx, stmt);
	}
	
	@Override
	public void exitTryStatement(TryStatementContext ctx) {
		IStatement stmt = this.<IStatement>getNodeValue(ctx.stmt);
		setNodeValue(ctx, stmt);
	}
	
	@Override
	public void exitTuple_literal(Tuple_literalContext ctx) {
		ExpressionList items = this.<ExpressionList>getNodeValue(ctx.items);
		IExpression value = items==null ? new TupleLiteral() : new TupleLiteral(items);
		setNodeValue(ctx, value);
	}
	
	@Override
	public void exitTupleLiteral(TupleLiteralContext ctx) {
		IExpression exp = this.<IExpression>getNodeValue(ctx.exp);
		setNodeValue(ctx, exp);
	}
	
	@Override
	public void exitType_identifier(Type_identifierContext ctx) {
		setNodeValue(ctx, new Identifier(ctx.getText()));
	}
	
	@Override
	public void exitTyped_argument(Typed_argumentContext ctx) {
		IType type = this.<IType>getNodeValue(ctx.typ);
		Identifier name = this.<Identifier>getNodeValue(ctx.name);
		IdentifierList attrs = this.<IdentifierList>getNodeValue(ctx.attrs);
		CategoryArgument arg = new CategoryArgument(type, name, attrs);
		IExpression exp = this.<IExpression>getNodeValue(ctx.value);
		arg.setDefaultExpression(exp);
		setNodeValue(ctx, arg);
	}
	
	@Override
	public void exitTypedArgument(TypedArgumentContext ctx) {
		IArgument arg = this.<IArgument>getNodeValue(ctx.arg); 
		setNodeValue(ctx, arg);
	}
	
	@Override
	public void exitTypeIdentifier(TypeIdentifierContext ctx) {
		Identifier name = this.<Identifier>getNodeValue(ctx.name);
		setNodeValue(ctx, name);
	}
	
	@Override
	public void exitTypeIdentifierList(TypeIdentifierListContext ctx) {
		Identifier item = this.<Identifier>getNodeValue(ctx.item);
		setNodeValue(ctx, new IdentifierList(item));
	}
	
	@Override
	public void exitTypeIdentifierListItem(TypeIdentifierListItemContext ctx) {
		IdentifierList items = this.<IdentifierList>getNodeValue(ctx.items);
		Identifier item = this.<Identifier>getNodeValue(ctx.item);
		items.add(item);
		setNodeValue(ctx, items);
	}
	
	@Override
	public void exitUnresolved_selector(Unresolved_selectorContext ctx) {
		Identifier name = this.<Identifier>getNodeValue(ctx.name);
		setNodeValue(ctx, new MemberSelector(name));
	}
	
	@Override
	public void exitUnresolvedExpression(UnresolvedExpressionContext ctx) {
		IExpression exp = this.<IExpression>getNodeValue(ctx.exp);
		setNodeValue(ctx, exp);
	}
	
	@Override
	public void exitUnresolvedIdentifier(UnresolvedIdentifierContext ctx) {
		Identifier name = this.<Identifier>getNodeValue(ctx.name);
		setNodeValue(ctx, new UnresolvedIdentifier(name));
	}
	
	@Override
	public void exitUnresolvedSelector(UnresolvedSelectorContext ctx) {
		IExpression parent = this.<IExpression>getNodeValue(ctx.parent);
		SelectorExpression selector = this.<SelectorExpression>getNodeValue(ctx.selector);
		selector.setParent(parent);
		setNodeValue(ctx, selector);
	}
	
	@Override
	public void exitUnresolvedWithArgsStatement(UnresolvedWithArgsStatementContext ctx) {
		IExpression exp = this.<IExpression>getNodeValue(ctx.exp);
		ArgumentAssignmentList args = this.<ArgumentAssignmentList>getNodeValue(ctx.args);
		setNodeValue(ctx, new UnresolvedCall(exp, args));
	}
	
	@Override
	public void exitValue_token(Value_tokenContext ctx) {
		setNodeValue(ctx, ctx.getText());
	}
	
	@Override
	public void exitValueList(ValueListContext ctx) {
		IExpression item = this.<IExpression>getNodeValue(ctx.item);
		setNodeValue(ctx, new ExpressionList(item));
	}
	
	@Override
	public void exitValueListItem(ValueListItemContext ctx) {
		ExpressionList items = this.<ExpressionList>getNodeValue(ctx.items);
		IExpression item = this.<IExpression>getNodeValue(ctx.item);
		items.add(item);
		setNodeValue(ctx, items);
	}
	
	@Override
	public void exitValueTuple(ValueTupleContext ctx) {
		IExpression item = this.<IExpression>getNodeValue(ctx.item);
		setNodeValue(ctx, new ExpressionList(item));
	}
	
	@Override
	public void exitValueTupleItem(ValueTupleItemContext ctx) {
		ExpressionList items = this.<ExpressionList>getNodeValue(ctx.items);
		IExpression item = this.<IExpression>getNodeValue(ctx.item);
		items.add(item);
		setNodeValue(ctx, items);
	}
	
	@Override
	public void exitVariable_identifier(Variable_identifierContext ctx) {
		setNodeValue(ctx, new Identifier(ctx.getText()));
	}
	
	@Override
	public void exitVariableIdentifier(VariableIdentifierContext ctx) {
		Identifier name = this.<Identifier>getNodeValue(ctx.name);
		setNodeValue(ctx, name);
	}
	
	@Override
	public void exitVariableList(VariableListContext ctx) {
		Identifier item = this.<Identifier>getNodeValue(ctx.item);
		setNodeValue(ctx, new IdentifierList(item));
	}
	
	@Override
	public void exitVariableListItem(VariableListItemContext ctx) {
		Identifier item = this.<Identifier>getNodeValue(ctx.item);
		IdentifierList items = this.<IdentifierList>getNodeValue(ctx.items);
		items.add(item);
		setNodeValue(ctx, items);
	}
	
	@Override
	public void exitWhile_statement(While_statementContext ctx) {
		IExpression exp = this.<IExpression>getNodeValue(ctx.exp);
		StatementList stmts = this.<StatementList>getNodeValue(ctx.stmts);
		setNodeValue(ctx, new WhileStatement(exp, stmts));
	}
	
	@Override
	public void exitWhileStatement(WhileStatementContext ctx) {
		IStatement stmt = this.<IStatement>getNodeValue(ctx.stmt);
		setNodeValue(ctx, stmt);
	}
	
	@Override
	public void exitWith_resource_statement(With_resource_statementContext ctx) {
		AssignVariableStatement stmt = this.<AssignVariableStatement>getNodeValue(ctx.stmt);
		StatementList stmts = this.<StatementList>getNodeValue(ctx.stmts);
		setNodeValue(ctx, new WithResourceStatement(stmt, stmts));
	}
	
	@Override
	public void exitWithResourceStatement(WithResourceStatementContext ctx) {
		IStatement stmt = this.<IStatement>getNodeValue(ctx.stmt);
		setNodeValue(ctx, stmt);
	}
	
	@Override
	public void exitWith_singleton_statement(With_singleton_statementContext ctx) {
		Identifier name = this.<Identifier>getNodeValue(ctx.typ);
		CategoryType type = new CategoryType(name);
		StatementList stmts = this.<StatementList>getNodeValue(ctx.stmts);
		setNodeValue(ctx, new WithSingletonStatement(type, stmts));
	}
	
	@Override
	public void exitWithSingletonStatement(WithSingletonStatementContext ctx) {
		IStatement stmt = this.<IStatement>getNodeValue(ctx.stmt);
		setNodeValue(ctx, stmt);
	}
	
	@Override
	public void exitWrite_statement(Write_statementContext ctx) {
		IExpression what = this.<IExpression>getNodeValue(ctx.what);
		IExpression target = this.<IExpression>getNodeValue(ctx.target);
		setNodeValue(ctx, new WriteStatement(what, target));
	}
	
	@Override
	public void exitWriteStatement(WriteStatementContext ctx) {
		IStatement stmt = this.<IStatement>getNodeValue(ctx.stmt);
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
	}
	
}