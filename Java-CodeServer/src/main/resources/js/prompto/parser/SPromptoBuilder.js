var declaration = require("../declaration/index");
var expression = require("../expression/index");
var javascript = require("../javascript/index");
var statement = require("../statement/index");
var literal = require("../literal/index");
var grammar = require("../grammar/index");
var value = require("../value/index");
var utils = require("../utils/index");
var parser = require("../parser/index");
var type = require("../type/index");
var java = require("../java/index");
var csharp = require("../csharp/index");
var python = require("../python/index");

function SPromptoBuilder(pparser) {
	parser.SParserListener.call(this);
	this.input = pparser.getTokenStream();
	this.path = pparser.path;
	this.nodeValues = {};
	return this;
};

SPromptoBuilder.prototype = Object.create(parser.SParserListener.prototype);
SPromptoBuilder.prototype.constructor = SPromptoBuilder;


SPromptoBuilder.prototype.getNodeValue = function(node) {
	return this.nodeValues[node];
};

SPromptoBuilder.prototype.setNodeValue = function(node, value) {
	this.nodeValues[node] = value;
	if(value instanceof parser.Section) {
		this.buildSection(node, value);
	};
};



SPromptoBuilder.prototype.exitSelectableExpression = function(ctx) {
	var e = this.getNodeValue(ctx.parent);
	this.setNodeValue(ctx, e);
};


SPromptoBuilder.prototype.exitSelectorExpression = function(ctx) {
	var parent = this.getNodeValue(ctx.parent);
	var selector = this.getNodeValue(ctx.selector);
	selector.parent = parent;
	this.setNodeValue(ctx, selector);
};

SPromptoBuilder.prototype.exitSet_literal = function(ctx) {
    var items = this.getNodeValue(ctx.items);
    var set_ = new literal.SetLiteral(items);
    this.setNodeValue(ctx, set_);
};

SPromptoBuilder.prototype.exitSetLiteral = function(ctx) {
    var exp = this.getNodeValue(ctx.exp);
    this.setNodeValue(ctx, exp);
};


SPromptoBuilder.prototype.exitAtomicLiteral = function(ctx) {
	var exp = this.getNodeValue(ctx.exp);
	this.setNodeValue(ctx, exp);
};


SPromptoBuilder.prototype.exitCollectionLiteral = function(ctx) {
	var exp = this.getNodeValue(ctx.exp);
	this.setNodeValue(ctx, exp);
};


SPromptoBuilder.prototype.exitListLiteral = function(ctx) {
	var exp = this.getNodeValue(ctx.exp);
	this.setNodeValue(ctx, exp);
};


SPromptoBuilder.prototype.exitBooleanLiteral = function(ctx) {
	this.setNodeValue(ctx, new literal.BooleanLiteral(ctx.t.text));
};


SPromptoBuilder.prototype.exitMinIntegerLiteral = function(ctx) {
    this.setNodeValue(ctx, new literal.MinIntegerLiteral());
};


SPromptoBuilder.prototype.exitMaxIntegerLiteral = function(ctx) {
    this.setNodeValue(ctx, new literal.MaxIntegerLiteral());
};


SPromptoBuilder.prototype.exitIntegerLiteral = function(ctx) {
    this.setNodeValue(ctx, new literal.IntegerLiteral(ctx.t.text, ctx.t.text));
};


SPromptoBuilder.prototype.exitDecimalLiteral = function(ctx) {
	this.setNodeValue(ctx, new literal.DecimalLiteral(ctx.t.text));
};


SPromptoBuilder.prototype.exitHexadecimalLiteral = function(ctx) {
	this.setNodeValue(ctx, new literal.HexaLiteral(ctx.t.text));
};


SPromptoBuilder.prototype.exitCharacterLiteral = function(ctx) {
	this.setNodeValue(ctx, new literal.CharacterLiteral(ctx.t.text));
};


SPromptoBuilder.prototype.exitDateLiteral = function(ctx) {
	this.setNodeValue(ctx, new literal.DateLiteral(ctx.t.text));
};


SPromptoBuilder.prototype.exitDateTimeLiteral = function(ctx) {
	this.setNodeValue(ctx, new literal.DateTimeLiteral(ctx.t.text));
};

SPromptoBuilder.prototype.exitTernaryExpression = function(ctx) {
    var condition = this.getNodeValue(ctx.test);
    var ifTrue = this.getNodeValue(ctx.ifTrue);
    var ifFalse = this.getNodeValue(ctx.ifFalse);
    var exp = new expression.TernaryExpression(condition, ifTrue, ifFalse);
    this.setNodeValue(ctx, exp);
};

SPromptoBuilder.prototype.exitTest_method_declaration = function(ctx) {
    var name = ctx.name.text;
    var stmts = this.getNodeValue(ctx.stmts);
    var exps = this.getNodeValue(ctx.exps);
    var errorName = this.getNodeValue(ctx.error);
    var error = errorName==null ? null : new expression.SymbolExpression(errorName);
    this.setNodeValue(ctx, new declaration.TestMethodDeclaration(name, stmts, exps, error));
};

SPromptoBuilder.prototype.exitTestMethod = function(ctx) {
    var decl = this.getNodeValue(ctx.decl);
    this.setNodeValue(ctx, decl);
};

SPromptoBuilder.prototype.exitTextLiteral = function(ctx) {
	this.setNodeValue(ctx, new literal.TextLiteral(ctx.t.text));
};


SPromptoBuilder.prototype.exitTimeLiteral = function(ctx) {
	this.setNodeValue(ctx, new literal.TimeLiteral(ctx.t.text));
};


SPromptoBuilder.prototype.exitPeriodLiteral = function(ctx) {
	this.setNodeValue(ctx, new literal.PeriodLiteral(ctx.t.text));
};


SPromptoBuilder.prototype.exitVariable_identifier = function(ctx) {
	this.setNodeValue(ctx, ctx.getText());
};


SPromptoBuilder.prototype.exitList_literal = function(ctx) {
	var items = this.getNodeValue(ctx.items);
	var value = items==null ? new literal.ListLiteral() : new literal.ListLiteral(items);
	this.setNodeValue(ctx, value);
};


SPromptoBuilder.prototype.exitDict_literal = function(ctx) {
	var items = this.getNodeValue(ctx.items) || null;
	var value = items==null ? new literal.DictLiteral() : new literal.DictLiteral(items);
	this.setNodeValue(ctx, value);
};


SPromptoBuilder.prototype.exitTuple_literal = function(ctx) {
	var items = this.getNodeValue(ctx.items) || null;
	var value = items==null ? new literal.TupleLiteral() : new literal.TupleLiteral(items);
	this.setNodeValue(ctx, value);
};


SPromptoBuilder.prototype.exitTupleLiteral = function(ctx) {
	var exp = this.getNodeValue(ctx.exp);
	this.setNodeValue(ctx, exp);
};



SPromptoBuilder.prototype.exitRange_literal = function(ctx) {
	var low = this.getNodeValue(ctx.low);
	var high = this.getNodeValue(ctx.high);
	this.setNodeValue(ctx, new literal.RangeLiteral(low, high));
};


SPromptoBuilder.prototype.exitRangeLiteral = function(ctx) {
	var exp = this.getNodeValue(ctx.exp);
	this.setNodeValue(ctx, exp);
};


SPromptoBuilder.prototype.exitDictLiteral = function(ctx) {
	var exp = this.getNodeValue(ctx.exp);
	this.setNodeValue(ctx, exp);
};


SPromptoBuilder.prototype.exitDictEntryList = function(ctx) {
	var item = this.getNodeValue(ctx.item);
	this.setNodeValue(ctx, new literal.DictEntryList(null, item));
};


SPromptoBuilder.prototype.exitDictEntryListItem = function(ctx) {
	var items = this.getNodeValue(ctx.items);
	var item = this.getNodeValue(ctx.item);
	items.add(item);
	this.setNodeValue(ctx, items);
};


SPromptoBuilder.prototype.exitDict_entry = function(ctx) {
	var key = this.getNodeValue(ctx.key);
	var value= this.getNodeValue(ctx.value);
	var entry = new literal.DictEntry(key, value);
	this.setNodeValue(ctx, entry);
};


SPromptoBuilder.prototype.exitLiteralExpression = function(ctx) {
	var exp = this.getNodeValue(ctx.exp);
	this.setNodeValue(ctx, exp);
};


SPromptoBuilder.prototype.exitIdentifierExpression = function(ctx) {
	var name = this.getNodeValue(ctx.exp);
    var exp = new grammar.UnresolvedIdentifier(name);
	this.setNodeValue(ctx, exp);
};


SPromptoBuilder.prototype.exitVariableIdentifier = function(ctx) {
	var name = this.getNodeValue(ctx.name);
	this.setNodeValue(ctx, name);
};


SPromptoBuilder.prototype.exitInstanceExpression = function(ctx) {
	var exp = this.getNodeValue(ctx.exp);
	this.setNodeValue(ctx, exp);
};


SPromptoBuilder.prototype.exitValueList = function(ctx) {
	var item = this.getNodeValue(ctx.item);
	this.setNodeValue(ctx, new utils.ExpressionList(null, item));
};


SPromptoBuilder.prototype.exitValueListItem = function(ctx) {
	var items = this.getNodeValue(ctx.items);
	var item = this.getNodeValue(ctx.item);
	items.add(item);
	this.setNodeValue(ctx, items);
};


SPromptoBuilder.prototype.exitValueTuple = function(ctx) {
	var item = this.getNodeValue(ctx.item);
	this.setNodeValue(ctx, new utils.ExpressionList(null, item));
};


SPromptoBuilder.prototype.exitValueTupleItem = function(ctx) {
	var items = this.getNodeValue(ctx.items);
	var item = this.getNodeValue(ctx.item);
	items.add(item);
	this.setNodeValue(ctx, items);
};


SPromptoBuilder.prototype.exitSymbol_identifier = function(ctx) {
	this.setNodeValue(ctx, ctx.getText());
};


SPromptoBuilder.prototype.exitNative_symbol = function(ctx) {
	var name = this.getNodeValue(ctx.name);
	var exp = this.getNodeValue(ctx.exp);
	this.setNodeValue(ctx, new grammar.NativeSymbol(name, exp));
};


SPromptoBuilder.prototype.exitTypeIdentifier = function(ctx) {
	var name = this.getNodeValue(ctx.name);
	this.setNodeValue(ctx, name);
};


SPromptoBuilder.prototype.exitSymbolIdentifier = function(ctx) {
	var name = this.getNodeValue(ctx.name);
	this.setNodeValue(ctx, name);
};

SPromptoBuilder.prototype.exitSymbols_token = function(ctx) {
    this.setNodeValue(ctx, ctx.getText());
};


SPromptoBuilder.prototype.exitBooleanType = function(ctx) {
	this.setNodeValue(ctx, type.BooleanType.instance);
};


SPromptoBuilder.prototype.exitCharacterType = function(ctx) {
	this.setNodeValue(ctx, type.CharacterType.instance);
};


SPromptoBuilder.prototype.exitTextType = function(ctx) {
	this.setNodeValue(ctx, type.TextType.instance);
};

SPromptoBuilder.prototype.exitThisExpression = function(ctx) {
    this.setNodeValue(ctx, new expression.ThisExpression());
};


SPromptoBuilder.prototype.exitIntegerType = function(ctx) {
	this.setNodeValue(ctx, type.IntegerType.instance);
};


SPromptoBuilder.prototype.exitDecimalType = function(ctx) {
	this.setNodeValue(ctx, type.DecimalType.instance);
};


SPromptoBuilder.prototype.exitDateType = function(ctx) {
	this.setNodeValue(ctx, type.DateType.instance);
};


SPromptoBuilder.prototype.exitDateTimeType = function(ctx) {
	this.setNodeValue(ctx, type.TextType.instance);
};


SPromptoBuilder.prototype.exitTimeType = function(ctx) {
	this.setNodeValue(ctx, type.TimeType.instance);
};


SPromptoBuilder.prototype.exitCodeType = function(ctx) {
	this.setNodeValue(ctx, type.CodeType.instance);
};


SPromptoBuilder.prototype.exitPrimaryType = function(ctx) {
	var type = this.getNodeValue(ctx.p);
	this.setNodeValue(ctx, type);
};

SPromptoBuilder.prototype.exitAttribute_declaration = function(ctx) {
	var name = this.getNodeValue(ctx.name);
	var type = this.getNodeValue(ctx.typ);
	var match = this.getNodeValue(ctx.match);
	this.setNodeValue(ctx, new declaration.AttributeDeclaration(name, type, match));
};

SPromptoBuilder.prototype.exitAttribute_list = function(ctx) {
    var items = this.getNodeValue(ctx.items);
    this.setNodeValue(ctx, items);
};


SPromptoBuilder.prototype.exitNativeType = function(ctx) {
	var type = this.getNodeValue(ctx.n);
	this.setNodeValue(ctx, type);
};


SPromptoBuilder.prototype.exitCategoryType = function(ctx) {
	var type = this.getNodeValue(ctx.c);
	this.setNodeValue(ctx, type);
};


SPromptoBuilder.prototype.exitCategory_type = function(ctx) {
	var name = ctx.getText();
	this.setNodeValue(ctx, new type.CategoryType(name));
};


SPromptoBuilder.prototype.exitListType = function(ctx) {
	var typ = this.getNodeValue(ctx.l);
	this.setNodeValue(ctx, new type.ListType(typ));
};


SPromptoBuilder.prototype.exitDictType = function(ctx) {
	var typ = this.getNodeValue(ctx.d);
	this.setNodeValue(ctx, new type.DictType(typ));
};


SPromptoBuilder.prototype.exitConcrete_category_declaration = function(ctx) {
	var name = this.getNodeValue(ctx.name);
	var attrs = this.getNodeValue(ctx.attrs);
	var derived = this.getNodeValue(ctx.derived);
	var methods = this.getNodeValue(ctx.methods);
	this.setNodeValue(ctx, new declaration.ConcreteCategoryDeclaration(name, attrs, derived, methods));
};


SPromptoBuilder.prototype.exitConcreteCategoryDeclaration = function(ctx) {
	var decl = this.getNodeValue(ctx.decl);
	this.setNodeValue(ctx, decl);
};

SPromptoBuilder.prototype.exitDerived_list = function(ctx) {
    var items = this.getNodeValue(ctx.items);
    this.setNodeValue(ctx, items);
};

SPromptoBuilder.prototype.exitType_identifier = function(ctx) {
	this.setNodeValue(ctx, ctx.getText());
};


SPromptoBuilder.prototype.exitTypeIdentifierList = function(ctx) {
	var item = this.getNodeValue(ctx.item);
	this.setNodeValue(ctx, new grammar.IdentifierList(item));
};


SPromptoBuilder.prototype.exitTypeIdentifierListItem = function(ctx) {
	var items = this.getNodeValue(ctx.items);
	var item = this.getNodeValue(ctx.item);
	items.add(item);
	this.setNodeValue(ctx, items);
};


SPromptoBuilder.prototype.exitMemberSelector = function(ctx) {
	var name = this.getNodeValue(ctx.name);
	this.setNodeValue(ctx, new expression.MemberSelector(null, name));
};

SPromptoBuilder.prototype.exitIsATypeExpression = function(ctx) {
    var type = this.getNodeValue(ctx.typ);
    var exp = new expression.TypeExpression(type);
    this.setNodeValue(ctx, exp);
};

SPromptoBuilder.prototype.exitIsOtherExpression = function(ctx) {
    var exp = this.getNodeValue(ctx.exp);
    this.setNodeValue(ctx, exp);
};

SPromptoBuilder.prototype.exitIsExpression = function(ctx) {
    var left = this.getNodeValue(ctx.left);
    var right = this.getNodeValue(ctx.right);
    var op = right instanceof expression.TypeExpression ? grammar.EqOp.IS_A : grammar.EqOp.IS;
    this.setNodeValue(ctx, new expression.EqualsExpression(left, op, right));
};

SPromptoBuilder.prototype.exitIsNotExpression = function(ctx) {
    var left = this.getNodeValue(ctx.left);
    var right = this.getNodeValue(ctx.right);
    var op = right instanceof expression.TypeExpression ? grammar.EqOp.IS_NOT_A : grammar.EqOp.IS_NOT;
    this.setNodeValue(ctx, new expression.EqualsExpression(left, op, right));
};

SPromptoBuilder.prototype.exitItemSelector = function(ctx) {
	var exp = this.getNodeValue(ctx.exp);
	this.setNodeValue(ctx, new expression.ItemSelector(null, exp));
};


SPromptoBuilder.prototype.exitSliceSelector = function(ctx) {
	var slice = this.getNodeValue(ctx.xslice);
	this.setNodeValue(ctx, slice);
};


SPromptoBuilder.prototype.exitTyped_argument = function(ctx) {
	var typ = this.getNodeValue(ctx.typ);
	var name = this.getNodeValue(ctx.name);
	var attrs = this.getNodeValue(ctx.attrs);
    var arg = new grammar.CategoryArgument(typ, name, attrs);
    var exp = this.getNodeValue(ctx.value);
    arg.defaultExpression = exp || null;
    this.setNodeValue(ctx, arg);
};


SPromptoBuilder.prototype.exitTypedArgument = function(ctx) {
	var arg = this.getNodeValue(ctx.arg);
	this.setNodeValue(ctx, arg);
};


SPromptoBuilder.prototype.exitNamedArgument = function(ctx) {
	var arg = this.getNodeValue(ctx.arg);
	this.setNodeValue(ctx, arg);
};


SPromptoBuilder.prototype.exitCodeArgument = function(ctx) {
	var arg = this.getNodeValue(ctx.arg);
	this.setNodeValue(ctx, arg);
};


SPromptoBuilder.prototype.exitCategoryArgumentType = function(ctx) {
	var type = this.getNodeValue(ctx.typ);
	this.setNodeValue(ctx, type);
};


SPromptoBuilder.prototype.exitArgumentList = function(ctx) {
	var item = this.getNodeValue(ctx.item);
	this.setNodeValue(ctx, new grammar.ArgumentList(item));
};


SPromptoBuilder.prototype.exitArgumentListItem = function(ctx) {
	var items = this.getNodeValue(ctx.items);
	var item = this.getNodeValue(ctx.item);
	items.add(item);
	this.setNodeValue(ctx, items);
};


SPromptoBuilder.prototype.exitMethodTypeIdentifier = function(ctx) {
	var name = this.getNodeValue(ctx.name);
	this.setNodeValue(ctx, name);
};


SPromptoBuilder.prototype.exitMethodVariableIdentifier = function(ctx) {
	var name = this.getNodeValue(ctx.name);
	this.setNodeValue(ctx, name);
};


SPromptoBuilder.prototype.exitMethodName = function(ctx) {
	var name = this.getNodeValue(ctx.name);
	this.setNodeValue(ctx, new grammar.UnresolvedIdentifier(name));
};



SPromptoBuilder.prototype.exitMethodParent = function(ctx) {
	var parent = this.getNodeValue(ctx.parent);
	var name = this.getNodeValue(ctx.name);
	this.setNodeValue(ctx, new expression.MethodSelector(parent, name));
};


SPromptoBuilder.prototype.exitExpressionAssignmentList = function(ctx) {
	var exp = this.getNodeValue(ctx.exp);
	var assign = new grammar.ArgumentAssignment(null, exp);
	this.setNodeValue(ctx, new grammar.ArgumentAssignmentList(null, assign));
};


SPromptoBuilder.prototype.exitArgument_assignment = function(ctx) {
	var name = this.getNodeValue(ctx.name);
	var exp = this.getNodeValue(ctx.exp);
	var arg = new grammar.UnresolvedArgument(name);
	this.setNodeValue(ctx, new grammar.ArgumentAssignment(arg, exp));
};


SPromptoBuilder.prototype.exitArgumentAssignmentList = function(ctx) {
	var item = this.getNodeValue(ctx.item);
	this.setNodeValue(ctx, new grammar.ArgumentAssignmentList(null, item));
};


SPromptoBuilder.prototype.exitArgumentAssignmentListItem = function(ctx) {
	var item = this.getNodeValue(ctx.item);
	var items = this.getNodeValue(ctx.items);
	items.add(item);
	this.setNodeValue(ctx, items);
};


SPromptoBuilder.prototype.exitMethod_call = function(ctx) {
	var method = this.getNodeValue(ctx.method);
	var args = this.getNodeValue(ctx.args);
	this.setNodeValue(ctx, new statement.UnresolvedCall(method, args));
};


SPromptoBuilder.prototype.exitCallableRoot = function(ctx) {
	var name = this.getNodeValue(ctx.name);
	this.setNodeValue(ctx, new grammar.UnresolvedIdentifier(name));
};

SPromptoBuilder.prototype.exitAddExpression = function(ctx) {
	var left = this.getNodeValue(ctx.left);
	var right = this.getNodeValue(ctx.right);
	var exp = ctx.op.type==parser.SParser.PLUS ?
		new expression.AddExpression(left, right) :
		new expression.SubtractExpression(left, right);
	this.setNodeValue(ctx, exp);
};


SPromptoBuilder.prototype.exitCategoryMethodList = function(ctx) {
	var item = this.getNodeValue(ctx.item);
	var items = new grammar.MethodDeclarationList(item);
	this.setNodeValue(ctx, items);
};


SPromptoBuilder.prototype.exitCategoryMethodListItem = function(ctx) {
	var item = this.getNodeValue(ctx.item);
	var items = this.getNodeValue(ctx.items);
	items.add(item);
	this.setNodeValue(ctx, items);
};

SPromptoBuilder.prototype.exitNativeCategoryMethodList = function(ctx) {
    var item = this.getNodeValue(ctx.item);
    var items = new grammar.MethodDeclarationList(item);
    this.setNodeValue(ctx, items);
};


SPromptoBuilder.prototype.exitNativeCategoryMethodListItem = function(ctx) {
    var item = this.getNodeValue(ctx.item);
    var items = this.getNodeValue(ctx.items);
    items.add(item);
    this.setNodeValue(ctx, items);
};

SPromptoBuilder.prototype.exitSetter_method_declaration = function(ctx) {
	var name = this.getNodeValue(ctx.name);
	var stmts = this.getNodeValue(ctx.stmts);
	this.setNodeValue(ctx, new declaration.SetterMethodDeclaration(name, stmts));
};


SPromptoBuilder.prototype.exitGetter_method_declaration = function(ctx) {
	var name = this.getNodeValue(ctx.name);
	var stmts = this.getNodeValue(ctx.stmts);
	this.setNodeValue(ctx, new declaration.GetterMethodDeclaration(name, stmts));
};

SPromptoBuilder.prototype.exitMember_method_declaration = function(ctx) {
    var decl = this.getNodeValue(ctx.getChild(0));
    this.setNodeValue(ctx, decl);
};

SPromptoBuilder.prototype.exitStatementList = function(ctx) {
	var item = this.getNodeValue(ctx.item);
	this.setNodeValue(ctx, new statement.StatementList(item));
};


SPromptoBuilder.prototype.exitStatementListItem = function(ctx) {
	var item = this.getNodeValue(ctx.item);
	var items = this.getNodeValue(ctx.items);
	items.add(item);
	this.setNodeValue(ctx, items);
};


SPromptoBuilder.prototype.exitAbstract_method_declaration = function(ctx) {
	var type = this.getNodeValue(ctx.typ);
	var name = this.getNodeValue(ctx.name);
	var args = this.getNodeValue(ctx.args);
	this.setNodeValue(ctx, new declaration.AbstractMethodDeclaration(name, args, type));
};


SPromptoBuilder.prototype.exitConcrete_method_declaration = function(ctx) {
	var type = this.getNodeValue(ctx.typ);
	var name = this.getNodeValue(ctx.name);
	var args = this.getNodeValue(ctx.args);
	var stmts = this.getNodeValue(ctx.stmts);
	this.setNodeValue(ctx, new declaration.ConcreteMethodDeclaration(name, args, type, stmts));
};


SPromptoBuilder.prototype.exitMethodCallStatement = function(ctx) {
	var stmt = this.getNodeValue(ctx.stmt);
	this.setNodeValue(ctx, stmt);
};


SPromptoBuilder.prototype.exitMethodCallExpression = function(ctx) {
	var exp = this.getNodeValue(ctx.exp);
	this.setNodeValue(ctx, exp);
};


SPromptoBuilder.prototype.exitConstructor_expression = function(ctx) {
    var mutable = ctx.MUTABLE()!=null;
	var type = this.getNodeValue(ctx.typ);
	var args = this.getNodeValue(ctx.args) || null;
	this.setNodeValue(ctx, new expression.ConstructorExpression(type, mutable, args));
};

SPromptoBuilder.prototype.exitAssertion = function(ctx) {
    var exp = this.getNodeValue(ctx.exp);
    this.setNodeValue(ctx, exp);
};

SPromptoBuilder.prototype.exitAssertionList = function(ctx) {
    var item = this.getNodeValue(ctx.item);
    var items = new utils.ExpressionList(null, item);
    this.setNodeValue(ctx, items);
};

SPromptoBuilder.prototype.exitAssertionListItem = function(ctx) {
    var item = this.getNodeValue(ctx.item);
    var items = this.getNodeValue(ctx.items);
    items.add(item);
    this.setNodeValue(ctx, items);
};

SPromptoBuilder.prototype.exitAssign_instance_statement = function(ctx) {
	var inst = this.getNodeValue(ctx.inst);
	var exp = this.getNodeValue(ctx.exp);
	this.setNodeValue(ctx, new statement.AssignInstanceStatement(inst, exp));
};


SPromptoBuilder.prototype.exitAssignInstanceStatement = function(ctx) {
	var stmt = this.getNodeValue(ctx.stmt);
	this.setNodeValue(ctx, stmt);
};


SPromptoBuilder.prototype.exitAssign_variable_statement = function(ctx) {
	var name = this.getNodeValue(ctx.name);
	var exp = this.getNodeValue(ctx.exp);
	this.setNodeValue(ctx, new statement.AssignVariableStatement(name, exp));
};


SPromptoBuilder.prototype.exitAssign_tuple_statement = function(ctx) {
	var items = this.getNodeValue(ctx.items);
	var exp = this.getNodeValue(ctx.exp);
	this.setNodeValue(ctx, new statement.AssignTupleStatement(items, exp));
};


SPromptoBuilder.prototype.exitVariableList = function(ctx) {
	var item = this.getNodeValue(ctx.item);
	this.setNodeValue(ctx, new grammar.IdentifierList(item));
};


SPromptoBuilder.prototype.exitVariableListItem = function(ctx) {
	var item = this.getNodeValue(ctx.item);
	var items = this.getNodeValue(ctx.items);
	items.add(item);
	this.setNodeValue(ctx, items);
};


SPromptoBuilder.prototype.exitRootInstance = function(ctx) {
	var name = this.getNodeValue(ctx.name);
	this.setNodeValue(ctx, new grammar.VariableInstance(name));
};

SPromptoBuilder.prototype.exitRoughlyEqualsExpression = function(ctx) {
    var left = this.getNodeValue(ctx.left);
    var right = this.getNodeValue(ctx.right);
    this.setNodeValue(ctx, new expression.EqualsExpression(left, grammar.EqOp.ROUGHLY, right));
};

SPromptoBuilder.prototype.exitChildInstance = function(ctx) {
	var parent = this.getNodeValue(ctx.parent);
	var child = this.getNodeValue(ctx.child);
	child.parent = parent;
	this.setNodeValue(ctx, child);
};


SPromptoBuilder.prototype.exitMemberInstance = function(ctx) {
	var name = this.getNodeValue(ctx.name);
	this.setNodeValue(ctx, new grammar.MemberInstance(name));
};


SPromptoBuilder.prototype.exitItemInstance = function(ctx) {
	var exp = this.getNodeValue(ctx.exp);
	this.setNodeValue(ctx, new grammar.ItemInstance(exp));
};


SPromptoBuilder.prototype.exitMethodExpression = function(ctx) {
	var exp = this.getNodeValue(ctx.exp);
	this.setNodeValue(ctx, exp);
};


SPromptoBuilder.prototype.exitConstructorExpression = function(ctx) {
	var exp = this.getNodeValue(ctx.exp);
	this.setNodeValue(ctx, exp);
};


SPromptoBuilder.prototype.exitNativeStatementList = function(ctx) {
	var item = this.getNodeValue(ctx.item);
	var items = new statement.StatementList(item);
	this.setNodeValue(ctx, items);
};


SPromptoBuilder.prototype.exitNativeStatementListItem = function(ctx) {
	var item = this.getNodeValue(ctx.item);
	var items = this.getNodeValue(ctx.items);
	items.add(item);
	this.setNodeValue(ctx, items);
};


SPromptoBuilder.prototype.exitJava_identifier = function(ctx) {
	this.setNodeValue(ctx, ctx.getText());
};

SPromptoBuilder.prototype.exitJavascript_identifier = function(ctx) {
	this.setNodeValue(ctx, ctx.getText());
};

SPromptoBuilder.prototype.exitJavascript_member_expression = function(ctx) {
    var name = ctx.name.getText ();
    this.setNodeValue (ctx, new javascript.JavaScriptMemberExpression(name));
};

SPromptoBuilder.prototype.exitJavascript_primary_expression = function(ctx) {
    var exp = this.getNodeValue (ctx.getChild(0));
    this.setNodeValue (ctx, exp);
};

SPromptoBuilder.prototype.exitJavascript_selector_expression = function(ctx) {
    var exp = this.getNodeValue (ctx.getChild(1)); // 0 is DOT
    this.setNodeValue (ctx, exp);
};

SPromptoBuilder.prototype.exitJavascript_this_expression = function(ctx) {
    this.setNodeValue (ctx, new javascript.JavaScriptThisExpression ());
};

SPromptoBuilder.prototype.exitJavaIdentifier = function(ctx) {
	var name = this.getNodeValue(ctx.name);
	this.setNodeValue(ctx, new java.JavaIdentifierExpression(null, name));
};

SPromptoBuilder.prototype.exitJavascriptIdentifier = function(ctx) {
	var name = this.getNodeValue(ctx.name);
	this.setNodeValue(ctx, new javascript.JavaScriptIdentifierExpression(null, name));
};

SPromptoBuilder.prototype.exitJavaIdentifierExpression = function(ctx) {
	var exp = this.getNodeValue(ctx.exp);
	this.setNodeValue(ctx, exp);
};


SPromptoBuilder.prototype.exitJavaChildIdentifier = function(ctx) {
	var parent = this.getNodeValue(ctx.parent);
	var name = this.getNodeValue(ctx.name);
	var child = new java.JavaIdentifierExpression(parent, name);
	this.setNodeValue(ctx, child);
};

SPromptoBuilder.prototype.exitJavascriptBooleanLiteral = function(ctx) {
    this.setNodeValue(ctx, new javascript.JavaScriptBooleanLiteral(ctx.getText()));
};

SPromptoBuilder.prototype.exitJavascriptCharacterLiteral = function(ctx) {
    this.setNodeValue(ctx, new javascript.JavaScriptCharacterLiteral(ctx.getText()));
};

SPromptoBuilder.prototype.exitJavascriptTextLiteral = function(ctx) {
    this.setNodeValue(ctx, new javascript.JavaScriptTextLiteral(ctx.getText()));
};

SPromptoBuilder.prototype.exitJavascriptIntegerLiteral = function(ctx) {
    this.setNodeValue(ctx, new javascript.JavaScriptIntegerLiteral(ctx.getText()));
};


SPromptoBuilder.prototype.exitJavascriptDecimalLiteral = function(ctx) {
    this.setNodeValue(ctx, new javascript.JavaScriptDecimalLiteral(ctx.getText()));
};



SPromptoBuilder.prototype.exitJavaClassIdentifier = function(ctx) {
	var klass = this.getNodeValue(ctx.klass);
	this.setNodeValue(ctx, klass);
};


SPromptoBuilder.prototype.exitJavaChildClassIdentifier = function(ctx) {
	var parent = this.getNodeValue(ctx.parent);
	var child = new java.JavaIdentifierExpression(parent, ctx.name.getText());
	this.setNodeValue(ctx, child);
};


SPromptoBuilder.prototype.exitJavaPrimaryExpression = function(ctx) {
	var exp = this.getNodeValue(ctx.exp);
	this.setNodeValue(ctx, exp);
};


SPromptoBuilder.prototype.exitJavascriptPrimaryExpression = function(ctx) {
	var exp = this.getNodeValue(ctx.exp);
	this.setNodeValue(ctx, exp);
};

SPromptoBuilder.prototype.exitJavascript_identifier_expression = function(ctx) {
    var name = ctx.name.getText();
    this.setNodeValue(ctx, new javascript.JavaScriptIdentifierExpression(name));
};

SPromptoBuilder.prototype.exitJavaSelectorExpression = function(ctx) {
	var parent = this.getNodeValue(ctx.parent);
	var child = this.getNodeValue(ctx.child);
	child.parent = parent;
	this.setNodeValue(ctx, child);
};

SPromptoBuilder.prototype.exitJavascriptSelectorExpression = function(ctx) {
	var parent = this.getNodeValue(ctx.parent);
	var child = this.getNodeValue(ctx.child);
	child.parent = parent;
	this.setNodeValue(ctx, child);
};

SPromptoBuilder.prototype.exitJavaScriptMemberExpression = function(ctx) {
    var name = ctx.name.getText();
    this.setNodeValue(ctx, new javascript.JavaScriptMemberExpression(name));
};

SPromptoBuilder.prototype.exitJava_primary_expression = function(ctx) {
    var exp = this.getNodeValue(ctx.getChild(0));
    this.setNodeValue(ctx, exp);
};

SPromptoBuilder.prototype.exitJava_item_expression = function(ctx) {
    var exp = this.getNodeValue(ctx.exp);
    this.setNodeValue(ctx, new java.JavaItemExpression(exp));
};

SPromptoBuilder.prototype.exitJavascript_item_expression = function(ctx) {
	var exp = this.getNodeValue(ctx.exp);
	this.setNodeValue(ctx, new javascript.JavaScriptItemExpression(exp));
};

SPromptoBuilder.prototype.exitJavascriptItemExpression = function(ctx) {
    var exp = this.getNodeValue(ctx.exp);
    this.setNodeValue(ctx, exp);
};

SPromptoBuilder.prototype.exitJavaStatement = function(ctx) {
    var exp = this.getNodeValue(ctx.exp);
    var stmt = new java.JavaStatement(exp,false);
    this.setNodeValue(ctx, stmt);
};

SPromptoBuilder.prototype.exitJavascriptStatement = function(ctx) {
	var exp = this.getNodeValue(ctx.exp);
	var stmt = new javascript.JavaScriptStatement(exp,false);
	this.setNodeValue(ctx, stmt);
};


SPromptoBuilder.prototype.exitJavaReturnStatement = function(ctx) {
	var exp = this.getNodeValue(ctx.exp);
	this.setNodeValue(ctx, new java.JavaStatement(exp,true));
};


SPromptoBuilder.prototype.exitJavascriptReturnStatement = function(ctx) {
	var exp = this.getNodeValue(ctx.exp);
	this.setNodeValue(ctx, new javascript.JavaScriptStatement(exp,true));
};


SPromptoBuilder.prototype.exitJavaNativeStatement = function(ctx) {
	var stmt = this.getNodeValue(ctx.stmt);
	this.setNodeValue(ctx, new java.JavaNativeCall(stmt));
};


SPromptoBuilder.prototype.exitJavaScriptNativeStatement = function(ctx) {
	var stmt = this.getNodeValue(ctx.stmt);
	this.setNodeValue(ctx, stmt);
};

SPromptoBuilder.prototype.exitJavascript_native_statement = function(ctx) {
	var stmt = this.getNodeValue(ctx.stmt);
	var module = this.getNodeValue(ctx.module);
    stmt.module = module || null;
	this.setNodeValue(ctx, new javascript.JavaScriptNativeCall(stmt));
}


SPromptoBuilder.prototype.exitNative_method_declaration = function(ctx) {
	var type = this.getNodeValue(ctx.typ);
	var name = this.getNodeValue(ctx.name);
	var args = this.getNodeValue(ctx.args);
	var stmts = this.getNodeValue(ctx.stmts);
	this.setNodeValue(ctx, new declaration.NativeMethodDeclaration(name, args, type, stmts));
};


SPromptoBuilder.prototype.exitJavaArgumentList = function(ctx) {
	var item = this.getNodeValue(ctx.item);
	this.setNodeValue(ctx, new java.JavaExpressionList(item));
};

SPromptoBuilder.prototype.exitJavascriptArgumentList = function(ctx) {
	var item = this.getNodeValue(ctx.item);
	this.setNodeValue(ctx, new javascript.JavaScriptExpressionList(item));
};

SPromptoBuilder.prototype.exitJavaArgumentListItem = function(ctx) {
	var item = this.getNodeValue(ctx.item);
	var items = this.getNodeValue(ctx.items);
	items.add(item);
	this.setNodeValue(ctx, items);
};

SPromptoBuilder.prototype.exitJavascriptArgumentListItem = function(ctx) {
	var item = this.getNodeValue(ctx.item);
	var items = this.getNodeValue(ctx.items);
	items.add(item);
	this.setNodeValue(ctx, items);
};

SPromptoBuilder.prototype.exitJava_method_expression = function(ctx) {
	var name = this.getNodeValue(ctx.name);
	var args = this.getNodeValue(ctx.args);
	this.setNodeValue(ctx, new java.JavaMethodExpression(name, args));
};

SPromptoBuilder.prototype.exitJava_this_expression = function(ctx) {
    this.setNodeValue(ctx, new java.JavaThisExpression());
};

SPromptoBuilder.prototype.exitJavaScriptMethodExpression = function(ctx) {
    var method = this.getNodeValue(ctx.method);
    this.setNodeValue(ctx, method);
};

SPromptoBuilder.prototype.exitJavascript_method_expression = function(ctx) {
	var name = this.getNodeValue(ctx.name);
	var args = this.getNodeValue(ctx.args);
	this.setNodeValue(ctx, new javascript.JavaScriptMethodExpression(name, args));
};

SPromptoBuilder.prototype.exitJavaMethodExpression = function(ctx) {
	var exp = this.getNodeValue(ctx.exp);
	this.setNodeValue(ctx, exp);
};

SPromptoBuilder.prototype.exitFullDeclarationList = function(ctx) {
	var items = this.getNodeValue(ctx.items) || new grammar.DeclarationList();
	this.setNodeValue(ctx, items);
};


SPromptoBuilder.prototype.exitDeclarationList = function(ctx) {
	var item = this.getNodeValue(ctx.item);
	var items = new grammar.DeclarationList(null, item);
	this.setNodeValue(ctx, items);
};


SPromptoBuilder.prototype.exitDeclarationListItem = function(ctx) {
	var item = this.getNodeValue(ctx.item);
	var items = this.getNodeValue(ctx.items);
	items.add(item);
	this.setNodeValue(ctx, items);
};


SPromptoBuilder.prototype.exitMethodDeclaration = function(ctx) {
	var decl = this.getNodeValue(ctx.decl);
	this.setNodeValue(ctx, decl);
};


SPromptoBuilder.prototype.exitNativeMethod = function(ctx) {
	var decl = this.getNodeValue(ctx.decl);
	this.setNodeValue(ctx, decl);
};


SPromptoBuilder.prototype.exitConcreteMethod = function(ctx) {
	var decl = this.getNodeValue(ctx.decl);
	this.setNodeValue(ctx, decl);
};


SPromptoBuilder.prototype.exitAbstractMethod = function(ctx) {
	var decl = this.getNodeValue(ctx.decl);
	this.setNodeValue(ctx, decl);
};


SPromptoBuilder.prototype.exitJavaBooleanLiteral = function(ctx) {
	this.setNodeValue(ctx, new java.JavaBooleanLiteral(ctx.getText()));
};


SPromptoBuilder.prototype.exitJavaIntegerLiteral = function(ctx) {
	this.setNodeValue(ctx, new java.JavaIntegerLiteral(ctx.getText()));
};


SPromptoBuilder.prototype.exitJavaDecimalLiteral = function(ctx) {
	this.setNodeValue(ctx, new java.JavaDecimalLiteral(ctx.getText()));
};


SPromptoBuilder.prototype.exitJavaCharacterLiteral = function(ctx) {
	this.setNodeValue(ctx, new java.JavaCharacterLiteral(ctx.getText()));
};


SPromptoBuilder.prototype.exitJavaTextLiteral = function(ctx) {
	this.setNodeValue(ctx, new java.JavaTextLiteral(ctx.getText()));
};


SPromptoBuilder.prototype.exitJavaCategoryBinding = function(ctx) {
	var map = this.getNodeValue(ctx.binding);
	this.setNodeValue(ctx, new java.JavaNativeCategoryBinding(map));
};

SPromptoBuilder.prototype.exitJavaScriptCategoryBinding = function(ctx) {
	this.setNodeValue(ctx, this.getNodeValue(ctx.binding));
};


SPromptoBuilder.prototype.exitJavascript_category_binding = function(ctx) {
	var identifier = ctx.identifier().getText();
	var module = this.getNodeValue(ctx.javascript_module());
	var map = new javascript.JavaScriptNativeCategoryBinding(identifier, module);
	this.setNodeValue(ctx, map);
};


SPromptoBuilder.prototype.exitJavascript_module = function(ctx) {
	ids = [];
	for(var i=0;i<ctx.javascript_identifier().length;i++) {
		ids.push(ctx.javascript_identifier(i).getText());
	}
	var module = new javascript.JavaScriptModule(ids);
	this.setNodeValue(ctx, module);
};


SPromptoBuilder.prototype.exitNativeCategoryBindingList = function(ctx) {
	var item = this.getNodeValue(ctx.item);
	var items = new grammar.NativeCategoryBindingList(item);
	this.setNodeValue(ctx, items);
};


SPromptoBuilder.prototype.exitNativeCategoryBindingListItem = function(ctx) {
	var item = this.getNodeValue(ctx.item);
	var items = this.getNodeValue(ctx.items);
	items.add(item);
	this.setNodeValue(ctx, items);
};


SPromptoBuilder.prototype.exitNative_category_bindings = function(ctx) {
	var items = this.getNodeValue(ctx.items);
	this.setNodeValue(ctx, items);
};


SPromptoBuilder.prototype.exitNative_category_declaration = function(ctx) {
	var name = this.getNodeValue(ctx.name);
	var attrs = this.getNodeValue(ctx.attrs);
	var bindings = this.getNodeValue(ctx.bindings);
    var methods = this.getNodeValue(ctx.methods);
	this.setNodeValue(ctx, new declaration.NativeCategoryDeclaration(name, attrs, bindings, null, methods));
};


SPromptoBuilder.prototype.exitNativeCategoryDeclaration = function(ctx) {
	var decl = this.getNodeValue(ctx.decl);
	this.setNodeValue(ctx, decl);
};


SPromptoBuilder.prototype.exitNative_resource_declaration = function(ctx) {
	var name = this.getNodeValue(ctx.name);
	var attrs = this.getNodeValue(ctx.attrs);
	var bindings = this.getNodeValue(ctx.bindings);
    var methods = this.getNodeValue(ctx.methods);
	this.setNodeValue(ctx, new declaration.NativeResourceDeclaration(name, attrs, bindings, null, methods));
};


SPromptoBuilder.prototype.exitResource_declaration = function(ctx) {
	var decl = this.getNodeValue(ctx.decl);
	this.setNodeValue(ctx, decl);
};


SPromptoBuilder.prototype.exitResourceDeclaration = function(ctx) {
	var decl = this.getNodeValue(ctx.decl);
	this.setNodeValue(ctx, decl);
};


SPromptoBuilder.prototype.exitCategoryDeclaration = function(ctx) {
	var decl = this.getNodeValue(ctx.decl);
	this.setNodeValue(ctx, decl);
};


SPromptoBuilder.prototype.exitAttributeDeclaration = function(ctx) {
	var decl = this.getNodeValue(ctx.decl);
	this.setNodeValue(ctx, decl);
};


SPromptoBuilder.prototype.exitEnumCategoryDeclaration = function(ctx) {
	var decl = this.getNodeValue(ctx.decl);
	this.setNodeValue(ctx, decl);
};


SPromptoBuilder.prototype.exitEnumNativeDeclaration = function(ctx) {
	var decl = this.getNodeValue(ctx.decl);
	this.setNodeValue(ctx, decl);
};


SPromptoBuilder.prototype.exitEnumDeclaration = function(ctx) {
	var decl = this.getNodeValue(ctx.decl);
	this.setNodeValue(ctx, decl);
};


SPromptoBuilder.prototype.exitParenthesis_expression = function(ctx) {
	var exp = this.getNodeValue(ctx.exp);
	this.setNodeValue(ctx, new expression.ParenthesisExpression(exp));
};


SPromptoBuilder.prototype.exitParenthesisExpression = function(ctx) {
	var exp = this.getNodeValue(ctx.exp);
	this.setNodeValue(ctx, exp);
};


SPromptoBuilder.prototype.exitNativeSymbolList = function(ctx) {
	var item = this.getNodeValue(ctx.item);
	this.setNodeValue(ctx, new grammar.NativeSymbolList(item));
};


SPromptoBuilder.prototype.exitNativeSymbolListItem = function(ctx) {
	var item = this.getNodeValue(ctx.item);
	var items = this.getNodeValue(ctx.items);
	items.add(item);
	this.setNodeValue(ctx, items);
};


SPromptoBuilder.prototype.exitEnum_native_declaration = function(ctx) {
	var name = this.getNodeValue(ctx.name);
	var type = this.getNodeValue(ctx.typ);
	var symbols = this.getNodeValue(ctx.symbols);
	this.setNodeValue(ctx, new declaration.EnumeratedNativeDeclaration(name, type, symbols));
};


SPromptoBuilder.prototype.exitFor_each_statement = function(ctx) {
	var name1 = this.getNodeValue(ctx.name1);
	var name2 = this.getNodeValue(ctx.name2);
	var source = this.getNodeValue(ctx.source);
	var stmts = this.getNodeValue(ctx.stmts);
	this.setNodeValue(ctx, new statement.ForEachStatement(name1, name2, source, stmts));
};


SPromptoBuilder.prototype.exitForEachStatement = function(ctx) {
	var stmt = this.getNodeValue(ctx.stmt);
	this.setNodeValue(ctx, stmt);
};


SPromptoBuilder.prototype.exitKey_token = function(ctx) {
	this.setNodeValue(ctx, ctx.getText());
};


SPromptoBuilder.prototype.exitValue_token = function(ctx) {
	this.setNodeValue(ctx, ctx.getText());
};


SPromptoBuilder.prototype.exitNamed_argument = function(ctx) {
	var name = this.getNodeValue(ctx.name);
    var arg = new grammar.UnresolvedArgument(name);
    var exp = this.getNodeValue(ctx.value);
    arg.defaultExpression = exp || null;
    this.setNodeValue(ctx, arg);
};


SPromptoBuilder.prototype.exitClosureStatement = function(ctx) {
	var decl = this.getNodeValue(ctx.decl);
	this.setNodeValue(ctx, new statement.DeclarationInstruction(decl));
};


SPromptoBuilder.prototype.exitReturn_statement = function(ctx) {
	var exp = this.getNodeValue(ctx.exp);
	this.setNodeValue(ctx, new statement.ReturnStatement(exp));
};


SPromptoBuilder.prototype.exitReturnStatement = function(ctx) {
	var stmt = this.getNodeValue(ctx.stmt);
	this.setNodeValue(ctx, stmt);
};


SPromptoBuilder.prototype.exitClosure_expression = function(ctx) {
	var name = this.getNodeValue(ctx.name);
	this.setNodeValue(ctx, new MethodExpression(name));
};


SPromptoBuilder.prototype.exitClosureExpression = function(ctx) {
	var exp = this.getNodeValue(ctx.exp);
	this.setNodeValue(ctx, exp);
};


SPromptoBuilder.prototype.exitIf_statement = function(ctx) {
	var exp = this.getNodeValue(ctx.exp);
	var stmts = this.getNodeValue(ctx.stmts);
	var elseIfs = this.getNodeValue(ctx.elseIfs);
	var elseStmts = this.getNodeValue(ctx.elseStmts);
	this.setNodeValue(ctx, new statement.IfStatement(exp, stmts, elseIfs, elseStmts));
};


SPromptoBuilder.prototype.exitElseIfStatementList = function(ctx) {
	var exp = this.getNodeValue(ctx.exp);
	var stmts = this.getNodeValue(ctx.stmts);
	var elem = new statement.IfElement(exp, stmts);
	this.setNodeValue(ctx, new statement.IfElementList(elem));
};


SPromptoBuilder.prototype.exitElseIfStatementListItem = function(ctx) {
	var items = this.getNodeValue(ctx.items);
	var exp = this.getNodeValue(ctx.exp);
	var stmts = this.getNodeValue(ctx.stmts);
	var elem = new statement.IfElement(exp, stmts);
	items.add(elem);
	this.setNodeValue(ctx, items);
};


SPromptoBuilder.prototype.exitIfStatement = function(ctx) {
	var stmt = this.getNodeValue(ctx.stmt);
	this.setNodeValue(ctx, stmt);
};


SPromptoBuilder.prototype.exitSwitchStatement = function(ctx) {
	var stmt = this.getNodeValue(ctx.stmt);
	this.setNodeValue(ctx, stmt);
};


SPromptoBuilder.prototype.exitAssignTupleStatement = function(ctx) {
	var stmt = this.getNodeValue(ctx.stmt);
	this.setNodeValue(ctx, stmt);
};


SPromptoBuilder.prototype.exitRaiseStatement = function(ctx) {
	var stmt = this.getNodeValue(ctx.stmt);
	this.setNodeValue(ctx, stmt);
};


SPromptoBuilder.prototype.exitWriteStatement = function(ctx) {
	var stmt = this.getNodeValue(ctx.stmt);
	this.setNodeValue(ctx, stmt);
};


SPromptoBuilder.prototype.exitWithResourceStatement = function(ctx) {
	var stmt = this.getNodeValue(ctx.stmt);
	this.setNodeValue(ctx, stmt);
};


SPromptoBuilder.prototype.exitWhileStatement = function(ctx) {
	var stmt = this.getNodeValue(ctx.stmt);
	this.setNodeValue(ctx, stmt);
};


SPromptoBuilder.prototype.exitDoWhileStatement = function(ctx) {
	var stmt = this.getNodeValue(ctx.stmt);
	this.setNodeValue(ctx, stmt);
};


SPromptoBuilder.prototype.exitTryStatement = function(ctx) {
	var stmt = this.getNodeValue(ctx.stmt);
	this.setNodeValue(ctx, stmt);
};


SPromptoBuilder.prototype.exitEqualsExpression = function(ctx) {
	var left = this.getNodeValue(ctx.left);
	var right = this.getNodeValue(ctx.right);
	this.setNodeValue(ctx, new expression.EqualsExpression(left, grammar.EqOp.EQUALS, right));
};


SPromptoBuilder.prototype.exitNotEqualsExpression = function(ctx) {
	var left = this.getNodeValue(ctx.left);
	var right = this.getNodeValue(ctx.right);
	this.setNodeValue(ctx, new expression.EqualsExpression(left, grammar.EqOp.NOT_EQUALS, right));
};


SPromptoBuilder.prototype.exitGreaterThanExpression = function(ctx) {
	var left = this.getNodeValue(ctx.left);
	var right = this.getNodeValue(ctx.right);
	this.setNodeValue(ctx, new expression.CompareExpression(left, grammar.CmpOp.GT, right));
};


SPromptoBuilder.prototype.exitGreaterThanOrEqualExpression = function(ctx) {
	var left = this.getNodeValue(ctx.left);
	var right = this.getNodeValue(ctx.right);
	this.setNodeValue(ctx, new expression.CompareExpression(left, grammar.CmpOp.GTE, right));
};


SPromptoBuilder.prototype.exitLessThanExpression = function(ctx) {
	var left = this.getNodeValue(ctx.left);
	var right = this.getNodeValue(ctx.right);
	this.setNodeValue(ctx, new expression.CompareExpression(left, grammar.CmpOp.LT, right));
};


SPromptoBuilder.prototype.exitLessThanOrEqualExpression = function(ctx) {
	var left = this.getNodeValue(ctx.left);
	var right = this.getNodeValue(ctx.right);
	this.setNodeValue(ctx, new expression.CompareExpression(left, grammar.CmpOp.LTE, right));
};


SPromptoBuilder.prototype.exitAtomicSwitchCase = function(ctx) {
	var exp = this.getNodeValue(ctx.exp);
	var stmts = this.getNodeValue(ctx.stmts);
	this.setNodeValue(ctx, new statement.AtomicSwitchCase(exp, stmts));
};


SPromptoBuilder.prototype.exitCollectionSwitchCase = function(ctx) {
	var exp = this.getNodeValue(ctx.exp);
	var stmts = this.getNodeValue(ctx.stmts);
	this.setNodeValue(ctx, new statement.CollectionSwitchCase(exp, stmts));
};


SPromptoBuilder.prototype.exitSwitchCaseStatementList = function(ctx) {
	var item = this.getNodeValue(ctx.item);
	this.setNodeValue(ctx, new statement.SwitchCaseList(item));
};


SPromptoBuilder.prototype.exitSwitchCaseStatementListItem = function(ctx) {
	var item = this.getNodeValue(ctx.item);
	var items = this.getNodeValue(ctx.items);
	items.add(item);
	this.setNodeValue(ctx, items);
};


SPromptoBuilder.prototype.exitSwitch_statement = function(ctx) {
	var exp = this.getNodeValue(ctx.exp);
	var cases = this.getNodeValue(ctx.cases);
	var stmts = this.getNodeValue(ctx.stmts);
	var stmt = new statement.SwitchStatement(exp, cases, stmts);
	this.setNodeValue(ctx, stmt);
};


SPromptoBuilder.prototype.exitLiteralRangeLiteral = function(ctx) {
	var low = this.getNodeValue(ctx.low);
	var high = this.getNodeValue(ctx.high);
	this.setNodeValue(ctx, new literal.RangeLiteral(low, high));
};


SPromptoBuilder.prototype.exitLiteralListLiteral = function(ctx) {
	var exp = this.getNodeValue(ctx.exp);
	this.setNodeValue(ctx, new literal.ListLiteral(exp));
};


SPromptoBuilder.prototype.exitLiteralList = function(ctx) {
	var item = this.getNodeValue(ctx.item);
	this.setNodeValue(ctx, new utils.ExpressionList(null, item));
};


SPromptoBuilder.prototype.exitLiteralListItem = function(ctx) {
	var items = this.getNodeValue(ctx.items);
	var item = this.getNodeValue(ctx.item);
	items.add(item);
	this.setNodeValue(ctx, items);
};


SPromptoBuilder.prototype.exitInExpression = function(ctx) {
	var left = this.getNodeValue(ctx.left);
	var right = this.getNodeValue(ctx.right);
	this.setNodeValue(ctx, new expression.ContainsExpression(left, grammar.ContOp.IN, right));
};


SPromptoBuilder.prototype.exitNotInExpression = function(ctx) {
	var left = this.getNodeValue(ctx.left);
	var right = this.getNodeValue(ctx.right);
	this.setNodeValue(ctx, new expression.ContainsExpression(left, grammar.ContOp.NOT_IN, right));
};


SPromptoBuilder.prototype.exitContainsAllExpression = function(ctx) {
	var left = this.getNodeValue(ctx.left);
	var right = this.getNodeValue(ctx.right);
	this.setNodeValue(ctx, new expression.ContainsExpression(left, grammar.ContOp.CONTAINS_ALL, right));
};


SPromptoBuilder.prototype.exitNotContainsAllExpression = function(ctx) {
	var left = this.getNodeValue(ctx.left);
	var right = this.getNodeValue(ctx.right);
	this.setNodeValue(ctx, new expression.ContainsExpression(left, grammar.ContOp.NOT_CONTAINS_ALL, right));
};


SPromptoBuilder.prototype.exitContainsAnyExpression = function(ctx) {
	var left = this.getNodeValue(ctx.left);
	var right = this.getNodeValue(ctx.right);
	this.setNodeValue(ctx, new expression.ContainsExpression(left, grammar.ContOp.CONTAINS_ANY, right));
};


SPromptoBuilder.prototype.exitNotContainsAnyExpression = function(ctx) {
	var left = this.getNodeValue(ctx.left);
	var right = this.getNodeValue(ctx.right);
	this.setNodeValue(ctx, new expression.ContainsExpression(left, grammar.ContOp.NOT_CONTAINS_ANY, right));
};


SPromptoBuilder.prototype.exitContainsExpression = function(ctx) {
	var left = this.getNodeValue(ctx.left);
	var right = this.getNodeValue(ctx.right);
	this.setNodeValue(ctx, new expression.ContainsExpression(left, grammar.ContOp.CONTAINS, right));
};


SPromptoBuilder.prototype.exitNotContainsExpression = function(ctx) {
	var left = this.getNodeValue(ctx.left);
	var right = this.getNodeValue(ctx.right);
	this.setNodeValue(ctx, new expression.ContainsExpression(left, grammar.ContOp.NOT_CONTAINS, right));
};


SPromptoBuilder.prototype.exitDivideExpression = function(ctx) {
	var left = this.getNodeValue(ctx.left);
	var right = this.getNodeValue(ctx.right);
	this.setNodeValue(ctx, new expression.DivideExpression(left, right));
};


SPromptoBuilder.prototype.exitIntDivideExpression = function(ctx) {
	var left = this.getNodeValue(ctx.left);
	var right = this.getNodeValue(ctx.right);
	this.setNodeValue(ctx, new expression.IntDivideExpression(left, right));
};


SPromptoBuilder.prototype.exitModuloExpression = function(ctx) {
	var left = this.getNodeValue(ctx.left);
	var right = this.getNodeValue(ctx.right);
	this.setNodeValue(ctx, new expression.ModuloExpression(left, right));
};


SPromptoBuilder.prototype.exitAndExpression = function(ctx) {
	var left = this.getNodeValue(ctx.left);
	var right = this.getNodeValue(ctx.right);
	this.setNodeValue(ctx, new expression.AndExpression(left, right));
};

SPromptoBuilder.prototype.exitNullLiteral = function(ctx) {
    this.setNodeValue(ctx, literal.NullLiteral.instance);
};


SPromptoBuilder.prototype.exitOperatorArgument = function(ctx) {
    var arg = this.getNodeValue(ctx.arg);
    arg.mutable = ctx.MUTABLE()!=null;
    this.setNodeValue(ctx, arg);
};


SPromptoBuilder.prototype.exitOperatorPlus = function(ctx) {
    this.setNodeValue(ctx, grammar.Operator.PLUS);
};


SPromptoBuilder.prototype.exitOperatorMinus = function(ctx) {
    this.setNodeValue(ctx, grammar.Operator.MINUS);
};


SPromptoBuilder.prototype.exitOperatorMultiply = function(ctx) {
    this.setNodeValue(ctx, grammar.Operator.MULTIPLY);
};


SPromptoBuilder.prototype.exitOperatorDivide = function(ctx) {
    this.setNodeValue(ctx, grammar.Operator.DIVIDE);
};


SPromptoBuilder.prototype.exitOperatorIDivide = function(ctx) {
    this.setNodeValue(ctx, grammar.Operator.IDIVIDE);
};


SPromptoBuilder.prototype.exitOperatorModulo = function(ctx) {
    this.setNodeValue(ctx, grammar.Operator.MODULO);
};

SPromptoBuilder.prototype.exitNative_member_method_declaration = function(ctx) {
    var decl = this.getNodeValue (ctx.getChild (0));
    this.setNodeValue (ctx, decl);
};

SPromptoBuilder.prototype.exitOperator_method_declaration= function(ctx) {
    var op = this.getNodeValue(ctx.op);
    var arg = this.getNodeValue(ctx.arg);
    var typ = this.getNodeValue(ctx.typ);
    var stmts = this.getNodeValue(ctx.stmts);
    var decl = new declaration.OperatorMethodDeclaration(op, arg, typ, stmts);
    this.setNodeValue(ctx, decl);
};


SPromptoBuilder.prototype.exitOrExpression = function(ctx) {
	var left = this.getNodeValue(ctx.left);
	var right = this.getNodeValue(ctx.right);
	this.setNodeValue(ctx, new expression.OrExpression(left, right));
};


SPromptoBuilder.prototype.exitMultiplyExpression = function(ctx) {
	var left = this.getNodeValue(ctx.left);
	var right = this.getNodeValue(ctx.right);
	this.setNodeValue(ctx, new expression.MultiplyExpression(left, right));
};


SPromptoBuilder.prototype.exitMinusExpression = function(ctx) {
	var exp = this.getNodeValue(ctx.exp);
	this.setNodeValue(ctx, new expression.MinusExpression(exp));
};


SPromptoBuilder.prototype.exitNotExpression = function(ctx) {
	var exp = this.getNodeValue(ctx.exp);
	this.setNodeValue(ctx, new expression.NotExpression(exp));
};


SPromptoBuilder.prototype.exitWhile_statement = function(ctx) {
	var exp = this.getNodeValue(ctx.exp);
	var stmts = this.getNodeValue(ctx.stmts);
	this.setNodeValue(ctx, new statement.WhileStatement(exp, stmts));
};


SPromptoBuilder.prototype.exitDo_while_statement = function(ctx) {
	var exp = this.getNodeValue(ctx.exp);
	var stmts = this.getNodeValue(ctx.stmts);
	this.setNodeValue(ctx, new statement.DoWhileStatement(exp, stmts));
};

SPromptoBuilder.prototype.exitSingleton_category_declaration = function(ctx) {
    var name = this.getNodeValue(ctx.name);
    var attrs = this.getNodeValue(ctx.attrs);
    var methods = this.getNodeValue(ctx.methods);
    this.setNodeValue(ctx, new declaration.SingletonCategoryDeclaration(name, attrs, methods));
};

SPromptoBuilder.prototype.exitSingletonCategoryDeclaration = function(ctx) {
    var decl = this.getNodeValue(ctx.decl);
    this.setNodeValue(ctx, decl);
};

SPromptoBuilder.prototype.exitSliceFirstAndLast = function(ctx) {
	var first = this.getNodeValue(ctx.first);
	var last = this.getNodeValue(ctx.last);
	this.setNodeValue(ctx, new expression.SliceSelector(null, first, last));
};


SPromptoBuilder.prototype.exitSliceFirstOnly = function(ctx) {
	var first = this.getNodeValue(ctx.first);
	this.setNodeValue(ctx, new expression.SliceSelector(null, first, null));
};


SPromptoBuilder.prototype.exitSliceLastOnly = function(ctx) {
	var last = this.getNodeValue(ctx.last);
	this.setNodeValue(ctx, new expression.SliceSelector(null, null, last));
};


SPromptoBuilder.prototype.exitSorted_expression = function(ctx) {
	var source = this.getNodeValue(ctx.source);
	var key = this.getNodeValue(ctx.key);
	this.setNodeValue(ctx, new expression.SortedExpression(source, key));
};


SPromptoBuilder.prototype.exitSortedExpression = function(ctx) {
	var exp = this.getNodeValue(ctx.exp);
	this.setNodeValue(ctx, exp);
};


SPromptoBuilder.prototype.exitDocumentExpression = function(ctx) {
	var exp = this.getNodeValue(ctx.exp);
	this.setNodeValue(ctx, exp);
};


SPromptoBuilder.prototype.exitDocument_expression = function(ctx) {
	this.setNodeValue(ctx, new expression.DocumentExpression());
};


SPromptoBuilder.prototype.exitDocument_type = function(ctx) {
	this.setNodeValue(ctx, type.DocumentType.instance);
};


SPromptoBuilder.prototype.exitFetchExpression = function(ctx) {
	var exp = this.getNodeValue(ctx.exp);
	this.setNodeValue(ctx, exp);
};


SPromptoBuilder.prototype.exitFetch_expression = function(ctx) {
	var itemName = this.getNodeValue(ctx.name);
	var source = this.getNodeValue(ctx.source);
	var filter = this.getNodeValue(ctx.xfilter);
	this.setNodeValue(ctx, new expression.FetchExpression(itemName, source, filter));
};


SPromptoBuilder.prototype.exitCode_type = function(ctx) {
	this.setNodeValue(ctx, type.CodeType.instance);
};


SPromptoBuilder.prototype.exitExecuteExpression = function(ctx) {
	var name = this.getNodeValue(ctx.name);
	this.setNodeValue(ctx, new expression.ExecuteExpression(name));
};


SPromptoBuilder.prototype.exitCodeExpression = function(ctx) {
	var exp = this.getNodeValue(ctx.exp);
	this.setNodeValue(ctx, new expression.CodeExpression(exp));
};


SPromptoBuilder.prototype.exitCode_argument = function(ctx) {
	var name = this.getNodeValue(ctx.name);
	this.setNodeValue(ctx, new grammar.CodeArgument(name));
};


SPromptoBuilder.prototype.exitCategory_symbol = function(ctx) {
	var name = this.getNodeValue(ctx.name);
	var args = this.getNodeValue(ctx.args);
	this.setNodeValue(ctx, new grammar.CategorySymbol(name, args));
};


SPromptoBuilder.prototype.exitCategorySymbolList = function(ctx) {
	var item = this.getNodeValue(ctx.item);
	this.setNodeValue(ctx, new grammar.CategorySymbolList(item));
};


SPromptoBuilder.prototype.exitCategorySymbolListItem = function(ctx) {
	var item = this.getNodeValue(ctx.item);
	var items = this.getNodeValue(ctx.items);
	items.add(item);
	this.setNodeValue(ctx, items);
};


SPromptoBuilder.prototype.exitEnum_category_declaration = function(ctx) {
	var name = this.getNodeValue(ctx.name);
	var attrs = this.getNodeValue(ctx.attrs);
	var parent = this.getNodeValue(ctx.derived);
	var derived = parent==null ? null : new grammar.IdentifierList(parent);
	var symbols = this.getNodeValue(ctx.symbols);
	this.setNodeValue(ctx, new declaration.EnumeratedCategoryDeclaration(name, attrs, derived, symbols));
};


SPromptoBuilder.prototype.exitRead_expression = function(ctx) {
	var source = this.getNodeValue(ctx.source);
	this.setNodeValue(ctx, new expression.ReadExpression(source));
};


SPromptoBuilder.prototype.exitReadExpression = function(ctx) {
	var exp = this.getNodeValue(ctx.exp);
	this.setNodeValue(ctx, exp);
};

SPromptoBuilder.prototype.exitWith_singleton_statement = function(ctx) {
    var name = this.getNodeValue(ctx.typ);
    var typ = new type.CategoryType(name);
    var stmts = this.getNodeValue(ctx.stmts);
    this.setNodeValue(ctx, new statement.WithSingletonStatement(typ, stmts));
};

SPromptoBuilder.prototype.exitWithSingletonStatement = function(ctx) {
    var stmt = this.getNodeValue(ctx.stmt);
    this.setNodeValue(ctx, stmt);
};

SPromptoBuilder.prototype.exitWrite_statement = function(ctx) {
	var what = this.getNodeValue(ctx.what);
	var target = this.getNodeValue(ctx.target);
	this.setNodeValue(ctx, new statement.WriteStatement(what, target));
};


SPromptoBuilder.prototype.exitWith_resource_statement = function(ctx) {
	var stmt = this.getNodeValue(ctx.stmt);
	var stmts = this.getNodeValue(ctx.stmts);
	this.setNodeValue(ctx, new statement.WithResourceStatement(stmt, stmts));
};


SPromptoBuilder.prototype.exitAnyType = function(ctx) {
	this.setNodeValue(ctx, type.AnyType.instance);
};


SPromptoBuilder.prototype.exitAnyListType = function(ctx) {
	var type = this.getNodeValue(ctx.typ);
	this.setNodeValue(ctx, new type.ListType(type));
};


SPromptoBuilder.prototype.exitAnyDictType = function(ctx) {
	var type = this.getNodeValue(ctx.typ);
	this.setNodeValue(ctx, new DictType(type));
};


SPromptoBuilder.prototype.exitAnyArgumentType = function(ctx) {
	var type = this.getNodeValue(ctx.typ);
	this.setNodeValue(ctx, type);
};

SPromptoBuilder.prototype.exitCastExpression = function(ctx) {
    var left = this.getNodeValue(ctx.left);
    var type = this.getNodeValue(ctx.right);
    this.setNodeValue(ctx, new expression.CastExpression(left, type));
}

SPromptoBuilder.prototype.exitCatchAtomicStatement = function(ctx) {
	var name = this.getNodeValue(ctx.name);
	var stmts = this.getNodeValue(ctx.stmts);
	this.setNodeValue(ctx, new statement.AtomicSwitchCase(new expression.SymbolExpression(name), stmts));
};


SPromptoBuilder.prototype.exitCatchCollectionStatement = function(ctx) {
	var exp = this.getNodeValue(ctx.exp);
	var stmts = this.getNodeValue(ctx.stmts);
	this.setNodeValue(ctx, new CollectionSwitchCase(exp, stmts));
};


SPromptoBuilder.prototype.exitCatchStatementList = function(ctx) {
	var item = this.getNodeValue(ctx.item);
	this.setNodeValue(ctx, new statement.SwitchCaseList(item));
};


SPromptoBuilder.prototype.exitCatchStatementListItem = function(ctx) {
	var item = this.getNodeValue(ctx.item);
	var items = this.getNodeValue(ctx.items);
	items.add(item);
	this.setNodeValue(ctx, items);
};


SPromptoBuilder.prototype.exitTry_statement = function(ctx) {
	var name = this.getNodeValue(ctx.name);
	var stmts = this.getNodeValue(ctx.stmts);
	var handlers = this.getNodeValue(ctx.handlers);
	var anyStmts = this.getNodeValue(ctx.anyStmts);
	var finalStmts = this.getNodeValue(ctx.finalStmts);
	var stmt = new statement.SwitchErrorStatement(name, stmts, handlers, anyStmts, finalStmts);
	this.setNodeValue(ctx, stmt);
};


SPromptoBuilder.prototype.exitRaise_statement = function(ctx) {
	var exp = this.getNodeValue(ctx.exp);
	this.setNodeValue(ctx, new statement.RaiseStatement(exp));
};

SPromptoBuilder.prototype.exitMatchingList = function(ctx) {
	var exp = this.getNodeValue(ctx.source);
	this.setNodeValue(ctx, new grammar.MatchingCollectionConstraint(exp));
};

SPromptoBuilder.prototype.exitMatchingRange = function(ctx) {
	var exp = this.getNodeValue(ctx.source);
	this.setNodeValue(ctx, new grammar.MatchingCollectionConstraint(exp));
};

SPromptoBuilder.prototype.exitMatchingExpression = function(ctx) {
	var exp = this.getNodeValue(ctx.exp);
	this.setNodeValue(ctx, new grammar.MatchingExpressionConstraint(exp));
};

SPromptoBuilder.prototype.exitMatchingPattern = function(ctx) {
	this.setNodeValue(ctx, new grammar.MatchingPatternConstraint(new literal.TextLiteral(ctx.text.text)));
};

SPromptoBuilder.prototype.exitLiteralSetLiteral = function(ctx) {
    var items = this.getNodeValue(ctx.exp);
    this.setNodeValue(ctx, new literal.SetLiteral(items));
};

SPromptoBuilder.prototype.exitCsharp_identifier = function(ctx) {
    this.setNodeValue(ctx, ctx.getText());
};

SPromptoBuilder.prototype.exitCSharpIdentifier = function(ctx) {
    var name = this.getNodeValue(ctx.name);
    this.setNodeValue(ctx, new csharp.CSharpIdentifierExpression(null, name));
};

SPromptoBuilder.prototype.exitCSharpChildIdentifier = function(ctx) {
    var parent = this.getNodeValue(ctx.parent);
    var name = this.getNodeValue(ctx.name);
    var child = new csharp.CSharpIdentifierExpression(parent, name);
    this.setNodeValue(ctx, child);
};

SPromptoBuilder.prototype.exitCSharpBooleanLiteral = function(ctx) {
    this.setNodeValue(ctx, new csharp.CSharpBooleanLiteral(ctx.getText()));
};


SPromptoBuilder.prototype.exitCSharpIntegerLiteral = function(ctx) {
    this.setNodeValue(ctx, new csharp.CSharpIntegerLiteral(ctx.getText()));
};


SPromptoBuilder.prototype.exitCSharpDecimalLiteral = function(ctx) {
    this.setNodeValue(ctx, new csharp.CSharpDecimalLiteral(ctx.getText()));
};


SPromptoBuilder.prototype.exitCSharpCharacterLiteral = function(ctx) {
    this.setNodeValue(ctx, new csharp.CSharpCharacterLiteral(ctx.getText()));
};


SPromptoBuilder.prototype.exitCSharpTextLiteral = function(ctx) {
    this.setNodeValue(ctx, new csharp.CSharpTextLiteral(ctx.getText()));
};


SPromptoBuilder.prototype.exitCSharpCategoryBinding = function(ctx) {
    var map = this.getNodeValue(ctx.binding);
    this.setNodeValue(ctx, new csharp.CSharpNativeCategoryBinding(map));
};

SPromptoBuilder.prototype.exitCsharp_primary_expression = function(ctx) {
    var exp = this.getNodeValue(ctx.getChild(0));
    this.setNodeValue(ctx, exp);
};

SPromptoBuilder.prototype.exitCsharp_this_expression = function(ctx) {
    this.setNodeValue(ctx, new csharp.CSharpThisExpression());
};

SPromptoBuilder.prototype.exitCsharp_method_expression = function(ctx) {
    var name = this.getNodeValue(ctx.name);
    var args = this.getNodeValue(ctx.args);
    this.setNodeValue(ctx, new csharp.CSharpMethodExpression(name, args));
};

SPromptoBuilder.prototype.exitCSharpMethodExpression = function(ctx) {
    var exp = this.getNodeValue(ctx.exp);
    this.setNodeValue(ctx, exp);
};

SPromptoBuilder.prototype.exitCSharpArgumentList = function(ctx) {
    var item = this.getNodeValue(ctx.item);
    this.setNodeValue(ctx, new csharp.CSharpExpressionList(item));
};

SPromptoBuilder.prototype.exitCSharpArgumentListItem = function(ctx) {
    var item = this.getNodeValue(ctx.item);
    var items = this.getNodeValue(ctx.items);
    items.add(item);
    this.setNodeValue(ctx, items);
};

SPromptoBuilder.prototype.exitCSharpNativeStatement = function(ctx) {
    var stmt = this.getNodeValue(ctx.stmt);
    var call = new csharp.CSharpNativeCall(stmt);
    this.setNodeValue(ctx, call);
};


SPromptoBuilder.prototype.exitCSharpPromptoIdentifier = function(ctx) {
    var name = ctx.DOLLAR_IDENTIFIER().getText();
    this.setNodeValue(ctx, new csharp.CSharpIdentifierExpression(null, name));
};


SPromptoBuilder.prototype.exitCSharpPrimaryExpression = function(ctx) {
    var exp = this.getNodeValue(ctx.exp);
    this.setNodeValue(ctx, exp);
};

SPromptoBuilder.prototype.exitCSharpSelectorExpression = function(ctx) {
    var parent = this.getNodeValue(ctx.parent);
    var child = this.getNodeValue(ctx.child);
    child.parent = parent;
    this.setNodeValue(ctx, child);
};

SPromptoBuilder.prototype.exitCSharpStatement = function(ctx) {
    var exp = this.getNodeValue(ctx.exp);
    var stmt = new csharp.CSharpStatement(exp,false);
    this.setNodeValue(ctx, stmt);
};

SPromptoBuilder.prototype.exitCSharpReturnStatement = function(ctx) {
    var exp = this.getNodeValue(ctx.exp);
    this.setNodeValue(ctx, new csharp.CSharpStatement(exp,true));
};


SPromptoBuilder.prototype.exitPythonStatement = function(ctx) {
    var exp = this.getNodeValue(ctx.exp);
    this.setNodeValue(ctx, new python.PythonStatement(exp,false));
};

SPromptoBuilder.prototype.exitPythonReturnStatement = function(ctx) {
    var exp = this.getNodeValue(ctx.exp);
    this.setNodeValue(ctx, new python.PythonStatement(exp,true));
};

SPromptoBuilder.prototype.exitPython2CategoryBinding = function(ctx) {
    var map = this.getNodeValue(ctx.binding);
    this.setNodeValue(ctx, new python.Python2NativeCategoryBinding(map));
};


SPromptoBuilder.prototype.exitPython3CategoryBinding = function(ctx) {
    var map = this.getNodeValue(ctx.binding);
    this.setNodeValue(ctx, new python.Python3NativeCategoryBinding(map));
};


SPromptoBuilder.prototype.exitPython_category_binding = function(ctx) {
    var identifier = ctx.id_.getText();
    var module = this.getNodeValue(ctx.python_module());
    var map = new python.PythonNativeCategoryBinding(identifier, module);
    this.setNodeValue(ctx, map);
};

SPromptoBuilder.prototype.exitPython_method_expression = function(ctx) {
    var name = this.getNodeValue(ctx.name);
    var args = this.getNodeValue(ctx.args);
    var method = new python.PythonMethodExpression(name, args);
    this.setNodeValue(ctx, method);
};

SPromptoBuilder.prototype.exitPythonGlobalMethodExpression = function(ctx) {
    var exp = this.getNodeValue(ctx.exp);
    this.setNodeValue(ctx, exp);
};

SPromptoBuilder.prototype.exitPythonMethodExpression = function(ctx) {
    var exp = this.getNodeValue(ctx.exp);
    this.setNodeValue(ctx, exp);
};

SPromptoBuilder.prototype.exitPython_module = function(ctx) {
    var ids = []
    var ctxs = ctx.identifier();
    for(var i=0;i<ctxs.length;i++) {
        ids.push(ctxs[i].getText());
    }
    var module = new python.PythonModule(ids);
    this.setNodeValue(ctx, module);
};

SPromptoBuilder.prototype.exitPython2NativeStatement = function(ctx) {
    var stmt = this.getNodeValue(ctx.stmt);
    this.setNodeValue(ctx, new python.Python2NativeCall(stmt));
};


SPromptoBuilder.prototype.exitPython3NativeStatement = function(ctx) {
    var stmt = this.getNodeValue(ctx.stmt);
    this.setNodeValue(ctx, new python.Python3NativeCall(stmt));
};

SPromptoBuilder.prototype.exitPython_native_statement = function(ctx) {
    var stmt = this.getNodeValue(ctx.stmt);
    var module = this.getNodeValue(ctx.module);
    stmt.module = module || null;
    this.setNodeValue(ctx, new python.PythonNativeCall(stmt));
}

SPromptoBuilder.prototype.exitPython_identifier = function(ctx) {
    this.setNodeValue(ctx, ctx.getText());
};

SPromptoBuilder.prototype.exitPythonIdentifier = function(ctx) {
    var name = this.getNodeValue(ctx.name);
    this.setNodeValue(ctx, new python.PythonIdentifierExpression(null, name));
};

SPromptoBuilder.prototype.exitPythonIdentifierExpression = function(ctx) {
    var exp = this.getNodeValue(ctx.exp);
    this.setNodeValue(ctx, exp);
};

SPromptoBuilder.prototype.exitPythonChildIdentifier = function(ctx) {
    var parent = this.getNodeValue(ctx.parent);
    var name = this.getNodeValue(ctx.name);
    var child = new python.PythonIdentifierExpression(parent, name);
    this.setNodeValue(ctx, child);
};


SPromptoBuilder.prototype.exitPythonBooleanLiteral = function(ctx) {
    this.setNodeValue(ctx, new python.PythonBooleanLiteral(ctx.getText()));
};

SPromptoBuilder.prototype.exitPythonIntegerLiteral = function(ctx) {
    this.setNodeValue(ctx, new python.PythonIntegerLiteral(ctx.getText()));
};


SPromptoBuilder.prototype.exitPythonDecimalLiteral = function(ctx) {
    this.setNodeValue(ctx, new python.PythonDecimalLiteral(ctx.getText()));
};

SPromptoBuilder.prototype.exitPythonCharacterLiteral = function(ctx) {
    this.setNodeValue(ctx, new python.PythonCharacterLiteral(ctx.getText()));
};

SPromptoBuilder.prototype.exitPythonTextLiteral = function(ctx) {
    this.setNodeValue(ctx, new python.PythonTextLiteral(ctx.getText()));
};

SPromptoBuilder.prototype.exitPythonLiteralExpression = function(ctx) {
    var exp = this.getNodeValue(ctx.exp);
    this.setNodeValue(ctx, exp);
};

SPromptoBuilder.prototype.exitPythonPromptoIdentifier = function(ctx) {
    var name = ctx.DOLLAR_IDENTIFIER().getText();
    this.setNodeValue(ctx, new python.PythonIdentifierExpression(null, name));
};


SPromptoBuilder.prototype.exitPythonPrimaryExpression = function(ctx) {
    var exp = this.getNodeValue(ctx.exp);
    this.setNodeValue(ctx, exp);
};

SPromptoBuilder.prototype.exitPythonArgumentList = function(ctx) {
    var ordinal = this.getNodeValue(ctx.ordinal);
    var named = this.getNodeValue(ctx.named);
    ordinal.addAll(named);
    this.setNodeValue(ctx, ordinal);
};


SPromptoBuilder.prototype.exitPythonNamedOnlyArgumentList = function(ctx) {
    var named = this.getNodeValue(ctx.named);
    this.setNodeValue(ctx, named);
};

SPromptoBuilder.prototype.exitPythonNamedArgumentList = function(ctx) {
    var name = this.getNodeValue(ctx.name);
    var exp = this.getNodeValue(ctx.exp);
    var arg = new python.PythonNamedArgument(name, exp);
    this.setNodeValue(ctx, new python.PythonArgumentList(arg));
};

SPromptoBuilder.prototype.exitPythonNamedArgumentListItem = function(ctx) {
    var name = this.getNodeValue(ctx.name);
    var exp = this.getNodeValue(ctx.exp);
    var arg = new python.PythonNamedArgument(name, exp);
    var items = this.getNodeValue(ctx.items);
    items.add(arg);
    this.setNodeValue(ctx, items);
};

SPromptoBuilder.prototype.exitPythonOrdinalOnlyArgumentList = function(ctx) {
    var ordinal = this.getNodeValue(ctx.ordinal);
    this.setNodeValue(ctx, ordinal);
};

SPromptoBuilder.prototype.exitPythonOrdinalArgumentList = function(ctx) {
    var item = this.getNodeValue(ctx.item);
    var arg = new python.PythonOrdinalArgument(item);
    this.setNodeValue(ctx, new python.PythonArgumentList(arg));
};

SPromptoBuilder.prototype.exitPythonOrdinalOnlyArgumentList = function(ctx) {
    var ordinal = this.getNodeValue(ctx.ordinal);
    this.setNodeValue(ctx, ordinal);
};


SPromptoBuilder.prototype.exitPythonSelectorExpression = function(ctx) {
    var parent = this.getNodeValue(ctx.parent);
    var selector = this.getNodeValue(ctx.child);
    selector.parent = parent;
    this.setNodeValue(ctx, selector);
}


SPromptoBuilder.prototype.buildSection = function(node, section) {
	var first = this.findFirstValidToken(node.start.tokenIndex);
	var last = this.findLastValidToken(node.stop.tokenIndex);
    section.setFrom(this.path, first, last, parser.Dialect.S);
};

SPromptoBuilder.prototype.findFirstValidToken = function(idx) {
	if(idx===-1) { // happens because input.index() is called before any other read operation (bug?)
		idx = 0;
	};
	do {
		var token = this.readValidToken(idx++);
		if(token!==null) {
			return token;
		};
	} while(idx<this.input.size());
	return null;
};

SPromptoBuilder.prototype.findLastValidToken = function(idx) {
	if(idx===-1) { // happens because input.index() is called before any other read operation (bug?)
		idx = 0;
	};
	while(idx>=0) {
		var token = this.readValidToken(idx--);
		if(token!==null) {
			return token;
		}
	};
	return null;
};

SPromptoBuilder.prototype.readValidToken = function(idx) {
	var token = this.input.get(idx);
	var text = token.text;
	if(text!==null && text.length>0 && !value.Character.isWhitespace(text[0])) {
		return token;
	} else {
		return null;
	}
};

exports.SPromptoBuilder = SPromptoBuilder;
